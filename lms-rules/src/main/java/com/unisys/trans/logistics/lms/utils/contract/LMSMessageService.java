package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.tty.element.MessageHeaderElement;

public interface LMSMessageService {
	
	public void processIataMessage(String pMessage, MessageHeaderElement pHeaderElement);

}
