package cn.jiafeng.erp.data.adapter.dao.entity;

import java.util.Date;

/**
 * 门店信息表 实体类
 * 
 * @author 
 * @date 2018-11-12
 */
public class Shop implements java.io.Serializable{

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
     * 门店名称 
     */
    private String shopName;

    /**
     * 地址信息 
     */
    private String address;

    /**
     * 联系人电话 
     */
    private String mobile;

    /**
     * 备注信息 
     */
    private String remarks;

    /**
     * 当前状态 0:已删除，1：使用中 
     */
    private Boolean status;

    /**
     * 区域编码 
     */
    private String areaCode;

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
    

    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
    }
    
    public String getCompanyNo() {
        return this.companyNo;
    }
    

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    
    public String getShopName() {
        return this.shopName;
    }
    

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getAddress() {
        return this.address;
    }
    

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    public String getMobile() {
        return this.mobile;
    }
    

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    public String getRemarks() {
        return this.remarks;
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
    

}
