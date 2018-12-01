package com.jr.erp.bill.stocktake.entity;

import com.jr.erp.base.mybatis.BaseEntity;

public class BillStocktakeStock extends BaseEntity {
    /**
     * 盘点任务ID
     */
    private Integer billId;

    /**
     * 库存记录ID
     */
    private Integer stockId;

    /**
     * 供应商名称
     */
    private String supplier;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 
     */
    private String barcode;

    /**
     * 
     */
    private String oldBarcode;

    /**
     * 商品子名称
     */
    private String subName;

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
     * 公司款号
     */
    private String comStyleNo;

    /**
     * 工厂款号
     */
    private String facStyleNo;

    /**
     * 手寸
     */
    private String handInch;

    /**
     * 工艺
     */
    private String craft;

    /**
     * 图片路径
     */
    private String img;

    /**
     * 商品备注信息
     */
    private String remarks;

    /**
     * 部门地区码
     */
    private String areaCode;

    /**
     * 部门地区名称
     */
    private String areaName;

    /**
     * 柜台地区码
     */
    private String counterAreaCode;

    /**
     * 仓库名称
     */
    private String counterAreaName;

    /**
     * 特价标记
     */
    private String bargainName;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 是否存在可用库存，根据不同类型判断条件不一样 1：有 0：没有
     */
    private Integer hasStock;

    /**
     * 净金重
     */
    private Double netGoldWeight;

    /**
     * 金损
     */
    private Double goldLoss;

    /**
     * 金成色
     */
    private Double goldPurity;

    /**
     * 毛金重：加上损耗的金重；镶嵌类在计算成本时使用到
     */
    private Double goldWeight;

    /**
     * 金价
     */
    private Double goldPrice;

    /**
     * 金料额
     */
    private Double goldMoney;

    /**
     * 商品总重：镶嵌类+金镶玉（金重+石重），一码一货的商品，且有金和石的
     */
    private Double productWeight;

    /**
     * 克工费
     */
    private Double workFeeKe;

    /**
     * 件工费
     */
    private Double workFeeJian;

    /**
     * 总工费，该工费暂时用到的地方为兑换业务处
     */
    private Double workFeeSum;

    /**
     * 证书费
     */
    private Double certificateFee;

    /**
     * 配件名称
     */
    private String fittingName;

    /**
     * 配件数
     */
    private String fittingNum;

    /**
     * 配件金额
     */
    private Double fittingFee;

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
     * 成本金额
     */
    private Double costPrice;

    /**
     * 标签克工费
     */
    private Double labelWorkFeeKe;

    /**
     * 标签件工费
     */
    private Double labelWorkFeeJian;

    /**
     * 标签工费
     */
    private Double labelWorkFeeSum;

    /**
     * 加价率，配石倍率：金镶玉
     */
    private Double labelRate;

    /**
     * 标签价（售价）：成本单价*加价率，配石标价：金镶玉
     */
    private Double labelPrice;

    /**
     * 售价金额：售价*数量
     */
    private Double labelPriceSum;

    /**
     * 标签备注
     */
    private String labelRemarks;

    /**
     * 对应商品档案ID
     */
    private Integer categoryId;

    /**
     * 商品编码：商品档案中编码
     */
    private String sysCode;

    /**
     * 商品名称：商品档案中的名称
     */
    private String productName;

    /**
     * 金料名
     */
    private String goldName;

    /**
     * 石头
     */
    private String jewelName;

    /**
     * 品名
     */
    private String categoryName;

    /**
     * 大类名称
     */
    private String firstType;

    /**
     * 商品所属大类的英文
     */
    private String firstTypeName;

    /**
     * 中类
     */
    private String secondType;

    /**
     * 
     */
    private String secondTypeName;

    /**
     * 实际分类：对应商品档案中的实际分类
     */
    private String productClassify;

    /**
     * 统计分类1
     */
    private String firstClassify;

    /**
     * 统计分类2
     */
    private String secondClassify;

    /**
     * 标签显示名称
     */
    private String labelName;

    /**
     * 模板名称
     */
    private String grfName;

    /**
     * 统计分类3
     */
    private String thirdClassify;

    /**
     * 切工
     */
    private String mJewelCut;

    /**
     * 颜色
     */
    private String mJewelColor;

    /**
     * 净度
     */
    private String mJewelClarity;

    /**
     * 荧光
     */
    private String mJewelFluorescent;

    /**
     * 抛光度
     */
    private String mJewelBurnished;

    /**
     * 形状
     */
    private String mJewelShape;

    /**
     * 主石名
     */
    private String mJewelName;

    /**
     * 主石石号
     */
    private String mJewelNo;

    /**
     * 主石规格
     */
    private String mJewelSpecifi;

    /**
     * 主石数
     */
    private Integer mJewelNum;

    /**
     * 主石重
     */
    private Double mJewelWeight;

    /**
     * 主石价，配石成本：金镶玉
     */
    private Double mJewelPrice;

    /**
     * 主石额
     */
    private Double mJewelFee;

    /**
     * 副石1名
     */
    private String sJewel1Name;

    /**
     * 副石1石号
     */
    private String sJewel1No;

    /**
     * 副石1规格
     */
    private String sJewel1Specifi;

    /**
     * 副石1数
     */
    private Integer sJewel1Num;

    /**
     * 副石1重
     */
    private Double sJewel1Weight;

    /**
     * 副石1价
     */
    private Double sJewel1Price;

    /**
     * 副石1额
     */
    private Double sJewel1Fee;

    /**
     * 入库单号
     */
    private String billNo;

    /**
     * 库存时间:使用的是入库单（或调拨单）的时间
     */
    private String billDate;

    /**
     * 一码多货的标记：0：一码一货；1：一码多货
     */
    private Integer mutilFlag;

    /**
     * 盘点任务ID
     * @return billId 盘点任务ID
     */
    public Integer getBillId() {
        return billId;
    }

    /**
     * 盘点任务ID
     * @param billId 盘点任务ID
     */
    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    /**
     * 库存记录ID
     * @return stockId 库存记录ID
     */
    public Integer getStockId() {
        return stockId;
    }

    /**
     * 库存记录ID
     * @param stockId 库存记录ID
     */
    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    /**
     * 供应商名称
     * @return supplier 供应商名称
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * 供应商名称
     * @param supplier 供应商名称
     */
    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
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
     * 
     * @return barcode 
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * 
     * @param barcode 
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    /**
     * 
     * @return oldBarcode 
     */
    public String getOldBarcode() {
        return oldBarcode;
    }

    /**
     * 
     * @param oldBarcode 
     */
    public void setOldBarcode(String oldBarcode) {
        this.oldBarcode = oldBarcode == null ? null : oldBarcode.trim();
    }

    /**
     * 商品子名称
     * @return subName 商品子名称
     */
    public String getSubName() {
        return subName;
    }

    /**
     * 商品子名称
     * @param subName 商品子名称
     */
    public void setSubName(String subName) {
        this.subName = subName == null ? null : subName.trim();
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
     * 公司款号
     * @return comStyleNo 公司款号
     */
    public String getComStyleNo() {
        return comStyleNo;
    }

    /**
     * 公司款号
     * @param comStyleNo 公司款号
     */
    public void setComStyleNo(String comStyleNo) {
        this.comStyleNo = comStyleNo == null ? null : comStyleNo.trim();
    }

    /**
     * 工厂款号
     * @return facStyleNo 工厂款号
     */
    public String getFacStyleNo() {
        return facStyleNo;
    }

    /**
     * 工厂款号
     * @param facStyleNo 工厂款号
     */
    public void setFacStyleNo(String facStyleNo) {
        this.facStyleNo = facStyleNo == null ? null : facStyleNo.trim();
    }

    /**
     * 手寸
     * @return handInch 手寸
     */
    public String getHandInch() {
        return handInch;
    }

    /**
     * 手寸
     * @param handInch 手寸
     */
    public void setHandInch(String handInch) {
        this.handInch = handInch == null ? null : handInch.trim();
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
     * 部门地区码
     * @return areaCode 部门地区码
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 部门地区码
     * @param areaCode 部门地区码
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * 部门地区名称
     * @return areaName 部门地区名称
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 部门地区名称
     * @param areaName 部门地区名称
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * 柜台地区码
     * @return counterAreaCode 柜台地区码
     */
    public String getCounterAreaCode() {
        return counterAreaCode;
    }

    /**
     * 柜台地区码
     * @param counterAreaCode 柜台地区码
     */
    public void setCounterAreaCode(String counterAreaCode) {
        this.counterAreaCode = counterAreaCode == null ? null : counterAreaCode.trim();
    }

    /**
     * 仓库名称
     * @return counterAreaName 仓库名称
     */
    public String getCounterAreaName() {
        return counterAreaName;
    }

    /**
     * 仓库名称
     * @param counterAreaName 仓库名称
     */
    public void setCounterAreaName(String counterAreaName) {
        this.counterAreaName = counterAreaName == null ? null : counterAreaName.trim();
    }

    /**
     * 特价标记
     * @return bargainName 特价标记
     */
    public String getBargainName() {
        return bargainName;
    }

    /**
     * 特价标记
     * @param bargainName 特价标记
     */
    public void setBargainName(String bargainName) {
        this.bargainName = bargainName == null ? null : bargainName.trim();
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
     * 是否存在可用库存，根据不同类型判断条件不一样 1：有 0：没有
     * @return hasStock 是否存在可用库存，根据不同类型判断条件不一样 1：有 0：没有
     */
    public Integer getHasStock() {
        return hasStock;
    }

    /**
     * 是否存在可用库存，根据不同类型判断条件不一样 1：有 0：没有
     * @param hasStock 是否存在可用库存，根据不同类型判断条件不一样 1：有 0：没有
     */
    public void setHasStock(Integer hasStock) {
        this.hasStock = hasStock;
    }

    /**
     * 净金重
     * @return netGoldWeight 净金重
     */
    public Double getNetGoldWeight() {
        return netGoldWeight;
    }

    /**
     * 净金重
     * @param netGoldWeight 净金重
     */
    public void setNetGoldWeight(Double netGoldWeight) {
        this.netGoldWeight = netGoldWeight;
    }

    /**
     * 金损
     * @return goldLoss 金损
     */
    public Double getGoldLoss() {
        return goldLoss;
    }

    /**
     * 金损
     * @param goldLoss 金损
     */
    public void setGoldLoss(Double goldLoss) {
        this.goldLoss = goldLoss;
    }

    /**
     * 金成色
     * @return goldPurity 金成色
     */
    public Double getGoldPurity() {
        return goldPurity;
    }

    /**
     * 金成色
     * @param goldPurity 金成色
     */
    public void setGoldPurity(Double goldPurity) {
        this.goldPurity = goldPurity;
    }

    /**
     * 毛金重：加上损耗的金重；镶嵌类在计算成本时使用到
     * @return goldWeight 毛金重：加上损耗的金重；镶嵌类在计算成本时使用到
     */
    public Double getGoldWeight() {
        return goldWeight;
    }

    /**
     * 毛金重：加上损耗的金重；镶嵌类在计算成本时使用到
     * @param goldWeight 毛金重：加上损耗的金重；镶嵌类在计算成本时使用到
     */
    public void setGoldWeight(Double goldWeight) {
        this.goldWeight = goldWeight;
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
     * 金料额
     * @return goldMoney 金料额
     */
    public Double getGoldMoney() {
        return goldMoney;
    }

    /**
     * 金料额
     * @param goldMoney 金料额
     */
    public void setGoldMoney(Double goldMoney) {
        this.goldMoney = goldMoney;
    }

    /**
     * 商品总重：镶嵌类+金镶玉（金重+石重），一码一货的商品，且有金和石的
     * @return productWeight 商品总重：镶嵌类+金镶玉（金重+石重），一码一货的商品，且有金和石的
     */
    public Double getProductWeight() {
        return productWeight;
    }

    /**
     * 商品总重：镶嵌类+金镶玉（金重+石重），一码一货的商品，且有金和石的
     * @param productWeight 商品总重：镶嵌类+金镶玉（金重+石重），一码一货的商品，且有金和石的
     */
    public void setProductWeight(Double productWeight) {
        this.productWeight = productWeight;
    }

    /**
     * 克工费
     * @return workFeeKe 克工费
     */
    public Double getWorkFeeKe() {
        return workFeeKe;
    }

    /**
     * 克工费
     * @param workFeeKe 克工费
     */
    public void setWorkFeeKe(Double workFeeKe) {
        this.workFeeKe = workFeeKe;
    }

    /**
     * 件工费
     * @return workFeeJian 件工费
     */
    public Double getWorkFeeJian() {
        return workFeeJian;
    }

    /**
     * 件工费
     * @param workFeeJian 件工费
     */
    public void setWorkFeeJian(Double workFeeJian) {
        this.workFeeJian = workFeeJian;
    }

    /**
     * 总工费，该工费暂时用到的地方为兑换业务处
     * @return workFeeSum 总工费，该工费暂时用到的地方为兑换业务处
     */
    public Double getWorkFeeSum() {
        return workFeeSum;
    }

    /**
     * 总工费，该工费暂时用到的地方为兑换业务处
     * @param workFeeSum 总工费，该工费暂时用到的地方为兑换业务处
     */
    public void setWorkFeeSum(Double workFeeSum) {
        this.workFeeSum = workFeeSum;
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
     * 配件名称
     * @return fittingName 配件名称
     */
    public String getFittingName() {
        return fittingName;
    }

    /**
     * 配件名称
     * @param fittingName 配件名称
     */
    public void setFittingName(String fittingName) {
        this.fittingName = fittingName == null ? null : fittingName.trim();
    }

    /**
     * 配件数
     * @return fittingNum 配件数
     */
    public String getFittingNum() {
        return fittingNum;
    }

    /**
     * 配件数
     * @param fittingNum 配件数
     */
    public void setFittingNum(String fittingNum) {
        this.fittingNum = fittingNum == null ? null : fittingNum.trim();
    }

    /**
     * 配件金额
     * @return fittingFee 配件金额
     */
    public Double getFittingFee() {
        return fittingFee;
    }

    /**
     * 配件金额
     * @param fittingFee 配件金额
     */
    public void setFittingFee(Double fittingFee) {
        this.fittingFee = fittingFee;
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
     * 标签克工费
     * @return labelWorkFeeKe 标签克工费
     */
    public Double getLabelWorkFeeKe() {
        return labelWorkFeeKe;
    }

    /**
     * 标签克工费
     * @param labelWorkFeeKe 标签克工费
     */
    public void setLabelWorkFeeKe(Double labelWorkFeeKe) {
        this.labelWorkFeeKe = labelWorkFeeKe;
    }

    /**
     * 标签件工费
     * @return labelWorkFeeJian 标签件工费
     */
    public Double getLabelWorkFeeJian() {
        return labelWorkFeeJian;
    }

    /**
     * 标签件工费
     * @param labelWorkFeeJian 标签件工费
     */
    public void setLabelWorkFeeJian(Double labelWorkFeeJian) {
        this.labelWorkFeeJian = labelWorkFeeJian;
    }

    /**
     * 标签工费
     * @return labelWorkFeeSum 标签工费
     */
    public Double getLabelWorkFeeSum() {
        return labelWorkFeeSum;
    }

    /**
     * 标签工费
     * @param labelWorkFeeSum 标签工费
     */
    public void setLabelWorkFeeSum(Double labelWorkFeeSum) {
        this.labelWorkFeeSum = labelWorkFeeSum;
    }

    /**
     * 加价率，配石倍率：金镶玉
     * @return labelRate 加价率，配石倍率：金镶玉
     */
    public Double getLabelRate() {
        return labelRate;
    }

    /**
     * 加价率，配石倍率：金镶玉
     * @param labelRate 加价率，配石倍率：金镶玉
     */
    public void setLabelRate(Double labelRate) {
        this.labelRate = labelRate;
    }

    /**
     * 标签价（售价）：成本单价*加价率，配石标价：金镶玉
     * @return labelPrice 标签价（售价）：成本单价*加价率，配石标价：金镶玉
     */
    public Double getLabelPrice() {
        return labelPrice;
    }

    /**
     * 标签价（售价）：成本单价*加价率，配石标价：金镶玉
     * @param labelPrice 标签价（售价）：成本单价*加价率，配石标价：金镶玉
     */
    public void setLabelPrice(Double labelPrice) {
        this.labelPrice = labelPrice;
    }

    /**
     * 售价金额：售价*数量
     * @return labelPriceSum 售价金额：售价*数量
     */
    public Double getLabelPriceSum() {
        return labelPriceSum;
    }

    /**
     * 售价金额：售价*数量
     * @param labelPriceSum 售价金额：售价*数量
     */
    public void setLabelPriceSum(Double labelPriceSum) {
        this.labelPriceSum = labelPriceSum;
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
     * @return categoryId 对应商品档案ID
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 对应商品档案ID
     * @param categoryId 对应商品档案ID
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 商品编码：商品档案中编码
     * @return sysCode 商品编码：商品档案中编码
     */
    public String getSysCode() {
        return sysCode;
    }

    /**
     * 商品编码：商品档案中编码
     * @param sysCode 商品编码：商品档案中编码
     */
    public void setSysCode(String sysCode) {
        this.sysCode = sysCode == null ? null : sysCode.trim();
    }

    /**
     * 商品名称：商品档案中的名称
     * @return productName 商品名称：商品档案中的名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 商品名称：商品档案中的名称
     * @param productName 商品名称：商品档案中的名称
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 金料名
     * @return goldName 金料名
     */
    public String getGoldName() {
        return goldName;
    }

    /**
     * 金料名
     * @param goldName 金料名
     */
    public void setGoldName(String goldName) {
        this.goldName = goldName == null ? null : goldName.trim();
    }

    /**
     * 石头
     * @return jewelName 石头
     */
    public String getJewelName() {
        return jewelName;
    }

    /**
     * 石头
     * @param jewelName 石头
     */
    public void setJewelName(String jewelName) {
        this.jewelName = jewelName == null ? null : jewelName.trim();
    }

    /**
     * 品名
     * @return categoryName 品名
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 品名
     * @param categoryName 品名
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * 大类名称
     * @return firstType 大类名称
     */
    public String getFirstType() {
        return firstType;
    }

    /**
     * 大类名称
     * @param firstType 大类名称
     */
    public void setFirstType(String firstType) {
        this.firstType = firstType == null ? null : firstType.trim();
    }

    /**
     * 商品所属大类的英文
     * @return firstTypeName 商品所属大类的英文
     */
    public String getFirstTypeName() {
        return firstTypeName;
    }

    /**
     * 商品所属大类的英文
     * @param firstTypeName 商品所属大类的英文
     */
    public void setFirstTypeName(String firstTypeName) {
        this.firstTypeName = firstTypeName == null ? null : firstTypeName.trim();
    }

    /**
     * 中类
     * @return secondType 中类
     */
    public String getSecondType() {
        return secondType;
    }

    /**
     * 中类
     * @param secondType 中类
     */
    public void setSecondType(String secondType) {
        this.secondType = secondType == null ? null : secondType.trim();
    }

    /**
     * 
     * @return secondTypeName 
     */
    public String getSecondTypeName() {
        return secondTypeName;
    }

    /**
     * 
     * @param secondTypeName 
     */
    public void setSecondTypeName(String secondTypeName) {
        this.secondTypeName = secondTypeName == null ? null : secondTypeName.trim();
    }

    /**
     * 实际分类：对应商品档案中的实际分类
     * @return productClassify 实际分类：对应商品档案中的实际分类
     */
    public String getProductClassify() {
        return productClassify;
    }

    /**
     * 实际分类：对应商品档案中的实际分类
     * @param productClassify 实际分类：对应商品档案中的实际分类
     */
    public void setProductClassify(String productClassify) {
        this.productClassify = productClassify == null ? null : productClassify.trim();
    }

    /**
     * 统计分类1
     * @return firstClassify 统计分类1
     */
    public String getFirstClassify() {
        return firstClassify;
    }

    /**
     * 统计分类1
     * @param firstClassify 统计分类1
     */
    public void setFirstClassify(String firstClassify) {
        this.firstClassify = firstClassify == null ? null : firstClassify.trim();
    }

    /**
     * 统计分类2
     * @return secondClassify 统计分类2
     */
    public String getSecondClassify() {
        return secondClassify;
    }

    /**
     * 统计分类2
     * @param secondClassify 统计分类2
     */
    public void setSecondClassify(String secondClassify) {
        this.secondClassify = secondClassify == null ? null : secondClassify.trim();
    }

    /**
     * 标签显示名称
     * @return labelName 标签显示名称
     */
    public String getLabelName() {
        return labelName;
    }

    /**
     * 标签显示名称
     * @param labelName 标签显示名称
     */
    public void setLabelName(String labelName) {
        this.labelName = labelName == null ? null : labelName.trim();
    }

    /**
     * 模板名称
     * @return grfName 模板名称
     */
    public String getGrfName() {
        return grfName;
    }

    /**
     * 模板名称
     * @param grfName 模板名称
     */
    public void setGrfName(String grfName) {
        this.grfName = grfName == null ? null : grfName.trim();
    }

    /**
     * 统计分类3
     * @return thirdClassify 统计分类3
     */
    public String getThirdClassify() {
        return thirdClassify;
    }

    /**
     * 统计分类3
     * @param thirdClassify 统计分类3
     */
    public void setThirdClassify(String thirdClassify) {
        this.thirdClassify = thirdClassify == null ? null : thirdClassify.trim();
    }

    /**
     * 切工
     * @return mJewelCut 切工
     */
    public String getmJewelCut() {
        return mJewelCut;
    }

    /**
     * 切工
     * @param mJewelCut 切工
     */
    public void setmJewelCut(String mJewelCut) {
        this.mJewelCut = mJewelCut == null ? null : mJewelCut.trim();
    }

    /**
     * 颜色
     * @return mJewelColor 颜色
     */
    public String getmJewelColor() {
        return mJewelColor;
    }

    /**
     * 颜色
     * @param mJewelColor 颜色
     */
    public void setmJewelColor(String mJewelColor) {
        this.mJewelColor = mJewelColor == null ? null : mJewelColor.trim();
    }

    /**
     * 净度
     * @return mJewelClarity 净度
     */
    public String getmJewelClarity() {
        return mJewelClarity;
    }

    /**
     * 净度
     * @param mJewelClarity 净度
     */
    public void setmJewelClarity(String mJewelClarity) {
        this.mJewelClarity = mJewelClarity == null ? null : mJewelClarity.trim();
    }

    /**
     * 荧光
     * @return mJewelFluorescent 荧光
     */
    public String getmJewelFluorescent() {
        return mJewelFluorescent;
    }

    /**
     * 荧光
     * @param mJewelFluorescent 荧光
     */
    public void setmJewelFluorescent(String mJewelFluorescent) {
        this.mJewelFluorescent = mJewelFluorescent == null ? null : mJewelFluorescent.trim();
    }

    /**
     * 抛光度
     * @return mJewelBurnished 抛光度
     */
    public String getmJewelBurnished() {
        return mJewelBurnished;
    }

    /**
     * 抛光度
     * @param mJewelBurnished 抛光度
     */
    public void setmJewelBurnished(String mJewelBurnished) {
        this.mJewelBurnished = mJewelBurnished == null ? null : mJewelBurnished.trim();
    }

    /**
     * 形状
     * @return mJewelShape 形状
     */
    public String getmJewelShape() {
        return mJewelShape;
    }

    /**
     * 形状
     * @param mJewelShape 形状
     */
    public void setmJewelShape(String mJewelShape) {
        this.mJewelShape = mJewelShape == null ? null : mJewelShape.trim();
    }

    /**
     * 主石名
     * @return mJewelName 主石名
     */
    public String getmJewelName() {
        return mJewelName;
    }

    /**
     * 主石名
     * @param mJewelName 主石名
     */
    public void setmJewelName(String mJewelName) {
        this.mJewelName = mJewelName == null ? null : mJewelName.trim();
    }

    /**
     * 主石石号
     * @return mJewelNo 主石石号
     */
    public String getmJewelNo() {
        return mJewelNo;
    }

    /**
     * 主石石号
     * @param mJewelNo 主石石号
     */
    public void setmJewelNo(String mJewelNo) {
        this.mJewelNo = mJewelNo == null ? null : mJewelNo.trim();
    }

    /**
     * 主石规格
     * @return mJewelSpecifi 主石规格
     */
    public String getmJewelSpecifi() {
        return mJewelSpecifi;
    }

    /**
     * 主石规格
     * @param mJewelSpecifi 主石规格
     */
    public void setmJewelSpecifi(String mJewelSpecifi) {
        this.mJewelSpecifi = mJewelSpecifi == null ? null : mJewelSpecifi.trim();
    }

    /**
     * 主石数
     * @return mJewelNum 主石数
     */
    public Integer getmJewelNum() {
        return mJewelNum;
    }

    /**
     * 主石数
     * @param mJewelNum 主石数
     */
    public void setmJewelNum(Integer mJewelNum) {
        this.mJewelNum = mJewelNum;
    }

    /**
     * 主石重
     * @return mJewelWeight 主石重
     */
    public Double getmJewelWeight() {
        return mJewelWeight;
    }

    /**
     * 主石重
     * @param mJewelWeight 主石重
     */
    public void setmJewelWeight(Double mJewelWeight) {
        this.mJewelWeight = mJewelWeight;
    }

    /**
     * 主石价，配石成本：金镶玉
     * @return mJewelPrice 主石价，配石成本：金镶玉
     */
    public Double getmJewelPrice() {
        return mJewelPrice;
    }

    /**
     * 主石价，配石成本：金镶玉
     * @param mJewelPrice 主石价，配石成本：金镶玉
     */
    public void setmJewelPrice(Double mJewelPrice) {
        this.mJewelPrice = mJewelPrice;
    }

    /**
     * 主石额
     * @return mJewelFee 主石额
     */
    public Double getmJewelFee() {
        return mJewelFee;
    }

    /**
     * 主石额
     * @param mJewelFee 主石额
     */
    public void setmJewelFee(Double mJewelFee) {
        this.mJewelFee = mJewelFee;
    }

    /**
     * 副石1名
     * @return sJewel1Name 副石1名
     */
    public String getsJewel1Name() {
        return sJewel1Name;
    }

    /**
     * 副石1名
     * @param sJewel1Name 副石1名
     */
    public void setsJewel1Name(String sJewel1Name) {
        this.sJewel1Name = sJewel1Name == null ? null : sJewel1Name.trim();
    }

    /**
     * 副石1石号
     * @return sJewel1No 副石1石号
     */
    public String getsJewel1No() {
        return sJewel1No;
    }

    /**
     * 副石1石号
     * @param sJewel1No 副石1石号
     */
    public void setsJewel1No(String sJewel1No) {
        this.sJewel1No = sJewel1No == null ? null : sJewel1No.trim();
    }

    /**
     * 副石1规格
     * @return sJewel1Specifi 副石1规格
     */
    public String getsJewel1Specifi() {
        return sJewel1Specifi;
    }

    /**
     * 副石1规格
     * @param sJewel1Specifi 副石1规格
     */
    public void setsJewel1Specifi(String sJewel1Specifi) {
        this.sJewel1Specifi = sJewel1Specifi == null ? null : sJewel1Specifi.trim();
    }

    /**
     * 副石1数
     * @return sJewel1Num 副石1数
     */
    public Integer getsJewel1Num() {
        return sJewel1Num;
    }

    /**
     * 副石1数
     * @param sJewel1Num 副石1数
     */
    public void setsJewel1Num(Integer sJewel1Num) {
        this.sJewel1Num = sJewel1Num;
    }

    /**
     * 副石1重
     * @return sJewel1Weight 副石1重
     */
    public Double getsJewel1Weight() {
        return sJewel1Weight;
    }

    /**
     * 副石1重
     * @param sJewel1Weight 副石1重
     */
    public void setsJewel1Weight(Double sJewel1Weight) {
        this.sJewel1Weight = sJewel1Weight;
    }

    /**
     * 副石1价
     * @return sJewel1Price 副石1价
     */
    public Double getsJewel1Price() {
        return sJewel1Price;
    }

    /**
     * 副石1价
     * @param sJewel1Price 副石1价
     */
    public void setsJewel1Price(Double sJewel1Price) {
        this.sJewel1Price = sJewel1Price;
    }

    /**
     * 副石1额
     * @return sJewel1Fee 副石1额
     */
    public Double getsJewel1Fee() {
        return sJewel1Fee;
    }

    /**
     * 副石1额
     * @param sJewel1Fee 副石1额
     */
    public void setsJewel1Fee(Double sJewel1Fee) {
        this.sJewel1Fee = sJewel1Fee;
    }

    /**
     * 入库单号
     * @return billNo 入库单号
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * 入库单号
     * @param billNo 入库单号
     */
    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    /**
     * 库存时间:使用的是入库单（或调拨单）的时间
     * @return billDate 库存时间:使用的是入库单（或调拨单）的时间
     */
    public String getBillDate() {
        return billDate;
    }

    /**
     * 库存时间:使用的是入库单（或调拨单）的时间
     * @param billDate 库存时间:使用的是入库单（或调拨单）的时间
     */
    public void setBillDate(String billDate) {
        this.billDate = billDate == null ? null : billDate.trim();
    }

    /**
     * 一码多货的标记：0：一码一货；1：一码多货
     * @return mutilFlag 一码多货的标记：0：一码一货；1：一码多货
     */
    public Integer getMutilFlag() {
        return mutilFlag;
    }

    /**
     * 一码多货的标记：0：一码一货；1：一码多货
     * @param mutilFlag 一码多货的标记：0：一码一货；1：一码多货
     */
    public void setMutilFlag(Integer mutilFlag) {
        this.mutilFlag = mutilFlag;
    }
}