package com.jr.erp.sys.service;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.mybatis.IBaseService;
import com.jr.erp.sys.entity.SysStore;

/**
 * 系统管理service
 */
public interface ISysStoreService extends IBaseService<BaseEntity>{

    /**    
     * saveStore(这里用一句话描述这个方法的作用)    
     * 保存门店       
     * @param @param store     
     * @return void
     * @Exception 异常对象
    */
    void saveStore(SysStore store);
}
