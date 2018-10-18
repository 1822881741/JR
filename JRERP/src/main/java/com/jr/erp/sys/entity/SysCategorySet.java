package com.jr.erp.sys.entity;

import com.jr.erp.base.mybatis.BaseEntity;

public class SysCategorySet extends BaseEntity {
    private static final long serialVersionUID = 1959071855187674614L;

    /**
     * 主分类
     */
    private String categoryType;

    /**
     * 显示名称
     */
    private String name;

    /**
     * 是否是系统类型1：是 ，0不是
     */
    private Integer isSysDef;

    /**
     * 描述
     */
    private String remarks;

    /**
     * 字段显示顺序
     */
    private Integer seq;

    /**
     * 主分类
     * @return categoryType 主分类
     */
    public String getCategoryType() {
        return categoryType;
    }

    /**
     * 主分类
     * @param categoryType 主分类
     */
    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType == null ? null : categoryType.trim();
    }

    /**
     * 显示名称
     * @return name 显示名称
     */
    public String getName() {
        return name;
    }

    /**
     * 显示名称
     * @param name 显示名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 是否是系统类型 0 不是 ，1是
     * @return isSysDef 是否是系统类型 0 不是 ，1是
     */
    public Integer getIsSysDef() {
        return isSysDef;
    }

    /**
     * 是否是系统类型0：是 ，1不是
     * @param isSysDef 是否是系统类型0：是 ，1不是
     */
    public void setIsSysDef(Integer isSysDef) {
        this.isSysDef = isSysDef;
    }

    /**
     * 描述
     * @return remarks 描述
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 描述
     * @param remarks 描述
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * 字段显示顺序
     * @return seq 字段显示顺序
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 字段显示顺序
     * @param seq 字段显示顺序
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }
}