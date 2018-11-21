package com.jr.erp.bus.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jr.erp.bus.stock.service.IProductStockService;

@Controller
@RequestMapping("/productStock")
public class ProductStockController
{
    
    @Autowired
    private  IProductStockService productStockService;
}
