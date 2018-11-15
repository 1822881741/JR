package com.jr.erp.sys.entity;

import com.jr.erp.base.mybatis.BaseEntity;

public class SysCounter extends BaseEntity {
    /**
     * 仓库名称
     */
    private String counterName;

    /**
     * 分类：0：成品柜台；1：旧料柜台
     */
    private Integer counterType;

    /**
     * 区域编码
     */
    private String areaCode;

    /**
     * 当前状态 0:停用，1：使用中
     */
    private Integer status;

    /**
     * 
     */
    private String remarks;

    /**
     * 仓库名称
     * @return counterName 仓库名称
     */
    public String getCounterName() {
        return counterName;
    }

    /**
     * 仓库名称
     * @param counterName 仓库名称
     */
    public void setCounterName(String counterName) {
        this.counterName = counterName == null ? null : counterName.trim();
    }

    /**
     * 分类：0：成品柜台；1：旧料柜台
     * @return counterType 分类：0：成品柜台；1：旧料柜台
     */
    public Integer getCounterType() {
        return counterType;
    }

    /**
     * 分类：0：成品柜台；1：旧料柜台 2:在途仓
     * @param counterType 分类：0：成品柜台；1：旧料柜台
     */
    public void setCounterType(Integer counterType) {
        this.counterType = counterType;
    }

    /**
     * 区域编码
     * @return areaCode 区域编码
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 区域编码
     * @param areaCode 区域编码
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * 当前状态 0:停用，1：使用中
     * @return status 当前状态 0:停用，1：使用中
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 当前状态 0:停用，1：使用中
     * @param status 当前状态 0:停用，1：使用中
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 
     * @return remarks 
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 
     * @param remarks 
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}