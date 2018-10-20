package com.jr.erp.sheet.purchase.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/purchase")
public class PurchaseController {    
    
    @RequestMapping(value = "/editBill.do")
    public String editBill(HttpServletRequest request, Model model)
    {
        
        return "bill/purchase/editPurchaseBill";
    }
}    