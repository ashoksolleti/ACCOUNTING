//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.dto;

import java.util.Map;

/**
 * <code>UIParameterResponse</code> contains the parameters needed for <code>Spot Rate Information</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>parameters
 * </ul>
 */

public class UIParameterResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5400533249850551461L;

    /**
     * Attribute to hold <code>parameters</code> property.
     */
    private Map<String, String> parameters;

    /**
     * Get the <code>parameters</code> property.
     * <p>
     * 
     * @return the current value of the <code>parameters</code> property.
     */
    public Map<String, String> getParameters() {
        return this.parameters;
    }

    /**
     * Sets the <code>parameters</code> property.
     * <p>
     * 
     * @param pParameters
     *            the current value of the <code>parameters</code> property.
     */
    public void setParameters(final Map<String, String> pParameters) {
        this.parameters = pParameters;
    }
}
