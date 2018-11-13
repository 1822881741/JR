package com.jr.erp.sys.set.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    
}
