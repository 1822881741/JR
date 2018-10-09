package com.jr.erp.sys.service;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.mybatis.IBaseService;
import com.jr.erp.sys.element.dto.SysGoodsCategoryDTO;
import com.jr.erp.sys.entity.SysCategorySet;

/**
 * 系统管理service
 */
public interface ISysGoodsCategoryService extends IBaseService<BaseEntity>{

    /**    
     * saveCounter(这里用一句话描述这个方法的作用)    
     * 保存柜台       
     * @param @param store
     * @param @param storeId     
     * @return void
     * @Exception 异常对象
    */
    void saveCategory(SysGoodsCategoryDTO sysGoodsCategoryDTO);

    /**    
     * updateCounter(这里用一句话描述这个方法的作用)    
     * 保存柜台       
     * @param @param store     
     * @return void
     * @Exception 异常对象
    */
    void updateCategory(SysCategorySet store);

}
