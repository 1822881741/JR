package cn.jiafeng.erp.data.adapter.model.dto;

import java.util.Date;

public class ImportsheetItemDto {

	private String number;
	
	private Integer id;
	
    /**
     * 入库单id 
     */
    private Integer sheetId;

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
     * barCode 
     */
    private String barCode;

    /**
     * oldBarCode 
     */
    private String oldBarCode;

    /**
     * 商品子名称 
     */
    private String subGoodsName;

    /**
     * 证书号 
     */
    private String certificateNo;

    /**
     * GIA证书号 
     */
    private String giaCertificateNo;

    /**
     * 款式 
     */
    private String style;

    /**
     * 款号 
     */
    private String styleNo;

    /**
     * 手寸 
     */
    private String shortCut;

    /**
     * 工艺 
     */
    private String craft;

    /**
     * 计量方式 
     */
    private String measurementMode;

    /**
     * 图片路径 
     */
    private String img;

    /**
     * 操作员ID 
     */
    private Integer operUserId;

    /**
     * 操作员名称 
     */
    private String operUserName;

    /**
     * 商品备注信息 
     */
    private String remarks;

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
     * 购销方式：从通用类型中选择：方式设置中 
     */
    private String purchaseSaleMode;

    /**
     * 单据类型：1：进货；2:进货退回；3：收购：4：兑换....... 
     */
    private Boolean sheetType;

    /**
     * 特价标记，换为汉子显示 
     */
    private String specialOffersFlag;

    /**
     * 单据日期：在保存单个商品时首次使用的是单的日期，在保存单的时候使用的是单的日期+当前时分秒 
     */
    private Date sheetDate;

    /**
     * 进货退货标记：1：进货；-1:退货 
     */
    private Boolean jtFlag;

    /**
     * 单据是否已经保存：0未保存；1已经保存 
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
     * 数量 
     */
    private Integer num;

    /**
     * 金重：净金重 
     */
    private Double goldWeight;

    /**
     * 损耗百分比 
     */
    private Boolean goldLoss;

    /**
     * 毛金重：加上损耗的金重；镶嵌类在计算成本时使用到 
     */
    private Double maoGoldWeight;

    /**
     * 总金重：主要是K金或素金类（K金*数量；素金金重）;其他类货品也记录，便于统计 
     */
    private Double totalGoldWeight;

    /**
     * 商品总重：镶嵌类+金镶玉（金重+石重），一码一货的商品，且有金和石的 
     */
    private Double goodsWeight;

    /**
     * 金价 
     */
    private Double goldPrice;

    /**
     * 克工费 
     */
    private Double worksFee4Ke;

    /**
     * 件工费 
     */
    private Double worksFee4Jian;

    /**
     * 总工费，该工费暂时用到的地方为兑换业务处 
     */
    private Double worksFeeTotal;

    /**
     * 证书费 
     */
    private Double certificateFee;

    /**
     * 配件金额 
     */
    private Double fittingsFee;

    /**
     * 喷砂镶石费 
     */
    private Double sandBlastFee;

    /**
     * 其他费用 
     */
    private Double otherFee;

    /**
     * 成本单价：素金对应可单价，非素对应件单价 
     */
    private Double unitPrice;

    /**
     * 金料额：镶嵌类的带损耗的（毛金重*金价）金成本 
     */
    private Double goldCostPrice;

    /**
     * 成本金额 
     */
    private Double costPrice;

    /**
     * 加价率 
     */
    private Double markupRate;

    /**
     * 标签价（售价）：成本单价*加价率 
     */
    private Double labelPrice;

    /**
     * 售价金额：售价*数量 
     */
    private Double salePriceAmount;

    /**
     * 标签工费 
     */
    private Double labelWorkFee;

    /**
     * 标签克工费 
     */
    private Double labelWorkFee4Ke;

    /**
     * 标签件工费 
     */
    private Double labelWorkFee4Jian;

    /**
     * 标签备注 
     */
    private String labelRemarks;

    /**
     * 对应商品档案ID 
     */
    private Integer archivesId;

    /**
     * 商品编码：商品档案中编码 
     */
    private String archivesNo;

    /**
     * 商品名称：商品档案中的名称 
     */
    private String goodsName;

    /**
     * goodsNameEn 
     */
    private String goodsNameEn;

    /**
     * 成色：商品档案中的成色 
     */
    private String archivesFineness;

    /**
     * 石头：商品档案中的石头 
     */
    private String archivesStone;

    /**
     * archivesCategory 
     */
    private String archivesCategory;

    /**
     * 核算模式：商品档案中的核算分类 
     */
    private String mainType;

    /**
     * 商品所属大类的英文 
     */
    private String mainTypePrefix;

    /**
     * 实际分类：对应商品档案中的实际分类 
     */
    private String goodsClassify;

    /**
     * 成本分类 
     */
    private String costClassify;

    /**
     * 统计分类 
     */
    private String statsClassify;

    /**
     * 切工 
     */
    private String mainStoneCut;

    /**
     * 颜色 
     */
    private String mainStoneColor;

    /**
     * 净度 
     */
    private String mainStoneClarity;

    /**
     * 荧光 
     */
    private String mainStoneFluorescent;

    /**
     * 抛光度 
     */
    private String mainStoneBurnished;

    /**
     * 对称性 
     */
    private String mainStoneSymmetry;

    /**
     * 主石名 
     */
    private String mainStoneName;

    /**
     * 主石石号 
     */
    private String mainStoneNo;

    /**
     * 主石规格 
     */
    private String mainStoneSpecifi;

    /**
     * 主石数 
     */
    private Integer mainStoneNum;

    /**
     * 主石重 
     */
    private Double mainStoneWeight;

    /**
     * 主石价 
     */
    private Double mainStonePrice;

    /**
     * 主石额 
     */
    private Double mainStoneMoney;

    /**
     * 副石1名 
     */
    private String subStone1Name;

    /**
     * 副石1石号 
     */
    private String subStone1No;

    /**
     * 副石1规格 
     */
    private String subStone1Specifi;

    /**
     * 副石1数 
     */
    private Integer subStone1Num;

    /**
     * 副石1重 
     */
    private Double subStone1Weight;

    /**
     * 副石1价 
     */
    private Double subStone1Price;

    /**
     * 副石1额 
     */
    private Double subStone1Money;

    /**
     * 副石2名 
     */
    private String subStone2Name;

    /**
     * 副石2石号 
     */
    private String subStone2No;

    /**
     * 副石2规格 
     */
    private String subStone2Specifi;

    /**
     * 副石2数 
     */
    private Integer subStone2Num;

    /**
     * 副石2重 
     */
    private Double subStone2Weight;

    /**
     * 副石2价 
     */
    private Double subStone2Price;

    /**
     * 副石2额 
     */
    private Double subStone2Money;

    /**
     * 副石3名 
     */
    private String subStone3Name;

    /**
     * 副石3石号 
     */
    private String subStone3No;

    /**
     * 副石3规格 
     */
    private String subStone3Specifi;

    /**
     * 副石3数 
     */
    private Integer subStone3Num;

    /**
     * 副石3重 
     */
    private Double subStone3Weight;

    /**
     * 副石3价 
     */
    private Double subStone3Price;

    /**
     * 副石3额 
     */
    private Double subStone3Money;

    /**
     * 副石4名 
     */
    private String subStone4Name;

    /**
     * 副石4石号 
     */
    private String subStone4No;

    /**
     * 副石4规格 
     */
    private String subStone4Specifi;

    /**
     * 副石4数 
     */
    private Integer subStone4Num;

    /**
     * 副石4重 
     */
    private Double subStone4Weight;

    /**
     * 副石4价 
     */
    private Double subStone4Price;

    /**
     * 副石4额 
     */
    private Double subStone4Money;

    /**
     * 副石5名 
     */
    private String subStone5Name;

    /**
     * 副石5石号 
     */
    private String subStone5No;

    /**
     * 副石5规格 
     */
    private String subStone5Specifi;

    /**
     * 副石5数 
     */
    private Integer subStone5Num;

    /**
     * 副石5重 
     */
    private Double subStone5Weight;

    /**
     * 副石5价 
     */
    private Double subStone5Price;

    /**
     * 副石5额 
     */
    private Double subStone5Money;

    /**
     * 副石6名 
     */
    private String subStone6Name;

    /**
     * 副石6石号 
     */
    private String subStone6No;

    /**
     * 副石6规格 
     */
    private String subStone6Specifi;

    /**
     * 副石6数 
     */
    private Integer subStone6Num;

    /**
     * 副石6重 
     */
    private Double subStone6Weight;

    /**
     * 副石6价 
     */
    private Double subStone6Price;

    /**
     * 副石6额 
     */
    private Double subStone6Money;

    /**
     * 配石成本：金镶玉 
     */
    private Double peiShiCostPrice;

    /**
     * 配石倍率：金镶玉 
     */
    private Double peiShiRate;

    /**
     * 配石标价：金镶玉 
     */
    private Double peiShiLabelPrice;

    /**
     * 净金重：旧料 
     */
    private Double netGoldWeight;

    /**
     * 成色：旧料 
     */
    private Double oldMaterialQuality;

    /**
     * 加工损耗：旧料 
     */
    private Double oldMaterialLoss;

    /**
     * 来源：本店or外店 
     */
    private String origin;

    /**
     * 回收标记：0：不是；1：是 
     */
    private Boolean recFlag;

    /**
     * 业务员ID 
     */
    private Integer saleManId;

    /**
     * 业务员名 
     */
    private String salesmanName;

    /**
     * 是否已经退货了，回收业务退回时使用 
     */
    private Boolean hasReturn;

    /**
     * 退回时记录对应的回收itemId 
     */
    private Integer orgItemId;

    /**
     * 旧饰相关:原标价 
     */
    private Double orgLabelPrice;

    /**
     * 旧饰相关:原结算价 
     */
    private Double orgSettlementPrice;

    /**
     * 旧饰相关:增值金额 
     */
    private Double incrementMoney;

    /**
     * 旧饰相关:收购金额 
     */
    private Double purchaseAmount;

    /**
     * 标签文件 
     */
    private String grfName;

    /**
     * 提纯费/克 
     */
    private Double refineFee;

    /**
     * 总提纯费 
     */
    private Double refineFeeTotal;

    /**
     * 单据的子类型 如果sheetType为兑换单 则 3：旧料兑换 4：为旧料回收  ，5：为回收旧饰。如果sheetType为销售单 则 11：表示截料,其他单据与sheetType保持一致  
     */
    private Boolean subType;

    /**
     * 兑换旧料的结算价 
     */
    private Double settleUnitPrice;

    /**
     * 兑换旧料的总结算金额 
     */
    private Double settleTotalMoney;

    /**
     * 成色是否参与运算 0：参与，1不参与 
     */
    private Boolean joinCalculate;

    /**
     * 兑换旧料的积分 
     */
    private Integer pointItem;

    /**
     * 商品退回时,旧的库存ID 
     */
    private Integer oldStockId;

    /**
     * 品牌名称 
     */
    private String brandName;

    /**
     * 兑换回收旧饰的折扣  
     */
    private Double recyleGoodsAgio;

    /**
     * 兑换新品的仓库id 
     */
    private Integer exchangeStoreId;

    /**
     * 兑换新品的仓库名称 
     */
    private String exchangeStoreName;

    /**
     * 进货在途状态：0：新建状态；1：在途；2：接收中；3：接收完成；4：整单打回 
     */
    private Integer sheetStatus;

    /**
     * 接收时间：在途的调拨单的接收时间 
     */
    private Date receiveTime;

    /**
     * 价格区间 
     */
    private String priceRange;

    /**
     * 金重区间 
     */
    private String goldRange;

    /**
     * 石重区间 
     */
    private String stoneRange;

    /**
     * 一码多货的标记：0：非一码多货；1：一码多货 
     */
    private Boolean dhFlag;

	public Integer getSheetId() {
		return sheetId;
	}

	public void setSheetId(Integer sheetId) {
		this.sheetId = sheetId;
	}

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

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getOldBarCode() {
		return oldBarCode;
	}

	public void setOldBarCode(String oldBarCode) {
		this.oldBarCode = oldBarCode;
	}

	public String getSubGoodsName() {
		return subGoodsName;
	}

	public void setSubGoodsName(String subGoodsName) {
		this.subGoodsName = subGoodsName;
	}

	public String getCertificateNo() {
		return certificateNo;
	}

	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}

	public String getGiaCertificateNo() {
		return giaCertificateNo;
	}

	public void setGiaCertificateNo(String giaCertificateNo) {
		this.giaCertificateNo = giaCertificateNo;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getStyleNo() {
		return styleNo;
	}

	public void setStyleNo(String styleNo) {
		this.styleNo = styleNo;
	}

	public String getShortCut() {
		return shortCut;
	}

	public void setShortCut(String shortCut) {
		this.shortCut = shortCut;
	}

	public String getCraft() {
		return craft;
	}

	public void setCraft(String craft) {
		this.craft = craft;
	}

	public String getMeasurementMode() {
		return measurementMode;
	}

	public void setMeasurementMode(String measurementMode) {
		this.measurementMode = measurementMode;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Integer getOperUserId() {
		return operUserId;
	}

	public void setOperUserId(Integer operUserId) {
		this.operUserId = operUserId;
	}

	public String getOperUserName() {
		return operUserName;
	}

	public void setOperUserName(String operUserName) {
		this.operUserName = operUserName;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	public String getSpecialOffersFlag() {
		return specialOffersFlag;
	}

	public void setSpecialOffersFlag(String specialOffersFlag) {
		this.specialOffersFlag = specialOffersFlag;
	}

	public Date getSheetDate() {
		return sheetDate;
	}

	public void setSheetDate(Date sheetDate) {
		this.sheetDate = sheetDate;
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

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Double getGoldWeight() {
		return goldWeight;
	}

	public void setGoldWeight(Double goldWeight) {
		this.goldWeight = goldWeight;
	}

	public Boolean getGoldLoss() {
		return goldLoss;
	}

	public void setGoldLoss(Boolean goldLoss) {
		this.goldLoss = goldLoss;
	}

	public Double getMaoGoldWeight() {
		return maoGoldWeight;
	}

	public void setMaoGoldWeight(Double maoGoldWeight) {
		this.maoGoldWeight = maoGoldWeight;
	}

	public Double getTotalGoldWeight() {
		return totalGoldWeight;
	}

	public void setTotalGoldWeight(Double totalGoldWeight) {
		this.totalGoldWeight = totalGoldWeight;
	}

	public Double getGoodsWeight() {
		return goodsWeight;
	}

	public void setGoodsWeight(Double goodsWeight) {
		this.goodsWeight = goodsWeight;
	}

	public Double getGoldPrice() {
		return goldPrice;
	}

	public void setGoldPrice(Double goldPrice) {
		this.goldPrice = goldPrice;
	}

	public Double getWorksFee4Ke() {
		return worksFee4Ke;
	}

	public void setWorksFee4Ke(Double worksFee4Ke) {
		this.worksFee4Ke = worksFee4Ke;
	}

	public Double getWorksFee4Jian() {
		return worksFee4Jian;
	}

	public void setWorksFee4Jian(Double worksFee4Jian) {
		this.worksFee4Jian = worksFee4Jian;
	}

	public Double getWorksFeeTotal() {
		return worksFeeTotal;
	}

	public void setWorksFeeTotal(Double worksFeeTotal) {
		this.worksFeeTotal = worksFeeTotal;
	}

	public Double getCertificateFee() {
		return certificateFee;
	}

	public void setCertificateFee(Double certificateFee) {
		this.certificateFee = certificateFee;
	}

	public Double getFittingsFee() {
		return fittingsFee;
	}

	public void setFittingsFee(Double fittingsFee) {
		this.fittingsFee = fittingsFee;
	}

	public Double getSandBlastFee() {
		return sandBlastFee;
	}

	public void setSandBlastFee(Double sandBlastFee) {
		this.sandBlastFee = sandBlastFee;
	}

	public Double getOtherFee() {
		return otherFee;
	}

	public void setOtherFee(Double otherFee) {
		this.otherFee = otherFee;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getGoldCostPrice() {
		return goldCostPrice;
	}

	public void setGoldCostPrice(Double goldCostPrice) {
		this.goldCostPrice = goldCostPrice;
	}

	public Double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	public Double getMarkupRate() {
		return markupRate;
	}

	public void setMarkupRate(Double markupRate) {
		this.markupRate = markupRate;
	}

	public Double getLabelPrice() {
		return labelPrice;
	}

	public void setLabelPrice(Double labelPrice) {
		this.labelPrice = labelPrice;
	}

	public Double getSalePriceAmount() {
		return salePriceAmount;
	}

	public void setSalePriceAmount(Double salePriceAmount) {
		this.salePriceAmount = salePriceAmount;
	}

	public Double getLabelWorkFee() {
		return labelWorkFee;
	}

	public void setLabelWorkFee(Double labelWorkFee) {
		this.labelWorkFee = labelWorkFee;
	}

	public Double getLabelWorkFee4Ke() {
		return labelWorkFee4Ke;
	}

	public void setLabelWorkFee4Ke(Double labelWorkFee4Ke) {
		this.labelWorkFee4Ke = labelWorkFee4Ke;
	}

	public Double getLabelWorkFee4Jian() {
		return labelWorkFee4Jian;
	}

	public void setLabelWorkFee4Jian(Double labelWorkFee4Jian) {
		this.labelWorkFee4Jian = labelWorkFee4Jian;
	}

	public String getLabelRemarks() {
		return labelRemarks;
	}

	public void setLabelRemarks(String labelRemarks) {
		this.labelRemarks = labelRemarks;
	}

	public Integer getArchivesId() {
		return archivesId;
	}

	public void setArchivesId(Integer archivesId) {
		this.archivesId = archivesId;
	}

	public String getArchivesNo() {
		return archivesNo;
	}

	public void setArchivesNo(String archivesNo) {
		this.archivesNo = archivesNo;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsNameEn() {
		return goodsNameEn;
	}

	public void setGoodsNameEn(String goodsNameEn) {
		this.goodsNameEn = goodsNameEn;
	}

	public String getArchivesFineness() {
		return archivesFineness;
	}

	public void setArchivesFineness(String archivesFineness) {
		this.archivesFineness = archivesFineness;
	}

	public String getArchivesStone() {
		return archivesStone;
	}

	public void setArchivesStone(String archivesStone) {
		this.archivesStone = archivesStone;
	}

	public String getArchivesCategory() {
		return archivesCategory;
	}

	public void setArchivesCategory(String archivesCategory) {
		this.archivesCategory = archivesCategory;
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

	public String getGoodsClassify() {
		return goodsClassify;
	}

	public void setGoodsClassify(String goodsClassify) {
		this.goodsClassify = goodsClassify;
	}

	public String getCostClassify() {
		return costClassify;
	}

	public void setCostClassify(String costClassify) {
		this.costClassify = costClassify;
	}

	public String getStatsClassify() {
		return statsClassify;
	}

	public void setStatsClassify(String statsClassify) {
		this.statsClassify = statsClassify;
	}

	public String getMainStoneCut() {
		return mainStoneCut;
	}

	public void setMainStoneCut(String mainStoneCut) {
		this.mainStoneCut = mainStoneCut;
	}

	public String getMainStoneColor() {
		return mainStoneColor;
	}

	public void setMainStoneColor(String mainStoneColor) {
		this.mainStoneColor = mainStoneColor;
	}

	public String getMainStoneClarity() {
		return mainStoneClarity;
	}

	public void setMainStoneClarity(String mainStoneClarity) {
		this.mainStoneClarity = mainStoneClarity;
	}

	public String getMainStoneFluorescent() {
		return mainStoneFluorescent;
	}

	public void setMainStoneFluorescent(String mainStoneFluorescent) {
		this.mainStoneFluorescent = mainStoneFluorescent;
	}

	public String getMainStoneBurnished() {
		return mainStoneBurnished;
	}

	public void setMainStoneBurnished(String mainStoneBurnished) {
		this.mainStoneBurnished = mainStoneBurnished;
	}

	public String getMainStoneSymmetry() {
		return mainStoneSymmetry;
	}

	public void setMainStoneSymmetry(String mainStoneSymmetry) {
		this.mainStoneSymmetry = mainStoneSymmetry;
	}

	public String getMainStoneName() {
		return mainStoneName;
	}

	public void setMainStoneName(String mainStoneName) {
		this.mainStoneName = mainStoneName;
	}

	public String getMainStoneNo() {
		return mainStoneNo;
	}

	public void setMainStoneNo(String mainStoneNo) {
		this.mainStoneNo = mainStoneNo;
	}

	public String getMainStoneSpecifi() {
		return mainStoneSpecifi;
	}

	public void setMainStoneSpecifi(String mainStoneSpecifi) {
		this.mainStoneSpecifi = mainStoneSpecifi;
	}

	public Integer getMainStoneNum() {
		return mainStoneNum;
	}

	public void setMainStoneNum(Integer mainStoneNum) {
		this.mainStoneNum = mainStoneNum;
	}

	public Double getMainStoneWeight() {
		return mainStoneWeight;
	}

	public void setMainStoneWeight(Double mainStoneWeight) {
		this.mainStoneWeight = mainStoneWeight;
	}

	public Double getMainStonePrice() {
		return mainStonePrice;
	}

	public void setMainStonePrice(Double mainStonePrice) {
		this.mainStonePrice = mainStonePrice;
	}

	public Double getMainStoneMoney() {
		return mainStoneMoney;
	}

	public void setMainStoneMoney(Double mainStoneMoney) {
		this.mainStoneMoney = mainStoneMoney;
	}

	public String getSubStone1Name() {
		return subStone1Name;
	}

	public void setSubStone1Name(String subStone1Name) {
		this.subStone1Name = subStone1Name;
	}

	public String getSubStone1No() {
		return subStone1No;
	}

	public void setSubStone1No(String subStone1No) {
		this.subStone1No = subStone1No;
	}

	public String getSubStone1Specifi() {
		return subStone1Specifi;
	}

	public void setSubStone1Specifi(String subStone1Specifi) {
		this.subStone1Specifi = subStone1Specifi;
	}

	public Integer getSubStone1Num() {
		return subStone1Num;
	}

	public void setSubStone1Num(Integer subStone1Num) {
		this.subStone1Num = subStone1Num;
	}

	public Double getSubStone1Weight() {
		return subStone1Weight;
	}

	public void setSubStone1Weight(Double subStone1Weight) {
		this.subStone1Weight = subStone1Weight;
	}

	public Double getSubStone1Price() {
		return subStone1Price;
	}

	public void setSubStone1Price(Double subStone1Price) {
		this.subStone1Price = subStone1Price;
	}

	public Double getSubStone1Money() {
		return subStone1Money;
	}

	public void setSubStone1Money(Double subStone1Money) {
		this.subStone1Money = subStone1Money;
	}

	public String getSubStone2Name() {
		return subStone2Name;
	}

	public void setSubStone2Name(String subStone2Name) {
		this.subStone2Name = subStone2Name;
	}

	public String getSubStone2No() {
		return subStone2No;
	}

	public void setSubStone2No(String subStone2No) {
		this.subStone2No = subStone2No;
	}

	public String getSubStone2Specifi() {
		return subStone2Specifi;
	}

	public void setSubStone2Specifi(String subStone2Specifi) {
		this.subStone2Specifi = subStone2Specifi;
	}

	public Integer getSubStone2Num() {
		return subStone2Num;
	}

	public void setSubStone2Num(Integer subStone2Num) {
		this.subStone2Num = subStone2Num;
	}

	public Double getSubStone2Weight() {
		return subStone2Weight;
	}

	public void setSubStone2Weight(Double subStone2Weight) {
		this.subStone2Weight = subStone2Weight;
	}

	public Double getSubStone2Price() {
		return subStone2Price;
	}

	public void setSubStone2Price(Double subStone2Price) {
		this.subStone2Price = subStone2Price;
	}

	public Double getSubStone2Money() {
		return subStone2Money;
	}

	public void setSubStone2Money(Double subStone2Money) {
		this.subStone2Money = subStone2Money;
	}

	public String getSubStone3Name() {
		return subStone3Name;
	}

	public void setSubStone3Name(String subStone3Name) {
		this.subStone3Name = subStone3Name;
	}

	public String getSubStone3No() {
		return subStone3No;
	}

	public void setSubStone3No(String subStone3No) {
		this.subStone3No = subStone3No;
	}

	public String getSubStone3Specifi() {
		return subStone3Specifi;
	}

	public void setSubStone3Specifi(String subStone3Specifi) {
		this.subStone3Specifi = subStone3Specifi;
	}

	public Integer getSubStone3Num() {
		return subStone3Num;
	}

	public void setSubStone3Num(Integer subStone3Num) {
		this.subStone3Num = subStone3Num;
	}

	public Double getSubStone3Weight() {
		return subStone3Weight;
	}

	public void setSubStone3Weight(Double subStone3Weight) {
		this.subStone3Weight = subStone3Weight;
	}

	public Double getSubStone3Price() {
		return subStone3Price;
	}

	public void setSubStone3Price(Double subStone3Price) {
		this.subStone3Price = subStone3Price;
	}

	public Double getSubStone3Money() {
		return subStone3Money;
	}

	public void setSubStone3Money(Double subStone3Money) {
		this.subStone3Money = subStone3Money;
	}

	public String getSubStone4Name() {
		return subStone4Name;
	}

	public void setSubStone4Name(String subStone4Name) {
		this.subStone4Name = subStone4Name;
	}

	public String getSubStone4No() {
		return subStone4No;
	}

	public void setSubStone4No(String subStone4No) {
		this.subStone4No = subStone4No;
	}

	public String getSubStone4Specifi() {
		return subStone4Specifi;
	}

	public void setSubStone4Specifi(String subStone4Specifi) {
		this.subStone4Specifi = subStone4Specifi;
	}

	public Integer getSubStone4Num() {
		return subStone4Num;
	}

	public void setSubStone4Num(Integer subStone4Num) {
		this.subStone4Num = subStone4Num;
	}

	public Double getSubStone4Weight() {
		return subStone4Weight;
	}

	public void setSubStone4Weight(Double subStone4Weight) {
		this.subStone4Weight = subStone4Weight;
	}

	public Double getSubStone4Price() {
		return subStone4Price;
	}

	public void setSubStone4Price(Double subStone4Price) {
		this.subStone4Price = subStone4Price;
	}

	public Double getSubStone4Money() {
		return subStone4Money;
	}

	public void setSubStone4Money(Double subStone4Money) {
		this.subStone4Money = subStone4Money;
	}

	public String getSubStone5Name() {
		return subStone5Name;
	}

	public void setSubStone5Name(String subStone5Name) {
		this.subStone5Name = subStone5Name;
	}

	public String getSubStone5No() {
		return subStone5No;
	}

	public void setSubStone5No(String subStone5No) {
		this.subStone5No = subStone5No;
	}

	public String getSubStone5Specifi() {
		return subStone5Specifi;
	}

	public void setSubStone5Specifi(String subStone5Specifi) {
		this.subStone5Specifi = subStone5Specifi;
	}

	public Integer getSubStone5Num() {
		return subStone5Num;
	}

	public void setSubStone5Num(Integer subStone5Num) {
		this.subStone5Num = subStone5Num;
	}

	public Double getSubStone5Weight() {
		return subStone5Weight;
	}

	public void setSubStone5Weight(Double subStone5Weight) {
		this.subStone5Weight = subStone5Weight;
	}

	public Double getSubStone5Price() {
		return subStone5Price;
	}

	public void setSubStone5Price(Double subStone5Price) {
		this.subStone5Price = subStone5Price;
	}

	public Double getSubStone5Money() {
		return subStone5Money;
	}

	public void setSubStone5Money(Double subStone5Money) {
		this.subStone5Money = subStone5Money;
	}

	public String getSubStone6Name() {
		return subStone6Name;
	}

	public void setSubStone6Name(String subStone6Name) {
		this.subStone6Name = subStone6Name;
	}

	public String getSubStone6No() {
		return subStone6No;
	}

	public void setSubStone6No(String subStone6No) {
		this.subStone6No = subStone6No;
	}

	public String getSubStone6Specifi() {
		return subStone6Specifi;
	}

	public void setSubStone6Specifi(String subStone6Specifi) {
		this.subStone6Specifi = subStone6Specifi;
	}

	public Integer getSubStone6Num() {
		return subStone6Num;
	}

	public void setSubStone6Num(Integer subStone6Num) {
		this.subStone6Num = subStone6Num;
	}

	public Double getSubStone6Weight() {
		return subStone6Weight;
	}

	public void setSubStone6Weight(Double subStone6Weight) {
		this.subStone6Weight = subStone6Weight;
	}

	public Double getSubStone6Price() {
		return subStone6Price;
	}

	public void setSubStone6Price(Double subStone6Price) {
		this.subStone6Price = subStone6Price;
	}

	public Double getSubStone6Money() {
		return subStone6Money;
	}

	public void setSubStone6Money(Double subStone6Money) {
		this.subStone6Money = subStone6Money;
	}

	public Double getPeiShiCostPrice() {
		return peiShiCostPrice;
	}

	public void setPeiShiCostPrice(Double peiShiCostPrice) {
		this.peiShiCostPrice = peiShiCostPrice;
	}

	public Double getPeiShiRate() {
		return peiShiRate;
	}

	public void setPeiShiRate(Double peiShiRate) {
		this.peiShiRate = peiShiRate;
	}

	public Double getPeiShiLabelPrice() {
		return peiShiLabelPrice;
	}

	public void setPeiShiLabelPrice(Double peiShiLabelPrice) {
		this.peiShiLabelPrice = peiShiLabelPrice;
	}

	public Double getNetGoldWeight() {
		return netGoldWeight;
	}

	public void setNetGoldWeight(Double netGoldWeight) {
		this.netGoldWeight = netGoldWeight;
	}

	public Double getOldMaterialQuality() {
		return oldMaterialQuality;
	}

	public void setOldMaterialQuality(Double oldMaterialQuality) {
		this.oldMaterialQuality = oldMaterialQuality;
	}

	public Double getOldMaterialLoss() {
		return oldMaterialLoss;
	}

	public void setOldMaterialLoss(Double oldMaterialLoss) {
		this.oldMaterialLoss = oldMaterialLoss;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public Boolean getRecFlag() {
		return recFlag;
	}

	public void setRecFlag(Boolean recFlag) {
		this.recFlag = recFlag;
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

	public Boolean getHasReturn() {
		return hasReturn;
	}

	public void setHasReturn(Boolean hasReturn) {
		this.hasReturn = hasReturn;
	}

	public Integer getOrgItemId() {
		return orgItemId;
	}

	public void setOrgItemId(Integer orgItemId) {
		this.orgItemId = orgItemId;
	}

	public Double getOrgLabelPrice() {
		return orgLabelPrice;
	}

	public void setOrgLabelPrice(Double orgLabelPrice) {
		this.orgLabelPrice = orgLabelPrice;
	}

	public Double getOrgSettlementPrice() {
		return orgSettlementPrice;
	}

	public void setOrgSettlementPrice(Double orgSettlementPrice) {
		this.orgSettlementPrice = orgSettlementPrice;
	}

	public Double getIncrementMoney() {
		return incrementMoney;
	}

	public void setIncrementMoney(Double incrementMoney) {
		this.incrementMoney = incrementMoney;
	}

	public Double getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(Double purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public String getGrfName() {
		return grfName;
	}

	public void setGrfName(String grfName) {
		this.grfName = grfName;
	}

	public Double getRefineFee() {
		return refineFee;
	}

	public void setRefineFee(Double refineFee) {
		this.refineFee = refineFee;
	}

	public Double getRefineFeeTotal() {
		return refineFeeTotal;
	}

	public void setRefineFeeTotal(Double refineFeeTotal) {
		this.refineFeeTotal = refineFeeTotal;
	}

	public Boolean getSubType() {
		return subType;
	}

	public void setSubType(Boolean subType) {
		this.subType = subType;
	}

	public Double getSettleUnitPrice() {
		return settleUnitPrice;
	}

	public void setSettleUnitPrice(Double settleUnitPrice) {
		this.settleUnitPrice = settleUnitPrice;
	}

	public Double getSettleTotalMoney() {
		return settleTotalMoney;
	}

	public void setSettleTotalMoney(Double settleTotalMoney) {
		this.settleTotalMoney = settleTotalMoney;
	}

	public Boolean getJoinCalculate() {
		return joinCalculate;
	}

	public void setJoinCalculate(Boolean joinCalculate) {
		this.joinCalculate = joinCalculate;
	}

	public Integer getPointItem() {
		return pointItem;
	}

	public void setPointItem(Integer pointItem) {
		this.pointItem = pointItem;
	}

	public Integer getOldStockId() {
		return oldStockId;
	}

	public void setOldStockId(Integer oldStockId) {
		this.oldStockId = oldStockId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Double getRecyleGoodsAgio() {
		return recyleGoodsAgio;
	}

	public void setRecyleGoodsAgio(Double recyleGoodsAgio) {
		this.recyleGoodsAgio = recyleGoodsAgio;
	}

	public Integer getExchangeStoreId() {
		return exchangeStoreId;
	}

	public void setExchangeStoreId(Integer exchangeStoreId) {
		this.exchangeStoreId = exchangeStoreId;
	}

	public String getExchangeStoreName() {
		return exchangeStoreName;
	}

	public void setExchangeStoreName(String exchangeStoreName) {
		this.exchangeStoreName = exchangeStoreName;
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

	public String getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

	public String getGoldRange() {
		return goldRange;
	}

	public void setGoldRange(String goldRange) {
		this.goldRange = goldRange;
	}

	public String getStoneRange() {
		return stoneRange;
	}

	public void setStoneRange(String stoneRange) {
		this.stoneRange = stoneRange;
	}

	public Boolean getDhFlag() {
		return dhFlag;
	}

	public void setDhFlag(Boolean dhFlag) {
		this.dhFlag = dhFlag;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
