package com.promote.appletpromote.entity;

import java.util.Date;

public class TbClientApplet {
    private Integer id;

    private String linkGhid;

    private String appletName;

    private String description;

    private String bottomName;

    private String appletAppid;

    private String linkAddress;

    private Byte isDisplay;

    private String logoImg;

    private String bannerImg;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private Integer isDel;

    private Integer price;

    private Integer serialNumber;

    private Integer pointNumber;


    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getPointNumber() {
        return pointNumber;
    }

    public void setPointNumber(Integer pointNumber) {
        this.pointNumber = pointNumber;
    }

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
        this.linkGhid = linkGhid == null ? null : linkGhid.trim();
    }

    public String getAppletName() {
        return appletName;
    }

    public void setAppletName(String appletName) {
        this.appletName = appletName == null ? null : appletName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getBottomName() {
        return bottomName;
    }

    public void setBottomName(String bottomName) {
        this.bottomName = bottomName == null ? null : bottomName.trim();
    }

    public String getAppletAppid() {
        return appletAppid;
    }

    public void setAppletAppid(String appletAppid) {
        this.appletAppid = appletAppid == null ? null : appletAppid.trim();
    }

    public String getLinkAddress() {
        return linkAddress;
    }

    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress == null ? null : linkAddress.trim();
    }

    public Byte getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Byte isDisplay) {
        this.isDisplay = isDisplay;
    }

    public String getLogoImg() {
        return logoImg;
    }

    public void setLogoImg(String logoImg) {
        this.logoImg = logoImg == null ? null : logoImg.trim();
    }

    public String getBannerImg() {
        return bannerImg;
    }

    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg == null ? null : bannerImg.trim();
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "TbClientApplet{" +
                "id=" + id +
                ", linkGhid='" + linkGhid + '\'' +
                ", appletName='" + appletName + '\'' +
                ", description='" + description + '\'' +
                ", bottomName='" + bottomName + '\'' +
                ", appletAppid='" + appletAppid + '\'' +
                ", linkAddress='" + linkAddress + '\'' +
                ", isDisplay=" + isDisplay +
                ", logoImg='" + logoImg + '\'' +
                ", bannerImg='" + bannerImg + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", createUser='" + createUser + '\'' +
                ", updateUser='" + updateUser + '\'' +
                ", isDel=" + isDel +
                ", price=" + price +
                ", serialNumber=" + serialNumber +
                ", pointNumber=" + pointNumber +
                '}';
    }
}