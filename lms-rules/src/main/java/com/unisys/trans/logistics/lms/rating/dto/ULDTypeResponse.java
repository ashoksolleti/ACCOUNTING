/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>ULDTypeResponse</code> contains the response of the maintenance request received by
 * <code>ULDTypeResponseService</code>.
 * <p>
 * <ul>
 * <li><code>theAbstractResponse</code></li>
 * <li><code>uldTypes</code></li>
 * </ul>
 */
public class ULDTypeResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 4983642952375921402L;

    /**
     * Attribute to hold collection of <code>ULDTypes</code> object.<br>
     */
    private List<ULDTypeDto> uldTypes = new ArrayList<ULDTypeDto>();

    /**
     * <code>Default constructor.</code>
     */
    public ULDTypeResponse() {

    }

    /**
     * Adds the <code>ULDTypes</code> objects while assembling <code>ULDTypeDto</code>.
     * <p>
     * 
     * @param pUldTypeDto <code>List</code><br>
     *            Holds the <code>ULDTypes</code> type details.<br>
     *            </p>
     */
    public void addULDType(final ULDTypeDto pUldTypeDto) {
        this.uldTypes.add(pUldTypeDto);
    }

    /**
     * Gets the value of <code>ULDType</code> property.
     * <p>
     * 
     * @return <code>ArrayList </code><br>
     *         Returns the <code>ULDType</code>.<br>
     *         </p>
     */
    public List<ULDTypeDto> getUldTypes() {
        return this.uldTypes;
    }

    /**
     * Sets the value of the <code>ULDTypes</code> property.
     * <p>
     * 
     * @param pULDTypeDtos <code>ArrayList</code><br>
     *            The new value of the <code>ULDTypes</code> property.<br>
     *            </p>
     */
    public void setUldTypes(final List<ULDTypeDto> pULDTypeDtos) {
        this.uldTypes = pULDTypeDtos;
    }
}
