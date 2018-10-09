package com.jr.erp.sys.service.impl;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.sys.element.dto.SysGoodsCategoryDTO;
import com.jr.erp.sys.entity.SysCategorySet;
import com.jr.erp.sys.entity.SysCategorySetExample;
import com.jr.erp.sys.entity.SysGoodsCategory;
import com.jr.erp.sys.service.ISysGoodsCategoryService;

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
@Service(value = "sysGoodsCategoryService")
public class SysGoodsCategoryServiceImpl extends AbstractBaseService<SysGoodsCategory> implements ISysGoodsCategoryService
{
 
    @Override
    public void saveCategory(SysGoodsCategoryDTO sysGoodsCategoryDTO)
    {
        if(sysGoodsCategoryDTO!=null)
        {
            switch (sysGoodsCategoryDTO.getFirstTypePrefix())
            {
            case "gold":
                if(ArrayUtils.isNotEmpty(sysGoodsCategoryDTO.getSecondTypePrefix()))
                {
                    for (String secondType : sysGoodsCategoryDTO.getSecondTypePrefix())
                    {
                        if (ArrayUtils.isNotEmpty(sysGoodsCategoryDTO.getGoldName()))
                        {
                            for (String goldName : sysGoodsCategoryDTO.getGoldName())
                            {
                                if (ArrayUtils.isNotEmpty(sysGoodsCategoryDTO.getJewelName()))
                                {
                                    for (String jewelName : sysGoodsCategoryDTO.getJewelName())
                                    {
                                        if (ArrayUtils.isNotEmpty(sysGoodsCategoryDTO.getCategoryName()))
                                        {
                                            for (String categoryName : sysGoodsCategoryDTO.getCategoryName())
                                            {
                                                if (ArrayUtils.isNotEmpty(sysGoodsCategoryDTO.getGoldPercent()))
                                                {
                                                    for (String goldPercent : sysGoodsCategoryDTO.getGoldPercent())
                                                    {
                                                        
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case "notGold":

                break;
            case "material":

                break;
            case "serviceFee":

                break;

            default:
                break;
            }
            
        }
        
//        this.insert(counter);
    }
    @Override
    public void updateCategory(SysCategorySet counter)
    {
        SysCategorySetExample example = new SysCategorySetExample();
        example.createCriteria().andCompanyNoEqualTo(counter.getCompanyNo()).andCategoryTypeEqualTo(counter.getCategoryType()).andNameEqualTo(counter.getName());
        SysCategorySet newCategory = new SysCategorySet();
        newCategory.setId(counter.getId());
        newCategory.setName(counter.getName());
        this.updateByPrimaryKeySelective(newCategory);
    }
}
