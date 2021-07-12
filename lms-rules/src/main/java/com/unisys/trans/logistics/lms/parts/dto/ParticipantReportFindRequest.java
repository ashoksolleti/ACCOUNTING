/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ParticipantReportFindRequest</code> is used for retrieving <code>Participant</code> information along
 * with
 * FreightParticipant or ULDParticipant or Both FreightParticipant and ULDParticipant.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>currency</code>
 * <li><code>download</code>
 * <li><code>location</code>
 * <li><code>maximumAmount</code>
 * <li><code>minimumAmount</code>
 * <li><code>type</code>
 * </ul>
 */
public class ParticipantReportFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7755849098402455659L;

    /**
     * Attribute to hold <code>currency</code> property.
     */
    private String currency;

    /**
     * Attribute to hold <code>initialRequest</code> property.
     */
    private boolean initialRequest;

    /**
     * Attribute to hold <code>location</code> property.
     */
    private String location;

    /**
     * Attribute to hold <code>maximumAmount</code> property.
     */
    private BigDecimal maximumAmount;

    /**
     * Attribute to hold <code>minimumAmount</code> property.
     */
    private BigDecimal minimumAmount;

    /**
     * Attribute to hold <code>pageNumber</code> property.
     */
    private int pageNumber;

    /**
     * Attribute to hold <code>type</code> property.
     */
    private String type;

    private boolean columnsAvailable;

    /**
     * Attribute to hold <code>viewAllReport</code> property.
     */
    private boolean viewAllReport;
    
    private boolean dwnpartcontactdetail;
    /**
     * Attribute to hold <code>dwnpartdetail</code> property.
     */
    private boolean dwnpartdetail;//CR-2000738
    
    /**
     * <code>Default constructor.</code>
     */
    public ParticipantReportFindRequest() {

    }

    /**
     * Get the <code>currency</code> property.
     * 
     * @return the current value of the <code>currency</code> property.
     */
    public String getCurrency() {
        return ContractUtility.convertToUpperCase(this.currency);
    }

    /**
     * Get the <code>location</code> property.
     * 
     * @return the current value of the <code>location</code> property.
     */
    public String getLocation() {
        return ContractUtility.convertToUpperCase(this.location);
    }

    /**
     * Get the <code>maximumAmount</code> property.
     * 
     * @return the current value of the <code>maximumAmount</code> property.
     */
    public BigDecimal getMaximumAmount() {
        return this.maximumAmount;
    }

    /**
     * Get the <code>minimumAmount</code> property.
     * 
     * @return the current value of the <code>minimumAmount</code> property.
     */
    public BigDecimal getMinimumAmount() {
        return this.minimumAmount;
    }

    /**
     * Get the <code>pageNumber</code> property.
     * 
     * @return the pageNumber
     */
    public int getPageNumber() {
        return this.pageNumber;
    }

    /**
     * Get the <code>type</code> property.
     * 
     * @return the current value of the <code>type</code> property.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Gets the <code>initialRequest</code> property.
     * 
     * @return the initialRequest
     */
    public boolean isInitialRequest() {
        return this.initialRequest;
    }

    public boolean isColumnsAvailable() {
		return columnsAvailable;
	}

	public void setColumnsAvailable(boolean columnsAvailable) {
		this.columnsAvailable = columnsAvailable;
	}

	/**
     * Set the <code>currency</code> property.
     * 
     * @param pCurrency
     *            holds the new value of the <code>currency</code> property.
     */
    public void setCurrency(final String pCurrency) {
        this.currency = ContractUtility.convertToUpperCase(pCurrency);
    }

    /**
     * Sets the <code>initialRequest</code> property.
     * 
     * @param initialRequest the initialRequest to set
     */
    public void setInitialRequest(final boolean initialRequest) {
        this.initialRequest = initialRequest;
    }

    /**
     * Set the <code>location</code> property.
     * 
     * @param pLocation
     *            holds the new value of the <code>location</code> property.
     */
    public void setLocation(final String pLocation) {
        this.location = ContractUtility.convertToUpperCase(pLocation);
    }

    /**
     * Set the <code>maximumAmount</code> property.
     * 
     * @param pMaximumAmount
     *            holds the new value of the <code>maximumAmount</code> property.
     */
    public void setMaximumAmount(final BigDecimal pMaximumAmount) {
        this.maximumAmount = pMaximumAmount;
    }

    /**
     * Set the <code>minimumAmount</code> property.
     * 
     * @param pMinimumAmount
     *            holds the new value of the <code>minimumAmount</code> property.
     */
    public void setMinimumAmount(final BigDecimal pMinimumAmount) {
        this.minimumAmount = pMinimumAmount;
    }

    /**
     * Set the <code>pageNumber</code> property.
     * 
     * @param pPageNumber the pageNumber to set
     */
    public void setPageNumber(final int pPageNumber) {
        this.pageNumber = pPageNumber;
    }

    /**
     * Set the <code>type</code> property.
     * 
     * @param pType
     *            holds the new value of the <code>type</code> property.
     */
    public void setType(final String pType) {
        this.type = pType;
    }

	/**
	 * @return the viewAllReport
	 */
	public boolean isViewAllReport() {
		return viewAllReport;
	}

	/**
	 * @param viewAllReport the viewAllReport to set
	 */
	public void setViewAllReport(boolean viewAllReport) {
		this.viewAllReport = viewAllReport;
	}

	/**
	 * @return the dwnpartcontactdetail
	 */
	public boolean isDwnpartcontactdetail() {
		return dwnpartcontactdetail;
	}

	/**
	 * @param dwnpartcontactdetail the dwnpartcontactdetail to set
	 */
	public void setDwnpartcontactdetail(boolean dwnpartcontactdetail) {
		this.dwnpartcontactdetail = dwnpartcontactdetail;
	}

	public boolean isDwnpartdetail() {
		return dwnpartdetail;
	}

	public void setDwnpartdetail(boolean dwnpartdetail) {
		this.dwnpartdetail = dwnpartdetail;
	}

}