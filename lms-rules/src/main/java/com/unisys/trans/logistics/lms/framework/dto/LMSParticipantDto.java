package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.ParticipantCodeType;
import com.unisys.trans.logistics.lms.framework.dto.ContactDto;

public class LMSParticipantDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String accountNo;   
	private String accountID; 
	private String govtNumber;
	private String loyalityInd;		
    private String iataAccount;
    private String participantName;
    private String station;
    private String specAirlineCode;
    private ParticipantCodeType participantType;
    private String participantTypeCode;
    private ContactDto contactDetails;
    private String participantStatusType;
    private String securityStatus;
    private String securityInfo;
    private String expirationDate;
    private String ccsf;
    private String dbkey;
    
    
    private List<LMSParticipantDto> lmsPartcipantDtos;
    
    //FIS142B Changes Starts here
    private boolean deleteIndicator;
    private boolean airwaybillRetainIndex;
    
    public boolean getDeleteIndicator() {
        return this.deleteIndicator;
     }
    
    public void setDeleteIndicator(boolean pDeleteIndicator) {
        this.deleteIndicator = pDeleteIndicator;
    }
    
	public boolean isAirwaybillRetainIndex() {
		return airwaybillRetainIndex;
	}

	public void setAirwaybillRetainIndex(boolean airwaybillRetainIndex) {
		this.airwaybillRetainIndex = airwaybillRetainIndex;
	}
    //FIS142B Changes Starts here

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getIataAccount() {
		return iataAccount;
	}

	public void setIataAccount(String iataAccount) {
		this.iataAccount = iataAccount;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	public ParticipantCodeType getParticipantType() {
		return participantType;
	}

	public void setParticipantType(ParticipantCodeType participantType) {
		this.participantType = participantType;
	}

	public String getParticipantTypeCode() {
		return participantTypeCode;
	}

	public void setParticipantTypeCode(String participantTypeCode) {
		this.participantTypeCode = participantTypeCode;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}
	
	public String getSpecAirlineCode() {
		return specAirlineCode;
	}

	public void setSpecAirlineCode(String specAirlineCode) {
		this.specAirlineCode = specAirlineCode;
	}

	public ContactDto getContactDetails() {
    	if (contactDetails == null) {
    		contactDetails = new ContactDto();
		}
		return contactDetails;
    }

	public void setContactDetails(ContactDto contactDetails) {
		this.contactDetails = contactDetails;
	}

	public List<LMSParticipantDto> getLmsPartcipantDtos() {
		return lmsPartcipantDtos;
	}

	public void setLmsPartcipantDtos(List<LMSParticipantDto> lmsPartcipantDtos) {
		this.lmsPartcipantDtos = lmsPartcipantDtos;
	}

	public String getParticipantStatusType() {
		return participantStatusType;
	}

	public void setParticipantStatusType(String participantStatusType) {
		this.participantStatusType = participantStatusType;
	}

	public String getSecurityStatus() {
		return securityStatus;
	}

	public void setSecurityStatus(String securityStatus) {
		this.securityStatus = securityStatus;
	}

	public String getSecurityInfo() {
		return securityInfo;
	}

	public void setSecurityInfo(String securityInfo) {
		this.securityInfo = securityInfo;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCcsf() {
		return ccsf;
	}

	public void setCcsf(String ccsf) {
		this.ccsf = ccsf;
	}

	@Override
    public String toString() {
        return participantName;
    }

	public String getDbkey() {
		return dbkey;
	}

	public void setDbkey(String dbkey) {
		this.dbkey = dbkey;
	}
	
    public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	
	public String getGovtNumber() {
		return govtNumber;
	}

	public void setGovtNumber(String govtNumber) {
		this.govtNumber = govtNumber;
	}

	public String getLoyalityInd() {
		return loyalityInd;
	}

	public void setLoyalityInd(String loyalityInd) {
		this.loyalityInd = loyalityInd;
	}

}