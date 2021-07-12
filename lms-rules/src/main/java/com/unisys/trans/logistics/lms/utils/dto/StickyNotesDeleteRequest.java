/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>StickyNotesDeleteRequest</code> is used for deleting the
 * <code>StickyNote</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>stickyNotesDto</code>
 * </ul>
 */
public class StickyNotesDeleteRequest extends AbstractRequest {
	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 5723326923405927011L;

	/**
	 * Attribute to hold the <code>stickyNotesDto</code> property.
	 */
	private StickyNotesDto stickyNotesDto;

	/**
	 * <code>Default constructor.</code>
	 */
	public StickyNotesDeleteRequest() {

	}

	/**
	 * Gets the <code>stickyNotesDto</code> property.
	 * <p>
	 * 
	 * @return the current value of <code>StickyNotesDto</code>.
	 */
	public StickyNotesDto getStickyNotesDto() {
		return stickyNotesDto;
	}

	/**
	 * Sets the <code>StickyNotesDto</code> property.
	 * <p>
	 * 
	 * @param pStickyNotesDto
	 *            the new value of <code>StickyNotesDto</code>.
	 */
	public void setStickyNotesDto(StickyNotesDto pStickyNotesDto) {
		this.stickyNotesDto = pStickyNotesDto;
	}

}
