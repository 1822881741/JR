package com.jr.erp.bill.stocktake.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.Ret;
import com.jr.erp.bill.purchase.entity.BillPurchase;
import com.jr.erp.bill.purchase.service.IBillPurchaseService;
import com.jr.erp.bill.stocktake.service.IBillStocktakeService;
import com.jr.erp.sys.entity.SysAreaInfoExample;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.service.ISysAreaInfoService;
import com.jr.erp.sys.set.base.service.IBaseTypeService;
import com.jr.erp.sys.utils.service.IBillNoGeneratorService;

@Controller
@RequestMapping("/stocktake")
public class StocktakeController {    
    
    @Autowired
    private IBillStocktakeService billStocktakeService;
    
    @Autowired
    private IBaseTypeService baseTypeService;
    
    @Autowired
    private ISysAreaInfoService sysAreaInfoService;
    
    @Autowired
    IBillPurchaseService billPurchaseService;
    
    @Autowired
    IBillNoGeneratorService billNoGeneratorService;
    
    @RequestMapping(value = "/viewStocktakeMajor.do")
    public String viewStocktakeMajorList(HttpServletRequest request, Model model)
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
        
        //获取各种状态的单据
        Map<String,Object> desktopMap = billPurchaseService.getDesktopBill();
        model.addAttribute("desktopMap",desktopMap);
        
        return "bill/stocktake/viewStocktakeMajor";
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