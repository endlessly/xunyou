package com.xunyou.model;

import java.util.Date;

public class GuideLikeRecordEntity {
    private Integer id;

    private Integer uid;

    private Integer likeFrom;

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

    public Integer getLikeFrom() {
        return likeFrom;
    }

    public void setLikeFrom(Integer likeFrom) {
        this.likeFrom = likeFrom;
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