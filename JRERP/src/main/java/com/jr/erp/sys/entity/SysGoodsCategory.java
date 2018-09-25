package com.jr.erp.sys.entity;

import com.jr.erp.base.mybatis.BaseEntity;

public class SysGoodsCategory extends BaseEntity {
    /**
     * 系统代码（根据商品大类自动产生）
     */
    private String systemCode;

    /**
     * 助记码
     */
    private String assistCode;

    /**
     * 分类名称
     */
    private String goodsName;

    /**
     * 商品大类
     */
    private String firstType;

    /**
     * 商品大类英文
     */
    private String firstTypePrefix;

    /**
     * 商品中类
     */
    private String secondType;

    /**
     * 商品中类英文
     */
    private String secondTypePrefix;

    /**
     * 入库方式 1：一码一货 2：支持一码多货
     */
    private Integer incomeType;

    /**
     * 销售方式 1：按折扣 2：按金价 3：按照系统价格表
     */
    private Integer saleType;

    /**
     * 是否可兑换 1：可以，0：不可用
     */
    private Integer canBarter;

    /**
     * 金类
     */
    private String goldName;

    /**
     * 石类
     */
    private String jewelName;

    /**
     * 品类
     */
    private String categoryName;

    /**
     * 金成色
     */
    private String goldPercent;

    /**
     * 当前状态 1：使用中，0：禁用
     */
    private Integer status;

    /**
     * 商品分类
     */
    private String factClass;

    /**
     * 统计分类
     */
    private String statsClass;

    /**
     * 标签显示名称
     */
    private String labelName;

    /**
     * 标签文件
     */
    private String grfName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 系统代码（根据商品大类自动产生）
     * @return systemCode 系统代码（根据商品大类自动产生）
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * 系统代码（根据商品大类自动产生）
     * @param systemCode 系统代码（根据商品大类自动产生）
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
     * 分类名称
     * @return goodsName 分类名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 分类名称
     * @param goodsName 分类名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * 商品大类
     * @return firstType 商品大类
     */
    public String getFirstType() {
        return firstType;
    }

    /**
     * 商品大类
     * @param firstType 商品大类
     */
    public void setFirstType(String firstType) {
        this.firstType = firstType == null ? null : firstType.trim();
    }

    /**
     * 商品大类英文
     * @return firstTypePrefix 商品大类英文
     */
    public String getFirstTypePrefix() {
        return firstTypePrefix;
    }

    /**
     * 商品大类英文
     * @param firstTypePrefix 商品大类英文
     */
    public void setFirstTypePrefix(String firstTypePrefix) {
        this.firstTypePrefix = firstTypePrefix == null ? null : firstTypePrefix.trim();
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
     * 商品中类英文
     * @return secondTypePrefix 商品中类英文
     */
    public String getSecondTypePrefix() {
        return secondTypePrefix;
    }

    /**
     * 商品中类英文
     * @param secondTypePrefix 商品中类英文
     */
    public void setSecondTypePrefix(String secondTypePrefix) {
        this.secondTypePrefix = secondTypePrefix == null ? null : secondTypePrefix.trim();
    }

    /**
     * 入库方式 1：一码一货 2：支持一码多货
     * @return incomeType 入库方式 1：一码一货 2：支持一码多货
     */
    public Integer getIncomeType() {
        return incomeType;
    }

    /**
     * 入库方式 1：一码一货 2：支持一码多货
     * @param incomeType 入库方式 1：一码一货 2：支持一码多货
     */
    public void setIncomeType(Integer incomeType) {
        this.incomeType = incomeType;
    }

    /**
     * 销售方式 1：按折扣 2：按金价 3：按照系统价格表
     * @return saleType 销售方式 1：按折扣 2：按金价 3：按照系统价格表
     */
    public Integer getSaleType() {
        return saleType;
    }

    /**
     * 销售方式 1：按折扣 2：按金价 3：按照系统价格表
     * @param saleType 销售方式 1：按折扣 2：按金价 3：按照系统价格表
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
     * 金类
     * @return goldName 金类
     */
    public String getGoldName() {
        return goldName;
    }

    /**
     * 金类
     * @param goldName 金类
     */
    public void setGoldName(String goldName) {
        this.goldName = goldName == null ? null : goldName.trim();
    }

    /**
     * 石类
     * @return jewelName 石类
     */
    public String getJewelName() {
        return jewelName;
    }

    /**
     * 石类
     * @param jewelName 石类
     */
    public void setJewelName(String jewelName) {
        this.jewelName = jewelName == null ? null : jewelName.trim();
    }

    /**
     * 品类
     * @return categoryName 品类
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 品类
     * @param categoryName 品类
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * 金成色
     * @return goldPercent 金成色
     */
    public String getGoldPercent() {
        return goldPercent;
    }

    /**
     * 金成色
     * @param goldPercent 金成色
     */
    public void setGoldPercent(String goldPercent) {
        this.goldPercent = goldPercent == null ? null : goldPercent.trim();
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
     * 商品分类
     * @return factClass 商品分类
     */
    public String getFactClass() {
        return factClass;
    }

    /**
     * 商品分类
     * @param factClass 商品分类
     */
    public void setFactClass(String factClass) {
        this.factClass = factClass == null ? null : factClass.trim();
    }

    /**
     * 统计分类
     * @return statsClass 统计分类
     */
    public String getStatsClass() {
        return statsClass;
    }

    /**
     * 统计分类
     * @param statsClass 统计分类
     */
    public void setStatsClass(String statsClass) {
        this.statsClass = statsClass == null ? null : statsClass.trim();
    }

    /**
     * 标签显示名称
     * @return labelName 标签显示名称
     */
    public String getLabelName() {
        return labelName;
    }

    /**
     * 标签显示名称
     * @param labelName 标签显示名称
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