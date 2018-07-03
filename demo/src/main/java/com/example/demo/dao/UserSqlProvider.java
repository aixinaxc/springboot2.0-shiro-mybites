package com.example.demo.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.example.demo.model.User;
import com.example.demo.model.UserExample.Criteria;
import com.example.demo.model.UserExample.Criterion;
import com.example.demo.model.UserExample;
import java.util.List;
import java.util.Map;

public class UserSqlProvider {

    public String countByExample(UserExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("med_user");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(UserExample example) {
        BEGIN();
        DELETE_FROM("med_user");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(User record) {
        BEGIN();
        INSERT_INTO("med_user");
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getHospitalId() != null) {
            VALUES("hospital_id", "#{hospitalId,jdbcType=VARCHAR}");
        }
        
        if (record.getDepartmentId() != null) {
            VALUES("department_id", "#{departmentId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserMobile() != null) {
            VALUES("user_mobile", "#{userMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getUserIcon() != null) {
            VALUES("user_icon", "#{userIcon,jdbcType=VARCHAR}");
        }
        
        if (record.getUserDescriptor() != null) {
            VALUES("user_descriptor", "#{userDescriptor,jdbcType=VARCHAR}");
        }
        
        if (record.getUserName() != null) {
            VALUES("user_name", "#{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSex() != null) {
            VALUES("user_sex", "#{userSex,jdbcType=INTEGER}");
        }
        
        if (record.getUserBirthday() != null) {
            VALUES("user_birthday", "#{userBirthday,jdbcType=INTEGER}");
        }
        
        if (record.getUserAddress() != null) {
            VALUES("user_address", "#{userAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSpecialty() != null) {
            VALUES("user_specialty", "#{userSpecialty,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPresentMedicalHistory() != null) {
            VALUES("user_present_medical_history", "#{userPresentMedicalHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPastHistory() != null) {
            VALUES("user_past_history", "#{userPastHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPersonalHistory() != null) {
            VALUES("user_personal_history", "#{userPersonalHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getUserDoctorLevel() != null) {
            VALUES("user_doctor_level", "#{userDoctorLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviceToken() != null) {
            VALUES("device_token", "#{deviceToken,jdbcType=VARCHAR}");
        }
        
        if (record.getClientType() != null) {
            VALUES("client_type", "#{clientType,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedAt() != null) {
            VALUES("created_at", "#{createdAt,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            VALUES("updated_at", "#{updatedAt,jdbcType=INTEGER}");
        }
        
        if (record.getUserExamine() != null) {
            VALUES("user_examine", "#{userExamine,jdbcType=INTEGER}");
        }
        
        if (record.getUserWorkCard() != null) {
            VALUES("user_work_card", "#{userWorkCard,jdbcType=VARCHAR}");
        }
        
        if (record.getUserExamineContent() != null) {
            VALUES("user_examine_content", "#{userExamineContent,jdbcType=VARCHAR}");
        }
        
        if (record.getRyToken() != null) {
            VALUES("ry_token", "#{ryToken,jdbcType=VARCHAR}");
        }
        
        if (record.getUserIntroduce() != null) {
            VALUES("user_introduce", "#{userIntroduce,jdbcType=LONGVARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExampleWithBLOBs(UserExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("user_id");
        } else {
            SELECT("user_id");
        }
        SELECT("hospital_id");
        SELECT("department_id");
        SELECT("user_mobile");
        SELECT("user_icon");
        SELECT("user_descriptor");
        SELECT("user_name");
        SELECT("user_sex");
        SELECT("user_birthday");
        SELECT("user_address");
        SELECT("user_specialty");
        SELECT("user_present_medical_history");
        SELECT("user_past_history");
        SELECT("user_personal_history");
        SELECT("user_doctor_level");
        SELECT("device_token");
        SELECT("client_type");
        SELECT("status");
        SELECT("created_at");
        SELECT("updated_at");
        SELECT("user_examine");
        SELECT("user_work_card");
        SELECT("user_examine_content");
        SELECT("ry_token");
        SELECT("user_introduce");
        FROM("med_user");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String selectByExample(UserExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("user_id");
        } else {
            SELECT("user_id");
        }
        SELECT("hospital_id");
        SELECT("department_id");
        SELECT("user_mobile");
        SELECT("user_icon");
        SELECT("user_descriptor");
        SELECT("user_name");
        SELECT("user_sex");
        SELECT("user_birthday");
        SELECT("user_address");
        SELECT("user_specialty");
        SELECT("user_present_medical_history");
        SELECT("user_past_history");
        SELECT("user_personal_history");
        SELECT("user_doctor_level");
        SELECT("device_token");
        SELECT("client_type");
        SELECT("status");
        SELECT("created_at");
        SELECT("updated_at");
        SELECT("user_examine");
        SELECT("user_work_card");
        SELECT("user_examine_content");
        SELECT("ry_token");
        FROM("med_user");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        User record = (User) parameter.get("record");
        UserExample example = (UserExample) parameter.get("example");
        
        BEGIN();
        UPDATE("med_user");
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        }
        
        if (record.getHospitalId() != null) {
            SET("hospital_id = #{record.hospitalId,jdbcType=VARCHAR}");
        }
        
        if (record.getDepartmentId() != null) {
            SET("department_id = #{record.departmentId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserMobile() != null) {
            SET("user_mobile = #{record.userMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getUserIcon() != null) {
            SET("user_icon = #{record.userIcon,jdbcType=VARCHAR}");
        }
        
        if (record.getUserDescriptor() != null) {
            SET("user_descriptor = #{record.userDescriptor,jdbcType=VARCHAR}");
        }
        
        if (record.getUserName() != null) {
            SET("user_name = #{record.userName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSex() != null) {
            SET("user_sex = #{record.userSex,jdbcType=INTEGER}");
        }
        
        if (record.getUserBirthday() != null) {
            SET("user_birthday = #{record.userBirthday,jdbcType=INTEGER}");
        }
        
        if (record.getUserAddress() != null) {
            SET("user_address = #{record.userAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSpecialty() != null) {
            SET("user_specialty = #{record.userSpecialty,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPresentMedicalHistory() != null) {
            SET("user_present_medical_history = #{record.userPresentMedicalHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPastHistory() != null) {
            SET("user_past_history = #{record.userPastHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPersonalHistory() != null) {
            SET("user_personal_history = #{record.userPersonalHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getUserDoctorLevel() != null) {
            SET("user_doctor_level = #{record.userDoctorLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviceToken() != null) {
            SET("device_token = #{record.deviceToken,jdbcType=VARCHAR}");
        }
        
        if (record.getClientType() != null) {
            SET("client_type = #{record.clientType,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedAt() != null) {
            SET("created_at = #{record.createdAt,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            SET("updated_at = #{record.updatedAt,jdbcType=INTEGER}");
        }
        
        if (record.getUserExamine() != null) {
            SET("user_examine = #{record.userExamine,jdbcType=INTEGER}");
        }
        
        if (record.getUserWorkCard() != null) {
            SET("user_work_card = #{record.userWorkCard,jdbcType=VARCHAR}");
        }
        
        if (record.getUserExamineContent() != null) {
            SET("user_examine_content = #{record.userExamineContent,jdbcType=VARCHAR}");
        }
        
        if (record.getRyToken() != null) {
            SET("ry_token = #{record.ryToken,jdbcType=VARCHAR}");
        }
        
        if (record.getUserIntroduce() != null) {
            SET("user_introduce = #{record.userIntroduce,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("med_user");
        
        SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        SET("hospital_id = #{record.hospitalId,jdbcType=VARCHAR}");
        SET("department_id = #{record.departmentId,jdbcType=VARCHAR}");
        SET("user_mobile = #{record.userMobile,jdbcType=VARCHAR}");
        SET("user_icon = #{record.userIcon,jdbcType=VARCHAR}");
        SET("user_descriptor = #{record.userDescriptor,jdbcType=VARCHAR}");
        SET("user_name = #{record.userName,jdbcType=VARCHAR}");
        SET("user_sex = #{record.userSex,jdbcType=INTEGER}");
        SET("user_birthday = #{record.userBirthday,jdbcType=INTEGER}");
        SET("user_address = #{record.userAddress,jdbcType=VARCHAR}");
        SET("user_specialty = #{record.userSpecialty,jdbcType=VARCHAR}");
        SET("user_present_medical_history = #{record.userPresentMedicalHistory,jdbcType=VARCHAR}");
        SET("user_past_history = #{record.userPastHistory,jdbcType=VARCHAR}");
        SET("user_personal_history = #{record.userPersonalHistory,jdbcType=VARCHAR}");
        SET("user_doctor_level = #{record.userDoctorLevel,jdbcType=VARCHAR}");
        SET("device_token = #{record.deviceToken,jdbcType=VARCHAR}");
        SET("client_type = #{record.clientType,jdbcType=VARCHAR}");
        SET("status = #{record.status,jdbcType=INTEGER}");
        SET("created_at = #{record.createdAt,jdbcType=INTEGER}");
        SET("updated_at = #{record.updatedAt,jdbcType=INTEGER}");
        SET("user_examine = #{record.userExamine,jdbcType=INTEGER}");
        SET("user_work_card = #{record.userWorkCard,jdbcType=VARCHAR}");
        SET("user_examine_content = #{record.userExamineContent,jdbcType=VARCHAR}");
        SET("ry_token = #{record.ryToken,jdbcType=VARCHAR}");
        SET("user_introduce = #{record.userIntroduce,jdbcType=LONGVARCHAR}");
        
        UserExample example = (UserExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("med_user");
        
        SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        SET("hospital_id = #{record.hospitalId,jdbcType=VARCHAR}");
        SET("department_id = #{record.departmentId,jdbcType=VARCHAR}");
        SET("user_mobile = #{record.userMobile,jdbcType=VARCHAR}");
        SET("user_icon = #{record.userIcon,jdbcType=VARCHAR}");
        SET("user_descriptor = #{record.userDescriptor,jdbcType=VARCHAR}");
        SET("user_name = #{record.userName,jdbcType=VARCHAR}");
        SET("user_sex = #{record.userSex,jdbcType=INTEGER}");
        SET("user_birthday = #{record.userBirthday,jdbcType=INTEGER}");
        SET("user_address = #{record.userAddress,jdbcType=VARCHAR}");
        SET("user_specialty = #{record.userSpecialty,jdbcType=VARCHAR}");
        SET("user_present_medical_history = #{record.userPresentMedicalHistory,jdbcType=VARCHAR}");
        SET("user_past_history = #{record.userPastHistory,jdbcType=VARCHAR}");
        SET("user_personal_history = #{record.userPersonalHistory,jdbcType=VARCHAR}");
        SET("user_doctor_level = #{record.userDoctorLevel,jdbcType=VARCHAR}");
        SET("device_token = #{record.deviceToken,jdbcType=VARCHAR}");
        SET("client_type = #{record.clientType,jdbcType=VARCHAR}");
        SET("status = #{record.status,jdbcType=INTEGER}");
        SET("created_at = #{record.createdAt,jdbcType=INTEGER}");
        SET("updated_at = #{record.updatedAt,jdbcType=INTEGER}");
        SET("user_examine = #{record.userExamine,jdbcType=INTEGER}");
        SET("user_work_card = #{record.userWorkCard,jdbcType=VARCHAR}");
        SET("user_examine_content = #{record.userExamineContent,jdbcType=VARCHAR}");
        SET("ry_token = #{record.ryToken,jdbcType=VARCHAR}");
        
        UserExample example = (UserExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(User record) {
        BEGIN();
        UPDATE("med_user");
        
        if (record.getHospitalId() != null) {
            SET("hospital_id = #{hospitalId,jdbcType=VARCHAR}");
        }
        
        if (record.getDepartmentId() != null) {
            SET("department_id = #{departmentId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserMobile() != null) {
            SET("user_mobile = #{userMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getUserIcon() != null) {
            SET("user_icon = #{userIcon,jdbcType=VARCHAR}");
        }
        
        if (record.getUserDescriptor() != null) {
            SET("user_descriptor = #{userDescriptor,jdbcType=VARCHAR}");
        }
        
        if (record.getUserName() != null) {
            SET("user_name = #{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSex() != null) {
            SET("user_sex = #{userSex,jdbcType=INTEGER}");
        }
        
        if (record.getUserBirthday() != null) {
            SET("user_birthday = #{userBirthday,jdbcType=INTEGER}");
        }
        
        if (record.getUserAddress() != null) {
            SET("user_address = #{userAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSpecialty() != null) {
            SET("user_specialty = #{userSpecialty,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPresentMedicalHistory() != null) {
            SET("user_present_medical_history = #{userPresentMedicalHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPastHistory() != null) {
            SET("user_past_history = #{userPastHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPersonalHistory() != null) {
            SET("user_personal_history = #{userPersonalHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getUserDoctorLevel() != null) {
            SET("user_doctor_level = #{userDoctorLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviceToken() != null) {
            SET("device_token = #{deviceToken,jdbcType=VARCHAR}");
        }
        
        if (record.getClientType() != null) {
            SET("client_type = #{clientType,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedAt() != null) {
            SET("created_at = #{createdAt,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            SET("updated_at = #{updatedAt,jdbcType=INTEGER}");
        }
        
        if (record.getUserExamine() != null) {
            SET("user_examine = #{userExamine,jdbcType=INTEGER}");
        }
        
        if (record.getUserWorkCard() != null) {
            SET("user_work_card = #{userWorkCard,jdbcType=VARCHAR}");
        }
        
        if (record.getUserExamineContent() != null) {
            SET("user_examine_content = #{userExamineContent,jdbcType=VARCHAR}");
        }
        
        if (record.getRyToken() != null) {
            SET("ry_token = #{ryToken,jdbcType=VARCHAR}");
        }
        
        if (record.getUserIntroduce() != null) {
            SET("user_introduce = #{userIntroduce,jdbcType=LONGVARCHAR}");
        }
        
        WHERE("user_id = #{userId,jdbcType=VARCHAR}");
        
        return SQL();
    }

    protected void applyWhere(UserExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}