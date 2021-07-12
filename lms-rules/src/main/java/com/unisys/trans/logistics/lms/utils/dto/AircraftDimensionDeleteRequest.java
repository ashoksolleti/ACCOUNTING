package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>AircraftDimensionDeleteRequest</code> is used for deleting <code>AircraftDimension</code>
 * information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>aircraftDimensionDto
 * <li>oId
 * </ul>
 */
public class AircraftDimensionDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8488201475157033104L;

    /**
     * Attribute to hold the <code>airCraftDimensionDto</code> property.
     */
    private AircraftDimensionDto aircraftDimensionDto;

    /**
     * Attribute to hold <code>contactDto</code> property.
     */
    private Long oId;

    /**
     * Default Constructor.
     */

    public AircraftDimensionDeleteRequest() {

    }

    /**
     * Gets the <code>aircraftDimensionDto</code> property.
     * <p>
     * 
     * @return the current value of <code>aircraftDimensionDto</code> property.
     */
    public final AircraftDimensionDto getAircraftDimensionDto() {

        return this.aircraftDimensionDto;

    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>aircraftDimensionDto</code> property.
     * <p>
     * 
     * @param pAircraftDimensionDto
     *            the new value of <code>aircraftDimensionDto</code> property.
     */
    public final void setAircraftDimensionDto(
                final AircraftDimensionDto pAircraftDimensionDto) {
        this.aircraftDimensionDto = pAircraftDimensionDto;
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
}
