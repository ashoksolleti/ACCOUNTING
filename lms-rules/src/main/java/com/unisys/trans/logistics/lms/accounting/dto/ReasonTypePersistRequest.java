/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ReasonTypePersistRequest</code> class represents the request to update
 * reasonType information details.
 * <p>
 * <code>ReasonTypePersistRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>ReasonTypeDto
 * </code>
 * </ul>
 */
public class ReasonTypePersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3133284262501496486L;

    /**
     * list to hold list of <code>ReasonTypeDto</code> object.
     */
    private List<ReasonTypeDto> reasonDtos = null;

    /**
     * <code>Default Constructor.</code>
     */

    public ReasonTypePersistRequest() {

    }

    /**
     * Gets the <code>reasonTypeDto</code> property.
     * <p>
     * 
     * @return the current list of <code>reasonTypeDto</code> property.
     */
    public List<ReasonTypeDto> getReasonDtos() {
        if (reasonDtos == null) {
            reasonDtos = new ArrayList<ReasonTypeDto>();
        }
        return this.reasonDtos;
    }

    /**
     * Sets the <code>reasonTypeDto</code> property.
     * <p>
     * 
     * @param pReasonDtos
     *            the new list of the <code>reasonTypeDto</code> property.
     */

    public void setReasonDtos(final List<ReasonTypeDto> pReasonDtos) {
        this.reasonDtos = pReasonDtos;
    }

}
