/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.AddOnRateDto;

/**
 * <code>AddOnRatePfmService</code> handles the AddOnRate.
 * <p>
 * This service has the following functions:
 * <li>maintainAddOnRate - Maintains the AddOnRate information.
 * 
 */
public interface AddOnRatesPfmService {

    /**
     * Maintains the AddOnRate.
     * <p>
     * If the difference between the expiration date and current date is greater than the Run time parameter
     * then the system deletes the AddOnRate Entry.If the AddOnRate has only one Entry then the entire
     * AddOnRate gets deleted. <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#NUMBER_OF_DAYS_AFTER_EXPIRED_ADDONRATES_PURGED}
     * </pre>
     * 
     * <p>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cell spacing="0" cell padding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * 
     * @param pResponse
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse
     *            BatchResponse}</code><br>
     * @param pAddOnRateDto
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateDto
     *            AddOnRateDto}</code><br>
     *            <p>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    void maintainAddOnRate(AddOnRateDto pAddOnRateDto, BatchResponse pResponse)
                throws LMSException;

}
