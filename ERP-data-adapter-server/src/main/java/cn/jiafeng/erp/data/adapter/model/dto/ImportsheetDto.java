package cn.jiafeng.erp.data.adapter.model.dto;

import java.util.Date;
import java.util.List;

public class ImportsheetDto {

	private List<ImportsheetItemDto> items;
	
	public List<ImportsheetItemDto> getItems() {
		return items;
	}

	public void setItems(List<ImportsheetItemDto> items) {
		this.items = items;
	}

	/**
	 * 公司编码
	 */
	private String companyNo;

	/**
	 * 单号
	 */
	private String sheetNo;

	/**
	 * 原单号
	 */
	private String oldSheetNo;

	/**
	 * 供应商编号
	 */
	private String supplierNo;

	/**
	 * 供应商名称
	 */
	private String supplierName;

	/**
	 * 业务员ID
	 */
	private Integer saleManId;

	/**
	 * 业务员名
	 */
	private String salesmanName;

	/**
	 * 购销方式：从通用类型中选择：方式设置中
	 */
	private String purchaseSaleMode;

	/**
	 * 单据类型：1：进货；2:进货退回；3：收购：4：兑换.......
	 */
	private Boolean sheetType;

	/**
	 * 部门地区码：公司节点或者门店节点的地区码（地区表）
	 */
	private String deptAreaCode;

	/**
	 * 部门地区名称：公司节点或者门店节点的地区名称（地区表）
	 */
	private String deptAreaName;

	/**
	 * 仓库ID
	 */
	private Integer storeId;

	/**
	 * 仓库名称
	 */
	private String storeName;

	/**
	 * 建单人ID
	 */
	private Integer createUserId;

	/**
	 * 建单人名称
	 */
	private String createUserName;

	/**
	 * 商品总件数
	 */
	private Integer totalNum;

	/**
	 * 总金重
	 */
	private Double totalGoldWeight;

	/**
	 * 总成本金额
	 */
	private Double costPrice;

	/**
	 * 总标价金额
	 */
	private Double totalSalePriceAmount;

	/**
	 * 主石重：镶嵌类的才统计
	 */
	private Double totalMainStoneWeight;

	/**
	 * 单据日期：在保存单个商品时首次使用的是单的日期，在保存单的时候使用的是单的日期+当前时分秒
	 */
	private Date sheetDate;

	/**
	 * 备注
	 */
	private String remarks;

	/**
	 * 进货退货标记：1：进货；-1:退货
	 */
	private Boolean jtFlag;

	/**
	 * 0未保存；1已经保存
	 */
	private Boolean saveFlag;

	/**
	 * 代销标记：0不是代销；1是代销商品
	 */
	private Boolean daiXiaoFlag;

	/**
	 * 在途标记：0：不是在途；1：商品在途
	 */
	private Boolean zaiTuFlag;

	/**
	 * 品牌名称
	 */
	private String brandName;

	/**
	 * 数据权限地域码
	 */
	private String areaCode;

	/**
	 * 是否是批量导入的单:0不是；1：是
	 */
	private Boolean importFlag;

	/**
	 * 进货在途状态：0：新建状态；1：在途；2：接收中；3：接收完成；4：整单打回
	 */
	private Integer sheetStatus;

	/**
	 * 接收时间：在途的调拨单的接收时间
	 */
	private Date receiveTime;

	/**
	 * 批次：进货在途单打回之后再次提交要区分不同的批次（更新流转记录时间的时候用得到）
	 */
	private Integer piCi;

	/**
	 * 数据生成时间
	 */
	private Date createTime;

	/**
	 * 是否供应商和日期混合入库
	 */
	private Integer blendFlag;

	public String getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}

	public String getSheetNo() {
		return sheetNo;
	}

	public void setSheetNo(String sheetNo) {
		this.sheetNo = sheetNo;
	}

	public String getOldSheetNo() {
		return oldSheetNo;
	}

	public void setOldSheetNo(String oldSheetNo) {
		this.oldSheetNo = oldSheetNo;
	}

	public String getSupplierNo() {
		return supplierNo;
	}

	public void setSupplierNo(String supplierNo) {
		this.supplierNo = supplierNo;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public Integer getSaleManId() {
		return saleManId;
	}

	public void setSaleManId(Integer saleManId) {
		this.saleManId = saleManId;
	}

	public String getSalesmanName() {
		return salesmanName;
	}

	public void setSalesmanName(String salesmanName) {
		this.salesmanName = salesmanName;
	}

	public String getPurchaseSaleMode() {
		return purchaseSaleMode;
	}

	public void setPurchaseSaleMode(String purchaseSaleMode) {
		this.purchaseSaleMode = purchaseSaleMode;
	}

	public Boolean getSheetType() {
		return sheetType;
	}

	public void setSheetType(Boolean sheetType) {
		this.sheetType = sheetType;
	}

	public String getDeptAreaCode() {
		return deptAreaCode;
	}

	public void setDeptAreaCode(String deptAreaCode) {
		this.deptAreaCode = deptAreaCode;
	}

	public String getDeptAreaName() {
		return deptAreaName;
	}

	public void setDeptAreaName(String deptAreaName) {
		this.deptAreaName = deptAreaName;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public Integer getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public Integer getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Double getTotalGoldWeight() {
		return totalGoldWeight;
	}

	public void setTotalGoldWeight(Double totalGoldWeight) {
		this.totalGoldWeight = totalGoldWeight;
	}

	public Double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	public Double getTotalSalePriceAmount() {
		return totalSalePriceAmount;
	}

	public void setTotalSalePriceAmount(Double totalSalePriceAmount) {
		this.totalSalePriceAmount = totalSalePriceAmount;
	}

	public Double getTotalMainStoneWeight() {
		return totalMainStoneWeight;
	}

	public void setTotalMainStoneWeight(Double totalMainStoneWeight) {
		this.totalMainStoneWeight = totalMainStoneWeight;
	}

	public Date getSheetDate() {
		return sheetDate;
	}

	public void setSheetDate(Date sheetDate) {
		this.sheetDate = sheetDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Boolean getJtFlag() {
		return jtFlag;
	}

	public void setJtFlag(Boolean jtFlag) {
		this.jtFlag = jtFlag;
	}

	public Boolean getSaveFlag() {
		return saveFlag;
	}

	public void setSaveFlag(Boolean saveFlag) {
		this.saveFlag = saveFlag;
	}

	public Boolean getDaiXiaoFlag() {
		return daiXiaoFlag;
	}

	public void setDaiXiaoFlag(Boolean daiXiaoFlag) {
		this.daiXiaoFlag = daiXiaoFlag;
	}

	public Boolean getZaiTuFlag() {
		return zaiTuFlag;
	}

	public void setZaiTuFlag(Boolean zaiTuFlag) {
		this.zaiTuFlag = zaiTuFlag;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public Boolean getImportFlag() {
		return importFlag;
	}

	public void setImportFlag(Boolean importFlag) {
		this.importFlag = importFlag;
	}

	public Integer getSheetStatus() {
		return sheetStatus;
	}

	public void setSheetStatus(Integer sheetStatus) {
		this.sheetStatus = sheetStatus;
	}

	public Date getReceiveTime() {
		return receiveTime;
	}

	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}

	public Integer getPiCi() {
		return piCi;
	}

	public void setPiCi(Integer piCi) {
		this.piCi = piCi;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getBlendFlag() {
		return blendFlag;
	}

	public void setBlendFlag(Integer blendFlag) {
		this.blendFlag = blendFlag;
	}

}
