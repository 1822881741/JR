package com.jr.erp.sys.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.BasePageForm;
import com.jr.erp.base.utils.Ret;
import com.jr.erp.base.utils.RetPage;
import com.jr.erp.sys.entity.SysGoodsCategory;
import com.jr.erp.sys.entity.SysGoodsCategoryExample;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.service.ISysGoodsCategoryService;

/**     
 * 类名称：SysCategoryController    
 * 类描述：商品大类，中类设置    
 * 创建人：Administrator    
 * 创建时间：2018年9月19日 下午6:12:46    
 * 修改人：Administrator    
 * 修改时间：2018年9月19日 下午6:12:46
 * 修改备注：    
 * @version  1.0    
 */
@Controller
@RequestMapping("/sysGoodsCategory")
public class SysGoodsCategoryController
{

    @Autowired
    private ISysGoodsCategoryService sysGoodsCategoryService;

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
    @RequestMapping(value = "/viewGoodsCategory.do")
    public String viewGoodsCategory(HttpServletRequest request, Model model)
    {
        return "sys/category/viewGoodsCategory";
    }

    /**    
     * getStoreListData(这里用一句话描述这个方法的作用)    
     * 获取门店列表       
     * @param @param request
     * @param @return     
     * @return RetPage
     * @Exception 异常对象
    */
    @RequestMapping(value = "/getGoodsCategoryData.do")
    @ResponseBody
    public RetPage getGoodsCategoryData(BasePageForm pageForm,String firstTypePrefix,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        SysGoodsCategoryExample exampale = new SysGoodsCategoryExample();
        exampale.setOrderByClause("id desc");
        exampale.createCriteria().andCompanyNoEqualTo(user.getCompanyNo()).andFirstTypePrefixEqualTo(firstTypePrefix);
        return sysGoodsCategoryService.selectPage(exampale);
    }
    
    @RequestMapping(value = "/addGoodsCategory.do")
    public String addGoodsCategory(String firstTypePrefix,HttpServletRequest request,Model model)
    {
        model.addAttribute("firstTypePrefix",firstTypePrefix);
        return "sys/category/addGoodsCategory"+firstTypePrefix;
    }
    /**    
     * saveGoodsCategory(这里用一句话描述这个方法的作用)    
     * 保存商品分类
     * @param @param store
     * @param @param request
     * @param @return     
     * @return Ret
     * @Exception 异常对象
    */
    @RequestMapping(value = "/saveGoodsCategory.do")
    @ResponseBody
    public Ret saveGoodsCategory(SysGoodsCategory sysGoodsCategory,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        sysGoodsCategory.setCompanyNo(user.getCompanyNo());
        sysGoodsCategoryService.saveCategory(sysGoodsCategory);
        return Ret.ok("保存成功");
    }
//    
//    /**    
//     * updateCounter(这里用一句话描述这个方法的作用)    
//     * 保存门店       
//     * @param @param store
//     * @param @param request
//     * @param @return     
//     * @return Ret
//     * @Exception 异常对象
//    */
//    @RequestMapping(value = "/updateCategory.do")
//    @ResponseBody
//    public Ret updateCategory(SysCategorySet category,HttpServletRequest request)
//    {
//        SysUser user = ShiroUtils.getSysUser();
//        try
//        {
//            category.setCompanyNo(user.getCompanyNo());
//            sysCategorySetService.updateCategory(category);
//        } catch (Exception e)
//        {
//            if (e instanceof ServiceAccessException)
//            {
//                return Ret.error(e.getMessage());
//            }
//        }
//        return Ret.ok("保存成功");
//    }
}
