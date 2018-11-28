package com.jr.erp.bill.purchase.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.service.impl.IFileUploadService;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.JodaUtils;
import com.jr.erp.base.utils.Ret;
import com.jr.erp.bill.purchase.entity.BillPurchase;
import com.jr.erp.bill.purchase.service.IBillPurchaseService;
import com.jr.erp.bill.utils.Constance;
import com.jr.erp.sys.entity.SysAreaInfoExample;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.service.ISysAreaInfoService;
import com.jr.erp.sys.set.base.service.IBaseTypeService;
import com.jr.erp.sys.set.purchase.entity.PurchaseSechemeExample;
import com.jr.erp.sys.set.purchase.service.IPurchaseSechemeService;
import com.jr.erp.sys.utils.service.IBillNoGeneratorService;
import com.jr.erp.sys.vo.PurchaseColumnVo;

@Controller
@RequestMapping("/purchase")
public class PurchaseController {    
    
    @Autowired
    private IPurchaseSechemeService sysPurchaseSechemeService;
    
    @Autowired
    private IBaseTypeService baseTypeService;
    
    @Autowired
    private ISysAreaInfoService sysAreaInfoService;
    
    @Autowired
    IFileUploadService fileUploadService;
    
    @Autowired
    IBillPurchaseService billPurchaseService;
    
    @Autowired
    IBillNoGeneratorService billNoGeneratorService;
    
    @RequestMapping(value = "/editPurchaseBill.do")
    public String editPurchaseBill(Integer id,HttpServletRequest request, Model model)
    {
        SysUser user= ShiroUtils.getSysUser();
        String companyNo=user.getCompanyNo();
        
        //供应商列表
        List<String> supplyList = baseTypeService.getNameList(companyNo, "supplier");
        model.addAttribute("supplierList",supplyList);
        
        //进货类型
        List<String> brandNameList = baseTypeService.getNameList(companyNo, "brandName");
        model.addAttribute("brandNameList",brandNameList);
        
        //进货类型
        List<String> purchaseTypeList = baseTypeService.getNameList(companyNo, "purchaseType");
        model.addAttribute("purchaseTypeList",purchaseTypeList);
        
        //进货门店
        SysAreaInfoExample areaExample = new SysAreaInfoExample();
        areaExample.createCriteria().andCompanyNoEqualTo(companyNo).andAreaCodeLike(user.getAreaCode()+"%").andStatusEqualTo(1).andAreaTypeIn(Arrays.asList(new Integer[]{0,1,2}));
        List<BaseEntity> areaList = sysAreaInfoService.selectByExample(areaExample);
        model.addAttribute("areaList",areaList);
        
        if(id!=null)
        {
            BillPurchase purchase = (BillPurchase) billPurchaseService.getBillWithItem(id);
            model.addAttribute("billPurchase",purchase);
            model.addAttribute("itemListData",JSONArray.toJSON(purchase.getItemList()).toString());
        }else
        {
            //自动创建一个新的
            BillPurchase purchase = new BillPurchase();
            purchase.setBillDate(JodaUtils.getShortDate());
            purchase.setSysBillNo(billNoGeneratorService.getNextBillNo(ShiroUtils.getCompanyNo(),Constance.BILL_TYPE_PURCHASE,ShiroUtils.getSysUser().getUserSheetNoPrefix()));
            purchase.setBillNo(purchase.getSysBillNo());
            model.addAttribute("billPurchase",purchase);
            model.addAttribute("itemListData","[]");
        }
        
        //获取各种状态的单据
        Map<String,Object> desktopMap = billPurchaseService.getDesktopBill();
        model.addAttribute("desktopMap",desktopMap);
        
        return "bill/purchase/editPurchaseBill";
    }
    
    /**    
     * viewImportBill(这里用一句话描述这个方法的作用)    
     * 跳转到导入界面       
     * @param @param request
     * @param @param model
     * @param @return     
     * @return String
     * @Exception 异常对象
    */
    @RequestMapping(value = "/viewImportBill.do")
    public String viewImportBill(HttpServletRequest request, Model model)
    {
        SysUser user = ShiroUtils.getSysUser();
        String companyNo = user.getCompanyNo();
        
        //获取导入方案列表
        PurchaseSechemeExample example = new PurchaseSechemeExample();
        example.createCriteria().andCompanyNoEqualTo(companyNo).andStatusEqualTo(1);
        List<BaseEntity> sechemeList = sysPurchaseSechemeService.selectByExample(example);
        model.addAttribute("sechemeList",sechemeList);
        return "bill/purchase/viewImportBill";
    }
    
    
    /**    
     * uploadImportFile(这里用一句话描述这个方法的作用)    
     * 上传文件     
     * @param @param file
     * @param @param folder
     * @param @param request
     * @param @param response
     * @param @return     
     * @return Ret
     * @Exception 异常对象
    */
    @ResponseBody
    @RequestMapping(value ="/uploadImportFile.do")
    public Ret uploadImportFile(@RequestParam MultipartFile file,Integer sechemeId, HttpServletRequest request, HttpServletResponse response)
    {
        SysUser user= ShiroUtils.getSysUser();
        String companyNo=user.getCompanyNo();
        try
        { 
            Map<String,Object> map = new HashMap<String,Object>();
            PurchaseColumnVo list = sysPurchaseSechemeService.getPurchaseColumnConfig(sechemeId);
            List<JSONObject> itemList = billPurchaseService.parseImportExcel(companyNo,sechemeId,file);
            map.put("columnConfig", list.getColumnConfig());
            map.put("itemList", itemList);
            return Ret.ok("", map);
        } catch (Exception e)
        {
            e.printStackTrace();
            return Ret.error(e.getMessage());
        }
    }
    
    /**    
     * saveImportBill(这里用一句话描述这个方法的作用)    
     * 保存批量导入
     * @param @param billPurchase
     * @param @param sechemeId
     * @param @param request
     * @param @param response
     * @param @return     
     * @return Ret
     * @Exception 异常对象
    */
    @ResponseBody
    @RequestMapping(value = "/saveImportBill.do")
    public Ret saveImportBill(@RequestBody BillPurchase billPurchase,Integer sechemeId, HttpServletRequest request, HttpServletResponse response)
    {
        SysUser user= ShiroUtils.getSysUser();
        String companyNo=user.getCompanyNo();
        try
        {
            billPurchase.setCompanyNo(companyNo);
            BillPurchase newBillPurchase = billPurchaseService.saveImportBill(sechemeId,billPurchase);
            return Ret.ok("",newBillPurchase);
        } catch (Exception e)
        {
            e.printStackTrace();
            return Ret.error(e.getMessage());
        }
    }
    
    /**    
     * saveBillAudit(这里用一句话描述这个方法的作用)    
     * 保存成功       
     * @param @param billPurchase
     * @param @param request
     * @param @param response
     * @param @return     
     * @return Ret
     * @Exception 异常对象
    */
    @ResponseBody
    @RequestMapping(value = "/saveBillAudit.do")
    public Ret saveBillAudit(BillPurchase billPurchase,HttpServletRequest request, HttpServletResponse response){
        SysUser user= ShiroUtils.getSysUser();
        try
        {
            billPurchase.setCompanyNo(ShiroUtils.getCompanyNo());
            billPurchaseService.saveBillAudit(billPurchase);
            return Ret.ok("保存成功");
        } catch (Exception e)
        {
            e.printStackTrace();
            return Ret.error(e.getMessage());
        }
    }
}    