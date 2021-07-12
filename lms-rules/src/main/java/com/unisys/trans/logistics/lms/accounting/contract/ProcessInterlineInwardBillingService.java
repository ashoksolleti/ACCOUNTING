package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.InterlineInwardBillingFindRequest;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface ProcessInterlineInwardBillingService {

	public void processInterlineInwardBilling(
			final InterlineInwardBillingFindRequest pFindRequest)
			throws LMSException;

}
