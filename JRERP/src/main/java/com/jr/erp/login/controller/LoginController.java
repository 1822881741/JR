package com.jr.erp.login.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jr.erp.base.utils.RT;
import com.jr.erp.sys.vo.SysUserVo;

/**
 * 登陆controller
 */
@Controller
public class LoginController {

	/**
	 * 跳转到登陆界面
	 */
	@RequestMapping(value = "/login")
	public String login() {
		return "/login";
	}

	@RequestMapping(value = "/checkLogin")
	@ResponseBody
	public RT checkLogin(SysUserVo loginUser, HttpServletRequest request, Model model) {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(loginUser.getLoginNo(), loginUser.getPassword());
		subject.login(token);
		return RT.error("");
	}
}
