/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>MultiSegmentRouteDto</code> to get MultiSegmentRouteDto details.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>allOrigin
 * <li>origin
 * <li>originType
 * <li>routeCompression
 * <li>oId
 * </ul>
 * </code>
 */
public class MultiSegmentRouteDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1853277365979490952L;

    /**
     * Attribute to hold <code>allOrigin</code> property.
     */
    private boolean allOrigin;

    /**
     * Attribute to hold <code>intermediateDestinations</code> property.
     */
    private List<MultiSegmentDestinationDto> intermediateDestinations;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>origin</code> property.
     */
    private GeographicDataDto origin;

    /**
     * Attribute to hold <code>routeCompression</code> property.
     */
    private boolean routeCompression;

    /**
     * Gets the <code>intermediateDestinations </code> data transfer object
     * list.
     * <p>
     * 
     * @return list of <code> {@link com.unisys.trans.logistics.lms.rating.dto.MultiSegmentDestinationDto
     *         MultisegmentDestinationDto}</code><br>
     *         the current value of <code>MultisegmentDestinationDto</code> data
     *         transfer object.<br>
     */
    public List<MultiSegmentDestinationDto> getIntermediateDestinations() {
        return this.intermediateDestinations;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>Origin</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * ASD34
     * <p>
     * 
     * @return the current value of the <code>Origin</code> property.
     */

    public GeographicDataDto getOrigin() {
        if (this.origin == null) {
            this.origin = new GeographicDataDto();
        }
        return this.origin;
    }

    /**
     * Gets the <code>RouteCompression</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>RouteCompression</code> property.
     */

    public boolean getRouteCompression() {
        return this.routeCompression;
    }

    /**
     * Gets the <code>AllOrigin</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>AllOrigin</code> property.f
     */
    public boolean isAllOrigin() {
        return this.allOrigin;
    }

    /**
     * Sets the <code>AllOrigin</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pAllOrigin
     *            the current value of the <code>AllOrigin</code> property.
     */
    public void setAllOrigin(final boolean pAllOrigin) {
        this.allOrigin = pAllOrigin;
    }

    /**
     * Sets the <code>MultisegmentDestinationDto</code> data transfer object
     * list.
     * <p>
     * 
     * @param pIntermediateDestinations
     *            holds the new value of list of <code>MultisegmentDestinationDto</code>.<br>
     */

    public void setIntermediateDestinations(
                final List<MultiSegmentDestinationDto> pIntermediateDestinations) {
        this.intermediateDestinations = pIntermediateDestinations;
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
     * Sets the <code>Origin</code> property.
     * <p>
     * <b>Format: </b><br>
     * 4-9 ALPHABETS
     * <p>
     * <b>Example: </b><br>
     * ASFASGFD
     * <p>
     * 
     * @param pOrigin
     *            the current value of the <code>Origin</code> property.
     */

    public void setOrigin(final GeographicDataDto pOrigin) {
        this.origin = pOrigin;
    }

    /**
     * Sets the <code>RouteCompression</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pRouteCompression
     *            the current value of the <code>RouteCompression</code> property.
     */

    public void setRouteCompression(final boolean pRouteCompression) {
        this.routeCompression = pRouteCompression;
    }

}
