package com.jr.erp.sys.set.base.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jr.erp.base.exception.ServiceAccessException;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.BasePageForm;
import com.jr.erp.base.utils.Ret;
import com.jr.erp.base.utils.RetJqGridPage;
import com.jr.erp.base.utils.RetPage;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.set.base.entity.BaseType;
import com.jr.erp.sys.set.base.entity.BaseTypeExample;
import com.jr.erp.sys.set.base.entity.GoodsGroup;
import com.jr.erp.sys.set.base.entity.GoodsGroupExample;
import com.jr.erp.sys.set.base.service.IBaseTypeService;
import com.jr.erp.sys.set.base.service.IGoodsGroupService;

/**     
 * 类名称：BaseTypeController    
 * 类描述：通用类型    
 * 创建人：Administrator    
 * 创建时间：2018年9月17日 上午10:19:59    
 * 修改人：Administrator    
 * 修改时间：2018年9月17日 上午10:19:59    
 * 修改备注：    
 * @version  1.0    
 */
@Controller
@RequestMapping("/baseType")
public class BaseTypeController
{

    @Autowired
    private IBaseTypeService baseTypeService;

    
    /**    
     * viewBaseType(这里用一句话描述这个方法的作用)    
     * 跳转到基础类型页面       
     * @param @param request
     * @param @param model
     * @param @return     
     * @return String
     * @Exception 异常对象
    */
    @RequestMapping(value = "/viewBaseType.do")
    public String viewBaseType(HttpServletRequest request, Model model)
    {
        return "sys/baseType/viewBaseType";
    }
    
    /**    
     * getStoreListData(这里用一句话描述这个方法的作用)    
     * 获取门店列表       
     * @param @param request
     * @param @return     
     * @return RetPage
     * @Exception 异常对象
    */
    @RequestMapping(value = "/getBaseTypeData.do")
    @ResponseBody
    public RetJqGridPage getBaseTypeData(BasePageForm pageForm,String typeName,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        BaseTypeExample exampale = new BaseTypeExample();
        exampale.setOrderByClause("id desc");
        exampale.createCriteria().andCompanyNoEqualTo(user.getCompanyNo()).andTypeNameEqualTo(typeName);
        RetPage page = baseTypeService.selectPage(exampale);
        return RetJqGridPage.ok(page.getCount(), page.getData());
    }
    
    /**    
     * saveStore(这里用一句话描述这个方法的作用)    
     * 保存门店       
     * @param @param store
     * @param @param request
     * @param @return     
     * @return Ret
     * @Exception 异常对象
    */
    @RequestMapping(value = "/saveBaseType.do")
    @ResponseBody
    public Ret saveBaseType(@RequestBody ArrayList<BaseType> categoryList,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        List<String> existList = baseTypeService.saveBaseType(user.getCompanyNo(), categoryList);
        if (CollectionUtils.isNotEmpty(existList))
        {
            return Ret.warn("保存成功。", existList);
        } else
        {
            return Ret.ok("保存成功");
        }
    }
    
    /**    
     * updateCounter(这里用一句话描述这个方法的作用)    
     * 保存门店       
     * @param @param store
     * @param @param request
     * @param @return     
     * @return Ret
     * @Exception 异常对象
    */
    @RequestMapping(value = "/updateBaseType.do")
    @ResponseBody
    public Ret updateBaseType(BaseType category,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        try
        {
            category.setCompanyNo(user.getCompanyNo());
            baseTypeService.updateBaseType(category);
        } catch (Exception e)
        {
            if (e instanceof ServiceAccessException)
            {
                return Ret.error(e.getMessage());
            }
            e.printStackTrace();
        }
        return Ret.ok("保存成功");
    }
    
    /**    
     * deleteCategory(这里用一句话描述这个方法的作用)    
     * 删除分类
     * @param @param ids
     * @param @return     
     * @return Ret
     * @Exception 异常对象
    */
    @RequestMapping(value = "/deleteBaseType.do")
    @ResponseBody
    public Ret deleteBaseType(Integer[] ids,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        try
        {
            BaseTypeExample exampale = new BaseTypeExample();
            exampale.createCriteria().andCompanyNoEqualTo(user.getCompanyNo()).andIdIn(Arrays.asList(ids));
            baseTypeService.deleteByExample(exampale);
        } catch (Exception e)
        {
            if (e instanceof ServiceAccessException)
            {
                return Ret.error(e.getMessage());
            }
            e.printStackTrace();
        }
        return Ret.ok("删除成功");
    }
}
