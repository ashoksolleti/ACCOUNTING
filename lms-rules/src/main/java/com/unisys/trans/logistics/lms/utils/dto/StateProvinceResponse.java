//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>StateProvinceResponse</code> contains the response of the maintenance request received by
 * <code>StateProvinceService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>stateProvinceDtos
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.StateProvinceDto StateProvinceDto
 */
public class StateProvinceResponse extends AbstractResponse {

    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold list of <code>StateProvinceDtos</code> object.
     */
    private List<StateProvinceDto> stateProvinceDtos;

    /**
     * <code>Default Constructor.</code>
     */
    public StateProvinceResponse() {

    }

    /**
     * Adds the <code>StateProvinceDto</code> to the list of <code>StateProvinceDto</code>.
     * <p>
     * 
     * @param pStateProvinceDto the new value of <code>stateProvinceDtos</code> property.
     */
    public final void addStateProvinceDto(final StateProvinceDto pStateProvinceDto) {
        this.getStateProvinceDtos().add(pStateProvinceDto);
    }

    /**
     * Gets the list of <code>stateProvinceDtos</code> property.
     * <p>
     * 
     * @return the current value of list of <code>stateProvinceDtos</code> property.
     */
    public final List<StateProvinceDto> getStateProvinceDtos() {
        if (null == this.stateProvinceDtos) {
            this.stateProvinceDtos = new ArrayList<StateProvinceDto>();
        }
        return this.stateProvinceDtos;
    }

    /**
     * Sets the <code>stateProvinceDtos</code> property.
     * <p>
     * 
     * @param pStateProvinceDtos the new value of list of <code>stateProvinceDtos</code> property.
     */
    public final void setStateProvinceDtos(final List<StateProvinceDto> pStateProvinceDtos) {
        this.stateProvinceDtos = pStateProvinceDtos;
    }
}
