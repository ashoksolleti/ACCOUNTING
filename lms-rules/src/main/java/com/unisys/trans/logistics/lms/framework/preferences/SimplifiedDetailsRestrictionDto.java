package com.unisys.trans.logistics.lms.framework.preferences;

import java.math.BigDecimal;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.dto.ValidityTimeDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class SimplifiedDetailsRestrictionDto extends PersistenceObjectDto {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Attribute to hold <code>oId</code> property.
	 * <p>
	 * Unique key identify the <code>RestrictionDto</code>.It is of type Long.
	 */
	private Long oId;

	/**
	 * Attribute to hold <code>stationCode</code> property.
	 * <p>
	 * Station for which the restriction information is to be displayed.
	 * 
	 */
	private static final String EMPTY_STRING = "";
	private static final String INDEF = "INDEF";

	private String stations;
	private String country;
	private String toStations;
	private String toCountries;
	private String fromStations;
	private String fromCountries;
	private String carriers;
	private String flights;
	private String aircraftType;
	private String aircraftRegNum;
	private String productCodes;
	private String splCodes;
	private String alertCodes;
	private String commodityCodes;
	private String sunday;
	private String exceptstations;
	private String exceptcountry;
	private String excepttoStations;
	private String excepttoCountries;
	private String exceptfromStations;
	private String exceptfromCountries;
	private String exceptcarriers;
	private String exceptflights;
	private String exceptaircraftType;
	private String exceptaircraftRegNum;
	private String exceptproductCodes;
	private String exceptsplCodes;
	private String exceptAlertCodes;
	private String exceptcommodityCodes;
	private String world;

	public String getExceptstations() {
		return exceptstations;
	}

	public void setExceptstations(String exceptstations) {
		this.exceptstations = exceptstations;
	}

	public String getExceptcountry() {
		return exceptcountry;
	}

	public void setExceptcountry(String exceptcountry) {
		this.exceptcountry = exceptcountry;
	}

	public String getExcepttoStations() {
		return excepttoStations;
	}

	public void setExcepttoStations(String excepttoStations) {
		this.excepttoStations = excepttoStations;
	}

	public String getExcepttoCountries() {
		return excepttoCountries;
	}

	public void setExcepttoCountries(String excepttoCountries) {
		this.excepttoCountries = excepttoCountries;
	}

	public String getExceptfromStations() {
		return exceptfromStations;
	}

	public void setExceptfromStations(String exceptfromStations) {
		this.exceptfromStations = exceptfromStations;
	}

	public String getExceptfromCountries() {
		return exceptfromCountries;
	}

	public void setExceptfromCountries(String exceptfromCountries) {
		this.exceptfromCountries = exceptfromCountries;
	}

	public String getExceptcarriers() {
		return exceptcarriers;
	}

	public void setExceptcarriers(String exceptcarriers) {
		this.exceptcarriers = exceptcarriers;
	}

	public String getExceptflights() {
		return exceptflights;
	}

	public void setExceptflights(String exceptflights) {
		this.exceptflights = exceptflights;
	}

	public String getExceptaircraftType() {
		return exceptaircraftType;
	}

	public void setExceptaircraftType(String exceptaircraftType) {
		this.exceptaircraftType = exceptaircraftType;
	}

	public String getExceptaircraftRegNum() {
		return exceptaircraftRegNum;
	}

	public void setExceptaircraftRegNum(String exceptaircraftRegNum) {
		this.exceptaircraftRegNum = exceptaircraftRegNum;
	}

	public String getExceptproductCodes() {
		return exceptproductCodes;
	}

	public void setExceptproductCodes(String exceptproductCodes) {
		this.exceptproductCodes = exceptproductCodes;
	}

	public String getExceptsplCodes() {
		return exceptsplCodes;
	}

	public void setExceptsplCodes(String exceptsplCodes) {
		this.exceptsplCodes = exceptsplCodes;
	}

	public String getExceptAlertCodes() { return exceptAlertCodes; }

	public void setExceptAlertCodes(String exceptAlertCodes) { this.exceptAlertCodes = exceptAlertCodes; }

	public String getExceptcommodityCodes() {
		return exceptcommodityCodes;
	}

	public void setExceptcommodityCodes(String exceptcommodityCodes) {
		this.exceptcommodityCodes = exceptcommodityCodes;
	}

	public String getSunday() {
		return sunday;
	}

	public void setSunday(String sunday) {
		this.sunday = sunday;
	}

	public String getMonday() {
		return monday;
	}

	public void setMonday(String monday) {
		this.monday = monday;
	}

	public String getTuesday() {
		return tuesday;
	}

	public void setTuesday(String tuesday) {
		this.tuesday = tuesday;
	}

	public String getWednessday() {
		return wednessday;
	}

	public void setWednessday(String wednessday) {
		this.wednessday = wednessday;
	}

	public String getThursday() {
		return thursday;
	}

	public void setThursday(String thursday) {
		this.thursday = thursday;
	}

	public String getFriday() {
		return friday;
	}

	public void setFriday(String friday) {
		this.friday = friday;
	}

	public String getSatday() {
		return satday;
	}

	public void setSatday(String satday) {
		this.satday = satday;
	}

	private String monday;
	private String tuesday;
	private String wednessday;
	private String thursday;
	private String friday;
	private String satday;

	public SimplifiedDetailsRestrictionDto() {

	}

	public String getStations() {
		return stations;
	}

	public void setStations(String stations) {
		this.stations = stations;
	}

	public String getToStations() {
		return toStations;
	}

	public void setToStations(String toStations) {
		this.toStations = toStations;
	}

	public String getToCountries() {
		return toCountries;
	}

	public void setToCountries(String toCountries) {
		this.toCountries = toCountries;
	}

	public String getFromStations() {
		return fromStations;
	}

	public void setFromStations(String fromStations) {
		this.fromStations = fromStations;
	}

	public String getFromCountries() {
		return fromCountries;
	}

	public void setFromCountries(String fromCountries) {
		this.fromCountries = fromCountries;
	}

	public String getCarriers() {
		return carriers;
	}

	public void setCarriers(String carriers) {
		this.carriers = carriers;
	}

	public String getFlights() {
		return flights;
	}

	public void setFlights(String flights) {
		this.flights = flights;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public String getAircraftRegNum() {
		return aircraftRegNum;
	}

	public void setAircraftRegNum(String aircraftRegNum) {
		this.aircraftRegNum = aircraftRegNum;
	}

	public String getProductCodes() {
		return productCodes;
	}

	public void setProductCodes(String productCodes) {
		this.productCodes = productCodes;
	}

	public String getSplCodes() {
		return splCodes;
	}

	public void setSplCodes(String splCodes) {
		this.splCodes = splCodes;
	}

	public String getAlertCodes() { return alertCodes; }

	public void setAlertCodes(String alertCodes) { this.alertCodes = alertCodes; }

	public String getCommodityCodes() {
		return commodityCodes;
	}

	public void setCommodityCodes(String commodityCodes) {
		this.commodityCodes = commodityCodes;
	}

	/**
	 * Attribute to hold <code>systemWideIndicator</code> property.
	 * <p>
	 * Indicator to denote that the restriction is for all the station in the
	 * system.
	 * <li><code>true</code>-System wide restrictions.
	 * <li><code>false</code>-Not a system wide restriction.
	 */
	private boolean systemWideIndicator;

	/**
	 * Attribute to hold <code>carrierCode</code> property.
	 * <p>
	 * Carrier code for which the restriction information is to be displayed. If
	 * not entered, it defaults to the host carrier.
	 */
	private String carrierCode;

	/**
	 * Attribute to hold <code>carrierCode</code> property.
	 * <p>
	 * Carrier code for which the restriction information is to be displayed. If
	 * not entered, it defaults to the host carrier.
	 */
	private Set<SimplifiedRestrictionCodeDto> simplifiedRestrictionCodeDto;

	/**
	 * Attribute to hold <code>carrierCode</code> property.
	 * <p>
	 * Carrier code for which the restriction information is to be displayed. If
	 * not entered, it defaults to the host carrier.
	 */
	private Set<SimplifiedRestrictionDto> simplifiedRestrictionDto;

	/**
	 * Attribute to hold <code>carrierCode</code> property.
	 * <p>
	 * Carrier code for which the restriction information is to be displayed. If
	 * not entered, it defaults to the host carrier.
	 */
	private String alert;

	/**
	 * Attribute to hold <code>carrierCode</code> property.
	 * <p>
	 * Carrier code for which the restriction information is to be displayed. If
	 * not entered, it defaults to the host carrier.
	 */
	private Date startDate;

	/**
	 * Attribute to hold <code>carrierCode</code> property.
	 * <p>
	 * Carrier code for which the restriction information is to be displayed. If
	 * not entered, it defaults to the host carrier.
	 */
	private Date endDate;

	/**
	 * Attribute to hold <code>carrierCode</code> property.
	 * <p>
	 * Carrier code for which the restriction information is to be displayed. If
	 * not entered, it defaults to the host carrier.
	 */
	private String enforcementCode;

	/**
	 * Attribute to hold <code>carrierCode</code> property.
	 * <p>
	 * Carrier code for which the restriction information is to be displayed. If
	 * not entered, it defaults to the host carrier.
	 */

	/**
	 * Attribute to hold <code>carrierCode</code> property.
	 * <p>
	 * Carrier code for which the restriction information is to be displayed. If
	 * not entered, it defaults to the host carrier.
	 */
	private String restrictionDays;

	/**
	 * Attribute to hold <code>carrierCode</code> property.
	 * <p>
	 * Carrier code for which the restriction information is to be displayed. If
	 * not entered, it defaults to the host carrier.
	 */
	private String restrictionTypeCode;

	/**
	 * Attribute to hold <code>carrierCode</code> property.
	 * <p>
	 * Carrier code for which the restriction information is to be displayed. If
	 * not entered, it defaults to the host carrier.
	 */
	private String shipmentImpacted;

	/**
	 * Attribute to hold <code>carrierCode</code> property.
	 * <p>
	 * Carrier code for which the restriction information is to be displayed. If
	 * not entered, it defaults to the host carrier.
	 */
	private String tenant;

	/**
	 * Attribute to hold <code>carrierCode</code> property.
	 * <p>
	 * Carrier code for which the restriction information is to be displayed. If
	 * not entered, it defaults to the host carrier.
	 */
	private BigDecimal weight;

	/**
	 * Attribute to hold <code>weightUnit</code> property.
	 * <p>
	 * weightUnit code for which the restriction information is to be displayed.
	 * If not entered, it defaults to the host carrier.
	 */
	private String weightUnit;

	private CheckType checkTypeCode;

	/** Attribute holds updated user,date and time **/
	private UserAuditDto userAudit;

	/**
	 * Attribute to hold <code>validityTime</code> property.
	 */
	private List<ValidityTimeDto> validityTimes;

	private String remarks;

	/**
	 * Attribute to hold <code>carrierCode</code> property.
	 * <p>
	 * Carrier code for which the restriction information is to be displayed. If
	 * not entered, it defaults to the host carrier.
	 */
	private BigDecimal dimensional;

	/**
	 * Attribute to hold <code>weightUnit</code> property.
	 * <p>
	 * weightUnit code for which the restriction information is to be displayed.
	 * If not entered, it defaults to the host carrier.
	 */
	private String dimensionalUnit;

	/**
	 * Attribute to hold <code>weightUnit</code> property.
	 * <p>
	 * weightUnit code for which the restriction information is to be displayed.
	 * If not entered, it defaults to the host carrier.
	 */
	private String partAccountNumber;

	/**
	 * Attribute to hold <code>weightUnit</code> property.
	 * <p>
	 * weightUnit code for which the restriction information is to be displayed.
	 * If not entered, it defaults to the host carrier.
	 */
	private String participantType;

	private String startTime;

	private String endTime;
	
	private String except;

	/**
	 * @return the alert
	 */
	public String getAlert() {
		return alert;
	}

	/**
	 * @param alert
	 *            the alert to set
	 */
	public void setAlert(String alert) {
		this.alert = alert;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the enforcementCode
	 */
	public String getEnforcementCode() {
		return enforcementCode;
	}

	/**
	 * @param enforcementCode
	 *            the enforcementCode to set
	 */
	public void setEnforcementCode(String enforcementCode) {
		this.enforcementCode = enforcementCode;
	}

	/**
	 * @return the restrictionDays
	 */
	public String getRestrictionDays() {
		return restrictionDays;
	}

	/**
	 * @param restrictionDays
	 *            the restrictionDays to set
	 */
	public void setRestrictionDays(String restrictionDays) {
		this.restrictionDays = restrictionDays;
	}

	/**
	 * @return the restrictionTypeCode
	 */
	public String getRestrictionTypeCode() {
		return restrictionTypeCode;
	}

	/**
	 * @param restrictionTypeCode
	 *            the restrictionTypeCode to set
	 */
	public void setRestrictionTypeCode(String restrictionTypeCode) {
		this.restrictionTypeCode = restrictionTypeCode;
	}

	/**
	 * @return the shipmentImpacted
	 */
	public String getShipmentImpacted() {
		return shipmentImpacted;
	}

	/**
	 * @param shipmentImpacted
	 *            the shipmentImpacted to set
	 */
	public void setShipmentImpacted(String shipmentImpacted) {
		this.shipmentImpacted = shipmentImpacted;
	}

	/**
	 * @return the tenant
	 */
	public String getTenant() {
		return tenant;
	}

	/**
	 * @param tenant
	 *            the tenant to set
	 */
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	/**
	 * @return the weight
	 */
	public BigDecimal getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	/**
	 * @return the weightUnit
	 */
	public String getWeightUnit() {
		return weightUnit;
	}

	/**
	 * @param weightUnit
	 *            the weightUnit to set
	 */
	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId
	 *            the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

	/**
	 * @return the stationCode
	 */

	/**
	 * @return the systemWideIndicator
	 */
	public boolean isSystemWideIndicator() {
		return systemWideIndicator;
	}

	/**
	 * @param systemWideIndicator
	 *            the systemWideIndicator to set
	 */
	public void setSystemWideIndicator(boolean systemWideIndicator) {
		this.systemWideIndicator = systemWideIndicator;
	}

	/**
	 * @return the carrierCode
	 */
	public String getCarrierCode() {
		return carrierCode;
	}

	/**
	 * @param carrierCode
	 *            the carrierCode to set
	 */
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	/**
	 * @return the simplifiedRestrictionCodeDto
	 */
	public Set<SimplifiedRestrictionCodeDto> getSimplifiedRestrictionCodeDto() {
		return simplifiedRestrictionCodeDto;
	}

	/**
	 * @param simplifiedRestrictionCodeDto
	 *            the simplifiedRestrictionCodeDto to set
	 */
	public void setSimplifiedRestrictionCodeDto(Set<SimplifiedRestrictionCodeDto> simplifiedRestrictionCodeDto) {
		this.simplifiedRestrictionCodeDto = simplifiedRestrictionCodeDto;
	}

	/**
	 * @return the simplifiedRestrictionDto
	 */
	public Set<SimplifiedRestrictionDto> getSimplifiedRestrictionDto() {
		return simplifiedRestrictionDto;
	}

	/**
	 * @param simplifiedRestrictionDto
	 *            the simplifiedRestrictionDto to set
	 */
	public void setSimplifiedRestrictionDto(Set<SimplifiedRestrictionDto> simplifiedRestrictionDto) {
		this.simplifiedRestrictionDto = simplifiedRestrictionDto;
	}

	@Override
	public Long getOId() {
		return this.oId;
	}

	/**
	 * @return the checkTypeCode
	 */
	public CheckType getCheckTypeCode() {
		return checkTypeCode;
	}

	/**
	 * @param checkTypeCode
	 *            the checkTypeCode to set
	 */
	public void setCheckTypeCode(CheckType checkTypeCode) {
		this.checkTypeCode = checkTypeCode;
	}

	/**
	 * @return the userAudit
	 */
	public UserAuditDto getUserAudit() {
		return userAudit;
	}

	/**
	 * @param userAudit
	 *            the userAudit to set
	 */
	public void setUserAudit(UserAuditDto userAudit) {
		this.userAudit = userAudit;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks
	 *            the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the dimensional
	 */
	public BigDecimal getDimensional() {
		return dimensional;
	}

	/**
	 * @param dimensional
	 *            the dimensional to set
	 */
	public void setDimensional(BigDecimal dimensional) {
		this.dimensional = dimensional;
	}

	/**
	 * @return the dimensionalUnit
	 */
	public String getDimensionalUnit() {
		return dimensionalUnit;
	}

	/**
	 * @param dimensionalUnit
	 *            the dimensionalUnit to set
	 */
	public void setDimensionalUnit(String dimensionalUnit) {
		this.dimensionalUnit = dimensionalUnit;
	}

	/**
	 * @return the partAccountNumber
	 */
	public String getPartAccountNumber() {
		return partAccountNumber;
	}

	/**
	 * @param partAccountNumber
	 *            the partAccountNumber to set
	 */
	public void setPartAccountNumber(String partAccountNumber) {
		this.partAccountNumber = partAccountNumber;
	}

	/**
	 * @return the participantType
	 */
	public String getParticipantType() {
		return participantType;
	}

	/**
	 * @param participantType
	 *            the participantType to set
	 */
	public void setParticipantType(String participantType) {
		this.participantType = participantType;
	}

	/**
	 * @return the validityTimes
	 */
	public List<ValidityTimeDto> getValidityTimes() {
		return validityTimes;
	}

	/**
	 * @param validityTimes
	 *            the validityTimes to set
	 */
	public void setValidityTimes(List<ValidityTimeDto> validityTimes) {
		this.validityTimes = validityTimes;
	}

	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime
	 *            the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime
	 *            the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		String csvString;
		csvString = this.buildSimplifiedstationRestrictionsCSVString();
		return csvString;

	}

	private String buildSimplifiedstationRestrictionsCSVString() {
		final StringBuffer csvString = new StringBuffer();
		if (this.getRestrictionTypeCode() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getRestrictionTypeCode()));

		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getCheckTypeCode() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getCheckTypeCode().value().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getEnforcementCode() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getEnforcementCode()));

		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getShipmentImpacted() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getShipmentImpacted().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes("ALL"));
		}
		if (this.getAlert() != null) {
			if(this.getAlert().equalsIgnoreCase("Yes")){
			csvString.append(this.prefixSuffixByQuotes("Y"));
			}
			else{
				csvString.append(this.prefixSuffixByQuotes("N"));
			}
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getStartDate() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.dateToString(this.getStartDate())));
		} else {
			csvString.append(this.prefixSuffixByQuotes(INDEF));
		}
		if (this.getStartTime() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getStartTime().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes("0000"));
		}

		if (this.getEndDate() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.dateToString(this.getEndDate())));
		} else {
			csvString.append(this.prefixSuffixByQuotes(INDEF));
		}
		if (this.getEndTime() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getEndTime().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes("0000"));
		}
		if (this.getValidityTimes() != null && this.getValidityTimes().get(0).getTimeRangeDto()!=null) {
			if ((this.getValidityTimes().get(0).getTimeRangeDto().getOperationFromTime()==null || this.getValidityTimes().get(0).getTimeRangeDto().getOperationFromTime()==0) &&(this.getValidityTimes().get(0).getTimeRangeDto().getOperationToTime()==null ||this.getValidityTimes().get(0).getTimeRangeDto().getOperationToTime()==0)){
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
			else{
				String fromTime=this.getValidityTimes().get(0).getTimeRangeDto().getOperationFromTime().toString();
				String toTime=this.getValidityTimes().get(0).getTimeRangeDto().getOperationToTime().toString();
				if(fromTime.length()==2){
					fromTime="00"+fromTime;
				}
				else if(fromTime.length()==1){
					fromTime="000"+fromTime;
				}
				else if(fromTime.length()==3){
					fromTime="0"+fromTime;
				}
				if(toTime.length()==2){
					toTime="00"+toTime;
				}
				else if(toTime.length()==1){
					toTime="000"+toTime;
				}
				else if(toTime.length()==3){
					toTime="0"+toTime;
				}
					
				csvString.append(this.prefixSuffixByQuotes(fromTime+"-"+toTime));
			}
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getValidityTimes() != null && this.getValidityTimes().get(1).getTimeRangeDto()!=null) {
			if ((this.getValidityTimes().get(1).getTimeRangeDto().getOperationFromTime()==null || this.getValidityTimes().get(1).getTimeRangeDto().getOperationFromTime()==0) &&(this.getValidityTimes().get(1).getTimeRangeDto().getOperationToTime()==null || this.getValidityTimes().get(1).getTimeRangeDto().getOperationToTime()==0)){
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
			else{
				String fromTime=this.getValidityTimes().get(1).getTimeRangeDto().getOperationFromTime().toString();
				String toTime=this.getValidityTimes().get(1).getTimeRangeDto().getOperationToTime().toString();
				if(fromTime.length()==2){
					fromTime="00"+fromTime;
				}
				else if(fromTime.length()==1){
					fromTime="000"+fromTime;
				}
				else if(fromTime.length()==3){
					fromTime="0"+fromTime;
				}
				if(toTime.length()==2){
					toTime="00"+toTime;
				}
				else if(toTime.length()==1){
					toTime="000"+toTime;
				}
				else if(toTime.length()==3){
					toTime="0"+toTime;
				}
					
				csvString.append(this.prefixSuffixByQuotes(fromTime+"-"+toTime));			}
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getValidityTimes() != null && this.getValidityTimes().get(2).getTimeRangeDto()!=null) {
			if ((this.getValidityTimes().get(2).getTimeRangeDto().getOperationFromTime() == null || this.getValidityTimes().get(2).getTimeRangeDto().getOperationFromTime()==0)&& (this.getValidityTimes().get(2).getTimeRangeDto().getOperationToTime()==null||this.getValidityTimes().get(2).getTimeRangeDto().getOperationToTime()==0)){
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
			else{
				
				String fromTime=this.getValidityTimes().get(2).getTimeRangeDto().getOperationFromTime().toString();
				String toTime=this.getValidityTimes().get(2).getTimeRangeDto().getOperationToTime().toString();
				if(fromTime.length()==2){
					fromTime="00"+fromTime;
				}
				else if(fromTime.length()==1){
					fromTime="000"+fromTime;
				}
				else if(fromTime.length()==3){
					fromTime="0"+fromTime;
				}
				if(toTime.length()==2){
					toTime="00"+toTime;
				}
				else if(toTime.length()==1){
					toTime="000"+toTime;
				}
				else if(toTime.length()==3){
					toTime="0"+toTime;
				}
					
				csvString.append(this.prefixSuffixByQuotes(fromTime+"-"+toTime));			}
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getValidityTimes() != null && this.getValidityTimes().get(3).getTimeRangeDto()!=null) {
			if ((this.getValidityTimes().get(3).getTimeRangeDto().getOperationFromTime()==null || this.getValidityTimes().get(3).getTimeRangeDto().getOperationFromTime()==0) &&(this.getValidityTimes().get(3).getTimeRangeDto().getOperationToTime()==null || this.getValidityTimes().get(3).getTimeRangeDto().getOperationToTime()==0)){
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
			else{
				String fromTime=this.getValidityTimes().get(3).getTimeRangeDto().getOperationFromTime().toString();
				String toTime=this.getValidityTimes().get(3).getTimeRangeDto().getOperationToTime().toString();
				if(fromTime.length()==2){
					fromTime="00"+fromTime;
				}
				else if(fromTime.length()==1){
					fromTime="000"+fromTime;
				}
				else if(fromTime.length()==3){
					fromTime="0"+fromTime;
				}
				if(toTime.length()==2){
					toTime="00"+toTime;
				}
				else if(toTime.length()==1){
					toTime="000"+toTime;
				}
				else if(toTime.length()==3){
					toTime="0"+toTime;
				}
					
				csvString.append(this.prefixSuffixByQuotes(fromTime+"-"+toTime));
			}
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getValidityTimes() != null && this.getValidityTimes().get(4).getTimeRangeDto()!=null) {
			if ((this.getValidityTimes().get(4).getTimeRangeDto().getOperationFromTime()==null ||this.getValidityTimes().get(4).getTimeRangeDto().getOperationFromTime()==0) &&(this.getValidityTimes().get(4).getTimeRangeDto().getOperationToTime()==null || this.getValidityTimes().get(4).getTimeRangeDto().getOperationToTime()==0)){
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
			else{
				String fromTime=this.getValidityTimes().get(4).getTimeRangeDto().getOperationFromTime().toString();
				String toTime=this.getValidityTimes().get(4).getTimeRangeDto().getOperationToTime().toString();
				if(fromTime.length()==2){
					fromTime="00"+fromTime;
				}
				else if(fromTime.length()==1){
					fromTime="000"+fromTime;
				}
				else if(fromTime.length()==3){
					fromTime="0"+fromTime;
				}
				if(toTime.length()==2){
					toTime="00"+toTime;
				}
				else if(toTime.length()==1){
					toTime="000"+toTime;
				}
				else if(toTime.length()==3){
					toTime="0"+toTime;
				}
					
				csvString.append(this.prefixSuffixByQuotes(fromTime+"-"+toTime));
			}
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getValidityTimes() != null && this.getValidityTimes().get(5).getTimeRangeDto()!=null) {
			if ((this.getValidityTimes().get(5).getTimeRangeDto().getOperationFromTime()==null ||this.getValidityTimes().get(5).getTimeRangeDto().getOperationFromTime()==0) &&(this.getValidityTimes().get(5).getTimeRangeDto().getOperationToTime()==null||this.getValidityTimes().get(5).getTimeRangeDto().getOperationToTime()==0)){
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
			else{
				String fromTime=this.getValidityTimes().get(5).getTimeRangeDto().getOperationFromTime().toString();
				String toTime=this.getValidityTimes().get(5).getTimeRangeDto().getOperationToTime().toString();
				if(fromTime.length()==2){
					fromTime="00"+fromTime;
				}
				else if(fromTime.length()==1){
					fromTime="000"+fromTime;
				}
				else if(fromTime.length()==3){
					fromTime="0"+fromTime;
				}
				if(toTime.length()==2){
					toTime="00"+toTime;
				}
				else if(toTime.length()==1){
					toTime="000"+toTime;
				}
				else if(toTime.length()==3){
					toTime="0"+toTime;
				}
					
				csvString.append(this.prefixSuffixByQuotes(fromTime+"-"+toTime));
			}
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getValidityTimes() != null && this.getValidityTimes().get(6).getTimeRangeDto()!=null) {
			if ((this.getValidityTimes().get(6).getTimeRangeDto().getOperationFromTime()==null || this.getValidityTimes().get(6).getTimeRangeDto().getOperationFromTime()==0) &&(this.getValidityTimes().get(6).getTimeRangeDto().getOperationToTime()==null || this.getValidityTimes().get(6).getTimeRangeDto().getOperationToTime()==0)){
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
			else{
				String fromTime=this.getValidityTimes().get(6).getTimeRangeDto().getOperationFromTime().toString();
				String toTime=this.getValidityTimes().get(6).getTimeRangeDto().getOperationToTime().toString();
				if(fromTime.length()==2){
					fromTime="00"+fromTime;
				}
				else if(fromTime.length()==1){
					fromTime="000"+fromTime;
				}
				else if(fromTime.length()==3){
					fromTime="0"+fromTime;
				}
				if(toTime.length()==2){
					toTime="00"+toTime;
				}
				else if(toTime.length()==1){
					toTime="000"+toTime;
				}
				else if(toTime.length()==3){
					toTime="0"+toTime;
				}
					
				csvString.append(this.prefixSuffixByQuotes(fromTime+"-"+toTime));
			}
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}

		if (this.getRemarks() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getRemarks()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getExceptstations() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getExceptstations()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getStations() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getStations().toString().replace(",", ";")));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getExceptcountry() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getExceptcountry()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}

		if (this.getCountry() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getCountry().replace(",", ";")));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getWorld()!=null && !this.getWorld().isEmpty()) {
			csvString.append(this.prefixSuffixByQuotes("Y"));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getExcepttoStations() != null) {

			csvString.append(this.prefixSuffixByQuotes(this.getToStations()));

		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getToStations() != null) {

			csvString.append(this.prefixSuffixByQuotes(this.getToStations().replace(",", ";")));

		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getExcepttoCountries() != null) {

			csvString.append(this.prefixSuffixByQuotes(this.getExcepttoCountries()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getToCountries() != null) {

			csvString.append(this.prefixSuffixByQuotes(String.valueOf(this.getToCountries().replace(",", ";"))));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getExceptfromStations() != null) {

			csvString.append(this.prefixSuffixByQuotes(this.getExceptfromStations()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getFromStations() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getFromStations().replace(",", ";")));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getExceptfromCountries() != null) {

			csvString
					.append(this.prefixSuffixByQuotes(this.getExceptfromCountries()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getFromCountries() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getFromCountries().replace(",", ";")));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getExceptcarriers() != null) {

			csvString.append(this.prefixSuffixByQuotes(this.getExceptcarriers()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getCarriers() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getCarriers().replace(",", ";")));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getExceptflights() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getExceptflights()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getFlights() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getFlights().replace(",", ";")));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getExceptaircraftType() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getExceptaircraftType()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getAircraftType() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getAircraftType().replace(",", ";")));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getExceptaircraftRegNum() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getExceptaircraftRegNum()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getAircraftRegNum() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getAircraftRegNum().replace(",", ";")));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getExceptproductCodes() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getExceptproductCodes()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getProductCodes() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getProductCodes().replace(",", ";")));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getExceptsplCodes() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getExceptsplCodes()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getSplCodes() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getSplCodes().replace(",", ";")));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getExceptcommodityCodes() != null) {
		
			csvString.append(this.prefixSuffixByQuotes(this.getExceptcommodityCodes()));

		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getCommodityCodes() != null) {
			csvString.append(this.prefixSuffixByQuotes("#"+this.getCommodityCodes().replace(",", ";")));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}

		if (this.getWeight() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getWeight().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}

		if (this.getWeightUnit() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getWeightUnit().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}

		if (this.getDimensional() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getDimensional().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}

		if (this.getDimensionalUnit() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getDimensionalUnit().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}

		if (this.getPartAccountNumber() != null) {
			csvString.append(this.prefixSuffixByQuotes("#" + this.getPartAccountNumber()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getParticipantType() != null && !this.getParticipantType().isEmpty()) {
			if (this.getParticipantType().contains("0")) {
				csvString.append(this.prefixSuffixByQuotes("Y"));
			} else {
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getParticipantType() != null && !this.getParticipantType().isEmpty()) {
			if (this.getParticipantType().contains("1")) {
				csvString.append(this.prefixSuffixByQuotes("Y"));
			} else {
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getParticipantType() != null && !this.getParticipantType().isEmpty()) {
			if (this.getParticipantType().contains("2")) {
				csvString.append(this.prefixSuffixByQuotes("Y"));
			} else {
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getParticipantType() != null && !this.getParticipantType().isEmpty()) {
			if (this.getParticipantType().contains("3")) {
				csvString.append(this.prefixSuffixByQuotes("Y"));
			} else {
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getParticipantType() != null && !this.getParticipantType().isEmpty()) {
			if (this.getParticipantType().contains("4")) {
				csvString.append(this.prefixSuffixByQuotes("Y"));
			} else {
		 		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getParticipantType() != null && !this.getParticipantType().isEmpty()) {
			if (this.getParticipantType().contains("5")) {
				csvString.append(this.prefixSuffixByQuotes("Y"));
			} else {
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getParticipantType() != null && !this.getParticipantType().isEmpty()) {
			if (this.getParticipantType().contains("6")) {
				csvString.append(this.prefixSuffixByQuotes("Y"));
			} else {
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}

		if (this.getExceptAlertCodes() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getExceptAlertCodes()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getAlertCodes() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getAlertCodes().replace(",", ";")));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}

		if (this.getoId() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getoId().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		return csvString.toString();
	}

	private String prefixSuffixByQuotes(final String pString) {
		final String aQUOTATION = "\"";
		final String aCOMMA = ",";
		final StringBuffer aModifiedString = new StringBuffer();
		aModifiedString.append(aQUOTATION);
		aModifiedString.append(pString);
		aModifiedString.append(aQUOTATION);
		aModifiedString.append(aCOMMA);

		return aModifiedString.toString();
	}

	private String dateToString(final Date pDate) {
		final Format aSimpleDateFormat = new SimpleDateFormat(FrameworkConstants.DATEFORMAT, Locale.UK);
		return ContractUtility.convertToUpperCase(aSimpleDateFormat.format(pDate));
	}

	public String getWorld() {
		return world;
	}

	public void setWorld(String world) {
		this.world = world;
	}

	public String getExcept() {
		return except;
	}

	public void setExcept(String except) {
		this.except = except;
	}
}
