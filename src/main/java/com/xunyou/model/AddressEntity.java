package com.xunyou.model;

import java.util.Date;

public class AddressEntity {
    private Long id;

    private String address;

    private String area;

    private Long areaId;

    private Date createdDate;

    private Integer createdUid;

    private Double latitude;

    private Double longitude;

    private String gpsAddress;

    private String gpsAuto;

    private Boolean isPrimary;

    private Date lastModifiedDate;

    private Integer lastModifiedUid;

    private String notes;

    private Integer status;

    private String type;

    private Long typeId;

    private String zipCode;

    private byte[] location;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getCreatedUid() {
        return createdUid;
    }

    public void setCreatedUid(Integer createdUid) {
        this.createdUid = createdUid;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getGpsAddress() {
        return gpsAddress;
    }

    public void setGpsAddress(String gpsAddress) {
        this.gpsAddress = gpsAddress == null ? null : gpsAddress.trim();
    }

    public String getGpsAuto() {
        return gpsAuto;
    }

    public void setGpsAuto(String gpsAuto) {
        this.gpsAuto = gpsAuto == null ? null : gpsAuto.trim();
    }

    public Boolean getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Integer getLastModifiedUid() {
        return lastModifiedUid;
    }

    public void setLastModifiedUid(Integer lastModifiedUid) {
        this.lastModifiedUid = lastModifiedUid;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public byte[] getLocation() {
        return location;
    }

    public void setLocation(byte[] location) {
        this.location = location;
    }
}