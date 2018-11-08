package com.jr.erp.sys.set.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jr.erp.base.exception.ServiceAccessException;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.BasePageForm;
import com.jr.erp.base.utils.Ret;
import com.jr.erp.base.utils.RetJqGridPage;
import com.jr.erp.base.utils.RetPage;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.set.entity.GoodsGroup;
import com.jr.erp.sys.set.entity.GoodsGroupExample;
import com.jr.erp.sys.set.service.IGoodsGroupService;

/**     
 * 类名称：GoodsGroupController    
 * 类描述： 商品分组   
 * 创建人：admin    
 * 创建时间：2018年11月8日 上午11:36:26    
 * 修改人：admin    
 * 修改时间：2018年11月8日 上午11:36:26    
 * 修改备注：    
 * @version  1.0    
 */
@Controller
@RequestMapping("/goodsGroup")
public class GoodsGroupController
{

    @Autowired
    private IGoodsGroupService goodsGroupService;
    
    /**    
     * viewClassify(这里用一句话描述这个方法的作用)    
     * 查看商品分类       
     * @param @param request
     * @param @param model
     * @param @return     
     * @return String
     * @Exception 异常对象
    */
    @RequestMapping(value = "/viewGoodsGroup.do")
    public String viewGoodsGroup(HttpServletRequest request, Model model)
    {
        return "sys/goodsGroup/viewGoodsGroup";
    }
    
    /**    
     * addOrUpdateClassify(这里用一句话描述这个方法的作用)    
     * 新增修改       
     * @param @param firstType
     * @param @param id
     * @param @param request
     * @param @param model
     * @param @return     
     * @return String
     * @Exception 异常对象
    */
    @RequestMapping(value = "/editGoodsGroup.do")
    public String editGoodsGroup(String firstType,Integer id,HttpServletRequest request, Model model)
    {
        SysUser user = ShiroUtils.getSysUser();
        GoodsGroup classify = new GoodsGroup();
        if(id!=null)
        {
            classify = (GoodsGroup) goodsGroupService.selectByPrimaryKey(id);
        }else
        {
            classify.setStatus(1);
            classify.setFirstType(firstType);
            switch (firstType)
            {
            case "gold":
                classify.setFirstTypeName("素金");
                break;
            case "notGold":
                classify.setFirstTypeName("非素");
                break;
            case "material":
                classify.setFirstTypeName("旧料");
                break;
            case "serviceFee":
                classify.setFirstTypeName("服务费");
                break;
            default:
                break;
            }
        }
        model.addAttribute("classify",classify);
        return "sys/goodsGroup/editGoodsGroup";
    }
    
    /**    
     * getClassifyData(这里用一句话描述这个方法的作用)    
     * 获取分页数据       
     * @param @param pageForm
     * @param @param firstType
     * @param @param request
     * @param @return     
     * @return RetJqGridPage
     * @Exception 异常对象
    */
    @RequestMapping(value = "/getGoodsGroupData.do")
    @ResponseBody
    public RetJqGridPage getGoodsGroupData(BasePageForm pageForm,String firstType,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        GoodsGroupExample exampale = new GoodsGroupExample();
        exampale.setOrderByClause("id");
        exampale.createCriteria().andCompanyNoEqualTo(user.getCompanyNo()).andFirstTypeEqualTo(firstType);
        RetPage page = goodsGroupService.selectPage(exampale);
        return RetJqGridPage.ok(page.getCount(), page.getData());
    }
    
    /**    
     * saveClassify(这里用一句话描述这个方法的作用)    
     * 保存       
     * @param @param GoodsGroup
     * @param @param request
     * @param @return     
     * @return Ret
     * @Exception 异常对象
    */
    @RequestMapping(value = "/saveGoodsGroup.do")
    @ResponseBody
    public Ret saveGoodsGroup(GoodsGroup goodsGroup,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        goodsGroup.setCompanyNo(user.getCompanyNo());
        goodsGroupService.saveClassify(goodsGroup);
        return Ret.ok("保存成功");
    }
    
    /**    
     * deleteClassify(这里用一句话描述这个方法的作用)    
     * 删除分类       
     * @param @param ids
     * @param @param request
     * @param @return     
     * @return Ret
     * @Exception 异常对象
    */
    @RequestMapping(value = "/deleteGoodsGroup.do")
    @ResponseBody
    public Ret deleteGoodsGroup(Integer[] ids,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        try
        {
            GoodsGroupExample exampale = new GoodsGroupExample();
            exampale.createCriteria().andCompanyNoEqualTo(user.getCompanyNo()).andIsSysDefNotEqualTo(1).andIdIn(Arrays.asList(ids));
            goodsGroupService.deleteByExample(exampale);
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
