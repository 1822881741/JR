package com.jr.erp.bill.transfer.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.service.impl.IFileUploadService;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.JodaUtils;
import com.jr.erp.base.utils.Ret;
import com.jr.erp.bill.purchase.entity.BillPurchase;
import com.jr.erp.bill.purchase.service.IBillPurchaseService;
import com.jr.erp.sys.entity.SysAreaInfoExample;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.service.ISysAreaInfoService;
import com.jr.erp.sys.set.base.service.IBaseTypeService;
import com.jr.erp.sys.set.purchase.service.IPurchaseSechemeService;
import com.jr.erp.sys.utils.service.IBillNoGeneratorService;

@Controller
@RequestMapping("/transfer")
public class TransferController
{
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
    
    @RequestMapping(value = "/editTransferBill.do")
    public String editTransferBill(Integer id,HttpServletRequest request, Model model)
    {
        SysUser user= ShiroUtils.getSysUser();
        String companyNo=user.getCompanyNo();
        
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
            purchase.setSysBillNo(billNoGeneratorService.getNextBillNo(ShiroUtils.getCompanyNo(),1,ShiroUtils.getSysUser().getUserSheetNoPrefix()));
            purchase.setBillNo(purchase.getSysBillNo());
            model.addAttribute("billPurchase",purchase);
            model.addAttribute("itemListData","[]");
        }
        
        //获取各种状态的单据
        Map<String,Object> desktopMap = billPurchaseService.getDesktopBill();
        model.addAttribute("desktopMap",desktopMap);
        
        return "bill/transfer/editTransferBill";
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
