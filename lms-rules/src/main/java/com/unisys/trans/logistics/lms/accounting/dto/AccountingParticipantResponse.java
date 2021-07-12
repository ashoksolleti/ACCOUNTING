/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>ParticipantResponse</code> is the response object holds the Participant details.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>participant
 * </ul>
 * </code>
 */
public class AccountingParticipantResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6778211689059741410L;

    /**
     * Attribute to hold <code>participant</code> property.
     */
    private AccountingParticipantDto participant;

    /**
     * <code>Default constructor</code>.
     * <p>
     */
    public AccountingParticipantResponse() {

    }

    /**
     * Gets the <code>participant</code> property.
     * <p>
     * 
     * @return the current value of the <code>participant</code> property.
     */
    public AccountingParticipantDto getParticipant() {
        return this.participant;
    }

    /**
     * Sets the <code>participant</code> property.
     * <p>
     * 
     * @param pParticipant the new value of the <code>participant</code> property.
     */
    public void setParticipant(final AccountingParticipantDto pParticipant) {
        this.participant = pParticipant;
    }

}
