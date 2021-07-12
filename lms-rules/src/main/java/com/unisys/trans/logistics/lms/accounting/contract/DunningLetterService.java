package com.unisys.trans.logistics.lms.accounting.contract;


import com.unisys.trans.logistics.lms.accounting.dto.DunningLetterRequest;

import com.unisys.trans.logistics.lms.accounting.dto.DunningLetterResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * <code>DunningLetterService</code> handles the DunningLetter
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>Create a DunningLetter.
 * <li>Find a DunningLetter.
 * <li>Update a DunningLetter.
 * </ul>
 */

public interface DunningLetterService {
	
	


	public DunningLetterResponse createDunningLetter(
    		DunningLetterRequest pdunningLetterPersistRequest)
            throws LMSException;


	public DunningLetterResponse retrieveDunningLetter(
			DunningLetterRequest ppDunningLetterFindRequest)
			throws LMSException;
	
	public DunningLetterResponse updateDunningLetter(
			DunningLetterRequest pdunningLetterPersistRequest)
			throws LMSException;
	
	public DunningLetterResponse deleteDunningLetter(
			DunningLetterRequest pDunningLetterDeleteRequest)
			throws LMSException;
	
	public DunningLetterResponse retrieveParticipantGroupNames(DunningLetterRequest pDunningLetterFindRequest
			 )
			throws LMSException;
	
	

}