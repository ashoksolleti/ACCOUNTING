/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>AggregatePersistRequest</code> is used to create, update and restore aggregate information.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>aggregateDto</code></li>
 * </ul>
 */
public class AggregatePersistRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4498557034175238424L;

    /**
     * <code> Aggregate Data Transfer object.</code>
     */
    private AggregateDto aggregate;
    
    /**
     * Attribute to hold if marked for deletion validation needs to be ignored.
     * Set only for PFM - City deletion flow.  False for all other flows.
     */
    private boolean ignoreValidation;

    /**
     * <code>Default constructor</code>.
     * <p>
     */
    public AggregatePersistRequest() {

    }

    /**
     * Gets the <code>aggregate</code> data transfer object.
     * <p>
     * 
     * @return the current value of the <code>aggregate</code> property.<br>
     */
    public AggregateDto getAggregate() {
        return this.aggregate;
    }

    /**
     * Sets the <code>aggregate</code> data transfer object.
     * <p>
     * 
     * @param pAggregateDto the new value of the <code>aggregate</code> property.<br>
     */
    public void setAggregate(final AggregateDto pAggregateDto) {
        this.aggregate = pAggregateDto;
    }
    
    /**
     * Gets the <code>ignoreValidation</code> property.
     * <p>
     * 
     * @return the current value of the <code>ignoreValidation</code> property.<br>
     */ 
    public boolean isIgnoreValidation() {
        return this.ignoreValidation;
    }
    
    /**
     * Sets the <code>ignoreValidation</code> property.
     * 
     * <p>
     * 
     * @param pIgnoreValidation
     *            the new value of the <code>ignoreValidation</code> property.<br>
     */ 
    public void setIgnoreValidation(final boolean pIgnoreValidation) {
        this.ignoreValidation = pIgnoreValidation;
    }
}
