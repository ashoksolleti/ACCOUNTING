/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.contract;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.ejb.Asynchronous;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillDto;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingInvoiceAWBDto;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingInvoiceDetailDto;
import com.unisys.trans.logistics.lms.accounting.dto.AirWaybillRequest;
import com.unisys.trans.logistics.lms.accounting.dto.BillingSchedulesDto;
import com.unisys.trans.logistics.lms.accounting.dto.GSTRReturnDto;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoiceDetailDto;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoicePrintResponse;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoiceRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoiceResponse;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoiceSummaryDto;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantReceivableDto;
import com.unisys.trans.logistics.lms.accounting.dto.SearchInvoiceRequest;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.constants.QueueItemObjectType;


 public interface InvoiceService extends Serializable {
		
		public ParticipantInvoiceResponse retrieveInvoices(
				SearchInvoiceRequest searchDraftInvoiceRequest)throws LMSException;
		
		public ParticipantInvoiceResponse retrieveInvoicesForArchival(
				SearchInvoiceRequest searchDraftInvoiceRequest)throws LMSException;


		 public void sendConsolidatedEmailForGenerationFailure(List<BillingSchedulesDto> billingSchedulesDtos);

		
		public ParticipantInvoiceResponse finalizeDraftInvoice(ParticipantInvoiceRequest participantInvoiceRequest) throws LMSException;

		public ParticipantInvoiceResponse finalizeDraftInvoiceBatch(ParticipantInvoiceRequest participantInvoiceRequest) throws LMSException;

		public void mergeNftpInvoicePDFs(Long batchJobId) throws LMSException;
		
		public ParticipantInvoiceResponse retrieveInvoicesToFinalize(SearchInvoiceRequest searchDraftInvoiceRequest) throws LMSException;

		public ParticipantInvoiceResponse sendInvoice(ParticipantInvoiceRequest participantInvoiceRequest) throws LMSException, Exception;
		
		public void purgeArchivedAccountingDetails(ParticipantInvoiceRequest participantInvoiceRequest) throws LMSException;

	
		public ParticipantInvoiceResponse updateOnHoldAWB(ParticipantInvoiceRequest participantInvoiceRequest)throws LMSException;
				
		public void queueAirWaybillItem(Long pOId, QueueItemObjectType queueItemObjectType, String specificAirline, String host) throws LMSException;
		
		public void createParticipantReceivableHistory(AccountingAirWaybillDto aAccAirWayBillDto,
				final List<ParticipantReceivableDto> poldParticipantReceivables,
				final List<ParticipantReceivableDto> pNewParticipantReceivables) throws LMSException;
				
		public ParticipantInvoiceResponse updateOnHoldRejectionMemo(ParticipantInvoiceRequest aInvoiceRequest) throws LMSException;
		
		public ParticipantInvoiceResponse showErrorNotification(boolean remarksCheck,boolean mapEntry);
		public Class getAWBDetails(AirWaybillRequest airWaybillRequest)throws LMSException;

		/**
	     * Retrieves the Participant Invoice Print  for a Participant Account Number and Invoice Number.
	     * <p>
	     * This method returns a ParticipantInvoicePrintResponse .
	     * <p>
	     * To find the  Participant Invoice Print  for a Participant User must provide following input:<br>
	     * <li>Participant Account Number.<br>
	     * <li>Invoice Number.<br>
	     * <p>
	     * @param participantInvoiceRequest
	     *            <code>
	     *            {@link com.unisys.trans.logistics.lms.accounting.dto.participantInvoiceRequest
	     *            participantInvoiceRequest}</code><br>
	     *            includes the attributes to find a <code>Participant Invoice Print File </code>.
	     *            <ul>
	     *            <li><code>
	     *            {@link com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoiceRequest#setInvoiceSummaryDto
	     *            }</code>
	     *            </ul>
	     *            <p>
	     * @return <code> {@link com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoicePrintResponse
	     *         ParticipantInvoicePrintResponse}</code>
	     *         <ul>
	     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	     *         Response fields}</code><br>
	     *         holds the CodeMessage <code>
	     *         {@link com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoicePrintResponse#getInvoiceFile
	     *         getInvoiceFile} </code>
	     *         </ul>
	     * @throws LMSException
	     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
	     *             contains the status code, human readable message, and message type.
	     */
		
		public ParticipantInvoicePrintResponse viewInvoiceInTemplate(ParticipantInvoiceRequest participantInvoiceRequest)
				throws LMSException;
		
		public ParticipantInvoicePrintResponse creditTaxInvoiceInTemplate(ParticipantInvoiceRequest participantInvoiceRequest)
				throws LMSException;
		/**
	     *Creates the Participant Invoice Print .
	     * <p>
	     * @param participantInvoiceSummaryDto
	             <code>
	     *            {@link com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoiceSummaryDto
	     *            ParticipantInvoiceSummaryDto}</code><br>
	     *            
	     *            <p>
	     * @throws LMSException
	     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
	     *             contains the status code, human readable message, and message type.
	     */
		
		public void printInvoiceParticipant(ParticipantInvoiceSummaryDto participantInvoiceSummaryDto,BillingSchedulesDto billingSchedulesDto,ParticipantInvoiceRequest generateInvoiceRequest)
				throws LMSException;
				
				public ParticipantInvoiceResponse validateInvoiceFindRequest(
						SearchInvoiceRequest searchDraftInvoiceRequest)throws LMSException;;
	  
		public ParticipantInvoiceResponse storeInvoiceAirwayBill(
				ParticipantInvoiceRequest participantInvoiceRequest)throws LMSException;

		public ParticipantInvoiceResponse retrievePriliminaryInvoicesForArchival(SearchInvoiceRequest searchDraftInvoiceRequest) throws LMSException;		
		
		public void queueAirWaybillItemForRejectionMemo(final Long pOId, final String specificAirline, String host) throws LMSException;
		
		public void queueAirWaybillItemForBMCM(final Long pOId,
				QueueItemObjectType queueItemObjectType,final String specificAirline, String host) throws LMSException;
		
	  	public void createAWBPDF(ParticipantInvoiceRequest participantInvoiceRequest)throws LMSException;
	  	
	  	public void createAWBPDFForHardCopy(ParticipantInvoiceRequest participantInvoiceRequest)throws LMSException;
		
		public void ftpAwbPdf();
		
		public void sendInvoiceBatch();	
		
		//nagaraj
		// Invoicing logic for GSTR Return
		public ParticipantInvoiceResponse getDraftInvoiceBatch(ParticipantInvoiceRequest participantInvoiceRequest) throws LMSException;
		
		public List<ParticipantReceivableDto> getParticipantReceivableForDCM(String invoiceNumber, Date invoiceDate,List<Long> accAWBOidList) throws LMSException;
		
		public List<ParticipantReceivableDto> getParticipantReceivableForAWB(String invoiceNumber, Date invoiceDate,List<Long> accAWBOidList) throws LMSException;
		
		public void updateGSTROidInoviceAWB(List<Long> longList, long gstrReturnOid)throws LMSException;
		
		public void updateGSTROidParticipantReceivable(List<Long> longList, long gstrReturnOid,String fileType,String crdrIndicator)throws LMSException;
		
		public void updateGSTRReturnOidParticipantReceivable(Long awbOid, long gstrReturnOid)throws LMSException;		
		
		public void updateGSTROidInoviceDCM(List<Long> longList, long gstrReturnOid,String crdrIndicator,String documentType)throws LMSException;
		
		public long findOriginalParticipantReceivablesOid(long accAwbOid, long prOid)throws LMSException;
		
		public List<GSTRReturnDto> getGstr1ReturnData(long oid,String invoiceNumber,List<ParticipantInvoiceDetailDto> participantInvoiceAWBDtoTable,List<ParticipantInvoiceDetailDto> cASSParticipantInvoiceDCMDtoTable,long jobId,ParticipantInvoiceSummaryDto participantInvoiceSummaryDto) throws LMSException;	
		
		public ParticipantReceivableDto findOriginalDocumentNumber(Long oid) throws LMSException;	
		
		public void createGSTInvoicePDFs(AccountingInvoiceDetailDto accountingInvoiceDetailDto, ParticipantInvoiceSummaryDto participantInvoiceSummaryDto, long jobId, ParticipantInvoiceRequest participantInvoiceRequest) throws LMSException;

		public void sendConsolidatedEmailForFinalization(List<ParticipantInvoiceSummaryDto> invoiceSummaryDtos, boolean failure);

		public void sendConsolidatedEmailForGeneration(boolean genStatus, List<BillingSchedulesDto> billingSchedulesDtoList);

		public void sendMailInvoiceFinalizationNoRecords();

		public void sendMailInvoiceGenerationNoRecords();

		public void updateStatusAsInvoicingCompletedByBillingScheduleOId(long billingScheduleOId, String participantType);
 }
