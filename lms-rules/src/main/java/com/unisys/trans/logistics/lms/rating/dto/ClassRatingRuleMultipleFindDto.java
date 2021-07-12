/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ClassRatingRuleFindDto</code> contain details to retrieve
 * ClassRatingRule Information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>iataAreaTo
 * <li>iataAreaFrom
 * <li>classRatingId
 * <li>rateSource
 * <li>carrierCode
 * </ul>
 */
public class ClassRatingRuleMultipleFindDto extends ClassRatingRuleFindDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7372369821831170038L;

    /**
     * Attribute to hold <code>carrierCodes</code> property.
     */
    private List<String> carrierCodes;

    /**
     * Attribute to hold <code>destinationCodes</code> property.
     */
    private List<String> destinationCodes;

    /**
     * Attribute to hold <code>executionDate</code> property.
     */
    private Date executionDate;

    /**
     * Attribute to hold <code>originCodes</code> property.
     */
    private List<String> originCodes;

    /**
     * Gets the list of <code>carriers</code> associated with the
     * class rating rule.
     * <p>
     * 
     * @return the current list of <code>carriers</code> associated
     *         with a class rating rule.
     */
    public List<String> getCarrierCodes() {
        return this.carrierCodes;
    }

    /**
     * Gets the list of <code>destinationCodes</code> associated with the
     * class rating rule.
     * <p>
     * 
     * @return the current list of <code>destinationCodes</code> associated
     *         with a class rating rule.
     */
    public List<String> getDestinationCodes() {
        return this.destinationCodes;
    }

    /**
     * Gets the <code>executionDate</code> associated with the
     * class rating rule.
     * <p>
     * 
     * @return the current list of <code>executionDate</code> associated
     *         with a class rating rule.
     */
    public Date getExecutionDate() {
        return ContractUtility.getClonedDate(this.executionDate);
    }

    /**
     * Gets the list of <code>originCodes</code> associated with the
     * class rating rule.
     * <p>
     * 
     * @return the current list of <code>originCodes</code> associated
     *         with a class rating rule.
     */
    public List<String> getOriginCodes() {
        return this.originCodes;
    }

    /**
     * Sets the list of <code>carrierCodes</code> associated with class rating rule.
     * <p>
     * 
     * @param pCarrierCodes
     *            the new list of <code>carrierCodes</code> associated with
     *            class rating rule.<br>
     */
    public void setCarrierCodes(final List<String> pCarrierCodes) {
        this.carrierCodes = pCarrierCodes;
    }

    /**
     * Sets the list of <code>destinationCodes</code> associated with class rating rule.
     * <p>
     * 
     * @param pDestinationCodes
     *            the new list of <code>destinationCodes</code> associated with
     *            class rating rule.<br>
     */
    public void setDestinationCodes(final List<String> pDestinationCodes) {
        this.destinationCodes = pDestinationCodes;
    }

    /**
     * Sets the list of <code>executionDate</code> associated with class rating rule.
     * <p>
     * 
     * @param pExecutionDate
     *            the new list of <code>executionDate</code> associated with
     *            class rating rule.<br>
     */
    public void setExecutionDate(final Date pExecutionDate) {
        this.executionDate = ContractUtility.getClonedDate(pExecutionDate);
    }

    /**
     * Sets the list of <code>originCodes</code> associated with class rating rule.
     * <p>
     * 
     * @param pOriginCodes
     *            the new list of <code>originCodes</code> associated with
     *            class rating rule.<br>
     */
    public void setOriginCodes(final List<String> pOriginCodes) {
        this.originCodes = pOriginCodes;
    }

}
