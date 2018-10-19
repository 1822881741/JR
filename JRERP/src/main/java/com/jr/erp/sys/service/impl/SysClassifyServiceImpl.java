package com.jr.erp.sys.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.sys.entity.SysClassify;
import com.jr.erp.sys.entity.SysClassifyExample;
import com.jr.erp.sys.service.ISysClassifyService;

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
public class SysClassifyServiceImpl extends AbstractBaseService<SysClassify> implements ISysClassifyService
{
    @Override
    public void saveClassify(SysClassify sysClassify)
    {
        sysClassify.setIsSysDef(0);
        this.merge(sysClassify);
    }

    @Override
    public Map<String, List<SysClassify>> getInUseClassify(String companyNo)
    {
        Map<String, List<SysClassify>> map = new HashMap<String, List<SysClassify>>();
        List<SysClassify> goldList = new ArrayList<SysClassify>();
        List<SysClassify> notGoldList = new ArrayList<SysClassify>();
        List<SysClassify> materialList = new ArrayList<SysClassify>();
        List<SysClassify> serviceFeeList = new ArrayList<SysClassify>();
        map.put("gold", goldList);
        map.put("notGold", notGoldList);
        map.put("material", materialList);
        map.put("serviceFee", serviceFeeList);
        SysClassifyExample example = new SysClassifyExample();
        example.createCriteria().andCompanyNoEqualTo(companyNo).andStatusEqualTo(1);
        List<SysClassify> allClassify = this.mapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(allClassify))
        {
            for (SysClassify sysClassify : allClassify)
            {
                switch (sysClassify.getFirstType())
                {
                case "gold":
                    goldList.add(sysClassify);
                    break;
                case "notGold":
                    notGoldList.add(sysClassify);
                    break;
                case "material":
                    materialList.add(sysClassify);
                    break;
                case "serviceFee":
                    serviceFeeList.add(sysClassify);
                    break;
                default:
                    break;
                }
            }
        }
        return map;
    }
}
