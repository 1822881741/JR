package com.jr.erp.sys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jr.erp.sys.entity.SysStore;
import com.jr.erp.sys.service.ISysStoreService;

/**
 * 门店的controller
 */
@Controller
@RequestMapping("/sysStore")
public class SysStoreController{

	@Autowired
	private ISysStoreService sysStoreService;
	
	
	@RequestMapping(value="/storeList.ftl")
	public String storeList(Integer id,HttpServletRequest request,Model model)
	{
		System.out.println(sysStoreService.selectByString(id));
//		System.out.println(sysStoreService.selectByStringList());
//		System.out.println(sysStoreService.selectByKey(id));
//		List<SysStore> storeList = sysStoreService.selectList();
//		model.addAttribute("storeList", storeList);
		
		return "sys/storeList";
	}
	
	@RequestMapping(value="/saveStore.do")
	@ResponseBody
	public String main() {
		SysStore store = new SysStore();
		sysStoreService.insert(store);
		return "main";
	}
}
