
package cn.jiafeng.erp.data.adapter.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jiafeng.erp.data.adapter.extend.BaseController;
import cn.jiafeng.erp.data.adapter.model.dto.BaseParamters;
import cn.jiafeng.erp.data.adapter.model.dto.GoodsArchivesDto;
import cn.jiafeng.erp.data.adapter.service.GoodsArchivesService;

/**
 * 商品档案表 Controller
 * 
 * @author
 * @date 2018-11-12
 */
@Controller
@RequestMapping(value = "/goodsArchives", produces = "application/json; charset=utf-8")
public class GoodsArchivesController extends BaseController {

	@Resource
	private GoodsArchivesService goodsArchivesService;

	@PostMapping(value = "/add")
	@ResponseBody
	public String Add(@RequestBody List<GoodsArchivesDto> models) {
		return Func(() -> {
			return goodsArchivesService.insertGoodsArchives(models);
		});
	}

	@PostMapping(value = "/del")
	@ResponseBody
	public String del(@RequestBody BaseParamters param) {
		return Action(() -> {
			goodsArchivesService.delByIds(param);
		});
	}
}
