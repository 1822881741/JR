
package cn.jiafeng.erp.data.adapter.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jiafeng.erp.data.adapter.dao.entity.Employee;
import cn.jiafeng.erp.data.adapter.extend.BaseController;
import cn.jiafeng.erp.data.adapter.service.EmployeeService;

/**
 * 员工表 Controller
 * 
 * @author
 * @date 2018-11-12
 */
@Controller
@RequestMapping(value = "/employee", produces = "application/json; charset=utf-8")
public class EmployeeController extends BaseController {

	@Resource
	private EmployeeService employeeService;

	@RequestMapping(value = "/getAllEmployee")
	@ResponseBody
	public String getAllEmployee(String companyNo) {
		return Func(() -> {
			return employeeService.getEmployeeByCompanyNo(companyNo);
		});
	}

	@RequestMapping(value = "/add")
	@ResponseBody
	public String Add(@RequestBody Employee model) {
		return Action(() -> {
			employeeService.insertEmployee(model);
		});
	}

	@RequestMapping(value = "/edit")
	@ResponseBody
	public String edit(@RequestBody Employee model) {
		return Action(() -> {
			employeeService.updatePartEmployee(model);
		});
	}

	@RequestMapping(value = "/del")
	@ResponseBody
	public String del(Integer id) {
		return Action(() -> {
			employeeService.deleteEmployee(id);
		});

	}

}
