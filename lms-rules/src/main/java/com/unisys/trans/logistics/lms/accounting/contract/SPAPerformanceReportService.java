package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.SPAPerformanceReportFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.SPAPerformanceReportResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface SPAPerformanceReportService {

		public SPAPerformanceReportResponse retrievePerformanceReport(SPAPerformanceReportFindRequest spaPerformanceReportFindRequest)throws LMSException;
		
}
