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
    private String firstType;

    /**
     * 商品中类英文
     */
    private String[] secondType;

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

    public void setCompanyNo(String companyNo)
    {
        this.companyNo = companyNo;
    }

    public String getSystemCode()
    {
        return systemCode;
    }

    public void setSystemCode(String systemCode)
    {
        this.systemCode = systemCode;
    }

    public String getAssistCode()
    {
        return assistCode;
    }

    public void setAssistCode(String assistCode)
    {
        this.assistCode = assistCode;
    }

    public String getGoodsName()
    {
        return goodsName;
    }

    public void setGoodsName(String goodsName)
    {
        this.goodsName = goodsName;
    }

    public String getFirstType()
    {
        return firstType;
    }

    public void setFirstType(String firstType)
    {
        this.firstType = firstType;
    }

    public String[] getSecondType()
    {
        return secondType;
    }

    public void setSecondType(String[] secondType)
    {
        this.secondType = secondType;
    }

    public Integer getSaleType()
    {
        return saleType;
    }

    public void setSaleType(Integer saleType)
    {
        this.saleType = saleType;
    }

    public Integer getCanBarter()
    {
        return canBarter;
    }

    public void setCanBarter(Integer canBarter)
    {
        this.canBarter = canBarter;
    }

    public String[] getGoldName()
    {
        return goldName;
    }

    public void setGoldName(String[] goldName)
    {
        this.goldName = goldName;
    }

    public String[] getJewelName()
    {
        return jewelName;
    }

    public void setJewelName(String[] jewelName)
    {
        this.jewelName = jewelName;
    }

    public String[] getCategoryName()
    {
        return categoryName;
    }

    public void setCategoryName(String[] categoryName)
    {
        this.categoryName = categoryName;
    }

    public String[] getGoldPercent()
    {
        return goldPercent;
    }

    public void setGoldPercent(String[] goldPercent)
    {
        this.goldPercent = goldPercent;
    }

    public Integer getStatus()
    {
        return status;
    }

    public void setStatus(Integer status)
    {
        this.status = status;
    }

    public String getFirstClassify()
    {
        return firstClassify;
    }

    public void setFirstClassify(String firstClassify)
    {
        this.firstClassify = firstClassify;
    }

    public String getSecondClassify()
    {
        return secondClassify;
    }

    public void setSecondClassify(String secondClassify)
    {
        this.secondClassify = secondClassify;
    }

    public String getThirdClassify()
    {
        return thirdClassify;
    }

    public void setThirdClassify(String thirdClassify)
    {
        this.thirdClassify = thirdClassify;
    }

    public String getLabelName()
    {
        return labelName;
    }

    public void setLabelName(String labelName)
    {
        this.labelName = labelName;
    }

    public String getGrfName()
    {
        return grfName;
    }

    public void setGrfName(String grfName)
    {
        this.grfName = grfName;
    }

    public String getRemark()
    {
        return remark;
    }

    public void setRemark(String remark)
    {
        this.remark = remark;
    }
}