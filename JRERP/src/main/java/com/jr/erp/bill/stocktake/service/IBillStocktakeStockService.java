package com.jr.erp.bill.stocktake.service;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.mybatis.IBaseService;
import com.jr.erp.bill.stocktake.entity.BillStocktake;

/**     
 * 类名称：IBillStocktakeStockService    
 * 类描述：盘点单对应的库存列表    
 * 创建人：admin    
 * 创建时间：2018年12月1日 上午11:12:40    
 * 修改人：admin    
 * 修改时间：2018年12月1日 上午11:12:40    
 * 修改备注：    
 * @version  1.0    
 */
public interface IBillStocktakeStockService extends IBaseService<BaseEntity>
{

    /**    
     * copyStock(这里用一句话描述这个方法的作用)    
     * 复制库存       
     * @param @param billStocktake     
     * @return void
     * @Exception 异常对象
    */
    Integer copyStock(BillStocktake billStocktake);

    /**    
     * deleteByMajorId(这里用一句话描述这个方法的作用)    
     * 根据主单id删除保留的库存       
     * @param @param id     
     * @return void
     * @Exception 异常对象
    */
    void deleteByMajorId(Integer id);}
