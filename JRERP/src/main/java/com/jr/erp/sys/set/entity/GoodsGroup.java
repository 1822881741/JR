package com.jr.erp.sys.set.entity;

import com.jr.erp.base.mybatis.BaseEntity;

public class GoodsGroup extends BaseEntity {
    /**
     * 大类缩写
     */
    private String firstType;

    /**
     * 大类名称
     */
    private String firstTypeName;

    /**
     * 中类缩写
     */
    private String secondType;

    /**
     * 中类名称
     */
    private String secondTypeName;

    /**
     * 销售方式 1：按折扣 2：按金价 3：按金工石销售
     */
    private Integer saleType;

    /**
     * 是否可兑换 1：可以，0：不可用
     */
    private Integer canBarter;

    /**
     * 是否是系统类型1：是 ，0不是
     */
    private Integer isSysDef;

    /**
     * 描述
     */
    private String remarks;

    /**
     * 状态 1：可用 0：禁用
     */
    private Integer status;

    /**
     * 大类缩写
     * @return firstType 大类缩写
     */
    public String getFirstType() {
        return firstType;
    }

    /**
     * 大类缩写
     * @param firstType 大类缩写
     */
    public void setFirstType(String firstType) {
        this.firstType = firstType == null ? null : firstType.trim();
    }

    /**
     * 大类名称
     * @return firstTypeName 大类名称
     */
    public String getFirstTypeName() {
        return firstTypeName;
    }

    /**
     * 大类名称
     * @param firstTypeName 大类名称
     */
    public void setFirstTypeName(String firstTypeName) {
        this.firstTypeName = firstTypeName == null ? null : firstTypeName.trim();
    }

    /**
     * 中类缩写
     * @return secondType 中类缩写
     */
    public String getSecondType() {
        return secondType;
    }

    /**
     * 中类缩写
     * @param secondType 中类缩写
     */
    public void setSecondType(String secondType) {
        this.secondType = secondType == null ? null : secondType.trim();
    }

    /**
     * 中类名称
     * @return secondTypeName 中类名称
     */
    public String getSecondTypeName() {
        return secondTypeName;
    }

    /**
     * 中类名称
     * @param secondTypeName 中类名称
     */
    public void setSecondTypeName(String secondTypeName) {
        this.secondTypeName = secondTypeName == null ? null : secondTypeName.trim();
    }

    /**
     * 销售方式 1：按折扣 2：按金价 3：按金工石销售
     * @return saleType 销售方式 1：按折扣 2：按金价 3：按金工石销售
     */
    public Integer getSaleType() {
        return saleType;
    }

    /**
     * 销售方式 1：按折扣 2：按金价 3：按金工石销售
     * @param saleType 销售方式 1：按折扣 2：按金价 3：按金工石销售
     */
    public void setSaleType(Integer saleType) {
        this.saleType = saleType;
    }

    /**
     * 是否可兑换 1：可以，0：不可用
     * @return canBarter 是否可兑换 1：可以，0：不可用
     */
    public Integer getCanBarter() {
        return canBarter;
    }

    /**
     * 是否可兑换 1：可以，0：不可用
     * @param canBarter 是否可兑换 1：可以，0：不可用
     */
    public void setCanBarter(Integer canBarter) {
        this.canBarter = canBarter;
    }

    /**
     * 是否是系统类型1：是 ，0不是
     * @return isSysDef 是否是系统类型1：是 ，0不是
     */
    public Integer getIsSysDef() {
        return isSysDef;
    }

    /**
     * 是否是系统类型1：是 ，0不是
     * @param isSysDef 是否是系统类型1：是 ，0不是
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
     * 状态 1：可用 0：禁用
     * @return status 状态 1：可用 0：禁用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态 1：可用 0：禁用
     * @param status 状态 1：可用 0：禁用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}