/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>StateTaxPersistRequest</code> contains StateTaxDto which is to be persisted.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <code>
 * <li>stateTax
 * </code>
 * </ul>
 */
public class StateTaxPersistRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 7856491359616698348L;

    /**
     * Attribute to hold <code>stateTax</code> property.
     */
    private StateTaxDto stateTax;

    /**
     * <code>Default constructor.</code>
     */
    public StateTaxPersistRequest() {
    }

    /**
     * Gets the value of the <code>stateTax</code> property.
     * <p>
     * A tax code that is applied at the country level may have province/state exceptions, or it may apply
     * only to specific province/states. In the same manner, a tax code that is applied at the province/ state
     * level may have airport exceptions,or it may apply only to specific airports.
     * <p>
     * 
     * @return the current value of the <code>stateTax</code> property.<br>
     */
    public StateTaxDto getStateTax() {
        return this.stateTax;
    }

    /**
     * Sets the value of the <code>stateTax</code> property.
     * <p>
     * A tax code that is applied at the country level may have province/state exceptions, or it may apply
     * only to specific province/states. In the same manner, a tax code that is applied at the province/ state
     * level may have airport exceptions,or it may apply only to specific airports.
     * <p>
     * 
     * @param pStateTaxDto the new value of the <code>stateTax</code> property.<br>
     */
    public void setStateTax(final StateTaxDto pStateTaxDto) {
        this.stateTax = pStateTaxDto;
    }
}
