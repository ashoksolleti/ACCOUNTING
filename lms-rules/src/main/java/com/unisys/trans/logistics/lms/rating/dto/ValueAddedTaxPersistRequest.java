/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>StateTaxPersistRequest</code> contains ValueAddedTaxDto which is to be persisted.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>valueAddedTax
 * </code>
 * </ul>
 */
public class ValueAddedTaxPersistRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5547371884261836972L;

    /**
     * Attribute to hold <code>valueAddedTax</code> property.
     */
    private ValueAddedTaxDto valueAddedTax;

    /**
     * <code>Default constructor.</code>
     */
    public ValueAddedTaxPersistRequest() {

    }

    /**
     * Gets the value of the <code>valueAddedTax</code> property.
     * <p>
     * 
     * @return the current value of the <code>valueAddedTax</code> property.<br>
     */
    public ValueAddedTaxDto getValueAddedTax() {
        return this.valueAddedTax;
    }

    /**
     * Sets the value of the <code>valueAddedTax</code> property.
     * <p>
     * 
     * @param pValueAddedTaxDto the new value of the <code>valueAddedTax</code> property.<br>
     */
    public void setValueAddedTax(final ValueAddedTaxDto pValueAddedTaxDto) {
        this.valueAddedTax = pValueAddedTaxDto;
    }

}
