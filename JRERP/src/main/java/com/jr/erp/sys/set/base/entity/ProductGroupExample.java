package com.jr.erp.sys.set.base.entity;

import com.jr.erp.base.mybatis.BaseExample;
import java.util.ArrayList;
import java.util.List;

public class ProductGroupExample extends BaseExample {
    /**
     * st_product_group
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public ProductGroupExample() {
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
     * st_product_group null
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
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

        public Criteria andSaleTypeIsNull() {
            addCriterion("saleType is null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIsNotNull() {
            addCriterion("saleType is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeEqualTo(Integer value) {
            addCriterion("saleType =", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotEqualTo(Integer value) {
            addCriterion("saleType <>", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThan(Integer value) {
            addCriterion("saleType >", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("saleType >=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThan(Integer value) {
            addCriterion("saleType <", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("saleType <=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIn(List<Integer> values) {
            addCriterion("saleType in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotIn(List<Integer> values) {
            addCriterion("saleType not in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeBetween(Integer value1, Integer value2) {
            addCriterion("saleType between", value1, value2, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("saleType not between", value1, value2, "saleType");
            return (Criteria) this;
        }

        public Criteria andCanBarterIsNull() {
            addCriterion("canBarter is null");
            return (Criteria) this;
        }

        public Criteria andCanBarterIsNotNull() {
            addCriterion("canBarter is not null");
            return (Criteria) this;
        }

        public Criteria andCanBarterEqualTo(Integer value) {
            addCriterion("canBarter =", value, "canBarter");
            return (Criteria) this;
        }

        public Criteria andCanBarterNotEqualTo(Integer value) {
            addCriterion("canBarter <>", value, "canBarter");
            return (Criteria) this;
        }

        public Criteria andCanBarterGreaterThan(Integer value) {
            addCriterion("canBarter >", value, "canBarter");
            return (Criteria) this;
        }

        public Criteria andCanBarterGreaterThanOrEqualTo(Integer value) {
            addCriterion("canBarter >=", value, "canBarter");
            return (Criteria) this;
        }

        public Criteria andCanBarterLessThan(Integer value) {
            addCriterion("canBarter <", value, "canBarter");
            return (Criteria) this;
        }

        public Criteria andCanBarterLessThanOrEqualTo(Integer value) {
            addCriterion("canBarter <=", value, "canBarter");
            return (Criteria) this;
        }

        public Criteria andCanBarterIn(List<Integer> values) {
            addCriterion("canBarter in", values, "canBarter");
            return (Criteria) this;
        }

        public Criteria andCanBarterNotIn(List<Integer> values) {
            addCriterion("canBarter not in", values, "canBarter");
            return (Criteria) this;
        }

        public Criteria andCanBarterBetween(Integer value1, Integer value2) {
            addCriterion("canBarter between", value1, value2, "canBarter");
            return (Criteria) this;
        }

        public Criteria andCanBarterNotBetween(Integer value1, Integer value2) {
            addCriterion("canBarter not between", value1, value2, "canBarter");
            return (Criteria) this;
        }

        public Criteria andIsSysDefIsNull() {
            addCriterion("isSysDef is null");
            return (Criteria) this;
        }

        public Criteria andIsSysDefIsNotNull() {
            addCriterion("isSysDef is not null");
            return (Criteria) this;
        }

        public Criteria andIsSysDefEqualTo(Integer value) {
            addCriterion("isSysDef =", value, "isSysDef");
            return (Criteria) this;
        }

        public Criteria andIsSysDefNotEqualTo(Integer value) {
            addCriterion("isSysDef <>", value, "isSysDef");
            return (Criteria) this;
        }

        public Criteria andIsSysDefGreaterThan(Integer value) {
            addCriterion("isSysDef >", value, "isSysDef");
            return (Criteria) this;
        }

        public Criteria andIsSysDefGreaterThanOrEqualTo(Integer value) {
            addCriterion("isSysDef >=", value, "isSysDef");
            return (Criteria) this;
        }

        public Criteria andIsSysDefLessThan(Integer value) {
            addCriterion("isSysDef <", value, "isSysDef");
            return (Criteria) this;
        }

        public Criteria andIsSysDefLessThanOrEqualTo(Integer value) {
            addCriterion("isSysDef <=", value, "isSysDef");
            return (Criteria) this;
        }

        public Criteria andIsSysDefIn(List<Integer> values) {
            addCriterion("isSysDef in", values, "isSysDef");
            return (Criteria) this;
        }

        public Criteria andIsSysDefNotIn(List<Integer> values) {
            addCriterion("isSysDef not in", values, "isSysDef");
            return (Criteria) this;
        }

        public Criteria andIsSysDefBetween(Integer value1, Integer value2) {
            addCriterion("isSysDef between", value1, value2, "isSysDef");
            return (Criteria) this;
        }

        public Criteria andIsSysDefNotBetween(Integer value1, Integer value2) {
            addCriterion("isSysDef not between", value1, value2, "isSysDef");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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
     * st_product_group
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * st_product_group null
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