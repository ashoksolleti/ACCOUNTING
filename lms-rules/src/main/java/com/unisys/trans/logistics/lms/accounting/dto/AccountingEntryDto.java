package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AccountingModes;
import com.unisys.trans.logistics.lms.accounting.dto.constants.AccountingRuleIndicators;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.DocumentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ProvisionalFlownRevenue;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;

public class AccountingEntryDto extends PersistenceObjectDto {

	private static final long serialVersionUID = 1L;

	private Long accAwbOid;
	private Long oId = 0l;
	/*private String journalId;
	private String airWaybillNumber;
	private String invoiceNumber;
	private String flightNumber;
	private String accountingMonth;
	private Integer financialYear;
	private String triggeringPoint;*/
	
	/*private String accountingRemarks;
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
	private Date flightDate;*/
	private String accountingMode;
	//private AccountingModes modeOfAccounting;
	private ActionType actionType;
	private String accountNumber;
	private String accountHeader;
	private boolean error;
	private String manualAccountingReferenceId;
	private Set<AccountingEntryJournalDto> accountingEntryJournalDto = new HashSet<AccountingEntryJournalDto>();
	private AccountingEntryJournalDto accountingJournalDto = new AccountingEntryJournalDto();
	private List<AccountingEntryJournalDto> accountingEntryJournalDtos = new ArrayList<AccountingEntryJournalDto>();
	private boolean create = false;
	private boolean delete = false;
	private boolean update = false;
	private int versionIdentifier = 0;
	private boolean inter = false;
	private AirWaybillNumberDto airWaybillNumberDto = new AirWaybillNumberDto();
	//private Date invoiceDate;
	private List<GlAccountCodeDto> glAccountCodeDtoList=new ArrayList<GlAccountCodeDto>();
	//private AccountingRuleIndicators ruleIndicator;
	private boolean generalReportIndicator = true;
	private AccountingAirWaybillDto accAirWayBillDto;
private Date accountingPeriodStartDate;
	private Date accountingPeriodEndDate;
	// added as part of RFC UIS 117
	private Long partRecOid;
	
	/*private String accNameAsString;
	private String accNumberAsString;
	private String costCenterString;
	private String arAccNumberString;*/
	/*private String ruleNameString;
	private String flightDateFormatted;
	private String accountingDateFormatted;*/
	
	public Long getPartRecOid() {
		return partRecOid;
	}

	public void setPartRecOid(Long partRecOid) {
		this.partRecOid = partRecOid;
	}

	//new fields for Accounting Entry
	private Date accountingDate;
	private String accountingDateFormatted;
	private String accountingMonth;
	private String accountingRemarks;
	private String airWaybillNumber;
	private String amountType;
	private String arAccNumberString;
	private String apAccNumberString;
	public String getApAccNumberString() {
		if(apAccNumberString!=null && !apAccNumberString.isEmpty())
		{
			apAccNumberString=apAccNumberString.toUpperCase();
		}
		return apAccNumberString;
	}

	public void setApAccNumberString(String apAccNumberString) {
		this.apAccNumberString = apAccNumberString;
	}

	private String arFileName;
	private String arPostedIndicator;
	private String costCenterString;
	private Date creationDate;
	private String creationDateFormatted;
	private String creditAmtHostCureency;
	private String creditAmtSourceCureency;
	private String dcmReferenceNumber;
	private String debitAmtHostCurrency;
	private String debitAmtSourceCurrency;
	private Integer financialYear;
    private BigDecimal financialYearFormatted;
    private Date flightDate;
    private String flightDateFormatted;
    private String flightNumber;
    private String flightSegmentOrigin;
    private String flightSegmentDestination;
    private String glFileName;
    private String glPostedIndicator;
    private String sapFileName;
    private String sapPostedIndicator;
   

	private String invoiceNumber;
    private AccountingModes modeOfAccounting;
    private String modeOfAccountingString;
    private String provisionalFlownRevenue;
    private String rejectionMemoNumber;
    private Boolean reversalIndicator;
    private AccountingRuleIndicators ruleIndicator;
    private String ruleIndicatorString;
    private String ruleNameString;
    private String triggeringPoint;
    private String journalId;
    private String accNumberAsString;//GL Account Number
    private String accNameAsString;//GL Account Header
    
    
    private Date invoiceDate;
    private String invoiceDateFormatted;
    private DocumentType documentType;
    	
    //Getters and Setters for new Accounting Entry fields
    
	public BigDecimal getFinancialYearFormatted() {
		if(this.getFinancialYear() != null)
		{
			financialYearFormatted = new BigDecimal(this.getFinancialYear());
		}
		return financialYearFormatted;
	}

	public void setFinancialYearFormatted(BigDecimal financialYearFormatted) {
		this.financialYearFormatted = financialYearFormatted;
	}

	public String getModeOfAccountingString() {
		return modeOfAccountingString;
	}

	public void setModeOfAccountingString(String modeOfAccountingString) {
		this.modeOfAccountingString = modeOfAccountingString;
	}

	public String getInvoiceDateFormatted() {
		String value="";
    	if(this.getInvoiceDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getInvoiceDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		invoiceDateFormatted=value.toUpperCase();
    	}
		return invoiceDateFormatted;
	}

	public void setInvoiceDateFormatted(String invoiceDateFormatted) {
		this.invoiceDateFormatted = invoiceDateFormatted;
	}

	public String getRuleIndicatorString() {
		if(this.getRuleIndicator() != null)
		{
			ruleIndicatorString = this.getRuleIndicator().getType();
		}
		return ruleIndicatorString;
	}

	public void setRuleIndicatorString(String ruleIndicatorString) {
		this.ruleIndicatorString = ruleIndicatorString;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getCreationDateFormatted() {
		String value="";
    	if(this.getCreationDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getCreationDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		creationDateFormatted=value.toUpperCase();
    	}
		return creationDateFormatted;
	}

	public void setCreationDateFormatted(String creationDateFormatted) {
		this.creationDateFormatted = creationDateFormatted;
	}
	
	public String getAmountType() {
		return amountType;
	}

	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}
	
	//end of new Getters and Setters
	
	public AccountingAirWaybillDto getAccAirWayBillDto() {
		return accAirWayBillDto;
	}

	public void setAccAirWayBillDto(AccountingAirWaybillDto accAirWayBillDto) {
		this.accAirWayBillDto = accAirWayBillDto;
	}

	public Date getAccountingPeriodStartDate() {
		return accountingPeriodStartDate;
	}

	public void setAccountingPeriodStartDate(Date accountingPeriodStartDate) {
		this.accountingPeriodStartDate = accountingPeriodStartDate;
	}

	public Date getAccountingPeriodEndDate() {
		return accountingPeriodEndDate;
	}

	public void setAccountingPeriodEndDate(Date accountingPeriodEndDate) {
		this.accountingPeriodEndDate = accountingPeriodEndDate;
	}

	public boolean isGeneralReportIndicator() {
		return generalReportIndicator;
	}

	public void setGeneralReportIndicator(boolean generalReportIndicator) {
		this.generalReportIndicator = generalReportIndicator;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	private BigDecimal totalDebitAmountHostCurrency;
    public BigDecimal getTotalDebitAmountHostCurrency() {
        return totalDebitAmountHostCurrency;
    }

    public void setTotalDebitAmountHostCurrency(BigDecimal totalDebitAmountHostCurrency) {
        this.totalDebitAmountHostCurrency = totalDebitAmountHostCurrency;
    }

    public BigDecimal getTotalCreditAmountHostCurrency() {
        return totalCreditAmountHostCurrency;
    }

    public void setTotalCreditAmountHostCurrency(BigDecimal totalCreditAmountHostCurrency) {
        this.totalCreditAmountHostCurrency = totalCreditAmountHostCurrency;
    }

    public BigDecimal getTotalDebitAmountSourceCurrency() {
        return totalDebitAmountSourceCurrency;
    }

    public void setTotalDebitAmountSourceCurrency(BigDecimal totalDebitAmountSourceCurrency) {
        this.totalDebitAmountSourceCurrency = totalDebitAmountSourceCurrency;
    }

    public BigDecimal getTotalCreditAmountSourceCurrency() {
        return totalCreditAmountSourceCurrency;
    }

    public void setTotalCreditAmountSourceCurrency(BigDecimal totalCreditAmountSourceCurrency) {
        this.totalCreditAmountSourceCurrency = totalCreditAmountSourceCurrency;
    }

    private BigDecimal  totalCreditAmountHostCurrency;
    private BigDecimal  totalDebitAmountSourceCurrency;
    private BigDecimal  totalCreditAmountSourceCurrency;

	private String specificAirline;
	
	
	
	/**
	 * @return the airWaybillNumberDto
	 */
	public AirWaybillNumberDto getAirWaybillNumberDto() {
		if(airWaybillNumber!=null && airWaybillNumber.length()>11){
			String a,b,c;
			a=airWaybillNumber.substring(0, 3);
			b=airWaybillNumber.substring(4,12);
			//LMSC-8253
			if(b.length()==8) {
				c=airWaybillNumber.substring(12);
				airWaybillNumberDto.setModOverrideIndicator(c);
			}
			airWaybillNumberDto.setAirlineCodeNbr(a);
			airWaybillNumberDto.setShipmentReference(b);
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
		if(airWaybillNumberDto != null){
			if(airWaybillNumberDto.getAirlineCodeNbr()!=null && airWaybillNumberDto.getShipmentReference()!=null){
				airWaybillNumber = airWaybillNumberDto.getAirlineCodeNbr()+"-"+airWaybillNumberDto.getShipmentReference();
			}
			//LMSC-8253
			if(airWaybillNumberDto.getModOverrideIndicator()!=null) {
				airWaybillNumber = airWaybillNumber+airWaybillNumberDto.getModOverrideIndicator();
			}
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
		if(flightNumber!=null && !flightNumber.isEmpty())
		{
			flightNumber=flightNumber.toUpperCase();
		}
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



	

	public String getProvisionalFlownRevenue() {
		return provisionalFlownRevenue;
	}

	public void setProvisionalFlownRevenue(String provisionalFlownRevenue) {
		this.provisionalFlownRevenue = provisionalFlownRevenue;
	}

	/**
	 * @return the flightSegmentOrigin
	 */
	public String getFlightSegmentOrigin() {
		if(flightSegmentOrigin!=null && !flightSegmentOrigin.isEmpty())
		{
			flightSegmentOrigin=flightSegmentOrigin.toUpperCase();
		}
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
		if(flightSegmentDestination!=null && !flightSegmentDestination.isEmpty())
		{
			flightSegmentDestination=flightSegmentDestination.toUpperCase();
		}
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
	public AccountingModes getModeOfAccounting() {
		return modeOfAccounting;
	}

	/**
	 * @param modeOfAccounting
	 *            the modeOfAccounting to set
	 */
	public void setModeOfAccounting(AccountingModes modeOfAccounting) {
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

	public List<AccountingEntryJournalDto> getAccountingEntryJournalDtos() {
		return accountingEntryJournalDtos;
	}

	public void setAccountingEntryJournalDtos(
			List<AccountingEntryJournalDto> accountingEntryJournalDtos) {
		this.accountingEntryJournalDtos = accountingEntryJournalDtos;
	}

	public String getAccountingMode() {
		return accountingMode;
	}

	public void setAccountingMode(String accountingMode) {
		this.accountingMode = accountingMode;
	}

	/**
	 * @return the glAccountCodeDtoList
	 */
	public List<GlAccountCodeDto> getGlAccountCodeDtoList() {
		return glAccountCodeDtoList;
	}

	/**
	 * @param glAccountCodeDtoList the glAccountCodeDtoList to set
	 */
	public void setGlAccountCodeDtoList(List<GlAccountCodeDto> glAccountCodeDtoList) {
		this.glAccountCodeDtoList = glAccountCodeDtoList;
	}
	
	/**
	 * @return the ruleIndicator
	 */
	public AccountingRuleIndicators getRuleIndicator() {
		return ruleIndicator;
	}

	/**
	 * @param ruleIndicator the ruleIndicator to set
	 */
	public void setRuleIndicator(AccountingRuleIndicators ruleIndicator) {
		this.ruleIndicator = ruleIndicator;
	}

	public Long getAccAwbOid() {
		return accAwbOid;
	}

	public void setAccAwbOid(Long accAwbOid) {
		this.accAwbOid = accAwbOid;
	}

	public String getAccNameAsString() {
		return accNameAsString;
	}

	public void setAccNameAsString(String accNameAsString) {
		this.accNameAsString = accNameAsString;
	}

	public String getAccNumberAsString() {
		return accNumberAsString;
	}

	public void setAccNumberAsString(String accNumberAsString) {
		this.accNumberAsString = accNumberAsString;
	}

	public String getCostCenterString() {
		return costCenterString;
	}

	public void setCostCenterString(String costCenterString) {
		this.costCenterString = costCenterString;
	}

	public String getArAccNumberString() {
		if(arAccNumberString!=null && !arAccNumberString.isEmpty())
		{
			arAccNumberString=arAccNumberString.toUpperCase();
		}
		return arAccNumberString;
	}

	public void setArAccNumberString(String arAccNumberString) {
		this.arAccNumberString = arAccNumberString;
	}

	public String getDebitAmtHostCurrency() {
		return debitAmtHostCurrency;
	}

	public void setDebitAmtHostCurrency(String debitAmtHostCurrency) {
		this.debitAmtHostCurrency = debitAmtHostCurrency;
	}

	public String getCreditAmtHostCureency() {
		return creditAmtHostCureency;
	}

	public void setCreditAmtHostCureency(String creditAmtHostCureency) {
		this.creditAmtHostCureency = creditAmtHostCureency;
	}

	public String getDebitAmtSourceCurrency() {
		return debitAmtSourceCurrency;
	}

	public void setDebitAmtSourceCurrency(String debitAmtSourceCurrency) {
		this.debitAmtSourceCurrency = debitAmtSourceCurrency;
	}

	public String getCreditAmtSourceCureency() {
		return creditAmtSourceCureency;
	}

	public void setCreditAmtSourceCureency(String creditAmtSourceCureency) {
		this.creditAmtSourceCureency = creditAmtSourceCureency;
	}

	public String getRuleNameString() {
		return ruleNameString;
	}

	public void setRuleNameString(String ruleNameString) {
		this.ruleNameString = ruleNameString;
	}
	
	public String getAccountingDateFormatted() {
		String value = "";

		if (this.getAccountingDate() != null) {

			value = DateUtility.convertToGMTDate(this.getAccountingDate(), "ddMMMyyyy");

		}
		if (value != null) {
			value = value.toUpperCase();
		}
		accountingDateFormatted = value;
		return accountingDateFormatted;
	}

	public void setAccountingDateFormatted(String accountingDateFormatted) {
		this.accountingDateFormatted = accountingDateFormatted;
	}

	public String getFlightDateFormatted() {
		String value = "";

		if (this.getFlightDate() != null) {

			value = DateUtility.convertToGMTDate(this.getFlightDate(), "ddMMMyyyy");

		}
		if (value != null) {
			value = value.toUpperCase();
		}
		flightDateFormatted = value;
		return flightDateFormatted;
	}

	public void setFlightDateFormatted(String flightDateFormatted) {
		this.flightDateFormatted = flightDateFormatted;
	}
	
	
	 public String getSapFileName() {
			return sapFileName;
		}

		public void setSapFileName(String sapFileName) {
			this.sapFileName = sapFileName;
		}

		public String getSapPostedIndicator() {
			return sapPostedIndicator;
		}

		public void setSapPostedIndicator(String sapPostedIndicator) {
			this.sapPostedIndicator = sapPostedIndicator;
		}


	public DocumentType getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
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