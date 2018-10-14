package com.jr.erp.base.utils;

import java.util.List;

import com.jr.erp.base.mybatis.BaseEntity;

/**
 * 分页返回结果
 */
public class RetJqGridPage {

    /**
     * 返回码 100：成功 -100：失败 , 200 :成功，有警告warn
     */
    private int status;
	
    private String msg;
	/**
	 * 总页数
	 */
	private String total;
	
	/**
	 * 当前页
	 */
	private Long page;
	
	/**
     * 总记录数
     */
    private Long records;
	
	/**
	 * 返回结果集
	 */
	private List<BaseEntity> rows;
	
	public static RetJqGridPage error()
	{
		RetJqGridPage rt = new RetJqGridPage();
		rt.setStatus(-100);
		rt.setMsg("未获得数据");
		return rt;
	}
	public static RetJqGridPage error(String msg)
	{
		RetJqGridPage rt = new RetJqGridPage();
		rt.setStatus(-100);
		rt.setMsg(msg);
		return rt;
	}
	
	public static RetJqGridPage ok(Long records,List<BaseEntity> data)
	{
		RetJqGridPage rt = new RetJqGridPage();
		rt.setStatus(100);
		rt.setRecords(records);
		rt.setRows(data);
		return rt;
	}
    public int getStatus()
    {
        return status;
    }
    public void setStatus(int status)
    {
        this.status = status;
    }
    public String getTotal()
    {
        return total;
    }
    public void setTotal(String total)
    {
        this.total = total;
    }
    public Long getPage()
    {
        return page;
    }
    public void setPage(Long page)
    {
        this.page = page;
    }
    public Long getRecords()
    {
        return records;
    }
    public void setRecords(Long records)
    {
        this.records = records;
    }
    public List<BaseEntity> getRows()
    {
        return rows;
    }
    public void setRows(List<BaseEntity> rows)
    {
        this.rows = rows;
    }
    public String getMsg()
    {
        return msg;
    }
    public void setMsg(String msg)
    {
        this.msg = msg;
    }
}
