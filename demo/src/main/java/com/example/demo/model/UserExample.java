package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIsNull() {
            addCriterion("hospital_id is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIsNotNull() {
            addCriterion("hospital_id is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdEqualTo(String value) {
            addCriterion("hospital_id =", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotEqualTo(String value) {
            addCriterion("hospital_id <>", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThan(String value) {
            addCriterion("hospital_id >", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_id >=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThan(String value) {
            addCriterion("hospital_id <", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThanOrEqualTo(String value) {
            addCriterion("hospital_id <=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLike(String value) {
            addCriterion("hospital_id like", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotLike(String value) {
            addCriterion("hospital_id not like", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIn(List<String> values) {
            addCriterion("hospital_id in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotIn(List<String> values) {
            addCriterion("hospital_id not in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdBetween(String value1, String value2) {
            addCriterion("hospital_id between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotBetween(String value1, String value2) {
            addCriterion("hospital_id not between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("department_id like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("department_id not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNull() {
            addCriterion("user_mobile is null");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNotNull() {
            addCriterion("user_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andUserMobileEqualTo(String value) {
            addCriterion("user_mobile =", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotEqualTo(String value) {
            addCriterion("user_mobile <>", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThan(String value) {
            addCriterion("user_mobile >", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("user_mobile >=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThan(String value) {
            addCriterion("user_mobile <", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThanOrEqualTo(String value) {
            addCriterion("user_mobile <=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLike(String value) {
            addCriterion("user_mobile like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotLike(String value) {
            addCriterion("user_mobile not like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileIn(List<String> values) {
            addCriterion("user_mobile in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotIn(List<String> values) {
            addCriterion("user_mobile not in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileBetween(String value1, String value2) {
            addCriterion("user_mobile between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotBetween(String value1, String value2) {
            addCriterion("user_mobile not between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserIconIsNull() {
            addCriterion("user_icon is null");
            return (Criteria) this;
        }

        public Criteria andUserIconIsNotNull() {
            addCriterion("user_icon is not null");
            return (Criteria) this;
        }

        public Criteria andUserIconEqualTo(String value) {
            addCriterion("user_icon =", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconNotEqualTo(String value) {
            addCriterion("user_icon <>", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconGreaterThan(String value) {
            addCriterion("user_icon >", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconGreaterThanOrEqualTo(String value) {
            addCriterion("user_icon >=", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconLessThan(String value) {
            addCriterion("user_icon <", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconLessThanOrEqualTo(String value) {
            addCriterion("user_icon <=", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconLike(String value) {
            addCriterion("user_icon like", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconNotLike(String value) {
            addCriterion("user_icon not like", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconIn(List<String> values) {
            addCriterion("user_icon in", values, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconNotIn(List<String> values) {
            addCriterion("user_icon not in", values, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconBetween(String value1, String value2) {
            addCriterion("user_icon between", value1, value2, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconNotBetween(String value1, String value2) {
            addCriterion("user_icon not between", value1, value2, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserDescriptorIsNull() {
            addCriterion("user_descriptor is null");
            return (Criteria) this;
        }

        public Criteria andUserDescriptorIsNotNull() {
            addCriterion("user_descriptor is not null");
            return (Criteria) this;
        }

        public Criteria andUserDescriptorEqualTo(String value) {
            addCriterion("user_descriptor =", value, "userDescriptor");
            return (Criteria) this;
        }

        public Criteria andUserDescriptorNotEqualTo(String value) {
            addCriterion("user_descriptor <>", value, "userDescriptor");
            return (Criteria) this;
        }

        public Criteria andUserDescriptorGreaterThan(String value) {
            addCriterion("user_descriptor >", value, "userDescriptor");
            return (Criteria) this;
        }

        public Criteria andUserDescriptorGreaterThanOrEqualTo(String value) {
            addCriterion("user_descriptor >=", value, "userDescriptor");
            return (Criteria) this;
        }

        public Criteria andUserDescriptorLessThan(String value) {
            addCriterion("user_descriptor <", value, "userDescriptor");
            return (Criteria) this;
        }

        public Criteria andUserDescriptorLessThanOrEqualTo(String value) {
            addCriterion("user_descriptor <=", value, "userDescriptor");
            return (Criteria) this;
        }

        public Criteria andUserDescriptorLike(String value) {
            addCriterion("user_descriptor like", value, "userDescriptor");
            return (Criteria) this;
        }

        public Criteria andUserDescriptorNotLike(String value) {
            addCriterion("user_descriptor not like", value, "userDescriptor");
            return (Criteria) this;
        }

        public Criteria andUserDescriptorIn(List<String> values) {
            addCriterion("user_descriptor in", values, "userDescriptor");
            return (Criteria) this;
        }

        public Criteria andUserDescriptorNotIn(List<String> values) {
            addCriterion("user_descriptor not in", values, "userDescriptor");
            return (Criteria) this;
        }

        public Criteria andUserDescriptorBetween(String value1, String value2) {
            addCriterion("user_descriptor between", value1, value2, "userDescriptor");
            return (Criteria) this;
        }

        public Criteria andUserDescriptorNotBetween(String value1, String value2) {
            addCriterion("user_descriptor not between", value1, value2, "userDescriptor");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(Integer value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(Integer value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(Integer value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(Integer value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(Integer value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<Integer> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<Integer> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(Integer value1, Integer value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(Integer value1, Integer value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("user_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("user_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(Integer value) {
            addCriterion("user_birthday =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(Integer value) {
            addCriterion("user_birthday <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(Integer value) {
            addCriterion("user_birthday >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_birthday >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(Integer value) {
            addCriterion("user_birthday <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(Integer value) {
            addCriterion("user_birthday <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<Integer> values) {
            addCriterion("user_birthday in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<Integer> values) {
            addCriterion("user_birthday not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(Integer value1, Integer value2) {
            addCriterion("user_birthday between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(Integer value1, Integer value2) {
            addCriterion("user_birthday not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserSpecialtyIsNull() {
            addCriterion("user_specialty is null");
            return (Criteria) this;
        }

        public Criteria andUserSpecialtyIsNotNull() {
            addCriterion("user_specialty is not null");
            return (Criteria) this;
        }

        public Criteria andUserSpecialtyEqualTo(String value) {
            addCriterion("user_specialty =", value, "userSpecialty");
            return (Criteria) this;
        }

        public Criteria andUserSpecialtyNotEqualTo(String value) {
            addCriterion("user_specialty <>", value, "userSpecialty");
            return (Criteria) this;
        }

        public Criteria andUserSpecialtyGreaterThan(String value) {
            addCriterion("user_specialty >", value, "userSpecialty");
            return (Criteria) this;
        }

        public Criteria andUserSpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("user_specialty >=", value, "userSpecialty");
            return (Criteria) this;
        }

        public Criteria andUserSpecialtyLessThan(String value) {
            addCriterion("user_specialty <", value, "userSpecialty");
            return (Criteria) this;
        }

        public Criteria andUserSpecialtyLessThanOrEqualTo(String value) {
            addCriterion("user_specialty <=", value, "userSpecialty");
            return (Criteria) this;
        }

        public Criteria andUserSpecialtyLike(String value) {
            addCriterion("user_specialty like", value, "userSpecialty");
            return (Criteria) this;
        }

        public Criteria andUserSpecialtyNotLike(String value) {
            addCriterion("user_specialty not like", value, "userSpecialty");
            return (Criteria) this;
        }

        public Criteria andUserSpecialtyIn(List<String> values) {
            addCriterion("user_specialty in", values, "userSpecialty");
            return (Criteria) this;
        }

        public Criteria andUserSpecialtyNotIn(List<String> values) {
            addCriterion("user_specialty not in", values, "userSpecialty");
            return (Criteria) this;
        }

        public Criteria andUserSpecialtyBetween(String value1, String value2) {
            addCriterion("user_specialty between", value1, value2, "userSpecialty");
            return (Criteria) this;
        }

        public Criteria andUserSpecialtyNotBetween(String value1, String value2) {
            addCriterion("user_specialty not between", value1, value2, "userSpecialty");
            return (Criteria) this;
        }

        public Criteria andUserPresentMedicalHistoryIsNull() {
            addCriterion("user_present_medical_history is null");
            return (Criteria) this;
        }

        public Criteria andUserPresentMedicalHistoryIsNotNull() {
            addCriterion("user_present_medical_history is not null");
            return (Criteria) this;
        }

        public Criteria andUserPresentMedicalHistoryEqualTo(String value) {
            addCriterion("user_present_medical_history =", value, "userPresentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPresentMedicalHistoryNotEqualTo(String value) {
            addCriterion("user_present_medical_history <>", value, "userPresentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPresentMedicalHistoryGreaterThan(String value) {
            addCriterion("user_present_medical_history >", value, "userPresentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPresentMedicalHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("user_present_medical_history >=", value, "userPresentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPresentMedicalHistoryLessThan(String value) {
            addCriterion("user_present_medical_history <", value, "userPresentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPresentMedicalHistoryLessThanOrEqualTo(String value) {
            addCriterion("user_present_medical_history <=", value, "userPresentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPresentMedicalHistoryLike(String value) {
            addCriterion("user_present_medical_history like", value, "userPresentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPresentMedicalHistoryNotLike(String value) {
            addCriterion("user_present_medical_history not like", value, "userPresentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPresentMedicalHistoryIn(List<String> values) {
            addCriterion("user_present_medical_history in", values, "userPresentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPresentMedicalHistoryNotIn(List<String> values) {
            addCriterion("user_present_medical_history not in", values, "userPresentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPresentMedicalHistoryBetween(String value1, String value2) {
            addCriterion("user_present_medical_history between", value1, value2, "userPresentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPresentMedicalHistoryNotBetween(String value1, String value2) {
            addCriterion("user_present_medical_history not between", value1, value2, "userPresentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPastHistoryIsNull() {
            addCriterion("user_past_history is null");
            return (Criteria) this;
        }

        public Criteria andUserPastHistoryIsNotNull() {
            addCriterion("user_past_history is not null");
            return (Criteria) this;
        }

        public Criteria andUserPastHistoryEqualTo(String value) {
            addCriterion("user_past_history =", value, "userPastHistory");
            return (Criteria) this;
        }

        public Criteria andUserPastHistoryNotEqualTo(String value) {
            addCriterion("user_past_history <>", value, "userPastHistory");
            return (Criteria) this;
        }

        public Criteria andUserPastHistoryGreaterThan(String value) {
            addCriterion("user_past_history >", value, "userPastHistory");
            return (Criteria) this;
        }

        public Criteria andUserPastHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("user_past_history >=", value, "userPastHistory");
            return (Criteria) this;
        }

        public Criteria andUserPastHistoryLessThan(String value) {
            addCriterion("user_past_history <", value, "userPastHistory");
            return (Criteria) this;
        }

        public Criteria andUserPastHistoryLessThanOrEqualTo(String value) {
            addCriterion("user_past_history <=", value, "userPastHistory");
            return (Criteria) this;
        }

        public Criteria andUserPastHistoryLike(String value) {
            addCriterion("user_past_history like", value, "userPastHistory");
            return (Criteria) this;
        }

        public Criteria andUserPastHistoryNotLike(String value) {
            addCriterion("user_past_history not like", value, "userPastHistory");
            return (Criteria) this;
        }

        public Criteria andUserPastHistoryIn(List<String> values) {
            addCriterion("user_past_history in", values, "userPastHistory");
            return (Criteria) this;
        }

        public Criteria andUserPastHistoryNotIn(List<String> values) {
            addCriterion("user_past_history not in", values, "userPastHistory");
            return (Criteria) this;
        }

        public Criteria andUserPastHistoryBetween(String value1, String value2) {
            addCriterion("user_past_history between", value1, value2, "userPastHistory");
            return (Criteria) this;
        }

        public Criteria andUserPastHistoryNotBetween(String value1, String value2) {
            addCriterion("user_past_history not between", value1, value2, "userPastHistory");
            return (Criteria) this;
        }

        public Criteria andUserPersonalHistoryIsNull() {
            addCriterion("user_personal_history is null");
            return (Criteria) this;
        }

        public Criteria andUserPersonalHistoryIsNotNull() {
            addCriterion("user_personal_history is not null");
            return (Criteria) this;
        }

        public Criteria andUserPersonalHistoryEqualTo(String value) {
            addCriterion("user_personal_history =", value, "userPersonalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPersonalHistoryNotEqualTo(String value) {
            addCriterion("user_personal_history <>", value, "userPersonalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPersonalHistoryGreaterThan(String value) {
            addCriterion("user_personal_history >", value, "userPersonalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPersonalHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("user_personal_history >=", value, "userPersonalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPersonalHistoryLessThan(String value) {
            addCriterion("user_personal_history <", value, "userPersonalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPersonalHistoryLessThanOrEqualTo(String value) {
            addCriterion("user_personal_history <=", value, "userPersonalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPersonalHistoryLike(String value) {
            addCriterion("user_personal_history like", value, "userPersonalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPersonalHistoryNotLike(String value) {
            addCriterion("user_personal_history not like", value, "userPersonalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPersonalHistoryIn(List<String> values) {
            addCriterion("user_personal_history in", values, "userPersonalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPersonalHistoryNotIn(List<String> values) {
            addCriterion("user_personal_history not in", values, "userPersonalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPersonalHistoryBetween(String value1, String value2) {
            addCriterion("user_personal_history between", value1, value2, "userPersonalHistory");
            return (Criteria) this;
        }

        public Criteria andUserPersonalHistoryNotBetween(String value1, String value2) {
            addCriterion("user_personal_history not between", value1, value2, "userPersonalHistory");
            return (Criteria) this;
        }

        public Criteria andUserDoctorLevelIsNull() {
            addCriterion("user_doctor_level is null");
            return (Criteria) this;
        }

        public Criteria andUserDoctorLevelIsNotNull() {
            addCriterion("user_doctor_level is not null");
            return (Criteria) this;
        }

        public Criteria andUserDoctorLevelEqualTo(String value) {
            addCriterion("user_doctor_level =", value, "userDoctorLevel");
            return (Criteria) this;
        }

        public Criteria andUserDoctorLevelNotEqualTo(String value) {
            addCriterion("user_doctor_level <>", value, "userDoctorLevel");
            return (Criteria) this;
        }

        public Criteria andUserDoctorLevelGreaterThan(String value) {
            addCriterion("user_doctor_level >", value, "userDoctorLevel");
            return (Criteria) this;
        }

        public Criteria andUserDoctorLevelGreaterThanOrEqualTo(String value) {
            addCriterion("user_doctor_level >=", value, "userDoctorLevel");
            return (Criteria) this;
        }

        public Criteria andUserDoctorLevelLessThan(String value) {
            addCriterion("user_doctor_level <", value, "userDoctorLevel");
            return (Criteria) this;
        }

        public Criteria andUserDoctorLevelLessThanOrEqualTo(String value) {
            addCriterion("user_doctor_level <=", value, "userDoctorLevel");
            return (Criteria) this;
        }

        public Criteria andUserDoctorLevelLike(String value) {
            addCriterion("user_doctor_level like", value, "userDoctorLevel");
            return (Criteria) this;
        }

        public Criteria andUserDoctorLevelNotLike(String value) {
            addCriterion("user_doctor_level not like", value, "userDoctorLevel");
            return (Criteria) this;
        }

        public Criteria andUserDoctorLevelIn(List<String> values) {
            addCriterion("user_doctor_level in", values, "userDoctorLevel");
            return (Criteria) this;
        }

        public Criteria andUserDoctorLevelNotIn(List<String> values) {
            addCriterion("user_doctor_level not in", values, "userDoctorLevel");
            return (Criteria) this;
        }

        public Criteria andUserDoctorLevelBetween(String value1, String value2) {
            addCriterion("user_doctor_level between", value1, value2, "userDoctorLevel");
            return (Criteria) this;
        }

        public Criteria andUserDoctorLevelNotBetween(String value1, String value2) {
            addCriterion("user_doctor_level not between", value1, value2, "userDoctorLevel");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenIsNull() {
            addCriterion("device_token is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenIsNotNull() {
            addCriterion("device_token is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenEqualTo(String value) {
            addCriterion("device_token =", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotEqualTo(String value) {
            addCriterion("device_token <>", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenGreaterThan(String value) {
            addCriterion("device_token >", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenGreaterThanOrEqualTo(String value) {
            addCriterion("device_token >=", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenLessThan(String value) {
            addCriterion("device_token <", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenLessThanOrEqualTo(String value) {
            addCriterion("device_token <=", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenLike(String value) {
            addCriterion("device_token like", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotLike(String value) {
            addCriterion("device_token not like", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenIn(List<String> values) {
            addCriterion("device_token in", values, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotIn(List<String> values) {
            addCriterion("device_token not in", values, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenBetween(String value1, String value2) {
            addCriterion("device_token between", value1, value2, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotBetween(String value1, String value2) {
            addCriterion("device_token not between", value1, value2, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNull() {
            addCriterion("client_type is null");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNotNull() {
            addCriterion("client_type is not null");
            return (Criteria) this;
        }

        public Criteria andClientTypeEqualTo(String value) {
            addCriterion("client_type =", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotEqualTo(String value) {
            addCriterion("client_type <>", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThan(String value) {
            addCriterion("client_type >", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThanOrEqualTo(String value) {
            addCriterion("client_type >=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThan(String value) {
            addCriterion("client_type <", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThanOrEqualTo(String value) {
            addCriterion("client_type <=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLike(String value) {
            addCriterion("client_type like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotLike(String value) {
            addCriterion("client_type not like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeIn(List<String> values) {
            addCriterion("client_type in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotIn(List<String> values) {
            addCriterion("client_type not in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeBetween(String value1, String value2) {
            addCriterion("client_type between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotBetween(String value1, String value2) {
            addCriterion("client_type not between", value1, value2, "clientType");
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

        public Criteria andUserExamineIsNull() {
            addCriterion("user_examine is null");
            return (Criteria) this;
        }

        public Criteria andUserExamineIsNotNull() {
            addCriterion("user_examine is not null");
            return (Criteria) this;
        }

        public Criteria andUserExamineEqualTo(Integer value) {
            addCriterion("user_examine =", value, "userExamine");
            return (Criteria) this;
        }

        public Criteria andUserExamineNotEqualTo(Integer value) {
            addCriterion("user_examine <>", value, "userExamine");
            return (Criteria) this;
        }

        public Criteria andUserExamineGreaterThan(Integer value) {
            addCriterion("user_examine >", value, "userExamine");
            return (Criteria) this;
        }

        public Criteria andUserExamineGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_examine >=", value, "userExamine");
            return (Criteria) this;
        }

        public Criteria andUserExamineLessThan(Integer value) {
            addCriterion("user_examine <", value, "userExamine");
            return (Criteria) this;
        }

        public Criteria andUserExamineLessThanOrEqualTo(Integer value) {
            addCriterion("user_examine <=", value, "userExamine");
            return (Criteria) this;
        }

        public Criteria andUserExamineIn(List<Integer> values) {
            addCriterion("user_examine in", values, "userExamine");
            return (Criteria) this;
        }

        public Criteria andUserExamineNotIn(List<Integer> values) {
            addCriterion("user_examine not in", values, "userExamine");
            return (Criteria) this;
        }

        public Criteria andUserExamineBetween(Integer value1, Integer value2) {
            addCriterion("user_examine between", value1, value2, "userExamine");
            return (Criteria) this;
        }

        public Criteria andUserExamineNotBetween(Integer value1, Integer value2) {
            addCriterion("user_examine not between", value1, value2, "userExamine");
            return (Criteria) this;
        }

        public Criteria andUserWorkCardIsNull() {
            addCriterion("user_work_card is null");
            return (Criteria) this;
        }

        public Criteria andUserWorkCardIsNotNull() {
            addCriterion("user_work_card is not null");
            return (Criteria) this;
        }

        public Criteria andUserWorkCardEqualTo(String value) {
            addCriterion("user_work_card =", value, "userWorkCard");
            return (Criteria) this;
        }

        public Criteria andUserWorkCardNotEqualTo(String value) {
            addCriterion("user_work_card <>", value, "userWorkCard");
            return (Criteria) this;
        }

        public Criteria andUserWorkCardGreaterThan(String value) {
            addCriterion("user_work_card >", value, "userWorkCard");
            return (Criteria) this;
        }

        public Criteria andUserWorkCardGreaterThanOrEqualTo(String value) {
            addCriterion("user_work_card >=", value, "userWorkCard");
            return (Criteria) this;
        }

        public Criteria andUserWorkCardLessThan(String value) {
            addCriterion("user_work_card <", value, "userWorkCard");
            return (Criteria) this;
        }

        public Criteria andUserWorkCardLessThanOrEqualTo(String value) {
            addCriterion("user_work_card <=", value, "userWorkCard");
            return (Criteria) this;
        }

        public Criteria andUserWorkCardLike(String value) {
            addCriterion("user_work_card like", value, "userWorkCard");
            return (Criteria) this;
        }

        public Criteria andUserWorkCardNotLike(String value) {
            addCriterion("user_work_card not like", value, "userWorkCard");
            return (Criteria) this;
        }

        public Criteria andUserWorkCardIn(List<String> values) {
            addCriterion("user_work_card in", values, "userWorkCard");
            return (Criteria) this;
        }

        public Criteria andUserWorkCardNotIn(List<String> values) {
            addCriterion("user_work_card not in", values, "userWorkCard");
            return (Criteria) this;
        }

        public Criteria andUserWorkCardBetween(String value1, String value2) {
            addCriterion("user_work_card between", value1, value2, "userWorkCard");
            return (Criteria) this;
        }

        public Criteria andUserWorkCardNotBetween(String value1, String value2) {
            addCriterion("user_work_card not between", value1, value2, "userWorkCard");
            return (Criteria) this;
        }

        public Criteria andUserExamineContentIsNull() {
            addCriterion("user_examine_content is null");
            return (Criteria) this;
        }

        public Criteria andUserExamineContentIsNotNull() {
            addCriterion("user_examine_content is not null");
            return (Criteria) this;
        }

        public Criteria andUserExamineContentEqualTo(String value) {
            addCriterion("user_examine_content =", value, "userExamineContent");
            return (Criteria) this;
        }

        public Criteria andUserExamineContentNotEqualTo(String value) {
            addCriterion("user_examine_content <>", value, "userExamineContent");
            return (Criteria) this;
        }

        public Criteria andUserExamineContentGreaterThan(String value) {
            addCriterion("user_examine_content >", value, "userExamineContent");
            return (Criteria) this;
        }

        public Criteria andUserExamineContentGreaterThanOrEqualTo(String value) {
            addCriterion("user_examine_content >=", value, "userExamineContent");
            return (Criteria) this;
        }

        public Criteria andUserExamineContentLessThan(String value) {
            addCriterion("user_examine_content <", value, "userExamineContent");
            return (Criteria) this;
        }

        public Criteria andUserExamineContentLessThanOrEqualTo(String value) {
            addCriterion("user_examine_content <=", value, "userExamineContent");
            return (Criteria) this;
        }

        public Criteria andUserExamineContentLike(String value) {
            addCriterion("user_examine_content like", value, "userExamineContent");
            return (Criteria) this;
        }

        public Criteria andUserExamineContentNotLike(String value) {
            addCriterion("user_examine_content not like", value, "userExamineContent");
            return (Criteria) this;
        }

        public Criteria andUserExamineContentIn(List<String> values) {
            addCriterion("user_examine_content in", values, "userExamineContent");
            return (Criteria) this;
        }

        public Criteria andUserExamineContentNotIn(List<String> values) {
            addCriterion("user_examine_content not in", values, "userExamineContent");
            return (Criteria) this;
        }

        public Criteria andUserExamineContentBetween(String value1, String value2) {
            addCriterion("user_examine_content between", value1, value2, "userExamineContent");
            return (Criteria) this;
        }

        public Criteria andUserExamineContentNotBetween(String value1, String value2) {
            addCriterion("user_examine_content not between", value1, value2, "userExamineContent");
            return (Criteria) this;
        }

        public Criteria andRyTokenIsNull() {
            addCriterion("ry_token is null");
            return (Criteria) this;
        }

        public Criteria andRyTokenIsNotNull() {
            addCriterion("ry_token is not null");
            return (Criteria) this;
        }

        public Criteria andRyTokenEqualTo(String value) {
            addCriterion("ry_token =", value, "ryToken");
            return (Criteria) this;
        }

        public Criteria andRyTokenNotEqualTo(String value) {
            addCriterion("ry_token <>", value, "ryToken");
            return (Criteria) this;
        }

        public Criteria andRyTokenGreaterThan(String value) {
            addCriterion("ry_token >", value, "ryToken");
            return (Criteria) this;
        }

        public Criteria andRyTokenGreaterThanOrEqualTo(String value) {
            addCriterion("ry_token >=", value, "ryToken");
            return (Criteria) this;
        }

        public Criteria andRyTokenLessThan(String value) {
            addCriterion("ry_token <", value, "ryToken");
            return (Criteria) this;
        }

        public Criteria andRyTokenLessThanOrEqualTo(String value) {
            addCriterion("ry_token <=", value, "ryToken");
            return (Criteria) this;
        }

        public Criteria andRyTokenLike(String value) {
            addCriterion("ry_token like", value, "ryToken");
            return (Criteria) this;
        }

        public Criteria andRyTokenNotLike(String value) {
            addCriterion("ry_token not like", value, "ryToken");
            return (Criteria) this;
        }

        public Criteria andRyTokenIn(List<String> values) {
            addCriterion("ry_token in", values, "ryToken");
            return (Criteria) this;
        }

        public Criteria andRyTokenNotIn(List<String> values) {
            addCriterion("ry_token not in", values, "ryToken");
            return (Criteria) this;
        }

        public Criteria andRyTokenBetween(String value1, String value2) {
            addCriterion("ry_token between", value1, value2, "ryToken");
            return (Criteria) this;
        }

        public Criteria andRyTokenNotBetween(String value1, String value2) {
            addCriterion("ry_token not between", value1, value2, "ryToken");
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