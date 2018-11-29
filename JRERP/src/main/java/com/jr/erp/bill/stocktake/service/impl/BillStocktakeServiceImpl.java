package com.jr.erp.bill.stocktake.service.impl;

import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.bill.stocktake.entity.BillStocktake;
import com.jr.erp.bill.stocktake.service.IBillStocktakeService;

@Service(value="billStocktakeService")
public class BillStocktakeServiceImpl extends AbstractBaseService<BillStocktake> implements IBillStocktakeService
{
}