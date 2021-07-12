package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.preferences.TargetsUploadDto;

/**
 * <code>TargetsUploadRequest</code> is used for transfering
 * <code>request</code> information to another layer.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>uploadDto</li>
 * </ul>
 */

public class TargetsUploadRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Attribute to hold <code>uploadDto</code> property.
	 */
	private TargetsUploadDto uploadDto;

	private TargetUploadDto uploadDtos;

	/**
	 * Attribute to hold <code>viewAllIndicator</code> property.
	 */
	private boolean viewAllIndicator;

	/**
	 * @return the viewAllIndicator
	 */
	public boolean isViewAllIndicator() {
		return this.viewAllIndicator;
	}

	public void setViewAllIndicator(final boolean pViewAllIndicator) {
		this.viewAllIndicator = pViewAllIndicator;
	}

	public TargetUploadDto getUploadDtos() {
		return uploadDtos;
	}

	public void setUploadDtos(TargetUploadDto uploadDtos) {
		this.uploadDtos = uploadDtos;
	}

	/**
	 * @return the uploadDto
	 */
	public TargetsUploadDto getUploadDto() {
		if (uploadDto == null) {
			uploadDto = new TargetsUploadDto();
		}
		return uploadDto;
	}

	/**
	 * @param uploadDto
	 *            the uploadDto to set
	 */
	public void setUploadDto(TargetsUploadDto uploadDto) {
		this.uploadDto = uploadDto;
	}

}
