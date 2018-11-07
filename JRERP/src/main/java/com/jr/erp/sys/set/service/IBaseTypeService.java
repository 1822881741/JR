package com.jr.erp.sys.set.service;

import java.util.ArrayList;
import java.util.List;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.mybatis.IBaseService;
import com.jr.erp.sys.set.entity.BaseType;

/**
 * 系统管理service
 */
public interface IBaseTypeService extends IBaseService<BaseEntity>{

    /**    
     * saveCounter(这里用一句话描述这个方法的作用)    
     * 保存柜台       
     * @param @param store
     * @param @param storeId     
     * @return void
     * @Exception 异常对象
    */
    void saveBaseType(BaseType store);

    /**    
     * updateCounter(这里用一句话描述这个方法的作用)    
     * 保存柜台       
     * @param @param store     
     * @return void
     * @Exception 异常对象
    */
    void updateBaseType(BaseType store);

    /**    
     * saveCategory(这里用一句话描述这个方法的作用)    
     * 批量保存分类，       
     * @param @param companyNo
     * @param @param categoryList
     * @param @return 返回未保存成功的名称集合     
     * @return List<String>
     * @Exception 异常对象
    */
    List<String> saveBaseType(String companyNo, ArrayList<BaseType> categoryList);

    /**    
     * getNameList(这里用一句话描述这个方法的作用)    
     * 获取指定类型的列表       
     * @param @param companyNo
     * @param @param element
     * @param @return     
     * @return List<String>
     * @Exception 异常对象
    */
    List<String> getNameList(String companyNo, String element);
}
