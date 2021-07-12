package com.unisys.trans.logistics.lms.accounting.contract;

import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingInvoiceAWBDto;
import com.unisys.trans.logistics.lms.accounting.dto.CarrierReceivableDto;
import com.unisys.trans.logistics.lms.accounting.dto.HistoryPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineOutwardMemoDto;
import com.unisys.trans.logistics.lms.accounting.dto.ManualAuditQueueRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ManualAuditQueueResponse;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantCarrierReceivablesDto;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantReceivableDto;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * Interface of the services that are implemented by the Business services.
 * <p>
 * <code>ManualAuditQueueService</code> provides update, find, and delete services for maintaining audit queue
 * information.<br>
 * This performs the following functions.<br>
 * <ul>
 * <li>Finds the Audit Queue From office Identifier.
 * <li>Finds the Audit filters.
 * <li>Retrieve the Audit entry.
 * <li>Process the selected queues.
 * </ul>
 * Audit queue items are retrieved :
 * <ul>
 * <li>Based on Office identifiers entered
 * 
 * </li>
 * </ul>
 * <br>
 * Audit filters are retrieved based:<br>
 * <ul>
 * <li><br>
 * on the selected audit queues <br>
 * </ul>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.ManualAuditQueueRequest ManualAuditQueueRequest
 * @see com.unisys.trans.logistics.lms.accounting.dto.ManualAuditQueueResponse ManualAuditQueueResponse
 */
public interface ManualAuditQueueService {
    /**
     * The <code>Finds the All Audit Queues.</code> find OfficeQueues item in a
     * particular OfficeQueue with provided office identifier.
     * <p>
     * <b>Related Method :</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#findQueuesAndQueueItems findQueuesAndQueueItems}
     * </ul>
     * </code>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OFFICE_INDETIFIER_MANADATORY}</code>
     * </td>
     * <td align="left">The office identifier is mandatory.</td>
     * *
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OFFICE_INDETIFIER_ALPHANUMRIC}</code></td>
     * <td align="left">The Office Identifier must be 1-20 alphanumeric characters..</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OFFICE_IDENTIFIER_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">The Office Queue does not exist in the system..</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pRequest
     *            <code> {@link com.unisys.trans.logistics.lms.accounting.dto.ManualAuditQueueRequest
     *            ManualAuditQueueRequest}</code><br>
     *            includes the attributes to find a <code>Audit Queue information</code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.accounting.dto.ManualAuditQueuesFindDto
     *            ManualAuditQueuesFindDto} - (C)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.accounting.dto.ManualAuditQueueResponse
     *         ManualAuditQueueResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.accounting.dto.ManualQueueDetailsDTO}
     *         - (1:*)</code>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    public ManualAuditQueueResponse findAllAuditQueues(final ManualAuditQueueRequest pRequest)
                throws LMSException;

    /**
     * Finds the All AirwaybillAuditEntry.
     * <p>
     * This method returns a Airway bill Audit entry based on the satisfied rule and calculating all revenue
     * items for the selected rule based on audit queues and office identifier .
     * <p>
     * To find the Airway bill related items for a manual audit Queue user must provide following input:<br>
     * <li>List of selected rule names .<br>
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
     *            <code> {@link com.unisys.trans.logistics.lms.accounting.dto.ManualAuditQueueRequest
     *            ManualAuditQueueRequest}</code><br>
     *            includes the attributes to find a <code>Audit Filter information</code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.accounting.dto.ManualAuditQueuesFindDto
     *            ManualAuditQueuesFindDto} - (C)</code>
     *            </ul>
     *            <p>
     * @param integer 
     * @return <code> {@link com.unisys.trans.logistics.lms.accounting.dto.ManualAuditQueueResponse
     *         ManualAuditQueueResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.accounting.dto. ManualQueueDetailsDTOo# ManualQueueDetailsDTO}
     *         - (1:*)</code>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    public ManualAuditQueueResponse findAirWaybillsFromManualAuditQueues(
                final ManualAuditQueueRequest pRequest, Integer QueueItemsCount) throws LMSException;

    /**
     * The <code>removeAuditEntryQueues</code> removes the item from the ManualAuditqueue
     * with the selected Entries and also simultaneously removes the office queue item from office queue.
     * 
     * <p>
     * <b>Related Method :</b>
     * <ul>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#deleteOfficeQueueItemItem
     * deleteOfficeQueueItemItem}
     * </ul>
     * removes the item from the office queue by the selected airwaybill oid Unique Key in all Office Queues
     * and Office Stations based on the input(OfficeQueueItem or OfficeQueueItems) given by user.
     * </p>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
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
     * @param pRequest
     *            <code> {@link com.unisys.trans.logistics.lms.accounting.dto.ManualAuditQueueRequest
     *            ManualAuditQueueRequest}</code><br>
     *            holds all the information required for deleting one or more
     *            Office Queue Items for a particular Office Queue and processing the required
     *            AirWaybillAuditEntry.
     *            <ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.accounting.dto.ManualAuditQueueResponse
     *         ManualAuditQueueResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </li>
     *         </ul>
     *         </code>
     *         </p>
     *         <p>
     * @throws LMSException
     *             If the delete one or more Office Queue Items for a particular
     *             office queue operation fails, the corresponding errors are
     *             returned which contains the status code, human readable
     *             message and message type.
     *             </p>
     */
    public void processAirWaybillFromManualAuditQueues(
                final ManualAuditQueueRequest pRequest) throws LMSException;
    
    public ManualAuditQueueResponse  processRejectionMemoForOnHold(ManualAuditQueueRequest aAuditRequest)
            throws LMSException;
    
    public AccountingInvoiceAWBDto retrieveAccountingInvoiceAWBDetails(ManualAuditQueueRequest pRequest) throws LMSException;

    /**
     * Find All RuleNamesByQueueName.
     * <p>
     * This method returns a Audited Filter items .
     * <p>
     * To find the audit rule for a manual audit Queue user must provide following input:<br>
     * <li>Office Identifier.<br>
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
     *            <code> {@link com.unisys.trans.logistics.lms.accounting.dto.ManualAuditQueueRequest
     *            ManualAuditQueueRequest}</code><br>
     *            includes the attributes to find a <code>Audit Filter information</code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.accounting.dto.ManualAuditQueuesFindDto
     *            ManualAuditQueuesFindDto} - (C)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.accounting.dto.ManualAuditQueueResponse
     *         ManualAuditQueueResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.accounting.dto.ManualQueueDetailsDTO# ManualQueueDetailsDTO}
     *         - (1:*)</code>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    public ManualAuditQueueResponse findAllRuleNamesByQueueName(final ManualAuditQueueRequest pRequest)
                throws LMSException;
    
    //Deeps
    public ParticipantReceivableDto findAwbFromParticipantReceivable(ParticipantReceivableDto participantReceivableDto) throws LMSException;
    
    public InterlineOutwardMemoDto findBmCmByOid(InterlineOutwardMemoDto pInterlineOutwardMemoDto) throws LMSException;
    
    public CarrierReceivableDto findAwbFromCarrierReceivable(CarrierReceivableDto carrierReceivableDto) throws LMSException;
    
    public ManualAuditQueueResponse processAirWaybillFromParticipantReceivable(ManualAuditQueueRequest aAuditRequest)
            throws LMSException;
    
    public ManualAuditQueueResponse processAirWaybillForBMCM(ManualAuditQueueRequest aAuditRequest)
            throws LMSException;
    
    public ManualAuditQueueResponse processAirWaybillForRM(ManualAuditQueueRequest aAuditRequest)
            throws LMSException;
    
    public void createAirWayBillHistory(final HistoryPersistRequest pHistoryPersistRequest)
            throws LMSException;
    
	public ManualAuditQueueResponse approveMemos(
			List<AccountingInvoiceAWBDto> accountingInvoiceAWBDtos)
			throws LMSException;

	public ManualAuditQueueResponse showErrorNotification(String currentQueueName) throws LMSException;
}
