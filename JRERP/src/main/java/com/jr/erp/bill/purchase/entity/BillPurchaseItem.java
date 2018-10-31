package com.jr.erp.bill.purchase.entity;

import com.jr.erp.base.mybatis.BaseEntity;
import java.util.Date;

public class BillPurchaseItem extends BaseEntity {
    /**
     * 入库单id
     */
    private Integer billId;

    /**
     * 单号
     */
    private String billNo;

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
     * 
     */
    private String barCode;

    /**
     * 
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
    private Integer sheetType;

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
    private Integer jtFlag;

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
    private Integer goldLoss;

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
     * 
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
     * 
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
    private Integer subType;

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
    private Integer joinCalculate;

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

    /**
     * 入库单id
     * @return billId 入库单id
     */
    public Integer getBillId() {
        return billId;
    }

    /**
     * 入库单id
     * @param billId 入库单id
     */
    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    /**
     * 单号
     * @return billNo 单号
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * 单号
     * @param billNo 单号
     */
    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    /**
     * 原单号
     * @return oldSheetNo 原单号
     */
    public String getOldSheetNo() {
        return oldSheetNo;
    }

    /**
     * 原单号
     * @param oldSheetNo 原单号
     */
    public void setOldSheetNo(String oldSheetNo) {
        this.oldSheetNo = oldSheetNo == null ? null : oldSheetNo.trim();
    }

    /**
     * 供应商编号
     * @return supplierNo 供应商编号
     */
    public String getSupplierNo() {
        return supplierNo;
    }

    /**
     * 供应商编号
     * @param supplierNo 供应商编号
     */
    public void setSupplierNo(String supplierNo) {
        this.supplierNo = supplierNo == null ? null : supplierNo.trim();
    }

    /**
     * 供应商名称
     * @return supplierName 供应商名称
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * 供应商名称
     * @param supplierName 供应商名称
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    /**
     * 顾客名称：旧料单或旧饰回收才有
     * @return customerName 顾客名称：旧料单或旧饰回收才有
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 顾客名称：旧料单或旧饰回收才有
     * @param customerName 顾客名称：旧料单或旧饰回收才有
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * 顾客电话：旧料单或旧饰回收才有
     * @return customerPhone 顾客电话：旧料单或旧饰回收才有
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * 顾客电话：旧料单或旧饰回收才有
     * @param customerPhone 顾客电话：旧料单或旧饰回收才有
     */
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    /**
     * 
     * @return barCode 
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * 
     * @param barCode 
     */
    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    /**
     * 
     * @return oldBarCode 
     */
    public String getOldBarCode() {
        return oldBarCode;
    }

    /**
     * 
     * @param oldBarCode 
     */
    public void setOldBarCode(String oldBarCode) {
        this.oldBarCode = oldBarCode == null ? null : oldBarCode.trim();
    }

    /**
     * 商品子名称
     * @return subGoodsName 商品子名称
     */
    public String getSubGoodsName() {
        return subGoodsName;
    }

    /**
     * 商品子名称
     * @param subGoodsName 商品子名称
     */
    public void setSubGoodsName(String subGoodsName) {
        this.subGoodsName = subGoodsName == null ? null : subGoodsName.trim();
    }

    /**
     * 证书号
     * @return certificateNo 证书号
     */
    public String getCertificateNo() {
        return certificateNo;
    }

    /**
     * 证书号
     * @param certificateNo 证书号
     */
    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
    }

    /**
     * GIA证书号
     * @return giaCertificateNo GIA证书号
     */
    public String getGiaCertificateNo() {
        return giaCertificateNo;
    }

    /**
     * GIA证书号
     * @param giaCertificateNo GIA证书号
     */
    public void setGiaCertificateNo(String giaCertificateNo) {
        this.giaCertificateNo = giaCertificateNo == null ? null : giaCertificateNo.trim();
    }

    /**
     * 款式
     * @return style 款式
     */
    public String getStyle() {
        return style;
    }

    /**
     * 款式
     * @param style 款式
     */
    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    /**
     * 款号
     * @return styleNo 款号
     */
    public String getStyleNo() {
        return styleNo;
    }

    /**
     * 款号
     * @param styleNo 款号
     */
    public void setStyleNo(String styleNo) {
        this.styleNo = styleNo == null ? null : styleNo.trim();
    }

    /**
     * 手寸
     * @return shortCut 手寸
     */
    public String getShortCut() {
        return shortCut;
    }

    /**
     * 手寸
     * @param shortCut 手寸
     */
    public void setShortCut(String shortCut) {
        this.shortCut = shortCut == null ? null : shortCut.trim();
    }

    /**
     * 工艺
     * @return craft 工艺
     */
    public String getCraft() {
        return craft;
    }

    /**
     * 工艺
     * @param craft 工艺
     */
    public void setCraft(String craft) {
        this.craft = craft == null ? null : craft.trim();
    }

    /**
     * 计量方式
     * @return measurementMode 计量方式
     */
    public String getMeasurementMode() {
        return measurementMode;
    }

    /**
     * 计量方式
     * @param measurementMode 计量方式
     */
    public void setMeasurementMode(String measurementMode) {
        this.measurementMode = measurementMode == null ? null : measurementMode.trim();
    }

    /**
     * 图片路径
     * @return img 图片路径
     */
    public String getImg() {
        return img;
    }

    /**
     * 图片路径
     * @param img 图片路径
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * 操作员ID
     * @return operUserId 操作员ID
     */
    public Integer getOperUserId() {
        return operUserId;
    }

    /**
     * 操作员ID
     * @param operUserId 操作员ID
     */
    public void setOperUserId(Integer operUserId) {
        this.operUserId = operUserId;
    }

    /**
     * 操作员名称
     * @return operUserName 操作员名称
     */
    public String getOperUserName() {
        return operUserName;
    }

    /**
     * 操作员名称
     * @param operUserName 操作员名称
     */
    public void setOperUserName(String operUserName) {
        this.operUserName = operUserName == null ? null : operUserName.trim();
    }

    /**
     * 商品备注信息
     * @return remarks 商品备注信息
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 商品备注信息
     * @param remarks 商品备注信息
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * 部门地区码：公司节点或者门店节点的地区码（地区表）
     * @return deptAreaCode 部门地区码：公司节点或者门店节点的地区码（地区表）
     */
    public String getDeptAreaCode() {
        return deptAreaCode;
    }

    /**
     * 部门地区码：公司节点或者门店节点的地区码（地区表）
     * @param deptAreaCode 部门地区码：公司节点或者门店节点的地区码（地区表）
     */
    public void setDeptAreaCode(String deptAreaCode) {
        this.deptAreaCode = deptAreaCode == null ? null : deptAreaCode.trim();
    }

    /**
     * 部门地区名称：公司节点或者门店节点的地区名称（地区表）
     * @return deptAreaName 部门地区名称：公司节点或者门店节点的地区名称（地区表）
     */
    public String getDeptAreaName() {
        return deptAreaName;
    }

    /**
     * 部门地区名称：公司节点或者门店节点的地区名称（地区表）
     * @param deptAreaName 部门地区名称：公司节点或者门店节点的地区名称（地区表）
     */
    public void setDeptAreaName(String deptAreaName) {
        this.deptAreaName = deptAreaName == null ? null : deptAreaName.trim();
    }

    /**
     * 仓库ID
     * @return storeId 仓库ID
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * 仓库ID
     * @param storeId 仓库ID
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * 仓库名称
     * @return storeName 仓库名称
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 仓库名称
     * @param storeName 仓库名称
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**
     * 购销方式：从通用类型中选择：方式设置中
     * @return purchaseSaleMode 购销方式：从通用类型中选择：方式设置中
     */
    public String getPurchaseSaleMode() {
        return purchaseSaleMode;
    }

    /**
     * 购销方式：从通用类型中选择：方式设置中
     * @param purchaseSaleMode 购销方式：从通用类型中选择：方式设置中
     */
    public void setPurchaseSaleMode(String purchaseSaleMode) {
        this.purchaseSaleMode = purchaseSaleMode == null ? null : purchaseSaleMode.trim();
    }

    /**
     * 单据类型：1：进货；2:进货退回；3：收购：4：兑换.......
     * @return sheetType 单据类型：1：进货；2:进货退回；3：收购：4：兑换.......
     */
    public Integer getSheetType() {
        return sheetType;
    }

    /**
     * 单据类型：1：进货；2:进货退回；3：收购：4：兑换.......
     * @param sheetType 单据类型：1：进货；2:进货退回；3：收购：4：兑换.......
     */
    public void setSheetType(Integer sheetType) {
        this.sheetType = sheetType;
    }

    /**
     * 特价标记，换为汉子显示
     * @return specialOffersFlag 特价标记，换为汉子显示
     */
    public String getSpecialOffersFlag() {
        return specialOffersFlag;
    }

    /**
     * 特价标记，换为汉子显示
     * @param specialOffersFlag 特价标记，换为汉子显示
     */
    public void setSpecialOffersFlag(String specialOffersFlag) {
        this.specialOffersFlag = specialOffersFlag == null ? null : specialOffersFlag.trim();
    }

    /**
     * 单据日期：在保存单个商品时首次使用的是单的日期，在保存单的时候使用的是单的日期+当前时分秒
     * @return sheetDate 单据日期：在保存单个商品时首次使用的是单的日期，在保存单的时候使用的是单的日期+当前时分秒
     */
    public Date getSheetDate() {
        return sheetDate;
    }

    /**
     * 单据日期：在保存单个商品时首次使用的是单的日期，在保存单的时候使用的是单的日期+当前时分秒
     * @param sheetDate 单据日期：在保存单个商品时首次使用的是单的日期，在保存单的时候使用的是单的日期+当前时分秒
     */
    public void setSheetDate(Date sheetDate) {
        this.sheetDate = sheetDate;
    }

    /**
     * 进货退货标记：1：进货；-1:退货
     * @return jtFlag 进货退货标记：1：进货；-1:退货
     */
    public Integer getJtFlag() {
        return jtFlag;
    }

    /**
     * 进货退货标记：1：进货；-1:退货
     * @param jtFlag 进货退货标记：1：进货；-1:退货
     */
    public void setJtFlag(Integer jtFlag) {
        this.jtFlag = jtFlag;
    }

    /**
     * 单据是否已经保存：0未保存；1已经保存
     * @return saveFlag 单据是否已经保存：0未保存；1已经保存
     */
    public Boolean getSaveFlag() {
        return saveFlag;
    }

    /**
     * 单据是否已经保存：0未保存；1已经保存
     * @param saveFlag 单据是否已经保存：0未保存；1已经保存
     */
    public void setSaveFlag(Boolean saveFlag) {
        this.saveFlag = saveFlag;
    }

    /**
     * 代销标记：0不是代销；1是代销商品
     * @return daiXiaoFlag 代销标记：0不是代销；1是代销商品
     */
    public Boolean getDaiXiaoFlag() {
        return daiXiaoFlag;
    }

    /**
     * 代销标记：0不是代销；1是代销商品
     * @param daiXiaoFlag 代销标记：0不是代销；1是代销商品
     */
    public void setDaiXiaoFlag(Boolean daiXiaoFlag) {
        this.daiXiaoFlag = daiXiaoFlag;
    }

    /**
     * 在途标记：0：不是在途；1：商品在途
     * @return zaiTuFlag 在途标记：0：不是在途；1：商品在途
     */
    public Boolean getZaiTuFlag() {
        return zaiTuFlag;
    }

    /**
     * 在途标记：0：不是在途；1：商品在途
     * @param zaiTuFlag 在途标记：0：不是在途；1：商品在途
     */
    public void setZaiTuFlag(Boolean zaiTuFlag) {
        this.zaiTuFlag = zaiTuFlag;
    }

    /**
     * 数量
     * @return num 数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 数量
     * @param num 数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 金重：净金重
     * @return goldWeight 金重：净金重
     */
    public Double getGoldWeight() {
        return goldWeight;
    }

    /**
     * 金重：净金重
     * @param goldWeight 金重：净金重
     */
    public void setGoldWeight(Double goldWeight) {
        this.goldWeight = goldWeight;
    }

    /**
     * 损耗百分比
     * @return goldLoss 损耗百分比
     */
    public Integer getGoldLoss() {
        return goldLoss;
    }

    /**
     * 损耗百分比
     * @param goldLoss 损耗百分比
     */
    public void setGoldLoss(Integer goldLoss) {
        this.goldLoss = goldLoss;
    }

    /**
     * 毛金重：加上损耗的金重；镶嵌类在计算成本时使用到
     * @return maoGoldWeight 毛金重：加上损耗的金重；镶嵌类在计算成本时使用到
     */
    public Double getMaoGoldWeight() {
        return maoGoldWeight;
    }

    /**
     * 毛金重：加上损耗的金重；镶嵌类在计算成本时使用到
     * @param maoGoldWeight 毛金重：加上损耗的金重；镶嵌类在计算成本时使用到
     */
    public void setMaoGoldWeight(Double maoGoldWeight) {
        this.maoGoldWeight = maoGoldWeight;
    }

    /**
     * 总金重：主要是K金或素金类（K金*数量；素金金重）;其他类货品也记录，便于统计
     * @return totalGoldWeight 总金重：主要是K金或素金类（K金*数量；素金金重）;其他类货品也记录，便于统计
     */
    public Double getTotalGoldWeight() {
        return totalGoldWeight;
    }

    /**
     * 总金重：主要是K金或素金类（K金*数量；素金金重）;其他类货品也记录，便于统计
     * @param totalGoldWeight 总金重：主要是K金或素金类（K金*数量；素金金重）;其他类货品也记录，便于统计
     */
    public void setTotalGoldWeight(Double totalGoldWeight) {
        this.totalGoldWeight = totalGoldWeight;
    }

    /**
     * 商品总重：镶嵌类+金镶玉（金重+石重），一码一货的商品，且有金和石的
     * @return goodsWeight 商品总重：镶嵌类+金镶玉（金重+石重），一码一货的商品，且有金和石的
     */
    public Double getGoodsWeight() {
        return goodsWeight;
    }

    /**
     * 商品总重：镶嵌类+金镶玉（金重+石重），一码一货的商品，且有金和石的
     * @param goodsWeight 商品总重：镶嵌类+金镶玉（金重+石重），一码一货的商品，且有金和石的
     */
    public void setGoodsWeight(Double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    /**
     * 金价
     * @return goldPrice 金价
     */
    public Double getGoldPrice() {
        return goldPrice;
    }

    /**
     * 金价
     * @param goldPrice 金价
     */
    public void setGoldPrice(Double goldPrice) {
        this.goldPrice = goldPrice;
    }

    /**
     * 克工费
     * @return worksFee4Ke 克工费
     */
    public Double getWorksFee4Ke() {
        return worksFee4Ke;
    }

    /**
     * 克工费
     * @param worksFee4Ke 克工费
     */
    public void setWorksFee4Ke(Double worksFee4Ke) {
        this.worksFee4Ke = worksFee4Ke;
    }

    /**
     * 件工费
     * @return worksFee4Jian 件工费
     */
    public Double getWorksFee4Jian() {
        return worksFee4Jian;
    }

    /**
     * 件工费
     * @param worksFee4Jian 件工费
     */
    public void setWorksFee4Jian(Double worksFee4Jian) {
        this.worksFee4Jian = worksFee4Jian;
    }

    /**
     * 总工费，该工费暂时用到的地方为兑换业务处
     * @return worksFeeTotal 总工费，该工费暂时用到的地方为兑换业务处
     */
    public Double getWorksFeeTotal() {
        return worksFeeTotal;
    }

    /**
     * 总工费，该工费暂时用到的地方为兑换业务处
     * @param worksFeeTotal 总工费，该工费暂时用到的地方为兑换业务处
     */
    public void setWorksFeeTotal(Double worksFeeTotal) {
        this.worksFeeTotal = worksFeeTotal;
    }

    /**
     * 证书费
     * @return certificateFee 证书费
     */
    public Double getCertificateFee() {
        return certificateFee;
    }

    /**
     * 证书费
     * @param certificateFee 证书费
     */
    public void setCertificateFee(Double certificateFee) {
        this.certificateFee = certificateFee;
    }

    /**
     * 配件金额
     * @return fittingsFee 配件金额
     */
    public Double getFittingsFee() {
        return fittingsFee;
    }

    /**
     * 配件金额
     * @param fittingsFee 配件金额
     */
    public void setFittingsFee(Double fittingsFee) {
        this.fittingsFee = fittingsFee;
    }

    /**
     * 喷砂镶石费
     * @return sandBlastFee 喷砂镶石费
     */
    public Double getSandBlastFee() {
        return sandBlastFee;
    }

    /**
     * 喷砂镶石费
     * @param sandBlastFee 喷砂镶石费
     */
    public void setSandBlastFee(Double sandBlastFee) {
        this.sandBlastFee = sandBlastFee;
    }

    /**
     * 其他费用
     * @return otherFee 其他费用
     */
    public Double getOtherFee() {
        return otherFee;
    }

    /**
     * 其他费用
     * @param otherFee 其他费用
     */
    public void setOtherFee(Double otherFee) {
        this.otherFee = otherFee;
    }

    /**
     * 成本单价：素金对应可单价，非素对应件单价
     * @return unitPrice 成本单价：素金对应可单价，非素对应件单价
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * 成本单价：素金对应可单价，非素对应件单价
     * @param unitPrice 成本单价：素金对应可单价，非素对应件单价
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * 金料额：镶嵌类的带损耗的（毛金重*金价）金成本
     * @return goldCostPrice 金料额：镶嵌类的带损耗的（毛金重*金价）金成本
     */
    public Double getGoldCostPrice() {
        return goldCostPrice;
    }

    /**
     * 金料额：镶嵌类的带损耗的（毛金重*金价）金成本
     * @param goldCostPrice 金料额：镶嵌类的带损耗的（毛金重*金价）金成本
     */
    public void setGoldCostPrice(Double goldCostPrice) {
        this.goldCostPrice = goldCostPrice;
    }

    /**
     * 成本金额
     * @return costPrice 成本金额
     */
    public Double getCostPrice() {
        return costPrice;
    }

    /**
     * 成本金额
     * @param costPrice 成本金额
     */
    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * 加价率
     * @return markupRate 加价率
     */
    public Double getMarkupRate() {
        return markupRate;
    }

    /**
     * 加价率
     * @param markupRate 加价率
     */
    public void setMarkupRate(Double markupRate) {
        this.markupRate = markupRate;
    }

    /**
     * 标签价（售价）：成本单价*加价率
     * @return labelPrice 标签价（售价）：成本单价*加价率
     */
    public Double getLabelPrice() {
        return labelPrice;
    }

    /**
     * 标签价（售价）：成本单价*加价率
     * @param labelPrice 标签价（售价）：成本单价*加价率
     */
    public void setLabelPrice(Double labelPrice) {
        this.labelPrice = labelPrice;
    }

    /**
     * 售价金额：售价*数量
     * @return salePriceAmount 售价金额：售价*数量
     */
    public Double getSalePriceAmount() {
        return salePriceAmount;
    }

    /**
     * 售价金额：售价*数量
     * @param salePriceAmount 售价金额：售价*数量
     */
    public void setSalePriceAmount(Double salePriceAmount) {
        this.salePriceAmount = salePriceAmount;
    }

    /**
     * 标签工费
     * @return labelWorkFee 标签工费
     */
    public Double getLabelWorkFee() {
        return labelWorkFee;
    }

    /**
     * 标签工费
     * @param labelWorkFee 标签工费
     */
    public void setLabelWorkFee(Double labelWorkFee) {
        this.labelWorkFee = labelWorkFee;
    }

    /**
     * 标签克工费
     * @return labelWorkFee4Ke 标签克工费
     */
    public Double getLabelWorkFee4Ke() {
        return labelWorkFee4Ke;
    }

    /**
     * 标签克工费
     * @param labelWorkFee4Ke 标签克工费
     */
    public void setLabelWorkFee4Ke(Double labelWorkFee4Ke) {
        this.labelWorkFee4Ke = labelWorkFee4Ke;
    }

    /**
     * 标签件工费
     * @return labelWorkFee4Jian 标签件工费
     */
    public Double getLabelWorkFee4Jian() {
        return labelWorkFee4Jian;
    }

    /**
     * 标签件工费
     * @param labelWorkFee4Jian 标签件工费
     */
    public void setLabelWorkFee4Jian(Double labelWorkFee4Jian) {
        this.labelWorkFee4Jian = labelWorkFee4Jian;
    }

    /**
     * 标签备注
     * @return labelRemarks 标签备注
     */
    public String getLabelRemarks() {
        return labelRemarks;
    }

    /**
     * 标签备注
     * @param labelRemarks 标签备注
     */
    public void setLabelRemarks(String labelRemarks) {
        this.labelRemarks = labelRemarks == null ? null : labelRemarks.trim();
    }

    /**
     * 对应商品档案ID
     * @return archivesId 对应商品档案ID
     */
    public Integer getArchivesId() {
        return archivesId;
    }

    /**
     * 对应商品档案ID
     * @param archivesId 对应商品档案ID
     */
    public void setArchivesId(Integer archivesId) {
        this.archivesId = archivesId;
    }

    /**
     * 商品编码：商品档案中编码
     * @return archivesNo 商品编码：商品档案中编码
     */
    public String getArchivesNo() {
        return archivesNo;
    }

    /**
     * 商品编码：商品档案中编码
     * @param archivesNo 商品编码：商品档案中编码
     */
    public void setArchivesNo(String archivesNo) {
        this.archivesNo = archivesNo == null ? null : archivesNo.trim();
    }

    /**
     * 商品名称：商品档案中的名称
     * @return goodsName 商品名称：商品档案中的名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 商品名称：商品档案中的名称
     * @param goodsName 商品名称：商品档案中的名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * 
     * @return goodsNameEn 
     */
    public String getGoodsNameEn() {
        return goodsNameEn;
    }

    /**
     * 
     * @param goodsNameEn 
     */
    public void setGoodsNameEn(String goodsNameEn) {
        this.goodsNameEn = goodsNameEn == null ? null : goodsNameEn.trim();
    }

    /**
     * 成色：商品档案中的成色
     * @return archivesFineness 成色：商品档案中的成色
     */
    public String getArchivesFineness() {
        return archivesFineness;
    }

    /**
     * 成色：商品档案中的成色
     * @param archivesFineness 成色：商品档案中的成色
     */
    public void setArchivesFineness(String archivesFineness) {
        this.archivesFineness = archivesFineness == null ? null : archivesFineness.trim();
    }

    /**
     * 石头：商品档案中的石头
     * @return archivesStone 石头：商品档案中的石头
     */
    public String getArchivesStone() {
        return archivesStone;
    }

    /**
     * 石头：商品档案中的石头
     * @param archivesStone 石头：商品档案中的石头
     */
    public void setArchivesStone(String archivesStone) {
        this.archivesStone = archivesStone == null ? null : archivesStone.trim();
    }

    /**
     * 
     * @return archivesCategory 
     */
    public String getArchivesCategory() {
        return archivesCategory;
    }

    /**
     * 
     * @param archivesCategory 
     */
    public void setArchivesCategory(String archivesCategory) {
        this.archivesCategory = archivesCategory == null ? null : archivesCategory.trim();
    }

    /**
     * 核算模式：商品档案中的核算分类
     * @return mainType 核算模式：商品档案中的核算分类
     */
    public String getMainType() {
        return mainType;
    }

    /**
     * 核算模式：商品档案中的核算分类
     * @param mainType 核算模式：商品档案中的核算分类
     */
    public void setMainType(String mainType) {
        this.mainType = mainType == null ? null : mainType.trim();
    }

    /**
     * 商品所属大类的英文
     * @return mainTypePrefix 商品所属大类的英文
     */
    public String getMainTypePrefix() {
        return mainTypePrefix;
    }

    /**
     * 商品所属大类的英文
     * @param mainTypePrefix 商品所属大类的英文
     */
    public void setMainTypePrefix(String mainTypePrefix) {
        this.mainTypePrefix = mainTypePrefix == null ? null : mainTypePrefix.trim();
    }

    /**
     * 实际分类：对应商品档案中的实际分类
     * @return goodsClassify 实际分类：对应商品档案中的实际分类
     */
    public String getGoodsClassify() {
        return goodsClassify;
    }

    /**
     * 实际分类：对应商品档案中的实际分类
     * @param goodsClassify 实际分类：对应商品档案中的实际分类
     */
    public void setGoodsClassify(String goodsClassify) {
        this.goodsClassify = goodsClassify == null ? null : goodsClassify.trim();
    }

    /**
     * 成本分类
     * @return costClassify 成本分类
     */
    public String getCostClassify() {
        return costClassify;
    }

    /**
     * 成本分类
     * @param costClassify 成本分类
     */
    public void setCostClassify(String costClassify) {
        this.costClassify = costClassify == null ? null : costClassify.trim();
    }

    /**
     * 统计分类
     * @return statsClassify 统计分类
     */
    public String getStatsClassify() {
        return statsClassify;
    }

    /**
     * 统计分类
     * @param statsClassify 统计分类
     */
    public void setStatsClassify(String statsClassify) {
        this.statsClassify = statsClassify == null ? null : statsClassify.trim();
    }

    /**
     * 切工
     * @return mainStoneCut 切工
     */
    public String getMainStoneCut() {
        return mainStoneCut;
    }

    /**
     * 切工
     * @param mainStoneCut 切工
     */
    public void setMainStoneCut(String mainStoneCut) {
        this.mainStoneCut = mainStoneCut == null ? null : mainStoneCut.trim();
    }

    /**
     * 颜色
     * @return mainStoneColor 颜色
     */
    public String getMainStoneColor() {
        return mainStoneColor;
    }

    /**
     * 颜色
     * @param mainStoneColor 颜色
     */
    public void setMainStoneColor(String mainStoneColor) {
        this.mainStoneColor = mainStoneColor == null ? null : mainStoneColor.trim();
    }

    /**
     * 净度
     * @return mainStoneClarity 净度
     */
    public String getMainStoneClarity() {
        return mainStoneClarity;
    }

    /**
     * 净度
     * @param mainStoneClarity 净度
     */
    public void setMainStoneClarity(String mainStoneClarity) {
        this.mainStoneClarity = mainStoneClarity == null ? null : mainStoneClarity.trim();
    }

    /**
     * 荧光
     * @return mainStoneFluorescent 荧光
     */
    public String getMainStoneFluorescent() {
        return mainStoneFluorescent;
    }

    /**
     * 荧光
     * @param mainStoneFluorescent 荧光
     */
    public void setMainStoneFluorescent(String mainStoneFluorescent) {
        this.mainStoneFluorescent = mainStoneFluorescent == null ? null : mainStoneFluorescent.trim();
    }

    /**
     * 抛光度
     * @return mainStoneBurnished 抛光度
     */
    public String getMainStoneBurnished() {
        return mainStoneBurnished;
    }

    /**
     * 抛光度
     * @param mainStoneBurnished 抛光度
     */
    public void setMainStoneBurnished(String mainStoneBurnished) {
        this.mainStoneBurnished = mainStoneBurnished == null ? null : mainStoneBurnished.trim();
    }

    /**
     * 对称性
     * @return mainStoneSymmetry 对称性
     */
    public String getMainStoneSymmetry() {
        return mainStoneSymmetry;
    }

    /**
     * 对称性
     * @param mainStoneSymmetry 对称性
     */
    public void setMainStoneSymmetry(String mainStoneSymmetry) {
        this.mainStoneSymmetry = mainStoneSymmetry == null ? null : mainStoneSymmetry.trim();
    }

    /**
     * 主石名
     * @return mainStoneName 主石名
     */
    public String getMainStoneName() {
        return mainStoneName;
    }

    /**
     * 主石名
     * @param mainStoneName 主石名
     */
    public void setMainStoneName(String mainStoneName) {
        this.mainStoneName = mainStoneName == null ? null : mainStoneName.trim();
    }

    /**
     * 主石石号
     * @return mainStoneNo 主石石号
     */
    public String getMainStoneNo() {
        return mainStoneNo;
    }

    /**
     * 主石石号
     * @param mainStoneNo 主石石号
     */
    public void setMainStoneNo(String mainStoneNo) {
        this.mainStoneNo = mainStoneNo == null ? null : mainStoneNo.trim();
    }

    /**
     * 主石规格
     * @return mainStoneSpecifi 主石规格
     */
    public String getMainStoneSpecifi() {
        return mainStoneSpecifi;
    }

    /**
     * 主石规格
     * @param mainStoneSpecifi 主石规格
     */
    public void setMainStoneSpecifi(String mainStoneSpecifi) {
        this.mainStoneSpecifi = mainStoneSpecifi == null ? null : mainStoneSpecifi.trim();
    }

    /**
     * 主石数
     * @return mainStoneNum 主石数
     */
    public Integer getMainStoneNum() {
        return mainStoneNum;
    }

    /**
     * 主石数
     * @param mainStoneNum 主石数
     */
    public void setMainStoneNum(Integer mainStoneNum) {
        this.mainStoneNum = mainStoneNum;
    }

    /**
     * 主石重
     * @return mainStoneWeight 主石重
     */
    public Double getMainStoneWeight() {
        return mainStoneWeight;
    }

    /**
     * 主石重
     * @param mainStoneWeight 主石重
     */
    public void setMainStoneWeight(Double mainStoneWeight) {
        this.mainStoneWeight = mainStoneWeight;
    }

    /**
     * 主石价
     * @return mainStonePrice 主石价
     */
    public Double getMainStonePrice() {
        return mainStonePrice;
    }

    /**
     * 主石价
     * @param mainStonePrice 主石价
     */
    public void setMainStonePrice(Double mainStonePrice) {
        this.mainStonePrice = mainStonePrice;
    }

    /**
     * 主石额
     * @return mainStoneMoney 主石额
     */
    public Double getMainStoneMoney() {
        return mainStoneMoney;
    }

    /**
     * 主石额
     * @param mainStoneMoney 主石额
     */
    public void setMainStoneMoney(Double mainStoneMoney) {
        this.mainStoneMoney = mainStoneMoney;
    }

    /**
     * 副石1名
     * @return subStone1Name 副石1名
     */
    public String getSubStone1Name() {
        return subStone1Name;
    }

    /**
     * 副石1名
     * @param subStone1Name 副石1名
     */
    public void setSubStone1Name(String subStone1Name) {
        this.subStone1Name = subStone1Name == null ? null : subStone1Name.trim();
    }

    /**
     * 副石1石号
     * @return subStone1No 副石1石号
     */
    public String getSubStone1No() {
        return subStone1No;
    }

    /**
     * 副石1石号
     * @param subStone1No 副石1石号
     */
    public void setSubStone1No(String subStone1No) {
        this.subStone1No = subStone1No == null ? null : subStone1No.trim();
    }

    /**
     * 副石1规格
     * @return subStone1Specifi 副石1规格
     */
    public String getSubStone1Specifi() {
        return subStone1Specifi;
    }

    /**
     * 副石1规格
     * @param subStone1Specifi 副石1规格
     */
    public void setSubStone1Specifi(String subStone1Specifi) {
        this.subStone1Specifi = subStone1Specifi == null ? null : subStone1Specifi.trim();
    }

    /**
     * 副石1数
     * @return subStone1Num 副石1数
     */
    public Integer getSubStone1Num() {
        return subStone1Num;
    }

    /**
     * 副石1数
     * @param subStone1Num 副石1数
     */
    public void setSubStone1Num(Integer subStone1Num) {
        this.subStone1Num = subStone1Num;
    }

    /**
     * 副石1重
     * @return subStone1Weight 副石1重
     */
    public Double getSubStone1Weight() {
        return subStone1Weight;
    }

    /**
     * 副石1重
     * @param subStone1Weight 副石1重
     */
    public void setSubStone1Weight(Double subStone1Weight) {
        this.subStone1Weight = subStone1Weight;
    }

    /**
     * 副石1价
     * @return subStone1Price 副石1价
     */
    public Double getSubStone1Price() {
        return subStone1Price;
    }

    /**
     * 副石1价
     * @param subStone1Price 副石1价
     */
    public void setSubStone1Price(Double subStone1Price) {
        this.subStone1Price = subStone1Price;
    }

    /**
     * 副石1额
     * @return subStone1Money 副石1额
     */
    public Double getSubStone1Money() {
        return subStone1Money;
    }

    /**
     * 副石1额
     * @param subStone1Money 副石1额
     */
    public void setSubStone1Money(Double subStone1Money) {
        this.subStone1Money = subStone1Money;
    }

    /**
     * 副石2名
     * @return subStone2Name 副石2名
     */
    public String getSubStone2Name() {
        return subStone2Name;
    }

    /**
     * 副石2名
     * @param subStone2Name 副石2名
     */
    public void setSubStone2Name(String subStone2Name) {
        this.subStone2Name = subStone2Name == null ? null : subStone2Name.trim();
    }

    /**
     * 副石2石号
     * @return subStone2No 副石2石号
     */
    public String getSubStone2No() {
        return subStone2No;
    }

    /**
     * 副石2石号
     * @param subStone2No 副石2石号
     */
    public void setSubStone2No(String subStone2No) {
        this.subStone2No = subStone2No == null ? null : subStone2No.trim();
    }

    /**
     * 副石2规格
     * @return subStone2Specifi 副石2规格
     */
    public String getSubStone2Specifi() {
        return subStone2Specifi;
    }

    /**
     * 副石2规格
     * @param subStone2Specifi 副石2规格
     */
    public void setSubStone2Specifi(String subStone2Specifi) {
        this.subStone2Specifi = subStone2Specifi == null ? null : subStone2Specifi.trim();
    }

    /**
     * 副石2数
     * @return subStone2Num 副石2数
     */
    public Integer getSubStone2Num() {
        return subStone2Num;
    }

    /**
     * 副石2数
     * @param subStone2Num 副石2数
     */
    public void setSubStone2Num(Integer subStone2Num) {
        this.subStone2Num = subStone2Num;
    }

    /**
     * 副石2重
     * @return subStone2Weight 副石2重
     */
    public Double getSubStone2Weight() {
        return subStone2Weight;
    }

    /**
     * 副石2重
     * @param subStone2Weight 副石2重
     */
    public void setSubStone2Weight(Double subStone2Weight) {
        this.subStone2Weight = subStone2Weight;
    }

    /**
     * 副石2价
     * @return subStone2Price 副石2价
     */
    public Double getSubStone2Price() {
        return subStone2Price;
    }

    /**
     * 副石2价
     * @param subStone2Price 副石2价
     */
    public void setSubStone2Price(Double subStone2Price) {
        this.subStone2Price = subStone2Price;
    }

    /**
     * 副石2额
     * @return subStone2Money 副石2额
     */
    public Double getSubStone2Money() {
        return subStone2Money;
    }

    /**
     * 副石2额
     * @param subStone2Money 副石2额
     */
    public void setSubStone2Money(Double subStone2Money) {
        this.subStone2Money = subStone2Money;
    }

    /**
     * 副石3名
     * @return subStone3Name 副石3名
     */
    public String getSubStone3Name() {
        return subStone3Name;
    }

    /**
     * 副石3名
     * @param subStone3Name 副石3名
     */
    public void setSubStone3Name(String subStone3Name) {
        this.subStone3Name = subStone3Name == null ? null : subStone3Name.trim();
    }

    /**
     * 副石3石号
     * @return subStone3No 副石3石号
     */
    public String getSubStone3No() {
        return subStone3No;
    }

    /**
     * 副石3石号
     * @param subStone3No 副石3石号
     */
    public void setSubStone3No(String subStone3No) {
        this.subStone3No = subStone3No == null ? null : subStone3No.trim();
    }

    /**
     * 副石3规格
     * @return subStone3Specifi 副石3规格
     */
    public String getSubStone3Specifi() {
        return subStone3Specifi;
    }

    /**
     * 副石3规格
     * @param subStone3Specifi 副石3规格
     */
    public void setSubStone3Specifi(String subStone3Specifi) {
        this.subStone3Specifi = subStone3Specifi == null ? null : subStone3Specifi.trim();
    }

    /**
     * 副石3数
     * @return subStone3Num 副石3数
     */
    public Integer getSubStone3Num() {
        return subStone3Num;
    }

    /**
     * 副石3数
     * @param subStone3Num 副石3数
     */
    public void setSubStone3Num(Integer subStone3Num) {
        this.subStone3Num = subStone3Num;
    }

    /**
     * 副石3重
     * @return subStone3Weight 副石3重
     */
    public Double getSubStone3Weight() {
        return subStone3Weight;
    }

    /**
     * 副石3重
     * @param subStone3Weight 副石3重
     */
    public void setSubStone3Weight(Double subStone3Weight) {
        this.subStone3Weight = subStone3Weight;
    }

    /**
     * 副石3价
     * @return subStone3Price 副石3价
     */
    public Double getSubStone3Price() {
        return subStone3Price;
    }

    /**
     * 副石3价
     * @param subStone3Price 副石3价
     */
    public void setSubStone3Price(Double subStone3Price) {
        this.subStone3Price = subStone3Price;
    }

    /**
     * 副石3额
     * @return subStone3Money 副石3额
     */
    public Double getSubStone3Money() {
        return subStone3Money;
    }

    /**
     * 副石3额
     * @param subStone3Money 副石3额
     */
    public void setSubStone3Money(Double subStone3Money) {
        this.subStone3Money = subStone3Money;
    }

    /**
     * 副石4名
     * @return subStone4Name 副石4名
     */
    public String getSubStone4Name() {
        return subStone4Name;
    }

    /**
     * 副石4名
     * @param subStone4Name 副石4名
     */
    public void setSubStone4Name(String subStone4Name) {
        this.subStone4Name = subStone4Name == null ? null : subStone4Name.trim();
    }

    /**
     * 副石4石号
     * @return subStone4No 副石4石号
     */
    public String getSubStone4No() {
        return subStone4No;
    }

    /**
     * 副石4石号
     * @param subStone4No 副石4石号
     */
    public void setSubStone4No(String subStone4No) {
        this.subStone4No = subStone4No == null ? null : subStone4No.trim();
    }

    /**
     * 副石4规格
     * @return subStone4Specifi 副石4规格
     */
    public String getSubStone4Specifi() {
        return subStone4Specifi;
    }

    /**
     * 副石4规格
     * @param subStone4Specifi 副石4规格
     */
    public void setSubStone4Specifi(String subStone4Specifi) {
        this.subStone4Specifi = subStone4Specifi == null ? null : subStone4Specifi.trim();
    }

    /**
     * 副石4数
     * @return subStone4Num 副石4数
     */
    public Integer getSubStone4Num() {
        return subStone4Num;
    }

    /**
     * 副石4数
     * @param subStone4Num 副石4数
     */
    public void setSubStone4Num(Integer subStone4Num) {
        this.subStone4Num = subStone4Num;
    }

    /**
     * 副石4重
     * @return subStone4Weight 副石4重
     */
    public Double getSubStone4Weight() {
        return subStone4Weight;
    }

    /**
     * 副石4重
     * @param subStone4Weight 副石4重
     */
    public void setSubStone4Weight(Double subStone4Weight) {
        this.subStone4Weight = subStone4Weight;
    }

    /**
     * 副石4价
     * @return subStone4Price 副石4价
     */
    public Double getSubStone4Price() {
        return subStone4Price;
    }

    /**
     * 副石4价
     * @param subStone4Price 副石4价
     */
    public void setSubStone4Price(Double subStone4Price) {
        this.subStone4Price = subStone4Price;
    }

    /**
     * 副石4额
     * @return subStone4Money 副石4额
     */
    public Double getSubStone4Money() {
        return subStone4Money;
    }

    /**
     * 副石4额
     * @param subStone4Money 副石4额
     */
    public void setSubStone4Money(Double subStone4Money) {
        this.subStone4Money = subStone4Money;
    }

    /**
     * 副石5名
     * @return subStone5Name 副石5名
     */
    public String getSubStone5Name() {
        return subStone5Name;
    }

    /**
     * 副石5名
     * @param subStone5Name 副石5名
     */
    public void setSubStone5Name(String subStone5Name) {
        this.subStone5Name = subStone5Name == null ? null : subStone5Name.trim();
    }

    /**
     * 副石5石号
     * @return subStone5No 副石5石号
     */
    public String getSubStone5No() {
        return subStone5No;
    }

    /**
     * 副石5石号
     * @param subStone5No 副石5石号
     */
    public void setSubStone5No(String subStone5No) {
        this.subStone5No = subStone5No == null ? null : subStone5No.trim();
    }

    /**
     * 副石5规格
     * @return subStone5Specifi 副石5规格
     */
    public String getSubStone5Specifi() {
        return subStone5Specifi;
    }

    /**
     * 副石5规格
     * @param subStone5Specifi 副石5规格
     */
    public void setSubStone5Specifi(String subStone5Specifi) {
        this.subStone5Specifi = subStone5Specifi == null ? null : subStone5Specifi.trim();
    }

    /**
     * 副石5数
     * @return subStone5Num 副石5数
     */
    public Integer getSubStone5Num() {
        return subStone5Num;
    }

    /**
     * 副石5数
     * @param subStone5Num 副石5数
     */
    public void setSubStone5Num(Integer subStone5Num) {
        this.subStone5Num = subStone5Num;
    }

    /**
     * 副石5重
     * @return subStone5Weight 副石5重
     */
    public Double getSubStone5Weight() {
        return subStone5Weight;
    }

    /**
     * 副石5重
     * @param subStone5Weight 副石5重
     */
    public void setSubStone5Weight(Double subStone5Weight) {
        this.subStone5Weight = subStone5Weight;
    }

    /**
     * 副石5价
     * @return subStone5Price 副石5价
     */
    public Double getSubStone5Price() {
        return subStone5Price;
    }

    /**
     * 副石5价
     * @param subStone5Price 副石5价
     */
    public void setSubStone5Price(Double subStone5Price) {
        this.subStone5Price = subStone5Price;
    }

    /**
     * 副石5额
     * @return subStone5Money 副石5额
     */
    public Double getSubStone5Money() {
        return subStone5Money;
    }

    /**
     * 副石5额
     * @param subStone5Money 副石5额
     */
    public void setSubStone5Money(Double subStone5Money) {
        this.subStone5Money = subStone5Money;
    }

    /**
     * 副石6名
     * @return subStone6Name 副石6名
     */
    public String getSubStone6Name() {
        return subStone6Name;
    }

    /**
     * 副石6名
     * @param subStone6Name 副石6名
     */
    public void setSubStone6Name(String subStone6Name) {
        this.subStone6Name = subStone6Name == null ? null : subStone6Name.trim();
    }

    /**
     * 副石6石号
     * @return subStone6No 副石6石号
     */
    public String getSubStone6No() {
        return subStone6No;
    }

    /**
     * 副石6石号
     * @param subStone6No 副石6石号
     */
    public void setSubStone6No(String subStone6No) {
        this.subStone6No = subStone6No == null ? null : subStone6No.trim();
    }

    /**
     * 副石6规格
     * @return subStone6Specifi 副石6规格
     */
    public String getSubStone6Specifi() {
        return subStone6Specifi;
    }

    /**
     * 副石6规格
     * @param subStone6Specifi 副石6规格
     */
    public void setSubStone6Specifi(String subStone6Specifi) {
        this.subStone6Specifi = subStone6Specifi == null ? null : subStone6Specifi.trim();
    }

    /**
     * 副石6数
     * @return subStone6Num 副石6数
     */
    public Integer getSubStone6Num() {
        return subStone6Num;
    }

    /**
     * 副石6数
     * @param subStone6Num 副石6数
     */
    public void setSubStone6Num(Integer subStone6Num) {
        this.subStone6Num = subStone6Num;
    }

    /**
     * 副石6重
     * @return subStone6Weight 副石6重
     */
    public Double getSubStone6Weight() {
        return subStone6Weight;
    }

    /**
     * 副石6重
     * @param subStone6Weight 副石6重
     */
    public void setSubStone6Weight(Double subStone6Weight) {
        this.subStone6Weight = subStone6Weight;
    }

    /**
     * 副石6价
     * @return subStone6Price 副石6价
     */
    public Double getSubStone6Price() {
        return subStone6Price;
    }

    /**
     * 副石6价
     * @param subStone6Price 副石6价
     */
    public void setSubStone6Price(Double subStone6Price) {
        this.subStone6Price = subStone6Price;
    }

    /**
     * 副石6额
     * @return subStone6Money 副石6额
     */
    public Double getSubStone6Money() {
        return subStone6Money;
    }

    /**
     * 副石6额
     * @param subStone6Money 副石6额
     */
    public void setSubStone6Money(Double subStone6Money) {
        this.subStone6Money = subStone6Money;
    }

    /**
     * 配石成本：金镶玉
     * @return peiShiCostPrice 配石成本：金镶玉
     */
    public Double getPeiShiCostPrice() {
        return peiShiCostPrice;
    }

    /**
     * 配石成本：金镶玉
     * @param peiShiCostPrice 配石成本：金镶玉
     */
    public void setPeiShiCostPrice(Double peiShiCostPrice) {
        this.peiShiCostPrice = peiShiCostPrice;
    }

    /**
     * 配石倍率：金镶玉
     * @return peiShiRate 配石倍率：金镶玉
     */
    public Double getPeiShiRate() {
        return peiShiRate;
    }

    /**
     * 配石倍率：金镶玉
     * @param peiShiRate 配石倍率：金镶玉
     */
    public void setPeiShiRate(Double peiShiRate) {
        this.peiShiRate = peiShiRate;
    }

    /**
     * 配石标价：金镶玉
     * @return peiShiLabelPrice 配石标价：金镶玉
     */
    public Double getPeiShiLabelPrice() {
        return peiShiLabelPrice;
    }

    /**
     * 配石标价：金镶玉
     * @param peiShiLabelPrice 配石标价：金镶玉
     */
    public void setPeiShiLabelPrice(Double peiShiLabelPrice) {
        this.peiShiLabelPrice = peiShiLabelPrice;
    }

    /**
     * 净金重：旧料
     * @return netGoldWeight 净金重：旧料
     */
    public Double getNetGoldWeight() {
        return netGoldWeight;
    }

    /**
     * 净金重：旧料
     * @param netGoldWeight 净金重：旧料
     */
    public void setNetGoldWeight(Double netGoldWeight) {
        this.netGoldWeight = netGoldWeight;
    }

    /**
     * 成色：旧料
     * @return oldMaterialQuality 成色：旧料
     */
    public Double getOldMaterialQuality() {
        return oldMaterialQuality;
    }

    /**
     * 成色：旧料
     * @param oldMaterialQuality 成色：旧料
     */
    public void setOldMaterialQuality(Double oldMaterialQuality) {
        this.oldMaterialQuality = oldMaterialQuality;
    }

    /**
     * 加工损耗：旧料
     * @return oldMaterialLoss 加工损耗：旧料
     */
    public Double getOldMaterialLoss() {
        return oldMaterialLoss;
    }

    /**
     * 加工损耗：旧料
     * @param oldMaterialLoss 加工损耗：旧料
     */
    public void setOldMaterialLoss(Double oldMaterialLoss) {
        this.oldMaterialLoss = oldMaterialLoss;
    }

    /**
     * 来源：本店or外店
     * @return origin 来源：本店or外店
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * 来源：本店or外店
     * @param origin 来源：本店or外店
     */
    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    /**
     * 回收标记：0：不是；1：是
     * @return recFlag 回收标记：0：不是；1：是
     */
    public Boolean getRecFlag() {
        return recFlag;
    }

    /**
     * 回收标记：0：不是；1：是
     * @param recFlag 回收标记：0：不是；1：是
     */
    public void setRecFlag(Boolean recFlag) {
        this.recFlag = recFlag;
    }

    /**
     * 业务员ID
     * @return saleManId 业务员ID
     */
    public Integer getSaleManId() {
        return saleManId;
    }

    /**
     * 业务员ID
     * @param saleManId 业务员ID
     */
    public void setSaleManId(Integer saleManId) {
        this.saleManId = saleManId;
    }

    /**
     * 业务员名
     * @return salesmanName 业务员名
     */
    public String getSalesmanName() {
        return salesmanName;
    }

    /**
     * 业务员名
     * @param salesmanName 业务员名
     */
    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName == null ? null : salesmanName.trim();
    }

    /**
     * 是否已经退货了，回收业务退回时使用
     * @return hasReturn 是否已经退货了，回收业务退回时使用
     */
    public Boolean getHasReturn() {
        return hasReturn;
    }

    /**
     * 是否已经退货了，回收业务退回时使用
     * @param hasReturn 是否已经退货了，回收业务退回时使用
     */
    public void setHasReturn(Boolean hasReturn) {
        this.hasReturn = hasReturn;
    }

    /**
     * 退回时记录对应的回收itemId
     * @return orgItemId 退回时记录对应的回收itemId
     */
    public Integer getOrgItemId() {
        return orgItemId;
    }

    /**
     * 退回时记录对应的回收itemId
     * @param orgItemId 退回时记录对应的回收itemId
     */
    public void setOrgItemId(Integer orgItemId) {
        this.orgItemId = orgItemId;
    }

    /**
     * 旧饰相关:原标价
     * @return orgLabelPrice 旧饰相关:原标价
     */
    public Double getOrgLabelPrice() {
        return orgLabelPrice;
    }

    /**
     * 旧饰相关:原标价
     * @param orgLabelPrice 旧饰相关:原标价
     */
    public void setOrgLabelPrice(Double orgLabelPrice) {
        this.orgLabelPrice = orgLabelPrice;
    }

    /**
     * 旧饰相关:原结算价
     * @return orgSettlementPrice 旧饰相关:原结算价
     */
    public Double getOrgSettlementPrice() {
        return orgSettlementPrice;
    }

    /**
     * 旧饰相关:原结算价
     * @param orgSettlementPrice 旧饰相关:原结算价
     */
    public void setOrgSettlementPrice(Double orgSettlementPrice) {
        this.orgSettlementPrice = orgSettlementPrice;
    }

    /**
     * 旧饰相关:增值金额
     * @return incrementMoney 旧饰相关:增值金额
     */
    public Double getIncrementMoney() {
        return incrementMoney;
    }

    /**
     * 旧饰相关:增值金额
     * @param incrementMoney 旧饰相关:增值金额
     */
    public void setIncrementMoney(Double incrementMoney) {
        this.incrementMoney = incrementMoney;
    }

    /**
     * 旧饰相关:收购金额
     * @return purchaseAmount 旧饰相关:收购金额
     */
    public Double getPurchaseAmount() {
        return purchaseAmount;
    }

    /**
     * 旧饰相关:收购金额
     * @param purchaseAmount 旧饰相关:收购金额
     */
    public void setPurchaseAmount(Double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    /**
     * 标签文件
     * @return grfName 标签文件
     */
    public String getGrfName() {
        return grfName;
    }

    /**
     * 标签文件
     * @param grfName 标签文件
     */
    public void setGrfName(String grfName) {
        this.grfName = grfName == null ? null : grfName.trim();
    }

    /**
     * 提纯费/克
     * @return refineFee 提纯费/克
     */
    public Double getRefineFee() {
        return refineFee;
    }

    /**
     * 提纯费/克
     * @param refineFee 提纯费/克
     */
    public void setRefineFee(Double refineFee) {
        this.refineFee = refineFee;
    }

    /**
     * 总提纯费
     * @return refineFeeTotal 总提纯费
     */
    public Double getRefineFeeTotal() {
        return refineFeeTotal;
    }

    /**
     * 总提纯费
     * @param refineFeeTotal 总提纯费
     */
    public void setRefineFeeTotal(Double refineFeeTotal) {
        this.refineFeeTotal = refineFeeTotal;
    }

    /**
     * 单据的子类型 如果sheetType为兑换单 则 3：旧料兑换 4：为旧料回收  ，5：为回收旧饰。如果sheetType为销售单 则 11：表示截料,其他单据与sheetType保持一致 
     * @return subType 单据的子类型 如果sheetType为兑换单 则 3：旧料兑换 4：为旧料回收  ，5：为回收旧饰。如果sheetType为销售单 则 11：表示截料,其他单据与sheetType保持一致 
     */
    public Integer getSubType() {
        return subType;
    }

    /**
     * 单据的子类型 如果sheetType为兑换单 则 3：旧料兑换 4：为旧料回收  ，5：为回收旧饰。如果sheetType为销售单 则 11：表示截料,其他单据与sheetType保持一致 
     * @param subType 单据的子类型 如果sheetType为兑换单 则 3：旧料兑换 4：为旧料回收  ，5：为回收旧饰。如果sheetType为销售单 则 11：表示截料,其他单据与sheetType保持一致 
     */
    public void setSubType(Integer subType) {
        this.subType = subType;
    }

    /**
     * 兑换旧料的结算价
     * @return settleUnitPrice 兑换旧料的结算价
     */
    public Double getSettleUnitPrice() {
        return settleUnitPrice;
    }

    /**
     * 兑换旧料的结算价
     * @param settleUnitPrice 兑换旧料的结算价
     */
    public void setSettleUnitPrice(Double settleUnitPrice) {
        this.settleUnitPrice = settleUnitPrice;
    }

    /**
     * 兑换旧料的总结算金额
     * @return settleTotalMoney 兑换旧料的总结算金额
     */
    public Double getSettleTotalMoney() {
        return settleTotalMoney;
    }

    /**
     * 兑换旧料的总结算金额
     * @param settleTotalMoney 兑换旧料的总结算金额
     */
    public void setSettleTotalMoney(Double settleTotalMoney) {
        this.settleTotalMoney = settleTotalMoney;
    }

    /**
     * 成色是否参与运算 0：参与，1不参与
     * @return joinCalculate 成色是否参与运算 0：参与，1不参与
     */
    public Integer getJoinCalculate() {
        return joinCalculate;
    }

    /**
     * 成色是否参与运算 0：参与，1不参与
     * @param joinCalculate 成色是否参与运算 0：参与，1不参与
     */
    public void setJoinCalculate(Integer joinCalculate) {
        this.joinCalculate = joinCalculate;
    }

    /**
     * 兑换旧料的积分
     * @return pointItem 兑换旧料的积分
     */
    public Integer getPointItem() {
        return pointItem;
    }

    /**
     * 兑换旧料的积分
     * @param pointItem 兑换旧料的积分
     */
    public void setPointItem(Integer pointItem) {
        this.pointItem = pointItem;
    }

    /**
     * 商品退回时,旧的库存ID
     * @return oldStockId 商品退回时,旧的库存ID
     */
    public Integer getOldStockId() {
        return oldStockId;
    }

    /**
     * 商品退回时,旧的库存ID
     * @param oldStockId 商品退回时,旧的库存ID
     */
    public void setOldStockId(Integer oldStockId) {
        this.oldStockId = oldStockId;
    }

    /**
     * 品牌名称
     * @return brandName 品牌名称
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 品牌名称
     * @param brandName 品牌名称
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    /**
     * 兑换回收旧饰的折扣 
     * @return recyleGoodsAgio 兑换回收旧饰的折扣 
     */
    public Double getRecyleGoodsAgio() {
        return recyleGoodsAgio;
    }

    /**
     * 兑换回收旧饰的折扣 
     * @param recyleGoodsAgio 兑换回收旧饰的折扣 
     */
    public void setRecyleGoodsAgio(Double recyleGoodsAgio) {
        this.recyleGoodsAgio = recyleGoodsAgio;
    }

    /**
     * 兑换新品的仓库id
     * @return exchangeStoreId 兑换新品的仓库id
     */
    public Integer getExchangeStoreId() {
        return exchangeStoreId;
    }

    /**
     * 兑换新品的仓库id
     * @param exchangeStoreId 兑换新品的仓库id
     */
    public void setExchangeStoreId(Integer exchangeStoreId) {
        this.exchangeStoreId = exchangeStoreId;
    }

    /**
     * 兑换新品的仓库名称
     * @return exchangeStoreName 兑换新品的仓库名称
     */
    public String getExchangeStoreName() {
        return exchangeStoreName;
    }

    /**
     * 兑换新品的仓库名称
     * @param exchangeStoreName 兑换新品的仓库名称
     */
    public void setExchangeStoreName(String exchangeStoreName) {
        this.exchangeStoreName = exchangeStoreName == null ? null : exchangeStoreName.trim();
    }

    /**
     * 进货在途状态：0：新建状态；1：在途；2：接收中；3：接收完成；4：整单打回
     * @return sheetStatus 进货在途状态：0：新建状态；1：在途；2：接收中；3：接收完成；4：整单打回
     */
    public Integer getSheetStatus() {
        return sheetStatus;
    }

    /**
     * 进货在途状态：0：新建状态；1：在途；2：接收中；3：接收完成；4：整单打回
     * @param sheetStatus 进货在途状态：0：新建状态；1：在途；2：接收中；3：接收完成；4：整单打回
     */
    public void setSheetStatus(Integer sheetStatus) {
        this.sheetStatus = sheetStatus;
    }

    /**
     * 接收时间：在途的调拨单的接收时间
     * @return receiveTime 接收时间：在途的调拨单的接收时间
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * 接收时间：在途的调拨单的接收时间
     * @param receiveTime 接收时间：在途的调拨单的接收时间
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * 价格区间
     * @return priceRange 价格区间
     */
    public String getPriceRange() {
        return priceRange;
    }

    /**
     * 价格区间
     * @param priceRange 价格区间
     */
    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange == null ? null : priceRange.trim();
    }

    /**
     * 金重区间
     * @return goldRange 金重区间
     */
    public String getGoldRange() {
        return goldRange;
    }

    /**
     * 金重区间
     * @param goldRange 金重区间
     */
    public void setGoldRange(String goldRange) {
        this.goldRange = goldRange == null ? null : goldRange.trim();
    }

    /**
     * 石重区间
     * @return stoneRange 石重区间
     */
    public String getStoneRange() {
        return stoneRange;
    }

    /**
     * 石重区间
     * @param stoneRange 石重区间
     */
    public void setStoneRange(String stoneRange) {
        this.stoneRange = stoneRange == null ? null : stoneRange.trim();
    }

    /**
     * 一码多货的标记：0：非一码多货；1：一码多货
     * @return dhFlag 一码多货的标记：0：非一码多货；1：一码多货
     */
    public Boolean getDhFlag() {
        return dhFlag;
    }

    /**
     * 一码多货的标记：0：非一码多货；1：一码多货
     * @param dhFlag 一码多货的标记：0：非一码多货；1：一码多货
     */
    public void setDhFlag(Boolean dhFlag) {
        this.dhFlag = dhFlag;
    }
}