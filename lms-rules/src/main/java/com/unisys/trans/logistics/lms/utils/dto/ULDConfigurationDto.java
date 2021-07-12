/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.math.BigDecimal;

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
public class ULDConfigurationDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5570004837904839756L;

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

    /**
     * Attribute to hold <code>maxVolumeFloor</code> property.
     * <p>
     * This is the upper deck volume if the ULD category is U (Upper deck position) or T (Tall Upper Deck
     * position) or B (Both upper and lower deck position), or the lower deck volume if the ULD category is L
     * or C (Lower deck position or Lower deck container). The volume unit is MC.
     */
    private BigDecimal maxVolumeFloor;

    /**
     * Attribute to hold <code>maxVolumeLowerDeck</code> property.
     * <p>
     * This is the lower deck volume of the ULD. Mandatory if the ULD category is B; otherwise prohibited. The
     * volume unit is MC.
     */
    private BigDecimal maxVolumeLowerDeck;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

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
     * <code>Default constructor.</code>
     */
    public ULDConfigurationDto() {

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
     * Gets the <code>maxVolumeFloor</code> property.
     * <p>
     * This is the upper deck volume if the ULD category is U (Upper deck position) or T (Tall Upper Deck
     * position) or B (Both upper and lower deck position), or the lower deck volume if the ULD category is L
     * or C (Lower deck position or Lower deck container). The volume unit is MC.
     * <p>
     * <b>Format: </b><br>
     * 1-9[p]Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 4.300
     * <p>
     * 
     * @return the current value of the <code>maxVolumeFloor</code> property.
     */
    public BigDecimal getMaxVolumeFloor() {
        return this.maxVolumeFloor;
    }

    /**
     * Gets the <code>maxVolumeLowerDeck</code> property.
     * <p>
     * This is the lower deck volume of the ULD. Mandatory if the ULD category is B; otherwise prohibited. The
     * volume unit is MC.
     * <p>
     * <b>Format: </b><br>
     * 1-9[p]Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 20.800
     * <p>
     * 
     * @return the current value of the <code>maxVolumeLowerDeck</code> property.
     */
    public BigDecimal getMaxVolumeLowerDeck() {
        return this.maxVolumeLowerDeck;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
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
        this.aircraftType = ContractUtility.convertToUpperCase(pAircraftType);
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
     * Sets the <code>maxVolumeFloor</code> property.
     * <p>
     * This is the upper deck volume if the ULD category is U (Upper deck position) or T (Tall Upper Deck
     * position) or B (Both upper and lower deck position), or the lower deck volume if the ULD category is L
     * or C (Lower deck position or Lower deck container). The volume unit is MC.
     * <p>
     * <b>Format: </b><br>
     * 1-9[p]Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 4.300
     * <p>
     * 
     * @param pMaxVolumeFloor the new value of the <code>maxVolumeFloor</code> property.
     */
    public void setMaxVolumeFloor(final BigDecimal pMaxVolumeFloor) {
        this.maxVolumeFloor = pMaxVolumeFloor;
    }

    /**
     * Sets the <code>maxVolumeLowerDeck</code> property.
     * <p>
     * This is the lower deck volume of the ULD. Mandatory if the ULD category is B; otherwise prohibited. The
     * volume unit is MC.
     * <p>
     * <b>Format: </b><br>
     * 1-9[p] Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 20.800
     * 
     * @param pMaxVolumeLowerDeck the new value of the <code>maxVolumeLowerDeck</code> property.
     */
    public void setMaxVolumeLowerDeck(final BigDecimal pMaxVolumeLowerDeck) {
        this.maxVolumeLowerDeck = pMaxVolumeLowerDeck;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
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
     * Aircraft type and carried code cannot have duplicates for a specific ULD prefix which exists in the
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
