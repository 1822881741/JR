package com.jr.erp.bill.purchase.entity;

import com.jr.erp.base.mybatis.BaseExample;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BillPurchaseExample extends BaseExample {
    /**
     * bill_purchase
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public BillPurchaseExample() {
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
     * bill_purchase null
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andOrgSheetIdIsNull() {
            addCriterion("orgSheetId is null");
            return (Criteria) this;
        }

        public Criteria andOrgSheetIdIsNotNull() {
            addCriterion("orgSheetId is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSheetIdEqualTo(Integer value) {
            addCriterion("orgSheetId =", value, "orgSheetId");
            return (Criteria) this;
        }

        public Criteria andOrgSheetIdNotEqualTo(Integer value) {
            addCriterion("orgSheetId <>", value, "orgSheetId");
            return (Criteria) this;
        }

        public Criteria andOrgSheetIdGreaterThan(Integer value) {
            addCriterion("orgSheetId >", value, "orgSheetId");
            return (Criteria) this;
        }

        public Criteria andOrgSheetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orgSheetId >=", value, "orgSheetId");
            return (Criteria) this;
        }

        public Criteria andOrgSheetIdLessThan(Integer value) {
            addCriterion("orgSheetId <", value, "orgSheetId");
            return (Criteria) this;
        }

        public Criteria andOrgSheetIdLessThanOrEqualTo(Integer value) {
            addCriterion("orgSheetId <=", value, "orgSheetId");
            return (Criteria) this;
        }

        public Criteria andOrgSheetIdIn(List<Integer> values) {
            addCriterion("orgSheetId in", values, "orgSheetId");
            return (Criteria) this;
        }

        public Criteria andOrgSheetIdNotIn(List<Integer> values) {
            addCriterion("orgSheetId not in", values, "orgSheetId");
            return (Criteria) this;
        }

        public Criteria andOrgSheetIdBetween(Integer value1, Integer value2) {
            addCriterion("orgSheetId between", value1, value2, "orgSheetId");
            return (Criteria) this;
        }

        public Criteria andOrgSheetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orgSheetId not between", value1, value2, "orgSheetId");
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

        public Criteria andSheetNoIsNull() {
            addCriterion("sheetNo is null");
            return (Criteria) this;
        }

        public Criteria andSheetNoIsNotNull() {
            addCriterion("sheetNo is not null");
            return (Criteria) this;
        }

        public Criteria andSheetNoEqualTo(String value) {
            addCriterion("sheetNo =", value, "sheetNo");
            return (Criteria) this;
        }

        public Criteria andSheetNoNotEqualTo(String value) {
            addCriterion("sheetNo <>", value, "sheetNo");
            return (Criteria) this;
        }

        public Criteria andSheetNoGreaterThan(String value) {
            addCriterion("sheetNo >", value, "sheetNo");
            return (Criteria) this;
        }

        public Criteria andSheetNoGreaterThanOrEqualTo(String value) {
            addCriterion("sheetNo >=", value, "sheetNo");
            return (Criteria) this;
        }

        public Criteria andSheetNoLessThan(String value) {
            addCriterion("sheetNo <", value, "sheetNo");
            return (Criteria) this;
        }

        public Criteria andSheetNoLessThanOrEqualTo(String value) {
            addCriterion("sheetNo <=", value, "sheetNo");
            return (Criteria) this;
        }

        public Criteria andSheetNoLike(String value) {
            addCriterion("sheetNo like", value, "sheetNo");
            return (Criteria) this;
        }

        public Criteria andSheetNoNotLike(String value) {
            addCriterion("sheetNo not like", value, "sheetNo");
            return (Criteria) this;
        }

        public Criteria andSheetNoIn(List<String> values) {
            addCriterion("sheetNo in", values, "sheetNo");
            return (Criteria) this;
        }

        public Criteria andSheetNoNotIn(List<String> values) {
            addCriterion("sheetNo not in", values, "sheetNo");
            return (Criteria) this;
        }

        public Criteria andSheetNoBetween(String value1, String value2) {
            addCriterion("sheetNo between", value1, value2, "sheetNo");
            return (Criteria) this;
        }

        public Criteria andSheetNoNotBetween(String value1, String value2) {
            addCriterion("sheetNo not between", value1, value2, "sheetNo");
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

        public Criteria andTotalNumIsNull() {
            addCriterion("totalNum is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("totalNum is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(Integer value) {
            addCriterion("totalNum =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(Integer value) {
            addCriterion("totalNum <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(Integer value) {
            addCriterion("totalNum >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalNum >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(Integer value) {
            addCriterion("totalNum <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("totalNum <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<Integer> values) {
            addCriterion("totalNum in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<Integer> values) {
            addCriterion("totalNum not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("totalNum between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("totalNum not between", value1, value2, "totalNum");
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

        public Criteria andTotalSalePriceAmountIsNull() {
            addCriterion("totalSalePriceAmount is null");
            return (Criteria) this;
        }

        public Criteria andTotalSalePriceAmountIsNotNull() {
            addCriterion("totalSalePriceAmount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSalePriceAmountEqualTo(Double value) {
            addCriterion("totalSalePriceAmount =", value, "totalSalePriceAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSalePriceAmountNotEqualTo(Double value) {
            addCriterion("totalSalePriceAmount <>", value, "totalSalePriceAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSalePriceAmountGreaterThan(Double value) {
            addCriterion("totalSalePriceAmount >", value, "totalSalePriceAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSalePriceAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("totalSalePriceAmount >=", value, "totalSalePriceAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSalePriceAmountLessThan(Double value) {
            addCriterion("totalSalePriceAmount <", value, "totalSalePriceAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSalePriceAmountLessThanOrEqualTo(Double value) {
            addCriterion("totalSalePriceAmount <=", value, "totalSalePriceAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSalePriceAmountIn(List<Double> values) {
            addCriterion("totalSalePriceAmount in", values, "totalSalePriceAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSalePriceAmountNotIn(List<Double> values) {
            addCriterion("totalSalePriceAmount not in", values, "totalSalePriceAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSalePriceAmountBetween(Double value1, Double value2) {
            addCriterion("totalSalePriceAmount between", value1, value2, "totalSalePriceAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSalePriceAmountNotBetween(Double value1, Double value2) {
            addCriterion("totalSalePriceAmount not between", value1, value2, "totalSalePriceAmount");
            return (Criteria) this;
        }

        public Criteria andTotalMainStoneWeightIsNull() {
            addCriterion("totalMainStoneWeight is null");
            return (Criteria) this;
        }

        public Criteria andTotalMainStoneWeightIsNotNull() {
            addCriterion("totalMainStoneWeight is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMainStoneWeightEqualTo(Double value) {
            addCriterion("totalMainStoneWeight =", value, "totalMainStoneWeight");
            return (Criteria) this;
        }

        public Criteria andTotalMainStoneWeightNotEqualTo(Double value) {
            addCriterion("totalMainStoneWeight <>", value, "totalMainStoneWeight");
            return (Criteria) this;
        }

        public Criteria andTotalMainStoneWeightGreaterThan(Double value) {
            addCriterion("totalMainStoneWeight >", value, "totalMainStoneWeight");
            return (Criteria) this;
        }

        public Criteria andTotalMainStoneWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("totalMainStoneWeight >=", value, "totalMainStoneWeight");
            return (Criteria) this;
        }

        public Criteria andTotalMainStoneWeightLessThan(Double value) {
            addCriterion("totalMainStoneWeight <", value, "totalMainStoneWeight");
            return (Criteria) this;
        }

        public Criteria andTotalMainStoneWeightLessThanOrEqualTo(Double value) {
            addCriterion("totalMainStoneWeight <=", value, "totalMainStoneWeight");
            return (Criteria) this;
        }

        public Criteria andTotalMainStoneWeightIn(List<Double> values) {
            addCriterion("totalMainStoneWeight in", values, "totalMainStoneWeight");
            return (Criteria) this;
        }

        public Criteria andTotalMainStoneWeightNotIn(List<Double> values) {
            addCriterion("totalMainStoneWeight not in", values, "totalMainStoneWeight");
            return (Criteria) this;
        }

        public Criteria andTotalMainStoneWeightBetween(Double value1, Double value2) {
            addCriterion("totalMainStoneWeight between", value1, value2, "totalMainStoneWeight");
            return (Criteria) this;
        }

        public Criteria andTotalMainStoneWeightNotBetween(Double value1, Double value2) {
            addCriterion("totalMainStoneWeight not between", value1, value2, "totalMainStoneWeight");
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
            addCriterionForJDBCDate("sheetDate =", value, "sheetDate");
            return (Criteria) this;
        }

        public Criteria andSheetDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sheetDate <>", value, "sheetDate");
            return (Criteria) this;
        }

        public Criteria andSheetDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sheetDate >", value, "sheetDate");
            return (Criteria) this;
        }

        public Criteria andSheetDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sheetDate >=", value, "sheetDate");
            return (Criteria) this;
        }

        public Criteria andSheetDateLessThan(Date value) {
            addCriterionForJDBCDate("sheetDate <", value, "sheetDate");
            return (Criteria) this;
        }

        public Criteria andSheetDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sheetDate <=", value, "sheetDate");
            return (Criteria) this;
        }

        public Criteria andSheetDateIn(List<Date> values) {
            addCriterionForJDBCDate("sheetDate in", values, "sheetDate");
            return (Criteria) this;
        }

        public Criteria andSheetDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sheetDate not in", values, "sheetDate");
            return (Criteria) this;
        }

        public Criteria andSheetDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sheetDate between", value1, value2, "sheetDate");
            return (Criteria) this;
        }

        public Criteria andSheetDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sheetDate not between", value1, value2, "sheetDate");
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

        public Criteria andImportFlagIsNull() {
            addCriterion("importFlag is null");
            return (Criteria) this;
        }

        public Criteria andImportFlagIsNotNull() {
            addCriterion("importFlag is not null");
            return (Criteria) this;
        }

        public Criteria andImportFlagEqualTo(Boolean value) {
            addCriterion("importFlag =", value, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagNotEqualTo(Boolean value) {
            addCriterion("importFlag <>", value, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagGreaterThan(Boolean value) {
            addCriterion("importFlag >", value, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("importFlag >=", value, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagLessThan(Boolean value) {
            addCriterion("importFlag <", value, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("importFlag <=", value, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagIn(List<Boolean> values) {
            addCriterion("importFlag in", values, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagNotIn(List<Boolean> values) {
            addCriterion("importFlag not in", values, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("importFlag between", value1, value2, "importFlag");
            return (Criteria) this;
        }

        public Criteria andImportFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("importFlag not between", value1, value2, "importFlag");
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

        public Criteria andPiCiIsNull() {
            addCriterion("piCi is null");
            return (Criteria) this;
        }

        public Criteria andPiCiIsNotNull() {
            addCriterion("piCi is not null");
            return (Criteria) this;
        }

        public Criteria andPiCiEqualTo(Integer value) {
            addCriterion("piCi =", value, "piCi");
            return (Criteria) this;
        }

        public Criteria andPiCiNotEqualTo(Integer value) {
            addCriterion("piCi <>", value, "piCi");
            return (Criteria) this;
        }

        public Criteria andPiCiGreaterThan(Integer value) {
            addCriterion("piCi >", value, "piCi");
            return (Criteria) this;
        }

        public Criteria andPiCiGreaterThanOrEqualTo(Integer value) {
            addCriterion("piCi >=", value, "piCi");
            return (Criteria) this;
        }

        public Criteria andPiCiLessThan(Integer value) {
            addCriterion("piCi <", value, "piCi");
            return (Criteria) this;
        }

        public Criteria andPiCiLessThanOrEqualTo(Integer value) {
            addCriterion("piCi <=", value, "piCi");
            return (Criteria) this;
        }

        public Criteria andPiCiIn(List<Integer> values) {
            addCriterion("piCi in", values, "piCi");
            return (Criteria) this;
        }

        public Criteria andPiCiNotIn(List<Integer> values) {
            addCriterion("piCi not in", values, "piCi");
            return (Criteria) this;
        }

        public Criteria andPiCiBetween(Integer value1, Integer value2) {
            addCriterion("piCi between", value1, value2, "piCi");
            return (Criteria) this;
        }

        public Criteria andPiCiNotBetween(Integer value1, Integer value2) {
            addCriterion("piCi not between", value1, value2, "piCi");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andBlendFlagIsNull() {
            addCriterion("blendFlag is null");
            return (Criteria) this;
        }

        public Criteria andBlendFlagIsNotNull() {
            addCriterion("blendFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBlendFlagEqualTo(Integer value) {
            addCriterion("blendFlag =", value, "blendFlag");
            return (Criteria) this;
        }

        public Criteria andBlendFlagNotEqualTo(Integer value) {
            addCriterion("blendFlag <>", value, "blendFlag");
            return (Criteria) this;
        }

        public Criteria andBlendFlagGreaterThan(Integer value) {
            addCriterion("blendFlag >", value, "blendFlag");
            return (Criteria) this;
        }

        public Criteria andBlendFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("blendFlag >=", value, "blendFlag");
            return (Criteria) this;
        }

        public Criteria andBlendFlagLessThan(Integer value) {
            addCriterion("blendFlag <", value, "blendFlag");
            return (Criteria) this;
        }

        public Criteria andBlendFlagLessThanOrEqualTo(Integer value) {
            addCriterion("blendFlag <=", value, "blendFlag");
            return (Criteria) this;
        }

        public Criteria andBlendFlagIn(List<Integer> values) {
            addCriterion("blendFlag in", values, "blendFlag");
            return (Criteria) this;
        }

        public Criteria andBlendFlagNotIn(List<Integer> values) {
            addCriterion("blendFlag not in", values, "blendFlag");
            return (Criteria) this;
        }

        public Criteria andBlendFlagBetween(Integer value1, Integer value2) {
            addCriterion("blendFlag between", value1, value2, "blendFlag");
            return (Criteria) this;
        }

        public Criteria andBlendFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("blendFlag not between", value1, value2, "blendFlag");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("auditStatus is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("auditStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Integer value) {
            addCriterion("auditStatus =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Integer value) {
            addCriterion("auditStatus <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Integer value) {
            addCriterion("auditStatus >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("auditStatus >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Integer value) {
            addCriterion("auditStatus <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Integer value) {
            addCriterion("auditStatus <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Integer> values) {
            addCriterion("auditStatus in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Integer> values) {
            addCriterion("auditStatus not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Integer value1, Integer value2) {
            addCriterion("auditStatus between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("auditStatus not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserIdIsNull() {
            addCriterion("submitAuditUserId is null");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserIdIsNotNull() {
            addCriterion("submitAuditUserId is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserIdEqualTo(Integer value) {
            addCriterion("submitAuditUserId =", value, "submitAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserIdNotEqualTo(Integer value) {
            addCriterion("submitAuditUserId <>", value, "submitAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserIdGreaterThan(Integer value) {
            addCriterion("submitAuditUserId >", value, "submitAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("submitAuditUserId >=", value, "submitAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserIdLessThan(Integer value) {
            addCriterion("submitAuditUserId <", value, "submitAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("submitAuditUserId <=", value, "submitAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserIdIn(List<Integer> values) {
            addCriterion("submitAuditUserId in", values, "submitAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserIdNotIn(List<Integer> values) {
            addCriterion("submitAuditUserId not in", values, "submitAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserIdBetween(Integer value1, Integer value2) {
            addCriterion("submitAuditUserId between", value1, value2, "submitAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("submitAuditUserId not between", value1, value2, "submitAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserNameIsNull() {
            addCriterion("submitAuditUserName is null");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserNameIsNotNull() {
            addCriterion("submitAuditUserName is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserNameEqualTo(String value) {
            addCriterion("submitAuditUserName =", value, "submitAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserNameNotEqualTo(String value) {
            addCriterion("submitAuditUserName <>", value, "submitAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserNameGreaterThan(String value) {
            addCriterion("submitAuditUserName >", value, "submitAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("submitAuditUserName >=", value, "submitAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserNameLessThan(String value) {
            addCriterion("submitAuditUserName <", value, "submitAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserNameLessThanOrEqualTo(String value) {
            addCriterion("submitAuditUserName <=", value, "submitAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserNameLike(String value) {
            addCriterion("submitAuditUserName like", value, "submitAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserNameNotLike(String value) {
            addCriterion("submitAuditUserName not like", value, "submitAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserNameIn(List<String> values) {
            addCriterion("submitAuditUserName in", values, "submitAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserNameNotIn(List<String> values) {
            addCriterion("submitAuditUserName not in", values, "submitAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserNameBetween(String value1, String value2) {
            addCriterion("submitAuditUserName between", value1, value2, "submitAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditUserNameNotBetween(String value1, String value2) {
            addCriterion("submitAuditUserName not between", value1, value2, "submitAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditTimeIsNull() {
            addCriterion("submitAuditTime is null");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditTimeIsNotNull() {
            addCriterion("submitAuditTime is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditTimeEqualTo(Date value) {
            addCriterion("submitAuditTime =", value, "submitAuditTime");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditTimeNotEqualTo(Date value) {
            addCriterion("submitAuditTime <>", value, "submitAuditTime");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditTimeGreaterThan(Date value) {
            addCriterion("submitAuditTime >", value, "submitAuditTime");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submitAuditTime >=", value, "submitAuditTime");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditTimeLessThan(Date value) {
            addCriterion("submitAuditTime <", value, "submitAuditTime");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("submitAuditTime <=", value, "submitAuditTime");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditTimeIn(List<Date> values) {
            addCriterion("submitAuditTime in", values, "submitAuditTime");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditTimeNotIn(List<Date> values) {
            addCriterion("submitAuditTime not in", values, "submitAuditTime");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditTimeBetween(Date value1, Date value2) {
            addCriterion("submitAuditTime between", value1, value2, "submitAuditTime");
            return (Criteria) this;
        }

        public Criteria andSubmitAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("submitAuditTime not between", value1, value2, "submitAuditTime");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIsNull() {
            addCriterion("auditUserId is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIsNotNull() {
            addCriterion("auditUserId is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdEqualTo(Integer value) {
            addCriterion("auditUserId =", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotEqualTo(Integer value) {
            addCriterion("auditUserId <>", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdGreaterThan(Integer value) {
            addCriterion("auditUserId >", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("auditUserId >=", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLessThan(Integer value) {
            addCriterion("auditUserId <", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("auditUserId <=", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIn(List<Integer> values) {
            addCriterion("auditUserId in", values, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotIn(List<Integer> values) {
            addCriterion("auditUserId not in", values, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdBetween(Integer value1, Integer value2) {
            addCriterion("auditUserId between", value1, value2, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("auditUserId not between", value1, value2, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameIsNull() {
            addCriterion("auditUserName is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameIsNotNull() {
            addCriterion("auditUserName is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameEqualTo(String value) {
            addCriterion("auditUserName =", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotEqualTo(String value) {
            addCriterion("auditUserName <>", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameGreaterThan(String value) {
            addCriterion("auditUserName >", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("auditUserName >=", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameLessThan(String value) {
            addCriterion("auditUserName <", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameLessThanOrEqualTo(String value) {
            addCriterion("auditUserName <=", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameLike(String value) {
            addCriterion("auditUserName like", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotLike(String value) {
            addCriterion("auditUserName not like", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameIn(List<String> values) {
            addCriterion("auditUserName in", values, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotIn(List<String> values) {
            addCriterion("auditUserName not in", values, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameBetween(String value1, String value2) {
            addCriterion("auditUserName between", value1, value2, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotBetween(String value1, String value2) {
            addCriterion("auditUserName not between", value1, value2, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("auditTime is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("auditTime is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("auditTime =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("auditTime <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("auditTime >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auditTime >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("auditTime <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("auditTime <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("auditTime in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("auditTime not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("auditTime between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("auditTime not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditMsgIsNull() {
            addCriterion("auditMsg is null");
            return (Criteria) this;
        }

        public Criteria andAuditMsgIsNotNull() {
            addCriterion("auditMsg is not null");
            return (Criteria) this;
        }

        public Criteria andAuditMsgEqualTo(String value) {
            addCriterion("auditMsg =", value, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgNotEqualTo(String value) {
            addCriterion("auditMsg <>", value, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgGreaterThan(String value) {
            addCriterion("auditMsg >", value, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgGreaterThanOrEqualTo(String value) {
            addCriterion("auditMsg >=", value, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgLessThan(String value) {
            addCriterion("auditMsg <", value, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgLessThanOrEqualTo(String value) {
            addCriterion("auditMsg <=", value, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgLike(String value) {
            addCriterion("auditMsg like", value, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgNotLike(String value) {
            addCriterion("auditMsg not like", value, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgIn(List<String> values) {
            addCriterion("auditMsg in", values, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgNotIn(List<String> values) {
            addCriterion("auditMsg not in", values, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgBetween(String value1, String value2) {
            addCriterion("auditMsg between", value1, value2, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgNotBetween(String value1, String value2) {
            addCriterion("auditMsg not between", value1, value2, "auditMsg");
            return (Criteria) this;
        }
    }

    /**
     * bill_purchase
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * bill_purchase null
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