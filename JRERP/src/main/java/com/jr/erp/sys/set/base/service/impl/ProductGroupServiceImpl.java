package com.jr.erp.sys.set.base.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.sys.set.base.entity.ProductGroup;
import com.jr.erp.sys.set.base.entity.ProductGroupExample;
import com.jr.erp.sys.set.base.service.IProductGroupService;

/**     
 * 类名称：SysClassifyServiceImpl    
 * 类描述：商品分类设置    
 * 创建人：Administrator    
 * 创建时间：2018年10月18日 上午11:53:40    
 * 修改人：Administrator    
 * 修改时间：2018年10月18日 上午11:53:40    
 * 修改备注：    
 * @version  1.0    
 */
@Service(value = "sysClassifyService")
public class ProductGroupServiceImpl extends AbstractBaseService<ProductGroup> implements IProductGroupService
{
    @Override
    public void saveClassify(ProductGroup GoodsGroup)
    {
        GoodsGroup.setIsSysDef(0);
        this.merge(GoodsGroup);
    }

    @Override
    public Map<String, List<ProductGroup>> getInUseClassify(String companyNo)
    {
        Map<String, List<ProductGroup>> map = new HashMap<String, List<ProductGroup>>();
        List<ProductGroup> goldList = new ArrayList<ProductGroup>();
        List<ProductGroup> notGoldList = new ArrayList<ProductGroup>();
        List<ProductGroup> materialList = new ArrayList<ProductGroup>();
        List<ProductGroup> serviceFeeList = new ArrayList<ProductGroup>();
        map.put("gold", goldList);
        map.put("notGold", notGoldList);
        map.put("material", materialList);
        map.put("serviceFee", serviceFeeList);
        ProductGroupExample example = new ProductGroupExample();
        example.createCriteria().andCompanyNoEqualTo(companyNo).andStatusEqualTo(1);
        List<ProductGroup> allClassify = this.mapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(allClassify))
        {
            for (ProductGroup GoodsGroup : allClassify)
            {
                switch (GoodsGroup.getFirstType())
                {
                case "gold":
                    goldList.add(GoodsGroup);
                    break;
                case "notGold":
                    notGoldList.add(GoodsGroup);
                    break;
                case "material":
                    materialList.add(GoodsGroup);
                    break;
                case "serviceFee":
                    serviceFeeList.add(GoodsGroup);
                    break;
                default:
                    break;
                }
            }
        }
        return map;
    }
}
