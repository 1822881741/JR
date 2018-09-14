package com.jr.erp.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
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
    private SysStoreMapper sysStoreMapper;

    @Autowired
    private ISysAreaInfoService sysAreaServiceImpl;

    @Override
    public void saveStore(SysStore store)
    {
        if(store.getId()==null)
        {
            // 新增
            SysAreaInfo areaInfo = sysAreaServiceImpl.selectByAreaCode(store.getCompanyNo(), store.getRegionCode());
            String nextCode = sysAreaServiceImpl.getNextCode(store.getCompanyNo(), store.getRegionCode(), 2);

            // 保存门店
            store.setAreaCode(nextCode);
            store.setRegionName(areaInfo.getAreaName());
            insert(store);

            // 保存区域表
            SysAreaInfo area = new SysAreaInfo();
            area.setParentId(areaInfo.getId());
            area.setAreaCode(nextCode);
            area.setAreaName(store.getShopName());
            area.setCompanyNo(store.getCompanyNo());
            area.setAreaType(2);
            area.setStatus(1);
            sysAreaServiceImpl.insert(area);
        }else
        {
            SysStore dbStore = (SysStore) this.selectByPrimaryKey(store.getId());
            SysStore newStore = new SysStore();
            newStore.setId(store.getId());
            newStore.setStatus(store.getStatus()==null?0:store.getStatus());
            newStore.setRemarks(store.getRemarks());
            newStore.setAddress(store.getAddress());
            newStore.setMobile(store.getMobile());
            this.updateByPrimaryKeySelective(newStore);

            
            SysAreaInfo areaInfo = sysAreaServiceImpl.selectByAreaCode(dbStore.getCompanyNo(), dbStore.getAreaCode());
            SysAreaInfo newArea = new SysAreaInfo();
            newArea.setId(areaInfo.getId());
            newStore.setStatus(store.getStatus()==null?0:store.getStatus());
            sysAreaServiceImpl.updateByPrimaryKeySelective(areaInfo);
        }
    }
}
