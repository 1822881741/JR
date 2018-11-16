package com.jr.erp.bill.purchase.entity;

import java.util.Date;
import java.util.List;

import com.jr.erp.base.mybatis.BaseEntity;

public class BillPurchase extends BaseEntity {
    /**
     * 
     */
    private String sysBillNo;

    /**
     * 单号
     */
    private String billNo;

    /**
     * 供应商名称
     */
    private String supplier;

    /**
     * 顾客名称：旧料单或旧饰回收才有
     */
    private String custName;

    /**
     * 客户电话：旧料单或旧饰回收才有
     */
    private String cusMobile;

    /**
     * 业务员ID
     */
    private Integer employeeId;

    /**
     * 业务员名
     */
    private String employeeName;

    /**
     * 采购类型
     */
    private String purchaseType;

    /**
     * 单据日期
     */
    private String billDate;

    /**
     * 单据类型：1：进货；2:进货退回
     */
    private Integer billType;

    /**
     * 进货部门
     */
    private String areaCode;

    /**
     * 进货部门
     */
    private String areaName;

    /**
     * 进货柜台
     */
    private String counterAreaCode;

    /**
     * 进货柜台
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
     * 商品总件数
     */
    private Integer totalNum;

    /**
     * 总标价金额
     */
    private Double totalLabelPrice;

    /**
     * 
     */
    private Double totalCost;

    /**
     * 总工费
     */
    private Double totalWorkFee;

    /**
     * 主石重：镶嵌类的才统计
     */
    private Double totaJewelWeight;

    /**
     * 进货退货标记：1：进货；-1:退货
     */
    private Integer jtFlag;

    /**
     * 进货在途状态：0：新建状态；10：待审核  15 ：审核驳回  20：待接受  25：接收驳回  100：全部完成
     */
    private Integer billStatus;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 1:手工录入 2：导入
     */
    private Boolean inType;

    /**
     * 接收时间：在途的调拨单的接收时间
     */
    private Date receiveTime;

    /**
     * 提交审核的人ID
     */
    private Integer submitAuditUserId;

    /**
     * 提交审核的人名称
     */
    private String submitAuditUserName;

    /**
     * 提交审核时间
     */
    private Date submitAuditTime;

    /**
     * 审核人ID
     */
    private Integer auditUserId;

    /**
     * 审核人名称
     */
    private String auditUserName;

    /**
     * 审核时间，审核通过或驳回时间
     */
    private String auditTime;

    /**
     * 审核备注信息
     */
    private String auditMsg;

    /**
     * 备注
     */
    private String remarks;

    private List<BillPurchaseItem> itemList;
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
     * 客户电话：旧料单或旧饰回收才有
     * @return cusMobile 客户电话：旧料单或旧饰回收才有
     */
    public String getCusMobile() {
        return cusMobile;
    }

    /**
     * 客户电话：旧料单或旧饰回收才有
     * @param cusMobile 客户电话：旧料单或旧饰回收才有
     */
    public void setCusMobile(String cusMobile) {
        this.cusMobile = cusMobile == null ? null : cusMobile.trim();
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
     * 采购类型
     * @return purchaseType 采购类型
     */
    public String getPurchaseType() {
        return purchaseType;
    }

    /**
     * 采购类型
     * @param purchaseType 采购类型
     */
    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType == null ? null : purchaseType.trim();
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
     * 单据类型：1：进货；2:进货退回
     * @return billType 单据类型：1：进货；2:进货退回
     */
    public Integer getBillType() {
        return billType;
    }

    /**
     * 单据类型：1：进货；2:进货退回
     * @param billType 单据类型：1：进货；2:进货退回
     */
    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    /**
     * 进货部门
     * @return areaCode 进货部门
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 进货部门
     * @param areaCode 进货部门
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * 进货部门
     * @return areaName 进货部门
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 进货部门
     * @param areaName 进货部门
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * 进货柜台
     * @return counterAreaCode 进货柜台
     */
    public String getCounterAreaCode() {
        return counterAreaCode;
    }

    /**
     * 进货柜台
     * @param counterAreaCode 进货柜台
     */
    public void setCounterAreaCode(String counterAreaCode) {
        this.counterAreaCode = counterAreaCode == null ? null : counterAreaCode.trim();
    }

    /**
     * 进货柜台
     * @return counterAreaName 进货柜台
     */
    public String getCounterAreaName() {
        return counterAreaName;
    }

    /**
     * 进货柜台
     * @param counterAreaName 进货柜台
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
     * 商品总件数
     * @return totalNum 商品总件数
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    /**
     * 商品总件数
     * @param totalNum 商品总件数
     */
    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    /**
     * 总标价金额
     * @return totalLabelPrice 总标价金额
     */
    public Double getTotalLabelPrice() {
        return totalLabelPrice;
    }

    /**
     * 总标价金额
     * @param totalLabelPrice 总标价金额
     */
    public void setTotalLabelPrice(Double totalLabelPrice) {
        this.totalLabelPrice = totalLabelPrice;
    }

    /**
     * 
     * @return totalCost 
     */
    public Double getTotalCost() {
        return totalCost;
    }

    /**
     * 
     * @param totalCost 
     */
    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * 总工费
     * @return totalWorkFee 总工费
     */
    public Double getTotalWorkFee() {
        return totalWorkFee;
    }

    /**
     * 总工费
     * @param totalWorkFee 总工费
     */
    public void setTotalWorkFee(Double totalWorkFee) {
        this.totalWorkFee = totalWorkFee;
    }

    /**
     * 主石重：镶嵌类的才统计
     * @return totaJewelWeight 主石重：镶嵌类的才统计
     */
    public Double getTotaJewelWeight() {
        return totaJewelWeight;
    }

    /**
     * 主石重：镶嵌类的才统计
     * @param totaJewelWeight 主石重：镶嵌类的才统计
     */
    public void setTotaJewelWeight(Double totaJewelWeight) {
        this.totaJewelWeight = totaJewelWeight;
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
     * 1:手工录入 2：导入
     * @return inType 1:手工录入 2：导入
     */
    public Boolean getInType() {
        return inType;
    }

    /**
     * 1:手工录入 2：导入
     * @param inType 1:手工录入 2：导入
     */
    public void setInType(Boolean inType) {
        this.inType = inType;
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
     * 提交审核的人ID
     * @return submitAuditUserId 提交审核的人ID
     */
    public Integer getSubmitAuditUserId() {
        return submitAuditUserId;
    }

    /**
     * 提交审核的人ID
     * @param submitAuditUserId 提交审核的人ID
     */
    public void setSubmitAuditUserId(Integer submitAuditUserId) {
        this.submitAuditUserId = submitAuditUserId;
    }

    /**
     * 提交审核的人名称
     * @return submitAuditUserName 提交审核的人名称
     */
    public String getSubmitAuditUserName() {
        return submitAuditUserName;
    }

    /**
     * 提交审核的人名称
     * @param submitAuditUserName 提交审核的人名称
     */
    public void setSubmitAuditUserName(String submitAuditUserName) {
        this.submitAuditUserName = submitAuditUserName == null ? null : submitAuditUserName.trim();
    }

    /**
     * 提交审核时间
     * @return submitAuditTime 提交审核时间
     */
    public Date getSubmitAuditTime() {
        return submitAuditTime;
    }

    /**
     * 提交审核时间
     * @param submitAuditTime 提交审核时间
     */
    public void setSubmitAuditTime(Date submitAuditTime) {
        this.submitAuditTime = submitAuditTime;
    }

    /**
     * 审核人ID
     * @return auditUserId 审核人ID
     */
    public Integer getAuditUserId() {
        return auditUserId;
    }

    /**
     * 审核人ID
     * @param auditUserId 审核人ID
     */
    public void setAuditUserId(Integer auditUserId) {
        this.auditUserId = auditUserId;
    }

    /**
     * 审核人名称
     * @return auditUserName 审核人名称
     */
    public String getAuditUserName() {
        return auditUserName;
    }

    /**
     * 审核人名称
     * @param auditUserName 审核人名称
     */
    public void setAuditUserName(String auditUserName) {
        this.auditUserName = auditUserName == null ? null : auditUserName.trim();
    }

    /**
     * 审核时间，审核通过或驳回时间
     * @return auditTime 审核时间，审核通过或驳回时间
     */
    public String getAuditTime() {
        return auditTime;
    }

    /**
     * 审核时间，审核通过或驳回时间
     * @param auditTime 审核时间，审核通过或驳回时间
     */
    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime == null ? null : auditTime.trim();
    }

    /**
     * 审核备注信息
     * @return auditMsg 审核备注信息
     */
    public String getAuditMsg() {
        return auditMsg;
    }

    /**
     * 审核备注信息
     * @param auditMsg 审核备注信息
     */
    public void setAuditMsg(String auditMsg) {
        this.auditMsg = auditMsg == null ? null : auditMsg.trim();
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

    public List<BillPurchaseItem> getItemList()
    {
        return itemList;
    }

    public void setItemList(List<BillPurchaseItem> itemList)
    {
        this.itemList = itemList;
    }
}