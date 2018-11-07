package com.jr.erp.sys.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.Ret;
import com.jr.erp.base.utils.RetJqGridPage;
import com.jr.erp.sys.entity.SysAreaInfoExample;
import com.jr.erp.sys.entity.SysCounter;
import com.jr.erp.sys.entity.SysCounterExample;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.service.ISysAreaInfoService;
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
    
    @Autowired
    private ISysAreaInfoService sysAreaService;

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
        SysAreaInfoExample example = new SysAreaInfoExample();
        example.createCriteria().andCompanyNoEqualTo(ShiroUtils.getCompanyNo()).andAreaCodeLike(ShiroUtils.getUserAreaCode() +"%").andAreaTypeIn(Arrays.asList(new Integer[]{0,1,2}));
        example.setOrderByClause(" areaCode ");
        List<BaseEntity> areaList=  sysAreaService.selectByExample(example);
        model.addAttribute("areaList", areaList);
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
    public RetJqGridPage getStoreListData(String pAreaCode,String areaCode,HttpServletRequest request)
    {
        if(StringUtils.isNotEmpty(pAreaCode))
        {
            SysCounterExample exampale = new SysCounterExample();
            exampale.createCriteria().andCompanyNoEqualTo(ShiroUtils.getCompanyNo()).andAreaCodeLike(pAreaCode +"___");
            List<BaseEntity> counterList = sysCounterService.selectByExample(exampale);
            return RetJqGridPage.ok(new Long(counterList.size()), counterList);
        }
        else
        {
            return RetJqGridPage.ok(0L, null);
        }
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
    @RequestMapping(value="editCounter.do")
    public String editCounter(Integer storeId,String  pAreaCode,HttpServletRequest request, Model model)
    {
        SysCounter counter=null;
        if(storeId!=null)
        {
            counter = (SysCounter)sysCounterService.selectByPrimaryKey(storeId);
        }else
        {
            counter = new SysCounter();
            counter.setCounterType(0);
            counter.setStatus(1);
        }
        model.addAttribute("counter",counter);
        model.addAttribute("pAreaCode",pAreaCode);
        return  "sys/counter/editCounter";
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
    public Ret saveCounter(SysCounter store,String pAreaCode,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        store.setCompanyNo(user.getCompanyNo());
        sysCounterService.saveCounter(store,pAreaCode);
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
