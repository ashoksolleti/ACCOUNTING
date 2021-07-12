/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ULDPrefixSerialRangePersistRequest</code> is used for creating and updating the
 * <code>ULDPrefix</code> and <code>ULDSerialRange</code>.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <li><code>uldPrefixDto</code> <br>
 * </ul>
 */
public class ULDPrefixSerialRangePersistRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2645795989668017728L;

    /**
     * Attribute to hold <code>uldPrefixDto</code> property.
     */
    private ULDPrefixDto uldPrefix;

    /**
     * <code>Default constructor</code>.
     */
    public ULDPrefixSerialRangePersistRequest() {

    }

    /**
     * Gets the <code>uldPrefixDto</code> property.
     * <p>
     * 
     * @return the current value of <code>uldPrefix</code> property.
     */
    public ULDPrefixDto getUldPrefix() {

        return this.uldPrefix;
    }

    /**
     * Sets the <code>UldPrefixDto</code> property.
     * <p>
     * 
     * @param pUldPrefixDto the new value of the <code>uldPrefix</code> property.
     */
    public void setUldPrefix(final ULDPrefixDto pUldPrefixDto) {
        this.uldPrefix = pUldPrefixDto;
    }
}
