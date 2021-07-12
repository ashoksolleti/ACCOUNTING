/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.ContactDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.OfficeStatusType;
import com.unisys.trans.logistics.lms.utils.dto.constants.OfficeType;

/**
 * <code>OfficeDto</code> holds all the information corresponding to an office.
 * <p>
 * An Office defines the location from where the actor works on the system. Office information contains
 * details regarding office queues, print devices etc. An office is associated to a city or an airport and can
 * be either in a Active state or Inactive state. <br>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>activeIndicator
 * <li>address
 * <li>alternateOffice
 * <li>officeDesignator
 * <li>officeIdentifier
 * <li>officeType
 * <li>stationCode </code>
 * </ul>
 */

public class OfficeDto extends PersistenceObjectDto {

    /**
     * Generated serial version added. add a valid serial version id.
     */
    private static final long serialVersionUID = 8917122402528392330L;

    /**
     * Attribute to hold <code>activeIndicator</code> property.
     * <p>
     * Indicates whether the Office Status is Active or Inactive.
     * <p>
     * <b>Possible Values:</b>
     * <ul>
     * <li>A - Active Office
     * <li>I - Inactive Office
     * </ul>
     */
    private OfficeStatusType activeIndicator;

    /**
     * Attribute to hold <code>address</code> property.
     * <p>
     * This refers to a collection <code>ContactDto</code> which holds the address information.
     */
    private ContactDto address;

    /**
     * Attribute to hold <code>alternateOffice</code> property.
     * <p>
     * This office is used to queue information to when this one is inactive or on hold.
     */
    private String alternateOffice;

    /**
     * Attribute to hold <code>officeDesignator</code> property.
     * <p>
     * Used to compose character 4 and 5 of a seven character SITA address for the office.
     */
    private String officeDesignator;

    /**
     * Attribute to hold <code>officeIdentifier</code> property.
     * <p>
     * Unique identifier of an office.o
     */
    private String officeIdentifier;

    /**
     * Attribute to hold <code>officeType</code> property.
     * <p>
     * This is of the <code>OfficeType</code>.
     * <p>
     * <b>Possible Value:</b><br>
     * <li>D - Default Office for the station.
     */
    private OfficeType officeType;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;

    /**
     * Attribute to hold <code>stationCode</code> property of an office.
     * <p>
     * This can be an airport or city.
     */
    private String stationCode;

    /**
     * <code>Default Constructor.</code>
     */
    public OfficeDto() {
    }

    /**
     * Gets the <code>activeIndicator</code> property.
     * <p>
     * Indicates whether the Office Status is Active or Inactive.
     * <p>
     * 
     * @return the current value of the <code>activeIndicator</code> property.<br>
     */
    public OfficeStatusType getActiveIndicator() {
        return this.activeIndicator;
    }

    /**
     * Gets the <code>address</code> information for an office.
     * <p>
     * This refers to a collection <code>ContactDto</code> which holds the address information.
     * <p>
     * 
     * @return the current list of <code>ContactDto</code>.
     */
    public ContactDto getAddress() {
        if (this.address == null) {
            this.address = new ContactDto();
        }
        return this.address;
    }

    /**
     * Gets the <code>alternateOffice</code> property.
     * <p>
     * Used to queue information to when this one is inactive or on hold.
     * <p>
     * <b>Format : </b><br>
     * 1-20 Alphanumeric
     * <p>
     * <b>Example : </b><br>
     * MSPRC
     * <p>
     * 
     * @return the current value of the <code>alternateOffice</code> property.
     */
    public String getAlternateOffice() {
        return this.alternateOffice;
    }

    /**
     * Gets the <code>officeDesignator</code> property .
     * <p>
     * Used to compose character 4 and 5 of a seven character SITA address for the office.
     * <p>
     * <b>Format:</b><br>
     * 2 Alphabetic(Upper Case)
     * <p>
     * <b>Example:</b><br>
     * RC
     * <p>
     * 
     * @return the current value of the <code>OfficeDesignator</code> of an office.<br>
     */
    public String getOfficeDesignator() {
        return this.officeDesignator;
    }

    /**
     * Gets the <code>officeIdentifier</code> property.
     * <p>
     * Unique identifier of an office.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric
     * <p>
     * <b>Example:</b><br>
     * MSP001
     * <p>
     * 
     * @return the current value of the <code>OfficeIdentifier</code> of an office.<br>
     */
    public String getOfficeIdentifier() {
        return this.officeIdentifier;
    }

    /**
     * Gets the <code>officeType</code> property.
     * <p>
     * Specifies the type of office.
     * <p>
     * 
     * @return the current value of <code>officeType</code> property.
     */
    public OfficeType getOfficeType() {
        return this.officeType;
    }

    /**
     * Gets the value of <code>OID</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>stationCode</code> property.
     * <p>
     * This can be an airport or city.
     * <p>
     * <b>Format : </b><br>
     * 3 Alphabetic.
     * <p>
     * <b>Example : </b><br>
     * MSP.
     * <p>
     * 
     * @return the current value of <code>stationCode</code> property.<br>
     */
    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * Sets the <code>activeIndicator</code> property.
     * <p>
     * Indicates whether the Office Status is Active or Inactive.
     * <p>
     * 
     * @param pActiveIndicator the new value of <code>activeIndicator</code> property for an office.<br>
     */
    public void setActiveIndicator(final OfficeStatusType pActiveIndicator) {
        this.activeIndicator = pActiveIndicator;
    }

    /**
     * Sets the <code>address</code> information for an office.
     * <p>
     * 
     * @param pAddress the new list of <code>ContactDto</code>.
     */
    public void setAddress(final ContactDto pAddress) {
        this.address = pAddress;
    }

    /**
     * Sets the <code>alternateOffice</code> property.
     * <p>
     * Used to queue information to when this one is inactive or on hold.
     * <p>
     * <b>Format : </b><br>
     * 1-20 Alphanumeric
     * <p>
     * <b>Example : </b><br>
     * MSPRC
     * <p>
     * 
     * @param pAlternateOffice the new value of <code>alternateOffice</code> property.<br>
     */
    public void setAlternateOffice(final String pAlternateOffice) {
        this.alternateOffice = ContractUtility.convertToUpperCase(pAlternateOffice);
    }

    /**
     * Sets the <code>officeDesignator</code> property.
     * <p>
     * Used to compose character 4 and 5 of a seven character SITA address for the office.
     * <p>
     * <b>Format:</b><br>
     * 2 Alphabetic(Upper Case)
     * <p>
     * <b>Example:</b><br>
     * RC
     * <p>
     * 
     * @param pOfficeDesignator the new value of <code>officeDesignator</code> of the office.<br>
     */
    public void setOfficeDesignator(final String pOfficeDesignator) {
        this.officeDesignator = ContractUtility.convertToUpperCase(pOfficeDesignator);
    }

    /**
     * Sets the <code>officeIdentifier</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric.
     * <p>
     * <b>Example:</b><br>
     * MSP001.
     * <p>
     * 
     * @param pOfficeIdentifier the new value of <code>officeIdentifier</code> of the office.
     */
    public void setOfficeIdentifier(final String pOfficeIdentifier) {
        this.officeIdentifier = ContractUtility.convertToUpperCase(pOfficeIdentifier);
    }

    /**
     * Sets the <code>officeType</code> property.
     * <p>
     * Specifies the type of office.
     * <p>
     * 
     * @param pOfficeType the new value of <code>officeType</code> property.
     */
    public void setOfficeType(final OfficeType pOfficeType) {
        this.officeType = pOfficeType;
    }

    /**
     * Sets the value of the <code>OID</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>OID</code> property.<br>
     */

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>stationCode</code> property.
     * <p>
     * This can be an airport or city.
     * <p>
     * <b>Format : </b><br>
     * 3 Alphabetic.
     * <p>
     * <b>Example : </b><br>
     * MSP.
     * <p>
     * 
     * @param pStationCode the new value of <code>stationCode</code> of the office.
     */

    public void setStationCode(final String pStationCode) {
        this.stationCode = ContractUtility.convertToUpperCase(pStationCode);
    }

}
