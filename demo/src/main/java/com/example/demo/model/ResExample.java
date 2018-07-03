package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class ResExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andResIdIsNull() {
            addCriterion("res_id is null");
            return (Criteria) this;
        }

        public Criteria andResIdIsNotNull() {
            addCriterion("res_id is not null");
            return (Criteria) this;
        }

        public Criteria andResIdEqualTo(String value) {
            addCriterion("res_id =", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotEqualTo(String value) {
            addCriterion("res_id <>", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThan(String value) {
            addCriterion("res_id >", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThanOrEqualTo(String value) {
            addCriterion("res_id >=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThan(String value) {
            addCriterion("res_id <", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThanOrEqualTo(String value) {
            addCriterion("res_id <=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLike(String value) {
            addCriterion("res_id like", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotLike(String value) {
            addCriterion("res_id not like", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdIn(List<String> values) {
            addCriterion("res_id in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotIn(List<String> values) {
            addCriterion("res_id not in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdBetween(String value1, String value2) {
            addCriterion("res_id between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotBetween(String value1, String value2) {
            addCriterion("res_id not between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResPidIsNull() {
            addCriterion("res_pid is null");
            return (Criteria) this;
        }

        public Criteria andResPidIsNotNull() {
            addCriterion("res_pid is not null");
            return (Criteria) this;
        }

        public Criteria andResPidEqualTo(String value) {
            addCriterion("res_pid =", value, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidNotEqualTo(String value) {
            addCriterion("res_pid <>", value, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidGreaterThan(String value) {
            addCriterion("res_pid >", value, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidGreaterThanOrEqualTo(String value) {
            addCriterion("res_pid >=", value, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidLessThan(String value) {
            addCriterion("res_pid <", value, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidLessThanOrEqualTo(String value) {
            addCriterion("res_pid <=", value, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidLike(String value) {
            addCriterion("res_pid like", value, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidNotLike(String value) {
            addCriterion("res_pid not like", value, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidIn(List<String> values) {
            addCriterion("res_pid in", values, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidNotIn(List<String> values) {
            addCriterion("res_pid not in", values, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidBetween(String value1, String value2) {
            addCriterion("res_pid between", value1, value2, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidNotBetween(String value1, String value2) {
            addCriterion("res_pid not between", value1, value2, "resPid");
            return (Criteria) this;
        }

        public Criteria andResNameIsNull() {
            addCriterion("res_name is null");
            return (Criteria) this;
        }

        public Criteria andResNameIsNotNull() {
            addCriterion("res_name is not null");
            return (Criteria) this;
        }

        public Criteria andResNameEqualTo(String value) {
            addCriterion("res_name =", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotEqualTo(String value) {
            addCriterion("res_name <>", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameGreaterThan(String value) {
            addCriterion("res_name >", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameGreaterThanOrEqualTo(String value) {
            addCriterion("res_name >=", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLessThan(String value) {
            addCriterion("res_name <", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLessThanOrEqualTo(String value) {
            addCriterion("res_name <=", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLike(String value) {
            addCriterion("res_name like", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotLike(String value) {
            addCriterion("res_name not like", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameIn(List<String> values) {
            addCriterion("res_name in", values, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotIn(List<String> values) {
            addCriterion("res_name not in", values, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameBetween(String value1, String value2) {
            addCriterion("res_name between", value1, value2, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotBetween(String value1, String value2) {
            addCriterion("res_name not between", value1, value2, "resName");
            return (Criteria) this;
        }

        public Criteria andResUrlIsNull() {
            addCriterion("res_url is null");
            return (Criteria) this;
        }

        public Criteria andResUrlIsNotNull() {
            addCriterion("res_url is not null");
            return (Criteria) this;
        }

        public Criteria andResUrlEqualTo(String value) {
            addCriterion("res_url =", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotEqualTo(String value) {
            addCriterion("res_url <>", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlGreaterThan(String value) {
            addCriterion("res_url >", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlGreaterThanOrEqualTo(String value) {
            addCriterion("res_url >=", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlLessThan(String value) {
            addCriterion("res_url <", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlLessThanOrEqualTo(String value) {
            addCriterion("res_url <=", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlLike(String value) {
            addCriterion("res_url like", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotLike(String value) {
            addCriterion("res_url not like", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlIn(List<String> values) {
            addCriterion("res_url in", values, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotIn(List<String> values) {
            addCriterion("res_url not in", values, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlBetween(String value1, String value2) {
            addCriterion("res_url between", value1, value2, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotBetween(String value1, String value2) {
            addCriterion("res_url not between", value1, value2, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResIconIsNull() {
            addCriterion("res_icon is null");
            return (Criteria) this;
        }

        public Criteria andResIconIsNotNull() {
            addCriterion("res_icon is not null");
            return (Criteria) this;
        }

        public Criteria andResIconEqualTo(String value) {
            addCriterion("res_icon =", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconNotEqualTo(String value) {
            addCriterion("res_icon <>", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconGreaterThan(String value) {
            addCriterion("res_icon >", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconGreaterThanOrEqualTo(String value) {
            addCriterion("res_icon >=", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconLessThan(String value) {
            addCriterion("res_icon <", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconLessThanOrEqualTo(String value) {
            addCriterion("res_icon <=", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconLike(String value) {
            addCriterion("res_icon like", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconNotLike(String value) {
            addCriterion("res_icon not like", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconIn(List<String> values) {
            addCriterion("res_icon in", values, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconNotIn(List<String> values) {
            addCriterion("res_icon not in", values, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconBetween(String value1, String value2) {
            addCriterion("res_icon between", value1, value2, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconNotBetween(String value1, String value2) {
            addCriterion("res_icon not between", value1, value2, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResSeqIsNull() {
            addCriterion("res_seq is null");
            return (Criteria) this;
        }

        public Criteria andResSeqIsNotNull() {
            addCriterion("res_seq is not null");
            return (Criteria) this;
        }

        public Criteria andResSeqEqualTo(Integer value) {
            addCriterion("res_seq =", value, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqNotEqualTo(Integer value) {
            addCriterion("res_seq <>", value, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqGreaterThan(Integer value) {
            addCriterion("res_seq >", value, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("res_seq >=", value, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqLessThan(Integer value) {
            addCriterion("res_seq <", value, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqLessThanOrEqualTo(Integer value) {
            addCriterion("res_seq <=", value, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqIn(List<Integer> values) {
            addCriterion("res_seq in", values, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqNotIn(List<Integer> values) {
            addCriterion("res_seq not in", values, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqBetween(Integer value1, Integer value2) {
            addCriterion("res_seq between", value1, value2, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("res_seq not between", value1, value2, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNull() {
            addCriterion("res_type is null");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNotNull() {
            addCriterion("res_type is not null");
            return (Criteria) this;
        }

        public Criteria andResTypeEqualTo(Integer value) {
            addCriterion("res_type =", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotEqualTo(Integer value) {
            addCriterion("res_type <>", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThan(Integer value) {
            addCriterion("res_type >", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("res_type >=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThan(Integer value) {
            addCriterion("res_type <", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThanOrEqualTo(Integer value) {
            addCriterion("res_type <=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeIn(List<Integer> values) {
            addCriterion("res_type in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotIn(List<Integer> values) {
            addCriterion("res_type not in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeBetween(Integer value1, Integer value2) {
            addCriterion("res_type between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("res_type not between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andStarusIsNull() {
            addCriterion("starus is null");
            return (Criteria) this;
        }

        public Criteria andStarusIsNotNull() {
            addCriterion("starus is not null");
            return (Criteria) this;
        }

        public Criteria andStarusEqualTo(Integer value) {
            addCriterion("starus =", value, "starus");
            return (Criteria) this;
        }

        public Criteria andStarusNotEqualTo(Integer value) {
            addCriterion("starus <>", value, "starus");
            return (Criteria) this;
        }

        public Criteria andStarusGreaterThan(Integer value) {
            addCriterion("starus >", value, "starus");
            return (Criteria) this;
        }

        public Criteria andStarusGreaterThanOrEqualTo(Integer value) {
            addCriterion("starus >=", value, "starus");
            return (Criteria) this;
        }

        public Criteria andStarusLessThan(Integer value) {
            addCriterion("starus <", value, "starus");
            return (Criteria) this;
        }

        public Criteria andStarusLessThanOrEqualTo(Integer value) {
            addCriterion("starus <=", value, "starus");
            return (Criteria) this;
        }

        public Criteria andStarusIn(List<Integer> values) {
            addCriterion("starus in", values, "starus");
            return (Criteria) this;
        }

        public Criteria andStarusNotIn(List<Integer> values) {
            addCriterion("starus not in", values, "starus");
            return (Criteria) this;
        }

        public Criteria andStarusBetween(Integer value1, Integer value2) {
            addCriterion("starus between", value1, value2, "starus");
            return (Criteria) this;
        }

        public Criteria andStarusNotBetween(Integer value1, Integer value2) {
            addCriterion("starus not between", value1, value2, "starus");
            return (Criteria) this;
        }

        public Criteria andResModuleIsNull() {
            addCriterion("res_module is null");
            return (Criteria) this;
        }

        public Criteria andResModuleIsNotNull() {
            addCriterion("res_module is not null");
            return (Criteria) this;
        }

        public Criteria andResModuleEqualTo(String value) {
            addCriterion("res_module =", value, "resModule");
            return (Criteria) this;
        }

        public Criteria andResModuleNotEqualTo(String value) {
            addCriterion("res_module <>", value, "resModule");
            return (Criteria) this;
        }

        public Criteria andResModuleGreaterThan(String value) {
            addCriterion("res_module >", value, "resModule");
            return (Criteria) this;
        }

        public Criteria andResModuleGreaterThanOrEqualTo(String value) {
            addCriterion("res_module >=", value, "resModule");
            return (Criteria) this;
        }

        public Criteria andResModuleLessThan(String value) {
            addCriterion("res_module <", value, "resModule");
            return (Criteria) this;
        }

        public Criteria andResModuleLessThanOrEqualTo(String value) {
            addCriterion("res_module <=", value, "resModule");
            return (Criteria) this;
        }

        public Criteria andResModuleLike(String value) {
            addCriterion("res_module like", value, "resModule");
            return (Criteria) this;
        }

        public Criteria andResModuleNotLike(String value) {
            addCriterion("res_module not like", value, "resModule");
            return (Criteria) this;
        }

        public Criteria andResModuleIn(List<String> values) {
            addCriterion("res_module in", values, "resModule");
            return (Criteria) this;
        }

        public Criteria andResModuleNotIn(List<String> values) {
            addCriterion("res_module not in", values, "resModule");
            return (Criteria) this;
        }

        public Criteria andResModuleBetween(String value1, String value2) {
            addCriterion("res_module between", value1, value2, "resModule");
            return (Criteria) this;
        }

        public Criteria andResModuleNotBetween(String value1, String value2) {
            addCriterion("res_module not between", value1, value2, "resModule");
            return (Criteria) this;
        }

        public Criteria andResMenuIsNull() {
            addCriterion("res_menu is null");
            return (Criteria) this;
        }

        public Criteria andResMenuIsNotNull() {
            addCriterion("res_menu is not null");
            return (Criteria) this;
        }

        public Criteria andResMenuEqualTo(String value) {
            addCriterion("res_menu =", value, "resMenu");
            return (Criteria) this;
        }

        public Criteria andResMenuNotEqualTo(String value) {
            addCriterion("res_menu <>", value, "resMenu");
            return (Criteria) this;
        }

        public Criteria andResMenuGreaterThan(String value) {
            addCriterion("res_menu >", value, "resMenu");
            return (Criteria) this;
        }

        public Criteria andResMenuGreaterThanOrEqualTo(String value) {
            addCriterion("res_menu >=", value, "resMenu");
            return (Criteria) this;
        }

        public Criteria andResMenuLessThan(String value) {
            addCriterion("res_menu <", value, "resMenu");
            return (Criteria) this;
        }

        public Criteria andResMenuLessThanOrEqualTo(String value) {
            addCriterion("res_menu <=", value, "resMenu");
            return (Criteria) this;
        }

        public Criteria andResMenuLike(String value) {
            addCriterion("res_menu like", value, "resMenu");
            return (Criteria) this;
        }

        public Criteria andResMenuNotLike(String value) {
            addCriterion("res_menu not like", value, "resMenu");
            return (Criteria) this;
        }

        public Criteria andResMenuIn(List<String> values) {
            addCriterion("res_menu in", values, "resMenu");
            return (Criteria) this;
        }

        public Criteria andResMenuNotIn(List<String> values) {
            addCriterion("res_menu not in", values, "resMenu");
            return (Criteria) this;
        }

        public Criteria andResMenuBetween(String value1, String value2) {
            addCriterion("res_menu between", value1, value2, "resMenu");
            return (Criteria) this;
        }

        public Criteria andResMenuNotBetween(String value1, String value2) {
            addCriterion("res_menu not between", value1, value2, "resMenu");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Integer value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Integer value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Integer value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Integer value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Integer value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Integer> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Integer> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Integer value1, Integer value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Integer value1, Integer value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Integer value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Integer value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Integer value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Integer value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Integer value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Integer> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Integer> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Integer value1, Integer value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Integer value1, Integer value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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