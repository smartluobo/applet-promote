package com.promote.appletpromote.entity;

import java.util.Date;

public class TbPvClick {
    private Integer id;

    private String clientAppletId;

    private Integer clickCount;

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

    public String getClientAppletId() {
        return clientAppletId;
    }

    public void setClientAppletId(String clientAppletId) {
        this.clientAppletId = clientAppletId == null ? null : clientAppletId.trim();
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
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