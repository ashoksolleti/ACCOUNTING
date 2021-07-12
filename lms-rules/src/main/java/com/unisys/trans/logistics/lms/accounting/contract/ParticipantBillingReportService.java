package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.ParticipantBillingReportFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantBillingReportResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;


public interface ParticipantBillingReportService {
	

	public ParticipantBillingReportResponse retrieveParticipantBillingReport(
			ParticipantBillingReportFindRequest pParticipantBillingReportFindRequest) throws LMSException;
	
}
