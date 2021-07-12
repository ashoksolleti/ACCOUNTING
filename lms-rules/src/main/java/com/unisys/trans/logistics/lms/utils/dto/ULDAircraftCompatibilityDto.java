/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ULDConfiguration</code> holds all the attributes that are associated to the ULD configuration.
 * <p>
 * This contains the following attributes: <code>
 * <ul>
 * <li>aircraftType
 * <li>carrierCode
 * <li>maxVolumeFloor
 * <li>maxVolumeLowerDeck
 * <li>oId
 * <li>position
 * <li>uldCategory
 * <li>uldPrefix
 * </ul>
 * </code>
 */
public class ULDAircraftCompatibilityDto {

    /**
     * Attribute to hold <code>aircraftType</code> property.
     * <p>
     * Indicates the Aircraft type for a ULDPrefix.
     */
    private String aircraftType;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     * <p>
     * Indicates the Carrier code of the aircraft.
     */
    private String carrierCode;

    private boolean compatible;

    /**
     * Attribute to hold <code>position</code> property.
     * <p>
     * The number of ULD positions that a single ULD can occupy.
     */
    private int position;

    /**
     * Attribute to hold <code>uldCategory</code> property.
     * <p>
     * The possible values are:
     * <ul>
     * <li>U - Upper deck position.
     * <li>T - Tall upper deck position.
     * <li>L - Lower deck position.
     * <li>B - Both upper and lower deck position.
     * <li>C - Lower deck container.
     * </ul>
     */
    private String uldCategory;

    /**
     * Attribute to hold <code>uldPrefix</code> property.
     * <p>
     * Aircraft type and carrier code cannot have duplicates for a specific ULD prefix which exists in the
     * system.
     */
    private String uldPrefix;

    /**
     * Default Constructor.
     * <p>
     */
    public ULDAircraftCompatibilityDto() {

    }

    /**
     * Parameterized Constructor.
     * <p>
     * 
     * @param pAircraftType holds the aircraft type.
     * @param pPosition holds the capacity position.
     * @param pULDCategory holds the ULDs category.
     */
    public ULDAircraftCompatibilityDto(final String pAircraftType, final int pPosition,
                final String pULDCategory) {

        this.aircraftType = pAircraftType;
        this.position = pPosition;
        this.uldCategory = pULDCategory;
    }

    /**
     * Gets the <code>aircraftType</code> property.
     * <p>
     * Indicates the Aircraft type for a ULDPrefix.
     * <p>
     * <b>Format: </b><br>
     * 3 AlphaNumeric<br>
     * <p>
     * <b>Example: </b><br>
     * 70A
     * <p>
     * 
     * @return the current value of the <code>aircraftType</code> property.
     */
    public String getAircraftType() {
        return this.aircraftType;
    }

    /**
     * Gets the <code>carrierCode</code> property.
     * <p>
     * Indicates the Carrier code of the aircraft.
     * <p>
     * <b>Format: </b><br>
     * 3 AlphaNumeric<br>
     * <p>
     * <b>Example: </b><br>
     * UW
     * <p>
     * 
     * @return the current value of the <code>carrierCode</code> property.
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the <code>position</code> property.
     * <p>
     * The number of ULD positions that a single ULD can occupy.
     * <p>
     * <b>Format: </b><br>
     * 1 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 1
     * <p>
     * 
     * @return the current value of the <code>position</code> property.
     */
    public int getPosition() {
        return this.position;
    }

    /**
     * Gets the <code>uldCategory</code> property.
     * <p>
     * The possible values are:
     * <ul>
     * <li>U - Upper deck position.
     * <li>T - Tall upper deck position.
     * <li>L - Lower deck position.
     * <li>B - Both upper and lower deck position.
     * <li>C - Lower deck container.
     * </ul>
     * <p>
     * <b>Format: </b><br>
     * 32 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * U
     * <p>
     * 
     * @return the current value of the <code>uldCategory</code> property.
     */
    public String getUldCategory() {
        return this.uldCategory;
    }

    /**
     * Gets the <code>uldPrefix</code> property.
     * <p>
     * Aircraft type and carrier code cannot have duplicates for a specific ULD prefix which exists in the
     * system.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * AVE
     * <p>
     * 
     * @return the current value of the <code>uldPrefix</code> property.
     */
    public String getUldPrefix() {
        return this.uldPrefix;
    }

    /**
     * Gets the <code>compatible</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true:</code><br>
     * If the aircraft type and uld is compatible<br>
     * <li><code>false:</code> <br>
     * If the aircraft type and uld is incompatible.<br>
     * <p>
     * 
     * @return the current value of the <code>compatible</code> property.<br>
     */
    public boolean isCompatible() {
        return this.compatible;
    }

    /**
     * Sets the <code>aircraftType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 AlphaNumeric<br>
     * <p>
     * <b>Example: </b><br>
     * 70A
     * <p>
     * 
     * @param pAircraftType the new value of the <code>aircraftType</code> property.
     */
    public void setAircraftType(final String pAircraftType) {
        this.aircraftType = pAircraftType;
    }

    /**
     * Sets the <code>carrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 AlphaNumeric<br>
     * <p>
     * <b>Example: </b><br>
     * UW
     * <p>
     * 
     * @param pCarrierCode the new value of the <code>carrierCode</code> property.
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = ContractUtility.convertToUpperCase(pCarrierCode);
    }

    /**
     * Sets the <code>compatible</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true:</code><br>
     * If the aircraft type and uld is compatible<br>
     * <li><code>false:</code> <br>
     * If the aircraft type and uld is incompatible.<br>
     * <p>
     * 
     * @param pCompatible the new value of the <code>compatible</code> property.<br>
     */
    public void setCompatible(final boolean pCompatible) {
        this.compatible = pCompatible;
    }

    /**
     * Sets the <code>position</code> property.
     * <p>
     * The number of ULD positions that a single ULD can occupy.
     * <p>
     * <b>Format: </b><br>
     * 1 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 1
     * <p>
     * 
     * @param pPosition the new value of the <code>position</code> property.
     */
    public void setPosition(final int pPosition) {
        this.position = pPosition;
    }

    /**
     * Sets the <code>uldCategory</code> property.
     * <p>
     * The possible values are:
     * <ul>
     * <li>U - Upper deck position.
     * <li>T - Tall upper deck position.
     * <li>L - Lower deck position.
     * <li>B - Both upper and lower deck position.
     * <li>C - Lower deck container.
     * </ul>
     * <p>
     * <b>Format: </b><br>
     * 32 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * U
     * <p>
     * 
     * @param pULDCategory the new value of the <code>uldCategory</code> property.
     */
    public void setUldCategory(final String pULDCategory) {
        this.uldCategory = pULDCategory;
    }

    /**
     * Sets the <code>uldPrefix</code> property.
     * <p>
     * Aircraft type and carrier code cannot have duplicates for a specific ULD prefix which exists in the
     * system.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * LLB
     * <p>
     * 
     * @param pULDPrefix the new value of the <code>uldPrefix</code> property.
     */
    public void setUldPrefix(final String pULDPrefix) {
        this.uldPrefix = ContractUtility.convertToUpperCase(pULDPrefix);
    }

}
