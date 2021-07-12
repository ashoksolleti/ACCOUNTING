package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class ExemptionReasonResponse extends AbstractResponse {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	private List<ExemptionReasonDto> exemptionReasons = new ArrayList<>();

	/**
	 * @return the exemptionReasons
	 */
	public List<ExemptionReasonDto> getExemptionReasons() {
		return exemptionReasons;
	}

	/**
	 * @param exemptionReasons the exemptionReasons to set
	 */
	public void setExemptionReasons(List<ExemptionReasonDto> exemptionReasons) {
		this.exemptionReasons = exemptionReasons;
	}
}
