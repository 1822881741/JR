package cn.jiafeng.erp.data.adapter.dao.entity;

import java.util.Date;

/**
 * 公司客户 实体类
 * 
 * @author 
 * @date 2018-11-14
 */
public class Company implements java.io.Serializable{

    /**
     * 序列化版本号
     */
    
    /**
     * 自增主键 
     */
    private Integer id;

    /**
     * 公司编码 
     */
    private String companyNo;

    /**
     * 公司名称 
     */
    private String companyName;

    /**
     * 联系人 
     */
    private String linkMan;

    /**
     * 联系人手机号 
     */
    private String mobileNo;

    /**
     * 有效使用时间开始 
     */
    private Date startTime;

    /**
     * 有效使用时间结束 
     */
    private Date endTime;

    /**
     * 是否是测试账户：0：不是；1：是 
     */
    private Boolean testFlag;

    /**
     * 当前状态 0:已删除，1：使用中 
     */
    private Boolean status;

    /**
     * 本公司对应的区域码 
     */
    private String areaCode;

    /**
     * 数据生成时间 
     */
    private Date createTime;

    /**
     * 可建门店个数 
     */
    private Integer shopNum;

    /**
     * 是否允许同步数据:0:否；1:是 
     */
    private Boolean canSynFlag;

    /**
     * 是否自动同步数据:0否；1：是 
     */
    private Boolean autoSynFlag;

    /**
     * 每天开始执行时间:小时(0~23) 
     */
    private Integer startHour;

    /**
     * 每天开始执行时间:分钟(0~59) 
     */
    private Integer startMinute;

    /**
     * 最近一次同步完成时间 
     */
    private Date lastSynTime;

    /**
     * 是否开通了知客来的对接:1：开通了；0:未开通 
     */
    private Boolean zklOpenFlag;

    /**
     * 是否允许免加密狗登录：1：允许，0：不允许 
     */
    private Boolean canLoginType1;

    /**
     * 单据审核模式：0 不启用单据审核；1公司统一设置；2：公司门店单独设置 
     */
    private Boolean sheetAuditModel;

    /**
     * 权限控制方式：0：之前的用户权限；1：新的角色权限控制 
     */
    private Boolean rightModel;

    /**
     * 备注信息 
     */
    private String remarks;

    /**
     * 是否有修改首页名称logo权限（0：否，1：有） 
     */
    private Boolean indexLogoRight;

    /**
     * 是否有更改（0：否，1：是） 
     */
    private Boolean indexChangeFlag;

    /**
     * 首页名称 
     */
    private String indexName;

    /**
     * logo地址 
     */
    private String indexLogo;


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
    

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public String getCompanyName() {
        return this.companyName;
    }
    

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }
    
    public String getLinkMan() {
        return this.linkMan;
    }
    

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    
    public String getMobileNo() {
        return this.mobileNo;
    }
    

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    
    public Date getStartTime() {
        return this.startTime;
    }
    

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    
    public Date getEndTime() {
        return this.endTime;
    }
    

    public void setTestFlag(Boolean testFlag) {
        this.testFlag = testFlag;
    }
    
    public Boolean getTestFlag() {
        return this.testFlag;
    }
    

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    public Boolean getStatus() {
        return this.status;
    }
    

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    
    public String getAreaCode() {
        return this.areaCode;
    }
    

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public Date getCreateTime() {
        return this.createTime;
    }
    

    public void setShopNum(Integer shopNum) {
        this.shopNum = shopNum;
    }
    
    public Integer getShopNum() {
        return this.shopNum;
    }
    

    public void setCanSynFlag(Boolean canSynFlag) {
        this.canSynFlag = canSynFlag;
    }
    
    public Boolean getCanSynFlag() {
        return this.canSynFlag;
    }
    

    public void setAutoSynFlag(Boolean autoSynFlag) {
        this.autoSynFlag = autoSynFlag;
    }
    
    public Boolean getAutoSynFlag() {
        return this.autoSynFlag;
    }
    

    public void setStartHour(Integer startHour) {
        this.startHour = startHour;
    }
    
    public Integer getStartHour() {
        return this.startHour;
    }
    

    public void setStartMinute(Integer startMinute) {
        this.startMinute = startMinute;
    }
    
    public Integer getStartMinute() {
        return this.startMinute;
    }
    

    public void setLastSynTime(Date lastSynTime) {
        this.lastSynTime = lastSynTime;
    }
    
    public Date getLastSynTime() {
        return this.lastSynTime;
    }
    

    public void setZklOpenFlag(Boolean zklOpenFlag) {
        this.zklOpenFlag = zklOpenFlag;
    }
    
    public Boolean getZklOpenFlag() {
        return this.zklOpenFlag;
    }
    

    public void setCanLoginType1(Boolean canLoginType1) {
        this.canLoginType1 = canLoginType1;
    }
    
    public Boolean getCanLoginType1() {
        return this.canLoginType1;
    }
    

    public void setSheetAuditModel(Boolean sheetAuditModel) {
        this.sheetAuditModel = sheetAuditModel;
    }
    
    public Boolean getSheetAuditModel() {
        return this.sheetAuditModel;
    }
    

    public void setRightModel(Boolean rightModel) {
        this.rightModel = rightModel;
    }
    
    public Boolean getRightModel() {
        return this.rightModel;
    }
    

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    public String getRemarks() {
        return this.remarks;
    }
    

    public void setIndexLogoRight(Boolean indexLogoRight) {
        this.indexLogoRight = indexLogoRight;
    }
    
    public Boolean getIndexLogoRight() {
        return this.indexLogoRight;
    }
    

    public void setIndexChangeFlag(Boolean indexChangeFlag) {
        this.indexChangeFlag = indexChangeFlag;
    }
    
    public Boolean getIndexChangeFlag() {
        return this.indexChangeFlag;
    }
    

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }
    
    public String getIndexName() {
        return this.indexName;
    }
    

    public void setIndexLogo(String indexLogo) {
        this.indexLogo = indexLogo;
    }
    
    public String getIndexLogo() {
        return this.indexLogo;
    }
    

}
