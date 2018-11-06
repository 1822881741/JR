package com.jr.erp.sys.service;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.mybatis.IBaseService;
import com.jr.erp.sys.entity.SysCounter;

/**
 * 系统管理service
 */
public interface ISysCounterService extends IBaseService<BaseEntity>{

    /**    
     * saveCounter(这里用一句话描述这个方法的作用)    
     * 保存柜台       
     * @param @param store
     * @param @param storeId     
     * @return void
     * @Exception 异常对象
    */
    void saveCounter(SysCounter store, String pAreaCode);

    /**    
     * updateCounter(这里用一句话描述这个方法的作用)    
     * 保存柜台       
     * @param @param store     
     * @return void
     * @Exception 异常对象
    */
    void updateCounter(SysCounter store);}
