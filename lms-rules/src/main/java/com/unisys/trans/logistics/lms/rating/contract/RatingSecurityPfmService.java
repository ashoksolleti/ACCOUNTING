/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.framework.response.RateCriteriaPfmResponse;
import com.unisys.trans.logistics.lms.rating.dto.RatingSecurityDto;

/**
 * <code>RatingSecurityPfmService</code> handles the RatingSecurity.
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>maintainRatingSecurity - Maintains the RatingSecurity information.
 * </ul>
 */
public interface RatingSecurityPfmService {
    /**
     * Maintains the RatingSecurity.
     * <p>
     * If the difference between the expiration date and current date is greater than the Run time parameter
     * then the system deletes the RatingSecurity Entry.If the RatingSecurity has only one Entry then the
     * entire RatingSecurity gets deleted. <br>
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
     * @param pRatingSecurityDto
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityDto
     *            RatingSecurityDto}</code><br>
     *            <p>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    void maintainRatingSecurity(RatingSecurityDto pRatingSecurityDto,
                RateCriteriaPfmResponse pResponse) throws LMSException;

}
