package com.jr.erp.bill.transfer.service.impl;

import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.bill.transfer.entity.BillTransferItem;
import com.jr.erp.bill.transfer.service.IBillTransferItemService;

@Service(value="billTransferItemService")
public class BillTransferItemServiceImpl extends AbstractBaseService<BillTransferItem> implements IBillTransferItemService
{}