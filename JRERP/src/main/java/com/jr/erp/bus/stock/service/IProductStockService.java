package com.jr.erp.bus.stock.service;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.mybatis.IBaseService;
import com.jr.erp.bill.purchase.entity.BillPurchase;

/**     
 * 类名称：IProductStockService    
 * 类描述：库存管理    
 * 创建人：admin    
 * 创建时间：2018年11月15日 下午5:49:30    
 * 修改人：admin    
 * 修改时间：2018年11月15日 下午5:49:30    
 * 修改备注：    
 * @version  1.0    
 */
public interface IProductStockService extends IBaseService<BaseEntity>{

    /**    
     * addPurchaseStock(这里用一句话描述这个方法的作用)    
     * 添加库存       
     * @param @param billPurchase
     * @param @param counterCode
     * @param @param status      状态
     * @return void
     * @Exception 异常对象
    */
    void addPurchaseStock(BillPurchase billPurchase,String counterCode);
}
