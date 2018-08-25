package com.jr.erp.sys.service;

import java.util.List;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.mybatis.IBaseService;
import com.jr.erp.sys.entity.SysStore;

/**
 * 系统管理service
 */
public interface ISysStoreService extends IBaseService<BaseEntity>{

	/**
	 * @return
	 */
	List<SysStore> selectList();

	SysStore selectByString(Integer id);
	
	List<SysStore> selectByStringList();
}
