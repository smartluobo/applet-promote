package com.promote.appletpromote.entity;

import java.util.Date;

public class TbOwnApplet {
    private Integer id;

    private String ghid;

    private String nickName;

    private String name;

    private Integer status;

    private Integer isBox;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private Integer isDel;

    private String appkey;


    private Integer pointNumber;


    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGhid() {
        return ghid;
    }

    public void setGhid(String ghid) {
        this.ghid = ghid == null ? null : ghid.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsBox() {
        return isBox;
    }

    public void setIsBox(Integer isBox) {
        this.isBox = isBox;
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
        return "TbOwnApplet{" +
                "id=" + id +
                ", ghid='" + ghid + '\'' +
                ", nickName='" + nickName + '\'' +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", isBox=" + isBox +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", createUser='" + createUser + '\'' +
                ", updateUser='" + updateUser + '\'' +
                ", isDel=" + isDel +
                ", appkey='" + appkey + '\'' +
                '}';
    }
}