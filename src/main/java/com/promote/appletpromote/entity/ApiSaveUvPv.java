package com.promote.appletpromote.entity;

public class ApiSaveUvPv {

    private String status;

    private String oppenid;

    private String ownAppletId;

    private String clientAppletId;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOppenid() {
        return oppenid;
    }

    public void setOppenid(String oppenid) {
        this.oppenid = oppenid;
    }

    public String getOwnAppletId() {
        return ownAppletId;
    }

    public void setOwnAppletId(String ownAppletId) {
        this.ownAppletId = ownAppletId;
    }

    public String getClientAppletId() {
        return clientAppletId;
    }

    public void setClientAppletId(String clientAppletId) {
        this.clientAppletId = clientAppletId;
    }

    @Override
    public String toString() {
        return "ApiSaveUvPv{" +
                "status='" + status + '\'' +
                ", oppenid='" + oppenid + '\'' +
                ", ownAppletId='" + ownAppletId + '\'' +
                ", clientAppletId='" + clientAppletId + '\'' +
                '}';
    }
}
