package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.PostRequest;
import com.unisys.trans.logistics.lms.utils.dto.PostResponse;

/**
 * <code>PostService</code> provides the functional methods to call web service http post XML.  
 * <p>
 * It has following methods:<br>
 * <ul>
 * <li>postXML - http post XML specific to Post service.
 *  <li>addOfficeQueueItem - add the message to  office queue.
 *  <li>postXMail - http post XML specific to XMail service.
 *  <li>postEspvalXML - http post XML specific to Espval service.
 * </ul>
 * 
 *     
 */

public interface PostService {
	
	public PostResponse postXML(PostRequest pEUCustomRequest) throws LMSException;
	public void addOfficeQueueItem(final String pQueueName, final String pMessageText, final String pErrorMessageCode) throws LMSException;
	public PostResponse postXMail(PostRequest pEUCustomRequest) throws LMSException;
	public PostResponse postEspvalXML(PostRequest pESPVALRequest) throws LMSException;
	public PostResponse postOutgoingXML(PostRequest pPostRequest) throws LMSException;
	
}
