package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
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
import com.unisys.trans.logistics.lms.accounting.dto.constants.PadType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PaymentLevel;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PaymentStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RateGenerationType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ReceivableStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ReceivableType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RevenueIndicatorType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ShipmentStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.SpecialPurgeType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.UnitType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.VolumeEvaluationMethodType;
import com.unisys.trans.logistics.lms.framework.constants.AccountRegionType;
import com.unisys.trans.logistics.lms.framework.constants.CRAParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceFrequencyType;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceMediaType;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceSequenceType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

public class ParticipantBillingReportDto extends PersistenceObjectDto {

	private static final long serialVersionUID = 1L;

	private static final String EMPTY_STRING = "";

	
	
	//AirwayBill Participant
	
	private String agentName;
	private String agentAddress;
	private String agentPhone;
	private String agentEmail;
	private String agentFax;
	private String agentStation;
	private String agentRemarks;
	private String agentCity;
	private String agentCountry;
	private String agentPostCode;
	private String agentState;
	
	private String bankName;
	private String bankAddress;
	private String bankPhone;
	private String bankEmail;
	private String bankFax;
	private String bankStation;
	private String bankRemarks;
	
	private String billToConsigneeName;
	private String billToConsigneeAddress;
	private String billToConsigneePhone;
	private String billToConsigneeEmail;
	private String billToConsigneeFax;
	private String billToConsigneeRemarks;
	private String billToConsigneeStation;
		
	private String billToShipperName;
	private String billToShipperAddress;
	private String billToShipperPhone;
	private String billToShipperEmail;
	private String billToShipperFax;
	private String billToShipperStation;
	private String billToShipperRemarks;
	
	private String brokerName;
	private String brokerAddress;
	private String brokerPhone;
	private String brokerEmail;
	private String brokerFax;
	private String brokerRemarks;
	
	private String consigneeName;
	private String consigneeAddress;
	private String consigneePhone;
	private String consigneeEmail;
	private String consigneeFax;
	private String consigneeStation;
	private String consigneeRemarks;
	private String consigneeAccountNumber;
	
	
	private String customsLocationName;
	private String customsLocationAddress;
	private String customsLocationPhone;
	private String customsLocationEmail;
	private String customsLocationFax;
	private String customsLocationRemarks;
	//private String customsStation; --present in AWB Information
	
	
	private String deliveryOperatorName;
	private String deliveryOperatorAddress;
	private String deliveryOperatorPhone;
	private String deliveryOperatorEmail;
	private String deliveryOperatorFax;
	private String deliveryOperatorRemarks;
	private String deliveryOperatorStation;
	
	private String forwarderName;
	private String forwarderAddress;
	private String forwarderPhone;
	private String forwarderEmail;
	private String forwarderFax;
	private String forwarderStation;
	private String forwarderRemarks;
	
	//IATA Account Number -- Mapping Needed
	
	private String manufacturerName;
	private String manufacturerAddress;
	private String manufacturerPhone;
	private String manufacturerEmail;
	private String manufacturerFax;
	private String manufacturerStation;
	private String manufacturerRemarks;
	
	private String notifyName;
	private String notifyAddress;
	private String notifyPhone;
	private String notifyEmail;
	private String notifyFax;
	private String notifyStation;
	private String notifyRemarks;
	
	private String pickupLocationName;
	private String pickupLocationAddress;
	private String pickupLocationPhone;
	private String pickupLocationEmail;
	private String pickupLocationFax;
	private String pickupLocationStation;
	private String pickupLocationRemarks;

	private String pickupOperatorName;
	private String pickupOperatorAddress;
	private String pickupOperatorPhone;
	private String pickupOperatorEmail;
	private String pickupOperatorFax;
	private String pickupOperatorStation;
	private String pickupOperatorRemarks;
	
	private String shipperAccountNumber;
	private String shipperName;
	private String shipperAddress;
	private String shipperPhone;
	private String shipperEmail;
	private String shipperFax;
	private String shipperStation;
	//private String shipperRemarks;
	private String shipperState;
	private String shipperPostalcode;
	private String shipperCountry;
	private String shipperCity;
	
	private String surfaceDestinationName;
	private String surfaceDestinationAddress;
	private String surfaceDestinationPhone;
	private String surfaceDestinationEmail;
	private String surfaceDestinationFax;
	private String surfaceDestinationStation;
	private String surfaceDestinationRemarks;
	
	private String surfaceOriginName;
	private String surfaceOriginAddress;
	private String surfaceOriginPhone;
	private String surfaceOriginEmail;
	private String surfaceOriginFax;
	private String surfaceOriginStation;
	private String surfaceOriginRemarks;
	//private CRAParticipantAccountType participantAccountType;
	
	
	//Accounting Participant
	private String billToAccountNumber;
	private String billingAccountNumber1;//All to be included from Parts Participants
	private String billingAccountNumber2;
	private String billingAccountType1;
	private String billingAccountType2;
	private String iataAccountnumber; //To be abtained from Accounting Participant
	private AccountRegionType accountRegion;
	private String accountRegionString;
	private String areaRepresentative;
	private Date salesContactDate1;
	private String salesContactDate1Formatted; 
	private Date salesContactDate2;
	private String salesContactDate2Formatted;
	private Date salesContactDate3;
	private String salesContactDate3Formatted;
	//private String station;
	private String salesContact1;
	private String salesContact2;
	private String salesContactRemarks1;
	private String salesContactRemarks2;
	private String salesContactRemarks3;
	private String contactInformation;
	private String primaryCommodity;
	private String seasonalShipping;
	private String specialHandling;
	private String accountExecutive;
	private String cassNumber;
	//AccParticipant->AccBilling
	private String accountingPeriod;
	private String billingPaymentDiscountDays;
	private String billingPaymentDueDays;
	private BigDecimal commissionPercentage;
	private String currency;
	private BigDecimal discountPercentage;
	private BigDecimal incentivePercentage;
	private InvoiceFrequencyType invoiceFrequency;
	private String invoiceFrequencyString;
	private String invoiceLanguage;
	private InvoiceMediaType invoiceMedia;
	private String invoiceMediaString;
	private InvoiceSequenceType invoiceSequence;
	private String invoiceSequenceString;
	private String invoiceSite;
	private String invoiceEmail;
	private String mtdSales;
	private String prevMTDSales;
	private String prevYTDSales;
	private BigDecimal serviceFeePercentage;
	private String ytdSales;
	//AccParticipant->AccountingCredit
	private Date agingAnalysisDate;
	private String agingAnalysisDateFormatted;
	private BigDecimal amountsUnapplied;
	private BigDecimal amountsUnbilled;
	private String collectorId;
	private BigDecimal totalOutstanding;
	private BigDecimal totalAmount;
	private String collectionEmail;
	private Boolean collectionMedia;
	//participant->FreightDetail
	private String paymentMethod;
	private String creditRate;
	private Long creditLimit;
	private BigDecimal availableCredit;
	private String creditCurrencyCode;//assemble it from credit Currency
	private int totalShipments; //Freight detail-> freight Statistics
	private int totalHouseAWB;
	private Boolean govtTaxExemptIndicator;
	private Boolean stateTaxExemptIndicator;
	
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
	private String purgeIndicatorString;
	private ShipmentStatusType status;
	private String statusString;
	private Boolean taxIndicator;
	private WeightUOMType unitOfWeight;
	private String unitOfWeightString;
	private Date pricingDate;
	private String pricingDateFormatted;
	private Date creationDate;
	private String creationDateFormatted;
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
	private String netNetIndicator;
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

	//AWB <- AWB Revenue   //Not available
	private BigDecimal airWaybillEventGrossRevenue;
	private BigDecimal airWaybillEventHostRevenue;
	private BigDecimal airwaybillNetAmount;
	private BigDecimal airwaybillOutstandingAmount;
	private BigDecimal hostNetYield;
	private BigDecimal hostNetRevenue;
	private BigDecimal totalGrossWeight;
	
	//Participant Receivables
	private BigDecimal amountToBeBilled;
	private String currencyCode;
	private BigDecimal billingAmountToBeBilled;
	private String billingCurrencyCode;
	private String billingExchangeRate;
	private BigDecimal billingOutstandingAmountToBeBilled;
	private BigDecimal discount;
	private GenIdType genIDType;
	private String genIDTypeString;
	private BigDecimal netBillableAmount;//same as private BigDecimal hostAmountToBeBilled;
	private String hostCurrencyCode;
	private String hostExchangeRate;
	private BigDecimal hostOutstandingAmountToBeBilled;
	private BigDecimal outstandingAmountToBeBilled;
	private InvoiceStatusType invoiceStatus;
	private String invoiceStatusString;
	private Date invoiceDate;
	private String invoiceDateFormatted;
	private String invoiceNumber;
	private CRAParticipantAccountType invoiceType;
	private String invoiceTypeString;
	private BigDecimal netAmountToBeBilled;
	private BigDecimal netBillingAmountToBeBilled;
	private BigDecimal netHostAmountToBeBilled;
	//outstanding payment amount
	//private String accountNumber;
	private String participantType;
	private ReceivableStatusType receivablePaymentStatusType;
	private String receivablePaymentStatusTypeString;
	private String reasonText;
	private ReceivableType receivableType;
	private String receivableTypeString;
	private RevenueIndicatorType revenueIndicatorType;
	private String revenueIndicatorTypeString;
	//office
	private String station;
	private String billingParticipantName;
	private String billingParticipantAddress;
	private String billingParticipantCity;
	private String billingParticipantState;
	private String billingParticipantCountry;
	private String billingParticipantPhone;
	private String billingParticipantEmail;
	private String billingParticipantPostalCode;
	private String adjustmentComment;
	private String adjustmentNoteNumber;
	private AdjustmentSourceType adjustmentSourceType;
	private String adjustmentSourceTypeString;
	private BigDecimal otherChargeDueAgent;
	private BigDecimal otherChargeDueCarrier;
	private BigDecimal vat;
	private String commission;
	private String freightCharge;
	private String valuationCharge;
	
	//Payments
	//private String airwaybillNumber;
	private Date awbDate;
	private String awbDateFormatted;
	//private String airwayBillDestination;
	//private String airwayBillOrigin;
	private String awbPaymentType;
	private BigDecimal commissionAmount;
	private String paymentAmount;//Sum of net amount in case of multiple Breakdowns
	//private BigDecimal commissionPercentage;
	private String dcmReference;
	private String fileName;
	private Date fileUploadedDate;
	private String fileUploadedDateFormatted;
	private BigDecimal grossWeight;
	private BigDecimal invoiceAmount;
	//private String invoiceNumber;
	
	private BigDecimal netAmount;
	/*private BigDecimal ocda;
	private BigDecimal ocdc;*/
	private String participantAccNumber;
	//private CRAParticipantAccountType participantType;
	private String paymentCurrency;
	private Date paymentDate;
	private String paymentDateFormatted;
	private Date paymentDueDate;
	private String paymentDueDateFormatted;
	private String paymentIdentifier;
	private PaymentLevel paymentLevel;
	private String paymentLevelString;
	private String paymentSource;
	private PaymentStatusType paymentStatus;
	private String paymentStatusString;
	private String paymentType;
	private BigInteger pieces;
	private String unit;
	//private BigDecimal valuationCharge;
	private BigDecimal vatAmount;
	private BigDecimal weightCharges;
	private PaymentStatusType settlementStatus;
	private String settlementStatusString;
	
	
	
	private Date billingStartDate;
	private Date billingEndDate;
	private String participantName;
	private String  participantAccountTypeString;
	private CRAParticipantAccountType participantAccountType;
	private String awbOrigin;
	private String awbDestination;
	//private String participantType;
	

	private String accountNumber;
	
	
	//Invoice details
	//InvoiceDetails->BillingSchedule
	private Date invoiceBillingEndDate;
	private String invoiceBillingEndDateFormatted;
	private String billingIdentifier;
	private Integer billingPeriod;
	private String billingScheduleType;
	private Date invoiceBillingStartDate;
	private String invoiceBillingStartDateFormatted;
	private String billingYearMonth;
	private ClearingHouseType clearingHouseType;
	private String clearingHouseTypeString;
	//InvoiceDetails->InvoiceSummary
	private BigDecimal netTotalInvoiceDueAirline;
	private BigDecimal noofAWBs;
	private BigDecimal noofCCAs;
	private BigDecimal noofDCMs;
	private BigDecimal totalInvoiceCollectCharges;
	private BigDecimal totalInvoiceCommission;
	private BigDecimal totalInvoiceIncentive;
	private BigDecimal totalInvoiceNetAmountBeforeTax;
	private BigDecimal totalInvoiceNetAmountPayable;
	private BigDecimal totalInvoicePrepaidCharges;
	private BigDecimal totalInvoiceTax;
	private BigDecimal totalInvoiceWeight;
	private BigDecimal totalOtherChargesDueAgent;
	private BigDecimal totalOtherChargesDueCarrier;
	private BigDecimal totalTaxDueAgent;
	private BigDecimal totalTaxDueAirline;
	private BigDecimal totalValuationCharges;
	private BigDecimal cgst;
	private BigDecimal sgst;
	private BigDecimal igst;
	
	private int numberOfRecordsPerPage;
	private int pageNumber;
	private int totalNumberofRecords;
	private boolean download;
	private BigDecimal tdsPercentage;
	private String tds;
	private BigDecimal tdsAmount;
	private BigDecimal totalInvoiceTds;
	
	//Rehan Changes Start
	private BigDecimal keralaFloodCess;
	//Rehan Changes End
	
	private BigDecimal commercialSurcharge;
	
	public BigDecimal getCommercialSurcharge() {
		if(commercialSurcharge==null) {
			commercialSurcharge= new BigDecimal(0);
		}
		return commercialSurcharge;
	}

	public void setCommercialSurcharge(BigDecimal commercialSurcharge) {
		this.commercialSurcharge = commercialSurcharge;
	}

	public boolean isDownload() {
		return download;
	}
	
	public void setDownload(boolean download) {
		this.download = download;
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

	public BigDecimal getCgst() {
		return cgst;
	}

	public void setCgst(BigDecimal cgst) {
		this.cgst = cgst;
	}

	public BigDecimal getSgst() {
		return sgst;
	}

	public void setSgst(BigDecimal sgst) {
		this.sgst = sgst;
	}

	public BigDecimal getIgst() {
		return igst;
	}

	public void setIgst(BigDecimal igst) {
		this.igst = igst;
	}

	//private BigDecimal totalWeightCharges;
	//InvoiceDetails	
	private String billingCarrier;
	private String country;
	//private Date invoiceDate;
	private BigDecimal invoicePaidAmount;
	private PaymentStatusType invoicePaymentStatus;
	private String invoicePaymentStatusString;
	//private InvoiceStatusType invoiceStatus;
	private InwardInvoiceStatus inwardInvoiceStatus;
	private String inwardInvoiceStatusString;

	private String specificAirline;
	
	
	
	//private String station;

	/*private Long oId;
		private String invoiceNumber;
	
	private String awbExecutionFormatedDate;
	private String awbNumber;
	private String currencyCode;
	
	private String paymentDate;
	private String time;

	private String otherChargeDueAgent;
	private String otherChargeDueCarrier;
	private String origin;
	private String destination;
	private String address;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	private String phone;
	private String email;
	
	private String paymentDueDate;
	private Date paymentDue;
	private String paymentIdentifier;
	private String invoiceDate;
	private String paymentStatusType;*/

	private List<String> AccountNumbers;
	/*private String billingParticipantName;
	private String billingParticipantAddress;
	private String billingParticipantCity;
	private String billingParticipantState;*/
	
/*	private String billingParticipantCountry;
	private String billingParticipantPhone;
	private String billingParticipantEmail;*/
	
	
	
	//Existing AWB Object
	/*private String destinationStation;
	private String originStation;
	private Date executionDate; 
	private String productCode;
	private Integer priority;
	private ExportPaymentType exportPaycode;
	private Date creationDate;
	private String creationDateFormatted;
	private String customsStation;
	private String declaredValue;
	private String customsValue;
	private String insuranceValue;
	private String insuranceCode;
	private String originCurrency;
	private String destinationCurrency;
	private WeightUOMType unitOfWeight;
	private Date pricingDate;
	private String pricingDateFormatted;
	private BigDecimal dimensionalWeight;
	private Integer volume;
	private String volumeEvaluationMethodString;
	private VolumeEvaluationMethodType volumeEvaluationMethod;
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
	private BigDecimal actWeightCharge;
	private BigDecimal valuationCharges;
	private BigDecimal actPrepaidCharge;
	private BigDecimal actCollectCharge;
	private BigDecimal codCharges;
	*/
	
	//private BigDecimal noOfAWB;

	
	
	
	

	/**
	 * @return the awbOrigin
	 *//*
	public String getAwbOrigin() {
		return awbOrigin;
	}

	*//**
	 * @param awbOrigin
	 *            the awbOrigin to set
	 *//*
	public void setAwbOrigin(String awbOrigin) {
		this.awbOrigin = awbOrigin;
	}

	*//**
	 * @return the awbDestination
	 *//*
	public String getAwbDestination() {
		return awbDestination;
	}

	*//**
	 * @param awbDestination
	 *            the awbDestination to set
	 *//*
	public void setAwbDestination(String awbDestination) {
		this.awbDestination = awbDestination;
	}

	public Long getoId() {
		return oId;
	}

	public void setoId(Long oId) {
		this.oId = oId;
	}

	


	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	
	
	public String getAwbNumber() {
		return awbNumber;
	}

	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}*/

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setActionType(ActionType find) {
		// TODO Auto-generated method stub

	}

	/*
	

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getPaymentDueDate() {
		String value="";
    	if(this.getPaymentDue()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getPaymentDue(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		paymentDueDate=value.toUpperCase();
    	}
		return paymentDueDate;
	}

	public void setPaymentDueDate(String paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}

	public String getPaymentIdentifier() {
		return paymentIdentifier;
	}

	public void setPaymentIdentifier(String paymentIdentifier) {
		this.paymentIdentifier = paymentIdentifier;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getPaymentStatusType() {
		return paymentStatusType;
	}

	public void setPaymentStatusType(String paymentStatusType) {
		this.paymentStatusType = paymentStatusType;
	}

	public String getAwbExecutionFormatedDate() {
		
		String value="";
    	if(this.getExecutionDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getExecutionDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		awbExecutionFormatedDate=value.toUpperCase();
    	}
      return awbExecutionFormatedDate;
	}

	public void setAwbExecutionFormatedDate(String awbExecutionFormatedDate) {
		this.awbExecutionFormatedDate = awbExecutionFormatedDate;
	}

	*/

	public String getBillingParticipantName() {
		return billingParticipantName;
	}

	public void setBillingParticipantName(String billingParticipantName) {
		this.billingParticipantName = billingParticipantName;
	}

	public String getBillingParticipantAddress() {
		return billingParticipantAddress;
	}

	public void setBillingParticipantAddress(String billingParticipantAddress) {
		this.billingParticipantAddress = billingParticipantAddress;
	}

	public String getBillingParticipantCity() {
		if(billingParticipantCity != null)
		{
			billingParticipantCity = billingParticipantCity.toLowerCase();
			char[] name = billingParticipantCity.toCharArray();
			name[0] = Character.toUpperCase(name[0]);
			for(int i=0;i<name.length;i++)
			{
				if(name[i] == ' ')
				{
					i++;
					name[i]=Character.toUpperCase(name[i]);
				}
			}
			billingParticipantCity = String.valueOf(name);
		}
		return billingParticipantCity;
	}

	public void setBillingParticipantCity(String billingParticipantCity) {
		this.billingParticipantCity = billingParticipantCity;
	}

	public String getBillingParticipantState() {
		return billingParticipantState;
	}

	public void setBillingParticipantState(String billingParticipantState) {
		this.billingParticipantState = billingParticipantState;
	}

	public String getBillingParticipantPostalCode() {
		return billingParticipantPostalCode;
	}

	public void setBillingParticipantPostalCode(String billingParticipantPostalCode) {
		this.billingParticipantPostalCode = billingParticipantPostalCode;
	}

	public String getBillingParticipantCountry() {
		return billingParticipantCountry;
	}

	public void setBillingParticipantCountry(String billingParticipantCountry) {
		this.billingParticipantCountry = billingParticipantCountry;
	}

	public String getBillingParticipantPhone() {
		return billingParticipantPhone;
	}

	public void setBillingParticipantPhone(String billingParticipantPhone) {
		this.billingParticipantPhone = billingParticipantPhone;
	}

	public String getBillingParticipantEmail() {
		return billingParticipantEmail;
	}

	public void setBillingParticipantEmail(String billingParticipantEmail) {
		this.billingParticipantEmail = billingParticipantEmail;
	}

	public String getShipperName() {
		return shipperName;
	}

	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}

	public String getShipperAddress() {
		return shipperAddress;
	}

	public void setShipperAddress(String shipperAddress) {
		this.shipperAddress = shipperAddress;
	}

	public String getShipperPhone() {
		return shipperPhone;
	}

	public void setShipperPhone(String shipperPhone) {
		this.shipperPhone = shipperPhone;
	}

	public String getShipperEmail() {
		return shipperEmail;
	}

	public void setShipperEmail(String shipperEmail) {
		this.shipperEmail = shipperEmail;
	}

	public String getShipperFax() {
		return shipperFax;
	}

	public void setShipperFax(String shipperFax) {
		this.shipperFax = shipperFax;
	}

	public String getShipperStation() {
		return shipperStation;
	}

	public void setShipperStation(String shipperStation) {
		this.shipperStation = shipperStation;
	}

	public String getShipperRemarks() {
		return shipperRemarks;
	}

	public void setShipperRemarks(String shipperRemarks) {
		this.shipperRemarks = shipperRemarks;
	}

	public String getConsigneeName() {
		return consigneeName;
	}

	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}

	public String getConsigneeAddress() {
		return consigneeAddress;
	}

	public void setConsigneeAddress(String consigneeAddress) {
		this.consigneeAddress = consigneeAddress;
	}

	public String getConsigneePhone() {
		return consigneePhone;
	}

	public void setConsigneePhone(String consigneePhone) {
		this.consigneePhone = consigneePhone;
	}

	public String getConsigneeEmail() {
		return consigneeEmail;
	}

	public void setConsigneeEmail(String consigneeEmail) {
		this.consigneeEmail = consigneeEmail;
	}

	public String getConsigneeFax() {
		return consigneeFax;
	}

	public void setConsigneeFax(String consigneeFax) {
		this.consigneeFax = consigneeFax;
	}

	public String getConsigneeStation() {
		return consigneeStation;
	}

	public void setConsigneeStation(String consigneeStation) {
		this.consigneeStation = consigneeStation;
	}

	public String getConsigneeRemarks() {
		return consigneeRemarks;
	}

	public void setConsigneeRemarks(String consigneeRemarks) {
		this.consigneeRemarks = consigneeRemarks;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentAddress() {
		return agentAddress;
	}

	public void setAgentAddress(String agentAddress) {
		this.agentAddress = agentAddress;
	}

	public String getAgentPhone() {
		return agentPhone;
	}

	public void setAgentPhone(String agentPhone) {
		this.agentPhone = agentPhone;
	}

	public String getAgentEmail() {
		return agentEmail;
	}

	public void setAgentEmail(String agentEmail) {
		this.agentEmail = agentEmail;
	}

	public String getAgentFax() {
		return agentFax;
	}

	public void setAgentFax(String agentFax) {
		this.agentFax = agentFax;
	}

	public String getAgentStation() {
		return agentStation;
	}

	public void setAgentStation(String agentStation) {
		this.agentStation = agentStation;
	}

	public String getAgentRemarks() {
		return agentRemarks;
	}

	public void setAgentRemarks(String agentRemarks) {
		this.agentRemarks = agentRemarks;
	}

	public String getBrokerName() {
		return brokerName;
	}

	public void setBrokerName(String brokerName) {
		this.brokerName = brokerName;
	}

	public String getBrokerAddress() {
		return brokerAddress;
	}

	public void setBrokerAddress(String brokerAddress) {
		this.brokerAddress = brokerAddress;
	}

	public String getBrokerPhone() {
		return brokerPhone;
	}

	public void setBrokerPhone(String brokerPhone) {
		this.brokerPhone = brokerPhone;
	}

	public String getBrokerEmail() {
		return brokerEmail;
	}

	public void setBrokerEmail(String brokerEmail) {
		this.brokerEmail = brokerEmail;
	}

	public String getBrokerFax() {
		return brokerFax;
	}

	public void setBrokerFax(String brokerFax) {
		this.brokerFax = brokerFax;
	}

	public String getBrokerRemarks() {
		return brokerRemarks;
	}

	public void setBrokerRemarks(String brokerRemarks) {
		this.brokerRemarks = brokerRemarks;
	}

	public String getDeliveryOperatorName() {
		return deliveryOperatorName;
	}

	public void setDeliveryOperatorName(String deliveryOperatorName) {
		this.deliveryOperatorName = deliveryOperatorName;
	}

	public String getDeliveryOperatorAddress() {
		return deliveryOperatorAddress;
	}

	public void setDeliveryOperatorAddress(String deliveryOperatorAddress) {
		this.deliveryOperatorAddress = deliveryOperatorAddress;
	}

	public String getDeliveryOperatorPhone() {
		return deliveryOperatorPhone;
	}

	public void setDeliveryOperatorPhone(String deliveryOperatorPhone) {
		this.deliveryOperatorPhone = deliveryOperatorPhone;
	}

	public String getDeliveryOperatorEmail() {
		return deliveryOperatorEmail;
	}

	public void setDeliveryOperatorEmail(String deliveryOperatorEmail) {
		this.deliveryOperatorEmail = deliveryOperatorEmail;
	}

	public String getDeliveryOperatorFax() {
		return deliveryOperatorFax;
	}

	public void setDeliveryOperatorFax(String deliveryOperatorFax) {
		this.deliveryOperatorFax = deliveryOperatorFax;
	}

	public String getDeliveryOperatorRemarks() {
		return deliveryOperatorRemarks;
	}

	public void setDeliveryOperatorRemarks(String deliveryOperatorRemarks) {
		this.deliveryOperatorRemarks = deliveryOperatorRemarks;
	}

	public String getCustomsLocationName() {
		return customsLocationName;
	}

	public void setCustomsLocationName(String customsLocationName) {
		this.customsLocationName = customsLocationName;
	}

	public String getCustomsLocationAddress() {
		return customsLocationAddress;
	}

	public void setCustomsLocationAddress(String customsLocationAddress) {
		this.customsLocationAddress = customsLocationAddress;
	}

	public String getCustomsLocationPhone() {
		return customsLocationPhone;
	}

	public void setCustomsLocationPhone(String customsLocationPhone) {
		this.customsLocationPhone = customsLocationPhone;
	}

	public String getCustomsLocationEmail() {
		return customsLocationEmail;
	}

	public void setCustomsLocationEmail(String customsLocationEmail) {
		this.customsLocationEmail = customsLocationEmail;
	}

	public String getCustomsLocationFax() {
		return customsLocationFax;
	}

	public void setCustomsLocationFax(String customsLocationFax) {
		this.customsLocationFax = customsLocationFax;
	}

	public String getCustomsLocationRemarks() {
		return customsLocationRemarks;
	}

	public void setCustomsLocationRemarks(String customsLocationRemarks) {
		this.customsLocationRemarks = customsLocationRemarks;
	}

	public String getForwarderName() {
		return forwarderName;
	}

	public void setForwarderName(String forwarderName) {
		this.forwarderName = forwarderName;
	}

	public String getForwarderAddress() {
		return forwarderAddress;
	}

	public void setForwarderAddress(String forwarderAddress) {
		this.forwarderAddress = forwarderAddress;
	}

	public String getForwarderPhone() {
		return forwarderPhone;
	}

	public void setForwarderPhone(String forwarderPhone) {
		this.forwarderPhone = forwarderPhone;
	}

	public String getForwarderEmail() {
		return forwarderEmail;
	}

	public void setForwarderEmail(String forwarderEmail) {
		this.forwarderEmail = forwarderEmail;
	}

	public String getForwarderFax() {
		return forwarderFax;
	}

	public void setForwarderFax(String forwarderFax) {
		this.forwarderFax = forwarderFax;
	}

	public String getForwarderStation() {
		return forwarderStation;
	}

	public void setForwarderStation(String forwarderStation) {
		this.forwarderStation = forwarderStation;
	}

	public String getForwarderRemarks() {
		return forwarderRemarks;
	}

	public void setForwarderRemarks(String forwarderRemarks) {
		this.forwarderRemarks = forwarderRemarks;
	}

	public String getPickupOperatorName() {
		return pickupOperatorName;
	}

	public void setPickupOperatorName(String pickupOperatorName) {
		this.pickupOperatorName = pickupOperatorName;
	}

	public String getPickupOperatorAddress() {
		return pickupOperatorAddress;
	}

	public void setPickupOperatorAddress(String pickupOperatorAddress) {
		this.pickupOperatorAddress = pickupOperatorAddress;
	}

	public String getPickupOperatorPhone() {
		return pickupOperatorPhone;
	}

	public void setPickupOperatorPhone(String pickupOperatorPhone) {
		this.pickupOperatorPhone = pickupOperatorPhone;
	}

	public String getPickupOperatorEmail() {
		return pickupOperatorEmail;
	}

	public void setPickupOperatorEmail(String pickupOperatorEmail) {
		this.pickupOperatorEmail = pickupOperatorEmail;
	}

	public String getPickupOperatorFax() {
		return pickupOperatorFax;
	}

	public void setPickupOperatorFax(String pickupOperatorFax) {
		this.pickupOperatorFax = pickupOperatorFax;
	}

	public String getPickupOperatorStation() {
		return pickupOperatorStation;
	}

	public void setPickupOperatorStation(String pickupOperatorStation) {
		this.pickupOperatorStation = pickupOperatorStation;
	}

	public String getPickupOperatorRemarks() {
		return pickupOperatorRemarks;
	}

	public void setPickupOperatorRemarks(String pickupOperatorRemarks) {
		this.pickupOperatorRemarks = pickupOperatorRemarks;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getBankPhone() {
		return bankPhone;
	}

	public void setBankPhone(String bankPhone) {
		this.bankPhone = bankPhone;
	}

	public String getBankEmail() {
		return bankEmail;
	}

	public void setBankEmail(String bankEmail) {
		this.bankEmail = bankEmail;
	}

	public String getBankFax() {
		return bankFax;
	}

	public void setBankFax(String bankFax) {
		this.bankFax = bankFax;
	}

	public String getBankStation() {
		return bankStation;
	}

	public void setBankStation(String bankStation) {
		this.bankStation = bankStation;
	}

	public String getBankRemarks() {
		return bankRemarks;
	}

	public void setBankRemarks(String bankRemarks) {
		this.bankRemarks = bankRemarks;
	}

	public String getPickupLocationName() {
		return pickupLocationName;
	}

	public void setPickupLocationName(String pickupLocationName) {
		this.pickupLocationName = pickupLocationName;
	}

	public String getPickupLocationAddress() {
		return pickupLocationAddress;
	}

	public void setPickupLocationAddress(String pickupLocationAddress) {
		this.pickupLocationAddress = pickupLocationAddress;
	}

	public String getPickupLocationPhone() {
		return pickupLocationPhone;
	}

	public void setPickupLocationPhone(String pickupLocationPhone) {
		this.pickupLocationPhone = pickupLocationPhone;
	}

	public String getPickupLocationEmail() {
		return pickupLocationEmail;
	}

	public void setPickupLocationEmail(String pickupLocationEmail) {
		this.pickupLocationEmail = pickupLocationEmail;
	}

	public String getPickupLocationFax() {
		return pickupLocationFax;
	}

	public void setPickupLocationFax(String pickupLocationFax) {
		this.pickupLocationFax = pickupLocationFax;
	}

	public String getPickupLocationStation() {
		return pickupLocationStation;
	}

	public void setPickupLocationStation(String pickupLocationStation) {
		this.pickupLocationStation = pickupLocationStation;
	}

	public String getPickupLocationRemarks() {
		return pickupLocationRemarks;
	}

	public void setPickupLocationRemarks(String pickupLocationRemarks) {
		this.pickupLocationRemarks = pickupLocationRemarks;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getManufacturerAddress() {
		return manufacturerAddress;
	}

	public void setManufacturerAddress(String manufacturerAddress) {
		this.manufacturerAddress = manufacturerAddress;
	}

	public String getManufacturerPhone() {
		return manufacturerPhone;
	}

	public void setManufacturerPhone(String manufacturerPhone) {
		this.manufacturerPhone = manufacturerPhone;
	}

	public String getManufacturerEmail() {
		return manufacturerEmail;
	}

	public void setManufacturerEmail(String manufacturerEmail) {
		this.manufacturerEmail = manufacturerEmail;
	}

	public String getManufacturerFax() {
		return manufacturerFax;
	}

	public void setManufacturerFax(String manufacturerFax) {
		this.manufacturerFax = manufacturerFax;
	}

	public String getManufacturerStation() {
		return manufacturerStation;
	}

	public void setManufacturerStation(String manufacturerStation) {
		this.manufacturerStation = manufacturerStation;
	}

	public String getManufacturerRemarks() {
		return manufacturerRemarks;
	}

	public void setManufacturerRemarks(String manufacturerRemarks) {
		this.manufacturerRemarks = manufacturerRemarks;
	}

	public String getNotifyName() {
		return notifyName;
	}

	public void setNotifyName(String notifyName) {
		this.notifyName = notifyName;
	}

	public String getNotifyAddress() {
		return notifyAddress;
	}

	public void setNotifyAddress(String notifyAddress) {
		this.notifyAddress = notifyAddress;
	}

	public String getNotifyPhone() {
		return notifyPhone;
	}

	public void setNotifyPhone(String notifyPhone) {
		this.notifyPhone = notifyPhone;
	}

	public String getNotifyEmail() {
		return notifyEmail;
	}

	public void setNotifyEmail(String notifyEmail) {
		this.notifyEmail = notifyEmail;
	}

	public String getNotifyFax() {
		return notifyFax;
	}

	public void setNotifyFax(String notifyFax) {
		this.notifyFax = notifyFax;
	}

	public String getNotifyStation() {
		return notifyStation;
	}

	public void setNotifyStation(String notifyStation) {
		this.notifyStation = notifyStation;
	}

	public String getNotifyRemarks() {
		return notifyRemarks;
	}

	public void setNotifyRemarks(String notifyRemarks) {
		this.notifyRemarks = notifyRemarks;
	}

	public String getSurfaceOriginName() {
		return surfaceOriginName;
	}

	public void setSurfaceOriginName(String surfaceOriginName) {
		this.surfaceOriginName = surfaceOriginName;
	}

	public String getSurfaceOriginAddress() {
		return surfaceOriginAddress;
	}

	public void setSurfaceOriginAddress(String surfaceOriginAddress) {
		this.surfaceOriginAddress = surfaceOriginAddress;
	}

	public String getSurfaceOriginPhone() {
		return surfaceOriginPhone;
	}

	public void setSurfaceOriginPhone(String surfaceOriginPhone) {
		this.surfaceOriginPhone = surfaceOriginPhone;
	}

	public String getSurfaceOriginEmail() {
		return surfaceOriginEmail;
	}

	public void setSurfaceOriginEmail(String surfaceOriginEmail) {
		this.surfaceOriginEmail = surfaceOriginEmail;
	}

	public String getSurfaceOriginFax() {
		return surfaceOriginFax;
	}

	public void setSurfaceOriginFax(String surfaceOriginFax) {
		this.surfaceOriginFax = surfaceOriginFax;
	}

	public String getSurfaceOriginStation() {
		return surfaceOriginStation;
	}

	public void setSurfaceOriginStation(String surfaceOriginStation) {
		this.surfaceOriginStation = surfaceOriginStation;
	}

	public String getSurfaceOriginRemarks() {
		return surfaceOriginRemarks;
	}

	public void setSurfaceOriginRemarks(String surfaceOriginRemarks) {
		this.surfaceOriginRemarks = surfaceOriginRemarks;
	}

	public String getBillToShipperName() {
		return billToShipperName;
	}

	public void setBillToShipperName(String billToShipperName) {
		this.billToShipperName = billToShipperName;
	}

	public String getBillToShipperAddress() {
		return billToShipperAddress;
	}

	public void setBillToShipperAddress(String billToShipperAddress) {
		this.billToShipperAddress = billToShipperAddress;
	}

	public String getBillToShipperPhone() {
		return billToShipperPhone;
	}

	public void setBillToShipperPhone(String billToShipperPhone) {
		this.billToShipperPhone = billToShipperPhone;
	}

	public String getBillToShipperEmail() {
		return billToShipperEmail;
	}

	public void setBillToShipperEmail(String billToShipperEmail) {
		this.billToShipperEmail = billToShipperEmail;
	}

	public String getBillToShipperFax() {
		return billToShipperFax;
	}

	public void setBillToShipperFax(String billToShipperFax) {
		this.billToShipperFax = billToShipperFax;
	}

	public String getBillToShipperStation() {
		return billToShipperStation;
	}

	public void setBillToShipperStation(String billToShipperStation) {
		this.billToShipperStation = billToShipperStation;
	}

	public String getBillToShipperRemarks() {
		return billToShipperRemarks;
	}

	public void setBillToShipperRemarks(String billToShipperRemarks) {
		this.billToShipperRemarks = billToShipperRemarks;
	}

	public String getBillToConsigneeName() {
		return billToConsigneeName;
	}

	public void setBillToConsigneeName(String billToConsigneeName) {
		this.billToConsigneeName = billToConsigneeName;
	}

	public String getBillToConsigneeAddress() {
		return billToConsigneeAddress;
	}

	public void setBillToConsigneeAddress(String billToConsigneeAddress) {
		this.billToConsigneeAddress = billToConsigneeAddress;
	}

	public String getBillToConsigneePhone() {
		return billToConsigneePhone;
	}

	public void setBillToConsigneePhone(String billToConsigneePhone) {
		this.billToConsigneePhone = billToConsigneePhone;
	}

	public String getBillToConsigneeEmail() {
		return billToConsigneeEmail;
	}

	public void setBillToConsigneeEmail(String billToConsigneeEmail) {
		this.billToConsigneeEmail = billToConsigneeEmail;
	}

	public String getBillToConsigneeFax() {
		return billToConsigneeFax;
	}

	public void setBillToConsigneeFax(String billToConsigneeFax) {
		this.billToConsigneeFax = billToConsigneeFax;
	}

	public String getBillToConsigneeRemarks() {
		return billToConsigneeRemarks;
	}

	public void setBillToConsigneeRemarks(String billToConsigneeRemarks) {
		this.billToConsigneeRemarks = billToConsigneeRemarks;
	}

	public String getBillToConsigneeStation() {
		return billToConsigneeStation;
	}

	public void setBillToConsigneeStation(String billToConsigneeStation) {
		this.billToConsigneeStation = billToConsigneeStation;
	}

	public String getSurfaceDestinationName() {
		return surfaceDestinationName;
	}

	public void setSurfaceDestinationName(String surfaceDestinationName) {
		this.surfaceDestinationName = surfaceDestinationName;
	}

	public String getSurfaceDestinationAddress() {
		return surfaceDestinationAddress;
	}

	public void setSurfaceDestinationAddress(String surfaceDestinationAddress) {
		this.surfaceDestinationAddress = surfaceDestinationAddress;
	}

	public String getSurfaceDestinationPhone() {
		return surfaceDestinationPhone;
	}

	public void setSurfaceDestinationPhone(String surfaceDestinationPhone) {
		this.surfaceDestinationPhone = surfaceDestinationPhone;
	}

	public String getSurfaceDestinationEmail() {
		return surfaceDestinationEmail;
	}

	public void setSurfaceDestinationEmail(String surfaceDestinationEmail) {
		this.surfaceDestinationEmail = surfaceDestinationEmail;
	}

	public String getSurfaceDestinationFax() {
		return surfaceDestinationFax;
	}

	public void setSurfaceDestinationFax(String surfaceDestinationFax) {
		this.surfaceDestinationFax = surfaceDestinationFax;
	}

	public String getSurfaceDestinationStation() {
		return surfaceDestinationStation;
	}

	public void setSurfaceDestinationStation(String surfaceDestinationStation) {
		this.surfaceDestinationStation = surfaceDestinationStation;
	}

	public String getSurfaceDestinationRemarks() {
		return surfaceDestinationRemarks;
	}

	public void setSurfaceDestinationRemarks(String surfaceDestinationRemarks) {
		this.surfaceDestinationRemarks = surfaceDestinationRemarks;
	}

/*	public String getParticipantType() {
		return participantType;
	}

	public void setParticipantType(String participantType) {
		this.participantType = participantType;
	}

	public CRAParticipantAccountType getParticipantAccountType() {
		return participantAccountType;
	}

	public void setParticipantAccountType(CRAParticipantAccountType participantAccountType) {
		this.participantAccountType = participantAccountType;
	}*/

	public List<String> getAccountNumbers() {
		return AccountNumbers;
	}

	public void setAccountNumbers(List<String> accountNumbers) {
		AccountNumbers = accountNumbers;
	}
	
	
	

	/*
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



	//here
	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public String getOriginStation() {
		return originStation;
	}

	public void setOriginStation(String originStation) {
		this.originStation = originStation;
	}

	public Date getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}

	public Date getPaymentDue() {
		return paymentDue;
	}

	public void setPaymentDue(Date paymentDue) {
		this.paymentDue = paymentDue;
	}



	public String getVolumeEvaluationMethodString() {
		if(this.getVolumeEvaluationMethod() != null)
		{
			volumeEvaluationMethodString = this.getVolumeEvaluationMethod().getUnit();
		}
		return volumeEvaluationMethodString;
	}

	public void setVolumeEvaluationMethodString(String volumeEvaluationMethodString) {
		this.volumeEvaluationMethodString = volumeEvaluationMethodString;
	}

	public String getBookingEventHurdleRateReasonCodeString() {
		if(this.getBookingEventHurdleRateReasonCode() != null)
		{
			bookingEventHurdleRateReasonCodeString = this.getBookingEventHurdleRateReasonCode().getVal();
		}
		return bookingEventHurdleRateReasonCodeString;
	}

	public void setBookingEventHurdleRateReasonCodeString(
			String bookingEventHurdleRateReasonCodeString) {
		this.bookingEventHurdleRateReasonCodeString = bookingEventHurdleRateReasonCodeString;
	}
*/
	

	public String getAgentCity() {
		return agentCity;
	}



	public void setAgentCity(String agentCity) {
		this.agentCity = agentCity;
	}



	public String getAgentCountry() {
		return agentCountry;
	}



	public void setAgentCountry(String agentCountry) {
		this.agentCountry = agentCountry;
	}



	public String getAgentPostCode() {
		return agentPostCode;
	}



	public void setAgentPostCode(String agentPostCode) {
		this.agentPostCode = agentPostCode;
	}



	public String getAgentState() {
		return agentState;
	}



	public void setAgentState(String agentState) {
		this.agentState = agentState;
	}



	public String getConsigneeAccountNumber() {
		return consigneeAccountNumber;
	}



	public void setConsigneeAccountNumber(String consigneeAccountNumber) {
		this.consigneeAccountNumber = consigneeAccountNumber;
	}



	public String getDeliveryOperatorStation() {
		return deliveryOperatorStation;
	}



	public void setDeliveryOperatorStation(String deliveryOperatorStation) {
		this.deliveryOperatorStation = deliveryOperatorStation;
	}



	public String getShipperAccountNumber() {
		return shipperAccountNumber;
	}



	public void setShipperAccountNumber(String shipperAccountNumber) {
		this.shipperAccountNumber = shipperAccountNumber;
	}



	public String getShipperState() {
		return shipperState;
	}



	public void setShipperState(String shipperState) {
		this.shipperState = shipperState;
	}



	public String getShipperPostalcode() {
		return shipperPostalcode;
	}



	public void setShipperPostalcode(String shipperPostalcode) {
		this.shipperPostalcode = shipperPostalcode;
	}



	public String getShipperCountry() {
		return shipperCountry;
	}



	public void setShipperCountry(String shipperCountry) {
		this.shipperCountry = shipperCountry;
	}



	public String getShipperCity() {
		return shipperCity;
	}



	public void setShipperCity(String shipperCity) {
		this.shipperCity = shipperCity;
	}



	public String getBillingAccountNumber1() {
		return billingAccountNumber1;
	}



	public void setBillingAccountNumber1(String billingAccountNumber1) {
		this.billingAccountNumber1 = billingAccountNumber1;
	}



	public String getBillingAccountNumber2() {
		return billingAccountNumber2;
	}



	public void setBillingAccountNumber2(String billingAccountNumber2) {
		this.billingAccountNumber2 = billingAccountNumber2;
	}



	public String getBillingAccountType1() {
		return billingAccountType1;
	}



	public void setBillingAccountType1(String billingAccountType1) {
		this.billingAccountType1 = billingAccountType1;
	}



	public String getBillingAccountType2() {
		return billingAccountType2;
	}



	public void setBillingAccountType2(String billingAccountType2) {
		this.billingAccountType2 = billingAccountType2;
	}



	public String getIataAccountnumber() {
		return iataAccountnumber;
	}



	public void setIataAccountnumber(String iataAccountnumber) {
		this.iataAccountnumber = iataAccountnumber;
	}



	public AccountRegionType getAccountRegion() {
		return accountRegion;
	}



	public void setAccountRegion(AccountRegionType accountRegion) {
		this.accountRegion = accountRegion;
	}



	public String getAreaRepresentative() {
		return areaRepresentative;
	}



	public void setAreaRepresentative(String areaRepresentative) {
		this.areaRepresentative = areaRepresentative;
	}



	public Date getSalesContactDate1() {
		return salesContactDate1;
	}



	public void setSalesContactDate1(Date salesContactDate1) {
		this.salesContactDate1 = salesContactDate1;
	}



	public Date getSalesContactDate2() {
		return salesContactDate2;
	}



	public void setSalesContactDate2(Date salesContactDate2) {
		this.salesContactDate2 = salesContactDate2;
	}



	public Date getSalesContactDate3() {
		return salesContactDate3;
	}



	public void setSalesContactDate3(Date salesContactDate3) {
		this.salesContactDate3 = salesContactDate3;
	}



	public String getSalesContact1() {
		return salesContact1;
	}



	public void setSalesContact1(String salesContact1) {
		this.salesContact1 = salesContact1;
	}



	public String getSalesContact2() {
		return salesContact2;
	}



	public void setSalesContact2(String salesContact2) {
		this.salesContact2 = salesContact2;
	}



	public String getSalesContactRemarks1() {
		return salesContactRemarks1;
	}



	public void setSalesContactRemarks1(String salesContactRemarks1) {
		this.salesContactRemarks1 = salesContactRemarks1;
	}



	public String getSalesContactRemarks2() {
		return salesContactRemarks2;
	}



	public void setSalesContactRemarks2(String salesContactRemarks2) {
		this.salesContactRemarks2 = salesContactRemarks2;
	}



	public String getSalesContactRemarks3() {
		return salesContactRemarks3;
	}



	public void setSalesContactRemarks3(String salesContactRemarks3) {
		this.salesContactRemarks3 = salesContactRemarks3;
	}



	public String getContactInformation() {
		return contactInformation;
	}



	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}



	public String getPrimaryCommodity() {
		return primaryCommodity;
	}



	public void setPrimaryCommodity(String primaryCommodity) {
		this.primaryCommodity = primaryCommodity;
	}



	public String getSeasonalShipping() {
		return seasonalShipping;
	}



	public void setSeasonalShipping(String seasonalShipping) {
		this.seasonalShipping = seasonalShipping;
	}



	public String getSpecialHandling() {
		return specialHandling;
	}



	public void setSpecialHandling(String specialHandling) {
		this.specialHandling = specialHandling;
	}



	public String getAccountExecutive() {
		return accountExecutive;
	}



	public void setAccountExecutive(String accountExecutive) {
		this.accountExecutive = accountExecutive;
	}



	public String getCassNumber() {
		return cassNumber;
	}



	public void setCassNumber(String cassNumber) {
		this.cassNumber = cassNumber;
	}



	public String getAccountingPeriod() {
		return accountingPeriod;
	}



	public void setAccountingPeriod(String accountingPeriod) {
		this.accountingPeriod = accountingPeriod;
	}



	public String getBillingPaymentDiscountDays() {
		return billingPaymentDiscountDays;
	}



	public void setBillingPaymentDiscountDays(String billingPaymentDiscountDays) {
		this.billingPaymentDiscountDays = billingPaymentDiscountDays;
	}



	public String getBillingPaymentDueDays() {
		return billingPaymentDueDays;
	}



	public void setBillingPaymentDueDays(String billingPaymentDueDays) {
		this.billingPaymentDueDays = billingPaymentDueDays;
	}



	public BigDecimal getCommissionPercentage() {
		return commissionPercentage;
	}



	public void setCommissionPercentage(BigDecimal commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}



	public String getCurrency() {
		return currency;
	}



	public void setCurrency(String currency) {
		this.currency = currency;
	}



	public BigDecimal getDiscountPercentage() {
		return discountPercentage;
	}



	public void setDiscountPercentage(BigDecimal discountPercentage) {
		this.discountPercentage = discountPercentage;
	}



	public BigDecimal getIncentivePercentage() {
		return incentivePercentage;
	}



	public void setIncentivePercentage(BigDecimal incentivePercentage) {
		this.incentivePercentage = incentivePercentage;
	}



	public InvoiceFrequencyType getInvoiceFrequency() {
		return invoiceFrequency;
	}



	public void setInvoiceFrequency(InvoiceFrequencyType invoiceFrequency) {
		this.invoiceFrequency = invoiceFrequency;
	}



	public String getInvoiceLanguage() {
		return invoiceLanguage;
	}



	public void setInvoiceLanguage(String invoiceLanguage) {
		this.invoiceLanguage = invoiceLanguage;
	}



	public InvoiceMediaType getInvoiceMedia() {
		return invoiceMedia;
	}



	public void setInvoiceMedia(InvoiceMediaType invoiceMedia) {
		this.invoiceMedia = invoiceMedia;
	}



	public InvoiceSequenceType getInvoiceSequence() {
		return invoiceSequence;
	}



	public void setInvoiceSequence(InvoiceSequenceType invoiceSequence) {
		this.invoiceSequence = invoiceSequence;
	}



	public String getInvoiceSite() {
		return invoiceSite;
	}



	public void setInvoiceSite(String invoiceSite) {
		this.invoiceSite = invoiceSite;
	}



	public String getInvoiceEmail() {
		return invoiceEmail;
	}



	public void setInvoiceEmail(String invoiceEmail) {
		this.invoiceEmail = invoiceEmail;
	}



	public String getMtdSales() {
		return mtdSales;
	}



	public void setMtdSales(String mtdSales) {
		this.mtdSales = mtdSales;
	}



	public String getPrevMTDSales() {
		return prevMTDSales;
	}



	public void setPrevMTDSales(String prevMTDSales) {
		this.prevMTDSales = prevMTDSales;
	}



	public String getPrevYTDSales() {
		return prevYTDSales;
	}



	public void setPrevYTDSales(String prevYTDSales) {
		this.prevYTDSales = prevYTDSales;
	}



	public BigDecimal getServiceFeePercentage() {
		return serviceFeePercentage;
	}



	public void setServiceFeePercentage(BigDecimal serviceFeePercentage) {
		this.serviceFeePercentage = serviceFeePercentage;
	}



	public String getYtdSales() {
		return ytdSales;
	}



	public void setYtdSales(String ytdSales) {
		this.ytdSales = ytdSales;
	}



	public Date getAgingAnalysisDate() {
		return agingAnalysisDate;
	}



	public void setAgingAnalysisDate(Date agingAnalysisDate) {
		this.agingAnalysisDate = agingAnalysisDate;
	}



	public BigDecimal getAmountsUnapplied() {
		return amountsUnapplied;
	}



	public void setAmountsUnapplied(BigDecimal amountsUnapplied) {
		this.amountsUnapplied = amountsUnapplied;
	}



	public BigDecimal getAmountsUnbilled() {
		return amountsUnbilled;
	}



	public void setAmountsUnbilled(BigDecimal amountsUnbilled) {
		this.amountsUnbilled = amountsUnbilled;
	}



	public String getCollectorId() {
		return collectorId;
	}



	public void setCollectorId(String collectorId) {
		this.collectorId = collectorId;
	}



	public BigDecimal getTotalOutstanding() {
		return totalOutstanding;
	}



	public void setTotalOutstanding(BigDecimal totalOutstanding) {
		this.totalOutstanding = totalOutstanding;
	}



	public String getCollectionEmail() {
		return collectionEmail;
	}



	public void setCollectionEmail(String collectionEmail) {
		this.collectionEmail = collectionEmail;
	}



	public Boolean getCollectionMedia() {
		return collectionMedia;
	}



	public void setCollectionMedia(Boolean collectionMedia) {
		this.collectionMedia = collectionMedia;
	}



	public String getPaymentMethod() {
		return paymentMethod;
	}



	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}



	public String getCreditRate() {
		return creditRate;
	}



	public void setCreditRate(String creditRate) {
		this.creditRate = creditRate;
	}



	public Long getCreditLimit() {
		return creditLimit;
	}



	public void setCreditLimit(Long creditLimit) {
		this.creditLimit = creditLimit;
	}



	public BigDecimal getAvailableCredit() {
		return availableCredit;
	}



	public void setAvailableCredit(BigDecimal availableCredit) {
		this.availableCredit = availableCredit;
	}



	public String getCreditCurrencyCode() {
		return creditCurrencyCode;
	}



	public void setCreditCurrencyCode(String creditCurrencyCode) {
		this.creditCurrencyCode = creditCurrencyCode;
	}



	public int getTotalShipments() {
		return totalShipments;
	}



	public void setTotalShipments(int totalShipments) {
		this.totalShipments = totalShipments;
	}



	public int getTotalHouseAWB() {
		return totalHouseAWB;
	}



	public void setTotalHouseAWB(int totalHouseAWB) {
		this.totalHouseAWB = totalHouseAWB;
	}



	public Boolean getGovtTaxExemptIndicator() {
		return govtTaxExemptIndicator;
	}



	public void setGovtTaxExemptIndicator(Boolean govtTaxExemptIndicator) {
		this.govtTaxExemptIndicator = govtTaxExemptIndicator;
	}



	public Boolean getStateTaxExemptIndicator() {
		return stateTaxExemptIndicator;
	}



	public void setStateTaxExemptIndicator(Boolean stateTaxExemptIndicator) {
		this.stateTaxExemptIndicator = stateTaxExemptIndicator;
	}



	public String getAwbNumber() {
		return awbNumber;
	}



	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
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
		if(this.getBookingEventHurdleRateReasonCode() != null)
		{
			bookingEventHurdleRateReasonCodeString = this.getBookingEventHurdleRateReasonCode().getVal();
		}
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



	public String getNetNetIndicator() {
		return netNetIndicator;
	}



	public void setNetNetIndicator(String netNetIndicator) {
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



	public BigDecimal getAmountToBeBilled() {
		return amountToBeBilled;
	}



	public void setAmountToBeBilled(BigDecimal amountToBeBilled) {
		this.amountToBeBilled = amountToBeBilled;
	}



	public String getCurrencyCode() {
		return currencyCode;
	}



	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
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



	public BigDecimal getBillingOutstandingAmountToBeBilled() {
		return billingOutstandingAmountToBeBilled;
	}



	public void setBillingOutstandingAmountToBeBilled(
			BigDecimal billingOutstandingAmountToBeBilled) {
		this.billingOutstandingAmountToBeBilled = billingOutstandingAmountToBeBilled;
	}



	public BigDecimal getDiscount() {
		return discount;
	}



	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}



	public GenIdType getGenIDType() {
		return genIDType;
	}



	public void setGenIDType(GenIdType genIDType) {
		this.genIDType = genIDType;
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



	public BigDecimal getHostOutstandingAmountToBeBilled() {
		return hostOutstandingAmountToBeBilled;
	}



	public void setHostOutstandingAmountToBeBilled(
			BigDecimal hostOutstandingAmountToBeBilled) {
		this.hostOutstandingAmountToBeBilled = hostOutstandingAmountToBeBilled;
	}



	public BigDecimal getOutstandingAmountToBeBilled() {
		return outstandingAmountToBeBilled;
	}



	public void setOutstandingAmountToBeBilled(
			BigDecimal outstandingAmountToBeBilled) {
		this.outstandingAmountToBeBilled = outstandingAmountToBeBilled;
	}



	public InvoiceStatusType getInvoiceStatus() {
		return invoiceStatus;
	}



	public void setInvoiceStatus(InvoiceStatusType invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}



	public Date getInvoiceDate() {
		return invoiceDate;
	}



	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}



	public String getInvoiceNumber() {
		return invoiceNumber;
	}



	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}



	public CRAParticipantAccountType getInvoiceType() {
		return invoiceType;
	}



	public void setInvoiceType(CRAParticipantAccountType invoiceType) {
		this.invoiceType = invoiceType;
	}



	public BigDecimal getNetAmountToBeBilled() {
		return netAmountToBeBilled;
	}



	public void setNetAmountToBeBilled(BigDecimal netAmountToBeBilled) {
		this.netAmountToBeBilled = netAmountToBeBilled;
	}



	public BigDecimal getNetBillingAmountToBeBilled() {
		return netBillingAmountToBeBilled;
	}



	public void setNetBillingAmountToBeBilled(BigDecimal netBillingAmountToBeBilled) {
		this.netBillingAmountToBeBilled = netBillingAmountToBeBilled;
	}



	public BigDecimal getNetHostAmountToBeBilled() {
		return netHostAmountToBeBilled;
	}



	public void setNetHostAmountToBeBilled(BigDecimal netHostAmountToBeBilled) {
		this.netHostAmountToBeBilled = netHostAmountToBeBilled;
	}



	public String getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getParticipantType() {
		return participantType;
	}



	public void setParticipantType(String participantType) {
		this.participantType = participantType;
	}



	public ReceivableStatusType getReceivablePaymentStatusType() {
		return receivablePaymentStatusType;
	}



	public void setReceivablePaymentStatusType(
			ReceivableStatusType receivablePaymentStatusType) {
		this.receivablePaymentStatusType = receivablePaymentStatusType;
	}



	public String getReasonText() {
		return reasonText;
	}



	public void setReasonText(String reasonText) {
		this.reasonText = reasonText;
	}



	public ReceivableType getReceivableType() {
		return receivableType;
	}



	public void setReceivableType(ReceivableType receivableType) {
		this.receivableType = receivableType;
	}



	public RevenueIndicatorType getRevenueIndicatorType() {
		return revenueIndicatorType;
	}



	public void setRevenueIndicatorType(RevenueIndicatorType revenueIndicatorType) {
		this.revenueIndicatorType = revenueIndicatorType;
	}



	public String getStation() {
		return station;
	}



	public void setStation(String station) {
		this.station = station;
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



	/*public String getAirwaybillNumber() {
		return airwaybillNumber;
	}



	public void setAirwaybillNumber(String airwaybillNumber) {
		this.airwaybillNumber = airwaybillNumber;
	}*/



	public Date getAwbDate() {
		return awbDate;
	}



	public void setAwbDate(Date awbDate) {
		this.awbDate = awbDate;
	}



	public String getAwbDestination() {
		return awbDestination;
	}



	public void setAwbDestination(String awbDestination) {
		this.awbDestination = awbDestination;
	}



	public String getAwbOrigin() {
		return awbOrigin;
	}



	public void setAwbOrigin(String awbOrigin) {
		this.awbOrigin = awbOrigin;
	}



	public String getAwbPaymentType() {
		return awbPaymentType;
	}



	public void setAwbPaymentType(String awbPaymentType) {
		this.awbPaymentType = awbPaymentType;
	}



	public BigDecimal getCommissionAmount() {
		return commissionAmount;
	}



	public void setCommissionAmount(BigDecimal commissionAmount) {
		this.commissionAmount = commissionAmount;
	}



	public String getDcmReference() {
		return dcmReference;
	}



	public void setDcmReference(String dcmReference) {
		this.dcmReference = dcmReference;
	}



	public String getFileName() {
		return fileName;
	}



	public void setFileName(String fileName) {
		this.fileName = fileName;
	}



	public Date getFileUploadedDate() {
		return fileUploadedDate;
	}



	public void setFileUploadedDate(Date fileUploadedDate) {
		this.fileUploadedDate = fileUploadedDate;
	}



	public BigDecimal getGrossWeight() {
		return grossWeight;
	}



	public void setGrossWeight(BigDecimal grossWeight) {
		this.grossWeight = grossWeight;
	}



	public BigDecimal getInvoiceAmount() {
		return invoiceAmount;
	}



	public void setInvoiceAmount(BigDecimal invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}



	public BigDecimal getNetAmount() {
		return netAmount;
	}



	public void setNetAmount(BigDecimal netAmount) {
		this.netAmount = netAmount;
	}



	/*public BigDecimal getOcda() {
		return ocda;
	}



	public void setOcda(BigDecimal ocda) {
		this.ocda = ocda;
	}



	public BigDecimal getOcdc() {
		return ocdc;
	}



	public void setOcdc(BigDecimal ocdc) {
		this.ocdc = ocdc;
	}*/



	public String getParticipantAccNumber() {
		return participantAccNumber;
	}



	public void setParticipantAccNumber(String participantAccNumber) {
		this.participantAccNumber = participantAccNumber;
	}



	public String getPaymentCurrency() {
		return paymentCurrency;
	}



	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}



	public Date getPaymentDate() {
		return paymentDate;
	}



	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}



	public Date getPaymentDueDate() {
		return paymentDueDate;
	}



	public void setPaymentDueDate(Date paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}



	public String getPaymentIdentifier() {
		return paymentIdentifier;
	}



	public void setPaymentIdentifier(String paymentIdentifier) {
		this.paymentIdentifier = paymentIdentifier;
	}



	public PaymentLevel getPaymentLevel() {
		return paymentLevel;
	}



	public void setPaymentLevel(PaymentLevel paymentLevel) {
		this.paymentLevel = paymentLevel;
	}



	public String getPaymentSource() {
		return paymentSource;
	}



	public void setPaymentSource(String paymentSource) {
		this.paymentSource = paymentSource;
	}



	public PaymentStatusType getPaymentStatus() {
		return paymentStatus;
	}



	public void setPaymentStatus(PaymentStatusType paymentStatus) {
		this.paymentStatus = paymentStatus;
	}



	public String getPaymentType() {
		return paymentType;
	}



	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}



	public BigInteger getPieces() {
		return pieces;
	}



	public void setPieces(BigInteger pieces) {
		this.pieces = pieces;
	}



	public String getUnit() {
		return unit;
	}



	public void setUnit(String unit) {
		this.unit = unit;
	}



	/*public BigDecimal getValuationCharge() {
		return valuationCharge;
	}



	public void setValuationCharge(BigDecimal valuationCharge) {
		this.valuationCharge = valuationCharge;
	}*/



	public BigDecimal getVatAmount() {
		return vatAmount;
	}



	public void setVatAmount(BigDecimal vatAmount) {
		this.vatAmount = vatAmount;
	}



	public BigDecimal getWeightCharges() {
		return weightCharges;
	}



	public void setWeightCharges(BigDecimal weightCharges) {
		this.weightCharges = weightCharges;
	}



	public PaymentStatusType getSettlementStatus() {
		return settlementStatus;
	}



	public void setSettlementStatus(PaymentStatusType settlementStatus) {
		this.settlementStatus = settlementStatus;
	}

	
	


	public CRAParticipantAccountType getParticipantAccountType() {
		return participantAccountType;
	}



	public void setParticipantAccountType(
			CRAParticipantAccountType participantAccountType) {
		this.participantAccountType = participantAccountType;
	}
	
	public BigDecimal getOtherChargeDueAgent() {
		return otherChargeDueAgent;
	}

	public void setOtherChargeDueAgent(BigDecimal otherChargeDueAgent) {
		this.otherChargeDueAgent = otherChargeDueAgent;
	}

	public BigDecimal getOtherChargeDueCarrier() {
		return otherChargeDueCarrier;
	}

	public void setOtherChargeDueCarrier(BigDecimal otherChargeDueCarrier) {
		this.otherChargeDueCarrier = otherChargeDueCarrier;
	}
	
	public BigDecimal getVat() {
		return vat;
	}

	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}

	public String getCommission() {
		return commission;
	}

	public void setCommission(String commission) {
		this.commission = commission;
	}

	public String getFreightCharge() {
		return freightCharge;
	}

	public void setFreightCharge(String freightCharge) {
		this.freightCharge = freightCharge;
	}

	public String getValuationCharge() {
		return valuationCharge;
	}

	public void setValuationCharge(String valuationCharge) {
		this.valuationCharge = valuationCharge;
	}

	public String getAccountingStatus() {
		return accountingStatus;
	}

	public void setAccountingStatus(String accountingStatus) {
		this.accountingStatus = accountingStatus;
	}

	public String getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public BigDecimal getNetBillableAmount() {
		return netBillableAmount;
	}

	public void setNetBillableAmount(BigDecimal netBillableAmount) {
		this.netBillableAmount = netBillableAmount;
	}

	public Date getBillingStartDate() {
		return billingStartDate;
	}

	public void setBillingStartDate(Date billingStartDate) {
		this.billingStartDate = billingStartDate;
	}

	public Date getBillingEndDate() {
		return billingEndDate;
	}

	public void setBillingEndDate(Date billingEndDate) {
		this.billingEndDate = billingEndDate;
	}
	
	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
	
	
	
	
	
	public Date getInvoiceBillingEndDate() {
		return invoiceBillingEndDate;
	}



	public void setInvoiceBillingEndDate(Date invoiceBillingEndDate) {
		this.invoiceBillingEndDate = invoiceBillingEndDate;
	}



	public String getBillingIdentifier() {
		return billingIdentifier;
	}



	public void setBillingIdentifier(String billingIdentifier) {
		this.billingIdentifier = billingIdentifier;
	}



	public Integer getBillingPeriod() {
		return billingPeriod;
	}



	public void setBillingPeriod(Integer billingPeriod) {
		this.billingPeriod = billingPeriod;
	}



	public String getBillingScheduleType() {
		return billingScheduleType;
	}



	public void setBillingScheduleType(String billingScheduleType) {
		this.billingScheduleType = billingScheduleType;
	}



	public Date getInvoiceBillingStartDate() {
		return invoiceBillingStartDate;
	}



	public void setInvoiceBillingStartDate(Date invoiceBillingStartDate) {
		this.invoiceBillingStartDate = invoiceBillingStartDate;
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



	public BigDecimal getNetTotalInvoiceDueAirline() {
		return netTotalInvoiceDueAirline;
	}



	public void setNetTotalInvoiceDueAirline(BigDecimal netTotalInvoiceDueAirline) {
		this.netTotalInvoiceDueAirline = netTotalInvoiceDueAirline;
	}



	public BigDecimal getNoofAWBs() {
		return noofAWBs;
	}



	public void setNoofAWBs(BigDecimal noofAWBs) {
		this.noofAWBs = noofAWBs;
	}



	public BigDecimal getNoofCCAs() {
		return noofCCAs;
	}



	public void setNoofCCAs(BigDecimal noofCCAs) {
		this.noofCCAs = noofCCAs;
	}



	public BigDecimal getNoofDCMs() {
		return noofDCMs;
	}



	public void setNoofDCMs(BigDecimal noofDCMs) {
		this.noofDCMs = noofDCMs;
	}



	public BigDecimal getTotalInvoiceCollectCharges() {
		return totalInvoiceCollectCharges;
	}



	public void setTotalInvoiceCollectCharges(BigDecimal totalInvoiceCollectCharges) {
		this.totalInvoiceCollectCharges = totalInvoiceCollectCharges;
	}



	public BigDecimal getTotalInvoiceCommission() {
		return totalInvoiceCommission;
	}



	public void setTotalInvoiceCommission(BigDecimal totalInvoiceCommission) {
		this.totalInvoiceCommission = totalInvoiceCommission;
	}



	public BigDecimal getTotalInvoiceIncentive() {
		return totalInvoiceIncentive;
	}



	public void setTotalInvoiceIncentive(BigDecimal totalInvoiceIncentive) {
		this.totalInvoiceIncentive = totalInvoiceIncentive;
	}



	public BigDecimal getTotalInvoiceNetAmountBeforeTax() {
		return totalInvoiceNetAmountBeforeTax;
	}



	public void setTotalInvoiceNetAmountBeforeTax(
			BigDecimal totalInvoiceNetAmountBeforeTax) {
		this.totalInvoiceNetAmountBeforeTax = totalInvoiceNetAmountBeforeTax;
	}



	public BigDecimal getTotalInvoiceNetAmountPayable() {
		return totalInvoiceNetAmountPayable;
	}



	public void setTotalInvoiceNetAmountPayable(
			BigDecimal totalInvoiceNetAmountPayable) {
		this.totalInvoiceNetAmountPayable = totalInvoiceNetAmountPayable;
	}



	public BigDecimal getTotalInvoicePrepaidCharges() {
		return totalInvoicePrepaidCharges;
	}



	public void setTotalInvoicePrepaidCharges(BigDecimal totalInvoicePrepaidCharges) {
		this.totalInvoicePrepaidCharges = totalInvoicePrepaidCharges;
	}



	public BigDecimal getTotalInvoiceTax() {
		return totalInvoiceTax;
	}



	public void setTotalInvoiceTax(BigDecimal totalInvoiceTax) {
		this.totalInvoiceTax = totalInvoiceTax;
	}



	public BigDecimal getTotalInvoiceWeight() {
		return totalInvoiceWeight;
	}



	public void setTotalInvoiceWeight(BigDecimal totalInvoiceWeight) {
		this.totalInvoiceWeight = totalInvoiceWeight;
	}



	public BigDecimal getTotalOtherChargesDueAgent() {
		return totalOtherChargesDueAgent;
	}



	public void setTotalOtherChargesDueAgent(BigDecimal totalOtherChargesDueAgent) {
		this.totalOtherChargesDueAgent = totalOtherChargesDueAgent;
	}



	public BigDecimal getTotalOtherChargesDueCarrier() {
		return totalOtherChargesDueCarrier;
	}



	public void setTotalOtherChargesDueCarrier(
			BigDecimal totalOtherChargesDueCarrier) {
		this.totalOtherChargesDueCarrier = totalOtherChargesDueCarrier;
	}



	public BigDecimal getTotalTaxDueAgent() {
		return totalTaxDueAgent;
	}



	public void setTotalTaxDueAgent(BigDecimal totalTaxDueAgent) {
		this.totalTaxDueAgent = totalTaxDueAgent;
	}



	public BigDecimal getTotalTaxDueAirline() {
		return totalTaxDueAirline;
	}



	public void setTotalTaxDueAirline(BigDecimal totalTaxDueAirline) {
		this.totalTaxDueAirline = totalTaxDueAirline;
	}



	public BigDecimal getTotalValuationCharges() {
		return totalValuationCharges;
	}



	public void setTotalValuationCharges(BigDecimal totalValuationCharges) {
		this.totalValuationCharges = totalValuationCharges;
	}



	public String getBillingCarrier() {
		return billingCarrier;
	}



	public void setBillingCarrier(String billingCarrier) {
		this.billingCarrier = billingCarrier;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public BigDecimal getInvoicePaidAmount() {
		return invoicePaidAmount;
	}



	public void setInvoicePaidAmount(BigDecimal invoicePaidAmount) {
		this.invoicePaidAmount = invoicePaidAmount;
	}



	public PaymentStatusType getInvoicePaymentStatus() {
		return invoicePaymentStatus;
	}



	public void setInvoicePaymentStatus(PaymentStatusType invoicePaymentStatus) {
		this.invoicePaymentStatus = invoicePaymentStatus;
	}



	public InwardInvoiceStatus getInwardInvoiceStatus() {
		return inwardInvoiceStatus;
	}



	public void setInwardInvoiceStatus(InwardInvoiceStatus inwardInvoiceStatus) {
		this.inwardInvoiceStatus = inwardInvoiceStatus;
	}



	public void setInvoiceSequenceString(String invoiceSequenceString) {
		this.invoiceSequenceString = invoiceSequenceString;
	}

	public BigDecimal getTdsPercentage() {
		return tdsPercentage;
	}
	
	public void setTdsPercentage(BigDecimal tdsPercentage) {
		this.tdsPercentage = tdsPercentage;
	}
	
	public String getTds() {
		if(tds==null) {
			tds= new String("0");
		}
		return tds;
	}
	
	public void setTds(String tds) {
		this.tds = tds;
	}
	
	public BigDecimal getTdsAmount() {
		if(tdsAmount==null) {
			tdsAmount= new BigDecimal(0);
		}
		return tdsAmount;
	}
	
	public void setTdsAmount(BigDecimal tdsAmount) {
		this.tdsAmount = tdsAmount;
	}
	
	public BigDecimal getTotalInvoiceTds() {
		if(totalInvoiceTds==null) {
			totalInvoiceTds= new BigDecimal(0);
		}
		return totalInvoiceTds;
	}
	
	public void setTotalInvoiceTds(BigDecimal totalInvoiceTds) {
		this.totalInvoiceTds = totalInvoiceTds;
	}
	
	//Rehan Changes Start
	
	public BigDecimal getKeralaFloodCess() {
		if(keralaFloodCess==null) {
			keralaFloodCess= new BigDecimal(0);
		}
		return keralaFloodCess;
	}

	public void setKeralaFloodCess(BigDecimal keralaFloodCess) {
		this.keralaFloodCess = keralaFloodCess;
	}
	
	//Rehan Changes End
	

	public String getParticipantAccountTypeString() {
		if(this.getParticipantAccountType() != null)
		{
			participantAccountTypeString = this.getParticipantAccountType().getStringValue();
		}
		return participantAccountTypeString;
	}

	public void setParticipantAccountTypeString(
			String participantAccountTypeString) {
		this.participantAccountTypeString = participantAccountTypeString;
	}
	
	

	
/*	public String getAirwayBillDestination() {
		return airwayBillDestination;
	}



	public void setAirwayBillDestination(String airwayBillDestination) {
		this.airwayBillDestination = airwayBillDestination;
	}



	public String getAirwayBillOrigin() {
		return airwayBillOrigin;
	}



	public void setAirwayBillOrigin(String airwayBillOrigin) {
		this.airwayBillOrigin = airwayBillOrigin;
	}*/



	public String getSalesContactDate1Formatted() {
		String value="";
    	if(this.getSalesContactDate1()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getSalesContactDate1(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		salesContactDate1Formatted=value.toUpperCase();
    	}
		return salesContactDate1Formatted;
	}



	public void setSalesContactDate1Formatted(String salesContactDate1Formatted) {
		this.salesContactDate1Formatted = salesContactDate1Formatted;
	}



	public String getSalesContactDate2Formatted() {
		String value="";
    	if(this.getSalesContactDate2()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getSalesContactDate2(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		salesContactDate2Formatted=value.toUpperCase();
    	}
		return salesContactDate2Formatted;
	}



	public void setSalesContactDate2Formatted(String salesContactDate2Formatted) {
		this.salesContactDate2Formatted = salesContactDate2Formatted;
	}



	public String getSalesContactDate3Formatted() {
		String value="";
    	if(this.getSalesContactDate3()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getSalesContactDate3(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		salesContactDate3Formatted=value.toUpperCase();
    	}
		return salesContactDate3Formatted;
	}



	public void setSalesContactDate3Formatted(String salesContactDate3Formatted) {
		this.salesContactDate3Formatted = salesContactDate3Formatted;
	}



	public String getAgingAnalysisDateFormatted() {
		String value="";
    	if(this.getAgingAnalysisDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getAgingAnalysisDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		agingAnalysisDateFormatted=value.toUpperCase();
    	}
		return agingAnalysisDateFormatted;
	}



	public void setAgingAnalysisDateFormatted(String agingAnalysisDateFormatted) {
		this.agingAnalysisDateFormatted = agingAnalysisDateFormatted;
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



	public String getAwbDateFormatted() {
		String value="";
    	if(this.getAwbDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getAwbDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		awbDateFormatted=value.toUpperCase();
    	}
		return awbDateFormatted;
	}



	public void setAwbDateFormatted(String awbDateFormatted) {
		this.awbDateFormatted = awbDateFormatted;
	}



	public String getFileUploadedDateFormatted() {
		String value="";
    	if(this.getFileUploadedDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getFileUploadedDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		fileUploadedDateFormatted=value.toUpperCase();
    	}
		return fileUploadedDateFormatted;
	}



	public void setFileUploadedDateFormatted(String fileUploadedDateFormatted) {
		this.fileUploadedDateFormatted = fileUploadedDateFormatted;
	}



	public String getPaymentDateFormatted() {
		String value="";
    	if(this.getPaymentDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getPaymentDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		paymentDateFormatted=value.toUpperCase();
    	}
		return paymentDateFormatted;
	}



	public void setPaymentDateFormatted(String paymentDateFormatted) {
		this.paymentDateFormatted = paymentDateFormatted;
	}



	public String getPaymentDueDateFormatted() {
		String value="";
    	if(this.getPaymentDueDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getPaymentDueDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		paymentDueDateFormatted=value.toUpperCase();
    	}
		return paymentDueDateFormatted;
	}



	public void setPaymentDueDateFormatted(String paymentDueDateFormatted) {
		this.paymentDueDateFormatted = paymentDueDateFormatted;
	}
	
	
	
//Getters Setters for Strings of enum
	
	
	
	public String getInvoiceBillingEndDateFormatted() {
		String value="";
    	if(this.getInvoiceBillingEndDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getInvoiceBillingEndDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		invoiceBillingEndDateFormatted=value.toUpperCase();
    	}
		
		return invoiceBillingEndDateFormatted;
	}



	public void setInvoiceBillingEndDateFormatted(
			String invoiceBillingEndDateFormatted) {
		this.invoiceBillingEndDateFormatted = invoiceBillingEndDateFormatted;
	}



	public String getInvoiceBillingStartDateFormatted() {
		String value="";
    	if(this.getInvoiceBillingStartDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getInvoiceBillingStartDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		invoiceBillingStartDateFormatted=value.toUpperCase();
    	}
	
		return invoiceBillingStartDateFormatted;
	}



	public void setInvoiceBillingStartDateFormatted(
			String invoiceBillingStartDateFormatted) {
		this.invoiceBillingStartDateFormatted = invoiceBillingStartDateFormatted;
	}



	public String getAccountRegionString() {
		if(this.getAccountRegion() != null)
		{
			accountRegionString = this.getAccountRegion().getVal();
		}
		
		return accountRegionString;
	}



	public void setAccountRegionString(String accountRegionString) {
		this.accountRegionString = accountRegionString;
	}



	public String getInvoiceFrequencyString() {
		if(this.getInvoiceFrequency() != null)
		{
			invoiceFrequencyString = this.getInvoiceFrequency().getName();
		}
		
		return invoiceFrequencyString;
	}



	public void setInvoiceFrequencyString(String invoiceFrequencyString) {
		this.invoiceFrequencyString = invoiceFrequencyString;
	}



	public String getInvoiceMediaString() {
		if(this.getInvoiceMedia() != null)
		{
			invoiceMediaString = this.getInvoiceMedia().getInvoiceMedia();
		}
		return invoiceMediaString;
	}



	public void setInvoiceMediaString(String invoiceMediaString) {
		this.invoiceMediaString = invoiceMediaString;
	}



	public String getInvoiceSequenceString() {
		if(this.getInvoiceSequence() != null)
		{
			invoiceSequenceString = this.getInvoiceSequence().getStringValue();
		}
		return invoiceSequenceString;
	}



	public void setInvoiceSequencestring(String invoiceSequenceString) {
		this.invoiceSequenceString = invoiceSequenceString;
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
			unitOfWeightString = this.getUnitOfWeight().name();
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



	public String getGenIDTypeString() {
		if(this.getGenIDType() != null)
		{
			genIDTypeString = this.getGenIDType().getStatus();
		}
		return genIDTypeString;
	}



	public void setGenIDTypeString(String genIDTypeString) {
		this.genIDTypeString = genIDTypeString;
	}



	public String getInvoiceStatusString() {
		if(this.getInvoiceStatus() != null)
		{
			invoiceStatusString = this.getInvoiceStatus().getType();
		}
		return invoiceStatusString;
	}



	public void setInvoiceStatusString(String invoiceStatusString) {
		this.invoiceStatusString = invoiceStatusString;
	}



	public String getInvoiceTypeString() {
		if(this.getInvoiceType() != null)
		{
			invoiceTypeString = this.getInvoiceType().getStringValue();
		}
		return invoiceTypeString;
	}



	public void setInvoiceTypeString(String invoiceTypeString) {
		this.invoiceTypeString = invoiceTypeString;
	}



	public String getReceivablePaymentStatusTypeString() {
		if(this.getReceivablePaymentStatusType() != null)
		{
			receivablePaymentStatusTypeString = this.getReceivablePaymentStatusType().getVal();
		}
		return receivablePaymentStatusTypeString;
	}



	public void setReceivablePaymentStatusTypeString(
			String receivablePaymentStatusTypeString) {
		this.receivablePaymentStatusTypeString = receivablePaymentStatusTypeString;
	}



	public String getReceivableTypeString() {
		if(this.getReceivableType() != null)
		{
			receivableTypeString = this.getReceivableType().getVal();
		}
		return receivableTypeString;
	}



	public void setReceivableTypeString(String receivableTypeString) {
		this.receivableTypeString = receivableTypeString;
	}



	public String getRevenueIndicatorTypeString() {
		if(this.getRevenueIndicatorType() != null)
		{
			revenueIndicatorTypeString = this.getRevenueIndicatorType().getRevenueIndicatorType();
		}
		return revenueIndicatorTypeString;
	}



	public void setRevenueIndicatorTypeString(String revenueIndicatorTypeString) {
		this.revenueIndicatorTypeString = revenueIndicatorTypeString;
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



	public String getPaymentLevelString() {
		if(this.getPaymentLevel() != null)
		{
			paymentLevelString = this.getPaymentLevel().getStringValue();
		}
		return paymentLevelString;
	}



	public void setPaymentLevelString(String paymentLevelString) {
		this.paymentLevelString = paymentLevelString;
	}



	public String getPaymentStatusString() {
		if(this.getPaymentStatus() != null)
		{
			paymentStatusString = this.getPaymentStatus().getVal();
		}
		return paymentStatusString;
	}



	public void setPaymentStatusString(String paymentStatusString) {
		this.paymentStatusString = paymentStatusString;
	}



	public String getSettlementStatusString() {
		if(this.getSettlementStatus() != null)
		{
			settlementStatusString = this.getSettlementStatus().getVal();
		}
		return settlementStatusString;
	}



	public void setSettlementStatusString(String settlementStatusString) {
		this.settlementStatusString = settlementStatusString;
	}
	
	public String getVolumeEvaluationMethodString() {
		if(this.getVolumeEvaluationMethod() != null)
		{
			volumeEvaluationMethodString = this.getVolumeEvaluationMethod().getUnit();
		}
		return volumeEvaluationMethodString;
	}



	public void setVolumeEvaluationMethodString(String volumeEvaluationMethodString) {
		this.volumeEvaluationMethodString = volumeEvaluationMethodString;
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



	public String getInvoicePaymentStatusString() {
		if(this.getInvoicePaymentStatus() != null)
		{
			invoicePaymentStatusString = this.getInvoicePaymentStatus().getVal();
		}
		return invoicePaymentStatusString;
	}



	public void setInvoicePaymentStatusString(String invoicePaymentStatusString) {
		this.invoicePaymentStatusString = invoicePaymentStatusString;
	}



	public String getInwardInvoiceStatusString() {
		if(this.getInwardInvoiceStatus() != null)
		{
			inwardInvoiceStatusString = this.getInwardInvoiceStatus().getStringValue();
		}
		return inwardInvoiceStatusString;
	}



	public void setInwardInvoiceStatusString(String inwardInvoiceStatusString) {
		this.inwardInvoiceStatusString = inwardInvoiceStatusString;
	}



	public static String getEmptyString() {
		return EMPTY_STRING;
	}



	public String getBillToAccountNumber() {
		return billToAccountNumber;
	}



	public void setBillToAccountNumber(String billToAccountNumber) {
		this.billToAccountNumber = billToAccountNumber;
	}
	
	

	


	/**
	 * @return the specificAirline
	 */
	public String getSpecificAirline() {
		return specificAirline;
	}



	/**
	 * @param specificAirline the specificAirline to set
	 */
	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}



	/*public BigDecimal getNoOfAWB() {
		return noOfAWB;
	}

	public void setNoOfAWB(BigDecimal noOfAWB) {
		this.k = noOfAWB;
	}
*/
	public String toString() {
        // SuppressOn:MagicNumber
        final StringBuffer csvString = new StringBuffer();
        
       
        if(this.getParticipantAccountType() != null)
        {
        	csvString.append(this.prefixSuffixByQuotes(this.getParticipantAccountType().getStringValue()));
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
        
        if(this.getAwbOrigin() != null)
		{
        	csvString.append(this.prefixSuffixByQuotes(this.getAwbOrigin()));
		}
		else
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				
        if(this.getAwbDestination() != null)
		{
        	csvString.append(this.prefixSuffixByQuotes(this.getAwbDestination()));
		}
		else
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		
		/*if(this.getParticipantName()!= null)
		{
			csvString.append(this.prefixSuffixByQuotes(this.getParticipantName()));
		}
		else
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));*/
		
		if(this.getStation()!= null)
		{
			csvString.append(this.prefixSuffixByQuotes(this.getStation()));
		}
		else
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		
		
		if(this.getAccountNumber()!= null)
		{
			csvString.append(this.prefixSuffixByQuotes(this.getAccountNumber()));
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

	public String getPurgeIndicatorString() {
		return purgeIndicatorString;
	}

	public void setPurgeIndicatorString(String purgeIndicatorString) {
		this.purgeIndicatorString = purgeIndicatorString;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	

}