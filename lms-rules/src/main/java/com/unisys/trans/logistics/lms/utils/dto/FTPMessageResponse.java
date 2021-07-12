/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>FTPMessageResponse</code> contains information about the FTP Service response attributes.
 * 
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>OId
 *<li>status
</code>
 * </ul>
 */
public class FTPMessageResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1283744401384095316L;
	    
	/**
	 * Attribute to hold the <code>status</code> property.
     */
	private  String status; 
		
	/**
     * <code>Default constructor.</code>
     */
    public FTPMessageResponse() {

    }
	
	
		
	
	/**
	 * @param status
	 *        the status to set
    */
	public String getStatus() {
		return this.status;
	}
	
	/**
	 * @return the status
	*/
	public void setStatus(String status) {
		this.status = status;
	}
		
}
