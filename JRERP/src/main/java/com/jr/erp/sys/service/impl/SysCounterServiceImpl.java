package com.jr.erp.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.sys.entity.SysAreaInfo;
import com.jr.erp.sys.entity.SysCounter;
import com.jr.erp.sys.entity.SysStore;
import com.jr.erp.sys.service.ISysAreaInfoService;
import com.jr.erp.sys.service.ISysCounterService;
import com.jr.erp.sys.service.ISysStoreService;

/**     
 * 类名称：SysCounterServiceImpl    
 * 类描述： 柜台操作类   
 * 创建人：Administrator    
 * 创建时间：2018年9月15日 下午3:50:49    
 * 修改人：Administrator    
 * 修改时间：2018年9月15日 下午3:50:49    
 * 修改备注：    
 * @version  1.0    
 */
@Service(value = "sysCounterService")
public class SysCounterServiceImpl extends AbstractBaseService<SysCounter> implements ISysCounterService
{
    
    @Autowired
    ISysStoreService sysStoreService;
    
    @Autowired
    ISysAreaInfoService sysAreaService;
    @Override
    public void saveCounter(SysCounter counter, String pAreaCode)
    {
        SysStore store = (SysStore) sysStoreService.selectByPrimaryKey(counter.getId());
        if (store != null)
        {
            SysAreaInfo parentArea = sysAreaService.selectByAreaCode(store.getCompanyNo(), store.getAreaCode());
            String areaCode = sysAreaService.getNextCode(store.getCompanyNo(), store.getAreaCode(), 3);
            counter.setAreaCode(areaCode);
            this.insert(counter);
            
            // 保存区域表
            SysAreaInfo area = new SysAreaInfo();
            area.setParentId(parentArea.getId());
            area.setAreaCode(areaCode);
            area.setAreaName(store.getStoreName());
            area.setCompanyNo(store.getCompanyNo());
            area.setAreaType(3);
            area.setStatus(counter.getStatus());
            sysAreaService.insert(area);
        }else
        {
            //
        }
    }
    @Override
    public void updateCounter(SysCounter counter)
    {
        SysCounter update = new SysCounter();
        update.setId(counter.getId());
        update.setStatus(counter.getStatus());
        this.updateByPrimaryKeySelective(update);
        
        SysAreaInfo parentArea = sysAreaService.selectByAreaCode(counter.getCompanyNo(), counter.getAreaCode());
        SysAreaInfo area = new SysAreaInfo();
        area.setId(parentArea.getId());
        area.setStatus(counter.getStatus());
        sysAreaService.updateByPrimaryKeySelective(area);
    }
}
