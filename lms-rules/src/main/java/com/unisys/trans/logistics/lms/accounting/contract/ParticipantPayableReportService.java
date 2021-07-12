package com.unisys.trans.logistics.lms.accounting.contract;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.accounting.dto.ParticipantPayableReportRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantPayableReportResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface ParticipantPayableReportService extends Serializable {

	public ParticipantPayableReportResponse retrieveParticipantPayableReport(
			ParticipantPayableReportRequest participantPayableReportRequest) throws LMSException;
	
	ParticipantPayableReportResponse findGSAAgreementNames(ParticipantPayableReportRequest participantPayableReportRequest, String participantAccountNumber) throws LMSException;
}
