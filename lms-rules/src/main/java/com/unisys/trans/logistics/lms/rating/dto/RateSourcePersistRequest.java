/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>RateSourcePersistRequest</code> class represents the request to update
 * rateSourceinformation details.
 * <p>
 * <code>RateSourcePersistRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>RateSourceDto
 * </code>
 * </ul>
 */
public class RateSourcePersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 4924424537410296299L;

    /**
     * Attribute to hold the <code>RatingNoteDto</code> object.
     */
    private RateSourceDto rateSourceDto;

    /**
     * <code>Default Constructor.</code>
     */
    public RateSourcePersistRequest() {
    }

    /**
     * Gets the <code>rateSourceDto</code> property.
     * <p>
     * 
     * @return the current value of <code>rateSourceDto</code> property.
     */
    public RateSourceDto getRateSourceDto() {
        return this.rateSourceDto;
    }

    /**
     * Sets the <code>rateSourceDto</code> property.
     * <p>
     * 
     * @param pRateSourceDto
     *            the new value of the <code>rateSourceDto</code> property.
     */
    public void setRateSourceDto(final RateSourceDto pRateSourceDto) {
        this.rateSourceDto = pRateSourceDto;
    }
}
