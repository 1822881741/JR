package com.jr.erp.sys.entity;

import com.jr.erp.base.mybatis.BaseEntity;
import java.util.Date;

public class SysUser extends BaseEntity {
    /**
     * 登录名
     */
    private String loginNo;

    /**
     * 密码
     */
    private String password;

    /**
     * 0：公司管理员，1：总部财务人员，2：总部物流人员，3：店长，4：店员，99：系统超级管理员
     */
    private Integer userType;

    /**
     * 真实名称
     */
    private String realName;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 头像地址
     */
    private String img;

    /**
     * 用户的两位单号前缀，纯数字
     */
    private String userSheetNoPrefix;

    /**
     * 用户所属部门或门店的地区的编码，每三位一个级别
     */
    private String areaCode;

    /**
     * 是否已经删除：0未删除，1：已经删除
     */
    private Boolean status;

    /**
     * 性别:0男，1女
     */
    private String sex;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 最后登录时间
     */
    private Date lastLoginTime;

    /**
     * 是否允许免加密狗登录：1：允许，0：不允许
     */
    private Boolean loginType;

    /**
     * 登录名
     * @return loginNo 登录名
     */
    public String getLoginNo() {
        return loginNo;
    }

    /**
     * 登录名
     * @param loginNo 登录名
     */
    public void setLoginNo(String loginNo) {
        this.loginNo = loginNo == null ? null : loginNo.trim();
    }

    /**
     * 密码
     * @return password 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 0：公司管理员，1：总部财务人员，2：总部物流人员，3：店长，4：店员，99：系统超级管理员
     * @return userType 0：公司管理员，1：总部财务人员，2：总部物流人员，3：店长，4：店员，99：系统超级管理员
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 0：公司管理员，1：总部财务人员，2：总部物流人员，3：店长，4：店员，99：系统超级管理员
     * @param userType 0：公司管理员，1：总部财务人员，2：总部物流人员，3：店长，4：店员，99：系统超级管理员
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 真实名称
     * @return realName 真实名称
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 真实名称
     * @param realName 真实名称
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 手机号码
     * @return mobile 手机号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机号码
     * @param mobile 手机号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 头像地址
     * @return img 头像地址
     */
    public String getImg() {
        return img;
    }

    /**
     * 头像地址
     * @param img 头像地址
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * 用户的两位单号前缀，纯数字
     * @return userSheetNoPrefix 用户的两位单号前缀，纯数字
     */
    public String getUserSheetNoPrefix() {
        return userSheetNoPrefix;
    }

    /**
     * 用户的两位单号前缀，纯数字
     * @param userSheetNoPrefix 用户的两位单号前缀，纯数字
     */
    public void setUserSheetNoPrefix(String userSheetNoPrefix) {
        this.userSheetNoPrefix = userSheetNoPrefix == null ? null : userSheetNoPrefix.trim();
    }

    /**
     * 用户所属部门或门店的地区的编码，每三位一个级别
     * @return areaCode 用户所属部门或门店的地区的编码，每三位一个级别
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 用户所属部门或门店的地区的编码，每三位一个级别
     * @param areaCode 用户所属部门或门店的地区的编码，每三位一个级别
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * 是否已经删除：0未删除，1：已经删除
     * @return status 是否已经删除：0未删除，1：已经删除
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 是否已经删除：0未删除，1：已经删除
     * @param status 是否已经删除：0未删除，1：已经删除
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 性别:0男，1女
     * @return sex 性别:0男，1女
     */
    public String getSex() {
        return sex;
    }

    /**
     * 性别:0男，1女
     * @param sex 性别:0男，1女
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 修改时间
     * @return modifyTime 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 最后登录时间
     * @return lastLoginTime 最后登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 最后登录时间
     * @param lastLoginTime 最后登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 是否允许免加密狗登录：1：允许，0：不允许
     * @return loginType 是否允许免加密狗登录：1：允许，0：不允许
     */
    public Boolean getLoginType() {
        return loginType;
    }

    /**
     * 是否允许免加密狗登录：1：允许，0：不允许
     * @param loginType 是否允许免加密狗登录：1：允许，0：不允许
     */
    public void setLoginType(Boolean loginType) {
        this.loginType = loginType;
    }
}