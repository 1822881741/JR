package com.jr.erp.sys.service.impl;

import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.service.ISysUserService;

/**
 * 系统用户service
 */
@Service(value = "sysUserService")
public class SysUserServiceImpl extends AbstractBaseService<SysUser> implements ISysUserService {
}
