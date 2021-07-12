package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
/**
 * <code>FctlUpdateSubmitRequest</code> class represents the request to submit
 * fctlupdateDetails details.
 * <p>
 * <code>FctlUpdateSubmitRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>submit
 * </code>
 * </ul>
 * @param <FctlUpdateDto>
 */

public class FctlUpdatePersistRequest extends AbstractRequest{

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1337041157161899065L;
    
    /**
     * Attribute to hold the <code>RatingNoteDto</code> object.
     */
    private FctlUpdateDto fctlUpdateDto;
    
    /**
     * Attribute to hold the <code>ActionType</code> object.
     */
    private String actionType;
    /**
     * Attribute to hold <code>submit</code> property.
     */
    private List<FctlUpdateDto> fctlUpdateDtos;
    /**
     * <code>Default Constructor.</code>
     * @return 
     */
    public FctlUpdatePersistRequest() {
    }
    /**
     * Gets the <code>fctlUpdate</code> property.
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
	public List<FctlUpdateDto> getFctlUpdateDtos() {
		return this.fctlUpdateDtos;
	}
	/**
     * Sets the <code>fctlUpdate</code> property.
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
	public void setFctlUpdateDtos(final List<FctlUpdateDto> fctlupdatedtos) {
		this.fctlUpdateDtos = fctlupdatedtos;
	}
	public FctlUpdateDto getFctlUpdateDto() {
		return fctlUpdateDto;
	}
	public void setFctlUpdateDto(FctlUpdateDto fctlUpdateDto) {
		this.fctlUpdateDto = fctlUpdateDto;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	
	
}
