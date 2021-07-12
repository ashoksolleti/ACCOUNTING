/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
/**
 * 
 * @author SaifAhmad
 *
 */

package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>GHAAgreementInformationPersistRequest </code> is a container
 * object for holding the entire content of a <code>GHAAgreement</code>.
 * <p>
 * This is used while persisting the agreement details in the database.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>serialVersionUID 
 * <li>gHAAgreementDto 
 * <li>gHAAgreementSlidingRatesDto
 * <li>gHAAgreementDtoList
 * <li>deleteGhaAgreements
 * </code>
 * </ul>
 * 
 */

public class DunningLetterPersistRequest extends AbstractRequest
{

    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>dunningLettersDto</code> property.
     */
    private DunningLettersDto dunningLettersDto;

    /**
     * Gets the <code>dunningLettersDto</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>dunningLettersDto</code> property.
     */
    public DunningLettersDto getDunningLettersDto() {
        return this.dunningLettersDto;
    }

    /**
     * Sets the <code>dunningLettersDto</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param dunningLettersDto
     *            the new value of the <code>dunningLettersDto</code> property.
     */
    public void setDunningLettersDto(final DunningLettersDto pDunningLettersDto) {
        this.dunningLettersDto = pDunningLettersDto;
    }

}
