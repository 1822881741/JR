package com.jr.erp.bill.stocktake.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jr.erp.bill.stocktake.entity.BillStocktake;
import com.jr.erp.bill.stocktake.service.IBillStocktakeService;
import com.jr.erp.bill.stocktake.service.IBillStocktakeSubService;
import com.jr.erp.bill.utils.Constance;
import com.jr.erp.sys.service.ISysUserService;
import com.jr.erp.sys.set.base.service.IProductCategoryService;
import com.jr.erp.sys.utils.service.IBillNoGeneratorService;

@Controller
@RequestMapping("/stocktake")
public class StocktakeSubController
{

    @Autowired
    private IBillStocktakeSubService billStocktakeSubService;

    @Autowired
    private IBillStocktakeService billStocktakeService;
    
    @Autowired
    IBillNoGeneratorService billNoGeneratorService;
    
    @Autowired
    ISysUserService sysUserService;
    
    @RequestMapping(value = "/viewStocktakeSub.do")
    public String viewStocktakeSub(HttpServletRequest request, Model model)
    {
        List<BillStocktake> noFinishList = billStocktakeService.getBillStocktakeList(Constance.BILL_STATUS_NEW);
        JSONArray ja = new JSONArray((List)noFinishList);
        model.addAttribute("noFinishList",ja.toJSONString());
        
        List<BillStocktake> finishList = billStocktakeService.getBillStocktakeList(Constance.BILL_STATUS_FINISH);
        JSONArray jas = new JSONArray((List)finishList);
        model.addAttribute("finishList",jas.toJSONString());
        return "bill/stocktake/viewStocktakeSub";
    }
    
    @RequestMapping(value = "/getStocktakeSubData.do")
    @ResponseBody
    public JSONArray getStocktakeSubData(HttpServletRequest request, Model model)
    {
        System.out.println("--------------");
        while(request.getParameterNames().hasMoreElements())
        {
            System.out.println(request.getParameterNames().nextElement());
            
        }
        JSONArray ja = new JSONArray();
        JSONObject j1= new JSONObject();
        j1.put("id", 1);
        j1.put("barcode", "barcode");
        j1.put("areaName", "1233333333333333333333333333333333333333333333333333333333333333333333333");
        j1.put("oldBarcode", "oldBarcode");
        ja.add(j1);
        
        JSONObject j2= new JSONObject();
        j2.put("id", 2);
        j2.put("barcode", "barcode");
        j2.put("oldBarcode", "oldBarcode");
        return ja;
    }
}