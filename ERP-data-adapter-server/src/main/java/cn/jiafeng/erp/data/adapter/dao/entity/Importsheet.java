package cn.jiafeng.erp.data.adapter.dao.entity;

import java.util.Date;

/**
 * 入库单 实体类
 * 
 * @author 
 * @date 2018-11-12
 */
public class Importsheet implements java.io.Serializable{

    /**
     * 序列化版本号
     */
    
    /**
     * 自增主键 
     */
    private Integer id;

    /**
     * 原始单号ID：旧料回收退货时，标记对应的收料单id 
     */
    private Integer orgSheetId;

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
    private Boolean sheetType;

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
    private Date sheetDate;

    /**
     * 备注 
     */
    private String remarks;

    /**
     * 进货退货标记：1：进货；-1:退货 
     */
    private Boolean jtFlag;

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


    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return this.id;
    }
    

    public void setOrgSheetId(Integer orgSheetId) {
        this.orgSheetId = orgSheetId;
    }
    
    public Integer getOrgSheetId() {
        return this.orgSheetId;
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
    

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }
    
    public Integer getCreateUserId() {
        return this.createUserId;
    }
    

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }
    
    public String getCreateUserName() {
        return this.createUserName;
    }
    

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }
    
    public Integer getTotalNum() {
        return this.totalNum;
    }
    

    public void setTotalGoldWeight(Double totalGoldWeight) {
        this.totalGoldWeight = totalGoldWeight;
    }
    
    public Double getTotalGoldWeight() {
        return this.totalGoldWeight;
    }
    

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }
    
    public Double getCostPrice() {
        return this.costPrice;
    }
    

    public void setTotalSalePriceAmount(Double totalSalePriceAmount) {
        this.totalSalePriceAmount = totalSalePriceAmount;
    }
    
    public Double getTotalSalePriceAmount() {
        return this.totalSalePriceAmount;
    }
    

    public void setTotalMainStoneWeight(Double totalMainStoneWeight) {
        this.totalMainStoneWeight = totalMainStoneWeight;
    }
    
    public Double getTotalMainStoneWeight() {
        return this.totalMainStoneWeight;
    }
    

    public void setSheetDate(Date sheetDate) {
        this.sheetDate = sheetDate;
    }
    
    public Date getSheetDate() {
        return this.sheetDate;
    }
    

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    public String getRemarks() {
        return this.remarks;
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
    

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    
    public String getBrandName() {
        return this.brandName;
    }
    

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    
    public String getAreaCode() {
        return this.areaCode;
    }
    

    public void setImportFlag(Boolean importFlag) {
        this.importFlag = importFlag;
    }
    
    public Boolean getImportFlag() {
        return this.importFlag;
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
    

    public void setPiCi(Integer piCi) {
        this.piCi = piCi;
    }
    
    public Integer getPiCi() {
        return this.piCi;
    }
    

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public Date getCreateTime() {
        return this.createTime;
    }
    

    public void setBlendFlag(Integer blendFlag) {
        this.blendFlag = blendFlag;
    }
    
    public Integer getBlendFlag() {
        return this.blendFlag;
    }
    

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }
    
    public Integer getAuditStatus() {
        return this.auditStatus;
    }
    

    public void setSubmitAuditUserId(Integer submitAuditUserId) {
        this.submitAuditUserId = submitAuditUserId;
    }
    
    public Integer getSubmitAuditUserId() {
        return this.submitAuditUserId;
    }
    

    public void setSubmitAuditUserName(String submitAuditUserName) {
        this.submitAuditUserName = submitAuditUserName;
    }
    
    public String getSubmitAuditUserName() {
        return this.submitAuditUserName;
    }
    

    public void setSubmitAuditTime(Date submitAuditTime) {
        this.submitAuditTime = submitAuditTime;
    }
    
    public Date getSubmitAuditTime() {
        return this.submitAuditTime;
    }
    

    public void setAuditUserId(Integer auditUserId) {
        this.auditUserId = auditUserId;
    }
    
    public Integer getAuditUserId() {
        return this.auditUserId;
    }
    

    public void setAuditUserName(String auditUserName) {
        this.auditUserName = auditUserName;
    }
    
    public String getAuditUserName() {
        return this.auditUserName;
    }
    

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }
    
    public Date getAuditTime() {
        return this.auditTime;
    }
    

    public void setAuditMsg(String auditMsg) {
        this.auditMsg = auditMsg;
    }
    
    public String getAuditMsg() {
        return this.auditMsg;
    }
    

}
