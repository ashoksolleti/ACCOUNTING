package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.IncomingFTPMessageRequest;
import com.unisys.trans.logistics.lms.utils.dto.IncomingFTPMessageResponse;

public interface IncomingFTPMessageService {
	
	IncomingFTPMessageResponse processMessage(final IncomingFTPMessageRequest pIncomingFTPMessageRequest) throws LMSException;
	
}
