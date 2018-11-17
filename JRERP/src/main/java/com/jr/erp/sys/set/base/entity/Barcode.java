package com.jr.erp.sys.set.base.entity;

import com.jr.erp.base.mybatis.BaseEntity;

public class Barcode extends BaseEntity {
    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户单据编号2为，对应用户表中单据简码
     */
    private String prefix;

    /**
     * 
     */
    private String barcode;

    /**
     * 用户ID
     * @return userId 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 用户单据编号2为，对应用户表中单据简码
     * @return prefix 用户单据编号2为，对应用户表中单据简码
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * 用户单据编号2为，对应用户表中单据简码
     * @param prefix 用户单据编号2为，对应用户表中单据简码
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix == null ? null : prefix.trim();
    }

    /**
     * 
     * @return barcode 
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * 
     * @param barcode 
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }
}