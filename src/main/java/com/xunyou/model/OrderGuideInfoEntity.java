package com.xunyou.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderGuideInfoEntity {
    private Integer id;

    private String orderGuideNo;

    private String startAddr;

    private String endAddr;

    private String startLat;

    private String endLon;

    private String guideCode;

    private String guideName;

    private String guidePhone;

    private String guideIdcard;

    private String cancelMsg;

    private String cancelMemo;

    private String touristName;

    private String touristPhone;

    private String touristIdcard;

    private Date serverStartTime;

    private Date realStartServerTime;

    private Date realEndServerTime;

    private BigDecimal serverPrice;

    private Byte chargingType;

    private Date createDate;

    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderGuideNo() {
        return orderGuideNo;
    }

    public void setOrderGuideNo(String orderGuideNo) {
        this.orderGuideNo = orderGuideNo == null ? null : orderGuideNo.trim();
    }

    public String getStartAddr() {
        return startAddr;
    }

    public void setStartAddr(String startAddr) {
        this.startAddr = startAddr == null ? null : startAddr.trim();
    }

    public String getEndAddr() {
        return endAddr;
    }

    public void setEndAddr(String endAddr) {
        this.endAddr = endAddr == null ? null : endAddr.trim();
    }

    public String getStartLat() {
        return startLat;
    }

    public void setStartLat(String startLat) {
        this.startLat = startLat == null ? null : startLat.trim();
    }

    public String getEndLon() {
        return endLon;
    }

    public void setEndLon(String endLon) {
        this.endLon = endLon == null ? null : endLon.trim();
    }

    public String getGuideCode() {
        return guideCode;
    }

    public void setGuideCode(String guideCode) {
        this.guideCode = guideCode == null ? null : guideCode.trim();
    }

    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName == null ? null : guideName.trim();
    }

    public String getGuidePhone() {
        return guidePhone;
    }

    public void setGuidePhone(String guidePhone) {
        this.guidePhone = guidePhone == null ? null : guidePhone.trim();
    }

    public String getGuideIdcard() {
        return guideIdcard;
    }

    public void setGuideIdcard(String guideIdcard) {
        this.guideIdcard = guideIdcard == null ? null : guideIdcard.trim();
    }

    public String getCancelMsg() {
        return cancelMsg;
    }

    public void setCancelMsg(String cancelMsg) {
        this.cancelMsg = cancelMsg == null ? null : cancelMsg.trim();
    }

    public String getCancelMemo() {
        return cancelMemo;
    }

    public void setCancelMemo(String cancelMemo) {
        this.cancelMemo = cancelMemo == null ? null : cancelMemo.trim();
    }

    public String getTouristName() {
        return touristName;
    }

    public void setTouristName(String touristName) {
        this.touristName = touristName == null ? null : touristName.trim();
    }

    public String getTouristPhone() {
        return touristPhone;
    }

    public void setTouristPhone(String touristPhone) {
        this.touristPhone = touristPhone == null ? null : touristPhone.trim();
    }

    public String getTouristIdcard() {
        return touristIdcard;
    }

    public void setTouristIdcard(String touristIdcard) {
        this.touristIdcard = touristIdcard == null ? null : touristIdcard.trim();
    }

    public Date getServerStartTime() {
        return serverStartTime;
    }

    public void setServerStartTime(Date serverStartTime) {
        this.serverStartTime = serverStartTime;
    }

    public Date getRealStartServerTime() {
        return realStartServerTime;
    }

    public void setRealStartServerTime(Date realStartServerTime) {
        this.realStartServerTime = realStartServerTime;
    }

    public Date getRealEndServerTime() {
        return realEndServerTime;
    }

    public void setRealEndServerTime(Date realEndServerTime) {
        this.realEndServerTime = realEndServerTime;
    }

    public BigDecimal getServerPrice() {
        return serverPrice;
    }

    public void setServerPrice(BigDecimal serverPrice) {
        this.serverPrice = serverPrice;
    }

    public Byte getChargingType() {
        return chargingType;
    }

    public void setChargingType(Byte chargingType) {
        this.chargingType = chargingType;
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