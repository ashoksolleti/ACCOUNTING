/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>AccountingParticipantFindRequest</code> class represents the request to find
 * AccountingParticipantInformations details .
 * <p>
 * <code>AccountingParticipantFindRequest</code> contains the following attribute:
 * <ul>
 * <li>accountNumber
 * <li>oId
 * </ul>
 */
public class AccountingParticipantFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8933454008877619984L;

    /**
     * Attribute to hold the <code>accountNumber</code> property.
     */
    private String accountNumber;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;
    /**
     * Gets the <code>accountNumber</code> property.
     * <p>
     * 
     * @return the new value of the <code>accountNumber</code>.
     */
    public String getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the new value of the <code>oId</code>.
     */
    public Long getOId() {
        return this.oId;
    }
    /**
     * Sets the <code>accountNumber</code> property.
     * <p>
     * 
     * @param pAccountNumber the new value of the <code>accountNumber</code>.
     */
    public void setAccountNumber(final String pAccountNumber) {
        this.accountNumber = pAccountNumber;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code>.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

}
