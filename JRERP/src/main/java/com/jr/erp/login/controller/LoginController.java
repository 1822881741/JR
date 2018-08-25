package com.jr.erp.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping(value="/main.do")
	public String main(){
		return "main";
	}
}
