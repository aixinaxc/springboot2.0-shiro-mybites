package com.example.demo.dao;

import com.example.demo.model.RoleRes;
import com.example.demo.model.RoleResExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface RoleResMapper {
    @SelectProvider(type=RoleResSqlProvider.class, method="countByExample")
    int countByExample(RoleResExample example);

    @DeleteProvider(type=RoleResSqlProvider.class, method="deleteByExample")
    int deleteByExample(RoleResExample example);

    @Insert({
        "insert into med_role_res (role_id, res_id)",
        "values (#{roleId,jdbcType=VARCHAR}, #{resId,jdbcType=VARCHAR})"
    })
    int insert(RoleRes record);

    @InsertProvider(type=RoleResSqlProvider.class, method="insertSelective")
    int insertSelective(RoleRes record);

    @SelectProvider(type=RoleResSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.VARCHAR),
        @Result(column="res_id", property="resId", jdbcType=JdbcType.VARCHAR)
    })
    List<RoleRes> selectByExample(RoleResExample example);

    @UpdateProvider(type=RoleResSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") RoleRes record, @Param("example") RoleResExample example);

    @UpdateProvider(type=RoleResSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") RoleRes record, @Param("example") RoleResExample example);
}