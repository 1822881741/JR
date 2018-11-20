
package cn.jiafeng.erp.data.adapter.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jiafeng.erp.data.adapter.extend.BaseController;
import cn.jiafeng.erp.data.adapter.model.dto.BaseParamters;
import cn.jiafeng.erp.data.adapter.model.dto.ImportsheetDto;
import cn.jiafeng.erp.data.adapter.service.ImportsheetService;

/**
 * 入库单 Controller
 * 
 * @author
 * @date 2018-11-12
 */
@Controller
@RequestMapping(value = "/importsheet", produces = "application/json; charset=utf-8")
public class ImportsheetController extends BaseController {

	@Resource
	private ImportsheetService importsheetService;

	@RequestMapping(value = "/add")
	@ResponseBody
	public String Add(@RequestBody ImportsheetDto models) {
		return Func(() -> {
			return importsheetService.insertImportsheet(models);
		});
	}

	@PostMapping(value = "/del")
	@ResponseBody
	public String del(@RequestBody BaseParamters param) {
		return Action(() -> {
			importsheetService.delByIds(param);
		});
	}

}
