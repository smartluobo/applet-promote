package com.promote.appletpromote.entity;

public class ApiGames {

    private Integer id;

    private String serialNumber;

    private String appletName;

    private String linkGhid;

    private String logoImg;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getAppletName() {
        return appletName;
    }

    public void setAppletName(String appletName) {
        this.appletName = appletName;
    }

    public String getLinkGhid() {
        return linkGhid;
    }

    public void setLinkGhid(String linkGhid) {
        this.linkGhid = linkGhid;
    }

    public String getLogoImg() {
        return logoImg;
    }

    public void setLogoImg(String logoImg) {
        this.logoImg = logoImg;
    }


    @Override
    public String toString() {
        return "ApiGames{" +
                "id=" + id +
                ", serialNumber='" + serialNumber + '\'' +
                ", appletName='" + appletName + '\'' +
                ", linkGhid='" + linkGhid + '\'' +
                ", logoImg='" + logoImg + '\'' +
                '}';
    }
}
