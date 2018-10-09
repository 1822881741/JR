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
                case "secondType":
                    Map<String,List<String>> secondTypeMap = new HashMap<String,List<String>>(); 
                    List<String> gold= new ArrayList<String>();
                    gold.add("素金");
                    gold.add("PT950");
                    secondTypeMap.put("gold", gold);
                    
                    
                    List<String> notGold= new ArrayList<String>();
                    notGold.add("K金");
                    notGold.add("镶嵌");
                    notGold.add("玉器");
                    secondTypeMap.put("notGold", notGold);
                    
                    List<String> materia= new ArrayList<String>();
                    materia.add("旧黄");
                    materia.add("旧K");
                    secondTypeMap.put("material", materia);
                    
                    List<String> serviceFee= new ArrayList<String>();
                    serviceFee.add("手工费");
                    serviceFee.add("这个费");
                    secondTypeMap.put("serviceFee", gold);
                    
                    data.put("secondType", secondTypeMap);
                    break;   
                case "goldName":
                    List<String> goldName= new ArrayList<String>();
                    goldName.add("千足金");
                    goldName.add("18K金");
                    data.put("goldName", goldName);
                    break;   
                case "jewelName":
                    List<String> jewelName= new ArrayList<String>();
                    jewelName.add("钻石");
                    jewelName.add("猫眼石");
                    data.put("jewelName", jewelName);
                    break;  
                case "categoryName":
                    List<String> categoryName= new ArrayList<String>();
                    categoryName.add("戒指");
                    categoryName.add("手镯");
                    data.put("categoryName", categoryName);
                    break;  
                case "goldPercent":
                    List<String> goldPercent= new ArrayList<String>();
                    goldPercent.add("99%");
                    goldPercent.add("999%");
                    data.put("goldPercent", goldPercent);
                    break;  
                case "firstClassify":
                    List<String> firstClassify= new ArrayList<String>();
                    firstClassify.add("大类1");
                    firstClassify.add("大类2");
                    data.put("firstClassify", firstClassify);
                    break;  
                case "secondClassify":
                    List<String> secondClassify= new ArrayList<String>();
                    secondClassify.add("中类1");
                    secondClassify.add("中类2");
                    data.put("secondClassify", secondClassify);
                    break; 
                case "thirdClassify":
                    List<String> thirdClassify= new ArrayList<String>();
                    thirdClassify.add("小类1");
                    thirdClassify.add("小类2");
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
