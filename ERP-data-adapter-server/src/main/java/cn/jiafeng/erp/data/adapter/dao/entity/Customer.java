package cn.jiafeng.erp.data.adapter.dao.entity;

import java.util.Date;

/**
 * 客户会员表 实体类
 * 
 * @author 
 * @date 2018-11-12
 */
public class Customer implements java.io.Serializable{

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
     * 客户姓名 
     */
    private String cusName;

    /**
     * 会员卡号 
     */
    private String vipCardNo;

    /**
     * 关联的会员卡等级表ID；默认的临时卡级别为-1 
     */
    private Integer vipCardLevelId;

    /**
     * 会员卡级别,临时卡：只在销售单中记录了姓名和手机号的；金卡、银卡、钻石卡（已经分配会员卡号的） 
     */
    private String vipCardLevel;

    /**
     * 发卡时间 
     */
    private String sendDate;

    /**
     * 手机号 
     */
    private String mobile;

    /**
     * 当前积分 
     */
    private Integer pointTotal;

    /**
     * 总消费金额 
     */
    private Double consumpAmountTotal;

    /**
     * 客户级别0：普通客户，没有会员卡,销售时自动创建的客户，1：正式会员，有会员卡 
     */
    private Boolean type;

    /**
     * 备注 
     */
    private String remarks;

    /**
     * 创建时间 
     */
    private Date createTime;

    /**
     * 修改日期 
     */
    private Date modifyTime;

    /**
     * 生日 
     */
    private Date birthday;

    /**
     * 生日类型,1表示公历,2表示阳历 
     */
    private Integer birthdayType;

    /**
     * 结婚纪恋日：不再维护 
     */
    private Date weddingAnniversary;

    /**
     * 身份证 
     */
    private String identityCards;

    /**
     * 来源 
     */
    private String source;

    /**
     * qq号码 
     */
    private String qq;

    /**
     * 电话：不再维护 
     */
    private String telephone;

    /**
     * 门店ID 
     */
    private Integer shopId;

    /**
     * 门店名称 
     */
    private String shopName;

    /**
     * 操作员ID 
     */
    private Integer operatorId;

    /**
     * 操作员名称 
     */
    private String operatorName;

    /**
     * 地址 
     */
    private String address;

    /**
     * 1表示会员有效,2表示会员无效;-不再维护 
     */
    private Integer status;

    /**
     * 照片地址 
     */
    private String pictureUrl;

    /**
     * 1表示男,2表示女 
     */
    private Integer sex;

    /**
     * 年龄：不再维护，使用生日自动计算 
     */
    private Integer age;

    /**
     * 经办人ID，门店的业务员ID,可为空 
     */
    private Integer agentId;

    /**
     * 经办人名称 
     */
    private String agentName;

    /**
     * 客户偏好: 从购买偏好数据中多选，多个以‘,’分隔 
     */
    private String purchaPreferences;

    /**
     * 兴趣爱好:从兴趣偏好数据中多选，多个以‘,’分隔 
     */
    private String hobby;

    /**
     * 职业: 从职业表中选择 
     */
    private String profession;

    /**
     * 所在省: 从全国区域表数据中选择 
     */
    private String province;

    /**
     * 所在市: 从全国区域表数据中选择 
     */
    private String city;

    /**
     * 所在区: 从全国区域表数据中选择 
     */
    private String area;

    /**
     * 微信昵称 
     */
    private String weiXinNi;

    /**
     * 微信OpenId 
     */
    private String openId;

    /**
     * 微信关注状态:0尚未关注；1：已经关注；2：取消关注 
     */
    private Boolean wxFocusStatus;

    /**
     * 介绍人id:   关联会员ID,可为空 
     */
    private Integer referencesId;

    /**
     * 介绍人名称 
     */
    private String referencesName;

    /**
     * 可用积分 
     */
    private Integer availablePoints;

    /**
     * 最近一次消费（业务）时间（销售、销退、兑换、兑换退） 
     */
    private Date recentBusinessTime;

    /**
     * 业务次数（累加，同recentBusinessTime计数） 
     */
    private Integer businessTimeNum;

    /**
     * 最近一次回访时间 
     */
    private Date recentVisitTime;

    /**
     * 流失状态:0:未流失：1：流失 
     */
    private Boolean lossStatus;

    /**
     * 会员状态:0：正常；1：已经冻结;......可扩展 
     */
    private Boolean custStatus;

    /**
     * 资料完整度:0~100的数值； 
     */
    private Boolean integralDegree;

    /**
     * 纪念日1类型 类型：结婚纪念日、老婆(公)生日、......... 
     */
    private String anniversaries1Type;

    /**
     * 纪念日1日期 
     */
    private Date anniversaries1Date;

    /**
     * 纪念日2类型 
     */
    private String anniversaries2Type;

    /**
     * 纪念日2日期 
     */
    private Date anniversaries2Date;

    /**
     * 纪念日3类型 
     */
    private String anniversaries3Type;

    /**
     * 纪念日3日期 
     */
    private Date anniversaries3Date;

    /**
     * 动态积分:与会员卡级别挂钩；可以动态调整 
     */
    private Integer points4Level;

    /**
     * 动态销售额:与会员卡级别挂钩；可以动态调整 
     */
    private Integer consumAmount4Level;

    /**
     * 数据地区码 
     */
    private String areaCode;

    /**
     * 名称拼音 
     */
    private String nameAbc;

    /**
     * 名称拼音首字母 
     */
    private String nameAbcShort;

    /**
     * 转换为公历后的年月日yyyy-mm-dd 
     */
    private String birthday4Background;

    /**
     * 标记是否来自知客来创建的用户:0:不是；1：是 
     */
    private Boolean fromZkl;


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
    

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }
    
    public String getCusName() {
        return this.cusName;
    }
    

    public void setVipCardNo(String vipCardNo) {
        this.vipCardNo = vipCardNo;
    }
    
    public String getVipCardNo() {
        return this.vipCardNo;
    }
    

    public void setVipCardLevelId(Integer vipCardLevelId) {
        this.vipCardLevelId = vipCardLevelId;
    }
    
    public Integer getVipCardLevelId() {
        return this.vipCardLevelId;
    }
    

    public void setVipCardLevel(String vipCardLevel) {
        this.vipCardLevel = vipCardLevel;
    }
    
    public String getVipCardLevel() {
        return this.vipCardLevel;
    }
    

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }
    
    public String getSendDate() {
        return this.sendDate;
    }
    

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    public String getMobile() {
        return this.mobile;
    }
    

    public void setPointTotal(Integer pointTotal) {
        this.pointTotal = pointTotal;
    }
    
    public Integer getPointTotal() {
        return this.pointTotal;
    }
    

    public void setConsumpAmountTotal(Double consumpAmountTotal) {
        this.consumpAmountTotal = consumpAmountTotal;
    }
    
    public Double getConsumpAmountTotal() {
        return this.consumpAmountTotal;
    }
    

    public void setType(Boolean type) {
        this.type = type;
    }
    
    public Boolean getType() {
        return this.type;
    }
    

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    public String getRemarks() {
        return this.remarks;
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
    

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    public Date getBirthday() {
        return this.birthday;
    }
    

    public void setBirthdayType(Integer birthdayType) {
        this.birthdayType = birthdayType;
    }
    
    public Integer getBirthdayType() {
        return this.birthdayType;
    }
    

    public void setWeddingAnniversary(Date weddingAnniversary) {
        this.weddingAnniversary = weddingAnniversary;
    }
    
    public Date getWeddingAnniversary() {
        return this.weddingAnniversary;
    }
    

    public void setIdentityCards(String identityCards) {
        this.identityCards = identityCards;
    }
    
    public String getIdentityCards() {
        return this.identityCards;
    }
    

    public void setSource(String source) {
        this.source = source;
    }
    
    public String getSource() {
        return this.source;
    }
    

    public void setQq(String qq) {
        this.qq = qq;
    }
    
    public String getQq() {
        return this.qq;
    }
    

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public String getTelephone() {
        return this.telephone;
    }
    

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
    
    public Integer getShopId() {
        return this.shopId;
    }
    

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    
    public String getShopName() {
        return this.shopName;
    }
    

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }
    
    public Integer getOperatorId() {
        return this.operatorId;
    }
    

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
    
    public String getOperatorName() {
        return this.operatorName;
    }
    

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getAddress() {
        return this.address;
    }
    

    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public Integer getStatus() {
        return this.status;
    }
    

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
    
    public String getPictureUrl() {
        return this.pictureUrl;
    }
    

    public void setSex(Integer sex) {
        this.sex = sex;
    }
    
    public Integer getSex() {
        return this.sex;
    }
    

    public void setAge(Integer age) {
        this.age = age;
    }
    
    public Integer getAge() {
        return this.age;
    }
    

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }
    
    public Integer getAgentId() {
        return this.agentId;
    }
    

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }
    
    public String getAgentName() {
        return this.agentName;
    }
    

    public void setPurchaPreferences(String purchaPreferences) {
        this.purchaPreferences = purchaPreferences;
    }
    
    public String getPurchaPreferences() {
        return this.purchaPreferences;
    }
    

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    
    public String getHobby() {
        return this.hobby;
    }
    

    public void setProfession(String profession) {
        this.profession = profession;
    }
    
    public String getProfession() {
        return this.profession;
    }
    

    public void setProvince(String province) {
        this.province = province;
    }
    
    public String getProvince() {
        return this.province;
    }
    

    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCity() {
        return this.city;
    }
    

    public void setArea(String area) {
        this.area = area;
    }
    
    public String getArea() {
        return this.area;
    }
    

    public void setWeiXinNi(String weiXinNi) {
        this.weiXinNi = weiXinNi;
    }
    
    public String getWeiXinNi() {
        return this.weiXinNi;
    }
    

    public void setOpenId(String openId) {
        this.openId = openId;
    }
    
    public String getOpenId() {
        return this.openId;
    }
    

    public void setWxFocusStatus(Boolean wxFocusStatus) {
        this.wxFocusStatus = wxFocusStatus;
    }
    
    public Boolean getWxFocusStatus() {
        return this.wxFocusStatus;
    }
    

    public void setReferencesId(Integer referencesId) {
        this.referencesId = referencesId;
    }
    
    public Integer getReferencesId() {
        return this.referencesId;
    }
    

    public void setReferencesName(String referencesName) {
        this.referencesName = referencesName;
    }
    
    public String getReferencesName() {
        return this.referencesName;
    }
    

    public void setAvailablePoints(Integer availablePoints) {
        this.availablePoints = availablePoints;
    }
    
    public Integer getAvailablePoints() {
        return this.availablePoints;
    }
    

    public void setRecentBusinessTime(Date recentBusinessTime) {
        this.recentBusinessTime = recentBusinessTime;
    }
    
    public Date getRecentBusinessTime() {
        return this.recentBusinessTime;
    }
    

    public void setBusinessTimeNum(Integer businessTimeNum) {
        this.businessTimeNum = businessTimeNum;
    }
    
    public Integer getBusinessTimeNum() {
        return this.businessTimeNum;
    }
    

    public void setRecentVisitTime(Date recentVisitTime) {
        this.recentVisitTime = recentVisitTime;
    }
    
    public Date getRecentVisitTime() {
        return this.recentVisitTime;
    }
    

    public void setLossStatus(Boolean lossStatus) {
        this.lossStatus = lossStatus;
    }
    
    public Boolean getLossStatus() {
        return this.lossStatus;
    }
    

    public void setCustStatus(Boolean custStatus) {
        this.custStatus = custStatus;
    }
    
    public Boolean getCustStatus() {
        return this.custStatus;
    }
    

    public void setIntegralDegree(Boolean integralDegree) {
        this.integralDegree = integralDegree;
    }
    
    public Boolean getIntegralDegree() {
        return this.integralDegree;
    }
    

    public void setAnniversaries1Type(String anniversaries1Type) {
        this.anniversaries1Type = anniversaries1Type;
    }
    
    public String getAnniversaries1Type() {
        return this.anniversaries1Type;
    }
    

    public void setAnniversaries1Date(Date anniversaries1Date) {
        this.anniversaries1Date = anniversaries1Date;
    }
    
    public Date getAnniversaries1Date() {
        return this.anniversaries1Date;
    }
    

    public void setAnniversaries2Type(String anniversaries2Type) {
        this.anniversaries2Type = anniversaries2Type;
    }
    
    public String getAnniversaries2Type() {
        return this.anniversaries2Type;
    }
    

    public void setAnniversaries2Date(Date anniversaries2Date) {
        this.anniversaries2Date = anniversaries2Date;
    }
    
    public Date getAnniversaries2Date() {
        return this.anniversaries2Date;
    }
    

    public void setAnniversaries3Type(String anniversaries3Type) {
        this.anniversaries3Type = anniversaries3Type;
    }
    
    public String getAnniversaries3Type() {
        return this.anniversaries3Type;
    }
    

    public void setAnniversaries3Date(Date anniversaries3Date) {
        this.anniversaries3Date = anniversaries3Date;
    }
    
    public Date getAnniversaries3Date() {
        return this.anniversaries3Date;
    }
    

    public void setPoints4Level(Integer points4Level) {
        this.points4Level = points4Level;
    }
    
    public Integer getPoints4Level() {
        return this.points4Level;
    }
    

    public void setConsumAmount4Level(Integer consumAmount4Level) {
        this.consumAmount4Level = consumAmount4Level;
    }
    
    public Integer getConsumAmount4Level() {
        return this.consumAmount4Level;
    }
    

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    
    public String getAreaCode() {
        return this.areaCode;
    }
    

    public void setNameAbc(String nameAbc) {
        this.nameAbc = nameAbc;
    }
    
    public String getNameAbc() {
        return this.nameAbc;
    }
    

    public void setNameAbcShort(String nameAbcShort) {
        this.nameAbcShort = nameAbcShort;
    }
    
    public String getNameAbcShort() {
        return this.nameAbcShort;
    }
    

    public void setBirthday4Background(String birthday4Background) {
        this.birthday4Background = birthday4Background;
    }
    
    public String getBirthday4Background() {
        return this.birthday4Background;
    }
    

    public void setFromZkl(Boolean fromZkl) {
        this.fromZkl = fromZkl;
    }
    
    public Boolean getFromZkl() {
        return this.fromZkl;
    }
    

}
