package com.promote.appletpromote.entity;

import java.util.Date;

public class ApiclientApplet {
    private Integer id;

    private String linkGhid;

    private String appletName;

    private String bottomName;

    private String appletAppid;

    private String linkAddress;

    private String logoImg;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLinkGhid() {
        return linkGhid;
    }

    public void setLinkGhid(String linkGhid) {
        this.linkGhid = linkGhid;
    }

    public String getAppletName() {
        return appletName;
    }

    public void setAppletName(String appletName) {
        this.appletName = appletName;
    }

    public String getBottomName() {
        return bottomName;
    }

    public void setBottomName(String bottomName) {
        this.bottomName = bottomName;
    }

    public String getAppletAppid() {
        return appletAppid;
    }

    public void setAppletAppid(String appletAppid) {
        this.appletAppid = appletAppid;
    }

    public String getLinkAddress() {
        return linkAddress;
    }

    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress;
    }

    public String getLogoImg() {
        return logoImg;
    }

    public void setLogoImg(String logoImg) {
        this.logoImg = logoImg;
    }
}