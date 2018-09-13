package com.jr.erp.sys.element.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.Ret;
import com.jr.erp.sys.entity.SysAreaInfoExample;
import com.jr.erp.sys.entity.SysStoreExample;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.service.ISysAreaInfoService;
import com.jr.erp.sys.service.ISysCounterService;
import com.jr.erp.sys.service.ISysStoreService;

/**     
 * 类名称：SysElementController    
 * 类描述：获取系统的信息列表   ,给界面初始化使用
 * 创建人：Administrator    
 * 创建时间：2018年9月12日 下午3:53:16    
 * 修改人：Administrator    
 * 修改时间：2018年9月12日 下午3:53:16    
 * 修改备注：    
 * @version  1.0    
 */
@Controller
@RequestMapping("/sysElement")
public class SysElementController
{

    @Autowired
    private ISysAreaInfoService sysAreaInfoService;
    
    @Autowired
    private ISysStoreService sysStoreService;
    
    @Autowired
    private ISysCounterService sysCounterService;
    
    @RequestMapping(value="/getElements.do")
    @ResponseBody
    public Ret getElements(String[] elements,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        if (elements != null && elements.length > 0)
        {
            Map<String, Object> data = new HashMap<String, Object>();
            for (String element : elements)
            {
                switch (element)
                {
                case "areaInfo":
                    SysAreaInfoExample areaExample = new SysAreaInfoExample();
                    areaExample.createCriteria().andCompanyNoEqualTo(user.getCompanyNo()).andAreaTypeEqualTo(1)
                            .andAreaCodeLike(user.getAreaCode() + "%");
                    List<BaseEntity> areaList = sysAreaInfoService.selectByExample(areaExample);
                    data.put("areaInfo", areaList);
                    break;
                case "storeInfo":
                    SysStoreExample storeExample = new SysStoreExample();
                    storeExample.createCriteria().andAreaCodeLike(user.getAreaCode() + "%");
                    List<BaseEntity> storeList = sysAreaInfoService.selectByExample(storeExample);
                    data.put("storeInfo", storeList);
                    break;
                default:
                    break;
                }
            }
            return Ret.ok("", data);
        }

        return Ret.ok("");
    }
}
