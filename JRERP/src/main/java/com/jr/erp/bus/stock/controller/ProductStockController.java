package com.jr.erp.bus.stock.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.Ret;
import com.jr.erp.bus.stock.dto.StockQueryDTO;
import com.jr.erp.bus.stock.entity.ProductStock;
import com.jr.erp.bus.stock.service.IProductStockService;
import com.jr.erp.sys.entity.SysUser;

@Controller
@RequestMapping("/productStock")
public class ProductStockController
{
    
    @Autowired
    private  IProductStockService productStockService;
    
    @ResponseBody
    @RequestMapping(value = "/queryStock.do")
    public Ret queryStock(StockQueryDTO dto,HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
            List<ProductStock> list = productStockService.queryStock(dto);
            if(CollectionUtils.isNotEmpty(list))
            {
                return Ret.ok("",list);
            }else
            {
                return Ret.error("未找到符合条件的商品");
            }
        } catch (Exception e)
        {
            e.printStackTrace();
            return Ret.error(e.getMessage());
        }
    }
}
