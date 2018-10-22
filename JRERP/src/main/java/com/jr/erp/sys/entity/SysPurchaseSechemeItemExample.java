package com.jr.erp.sys.entity;

import com.jr.erp.base.mybatis.BaseExample;
import java.util.ArrayList;
import java.util.List;

public class SysPurchaseSechemeItemExample extends BaseExample {
    /**
     * sys_purchase_secheme_item
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public SysPurchaseSechemeItemExample() {
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
     * sys_purchase_secheme_item null
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

        public Criteria andSechemeIdIsNull() {
            addCriterion("sechemeId is null");
            return (Criteria) this;
        }

        public Criteria andSechemeIdIsNotNull() {
            addCriterion("sechemeId is not null");
            return (Criteria) this;
        }

        public Criteria andSechemeIdEqualTo(Integer value) {
            addCriterion("sechemeId =", value, "sechemeId");
            return (Criteria) this;
        }

        public Criteria andSechemeIdNotEqualTo(Integer value) {
            addCriterion("sechemeId <>", value, "sechemeId");
            return (Criteria) this;
        }

        public Criteria andSechemeIdGreaterThan(Integer value) {
            addCriterion("sechemeId >", value, "sechemeId");
            return (Criteria) this;
        }

        public Criteria andSechemeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sechemeId >=", value, "sechemeId");
            return (Criteria) this;
        }

        public Criteria andSechemeIdLessThan(Integer value) {
            addCriterion("sechemeId <", value, "sechemeId");
            return (Criteria) this;
        }

        public Criteria andSechemeIdLessThanOrEqualTo(Integer value) {
            addCriterion("sechemeId <=", value, "sechemeId");
            return (Criteria) this;
        }

        public Criteria andSechemeIdIn(List<Integer> values) {
            addCriterion("sechemeId in", values, "sechemeId");
            return (Criteria) this;
        }

        public Criteria andSechemeIdNotIn(List<Integer> values) {
            addCriterion("sechemeId not in", values, "sechemeId");
            return (Criteria) this;
        }

        public Criteria andSechemeIdBetween(Integer value1, Integer value2) {
            addCriterion("sechemeId between", value1, value2, "sechemeId");
            return (Criteria) this;
        }

        public Criteria andSechemeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sechemeId not between", value1, value2, "sechemeId");
            return (Criteria) this;
        }

        public Criteria andDbColumnNameIsNull() {
            addCriterion("dbColumnName is null");
            return (Criteria) this;
        }

        public Criteria andDbColumnNameIsNotNull() {
            addCriterion("dbColumnName is not null");
            return (Criteria) this;
        }

        public Criteria andDbColumnNameEqualTo(String value) {
            addCriterion("dbColumnName =", value, "dbColumnName");
            return (Criteria) this;
        }

        public Criteria andDbColumnNameNotEqualTo(String value) {
            addCriterion("dbColumnName <>", value, "dbColumnName");
            return (Criteria) this;
        }

        public Criteria andDbColumnNameGreaterThan(String value) {
            addCriterion("dbColumnName >", value, "dbColumnName");
            return (Criteria) this;
        }

        public Criteria andDbColumnNameGreaterThanOrEqualTo(String value) {
            addCriterion("dbColumnName >=", value, "dbColumnName");
            return (Criteria) this;
        }

        public Criteria andDbColumnNameLessThan(String value) {
            addCriterion("dbColumnName <", value, "dbColumnName");
            return (Criteria) this;
        }

        public Criteria andDbColumnNameLessThanOrEqualTo(String value) {
            addCriterion("dbColumnName <=", value, "dbColumnName");
            return (Criteria) this;
        }

        public Criteria andDbColumnNameLike(String value) {
            addCriterion("dbColumnName like", value, "dbColumnName");
            return (Criteria) this;
        }

        public Criteria andDbColumnNameNotLike(String value) {
            addCriterion("dbColumnName not like", value, "dbColumnName");
            return (Criteria) this;
        }

        public Criteria andDbColumnNameIn(List<String> values) {
            addCriterion("dbColumnName in", values, "dbColumnName");
            return (Criteria) this;
        }

        public Criteria andDbColumnNameNotIn(List<String> values) {
            addCriterion("dbColumnName not in", values, "dbColumnName");
            return (Criteria) this;
        }

        public Criteria andDbColumnNameBetween(String value1, String value2) {
            addCriterion("dbColumnName between", value1, value2, "dbColumnName");
            return (Criteria) this;
        }

        public Criteria andDbColumnNameNotBetween(String value1, String value2) {
            addCriterion("dbColumnName not between", value1, value2, "dbColumnName");
            return (Criteria) this;
        }

        public Criteria andBeanNameIsNull() {
            addCriterion("beanName is null");
            return (Criteria) this;
        }

        public Criteria andBeanNameIsNotNull() {
            addCriterion("beanName is not null");
            return (Criteria) this;
        }

        public Criteria andBeanNameEqualTo(String value) {
            addCriterion("beanName =", value, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameNotEqualTo(String value) {
            addCriterion("beanName <>", value, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameGreaterThan(String value) {
            addCriterion("beanName >", value, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameGreaterThanOrEqualTo(String value) {
            addCriterion("beanName >=", value, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameLessThan(String value) {
            addCriterion("beanName <", value, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameLessThanOrEqualTo(String value) {
            addCriterion("beanName <=", value, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameLike(String value) {
            addCriterion("beanName like", value, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameNotLike(String value) {
            addCriterion("beanName not like", value, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameIn(List<String> values) {
            addCriterion("beanName in", values, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameNotIn(List<String> values) {
            addCriterion("beanName not in", values, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameBetween(String value1, String value2) {
            addCriterion("beanName between", value1, value2, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameNotBetween(String value1, String value2) {
            addCriterion("beanName not between", value1, value2, "beanName");
            return (Criteria) this;
        }

        public Criteria andShowNameIsNull() {
            addCriterion("showName is null");
            return (Criteria) this;
        }

        public Criteria andShowNameIsNotNull() {
            addCriterion("showName is not null");
            return (Criteria) this;
        }

        public Criteria andShowNameEqualTo(String value) {
            addCriterion("showName =", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotEqualTo(String value) {
            addCriterion("showName <>", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameGreaterThan(String value) {
            addCriterion("showName >", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameGreaterThanOrEqualTo(String value) {
            addCriterion("showName >=", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameLessThan(String value) {
            addCriterion("showName <", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameLessThanOrEqualTo(String value) {
            addCriterion("showName <=", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameLike(String value) {
            addCriterion("showName like", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotLike(String value) {
            addCriterion("showName not like", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameIn(List<String> values) {
            addCriterion("showName in", values, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotIn(List<String> values) {
            addCriterion("showName not in", values, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameBetween(String value1, String value2) {
            addCriterion("showName between", value1, value2, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotBetween(String value1, String value2) {
            addCriterion("showName not between", value1, value2, "showName");
            return (Criteria) this;
        }

        public Criteria andParamTypeIsNull() {
            addCriterion("paramType is null");
            return (Criteria) this;
        }

        public Criteria andParamTypeIsNotNull() {
            addCriterion("paramType is not null");
            return (Criteria) this;
        }

        public Criteria andParamTypeEqualTo(Integer value) {
            addCriterion("paramType =", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeNotEqualTo(Integer value) {
            addCriterion("paramType <>", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeGreaterThan(Integer value) {
            addCriterion("paramType >", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("paramType >=", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeLessThan(Integer value) {
            addCriterion("paramType <", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeLessThanOrEqualTo(Integer value) {
            addCriterion("paramType <=", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeIn(List<Integer> values) {
            addCriterion("paramType in", values, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeNotIn(List<Integer> values) {
            addCriterion("paramType not in", values, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeBetween(Integer value1, Integer value2) {
            addCriterion("paramType between", value1, value2, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("paramType not between", value1, value2, "paramType");
            return (Criteria) this;
        }

        public Criteria andDigitsIsNull() {
            addCriterion("digits is null");
            return (Criteria) this;
        }

        public Criteria andDigitsIsNotNull() {
            addCriterion("digits is not null");
            return (Criteria) this;
        }

        public Criteria andDigitsEqualTo(Integer value) {
            addCriterion("digits =", value, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsNotEqualTo(Integer value) {
            addCriterion("digits <>", value, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsGreaterThan(Integer value) {
            addCriterion("digits >", value, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("digits >=", value, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsLessThan(Integer value) {
            addCriterion("digits <", value, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsLessThanOrEqualTo(Integer value) {
            addCriterion("digits <=", value, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsIn(List<Integer> values) {
            addCriterion("digits in", values, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsNotIn(List<Integer> values) {
            addCriterion("digits not in", values, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsBetween(Integer value1, Integer value2) {
            addCriterion("digits between", value1, value2, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsNotBetween(Integer value1, Integer value2) {
            addCriterion("digits not between", value1, value2, "digits");
            return (Criteria) this;
        }

        public Criteria andBaseClassKeyIsNull() {
            addCriterion("baseClassKey is null");
            return (Criteria) this;
        }

        public Criteria andBaseClassKeyIsNotNull() {
            addCriterion("baseClassKey is not null");
            return (Criteria) this;
        }

        public Criteria andBaseClassKeyEqualTo(String value) {
            addCriterion("baseClassKey =", value, "baseClassKey");
            return (Criteria) this;
        }

        public Criteria andBaseClassKeyNotEqualTo(String value) {
            addCriterion("baseClassKey <>", value, "baseClassKey");
            return (Criteria) this;
        }

        public Criteria andBaseClassKeyGreaterThan(String value) {
            addCriterion("baseClassKey >", value, "baseClassKey");
            return (Criteria) this;
        }

        public Criteria andBaseClassKeyGreaterThanOrEqualTo(String value) {
            addCriterion("baseClassKey >=", value, "baseClassKey");
            return (Criteria) this;
        }

        public Criteria andBaseClassKeyLessThan(String value) {
            addCriterion("baseClassKey <", value, "baseClassKey");
            return (Criteria) this;
        }

        public Criteria andBaseClassKeyLessThanOrEqualTo(String value) {
            addCriterion("baseClassKey <=", value, "baseClassKey");
            return (Criteria) this;
        }

        public Criteria andBaseClassKeyLike(String value) {
            addCriterion("baseClassKey like", value, "baseClassKey");
            return (Criteria) this;
        }

        public Criteria andBaseClassKeyNotLike(String value) {
            addCriterion("baseClassKey not like", value, "baseClassKey");
            return (Criteria) this;
        }

        public Criteria andBaseClassKeyIn(List<String> values) {
            addCriterion("baseClassKey in", values, "baseClassKey");
            return (Criteria) this;
        }

        public Criteria andBaseClassKeyNotIn(List<String> values) {
            addCriterion("baseClassKey not in", values, "baseClassKey");
            return (Criteria) this;
        }

        public Criteria andBaseClassKeyBetween(String value1, String value2) {
            addCriterion("baseClassKey between", value1, value2, "baseClassKey");
            return (Criteria) this;
        }

        public Criteria andBaseClassKeyNotBetween(String value1, String value2) {
            addCriterion("baseClassKey not between", value1, value2, "baseClassKey");
            return (Criteria) this;
        }

        public Criteria andMustColumnIsNull() {
            addCriterion("mustColumn is null");
            return (Criteria) this;
        }

        public Criteria andMustColumnIsNotNull() {
            addCriterion("mustColumn is not null");
            return (Criteria) this;
        }

        public Criteria andMustColumnEqualTo(Integer value) {
            addCriterion("mustColumn =", value, "mustColumn");
            return (Criteria) this;
        }

        public Criteria andMustColumnNotEqualTo(Integer value) {
            addCriterion("mustColumn <>", value, "mustColumn");
            return (Criteria) this;
        }

        public Criteria andMustColumnGreaterThan(Integer value) {
            addCriterion("mustColumn >", value, "mustColumn");
            return (Criteria) this;
        }

        public Criteria andMustColumnGreaterThanOrEqualTo(Integer value) {
            addCriterion("mustColumn >=", value, "mustColumn");
            return (Criteria) this;
        }

        public Criteria andMustColumnLessThan(Integer value) {
            addCriterion("mustColumn <", value, "mustColumn");
            return (Criteria) this;
        }

        public Criteria andMustColumnLessThanOrEqualTo(Integer value) {
            addCriterion("mustColumn <=", value, "mustColumn");
            return (Criteria) this;
        }

        public Criteria andMustColumnIn(List<Integer> values) {
            addCriterion("mustColumn in", values, "mustColumn");
            return (Criteria) this;
        }

        public Criteria andMustColumnNotIn(List<Integer> values) {
            addCriterion("mustColumn not in", values, "mustColumn");
            return (Criteria) this;
        }

        public Criteria andMustColumnBetween(Integer value1, Integer value2) {
            addCriterion("mustColumn between", value1, value2, "mustColumn");
            return (Criteria) this;
        }

        public Criteria andMustColumnNotBetween(Integer value1, Integer value2) {
            addCriterion("mustColumn not between", value1, value2, "mustColumn");
            return (Criteria) this;
        }

        public Criteria andCanShowIsNull() {
            addCriterion("canShow is null");
            return (Criteria) this;
        }

        public Criteria andCanShowIsNotNull() {
            addCriterion("canShow is not null");
            return (Criteria) this;
        }

        public Criteria andCanShowEqualTo(Integer value) {
            addCriterion("canShow =", value, "canShow");
            return (Criteria) this;
        }

        public Criteria andCanShowNotEqualTo(Integer value) {
            addCriterion("canShow <>", value, "canShow");
            return (Criteria) this;
        }

        public Criteria andCanShowGreaterThan(Integer value) {
            addCriterion("canShow >", value, "canShow");
            return (Criteria) this;
        }

        public Criteria andCanShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("canShow >=", value, "canShow");
            return (Criteria) this;
        }

        public Criteria andCanShowLessThan(Integer value) {
            addCriterion("canShow <", value, "canShow");
            return (Criteria) this;
        }

        public Criteria andCanShowLessThanOrEqualTo(Integer value) {
            addCriterion("canShow <=", value, "canShow");
            return (Criteria) this;
        }

        public Criteria andCanShowIn(List<Integer> values) {
            addCriterion("canShow in", values, "canShow");
            return (Criteria) this;
        }

        public Criteria andCanShowNotIn(List<Integer> values) {
            addCriterion("canShow not in", values, "canShow");
            return (Criteria) this;
        }

        public Criteria andCanShowBetween(Integer value1, Integer value2) {
            addCriterion("canShow between", value1, value2, "canShow");
            return (Criteria) this;
        }

        public Criteria andCanShowNotBetween(Integer value1, Integer value2) {
            addCriterion("canShow not between", value1, value2, "canShow");
            return (Criteria) this;
        }

        public Criteria andOrderColumnIsNull() {
            addCriterion("orderColumn is null");
            return (Criteria) this;
        }

        public Criteria andOrderColumnIsNotNull() {
            addCriterion("orderColumn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderColumnEqualTo(Integer value) {
            addCriterion("orderColumn =", value, "orderColumn");
            return (Criteria) this;
        }

        public Criteria andOrderColumnNotEqualTo(Integer value) {
            addCriterion("orderColumn <>", value, "orderColumn");
            return (Criteria) this;
        }

        public Criteria andOrderColumnGreaterThan(Integer value) {
            addCriterion("orderColumn >", value, "orderColumn");
            return (Criteria) this;
        }

        public Criteria andOrderColumnGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderColumn >=", value, "orderColumn");
            return (Criteria) this;
        }

        public Criteria andOrderColumnLessThan(Integer value) {
            addCriterion("orderColumn <", value, "orderColumn");
            return (Criteria) this;
        }

        public Criteria andOrderColumnLessThanOrEqualTo(Integer value) {
            addCriterion("orderColumn <=", value, "orderColumn");
            return (Criteria) this;
        }

        public Criteria andOrderColumnIn(List<Integer> values) {
            addCriterion("orderColumn in", values, "orderColumn");
            return (Criteria) this;
        }

        public Criteria andOrderColumnNotIn(List<Integer> values) {
            addCriterion("orderColumn not in", values, "orderColumn");
            return (Criteria) this;
        }

        public Criteria andOrderColumnBetween(Integer value1, Integer value2) {
            addCriterion("orderColumn between", value1, value2, "orderColumn");
            return (Criteria) this;
        }

        public Criteria andOrderColumnNotBetween(Integer value1, Integer value2) {
            addCriterion("orderColumn not between", value1, value2, "orderColumn");
            return (Criteria) this;
        }
    }

    /**
     * sys_purchase_secheme_item
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sys_purchase_secheme_item null
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