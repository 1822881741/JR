package com.jr.erp.bill.stocktake.entity;

import com.jr.erp.base.mybatis.BaseEntity;

public class BillStocktakeSubItem extends BaseEntity {
    /**
     * 盘点任务ID
     */
    private Integer majorBillId;

    /**
     * 盘点单ID
     */
    private Integer billId;

    /**
     * 主单单号
     */
    private String majorBillNo;

    /**
     * 
     */
    private Integer sysBillNo;

    /**
     * 子单单号
     */
    private String billNo;

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
     * 款号
     */
    private String comStyleNo;

    /**
     * 
     */
    private String facStyleNo;

    /**
     * 图片路径
     */
    private String img;

    /**
     * 商品备注信息
     */
    private String remarks;

    /**
     * 商品名称：商品档案中的名称
     */
    private String goodsName;

    /**
     * 实际分类：对应商品档案中的实际分类
     */
    private String goodsClassify;

    /**
     * 商品所属大类的英文
     */
    private String mainTypePrefix;

    /**
     * 0未保存；1已经保存
     */
    private Boolean saveFlag;

    /**
     * 盘点数量
     */
    private Integer takeNum;

    /**
     * 盘点金重
     */
    private Double takeGoldWeight;

    /**
     * 盘点石重
     */
    private Double takeJewelWeight;

    /**
     * 盘点成本
     */
    private Double takeCostPrice;

    /**
     * 盘点标价
     */
    private Double takeLabelPriceSum;

    /**
     * 一码多货的标记：0：非一码多货；1：一码多货
     */
    private Boolean dhFlag;

    /**
     * 建单人ID
     */
    private Integer createUserId;

    /**
     * 建单人名称
     */
    private String createUserName;

    /**
     * 对应的库存记录的ID
     */
    private Integer stockId;

    /**
     * 记录类型：0:本门店且盘点范围内的数据；1：本门店的但是非盘点范围内的数据；2：不是本门店的数据（除了0和1的都划分到2：本门店但是库存为0的，本公司的但在本门店没有出现过的....）
     */
    private Integer recordType;

    /**
     * 是否是当前系统的货：0：不是；1：是
     */
    private Boolean sysGoods;

    /**
     * 盘点任务ID
     * @return majorBillId 盘点任务ID
     */
    public Integer getMajorBillId() {
        return majorBillId;
    }

    /**
     * 盘点任务ID
     * @param majorBillId 盘点任务ID
     */
    public void setMajorBillId(Integer majorBillId) {
        this.majorBillId = majorBillId;
    }

    /**
     * 盘点单ID
     * @return billId 盘点单ID
     */
    public Integer getBillId() {
        return billId;
    }

    /**
     * 盘点单ID
     * @param billId 盘点单ID
     */
    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    /**
     * 主单单号
     * @return majorBillNo 主单单号
     */
    public String getMajorBillNo() {
        return majorBillNo;
    }

    /**
     * 主单单号
     * @param majorBillNo 主单单号
     */
    public void setMajorBillNo(String majorBillNo) {
        this.majorBillNo = majorBillNo == null ? null : majorBillNo.trim();
    }

    /**
     * 
     * @return sysBillNo 
     */
    public Integer getSysBillNo() {
        return sysBillNo;
    }

    /**
     * 
     * @param sysBillNo 
     */
    public void setSysBillNo(Integer sysBillNo) {
        this.sysBillNo = sysBillNo;
    }

    /**
     * 子单单号
     * @return billNo 子单单号
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * 子单单号
     * @param billNo 子单单号
     */
    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
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
     * 款号
     * @return comStyleNo 款号
     */
    public String getComStyleNo() {
        return comStyleNo;
    }

    /**
     * 款号
     * @param comStyleNo 款号
     */
    public void setComStyleNo(String comStyleNo) {
        this.comStyleNo = comStyleNo == null ? null : comStyleNo.trim();
    }

    /**
     * 
     * @return facStyleNo 
     */
    public String getFacStyleNo() {
        return facStyleNo;
    }

    /**
     * 
     * @param facStyleNo 
     */
    public void setFacStyleNo(String facStyleNo) {
        this.facStyleNo = facStyleNo == null ? null : facStyleNo.trim();
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
     * 0未保存；1已经保存
     * @return saveFlag 0未保存；1已经保存
     */
    public Boolean getSaveFlag() {
        return saveFlag;
    }

    /**
     * 0未保存；1已经保存
     * @param saveFlag 0未保存；1已经保存
     */
    public void setSaveFlag(Boolean saveFlag) {
        this.saveFlag = saveFlag;
    }

    /**
     * 盘点数量
     * @return takeNum 盘点数量
     */
    public Integer getTakeNum() {
        return takeNum;
    }

    /**
     * 盘点数量
     * @param takeNum 盘点数量
     */
    public void setTakeNum(Integer takeNum) {
        this.takeNum = takeNum;
    }

    /**
     * 盘点金重
     * @return takeGoldWeight 盘点金重
     */
    public Double getTakeGoldWeight() {
        return takeGoldWeight;
    }

    /**
     * 盘点金重
     * @param takeGoldWeight 盘点金重
     */
    public void setTakeGoldWeight(Double takeGoldWeight) {
        this.takeGoldWeight = takeGoldWeight;
    }

    /**
     * 盘点石重
     * @return takeJewelWeight 盘点石重
     */
    public Double getTakeJewelWeight() {
        return takeJewelWeight;
    }

    /**
     * 盘点石重
     * @param takeJewelWeight 盘点石重
     */
    public void setTakeJewelWeight(Double takeJewelWeight) {
        this.takeJewelWeight = takeJewelWeight;
    }

    /**
     * 盘点成本
     * @return takeCostPrice 盘点成本
     */
    public Double getTakeCostPrice() {
        return takeCostPrice;
    }

    /**
     * 盘点成本
     * @param takeCostPrice 盘点成本
     */
    public void setTakeCostPrice(Double takeCostPrice) {
        this.takeCostPrice = takeCostPrice;
    }

    /**
     * 盘点标价
     * @return takeLabelPriceSum 盘点标价
     */
    public Double getTakeLabelPriceSum() {
        return takeLabelPriceSum;
    }

    /**
     * 盘点标价
     * @param takeLabelPriceSum 盘点标价
     */
    public void setTakeLabelPriceSum(Double takeLabelPriceSum) {
        this.takeLabelPriceSum = takeLabelPriceSum;
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

    /**
     * 建单人ID
     * @return createUserId 建单人ID
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 建单人ID
     * @param createUserId 建单人ID
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 建单人名称
     * @return createUserName 建单人名称
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 建单人名称
     * @param createUserName 建单人名称
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    /**
     * 对应的库存记录的ID
     * @return stockId 对应的库存记录的ID
     */
    public Integer getStockId() {
        return stockId;
    }

    /**
     * 对应的库存记录的ID
     * @param stockId 对应的库存记录的ID
     */
    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    /**
     * 记录类型：0:本门店且盘点范围内的数据；1：本门店的但是非盘点范围内的数据；2：不是本门店的数据（除了0和1的都划分到2：本门店但是库存为0的，本公司的但在本门店没有出现过的....）
     * @return recordType 记录类型：0:本门店且盘点范围内的数据；1：本门店的但是非盘点范围内的数据；2：不是本门店的数据（除了0和1的都划分到2：本门店但是库存为0的，本公司的但在本门店没有出现过的....）
     */
    public Integer getRecordType() {
        return recordType;
    }

    /**
     * 记录类型：0:本门店且盘点范围内的数据；1：本门店的但是非盘点范围内的数据；2：不是本门店的数据（除了0和1的都划分到2：本门店但是库存为0的，本公司的但在本门店没有出现过的....）
     * @param recordType 记录类型：0:本门店且盘点范围内的数据；1：本门店的但是非盘点范围内的数据；2：不是本门店的数据（除了0和1的都划分到2：本门店但是库存为0的，本公司的但在本门店没有出现过的....）
     */
    public void setRecordType(Integer recordType) {
        this.recordType = recordType;
    }

    /**
     * 是否是当前系统的货：0：不是；1：是
     * @return sysGoods 是否是当前系统的货：0：不是；1：是
     */
    public Boolean getSysGoods() {
        return sysGoods;
    }

    /**
     * 是否是当前系统的货：0：不是；1：是
     * @param sysGoods 是否是当前系统的货：0：不是；1：是
     */
    public void setSysGoods(Boolean sysGoods) {
        this.sysGoods = sysGoods;
    }
}