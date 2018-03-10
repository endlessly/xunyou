package com.xunyou.model;

import java.util.Date;

public class TouristScoreRecordEntity {
    private Integer id;

    private String touristNo;

    private String touristTitle;

    private String star;

    private Boolean status;

    private Integer fromUid;

    private Boolean isDel;

    private Date createDate;

    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTouristNo() {
        return touristNo;
    }

    public void setTouristNo(String touristNo) {
        this.touristNo = touristNo == null ? null : touristNo.trim();
    }

    public String getTouristTitle() {
        return touristTitle;
    }

    public void setTouristTitle(String touristTitle) {
        this.touristTitle = touristTitle == null ? null : touristTitle.trim();
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star == null ? null : star.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getFromUid() {
        return fromUid;
    }

    public void setFromUid(Integer fromUid) {
        this.fromUid = fromUid;
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