//@formatter:off
/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.dto.constants.ParticipantAccountType;


public class ParticipantAccountDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4643545979518395284L;

    /**
     * Account Number Id
     */
    private String accountId;

    /**
     * Account Number
     */
    private String accountNbr;

    /**
     * Account Type Possible values could be,
     * PX = Primary Account
     * AX = Contract
     * IX = IATA Account
     * Account where 'X' stands for the nth account information. Usually there
     * will be two account informations of each type associated with the
     * participant.
     * 
     */
    private ParticipantAccountType accountType;
    /**
     * Attribute to hold <code>participanAccountId</code> property.
     */
    private Long participanAccountId;
    /**
     * Gets the <code>accountId</code> property.
     * 
     * @return the current value of the <code>accountId</code> property.
     */
    public String getAccountId() {
        return this.accountId;
    }
    /**
     * Gets the <code>accountNbr</code> property.
     * 
     * @return the current value of the <code>accountNbr</code> property.
     */
    public String getAccountNbr() {
        return this.accountNbr;
    }
    /**
     * Gets the <code>accountType</code> property.
     * 
     * @return the current value of the <code>accountType</code> property.
     */
    public ParticipantAccountType getAccountType() {
        return this.accountType;
    }
    /**
     * Gets the <code>participanAccountId</code> property.
     * 
     * @return the current value of the <code>participanAccountId</code> property.
     */
    public Long getParticipanAccountId() {
        return this.participanAccountId;
    }
    /**
     * Sets the <code>accountId</code> property.
     * 
     * @param pAccountId
     *            the current value of the <code>accountId</code> property.
     */
    public void setAccountId(final String pAccountId) {
        this.accountId = pAccountId;
    }
    /**
     * Sets the <code>accountNbr</code> property.
     * 
     * @param pAccountNbr
     *            the current value of the <code>accountNbr</code> property.
     */
    public void setAccountNbr(final String pAccountNbr) {
        this.accountNbr = pAccountNbr;
    }
    /**
     * Sets the <code>accountType</code> property.
     * 
     * @param pAccountType
     *            the current value of the <code>accountType</code> property.
     */
    public void setAccountType(final ParticipantAccountType pAccountType) {
        this.accountType = pAccountType;
    }
    /**
     * Sets the <code>participanAccountId</code> property.
     * 
     * @param pParticipanAccountId
     *            the current value of the <code>participanAccountId</code> property.
     */
    public void setParticipanAccountId(final Long pParticipanAccountId) {
        this.participanAccountId = pParticipanAccountId;
    }

}
