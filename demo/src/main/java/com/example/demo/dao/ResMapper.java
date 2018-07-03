package com.example.demo.dao;

import com.example.demo.model.Res;
import com.example.demo.model.ResExample;
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

public interface ResMapper {

    @Select("SELECT * FROM med_res")
    List<Res> findRes();


    @Select({"SELECT * FROM med_res AS res,med_role_res AS rr,med_user AS u,med_user_role AS ur",
            "WHERE u.user_id = ur.user_id AND rr.res_id = res.res_id AND ur.user_id=#{userId,jdbcType=VARCHAR}"})
    List<Res> findByUserName(String userName);


    @SelectProvider(type=ResSqlProvider.class, method="countByExample")
    int countByExample(ResExample example);

    @DeleteProvider(type=ResSqlProvider.class, method="deleteByExample")
    int deleteByExample(ResExample example);

    @Delete({
        "delete from med_res",
        "where res_id = #{resId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String resId);

    @Insert({
        "insert into med_res (res_id, res_pid, ",
        "res_name, res_url, ",
        "res_icon, res_seq, ",
        "res_type, starus, ",
        "res_module, res_menu, ",
        "created_at, updated_at)",
        "values (#{resId,jdbcType=VARCHAR}, #{resPid,jdbcType=VARCHAR}, ",
        "#{resName,jdbcType=VARCHAR}, #{resUrl,jdbcType=VARCHAR}, ",
        "#{resIcon,jdbcType=VARCHAR}, #{resSeq,jdbcType=INTEGER}, ",
        "#{resType,jdbcType=INTEGER}, #{starus,jdbcType=INTEGER}, ",
        "#{resModule,jdbcType=VARCHAR}, #{resMenu,jdbcType=VARCHAR}, ",
        "#{createdAt,jdbcType=INTEGER}, #{updatedAt,jdbcType=INTEGER})"
    })
    int insert(Res record);

    @InsertProvider(type=ResSqlProvider.class, method="insertSelective")
    int insertSelective(Res record);

    @SelectProvider(type=ResSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="res_id", property="resId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="res_pid", property="resPid", jdbcType=JdbcType.VARCHAR),
        @Result(column="res_name", property="resName", jdbcType=JdbcType.VARCHAR),
        @Result(column="res_url", property="resUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="res_icon", property="resIcon", jdbcType=JdbcType.VARCHAR),
        @Result(column="res_seq", property="resSeq", jdbcType=JdbcType.INTEGER),
        @Result(column="res_type", property="resType", jdbcType=JdbcType.INTEGER),
        @Result(column="starus", property="starus", jdbcType=JdbcType.INTEGER),
        @Result(column="res_module", property="resModule", jdbcType=JdbcType.VARCHAR),
        @Result(column="res_menu", property="resMenu", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.INTEGER)
    })
    List<Res> selectByExample(ResExample example);

    @Select({
        "select",
        "res_id, res_pid, res_name, res_url, res_icon, res_seq, res_type, starus, res_module, ",
        "res_menu, created_at, updated_at",
        "from med_res",
        "where res_id = #{resId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="res_id", property="resId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="res_pid", property="resPid", jdbcType=JdbcType.VARCHAR),
        @Result(column="res_name", property="resName", jdbcType=JdbcType.VARCHAR),
        @Result(column="res_url", property="resUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="res_icon", property="resIcon", jdbcType=JdbcType.VARCHAR),
        @Result(column="res_seq", property="resSeq", jdbcType=JdbcType.INTEGER),
        @Result(column="res_type", property="resType", jdbcType=JdbcType.INTEGER),
        @Result(column="starus", property="starus", jdbcType=JdbcType.INTEGER),
        @Result(column="res_module", property="resModule", jdbcType=JdbcType.VARCHAR),
        @Result(column="res_menu", property="resMenu", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.INTEGER)
    })
    Res selectByPrimaryKey(String resId);

    @UpdateProvider(type=ResSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Res record, @Param("example") ResExample example);

    @UpdateProvider(type=ResSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Res record, @Param("example") ResExample example);

    @UpdateProvider(type=ResSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Res record);

    @Update({
        "update med_res",
        "set res_pid = #{resPid,jdbcType=VARCHAR},",
          "res_name = #{resName,jdbcType=VARCHAR},",
          "res_url = #{resUrl,jdbcType=VARCHAR},",
          "res_icon = #{resIcon,jdbcType=VARCHAR},",
          "res_seq = #{resSeq,jdbcType=INTEGER},",
          "res_type = #{resType,jdbcType=INTEGER},",
          "starus = #{starus,jdbcType=INTEGER},",
          "res_module = #{resModule,jdbcType=VARCHAR},",
          "res_menu = #{resMenu,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=INTEGER},",
          "updated_at = #{updatedAt,jdbcType=INTEGER}",
        "where res_id = #{resId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Res record);
}