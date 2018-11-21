package com.jr.erp.bus.stock.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jr.erp.base.mybatis.BaseMapper;
import com.jr.erp.bus.stock.entity.ProductStock;

public interface ProductStockMapper extends BaseMapper<ProductStock> {

    /**    
     * queryStockByQueryBuilder(这里用一句话描述这个方法的作用)    
     * 根据sql 查询库存       
     * @param @param querySql
     * @param @return     
     * @return List<ProductStock>
     * @Exception 异常对象
    */
    @Select({"select * from bus_product_stock where ${querySql}"})
    List<ProductStock> queryStockByQueryBuilder(@Param("querySql") String querySql);
    
}