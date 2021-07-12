/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>StationFacilityAttributeDto</code> contain details of StationFacilityAttributeDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>additionalInformation
 * <li>applicableIndicator
 * <li>label
 * <li>labelId
 * <li>labelOrder
 * <li>location
 * </code>
 * </ul>
 */
public class StationFacilityAttributeDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1200943030992401123L;

    /**
     * Attribute to hold <code>additionalInformation</code> property.
     */
    private String additionalInformation;

    /**
     * Attribute to hold <code>applicableIndicator</code> property.
     */
    private boolean applicableIndicator;

    /**
     * Attribute to hold <code>label</code> property.
     */
    private String label;

    /**
     * Attribute to hold <code>labelId</code> property.
     */
    private Long labelId;

    /**
     * Attribute to hold <code>labelOrder</code> property.
     */
    private int labelOrder;

    /**
     * Attribute to hold <code>location</code> property.
     */
    private String location;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Gets the <code>additionalInformation</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalInformation</code> property.
     */
    public String getAdditionalInformation() {
        return this.additionalInformation;
    }

    /**
     * Gets the <code>applicableIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>applicableIndicator</code> property.
     */
    public boolean getApplicableIndicator() {
        return this.applicableIndicator;
    }

    /**
     * Gets the <code>label</code> property.
     * <p>
     * 
     * @return the current value of the <code>label</code> property.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Gets the <code>labelId</code> property.
     * <p>
     * 
     * @return the current value of the <code>labelId</code> property.
     */
    public Long getLabelId() {
        return this.labelId;
    }

    /**
     * Gets the <code>labelOrder</code> property.
     * <p>
     * 
     * @return the current value of the <code>labelOrder</code> property.
     */
    public int getLabelOrder() {
        return this.labelOrder;
    }

    /**
     * Gets the <code>location</code> property.
     * <p>
     * 
     * @return the current value of the <code>location</code> property.
     */
    public String getLocation() {
        return this.location;
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
     * Sets the <code>additionalInformation</code> property.
     * <p>
     * 
     * @param pAdditionalInformation
     *            the current value of the <code>additionalInformation</code> property.
     */
    public void setAdditionalInformation(final String pAdditionalInformation) {
        this.additionalInformation = pAdditionalInformation;
    }

    /**
     * Sets the <code>applicableIndicator</code> property.
     * <p>
     * 
     * @param pApplicableIndicator
     *            the current value of the <code>applicableIndicator</code> property.
     */
    public void setApplicableIndicator(final boolean pApplicableIndicator) {
        this.applicableIndicator = pApplicableIndicator;
    }

    /**
     * Sets the <code>label</code> property.
     * <p>
     * 
     * @param pLabel
     *            the current value of the <code>label</code> property.
     */
    public void setLabel(final String pLabel) {
        this.label = pLabel;
    }

    /**
     * Sets the <code>labelId</code> property.
     * <p>
     * 
     * @param pLabelId
     *            the current value of the <code>labelId</code> property.
     */
    public void setLabelId(final Long pLabelId) {
        this.labelId = pLabelId;
    }

    /**
     * Sets the <code>labelOrder</code> property.
     * <p>
     * 
     * @param pLabelOrder
     *            the current value of the <code>labelOrder</code> property.
     */
    public void setLabelOrder(final int pLabelOrder) {
        this.labelOrder = pLabelOrder;
    }

    /**
     * Sets the <code>location</code> property.
     * <p>
     * 
     * @param pLocation
     *            the current value of the <code>location</code> property.
     */
    public void setLocation(final String pLocation) {
        this.location = pLocation;
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
}
