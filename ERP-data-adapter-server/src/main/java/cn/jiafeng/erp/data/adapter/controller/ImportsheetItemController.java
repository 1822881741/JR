

package cn.jiafeng.erp.data.adapter.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jiafeng.erp.data.adapter.dao.entity.ImportsheetItem;
import cn.jiafeng.erp.data.adapter.extend.BaseController;
import cn.jiafeng.erp.data.adapter.service.ImportsheetItemService;


/**
 * 入库单详情 Controller
 * 
 * @author 
 * @date 2018-11-12
 */
@Controller
@RequestMapping(value = "/importsheetItem", produces = "application/json; charset=utf-8")
public class ImportsheetItemController extends BaseController{
    
    @Resource
    private ImportsheetItemService importsheetItemService;

    @RequestMapping(value = "/add")
	@ResponseBody
    public String  Add(@RequestBody ImportsheetItem model){
    	return Action(() -> {
			importsheetItemService.insertImportsheetItem(model);
		});
    }
    
    @RequestMapping(value = "/edit")
	@ResponseBody
    public String  edit(@RequestBody ImportsheetItem model){
    	return Action(() -> {
			importsheetItemService.updatePartImportsheetItem(model);
		});
    }
    
    @RequestMapping(value = "/del")
	@ResponseBody
    public String  del(Integer id){
    	return Action(() ->{
        	importsheetItemService.deleteImportsheetItem(id);
    	});

    }

    
}
