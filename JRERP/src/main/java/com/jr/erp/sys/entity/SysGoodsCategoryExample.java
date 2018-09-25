package com.jr.erp.sys.entity;

import com.jr.erp.base.mybatis.BaseExample;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysGoodsCategoryExample extends BaseExample {
    /**
     * sys_goods_category
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public SysGoodsCategoryExample() {
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
     * sys_goods_category null
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

        public Criteria andSystemCodeIsNull() {
            addCriterion("systemCode is null");
            return (Criteria) this;
        }

        public Criteria andSystemCodeIsNotNull() {
            addCriterion("systemCode is not null");
            return (Criteria) this;
        }

        public Criteria andSystemCodeEqualTo(String value) {
            addCriterion("systemCode =", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeNotEqualTo(String value) {
            addCriterion("systemCode <>", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeGreaterThan(String value) {
            addCriterion("systemCode >", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("systemCode >=", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeLessThan(String value) {
            addCriterion("systemCode <", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeLessThanOrEqualTo(String value) {
            addCriterion("systemCode <=", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeLike(String value) {
            addCriterion("systemCode like", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeNotLike(String value) {
            addCriterion("systemCode not like", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeIn(List<String> values) {
            addCriterion("systemCode in", values, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeNotIn(List<String> values) {
            addCriterion("systemCode not in", values, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeBetween(String value1, String value2) {
            addCriterion("systemCode between", value1, value2, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeNotBetween(String value1, String value2) {
            addCriterion("systemCode not between", value1, value2, "systemCode");
            return (Criteria) this;
        }

        public Criteria andAssistCodeIsNull() {
            addCriterion("assistCode is null");
            return (Criteria) this;
        }

        public Criteria andAssistCodeIsNotNull() {
            addCriterion("assistCode is not null");
            return (Criteria) this;
        }

        public Criteria andAssistCodeEqualTo(String value) {
            addCriterion("assistCode =", value, "assistCode");
            return (Criteria) this;
        }

        public Criteria andAssistCodeNotEqualTo(String value) {
            addCriterion("assistCode <>", value, "assistCode");
            return (Criteria) this;
        }

        public Criteria andAssistCodeGreaterThan(String value) {
            addCriterion("assistCode >", value, "assistCode");
            return (Criteria) this;
        }

        public Criteria andAssistCodeGreaterThanOrEqualTo(String value) {
            addCriterion("assistCode >=", value, "assistCode");
            return (Criteria) this;
        }

        public Criteria andAssistCodeLessThan(String value) {
            addCriterion("assistCode <", value, "assistCode");
            return (Criteria) this;
        }

        public Criteria andAssistCodeLessThanOrEqualTo(String value) {
            addCriterion("assistCode <=", value, "assistCode");
            return (Criteria) this;
        }

        public Criteria andAssistCodeLike(String value) {
            addCriterion("assistCode like", value, "assistCode");
            return (Criteria) this;
        }

        public Criteria andAssistCodeNotLike(String value) {
            addCriterion("assistCode not like", value, "assistCode");
            return (Criteria) this;
        }

        public Criteria andAssistCodeIn(List<String> values) {
            addCriterion("assistCode in", values, "assistCode");
            return (Criteria) this;
        }

        public Criteria andAssistCodeNotIn(List<String> values) {
            addCriterion("assistCode not in", values, "assistCode");
            return (Criteria) this;
        }

        public Criteria andAssistCodeBetween(String value1, String value2) {
            addCriterion("assistCode between", value1, value2, "assistCode");
            return (Criteria) this;
        }

        public Criteria andAssistCodeNotBetween(String value1, String value2) {
            addCriterion("assistCode not between", value1, value2, "assistCode");
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

        public Criteria andFirstTypePrefixIsNull() {
            addCriterion("firstTypePrefix is null");
            return (Criteria) this;
        }

        public Criteria andFirstTypePrefixIsNotNull() {
            addCriterion("firstTypePrefix is not null");
            return (Criteria) this;
        }

        public Criteria andFirstTypePrefixEqualTo(String value) {
            addCriterion("firstTypePrefix =", value, "firstTypePrefix");
            return (Criteria) this;
        }

        public Criteria andFirstTypePrefixNotEqualTo(String value) {
            addCriterion("firstTypePrefix <>", value, "firstTypePrefix");
            return (Criteria) this;
        }

        public Criteria andFirstTypePrefixGreaterThan(String value) {
            addCriterion("firstTypePrefix >", value, "firstTypePrefix");
            return (Criteria) this;
        }

        public Criteria andFirstTypePrefixGreaterThanOrEqualTo(String value) {
            addCriterion("firstTypePrefix >=", value, "firstTypePrefix");
            return (Criteria) this;
        }

        public Criteria andFirstTypePrefixLessThan(String value) {
            addCriterion("firstTypePrefix <", value, "firstTypePrefix");
            return (Criteria) this;
        }

        public Criteria andFirstTypePrefixLessThanOrEqualTo(String value) {
            addCriterion("firstTypePrefix <=", value, "firstTypePrefix");
            return (Criteria) this;
        }

        public Criteria andFirstTypePrefixLike(String value) {
            addCriterion("firstTypePrefix like", value, "firstTypePrefix");
            return (Criteria) this;
        }

        public Criteria andFirstTypePrefixNotLike(String value) {
            addCriterion("firstTypePrefix not like", value, "firstTypePrefix");
            return (Criteria) this;
        }

        public Criteria andFirstTypePrefixIn(List<String> values) {
            addCriterion("firstTypePrefix in", values, "firstTypePrefix");
            return (Criteria) this;
        }

        public Criteria andFirstTypePrefixNotIn(List<String> values) {
            addCriterion("firstTypePrefix not in", values, "firstTypePrefix");
            return (Criteria) this;
        }

        public Criteria andFirstTypePrefixBetween(String value1, String value2) {
            addCriterion("firstTypePrefix between", value1, value2, "firstTypePrefix");
            return (Criteria) this;
        }

        public Criteria andFirstTypePrefixNotBetween(String value1, String value2) {
            addCriterion("firstTypePrefix not between", value1, value2, "firstTypePrefix");
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

        public Criteria andSecondTypePrefixIsNull() {
            addCriterion("secondTypePrefix is null");
            return (Criteria) this;
        }

        public Criteria andSecondTypePrefixIsNotNull() {
            addCriterion("secondTypePrefix is not null");
            return (Criteria) this;
        }

        public Criteria andSecondTypePrefixEqualTo(String value) {
            addCriterion("secondTypePrefix =", value, "secondTypePrefix");
            return (Criteria) this;
        }

        public Criteria andSecondTypePrefixNotEqualTo(String value) {
            addCriterion("secondTypePrefix <>", value, "secondTypePrefix");
            return (Criteria) this;
        }

        public Criteria andSecondTypePrefixGreaterThan(String value) {
            addCriterion("secondTypePrefix >", value, "secondTypePrefix");
            return (Criteria) this;
        }

        public Criteria andSecondTypePrefixGreaterThanOrEqualTo(String value) {
            addCriterion("secondTypePrefix >=", value, "secondTypePrefix");
            return (Criteria) this;
        }

        public Criteria andSecondTypePrefixLessThan(String value) {
            addCriterion("secondTypePrefix <", value, "secondTypePrefix");
            return (Criteria) this;
        }

        public Criteria andSecondTypePrefixLessThanOrEqualTo(String value) {
            addCriterion("secondTypePrefix <=", value, "secondTypePrefix");
            return (Criteria) this;
        }

        public Criteria andSecondTypePrefixLike(String value) {
            addCriterion("secondTypePrefix like", value, "secondTypePrefix");
            return (Criteria) this;
        }

        public Criteria andSecondTypePrefixNotLike(String value) {
            addCriterion("secondTypePrefix not like", value, "secondTypePrefix");
            return (Criteria) this;
        }

        public Criteria andSecondTypePrefixIn(List<String> values) {
            addCriterion("secondTypePrefix in", values, "secondTypePrefix");
            return (Criteria) this;
        }

        public Criteria andSecondTypePrefixNotIn(List<String> values) {
            addCriterion("secondTypePrefix not in", values, "secondTypePrefix");
            return (Criteria) this;
        }

        public Criteria andSecondTypePrefixBetween(String value1, String value2) {
            addCriterion("secondTypePrefix between", value1, value2, "secondTypePrefix");
            return (Criteria) this;
        }

        public Criteria andSecondTypePrefixNotBetween(String value1, String value2) {
            addCriterion("secondTypePrefix not between", value1, value2, "secondTypePrefix");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIsNull() {
            addCriterion("incomeType is null");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIsNotNull() {
            addCriterion("incomeType is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeEqualTo(Integer value) {
            addCriterion("incomeType =", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotEqualTo(Integer value) {
            addCriterion("incomeType <>", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeGreaterThan(Integer value) {
            addCriterion("incomeType >", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("incomeType >=", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeLessThan(Integer value) {
            addCriterion("incomeType <", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("incomeType <=", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIn(List<Integer> values) {
            addCriterion("incomeType in", values, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotIn(List<Integer> values) {
            addCriterion("incomeType not in", values, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeBetween(Integer value1, Integer value2) {
            addCriterion("incomeType between", value1, value2, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("incomeType not between", value1, value2, "incomeType");
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

        public Criteria andGoldPercentIsNull() {
            addCriterion("goldPercent is null");
            return (Criteria) this;
        }

        public Criteria andGoldPercentIsNotNull() {
            addCriterion("goldPercent is not null");
            return (Criteria) this;
        }

        public Criteria andGoldPercentEqualTo(String value) {
            addCriterion("goldPercent =", value, "goldPercent");
            return (Criteria) this;
        }

        public Criteria andGoldPercentNotEqualTo(String value) {
            addCriterion("goldPercent <>", value, "goldPercent");
            return (Criteria) this;
        }

        public Criteria andGoldPercentGreaterThan(String value) {
            addCriterion("goldPercent >", value, "goldPercent");
            return (Criteria) this;
        }

        public Criteria andGoldPercentGreaterThanOrEqualTo(String value) {
            addCriterion("goldPercent >=", value, "goldPercent");
            return (Criteria) this;
        }

        public Criteria andGoldPercentLessThan(String value) {
            addCriterion("goldPercent <", value, "goldPercent");
            return (Criteria) this;
        }

        public Criteria andGoldPercentLessThanOrEqualTo(String value) {
            addCriterion("goldPercent <=", value, "goldPercent");
            return (Criteria) this;
        }

        public Criteria andGoldPercentLike(String value) {
            addCriterion("goldPercent like", value, "goldPercent");
            return (Criteria) this;
        }

        public Criteria andGoldPercentNotLike(String value) {
            addCriterion("goldPercent not like", value, "goldPercent");
            return (Criteria) this;
        }

        public Criteria andGoldPercentIn(List<String> values) {
            addCriterion("goldPercent in", values, "goldPercent");
            return (Criteria) this;
        }

        public Criteria andGoldPercentNotIn(List<String> values) {
            addCriterion("goldPercent not in", values, "goldPercent");
            return (Criteria) this;
        }

        public Criteria andGoldPercentBetween(String value1, String value2) {
            addCriterion("goldPercent between", value1, value2, "goldPercent");
            return (Criteria) this;
        }

        public Criteria andGoldPercentNotBetween(String value1, String value2) {
            addCriterion("goldPercent not between", value1, value2, "goldPercent");
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

        public Criteria andFactClassIsNull() {
            addCriterion("factClass is null");
            return (Criteria) this;
        }

        public Criteria andFactClassIsNotNull() {
            addCriterion("factClass is not null");
            return (Criteria) this;
        }

        public Criteria andFactClassEqualTo(String value) {
            addCriterion("factClass =", value, "factClass");
            return (Criteria) this;
        }

        public Criteria andFactClassNotEqualTo(String value) {
            addCriterion("factClass <>", value, "factClass");
            return (Criteria) this;
        }

        public Criteria andFactClassGreaterThan(String value) {
            addCriterion("factClass >", value, "factClass");
            return (Criteria) this;
        }

        public Criteria andFactClassGreaterThanOrEqualTo(String value) {
            addCriterion("factClass >=", value, "factClass");
            return (Criteria) this;
        }

        public Criteria andFactClassLessThan(String value) {
            addCriterion("factClass <", value, "factClass");
            return (Criteria) this;
        }

        public Criteria andFactClassLessThanOrEqualTo(String value) {
            addCriterion("factClass <=", value, "factClass");
            return (Criteria) this;
        }

        public Criteria andFactClassLike(String value) {
            addCriterion("factClass like", value, "factClass");
            return (Criteria) this;
        }

        public Criteria andFactClassNotLike(String value) {
            addCriterion("factClass not like", value, "factClass");
            return (Criteria) this;
        }

        public Criteria andFactClassIn(List<String> values) {
            addCriterion("factClass in", values, "factClass");
            return (Criteria) this;
        }

        public Criteria andFactClassNotIn(List<String> values) {
            addCriterion("factClass not in", values, "factClass");
            return (Criteria) this;
        }

        public Criteria andFactClassBetween(String value1, String value2) {
            addCriterion("factClass between", value1, value2, "factClass");
            return (Criteria) this;
        }

        public Criteria andFactClassNotBetween(String value1, String value2) {
            addCriterion("factClass not between", value1, value2, "factClass");
            return (Criteria) this;
        }

        public Criteria andStatsClassIsNull() {
            addCriterion("statsClass is null");
            return (Criteria) this;
        }

        public Criteria andStatsClassIsNotNull() {
            addCriterion("statsClass is not null");
            return (Criteria) this;
        }

        public Criteria andStatsClassEqualTo(String value) {
            addCriterion("statsClass =", value, "statsClass");
            return (Criteria) this;
        }

        public Criteria andStatsClassNotEqualTo(String value) {
            addCriterion("statsClass <>", value, "statsClass");
            return (Criteria) this;
        }

        public Criteria andStatsClassGreaterThan(String value) {
            addCriterion("statsClass >", value, "statsClass");
            return (Criteria) this;
        }

        public Criteria andStatsClassGreaterThanOrEqualTo(String value) {
            addCriterion("statsClass >=", value, "statsClass");
            return (Criteria) this;
        }

        public Criteria andStatsClassLessThan(String value) {
            addCriterion("statsClass <", value, "statsClass");
            return (Criteria) this;
        }

        public Criteria andStatsClassLessThanOrEqualTo(String value) {
            addCriterion("statsClass <=", value, "statsClass");
            return (Criteria) this;
        }

        public Criteria andStatsClassLike(String value) {
            addCriterion("statsClass like", value, "statsClass");
            return (Criteria) this;
        }

        public Criteria andStatsClassNotLike(String value) {
            addCriterion("statsClass not like", value, "statsClass");
            return (Criteria) this;
        }

        public Criteria andStatsClassIn(List<String> values) {
            addCriterion("statsClass in", values, "statsClass");
            return (Criteria) this;
        }

        public Criteria andStatsClassNotIn(List<String> values) {
            addCriterion("statsClass not in", values, "statsClass");
            return (Criteria) this;
        }

        public Criteria andStatsClassBetween(String value1, String value2) {
            addCriterion("statsClass between", value1, value2, "statsClass");
            return (Criteria) this;
        }

        public Criteria andStatsClassNotBetween(String value1, String value2) {
            addCriterion("statsClass not between", value1, value2, "statsClass");
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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
    }

    /**
     * sys_goods_category
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sys_goods_category null
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