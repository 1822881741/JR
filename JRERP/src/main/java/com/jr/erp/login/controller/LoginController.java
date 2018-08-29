package com.jr.erp.login.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping(value="/login")
	public String main(){
		return "/login";
	}
	
	@RequestMapping(value="/checkLogin")
	public String checkLogin(HttpServletRequest request,Model model){
		
		System.out.println(SecurityUtils.getSubject().getPrincipal());
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("张三","123456");
		subject.login(token);
		return null;
	}
}
