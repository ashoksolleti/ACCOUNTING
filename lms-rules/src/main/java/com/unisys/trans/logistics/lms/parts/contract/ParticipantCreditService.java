package com.unisys.trans.logistics.lms.parts.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.LoyaltypointsDto;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantCreditFindRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantCreditFindResponse;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantCreditPersistRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantCreditResponse;

public interface ParticipantCreditService {
	
	     BatchResponse retrieveCreditInfo(BatchRequest pBatchRequest);
         
         ParticipantCreditFindResponse findCreditInfo(ParticipantCreditFindRequest pParticipantCreditFindRequest) throws LMSException;
         ParticipantCreditResponse createCreditInfo(ParticipantCreditPersistRequest pParticipantCreditPersistRequest) throws LMSException;
         ParticipantCreditResponse updateCreditInfo(ParticipantCreditPersistRequest pParticipantCreditPersistRequest) throws LMSException;
         ParticipantCreditResponse deleteCreditInfo(ParticipantCreditPersistRequest pParticipantCreditPersistRequest) throws LMSException;
         void deleteAll()  throws LMSException;
         ParticipantCreditFindResponse processMessage(String pMessage, String pMessageJMSId) throws LMSException;
         void RegisterLoyaltyPoints(LoyaltypointsDto pLoyaltypointsDto);
}
