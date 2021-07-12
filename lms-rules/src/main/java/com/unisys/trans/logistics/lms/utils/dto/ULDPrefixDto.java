/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

/**
 * <code>ULDPrefixDto</code> contains contains specific data applicable to the ULD prefix / carrier code.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>carrierCode
 * <li>contour
 * <li>manufacturerCode
 * <li>maximumGrossWeight
 * <li>maximumVolume
 * <li>oId
 * <li>startStation
 * <li>uldGroup
 * <li>uldPrefixName
 * <li>uldSerialRange
 * <li>uldSerialRanges
 * </code>
 * </ul>
 */
public class ULDPrefixDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3024819247099976217L;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     * <p>
     * It is the airline carrier code.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>contour</code> property.
     * <p>
     * Contour of the container.
     */
    private String contour;

    /**
     * Attribute to hold <code>manufacturerCode</code> property.
     * <p>
     * Indicates the manufacturer of the ULD.
     */
    private String manufacturerCode;

    /**
     * Attribute to hold <code>maximumGrossWeight</code> property.
     * <p>
     * Maximum gross weight of the ULD (includes Tare weight).
     */
    private BigDecimal maximumGrossWeight;

    /**
     * Attribute to hold <code>maximumVolume</code> property.
     * <p>
     * Maximum gross volume allowed for the ULD prefix.
     */
    private BigDecimal maximumVolume;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * It is the sequence generated from UldPrefixName.
     */
    private Long oId;

    /**
     * Attribute to hold <code>startStation</code> property.
     * <p>
     * Station to which the ULD prefix/Serial Ranges are linked to.
     */
    private String startStation;

    /**
     * Attribute to hold <code>uldGroup</code> property.
     * <p>
     * Group number of the ULD prefix.
     */
    private Integer uldGroup;

    /**
     * Attribute to hold <code>uldPrefixName</code> property.
     * <p>
     * ULD prefix and Carrier Code combination is unique.
     */
    private String uldPrefixName;

    /**
     * Attribute to hold <code>uldSerialRanges</code> property.
     * <p>
     * UldSerialRange entity contains start value, end value and tare weight.
     */

    private ULDSerialRangeDto uldSerialRange;

    /**
     * Attribute to hold <code>uldSerialRanges</code> property.
     * <p>
     * The attribute to hold the list of ULD Serial Ranges associated with the prefix.UldSerialRange entity
     * contains start value, end value and tare weight.
     */

    private Collection<ULDSerialRangeDto> uldSerialRanges;

    /**
     * <code>Default Constructor.</code>
     */
    public ULDPrefixDto() {

    }

    /**
     * <code>Parameterized Constructor.</code>
     * <p>
     * 
     * @param pUldPrefixName contains ULD prefix name.
     */
    public ULDPrefixDto(final String pUldPrefixName) {
        this.uldPrefixName = pUldPrefixName;
    }

    /**
     * It takes a <code>UldSerialRangeDto</code> data transfer object as an argument and adds it to the list.
     * <p>
     * All the serial ranges associated with a UldPrefix are maintained in a list.
     * <p>
     * 
     * @param pUldSerialRangeDto the ULD serial range data transfer object.
     */
    public void addUldSerialRange(final ULDSerialRangeDto pUldSerialRangeDto) {

        if (this.uldSerialRanges == null) {

            this.uldSerialRanges = new ArrayList<ULDSerialRangeDto>();
            this.uldSerialRanges.add(pUldSerialRangeDto);
        }
        else {
            this.uldSerialRanges.add(pUldSerialRangeDto);
        }
    }

    /**
     * Gets the <code>carrierCode</code> property.
     * <p>
     * It is the airline carrier code.
     * <p>
     * <b>Format: </b><br>
     * 2-3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * LH - Lufthansa
     * <p>
     * 
     * @return the current value of the <code>carrierCode</code> property.
     */
    public java.lang.String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the <code>contour</code> property.
     * <p>
     * Contour of the container.
     * <p>
     * <b>Format: </b><br>
     * 1 - 2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 0, A1, 1A, 11, A
     * <p>
     * 
     * @return the current value of the <code>contour</code> property.
     */
    public java.lang.String getContour() {
        return this.contour;
    }

    /**
     * Gets the <code>manufacturerCode</code> property.
     * <p>
     * Indicates the manufacturer of the ULD
     * <p>
     * <b>Format: </b><br>
     * 2 Any Keyboard character. <b>Example: </b><br>
     * AA
     * <p>
     * 
     * @return the current value of the <code>manufacturerCode</code> property.
     */
    public String getManufacturerCode() {
        return this.manufacturerCode;
    }

    /**
     * Gets the <code>maximumGrossWeight</code> property.
     * <p>
     * Maximum gross weight of the ULD (includes Tare). Minimum value = 0.0 ;Maximum value = 99999.9.
     * <p>
     * <b>Format: </b><br>
     * 7.1F
     * <p>
     * <b>Example: </b><br>
     * 9999.9, 0.0
     * <p>
     * 
     * @return the current value of the <code>maximumGrossWeight</code> property.
     */
    public BigDecimal getMaximumGrossWeight() {
        return this.maximumGrossWeight;
    }

    /**
     * Gets the <code>maximumVolume</code> property.
     * <p>
     * Maximum Gross volume allowed for the ULD prefix .Total 9 digits inclusive of decimal point. Minimum
     * value = 0.00 Maximum value = 999999.99
     * <p>
     * <b>Format: </b><br>
     * 9.2F Total 9 digits inclusive of decimal point(Contains two digits after decimal point).
     * <p>
     * <b>Example: </b><br>
     * 999999.99
     * <p>
     * 
     * @return the current value of the <code>maximumVolume</code> property.
     */
    public BigDecimal getMaximumVolume() {
        return this.maximumVolume;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique identifier.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>startStation</code> property.
     * <p>
     * Station to which the ULD prefix/Serial Ranges are linked to .
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * FRA
     * <p>
     * 
     * @return the current value of the <code>startStation</code> property.
     */
    public String getStartStation() {
        return this.startStation;
    }

    /**
     * Gets the <code>uldGroup</code> property.
     * <p>
     * Group number of the ULD prefix.
     * <p>
     * <b>Format: </b><br>
     * 2 Numeric
     * <p>
     * <b>Example: </b><br>
     * 12
     * <p>
     * 
     * @return the current value of the <code>uldGroup</code> property.
     */
    public Integer getUldGroup() {
        return this.uldGroup;
    }

    /**
     * Gets the <code>uldPrefixName</code> property.
     * <p>
     * ULD prefix for which the serial ranges display has been requested
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric.
     * <p>
     * <b>Example: </b><br>
     * AKE
     * <p>
     * 
     * @return the current value of the <code>uldPrefixName</code> property.
     */
    public java.lang.String getUldPrefixName() {
        return this.uldPrefixName;
    }

    /**
     * Gets the <code>uldSerialRange</code> property.
     * <p>
     * 
     * @return the current value of <code>uldSerialRange</code> property.
     */
    public ULDSerialRangeDto getUldSerialRange() {
        return this.uldSerialRange;
    }

    /**
     * Gets the <code>uldSerialRanges</code> property.
     * <p>
     * 
     * @return the current value of list of <code>uldSerialRanges</code> property.
     */
    public Collection<ULDSerialRangeDto> getUldSerialRanges() {
        return this.uldSerialRanges;
    }

    /**
     * Sets the <code>carrierCode</code> property.
     * <p>
     * It is the airline carrier code.
     * <p>
     * <b>Format: </b><br>
     * 2-3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * LH - Lufthansa
     * <p>
     * 
     * @param pCarrierCode the new value of the <code>carrierCode</code>.
     */
    public void setCarrierCode(final java.lang.String pCarrierCode) {
        this.carrierCode = ContractUtility.convertToUpperCase(pCarrierCode);

    }

    /**
     * Sets the <code>contour</code> property.
     * <p>
     * Contour of the container.
     * <p>
     * <p>
     * <b>Format: </b><br>
     * 1 - 2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 0, A1, 1A, 11, A
     * <p>
     * 
     * @param pContour the new value of the <code>contour</code>.
     */
    public void setContour(final java.lang.String pContour) {
        this.contour = ContractUtility.convertToUpperCase(pContour);
    }

    /**
     * Sets the <code>manufacturerCode.</code>
     * <p>
     * 
     * @param pManufacturerCode the new value of the <code>manufacturerCode</code> property.
     */
    public void setManufacturerCode(final String pManufacturerCode) {

        this.manufacturerCode = ContractUtility.convertToUpperCase(pManufacturerCode);
    }

    /**
     * Sets the <code>maximumGrossWeight</code> property.
     * <p>
     * Maximum gross weight of the ULD (includes Tare). Minimum value = 0.0 ;Maximum value = 99999.9.
     * <p>
     * <b>Format: </b><br>
     * 7.1F
     * <p>
     * <b>Example: </b><br>
     * 9999.9, 0.0
     * <p>
     * 
     * @param pMaximumGrossWeight the new value of the <code>maximumGrossWeight</code>.
     */
    public void setMaximumGrossWeight(final BigDecimal pMaximumGrossWeight) {
        this.maximumGrossWeight = pMaximumGrossWeight;
    }

    /**
     * Sets the <code>maximumVolume</code> property.
     * <p>
     * Maximum Gross volume allowed for the ULD prefix .Total 9 digits inclusive of decimal point. Minimum
     * value = 0.00 Maximum value = 999999.99
     * <p>
     * <b>Format: </b><br>
     * 9.2F Total 9 digits inclusive of decimal point(Contains two digits after decimal point).
     * <p>
     * <b>Example: </b><br>
     * 999999.99
     * <p>
     * 
     * @param pMaximumVolume the new value of the <code>maximumVolume</code>.
     */
    public void setMaximumVolume(final BigDecimal pMaximumVolume) {
        this.maximumVolume = pMaximumVolume;
    }

    /**
     * Sets the <code>oId.</code>
     * <p>
     * Unique identifier.
     * <p>
     * 
     * @param pId the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pId) {
        this.oId = pId;
    }

    /**
     * Sets the <code>startStation</code> property.
     * <p>
     * Station to which the ULD prefix/Serial Ranges are linked to.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * FRA
     * <p>
     * 
     * @param pStartStation the new value of the <code>startStation</code> property.
     */
    public void setStartStation(final String pStartStation) {

        this.startStation = ContractUtility.convertToUpperCase(pStartStation);
    }

    /**
     * Sets the <code>uldSerialRanges.</code>
     * <p>
     * Group number of the ULD prefix.
     * <p>
     * <b>Format: </b><br>
     * 2 Numeric
     * <p>
     * <b>Example: </b><br>
     * 12
     * <p>
     * 
     * @param pUldGroup the new value of the <code>uldGroup</code> property.
     */
    public void setUldGroup(final Integer pUldGroup) {
        this.uldGroup = pUldGroup;
    }

    /**
     * Sets the <code>uldPrefixName</code> property.
     * <p>
     * ULD prefix for which the serial ranges display has been requested
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric.
     * <p>
     * <b>Example: </b><br>
     * AKE
     * <p>
     * 
     * @param pUldPrefixName the new value of the <code>uldPrefixName</code> property.
     */
    public void setUldPrefixName(final java.lang.String pUldPrefixName) {
        this.uldPrefixName = ContractUtility.convertToUpperCase(pUldPrefixName);
    }

    /**
     * Sets the <code>uldSerialRange</code> property.
     * <p>
     * 
     * @param pUldSerialRangeDto the new value of the <code>uldSerialRange</code> property.
     */
    public void setUldSerialRange(final ULDSerialRangeDto pUldSerialRangeDto) {
        this.uldSerialRange = pUldSerialRangeDto;
    }

    /**
     * Sets the list of <code>uldSerialRanges</code> property.
     * <p>
     * 
     * @param pUldSerialRanges the new value of list of <code>uldSerialRanges</code> property.
     */

    public void setUldSerialRanges(final Collection<ULDSerialRangeDto> pUldSerialRanges) {
        this.uldSerialRanges = pUldSerialRanges;
    }

}
