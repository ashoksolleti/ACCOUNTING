/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import java.io.IOException;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.FctlUpdateDto;
import com.unisys.trans.logistics.lms.utils.dto.FctlUpdatePersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.FctlUpdateResponse;

/**
 * <code>FctlUpdateService</code> handles the FctlUpdate
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>Submit FctlUpdate.
 * <li>Update FCTL Update.
 * <li>deleteFctlDto
 * <li>uploadFctlUpdatedata
 * </ul>
 *
 */

public interface FctlUpdateService {

	FctlUpdateResponse updateFctlUpdate(final FctlUpdatePersistRequest 
			pFctlUpdatePersistRequest) throws LMSException;

	FctlUpdateResponse submitfctlUpdateDtos(final FctlUpdatePersistRequest 
			pFctlUpdatePersistRequest) throws LMSException, IOException;

	FctlUpdateResponse deleteFctlDto(final FctlUpdateDto dto);
	
	FctlUpdateResponse uploadFctlUpdatedata(final FctlUpdatePersistRequest 
			pFctlUpdatePersistRequest) throws LMSException, IOException;

}