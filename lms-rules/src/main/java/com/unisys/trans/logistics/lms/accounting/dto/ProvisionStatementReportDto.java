package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AccountingModes;
import com.unisys.trans.logistics.lms.accounting.dto.constants.AccountingRuleIndicators;
import com.unisys.trans.logistics.lms.accounting.dto.constants.AuditStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ExportPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.FWBType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.GenIdType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.HurdleRateReasonType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ImportPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InternationalAWBType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PadType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RateGenerationType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ShipmentStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.SpecialPurgeType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.UnitType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.VolumeEvaluationMethodType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;















import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class ProvisionStatementReportDto extends PersistenceObjectDto {
	
	
	/**
	 * 
	 */
	//Accounting Entry
	private String airWaybillNumber;
	private String journalId;
	private String flightNumber;
	private String accountingMonth;
	private Integer financialYear;
	private BigDecimal financialYearFormatted;
	private String triggeringPoint;
	private String accountingRemarks;
	private String glPostedIndicator;
	private String arPostedIndicator;
	private String provisionalFlownRevenue;
	private String flightSegmentOrigin;
	private String flightSegmentDestination;
	private String glFileName;
	private String arFileName;
	private Date accountingDate;
	private String accountingDateFormatted;
	private String rejectionMemoNumber;
	private String dcmReferenceNumber;
	private Date flightDate;
	private String flightDateFormatted;
	private AccountingModes modeOfAccounting;
	private String modeOfAccountingString;
	private String accNameAsString;//GL Account Header
	private String accNumberAsString;//GL Account Number
	private String arAccNumberString;
	private Date invoiceDate;
	private String invoiceDateFormatted;
	private String invoiceNumber;
	private String costCenterString;
	private String debitAmt;
	private String creditAmt;
	private String airlineCode;
	private String shipmentReference;
	private String ruleNameString;
	private AccountingRuleIndicators ruleIndicator;
	private String ruleIndicatorString;
	private Date creationDate;
	private String creationDateFormatted;
	
	//AWB Starts here
		//private String awbNumber;
		//private String accountingRemarks;
		private String consigneeRemarks1;
		private String consigneeRemarks2;
		private boolean contractSRAAppliesIndicator;
		private String crossReference1;
		private String crossReference2;
		private String customsValue;
		private String customsStation;
		private FWBType fWBType;
		private String fWBTypeString;
		private String declaredValue;
		private String destinationCarrier;
		private String destinationCurrency;
		private String destinationStation;
		private String discrepancies;
		private Boolean eAWBIndicator;
		private BigDecimal exchangeRate;
		private Date executionDate;
		private String executionDateFormatted;
		private AuditStatusType exportAuditType;
		private String exportAuditTypeString;
		private ExportPaymentType exportPaycode;
		private String exportPaycodeString;
		private String exportReportingStation;
		private Date exportReportingDate;
		private String exportReportingDateFormatted;
		private Date importReportingDate;
		private String importReportingDateFormatted;
		private AuditStatusType importAudit;
		private String importAuditString;
		private ImportPaymentType importPaycode;
		private String importPaycodeString;
		private String importReportingStation;
		private String insuranceValue;
		private String insuranceCode;
		private InternationalAWBType internationalAWB;
		private String internationalAWBString;
		private boolean northAmericanIndicator;
		private Date notifyDate;
		private String notifyDateFormatted;
		private String originCurrency;
		private String originStation;
		private String padType;
		private String padTypeString;
		private boolean paperAWBOverrideInd;
		private Integer priority;
		private String productCode;
		private String shipperRemarks;
		private SpecialPurgeType specialPurge;
		private String specialPurgeString;
		private ShipmentStatusType status;
		private String statusString;
		private Boolean taxIndicator;
		private WeightUOMType unitOfWeight;
		private String unitOfWeightString;
		private Date pricingDate;
		private String pricingDateFormatted;
		//private Date creationDate;
		//private String creationDateFormatted;
		private String accountingStatus;
		
		//AWB->Hostrevenue
		private BigDecimal bookingEventGrossRevenue;
		private BigDecimal bookingEventHostRevenue;
		private BigDecimal bookingEventHurdleAmount;
		private BigDecimal bookingEventHurdleRate;
		private BigDecimal bookingEventTotalRate;
		private BigDecimal bookingEventCostAmount;
		private BigDecimal bookingEventCostRate;
		private BigDecimal bookingEventRevenueRate;
		private String bookingEventProduct;
		private String bookingEventHurdleRateStatus;
		private String bookingEventHurdleRateReasonCodeString;
		private HurdleRateReasonType bookingEventHurdleRateReasonCode;
		
		//Rating Line Entries
		private String classRatingId;
		private String commodityNumber;
		private String contractNumber;
		private boolean deleteIndicator;
		//private BigDecimal grossWeight;
		private Boolean netNetIndicator;
		private BigDecimal rateCharge;
		private RateClassType rateClassType;
		private String rateClassTypeString;
		private RateGenerationType rateGenerationType;
		private String rateGenerationTypeString;
		private String rateNote;
		private String uldType;
		//Rating Ends here
		//AWB -> Total Charges
		private BigDecimal actWeightCharge;
		private BigDecimal valuationCharges;
		private BigDecimal actPrepaidCharge;
		private BigDecimal actCollectCharge;
		private GenIdType codChargeGenIdType;
		private String  codChargeGenIdTypeString;
		private BigDecimal codCharges;
		private String codCurrency;
		private BigDecimal codExchangeRate;
		private BigDecimal dimensionalWeight;
		private BigDecimal faceCollectCharge;
		private BigDecimal facePrepaidCharge;
		private BigDecimal faceWeightCharge;
		private BigDecimal pubCollectCharge;
		private BigDecimal pubPrepaidCharge;
		private BigDecimal pubWeightCharge;
		private BigDecimal totalCashOnDeliveryCOD;
		private BigDecimal totalChargeableWeight;
		private BigDecimal totalWeightCharges;
		private UnitType unitType;
		private String unitTypeString;
		private GenIdType valuationChargeGenIdType;
		private String valuationChargeGenIdTypeString;
		private Integer volume;
		private VolumeEvaluationMethodType volumeEvaluationMethod;
		private String volumeEvaluationMethodString;
		private WeightUOMType weightUnit;
		private String weightUnitString;
		//Total charges end here
		
		//AWB->Accounting status
		private boolean invoiceIndicator;
		private boolean postingIndicator;
		private String queueName;
		private String queueOffice;
		private String queueStation;
		private boolean queueStatus;
		private boolean reportIndicator;

	
	
	private static final String EMPTY_STRING = "";
	private static final long serialVersionUID = 1L;
	
	
		
	private String accMonthYear;
	
	
	
	private Date startdate;
	private Date endDate;
	
	private String specificAirline;
	
	
	public String getSpecificAirline() {
		return specificAirline;
	}

	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}

	private Set<AccountingEntryJournalDto> accountingEntryJournalDto = new HashSet<AccountingEntryJournalDto>();
	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		if(flightNumber!=null)
			flightNumber = flightNumber.toUpperCase();
		return flightNumber;
	}

	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * @return the flightDate
	 */
	public Date getFlightDate() {
		return flightDate;
	}

	/**
	 * @param flightDate the flightDate to set
	 */
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	/**
	 * @return the accountHeader
	 */
	
	/**
	 * @return the accountingMonth
	 */
	public String getAccountingMonth() {
		return accountingMonth;
	}

	/**
	 * @param accountingMonth the accountingMonth to set
	 */
	public void setAccountingMonth(String accountingMonth) {
		this.accountingMonth = accountingMonth;
	}

	/**
	 * @return the costCentre
	 */
	
	/**
	 * @param costCentre the costCentre to set
	 */
	

	/**
	 * @return the airWaybillNumber
	 */
	public String getAirWaybillNumber() {
		return airWaybillNumber;
	}

	/**
	 * @param airWaybillNumber the airWaybillNumber to set
	 */
	public void setAirWaybill(String airlinecode,String shipmentRef)
	{
		if(airlinecode!=null && shipmentRef!=null)
		{
		String airwaybill = airlinecode+"-"+shipmentRef;
		this.setAirWaybillNumber(airwaybill);
		}
	}
	
	public void setAirWaybillNumber(String airWaybillNumber) {
		this.airWaybillNumber = airWaybillNumber;
	}

	/**
	 * @return the flightSegmentOrigin
	 */
	public String getFlightSegmentOrigin() {
		if(flightSegmentOrigin!=null)
		{
			flightSegmentOrigin = flightSegmentOrigin.toUpperCase();
		}
		return flightSegmentOrigin;
	}

	/**
	 * @param flightSegmentOrigin the flightSegmentOrigin to set
	 */
	public void setFlightSegmentOrigin(String flightSegmentOrigin) {
		this.flightSegmentOrigin = flightSegmentOrigin;
	}

	/**
	 * @return the flightSegmentDestination
	 */
	public String getFlightSegmentDestination() {
		if(flightSegmentDestination!=null)
		{
			flightSegmentDestination = flightSegmentDestination.toUpperCase();
		}
		return flightSegmentDestination;
	}

	/**
	 * @param flightSegmentDestination the flightSegmentDestination to set
	 */
	public void setFlightSegmentDestination(String flightSegmentDestination) {
		this.flightSegmentDestination = flightSegmentDestination;
	}

	/**
	 * @return the accProvisionalIndicator
	 */
	
	/**
	 * @return the startdate
	 */
	public Date getStartdate() {
		return startdate;
	}

	/**
	 * @param startdate the startdate to set
	 */
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the accountingDate
	 */
	public Date getAccountingDate() {
		return accountingDate;
	}

	/**
	 * @param accountingDate the accountingDate to set
	 */
	public void setAccountingDate(Date accountingDate) {
		this.accountingDate = accountingDate;
	}

	/**
	 * @return the ruleName
	 */
	

	/**
	 * @param ruleName the ruleName to set
	 */
	

	/**
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	/**
	 * @param invoiceNumber the invoiceNumber to set
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getFinancialYear() {
		return financialYear;
	}

	public void setFinancialYear(Integer financialYear) {
		this.financialYear = financialYear;
	}
	
	public BigDecimal getFinancialYearFormatted() {
		if(this.getFinancialYear()!=null)
		{
			financialYearFormatted = new BigDecimal(this.getFinancialYear());
		}
		return financialYearFormatted;
	}

	public void setFinancialYearFormatted(BigDecimal financialYearFormatted) {
		this.financialYearFormatted = financialYearFormatted;
	}

	public Set<AccountingEntryJournalDto> getAccountingEntryJournalDto() {
		return accountingEntryJournalDto;
	}

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
		return arAccNumberString;
	}

	public void setArAccNumberString(String arAccNumberString) {
		this.arAccNumberString = arAccNumberString;
	}

	public String getDebitAmt() {
		return debitAmt;
	}

	public void setDebitAmt(String debitAmt) {
		this.debitAmt = debitAmt;
	}

	public String getCreditAmt() {
		return creditAmt;
	}

	public void setCreditAmt(String creditAmt) {
		this.creditAmt = creditAmt;
	}

	public String getAirlineCode() {
		return airlineCode;
	}

	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	public String getShipmentReference() {
		if(shipmentReference!=null)
		{
			shipmentReference = shipmentReference.toUpperCase();
		}
		return shipmentReference;
	}

	public void setShipmentReference(String shipmentReference) {
		this.shipmentReference = shipmentReference;
	}

	public String getProvisionalFlownRevenue() {
		return provisionalFlownRevenue;
	}

	public void setProvisionalFlownRevenue(String provisionalFlownRevenue) {
		this.provisionalFlownRevenue = provisionalFlownRevenue;
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

	public void setMonthYear(String accountMonthYear)
	{
		if(accountMonthYear!=null)
		{
			this.setAccountingMonth(accountMonthYear.substring(0,3));
			String year = "20"+accountMonthYear.substring(3);
			int financialYear = Integer.parseInt(year);
			this.setFinancialYear(financialYear);
		}
	}

	public String getAccMonthYear() {
		return accMonthYear;
	}

	public void setAccMonthYear(String accMonthYear) {
		this.accMonthYear = accMonthYear;
	}
	
	
	
	public String getJournalId() {
		return journalId;
	}

	public void setJournalId(String journalId) {
		this.journalId = journalId;
	}

	public String getTriggeringPoint() {
		return triggeringPoint;
	}

	public void setTriggeringPoint(String triggeringPoint) {
		this.triggeringPoint = triggeringPoint;
	}

	public String getAccountingRemarks() {
		return accountingRemarks;
	}

	public void setAccountingRemarks(String accountingRemarks) {
		this.accountingRemarks = accountingRemarks;
	}

	public String getGlPostedIndicator() {
		return glPostedIndicator;
	}

	public void setGlPostedIndicator(String glPostedIndicator) {
		this.glPostedIndicator = glPostedIndicator;
	}

	public String getArPostedIndicator() {
		return arPostedIndicator;
	}

	public void setArPostedIndicator(String arPostedIndicator) {
		this.arPostedIndicator = arPostedIndicator;
	}

	public String getGlFileName() {
		return glFileName;
	}

	public void setGlFileName(String glFileName) {
		this.glFileName = glFileName;
	}

	public String getArFileName() {
		return arFileName;
	}

	public void setArFileName(String arFileName) {
		this.arFileName = arFileName;
	}

	public String getRejectionMemoNumber() {
		return rejectionMemoNumber;
	}

	public void setRejectionMemoNumber(String rejectionMemoNumber) {
		this.rejectionMemoNumber = rejectionMemoNumber;
	}

	public String getDcmReferenceNumber() {
		return dcmReferenceNumber;
	}

	public void setDcmReferenceNumber(String dcmReferenceNumber) {
		this.dcmReferenceNumber = dcmReferenceNumber;
	}

	public AccountingModes getModeOfAccounting() {
		return modeOfAccounting;
	}

	public void setModeOfAccounting(AccountingModes modeOfAccounting) {
		this.modeOfAccounting = modeOfAccounting;
	}

	public String getModeOfAccountingString() {
		if(this.getModeOfAccounting() != null)
		{
			modeOfAccountingString = this.getModeOfAccounting().value();
		}
		return modeOfAccountingString;
	}

	public void setModeOfAccountingstring(String modeOfAccountingString) {
		this.modeOfAccountingString = modeOfAccountingString;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
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

	public AccountingRuleIndicators getRuleIndicator() {
		return ruleIndicator;
	}

	public void setRuleIndicator(AccountingRuleIndicators ruleIndicator) {
		this.ruleIndicator = ruleIndicator;
	}

	public String getRuleIndicatorString() {
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
    		value=DateUtility.convertToGMTDate(this.getCreationDate(),FrameworkConstants.DATETIMEFORMAT_DDMMMYYHHMM);
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

	public String getConsigneeRemarks1() {
		return consigneeRemarks1;
	}

	public void setConsigneeRemarks1(String consigneeRemarks1) {
		this.consigneeRemarks1 = consigneeRemarks1;
	}

	public String getConsigneeRemarks2() {
		return consigneeRemarks2;
	}

	public void setConsigneeRemarks2(String consigneeRemarks2) {
		this.consigneeRemarks2 = consigneeRemarks2;
	}

	public boolean isContractSRAAppliesIndicator() {
		return contractSRAAppliesIndicator;
	}

	public void setContractSRAAppliesIndicator(boolean contractSRAAppliesIndicator) {
		this.contractSRAAppliesIndicator = contractSRAAppliesIndicator;
	}

	public String getCrossReference1() {
		return crossReference1;
	}

	public void setCrossReference1(String crossReference1) {
		this.crossReference1 = crossReference1;
	}

	public String getCrossReference2() {
		return crossReference2;
	}

	public void setCrossReference2(String crossReference2) {
		this.crossReference2 = crossReference2;
	}

	public String getCustomsValue() {
		return customsValue;
	}

	public void setCustomsValue(String customsValue) {
		this.customsValue = customsValue;
	}

	public String getCustomsStation() {
		return customsStation;
	}

	public void setCustomsStation(String customsStation) {
		this.customsStation = customsStation;
	}

	public FWBType getfWBType() {
		return fWBType;
	}

	public void setfWBType(FWBType fWBType) {
		this.fWBType = fWBType;
	}

	public String getfWBTypeString() {
		return fWBTypeString;
	}

	public void setfWBTypeString(String fWBTypeString) {
		this.fWBTypeString = fWBTypeString;
	}

	public String getDeclaredValue() {
		return declaredValue;
	}

	public void setDeclaredValue(String declaredValue) {
		this.declaredValue = declaredValue;
	}

	public String getDestinationCarrier() {
		return destinationCarrier;
	}

	public void setDestinationCarrier(String destinationCarrier) {
		this.destinationCarrier = destinationCarrier;
	}

	public String getDestinationCurrency() {
		return destinationCurrency;
	}

	public void setDestinationCurrency(String destinationCurrency) {
		this.destinationCurrency = destinationCurrency;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public String getDiscrepancies() {
		return discrepancies;
	}

	public void setDiscrepancies(String discrepancies) {
		this.discrepancies = discrepancies;
	}

	public Boolean geteAWBIndicator() {
		return eAWBIndicator;
	}

	public void seteAWBIndicator(Boolean eAWBIndicator) {
		this.eAWBIndicator = eAWBIndicator;
	}

	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public Date getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}

	public AuditStatusType getExportAuditType() {
		return exportAuditType;
	}

	public void setExportAuditType(AuditStatusType exportAuditType) {
		this.exportAuditType = exportAuditType;
	}

	public ExportPaymentType getExportPaycode() {
		return exportPaycode;
	}

	public void setExportPaycode(ExportPaymentType exportPaycode) {
		this.exportPaycode = exportPaycode;
	}

	public String getExportReportingStation() {
		return exportReportingStation;
	}

	public void setExportReportingStation(String exportReportingStation) {
		this.exportReportingStation = exportReportingStation;
	}

	public Date getExportReportingDate() {
		return exportReportingDate;
	}

	public void setExportReportingDate(Date exportReportingDate) {
		this.exportReportingDate = exportReportingDate;
	}

	public String getExportReportingDateFormatted() {
		return exportReportingDateFormatted;
	}

	public void setExportReportingDateFormatted(String exportReportingDateFormatted) {
		this.exportReportingDateFormatted = exportReportingDateFormatted;
	}

	public Date getImportReportingDate() {
		return importReportingDate;
	}

	public void setImportReportingDate(Date importReportingDate) {
		this.importReportingDate = importReportingDate;
	}

	public String getImportReportingDateFormatted() {
		return importReportingDateFormatted;
	}

	public void setImportReportingDateFormatted(String importReportingDateFormatted) {
		this.importReportingDateFormatted = importReportingDateFormatted;
	}

	public AuditStatusType getImportAudit() {
		return importAudit;
	}

	public void setImportAudit(AuditStatusType importAudit) {
		this.importAudit = importAudit;
	}

	public ImportPaymentType getImportPaycode() {
		return importPaycode;
	}

	public void setImportPaycode(ImportPaymentType importPaycode) {
		this.importPaycode = importPaycode;
	}

	public String getImportReportingStation() {
		return importReportingStation;
	}

	public void setImportReportingStation(String importReportingStation) {
		this.importReportingStation = importReportingStation;
	}

	public String getInsuranceValue() {
		return insuranceValue;
	}

	public void setInsuranceValue(String insuranceValue) {
		this.insuranceValue = insuranceValue;
	}

	public String getInsuranceCode() {
		return insuranceCode;
	}

	public void setInsuranceCode(String insuranceCode) {
		this.insuranceCode = insuranceCode;
	}

	public InternationalAWBType getInternationalAWB() {
		return internationalAWB;
	}

	public void setInternationalAWB(InternationalAWBType internationalAWB) {
		this.internationalAWB = internationalAWB;
	}

	public boolean isNorthAmericanIndicator() {
		return northAmericanIndicator;
	}

	public void setNorthAmericanIndicator(boolean northAmericanIndicator) {
		this.northAmericanIndicator = northAmericanIndicator;
	}

	public Date getNotifyDate() {
		return notifyDate;
	}

	public void setNotifyDate(Date notifyDate) {
		this.notifyDate = notifyDate;
	}

	public String getNotifyDateFormatted() {
		return notifyDateFormatted;
	}

	public void setNotifyDateFormatted(String notifyDateFormatted) {
		this.notifyDateFormatted = notifyDateFormatted;
	}

	public String getOriginCurrency() {
		return originCurrency;
	}

	public void setOriginCurrency(String originCurrency) {
		this.originCurrency = originCurrency;
	}

	public String getOriginStation() {
		return originStation;
	}

	public void setOriginStation(String originStation) {
		this.originStation = originStation;
	}

	public String getPadType() {
		return padType;
	}

	public void setPadType(String padType) {
		this.padType = padType;
	}

	public boolean isPaperAWBOverrideInd() {
		return paperAWBOverrideInd;
	}

	public void setPaperAWBOverrideInd(boolean paperAWBOverrideInd) {
		this.paperAWBOverrideInd = paperAWBOverrideInd;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getShipperRemarks() {
		return shipperRemarks;
	}

	public void setShipperRemarks(String shipperRemarks) {
		this.shipperRemarks = shipperRemarks;
	}

	public SpecialPurgeType getSpecialPurge() {
		return specialPurge;
	}

	public void setSpecialPurge(SpecialPurgeType specialPurge) {
		this.specialPurge = specialPurge;
	}

	public ShipmentStatusType getStatus() {
		return status;
	}

	public void setStatus(ShipmentStatusType status) {
		this.status = status;
	}

	public Boolean getTaxIndicator() {
		return taxIndicator;
	}

	public void setTaxIndicator(Boolean taxIndicator) {
		this.taxIndicator = taxIndicator;
	}

	public WeightUOMType getUnitOfWeight() {
		return unitOfWeight;
	}

	public void setUnitOfWeight(WeightUOMType unitOfWeight) {
		this.unitOfWeight = unitOfWeight;
	}

	public Date getPricingDate() {
		return pricingDate;
	}

	public void setPricingDate(Date pricingDate) {
		this.pricingDate = pricingDate;
	}

	public String getPricingDateFormatted() {
		return pricingDateFormatted;
	}

	public void setPricingDateFormatted(String pricingDateFormatted) {
		this.pricingDateFormatted = pricingDateFormatted;
	}

	public String getAccountingStatus() {
		return accountingStatus;
	}

	public void setAccountingStatus(String accountingStatus) {
		this.accountingStatus = accountingStatus;
	}

	public BigDecimal getBookingEventGrossRevenue() {
		return bookingEventGrossRevenue;
	}

	public void setBookingEventGrossRevenue(BigDecimal bookingEventGrossRevenue) {
		this.bookingEventGrossRevenue = bookingEventGrossRevenue;
	}

	public BigDecimal getBookingEventHostRevenue() {
		return bookingEventHostRevenue;
	}

	public void setBookingEventHostRevenue(BigDecimal bookingEventHostRevenue) {
		this.bookingEventHostRevenue = bookingEventHostRevenue;
	}

	public BigDecimal getBookingEventHurdleAmount() {
		return bookingEventHurdleAmount;
	}

	public void setBookingEventHurdleAmount(BigDecimal bookingEventHurdleAmount) {
		this.bookingEventHurdleAmount = bookingEventHurdleAmount;
	}

	public BigDecimal getBookingEventHurdleRate() {
		return bookingEventHurdleRate;
	}

	public void setBookingEventHurdleRate(BigDecimal bookingEventHurdleRate) {
		this.bookingEventHurdleRate = bookingEventHurdleRate;
	}

	public BigDecimal getBookingEventTotalRate() {
		return bookingEventTotalRate;
	}

	public void setBookingEventTotalRate(BigDecimal bookingEventTotalRate) {
		this.bookingEventTotalRate = bookingEventTotalRate;
	}

	public BigDecimal getBookingEventCostAmount() {
		return bookingEventCostAmount;
	}

	public void setBookingEventCostAmount(BigDecimal bookingEventCostAmount) {
		this.bookingEventCostAmount = bookingEventCostAmount;
	}

	public BigDecimal getBookingEventCostRate() {
		return bookingEventCostRate;
	}

	public void setBookingEventCostRate(BigDecimal bookingEventCostRate) {
		this.bookingEventCostRate = bookingEventCostRate;
	}

	public BigDecimal getBookingEventRevenueRate() {
		return bookingEventRevenueRate;
	}

	public void setBookingEventRevenueRate(BigDecimal bookingEventRevenueRate) {
		this.bookingEventRevenueRate = bookingEventRevenueRate;
	}

	public String getBookingEventProduct() {
		return bookingEventProduct;
	}

	public void setBookingEventProduct(String bookingEventProduct) {
		this.bookingEventProduct = bookingEventProduct;
	}

	public String getBookingEventHurdleRateStatus() {
		return bookingEventHurdleRateStatus;
	}

	public void setBookingEventHurdleRateStatus(String bookingEventHurdleRateStatus) {
		this.bookingEventHurdleRateStatus = bookingEventHurdleRateStatus;
	}

	public String getBookingEventHurdleRateReasonCodeString() {
		return bookingEventHurdleRateReasonCodeString;
	}

	public void setBookingEventHurdleRateReasonCodeString(
			String bookingEventHurdleRateReasonCodeString) {
		this.bookingEventHurdleRateReasonCodeString = bookingEventHurdleRateReasonCodeString;
	}

	public HurdleRateReasonType getBookingEventHurdleRateReasonCode() {
		return bookingEventHurdleRateReasonCode;
	}

	public void setBookingEventHurdleRateReasonCode(
			HurdleRateReasonType bookingEventHurdleRateReasonCode) {
		this.bookingEventHurdleRateReasonCode = bookingEventHurdleRateReasonCode;
	}

	public String getClassRatingId() {
		return classRatingId;
	}

	public void setClassRatingId(String classRatingId) {
		this.classRatingId = classRatingId;
	}

	public String getCommodityNumber() {
		return commodityNumber;
	}

	public void setCommodityNumber(String commodityNumber) {
		this.commodityNumber = commodityNumber;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public boolean isDeleteIndicator() {
		return deleteIndicator;
	}

	public void setDeleteIndicator(boolean deleteIndicator) {
		this.deleteIndicator = deleteIndicator;
	}

	public Boolean getNetNetIndicator() {
		return netNetIndicator;
	}

	public void setNetNetIndicator(Boolean netNetIndicator) {
		this.netNetIndicator = netNetIndicator;
	}

	public BigDecimal getRateCharge() {
		return rateCharge;
	}

	public void setRateCharge(BigDecimal rateCharge) {
		this.rateCharge = rateCharge;
	}

	public RateClassType getRateClassType() {
		return rateClassType;
	}

	public void setRateClassType(RateClassType rateClassType) {
		this.rateClassType = rateClassType;
	}

	public RateGenerationType getRateGenerationType() {
		return rateGenerationType;
	}

	public void setRateGenerationType(RateGenerationType rateGenerationType) {
		this.rateGenerationType = rateGenerationType;
	}

	public String getRateNote() {
		return rateNote;
	}

	public void setRateNote(String rateNote) {
		this.rateNote = rateNote;
	}

	public String getUldType() {
		return uldType;
	}

	public void setUldType(String uldType) {
		this.uldType = uldType;
	}

	public BigDecimal getActWeightCharge() {
		return actWeightCharge;
	}

	public void setActWeightCharge(BigDecimal actWeightCharge) {
		this.actWeightCharge = actWeightCharge;
	}

	public BigDecimal getValuationCharges() {
		return valuationCharges;
	}

	public void setValuationCharges(BigDecimal valuationCharges) {
		this.valuationCharges = valuationCharges;
	}

	public BigDecimal getActPrepaidCharge() {
		return actPrepaidCharge;
	}

	public void setActPrepaidCharge(BigDecimal actPrepaidCharge) {
		this.actPrepaidCharge = actPrepaidCharge;
	}

	public BigDecimal getActCollectCharge() {
		return actCollectCharge;
	}

	public void setActCollectCharge(BigDecimal actCollectCharge) {
		this.actCollectCharge = actCollectCharge;
	}

	public GenIdType getCodChargeGenIdType() {
		return codChargeGenIdType;
	}

	public void setCodChargeGenIdType(GenIdType codChargeGenIdType) {
		this.codChargeGenIdType = codChargeGenIdType;
	}

	public BigDecimal getCodCharges() {
		return codCharges;
	}

	public void setCodCharges(BigDecimal codCharges) {
		this.codCharges = codCharges;
	}

	public String getCodCurrency() {
		return codCurrency;
	}

	public void setCodCurrency(String codCurrency) {
		this.codCurrency = codCurrency;
	}

	public BigDecimal getCodExchangeRate() {
		return codExchangeRate;
	}

	public void setCodExchangeRate(BigDecimal codExchangeRate) {
		this.codExchangeRate = codExchangeRate;
	}

	public BigDecimal getDimensionalWeight() {
		return dimensionalWeight;
	}

	public void setDimensionalWeight(BigDecimal dimensionalWeight) {
		this.dimensionalWeight = dimensionalWeight;
	}

	public BigDecimal getFaceCollectCharge() {
		return faceCollectCharge;
	}

	public void setFaceCollectCharge(BigDecimal faceCollectCharge) {
		this.faceCollectCharge = faceCollectCharge;
	}

	public BigDecimal getFacePrepaidCharge() {
		return facePrepaidCharge;
	}

	public void setFacePrepaidCharge(BigDecimal facePrepaidCharge) {
		this.facePrepaidCharge = facePrepaidCharge;
	}

	public BigDecimal getFaceWeightCharge() {
		return faceWeightCharge;
	}

	public void setFaceWeightCharge(BigDecimal faceWeightCharge) {
		this.faceWeightCharge = faceWeightCharge;
	}

	public BigDecimal getPubCollectCharge() {
		return pubCollectCharge;
	}

	public void setPubCollectCharge(BigDecimal pubCollectCharge) {
		this.pubCollectCharge = pubCollectCharge;
	}

	public BigDecimal getPubPrepaidCharge() {
		return pubPrepaidCharge;
	}

	public void setPubPrepaidCharge(BigDecimal pubPrepaidCharge) {
		this.pubPrepaidCharge = pubPrepaidCharge;
	}

	public BigDecimal getPubWeightCharge() {
		return pubWeightCharge;
	}

	public void setPubWeightCharge(BigDecimal pubWeightCharge) {
		this.pubWeightCharge = pubWeightCharge;
	}

	public BigDecimal getTotalCashOnDeliveryCOD() {
		return totalCashOnDeliveryCOD;
	}

	public void setTotalCashOnDeliveryCOD(BigDecimal totalCashOnDeliveryCOD) {
		this.totalCashOnDeliveryCOD = totalCashOnDeliveryCOD;
	}

	public BigDecimal getTotalChargeableWeight() {
		return totalChargeableWeight;
	}

	public void setTotalChargeableWeight(BigDecimal totalChargeableWeight) {
		this.totalChargeableWeight = totalChargeableWeight;
	}

	public BigDecimal getTotalWeightCharges() {
		return totalWeightCharges;
	}

	public void setTotalWeightCharges(BigDecimal totalWeightCharges) {
		this.totalWeightCharges = totalWeightCharges;
	}

	public UnitType getUnitType() {
		return unitType;
	}

	public void setUnitType(UnitType unitType) {
		this.unitType = unitType;
	}

	public GenIdType getValuationChargeGenIdType() {
		return valuationChargeGenIdType;
	}

	public void setValuationChargeGenIdType(GenIdType valuationChargeGenIdType) {
		this.valuationChargeGenIdType = valuationChargeGenIdType;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public VolumeEvaluationMethodType getVolumeEvaluationMethod() {
		return volumeEvaluationMethod;
	}

	public void setVolumeEvaluationMethod(
			VolumeEvaluationMethodType volumeEvaluationMethod) {
		this.volumeEvaluationMethod = volumeEvaluationMethod;
	}

	public String getVolumeEvaluationMethodString() {
		return volumeEvaluationMethodString;
	}

	public void setVolumeEvaluationMethodString(String volumeEvaluationMethodString) {
		this.volumeEvaluationMethodString = volumeEvaluationMethodString;
	}

	public WeightUOMType getWeightUnit() {
		return weightUnit;
	}

	public void setWeightUnit(WeightUOMType weightUnit) {
		this.weightUnit = weightUnit;
	}

	public boolean isInvoiceIndicator() {
		return invoiceIndicator;
	}

	public void setInvoiceIndicator(boolean invoiceIndicator) {
		this.invoiceIndicator = invoiceIndicator;
	}

	public boolean isPostingIndicator() {
		return postingIndicator;
	}

	public void setPostingIndicator(boolean postingIndicator) {
		this.postingIndicator = postingIndicator;
	}

	public String getQueueName() {
		return queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

	public String getQueueOffice() {
		return queueOffice;
	}

	public void setQueueOffice(String queueOffice) {
		this.queueOffice = queueOffice;
	}

	public String getQueueStation() {
		return queueStation;
	}

	public void setQueueStation(String queueStation) {
		this.queueStation = queueStation;
	}

	public boolean isQueueStatus() {
		return queueStatus;
	}

	public void setQueueStatus(boolean queueStatus) {
		this.queueStatus = queueStatus;
	}

	public boolean isReportIndicator() {
		return reportIndicator;
	}

	public void setReportIndicator(boolean reportIndicator) {
		this.reportIndicator = reportIndicator;
	}

	public static String getEmptyString() {
		return EMPTY_STRING;
	}

	public String getExecutionDateFormatted() {
		String value="";
    	if(this.getExecutionDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getExecutionDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		executionDateFormatted=value.toUpperCase();
    	}
		return executionDateFormatted;
	}



	public void setExecutionDateFormatted(String executionDateFormatted) {
		this.executionDateFormatted = executionDateFormatted;
	}
	
	public String getExportAuditTypeString() {
		if(this.getExportAuditType() != null)
		{
			exportAuditTypeString = this.getExportAuditType().getAuditStatus();
		}
		return exportAuditTypeString;
	}



	public void setExportAuditTypeString(String exportAuditTypeString) {
		this.exportAuditTypeString = exportAuditTypeString;
	}
	
	public String getExportPaycodeString() {
		if(this.getExportPaycode() != null)
		{
			exportPaycodeString = this.getExportPaycode().getPayCode();
		}
		return exportPaycodeString;
	}



	public void setExportPaycodeString(String exportPaycodeString) {
		this.exportPaycodeString = exportPaycodeString;
	}



	public String getImportAuditString() {
		if(this.getImportAudit() != null)
		{
			importAuditString = this.getImportAudit().getAuditStatus();
		}
		return importAuditString;
	}



	public void setImportAuditString(String importAuditString) {
		this.importAuditString = importAuditString;
	}



	public String getImportPaycodeString() {
		if(this.getImportPaycode() != null)
		{
			importPaycodeString = this.getImportPaycode().getPayCode();
		}
		return importPaycodeString;
	}



	public void setImportPaycodeString(String importPaycodeString) {
		this.importPaycodeString = importPaycodeString;
	}



	public String getInternationalAWBString() {
		if(this.getInternationalAWB() != null)
		{
			internationalAWBString = this.getInternationalAWB().getShipment();
		}
		return internationalAWBString;
	}



	public void setInternationalAWBString(String internationalAWBString) {
		this.internationalAWBString = internationalAWBString;
	}



	public String getPadTypeString() {
		return padType;
	}



	public void setPadTypeString(String padTypeString) {
		this.padTypeString = padTypeString;
	}



	public String getSpecialPurgeString() {
		if(this.getSpecialPurge() != null)
		{
			specialPurgeString = this.getSpecialPurge().getPurge();
		}
		return specialPurgeString;
	}



	public void setSpecialPurgeString(String specialPurgeString) {
		this.specialPurgeString = specialPurgeString;
	}


	
	

	public String getStatusString() {
		if(this.getStatus() != null)
		{
			statusString = this.getStatus().getStatus();
		}
		return statusString;
	}



	public void setStatusString(String statusString) {
		this.statusString = statusString;
	}



	public String getUnitOfWeightString() {
		if(this.getUnitOfWeight() != null)
		{
			unitOfWeightString = this.getUnitOfWeight().getWeightUnit();
		}
		return unitOfWeightString;
	}



	public void setUnitOfWeightString(String unitOfWeightString) {
		this.unitOfWeightString = unitOfWeightString;
	}



	public String getRateClassTypeString() {
		if(this.getRateClassType() != null)
		{
			rateClassTypeString = this.getRateClassType().getRateClassName();
		}
		return rateClassTypeString;
	}



	public void setRateClassTypeString(String rateClassTypeString) {
		this.rateClassTypeString = rateClassTypeString;
	}



	public String getRateGenerationTypeString() {
		if(this.getRateGenerationType() != null)
		{
			rateGenerationTypeString = this.getRateGenerationType().getRateGenType();
		}
		return rateGenerationTypeString;
	}



	public void setRateGenerationTypeString(String rateGenerationTypeString) {
		this.rateGenerationTypeString = rateGenerationTypeString;
	}



	public String getCodChargeGenIdTypeString() {
		if(this.getCodChargeGenIdType() != null)
		{
			codChargeGenIdTypeString = this.getCodChargeGenIdType().getStatus();
		}
		return codChargeGenIdTypeString;
	}



	public void setCodChargeGenIdTypeString(String codChargeGenIdTypeString) {
		this.codChargeGenIdTypeString = codChargeGenIdTypeString;
	}



	public String getUnitTypeString() {
		if(this.getUnitType() != null)
		{
			unitTypeString = this.getUnitType().getUnit();
		}
		return unitTypeString;
	}



	public void setUnitTypeString(String unitTypeString) {
		this.unitTypeString = unitTypeString;
	}



	public String getValuationChargeGenIdTypeString() {
		if(this.getValuationChargeGenIdType() != null)
		{
			valuationChargeGenIdTypeString = this.getValuationChargeGenIdType().getStatus();
		}
		return valuationChargeGenIdTypeString;
	}



	public void setValuationChargeGenIdTypeString(
			String valuationChargeGenIdTypeString) {
		this.valuationChargeGenIdTypeString = valuationChargeGenIdTypeString;
	}



	public String getWeightUnitString() {
		if(this.getWeightUnit() != null)
		{
			weightUnitString = this.getWeightUnit().getWeightUnit();
		}
		return weightUnitString;
	}



	public void setWeightUnitString(String weightUnitString) {
		this.weightUnitString = weightUnitString;
	}
	
	public String toString() {
        // SuppressOn:MagicNumber
        final StringBuffer csvString = new StringBuffer();
        if(this.getFlightNumber() != null)
        {
        	csvString.append(this.prefixSuffixByQuotes(this.getFlightNumber()));
        }
        else
        	csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        
        if(this.getFlightDate() != null)
		{
			csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getFlightDate())));
		}
		else
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        
        if(this.getFlightSegmentOrigin() != null)
        {
        	csvString.append(this.prefixSuffixByQuotes(this.getFlightSegmentOrigin()));
        }
        else
        	csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        
        if(this.getFlightSegmentDestination() != null)
        {
        	csvString.append(this.prefixSuffixByQuotes(this.getFlightSegmentDestination()));
        }
        else
        	csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        
		if(this.getAirlineCode() != null && this.getShipmentReference() != null)
		{
			String AWBNumber = this.getAirlineCode()+"-"+this.getShipmentReference();
			csvString.append(this.prefixSuffixByQuotes(AWBNumber));
		}
		else
			 csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				
		if(this.getStartdate() != null)
		{
			csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getStartdate())));
		}
		else
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		
		if(this.getEndDate() != null)
		{
			csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getEndDate())));
		}
		else
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		
		if(this.getProvisionalFlownRevenue() != null)
		{
			csvString.append(this.prefixSuffixByQuotes(this.getProvisionalFlownRevenue()));
		}
		else
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		
		if(this.getAccMonthYear() != null)
		{
			csvString.append(this.prefixSuffixByQuotes(this.getAccMonthYear()));
		}
		else
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			
		return csvString.toString();
	
	}
	
	 private String prefixSuffixByQuotes(final String pString) {
	        final String aQUOTATION = "\"";
	        final String aCOMMA = ",";

	        final StringBuffer aModifiedString = new StringBuffer();
	        aModifiedString.append(aQUOTATION);
	        aModifiedString.append(pString);
	        aModifiedString.append(aQUOTATION);
	        aModifiedString.append(aCOMMA);

	        return aModifiedString.toString();
	    }
}
