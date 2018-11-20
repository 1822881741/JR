
package cn.jiafeng.erp.data.adapter.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jiafeng.erp.data.adapter.dao.entity.Areainfo;
import cn.jiafeng.erp.data.adapter.extend.BaseController;
import cn.jiafeng.erp.data.adapter.service.AreainfoService;

/**
 * 系统区域，在后台维护，不在前台显示，用于用户数据权限的控制 Controller
 * 
 * @author
 * @date 2018-11-12
 */
@Controller
@RequestMapping(value = "/areainfo", produces = "application/json; charset=utf-8")
public class AreainfoController extends BaseController {

	@Resource
	private AreainfoService areainfoService;

	@RequestMapping(value = "/getArea")
	@ResponseBody
	public String getArea(String companyNo) {
		return Func(() -> {
			return areainfoService.getArea(companyNo);
		});
	}
}
