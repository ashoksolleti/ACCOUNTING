package com.unisys.trans.logistics.lms.framework.preferences;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.dto.ValidityTimeDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;


/**
 * <code>RestrictionDetailDto</code> contains specific data applicable to the station and carrier.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>aircraftEquipmentCode
 * <li>aircraftRegistrationCode
 * <li>aircraftRegistrationNumber
 * <li>daysOfWeek
 * <li>effectiveDate
 * <li>endDate
 * <li>enforcementCode
 * <li>flight
 * <li>oId
 * <li>restrictionCodes
 * <li>restrictionOId
 * <li>restrictionTypeCode
 * <li>checkTypeCode
 * </code>
 * </ul>
 */
public class RestrictionDetailDto implements Serializable {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6056082443326566937L;

    /**
     * Attribute to hold <code>aircraftEquipmentCode</code> property.
     * <p>
     * Aircraft Equipment Code that the restriction affects. If the restriction is not for a specific
     * aircraft, this field is blank
     */
    private String aircraftEquipmentCode;

    /**
     * Attribute to hold <code>aircraftRegisterNumber</code> property.
     * <p>
     * Aircraft Registration Number that the restriction affects. If the restriction is not for a specific
     * Aircraft Registration number, this field is blank.
     */
    private String aircraftRegisterNumber;

    /**
     * Attribute to hold <code>aircraftRegistrationCode</code> property.
     * <p>
     * Aircraft Registration Indicator.
     * <li>'A' - ALL EXCEPT Which means all Aircraft registration numbers except the entered aircraft
     * registration number are restricted. Anything else in this field indicates that only the entered
     * aircraft number is restricted.
     * <li>'O' - ONLY the entered Aircraft Registration number is restricted.
     */
    private String aircraftRegistrationCode;

    /**
     * Attribute to hold <code>daysOfWeek</code> property.
     * <p>
     * Days of operation, the restriction is effective. If the restriction applies to all days, this field is
     * blank.
     */
    private Long daysOfWeek;

    /**
     * Attribute to hold <code>effectiveDate</code> property.
     * <p>
     * Beginning date of the period that the restriction is effective for.
     */
    private Date effectiveDate;

    /**
     * Attribute to hold <code>endDate</code> property.
     * <p>
     * Ending date of the period that the restriction is effective for. If the ending date is blank, the
     * restriction is effective for any date following the beginning date inclusive of the beginning date.
     */
    private Date endDate;

    /**
     * Attribute to hold <code>enforcementCode</code> property.
     * <p>
     * Indicates if the restriction is a warning or restriction.
     * <li>R - Restriction.
     * <li>W - Warning.
     */
    private String enforcementCode;

    /**
     * Attribute to hold <code>flight</code> property.
     * <p>
     * Represents the <code>BaseFlightDto</code> object which holds the flight information for the
     * restriction.
     */
    private BaseFlightDto flight;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key identify the <code>RestrictionDetailDto</code>.It is of type Long.<br>
     */
    private Long oId;

    /**
     * Attribute to hold <code>restrictionCodes</code> property.
     * <p>
     * Represent the codes applicable to a restriction.It is of type <code>RestrictionCodeDto</code> class.
     */
    private List<RestrictionCodeDto> restrictionCodes;

    /**
     * Attribute to hold <code>restrictionOId</code> property.
     * <p>
     * Unique key identify the <code>Restriction</code>.It is of type Long.<br>
     */
    private Long restrictionOId;

    /**
     * Attribute to hold <code>restrictionTypeCode</code> property.
     * <p>
     * Represents the type of the restriction.
     * <li>E - Export
     * <li>T - Transit
     * <li>I - Import
     * <li>C - Collect charge
     */
    private String restrictionTypeCode;
    
    
    private CheckType checkTypeCode;  //** DL539 Change **//
    
    private UserAuditDto userAudit;

    /**
     * Attribute to hold <code>validityTimeDtos</code> property.
     * <p>
     * ValidityTimeDtos to denote that the station restriction times.
     */
    private List<ValidityTimeDto> validityTimeDtos = new ArrayList<ValidityTimeDto>();

    /**
     * <code>Default constructor.</code>
     */
    public RestrictionDetailDto() {

    }

    /**
     * Gets the value of the <code>aircraftEquipmentCode</code> property.
     * <p>
     * Aircraft Registration Indicator.
     * <li>'A' - ALL EXCEPT Which means all Aircraft registration numbers except the entered aircraft
     * registration number are restricted. Anything else in this field indicates that only the entered
     * aircraft number is restricted.
     * <li>'O' - ONLY the entered Aircraft Registration number is restricted.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha Numeric<br>
     * <b>Example: </b><br>
     * 747
     * <p>
     * 
     * @return the current value of the <code>aircraftEquipmentCode</code> property.<br>
     */
    public String getAircraftEquipmentCode() {
        return this.aircraftEquipmentCode;
    }

    /**
     * Gets the value of the <code>aircraftRegisterNumber</code> property.
     * <p>
     * Aircraft Registration Number that the restriction affects. If the restriction is not for a specific
     * Aircraft Registration number, this field is blank.
     * <p>
     * <b>Format: </b><br>
     * 2-9 Alphanumeric<br>
     * <b>Example: </b><br>
     * 123
     * <p>
     * 
     * @return the current value of the <code>aircraftRegisterNumber</code> property.
     */
    public String getAircraftRegisterNumber() {
        return this.aircraftRegisterNumber;
    }

    /**
     * Gets the value of the <code>aircraftRegistrationCode</code> property.
     * <p>
     * Aircraft Registration Indicator.
     * <li>'A' - ALL EXCEPT Which means all Aircraft registration numbers except the entered aircraft
     * registration number are restricted. Anything else in this field indicates that only the entered
     * aircraft number is restricted.
     * <li>'O' - ONLY the entered Aircraft Registration number is restricted.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <b>Example: </b><br>
     * O
     * <p>
     * 
     * @return the current value of the <code>aircraftRegistrationCode</code> property.<br>
     */
    public String getAircraftRegistrationCode() {
        return this.aircraftRegistrationCode;
    }

    /**
     * Gets the value of the <code>daysOfWeek</code> property.
     * <p>
     * Days of operation, the restriction is effective. If the restriction applies to all days, this field is
     * blank.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Numeric<br>
     * <b>Example: </b><br>
     * 135
     * <p>
     * 
     * @return the current value of the <code>daysOfWeek</code> property.
     */
    public Long getDaysOfWeek() {
        return this.daysOfWeek;
    }

    /**
     * Gets the value of the <code>effectiveDate</code> property.
     * <p>
     * Beginning date of the period that the restriction is effective for.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 30JUN07
     * <p>
     * 
     * @return the current value of the <code>effectiveDate</code> property.
     */
    public Date getEffectiveDate() {
        return ContractUtility.getClonedDate(this.effectiveDate);
    }

    /**
     * Gets the value of the <code>endDate</code> property.
     * <p>
     * Ending date of the period that the restriction is effective for. If the ending date is blank, the
     * restriction is effective for any date following the beginning date inclusive of the beginning date.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 30JUN07
     * <p>
     * 
     * @return returns the current value of the <code>endDate</code> property.<br>
     */
    public Date getEndDate() {
        return ContractUtility.getClonedDate(this.endDate);
    }

    /**
     * Gets the value of the <code>enforcementCode</code> property.
     * <p>
     * Indicates if the restriction is a warning or restriction.
     * <li>R - Restriction.
     * <li>W - Warning.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <b>Example: </b><br>
     * R
     * <p>
     * 
     * @return the current value of the <code>enforcementCode</code> property.<br>
     */
    public String getEnforcementCode() {
        return this.enforcementCode;
    }

    /**
     * Holds the<code>BaseFlightDto</code> that contains the flight details.
     * <p>
     * Represents the <code>BaseFlightDto</code> object which holds the flight information for the
     * restriction.
     * <p>
     * 
     * @return the current value of <code>flight</code> property.
     */
    public BaseFlightDto getFlight() {
        return this.flight;
    }

    /**
     * Gets the value of <code>OID</code> property.
     * <p>
     * Unique key identify the <code>RestrictionDetailDto</code>.It is of type Long.<br>
     * <p>
     * 
     * @return the current value of the <code>OID</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Holds the list of <code>RestrictionCodeDto</code> that contains the restriction codes.
     * <p>
     * Represent the codes applicable to a restriction.It is of type <code>RestrictionCodeDto</code> class.
     * <p>
     * 
     * @return the current value of <code>restrictionCodes</code> property.
     */
    public List<RestrictionCodeDto> getRestrictionCodes() {
        return this.restrictionCodes;
    }

    /**
     * Gets the value of <code>restrictionOId</code> property.
     * <p>
     * Unique key identify the <code>Restriction</code>.It is of type Long.<br>
     * <p>
     * 
     * @return the current value of the <code>restrictionOId</code> property.<br>
     *         </p>
     */
    public Long getRestrictionOId() {
        return this.restrictionOId;
    }

    /**
     * Gets the value of the <code>restrictionTypeCode</code> property.
     * <p>
     * Represents the type of the restriction.
     * <li>E - Export
     * <li>T - Transit
     * <li>I - Import
     * <li>C - Collect charge
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <b>Example: </b><br>
     * I
     * <p>
     * 
     * @return the current value of the <code>restrictionTypeCode</code> property.<br>
     */
    public String getRestrictionTypeCode() {
        return this.restrictionTypeCode;
    }

    /**
     * Gets the value of the <code>validityTimeDtos</code> property.
     * <p>
     * Represents the <code>ValidityTimeDto</code> object which holds the valid days and time information for
     * the restriction.
     * <p>
     * 
     * @return the current value of the <code>validityTimeDtos</code> property.<br>
     */
    public List<ValidityTimeDto> getValidityTimeDtos() {
        return this.validityTimeDtos;
    }

    /**
     * Sets the value of the <code>aircraftEquipmentCode</code> property.
     * <p>
     * Aircraft Registration Indicator.
     * <li>'A' - ALL EXCEPT Which means all Aircraft registration numbers except the entered aircraft
     * registration number are restricted. Anything else in this field indicates that only the entered
     * aircraft number is restricted.
     * <li>'O' - ONLY the entered Aircraft Registration number is restricted.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha Numeric<br>
     * <b>Example: </b><br>
     * 747
     * <p>
     * 
     * @param pAircraftEquipmentCode the new value of the <code>aircraftEquipmentCode</code> property.<br>
     */
    public void setAircraftEquipmentCode(final String pAircraftEquipmentCode) {
        this.aircraftEquipmentCode = ContractUtility.convertToUpperCase(pAircraftEquipmentCode);
    }

    /**
     * Sets the value of the <code>aircraftRegisterNumber</code> property.
     * <p>
     * Aircraft Registration Number that the restriction affects. If the restriction is not for a specific
     * Aircraft Registration number, this field is blank.
     * <p>
     * <b>Format: </b><br>
     * 2-9 Alphanumeric<br>
     * <b>Example: </b><br>
     * 123
     * <p>
     * 
     * @param pAircraftRegisterNumber the new value of the <code>aircraftRegisterNumber</code> property.<br>
     */
    public void setAircraftRegisterNumber(final String pAircraftRegisterNumber) {
        this.aircraftRegisterNumber = pAircraftRegisterNumber;
    }

    /**
     * Sets the value of the <code>aircraftRegistrationCode</code> property.
     * <p>
     * Aircraft Registration Indicator.
     * <li>'A' - ALL EXCEPT Which means all Aircraft registration numbers except the entered aircraft
     * registration number are restricted. Anything else in this field indicates that only the entered
     * aircraft number is restricted.
     * <li>'O' - ONLY the entered Aircraft Registration number is restricted.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <b>Example: </b><br>
     * O
     * <p>
     * 
     * @param pAircraftRegistrationCode the new value of the <code>aircraftRegistrationCode</code> property.
     */
    public void setAircraftRegistrationCode(final String pAircraftRegistrationCode) {
        this.aircraftRegistrationCode = ContractUtility.convertToUpperCase(pAircraftRegistrationCode);
    }

    /**
     * Sets the value of the <code>daysOfWeek</code> property.
     * <p>
     * Days of operation, the restriction is effective. If the restriction applies to all days, this field is
     * blank.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Numeric<br>
     * <b>Example: </b><br>
     * 135
     * <p>
     * 
     * @param pDaysOfWeek the new value of the <code>daysOfWeek</code> property.
     */
    public void setDaysOfWeek(final Long pDaysOfWeek) {
        this.daysOfWeek = pDaysOfWeek;
    }

    /**
     * Sets the value of the <code>effectiveDate</code> property.
     * <p>
     * Beginning date of the period that the restriction is effective for.
     * <p>
     * <b>Format: </b><br>
     * 7 Date<br>
     * <b>Example: </b><br>
     * 01JAN07
     * <p>
     * 
     * @param pEffectiveDate the new value of the <code>effectiveDate</code> property.
     */
    public void setEffectiveDate(final Date pEffectiveDate) {
        this.effectiveDate = ContractUtility.getClonedDate(pEffectiveDate);
    }

    /**
     * Sets the value of the <code>endDate</code> property.
     * <p>
     * Ending date of the period that the restriction is effective for. If the ending date is blank, the
     * restriction is effective for any date following the beginning date inclusive of the beginning date.
     * <p>
     * <b>Format: </b><br>
     * 7 Date<br>
     * <b>Example: </b><br>
     * 01JAN07
     * <p>
     * 
     * @param pEndDate the new value of the <code>endDate</code> property.<br>
     */
    public void setEndDate(final Date pEndDate) {
        this.endDate = ContractUtility.getClonedDate(pEndDate);
    }

    /**
     * Sets the value of the <code>enforcementCode</code> property.
     * <p>
     * Indicates if the restriction is a warning or restriction.
     * <li>R - Restriction.
     * <li>W - Warning.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <b>Example: </b><br>
     * R
     * <p>
     * 
     * @param pEnforcementCode the new value of the <code>enforcementCode</code> property.<br>
     */
    public void setEnforcementCode(final String pEnforcementCode) {
        this.enforcementCode = ContractUtility.convertToUpperCase(pEnforcementCode);
    }

    /**
     * Sets the <code>BaseFlightDto</code> that contains flight details.
     * <p>
     * Represents the <code>BaseFlightDto</code> object which holds the flight information for the
     * restriction.
     * <p>
     * 
     * @param pFlight the new value of the <code>flight</code> property.
     */
    public void setFlight(final BaseFlightDto pFlight) {
        this.flight = pFlight;
    }

    /**
     * Sets the <code>OID</code> property.
     * <p>
     * Unique key identify the <code>RestrictionDetailDto</code>.It is of type Long.<br>
     * <p>
     * 
     * @param pOId the new value of the <code>OID</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>restrictionCodes</code> property.
     * <p>
     * Represent the codes applicable to a restriction.It is of type <code>RestrictionCodeDto</code> class.
     * <p>
     * 
     * @param pRestrictionCodeDtos the new value of the <code>restrictionCodes</code> property.
     */
    public void setRestrictionCodes(final List<RestrictionCodeDto> pRestrictionCodeDtos) {
        this.restrictionCodes = pRestrictionCodeDtos;
    }

    /**
     * Sets the <code>restrictionOId</code> property.
     * <p>
     * Unique key identify the <code>Restriction</code>.It is of type Long.<br>
     * <p>
     * 
     * @param pRestrictionOId new value of the <code>restrictionOId</code> property.<br>
     */
    public void setRestrictionOId(final Long pRestrictionOId) {
        this.restrictionOId = pRestrictionOId;
    }

    /**
     * Sets the <code>restrictionTypeCode</code> property.
     * <p>
     * * Represents the type of the restriction.
     * <li>E - Export
     * <li>T - Transit
     * <li>I - Import
     * <li>C - Collect charge
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <b>Example: </b><br>
     * I
     * <p>
     * 
     * @param pRestrictionTypeCode new value of the <code>restrictionTypeCode</code> property.
     */
    public void setRestrictionTypeCode(final String pRestrictionTypeCode) {
        this.restrictionTypeCode = ContractUtility.convertToUpperCase(pRestrictionTypeCode);
    }

    /**
     * Sets the <code>validityTimeDtos</code> property.
     * <p>
     * 
     * @param pValidityTimeDtos the validityTimeDtos to set
     */
    public void setValidityTimeDtos(final List<ValidityTimeDto> pValidityTimeDtos) {
        this.validityTimeDtos = pValidityTimeDtos;
    }

    public CheckType getCheckTypeCode() {
        return checkTypeCode;
    }

    public void setCheckTypeCode(CheckType pCheckTypeCode) {
        this.checkTypeCode = pCheckTypeCode;
    }
    
 
    
    public UserAuditDto getUserAudit() {
        return userAudit;
    }

    public void setUserAudit(UserAuditDto userAudit) {
        this.userAudit = userAudit;
    }
}

