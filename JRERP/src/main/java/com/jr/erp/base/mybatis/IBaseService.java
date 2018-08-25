package com.jr.erp.base.mybatis;

public interface IBaseService <T extends BaseEntity>{

	T selectByKey(Integer key);

	Integer insert(T record);

	Integer deleteByKey(Integer key);
	
	void merge(T record);
}
