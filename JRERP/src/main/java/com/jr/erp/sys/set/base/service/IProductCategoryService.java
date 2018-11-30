package com.jr.erp.sys.set.base.service;

import java.util.List;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.mybatis.IBaseService;
import com.jr.erp.sys.element.dto.SysGoodsCategoryDTO;

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

    /**    
     * getProductName(这里用一句话描述这个方法的作用)    
     * 获取公司级的名称列表       
     * @param @param companyNo
     * @param @return     
     * @return List<String>
     * @Exception 异常对象
    */
    List<String> getProductName(String companyNo);
}
