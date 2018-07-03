package com.example.demo.model;

public class User {
    private String userId;

    private String hospitalId;

    private String departmentId;

    private String userMobile;

    private String userIcon;

    private String userDescriptor;

    private String userName;

    private Integer userSex;

    private Integer userBirthday;

    private String userAddress;

    private String userSpecialty;

    private String userPresentMedicalHistory;

    private String userPastHistory;

    private String userPersonalHistory;

    private String userDoctorLevel;

    private String deviceToken;

    private String clientType;

    private Integer status;

    private Integer createdAt;

    private Integer updatedAt;

    private Integer userExamine;

    private String userWorkCard;

    private String userExamineContent;

    private String ryToken;

    private String userIntroduce;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId == null ? null : hospitalId.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon == null ? null : userIcon.trim();
    }

    public String getUserDescriptor() {
        return userDescriptor;
    }

    public void setUserDescriptor(String userDescriptor) {
        this.userDescriptor = userDescriptor == null ? null : userDescriptor.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Integer getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Integer userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserSpecialty() {
        return userSpecialty;
    }

    public void setUserSpecialty(String userSpecialty) {
        this.userSpecialty = userSpecialty == null ? null : userSpecialty.trim();
    }

    public String getUserPresentMedicalHistory() {
        return userPresentMedicalHistory;
    }

    public void setUserPresentMedicalHistory(String userPresentMedicalHistory) {
        this.userPresentMedicalHistory = userPresentMedicalHistory == null ? null : userPresentMedicalHistory.trim();
    }

    public String getUserPastHistory() {
        return userPastHistory;
    }

    public void setUserPastHistory(String userPastHistory) {
        this.userPastHistory = userPastHistory == null ? null : userPastHistory.trim();
    }

    public String getUserPersonalHistory() {
        return userPersonalHistory;
    }

    public void setUserPersonalHistory(String userPersonalHistory) {
        this.userPersonalHistory = userPersonalHistory == null ? null : userPersonalHistory.trim();
    }

    public String getUserDoctorLevel() {
        return userDoctorLevel;
    }

    public void setUserDoctorLevel(String userDoctorLevel) {
        this.userDoctorLevel = userDoctorLevel == null ? null : userDoctorLevel.trim();
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken == null ? null : deviceToken.trim();
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType == null ? null : clientType.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getUserExamine() {
        return userExamine;
    }

    public void setUserExamine(Integer userExamine) {
        this.userExamine = userExamine;
    }

    public String getUserWorkCard() {
        return userWorkCard;
    }

    public void setUserWorkCard(String userWorkCard) {
        this.userWorkCard = userWorkCard == null ? null : userWorkCard.trim();
    }

    public String getUserExamineContent() {
        return userExamineContent;
    }

    public void setUserExamineContent(String userExamineContent) {
        this.userExamineContent = userExamineContent == null ? null : userExamineContent.trim();
    }

    public String getRyToken() {
        return ryToken;
    }

    public void setRyToken(String ryToken) {
        this.ryToken = ryToken == null ? null : ryToken.trim();
    }

    public String getUserIntroduce() {
        return userIntroduce;
    }

    public void setUserIntroduce(String userIntroduce) {
        this.userIntroduce = userIntroduce == null ? null : userIntroduce.trim();
    }
}