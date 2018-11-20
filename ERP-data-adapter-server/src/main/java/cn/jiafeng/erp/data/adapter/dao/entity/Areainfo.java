package cn.jiafeng.erp.data.adapter.dao.entity;

import java.util.Date;

/**
 * 系统区域，在后台维护，不在前台显示，用于用户数据权限的控制 实体类
 * 
 * @author 
 * @date 2018-11-12
 */
public class Areainfo implements java.io.Serializable{

    /**
     * 序列化版本号
     */
    
    /**
     * 自增主键 
     */
    private Integer id;

    /**
     * 上级地区id 
     */
    private Integer parentId;

    /**
     * 区域名称 
     */
    private String areaName;

    /**
     * 地域的类型：-1组织划分节点；0：公司；1：门店：2：仓库/展柜 
     */
    private Integer areaType;

    /**
     * 地区码 
     */
    private String areaCode;

    /**
     * 数据生成时间 
     */
    private Date createTime;

    /**
     * 当前状态 0：已删除，1：正常 
     */
    private Boolean status;

    /**
     * 是否启用结账日期：公司和门店级节点才有效；0：不启用；1：启用 
     */
    private Boolean useSettleDate;

    /**
     * 每月的结账日期,如25 
     */
    private String monthSettleDay;

    /**
     * 已经结账到的日期,yyyy-mm-dd 
     */
    private String hasSettleDay;


    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return this.id;
    }
    

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
    
    public Integer getParentId() {
        return this.parentId;
    }
    

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
    
    public String getAreaName() {
        return this.areaName;
    }
    

    public void setAreaType(Integer areaType) {
        this.areaType = areaType;
    }
    
    public Integer getAreaType() {
        return this.areaType;
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
    

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    public Boolean getStatus() {
        return this.status;
    }
    

    public void setUseSettleDate(Boolean useSettleDate) {
        this.useSettleDate = useSettleDate;
    }
    
    public Boolean getUseSettleDate() {
        return this.useSettleDate;
    }
    

    public void setMonthSettleDay(String monthSettleDay) {
        this.monthSettleDay = monthSettleDay;
    }
    
    public String getMonthSettleDay() {
        return this.monthSettleDay;
    }
    

    public void setHasSettleDay(String hasSettleDay) {
        this.hasSettleDay = hasSettleDay;
    }
    
    public String getHasSettleDay() {
        return this.hasSettleDay;
    }
    

}
