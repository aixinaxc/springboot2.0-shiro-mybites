package com.example.demo.dao;

import com.example.demo.model.User;
import com.example.demo.model.UserExample;
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

public interface UserMapper {

    @Select({"SELECT * FROM med_user ",
            "WHERE user_id=#{username,jdbcType=VARCHAR}"})
    User findUserByName(@Param("username")String username);

    @Select({"SELECT * FROM med_user ",
            "WHERE user_id=#{username,jdbcType=VARCHAR} AND user_mobile=#{password,jdbcType=VARCHAR}"})
    User findUser(@Param("username")String username, @Param("password")String password);


    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    int countByExample(UserExample example);

    @DeleteProvider(type=UserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserExample example);

    @Delete({
        "delete from med_user",
        "where user_id = #{userId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String userId);

    @Insert({
        "insert into med_user (user_id, hospital_id, ",
        "department_id, user_mobile, ",
        "user_icon, user_descriptor, ",
        "user_name, user_sex, ",
        "user_birthday, user_address, ",
        "user_specialty, user_present_medical_history, ",
        "user_past_history, user_personal_history, ",
        "user_doctor_level, device_token, ",
        "client_type, status, ",
        "created_at, updated_at, ",
        "user_examine, user_work_card, ",
        "user_examine_content, ry_token, ",
        "user_introduce)",
        "values (#{userId,jdbcType=VARCHAR}, #{hospitalId,jdbcType=VARCHAR}, ",
        "#{departmentId,jdbcType=VARCHAR}, #{userMobile,jdbcType=VARCHAR}, ",
        "#{userIcon,jdbcType=VARCHAR}, #{userDescriptor,jdbcType=VARCHAR}, ",
        "#{userName,jdbcType=VARCHAR}, #{userSex,jdbcType=INTEGER}, ",
        "#{userBirthday,jdbcType=INTEGER}, #{userAddress,jdbcType=VARCHAR}, ",
        "#{userSpecialty,jdbcType=VARCHAR}, #{userPresentMedicalHistory,jdbcType=VARCHAR}, ",
        "#{userPastHistory,jdbcType=VARCHAR}, #{userPersonalHistory,jdbcType=VARCHAR}, ",
        "#{userDoctorLevel,jdbcType=VARCHAR}, #{deviceToken,jdbcType=VARCHAR}, ",
        "#{clientType,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, ",
        "#{createdAt,jdbcType=INTEGER}, #{updatedAt,jdbcType=INTEGER}, ",
        "#{userExamine,jdbcType=INTEGER}, #{userWorkCard,jdbcType=VARCHAR}, ",
        "#{userExamineContent,jdbcType=VARCHAR}, #{ryToken,jdbcType=VARCHAR}, ",
        "#{userIntroduce,jdbcType=LONGVARCHAR})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="hospital_id", property="hospitalId", jdbcType=JdbcType.VARCHAR),
        @Result(column="department_id", property="departmentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_mobile", property="userMobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_icon", property="userIcon", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_descriptor", property="userDescriptor", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_sex", property="userSex", jdbcType=JdbcType.INTEGER),
        @Result(column="user_birthday", property="userBirthday", jdbcType=JdbcType.INTEGER),
        @Result(column="user_address", property="userAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_specialty", property="userSpecialty", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_present_medical_history", property="userPresentMedicalHistory", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_past_history", property="userPastHistory", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_personal_history", property="userPersonalHistory", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_doctor_level", property="userDoctorLevel", jdbcType=JdbcType.VARCHAR),
        @Result(column="device_token", property="deviceToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="client_type", property="clientType", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.INTEGER),
        @Result(column="user_examine", property="userExamine", jdbcType=JdbcType.INTEGER),
        @Result(column="user_work_card", property="userWorkCard", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_examine_content", property="userExamineContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="ry_token", property="ryToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_introduce", property="userIntroduce", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<User> selectByExampleWithBLOBs(UserExample example);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="hospital_id", property="hospitalId", jdbcType=JdbcType.VARCHAR),
        @Result(column="department_id", property="departmentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_mobile", property="userMobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_icon", property="userIcon", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_descriptor", property="userDescriptor", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_sex", property="userSex", jdbcType=JdbcType.INTEGER),
        @Result(column="user_birthday", property="userBirthday", jdbcType=JdbcType.INTEGER),
        @Result(column="user_address", property="userAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_specialty", property="userSpecialty", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_present_medical_history", property="userPresentMedicalHistory", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_past_history", property="userPastHistory", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_personal_history", property="userPersonalHistory", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_doctor_level", property="userDoctorLevel", jdbcType=JdbcType.VARCHAR),
        @Result(column="device_token", property="deviceToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="client_type", property="clientType", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.INTEGER),
        @Result(column="user_examine", property="userExamine", jdbcType=JdbcType.INTEGER),
        @Result(column="user_work_card", property="userWorkCard", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_examine_content", property="userExamineContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="ry_token", property="ryToken", jdbcType=JdbcType.VARCHAR)
    })
    List<User> selectByExample(UserExample example);

    @Select({
        "select",
        "user_id, hospital_id, department_id, user_mobile, user_icon, user_descriptor, ",
        "user_name, user_sex, user_birthday, user_address, user_specialty, user_present_medical_history, ",
        "user_past_history, user_personal_history, user_doctor_level, device_token, client_type, ",
        "status, created_at, updated_at, user_examine, user_work_card, user_examine_content, ",
        "ry_token, user_introduce",
        "from med_user",
        "where user_id = #{userId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="hospital_id", property="hospitalId", jdbcType=JdbcType.VARCHAR),
        @Result(column="department_id", property="departmentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_mobile", property="userMobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_icon", property="userIcon", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_descriptor", property="userDescriptor", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_sex", property="userSex", jdbcType=JdbcType.INTEGER),
        @Result(column="user_birthday", property="userBirthday", jdbcType=JdbcType.INTEGER),
        @Result(column="user_address", property="userAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_specialty", property="userSpecialty", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_present_medical_history", property="userPresentMedicalHistory", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_past_history", property="userPastHistory", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_personal_history", property="userPersonalHistory", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_doctor_level", property="userDoctorLevel", jdbcType=JdbcType.VARCHAR),
        @Result(column="device_token", property="deviceToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="client_type", property="clientType", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.INTEGER),
        @Result(column="user_examine", property="userExamine", jdbcType=JdbcType.INTEGER),
        @Result(column="user_work_card", property="userWorkCard", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_examine_content", property="userExamineContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="ry_token", property="ryToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_introduce", property="userIntroduce", jdbcType=JdbcType.LONGVARCHAR)
    })
    User selectByPrimaryKey(String userId);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update med_user",
        "set hospital_id = #{hospitalId,jdbcType=VARCHAR},",
          "department_id = #{departmentId,jdbcType=VARCHAR},",
          "user_mobile = #{userMobile,jdbcType=VARCHAR},",
          "user_icon = #{userIcon,jdbcType=VARCHAR},",
          "user_descriptor = #{userDescriptor,jdbcType=VARCHAR},",
          "user_name = #{userName,jdbcType=VARCHAR},",
          "user_sex = #{userSex,jdbcType=INTEGER},",
          "user_birthday = #{userBirthday,jdbcType=INTEGER},",
          "user_address = #{userAddress,jdbcType=VARCHAR},",
          "user_specialty = #{userSpecialty,jdbcType=VARCHAR},",
          "user_present_medical_history = #{userPresentMedicalHistory,jdbcType=VARCHAR},",
          "user_past_history = #{userPastHistory,jdbcType=VARCHAR},",
          "user_personal_history = #{userPersonalHistory,jdbcType=VARCHAR},",
          "user_doctor_level = #{userDoctorLevel,jdbcType=VARCHAR},",
          "device_token = #{deviceToken,jdbcType=VARCHAR},",
          "client_type = #{clientType,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=INTEGER},",
          "updated_at = #{updatedAt,jdbcType=INTEGER},",
          "user_examine = #{userExamine,jdbcType=INTEGER},",
          "user_work_card = #{userWorkCard,jdbcType=VARCHAR},",
          "user_examine_content = #{userExamineContent,jdbcType=VARCHAR},",
          "ry_token = #{ryToken,jdbcType=VARCHAR},",
          "user_introduce = #{userIntroduce,jdbcType=LONGVARCHAR}",
        "where user_id = #{userId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(User record);

    @Update({
        "update med_user",
        "set hospital_id = #{hospitalId,jdbcType=VARCHAR},",
          "department_id = #{departmentId,jdbcType=VARCHAR},",
          "user_mobile = #{userMobile,jdbcType=VARCHAR},",
          "user_icon = #{userIcon,jdbcType=VARCHAR},",
          "user_descriptor = #{userDescriptor,jdbcType=VARCHAR},",
          "user_name = #{userName,jdbcType=VARCHAR},",
          "user_sex = #{userSex,jdbcType=INTEGER},",
          "user_birthday = #{userBirthday,jdbcType=INTEGER},",
          "user_address = #{userAddress,jdbcType=VARCHAR},",
          "user_specialty = #{userSpecialty,jdbcType=VARCHAR},",
          "user_present_medical_history = #{userPresentMedicalHistory,jdbcType=VARCHAR},",
          "user_past_history = #{userPastHistory,jdbcType=VARCHAR},",
          "user_personal_history = #{userPersonalHistory,jdbcType=VARCHAR},",
          "user_doctor_level = #{userDoctorLevel,jdbcType=VARCHAR},",
          "device_token = #{deviceToken,jdbcType=VARCHAR},",
          "client_type = #{clientType,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=INTEGER},",
          "updated_at = #{updatedAt,jdbcType=INTEGER},",
          "user_examine = #{userExamine,jdbcType=INTEGER},",
          "user_work_card = #{userWorkCard,jdbcType=VARCHAR},",
          "user_examine_content = #{userExamineContent,jdbcType=VARCHAR},",
          "ry_token = #{ryToken,jdbcType=VARCHAR}",
        "where user_id = #{userId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(User record);
}