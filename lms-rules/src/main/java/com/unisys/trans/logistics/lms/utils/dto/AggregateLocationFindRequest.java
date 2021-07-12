/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.constants.GeographicType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.utils.dto.constants.AggregateType;

/**
 * <code>AggregateLocationFindRequest</code> retrieves the
 * <code>Aggregate information</code>.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>sourceCode
 * <li>sourceType
 * <li>sourceMemberType
 * <li>targetCode
 * <li>targetType
 * <li>targetMemberType
 * </code>
 * </ul>
 */

public class AggregateLocationFindRequest extends AbstractRequest {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 8872459679631040233L;

	/**
	 * Attribute to hold <code>countryCode</code> property.
	 */
	private String countryCode;

	/**
	 * Attribute to hold if marked for deletion validation needs to be ignored.
	 * Set only for PFM - City deletion flow.  False for all other flows.
	 */
	private boolean ignoreValidation;

	/**
	 * Attribute to hold <code>rcaIndicator</code> property.
	 */
	private boolean rcaIndicator;

	/**
	 * Attribute to hold <code>sourceCode</code> property.
	 */
	private String sourceCode;

	/**
	 * Attribute to hold <code>sourceMemberType</code> property.
	 */
	private AggregateType sourceMemberType;

	/**
	 * Attribute to hold <code>sourceType</code> property.
	 */
	private GeographicType sourceType;

	/**
	 * Attribute to hold <code>targetCode</code> property.
	 */
	private String targetCode;

	/**
	 * Attribute to hold <code>targetMemberType</code> property.
	 */
	private AggregateType targetMemberType;
	
	/**
	 * Attribute to hold <code>targetType</code> property.
	 */
	private GeographicType targetType;

    /**
	 * <code>Default constructor</code>.
	 */
	public AggregateLocationFindRequest() {
	}

    /**
	 * Gets the <code>countryCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>countryCode</code> property.<br>
	 */
	public String getCountryCode() {
		return this.countryCode;
	}

    /**
	 * Gets the <code>rcaIndicator</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>rcaIndicator</code> property.<br>
	 */
	public boolean getRcaIndicator() {
		return this.rcaIndicator;
	}

	/**
	 * Gets the <code>sourceCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>sourceCode</code> property.<br>
	 */
	public String getSourceCode() {
		return this.sourceCode;
	}

	/**
	 * Gets the <code>sourceMemberType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>sourceMemberType</code> property.<br>
	 */
	public AggregateType getSourceMemberType() {
		return this.sourceMemberType;
	}

	/**
	 * Gets the <code>sourceType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>sourceType</code> property.<br>
	 */
	public GeographicType getSourceType() {
		return this.sourceType;
	}

	/**
	 * Gets the <code>targetCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>targetCode</code> property.<br>
	 */
	public String getTargetCode() {
		return this.targetCode;
	}

	/**
	 * Gets the <code>targetMemberType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>targetMemberType</code> property.<br>
	 */
	public AggregateType getTargetMemberType() {
		return this.targetMemberType;
	}

	/**
	 * Gets the <code>targetType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>targetType</code> property.<br>
	 */
	public GeographicType getTargetType() {
		return this.targetType;
	}

	/**
     * Gets the <code>ignoreValidation</code> property.
     * <p>
     * 
     * @return the current value of the <code>ignoreValidation</code> property.<br>
     */	
	public boolean isIgnoreValidation() {
        return this.ignoreValidation;
    }

	/**
	 * Sets the <code>countryCode</code> property.
	 * 
	 * <p>
	 * 
	 * @param pCountryCode
	 *            the new value of the <code>countryCode</code> property.<br>
	 */
	public void setCountryCode(final String pCountryCode) {
		this.countryCode = pCountryCode;
	}

	/**
     * Sets the <code>ignoreValidation</code> property.
     * 
     * <p>
     * 
     * @param pIgnoreValidation
     *            the new value of the <code>ignoreValidation</code> property.<br>
     */	
    public void setIgnoreValidation(final boolean pIgnoreValidation) {
        this.ignoreValidation = pIgnoreValidation;
    }

	/**
	 * Sets the <code>rcaIndicator</code> property.
	 * 
	 * <p>
	 * 
	 * @param pRcaIndicator
	 *            the new value of the <code>rcaIndicator</code> property.<br>
	 */
	public void setRcaIndicator(final boolean pRcaIndicator) {
		this.rcaIndicator = pRcaIndicator;
	}

	/**
	 * Sets the <code>sourceCode</code> property.
	 * 
	 * <p>
	 * 
	 * @param pSourceCode
	 *            the new value of the <code>sourceCode</code> property.<br>
	 */
	public void setSourceCode(final String pSourceCode) {
		this.sourceCode = pSourceCode;
	}

	/**
	 * Sets the <code>sourceMemberType</code> property.
	 * 
	 * <p>
	 * 
	 * @param pSourceMemberType
	 *            the new value of the <code>sourceMemberType</code> property.<br>
	 */
	public void setSourceMemberType(final AggregateType pSourceMemberType) {
		this.sourceMemberType = pSourceMemberType;
	}

	/**
	 * Sets the <code>sourceType</code> property.
	 * 
	 * <p>
	 * 
	 * @param pSourceType
	 *            the new value of the <code>sourceType</code> property.<br>
	 */
	public void setSourceType(final GeographicType pSourceType) {
		this.sourceType = pSourceType;
	}

	/**
	 * Sets the <code>targetCode</code> property.
	 * 
	 * <p>
	 * 
	 * @param pTargetCode
	 *            the new value of the <code>targetCode</code> property.<br>
	 */
	public void setTargetCode(final String pTargetCode) {
		this.targetCode = pTargetCode;
	}

	/**
	 * Sets the <code>targetMemberType</code> property.
	 * 
	 * <p>
	 * 
	 * @param pTargetMemberType
	 *            the new value of the <code>targetMemberType</code> property.<br>
	 */
	public void setTargetMemberType(final AggregateType pTargetMemberType) {
		this.targetMemberType = pTargetMemberType;
	}

	/**
	 * Sets the <code>targetType</code> property.
	 * 
	 * <p>
	 * 
	 * @param pTargetType
	 *            the new value of the <code>targetType</code> property.<br>
	 */
	public void setTargetType(final GeographicType pTargetType) {
		this.targetType = pTargetType;
	}

}
