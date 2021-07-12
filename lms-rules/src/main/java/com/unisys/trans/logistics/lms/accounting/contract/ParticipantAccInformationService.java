package com.unisys.trans.logistics.lms.accounting.contract;


import com.unisys.trans.logistics.lms.accounting.dto.ParticipantAccInfoFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantAccInfoResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface ParticipantAccInformationService {
	

	public ParticipantAccInfoResponse retrieveParticipantAccInfoReport(
			ParticipantAccInfoFindRequest aParticipantAccInfoFindRequest) throws LMSException;

}
