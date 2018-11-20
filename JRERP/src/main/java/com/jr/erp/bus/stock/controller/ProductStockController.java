package com.jr.erp.bus.stock.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jr.erp.base.utils.Ret;
import com.jr.erp.bus.stock.service.IProductStockService;

@Controller
@RequestMapping("/productStock")
public class ProductStockController
{
    
    @Autowired
    private  IProductStockService productStockService;
    
    
    @RequestMapping(value = "/queryStockByQueryBuilder.do")
    @ResponseBody
    public Ret queryStockByQueryBuilder(String querySql,HttpServletRequest request, Model model)
    {
        productStockService.queryStockByQueryBuilder(querySql);
        return Ret.ok("", "");
    }
    
}
