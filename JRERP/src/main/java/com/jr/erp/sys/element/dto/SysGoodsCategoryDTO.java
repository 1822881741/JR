package com.jr.erp.sys.element.dto;

public class SysGoodsCategoryDTO {
    
    private String companyNo;
    
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
     * 商品大类英文
     */
    private String firstTypePrefix;

    /**
     * 商品中类英文
     */
    private String[] secondTypePrefix;

    /**
     * 销售方式 1：按折扣 2：按金价
     */
    private Integer saleType;

    /**
     * 是否可兑换 1：可以，0：不可用
     */
    private Integer canBarter;

    /**
     * 金类
     */
    private String[] goldName;

    /**
     * 石类
     */
    private String[] jewelName;

    /**
     * 品类
     */
    private String[] categoryName;

    /**
     * 金成色
     */
    private String[] goldPercent;

    /**
     * 当前状态 1：使用中，0：禁用
     */
    private Integer status;

    /**
     * 统计分类大类
     */
    private String firstClassify;

    /**
     * 统计分类中类
     */
    private String secondClassify;
    
    /**    
     * 统计分类小类
     */    
    private String thirdClassify;

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

    public String getCompanyNo()
    {
        return companyNo;
    }

    public String getSystemCode()
    {
        return systemCode;
    }

    public String getAssistCode()
    {
        return assistCode;
    }

    public String getGoodsName()
    {
        return goodsName;
    }

    public String getFirstTypePrefix()
    {
        return firstTypePrefix;
    }

    public String[] getSecondTypePrefix()
    {
        return secondTypePrefix;
    }

    public Integer getSaleType()
    {
        return saleType;
    }

    public Integer getCanBarter()
    {
        return canBarter;
    }

    public String[] getGoldName()
    {
        return goldName;
    }

    public String[] getJewelName()
    {
        return jewelName;
    }

    public String[] getCategoryName()
    {
        return categoryName;
    }

    public String[] getGoldPercent()
    {
        return goldPercent;
    }

    public Integer getStatus()
    {
        return status;
    }

    public String getFirstClassify()
    {
        return firstClassify;
    }

    public String getSecondClassify()
    {
        return secondClassify;
    }

    public String getThirdClassify()
    {
        return thirdClassify;
    }

    public String getLabelName()
    {
        return labelName;
    }

    public String getGrfName()
    {
        return grfName;
    }

    public String getRemark()
    {
        return remark;
    }

    public void setCompanyNo(String companyNo)
    {
        this.companyNo = companyNo;
    }

    public void setSystemCode(String systemCode)
    {
        this.systemCode = systemCode;
    }

    public void setAssistCode(String assistCode)
    {
        this.assistCode = assistCode;
    }

    public void setGoodsName(String goodsName)
    {
        this.goodsName = goodsName;
    }

    public void setFirstTypePrefix(String firstTypePrefix)
    {
        this.firstTypePrefix = firstTypePrefix;
    }

    public void setSecondTypePrefix(String[] secondTypePrefix)
    {
        this.secondTypePrefix = secondTypePrefix;
    }

    public void setSaleType(Integer saleType)
    {
        this.saleType = saleType;
    }

    public void setCanBarter(Integer canBarter)
    {
        this.canBarter = canBarter;
    }

    public void setGoldName(String[] goldName)
    {
        this.goldName = goldName;
    }

    public void setJewelName(String[] jewelName)
    {
        this.jewelName = jewelName;
    }

    public void setCategoryName(String[] categoryName)
    {
        this.categoryName = categoryName;
    }

    public void setGoldPercent(String[] goldPercent)
    {
        this.goldPercent = goldPercent;
    }

    public void setStatus(Integer status)
    {
        this.status = status;
    }

    public void setFirstClassify(String firstClassify)
    {
        this.firstClassify = firstClassify;
    }

    public void setSecondClassify(String secondClassify)
    {
        this.secondClassify = secondClassify;
    }

    public void setThirdClassify(String thirdClassify)
    {
        this.thirdClassify = thirdClassify;
    }

    public void setLabelName(String labelName)
    {
        this.labelName = labelName;
    }

    public void setGrfName(String grfName)
    {
        this.grfName = grfName;
    }

    public void setRemark(String remark)
    {
        this.remark = remark;
    }
}