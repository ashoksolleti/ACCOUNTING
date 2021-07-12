package com.unisys.trans.logistics.lms.accounting.contract;


import com.unisys.trans.logistics.lms.accounting.dto.InterlineBillingReportFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineBillingReportResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface InterlineBillingReportService {
	
	public InterlineBillingReportResponse retrieveInterlineBillingReport(
			InterlineBillingReportFindRequest pInterlineBillingReportFindRequest) throws LMSException;

}
