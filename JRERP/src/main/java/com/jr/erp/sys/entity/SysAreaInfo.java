package com.jr.erp.sys.entity;

import com.jr.erp.base.mybatis.BaseEntity;

public class SysAreaInfo extends BaseEntity {
    /**
     * 上级地区id
     */
    private Integer parentId;

    /**
     * 区域名称
     */
    private String areaName;

    /**
     * 地域的类型：-1组织划分节点；0：公司；1：门店：2：仓库/展柜
     */
    private Integer areaType;

    /**
     * 地区码
     */
    private String areaCode;

    /**
     * 当前状态 0：已删除，1：正常
     */
    private Integer status;

    /**
     * 上级地区id
     * @return parentId 上级地区id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 上级地区id
     * @param parentId 上级地区id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 区域名称
     * @return areaName 区域名称
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 区域名称
     * @param areaName 区域名称
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * 地域的类型：-1组织划分节点；0：公司；1：门店：2：仓库/展柜
     * @return areaType 地域的类型：-1组织划分节点；0：公司；1：门店：2：仓库/展柜
     */
    public Integer getAreaType() {
        return areaType;
    }

    /**
     * 地域的类型：-1组织划分节点；0：公司；1：门店：2：仓库/展柜
     * @param areaType 地域的类型：-1组织划分节点；0：公司；1：门店：2：仓库/展柜
     */
    public void setAreaType(Integer areaType) {
        this.areaType = areaType;
    }

    /**
     * 地区码
     * @return areaCode 地区码
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 地区码
     * @param areaCode 地区码
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * 当前状态 0：已删除，1：正常
     * @return status 当前状态 0：已删除，1：正常
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 当前状态 0：已删除，1：正常
     * @param status 当前状态 0：已删除，1：正常
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}