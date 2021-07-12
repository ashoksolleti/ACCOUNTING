package com.unisys.trans.logistics.lms.parts.dto;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class ParticipantSuggestiveSearchResultDto extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = 2167344694150879820L;

    private Long oid;

    private String address;

    private String billingAccount1;

    private String billingAccount1Code;

    private String billingAccount2;

    private String billingAccount2Code;

    private String city;

    private String countryCode;

    private String firstEfectiveDate;

    private String firstExpirationDate;

    private String firstSecurityStatusInd;

    private String iataAccountNumber;

    private String name;

    private String postalCode;

    private String securityStatusInfo1;

    private int sortField;

    private String state;

    private String stationCode;

    private String typeCode;
    
    private String phone;
    
    private String email;
    
    private String fax;

    private int rowNum;

    private String govtId;
    
    private String frequentFlyerNumber;

    public Long getOid() {
        return this.oid;
    }

    public void setOid(Long pOid) {
        this.oid = pOid;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String pAddress) {
        this.address = pAddress;
    }

    public String getBillingAccount1() {
        return this.billingAccount1;
    }

    public void setBillingAccount1(String pBillingAccount1) {
        this.billingAccount1 = pBillingAccount1;
    }

    public String getBillingAccount1Code() {
        return this.billingAccount1Code;
    }

    public void setBillingAccount1Code(String pBillingAccount1Code) {
        this.billingAccount1Code = pBillingAccount1Code;
    }

    public String getBillingAccount2() {
        return this.billingAccount2;
    }

    public void setBillingAccount2(String pBillingAccount2) {
        this.billingAccount2 = pBillingAccount2;
    }

    public String getBillingAccount2Code() {
        return this.billingAccount2Code;
    }

    public void setBillingAccount2Code(String pBillingAccount2Code) {
        this.billingAccount2Code = pBillingAccount2Code;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String pCity) {
        this.city = pCity;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String pCountryCode) {
        this.countryCode = pCountryCode;
    }

    public String getFirstEfectiveDate() {
        return this.firstEfectiveDate;
    }

    public void setFirstEfectiveDate(String pFirstEfectiveDate) {
        this.firstEfectiveDate = pFirstEfectiveDate;
    }

    public String getFirstExpirationDate() {
        return this.firstExpirationDate;
    }

    public void setFirstExpirationDate(String pFirstExpirationDate) {
        this.firstExpirationDate = pFirstExpirationDate;
    }

    public String getFirstSecurityStatusInd() {
        return this.firstSecurityStatusInd;
    }

    public void setFirstSecurityStatusInd(String pFirstSecurityStatusInd) {
        this.firstSecurityStatusInd = pFirstSecurityStatusInd;
    }

    public String getIataAccountNumber() {
        return this.iataAccountNumber;
    }

    public void setIataAccountNumber(String pIataAccountNumber) {
        this.iataAccountNumber = pIataAccountNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String pName) {
        this.name = pName;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String pPostalCode) {
        this.postalCode = pPostalCode;
    }

    public String getSecurityStatusInfo1() {
        return this.securityStatusInfo1;
    }

    public void setSecurityStatusInfo1(String pSecurityStatusInfo1) {
        this.securityStatusInfo1 = pSecurityStatusInfo1;
    }

    public int getSortField() {
        return this.sortField;
    }

    public void setSortField(int pSortField) {
        this.sortField = pSortField;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String pState) {
    	
        this.state = pState;
    }

    public String getStationCode() {
        return this.stationCode;
    }

    public void setStationCode(String pStationCode) {
        this.stationCode = pStationCode;
    }

    public String getTypeCode() {
        return this.typeCode;
    }

    public void setTypeCode(String pTypeCode) {
        this.typeCode = pTypeCode;
    }

    public int getRowNum() {
        return this.rowNum;
    }

    public void setRowNum(int pRowNum) {
        this.rowNum = pRowNum;
    }

    public String getGovtId() {
        return this.govtId;
    }

    public void setGovtId(String pGovtId) {
        this.govtId = pGovtId;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    @JsonIgnore
    public Long getOId() {
        return this.oid;
    }

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String pPhone) {
		this.phone = pPhone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String pEmail) {
		this.email = pEmail;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String pFax) {
		this.fax = pFax;
	}

	public String getFrequentFlyerNumber() {
		return this.frequentFlyerNumber;
	}

	public void setFrequentFlyerNumber(String pFrequentFlyerNumber) {
		this.frequentFlyerNumber = pFrequentFlyerNumber;
	}

}
