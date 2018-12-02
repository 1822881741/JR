package com.jr.erp.bill.stocktake.entity;

import com.jr.erp.base.mybatis.BaseEntity;

public class BillStocktakeSub extends BaseEntity {
    /**
     * 盘点主单ID
     */
    private Integer billId;

    /**
     * 单号
     */
    private String billNo;

    /**
     * 
     */
    private String sysBillNo;

    /**
     * 主单号
     */
    private String majorBillNo;

    /**
     * 单据状态：0暂存；1：已提交
     */
    private Integer billStatus;

    /**
     * 部门地区码：公司节点或者门店节点的地区码（地区表）
     */
    private String areaCode;

    /**
     * 部门地区名称：公司节点或者门店节点的地区名称（地区表）
     */
    private String areaName;

    /**
     * 仓库ID(多个以‘,’分隔)
     */
    private String counterAreaCode;

    /**
     * 仓库名称(多个以‘,’分隔)
     */
    private String counterAreaName;

    /**
     * 建单人ID
     */
    private Integer createUserId;

    /**
     * 建单人名称
     */
    private String createUserName;

    /**
     * 备注
     */
    private String remarks;

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
     * 商品名称：商品档案中的名称(多个以‘,’分隔)
     */
    private String productName;

    /**
     * 盘点主单ID
     * @return billId 盘点主单ID
     */
    public Integer getBillId() {
        return billId;
    }

    /**
     * 盘点主单ID
     * @param billId 盘点主单ID
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
     * 
     * @return sysBillNo 
     */
    public String getSysBillNo() {
        return sysBillNo;
    }

    /**
     * 
     * @param sysBillNo 
     */
    public void setSysBillNo(String sysBillNo) {
        this.sysBillNo = sysBillNo == null ? null : sysBillNo.trim();
    }

    /**
     * 主单号
     * @return majorBillNo 主单号
     */
    public String getMajorBillNo() {
        return majorBillNo;
    }

    /**
     * 主单号
     * @param majorBillNo 主单号
     */
    public void setMajorBillNo(String majorBillNo) {
        this.majorBillNo = majorBillNo == null ? null : majorBillNo.trim();
    }

    /**
     * 单据状态：0暂存；1：已提交
     * @return billStatus 单据状态：0暂存；1：已提交
     */
    public Integer getBillStatus() {
        return billStatus;
    }

    /**
     * 单据状态：0暂存；1：已提交
     * @param billStatus 单据状态：0暂存；1：已提交
     */
    public void setBillStatus(Integer billStatus) {
        this.billStatus = billStatus;
    }

    /**
     * 部门地区码：公司节点或者门店节点的地区码（地区表）
     * @return areaCode 部门地区码：公司节点或者门店节点的地区码（地区表）
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 部门地区码：公司节点或者门店节点的地区码（地区表）
     * @param areaCode 部门地区码：公司节点或者门店节点的地区码（地区表）
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * 部门地区名称：公司节点或者门店节点的地区名称（地区表）
     * @return areaName 部门地区名称：公司节点或者门店节点的地区名称（地区表）
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 部门地区名称：公司节点或者门店节点的地区名称（地区表）
     * @param areaName 部门地区名称：公司节点或者门店节点的地区名称（地区表）
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * 仓库ID(多个以‘,’分隔)
     * @return counterAreaCode 仓库ID(多个以‘,’分隔)
     */
    public String getCounterAreaCode() {
        return counterAreaCode;
    }

    /**
     * 仓库ID(多个以‘,’分隔)
     * @param counterAreaCode 仓库ID(多个以‘,’分隔)
     */
    public void setCounterAreaCode(String counterAreaCode) {
        this.counterAreaCode = counterAreaCode == null ? null : counterAreaCode.trim();
    }

    /**
     * 仓库名称(多个以‘,’分隔)
     * @return counterAreaName 仓库名称(多个以‘,’分隔)
     */
    public String getCounterAreaName() {
        return counterAreaName;
    }

    /**
     * 仓库名称(多个以‘,’分隔)
     * @param counterAreaName 仓库名称(多个以‘,’分隔)
     */
    public void setCounterAreaName(String counterAreaName) {
        this.counterAreaName = counterAreaName == null ? null : counterAreaName.trim();
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
     * 备注
     * @return remarks 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 备注
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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
     * 商品名称：商品档案中的名称(多个以‘,’分隔)
     * @return productName 商品名称：商品档案中的名称(多个以‘,’分隔)
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 商品名称：商品档案中的名称(多个以‘,’分隔)
     * @param productName 商品名称：商品档案中的名称(多个以‘,’分隔)
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }
}