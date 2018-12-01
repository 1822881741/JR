package com.jr.erp.bill.stocktake.entity;

import com.jr.erp.base.mybatis.BaseExample;
import java.util.ArrayList;
import java.util.List;

public class BillStocktakeExample extends BaseExample {
    /**
     * bill_stocktake
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public BillStocktakeExample() {
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
     * bill_stocktake null
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

        public Criteria andCanViewAllIsNull() {
            addCriterion("canViewAll is null");
            return (Criteria) this;
        }

        public Criteria andCanViewAllIsNotNull() {
            addCriterion("canViewAll is not null");
            return (Criteria) this;
        }

        public Criteria andCanViewAllEqualTo(Integer value) {
            addCriterion("canViewAll =", value, "canViewAll");
            return (Criteria) this;
        }

        public Criteria andCanViewAllNotEqualTo(Integer value) {
            addCriterion("canViewAll <>", value, "canViewAll");
            return (Criteria) this;
        }

        public Criteria andCanViewAllGreaterThan(Integer value) {
            addCriterion("canViewAll >", value, "canViewAll");
            return (Criteria) this;
        }

        public Criteria andCanViewAllGreaterThanOrEqualTo(Integer value) {
            addCriterion("canViewAll >=", value, "canViewAll");
            return (Criteria) this;
        }

        public Criteria andCanViewAllLessThan(Integer value) {
            addCriterion("canViewAll <", value, "canViewAll");
            return (Criteria) this;
        }

        public Criteria andCanViewAllLessThanOrEqualTo(Integer value) {
            addCriterion("canViewAll <=", value, "canViewAll");
            return (Criteria) this;
        }

        public Criteria andCanViewAllIn(List<Integer> values) {
            addCriterion("canViewAll in", values, "canViewAll");
            return (Criteria) this;
        }

        public Criteria andCanViewAllNotIn(List<Integer> values) {
            addCriterion("canViewAll not in", values, "canViewAll");
            return (Criteria) this;
        }

        public Criteria andCanViewAllBetween(Integer value1, Integer value2) {
            addCriterion("canViewAll between", value1, value2, "canViewAll");
            return (Criteria) this;
        }

        public Criteria andCanViewAllNotBetween(Integer value1, Integer value2) {
            addCriterion("canViewAll not between", value1, value2, "canViewAll");
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

        public Criteria andAssignTakerIsNull() {
            addCriterion("assignTaker is null");
            return (Criteria) this;
        }

        public Criteria andAssignTakerIsNotNull() {
            addCriterion("assignTaker is not null");
            return (Criteria) this;
        }

        public Criteria andAssignTakerEqualTo(String value) {
            addCriterion("assignTaker =", value, "assignTaker");
            return (Criteria) this;
        }

        public Criteria andAssignTakerNotEqualTo(String value) {
            addCriterion("assignTaker <>", value, "assignTaker");
            return (Criteria) this;
        }

        public Criteria andAssignTakerGreaterThan(String value) {
            addCriterion("assignTaker >", value, "assignTaker");
            return (Criteria) this;
        }

        public Criteria andAssignTakerGreaterThanOrEqualTo(String value) {
            addCriterion("assignTaker >=", value, "assignTaker");
            return (Criteria) this;
        }

        public Criteria andAssignTakerLessThan(String value) {
            addCriterion("assignTaker <", value, "assignTaker");
            return (Criteria) this;
        }

        public Criteria andAssignTakerLessThanOrEqualTo(String value) {
            addCriterion("assignTaker <=", value, "assignTaker");
            return (Criteria) this;
        }

        public Criteria andAssignTakerLike(String value) {
            addCriterion("assignTaker like", value, "assignTaker");
            return (Criteria) this;
        }

        public Criteria andAssignTakerNotLike(String value) {
            addCriterion("assignTaker not like", value, "assignTaker");
            return (Criteria) this;
        }

        public Criteria andAssignTakerIn(List<String> values) {
            addCriterion("assignTaker in", values, "assignTaker");
            return (Criteria) this;
        }

        public Criteria andAssignTakerNotIn(List<String> values) {
            addCriterion("assignTaker not in", values, "assignTaker");
            return (Criteria) this;
        }

        public Criteria andAssignTakerBetween(String value1, String value2) {
            addCriterion("assignTaker between", value1, value2, "assignTaker");
            return (Criteria) this;
        }

        public Criteria andAssignTakerNotBetween(String value1, String value2) {
            addCriterion("assignTaker not between", value1, value2, "assignTaker");
            return (Criteria) this;
        }

        public Criteria andAssignTakerNameIsNull() {
            addCriterion("assignTakerName is null");
            return (Criteria) this;
        }

        public Criteria andAssignTakerNameIsNotNull() {
            addCriterion("assignTakerName is not null");
            return (Criteria) this;
        }

        public Criteria andAssignTakerNameEqualTo(String value) {
            addCriterion("assignTakerName =", value, "assignTakerName");
            return (Criteria) this;
        }

        public Criteria andAssignTakerNameNotEqualTo(String value) {
            addCriterion("assignTakerName <>", value, "assignTakerName");
            return (Criteria) this;
        }

        public Criteria andAssignTakerNameGreaterThan(String value) {
            addCriterion("assignTakerName >", value, "assignTakerName");
            return (Criteria) this;
        }

        public Criteria andAssignTakerNameGreaterThanOrEqualTo(String value) {
            addCriterion("assignTakerName >=", value, "assignTakerName");
            return (Criteria) this;
        }

        public Criteria andAssignTakerNameLessThan(String value) {
            addCriterion("assignTakerName <", value, "assignTakerName");
            return (Criteria) this;
        }

        public Criteria andAssignTakerNameLessThanOrEqualTo(String value) {
            addCriterion("assignTakerName <=", value, "assignTakerName");
            return (Criteria) this;
        }

        public Criteria andAssignTakerNameLike(String value) {
            addCriterion("assignTakerName like", value, "assignTakerName");
            return (Criteria) this;
        }

        public Criteria andAssignTakerNameNotLike(String value) {
            addCriterion("assignTakerName not like", value, "assignTakerName");
            return (Criteria) this;
        }

        public Criteria andAssignTakerNameIn(List<String> values) {
            addCriterion("assignTakerName in", values, "assignTakerName");
            return (Criteria) this;
        }

        public Criteria andAssignTakerNameNotIn(List<String> values) {
            addCriterion("assignTakerName not in", values, "assignTakerName");
            return (Criteria) this;
        }

        public Criteria andAssignTakerNameBetween(String value1, String value2) {
            addCriterion("assignTakerName between", value1, value2, "assignTakerName");
            return (Criteria) this;
        }

        public Criteria andAssignTakerNameNotBetween(String value1, String value2) {
            addCriterion("assignTakerName not between", value1, value2, "assignTakerName");
            return (Criteria) this;
        }

        public Criteria andBookNumIsNull() {
            addCriterion("bookNum is null");
            return (Criteria) this;
        }

        public Criteria andBookNumIsNotNull() {
            addCriterion("bookNum is not null");
            return (Criteria) this;
        }

        public Criteria andBookNumEqualTo(Integer value) {
            addCriterion("bookNum =", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumNotEqualTo(Integer value) {
            addCriterion("bookNum <>", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumGreaterThan(Integer value) {
            addCriterion("bookNum >", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookNum >=", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumLessThan(Integer value) {
            addCriterion("bookNum <", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumLessThanOrEqualTo(Integer value) {
            addCriterion("bookNum <=", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumIn(List<Integer> values) {
            addCriterion("bookNum in", values, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumNotIn(List<Integer> values) {
            addCriterion("bookNum not in", values, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumBetween(Integer value1, Integer value2) {
            addCriterion("bookNum between", value1, value2, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumNotBetween(Integer value1, Integer value2) {
            addCriterion("bookNum not between", value1, value2, "bookNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumIsNull() {
            addCriterion("checkNum is null");
            return (Criteria) this;
        }

        public Criteria andCheckNumIsNotNull() {
            addCriterion("checkNum is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNumEqualTo(Integer value) {
            addCriterion("checkNum =", value, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumNotEqualTo(Integer value) {
            addCriterion("checkNum <>", value, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumGreaterThan(Integer value) {
            addCriterion("checkNum >", value, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkNum >=", value, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumLessThan(Integer value) {
            addCriterion("checkNum <", value, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumLessThanOrEqualTo(Integer value) {
            addCriterion("checkNum <=", value, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumIn(List<Integer> values) {
            addCriterion("checkNum in", values, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumNotIn(List<Integer> values) {
            addCriterion("checkNum not in", values, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumBetween(Integer value1, Integer value2) {
            addCriterion("checkNum between", value1, value2, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumNotBetween(Integer value1, Integer value2) {
            addCriterion("checkNum not between", value1, value2, "checkNum");
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

        public Criteria andFinishTimeIsNull() {
            addCriterion("finishTime is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finishTime is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(String value) {
            addCriterion("finishTime =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(String value) {
            addCriterion("finishTime <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(String value) {
            addCriterion("finishTime >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(String value) {
            addCriterion("finishTime >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(String value) {
            addCriterion("finishTime <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(String value) {
            addCriterion("finishTime <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLike(String value) {
            addCriterion("finishTime like", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotLike(String value) {
            addCriterion("finishTime not like", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<String> values) {
            addCriterion("finishTime in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<String> values) {
            addCriterion("finishTime not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(String value1, String value2) {
            addCriterion("finishTime between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(String value1, String value2) {
            addCriterion("finishTime not between", value1, value2, "finishTime");
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
     * bill_stocktake
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * bill_stocktake null
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