/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>InterlineProvisoFindRequest</code> is used for retrieving <code> InterlineAgreement</code>
 * information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>interlineAgreementsFindDto</code>
 * </ul>
 */
public class InterlineAgreementsFindRequest extends AbstractRequest {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>interlineAgreementsFindDto</code> property.
     */
    private InterlineAgreementsFindDto interlineAgreementsFindDto;

    /**
     * Gets the <code>interlineAgreementsFindDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>interlineAgreementsFindDto</code> property.
     */
    public InterlineAgreementsFindDto getInterlineAgreementsFindDto() {
        return this.interlineAgreementsFindDto;
    }

    /**
     * Sets the <code>interlineAgreementsFindDto</code> property.
     * <p>
     * 
     * @param pInterlineAgreementsFindDto
     *            the current value of the <code>interlineAgreementsFindDto</code> property.
     */
    public void setInterlineAgreementsFindDto(
                final InterlineAgreementsFindDto pInterlineAgreementsFindDto) {
        this.interlineAgreementsFindDto = pInterlineAgreementsFindDto;
    }

}
