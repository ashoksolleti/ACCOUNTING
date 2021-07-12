package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.MessageRequest;
import com.unisys.trans.logistics.lms.utils.dto.MessageResponse;

public interface MessageStageService {
	
	MessageResponse retrieveMessage(MessageRequest pMessageRequest) throws LMSException;
	MessageResponse retrieveMessageByAWBFlight(MessageRequest pMessageRequest) throws LMSException;
	MessageResponse createMessage(MessageRequest pMessageRequest) throws LMSException;
	MessageResponse updateMessage(MessageRequest pMessageRequest) throws LMSException;
	MessageResponse deleteMessage(MessageRequest pMessageRequest) throws LMSException;

}
