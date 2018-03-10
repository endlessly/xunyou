package com.xunyou.model;

import java.util.Date;

public class GuideInfoEntity {
    private Integer id;

    private Integer uid;

    private String guideNo;

    private Boolean isOnline;

    private String idcardNo;

    private String serverLanguage;

    private Integer serverTimes;

    private String serverIntroduce;

    private String selfIntroduce;

    private String stars;

    private Byte chargingType;

    private String idcardBack;

    private String idcardFront;

    private String lon;

    private String lat;

    private String status;

    private String address;

    private Date createDate;

    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getGuideNo() {
        return guideNo;
    }

    public void setGuideNo(String guideNo) {
        this.guideNo = guideNo == null ? null : guideNo.trim();
    }

    public Boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public String getIdcardNo() {
        return idcardNo;
    }

    public void setIdcardNo(String idcardNo) {
        this.idcardNo = idcardNo == null ? null : idcardNo.trim();
    }

    public String getServerLanguage() {
        return serverLanguage;
    }

    public void setServerLanguage(String serverLanguage) {
        this.serverLanguage = serverLanguage == null ? null : serverLanguage.trim();
    }

    public Integer getServerTimes() {
        return serverTimes;
    }

    public void setServerTimes(Integer serverTimes) {
        this.serverTimes = serverTimes;
    }

    public String getServerIntroduce() {
        return serverIntroduce;
    }

    public void setServerIntroduce(String serverIntroduce) {
        this.serverIntroduce = serverIntroduce == null ? null : serverIntroduce.trim();
    }

    public String getSelfIntroduce() {
        return selfIntroduce;
    }

    public void setSelfIntroduce(String selfIntroduce) {
        this.selfIntroduce = selfIntroduce == null ? null : selfIntroduce.trim();
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars == null ? null : stars.trim();
    }

    public Byte getChargingType() {
        return chargingType;
    }

    public void setChargingType(Byte chargingType) {
        this.chargingType = chargingType;
    }

    public String getIdcardBack() {
        return idcardBack;
    }

    public void setIdcardBack(String idcardBack) {
        this.idcardBack = idcardBack == null ? null : idcardBack.trim();
    }

    public String getIdcardFront() {
        return idcardFront;
    }

    public void setIdcardFront(String idcardFront) {
        this.idcardFront = idcardFront == null ? null : idcardFront.trim();
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon == null ? null : lon.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}