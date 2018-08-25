package com.jr.erp.base.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = Exception.class)
public class AbstractBaseService<T extends BaseEntity> implements IBaseService<BaseEntity> {

	@Autowired
	protected BaseMapper<T> mapper;

	@Override
	@Cacheable("getUserById")
	public T selectByKey(Integer key) {
		return (T) mapper.selectByPrimaryKey(key);
	}

	@Override
	public Integer deleteByKey(Integer key) {
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public Integer insert(BaseEntity record) {
		return mapper.insert((T) record);
	}

	@Override
	public void merge(BaseEntity record) {
		if (record.getId() != null) {
			mapper.updateByPrimaryKey((T) record);
		} else {
			mapper.insert((T) record);
		}
	}

}
