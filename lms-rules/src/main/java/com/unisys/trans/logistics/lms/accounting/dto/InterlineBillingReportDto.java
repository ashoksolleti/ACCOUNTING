package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AdjustmentSourceType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.AuditStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ClearingHouseType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ExportPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.FWBType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.GenIdType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.HurdleRateReasonType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ImportPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InternationalAWBType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InvoiceStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardInvoiceStatus;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardQueueType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PadType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PaymentStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ProrationType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RateGenerationType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ReceivableStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RejectionMemoStageType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RejectionMemoStatus;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RevenueIndicatorType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ShipmentStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.SpecialPurgeType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.UnitType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.VolumeEvaluationMethodType;
import com.unisys.trans.logistics.lms.framework.constants.CRAParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.constants.SettlementMethodType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

public  class InterlineBillingReportDto extends PersistenceObjectDto implements Comparable<InterlineBillingReportDto>{

	private static final long serialVersionUID = 1L;

	private Long oId;
	
	private static final String EMPTY_STRING = "";
	
	 private String carrierReceivableOrPayable;
		
     private Date billingStartDate;

     private Date billingEndDate;
     
     private String clearingHouseString; 
     
     private SettlementMethodType clearingHouse;
     
     private String invoiceNumber;

     private Date invoiceDate;
     
     private String invoiceDateFormatted;
     
     private String statusType;
		
	 private ReceivableStatusType statusTypeReceivable;
	 
	 private PaymentStatusType statusTypePayable;
	 
    private String carrierCode;
    
    private String prorationTypeString;
	
	private ProrationType prorationType;

	private String prorationIdentifier;

	private String iscPercentage;
	
     private String amount;
	
	private String receivablePayableIndicator;

	private boolean activeIndicator;
	
	private String activeIndicatorValue;

	private String currencyCode;
	
	//private String awbNumber;
	
	private String carrierNumber;

	private String carrierName;
	
	private String carrierCity;
	
	private String carrierState;
	
	private String carrierPostalCode;
	
	private String carrierCountry;
	
	private String carrierPhoneNumber;
	
	private String carrierFax;
	
    private String interlineOrigin;
	
	private String interlineDestination;
	
	private BigDecimal vat;
	
	private String freightCharge;
	
    private String valuationCharge;
	
    private String totalOtherCharge;
	
	private String iscAmount;
	
	private String iscPercent;
	
	private String otherChargeDueAgent;
	
	private String otherChargeDueCarrier;
	
	private String netBillable;
	private String accountingStatus;
	
	//Fields already declared for Accounting AWB object
	
	/*private String productCode;
	private Integer priority;
	private ExportPaymentType exportPaycode;
	private Date creationDate;
	private String creationDateFormatted;
	//private String customsStation;
	private String declaredValue;
	//private String customsValue;
	private String insuranceValue;
	private String insuranceCode;
	private String originCurrency;
	private String destinationCurrency;
	private WeightUOMType unitOfWeight;
	private Date pricingDate;
	private String pricingDateFormatted;
	private BigDecimal dimensionalWeight;
	private Integer volume;
	private VolumeEvaluationMethodType volumeEvaluationMethod;
	private String volumeEvaluationMethodString;
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
	private HurdleRateReasonType bookingEventHurdleRateReasonCode;
	private String bookingEventHurdleRateReasonCodeString;
	private BigDecimal actWeightCharge;
	private BigDecimal valuationCharges;
	private BigDecimal actPrepaidCharge;
	private BigDecimal actCollectCharge;
	private BigDecimal codCharges;
	

	 private String destinationStation;
	 private Date executionDate;
	 private String executionDateFormatted;
	 private String originStation;*/
	 
	//AWB Starts here
		private String awbNumber;
		private String accountingRemarks;
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
		private Date creationDate;
		private String creationDateFormatted;
		
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
		private BigDecimal grossWeight;
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
		private String codChargeGenIdTypeString;
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
		private BigDecimal volume;
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
		private String queueStatus;
		private boolean reportIndicator;

		//AWB <- AWB Revenue
		private BigDecimal airWaybillEventGrossRevenue;
		private BigDecimal airWaybillEventHostRevenue;
		private BigDecimal airwaybillNetAmount;
		private BigDecimal airwaybillOutstandingAmount;
		private BigDecimal hostNetYield;
		private BigDecimal hostNetRevenue;
		private BigDecimal totalGrossWeight;
		
		
		//Carrier Payables
		private String adjustmentComment;
		private String adjustmentNoteNumber;
		private AdjustmentSourceType adjustmentSourceType;
		private String adjustmentSourceTypeString;
		private BigDecimal amountToBeBilled;
		private String airWaybillCurrencyCode;
		private BigDecimal billingAmountToBeBilled;
		private String billingCurrencyCode;
		private String billingExchangeRate;
		//private String carrierCode;
		//private String segmentDestination;
		private String destination;
		private BigDecimal hostAmountToBeBilled;
		private String hostCurrencyCode;
		private String hostExchangeRate;
		//private Date invoiceDate;
		//private String invoiceNumber;
		private String invoiceRemarks;
		private String prorationCurrency;
		private BigDecimal interlineServiceCommissionAmount;
		private BigDecimal interlineServiceCommissionPercentage;
		private BigDecimal interlineServiceProCurCommissionAmount;
		private String origin;
		private String partShipmentIndicator;
		private String paymentCurrencyCode;
		private String prorateIdentifier;
		//private ProrationType prorationType;
		//private String prorationTypeString;
		private PaymentStatusType payStatus;
		private String payStatusString;
		private String reasonText;
		private RevenueIndicatorType revenueIndicatorType;
		private String revenueIndicatorTypeString;
		private BigDecimal totalOtherCharges;
		private BigDecimal totalOtherChargesDueCarrier;
		private BigDecimal totalOtherChargesDueAgent;
		private String associatedOffice;
		private String associatedStation;
		private Date createdOn;
		private String createdOnFormatted;
		private String userIdentifier;
		//private BigDecimal valuationCharges;
		private BigDecimal weightCharges;
		private BigDecimal prorationAmountToBeBilled;
		//carrier VAT
		
		
		//Carrier Receivables
		private ReceivableStatusType recStatus;
		private String recStatusString;
		private CRAParticipantAccountType invoiceType;
		private String invoiceTypeString;
		
		//repeating as of Carrier Payables
		/*private String reasonText;
		private String adjustmentNoteNumber;
		private String adjustmentComment;
		private AdjustmentSourceType adjustmentSourceType;
		private RevenueIndicatorType revenueIndicatorType;
		private BigDecimal amountToBeBilled;
		//air waybill currency code
		private BigDecimal billingAmountToBeBilled;
		//private String carrierCode;
		private BigDecimal interlineServiceCommissionAmount;
		private BigDecimal hostAmountToBeBilled;
		private BigDecimal prorationAmountToBeBilled;
		private BigDecimal interlineServiceProCurCommissionAmount;
		private String hostCurrencyCode;
		private String prorationCurrency;
		private BigDecimal interlineServiceCommissionPercentage;
		private String paymentCurrencyCode;
		private String prorateIdentifier;
		//private ProrationType prorationType;
		private String associatedOffice;
		private String associatedStation;
		private Date createdOn;
		private String userIdentifier;
		//private Date invoiceDate;
		//private String invoiceNumber;
		private String invoiceRemarks;
		private BigDecimal weightCharges;
		//private BigDecimal valuationCharges;
		private BigDecimal totalOtherCharges;
		private BigDecimal totalOtherChargesDueCarrier;
		private BigDecimal totalOtherChargesDueAgent;
		private String origin;
		private String destination;
		private String billingCurrencyCode;
		private boolean partShipmentIndicator;
		private String hostExchangeRate;
		private String billingExchangeRate;
		//carrier vat */	 
	 
	 
		String specificAirline;
		
		//Invoice details
		//InvoiceDetails->BillingSchedule
		//private Date invoiceBillingEndDate;
		//private String invoiceBillingEndDateFormatted;
		//private String billingIdentifier;
		private Integer billingPeriod;
		//private String billingScheduleType;
		//private Date invoiceBillingStartDate;
		//private String invoiceBillingStartDateFormatted;
		private String billingYearMonth;
		private ClearingHouseType clearingHouseType;
		private String clearingHouseTypeString;
		private String billingCarrier;
		
		private String billingReportType;
		
		//private String invoiceNumber;
		private InvoiceStatusType invoiceStatus;
		private String invoiceStatusTypeString;
		private String billingCode;
		private String memoNumber;
		private RejectionMemoStageType rejectionMemostage;
		private BigDecimal chargeableWeight;
		private String yourInvoiceNumber;
		private Date originalInvoiceDate;
		private String originalInvoiceDateString;
		private String originalRejectionNumber;
		private String originalMemoNumber;
		
		private String fromStation;
		private String toStation;
		private String billingCurrency;
		private RejectionMemoStatus rejectionMemoStatus;
		private String rejectionMemoStatusType;
		private String queueReason;
		private String remarks;
		private InwardQueueType queueType;
		private String billingAlreadyRec;
		private BigDecimal awbTotalAccepted;
		private BigDecimal awbTotalBilled;
		private BigDecimal awbTotalActual;
		private BigDecimal iscAmountActual;
		private BigDecimal iscAmountBilled;
		private BigDecimal otherChargesActual;
		private BigDecimal otherChargesBilled;
		private BigDecimal valuationChargesActual;
		private BigDecimal valuationChargesBilled;
		private BigDecimal weightChargesActual;
		private BigDecimal weightChargesBilled;
		private BigDecimal vatAmountBilled;
		private BigDecimal amountToBeRejected;
		private String reasonDescription;
		private int billingCount;
		private BigDecimal totalBillingamount;
		private Date carriageDate;
		
		private BigDecimal outwardAwbTotal;

		private BigDecimal outwardIscAmount;

		private BigDecimal outwardWeightCharges;

		private BigDecimal outwardValuationCharges;

		private BigDecimal outwardOtherCharges;
		
		private BigDecimal outwardVatAmount;
		
		private InwardInvoiceStatus awbInvoiceStatus;
		
		private String awbInvoiceStatusString;
		
		private int numberOfRecordsPerPage;
		private int pageNumber;
		private int totalNumberofRecords;
		private boolean download;
		private String host;
		
		//new added columns
		private String memoType;
		private Date memoDate;
		private String memoDateFormatted;
		private BigDecimal billedWeight;
		private WeightUOMType weightIndicator;
		private String settlementYearMonth;
		private String settlementPeriod;
		private String settlementMethod;
		private String aircraftType;
		private BigDecimal vatChargesBilled;
		private Date updateDate;
		private String updateDateFormatted;
		private String carriageDateFormatted;
		private String paymentType;
	//Getters and Setters for new fields

		
	
	   public String getSpecificAirline() {
			return specificAirline;
		}

		public void setSpecificAirline(String specificAirline) {
			this.specificAirline = specificAirline;
		}
	
	
		public String getHost() {
			return host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public int getNumberOfRecordsPerPage() {
			return numberOfRecordsPerPage;
		}

		public void setNumberOfRecordsPerPage(int numberOfRecordsPerPage) {
			this.numberOfRecordsPerPage = numberOfRecordsPerPage;
		}

		public int getPageNumber() {
			return pageNumber;
		}

		public void setPageNumber(int pageNumber) {
			this.pageNumber = pageNumber;
		}

		public int getTotalNumberofRecords() {
			return totalNumberofRecords;
		}

		public void setTotalNumberofRecords(int totalNumberofRecords) {
			this.totalNumberofRecords = totalNumberofRecords;
		}

		public boolean isDownload() {
			return download;
		}

		public void setDownload(boolean download) {
			this.download = download;
		}

		public Date getCarriageDate() {
			return carriageDate;
		}

		public void setCarriageDate(Date carriageDate) {
			this.carriageDate = carriageDate;
		}

	public String getBillingAlreadyRec() {
			return billingAlreadyRec;
		}

		public void setBillingAlreadyRec(String billingAlreadyRec) {
			this.billingAlreadyRec = billingAlreadyRec;
		}

	public BigDecimal getVatAmountBilled() {
			return vatAmountBilled;
		}

		public void setVatAmountBilled(BigDecimal vatAmountBilled) {
			this.vatAmountBilled = vatAmountBilled;
		}

	public BigDecimal getTotalBillingamount() {
			return totalBillingamount;
		}

		public void setTotalBillingamount(BigDecimal totalBillingamount) {
			this.totalBillingamount = totalBillingamount;
		}

	public int getBillingCount() {
			return billingCount;
		}

		public void setBillingCount(int billingCount) {
			this.billingCount = billingCount;
		}

	public String getBillingReportType() {
			return billingReportType;
		}

		public void setBillingReportType(String billingReportType) {
			this.billingReportType = billingReportType;
		}

	public Integer getBillingPeriod() {
			return billingPeriod;
		}

		public void setBillingPeriod(Integer billingPeriod) {
			this.billingPeriod = billingPeriod;
		}

		public String getBillingYearMonth() {
			return billingYearMonth;
		}

		public void setBillingYearMonth(String billingYearMonth) {
			this.billingYearMonth = billingYearMonth;
		}

		public ClearingHouseType getClearingHouseType() {
			return clearingHouseType;
		}

		public void setClearingHouseType(ClearingHouseType clearingHouseType) {
			this.clearingHouseType = clearingHouseType;
		}

		public String getClearingHouseTypeString() {
			if(this.getClearingHouseType() != null)
			{
				clearingHouseTypeString = this.getClearingHouseType().getStringValue();
			}
			return clearingHouseTypeString;
		}

		public void setClearingHouseTypeString(String clearingHouseTypeString) {
			this.clearingHouseTypeString = clearingHouseTypeString;
		}

		public String getBillingCarrier() {
			return billingCarrier;
		}

		public void setBillingCarrier(String billingCarrier) {
			this.billingCarrier = billingCarrier;
		}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAccountingRemarks() {
		return accountingRemarks;
	}

	public void setAccountingRemarks(String accountingRemarks) {
		this.accountingRemarks = accountingRemarks;
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

	public FWBType getfWBType() {
		return fWBType;
	}

	public void setfWBType(FWBType fWBType) {
		this.fWBType = fWBType;
	}

	public String getfWBTypeString() {
		if(this.getfWBType() != null)
		{
			fWBTypeString = this.getfWBType().getValueFWB();		
		}
		return fWBTypeString;
	}

	public void setfWBTypeString(String fWBTypeString) {
		this.fWBTypeString = fWBTypeString;
	}

	public String getDestinationCarrier() {
		return destinationCarrier;
	}

	public void setDestinationCarrier(String destinationCarrier) {
		this.destinationCarrier = destinationCarrier;
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

	public AuditStatusType getExportAuditType() {
		return exportAuditType;
	}

	public void setExportAuditType(AuditStatusType exportAuditType) {
		this.exportAuditType = exportAuditType;
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
		String value="";
    	if(this.getExportReportingDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getExportReportingDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		exportReportingDateFormatted=value.toUpperCase();
    	}
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
		String value="";
    	if(this.getImportReportingDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getImportReportingDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		importReportingDateFormatted=value.toUpperCase();
    	}
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

	public ImportPaymentType getImportPaycode() {
		return importPaycode;
	}

	public void setImportPaycode(ImportPaymentType importPaycode) {
		this.importPaycode = importPaycode;
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

	public String getImportReportingStation() {
		return importReportingStation;
	}

	public void setImportReportingStation(String importReportingStation) {
		this.importReportingStation = importReportingStation;
	}

	public InternationalAWBType getInternationalAWB() {
		return internationalAWB;
	}

	public void setInternationalAWB(InternationalAWBType internationalAWB) {
		this.internationalAWB = internationalAWB;
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
		String value="";
    	if(this.getNotifyDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getNotifyDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		notifyDateFormatted=value.toUpperCase();
    	}
		return notifyDateFormatted;
	}

	public void setNotifyDateFormatted(String notifyDateFormatted) {
		this.notifyDateFormatted = notifyDateFormatted;
	}

	public String getPadType() {
		return padType;
	}

	public void setPadType(String padType) {
		this.padType = padType;
	}

	public String getPadTypeString() {
		return padType;
	}

	public void setPadTypeString(String padTypeString) {
		this.padTypeString = padType;
	}

	public boolean isPaperAWBOverrideInd() {
		return paperAWBOverrideInd;
	}

	public void setPaperAWBOverrideInd(boolean paperAWBOverrideInd) {
		this.paperAWBOverrideInd = paperAWBOverrideInd;
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

	public ShipmentStatusType getStatus() {
		return status;
	}

	public void setStatus(ShipmentStatusType status) {
		this.status = status;
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

	public Boolean getTaxIndicator() {
		return taxIndicator;
	}

	public void setTaxIndicator(Boolean taxIndicator) {
		this.taxIndicator = taxIndicator;
	}

	public String getUnitOfWeightString() {
		if(this.getUnitOfWeight() != null)
		{
			unitOfWeightString = this.getUnitOfWeight().name();
		}
		return unitOfWeightString;
	}

	public void setUnitOfWeightString(String unitOfWeightString) {
		this.unitOfWeightString = unitOfWeightString;
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

	public BigDecimal getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(BigDecimal grossWeight) {
		this.grossWeight = grossWeight;
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

	public RateGenerationType getRateGenerationType() {
		return rateGenerationType;
	}

	public void setRateGenerationType(RateGenerationType rateGenerationType) {
		this.rateGenerationType = rateGenerationType;
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

	public GenIdType getCodChargeGenIdType() {
		return codChargeGenIdType;
	}

	public void setCodChargeGenIdType(GenIdType codChargeGenIdType) {
		this.codChargeGenIdType = codChargeGenIdType;
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

	public GenIdType getValuationChargeGenIdType() {
		return valuationChargeGenIdType;
	}

	public void setValuationChargeGenIdType(GenIdType valuationChargeGenIdType) {
		this.valuationChargeGenIdType = valuationChargeGenIdType;
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

	public WeightUOMType getWeightUnit() {
		return weightUnit;
	}

	public void setWeightUnit(WeightUOMType weightUnit) {
		this.weightUnit = weightUnit;
	}

	public String getWeightUnitString() {
		if(this.getWeightIndicator() != null)
		{
			weightUnitString = this.getWeightIndicator().name();
		}
		return weightUnitString;
	}

	public void setWeightUnitString(String weightUnitString) {
		this.weightUnitString = weightUnitString;
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

	public String getQueueStatus() {
		return queueStatus;
	}

	public void setQueueStatus(String queueStatus) {
		this.queueStatus = queueStatus;
	}

	public boolean isReportIndicator() {
		return reportIndicator;
	}

	public void setReportIndicator(boolean reportIndicator) {
		this.reportIndicator = reportIndicator;
	}

	public BigDecimal getAirWaybillEventGrossRevenue() {
		return airWaybillEventGrossRevenue;
	}

	public void setAirWaybillEventGrossRevenue(
			BigDecimal airWaybillEventGrossRevenue) {
		this.airWaybillEventGrossRevenue = airWaybillEventGrossRevenue;
	}

	public BigDecimal getAirWaybillEventHostRevenue() {
		return airWaybillEventHostRevenue;
	}

	public void setAirWaybillEventHostRevenue(BigDecimal airWaybillEventHostRevenue) {
		this.airWaybillEventHostRevenue = airWaybillEventHostRevenue;
	}

	public BigDecimal getAirwaybillNetAmount() {
		return airwaybillNetAmount;
	}

	public void setAirwaybillNetAmount(BigDecimal airwaybillNetAmount) {
		this.airwaybillNetAmount = airwaybillNetAmount;
	}

	public BigDecimal getAirwaybillOutstandingAmount() {
		return airwaybillOutstandingAmount;
	}

	public void setAirwaybillOutstandingAmount(
			BigDecimal airwaybillOutstandingAmount) {
		this.airwaybillOutstandingAmount = airwaybillOutstandingAmount;
	}

	public BigDecimal getHostNetYield() {
		return hostNetYield;
	}

	public void setHostNetYield(BigDecimal hostNetYield) {
		this.hostNetYield = hostNetYield;
	}

	public BigDecimal getHostNetRevenue() {
		return hostNetRevenue;
	}

	public void setHostNetRevenue(BigDecimal hostNetRevenue) {
		this.hostNetRevenue = hostNetRevenue;
	}

	public BigDecimal getTotalGrossWeight() {
		return totalGrossWeight;
	}

	public void setTotalGrossWeight(BigDecimal totalGrossWeight) {
		this.totalGrossWeight = totalGrossWeight;
	}

	public String getAdjustmentComment() {
		return adjustmentComment;
	}

	public void setAdjustmentComment(String adjustmentComment) {
		this.adjustmentComment = adjustmentComment;
	}

	public String getAdjustmentNoteNumber() {
		return adjustmentNoteNumber;
	}

	public void setAdjustmentNoteNumber(String adjustmentNoteNumber) {
		this.adjustmentNoteNumber = adjustmentNoteNumber;
	}

	public AdjustmentSourceType getAdjustmentSourceType() {
		return adjustmentSourceType;
	}

	public void setAdjustmentSourceType(AdjustmentSourceType adjustmentSourceType) {
		this.adjustmentSourceType = adjustmentSourceType;
	}

	public String getAdjustmentSourceTypeString() {
		if(this.getAdjustmentSourceType() != null)
		{
			adjustmentSourceTypeString = this.getAdjustmentSourceType().getAdjustmentSource();
		}
		return adjustmentSourceTypeString;
	}

	public void setAdjustmentSourceTypeString(String adjustmentSourceTypeString) {
		this.adjustmentSourceTypeString = adjustmentSourceTypeString;
	}

	public BigDecimal getAmountToBeBilled() {
		return amountToBeBilled;
	}

	public void setAmountToBeBilled(BigDecimal amountToBeBilled) {
		this.amountToBeBilled = amountToBeBilled;
	}

	public String getAirWaybillCurrencyCode() {
		return airWaybillCurrencyCode;
	}

	public void setAirWaybillCurrencyCode(String airWaybillCurrencyCode) {
		this.airWaybillCurrencyCode = airWaybillCurrencyCode;
	}

	public BigDecimal getBillingAmountToBeBilled() {
		return billingAmountToBeBilled;
	}

	public void setBillingAmountToBeBilled(BigDecimal billingAmountToBeBilled) {
		this.billingAmountToBeBilled = billingAmountToBeBilled;
	}

	public String getBillingCurrencyCode() {
		return billingCurrencyCode;
	}

	public void setBillingCurrencyCode(String billingCurrencyCode) {
		this.billingCurrencyCode = billingCurrencyCode;
	}

	public String getBillingExchangeRate() {
		return billingExchangeRate;
	}

	public void setBillingExchangeRate(String billingExchangeRate) {
		this.billingExchangeRate = billingExchangeRate;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public BigDecimal getHostAmountToBeBilled() {
		return hostAmountToBeBilled;
	}

	public void setHostAmountToBeBilled(BigDecimal hostAmountToBeBilled) {
		this.hostAmountToBeBilled = hostAmountToBeBilled;
	}

	public String getHostCurrencyCode() {
		return hostCurrencyCode;
	}

	public void setHostCurrencyCode(String hostCurrencyCode) {
		this.hostCurrencyCode = hostCurrencyCode;
	}

	public String getHostExchangeRate() {
		return hostExchangeRate;
	}

	public void setHostExchangeRate(String hostExchangeRate) {
		this.hostExchangeRate = hostExchangeRate;
	}

	public String getInvoiceRemarks() {
		return invoiceRemarks;
	}

	public void setInvoiceRemarks(String invoiceRemarks) {
		this.invoiceRemarks = invoiceRemarks;
	}

	public String getProrationCurrency() {
		return prorationCurrency;
	}

	public void setProrationCurrency(String prorationCurrency) {
		this.prorationCurrency = prorationCurrency;
	}

	public BigDecimal getInterlineServiceCommissionAmount() {
		return interlineServiceCommissionAmount;
	}

	public void setInterlineServiceCommissionAmount(
			BigDecimal interlineServiceCommissionAmount) {
		this.interlineServiceCommissionAmount = interlineServiceCommissionAmount;
	}

	public BigDecimal getInterlineServiceCommissionPercentage() {
		return interlineServiceCommissionPercentage;
	}

	public void setInterlineServiceCommissionPercentage(
			BigDecimal interlineServiceCommissionPercentage) {
		this.interlineServiceCommissionPercentage = interlineServiceCommissionPercentage;
	}

	public BigDecimal getInterlineServiceProCurCommissionAmount() {
		return interlineServiceProCurCommissionAmount;
	}

	public void setInterlineServiceProCurCommissionAmount(
			BigDecimal interlineServiceProCurCommissionAmount) {
		this.interlineServiceProCurCommissionAmount = interlineServiceProCurCommissionAmount;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getPartShipmentIndicator() {
		return partShipmentIndicator;
	}

	public void setPartShipmentIndicator(String partShipmentIndicator) {
		this.partShipmentIndicator = partShipmentIndicator;
	}

	public String getPaymentCurrencyCode() {
		return paymentCurrencyCode;
	}

	public void setPaymentCurrencyCode(String paymentCurrencyCode) {
		this.paymentCurrencyCode = paymentCurrencyCode;
	}

	public String getProrateIdentifier() {
		return prorateIdentifier;
	}

	public void setProrateIdentifier(String prorateIdentifier) {
		this.prorateIdentifier = prorateIdentifier;
	}

	public String getReasonText() {
		return reasonText;
	}

	public void setReasonText(String reasonText) {
		this.reasonText = reasonText;
	}

	public RevenueIndicatorType getRevenueIndicatorType() {
		return revenueIndicatorType;
	}

	public void setRevenueIndicatorType(RevenueIndicatorType revenueIndicatorType) {
		this.revenueIndicatorType = revenueIndicatorType;
	}

	public String getRevenueIndicatorTypeString() {
		if(this.getRevenueIndicatorType() != null)
		{
			revenueIndicatorTypeString = this.getRevenueIndicatorType().getRevenueIndicatorTypeName();
		}
		return revenueIndicatorTypeString;
	}

	public void setRevenueIndicatorTypeString(String revenueIndicatorTypeString) {
		this.revenueIndicatorTypeString = revenueIndicatorTypeString;
	}

	public BigDecimal getTotalOtherCharges() {
		return totalOtherCharges;
	}

	public void setTotalOtherCharges(BigDecimal totalOtherCharges) {
		this.totalOtherCharges = totalOtherCharges;
	}

	public BigDecimal getTotalOtherChargesDueCarrier() {
		return totalOtherChargesDueCarrier;
	}

	public void setTotalOtherChargesDueCarrier(
			BigDecimal totalOtherChargesDueCarrier) {
		this.totalOtherChargesDueCarrier = totalOtherChargesDueCarrier;
	}

	public BigDecimal getTotalOtherChargesDueAgent() {
		return totalOtherChargesDueAgent;
	}

	public void setTotalOtherChargesDueAgent(BigDecimal totalOtherChargesDueAgent) {
		this.totalOtherChargesDueAgent = totalOtherChargesDueAgent;
	}

	public String getAssociatedOffice() {
		return associatedOffice;
	}

	public void setAssociatedOffice(String associatedOffice) {
		this.associatedOffice = associatedOffice;
	}

	public String getAssociatedStation() {
		return associatedStation;
	}

	public void setAssociatedStation(String associatedStation) {
		this.associatedStation = associatedStation;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedOnFormatted() {
		String value="";
    	if(this.getCreatedOn() != null)
    	{
    		value=DateUtility.convertToGMTDate(this.getCreatedOn(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		createdOnFormatted=value.toUpperCase();
    	}
		return createdOnFormatted;
	}

	public void setCreatedOnFormatted(String createdOnFormatted) {
		this.createdOnFormatted = createdOnFormatted;
	}

	public String getUserIdentifier() {
		return userIdentifier;
	}

	public void setUserIdentifier(String userIdentifier) {
		this.userIdentifier = userIdentifier;
	}

	public BigDecimal getWeightCharges() {
		return weightCharges;
	}

	public void setWeightCharges(BigDecimal weightCharges) {
		this.weightCharges = weightCharges;
	}

	public BigDecimal getProrationAmountToBeBilled() {
		return prorationAmountToBeBilled;
	}

	public void setProrationAmountToBeBilled(BigDecimal prorationAmountToBeBilled) {
		this.prorationAmountToBeBilled = prorationAmountToBeBilled;
	}

	public PaymentStatusType getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(PaymentStatusType payStatus) {
		this.payStatus = payStatus;
	}

	public String getPayStatusString() {
		if(this.getPayStatus() != null)
		{
			payStatusString = this.getPayStatus().getVal();
		}
		return payStatusString;
	}

	public void setPayStatusString(String payStatusString) {
		this.payStatusString = payStatusString;
	}

	public ReceivableStatusType getRecStatus() {
		return recStatus;
	}

	public void setRecStatus(ReceivableStatusType recStatus) {
		this.recStatus = recStatus;
	}

	public String getRecStatusString() {
		if(this.getRecStatus() != null)
		{
			recStatusString = this.getRecStatus().getVal();
		}
		return recStatusString;
	}

	public void setRecStatusString(String recStatusString) {
		this.recStatusString = recStatusString;
	}

	public CRAParticipantAccountType getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(CRAParticipantAccountType invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getInvoiceTypeString() {
		return invoiceTypeString;
	}

	public void setInvoiceTypeString(String invoiceTypeString) {
		this.invoiceTypeString = invoiceTypeString;
	}

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @return the carrierReceivableOrPayable
	 */
	public String getCarrierReceivableOrPayable() {
		return carrierReceivableOrPayable;
	}

	/**
	 * @param carrierReceivableOrPayable the carrierReceivableOrPayable to set
	 */
	public void setCarrierReceivableOrPayable(String carrierReceivableOrPayable) {
		this.carrierReceivableOrPayable = carrierReceivableOrPayable;
	}

	/**
	 * @return the billingStartDate
	 */
	public Date getBillingStartDate() {
		return billingStartDate;
	}

	/**
	 * @param billingStartDate the billingStartDate to set
	 */
	public void setBillingStartDate(Date billingStartDate) {
		this.billingStartDate = billingStartDate;
	}

	/**
	 * @return the billingEndDate
	 */
	public Date getBillingEndDate() {
		return billingEndDate;
	}

	/**
	 * @param billingEndDate the billingEndDate to set
	 */
	public void setBillingEndDate(Date billingEndDate) {
		this.billingEndDate = billingEndDate;
	}

	/**
	 * @return the clearingHouse
	 */
	public SettlementMethodType getClearingHouse() {
		return clearingHouse;
	}

	/**
	 * @param clearingHouse the clearingHouse to set
	 */
	public void setClearingHouse(SettlementMethodType clearingHouse) {
		this.clearingHouse = clearingHouse;
	}

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
	 * @return the invoiceDate
	 */
	public Date getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * @param invoiceDate the invoiceDate to set
	 */
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	
	/**
	 * @return the statusType
	 */
	public String getStatusType() {
		return statusType;
	}

	/**
	 * @param statusType the statusType to set
	 */
	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}

	/**
	 * @return the statusTypeReceivable
	 */
	public ReceivableStatusType getStatusTypeReceivable() {
		return statusTypeReceivable;
	}

	/**
	 * @param statusTypeReceivable the statusTypeReceivable to set
	 */
	public void setStatusTypeReceivable(ReceivableStatusType statusTypeReceivable) {
		this.statusTypeReceivable = statusTypeReceivable;
	}

	/**
	 * @return the statusTypePayable
	 */
	public PaymentStatusType getStatusTypePayable() {
		return statusTypePayable;
	}

	/**
	 * @param statusTypePayable the statusTypePayable to set
	 */
	public void setStatusTypePayable(PaymentStatusType statusTypePayable) {
		this.statusTypePayable = statusTypePayable;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

	/**
	 * @return the carrierCode
	 */
	public String getCarrierCode() {
		return carrierCode;
	}

	/**
	 * @param carrierCode the carrierCode to set
	 */
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	/**
	 * @return the prprationType
	 */
	public ProrationType getProrationType() {
		return prorationType;
	}

	/**
	 * @param prprationType the prprationType to set
	 */
	public void setProrationType(ProrationType prorationType) {
		this.prorationType = prorationType;
	}

	/**
	 * @return the prorationIdentifier
	 */
	public String getProrationIdentifier() {
		return prorationIdentifier;
	}

	/**
	 * @param prorationIdentifier the prorationIdentifier to set
	 */
	public void setProrationIdentifier(String prorationIdentifier) {
		this.prorationIdentifier = prorationIdentifier;
	}

	/**
	 * @return the iscPercentage
	 */
	public String getIscPercentage() {
		return iscPercentage;
	}

	/**
	 * @param iscPercentage the iscPercentage to set
	 */
	public void setIscPercentage(String iscPercentage) {
		this.iscPercentage = iscPercentage;
	}

	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * @return the receivablePayableIndicator
	 */
	public String getReceivablePayableIndicator() {
		return receivablePayableIndicator;
	}

	/**
	 * @param receivablePayableIndicator the receivablePayableIndicator to set
	 */
	public void setReceivablePayableIndicator(String receivablePayableIndicator) {
		this.receivablePayableIndicator = receivablePayableIndicator;
	}

	
	/**
	 * @return the activeIndicator
	 */
	public boolean isActiveIndicator() {
		return activeIndicator;
	}

	/**
	 * @param activeIndicator the activeIndicator to set
	 */
	public void setActiveIndicator(boolean activeIndicator) {
		this.activeIndicator = activeIndicator;
	}

	
	
	/**
	 * @return the activeIndicatorValue
	 */
	public String getActiveIndicatorValue() {
		return activeIndicatorValue;
	}

	/**
	 * @param activeIndicatorValue the activeIndicatorValue to set
	 */
	public void setActiveIndicatorValue(String activeIndicatorValue) {
		this.activeIndicatorValue = activeIndicatorValue;
	}

	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * @param currencyCode the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * @return the awbNumber
	 */
	public String getAwbNumber() {
		return awbNumber;
	}

	/**
	 * @param awbNumber the awbNumber to set
	 */
	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}

	/**
	 * @return the carrierNumber
	 */
	public String getCarrierNumber() {
		return carrierNumber;
	}

	/**
	 * @param carrierNumber the carrierNumber to set
	 */
	public void setCarrierNumber(String carrierNumber) {
		this.carrierNumber = carrierNumber;
	}

	/**
	 * @return the carrierName
	 */
	public String getCarrierName() {
		if(carrierName != null)
		{
			carrierName = carrierName.toLowerCase();
			char[] name = carrierName.toCharArray();
			name[0] = Character.toUpperCase(name[0]);
			for(int i=0;i<name.length;i++)
			{
				if(name[i] == ' ')
				{
					i++;
					name[i]=Character.toUpperCase(name[i]);
				}
			}
			carrierName = String.valueOf(name);
		}
		return carrierName;
	}

	/**
	 * @param carrierName the carrierName to set
	 */
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	/**
	 * @return the carrierCity
	 */
	public String getCarrierCity() {
		if(carrierCity != null)
		{
			carrierCity = carrierCity.toLowerCase();
			char[] name = carrierCity.toCharArray();
			name[0] = Character.toUpperCase(name[0]);
			for(int i=0;i<name.length;i++)
			{
				if(name[i] == ' ')
				{
					i++;
					name[i]=Character.toUpperCase(name[i]);
				}
			}
			carrierCity = String.valueOf(name);
		}
		return carrierCity;
	}

	/**
	 * @param carrierCity the carrierCity to set
	 */
	public void setCarrierCity(String carrierCity) {
		this.carrierCity = carrierCity;
	}

	/**
	 * @return the carrierState
	 */
	public String getCarrierState() {
		return carrierState;
	}

	/**
	 * @param carrierState the carrierState to set
	 */
	public void setCarrierState(String carrierState) {
		this.carrierState = carrierState;
	}

	/**
	 * @return the carrierPostalCode
	 */
	public String getCarrierPostalCode() {
		return carrierPostalCode;
	}

	/**
	 * @param carrierPostalCode the carrierPostalCode to set
	 */
	public void setCarrierPostalCode(String carrierPostalCode) {
		this.carrierPostalCode = carrierPostalCode;
	}

	
	/**
	 * @return the carrierCountry
	 */
	public String getCarrierCountry() {
		return carrierCountry;
	}

	/**
	 * @param carrierCountry the carrierCountry to set
	 */
	public void setCarrierCountry(String carrierCountry) {
		this.carrierCountry = carrierCountry;
	}

	/**
	 * @return the carrierPhoneNumber
	 */
	public String getCarrierPhoneNumber() {
		return carrierPhoneNumber;
	}

	/**
	 * @param carrierPhoneNumber the carrierPhoneNumber to set
	 */
	public void setCarrierPhoneNumber(String carrierPhoneNumber) {
		this.carrierPhoneNumber = carrierPhoneNumber;
	}

	/**
	 * @return the carrierFax
	 */
	public String getCarrierFax() {
		return carrierFax;
	}

	/**
	 * @param carrierFax the carrierFax to set
	 */
	public void setCarrierFax(String carrierFax) {
		this.carrierFax = carrierFax;
	}

	/**
	 * @return the interlineOrigin
	 */
	public String getInterlineOrigin() {
		return interlineOrigin;
	}

	/**
	 * @param interlineOrigin the interlineOrigin to set
	 */
	public void setInterlineOrigin(String interlineOrigin) {
		this.interlineOrigin = interlineOrigin;
	}

	/**
	 * @return the interlineDestination
	 */
	public String getInterlineDestination() {
		return interlineDestination;
	}

	/**
	 * @param interlineDestination the interlineDestination to set
	 */
	public void setInterlineDestination(String interlineDestination) {
		this.interlineDestination = interlineDestination;
	}

	/**
	 * @return the valuationCharge
	 */
	public String getValuationCharge() {
		return valuationCharge;
	}

	/**
	 * @param valuationCharge the valuationCharge to set
	 */
	public void setValuationCharge(String valuationCharge) {
		this.valuationCharge = valuationCharge;
	}

	/**
	 * @return the totalOtherCharge
	 */
	public String getTotalOtherCharge() {
		return totalOtherCharge;
	}

	/**
	 * @param totalOtherCharge the totalOtherCharge to set
	 */
	public void setTotalOtherCharge(String totalOtherCharge) {
		this.totalOtherCharge = totalOtherCharge;
	}

	/**
	 * @return the iscAmount
	 */
	public String getIscAmount() {
		return iscAmount;
	}

	/**
	 * @param iscAmount the iscAmount to set
	 */
	public void setIscAmount(String iscAmount) {
		this.iscAmount = iscAmount;
	}

	/**
	 * @return the iscPercent
	 */
	public String getIscPercent() {
		return iscPercent;
	}

	/**
	 * @param iscPercent the iscPercent to set
	 */
	public void setIscPercent(String iscPercent) {
		this.iscPercent = iscPercent;
	}

	/**
	 * @return the otherChargeDueAgent
	 */
	public String getOtherChargeDueAgent() {
		return otherChargeDueAgent;
	}

	/**
	 * @param otherChargeDueAgent the otherChargeDueAgent to set
	 */
	public void setOtherChargeDueAgent(String otherChargeDueAgent) {
		this.otherChargeDueAgent = otherChargeDueAgent;
	}

	/**
	 * @return the otherChargeDueCarrier
	 */
	public String getOtherChargeDueCarrier() {
		return otherChargeDueCarrier;
	}

	/**
	 * @param otherChargeDueCarrier the otherChargeDueCarrier to set
	 */
	public void setOtherChargeDueCarrier(String otherChargeDueCarrier) {
		this.otherChargeDueCarrier = otherChargeDueCarrier;
	}

	/**
	 * @return the netBillable
	 */
	public String getNetBillable() {
		return netBillable;
	}

	/**
	 * @param netBillable the netBillable to set
	 */
	public void setNetBillable(String netBillable) {
		this.netBillable = netBillable;
	}

	

	/**
	 * @return the vat
	 */
	public BigDecimal getVat() {
		return vat;
	}

	/**
	 * @param vat the vat to set
	 */
	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}

	/**
	 * @return the freightCharge
	 */
	public String getFreightCharge() {
		return freightCharge;
	}

	/**
	 * @param freightCharge the freightCharge to set
	 */
	public void setFreightCharge(String freightCharge) {
		this.freightCharge = freightCharge;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public ExportPaymentType getExportPaycode() {
		return exportPaycode;
	}

	public void setExportPaycode(ExportPaymentType exportPaycode) {
		this.exportPaycode = exportPaycode;
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

	public String getCustomsStation() {
		return customsStation;
	}

	public void setCustomsStation(String customsStation) {
		this.customsStation = customsStation;
	}

	public String getDeclaredValue() {
		return declaredValue;
	}

	public void setDeclaredValue(String declaredValue) {
		this.declaredValue = declaredValue;
	}

	public String getCustomsValue() {
		return customsValue;
	}

	public void setCustomsValue(String customsValue) {
		this.customsValue = customsValue;
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

	public String getOriginCurrency() {
		return originCurrency;
	}

	public void setOriginCurrency(String originCurrency) {
		this.originCurrency = originCurrency;
	}

	public String getDestinationCurrency() {
		return destinationCurrency;
	}

	public void setDestinationCurrency(String destinationCurrency) {
		this.destinationCurrency = destinationCurrency;
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
		String value="";
    	if(this.getPricingDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getPricingDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		pricingDateFormatted=value.toUpperCase();
    	}
      return pricingDateFormatted;
	}

	public void setPricingDateFormatted(String pricingDateFormatted) {
		this.pricingDateFormatted = pricingDateFormatted;
	}

	public BigDecimal getDimensionalWeight() {
		return dimensionalWeight;
	}

	public void setDimensionalWeight(BigDecimal dimensionalWeight) {
		this.dimensionalWeight = dimensionalWeight;
	}

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	public VolumeEvaluationMethodType getVolumeEvaluationMethod() {
		return volumeEvaluationMethod;
	}

	public void setVolumeEvaluationMethod(
			VolumeEvaluationMethodType volumeEvaluationMethod) {
		this.volumeEvaluationMethod = volumeEvaluationMethod;
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

	public HurdleRateReasonType getBookingEventHurdleRateReasonCode() {
		return bookingEventHurdleRateReasonCode;
	}

	public void setBookingEventHurdleRateReasonCode(
			HurdleRateReasonType bookingEventHurdleRateReasonCode) {
		this.bookingEventHurdleRateReasonCode = bookingEventHurdleRateReasonCode;
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

	public BigDecimal getCodCharges() {
		return codCharges;
	}

	public void setCodCharges(BigDecimal codCharges) {
		this.codCharges = codCharges;
	}

	public String getAccountingStatus() {
		return accountingStatus;
	}

	public void setAccountingStatus(String accountingStatus) {
		this.accountingStatus = accountingStatus;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public Date getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}

	public String getOriginStation() {
		return originStation;
	}

	public void setOriginStation(String originStation) {
		this.originStation = originStation;
	}

		
	public InvoiceStatusType getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(InvoiceStatusType invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public String getBillingCode() {
		return billingCode;
	}

	public void setBillingCode(String billingCode) {
		this.billingCode = billingCode;
	}

	public String getMemoNumber() {
		return memoNumber;
	}

	public void setMemoNumber(String memoNumber) {
		this.memoNumber = memoNumber;
	}

	public RejectionMemoStageType getRejectionMemostage() {
		return rejectionMemostage;
	}

	public void setRejectionMemostage(RejectionMemoStageType rejectionMemostage) {
		this.rejectionMemostage = rejectionMemostage;
	}

	public BigDecimal getChargeableWeight() {
		return chargeableWeight;
	}

	public void setChargeableWeight(BigDecimal chargeableWeight) {
		this.chargeableWeight = chargeableWeight;
	}

	public String getYourInvoiceNumber() {
		return yourInvoiceNumber;
	}

	public void setYourInvoiceNumber(String yourInvoiceNumber) {
		this.yourInvoiceNumber = yourInvoiceNumber;
	}

	public Date getOriginalInvoiceDate() {
		return originalInvoiceDate;
	}

	public void setOriginalInvoiceDate(Date originalInvoiceDate) {
		this.originalInvoiceDate = originalInvoiceDate;
	}

	public String getOriginalRejectionNumber() {
		return originalRejectionNumber;
	}

	public void setOriginalRejectionNumber(String originalRejectionNumber) {
		this.originalRejectionNumber = originalRejectionNumber;
	}

	public String getOriginalMemoNumber() {
		return originalMemoNumber;
	}

	public void setOriginalMemoNumber(String originalMemoNumber) {
		this.originalMemoNumber = originalMemoNumber;
	}

	public String getFromStation() {
		return fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	public String getToStation() {
		return toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = toStation;
	}

	public String getBillingCurrency() {
		return billingCurrency;
	}

	public void setBillingCurrency(String billingCurrency) {
		this.billingCurrency = billingCurrency;
	}

	public RejectionMemoStatus getRejectionMemoStatus() {
		return rejectionMemoStatus;
	}

	public void setRejectionMemoStatus(RejectionMemoStatus rejectionMemoStatus) {
		this.rejectionMemoStatus = rejectionMemoStatus;
	}

	public String getQueueReason() {
		return queueReason;
	}

	public void setQueueReason(String queueReason) {
		this.queueReason = queueReason;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public InwardQueueType getQueueType() {
		return queueType;
	}

	public void setQueueType(InwardQueueType queueType) {
		this.queueType = queueType;
	}

	public BigDecimal getAwbTotalAccepted() {
		return awbTotalAccepted;
	}

	public void setAwbTotalAccepted(BigDecimal awbTotalAccepted) {
		this.awbTotalAccepted = awbTotalAccepted;
	}

	public BigDecimal getAwbTotalBilled() {
		return awbTotalBilled;
	}

	public void setAwbTotalBilled(BigDecimal awbTotalBilled) {
		this.awbTotalBilled = awbTotalBilled;
	}

	public BigDecimal getAwbTotalActual() {
		return awbTotalActual;
	}

	public void setAwbTotalActual(BigDecimal awbTotalActual) {
		this.awbTotalActual = awbTotalActual;
	}

	public BigDecimal getIscAmountActual() {
		return iscAmountActual;
	}

	public void setIscAmountActual(BigDecimal iscAmountActual) {
		this.iscAmountActual = iscAmountActual;
	}

	public BigDecimal getIscAmountBilled() {
		return iscAmountBilled;
	}

	public void setIscAmountBilled(BigDecimal iscAmountBilled) {
		this.iscAmountBilled = iscAmountBilled;
	}

	public BigDecimal getOtherChargesActual() {
		return otherChargesActual;
	}

	public void setOtherChargesActual(BigDecimal otherChargesActual) {
		this.otherChargesActual = otherChargesActual;
	}

	public BigDecimal getOtherChargesBilled() {
		return otherChargesBilled;
	}

	public void setOtherChargesBilled(BigDecimal otherChargesBilled) {
		this.otherChargesBilled = otherChargesBilled;
	}

	public BigDecimal getValuationChargesActual() {
		return valuationChargesActual;
	}

	public void setValuationChargesActual(BigDecimal valuationChargesActual) {
		this.valuationChargesActual = valuationChargesActual;
	}

	public BigDecimal getValuationChargesBilled() {
		return valuationChargesBilled;
	}

	public void setValuationChargesBilled(BigDecimal valuationChargesBilled) {
		this.valuationChargesBilled = valuationChargesBilled;
	}

	public BigDecimal getWeightChargesActual() {
		return weightChargesActual;
	}

	public void setWeightChargesActual(BigDecimal weightChargesActual) {
		this.weightChargesActual = weightChargesActual;
	}

	public BigDecimal getWeightChargesBilled() {
		return weightChargesBilled;
	}

	public void setWeightChargesBilled(BigDecimal weightChargesBilled) {
		this.weightChargesBilled = weightChargesBilled;
	}

	public BigDecimal getAmountToBeRejected() {
		return amountToBeRejected;
	}

	public void setAmountToBeRejected(BigDecimal amountToBeRejected) {
		this.amountToBeRejected = amountToBeRejected;
	}

	public String getReasonDescription() {
		return reasonDescription;
	}

	public void setReasonDescription(String reasonDescription) {
		this.reasonDescription = reasonDescription;
	}


	public BigDecimal getOutwardAwbTotal() {
		return outwardAwbTotal;
	}

	public void setOutwardAwbTotal(BigDecimal outwardAwbTotal) {
		this.outwardAwbTotal = outwardAwbTotal;
	}

	public BigDecimal getOutwardIscAmount() {
		return outwardIscAmount;
	}

	public void setOutwardIscAmount(BigDecimal outwardIscAmount) {
		this.outwardIscAmount = outwardIscAmount;
	}

	public BigDecimal getOutwardWeightCharges() {
		return outwardWeightCharges;
	}

	public void setOutwardWeightCharges(BigDecimal outwardWeightCharges) {
		this.outwardWeightCharges = outwardWeightCharges;
	}

	public BigDecimal getOutwardValuationCharges() {
		return outwardValuationCharges;
	}

	public void setOutwardValuationCharges(BigDecimal outwardValuationCharges) {
		this.outwardValuationCharges = outwardValuationCharges;
	}

	public BigDecimal getOutwardOtherCharges() {
		return outwardOtherCharges;
	}

	public void setOutwardOtherCharges(BigDecimal outwardOtherCharges) {
		this.outwardOtherCharges = outwardOtherCharges;
	}

	public BigDecimal getOutwardVatAmount() {
		return outwardVatAmount;
	}

	public void setOutwardVatAmount(BigDecimal outwardVatAmount) {
		this.outwardVatAmount = outwardVatAmount;
	}

	
	public InwardInvoiceStatus getAwbInvoiceStatus() {
		return awbInvoiceStatus;
	}

	public void setAwbInvoiceStatus(InwardInvoiceStatus awbInvoiceStatus) {
		this.awbInvoiceStatus = awbInvoiceStatus;
	}

	public String getAwbInvoiceStatusString() {
		return awbInvoiceStatusString;
	}

	public void setAwbInvoiceStatusString(String awbInvoiceStatusString) {
		this.awbInvoiceStatusString = awbInvoiceStatusString;
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

	public String getProrationTypeString() {
		if(this.getProrationType() != null)
		{
			prorationTypeString = this.getProrationType().getVal();
		}
		return prorationTypeString;
	}

	public void setProrationTypeString(String prorationTypeString) {
		this.prorationTypeString = prorationTypeString;
	}

	public String getClearingHouseString() {
		if(this.getClearingHouse() != null)
		{
			clearingHouseString = this.getClearingHouse().getStringValue();
		}
		return clearingHouseString;
	}

	public void setClearingHouseString(String clearingHouseString) {
		this.clearingHouseString = clearingHouseString;
	}

	public String getVolumeEvaluationMethodString() {
		if(this.getVolumeEvaluationMethod()!=null)
		{
			volumeEvaluationMethodString = this.getVolumeEvaluationMethod().getUnit();
		}
		return volumeEvaluationMethodString;
	}

	public void setVolumeEvaluationMethodString(String volumeEvaluationMethodString) {
		this.volumeEvaluationMethodString = volumeEvaluationMethodString;
	}

	public String getBookingEventHurdleRateReasonCodeString() {
		if(this.getBookingEventHurdleRateReasonCode()!=null)
			bookingEventHurdleRateReasonCodeString = this.getBookingEventHurdleRateReasonCode().getVal();
		return bookingEventHurdleRateReasonCodeString;
	}

	public void setBookingEventHurdleRateReasonCodeString(
			String bookingEventHurdleRateReasonCodeString) {
		this.bookingEventHurdleRateReasonCodeString = bookingEventHurdleRateReasonCodeString;
	}
	
	
	public String getInvoiceStatusTypeString() {
		if(this.getInvoiceStatus() != null)
		{
			invoiceStatusTypeString = this.getInvoiceStatus().getType();
		}
		return invoiceStatusTypeString;
	}

	public void setInvoiceStatusTypeString(String invoiceStatusTypeString) {
		this.invoiceStatusTypeString = invoiceStatusTypeString;
	}


	public String getRejectionMemoStatusType() {
		if(this.getRejectionMemoStatus() != null)
		{
			rejectionMemoStatusType = this.getRejectionMemoStatus().getStringValue();
		}
		return rejectionMemoStatusType;
	}

	public void setRejectionMemoStatusType(String rejectionMemoStatusType) {
		this.rejectionMemoStatusType = rejectionMemoStatusType;
	}

	public String toString() {
        // SuppressOn:MagicNumber
        final StringBuffer csvString = new StringBuffer();
        
       
        if(this.getCarrierReceivableOrPayable() != null)
        {
        	csvString.append(this.prefixSuffixByQuotes(this.getCarrierReceivableOrPayable()));
        }
        else
        	csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        
        if(this.getCarrierCode() != null)
		{
        	csvString.append(this.prefixSuffixByQuotes(this.getCarrierCode()));
		}
		else
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        
        if(this.getBillingStartDate() != null)
        {
        	csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getBillingStartDate())));
        }
        else
        	csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        
        if(this.getBillingEndDate() != null)
        {
        	csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getBillingEndDate())));
        }
        else
        	csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        
		
				
		if(this.getClearingHouse()!= null)
		{
			csvString.append(this.prefixSuffixByQuotes(this.getClearingHouse().getStringValue()));
		}
		else
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		
		if(this.getInvoiceNumber()!= null)
		{
			csvString.append(this.prefixSuffixByQuotes(this.getInvoiceNumber()));
		}
		else
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		
		if(this.getInvoiceDate()!= null)
		{
			csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getInvoiceDate())));
		}
		else
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		
		
		if(this.getStatusTypePayable()!= null)
		{
			csvString.append(this.prefixSuffixByQuotes(this.getStatusTypePayable().getVal()));
		}
		else if(this.getStatusTypeReceivable()!= null)
			csvString.append(this.prefixSuffixByQuotes(this.getStatusTypeReceivable().getVal()));
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

	@Override
	public int compareTo(InterlineBillingReportDto interlineBillingReportDto) {
		if(this.getBillingCarrier()!=null && interlineBillingReportDto!=null) {
		    return this.getBillingCarrier().compareToIgnoreCase(interlineBillingReportDto.getBillingCarrier());
		}else {
			return 0;
		}
	}

	public String getMemoType() {
		return memoType;
	}

	public void setMemoType(String memoType) {
		this.memoType = memoType;
	}

	public Date getMemoDate() {
		return memoDate;
	}

	public void setMemoDate(Date memoDate) {
		this.memoDate = memoDate;
	}

	public String getMemoDateFormatted() {

		String value="";
    	if(this.getMemoDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getMemoDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		memoDateFormatted=value.toUpperCase();
    	}
      return memoDateFormatted;
	}

	public void setMemoDateFormatted(String memoDateFormatted) {
		this.memoDateFormatted = memoDateFormatted;
	}

	public BigDecimal getBilledWeight() {
		return billedWeight;
	}

	public void setBilledWeight(BigDecimal billedWeight) {
		this.billedWeight = billedWeight;
	}

	public WeightUOMType getWeightIndicator() {
		return weightIndicator;
	}

	public void setWeightIndicator(WeightUOMType weightIndicator) {
		this.weightIndicator = weightIndicator;
	}

	public String getSettlementYearMonth() {
		return settlementYearMonth;
	}

	public void setSettlementYearMonth(String settlementYearMonth) {
		this.settlementYearMonth = settlementYearMonth;
	}

	public String getSettlementPeriod() {
		return settlementPeriod;
	}

	public void setSettlementPeriod(String settlementPeriod) {
		this.settlementPeriod = settlementPeriod;
	}

	public String getSettlementMethod() {
		return settlementMethod;
	}

	public void setSettlementMethod(String settlementMethod) {
		this.settlementMethod = settlementMethod;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public BigDecimal getVatChargesBilled() {
		return vatChargesBilled;
	}

	public void setVatChargesBilled(BigDecimal vatChargesBilled) {
		this.vatChargesBilled = vatChargesBilled;
	}

	public Date getUpdateDate() {
      return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateDateFormatted() {
		String value="";
    	if(this.getUpdateDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getUpdateDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		updateDateFormatted=value.toUpperCase();
    	}
		return updateDateFormatted;
	}

	public void setUpdateDateFormatted(String updateDateFormatted) {
		this.updateDateFormatted = updateDateFormatted;
	}

	public String getCarriageDateFormatted() {

		String value="";
    	if(this.getCarriageDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getCarriageDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		carriageDateFormatted=value.toUpperCase();
    	}
		return carriageDateFormatted;
	
	}

	public void setCarriageDateFormatted(String carriageDateFormatted) {
		this.carriageDateFormatted = carriageDateFormatted;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getOriginalInvoiceDateString() {
		String value="";
    	if(this.getOriginalInvoiceDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getOriginalInvoiceDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		originalInvoiceDateString=value.toUpperCase();
    	}
		return originalInvoiceDateString;
	}

	public void setOriginalInvoiceDateString(String originalInvoiceDateString) {
		this.originalInvoiceDateString = originalInvoiceDateString;
	}
	
}
