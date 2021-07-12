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
public class BatchJobGenerationRequest extends AbstractRequest {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String batchJobName;
	
	private String emailId;

	public String getBatchJobName() {
		return batchJobName;
	}

	public void setBatchJobName(String batchJobName) {
		this.batchJobName = batchJobName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
