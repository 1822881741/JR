package com.jr.erp.sheet.purchase.controller;

import java.util.List;
import java.util.ListIterator;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.Ret;
import com.jr.erp.sys.entity.SysClassify;
import com.jr.erp.sys.entity.SysClassifyExample;
import com.jr.erp.sys.entity.SysPurchaseColumn;
import com.jr.erp.sys.entity.SysPurchaseColumnExample;
import com.jr.erp.sys.entity.SysPurchaseSecheme;
import com.jr.erp.sys.entity.SysPurchaseSechemeItem;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.service.ISysClassifyService;
import com.jr.erp.sys.service.ISysPurchaseColumnService;
import com.jr.erp.sys.service.ISysPurchaseSechemeService;

@Controller
@RequestMapping("/purchaseSecheme")
public class PurchaseSechemeController {    
    
    @Autowired
    private ISysPurchaseColumnService sysPurchaseColumnService;
    
    @Autowired
    private ISysPurchaseSechemeService sysPurchaseSechemeService;
    
    @Autowired
    private ISysClassifyService sysClassifyService;
    /**    
     * editSecheme(这里用一句话描述这个方法的作用)    
     * 保持方案       
     * @param @param request
     * @param @param model
     * @param @return     
     * @return String
     * @Exception 异常对象
    */
    @RequestMapping(value = "/editSecheme.do")
    public String editSecheme(HttpServletRequest request,Integer sechemeId, Model model)
    {
        SysUser user = ShiroUtils.getSysUser();
        SysPurchaseColumnExample example = new SysPurchaseColumnExample();
        example.createCriteria().andCompanyNoEqualTo(user.getCompanyNo());
        List<BaseEntity> allColumn = sysPurchaseColumnService.selectByExample(example);
        
        if(sechemeId!=null)
        {
            SysPurchaseSecheme secheme = (SysPurchaseSecheme) sysPurchaseSechemeService.getById(sechemeId);
            model.addAttribute("secheme", secheme);
            List<SysPurchaseSechemeItem> itemList = secheme.getItemList();
            if(CollectionUtils.isNotEmpty(itemList))
            {
                for (SysPurchaseSechemeItem sysPurchaseSechemeItem : itemList)
                {
                    ListIterator<BaseEntity> iter =allColumn.listIterator();
                    while (iter.hasNext())
                    {
                        SysPurchaseColumn entity =(SysPurchaseColumn) iter.next();
                        if(StringUtils.equals(entity.getBeanColumn(), sysPurchaseSechemeItem.getBeanColumn()))
                        {
                            iter.remove();
                        }
                    }
                }
            }
        }
        model.addAttribute("allColumn", allColumn);
        
        SysClassifyExample example2 = new SysClassifyExample();
        example2.createCriteria().andCompanyNoEqualTo(user.getCompanyNo()).andStatusEqualTo(1);
        List<BaseEntity> allClassify = sysClassifyService.selectByExample(example);
        model.addAttribute("allClassify", allClassify);
        
        return "bill/secheme/editSecheme";
    }
    
    @RequestMapping(value = "/saveSecheme.do")
    @ResponseBody
    public Ret saveSecheme(@RequestBody SysPurchaseSecheme secheme,HttpServletRequest request,Integer sechemeId, Model model)
    {
        SysUser user = ShiroUtils.getSysUser();
        secheme.setCompanyNo(user.getCompanyNo());
        secheme.setCreateUser(user.getRealName());
        sysPurchaseSechemeService.saveSecheme(secheme);
        return Ret.ok("保存成功");
    }
    
    @RequestMapping(value = "/updateStatus.do")
    @ResponseBody
    public Ret saveSecheme(Integer sechemeId,Integer status,HttpServletRequest request,Model model)
    {
        SysUser user = ShiroUtils.getSysUser();
        SysPurchaseSecheme bean= new SysPurchaseSecheme(); 
        bean.setId(sechemeId);
        bean.setStatus(status);
        sysPurchaseSechemeService.updateByPrimaryKeySelective(bean);
        return Ret.ok("保存成功");
    }
}    