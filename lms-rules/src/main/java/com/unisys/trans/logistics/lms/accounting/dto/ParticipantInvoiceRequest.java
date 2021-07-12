/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.crypto.IllegalBlockSizeException;

import com.unisys.trans.logistics.lms.accounting.dto.constants.GenerateInvoiceType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InvoiceGenerationMode;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InvoiceStatusType;

/**
 * 
 * @author SeramRaK
 */
public class ParticipantInvoiceRequest extends
		AbstractParticipantInvoiceRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BillingSchedulesDto billingScheduleDto;

	private InvoiceStatusType generateInvoice;
	
	private InterlineInwardBillingFindDto interlineInwardFindDto;
	
	private InvoiceGenerationMode invoiceGenerationMode;
	private GenerateInvoiceType generateInvoiceType;
	
	 private Set<AccountingInvoiceDetailDto> accountingInvoiceDetails;
	
	private String carrierCode;

	private String participantTypeCountry;
	
	 private Set<CommercialParticipantInvoiceAWBDto> existingAWBDtos;
	 

		public Set<CommercialParticipantInvoiceAWBDto> getExistingAWBDtos() {
			return existingAWBDtos;
		}

		public void setExistingAWBDtos(Set<CommercialParticipantInvoiceAWBDto> existingAWBDtos) {
			this.existingAWBDtos = existingAWBDtos;
		}

	private ParticipantInvoiceSummaryDto invoiceSummaryDto; 
	
	private ParticipantInvoiceSummaryDto invoiceTaxSummaryDto;

	private List<ParticipantInvoiceSummaryDto> invoiceSummaryDtos;
	
	private AirWaybillRevenueDto airWaybillRevenueDto;
	
	private boolean isScheduled ;
	

	private boolean isProvision;
	
	public boolean isProvision() {
		return isProvision;
	}

	public void setProvision(boolean isProvision) {
		this.isProvision = isProvision;
	}

	private java.util.Date invoiceListingDays;
	
	private PaymentDetailsDto paymentDetailsDto;
	
	private String invoiceNumber;
	// item 317
	private List<ParticipantInvoiceDetailDto> onHoldList;
	
	private List<AccountingInvoiceAWBDto> rejectionMemoList;
	
	private List remarksList;
	
	protected boolean retrieveAwbs = true;
	
	private List<AccountingParticipantDto> accountingParticipantDtoList;
	
	private List<String> carrierCodesList;
	
	private AccountingInvoiceBillingScheduleDto invoiceBillingScheduleDto;
	
	private List<ParticipantInvoiceSummaryDto> existingInvoiceSummaryDtos;

	private String specificAirline;
	
	private Long invoiceDetailOid;
	
    private String cassFileName;		    
    private byte[] cassFile;

	public Long getInvoiceDetailOid() {
		return invoiceDetailOid;
	}

	public void setInvoiceDetailOid(Long invoiceDetailOid) {
		this.invoiceDetailOid = invoiceDetailOid;
	}
	
	private Long batchJobId;

	public Long getBatchJobId() {
		return batchJobId;
	}

	public void setBatchJobId(Long batchJobId) {
		this.batchJobId = batchJobId;
	}

	public List<AccountingInvoiceAWBDto> getRejectionMemoList() {
		return rejectionMemoList;
	}

	public void setRejectionMemoList(List<AccountingInvoiceAWBDto> rejectionMemoList) {
		this.rejectionMemoList = rejectionMemoList;
	}

	
	
	
	public List getRemarksList() {
		return remarksList;
	}

	public void setRemarksList(List remarksList) {
		this.remarksList = remarksList;
	}

	public List<ParticipantInvoiceDetailDto> getOnHoldList() {
		return onHoldList;
	}

	public void setOnHoldList(List<ParticipantInvoiceDetailDto> onHoldList) {
		this.onHoldList = onHoldList;
	}

	
	
	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public PaymentDetailsDto getPaymentDetailsDto() {
		return paymentDetailsDto;
	}

	public void setPaymentDetailsDto(PaymentDetailsDto paymentDetailsDto) {
		this.paymentDetailsDto = paymentDetailsDto;
	}

	/**
	 * @return the isScheduled
	 */
	public boolean getIsScheduled() {
		return isScheduled;
	}

	/**
	 * @param isScheduled the isScheduled to set
	 */
	public void setIsScheduled(boolean isScheduled) {
		this.isScheduled = isScheduled;
	}

	/**
	 * @return the airWaybillRevenueDto
	 */
	public AirWaybillRevenueDto getAirWaybillRevenueDto() {
		return airWaybillRevenueDto;
	}

	/**
	 * @param airWaybillRevenueDto the airWaybillRevenueDto to set
	 */
	public void setAirWaybillRevenueDto(AirWaybillRevenueDto airWaybillRevenueDto) {
		this.airWaybillRevenueDto = airWaybillRevenueDto;
	}

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public String getParticipantTypeCountry() {
		return participantTypeCountry;
	}

	public void setParticipantTypeCountry(String participantTypeCountry) {
		this.participantTypeCountry = participantTypeCountry;
	}

	public BillingSchedulesDto getBillingScheduleDto() {
		return billingScheduleDto;
	}

	public void setBillingScheduleDto(BillingSchedulesDto billingScheduleDto) {
		this.billingScheduleDto = billingScheduleDto;
	}

	public InvoiceStatusType getGenerateInvoice() {
		return generateInvoice;
	}

	public void setGenerateInvoice(InvoiceStatusType generateInvoice) {
		this.generateInvoice = generateInvoice;
	}

	public InvoiceGenerationMode getInvoiceGenerationMode() {
		return invoiceGenerationMode;
	}

	public void setInvoiceGenerationMode(
			InvoiceGenerationMode invoiceGenerationMode) {
		this.invoiceGenerationMode = invoiceGenerationMode;
	}

	public GenerateInvoiceType getGenerateInvoiceType() {
		return generateInvoiceType;
	}

	public void setGenerateInvoiceType(GenerateInvoiceType generateInvoiceType) {
		this.generateInvoiceType = generateInvoiceType;
	}

	private List<AccountingInvoiceBillingScheduleDto> accountingInvoiceBillingScheduleDtoList;

	public List<AccountingInvoiceBillingScheduleDto> getAccountingInvoiceBillingScheduleDtoList() {
		return accountingInvoiceBillingScheduleDtoList;
	}

	public void setAccountingInvoiceBillingScheduleDtoList(List<AccountingInvoiceBillingScheduleDto> accountingInvoiceBillingScheduleDtoList) {
		this.accountingInvoiceBillingScheduleDtoList = accountingInvoiceBillingScheduleDtoList;
	}

	/**
	 * @return the invoiceSummaryDtos
	 */
	public List<ParticipantInvoiceSummaryDto> getInvoiceSummaryDtos() {
		return invoiceSummaryDtos;
	}

	/**
	 * @param invoiceSummaryDtos the invoiceSummaryDtos to set
	 */
	public void setInvoiceSummaryDtos(
			List<ParticipantInvoiceSummaryDto> invoiceSummaryDtos) {
		this.invoiceSummaryDtos = invoiceSummaryDtos;
	}

	/**
	 * @return the invoiceSummaryDto
	 */
	public ParticipantInvoiceSummaryDto getInvoiceSummaryDto() {
		return invoiceSummaryDto;
	}

	/**
	 * @param invoiceSummaryDto the invoiceSummaryDto to set
	 */
	public void setInvoiceSummaryDto(ParticipantInvoiceSummaryDto invoiceSummaryDto) {
		this.invoiceSummaryDto = invoiceSummaryDto;
	}

	public ParticipantInvoiceSummaryDto getInvoiceTaxSummaryDto() {
		return invoiceTaxSummaryDto;
	}

	public void setInvoiceTaxSummaryDto(ParticipantInvoiceSummaryDto invoiceTaxSummaryDto) {
		this.invoiceTaxSummaryDto = invoiceTaxSummaryDto;
	}

	/**
	 * @return the interlineInwardFindDto
	 */
	public InterlineInwardBillingFindDto getInterlineInwardFindDto() {
		return interlineInwardFindDto;
	}

	/**
	 * @param interlineInwardFindDto the interlineInwardFindDto to set
	 */
	public void setInterlineInwardFindDto(
			InterlineInwardBillingFindDto interlineInwardFindDto) {
		this.interlineInwardFindDto = interlineInwardFindDto;
	}

	/**
	 * @return the accountingInvoiceDetails
	 */
	public Set<AccountingInvoiceDetailDto> getAccountingInvoiceDetails() {
		return accountingInvoiceDetails;
	}

	/**
	 * @param accountingInvoiceDetails the accountingInvoiceDetails to set
	 */
	public void setAccountingInvoiceDetails(
			Set<AccountingInvoiceDetailDto> accountingInvoiceDetails) {
		this.accountingInvoiceDetails = accountingInvoiceDetails;
	}

	/**
	 * @param isScheduled the isScheduled to set
	 */
	public void setScheduled(boolean isScheduled) {
		this.isScheduled = isScheduled;
	}

	/**
	 * @return the invoiceListingDays
	 */
	public java.util.Date getInvoiceListingDays() {
		return invoiceListingDays;
	}

	/**
	 * @param invoiceListingDays the invoiceListingDays to set
	 */
	public void setInvoiceListingDays(java.util.Date invoiceListingDays) {
		this.invoiceListingDays = invoiceListingDays;
	}

	/**
	 * @return the accountingParticipantDtoList
	 */
	public List<AccountingParticipantDto> getAccountingParticipantDtoList() {
		return accountingParticipantDtoList;
	}

	/**
	 * @param accountingParticipantDtoList the accountingParticipantDtoList to set
	 */
	public void setAccountingParticipantDtoList(
			List<AccountingParticipantDto> accountingParticipantDtoList) {
		this.accountingParticipantDtoList = accountingParticipantDtoList;
	}

	/**
	 * @return the invoiceBillingScheduleDto
	 */
	public AccountingInvoiceBillingScheduleDto getInvoiceBillingScheduleDto() {
		return invoiceBillingScheduleDto;
	}

	/**
	 * @param invoiceBillingScheduleDto the invoiceBillingScheduleDto to set
	 */
	public void setInvoiceBillingScheduleDto(
			AccountingInvoiceBillingScheduleDto invoiceBillingScheduleDto) {
		this.invoiceBillingScheduleDto = invoiceBillingScheduleDto;
	}

	/**
	 * @return the existingInvoiceSummaryDtos
	 */
	public List<ParticipantInvoiceSummaryDto> getExistingInvoiceSummaryDtos() {
		return existingInvoiceSummaryDtos;
	}

	/**
	 * @param existingInvoiceSummaryDtos the existingInvoiceSummaryDtos to set
	 */
	public void setExistingInvoiceSummaryDtos(
			List<ParticipantInvoiceSummaryDto> existingInvoiceSummaryDtos) {
		this.existingInvoiceSummaryDtos = existingInvoiceSummaryDtos;
	}

	public boolean isRetrieveAwbs() {
		return retrieveAwbs;
	}

	public void setRetrieveAwbs(boolean retrieveAwbs) {
		this.retrieveAwbs = retrieveAwbs;
	}
	
	public String getSpecificAirline() {
		return this.specificAirline;
	}

	/**
	 * @param specificAirline the specificAirline to set
	 */
	public void setSpecificAirline(final String specificAirline) {
		this.specificAirline = specificAirline;
	}

	public String getCassFileName() {
		return cassFileName;
	}

	public void setCassFileName(String cassFileName) {
		this.cassFileName = cassFileName;
	}

	public byte[] getCassFile() {
		return cassFile;
	}

	public void setCassFile(byte[] cassFile) {
		this.cassFile = cassFile;
	}

	public List<String> getCarrierCodesList() {
		return carrierCodesList;
	}

	public void setCarrierCodesList(List<String> carrierCodesList) {
		this.carrierCodesList = carrierCodesList;
	}
	

}