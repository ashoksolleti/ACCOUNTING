/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * <code>AircraftDimensionBean</code> contain details of AircraftDimension.
 * <p>
 * This contains all information about AircraftDimension.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>aircraftDimension
 * <li>height
 * </ul>
 */
public class AircraftDimensionBean implements Serializable {

    /**
     * Attribute to hold <code>serialVersionUID</code> property.
     */
    private static final long serialVersionUID = -1946281148733774213L;

    /**
     * Gets the list of <code>aircraftDimension</code> associated with the
     * Aircraft Dimension.
     * <p>
     * 
     * @return the current list of <code>aircraftDimension</code> associated
     *         with a Spot Rate.
     */

    private List<BigDecimal> aircraftDimension;

    /**
     * Attribute to hold <code>height</code> property.
     */
    private BigDecimal height;

    /**
     * Gets the list of <code>DimensionEntryDto</code> associated with the
     * AircraftDimension.
     * <p>
     * 
     * @return the current list of <code>DimensionEntryDto</code> associated
     *         with a DimensionEntryDto.
     */

    public List<BigDecimal> getAircraftDimension() {
        return aircraftDimension;
    }

    /**
     * Gets the <code>Height</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of the <code>Height</code> property.
     */
    public BigDecimal getHeight() {
        return this.height;
    }

    /**
     * Sets the list of <code>aircraftDimension</code> associated with Spot Rate.
     * <p>
     * 
     * @param pAircraftDimension
     *            the new list of <code>aircraftDimension</code> associated with
     *            AircraftDimension.<br>
     * 
     */

    public void setAircraftDimension(final List<BigDecimal> pAircraftDimension) {
        this.aircraftDimension = pAircraftDimension;
    }

    /**
     * Sets the <code>Height</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param pHeight
     *            the current value of the <code>Height</code> property.
     */

    public void setHeight(final BigDecimal pHeight) {
        this.height = pHeight;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "AircraftDimensionBean [height=" + height
                    + ", aircraftDimension=" + aircraftDimension + "]\n";
    }
}