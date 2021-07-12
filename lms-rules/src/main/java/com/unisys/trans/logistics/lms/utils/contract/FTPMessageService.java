package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.FTPMessageRequest;
import com.unisys.trans.logistics.lms.utils.dto.FTPMessageResponse;

/**
 * <code>FTPMessageService</code> provides the functional methods to process the message and place to corresponding FTP folder in server
 * <p>
 * It has following methods:<br>
 * <ul>
 * <li>processMessage - process the message corresponding to FTPMessage service.
 * <li>processFTPServerMessage - process the message corresponding to FTPServer service.
 * <li>addOfficeQueueItem - add the message to  office queue.
 * </ul>
 * 
 *     
 */
public interface FTPMessageService {
	
	FTPMessageResponse processMessage(final FTPMessageRequest pFTPMessageRequest) throws LMSException;
	FTPMessageResponse processFTPServerMessage(final FTPMessageRequest pFTPMessageRequest) throws LMSException;
	void addOfficeQueueItem(final String pQueueName, final String pMessageText, final String pErrorMessageCode) throws LMSException;

}
