/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;

/**
 * <code>ActualFlown</code> contains the details of ActualFlownDto.
 * <p>
 * This contains all information about ActualFlownDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>airwaybillRoute
 * <li>oId
 * </ul>
 */

public class ActualFlownDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8932734475156842111L;

    /**
     * Attribute to hold <code>routingSegment</code> property.
     */
    private RoutingSegmentDto routingSegment;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;
    
    private boolean od_doFlownIndicator;
    
    private boolean isFlownProcessed;
    public boolean isFlownProcessed() {
		return isFlownProcessed;
	}

	public void setFlownProcessed(boolean isFlownProcessed) {
		this.isFlownProcessed = isFlownProcessed;
	}
	
	public void setOD_DOFlownIndicator(boolean od_doFlownIndicator) {
    	this.od_doFlownIndicator= od_doFlownIndicator; 
    }
    
    public boolean getOD_DOFlownIndicator() {
    	return od_doFlownIndicator;
    }

	/**
     * Gets the <code>routingSegment</code> property.
     * <p>
     * 
     * @return the current value of the <code>routingSegment</code> property.
     */
    
    public RoutingSegmentDto getRoutingSegment() {
        return this.routingSegment;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>SpotRateId</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */

    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>airwaybillRoute</code> property.
     * <p>
     * 
     * @param pAirwaybillRoute
     *            the current value of the <code>airwaybillRoute</code> property.
     */
    public void setRoutingSegment(final RoutingSegmentDto pRoutingSegment) {
        this.routingSegment = pRoutingSegment;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>ClassRatingId</code>.It is of type Long.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }
    @Override
    public String toString(){
        final StringBuilder strBuilder = new StringBuilder();
       if(this.getRoutingSegment()!=null){
        if(this.getRoutingSegment().getOriginStation()!=null){
        strBuilder.append(this.getRoutingSegment().getOriginStation());
        strBuilder.append(" ");
        }
        if(this.getRoutingSegment().getDestinationStation()!=null){
            strBuilder.append(this.getRoutingSegment().getDestinationStation());
            strBuilder.append(" ");
            }
        if(this.getRoutingSegment().getFlightNumber()!=null){
            strBuilder.append(this.getRoutingSegment().getFlightNumber());
            strBuilder.append(" ");
            }
        if(this.getRoutingSegment().getFlightDate()!=null){
            strBuilder.append(DateUtility.getFormattedDate(
                FrameworkConstants.DATEFORMAT,
                this.getRoutingSegment().getFlightDate()));
            strBuilder.append(" ");
            }
        if(this.getRoutingSegment().getSegmentWeight()!=null){
            strBuilder.append(this.getRoutingSegment().getSegmentWeight());
            strBuilder.append(" ");
            }
        if(this.getRoutingSegment().getPieces()!=null){
            strBuilder.append(this.getRoutingSegment().getPieces());
            strBuilder.append(" ");
            }
        }
        return strBuilder.toString();
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((routingSegment == null) ? 0 : routingSegment.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ActualFlownDto other = (ActualFlownDto) obj;
		if (routingSegment == null) {
			if (other.routingSegment != null)
				return false;
		} else if (!routingSegment.equals(other.routingSegment))
			return false;
		return true;
	}
    
    
}
