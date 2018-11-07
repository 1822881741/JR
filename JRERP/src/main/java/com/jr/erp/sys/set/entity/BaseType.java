package com.jr.erp.sys.set.entity;

import com.jr.erp.base.mybatis.BaseEntity;

public class BaseType extends BaseEntity {
    /**
     * 主分类
     */
    private String typeName;

    /**
     * 显示名称
     */
    private String name;

    /**
     * 是否是系统类型0：是 ，1不是
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
     * @return typeName 主分类
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 主分类
     * @param typeName 主分类
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
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
     * 是否是系统类型0：是 ，1不是
     * @return isSysDef 是否是系统类型0：是 ，1不是
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