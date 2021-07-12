package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.UPSIataMessageRequest;

public interface UPSIataProcessResponseService {

	public void processUPSResponse(final UPSIataMessageRequest pUpsIataMessageRequest) throws LMSException;
}
