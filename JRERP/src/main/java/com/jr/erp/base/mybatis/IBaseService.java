package com.jr.erp.base.mybatis;

import java.util.List;

public interface IBaseService <T extends BaseEntity>{

	T selectByPrimaryKey(Integer key);

	Integer insert(T record);

	List<T> selectByExample(Object criteria);
	
	Integer deleteByPrimaryKey(Integer key);

	void merge(T record);
}
