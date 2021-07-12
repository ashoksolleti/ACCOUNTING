/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto.ucs;

import java.io.Serializable;

//import org.codehaus.jackson.annotate.JsonWriteNullProperties;

import com.unisys.trans.logistics.lms.framework.dto.ucs.DelayType;

/**
 * <code>DelayDetailsDto</code> is used for Delay Reason Details.
 * <p>
 * This class contains the following attribute:<br>
 * <ul>
 * <li><code>delayDuration</code></li>
 * <li><code>delayReasonCode</code></li>
 * </ul>
 */
//@JsonWriteNullProperties(false)
public class DelayDetailsDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2741609266150829794L;

    /**
     * Attribute to hold <code>delayDuration</code> property.
     */
    private String delayDuration;

    /**
     * Attribute to hold <code>delayReasonCode</code> property.
     */
    private String delayReasonCode;
    
    private String delayReason;

    /**
     * Attribute to hold <code>delayType</code> property.
     */
    private DelayType delayType;

    /**
     * Gets the value of the <code>delayDuration</code> property.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the current value of the <code>delayDuration</code> property.<br>
     *         </p>
     */
    public String getDelayDuration() {

        return this.delayDuration;
    }

    /**
     * Gets the value of the <code>delayReasonCode</code> property.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the current value of the <code>delayReasonCode</code> property.<br>
     *         </p>
     */
    public String getDelayReasonCode() {
        return this.delayReasonCode;
    }

    /**
     * Gets the value of the <code>delayType</code> property.
     * <p>
     * 
     * @return <code>{@link com.unisys.trans.logistics.lms.flights.dto.constants.DelayType}</code><br>
     *         Returns the current value of the <code>delayType</code> property.<br>
     *         </p>
     */
    public DelayType getDelayType() {
        return this.delayType;
    }

    /**
     * Sets the value of the <code>delayDuration</code> property.
     * <p>
     * <b>Format: </b><br>
     * 4 Numeric<br>
     * <b>Example: </b><br>
     * 1230
     * 
     * @param pDelayDuration
     *            <code>String</code><br>
     *            New value of the <code>pDelayDuration</code> property<br>
     *            </p>
     */
    public void setDelayDuration(final String pDelayDuration) {
        this.delayDuration = pDelayDuration;
    }

    /**
     * Sets the value of the <code>delayReasonCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Numeric<br>
     * <b>Example: </b><br>
     * 12
     * 
     * @param pDelayReasonCode
     *            <code>String</code><br>
     *            New value of the <code>delayReasonCode</code> property<br>
     *            </p>
     */
    public void setDelayReasonCode(final String pDelayReasonCode) {
        this.delayReasonCode = pDelayReasonCode;
    }

    /**
     * Sets the value of the <code>delayReasonCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Numeric<br>
     * <b>Example: </b><br>
     * 12
     * 
     * @param pDelayType
     *            <code>{@link com.unisys.trans.logistics.lms.flights.dto.constants.DelayType}</code><br>
     *            New value of the <code>delayType</code> property<br>
     *            </p>
     */
    public void setDelayType(final DelayType pDelayType) {

        this.delayType = pDelayType;
    }

	public String getDelayReason() {
		return this.delayReason;
	}

	public void setDelayReason(String pDelayReason) {
		this.delayReason = pDelayReason;
	}
}
