

package cn.jiafeng.erp.data.adapter.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jiafeng.erp.data.adapter.dao.entity.Store;
import cn.jiafeng.erp.data.adapter.extend.BaseController;
import cn.jiafeng.erp.data.adapter.service.StoreService;


/**
 * 仓库、柜台 Controller
 * 
 * @author 
 * @date 2018-11-12
 */
@Controller
@RequestMapping(value = "/store", produces = "application/json; charset=utf-8")
public class StoreController extends BaseController{
    
    @Resource
    private StoreService storeService;

    @RequestMapping(value = "/add")
	@ResponseBody
    public String  Add(@RequestBody Store model){
    	return Action(() -> {
			storeService.insertStore(model);
		});
    }
    
    @RequestMapping(value = "/edit")
	@ResponseBody
    public String  edit(@RequestBody Store model){
    	return Action(() -> {
			storeService.updatePartStore(model);
		});
    }
    
    @RequestMapping(value = "/del")
	@ResponseBody
    public String  del(Integer id){
    	return Action(() ->{
        	storeService.deleteStore(id);
    	});

    }

    
}
