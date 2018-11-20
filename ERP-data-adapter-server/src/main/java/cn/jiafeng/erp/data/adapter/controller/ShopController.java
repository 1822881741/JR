

package cn.jiafeng.erp.data.adapter.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jiafeng.erp.data.adapter.dao.entity.Shop;
import cn.jiafeng.erp.data.adapter.extend.BaseController;
import cn.jiafeng.erp.data.adapter.service.ShopService;


/**
 * 门店信息表 Controller
 * 
 * @author 
 * @date 2018-11-12
 */
@Controller
@RequestMapping(value = "/shop", produces = "application/json; charset=utf-8")
public class ShopController extends BaseController{
    
    @Resource
    private ShopService shopService;

    @RequestMapping(value = "/add")
	@ResponseBody
    public String  Add(@RequestBody Shop model){
    	return Action(() -> {
			shopService.insertShop(model);
		});
    }
    
    @RequestMapping(value = "/edit")
	@ResponseBody
    public String  edit(@RequestBody Shop model){
    	return Action(() -> {
			shopService.updatePartShop(model);
		});
    }
    
    @RequestMapping(value = "/del")
	@ResponseBody
    public String  del(Integer id){
    	return Action(() ->{
        	shopService.deleteShop(id);
    	});

    }

    
}
