package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class HostDefinedSPLSResponse extends AbstractResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<HostDefinedSPLSFindResponse> responseList = new ArrayList<HostDefinedSPLSFindResponse>();

	/** 
	 * @return the responseList
	 */
	public List<HostDefinedSPLSFindResponse> getResponseList() {
		return responseList;
	}

	/**
	 * @param responseList
	 *            the responseList to set
	 */
	public void setResponseList(List<HostDefinedSPLSFindResponse> responseList) {
		this.responseList = responseList;
	}
	
	
}
