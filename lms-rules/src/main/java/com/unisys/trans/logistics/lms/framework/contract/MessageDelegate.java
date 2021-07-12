package com.unisys.trans.logistics.lms.framework.contract;

import com.unisys.trans.logistics.lms.framework.dto.IncomingCWISMessageRequest;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface MessageDelegate {

    /**
     * Method look up for invokeService.
     * 
     * @return
     * @throws LMSException
     */
    String invokeService(
                IncomingCWISMessageRequest pIncomingTTYMessageRequest)
                throws LMSException, Exception;

}
