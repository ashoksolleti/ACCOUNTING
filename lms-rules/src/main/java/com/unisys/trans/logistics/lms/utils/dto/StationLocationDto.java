/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.ContactDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>StationLocationDto</code> contain details of StationLocationDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>locationType
 * <li>mailingAddressDto
 * <li>mailingSameAsPhysical
 * <li>oId
 * <li>physicalAddressDto
 * <li>stationControlIndicator
 * </code>
 * </ul>
 */

public class StationLocationDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5989926213184261337L;

    /**
     * Attribute to hold <code>locationType</code> property.
     */
    private String locationType;

    /**
     * Attribute to hold <code>mailingAddressDto</code> property.
     */
    private ContactDto mailingAddressDto;

    /**
     * Attribute to hold <code>mailingSameAsPhysical</code> property.
     */
    private boolean mailingSameAsPhysical;

    /**
     * Attribute to hold <code>oId</code> property. Unique identifier for
     * station
     */
    private Long oId;

    /**
     * Attribute to hold <code>physicalAddressDto</code> property.
     */
    private ContactDto physicalAddressDto;

    /**
     * Attribute to hold <code>stationControlIndicator</code> property.
     */
    private boolean stationControlIndicator;

    /**
     * Gets the <code>locationType</code> property.
     * <p>
     * 
     * @return the current value of the <code>locationType</code> property.
     */
    public String getLocationType() {
        return this.locationType;
    }

    /**
     * Gets the {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto
     * ContactDto} containing <code>ContactDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>mailingAddressDto</code> property.
     */
    public ContactDto getMailingAddressDto() {
        if (this.mailingAddressDto == null) {
            this.mailingAddressDto = new ContactDto();
        }
        return this.mailingAddressDto;
    }

    /**
     * Gets the <code>mailingSameAsPhysical</code> property.
     * <p>
     * 
     * @return the current value of the <code>mailingSameAsPhysical</code> property.
     */
    public boolean getMailingSameAsPhysical() {
        return this.mailingSameAsPhysical;
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
     * Gets the {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto
     * ContactDto} containing <code>ContactDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>physicalAddressDto</code> property.
     */
    public ContactDto getPhysicalAddressDto() {
        if (this.physicalAddressDto == null) {
            this.physicalAddressDto = new ContactDto();
        }
        return this.physicalAddressDto;
    }

    /**
     * Gets the <code>stationControlIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>stationControlIndicator</code> property.
     */
    public boolean getStationControlIndicator() {
        return this.stationControlIndicator;
    }

    /**
     * Sets the <code>locationType</code> property.
     * <p>
     * 
     * @param pLocationType
     *            the current value of the <code>locationType</code> property.
     */
    public void setLocationType(final String pLocationType) {
        this.locationType = pLocationType;
    }

    /**
     * Sets the <code>mailingAddressDto</code> property.
     * <p>
     * 
     * @param pMailingAddressDto
     *            the current value of the <code>mailingAddressDto</code> property.
     */
    public void setMailingAddressDto(final ContactDto pMailingAddressDto) {
        this.mailingAddressDto = pMailingAddressDto;
    }

    /**
     * Sets the <code>mailingSameAsPhysical</code> property.
     * <p>
     * 
     * @param pMailingSameAsPhysical
     *            the current value of the <code>mailingSameAsPhysical</code> property.
     */
    public void setMailingSameAsPhysical(final boolean pMailingSameAsPhysical) {
        this.mailingSameAsPhysical = pMailingSameAsPhysical;
    }

    /**
     * Sets the value of the <code>OID</code> property.
     * <p>
     * Unique identifier for station.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>OID</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>physicalAddressDto</code> property.
     * <p>
     * 
     * @param pPhysicalAddressDto
     *            the current value of the <code>physicalAddressDto</code> property.
     */
    public void setPhysicalAddressDto(final ContactDto pPhysicalAddressDto) {
        this.physicalAddressDto = pPhysicalAddressDto;
    }

    /**
     * Sets the <code>stationControlIndicator</code> property.
     * <p>
     * 
     * @param pStationControlIndicator
     *            the current value of the <code>stationControlIndicator</code> property.
     */
    public void setStationControlIndicator(
                final boolean pStationControlIndicator) {
        this.stationControlIndicator = pStationControlIndicator;
    }

}
