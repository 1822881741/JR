package cn.jiafeng.erp.data.adapter.dao.entity;

import java.util.Date;

/**
 * 系统用户 实体类
 * 
 * @author 
 * @date 2018-11-12
 */
public class User implements java.io.Serializable{

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
     * 登录名 
     */
    private String loginNo;

    /**
     * 0：公司管理员，1：总部财务人员，2：总部物流人员，3：店长，4：店员，99：系统超级管理员 
     */
    private Boolean userType;

    /**
     * 密码 
     */
    private String password;

    /**
     * 真实名称 
     */
    private String realName;

    /**
     * 角色ID 
     */
    private Integer roleId;

    /**
     * 角色名称 
     */
    private String roleName;

    /**
     * 性别:0男，1女 
     */
    private Boolean sex;

    /**
     * 手机号码 
     */
    private String mobile;

    /**
     * 头像地址 
     */
    private String photoUrl;

    /**
     * 用户的两位单号前缀，纯数字 
     */
    private String userSheetNoPrefix;

    /**
     * 用户所属部门或门店的地区的编码，每三位一个级别 
     */
    private String areaCode;

    /**
     * 是否锁定用户：0未锁定；1：锁定 
     */
    private Boolean locked;

    /**
     * 是否已经删除：0未删除，1：已经删除 
     */
    private Boolean delFlag;

    /**
     * 创建时间 
     */
    private Date createTime;

    /**
     * 修改时间 
     */
    private Date modifyTime;

    /**
     * 最后登录时间 
     */
    private Date lastLoginTime;

    /**
     * 是否能查看敏感字段，1：可以，非1：不可以 
     */
    private Boolean sensitiveRight;

    /**
     * 敏感字段列表 
     */
    private String sensitiveFields;

    /**
     * 会员管理权限 
     */
    private Boolean custMgr;

    /**
     * 会员管理详细权限 
     */
    private String custRightJson;

    /**
     * 是否可修改单据日期，1：可以，0 :不可以 
     */
    private Boolean modifySheetDate;

    /**
     * 是否可跨结账日修改单据日期，1：可以，0 :不可以 
     */
    private Boolean modifySheetDate2;

    /**
     * 是否允许免加密狗登录：1：允许，0：不允许 
     */
    private Boolean canLoginType1;

    /**
     * 是否限定了日报查询范围0 :否，1：是 
     */
    private Boolean dailyReportLimit;

    /**
     * 日报查询范围 
     */
    private Integer dailyReportLimitDay;


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
    

    public void setLoginNo(String loginNo) {
        this.loginNo = loginNo;
    }
    
    public String getLoginNo() {
        return this.loginNo;
    }
    

    public void setUserType(Boolean userType) {
        this.userType = userType;
    }
    
    public Boolean getUserType() {
        return this.userType;
    }
    

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return this.password;
    }
    

    public void setRealName(String realName) {
        this.realName = realName;
    }
    
    public String getRealName() {
        return this.realName;
    }
    

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    
    public Integer getRoleId() {
        return this.roleId;
    }
    

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    public String getRoleName() {
        return this.roleName;
    }
    

    public void setSex(Boolean sex) {
        this.sex = sex;
    }
    
    public Boolean getSex() {
        return this.sex;
    }
    

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    public String getMobile() {
        return this.mobile;
    }
    

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
    
    public String getPhotoUrl() {
        return this.photoUrl;
    }
    

    public void setUserSheetNoPrefix(String userSheetNoPrefix) {
        this.userSheetNoPrefix = userSheetNoPrefix;
    }
    
    public String getUserSheetNoPrefix() {
        return this.userSheetNoPrefix;
    }
    

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    
    public String getAreaCode() {
        return this.areaCode;
    }
    

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }
    
    public Boolean getLocked() {
        return this.locked;
    }
    

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }
    
    public Boolean getDelFlag() {
        return this.delFlag;
    }
    

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public Date getCreateTime() {
        return this.createTime;
    }
    

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
    
    public Date getModifyTime() {
        return this.modifyTime;
    }
    

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
    
    public Date getLastLoginTime() {
        return this.lastLoginTime;
    }
    

    public void setSensitiveRight(Boolean sensitiveRight) {
        this.sensitiveRight = sensitiveRight;
    }
    
    public Boolean getSensitiveRight() {
        return this.sensitiveRight;
    }
    

    public void setSensitiveFields(String sensitiveFields) {
        this.sensitiveFields = sensitiveFields;
    }
    
    public String getSensitiveFields() {
        return this.sensitiveFields;
    }
    

    public void setCustMgr(Boolean custMgr) {
        this.custMgr = custMgr;
    }
    
    public Boolean getCustMgr() {
        return this.custMgr;
    }
    

    public void setCustRightJson(String custRightJson) {
        this.custRightJson = custRightJson;
    }
    
    public String getCustRightJson() {
        return this.custRightJson;
    }
    

    public void setModifySheetDate(Boolean modifySheetDate) {
        this.modifySheetDate = modifySheetDate;
    }
    
    public Boolean getModifySheetDate() {
        return this.modifySheetDate;
    }
    

    public void setModifySheetDate2(Boolean modifySheetDate2) {
        this.modifySheetDate2 = modifySheetDate2;
    }
    
    public Boolean getModifySheetDate2() {
        return this.modifySheetDate2;
    }
    

    public void setCanLoginType1(Boolean canLoginType1) {
        this.canLoginType1 = canLoginType1;
    }
    
    public Boolean getCanLoginType1() {
        return this.canLoginType1;
    }
    

    public void setDailyReportLimit(Boolean dailyReportLimit) {
        this.dailyReportLimit = dailyReportLimit;
    }
    
    public Boolean getDailyReportLimit() {
        return this.dailyReportLimit;
    }
    

    public void setDailyReportLimitDay(Integer dailyReportLimitDay) {
        this.dailyReportLimitDay = dailyReportLimitDay;
    }
    
    public Integer getDailyReportLimitDay() {
        return this.dailyReportLimitDay;
    }
    

}
