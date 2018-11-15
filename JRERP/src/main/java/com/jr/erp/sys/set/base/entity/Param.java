package com.jr.erp.sys.set.base.entity;

import com.jr.erp.base.mybatis.BaseEntity;

public class Param extends BaseEntity {
    /**
     * 
     */
    private String areaCode;

    /**
     * 所属模块
     */
    private String module;

    /**
     * 参数名称
     */
    private String paramName;

    /**
     * 是否必填项 0：不是，1：是
     */
    private Integer mustSet;

    /**
     * 状态值,1为选中,0为没选中
     */
    private Integer status;

    /**
     * 参数值
     */
    private String paramValue;

    /**
     * 备注信息，也可用于界面显示
     */
    private String remarks;

    public Param()
    {
        super();
    }
    public Param(String module, String paramName, String paramValue, String remarks)
    {
        super();
        this.module=module;
        this.paramName=paramName;
        this.paramValue=paramValue;
        this.remarks=remarks;
    }

    /**
     * 
     * @return areaCode 
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 
     * @param areaCode 
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * 所属模块
     * @return module 所属模块
     */
    public String getModule() {
        return module;
    }

    /**
     * 所属模块
     * @param module 所属模块
     */
    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
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
     * 是否必填项
     * @return mustSet 是否必填项
     */
    public Integer getMustSet() {
        return mustSet;
    }

    /**
     * 是否必填项
     * @param mustSet 是否必填项
     */
    public void setMustSet(Integer mustSet) {
        this.mustSet = mustSet;
    }

    /**
     * 状态值,1为选中,0为没选中
     * @return status 状态值,1为选中,0为没选中
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态值,1为选中,0为没选中
     * @param status 状态值,1为选中,0为没选中
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