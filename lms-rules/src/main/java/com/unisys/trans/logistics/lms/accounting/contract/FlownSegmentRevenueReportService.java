package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.FlownSegmentRevenueReportFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.FlownSegmentRevenueReportResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface FlownSegmentRevenueReportService {

	
	public FlownSegmentRevenueReportResponse retrieveFlownSegmentRevenueReport(
			FlownSegmentRevenueReportFindRequest flownSegmentRevenueReportFindRequest) throws LMSException;
	
}

