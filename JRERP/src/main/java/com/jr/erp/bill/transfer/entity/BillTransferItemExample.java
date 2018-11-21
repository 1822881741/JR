package com.jr.erp.bill.transfer.entity;

import com.jr.erp.base.mybatis.BaseExample;
import java.util.ArrayList;
import java.util.List;

public class BillTransferItemExample extends BaseExample {
    /**
     * bill_transfer_item
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public BillTransferItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * bill_transfer_item null
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompanyNoIsNull() {
            addCriterion("companyNo is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNoIsNotNull() {
            addCriterion("companyNo is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNoEqualTo(String value) {
            addCriterion("companyNo =", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoNotEqualTo(String value) {
            addCriterion("companyNo <>", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoGreaterThan(String value) {
            addCriterion("companyNo >", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoGreaterThanOrEqualTo(String value) {
            addCriterion("companyNo >=", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoLessThan(String value) {
            addCriterion("companyNo <", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoLessThanOrEqualTo(String value) {
            addCriterion("companyNo <=", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoLike(String value) {
            addCriterion("companyNo like", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoNotLike(String value) {
            addCriterion("companyNo not like", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoIn(List<String> values) {
            addCriterion("companyNo in", values, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoNotIn(List<String> values) {
            addCriterion("companyNo not in", values, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoBetween(String value1, String value2) {
            addCriterion("companyNo between", value1, value2, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoNotBetween(String value1, String value2) {
            addCriterion("companyNo not between", value1, value2, "companyNo");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNull() {
            addCriterion("billId is null");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("billId is not null");
            return (Criteria) this;
        }

        public Criteria andBillIdEqualTo(Integer value) {
            addCriterion("billId =", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotEqualTo(Integer value) {
            addCriterion("billId <>", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThan(Integer value) {
            addCriterion("billId >", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("billId >=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThan(Integer value) {
            addCriterion("billId <", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThanOrEqualTo(Integer value) {
            addCriterion("billId <=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdIn(List<Integer> values) {
            addCriterion("billId in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotIn(List<Integer> values) {
            addCriterion("billId not in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdBetween(Integer value1, Integer value2) {
            addCriterion("billId between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("billId not between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillNoIsNull() {
            addCriterion("billNo is null");
            return (Criteria) this;
        }

        public Criteria andBillNoIsNotNull() {
            addCriterion("billNo is not null");
            return (Criteria) this;
        }

        public Criteria andBillNoEqualTo(String value) {
            addCriterion("billNo =", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotEqualTo(String value) {
            addCriterion("billNo <>", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThan(String value) {
            addCriterion("billNo >", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThanOrEqualTo(String value) {
            addCriterion("billNo >=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThan(String value) {
            addCriterion("billNo <", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThanOrEqualTo(String value) {
            addCriterion("billNo <=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLike(String value) {
            addCriterion("billNo like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotLike(String value) {
            addCriterion("billNo not like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoIn(List<String> values) {
            addCriterion("billNo in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotIn(List<String> values) {
            addCriterion("billNo not in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoBetween(String value1, String value2) {
            addCriterion("billNo between", value1, value2, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotBetween(String value1, String value2) {
            addCriterion("billNo not between", value1, value2, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNull() {
            addCriterion("billType is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("billType is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(Integer value) {
            addCriterion("billType =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(Integer value) {
            addCriterion("billType <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(Integer value) {
            addCriterion("billType >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("billType >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(Integer value) {
            addCriterion("billType <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(Integer value) {
            addCriterion("billType <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<Integer> values) {
            addCriterion("billType in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<Integer> values) {
            addCriterion("billType not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(Integer value1, Integer value2) {
            addCriterion("billType between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("billType not between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNull() {
            addCriterion("billStatus is null");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNotNull() {
            addCriterion("billStatus is not null");
            return (Criteria) this;
        }

        public Criteria andBillStatusEqualTo(Integer value) {
            addCriterion("billStatus =", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotEqualTo(Integer value) {
            addCriterion("billStatus <>", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThan(Integer value) {
            addCriterion("billStatus >", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("billStatus >=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThan(Integer value) {
            addCriterion("billStatus <", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThanOrEqualTo(Integer value) {
            addCriterion("billStatus <=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusIn(List<Integer> values) {
            addCriterion("billStatus in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotIn(List<Integer> values) {
            addCriterion("billStatus not in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusBetween(Integer value1, Integer value2) {
            addCriterion("billStatus between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("billStatus not between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillDateIsNull() {
            addCriterion("billDate is null");
            return (Criteria) this;
        }

        public Criteria andBillDateIsNotNull() {
            addCriterion("billDate is not null");
            return (Criteria) this;
        }

        public Criteria andBillDateEqualTo(String value) {
            addCriterion("billDate =", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotEqualTo(String value) {
            addCriterion("billDate <>", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateGreaterThan(String value) {
            addCriterion("billDate >", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateGreaterThanOrEqualTo(String value) {
            addCriterion("billDate >=", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLessThan(String value) {
            addCriterion("billDate <", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLessThanOrEqualTo(String value) {
            addCriterion("billDate <=", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLike(String value) {
            addCriterion("billDate like", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotLike(String value) {
            addCriterion("billDate not like", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateIn(List<String> values) {
            addCriterion("billDate in", values, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotIn(List<String> values) {
            addCriterion("billDate not in", values, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateBetween(String value1, String value2) {
            addCriterion("billDate between", value1, value2, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotBetween(String value1, String value2) {
            addCriterion("billDate not between", value1, value2, "billDate");
            return (Criteria) this;
        }

        public Criteria andSysBillNoIsNull() {
            addCriterion("sysBillNo is null");
            return (Criteria) this;
        }

        public Criteria andSysBillNoIsNotNull() {
            addCriterion("sysBillNo is not null");
            return (Criteria) this;
        }

        public Criteria andSysBillNoEqualTo(String value) {
            addCriterion("sysBillNo =", value, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoNotEqualTo(String value) {
            addCriterion("sysBillNo <>", value, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoGreaterThan(String value) {
            addCriterion("sysBillNo >", value, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoGreaterThanOrEqualTo(String value) {
            addCriterion("sysBillNo >=", value, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoLessThan(String value) {
            addCriterion("sysBillNo <", value, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoLessThanOrEqualTo(String value) {
            addCriterion("sysBillNo <=", value, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoLike(String value) {
            addCriterion("sysBillNo like", value, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoNotLike(String value) {
            addCriterion("sysBillNo not like", value, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoIn(List<String> values) {
            addCriterion("sysBillNo in", values, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoNotIn(List<String> values) {
            addCriterion("sysBillNo not in", values, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoBetween(String value1, String value2) {
            addCriterion("sysBillNo between", value1, value2, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoNotBetween(String value1, String value2) {
            addCriterion("sysBillNo not between", value1, value2, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brandName is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brandName is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brandName =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brandName <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brandName >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brandName >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brandName <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brandName <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brandName like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brandName not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brandName in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brandName not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brandName between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brandName not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("barcode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("barcode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("barcode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barcode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barcode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barcode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("barcode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barcode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("barcode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("barcode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("barcode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("barcode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barcode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barcode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andOldBarcodeIsNull() {
            addCriterion("oldBarcode is null");
            return (Criteria) this;
        }

        public Criteria andOldBarcodeIsNotNull() {
            addCriterion("oldBarcode is not null");
            return (Criteria) this;
        }

        public Criteria andOldBarcodeEqualTo(String value) {
            addCriterion("oldBarcode =", value, "oldBarcode");
            return (Criteria) this;
        }

        public Criteria andOldBarcodeNotEqualTo(String value) {
            addCriterion("oldBarcode <>", value, "oldBarcode");
            return (Criteria) this;
        }

        public Criteria andOldBarcodeGreaterThan(String value) {
            addCriterion("oldBarcode >", value, "oldBarcode");
            return (Criteria) this;
        }

        public Criteria andOldBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("oldBarcode >=", value, "oldBarcode");
            return (Criteria) this;
        }

        public Criteria andOldBarcodeLessThan(String value) {
            addCriterion("oldBarcode <", value, "oldBarcode");
            return (Criteria) this;
        }

        public Criteria andOldBarcodeLessThanOrEqualTo(String value) {
            addCriterion("oldBarcode <=", value, "oldBarcode");
            return (Criteria) this;
        }

        public Criteria andOldBarcodeLike(String value) {
            addCriterion("oldBarcode like", value, "oldBarcode");
            return (Criteria) this;
        }

        public Criteria andOldBarcodeNotLike(String value) {
            addCriterion("oldBarcode not like", value, "oldBarcode");
            return (Criteria) this;
        }

        public Criteria andOldBarcodeIn(List<String> values) {
            addCriterion("oldBarcode in", values, "oldBarcode");
            return (Criteria) this;
        }

        public Criteria andOldBarcodeNotIn(List<String> values) {
            addCriterion("oldBarcode not in", values, "oldBarcode");
            return (Criteria) this;
        }

        public Criteria andOldBarcodeBetween(String value1, String value2) {
            addCriterion("oldBarcode between", value1, value2, "oldBarcode");
            return (Criteria) this;
        }

        public Criteria andOldBarcodeNotBetween(String value1, String value2) {
            addCriterion("oldBarcode not between", value1, value2, "oldBarcode");
            return (Criteria) this;
        }

        public Criteria andSubNameIsNull() {
            addCriterion("subName is null");
            return (Criteria) this;
        }

        public Criteria andSubNameIsNotNull() {
            addCriterion("subName is not null");
            return (Criteria) this;
        }

        public Criteria andSubNameEqualTo(String value) {
            addCriterion("subName =", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotEqualTo(String value) {
            addCriterion("subName <>", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameGreaterThan(String value) {
            addCriterion("subName >", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameGreaterThanOrEqualTo(String value) {
            addCriterion("subName >=", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLessThan(String value) {
            addCriterion("subName <", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLessThanOrEqualTo(String value) {
            addCriterion("subName <=", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLike(String value) {
            addCriterion("subName like", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotLike(String value) {
            addCriterion("subName not like", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameIn(List<String> values) {
            addCriterion("subName in", values, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotIn(List<String> values) {
            addCriterion("subName not in", values, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameBetween(String value1, String value2) {
            addCriterion("subName between", value1, value2, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotBetween(String value1, String value2) {
            addCriterion("subName not between", value1, value2, "subName");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIsNull() {
            addCriterion("certificateNo is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIsNotNull() {
            addCriterion("certificateNo is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoEqualTo(String value) {
            addCriterion("certificateNo =", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotEqualTo(String value) {
            addCriterion("certificateNo <>", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThan(String value) {
            addCriterion("certificateNo >", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThanOrEqualTo(String value) {
            addCriterion("certificateNo >=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThan(String value) {
            addCriterion("certificateNo <", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThanOrEqualTo(String value) {
            addCriterion("certificateNo <=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLike(String value) {
            addCriterion("certificateNo like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotLike(String value) {
            addCriterion("certificateNo not like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIn(List<String> values) {
            addCriterion("certificateNo in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotIn(List<String> values) {
            addCriterion("certificateNo not in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoBetween(String value1, String value2) {
            addCriterion("certificateNo between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotBetween(String value1, String value2) {
            addCriterion("certificateNo not between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andGiaCertificateNoIsNull() {
            addCriterion("giaCertificateNo is null");
            return (Criteria) this;
        }

        public Criteria andGiaCertificateNoIsNotNull() {
            addCriterion("giaCertificateNo is not null");
            return (Criteria) this;
        }

        public Criteria andGiaCertificateNoEqualTo(String value) {
            addCriterion("giaCertificateNo =", value, "giaCertificateNo");
            return (Criteria) this;
        }

        public Criteria andGiaCertificateNoNotEqualTo(String value) {
            addCriterion("giaCertificateNo <>", value, "giaCertificateNo");
            return (Criteria) this;
        }

        public Criteria andGiaCertificateNoGreaterThan(String value) {
            addCriterion("giaCertificateNo >", value, "giaCertificateNo");
            return (Criteria) this;
        }

        public Criteria andGiaCertificateNoGreaterThanOrEqualTo(String value) {
            addCriterion("giaCertificateNo >=", value, "giaCertificateNo");
            return (Criteria) this;
        }

        public Criteria andGiaCertificateNoLessThan(String value) {
            addCriterion("giaCertificateNo <", value, "giaCertificateNo");
            return (Criteria) this;
        }

        public Criteria andGiaCertificateNoLessThanOrEqualTo(String value) {
            addCriterion("giaCertificateNo <=", value, "giaCertificateNo");
            return (Criteria) this;
        }

        public Criteria andGiaCertificateNoLike(String value) {
            addCriterion("giaCertificateNo like", value, "giaCertificateNo");
            return (Criteria) this;
        }

        public Criteria andGiaCertificateNoNotLike(String value) {
            addCriterion("giaCertificateNo not like", value, "giaCertificateNo");
            return (Criteria) this;
        }

        public Criteria andGiaCertificateNoIn(List<String> values) {
            addCriterion("giaCertificateNo in", values, "giaCertificateNo");
            return (Criteria) this;
        }

        public Criteria andGiaCertificateNoNotIn(List<String> values) {
            addCriterion("giaCertificateNo not in", values, "giaCertificateNo");
            return (Criteria) this;
        }

        public Criteria andGiaCertificateNoBetween(String value1, String value2) {
            addCriterion("giaCertificateNo between", value1, value2, "giaCertificateNo");
            return (Criteria) this;
        }

        public Criteria andGiaCertificateNoNotBetween(String value1, String value2) {
            addCriterion("giaCertificateNo not between", value1, value2, "giaCertificateNo");
            return (Criteria) this;
        }

        public Criteria andStyleIsNull() {
            addCriterion("style is null");
            return (Criteria) this;
        }

        public Criteria andStyleIsNotNull() {
            addCriterion("style is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEqualTo(String value) {
            addCriterion("style =", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotEqualTo(String value) {
            addCriterion("style <>", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThan(String value) {
            addCriterion("style >", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThanOrEqualTo(String value) {
            addCriterion("style >=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThan(String value) {
            addCriterion("style <", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThanOrEqualTo(String value) {
            addCriterion("style <=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLike(String value) {
            addCriterion("style like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotLike(String value) {
            addCriterion("style not like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleIn(List<String> values) {
            addCriterion("style in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotIn(List<String> values) {
            addCriterion("style not in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleBetween(String value1, String value2) {
            addCriterion("style between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotBetween(String value1, String value2) {
            addCriterion("style not between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andComStyleNoIsNull() {
            addCriterion("comStyleNo is null");
            return (Criteria) this;
        }

        public Criteria andComStyleNoIsNotNull() {
            addCriterion("comStyleNo is not null");
            return (Criteria) this;
        }

        public Criteria andComStyleNoEqualTo(String value) {
            addCriterion("comStyleNo =", value, "comStyleNo");
            return (Criteria) this;
        }

        public Criteria andComStyleNoNotEqualTo(String value) {
            addCriterion("comStyleNo <>", value, "comStyleNo");
            return (Criteria) this;
        }

        public Criteria andComStyleNoGreaterThan(String value) {
            addCriterion("comStyleNo >", value, "comStyleNo");
            return (Criteria) this;
        }

        public Criteria andComStyleNoGreaterThanOrEqualTo(String value) {
            addCriterion("comStyleNo >=", value, "comStyleNo");
            return (Criteria) this;
        }

        public Criteria andComStyleNoLessThan(String value) {
            addCriterion("comStyleNo <", value, "comStyleNo");
            return (Criteria) this;
        }

        public Criteria andComStyleNoLessThanOrEqualTo(String value) {
            addCriterion("comStyleNo <=", value, "comStyleNo");
            return (Criteria) this;
        }

        public Criteria andComStyleNoLike(String value) {
            addCriterion("comStyleNo like", value, "comStyleNo");
            return (Criteria) this;
        }

        public Criteria andComStyleNoNotLike(String value) {
            addCriterion("comStyleNo not like", value, "comStyleNo");
            return (Criteria) this;
        }

        public Criteria andComStyleNoIn(List<String> values) {
            addCriterion("comStyleNo in", values, "comStyleNo");
            return (Criteria) this;
        }

        public Criteria andComStyleNoNotIn(List<String> values) {
            addCriterion("comStyleNo not in", values, "comStyleNo");
            return (Criteria) this;
        }

        public Criteria andComStyleNoBetween(String value1, String value2) {
            addCriterion("comStyleNo between", value1, value2, "comStyleNo");
            return (Criteria) this;
        }

        public Criteria andComStyleNoNotBetween(String value1, String value2) {
            addCriterion("comStyleNo not between", value1, value2, "comStyleNo");
            return (Criteria) this;
        }

        public Criteria andFacStyleNoIsNull() {
            addCriterion("facStyleNo is null");
            return (Criteria) this;
        }

        public Criteria andFacStyleNoIsNotNull() {
            addCriterion("facStyleNo is not null");
            return (Criteria) this;
        }

        public Criteria andFacStyleNoEqualTo(String value) {
            addCriterion("facStyleNo =", value, "facStyleNo");
            return (Criteria) this;
        }

        public Criteria andFacStyleNoNotEqualTo(String value) {
            addCriterion("facStyleNo <>", value, "facStyleNo");
            return (Criteria) this;
        }

        public Criteria andFacStyleNoGreaterThan(String value) {
            addCriterion("facStyleNo >", value, "facStyleNo");
            return (Criteria) this;
        }

        public Criteria andFacStyleNoGreaterThanOrEqualTo(String value) {
            addCriterion("facStyleNo >=", value, "facStyleNo");
            return (Criteria) this;
        }

        public Criteria andFacStyleNoLessThan(String value) {
            addCriterion("facStyleNo <", value, "facStyleNo");
            return (Criteria) this;
        }

        public Criteria andFacStyleNoLessThanOrEqualTo(String value) {
            addCriterion("facStyleNo <=", value, "facStyleNo");
            return (Criteria) this;
        }

        public Criteria andFacStyleNoLike(String value) {
            addCriterion("facStyleNo like", value, "facStyleNo");
            return (Criteria) this;
        }

        public Criteria andFacStyleNoNotLike(String value) {
            addCriterion("facStyleNo not like", value, "facStyleNo");
            return (Criteria) this;
        }

        public Criteria andFacStyleNoIn(List<String> values) {
            addCriterion("facStyleNo in", values, "facStyleNo");
            return (Criteria) this;
        }

        public Criteria andFacStyleNoNotIn(List<String> values) {
            addCriterion("facStyleNo not in", values, "facStyleNo");
            return (Criteria) this;
        }

        public Criteria andFacStyleNoBetween(String value1, String value2) {
            addCriterion("facStyleNo between", value1, value2, "facStyleNo");
            return (Criteria) this;
        }

        public Criteria andFacStyleNoNotBetween(String value1, String value2) {
            addCriterion("facStyleNo not between", value1, value2, "facStyleNo");
            return (Criteria) this;
        }

        public Criteria andHandInchIsNull() {
            addCriterion("handInch is null");
            return (Criteria) this;
        }

        public Criteria andHandInchIsNotNull() {
            addCriterion("handInch is not null");
            return (Criteria) this;
        }

        public Criteria andHandInchEqualTo(String value) {
            addCriterion("handInch =", value, "handInch");
            return (Criteria) this;
        }

        public Criteria andHandInchNotEqualTo(String value) {
            addCriterion("handInch <>", value, "handInch");
            return (Criteria) this;
        }

        public Criteria andHandInchGreaterThan(String value) {
            addCriterion("handInch >", value, "handInch");
            return (Criteria) this;
        }

        public Criteria andHandInchGreaterThanOrEqualTo(String value) {
            addCriterion("handInch >=", value, "handInch");
            return (Criteria) this;
        }

        public Criteria andHandInchLessThan(String value) {
            addCriterion("handInch <", value, "handInch");
            return (Criteria) this;
        }

        public Criteria andHandInchLessThanOrEqualTo(String value) {
            addCriterion("handInch <=", value, "handInch");
            return (Criteria) this;
        }

        public Criteria andHandInchLike(String value) {
            addCriterion("handInch like", value, "handInch");
            return (Criteria) this;
        }

        public Criteria andHandInchNotLike(String value) {
            addCriterion("handInch not like", value, "handInch");
            return (Criteria) this;
        }

        public Criteria andHandInchIn(List<String> values) {
            addCriterion("handInch in", values, "handInch");
            return (Criteria) this;
        }

        public Criteria andHandInchNotIn(List<String> values) {
            addCriterion("handInch not in", values, "handInch");
            return (Criteria) this;
        }

        public Criteria andHandInchBetween(String value1, String value2) {
            addCriterion("handInch between", value1, value2, "handInch");
            return (Criteria) this;
        }

        public Criteria andHandInchNotBetween(String value1, String value2) {
            addCriterion("handInch not between", value1, value2, "handInch");
            return (Criteria) this;
        }

        public Criteria andCraftIsNull() {
            addCriterion("craft is null");
            return (Criteria) this;
        }

        public Criteria andCraftIsNotNull() {
            addCriterion("craft is not null");
            return (Criteria) this;
        }

        public Criteria andCraftEqualTo(String value) {
            addCriterion("craft =", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftNotEqualTo(String value) {
            addCriterion("craft <>", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftGreaterThan(String value) {
            addCriterion("craft >", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftGreaterThanOrEqualTo(String value) {
            addCriterion("craft >=", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftLessThan(String value) {
            addCriterion("craft <", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftLessThanOrEqualTo(String value) {
            addCriterion("craft <=", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftLike(String value) {
            addCriterion("craft like", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftNotLike(String value) {
            addCriterion("craft not like", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftIn(List<String> values) {
            addCriterion("craft in", values, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftNotIn(List<String> values) {
            addCriterion("craft not in", values, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftBetween(String value1, String value2) {
            addCriterion("craft between", value1, value2, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftNotBetween(String value1, String value2) {
            addCriterion("craft not between", value1, value2, "craft");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("custName is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("custName is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("custName =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("custName <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("custName >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("custName >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("custName <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("custName <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("custName like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("custName not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("custName in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("custName not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("custName between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("custName not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustMobileIsNull() {
            addCriterion("custMobile is null");
            return (Criteria) this;
        }

        public Criteria andCustMobileIsNotNull() {
            addCriterion("custMobile is not null");
            return (Criteria) this;
        }

        public Criteria andCustMobileEqualTo(String value) {
            addCriterion("custMobile =", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileNotEqualTo(String value) {
            addCriterion("custMobile <>", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileGreaterThan(String value) {
            addCriterion("custMobile >", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileGreaterThanOrEqualTo(String value) {
            addCriterion("custMobile >=", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileLessThan(String value) {
            addCriterion("custMobile <", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileLessThanOrEqualTo(String value) {
            addCriterion("custMobile <=", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileLike(String value) {
            addCriterion("custMobile like", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileNotLike(String value) {
            addCriterion("custMobile not like", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileIn(List<String> values) {
            addCriterion("custMobile in", values, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileNotIn(List<String> values) {
            addCriterion("custMobile not in", values, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileBetween(String value1, String value2) {
            addCriterion("custMobile between", value1, value2, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileNotBetween(String value1, String value2) {
            addCriterion("custMobile not between", value1, value2, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("createUserId is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("createUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Integer value) {
            addCriterion("createUserId =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Integer value) {
            addCriterion("createUserId <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Integer value) {
            addCriterion("createUserId >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("createUserId >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Integer value) {
            addCriterion("createUserId <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("createUserId <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Integer> values) {
            addCriterion("createUserId in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Integer> values) {
            addCriterion("createUserId not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("createUserId between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("createUserId not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNull() {
            addCriterion("createUserName is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNotNull() {
            addCriterion("createUserName is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameEqualTo(String value) {
            addCriterion("createUserName =", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotEqualTo(String value) {
            addCriterion("createUserName <>", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThan(String value) {
            addCriterion("createUserName >", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("createUserName >=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThan(String value) {
            addCriterion("createUserName <", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThanOrEqualTo(String value) {
            addCriterion("createUserName <=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLike(String value) {
            addCriterion("createUserName like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotLike(String value) {
            addCriterion("createUserName not like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIn(List<String> values) {
            addCriterion("createUserName in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotIn(List<String> values) {
            addCriterion("createUserName not in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameBetween(String value1, String value2) {
            addCriterion("createUserName between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotBetween(String value1, String value2) {
            addCriterion("createUserName not between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("areaCode is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("areaCode is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("areaCode =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("areaCode <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("areaCode >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("areaCode >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("areaCode <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("areaCode <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("areaCode like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("areaCode not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("areaCode in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("areaCode not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("areaCode between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("areaCode not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("areaName is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("areaName is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("areaName =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("areaName <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("areaName >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("areaName >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("areaName <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("areaName <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("areaName like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("areaName not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("areaName in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("areaName not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("areaName between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("areaName not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andCounterAreaCodeIsNull() {
            addCriterion("counterAreaCode is null");
            return (Criteria) this;
        }

        public Criteria andCounterAreaCodeIsNotNull() {
            addCriterion("counterAreaCode is not null");
            return (Criteria) this;
        }

        public Criteria andCounterAreaCodeEqualTo(String value) {
            addCriterion("counterAreaCode =", value, "counterAreaCode");
            return (Criteria) this;
        }

        public Criteria andCounterAreaCodeNotEqualTo(String value) {
            addCriterion("counterAreaCode <>", value, "counterAreaCode");
            return (Criteria) this;
        }

        public Criteria andCounterAreaCodeGreaterThan(String value) {
            addCriterion("counterAreaCode >", value, "counterAreaCode");
            return (Criteria) this;
        }

        public Criteria andCounterAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("counterAreaCode >=", value, "counterAreaCode");
            return (Criteria) this;
        }

        public Criteria andCounterAreaCodeLessThan(String value) {
            addCriterion("counterAreaCode <", value, "counterAreaCode");
            return (Criteria) this;
        }

        public Criteria andCounterAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("counterAreaCode <=", value, "counterAreaCode");
            return (Criteria) this;
        }

        public Criteria andCounterAreaCodeLike(String value) {
            addCriterion("counterAreaCode like", value, "counterAreaCode");
            return (Criteria) this;
        }

        public Criteria andCounterAreaCodeNotLike(String value) {
            addCriterion("counterAreaCode not like", value, "counterAreaCode");
            return (Criteria) this;
        }

        public Criteria andCounterAreaCodeIn(List<String> values) {
            addCriterion("counterAreaCode in", values, "counterAreaCode");
            return (Criteria) this;
        }

        public Criteria andCounterAreaCodeNotIn(List<String> values) {
            addCriterion("counterAreaCode not in", values, "counterAreaCode");
            return (Criteria) this;
        }

        public Criteria andCounterAreaCodeBetween(String value1, String value2) {
            addCriterion("counterAreaCode between", value1, value2, "counterAreaCode");
            return (Criteria) this;
        }

        public Criteria andCounterAreaCodeNotBetween(String value1, String value2) {
            addCriterion("counterAreaCode not between", value1, value2, "counterAreaCode");
            return (Criteria) this;
        }

        public Criteria andCounterAreaNameIsNull() {
            addCriterion("counterAreaName is null");
            return (Criteria) this;
        }

        public Criteria andCounterAreaNameIsNotNull() {
            addCriterion("counterAreaName is not null");
            return (Criteria) this;
        }

        public Criteria andCounterAreaNameEqualTo(String value) {
            addCriterion("counterAreaName =", value, "counterAreaName");
            return (Criteria) this;
        }

        public Criteria andCounterAreaNameNotEqualTo(String value) {
            addCriterion("counterAreaName <>", value, "counterAreaName");
            return (Criteria) this;
        }

        public Criteria andCounterAreaNameGreaterThan(String value) {
            addCriterion("counterAreaName >", value, "counterAreaName");
            return (Criteria) this;
        }

        public Criteria andCounterAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("counterAreaName >=", value, "counterAreaName");
            return (Criteria) this;
        }

        public Criteria andCounterAreaNameLessThan(String value) {
            addCriterion("counterAreaName <", value, "counterAreaName");
            return (Criteria) this;
        }

        public Criteria andCounterAreaNameLessThanOrEqualTo(String value) {
            addCriterion("counterAreaName <=", value, "counterAreaName");
            return (Criteria) this;
        }

        public Criteria andCounterAreaNameLike(String value) {
            addCriterion("counterAreaName like", value, "counterAreaName");
            return (Criteria) this;
        }

        public Criteria andCounterAreaNameNotLike(String value) {
            addCriterion("counterAreaName not like", value, "counterAreaName");
            return (Criteria) this;
        }

        public Criteria andCounterAreaNameIn(List<String> values) {
            addCriterion("counterAreaName in", values, "counterAreaName");
            return (Criteria) this;
        }

        public Criteria andCounterAreaNameNotIn(List<String> values) {
            addCriterion("counterAreaName not in", values, "counterAreaName");
            return (Criteria) this;
        }

        public Criteria andCounterAreaNameBetween(String value1, String value2) {
            addCriterion("counterAreaName between", value1, value2, "counterAreaName");
            return (Criteria) this;
        }

        public Criteria andCounterAreaNameNotBetween(String value1, String value2) {
            addCriterion("counterAreaName not between", value1, value2, "counterAreaName");
            return (Criteria) this;
        }

        public Criteria andInAreaCodeIsNull() {
            addCriterion("inAreaCode is null");
            return (Criteria) this;
        }

        public Criteria andInAreaCodeIsNotNull() {
            addCriterion("inAreaCode is not null");
            return (Criteria) this;
        }

        public Criteria andInAreaCodeEqualTo(String value) {
            addCriterion("inAreaCode =", value, "inAreaCode");
            return (Criteria) this;
        }

        public Criteria andInAreaCodeNotEqualTo(String value) {
            addCriterion("inAreaCode <>", value, "inAreaCode");
            return (Criteria) this;
        }

        public Criteria andInAreaCodeGreaterThan(String value) {
            addCriterion("inAreaCode >", value, "inAreaCode");
            return (Criteria) this;
        }

        public Criteria andInAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("inAreaCode >=", value, "inAreaCode");
            return (Criteria) this;
        }

        public Criteria andInAreaCodeLessThan(String value) {
            addCriterion("inAreaCode <", value, "inAreaCode");
            return (Criteria) this;
        }

        public Criteria andInAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("inAreaCode <=", value, "inAreaCode");
            return (Criteria) this;
        }

        public Criteria andInAreaCodeLike(String value) {
            addCriterion("inAreaCode like", value, "inAreaCode");
            return (Criteria) this;
        }

        public Criteria andInAreaCodeNotLike(String value) {
            addCriterion("inAreaCode not like", value, "inAreaCode");
            return (Criteria) this;
        }

        public Criteria andInAreaCodeIn(List<String> values) {
            addCriterion("inAreaCode in", values, "inAreaCode");
            return (Criteria) this;
        }

        public Criteria andInAreaCodeNotIn(List<String> values) {
            addCriterion("inAreaCode not in", values, "inAreaCode");
            return (Criteria) this;
        }

        public Criteria andInAreaCodeBetween(String value1, String value2) {
            addCriterion("inAreaCode between", value1, value2, "inAreaCode");
            return (Criteria) this;
        }

        public Criteria andInAreaCodeNotBetween(String value1, String value2) {
            addCriterion("inAreaCode not between", value1, value2, "inAreaCode");
            return (Criteria) this;
        }

        public Criteria andInAreaNameIsNull() {
            addCriterion("inAreaName is null");
            return (Criteria) this;
        }

        public Criteria andInAreaNameIsNotNull() {
            addCriterion("inAreaName is not null");
            return (Criteria) this;
        }

        public Criteria andInAreaNameEqualTo(String value) {
            addCriterion("inAreaName =", value, "inAreaName");
            return (Criteria) this;
        }

        public Criteria andInAreaNameNotEqualTo(String value) {
            addCriterion("inAreaName <>", value, "inAreaName");
            return (Criteria) this;
        }

        public Criteria andInAreaNameGreaterThan(String value) {
            addCriterion("inAreaName >", value, "inAreaName");
            return (Criteria) this;
        }

        public Criteria andInAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("inAreaName >=", value, "inAreaName");
            return (Criteria) this;
        }

        public Criteria andInAreaNameLessThan(String value) {
            addCriterion("inAreaName <", value, "inAreaName");
            return (Criteria) this;
        }

        public Criteria andInAreaNameLessThanOrEqualTo(String value) {
            addCriterion("inAreaName <=", value, "inAreaName");
            return (Criteria) this;
        }

        public Criteria andInAreaNameLike(String value) {
            addCriterion("inAreaName like", value, "inAreaName");
            return (Criteria) this;
        }

        public Criteria andInAreaNameNotLike(String value) {
            addCriterion("inAreaName not like", value, "inAreaName");
            return (Criteria) this;
        }

        public Criteria andInAreaNameIn(List<String> values) {
            addCriterion("inAreaName in", values, "inAreaName");
            return (Criteria) this;
        }

        public Criteria andInAreaNameNotIn(List<String> values) {
            addCriterion("inAreaName not in", values, "inAreaName");
            return (Criteria) this;
        }

        public Criteria andInAreaNameBetween(String value1, String value2) {
            addCriterion("inAreaName between", value1, value2, "inAreaName");
            return (Criteria) this;
        }

        public Criteria andInAreaNameNotBetween(String value1, String value2) {
            addCriterion("inAreaName not between", value1, value2, "inAreaName");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaCodeIsNull() {
            addCriterion("inCounterAreaCode is null");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaCodeIsNotNull() {
            addCriterion("inCounterAreaCode is not null");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaCodeEqualTo(String value) {
            addCriterion("inCounterAreaCode =", value, "inCounterAreaCode");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaCodeNotEqualTo(String value) {
            addCriterion("inCounterAreaCode <>", value, "inCounterAreaCode");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaCodeGreaterThan(String value) {
            addCriterion("inCounterAreaCode >", value, "inCounterAreaCode");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("inCounterAreaCode >=", value, "inCounterAreaCode");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaCodeLessThan(String value) {
            addCriterion("inCounterAreaCode <", value, "inCounterAreaCode");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("inCounterAreaCode <=", value, "inCounterAreaCode");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaCodeLike(String value) {
            addCriterion("inCounterAreaCode like", value, "inCounterAreaCode");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaCodeNotLike(String value) {
            addCriterion("inCounterAreaCode not like", value, "inCounterAreaCode");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaCodeIn(List<String> values) {
            addCriterion("inCounterAreaCode in", values, "inCounterAreaCode");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaCodeNotIn(List<String> values) {
            addCriterion("inCounterAreaCode not in", values, "inCounterAreaCode");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaCodeBetween(String value1, String value2) {
            addCriterion("inCounterAreaCode between", value1, value2, "inCounterAreaCode");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaCodeNotBetween(String value1, String value2) {
            addCriterion("inCounterAreaCode not between", value1, value2, "inCounterAreaCode");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaNameIsNull() {
            addCriterion("inCounterAreaName is null");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaNameIsNotNull() {
            addCriterion("inCounterAreaName is not null");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaNameEqualTo(String value) {
            addCriterion("inCounterAreaName =", value, "inCounterAreaName");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaNameNotEqualTo(String value) {
            addCriterion("inCounterAreaName <>", value, "inCounterAreaName");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaNameGreaterThan(String value) {
            addCriterion("inCounterAreaName >", value, "inCounterAreaName");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("inCounterAreaName >=", value, "inCounterAreaName");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaNameLessThan(String value) {
            addCriterion("inCounterAreaName <", value, "inCounterAreaName");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaNameLessThanOrEqualTo(String value) {
            addCriterion("inCounterAreaName <=", value, "inCounterAreaName");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaNameLike(String value) {
            addCriterion("inCounterAreaName like", value, "inCounterAreaName");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaNameNotLike(String value) {
            addCriterion("inCounterAreaName not like", value, "inCounterAreaName");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaNameIn(List<String> values) {
            addCriterion("inCounterAreaName in", values, "inCounterAreaName");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaNameNotIn(List<String> values) {
            addCriterion("inCounterAreaName not in", values, "inCounterAreaName");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaNameBetween(String value1, String value2) {
            addCriterion("inCounterAreaName between", value1, value2, "inCounterAreaName");
            return (Criteria) this;
        }

        public Criteria andInCounterAreaNameNotBetween(String value1, String value2) {
            addCriterion("inCounterAreaName not between", value1, value2, "inCounterAreaName");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIsNull() {
            addCriterion("purchaseType is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIsNotNull() {
            addCriterion("purchaseType is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEqualTo(String value) {
            addCriterion("purchaseType =", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotEqualTo(String value) {
            addCriterion("purchaseType <>", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeGreaterThan(String value) {
            addCriterion("purchaseType >", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseType >=", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLessThan(String value) {
            addCriterion("purchaseType <", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLessThanOrEqualTo(String value) {
            addCriterion("purchaseType <=", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLike(String value) {
            addCriterion("purchaseType like", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotLike(String value) {
            addCriterion("purchaseType not like", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIn(List<String> values) {
            addCriterion("purchaseType in", values, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotIn(List<String> values) {
            addCriterion("purchaseType not in", values, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeBetween(String value1, String value2) {
            addCriterion("purchaseType between", value1, value2, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotBetween(String value1, String value2) {
            addCriterion("purchaseType not between", value1, value2, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andInTypeIsNull() {
            addCriterion("inType is null");
            return (Criteria) this;
        }

        public Criteria andInTypeIsNotNull() {
            addCriterion("inType is not null");
            return (Criteria) this;
        }

        public Criteria andInTypeEqualTo(Integer value) {
            addCriterion("inType =", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeNotEqualTo(Integer value) {
            addCriterion("inType <>", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeGreaterThan(Integer value) {
            addCriterion("inType >", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("inType >=", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeLessThan(Integer value) {
            addCriterion("inType <", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeLessThanOrEqualTo(Integer value) {
            addCriterion("inType <=", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeIn(List<Integer> values) {
            addCriterion("inType in", values, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeNotIn(List<Integer> values) {
            addCriterion("inType not in", values, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeBetween(Integer value1, Integer value2) {
            addCriterion("inType between", value1, value2, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("inType not between", value1, value2, "inType");
            return (Criteria) this;
        }

        public Criteria andBargainNameIsNull() {
            addCriterion("bargainName is null");
            return (Criteria) this;
        }

        public Criteria andBargainNameIsNotNull() {
            addCriterion("bargainName is not null");
            return (Criteria) this;
        }

        public Criteria andBargainNameEqualTo(String value) {
            addCriterion("bargainName =", value, "bargainName");
            return (Criteria) this;
        }

        public Criteria andBargainNameNotEqualTo(String value) {
            addCriterion("bargainName <>", value, "bargainName");
            return (Criteria) this;
        }

        public Criteria andBargainNameGreaterThan(String value) {
            addCriterion("bargainName >", value, "bargainName");
            return (Criteria) this;
        }

        public Criteria andBargainNameGreaterThanOrEqualTo(String value) {
            addCriterion("bargainName >=", value, "bargainName");
            return (Criteria) this;
        }

        public Criteria andBargainNameLessThan(String value) {
            addCriterion("bargainName <", value, "bargainName");
            return (Criteria) this;
        }

        public Criteria andBargainNameLessThanOrEqualTo(String value) {
            addCriterion("bargainName <=", value, "bargainName");
            return (Criteria) this;
        }

        public Criteria andBargainNameLike(String value) {
            addCriterion("bargainName like", value, "bargainName");
            return (Criteria) this;
        }

        public Criteria andBargainNameNotLike(String value) {
            addCriterion("bargainName not like", value, "bargainName");
            return (Criteria) this;
        }

        public Criteria andBargainNameIn(List<String> values) {
            addCriterion("bargainName in", values, "bargainName");
            return (Criteria) this;
        }

        public Criteria andBargainNameNotIn(List<String> values) {
            addCriterion("bargainName not in", values, "bargainName");
            return (Criteria) this;
        }

        public Criteria andBargainNameBetween(String value1, String value2) {
            addCriterion("bargainName between", value1, value2, "bargainName");
            return (Criteria) this;
        }

        public Criteria andBargainNameNotBetween(String value1, String value2) {
            addCriterion("bargainName not between", value1, value2, "bargainName");
            return (Criteria) this;
        }

        public Criteria andJtFlagIsNull() {
            addCriterion("jtFlag is null");
            return (Criteria) this;
        }

        public Criteria andJtFlagIsNotNull() {
            addCriterion("jtFlag is not null");
            return (Criteria) this;
        }

        public Criteria andJtFlagEqualTo(Integer value) {
            addCriterion("jtFlag =", value, "jtFlag");
            return (Criteria) this;
        }

        public Criteria andJtFlagNotEqualTo(Integer value) {
            addCriterion("jtFlag <>", value, "jtFlag");
            return (Criteria) this;
        }

        public Criteria andJtFlagGreaterThan(Integer value) {
            addCriterion("jtFlag >", value, "jtFlag");
            return (Criteria) this;
        }

        public Criteria andJtFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("jtFlag >=", value, "jtFlag");
            return (Criteria) this;
        }

        public Criteria andJtFlagLessThan(Integer value) {
            addCriterion("jtFlag <", value, "jtFlag");
            return (Criteria) this;
        }

        public Criteria andJtFlagLessThanOrEqualTo(Integer value) {
            addCriterion("jtFlag <=", value, "jtFlag");
            return (Criteria) this;
        }

        public Criteria andJtFlagIn(List<Integer> values) {
            addCriterion("jtFlag in", values, "jtFlag");
            return (Criteria) this;
        }

        public Criteria andJtFlagNotIn(List<Integer> values) {
            addCriterion("jtFlag not in", values, "jtFlag");
            return (Criteria) this;
        }

        public Criteria andJtFlagBetween(Integer value1, Integer value2) {
            addCriterion("jtFlag between", value1, value2, "jtFlag");
            return (Criteria) this;
        }

        public Criteria andJtFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("jtFlag not between", value1, value2, "jtFlag");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNetGoldWeightIsNull() {
            addCriterion("netGoldWeight is null");
            return (Criteria) this;
        }

        public Criteria andNetGoldWeightIsNotNull() {
            addCriterion("netGoldWeight is not null");
            return (Criteria) this;
        }

        public Criteria andNetGoldWeightEqualTo(Double value) {
            addCriterion("netGoldWeight =", value, "netGoldWeight");
            return (Criteria) this;
        }

        public Criteria andNetGoldWeightNotEqualTo(Double value) {
            addCriterion("netGoldWeight <>", value, "netGoldWeight");
            return (Criteria) this;
        }

        public Criteria andNetGoldWeightGreaterThan(Double value) {
            addCriterion("netGoldWeight >", value, "netGoldWeight");
            return (Criteria) this;
        }

        public Criteria andNetGoldWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("netGoldWeight >=", value, "netGoldWeight");
            return (Criteria) this;
        }

        public Criteria andNetGoldWeightLessThan(Double value) {
            addCriterion("netGoldWeight <", value, "netGoldWeight");
            return (Criteria) this;
        }

        public Criteria andNetGoldWeightLessThanOrEqualTo(Double value) {
            addCriterion("netGoldWeight <=", value, "netGoldWeight");
            return (Criteria) this;
        }

        public Criteria andNetGoldWeightIn(List<Double> values) {
            addCriterion("netGoldWeight in", values, "netGoldWeight");
            return (Criteria) this;
        }

        public Criteria andNetGoldWeightNotIn(List<Double> values) {
            addCriterion("netGoldWeight not in", values, "netGoldWeight");
            return (Criteria) this;
        }

        public Criteria andNetGoldWeightBetween(Double value1, Double value2) {
            addCriterion("netGoldWeight between", value1, value2, "netGoldWeight");
            return (Criteria) this;
        }

        public Criteria andNetGoldWeightNotBetween(Double value1, Double value2) {
            addCriterion("netGoldWeight not between", value1, value2, "netGoldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldLossIsNull() {
            addCriterion("goldLoss is null");
            return (Criteria) this;
        }

        public Criteria andGoldLossIsNotNull() {
            addCriterion("goldLoss is not null");
            return (Criteria) this;
        }

        public Criteria andGoldLossEqualTo(Double value) {
            addCriterion("goldLoss =", value, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andGoldLossNotEqualTo(Double value) {
            addCriterion("goldLoss <>", value, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andGoldLossGreaterThan(Double value) {
            addCriterion("goldLoss >", value, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andGoldLossGreaterThanOrEqualTo(Double value) {
            addCriterion("goldLoss >=", value, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andGoldLossLessThan(Double value) {
            addCriterion("goldLoss <", value, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andGoldLossLessThanOrEqualTo(Double value) {
            addCriterion("goldLoss <=", value, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andGoldLossIn(List<Double> values) {
            addCriterion("goldLoss in", values, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andGoldLossNotIn(List<Double> values) {
            addCriterion("goldLoss not in", values, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andGoldLossBetween(Double value1, Double value2) {
            addCriterion("goldLoss between", value1, value2, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andGoldLossNotBetween(Double value1, Double value2) {
            addCriterion("goldLoss not between", value1, value2, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andGoldPurityIsNull() {
            addCriterion("goldPurity is null");
            return (Criteria) this;
        }

        public Criteria andGoldPurityIsNotNull() {
            addCriterion("goldPurity is not null");
            return (Criteria) this;
        }

        public Criteria andGoldPurityEqualTo(Double value) {
            addCriterion("goldPurity =", value, "goldPurity");
            return (Criteria) this;
        }

        public Criteria andGoldPurityNotEqualTo(Double value) {
            addCriterion("goldPurity <>", value, "goldPurity");
            return (Criteria) this;
        }

        public Criteria andGoldPurityGreaterThan(Double value) {
            addCriterion("goldPurity >", value, "goldPurity");
            return (Criteria) this;
        }

        public Criteria andGoldPurityGreaterThanOrEqualTo(Double value) {
            addCriterion("goldPurity >=", value, "goldPurity");
            return (Criteria) this;
        }

        public Criteria andGoldPurityLessThan(Double value) {
            addCriterion("goldPurity <", value, "goldPurity");
            return (Criteria) this;
        }

        public Criteria andGoldPurityLessThanOrEqualTo(Double value) {
            addCriterion("goldPurity <=", value, "goldPurity");
            return (Criteria) this;
        }

        public Criteria andGoldPurityIn(List<Double> values) {
            addCriterion("goldPurity in", values, "goldPurity");
            return (Criteria) this;
        }

        public Criteria andGoldPurityNotIn(List<Double> values) {
            addCriterion("goldPurity not in", values, "goldPurity");
            return (Criteria) this;
        }

        public Criteria andGoldPurityBetween(Double value1, Double value2) {
            addCriterion("goldPurity between", value1, value2, "goldPurity");
            return (Criteria) this;
        }

        public Criteria andGoldPurityNotBetween(Double value1, Double value2) {
            addCriterion("goldPurity not between", value1, value2, "goldPurity");
            return (Criteria) this;
        }

        public Criteria andGoldWeightIsNull() {
            addCriterion("goldWeight is null");
            return (Criteria) this;
        }

        public Criteria andGoldWeightIsNotNull() {
            addCriterion("goldWeight is not null");
            return (Criteria) this;
        }

        public Criteria andGoldWeightEqualTo(Double value) {
            addCriterion("goldWeight =", value, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldWeightNotEqualTo(Double value) {
            addCriterion("goldWeight <>", value, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldWeightGreaterThan(Double value) {
            addCriterion("goldWeight >", value, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("goldWeight >=", value, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldWeightLessThan(Double value) {
            addCriterion("goldWeight <", value, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldWeightLessThanOrEqualTo(Double value) {
            addCriterion("goldWeight <=", value, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldWeightIn(List<Double> values) {
            addCriterion("goldWeight in", values, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldWeightNotIn(List<Double> values) {
            addCriterion("goldWeight not in", values, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldWeightBetween(Double value1, Double value2) {
            addCriterion("goldWeight between", value1, value2, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldWeightNotBetween(Double value1, Double value2) {
            addCriterion("goldWeight not between", value1, value2, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldPriceIsNull() {
            addCriterion("goldPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoldPriceIsNotNull() {
            addCriterion("goldPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoldPriceEqualTo(Double value) {
            addCriterion("goldPrice =", value, "goldPrice");
            return (Criteria) this;
        }

        public Criteria andGoldPriceNotEqualTo(Double value) {
            addCriterion("goldPrice <>", value, "goldPrice");
            return (Criteria) this;
        }

        public Criteria andGoldPriceGreaterThan(Double value) {
            addCriterion("goldPrice >", value, "goldPrice");
            return (Criteria) this;
        }

        public Criteria andGoldPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goldPrice >=", value, "goldPrice");
            return (Criteria) this;
        }

        public Criteria andGoldPriceLessThan(Double value) {
            addCriterion("goldPrice <", value, "goldPrice");
            return (Criteria) this;
        }

        public Criteria andGoldPriceLessThanOrEqualTo(Double value) {
            addCriterion("goldPrice <=", value, "goldPrice");
            return (Criteria) this;
        }

        public Criteria andGoldPriceIn(List<Double> values) {
            addCriterion("goldPrice in", values, "goldPrice");
            return (Criteria) this;
        }

        public Criteria andGoldPriceNotIn(List<Double> values) {
            addCriterion("goldPrice not in", values, "goldPrice");
            return (Criteria) this;
        }

        public Criteria andGoldPriceBetween(Double value1, Double value2) {
            addCriterion("goldPrice between", value1, value2, "goldPrice");
            return (Criteria) this;
        }

        public Criteria andGoldPriceNotBetween(Double value1, Double value2) {
            addCriterion("goldPrice not between", value1, value2, "goldPrice");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyIsNull() {
            addCriterion("goldMoney is null");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyIsNotNull() {
            addCriterion("goldMoney is not null");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyEqualTo(Double value) {
            addCriterion("goldMoney =", value, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyNotEqualTo(Double value) {
            addCriterion("goldMoney <>", value, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyGreaterThan(Double value) {
            addCriterion("goldMoney >", value, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("goldMoney >=", value, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyLessThan(Double value) {
            addCriterion("goldMoney <", value, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyLessThanOrEqualTo(Double value) {
            addCriterion("goldMoney <=", value, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyIn(List<Double> values) {
            addCriterion("goldMoney in", values, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyNotIn(List<Double> values) {
            addCriterion("goldMoney not in", values, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyBetween(Double value1, Double value2) {
            addCriterion("goldMoney between", value1, value2, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyNotBetween(Double value1, Double value2) {
            addCriterion("goldMoney not between", value1, value2, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNull() {
            addCriterion("productWeight is null");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNotNull() {
            addCriterion("productWeight is not null");
            return (Criteria) this;
        }

        public Criteria andProductWeightEqualTo(Double value) {
            addCriterion("productWeight =", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotEqualTo(Double value) {
            addCriterion("productWeight <>", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThan(Double value) {
            addCriterion("productWeight >", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("productWeight >=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThan(Double value) {
            addCriterion("productWeight <", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThanOrEqualTo(Double value) {
            addCriterion("productWeight <=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightIn(List<Double> values) {
            addCriterion("productWeight in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotIn(List<Double> values) {
            addCriterion("productWeight not in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightBetween(Double value1, Double value2) {
            addCriterion("productWeight between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotBetween(Double value1, Double value2) {
            addCriterion("productWeight not between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andWorkFeeKeIsNull() {
            addCriterion("workFeeKe is null");
            return (Criteria) this;
        }

        public Criteria andWorkFeeKeIsNotNull() {
            addCriterion("workFeeKe is not null");
            return (Criteria) this;
        }

        public Criteria andWorkFeeKeEqualTo(Double value) {
            addCriterion("workFeeKe =", value, "workFeeKe");
            return (Criteria) this;
        }

        public Criteria andWorkFeeKeNotEqualTo(Double value) {
            addCriterion("workFeeKe <>", value, "workFeeKe");
            return (Criteria) this;
        }

        public Criteria andWorkFeeKeGreaterThan(Double value) {
            addCriterion("workFeeKe >", value, "workFeeKe");
            return (Criteria) this;
        }

        public Criteria andWorkFeeKeGreaterThanOrEqualTo(Double value) {
            addCriterion("workFeeKe >=", value, "workFeeKe");
            return (Criteria) this;
        }

        public Criteria andWorkFeeKeLessThan(Double value) {
            addCriterion("workFeeKe <", value, "workFeeKe");
            return (Criteria) this;
        }

        public Criteria andWorkFeeKeLessThanOrEqualTo(Double value) {
            addCriterion("workFeeKe <=", value, "workFeeKe");
            return (Criteria) this;
        }

        public Criteria andWorkFeeKeIn(List<Double> values) {
            addCriterion("workFeeKe in", values, "workFeeKe");
            return (Criteria) this;
        }

        public Criteria andWorkFeeKeNotIn(List<Double> values) {
            addCriterion("workFeeKe not in", values, "workFeeKe");
            return (Criteria) this;
        }

        public Criteria andWorkFeeKeBetween(Double value1, Double value2) {
            addCriterion("workFeeKe between", value1, value2, "workFeeKe");
            return (Criteria) this;
        }

        public Criteria andWorkFeeKeNotBetween(Double value1, Double value2) {
            addCriterion("workFeeKe not between", value1, value2, "workFeeKe");
            return (Criteria) this;
        }

        public Criteria andWorkFeeJianIsNull() {
            addCriterion("workFeeJian is null");
            return (Criteria) this;
        }

        public Criteria andWorkFeeJianIsNotNull() {
            addCriterion("workFeeJian is not null");
            return (Criteria) this;
        }

        public Criteria andWorkFeeJianEqualTo(Double value) {
            addCriterion("workFeeJian =", value, "workFeeJian");
            return (Criteria) this;
        }

        public Criteria andWorkFeeJianNotEqualTo(Double value) {
            addCriterion("workFeeJian <>", value, "workFeeJian");
            return (Criteria) this;
        }

        public Criteria andWorkFeeJianGreaterThan(Double value) {
            addCriterion("workFeeJian >", value, "workFeeJian");
            return (Criteria) this;
        }

        public Criteria andWorkFeeJianGreaterThanOrEqualTo(Double value) {
            addCriterion("workFeeJian >=", value, "workFeeJian");
            return (Criteria) this;
        }

        public Criteria andWorkFeeJianLessThan(Double value) {
            addCriterion("workFeeJian <", value, "workFeeJian");
            return (Criteria) this;
        }

        public Criteria andWorkFeeJianLessThanOrEqualTo(Double value) {
            addCriterion("workFeeJian <=", value, "workFeeJian");
            return (Criteria) this;
        }

        public Criteria andWorkFeeJianIn(List<Double> values) {
            addCriterion("workFeeJian in", values, "workFeeJian");
            return (Criteria) this;
        }

        public Criteria andWorkFeeJianNotIn(List<Double> values) {
            addCriterion("workFeeJian not in", values, "workFeeJian");
            return (Criteria) this;
        }

        public Criteria andWorkFeeJianBetween(Double value1, Double value2) {
            addCriterion("workFeeJian between", value1, value2, "workFeeJian");
            return (Criteria) this;
        }

        public Criteria andWorkFeeJianNotBetween(Double value1, Double value2) {
            addCriterion("workFeeJian not between", value1, value2, "workFeeJian");
            return (Criteria) this;
        }

        public Criteria andWorkFeeSumIsNull() {
            addCriterion("workFeeSum is null");
            return (Criteria) this;
        }

        public Criteria andWorkFeeSumIsNotNull() {
            addCriterion("workFeeSum is not null");
            return (Criteria) this;
        }

        public Criteria andWorkFeeSumEqualTo(Double value) {
            addCriterion("workFeeSum =", value, "workFeeSum");
            return (Criteria) this;
        }

        public Criteria andWorkFeeSumNotEqualTo(Double value) {
            addCriterion("workFeeSum <>", value, "workFeeSum");
            return (Criteria) this;
        }

        public Criteria andWorkFeeSumGreaterThan(Double value) {
            addCriterion("workFeeSum >", value, "workFeeSum");
            return (Criteria) this;
        }

        public Criteria andWorkFeeSumGreaterThanOrEqualTo(Double value) {
            addCriterion("workFeeSum >=", value, "workFeeSum");
            return (Criteria) this;
        }

        public Criteria andWorkFeeSumLessThan(Double value) {
            addCriterion("workFeeSum <", value, "workFeeSum");
            return (Criteria) this;
        }

        public Criteria andWorkFeeSumLessThanOrEqualTo(Double value) {
            addCriterion("workFeeSum <=", value, "workFeeSum");
            return (Criteria) this;
        }

        public Criteria andWorkFeeSumIn(List<Double> values) {
            addCriterion("workFeeSum in", values, "workFeeSum");
            return (Criteria) this;
        }

        public Criteria andWorkFeeSumNotIn(List<Double> values) {
            addCriterion("workFeeSum not in", values, "workFeeSum");
            return (Criteria) this;
        }

        public Criteria andWorkFeeSumBetween(Double value1, Double value2) {
            addCriterion("workFeeSum between", value1, value2, "workFeeSum");
            return (Criteria) this;
        }

        public Criteria andWorkFeeSumNotBetween(Double value1, Double value2) {
            addCriterion("workFeeSum not between", value1, value2, "workFeeSum");
            return (Criteria) this;
        }

        public Criteria andCertificateFeeIsNull() {
            addCriterion("certificateFee is null");
            return (Criteria) this;
        }

        public Criteria andCertificateFeeIsNotNull() {
            addCriterion("certificateFee is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateFeeEqualTo(Double value) {
            addCriterion("certificateFee =", value, "certificateFee");
            return (Criteria) this;
        }

        public Criteria andCertificateFeeNotEqualTo(Double value) {
            addCriterion("certificateFee <>", value, "certificateFee");
            return (Criteria) this;
        }

        public Criteria andCertificateFeeGreaterThan(Double value) {
            addCriterion("certificateFee >", value, "certificateFee");
            return (Criteria) this;
        }

        public Criteria andCertificateFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("certificateFee >=", value, "certificateFee");
            return (Criteria) this;
        }

        public Criteria andCertificateFeeLessThan(Double value) {
            addCriterion("certificateFee <", value, "certificateFee");
            return (Criteria) this;
        }

        public Criteria andCertificateFeeLessThanOrEqualTo(Double value) {
            addCriterion("certificateFee <=", value, "certificateFee");
            return (Criteria) this;
        }

        public Criteria andCertificateFeeIn(List<Double> values) {
            addCriterion("certificateFee in", values, "certificateFee");
            return (Criteria) this;
        }

        public Criteria andCertificateFeeNotIn(List<Double> values) {
            addCriterion("certificateFee not in", values, "certificateFee");
            return (Criteria) this;
        }

        public Criteria andCertificateFeeBetween(Double value1, Double value2) {
            addCriterion("certificateFee between", value1, value2, "certificateFee");
            return (Criteria) this;
        }

        public Criteria andCertificateFeeNotBetween(Double value1, Double value2) {
            addCriterion("certificateFee not between", value1, value2, "certificateFee");
            return (Criteria) this;
        }

        public Criteria andFittingNameIsNull() {
            addCriterion("fittingName is null");
            return (Criteria) this;
        }

        public Criteria andFittingNameIsNotNull() {
            addCriterion("fittingName is not null");
            return (Criteria) this;
        }

        public Criteria andFittingNameEqualTo(String value) {
            addCriterion("fittingName =", value, "fittingName");
            return (Criteria) this;
        }

        public Criteria andFittingNameNotEqualTo(String value) {
            addCriterion("fittingName <>", value, "fittingName");
            return (Criteria) this;
        }

        public Criteria andFittingNameGreaterThan(String value) {
            addCriterion("fittingName >", value, "fittingName");
            return (Criteria) this;
        }

        public Criteria andFittingNameGreaterThanOrEqualTo(String value) {
            addCriterion("fittingName >=", value, "fittingName");
            return (Criteria) this;
        }

        public Criteria andFittingNameLessThan(String value) {
            addCriterion("fittingName <", value, "fittingName");
            return (Criteria) this;
        }

        public Criteria andFittingNameLessThanOrEqualTo(String value) {
            addCriterion("fittingName <=", value, "fittingName");
            return (Criteria) this;
        }

        public Criteria andFittingNameLike(String value) {
            addCriterion("fittingName like", value, "fittingName");
            return (Criteria) this;
        }

        public Criteria andFittingNameNotLike(String value) {
            addCriterion("fittingName not like", value, "fittingName");
            return (Criteria) this;
        }

        public Criteria andFittingNameIn(List<String> values) {
            addCriterion("fittingName in", values, "fittingName");
            return (Criteria) this;
        }

        public Criteria andFittingNameNotIn(List<String> values) {
            addCriterion("fittingName not in", values, "fittingName");
            return (Criteria) this;
        }

        public Criteria andFittingNameBetween(String value1, String value2) {
            addCriterion("fittingName between", value1, value2, "fittingName");
            return (Criteria) this;
        }

        public Criteria andFittingNameNotBetween(String value1, String value2) {
            addCriterion("fittingName not between", value1, value2, "fittingName");
            return (Criteria) this;
        }

        public Criteria andFittingNumIsNull() {
            addCriterion("fittingNum is null");
            return (Criteria) this;
        }

        public Criteria andFittingNumIsNotNull() {
            addCriterion("fittingNum is not null");
            return (Criteria) this;
        }

        public Criteria andFittingNumEqualTo(String value) {
            addCriterion("fittingNum =", value, "fittingNum");
            return (Criteria) this;
        }

        public Criteria andFittingNumNotEqualTo(String value) {
            addCriterion("fittingNum <>", value, "fittingNum");
            return (Criteria) this;
        }

        public Criteria andFittingNumGreaterThan(String value) {
            addCriterion("fittingNum >", value, "fittingNum");
            return (Criteria) this;
        }

        public Criteria andFittingNumGreaterThanOrEqualTo(String value) {
            addCriterion("fittingNum >=", value, "fittingNum");
            return (Criteria) this;
        }

        public Criteria andFittingNumLessThan(String value) {
            addCriterion("fittingNum <", value, "fittingNum");
            return (Criteria) this;
        }

        public Criteria andFittingNumLessThanOrEqualTo(String value) {
            addCriterion("fittingNum <=", value, "fittingNum");
            return (Criteria) this;
        }

        public Criteria andFittingNumLike(String value) {
            addCriterion("fittingNum like", value, "fittingNum");
            return (Criteria) this;
        }

        public Criteria andFittingNumNotLike(String value) {
            addCriterion("fittingNum not like", value, "fittingNum");
            return (Criteria) this;
        }

        public Criteria andFittingNumIn(List<String> values) {
            addCriterion("fittingNum in", values, "fittingNum");
            return (Criteria) this;
        }

        public Criteria andFittingNumNotIn(List<String> values) {
            addCriterion("fittingNum not in", values, "fittingNum");
            return (Criteria) this;
        }

        public Criteria andFittingNumBetween(String value1, String value2) {
            addCriterion("fittingNum between", value1, value2, "fittingNum");
            return (Criteria) this;
        }

        public Criteria andFittingNumNotBetween(String value1, String value2) {
            addCriterion("fittingNum not between", value1, value2, "fittingNum");
            return (Criteria) this;
        }

        public Criteria andFittingFeeIsNull() {
            addCriterion("fittingFee is null");
            return (Criteria) this;
        }

        public Criteria andFittingFeeIsNotNull() {
            addCriterion("fittingFee is not null");
            return (Criteria) this;
        }

        public Criteria andFittingFeeEqualTo(Double value) {
            addCriterion("fittingFee =", value, "fittingFee");
            return (Criteria) this;
        }

        public Criteria andFittingFeeNotEqualTo(Double value) {
            addCriterion("fittingFee <>", value, "fittingFee");
            return (Criteria) this;
        }

        public Criteria andFittingFeeGreaterThan(Double value) {
            addCriterion("fittingFee >", value, "fittingFee");
            return (Criteria) this;
        }

        public Criteria andFittingFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("fittingFee >=", value, "fittingFee");
            return (Criteria) this;
        }

        public Criteria andFittingFeeLessThan(Double value) {
            addCriterion("fittingFee <", value, "fittingFee");
            return (Criteria) this;
        }

        public Criteria andFittingFeeLessThanOrEqualTo(Double value) {
            addCriterion("fittingFee <=", value, "fittingFee");
            return (Criteria) this;
        }

        public Criteria andFittingFeeIn(List<Double> values) {
            addCriterion("fittingFee in", values, "fittingFee");
            return (Criteria) this;
        }

        public Criteria andFittingFeeNotIn(List<Double> values) {
            addCriterion("fittingFee not in", values, "fittingFee");
            return (Criteria) this;
        }

        public Criteria andFittingFeeBetween(Double value1, Double value2) {
            addCriterion("fittingFee between", value1, value2, "fittingFee");
            return (Criteria) this;
        }

        public Criteria andFittingFeeNotBetween(Double value1, Double value2) {
            addCriterion("fittingFee not between", value1, value2, "fittingFee");
            return (Criteria) this;
        }

        public Criteria andSandBlastFeeIsNull() {
            addCriterion("sandBlastFee is null");
            return (Criteria) this;
        }

        public Criteria andSandBlastFeeIsNotNull() {
            addCriterion("sandBlastFee is not null");
            return (Criteria) this;
        }

        public Criteria andSandBlastFeeEqualTo(Double value) {
            addCriterion("sandBlastFee =", value, "sandBlastFee");
            return (Criteria) this;
        }

        public Criteria andSandBlastFeeNotEqualTo(Double value) {
            addCriterion("sandBlastFee <>", value, "sandBlastFee");
            return (Criteria) this;
        }

        public Criteria andSandBlastFeeGreaterThan(Double value) {
            addCriterion("sandBlastFee >", value, "sandBlastFee");
            return (Criteria) this;
        }

        public Criteria andSandBlastFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("sandBlastFee >=", value, "sandBlastFee");
            return (Criteria) this;
        }

        public Criteria andSandBlastFeeLessThan(Double value) {
            addCriterion("sandBlastFee <", value, "sandBlastFee");
            return (Criteria) this;
        }

        public Criteria andSandBlastFeeLessThanOrEqualTo(Double value) {
            addCriterion("sandBlastFee <=", value, "sandBlastFee");
            return (Criteria) this;
        }

        public Criteria andSandBlastFeeIn(List<Double> values) {
            addCriterion("sandBlastFee in", values, "sandBlastFee");
            return (Criteria) this;
        }

        public Criteria andSandBlastFeeNotIn(List<Double> values) {
            addCriterion("sandBlastFee not in", values, "sandBlastFee");
            return (Criteria) this;
        }

        public Criteria andSandBlastFeeBetween(Double value1, Double value2) {
            addCriterion("sandBlastFee between", value1, value2, "sandBlastFee");
            return (Criteria) this;
        }

        public Criteria andSandBlastFeeNotBetween(Double value1, Double value2) {
            addCriterion("sandBlastFee not between", value1, value2, "sandBlastFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIsNull() {
            addCriterion("otherFee is null");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIsNotNull() {
            addCriterion("otherFee is not null");
            return (Criteria) this;
        }

        public Criteria andOtherFeeEqualTo(Double value) {
            addCriterion("otherFee =", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotEqualTo(Double value) {
            addCriterion("otherFee <>", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeGreaterThan(Double value) {
            addCriterion("otherFee >", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("otherFee >=", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeLessThan(Double value) {
            addCriterion("otherFee <", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeLessThanOrEqualTo(Double value) {
            addCriterion("otherFee <=", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIn(List<Double> values) {
            addCriterion("otherFee in", values, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotIn(List<Double> values) {
            addCriterion("otherFee not in", values, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeBetween(Double value1, Double value2) {
            addCriterion("otherFee between", value1, value2, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotBetween(Double value1, Double value2) {
            addCriterion("otherFee not between", value1, value2, "otherFee");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unitPrice is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unitPrice is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(Double value) {
            addCriterion("unitPrice =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(Double value) {
            addCriterion("unitPrice <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(Double value) {
            addCriterion("unitPrice >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("unitPrice >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(Double value) {
            addCriterion("unitPrice <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(Double value) {
            addCriterion("unitPrice <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<Double> values) {
            addCriterion("unitPrice in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<Double> values) {
            addCriterion("unitPrice not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(Double value1, Double value2) {
            addCriterion("unitPrice between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(Double value1, Double value2) {
            addCriterion("unitPrice not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("costPrice is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("costPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(Double value) {
            addCriterion("costPrice =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(Double value) {
            addCriterion("costPrice <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(Double value) {
            addCriterion("costPrice >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("costPrice >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(Double value) {
            addCriterion("costPrice <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(Double value) {
            addCriterion("costPrice <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<Double> values) {
            addCriterion("costPrice in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<Double> values) {
            addCriterion("costPrice not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(Double value1, Double value2) {
            addCriterion("costPrice between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(Double value1, Double value2) {
            addCriterion("costPrice not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeKeIsNull() {
            addCriterion("labelWorkFeeKe is null");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeKeIsNotNull() {
            addCriterion("labelWorkFeeKe is not null");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeKeEqualTo(Double value) {
            addCriterion("labelWorkFeeKe =", value, "labelWorkFeeKe");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeKeNotEqualTo(Double value) {
            addCriterion("labelWorkFeeKe <>", value, "labelWorkFeeKe");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeKeGreaterThan(Double value) {
            addCriterion("labelWorkFeeKe >", value, "labelWorkFeeKe");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeKeGreaterThanOrEqualTo(Double value) {
            addCriterion("labelWorkFeeKe >=", value, "labelWorkFeeKe");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeKeLessThan(Double value) {
            addCriterion("labelWorkFeeKe <", value, "labelWorkFeeKe");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeKeLessThanOrEqualTo(Double value) {
            addCriterion("labelWorkFeeKe <=", value, "labelWorkFeeKe");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeKeIn(List<Double> values) {
            addCriterion("labelWorkFeeKe in", values, "labelWorkFeeKe");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeKeNotIn(List<Double> values) {
            addCriterion("labelWorkFeeKe not in", values, "labelWorkFeeKe");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeKeBetween(Double value1, Double value2) {
            addCriterion("labelWorkFeeKe between", value1, value2, "labelWorkFeeKe");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeKeNotBetween(Double value1, Double value2) {
            addCriterion("labelWorkFeeKe not between", value1, value2, "labelWorkFeeKe");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeJianIsNull() {
            addCriterion("labelWorkFeeJian is null");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeJianIsNotNull() {
            addCriterion("labelWorkFeeJian is not null");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeJianEqualTo(Double value) {
            addCriterion("labelWorkFeeJian =", value, "labelWorkFeeJian");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeJianNotEqualTo(Double value) {
            addCriterion("labelWorkFeeJian <>", value, "labelWorkFeeJian");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeJianGreaterThan(Double value) {
            addCriterion("labelWorkFeeJian >", value, "labelWorkFeeJian");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeJianGreaterThanOrEqualTo(Double value) {
            addCriterion("labelWorkFeeJian >=", value, "labelWorkFeeJian");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeJianLessThan(Double value) {
            addCriterion("labelWorkFeeJian <", value, "labelWorkFeeJian");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeJianLessThanOrEqualTo(Double value) {
            addCriterion("labelWorkFeeJian <=", value, "labelWorkFeeJian");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeJianIn(List<Double> values) {
            addCriterion("labelWorkFeeJian in", values, "labelWorkFeeJian");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeJianNotIn(List<Double> values) {
            addCriterion("labelWorkFeeJian not in", values, "labelWorkFeeJian");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeJianBetween(Double value1, Double value2) {
            addCriterion("labelWorkFeeJian between", value1, value2, "labelWorkFeeJian");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeJianNotBetween(Double value1, Double value2) {
            addCriterion("labelWorkFeeJian not between", value1, value2, "labelWorkFeeJian");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeSumIsNull() {
            addCriterion("labelWorkFeeSum is null");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeSumIsNotNull() {
            addCriterion("labelWorkFeeSum is not null");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeSumEqualTo(Double value) {
            addCriterion("labelWorkFeeSum =", value, "labelWorkFeeSum");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeSumNotEqualTo(Double value) {
            addCriterion("labelWorkFeeSum <>", value, "labelWorkFeeSum");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeSumGreaterThan(Double value) {
            addCriterion("labelWorkFeeSum >", value, "labelWorkFeeSum");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeSumGreaterThanOrEqualTo(Double value) {
            addCriterion("labelWorkFeeSum >=", value, "labelWorkFeeSum");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeSumLessThan(Double value) {
            addCriterion("labelWorkFeeSum <", value, "labelWorkFeeSum");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeSumLessThanOrEqualTo(Double value) {
            addCriterion("labelWorkFeeSum <=", value, "labelWorkFeeSum");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeSumIn(List<Double> values) {
            addCriterion("labelWorkFeeSum in", values, "labelWorkFeeSum");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeSumNotIn(List<Double> values) {
            addCriterion("labelWorkFeeSum not in", values, "labelWorkFeeSum");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeSumBetween(Double value1, Double value2) {
            addCriterion("labelWorkFeeSum between", value1, value2, "labelWorkFeeSum");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeSumNotBetween(Double value1, Double value2) {
            addCriterion("labelWorkFeeSum not between", value1, value2, "labelWorkFeeSum");
            return (Criteria) this;
        }

        public Criteria andLabelRateIsNull() {
            addCriterion("labelRate is null");
            return (Criteria) this;
        }

        public Criteria andLabelRateIsNotNull() {
            addCriterion("labelRate is not null");
            return (Criteria) this;
        }

        public Criteria andLabelRateEqualTo(Double value) {
            addCriterion("labelRate =", value, "labelRate");
            return (Criteria) this;
        }

        public Criteria andLabelRateNotEqualTo(Double value) {
            addCriterion("labelRate <>", value, "labelRate");
            return (Criteria) this;
        }

        public Criteria andLabelRateGreaterThan(Double value) {
            addCriterion("labelRate >", value, "labelRate");
            return (Criteria) this;
        }

        public Criteria andLabelRateGreaterThanOrEqualTo(Double value) {
            addCriterion("labelRate >=", value, "labelRate");
            return (Criteria) this;
        }

        public Criteria andLabelRateLessThan(Double value) {
            addCriterion("labelRate <", value, "labelRate");
            return (Criteria) this;
        }

        public Criteria andLabelRateLessThanOrEqualTo(Double value) {
            addCriterion("labelRate <=", value, "labelRate");
            return (Criteria) this;
        }

        public Criteria andLabelRateIn(List<Double> values) {
            addCriterion("labelRate in", values, "labelRate");
            return (Criteria) this;
        }

        public Criteria andLabelRateNotIn(List<Double> values) {
            addCriterion("labelRate not in", values, "labelRate");
            return (Criteria) this;
        }

        public Criteria andLabelRateBetween(Double value1, Double value2) {
            addCriterion("labelRate between", value1, value2, "labelRate");
            return (Criteria) this;
        }

        public Criteria andLabelRateNotBetween(Double value1, Double value2) {
            addCriterion("labelRate not between", value1, value2, "labelRate");
            return (Criteria) this;
        }

        public Criteria andLabelPriceIsNull() {
            addCriterion("labelPrice is null");
            return (Criteria) this;
        }

        public Criteria andLabelPriceIsNotNull() {
            addCriterion("labelPrice is not null");
            return (Criteria) this;
        }

        public Criteria andLabelPriceEqualTo(Double value) {
            addCriterion("labelPrice =", value, "labelPrice");
            return (Criteria) this;
        }

        public Criteria andLabelPriceNotEqualTo(Double value) {
            addCriterion("labelPrice <>", value, "labelPrice");
            return (Criteria) this;
        }

        public Criteria andLabelPriceGreaterThan(Double value) {
            addCriterion("labelPrice >", value, "labelPrice");
            return (Criteria) this;
        }

        public Criteria andLabelPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("labelPrice >=", value, "labelPrice");
            return (Criteria) this;
        }

        public Criteria andLabelPriceLessThan(Double value) {
            addCriterion("labelPrice <", value, "labelPrice");
            return (Criteria) this;
        }

        public Criteria andLabelPriceLessThanOrEqualTo(Double value) {
            addCriterion("labelPrice <=", value, "labelPrice");
            return (Criteria) this;
        }

        public Criteria andLabelPriceIn(List<Double> values) {
            addCriterion("labelPrice in", values, "labelPrice");
            return (Criteria) this;
        }

        public Criteria andLabelPriceNotIn(List<Double> values) {
            addCriterion("labelPrice not in", values, "labelPrice");
            return (Criteria) this;
        }

        public Criteria andLabelPriceBetween(Double value1, Double value2) {
            addCriterion("labelPrice between", value1, value2, "labelPrice");
            return (Criteria) this;
        }

        public Criteria andLabelPriceNotBetween(Double value1, Double value2) {
            addCriterion("labelPrice not between", value1, value2, "labelPrice");
            return (Criteria) this;
        }

        public Criteria andLabelPriceSumIsNull() {
            addCriterion("labelPriceSum is null");
            return (Criteria) this;
        }

        public Criteria andLabelPriceSumIsNotNull() {
            addCriterion("labelPriceSum is not null");
            return (Criteria) this;
        }

        public Criteria andLabelPriceSumEqualTo(Double value) {
            addCriterion("labelPriceSum =", value, "labelPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabelPriceSumNotEqualTo(Double value) {
            addCriterion("labelPriceSum <>", value, "labelPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabelPriceSumGreaterThan(Double value) {
            addCriterion("labelPriceSum >", value, "labelPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabelPriceSumGreaterThanOrEqualTo(Double value) {
            addCriterion("labelPriceSum >=", value, "labelPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabelPriceSumLessThan(Double value) {
            addCriterion("labelPriceSum <", value, "labelPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabelPriceSumLessThanOrEqualTo(Double value) {
            addCriterion("labelPriceSum <=", value, "labelPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabelPriceSumIn(List<Double> values) {
            addCriterion("labelPriceSum in", values, "labelPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabelPriceSumNotIn(List<Double> values) {
            addCriterion("labelPriceSum not in", values, "labelPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabelPriceSumBetween(Double value1, Double value2) {
            addCriterion("labelPriceSum between", value1, value2, "labelPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabelPriceSumNotBetween(Double value1, Double value2) {
            addCriterion("labelPriceSum not between", value1, value2, "labelPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabelRemarksIsNull() {
            addCriterion("labelRemarks is null");
            return (Criteria) this;
        }

        public Criteria andLabelRemarksIsNotNull() {
            addCriterion("labelRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andLabelRemarksEqualTo(String value) {
            addCriterion("labelRemarks =", value, "labelRemarks");
            return (Criteria) this;
        }

        public Criteria andLabelRemarksNotEqualTo(String value) {
            addCriterion("labelRemarks <>", value, "labelRemarks");
            return (Criteria) this;
        }

        public Criteria andLabelRemarksGreaterThan(String value) {
            addCriterion("labelRemarks >", value, "labelRemarks");
            return (Criteria) this;
        }

        public Criteria andLabelRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("labelRemarks >=", value, "labelRemarks");
            return (Criteria) this;
        }

        public Criteria andLabelRemarksLessThan(String value) {
            addCriterion("labelRemarks <", value, "labelRemarks");
            return (Criteria) this;
        }

        public Criteria andLabelRemarksLessThanOrEqualTo(String value) {
            addCriterion("labelRemarks <=", value, "labelRemarks");
            return (Criteria) this;
        }

        public Criteria andLabelRemarksLike(String value) {
            addCriterion("labelRemarks like", value, "labelRemarks");
            return (Criteria) this;
        }

        public Criteria andLabelRemarksNotLike(String value) {
            addCriterion("labelRemarks not like", value, "labelRemarks");
            return (Criteria) this;
        }

        public Criteria andLabelRemarksIn(List<String> values) {
            addCriterion("labelRemarks in", values, "labelRemarks");
            return (Criteria) this;
        }

        public Criteria andLabelRemarksNotIn(List<String> values) {
            addCriterion("labelRemarks not in", values, "labelRemarks");
            return (Criteria) this;
        }

        public Criteria andLabelRemarksBetween(String value1, String value2) {
            addCriterion("labelRemarks between", value1, value2, "labelRemarks");
            return (Criteria) this;
        }

        public Criteria andLabelRemarksNotBetween(String value1, String value2) {
            addCriterion("labelRemarks not between", value1, value2, "labelRemarks");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("categoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("categoryId =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("categoryId <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("categoryId >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("categoryId >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("categoryId <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("categoryId <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("categoryId in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("categoryId not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("categoryId between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("categoryId not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andSysCodeIsNull() {
            addCriterion("sysCode is null");
            return (Criteria) this;
        }

        public Criteria andSysCodeIsNotNull() {
            addCriterion("sysCode is not null");
            return (Criteria) this;
        }

        public Criteria andSysCodeEqualTo(String value) {
            addCriterion("sysCode =", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotEqualTo(String value) {
            addCriterion("sysCode <>", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThan(String value) {
            addCriterion("sysCode >", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sysCode >=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThan(String value) {
            addCriterion("sysCode <", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThanOrEqualTo(String value) {
            addCriterion("sysCode <=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLike(String value) {
            addCriterion("sysCode like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotLike(String value) {
            addCriterion("sysCode not like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeIn(List<String> values) {
            addCriterion("sysCode in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotIn(List<String> values) {
            addCriterion("sysCode not in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeBetween(String value1, String value2) {
            addCriterion("sysCode between", value1, value2, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotBetween(String value1, String value2) {
            addCriterion("sysCode not between", value1, value2, "sysCode");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("productName is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("productName is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("productName =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("productName <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("productName >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("productName >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("productName <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("productName <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("productName like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("productName not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("productName in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("productName not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("productName between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("productName not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andGoldNameIsNull() {
            addCriterion("goldName is null");
            return (Criteria) this;
        }

        public Criteria andGoldNameIsNotNull() {
            addCriterion("goldName is not null");
            return (Criteria) this;
        }

        public Criteria andGoldNameEqualTo(String value) {
            addCriterion("goldName =", value, "goldName");
            return (Criteria) this;
        }

        public Criteria andGoldNameNotEqualTo(String value) {
            addCriterion("goldName <>", value, "goldName");
            return (Criteria) this;
        }

        public Criteria andGoldNameGreaterThan(String value) {
            addCriterion("goldName >", value, "goldName");
            return (Criteria) this;
        }

        public Criteria andGoldNameGreaterThanOrEqualTo(String value) {
            addCriterion("goldName >=", value, "goldName");
            return (Criteria) this;
        }

        public Criteria andGoldNameLessThan(String value) {
            addCriterion("goldName <", value, "goldName");
            return (Criteria) this;
        }

        public Criteria andGoldNameLessThanOrEqualTo(String value) {
            addCriterion("goldName <=", value, "goldName");
            return (Criteria) this;
        }

        public Criteria andGoldNameLike(String value) {
            addCriterion("goldName like", value, "goldName");
            return (Criteria) this;
        }

        public Criteria andGoldNameNotLike(String value) {
            addCriterion("goldName not like", value, "goldName");
            return (Criteria) this;
        }

        public Criteria andGoldNameIn(List<String> values) {
            addCriterion("goldName in", values, "goldName");
            return (Criteria) this;
        }

        public Criteria andGoldNameNotIn(List<String> values) {
            addCriterion("goldName not in", values, "goldName");
            return (Criteria) this;
        }

        public Criteria andGoldNameBetween(String value1, String value2) {
            addCriterion("goldName between", value1, value2, "goldName");
            return (Criteria) this;
        }

        public Criteria andGoldNameNotBetween(String value1, String value2) {
            addCriterion("goldName not between", value1, value2, "goldName");
            return (Criteria) this;
        }

        public Criteria andJewelNameIsNull() {
            addCriterion("jewelName is null");
            return (Criteria) this;
        }

        public Criteria andJewelNameIsNotNull() {
            addCriterion("jewelName is not null");
            return (Criteria) this;
        }

        public Criteria andJewelNameEqualTo(String value) {
            addCriterion("jewelName =", value, "jewelName");
            return (Criteria) this;
        }

        public Criteria andJewelNameNotEqualTo(String value) {
            addCriterion("jewelName <>", value, "jewelName");
            return (Criteria) this;
        }

        public Criteria andJewelNameGreaterThan(String value) {
            addCriterion("jewelName >", value, "jewelName");
            return (Criteria) this;
        }

        public Criteria andJewelNameGreaterThanOrEqualTo(String value) {
            addCriterion("jewelName >=", value, "jewelName");
            return (Criteria) this;
        }

        public Criteria andJewelNameLessThan(String value) {
            addCriterion("jewelName <", value, "jewelName");
            return (Criteria) this;
        }

        public Criteria andJewelNameLessThanOrEqualTo(String value) {
            addCriterion("jewelName <=", value, "jewelName");
            return (Criteria) this;
        }

        public Criteria andJewelNameLike(String value) {
            addCriterion("jewelName like", value, "jewelName");
            return (Criteria) this;
        }

        public Criteria andJewelNameNotLike(String value) {
            addCriterion("jewelName not like", value, "jewelName");
            return (Criteria) this;
        }

        public Criteria andJewelNameIn(List<String> values) {
            addCriterion("jewelName in", values, "jewelName");
            return (Criteria) this;
        }

        public Criteria andJewelNameNotIn(List<String> values) {
            addCriterion("jewelName not in", values, "jewelName");
            return (Criteria) this;
        }

        public Criteria andJewelNameBetween(String value1, String value2) {
            addCriterion("jewelName between", value1, value2, "jewelName");
            return (Criteria) this;
        }

        public Criteria andJewelNameNotBetween(String value1, String value2) {
            addCriterion("jewelName not between", value1, value2, "jewelName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("categoryName is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("categoryName is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("categoryName =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("categoryName <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("categoryName >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("categoryName >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("categoryName <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("categoryName <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("categoryName like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("categoryName not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("categoryName in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("categoryName not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("categoryName between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("categoryName not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andFirstTypeIsNull() {
            addCriterion("firstType is null");
            return (Criteria) this;
        }

        public Criteria andFirstTypeIsNotNull() {
            addCriterion("firstType is not null");
            return (Criteria) this;
        }

        public Criteria andFirstTypeEqualTo(String value) {
            addCriterion("firstType =", value, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNotEqualTo(String value) {
            addCriterion("firstType <>", value, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeGreaterThan(String value) {
            addCriterion("firstType >", value, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeGreaterThanOrEqualTo(String value) {
            addCriterion("firstType >=", value, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeLessThan(String value) {
            addCriterion("firstType <", value, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeLessThanOrEqualTo(String value) {
            addCriterion("firstType <=", value, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeLike(String value) {
            addCriterion("firstType like", value, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNotLike(String value) {
            addCriterion("firstType not like", value, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeIn(List<String> values) {
            addCriterion("firstType in", values, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNotIn(List<String> values) {
            addCriterion("firstType not in", values, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeBetween(String value1, String value2) {
            addCriterion("firstType between", value1, value2, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNotBetween(String value1, String value2) {
            addCriterion("firstType not between", value1, value2, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNameIsNull() {
            addCriterion("firstTypeName is null");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNameIsNotNull() {
            addCriterion("firstTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNameEqualTo(String value) {
            addCriterion("firstTypeName =", value, "firstTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNameNotEqualTo(String value) {
            addCriterion("firstTypeName <>", value, "firstTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNameGreaterThan(String value) {
            addCriterion("firstTypeName >", value, "firstTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("firstTypeName >=", value, "firstTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNameLessThan(String value) {
            addCriterion("firstTypeName <", value, "firstTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNameLessThanOrEqualTo(String value) {
            addCriterion("firstTypeName <=", value, "firstTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNameLike(String value) {
            addCriterion("firstTypeName like", value, "firstTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNameNotLike(String value) {
            addCriterion("firstTypeName not like", value, "firstTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNameIn(List<String> values) {
            addCriterion("firstTypeName in", values, "firstTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNameNotIn(List<String> values) {
            addCriterion("firstTypeName not in", values, "firstTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNameBetween(String value1, String value2) {
            addCriterion("firstTypeName between", value1, value2, "firstTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNameNotBetween(String value1, String value2) {
            addCriterion("firstTypeName not between", value1, value2, "firstTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTypeIsNull() {
            addCriterion("secondType is null");
            return (Criteria) this;
        }

        public Criteria andSecondTypeIsNotNull() {
            addCriterion("secondType is not null");
            return (Criteria) this;
        }

        public Criteria andSecondTypeEqualTo(String value) {
            addCriterion("secondType =", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNotEqualTo(String value) {
            addCriterion("secondType <>", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeGreaterThan(String value) {
            addCriterion("secondType >", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeGreaterThanOrEqualTo(String value) {
            addCriterion("secondType >=", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeLessThan(String value) {
            addCriterion("secondType <", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeLessThanOrEqualTo(String value) {
            addCriterion("secondType <=", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeLike(String value) {
            addCriterion("secondType like", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNotLike(String value) {
            addCriterion("secondType not like", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeIn(List<String> values) {
            addCriterion("secondType in", values, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNotIn(List<String> values) {
            addCriterion("secondType not in", values, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeBetween(String value1, String value2) {
            addCriterion("secondType between", value1, value2, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNotBetween(String value1, String value2) {
            addCriterion("secondType not between", value1, value2, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNameIsNull() {
            addCriterion("secondTypeName is null");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNameIsNotNull() {
            addCriterion("secondTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNameEqualTo(String value) {
            addCriterion("secondTypeName =", value, "secondTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNameNotEqualTo(String value) {
            addCriterion("secondTypeName <>", value, "secondTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNameGreaterThan(String value) {
            addCriterion("secondTypeName >", value, "secondTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("secondTypeName >=", value, "secondTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNameLessThan(String value) {
            addCriterion("secondTypeName <", value, "secondTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNameLessThanOrEqualTo(String value) {
            addCriterion("secondTypeName <=", value, "secondTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNameLike(String value) {
            addCriterion("secondTypeName like", value, "secondTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNameNotLike(String value) {
            addCriterion("secondTypeName not like", value, "secondTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNameIn(List<String> values) {
            addCriterion("secondTypeName in", values, "secondTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNameNotIn(List<String> values) {
            addCriterion("secondTypeName not in", values, "secondTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNameBetween(String value1, String value2) {
            addCriterion("secondTypeName between", value1, value2, "secondTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNameNotBetween(String value1, String value2) {
            addCriterion("secondTypeName not between", value1, value2, "secondTypeName");
            return (Criteria) this;
        }

        public Criteria andProductClassifyIsNull() {
            addCriterion("productClassify is null");
            return (Criteria) this;
        }

        public Criteria andProductClassifyIsNotNull() {
            addCriterion("productClassify is not null");
            return (Criteria) this;
        }

        public Criteria andProductClassifyEqualTo(String value) {
            addCriterion("productClassify =", value, "productClassify");
            return (Criteria) this;
        }

        public Criteria andProductClassifyNotEqualTo(String value) {
            addCriterion("productClassify <>", value, "productClassify");
            return (Criteria) this;
        }

        public Criteria andProductClassifyGreaterThan(String value) {
            addCriterion("productClassify >", value, "productClassify");
            return (Criteria) this;
        }

        public Criteria andProductClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("productClassify >=", value, "productClassify");
            return (Criteria) this;
        }

        public Criteria andProductClassifyLessThan(String value) {
            addCriterion("productClassify <", value, "productClassify");
            return (Criteria) this;
        }

        public Criteria andProductClassifyLessThanOrEqualTo(String value) {
            addCriterion("productClassify <=", value, "productClassify");
            return (Criteria) this;
        }

        public Criteria andProductClassifyLike(String value) {
            addCriterion("productClassify like", value, "productClassify");
            return (Criteria) this;
        }

        public Criteria andProductClassifyNotLike(String value) {
            addCriterion("productClassify not like", value, "productClassify");
            return (Criteria) this;
        }

        public Criteria andProductClassifyIn(List<String> values) {
            addCriterion("productClassify in", values, "productClassify");
            return (Criteria) this;
        }

        public Criteria andProductClassifyNotIn(List<String> values) {
            addCriterion("productClassify not in", values, "productClassify");
            return (Criteria) this;
        }

        public Criteria andProductClassifyBetween(String value1, String value2) {
            addCriterion("productClassify between", value1, value2, "productClassify");
            return (Criteria) this;
        }

        public Criteria andProductClassifyNotBetween(String value1, String value2) {
            addCriterion("productClassify not between", value1, value2, "productClassify");
            return (Criteria) this;
        }

        public Criteria andFirstClassifyIsNull() {
            addCriterion("firstClassify is null");
            return (Criteria) this;
        }

        public Criteria andFirstClassifyIsNotNull() {
            addCriterion("firstClassify is not null");
            return (Criteria) this;
        }

        public Criteria andFirstClassifyEqualTo(String value) {
            addCriterion("firstClassify =", value, "firstClassify");
            return (Criteria) this;
        }

        public Criteria andFirstClassifyNotEqualTo(String value) {
            addCriterion("firstClassify <>", value, "firstClassify");
            return (Criteria) this;
        }

        public Criteria andFirstClassifyGreaterThan(String value) {
            addCriterion("firstClassify >", value, "firstClassify");
            return (Criteria) this;
        }

        public Criteria andFirstClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("firstClassify >=", value, "firstClassify");
            return (Criteria) this;
        }

        public Criteria andFirstClassifyLessThan(String value) {
            addCriterion("firstClassify <", value, "firstClassify");
            return (Criteria) this;
        }

        public Criteria andFirstClassifyLessThanOrEqualTo(String value) {
            addCriterion("firstClassify <=", value, "firstClassify");
            return (Criteria) this;
        }

        public Criteria andFirstClassifyLike(String value) {
            addCriterion("firstClassify like", value, "firstClassify");
            return (Criteria) this;
        }

        public Criteria andFirstClassifyNotLike(String value) {
            addCriterion("firstClassify not like", value, "firstClassify");
            return (Criteria) this;
        }

        public Criteria andFirstClassifyIn(List<String> values) {
            addCriterion("firstClassify in", values, "firstClassify");
            return (Criteria) this;
        }

        public Criteria andFirstClassifyNotIn(List<String> values) {
            addCriterion("firstClassify not in", values, "firstClassify");
            return (Criteria) this;
        }

        public Criteria andFirstClassifyBetween(String value1, String value2) {
            addCriterion("firstClassify between", value1, value2, "firstClassify");
            return (Criteria) this;
        }

        public Criteria andFirstClassifyNotBetween(String value1, String value2) {
            addCriterion("firstClassify not between", value1, value2, "firstClassify");
            return (Criteria) this;
        }

        public Criteria andSecondClassifyIsNull() {
            addCriterion("secondClassify is null");
            return (Criteria) this;
        }

        public Criteria andSecondClassifyIsNotNull() {
            addCriterion("secondClassify is not null");
            return (Criteria) this;
        }

        public Criteria andSecondClassifyEqualTo(String value) {
            addCriterion("secondClassify =", value, "secondClassify");
            return (Criteria) this;
        }

        public Criteria andSecondClassifyNotEqualTo(String value) {
            addCriterion("secondClassify <>", value, "secondClassify");
            return (Criteria) this;
        }

        public Criteria andSecondClassifyGreaterThan(String value) {
            addCriterion("secondClassify >", value, "secondClassify");
            return (Criteria) this;
        }

        public Criteria andSecondClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("secondClassify >=", value, "secondClassify");
            return (Criteria) this;
        }

        public Criteria andSecondClassifyLessThan(String value) {
            addCriterion("secondClassify <", value, "secondClassify");
            return (Criteria) this;
        }

        public Criteria andSecondClassifyLessThanOrEqualTo(String value) {
            addCriterion("secondClassify <=", value, "secondClassify");
            return (Criteria) this;
        }

        public Criteria andSecondClassifyLike(String value) {
            addCriterion("secondClassify like", value, "secondClassify");
            return (Criteria) this;
        }

        public Criteria andSecondClassifyNotLike(String value) {
            addCriterion("secondClassify not like", value, "secondClassify");
            return (Criteria) this;
        }

        public Criteria andSecondClassifyIn(List<String> values) {
            addCriterion("secondClassify in", values, "secondClassify");
            return (Criteria) this;
        }

        public Criteria andSecondClassifyNotIn(List<String> values) {
            addCriterion("secondClassify not in", values, "secondClassify");
            return (Criteria) this;
        }

        public Criteria andSecondClassifyBetween(String value1, String value2) {
            addCriterion("secondClassify between", value1, value2, "secondClassify");
            return (Criteria) this;
        }

        public Criteria andSecondClassifyNotBetween(String value1, String value2) {
            addCriterion("secondClassify not between", value1, value2, "secondClassify");
            return (Criteria) this;
        }

        public Criteria andLabelNameIsNull() {
            addCriterion("labelName is null");
            return (Criteria) this;
        }

        public Criteria andLabelNameIsNotNull() {
            addCriterion("labelName is not null");
            return (Criteria) this;
        }

        public Criteria andLabelNameEqualTo(String value) {
            addCriterion("labelName =", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotEqualTo(String value) {
            addCriterion("labelName <>", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameGreaterThan(String value) {
            addCriterion("labelName >", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameGreaterThanOrEqualTo(String value) {
            addCriterion("labelName >=", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLessThan(String value) {
            addCriterion("labelName <", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLessThanOrEqualTo(String value) {
            addCriterion("labelName <=", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLike(String value) {
            addCriterion("labelName like", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotLike(String value) {
            addCriterion("labelName not like", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameIn(List<String> values) {
            addCriterion("labelName in", values, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotIn(List<String> values) {
            addCriterion("labelName not in", values, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameBetween(String value1, String value2) {
            addCriterion("labelName between", value1, value2, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotBetween(String value1, String value2) {
            addCriterion("labelName not between", value1, value2, "labelName");
            return (Criteria) this;
        }

        public Criteria andGrfNameIsNull() {
            addCriterion("grfName is null");
            return (Criteria) this;
        }

        public Criteria andGrfNameIsNotNull() {
            addCriterion("grfName is not null");
            return (Criteria) this;
        }

        public Criteria andGrfNameEqualTo(String value) {
            addCriterion("grfName =", value, "grfName");
            return (Criteria) this;
        }

        public Criteria andGrfNameNotEqualTo(String value) {
            addCriterion("grfName <>", value, "grfName");
            return (Criteria) this;
        }

        public Criteria andGrfNameGreaterThan(String value) {
            addCriterion("grfName >", value, "grfName");
            return (Criteria) this;
        }

        public Criteria andGrfNameGreaterThanOrEqualTo(String value) {
            addCriterion("grfName >=", value, "grfName");
            return (Criteria) this;
        }

        public Criteria andGrfNameLessThan(String value) {
            addCriterion("grfName <", value, "grfName");
            return (Criteria) this;
        }

        public Criteria andGrfNameLessThanOrEqualTo(String value) {
            addCriterion("grfName <=", value, "grfName");
            return (Criteria) this;
        }

        public Criteria andGrfNameLike(String value) {
            addCriterion("grfName like", value, "grfName");
            return (Criteria) this;
        }

        public Criteria andGrfNameNotLike(String value) {
            addCriterion("grfName not like", value, "grfName");
            return (Criteria) this;
        }

        public Criteria andGrfNameIn(List<String> values) {
            addCriterion("grfName in", values, "grfName");
            return (Criteria) this;
        }

        public Criteria andGrfNameNotIn(List<String> values) {
            addCriterion("grfName not in", values, "grfName");
            return (Criteria) this;
        }

        public Criteria andGrfNameBetween(String value1, String value2) {
            addCriterion("grfName between", value1, value2, "grfName");
            return (Criteria) this;
        }

        public Criteria andGrfNameNotBetween(String value1, String value2) {
            addCriterion("grfName not between", value1, value2, "grfName");
            return (Criteria) this;
        }

        public Criteria andThirdClassifyIsNull() {
            addCriterion("thirdClassify is null");
            return (Criteria) this;
        }

        public Criteria andThirdClassifyIsNotNull() {
            addCriterion("thirdClassify is not null");
            return (Criteria) this;
        }

        public Criteria andThirdClassifyEqualTo(String value) {
            addCriterion("thirdClassify =", value, "thirdClassify");
            return (Criteria) this;
        }

        public Criteria andThirdClassifyNotEqualTo(String value) {
            addCriterion("thirdClassify <>", value, "thirdClassify");
            return (Criteria) this;
        }

        public Criteria andThirdClassifyGreaterThan(String value) {
            addCriterion("thirdClassify >", value, "thirdClassify");
            return (Criteria) this;
        }

        public Criteria andThirdClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("thirdClassify >=", value, "thirdClassify");
            return (Criteria) this;
        }

        public Criteria andThirdClassifyLessThan(String value) {
            addCriterion("thirdClassify <", value, "thirdClassify");
            return (Criteria) this;
        }

        public Criteria andThirdClassifyLessThanOrEqualTo(String value) {
            addCriterion("thirdClassify <=", value, "thirdClassify");
            return (Criteria) this;
        }

        public Criteria andThirdClassifyLike(String value) {
            addCriterion("thirdClassify like", value, "thirdClassify");
            return (Criteria) this;
        }

        public Criteria andThirdClassifyNotLike(String value) {
            addCriterion("thirdClassify not like", value, "thirdClassify");
            return (Criteria) this;
        }

        public Criteria andThirdClassifyIn(List<String> values) {
            addCriterion("thirdClassify in", values, "thirdClassify");
            return (Criteria) this;
        }

        public Criteria andThirdClassifyNotIn(List<String> values) {
            addCriterion("thirdClassify not in", values, "thirdClassify");
            return (Criteria) this;
        }

        public Criteria andThirdClassifyBetween(String value1, String value2) {
            addCriterion("thirdClassify between", value1, value2, "thirdClassify");
            return (Criteria) this;
        }

        public Criteria andThirdClassifyNotBetween(String value1, String value2) {
            addCriterion("thirdClassify not between", value1, value2, "thirdClassify");
            return (Criteria) this;
        }

        public Criteria andMJewelCutIsNull() {
            addCriterion("mJewelCut is null");
            return (Criteria) this;
        }

        public Criteria andMJewelCutIsNotNull() {
            addCriterion("mJewelCut is not null");
            return (Criteria) this;
        }

        public Criteria andMJewelCutEqualTo(String value) {
            addCriterion("mJewelCut =", value, "mJewelCut");
            return (Criteria) this;
        }

        public Criteria andMJewelCutNotEqualTo(String value) {
            addCriterion("mJewelCut <>", value, "mJewelCut");
            return (Criteria) this;
        }

        public Criteria andMJewelCutGreaterThan(String value) {
            addCriterion("mJewelCut >", value, "mJewelCut");
            return (Criteria) this;
        }

        public Criteria andMJewelCutGreaterThanOrEqualTo(String value) {
            addCriterion("mJewelCut >=", value, "mJewelCut");
            return (Criteria) this;
        }

        public Criteria andMJewelCutLessThan(String value) {
            addCriterion("mJewelCut <", value, "mJewelCut");
            return (Criteria) this;
        }

        public Criteria andMJewelCutLessThanOrEqualTo(String value) {
            addCriterion("mJewelCut <=", value, "mJewelCut");
            return (Criteria) this;
        }

        public Criteria andMJewelCutLike(String value) {
            addCriterion("mJewelCut like", value, "mJewelCut");
            return (Criteria) this;
        }

        public Criteria andMJewelCutNotLike(String value) {
            addCriterion("mJewelCut not like", value, "mJewelCut");
            return (Criteria) this;
        }

        public Criteria andMJewelCutIn(List<String> values) {
            addCriterion("mJewelCut in", values, "mJewelCut");
            return (Criteria) this;
        }

        public Criteria andMJewelCutNotIn(List<String> values) {
            addCriterion("mJewelCut not in", values, "mJewelCut");
            return (Criteria) this;
        }

        public Criteria andMJewelCutBetween(String value1, String value2) {
            addCriterion("mJewelCut between", value1, value2, "mJewelCut");
            return (Criteria) this;
        }

        public Criteria andMJewelCutNotBetween(String value1, String value2) {
            addCriterion("mJewelCut not between", value1, value2, "mJewelCut");
            return (Criteria) this;
        }

        public Criteria andMJewelColorIsNull() {
            addCriterion("mJewelColor is null");
            return (Criteria) this;
        }

        public Criteria andMJewelColorIsNotNull() {
            addCriterion("mJewelColor is not null");
            return (Criteria) this;
        }

        public Criteria andMJewelColorEqualTo(String value) {
            addCriterion("mJewelColor =", value, "mJewelColor");
            return (Criteria) this;
        }

        public Criteria andMJewelColorNotEqualTo(String value) {
            addCriterion("mJewelColor <>", value, "mJewelColor");
            return (Criteria) this;
        }

        public Criteria andMJewelColorGreaterThan(String value) {
            addCriterion("mJewelColor >", value, "mJewelColor");
            return (Criteria) this;
        }

        public Criteria andMJewelColorGreaterThanOrEqualTo(String value) {
            addCriterion("mJewelColor >=", value, "mJewelColor");
            return (Criteria) this;
        }

        public Criteria andMJewelColorLessThan(String value) {
            addCriterion("mJewelColor <", value, "mJewelColor");
            return (Criteria) this;
        }

        public Criteria andMJewelColorLessThanOrEqualTo(String value) {
            addCriterion("mJewelColor <=", value, "mJewelColor");
            return (Criteria) this;
        }

        public Criteria andMJewelColorLike(String value) {
            addCriterion("mJewelColor like", value, "mJewelColor");
            return (Criteria) this;
        }

        public Criteria andMJewelColorNotLike(String value) {
            addCriterion("mJewelColor not like", value, "mJewelColor");
            return (Criteria) this;
        }

        public Criteria andMJewelColorIn(List<String> values) {
            addCriterion("mJewelColor in", values, "mJewelColor");
            return (Criteria) this;
        }

        public Criteria andMJewelColorNotIn(List<String> values) {
            addCriterion("mJewelColor not in", values, "mJewelColor");
            return (Criteria) this;
        }

        public Criteria andMJewelColorBetween(String value1, String value2) {
            addCriterion("mJewelColor between", value1, value2, "mJewelColor");
            return (Criteria) this;
        }

        public Criteria andMJewelColorNotBetween(String value1, String value2) {
            addCriterion("mJewelColor not between", value1, value2, "mJewelColor");
            return (Criteria) this;
        }

        public Criteria andMJewelClarityIsNull() {
            addCriterion("mJewelClarity is null");
            return (Criteria) this;
        }

        public Criteria andMJewelClarityIsNotNull() {
            addCriterion("mJewelClarity is not null");
            return (Criteria) this;
        }

        public Criteria andMJewelClarityEqualTo(String value) {
            addCriterion("mJewelClarity =", value, "mJewelClarity");
            return (Criteria) this;
        }

        public Criteria andMJewelClarityNotEqualTo(String value) {
            addCriterion("mJewelClarity <>", value, "mJewelClarity");
            return (Criteria) this;
        }

        public Criteria andMJewelClarityGreaterThan(String value) {
            addCriterion("mJewelClarity >", value, "mJewelClarity");
            return (Criteria) this;
        }

        public Criteria andMJewelClarityGreaterThanOrEqualTo(String value) {
            addCriterion("mJewelClarity >=", value, "mJewelClarity");
            return (Criteria) this;
        }

        public Criteria andMJewelClarityLessThan(String value) {
            addCriterion("mJewelClarity <", value, "mJewelClarity");
            return (Criteria) this;
        }

        public Criteria andMJewelClarityLessThanOrEqualTo(String value) {
            addCriterion("mJewelClarity <=", value, "mJewelClarity");
            return (Criteria) this;
        }

        public Criteria andMJewelClarityLike(String value) {
            addCriterion("mJewelClarity like", value, "mJewelClarity");
            return (Criteria) this;
        }

        public Criteria andMJewelClarityNotLike(String value) {
            addCriterion("mJewelClarity not like", value, "mJewelClarity");
            return (Criteria) this;
        }

        public Criteria andMJewelClarityIn(List<String> values) {
            addCriterion("mJewelClarity in", values, "mJewelClarity");
            return (Criteria) this;
        }

        public Criteria andMJewelClarityNotIn(List<String> values) {
            addCriterion("mJewelClarity not in", values, "mJewelClarity");
            return (Criteria) this;
        }

        public Criteria andMJewelClarityBetween(String value1, String value2) {
            addCriterion("mJewelClarity between", value1, value2, "mJewelClarity");
            return (Criteria) this;
        }

        public Criteria andMJewelClarityNotBetween(String value1, String value2) {
            addCriterion("mJewelClarity not between", value1, value2, "mJewelClarity");
            return (Criteria) this;
        }

        public Criteria andMJewelFluorescentIsNull() {
            addCriterion("mJewelFluorescent is null");
            return (Criteria) this;
        }

        public Criteria andMJewelFluorescentIsNotNull() {
            addCriterion("mJewelFluorescent is not null");
            return (Criteria) this;
        }

        public Criteria andMJewelFluorescentEqualTo(String value) {
            addCriterion("mJewelFluorescent =", value, "mJewelFluorescent");
            return (Criteria) this;
        }

        public Criteria andMJewelFluorescentNotEqualTo(String value) {
            addCriterion("mJewelFluorescent <>", value, "mJewelFluorescent");
            return (Criteria) this;
        }

        public Criteria andMJewelFluorescentGreaterThan(String value) {
            addCriterion("mJewelFluorescent >", value, "mJewelFluorescent");
            return (Criteria) this;
        }

        public Criteria andMJewelFluorescentGreaterThanOrEqualTo(String value) {
            addCriterion("mJewelFluorescent >=", value, "mJewelFluorescent");
            return (Criteria) this;
        }

        public Criteria andMJewelFluorescentLessThan(String value) {
            addCriterion("mJewelFluorescent <", value, "mJewelFluorescent");
            return (Criteria) this;
        }

        public Criteria andMJewelFluorescentLessThanOrEqualTo(String value) {
            addCriterion("mJewelFluorescent <=", value, "mJewelFluorescent");
            return (Criteria) this;
        }

        public Criteria andMJewelFluorescentLike(String value) {
            addCriterion("mJewelFluorescent like", value, "mJewelFluorescent");
            return (Criteria) this;
        }

        public Criteria andMJewelFluorescentNotLike(String value) {
            addCriterion("mJewelFluorescent not like", value, "mJewelFluorescent");
            return (Criteria) this;
        }

        public Criteria andMJewelFluorescentIn(List<String> values) {
            addCriterion("mJewelFluorescent in", values, "mJewelFluorescent");
            return (Criteria) this;
        }

        public Criteria andMJewelFluorescentNotIn(List<String> values) {
            addCriterion("mJewelFluorescent not in", values, "mJewelFluorescent");
            return (Criteria) this;
        }

        public Criteria andMJewelFluorescentBetween(String value1, String value2) {
            addCriterion("mJewelFluorescent between", value1, value2, "mJewelFluorescent");
            return (Criteria) this;
        }

        public Criteria andMJewelFluorescentNotBetween(String value1, String value2) {
            addCriterion("mJewelFluorescent not between", value1, value2, "mJewelFluorescent");
            return (Criteria) this;
        }

        public Criteria andMJewelBurnishedIsNull() {
            addCriterion("mJewelBurnished is null");
            return (Criteria) this;
        }

        public Criteria andMJewelBurnishedIsNotNull() {
            addCriterion("mJewelBurnished is not null");
            return (Criteria) this;
        }

        public Criteria andMJewelBurnishedEqualTo(String value) {
            addCriterion("mJewelBurnished =", value, "mJewelBurnished");
            return (Criteria) this;
        }

        public Criteria andMJewelBurnishedNotEqualTo(String value) {
            addCriterion("mJewelBurnished <>", value, "mJewelBurnished");
            return (Criteria) this;
        }

        public Criteria andMJewelBurnishedGreaterThan(String value) {
            addCriterion("mJewelBurnished >", value, "mJewelBurnished");
            return (Criteria) this;
        }

        public Criteria andMJewelBurnishedGreaterThanOrEqualTo(String value) {
            addCriterion("mJewelBurnished >=", value, "mJewelBurnished");
            return (Criteria) this;
        }

        public Criteria andMJewelBurnishedLessThan(String value) {
            addCriterion("mJewelBurnished <", value, "mJewelBurnished");
            return (Criteria) this;
        }

        public Criteria andMJewelBurnishedLessThanOrEqualTo(String value) {
            addCriterion("mJewelBurnished <=", value, "mJewelBurnished");
            return (Criteria) this;
        }

        public Criteria andMJewelBurnishedLike(String value) {
            addCriterion("mJewelBurnished like", value, "mJewelBurnished");
            return (Criteria) this;
        }

        public Criteria andMJewelBurnishedNotLike(String value) {
            addCriterion("mJewelBurnished not like", value, "mJewelBurnished");
            return (Criteria) this;
        }

        public Criteria andMJewelBurnishedIn(List<String> values) {
            addCriterion("mJewelBurnished in", values, "mJewelBurnished");
            return (Criteria) this;
        }

        public Criteria andMJewelBurnishedNotIn(List<String> values) {
            addCriterion("mJewelBurnished not in", values, "mJewelBurnished");
            return (Criteria) this;
        }

        public Criteria andMJewelBurnishedBetween(String value1, String value2) {
            addCriterion("mJewelBurnished between", value1, value2, "mJewelBurnished");
            return (Criteria) this;
        }

        public Criteria andMJewelBurnishedNotBetween(String value1, String value2) {
            addCriterion("mJewelBurnished not between", value1, value2, "mJewelBurnished");
            return (Criteria) this;
        }

        public Criteria andMJewelShapeIsNull() {
            addCriterion("mJewelShape is null");
            return (Criteria) this;
        }

        public Criteria andMJewelShapeIsNotNull() {
            addCriterion("mJewelShape is not null");
            return (Criteria) this;
        }

        public Criteria andMJewelShapeEqualTo(String value) {
            addCriterion("mJewelShape =", value, "mJewelShape");
            return (Criteria) this;
        }

        public Criteria andMJewelShapeNotEqualTo(String value) {
            addCriterion("mJewelShape <>", value, "mJewelShape");
            return (Criteria) this;
        }

        public Criteria andMJewelShapeGreaterThan(String value) {
            addCriterion("mJewelShape >", value, "mJewelShape");
            return (Criteria) this;
        }

        public Criteria andMJewelShapeGreaterThanOrEqualTo(String value) {
            addCriterion("mJewelShape >=", value, "mJewelShape");
            return (Criteria) this;
        }

        public Criteria andMJewelShapeLessThan(String value) {
            addCriterion("mJewelShape <", value, "mJewelShape");
            return (Criteria) this;
        }

        public Criteria andMJewelShapeLessThanOrEqualTo(String value) {
            addCriterion("mJewelShape <=", value, "mJewelShape");
            return (Criteria) this;
        }

        public Criteria andMJewelShapeLike(String value) {
            addCriterion("mJewelShape like", value, "mJewelShape");
            return (Criteria) this;
        }

        public Criteria andMJewelShapeNotLike(String value) {
            addCriterion("mJewelShape not like", value, "mJewelShape");
            return (Criteria) this;
        }

        public Criteria andMJewelShapeIn(List<String> values) {
            addCriterion("mJewelShape in", values, "mJewelShape");
            return (Criteria) this;
        }

        public Criteria andMJewelShapeNotIn(List<String> values) {
            addCriterion("mJewelShape not in", values, "mJewelShape");
            return (Criteria) this;
        }

        public Criteria andMJewelShapeBetween(String value1, String value2) {
            addCriterion("mJewelShape between", value1, value2, "mJewelShape");
            return (Criteria) this;
        }

        public Criteria andMJewelShapeNotBetween(String value1, String value2) {
            addCriterion("mJewelShape not between", value1, value2, "mJewelShape");
            return (Criteria) this;
        }

        public Criteria andMJewelNameIsNull() {
            addCriterion("mJewelName is null");
            return (Criteria) this;
        }

        public Criteria andMJewelNameIsNotNull() {
            addCriterion("mJewelName is not null");
            return (Criteria) this;
        }

        public Criteria andMJewelNameEqualTo(String value) {
            addCriterion("mJewelName =", value, "mJewelName");
            return (Criteria) this;
        }

        public Criteria andMJewelNameNotEqualTo(String value) {
            addCriterion("mJewelName <>", value, "mJewelName");
            return (Criteria) this;
        }

        public Criteria andMJewelNameGreaterThan(String value) {
            addCriterion("mJewelName >", value, "mJewelName");
            return (Criteria) this;
        }

        public Criteria andMJewelNameGreaterThanOrEqualTo(String value) {
            addCriterion("mJewelName >=", value, "mJewelName");
            return (Criteria) this;
        }

        public Criteria andMJewelNameLessThan(String value) {
            addCriterion("mJewelName <", value, "mJewelName");
            return (Criteria) this;
        }

        public Criteria andMJewelNameLessThanOrEqualTo(String value) {
            addCriterion("mJewelName <=", value, "mJewelName");
            return (Criteria) this;
        }

        public Criteria andMJewelNameLike(String value) {
            addCriterion("mJewelName like", value, "mJewelName");
            return (Criteria) this;
        }

        public Criteria andMJewelNameNotLike(String value) {
            addCriterion("mJewelName not like", value, "mJewelName");
            return (Criteria) this;
        }

        public Criteria andMJewelNameIn(List<String> values) {
            addCriterion("mJewelName in", values, "mJewelName");
            return (Criteria) this;
        }

        public Criteria andMJewelNameNotIn(List<String> values) {
            addCriterion("mJewelName not in", values, "mJewelName");
            return (Criteria) this;
        }

        public Criteria andMJewelNameBetween(String value1, String value2) {
            addCriterion("mJewelName between", value1, value2, "mJewelName");
            return (Criteria) this;
        }

        public Criteria andMJewelNameNotBetween(String value1, String value2) {
            addCriterion("mJewelName not between", value1, value2, "mJewelName");
            return (Criteria) this;
        }

        public Criteria andMJewelNoIsNull() {
            addCriterion("mJewelNo is null");
            return (Criteria) this;
        }

        public Criteria andMJewelNoIsNotNull() {
            addCriterion("mJewelNo is not null");
            return (Criteria) this;
        }

        public Criteria andMJewelNoEqualTo(String value) {
            addCriterion("mJewelNo =", value, "mJewelNo");
            return (Criteria) this;
        }

        public Criteria andMJewelNoNotEqualTo(String value) {
            addCriterion("mJewelNo <>", value, "mJewelNo");
            return (Criteria) this;
        }

        public Criteria andMJewelNoGreaterThan(String value) {
            addCriterion("mJewelNo >", value, "mJewelNo");
            return (Criteria) this;
        }

        public Criteria andMJewelNoGreaterThanOrEqualTo(String value) {
            addCriterion("mJewelNo >=", value, "mJewelNo");
            return (Criteria) this;
        }

        public Criteria andMJewelNoLessThan(String value) {
            addCriterion("mJewelNo <", value, "mJewelNo");
            return (Criteria) this;
        }

        public Criteria andMJewelNoLessThanOrEqualTo(String value) {
            addCriterion("mJewelNo <=", value, "mJewelNo");
            return (Criteria) this;
        }

        public Criteria andMJewelNoLike(String value) {
            addCriterion("mJewelNo like", value, "mJewelNo");
            return (Criteria) this;
        }

        public Criteria andMJewelNoNotLike(String value) {
            addCriterion("mJewelNo not like", value, "mJewelNo");
            return (Criteria) this;
        }

        public Criteria andMJewelNoIn(List<String> values) {
            addCriterion("mJewelNo in", values, "mJewelNo");
            return (Criteria) this;
        }

        public Criteria andMJewelNoNotIn(List<String> values) {
            addCriterion("mJewelNo not in", values, "mJewelNo");
            return (Criteria) this;
        }

        public Criteria andMJewelNoBetween(String value1, String value2) {
            addCriterion("mJewelNo between", value1, value2, "mJewelNo");
            return (Criteria) this;
        }

        public Criteria andMJewelNoNotBetween(String value1, String value2) {
            addCriterion("mJewelNo not between", value1, value2, "mJewelNo");
            return (Criteria) this;
        }

        public Criteria andMJewelSpecifiIsNull() {
            addCriterion("mJewelSpecifi is null");
            return (Criteria) this;
        }

        public Criteria andMJewelSpecifiIsNotNull() {
            addCriterion("mJewelSpecifi is not null");
            return (Criteria) this;
        }

        public Criteria andMJewelSpecifiEqualTo(String value) {
            addCriterion("mJewelSpecifi =", value, "mJewelSpecifi");
            return (Criteria) this;
        }

        public Criteria andMJewelSpecifiNotEqualTo(String value) {
            addCriterion("mJewelSpecifi <>", value, "mJewelSpecifi");
            return (Criteria) this;
        }

        public Criteria andMJewelSpecifiGreaterThan(String value) {
            addCriterion("mJewelSpecifi >", value, "mJewelSpecifi");
            return (Criteria) this;
        }

        public Criteria andMJewelSpecifiGreaterThanOrEqualTo(String value) {
            addCriterion("mJewelSpecifi >=", value, "mJewelSpecifi");
            return (Criteria) this;
        }

        public Criteria andMJewelSpecifiLessThan(String value) {
            addCriterion("mJewelSpecifi <", value, "mJewelSpecifi");
            return (Criteria) this;
        }

        public Criteria andMJewelSpecifiLessThanOrEqualTo(String value) {
            addCriterion("mJewelSpecifi <=", value, "mJewelSpecifi");
            return (Criteria) this;
        }

        public Criteria andMJewelSpecifiLike(String value) {
            addCriterion("mJewelSpecifi like", value, "mJewelSpecifi");
            return (Criteria) this;
        }

        public Criteria andMJewelSpecifiNotLike(String value) {
            addCriterion("mJewelSpecifi not like", value, "mJewelSpecifi");
            return (Criteria) this;
        }

        public Criteria andMJewelSpecifiIn(List<String> values) {
            addCriterion("mJewelSpecifi in", values, "mJewelSpecifi");
            return (Criteria) this;
        }

        public Criteria andMJewelSpecifiNotIn(List<String> values) {
            addCriterion("mJewelSpecifi not in", values, "mJewelSpecifi");
            return (Criteria) this;
        }

        public Criteria andMJewelSpecifiBetween(String value1, String value2) {
            addCriterion("mJewelSpecifi between", value1, value2, "mJewelSpecifi");
            return (Criteria) this;
        }

        public Criteria andMJewelSpecifiNotBetween(String value1, String value2) {
            addCriterion("mJewelSpecifi not between", value1, value2, "mJewelSpecifi");
            return (Criteria) this;
        }

        public Criteria andMJewelNumIsNull() {
            addCriterion("mJewelNum is null");
            return (Criteria) this;
        }

        public Criteria andMJewelNumIsNotNull() {
            addCriterion("mJewelNum is not null");
            return (Criteria) this;
        }

        public Criteria andMJewelNumEqualTo(Integer value) {
            addCriterion("mJewelNum =", value, "mJewelNum");
            return (Criteria) this;
        }

        public Criteria andMJewelNumNotEqualTo(Integer value) {
            addCriterion("mJewelNum <>", value, "mJewelNum");
            return (Criteria) this;
        }

        public Criteria andMJewelNumGreaterThan(Integer value) {
            addCriterion("mJewelNum >", value, "mJewelNum");
            return (Criteria) this;
        }

        public Criteria andMJewelNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("mJewelNum >=", value, "mJewelNum");
            return (Criteria) this;
        }

        public Criteria andMJewelNumLessThan(Integer value) {
            addCriterion("mJewelNum <", value, "mJewelNum");
            return (Criteria) this;
        }

        public Criteria andMJewelNumLessThanOrEqualTo(Integer value) {
            addCriterion("mJewelNum <=", value, "mJewelNum");
            return (Criteria) this;
        }

        public Criteria andMJewelNumIn(List<Integer> values) {
            addCriterion("mJewelNum in", values, "mJewelNum");
            return (Criteria) this;
        }

        public Criteria andMJewelNumNotIn(List<Integer> values) {
            addCriterion("mJewelNum not in", values, "mJewelNum");
            return (Criteria) this;
        }

        public Criteria andMJewelNumBetween(Integer value1, Integer value2) {
            addCriterion("mJewelNum between", value1, value2, "mJewelNum");
            return (Criteria) this;
        }

        public Criteria andMJewelNumNotBetween(Integer value1, Integer value2) {
            addCriterion("mJewelNum not between", value1, value2, "mJewelNum");
            return (Criteria) this;
        }

        public Criteria andMJewelWeightIsNull() {
            addCriterion("mJewelWeight is null");
            return (Criteria) this;
        }

        public Criteria andMJewelWeightIsNotNull() {
            addCriterion("mJewelWeight is not null");
            return (Criteria) this;
        }

        public Criteria andMJewelWeightEqualTo(Double value) {
            addCriterion("mJewelWeight =", value, "mJewelWeight");
            return (Criteria) this;
        }

        public Criteria andMJewelWeightNotEqualTo(Double value) {
            addCriterion("mJewelWeight <>", value, "mJewelWeight");
            return (Criteria) this;
        }

        public Criteria andMJewelWeightGreaterThan(Double value) {
            addCriterion("mJewelWeight >", value, "mJewelWeight");
            return (Criteria) this;
        }

        public Criteria andMJewelWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("mJewelWeight >=", value, "mJewelWeight");
            return (Criteria) this;
        }

        public Criteria andMJewelWeightLessThan(Double value) {
            addCriterion("mJewelWeight <", value, "mJewelWeight");
            return (Criteria) this;
        }

        public Criteria andMJewelWeightLessThanOrEqualTo(Double value) {
            addCriterion("mJewelWeight <=", value, "mJewelWeight");
            return (Criteria) this;
        }

        public Criteria andMJewelWeightIn(List<Double> values) {
            addCriterion("mJewelWeight in", values, "mJewelWeight");
            return (Criteria) this;
        }

        public Criteria andMJewelWeightNotIn(List<Double> values) {
            addCriterion("mJewelWeight not in", values, "mJewelWeight");
            return (Criteria) this;
        }

        public Criteria andMJewelWeightBetween(Double value1, Double value2) {
            addCriterion("mJewelWeight between", value1, value2, "mJewelWeight");
            return (Criteria) this;
        }

        public Criteria andMJewelWeightNotBetween(Double value1, Double value2) {
            addCriterion("mJewelWeight not between", value1, value2, "mJewelWeight");
            return (Criteria) this;
        }

        public Criteria andMJewelPriceIsNull() {
            addCriterion("mJewelPrice is null");
            return (Criteria) this;
        }

        public Criteria andMJewelPriceIsNotNull() {
            addCriterion("mJewelPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMJewelPriceEqualTo(Double value) {
            addCriterion("mJewelPrice =", value, "mJewelPrice");
            return (Criteria) this;
        }

        public Criteria andMJewelPriceNotEqualTo(Double value) {
            addCriterion("mJewelPrice <>", value, "mJewelPrice");
            return (Criteria) this;
        }

        public Criteria andMJewelPriceGreaterThan(Double value) {
            addCriterion("mJewelPrice >", value, "mJewelPrice");
            return (Criteria) this;
        }

        public Criteria andMJewelPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("mJewelPrice >=", value, "mJewelPrice");
            return (Criteria) this;
        }

        public Criteria andMJewelPriceLessThan(Double value) {
            addCriterion("mJewelPrice <", value, "mJewelPrice");
            return (Criteria) this;
        }

        public Criteria andMJewelPriceLessThanOrEqualTo(Double value) {
            addCriterion("mJewelPrice <=", value, "mJewelPrice");
            return (Criteria) this;
        }

        public Criteria andMJewelPriceIn(List<Double> values) {
            addCriterion("mJewelPrice in", values, "mJewelPrice");
            return (Criteria) this;
        }

        public Criteria andMJewelPriceNotIn(List<Double> values) {
            addCriterion("mJewelPrice not in", values, "mJewelPrice");
            return (Criteria) this;
        }

        public Criteria andMJewelPriceBetween(Double value1, Double value2) {
            addCriterion("mJewelPrice between", value1, value2, "mJewelPrice");
            return (Criteria) this;
        }

        public Criteria andMJewelPriceNotBetween(Double value1, Double value2) {
            addCriterion("mJewelPrice not between", value1, value2, "mJewelPrice");
            return (Criteria) this;
        }

        public Criteria andMJewelFeeIsNull() {
            addCriterion("mJewelFee is null");
            return (Criteria) this;
        }

        public Criteria andMJewelFeeIsNotNull() {
            addCriterion("mJewelFee is not null");
            return (Criteria) this;
        }

        public Criteria andMJewelFeeEqualTo(Double value) {
            addCriterion("mJewelFee =", value, "mJewelFee");
            return (Criteria) this;
        }

        public Criteria andMJewelFeeNotEqualTo(Double value) {
            addCriterion("mJewelFee <>", value, "mJewelFee");
            return (Criteria) this;
        }

        public Criteria andMJewelFeeGreaterThan(Double value) {
            addCriterion("mJewelFee >", value, "mJewelFee");
            return (Criteria) this;
        }

        public Criteria andMJewelFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("mJewelFee >=", value, "mJewelFee");
            return (Criteria) this;
        }

        public Criteria andMJewelFeeLessThan(Double value) {
            addCriterion("mJewelFee <", value, "mJewelFee");
            return (Criteria) this;
        }

        public Criteria andMJewelFeeLessThanOrEqualTo(Double value) {
            addCriterion("mJewelFee <=", value, "mJewelFee");
            return (Criteria) this;
        }

        public Criteria andMJewelFeeIn(List<Double> values) {
            addCriterion("mJewelFee in", values, "mJewelFee");
            return (Criteria) this;
        }

        public Criteria andMJewelFeeNotIn(List<Double> values) {
            addCriterion("mJewelFee not in", values, "mJewelFee");
            return (Criteria) this;
        }

        public Criteria andMJewelFeeBetween(Double value1, Double value2) {
            addCriterion("mJewelFee between", value1, value2, "mJewelFee");
            return (Criteria) this;
        }

        public Criteria andMJewelFeeNotBetween(Double value1, Double value2) {
            addCriterion("mJewelFee not between", value1, value2, "mJewelFee");
            return (Criteria) this;
        }

        public Criteria andSJewel1NameIsNull() {
            addCriterion("sJewel1Name is null");
            return (Criteria) this;
        }

        public Criteria andSJewel1NameIsNotNull() {
            addCriterion("sJewel1Name is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel1NameEqualTo(String value) {
            addCriterion("sJewel1Name =", value, "sJewel1Name");
            return (Criteria) this;
        }

        public Criteria andSJewel1NameNotEqualTo(String value) {
            addCriterion("sJewel1Name <>", value, "sJewel1Name");
            return (Criteria) this;
        }

        public Criteria andSJewel1NameGreaterThan(String value) {
            addCriterion("sJewel1Name >", value, "sJewel1Name");
            return (Criteria) this;
        }

        public Criteria andSJewel1NameGreaterThanOrEqualTo(String value) {
            addCriterion("sJewel1Name >=", value, "sJewel1Name");
            return (Criteria) this;
        }

        public Criteria andSJewel1NameLessThan(String value) {
            addCriterion("sJewel1Name <", value, "sJewel1Name");
            return (Criteria) this;
        }

        public Criteria andSJewel1NameLessThanOrEqualTo(String value) {
            addCriterion("sJewel1Name <=", value, "sJewel1Name");
            return (Criteria) this;
        }

        public Criteria andSJewel1NameLike(String value) {
            addCriterion("sJewel1Name like", value, "sJewel1Name");
            return (Criteria) this;
        }

        public Criteria andSJewel1NameNotLike(String value) {
            addCriterion("sJewel1Name not like", value, "sJewel1Name");
            return (Criteria) this;
        }

        public Criteria andSJewel1NameIn(List<String> values) {
            addCriterion("sJewel1Name in", values, "sJewel1Name");
            return (Criteria) this;
        }

        public Criteria andSJewel1NameNotIn(List<String> values) {
            addCriterion("sJewel1Name not in", values, "sJewel1Name");
            return (Criteria) this;
        }

        public Criteria andSJewel1NameBetween(String value1, String value2) {
            addCriterion("sJewel1Name between", value1, value2, "sJewel1Name");
            return (Criteria) this;
        }

        public Criteria andSJewel1NameNotBetween(String value1, String value2) {
            addCriterion("sJewel1Name not between", value1, value2, "sJewel1Name");
            return (Criteria) this;
        }

        public Criteria andSJewel1NoIsNull() {
            addCriterion("sJewel1No is null");
            return (Criteria) this;
        }

        public Criteria andSJewel1NoIsNotNull() {
            addCriterion("sJewel1No is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel1NoEqualTo(String value) {
            addCriterion("sJewel1No =", value, "sJewel1No");
            return (Criteria) this;
        }

        public Criteria andSJewel1NoNotEqualTo(String value) {
            addCriterion("sJewel1No <>", value, "sJewel1No");
            return (Criteria) this;
        }

        public Criteria andSJewel1NoGreaterThan(String value) {
            addCriterion("sJewel1No >", value, "sJewel1No");
            return (Criteria) this;
        }

        public Criteria andSJewel1NoGreaterThanOrEqualTo(String value) {
            addCriterion("sJewel1No >=", value, "sJewel1No");
            return (Criteria) this;
        }

        public Criteria andSJewel1NoLessThan(String value) {
            addCriterion("sJewel1No <", value, "sJewel1No");
            return (Criteria) this;
        }

        public Criteria andSJewel1NoLessThanOrEqualTo(String value) {
            addCriterion("sJewel1No <=", value, "sJewel1No");
            return (Criteria) this;
        }

        public Criteria andSJewel1NoLike(String value) {
            addCriterion("sJewel1No like", value, "sJewel1No");
            return (Criteria) this;
        }

        public Criteria andSJewel1NoNotLike(String value) {
            addCriterion("sJewel1No not like", value, "sJewel1No");
            return (Criteria) this;
        }

        public Criteria andSJewel1NoIn(List<String> values) {
            addCriterion("sJewel1No in", values, "sJewel1No");
            return (Criteria) this;
        }

        public Criteria andSJewel1NoNotIn(List<String> values) {
            addCriterion("sJewel1No not in", values, "sJewel1No");
            return (Criteria) this;
        }

        public Criteria andSJewel1NoBetween(String value1, String value2) {
            addCriterion("sJewel1No between", value1, value2, "sJewel1No");
            return (Criteria) this;
        }

        public Criteria andSJewel1NoNotBetween(String value1, String value2) {
            addCriterion("sJewel1No not between", value1, value2, "sJewel1No");
            return (Criteria) this;
        }

        public Criteria andSJewel1SpecifiIsNull() {
            addCriterion("sJewel1Specifi is null");
            return (Criteria) this;
        }

        public Criteria andSJewel1SpecifiIsNotNull() {
            addCriterion("sJewel1Specifi is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel1SpecifiEqualTo(String value) {
            addCriterion("sJewel1Specifi =", value, "sJewel1Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel1SpecifiNotEqualTo(String value) {
            addCriterion("sJewel1Specifi <>", value, "sJewel1Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel1SpecifiGreaterThan(String value) {
            addCriterion("sJewel1Specifi >", value, "sJewel1Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel1SpecifiGreaterThanOrEqualTo(String value) {
            addCriterion("sJewel1Specifi >=", value, "sJewel1Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel1SpecifiLessThan(String value) {
            addCriterion("sJewel1Specifi <", value, "sJewel1Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel1SpecifiLessThanOrEqualTo(String value) {
            addCriterion("sJewel1Specifi <=", value, "sJewel1Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel1SpecifiLike(String value) {
            addCriterion("sJewel1Specifi like", value, "sJewel1Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel1SpecifiNotLike(String value) {
            addCriterion("sJewel1Specifi not like", value, "sJewel1Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel1SpecifiIn(List<String> values) {
            addCriterion("sJewel1Specifi in", values, "sJewel1Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel1SpecifiNotIn(List<String> values) {
            addCriterion("sJewel1Specifi not in", values, "sJewel1Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel1SpecifiBetween(String value1, String value2) {
            addCriterion("sJewel1Specifi between", value1, value2, "sJewel1Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel1SpecifiNotBetween(String value1, String value2) {
            addCriterion("sJewel1Specifi not between", value1, value2, "sJewel1Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel1NumIsNull() {
            addCriterion("sJewel1Num is null");
            return (Criteria) this;
        }

        public Criteria andSJewel1NumIsNotNull() {
            addCriterion("sJewel1Num is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel1NumEqualTo(Integer value) {
            addCriterion("sJewel1Num =", value, "sJewel1Num");
            return (Criteria) this;
        }

        public Criteria andSJewel1NumNotEqualTo(Integer value) {
            addCriterion("sJewel1Num <>", value, "sJewel1Num");
            return (Criteria) this;
        }

        public Criteria andSJewel1NumGreaterThan(Integer value) {
            addCriterion("sJewel1Num >", value, "sJewel1Num");
            return (Criteria) this;
        }

        public Criteria andSJewel1NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sJewel1Num >=", value, "sJewel1Num");
            return (Criteria) this;
        }

        public Criteria andSJewel1NumLessThan(Integer value) {
            addCriterion("sJewel1Num <", value, "sJewel1Num");
            return (Criteria) this;
        }

        public Criteria andSJewel1NumLessThanOrEqualTo(Integer value) {
            addCriterion("sJewel1Num <=", value, "sJewel1Num");
            return (Criteria) this;
        }

        public Criteria andSJewel1NumIn(List<Integer> values) {
            addCriterion("sJewel1Num in", values, "sJewel1Num");
            return (Criteria) this;
        }

        public Criteria andSJewel1NumNotIn(List<Integer> values) {
            addCriterion("sJewel1Num not in", values, "sJewel1Num");
            return (Criteria) this;
        }

        public Criteria andSJewel1NumBetween(Integer value1, Integer value2) {
            addCriterion("sJewel1Num between", value1, value2, "sJewel1Num");
            return (Criteria) this;
        }

        public Criteria andSJewel1NumNotBetween(Integer value1, Integer value2) {
            addCriterion("sJewel1Num not between", value1, value2, "sJewel1Num");
            return (Criteria) this;
        }

        public Criteria andSJewel1WeightIsNull() {
            addCriterion("sJewel1Weight is null");
            return (Criteria) this;
        }

        public Criteria andSJewel1WeightIsNotNull() {
            addCriterion("sJewel1Weight is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel1WeightEqualTo(Double value) {
            addCriterion("sJewel1Weight =", value, "sJewel1Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel1WeightNotEqualTo(Double value) {
            addCriterion("sJewel1Weight <>", value, "sJewel1Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel1WeightGreaterThan(Double value) {
            addCriterion("sJewel1Weight >", value, "sJewel1Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel1WeightGreaterThanOrEqualTo(Double value) {
            addCriterion("sJewel1Weight >=", value, "sJewel1Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel1WeightLessThan(Double value) {
            addCriterion("sJewel1Weight <", value, "sJewel1Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel1WeightLessThanOrEqualTo(Double value) {
            addCriterion("sJewel1Weight <=", value, "sJewel1Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel1WeightIn(List<Double> values) {
            addCriterion("sJewel1Weight in", values, "sJewel1Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel1WeightNotIn(List<Double> values) {
            addCriterion("sJewel1Weight not in", values, "sJewel1Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel1WeightBetween(Double value1, Double value2) {
            addCriterion("sJewel1Weight between", value1, value2, "sJewel1Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel1WeightNotBetween(Double value1, Double value2) {
            addCriterion("sJewel1Weight not between", value1, value2, "sJewel1Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel1PriceIsNull() {
            addCriterion("sJewel1Price is null");
            return (Criteria) this;
        }

        public Criteria andSJewel1PriceIsNotNull() {
            addCriterion("sJewel1Price is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel1PriceEqualTo(Double value) {
            addCriterion("sJewel1Price =", value, "sJewel1Price");
            return (Criteria) this;
        }

        public Criteria andSJewel1PriceNotEqualTo(Double value) {
            addCriterion("sJewel1Price <>", value, "sJewel1Price");
            return (Criteria) this;
        }

        public Criteria andSJewel1PriceGreaterThan(Double value) {
            addCriterion("sJewel1Price >", value, "sJewel1Price");
            return (Criteria) this;
        }

        public Criteria andSJewel1PriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sJewel1Price >=", value, "sJewel1Price");
            return (Criteria) this;
        }

        public Criteria andSJewel1PriceLessThan(Double value) {
            addCriterion("sJewel1Price <", value, "sJewel1Price");
            return (Criteria) this;
        }

        public Criteria andSJewel1PriceLessThanOrEqualTo(Double value) {
            addCriterion("sJewel1Price <=", value, "sJewel1Price");
            return (Criteria) this;
        }

        public Criteria andSJewel1PriceIn(List<Double> values) {
            addCriterion("sJewel1Price in", values, "sJewel1Price");
            return (Criteria) this;
        }

        public Criteria andSJewel1PriceNotIn(List<Double> values) {
            addCriterion("sJewel1Price not in", values, "sJewel1Price");
            return (Criteria) this;
        }

        public Criteria andSJewel1PriceBetween(Double value1, Double value2) {
            addCriterion("sJewel1Price between", value1, value2, "sJewel1Price");
            return (Criteria) this;
        }

        public Criteria andSJewel1PriceNotBetween(Double value1, Double value2) {
            addCriterion("sJewel1Price not between", value1, value2, "sJewel1Price");
            return (Criteria) this;
        }

        public Criteria andSJewel1FeeIsNull() {
            addCriterion("sJewel1Fee is null");
            return (Criteria) this;
        }

        public Criteria andSJewel1FeeIsNotNull() {
            addCriterion("sJewel1Fee is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel1FeeEqualTo(Double value) {
            addCriterion("sJewel1Fee =", value, "sJewel1Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel1FeeNotEqualTo(Double value) {
            addCriterion("sJewel1Fee <>", value, "sJewel1Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel1FeeGreaterThan(Double value) {
            addCriterion("sJewel1Fee >", value, "sJewel1Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel1FeeGreaterThanOrEqualTo(Double value) {
            addCriterion("sJewel1Fee >=", value, "sJewel1Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel1FeeLessThan(Double value) {
            addCriterion("sJewel1Fee <", value, "sJewel1Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel1FeeLessThanOrEqualTo(Double value) {
            addCriterion("sJewel1Fee <=", value, "sJewel1Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel1FeeIn(List<Double> values) {
            addCriterion("sJewel1Fee in", values, "sJewel1Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel1FeeNotIn(List<Double> values) {
            addCriterion("sJewel1Fee not in", values, "sJewel1Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel1FeeBetween(Double value1, Double value2) {
            addCriterion("sJewel1Fee between", value1, value2, "sJewel1Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel1FeeNotBetween(Double value1, Double value2) {
            addCriterion("sJewel1Fee not between", value1, value2, "sJewel1Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel2NameIsNull() {
            addCriterion("sJewel2Name is null");
            return (Criteria) this;
        }

        public Criteria andSJewel2NameIsNotNull() {
            addCriterion("sJewel2Name is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel2NameEqualTo(String value) {
            addCriterion("sJewel2Name =", value, "sJewel2Name");
            return (Criteria) this;
        }

        public Criteria andSJewel2NameNotEqualTo(String value) {
            addCriterion("sJewel2Name <>", value, "sJewel2Name");
            return (Criteria) this;
        }

        public Criteria andSJewel2NameGreaterThan(String value) {
            addCriterion("sJewel2Name >", value, "sJewel2Name");
            return (Criteria) this;
        }

        public Criteria andSJewel2NameGreaterThanOrEqualTo(String value) {
            addCriterion("sJewel2Name >=", value, "sJewel2Name");
            return (Criteria) this;
        }

        public Criteria andSJewel2NameLessThan(String value) {
            addCriterion("sJewel2Name <", value, "sJewel2Name");
            return (Criteria) this;
        }

        public Criteria andSJewel2NameLessThanOrEqualTo(String value) {
            addCriterion("sJewel2Name <=", value, "sJewel2Name");
            return (Criteria) this;
        }

        public Criteria andSJewel2NameLike(String value) {
            addCriterion("sJewel2Name like", value, "sJewel2Name");
            return (Criteria) this;
        }

        public Criteria andSJewel2NameNotLike(String value) {
            addCriterion("sJewel2Name not like", value, "sJewel2Name");
            return (Criteria) this;
        }

        public Criteria andSJewel2NameIn(List<String> values) {
            addCriterion("sJewel2Name in", values, "sJewel2Name");
            return (Criteria) this;
        }

        public Criteria andSJewel2NameNotIn(List<String> values) {
            addCriterion("sJewel2Name not in", values, "sJewel2Name");
            return (Criteria) this;
        }

        public Criteria andSJewel2NameBetween(String value1, String value2) {
            addCriterion("sJewel2Name between", value1, value2, "sJewel2Name");
            return (Criteria) this;
        }

        public Criteria andSJewel2NameNotBetween(String value1, String value2) {
            addCriterion("sJewel2Name not between", value1, value2, "sJewel2Name");
            return (Criteria) this;
        }

        public Criteria andSJewel2NoIsNull() {
            addCriterion("sJewel2No is null");
            return (Criteria) this;
        }

        public Criteria andSJewel2NoIsNotNull() {
            addCriterion("sJewel2No is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel2NoEqualTo(String value) {
            addCriterion("sJewel2No =", value, "sJewel2No");
            return (Criteria) this;
        }

        public Criteria andSJewel2NoNotEqualTo(String value) {
            addCriterion("sJewel2No <>", value, "sJewel2No");
            return (Criteria) this;
        }

        public Criteria andSJewel2NoGreaterThan(String value) {
            addCriterion("sJewel2No >", value, "sJewel2No");
            return (Criteria) this;
        }

        public Criteria andSJewel2NoGreaterThanOrEqualTo(String value) {
            addCriterion("sJewel2No >=", value, "sJewel2No");
            return (Criteria) this;
        }

        public Criteria andSJewel2NoLessThan(String value) {
            addCriterion("sJewel2No <", value, "sJewel2No");
            return (Criteria) this;
        }

        public Criteria andSJewel2NoLessThanOrEqualTo(String value) {
            addCriterion("sJewel2No <=", value, "sJewel2No");
            return (Criteria) this;
        }

        public Criteria andSJewel2NoLike(String value) {
            addCriterion("sJewel2No like", value, "sJewel2No");
            return (Criteria) this;
        }

        public Criteria andSJewel2NoNotLike(String value) {
            addCriterion("sJewel2No not like", value, "sJewel2No");
            return (Criteria) this;
        }

        public Criteria andSJewel2NoIn(List<String> values) {
            addCriterion("sJewel2No in", values, "sJewel2No");
            return (Criteria) this;
        }

        public Criteria andSJewel2NoNotIn(List<String> values) {
            addCriterion("sJewel2No not in", values, "sJewel2No");
            return (Criteria) this;
        }

        public Criteria andSJewel2NoBetween(String value1, String value2) {
            addCriterion("sJewel2No between", value1, value2, "sJewel2No");
            return (Criteria) this;
        }

        public Criteria andSJewel2NoNotBetween(String value1, String value2) {
            addCriterion("sJewel2No not between", value1, value2, "sJewel2No");
            return (Criteria) this;
        }

        public Criteria andSJewel2SpecifiIsNull() {
            addCriterion("sJewel2Specifi is null");
            return (Criteria) this;
        }

        public Criteria andSJewel2SpecifiIsNotNull() {
            addCriterion("sJewel2Specifi is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel2SpecifiEqualTo(String value) {
            addCriterion("sJewel2Specifi =", value, "sJewel2Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel2SpecifiNotEqualTo(String value) {
            addCriterion("sJewel2Specifi <>", value, "sJewel2Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel2SpecifiGreaterThan(String value) {
            addCriterion("sJewel2Specifi >", value, "sJewel2Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel2SpecifiGreaterThanOrEqualTo(String value) {
            addCriterion("sJewel2Specifi >=", value, "sJewel2Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel2SpecifiLessThan(String value) {
            addCriterion("sJewel2Specifi <", value, "sJewel2Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel2SpecifiLessThanOrEqualTo(String value) {
            addCriterion("sJewel2Specifi <=", value, "sJewel2Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel2SpecifiLike(String value) {
            addCriterion("sJewel2Specifi like", value, "sJewel2Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel2SpecifiNotLike(String value) {
            addCriterion("sJewel2Specifi not like", value, "sJewel2Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel2SpecifiIn(List<String> values) {
            addCriterion("sJewel2Specifi in", values, "sJewel2Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel2SpecifiNotIn(List<String> values) {
            addCriterion("sJewel2Specifi not in", values, "sJewel2Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel2SpecifiBetween(String value1, String value2) {
            addCriterion("sJewel2Specifi between", value1, value2, "sJewel2Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel2SpecifiNotBetween(String value1, String value2) {
            addCriterion("sJewel2Specifi not between", value1, value2, "sJewel2Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel2NumIsNull() {
            addCriterion("sJewel2Num is null");
            return (Criteria) this;
        }

        public Criteria andSJewel2NumIsNotNull() {
            addCriterion("sJewel2Num is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel2NumEqualTo(Integer value) {
            addCriterion("sJewel2Num =", value, "sJewel2Num");
            return (Criteria) this;
        }

        public Criteria andSJewel2NumNotEqualTo(Integer value) {
            addCriterion("sJewel2Num <>", value, "sJewel2Num");
            return (Criteria) this;
        }

        public Criteria andSJewel2NumGreaterThan(Integer value) {
            addCriterion("sJewel2Num >", value, "sJewel2Num");
            return (Criteria) this;
        }

        public Criteria andSJewel2NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sJewel2Num >=", value, "sJewel2Num");
            return (Criteria) this;
        }

        public Criteria andSJewel2NumLessThan(Integer value) {
            addCriterion("sJewel2Num <", value, "sJewel2Num");
            return (Criteria) this;
        }

        public Criteria andSJewel2NumLessThanOrEqualTo(Integer value) {
            addCriterion("sJewel2Num <=", value, "sJewel2Num");
            return (Criteria) this;
        }

        public Criteria andSJewel2NumIn(List<Integer> values) {
            addCriterion("sJewel2Num in", values, "sJewel2Num");
            return (Criteria) this;
        }

        public Criteria andSJewel2NumNotIn(List<Integer> values) {
            addCriterion("sJewel2Num not in", values, "sJewel2Num");
            return (Criteria) this;
        }

        public Criteria andSJewel2NumBetween(Integer value1, Integer value2) {
            addCriterion("sJewel2Num between", value1, value2, "sJewel2Num");
            return (Criteria) this;
        }

        public Criteria andSJewel2NumNotBetween(Integer value1, Integer value2) {
            addCriterion("sJewel2Num not between", value1, value2, "sJewel2Num");
            return (Criteria) this;
        }

        public Criteria andSJewel2WeightIsNull() {
            addCriterion("sJewel2Weight is null");
            return (Criteria) this;
        }

        public Criteria andSJewel2WeightIsNotNull() {
            addCriterion("sJewel2Weight is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel2WeightEqualTo(Double value) {
            addCriterion("sJewel2Weight =", value, "sJewel2Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel2WeightNotEqualTo(Double value) {
            addCriterion("sJewel2Weight <>", value, "sJewel2Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel2WeightGreaterThan(Double value) {
            addCriterion("sJewel2Weight >", value, "sJewel2Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel2WeightGreaterThanOrEqualTo(Double value) {
            addCriterion("sJewel2Weight >=", value, "sJewel2Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel2WeightLessThan(Double value) {
            addCriterion("sJewel2Weight <", value, "sJewel2Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel2WeightLessThanOrEqualTo(Double value) {
            addCriterion("sJewel2Weight <=", value, "sJewel2Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel2WeightIn(List<Double> values) {
            addCriterion("sJewel2Weight in", values, "sJewel2Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel2WeightNotIn(List<Double> values) {
            addCriterion("sJewel2Weight not in", values, "sJewel2Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel2WeightBetween(Double value1, Double value2) {
            addCriterion("sJewel2Weight between", value1, value2, "sJewel2Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel2WeightNotBetween(Double value1, Double value2) {
            addCriterion("sJewel2Weight not between", value1, value2, "sJewel2Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel2PriceIsNull() {
            addCriterion("sJewel2Price is null");
            return (Criteria) this;
        }

        public Criteria andSJewel2PriceIsNotNull() {
            addCriterion("sJewel2Price is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel2PriceEqualTo(Double value) {
            addCriterion("sJewel2Price =", value, "sJewel2Price");
            return (Criteria) this;
        }

        public Criteria andSJewel2PriceNotEqualTo(Double value) {
            addCriterion("sJewel2Price <>", value, "sJewel2Price");
            return (Criteria) this;
        }

        public Criteria andSJewel2PriceGreaterThan(Double value) {
            addCriterion("sJewel2Price >", value, "sJewel2Price");
            return (Criteria) this;
        }

        public Criteria andSJewel2PriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sJewel2Price >=", value, "sJewel2Price");
            return (Criteria) this;
        }

        public Criteria andSJewel2PriceLessThan(Double value) {
            addCriterion("sJewel2Price <", value, "sJewel2Price");
            return (Criteria) this;
        }

        public Criteria andSJewel2PriceLessThanOrEqualTo(Double value) {
            addCriterion("sJewel2Price <=", value, "sJewel2Price");
            return (Criteria) this;
        }

        public Criteria andSJewel2PriceIn(List<Double> values) {
            addCriterion("sJewel2Price in", values, "sJewel2Price");
            return (Criteria) this;
        }

        public Criteria andSJewel2PriceNotIn(List<Double> values) {
            addCriterion("sJewel2Price not in", values, "sJewel2Price");
            return (Criteria) this;
        }

        public Criteria andSJewel2PriceBetween(Double value1, Double value2) {
            addCriterion("sJewel2Price between", value1, value2, "sJewel2Price");
            return (Criteria) this;
        }

        public Criteria andSJewel2PriceNotBetween(Double value1, Double value2) {
            addCriterion("sJewel2Price not between", value1, value2, "sJewel2Price");
            return (Criteria) this;
        }

        public Criteria andSJewel2FeeIsNull() {
            addCriterion("sJewel2Fee is null");
            return (Criteria) this;
        }

        public Criteria andSJewel2FeeIsNotNull() {
            addCriterion("sJewel2Fee is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel2FeeEqualTo(Double value) {
            addCriterion("sJewel2Fee =", value, "sJewel2Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel2FeeNotEqualTo(Double value) {
            addCriterion("sJewel2Fee <>", value, "sJewel2Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel2FeeGreaterThan(Double value) {
            addCriterion("sJewel2Fee >", value, "sJewel2Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel2FeeGreaterThanOrEqualTo(Double value) {
            addCriterion("sJewel2Fee >=", value, "sJewel2Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel2FeeLessThan(Double value) {
            addCriterion("sJewel2Fee <", value, "sJewel2Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel2FeeLessThanOrEqualTo(Double value) {
            addCriterion("sJewel2Fee <=", value, "sJewel2Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel2FeeIn(List<Double> values) {
            addCriterion("sJewel2Fee in", values, "sJewel2Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel2FeeNotIn(List<Double> values) {
            addCriterion("sJewel2Fee not in", values, "sJewel2Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel2FeeBetween(Double value1, Double value2) {
            addCriterion("sJewel2Fee between", value1, value2, "sJewel2Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel2FeeNotBetween(Double value1, Double value2) {
            addCriterion("sJewel2Fee not between", value1, value2, "sJewel2Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel3NameIsNull() {
            addCriterion("sJewel3Name is null");
            return (Criteria) this;
        }

        public Criteria andSJewel3NameIsNotNull() {
            addCriterion("sJewel3Name is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel3NameEqualTo(String value) {
            addCriterion("sJewel3Name =", value, "sJewel3Name");
            return (Criteria) this;
        }

        public Criteria andSJewel3NameNotEqualTo(String value) {
            addCriterion("sJewel3Name <>", value, "sJewel3Name");
            return (Criteria) this;
        }

        public Criteria andSJewel3NameGreaterThan(String value) {
            addCriterion("sJewel3Name >", value, "sJewel3Name");
            return (Criteria) this;
        }

        public Criteria andSJewel3NameGreaterThanOrEqualTo(String value) {
            addCriterion("sJewel3Name >=", value, "sJewel3Name");
            return (Criteria) this;
        }

        public Criteria andSJewel3NameLessThan(String value) {
            addCriterion("sJewel3Name <", value, "sJewel3Name");
            return (Criteria) this;
        }

        public Criteria andSJewel3NameLessThanOrEqualTo(String value) {
            addCriterion("sJewel3Name <=", value, "sJewel3Name");
            return (Criteria) this;
        }

        public Criteria andSJewel3NameLike(String value) {
            addCriterion("sJewel3Name like", value, "sJewel3Name");
            return (Criteria) this;
        }

        public Criteria andSJewel3NameNotLike(String value) {
            addCriterion("sJewel3Name not like", value, "sJewel3Name");
            return (Criteria) this;
        }

        public Criteria andSJewel3NameIn(List<String> values) {
            addCriterion("sJewel3Name in", values, "sJewel3Name");
            return (Criteria) this;
        }

        public Criteria andSJewel3NameNotIn(List<String> values) {
            addCriterion("sJewel3Name not in", values, "sJewel3Name");
            return (Criteria) this;
        }

        public Criteria andSJewel3NameBetween(String value1, String value2) {
            addCriterion("sJewel3Name between", value1, value2, "sJewel3Name");
            return (Criteria) this;
        }

        public Criteria andSJewel3NameNotBetween(String value1, String value2) {
            addCriterion("sJewel3Name not between", value1, value2, "sJewel3Name");
            return (Criteria) this;
        }

        public Criteria andSJewel3NoIsNull() {
            addCriterion("sJewel3No is null");
            return (Criteria) this;
        }

        public Criteria andSJewel3NoIsNotNull() {
            addCriterion("sJewel3No is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel3NoEqualTo(String value) {
            addCriterion("sJewel3No =", value, "sJewel3No");
            return (Criteria) this;
        }

        public Criteria andSJewel3NoNotEqualTo(String value) {
            addCriterion("sJewel3No <>", value, "sJewel3No");
            return (Criteria) this;
        }

        public Criteria andSJewel3NoGreaterThan(String value) {
            addCriterion("sJewel3No >", value, "sJewel3No");
            return (Criteria) this;
        }

        public Criteria andSJewel3NoGreaterThanOrEqualTo(String value) {
            addCriterion("sJewel3No >=", value, "sJewel3No");
            return (Criteria) this;
        }

        public Criteria andSJewel3NoLessThan(String value) {
            addCriterion("sJewel3No <", value, "sJewel3No");
            return (Criteria) this;
        }

        public Criteria andSJewel3NoLessThanOrEqualTo(String value) {
            addCriterion("sJewel3No <=", value, "sJewel3No");
            return (Criteria) this;
        }

        public Criteria andSJewel3NoLike(String value) {
            addCriterion("sJewel3No like", value, "sJewel3No");
            return (Criteria) this;
        }

        public Criteria andSJewel3NoNotLike(String value) {
            addCriterion("sJewel3No not like", value, "sJewel3No");
            return (Criteria) this;
        }

        public Criteria andSJewel3NoIn(List<String> values) {
            addCriterion("sJewel3No in", values, "sJewel3No");
            return (Criteria) this;
        }

        public Criteria andSJewel3NoNotIn(List<String> values) {
            addCriterion("sJewel3No not in", values, "sJewel3No");
            return (Criteria) this;
        }

        public Criteria andSJewel3NoBetween(String value1, String value2) {
            addCriterion("sJewel3No between", value1, value2, "sJewel3No");
            return (Criteria) this;
        }

        public Criteria andSJewel3NoNotBetween(String value1, String value2) {
            addCriterion("sJewel3No not between", value1, value2, "sJewel3No");
            return (Criteria) this;
        }

        public Criteria andSJewel3SpecifiIsNull() {
            addCriterion("sJewel3Specifi is null");
            return (Criteria) this;
        }

        public Criteria andSJewel3SpecifiIsNotNull() {
            addCriterion("sJewel3Specifi is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel3SpecifiEqualTo(String value) {
            addCriterion("sJewel3Specifi =", value, "sJewel3Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel3SpecifiNotEqualTo(String value) {
            addCriterion("sJewel3Specifi <>", value, "sJewel3Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel3SpecifiGreaterThan(String value) {
            addCriterion("sJewel3Specifi >", value, "sJewel3Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel3SpecifiGreaterThanOrEqualTo(String value) {
            addCriterion("sJewel3Specifi >=", value, "sJewel3Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel3SpecifiLessThan(String value) {
            addCriterion("sJewel3Specifi <", value, "sJewel3Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel3SpecifiLessThanOrEqualTo(String value) {
            addCriterion("sJewel3Specifi <=", value, "sJewel3Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel3SpecifiLike(String value) {
            addCriterion("sJewel3Specifi like", value, "sJewel3Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel3SpecifiNotLike(String value) {
            addCriterion("sJewel3Specifi not like", value, "sJewel3Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel3SpecifiIn(List<String> values) {
            addCriterion("sJewel3Specifi in", values, "sJewel3Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel3SpecifiNotIn(List<String> values) {
            addCriterion("sJewel3Specifi not in", values, "sJewel3Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel3SpecifiBetween(String value1, String value2) {
            addCriterion("sJewel3Specifi between", value1, value2, "sJewel3Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel3SpecifiNotBetween(String value1, String value2) {
            addCriterion("sJewel3Specifi not between", value1, value2, "sJewel3Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel3NumIsNull() {
            addCriterion("sJewel3Num is null");
            return (Criteria) this;
        }

        public Criteria andSJewel3NumIsNotNull() {
            addCriterion("sJewel3Num is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel3NumEqualTo(Integer value) {
            addCriterion("sJewel3Num =", value, "sJewel3Num");
            return (Criteria) this;
        }

        public Criteria andSJewel3NumNotEqualTo(Integer value) {
            addCriterion("sJewel3Num <>", value, "sJewel3Num");
            return (Criteria) this;
        }

        public Criteria andSJewel3NumGreaterThan(Integer value) {
            addCriterion("sJewel3Num >", value, "sJewel3Num");
            return (Criteria) this;
        }

        public Criteria andSJewel3NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sJewel3Num >=", value, "sJewel3Num");
            return (Criteria) this;
        }

        public Criteria andSJewel3NumLessThan(Integer value) {
            addCriterion("sJewel3Num <", value, "sJewel3Num");
            return (Criteria) this;
        }

        public Criteria andSJewel3NumLessThanOrEqualTo(Integer value) {
            addCriterion("sJewel3Num <=", value, "sJewel3Num");
            return (Criteria) this;
        }

        public Criteria andSJewel3NumIn(List<Integer> values) {
            addCriterion("sJewel3Num in", values, "sJewel3Num");
            return (Criteria) this;
        }

        public Criteria andSJewel3NumNotIn(List<Integer> values) {
            addCriterion("sJewel3Num not in", values, "sJewel3Num");
            return (Criteria) this;
        }

        public Criteria andSJewel3NumBetween(Integer value1, Integer value2) {
            addCriterion("sJewel3Num between", value1, value2, "sJewel3Num");
            return (Criteria) this;
        }

        public Criteria andSJewel3NumNotBetween(Integer value1, Integer value2) {
            addCriterion("sJewel3Num not between", value1, value2, "sJewel3Num");
            return (Criteria) this;
        }

        public Criteria andSJewel3WeightIsNull() {
            addCriterion("sJewel3Weight is null");
            return (Criteria) this;
        }

        public Criteria andSJewel3WeightIsNotNull() {
            addCriterion("sJewel3Weight is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel3WeightEqualTo(Double value) {
            addCriterion("sJewel3Weight =", value, "sJewel3Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel3WeightNotEqualTo(Double value) {
            addCriterion("sJewel3Weight <>", value, "sJewel3Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel3WeightGreaterThan(Double value) {
            addCriterion("sJewel3Weight >", value, "sJewel3Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel3WeightGreaterThanOrEqualTo(Double value) {
            addCriterion("sJewel3Weight >=", value, "sJewel3Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel3WeightLessThan(Double value) {
            addCriterion("sJewel3Weight <", value, "sJewel3Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel3WeightLessThanOrEqualTo(Double value) {
            addCriterion("sJewel3Weight <=", value, "sJewel3Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel3WeightIn(List<Double> values) {
            addCriterion("sJewel3Weight in", values, "sJewel3Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel3WeightNotIn(List<Double> values) {
            addCriterion("sJewel3Weight not in", values, "sJewel3Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel3WeightBetween(Double value1, Double value2) {
            addCriterion("sJewel3Weight between", value1, value2, "sJewel3Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel3WeightNotBetween(Double value1, Double value2) {
            addCriterion("sJewel3Weight not between", value1, value2, "sJewel3Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel3PriceIsNull() {
            addCriterion("sJewel3Price is null");
            return (Criteria) this;
        }

        public Criteria andSJewel3PriceIsNotNull() {
            addCriterion("sJewel3Price is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel3PriceEqualTo(Double value) {
            addCriterion("sJewel3Price =", value, "sJewel3Price");
            return (Criteria) this;
        }

        public Criteria andSJewel3PriceNotEqualTo(Double value) {
            addCriterion("sJewel3Price <>", value, "sJewel3Price");
            return (Criteria) this;
        }

        public Criteria andSJewel3PriceGreaterThan(Double value) {
            addCriterion("sJewel3Price >", value, "sJewel3Price");
            return (Criteria) this;
        }

        public Criteria andSJewel3PriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sJewel3Price >=", value, "sJewel3Price");
            return (Criteria) this;
        }

        public Criteria andSJewel3PriceLessThan(Double value) {
            addCriterion("sJewel3Price <", value, "sJewel3Price");
            return (Criteria) this;
        }

        public Criteria andSJewel3PriceLessThanOrEqualTo(Double value) {
            addCriterion("sJewel3Price <=", value, "sJewel3Price");
            return (Criteria) this;
        }

        public Criteria andSJewel3PriceIn(List<Double> values) {
            addCriterion("sJewel3Price in", values, "sJewel3Price");
            return (Criteria) this;
        }

        public Criteria andSJewel3PriceNotIn(List<Double> values) {
            addCriterion("sJewel3Price not in", values, "sJewel3Price");
            return (Criteria) this;
        }

        public Criteria andSJewel3PriceBetween(Double value1, Double value2) {
            addCriterion("sJewel3Price between", value1, value2, "sJewel3Price");
            return (Criteria) this;
        }

        public Criteria andSJewel3PriceNotBetween(Double value1, Double value2) {
            addCriterion("sJewel3Price not between", value1, value2, "sJewel3Price");
            return (Criteria) this;
        }

        public Criteria andSJewel3FeeIsNull() {
            addCriterion("sJewel3Fee is null");
            return (Criteria) this;
        }

        public Criteria andSJewel3FeeIsNotNull() {
            addCriterion("sJewel3Fee is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel3FeeEqualTo(Double value) {
            addCriterion("sJewel3Fee =", value, "sJewel3Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel3FeeNotEqualTo(Double value) {
            addCriterion("sJewel3Fee <>", value, "sJewel3Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel3FeeGreaterThan(Double value) {
            addCriterion("sJewel3Fee >", value, "sJewel3Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel3FeeGreaterThanOrEqualTo(Double value) {
            addCriterion("sJewel3Fee >=", value, "sJewel3Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel3FeeLessThan(Double value) {
            addCriterion("sJewel3Fee <", value, "sJewel3Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel3FeeLessThanOrEqualTo(Double value) {
            addCriterion("sJewel3Fee <=", value, "sJewel3Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel3FeeIn(List<Double> values) {
            addCriterion("sJewel3Fee in", values, "sJewel3Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel3FeeNotIn(List<Double> values) {
            addCriterion("sJewel3Fee not in", values, "sJewel3Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel3FeeBetween(Double value1, Double value2) {
            addCriterion("sJewel3Fee between", value1, value2, "sJewel3Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel3FeeNotBetween(Double value1, Double value2) {
            addCriterion("sJewel3Fee not between", value1, value2, "sJewel3Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel4NameIsNull() {
            addCriterion("sJewel4Name is null");
            return (Criteria) this;
        }

        public Criteria andSJewel4NameIsNotNull() {
            addCriterion("sJewel4Name is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel4NameEqualTo(String value) {
            addCriterion("sJewel4Name =", value, "sJewel4Name");
            return (Criteria) this;
        }

        public Criteria andSJewel4NameNotEqualTo(String value) {
            addCriterion("sJewel4Name <>", value, "sJewel4Name");
            return (Criteria) this;
        }

        public Criteria andSJewel4NameGreaterThan(String value) {
            addCriterion("sJewel4Name >", value, "sJewel4Name");
            return (Criteria) this;
        }

        public Criteria andSJewel4NameGreaterThanOrEqualTo(String value) {
            addCriterion("sJewel4Name >=", value, "sJewel4Name");
            return (Criteria) this;
        }

        public Criteria andSJewel4NameLessThan(String value) {
            addCriterion("sJewel4Name <", value, "sJewel4Name");
            return (Criteria) this;
        }

        public Criteria andSJewel4NameLessThanOrEqualTo(String value) {
            addCriterion("sJewel4Name <=", value, "sJewel4Name");
            return (Criteria) this;
        }

        public Criteria andSJewel4NameLike(String value) {
            addCriterion("sJewel4Name like", value, "sJewel4Name");
            return (Criteria) this;
        }

        public Criteria andSJewel4NameNotLike(String value) {
            addCriterion("sJewel4Name not like", value, "sJewel4Name");
            return (Criteria) this;
        }

        public Criteria andSJewel4NameIn(List<String> values) {
            addCriterion("sJewel4Name in", values, "sJewel4Name");
            return (Criteria) this;
        }

        public Criteria andSJewel4NameNotIn(List<String> values) {
            addCriterion("sJewel4Name not in", values, "sJewel4Name");
            return (Criteria) this;
        }

        public Criteria andSJewel4NameBetween(String value1, String value2) {
            addCriterion("sJewel4Name between", value1, value2, "sJewel4Name");
            return (Criteria) this;
        }

        public Criteria andSJewel4NameNotBetween(String value1, String value2) {
            addCriterion("sJewel4Name not between", value1, value2, "sJewel4Name");
            return (Criteria) this;
        }

        public Criteria andSJewel4NoIsNull() {
            addCriterion("sJewel4No is null");
            return (Criteria) this;
        }

        public Criteria andSJewel4NoIsNotNull() {
            addCriterion("sJewel4No is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel4NoEqualTo(String value) {
            addCriterion("sJewel4No =", value, "sJewel4No");
            return (Criteria) this;
        }

        public Criteria andSJewel4NoNotEqualTo(String value) {
            addCriterion("sJewel4No <>", value, "sJewel4No");
            return (Criteria) this;
        }

        public Criteria andSJewel4NoGreaterThan(String value) {
            addCriterion("sJewel4No >", value, "sJewel4No");
            return (Criteria) this;
        }

        public Criteria andSJewel4NoGreaterThanOrEqualTo(String value) {
            addCriterion("sJewel4No >=", value, "sJewel4No");
            return (Criteria) this;
        }

        public Criteria andSJewel4NoLessThan(String value) {
            addCriterion("sJewel4No <", value, "sJewel4No");
            return (Criteria) this;
        }

        public Criteria andSJewel4NoLessThanOrEqualTo(String value) {
            addCriterion("sJewel4No <=", value, "sJewel4No");
            return (Criteria) this;
        }

        public Criteria andSJewel4NoLike(String value) {
            addCriterion("sJewel4No like", value, "sJewel4No");
            return (Criteria) this;
        }

        public Criteria andSJewel4NoNotLike(String value) {
            addCriterion("sJewel4No not like", value, "sJewel4No");
            return (Criteria) this;
        }

        public Criteria andSJewel4NoIn(List<String> values) {
            addCriterion("sJewel4No in", values, "sJewel4No");
            return (Criteria) this;
        }

        public Criteria andSJewel4NoNotIn(List<String> values) {
            addCriterion("sJewel4No not in", values, "sJewel4No");
            return (Criteria) this;
        }

        public Criteria andSJewel4NoBetween(String value1, String value2) {
            addCriterion("sJewel4No between", value1, value2, "sJewel4No");
            return (Criteria) this;
        }

        public Criteria andSJewel4NoNotBetween(String value1, String value2) {
            addCriterion("sJewel4No not between", value1, value2, "sJewel4No");
            return (Criteria) this;
        }

        public Criteria andSJewel4SpecifiIsNull() {
            addCriterion("sJewel4Specifi is null");
            return (Criteria) this;
        }

        public Criteria andSJewel4SpecifiIsNotNull() {
            addCriterion("sJewel4Specifi is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel4SpecifiEqualTo(String value) {
            addCriterion("sJewel4Specifi =", value, "sJewel4Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel4SpecifiNotEqualTo(String value) {
            addCriterion("sJewel4Specifi <>", value, "sJewel4Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel4SpecifiGreaterThan(String value) {
            addCriterion("sJewel4Specifi >", value, "sJewel4Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel4SpecifiGreaterThanOrEqualTo(String value) {
            addCriterion("sJewel4Specifi >=", value, "sJewel4Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel4SpecifiLessThan(String value) {
            addCriterion("sJewel4Specifi <", value, "sJewel4Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel4SpecifiLessThanOrEqualTo(String value) {
            addCriterion("sJewel4Specifi <=", value, "sJewel4Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel4SpecifiLike(String value) {
            addCriterion("sJewel4Specifi like", value, "sJewel4Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel4SpecifiNotLike(String value) {
            addCriterion("sJewel4Specifi not like", value, "sJewel4Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel4SpecifiIn(List<String> values) {
            addCriterion("sJewel4Specifi in", values, "sJewel4Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel4SpecifiNotIn(List<String> values) {
            addCriterion("sJewel4Specifi not in", values, "sJewel4Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel4SpecifiBetween(String value1, String value2) {
            addCriterion("sJewel4Specifi between", value1, value2, "sJewel4Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel4SpecifiNotBetween(String value1, String value2) {
            addCriterion("sJewel4Specifi not between", value1, value2, "sJewel4Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel4NumIsNull() {
            addCriterion("sJewel4Num is null");
            return (Criteria) this;
        }

        public Criteria andSJewel4NumIsNotNull() {
            addCriterion("sJewel4Num is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel4NumEqualTo(Integer value) {
            addCriterion("sJewel4Num =", value, "sJewel4Num");
            return (Criteria) this;
        }

        public Criteria andSJewel4NumNotEqualTo(Integer value) {
            addCriterion("sJewel4Num <>", value, "sJewel4Num");
            return (Criteria) this;
        }

        public Criteria andSJewel4NumGreaterThan(Integer value) {
            addCriterion("sJewel4Num >", value, "sJewel4Num");
            return (Criteria) this;
        }

        public Criteria andSJewel4NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sJewel4Num >=", value, "sJewel4Num");
            return (Criteria) this;
        }

        public Criteria andSJewel4NumLessThan(Integer value) {
            addCriterion("sJewel4Num <", value, "sJewel4Num");
            return (Criteria) this;
        }

        public Criteria andSJewel4NumLessThanOrEqualTo(Integer value) {
            addCriterion("sJewel4Num <=", value, "sJewel4Num");
            return (Criteria) this;
        }

        public Criteria andSJewel4NumIn(List<Integer> values) {
            addCriterion("sJewel4Num in", values, "sJewel4Num");
            return (Criteria) this;
        }

        public Criteria andSJewel4NumNotIn(List<Integer> values) {
            addCriterion("sJewel4Num not in", values, "sJewel4Num");
            return (Criteria) this;
        }

        public Criteria andSJewel4NumBetween(Integer value1, Integer value2) {
            addCriterion("sJewel4Num between", value1, value2, "sJewel4Num");
            return (Criteria) this;
        }

        public Criteria andSJewel4NumNotBetween(Integer value1, Integer value2) {
            addCriterion("sJewel4Num not between", value1, value2, "sJewel4Num");
            return (Criteria) this;
        }

        public Criteria andSJewel4WeightIsNull() {
            addCriterion("sJewel4Weight is null");
            return (Criteria) this;
        }

        public Criteria andSJewel4WeightIsNotNull() {
            addCriterion("sJewel4Weight is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel4WeightEqualTo(Double value) {
            addCriterion("sJewel4Weight =", value, "sJewel4Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel4WeightNotEqualTo(Double value) {
            addCriterion("sJewel4Weight <>", value, "sJewel4Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel4WeightGreaterThan(Double value) {
            addCriterion("sJewel4Weight >", value, "sJewel4Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel4WeightGreaterThanOrEqualTo(Double value) {
            addCriterion("sJewel4Weight >=", value, "sJewel4Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel4WeightLessThan(Double value) {
            addCriterion("sJewel4Weight <", value, "sJewel4Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel4WeightLessThanOrEqualTo(Double value) {
            addCriterion("sJewel4Weight <=", value, "sJewel4Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel4WeightIn(List<Double> values) {
            addCriterion("sJewel4Weight in", values, "sJewel4Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel4WeightNotIn(List<Double> values) {
            addCriterion("sJewel4Weight not in", values, "sJewel4Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel4WeightBetween(Double value1, Double value2) {
            addCriterion("sJewel4Weight between", value1, value2, "sJewel4Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel4WeightNotBetween(Double value1, Double value2) {
            addCriterion("sJewel4Weight not between", value1, value2, "sJewel4Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel4PriceIsNull() {
            addCriterion("sJewel4Price is null");
            return (Criteria) this;
        }

        public Criteria andSJewel4PriceIsNotNull() {
            addCriterion("sJewel4Price is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel4PriceEqualTo(Double value) {
            addCriterion("sJewel4Price =", value, "sJewel4Price");
            return (Criteria) this;
        }

        public Criteria andSJewel4PriceNotEqualTo(Double value) {
            addCriterion("sJewel4Price <>", value, "sJewel4Price");
            return (Criteria) this;
        }

        public Criteria andSJewel4PriceGreaterThan(Double value) {
            addCriterion("sJewel4Price >", value, "sJewel4Price");
            return (Criteria) this;
        }

        public Criteria andSJewel4PriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sJewel4Price >=", value, "sJewel4Price");
            return (Criteria) this;
        }

        public Criteria andSJewel4PriceLessThan(Double value) {
            addCriterion("sJewel4Price <", value, "sJewel4Price");
            return (Criteria) this;
        }

        public Criteria andSJewel4PriceLessThanOrEqualTo(Double value) {
            addCriterion("sJewel4Price <=", value, "sJewel4Price");
            return (Criteria) this;
        }

        public Criteria andSJewel4PriceIn(List<Double> values) {
            addCriterion("sJewel4Price in", values, "sJewel4Price");
            return (Criteria) this;
        }

        public Criteria andSJewel4PriceNotIn(List<Double> values) {
            addCriterion("sJewel4Price not in", values, "sJewel4Price");
            return (Criteria) this;
        }

        public Criteria andSJewel4PriceBetween(Double value1, Double value2) {
            addCriterion("sJewel4Price between", value1, value2, "sJewel4Price");
            return (Criteria) this;
        }

        public Criteria andSJewel4PriceNotBetween(Double value1, Double value2) {
            addCriterion("sJewel4Price not between", value1, value2, "sJewel4Price");
            return (Criteria) this;
        }

        public Criteria andSJewel4FeeIsNull() {
            addCriterion("sJewel4Fee is null");
            return (Criteria) this;
        }

        public Criteria andSJewel4FeeIsNotNull() {
            addCriterion("sJewel4Fee is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel4FeeEqualTo(Double value) {
            addCriterion("sJewel4Fee =", value, "sJewel4Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel4FeeNotEqualTo(Double value) {
            addCriterion("sJewel4Fee <>", value, "sJewel4Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel4FeeGreaterThan(Double value) {
            addCriterion("sJewel4Fee >", value, "sJewel4Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel4FeeGreaterThanOrEqualTo(Double value) {
            addCriterion("sJewel4Fee >=", value, "sJewel4Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel4FeeLessThan(Double value) {
            addCriterion("sJewel4Fee <", value, "sJewel4Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel4FeeLessThanOrEqualTo(Double value) {
            addCriterion("sJewel4Fee <=", value, "sJewel4Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel4FeeIn(List<Double> values) {
            addCriterion("sJewel4Fee in", values, "sJewel4Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel4FeeNotIn(List<Double> values) {
            addCriterion("sJewel4Fee not in", values, "sJewel4Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel4FeeBetween(Double value1, Double value2) {
            addCriterion("sJewel4Fee between", value1, value2, "sJewel4Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel4FeeNotBetween(Double value1, Double value2) {
            addCriterion("sJewel4Fee not between", value1, value2, "sJewel4Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel5NameIsNull() {
            addCriterion("sJewel5Name is null");
            return (Criteria) this;
        }

        public Criteria andSJewel5NameIsNotNull() {
            addCriterion("sJewel5Name is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel5NameEqualTo(String value) {
            addCriterion("sJewel5Name =", value, "sJewel5Name");
            return (Criteria) this;
        }

        public Criteria andSJewel5NameNotEqualTo(String value) {
            addCriterion("sJewel5Name <>", value, "sJewel5Name");
            return (Criteria) this;
        }

        public Criteria andSJewel5NameGreaterThan(String value) {
            addCriterion("sJewel5Name >", value, "sJewel5Name");
            return (Criteria) this;
        }

        public Criteria andSJewel5NameGreaterThanOrEqualTo(String value) {
            addCriterion("sJewel5Name >=", value, "sJewel5Name");
            return (Criteria) this;
        }

        public Criteria andSJewel5NameLessThan(String value) {
            addCriterion("sJewel5Name <", value, "sJewel5Name");
            return (Criteria) this;
        }

        public Criteria andSJewel5NameLessThanOrEqualTo(String value) {
            addCriterion("sJewel5Name <=", value, "sJewel5Name");
            return (Criteria) this;
        }

        public Criteria andSJewel5NameLike(String value) {
            addCriterion("sJewel5Name like", value, "sJewel5Name");
            return (Criteria) this;
        }

        public Criteria andSJewel5NameNotLike(String value) {
            addCriterion("sJewel5Name not like", value, "sJewel5Name");
            return (Criteria) this;
        }

        public Criteria andSJewel5NameIn(List<String> values) {
            addCriterion("sJewel5Name in", values, "sJewel5Name");
            return (Criteria) this;
        }

        public Criteria andSJewel5NameNotIn(List<String> values) {
            addCriterion("sJewel5Name not in", values, "sJewel5Name");
            return (Criteria) this;
        }

        public Criteria andSJewel5NameBetween(String value1, String value2) {
            addCriterion("sJewel5Name between", value1, value2, "sJewel5Name");
            return (Criteria) this;
        }

        public Criteria andSJewel5NameNotBetween(String value1, String value2) {
            addCriterion("sJewel5Name not between", value1, value2, "sJewel5Name");
            return (Criteria) this;
        }

        public Criteria andSJewel5NoIsNull() {
            addCriterion("sJewel5No is null");
            return (Criteria) this;
        }

        public Criteria andSJewel5NoIsNotNull() {
            addCriterion("sJewel5No is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel5NoEqualTo(String value) {
            addCriterion("sJewel5No =", value, "sJewel5No");
            return (Criteria) this;
        }

        public Criteria andSJewel5NoNotEqualTo(String value) {
            addCriterion("sJewel5No <>", value, "sJewel5No");
            return (Criteria) this;
        }

        public Criteria andSJewel5NoGreaterThan(String value) {
            addCriterion("sJewel5No >", value, "sJewel5No");
            return (Criteria) this;
        }

        public Criteria andSJewel5NoGreaterThanOrEqualTo(String value) {
            addCriterion("sJewel5No >=", value, "sJewel5No");
            return (Criteria) this;
        }

        public Criteria andSJewel5NoLessThan(String value) {
            addCriterion("sJewel5No <", value, "sJewel5No");
            return (Criteria) this;
        }

        public Criteria andSJewel5NoLessThanOrEqualTo(String value) {
            addCriterion("sJewel5No <=", value, "sJewel5No");
            return (Criteria) this;
        }

        public Criteria andSJewel5NoLike(String value) {
            addCriterion("sJewel5No like", value, "sJewel5No");
            return (Criteria) this;
        }

        public Criteria andSJewel5NoNotLike(String value) {
            addCriterion("sJewel5No not like", value, "sJewel5No");
            return (Criteria) this;
        }

        public Criteria andSJewel5NoIn(List<String> values) {
            addCriterion("sJewel5No in", values, "sJewel5No");
            return (Criteria) this;
        }

        public Criteria andSJewel5NoNotIn(List<String> values) {
            addCriterion("sJewel5No not in", values, "sJewel5No");
            return (Criteria) this;
        }

        public Criteria andSJewel5NoBetween(String value1, String value2) {
            addCriterion("sJewel5No between", value1, value2, "sJewel5No");
            return (Criteria) this;
        }

        public Criteria andSJewel5NoNotBetween(String value1, String value2) {
            addCriterion("sJewel5No not between", value1, value2, "sJewel5No");
            return (Criteria) this;
        }

        public Criteria andSJewel5SpecifiIsNull() {
            addCriterion("sJewel5Specifi is null");
            return (Criteria) this;
        }

        public Criteria andSJewel5SpecifiIsNotNull() {
            addCriterion("sJewel5Specifi is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel5SpecifiEqualTo(String value) {
            addCriterion("sJewel5Specifi =", value, "sJewel5Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel5SpecifiNotEqualTo(String value) {
            addCriterion("sJewel5Specifi <>", value, "sJewel5Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel5SpecifiGreaterThan(String value) {
            addCriterion("sJewel5Specifi >", value, "sJewel5Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel5SpecifiGreaterThanOrEqualTo(String value) {
            addCriterion("sJewel5Specifi >=", value, "sJewel5Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel5SpecifiLessThan(String value) {
            addCriterion("sJewel5Specifi <", value, "sJewel5Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel5SpecifiLessThanOrEqualTo(String value) {
            addCriterion("sJewel5Specifi <=", value, "sJewel5Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel5SpecifiLike(String value) {
            addCriterion("sJewel5Specifi like", value, "sJewel5Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel5SpecifiNotLike(String value) {
            addCriterion("sJewel5Specifi not like", value, "sJewel5Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel5SpecifiIn(List<String> values) {
            addCriterion("sJewel5Specifi in", values, "sJewel5Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel5SpecifiNotIn(List<String> values) {
            addCriterion("sJewel5Specifi not in", values, "sJewel5Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel5SpecifiBetween(String value1, String value2) {
            addCriterion("sJewel5Specifi between", value1, value2, "sJewel5Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel5SpecifiNotBetween(String value1, String value2) {
            addCriterion("sJewel5Specifi not between", value1, value2, "sJewel5Specifi");
            return (Criteria) this;
        }

        public Criteria andSJewel5NumIsNull() {
            addCriterion("sJewel5Num is null");
            return (Criteria) this;
        }

        public Criteria andSJewel5NumIsNotNull() {
            addCriterion("sJewel5Num is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel5NumEqualTo(Integer value) {
            addCriterion("sJewel5Num =", value, "sJewel5Num");
            return (Criteria) this;
        }

        public Criteria andSJewel5NumNotEqualTo(Integer value) {
            addCriterion("sJewel5Num <>", value, "sJewel5Num");
            return (Criteria) this;
        }

        public Criteria andSJewel5NumGreaterThan(Integer value) {
            addCriterion("sJewel5Num >", value, "sJewel5Num");
            return (Criteria) this;
        }

        public Criteria andSJewel5NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sJewel5Num >=", value, "sJewel5Num");
            return (Criteria) this;
        }

        public Criteria andSJewel5NumLessThan(Integer value) {
            addCriterion("sJewel5Num <", value, "sJewel5Num");
            return (Criteria) this;
        }

        public Criteria andSJewel5NumLessThanOrEqualTo(Integer value) {
            addCriterion("sJewel5Num <=", value, "sJewel5Num");
            return (Criteria) this;
        }

        public Criteria andSJewel5NumIn(List<Integer> values) {
            addCriterion("sJewel5Num in", values, "sJewel5Num");
            return (Criteria) this;
        }

        public Criteria andSJewel5NumNotIn(List<Integer> values) {
            addCriterion("sJewel5Num not in", values, "sJewel5Num");
            return (Criteria) this;
        }

        public Criteria andSJewel5NumBetween(Integer value1, Integer value2) {
            addCriterion("sJewel5Num between", value1, value2, "sJewel5Num");
            return (Criteria) this;
        }

        public Criteria andSJewel5NumNotBetween(Integer value1, Integer value2) {
            addCriterion("sJewel5Num not between", value1, value2, "sJewel5Num");
            return (Criteria) this;
        }

        public Criteria andSJewel5WeightIsNull() {
            addCriterion("sJewel5Weight is null");
            return (Criteria) this;
        }

        public Criteria andSJewel5WeightIsNotNull() {
            addCriterion("sJewel5Weight is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel5WeightEqualTo(Double value) {
            addCriterion("sJewel5Weight =", value, "sJewel5Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel5WeightNotEqualTo(Double value) {
            addCriterion("sJewel5Weight <>", value, "sJewel5Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel5WeightGreaterThan(Double value) {
            addCriterion("sJewel5Weight >", value, "sJewel5Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel5WeightGreaterThanOrEqualTo(Double value) {
            addCriterion("sJewel5Weight >=", value, "sJewel5Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel5WeightLessThan(Double value) {
            addCriterion("sJewel5Weight <", value, "sJewel5Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel5WeightLessThanOrEqualTo(Double value) {
            addCriterion("sJewel5Weight <=", value, "sJewel5Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel5WeightIn(List<Double> values) {
            addCriterion("sJewel5Weight in", values, "sJewel5Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel5WeightNotIn(List<Double> values) {
            addCriterion("sJewel5Weight not in", values, "sJewel5Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel5WeightBetween(Double value1, Double value2) {
            addCriterion("sJewel5Weight between", value1, value2, "sJewel5Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel5WeightNotBetween(Double value1, Double value2) {
            addCriterion("sJewel5Weight not between", value1, value2, "sJewel5Weight");
            return (Criteria) this;
        }

        public Criteria andSJewel5PriceIsNull() {
            addCriterion("sJewel5Price is null");
            return (Criteria) this;
        }

        public Criteria andSJewel5PriceIsNotNull() {
            addCriterion("sJewel5Price is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel5PriceEqualTo(Double value) {
            addCriterion("sJewel5Price =", value, "sJewel5Price");
            return (Criteria) this;
        }

        public Criteria andSJewel5PriceNotEqualTo(Double value) {
            addCriterion("sJewel5Price <>", value, "sJewel5Price");
            return (Criteria) this;
        }

        public Criteria andSJewel5PriceGreaterThan(Double value) {
            addCriterion("sJewel5Price >", value, "sJewel5Price");
            return (Criteria) this;
        }

        public Criteria andSJewel5PriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sJewel5Price >=", value, "sJewel5Price");
            return (Criteria) this;
        }

        public Criteria andSJewel5PriceLessThan(Double value) {
            addCriterion("sJewel5Price <", value, "sJewel5Price");
            return (Criteria) this;
        }

        public Criteria andSJewel5PriceLessThanOrEqualTo(Double value) {
            addCriterion("sJewel5Price <=", value, "sJewel5Price");
            return (Criteria) this;
        }

        public Criteria andSJewel5PriceIn(List<Double> values) {
            addCriterion("sJewel5Price in", values, "sJewel5Price");
            return (Criteria) this;
        }

        public Criteria andSJewel5PriceNotIn(List<Double> values) {
            addCriterion("sJewel5Price not in", values, "sJewel5Price");
            return (Criteria) this;
        }

        public Criteria andSJewel5PriceBetween(Double value1, Double value2) {
            addCriterion("sJewel5Price between", value1, value2, "sJewel5Price");
            return (Criteria) this;
        }

        public Criteria andSJewel5PriceNotBetween(Double value1, Double value2) {
            addCriterion("sJewel5Price not between", value1, value2, "sJewel5Price");
            return (Criteria) this;
        }

        public Criteria andSJewel5FeeIsNull() {
            addCriterion("sJewel5Fee is null");
            return (Criteria) this;
        }

        public Criteria andSJewel5FeeIsNotNull() {
            addCriterion("sJewel5Fee is not null");
            return (Criteria) this;
        }

        public Criteria andSJewel5FeeEqualTo(Double value) {
            addCriterion("sJewel5Fee =", value, "sJewel5Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel5FeeNotEqualTo(Double value) {
            addCriterion("sJewel5Fee <>", value, "sJewel5Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel5FeeGreaterThan(Double value) {
            addCriterion("sJewel5Fee >", value, "sJewel5Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel5FeeGreaterThanOrEqualTo(Double value) {
            addCriterion("sJewel5Fee >=", value, "sJewel5Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel5FeeLessThan(Double value) {
            addCriterion("sJewel5Fee <", value, "sJewel5Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel5FeeLessThanOrEqualTo(Double value) {
            addCriterion("sJewel5Fee <=", value, "sJewel5Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel5FeeIn(List<Double> values) {
            addCriterion("sJewel5Fee in", values, "sJewel5Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel5FeeNotIn(List<Double> values) {
            addCriterion("sJewel5Fee not in", values, "sJewel5Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel5FeeBetween(Double value1, Double value2) {
            addCriterion("sJewel5Fee between", value1, value2, "sJewel5Fee");
            return (Criteria) this;
        }

        public Criteria andSJewel5FeeNotBetween(Double value1, Double value2) {
            addCriterion("sJewel5Fee not between", value1, value2, "sJewel5Fee");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("origin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("origin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("origin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("origin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("origin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("origin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("origin like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("origin not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("origin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("origin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("origin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("origin not between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employeeId is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employeeId is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Integer value) {
            addCriterion("employeeId =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Integer value) {
            addCriterion("employeeId <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Integer value) {
            addCriterion("employeeId >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("employeeId >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Integer value) {
            addCriterion("employeeId <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("employeeId <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Integer> values) {
            addCriterion("employeeId in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Integer> values) {
            addCriterion("employeeId not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("employeeId between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("employeeId not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNull() {
            addCriterion("employeeName is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("employeeName is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("employeeName =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("employeeName <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("employeeName >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("employeeName >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("employeeName <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("employeeName <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("employeeName like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("employeeName not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("employeeName in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("employeeName not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("employeeName between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("employeeName not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andHasReturnIsNull() {
            addCriterion("hasReturn is null");
            return (Criteria) this;
        }

        public Criteria andHasReturnIsNotNull() {
            addCriterion("hasReturn is not null");
            return (Criteria) this;
        }

        public Criteria andHasReturnEqualTo(Integer value) {
            addCriterion("hasReturn =", value, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andHasReturnNotEqualTo(Integer value) {
            addCriterion("hasReturn <>", value, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andHasReturnGreaterThan(Integer value) {
            addCriterion("hasReturn >", value, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andHasReturnGreaterThanOrEqualTo(Integer value) {
            addCriterion("hasReturn >=", value, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andHasReturnLessThan(Integer value) {
            addCriterion("hasReturn <", value, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andHasReturnLessThanOrEqualTo(Integer value) {
            addCriterion("hasReturn <=", value, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andHasReturnIn(List<Integer> values) {
            addCriterion("hasReturn in", values, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andHasReturnNotIn(List<Integer> values) {
            addCriterion("hasReturn not in", values, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andHasReturnBetween(Integer value1, Integer value2) {
            addCriterion("hasReturn between", value1, value2, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andHasReturnNotBetween(Integer value1, Integer value2) {
            addCriterion("hasReturn not between", value1, value2, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andUpperMoneyIsNull() {
            addCriterion("upperMoney is null");
            return (Criteria) this;
        }

        public Criteria andUpperMoneyIsNotNull() {
            addCriterion("upperMoney is not null");
            return (Criteria) this;
        }

        public Criteria andUpperMoneyEqualTo(Double value) {
            addCriterion("upperMoney =", value, "upperMoney");
            return (Criteria) this;
        }

        public Criteria andUpperMoneyNotEqualTo(Double value) {
            addCriterion("upperMoney <>", value, "upperMoney");
            return (Criteria) this;
        }

        public Criteria andUpperMoneyGreaterThan(Double value) {
            addCriterion("upperMoney >", value, "upperMoney");
            return (Criteria) this;
        }

        public Criteria andUpperMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("upperMoney >=", value, "upperMoney");
            return (Criteria) this;
        }

        public Criteria andUpperMoneyLessThan(Double value) {
            addCriterion("upperMoney <", value, "upperMoney");
            return (Criteria) this;
        }

        public Criteria andUpperMoneyLessThanOrEqualTo(Double value) {
            addCriterion("upperMoney <=", value, "upperMoney");
            return (Criteria) this;
        }

        public Criteria andUpperMoneyIn(List<Double> values) {
            addCriterion("upperMoney in", values, "upperMoney");
            return (Criteria) this;
        }

        public Criteria andUpperMoneyNotIn(List<Double> values) {
            addCriterion("upperMoney not in", values, "upperMoney");
            return (Criteria) this;
        }

        public Criteria andUpperMoneyBetween(Double value1, Double value2) {
            addCriterion("upperMoney between", value1, value2, "upperMoney");
            return (Criteria) this;
        }

        public Criteria andUpperMoneyNotBetween(Double value1, Double value2) {
            addCriterion("upperMoney not between", value1, value2, "upperMoney");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountIsNull() {
            addCriterion("purchaseAmount is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountIsNotNull() {
            addCriterion("purchaseAmount is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountEqualTo(Double value) {
            addCriterion("purchaseAmount =", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountNotEqualTo(Double value) {
            addCriterion("purchaseAmount <>", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountGreaterThan(Double value) {
            addCriterion("purchaseAmount >", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("purchaseAmount >=", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountLessThan(Double value) {
            addCriterion("purchaseAmount <", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountLessThanOrEqualTo(Double value) {
            addCriterion("purchaseAmount <=", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountIn(List<Double> values) {
            addCriterion("purchaseAmount in", values, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountNotIn(List<Double> values) {
            addCriterion("purchaseAmount not in", values, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountBetween(Double value1, Double value2) {
            addCriterion("purchaseAmount between", value1, value2, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountNotBetween(Double value1, Double value2) {
            addCriterion("purchaseAmount not between", value1, value2, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andRefineFeeIsNull() {
            addCriterion("refineFee is null");
            return (Criteria) this;
        }

        public Criteria andRefineFeeIsNotNull() {
            addCriterion("refineFee is not null");
            return (Criteria) this;
        }

        public Criteria andRefineFeeEqualTo(Double value) {
            addCriterion("refineFee =", value, "refineFee");
            return (Criteria) this;
        }

        public Criteria andRefineFeeNotEqualTo(Double value) {
            addCriterion("refineFee <>", value, "refineFee");
            return (Criteria) this;
        }

        public Criteria andRefineFeeGreaterThan(Double value) {
            addCriterion("refineFee >", value, "refineFee");
            return (Criteria) this;
        }

        public Criteria andRefineFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("refineFee >=", value, "refineFee");
            return (Criteria) this;
        }

        public Criteria andRefineFeeLessThan(Double value) {
            addCriterion("refineFee <", value, "refineFee");
            return (Criteria) this;
        }

        public Criteria andRefineFeeLessThanOrEqualTo(Double value) {
            addCriterion("refineFee <=", value, "refineFee");
            return (Criteria) this;
        }

        public Criteria andRefineFeeIn(List<Double> values) {
            addCriterion("refineFee in", values, "refineFee");
            return (Criteria) this;
        }

        public Criteria andRefineFeeNotIn(List<Double> values) {
            addCriterion("refineFee not in", values, "refineFee");
            return (Criteria) this;
        }

        public Criteria andRefineFeeBetween(Double value1, Double value2) {
            addCriterion("refineFee between", value1, value2, "refineFee");
            return (Criteria) this;
        }

        public Criteria andRefineFeeNotBetween(Double value1, Double value2) {
            addCriterion("refineFee not between", value1, value2, "refineFee");
            return (Criteria) this;
        }

        public Criteria andRefineFeeTotalIsNull() {
            addCriterion("refineFeeTotal is null");
            return (Criteria) this;
        }

        public Criteria andRefineFeeTotalIsNotNull() {
            addCriterion("refineFeeTotal is not null");
            return (Criteria) this;
        }

        public Criteria andRefineFeeTotalEqualTo(Double value) {
            addCriterion("refineFeeTotal =", value, "refineFeeTotal");
            return (Criteria) this;
        }

        public Criteria andRefineFeeTotalNotEqualTo(Double value) {
            addCriterion("refineFeeTotal <>", value, "refineFeeTotal");
            return (Criteria) this;
        }

        public Criteria andRefineFeeTotalGreaterThan(Double value) {
            addCriterion("refineFeeTotal >", value, "refineFeeTotal");
            return (Criteria) this;
        }

        public Criteria andRefineFeeTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("refineFeeTotal >=", value, "refineFeeTotal");
            return (Criteria) this;
        }

        public Criteria andRefineFeeTotalLessThan(Double value) {
            addCriterion("refineFeeTotal <", value, "refineFeeTotal");
            return (Criteria) this;
        }

        public Criteria andRefineFeeTotalLessThanOrEqualTo(Double value) {
            addCriterion("refineFeeTotal <=", value, "refineFeeTotal");
            return (Criteria) this;
        }

        public Criteria andRefineFeeTotalIn(List<Double> values) {
            addCriterion("refineFeeTotal in", values, "refineFeeTotal");
            return (Criteria) this;
        }

        public Criteria andRefineFeeTotalNotIn(List<Double> values) {
            addCriterion("refineFeeTotal not in", values, "refineFeeTotal");
            return (Criteria) this;
        }

        public Criteria andRefineFeeTotalBetween(Double value1, Double value2) {
            addCriterion("refineFeeTotal between", value1, value2, "refineFeeTotal");
            return (Criteria) this;
        }

        public Criteria andRefineFeeTotalNotBetween(Double value1, Double value2) {
            addCriterion("refineFeeTotal not between", value1, value2, "refineFeeTotal");
            return (Criteria) this;
        }

        public Criteria andOldStockIdIsNull() {
            addCriterion("oldStockId is null");
            return (Criteria) this;
        }

        public Criteria andOldStockIdIsNotNull() {
            addCriterion("oldStockId is not null");
            return (Criteria) this;
        }

        public Criteria andOldStockIdEqualTo(Integer value) {
            addCriterion("oldStockId =", value, "oldStockId");
            return (Criteria) this;
        }

        public Criteria andOldStockIdNotEqualTo(Integer value) {
            addCriterion("oldStockId <>", value, "oldStockId");
            return (Criteria) this;
        }

        public Criteria andOldStockIdGreaterThan(Integer value) {
            addCriterion("oldStockId >", value, "oldStockId");
            return (Criteria) this;
        }

        public Criteria andOldStockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("oldStockId >=", value, "oldStockId");
            return (Criteria) this;
        }

        public Criteria andOldStockIdLessThan(Integer value) {
            addCriterion("oldStockId <", value, "oldStockId");
            return (Criteria) this;
        }

        public Criteria andOldStockIdLessThanOrEqualTo(Integer value) {
            addCriterion("oldStockId <=", value, "oldStockId");
            return (Criteria) this;
        }

        public Criteria andOldStockIdIn(List<Integer> values) {
            addCriterion("oldStockId in", values, "oldStockId");
            return (Criteria) this;
        }

        public Criteria andOldStockIdNotIn(List<Integer> values) {
            addCriterion("oldStockId not in", values, "oldStockId");
            return (Criteria) this;
        }

        public Criteria andOldStockIdBetween(Integer value1, Integer value2) {
            addCriterion("oldStockId between", value1, value2, "oldStockId");
            return (Criteria) this;
        }

        public Criteria andOldStockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("oldStockId not between", value1, value2, "oldStockId");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("receiveTime is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("receiveTime is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(String value) {
            addCriterion("receiveTime =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(String value) {
            addCriterion("receiveTime <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(String value) {
            addCriterion("receiveTime >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("receiveTime >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(String value) {
            addCriterion("receiveTime <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(String value) {
            addCriterion("receiveTime <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLike(String value) {
            addCriterion("receiveTime like", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotLike(String value) {
            addCriterion("receiveTime not like", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<String> values) {
            addCriterion("receiveTime in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<String> values) {
            addCriterion("receiveTime not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(String value1, String value2) {
            addCriterion("receiveTime between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(String value1, String value2) {
            addCriterion("receiveTime not between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andMutilFlagIsNull() {
            addCriterion("mutilFlag is null");
            return (Criteria) this;
        }

        public Criteria andMutilFlagIsNotNull() {
            addCriterion("mutilFlag is not null");
            return (Criteria) this;
        }

        public Criteria andMutilFlagEqualTo(Integer value) {
            addCriterion("mutilFlag =", value, "mutilFlag");
            return (Criteria) this;
        }

        public Criteria andMutilFlagNotEqualTo(Integer value) {
            addCriterion("mutilFlag <>", value, "mutilFlag");
            return (Criteria) this;
        }

        public Criteria andMutilFlagGreaterThan(Integer value) {
            addCriterion("mutilFlag >", value, "mutilFlag");
            return (Criteria) this;
        }

        public Criteria andMutilFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("mutilFlag >=", value, "mutilFlag");
            return (Criteria) this;
        }

        public Criteria andMutilFlagLessThan(Integer value) {
            addCriterion("mutilFlag <", value, "mutilFlag");
            return (Criteria) this;
        }

        public Criteria andMutilFlagLessThanOrEqualTo(Integer value) {
            addCriterion("mutilFlag <=", value, "mutilFlag");
            return (Criteria) this;
        }

        public Criteria andMutilFlagIn(List<Integer> values) {
            addCriterion("mutilFlag in", values, "mutilFlag");
            return (Criteria) this;
        }

        public Criteria andMutilFlagNotIn(List<Integer> values) {
            addCriterion("mutilFlag not in", values, "mutilFlag");
            return (Criteria) this;
        }

        public Criteria andMutilFlagBetween(Integer value1, Integer value2) {
            addCriterion("mutilFlag between", value1, value2, "mutilFlag");
            return (Criteria) this;
        }

        public Criteria andMutilFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("mutilFlag not between", value1, value2, "mutilFlag");
            return (Criteria) this;
        }

        public Criteria andPriceRangeIsNull() {
            addCriterion("priceRange is null");
            return (Criteria) this;
        }

        public Criteria andPriceRangeIsNotNull() {
            addCriterion("priceRange is not null");
            return (Criteria) this;
        }

        public Criteria andPriceRangeEqualTo(String value) {
            addCriterion("priceRange =", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeNotEqualTo(String value) {
            addCriterion("priceRange <>", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeGreaterThan(String value) {
            addCriterion("priceRange >", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeGreaterThanOrEqualTo(String value) {
            addCriterion("priceRange >=", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeLessThan(String value) {
            addCriterion("priceRange <", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeLessThanOrEqualTo(String value) {
            addCriterion("priceRange <=", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeLike(String value) {
            addCriterion("priceRange like", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeNotLike(String value) {
            addCriterion("priceRange not like", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeIn(List<String> values) {
            addCriterion("priceRange in", values, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeNotIn(List<String> values) {
            addCriterion("priceRange not in", values, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeBetween(String value1, String value2) {
            addCriterion("priceRange between", value1, value2, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeNotBetween(String value1, String value2) {
            addCriterion("priceRange not between", value1, value2, "priceRange");
            return (Criteria) this;
        }

        public Criteria andGoldRangeIsNull() {
            addCriterion("goldRange is null");
            return (Criteria) this;
        }

        public Criteria andGoldRangeIsNotNull() {
            addCriterion("goldRange is not null");
            return (Criteria) this;
        }

        public Criteria andGoldRangeEqualTo(String value) {
            addCriterion("goldRange =", value, "goldRange");
            return (Criteria) this;
        }

        public Criteria andGoldRangeNotEqualTo(String value) {
            addCriterion("goldRange <>", value, "goldRange");
            return (Criteria) this;
        }

        public Criteria andGoldRangeGreaterThan(String value) {
            addCriterion("goldRange >", value, "goldRange");
            return (Criteria) this;
        }

        public Criteria andGoldRangeGreaterThanOrEqualTo(String value) {
            addCriterion("goldRange >=", value, "goldRange");
            return (Criteria) this;
        }

        public Criteria andGoldRangeLessThan(String value) {
            addCriterion("goldRange <", value, "goldRange");
            return (Criteria) this;
        }

        public Criteria andGoldRangeLessThanOrEqualTo(String value) {
            addCriterion("goldRange <=", value, "goldRange");
            return (Criteria) this;
        }

        public Criteria andGoldRangeLike(String value) {
            addCriterion("goldRange like", value, "goldRange");
            return (Criteria) this;
        }

        public Criteria andGoldRangeNotLike(String value) {
            addCriterion("goldRange not like", value, "goldRange");
            return (Criteria) this;
        }

        public Criteria andGoldRangeIn(List<String> values) {
            addCriterion("goldRange in", values, "goldRange");
            return (Criteria) this;
        }

        public Criteria andGoldRangeNotIn(List<String> values) {
            addCriterion("goldRange not in", values, "goldRange");
            return (Criteria) this;
        }

        public Criteria andGoldRangeBetween(String value1, String value2) {
            addCriterion("goldRange between", value1, value2, "goldRange");
            return (Criteria) this;
        }

        public Criteria andGoldRangeNotBetween(String value1, String value2) {
            addCriterion("goldRange not between", value1, value2, "goldRange");
            return (Criteria) this;
        }

        public Criteria andCostRangeIsNull() {
            addCriterion("costRange is null");
            return (Criteria) this;
        }

        public Criteria andCostRangeIsNotNull() {
            addCriterion("costRange is not null");
            return (Criteria) this;
        }

        public Criteria andCostRangeEqualTo(String value) {
            addCriterion("costRange =", value, "costRange");
            return (Criteria) this;
        }

        public Criteria andCostRangeNotEqualTo(String value) {
            addCriterion("costRange <>", value, "costRange");
            return (Criteria) this;
        }

        public Criteria andCostRangeGreaterThan(String value) {
            addCriterion("costRange >", value, "costRange");
            return (Criteria) this;
        }

        public Criteria andCostRangeGreaterThanOrEqualTo(String value) {
            addCriterion("costRange >=", value, "costRange");
            return (Criteria) this;
        }

        public Criteria andCostRangeLessThan(String value) {
            addCriterion("costRange <", value, "costRange");
            return (Criteria) this;
        }

        public Criteria andCostRangeLessThanOrEqualTo(String value) {
            addCriterion("costRange <=", value, "costRange");
            return (Criteria) this;
        }

        public Criteria andCostRangeLike(String value) {
            addCriterion("costRange like", value, "costRange");
            return (Criteria) this;
        }

        public Criteria andCostRangeNotLike(String value) {
            addCriterion("costRange not like", value, "costRange");
            return (Criteria) this;
        }

        public Criteria andCostRangeIn(List<String> values) {
            addCriterion("costRange in", values, "costRange");
            return (Criteria) this;
        }

        public Criteria andCostRangeNotIn(List<String> values) {
            addCriterion("costRange not in", values, "costRange");
            return (Criteria) this;
        }

        public Criteria andCostRangeBetween(String value1, String value2) {
            addCriterion("costRange between", value1, value2, "costRange");
            return (Criteria) this;
        }

        public Criteria andCostRangeNotBetween(String value1, String value2) {
            addCriterion("costRange not between", value1, value2, "costRange");
            return (Criteria) this;
        }

        public Criteria andColorRangeIsNull() {
            addCriterion("colorRange is null");
            return (Criteria) this;
        }

        public Criteria andColorRangeIsNotNull() {
            addCriterion("colorRange is not null");
            return (Criteria) this;
        }

        public Criteria andColorRangeEqualTo(String value) {
            addCriterion("colorRange =", value, "colorRange");
            return (Criteria) this;
        }

        public Criteria andColorRangeNotEqualTo(String value) {
            addCriterion("colorRange <>", value, "colorRange");
            return (Criteria) this;
        }

        public Criteria andColorRangeGreaterThan(String value) {
            addCriterion("colorRange >", value, "colorRange");
            return (Criteria) this;
        }

        public Criteria andColorRangeGreaterThanOrEqualTo(String value) {
            addCriterion("colorRange >=", value, "colorRange");
            return (Criteria) this;
        }

        public Criteria andColorRangeLessThan(String value) {
            addCriterion("colorRange <", value, "colorRange");
            return (Criteria) this;
        }

        public Criteria andColorRangeLessThanOrEqualTo(String value) {
            addCriterion("colorRange <=", value, "colorRange");
            return (Criteria) this;
        }

        public Criteria andColorRangeLike(String value) {
            addCriterion("colorRange like", value, "colorRange");
            return (Criteria) this;
        }

        public Criteria andColorRangeNotLike(String value) {
            addCriterion("colorRange not like", value, "colorRange");
            return (Criteria) this;
        }

        public Criteria andColorRangeIn(List<String> values) {
            addCriterion("colorRange in", values, "colorRange");
            return (Criteria) this;
        }

        public Criteria andColorRangeNotIn(List<String> values) {
            addCriterion("colorRange not in", values, "colorRange");
            return (Criteria) this;
        }

        public Criteria andColorRangeBetween(String value1, String value2) {
            addCriterion("colorRange between", value1, value2, "colorRange");
            return (Criteria) this;
        }

        public Criteria andColorRangeNotBetween(String value1, String value2) {
            addCriterion("colorRange not between", value1, value2, "colorRange");
            return (Criteria) this;
        }

        public Criteria andClarityRangeIsNull() {
            addCriterion("clarityRange is null");
            return (Criteria) this;
        }

        public Criteria andClarityRangeIsNotNull() {
            addCriterion("clarityRange is not null");
            return (Criteria) this;
        }

        public Criteria andClarityRangeEqualTo(String value) {
            addCriterion("clarityRange =", value, "clarityRange");
            return (Criteria) this;
        }

        public Criteria andClarityRangeNotEqualTo(String value) {
            addCriterion("clarityRange <>", value, "clarityRange");
            return (Criteria) this;
        }

        public Criteria andClarityRangeGreaterThan(String value) {
            addCriterion("clarityRange >", value, "clarityRange");
            return (Criteria) this;
        }

        public Criteria andClarityRangeGreaterThanOrEqualTo(String value) {
            addCriterion("clarityRange >=", value, "clarityRange");
            return (Criteria) this;
        }

        public Criteria andClarityRangeLessThan(String value) {
            addCriterion("clarityRange <", value, "clarityRange");
            return (Criteria) this;
        }

        public Criteria andClarityRangeLessThanOrEqualTo(String value) {
            addCriterion("clarityRange <=", value, "clarityRange");
            return (Criteria) this;
        }

        public Criteria andClarityRangeLike(String value) {
            addCriterion("clarityRange like", value, "clarityRange");
            return (Criteria) this;
        }

        public Criteria andClarityRangeNotLike(String value) {
            addCriterion("clarityRange not like", value, "clarityRange");
            return (Criteria) this;
        }

        public Criteria andClarityRangeIn(List<String> values) {
            addCriterion("clarityRange in", values, "clarityRange");
            return (Criteria) this;
        }

        public Criteria andClarityRangeNotIn(List<String> values) {
            addCriterion("clarityRange not in", values, "clarityRange");
            return (Criteria) this;
        }

        public Criteria andClarityRangeBetween(String value1, String value2) {
            addCriterion("clarityRange between", value1, value2, "clarityRange");
            return (Criteria) this;
        }

        public Criteria andClarityRangeNotBetween(String value1, String value2) {
            addCriterion("clarityRange not between", value1, value2, "clarityRange");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("createTime like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("createTime not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOutNumIsNull() {
            addCriterion("outNum is null");
            return (Criteria) this;
        }

        public Criteria andOutNumIsNotNull() {
            addCriterion("outNum is not null");
            return (Criteria) this;
        }

        public Criteria andOutNumEqualTo(Integer value) {
            addCriterion("outNum =", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumNotEqualTo(Integer value) {
            addCriterion("outNum <>", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumGreaterThan(Integer value) {
            addCriterion("outNum >", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("outNum >=", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumLessThan(Integer value) {
            addCriterion("outNum <", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumLessThanOrEqualTo(Integer value) {
            addCriterion("outNum <=", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumIn(List<Integer> values) {
            addCriterion("outNum in", values, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumNotIn(List<Integer> values) {
            addCriterion("outNum not in", values, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumBetween(Integer value1, Integer value2) {
            addCriterion("outNum between", value1, value2, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumNotBetween(Integer value1, Integer value2) {
            addCriterion("outNum not between", value1, value2, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutGoldWeightIsNull() {
            addCriterion("outGoldWeight is null");
            return (Criteria) this;
        }

        public Criteria andOutGoldWeightIsNotNull() {
            addCriterion("outGoldWeight is not null");
            return (Criteria) this;
        }

        public Criteria andOutGoldWeightEqualTo(Double value) {
            addCriterion("outGoldWeight =", value, "outGoldWeight");
            return (Criteria) this;
        }

        public Criteria andOutGoldWeightNotEqualTo(Double value) {
            addCriterion("outGoldWeight <>", value, "outGoldWeight");
            return (Criteria) this;
        }

        public Criteria andOutGoldWeightGreaterThan(Double value) {
            addCriterion("outGoldWeight >", value, "outGoldWeight");
            return (Criteria) this;
        }

        public Criteria andOutGoldWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("outGoldWeight >=", value, "outGoldWeight");
            return (Criteria) this;
        }

        public Criteria andOutGoldWeightLessThan(Double value) {
            addCriterion("outGoldWeight <", value, "outGoldWeight");
            return (Criteria) this;
        }

        public Criteria andOutGoldWeightLessThanOrEqualTo(Double value) {
            addCriterion("outGoldWeight <=", value, "outGoldWeight");
            return (Criteria) this;
        }

        public Criteria andOutGoldWeightIn(List<Double> values) {
            addCriterion("outGoldWeight in", values, "outGoldWeight");
            return (Criteria) this;
        }

        public Criteria andOutGoldWeightNotIn(List<Double> values) {
            addCriterion("outGoldWeight not in", values, "outGoldWeight");
            return (Criteria) this;
        }

        public Criteria andOutGoldWeightBetween(Double value1, Double value2) {
            addCriterion("outGoldWeight between", value1, value2, "outGoldWeight");
            return (Criteria) this;
        }

        public Criteria andOutGoldWeightNotBetween(Double value1, Double value2) {
            addCriterion("outGoldWeight not between", value1, value2, "outGoldWeight");
            return (Criteria) this;
        }

        public Criteria andOutMJewelWeightIsNull() {
            addCriterion("outMJewelWeight is null");
            return (Criteria) this;
        }

        public Criteria andOutMJewelWeightIsNotNull() {
            addCriterion("outMJewelWeight is not null");
            return (Criteria) this;
        }

        public Criteria andOutMJewelWeightEqualTo(Double value) {
            addCriterion("outMJewelWeight =", value, "outMJewelWeight");
            return (Criteria) this;
        }

        public Criteria andOutMJewelWeightNotEqualTo(Double value) {
            addCriterion("outMJewelWeight <>", value, "outMJewelWeight");
            return (Criteria) this;
        }

        public Criteria andOutMJewelWeightGreaterThan(Double value) {
            addCriterion("outMJewelWeight >", value, "outMJewelWeight");
            return (Criteria) this;
        }

        public Criteria andOutMJewelWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("outMJewelWeight >=", value, "outMJewelWeight");
            return (Criteria) this;
        }

        public Criteria andOutMJewelWeightLessThan(Double value) {
            addCriterion("outMJewelWeight <", value, "outMJewelWeight");
            return (Criteria) this;
        }

        public Criteria andOutMJewelWeightLessThanOrEqualTo(Double value) {
            addCriterion("outMJewelWeight <=", value, "outMJewelWeight");
            return (Criteria) this;
        }

        public Criteria andOutMJewelWeightIn(List<Double> values) {
            addCriterion("outMJewelWeight in", values, "outMJewelWeight");
            return (Criteria) this;
        }

        public Criteria andOutMJewelWeightNotIn(List<Double> values) {
            addCriterion("outMJewelWeight not in", values, "outMJewelWeight");
            return (Criteria) this;
        }

        public Criteria andOutMJewelWeightBetween(Double value1, Double value2) {
            addCriterion("outMJewelWeight between", value1, value2, "outMJewelWeight");
            return (Criteria) this;
        }

        public Criteria andOutMJewelWeightNotBetween(Double value1, Double value2) {
            addCriterion("outMJewelWeight not between", value1, value2, "outMJewelWeight");
            return (Criteria) this;
        }

        public Criteria andOutCostPriceIsNull() {
            addCriterion("outCostPrice is null");
            return (Criteria) this;
        }

        public Criteria andOutCostPriceIsNotNull() {
            addCriterion("outCostPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOutCostPriceEqualTo(Double value) {
            addCriterion("outCostPrice =", value, "outCostPrice");
            return (Criteria) this;
        }

        public Criteria andOutCostPriceNotEqualTo(Double value) {
            addCriterion("outCostPrice <>", value, "outCostPrice");
            return (Criteria) this;
        }

        public Criteria andOutCostPriceGreaterThan(Double value) {
            addCriterion("outCostPrice >", value, "outCostPrice");
            return (Criteria) this;
        }

        public Criteria andOutCostPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("outCostPrice >=", value, "outCostPrice");
            return (Criteria) this;
        }

        public Criteria andOutCostPriceLessThan(Double value) {
            addCriterion("outCostPrice <", value, "outCostPrice");
            return (Criteria) this;
        }

        public Criteria andOutCostPriceLessThanOrEqualTo(Double value) {
            addCriterion("outCostPrice <=", value, "outCostPrice");
            return (Criteria) this;
        }

        public Criteria andOutCostPriceIn(List<Double> values) {
            addCriterion("outCostPrice in", values, "outCostPrice");
            return (Criteria) this;
        }

        public Criteria andOutCostPriceNotIn(List<Double> values) {
            addCriterion("outCostPrice not in", values, "outCostPrice");
            return (Criteria) this;
        }

        public Criteria andOutCostPriceBetween(Double value1, Double value2) {
            addCriterion("outCostPrice between", value1, value2, "outCostPrice");
            return (Criteria) this;
        }

        public Criteria andOutCostPriceNotBetween(Double value1, Double value2) {
            addCriterion("outCostPrice not between", value1, value2, "outCostPrice");
            return (Criteria) this;
        }

        public Criteria andOutLabelPriceSumIsNull() {
            addCriterion("outLabelPriceSum is null");
            return (Criteria) this;
        }

        public Criteria andOutLabelPriceSumIsNotNull() {
            addCriterion("outLabelPriceSum is not null");
            return (Criteria) this;
        }

        public Criteria andOutLabelPriceSumEqualTo(Double value) {
            addCriterion("outLabelPriceSum =", value, "outLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andOutLabelPriceSumNotEqualTo(Double value) {
            addCriterion("outLabelPriceSum <>", value, "outLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andOutLabelPriceSumGreaterThan(Double value) {
            addCriterion("outLabelPriceSum >", value, "outLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andOutLabelPriceSumGreaterThanOrEqualTo(Double value) {
            addCriterion("outLabelPriceSum >=", value, "outLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andOutLabelPriceSumLessThan(Double value) {
            addCriterion("outLabelPriceSum <", value, "outLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andOutLabelPriceSumLessThanOrEqualTo(Double value) {
            addCriterion("outLabelPriceSum <=", value, "outLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andOutLabelPriceSumIn(List<Double> values) {
            addCriterion("outLabelPriceSum in", values, "outLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andOutLabelPriceSumNotIn(List<Double> values) {
            addCriterion("outLabelPriceSum not in", values, "outLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andOutLabelPriceSumBetween(Double value1, Double value2) {
            addCriterion("outLabelPriceSum between", value1, value2, "outLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andOutLabelPriceSumNotBetween(Double value1, Double value2) {
            addCriterion("outLabelPriceSum not between", value1, value2, "outLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andOutRemarksIsNull() {
            addCriterion("outRemarks is null");
            return (Criteria) this;
        }

        public Criteria andOutRemarksIsNotNull() {
            addCriterion("outRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andOutRemarksEqualTo(String value) {
            addCriterion("outRemarks =", value, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksNotEqualTo(String value) {
            addCriterion("outRemarks <>", value, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksGreaterThan(String value) {
            addCriterion("outRemarks >", value, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("outRemarks >=", value, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksLessThan(String value) {
            addCriterion("outRemarks <", value, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksLessThanOrEqualTo(String value) {
            addCriterion("outRemarks <=", value, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksLike(String value) {
            addCriterion("outRemarks like", value, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksNotLike(String value) {
            addCriterion("outRemarks not like", value, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksIn(List<String> values) {
            addCriterion("outRemarks in", values, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksNotIn(List<String> values) {
            addCriterion("outRemarks not in", values, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksBetween(String value1, String value2) {
            addCriterion("outRemarks between", value1, value2, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksNotBetween(String value1, String value2) {
            addCriterion("outRemarks not between", value1, value2, "outRemarks");
            return (Criteria) this;
        }
    }

    /**
     * bill_transfer_item
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * bill_transfer_item null
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}