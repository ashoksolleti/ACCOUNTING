/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class AirwaybillRoutingSegmentDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6195759865859623901L;

    /**
     * Attribute to hold <code>routingSegment</code> property.
     */
    private RoutingSegmentDto routingSegment;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
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

    /**
     * Sets the <code>routingSegment</code>.
     * <p>
     * 
     * @param pRoutingSegment
     *            holds the new value of <code>routingSegment</code>
     */
    public void setRoutingSegment(final RoutingSegmentDto pRoutingSegment) {
        this.routingSegment = pRoutingSegment;
    }

}
