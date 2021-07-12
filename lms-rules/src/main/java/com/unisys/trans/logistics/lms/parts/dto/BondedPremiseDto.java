/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;

/**
 * <code>BondedPremiseDto</code> contains specific data applicable to broker bonded premises identification.
 * <p>
 * This contains the following attributes: <code>
 * <ul>
 * <li>bondedId
 * <li>bondedStation
 * <li>oId
 * <li>freightParticipantOId
 * </ul>
 * </code>
 */
public class BondedPremiseDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1510557081193016893L;

    /**
     * Attribute to hold <code>bondedId</code> property.
     */
    private String bondedId;

    /**
     * Attribute to hold <code>bondedStation</code> property.
     */
    private String bondedStation;

    /**
     * Attribute to hold <code>freightParticipantOId</code> property.
     */
    private Long freightParticipantOId;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * <code>Default constructor.</code>
     */
    public BondedPremiseDto() {

    }

    /**
     * Gets the <code>bondedId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * Prem1
     * <p>
     * 
     * @return the current value of the <code>bondedId</code> property.<br>
     */
    public String getBondedId() {
        return this.bondedId;
    }

    /**
     * Gets the <code>bondedStation</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic<br>
     * <p>
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>bondedStation</code> property.<br>
     */
    public String getBondedStation() {
        return this.bondedStation;
    }

    /**
     * Gets the <code>freightParticipantOId</code> property.
     * <p>
     * 
     * @return the current value of the <code>freightParticipantOId</code> property.<br>
     */
    public Long getFreightParticipantOId() {
        return this.freightParticipantOId;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>bondedId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alphanumeric <br>
     * <p>
     * <b>Example: </b><br>
     * QUEBEC
     * <p>
     * 
     * @param pBondedId the new value of the <code>bondedId</code> property.<br>
     */
    public void setBondedId(final String pBondedId) {
        this.bondedId = pBondedId;
    }

    /**
     * Sets the <code>bondedStation</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pBondedStation the new value of the <code>bondedStation</code> property.<br>
     */
    public void setBondedStation(final String pBondedStation) {
        this.bondedStation = ContractUtility.convertToUpperCase(pBondedStation);
    }

    /**
     * Sets the <code>freightParticipantOId</code> property.
     * <p>
     * 
     * @param pFreightParticipantOId the new value of the <code>freightParticipantOId</code> property.<br>
     */
    public void setFreightParticipantOId(final Long pFreightParticipantOId) {
        this.freightParticipantOId = pFreightParticipantOId;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }
}
