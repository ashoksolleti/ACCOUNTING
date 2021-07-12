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
public class InterlineAgreementsPersistRequest extends AbstractRequest {

    /**
     * Unique version generated.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>interlineAgreementsDto</code> object.
     */
    private InterlineAgreementsDto interlineAgreementsDto;

    /**
     * Attribute to hold the <code>oId</code> object.
     */
    private Long oId;

    /**
     * <code>Default Constructor.</code>
     */
    public InterlineAgreementsPersistRequest() {

    }

    /**
     * Gets the <code>interlineAgreementsDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>interlineAgreementsDto</code> property.
     */
    public InterlineAgreementsDto getInterlineAgreementsDto() {
        return interlineAgreementsDto;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>interlineAgreementsDto</code> property.
     * <p>
     * 
     * @param pInterlineAgreementsDto
     *            the current value of the <code>interlineAgreementsDto</code> property.
     */
    public void setInterlineAgreementsDto(final InterlineAgreementsDto pInterlineAgreementsDto) {
        this.interlineAgreementsDto = pInterlineAgreementsDto;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the current value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

}
