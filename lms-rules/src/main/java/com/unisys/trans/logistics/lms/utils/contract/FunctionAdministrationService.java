package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.FunctionAdministrationFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.FunctionAdministrationPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.FunctionAdministrationResponse;
import com.unisys.trans.logistics.lms.utils.dto.FunctionDeleteRequest;

public interface FunctionAdministrationService {

	FunctionAdministrationResponse findFunction(FunctionAdministrationFindRequest pFunctionAdministrationRequest)
			throws LMSException;
	FunctionAdministrationResponse findProfiles(FunctionAdministrationFindRequest pFunctionAdministrationRequest)
			throws LMSException;
	FunctionAdministrationResponse processFunctionAdminDetails(FunctionAdministrationPersistRequest pFuntionAdministrationPersistRequest)
			throws LMSException;
	FunctionAdministrationResponse findLayout(FunctionAdministrationFindRequest pFunctionAdministrationRequest)
			throws LMSException;
	
	FunctionAdministrationResponse deleteFunction(FunctionDeleteRequest pDeleteRequest)
			throws LMSException;
	
}

