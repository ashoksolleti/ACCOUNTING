package com.unisys.trans.logistics.lms.accounting.contract;

import java.util.concurrent.Future;

import com.unisys.trans.logistics.lms.accounting.dto.ProrationRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ProrationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * <code>ProrationServiceImpl</code> provides the functional methods to calculate
 * proration.
 * <p>
 * It has following method:<br>
 * <ul>
 * <li>findProration - calculate the host revenue.
 *
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.ProrationRequest
 *     
 */

public interface RatingProrationService {
	
	ProrationResponse findProration(ProrationRequest prorationRequest) throws LMSException;
	
	Future<ProrationResponse> asyncFindProration(ProrationRequest prorationRequest) throws LMSException;
	
}
