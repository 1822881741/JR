package com.jr.erp.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping(value="/login")
	public String main(){
		return "/login";
	}
}
