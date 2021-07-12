/* ====================================== */
/* Copyright (c) 2015 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.HostDefinedSPLSRequest;
import com.unisys.trans.logistics.lms.utils.dto.HostDefinedSPLSResponse;

public interface HostDefinedSPLSService {

	HostDefinedSPLSResponse findHostDefinedSPLS(
			final HostDefinedSPLSRequest pHostDefinedSPLSRequest)
			throws LMSException;
	
	public HostDefinedSPLSResponse processHostDefinedSPLSFindRequest(
			String request, String pCorrelationID) throws LMSException;
	
	public void sendTestMessage();
}
