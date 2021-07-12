package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class AccountingEntryFindDto extends PersistenceObjectDto {

	private static final long serialVersionUID = 1L;

	private Long oId = 0l;
	private String journalId;
	private String airWaybillNumber;
	private String invoiceNumber;
	private String flightNumber;
	private String accountingMonth;
	private Integer financialYear;
	private String triggeringPoint;
	private Boolean reversalIndicator;
	private String accountingRemarks;
	private String glPostedIndicator;
	private String arPostedIndicator;
	private String provisionalFlownRevenue;
	private String flightSegmentOrigin;
	private String flightSegmentDestination;
	private String glFileName;
	private String arFileName;
	private Date accountingDate;
	private String rejectionMemoNumber;
	private String dcmReferenceNumber;
	private Date flightDate;
	private String modeOfAccounting;
	private ActionType actionType;
	private String accountNumber;
	private String accountHeader;
	private boolean error;
	private String manualAccountingReferenceId;
	private Set<AccountingEntryJournalDto> accountingEntryJournalDto = new HashSet<AccountingEntryJournalDto>();
	private AccountingEntryJournalDto accountingJournalDto = new AccountingEntryJournalDto();
	private boolean create = false;
	private boolean delete = false;
	private boolean update = false;
	private int versionIdentifier = 0;
	private boolean inter = false;
	private String specificAirline;
	private AirWaybillNumberDto airWaybillNumberDto = new AirWaybillNumberDto();
	
	/**
	 * @return the airWaybillNumberDto
	 */
	public AirWaybillNumberDto getAirWaybillNumberDto() {
		
		if(airWaybillNumberDto.getAirlineCodeNbr() != null && airWaybillNumberDto.getShipmentReference() != null)
		{
		String a = airWaybillNumberDto.getAirlineCodeNbr();
		String b = airWaybillNumberDto.getShipmentReference();
		if(a.length()>3 && b.length()>=8){
		String airwarbill = a+"-"+b;
		this.setAirWaybillNumber(airwarbill);
		}
		}
		return airWaybillNumberDto;
	}

	/**
	 * @param airWaybillNumberDto the airWaybillNumberDto to set
	 */
	public void setAirWaybillNumberDto(AirWaybillNumberDto airWaybillNumberDto) {
		this.airWaybillNumberDto = airWaybillNumberDto;
	}

	/**
	 * @return the accountingDate
	 */
	public Date getAccountingDate() {
		return accountingDate;
	}

	/**
	 * @param accountingDate
	 *            the accountingDate to set
	 */
	public void setAccountingDate(Date accountingDate) {
		this.accountingDate = accountingDate;
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

	/**
	 * @return the airWaybillNumber
	 */
	public String getAirWaybillNumber() {
		if(airWaybillNumberDto.getAirlineCodeNbr()!=null && airWaybillNumberDto.getShipmentReference()!=null){
			airWaybillNumber = airWaybillNumberDto.getAirlineCodeNbr()+"-"+airWaybillNumberDto.getShipmentReference();
		}
		//LMSC-8253
		if(airWaybillNumberDto.getModOverrideIndicator()!=null) {
			airWaybillNumber = airWaybillNumber+airWaybillNumberDto.getModOverrideIndicator();
		}
		return airWaybillNumber;
	}

	/**
	 * @param airWaybillNumber
	 *            the airWaybillNumber to set
	 */
	public void setAirWaybillNumber(String airWaybillNumber) {
		this.airWaybillNumber = airWaybillNumber;
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
	 * @return the accountingMonth
	 */
	public String getAccountingMonth() {
		if(accountingMonth!=null && !accountingMonth.isEmpty()){
			accountingMonth=accountingMonth.toUpperCase();
		}
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
	 * @return the reversalIndicator
	 */
	public Boolean getReversalIndicator() {
		return reversalIndicator;
	}

	/**
	 * @param reversalIndicator
	 *            the reversalIndicator to set
	 */
	public void setReversalIndicator(Boolean reversalIndicator) {
		this.reversalIndicator = reversalIndicator;
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
	 * @return the provisionalFlownRevenue
	 */
	public String getProvisionalFlownRevenue() {
		return provisionalFlownRevenue;
	}

	/**
	 * @param provisionalFlownRevenue
	 *            the provisionalFlownRevenue to set
	 */
	public void setProvisionalFlownRevenue(String provisionalFlownRevenue) {
		this.provisionalFlownRevenue = provisionalFlownRevenue;
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
	 * @return the accountingEntryJournalDto
	 */
	public Set<AccountingEntryJournalDto> getAccountingEntryJournalDto() {
		return accountingEntryJournalDto;
	}

	/**
	 * @param accountingEntryJournalDto
	 *            the accountingEntryJournalDto to set
	 */
	public void setAccountingEntryJournalDto(
			Set<AccountingEntryJournalDto> accountingEntryJournalDto) {
		this.accountingEntryJournalDto = accountingEntryJournalDto;
	}

	public List<AccountingEntryJournalDto> getAccountingEntryJournalDtoList() {

		List<AccountingEntryJournalDto> dtos = new ArrayList<AccountingEntryJournalDto>();

		if (accountingEntryJournalDto != null
				&& !accountingEntryJournalDto.isEmpty()) {
			dtos.addAll(accountingEntryJournalDto);
		}

		return dtos;
	}

	public void setAccountingEntryJournalDtoList(
			List<AccountingEntryJournalDto> accountingEntryJournalDtoList) {

		if (this.accountingEntryJournalDto == null) {
			accountingEntryJournalDto = new HashSet<AccountingEntryJournalDto>();

		} else {
			accountingEntryJournalDto.clear();
		}

		accountingEntryJournalDto.addAll(accountingEntryJournalDtoList);

	}

	/**
	 * @return the manualAccountingReferenceId
	 */
	public String getManualAccountingReferenceId() {
		return manualAccountingReferenceId;
	}

	/**
	 * @param manualAccountingReferenceId
	 *            the manualAccountingReferenceId to set
	 */
	public void setManualAccountingReferenceId(
			String manualAccountingReferenceId) {
		this.manualAccountingReferenceId = manualAccountingReferenceId;
	}

	/**
	 * @return the modeOfAccounting
	 */
	public String getModeOfAccounting() {
		return modeOfAccounting;
	}

	/**
	 * @param modeOfAccounting
	 *            the modeOfAccounting to set
	 */
	public void setModeOfAccounting(String modeOfAccounting) {
		this.modeOfAccounting = modeOfAccounting;
	}

	/**
	 * @return the actionType
	 */
	public ActionType getActionType() {
		return actionType;
	}

	/**
	 * @param actionType
	 *            the actionType to set
	 */
	public void setActionType(ActionType actionType) {
		this.actionType = actionType;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber
	 *            the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the accountHeader
	 */
	public String getAccountHeader() {
		return accountHeader;
	}

	/**
	 * @param accountHeader
	 *            the accountHeader to set
	 */
	public void setAccountHeader(String accountHeader) {
		this.accountHeader = accountHeader;
	}

	/**
	 * @return the error
	 */
	public boolean isError() {
		return error;
	}

	/**
	 * @param error
	 *            the error to set
	 */
	public void setError(boolean error) {
		this.error = error;
	}

	/**
	 * @return the accountingJournalDto
	 */
	public AccountingEntryJournalDto getAccountingJournalDto() {
		return accountingJournalDto;
	}

	/**
	 * @param accountingJournalDto
	 *            the accountingJournalDto to set
	 */
	public void setAccountingJournalDto(
			AccountingEntryJournalDto accountingJournalDto) {
		this.accountingJournalDto = accountingJournalDto;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId
	 *            the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return this.oId;
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
	 * @return the glFileName
	 */
	public String getGlFileName() {
		return glFileName;
	}

	/**
	 * @param glFileName
	 *            the glFileName to set
	 */
	public void setGlFileName(String glFileName) {
		this.glFileName = glFileName;
	}

	/**
	 * @return the arFileName
	 */
	public String getArFileName() {
		return arFileName;
	}

	/**
	 * @param arFileName
	 *            the arFileName to set
	 */
	public void setArFileName(String arFileName) {
		this.arFileName = arFileName;
	}

	/**
	 * @return the create
	 */
	public boolean isCreate() {
		return create;
	}

	/**
	 * @param create
	 *            the create to set
	 */
	public void setCreate(boolean create) {
		this.create = create;
	}

	/**
	 * @return the delete
	 */
	public boolean isDelete() {
		return delete;
	}

	/**
	 * @param delete
	 *            the delete to set
	 */
	public void setDelete(boolean delete) {
		this.delete = delete;
	}

	/**
	 * @return the update
	 */
	public boolean isUpdate() {
		return update;
	}

	/**
	 * @param update
	 *            the update to set
	 */
	public void setUpdate(boolean update) {
		this.update = update;
	}

	/**
	 * @return the inter
	 */
	public boolean isInter() {
		return inter;
	}

	/**
	 * @param inter
	 *            the inter to set
	 */
	public void setInter(boolean inter) {
		this.inter = inter;
	}

	/**
	 * @return the versionIdentifier
	 */
	public int getVersionIdentifier() {
		return versionIdentifier;
	}

	/**
	 * @param versionIdentifier
	 *            the versionIdentifier to set
	 */
	public void setVersionIdentifier(int versionIdentifier) {
		this.versionIdentifier = versionIdentifier;
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