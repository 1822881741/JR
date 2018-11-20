

package cn.jiafeng.erp.data.adapter.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jiafeng.erp.data.adapter.dao.entity.Customer;
import cn.jiafeng.erp.data.adapter.extend.BaseController;
import cn.jiafeng.erp.data.adapter.service.CustomerService;


/**
 * 客户会员表 Controller
 * 
 * @author 
 * @date 2018-11-12
 */
@Controller
@RequestMapping(value = "/customer", produces = "application/json; charset=utf-8")
public class CustomerController extends BaseController{
    
    @Resource
    private CustomerService customerService;

    @RequestMapping(value = "/add")
	@ResponseBody
    public String  Add(@RequestBody Customer model){
    	return Action(() -> {
			customerService.insertCustomer(model);
		});
    }
    
    @RequestMapping(value = "/edit")
	@ResponseBody
    public String  edit(@RequestBody Customer model){
    	return Action(() -> {
			customerService.updatePartCustomer(model);
		});
    }
    
    @RequestMapping(value = "/del")
	@ResponseBody
    public String  del(Integer id){
    	return Action(() ->{
        	customerService.deleteCustomer(id);
    	});

    }

    
}
