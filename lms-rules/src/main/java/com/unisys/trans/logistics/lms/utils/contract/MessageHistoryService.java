package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.MessageHistoryRequest;
import com.unisys.trans.logistics.lms.utils.dto.MessageHistoryResponse;

/**
 * <code>MessageHistoryService</code> provides the functional methods to stores
 * the incoming and outgoing message history.
 * <p>
 * It has following methods:<br>
 * <ul>
 * <li>storeIncomingMessage - store the incoming message history.
 * <li>storeOutgoingMessage - store the outgoing message history.
 * </ul>
 * 
 * 
 */

public interface MessageHistoryService {

    public MessageHistoryResponse storeIncomingMessage(MessageHistoryRequest messageHistoryRequest)
                throws LMSException;

    public MessageHistoryResponse storeOutgoingMessage(MessageHistoryRequest messageHistoryRequest)
                throws LMSException;

    public MessageHistoryResponse storePSNHoldAcknowledgement(MessageHistoryRequest pMessageHistoryRequest)
                throws LMSException;
	public MessageHistoryResponse storeCWISOutgoingMessage(MessageHistoryRequest messageHistoryRequest) throws LMSException;
	

    public String retrieveFEPMessageFlightDetails(MessageHistoryRequest messageHistoryRequest)
                throws LMSException;
  //FIS146A (Outgoing XFFM Flight Manifest Message)
    public MessageHistoryResponse storeXFFMOutgoingMessage(MessageHistoryRequest messageHistoryRequest)
            throws LMSException;

    public String findPartnerId(String pPartnerId) throws LMSException;

	public MessageHistoryResponse storeCustomMessageHistory(MessageHistoryRequest messageHistoryRequest) 
			throws LMSException;
}
