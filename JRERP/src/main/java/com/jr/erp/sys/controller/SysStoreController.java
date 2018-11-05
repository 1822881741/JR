package com.jr.erp.sys.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.BasePageForm;
import com.jr.erp.base.utils.Ret;
import com.jr.erp.base.utils.RetJqGridPage;
import com.jr.erp.base.utils.RetPage;
import com.jr.erp.sys.entity.SysStore;
import com.jr.erp.sys.entity.SysStoreExample;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.service.ISysStoreService;

/**     
 * 类名称：SysStoreController    
 * 类描述：  门店的controller  
 * 创建人：Administrator    
 * 创建时间：2018年9月7日 下午8:18:08    
 * 修改人：Administrator    
 * 修改时间：2018年9月7日 下午8:18:08    
 * 修改备注：    
 * @version  1.0    
 */
@Controller
@RequestMapping("/sysStore")
public class SysStoreController
{

    @Autowired
    private ISysStoreService sysStoreService;

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
    @RequestMapping(value = "/viewStore.do")
    public String viewStore(Integer id, HttpServletRequest request, Model model)
    {
        return "sys/store/viewStore";
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
    @RequestMapping(value="editStoreInfo.do")
    public String editStoreInfo(Integer id,HttpServletRequest request, Model model)
    {
        model.addAttribute("id",id);
        return  "sys/store/editStoreInfo";
    }
    /**    
     * getStoreListData(这里用一句话描述这个方法的作用)    
     * 获取门店列表       
     * @param @param request
     * @param @return     
     * @return RetPage
     * @Exception 异常对象
    */
    @RequestMapping(value = "/getStoreListData.do")
    @ResponseBody
    public RetJqGridPage getStoreListData(BasePageForm pageForm,HttpServletRequest request)
    {
        SysStoreExample exampale = new SysStoreExample();
        exampale.setPage(pageForm.getPage());
        exampale.setLimit(pageForm.getLimit());
        RetPage page = sysStoreService.selectPage(exampale);
        return RetJqGridPage.ok(page.getCount(), page.getData());
    }

    /**    
     * getStoreInfoData(这里用一句话描述这个方法的作用)
     * 获取门店信息       
     * @param @param id
     * @param @param request
     * @param @param model
     * @param @return     
     * @return Ret
     * @Exception 异常对象
    */
    @RequestMapping(value="getStoreInfoData.do")
    @ResponseBody
    public Ret getStoreInfoData(@RequestParam(required = true) Integer id, HttpServletRequest request, Model model)
    {
        SysStore store = (SysStore) sysStoreService.selectByPrimaryKey(id);
        return Ret.ok("保存成功", store);
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
    @RequestMapping(value = "/saveStore.do")
    @ResponseBody
    public Ret saveStore(SysStore store,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        store.setCompanyNo(user.getCompanyNo());
        sysStoreService.saveStore(store);
        return Ret.ok("保存成功");
    }
}
