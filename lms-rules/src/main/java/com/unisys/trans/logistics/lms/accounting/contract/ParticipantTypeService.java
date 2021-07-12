package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantTypeFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantTypePersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantTypeResponse;

/**
 * <code>ParticipantTypeService</code> provides the functional methods to maintain
 * Participant type information.
 * <p>
 * The Participant type information maintains<br>
 * <ul>
 * <li>The Participant description needed for Participant Types.
 * <li>The Type of Participant.
 * </ul>
 * <p>
 * It offers the following services for maintaining participant type information:<br>
 * <ul>
 * <li>findparticipantType - Finds the participant type. 
 * <li>persistparticipantType - Persists(create,delete) the participant type
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.ParticipantTypeFindRequest
 *      ParticipantTypeFindRequest
 * @see com.unisys.trans.logistics.lms.accounting.dto.ParticipantTypePersistRequest
 *     ParticipantTypePersistRequest
 * @see com.unisys.trans.logistics.lms.accounting.dto.ParticipantTypeResponse
 *     ParticipantTypeResponse
 */

public interface ParticipantTypeService {

	
	
	public ParticipantTypeResponse findParticipantType(ParticipantTypeFindRequest aParticipantTypeFindRequest)
			throws LMSException;

	public ParticipantTypeResponse PersistParticipantType(ParticipantTypePersistRequest aParticipantTypePersistRequest)
			throws LMSException;


}
