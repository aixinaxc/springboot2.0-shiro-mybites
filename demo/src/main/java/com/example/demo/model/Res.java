package com.example.demo.model;

public class Res {
    private String resId;

    private String resPid;

    private String resName;

    private String resUrl;

    private String resIcon;

    private Integer resSeq;

    private Integer resType;

    private Integer starus;

    private String resModule;

    private String resMenu;

    private Integer createdAt;

    private Integer updatedAt;

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId == null ? null : resId.trim();
    }

    public String getResPid() {
        return resPid;
    }

    public void setResPid(String resPid) {
        this.resPid = resPid == null ? null : resPid.trim();
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName == null ? null : resName.trim();
    }

    public String getResUrl() {
        return resUrl;
    }

    public void setResUrl(String resUrl) {
        this.resUrl = resUrl == null ? null : resUrl.trim();
    }

    public String getResIcon() {
        return resIcon;
    }

    public void setResIcon(String resIcon) {
        this.resIcon = resIcon == null ? null : resIcon.trim();
    }

    public Integer getResSeq() {
        return resSeq;
    }

    public void setResSeq(Integer resSeq) {
        this.resSeq = resSeq;
    }

    public Integer getResType() {
        return resType;
    }

    public void setResType(Integer resType) {
        this.resType = resType;
    }

    public Integer getStarus() {
        return starus;
    }

    public void setStarus(Integer starus) {
        this.starus = starus;
    }

    public String getResModule() {
        return resModule;
    }

    public void setResModule(String resModule) {
        this.resModule = resModule == null ? null : resModule.trim();
    }

    public String getResMenu() {
        return resMenu;
    }

    public void setResMenu(String resMenu) {
        this.resMenu = resMenu == null ? null : resMenu.trim();
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
}