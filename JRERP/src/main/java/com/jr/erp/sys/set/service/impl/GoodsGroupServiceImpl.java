package com.jr.erp.sys.set.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.sys.set.entity.GoodsGroup;
import com.jr.erp.sys.set.entity.GoodsGroupExample;
import com.jr.erp.sys.set.service.IGoodsGroupService;

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
public class GoodsGroupServiceImpl extends AbstractBaseService<GoodsGroup> implements IGoodsGroupService
{
    @Override
    public void saveClassify(GoodsGroup GoodsGroup)
    {
        GoodsGroup.setIsSysDef(0);
        this.merge(GoodsGroup);
    }

    @Override
    public Map<String, List<GoodsGroup>> getInUseClassify(String companyNo)
    {
        Map<String, List<GoodsGroup>> map = new HashMap<String, List<GoodsGroup>>();
        List<GoodsGroup> goldList = new ArrayList<GoodsGroup>();
        List<GoodsGroup> notGoldList = new ArrayList<GoodsGroup>();
        List<GoodsGroup> materialList = new ArrayList<GoodsGroup>();
        List<GoodsGroup> serviceFeeList = new ArrayList<GoodsGroup>();
        map.put("gold", goldList);
        map.put("notGold", notGoldList);
        map.put("material", materialList);
        map.put("serviceFee", serviceFeeList);
        GoodsGroupExample example = new GoodsGroupExample();
        example.createCriteria().andCompanyNoEqualTo(companyNo).andStatusEqualTo(1);
        List<GoodsGroup> allClassify = this.mapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(allClassify))
        {
            for (GoodsGroup GoodsGroup : allClassify)
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
