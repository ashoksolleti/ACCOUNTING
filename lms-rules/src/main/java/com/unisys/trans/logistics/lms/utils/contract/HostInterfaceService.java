package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.HostInterfaceRequest;

public interface HostInterfaceService {
	public void processHostInterfaceMessage(HostInterfaceRequest pRequest) throws LMSException;
}
