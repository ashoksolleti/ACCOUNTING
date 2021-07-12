/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.StationInfoRestrictionType;
import com.unisys.trans.logistics.lms.utils.dto.constants.StationRestrictionType;

/**
 * <code>SpecialInstructionDto</code> contain details of SpecialInstructionDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>aircraftRegistration
 * <li>aircraftType
 * <li>awbType
 * <li>carrier
 * <li>check
 * <li>days
 * <li>destination
 * <li>endDate
 * <li>friday
 * <li>importRemarks
 * <li>monday
 * <li>oId
 * <li>productCodes
 * <li>productCodesAsString
 * <li>registrationType
 * <li>saturday
 * <li>specialInstructions
 * <li>startDate
 * <li>stationRestrictionType
 * <li>sunday
 * <li>thursday
 * <li>tuesday
 * <li>type
 * <li>wednesday
 * </code>
 * </ul>
 */
public class SpecialInstructionDto extends PersistenceObjectDto {

    /**
     * Attribute to hold <code>DELIMITER</code> property.
     */
    private static final String DELIMITER = "/";

    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = -5593733545770992091L;

    /**
     * Attribute to hold <code>aircraftRegistration</code> property.
     */
    private String aircraftRegistration;

    /**
     * Attribute to hold <code>aircraftType</code> property.
     */
    private String aircraftType;

    /**
     * Attribute to hold <code>awbType</code> property.
     */
    private String awbType;

    /**
     * Attribute to hold <code>carrier</code> property.
     */
    private String carrier;

    /**
     * Attribute to hold <code>days</code> property.
     */
    private String days;

    /**
     * Attribute to hold <code>destination</code> property.
     */
    private String destination;

    /**
     * Attribute to hold <code>endDate</code> property.
     */
    private Date endDate;

    /**
     * Attribute to hold <code>friday</code> property.
     */
    private String friday;

    /**
     * Attribute to hold <code>importRemarks</code> property.
     */
    private String importRemarks;

    /**
     * Attribute to hold <code>monday</code> property.
     */
    private String monday;

    /**
     * Attribute to hold <code>oId</code> property. Unique identifier for station
     */
    private Long oId;

    /**
     * Attribute to hold <code>carriers</code> property.
     */
    private List<String> productCodes;

    /**
     * Attribute to hold <code>carriersAsString</code> property.
     */
    private String productCodesAsString;

    /**
     * Attribute to hold <code>registrationType</code> property.
     */
    private String registrationType;

    /**
     * Attribute to hold <code>saturday</code> property.
     */
    private String saturday;

    /**
     * Attribute to hold <code>carriers</code> property.
     */
    private String specialInstructions;

    /**
     * Attribute to hold <code>startDate</code> property.
     */
    private Date startDate;

    /**
     * Attribute to hold <code>stationRestrictionType</code> property.
     */
    private StationRestrictionType stationRestrictionType;

    /**
     * Attribute to hold <code>sunday</code> property.
     */
    private String sunday;

    /**
     * Attribute to hold <code>thursday</code> property.
     */
    private String thursday;

    /**
     * Attribute to hold <code>tuesday</code> property.
     */
    private String tuesday;

    /**
     * Attribute to hold <code>type</code> property.
     */
    private StationInfoRestrictionType type;

    /**
     * Attribute to hold <code>wednesday</code> property.
     */
    private String wednesday;
    
    /**
     * Attribute to hold <code>check</code> property.
     */
    private String check;

    /**
     * Gets the <code>aircraftRegistration</code> property.
     * <p>
     * 
     * @return the current value of the <code>aircraftRegistration</code> property.
     */
    public String getAircraftRegistration() {
        return this.aircraftRegistration;
    }

    /**
     * Gets the <code>aircraftType</code> property.
     * <p>
     * 
     * @return the current value of the <code>aircraftType</code> property.
     */
    public String getAircraftType() {
        return this.aircraftType;
    }

    /**
     * Gets the <code>awbType</code> property.
     * <p>
     * 
     * @return the current value of the <code>awbType</code> property.
     */
    public String getAwbType() {
        return this.awbType;
    }

    /**
     * Gets the <code>carrier</code> property.
     * <p>
     * 
     * @return the current value of the <code>carrier</code> property.
     */
    public String getCarrier() {
        return this.carrier;
    }

    /**
     * Gets the <code>days</code> property.
     * <p>
     * 
     * @return the current value of the <code>days</code> property.
     */
    public String getDays() {
        return this.days;
    }

    /**
     * Gets the <code>destination</code> property.
     * <p>
     * 
     * @return the current value of the <code>destination</code> property.
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * Gets the <code>endDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>endDate</code> property.
     */
    public Date getEndDate() {
        return ContractUtility.getClonedDate(this.endDate);
    }

    /**
     * Gets the <code>friday</code> property.
     * <p>
     * 
     * @return the current value of the <code>friday</code> property.
     */
    public String getFriday() {
        return this.friday;
    }

    /**
     * Gets the <code>importRemarks</code> property.
     * <p>
     * 
     * @return the current value of the <code>importRemarks</code> property.
     */
    public String getImportRemarks() {
        return this.importRemarks;
    }

    /**
     * Gets the <code>monday</code> property.
     * <p>
     * 
     * @return the current value of the <code>monday</code> property.
     */
    public String getMonday() {
        return this.monday;
    }

    /**
     * Gets the value of <code>OID</code> property.
     * <p>
     * Unique identifier for station.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the list of <code>productCodes</code> property.
     * <p>
     * 
     * @return the current value of the <code>productCodes</code> property.
     */
    public List<String> getProductCodes() {
        if (this.productCodes == null) {
            this.productCodes = new ArrayList<String>();
        }
        return this.productCodes;
    }

    public String getProductCodesAsString() {
        final StringBuilder listAsString = new StringBuilder();
        final List<String> theProductCodes = this.getProductCodes();
        for (String productCode : theProductCodes) {
            if (productCode != null && !productCode.isEmpty()) {
                if (!listAsString.toString().isEmpty()) {
                    listAsString.append(DELIMITER);
                }
                listAsString.append(productCode.trim().toUpperCase());
            }

        }
        this.productCodesAsString = listAsString.toString();
        return this.productCodesAsString;
    }

    /**
     * Gets the <code>registrationType</code> property.
     * <p>
     * 
     * @return the current value of the <code>registrationType</code> property.
     */
    public String getRegistrationType() {
        return this.registrationType;
    }

    /**
     * Gets the <code>saturday</code> property.
     * <p>
     * 
     * @return the current value of the <code>saturday</code> property.
     */
    public String getSaturday() {
        return this.saturday;
    }

    /**
     * Gets the <code>specialInstructions</code> property.
     * <p>
     * 
     * @return the current value of the <code>specialInstructions</code> property.
     */
    public String getSpecialInstructions() {
        return this.specialInstructions;
    }

    /**
     * Gets the <code>startDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>startDate</code> property.
     */
    public Date getStartDate() {
        return ContractUtility.getClonedDate(this.startDate);
    }

    /**
     * Gets the {@link com.unisys.trans.logistics.lms.utils.dto.constants.StationRestrictionType
     * StationRestrictionType} containing <code>StationRestrictionType</code> details.
     * <p>
     * 
     * @return the current value of the <code>stationRestrictionType</code> property.
     */
    public StationRestrictionType getStationRestrictionType() {
        return this.stationRestrictionType;
    }

    /**
     * Gets the <code>sunday</code> property.
     * <p>
     * 
     * @return the current value of the <code>sunday</code> property.
     */
    public String getSunday() {
        return this.sunday;
    }

    /**
     * Gets the <code>thursday</code> property.
     * <p>
     * 
     * @return the current value of the <code>thursday</code> property.
     */
    public String getThursday() {
        return this.thursday;
    }

    /**
     * Gets the <code>tuesday</code> property.
     * <p>
     * 
     * @return the current value of the <code>tuesday</code> property.
     */
    public String getTuesday() {
        return this.tuesday;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * 
     * @return the current value of the <code>type</code> property.
     */
    public StationInfoRestrictionType getType() {
        return this.type;
    }

    /**
     * Gets the <code>wednesday</code> property.
     * <p>
     * 
     * @return the current value of the <code>wednesday</code> property.
     */
    public String getWednesday() {
        return this.wednesday;
    }

    /**
     * Sets the <code>aircraftRegistration</code> property.
     * <p>
     * 
     * @param pAircraftRegistration
     *            the current value of the <code>aircraftRegistration</code> property.
     */
    public void setAircraftRegistration(final String pAircraftRegistration) {
        this.aircraftRegistration = pAircraftRegistration;
    }

    /**
     * Sets the <code>aircraftType</code> property.
     * <p>
     * 
     * @param pAircraftType
     *            the current value of the <code>aircraftType</code> property.
     */
    public void setAircraftType(final String pAircraftType) {
        this.aircraftType = pAircraftType;
    }

    /**
     * Sets the <code>awbType</code> property.
     * <p>
     * 
     * @param pAwbType
     *            the current value of the <code>awbType</code> property.
     */
    public void setAwbType(final String pAwbType) {
        this.awbType = pAwbType;
    }

    /**
     * Sets the <code>carrier</code> property.
     * <p>
     * 
     * @param pCarrier
     *            the current value of the <code>carrier</code> property.
     */
    public void setCarrier(final String pCarrier) {
        this.carrier = ContractUtility
                    .convertToUpperCase(pCarrier);
    }

    /**
     * Sets the <code>days</code> property.
     * <p>
     * 
     * @param pDays
     *            the current value of the <code>days</code> property.
     */
    public void setDays(final String pDays) {
        this.days = pDays;
    }

    /**
     * Sets the <code>destination</code> property.
     * <p>
     * 
     * @param pDestination
     *            the current value of the <code>destination</code> property.
     */
    public void setDestination(final String pDestination) {
        this.destination = pDestination;
    }

    /**
     * Sets the <code>endDate</code> property.
     * <p>
     * 
     * @param pEndDate
     *            the current value of the <code>endDate</code> property.
     */
    public void setEndDate(final Date pEndDate) {
        this.endDate = ContractUtility.getClonedDate(pEndDate);
    }

    /**
     * Sets the <code>friday</code> property.
     * <p>
     * 
     * @param pFriday
     *            the current value of the <code>friday</code> property.
     */
    public void setFriday(final String pFriday) {
        this.friday = pFriday;
    }

    /**
     * Sets the <code>importRemarks</code> property.
     * <p>
     * 
     * @param pImportRemarks
     *            the current value of the <code>importRemarks</code> property.
     */
    public void setImportRemarks(final String pImportRemarks) {
        this.importRemarks = pImportRemarks;
    }

    /**
     * Sets the <code>monday</code> property.
     * <p>
     * 
     * @param pMonday
     *            the current value of the <code>monday</code> property.
     */
    public void setMonday(final String pMonday) {
        this.monday = pMonday;
    }

    /**
     * Sets the value of the <code>OID</code> property.
     * <p>
     * Unique identifier for station.
     * <p>
     * 
     * @param pOId the new value of the <code>OID</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the list of <code>productCodes</code> property.
     * <p>
     * 
     * @param pProductCodes
     *            the current value of the <code>productCodes</code> property.
     */
    public void setProductCodes(final List<String> pProductCodes) {
        this.productCodes = pProductCodes;
    }

    /**
     * Sets the <code>productCodesAsString</code> property.
     * <p>
     * 
     * @param pProductCodesAsString
     *            the current value of the <code>productCodesAsString</code> property.
     */
    public void setProductCodesAsString(final String pProductCodesAsString) {
        if (pProductCodesAsString != null) {
            final String[] theSplittedProducts = pProductCodesAsString.split(DELIMITER);
            final List<String> productCodes = this.getProductCodes();
            productCodes.clear();
            for (String aSplittedProduct : theSplittedProducts) {
                productCodes.add(aSplittedProduct);
            }
        }
        this.productCodesAsString = ContractUtility
                    .convertToUpperCase(pProductCodesAsString);
    }

    /**
     * Sets the <code>registrationType</code> property.
     * <p>
     * 
     * @param pRegistrationType
     *            the current value of the <code>registrationType</code> property.
     */
    public void setRegistrationType(final String pRegistrationType) {
        this.registrationType = pRegistrationType;
    }

    /**
     * Sets the <code>saturday</code> property.
     * <p>
     * 
     * @param pSaturday
     *            the current value of the <code>saturday</code> property.
     */
    public void setSaturday(final String pSaturday) {
        this.saturday = pSaturday;
    }

    /**
     * Sets the <code>specialInstructions</code> property.
     * <p>
     * 
     * @param pSpecialInstructions
     *            the current value of the <code>specialInstructions</code> property.
     */
    public void setSpecialInstructions(final String pSpecialInstructions) {
        this.specialInstructions = pSpecialInstructions;
    }

    /**
     * Sets the <code>startDate</code> property.
     * <p>
     * 
     * @param pStartDate
     *            the current value of the <code>startDate</code> property.
     */
    public void setStartDate(final Date pStartDate) {
        this.startDate = ContractUtility.getClonedDate(pStartDate);
    }

    /**
     * Sets the <code>stationRestrictionType</code> property.
     * <p>
     * 
     * @param pStationRestrictionType
     *            the current value of the <code>stationRestrictionType</code> property.
     */
    public void setStationRestrictionType(final StationRestrictionType pStationRestrictionType) {
        this.stationRestrictionType = pStationRestrictionType;
    }

    /**
     * Sets the <code>sunday</code> property.
     * <p>
     * 
     * @param pSunday
     *            the current value of the <code>sunday</code> property.
     */
    public void setSunday(final String pSunday) {
        this.sunday = pSunday;
    }

    /**
     * Sets the <code>thursday</code> property.
     * <p>
     * 
     * @param pThursday
     *            the current value of the <code>thursday</code> property.
     */
    public void setThursday(final String pThursday) {
        this.thursday = pThursday;
    }

    /**
     * Sets the <code>tuesday</code> property.
     * <p>
     * 
     * @param pTuesday
     *            the current value of the <code>tuesday</code> property.
     */
    public void setTuesday(final String pTuesday) {
        this.tuesday = pTuesday;
    }

    /**
     * Sets the <code>type</code> property.
     * <p>
     * 
     * @param pType
     *            the current value of the <code>type</code> property.
     */
    public void setType(final StationInfoRestrictionType pType) {
        this.type = pType;
    }

    /**
     * Sets the <code>wednesday</code> property.
     * <p>
     * 
     * @param pWednesday
     *            the current value of the <code>wednesday</code> property.
     */
    public void setWednesday(final String pWednesday) {
        this.wednesday = pWednesday;
    }
    
    /**
     * Gets the <code>check</code> property.
     * <p>
     * 
     * @return the current value of the <code>check</code> property.
     */

	public String getCheck() {
		return this.check;
	}
	
	  /**
     * Sets the <code>check</code> property.
     * <p>
     * 
     * @param pCheck
     *            the current value of the <code>check</code> property.
     */

	public void setCheck(final String pCheck) {
		this.check = pCheck;
	}

}
