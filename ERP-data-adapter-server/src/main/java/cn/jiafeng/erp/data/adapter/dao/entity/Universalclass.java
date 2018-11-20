package cn.jiafeng.erp.data.adapter.dao.entity;


/**
 * 通用类型（简单下拉列表） 实体类
 * 
 * @author 
 * @date 2018-11-12
 */
public class Universalclass implements java.io.Serializable{

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
     * 主分类 
     */
    private String mainType;

    /**
     * 显示名称 
     */
    private String name;

    /**
     * 是否是系统类型0：是 ，1不是 
     */
    private Boolean isSystem;

    /**
     * 描述 
     */
    private String remarks;

    /**
     * 字段显示顺序 
     */
    private Integer sequence;


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
    

    public void setMainType(String mainType) {
        this.mainType = mainType;
    }
    
    public String getMainType() {
        return this.mainType;
    }
    

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }
    
    public Boolean getIsSystem() {
        return this.isSystem;
    }
    

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    public String getRemarks() {
        return this.remarks;
    }
    

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
    
    public Integer getSequence() {
        return this.sequence;
    }
    

}
