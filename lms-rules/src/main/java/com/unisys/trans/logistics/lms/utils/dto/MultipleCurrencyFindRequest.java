/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.util.Date;

/**
 * <code>MultipleCurrencyFindRequest</code> is used for finding the currency information.
 * <p>
 * This class contains the following attribute:<br>
 * <ul>
 * <code>
 * <li>inputDate
 * </code>
 * </ul>
 */
public class MultipleCurrencyFindRequest extends MultipleFindRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8940246023420674269L;

    /**
     * Attribute to hold the <code>inputDate</code> property.
     */
    private Date inputDate;

    /**
     * <code>Default Constructor</code>.
     * <p>
     */
    public MultipleCurrencyFindRequest() {

    }

    /**
     * Gets the <code>inputDate</code>.
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @return the current value of the <code>inputDate</code> property.<br>
     */
    public Date getInputDate() {
        return ContractUtility.getClonedDate(this.inputDate);
    }

    /**
     * Sets the value of the <code>inputDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @param pInputDate The new value of the <code>inputDate</code> property.
     *            <p>
     */
    public void setInputDate(final Date pInputDate) {
        this.inputDate = ContractUtility.getClonedDate(pInputDate);
    }
}
