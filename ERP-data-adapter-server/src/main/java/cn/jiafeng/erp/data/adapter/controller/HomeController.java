package cn.jiafeng.erp.data.adapter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/home")
@RestController
public class HomeController {

	@RequestMapping("/index")
	public Object test() {
		return "hello world !!!";
	}
}
