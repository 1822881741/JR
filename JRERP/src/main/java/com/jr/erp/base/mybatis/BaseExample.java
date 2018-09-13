package com.jr.erp.base.mybatis;

public class BaseExample
{
    /**
     * sys_store
     */
    protected String orderByClause;

    /**
     * sys_store
     */
    protected boolean distinct;


    private Integer page;

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
