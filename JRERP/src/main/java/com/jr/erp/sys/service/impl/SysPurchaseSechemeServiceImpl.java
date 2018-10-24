package com.jr.erp.sys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.sys.entity.SysPurchaseSecheme;
import com.jr.erp.sys.entity.SysPurchaseSechemeItem;
import com.jr.erp.sys.entity.SysPurchaseSechemeItemExample;
import com.jr.erp.sys.service.ISysPurchaseSechemeItemService;
import com.jr.erp.sys.service.ISysPurchaseSechemeService;

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
@Service(value = "sysPurchaseSechemeService")
public class SysPurchaseSechemeServiceImpl extends AbstractBaseService<SysPurchaseSecheme> implements ISysPurchaseSechemeService
{

    @Autowired
    ISysPurchaseSechemeItemService sysPurchaseSechemeItemService; 
    
    @Override
    public SysPurchaseSecheme getById(Integer sechemeId)
    {
        SysPurchaseSecheme secheme = (SysPurchaseSecheme) this.selectByPrimaryKey(sechemeId);
        SysPurchaseSechemeItemExample example = new SysPurchaseSechemeItemExample();
        example.createCriteria().andSechemeIdEqualTo(sechemeId);
        List<BaseEntity> list = sysPurchaseSechemeItemService.selectByExample(example);
        List<SysPurchaseSechemeItem> itemList = new ArrayList<SysPurchaseSechemeItem>();
        for (BaseEntity temp : list)
        {
            itemList.add((SysPurchaseSechemeItem) temp);
        }
        secheme.setItemList(itemList);
        return secheme;
    }

    @Override
    public void saveSecheme(SysPurchaseSecheme secheme)
    {
        if (secheme.getId() != null)
        {
            SysPurchaseSechemeItemExample example = new SysPurchaseSechemeItemExample();
            example.createCriteria().andCompanyNoEqualTo(secheme.getCompanyNo()).andSechemeIdEqualTo(secheme.getId());
            sysPurchaseSechemeItemService.deleteByExample(example);
            this.updateByPrimaryKey(secheme);
        } else
        {
            this.insert(secheme);
        }
        List<SysPurchaseSechemeItem> itemList = secheme.getItemList();
        if (CollectionUtils.isNotEmpty(itemList))
        {
            for (SysPurchaseSechemeItem sysPurchaseSechemeItem : itemList)
            {
                sysPurchaseSechemeItem.setCompanyNo(secheme.getCompanyNo());
                sysPurchaseSechemeItem.setSechemeId(secheme.getId());
                sysPurchaseSechemeItemService.insert(sysPurchaseSechemeItem);
            }
        }
    }
}
