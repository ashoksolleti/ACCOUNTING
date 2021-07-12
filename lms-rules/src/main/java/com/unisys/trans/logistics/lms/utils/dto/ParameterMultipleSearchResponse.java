/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.framework.dto.ParameterDto;

/**
 * <code>ParameterResponse</code> contains the response of the maintenance request received by
 * <code>ParameterService</code>.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <code>
 * <li>parameterDto
 * </code>
 * </ul>
 */
public class ParameterMultipleSearchResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8571524166117416946L;

    /**
     * Attribute to hold collection of <code>ParameterDto</code> object.
     */
    private List<ParameterDto> parameters;
    
    /**
     * Attribute to hold Run Time Parameters.
     */
    private  Map<String, String> parameterList;
    
    /**
     * <code>Default constructor.</code>
     */
    public ParameterMultipleSearchResponse() {

    }

    /**
     * Gets the <code>parameters</code> property.
     * <p>
     * 
     * @return the current value of list of <code>ParameterDto</code> property.
     */
    public List<ParameterDto> getParameters() {
        return this.parameters;
    }

    /**
     * Sets the <code>parameters</code> property.
     * <p>
     * 
     * @param pParameters the new value of collection of parameter data transfer objects.
     */

    public void setParameters(final List<ParameterDto> pParameters) {
        this.parameters = pParameters;
    }

    /**
     * Gets the <code>parameterList</code> property.
     * <p>
     * 
     * @return the current value of the <code>parameterList</code> property.
     */
    public Map<String, String> getParameterList() {
        return this.parameterList;
    }

    /**
     * Sets the <code>pParameterList</code>.
     * <p>
     * 
     * @param pParameterList
     *            holds the new value of <code>parameterList</code>
     */
    public void setParameterList(final Map<String, String> pParameterList) {
        this.parameterList = pParameterList;
    }
    
    

}
