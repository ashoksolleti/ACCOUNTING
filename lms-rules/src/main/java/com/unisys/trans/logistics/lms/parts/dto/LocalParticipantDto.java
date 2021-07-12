package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;

public class LocalParticipantDto extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String action;

    private String name;

    private String station;

    private String address;

    private String city;

    private String postalCode;

    private String country;

    private String state;

    private String phone;

    private String lmsdatabaseKey;

    private String languageId;

    private UserAuditDto userAuditDto;

    private Long oId;

    private boolean deleteIndicator;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLmsdatabaseKey() {
        return lmsdatabaseKey;
    }

    public void setLmsdatabaseKey(String lmsdatabaseKey) {
        this.lmsdatabaseKey = lmsdatabaseKey;
    }

    public String getLanguageId() {
        return languageId;
    }

    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }

    public UserAuditDto getUserAuditDto() {
        return userAuditDto;
    }

    public void setUserAuditDto(UserAuditDto userAuditDto) {
        this.userAuditDto = userAuditDto;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return this.oId;
    }

    public void setOId(Long pOId) {
        this.oId = pOId;
    }

    public boolean isDeleteIndicator() {
        return deleteIndicator;
    }

    public void setDeleteIndicator(boolean deleteIndicator) {
        this.deleteIndicator = deleteIndicator;
    }

}
