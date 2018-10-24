package com.jr.erp.sheet.purchase.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.sys.entity.SysPurchaseSecheme;
import com.jr.erp.sys.entity.SysPurchaseSechemeExample;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.service.ISysPurchaseSechemeService;

@Controller
@RequestMapping("/purchase")
public class PurchaseController {    
    
    @Autowired
    private ISysPurchaseSechemeService sysPurchaseSechemeService;
    
    @RequestMapping(value = "/editBill.do")
    public String editBill(HttpServletRequest request, Model model)
    {
        SysUser user= ShiroUtils.getSysUser();
        SysPurchaseSechemeExample example = new SysPurchaseSechemeExample();
        example.createCriteria().andCompanyNoEqualTo(user.getCompanyNo());
        List<BaseEntity> sechemeList = sysPurchaseSechemeService.selectByExample(example);
        model.addAttribute("sechemeList",sechemeList);
        return "bill/purchase/editPurchaseBill";
    }
}    