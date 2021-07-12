/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.TapeRateEntry;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>JointRate</code> contain details of JointRate.
 * <p>
 * This contains all information about JointRate.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>destinationCarrierCode
 * <li>oId
 * <li>originCode
 * <li>JointRateEntryDto
 * <li>currencyCode
 * <li>JointRateRoutingDto
 * </ul>
 */

public class JointRateDto extends TapeRateEntry {
    /**
     * Default Serial Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>currencyCode</code> property.
     */
    private String currencyCode;

    /**
     * Attribute to hold <code>destination</code> property.
     */
    private GeographicDataDto destination;

    /**
     * Attribute to hold <code>destinationCarrierCode</code> property.
     */
    private String destinationCarrierCode;

    /**
     * Attribute to hold list of<code>JointRateEntryDto</code> property.
     */
    private List<JointRateEntryDto> jointRateEntryDtos;

    /**
     * Attribute to hold list of<code>JointRateRoutingDto</code> property.
     */
    private List<JointRateRoutingDto> jointRateRoutingDtos;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>origin</code> property.
     */
    private GeographicDataDto origin;

    /**
     * Gets the <code>currencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha.
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @return the current value of the <code>currencyCode</code> property.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Gets the <code>destination</code> property.
     * <p>
     * 
     * @return the current value of the <code>destination</code> property.
     */

    public GeographicDataDto getDestination() {
        if (this.destination == null) {
            this.destination = new GeographicDataDto();
        }
        return this.destination;
    }

    /**
     * Gets the <code>destinationCarrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * UW.
     * <p>
     * 
     * @return the current value of the <code>destinationCarrierCode</code> property.
     */

    public String getDestinationCarrierCode() {
        return this.destinationCarrierCode;
    }

    /**
     * Gets the list of<code>JointRateEntryDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>jointRateEntryDto</code> property.
     */
    public List<JointRateEntryDto> getJointRateEntryDtos() {
        if (this.jointRateEntryDtos == null) {
            this.jointRateEntryDtos = new ArrayList<JointRateEntryDto>();
        }
        return this.jointRateEntryDtos;
    }

    /**
     * Gets the list of<code>JointRateRoutingDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>jointRateRoutingDto</code> property.
     */
    public List<JointRateRoutingDto> getJointRateRoutingDtos() {
        if (this.jointRateRoutingDtos == null) {
            this.jointRateRoutingDtos = new ArrayList<JointRateRoutingDto>();
        }

        return this.jointRateRoutingDtos;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>origin</code> property.
     * <p>
     * 
     * @return the current value of the <code>origin</code> property.
     */

    public GeographicDataDto getOrigin() {
        if (this.origin == null) {
            this.origin = new GeographicDataDto();
        }
        return this.origin;
    }

    /**
     * Sets the <code>currencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha.
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @param pCurrencyCode
     *            the current value of the <code>currencyCode</code> property.
     */
    public void setCurrencyCode(final String pCurrencyCode) {
        this.currencyCode = ContractUtility.convertToUpperCase(pCurrencyCode);
    }

    /**
     * Sets the <code>destination</code> property.
     * <p>
     * 
     * @param pDestination
     *            the current value of the <code>destination</code> property.
     */
    public void setDestination(final GeographicDataDto pDestination) {
        this.destination = pDestination;
    }

    /**
     * Sets the <code>destinationCarrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * UW.
     * <p>
     * 
     * @param pDestinationCarrierCode
     *            the current value of the <code>destinationCarrierCode</code> property.
     */
    public void setDestinationCarrierCode(final String pDestinationCarrierCode) {
        this.destinationCarrierCode = ContractUtility.convertToUpperCase(pDestinationCarrierCode);
    }

    /**
     * Sets the list of<code>JointRateEntryDto</code> property.
     * <p>
     * 
     * @param pJointRateEntryDto
     *            the current value of the <code>jointRateEntryDto</code> property.
     */

    public void setJointRateEntryDtos(
                final List<JointRateEntryDto> pJointRateEntryDto) {
        this.jointRateEntryDtos = pJointRateEntryDto;
    }

    /**
     * Sets the list of<code>JointRateRoutingDto</code> property.
     * <p>
     * 
     * @param pJointRateRoutingDto
     *            the current value of the <code>jointRateRoutingDto</code> property.
     */
    public void setJointRateRoutingDtos(final List<JointRateRoutingDto> pJointRateRoutingDto) {
        this.jointRateRoutingDtos = pJointRateRoutingDto;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>origin</code> property.
     * <p>
     * 
     * @param pOrigin
     *            the current value of the <code>origin</code> property.
     */
    public void setOrigin(final GeographicDataDto pOrigin) {
        this.origin = pOrigin;
    }

}