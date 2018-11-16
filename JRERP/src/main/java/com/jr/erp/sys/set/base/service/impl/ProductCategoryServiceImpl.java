package com.jr.erp.sys.set.base.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.sys.element.dto.SysGoodsCategoryDTO;
import com.jr.erp.sys.set.base.entity.ProductCategory;
import com.jr.erp.sys.set.base.entity.ProductCategoryExample;
import com.jr.erp.sys.set.base.service.IProductCategoryService;

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
public class ProductCategoryServiceImpl extends AbstractBaseService<ProductCategory> implements IProductCategoryService
{
 
    @Override
    public void saveCategory(SysGoodsCategoryDTO sysGoodsCategoryDTO)
    {
        if(sysGoodsCategoryDTO!=null)
        {
            String[] goldArray= ArrayUtils.isEmpty(sysGoodsCategoryDTO.getGoldName())?new String[]{""}:sysGoodsCategoryDTO.getGoldName();
            String[] jewelArray= ArrayUtils.isEmpty(sysGoodsCategoryDTO.getJewelName())?new String[]{""}:sysGoodsCategoryDTO.getJewelName();
            String[] categoryArray= ArrayUtils.isEmpty(sysGoodsCategoryDTO.getCategoryName())?new String[]{""}:sysGoodsCategoryDTO.getCategoryName();
            String[] goldPercentArray= ArrayUtils.isEmpty(sysGoodsCategoryDTO.getGoldPercent())?new String[]{""}:sysGoodsCategoryDTO.getGoldPercent();
            if(sysGoodsCategoryDTO.getId() !=null)
            {
                ProductCategory temp = new ProductCategory();
                temp.setId(sysGoodsCategoryDTO.getId());
                temp.setSysCode(sysGoodsCategoryDTO.getSysCode());
                temp.setCompanyNo(sysGoodsCategoryDTO.getCompanyNo());
                temp.setFirstType(sysGoodsCategoryDTO.getFirstType());
                temp.setAssistCode(sysGoodsCategoryDTO.getAssistCode());
                temp.setCanBarter(sysGoodsCategoryDTO.getCanBarter()==null?0:sysGoodsCategoryDTO.getCanBarter());
                temp.setSaleType(sysGoodsCategoryDTO.getSaleType());
                temp.setCompanyNo(sysGoodsCategoryDTO.getCompanyNo());
                temp.setSecondType(sysGoodsCategoryDTO.getSecondType());
                temp.setSecondTypeName(sysGoodsCategoryDTO.getSecondTypeName());
                temp.setProductName(sysGoodsCategoryDTO.getProductName());
                temp.setGoldName(goldArray[0]);
                temp.setJewelName(jewelArray[0]);
                temp.setCategoryName(categoryArray[0]);
                temp.setGoldPercent(goldPercentArray[0]);
                temp.setFirstClassify(sysGoodsCategoryDTO.getFirstClassify());
                temp.setSecondClassify(sysGoodsCategoryDTO.getSecondClassify());
                temp.setThirdClassify(sysGoodsCategoryDTO.getThirdClassify());
                temp.setLabelName(sysGoodsCategoryDTO.getProductName());
                temp.setStatus(sysGoodsCategoryDTO.getStatus());
                temp.setRemark(sysGoodsCategoryDTO.getRemark());
                this.mapper.updateByPrimaryKey(temp);
                return;
            }
            switch (sysGoodsCategoryDTO.getFirstType())
            {
            case "gold":
            case "notGold":
            case "material":
            case "serviceFee":
                List<List<String>> recursiveResult = new ArrayList<List<String>>();
                List<List<String>> dimValue = new ArrayList<List<String>>();
                dimValue.add(Arrays.asList(goldArray));
                dimValue.add(Arrays.asList(jewelArray));
                dimValue.add(Arrays.asList(categoryArray));
                dimValue.add(Arrays.asList(goldPercentArray));
                recursive(dimValue, recursiveResult, 0, new ArrayList<String>());
                for (List<String> list : recursiveResult)
                {
                    ProductCategory temp = new ProductCategory();
                    temp.setFirstType(sysGoodsCategoryDTO.getFirstType());
                    temp.setFirstTypeName(sysGoodsCategoryDTO.getFirstTypeName());
                    temp.setSecondType(sysGoodsCategoryDTO.getSecondType());
                    temp.setSecondTypeName(sysGoodsCategoryDTO.getSecondTypeName());
                    temp.setAssistCode(sysGoodsCategoryDTO.getAssistCode());
                    temp.setCanBarter(sysGoodsCategoryDTO.getCanBarter()==null?0:sysGoodsCategoryDTO.getCanBarter());
                    temp.setSaleType(sysGoodsCategoryDTO.getSaleType());
                    temp.setCompanyNo(sysGoodsCategoryDTO.getCompanyNo());
                    temp.setProductName(list.get(0) + list.get(1) + list.get(2));
                    temp.setGoldName(list.get(0));
                    temp.setJewelName(list.get(1));
                    temp.setCategoryName(list.get(2));
                    temp.setGoldPercent(list.get(3));
                    temp.setFirstClassify(sysGoodsCategoryDTO.getFirstClassify());
                    temp.setSecondClassify(sysGoodsCategoryDTO.getSecondClassify());
                    temp.setThirdClassify(sysGoodsCategoryDTO.getThirdClassify());
                    temp.setLabelName(temp.getProductName());
                    temp.setStatus(sysGoodsCategoryDTO.getStatus());
                    this.insert(temp);
                }
                break;
            default:
                break;
            }
            
        }
        
//        this.insert(counter);
    }
    /**    
     * recursive(这里用一句话描述这个方法的作用)    
     * 获取笛卡尔积       
     * @param @param dimValue
     * @param @param result
     * @param @param layer
     * @param @param curList     
     * @return void
     * @Exception 异常对象
    */
    private static void recursive(List<List<String>> dimValue, List<List<String>> result, int layer, List<String> curList)
    {
        if (layer < dimValue.size() - 1)
        {
            if (dimValue.get(layer).size() == 0)
            {
                recursive(dimValue, result, layer + 1, curList);
            } else
            {
                for (int i = 0; i < dimValue.get(layer).size(); i++)
                {
                    List<String> list = new ArrayList<String>(curList);
                    list.add(dimValue.get(layer).get(i));
                    recursive(dimValue, result, layer + 1, list);
                }
            }
        } else if (layer == dimValue.size() - 1)
        {
            if (dimValue.get(layer).size() == 0)
            {
                result.add(curList);
            } else
            {
                for (int i = 0; i < dimValue.get(layer).size(); i++)
                {
                    List<String> list = new ArrayList<String>(curList);
                    list.add(dimValue.get(layer).get(i));
                    result.add(list);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        List<String> list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("2");
        List<String> list2 = new ArrayList<String>();
        list2.add("a");
        list2.add("b");
        List<String> list3 = new ArrayList<String>();
        list3.add("3");
        list3.add("4");
        list3.add("5");
        List<String> list4 = new ArrayList<String>();
        list4.add("c");
        list4.add("d");
        list4.add("e");
        List<List<String>> dimValue = new ArrayList<List<String>>();
        dimValue.add(list1);
        dimValue.add(list2);
        dimValue.add(list3);
        dimValue.add(list4);
        List<List<String>> recursiveResult = new ArrayList<List<String>>(); 
        recursive(dimValue, recursiveResult, 0, new ArrayList<String>());
        System.out.println("递归实现笛卡尔乘积: 共 " + recursiveResult.size() + " 个结果");
        for (List<String> list : recursiveResult)
        {
            for (String string : list)
            {
                System.out.print(string + " ");
            }
            System.out.println();
        }

    }
    @Override
    public void deleteGoodsCategory(String companyNo, Integer[] ids)
    {
        ProductCategoryExample example = new ProductCategoryExample();
        example.createCriteria().andCompanyNoEqualTo(companyNo).andIdIn(Arrays.asList(ids));
        this.deleteByExample(example);
    }
}
