package com.jr.erp.sys.set.base.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import com.jr.erp.base.exception.ServiceAccessException;
import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.sys.set.base.entity.BaseType;
import com.jr.erp.sys.set.base.entity.BaseTypeExample;
import com.jr.erp.sys.set.base.service.IBaseTypeService;

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
@Service(value = "baseTypeService")
public class BaseTypeServiceImpl extends AbstractBaseService<BaseType> implements IBaseTypeService
{
    
    @Override
    public void saveBaseType(BaseType counter)
    {
        this.insert(counter);
    }
    @Override
    public void updateBaseType(BaseType counter)
    {
        BaseTypeExample example = new BaseTypeExample();
        example.createCriteria().andCompanyNoEqualTo(counter.getCompanyNo()).andTypeNameEqualTo(counter.getTypeName()).andNameEqualTo(counter.getName());
        List<BaseEntity> list = this.selectByExample(example);
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
        BaseType newCategory = new BaseType();
        newCategory.setId(counter.getId());
        newCategory.setName(counter.getName());
        this.updateByPrimaryKeySelective(newCategory);
    }
    @Override
    public List<String> saveBaseType(String companyNo, ArrayList<BaseType> categoryList)
    {
        List<String> exist = new ArrayList<String>();
        if (CollectionUtils.isNotEmpty(categoryList))
        {
            for (BaseType sysCategorySet : categoryList)
            {
                BaseTypeExample example = new BaseTypeExample();
                example.createCriteria().andCompanyNoEqualTo(companyNo).andTypeNameEqualTo(sysCategorySet.getTypeName()).andNameEqualTo(sysCategorySet.getName());
                if (CollectionUtils.isNotEmpty(this.selectByExample(example)))
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
        BaseTypeExample example = new BaseTypeExample();
        example.createCriteria().andCompanyNoEqualTo(companyNo).andTypeNameEqualTo(element);
        List<BaseEntity> list = this.selectByExample(example);
        List<String> nameList = new ArrayList<String>();
        if (CollectionUtils.isNotEmpty(list))
        {
            for (BaseEntity temp : list)
            {
                BaseType set = (BaseType) temp;
                nameList.add(set.getName());
            }
        }
        return nameList;
    }
}
