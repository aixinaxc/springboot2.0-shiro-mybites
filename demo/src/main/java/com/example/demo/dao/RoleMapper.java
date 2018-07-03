package com.example.demo.dao;

import com.example.demo.model.Role;
import com.example.demo.model.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface RoleMapper {
    @SelectProvider(type=RoleSqlProvider.class, method="countByExample")
    int countByExample(RoleExample example);

    @DeleteProvider(type=RoleSqlProvider.class, method="deleteByExample")
    int deleteByExample(RoleExample example);

    @Delete({
        "delete from med_role",
        "where role_id = #{roleId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String roleId);

    @Insert({
        "insert into med_role (role_id, role_name, ",
        "role_icon, role_description, ",
        "status, created_at, ",
        "updated_at)",
        "values (#{roleId,jdbcType=VARCHAR}, #{roleName,jdbcType=VARCHAR}, ",
        "#{roleIcon,jdbcType=VARCHAR}, #{roleDescription,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=INTEGER}, #{createdAt,jdbcType=INTEGER}, ",
        "#{updatedAt,jdbcType=INTEGER})"
    })
    int insert(Role record);

    @InsertProvider(type=RoleSqlProvider.class, method="insertSelective")
    int insertSelective(Role record);

    @SelectProvider(type=RoleSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="role_name", property="roleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="role_icon", property="roleIcon", jdbcType=JdbcType.VARCHAR),
        @Result(column="role_description", property="roleDescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.INTEGER)
    })
    List<Role> selectByExample(RoleExample example);

    @Select({
        "select",
        "role_id, role_name, role_icon, role_description, status, created_at, updated_at",
        "from med_role",
        "where role_id = #{roleId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="role_name", property="roleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="role_icon", property="roleIcon", jdbcType=JdbcType.VARCHAR),
        @Result(column="role_description", property="roleDescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.INTEGER)
    })
    Role selectByPrimaryKey(String roleId);

    @UpdateProvider(type=RoleSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    @UpdateProvider(type=RoleSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    @UpdateProvider(type=RoleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Role record);

    @Update({
        "update med_role",
        "set role_name = #{roleName,jdbcType=VARCHAR},",
          "role_icon = #{roleIcon,jdbcType=VARCHAR},",
          "role_description = #{roleDescription,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=INTEGER},",
          "updated_at = #{updatedAt,jdbcType=INTEGER}",
        "where role_id = #{roleId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Role record);
}