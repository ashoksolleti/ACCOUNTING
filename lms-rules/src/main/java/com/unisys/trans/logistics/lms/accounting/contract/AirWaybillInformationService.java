package com.unisys.trans.logistics.lms.accounting.contract;

import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillDto;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillResponse;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingAwbInformationFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingInvoiceDetailDto;
import com.unisys.trans.logistics.lms.accounting.dto.AirWaybillAuditResponse;
import com.unisys.trans.logistics.lms.accounting.dto.GLQueueErrorResponse;
import com.unisys.trans.logistics.lms.accounting.dto.ManualAuditQueueRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantReceivableDto;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.parts.dto.SuggestiveRequest;
import com.unisys.trans.logistics.lms.parts.dto.SuggestiveResponse;


/**
 * <code>AirWaybillRetrieveService</code> handles the Air waybill.
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>find AirWaybill.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.AccountingAwbInformationFindRequest
 *      AccountingAwbInformationFindRequest
 */
public interface AirWaybillInformationService {

    /**
     * Finds the Accounting findAirWaybill for a Air waybill information.
     * <p>
     * This method returns a Air waybill .
     * <p>
     * To find the Accounting Air waybill for a AccountingAwbInformation user must provide following input:<br>
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
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.AccountingAwbInformationFindRequest
     *            AccountingAwbInformationFindRequest}</code><br>
     *            includes the attributes to find a <code>Airwaybill information</code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.accounting.dto.AirWaybillNumberDto
     *            AirWaybillNumberDto} - (C)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillResponse
     *         AccountingAirWaybillResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.accounting.dto. AccountingAirWaybillDto#getAirWaybillDto()
     *         airWaybillDto} - (1:*)</code>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    public AccountingAirWaybillResponse findAirWaybill(final AccountingAwbInformationFindRequest pRequest)
                throws LMSException;

    public AccountingAirWaybillResponse findAirWaybillListForQueue(
                AccountingAwbInformationFindRequest pAccountingAwbInformationFindRequest) throws LMSException;


    public AccountingAirWaybillResponse updateAirWaybill(final AccountingAirWaybillPersistRequest pRequest)
                throws Exception;

    /**
     * This will populate airwaybill participants for AirwaybillParticipantDto.
     * <p>
     * 
     * @param pAirwaybillParticipantDto
     *            <code> {@link com.unisys.trans.logistics.lms.accounting.dto.AirwaybillParticipantDto
     *            AirwaybillParticipantDto} </code><br>
     * @throws LMSException
     *             If the request fails.
     */
    //AuditList
    
    public AirWaybillAuditResponse findAuditAirWayBill(final long pOid) throws LMSException;

    public AirWaybillAuditResponse findAuditErrorQueue(final ManualAuditQueueRequest prequest)throws Exception;
    
	public AccountingAirWaybillResponse findAirWaybillForInvoice(final AccountingAwbInformationFindRequest pRequest) throws LMSException;
	
	public AccountingAirWaybillResponse findAirWaybillForGSARecievableInvoice(final AccountingAwbInformationFindRequest pRequest) throws LMSException;
   
    public AccountingAirWaybillResponse findAirWaybillForInterlineInvoice(final AccountingAwbInformationFindRequest pRequest) throws LMSException;
    
    public AccountingAirWaybillResponse findCCAForInvoice(final AccountingAwbInformationFindRequest pRequest) throws LMSException;
    
    public AccountingAirWaybillResponse findCCAForGSARecievableInvoice(final AccountingAwbInformationFindRequest pRequest) throws LMSException;
    
    public AccountingAirWaybillResponse findAirWaybillToCalcualteSlidingScaleCommision(final AccountingAwbInformationFindRequest pRequest) throws LMSException;
    
    //Suggestive Search
    public SuggestiveResponse findProductCodeWithPrefix(SuggestiveRequest suggestiveRequest)throws LMSException;
    
    public SuggestiveResponse findSpecialHandlingCodePrefix(SuggestiveRequest suggestiveRequest)throws LMSException;
    
    public SuggestiveResponse findStationWithPrefix(SuggestiveRequest suggestiveRequest)throws LMSException;

    public AccountingAirWaybillResponse findAirWaybillForArchival(final AccountingAwbInformationFindRequest pAwbInformationFindRequest, final AccountingInvoiceDetailDto invoiceDetailDto) throws LMSException ;
    
    public void purgeArchivedAirwaybills(List<AccountingAirWaybillDto> accountingAirWaybillDtos)throws LMSException ; 

	public List<ParticipantReceivableDto> findNonAWBsParticipantReceivablesForDCM(AccountingAwbInformationFindRequest pRequest) throws LMSException;

	public void purgeDCMParticipantReceivablesFromCRA(List<ParticipantReceivableDto> participantReceivableDtosList) throws LMSException;

	public AccountingAirWaybillResponse findNonInvoiceAWBS(AccountingAwbInformationFindRequest pAwbInformationFindRequest) throws LMSException; 

	public AirWaybillAuditResponse findOfficeQueueItem(final ManualAuditQueueRequest prequest)throws LMSException;
	
    // Inv Gen bulk call start
	public AirWaybillAuditResponse findAirWaybillAuditEntriesbyOidList(final List<Long> awbOids) throws LMSException;
	
	public Map<Long,AirWaybillAuditResponse> findAuditErrorQueuebyOidList(final ManualAuditQueueRequest prequest) throws LMSException;
    // Inv Gen bulk call end

	public void auditUupdatedAirWaybill(final AccountingAirWaybillPersistRequest aRequest) throws Exception;
	
	public GLQueueErrorResponse findGLQueueErrorList(
			ManualAuditQueueRequest pRequest) throws LMSException;
	
	public void CheckGLQueueErrorList(AccountingAirWaybillResponse aAirWaybillResponse) throws LMSException;
	
}
