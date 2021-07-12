package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * @author KurmalNG
 *
 */
public class GSAAgreementFindDto extends PersistenceObjectDto {
	private static final long serialVersionUID = 1L;

	private Long oId;

	/**
	 * 
	 */

	private String gsaAgreementName;

	private String participantName;

	private String participantAccountNumber;

	private String awbOrigin;

	private String awbDestination;

	private String awbOwnerCarrierCode;

	private String currency;

	private String gsaCommissionType;

	private Date effectiveDate;

	private Date expirationDate;

	private Date lastUpdatedDate;

	private String lastUpdatedUser;
	
    private String applicableCharge;
	    
    private Double percentage;
	    
	private Double amount;
	
	private Float ratePerAwb;
	
	private String gsaAgreementIdentifier;
	
	private String station;
	
	private String prticipantName;

	private List<GSAAgreementRatesDto> gsaAgreementRates = new ArrayList<GSAAgreementRatesDto>();

	private String awbProductCode;

	private List<String> awbCommodityNumber;

	private List<String> awbSpecialHandlingCode;

	private List<GSAAgreementRoutingDto> awbRouting = new ArrayList<GSAAgreementRoutingDto>();

	private boolean create = false;

	private boolean delete = false;

	private boolean update = false;
	
	private int versionIdentifier=0;
	
	private boolean inter = false;
	
	private String specificAirline;
	
	public String getSpecificAirline() {
		return specificAirline;
	}

	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}

	/**
	 * @return the oId
	 */
	@Override
	public Long getOId() {
		return this.oId;
	}

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return this.oId;
	}
	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}
	/**
	 * @return the gsaAgreementName
	 */
	public String getGsaAgreementName() {
		return gsaAgreementName;
	}

	/**
	 * @param gsaAgreementName the gsaAgreementName to set
	 */
	public void setGsaAgreementName(String gsaAgreementName) {
		this.gsaAgreementName = gsaAgreementName;
	}

	/**
	 * @return the participantName
	 */
	public String getParticipantName() {
		return participantName;
	}

	/**
	 * @param participantName the participantName to set
	 */
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	/**
	 * @return the participantAccountNumber
	 */
	public String getParticipantAccountNumber() {
		return participantAccountNumber;
	}

	/**
	 * @param participantAccountNumber the participantAccountNumber to set
	 */
	public void setParticipantAccountNumber(String participantAccountNumber) {
		this.participantAccountNumber = participantAccountNumber;
	}

	/**
	 * @return the awbOrigin
	 */
	public String getAwbOrigin() {
		if(awbOrigin!=null&&!awbOrigin.isEmpty()){
			awbOrigin = awbOrigin.toUpperCase();
		}
		return awbOrigin;
	}

	/**
	 * @param awbOrigin the awbOrigin to set
	 */
	public void setAwbOrigin(String awbOrigin) {
		this.awbOrigin = awbOrigin;
	}

	/**
	 * @return the awbDestination
	 */
	public String getAwbDestination() {
		if(awbDestination!=null&&!awbDestination.isEmpty()){
			awbDestination = awbDestination.toUpperCase();
		}
		return awbDestination;
	}

	/**
	 * @param awbDestination the awbDestination to set
	 */
	public void setAwbDestination(String awbDestination) {
		this.awbDestination = awbDestination;
	}

	/**
	 * @return the awbOwnerCarrierCode
	 */
	public String getAwbOwnerCarrierCode() {
		return awbOwnerCarrierCode;
	}

	/**
	 * @param awbOwnerCarrierCode the awbOwnerCarrierCode to set
	 */
	public void setAwbOwnerCarrierCode(String awbOwnerCarrierCode) {
		this.awbOwnerCarrierCode = awbOwnerCarrierCode;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		if(currency!=null&&!currency.isEmpty()){
			currency = currency.toUpperCase();
		}
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the gsaCommissionType
	 */
	public String getGsaCommissionType() {
		return gsaCommissionType;
	}

	/**
	 * @param gsaCommissionType the gsaCommissionType to set
	 */
	public void setGsaCommissionType(String gsaCommissionType) {
		this.gsaCommissionType = gsaCommissionType;
	}

	/**
	 * @return the effectiveDate
	 */
	public Date getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * @param effectiveDate the effectiveDate to set
	 */
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	/**
	 * @return the expirationDate
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(Date expirationDate) {
		if(expirationDate!=null){
			Calendar cal = Calendar.getInstance();
			cal.setTime(expirationDate);
			if(cal.get(cal.YEAR)==1999){
				cal.set(2033, cal.get(cal.MONTH), cal.get(cal.DATE), cal.get(cal.HOUR_OF_DAY),cal.get(cal.MINUTE),cal.get(cal.SECOND));
				expirationDate = cal.getTime();
			}
		}
		this.expirationDate = expirationDate;
	}

	/**
	 * @return the lastUpdatedDate
	 */
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	/**
	 * @param lastUpdatedDate the lastUpdatedDate to set
	 */
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	/**
	 * @return the lastUpdatedUser
	 */
	public String getLastUpdatedUser() {
		return lastUpdatedUser;
	}

	/**
	 * @param lastUpdatedUser the lastUpdatedUser to set
	 */
	public void setLastUpdatedUser(String lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}

	/**
	 * @return the gsaAgreementRates
	 */
	public List<GSAAgreementRatesDto> getGsaAgreementRates() {
		return gsaAgreementRates;
	}

	/**
	 * @param gsaAgreementRates the gsaAgreementRates to set
	 */
	public void setGsaAgreementRates(List<GSAAgreementRatesDto> gsaAgreementRates) {
		this.gsaAgreementRates = gsaAgreementRates;
	}

	/**
	 * @return the create
	 */
	public boolean isCreate() {
		return create;
	}

	/**
	 * @param create the create to set
	 */
	public void setCreate(boolean create) {
		this.create = create;
	}

	/**
	 * @return the delete
	 */
	public boolean isDelete() {
		return delete;
	}

	/**
	 * @param delete the delete to set
	 */
	public void setDelete(boolean delete) {
		this.delete = delete;
	}

	/**
	 * @return the update
	 */
	public boolean isUpdate() {
		return update;
	}

	/**
	 * @param update the update to set
	 */
	public void setUpdate(boolean update) {
		this.update = update;
	}

	/**
	 * @return the applicableCharge
	 */
	public String getApplicableCharge() {
		return applicableCharge;
	}

	/**
	 * @param applicableCharge the applicableCharge to set
	 */
	public void setApplicableCharge(String applicableCharge) {
		this.applicableCharge = applicableCharge;
	}

	/**
	 * @return the percentage
	 */
	public Double getPercentage() {
		return percentage;
	}

	/**
	 * @param percentage the percentage to set
	 */
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	
	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}


	/**
	 * @return the ratePerAwb
	 */
	public Float getRatePerAwb() {
		return ratePerAwb;
	}

	/**
	 * @param ratePerAwb the ratePerAwb to set
	 */
	public void setRatePerAwb(Float ratePerAwb) {
		this.ratePerAwb = ratePerAwb;
	}

	/**
	 * @return the gsaAgreementIdentifier
	 */
	public String getGsaAgreementIdentifier() {
		return gsaAgreementIdentifier;
	}

	/**
	 * @param gsaAgreementIdentifier the gsaAgreementIdentifier to set
	 */
	public void setGsaAgreementIdentifier(String gsaAgreementIdentifier) {
		this.gsaAgreementIdentifier = gsaAgreementIdentifier;
	}

	/**
	 * @return the station
	 */
	public String getStation() {
		if(station!=null&&!station.isEmpty()){
			station = station.toUpperCase();
		}
		return station;
	}

	/**
	 * @param station the station to set
	 */
	public void setStation(String station) {
		this.station = station;
	}

	/**
	 * @return the prticipantName
	 */
	public String getPrticipantName() {
		return prticipantName;
	}

	/**
	 * @param prticipantName the prticipantName to set
	 */
	public void setPrticipantName(String prticipantName) {
		this.prticipantName = prticipantName;
	}

	/**
	 * @return the versionIdentifier
	 */
	public int getVersionIdentifier() {
		return versionIdentifier;
	}

	/**
	 * @param versionIdentifier the versionIdentifier to set
	 */
	public void setVersionIdentifier(int versionIdentifier) {
		this.versionIdentifier = versionIdentifier;
	}

	/**
	 * @return the inter
	 */
	public boolean isInter() {
		return inter;
	}

	/**
	 * @param inter the inter to set
	 */
	public void setInter(boolean inter) {
		this.inter = inter;
	}

	public String getAwbProductCode() {
		return awbProductCode;
	}

	public void setAwbProductCode(String awbProductCode) {
		this.awbProductCode = awbProductCode;
	}

	public List<String> getAwbCommodityNumber() {
		return awbCommodityNumber;
	}

	public void setAwbCommodityNumber(List<String> awbCommodityNumber) {
		this.awbCommodityNumber = awbCommodityNumber;
	}

	public List<String> getAwbSpecialHandlingCode() {
		return awbSpecialHandlingCode;
	}

	public void setAwbSpecialHandlingCode(List<String> awbSpecialHandlingCode) {
		this.awbSpecialHandlingCode = awbSpecialHandlingCode;
	}

	public List<GSAAgreementRoutingDto> getAwbRouting() {
		return awbRouting;
	}

	public void setAwbRouting(List<GSAAgreementRoutingDto> awbRouting) {
		this.awbRouting = awbRouting;
	}
}
