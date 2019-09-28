package com.promote.appletpromote.entity;

public class ApiBannerImg {

    private Integer id;

    private String bannerImg;

    private String appletAppid;

    private String boxAppid;

    private String linkAddress;

    public String getLinkAddress() {
        return linkAddress;
    }

    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress;
    }

    public String getBoxAppid() {
        return boxAppid;
    }

    public void setBoxAppid(String boxAppid) {
        this.boxAppid = boxAppid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBannerImg() {
        return bannerImg;
    }

    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg;
    }

    public String getAppletAppid() {
        return appletAppid;
    }

    public void setAppletAppid(String appletAppid) {
        this.appletAppid = appletAppid;
    }

    @Override
    public String toString() {
        return "ApiBannerImg{" +
                "id=" + id +
                ", bannerImg='" + bannerImg + '\'' +
                ", appletAppid='" + appletAppid + '\'' +
                ", boxAppid='" + boxAppid + '\'' +
                ", linkAddress='" + linkAddress + '\'' +
                '}';
    }
}
