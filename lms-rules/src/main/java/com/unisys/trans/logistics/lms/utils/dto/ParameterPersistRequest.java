/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.dto.ParameterDto;

import java.util.List;

/**
 * <code>ParameterPersistRequest</code> class represents the request to update parameter information details.
 * <p>
 * <code>ParameterPersistRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>parameters
 * </code>
 * </ul>
 */
public class ParameterPersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 4616282883118395378L;

    /**
     * Attribute to hold <code>ParameterDto</code> object.
     */
    private List<ParameterDto> parameters;
    private boolean retainParameter;

    /**
     * <code>Default constructor.</code>
     */
    public ParameterPersistRequest() {

    }

    /**
     * Gets the <code>parameters</code> property.
     * <p>
     * 
     * @return the current value of <code>parameters</code> property.
     */
    public List<ParameterDto> getParameters() {
        return this.parameters;
    }

    /**
     * Sets the <code>parameters</code> property.
     * <p>
     * 
     * @param pParameters the new value of <code>parameters</code> property.
     */
    public void setParameters(final List<ParameterDto> pParameters) {
        this.parameters = pParameters;
    }

    /**
     * Gets the <code>retainParameter</code> property.
     * <p>
     * 
     * @return the current value of <code>retainParameter</code> property.
     */
    public boolean getRetainParameter() {
        return this.retainParameter;
    }

    /**
     * Sets the <code>retainParameter</code> property.
     * <p>
     * 
     * @param pRetainParameter the new value of <code>retainParameter</code> property.
     */
    public void setRetainParameter(final boolean pRetainParameter) {
        this.retainParameter = pRetainParameter;
    }
}
