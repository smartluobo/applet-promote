package com.promote.appletpromote.entity;

import java.util.Date;

public class TbCarousel {
    private Integer id;

    private Integer clientAppletId;

    private Integer ownAppletId;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private Integer isDel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClientAppletId() {
        return clientAppletId;
    }

    public void setClientAppletId(Integer clientAppletId) {
        this.clientAppletId = clientAppletId;
    }

    public Integer getOwnAppletId() {
        return ownAppletId;
    }

    public void setOwnAppletId(Integer ownAppletId) {
        this.ownAppletId = ownAppletId;
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

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}