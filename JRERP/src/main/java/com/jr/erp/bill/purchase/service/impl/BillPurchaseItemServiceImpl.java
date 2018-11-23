package com.jr.erp.bill.purchase.service.impl;

import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.bill.purchase.entity.BillPurchaseItem;
import com.jr.erp.bill.purchase.service.IBillPurchaseItemService;

@Service(value="billPurchaseItemService")
public class BillPurchaseItemServiceImpl extends AbstractBaseService<BillPurchaseItem> implements IBillPurchaseItemService
{}