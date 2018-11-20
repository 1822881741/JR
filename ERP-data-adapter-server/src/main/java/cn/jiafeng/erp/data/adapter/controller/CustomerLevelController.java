

package cn.jiafeng.erp.data.adapter.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jiafeng.erp.data.adapter.dao.entity.CustomerLevel;
import cn.jiafeng.erp.data.adapter.extend.BaseController;
import cn.jiafeng.erp.data.adapter.model.dto.CustomerLevelDto;
import cn.jiafeng.erp.data.adapter.service.CustomerLevelService;


/**
 * 会员等级设置表 Controller
 * 
 * @author 
 * @date 2018-11-12
 */
@Controller
@RequestMapping(value = "/customerLevel", produces = "application/json; charset=utf-8")
public class CustomerLevelController extends BaseController{
    
    @Resource
    private CustomerLevelService customerLevelService;

    @RequestMapping(value = "/add")
	@ResponseBody
    public String  Add(@RequestBody List<CustomerLevelDto> models){
    	return Func(() -> {
			return customerLevelService.insertCustomerLevel(models);
		});
    }
    
    @RequestMapping(value = "/edit")
	@ResponseBody
    public String  edit(@RequestBody CustomerLevel model){
    	return Action(() -> {
			customerLevelService.updatePartCustomerLevel(model);
		});
    }
    
    @RequestMapping(value = "/del")
	@ResponseBody
    public String  del(Integer id){
    	return Action(() ->{
        	customerLevelService.deleteCustomerLevel(id);
    	});

    }

    
}
