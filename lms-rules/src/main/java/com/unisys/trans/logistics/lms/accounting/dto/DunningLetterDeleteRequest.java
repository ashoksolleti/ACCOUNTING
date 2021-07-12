/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
/**
 * @author SaifAhmad
 */

package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>GHAAgreementInformationFindRequest</code> contains all the attributes
 * which are required for processing the retrieve request from user.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>serialVersionUID 
 * <li>gHAAgreementDto 
 * <li>gHAAgreementSlidingRatesDto
 * </code>
 * </ul>
 * 
 */

public class DunningLetterDeleteRequest extends AbstractRequest
{

    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>dunningLetterDto</code> property.
     */

    private DunningLettersDto dunningLetterDto;

    /**
     * Gets the <code>dunningLetterDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>dunningLetterDto</code> property.
     */
    public DunningLettersDto getDunningLetterDto() {
        return this.dunningLetterDto;
    }

    /**
     * Sets the <code>pDunningLetterDto</code>.
     * <p>
     * 
     * @param pDunningLetterDto
     *            holds the new value of <code>dunningLetterDto</code>
     */
    public void setDunningLetterDto(final DunningLettersDto pDunningLetterDto) {
        this.dunningLetterDto = pDunningLetterDto;
    }

}
