package com.jr.erp.login.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.Ret;
import com.jr.erp.sys.entity.SysUser;
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
	public Ret checkLogin(HttpServletRequest request, Model model, @Validated SysUserVo loginUser,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			FieldError error = (FieldError) bindingResult.getAllErrors().get(0);
			return Ret.error(error.getDefaultMessage());
		}
		try {
			Subject subject = SecurityUtils.getSubject();
			UsernamePasswordToken token = new UsernamePasswordToken(loginUser.getLoginNo(), loginUser.getPassword());
			subject.login(token);
//			SecurityUtils.getSubject().getSession().setAttribute("who am i", "高小虎");
		} catch (UnknownAccountException e) {
			return Ret.error(e.getMessage());
		} catch (IncorrectCredentialsException e) {
			return Ret.error("账号或密码不正确");
		} catch (LockedAccountException e) {
			return Ret.error("账号已被锁定,请联系管理员");
		} catch (AuthenticationException e) {
			return Ret.error("账户验证失败");
		}
		return Ret.ok("");
	}
	
	@RequestMapping(value = "/main")
	public String main(HttpServletRequest request){
		ShiroUtils.setSessionAttribute("who am i","高小8888888888虎"+System.currentTimeMillis());
		SysUser user = ShiroUtils.getSysUser();
		System.out.println(user);
		System.out.println("高小8888888888虎"+System.currentTimeMillis());
		return "main";
	}
}
