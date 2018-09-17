package com.jr.erp.base.utils;

public class Ret {

	/**
	 * 返回码 100：成功 -100：失败 ,200 :成功，有警告warn
	 */
	private int status;
	
	/**
	 * 提示信息
	 */
	private String msg;
	
	/**
	 * 数据内容
	 */
	private Object data;
	public static Ret error(String msg)
	{
		Ret rt = new Ret();
		rt.setStatus(-100);
		rt.setMsg(msg);
		return rt;
	}
	
	public static Ret ok(String msg)
	{
		Ret rt = new Ret();
		rt.setStatus(100);
		rt.setMsg(msg);
		return rt;
	}

	public static Ret ok(String msg,Object data)
	{
		Ret rt = new Ret();
		rt.setStatus(100);
		rt.setMsg(msg);
		rt.setData(data);
		return rt;
	}

    public static Ret warn(String msg)
    {
        Ret rt = new Ret();
        rt.setStatus(200);
        rt.setMsg(msg);
        return rt;
    }

    public static Ret warn(String msg, Object data)
    {
        Ret rt = new Ret();
        rt.setStatus(200);
        rt.setMsg(msg);
        rt.setData(data);
        return rt;
    }
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
