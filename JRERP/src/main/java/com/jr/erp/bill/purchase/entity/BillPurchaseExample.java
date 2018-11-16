package com.jr.erp.bill.purchase.entity;

import com.jr.erp.base.mybatis.BaseExample;
import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andCusMobileIsNull() {
            addCriterion("cusMobile is null");
            return (Criteria) this;
        }

        public Criteria andCusMobileIsNotNull() {
            addCriterion("cusMobile is not null");
            return (Criteria) this;
        }

        public Criteria andCusMobileEqualTo(String value) {
            addCriterion("cusMobile =", value, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileNotEqualTo(String value) {
            addCriterion("cusMobile <>", value, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileGreaterThan(String value) {
            addCriterion("cusMobile >", value, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileGreaterThanOrEqualTo(String value) {
            addCriterion("cusMobile >=", value, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileLessThan(String value) {
            addCriterion("cusMobile <", value, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileLessThanOrEqualTo(String value) {
            addCriterion("cusMobile <=", value, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileLike(String value) {
            addCriterion("cusMobile like", value, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileNotLike(String value) {
            addCriterion("cusMobile not like", value, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileIn(List<String> values) {
            addCriterion("cusMobile in", values, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileNotIn(List<String> values) {
            addCriterion("cusMobile not in", values, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileBetween(String value1, String value2) {
            addCriterion("cusMobile between", value1, value2, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileNotBetween(String value1, String value2) {
            addCriterion("cusMobile not between", value1, value2, "cusMobile");
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

        public Criteria andTotalLabelPriceIsNull() {
            addCriterion("totalLabelPrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalLabelPriceIsNotNull() {
            addCriterion("totalLabelPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLabelPriceEqualTo(Double value) {
            addCriterion("totalLabelPrice =", value, "totalLabelPrice");
            return (Criteria) this;
        }

        public Criteria andTotalLabelPriceNotEqualTo(Double value) {
            addCriterion("totalLabelPrice <>", value, "totalLabelPrice");
            return (Criteria) this;
        }

        public Criteria andTotalLabelPriceGreaterThan(Double value) {
            addCriterion("totalLabelPrice >", value, "totalLabelPrice");
            return (Criteria) this;
        }

        public Criteria andTotalLabelPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("totalLabelPrice >=", value, "totalLabelPrice");
            return (Criteria) this;
        }

        public Criteria andTotalLabelPriceLessThan(Double value) {
            addCriterion("totalLabelPrice <", value, "totalLabelPrice");
            return (Criteria) this;
        }

        public Criteria andTotalLabelPriceLessThanOrEqualTo(Double value) {
            addCriterion("totalLabelPrice <=", value, "totalLabelPrice");
            return (Criteria) this;
        }

        public Criteria andTotalLabelPriceIn(List<Double> values) {
            addCriterion("totalLabelPrice in", values, "totalLabelPrice");
            return (Criteria) this;
        }

        public Criteria andTotalLabelPriceNotIn(List<Double> values) {
            addCriterion("totalLabelPrice not in", values, "totalLabelPrice");
            return (Criteria) this;
        }

        public Criteria andTotalLabelPriceBetween(Double value1, Double value2) {
            addCriterion("totalLabelPrice between", value1, value2, "totalLabelPrice");
            return (Criteria) this;
        }

        public Criteria andTotalLabelPriceNotBetween(Double value1, Double value2) {
            addCriterion("totalLabelPrice not between", value1, value2, "totalLabelPrice");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNull() {
            addCriterion("totalCost is null");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNotNull() {
            addCriterion("totalCost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCostEqualTo(Double value) {
            addCriterion("totalCost =", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotEqualTo(Double value) {
            addCriterion("totalCost <>", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThan(Double value) {
            addCriterion("totalCost >", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThanOrEqualTo(Double value) {
            addCriterion("totalCost >=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThan(Double value) {
            addCriterion("totalCost <", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThanOrEqualTo(Double value) {
            addCriterion("totalCost <=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIn(List<Double> values) {
            addCriterion("totalCost in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotIn(List<Double> values) {
            addCriterion("totalCost not in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostBetween(Double value1, Double value2) {
            addCriterion("totalCost between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotBetween(Double value1, Double value2) {
            addCriterion("totalCost not between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalWorkFeeIsNull() {
            addCriterion("totalWorkFee is null");
            return (Criteria) this;
        }

        public Criteria andTotalWorkFeeIsNotNull() {
            addCriterion("totalWorkFee is not null");
            return (Criteria) this;
        }

        public Criteria andTotalWorkFeeEqualTo(Double value) {
            addCriterion("totalWorkFee =", value, "totalWorkFee");
            return (Criteria) this;
        }

        public Criteria andTotalWorkFeeNotEqualTo(Double value) {
            addCriterion("totalWorkFee <>", value, "totalWorkFee");
            return (Criteria) this;
        }

        public Criteria andTotalWorkFeeGreaterThan(Double value) {
            addCriterion("totalWorkFee >", value, "totalWorkFee");
            return (Criteria) this;
        }

        public Criteria andTotalWorkFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("totalWorkFee >=", value, "totalWorkFee");
            return (Criteria) this;
        }

        public Criteria andTotalWorkFeeLessThan(Double value) {
            addCriterion("totalWorkFee <", value, "totalWorkFee");
            return (Criteria) this;
        }

        public Criteria andTotalWorkFeeLessThanOrEqualTo(Double value) {
            addCriterion("totalWorkFee <=", value, "totalWorkFee");
            return (Criteria) this;
        }

        public Criteria andTotalWorkFeeIn(List<Double> values) {
            addCriterion("totalWorkFee in", values, "totalWorkFee");
            return (Criteria) this;
        }

        public Criteria andTotalWorkFeeNotIn(List<Double> values) {
            addCriterion("totalWorkFee not in", values, "totalWorkFee");
            return (Criteria) this;
        }

        public Criteria andTotalWorkFeeBetween(Double value1, Double value2) {
            addCriterion("totalWorkFee between", value1, value2, "totalWorkFee");
            return (Criteria) this;
        }

        public Criteria andTotalWorkFeeNotBetween(Double value1, Double value2) {
            addCriterion("totalWorkFee not between", value1, value2, "totalWorkFee");
            return (Criteria) this;
        }

        public Criteria andTotaJewelWeightIsNull() {
            addCriterion("totaJewelWeight is null");
            return (Criteria) this;
        }

        public Criteria andTotaJewelWeightIsNotNull() {
            addCriterion("totaJewelWeight is not null");
            return (Criteria) this;
        }

        public Criteria andTotaJewelWeightEqualTo(Double value) {
            addCriterion("totaJewelWeight =", value, "totaJewelWeight");
            return (Criteria) this;
        }

        public Criteria andTotaJewelWeightNotEqualTo(Double value) {
            addCriterion("totaJewelWeight <>", value, "totaJewelWeight");
            return (Criteria) this;
        }

        public Criteria andTotaJewelWeightGreaterThan(Double value) {
            addCriterion("totaJewelWeight >", value, "totaJewelWeight");
            return (Criteria) this;
        }

        public Criteria andTotaJewelWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("totaJewelWeight >=", value, "totaJewelWeight");
            return (Criteria) this;
        }

        public Criteria andTotaJewelWeightLessThan(Double value) {
            addCriterion("totaJewelWeight <", value, "totaJewelWeight");
            return (Criteria) this;
        }

        public Criteria andTotaJewelWeightLessThanOrEqualTo(Double value) {
            addCriterion("totaJewelWeight <=", value, "totaJewelWeight");
            return (Criteria) this;
        }

        public Criteria andTotaJewelWeightIn(List<Double> values) {
            addCriterion("totaJewelWeight in", values, "totaJewelWeight");
            return (Criteria) this;
        }

        public Criteria andTotaJewelWeightNotIn(List<Double> values) {
            addCriterion("totaJewelWeight not in", values, "totaJewelWeight");
            return (Criteria) this;
        }

        public Criteria andTotaJewelWeightBetween(Double value1, Double value2) {
            addCriterion("totaJewelWeight between", value1, value2, "totaJewelWeight");
            return (Criteria) this;
        }

        public Criteria andTotaJewelWeightNotBetween(Double value1, Double value2) {
            addCriterion("totaJewelWeight not between", value1, value2, "totaJewelWeight");
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

        public Criteria andInTypeIsNull() {
            addCriterion("inType is null");
            return (Criteria) this;
        }

        public Criteria andInTypeIsNotNull() {
            addCriterion("inType is not null");
            return (Criteria) this;
        }

        public Criteria andInTypeEqualTo(Boolean value) {
            addCriterion("inType =", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeNotEqualTo(Boolean value) {
            addCriterion("inType <>", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeGreaterThan(Boolean value) {
            addCriterion("inType >", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("inType >=", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeLessThan(Boolean value) {
            addCriterion("inType <", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("inType <=", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeIn(List<Boolean> values) {
            addCriterion("inType in", values, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeNotIn(List<Boolean> values) {
            addCriterion("inType not in", values, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("inType between", value1, value2, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("inType not between", value1, value2, "inType");
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

        public Criteria andAuditTimeEqualTo(String value) {
            addCriterion("auditTime =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(String value) {
            addCriterion("auditTime <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(String value) {
            addCriterion("auditTime >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(String value) {
            addCriterion("auditTime >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(String value) {
            addCriterion("auditTime <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(String value) {
            addCriterion("auditTime <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLike(String value) {
            addCriterion("auditTime like", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotLike(String value) {
            addCriterion("auditTime not like", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<String> values) {
            addCriterion("auditTime in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<String> values) {
            addCriterion("auditTime not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(String value1, String value2) {
            addCriterion("auditTime between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(String value1, String value2) {
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