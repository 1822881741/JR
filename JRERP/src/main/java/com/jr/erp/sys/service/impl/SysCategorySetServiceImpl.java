package com.jr.erp.sys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jr.erp.base.exception.ServiceAccessException;
import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.sys.entity.SysCategorySet;
import com.jr.erp.sys.entity.SysCategorySetExample;
import com.jr.erp.sys.service.ISysCategorySetService;

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
@Service(value = "sysCategorySetService")
public class SysCategorySetServiceImpl extends AbstractBaseService<SysCategorySet> implements ISysCategorySetService
{
    
    @Autowired
    ISysCategorySetService sysCategorySetService;
    @Override
    public void saveCategory(SysCategorySet counter)
    {
        this.insert(counter);
    }
    @Override
    public void updateCategory(SysCategorySet counter)
    {
        SysCategorySetExample example = new SysCategorySetExample();
        example.createCriteria().andCompanyNoEqualTo(counter.getCompanyNo()).andCategoryTypeEqualTo(counter.getCategoryType()).andNameEqualTo(counter.getName());
        List<BaseEntity> list = sysCategorySetService.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list))
        {
            for (BaseEntity baseEntity : list)
            {
                if (baseEntity.getId().intValue() != counter.getId())
                {
                    throw new ServiceAccessException("名称[" + counter.getName() + "]已经存在,请修改后重新保存");
                }
            }
        }
        SysCategorySet newCategory = new SysCategorySet();
        newCategory.setId(counter.getId());
        newCategory.setName(counter.getName());
        this.updateByPrimaryKeySelective(newCategory);
    }
    @Override
    public List<String> saveCategory(String companyNo, ArrayList<SysCategorySet> categoryList)
    {
        List<String> exist = new ArrayList<String>();
        if (CollectionUtils.isNotEmpty(categoryList))
        {
            for (SysCategorySet sysCategorySet : categoryList)
            {
                SysCategorySetExample example = new SysCategorySetExample();
                example.createCriteria().andCompanyNoEqualTo(companyNo).andCategoryTypeEqualTo(sysCategorySet.getCategoryType()).andNameEqualTo(sysCategorySet.getName());
                if (CollectionUtils.isNotEmpty(sysCategorySetService.selectByExample(example)))
                {
                    exist.add(sysCategorySet.getName());
                } else
                {
                    sysCategorySet.setCompanyNo(companyNo);
                    sysCategorySet.setIsSysDef(0);
                    this.insert(sysCategorySet);
                }
            }
        }
        return exist;
    }
    @Override
    public List<String> getNameList(String companyNo, String element)
    {
        SysCategorySetExample example = new SysCategorySetExample();
        example.createCriteria().andCompanyNoEqualTo(companyNo).andCategoryTypeEqualTo(element);
        List<BaseEntity> list = this.selectByExample(example);
        List<String> nameList = new ArrayList<String>();
        if (CollectionUtils.isNotEmpty(list))
        {
            for (BaseEntity temp : list)
            {
                SysCategorySet set = (SysCategorySet) temp;
                nameList.add(set.getName());
            }
        }
        return nameList;
    }
}
