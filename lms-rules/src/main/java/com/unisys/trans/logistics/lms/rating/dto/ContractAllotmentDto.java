/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.ValidityTimeDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.AllotmentCategoryType;

/**
 * <code>AllotmentDto</code> contain details of Allotment.
 * <p>
 * This contains all information about Allotment.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>allotmentId
 * <li>allotmentType
 * <li>allDays
 * <li>allotmentId
 * <li>oId
 * <li>validityTimes
 * </ul>
 */
public class ContractAllotmentDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5178041821201640717L;

    /**
     * Attribute to hold <code>allDays</code> property.
     */
    private boolean allDays;

    /**
     * Attribute to hold <code>allotmentId</code> property.
     */
    private String allotmentId;

    /**
     * Attribute to hold <code>allotmentType</code> property.
     */
    private AllotmentCategoryType allotmentType;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>validityTimes</code> property.
     */
    private List<ValidityTimeDto> validityTimes;

    /**
     * Gets the <code>AllDays</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>AllDays</code> property.
     */
    public boolean getAllDays() {
        return this.allDays;
    }

    /**
     * Gets the <code>AllotmentId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric Characters
     * <p>
     * <b>Example: </b><br>
     * ALLO1
     * <p>
     * 
     * @return the current value of the <code>AllotmentId</code> property.
     */
    public String getAllotmentId() {
        return this.allotmentId;
    }

    /**
     * Gets the <code>allotmentType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric Characters
     * <p>
     * <b>Example: </b><br>
     * ALLO1
     * <p>
     * 
     * @return the current value of the <code>allotmentType</code> property.
     */
    public AllotmentCategoryType getAllotmentType() {
        return this.allotmentType;
    }

    /**
     * Gets the <code>oid</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>ValidityTimeDto </code> data transfer object.
     * <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ValidityTimeDto
     *         ValidityTimeDto}</code><br>
     *         the current value of <code>ValidityTimes</code> data transfer
     *         object.<br>
     */
    public List<ValidityTimeDto> getValidityTimes() {
        return this.validityTimes;
    }

    /**
     * Sets the <code>AllDays</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pAllDays
     *            the current value of the <code>AllDays</code> property.
     */
    public void setAllDays(final boolean pAllDays) {
        this.allDays = pAllDays;
    }

    /**
     * Sets the <code>AllotmentId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric Characters
     * <p>
     * <b>Example: </b><br>
     * ALLO1
     * <p>
     * 
     * @param pAllotmentId
     *            the current value of the <code>AllotmentId</code> property.
     */
    public void setAllotmentId(final String pAllotmentId) {
        this.allotmentId = ContractUtility.convertToUpperCase(pAllotmentId);
    }

    /**
     * Sets the <code>allotmentType</code> property.
     * <p>
     * 
     * @param pAllotmentType
     *            the new value of the <code>allotmentType</code> property.
     */
    public void setAllotmentType(final AllotmentCategoryType pAllotmentType) {
        this.allotmentType = pAllotmentType;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.ValidityTimeDto
     * ValidityTimeDto} containing <code>Destination</code> details.
     * <p>
     * 
     * @param pValidityTimes
     *            holds the new value of <code>ValidityTimes</code> type
     *            details.<br>
     */

    public void setValidityTimes(final List<ValidityTimeDto> pValidityTimes) {
        this.validityTimes = pValidityTimes;
    }

}
