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

import com.example.demo.model.Role;
import com.example.demo.model.RoleExample.Criteria;
import com.example.demo.model.RoleExample.Criterion;
import com.example.demo.model.RoleExample;
import java.util.List;
import java.util.Map;

public class RoleSqlProvider {

    public String countByExample(RoleExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("med_role");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(RoleExample example) {
        BEGIN();
        DELETE_FROM("med_role");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Role record) {
        BEGIN();
        INSERT_INTO("med_role");
        
        if (record.getRoleId() != null) {
            VALUES("role_id", "#{roleId,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleName() != null) {
            VALUES("role_name", "#{roleName,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleIcon() != null) {
            VALUES("role_icon", "#{roleIcon,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleDescription() != null) {
            VALUES("role_description", "#{roleDescription,jdbcType=VARCHAR}");
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
        
        return SQL();
    }

    public String selectByExample(RoleExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("role_id");
        } else {
            SELECT("role_id");
        }
        SELECT("role_name");
        SELECT("role_icon");
        SELECT("role_description");
        SELECT("status");
        SELECT("created_at");
        SELECT("updated_at");
        FROM("med_role");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Role record = (Role) parameter.get("record");
        RoleExample example = (RoleExample) parameter.get("example");
        
        BEGIN();
        UPDATE("med_role");
        
        if (record.getRoleId() != null) {
            SET("role_id = #{record.roleId,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleName() != null) {
            SET("role_name = #{record.roleName,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleIcon() != null) {
            SET("role_icon = #{record.roleIcon,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleDescription() != null) {
            SET("role_description = #{record.roleDescription,jdbcType=VARCHAR}");
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
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("med_role");
        
        SET("role_id = #{record.roleId,jdbcType=VARCHAR}");
        SET("role_name = #{record.roleName,jdbcType=VARCHAR}");
        SET("role_icon = #{record.roleIcon,jdbcType=VARCHAR}");
        SET("role_description = #{record.roleDescription,jdbcType=VARCHAR}");
        SET("status = #{record.status,jdbcType=INTEGER}");
        SET("created_at = #{record.createdAt,jdbcType=INTEGER}");
        SET("updated_at = #{record.updatedAt,jdbcType=INTEGER}");
        
        RoleExample example = (RoleExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Role record) {
        BEGIN();
        UPDATE("med_role");
        
        if (record.getRoleName() != null) {
            SET("role_name = #{roleName,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleIcon() != null) {
            SET("role_icon = #{roleIcon,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleDescription() != null) {
            SET("role_description = #{roleDescription,jdbcType=VARCHAR}");
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
        
        WHERE("role_id = #{roleId,jdbcType=VARCHAR}");
        
        return SQL();
    }

    protected void applyWhere(RoleExample example, boolean includeExamplePhrase) {
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