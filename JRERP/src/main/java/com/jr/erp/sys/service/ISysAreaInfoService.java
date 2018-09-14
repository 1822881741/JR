package com.jr.erp.sys.service;

import java.util.List;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.mybatis.IBaseService;
import com.jr.erp.sys.entity.SysAreaInfo;

/**
 * 系统管理service
 */
public interface ISysAreaInfoService extends IBaseService<BaseEntity>{

    /**    
     * selectByAreaCode(这里用一句话描述这个方法的作用)    
     * 根据公司编号和区域码，获得对应的区域信息       
     * @param @param companyNo
     * @param @param regionCode
     * @param @return     
     * @return SysAreaInfo
     * @Exception 异常对象
    */
    SysAreaInfo selectByAreaCode(String companyNo, String regionCode);

    /**    
     * selectStoreArea(这里用一句话描述这个方法的作用)    
     * 获取指定地区码下的所有门店列表       
     * @param @param companyNo
     * @param @param regionCode
     * @param @return     
     * @return List<SysAreaInfo>
     * @Exception 异常对象
    */
    List<SysAreaInfo> selectAllStoreArea(String companyNo, String parentAreaCode);
    
    /**    
     * selectInUseStoreArea(这里用一句话描述这个方法的作用)    
     * 获得在用的门店列表       
     * @param @param companyNo
     * @param @param parentAreaCode
     * @param @return     
     * @return List<sysAreaInfo>
     * @Exception 异常对象
    */
    List<SysAreaInfo> selectInUseStoreArea(String companyNo, String parentAreaCode);
    
    /**    
     * selectAllCounterArea(这里用一句话描述这个方法的作用)    
     * 获得所有的柜台       
     * @param @param companyNo
     * @param @param parentAreaCode
     * @param @return     
     * @return List<SysAreaInfo>
     * @Exception 异常对象
    */
    List<SysAreaInfo> selectAllCounterArea(String companyNo,String parentAreaCode);
    
    /**    
     * selectAllCounterArea(这里用一句话描述这个方法的作用)    
     * 获得在用的柜台列表   
     * @param @param companyNo
     * @param @param parentAreaCode
     * @param @return     
     * @return List<SysAreaInfo>
     * @Exception 异常对象
    */
    List<SysAreaInfo> selectInUseCounterArea(String companyNo,String parentAreaCode);
    
    /**    
     * selectMaxCode(这里用一句话描述这个方法的作用)    
     * 获取当前系统最大地区编码对应的区域信息       
     * @param @param companyNo
     * @param @param parentAreaCode
     * @param @return     
     * @return SysAreaInfo
     * @Exception 异常对象
    */
    SysAreaInfo selectMaxAreaInfo(String companyNo,String parentAreaCode,Integer areaType);
    
    /**    
     * getNextCode(这里用一句话描述这个方法的作用)    
     * 获得下一个地区码       
     * @param @param companyNo
     * @param @param parentAreaCode
     * @param @param areaType
     * @param @return     
     * @return String
     * @Exception 异常对象
    */
    String getNextCode(String companyNo,String parentAreaCode,Integer areaType);
}
