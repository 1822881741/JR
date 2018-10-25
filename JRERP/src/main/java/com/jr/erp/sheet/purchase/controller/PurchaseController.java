package com.jr.erp.sheet.purchase.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.sys.entity.SysAreaInfo;
import com.jr.erp.sys.entity.SysAreaInfoExample;
import com.jr.erp.sys.entity.SysPurchaseSechemeExample;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.service.ISysAreaInfoService;
import com.jr.erp.sys.service.ISysCategorySetService;
import com.jr.erp.sys.service.ISysPurchaseSechemeService;

@Controller
@RequestMapping("/purchase")
public class PurchaseController {    
    
    @Autowired
    private ISysPurchaseSechemeService sysPurchaseSechemeService;
    
    @Autowired
    private ISysCategorySetService sysCategorySetService;
    
    @Autowired
    private ISysAreaInfoService sysAreaInfoService;
    
    @RequestMapping(value = "/editBill.do")
    public String editBill(HttpServletRequest request, Model model)
    {
        SysUser user= ShiroUtils.getSysUser();
        String companyNo=user.getCompanyNo();
        //获取导入方案列表
        SysPurchaseSechemeExample example = new SysPurchaseSechemeExample();
        example.createCriteria().andCompanyNoEqualTo(companyNo);
        List<BaseEntity> sechemeList = sysPurchaseSechemeService.selectByExample(example);
        model.addAttribute("sechemeList",sechemeList);
        
        //供应商列表
        List<String> supplyList = sysCategorySetService.getNameList(companyNo, "supplier");
        model.addAttribute("supplierList",supplyList);
        
        //进货类型
        List<String> brandNameList = sysCategorySetService.getNameList(companyNo, "brandName");
        model.addAttribute("brandNameList",brandNameList);
        
        //进货类型
        List<String> purchaseTypeList = sysCategorySetService.getNameList(companyNo, "purchaseType");
        model.addAttribute("purchaseTypeList",purchaseTypeList);
        
        //进货门店
        SysAreaInfoExample areaExample = new SysAreaInfoExample();
        areaExample.createCriteria().andCompanyNoEqualTo(companyNo).andAreaCodeLike(user.getAreaCode()+"%").andStatusEqualTo(1).andAreaTypeIn(Arrays.asList(new Integer[]{0,1,2}));
        List<BaseEntity> areaList = sysAreaInfoService.selectByExample(areaExample);
        model.addAttribute("areaList",areaList);
        
        return "bill/purchase/editPurchaseBill";
    }
    
    
}    