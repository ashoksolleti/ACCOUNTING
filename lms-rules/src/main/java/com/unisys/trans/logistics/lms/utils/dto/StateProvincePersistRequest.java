//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>StateProvincePersistRequest</code> is used to create and update State/Province.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <li><code>stateProvinceDto</code>
 * </ul>
 */
public class StateProvincePersistRequest extends AbstractRequest {

    /**
     * TODO default serial version added. add a valid serial version id
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>StateProvinceDto</code> object.
     */
    private StateProvinceDto stateProvince;

    /**
     * <code>Default Constructor.</code>
     */
    public StateProvincePersistRequest() {

    }

    /**
     * Gets the <code>stateProvince</code> property.
     * <p>
     * 
     * @return the current value of <code>stateProvince</code> property.
     */
    public final StateProvinceDto getStateProvince() {
        return this.stateProvince;
    }

    /**
     * Sets the <code>stateProvince</code> property.
     * <p>
     * 
     * @param pStateProvince the new value of the <code>stateProvince</code> property.
     */
    public final void setStateProvince(final StateProvinceDto pStateProvince) {
        this.stateProvince = pStateProvince;
    }

}