package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.StationTTYMessageRequest;
import com.unisys.trans.logistics.lms.utils.dto.StationTTYMessageResponse;

public interface StationTTYMessageService {

	public StationTTYMessageResponse processTTYMessage(StationTTYMessageRequest pTTYMessageRequest)throws LMSException;

}
