package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.TariffRateReportRequest;

public interface AtpTariffRateReportService {

	
	BatchResponse findTariffRates(TariffRateReportRequest pBatchRequest)
			throws LMSException;

}
