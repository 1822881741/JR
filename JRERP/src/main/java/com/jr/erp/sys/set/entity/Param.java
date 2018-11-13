package com.jr.erp.sys.set.entity;

import com.jr.erp.base.mybatis.BaseEntity;

public class Param extends BaseEntity {
    /**
     * 
     */
    private String deptAreaCode;

    /**
     * 参数名称
     */
    private String paramName;

    /**
     * 状态值,1为选中,0为没选中
     */
    private Integer status;

    /**
     * 参数值
     */
    private String paramValue;

    /**
     * 参数类型
     */
    private String paramType;

    /**
     * 备注信息，也可用于界面显示
     */
    private String remarks;

    /**
     * 
     * @return deptAreaCode 
     */
    public String getDeptAreaCode() {
        return deptAreaCode;
    }

    /**
     * 
     * @param deptAreaCode 
     */
    public void setDeptAreaCode(String deptAreaCode) {
        this.deptAreaCode = deptAreaCode == null ? null : deptAreaCode.trim();
    }

    /**
     * 参数名称
     * @return paramName 参数名称
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * 参数名称
     * @param paramName 参数名称
     */
    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    /**
     * 状态值,1为选中,2为没选中
     * @return status 状态值,1为选中,2为没选中
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态值,1为选中,2为没选中
     * @param status 状态值,1为选中,2为没选中
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 参数值
     * @return paramValue 参数值
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * 参数值
     * @param paramValue 参数值
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    /**
     * 参数类型
     * @return paramType 参数类型
     */
    public String getParamType() {
        return paramType;
    }

    /**
     * 参数类型
     * @param paramType 参数类型
     */
    public void setParamType(String paramType) {
        this.paramType = paramType == null ? null : paramType.trim();
    }

    /**
     * 备注信息，也可用于界面显示
     * @return remarks 备注信息，也可用于界面显示
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 备注信息，也可用于界面显示
     * @param remarks 备注信息，也可用于界面显示
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}