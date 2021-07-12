package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ProvisionalFlownRevenue;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class AccountingEntryErrorDto extends PersistenceObjectDto {
	private static final long serialVersionUID = 1L;

	private Long oid;

	private String errorDetails;

	private String accountingMonth;

	private String accountingRemarks;

	private String airWaybillNumber;

	private String arPostedIndicator;

	private String dcmReferenceNumber;

	private Integer financialYear;

	private Date flightDate;

	private String flightNumber;

	private String flightSegmentDestination;

	private String flightSegmentOrigin;

	private String glPostedIndicator;

	private String invoiceNumber;

	private String journalId;

	private String provisionalFlownRevenue;

	private String rejectionMemoNumber;

	private String reversalIndicator;

	private String triggeringPoint;
	
	private Long partRecOid;	

	private AccountingEntryErrorObjectDto accountingEntryErrorObjectDto = new AccountingEntryErrorObjectDto();

	/**
	 * @param oid
	 *            the oid to set
	 */
	public void setOid(long oid) {
		this.oid = oid;
	}

	/**
	 * @return the errorDetails
	 */
	public String getErrorDetails() {
		return errorDetails;
	}

	/**
	 * @param errorDetails
	 *            the errorDetails to set
	 */
	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}

	/**
	 * @return the accountingMonth
	 */
	public String getAccountingMonth() {
		return accountingMonth;
	}

	/**
	 * @param accountingMonth
	 *            the accountingMonth to set
	 */
	public void setAccountingMonth(String accountingMonth) {
		this.accountingMonth = accountingMonth;
	}

	/**
	 * @return the accountingRemarks
	 */
	public String getAccountingRemarks() {
		return accountingRemarks;
	}

	/**
	 * @param accountingRemarks
	 *            the accountingRemarks to set
	 */
	public void setAccountingRemarks(String accountingRemarks) {
		this.accountingRemarks = accountingRemarks;
	}

	

	public String getAirWaybillNumber() {
		return airWaybillNumber;
	}

	
	public void setAirWaybillNumber(String airWaybillNumber) {
		this.airWaybillNumber = airWaybillNumber;
	}

	/**
	 * @return the arPostedIndicator
	 */
	public String getArPostedIndicator() {
		return arPostedIndicator;
	}

	/**
	 * @param arPostedIndicator
	 *            the arPostedIndicator to set
	 */
	public void setArPostedIndicator(String arPostedIndicator) {
		this.arPostedIndicator = arPostedIndicator;
	}

	/**
	 * @return the dcmReferenceNumber
	 */
	public String getDcmReferenceNumber() {
		return dcmReferenceNumber;
	}

	/**
	 * @param dcmReferenceNumber
	 *            the dcmReferenceNumber to set
	 */
	public void setDcmReferenceNumber(String dcmReferenceNumber) {
		this.dcmReferenceNumber = dcmReferenceNumber;
	}

	/**
	 * @return the financialYear
	 */
	public Integer getFinancialYear() {
		return financialYear;
	}

	/**
	 * @param financialYear
	 *            the financialYear to set
	 */
	public void setFinancialYear(Integer financialYear) {
		this.financialYear = financialYear;
	}

	/**
	 * @return the flightDate
	 */
	public Date getFlightDate() {
		return flightDate;
	}

	/**
	 * @param flightDate
	 *            the flightDate to set
	 */
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * @param flightNumber
	 *            the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * @return the flightSegmentDestination
	 */
	public String getFlightSegmentDestination() {
		return flightSegmentDestination;
	}

	/**
	 * @param flightSegmentDestination
	 *            the flightSegmentDestination to set
	 */
	public void setFlightSegmentDestination(String flightSegmentDestination) {
		this.flightSegmentDestination = flightSegmentDestination;
	}

	/**
	 * @return the flightSegmentOrigin
	 */
	public String getFlightSegmentOrigin() {
		return flightSegmentOrigin;
	}

	/**
	 * @param flightSegmentOrigin
	 *            the flightSegmentOrigin to set
	 */
	public void setFlightSegmentOrigin(String flightSegmentOrigin) {
		this.flightSegmentOrigin = flightSegmentOrigin;
	}

	/**
	 * @return the glPostedIndicator
	 */
	public String getGlPostedIndicator() {
		return glPostedIndicator;
	}

	/**
	 * @param glPostedIndicator
	 *            the glPostedIndicator to set
	 */
	public void setGlPostedIndicator(String glPostedIndicator) {
		this.glPostedIndicator = glPostedIndicator;
	}

	/**
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	/**
	 * @param invoiceNumber
	 *            the invoiceNumber to set
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	/**
	 * @return the journalId
	 */
	public String getJournalId() {
		return journalId;
	}

	/**
	 * @param journalId
	 *            the journalId to set
	 */
	public void setJournalId(String journalId) {
		this.journalId = journalId;
	}

	

	

	public String getProvisionalFlownRevenue() {
		return provisionalFlownRevenue;
	}

	public void setProvisionalFlownRevenue(String provisionalFlownRevenue) {
		this.provisionalFlownRevenue = provisionalFlownRevenue;
	}

	/**
	 * @return the rejectionMemoNumber
	 */
	public String getRejectionMemoNumber() {
		return rejectionMemoNumber;
	}

	/**
	 * @param rejectionMemoNumber
	 *            the rejectionMemoNumber to set
	 */
	public void setRejectionMemoNumber(String rejectionMemoNumber) {
		this.rejectionMemoNumber = rejectionMemoNumber;
	}

	/**
	 * @return the reversalIndicator
	 */
	public String getReversalIndicator() {
		return reversalIndicator;
	}

	/**
	 * @param reversalIndicator
	 *            the reversalIndicator to set
	 */
	public void setReversalIndicator(String reversalIndicator) {
		this.reversalIndicator = reversalIndicator;
	}

	

	/**
	 * @return the triggeringPoint
	 */
	public String getTriggeringPoint() {
		return triggeringPoint;
	}

	/**
	 * @param triggeringPoint the triggeringPoint to set
	 */
	public void setTriggeringPoint(String triggeringPoint) {
		this.triggeringPoint = triggeringPoint;
	}
	
	/**
	 * @return the partRecOid
	 */
	public Long getPartRecOid() {
		return partRecOid;
	}

	/**
	 * @param partRecOid the partRecOid to set
	 */
	public void setPartRecOid(Long partRecOid) {
		this.partRecOid = partRecOid;
	}

	/**
	 * @return the accountingEntryErrorObjectDto
	 */
	public AccountingEntryErrorObjectDto getAccountingEntryErrorObjectDto() {
		return accountingEntryErrorObjectDto;
	}

	/**
	 * @param accountingEntryErrorObjectDto
	 *            the accountingEntryErrorObjectDto to set
	 */
	public void setAccountingEntryErrorObjectDto(
			AccountingEntryErrorObjectDto accountingEntryErrorObjectDto) {
		this.accountingEntryErrorObjectDto = accountingEntryErrorObjectDto;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return oid;
	}
}