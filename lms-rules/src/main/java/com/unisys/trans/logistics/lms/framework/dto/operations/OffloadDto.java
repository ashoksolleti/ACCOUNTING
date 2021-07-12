/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.io.Serializable;

/**
 * <code>offloadDto</code> class represents the offload information.
 * 
 */
public class OffloadDto implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>offloadStation</code> property.
     */
    private String offloadStation;

    /**
     * Attribute to hold <code>offloadCarrier</code> property.
     */
    private String offloadCarrier;

    /**
     * Gets the <code>offloadStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>offloadStation</code> property.<br>
     */
    public String getOffloadStation() {
        return this.offloadStation;
    }

    /**
     * Sets the <code>offloadStation</code> property.
     * <p>
     * 
     * @param offloadStation
     *            the current value of the <code>offloadStation</code> property.<br>
     */
    public void setOffloadStation(final String offloadStation) {
        this.offloadStation = offloadStation;
    }

    /**
     * Gets the <code>offloadCarrier</code> property.
     * <p>
     * 
     * @return the current value of the <code>Carrier</code> property.<br>
     */
    public String getOffloadCarrier() {
        return this.offloadCarrier;
    }

    /**
     * Sets the <code>offloadCarrier</code> property.
     * <p>
     * 
     * @param offloadCarrier
     *            the current value of the <code>offloadCarrier</code> property.<br>
     */
    public void setOffloadCarrier(final String offloadCarrier) {
        this.offloadCarrier = offloadCarrier;
    }

    public String toString() {
        final StringBuffer buffer = new StringBuffer();
        if (this.offloadStation != null) {
            buffer.append(this.offloadStation);
        }
        if (this.offloadCarrier != null) {
            buffer.append(this.offloadCarrier);
        }
        return buffer.toString();
    }

}
