package com.jr.erp.sys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.utils.RetPage;
import com.jr.erp.sys.entity.SysAreaInfoExample;
import com.jr.erp.sys.entity.SysStore;
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
        return "sys/viewStore";
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
        return  "sys/editStoreInfo";
    }
    /**    
     * getStoreList(这里用一句话描述这个方法的作用)    
     * 获取门店列表       
     * @param @param request
     * @param @return     
     * @return RetPage
     * @Exception 异常对象
    */
    @RequestMapping(value = "/getStoreList.do")
    @ResponseBody
    public RetPage getStoreList(HttpServletRequest request)
    {
        SysAreaInfoExample exampale = new SysAreaInfoExample();
        List<BaseEntity> listData = sysStoreService.selectByExample(exampale);
        return RetPage.ok(listData.size(), listData);
    }

    @RequestMapping(value = "/saveStore.do")
    @ResponseBody
    public String main()
    {
        SysStore store = new SysStore();
        sysStoreService.insert(store);
        return "main";
    }
}
