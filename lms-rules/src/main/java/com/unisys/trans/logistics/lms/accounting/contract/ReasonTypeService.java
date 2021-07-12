/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.ReasonTypeFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ReasonTypePersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ReasonTypeResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * <code>ReasonTypeService</code> provides the functional methods to maintain
 * reason type information.
 * <p>
 * The reason type information maintains<br>
 * <ul>
 * <li>The reason description needed for AWB Reason Types.
 * <li>The effective period of reason types.
 * </ul>
 * <p>
 * It offers the following services for maintaining reason note information:<br>
 * <ul>
 * <li>findReasonType - Finds reason type information for the given reason type.
 * <li>updateReasonType- Updates a reason type for a given reason type.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.ReasonTypeFindRequest
 *      ReasonTypeFindRequest
 * @see com.unisys.trans.logistics.lms.accounting.dto.ReasonTypePersistRequest
 *      ReasonTypePersistRequest
 * @see com.unisys.trans.logistics.lms.accounting.dto.ReasonTypeResponse
 *      ReasonTypeResponse
 */
public interface ReasonTypeService {

    public ReasonTypeResponse retrieveReasonTypes(ReasonTypeFindRequest pReasonTypeFindRequest)
                throws LMSException;

    public ReasonTypeResponse processReasonType(ReasonTypePersistRequest pReasonTypePersistRequest)
                throws LMSException;

}
