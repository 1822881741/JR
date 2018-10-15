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
import com.jr.erp.base.utils.RetJqGridPage;
import com.jr.erp.base.utils.RetPage;
import com.jr.erp.sys.element.dto.SysGoodsCategoryDTO;
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
    public RetJqGridPage getGoodsCategoryData(BasePageForm pageForm,String firstType,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        pageForm.setPage(0);
        pageForm.setLimit(10000);
        SysGoodsCategoryExample exampale = new SysGoodsCategoryExample();
        exampale.setOrderByClause("id");
        exampale.createCriteria().andCompanyNoEqualTo(user.getCompanyNo()).andFirstTypeEqualTo(firstType);
        RetPage page = sysGoodsCategoryService.selectPage(exampale);
        return RetJqGridPage.ok(page.getCount(), page.getData());
    }
    
    @RequestMapping(value = "/editGoodsCategory.do")
    public String editGoodsCategory(Integer id,HttpServletRequest request,Model model)
    {
        SysGoodsCategory catetory = (SysGoodsCategory) sysGoodsCategoryService.selectByPrimaryKey(id);
        model.addAttribute("catetory",catetory);
        return "sys/category/addGoodsCategory";
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
    public Ret saveGoodsCategory(SysGoodsCategoryDTO sysGoodsCategoryDTO,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        sysGoodsCategoryDTO.setCompanyNo(user.getCompanyNo());
        sysGoodsCategoryService.saveCategory(sysGoodsCategoryDTO);
        return Ret.ok("保存成功");
    }
    
    /**    
     * deleteCategory(这里用一句话描述这个方法的作用)    
     * 删除分类列表       
     * @param @param ids
     * @param @param request
     * @param @return     
     * @return Ret
     * @Exception 异常对象
    */
    @RequestMapping(value = "/deleteCategory.do")
    @ResponseBody
    public Ret deleteCategory(Integer[] ids,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        sysGoodsCategoryService.deleteGoodsCategory(user.getCompanyNo(),ids);
        return Ret.ok("保存成功");
    }
}
