/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>StickyNotesFindRequest</code> is used for retrieving user notes
 * information based on <code>userId</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>userId
 * </code>
 * </ul>
 */
public class StickyNotesFindRequest extends AbstractRequest {
	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = -187785970882398889L;

	/**
	 * Attribute to hold <code>userId</code> property.
	 * <p>
	 * The userId is used to retrieve all available user notes.
	 */
	private String userId;

	/**
	 * Attribute to hold <code>stickyNotesDto</code> property.
	 * <p>
	 * The stickyNotesDto is used to retrieve all available user notes for the
	 * current user agent.
	 */

	private StickyNotesDto stickyNotesDto;

	/**
	 * <code>Default constructor. </code>
	 */
	public StickyNotesFindRequest() {

	}

	/**
	 * Gets the <code>userId</code> property.
	 * 
	 * @return the current value of <code>userId</code> of the user.<br>
	 */

	public String getUserId() {
		return userId;
	}

	/**
	 * Sets the <code>userId</code> property.
	 * 
	 * @param pUserId
	 *            the new value of <code>userId</code> for a user.<br>
	 */

	public void setUserId(String pUserId) {
		this.userId = pUserId;
	}

	/**
	 * Gets the <code>stickyNotesDto</code> property.
	 * 
	 * @return the current value of <code>stickyNotesDto</code> of the user.<br>
	 */
	public StickyNotesDto getStickyNotesDto() {
		return stickyNotesDto;
	}

	/**
	 * Sets the <code>stickyNotesDto</code> property.
	 * 
	 * @param pUserId
	 *            the new value of <code>stickyNotesDto</code> for a user.<br>
	 */
	public void setStickyNotesDto(StickyNotesDto stickyNotesDto) {
		this.stickyNotesDto = stickyNotesDto;
	}

}