package com.jr.erp.base.utils;

public class BasePageForm
{
    /**    
     * 公司编号    
     */    
    private String companyNo;
    /**    
     * 当前第几页    
     */    
    private Integer page;
    
    /**    
     * 每页多少行    
     */    
    private Integer limit;

    public String getCompanyNo()
    {
        return companyNo;
    }

    public void setCompanyNo(String companyNo)
    {
        this.companyNo = companyNo;
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
