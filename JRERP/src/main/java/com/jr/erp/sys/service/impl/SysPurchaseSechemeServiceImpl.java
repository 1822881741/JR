package com.jr.erp.sys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.service.impl.IFileUploadService;
import com.jr.erp.sys.entity.SysGoodsCategory;
import com.jr.erp.sys.entity.SysGoodsCategoryExample;
import com.jr.erp.sys.entity.SysPurchaseSecheme;
import com.jr.erp.sys.entity.SysPurchaseSechemeItem;
import com.jr.erp.sys.entity.SysPurchaseSechemeItemExample;
import com.jr.erp.sys.service.ISysCategorySetService;
import com.jr.erp.sys.service.ISysGoodsCategoryService;
import com.jr.erp.sys.service.ISysPurchaseSechemeItemService;
import com.jr.erp.sys.service.ISysPurchaseSechemeService;
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
    public PurchaseColumnVo getPurchaseColumnConfig(Integer sechemeId)
    {
        PurchaseColumnVo vo = new PurchaseColumnVo();
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
               
                List<String> validateArray = new ArrayList<String>();
                
                JSONArray smDataArray = new JSONArray();
                for (BaseEntity temp : archives)
                {
                    SysGoodsCategory tempCategory =(SysGoodsCategory) temp;
                    // 拼装下拉框中的数据下拉框中值和内容的对应关系
                    JSONObject smData = new JSONObject();
                    smData.put("categoryId", tempCategory.getId());
                    smData.put("goodsName", tempCategory.getGoodsName());
                    smData.put("goldName", tempCategory.getGoldName());
                    smData.put("jewelName", tempCategory.getJewelName());
                    smData.put("categoryName", tempCategory.getCategoryName());
                    smData.put("goldPercent", tempCategory.getGoldPercent());
                    smDataArray.add(smData);
                    // 单独封装一遍值，进行界面的数据校验
                    validateArray.add(tempCategory.getGoodsName());
                }
                setInfo.put("type", "handsontable");
                JSONObject handConfig = new JSONObject();
                handConfig.put("data", smDataArray);
                handConfig.put("width", "500px");
                handConfig.put("rowHeaders", true);
                handConfig.put("multiColumnSorting", true);
                handConfig.put("data", smDataArray);
                
                JSONArray columns = new JSONArray();
                JSONObject j1 = new JSONObject();
                j1.put("title", "名称");
                j1.put("data", "goodsName");
                j1.put("width", "200px");
                
                JSONObject j2 = new JSONObject();
                j2.put("title", "金料");
                j2.put("data", "goldName");
                j2.put("width", "150px");
                
                JSONObject j3 = new JSONObject();
                j3.put("title", "石料");
                j3.put("data", "jewelName");
                j3.put("width", "150px");
                
                JSONObject j4 = new JSONObject();
                j4.put("title", "品类");
                j4.put("data", "categoryName");
                j4.put("width", "150px");
                
                JSONObject j5 = new JSONObject();
                j5.put("title", "成色");
                j5.put("data", "goldPercent");
                j5.put("width", "150px");
                columns.add(j1);
                columns.add(j2);
                columns.add(j3);
                columns.add(j4);
                columns.add(j5);
                
                handConfig.put("columns", columns);
                handConfig.put("manualColumnResize", true);
                setInfo.put("handsontable",handConfig);
            } else if (StringUtils.equals(importColumnVo.getBeanColumn(), "num"))
            {
                setInfo.put("type","numeric");
                setInfo.put("validator", "integerValidator");
            } else
            {
                switch (importColumnVo.getParamType())
                {
                case 1:
                    setInfo.put("type", "numeric");
                    setInfo.put("validator", "integerValidator");
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
        vo.setColumnConfig(coumnsSetList);
        return vo;
    }
}
