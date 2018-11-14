package com.jr.erp.sys.set.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.Ret;
import com.jr.erp.sys.set.entity.Param;
import com.jr.erp.sys.set.entity.ParamExample;
import com.jr.erp.sys.set.service.IParamService;

/**     
 * 类名称：ParamController    
 * 类描述：参数设置
 * 创建人：admin    
 * 创建时间：2018年11月13日 下午6:06:25    
 * 修改人：admin    
 * 修改时间：2018年11月13日 下午6:06:25    
 * 修改备注：    
 * @version  1.0    
 */
@Controller
@RequestMapping("/param")
public class ParamController
{

    @Autowired
    private IParamService paramService;
 
    
    @RequestMapping(value = "/checkBillFlow.do")
    @ResponseBody
    public Ret checkBillFlow(String module,String areaCode,HttpServletRequest request, Model model)
    {
        ParamExample example = new ParamExample();
        example.createCriteria().andCompanyNoEqualTo(ShiroUtils.getCompanyNo()).andAreaCodeEqualTo(areaCode).andMustSetEqualTo(1)
                .andModuleEqualTo(module);
        List<Param> paramList = (List) paramService.selectByExample(example);

        switch (module)
        {
        case "purchase":
            List<Param> allParam = new ArrayList<Param>();
            allParam.add(new Param("purchase", "isAudit", "0", "是否需要审核"));
            allParam.add(new Param("purchase", "isAransit", "0", "进货是否开启在途"));

            boolean hasSet = false;
            for (Param param : allParam)
            {
                for (Param exist : paramList)
                {
                    if (StringUtils.equals(param.getParamName(), exist.getParamName()))
                    {
                        hasSet = true;
                        break;
                    }
                }
            }
            if (hasSet)
            {
                return Ret.ok("已经设置参数");
            } else
            {
                return Ret.warn("未设置参数", allParam);
            }
        default:
            break;
        }

        return Ret.ok("");
    }
    
    @RequestMapping(value = "/updateBillFlowParam.do")
    @ResponseBody
    public Ret updateBillFlowParam(@RequestBody Map<String,Object> paramMap,String module,String areaCode,HttpServletRequest request, Model model)
    {
        switch (module)
        {
        case "purchase":
            List<Param> allParam = new ArrayList<Param>();
            paramService.updateBillFlowParam(ShiroUtils.getCompanyNo(),areaCode,module,paramMap);
            return Ret.ok("已经设置参数");
        default:
            break;
        }
        return Ret.ok("");
    }
}
