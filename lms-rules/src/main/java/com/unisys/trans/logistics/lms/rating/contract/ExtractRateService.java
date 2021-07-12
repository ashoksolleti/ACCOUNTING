/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.ExtractRequest;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.ExtractResponse;

/**
 * <code>ExtractRateService</code> handles the SpotRate,Contract and TariffRates
 * report information.
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>extractTariffRates
 * <li>extractContracts
 * <li>extractSpotRates
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.framework.dto.ExtractRequest SpotRateDto
 */
public interface ExtractRateService {
	/**
	 * This method generates the TariffRates information.
	 * 
	 * @param pExtractRequest
	 *            <ul>
	 *            <li>
	 *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.ExtractRequest
	 *         ExtractRequest}</code>
	 *            </ul>
	 * @return ExtractResponse holds the ExtractResponse.
	 * @throws LMSException
	 *             If the validation fails, above mentioned error codes are
	 *             returned. Each CodeMessage contains the status code, human
	 *             readable message, and message type.
	 */
	ExtractResponse extractTariffRates(ExtractRequest pExtractRequest)
			throws LMSException;

	/**
	 * This method generates the Contract information..
	 * 
	 * @param pExtractRequest
	 *            <ul>
	 *            <li>
	 *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.ExtractRequest
	 *         ExtractRequest}</code>
	 *            </ul>
	 * @return ExtractResponse holds the ExtractResponse.
	 * @throws LMSException
	 *             If the validation fails, above mentioned error codes are
	 *             returned. Each CodeMessage contains the status code, human
	 *             readable message, and message type.
	 */
	ExtractResponse extractContracts(ExtractRequest pExtractRequest)
			throws LMSException;

	/**
	 * This method generates the SpotRate information.
	 * 
	 * @param pExtractRequest
	 *            <ul>
	 *            <li>
	 *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.ExtractRequest
	 *         ExtractRequest}</code>
	 *            </ul>
	 * @return ExtractResponse holds the ExtractResponse.
	 * @throws LMSException
	 *             If the validation fails, above mentioned error codes are
	 *             returned. Each CodeMessage contains the status code, human
	 *             readable message, and message type.
	 */
	ExtractResponse extractSpotRates(ExtractRequest pExtractRequest)
			throws LMSException;
}
