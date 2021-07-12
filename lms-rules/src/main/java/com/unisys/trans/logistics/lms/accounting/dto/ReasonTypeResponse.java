//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on

package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>ReasonTypeResponse</code> contains the response of the maintenance
 * request received by <code>ReasonTypeService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>ReasonTypeDto
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.ReasonTypeDto
 */

public class ReasonTypeResponse extends AbstractResponse {

    /**
     * Generated serial version id.
     */
    private static final long serialVersionUID = 6931144014166204585L;

    /**
     * list to hold list of <code>ReasonTypeDto</code> object.
     */
    private List<ReasonTypeDto> reasonDtos = null;

    /**
     * <code>Default Constructor.</code>
     */
    public ReasonTypeResponse() {

    }

    /**
     * Gets the value of <code>ReasonTypeDto</code> property.
     * <p>
     * 
     * @return the current list of <code>ReasonTypeDto</code> property.
     */

    public List<ReasonTypeDto> getReasonDtos() {
        return this.reasonDtos;
    }

    /**
     * Sets the <code>ReasonTypeDto</code> property.
     * <p>
     * 
     * @param pReasonDtos
     *            the new list of <code>ReasonTypeDto</code> property.
     */

    public void setReasonDtos(final List<ReasonTypeDto> pReasonDtos) {
        this.reasonDtos = pReasonDtos;
    }

}
