package com.promote.appletpromote.entity;

import java.util.Date;

public class TbTypes {
    private Integer id;

    private String title;

    private String logoUrl;

    private Integer serialNumber;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private Integer onlineShow;

    public Integer getOnlineShow() {
        return onlineShow;
    }

    public void setOnlineShow(Integer onlineShow) {
        this.onlineShow = onlineShow;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }


    @Override
    public String toString() {
        return "TbTypes{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", serialNumber=" + serialNumber +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", createUser='" + createUser + '\'' +
                ", updateUser='" + updateUser + '\'' +
                ", onlineShow='" + onlineShow + '\'' +
                '}';
    }
}