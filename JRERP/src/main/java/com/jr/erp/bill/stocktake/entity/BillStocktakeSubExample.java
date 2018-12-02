package com.jr.erp.bill.stocktake.entity;

import com.jr.erp.base.mybatis.BaseExample;
import java.util.ArrayList;
import java.util.List;

public class BillStocktakeSubExample extends BaseExample {
    /**
     * bill_stocktake_sub
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public BillStocktakeSubExample() {
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
     * bill_stocktake_sub null
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("updateTime like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("updateTime not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * bill_stocktake_sub
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * bill_stocktake_sub null
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