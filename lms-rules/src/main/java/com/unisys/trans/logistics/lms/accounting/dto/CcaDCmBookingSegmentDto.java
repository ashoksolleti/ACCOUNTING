package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;


/**
 * <code>BookingSegment</code> domain contain details of BookingSegment.
 * <p>
 * This contains all information about BookingSegment.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>airwaybillRoute
 * <li>oId
 * </ul>
 */
public class CcaDCmBookingSegmentDto extends PersistenceObjectDto  {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to holds <code>routingSegment</code> property.
     */
    private RoutingSegmentDto routingSegment;

    /**
     * Attribute to holds <code>oId</code> property.
     */
    private Long oId;


    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }


    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }


	/**
	 * @return the routingSegment
	 */
	public RoutingSegmentDto getRoutingSegment() {
		return routingSegment;
	}


	/**
	 * @param routingSegment the routingSegment to set
	 */
	public void setRoutingSegment(RoutingSegmentDto routingSegment) {
		this.routingSegment = routingSegment;
	}


	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}


	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

}
