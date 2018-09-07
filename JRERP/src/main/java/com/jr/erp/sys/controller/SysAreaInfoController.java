package com.jr.erp.sys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.utils.Ret;
import com.jr.erp.sys.entity.SysAreaInfoExample;
import com.jr.erp.sys.service.ISysAreaInfoService;

/**
 *
 */
@Controller
@RequestMapping("/sysAreaInfo")
public class SysAreaInfoController {

	@Autowired
	ISysAreaInfoService sysAreaInfoService;
	
	@RequestMapping(value="/viewAreaInfo.do")
	public String viewAreaInfo(HttpServletRequest request)
	{
		
		return "sys/viewAreaInfo";
	}
	
	/**
	 * 加载区域信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/areaInfoList.do")
	@ResponseBody
	public Ret areaInfoList(HttpServletRequest request)
	{
		SysAreaInfoExample exampale = new SysAreaInfoExample();
		List<BaseEntity> listData =  sysAreaInfoService.selectByExample(exampale);
		return Ret.ok("", listData);
	}
}
