/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>AccountingParticipantPersistRequest</code>class represents the request to create/update
 * AccountingParticipantInformation details.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>accountingParticipantDto
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.AccountingParticipantDto
 */
public class AccountingParticipantPersistRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 21818524079636356L;

    /**
     * Attribute to hold <code>accountingParticipantDto</code> property.
     */
    private AccountingParticipantDto accountingParticipantDto;

    /**
     * <code>Default constructor</code>.
     * <p>
     */
    public AccountingParticipantPersistRequest() {

    }

    /**
     * Gets the <code>accountingParticipantDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>accountingParticipantDto</code> property.
     */
    public AccountingParticipantDto getAccountingParticipantDto() {
        if (this.accountingParticipantDto == null) {
            this.accountingParticipantDto = new AccountingParticipantDto();
        }
        return this.accountingParticipantDto;
    }

    /**
     * Sets the <code>accountingParticipantDto</code> property.
     * <p>
     * 
     * @param pAccountingParticipantDto
     *            the new value of the <code>accountingParticipantDto</code> property.
     */
    public void setAccountingParticipantDto(final AccountingParticipantDto pAccountingParticipantDto) {
        this.accountingParticipantDto = pAccountingParticipantDto;
    }

}
