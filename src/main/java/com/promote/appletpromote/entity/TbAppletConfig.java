package com.promote.appletpromote.entity;

public class TbAppletConfig {
    private Integer id;

    private String appid;

    private String mchId;

    private String secret;

    private String signType;

    private String tradeType;

    private String apiKey;

    private String clientIp;

    private String notifyUrl;

    private String loginUrl;

    private String createOrderUrl;

    private String tokenUrl;

    private String orderPayTemplateId;

    private String orderMakecompleteTemplateId;

    private String orderCloseTemplateId;

    private String sendTemplateMessageUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId == null ? null : mchId.trim();
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret == null ? null : secret.trim();
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType == null ? null : signType.trim();
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey == null ? null : apiKey.trim();
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp == null ? null : clientIp.trim();
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl == null ? null : loginUrl.trim();
    }

    public String getCreateOrderUrl() {
        return createOrderUrl;
    }

    public void setCreateOrderUrl(String createOrderUrl) {
        this.createOrderUrl = createOrderUrl == null ? null : createOrderUrl.trim();
    }

    public String getTokenUrl() {
        return tokenUrl;
    }

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl == null ? null : tokenUrl.trim();
    }

    public String getOrderPayTemplateId() {
        return orderPayTemplateId;
    }

    public void setOrderPayTemplateId(String orderPayTemplateId) {
        this.orderPayTemplateId = orderPayTemplateId == null ? null : orderPayTemplateId.trim();
    }

    public String getOrderMakecompleteTemplateId() {
        return orderMakecompleteTemplateId;
    }

    public void setOrderMakecompleteTemplateId(String orderMakecompleteTemplateId) {
        this.orderMakecompleteTemplateId = orderMakecompleteTemplateId == null ? null : orderMakecompleteTemplateId.trim();
    }

    public String getOrderCloseTemplateId() {
        return orderCloseTemplateId;
    }

    public void setOrderCloseTemplateId(String orderCloseTemplateId) {
        this.orderCloseTemplateId = orderCloseTemplateId == null ? null : orderCloseTemplateId.trim();
    }

    public String getSendTemplateMessageUrl() {
        return sendTemplateMessageUrl;
    }

    public void setSendTemplateMessageUrl(String sendTemplateMessageUrl) {
        this.sendTemplateMessageUrl = sendTemplateMessageUrl == null ? null : sendTemplateMessageUrl.trim();
    }
}