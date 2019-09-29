package com.promote.appletpromote.entity;

import java.util.List;

public class ApiTypes {

    private Integer id;

    private String title;

    private String logoUrl;

    private String serialNumber;

    private Integer onlineShow;


    public Integer getOnlineShow() {
        return onlineShow;
    }

    public void setOnlineShow(Integer onlineShow) {
        this.onlineShow = onlineShow;
    }

    private List<ApiGames> ApiGameList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public List<ApiGames> getApiGameList() {
        return ApiGameList;
    }

    public void setApiGameList(List<ApiGames> apiGameList) {
        ApiGameList = apiGameList;
    }

    @Override
    public String toString() {
        return "ApiTypes{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", onlineShow=" + onlineShow +
                ", ApiGameList=" + ApiGameList +
                '}';
    }
}
