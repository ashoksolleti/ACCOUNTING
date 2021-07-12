package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.TTYMessageRequest;

public interface TTYMessageService {
	
	public void processTTYMessage(TTYMessageRequest ttyMessageRequest) throws LMSException;
	public void addOfficeQueueItem(final String pQueueName, final String pMessageText, 
				final String pErrorMessageCode) throws LMSException;
	
}
