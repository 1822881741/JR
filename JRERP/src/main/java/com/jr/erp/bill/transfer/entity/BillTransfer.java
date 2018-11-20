package com.jr.erp.bill.transfer.entity;

import com.jr.erp.base.mybatis.BaseEntity;
import java.util.Date;

public class BillTransfer extends BaseEntity {
    /**
     * 单号
     */
    private String billNo;

    /**
     * 进货在途状态：0：新建状态；10：待审核  15 ：审核驳回  20：待接受  25：接收驳回  100：全部完成
     */
    private Integer billStatus;

    /**
     * 系统单号
     */
    private String sysBillNo;

    /**
     * 调出地区
     */
    private String areaCode;

    /**
     *  
     */
    private String areaName;

    /**
     * 调出柜台
     */
    private Integer counterAreaCode;

    /**
     * 发出仓库名称
     */
    private String counterAreaName;

    /**
     * 调入地区
     */
    private String inAreaCode;

    /**
     *  
     */
    private String inAreaName;

    /**
     * 调入柜台
     */
    private Integer inCounterAreaCode;

    /**
     * 
     */
    private String cinCunterAreaName;

    /**
     * 建单人ID
     */
    private Integer createUserId;

    /**
     * 建单人名称
     */
    private String createUserName;

    /**
     * 业务员ID
     */
    private Integer employeeId;

    /**
     * 业务员名
     */
    private String employeeName;

    /**
     * 单据日期
     */
    private String billDate;

    /**
     * 接收时间：在途的调拨单的接收时间
     */
    private Date receiveTime;

    /**
     * 商品总件数
     */
    private Integer totalNum;

    /**
     * 总金重
     */
    private Double totalGoldWeight;

    /**
     * 总成本
     */
    private Double totalCostPrice;

    /**
     * 总标价金额
     */
    private Double totalSalePriceAmount;

    /**
     * 主石重
     */
    private Double totalMainStoneWeight;

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
     * 调出地区
     * @return areaCode 调出地区
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 调出地区
     * @param areaCode 调出地区
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     *  
     * @return areaName  
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     *  
     * @param areaName  
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * 调出柜台
     * @return counterAreaCode 调出柜台
     */
    public Integer getCounterAreaCode() {
        return counterAreaCode;
    }

    /**
     * 调出柜台
     * @param counterAreaCode 调出柜台
     */
    public void setCounterAreaCode(Integer counterAreaCode) {
        this.counterAreaCode = counterAreaCode;
    }

    /**
     * 发出仓库名称
     * @return counterAreaName 发出仓库名称
     */
    public String getCounterAreaName() {
        return counterAreaName;
    }

    /**
     * 发出仓库名称
     * @param counterAreaName 发出仓库名称
     */
    public void setCounterAreaName(String counterAreaName) {
        this.counterAreaName = counterAreaName == null ? null : counterAreaName.trim();
    }

    /**
     * 调入地区
     * @return inAreaCode 调入地区
     */
    public String getInAreaCode() {
        return inAreaCode;
    }

    /**
     * 调入地区
     * @param inAreaCode 调入地区
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
     * 调入柜台
     * @return inCounterAreaCode 调入柜台
     */
    public Integer getInCounterAreaCode() {
        return inCounterAreaCode;
    }

    /**
     * 调入柜台
     * @param inCounterAreaCode 调入柜台
     */
    public void setInCounterAreaCode(Integer inCounterAreaCode) {
        this.inCounterAreaCode = inCounterAreaCode;
    }

    /**
     * 
     * @return cinCunterAreaName 
     */
    public String getCinCunterAreaName() {
        return cinCunterAreaName;
    }

    /**
     * 
     * @param cinCunterAreaName 
     */
    public void setCinCunterAreaName(String cinCunterAreaName) {
        this.cinCunterAreaName = cinCunterAreaName == null ? null : cinCunterAreaName.trim();
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
     * 总金重
     * @return totalGoldWeight 总金重
     */
    public Double getTotalGoldWeight() {
        return totalGoldWeight;
    }

    /**
     * 总金重
     * @param totalGoldWeight 总金重
     */
    public void setTotalGoldWeight(Double totalGoldWeight) {
        this.totalGoldWeight = totalGoldWeight;
    }

    /**
     * 总成本
     * @return totalCostPrice 总成本
     */
    public Double getTotalCostPrice() {
        return totalCostPrice;
    }

    /**
     * 总成本
     * @param totalCostPrice 总成本
     */
    public void setTotalCostPrice(Double totalCostPrice) {
        this.totalCostPrice = totalCostPrice;
    }

    /**
     * 总标价金额
     * @return totalSalePriceAmount 总标价金额
     */
    public Double getTotalSalePriceAmount() {
        return totalSalePriceAmount;
    }

    /**
     * 总标价金额
     * @param totalSalePriceAmount 总标价金额
     */
    public void setTotalSalePriceAmount(Double totalSalePriceAmount) {
        this.totalSalePriceAmount = totalSalePriceAmount;
    }

    /**
     * 主石重
     * @return totalMainStoneWeight 主石重
     */
    public Double getTotalMainStoneWeight() {
        return totalMainStoneWeight;
    }

    /**
     * 主石重
     * @param totalMainStoneWeight 主石重
     */
    public void setTotalMainStoneWeight(Double totalMainStoneWeight) {
        this.totalMainStoneWeight = totalMainStoneWeight;
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
}