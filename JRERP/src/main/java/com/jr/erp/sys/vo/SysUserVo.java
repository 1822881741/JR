package com.jr.erp.sys.vo;

public class SysUserVo {

    /**
     * 登录名
     */
    private String loginNo;

    /**
     * 密码
     */
    private String password;
    
    /**
     * 记住密码
     */
    private Boolean rememberMe;

	public String getLoginNo() {
		return loginNo;
	}

	public void setLoginNo(String loginNo) {
		this.loginNo = loginNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(Boolean rememberMe) {
		this.rememberMe = rememberMe;
	}
}
