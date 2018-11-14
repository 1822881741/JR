package com.jr.erp.base.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BaseMapper<T extends BaseEntity> {

	int deleteByPrimaryKey(Integer pk);

	int insert(T record);

	T selectByPrimaryKey(Integer pk);

	int updateByPrimaryKey(T record);
	
	List<T> selectByExample(Object example);
	
	long countByExample(Object example);
	
	void updateByPrimaryKeySelective(T record);
	
	void deleteByExample(Object example);
	
}