package com.jr.erp.sys.utils.service;

public interface IBillNoGeneratorService
{

    /**    
     * getNextBillNo(这里用一句话描述这个方法的作用)    
     * 获取下一个可用单号       
     * @param @param companyNo
     * @param @param billType
     * @param @param userPrefix
     * @param @return     
     * @return String
     * @Exception 异常对象
    */
    String getNextBillNo(String companyNo,Integer billType,String userPrefix);
}
