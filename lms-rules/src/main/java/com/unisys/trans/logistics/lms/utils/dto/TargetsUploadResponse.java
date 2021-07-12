/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>TargetsUploadResponse</code> contains the response of the TargetsUpload
 * request received by <code>TargetsUploadService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>TargetUploadDto</li>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.TargetUploadDto
 */

public class TargetsUploadResponse extends AbstractResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<TargetUploadDto> targetUploads;

	/**
	 * @return the allotmentUploads
	 */
	public List<TargetUploadDto> getTargetUploads() {
		return targetUploads;
	}

	/**
	 * @param targetUploads the targetUploads to set
	 */
	public void setTargetUploads(List<TargetUploadDto> targetUploads) {
		this.targetUploads = targetUploads;
	}

}
