/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>AggregatePersistRequest</code> is used to create, update and restore aggregate information.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>aggregateDto</code></li>
 * </ul>
 */
public class HostInterfaceRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
	private static final long serialVersionUID = 4625584828530363316L;

	/**
     * <code>Default constructor</code>.
     * <p>
     */
    public HostInterfaceRequest() {

    }

    private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
  
    
   
}
