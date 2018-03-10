package com.xunyou.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderGuideEntity {
    private Integer id;

    private String orderGuideNo;

    private Integer uid;

    private Date serverStar;

    private Date serverEnd;

    private String guideNo;

    private BigDecimal price;

    private Date orderTime;

    private Date cancelTime;

    private Date payTime;

    private Byte payType;

    private Byte serverStatus;

    private Byte payStatus;

    private Boolean status;

    private Boolean isDel;

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

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getServerStar() {
        return serverStar;
    }

    public void setServerStar(Date serverStar) {
        this.serverStar = serverStar;
    }

    public Date getServerEnd() {
        return serverEnd;
    }

    public void setServerEnd(Date serverEnd) {
        this.serverEnd = serverEnd;
    }

    public String getGuideNo() {
        return guideNo;
    }

    public void setGuideNo(String guideNo) {
        this.guideNo = guideNo == null ? null : guideNo.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    public Byte getServerStatus() {
        return serverStatus;
    }

    public void setServerStatus(Byte serverStatus) {
        this.serverStatus = serverStatus;
    }

    public Byte getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
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