package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.ProvisionStatementReportFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ProvisionStatementReportResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface ProvisionStatementReportService {

	public ProvisionStatementReportResponse retrieveProvisionStatementReport
					(ProvisionStatementReportFindRequest provisionStatementReportFindRequest) throws LMSException;
}
