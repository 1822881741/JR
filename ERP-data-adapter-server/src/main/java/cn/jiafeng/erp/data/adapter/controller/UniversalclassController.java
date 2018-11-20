
package cn.jiafeng.erp.data.adapter.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jiafeng.erp.data.adapter.extend.BaseController;
import cn.jiafeng.erp.data.adapter.model.dto.BaseParamters;
import cn.jiafeng.erp.data.adapter.model.dto.UniversalclassDto;
import cn.jiafeng.erp.data.adapter.service.UniversalclassService;

/**
 * 通用类型（简单下拉列表） Controller
 * 
 * @author
 * @date 2018-11-12
 */
@Controller
@RequestMapping(value = "/universalclass", produces = "application/json; charset=utf-8")
public class UniversalclassController extends BaseController {

	@Resource
	private UniversalclassService universalclassService;

	@PostMapping(value = "/add")
	@ResponseBody
	public String Add(@RequestBody List<UniversalclassDto> models) {
		return Func(() -> {
			return universalclassService.insertUniversalclass(models);
		});
	}

	@PostMapping(value = "/del")
	@ResponseBody
	public String del(@RequestBody BaseParamters param) {
		return Action(() -> {
			universalclassService.delByIds(param);
		});
	}
}
