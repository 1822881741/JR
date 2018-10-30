package com.jr.erp.sys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.sys.entity.SysGoodsCategory;
import com.jr.erp.sys.entity.SysGoodsCategoryExample;
import com.jr.erp.sys.entity.SysPurchaseSecheme;
import com.jr.erp.sys.entity.SysPurchaseSechemeItem;
import com.jr.erp.sys.entity.SysPurchaseSechemeItemExample;
import com.jr.erp.sys.service.ISysCategorySetService;
import com.jr.erp.sys.service.ISysGoodsCategoryService;
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
    
    @Autowired
    ISysCategorySetService sysCategorySetService;
    
    @Autowired
    ISysGoodsCategoryService sysGoodsCategoryService;
    @Override
    public SysPurchaseSecheme getById(Integer sechemeId)
    {
        SysPurchaseSecheme secheme = (SysPurchaseSecheme) this.selectByPrimaryKey(sechemeId);
        SysPurchaseSechemeItemExample example = new SysPurchaseSechemeItemExample();
        example.setOrderByClause("orderColumn");
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
            secheme.setIsSysDef(0);
            secheme.setStatus(1);
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

    @Override
    public List<JSONObject> getPurchaseColumnConfig(Integer sechemeId)
    {
        SysPurchaseSecheme importStrategy = this.getById(sechemeId);
        List<JSONObject> coumnsSetList = new ArrayList<JSONObject>();
        for (SysPurchaseSechemeItem importColumnVo : importStrategy.getItemList())
        {
            // 添加列设置
            JSONObject setInfo = new JSONObject();
            setInfo.put("data", importColumnVo.getBeanColumn());
            setInfo.put("title", importColumnVo.getShowName());

            // 商品名称需要特殊处理,并将商品名称用select2的js控件进行渲染
            if (StringUtils.equals(importColumnVo.getBeanColumn(), "goodsName"))
            {
                SysGoodsCategoryExample condition = new SysGoodsCategoryExample();
                condition.createCriteria().andCompanyNoEqualTo(importStrategy.getCompanyNo())
                        //.andFirstTypeEqualTo(importStrategy.getFirstType())
                        .andSecondTypeEqualTo(importStrategy.getSecondType());
                List<BaseEntity> archives = sysGoodsCategoryService.selectByExample(condition);
                JSONArray goodsNameArray = new JSONArray();
                List<String> validateArray = new ArrayList<String>();
                for (BaseEntity temp : archives)
                {
                    SysGoodsCategory tempCategory =(SysGoodsCategory) temp;
                    // 拼装下拉框中的数据下拉框中值和内容的对应关系
                    JSONObject tempName = new JSONObject();
                    tempName.put("id", tempCategory.getId());
                    tempName.put("text", tempCategory.getGoodsName());
                    goodsNameArray.add(tempName);

                    // 单独封装一遍值，进行界面的数据校验
                    validateArray.add(tempCategory.getGoodsName());
                }
                setInfo.put("editor", "select2");
                setInfo.put("select2Options","{data: " + goodsNameArray + ",dropdownAutoWidth: true, width: 'resolve'}");
                setInfo.put("validateArray", validateArray);
                //setInfo.put("validator", "nameValidator");
            } else if (StringUtils.equals(importColumnVo.getBeanColumn(), "num"))
            {
                //setInfo.put("validator", "goodsNumValidator");
            } else
            {
                switch (importColumnVo.getParamType())
                {
                case 1:
                    setInfo.put("type", "numeric");
                    setInfo.put("format", "0");
                    break;
                case 2:
                    setInfo.put("type", "numeric");
                    if (null != importColumnVo.getDigits())
                    {
                        setInfo.put("format", "0." + "0000000000".substring(0, importColumnVo.getDigits()));
                    } else
                    {
                        setInfo.put("format", "0.00");
                    }
                    break;
                case 3:
                    // 普通的通用类型使用简单select即可
                    String key = importColumnVo.getBaseClassKey();
                    List<String> nameList = sysCategorySetService.getNameList(importStrategy.getCompanyNo(), key);
                    nameList.add(0, "");
                    setInfo.put("type", "dropdown");
                    setInfo.put("source", nameList);
                    break;
                default:
                    setInfo.put("type", "text");
                    break;
                }
            }
            coumnsSetList.add(setInfo);
        }
        return coumnsSetList;
    }
}
