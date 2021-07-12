package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.ServerMonitorRequest;
import com.unisys.trans.logistics.lms.utils.dto.ServerMonitorResponse;

public interface ServerMonitorService {
	
	ServerMonitorResponse getResponse(ServerMonitorRequest request) throws LMSException;
	
	ServerMonitorResponse retrieveMessageCount(ServerMonitorRequest request) throws LMSException;
	
}
