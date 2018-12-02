package com.jr.erp.bill.stocktake.service.impl;

import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.bill.stocktake.entity.BillStocktakeSub;
import com.jr.erp.bill.stocktake.service.IBillStocktakeSubService;

@Service(value="billStocktakeSubService")
public class BillStocktakeSubServiceImpl extends AbstractBaseService<BillStocktakeSub> implements IBillStocktakeSubService
{}