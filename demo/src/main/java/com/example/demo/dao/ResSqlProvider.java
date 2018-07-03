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

import com.example.demo.model.Res;
import com.example.demo.model.ResExample.Criteria;
import com.example.demo.model.ResExample.Criterion;
import com.example.demo.model.ResExample;
import java.util.List;
import java.util.Map;

public class ResSqlProvider {

    public String countByExample(ResExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("med_res");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(ResExample example) {
        BEGIN();
        DELETE_FROM("med_res");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Res record) {
        BEGIN();
        INSERT_INTO("med_res");
        
        if (record.getResId() != null) {
            VALUES("res_id", "#{resId,jdbcType=VARCHAR}");
        }
        
        if (record.getResPid() != null) {
            VALUES("res_pid", "#{resPid,jdbcType=VARCHAR}");
        }
        
        if (record.getResName() != null) {
            VALUES("res_name", "#{resName,jdbcType=VARCHAR}");
        }
        
        if (record.getResUrl() != null) {
            VALUES("res_url", "#{resUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getResIcon() != null) {
            VALUES("res_icon", "#{resIcon,jdbcType=VARCHAR}");
        }
        
        if (record.getResSeq() != null) {
            VALUES("res_seq", "#{resSeq,jdbcType=INTEGER}");
        }
        
        if (record.getResType() != null) {
            VALUES("res_type", "#{resType,jdbcType=INTEGER}");
        }
        
        if (record.getStarus() != null) {
            VALUES("starus", "#{starus,jdbcType=INTEGER}");
        }
        
        if (record.getResModule() != null) {
            VALUES("res_module", "#{resModule,jdbcType=VARCHAR}");
        }
        
        if (record.getResMenu() != null) {
            VALUES("res_menu", "#{resMenu,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            VALUES("created_at", "#{createdAt,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            VALUES("updated_at", "#{updatedAt,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    public String selectByExample(ResExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("res_id");
        } else {
            SELECT("res_id");
        }
        SELECT("res_pid");
        SELECT("res_name");
        SELECT("res_url");
        SELECT("res_icon");
        SELECT("res_seq");
        SELECT("res_type");
        SELECT("starus");
        SELECT("res_module");
        SELECT("res_menu");
        SELECT("created_at");
        SELECT("updated_at");
        FROM("med_res");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Res record = (Res) parameter.get("record");
        ResExample example = (ResExample) parameter.get("example");
        
        BEGIN();
        UPDATE("med_res");
        
        if (record.getResId() != null) {
            SET("res_id = #{record.resId,jdbcType=VARCHAR}");
        }
        
        if (record.getResPid() != null) {
            SET("res_pid = #{record.resPid,jdbcType=VARCHAR}");
        }
        
        if (record.getResName() != null) {
            SET("res_name = #{record.resName,jdbcType=VARCHAR}");
        }
        
        if (record.getResUrl() != null) {
            SET("res_url = #{record.resUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getResIcon() != null) {
            SET("res_icon = #{record.resIcon,jdbcType=VARCHAR}");
        }
        
        if (record.getResSeq() != null) {
            SET("res_seq = #{record.resSeq,jdbcType=INTEGER}");
        }
        
        if (record.getResType() != null) {
            SET("res_type = #{record.resType,jdbcType=INTEGER}");
        }
        
        if (record.getStarus() != null) {
            SET("starus = #{record.starus,jdbcType=INTEGER}");
        }
        
        if (record.getResModule() != null) {
            SET("res_module = #{record.resModule,jdbcType=VARCHAR}");
        }
        
        if (record.getResMenu() != null) {
            SET("res_menu = #{record.resMenu,jdbcType=VARCHAR}");
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
        UPDATE("med_res");
        
        SET("res_id = #{record.resId,jdbcType=VARCHAR}");
        SET("res_pid = #{record.resPid,jdbcType=VARCHAR}");
        SET("res_name = #{record.resName,jdbcType=VARCHAR}");
        SET("res_url = #{record.resUrl,jdbcType=VARCHAR}");
        SET("res_icon = #{record.resIcon,jdbcType=VARCHAR}");
        SET("res_seq = #{record.resSeq,jdbcType=INTEGER}");
        SET("res_type = #{record.resType,jdbcType=INTEGER}");
        SET("starus = #{record.starus,jdbcType=INTEGER}");
        SET("res_module = #{record.resModule,jdbcType=VARCHAR}");
        SET("res_menu = #{record.resMenu,jdbcType=VARCHAR}");
        SET("created_at = #{record.createdAt,jdbcType=INTEGER}");
        SET("updated_at = #{record.updatedAt,jdbcType=INTEGER}");
        
        ResExample example = (ResExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Res record) {
        BEGIN();
        UPDATE("med_res");
        
        if (record.getResPid() != null) {
            SET("res_pid = #{resPid,jdbcType=VARCHAR}");
        }
        
        if (record.getResName() != null) {
            SET("res_name = #{resName,jdbcType=VARCHAR}");
        }
        
        if (record.getResUrl() != null) {
            SET("res_url = #{resUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getResIcon() != null) {
            SET("res_icon = #{resIcon,jdbcType=VARCHAR}");
        }
        
        if (record.getResSeq() != null) {
            SET("res_seq = #{resSeq,jdbcType=INTEGER}");
        }
        
        if (record.getResType() != null) {
            SET("res_type = #{resType,jdbcType=INTEGER}");
        }
        
        if (record.getStarus() != null) {
            SET("starus = #{starus,jdbcType=INTEGER}");
        }
        
        if (record.getResModule() != null) {
            SET("res_module = #{resModule,jdbcType=VARCHAR}");
        }
        
        if (record.getResMenu() != null) {
            SET("res_menu = #{resMenu,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            SET("created_at = #{createdAt,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            SET("updated_at = #{updatedAt,jdbcType=INTEGER}");
        }
        
        WHERE("res_id = #{resId,jdbcType=VARCHAR}");
        
        return SQL();
    }

    protected void applyWhere(ResExample example, boolean includeExamplePhrase) {
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