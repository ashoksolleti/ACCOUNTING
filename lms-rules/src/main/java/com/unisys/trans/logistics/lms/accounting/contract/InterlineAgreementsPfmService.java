package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface InterlineAgreementsPfmService {
    public BatchResponse updateExpiredInterlineAgreements(
            BatchRequest pBatchRequest) throws LMSException;
}