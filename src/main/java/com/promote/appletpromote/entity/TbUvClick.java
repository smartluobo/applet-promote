package com.promote.appletpromote.entity;

import java.util.Date;

public class TbUvClick {
    private Integer id;

    private String openid;

    private String ghid;

    private Date createTime;

    private Date updateTime;

    private String ownAppletId;

    private String appid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getGhid() {
        return ghid;
    }

    public void setGhid(String ghid) {
        this.ghid = ghid == null ? null : ghid.trim();
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

    public String getOwnAppletId() {
        return ownAppletId;
    }

    public void setOwnAppletId(String ownAppletId) {
        this.ownAppletId = ownAppletId == null ? null : ownAppletId.trim();
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }
}