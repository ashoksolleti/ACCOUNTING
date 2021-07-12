package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.BatchControlReportFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.BatchControlReportResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface BatchControlReportService {
	
	public BatchControlReportResponse retrieveBatchReport(
			BatchControlReportFindRequest batchControlReportFindRequest) throws LMSException;
	
}



