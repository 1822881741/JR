package com.jr.erp.bill.transfer.entity;

import com.jr.erp.base.mybatis.BaseEntity;

public class BillTransferItem extends BaseEntity {
    /**
     * 进货单id
     */
    private Integer billId;

    /**
     * 单号
     */
    private String billNo;

    /**
     * 单据类型：1：进货
     */
    private Integer billType;

    /**
     * 进货在途状态：0：新建状态；10：待审核  15 ：审核驳回  20：待接受  25：接收驳回  100：全部完成
     */
    private Integer billStatus;

    /**
     * 单据日期
     */
    private String billDate;

    /**
     * 系统单号
     */
    private String sysBillNo;

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
     * 顾客名称：旧料单或旧饰回收才有
     */
    private String custName;

    /**
     * 顾客电话：旧料单或旧饰回收才有
     */
    private String custMobile;

    /**
     * 建单人
     */
    private Integer createUserId;

    /**
     * 建单人
     */
    private String createUserName;

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
     * 
     */
    private String inAreaCode;

    /**
     * 
     */
    private String inAreaName;

    /**
     * 
     */
    private String inCounterAreaCode;

    /**
     * 
     */
    private String inCounterAreaName;

    /**
     * 采购方式
     */
    private String purchaseType;

    /**
     * 1:手工录入 2：导入
     */
    private Integer inType;

    /**
     * 特价标记
     */
    private String bargainName;

    /**
     * 进货退货标记：1：进货；-1:退货
     */
    private Integer jtFlag;

    /**
     * 数量
     */
    private Integer num;

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
     * 副石2名
     */
    private String sJewel2Name;

    /**
     * 副石2石号
     */
    private String sJewel2No;

    /**
     * 副石2规格
     */
    private String sJewel2Specifi;

    /**
     * 副石2数
     */
    private Integer sJewel2Num;

    /**
     * 副石2重
     */
    private Double sJewel2Weight;

    /**
     * 副石2价
     */
    private Double sJewel2Price;

    /**
     * 副石2额
     */
    private Double sJewel2Fee;

    /**
     * 副石3名
     */
    private String sJewel3Name;

    /**
     * 副石3石号
     */
    private String sJewel3No;

    /**
     * 副石3规格
     */
    private String sJewel3Specifi;

    /**
     * 副石3数
     */
    private Integer sJewel3Num;

    /**
     * 副石3重
     */
    private Double sJewel3Weight;

    /**
     * 副石3价
     */
    private Double sJewel3Price;

    /**
     * 副石3额
     */
    private Double sJewel3Fee;

    /**
     * 副石4名
     */
    private String sJewel4Name;

    /**
     * 副石4石号
     */
    private String sJewel4No;

    /**
     * 副石4规格
     */
    private String sJewel4Specifi;

    /**
     * 副石4数
     */
    private Integer sJewel4Num;

    /**
     * 副石4重
     */
    private Double sJewel4Weight;

    /**
     * 副石4价
     */
    private Double sJewel4Price;

    /**
     * 副石4额
     */
    private Double sJewel4Fee;

    /**
     * 副石5名
     */
    private String sJewel5Name;

    /**
     * 副石5石号
     */
    private String sJewel5No;

    /**
     * 副石5规格
     */
    private String sJewel5Specifi;

    /**
     * 副石5数
     */
    private Integer sJewel5Num;

    /**
     * 副石5重
     */
    private Double sJewel5Weight;

    /**
     * 副石5价
     */
    private Double sJewel5Price;

    /**
     * 副石5额
     */
    private Double sJewel5Fee;

    /**
     * 来源：本店or外店
     */
    private String origin;

    /**
     * 业务员ID
     */
    private Integer employeeId;

    /**
     * 业务员名
     */
    private String employeeName;

    /**
     * 是否已经退货了，回收业务退回时使用
     */
    private Integer hasReturn;

    /**
     * 旧饰相关:增值金额
     */
    private Double upperMoney;

    /**
     * 旧饰相关:收购金额
     */
    private Double purchaseAmount;

    /**
     * 提纯费/克
     */
    private Double refineFee;

    /**
     * 总提纯费
     */
    private Double refineFeeTotal;

    /**
     * 商品退回时,旧的库存ID
     */
    private Integer oldStockId;

    /**
     * 接收时间：在途的调拨单的接收时间
     */
    private String receiveTime;

    /**
     * 一码多货的标记：0：一码一货；1：一码多货
     */
    private Integer mutilFlag;

    /**
     * 价格区间
     */
    private String priceRange;

    /**
     * 金重区间
     */
    private String goldRange;

    /**
     * 成本区间
     */
    private String costRange;

    /**
     * 颜色区间
     */
    private String colorRange;

    /**
     * 净度区间
     */
    private String clarityRange;

    /**
     * 出库数
     */
    private Integer outNum;

    /**
     * 出库金重
     */
    private Double outGoldWeight;

    /**
     * 出库石重
     */
    private Double outMJewelWeight;

    /**
     * 出库成本
     */
    private Double outCostPrice;

    /**
     * 出库标签金额
     */
    private Double outLabelPriceSum;

    /**
     * 出库备注
     */
    private String outRemarks;

    /**
     * 进货单id
     * @return billId 进货单id
     */
    public Integer getBillId() {
        return billId;
    }

    /**
     * 进货单id
     * @param billId 进货单id
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
     * 单据类型：1：进货
     * @return billType 单据类型：1：进货
     */
    public Integer getBillType() {
        return billType;
    }

    /**
     * 单据类型：1：进货
     * @param billType 单据类型：1：进货
     */
    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    /**
     * 进货在途状态：0：新建状态；10：待审核  15 ：审核驳回  20：待接受  25：接收驳回  100：全部完成
     * @return billStatus 进货在途状态：0：新建状态；10：待审核  15 ：审核驳回  20：待接受  25：接收驳回  100：全部完成
     */
    public Integer getBillStatus() {
        return billStatus;
    }

    /**
     * 进货在途状态：0：新建状态；10：待审核  15 ：审核驳回  20：待接受  25：接收驳回  100：全部完成
     * @param billStatus 进货在途状态：0：新建状态；10：待审核  15 ：审核驳回  20：待接受  25：接收驳回  100：全部完成
     */
    public void setBillStatus(Integer billStatus) {
        this.billStatus = billStatus;
    }

    /**
     * 单据日期
     * @return billDate 单据日期
     */
    public String getBillDate() {
        return billDate;
    }

    /**
     * 单据日期
     * @param billDate 单据日期
     */
    public void setBillDate(String billDate) {
        this.billDate = billDate == null ? null : billDate.trim();
    }

    /**
     * 系统单号
     * @return sysBillNo 系统单号
     */
    public String getSysBillNo() {
        return sysBillNo;
    }

    /**
     * 系统单号
     * @param sysBillNo 系统单号
     */
    public void setSysBillNo(String sysBillNo) {
        this.sysBillNo = sysBillNo == null ? null : sysBillNo.trim();
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
     * 顾客名称：旧料单或旧饰回收才有
     * @return custName 顾客名称：旧料单或旧饰回收才有
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 顾客名称：旧料单或旧饰回收才有
     * @param custName 顾客名称：旧料单或旧饰回收才有
     */
    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    /**
     * 顾客电话：旧料单或旧饰回收才有
     * @return custMobile 顾客电话：旧料单或旧饰回收才有
     */
    public String getCustMobile() {
        return custMobile;
    }

    /**
     * 顾客电话：旧料单或旧饰回收才有
     * @param custMobile 顾客电话：旧料单或旧饰回收才有
     */
    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile == null ? null : custMobile.trim();
    }

    /**
     * 建单人
     * @return createUserId 建单人
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 建单人
     * @param createUserId 建单人
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 建单人
     * @return createUserName 建单人
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 建单人
     * @param createUserName 建单人
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
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
     * 
     * @return inAreaCode 
     */
    public String getInAreaCode() {
        return inAreaCode;
    }

    /**
     * 
     * @param inAreaCode 
     */
    public void setInAreaCode(String inAreaCode) {
        this.inAreaCode = inAreaCode == null ? null : inAreaCode.trim();
    }

    /**
     * 
     * @return inAreaName 
     */
    public String getInAreaName() {
        return inAreaName;
    }

    /**
     * 
     * @param inAreaName 
     */
    public void setInAreaName(String inAreaName) {
        this.inAreaName = inAreaName == null ? null : inAreaName.trim();
    }

    /**
     * 
     * @return inCounterAreaCode 
     */
    public String getInCounterAreaCode() {
        return inCounterAreaCode;
    }

    /**
     * 
     * @param inCounterAreaCode 
     */
    public void setInCounterAreaCode(String inCounterAreaCode) {
        this.inCounterAreaCode = inCounterAreaCode == null ? null : inCounterAreaCode.trim();
    }

    /**
     * 
     * @return inCounterAreaName 
     */
    public String getInCounterAreaName() {
        return inCounterAreaName;
    }

    /**
     * 
     * @param inCounterAreaName 
     */
    public void setInCounterAreaName(String inCounterAreaName) {
        this.inCounterAreaName = inCounterAreaName == null ? null : inCounterAreaName.trim();
    }

    /**
     * 采购方式
     * @return purchaseType 采购方式
     */
    public String getPurchaseType() {
        return purchaseType;
    }

    /**
     * 采购方式
     * @param purchaseType 采购方式
     */
    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType == null ? null : purchaseType.trim();
    }

    /**
     * 1:手工录入 2：导入
     * @return inType 1:手工录入 2：导入
     */
    public Integer getInType() {
        return inType;
    }

    /**
     * 1:手工录入 2：导入
     * @param inType 1:手工录入 2：导入
     */
    public void setInType(Integer inType) {
        this.inType = inType;
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
     * 副石2名
     * @return sJewel2Name 副石2名
     */
    public String getsJewel2Name() {
        return sJewel2Name;
    }

    /**
     * 副石2名
     * @param sJewel2Name 副石2名
     */
    public void setsJewel2Name(String sJewel2Name) {
        this.sJewel2Name = sJewel2Name == null ? null : sJewel2Name.trim();
    }

    /**
     * 副石2石号
     * @return sJewel2No 副石2石号
     */
    public String getsJewel2No() {
        return sJewel2No;
    }

    /**
     * 副石2石号
     * @param sJewel2No 副石2石号
     */
    public void setsJewel2No(String sJewel2No) {
        this.sJewel2No = sJewel2No == null ? null : sJewel2No.trim();
    }

    /**
     * 副石2规格
     * @return sJewel2Specifi 副石2规格
     */
    public String getsJewel2Specifi() {
        return sJewel2Specifi;
    }

    /**
     * 副石2规格
     * @param sJewel2Specifi 副石2规格
     */
    public void setsJewel2Specifi(String sJewel2Specifi) {
        this.sJewel2Specifi = sJewel2Specifi == null ? null : sJewel2Specifi.trim();
    }

    /**
     * 副石2数
     * @return sJewel2Num 副石2数
     */
    public Integer getsJewel2Num() {
        return sJewel2Num;
    }

    /**
     * 副石2数
     * @param sJewel2Num 副石2数
     */
    public void setsJewel2Num(Integer sJewel2Num) {
        this.sJewel2Num = sJewel2Num;
    }

    /**
     * 副石2重
     * @return sJewel2Weight 副石2重
     */
    public Double getsJewel2Weight() {
        return sJewel2Weight;
    }

    /**
     * 副石2重
     * @param sJewel2Weight 副石2重
     */
    public void setsJewel2Weight(Double sJewel2Weight) {
        this.sJewel2Weight = sJewel2Weight;
    }

    /**
     * 副石2价
     * @return sJewel2Price 副石2价
     */
    public Double getsJewel2Price() {
        return sJewel2Price;
    }

    /**
     * 副石2价
     * @param sJewel2Price 副石2价
     */
    public void setsJewel2Price(Double sJewel2Price) {
        this.sJewel2Price = sJewel2Price;
    }

    /**
     * 副石2额
     * @return sJewel2Fee 副石2额
     */
    public Double getsJewel2Fee() {
        return sJewel2Fee;
    }

    /**
     * 副石2额
     * @param sJewel2Fee 副石2额
     */
    public void setsJewel2Fee(Double sJewel2Fee) {
        this.sJewel2Fee = sJewel2Fee;
    }

    /**
     * 副石3名
     * @return sJewel3Name 副石3名
     */
    public String getsJewel3Name() {
        return sJewel3Name;
    }

    /**
     * 副石3名
     * @param sJewel3Name 副石3名
     */
    public void setsJewel3Name(String sJewel3Name) {
        this.sJewel3Name = sJewel3Name == null ? null : sJewel3Name.trim();
    }

    /**
     * 副石3石号
     * @return sJewel3No 副石3石号
     */
    public String getsJewel3No() {
        return sJewel3No;
    }

    /**
     * 副石3石号
     * @param sJewel3No 副石3石号
     */
    public void setsJewel3No(String sJewel3No) {
        this.sJewel3No = sJewel3No == null ? null : sJewel3No.trim();
    }

    /**
     * 副石3规格
     * @return sJewel3Specifi 副石3规格
     */
    public String getsJewel3Specifi() {
        return sJewel3Specifi;
    }

    /**
     * 副石3规格
     * @param sJewel3Specifi 副石3规格
     */
    public void setsJewel3Specifi(String sJewel3Specifi) {
        this.sJewel3Specifi = sJewel3Specifi == null ? null : sJewel3Specifi.trim();
    }

    /**
     * 副石3数
     * @return sJewel3Num 副石3数
     */
    public Integer getsJewel3Num() {
        return sJewel3Num;
    }

    /**
     * 副石3数
     * @param sJewel3Num 副石3数
     */
    public void setsJewel3Num(Integer sJewel3Num) {
        this.sJewel3Num = sJewel3Num;
    }

    /**
     * 副石3重
     * @return sJewel3Weight 副石3重
     */
    public Double getsJewel3Weight() {
        return sJewel3Weight;
    }

    /**
     * 副石3重
     * @param sJewel3Weight 副石3重
     */
    public void setsJewel3Weight(Double sJewel3Weight) {
        this.sJewel3Weight = sJewel3Weight;
    }

    /**
     * 副石3价
     * @return sJewel3Price 副石3价
     */
    public Double getsJewel3Price() {
        return sJewel3Price;
    }

    /**
     * 副石3价
     * @param sJewel3Price 副石3价
     */
    public void setsJewel3Price(Double sJewel3Price) {
        this.sJewel3Price = sJewel3Price;
    }

    /**
     * 副石3额
     * @return sJewel3Fee 副石3额
     */
    public Double getsJewel3Fee() {
        return sJewel3Fee;
    }

    /**
     * 副石3额
     * @param sJewel3Fee 副石3额
     */
    public void setsJewel3Fee(Double sJewel3Fee) {
        this.sJewel3Fee = sJewel3Fee;
    }

    /**
     * 副石4名
     * @return sJewel4Name 副石4名
     */
    public String getsJewel4Name() {
        return sJewel4Name;
    }

    /**
     * 副石4名
     * @param sJewel4Name 副石4名
     */
    public void setsJewel4Name(String sJewel4Name) {
        this.sJewel4Name = sJewel4Name == null ? null : sJewel4Name.trim();
    }

    /**
     * 副石4石号
     * @return sJewel4No 副石4石号
     */
    public String getsJewel4No() {
        return sJewel4No;
    }

    /**
     * 副石4石号
     * @param sJewel4No 副石4石号
     */
    public void setsJewel4No(String sJewel4No) {
        this.sJewel4No = sJewel4No == null ? null : sJewel4No.trim();
    }

    /**
     * 副石4规格
     * @return sJewel4Specifi 副石4规格
     */
    public String getsJewel4Specifi() {
        return sJewel4Specifi;
    }

    /**
     * 副石4规格
     * @param sJewel4Specifi 副石4规格
     */
    public void setsJewel4Specifi(String sJewel4Specifi) {
        this.sJewel4Specifi = sJewel4Specifi == null ? null : sJewel4Specifi.trim();
    }

    /**
     * 副石4数
     * @return sJewel4Num 副石4数
     */
    public Integer getsJewel4Num() {
        return sJewel4Num;
    }

    /**
     * 副石4数
     * @param sJewel4Num 副石4数
     */
    public void setsJewel4Num(Integer sJewel4Num) {
        this.sJewel4Num = sJewel4Num;
    }

    /**
     * 副石4重
     * @return sJewel4Weight 副石4重
     */
    public Double getsJewel4Weight() {
        return sJewel4Weight;
    }

    /**
     * 副石4重
     * @param sJewel4Weight 副石4重
     */
    public void setsJewel4Weight(Double sJewel4Weight) {
        this.sJewel4Weight = sJewel4Weight;
    }

    /**
     * 副石4价
     * @return sJewel4Price 副石4价
     */
    public Double getsJewel4Price() {
        return sJewel4Price;
    }

    /**
     * 副石4价
     * @param sJewel4Price 副石4价
     */
    public void setsJewel4Price(Double sJewel4Price) {
        this.sJewel4Price = sJewel4Price;
    }

    /**
     * 副石4额
     * @return sJewel4Fee 副石4额
     */
    public Double getsJewel4Fee() {
        return sJewel4Fee;
    }

    /**
     * 副石4额
     * @param sJewel4Fee 副石4额
     */
    public void setsJewel4Fee(Double sJewel4Fee) {
        this.sJewel4Fee = sJewel4Fee;
    }

    /**
     * 副石5名
     * @return sJewel5Name 副石5名
     */
    public String getsJewel5Name() {
        return sJewel5Name;
    }

    /**
     * 副石5名
     * @param sJewel5Name 副石5名
     */
    public void setsJewel5Name(String sJewel5Name) {
        this.sJewel5Name = sJewel5Name == null ? null : sJewel5Name.trim();
    }

    /**
     * 副石5石号
     * @return sJewel5No 副石5石号
     */
    public String getsJewel5No() {
        return sJewel5No;
    }

    /**
     * 副石5石号
     * @param sJewel5No 副石5石号
     */
    public void setsJewel5No(String sJewel5No) {
        this.sJewel5No = sJewel5No == null ? null : sJewel5No.trim();
    }

    /**
     * 副石5规格
     * @return sJewel5Specifi 副石5规格
     */
    public String getsJewel5Specifi() {
        return sJewel5Specifi;
    }

    /**
     * 副石5规格
     * @param sJewel5Specifi 副石5规格
     */
    public void setsJewel5Specifi(String sJewel5Specifi) {
        this.sJewel5Specifi = sJewel5Specifi == null ? null : sJewel5Specifi.trim();
    }

    /**
     * 副石5数
     * @return sJewel5Num 副石5数
     */
    public Integer getsJewel5Num() {
        return sJewel5Num;
    }

    /**
     * 副石5数
     * @param sJewel5Num 副石5数
     */
    public void setsJewel5Num(Integer sJewel5Num) {
        this.sJewel5Num = sJewel5Num;
    }

    /**
     * 副石5重
     * @return sJewel5Weight 副石5重
     */
    public Double getsJewel5Weight() {
        return sJewel5Weight;
    }

    /**
     * 副石5重
     * @param sJewel5Weight 副石5重
     */
    public void setsJewel5Weight(Double sJewel5Weight) {
        this.sJewel5Weight = sJewel5Weight;
    }

    /**
     * 副石5价
     * @return sJewel5Price 副石5价
     */
    public Double getsJewel5Price() {
        return sJewel5Price;
    }

    /**
     * 副石5价
     * @param sJewel5Price 副石5价
     */
    public void setsJewel5Price(Double sJewel5Price) {
        this.sJewel5Price = sJewel5Price;
    }

    /**
     * 副石5额
     * @return sJewel5Fee 副石5额
     */
    public Double getsJewel5Fee() {
        return sJewel5Fee;
    }

    /**
     * 副石5额
     * @param sJewel5Fee 副石5额
     */
    public void setsJewel5Fee(Double sJewel5Fee) {
        this.sJewel5Fee = sJewel5Fee;
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
     * 业务员ID
     * @return employeeId 业务员ID
     */
    public Integer getEmployeeId() {
        return employeeId;
    }

    /**
     * 业务员ID
     * @param employeeId 业务员ID
     */
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 业务员名
     * @return employeeName 业务员名
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 业务员名
     * @param employeeName 业务员名
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    /**
     * 是否已经退货了，回收业务退回时使用
     * @return hasReturn 是否已经退货了，回收业务退回时使用
     */
    public Integer getHasReturn() {
        return hasReturn;
    }

    /**
     * 是否已经退货了，回收业务退回时使用
     * @param hasReturn 是否已经退货了，回收业务退回时使用
     */
    public void setHasReturn(Integer hasReturn) {
        this.hasReturn = hasReturn;
    }

    /**
     * 旧饰相关:增值金额
     * @return upperMoney 旧饰相关:增值金额
     */
    public Double getUpperMoney() {
        return upperMoney;
    }

    /**
     * 旧饰相关:增值金额
     * @param upperMoney 旧饰相关:增值金额
     */
    public void setUpperMoney(Double upperMoney) {
        this.upperMoney = upperMoney;
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
     * 接收时间：在途的调拨单的接收时间
     * @return receiveTime 接收时间：在途的调拨单的接收时间
     */
    public String getReceiveTime() {
        return receiveTime;
    }

    /**
     * 接收时间：在途的调拨单的接收时间
     * @param receiveTime 接收时间：在途的调拨单的接收时间
     */
    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime == null ? null : receiveTime.trim();
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
     * 成本区间
     * @return costRange 成本区间
     */
    public String getCostRange() {
        return costRange;
    }

    /**
     * 成本区间
     * @param costRange 成本区间
     */
    public void setCostRange(String costRange) {
        this.costRange = costRange == null ? null : costRange.trim();
    }

    /**
     * 颜色区间
     * @return colorRange 颜色区间
     */
    public String getColorRange() {
        return colorRange;
    }

    /**
     * 颜色区间
     * @param colorRange 颜色区间
     */
    public void setColorRange(String colorRange) {
        this.colorRange = colorRange == null ? null : colorRange.trim();
    }

    /**
     * 净度区间
     * @return clarityRange 净度区间
     */
    public String getClarityRange() {
        return clarityRange;
    }

    /**
     * 净度区间
     * @param clarityRange 净度区间
     */
    public void setClarityRange(String clarityRange) {
        this.clarityRange = clarityRange == null ? null : clarityRange.trim();
    }

    /**
     * 出库数
     * @return outNum 出库数
     */
    public Integer getOutNum() {
        return outNum;
    }

    /**
     * 出库数
     * @param outNum 出库数
     */
    public void setOutNum(Integer outNum) {
        this.outNum = outNum;
    }

    /**
     * 出库金重
     * @return outGoldWeight 出库金重
     */
    public Double getOutGoldWeight() {
        return outGoldWeight;
    }

    /**
     * 出库金重
     * @param outGoldWeight 出库金重
     */
    public void setOutGoldWeight(Double outGoldWeight) {
        this.outGoldWeight = outGoldWeight;
    }

    /**
     * 出库石重
     * @return outMJewelWeight 出库石重
     */
    public Double getOutMJewelWeight() {
        return outMJewelWeight;
    }

    /**
     * 出库石重
     * @param outMJewelWeight 出库石重
     */
    public void setOutMJewelWeight(Double outMJewelWeight) {
        this.outMJewelWeight = outMJewelWeight;
    }

    /**
     * 出库成本
     * @return outCostPrice 出库成本
     */
    public Double getOutCostPrice() {
        return outCostPrice;
    }

    /**
     * 出库成本
     * @param outCostPrice 出库成本
     */
    public void setOutCostPrice(Double outCostPrice) {
        this.outCostPrice = outCostPrice;
    }

    /**
     * 出库标签金额
     * @return outLabelPriceSum 出库标签金额
     */
    public Double getOutLabelPriceSum() {
        return outLabelPriceSum;
    }

    /**
     * 出库标签金额
     * @param outLabelPriceSum 出库标签金额
     */
    public void setOutLabelPriceSum(Double outLabelPriceSum) {
        this.outLabelPriceSum = outLabelPriceSum;
    }

    /**
     * 出库备注
     * @return outRemarks 出库备注
     */
    public String getOutRemarks() {
        return outRemarks;
    }

    /**
     * 出库备注
     * @param outRemarks 出库备注
     */
    public void setOutRemarks(String outRemarks) {
        this.outRemarks = outRemarks == null ? null : outRemarks.trim();
    }
}