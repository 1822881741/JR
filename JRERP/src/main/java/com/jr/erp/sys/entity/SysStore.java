package com.jr.erp.sys.entity;

import com.jr.erp.base.mybatis.BaseEntity;

public class SysStore extends BaseEntity {
    private static final long serialVersionUID = -7343026424954500150L;

    /**
     * 门店名称
     */
    private String storeName;

    /**
     * 区域编码
     */
    private String areaCode;

    /**
     * 所属区域
     */
    private String regionCode;

    /**
     * 大区名称
     */
    private String regionName;

    /**
     * 地址信息
     */
    private String address;

    /**
     * 联系人电话
     */
    private String mobile;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 当前状态 0:已删除，1：使用中
     */
    private Integer status;

    /**
     * 门店名称
     * @return storeName 门店名称
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 门店名称
     * @param storeName 门店名称
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
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
     * 所属区域
     * @return regionCode 所属区域
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * 所属区域
     * @param regionCode 所属区域
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    /**
     * 大区名称
     * @return regionName 大区名称
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * 大区名称
     * @param regionName 大区名称
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    /**
     * 地址信息
     * @return address 地址信息
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址信息
     * @param address 地址信息
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 联系人电话
     * @return mobile 联系人电话
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 联系人电话
     * @param mobile 联系人电话
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 备注信息
     * @return remarks 备注信息
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 备注信息
     * @param remarks 备注信息
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * 当前状态 0:已删除，1：使用中
     * @return status 当前状态 0:已删除，1：使用中
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 当前状态 0:已删除，1：使用中
     * @param status 当前状态 0:已删除，1：使用中
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}