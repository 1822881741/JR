

package cn.jiafeng.erp.data.adapter.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jiafeng.erp.data.adapter.dao.entity.User;
import cn.jiafeng.erp.data.adapter.extend.BaseController;
import cn.jiafeng.erp.data.adapter.service.UserService;


/**
 * 系统用户 Controller
 * 
 * @author 
 * @date 2018-11-12
 */
@Controller
@RequestMapping(value = "/user", produces = "application/json; charset=utf-8")
public class UserController extends BaseController{
    
    @Resource
    private UserService userService;

    @RequestMapping(value = "/add")
	@ResponseBody
    public String  Add(@RequestBody User model){
    	return Action(() -> {
			userService.insertUser(model);
		});
    }
    
    @RequestMapping(value = "/edit")
	@ResponseBody
    public String  edit(@RequestBody User model){
    	return Action(() -> {
			userService.updatePartUser(model);
		});
    }
    
    @RequestMapping(value = "/del")
	@ResponseBody
    public String  del(Integer id){
    	return Action(() ->{
        	userService.deleteUser(id);
    	});

    }

    
}
