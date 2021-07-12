/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>InterlineAgreementsPersistRequest</code> is used for storing <code> InterlineAgreement</code>
 * information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>interlineAgreementsDto</code>
 * <li><code>oId</code>
 * </ul>
 */
public class AccountingAwbInformationPersistRequest extends AbstractRequest {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private Long oId;

    /**
     * <code>Default Constructor.</code>
     */
    public AccountingAwbInformationPersistRequest() {

    }

    public Long getoId() {
        return this.oId;
    }

    public void setoId(final Long pOId) {
        this.oId = pOId;
    }

    

   
    
}
