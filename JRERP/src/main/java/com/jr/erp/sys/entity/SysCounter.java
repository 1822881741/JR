package com.jr.erp.sys.entity;

import com.jr.erp.base.mybatis.BaseEntity;

public class SysCounter extends BaseEntity {
    /**
     * 仓库名称
     */
    private String storeName;

    /**
     * 分类：0：成品柜台；1：旧料柜台
     */
    private Integer storeType;

    /**
     * 区域编码
     */
    private String areaCode;

    /**
     * 当前状态 0:停用，1：使用中
     */
    private Integer status;

    /**
     * 仓库名称
     * @return storeName 仓库名称
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 仓库名称
     * @param storeName 仓库名称
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**
     * 分类：0：成品柜台；1：旧料柜台
     * @return storeType 分类：0：成品柜台；1：旧料柜台
     */
    public Integer getStoreType() {
        return storeType;
    }

    /**
     * 分类：0：成品柜台；1：旧料柜台
     * @param storeType 分类：0：成品柜台；1：旧料柜台
     */
    public void setStoreType(Integer storeType) {
        this.storeType = storeType;
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
}