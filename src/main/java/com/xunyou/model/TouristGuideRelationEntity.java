package com.xunyou.model;

import java.util.Date;

public class TouristGuideRelationEntity {
    private Integer id;

    private String touristNo;

    private String guideNo;

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

    public String getTouristNo() {
        return touristNo;
    }

    public void setTouristNo(String touristNo) {
        this.touristNo = touristNo == null ? null : touristNo.trim();
    }

    public String getGuideNo() {
        return guideNo;
    }

    public void setGuideNo(String guideNo) {
        this.guideNo = guideNo == null ? null : guideNo.trim();
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