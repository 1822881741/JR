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
    private String userPerfixNo;

    /**
     * 
     */
    private String barCode;

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
     * @return userPerfixNo 用户单据编号2为，对应用户表中单据简码
     */
    public String getUserPerfixNo() {
        return userPerfixNo;
    }

    /**
     * 用户单据编号2为，对应用户表中单据简码
     * @param userPerfixNo 用户单据编号2为，对应用户表中单据简码
     */
    public void setUserPerfixNo(String userPerfixNo) {
        this.userPerfixNo = userPerfixNo == null ? null : userPerfixNo.trim();
    }

    /**
     * 
     * @return barCode 
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * 
     * @param barCode 
     */
    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }
}