/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>RateSourceFindRequest</code> is used for retrieving
 * <code>RateSource</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>rateSourceCode</code>
 * </ul>
 */

public class FctlUpdateRequest extends AbstractRequest {

	/**
	 * Default serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Attribute to hold <code>rateSourceCode</code> property.
	 */
	private FctlUpdateDto fctlUpdateDto;

	/**
	 * <code>Default Constructor.</code>
	 */
	public FctlUpdateRequest() {
	}

	/**
	 * Gets the <code>RateSourceCode</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 3 Characters
	 * <p>
	 * <b>Example: </b><br>
	 * IRI
	 * <p>
	 * 
	 * @return the current value of the <code>rateSourceCode</code> property.
	 */
	public FctlUpdateDto getFctlUpdateDto() {
		return this.fctlUpdateDto;
	}

	/**
	 * Sets the <code>RateSourceCode</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 3 Characters
	 * <p>
	 * <b>Example: </b><br>
	 * IRI
	 * <p>
	 * 
	 * @param pRateSourceCode
	 *            the new value of the <code>rateSourceCode</code> property.
	 */
	public void setFctlUpdateDto(final FctlUpdateDto pFctlUpdateDto) {
		this.fctlUpdateDto = pFctlUpdateDto;
	}
}
