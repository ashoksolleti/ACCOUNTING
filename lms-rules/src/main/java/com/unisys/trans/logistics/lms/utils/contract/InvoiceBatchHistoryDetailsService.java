package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface InvoiceBatchHistoryDetailsService {
	
	String findBatchJobHistoryDetails(final long pAccountingBatchInstanceId) throws LMSException;

    String findJobNameByInstanceId(String jobInstanceId);
}
