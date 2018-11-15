package com.jr.erp.sys.element.controller;

import java.util.ArrayList;
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
import com.jr.erp.sys.set.base.entity.ProductGroup;
import com.jr.erp.sys.set.base.service.IBaseTypeService;
import com.jr.erp.sys.set.base.service.IProductGroupService;

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
    
    @Autowired
    private IBaseTypeService baseTypeService;
    
    @Autowired
    private IProductGroupService goodsGroupService;
    
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
                    areaExample.createCriteria().andCompanyNoEqualTo(user.getCompanyNo()).andAreaTypeEqualTo(1).andAreaCodeLike(user.getAreaCode() + "%");
                    List<BaseEntity> areaList = sysAreaInfoService.selectByExample(areaExample);
                    data.put("areaInfo", areaList);
                    break;
                case "storeInfo":
                    SysStoreExample storeExample = new SysStoreExample();
                    storeExample.createCriteria().andAreaCodeLike(user.getAreaCode() + "%");
                    List<BaseEntity> storeList = sysAreaInfoService.selectByExample(storeExample);
                    data.put("storeInfo", storeList);
                    break;
                case "secondType":
                    Map<String,List<ProductGroup>> secondTypeMap = goodsGroupService.getInUseClassify(user.getCompanyNo());
                    data.put("secondType", secondTypeMap);
                    break;   
                case "goldName":
                    List<String> goldName = baseTypeService.getNameList(user.getCompanyNo(),element);
                    data.put("goldName", goldName);
                    break;   
                case "jewelName":
                    List<String> jewelName= baseTypeService.getNameList(user.getCompanyNo(),element);
                    data.put("jewelName", jewelName);
                    break;  
                case "categoryName":
                    List<String> categoryName= baseTypeService.getNameList(user.getCompanyNo(),element);
                    data.put("categoryName", categoryName);
                    break;  
                case "goldPercent":
                    List<String> goldPercent= baseTypeService.getNameList(user.getCompanyNo(),element);
                    data.put("goldPercent", goldPercent);
                    break;  
                case "firstClassify":
                    List<String> firstClassify= baseTypeService.getNameList(user.getCompanyNo(),element);
                    data.put("firstClassify", firstClassify);
                    break;  
                case "secondClassify":
                    List<String> secondClassify= baseTypeService.getNameList(user.getCompanyNo(),element);
                    data.put("secondClassify", secondClassify);
                    break; 
                case "thirdClassify":
                    List<String> thirdClassify= baseTypeService.getNameList(user.getCompanyNo(),element);
                    data.put("thirdClassify", thirdClassify);
                    break; 
                case "labelTpl":
                    List<String> labelTpl= new ArrayList<String>();
                    labelTpl.add("label1");
                    labelTpl.add("label2");
                    data.put("labelTpl", labelTpl);
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
