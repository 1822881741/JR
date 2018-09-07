package com.jr.erp.sys.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jr.erp.sys.entity.SysStore;
import com.jr.erp.sys.service.ISysStoreService;

/**
 * 用户管理controller
 */
@Controller
@RequestMapping("/sysUser")
public class SysUserController{

	@Autowired
	private ISysStoreService sysStoreService;
	
	
	@RequestMapping(value="/userList")
	public String userList(Integer id,HttpServletRequest request,Model model)
	{
		return "sys/user/userList";
	}
	
	@RequestMapping(value="/saveStore.do")
	@ResponseBody
	public String main() {
		SysStore store = new SysStore();
		sysStoreService.insert(store);
		return "main";
	}
}
