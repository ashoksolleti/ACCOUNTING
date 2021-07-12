/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ULDTypePersistRequest</code> class represents the request to persist uld type information.
 * <p>
 * ULDType information is persisted based on the following attribute: <code>
 * <ul>
 * <li>uldType
 * </ul>
 * </code>
 */
public class ULDTypePersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2735797547818554829L;

    /**
     * Attribute to hold <code>ULDType</code> property.
     */
    private ULDTypeDto uldType;

    /**
     * <code>Default constructor.</code>
     */
    public ULDTypePersistRequest() {

    }

    /**
     * Gets the <code>uldType</code> property.
     * <p>
     * Unique Identifier.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabets.<br>
     * <p>
     * <b>Example :</b><br>
     * 1S
     * <p>
     * 
     * @return the current value of the <code>uldType</code> property.<br>
     */
    public ULDTypeDto getUldType() {
        return this.uldType;
    }

    /**
     * Sets the <code>uldType</code> property.
     * <p>
     * Unique Identifier.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabets.<br>
     * <p>
     * <b>Example :</b><br>
     * 1S
     * <p>
     * 
     * @param pULDTypeDto the new value of the <code>uldType</code> property.<br>
     */
    public void setUldType(final ULDTypeDto pULDTypeDto) {
        this.uldType = pULDTypeDto;
    }
}
