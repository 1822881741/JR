package com.jr.erp.base.mybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jr.erp.bus.stock.entity.ProductStock;

@Mapper
public interface BaseMapper<T extends BaseEntity>
{

    int insert(T record);

    int deleteByPrimaryKey(Integer pk);

    void deleteByExample(Object example);

    int updateByPrimaryKey(T record);

    void updateByPrimaryKeySelective(T record);

    void updateByExampleSelective(Map map);
    
    T selectByPrimaryKey(Integer pk);

    List<T> selectByExample(Object example);

    long countByExample(Object example);

    @Select({"select billStatus from ${tableName} where companyNo=#{companyNo} and id=#{id}"})
    Integer selectBillStatus(@Param("tableName") String tableName,@Param("companyNo") String companyNo, @Param("id") Integer id);
    
    @Select({"select billNo from ${tableName} where companyNo=#{companyNo} and sysBillNo like CONCAT(#{prefix},'%') order by sysBillNo desc limit 0,1"})
    String selectMaxBillNo(@Param("tableName") String tableName,@Param("companyNo") String companyNo,@Param("prefix") String prefix);

    @Select({"select count(id) from ${tableName} where companyNo=#{companyNo} and id=#{id}"})
    int getBillExist(@Param("tableName") String tableName,@Param("companyNo") String companyNo, @Param("id") Integer id);
}