package com.jr.erp.bill.stocktake.entity;

import com.jr.erp.base.mybatis.BaseEntity;

public class BillStocktake extends BaseEntity {
    /**
     * 单号
     */
    private String billNo;

    /**
     * 
     */
    private String sysBillNo;

    /**
     * 单据日期：使用创建单子的日期
     */
    private String billDate;

    /**
     * 门店
     */
    private String areaCode;

    /**
     * 门店名称
     */
    private String areaName;

    /**
     * 是否能查看所有待盘点 1：可以 ，0不可以
     */
    private Integer canViewAll;

    /**
     * 柜台地区码，多个
     */
    private String counterAreaCode;

    /**
     * 柜台地区码列表，多个
     */
    private String counterAreaName;

    /**
     * 商品名称：商品档案中的名称(多个以‘,’分隔)
     */
    private String productName;

    /**
     * 指定人员盘点：0：不指定；1：指定盘点人
     */
    private Integer assignTaker;

    /**
     * 应盘数量
     */
    private Integer bookNum;

    /**
     * 盘点数量
     */
    private Integer checkNum;

    /**
     * 0：新建状态；10：待审核  30:盘点中  100：全部完成
     */
    private Integer billStatus;

    /**
     * 建单人ID
     */
    private Integer createUserId;

    /**
     * 建单人名称
     */
    private String createUserName;

    /**
     * 结束盘点时间
     */
    private String finishTime;

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
     * 单据日期：使用创建单子的日期
     * @return billDate 单据日期：使用创建单子的日期
     */
    public String getBillDate() {
        return billDate;
    }

    /**
     * 单据日期：使用创建单子的日期
     * @param billDate 单据日期：使用创建单子的日期
     */
    public void setBillDate(String billDate) {
        this.billDate = billDate == null ? null : billDate.trim();
    }

    /**
     * 门店
     * @return areaCode 门店
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 门店
     * @param areaCode 门店
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * 门店名称
     * @return areaName 门店名称
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 门店名称
     * @param areaName 门店名称
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * 是否能查看所有待盘点 1：可以 ，0不可以
     * @return canViewAll 是否能查看所有待盘点 1：可以 ，0不可以
     */
    public Integer getCanViewAll() {
        return canViewAll;
    }

    /**
     * 是否能查看所有待盘点 1：可以 ，0不可以
     * @param canViewAll 是否能查看所有待盘点 1：可以 ，0不可以
     */
    public void setCanViewAll(Integer canViewAll) {
        this.canViewAll = canViewAll;
    }

    /**
     * 柜台地区码，多个
     * @return counterAreaCode 柜台地区码，多个
     */
    public String getCounterAreaCode() {
        return counterAreaCode;
    }

    /**
     * 柜台地区码，多个
     * @param counterAreaCode 柜台地区码，多个
     */
    public void setCounterAreaCode(String counterAreaCode) {
        this.counterAreaCode = counterAreaCode == null ? null : counterAreaCode.trim();
    }

    /**
     * 柜台地区码列表，多个
     * @return counterAreaName 柜台地区码列表，多个
     */
    public String getCounterAreaName() {
        return counterAreaName;
    }

    /**
     * 柜台地区码列表，多个
     * @param counterAreaName 柜台地区码列表，多个
     */
    public void setCounterAreaName(String counterAreaName) {
        this.counterAreaName = counterAreaName == null ? null : counterAreaName.trim();
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

    /**
     * 指定人员盘点：0：不指定；1：指定盘点人
     * @return assignTaker 指定人员盘点：0：不指定；1：指定盘点人
     */
    public Integer getAssignTaker() {
        return assignTaker;
    }

    /**
     * 指定人员盘点：0：不指定；1：指定盘点人
     * @param assignTaker 指定人员盘点：0：不指定；1：指定盘点人
     */
    public void setAssignTaker(Integer assignTaker) {
        this.assignTaker = assignTaker;
    }

    /**
     * 应盘数量
     * @return bookNum 应盘数量
     */
    public Integer getBookNum() {
        return bookNum;
    }

    /**
     * 应盘数量
     * @param bookNum 应盘数量
     */
    public void setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }

    /**
     * 盘点数量
     * @return checkNum 盘点数量
     */
    public Integer getCheckNum() {
        return checkNum;
    }

    /**
     * 盘点数量
     * @param checkNum 盘点数量
     */
    public void setCheckNum(Integer checkNum) {
        this.checkNum = checkNum;
    }

    /**
     * 0：新建状态；10：待审核  30:盘点中  100：全部完成
     * @return billStatus 0：新建状态；10：待审核  30:盘点中  100：全部完成
     */
    public Integer getBillStatus() {
        return billStatus;
    }

    /**
     * 0：新建状态；10：待审核  30:盘点中  100：全部完成
     * @param billStatus 0：新建状态；10：待审核  30:盘点中  100：全部完成
     */
    public void setBillStatus(Integer billStatus) {
        this.billStatus = billStatus;
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
     * 结束盘点时间
     * @return finishTime 结束盘点时间
     */
    public String getFinishTime() {
        return finishTime;
    }

    /**
     * 结束盘点时间
     * @param finishTime 结束盘点时间
     */
    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime == null ? null : finishTime.trim();
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