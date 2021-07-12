/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>USGovernmentTaxPersistRequest</code> contains USGovernmentTaxDto which is to be persisted.
 * <p>
 * This contains the following attribute:<br>
 * <ul>
 * <code>
 * <li>usGovernmentTax
 * </code>
 * </ul>
 */
public class USGovernmentTaxPersistRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4328657754582862227L;

    /**
     * Attribute to hold <code>uSGovernmentTax</code> property.
     */
    private USGovernmentTaxDto uSGovernmentTax;

    /**
     * <code>Default constructor.</code>
     */
    public USGovernmentTaxPersistRequest() {
    }

    /**
     * Gets the value of the <code>usGovernmentTax</code> property.
     * <p>
     * 
     * @return the current value of the <code>destination</code> property.<br>
     */
    public USGovernmentTaxDto getUSGovernmentTax() {
        return this.uSGovernmentTax;
    }

    /**
     * Sets the value of the <code>usGovernmentTax</code> property.
     * <p>
     * 
     * @param pUSGovernmentTaxDto the new value of the <code>stateTaxTypeCode</code> property.<br>
     */
    public void setUSGovernmentTax(final USGovernmentTaxDto pUSGovernmentTaxDto) {
        this.uSGovernmentTax = pUSGovernmentTaxDto;
    }

}
