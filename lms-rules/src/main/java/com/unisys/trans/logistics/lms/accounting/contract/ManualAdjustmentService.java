package com.unisys.trans.logistics.lms.accounting.contract;


import com.unisys.trans.logistics.lms.accounting.dto.ManualAdjustmentFindRequest;

import com.unisys.trans.logistics.lms.accounting.dto.ManualAdjustmentPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ManualAdjustmentResponse;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantFindRequest;


import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse;

public interface ManualAdjustmentService {
    /**
     * Finds the ManualAdjustment for the given Participant information.
     * <p>
     * This method returns a Air waybill .
     * <p>
     * To find the ManualAdjustment for the given Participant information.:<br>
     * <li>Air waybill.<br>
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
     * <p>
     * 
     * @param pRequest
     *            <code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.ManualAdjustmentFindRequest
     *            ManualAdjustmentFindRequest}</code><br>
     *            includes the attributes to find the <code>ManualAudit information</code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.accounting.dto.ManualAdjustmentDto
     *            ManualAdjustmentDto} - (C)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.accounting.dto.ManualAdjustmentResponse
     *         ManualAdjustmentResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    public ManualAdjustmentResponse retrieveManualAdjustment(final ManualAdjustmentFindRequest pRequest)
                throws LMSException;
    
    public ParticipantResponse retrieveParticipantAfterSelction(final ParticipantFindRequest pRequest)
            throws LMSException;
    
    /**
     * Creates or updates the ManualAdjustment for the given Participant information.
     * <p>
     * This method returns a Air waybill .
     * <p>
     * To update the ManualAdjustment for the given Participant information.:<br>
     * <li>Air waybill.<br>
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
     * <p>
     * 
     * @param pRequest
     *            <code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.ManualAdjustmentPersistRequest
     *            ManualAdjustmentPersistRequest}</code><br>
     *            includes the attributes to find the <code>ManualAudit information</code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.accounting.dto.ParticipantReceivableDto
     *            ManualAdjustmentDto} - (C)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.accounting.dto.ManualAdjustmentResponse
     *         ManualAdjustmentResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    public ManualAdjustmentResponse processManualAdjustment(final ManualAdjustmentPersistRequest pRequest)
                throws LMSException;   

}
