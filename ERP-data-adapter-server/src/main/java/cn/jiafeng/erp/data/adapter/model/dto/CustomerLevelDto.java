package cn.jiafeng.erp.data.adapter.model.dto;

import java.util.Date;

public class CustomerLevelDto {

    private String number;
    
    /**
     * 公司编号 
     */
    private String companyNo;

    /**
     * 级别名称 
     */
    private String levelName;


    /**
     * 消费额下限 
     */
    private Double mlowerLimit;

    /**
     * 消费额上限 
     */
    private Double mupperLimit;

    /**
     * 创建时间 
     */
    private Date createTime;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public Double getMlowerLimit() {
		return mlowerLimit;
	}

	public void setMlowerLimit(Double mlowerLimit) {
		this.mlowerLimit = mlowerLimit;
	}

	public Double getMupperLimit() {
		return mupperLimit;
	}

	public void setMupperLimit(Double mupperLimit) {
		this.mupperLimit = mupperLimit;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
    
}
