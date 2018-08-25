package com.jr.erp.sys.entity;

import com.jr.erp.base.mybatis.BaseEntity;

public class SysStore extends BaseEntity {
    /**
     * 门店名称
     */
    private String shopName;

    /**
     * 地址信息
     */
    private String address;

    /**
     * 联系人电话
     */
    private String mobile;

    /**
     * 当前状态 0:已删除，1：使用中
     */
    private Integer status;

    /**
     * 区域编码
     */
    private String areaCode;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 门店名称
     * @return shopName 门店名称
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 门店名称
     * @param shopName 门店名称
     */
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
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
}