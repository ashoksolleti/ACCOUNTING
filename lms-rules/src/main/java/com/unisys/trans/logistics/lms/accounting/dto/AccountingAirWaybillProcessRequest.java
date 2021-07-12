package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ClearingHouseType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ReceivableStatusType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * Request class for AirWaybill Information
 * 
 * @author AhirwaUK
 *
 */
public class AccountingAirWaybillProcessRequest extends AbstractRequest{

	private static final long serialVersionUID = 1L;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	private String documentNo;
	
	private String hostFlightNumber;
	
	private Date invoiceStartDate;
	
	private Date invoiceToDate;
	
	private Date documentIssueDate;
	
	private ReceivableStatusType aWBStatus;
	
	private ClearingHouseType clearancePeriodType;
	
	private BillingSchedulesDto billingSchedulesDto;
	
	private List<BillingSchedulesDto> billingSchedulesDtos;	
	
	//private SearchInvoiceRequest searchDraftInvoiceRequest = new SearchInvoiceRequest();
	
	private AirWaybillNumberDto airWaybillNumber;
     
    private AccountingAirWaybillDto airWaybillDto;
    
    private AccountingInvoiceDetailDto accountingInvoiceDetailDto ;
    
    private AccountingAirWaybillDetailDto airWaybillDetail;
    
    private AccountingInvoiceAWBDto accountingInvoiceAWBDto;
    
    private ParticipantReceivableDto participantReceivableDto;
 
    private AirWaybillListingDto airWaybillListingDto;  

	private String specificAirline;  
	
    private String maxRows;
    
    private boolean download;
    
    public boolean isDownload() {
		return download;
	}

	public void setDownload(boolean download) {
		this.download = download;
	}

	public String getMaxRows() {
		return maxRows;
	}

	public void setMaxRows(String maxRows) {
		this.maxRows = maxRows;
	}

	public AccountingInvoiceDetailDto getAccountingInvoiceDetailDto() {
		return accountingInvoiceDetailDto;
	}

	public void setAccountingInvoiceDetailDto(
			AccountingInvoiceDetailDto accountingInvoiceDetailDto) {
		this.accountingInvoiceDetailDto = accountingInvoiceDetailDto;
	}

	public AccountingAirWaybillDetailDto getAirWaybillDetail() {
		return airWaybillDetail;
	}

	public void setAirWaybillDetail(AccountingAirWaybillDetailDto airWaybillDetail) {
		this.airWaybillDetail = airWaybillDetail;
	}

	public AccountingInvoiceAWBDto getAccountingInvoiceAWBDto() {
		return accountingInvoiceAWBDto;
	}

	public void setAccountingInvoiceAWBDto(
			AccountingInvoiceAWBDto accountingInvoiceAWBDto) {
		this.accountingInvoiceAWBDto = accountingInvoiceAWBDto;
	}

	public ParticipantReceivableDto getParticipantReceivableDto() {
		return participantReceivableDto;
	}

	public void setParticipantReceivableDto(
			ParticipantReceivableDto participantReceivableDto) {
		this.participantReceivableDto = participantReceivableDto;
	}

	/**
	 * @return the billingSchedulesDto
	 */
	public BillingSchedulesDto getBillingSchedulesDto() {
		return billingSchedulesDto;
	}

	/**
	 * @param billingSchedulesDto the billingSchedulesDto to set
	 */
	public void setBillingSchedulesDto(BillingSchedulesDto billingSchedulesDto) {
		this.billingSchedulesDto = billingSchedulesDto;
	}
	
	/**
	 * @return the billingSchedulesDtos
	 */
	public List<BillingSchedulesDto> getBillingSchedulesDtos() {
		return billingSchedulesDtos;
	}

	/**
	 * @param billingSchedulesDtos the billingSchedulesDtos to set
	 */
	public void setBillingSchedulesDtos(
			List<BillingSchedulesDto> billingSchedulesDtos) {
		this.billingSchedulesDtos = billingSchedulesDtos;
	}

	/**
	 * @return the airWaybillNumber
	 */
	public AirWaybillNumberDto getAirWaybillNumber() {
		return airWaybillNumber;
	}

	/**
	 * @param airWaybillNumber the airWaybillNumber to set
	 */
	public void setAirWaybillNumber(AirWaybillNumberDto airWaybillNumber) {
		this.airWaybillNumber = airWaybillNumber;
	}

	/**
	 * @return the airWaybillDto
	 */
	public AccountingAirWaybillDto getAirWaybillDto() {
		return airWaybillDto;
	}

	/**
	 * @param airWaybillDto the airWaybillDto to set
	 */
	public void setAirWaybillDto(AccountingAirWaybillDto airWaybillDto) {
		this.airWaybillDto = airWaybillDto;
	}

	/**
	 * @return airWaybillListingDto
	 */
	public AirWaybillListingDto getAirWaybillListingDto() {
		return airWaybillListingDto;
	}
	
	/**
	 * @param airWaybillListingDto the airWaybillListingDto to set
	 */
	public void setAirWaybillListingDto(AirWaybillListingDto airWaybillListingDto) {
		this.airWaybillListingDto = airWaybillListingDto;
	}

	public String getHostFlightNumber() {
		return hostFlightNumber;
	}

	public void setHostFlightNumber(String hostFlightNumber) {
		this.hostFlightNumber = hostFlightNumber;
	}

	public Date getInvoiceStartDate() {
		return invoiceStartDate;
	}

	public void setInvoiceStartDate(Date invoiceStartDate) {
		this.invoiceStartDate = invoiceStartDate;
	}

	public Date getInvoiceToDate() {
		return invoiceToDate;
	}

	public void setInvoiceToDate(Date invoiceToDate) {
		this.invoiceToDate = invoiceToDate;
	}

	public Date getDocumentIssueDate() {
		return documentIssueDate;
	}

	public void setDocumentIssueDate(Date documentIssueDate) {
		this.documentIssueDate = documentIssueDate;
	}

	public ReceivableStatusType getaWBStatus() {
		return aWBStatus;
	}

	public void setaWBStatus(ReceivableStatusType aWBStatus) {
		this.aWBStatus = aWBStatus;
	}

	public String getDocumentNo() {
		return documentNo;
	}

	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
	}

	public ClearingHouseType getClearancePeriodType() {
		return clearancePeriodType;
	}

	public void setClearancePeriodType(ClearingHouseType clearancePeriodType) {
		this.clearancePeriodType = clearancePeriodType;
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
}
