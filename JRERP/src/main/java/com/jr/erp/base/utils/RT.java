package com.jr.erp.base.utils;

public class RT {

	/**
	 * 返回码 100：成功 -100：失败
	 */
	private int status;
	
	/**
	 * 提示信息
	 */
	private String msg;
	
	public static RT error(String msg)
	{
		RT rt = new RT();
		rt.status=-100;
		rt.msg=msg;
		return rt;
	}
	
	public static RT ok(String msg)
	{
		RT rt = new RT();
		rt.status=100;
		rt.msg=msg;
		return rt;
	}
}
