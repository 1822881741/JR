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
import com.jr.erp.sys.entity.SysCounter;
import com.jr.erp.sys.entity.SysCounterExample;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.service.ISysCounterService;

/**     
 * 类名称：SysCounterController    
 * 类描述：  柜台的controller  
 * 创建人：Administrator    
 * 创建时间：2018年9月7日 下午8:18:08    
 * 修改人：Administrator    
 * 修改时间：2018年9月7日 下午8:18:08    
 * 修改备注：    
 * @version  1.0    
 */
@Controller
@RequestMapping("/sysCounter")
public class SysCounterController
{

    @Autowired
    private ISysCounterService sysCounterService;

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
    @RequestMapping(value = "/viewCounter.do")
    public String viewStore(HttpServletRequest request, Model model)
    {
        return "sys/counter/viewCounter";
    }

    /**    
     * getStoreListData(这里用一句话描述这个方法的作用)    
     * 获取门店列表       
     * @param @param request
     * @param @return     
     * @return RetPage
     * @Exception 异常对象
    */
    @RequestMapping(value = "/getCounterListData.do")
    @ResponseBody
    public RetPage getStoreListData(BasePageForm pageForm,String areaCode,HttpServletRequest request)
    {
        SysUser user  =ShiroUtils.getSysUser();
        SysCounterExample exampale = new SysCounterExample();
        exampale.setPage(pageForm.getPage());
        exampale.setLimit(pageForm.getLimit());
        exampale.createCriteria().andCompanyNoEqualTo(user.getCompanyNo()).andAreaCodeLike(areaCode+"%");
        return sysCounterService.selectPage(exampale);
    }
    
    /**    
     * editStoreInfo(这里用一句话描述这个方法的作用)    
     * 跳转到修改门店界面       
     * @param @param id
     * @param @param request
     * @param @param model
     * @param @return     
     * @return String
     * @Exception 异常对象
    */
    @RequestMapping(value="addCounterInfo.do")
    public String editCounterInfo(Integer storeId,HttpServletRequest request, Model model)
    {
        model.addAttribute("storeId",storeId);
        return  "sys/counter/editCounterInfo";
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
    @RequestMapping(value = "/saveCounter.do")
    @ResponseBody
    public Ret saveCounter(SysCounter store,Integer storeId,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        store.setCompanyNo(user.getCompanyNo());
        sysCounterService.saveCounter(store,storeId);
        return Ret.ok("保存成功");
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
    @RequestMapping(value = "/updateCounter.do")
    @ResponseBody
    public Ret updateCounter(SysCounter store,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        store.setCompanyNo(user.getCompanyNo());
        sysCounterService.updateCounter(store);
        return Ret.ok("保存成功");
    }
}
