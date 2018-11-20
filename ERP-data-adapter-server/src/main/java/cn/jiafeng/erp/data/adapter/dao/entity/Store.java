package cn.jiafeng.erp.data.adapter.dao.entity;

import java.util.Date;

/**
 * 仓库、柜台 实体类
 * 
 * @author 
 * @date 2018-11-12
 */
public class Store implements java.io.Serializable{

    /**
     * 序列化版本号
     */
    
    /**
     * 自增主键 
     */
    private Integer id;

    /**
     * 仓库名称 
     */
    private String storeName;

    /**
     * 分类：0：成品柜台；1：旧料柜台 
     */
    private Boolean category;

    /**
     * 属性：0：台面；1：备份 
     */
    private Boolean attri;

    /**
     * 区域编码 
     */
    private String areaCode;

    /**
     * 当前状态 0:停用，1：使用中 
     */
    private Boolean status;

    /**
     * 数据生成时间 
     */
    private Date createTime;


    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return this.id;
    }
    

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    
    public String getStoreName() {
        return this.storeName;
    }
    

    public void setCategory(Boolean category) {
        this.category = category;
    }
    
    public Boolean getCategory() {
        return this.category;
    }
    

    public void setAttri(Boolean attri) {
        this.attri = attri;
    }
    
    public Boolean getAttri() {
        return this.attri;
    }
    

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    
    public String getAreaCode() {
        return this.areaCode;
    }
    

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    public Boolean getStatus() {
        return this.status;
    }
    

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public Date getCreateTime() {
        return this.createTime;
    }
    

}
