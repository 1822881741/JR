

package cn.jiafeng.erp.data.adapter.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

import cn.jiafeng.erp.data.adapter.dao.entity.Company;
import cn.jiafeng.erp.data.adapter.service.CompanyService;
import cn.jiafeng.erp.data.adapter.extend.BaseController;
import javax.annotation.Resource;


/**
 * 公司客户 Controller
 * 
 * @author 
 * @date 2018-11-14
 */
@Controller
@RequestMapping(value = "/company", produces = "application/json; charset=utf-8")
public class CompanyController extends BaseController{
    
    @Resource
    private CompanyService companyService;

    @RequestMapping(value = "/add")
	@ResponseBody
    public String  Add(@RequestBody Company model){
    	return Action(() -> {
			companyService.insertCompany(model);
		});
    }
    
    @RequestMapping(value = "/edit")
	@ResponseBody
    public String  edit(@RequestBody Company model){
    	return Action(() -> {
			companyService.updatePartCompany(model);
		});
    }
    
    @RequestMapping(value = "/del")
	@ResponseBody
    public String  del(Integer id){
    	return Action(() ->{
        	companyService.deleteCompany(id);
    	});

    }

    
}
