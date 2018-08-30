package com.jr.erp.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.sys.dao.SysAreaInfoMapper;
import com.jr.erp.sys.entity.SysAreaInfo;
import com.jr.erp.sys.service.ISysAreaInfoService;

/**
 * @author Administrator
 * 系统门店的service
 */
@Service(value="sysAreaService")
public class SysAreaInfoServiceImpl extends AbstractBaseService<SysAreaInfo> implements ISysAreaInfoService{

	@Autowired
	private SysAreaInfoMapper sysAreaInfoMapper;
}
