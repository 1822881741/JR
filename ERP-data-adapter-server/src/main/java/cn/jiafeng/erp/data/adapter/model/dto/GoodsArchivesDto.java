package cn.jiafeng.erp.data.adapter.model.dto;

public class GoodsArchivesDto {

	/**
	 * 公司编号
	 */
	private String companyNo;

	/**
	 * 系统代码（根据商品大类自动产生）
	 */
	private String systemCode;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 商品所属大类（固定类别）
	 */
	private String mainType;

	/**
	 * 名称的英文名称，用于分类
	 */
	private String mainTypePrefix;

	/**
	 * 金类
	 */
	private String goldType;

	/**
	 * 石类
	 */
	private String stoneType;

	/**
	 * 品类
	 */
	private String categoryType;

	/**
	 * 助记码
	 */
	private String assistCode;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 别名
	 */
	private String aliasName;

	/**
	 * 商品分类（与下面的几个分类都是商品名称做分类用的，只是出于不同角度）
	 */
	private String goodsClassify;

	/**
	 * 统计分类
	 */
	private String statsClassify;

	/**
	 * 成本分类
	 */
	private String costClassify;

	/**
	 * 标签文件
	 */
	private String grfName;

	/**
	 * 是否标记为礼品:0不是；1：是
	 */
	private Boolean giftTag;

	/**
	 * 标价金额
	 */
	private Double labelPrice;

	public String getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMainType() {
		return mainType;
	}

	public void setMainType(String mainType) {
		this.mainType = mainType;
	}

	public String getMainTypePrefix() {
		return mainTypePrefix;
	}

	public void setMainTypePrefix(String mainTypePrefix) {
		this.mainTypePrefix = mainTypePrefix;
	}

	public String getGoldType() {
		return goldType;
	}

	public void setGoldType(String goldType) {
		this.goldType = goldType;
	}

	public String getStoneType() {
		return stoneType;
	}

	public void setStoneType(String stoneType) {
		this.stoneType = stoneType;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public String getAssistCode() {
		return assistCode;
	}

	public void setAssistCode(String assistCode) {
		this.assistCode = assistCode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getGoodsClassify() {
		return goodsClassify;
	}

	public void setGoodsClassify(String goodsClassify) {
		this.goodsClassify = goodsClassify;
	}

	public String getStatsClassify() {
		return statsClassify;
	}

	public void setStatsClassify(String statsClassify) {
		this.statsClassify = statsClassify;
	}

	public String getCostClassify() {
		return costClassify;
	}

	public void setCostClassify(String costClassify) {
		this.costClassify = costClassify;
	}

	public String getGrfName() {
		return grfName;
	}

	public void setGrfName(String grfName) {
		this.grfName = grfName;
	}

	public Boolean getGiftTag() {
		return giftTag;
	}

	public void setGiftTag(Boolean giftTag) {
		this.giftTag = giftTag;
	}

	public Double getLabelPrice() {
		return labelPrice;
	}

	public void setLabelPrice(Double labelPrice) {
		this.labelPrice = labelPrice;
	}
}
