/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import java.io.Serializable;

/**
 * <code>CreditInformation</code> contains the credit reference information details which includes Credit
 * reference identifier and Credit Card Identification number of the participant.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li>creditReferenceId
 * <li>creditCardId
 * <li>oId
 * <li>freightParticipantOId
 * </ul>
 */
public class CreditInformationDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6412798204682048958L;

    /**
     * Attribute to hold <code>creditCardId</code> property.
     */
    private String creditCardId;

    /**
     * Attribute to hold <code>creditReferenceId</code> property. Credit reference identifier and credit card
     * identification number.
     */
    private String creditReferenceId;

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
    public CreditInformationDto() {

    }

    /**
     * Gets the <code>creditCardId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-16 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * AX123456789012
     * <p>
     * 
     * @return the current value of <code>creditCardId</code> property.<br>
     */
    public String getCreditCardId() {
        return this.creditCardId;
    }

    /**
     * Gets the <code>creditReferenceId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * ABCD
     * <p>
     * 
     * @return the current value of <code>creditReferenceId</code> property.<br>
     */
    public String getCreditReferenceId() {
        return this.creditReferenceId;
    }

    /**
     * Gets the <code>freightParticipantOId</code> property.
     * <p>
     * 
     * @return the current value of <code>freightParticipantOId</code> property.<br>
     */
    public Long getFreightParticipantOId() {
        return this.freightParticipantOId;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>creditCardId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-16 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * AX123456789012
     * <p>
     * 
     * @param pCreditCardId the current value of <code>creditCardId</code> property.<br>
     */
    public void setCreditCardId(final String pCreditCardId) {
        this.creditCardId = pCreditCardId;
    }

    /**
     * Sets the <code>creditReferenceId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * ABCD
     * <p>
     * 
     * @param pCreditReferenceId the current value of <code>creditReferenceId</code> property.<br>
     */
    public void setCreditReferenceId(final String pCreditReferenceId) {
        this.creditReferenceId = pCreditReferenceId;
    }

    /**
     * Sets the <code>freightParticipantOId</code> property.
     * <p>
     * 
     * @param pFreightParticipantOId the new value of <code>freightParticipantOId</code> property.<br>
     */
    public void setFreightParticipantOId(final Long pFreightParticipantOId) {
        this.freightParticipantOId = pFreightParticipantOId;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }
}
