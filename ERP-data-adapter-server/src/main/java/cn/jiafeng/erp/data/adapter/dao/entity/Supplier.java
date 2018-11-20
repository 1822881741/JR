package cn.jiafeng.erp.data.adapter.dao.entity;

import java.util.Date;

/**
 * 供应商表 实体类
 * 
 * @author 
 * @date 2018-11-12
 */
public class Supplier implements java.io.Serializable{

	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

    /**
     * 供应商编号 
     */
    private Integer id;

    /**
     * 供应商名称 
     */
    private String name;

    /**
     * 状态(1表示使用，2表示停用) 
     */
    private Integer status;

    /**
     * 联系人 
     */
    private String person;

    /**
     * 联系电话 
     */
    private String phone;

    /**
     * 服务公司编号 
     */
    private String companyNo;

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
    

    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public Integer getStatus() {
        return this.status;
    }
    

    public void setPerson(String person) {
        this.person = person;
    }
    
    public String getPerson() {
        return this.person;
    }
    

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getPhone() {
        return this.phone;
    }
    

    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
    }
    
    public String getCompanyNo() {
        return this.companyNo;
    }
    

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public Date getCreateTime() {
        return this.createTime;
    }
    

}
