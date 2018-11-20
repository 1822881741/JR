package cn.jiafeng.erp.data.adapter.dao.entity;

import java.util.Date;

/**
 * 入库单详情 实体类
 * 
 * @author 
 * @date 2018-11-12
 */
public class ImportsheetItem implements java.io.Serializable{

	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	/**
     * 自增主键 
     */
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
     * 顾客名称：旧料单或旧饰回收才有 
     */
    private String customerName;

    /**
     * 顾客电话：旧料单或旧饰回收才有 
     */
    private String customerPhone;

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


    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return this.id;
    }
    

    public void setSheetId(Integer sheetId) {
        this.sheetId = sheetId;
    }
    
    public Integer getSheetId() {
        return this.sheetId;
    }
    

    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
    }
    
    public String getCompanyNo() {
        return this.companyNo;
    }
    

    public void setSheetNo(String sheetNo) {
        this.sheetNo = sheetNo;
    }
    
    public String getSheetNo() {
        return this.sheetNo;
    }
    

    public void setOldSheetNo(String oldSheetNo) {
        this.oldSheetNo = oldSheetNo;
    }
    
    public String getOldSheetNo() {
        return this.oldSheetNo;
    }
    

    public void setSupplierNo(String supplierNo) {
        this.supplierNo = supplierNo;
    }
    
    public String getSupplierNo() {
        return this.supplierNo;
    }
    

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    
    public String getSupplierName() {
        return this.supplierName;
    }
    

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public String getCustomerName() {
        return this.customerName;
    }
    

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
    
    public String getCustomerPhone() {
        return this.customerPhone;
    }
    

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
    
    public String getBarCode() {
        return this.barCode;
    }
    

    public void setOldBarCode(String oldBarCode) {
        this.oldBarCode = oldBarCode;
    }
    
    public String getOldBarCode() {
        return this.oldBarCode;
    }
    

    public void setSubGoodsName(String subGoodsName) {
        this.subGoodsName = subGoodsName;
    }
    
    public String getSubGoodsName() {
        return this.subGoodsName;
    }
    

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }
    
    public String getCertificateNo() {
        return this.certificateNo;
    }
    

    public void setGiaCertificateNo(String giaCertificateNo) {
        this.giaCertificateNo = giaCertificateNo;
    }
    
    public String getGiaCertificateNo() {
        return this.giaCertificateNo;
    }
    

    public void setStyle(String style) {
        this.style = style;
    }
    
    public String getStyle() {
        return this.style;
    }
    

    public void setStyleNo(String styleNo) {
        this.styleNo = styleNo;
    }
    
    public String getStyleNo() {
        return this.styleNo;
    }
    

    public void setShortCut(String shortCut) {
        this.shortCut = shortCut;
    }
    
    public String getShortCut() {
        return this.shortCut;
    }
    

    public void setCraft(String craft) {
        this.craft = craft;
    }
    
    public String getCraft() {
        return this.craft;
    }
    

    public void setMeasurementMode(String measurementMode) {
        this.measurementMode = measurementMode;
    }
    
    public String getMeasurementMode() {
        return this.measurementMode;
    }
    

    public void setImg(String img) {
        this.img = img;
    }
    
    public String getImg() {
        return this.img;
    }
    

    public void setOperUserId(Integer operUserId) {
        this.operUserId = operUserId;
    }
    
    public Integer getOperUserId() {
        return this.operUserId;
    }
    

    public void setOperUserName(String operUserName) {
        this.operUserName = operUserName;
    }
    
    public String getOperUserName() {
        return this.operUserName;
    }
    

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    public String getRemarks() {
        return this.remarks;
    }
    

    public void setDeptAreaCode(String deptAreaCode) {
        this.deptAreaCode = deptAreaCode;
    }
    
    public String getDeptAreaCode() {
        return this.deptAreaCode;
    }
    

    public void setDeptAreaName(String deptAreaName) {
        this.deptAreaName = deptAreaName;
    }
    
    public String getDeptAreaName() {
        return this.deptAreaName;
    }
    

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
    
    public Integer getStoreId() {
        return this.storeId;
    }
    

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    
    public String getStoreName() {
        return this.storeName;
    }
    

    public void setPurchaseSaleMode(String purchaseSaleMode) {
        this.purchaseSaleMode = purchaseSaleMode;
    }
    
    public String getPurchaseSaleMode() {
        return this.purchaseSaleMode;
    }
    

    public void setSheetType(Boolean sheetType) {
        this.sheetType = sheetType;
    }
    
    public Boolean getSheetType() {
        return this.sheetType;
    }
    

    public void setSpecialOffersFlag(String specialOffersFlag) {
        this.specialOffersFlag = specialOffersFlag;
    }
    
    public String getSpecialOffersFlag() {
        return this.specialOffersFlag;
    }
    

    public void setSheetDate(Date sheetDate) {
        this.sheetDate = sheetDate;
    }
    
    public Date getSheetDate() {
        return this.sheetDate;
    }
    

    public void setJtFlag(Boolean jtFlag) {
        this.jtFlag = jtFlag;
    }
    
    public Boolean getJtFlag() {
        return this.jtFlag;
    }
    

    public void setSaveFlag(Boolean saveFlag) {
        this.saveFlag = saveFlag;
    }
    
    public Boolean getSaveFlag() {
        return this.saveFlag;
    }
    

    public void setDaiXiaoFlag(Boolean daiXiaoFlag) {
        this.daiXiaoFlag = daiXiaoFlag;
    }
    
    public Boolean getDaiXiaoFlag() {
        return this.daiXiaoFlag;
    }
    

    public void setZaiTuFlag(Boolean zaiTuFlag) {
        this.zaiTuFlag = zaiTuFlag;
    }
    
    public Boolean getZaiTuFlag() {
        return this.zaiTuFlag;
    }
    

    public void setNum(Integer num) {
        this.num = num;
    }
    
    public Integer getNum() {
        return this.num;
    }
    

    public void setGoldWeight(Double goldWeight) {
        this.goldWeight = goldWeight;
    }
    
    public Double getGoldWeight() {
        return this.goldWeight;
    }
    

    public void setGoldLoss(Boolean goldLoss) {
        this.goldLoss = goldLoss;
    }
    
    public Boolean getGoldLoss() {
        return this.goldLoss;
    }
    

    public void setMaoGoldWeight(Double maoGoldWeight) {
        this.maoGoldWeight = maoGoldWeight;
    }
    
    public Double getMaoGoldWeight() {
        return this.maoGoldWeight;
    }
    

    public void setTotalGoldWeight(Double totalGoldWeight) {
        this.totalGoldWeight = totalGoldWeight;
    }
    
    public Double getTotalGoldWeight() {
        return this.totalGoldWeight;
    }
    

    public void setGoodsWeight(Double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }
    
    public Double getGoodsWeight() {
        return this.goodsWeight;
    }
    

    public void setGoldPrice(Double goldPrice) {
        this.goldPrice = goldPrice;
    }
    
    public Double getGoldPrice() {
        return this.goldPrice;
    }
    

    public void setWorksFee4Ke(Double worksFee4Ke) {
        this.worksFee4Ke = worksFee4Ke;
    }
    
    public Double getWorksFee4Ke() {
        return this.worksFee4Ke;
    }
    

    public void setWorksFee4Jian(Double worksFee4Jian) {
        this.worksFee4Jian = worksFee4Jian;
    }
    
    public Double getWorksFee4Jian() {
        return this.worksFee4Jian;
    }
    

    public void setWorksFeeTotal(Double worksFeeTotal) {
        this.worksFeeTotal = worksFeeTotal;
    }
    
    public Double getWorksFeeTotal() {
        return this.worksFeeTotal;
    }
    

    public void setCertificateFee(Double certificateFee) {
        this.certificateFee = certificateFee;
    }
    
    public Double getCertificateFee() {
        return this.certificateFee;
    }
    

    public void setFittingsFee(Double fittingsFee) {
        this.fittingsFee = fittingsFee;
    }
    
    public Double getFittingsFee() {
        return this.fittingsFee;
    }
    

    public void setSandBlastFee(Double sandBlastFee) {
        this.sandBlastFee = sandBlastFee;
    }
    
    public Double getSandBlastFee() {
        return this.sandBlastFee;
    }
    

    public void setOtherFee(Double otherFee) {
        this.otherFee = otherFee;
    }
    
    public Double getOtherFee() {
        return this.otherFee;
    }
    

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public Double getUnitPrice() {
        return this.unitPrice;
    }
    

    public void setGoldCostPrice(Double goldCostPrice) {
        this.goldCostPrice = goldCostPrice;
    }
    
    public Double getGoldCostPrice() {
        return this.goldCostPrice;
    }
    

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }
    
    public Double getCostPrice() {
        return this.costPrice;
    }
    

    public void setMarkupRate(Double markupRate) {
        this.markupRate = markupRate;
    }
    
    public Double getMarkupRate() {
        return this.markupRate;
    }
    

    public void setLabelPrice(Double labelPrice) {
        this.labelPrice = labelPrice;
    }
    
    public Double getLabelPrice() {
        return this.labelPrice;
    }
    

    public void setSalePriceAmount(Double salePriceAmount) {
        this.salePriceAmount = salePriceAmount;
    }
    
    public Double getSalePriceAmount() {
        return this.salePriceAmount;
    }
    

    public void setLabelWorkFee(Double labelWorkFee) {
        this.labelWorkFee = labelWorkFee;
    }
    
    public Double getLabelWorkFee() {
        return this.labelWorkFee;
    }
    

    public void setLabelWorkFee4Ke(Double labelWorkFee4Ke) {
        this.labelWorkFee4Ke = labelWorkFee4Ke;
    }
    
    public Double getLabelWorkFee4Ke() {
        return this.labelWorkFee4Ke;
    }
    

    public void setLabelWorkFee4Jian(Double labelWorkFee4Jian) {
        this.labelWorkFee4Jian = labelWorkFee4Jian;
    }
    
    public Double getLabelWorkFee4Jian() {
        return this.labelWorkFee4Jian;
    }
    

    public void setLabelRemarks(String labelRemarks) {
        this.labelRemarks = labelRemarks;
    }
    
    public String getLabelRemarks() {
        return this.labelRemarks;
    }
    

    public void setArchivesId(Integer archivesId) {
        this.archivesId = archivesId;
    }
    
    public Integer getArchivesId() {
        return this.archivesId;
    }
    

    public void setArchivesNo(String archivesNo) {
        this.archivesNo = archivesNo;
    }
    
    public String getArchivesNo() {
        return this.archivesNo;
    }
    

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    
    public String getGoodsName() {
        return this.goodsName;
    }
    

    public void setGoodsNameEn(String goodsNameEn) {
        this.goodsNameEn = goodsNameEn;
    }
    
    public String getGoodsNameEn() {
        return this.goodsNameEn;
    }
    

    public void setArchivesFineness(String archivesFineness) {
        this.archivesFineness = archivesFineness;
    }
    
    public String getArchivesFineness() {
        return this.archivesFineness;
    }
    

    public void setArchivesStone(String archivesStone) {
        this.archivesStone = archivesStone;
    }
    
    public String getArchivesStone() {
        return this.archivesStone;
    }
    

    public void setArchivesCategory(String archivesCategory) {
        this.archivesCategory = archivesCategory;
    }
    
    public String getArchivesCategory() {
        return this.archivesCategory;
    }
    

    public void setMainType(String mainType) {
        this.mainType = mainType;
    }
    
    public String getMainType() {
        return this.mainType;
    }
    

    public void setMainTypePrefix(String mainTypePrefix) {
        this.mainTypePrefix = mainTypePrefix;
    }
    
    public String getMainTypePrefix() {
        return this.mainTypePrefix;
    }
    

    public void setGoodsClassify(String goodsClassify) {
        this.goodsClassify = goodsClassify;
    }
    
    public String getGoodsClassify() {
        return this.goodsClassify;
    }
    

    public void setCostClassify(String costClassify) {
        this.costClassify = costClassify;
    }
    
    public String getCostClassify() {
        return this.costClassify;
    }
    

    public void setStatsClassify(String statsClassify) {
        this.statsClassify = statsClassify;
    }
    
    public String getStatsClassify() {
        return this.statsClassify;
    }
    

    public void setMainStoneCut(String mainStoneCut) {
        this.mainStoneCut = mainStoneCut;
    }
    
    public String getMainStoneCut() {
        return this.mainStoneCut;
    }
    

    public void setMainStoneColor(String mainStoneColor) {
        this.mainStoneColor = mainStoneColor;
    }
    
    public String getMainStoneColor() {
        return this.mainStoneColor;
    }
    

    public void setMainStoneClarity(String mainStoneClarity) {
        this.mainStoneClarity = mainStoneClarity;
    }
    
    public String getMainStoneClarity() {
        return this.mainStoneClarity;
    }
    

    public void setMainStoneFluorescent(String mainStoneFluorescent) {
        this.mainStoneFluorescent = mainStoneFluorescent;
    }
    
    public String getMainStoneFluorescent() {
        return this.mainStoneFluorescent;
    }
    

    public void setMainStoneBurnished(String mainStoneBurnished) {
        this.mainStoneBurnished = mainStoneBurnished;
    }
    
    public String getMainStoneBurnished() {
        return this.mainStoneBurnished;
    }
    

    public void setMainStoneSymmetry(String mainStoneSymmetry) {
        this.mainStoneSymmetry = mainStoneSymmetry;
    }
    
    public String getMainStoneSymmetry() {
        return this.mainStoneSymmetry;
    }
    

    public void setMainStoneName(String mainStoneName) {
        this.mainStoneName = mainStoneName;
    }
    
    public String getMainStoneName() {
        return this.mainStoneName;
    }
    

    public void setMainStoneNo(String mainStoneNo) {
        this.mainStoneNo = mainStoneNo;
    }
    
    public String getMainStoneNo() {
        return this.mainStoneNo;
    }
    

    public void setMainStoneSpecifi(String mainStoneSpecifi) {
        this.mainStoneSpecifi = mainStoneSpecifi;
    }
    
    public String getMainStoneSpecifi() {
        return this.mainStoneSpecifi;
    }
    

    public void setMainStoneNum(Integer mainStoneNum) {
        this.mainStoneNum = mainStoneNum;
    }
    
    public Integer getMainStoneNum() {
        return this.mainStoneNum;
    }
    

    public void setMainStoneWeight(Double mainStoneWeight) {
        this.mainStoneWeight = mainStoneWeight;
    }
    
    public Double getMainStoneWeight() {
        return this.mainStoneWeight;
    }
    

    public void setMainStonePrice(Double mainStonePrice) {
        this.mainStonePrice = mainStonePrice;
    }
    
    public Double getMainStonePrice() {
        return this.mainStonePrice;
    }
    

    public void setMainStoneMoney(Double mainStoneMoney) {
        this.mainStoneMoney = mainStoneMoney;
    }
    
    public Double getMainStoneMoney() {
        return this.mainStoneMoney;
    }
    

    public void setSubStone1Name(String subStone1Name) {
        this.subStone1Name = subStone1Name;
    }
    
    public String getSubStone1Name() {
        return this.subStone1Name;
    }
    

    public void setSubStone1No(String subStone1No) {
        this.subStone1No = subStone1No;
    }
    
    public String getSubStone1No() {
        return this.subStone1No;
    }
    

    public void setSubStone1Specifi(String subStone1Specifi) {
        this.subStone1Specifi = subStone1Specifi;
    }
    
    public String getSubStone1Specifi() {
        return this.subStone1Specifi;
    }
    

    public void setSubStone1Num(Integer subStone1Num) {
        this.subStone1Num = subStone1Num;
    }
    
    public Integer getSubStone1Num() {
        return this.subStone1Num;
    }
    

    public void setSubStone1Weight(Double subStone1Weight) {
        this.subStone1Weight = subStone1Weight;
    }
    
    public Double getSubStone1Weight() {
        return this.subStone1Weight;
    }
    

    public void setSubStone1Price(Double subStone1Price) {
        this.subStone1Price = subStone1Price;
    }
    
    public Double getSubStone1Price() {
        return this.subStone1Price;
    }
    

    public void setSubStone1Money(Double subStone1Money) {
        this.subStone1Money = subStone1Money;
    }
    
    public Double getSubStone1Money() {
        return this.subStone1Money;
    }
    

    public void setSubStone2Name(String subStone2Name) {
        this.subStone2Name = subStone2Name;
    }
    
    public String getSubStone2Name() {
        return this.subStone2Name;
    }
    

    public void setSubStone2No(String subStone2No) {
        this.subStone2No = subStone2No;
    }
    
    public String getSubStone2No() {
        return this.subStone2No;
    }
    

    public void setSubStone2Specifi(String subStone2Specifi) {
        this.subStone2Specifi = subStone2Specifi;
    }
    
    public String getSubStone2Specifi() {
        return this.subStone2Specifi;
    }
    

    public void setSubStone2Num(Integer subStone2Num) {
        this.subStone2Num = subStone2Num;
    }
    
    public Integer getSubStone2Num() {
        return this.subStone2Num;
    }
    

    public void setSubStone2Weight(Double subStone2Weight) {
        this.subStone2Weight = subStone2Weight;
    }
    
    public Double getSubStone2Weight() {
        return this.subStone2Weight;
    }
    

    public void setSubStone2Price(Double subStone2Price) {
        this.subStone2Price = subStone2Price;
    }
    
    public Double getSubStone2Price() {
        return this.subStone2Price;
    }
    

    public void setSubStone2Money(Double subStone2Money) {
        this.subStone2Money = subStone2Money;
    }
    
    public Double getSubStone2Money() {
        return this.subStone2Money;
    }
    

    public void setSubStone3Name(String subStone3Name) {
        this.subStone3Name = subStone3Name;
    }
    
    public String getSubStone3Name() {
        return this.subStone3Name;
    }
    

    public void setSubStone3No(String subStone3No) {
        this.subStone3No = subStone3No;
    }
    
    public String getSubStone3No() {
        return this.subStone3No;
    }
    

    public void setSubStone3Specifi(String subStone3Specifi) {
        this.subStone3Specifi = subStone3Specifi;
    }
    
    public String getSubStone3Specifi() {
        return this.subStone3Specifi;
    }
    

    public void setSubStone3Num(Integer subStone3Num) {
        this.subStone3Num = subStone3Num;
    }
    
    public Integer getSubStone3Num() {
        return this.subStone3Num;
    }
    

    public void setSubStone3Weight(Double subStone3Weight) {
        this.subStone3Weight = subStone3Weight;
    }
    
    public Double getSubStone3Weight() {
        return this.subStone3Weight;
    }
    

    public void setSubStone3Price(Double subStone3Price) {
        this.subStone3Price = subStone3Price;
    }
    
    public Double getSubStone3Price() {
        return this.subStone3Price;
    }
    

    public void setSubStone3Money(Double subStone3Money) {
        this.subStone3Money = subStone3Money;
    }
    
    public Double getSubStone3Money() {
        return this.subStone3Money;
    }
    

    public void setSubStone4Name(String subStone4Name) {
        this.subStone4Name = subStone4Name;
    }
    
    public String getSubStone4Name() {
        return this.subStone4Name;
    }
    

    public void setSubStone4No(String subStone4No) {
        this.subStone4No = subStone4No;
    }
    
    public String getSubStone4No() {
        return this.subStone4No;
    }
    

    public void setSubStone4Specifi(String subStone4Specifi) {
        this.subStone4Specifi = subStone4Specifi;
    }
    
    public String getSubStone4Specifi() {
        return this.subStone4Specifi;
    }
    

    public void setSubStone4Num(Integer subStone4Num) {
        this.subStone4Num = subStone4Num;
    }
    
    public Integer getSubStone4Num() {
        return this.subStone4Num;
    }
    

    public void setSubStone4Weight(Double subStone4Weight) {
        this.subStone4Weight = subStone4Weight;
    }
    
    public Double getSubStone4Weight() {
        return this.subStone4Weight;
    }
    

    public void setSubStone4Price(Double subStone4Price) {
        this.subStone4Price = subStone4Price;
    }
    
    public Double getSubStone4Price() {
        return this.subStone4Price;
    }
    

    public void setSubStone4Money(Double subStone4Money) {
        this.subStone4Money = subStone4Money;
    }
    
    public Double getSubStone4Money() {
        return this.subStone4Money;
    }
    

    public void setSubStone5Name(String subStone5Name) {
        this.subStone5Name = subStone5Name;
    }
    
    public String getSubStone5Name() {
        return this.subStone5Name;
    }
    

    public void setSubStone5No(String subStone5No) {
        this.subStone5No = subStone5No;
    }
    
    public String getSubStone5No() {
        return this.subStone5No;
    }
    

    public void setSubStone5Specifi(String subStone5Specifi) {
        this.subStone5Specifi = subStone5Specifi;
    }
    
    public String getSubStone5Specifi() {
        return this.subStone5Specifi;
    }
    

    public void setSubStone5Num(Integer subStone5Num) {
        this.subStone5Num = subStone5Num;
    }
    
    public Integer getSubStone5Num() {
        return this.subStone5Num;
    }
    

    public void setSubStone5Weight(Double subStone5Weight) {
        this.subStone5Weight = subStone5Weight;
    }
    
    public Double getSubStone5Weight() {
        return this.subStone5Weight;
    }
    

    public void setSubStone5Price(Double subStone5Price) {
        this.subStone5Price = subStone5Price;
    }
    
    public Double getSubStone5Price() {
        return this.subStone5Price;
    }
    

    public void setSubStone5Money(Double subStone5Money) {
        this.subStone5Money = subStone5Money;
    }
    
    public Double getSubStone5Money() {
        return this.subStone5Money;
    }
    

    public void setSubStone6Name(String subStone6Name) {
        this.subStone6Name = subStone6Name;
    }
    
    public String getSubStone6Name() {
        return this.subStone6Name;
    }
    

    public void setSubStone6No(String subStone6No) {
        this.subStone6No = subStone6No;
    }
    
    public String getSubStone6No() {
        return this.subStone6No;
    }
    

    public void setSubStone6Specifi(String subStone6Specifi) {
        this.subStone6Specifi = subStone6Specifi;
    }
    
    public String getSubStone6Specifi() {
        return this.subStone6Specifi;
    }
    

    public void setSubStone6Num(Integer subStone6Num) {
        this.subStone6Num = subStone6Num;
    }
    
    public Integer getSubStone6Num() {
        return this.subStone6Num;
    }
    

    public void setSubStone6Weight(Double subStone6Weight) {
        this.subStone6Weight = subStone6Weight;
    }
    
    public Double getSubStone6Weight() {
        return this.subStone6Weight;
    }
    

    public void setSubStone6Price(Double subStone6Price) {
        this.subStone6Price = subStone6Price;
    }
    
    public Double getSubStone6Price() {
        return this.subStone6Price;
    }
    

    public void setSubStone6Money(Double subStone6Money) {
        this.subStone6Money = subStone6Money;
    }
    
    public Double getSubStone6Money() {
        return this.subStone6Money;
    }
    

    public void setPeiShiCostPrice(Double peiShiCostPrice) {
        this.peiShiCostPrice = peiShiCostPrice;
    }
    
    public Double getPeiShiCostPrice() {
        return this.peiShiCostPrice;
    }
    

    public void setPeiShiRate(Double peiShiRate) {
        this.peiShiRate = peiShiRate;
    }
    
    public Double getPeiShiRate() {
        return this.peiShiRate;
    }
    

    public void setPeiShiLabelPrice(Double peiShiLabelPrice) {
        this.peiShiLabelPrice = peiShiLabelPrice;
    }
    
    public Double getPeiShiLabelPrice() {
        return this.peiShiLabelPrice;
    }
    

    public void setNetGoldWeight(Double netGoldWeight) {
        this.netGoldWeight = netGoldWeight;
    }
    
    public Double getNetGoldWeight() {
        return this.netGoldWeight;
    }
    

    public void setOldMaterialQuality(Double oldMaterialQuality) {
        this.oldMaterialQuality = oldMaterialQuality;
    }
    
    public Double getOldMaterialQuality() {
        return this.oldMaterialQuality;
    }
    

    public void setOldMaterialLoss(Double oldMaterialLoss) {
        this.oldMaterialLoss = oldMaterialLoss;
    }
    
    public Double getOldMaterialLoss() {
        return this.oldMaterialLoss;
    }
    

    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    public String getOrigin() {
        return this.origin;
    }
    

    public void setRecFlag(Boolean recFlag) {
        this.recFlag = recFlag;
    }
    
    public Boolean getRecFlag() {
        return this.recFlag;
    }
    

    public void setSaleManId(Integer saleManId) {
        this.saleManId = saleManId;
    }
    
    public Integer getSaleManId() {
        return this.saleManId;
    }
    

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }
    
    public String getSalesmanName() {
        return this.salesmanName;
    }
    

    public void setHasReturn(Boolean hasReturn) {
        this.hasReturn = hasReturn;
    }
    
    public Boolean getHasReturn() {
        return this.hasReturn;
    }
    

    public void setOrgItemId(Integer orgItemId) {
        this.orgItemId = orgItemId;
    }
    
    public Integer getOrgItemId() {
        return this.orgItemId;
    }
    

    public void setOrgLabelPrice(Double orgLabelPrice) {
        this.orgLabelPrice = orgLabelPrice;
    }
    
    public Double getOrgLabelPrice() {
        return this.orgLabelPrice;
    }
    

    public void setOrgSettlementPrice(Double orgSettlementPrice) {
        this.orgSettlementPrice = orgSettlementPrice;
    }
    
    public Double getOrgSettlementPrice() {
        return this.orgSettlementPrice;
    }
    

    public void setIncrementMoney(Double incrementMoney) {
        this.incrementMoney = incrementMoney;
    }
    
    public Double getIncrementMoney() {
        return this.incrementMoney;
    }
    

    public void setPurchaseAmount(Double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
    
    public Double getPurchaseAmount() {
        return this.purchaseAmount;
    }
    

    public void setGrfName(String grfName) {
        this.grfName = grfName;
    }
    
    public String getGrfName() {
        return this.grfName;
    }
    

    public void setRefineFee(Double refineFee) {
        this.refineFee = refineFee;
    }
    
    public Double getRefineFee() {
        return this.refineFee;
    }
    

    public void setRefineFeeTotal(Double refineFeeTotal) {
        this.refineFeeTotal = refineFeeTotal;
    }
    
    public Double getRefineFeeTotal() {
        return this.refineFeeTotal;
    }
    

    public void setSubType(Boolean subType) {
        this.subType = subType;
    }
    
    public Boolean getSubType() {
        return this.subType;
    }
    

    public void setSettleUnitPrice(Double settleUnitPrice) {
        this.settleUnitPrice = settleUnitPrice;
    }
    
    public Double getSettleUnitPrice() {
        return this.settleUnitPrice;
    }
    

    public void setSettleTotalMoney(Double settleTotalMoney) {
        this.settleTotalMoney = settleTotalMoney;
    }
    
    public Double getSettleTotalMoney() {
        return this.settleTotalMoney;
    }
    

    public void setJoinCalculate(Boolean joinCalculate) {
        this.joinCalculate = joinCalculate;
    }
    
    public Boolean getJoinCalculate() {
        return this.joinCalculate;
    }
    

    public void setPointItem(Integer pointItem) {
        this.pointItem = pointItem;
    }
    
    public Integer getPointItem() {
        return this.pointItem;
    }
    

    public void setOldStockId(Integer oldStockId) {
        this.oldStockId = oldStockId;
    }
    
    public Integer getOldStockId() {
        return this.oldStockId;
    }
    

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    
    public String getBrandName() {
        return this.brandName;
    }
    

    public void setRecyleGoodsAgio(Double recyleGoodsAgio) {
        this.recyleGoodsAgio = recyleGoodsAgio;
    }
    
    public Double getRecyleGoodsAgio() {
        return this.recyleGoodsAgio;
    }
    

    public void setExchangeStoreId(Integer exchangeStoreId) {
        this.exchangeStoreId = exchangeStoreId;
    }
    
    public Integer getExchangeStoreId() {
        return this.exchangeStoreId;
    }
    

    public void setExchangeStoreName(String exchangeStoreName) {
        this.exchangeStoreName = exchangeStoreName;
    }
    
    public String getExchangeStoreName() {
        return this.exchangeStoreName;
    }
    

    public void setSheetStatus(Integer sheetStatus) {
        this.sheetStatus = sheetStatus;
    }
    
    public Integer getSheetStatus() {
        return this.sheetStatus;
    }
    

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }
    
    public Date getReceiveTime() {
        return this.receiveTime;
    }
    

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }
    
    public String getPriceRange() {
        return this.priceRange;
    }
    

    public void setGoldRange(String goldRange) {
        this.goldRange = goldRange;
    }
    
    public String getGoldRange() {
        return this.goldRange;
    }
    

    public void setStoneRange(String stoneRange) {
        this.stoneRange = stoneRange;
    }
    
    public String getStoneRange() {
        return this.stoneRange;
    }
    

    public void setDhFlag(Boolean dhFlag) {
        this.dhFlag = dhFlag;
    }
    
    public Boolean getDhFlag() {
        return this.dhFlag;
    }
    

}
