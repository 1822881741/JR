package cn.jiafeng.erp.data.adapter.dao.entity;

import java.util.Date;

/**
 * 会员等级设置表 实体类
 * 
 * @author 
 * @date 2018-11-12
 */
public class CustomerLevel implements java.io.Serializable{

    private String number;
    
    
    
    public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	/**
     * id 
     */
    private Integer id;

    /**
     * 公司编号 
     */
    private String companyNo;

    /**
     * 级别名称 
     */
    private String levelName;

    /**
     * 积分下限 
     */
    private Integer plowerLimit;

    /**
     * 积分上限 
     */
    private Integer pupperLimit;

    /**
     * 消费额下限 
     */
    private Double mlowerLimit;

    /**
     * 消费额上限 
     */
    private Double mupperLimit;

    /**
     * 依据类型：1：按累计积分；2：按累计消费额 
     */
    private Boolean basedType;

    /**
     * 启用标价：0:不启用；1：启用 
     */
    private Boolean useFlag;

    /**
     * 显示顺序号 
     */
    private Integer orderNo;

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
    

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }
    
    public String getLevelName() {
        return this.levelName;
    }
    

    public void setPlowerLimit(Integer plowerLimit) {
        this.plowerLimit = plowerLimit;
    }
    
    public Integer getPlowerLimit() {
        return this.plowerLimit;
    }
    

    public void setPupperLimit(Integer pupperLimit) {
        this.pupperLimit = pupperLimit;
    }
    
    public Integer getPupperLimit() {
        return this.pupperLimit;
    }
    

    public void setMlowerLimit(Double mlowerLimit) {
        this.mlowerLimit = mlowerLimit;
    }
    
    public Double getMlowerLimit() {
        return this.mlowerLimit;
    }
    

    public void setMupperLimit(Double mupperLimit) {
        this.mupperLimit = mupperLimit;
    }
    
    public Double getMupperLimit() {
        return this.mupperLimit;
    }
    

    public void setBasedType(Boolean basedType) {
        this.basedType = basedType;
    }
    
    public Boolean getBasedType() {
        return this.basedType;
    }
    

    public void setUseFlag(Boolean useFlag) {
        this.useFlag = useFlag;
    }
    
    public Boolean getUseFlag() {
        return this.useFlag;
    }
    

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }
    
    public Integer getOrderNo() {
        return this.orderNo;
    }
    

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public Date getCreateTime() {
        return this.createTime;
    }
    

}
