/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.util.Date;

/**
 * <code>StationLocalTimeFindResponse </code> represents the response object which holds the station's local
 * date and time.
 * <p>
 * <code>StationLocalTimeFindResponse </code> contains the following attribute:<br>
 * <ul>
 * <code>
 * <li>localDate
 * </code>
 * </ul>
 */
public class StationLocalTimeFindResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8344607397213574841L;

    /**
     * Attribute to hold the <code>localDate</code> property.
     */
    private Date localDate;

    /**
     * <code>Default constructor.</code>
     */
    public StationLocalTimeFindResponse() {

    }

    /**
     * Gets the value of the <code>localDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 30JUN07
     * <p>
     * 
     * @return the current value of the <code>localDate</code> property.
     */
    public Date getLocalDate() {
        return ContractUtility.getClonedDate(this.localDate);
    }

    /**
     * Sets the value of the <code>localDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 01JAN07
     * <p>
     * 
     * @param pLocalDate the new value of the <code>localDate</code> property.<br>
     */
    public void setLocalDate(final Date pLocalDate) {
        this.localDate = ContractUtility.getClonedDate(pLocalDate);
    }
}
