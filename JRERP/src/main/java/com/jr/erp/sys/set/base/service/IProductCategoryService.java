package com.jr.erp.sys.set.base.service;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.mybatis.IBaseService;
import com.jr.erp.sys.element.dto.SysGoodsCategoryDTO;
import com.jr.erp.sys.set.base.entity.BaseType;

/**
 * 系统管理service
 */
public interface IProductCategoryService extends IBaseService<BaseEntity>{

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
     * deleteGoodsCategory(这里用一句话描述这个方法的作用)    
     * 删除商品分类列表       
     * @param @param companyNo
     * @param @param ids     
     * @return void
     * @Exception 异常对象
    */
    void deleteGoodsCategory(String companyNo, Integer[] ids);

}
