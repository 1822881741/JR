package com.jr.erp.bill.purchase.entity;

import java.util.Date;
import java.util.List;

import com.jr.erp.base.mybatis.BaseEntity;

public class BillPurchase extends BaseEntity {
    /**
     * 原始单号ID：旧料回收退货时，标记对应的收料单id
     */
    private Integer orgSheetId;

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
     * 客户电话：旧料单或旧饰回收才有
     */
    private String customerPhone;

    /**
     * 业务员ID
     */
    private Integer saleManId;

    /**
     * 业务员名
     */
    private String salesmanName;

    /**
     * 购销方式：从通用类型中选择：方式设置中
     */
    private String purchaseSaleMode;

    /**
     * 单据类型：1：进货；2:进货退回；3：收购：4：兑换.......
     */
    private Integer sheetType;

    /**
     * 部门地区码：公司节点或者门店节点的地区码（地区表）
     */
    private String deptAreaCode;

    /**
     *  部门地区名称：公司节点或者门店节点的地区名称（地区表）
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
     * 总金重
     */
    private Double totalGoldWeight;

    /**
     * 总成本金额
     */
    private Double costPrice;

    /**
     * 总标价金额
     */
    private Double totalSalePriceAmount;

    /**
     * 主石重：镶嵌类的才统计
     */
    private Double totalMainStoneWeight;

    /**
     * 单据日期：在保存单个商品时首次使用的是单的日期，在保存单的时候使用的是单的日期+当前时分秒
     */
    private String sheetDate;

    /**
     * 进货退货标记：1：进货；-1:退货
     */
    private Integer jtFlag;

    /**
     * 0未保存；1已经保存
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
     * 品牌名称
     */
    private String brandName;

    /**
     * 数据权限地域码
     */
    private String areaCode;

    /**
     * 是否是批量导入的单:0不是；1：是
     */
    private Boolean importFlag;

    /**
     * 进货在途状态：0：新建状态；1：在途；2：接收中；3：接收完成；4：整单打回
     */
    private Integer sheetStatus;

    /**
     * 接收时间：在途的调拨单的接收时间
     */
    private Date receiveTime;

    /**
     * 批次：进货在途单打回之后再次提交要区分不同的批次（更新流转记录时间的时候用得到）
     */
    private Integer piCi;

    /**
     * 数据生成时间
     */
    private Date createTime;

    /**
     * 是否供应商和日期混合入库
     */
    private Integer blendFlag;

    /**
     * 审核状态:0:默认初始值;10:无需审核直接过;11:审核中；12：审核通过；13：审核驳回
     */
    private Integer auditStatus;

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
    private Date auditTime;

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
     * 原始单号ID：旧料回收退货时，标记对应的收料单id
     * @return orgSheetId 原始单号ID：旧料回收退货时，标记对应的收料单id
     */
    public Integer getOrgSheetId() {
        return orgSheetId;
    }

    /**
     * 原始单号ID：旧料回收退货时，标记对应的收料单id
     * @param orgSheetId 原始单号ID：旧料回收退货时，标记对应的收料单id
     */
    public void setOrgSheetId(Integer orgSheetId) {
        this.orgSheetId = orgSheetId;
    }

    /**
     * 单号
     * @return sheetNo 单号
     */
    public String getSheetNo() {
        return sheetNo;
    }

    /**
     * 单号
     * @param sheetNo 单号
     */
    public void setSheetNo(String sheetNo) {
        this.sheetNo = sheetNo == null ? null : sheetNo.trim();
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
     * 客户电话：旧料单或旧饰回收才有
     * @return customerPhone 客户电话：旧料单或旧饰回收才有
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * 客户电话：旧料单或旧饰回收才有
     * @param customerPhone 客户电话：旧料单或旧饰回收才有
     */
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
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
     *  部门地区名称：公司节点或者门店节点的地区名称（地区表）
     * @return deptAreaName  部门地区名称：公司节点或者门店节点的地区名称（地区表）
     */
    public String getDeptAreaName() {
        return deptAreaName;
    }

    /**
     *  部门地区名称：公司节点或者门店节点的地区名称（地区表）
     * @param deptAreaName  部门地区名称：公司节点或者门店节点的地区名称（地区表）
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
     * 总成本金额
     * @return costPrice 总成本金额
     */
    public Double getCostPrice() {
        return costPrice;
    }

    /**
     * 总成本金额
     * @param costPrice 总成本金额
     */
    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
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
     * 主石重：镶嵌类的才统计
     * @return totalMainStoneWeight 主石重：镶嵌类的才统计
     */
    public Double getTotalMainStoneWeight() {
        return totalMainStoneWeight;
    }

    /**
     * 主石重：镶嵌类的才统计
     * @param totalMainStoneWeight 主石重：镶嵌类的才统计
     */
    public void setTotalMainStoneWeight(Double totalMainStoneWeight) {
        this.totalMainStoneWeight = totalMainStoneWeight;
    }

    /**
     * 单据日期：在保存单个商品时首次使用的是单的日期，在保存单的时候使用的是单的日期+当前时分秒
     * @return sheetDate 单据日期：在保存单个商品时首次使用的是单的日期，在保存单的时候使用的是单的日期+当前时分秒
     */
    public String getSheetDate() {
        return sheetDate;
    }

    /**
     * 单据日期：在保存单个商品时首次使用的是单的日期，在保存单的时候使用的是单的日期+当前时分秒
     * @param sheetDate 单据日期：在保存单个商品时首次使用的是单的日期，在保存单的时候使用的是单的日期+当前时分秒
     */
    public void setSheetDate(String sheetDate) {
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
     * 数据权限地域码
     * @return areaCode 数据权限地域码
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 数据权限地域码
     * @param areaCode 数据权限地域码
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * 是否是批量导入的单:0不是；1：是
     * @return importFlag 是否是批量导入的单:0不是；1：是
     */
    public Boolean getImportFlag() {
        return importFlag;
    }

    /**
     * 是否是批量导入的单:0不是；1：是
     * @param importFlag 是否是批量导入的单:0不是；1：是
     */
    public void setImportFlag(Boolean importFlag) {
        this.importFlag = importFlag;
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
     * 批次：进货在途单打回之后再次提交要区分不同的批次（更新流转记录时间的时候用得到）
     * @return piCi 批次：进货在途单打回之后再次提交要区分不同的批次（更新流转记录时间的时候用得到）
     */
    public Integer getPiCi() {
        return piCi;
    }

    /**
     * 批次：进货在途单打回之后再次提交要区分不同的批次（更新流转记录时间的时候用得到）
     * @param piCi 批次：进货在途单打回之后再次提交要区分不同的批次（更新流转记录时间的时候用得到）
     */
    public void setPiCi(Integer piCi) {
        this.piCi = piCi;
    }
    /**
     * 是否供应商和日期混合入库
     * @return blendFlag 是否供应商和日期混合入库
     */
    public Integer getBlendFlag() {
        return blendFlag;
    }

    /**
     * 是否供应商和日期混合入库
     * @param blendFlag 是否供应商和日期混合入库
     */
    public void setBlendFlag(Integer blendFlag) {
        this.blendFlag = blendFlag;
    }

    /**
     * 审核状态:0:默认初始值;10:无需审核直接过;11:审核中；12：审核通过；13：审核驳回
     * @return auditStatus 审核状态:0:默认初始值;10:无需审核直接过;11:审核中；12：审核通过；13：审核驳回
     */
    public Integer getAuditStatus() {
        return auditStatus;
    }

    /**
     * 审核状态:0:默认初始值;10:无需审核直接过;11:审核中；12：审核通过；13：审核驳回
     * @param auditStatus 审核状态:0:默认初始值;10:无需审核直接过;11:审核中；12：审核通过；13：审核驳回
     */
    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
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
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * 审核时间，审核通过或驳回时间
     * @param auditTime 审核时间，审核通过或驳回时间
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
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