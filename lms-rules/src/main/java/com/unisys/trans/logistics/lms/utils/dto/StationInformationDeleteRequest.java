/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>StationInformationDeleteRequest</code> class represents the request to delete
 * StationInformation details.
 * <p>
 * <code>StationInformationDeleteRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>oId
 * </code>
 * </ul>
 */
public class StationInformationDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5224422017688886594L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * <code>Default constructor.</code>
     */
    public StationInformationDeleteRequest() {

    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }
}
