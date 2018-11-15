package com.jr.erp.sys.set.purchase.entity;

import com.jr.erp.base.mybatis.BaseEntity;

public class PurchaseSechemeItem extends BaseEntity {
    /**
     * 策略id
     */
    private Integer sechemeId;

    /**
     * 列名称
     */
    private String dbColumn;

    /**
     * 对应的bean的属性
     */
    private String beanColumn;

    /**
     * 显示名称
     */
    private String showName;

    /**
     * 参数类型 0：字符串，1：整数，2：double数字，3：通用类型
     */
    private Integer paramType;

    /**
     * 小数位数：当paramType为2时才有效
     */
    private Integer digits;

    /**
     * 通用类型的编码
     */
    private String baseClassKey;

    /**
     * 是否是必填字段 0：不是，1：是
     */
    private Integer mustColumn;

    /**
     * 列顺序号
     */
    private Integer orderColumn;

    /**
     * 策略id
     * @return sechemeId 策略id
     */
    public Integer getSechemeId() {
        return sechemeId;
    }

    /**
     * 策略id
     * @param sechemeId 策略id
     */
    public void setSechemeId(Integer sechemeId) {
        this.sechemeId = sechemeId;
    }

    /**
     * 列名称
     * @return dbColumn 列名称
     */
    public String getDbColumn() {
        return dbColumn;
    }

    /**
     * 列名称
     * @param dbColumn 列名称
     */
    public void setDbColumn(String dbColumn) {
        this.dbColumn = dbColumn == null ? null : dbColumn.trim();
    }

    /**
     * 对应的bean的属性
     * @return beanColumn 对应的bean的属性
     */
    public String getBeanColumn() {
        return beanColumn;
    }

    /**
     * 对应的bean的属性
     * @param beanColumn 对应的bean的属性
     */
    public void setBeanColumn(String beanColumn) {
        this.beanColumn = beanColumn == null ? null : beanColumn.trim();
    }

    /**
     * 显示名称
     * @return showName 显示名称
     */
    public String getShowName() {
        return showName;
    }

    /**
     * 显示名称
     * @param showName 显示名称
     */
    public void setShowName(String showName) {
        this.showName = showName == null ? null : showName.trim();
    }

    /**
     * 参数类型 0：字符串，1：整数，2：double数字，3：通用类型
     * @return paramType 参数类型 0：字符串，1：整数，2：double数字，3：通用类型
     */
    public Integer getParamType() {
        return paramType;
    }

    /**
     * 参数类型 0：字符串，1：整数，2：double数字，3：通用类型
     * @param paramType 参数类型 0：字符串，1：整数，2：double数字，3：通用类型
     */
    public void setParamType(Integer paramType) {
        this.paramType = paramType;
    }

    /**
     * 小数位数：当paramType为2时才有效
     * @return digits 小数位数：当paramType为2时才有效
     */
    public Integer getDigits() {
        return digits;
    }

    /**
     * 小数位数：当paramType为2时才有效
     * @param digits 小数位数：当paramType为2时才有效
     */
    public void setDigits(Integer digits) {
        this.digits = digits;
    }

    /**
     * 通用类型的编码
     * @return baseClassKey 通用类型的编码
     */
    public String getBaseClassKey() {
        return baseClassKey;
    }

    /**
     * 通用类型的编码
     * @param baseClassKey 通用类型的编码
     */
    public void setBaseClassKey(String baseClassKey) {
        this.baseClassKey = baseClassKey == null ? null : baseClassKey.trim();
    }

    /**
     * 是否是必填字段 0：不是，1：是
     * @return mustColumn 是否是必填字段 0：不是，1：是
     */
    public Integer getMustColumn() {
        return mustColumn;
    }

    /**
     * 是否是必填字段 0：不是，1：是
     * @param mustColumn 是否是必填字段 0：不是，1：是
     */
    public void setMustColumn(Integer mustColumn) {
        this.mustColumn = mustColumn;
    }

    /**
     * 列顺序号
     * @return orderColumn 列顺序号
     */
    public Integer getOrderColumn() {
        return orderColumn;
    }

    /**
     * 列顺序号
     * @param orderColumn 列顺序号
     */
    public void setOrderColumn(Integer orderColumn) {
        this.orderColumn = orderColumn;
    }
}