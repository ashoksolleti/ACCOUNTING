//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>RateSourceResponse</code> contains the response of the maintenance
 * request received by <code>RateSourceService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>RateSourceDto
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.arc.dto.RateSourceDto
 */

public class RateSourceResponse extends AbstractResponse {

    /**
     * Generated serial version id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold list of <code>RateSources</code> property.
     * <p>
     * <code>RateSourceDto</code> contains the RateSource information.
     */
    private List<RateSourceDto> rateSources;

    /**
     * <code>Default Constructor.</code>
     */
    public RateSourceResponse() {
    }

    /**
     * Adds the RateSource information to the <code>RateSource</code> property.
     * <p>
     * 
     * @param pRateSourceDto
     *            the new rateSource information to be added to the <code>rateSource</code> property.
     */
    public void addRateSource(final RateSourceDto pRateSourceDto) {
        if (this.rateSources == null) {
            rateSources = new ArrayList<RateSourceDto>();
        }
        this.rateSources.add(pRateSourceDto);
    }

    /**
     * Gets the <code>RateSources</code> property.
     * <p>
     * RateSource information for a list of unique RateSource.
     * <p>
     * 
     * @return the current value of <code>RateSources</code> property.
     */
    public List<RateSourceDto> getRateSources() {
        return this.rateSources;
    }

    /**
     * Sets the <code>RateSources</code> property.
     * <p>
     * The RateSource information for a list of unique RateSource.
     * <p>
     * 
     * @param pRateSources
     *            the new value of <code>RateSources</code> information.<br>
     */
    public void setRateSources(final List<RateSourceDto> pRateSources) {
        this.rateSources = pRateSources;
    }

}
