/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>AggregateResponse</code> contains the response of the maintenance request received by
 * <code>AggregateService</code>.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>AggregateDto</code></li>
 * </ul>
 */
public class AggregateResponse extends AbstractResponse {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2053855499694258343L;

    /**
     * Attribute to hold <code>AggregateDto</code> property.
     * <p>
     */
    private final List<AggregateDto> aggregates = new ArrayList<AggregateDto>();
    /**
     * Attribute to hold <code>aggregateCities</code> property.
     * <p>
     */
    private List<String> aggregateCities;

    /**
     * <code>Default constructor</code>.
     * <p>
     */
    public AggregateResponse() {

    }

    /**
     * Adds the <code>AggregateDto</code> to the list of AggregateDtos.
     * <p>
     * 
     * @param pAggregateDto the new value of the <code>aggregates</code> property.
     */
    public void addAggregate(final AggregateDto pAggregateDto) {
        this.aggregates.add(pAggregateDto);
    }

    /**
     * Gets operation for the <code>aggregateDtos</code>.
     * <p>
     * 
     * @return the current value of the <code>aggregates</code> property.
     */
    public List<AggregateDto> getAggregates() {
        return this.aggregates;
    }

	/**
	 * @return the aggregateCities
	 */
	public List<String> getAggregateCities() {
		if (this.aggregateCities == null) {
            this.aggregateCities = new ArrayList<String>();
        }
		return aggregateCities;
	}

	/**
	 * @param aggregateCities the aggregateCities to set
	 */
	public void setAggregateCities(List<String> aggregateCities) {
		this.aggregateCities = aggregateCities;
	}
    
}
