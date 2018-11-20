package cn.jiafeng.erp.data.adapter.dao.entity;

import java.util.Date;

/**
 * 员工表 实体类
 * 
 * @author 
 * @date 2018-11-12
 */
public class Employee implements java.io.Serializable{

    /**
     * 序列化版本号
     */
    
    /**
     * 员工ID 
     */
    private Integer id;

    /**
     * 员工姓名 
     */
    private String name;

    /**
     * 联系电话 
     */
    private String phone;

    /**
     * 门店ID 
     */
    private Integer shopId;

    /**
     * 地区编码 
     */
    private String areaCode;

    /**
     * 备注 
     */
    private String remark;

    /**
     * 创建时间 
     */
    private Date createTime;


    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return this.id;
    }
    

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getPhone() {
        return this.phone;
    }
    

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
    
    public Integer getShopId() {
        return this.shopId;
    }
    

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    
    public String getAreaCode() {
        return this.areaCode;
    }
    

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public String getRemark() {
        return this.remark;
    }
    

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public Date getCreateTime() {
        return this.createTime;
    }
    

}
