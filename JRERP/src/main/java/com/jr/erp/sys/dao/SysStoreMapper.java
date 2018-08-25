package com.jr.erp.sys.dao;

import java.util.List;

import com.jr.erp.base.mybatis.BaseMapper;
import com.jr.erp.sys.entity.SysStore;

public interface SysStoreMapper extends BaseMapper<SysStore> {

	List<SysStore> selectList();
}