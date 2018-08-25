package com.jr.erp.sys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.base.redis.RedisUtils;
import com.jr.erp.sys.dao.SysStoreMapper;
import com.jr.erp.sys.entity.SysStore;
import com.jr.erp.sys.service.ISysAreaService;
import com.jr.erp.sys.service.ISysCounterService;
import com.jr.erp.sys.service.ISysStoreService;

/**
 * @author Administrator
 * 系统门店的service
 */
@Service(value="sysStoreService")
public class SysStoreServiceImpl extends AbstractBaseService<SysStore> implements ISysStoreService{

	 @Autowired
	private RedisUtils redisUtils;
	@Autowired
	private ISysCounterService sysCounterServiceImpl;
	
	@Autowired
	private ISysAreaService sysAreaServiceImpl;
	
	@Override
	@Cacheable("getUserById")
	public SysStore selectByKey(Integer key) {
		SysStore sys = new SysStore();
		sys.setId(123);
		sys.setCompanyNo("zzzz");
		return  sys;
	}
	
	@Override
	public List<SysStore> selectList() {
		SysStoreMapper sysStoreMapper = (SysStoreMapper) this.mapper;
		List<SysStore> list = sysStoreMapper.selectList();
		System.out.println(list);
		
//		System.out.println(sysCounterServiceImpl.selectByKey(1));
//		
//		
//		System.out.println(sysAreaServiceImpl.selectByKey(1));
		return list;
	}

	@Override
	@Cacheable(cacheNames="content",keyGenerator="customKeyGenerator")
	public SysStore selectByString(Integer id) {
		SysStore sys = new SysStore();
		sys.setId((int)Math.random()*1000/10);
		sys.setCompanyNo("company"+id);
		redisUtils.set("gxh123"+id, id);
		return  sys;
	}
	
	@Override
	@Cacheable(value="getAll",key="#id")
	public List<SysStore> selectByStringList() {
		List<SysStore> list =new ArrayList<SysStore>();
		SysStore sys = new SysStore();
		sys.setId((int)Math.random()*1000/10);
		sys.setCompanyNo("company"+Math.random());
		list.add(sys);
		
		sys = new SysStore();
		sys.setId((int)Math.random()*1000/10);
		sys.setCompanyNo("company"+Math.random());
		list.add(sys);
		
		return  list;
	}
}
