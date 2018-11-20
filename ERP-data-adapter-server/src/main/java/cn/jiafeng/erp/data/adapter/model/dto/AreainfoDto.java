package cn.jiafeng.erp.data.adapter.model.dto;

public class AreainfoDto {

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Integer getAreaType() {
		return areaType;
	}

	public void setAreaType(Integer areaType) {
		this.areaType = areaType;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

}
