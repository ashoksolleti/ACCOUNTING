/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>AddOnRatePersistRequest</code> class represents the request to create
 * and update AddOnRateinformation details.
 * <p>
 * <code>AddOnRatePersistRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>AddOnRateDto
 * <li>oId
 * </code>
 * </ul>
 */
public class AddOnRatePersistRequest extends AbstractRequest {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>addOnRateDto</code> object.
     */
    private AddOnRateDto addOnRateDto;

    /**
     * Attribute to hold the <code>oId</code> object.
     */
    private Long oId;

    /**
     * Default Constructor.
     */
    public AddOnRatePersistRequest() {

    }

    /**
     * Gets the <code>AddOnRateDto</code> property.
     * <p>
     * 
     * @return the current value of <code>AddOnRateDto</code> property.
     */
    public AddOnRateDto getAddOnRateDto() {
        return this.addOnRateDto;
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
     * Sets the <code>AddOnRateDto</code> property.
     * <p>
     * 
     * @param pAddOnRateDto
     *            the new value of the <code>AddOnRateDto</code> property.
     */
    public void setAddOnRateDto(final AddOnRateDto pAddOnRateDto) {
        this.addOnRateDto = pAddOnRateDto;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>OId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

}
