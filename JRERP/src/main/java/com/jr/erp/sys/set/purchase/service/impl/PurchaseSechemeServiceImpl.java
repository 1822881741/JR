package com.jr.erp.sys.set.purchase.service.impl;

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
import com.jr.erp.sys.set.base.entity.ProductCategory;
import com.jr.erp.sys.set.base.entity.ProductCategoryExample;
import com.jr.erp.sys.set.base.service.IBaseTypeService;
import com.jr.erp.sys.set.base.service.IProductCategoryService;
import com.jr.erp.sys.set.purchase.entity.PurchaseSecheme;
import com.jr.erp.sys.set.purchase.entity.PurchaseSechemeItem;
import com.jr.erp.sys.set.purchase.entity.PurchaseSechemeItemExample;
import com.jr.erp.sys.set.purchase.service.IPurchaseSechemeItemService;
import com.jr.erp.sys.set.purchase.service.IPurchaseSechemeService;
import com.jr.erp.sys.vo.PurchaseColumnVo;

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
@Service(value = "PurchaseSechemeService")
public class PurchaseSechemeServiceImpl extends AbstractBaseService<PurchaseSecheme> implements IPurchaseSechemeService
{

    @Autowired
    IPurchaseSechemeItemService PurchaseSechemeItemService; 
    
    @Autowired
    IBaseTypeService baseTypeService;
    
    @Autowired
    IProductCategoryService sysGoodsCategoryService;
    
    @Override
    public PurchaseSecheme getById(Integer sechemeId)
    {
        PurchaseSecheme secheme = (PurchaseSecheme) this.selectByPrimaryKey(sechemeId);
        PurchaseSechemeItemExample example = new PurchaseSechemeItemExample();
        example.setOrderByClause("orderColumn");
        example.createCriteria().andSechemeIdEqualTo(sechemeId);
        List<BaseEntity> list = PurchaseSechemeItemService.selectByExample(example);
        List<PurchaseSechemeItem> itemList = new ArrayList<PurchaseSechemeItem>();
        for (BaseEntity temp : list)
        {
            itemList.add((PurchaseSechemeItem) temp);
        }
        secheme.setItemList(itemList);
        return secheme;
    }

    @Override
    public void saveSecheme(PurchaseSecheme secheme)
    {
        if (secheme.getId() != null)
        {
            PurchaseSechemeItemExample example = new PurchaseSechemeItemExample();
            example.createCriteria().andCompanyNoEqualTo(secheme.getCompanyNo()).andSechemeIdEqualTo(secheme.getId());
            PurchaseSechemeItemService.deleteByExample(example);
            this.updateByPrimaryKey(secheme);
        } else
        {
            secheme.setIsSysDef(0);
            secheme.setStatus(1);
            this.insert(secheme);
        }
        List<PurchaseSechemeItem> itemList = secheme.getItemList();
        if (CollectionUtils.isNotEmpty(itemList))
        {
            for (PurchaseSechemeItem PurchaseSechemeItem : itemList)
            {
                PurchaseSechemeItem.setCompanyNo(secheme.getCompanyNo());
                PurchaseSechemeItem.setSechemeId(secheme.getId());
                PurchaseSechemeItemService.insert(PurchaseSechemeItem);
            }
        }
    }

    @Override
    public PurchaseColumnVo getPurchaseColumnConfig(Integer sechemeId)
    {
        PurchaseColumnVo vo = new PurchaseColumnVo();
        PurchaseSecheme importStrategy = this.getById(sechemeId);
        List<JSONObject> coumnsSetList = new ArrayList<JSONObject>();
        JSONObject rowNo = new JSONObject();
        rowNo.put("id", "rowNo");
        rowNo.put("header", "#");
        rowNo.put("css", "header");
        rowNo.put("width", 50);
        coumnsSetList.add(rowNo);
        for (PurchaseSechemeItem importColumnVo : importStrategy.getItemList())
        {
            // 添加列设置
            JSONObject setInfo = new JSONObject();
            setInfo.put("id", importColumnVo.getBeanColumn());
            setInfo.put("header", importColumnVo.getShowName());

            // 商品名称需要特殊处理,并将商品名称用select2的js控件进行渲染
            if (StringUtils.equals(importColumnVo.getBeanColumn(), "goodsName"))
            {
                ProductCategoryExample condition = new ProductCategoryExample();
                condition.createCriteria().andCompanyNoEqualTo(importStrategy.getCompanyNo()).andSecondTypeEqualTo(importStrategy.getSecondType());
                List<BaseEntity> archives = sysGoodsCategoryService.selectByExample(condition);
               
                JSONArray smDataArray = new JSONArray();
                for (BaseEntity temp : archives)
                {
                    ProductCategory tempCategory =(ProductCategory) temp;
                    JSONObject jb= new JSONObject();
                    jb.put("id", tempCategory.getId());
                    jb.put("value", tempCategory.getGoodsName());
                    smDataArray.add(jb);
                    // 单独封装一遍值，进行界面的数据校验
                }
                setInfo.put("editor", "richselect");
                setInfo.put("collection", smDataArray);
                setInfo.put("sort", "string");
            }else
            {
                switch (importColumnVo.getParamType())
                {
                case 1:
                    setInfo.put("editor", "text");
                    setInfo.put("numberFormat","111111111");
                    setInfo.put("sort", "int");
                    break;
                case 2:
                    setInfo.put("editor", "text");
                    switch (importColumnVo.getDigits())
                    {
                    case 0:
                        setInfo.put("numberFormat","111111111.111");
                        break;
                    case 1:
                        setInfo.put("numberFormat","111111111.111");
                        break;
                    case 3:
                        setInfo.put("numberFormat","111111111.111");
                        break;
                    default:
                        setInfo.put("numberFormat","111111111.111");
                        break;
                    }
                    setInfo.put("sort", "int");
                    break;
                case 3:
                    // 普通的通用类型使用简单select即可
                    String key = importColumnVo.getBaseClassKey();
                    List<String> nameList = baseTypeService.getNameList(importStrategy.getCompanyNo(), key);
                    nameList.add(0, "");
                    JSONArray ja = new JSONArray();
                    for (String tmp : nameList)
                    {
                        JSONObject jb= new JSONObject();
                        jb.put("id", tmp);
                        jb.put("value", tmp);
                        ja.add(jb);
                    }
                    setInfo.put("editor", "richselect");
                    setInfo.put("collection", ja);
                    setInfo.put("sort", "string");
                    break;
                default:
                    setInfo.put("editor", "text");
                    setInfo.put("sort", "string");
                    break;
                }
            }
            coumnsSetList.add(setInfo);
        }
        vo.setColumnConfig(coumnsSetList);
        return vo;
    }
}
