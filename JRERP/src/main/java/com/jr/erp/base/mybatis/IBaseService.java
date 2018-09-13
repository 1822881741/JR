package com.jr.erp.base.mybatis;

import java.util.List;

import com.jr.erp.base.utils.RetPage;

public interface IBaseService <T extends BaseEntity>{

	T selectByPrimaryKey(Integer key);

	Integer insert(T record);

	List<T> selectByExample(Object criteria);
	
	RetPage selectPage(Object criteria);
	
	Long countByExample(Object criteria);
	
	Integer deleteByPrimaryKey(Integer key);

	void merge(T record);
	
	void updateByPrimaryKey(T t);
}
