package com.jr.erp.sheet.purchase.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/purchaseSecheme")
public class PurchaseSechemeController {    
    
    
    @RequestMapping(value = "/editSecheme.do")
    public String editSecheme(HttpServletRequest request, Model model)
    {
        
        return "bill/secheme/editSecheme";
    }
}    