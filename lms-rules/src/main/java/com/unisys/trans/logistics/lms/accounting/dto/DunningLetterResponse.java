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

public class DunningLetterResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 804096162517558546L;

    /**
     * Attribute to hold the <code>dunningLetterDto</code> object.
     */
    private DunningLettersDto dunningLetterDto;

    /**
     * Gets the <code>dunningLetterDto</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>dunningLetterDto</code> property.
     */

    public DunningLettersDto getDunningLetterDto() {
        return this.dunningLetterDto;
    }

    /**
     * Sets the <code>dunningLetterDto</code> implementation injected by
     * the IoC container.
     * <p>
     * 
     * @param dunningLetterDto
     *            the new value of the <code>dunningLetterDto</code> property.
     */
    public void setDunningLetterDto(final DunningLettersDto pDunningLetterDto) {
        this.dunningLetterDto = pDunningLetterDto;
    }

}
