/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AggregateFindRequest</code> retrieves the <code>Aggregate information</code>.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>code
 * <li>usageType
 * </code>
 * </ul>
 */
public class AggregateFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1230514658573874324L;

    /**
     * Attribute to hold <code>code</code> property.
     */
    private String code;

    /**
     * Attribute to hold <code>rcaIndicator</code> property.
     */
    private boolean rcaIndicator;

    /**
     * Attribute to hold <code>usageType</code> property.
     */
    private String usageType;
    public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	private Date fromDate;
    private Date toDate;

    /**
     * <code>Default constructor</code>.
     */
    public AggregateFindRequest() {

    }

    /**
     * Gets the <code>code</code> property.
     * <p>
     * <b>Format: </b><br>
     * 4-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * AFR1
     * <p>
     * 
     * @return the current value of the <code>code</code> property.<br>
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Gets the <code>rcaIndicator</code> property.
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @return the new value of the <code>rcaIndicator</code> property.<br>
     */
    public boolean getRcaIndicator() {
        return this.rcaIndicator;
    }

    /**
     * Gets the <code>usageType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * MY
     * <p>
     * 
     * @return the current value of the <code>usageType</code> property.<br>
     */
    public String getUsageType() {
        return this.usageType;
    }

    /**
     * Sets the <code>code</code> property.
     * <p>
     * <b>Format: </b><br>
     * 4-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * AFR1
     * <p>
     * 
     * @param pCode
     *            the new value of the <code>code</code> property.<br>
     */
    public void setCode(final String pCode) {
        this.code = ContractUtility.convertToUpperCase(pCode);
    }

    /**
     * Sets the <code>usageType</code> property.
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pRcaIndicator
     *            the new value of the <code>rcaIndicator</code> property.<br>
     */
    public void setRcaIndicator(final boolean pRcaIndicator) {
        this.rcaIndicator = pRcaIndicator;
    }

    /**
     * Sets the <code>usageType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * MY
     * <p>
     * 
     * @param pUsageType
     *            the new value of the <code>usageType</code> property.<br>
     */
    
    public void setUsageType(final String pUsageType) {
        this.usageType = ContractUtility.convertToUpperCase(pUsageType);
    }
    
    private boolean downloadInd;
 	public boolean isDownloadInd() {
 		return downloadInd;
 	}

 	public void setDownloadInd(boolean downloadInd) {
 		this.downloadInd = downloadInd;
 	}
      
}
