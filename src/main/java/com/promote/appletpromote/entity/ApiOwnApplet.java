package com.promote.appletpromote.entity;

import java.util.List;

public class ApiOwnApplet {

    private Integer id;

    private String ghid;

    private String name;

    private String appkey;

    private List<TbClientApplet> games;


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
        this.ghid = ghid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public List<TbClientApplet> getGames() {
        return games;
    }

    public void setGames(List<TbClientApplet> games) {
        this.games = games;
    }

    @Override
    public String toString() {
        return "ApiOwnApplet{" +
                "id=" + id +
                ", ghid='" + ghid + '\'' +
                ", name='" + name + '\'' +
                ", appkey='" + appkey + '\'' +
                ", games=" + games +
                '}';
    }
}
