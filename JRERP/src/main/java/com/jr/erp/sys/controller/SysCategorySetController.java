package com.jr.erp.sys.controller;

import java.util.ArrayList;
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
import com.jr.erp.base.utils.RetPage;
import com.jr.erp.sys.entity.SysCategorySet;
import com.jr.erp.sys.entity.SysCategorySetExample;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.service.ISysCategorySetService;

/**     
 * 类名称：SysCategorySetController    
 * 类描述：通用类型    
 * 创建人：Administrator    
 * 创建时间：2018年9月17日 上午10:19:59    
 * 修改人：Administrator    
 * 修改时间：2018年9月17日 上午10:19:59    
 * 修改备注：    
 * @version  1.0    
 */
@Controller
@RequestMapping("/sysCategorySet")
public class SysCategorySetController
{

    @Autowired
    private ISysCategorySetService sysCategorySetService;

    /**    
     * viewStore(这里用一句话描述这个方法的作用)    
     * 跳转到门店页面       
     * @param @param id
     * @param @param request
     * @param @param model
     * @param @return     
     * @return String
     * @Exception 异常对象
    */
    @RequestMapping(value = "/viewCategorySet.do")
    public String viewCommonType(HttpServletRequest request, Model model)
    {
        return "sys/category/viewCategorySet";
    }

    /**    
     * getStoreListData(这里用一句话描述这个方法的作用)    
     * 获取门店列表       
     * @param @param request
     * @param @return     
     * @return RetPage
     * @Exception 异常对象
    */
    @RequestMapping(value = "/getCategoryData.do")
    @ResponseBody
    public RetPage getStoreListData(BasePageForm pageForm,String categoryType,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        SysCategorySetExample exampale = new SysCategorySetExample();
//        exampale.setPage(pageForm.getPage());
//        exampale.setLimit(pageForm.getLimit());
        exampale.setOrderByClause("id desc");
        exampale.createCriteria().andCompanyNoEqualTo(user.getCompanyNo()).andCategoryTypeEqualTo(categoryType);
        return sysCategorySetService.selectPage(exampale);
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
    @RequestMapping(value = "/saveCategory.do")
    @ResponseBody
    public Ret saveCategory(@RequestBody ArrayList<SysCategorySet> categoryList,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        List<String> existList = sysCategorySetService.saveCategory(user.getCompanyNo(), categoryList);
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
    @RequestMapping(value = "/updateCategory.do")
    @ResponseBody
    public Ret updateCategory(SysCategorySet category,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        try
        {
            category.setCompanyNo(user.getCompanyNo());
            sysCategorySetService.updateCategory(category);
        } catch (Exception e)
        {
            if (e instanceof ServiceAccessException)
            {
                return Ret.error(e.getMessage());
            }
        }
        return Ret.ok("保存成功");
    }
}
