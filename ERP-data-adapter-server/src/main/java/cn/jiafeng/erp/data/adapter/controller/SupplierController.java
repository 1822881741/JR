
package cn.jiafeng.erp.data.adapter.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jiafeng.erp.data.adapter.dao.entity.Supplier;
import cn.jiafeng.erp.data.adapter.extend.BaseController;
import cn.jiafeng.erp.data.adapter.model.dto.BaseParamters;
import cn.jiafeng.erp.data.adapter.model.dto.SupplierDto;
import cn.jiafeng.erp.data.adapter.service.SupplierService;
import cn.jiafeng.erp.data.adapter.util.DateUtils;

/**
 * 供应商表 Controller
 * 
 * @author
 * @date 2018-11-12
 */
@Controller
@RequestMapping(value = "/supplier", produces = "application/json; charset=utf-8")
public class SupplierController extends BaseController {

	@Resource
	private SupplierService supplierService;

	@PostMapping(value = "/add")
	@ResponseBody
	public String Add(@RequestBody List<SupplierDto> suppliers) {
		return Func(() -> {
			return supplierService.insertSuppliers(suppliers);
		});
	}

	@PostMapping(value = "/del")
	@ResponseBody
	public String del(@RequestBody BaseParamters param) {
		return Action(() -> {
			supplierService.delByIds(param);
		});
	}

}
