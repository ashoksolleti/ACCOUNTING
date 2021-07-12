/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.BatchJobGenerationRequest;
import com.unisys.trans.logistics.lms.utils.dto.BatchJobGenerationResponse;

public interface BatchJobGenerationService {

	public BatchJobGenerationResponse processBatchJob(BatchJobGenerationRequest batchJobGenerationRequest)
                throws LMSException;

}
