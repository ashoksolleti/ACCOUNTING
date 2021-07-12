package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.EspvalRequest;

/**
 * <code>EspvalService</code> provides the functional methods to validate the login credential against BUI database 
 * <p>
 * It has following methods:<br>
 * <ul>
 * <li>validateUser - validate the login credential and generate response XML.
 *  <li>addOfficeQueueItem - add the message to  office queue.
 * </ul>
 * 
 *     
 */
public interface EspvalService {
	
	String validateUser(EspvalRequest pEspvalRequest, String pCorrelationID) throws LMSException;
	void addOfficeQueueItem(final String pQueueName, final String pMessageText, final String pErrorMessageCode) throws LMSException;

}
