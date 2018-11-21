package com.jr.erp.bill.transfer.service;

import java.util.Map;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.mybatis.IBaseService;
import com.jr.erp.bill.purchase.entity.BillPurchase;
import com.jr.erp.bill.transfer.entity.BillTransfer;

public interface IBillTransferService extends IBaseService<BaseEntity>
{

    /**    
     * saveBillAudit(这里用一句话描述这个方法的作用)    
     * 保存单据，产生库存       
     * @param @param billPurchase     
     * @return void
     * @Exception 异常对象
    */
    void saveBillAudit(BillTransfer billTransfer);

    /**    
     * getDesktopBill(这里用一句话描述这个方法的作用)    
     * 获取桌面展示的单据列表       
     * @param @return     
     * @return Map<String,List<BillPurchase>>
     * @Exception 异常对象
    */
    Map<String, Object> getDesktopBill();

    /**    
     * getBillWithItem(这里用一句话描述这个方法的作用)    
     * 获得带有明细的进货单
     * @param @param id
     * @param @return     
     * @return BillPurchase
     * @Exception 异常对象
    */
    BillTransfer getBillWithItem(Integer id);

    /**    
     * addTransferItem(这里用一句话描述这个方法的作用)    
     * 调拨单中添加明细       
     * @param @param billTransfer     
     * @return void
     * @Exception 异常对象
    */
    BillTransfer addTransferItemBatch(BillTransfer billTransfer,String sql);
}
