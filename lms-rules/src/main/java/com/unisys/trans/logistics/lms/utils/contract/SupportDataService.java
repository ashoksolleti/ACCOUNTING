package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.SupportDataFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.SupportDataPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.SupportDataResponse;

public interface SupportDataService {
	
	SupportDataResponse findSupportData(final SupportDataFindRequest 
			pSupportDataFindRequest) throws LMSException;
	
	SupportDataResponse uploadSupportData(final SupportDataPersistRequest 
			pSupportDataPersistRequest) throws LMSException;
	
	SupportDataResponse updateSupportStatus(final SupportDataPersistRequest
	            pSupportDataPersistRequest) throws LMSException;

}
