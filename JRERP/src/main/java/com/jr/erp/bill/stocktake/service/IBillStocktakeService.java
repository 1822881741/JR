package com.jr.erp.bill.stocktake.service;

import java.util.List;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.mybatis.IBaseService;
import com.jr.erp.bill.stocktake.entity.BillStocktake;

public interface IBillStocktakeService extends IBaseService<BaseEntity>
{

    /**    
     * getBillStocktakeList(这里用一句话描述这个方法的作用)    
     * 获取盘点单列表
     * @param @return     
     * @return List<BillStocktake>
     * @Exception 异常对象
     */
    List<BillStocktake> getBillStocktakeList();
    
    /**    
     * saveStocktakeMajor(这里用一句话描述这个方法的作用)    
     * 新增盘点主单       
     * @param @param billStocktake     
     * @return void
     * @Exception 异常对象
    */
    void saveStocktakeMajor(BillStocktake billStocktake);


    
}
