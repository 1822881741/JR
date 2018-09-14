package com.jr.erp.base.mybatis;

public class BaseExample
{
    /**
     * 排序
     */
    protected String orderByClause;

    /**
     * 
     */
    protected boolean distinct;


    /**    
     * 当前页数    
     */    
    private Integer page;

    /**    
     * 每页多少条    
     */    
    private Integer limit;

    public String getOrderByClause()
    {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause)
    {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct()
    {
        return distinct;
    }

    public void setDistinct(boolean distinct)
    {
        this.distinct = distinct;
    }

    public Integer getPage()
    {
        return page;
    }

    public void setPage(Integer page)
    {
        this.page = page;
    }

    public Integer getLimit()
    {
        return limit;
    }

    public void setLimit(Integer limit)
    {
        this.limit = limit;
    }
}
