/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class BatchJobGenerationResponse extends AbstractResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String batchJobResponse;

    /**
     * <code>Default constructor</code>.
     * <p>
     */
    public BatchJobGenerationResponse() {

    }

	public String getBatchJobResponse() {
		return batchJobResponse;
	}

	public void setBatchJobResponse(String batchJobResponse) {
		this.batchJobResponse = batchJobResponse;
	}

}
