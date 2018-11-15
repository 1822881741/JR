package com.jr.erp.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.base.utils.JodaUtils;
import com.jr.erp.sys.dao.SysStoreMapper;
import com.jr.erp.sys.entity.SysAreaInfo;
import com.jr.erp.sys.entity.SysCounter;
import com.jr.erp.sys.entity.SysStore;
import com.jr.erp.sys.service.ISysAreaInfoService;
import com.jr.erp.sys.service.ISysCounterService;
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

    @Autowired
    private ISysCounterService sysCounterService;
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
            area.setAreaName(store.getStoreName());
            area.setCompanyNo(store.getCompanyNo());
            area.setAreaType(2);
            area.setStatus(1);
            sysAreaServiceImpl.insert(area);
            
            //默认创建在途仓库
            SysAreaInfo onWayArea = new SysAreaInfo();
            onWayArea.setParentId(area.getId());
            onWayArea.setAreaCode(nextCode+"000");
            onWayArea.setAreaName(store.getStoreName()+"在途仓");
            onWayArea.setCompanyNo(store.getCompanyNo());
            onWayArea.setAreaType(3);
            onWayArea.setStatus(1);
            sysAreaServiceImpl.insert(onWayArea);
            
            SysCounter onWayCounter = new SysCounter();
            onWayCounter.setAreaCode(nextCode+"000");
            onWayCounter.setCompanyNo(store.getCompanyNo());
            onWayCounter.setCounterName(store.getStoreName()+"在途仓");
            onWayCounter.setCounterType(2);
            onWayCounter.setCreateTime(JodaUtils.getFullDate());
            onWayCounter.setRemarks("在途仓，自动创建");
            onWayCounter.setStatus(1);
            sysCounterService.insert(onWayCounter);
            
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
