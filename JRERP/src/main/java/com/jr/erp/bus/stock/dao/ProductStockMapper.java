package com.jr.erp.bus.stock.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jr.erp.base.mybatis.BaseMapper;
import com.jr.erp.bus.stock.entity.ProductStock;
import com.jr.erp.bus.stock.vo.StockOperVo;

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

    /**    
     * queryExistStock(这里用一句话描述这个方法的作用)    
     * 获取已经存在的库存列表
     * @param @param companyNo
     * @param @param inAreaCode
     * @param @param counterCode
     * @param @param barcode
     * @param @return     
     * @return Map<String,Integer>
     * @Exception 异常对象
    */
    @Select({"select barcode,id from bus_product_stock where "
            + "companyNo=#{companyNo} "
            + "and areaCode=#{areaCode} "
            + "and counterAreaCode=#{counterAreaCode} "
            + "and barcode in (${barcodeList})"})
    List<ProductStock> queryExistStock(@Param("companyNo") String companyNo, @Param("areaCode") String areaCode,
            @Param("counterAreaCode") String counterAreaCode, @Param("barcodeList") String barcodeList);
}
