package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.contract.BatchWriter;
import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface PfmReportService extends BatchWriter<BatchRequest, BatchResponse>{
	
	public void commitPfmReport(BatchRequest req) throws LMSException;
	
}

