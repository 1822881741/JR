package com.jr.erp.sys.service.impl;

import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.base.redis.RedisUtils;
import com.jr.erp.sys.dao.SysStoreMapper;
import com.jr.erp.sys.entity.SysAreaInfo;
import com.jr.erp.sys.entity.SysStore;
import com.jr.erp.sys.service.ISysAreaInfoService;
import com.jr.erp.sys.service.ISysStoreService;

/**     
 * 类名称：SysStoreServiceImpl    
 * 类描述：  门店service  
 * 创建人：Administrator    
 * 创建时间：2018年9月13日 下午12:38:12    
 * 修改人：Administrator    
 * 修改时间：2018年9月13日 下午12:38:12    
 * 修改备注：    
 * @version  1.0    
 */
@Service(value = "sysStoreService")
public class SysStoreServiceImpl extends AbstractBaseService<SysStore> implements ISysStoreService
{

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private SysStoreMapper sysStoreMapper;

    @Autowired
    private ISysAreaInfoService sysAreaServiceImpl;

    @Override
    public void saveStore(SysStore store)
    {
        store.setAreaCode("001001002");
        merge(store);
        SysAreaInfo area = new SysAreaInfo();
        area.setParentId(-1);
        area.setAreaCode("001001002");
        area.setAreaCode(store.getAreaCode());
        area.setAreaType(2);
        sysAreaServiceImpl.insert(area);
    }

    // @Override
    // @Cacheable("getUserById")
    // public SysStore selectByKey(Integer key) {
    // SysStore sys = new SysStore();
    // sys.setId(123);
    // sys.setCompanyNo("zzzz");
    // return sys;
    // }
    //
    // @Override
    // public List<SysStore> selectList() {
    // SysStoreMapper sysStoreMapper = (SysStoreMapper) this.mapper;
    // List<SysStore> list = sysStoreMapper.selectList();
    // System.out.println(list);
    //
    //// System.out.println(sysCounterServiceImpl.selectByKey(1));
    ////
    ////
    //// System.out.println(sysAreaServiceImpl.selectByKey(1));
    // return list;
    // }
    //
    // @Override
    // @Cacheable(cacheNames="content",keyGenerator="customKeyGenerator")
    // public SysStore selectByString(Integer id) {
    // SysStore sys = new SysStore();
    // sys.setId((int)Math.random()*1000/10);
    // sys.setCompanyNo("company"+id);
    // redisUtils.set("gxh123"+id, id);
    // return sys;
    // }
    //
    // @Override
    // @Cacheable(value="getAll",key="#id")
    // public List<SysStore> selectByStringList() {
    // List<SysStore> list =new ArrayList<SysStore>();
    // SysStore sys = new SysStore();
    // sys.setId((int)Math.random()*1000/10);
    // sys.setCompanyNo("company"+Math.random());
    // list.add(sys);
    //
    // sys = new SysStore();
    // sys.setId((int)Math.random()*1000/10);
    // sys.setCompanyNo("company"+Math.random());
    // list.add(sys);
    //
    // return list;
    // }
}
