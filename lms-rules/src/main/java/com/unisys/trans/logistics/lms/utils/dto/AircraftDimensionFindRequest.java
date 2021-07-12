package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>AircraftDimensionFindRequest</code> is used for retrieving <code>AircraftDimension</code>
 * information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>aircraftCode
 * </ul>
 */
public class AircraftDimensionFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 4895504088299803321L;

    /**
     * Attribute to hold <code>aircraftCode</code> property.
     */
    private String aircraftCode;

    /**
     * <code>Default constructor.</code>
     */

    public AircraftDimensionFindRequest() {

    }

    /**
     * Gets the <code>aircraftCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>aircraftCode</code> property.
     */
    public String getAircraftCode() {
        return this.aircraftCode;
    }

    /**
     * Sets the <code>aircraftCode</code> property.
     * <p>
     * 
     * @param pAircraftCode
     *            the current value of the <code>aircraftCode</code> property.
     */

    public void setAircraftCode(final String pAircraftCode) {
        this.aircraftCode = pAircraftCode;
    }
}
