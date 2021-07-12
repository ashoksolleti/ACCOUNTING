/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <code>RestrictionSearchDto</code> contains specific data applicable to the station and carrier.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>aircraftEquipmentCode
 * <li>aircraftRegistrationCode
 * <li>aircraftRegisterNumber
 * <li>daysOfWeek
 * <li>effectiveDate
 * <li>endDate
 * <li>enforcementCode
 * <li>flight
 * <li>restrictionCodes
 * </code>
 * </ul>
 */
public class RestrictionSearchDto implements Serializable {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6504480641234987068L;

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
     * <li>'O' � ONLY the entered Aircraft Registration number is restricted.
     */
    private String aircraftRegistrationCode;

    /**
     * Attribute to hold <code>daysOfWeek</code> property.
     * <p>
     * Days of operation, the restriction is effective. If the restriction applies to all days, this field is
     * blank.
     */
    private String daysOfWeek;

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
    private String endDate;

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
     * Attribute to hold <code>restrictionCodes</code> property.
     * <p>
     * Represent the codes applicable to a restriction.It is of type <code>RestrictionCodeDto</code> class.
     */
    private List<RestrictionCodeDto> restrictionCodes;

    Map<String, String> participntsMap;

    private BigDecimal weight;

    private String weightUnit;

    private BigDecimal dimension;

    private String dimensionUnit;

    private boolean goodsAccepted;

    private Date awbExecutionDate;

    private String effectiveTime;
    private List<Date> flightExecutionDates;
	
	private String toCountry;
	private List<com.unisys.trans.logistics.lms.framework.preferences.RestrictionCodeDto> restrictionCodeDtos;
	
	private Date firstAcceptedDate;
    /**
     * Gets the value of the <code>aircraftEquipmentCode</code> property.
     * <p>
     * Aircraft Registration Indicator.
     * <li>'A' - ALL EXCEPT Which means all Aircraft registration numbers except the entered aircraft
     * registration number are restricted. Anything else in this field indicates that only the entered
     * aircraft number is restricted.
     * <li>'O' � ONLY the entered Aircraft Registration number is restricted.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha Numeric<br>
     * <b>Example: </b><br>
     * 747
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
     * <li>'O' � ONLY the entered Aircraft Registration number is restricted.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <b>Example: </b><br>
     * O
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
     * 
     * @return the current value of the <code>daysOfWeek</code> property.
     */
    public String getDaysOfWeek() {
        return this.daysOfWeek;
    }

    /**
     * Gets the value of the <code>effectiveDate</code> property.
     * <p>
     * Beginning date of the period that the restriction is effective for.
     * <p>
     * <b>Format: </b><br>
     * 7 Date<br>
     * <b>Example: </b><br>
     * 01JAN07
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
     * 7 Date<br>
     * <b>Example: </b><br>
     * 01JAN07
     * 
     * @return returns the current value of the <code>endDate</code> property.<br>
     */
    public String getEndDate() {
        return this.endDate;
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
     * Sets the value of the <code>aircraftEquipmentCode</code> property.
     * <p>
     * Aircraft Registration Indicator.
     * <li>'A' - ALL EXCEPT Which means all Aircraft registration numbers except the entered aircraft
     * registration number are restricted. Anything else in this field indicates that only the entered
     * aircraft number is restricted.
     * <li>'O' � ONLY the entered Aircraft Registration number is restricted.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha Numeric<br>
     * <b>Example: </b><br>
     * 747
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
     * <li>'O' � ONLY the entered Aircraft Registration number is restricted.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <b>Example: </b><br>
     * O
     * 
     * @param pAircraftRegistrationCode the new value of the <code>aircraftRegistrationCode</code> property.
     *            </p>
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
     * 
     * @param pDaysOfWeek the new value of the <code>daysOfWeek</code> property.
     */
    public void setDaysOfWeek(final String pDaysOfWeek) {
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
     * 
     * @param pEndDate the new value of the <code>endDate</code> property.<br>
     */
    public void setEndDate(final String pEndDate) {
        this.endDate = pEndDate;
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

    public Map<String, String> getParticipntsMap() {
        return participntsMap;
    }

    public void setParticipntsMap(Map<String, String> participntsMap) {
        this.participntsMap = participntsMap;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public BigDecimal getDimension() {
        return dimension;
    }

    public void setDimension(BigDecimal dimension) {
        this.dimension = dimension;
    }

    public String getDimensionUnit() {
        return dimensionUnit;
    }

    public void setDimensionUnit(String dimensionUnit) {
        this.dimensionUnit = dimensionUnit;
    }

    public boolean isGoodsAccepted() {
        return goodsAccepted;
    }

    public void setGoodsAccepted(boolean goodsAccepted) {
        this.goodsAccepted = goodsAccepted;
    }

    public Date getAwbExecutionDate() {
        return awbExecutionDate;
    }

    public void setAwbExecutionDate(Date awbExecutionDate) {
        this.awbExecutionDate = awbExecutionDate;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

	/**
	 * @return the flightExecutionDates
	 */
	public List<Date> getFlightExecutionDates() {
		return flightExecutionDates;
	}

	/**
	 * @param flightExecutionDates the flightExecutionDates to set
	 */
	public void setFlightExecutionDates(List<Date> flightExecutionDates) {
		this.flightExecutionDates = flightExecutionDates;
	}

	/**
	 * @return the toCountry
	 */
	public String getToCountry() {
		return toCountry;
	}

	/**
	 * @param toCountry the toCountry to set
	 */
	public void setToCountry(String toCountry) {
		this.toCountry = toCountry;
	}

	/**
	 * @return the restrictionCodeDtos
	 */
	public List<com.unisys.trans.logistics.lms.framework.preferences.RestrictionCodeDto> getRestrictionCodeDtos() {
		return restrictionCodeDtos;
	}

	/**
	 * @param restrictionCodeDtos the restrictionCodeDtos to set
	 */
	public void setRestrictionCodeDtos(
			List<com.unisys.trans.logistics.lms.framework.preferences.RestrictionCodeDto> restrictionCodeDtos) {
		this.restrictionCodeDtos = restrictionCodeDtos;
	}

	/**
	 * @return the firstAcceptedDate
	 */
	public Date getFirstAcceptedDate() {
		return firstAcceptedDate;
	}

	/**
	 * @param firstAcceptedDate the firstAcceptedDate to set
	 */
	public void setFirstAcceptedDate(Date firstAcceptedDate) {
		this.firstAcceptedDate = firstAcceptedDate; 
	}
}
