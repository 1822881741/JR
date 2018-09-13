package com.jr.erp.base.utils;

import java.util.List;

import com.jr.erp.base.mybatis.BaseEntity;

/**
 * 分页返回结果
 */
public class RetPage {

	/**
	 * 解析接口状态 0：为成功 
	 */
	private Integer code;
	
	/**
	 * code 不为0时，显示的错误信息
	 */
	private String msg;
	
	/**
	 * 数据条数
	 */
	private Long count;
	
	/**
	 * 返回结果集
	 */
	private List<BaseEntity> data;
	
	public static RetPage error()
	{
		RetPage rt = new RetPage();
		rt.setCode(-1);
		rt.setMsg("未获得数据");
		return rt;
	}
	public static RetPage error(String msg)
	{
		RetPage rt = new RetPage();
		rt.setCode(-1);
		rt.setMsg(msg);
		return rt;
	}
	
	public static RetPage ok(Long count,List<BaseEntity> data)
	{
		RetPage rt = new RetPage();
		rt.setCode(0);
		rt.setCount(count);
		rt.setData(data);
		return rt;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public List<BaseEntity> getData() {
		return data;
	}

	public void setData(List<BaseEntity> data) {
		this.data = data;
	}

}
