/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AddOnRateFindDto</code> contain details to retrieve AddOnRate
 * Information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>carrierCode
 * <li>currencyCode
 * <li>cityToBeConstructedCode
 * <li>cityOfConstructionCode
 * <li>iataAreaZone
 * <li>rateSourceCode
 * <li>rateTypeCode
 * </ul>
 */
public class AddOnRateMultipleFindDto extends AddOnRateFindDto {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>carrierCodes</code> property.
     */
    private List<String> carrierCodes;

	/**
	 * Attribute to hold <code>rateTypeCodes</code> property.
	 */
	private List<String> rateTypeCodes;

    /**
     * Attribute to hold <code>rcaCodes</code> property.
     */

    private List<Integer> rcaCodes;

    /**
     * Attribute to hold <code>executionDate</code> property.
     */
    private Date executionDate;

	/**
	 * @param rateTypeCodes
	 *            the rateTypeCodes to set
	 */
	public void addRateTypeCodes(String pRateTypeCodes) {
		if (this.rateTypeCodes == null) {
			this.rateTypeCodes = new ArrayList<String>();
		}
		this.rateTypeCodes.add(pRateTypeCodes);
	}
	
    /**
     * Gets the list of <code>carrierCodes</code> associated with the
     * Addon Rate.
     * <p>
     * 
     * @return the current list of <code>carrierCodes</code> associated
     *         with a Addon Rate.
     */
    public List<String> getCarrierCodes() {
        return this.carrierCodes;
    }

    /**
     * Sets the list of <code>carrierCodes</code> associated with Spot Rate.
     * <p>
     * 
     * @param pCarrierCodes
     *            the new list of <code>carrierCodes</code> associated with
     *            Add on Rate.<br>
     */
    public void setCarrierCodes(final List<String> pCarrierCodes) {
        this.carrierCodes = pCarrierCodes;
    }

	/**
	 * @return the rateTypeCodes
	 */
	public List<String> getRateTypeCodes() {
		return rateTypeCodes;
	}
	
    /**
     * Gets the list of <code>rcaCodes</code> associated with the
     * Add on Rates..
     * <p>
     * 
     * @return the current list of <code>rcaCodes</code> associated
     *         with a Addon Rate.
     */
    public List<Integer> getRcaCodes() {
        return this.rcaCodes;
    }

	/**
	 * @param rateTypeCodes
	 *            the rateTypeCodes to set
	 */
	public void setRateTypeCodes(List<String> pRateTypeCodes) {
		this.rateTypeCodes = pRateTypeCodes;
	}
	
    /**
     * Sets the list of <code>rcaCodes</code> associated with Spot Rate.
     * <p>
     * 
     * @param pRcaCodes
     *            the new list of <code>rcaCodes</code> associated with
     *            Add on Rate.<br>
     */
    public void setRcaCodes(List<Integer> pRcaCodes) {
        this.rcaCodes = pRcaCodes;
    }

    /**
     * Gets the <code>EffectivePeriod</code> property.
     * <p>
     * 
     * @return the current value of the <code>effectivePeriod</code> property.
     */
    public Date getExecutionDate() {
        return ContractUtility.getClonedDate(this.executionDate);
    }

    /**
     * Sets the <code>executionDate</code> data transfer object.
     * <p>
     * 
     * @param pExecutionDate
     *            holds the new value of <code>executionDate</code> data
     *            transfer object.<br>
     */
    public void setExecutionDate(final Date pExecutionDate) {
        this.executionDate = ContractUtility.getClonedDate(pExecutionDate);
    }

}
