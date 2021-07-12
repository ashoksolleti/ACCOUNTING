/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>InterlineAgreementsResponse</code> is used for returning <code> InterlineAgreement</code>
 * information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>interlineAgreementsDto</code>
 * <li><code>interlineAgreementsDtos</code>
 * </ul>
 */

public class InterlineAgreementsResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 804096162517558546L;

    /**
     * Attribute to hold the <code>interlineAgreementsDto</code> object.
     */
    private InterlineAgreementsDto interlineAgreementsDto;

    /**
     * Attribute to hold the <code>interlineAgreementsDtos</code> object.
     */
    private List<InterlineAgreementsDto> interlineAgreementsDtos;

    /**
     * Gets the <code>interlineAgreementsDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>interlineAgreementsDto</code> property.
     */
    public InterlineAgreementsDto getInterlineAgreementsDto() {
        return this.interlineAgreementsDto;
    }

    /**
     * Gets the <code>interlineAgreementsDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>interlineAgreementsDtos</code> property.
     */
    public List<InterlineAgreementsDto> getInterlineAgreementsDtos() {
        return this.interlineAgreementsDtos;
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
     * Sets the <code>interlineAgreementsDtos</code> property.
     * <p>
     * 
     * @param pInterlineAgreementsDtos
     *            the current value of the <code>interlineAgreementsDtos</code> property.
     */
    public void setInterlineAgreementsDtos(final List<InterlineAgreementsDto> pInterlineAgreementsDtos) {
        this.interlineAgreementsDtos = pInterlineAgreementsDtos;
    }

}
