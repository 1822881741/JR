package com.jr.erp.bill.stocktake.service.impl;

import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.bill.stocktake.entity.BillStocktakeSubItem;
import com.jr.erp.bill.stocktake.service.IBillStocktakeSubItemService;

@Service(value="billStocktakeSubItemService")
public class BillStocktakeSubItemServiceImpl extends AbstractBaseService<BillStocktakeSubItem> implements IBillStocktakeSubItemService
{}