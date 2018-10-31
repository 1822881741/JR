package com.jr.erp.bill.purchase.entity;

import com.jr.erp.base.mybatis.BaseExample;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillPurchaseItemExample extends BaseExample {
    /**
     * bill_purchase_item
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public BillPurchaseItemExample() {
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
     * bill_purchase_item null
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

        public Criteria andOldSheetNoIsNull() {
            addCriterion("oldSheetNo is null");
            return (Criteria) this;
        }

        public Criteria andOldSheetNoIsNotNull() {
            addCriterion("oldSheetNo is not null");
            return (Criteria) this;
        }

        public Criteria andOldSheetNoEqualTo(String value) {
            addCriterion("oldSheetNo =", value, "oldSheetNo");
            return (Criteria) this;
        }

        public Criteria andOldSheetNoNotEqualTo(String value) {
            addCriterion("oldSheetNo <>", value, "oldSheetNo");
            return (Criteria) this;
        }

        public Criteria andOldSheetNoGreaterThan(String value) {
            addCriterion("oldSheetNo >", value, "oldSheetNo");
            return (Criteria) this;
        }

        public Criteria andOldSheetNoGreaterThanOrEqualTo(String value) {
            addCriterion("oldSheetNo >=", value, "oldSheetNo");
            return (Criteria) this;
        }

        public Criteria andOldSheetNoLessThan(String value) {
            addCriterion("oldSheetNo <", value, "oldSheetNo");
            return (Criteria) this;
        }

        public Criteria andOldSheetNoLessThanOrEqualTo(String value) {
            addCriterion("oldSheetNo <=", value, "oldSheetNo");
            return (Criteria) this;
        }

        public Criteria andOldSheetNoLike(String value) {
            addCriterion("oldSheetNo like", value, "oldSheetNo");
            return (Criteria) this;
        }

        public Criteria andOldSheetNoNotLike(String value) {
            addCriterion("oldSheetNo not like", value, "oldSheetNo");
            return (Criteria) this;
        }

        public Criteria andOldSheetNoIn(List<String> values) {
            addCriterion("oldSheetNo in", values, "oldSheetNo");
            return (Criteria) this;
        }

        public Criteria andOldSheetNoNotIn(List<String> values) {
            addCriterion("oldSheetNo not in", values, "oldSheetNo");
            return (Criteria) this;
        }

        public Criteria andOldSheetNoBetween(String value1, String value2) {
            addCriterion("oldSheetNo between", value1, value2, "oldSheetNo");
            return (Criteria) this;
        }

        public Criteria andOldSheetNoNotBetween(String value1, String value2) {
            addCriterion("oldSheetNo not between", value1, value2, "oldSheetNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoIsNull() {
            addCriterion("supplierNo is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNoIsNotNull() {
            addCriterion("supplierNo is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNoEqualTo(String value) {
            addCriterion("supplierNo =", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoNotEqualTo(String value) {
            addCriterion("supplierNo <>", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoGreaterThan(String value) {
            addCriterion("supplierNo >", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoGreaterThanOrEqualTo(String value) {
            addCriterion("supplierNo >=", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoLessThan(String value) {
            addCriterion("supplierNo <", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoLessThanOrEqualTo(String value) {
            addCriterion("supplierNo <=", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoLike(String value) {
            addCriterion("supplierNo like", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoNotLike(String value) {
            addCriterion("supplierNo not like", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoIn(List<String> values) {
            addCriterion("supplierNo in", values, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoNotIn(List<String> values) {
            addCriterion("supplierNo not in", values, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoBetween(String value1, String value2) {
            addCriterion("supplierNo between", value1, value2, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoNotBetween(String value1, String value2) {
            addCriterion("supplierNo not between", value1, value2, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplierName is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplierName is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplierName =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplierName <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplierName >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplierName >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplierName <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplierName <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplierName like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplierName not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplierName in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplierName not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplierName between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplierName not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customerName is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customerName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customerName =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customerName <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customerName >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customerName >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customerName <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customerName <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customerName like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customerName not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customerName in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customerName not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customerName between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customerName not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customerPhone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customerPhone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("customerPhone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("customerPhone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("customerPhone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customerPhone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("customerPhone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customerPhone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("customerPhone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("customerPhone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("customerPhone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("customerPhone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("customerPhone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("customerPhone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNull() {
            addCriterion("barCode is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("barCode is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("barCode =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("barCode <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("barCode >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("barCode >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("barCode <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("barCode <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("barCode like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("barCode not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("barCode in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("barCode not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("barCode between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("barCode not between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andOldBarCodeIsNull() {
            addCriterion("oldBarCode is null");
            return (Criteria) this;
        }

        public Criteria andOldBarCodeIsNotNull() {
            addCriterion("oldBarCode is not null");
            return (Criteria) this;
        }

        public Criteria andOldBarCodeEqualTo(String value) {
            addCriterion("oldBarCode =", value, "oldBarCode");
            return (Criteria) this;
        }

        public Criteria andOldBarCodeNotEqualTo(String value) {
            addCriterion("oldBarCode <>", value, "oldBarCode");
            return (Criteria) this;
        }

        public Criteria andOldBarCodeGreaterThan(String value) {
            addCriterion("oldBarCode >", value, "oldBarCode");
            return (Criteria) this;
        }

        public Criteria andOldBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("oldBarCode >=", value, "oldBarCode");
            return (Criteria) this;
        }

        public Criteria andOldBarCodeLessThan(String value) {
            addCriterion("oldBarCode <", value, "oldBarCode");
            return (Criteria) this;
        }

        public Criteria andOldBarCodeLessThanOrEqualTo(String value) {
            addCriterion("oldBarCode <=", value, "oldBarCode");
            return (Criteria) this;
        }

        public Criteria andOldBarCodeLike(String value) {
            addCriterion("oldBarCode like", value, "oldBarCode");
            return (Criteria) this;
        }

        public Criteria andOldBarCodeNotLike(String value) {
            addCriterion("oldBarCode not like", value, "oldBarCode");
            return (Criteria) this;
        }

        public Criteria andOldBarCodeIn(List<String> values) {
            addCriterion("oldBarCode in", values, "oldBarCode");
            return (Criteria) this;
        }

        public Criteria andOldBarCodeNotIn(List<String> values) {
            addCriterion("oldBarCode not in", values, "oldBarCode");
            return (Criteria) this;
        }

        public Criteria andOldBarCodeBetween(String value1, String value2) {
            addCriterion("oldBarCode between", value1, value2, "oldBarCode");
            return (Criteria) this;
        }

        public Criteria andOldBarCodeNotBetween(String value1, String value2) {
            addCriterion("oldBarCode not between", value1, value2, "oldBarCode");
            return (Criteria) this;
        }

        public Criteria andSubGoodsNameIsNull() {
            addCriterion("subGoodsName is null");
            return (Criteria) this;
        }

        public Criteria andSubGoodsNameIsNotNull() {
            addCriterion("subGoodsName is not null");
            return (Criteria) this;
        }

        public Criteria andSubGoodsNameEqualTo(String value) {
            addCriterion("subGoodsName =", value, "subGoodsName");
            return (Criteria) this;
        }

        public Criteria andSubGoodsNameNotEqualTo(String value) {
            addCriterion("subGoodsName <>", value, "subGoodsName");
            return (Criteria) this;
        }

        public Criteria andSubGoodsNameGreaterThan(String value) {
            addCriterion("subGoodsName >", value, "subGoodsName");
            return (Criteria) this;
        }

        public Criteria andSubGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("subGoodsName >=", value, "subGoodsName");
            return (Criteria) this;
        }

        public Criteria andSubGoodsNameLessThan(String value) {
            addCriterion("subGoodsName <", value, "subGoodsName");
            return (Criteria) this;
        }

        public Criteria andSubGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("subGoodsName <=", value, "subGoodsName");
            return (Criteria) this;
        }

        public Criteria andSubGoodsNameLike(String value) {
            addCriterion("subGoodsName like", value, "subGoodsName");
            return (Criteria) this;
        }

        public Criteria andSubGoodsNameNotLike(String value) {
            addCriterion("subGoodsName not like", value, "subGoodsName");
            return (Criteria) this;
        }

        public Criteria andSubGoodsNameIn(List<String> values) {
            addCriterion("subGoodsName in", values, "subGoodsName");
            return (Criteria) this;
        }

        public Criteria andSubGoodsNameNotIn(List<String> values) {
            addCriterion("subGoodsName not in", values, "subGoodsName");
            return (Criteria) this;
        }

        public Criteria andSubGoodsNameBetween(String value1, String value2) {
            addCriterion("subGoodsName between", value1, value2, "subGoodsName");
            return (Criteria) this;
        }

        public Criteria andSubGoodsNameNotBetween(String value1, String value2) {
            addCriterion("subGoodsName not between", value1, value2, "subGoodsName");
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

        public Criteria andStyleNoIsNull() {
            addCriterion("styleNo is null");
            return (Criteria) this;
        }

        public Criteria andStyleNoIsNotNull() {
            addCriterion("styleNo is not null");
            return (Criteria) this;
        }

        public Criteria andStyleNoEqualTo(String value) {
            addCriterion("styleNo =", value, "styleNo");
            return (Criteria) this;
        }

        public Criteria andStyleNoNotEqualTo(String value) {
            addCriterion("styleNo <>", value, "styleNo");
            return (Criteria) this;
        }

        public Criteria andStyleNoGreaterThan(String value) {
            addCriterion("styleNo >", value, "styleNo");
            return (Criteria) this;
        }

        public Criteria andStyleNoGreaterThanOrEqualTo(String value) {
            addCriterion("styleNo >=", value, "styleNo");
            return (Criteria) this;
        }

        public Criteria andStyleNoLessThan(String value) {
            addCriterion("styleNo <", value, "styleNo");
            return (Criteria) this;
        }

        public Criteria andStyleNoLessThanOrEqualTo(String value) {
            addCriterion("styleNo <=", value, "styleNo");
            return (Criteria) this;
        }

        public Criteria andStyleNoLike(String value) {
            addCriterion("styleNo like", value, "styleNo");
            return (Criteria) this;
        }

        public Criteria andStyleNoNotLike(String value) {
            addCriterion("styleNo not like", value, "styleNo");
            return (Criteria) this;
        }

        public Criteria andStyleNoIn(List<String> values) {
            addCriterion("styleNo in", values, "styleNo");
            return (Criteria) this;
        }

        public Criteria andStyleNoNotIn(List<String> values) {
            addCriterion("styleNo not in", values, "styleNo");
            return (Criteria) this;
        }

        public Criteria andStyleNoBetween(String value1, String value2) {
            addCriterion("styleNo between", value1, value2, "styleNo");
            return (Criteria) this;
        }

        public Criteria andStyleNoNotBetween(String value1, String value2) {
            addCriterion("styleNo not between", value1, value2, "styleNo");
            return (Criteria) this;
        }

        public Criteria andShortCutIsNull() {
            addCriterion("shortCut is null");
            return (Criteria) this;
        }

        public Criteria andShortCutIsNotNull() {
            addCriterion("shortCut is not null");
            return (Criteria) this;
        }

        public Criteria andShortCutEqualTo(String value) {
            addCriterion("shortCut =", value, "shortCut");
            return (Criteria) this;
        }

        public Criteria andShortCutNotEqualTo(String value) {
            addCriterion("shortCut <>", value, "shortCut");
            return (Criteria) this;
        }

        public Criteria andShortCutGreaterThan(String value) {
            addCriterion("shortCut >", value, "shortCut");
            return (Criteria) this;
        }

        public Criteria andShortCutGreaterThanOrEqualTo(String value) {
            addCriterion("shortCut >=", value, "shortCut");
            return (Criteria) this;
        }

        public Criteria andShortCutLessThan(String value) {
            addCriterion("shortCut <", value, "shortCut");
            return (Criteria) this;
        }

        public Criteria andShortCutLessThanOrEqualTo(String value) {
            addCriterion("shortCut <=", value, "shortCut");
            return (Criteria) this;
        }

        public Criteria andShortCutLike(String value) {
            addCriterion("shortCut like", value, "shortCut");
            return (Criteria) this;
        }

        public Criteria andShortCutNotLike(String value) {
            addCriterion("shortCut not like", value, "shortCut");
            return (Criteria) this;
        }

        public Criteria andShortCutIn(List<String> values) {
            addCriterion("shortCut in", values, "shortCut");
            return (Criteria) this;
        }

        public Criteria andShortCutNotIn(List<String> values) {
            addCriterion("shortCut not in", values, "shortCut");
            return (Criteria) this;
        }

        public Criteria andShortCutBetween(String value1, String value2) {
            addCriterion("shortCut between", value1, value2, "shortCut");
            return (Criteria) this;
        }

        public Criteria andShortCutNotBetween(String value1, String value2) {
            addCriterion("shortCut not between", value1, value2, "shortCut");
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

        public Criteria andMeasurementModeIsNull() {
            addCriterion("measurementMode is null");
            return (Criteria) this;
        }

        public Criteria andMeasurementModeIsNotNull() {
            addCriterion("measurementMode is not null");
            return (Criteria) this;
        }

        public Criteria andMeasurementModeEqualTo(String value) {
            addCriterion("measurementMode =", value, "measurementMode");
            return (Criteria) this;
        }

        public Criteria andMeasurementModeNotEqualTo(String value) {
            addCriterion("measurementMode <>", value, "measurementMode");
            return (Criteria) this;
        }

        public Criteria andMeasurementModeGreaterThan(String value) {
            addCriterion("measurementMode >", value, "measurementMode");
            return (Criteria) this;
        }

        public Criteria andMeasurementModeGreaterThanOrEqualTo(String value) {
            addCriterion("measurementMode >=", value, "measurementMode");
            return (Criteria) this;
        }

        public Criteria andMeasurementModeLessThan(String value) {
            addCriterion("measurementMode <", value, "measurementMode");
            return (Criteria) this;
        }

        public Criteria andMeasurementModeLessThanOrEqualTo(String value) {
            addCriterion("measurementMode <=", value, "measurementMode");
            return (Criteria) this;
        }

        public Criteria andMeasurementModeLike(String value) {
            addCriterion("measurementMode like", value, "measurementMode");
            return (Criteria) this;
        }

        public Criteria andMeasurementModeNotLike(String value) {
            addCriterion("measurementMode not like", value, "measurementMode");
            return (Criteria) this;
        }

        public Criteria andMeasurementModeIn(List<String> values) {
            addCriterion("measurementMode in", values, "measurementMode");
            return (Criteria) this;
        }

        public Criteria andMeasurementModeNotIn(List<String> values) {
            addCriterion("measurementMode not in", values, "measurementMode");
            return (Criteria) this;
        }

        public Criteria andMeasurementModeBetween(String value1, String value2) {
            addCriterion("measurementMode between", value1, value2, "measurementMode");
            return (Criteria) this;
        }

        public Criteria andMeasurementModeNotBetween(String value1, String value2) {
            addCriterion("measurementMode not between", value1, value2, "measurementMode");
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

        public Criteria andOperUserIdIsNull() {
            addCriterion("operUserId is null");
            return (Criteria) this;
        }

        public Criteria andOperUserIdIsNotNull() {
            addCriterion("operUserId is not null");
            return (Criteria) this;
        }

        public Criteria andOperUserIdEqualTo(Integer value) {
            addCriterion("operUserId =", value, "operUserId");
            return (Criteria) this;
        }

        public Criteria andOperUserIdNotEqualTo(Integer value) {
            addCriterion("operUserId <>", value, "operUserId");
            return (Criteria) this;
        }

        public Criteria andOperUserIdGreaterThan(Integer value) {
            addCriterion("operUserId >", value, "operUserId");
            return (Criteria) this;
        }

        public Criteria andOperUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operUserId >=", value, "operUserId");
            return (Criteria) this;
        }

        public Criteria andOperUserIdLessThan(Integer value) {
            addCriterion("operUserId <", value, "operUserId");
            return (Criteria) this;
        }

        public Criteria andOperUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("operUserId <=", value, "operUserId");
            return (Criteria) this;
        }

        public Criteria andOperUserIdIn(List<Integer> values) {
            addCriterion("operUserId in", values, "operUserId");
            return (Criteria) this;
        }

        public Criteria andOperUserIdNotIn(List<Integer> values) {
            addCriterion("operUserId not in", values, "operUserId");
            return (Criteria) this;
        }

        public Criteria andOperUserIdBetween(Integer value1, Integer value2) {
            addCriterion("operUserId between", value1, value2, "operUserId");
            return (Criteria) this;
        }

        public Criteria andOperUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operUserId not between", value1, value2, "operUserId");
            return (Criteria) this;
        }

        public Criteria andOperUserNameIsNull() {
            addCriterion("operUserName is null");
            return (Criteria) this;
        }

        public Criteria andOperUserNameIsNotNull() {
            addCriterion("operUserName is not null");
            return (Criteria) this;
        }

        public Criteria andOperUserNameEqualTo(String value) {
            addCriterion("operUserName =", value, "operUserName");
            return (Criteria) this;
        }

        public Criteria andOperUserNameNotEqualTo(String value) {
            addCriterion("operUserName <>", value, "operUserName");
            return (Criteria) this;
        }

        public Criteria andOperUserNameGreaterThan(String value) {
            addCriterion("operUserName >", value, "operUserName");
            return (Criteria) this;
        }

        public Criteria andOperUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("operUserName >=", value, "operUserName");
            return (Criteria) this;
        }

        public Criteria andOperUserNameLessThan(String value) {
            addCriterion("operUserName <", value, "operUserName");
            return (Criteria) this;
        }

        public Criteria andOperUserNameLessThanOrEqualTo(String value) {
            addCriterion("operUserName <=", value, "operUserName");
            return (Criteria) this;
        }

        public Criteria andOperUserNameLike(String value) {
            addCriterion("operUserName like", value, "operUserName");
            return (Criteria) this;
        }

        public Criteria andOperUserNameNotLike(String value) {
            addCriterion("operUserName not like", value, "operUserName");
            return (Criteria) this;
        }

        public Criteria andOperUserNameIn(List<String> values) {
            addCriterion("operUserName in", values, "operUserName");
            return (Criteria) this;
        }

        public Criteria andOperUserNameNotIn(List<String> values) {
            addCriterion("operUserName not in", values, "operUserName");
            return (Criteria) this;
        }

        public Criteria andOperUserNameBetween(String value1, String value2) {
            addCriterion("operUserName between", value1, value2, "operUserName");
            return (Criteria) this;
        }

        public Criteria andOperUserNameNotBetween(String value1, String value2) {
            addCriterion("operUserName not between", value1, value2, "operUserName");
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

        public Criteria andDeptAreaCodeIsNull() {
            addCriterion("deptAreaCode is null");
            return (Criteria) this;
        }

        public Criteria andDeptAreaCodeIsNotNull() {
            addCriterion("deptAreaCode is not null");
            return (Criteria) this;
        }

        public Criteria andDeptAreaCodeEqualTo(String value) {
            addCriterion("deptAreaCode =", value, "deptAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeptAreaCodeNotEqualTo(String value) {
            addCriterion("deptAreaCode <>", value, "deptAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeptAreaCodeGreaterThan(String value) {
            addCriterion("deptAreaCode >", value, "deptAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeptAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("deptAreaCode >=", value, "deptAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeptAreaCodeLessThan(String value) {
            addCriterion("deptAreaCode <", value, "deptAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeptAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("deptAreaCode <=", value, "deptAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeptAreaCodeLike(String value) {
            addCriterion("deptAreaCode like", value, "deptAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeptAreaCodeNotLike(String value) {
            addCriterion("deptAreaCode not like", value, "deptAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeptAreaCodeIn(List<String> values) {
            addCriterion("deptAreaCode in", values, "deptAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeptAreaCodeNotIn(List<String> values) {
            addCriterion("deptAreaCode not in", values, "deptAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeptAreaCodeBetween(String value1, String value2) {
            addCriterion("deptAreaCode between", value1, value2, "deptAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeptAreaCodeNotBetween(String value1, String value2) {
            addCriterion("deptAreaCode not between", value1, value2, "deptAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNameIsNull() {
            addCriterion("deptAreaName is null");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNameIsNotNull() {
            addCriterion("deptAreaName is not null");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNameEqualTo(String value) {
            addCriterion("deptAreaName =", value, "deptAreaName");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNameNotEqualTo(String value) {
            addCriterion("deptAreaName <>", value, "deptAreaName");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNameGreaterThan(String value) {
            addCriterion("deptAreaName >", value, "deptAreaName");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("deptAreaName >=", value, "deptAreaName");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNameLessThan(String value) {
            addCriterion("deptAreaName <", value, "deptAreaName");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNameLessThanOrEqualTo(String value) {
            addCriterion("deptAreaName <=", value, "deptAreaName");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNameLike(String value) {
            addCriterion("deptAreaName like", value, "deptAreaName");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNameNotLike(String value) {
            addCriterion("deptAreaName not like", value, "deptAreaName");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNameIn(List<String> values) {
            addCriterion("deptAreaName in", values, "deptAreaName");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNameNotIn(List<String> values) {
            addCriterion("deptAreaName not in", values, "deptAreaName");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNameBetween(String value1, String value2) {
            addCriterion("deptAreaName between", value1, value2, "deptAreaName");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNameNotBetween(String value1, String value2) {
            addCriterion("deptAreaName not between", value1, value2, "deptAreaName");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("storeId is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("storeId is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("storeId =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("storeId <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("storeId >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeId >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("storeId <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("storeId <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("storeId in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("storeId not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("storeId between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("storeId not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("storeName is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("storeName is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("storeName =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("storeName <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("storeName >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("storeName >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("storeName <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("storeName <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("storeName like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("storeName not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("storeName in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("storeName not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("storeName between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("storeName not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andPurchaseSaleModeIsNull() {
            addCriterion("purchaseSaleMode is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseSaleModeIsNotNull() {
            addCriterion("purchaseSaleMode is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseSaleModeEqualTo(String value) {
            addCriterion("purchaseSaleMode =", value, "purchaseSaleMode");
            return (Criteria) this;
        }

        public Criteria andPurchaseSaleModeNotEqualTo(String value) {
            addCriterion("purchaseSaleMode <>", value, "purchaseSaleMode");
            return (Criteria) this;
        }

        public Criteria andPurchaseSaleModeGreaterThan(String value) {
            addCriterion("purchaseSaleMode >", value, "purchaseSaleMode");
            return (Criteria) this;
        }

        public Criteria andPurchaseSaleModeGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseSaleMode >=", value, "purchaseSaleMode");
            return (Criteria) this;
        }

        public Criteria andPurchaseSaleModeLessThan(String value) {
            addCriterion("purchaseSaleMode <", value, "purchaseSaleMode");
            return (Criteria) this;
        }

        public Criteria andPurchaseSaleModeLessThanOrEqualTo(String value) {
            addCriterion("purchaseSaleMode <=", value, "purchaseSaleMode");
            return (Criteria) this;
        }

        public Criteria andPurchaseSaleModeLike(String value) {
            addCriterion("purchaseSaleMode like", value, "purchaseSaleMode");
            return (Criteria) this;
        }

        public Criteria andPurchaseSaleModeNotLike(String value) {
            addCriterion("purchaseSaleMode not like", value, "purchaseSaleMode");
            return (Criteria) this;
        }

        public Criteria andPurchaseSaleModeIn(List<String> values) {
            addCriterion("purchaseSaleMode in", values, "purchaseSaleMode");
            return (Criteria) this;
        }

        public Criteria andPurchaseSaleModeNotIn(List<String> values) {
            addCriterion("purchaseSaleMode not in", values, "purchaseSaleMode");
            return (Criteria) this;
        }

        public Criteria andPurchaseSaleModeBetween(String value1, String value2) {
            addCriterion("purchaseSaleMode between", value1, value2, "purchaseSaleMode");
            return (Criteria) this;
        }

        public Criteria andPurchaseSaleModeNotBetween(String value1, String value2) {
            addCriterion("purchaseSaleMode not between", value1, value2, "purchaseSaleMode");
            return (Criteria) this;
        }

        public Criteria andSheetTypeIsNull() {
            addCriterion("sheetType is null");
            return (Criteria) this;
        }

        public Criteria andSheetTypeIsNotNull() {
            addCriterion("sheetType is not null");
            return (Criteria) this;
        }

        public Criteria andSheetTypeEqualTo(Integer value) {
            addCriterion("sheetType =", value, "sheetType");
            return (Criteria) this;
        }

        public Criteria andSheetTypeNotEqualTo(Integer value) {
            addCriterion("sheetType <>", value, "sheetType");
            return (Criteria) this;
        }

        public Criteria andSheetTypeGreaterThan(Integer value) {
            addCriterion("sheetType >", value, "sheetType");
            return (Criteria) this;
        }

        public Criteria andSheetTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sheetType >=", value, "sheetType");
            return (Criteria) this;
        }

        public Criteria andSheetTypeLessThan(Integer value) {
            addCriterion("sheetType <", value, "sheetType");
            return (Criteria) this;
        }

        public Criteria andSheetTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sheetType <=", value, "sheetType");
            return (Criteria) this;
        }

        public Criteria andSheetTypeIn(List<Integer> values) {
            addCriterion("sheetType in", values, "sheetType");
            return (Criteria) this;
        }

        public Criteria andSheetTypeNotIn(List<Integer> values) {
            addCriterion("sheetType not in", values, "sheetType");
            return (Criteria) this;
        }

        public Criteria andSheetTypeBetween(Integer value1, Integer value2) {
            addCriterion("sheetType between", value1, value2, "sheetType");
            return (Criteria) this;
        }

        public Criteria andSheetTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sheetType not between", value1, value2, "sheetType");
            return (Criteria) this;
        }

        public Criteria andSpecialOffersFlagIsNull() {
            addCriterion("specialOffersFlag is null");
            return (Criteria) this;
        }

        public Criteria andSpecialOffersFlagIsNotNull() {
            addCriterion("specialOffersFlag is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialOffersFlagEqualTo(String value) {
            addCriterion("specialOffersFlag =", value, "specialOffersFlag");
            return (Criteria) this;
        }

        public Criteria andSpecialOffersFlagNotEqualTo(String value) {
            addCriterion("specialOffersFlag <>", value, "specialOffersFlag");
            return (Criteria) this;
        }

        public Criteria andSpecialOffersFlagGreaterThan(String value) {
            addCriterion("specialOffersFlag >", value, "specialOffersFlag");
            return (Criteria) this;
        }

        public Criteria andSpecialOffersFlagGreaterThanOrEqualTo(String value) {
            addCriterion("specialOffersFlag >=", value, "specialOffersFlag");
            return (Criteria) this;
        }

        public Criteria andSpecialOffersFlagLessThan(String value) {
            addCriterion("specialOffersFlag <", value, "specialOffersFlag");
            return (Criteria) this;
        }

        public Criteria andSpecialOffersFlagLessThanOrEqualTo(String value) {
            addCriterion("specialOffersFlag <=", value, "specialOffersFlag");
            return (Criteria) this;
        }

        public Criteria andSpecialOffersFlagLike(String value) {
            addCriterion("specialOffersFlag like", value, "specialOffersFlag");
            return (Criteria) this;
        }

        public Criteria andSpecialOffersFlagNotLike(String value) {
            addCriterion("specialOffersFlag not like", value, "specialOffersFlag");
            return (Criteria) this;
        }

        public Criteria andSpecialOffersFlagIn(List<String> values) {
            addCriterion("specialOffersFlag in", values, "specialOffersFlag");
            return (Criteria) this;
        }

        public Criteria andSpecialOffersFlagNotIn(List<String> values) {
            addCriterion("specialOffersFlag not in", values, "specialOffersFlag");
            return (Criteria) this;
        }

        public Criteria andSpecialOffersFlagBetween(String value1, String value2) {
            addCriterion("specialOffersFlag between", value1, value2, "specialOffersFlag");
            return (Criteria) this;
        }

        public Criteria andSpecialOffersFlagNotBetween(String value1, String value2) {
            addCriterion("specialOffersFlag not between", value1, value2, "specialOffersFlag");
            return (Criteria) this;
        }

        public Criteria andSheetDateIsNull() {
            addCriterion("sheetDate is null");
            return (Criteria) this;
        }

        public Criteria andSheetDateIsNotNull() {
            addCriterion("sheetDate is not null");
            return (Criteria) this;
        }

        public Criteria andSheetDateEqualTo(Date value) {
            addCriterion("sheetDate =", value, "sheetDate");
            return (Criteria) this;
        }

        public Criteria andSheetDateNotEqualTo(Date value) {
            addCriterion("sheetDate <>", value, "sheetDate");
            return (Criteria) this;
        }

        public Criteria andSheetDateGreaterThan(Date value) {
            addCriterion("sheetDate >", value, "sheetDate");
            return (Criteria) this;
        }

        public Criteria andSheetDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sheetDate >=", value, "sheetDate");
            return (Criteria) this;
        }

        public Criteria andSheetDateLessThan(Date value) {
            addCriterion("sheetDate <", value, "sheetDate");
            return (Criteria) this;
        }

        public Criteria andSheetDateLessThanOrEqualTo(Date value) {
            addCriterion("sheetDate <=", value, "sheetDate");
            return (Criteria) this;
        }

        public Criteria andSheetDateIn(List<Date> values) {
            addCriterion("sheetDate in", values, "sheetDate");
            return (Criteria) this;
        }

        public Criteria andSheetDateNotIn(List<Date> values) {
            addCriterion("sheetDate not in", values, "sheetDate");
            return (Criteria) this;
        }

        public Criteria andSheetDateBetween(Date value1, Date value2) {
            addCriterion("sheetDate between", value1, value2, "sheetDate");
            return (Criteria) this;
        }

        public Criteria andSheetDateNotBetween(Date value1, Date value2) {
            addCriterion("sheetDate not between", value1, value2, "sheetDate");
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

        public Criteria andDaiXiaoFlagIsNull() {
            addCriterion("daiXiaoFlag is null");
            return (Criteria) this;
        }

        public Criteria andDaiXiaoFlagIsNotNull() {
            addCriterion("daiXiaoFlag is not null");
            return (Criteria) this;
        }

        public Criteria andDaiXiaoFlagEqualTo(Boolean value) {
            addCriterion("daiXiaoFlag =", value, "daiXiaoFlag");
            return (Criteria) this;
        }

        public Criteria andDaiXiaoFlagNotEqualTo(Boolean value) {
            addCriterion("daiXiaoFlag <>", value, "daiXiaoFlag");
            return (Criteria) this;
        }

        public Criteria andDaiXiaoFlagGreaterThan(Boolean value) {
            addCriterion("daiXiaoFlag >", value, "daiXiaoFlag");
            return (Criteria) this;
        }

        public Criteria andDaiXiaoFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("daiXiaoFlag >=", value, "daiXiaoFlag");
            return (Criteria) this;
        }

        public Criteria andDaiXiaoFlagLessThan(Boolean value) {
            addCriterion("daiXiaoFlag <", value, "daiXiaoFlag");
            return (Criteria) this;
        }

        public Criteria andDaiXiaoFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("daiXiaoFlag <=", value, "daiXiaoFlag");
            return (Criteria) this;
        }

        public Criteria andDaiXiaoFlagIn(List<Boolean> values) {
            addCriterion("daiXiaoFlag in", values, "daiXiaoFlag");
            return (Criteria) this;
        }

        public Criteria andDaiXiaoFlagNotIn(List<Boolean> values) {
            addCriterion("daiXiaoFlag not in", values, "daiXiaoFlag");
            return (Criteria) this;
        }

        public Criteria andDaiXiaoFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("daiXiaoFlag between", value1, value2, "daiXiaoFlag");
            return (Criteria) this;
        }

        public Criteria andDaiXiaoFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("daiXiaoFlag not between", value1, value2, "daiXiaoFlag");
            return (Criteria) this;
        }

        public Criteria andZaiTuFlagIsNull() {
            addCriterion("zaiTuFlag is null");
            return (Criteria) this;
        }

        public Criteria andZaiTuFlagIsNotNull() {
            addCriterion("zaiTuFlag is not null");
            return (Criteria) this;
        }

        public Criteria andZaiTuFlagEqualTo(Boolean value) {
            addCriterion("zaiTuFlag =", value, "zaiTuFlag");
            return (Criteria) this;
        }

        public Criteria andZaiTuFlagNotEqualTo(Boolean value) {
            addCriterion("zaiTuFlag <>", value, "zaiTuFlag");
            return (Criteria) this;
        }

        public Criteria andZaiTuFlagGreaterThan(Boolean value) {
            addCriterion("zaiTuFlag >", value, "zaiTuFlag");
            return (Criteria) this;
        }

        public Criteria andZaiTuFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("zaiTuFlag >=", value, "zaiTuFlag");
            return (Criteria) this;
        }

        public Criteria andZaiTuFlagLessThan(Boolean value) {
            addCriterion("zaiTuFlag <", value, "zaiTuFlag");
            return (Criteria) this;
        }

        public Criteria andZaiTuFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("zaiTuFlag <=", value, "zaiTuFlag");
            return (Criteria) this;
        }

        public Criteria andZaiTuFlagIn(List<Boolean> values) {
            addCriterion("zaiTuFlag in", values, "zaiTuFlag");
            return (Criteria) this;
        }

        public Criteria andZaiTuFlagNotIn(List<Boolean> values) {
            addCriterion("zaiTuFlag not in", values, "zaiTuFlag");
            return (Criteria) this;
        }

        public Criteria andZaiTuFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("zaiTuFlag between", value1, value2, "zaiTuFlag");
            return (Criteria) this;
        }

        public Criteria andZaiTuFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("zaiTuFlag not between", value1, value2, "zaiTuFlag");
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

        public Criteria andGoldLossIsNull() {
            addCriterion("goldLoss is null");
            return (Criteria) this;
        }

        public Criteria andGoldLossIsNotNull() {
            addCriterion("goldLoss is not null");
            return (Criteria) this;
        }

        public Criteria andGoldLossEqualTo(Integer value) {
            addCriterion("goldLoss =", value, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andGoldLossNotEqualTo(Integer value) {
            addCriterion("goldLoss <>", value, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andGoldLossGreaterThan(Integer value) {
            addCriterion("goldLoss >", value, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andGoldLossGreaterThanOrEqualTo(Integer value) {
            addCriterion("goldLoss >=", value, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andGoldLossLessThan(Integer value) {
            addCriterion("goldLoss <", value, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andGoldLossLessThanOrEqualTo(Integer value) {
            addCriterion("goldLoss <=", value, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andGoldLossIn(List<Integer> values) {
            addCriterion("goldLoss in", values, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andGoldLossNotIn(List<Integer> values) {
            addCriterion("goldLoss not in", values, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andGoldLossBetween(Integer value1, Integer value2) {
            addCriterion("goldLoss between", value1, value2, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andGoldLossNotBetween(Integer value1, Integer value2) {
            addCriterion("goldLoss not between", value1, value2, "goldLoss");
            return (Criteria) this;
        }

        public Criteria andMaoGoldWeightIsNull() {
            addCriterion("maoGoldWeight is null");
            return (Criteria) this;
        }

        public Criteria andMaoGoldWeightIsNotNull() {
            addCriterion("maoGoldWeight is not null");
            return (Criteria) this;
        }

        public Criteria andMaoGoldWeightEqualTo(Double value) {
            addCriterion("maoGoldWeight =", value, "maoGoldWeight");
            return (Criteria) this;
        }

        public Criteria andMaoGoldWeightNotEqualTo(Double value) {
            addCriterion("maoGoldWeight <>", value, "maoGoldWeight");
            return (Criteria) this;
        }

        public Criteria andMaoGoldWeightGreaterThan(Double value) {
            addCriterion("maoGoldWeight >", value, "maoGoldWeight");
            return (Criteria) this;
        }

        public Criteria andMaoGoldWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("maoGoldWeight >=", value, "maoGoldWeight");
            return (Criteria) this;
        }

        public Criteria andMaoGoldWeightLessThan(Double value) {
            addCriterion("maoGoldWeight <", value, "maoGoldWeight");
            return (Criteria) this;
        }

        public Criteria andMaoGoldWeightLessThanOrEqualTo(Double value) {
            addCriterion("maoGoldWeight <=", value, "maoGoldWeight");
            return (Criteria) this;
        }

        public Criteria andMaoGoldWeightIn(List<Double> values) {
            addCriterion("maoGoldWeight in", values, "maoGoldWeight");
            return (Criteria) this;
        }

        public Criteria andMaoGoldWeightNotIn(List<Double> values) {
            addCriterion("maoGoldWeight not in", values, "maoGoldWeight");
            return (Criteria) this;
        }

        public Criteria andMaoGoldWeightBetween(Double value1, Double value2) {
            addCriterion("maoGoldWeight between", value1, value2, "maoGoldWeight");
            return (Criteria) this;
        }

        public Criteria andMaoGoldWeightNotBetween(Double value1, Double value2) {
            addCriterion("maoGoldWeight not between", value1, value2, "maoGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTotalGoldWeightIsNull() {
            addCriterion("totalGoldWeight is null");
            return (Criteria) this;
        }

        public Criteria andTotalGoldWeightIsNotNull() {
            addCriterion("totalGoldWeight is not null");
            return (Criteria) this;
        }

        public Criteria andTotalGoldWeightEqualTo(Double value) {
            addCriterion("totalGoldWeight =", value, "totalGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTotalGoldWeightNotEqualTo(Double value) {
            addCriterion("totalGoldWeight <>", value, "totalGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTotalGoldWeightGreaterThan(Double value) {
            addCriterion("totalGoldWeight >", value, "totalGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTotalGoldWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("totalGoldWeight >=", value, "totalGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTotalGoldWeightLessThan(Double value) {
            addCriterion("totalGoldWeight <", value, "totalGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTotalGoldWeightLessThanOrEqualTo(Double value) {
            addCriterion("totalGoldWeight <=", value, "totalGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTotalGoldWeightIn(List<Double> values) {
            addCriterion("totalGoldWeight in", values, "totalGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTotalGoldWeightNotIn(List<Double> values) {
            addCriterion("totalGoldWeight not in", values, "totalGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTotalGoldWeightBetween(Double value1, Double value2) {
            addCriterion("totalGoldWeight between", value1, value2, "totalGoldWeight");
            return (Criteria) this;
        }

        public Criteria andTotalGoldWeightNotBetween(Double value1, Double value2) {
            addCriterion("totalGoldWeight not between", value1, value2, "totalGoldWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIsNull() {
            addCriterion("goodsWeight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIsNotNull() {
            addCriterion("goodsWeight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightEqualTo(Double value) {
            addCriterion("goodsWeight =", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotEqualTo(Double value) {
            addCriterion("goodsWeight <>", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThan(Double value) {
            addCriterion("goodsWeight >", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("goodsWeight >=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThan(Double value) {
            addCriterion("goodsWeight <", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThanOrEqualTo(Double value) {
            addCriterion("goodsWeight <=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIn(List<Double> values) {
            addCriterion("goodsWeight in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotIn(List<Double> values) {
            addCriterion("goodsWeight not in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightBetween(Double value1, Double value2) {
            addCriterion("goodsWeight between", value1, value2, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotBetween(Double value1, Double value2) {
            addCriterion("goodsWeight not between", value1, value2, "goodsWeight");
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

        public Criteria andWorksFee4KeIsNull() {
            addCriterion("worksFee4Ke is null");
            return (Criteria) this;
        }

        public Criteria andWorksFee4KeIsNotNull() {
            addCriterion("worksFee4Ke is not null");
            return (Criteria) this;
        }

        public Criteria andWorksFee4KeEqualTo(Double value) {
            addCriterion("worksFee4Ke =", value, "worksFee4Ke");
            return (Criteria) this;
        }

        public Criteria andWorksFee4KeNotEqualTo(Double value) {
            addCriterion("worksFee4Ke <>", value, "worksFee4Ke");
            return (Criteria) this;
        }

        public Criteria andWorksFee4KeGreaterThan(Double value) {
            addCriterion("worksFee4Ke >", value, "worksFee4Ke");
            return (Criteria) this;
        }

        public Criteria andWorksFee4KeGreaterThanOrEqualTo(Double value) {
            addCriterion("worksFee4Ke >=", value, "worksFee4Ke");
            return (Criteria) this;
        }

        public Criteria andWorksFee4KeLessThan(Double value) {
            addCriterion("worksFee4Ke <", value, "worksFee4Ke");
            return (Criteria) this;
        }

        public Criteria andWorksFee4KeLessThanOrEqualTo(Double value) {
            addCriterion("worksFee4Ke <=", value, "worksFee4Ke");
            return (Criteria) this;
        }

        public Criteria andWorksFee4KeIn(List<Double> values) {
            addCriterion("worksFee4Ke in", values, "worksFee4Ke");
            return (Criteria) this;
        }

        public Criteria andWorksFee4KeNotIn(List<Double> values) {
            addCriterion("worksFee4Ke not in", values, "worksFee4Ke");
            return (Criteria) this;
        }

        public Criteria andWorksFee4KeBetween(Double value1, Double value2) {
            addCriterion("worksFee4Ke between", value1, value2, "worksFee4Ke");
            return (Criteria) this;
        }

        public Criteria andWorksFee4KeNotBetween(Double value1, Double value2) {
            addCriterion("worksFee4Ke not between", value1, value2, "worksFee4Ke");
            return (Criteria) this;
        }

        public Criteria andWorksFee4JianIsNull() {
            addCriterion("worksFee4Jian is null");
            return (Criteria) this;
        }

        public Criteria andWorksFee4JianIsNotNull() {
            addCriterion("worksFee4Jian is not null");
            return (Criteria) this;
        }

        public Criteria andWorksFee4JianEqualTo(Double value) {
            addCriterion("worksFee4Jian =", value, "worksFee4Jian");
            return (Criteria) this;
        }

        public Criteria andWorksFee4JianNotEqualTo(Double value) {
            addCriterion("worksFee4Jian <>", value, "worksFee4Jian");
            return (Criteria) this;
        }

        public Criteria andWorksFee4JianGreaterThan(Double value) {
            addCriterion("worksFee4Jian >", value, "worksFee4Jian");
            return (Criteria) this;
        }

        public Criteria andWorksFee4JianGreaterThanOrEqualTo(Double value) {
            addCriterion("worksFee4Jian >=", value, "worksFee4Jian");
            return (Criteria) this;
        }

        public Criteria andWorksFee4JianLessThan(Double value) {
            addCriterion("worksFee4Jian <", value, "worksFee4Jian");
            return (Criteria) this;
        }

        public Criteria andWorksFee4JianLessThanOrEqualTo(Double value) {
            addCriterion("worksFee4Jian <=", value, "worksFee4Jian");
            return (Criteria) this;
        }

        public Criteria andWorksFee4JianIn(List<Double> values) {
            addCriterion("worksFee4Jian in", values, "worksFee4Jian");
            return (Criteria) this;
        }

        public Criteria andWorksFee4JianNotIn(List<Double> values) {
            addCriterion("worksFee4Jian not in", values, "worksFee4Jian");
            return (Criteria) this;
        }

        public Criteria andWorksFee4JianBetween(Double value1, Double value2) {
            addCriterion("worksFee4Jian between", value1, value2, "worksFee4Jian");
            return (Criteria) this;
        }

        public Criteria andWorksFee4JianNotBetween(Double value1, Double value2) {
            addCriterion("worksFee4Jian not between", value1, value2, "worksFee4Jian");
            return (Criteria) this;
        }

        public Criteria andWorksFeeTotalIsNull() {
            addCriterion("worksFeeTotal is null");
            return (Criteria) this;
        }

        public Criteria andWorksFeeTotalIsNotNull() {
            addCriterion("worksFeeTotal is not null");
            return (Criteria) this;
        }

        public Criteria andWorksFeeTotalEqualTo(Double value) {
            addCriterion("worksFeeTotal =", value, "worksFeeTotal");
            return (Criteria) this;
        }

        public Criteria andWorksFeeTotalNotEqualTo(Double value) {
            addCriterion("worksFeeTotal <>", value, "worksFeeTotal");
            return (Criteria) this;
        }

        public Criteria andWorksFeeTotalGreaterThan(Double value) {
            addCriterion("worksFeeTotal >", value, "worksFeeTotal");
            return (Criteria) this;
        }

        public Criteria andWorksFeeTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("worksFeeTotal >=", value, "worksFeeTotal");
            return (Criteria) this;
        }

        public Criteria andWorksFeeTotalLessThan(Double value) {
            addCriterion("worksFeeTotal <", value, "worksFeeTotal");
            return (Criteria) this;
        }

        public Criteria andWorksFeeTotalLessThanOrEqualTo(Double value) {
            addCriterion("worksFeeTotal <=", value, "worksFeeTotal");
            return (Criteria) this;
        }

        public Criteria andWorksFeeTotalIn(List<Double> values) {
            addCriterion("worksFeeTotal in", values, "worksFeeTotal");
            return (Criteria) this;
        }

        public Criteria andWorksFeeTotalNotIn(List<Double> values) {
            addCriterion("worksFeeTotal not in", values, "worksFeeTotal");
            return (Criteria) this;
        }

        public Criteria andWorksFeeTotalBetween(Double value1, Double value2) {
            addCriterion("worksFeeTotal between", value1, value2, "worksFeeTotal");
            return (Criteria) this;
        }

        public Criteria andWorksFeeTotalNotBetween(Double value1, Double value2) {
            addCriterion("worksFeeTotal not between", value1, value2, "worksFeeTotal");
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

        public Criteria andFittingsFeeIsNull() {
            addCriterion("fittingsFee is null");
            return (Criteria) this;
        }

        public Criteria andFittingsFeeIsNotNull() {
            addCriterion("fittingsFee is not null");
            return (Criteria) this;
        }

        public Criteria andFittingsFeeEqualTo(Double value) {
            addCriterion("fittingsFee =", value, "fittingsFee");
            return (Criteria) this;
        }

        public Criteria andFittingsFeeNotEqualTo(Double value) {
            addCriterion("fittingsFee <>", value, "fittingsFee");
            return (Criteria) this;
        }

        public Criteria andFittingsFeeGreaterThan(Double value) {
            addCriterion("fittingsFee >", value, "fittingsFee");
            return (Criteria) this;
        }

        public Criteria andFittingsFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("fittingsFee >=", value, "fittingsFee");
            return (Criteria) this;
        }

        public Criteria andFittingsFeeLessThan(Double value) {
            addCriterion("fittingsFee <", value, "fittingsFee");
            return (Criteria) this;
        }

        public Criteria andFittingsFeeLessThanOrEqualTo(Double value) {
            addCriterion("fittingsFee <=", value, "fittingsFee");
            return (Criteria) this;
        }

        public Criteria andFittingsFeeIn(List<Double> values) {
            addCriterion("fittingsFee in", values, "fittingsFee");
            return (Criteria) this;
        }

        public Criteria andFittingsFeeNotIn(List<Double> values) {
            addCriterion("fittingsFee not in", values, "fittingsFee");
            return (Criteria) this;
        }

        public Criteria andFittingsFeeBetween(Double value1, Double value2) {
            addCriterion("fittingsFee between", value1, value2, "fittingsFee");
            return (Criteria) this;
        }

        public Criteria andFittingsFeeNotBetween(Double value1, Double value2) {
            addCriterion("fittingsFee not between", value1, value2, "fittingsFee");
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

        public Criteria andGoldCostPriceIsNull() {
            addCriterion("goldCostPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoldCostPriceIsNotNull() {
            addCriterion("goldCostPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoldCostPriceEqualTo(Double value) {
            addCriterion("goldCostPrice =", value, "goldCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoldCostPriceNotEqualTo(Double value) {
            addCriterion("goldCostPrice <>", value, "goldCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoldCostPriceGreaterThan(Double value) {
            addCriterion("goldCostPrice >", value, "goldCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoldCostPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goldCostPrice >=", value, "goldCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoldCostPriceLessThan(Double value) {
            addCriterion("goldCostPrice <", value, "goldCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoldCostPriceLessThanOrEqualTo(Double value) {
            addCriterion("goldCostPrice <=", value, "goldCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoldCostPriceIn(List<Double> values) {
            addCriterion("goldCostPrice in", values, "goldCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoldCostPriceNotIn(List<Double> values) {
            addCriterion("goldCostPrice not in", values, "goldCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoldCostPriceBetween(Double value1, Double value2) {
            addCriterion("goldCostPrice between", value1, value2, "goldCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoldCostPriceNotBetween(Double value1, Double value2) {
            addCriterion("goldCostPrice not between", value1, value2, "goldCostPrice");
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

        public Criteria andMarkupRateIsNull() {
            addCriterion("markupRate is null");
            return (Criteria) this;
        }

        public Criteria andMarkupRateIsNotNull() {
            addCriterion("markupRate is not null");
            return (Criteria) this;
        }

        public Criteria andMarkupRateEqualTo(Double value) {
            addCriterion("markupRate =", value, "markupRate");
            return (Criteria) this;
        }

        public Criteria andMarkupRateNotEqualTo(Double value) {
            addCriterion("markupRate <>", value, "markupRate");
            return (Criteria) this;
        }

        public Criteria andMarkupRateGreaterThan(Double value) {
            addCriterion("markupRate >", value, "markupRate");
            return (Criteria) this;
        }

        public Criteria andMarkupRateGreaterThanOrEqualTo(Double value) {
            addCriterion("markupRate >=", value, "markupRate");
            return (Criteria) this;
        }

        public Criteria andMarkupRateLessThan(Double value) {
            addCriterion("markupRate <", value, "markupRate");
            return (Criteria) this;
        }

        public Criteria andMarkupRateLessThanOrEqualTo(Double value) {
            addCriterion("markupRate <=", value, "markupRate");
            return (Criteria) this;
        }

        public Criteria andMarkupRateIn(List<Double> values) {
            addCriterion("markupRate in", values, "markupRate");
            return (Criteria) this;
        }

        public Criteria andMarkupRateNotIn(List<Double> values) {
            addCriterion("markupRate not in", values, "markupRate");
            return (Criteria) this;
        }

        public Criteria andMarkupRateBetween(Double value1, Double value2) {
            addCriterion("markupRate between", value1, value2, "markupRate");
            return (Criteria) this;
        }

        public Criteria andMarkupRateNotBetween(Double value1, Double value2) {
            addCriterion("markupRate not between", value1, value2, "markupRate");
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

        public Criteria andSalePriceAmountIsNull() {
            addCriterion("salePriceAmount is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceAmountIsNotNull() {
            addCriterion("salePriceAmount is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceAmountEqualTo(Double value) {
            addCriterion("salePriceAmount =", value, "salePriceAmount");
            return (Criteria) this;
        }

        public Criteria andSalePriceAmountNotEqualTo(Double value) {
            addCriterion("salePriceAmount <>", value, "salePriceAmount");
            return (Criteria) this;
        }

        public Criteria andSalePriceAmountGreaterThan(Double value) {
            addCriterion("salePriceAmount >", value, "salePriceAmount");
            return (Criteria) this;
        }

        public Criteria andSalePriceAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("salePriceAmount >=", value, "salePriceAmount");
            return (Criteria) this;
        }

        public Criteria andSalePriceAmountLessThan(Double value) {
            addCriterion("salePriceAmount <", value, "salePriceAmount");
            return (Criteria) this;
        }

        public Criteria andSalePriceAmountLessThanOrEqualTo(Double value) {
            addCriterion("salePriceAmount <=", value, "salePriceAmount");
            return (Criteria) this;
        }

        public Criteria andSalePriceAmountIn(List<Double> values) {
            addCriterion("salePriceAmount in", values, "salePriceAmount");
            return (Criteria) this;
        }

        public Criteria andSalePriceAmountNotIn(List<Double> values) {
            addCriterion("salePriceAmount not in", values, "salePriceAmount");
            return (Criteria) this;
        }

        public Criteria andSalePriceAmountBetween(Double value1, Double value2) {
            addCriterion("salePriceAmount between", value1, value2, "salePriceAmount");
            return (Criteria) this;
        }

        public Criteria andSalePriceAmountNotBetween(Double value1, Double value2) {
            addCriterion("salePriceAmount not between", value1, value2, "salePriceAmount");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeIsNull() {
            addCriterion("labelWorkFee is null");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeIsNotNull() {
            addCriterion("labelWorkFee is not null");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeEqualTo(Double value) {
            addCriterion("labelWorkFee =", value, "labelWorkFee");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeNotEqualTo(Double value) {
            addCriterion("labelWorkFee <>", value, "labelWorkFee");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeGreaterThan(Double value) {
            addCriterion("labelWorkFee >", value, "labelWorkFee");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("labelWorkFee >=", value, "labelWorkFee");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeLessThan(Double value) {
            addCriterion("labelWorkFee <", value, "labelWorkFee");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeLessThanOrEqualTo(Double value) {
            addCriterion("labelWorkFee <=", value, "labelWorkFee");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeIn(List<Double> values) {
            addCriterion("labelWorkFee in", values, "labelWorkFee");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeNotIn(List<Double> values) {
            addCriterion("labelWorkFee not in", values, "labelWorkFee");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeBetween(Double value1, Double value2) {
            addCriterion("labelWorkFee between", value1, value2, "labelWorkFee");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFeeNotBetween(Double value1, Double value2) {
            addCriterion("labelWorkFee not between", value1, value2, "labelWorkFee");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4KeIsNull() {
            addCriterion("labelWorkFee4Ke is null");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4KeIsNotNull() {
            addCriterion("labelWorkFee4Ke is not null");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4KeEqualTo(Double value) {
            addCriterion("labelWorkFee4Ke =", value, "labelWorkFee4Ke");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4KeNotEqualTo(Double value) {
            addCriterion("labelWorkFee4Ke <>", value, "labelWorkFee4Ke");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4KeGreaterThan(Double value) {
            addCriterion("labelWorkFee4Ke >", value, "labelWorkFee4Ke");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4KeGreaterThanOrEqualTo(Double value) {
            addCriterion("labelWorkFee4Ke >=", value, "labelWorkFee4Ke");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4KeLessThan(Double value) {
            addCriterion("labelWorkFee4Ke <", value, "labelWorkFee4Ke");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4KeLessThanOrEqualTo(Double value) {
            addCriterion("labelWorkFee4Ke <=", value, "labelWorkFee4Ke");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4KeIn(List<Double> values) {
            addCriterion("labelWorkFee4Ke in", values, "labelWorkFee4Ke");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4KeNotIn(List<Double> values) {
            addCriterion("labelWorkFee4Ke not in", values, "labelWorkFee4Ke");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4KeBetween(Double value1, Double value2) {
            addCriterion("labelWorkFee4Ke between", value1, value2, "labelWorkFee4Ke");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4KeNotBetween(Double value1, Double value2) {
            addCriterion("labelWorkFee4Ke not between", value1, value2, "labelWorkFee4Ke");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4JianIsNull() {
            addCriterion("labelWorkFee4Jian is null");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4JianIsNotNull() {
            addCriterion("labelWorkFee4Jian is not null");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4JianEqualTo(Double value) {
            addCriterion("labelWorkFee4Jian =", value, "labelWorkFee4Jian");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4JianNotEqualTo(Double value) {
            addCriterion("labelWorkFee4Jian <>", value, "labelWorkFee4Jian");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4JianGreaterThan(Double value) {
            addCriterion("labelWorkFee4Jian >", value, "labelWorkFee4Jian");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4JianGreaterThanOrEqualTo(Double value) {
            addCriterion("labelWorkFee4Jian >=", value, "labelWorkFee4Jian");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4JianLessThan(Double value) {
            addCriterion("labelWorkFee4Jian <", value, "labelWorkFee4Jian");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4JianLessThanOrEqualTo(Double value) {
            addCriterion("labelWorkFee4Jian <=", value, "labelWorkFee4Jian");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4JianIn(List<Double> values) {
            addCriterion("labelWorkFee4Jian in", values, "labelWorkFee4Jian");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4JianNotIn(List<Double> values) {
            addCriterion("labelWorkFee4Jian not in", values, "labelWorkFee4Jian");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4JianBetween(Double value1, Double value2) {
            addCriterion("labelWorkFee4Jian between", value1, value2, "labelWorkFee4Jian");
            return (Criteria) this;
        }

        public Criteria andLabelWorkFee4JianNotBetween(Double value1, Double value2) {
            addCriterion("labelWorkFee4Jian not between", value1, value2, "labelWorkFee4Jian");
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

        public Criteria andArchivesIdIsNull() {
            addCriterion("archivesId is null");
            return (Criteria) this;
        }

        public Criteria andArchivesIdIsNotNull() {
            addCriterion("archivesId is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesIdEqualTo(Integer value) {
            addCriterion("archivesId =", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdNotEqualTo(Integer value) {
            addCriterion("archivesId <>", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdGreaterThan(Integer value) {
            addCriterion("archivesId >", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("archivesId >=", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdLessThan(Integer value) {
            addCriterion("archivesId <", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdLessThanOrEqualTo(Integer value) {
            addCriterion("archivesId <=", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdIn(List<Integer> values) {
            addCriterion("archivesId in", values, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdNotIn(List<Integer> values) {
            addCriterion("archivesId not in", values, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdBetween(Integer value1, Integer value2) {
            addCriterion("archivesId between", value1, value2, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("archivesId not between", value1, value2, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesNoIsNull() {
            addCriterion("archivesNo is null");
            return (Criteria) this;
        }

        public Criteria andArchivesNoIsNotNull() {
            addCriterion("archivesNo is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesNoEqualTo(String value) {
            addCriterion("archivesNo =", value, "archivesNo");
            return (Criteria) this;
        }

        public Criteria andArchivesNoNotEqualTo(String value) {
            addCriterion("archivesNo <>", value, "archivesNo");
            return (Criteria) this;
        }

        public Criteria andArchivesNoGreaterThan(String value) {
            addCriterion("archivesNo >", value, "archivesNo");
            return (Criteria) this;
        }

        public Criteria andArchivesNoGreaterThanOrEqualTo(String value) {
            addCriterion("archivesNo >=", value, "archivesNo");
            return (Criteria) this;
        }

        public Criteria andArchivesNoLessThan(String value) {
            addCriterion("archivesNo <", value, "archivesNo");
            return (Criteria) this;
        }

        public Criteria andArchivesNoLessThanOrEqualTo(String value) {
            addCriterion("archivesNo <=", value, "archivesNo");
            return (Criteria) this;
        }

        public Criteria andArchivesNoLike(String value) {
            addCriterion("archivesNo like", value, "archivesNo");
            return (Criteria) this;
        }

        public Criteria andArchivesNoNotLike(String value) {
            addCriterion("archivesNo not like", value, "archivesNo");
            return (Criteria) this;
        }

        public Criteria andArchivesNoIn(List<String> values) {
            addCriterion("archivesNo in", values, "archivesNo");
            return (Criteria) this;
        }

        public Criteria andArchivesNoNotIn(List<String> values) {
            addCriterion("archivesNo not in", values, "archivesNo");
            return (Criteria) this;
        }

        public Criteria andArchivesNoBetween(String value1, String value2) {
            addCriterion("archivesNo between", value1, value2, "archivesNo");
            return (Criteria) this;
        }

        public Criteria andArchivesNoNotBetween(String value1, String value2) {
            addCriterion("archivesNo not between", value1, value2, "archivesNo");
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

        public Criteria andGoodsNameEnIsNull() {
            addCriterion("goodsNameEn is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEnIsNotNull() {
            addCriterion("goodsNameEn is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEnEqualTo(String value) {
            addCriterion("goodsNameEn =", value, "goodsNameEn");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEnNotEqualTo(String value) {
            addCriterion("goodsNameEn <>", value, "goodsNameEn");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEnGreaterThan(String value) {
            addCriterion("goodsNameEn >", value, "goodsNameEn");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("goodsNameEn >=", value, "goodsNameEn");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEnLessThan(String value) {
            addCriterion("goodsNameEn <", value, "goodsNameEn");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEnLessThanOrEqualTo(String value) {
            addCriterion("goodsNameEn <=", value, "goodsNameEn");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEnLike(String value) {
            addCriterion("goodsNameEn like", value, "goodsNameEn");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEnNotLike(String value) {
            addCriterion("goodsNameEn not like", value, "goodsNameEn");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEnIn(List<String> values) {
            addCriterion("goodsNameEn in", values, "goodsNameEn");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEnNotIn(List<String> values) {
            addCriterion("goodsNameEn not in", values, "goodsNameEn");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEnBetween(String value1, String value2) {
            addCriterion("goodsNameEn between", value1, value2, "goodsNameEn");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEnNotBetween(String value1, String value2) {
            addCriterion("goodsNameEn not between", value1, value2, "goodsNameEn");
            return (Criteria) this;
        }

        public Criteria andArchivesFinenessIsNull() {
            addCriterion("archivesFineness is null");
            return (Criteria) this;
        }

        public Criteria andArchivesFinenessIsNotNull() {
            addCriterion("archivesFineness is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesFinenessEqualTo(String value) {
            addCriterion("archivesFineness =", value, "archivesFineness");
            return (Criteria) this;
        }

        public Criteria andArchivesFinenessNotEqualTo(String value) {
            addCriterion("archivesFineness <>", value, "archivesFineness");
            return (Criteria) this;
        }

        public Criteria andArchivesFinenessGreaterThan(String value) {
            addCriterion("archivesFineness >", value, "archivesFineness");
            return (Criteria) this;
        }

        public Criteria andArchivesFinenessGreaterThanOrEqualTo(String value) {
            addCriterion("archivesFineness >=", value, "archivesFineness");
            return (Criteria) this;
        }

        public Criteria andArchivesFinenessLessThan(String value) {
            addCriterion("archivesFineness <", value, "archivesFineness");
            return (Criteria) this;
        }

        public Criteria andArchivesFinenessLessThanOrEqualTo(String value) {
            addCriterion("archivesFineness <=", value, "archivesFineness");
            return (Criteria) this;
        }

        public Criteria andArchivesFinenessLike(String value) {
            addCriterion("archivesFineness like", value, "archivesFineness");
            return (Criteria) this;
        }

        public Criteria andArchivesFinenessNotLike(String value) {
            addCriterion("archivesFineness not like", value, "archivesFineness");
            return (Criteria) this;
        }

        public Criteria andArchivesFinenessIn(List<String> values) {
            addCriterion("archivesFineness in", values, "archivesFineness");
            return (Criteria) this;
        }

        public Criteria andArchivesFinenessNotIn(List<String> values) {
            addCriterion("archivesFineness not in", values, "archivesFineness");
            return (Criteria) this;
        }

        public Criteria andArchivesFinenessBetween(String value1, String value2) {
            addCriterion("archivesFineness between", value1, value2, "archivesFineness");
            return (Criteria) this;
        }

        public Criteria andArchivesFinenessNotBetween(String value1, String value2) {
            addCriterion("archivesFineness not between", value1, value2, "archivesFineness");
            return (Criteria) this;
        }

        public Criteria andArchivesStoneIsNull() {
            addCriterion("archivesStone is null");
            return (Criteria) this;
        }

        public Criteria andArchivesStoneIsNotNull() {
            addCriterion("archivesStone is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesStoneEqualTo(String value) {
            addCriterion("archivesStone =", value, "archivesStone");
            return (Criteria) this;
        }

        public Criteria andArchivesStoneNotEqualTo(String value) {
            addCriterion("archivesStone <>", value, "archivesStone");
            return (Criteria) this;
        }

        public Criteria andArchivesStoneGreaterThan(String value) {
            addCriterion("archivesStone >", value, "archivesStone");
            return (Criteria) this;
        }

        public Criteria andArchivesStoneGreaterThanOrEqualTo(String value) {
            addCriterion("archivesStone >=", value, "archivesStone");
            return (Criteria) this;
        }

        public Criteria andArchivesStoneLessThan(String value) {
            addCriterion("archivesStone <", value, "archivesStone");
            return (Criteria) this;
        }

        public Criteria andArchivesStoneLessThanOrEqualTo(String value) {
            addCriterion("archivesStone <=", value, "archivesStone");
            return (Criteria) this;
        }

        public Criteria andArchivesStoneLike(String value) {
            addCriterion("archivesStone like", value, "archivesStone");
            return (Criteria) this;
        }

        public Criteria andArchivesStoneNotLike(String value) {
            addCriterion("archivesStone not like", value, "archivesStone");
            return (Criteria) this;
        }

        public Criteria andArchivesStoneIn(List<String> values) {
            addCriterion("archivesStone in", values, "archivesStone");
            return (Criteria) this;
        }

        public Criteria andArchivesStoneNotIn(List<String> values) {
            addCriterion("archivesStone not in", values, "archivesStone");
            return (Criteria) this;
        }

        public Criteria andArchivesStoneBetween(String value1, String value2) {
            addCriterion("archivesStone between", value1, value2, "archivesStone");
            return (Criteria) this;
        }

        public Criteria andArchivesStoneNotBetween(String value1, String value2) {
            addCriterion("archivesStone not between", value1, value2, "archivesStone");
            return (Criteria) this;
        }

        public Criteria andArchivesCategoryIsNull() {
            addCriterion("archivesCategory is null");
            return (Criteria) this;
        }

        public Criteria andArchivesCategoryIsNotNull() {
            addCriterion("archivesCategory is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesCategoryEqualTo(String value) {
            addCriterion("archivesCategory =", value, "archivesCategory");
            return (Criteria) this;
        }

        public Criteria andArchivesCategoryNotEqualTo(String value) {
            addCriterion("archivesCategory <>", value, "archivesCategory");
            return (Criteria) this;
        }

        public Criteria andArchivesCategoryGreaterThan(String value) {
            addCriterion("archivesCategory >", value, "archivesCategory");
            return (Criteria) this;
        }

        public Criteria andArchivesCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("archivesCategory >=", value, "archivesCategory");
            return (Criteria) this;
        }

        public Criteria andArchivesCategoryLessThan(String value) {
            addCriterion("archivesCategory <", value, "archivesCategory");
            return (Criteria) this;
        }

        public Criteria andArchivesCategoryLessThanOrEqualTo(String value) {
            addCriterion("archivesCategory <=", value, "archivesCategory");
            return (Criteria) this;
        }

        public Criteria andArchivesCategoryLike(String value) {
            addCriterion("archivesCategory like", value, "archivesCategory");
            return (Criteria) this;
        }

        public Criteria andArchivesCategoryNotLike(String value) {
            addCriterion("archivesCategory not like", value, "archivesCategory");
            return (Criteria) this;
        }

        public Criteria andArchivesCategoryIn(List<String> values) {
            addCriterion("archivesCategory in", values, "archivesCategory");
            return (Criteria) this;
        }

        public Criteria andArchivesCategoryNotIn(List<String> values) {
            addCriterion("archivesCategory not in", values, "archivesCategory");
            return (Criteria) this;
        }

        public Criteria andArchivesCategoryBetween(String value1, String value2) {
            addCriterion("archivesCategory between", value1, value2, "archivesCategory");
            return (Criteria) this;
        }

        public Criteria andArchivesCategoryNotBetween(String value1, String value2) {
            addCriterion("archivesCategory not between", value1, value2, "archivesCategory");
            return (Criteria) this;
        }

        public Criteria andMainTypeIsNull() {
            addCriterion("mainType is null");
            return (Criteria) this;
        }

        public Criteria andMainTypeIsNotNull() {
            addCriterion("mainType is not null");
            return (Criteria) this;
        }

        public Criteria andMainTypeEqualTo(String value) {
            addCriterion("mainType =", value, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeNotEqualTo(String value) {
            addCriterion("mainType <>", value, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeGreaterThan(String value) {
            addCriterion("mainType >", value, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mainType >=", value, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeLessThan(String value) {
            addCriterion("mainType <", value, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeLessThanOrEqualTo(String value) {
            addCriterion("mainType <=", value, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeLike(String value) {
            addCriterion("mainType like", value, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeNotLike(String value) {
            addCriterion("mainType not like", value, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeIn(List<String> values) {
            addCriterion("mainType in", values, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeNotIn(List<String> values) {
            addCriterion("mainType not in", values, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeBetween(String value1, String value2) {
            addCriterion("mainType between", value1, value2, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeNotBetween(String value1, String value2) {
            addCriterion("mainType not between", value1, value2, "mainType");
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

        public Criteria andCostClassifyIsNull() {
            addCriterion("costClassify is null");
            return (Criteria) this;
        }

        public Criteria andCostClassifyIsNotNull() {
            addCriterion("costClassify is not null");
            return (Criteria) this;
        }

        public Criteria andCostClassifyEqualTo(String value) {
            addCriterion("costClassify =", value, "costClassify");
            return (Criteria) this;
        }

        public Criteria andCostClassifyNotEqualTo(String value) {
            addCriterion("costClassify <>", value, "costClassify");
            return (Criteria) this;
        }

        public Criteria andCostClassifyGreaterThan(String value) {
            addCriterion("costClassify >", value, "costClassify");
            return (Criteria) this;
        }

        public Criteria andCostClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("costClassify >=", value, "costClassify");
            return (Criteria) this;
        }

        public Criteria andCostClassifyLessThan(String value) {
            addCriterion("costClassify <", value, "costClassify");
            return (Criteria) this;
        }

        public Criteria andCostClassifyLessThanOrEqualTo(String value) {
            addCriterion("costClassify <=", value, "costClassify");
            return (Criteria) this;
        }

        public Criteria andCostClassifyLike(String value) {
            addCriterion("costClassify like", value, "costClassify");
            return (Criteria) this;
        }

        public Criteria andCostClassifyNotLike(String value) {
            addCriterion("costClassify not like", value, "costClassify");
            return (Criteria) this;
        }

        public Criteria andCostClassifyIn(List<String> values) {
            addCriterion("costClassify in", values, "costClassify");
            return (Criteria) this;
        }

        public Criteria andCostClassifyNotIn(List<String> values) {
            addCriterion("costClassify not in", values, "costClassify");
            return (Criteria) this;
        }

        public Criteria andCostClassifyBetween(String value1, String value2) {
            addCriterion("costClassify between", value1, value2, "costClassify");
            return (Criteria) this;
        }

        public Criteria andCostClassifyNotBetween(String value1, String value2) {
            addCriterion("costClassify not between", value1, value2, "costClassify");
            return (Criteria) this;
        }

        public Criteria andStatsClassifyIsNull() {
            addCriterion("statsClassify is null");
            return (Criteria) this;
        }

        public Criteria andStatsClassifyIsNotNull() {
            addCriterion("statsClassify is not null");
            return (Criteria) this;
        }

        public Criteria andStatsClassifyEqualTo(String value) {
            addCriterion("statsClassify =", value, "statsClassify");
            return (Criteria) this;
        }

        public Criteria andStatsClassifyNotEqualTo(String value) {
            addCriterion("statsClassify <>", value, "statsClassify");
            return (Criteria) this;
        }

        public Criteria andStatsClassifyGreaterThan(String value) {
            addCriterion("statsClassify >", value, "statsClassify");
            return (Criteria) this;
        }

        public Criteria andStatsClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("statsClassify >=", value, "statsClassify");
            return (Criteria) this;
        }

        public Criteria andStatsClassifyLessThan(String value) {
            addCriterion("statsClassify <", value, "statsClassify");
            return (Criteria) this;
        }

        public Criteria andStatsClassifyLessThanOrEqualTo(String value) {
            addCriterion("statsClassify <=", value, "statsClassify");
            return (Criteria) this;
        }

        public Criteria andStatsClassifyLike(String value) {
            addCriterion("statsClassify like", value, "statsClassify");
            return (Criteria) this;
        }

        public Criteria andStatsClassifyNotLike(String value) {
            addCriterion("statsClassify not like", value, "statsClassify");
            return (Criteria) this;
        }

        public Criteria andStatsClassifyIn(List<String> values) {
            addCriterion("statsClassify in", values, "statsClassify");
            return (Criteria) this;
        }

        public Criteria andStatsClassifyNotIn(List<String> values) {
            addCriterion("statsClassify not in", values, "statsClassify");
            return (Criteria) this;
        }

        public Criteria andStatsClassifyBetween(String value1, String value2) {
            addCriterion("statsClassify between", value1, value2, "statsClassify");
            return (Criteria) this;
        }

        public Criteria andStatsClassifyNotBetween(String value1, String value2) {
            addCriterion("statsClassify not between", value1, value2, "statsClassify");
            return (Criteria) this;
        }

        public Criteria andMainStoneCutIsNull() {
            addCriterion("mainStoneCut is null");
            return (Criteria) this;
        }

        public Criteria andMainStoneCutIsNotNull() {
            addCriterion("mainStoneCut is not null");
            return (Criteria) this;
        }

        public Criteria andMainStoneCutEqualTo(String value) {
            addCriterion("mainStoneCut =", value, "mainStoneCut");
            return (Criteria) this;
        }

        public Criteria andMainStoneCutNotEqualTo(String value) {
            addCriterion("mainStoneCut <>", value, "mainStoneCut");
            return (Criteria) this;
        }

        public Criteria andMainStoneCutGreaterThan(String value) {
            addCriterion("mainStoneCut >", value, "mainStoneCut");
            return (Criteria) this;
        }

        public Criteria andMainStoneCutGreaterThanOrEqualTo(String value) {
            addCriterion("mainStoneCut >=", value, "mainStoneCut");
            return (Criteria) this;
        }

        public Criteria andMainStoneCutLessThan(String value) {
            addCriterion("mainStoneCut <", value, "mainStoneCut");
            return (Criteria) this;
        }

        public Criteria andMainStoneCutLessThanOrEqualTo(String value) {
            addCriterion("mainStoneCut <=", value, "mainStoneCut");
            return (Criteria) this;
        }

        public Criteria andMainStoneCutLike(String value) {
            addCriterion("mainStoneCut like", value, "mainStoneCut");
            return (Criteria) this;
        }

        public Criteria andMainStoneCutNotLike(String value) {
            addCriterion("mainStoneCut not like", value, "mainStoneCut");
            return (Criteria) this;
        }

        public Criteria andMainStoneCutIn(List<String> values) {
            addCriterion("mainStoneCut in", values, "mainStoneCut");
            return (Criteria) this;
        }

        public Criteria andMainStoneCutNotIn(List<String> values) {
            addCriterion("mainStoneCut not in", values, "mainStoneCut");
            return (Criteria) this;
        }

        public Criteria andMainStoneCutBetween(String value1, String value2) {
            addCriterion("mainStoneCut between", value1, value2, "mainStoneCut");
            return (Criteria) this;
        }

        public Criteria andMainStoneCutNotBetween(String value1, String value2) {
            addCriterion("mainStoneCut not between", value1, value2, "mainStoneCut");
            return (Criteria) this;
        }

        public Criteria andMainStoneColorIsNull() {
            addCriterion("mainStoneColor is null");
            return (Criteria) this;
        }

        public Criteria andMainStoneColorIsNotNull() {
            addCriterion("mainStoneColor is not null");
            return (Criteria) this;
        }

        public Criteria andMainStoneColorEqualTo(String value) {
            addCriterion("mainStoneColor =", value, "mainStoneColor");
            return (Criteria) this;
        }

        public Criteria andMainStoneColorNotEqualTo(String value) {
            addCriterion("mainStoneColor <>", value, "mainStoneColor");
            return (Criteria) this;
        }

        public Criteria andMainStoneColorGreaterThan(String value) {
            addCriterion("mainStoneColor >", value, "mainStoneColor");
            return (Criteria) this;
        }

        public Criteria andMainStoneColorGreaterThanOrEqualTo(String value) {
            addCriterion("mainStoneColor >=", value, "mainStoneColor");
            return (Criteria) this;
        }

        public Criteria andMainStoneColorLessThan(String value) {
            addCriterion("mainStoneColor <", value, "mainStoneColor");
            return (Criteria) this;
        }

        public Criteria andMainStoneColorLessThanOrEqualTo(String value) {
            addCriterion("mainStoneColor <=", value, "mainStoneColor");
            return (Criteria) this;
        }

        public Criteria andMainStoneColorLike(String value) {
            addCriterion("mainStoneColor like", value, "mainStoneColor");
            return (Criteria) this;
        }

        public Criteria andMainStoneColorNotLike(String value) {
            addCriterion("mainStoneColor not like", value, "mainStoneColor");
            return (Criteria) this;
        }

        public Criteria andMainStoneColorIn(List<String> values) {
            addCriterion("mainStoneColor in", values, "mainStoneColor");
            return (Criteria) this;
        }

        public Criteria andMainStoneColorNotIn(List<String> values) {
            addCriterion("mainStoneColor not in", values, "mainStoneColor");
            return (Criteria) this;
        }

        public Criteria andMainStoneColorBetween(String value1, String value2) {
            addCriterion("mainStoneColor between", value1, value2, "mainStoneColor");
            return (Criteria) this;
        }

        public Criteria andMainStoneColorNotBetween(String value1, String value2) {
            addCriterion("mainStoneColor not between", value1, value2, "mainStoneColor");
            return (Criteria) this;
        }

        public Criteria andMainStoneClarityIsNull() {
            addCriterion("mainStoneClarity is null");
            return (Criteria) this;
        }

        public Criteria andMainStoneClarityIsNotNull() {
            addCriterion("mainStoneClarity is not null");
            return (Criteria) this;
        }

        public Criteria andMainStoneClarityEqualTo(String value) {
            addCriterion("mainStoneClarity =", value, "mainStoneClarity");
            return (Criteria) this;
        }

        public Criteria andMainStoneClarityNotEqualTo(String value) {
            addCriterion("mainStoneClarity <>", value, "mainStoneClarity");
            return (Criteria) this;
        }

        public Criteria andMainStoneClarityGreaterThan(String value) {
            addCriterion("mainStoneClarity >", value, "mainStoneClarity");
            return (Criteria) this;
        }

        public Criteria andMainStoneClarityGreaterThanOrEqualTo(String value) {
            addCriterion("mainStoneClarity >=", value, "mainStoneClarity");
            return (Criteria) this;
        }

        public Criteria andMainStoneClarityLessThan(String value) {
            addCriterion("mainStoneClarity <", value, "mainStoneClarity");
            return (Criteria) this;
        }

        public Criteria andMainStoneClarityLessThanOrEqualTo(String value) {
            addCriterion("mainStoneClarity <=", value, "mainStoneClarity");
            return (Criteria) this;
        }

        public Criteria andMainStoneClarityLike(String value) {
            addCriterion("mainStoneClarity like", value, "mainStoneClarity");
            return (Criteria) this;
        }

        public Criteria andMainStoneClarityNotLike(String value) {
            addCriterion("mainStoneClarity not like", value, "mainStoneClarity");
            return (Criteria) this;
        }

        public Criteria andMainStoneClarityIn(List<String> values) {
            addCriterion("mainStoneClarity in", values, "mainStoneClarity");
            return (Criteria) this;
        }

        public Criteria andMainStoneClarityNotIn(List<String> values) {
            addCriterion("mainStoneClarity not in", values, "mainStoneClarity");
            return (Criteria) this;
        }

        public Criteria andMainStoneClarityBetween(String value1, String value2) {
            addCriterion("mainStoneClarity between", value1, value2, "mainStoneClarity");
            return (Criteria) this;
        }

        public Criteria andMainStoneClarityNotBetween(String value1, String value2) {
            addCriterion("mainStoneClarity not between", value1, value2, "mainStoneClarity");
            return (Criteria) this;
        }

        public Criteria andMainStoneFluorescentIsNull() {
            addCriterion("mainStoneFluorescent is null");
            return (Criteria) this;
        }

        public Criteria andMainStoneFluorescentIsNotNull() {
            addCriterion("mainStoneFluorescent is not null");
            return (Criteria) this;
        }

        public Criteria andMainStoneFluorescentEqualTo(String value) {
            addCriterion("mainStoneFluorescent =", value, "mainStoneFluorescent");
            return (Criteria) this;
        }

        public Criteria andMainStoneFluorescentNotEqualTo(String value) {
            addCriterion("mainStoneFluorescent <>", value, "mainStoneFluorescent");
            return (Criteria) this;
        }

        public Criteria andMainStoneFluorescentGreaterThan(String value) {
            addCriterion("mainStoneFluorescent >", value, "mainStoneFluorescent");
            return (Criteria) this;
        }

        public Criteria andMainStoneFluorescentGreaterThanOrEqualTo(String value) {
            addCriterion("mainStoneFluorescent >=", value, "mainStoneFluorescent");
            return (Criteria) this;
        }

        public Criteria andMainStoneFluorescentLessThan(String value) {
            addCriterion("mainStoneFluorescent <", value, "mainStoneFluorescent");
            return (Criteria) this;
        }

        public Criteria andMainStoneFluorescentLessThanOrEqualTo(String value) {
            addCriterion("mainStoneFluorescent <=", value, "mainStoneFluorescent");
            return (Criteria) this;
        }

        public Criteria andMainStoneFluorescentLike(String value) {
            addCriterion("mainStoneFluorescent like", value, "mainStoneFluorescent");
            return (Criteria) this;
        }

        public Criteria andMainStoneFluorescentNotLike(String value) {
            addCriterion("mainStoneFluorescent not like", value, "mainStoneFluorescent");
            return (Criteria) this;
        }

        public Criteria andMainStoneFluorescentIn(List<String> values) {
            addCriterion("mainStoneFluorescent in", values, "mainStoneFluorescent");
            return (Criteria) this;
        }

        public Criteria andMainStoneFluorescentNotIn(List<String> values) {
            addCriterion("mainStoneFluorescent not in", values, "mainStoneFluorescent");
            return (Criteria) this;
        }

        public Criteria andMainStoneFluorescentBetween(String value1, String value2) {
            addCriterion("mainStoneFluorescent between", value1, value2, "mainStoneFluorescent");
            return (Criteria) this;
        }

        public Criteria andMainStoneFluorescentNotBetween(String value1, String value2) {
            addCriterion("mainStoneFluorescent not between", value1, value2, "mainStoneFluorescent");
            return (Criteria) this;
        }

        public Criteria andMainStoneBurnishedIsNull() {
            addCriterion("mainStoneBurnished is null");
            return (Criteria) this;
        }

        public Criteria andMainStoneBurnishedIsNotNull() {
            addCriterion("mainStoneBurnished is not null");
            return (Criteria) this;
        }

        public Criteria andMainStoneBurnishedEqualTo(String value) {
            addCriterion("mainStoneBurnished =", value, "mainStoneBurnished");
            return (Criteria) this;
        }

        public Criteria andMainStoneBurnishedNotEqualTo(String value) {
            addCriterion("mainStoneBurnished <>", value, "mainStoneBurnished");
            return (Criteria) this;
        }

        public Criteria andMainStoneBurnishedGreaterThan(String value) {
            addCriterion("mainStoneBurnished >", value, "mainStoneBurnished");
            return (Criteria) this;
        }

        public Criteria andMainStoneBurnishedGreaterThanOrEqualTo(String value) {
            addCriterion("mainStoneBurnished >=", value, "mainStoneBurnished");
            return (Criteria) this;
        }

        public Criteria andMainStoneBurnishedLessThan(String value) {
            addCriterion("mainStoneBurnished <", value, "mainStoneBurnished");
            return (Criteria) this;
        }

        public Criteria andMainStoneBurnishedLessThanOrEqualTo(String value) {
            addCriterion("mainStoneBurnished <=", value, "mainStoneBurnished");
            return (Criteria) this;
        }

        public Criteria andMainStoneBurnishedLike(String value) {
            addCriterion("mainStoneBurnished like", value, "mainStoneBurnished");
            return (Criteria) this;
        }

        public Criteria andMainStoneBurnishedNotLike(String value) {
            addCriterion("mainStoneBurnished not like", value, "mainStoneBurnished");
            return (Criteria) this;
        }

        public Criteria andMainStoneBurnishedIn(List<String> values) {
            addCriterion("mainStoneBurnished in", values, "mainStoneBurnished");
            return (Criteria) this;
        }

        public Criteria andMainStoneBurnishedNotIn(List<String> values) {
            addCriterion("mainStoneBurnished not in", values, "mainStoneBurnished");
            return (Criteria) this;
        }

        public Criteria andMainStoneBurnishedBetween(String value1, String value2) {
            addCriterion("mainStoneBurnished between", value1, value2, "mainStoneBurnished");
            return (Criteria) this;
        }

        public Criteria andMainStoneBurnishedNotBetween(String value1, String value2) {
            addCriterion("mainStoneBurnished not between", value1, value2, "mainStoneBurnished");
            return (Criteria) this;
        }

        public Criteria andMainStoneSymmetryIsNull() {
            addCriterion("mainStoneSymmetry is null");
            return (Criteria) this;
        }

        public Criteria andMainStoneSymmetryIsNotNull() {
            addCriterion("mainStoneSymmetry is not null");
            return (Criteria) this;
        }

        public Criteria andMainStoneSymmetryEqualTo(String value) {
            addCriterion("mainStoneSymmetry =", value, "mainStoneSymmetry");
            return (Criteria) this;
        }

        public Criteria andMainStoneSymmetryNotEqualTo(String value) {
            addCriterion("mainStoneSymmetry <>", value, "mainStoneSymmetry");
            return (Criteria) this;
        }

        public Criteria andMainStoneSymmetryGreaterThan(String value) {
            addCriterion("mainStoneSymmetry >", value, "mainStoneSymmetry");
            return (Criteria) this;
        }

        public Criteria andMainStoneSymmetryGreaterThanOrEqualTo(String value) {
            addCriterion("mainStoneSymmetry >=", value, "mainStoneSymmetry");
            return (Criteria) this;
        }

        public Criteria andMainStoneSymmetryLessThan(String value) {
            addCriterion("mainStoneSymmetry <", value, "mainStoneSymmetry");
            return (Criteria) this;
        }

        public Criteria andMainStoneSymmetryLessThanOrEqualTo(String value) {
            addCriterion("mainStoneSymmetry <=", value, "mainStoneSymmetry");
            return (Criteria) this;
        }

        public Criteria andMainStoneSymmetryLike(String value) {
            addCriterion("mainStoneSymmetry like", value, "mainStoneSymmetry");
            return (Criteria) this;
        }

        public Criteria andMainStoneSymmetryNotLike(String value) {
            addCriterion("mainStoneSymmetry not like", value, "mainStoneSymmetry");
            return (Criteria) this;
        }

        public Criteria andMainStoneSymmetryIn(List<String> values) {
            addCriterion("mainStoneSymmetry in", values, "mainStoneSymmetry");
            return (Criteria) this;
        }

        public Criteria andMainStoneSymmetryNotIn(List<String> values) {
            addCriterion("mainStoneSymmetry not in", values, "mainStoneSymmetry");
            return (Criteria) this;
        }

        public Criteria andMainStoneSymmetryBetween(String value1, String value2) {
            addCriterion("mainStoneSymmetry between", value1, value2, "mainStoneSymmetry");
            return (Criteria) this;
        }

        public Criteria andMainStoneSymmetryNotBetween(String value1, String value2) {
            addCriterion("mainStoneSymmetry not between", value1, value2, "mainStoneSymmetry");
            return (Criteria) this;
        }

        public Criteria andMainStoneNameIsNull() {
            addCriterion("mainStoneName is null");
            return (Criteria) this;
        }

        public Criteria andMainStoneNameIsNotNull() {
            addCriterion("mainStoneName is not null");
            return (Criteria) this;
        }

        public Criteria andMainStoneNameEqualTo(String value) {
            addCriterion("mainStoneName =", value, "mainStoneName");
            return (Criteria) this;
        }

        public Criteria andMainStoneNameNotEqualTo(String value) {
            addCriterion("mainStoneName <>", value, "mainStoneName");
            return (Criteria) this;
        }

        public Criteria andMainStoneNameGreaterThan(String value) {
            addCriterion("mainStoneName >", value, "mainStoneName");
            return (Criteria) this;
        }

        public Criteria andMainStoneNameGreaterThanOrEqualTo(String value) {
            addCriterion("mainStoneName >=", value, "mainStoneName");
            return (Criteria) this;
        }

        public Criteria andMainStoneNameLessThan(String value) {
            addCriterion("mainStoneName <", value, "mainStoneName");
            return (Criteria) this;
        }

        public Criteria andMainStoneNameLessThanOrEqualTo(String value) {
            addCriterion("mainStoneName <=", value, "mainStoneName");
            return (Criteria) this;
        }

        public Criteria andMainStoneNameLike(String value) {
            addCriterion("mainStoneName like", value, "mainStoneName");
            return (Criteria) this;
        }

        public Criteria andMainStoneNameNotLike(String value) {
            addCriterion("mainStoneName not like", value, "mainStoneName");
            return (Criteria) this;
        }

        public Criteria andMainStoneNameIn(List<String> values) {
            addCriterion("mainStoneName in", values, "mainStoneName");
            return (Criteria) this;
        }

        public Criteria andMainStoneNameNotIn(List<String> values) {
            addCriterion("mainStoneName not in", values, "mainStoneName");
            return (Criteria) this;
        }

        public Criteria andMainStoneNameBetween(String value1, String value2) {
            addCriterion("mainStoneName between", value1, value2, "mainStoneName");
            return (Criteria) this;
        }

        public Criteria andMainStoneNameNotBetween(String value1, String value2) {
            addCriterion("mainStoneName not between", value1, value2, "mainStoneName");
            return (Criteria) this;
        }

        public Criteria andMainStoneNoIsNull() {
            addCriterion("mainStoneNo is null");
            return (Criteria) this;
        }

        public Criteria andMainStoneNoIsNotNull() {
            addCriterion("mainStoneNo is not null");
            return (Criteria) this;
        }

        public Criteria andMainStoneNoEqualTo(String value) {
            addCriterion("mainStoneNo =", value, "mainStoneNo");
            return (Criteria) this;
        }

        public Criteria andMainStoneNoNotEqualTo(String value) {
            addCriterion("mainStoneNo <>", value, "mainStoneNo");
            return (Criteria) this;
        }

        public Criteria andMainStoneNoGreaterThan(String value) {
            addCriterion("mainStoneNo >", value, "mainStoneNo");
            return (Criteria) this;
        }

        public Criteria andMainStoneNoGreaterThanOrEqualTo(String value) {
            addCriterion("mainStoneNo >=", value, "mainStoneNo");
            return (Criteria) this;
        }

        public Criteria andMainStoneNoLessThan(String value) {
            addCriterion("mainStoneNo <", value, "mainStoneNo");
            return (Criteria) this;
        }

        public Criteria andMainStoneNoLessThanOrEqualTo(String value) {
            addCriterion("mainStoneNo <=", value, "mainStoneNo");
            return (Criteria) this;
        }

        public Criteria andMainStoneNoLike(String value) {
            addCriterion("mainStoneNo like", value, "mainStoneNo");
            return (Criteria) this;
        }

        public Criteria andMainStoneNoNotLike(String value) {
            addCriterion("mainStoneNo not like", value, "mainStoneNo");
            return (Criteria) this;
        }

        public Criteria andMainStoneNoIn(List<String> values) {
            addCriterion("mainStoneNo in", values, "mainStoneNo");
            return (Criteria) this;
        }

        public Criteria andMainStoneNoNotIn(List<String> values) {
            addCriterion("mainStoneNo not in", values, "mainStoneNo");
            return (Criteria) this;
        }

        public Criteria andMainStoneNoBetween(String value1, String value2) {
            addCriterion("mainStoneNo between", value1, value2, "mainStoneNo");
            return (Criteria) this;
        }

        public Criteria andMainStoneNoNotBetween(String value1, String value2) {
            addCriterion("mainStoneNo not between", value1, value2, "mainStoneNo");
            return (Criteria) this;
        }

        public Criteria andMainStoneSpecifiIsNull() {
            addCriterion("mainStoneSpecifi is null");
            return (Criteria) this;
        }

        public Criteria andMainStoneSpecifiIsNotNull() {
            addCriterion("mainStoneSpecifi is not null");
            return (Criteria) this;
        }

        public Criteria andMainStoneSpecifiEqualTo(String value) {
            addCriterion("mainStoneSpecifi =", value, "mainStoneSpecifi");
            return (Criteria) this;
        }

        public Criteria andMainStoneSpecifiNotEqualTo(String value) {
            addCriterion("mainStoneSpecifi <>", value, "mainStoneSpecifi");
            return (Criteria) this;
        }

        public Criteria andMainStoneSpecifiGreaterThan(String value) {
            addCriterion("mainStoneSpecifi >", value, "mainStoneSpecifi");
            return (Criteria) this;
        }

        public Criteria andMainStoneSpecifiGreaterThanOrEqualTo(String value) {
            addCriterion("mainStoneSpecifi >=", value, "mainStoneSpecifi");
            return (Criteria) this;
        }

        public Criteria andMainStoneSpecifiLessThan(String value) {
            addCriterion("mainStoneSpecifi <", value, "mainStoneSpecifi");
            return (Criteria) this;
        }

        public Criteria andMainStoneSpecifiLessThanOrEqualTo(String value) {
            addCriterion("mainStoneSpecifi <=", value, "mainStoneSpecifi");
            return (Criteria) this;
        }

        public Criteria andMainStoneSpecifiLike(String value) {
            addCriterion("mainStoneSpecifi like", value, "mainStoneSpecifi");
            return (Criteria) this;
        }

        public Criteria andMainStoneSpecifiNotLike(String value) {
            addCriterion("mainStoneSpecifi not like", value, "mainStoneSpecifi");
            return (Criteria) this;
        }

        public Criteria andMainStoneSpecifiIn(List<String> values) {
            addCriterion("mainStoneSpecifi in", values, "mainStoneSpecifi");
            return (Criteria) this;
        }

        public Criteria andMainStoneSpecifiNotIn(List<String> values) {
            addCriterion("mainStoneSpecifi not in", values, "mainStoneSpecifi");
            return (Criteria) this;
        }

        public Criteria andMainStoneSpecifiBetween(String value1, String value2) {
            addCriterion("mainStoneSpecifi between", value1, value2, "mainStoneSpecifi");
            return (Criteria) this;
        }

        public Criteria andMainStoneSpecifiNotBetween(String value1, String value2) {
            addCriterion("mainStoneSpecifi not between", value1, value2, "mainStoneSpecifi");
            return (Criteria) this;
        }

        public Criteria andMainStoneNumIsNull() {
            addCriterion("mainStoneNum is null");
            return (Criteria) this;
        }

        public Criteria andMainStoneNumIsNotNull() {
            addCriterion("mainStoneNum is not null");
            return (Criteria) this;
        }

        public Criteria andMainStoneNumEqualTo(Integer value) {
            addCriterion("mainStoneNum =", value, "mainStoneNum");
            return (Criteria) this;
        }

        public Criteria andMainStoneNumNotEqualTo(Integer value) {
            addCriterion("mainStoneNum <>", value, "mainStoneNum");
            return (Criteria) this;
        }

        public Criteria andMainStoneNumGreaterThan(Integer value) {
            addCriterion("mainStoneNum >", value, "mainStoneNum");
            return (Criteria) this;
        }

        public Criteria andMainStoneNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("mainStoneNum >=", value, "mainStoneNum");
            return (Criteria) this;
        }

        public Criteria andMainStoneNumLessThan(Integer value) {
            addCriterion("mainStoneNum <", value, "mainStoneNum");
            return (Criteria) this;
        }

        public Criteria andMainStoneNumLessThanOrEqualTo(Integer value) {
            addCriterion("mainStoneNum <=", value, "mainStoneNum");
            return (Criteria) this;
        }

        public Criteria andMainStoneNumIn(List<Integer> values) {
            addCriterion("mainStoneNum in", values, "mainStoneNum");
            return (Criteria) this;
        }

        public Criteria andMainStoneNumNotIn(List<Integer> values) {
            addCriterion("mainStoneNum not in", values, "mainStoneNum");
            return (Criteria) this;
        }

        public Criteria andMainStoneNumBetween(Integer value1, Integer value2) {
            addCriterion("mainStoneNum between", value1, value2, "mainStoneNum");
            return (Criteria) this;
        }

        public Criteria andMainStoneNumNotBetween(Integer value1, Integer value2) {
            addCriterion("mainStoneNum not between", value1, value2, "mainStoneNum");
            return (Criteria) this;
        }

        public Criteria andMainStoneWeightIsNull() {
            addCriterion("mainStoneWeight is null");
            return (Criteria) this;
        }

        public Criteria andMainStoneWeightIsNotNull() {
            addCriterion("mainStoneWeight is not null");
            return (Criteria) this;
        }

        public Criteria andMainStoneWeightEqualTo(Double value) {
            addCriterion("mainStoneWeight =", value, "mainStoneWeight");
            return (Criteria) this;
        }

        public Criteria andMainStoneWeightNotEqualTo(Double value) {
            addCriterion("mainStoneWeight <>", value, "mainStoneWeight");
            return (Criteria) this;
        }

        public Criteria andMainStoneWeightGreaterThan(Double value) {
            addCriterion("mainStoneWeight >", value, "mainStoneWeight");
            return (Criteria) this;
        }

        public Criteria andMainStoneWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("mainStoneWeight >=", value, "mainStoneWeight");
            return (Criteria) this;
        }

        public Criteria andMainStoneWeightLessThan(Double value) {
            addCriterion("mainStoneWeight <", value, "mainStoneWeight");
            return (Criteria) this;
        }

        public Criteria andMainStoneWeightLessThanOrEqualTo(Double value) {
            addCriterion("mainStoneWeight <=", value, "mainStoneWeight");
            return (Criteria) this;
        }

        public Criteria andMainStoneWeightIn(List<Double> values) {
            addCriterion("mainStoneWeight in", values, "mainStoneWeight");
            return (Criteria) this;
        }

        public Criteria andMainStoneWeightNotIn(List<Double> values) {
            addCriterion("mainStoneWeight not in", values, "mainStoneWeight");
            return (Criteria) this;
        }

        public Criteria andMainStoneWeightBetween(Double value1, Double value2) {
            addCriterion("mainStoneWeight between", value1, value2, "mainStoneWeight");
            return (Criteria) this;
        }

        public Criteria andMainStoneWeightNotBetween(Double value1, Double value2) {
            addCriterion("mainStoneWeight not between", value1, value2, "mainStoneWeight");
            return (Criteria) this;
        }

        public Criteria andMainStonePriceIsNull() {
            addCriterion("mainStonePrice is null");
            return (Criteria) this;
        }

        public Criteria andMainStonePriceIsNotNull() {
            addCriterion("mainStonePrice is not null");
            return (Criteria) this;
        }

        public Criteria andMainStonePriceEqualTo(Double value) {
            addCriterion("mainStonePrice =", value, "mainStonePrice");
            return (Criteria) this;
        }

        public Criteria andMainStonePriceNotEqualTo(Double value) {
            addCriterion("mainStonePrice <>", value, "mainStonePrice");
            return (Criteria) this;
        }

        public Criteria andMainStonePriceGreaterThan(Double value) {
            addCriterion("mainStonePrice >", value, "mainStonePrice");
            return (Criteria) this;
        }

        public Criteria andMainStonePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("mainStonePrice >=", value, "mainStonePrice");
            return (Criteria) this;
        }

        public Criteria andMainStonePriceLessThan(Double value) {
            addCriterion("mainStonePrice <", value, "mainStonePrice");
            return (Criteria) this;
        }

        public Criteria andMainStonePriceLessThanOrEqualTo(Double value) {
            addCriterion("mainStonePrice <=", value, "mainStonePrice");
            return (Criteria) this;
        }

        public Criteria andMainStonePriceIn(List<Double> values) {
            addCriterion("mainStonePrice in", values, "mainStonePrice");
            return (Criteria) this;
        }

        public Criteria andMainStonePriceNotIn(List<Double> values) {
            addCriterion("mainStonePrice not in", values, "mainStonePrice");
            return (Criteria) this;
        }

        public Criteria andMainStonePriceBetween(Double value1, Double value2) {
            addCriterion("mainStonePrice between", value1, value2, "mainStonePrice");
            return (Criteria) this;
        }

        public Criteria andMainStonePriceNotBetween(Double value1, Double value2) {
            addCriterion("mainStonePrice not between", value1, value2, "mainStonePrice");
            return (Criteria) this;
        }

        public Criteria andMainStoneMoneyIsNull() {
            addCriterion("mainStoneMoney is null");
            return (Criteria) this;
        }

        public Criteria andMainStoneMoneyIsNotNull() {
            addCriterion("mainStoneMoney is not null");
            return (Criteria) this;
        }

        public Criteria andMainStoneMoneyEqualTo(Double value) {
            addCriterion("mainStoneMoney =", value, "mainStoneMoney");
            return (Criteria) this;
        }

        public Criteria andMainStoneMoneyNotEqualTo(Double value) {
            addCriterion("mainStoneMoney <>", value, "mainStoneMoney");
            return (Criteria) this;
        }

        public Criteria andMainStoneMoneyGreaterThan(Double value) {
            addCriterion("mainStoneMoney >", value, "mainStoneMoney");
            return (Criteria) this;
        }

        public Criteria andMainStoneMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("mainStoneMoney >=", value, "mainStoneMoney");
            return (Criteria) this;
        }

        public Criteria andMainStoneMoneyLessThan(Double value) {
            addCriterion("mainStoneMoney <", value, "mainStoneMoney");
            return (Criteria) this;
        }

        public Criteria andMainStoneMoneyLessThanOrEqualTo(Double value) {
            addCriterion("mainStoneMoney <=", value, "mainStoneMoney");
            return (Criteria) this;
        }

        public Criteria andMainStoneMoneyIn(List<Double> values) {
            addCriterion("mainStoneMoney in", values, "mainStoneMoney");
            return (Criteria) this;
        }

        public Criteria andMainStoneMoneyNotIn(List<Double> values) {
            addCriterion("mainStoneMoney not in", values, "mainStoneMoney");
            return (Criteria) this;
        }

        public Criteria andMainStoneMoneyBetween(Double value1, Double value2) {
            addCriterion("mainStoneMoney between", value1, value2, "mainStoneMoney");
            return (Criteria) this;
        }

        public Criteria andMainStoneMoneyNotBetween(Double value1, Double value2) {
            addCriterion("mainStoneMoney not between", value1, value2, "mainStoneMoney");
            return (Criteria) this;
        }

        public Criteria andSubStone1NameIsNull() {
            addCriterion("subStone1Name is null");
            return (Criteria) this;
        }

        public Criteria andSubStone1NameIsNotNull() {
            addCriterion("subStone1Name is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone1NameEqualTo(String value) {
            addCriterion("subStone1Name =", value, "subStone1Name");
            return (Criteria) this;
        }

        public Criteria andSubStone1NameNotEqualTo(String value) {
            addCriterion("subStone1Name <>", value, "subStone1Name");
            return (Criteria) this;
        }

        public Criteria andSubStone1NameGreaterThan(String value) {
            addCriterion("subStone1Name >", value, "subStone1Name");
            return (Criteria) this;
        }

        public Criteria andSubStone1NameGreaterThanOrEqualTo(String value) {
            addCriterion("subStone1Name >=", value, "subStone1Name");
            return (Criteria) this;
        }

        public Criteria andSubStone1NameLessThan(String value) {
            addCriterion("subStone1Name <", value, "subStone1Name");
            return (Criteria) this;
        }

        public Criteria andSubStone1NameLessThanOrEqualTo(String value) {
            addCriterion("subStone1Name <=", value, "subStone1Name");
            return (Criteria) this;
        }

        public Criteria andSubStone1NameLike(String value) {
            addCriterion("subStone1Name like", value, "subStone1Name");
            return (Criteria) this;
        }

        public Criteria andSubStone1NameNotLike(String value) {
            addCriterion("subStone1Name not like", value, "subStone1Name");
            return (Criteria) this;
        }

        public Criteria andSubStone1NameIn(List<String> values) {
            addCriterion("subStone1Name in", values, "subStone1Name");
            return (Criteria) this;
        }

        public Criteria andSubStone1NameNotIn(List<String> values) {
            addCriterion("subStone1Name not in", values, "subStone1Name");
            return (Criteria) this;
        }

        public Criteria andSubStone1NameBetween(String value1, String value2) {
            addCriterion("subStone1Name between", value1, value2, "subStone1Name");
            return (Criteria) this;
        }

        public Criteria andSubStone1NameNotBetween(String value1, String value2) {
            addCriterion("subStone1Name not between", value1, value2, "subStone1Name");
            return (Criteria) this;
        }

        public Criteria andSubStone1NoIsNull() {
            addCriterion("subStone1No is null");
            return (Criteria) this;
        }

        public Criteria andSubStone1NoIsNotNull() {
            addCriterion("subStone1No is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone1NoEqualTo(String value) {
            addCriterion("subStone1No =", value, "subStone1No");
            return (Criteria) this;
        }

        public Criteria andSubStone1NoNotEqualTo(String value) {
            addCriterion("subStone1No <>", value, "subStone1No");
            return (Criteria) this;
        }

        public Criteria andSubStone1NoGreaterThan(String value) {
            addCriterion("subStone1No >", value, "subStone1No");
            return (Criteria) this;
        }

        public Criteria andSubStone1NoGreaterThanOrEqualTo(String value) {
            addCriterion("subStone1No >=", value, "subStone1No");
            return (Criteria) this;
        }

        public Criteria andSubStone1NoLessThan(String value) {
            addCriterion("subStone1No <", value, "subStone1No");
            return (Criteria) this;
        }

        public Criteria andSubStone1NoLessThanOrEqualTo(String value) {
            addCriterion("subStone1No <=", value, "subStone1No");
            return (Criteria) this;
        }

        public Criteria andSubStone1NoLike(String value) {
            addCriterion("subStone1No like", value, "subStone1No");
            return (Criteria) this;
        }

        public Criteria andSubStone1NoNotLike(String value) {
            addCriterion("subStone1No not like", value, "subStone1No");
            return (Criteria) this;
        }

        public Criteria andSubStone1NoIn(List<String> values) {
            addCriterion("subStone1No in", values, "subStone1No");
            return (Criteria) this;
        }

        public Criteria andSubStone1NoNotIn(List<String> values) {
            addCriterion("subStone1No not in", values, "subStone1No");
            return (Criteria) this;
        }

        public Criteria andSubStone1NoBetween(String value1, String value2) {
            addCriterion("subStone1No between", value1, value2, "subStone1No");
            return (Criteria) this;
        }

        public Criteria andSubStone1NoNotBetween(String value1, String value2) {
            addCriterion("subStone1No not between", value1, value2, "subStone1No");
            return (Criteria) this;
        }

        public Criteria andSubStone1SpecifiIsNull() {
            addCriterion("subStone1Specifi is null");
            return (Criteria) this;
        }

        public Criteria andSubStone1SpecifiIsNotNull() {
            addCriterion("subStone1Specifi is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone1SpecifiEqualTo(String value) {
            addCriterion("subStone1Specifi =", value, "subStone1Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone1SpecifiNotEqualTo(String value) {
            addCriterion("subStone1Specifi <>", value, "subStone1Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone1SpecifiGreaterThan(String value) {
            addCriterion("subStone1Specifi >", value, "subStone1Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone1SpecifiGreaterThanOrEqualTo(String value) {
            addCriterion("subStone1Specifi >=", value, "subStone1Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone1SpecifiLessThan(String value) {
            addCriterion("subStone1Specifi <", value, "subStone1Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone1SpecifiLessThanOrEqualTo(String value) {
            addCriterion("subStone1Specifi <=", value, "subStone1Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone1SpecifiLike(String value) {
            addCriterion("subStone1Specifi like", value, "subStone1Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone1SpecifiNotLike(String value) {
            addCriterion("subStone1Specifi not like", value, "subStone1Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone1SpecifiIn(List<String> values) {
            addCriterion("subStone1Specifi in", values, "subStone1Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone1SpecifiNotIn(List<String> values) {
            addCriterion("subStone1Specifi not in", values, "subStone1Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone1SpecifiBetween(String value1, String value2) {
            addCriterion("subStone1Specifi between", value1, value2, "subStone1Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone1SpecifiNotBetween(String value1, String value2) {
            addCriterion("subStone1Specifi not between", value1, value2, "subStone1Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone1NumIsNull() {
            addCriterion("subStone1Num is null");
            return (Criteria) this;
        }

        public Criteria andSubStone1NumIsNotNull() {
            addCriterion("subStone1Num is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone1NumEqualTo(Integer value) {
            addCriterion("subStone1Num =", value, "subStone1Num");
            return (Criteria) this;
        }

        public Criteria andSubStone1NumNotEqualTo(Integer value) {
            addCriterion("subStone1Num <>", value, "subStone1Num");
            return (Criteria) this;
        }

        public Criteria andSubStone1NumGreaterThan(Integer value) {
            addCriterion("subStone1Num >", value, "subStone1Num");
            return (Criteria) this;
        }

        public Criteria andSubStone1NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("subStone1Num >=", value, "subStone1Num");
            return (Criteria) this;
        }

        public Criteria andSubStone1NumLessThan(Integer value) {
            addCriterion("subStone1Num <", value, "subStone1Num");
            return (Criteria) this;
        }

        public Criteria andSubStone1NumLessThanOrEqualTo(Integer value) {
            addCriterion("subStone1Num <=", value, "subStone1Num");
            return (Criteria) this;
        }

        public Criteria andSubStone1NumIn(List<Integer> values) {
            addCriterion("subStone1Num in", values, "subStone1Num");
            return (Criteria) this;
        }

        public Criteria andSubStone1NumNotIn(List<Integer> values) {
            addCriterion("subStone1Num not in", values, "subStone1Num");
            return (Criteria) this;
        }

        public Criteria andSubStone1NumBetween(Integer value1, Integer value2) {
            addCriterion("subStone1Num between", value1, value2, "subStone1Num");
            return (Criteria) this;
        }

        public Criteria andSubStone1NumNotBetween(Integer value1, Integer value2) {
            addCriterion("subStone1Num not between", value1, value2, "subStone1Num");
            return (Criteria) this;
        }

        public Criteria andSubStone1WeightIsNull() {
            addCriterion("subStone1Weight is null");
            return (Criteria) this;
        }

        public Criteria andSubStone1WeightIsNotNull() {
            addCriterion("subStone1Weight is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone1WeightEqualTo(Double value) {
            addCriterion("subStone1Weight =", value, "subStone1Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone1WeightNotEqualTo(Double value) {
            addCriterion("subStone1Weight <>", value, "subStone1Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone1WeightGreaterThan(Double value) {
            addCriterion("subStone1Weight >", value, "subStone1Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone1WeightGreaterThanOrEqualTo(Double value) {
            addCriterion("subStone1Weight >=", value, "subStone1Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone1WeightLessThan(Double value) {
            addCriterion("subStone1Weight <", value, "subStone1Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone1WeightLessThanOrEqualTo(Double value) {
            addCriterion("subStone1Weight <=", value, "subStone1Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone1WeightIn(List<Double> values) {
            addCriterion("subStone1Weight in", values, "subStone1Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone1WeightNotIn(List<Double> values) {
            addCriterion("subStone1Weight not in", values, "subStone1Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone1WeightBetween(Double value1, Double value2) {
            addCriterion("subStone1Weight between", value1, value2, "subStone1Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone1WeightNotBetween(Double value1, Double value2) {
            addCriterion("subStone1Weight not between", value1, value2, "subStone1Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone1PriceIsNull() {
            addCriterion("subStone1Price is null");
            return (Criteria) this;
        }

        public Criteria andSubStone1PriceIsNotNull() {
            addCriterion("subStone1Price is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone1PriceEqualTo(Double value) {
            addCriterion("subStone1Price =", value, "subStone1Price");
            return (Criteria) this;
        }

        public Criteria andSubStone1PriceNotEqualTo(Double value) {
            addCriterion("subStone1Price <>", value, "subStone1Price");
            return (Criteria) this;
        }

        public Criteria andSubStone1PriceGreaterThan(Double value) {
            addCriterion("subStone1Price >", value, "subStone1Price");
            return (Criteria) this;
        }

        public Criteria andSubStone1PriceGreaterThanOrEqualTo(Double value) {
            addCriterion("subStone1Price >=", value, "subStone1Price");
            return (Criteria) this;
        }

        public Criteria andSubStone1PriceLessThan(Double value) {
            addCriterion("subStone1Price <", value, "subStone1Price");
            return (Criteria) this;
        }

        public Criteria andSubStone1PriceLessThanOrEqualTo(Double value) {
            addCriterion("subStone1Price <=", value, "subStone1Price");
            return (Criteria) this;
        }

        public Criteria andSubStone1PriceIn(List<Double> values) {
            addCriterion("subStone1Price in", values, "subStone1Price");
            return (Criteria) this;
        }

        public Criteria andSubStone1PriceNotIn(List<Double> values) {
            addCriterion("subStone1Price not in", values, "subStone1Price");
            return (Criteria) this;
        }

        public Criteria andSubStone1PriceBetween(Double value1, Double value2) {
            addCriterion("subStone1Price between", value1, value2, "subStone1Price");
            return (Criteria) this;
        }

        public Criteria andSubStone1PriceNotBetween(Double value1, Double value2) {
            addCriterion("subStone1Price not between", value1, value2, "subStone1Price");
            return (Criteria) this;
        }

        public Criteria andSubStone1MoneyIsNull() {
            addCriterion("subStone1Money is null");
            return (Criteria) this;
        }

        public Criteria andSubStone1MoneyIsNotNull() {
            addCriterion("subStone1Money is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone1MoneyEqualTo(Double value) {
            addCriterion("subStone1Money =", value, "subStone1Money");
            return (Criteria) this;
        }

        public Criteria andSubStone1MoneyNotEqualTo(Double value) {
            addCriterion("subStone1Money <>", value, "subStone1Money");
            return (Criteria) this;
        }

        public Criteria andSubStone1MoneyGreaterThan(Double value) {
            addCriterion("subStone1Money >", value, "subStone1Money");
            return (Criteria) this;
        }

        public Criteria andSubStone1MoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("subStone1Money >=", value, "subStone1Money");
            return (Criteria) this;
        }

        public Criteria andSubStone1MoneyLessThan(Double value) {
            addCriterion("subStone1Money <", value, "subStone1Money");
            return (Criteria) this;
        }

        public Criteria andSubStone1MoneyLessThanOrEqualTo(Double value) {
            addCriterion("subStone1Money <=", value, "subStone1Money");
            return (Criteria) this;
        }

        public Criteria andSubStone1MoneyIn(List<Double> values) {
            addCriterion("subStone1Money in", values, "subStone1Money");
            return (Criteria) this;
        }

        public Criteria andSubStone1MoneyNotIn(List<Double> values) {
            addCriterion("subStone1Money not in", values, "subStone1Money");
            return (Criteria) this;
        }

        public Criteria andSubStone1MoneyBetween(Double value1, Double value2) {
            addCriterion("subStone1Money between", value1, value2, "subStone1Money");
            return (Criteria) this;
        }

        public Criteria andSubStone1MoneyNotBetween(Double value1, Double value2) {
            addCriterion("subStone1Money not between", value1, value2, "subStone1Money");
            return (Criteria) this;
        }

        public Criteria andSubStone2NameIsNull() {
            addCriterion("subStone2Name is null");
            return (Criteria) this;
        }

        public Criteria andSubStone2NameIsNotNull() {
            addCriterion("subStone2Name is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone2NameEqualTo(String value) {
            addCriterion("subStone2Name =", value, "subStone2Name");
            return (Criteria) this;
        }

        public Criteria andSubStone2NameNotEqualTo(String value) {
            addCriterion("subStone2Name <>", value, "subStone2Name");
            return (Criteria) this;
        }

        public Criteria andSubStone2NameGreaterThan(String value) {
            addCriterion("subStone2Name >", value, "subStone2Name");
            return (Criteria) this;
        }

        public Criteria andSubStone2NameGreaterThanOrEqualTo(String value) {
            addCriterion("subStone2Name >=", value, "subStone2Name");
            return (Criteria) this;
        }

        public Criteria andSubStone2NameLessThan(String value) {
            addCriterion("subStone2Name <", value, "subStone2Name");
            return (Criteria) this;
        }

        public Criteria andSubStone2NameLessThanOrEqualTo(String value) {
            addCriterion("subStone2Name <=", value, "subStone2Name");
            return (Criteria) this;
        }

        public Criteria andSubStone2NameLike(String value) {
            addCriterion("subStone2Name like", value, "subStone2Name");
            return (Criteria) this;
        }

        public Criteria andSubStone2NameNotLike(String value) {
            addCriterion("subStone2Name not like", value, "subStone2Name");
            return (Criteria) this;
        }

        public Criteria andSubStone2NameIn(List<String> values) {
            addCriterion("subStone2Name in", values, "subStone2Name");
            return (Criteria) this;
        }

        public Criteria andSubStone2NameNotIn(List<String> values) {
            addCriterion("subStone2Name not in", values, "subStone2Name");
            return (Criteria) this;
        }

        public Criteria andSubStone2NameBetween(String value1, String value2) {
            addCriterion("subStone2Name between", value1, value2, "subStone2Name");
            return (Criteria) this;
        }

        public Criteria andSubStone2NameNotBetween(String value1, String value2) {
            addCriterion("subStone2Name not between", value1, value2, "subStone2Name");
            return (Criteria) this;
        }

        public Criteria andSubStone2NoIsNull() {
            addCriterion("subStone2No is null");
            return (Criteria) this;
        }

        public Criteria andSubStone2NoIsNotNull() {
            addCriterion("subStone2No is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone2NoEqualTo(String value) {
            addCriterion("subStone2No =", value, "subStone2No");
            return (Criteria) this;
        }

        public Criteria andSubStone2NoNotEqualTo(String value) {
            addCriterion("subStone2No <>", value, "subStone2No");
            return (Criteria) this;
        }

        public Criteria andSubStone2NoGreaterThan(String value) {
            addCriterion("subStone2No >", value, "subStone2No");
            return (Criteria) this;
        }

        public Criteria andSubStone2NoGreaterThanOrEqualTo(String value) {
            addCriterion("subStone2No >=", value, "subStone2No");
            return (Criteria) this;
        }

        public Criteria andSubStone2NoLessThan(String value) {
            addCriterion("subStone2No <", value, "subStone2No");
            return (Criteria) this;
        }

        public Criteria andSubStone2NoLessThanOrEqualTo(String value) {
            addCriterion("subStone2No <=", value, "subStone2No");
            return (Criteria) this;
        }

        public Criteria andSubStone2NoLike(String value) {
            addCriterion("subStone2No like", value, "subStone2No");
            return (Criteria) this;
        }

        public Criteria andSubStone2NoNotLike(String value) {
            addCriterion("subStone2No not like", value, "subStone2No");
            return (Criteria) this;
        }

        public Criteria andSubStone2NoIn(List<String> values) {
            addCriterion("subStone2No in", values, "subStone2No");
            return (Criteria) this;
        }

        public Criteria andSubStone2NoNotIn(List<String> values) {
            addCriterion("subStone2No not in", values, "subStone2No");
            return (Criteria) this;
        }

        public Criteria andSubStone2NoBetween(String value1, String value2) {
            addCriterion("subStone2No between", value1, value2, "subStone2No");
            return (Criteria) this;
        }

        public Criteria andSubStone2NoNotBetween(String value1, String value2) {
            addCriterion("subStone2No not between", value1, value2, "subStone2No");
            return (Criteria) this;
        }

        public Criteria andSubStone2SpecifiIsNull() {
            addCriterion("subStone2Specifi is null");
            return (Criteria) this;
        }

        public Criteria andSubStone2SpecifiIsNotNull() {
            addCriterion("subStone2Specifi is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone2SpecifiEqualTo(String value) {
            addCriterion("subStone2Specifi =", value, "subStone2Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone2SpecifiNotEqualTo(String value) {
            addCriterion("subStone2Specifi <>", value, "subStone2Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone2SpecifiGreaterThan(String value) {
            addCriterion("subStone2Specifi >", value, "subStone2Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone2SpecifiGreaterThanOrEqualTo(String value) {
            addCriterion("subStone2Specifi >=", value, "subStone2Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone2SpecifiLessThan(String value) {
            addCriterion("subStone2Specifi <", value, "subStone2Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone2SpecifiLessThanOrEqualTo(String value) {
            addCriterion("subStone2Specifi <=", value, "subStone2Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone2SpecifiLike(String value) {
            addCriterion("subStone2Specifi like", value, "subStone2Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone2SpecifiNotLike(String value) {
            addCriterion("subStone2Specifi not like", value, "subStone2Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone2SpecifiIn(List<String> values) {
            addCriterion("subStone2Specifi in", values, "subStone2Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone2SpecifiNotIn(List<String> values) {
            addCriterion("subStone2Specifi not in", values, "subStone2Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone2SpecifiBetween(String value1, String value2) {
            addCriterion("subStone2Specifi between", value1, value2, "subStone2Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone2SpecifiNotBetween(String value1, String value2) {
            addCriterion("subStone2Specifi not between", value1, value2, "subStone2Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone2NumIsNull() {
            addCriterion("subStone2Num is null");
            return (Criteria) this;
        }

        public Criteria andSubStone2NumIsNotNull() {
            addCriterion("subStone2Num is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone2NumEqualTo(Integer value) {
            addCriterion("subStone2Num =", value, "subStone2Num");
            return (Criteria) this;
        }

        public Criteria andSubStone2NumNotEqualTo(Integer value) {
            addCriterion("subStone2Num <>", value, "subStone2Num");
            return (Criteria) this;
        }

        public Criteria andSubStone2NumGreaterThan(Integer value) {
            addCriterion("subStone2Num >", value, "subStone2Num");
            return (Criteria) this;
        }

        public Criteria andSubStone2NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("subStone2Num >=", value, "subStone2Num");
            return (Criteria) this;
        }

        public Criteria andSubStone2NumLessThan(Integer value) {
            addCriterion("subStone2Num <", value, "subStone2Num");
            return (Criteria) this;
        }

        public Criteria andSubStone2NumLessThanOrEqualTo(Integer value) {
            addCriterion("subStone2Num <=", value, "subStone2Num");
            return (Criteria) this;
        }

        public Criteria andSubStone2NumIn(List<Integer> values) {
            addCriterion("subStone2Num in", values, "subStone2Num");
            return (Criteria) this;
        }

        public Criteria andSubStone2NumNotIn(List<Integer> values) {
            addCriterion("subStone2Num not in", values, "subStone2Num");
            return (Criteria) this;
        }

        public Criteria andSubStone2NumBetween(Integer value1, Integer value2) {
            addCriterion("subStone2Num between", value1, value2, "subStone2Num");
            return (Criteria) this;
        }

        public Criteria andSubStone2NumNotBetween(Integer value1, Integer value2) {
            addCriterion("subStone2Num not between", value1, value2, "subStone2Num");
            return (Criteria) this;
        }

        public Criteria andSubStone2WeightIsNull() {
            addCriterion("subStone2Weight is null");
            return (Criteria) this;
        }

        public Criteria andSubStone2WeightIsNotNull() {
            addCriterion("subStone2Weight is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone2WeightEqualTo(Double value) {
            addCriterion("subStone2Weight =", value, "subStone2Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone2WeightNotEqualTo(Double value) {
            addCriterion("subStone2Weight <>", value, "subStone2Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone2WeightGreaterThan(Double value) {
            addCriterion("subStone2Weight >", value, "subStone2Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone2WeightGreaterThanOrEqualTo(Double value) {
            addCriterion("subStone2Weight >=", value, "subStone2Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone2WeightLessThan(Double value) {
            addCriterion("subStone2Weight <", value, "subStone2Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone2WeightLessThanOrEqualTo(Double value) {
            addCriterion("subStone2Weight <=", value, "subStone2Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone2WeightIn(List<Double> values) {
            addCriterion("subStone2Weight in", values, "subStone2Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone2WeightNotIn(List<Double> values) {
            addCriterion("subStone2Weight not in", values, "subStone2Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone2WeightBetween(Double value1, Double value2) {
            addCriterion("subStone2Weight between", value1, value2, "subStone2Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone2WeightNotBetween(Double value1, Double value2) {
            addCriterion("subStone2Weight not between", value1, value2, "subStone2Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone2PriceIsNull() {
            addCriterion("subStone2Price is null");
            return (Criteria) this;
        }

        public Criteria andSubStone2PriceIsNotNull() {
            addCriterion("subStone2Price is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone2PriceEqualTo(Double value) {
            addCriterion("subStone2Price =", value, "subStone2Price");
            return (Criteria) this;
        }

        public Criteria andSubStone2PriceNotEqualTo(Double value) {
            addCriterion("subStone2Price <>", value, "subStone2Price");
            return (Criteria) this;
        }

        public Criteria andSubStone2PriceGreaterThan(Double value) {
            addCriterion("subStone2Price >", value, "subStone2Price");
            return (Criteria) this;
        }

        public Criteria andSubStone2PriceGreaterThanOrEqualTo(Double value) {
            addCriterion("subStone2Price >=", value, "subStone2Price");
            return (Criteria) this;
        }

        public Criteria andSubStone2PriceLessThan(Double value) {
            addCriterion("subStone2Price <", value, "subStone2Price");
            return (Criteria) this;
        }

        public Criteria andSubStone2PriceLessThanOrEqualTo(Double value) {
            addCriterion("subStone2Price <=", value, "subStone2Price");
            return (Criteria) this;
        }

        public Criteria andSubStone2PriceIn(List<Double> values) {
            addCriterion("subStone2Price in", values, "subStone2Price");
            return (Criteria) this;
        }

        public Criteria andSubStone2PriceNotIn(List<Double> values) {
            addCriterion("subStone2Price not in", values, "subStone2Price");
            return (Criteria) this;
        }

        public Criteria andSubStone2PriceBetween(Double value1, Double value2) {
            addCriterion("subStone2Price between", value1, value2, "subStone2Price");
            return (Criteria) this;
        }

        public Criteria andSubStone2PriceNotBetween(Double value1, Double value2) {
            addCriterion("subStone2Price not between", value1, value2, "subStone2Price");
            return (Criteria) this;
        }

        public Criteria andSubStone2MoneyIsNull() {
            addCriterion("subStone2Money is null");
            return (Criteria) this;
        }

        public Criteria andSubStone2MoneyIsNotNull() {
            addCriterion("subStone2Money is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone2MoneyEqualTo(Double value) {
            addCriterion("subStone2Money =", value, "subStone2Money");
            return (Criteria) this;
        }

        public Criteria andSubStone2MoneyNotEqualTo(Double value) {
            addCriterion("subStone2Money <>", value, "subStone2Money");
            return (Criteria) this;
        }

        public Criteria andSubStone2MoneyGreaterThan(Double value) {
            addCriterion("subStone2Money >", value, "subStone2Money");
            return (Criteria) this;
        }

        public Criteria andSubStone2MoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("subStone2Money >=", value, "subStone2Money");
            return (Criteria) this;
        }

        public Criteria andSubStone2MoneyLessThan(Double value) {
            addCriterion("subStone2Money <", value, "subStone2Money");
            return (Criteria) this;
        }

        public Criteria andSubStone2MoneyLessThanOrEqualTo(Double value) {
            addCriterion("subStone2Money <=", value, "subStone2Money");
            return (Criteria) this;
        }

        public Criteria andSubStone2MoneyIn(List<Double> values) {
            addCriterion("subStone2Money in", values, "subStone2Money");
            return (Criteria) this;
        }

        public Criteria andSubStone2MoneyNotIn(List<Double> values) {
            addCriterion("subStone2Money not in", values, "subStone2Money");
            return (Criteria) this;
        }

        public Criteria andSubStone2MoneyBetween(Double value1, Double value2) {
            addCriterion("subStone2Money between", value1, value2, "subStone2Money");
            return (Criteria) this;
        }

        public Criteria andSubStone2MoneyNotBetween(Double value1, Double value2) {
            addCriterion("subStone2Money not between", value1, value2, "subStone2Money");
            return (Criteria) this;
        }

        public Criteria andSubStone3NameIsNull() {
            addCriterion("subStone3Name is null");
            return (Criteria) this;
        }

        public Criteria andSubStone3NameIsNotNull() {
            addCriterion("subStone3Name is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone3NameEqualTo(String value) {
            addCriterion("subStone3Name =", value, "subStone3Name");
            return (Criteria) this;
        }

        public Criteria andSubStone3NameNotEqualTo(String value) {
            addCriterion("subStone3Name <>", value, "subStone3Name");
            return (Criteria) this;
        }

        public Criteria andSubStone3NameGreaterThan(String value) {
            addCriterion("subStone3Name >", value, "subStone3Name");
            return (Criteria) this;
        }

        public Criteria andSubStone3NameGreaterThanOrEqualTo(String value) {
            addCriterion("subStone3Name >=", value, "subStone3Name");
            return (Criteria) this;
        }

        public Criteria andSubStone3NameLessThan(String value) {
            addCriterion("subStone3Name <", value, "subStone3Name");
            return (Criteria) this;
        }

        public Criteria andSubStone3NameLessThanOrEqualTo(String value) {
            addCriterion("subStone3Name <=", value, "subStone3Name");
            return (Criteria) this;
        }

        public Criteria andSubStone3NameLike(String value) {
            addCriterion("subStone3Name like", value, "subStone3Name");
            return (Criteria) this;
        }

        public Criteria andSubStone3NameNotLike(String value) {
            addCriterion("subStone3Name not like", value, "subStone3Name");
            return (Criteria) this;
        }

        public Criteria andSubStone3NameIn(List<String> values) {
            addCriterion("subStone3Name in", values, "subStone3Name");
            return (Criteria) this;
        }

        public Criteria andSubStone3NameNotIn(List<String> values) {
            addCriterion("subStone3Name not in", values, "subStone3Name");
            return (Criteria) this;
        }

        public Criteria andSubStone3NameBetween(String value1, String value2) {
            addCriterion("subStone3Name between", value1, value2, "subStone3Name");
            return (Criteria) this;
        }

        public Criteria andSubStone3NameNotBetween(String value1, String value2) {
            addCriterion("subStone3Name not between", value1, value2, "subStone3Name");
            return (Criteria) this;
        }

        public Criteria andSubStone3NoIsNull() {
            addCriterion("subStone3No is null");
            return (Criteria) this;
        }

        public Criteria andSubStone3NoIsNotNull() {
            addCriterion("subStone3No is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone3NoEqualTo(String value) {
            addCriterion("subStone3No =", value, "subStone3No");
            return (Criteria) this;
        }

        public Criteria andSubStone3NoNotEqualTo(String value) {
            addCriterion("subStone3No <>", value, "subStone3No");
            return (Criteria) this;
        }

        public Criteria andSubStone3NoGreaterThan(String value) {
            addCriterion("subStone3No >", value, "subStone3No");
            return (Criteria) this;
        }

        public Criteria andSubStone3NoGreaterThanOrEqualTo(String value) {
            addCriterion("subStone3No >=", value, "subStone3No");
            return (Criteria) this;
        }

        public Criteria andSubStone3NoLessThan(String value) {
            addCriterion("subStone3No <", value, "subStone3No");
            return (Criteria) this;
        }

        public Criteria andSubStone3NoLessThanOrEqualTo(String value) {
            addCriterion("subStone3No <=", value, "subStone3No");
            return (Criteria) this;
        }

        public Criteria andSubStone3NoLike(String value) {
            addCriterion("subStone3No like", value, "subStone3No");
            return (Criteria) this;
        }

        public Criteria andSubStone3NoNotLike(String value) {
            addCriterion("subStone3No not like", value, "subStone3No");
            return (Criteria) this;
        }

        public Criteria andSubStone3NoIn(List<String> values) {
            addCriterion("subStone3No in", values, "subStone3No");
            return (Criteria) this;
        }

        public Criteria andSubStone3NoNotIn(List<String> values) {
            addCriterion("subStone3No not in", values, "subStone3No");
            return (Criteria) this;
        }

        public Criteria andSubStone3NoBetween(String value1, String value2) {
            addCriterion("subStone3No between", value1, value2, "subStone3No");
            return (Criteria) this;
        }

        public Criteria andSubStone3NoNotBetween(String value1, String value2) {
            addCriterion("subStone3No not between", value1, value2, "subStone3No");
            return (Criteria) this;
        }

        public Criteria andSubStone3SpecifiIsNull() {
            addCriterion("subStone3Specifi is null");
            return (Criteria) this;
        }

        public Criteria andSubStone3SpecifiIsNotNull() {
            addCriterion("subStone3Specifi is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone3SpecifiEqualTo(String value) {
            addCriterion("subStone3Specifi =", value, "subStone3Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone3SpecifiNotEqualTo(String value) {
            addCriterion("subStone3Specifi <>", value, "subStone3Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone3SpecifiGreaterThan(String value) {
            addCriterion("subStone3Specifi >", value, "subStone3Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone3SpecifiGreaterThanOrEqualTo(String value) {
            addCriterion("subStone3Specifi >=", value, "subStone3Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone3SpecifiLessThan(String value) {
            addCriterion("subStone3Specifi <", value, "subStone3Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone3SpecifiLessThanOrEqualTo(String value) {
            addCriterion("subStone3Specifi <=", value, "subStone3Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone3SpecifiLike(String value) {
            addCriterion("subStone3Specifi like", value, "subStone3Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone3SpecifiNotLike(String value) {
            addCriterion("subStone3Specifi not like", value, "subStone3Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone3SpecifiIn(List<String> values) {
            addCriterion("subStone3Specifi in", values, "subStone3Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone3SpecifiNotIn(List<String> values) {
            addCriterion("subStone3Specifi not in", values, "subStone3Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone3SpecifiBetween(String value1, String value2) {
            addCriterion("subStone3Specifi between", value1, value2, "subStone3Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone3SpecifiNotBetween(String value1, String value2) {
            addCriterion("subStone3Specifi not between", value1, value2, "subStone3Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone3NumIsNull() {
            addCriterion("subStone3Num is null");
            return (Criteria) this;
        }

        public Criteria andSubStone3NumIsNotNull() {
            addCriterion("subStone3Num is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone3NumEqualTo(Integer value) {
            addCriterion("subStone3Num =", value, "subStone3Num");
            return (Criteria) this;
        }

        public Criteria andSubStone3NumNotEqualTo(Integer value) {
            addCriterion("subStone3Num <>", value, "subStone3Num");
            return (Criteria) this;
        }

        public Criteria andSubStone3NumGreaterThan(Integer value) {
            addCriterion("subStone3Num >", value, "subStone3Num");
            return (Criteria) this;
        }

        public Criteria andSubStone3NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("subStone3Num >=", value, "subStone3Num");
            return (Criteria) this;
        }

        public Criteria andSubStone3NumLessThan(Integer value) {
            addCriterion("subStone3Num <", value, "subStone3Num");
            return (Criteria) this;
        }

        public Criteria andSubStone3NumLessThanOrEqualTo(Integer value) {
            addCriterion("subStone3Num <=", value, "subStone3Num");
            return (Criteria) this;
        }

        public Criteria andSubStone3NumIn(List<Integer> values) {
            addCriterion("subStone3Num in", values, "subStone3Num");
            return (Criteria) this;
        }

        public Criteria andSubStone3NumNotIn(List<Integer> values) {
            addCriterion("subStone3Num not in", values, "subStone3Num");
            return (Criteria) this;
        }

        public Criteria andSubStone3NumBetween(Integer value1, Integer value2) {
            addCriterion("subStone3Num between", value1, value2, "subStone3Num");
            return (Criteria) this;
        }

        public Criteria andSubStone3NumNotBetween(Integer value1, Integer value2) {
            addCriterion("subStone3Num not between", value1, value2, "subStone3Num");
            return (Criteria) this;
        }

        public Criteria andSubStone3WeightIsNull() {
            addCriterion("subStone3Weight is null");
            return (Criteria) this;
        }

        public Criteria andSubStone3WeightIsNotNull() {
            addCriterion("subStone3Weight is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone3WeightEqualTo(Double value) {
            addCriterion("subStone3Weight =", value, "subStone3Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone3WeightNotEqualTo(Double value) {
            addCriterion("subStone3Weight <>", value, "subStone3Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone3WeightGreaterThan(Double value) {
            addCriterion("subStone3Weight >", value, "subStone3Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone3WeightGreaterThanOrEqualTo(Double value) {
            addCriterion("subStone3Weight >=", value, "subStone3Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone3WeightLessThan(Double value) {
            addCriterion("subStone3Weight <", value, "subStone3Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone3WeightLessThanOrEqualTo(Double value) {
            addCriterion("subStone3Weight <=", value, "subStone3Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone3WeightIn(List<Double> values) {
            addCriterion("subStone3Weight in", values, "subStone3Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone3WeightNotIn(List<Double> values) {
            addCriterion("subStone3Weight not in", values, "subStone3Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone3WeightBetween(Double value1, Double value2) {
            addCriterion("subStone3Weight between", value1, value2, "subStone3Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone3WeightNotBetween(Double value1, Double value2) {
            addCriterion("subStone3Weight not between", value1, value2, "subStone3Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone3PriceIsNull() {
            addCriterion("subStone3Price is null");
            return (Criteria) this;
        }

        public Criteria andSubStone3PriceIsNotNull() {
            addCriterion("subStone3Price is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone3PriceEqualTo(Double value) {
            addCriterion("subStone3Price =", value, "subStone3Price");
            return (Criteria) this;
        }

        public Criteria andSubStone3PriceNotEqualTo(Double value) {
            addCriterion("subStone3Price <>", value, "subStone3Price");
            return (Criteria) this;
        }

        public Criteria andSubStone3PriceGreaterThan(Double value) {
            addCriterion("subStone3Price >", value, "subStone3Price");
            return (Criteria) this;
        }

        public Criteria andSubStone3PriceGreaterThanOrEqualTo(Double value) {
            addCriterion("subStone3Price >=", value, "subStone3Price");
            return (Criteria) this;
        }

        public Criteria andSubStone3PriceLessThan(Double value) {
            addCriterion("subStone3Price <", value, "subStone3Price");
            return (Criteria) this;
        }

        public Criteria andSubStone3PriceLessThanOrEqualTo(Double value) {
            addCriterion("subStone3Price <=", value, "subStone3Price");
            return (Criteria) this;
        }

        public Criteria andSubStone3PriceIn(List<Double> values) {
            addCriterion("subStone3Price in", values, "subStone3Price");
            return (Criteria) this;
        }

        public Criteria andSubStone3PriceNotIn(List<Double> values) {
            addCriterion("subStone3Price not in", values, "subStone3Price");
            return (Criteria) this;
        }

        public Criteria andSubStone3PriceBetween(Double value1, Double value2) {
            addCriterion("subStone3Price between", value1, value2, "subStone3Price");
            return (Criteria) this;
        }

        public Criteria andSubStone3PriceNotBetween(Double value1, Double value2) {
            addCriterion("subStone3Price not between", value1, value2, "subStone3Price");
            return (Criteria) this;
        }

        public Criteria andSubStone3MoneyIsNull() {
            addCriterion("subStone3Money is null");
            return (Criteria) this;
        }

        public Criteria andSubStone3MoneyIsNotNull() {
            addCriterion("subStone3Money is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone3MoneyEqualTo(Double value) {
            addCriterion("subStone3Money =", value, "subStone3Money");
            return (Criteria) this;
        }

        public Criteria andSubStone3MoneyNotEqualTo(Double value) {
            addCriterion("subStone3Money <>", value, "subStone3Money");
            return (Criteria) this;
        }

        public Criteria andSubStone3MoneyGreaterThan(Double value) {
            addCriterion("subStone3Money >", value, "subStone3Money");
            return (Criteria) this;
        }

        public Criteria andSubStone3MoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("subStone3Money >=", value, "subStone3Money");
            return (Criteria) this;
        }

        public Criteria andSubStone3MoneyLessThan(Double value) {
            addCriterion("subStone3Money <", value, "subStone3Money");
            return (Criteria) this;
        }

        public Criteria andSubStone3MoneyLessThanOrEqualTo(Double value) {
            addCriterion("subStone3Money <=", value, "subStone3Money");
            return (Criteria) this;
        }

        public Criteria andSubStone3MoneyIn(List<Double> values) {
            addCriterion("subStone3Money in", values, "subStone3Money");
            return (Criteria) this;
        }

        public Criteria andSubStone3MoneyNotIn(List<Double> values) {
            addCriterion("subStone3Money not in", values, "subStone3Money");
            return (Criteria) this;
        }

        public Criteria andSubStone3MoneyBetween(Double value1, Double value2) {
            addCriterion("subStone3Money between", value1, value2, "subStone3Money");
            return (Criteria) this;
        }

        public Criteria andSubStone3MoneyNotBetween(Double value1, Double value2) {
            addCriterion("subStone3Money not between", value1, value2, "subStone3Money");
            return (Criteria) this;
        }

        public Criteria andSubStone4NameIsNull() {
            addCriterion("subStone4Name is null");
            return (Criteria) this;
        }

        public Criteria andSubStone4NameIsNotNull() {
            addCriterion("subStone4Name is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone4NameEqualTo(String value) {
            addCriterion("subStone4Name =", value, "subStone4Name");
            return (Criteria) this;
        }

        public Criteria andSubStone4NameNotEqualTo(String value) {
            addCriterion("subStone4Name <>", value, "subStone4Name");
            return (Criteria) this;
        }

        public Criteria andSubStone4NameGreaterThan(String value) {
            addCriterion("subStone4Name >", value, "subStone4Name");
            return (Criteria) this;
        }

        public Criteria andSubStone4NameGreaterThanOrEqualTo(String value) {
            addCriterion("subStone4Name >=", value, "subStone4Name");
            return (Criteria) this;
        }

        public Criteria andSubStone4NameLessThan(String value) {
            addCriterion("subStone4Name <", value, "subStone4Name");
            return (Criteria) this;
        }

        public Criteria andSubStone4NameLessThanOrEqualTo(String value) {
            addCriterion("subStone4Name <=", value, "subStone4Name");
            return (Criteria) this;
        }

        public Criteria andSubStone4NameLike(String value) {
            addCriterion("subStone4Name like", value, "subStone4Name");
            return (Criteria) this;
        }

        public Criteria andSubStone4NameNotLike(String value) {
            addCriterion("subStone4Name not like", value, "subStone4Name");
            return (Criteria) this;
        }

        public Criteria andSubStone4NameIn(List<String> values) {
            addCriterion("subStone4Name in", values, "subStone4Name");
            return (Criteria) this;
        }

        public Criteria andSubStone4NameNotIn(List<String> values) {
            addCriterion("subStone4Name not in", values, "subStone4Name");
            return (Criteria) this;
        }

        public Criteria andSubStone4NameBetween(String value1, String value2) {
            addCriterion("subStone4Name between", value1, value2, "subStone4Name");
            return (Criteria) this;
        }

        public Criteria andSubStone4NameNotBetween(String value1, String value2) {
            addCriterion("subStone4Name not between", value1, value2, "subStone4Name");
            return (Criteria) this;
        }

        public Criteria andSubStone4NoIsNull() {
            addCriterion("subStone4No is null");
            return (Criteria) this;
        }

        public Criteria andSubStone4NoIsNotNull() {
            addCriterion("subStone4No is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone4NoEqualTo(String value) {
            addCriterion("subStone4No =", value, "subStone4No");
            return (Criteria) this;
        }

        public Criteria andSubStone4NoNotEqualTo(String value) {
            addCriterion("subStone4No <>", value, "subStone4No");
            return (Criteria) this;
        }

        public Criteria andSubStone4NoGreaterThan(String value) {
            addCriterion("subStone4No >", value, "subStone4No");
            return (Criteria) this;
        }

        public Criteria andSubStone4NoGreaterThanOrEqualTo(String value) {
            addCriterion("subStone4No >=", value, "subStone4No");
            return (Criteria) this;
        }

        public Criteria andSubStone4NoLessThan(String value) {
            addCriterion("subStone4No <", value, "subStone4No");
            return (Criteria) this;
        }

        public Criteria andSubStone4NoLessThanOrEqualTo(String value) {
            addCriterion("subStone4No <=", value, "subStone4No");
            return (Criteria) this;
        }

        public Criteria andSubStone4NoLike(String value) {
            addCriterion("subStone4No like", value, "subStone4No");
            return (Criteria) this;
        }

        public Criteria andSubStone4NoNotLike(String value) {
            addCriterion("subStone4No not like", value, "subStone4No");
            return (Criteria) this;
        }

        public Criteria andSubStone4NoIn(List<String> values) {
            addCriterion("subStone4No in", values, "subStone4No");
            return (Criteria) this;
        }

        public Criteria andSubStone4NoNotIn(List<String> values) {
            addCriterion("subStone4No not in", values, "subStone4No");
            return (Criteria) this;
        }

        public Criteria andSubStone4NoBetween(String value1, String value2) {
            addCriterion("subStone4No between", value1, value2, "subStone4No");
            return (Criteria) this;
        }

        public Criteria andSubStone4NoNotBetween(String value1, String value2) {
            addCriterion("subStone4No not between", value1, value2, "subStone4No");
            return (Criteria) this;
        }

        public Criteria andSubStone4SpecifiIsNull() {
            addCriterion("subStone4Specifi is null");
            return (Criteria) this;
        }

        public Criteria andSubStone4SpecifiIsNotNull() {
            addCriterion("subStone4Specifi is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone4SpecifiEqualTo(String value) {
            addCriterion("subStone4Specifi =", value, "subStone4Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone4SpecifiNotEqualTo(String value) {
            addCriterion("subStone4Specifi <>", value, "subStone4Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone4SpecifiGreaterThan(String value) {
            addCriterion("subStone4Specifi >", value, "subStone4Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone4SpecifiGreaterThanOrEqualTo(String value) {
            addCriterion("subStone4Specifi >=", value, "subStone4Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone4SpecifiLessThan(String value) {
            addCriterion("subStone4Specifi <", value, "subStone4Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone4SpecifiLessThanOrEqualTo(String value) {
            addCriterion("subStone4Specifi <=", value, "subStone4Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone4SpecifiLike(String value) {
            addCriterion("subStone4Specifi like", value, "subStone4Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone4SpecifiNotLike(String value) {
            addCriterion("subStone4Specifi not like", value, "subStone4Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone4SpecifiIn(List<String> values) {
            addCriterion("subStone4Specifi in", values, "subStone4Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone4SpecifiNotIn(List<String> values) {
            addCriterion("subStone4Specifi not in", values, "subStone4Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone4SpecifiBetween(String value1, String value2) {
            addCriterion("subStone4Specifi between", value1, value2, "subStone4Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone4SpecifiNotBetween(String value1, String value2) {
            addCriterion("subStone4Specifi not between", value1, value2, "subStone4Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone4NumIsNull() {
            addCriterion("subStone4Num is null");
            return (Criteria) this;
        }

        public Criteria andSubStone4NumIsNotNull() {
            addCriterion("subStone4Num is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone4NumEqualTo(Integer value) {
            addCriterion("subStone4Num =", value, "subStone4Num");
            return (Criteria) this;
        }

        public Criteria andSubStone4NumNotEqualTo(Integer value) {
            addCriterion("subStone4Num <>", value, "subStone4Num");
            return (Criteria) this;
        }

        public Criteria andSubStone4NumGreaterThan(Integer value) {
            addCriterion("subStone4Num >", value, "subStone4Num");
            return (Criteria) this;
        }

        public Criteria andSubStone4NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("subStone4Num >=", value, "subStone4Num");
            return (Criteria) this;
        }

        public Criteria andSubStone4NumLessThan(Integer value) {
            addCriterion("subStone4Num <", value, "subStone4Num");
            return (Criteria) this;
        }

        public Criteria andSubStone4NumLessThanOrEqualTo(Integer value) {
            addCriterion("subStone4Num <=", value, "subStone4Num");
            return (Criteria) this;
        }

        public Criteria andSubStone4NumIn(List<Integer> values) {
            addCriterion("subStone4Num in", values, "subStone4Num");
            return (Criteria) this;
        }

        public Criteria andSubStone4NumNotIn(List<Integer> values) {
            addCriterion("subStone4Num not in", values, "subStone4Num");
            return (Criteria) this;
        }

        public Criteria andSubStone4NumBetween(Integer value1, Integer value2) {
            addCriterion("subStone4Num between", value1, value2, "subStone4Num");
            return (Criteria) this;
        }

        public Criteria andSubStone4NumNotBetween(Integer value1, Integer value2) {
            addCriterion("subStone4Num not between", value1, value2, "subStone4Num");
            return (Criteria) this;
        }

        public Criteria andSubStone4WeightIsNull() {
            addCriterion("subStone4Weight is null");
            return (Criteria) this;
        }

        public Criteria andSubStone4WeightIsNotNull() {
            addCriterion("subStone4Weight is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone4WeightEqualTo(Double value) {
            addCriterion("subStone4Weight =", value, "subStone4Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone4WeightNotEqualTo(Double value) {
            addCriterion("subStone4Weight <>", value, "subStone4Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone4WeightGreaterThan(Double value) {
            addCriterion("subStone4Weight >", value, "subStone4Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone4WeightGreaterThanOrEqualTo(Double value) {
            addCriterion("subStone4Weight >=", value, "subStone4Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone4WeightLessThan(Double value) {
            addCriterion("subStone4Weight <", value, "subStone4Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone4WeightLessThanOrEqualTo(Double value) {
            addCriterion("subStone4Weight <=", value, "subStone4Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone4WeightIn(List<Double> values) {
            addCriterion("subStone4Weight in", values, "subStone4Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone4WeightNotIn(List<Double> values) {
            addCriterion("subStone4Weight not in", values, "subStone4Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone4WeightBetween(Double value1, Double value2) {
            addCriterion("subStone4Weight between", value1, value2, "subStone4Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone4WeightNotBetween(Double value1, Double value2) {
            addCriterion("subStone4Weight not between", value1, value2, "subStone4Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone4PriceIsNull() {
            addCriterion("subStone4Price is null");
            return (Criteria) this;
        }

        public Criteria andSubStone4PriceIsNotNull() {
            addCriterion("subStone4Price is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone4PriceEqualTo(Double value) {
            addCriterion("subStone4Price =", value, "subStone4Price");
            return (Criteria) this;
        }

        public Criteria andSubStone4PriceNotEqualTo(Double value) {
            addCriterion("subStone4Price <>", value, "subStone4Price");
            return (Criteria) this;
        }

        public Criteria andSubStone4PriceGreaterThan(Double value) {
            addCriterion("subStone4Price >", value, "subStone4Price");
            return (Criteria) this;
        }

        public Criteria andSubStone4PriceGreaterThanOrEqualTo(Double value) {
            addCriterion("subStone4Price >=", value, "subStone4Price");
            return (Criteria) this;
        }

        public Criteria andSubStone4PriceLessThan(Double value) {
            addCriterion("subStone4Price <", value, "subStone4Price");
            return (Criteria) this;
        }

        public Criteria andSubStone4PriceLessThanOrEqualTo(Double value) {
            addCriterion("subStone4Price <=", value, "subStone4Price");
            return (Criteria) this;
        }

        public Criteria andSubStone4PriceIn(List<Double> values) {
            addCriterion("subStone4Price in", values, "subStone4Price");
            return (Criteria) this;
        }

        public Criteria andSubStone4PriceNotIn(List<Double> values) {
            addCriterion("subStone4Price not in", values, "subStone4Price");
            return (Criteria) this;
        }

        public Criteria andSubStone4PriceBetween(Double value1, Double value2) {
            addCriterion("subStone4Price between", value1, value2, "subStone4Price");
            return (Criteria) this;
        }

        public Criteria andSubStone4PriceNotBetween(Double value1, Double value2) {
            addCriterion("subStone4Price not between", value1, value2, "subStone4Price");
            return (Criteria) this;
        }

        public Criteria andSubStone4MoneyIsNull() {
            addCriterion("subStone4Money is null");
            return (Criteria) this;
        }

        public Criteria andSubStone4MoneyIsNotNull() {
            addCriterion("subStone4Money is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone4MoneyEqualTo(Double value) {
            addCriterion("subStone4Money =", value, "subStone4Money");
            return (Criteria) this;
        }

        public Criteria andSubStone4MoneyNotEqualTo(Double value) {
            addCriterion("subStone4Money <>", value, "subStone4Money");
            return (Criteria) this;
        }

        public Criteria andSubStone4MoneyGreaterThan(Double value) {
            addCriterion("subStone4Money >", value, "subStone4Money");
            return (Criteria) this;
        }

        public Criteria andSubStone4MoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("subStone4Money >=", value, "subStone4Money");
            return (Criteria) this;
        }

        public Criteria andSubStone4MoneyLessThan(Double value) {
            addCriterion("subStone4Money <", value, "subStone4Money");
            return (Criteria) this;
        }

        public Criteria andSubStone4MoneyLessThanOrEqualTo(Double value) {
            addCriterion("subStone4Money <=", value, "subStone4Money");
            return (Criteria) this;
        }

        public Criteria andSubStone4MoneyIn(List<Double> values) {
            addCriterion("subStone4Money in", values, "subStone4Money");
            return (Criteria) this;
        }

        public Criteria andSubStone4MoneyNotIn(List<Double> values) {
            addCriterion("subStone4Money not in", values, "subStone4Money");
            return (Criteria) this;
        }

        public Criteria andSubStone4MoneyBetween(Double value1, Double value2) {
            addCriterion("subStone4Money between", value1, value2, "subStone4Money");
            return (Criteria) this;
        }

        public Criteria andSubStone4MoneyNotBetween(Double value1, Double value2) {
            addCriterion("subStone4Money not between", value1, value2, "subStone4Money");
            return (Criteria) this;
        }

        public Criteria andSubStone5NameIsNull() {
            addCriterion("subStone5Name is null");
            return (Criteria) this;
        }

        public Criteria andSubStone5NameIsNotNull() {
            addCriterion("subStone5Name is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone5NameEqualTo(String value) {
            addCriterion("subStone5Name =", value, "subStone5Name");
            return (Criteria) this;
        }

        public Criteria andSubStone5NameNotEqualTo(String value) {
            addCriterion("subStone5Name <>", value, "subStone5Name");
            return (Criteria) this;
        }

        public Criteria andSubStone5NameGreaterThan(String value) {
            addCriterion("subStone5Name >", value, "subStone5Name");
            return (Criteria) this;
        }

        public Criteria andSubStone5NameGreaterThanOrEqualTo(String value) {
            addCriterion("subStone5Name >=", value, "subStone5Name");
            return (Criteria) this;
        }

        public Criteria andSubStone5NameLessThan(String value) {
            addCriterion("subStone5Name <", value, "subStone5Name");
            return (Criteria) this;
        }

        public Criteria andSubStone5NameLessThanOrEqualTo(String value) {
            addCriterion("subStone5Name <=", value, "subStone5Name");
            return (Criteria) this;
        }

        public Criteria andSubStone5NameLike(String value) {
            addCriterion("subStone5Name like", value, "subStone5Name");
            return (Criteria) this;
        }

        public Criteria andSubStone5NameNotLike(String value) {
            addCriterion("subStone5Name not like", value, "subStone5Name");
            return (Criteria) this;
        }

        public Criteria andSubStone5NameIn(List<String> values) {
            addCriterion("subStone5Name in", values, "subStone5Name");
            return (Criteria) this;
        }

        public Criteria andSubStone5NameNotIn(List<String> values) {
            addCriterion("subStone5Name not in", values, "subStone5Name");
            return (Criteria) this;
        }

        public Criteria andSubStone5NameBetween(String value1, String value2) {
            addCriterion("subStone5Name between", value1, value2, "subStone5Name");
            return (Criteria) this;
        }

        public Criteria andSubStone5NameNotBetween(String value1, String value2) {
            addCriterion("subStone5Name not between", value1, value2, "subStone5Name");
            return (Criteria) this;
        }

        public Criteria andSubStone5NoIsNull() {
            addCriterion("subStone5No is null");
            return (Criteria) this;
        }

        public Criteria andSubStone5NoIsNotNull() {
            addCriterion("subStone5No is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone5NoEqualTo(String value) {
            addCriterion("subStone5No =", value, "subStone5No");
            return (Criteria) this;
        }

        public Criteria andSubStone5NoNotEqualTo(String value) {
            addCriterion("subStone5No <>", value, "subStone5No");
            return (Criteria) this;
        }

        public Criteria andSubStone5NoGreaterThan(String value) {
            addCriterion("subStone5No >", value, "subStone5No");
            return (Criteria) this;
        }

        public Criteria andSubStone5NoGreaterThanOrEqualTo(String value) {
            addCriterion("subStone5No >=", value, "subStone5No");
            return (Criteria) this;
        }

        public Criteria andSubStone5NoLessThan(String value) {
            addCriterion("subStone5No <", value, "subStone5No");
            return (Criteria) this;
        }

        public Criteria andSubStone5NoLessThanOrEqualTo(String value) {
            addCriterion("subStone5No <=", value, "subStone5No");
            return (Criteria) this;
        }

        public Criteria andSubStone5NoLike(String value) {
            addCriterion("subStone5No like", value, "subStone5No");
            return (Criteria) this;
        }

        public Criteria andSubStone5NoNotLike(String value) {
            addCriterion("subStone5No not like", value, "subStone5No");
            return (Criteria) this;
        }

        public Criteria andSubStone5NoIn(List<String> values) {
            addCriterion("subStone5No in", values, "subStone5No");
            return (Criteria) this;
        }

        public Criteria andSubStone5NoNotIn(List<String> values) {
            addCriterion("subStone5No not in", values, "subStone5No");
            return (Criteria) this;
        }

        public Criteria andSubStone5NoBetween(String value1, String value2) {
            addCriterion("subStone5No between", value1, value2, "subStone5No");
            return (Criteria) this;
        }

        public Criteria andSubStone5NoNotBetween(String value1, String value2) {
            addCriterion("subStone5No not between", value1, value2, "subStone5No");
            return (Criteria) this;
        }

        public Criteria andSubStone5SpecifiIsNull() {
            addCriterion("subStone5Specifi is null");
            return (Criteria) this;
        }

        public Criteria andSubStone5SpecifiIsNotNull() {
            addCriterion("subStone5Specifi is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone5SpecifiEqualTo(String value) {
            addCriterion("subStone5Specifi =", value, "subStone5Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone5SpecifiNotEqualTo(String value) {
            addCriterion("subStone5Specifi <>", value, "subStone5Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone5SpecifiGreaterThan(String value) {
            addCriterion("subStone5Specifi >", value, "subStone5Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone5SpecifiGreaterThanOrEqualTo(String value) {
            addCriterion("subStone5Specifi >=", value, "subStone5Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone5SpecifiLessThan(String value) {
            addCriterion("subStone5Specifi <", value, "subStone5Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone5SpecifiLessThanOrEqualTo(String value) {
            addCriterion("subStone5Specifi <=", value, "subStone5Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone5SpecifiLike(String value) {
            addCriterion("subStone5Specifi like", value, "subStone5Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone5SpecifiNotLike(String value) {
            addCriterion("subStone5Specifi not like", value, "subStone5Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone5SpecifiIn(List<String> values) {
            addCriterion("subStone5Specifi in", values, "subStone5Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone5SpecifiNotIn(List<String> values) {
            addCriterion("subStone5Specifi not in", values, "subStone5Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone5SpecifiBetween(String value1, String value2) {
            addCriterion("subStone5Specifi between", value1, value2, "subStone5Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone5SpecifiNotBetween(String value1, String value2) {
            addCriterion("subStone5Specifi not between", value1, value2, "subStone5Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone5NumIsNull() {
            addCriterion("subStone5Num is null");
            return (Criteria) this;
        }

        public Criteria andSubStone5NumIsNotNull() {
            addCriterion("subStone5Num is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone5NumEqualTo(Integer value) {
            addCriterion("subStone5Num =", value, "subStone5Num");
            return (Criteria) this;
        }

        public Criteria andSubStone5NumNotEqualTo(Integer value) {
            addCriterion("subStone5Num <>", value, "subStone5Num");
            return (Criteria) this;
        }

        public Criteria andSubStone5NumGreaterThan(Integer value) {
            addCriterion("subStone5Num >", value, "subStone5Num");
            return (Criteria) this;
        }

        public Criteria andSubStone5NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("subStone5Num >=", value, "subStone5Num");
            return (Criteria) this;
        }

        public Criteria andSubStone5NumLessThan(Integer value) {
            addCriterion("subStone5Num <", value, "subStone5Num");
            return (Criteria) this;
        }

        public Criteria andSubStone5NumLessThanOrEqualTo(Integer value) {
            addCriterion("subStone5Num <=", value, "subStone5Num");
            return (Criteria) this;
        }

        public Criteria andSubStone5NumIn(List<Integer> values) {
            addCriterion("subStone5Num in", values, "subStone5Num");
            return (Criteria) this;
        }

        public Criteria andSubStone5NumNotIn(List<Integer> values) {
            addCriterion("subStone5Num not in", values, "subStone5Num");
            return (Criteria) this;
        }

        public Criteria andSubStone5NumBetween(Integer value1, Integer value2) {
            addCriterion("subStone5Num between", value1, value2, "subStone5Num");
            return (Criteria) this;
        }

        public Criteria andSubStone5NumNotBetween(Integer value1, Integer value2) {
            addCriterion("subStone5Num not between", value1, value2, "subStone5Num");
            return (Criteria) this;
        }

        public Criteria andSubStone5WeightIsNull() {
            addCriterion("subStone5Weight is null");
            return (Criteria) this;
        }

        public Criteria andSubStone5WeightIsNotNull() {
            addCriterion("subStone5Weight is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone5WeightEqualTo(Double value) {
            addCriterion("subStone5Weight =", value, "subStone5Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone5WeightNotEqualTo(Double value) {
            addCriterion("subStone5Weight <>", value, "subStone5Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone5WeightGreaterThan(Double value) {
            addCriterion("subStone5Weight >", value, "subStone5Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone5WeightGreaterThanOrEqualTo(Double value) {
            addCriterion("subStone5Weight >=", value, "subStone5Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone5WeightLessThan(Double value) {
            addCriterion("subStone5Weight <", value, "subStone5Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone5WeightLessThanOrEqualTo(Double value) {
            addCriterion("subStone5Weight <=", value, "subStone5Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone5WeightIn(List<Double> values) {
            addCriterion("subStone5Weight in", values, "subStone5Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone5WeightNotIn(List<Double> values) {
            addCriterion("subStone5Weight not in", values, "subStone5Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone5WeightBetween(Double value1, Double value2) {
            addCriterion("subStone5Weight between", value1, value2, "subStone5Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone5WeightNotBetween(Double value1, Double value2) {
            addCriterion("subStone5Weight not between", value1, value2, "subStone5Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone5PriceIsNull() {
            addCriterion("subStone5Price is null");
            return (Criteria) this;
        }

        public Criteria andSubStone5PriceIsNotNull() {
            addCriterion("subStone5Price is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone5PriceEqualTo(Double value) {
            addCriterion("subStone5Price =", value, "subStone5Price");
            return (Criteria) this;
        }

        public Criteria andSubStone5PriceNotEqualTo(Double value) {
            addCriterion("subStone5Price <>", value, "subStone5Price");
            return (Criteria) this;
        }

        public Criteria andSubStone5PriceGreaterThan(Double value) {
            addCriterion("subStone5Price >", value, "subStone5Price");
            return (Criteria) this;
        }

        public Criteria andSubStone5PriceGreaterThanOrEqualTo(Double value) {
            addCriterion("subStone5Price >=", value, "subStone5Price");
            return (Criteria) this;
        }

        public Criteria andSubStone5PriceLessThan(Double value) {
            addCriterion("subStone5Price <", value, "subStone5Price");
            return (Criteria) this;
        }

        public Criteria andSubStone5PriceLessThanOrEqualTo(Double value) {
            addCriterion("subStone5Price <=", value, "subStone5Price");
            return (Criteria) this;
        }

        public Criteria andSubStone5PriceIn(List<Double> values) {
            addCriterion("subStone5Price in", values, "subStone5Price");
            return (Criteria) this;
        }

        public Criteria andSubStone5PriceNotIn(List<Double> values) {
            addCriterion("subStone5Price not in", values, "subStone5Price");
            return (Criteria) this;
        }

        public Criteria andSubStone5PriceBetween(Double value1, Double value2) {
            addCriterion("subStone5Price between", value1, value2, "subStone5Price");
            return (Criteria) this;
        }

        public Criteria andSubStone5PriceNotBetween(Double value1, Double value2) {
            addCriterion("subStone5Price not between", value1, value2, "subStone5Price");
            return (Criteria) this;
        }

        public Criteria andSubStone5MoneyIsNull() {
            addCriterion("subStone5Money is null");
            return (Criteria) this;
        }

        public Criteria andSubStone5MoneyIsNotNull() {
            addCriterion("subStone5Money is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone5MoneyEqualTo(Double value) {
            addCriterion("subStone5Money =", value, "subStone5Money");
            return (Criteria) this;
        }

        public Criteria andSubStone5MoneyNotEqualTo(Double value) {
            addCriterion("subStone5Money <>", value, "subStone5Money");
            return (Criteria) this;
        }

        public Criteria andSubStone5MoneyGreaterThan(Double value) {
            addCriterion("subStone5Money >", value, "subStone5Money");
            return (Criteria) this;
        }

        public Criteria andSubStone5MoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("subStone5Money >=", value, "subStone5Money");
            return (Criteria) this;
        }

        public Criteria andSubStone5MoneyLessThan(Double value) {
            addCriterion("subStone5Money <", value, "subStone5Money");
            return (Criteria) this;
        }

        public Criteria andSubStone5MoneyLessThanOrEqualTo(Double value) {
            addCriterion("subStone5Money <=", value, "subStone5Money");
            return (Criteria) this;
        }

        public Criteria andSubStone5MoneyIn(List<Double> values) {
            addCriterion("subStone5Money in", values, "subStone5Money");
            return (Criteria) this;
        }

        public Criteria andSubStone5MoneyNotIn(List<Double> values) {
            addCriterion("subStone5Money not in", values, "subStone5Money");
            return (Criteria) this;
        }

        public Criteria andSubStone5MoneyBetween(Double value1, Double value2) {
            addCriterion("subStone5Money between", value1, value2, "subStone5Money");
            return (Criteria) this;
        }

        public Criteria andSubStone5MoneyNotBetween(Double value1, Double value2) {
            addCriterion("subStone5Money not between", value1, value2, "subStone5Money");
            return (Criteria) this;
        }

        public Criteria andSubStone6NameIsNull() {
            addCriterion("subStone6Name is null");
            return (Criteria) this;
        }

        public Criteria andSubStone6NameIsNotNull() {
            addCriterion("subStone6Name is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone6NameEqualTo(String value) {
            addCriterion("subStone6Name =", value, "subStone6Name");
            return (Criteria) this;
        }

        public Criteria andSubStone6NameNotEqualTo(String value) {
            addCriterion("subStone6Name <>", value, "subStone6Name");
            return (Criteria) this;
        }

        public Criteria andSubStone6NameGreaterThan(String value) {
            addCriterion("subStone6Name >", value, "subStone6Name");
            return (Criteria) this;
        }

        public Criteria andSubStone6NameGreaterThanOrEqualTo(String value) {
            addCriterion("subStone6Name >=", value, "subStone6Name");
            return (Criteria) this;
        }

        public Criteria andSubStone6NameLessThan(String value) {
            addCriterion("subStone6Name <", value, "subStone6Name");
            return (Criteria) this;
        }

        public Criteria andSubStone6NameLessThanOrEqualTo(String value) {
            addCriterion("subStone6Name <=", value, "subStone6Name");
            return (Criteria) this;
        }

        public Criteria andSubStone6NameLike(String value) {
            addCriterion("subStone6Name like", value, "subStone6Name");
            return (Criteria) this;
        }

        public Criteria andSubStone6NameNotLike(String value) {
            addCriterion("subStone6Name not like", value, "subStone6Name");
            return (Criteria) this;
        }

        public Criteria andSubStone6NameIn(List<String> values) {
            addCriterion("subStone6Name in", values, "subStone6Name");
            return (Criteria) this;
        }

        public Criteria andSubStone6NameNotIn(List<String> values) {
            addCriterion("subStone6Name not in", values, "subStone6Name");
            return (Criteria) this;
        }

        public Criteria andSubStone6NameBetween(String value1, String value2) {
            addCriterion("subStone6Name between", value1, value2, "subStone6Name");
            return (Criteria) this;
        }

        public Criteria andSubStone6NameNotBetween(String value1, String value2) {
            addCriterion("subStone6Name not between", value1, value2, "subStone6Name");
            return (Criteria) this;
        }

        public Criteria andSubStone6NoIsNull() {
            addCriterion("subStone6No is null");
            return (Criteria) this;
        }

        public Criteria andSubStone6NoIsNotNull() {
            addCriterion("subStone6No is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone6NoEqualTo(String value) {
            addCriterion("subStone6No =", value, "subStone6No");
            return (Criteria) this;
        }

        public Criteria andSubStone6NoNotEqualTo(String value) {
            addCriterion("subStone6No <>", value, "subStone6No");
            return (Criteria) this;
        }

        public Criteria andSubStone6NoGreaterThan(String value) {
            addCriterion("subStone6No >", value, "subStone6No");
            return (Criteria) this;
        }

        public Criteria andSubStone6NoGreaterThanOrEqualTo(String value) {
            addCriterion("subStone6No >=", value, "subStone6No");
            return (Criteria) this;
        }

        public Criteria andSubStone6NoLessThan(String value) {
            addCriterion("subStone6No <", value, "subStone6No");
            return (Criteria) this;
        }

        public Criteria andSubStone6NoLessThanOrEqualTo(String value) {
            addCriterion("subStone6No <=", value, "subStone6No");
            return (Criteria) this;
        }

        public Criteria andSubStone6NoLike(String value) {
            addCriterion("subStone6No like", value, "subStone6No");
            return (Criteria) this;
        }

        public Criteria andSubStone6NoNotLike(String value) {
            addCriterion("subStone6No not like", value, "subStone6No");
            return (Criteria) this;
        }

        public Criteria andSubStone6NoIn(List<String> values) {
            addCriterion("subStone6No in", values, "subStone6No");
            return (Criteria) this;
        }

        public Criteria andSubStone6NoNotIn(List<String> values) {
            addCriterion("subStone6No not in", values, "subStone6No");
            return (Criteria) this;
        }

        public Criteria andSubStone6NoBetween(String value1, String value2) {
            addCriterion("subStone6No between", value1, value2, "subStone6No");
            return (Criteria) this;
        }

        public Criteria andSubStone6NoNotBetween(String value1, String value2) {
            addCriterion("subStone6No not between", value1, value2, "subStone6No");
            return (Criteria) this;
        }

        public Criteria andSubStone6SpecifiIsNull() {
            addCriterion("subStone6Specifi is null");
            return (Criteria) this;
        }

        public Criteria andSubStone6SpecifiIsNotNull() {
            addCriterion("subStone6Specifi is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone6SpecifiEqualTo(String value) {
            addCriterion("subStone6Specifi =", value, "subStone6Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone6SpecifiNotEqualTo(String value) {
            addCriterion("subStone6Specifi <>", value, "subStone6Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone6SpecifiGreaterThan(String value) {
            addCriterion("subStone6Specifi >", value, "subStone6Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone6SpecifiGreaterThanOrEqualTo(String value) {
            addCriterion("subStone6Specifi >=", value, "subStone6Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone6SpecifiLessThan(String value) {
            addCriterion("subStone6Specifi <", value, "subStone6Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone6SpecifiLessThanOrEqualTo(String value) {
            addCriterion("subStone6Specifi <=", value, "subStone6Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone6SpecifiLike(String value) {
            addCriterion("subStone6Specifi like", value, "subStone6Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone6SpecifiNotLike(String value) {
            addCriterion("subStone6Specifi not like", value, "subStone6Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone6SpecifiIn(List<String> values) {
            addCriterion("subStone6Specifi in", values, "subStone6Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone6SpecifiNotIn(List<String> values) {
            addCriterion("subStone6Specifi not in", values, "subStone6Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone6SpecifiBetween(String value1, String value2) {
            addCriterion("subStone6Specifi between", value1, value2, "subStone6Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone6SpecifiNotBetween(String value1, String value2) {
            addCriterion("subStone6Specifi not between", value1, value2, "subStone6Specifi");
            return (Criteria) this;
        }

        public Criteria andSubStone6NumIsNull() {
            addCriterion("subStone6Num is null");
            return (Criteria) this;
        }

        public Criteria andSubStone6NumIsNotNull() {
            addCriterion("subStone6Num is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone6NumEqualTo(Integer value) {
            addCriterion("subStone6Num =", value, "subStone6Num");
            return (Criteria) this;
        }

        public Criteria andSubStone6NumNotEqualTo(Integer value) {
            addCriterion("subStone6Num <>", value, "subStone6Num");
            return (Criteria) this;
        }

        public Criteria andSubStone6NumGreaterThan(Integer value) {
            addCriterion("subStone6Num >", value, "subStone6Num");
            return (Criteria) this;
        }

        public Criteria andSubStone6NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("subStone6Num >=", value, "subStone6Num");
            return (Criteria) this;
        }

        public Criteria andSubStone6NumLessThan(Integer value) {
            addCriterion("subStone6Num <", value, "subStone6Num");
            return (Criteria) this;
        }

        public Criteria andSubStone6NumLessThanOrEqualTo(Integer value) {
            addCriterion("subStone6Num <=", value, "subStone6Num");
            return (Criteria) this;
        }

        public Criteria andSubStone6NumIn(List<Integer> values) {
            addCriterion("subStone6Num in", values, "subStone6Num");
            return (Criteria) this;
        }

        public Criteria andSubStone6NumNotIn(List<Integer> values) {
            addCriterion("subStone6Num not in", values, "subStone6Num");
            return (Criteria) this;
        }

        public Criteria andSubStone6NumBetween(Integer value1, Integer value2) {
            addCriterion("subStone6Num between", value1, value2, "subStone6Num");
            return (Criteria) this;
        }

        public Criteria andSubStone6NumNotBetween(Integer value1, Integer value2) {
            addCriterion("subStone6Num not between", value1, value2, "subStone6Num");
            return (Criteria) this;
        }

        public Criteria andSubStone6WeightIsNull() {
            addCriterion("subStone6Weight is null");
            return (Criteria) this;
        }

        public Criteria andSubStone6WeightIsNotNull() {
            addCriterion("subStone6Weight is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone6WeightEqualTo(Double value) {
            addCriterion("subStone6Weight =", value, "subStone6Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone6WeightNotEqualTo(Double value) {
            addCriterion("subStone6Weight <>", value, "subStone6Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone6WeightGreaterThan(Double value) {
            addCriterion("subStone6Weight >", value, "subStone6Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone6WeightGreaterThanOrEqualTo(Double value) {
            addCriterion("subStone6Weight >=", value, "subStone6Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone6WeightLessThan(Double value) {
            addCriterion("subStone6Weight <", value, "subStone6Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone6WeightLessThanOrEqualTo(Double value) {
            addCriterion("subStone6Weight <=", value, "subStone6Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone6WeightIn(List<Double> values) {
            addCriterion("subStone6Weight in", values, "subStone6Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone6WeightNotIn(List<Double> values) {
            addCriterion("subStone6Weight not in", values, "subStone6Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone6WeightBetween(Double value1, Double value2) {
            addCriterion("subStone6Weight between", value1, value2, "subStone6Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone6WeightNotBetween(Double value1, Double value2) {
            addCriterion("subStone6Weight not between", value1, value2, "subStone6Weight");
            return (Criteria) this;
        }

        public Criteria andSubStone6PriceIsNull() {
            addCriterion("subStone6Price is null");
            return (Criteria) this;
        }

        public Criteria andSubStone6PriceIsNotNull() {
            addCriterion("subStone6Price is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone6PriceEqualTo(Double value) {
            addCriterion("subStone6Price =", value, "subStone6Price");
            return (Criteria) this;
        }

        public Criteria andSubStone6PriceNotEqualTo(Double value) {
            addCriterion("subStone6Price <>", value, "subStone6Price");
            return (Criteria) this;
        }

        public Criteria andSubStone6PriceGreaterThan(Double value) {
            addCriterion("subStone6Price >", value, "subStone6Price");
            return (Criteria) this;
        }

        public Criteria andSubStone6PriceGreaterThanOrEqualTo(Double value) {
            addCriterion("subStone6Price >=", value, "subStone6Price");
            return (Criteria) this;
        }

        public Criteria andSubStone6PriceLessThan(Double value) {
            addCriterion("subStone6Price <", value, "subStone6Price");
            return (Criteria) this;
        }

        public Criteria andSubStone6PriceLessThanOrEqualTo(Double value) {
            addCriterion("subStone6Price <=", value, "subStone6Price");
            return (Criteria) this;
        }

        public Criteria andSubStone6PriceIn(List<Double> values) {
            addCriterion("subStone6Price in", values, "subStone6Price");
            return (Criteria) this;
        }

        public Criteria andSubStone6PriceNotIn(List<Double> values) {
            addCriterion("subStone6Price not in", values, "subStone6Price");
            return (Criteria) this;
        }

        public Criteria andSubStone6PriceBetween(Double value1, Double value2) {
            addCriterion("subStone6Price between", value1, value2, "subStone6Price");
            return (Criteria) this;
        }

        public Criteria andSubStone6PriceNotBetween(Double value1, Double value2) {
            addCriterion("subStone6Price not between", value1, value2, "subStone6Price");
            return (Criteria) this;
        }

        public Criteria andSubStone6MoneyIsNull() {
            addCriterion("subStone6Money is null");
            return (Criteria) this;
        }

        public Criteria andSubStone6MoneyIsNotNull() {
            addCriterion("subStone6Money is not null");
            return (Criteria) this;
        }

        public Criteria andSubStone6MoneyEqualTo(Double value) {
            addCriterion("subStone6Money =", value, "subStone6Money");
            return (Criteria) this;
        }

        public Criteria andSubStone6MoneyNotEqualTo(Double value) {
            addCriterion("subStone6Money <>", value, "subStone6Money");
            return (Criteria) this;
        }

        public Criteria andSubStone6MoneyGreaterThan(Double value) {
            addCriterion("subStone6Money >", value, "subStone6Money");
            return (Criteria) this;
        }

        public Criteria andSubStone6MoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("subStone6Money >=", value, "subStone6Money");
            return (Criteria) this;
        }

        public Criteria andSubStone6MoneyLessThan(Double value) {
            addCriterion("subStone6Money <", value, "subStone6Money");
            return (Criteria) this;
        }

        public Criteria andSubStone6MoneyLessThanOrEqualTo(Double value) {
            addCriterion("subStone6Money <=", value, "subStone6Money");
            return (Criteria) this;
        }

        public Criteria andSubStone6MoneyIn(List<Double> values) {
            addCriterion("subStone6Money in", values, "subStone6Money");
            return (Criteria) this;
        }

        public Criteria andSubStone6MoneyNotIn(List<Double> values) {
            addCriterion("subStone6Money not in", values, "subStone6Money");
            return (Criteria) this;
        }

        public Criteria andSubStone6MoneyBetween(Double value1, Double value2) {
            addCriterion("subStone6Money between", value1, value2, "subStone6Money");
            return (Criteria) this;
        }

        public Criteria andSubStone6MoneyNotBetween(Double value1, Double value2) {
            addCriterion("subStone6Money not between", value1, value2, "subStone6Money");
            return (Criteria) this;
        }

        public Criteria andPeiShiCostPriceIsNull() {
            addCriterion("peiShiCostPrice is null");
            return (Criteria) this;
        }

        public Criteria andPeiShiCostPriceIsNotNull() {
            addCriterion("peiShiCostPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPeiShiCostPriceEqualTo(Double value) {
            addCriterion("peiShiCostPrice =", value, "peiShiCostPrice");
            return (Criteria) this;
        }

        public Criteria andPeiShiCostPriceNotEqualTo(Double value) {
            addCriterion("peiShiCostPrice <>", value, "peiShiCostPrice");
            return (Criteria) this;
        }

        public Criteria andPeiShiCostPriceGreaterThan(Double value) {
            addCriterion("peiShiCostPrice >", value, "peiShiCostPrice");
            return (Criteria) this;
        }

        public Criteria andPeiShiCostPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("peiShiCostPrice >=", value, "peiShiCostPrice");
            return (Criteria) this;
        }

        public Criteria andPeiShiCostPriceLessThan(Double value) {
            addCriterion("peiShiCostPrice <", value, "peiShiCostPrice");
            return (Criteria) this;
        }

        public Criteria andPeiShiCostPriceLessThanOrEqualTo(Double value) {
            addCriterion("peiShiCostPrice <=", value, "peiShiCostPrice");
            return (Criteria) this;
        }

        public Criteria andPeiShiCostPriceIn(List<Double> values) {
            addCriterion("peiShiCostPrice in", values, "peiShiCostPrice");
            return (Criteria) this;
        }

        public Criteria andPeiShiCostPriceNotIn(List<Double> values) {
            addCriterion("peiShiCostPrice not in", values, "peiShiCostPrice");
            return (Criteria) this;
        }

        public Criteria andPeiShiCostPriceBetween(Double value1, Double value2) {
            addCriterion("peiShiCostPrice between", value1, value2, "peiShiCostPrice");
            return (Criteria) this;
        }

        public Criteria andPeiShiCostPriceNotBetween(Double value1, Double value2) {
            addCriterion("peiShiCostPrice not between", value1, value2, "peiShiCostPrice");
            return (Criteria) this;
        }

        public Criteria andPeiShiRateIsNull() {
            addCriterion("peiShiRate is null");
            return (Criteria) this;
        }

        public Criteria andPeiShiRateIsNotNull() {
            addCriterion("peiShiRate is not null");
            return (Criteria) this;
        }

        public Criteria andPeiShiRateEqualTo(Double value) {
            addCriterion("peiShiRate =", value, "peiShiRate");
            return (Criteria) this;
        }

        public Criteria andPeiShiRateNotEqualTo(Double value) {
            addCriterion("peiShiRate <>", value, "peiShiRate");
            return (Criteria) this;
        }

        public Criteria andPeiShiRateGreaterThan(Double value) {
            addCriterion("peiShiRate >", value, "peiShiRate");
            return (Criteria) this;
        }

        public Criteria andPeiShiRateGreaterThanOrEqualTo(Double value) {
            addCriterion("peiShiRate >=", value, "peiShiRate");
            return (Criteria) this;
        }

        public Criteria andPeiShiRateLessThan(Double value) {
            addCriterion("peiShiRate <", value, "peiShiRate");
            return (Criteria) this;
        }

        public Criteria andPeiShiRateLessThanOrEqualTo(Double value) {
            addCriterion("peiShiRate <=", value, "peiShiRate");
            return (Criteria) this;
        }

        public Criteria andPeiShiRateIn(List<Double> values) {
            addCriterion("peiShiRate in", values, "peiShiRate");
            return (Criteria) this;
        }

        public Criteria andPeiShiRateNotIn(List<Double> values) {
            addCriterion("peiShiRate not in", values, "peiShiRate");
            return (Criteria) this;
        }

        public Criteria andPeiShiRateBetween(Double value1, Double value2) {
            addCriterion("peiShiRate between", value1, value2, "peiShiRate");
            return (Criteria) this;
        }

        public Criteria andPeiShiRateNotBetween(Double value1, Double value2) {
            addCriterion("peiShiRate not between", value1, value2, "peiShiRate");
            return (Criteria) this;
        }

        public Criteria andPeiShiLabelPriceIsNull() {
            addCriterion("peiShiLabelPrice is null");
            return (Criteria) this;
        }

        public Criteria andPeiShiLabelPriceIsNotNull() {
            addCriterion("peiShiLabelPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPeiShiLabelPriceEqualTo(Double value) {
            addCriterion("peiShiLabelPrice =", value, "peiShiLabelPrice");
            return (Criteria) this;
        }

        public Criteria andPeiShiLabelPriceNotEqualTo(Double value) {
            addCriterion("peiShiLabelPrice <>", value, "peiShiLabelPrice");
            return (Criteria) this;
        }

        public Criteria andPeiShiLabelPriceGreaterThan(Double value) {
            addCriterion("peiShiLabelPrice >", value, "peiShiLabelPrice");
            return (Criteria) this;
        }

        public Criteria andPeiShiLabelPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("peiShiLabelPrice >=", value, "peiShiLabelPrice");
            return (Criteria) this;
        }

        public Criteria andPeiShiLabelPriceLessThan(Double value) {
            addCriterion("peiShiLabelPrice <", value, "peiShiLabelPrice");
            return (Criteria) this;
        }

        public Criteria andPeiShiLabelPriceLessThanOrEqualTo(Double value) {
            addCriterion("peiShiLabelPrice <=", value, "peiShiLabelPrice");
            return (Criteria) this;
        }

        public Criteria andPeiShiLabelPriceIn(List<Double> values) {
            addCriterion("peiShiLabelPrice in", values, "peiShiLabelPrice");
            return (Criteria) this;
        }

        public Criteria andPeiShiLabelPriceNotIn(List<Double> values) {
            addCriterion("peiShiLabelPrice not in", values, "peiShiLabelPrice");
            return (Criteria) this;
        }

        public Criteria andPeiShiLabelPriceBetween(Double value1, Double value2) {
            addCriterion("peiShiLabelPrice between", value1, value2, "peiShiLabelPrice");
            return (Criteria) this;
        }

        public Criteria andPeiShiLabelPriceNotBetween(Double value1, Double value2) {
            addCriterion("peiShiLabelPrice not between", value1, value2, "peiShiLabelPrice");
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

        public Criteria andOldMaterialQualityIsNull() {
            addCriterion("oldMaterialQuality is null");
            return (Criteria) this;
        }

        public Criteria andOldMaterialQualityIsNotNull() {
            addCriterion("oldMaterialQuality is not null");
            return (Criteria) this;
        }

        public Criteria andOldMaterialQualityEqualTo(Double value) {
            addCriterion("oldMaterialQuality =", value, "oldMaterialQuality");
            return (Criteria) this;
        }

        public Criteria andOldMaterialQualityNotEqualTo(Double value) {
            addCriterion("oldMaterialQuality <>", value, "oldMaterialQuality");
            return (Criteria) this;
        }

        public Criteria andOldMaterialQualityGreaterThan(Double value) {
            addCriterion("oldMaterialQuality >", value, "oldMaterialQuality");
            return (Criteria) this;
        }

        public Criteria andOldMaterialQualityGreaterThanOrEqualTo(Double value) {
            addCriterion("oldMaterialQuality >=", value, "oldMaterialQuality");
            return (Criteria) this;
        }

        public Criteria andOldMaterialQualityLessThan(Double value) {
            addCriterion("oldMaterialQuality <", value, "oldMaterialQuality");
            return (Criteria) this;
        }

        public Criteria andOldMaterialQualityLessThanOrEqualTo(Double value) {
            addCriterion("oldMaterialQuality <=", value, "oldMaterialQuality");
            return (Criteria) this;
        }

        public Criteria andOldMaterialQualityIn(List<Double> values) {
            addCriterion("oldMaterialQuality in", values, "oldMaterialQuality");
            return (Criteria) this;
        }

        public Criteria andOldMaterialQualityNotIn(List<Double> values) {
            addCriterion("oldMaterialQuality not in", values, "oldMaterialQuality");
            return (Criteria) this;
        }

        public Criteria andOldMaterialQualityBetween(Double value1, Double value2) {
            addCriterion("oldMaterialQuality between", value1, value2, "oldMaterialQuality");
            return (Criteria) this;
        }

        public Criteria andOldMaterialQualityNotBetween(Double value1, Double value2) {
            addCriterion("oldMaterialQuality not between", value1, value2, "oldMaterialQuality");
            return (Criteria) this;
        }

        public Criteria andOldMaterialLossIsNull() {
            addCriterion("oldMaterialLoss is null");
            return (Criteria) this;
        }

        public Criteria andOldMaterialLossIsNotNull() {
            addCriterion("oldMaterialLoss is not null");
            return (Criteria) this;
        }

        public Criteria andOldMaterialLossEqualTo(Double value) {
            addCriterion("oldMaterialLoss =", value, "oldMaterialLoss");
            return (Criteria) this;
        }

        public Criteria andOldMaterialLossNotEqualTo(Double value) {
            addCriterion("oldMaterialLoss <>", value, "oldMaterialLoss");
            return (Criteria) this;
        }

        public Criteria andOldMaterialLossGreaterThan(Double value) {
            addCriterion("oldMaterialLoss >", value, "oldMaterialLoss");
            return (Criteria) this;
        }

        public Criteria andOldMaterialLossGreaterThanOrEqualTo(Double value) {
            addCriterion("oldMaterialLoss >=", value, "oldMaterialLoss");
            return (Criteria) this;
        }

        public Criteria andOldMaterialLossLessThan(Double value) {
            addCriterion("oldMaterialLoss <", value, "oldMaterialLoss");
            return (Criteria) this;
        }

        public Criteria andOldMaterialLossLessThanOrEqualTo(Double value) {
            addCriterion("oldMaterialLoss <=", value, "oldMaterialLoss");
            return (Criteria) this;
        }

        public Criteria andOldMaterialLossIn(List<Double> values) {
            addCriterion("oldMaterialLoss in", values, "oldMaterialLoss");
            return (Criteria) this;
        }

        public Criteria andOldMaterialLossNotIn(List<Double> values) {
            addCriterion("oldMaterialLoss not in", values, "oldMaterialLoss");
            return (Criteria) this;
        }

        public Criteria andOldMaterialLossBetween(Double value1, Double value2) {
            addCriterion("oldMaterialLoss between", value1, value2, "oldMaterialLoss");
            return (Criteria) this;
        }

        public Criteria andOldMaterialLossNotBetween(Double value1, Double value2) {
            addCriterion("oldMaterialLoss not between", value1, value2, "oldMaterialLoss");
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

        public Criteria andRecFlagIsNull() {
            addCriterion("recFlag is null");
            return (Criteria) this;
        }

        public Criteria andRecFlagIsNotNull() {
            addCriterion("recFlag is not null");
            return (Criteria) this;
        }

        public Criteria andRecFlagEqualTo(Boolean value) {
            addCriterion("recFlag =", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagNotEqualTo(Boolean value) {
            addCriterion("recFlag <>", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagGreaterThan(Boolean value) {
            addCriterion("recFlag >", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("recFlag >=", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagLessThan(Boolean value) {
            addCriterion("recFlag <", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("recFlag <=", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagIn(List<Boolean> values) {
            addCriterion("recFlag in", values, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagNotIn(List<Boolean> values) {
            addCriterion("recFlag not in", values, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("recFlag between", value1, value2, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("recFlag not between", value1, value2, "recFlag");
            return (Criteria) this;
        }

        public Criteria andSaleManIdIsNull() {
            addCriterion("saleManId is null");
            return (Criteria) this;
        }

        public Criteria andSaleManIdIsNotNull() {
            addCriterion("saleManId is not null");
            return (Criteria) this;
        }

        public Criteria andSaleManIdEqualTo(Integer value) {
            addCriterion("saleManId =", value, "saleManId");
            return (Criteria) this;
        }

        public Criteria andSaleManIdNotEqualTo(Integer value) {
            addCriterion("saleManId <>", value, "saleManId");
            return (Criteria) this;
        }

        public Criteria andSaleManIdGreaterThan(Integer value) {
            addCriterion("saleManId >", value, "saleManId");
            return (Criteria) this;
        }

        public Criteria andSaleManIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("saleManId >=", value, "saleManId");
            return (Criteria) this;
        }

        public Criteria andSaleManIdLessThan(Integer value) {
            addCriterion("saleManId <", value, "saleManId");
            return (Criteria) this;
        }

        public Criteria andSaleManIdLessThanOrEqualTo(Integer value) {
            addCriterion("saleManId <=", value, "saleManId");
            return (Criteria) this;
        }

        public Criteria andSaleManIdIn(List<Integer> values) {
            addCriterion("saleManId in", values, "saleManId");
            return (Criteria) this;
        }

        public Criteria andSaleManIdNotIn(List<Integer> values) {
            addCriterion("saleManId not in", values, "saleManId");
            return (Criteria) this;
        }

        public Criteria andSaleManIdBetween(Integer value1, Integer value2) {
            addCriterion("saleManId between", value1, value2, "saleManId");
            return (Criteria) this;
        }

        public Criteria andSaleManIdNotBetween(Integer value1, Integer value2) {
            addCriterion("saleManId not between", value1, value2, "saleManId");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameIsNull() {
            addCriterion("salesmanName is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameIsNotNull() {
            addCriterion("salesmanName is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameEqualTo(String value) {
            addCriterion("salesmanName =", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameNotEqualTo(String value) {
            addCriterion("salesmanName <>", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameGreaterThan(String value) {
            addCriterion("salesmanName >", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameGreaterThanOrEqualTo(String value) {
            addCriterion("salesmanName >=", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameLessThan(String value) {
            addCriterion("salesmanName <", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameLessThanOrEqualTo(String value) {
            addCriterion("salesmanName <=", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameLike(String value) {
            addCriterion("salesmanName like", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameNotLike(String value) {
            addCriterion("salesmanName not like", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameIn(List<String> values) {
            addCriterion("salesmanName in", values, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameNotIn(List<String> values) {
            addCriterion("salesmanName not in", values, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameBetween(String value1, String value2) {
            addCriterion("salesmanName between", value1, value2, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameNotBetween(String value1, String value2) {
            addCriterion("salesmanName not between", value1, value2, "salesmanName");
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

        public Criteria andHasReturnEqualTo(Boolean value) {
            addCriterion("hasReturn =", value, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andHasReturnNotEqualTo(Boolean value) {
            addCriterion("hasReturn <>", value, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andHasReturnGreaterThan(Boolean value) {
            addCriterion("hasReturn >", value, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andHasReturnGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasReturn >=", value, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andHasReturnLessThan(Boolean value) {
            addCriterion("hasReturn <", value, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andHasReturnLessThanOrEqualTo(Boolean value) {
            addCriterion("hasReturn <=", value, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andHasReturnIn(List<Boolean> values) {
            addCriterion("hasReturn in", values, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andHasReturnNotIn(List<Boolean> values) {
            addCriterion("hasReturn not in", values, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andHasReturnBetween(Boolean value1, Boolean value2) {
            addCriterion("hasReturn between", value1, value2, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andHasReturnNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasReturn not between", value1, value2, "hasReturn");
            return (Criteria) this;
        }

        public Criteria andOrgItemIdIsNull() {
            addCriterion("orgItemId is null");
            return (Criteria) this;
        }

        public Criteria andOrgItemIdIsNotNull() {
            addCriterion("orgItemId is not null");
            return (Criteria) this;
        }

        public Criteria andOrgItemIdEqualTo(Integer value) {
            addCriterion("orgItemId =", value, "orgItemId");
            return (Criteria) this;
        }

        public Criteria andOrgItemIdNotEqualTo(Integer value) {
            addCriterion("orgItemId <>", value, "orgItemId");
            return (Criteria) this;
        }

        public Criteria andOrgItemIdGreaterThan(Integer value) {
            addCriterion("orgItemId >", value, "orgItemId");
            return (Criteria) this;
        }

        public Criteria andOrgItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orgItemId >=", value, "orgItemId");
            return (Criteria) this;
        }

        public Criteria andOrgItemIdLessThan(Integer value) {
            addCriterion("orgItemId <", value, "orgItemId");
            return (Criteria) this;
        }

        public Criteria andOrgItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("orgItemId <=", value, "orgItemId");
            return (Criteria) this;
        }

        public Criteria andOrgItemIdIn(List<Integer> values) {
            addCriterion("orgItemId in", values, "orgItemId");
            return (Criteria) this;
        }

        public Criteria andOrgItemIdNotIn(List<Integer> values) {
            addCriterion("orgItemId not in", values, "orgItemId");
            return (Criteria) this;
        }

        public Criteria andOrgItemIdBetween(Integer value1, Integer value2) {
            addCriterion("orgItemId between", value1, value2, "orgItemId");
            return (Criteria) this;
        }

        public Criteria andOrgItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orgItemId not between", value1, value2, "orgItemId");
            return (Criteria) this;
        }

        public Criteria andOrgLabelPriceIsNull() {
            addCriterion("orgLabelPrice is null");
            return (Criteria) this;
        }

        public Criteria andOrgLabelPriceIsNotNull() {
            addCriterion("orgLabelPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLabelPriceEqualTo(Double value) {
            addCriterion("orgLabelPrice =", value, "orgLabelPrice");
            return (Criteria) this;
        }

        public Criteria andOrgLabelPriceNotEqualTo(Double value) {
            addCriterion("orgLabelPrice <>", value, "orgLabelPrice");
            return (Criteria) this;
        }

        public Criteria andOrgLabelPriceGreaterThan(Double value) {
            addCriterion("orgLabelPrice >", value, "orgLabelPrice");
            return (Criteria) this;
        }

        public Criteria andOrgLabelPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("orgLabelPrice >=", value, "orgLabelPrice");
            return (Criteria) this;
        }

        public Criteria andOrgLabelPriceLessThan(Double value) {
            addCriterion("orgLabelPrice <", value, "orgLabelPrice");
            return (Criteria) this;
        }

        public Criteria andOrgLabelPriceLessThanOrEqualTo(Double value) {
            addCriterion("orgLabelPrice <=", value, "orgLabelPrice");
            return (Criteria) this;
        }

        public Criteria andOrgLabelPriceIn(List<Double> values) {
            addCriterion("orgLabelPrice in", values, "orgLabelPrice");
            return (Criteria) this;
        }

        public Criteria andOrgLabelPriceNotIn(List<Double> values) {
            addCriterion("orgLabelPrice not in", values, "orgLabelPrice");
            return (Criteria) this;
        }

        public Criteria andOrgLabelPriceBetween(Double value1, Double value2) {
            addCriterion("orgLabelPrice between", value1, value2, "orgLabelPrice");
            return (Criteria) this;
        }

        public Criteria andOrgLabelPriceNotBetween(Double value1, Double value2) {
            addCriterion("orgLabelPrice not between", value1, value2, "orgLabelPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSettlementPriceIsNull() {
            addCriterion("orgSettlementPrice is null");
            return (Criteria) this;
        }

        public Criteria andOrgSettlementPriceIsNotNull() {
            addCriterion("orgSettlementPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSettlementPriceEqualTo(Double value) {
            addCriterion("orgSettlementPrice =", value, "orgSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSettlementPriceNotEqualTo(Double value) {
            addCriterion("orgSettlementPrice <>", value, "orgSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSettlementPriceGreaterThan(Double value) {
            addCriterion("orgSettlementPrice >", value, "orgSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSettlementPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("orgSettlementPrice >=", value, "orgSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSettlementPriceLessThan(Double value) {
            addCriterion("orgSettlementPrice <", value, "orgSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSettlementPriceLessThanOrEqualTo(Double value) {
            addCriterion("orgSettlementPrice <=", value, "orgSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSettlementPriceIn(List<Double> values) {
            addCriterion("orgSettlementPrice in", values, "orgSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSettlementPriceNotIn(List<Double> values) {
            addCriterion("orgSettlementPrice not in", values, "orgSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSettlementPriceBetween(Double value1, Double value2) {
            addCriterion("orgSettlementPrice between", value1, value2, "orgSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSettlementPriceNotBetween(Double value1, Double value2) {
            addCriterion("orgSettlementPrice not between", value1, value2, "orgSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andIncrementMoneyIsNull() {
            addCriterion("incrementMoney is null");
            return (Criteria) this;
        }

        public Criteria andIncrementMoneyIsNotNull() {
            addCriterion("incrementMoney is not null");
            return (Criteria) this;
        }

        public Criteria andIncrementMoneyEqualTo(Double value) {
            addCriterion("incrementMoney =", value, "incrementMoney");
            return (Criteria) this;
        }

        public Criteria andIncrementMoneyNotEqualTo(Double value) {
            addCriterion("incrementMoney <>", value, "incrementMoney");
            return (Criteria) this;
        }

        public Criteria andIncrementMoneyGreaterThan(Double value) {
            addCriterion("incrementMoney >", value, "incrementMoney");
            return (Criteria) this;
        }

        public Criteria andIncrementMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("incrementMoney >=", value, "incrementMoney");
            return (Criteria) this;
        }

        public Criteria andIncrementMoneyLessThan(Double value) {
            addCriterion("incrementMoney <", value, "incrementMoney");
            return (Criteria) this;
        }

        public Criteria andIncrementMoneyLessThanOrEqualTo(Double value) {
            addCriterion("incrementMoney <=", value, "incrementMoney");
            return (Criteria) this;
        }

        public Criteria andIncrementMoneyIn(List<Double> values) {
            addCriterion("incrementMoney in", values, "incrementMoney");
            return (Criteria) this;
        }

        public Criteria andIncrementMoneyNotIn(List<Double> values) {
            addCriterion("incrementMoney not in", values, "incrementMoney");
            return (Criteria) this;
        }

        public Criteria andIncrementMoneyBetween(Double value1, Double value2) {
            addCriterion("incrementMoney between", value1, value2, "incrementMoney");
            return (Criteria) this;
        }

        public Criteria andIncrementMoneyNotBetween(Double value1, Double value2) {
            addCriterion("incrementMoney not between", value1, value2, "incrementMoney");
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

        public Criteria andSubTypeIsNull() {
            addCriterion("subType is null");
            return (Criteria) this;
        }

        public Criteria andSubTypeIsNotNull() {
            addCriterion("subType is not null");
            return (Criteria) this;
        }

        public Criteria andSubTypeEqualTo(Integer value) {
            addCriterion("subType =", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotEqualTo(Integer value) {
            addCriterion("subType <>", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeGreaterThan(Integer value) {
            addCriterion("subType >", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("subType >=", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeLessThan(Integer value) {
            addCriterion("subType <", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeLessThanOrEqualTo(Integer value) {
            addCriterion("subType <=", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeIn(List<Integer> values) {
            addCriterion("subType in", values, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotIn(List<Integer> values) {
            addCriterion("subType not in", values, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeBetween(Integer value1, Integer value2) {
            addCriterion("subType between", value1, value2, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("subType not between", value1, value2, "subType");
            return (Criteria) this;
        }

        public Criteria andSettleUnitPriceIsNull() {
            addCriterion("settleUnitPrice is null");
            return (Criteria) this;
        }

        public Criteria andSettleUnitPriceIsNotNull() {
            addCriterion("settleUnitPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSettleUnitPriceEqualTo(Double value) {
            addCriterion("settleUnitPrice =", value, "settleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSettleUnitPriceNotEqualTo(Double value) {
            addCriterion("settleUnitPrice <>", value, "settleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSettleUnitPriceGreaterThan(Double value) {
            addCriterion("settleUnitPrice >", value, "settleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSettleUnitPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("settleUnitPrice >=", value, "settleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSettleUnitPriceLessThan(Double value) {
            addCriterion("settleUnitPrice <", value, "settleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSettleUnitPriceLessThanOrEqualTo(Double value) {
            addCriterion("settleUnitPrice <=", value, "settleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSettleUnitPriceIn(List<Double> values) {
            addCriterion("settleUnitPrice in", values, "settleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSettleUnitPriceNotIn(List<Double> values) {
            addCriterion("settleUnitPrice not in", values, "settleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSettleUnitPriceBetween(Double value1, Double value2) {
            addCriterion("settleUnitPrice between", value1, value2, "settleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSettleUnitPriceNotBetween(Double value1, Double value2) {
            addCriterion("settleUnitPrice not between", value1, value2, "settleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSettleTotalMoneyIsNull() {
            addCriterion("settleTotalMoney is null");
            return (Criteria) this;
        }

        public Criteria andSettleTotalMoneyIsNotNull() {
            addCriterion("settleTotalMoney is not null");
            return (Criteria) this;
        }

        public Criteria andSettleTotalMoneyEqualTo(Double value) {
            addCriterion("settleTotalMoney =", value, "settleTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSettleTotalMoneyNotEqualTo(Double value) {
            addCriterion("settleTotalMoney <>", value, "settleTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSettleTotalMoneyGreaterThan(Double value) {
            addCriterion("settleTotalMoney >", value, "settleTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSettleTotalMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("settleTotalMoney >=", value, "settleTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSettleTotalMoneyLessThan(Double value) {
            addCriterion("settleTotalMoney <", value, "settleTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSettleTotalMoneyLessThanOrEqualTo(Double value) {
            addCriterion("settleTotalMoney <=", value, "settleTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSettleTotalMoneyIn(List<Double> values) {
            addCriterion("settleTotalMoney in", values, "settleTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSettleTotalMoneyNotIn(List<Double> values) {
            addCriterion("settleTotalMoney not in", values, "settleTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSettleTotalMoneyBetween(Double value1, Double value2) {
            addCriterion("settleTotalMoney between", value1, value2, "settleTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSettleTotalMoneyNotBetween(Double value1, Double value2) {
            addCriterion("settleTotalMoney not between", value1, value2, "settleTotalMoney");
            return (Criteria) this;
        }

        public Criteria andJoinCalculateIsNull() {
            addCriterion("joinCalculate is null");
            return (Criteria) this;
        }

        public Criteria andJoinCalculateIsNotNull() {
            addCriterion("joinCalculate is not null");
            return (Criteria) this;
        }

        public Criteria andJoinCalculateEqualTo(Integer value) {
            addCriterion("joinCalculate =", value, "joinCalculate");
            return (Criteria) this;
        }

        public Criteria andJoinCalculateNotEqualTo(Integer value) {
            addCriterion("joinCalculate <>", value, "joinCalculate");
            return (Criteria) this;
        }

        public Criteria andJoinCalculateGreaterThan(Integer value) {
            addCriterion("joinCalculate >", value, "joinCalculate");
            return (Criteria) this;
        }

        public Criteria andJoinCalculateGreaterThanOrEqualTo(Integer value) {
            addCriterion("joinCalculate >=", value, "joinCalculate");
            return (Criteria) this;
        }

        public Criteria andJoinCalculateLessThan(Integer value) {
            addCriterion("joinCalculate <", value, "joinCalculate");
            return (Criteria) this;
        }

        public Criteria andJoinCalculateLessThanOrEqualTo(Integer value) {
            addCriterion("joinCalculate <=", value, "joinCalculate");
            return (Criteria) this;
        }

        public Criteria andJoinCalculateIn(List<Integer> values) {
            addCriterion("joinCalculate in", values, "joinCalculate");
            return (Criteria) this;
        }

        public Criteria andJoinCalculateNotIn(List<Integer> values) {
            addCriterion("joinCalculate not in", values, "joinCalculate");
            return (Criteria) this;
        }

        public Criteria andJoinCalculateBetween(Integer value1, Integer value2) {
            addCriterion("joinCalculate between", value1, value2, "joinCalculate");
            return (Criteria) this;
        }

        public Criteria andJoinCalculateNotBetween(Integer value1, Integer value2) {
            addCriterion("joinCalculate not between", value1, value2, "joinCalculate");
            return (Criteria) this;
        }

        public Criteria andPointItemIsNull() {
            addCriterion("pointItem is null");
            return (Criteria) this;
        }

        public Criteria andPointItemIsNotNull() {
            addCriterion("pointItem is not null");
            return (Criteria) this;
        }

        public Criteria andPointItemEqualTo(Integer value) {
            addCriterion("pointItem =", value, "pointItem");
            return (Criteria) this;
        }

        public Criteria andPointItemNotEqualTo(Integer value) {
            addCriterion("pointItem <>", value, "pointItem");
            return (Criteria) this;
        }

        public Criteria andPointItemGreaterThan(Integer value) {
            addCriterion("pointItem >", value, "pointItem");
            return (Criteria) this;
        }

        public Criteria andPointItemGreaterThanOrEqualTo(Integer value) {
            addCriterion("pointItem >=", value, "pointItem");
            return (Criteria) this;
        }

        public Criteria andPointItemLessThan(Integer value) {
            addCriterion("pointItem <", value, "pointItem");
            return (Criteria) this;
        }

        public Criteria andPointItemLessThanOrEqualTo(Integer value) {
            addCriterion("pointItem <=", value, "pointItem");
            return (Criteria) this;
        }

        public Criteria andPointItemIn(List<Integer> values) {
            addCriterion("pointItem in", values, "pointItem");
            return (Criteria) this;
        }

        public Criteria andPointItemNotIn(List<Integer> values) {
            addCriterion("pointItem not in", values, "pointItem");
            return (Criteria) this;
        }

        public Criteria andPointItemBetween(Integer value1, Integer value2) {
            addCriterion("pointItem between", value1, value2, "pointItem");
            return (Criteria) this;
        }

        public Criteria andPointItemNotBetween(Integer value1, Integer value2) {
            addCriterion("pointItem not between", value1, value2, "pointItem");
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

        public Criteria andRecyleGoodsAgioIsNull() {
            addCriterion("recyleGoodsAgio is null");
            return (Criteria) this;
        }

        public Criteria andRecyleGoodsAgioIsNotNull() {
            addCriterion("recyleGoodsAgio is not null");
            return (Criteria) this;
        }

        public Criteria andRecyleGoodsAgioEqualTo(Double value) {
            addCriterion("recyleGoodsAgio =", value, "recyleGoodsAgio");
            return (Criteria) this;
        }

        public Criteria andRecyleGoodsAgioNotEqualTo(Double value) {
            addCriterion("recyleGoodsAgio <>", value, "recyleGoodsAgio");
            return (Criteria) this;
        }

        public Criteria andRecyleGoodsAgioGreaterThan(Double value) {
            addCriterion("recyleGoodsAgio >", value, "recyleGoodsAgio");
            return (Criteria) this;
        }

        public Criteria andRecyleGoodsAgioGreaterThanOrEqualTo(Double value) {
            addCriterion("recyleGoodsAgio >=", value, "recyleGoodsAgio");
            return (Criteria) this;
        }

        public Criteria andRecyleGoodsAgioLessThan(Double value) {
            addCriterion("recyleGoodsAgio <", value, "recyleGoodsAgio");
            return (Criteria) this;
        }

        public Criteria andRecyleGoodsAgioLessThanOrEqualTo(Double value) {
            addCriterion("recyleGoodsAgio <=", value, "recyleGoodsAgio");
            return (Criteria) this;
        }

        public Criteria andRecyleGoodsAgioIn(List<Double> values) {
            addCriterion("recyleGoodsAgio in", values, "recyleGoodsAgio");
            return (Criteria) this;
        }

        public Criteria andRecyleGoodsAgioNotIn(List<Double> values) {
            addCriterion("recyleGoodsAgio not in", values, "recyleGoodsAgio");
            return (Criteria) this;
        }

        public Criteria andRecyleGoodsAgioBetween(Double value1, Double value2) {
            addCriterion("recyleGoodsAgio between", value1, value2, "recyleGoodsAgio");
            return (Criteria) this;
        }

        public Criteria andRecyleGoodsAgioNotBetween(Double value1, Double value2) {
            addCriterion("recyleGoodsAgio not between", value1, value2, "recyleGoodsAgio");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreIdIsNull() {
            addCriterion("exchangeStoreId is null");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreIdIsNotNull() {
            addCriterion("exchangeStoreId is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreIdEqualTo(Integer value) {
            addCriterion("exchangeStoreId =", value, "exchangeStoreId");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreIdNotEqualTo(Integer value) {
            addCriterion("exchangeStoreId <>", value, "exchangeStoreId");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreIdGreaterThan(Integer value) {
            addCriterion("exchangeStoreId >", value, "exchangeStoreId");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchangeStoreId >=", value, "exchangeStoreId");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreIdLessThan(Integer value) {
            addCriterion("exchangeStoreId <", value, "exchangeStoreId");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("exchangeStoreId <=", value, "exchangeStoreId");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreIdIn(List<Integer> values) {
            addCriterion("exchangeStoreId in", values, "exchangeStoreId");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreIdNotIn(List<Integer> values) {
            addCriterion("exchangeStoreId not in", values, "exchangeStoreId");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("exchangeStoreId between", value1, value2, "exchangeStoreId");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exchangeStoreId not between", value1, value2, "exchangeStoreId");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreNameIsNull() {
            addCriterion("exchangeStoreName is null");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreNameIsNotNull() {
            addCriterion("exchangeStoreName is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreNameEqualTo(String value) {
            addCriterion("exchangeStoreName =", value, "exchangeStoreName");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreNameNotEqualTo(String value) {
            addCriterion("exchangeStoreName <>", value, "exchangeStoreName");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreNameGreaterThan(String value) {
            addCriterion("exchangeStoreName >", value, "exchangeStoreName");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("exchangeStoreName >=", value, "exchangeStoreName");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreNameLessThan(String value) {
            addCriterion("exchangeStoreName <", value, "exchangeStoreName");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreNameLessThanOrEqualTo(String value) {
            addCriterion("exchangeStoreName <=", value, "exchangeStoreName");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreNameLike(String value) {
            addCriterion("exchangeStoreName like", value, "exchangeStoreName");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreNameNotLike(String value) {
            addCriterion("exchangeStoreName not like", value, "exchangeStoreName");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreNameIn(List<String> values) {
            addCriterion("exchangeStoreName in", values, "exchangeStoreName");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreNameNotIn(List<String> values) {
            addCriterion("exchangeStoreName not in", values, "exchangeStoreName");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreNameBetween(String value1, String value2) {
            addCriterion("exchangeStoreName between", value1, value2, "exchangeStoreName");
            return (Criteria) this;
        }

        public Criteria andExchangeStoreNameNotBetween(String value1, String value2) {
            addCriterion("exchangeStoreName not between", value1, value2, "exchangeStoreName");
            return (Criteria) this;
        }

        public Criteria andSheetStatusIsNull() {
            addCriterion("sheetStatus is null");
            return (Criteria) this;
        }

        public Criteria andSheetStatusIsNotNull() {
            addCriterion("sheetStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSheetStatusEqualTo(Integer value) {
            addCriterion("sheetStatus =", value, "sheetStatus");
            return (Criteria) this;
        }

        public Criteria andSheetStatusNotEqualTo(Integer value) {
            addCriterion("sheetStatus <>", value, "sheetStatus");
            return (Criteria) this;
        }

        public Criteria andSheetStatusGreaterThan(Integer value) {
            addCriterion("sheetStatus >", value, "sheetStatus");
            return (Criteria) this;
        }

        public Criteria andSheetStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sheetStatus >=", value, "sheetStatus");
            return (Criteria) this;
        }

        public Criteria andSheetStatusLessThan(Integer value) {
            addCriterion("sheetStatus <", value, "sheetStatus");
            return (Criteria) this;
        }

        public Criteria andSheetStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sheetStatus <=", value, "sheetStatus");
            return (Criteria) this;
        }

        public Criteria andSheetStatusIn(List<Integer> values) {
            addCriterion("sheetStatus in", values, "sheetStatus");
            return (Criteria) this;
        }

        public Criteria andSheetStatusNotIn(List<Integer> values) {
            addCriterion("sheetStatus not in", values, "sheetStatus");
            return (Criteria) this;
        }

        public Criteria andSheetStatusBetween(Integer value1, Integer value2) {
            addCriterion("sheetStatus between", value1, value2, "sheetStatus");
            return (Criteria) this;
        }

        public Criteria andSheetStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sheetStatus not between", value1, value2, "sheetStatus");
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

        public Criteria andReceiveTimeEqualTo(Date value) {
            addCriterion("receiveTime =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Date value) {
            addCriterion("receiveTime <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Date value) {
            addCriterion("receiveTime >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receiveTime >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Date value) {
            addCriterion("receiveTime <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("receiveTime <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Date> values) {
            addCriterion("receiveTime in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Date> values) {
            addCriterion("receiveTime not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("receiveTime between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("receiveTime not between", value1, value2, "receiveTime");
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

        public Criteria andStoneRangeIsNull() {
            addCriterion("stoneRange is null");
            return (Criteria) this;
        }

        public Criteria andStoneRangeIsNotNull() {
            addCriterion("stoneRange is not null");
            return (Criteria) this;
        }

        public Criteria andStoneRangeEqualTo(String value) {
            addCriterion("stoneRange =", value, "stoneRange");
            return (Criteria) this;
        }

        public Criteria andStoneRangeNotEqualTo(String value) {
            addCriterion("stoneRange <>", value, "stoneRange");
            return (Criteria) this;
        }

        public Criteria andStoneRangeGreaterThan(String value) {
            addCriterion("stoneRange >", value, "stoneRange");
            return (Criteria) this;
        }

        public Criteria andStoneRangeGreaterThanOrEqualTo(String value) {
            addCriterion("stoneRange >=", value, "stoneRange");
            return (Criteria) this;
        }

        public Criteria andStoneRangeLessThan(String value) {
            addCriterion("stoneRange <", value, "stoneRange");
            return (Criteria) this;
        }

        public Criteria andStoneRangeLessThanOrEqualTo(String value) {
            addCriterion("stoneRange <=", value, "stoneRange");
            return (Criteria) this;
        }

        public Criteria andStoneRangeLike(String value) {
            addCriterion("stoneRange like", value, "stoneRange");
            return (Criteria) this;
        }

        public Criteria andStoneRangeNotLike(String value) {
            addCriterion("stoneRange not like", value, "stoneRange");
            return (Criteria) this;
        }

        public Criteria andStoneRangeIn(List<String> values) {
            addCriterion("stoneRange in", values, "stoneRange");
            return (Criteria) this;
        }

        public Criteria andStoneRangeNotIn(List<String> values) {
            addCriterion("stoneRange not in", values, "stoneRange");
            return (Criteria) this;
        }

        public Criteria andStoneRangeBetween(String value1, String value2) {
            addCriterion("stoneRange between", value1, value2, "stoneRange");
            return (Criteria) this;
        }

        public Criteria andStoneRangeNotBetween(String value1, String value2) {
            addCriterion("stoneRange not between", value1, value2, "stoneRange");
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
    }

    /**
     * bill_purchase_item
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * bill_purchase_item null
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