package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class HostDefinedSPLSRequest extends AbstractRequest {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<HostDefinedSPLSFindRequest> requestList;
 
	public List<HostDefinedSPLSFindRequest> getRequestList() {
		return requestList;
	}

	public void setRequestList(List<HostDefinedSPLSFindRequest> requestList) {
		this.requestList = requestList;
	}
}
