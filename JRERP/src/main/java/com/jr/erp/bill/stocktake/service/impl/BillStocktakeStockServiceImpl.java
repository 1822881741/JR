package com.jr.erp.bill.stocktake.service.impl;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.bill.stocktake.entity.BillStocktake;
import com.jr.erp.bill.stocktake.entity.BillStocktakeStock;
import com.jr.erp.bill.stocktake.entity.BillStocktakeStockExample;
import com.jr.erp.bill.stocktake.service.IBillStocktakeStockService;
import com.jr.erp.bus.stock.entity.ProductStock;
import com.jr.erp.bus.stock.entity.ProductStockExample;
import com.jr.erp.bus.stock.service.IProductStockService;

@Service(value="billStocktakeStockService")
public class BillStocktakeStockServiceImpl extends AbstractBaseService<BillStocktakeStock> implements IBillStocktakeStockService
{

    @Autowired
    IProductStockService productStockService;
    
    @Override
    public Integer copyStock(BillStocktake billStocktake)
    {
        ProductStockExample example = new ProductStockExample();
        ProductStockExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyNoEqualTo(billStocktake.getCompanyNo());
        criteria.andAreaCodeEqualTo(billStocktake.getAreaCode());
        criteria.andHasStockEqualTo(1);
        if (StringUtils.isNotEmpty(billStocktake.getCounterAreaCode()))
        {
            criteria.andCounterAreaCodeIn(Arrays.asList(billStocktake.getCounterAreaCode().split(",")));
        }
        if (StringUtils.isNotEmpty(billStocktake.getProductName()))
        {
            criteria.andProductNameIn(Arrays.asList(billStocktake.getProductName().split(",")));
        }

        List<ProductStock> list = (List) productStockService.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list))
        {
            for (ProductStock productStock : list)
            {
                System.out.println(productStock.getId());
                BillStocktakeStock bakStock = new BillStocktakeStock();
                BeanUtils.copyProperties(productStock,bakStock);
                bakStock.setId(null);
                bakStock.setBillId(billStocktake.getId());
                bakStock.setStockId(productStock.getId());
                this.insert(bakStock);
            }
        }
        return list.size();
    }
    public static void main(String[] args)
    {
        String cc="ccc,bbb,ddd";
        List<String> aa =Arrays.asList(cc.split(","));
        System.out.println(aa);
    }
    @Override
    public void deleteByMajorId(Integer id)
    {
        BillStocktakeStockExample example = new BillStocktakeStockExample();
        example.createCriteria().andCompanyNoEqualTo(ShiroUtils.getCompanyNo()).andBillIdEqualTo(id);
        this.deleteByExample(example);
    }
}