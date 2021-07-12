/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.ContractDto;

/**
 * <code>ContractPfmService</code> handles the Contract
 * <p>
 * This service has the following functions:
 * <li>maintainContract - Maintains the contract information.
 */
public interface ContractPfmService {
    /**
     * Maintains the Contract.
     * <p>
     * If the difference between the expiration date and current date is greater than the Run time parameter
     * then the system deleted the Contract Entry.If the Contract has only one Entry then the entire Contract
     * gets deleted. <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#NUMBER_OF_DAYS_AFTER_EXPIRED_CONTRACT_PURGED}
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
     * @param pContractDto
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto
     *            ContractDto}</code><br>
     *            <p>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    void maintainContract(ContractDto pContractDto, BatchResponse pResponse)
                throws LMSException;
}
