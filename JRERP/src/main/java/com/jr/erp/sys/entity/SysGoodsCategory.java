package com.jr.erp.sys.entity;

import com.jr.erp.base.mybatis.BaseEntity;

public class SysGoodsCategory extends BaseEntity {
    /**
     * 系统系统代码（根据商品大类自动产生）
     */
    private String systemCode;

    /**
     * 助记码
     */
    private String assistCode;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 大类名称
     */
    private String firstTypeName;

    /**
     * 大类
     */
    private String firstType;

    /**
     * 商品中类名称
     */
    private String secondTypeName;

    /**
     * 商品中类
     */
    private String secondType;

    /**
     * 销售方式 1：按折扣 2：按金价 3：按金工石销售
     */
    private Integer saleType;

    /**
     * 是否可兑换 1：可以，0：不可用
     */
    private Integer canBarter;

    /**
     * 金
     */
    private String goldName;

    /**
     * 石
     */
    private String jewelName;

    /**
     * 品
     */
    private String categoryName;

    /**
     * 成色
     */
    private String goldPercent;

    /**
     * 统计大类
     */
    private String firstClassify;

    /**
     * 统计中类
     */
    private String secondClassify;

    /**
     * 统计小类
     */
    private String thirdClassify;

    /**
     * 标签名称
     */
    private String labelName;

    /**
     * 标签文件
     */
    private String grfName;

    /**
     * 当前状态 1：使用中，0：禁用
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 系统系统代码（根据商品大类自动产生）
     * @return systemCode 系统系统代码（根据商品大类自动产生）
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * 系统系统代码（根据商品大类自动产生）
     * @param systemCode 系统系统代码（根据商品大类自动产生）
     */
    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode == null ? null : systemCode.trim();
    }

    /**
     * 助记码
     * @return assistCode 助记码
     */
    public String getAssistCode() {
        return assistCode;
    }

    /**
     * 助记码
     * @param assistCode 助记码
     */
    public void setAssistCode(String assistCode) {
        this.assistCode = assistCode == null ? null : assistCode.trim();
    }

    /**
     * 商品名称
     * @return goodsName 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 商品名称
     * @param goodsName 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
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
     * 大类
     * @return firstType 大类
     */
    public String getFirstType() {
        return firstType;
    }

    /**
     * 大类
     * @param firstType 大类
     */
    public void setFirstType(String firstType) {
        this.firstType = firstType == null ? null : firstType.trim();
    }

    /**
     * 商品中类名称
     * @return secondTypeName 商品中类名称
     */
    public String getSecondTypeName() {
        return secondTypeName;
    }

    /**
     * 商品中类名称
     * @param secondTypeName 商品中类名称
     */
    public void setSecondTypeName(String secondTypeName) {
        this.secondTypeName = secondTypeName == null ? null : secondTypeName.trim();
    }

    /**
     * 商品中类
     * @return secondType 商品中类
     */
    public String getSecondType() {
        return secondType;
    }

    /**
     * 商品中类
     * @param secondType 商品中类
     */
    public void setSecondType(String secondType) {
        this.secondType = secondType == null ? null : secondType.trim();
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
     * 金
     * @return goldName 金
     */
    public String getGoldName() {
        return goldName;
    }

    /**
     * 金
     * @param goldName 金
     */
    public void setGoldName(String goldName) {
        this.goldName = goldName == null ? null : goldName.trim();
    }

    /**
     * 石
     * @return jewelName 石
     */
    public String getJewelName() {
        return jewelName;
    }

    /**
     * 石
     * @param jewelName 石
     */
    public void setJewelName(String jewelName) {
        this.jewelName = jewelName == null ? null : jewelName.trim();
    }

    /**
     * 品
     * @return categoryName 品
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 品
     * @param categoryName 品
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * 成色
     * @return goldPercent 成色
     */
    public String getGoldPercent() {
        return goldPercent;
    }

    /**
     * 成色
     * @param goldPercent 成色
     */
    public void setGoldPercent(String goldPercent) {
        this.goldPercent = goldPercent == null ? null : goldPercent.trim();
    }

    /**
     * 统计大类
     * @return firstClassify 统计大类
     */
    public String getFirstClassify() {
        return firstClassify;
    }

    /**
     * 统计大类
     * @param firstClassify 统计大类
     */
    public void setFirstClassify(String firstClassify) {
        this.firstClassify = firstClassify == null ? null : firstClassify.trim();
    }

    /**
     * 统计中类
     * @return secondClassify 统计中类
     */
    public String getSecondClassify() {
        return secondClassify;
    }

    /**
     * 统计中类
     * @param secondClassify 统计中类
     */
    public void setSecondClassify(String secondClassify) {
        this.secondClassify = secondClassify == null ? null : secondClassify.trim();
    }

    /**
     * 统计小类
     * @return thirdClassify 统计小类
     */
    public String getThirdClassify() {
        return thirdClassify;
    }

    /**
     * 统计小类
     * @param thirdClassify 统计小类
     */
    public void setThirdClassify(String thirdClassify) {
        this.thirdClassify = thirdClassify == null ? null : thirdClassify.trim();
    }

    /**
     * 标签名称
     * @return labelName 标签名称
     */
    public String getLabelName() {
        return labelName;
    }

    /**
     * 标签名称
     * @param labelName 标签名称
     */
    public void setLabelName(String labelName) {
        this.labelName = labelName == null ? null : labelName.trim();
    }

    /**
     * 标签文件
     * @return grfName 标签文件
     */
    public String getGrfName() {
        return grfName;
    }

    /**
     * 标签文件
     * @param grfName 标签文件
     */
    public void setGrfName(String grfName) {
        this.grfName = grfName == null ? null : grfName.trim();
    }

    /**
     * 当前状态 1：使用中，0：禁用
     * @return status 当前状态 1：使用中，0：禁用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 当前状态 1：使用中，0：禁用
     * @param status 当前状态 1：使用中，0：禁用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}