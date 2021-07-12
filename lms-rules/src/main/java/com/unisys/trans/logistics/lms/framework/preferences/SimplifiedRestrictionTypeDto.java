/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.preferences;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.dto.ValidityTimeDto;
import com.unisys.trans.logistics.lms.framework.exception.CodeMessage;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * @author RamannaV
 *
 */
/**
 * @author RamannaV
 *
 */
public class SimplifiedRestrictionTypeDto extends PersistenceObjectDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Attribute to hold <code>oId</code> property.
	 * <p>
	 * Unique key identify the <code>RestrictionDto</code>.It is of type Long.
	 */
	private Long oid;

	/**
	 * Attribute to hold <code>stationCode</code> property.
	 * <p>
	 * Station for which the restriction information is to be displayed.
	 */
	private String stationCode;

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
	private BigDecimal restrictionDays;

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
	
	Map<String, List<String>> rstnEligibleElemsnts;
	
	private boolean countryRestriction;
	
	private boolean worldRestriction;

	/**
	 * Attribute to hold <code>weightUnit</code> property.
	 * <p>
	 * weightUnit code for which the restriction information is to be displayed.
	 * If not entered, it defaults to the host carrier.
	 */
	private String participantType;

	private String startTime;

	private String endTime;
	
	private String[] rowData;
	
	private boolean batchInd;
	
	private CsvRecord record;
	
	private boolean exceptCondFound;
	
	private String numberOfdays;

	private String requestType;
	
	 private List<CodeMessage> codeMessages = new ArrayList<CodeMessage>();
	/**
	 * @return the all
	 */
	

	/**
	 * @return the record
	 */
	public CsvRecord getRecord() {
		return record;
	}

	/**
	 * @param record the record to set
	 */
	public void setRecord(CsvRecord record) {
		this.record = record;
	}

	/**
	 * @return the batchInd
	 */
	public boolean isBatchInd() {
		return batchInd;
	}

	/**
	 * @param batchInd the batchInd to set
	 */
	public void setBatchInd(boolean batchInd) {
		this.batchInd = batchInd;
	}

	/**
	 * @return the rowData
	 */
	public String[] getRowData() {
		return rowData;
	}

	/**
	 * @param rowData the rowData to set
	 */
	public void setRowData(String[] rowData) {
		if(rowData!=null){
		this.rowData = rowData.clone();
		}
		else {
		this.rowData = null;		
		}
	}

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
		return ContractUtility.getClonedDate(this.startDate);
	}

	/**
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = ContractUtility.getClonedDate(startDate);
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return ContractUtility.getClonedDate(this.endDate);
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = ContractUtility.getClonedDate(endDate);
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
	public BigDecimal getRestrictionDays() {
		return restrictionDays;
	}

	/**
	 * @param restrictionDays
	 *            the restrictionDays to set
	 */
	public void setRestrictionDays(BigDecimal restrictionDays) {
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
	 * @return the stationCode
	 */
	public String getStationCode() {
		return stationCode;
	}

	/**
	 * @param stationCode
	 *            the stationCode to set
	 */
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

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
	public void setSimplifiedRestrictionCodeDto(
			Set<SimplifiedRestrictionCodeDto> simplifiedRestrictionCodeDto) {
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
	public void setSimplifiedRestrictionDto(
			Set<SimplifiedRestrictionDto> simplifiedRestrictionDto) {
		this.simplifiedRestrictionDto = simplifiedRestrictionDto;
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

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return oid;
	}
	
	/**
	 * @param oid the oid to set
	 */
	public void setOid(Long oid) {
		this.oid = oid;
	}

	/**
	 * @return the rstnEligibleElemsnts
	 */
	public Map<String, List<String>> getRstnEligibleElemsnts() {
		
		return rstnEligibleElemsnts;
	}

	/**
	 * @param rstnEligibleElemsnts the rstnEligibleElemsnts to set
	 */
	public void setRstnEligibleElemsnts(
			Map<String, List<String>> rstnEligibleElemsnts) {
		this.rstnEligibleElemsnts = rstnEligibleElemsnts;
	}

	/**
	 * @return the countryRestriction
	 */
	public boolean isCountryRestriction() {
		return countryRestriction;
	}

	/**
	 * @param countryRestriction the countryRestriction to set
	 */
	public void setCountryRestriction(boolean countryRestriction) {
		this.countryRestriction = countryRestriction;
	}

	/**
	 * @return the worldRestriction
	 */
	public boolean isWorldRestriction() {
		return worldRestriction;
	}

	/**
	 * @param worldRestriction the worldRestriction to set
	 */
	public void setWorldRestriction(boolean worldRestriction) {
		this.worldRestriction = worldRestriction;
	}

	public boolean isExceptCondFound() {
		return exceptCondFound;
	}

	public void setExceptCondFound(boolean exceptCondFound) {
		this.exceptCondFound = exceptCondFound;
	}

	public String getNumberOfdays() {
		return numberOfdays;
	}

	public void setNumberOfdays(String numberOfdays) {
		this.numberOfdays = numberOfdays;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public List<CodeMessage> getCodeMessages() {
		if (this.codeMessages == null) {
            this.codeMessages = new ArrayList<CodeMessage>();
        }
		return codeMessages;
	}

	public void setCodeMessages(List<CodeMessage> codeMessages) {
		this.codeMessages = codeMessages;
	}

}
