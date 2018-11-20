package cn.jiafeng.erp.data.adapter.dao.entity;


/**
 * 商品档案表 实体类
 * 
 * @author 
 * @date 2018-11-12
 */
public class GoodsArchives implements java.io.Serializable{

    /**
     * 序列化版本号
     */
    
    /**
     * id 
     */
    private Integer id;

    /**
     * 公司编号 
     */
    private String companyNo;

    /**
     * 系统代码（根据商品大类自动产生） 
     */
    private String systemCode;

    /**
     * 名称 
     */
    private String name;

    /**
     * 商品所属大类（固定类别） 
     */
    private String mainType;

    /**
     * 名称的英文名称，用于分类 
     */
    private String mainTypePrefix;

    /**
     * 金类 
     */
    private String goldType;

    /**
     * 石类 
     */
    private String stoneType;

    /**
     * 品类 
     */
    private String categoryType;

    /**
     * 当前状态 0：使用中，1：禁用 
     */
    private Boolean status;

    /**
     * 助记码 
     */
    private String assistCode;

    /**
     * 备注 
     */
    private String remark;

    /**
     * 创建时间 
     */
    private String createTime;

    /**
     * 别名 
     */
    private String aliasName;

    /**
     * 商品分类（与下面的几个分类都是商品名称做分类用的，只是出于不同角度） 
     */
    private String goodsClassify;

    /**
     * 统计分类 
     */
    private String statsClassify;

    /**
     * 成本分类 
     */
    private String costClassify;

    /**
     * 扩展统计分类1 
     */
    private String extClassify1;

    /**
     * 扩展统计分类2 
     */
    private String extClassify2;

    /**
     * 标签文件 
     */
    private String grfName;

    /**
     * 是否标记为礼品:0不是；1：是 
     */
    private Boolean giftTag;

    /**
     * 标价金额 
     */
    private Double labelPrice;


    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return this.id;
    }
    

    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
    }
    
    public String getCompanyNo() {
        return this.companyNo;
    }
    

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }
    
    public String getSystemCode() {
        return this.systemCode;
    }
    

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    

    public void setMainType(String mainType) {
        this.mainType = mainType;
    }
    
    public String getMainType() {
        return this.mainType;
    }
    

    public void setMainTypePrefix(String mainTypePrefix) {
        this.mainTypePrefix = mainTypePrefix;
    }
    
    public String getMainTypePrefix() {
        return this.mainTypePrefix;
    }
    

    public void setGoldType(String goldType) {
        this.goldType = goldType;
    }
    
    public String getGoldType() {
        return this.goldType;
    }
    

    public void setStoneType(String stoneType) {
        this.stoneType = stoneType;
    }
    
    public String getStoneType() {
        return this.stoneType;
    }
    

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }
    
    public String getCategoryType() {
        return this.categoryType;
    }
    

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    public Boolean getStatus() {
        return this.status;
    }
    

    public void setAssistCode(String assistCode) {
        this.assistCode = assistCode;
    }
    
    public String getAssistCode() {
        return this.assistCode;
    }
    

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public String getRemark() {
        return this.remark;
    }
    

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    
    public String getCreateTime() {
        return this.createTime;
    }
    

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }
    
    public String getAliasName() {
        return this.aliasName;
    }
    

    public void setGoodsClassify(String goodsClassify) {
        this.goodsClassify = goodsClassify;
    }
    
    public String getGoodsClassify() {
        return this.goodsClassify;
    }
    

    public void setStatsClassify(String statsClassify) {
        this.statsClassify = statsClassify;
    }
    
    public String getStatsClassify() {
        return this.statsClassify;
    }
    

    public void setCostClassify(String costClassify) {
        this.costClassify = costClassify;
    }
    
    public String getCostClassify() {
        return this.costClassify;
    }
    

    public void setExtClassify1(String extClassify1) {
        this.extClassify1 = extClassify1;
    }
    
    public String getExtClassify1() {
        return this.extClassify1;
    }
    

    public void setExtClassify2(String extClassify2) {
        this.extClassify2 = extClassify2;
    }
    
    public String getExtClassify2() {
        return this.extClassify2;
    }
    

    public void setGrfName(String grfName) {
        this.grfName = grfName;
    }
    
    public String getGrfName() {
        return this.grfName;
    }
    

    public void setGiftTag(Boolean giftTag) {
        this.giftTag = giftTag;
    }
    
    public Boolean getGiftTag() {
        return this.giftTag;
    }
    

    public void setLabelPrice(Double labelPrice) {
        this.labelPrice = labelPrice;
    }
    
    public Double getLabelPrice() {
        return this.labelPrice;
    }
    

}
