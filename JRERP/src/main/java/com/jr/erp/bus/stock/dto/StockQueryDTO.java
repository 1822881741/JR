package com.jr.erp.bus.stock.dto;

public class StockQueryDTO
{
    private String areaCode;
    private String counterAreaCode;
    /**    
     * 查下类型 0：条码 1：原条码  2：证书号 3：公司款号      
     */    
    private String queryType;
    private String queryValue;
    
    public String getAreaCode()
    {
        return areaCode;
    }
    public void setAreaCode(String areaCode)
    {
        this.areaCode = areaCode;
    }
    public String getCounterAreaCode()
    {
        return counterAreaCode;
    }
    public void setCounterAreaCode(String counterAreaCode)
    {
        this.counterAreaCode = counterAreaCode;
    }
    public String getQueryType()
    {
        return queryType;
    }
    public void setQueryType(String queryType)
    {
        this.queryType = queryType;
    }
    public String getQueryValue()
    {
        return queryValue;
    }
    public void setQueryValue(String queryValue)
    {
        this.queryValue = queryValue;
    }
}
