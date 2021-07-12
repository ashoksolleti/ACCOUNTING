/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>StickyNotesResponse</code> contains the response of the maintenance
 * request received by <code>StickyNotesService</code>.
 * <p>
 * This contains the following attribute:<br>
 * <ul>
 * <li><code>stickyNotes</code>
 * </ul>
 */
public class StickyNotesResponse extends AbstractResponse {
	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = -8305955872963878036L;

	/**
	 * Attribute to hold <code>stickyNotes</code>.
	 * <p>
	 * Refers to a collection/list of <code>StickyNotesDto</code>.
	 */
	private List<StickyNotesDto> stickyNotesDtos = new ArrayList<StickyNotesDto>();

	/**
	 * Attribute to hold <code>stickyNotes</code>.
	 * <p>
	 * Refers to a collection/list of <code>StickyNotesDto</code>.
	 */
	private StickyNotesDto stickyNotesDto = new StickyNotesDto();

	/**
	 * <code>Default constructor</code>.
	 */
	public StickyNotesResponse() {

	}

	/**
	 * Gets the <code>stickyNotes</code> property.
	 * <p>
	 * Refers to a collection/list of <code>StickyNotesDto</code>.
	 * <p>
	 * 
	 * @return the current list of <code>StickyNotesDto</code>.<br>
	 */

	public List<StickyNotesDto> getStickyNotesDtos() {
		return stickyNotesDtos;
	}

	/**
	 * Sets the <code>stickyNotesDtos</code> property.
	 * <p>
	 * Refers to a collection/list of <code>StickyNotesDto</code>.
	 * <p>
	 * 
	 * @param pStickyNotesDtos
	 *            the new list of <code>stickyNotesDtos</code>.<br>
	 */

	public void setStickyNotesDtos(List<StickyNotesDto> pStickyNotesDtos) {
		this.stickyNotesDtos = pStickyNotesDtos;
	}

	/**
	 * Gets the <code>stickyNotesDto</code> property.
	 * <p>
	 * Refers to a collection/list of <code>stickyNotesDto</code>.
	 * <p>
	 * 
	 * @return the current list of <code>stickyNotesDto</code>.<br>
	 */
	public StickyNotesDto getStickyNotesDto() {
		return stickyNotesDto;
	}

	/**
	 * Sets the <code>stickyNotesDto</code> property.
	 * <p>
	 * Refers to a collection/list of <code>stickyNotesDto</code>.
	 * <p>
	 * 
	 * @param pStickyNotesDto
	 *            the new list of <code>stickyNotesDto</code>.<br>
	 */
	public void setStickyNotesDto(StickyNotesDto pStickyNotesDto) {
		this.stickyNotesDto = pStickyNotesDto;
	}

}
