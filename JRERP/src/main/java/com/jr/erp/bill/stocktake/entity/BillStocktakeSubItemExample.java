package com.jr.erp.bill.stocktake.entity;

import com.jr.erp.base.mybatis.BaseExample;
import java.util.ArrayList;
import java.util.List;

public class BillStocktakeSubItemExample extends BaseExample {
    /**
     * bill_stocktake_sub_item
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public BillStocktakeSubItemExample() {
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
     * bill_stocktake_sub_item null
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

        public Criteria andMajorBillIdIsNull() {
            addCriterion("majorBillId is null");
            return (Criteria) this;
        }

        public Criteria andMajorBillIdIsNotNull() {
            addCriterion("majorBillId is not null");
            return (Criteria) this;
        }

        public Criteria andMajorBillIdEqualTo(Integer value) {
            addCriterion("majorBillId =", value, "majorBillId");
            return (Criteria) this;
        }

        public Criteria andMajorBillIdNotEqualTo(Integer value) {
            addCriterion("majorBillId <>", value, "majorBillId");
            return (Criteria) this;
        }

        public Criteria andMajorBillIdGreaterThan(Integer value) {
            addCriterion("majorBillId >", value, "majorBillId");
            return (Criteria) this;
        }

        public Criteria andMajorBillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("majorBillId >=", value, "majorBillId");
            return (Criteria) this;
        }

        public Criteria andMajorBillIdLessThan(Integer value) {
            addCriterion("majorBillId <", value, "majorBillId");
            return (Criteria) this;
        }

        public Criteria andMajorBillIdLessThanOrEqualTo(Integer value) {
            addCriterion("majorBillId <=", value, "majorBillId");
            return (Criteria) this;
        }

        public Criteria andMajorBillIdIn(List<Integer> values) {
            addCriterion("majorBillId in", values, "majorBillId");
            return (Criteria) this;
        }

        public Criteria andMajorBillIdNotIn(List<Integer> values) {
            addCriterion("majorBillId not in", values, "majorBillId");
            return (Criteria) this;
        }

        public Criteria andMajorBillIdBetween(Integer value1, Integer value2) {
            addCriterion("majorBillId between", value1, value2, "majorBillId");
            return (Criteria) this;
        }

        public Criteria andMajorBillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("majorBillId not between", value1, value2, "majorBillId");
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

        public Criteria andMajorBillNoIsNull() {
            addCriterion("majorBillNo is null");
            return (Criteria) this;
        }

        public Criteria andMajorBillNoIsNotNull() {
            addCriterion("majorBillNo is not null");
            return (Criteria) this;
        }

        public Criteria andMajorBillNoEqualTo(String value) {
            addCriterion("majorBillNo =", value, "majorBillNo");
            return (Criteria) this;
        }

        public Criteria andMajorBillNoNotEqualTo(String value) {
            addCriterion("majorBillNo <>", value, "majorBillNo");
            return (Criteria) this;
        }

        public Criteria andMajorBillNoGreaterThan(String value) {
            addCriterion("majorBillNo >", value, "majorBillNo");
            return (Criteria) this;
        }

        public Criteria andMajorBillNoGreaterThanOrEqualTo(String value) {
            addCriterion("majorBillNo >=", value, "majorBillNo");
            return (Criteria) this;
        }

        public Criteria andMajorBillNoLessThan(String value) {
            addCriterion("majorBillNo <", value, "majorBillNo");
            return (Criteria) this;
        }

        public Criteria andMajorBillNoLessThanOrEqualTo(String value) {
            addCriterion("majorBillNo <=", value, "majorBillNo");
            return (Criteria) this;
        }

        public Criteria andMajorBillNoLike(String value) {
            addCriterion("majorBillNo like", value, "majorBillNo");
            return (Criteria) this;
        }

        public Criteria andMajorBillNoNotLike(String value) {
            addCriterion("majorBillNo not like", value, "majorBillNo");
            return (Criteria) this;
        }

        public Criteria andMajorBillNoIn(List<String> values) {
            addCriterion("majorBillNo in", values, "majorBillNo");
            return (Criteria) this;
        }

        public Criteria andMajorBillNoNotIn(List<String> values) {
            addCriterion("majorBillNo not in", values, "majorBillNo");
            return (Criteria) this;
        }

        public Criteria andMajorBillNoBetween(String value1, String value2) {
            addCriterion("majorBillNo between", value1, value2, "majorBillNo");
            return (Criteria) this;
        }

        public Criteria andMajorBillNoNotBetween(String value1, String value2) {
            addCriterion("majorBillNo not between", value1, value2, "majorBillNo");
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

        public Criteria andSysBillNoEqualTo(Integer value) {
            addCriterion("sysBillNo =", value, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoNotEqualTo(Integer value) {
            addCriterion("sysBillNo <>", value, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoGreaterThan(Integer value) {
            addCriterion("sysBillNo >", value, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysBillNo >=", value, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoLessThan(Integer value) {
            addCriterion("sysBillNo <", value, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoLessThanOrEqualTo(Integer value) {
            addCriterion("sysBillNo <=", value, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoIn(List<Integer> values) {
            addCriterion("sysBillNo in", values, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoNotIn(List<Integer> values) {
            addCriterion("sysBillNo not in", values, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoBetween(Integer value1, Integer value2) {
            addCriterion("sysBillNo between", value1, value2, "sysBillNo");
            return (Criteria) this;
        }

        public Criteria andSysBillNoNotBetween(Integer value1, Integer value2) {
            addCriterion("sysBillNo not between", value1, value2, "sysBillNo");
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

        public Criteria andGoodsNameIsNull() {
            addCriterion("goodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goodsName =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goodsName <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goodsName >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsName >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goodsName <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goodsName <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goodsName like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goodsName not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goodsName in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goodsName not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goodsName between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goodsName not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyIsNull() {
            addCriterion("goodsClassify is null");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyIsNotNull() {
            addCriterion("goodsClassify is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyEqualTo(String value) {
            addCriterion("goodsClassify =", value, "goodsClassify");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyNotEqualTo(String value) {
            addCriterion("goodsClassify <>", value, "goodsClassify");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyGreaterThan(String value) {
            addCriterion("goodsClassify >", value, "goodsClassify");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("goodsClassify >=", value, "goodsClassify");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyLessThan(String value) {
            addCriterion("goodsClassify <", value, "goodsClassify");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyLessThanOrEqualTo(String value) {
            addCriterion("goodsClassify <=", value, "goodsClassify");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyLike(String value) {
            addCriterion("goodsClassify like", value, "goodsClassify");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyNotLike(String value) {
            addCriterion("goodsClassify not like", value, "goodsClassify");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyIn(List<String> values) {
            addCriterion("goodsClassify in", values, "goodsClassify");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyNotIn(List<String> values) {
            addCriterion("goodsClassify not in", values, "goodsClassify");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyBetween(String value1, String value2) {
            addCriterion("goodsClassify between", value1, value2, "goodsClassify");
            return (Criteria) this;
        }

        public Criteria andGoodsClassifyNotBetween(String value1, String value2) {
            addCriterion("goodsClassify not between", value1, value2, "goodsClassify");
            return (Criteria) this;
        }

        public Criteria andMainTypePrefixIsNull() {
            addCriterion("mainTypePrefix is null");
            return (Criteria) this;
        }

        public Criteria andMainTypePrefixIsNotNull() {
            addCriterion("mainTypePrefix is not null");
            return (Criteria) this;
        }

        public Criteria andMainTypePrefixEqualTo(String value) {
            addCriterion("mainTypePrefix =", value, "mainTypePrefix");
            return (Criteria) this;
        }

        public Criteria andMainTypePrefixNotEqualTo(String value) {
            addCriterion("mainTypePrefix <>", value, "mainTypePrefix");
            return (Criteria) this;
        }

        public Criteria andMainTypePrefixGreaterThan(String value) {
            addCriterion("mainTypePrefix >", value, "mainTypePrefix");
            return (Criteria) this;
        }

        public Criteria andMainTypePrefixGreaterThanOrEqualTo(String value) {
            addCriterion("mainTypePrefix >=", value, "mainTypePrefix");
            return (Criteria) this;
        }

        public Criteria andMainTypePrefixLessThan(String value) {
            addCriterion("mainTypePrefix <", value, "mainTypePrefix");
            return (Criteria) this;
        }

        public Criteria andMainTypePrefixLessThanOrEqualTo(String value) {
            addCriterion("mainTypePrefix <=", value, "mainTypePrefix");
            return (Criteria) this;
        }

        public Criteria andMainTypePrefixLike(String value) {
            addCriterion("mainTypePrefix like", value, "mainTypePrefix");
            return (Criteria) this;
        }

        public Criteria andMainTypePrefixNotLike(String value) {
            addCriterion("mainTypePrefix not like", value, "mainTypePrefix");
            return (Criteria) this;
        }

        public Criteria andMainTypePrefixIn(List<String> values) {
            addCriterion("mainTypePrefix in", values, "mainTypePrefix");
            return (Criteria) this;
        }

        public Criteria andMainTypePrefixNotIn(List<String> values) {
            addCriterion("mainTypePrefix not in", values, "mainTypePrefix");
            return (Criteria) this;
        }

        public Criteria andMainTypePrefixBetween(String value1, String value2) {
            addCriterion("mainTypePrefix between", value1, value2, "mainTypePrefix");
            return (Criteria) this;
        }

        public Criteria andMainTypePrefixNotBetween(String value1, String value2) {
            addCriterion("mainTypePrefix not between", value1, value2, "mainTypePrefix");
            return (Criteria) this;
        }

        public Criteria andSaveFlagIsNull() {
            addCriterion("saveFlag is null");
            return (Criteria) this;
        }

        public Criteria andSaveFlagIsNotNull() {
            addCriterion("saveFlag is not null");
            return (Criteria) this;
        }

        public Criteria andSaveFlagEqualTo(Boolean value) {
            addCriterion("saveFlag =", value, "saveFlag");
            return (Criteria) this;
        }

        public Criteria andSaveFlagNotEqualTo(Boolean value) {
            addCriterion("saveFlag <>", value, "saveFlag");
            return (Criteria) this;
        }

        public Criteria andSaveFlagGreaterThan(Boolean value) {
            addCriterion("saveFlag >", value, "saveFlag");
            return (Criteria) this;
        }

        public Criteria andSaveFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("saveFlag >=", value, "saveFlag");
            return (Criteria) this;
        }

        public Criteria andSaveFlagLessThan(Boolean value) {
            addCriterion("saveFlag <", value, "saveFlag");
            return (Criteria) this;
        }

        public Criteria andSaveFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("saveFlag <=", value, "saveFlag");
            return (Criteria) this;
        }

        public Criteria andSaveFlagIn(List<Boolean> values) {
            addCriterion("saveFlag in", values, "saveFlag");
            return (Criteria) this;
        }

        public Criteria andSaveFlagNotIn(List<Boolean> values) {
            addCriterion("saveFlag not in", values, "saveFlag");
            return (Criteria) this;
        }

        public Criteria andSaveFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("saveFlag between", value1, value2, "saveFlag");
            return (Criteria) this;
        }

        public Criteria andSaveFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("saveFlag not between", value1, value2, "saveFlag");
            return (Criteria) this;
        }

        public Criteria andTakeNumIsNull() {
            addCriterion("takeNum is null");
            return (Criteria) this;
        }

        public Criteria andTakeNumIsNotNull() {
            addCriterion("takeNum is not null");
            return (Criteria) this;
        }

        public Criteria andTakeNumEqualTo(Integer value) {
            addCriterion("takeNum =", value, "takeNum");
            return (Criteria) this;
        }

        public Criteria andTakeNumNotEqualTo(Integer value) {
            addCriterion("takeNum <>", value, "takeNum");
            return (Criteria) this;
        }

        public Criteria andTakeNumGreaterThan(Integer value) {
            addCriterion("takeNum >", value, "takeNum");
            return (Criteria) this;
        }

        public Criteria andTakeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("takeNum >=", value, "takeNum");
            return (Criteria) this;
        }

        public Criteria andTakeNumLessThan(Integer value) {
            addCriterion("takeNum <", value, "takeNum");
            return (Criteria) this;
        }

        public Criteria andTakeNumLessThanOrEqualTo(Integer value) {
            addCriterion("takeNum <=", value, "takeNum");
            return (Criteria) this;
        }

        public Criteria andTakeNumIn(List<Integer> values) {
            addCriterion("takeNum in", values, "takeNum");
            return (Criteria) this;
        }

        public Criteria andTakeNumNotIn(List<Integer> values) {
            addCriterion("takeNum not in", values, "takeNum");
            return (Criteria) this;
        }

        public Criteria andTakeNumBetween(Integer value1, Integer value2) {
            addCriterion("takeNum between", value1, value2, "takeNum");
            return (Criteria) this;
        }

        public Criteria andTakeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("takeNum not between", value1, value2, "takeNum");
            return (Criteria) this;
        }

        public Criteria andTakeGoldWeightIsNull() {
            addCriterion("takeGoldWeight is null");
            return (Criteria) this;
        }

        public Criteria andTakeGoldWeightIsNotNull() {
            addCriterion("takeGoldWeight is not null");
            return (Criteria) this;
        }

        public Criteria andTakeGoldWeightEqualTo(Double value) {
            addCriterion("takeGoldWeight =", value, "takeGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTakeGoldWeightNotEqualTo(Double value) {
            addCriterion("takeGoldWeight <>", value, "takeGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTakeGoldWeightGreaterThan(Double value) {
            addCriterion("takeGoldWeight >", value, "takeGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTakeGoldWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("takeGoldWeight >=", value, "takeGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTakeGoldWeightLessThan(Double value) {
            addCriterion("takeGoldWeight <", value, "takeGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTakeGoldWeightLessThanOrEqualTo(Double value) {
            addCriterion("takeGoldWeight <=", value, "takeGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTakeGoldWeightIn(List<Double> values) {
            addCriterion("takeGoldWeight in", values, "takeGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTakeGoldWeightNotIn(List<Double> values) {
            addCriterion("takeGoldWeight not in", values, "takeGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTakeGoldWeightBetween(Double value1, Double value2) {
            addCriterion("takeGoldWeight between", value1, value2, "takeGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTakeGoldWeightNotBetween(Double value1, Double value2) {
            addCriterion("takeGoldWeight not between", value1, value2, "takeGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTakeJewelWeightIsNull() {
            addCriterion("takeJewelWeight is null");
            return (Criteria) this;
        }

        public Criteria andTakeJewelWeightIsNotNull() {
            addCriterion("takeJewelWeight is not null");
            return (Criteria) this;
        }

        public Criteria andTakeJewelWeightEqualTo(Double value) {
            addCriterion("takeJewelWeight =", value, "takeJewelWeight");
            return (Criteria) this;
        }

        public Criteria andTakeJewelWeightNotEqualTo(Double value) {
            addCriterion("takeJewelWeight <>", value, "takeJewelWeight");
            return (Criteria) this;
        }

        public Criteria andTakeJewelWeightGreaterThan(Double value) {
            addCriterion("takeJewelWeight >", value, "takeJewelWeight");
            return (Criteria) this;
        }

        public Criteria andTakeJewelWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("takeJewelWeight >=", value, "takeJewelWeight");
            return (Criteria) this;
        }

        public Criteria andTakeJewelWeightLessThan(Double value) {
            addCriterion("takeJewelWeight <", value, "takeJewelWeight");
            return (Criteria) this;
        }

        public Criteria andTakeJewelWeightLessThanOrEqualTo(Double value) {
            addCriterion("takeJewelWeight <=", value, "takeJewelWeight");
            return (Criteria) this;
        }

        public Criteria andTakeJewelWeightIn(List<Double> values) {
            addCriterion("takeJewelWeight in", values, "takeJewelWeight");
            return (Criteria) this;
        }

        public Criteria andTakeJewelWeightNotIn(List<Double> values) {
            addCriterion("takeJewelWeight not in", values, "takeJewelWeight");
            return (Criteria) this;
        }

        public Criteria andTakeJewelWeightBetween(Double value1, Double value2) {
            addCriterion("takeJewelWeight between", value1, value2, "takeJewelWeight");
            return (Criteria) this;
        }

        public Criteria andTakeJewelWeightNotBetween(Double value1, Double value2) {
            addCriterion("takeJewelWeight not between", value1, value2, "takeJewelWeight");
            return (Criteria) this;
        }

        public Criteria andTakeCostPriceIsNull() {
            addCriterion("takeCostPrice is null");
            return (Criteria) this;
        }

        public Criteria andTakeCostPriceIsNotNull() {
            addCriterion("takeCostPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTakeCostPriceEqualTo(Double value) {
            addCriterion("takeCostPrice =", value, "takeCostPrice");
            return (Criteria) this;
        }

        public Criteria andTakeCostPriceNotEqualTo(Double value) {
            addCriterion("takeCostPrice <>", value, "takeCostPrice");
            return (Criteria) this;
        }

        public Criteria andTakeCostPriceGreaterThan(Double value) {
            addCriterion("takeCostPrice >", value, "takeCostPrice");
            return (Criteria) this;
        }

        public Criteria andTakeCostPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("takeCostPrice >=", value, "takeCostPrice");
            return (Criteria) this;
        }

        public Criteria andTakeCostPriceLessThan(Double value) {
            addCriterion("takeCostPrice <", value, "takeCostPrice");
            return (Criteria) this;
        }

        public Criteria andTakeCostPriceLessThanOrEqualTo(Double value) {
            addCriterion("takeCostPrice <=", value, "takeCostPrice");
            return (Criteria) this;
        }

        public Criteria andTakeCostPriceIn(List<Double> values) {
            addCriterion("takeCostPrice in", values, "takeCostPrice");
            return (Criteria) this;
        }

        public Criteria andTakeCostPriceNotIn(List<Double> values) {
            addCriterion("takeCostPrice not in", values, "takeCostPrice");
            return (Criteria) this;
        }

        public Criteria andTakeCostPriceBetween(Double value1, Double value2) {
            addCriterion("takeCostPrice between", value1, value2, "takeCostPrice");
            return (Criteria) this;
        }

        public Criteria andTakeCostPriceNotBetween(Double value1, Double value2) {
            addCriterion("takeCostPrice not between", value1, value2, "takeCostPrice");
            return (Criteria) this;
        }

        public Criteria andTakeLabelPriceSumIsNull() {
            addCriterion("takeLabelPriceSum is null");
            return (Criteria) this;
        }

        public Criteria andTakeLabelPriceSumIsNotNull() {
            addCriterion("takeLabelPriceSum is not null");
            return (Criteria) this;
        }

        public Criteria andTakeLabelPriceSumEqualTo(Double value) {
            addCriterion("takeLabelPriceSum =", value, "takeLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andTakeLabelPriceSumNotEqualTo(Double value) {
            addCriterion("takeLabelPriceSum <>", value, "takeLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andTakeLabelPriceSumGreaterThan(Double value) {
            addCriterion("takeLabelPriceSum >", value, "takeLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andTakeLabelPriceSumGreaterThanOrEqualTo(Double value) {
            addCriterion("takeLabelPriceSum >=", value, "takeLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andTakeLabelPriceSumLessThan(Double value) {
            addCriterion("takeLabelPriceSum <", value, "takeLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andTakeLabelPriceSumLessThanOrEqualTo(Double value) {
            addCriterion("takeLabelPriceSum <=", value, "takeLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andTakeLabelPriceSumIn(List<Double> values) {
            addCriterion("takeLabelPriceSum in", values, "takeLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andTakeLabelPriceSumNotIn(List<Double> values) {
            addCriterion("takeLabelPriceSum not in", values, "takeLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andTakeLabelPriceSumBetween(Double value1, Double value2) {
            addCriterion("takeLabelPriceSum between", value1, value2, "takeLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andTakeLabelPriceSumNotBetween(Double value1, Double value2) {
            addCriterion("takeLabelPriceSum not between", value1, value2, "takeLabelPriceSum");
            return (Criteria) this;
        }

        public Criteria andDhFlagIsNull() {
            addCriterion("dhFlag is null");
            return (Criteria) this;
        }

        public Criteria andDhFlagIsNotNull() {
            addCriterion("dhFlag is not null");
            return (Criteria) this;
        }

        public Criteria andDhFlagEqualTo(Boolean value) {
            addCriterion("dhFlag =", value, "dhFlag");
            return (Criteria) this;
        }

        public Criteria andDhFlagNotEqualTo(Boolean value) {
            addCriterion("dhFlag <>", value, "dhFlag");
            return (Criteria) this;
        }

        public Criteria andDhFlagGreaterThan(Boolean value) {
            addCriterion("dhFlag >", value, "dhFlag");
            return (Criteria) this;
        }

        public Criteria andDhFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("dhFlag >=", value, "dhFlag");
            return (Criteria) this;
        }

        public Criteria andDhFlagLessThan(Boolean value) {
            addCriterion("dhFlag <", value, "dhFlag");
            return (Criteria) this;
        }

        public Criteria andDhFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("dhFlag <=", value, "dhFlag");
            return (Criteria) this;
        }

        public Criteria andDhFlagIn(List<Boolean> values) {
            addCriterion("dhFlag in", values, "dhFlag");
            return (Criteria) this;
        }

        public Criteria andDhFlagNotIn(List<Boolean> values) {
            addCriterion("dhFlag not in", values, "dhFlag");
            return (Criteria) this;
        }

        public Criteria andDhFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("dhFlag between", value1, value2, "dhFlag");
            return (Criteria) this;
        }

        public Criteria andDhFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("dhFlag not between", value1, value2, "dhFlag");
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

        public Criteria andStockIdIsNull() {
            addCriterion("stockId is null");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNotNull() {
            addCriterion("stockId is not null");
            return (Criteria) this;
        }

        public Criteria andStockIdEqualTo(Integer value) {
            addCriterion("stockId =", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotEqualTo(Integer value) {
            addCriterion("stockId <>", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThan(Integer value) {
            addCriterion("stockId >", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockId >=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThan(Integer value) {
            addCriterion("stockId <", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThanOrEqualTo(Integer value) {
            addCriterion("stockId <=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdIn(List<Integer> values) {
            addCriterion("stockId in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotIn(List<Integer> values) {
            addCriterion("stockId not in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdBetween(Integer value1, Integer value2) {
            addCriterion("stockId between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stockId not between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIsNull() {
            addCriterion("recordType is null");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIsNotNull() {
            addCriterion("recordType is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTypeEqualTo(Integer value) {
            addCriterion("recordType =", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotEqualTo(Integer value) {
            addCriterion("recordType <>", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeGreaterThan(Integer value) {
            addCriterion("recordType >", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("recordType >=", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLessThan(Integer value) {
            addCriterion("recordType <", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLessThanOrEqualTo(Integer value) {
            addCriterion("recordType <=", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIn(List<Integer> values) {
            addCriterion("recordType in", values, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotIn(List<Integer> values) {
            addCriterion("recordType not in", values, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeBetween(Integer value1, Integer value2) {
            addCriterion("recordType between", value1, value2, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("recordType not between", value1, value2, "recordType");
            return (Criteria) this;
        }

        public Criteria andSysGoodsIsNull() {
            addCriterion("sysGoods is null");
            return (Criteria) this;
        }

        public Criteria andSysGoodsIsNotNull() {
            addCriterion("sysGoods is not null");
            return (Criteria) this;
        }

        public Criteria andSysGoodsEqualTo(Boolean value) {
            addCriterion("sysGoods =", value, "sysGoods");
            return (Criteria) this;
        }

        public Criteria andSysGoodsNotEqualTo(Boolean value) {
            addCriterion("sysGoods <>", value, "sysGoods");
            return (Criteria) this;
        }

        public Criteria andSysGoodsGreaterThan(Boolean value) {
            addCriterion("sysGoods >", value, "sysGoods");
            return (Criteria) this;
        }

        public Criteria andSysGoodsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sysGoods >=", value, "sysGoods");
            return (Criteria) this;
        }

        public Criteria andSysGoodsLessThan(Boolean value) {
            addCriterion("sysGoods <", value, "sysGoods");
            return (Criteria) this;
        }

        public Criteria andSysGoodsLessThanOrEqualTo(Boolean value) {
            addCriterion("sysGoods <=", value, "sysGoods");
            return (Criteria) this;
        }

        public Criteria andSysGoodsIn(List<Boolean> values) {
            addCriterion("sysGoods in", values, "sysGoods");
            return (Criteria) this;
        }

        public Criteria andSysGoodsNotIn(List<Boolean> values) {
            addCriterion("sysGoods not in", values, "sysGoods");
            return (Criteria) this;
        }

        public Criteria andSysGoodsBetween(Boolean value1, Boolean value2) {
            addCriterion("sysGoods between", value1, value2, "sysGoods");
            return (Criteria) this;
        }

        public Criteria andSysGoodsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sysGoods not between", value1, value2, "sysGoods");
            return (Criteria) this;
        }
    }

    /**
     * bill_stocktake_sub_item
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * bill_stocktake_sub_item null
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