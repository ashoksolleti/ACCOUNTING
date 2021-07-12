/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.JointRateDto;

/**
 * <code>JointRatePfmService</code> handles the JointRate
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>maintainJointRate - Maintains the JointRate information.</li>
 * </ul>
 */
public interface JointRatesPfmService {

    /**
     * Maintains the JointRate.
     * <p>
     * If the difference between the expiration date and current date is greater than the Run time parameter
     * then the system deletes the JointRate Entry.If the JointRate has only one Entry then the entire
     * JointRate gets deleted. <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#NUMBER_OF_DAYS_AFTER_EXPIRED_TARIFF_JOINT_CLASSRATES_PURGED}
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
     * @param pBatchResponse
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse
     *            BatchResponse}</code><br>
     * @param pJointRateDto
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto
     *            JointRateDto}</code><br>
     *            <p>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */

    void maintainJointRates(JointRateDto pJointRateDto,
                BatchResponse pBatchResponse) throws LMSException;
}
