/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>TTYAddressProfileParticipantDto</code> contains participant details required by Teletype address
 * profile.<br>
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>billingAccountNumber1</code></li>
 * <li><code>name</code></li>
 * <li><code>oId</code></li>
 * <li><code>stationCode</code></li>
 * <li><code>messageProfileName</code></li>
 * </ul>
 */
public class TTYAddressProfileParticipantDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8962328450241593518L;

    /**
     * Attribute to hold <code>billingAccountNumber1</code> property. Only users with special privileges can
     * update this field.
     */
    private String billingAccountNumber1;

    /**
     * Attribute to hold <code>messageProfileName</code> property. This is a link to the Message Sender record
     * is required for the system to send automatic Freight Status Update (FSU) messages or emails to the
     * participant.
     */
    private String messageProfileName;

    /**
     * Attribute to hold <code>name</code> property.
     */
    private String name;

    /**
     * Attribute to hold <code>oId</code> property. Unique key reference for participant entity.
     */
    private Long oId;

    /**
     * Attribute to hold <code>stationCode</code> property. Must be validated against the station and city
     * table.
     */
    private String stationCode;

    /**
     * <code>Default constructor.</code>
     */
    public TTYAddressProfileParticipantDto() {

    }

    /**
     * <code>Parameterised constructor.</code>
     * <p>
     * 
     * @param pOId <code>Long</code><br>
     * @param pName <code>String</code><br>
     * @param pStationCode <code>String</code><br>
     * @param pBillingAccountNumber1 <code>String</code><br>
     * @param pMessageProfileName <code>String</code><br>
     *            </p>
     */
    public TTYAddressProfileParticipantDto(final Long pOId, final String pName, final String pStationCode,
                final String pBillingAccountNumber1, final String pMessageProfileName) {
        this.oId = pOId;
        this.name = pName;
        this.stationCode = pStationCode;
        this.billingAccountNumber1 = pBillingAccountNumber1;
        this.messageProfileName = pMessageProfileName;
    }

    /**
     * Gets the value of the <code>billingAccountNumber1</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <b>Example: </b><br>
     * 123456
     * 
     * @return <code>String</code><br>
     *         Returns the <code>billingAccountNumber1</code> of the participant.<br>
     *         </p>
     */
    public final String getBillingAccountNumber1() {
        return this.billingAccountNumber1;
    }

    /**
     * Gets the value of the <code>messageProfileName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric<br>
     * <b>Example: </b><br>
     * MSPRCUW
     * 
     * @return <code>String</code><br>
     *         Returns the <code>messageProfileName</code> property.<br>
     *         </p>
     */
    public final String getMessageProfileName() {
        return this.messageProfileName;
    }

    /**
     * Gets the value of the <code>name</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <b>Example: </b><br>
     * UNISYS
     * 
     * @return <code>String</code><br>
     *         Returns the <code>name</code> of the participant.<br>
     *         </p>
     */
    public final String getName() {
        return this.name;
    }

    /**
     * Gets the value of the <code>oid</code> property.
     * <p>
     * 
     * @return <code>Long</code><br>
     *         Returns the current value of the <code>oId</code> property.<br>
     *         </p>
     */
    @Override
    public final Long getOId() {
        return this.oId;
    }

    /**
     * Gets the value of the <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * MSP
     * 
     * @return <code>String</code><br>
     *         Returns the <code>stationCode</code> to which the participant belongs.<br>
     *         </p>
     */
    public final String getStationCode() {
        return this.stationCode;
    }

    /**
     * Sets the value of <code>billingAccountNumber1</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <b>Example: </b><br>
     * 123456
     * 
     * @param pBillingAccountNumber1 <code>String</code><br>
     *            Contains the <code>billingAccountNumber1</code> of the participant.<br>
     *            </p>
     */
    public final void setBillingAccountNumber1(final String pBillingAccountNumber1) {
        this.billingAccountNumber1 = pBillingAccountNumber1;
    }

    /**
     * Sets the value of <code>messageProfileName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric<br>
     * <b>Example: </b><br>
     * MSPRCUW
     * 
     * @param pMessageProfileName <code>String</code><br>
     *            Contains the <code>messageProfileName</code> property.<br>
     *            </p>
     */
    public final void setMessageProfileName(final String pMessageProfileName) {
        this.messageProfileName = pMessageProfileName;
    }

    /**
     * Sets the value of <code>name</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <b>Example: </b><br>
     * UNISYS
     * 
     * @param pName <code>String</code><br>
     *            Contains the <code>name</code> of the participant.<br>
     *            </p>
     */
    public final void setName(final String pName) {
        this.name = pName;
    }

    /**
     * Sets the value of the <code>oId</code> property.
     * <p>
     * 
     * @param pId <code>Long</code><br>
     *            The new value of the <code>oId</code> property.<br>
     *            </p>
     */
    public final void setOId(final Long pId) {
        this.oId = pId;
    }

    /**
     * Sets the value of <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha <br>
     * <b>Example: </b><br>
     * MSP
     * 
     * @param pStationCode <code>String</code><br>
     *            Contains the <code>stationCode</code> to which the participant belongs.<br>
     *            </p>
     */
    public final void setStationCode(final String pStationCode) {
        this.stationCode = ContractUtility.convertToUpperCase(pStationCode);
    }
}
