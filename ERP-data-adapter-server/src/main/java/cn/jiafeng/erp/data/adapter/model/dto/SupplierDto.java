package cn.jiafeng.erp.data.adapter.model.dto;

import java.util.Date;

public class SupplierDto {
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}	
}
