package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;
import com.unisys.trans.logistics.lms.accounting.dto.constants.AgreementType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.AuditStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ExportPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.FWBType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.GenIdType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.HurdleRateReasonType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ImportPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InternationalAWBType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.LogicalOperationType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.OtherChargeCodeDecideType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PadType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ProrationType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ProvisoType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RateBasedOnType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RateGenerationType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ShipmentStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.SpecialPurgeType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.StatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.UnitType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.VolumeEvaluationMethodType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.WeightType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.domain.DateRange;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

public class SPAPerformanceDto extends PersistenceObjectDto{

	/**
	 * 
	 */
	private static final String EMPTY_STRING = "";
	private static final long serialVersionUID = 1L;

	//private String carrierCode;
	private String currency;
	private String prorateMethodString;
	private ProrationType prorateMethod;
	//private String prorateIdentifier;
	
	//private String segmentOrigin;

	//private String segmentDestination;
	
	/*private BigDecimal carrierRevenue;
	
	private BigDecimal segmentYield;
	
	private BigDecimal segmentMileage;
	
	private BigDecimal segmentMileagePercent;
	
	private Boolean multipleSPAIndicator;*/
	
	private Date spaEffectiveDate;
	
	//private String awbNumber;
	
	//private String flightNumber;
	private String flightNumbers;
	private String productCodes;
	private String otherChargeCodes;
	//private String commodity;
	//private String specialHandlingCodes;
	//private String uldType;
	
	/*private BigDecimal chargeableWeight;
	private BigDecimal grossWeight;
	private BigDecimal hostTotalOtherCharges;
	private BigDecimal hostTotalOtherChargesDueAgent;
	 private BigDecimal hostTotalOtherChargesDueCarrier;
	 private Integer segPieces;*/
	
	/*private String productCode;
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
	private BigDecimal codCharges;*/
	private String accountingStatus;

	private String awbOrigin;
	private String awbDestination;
	/*private Date executionDate;
	private String executionDateFormatted;*/
	
	//private String issuingACN;
	private String toCarrier;
	//private boolean biDirectional;
	private String aggrcurrencyCode;
	private Date effectiveDate;
	private String effectiveDateFormatted;
	private Date expirationDate;
	private String expirationDateFormatted;
	/*private BigDecimal maximumWeight;
	private BigDecimal minimumWeight;
	private BigDecimal rate;
	private RateBasedOnType rateBasedOn;
	private String weightTypeString;
	private WeightType weightType;*/
	private WeightUOMType aggrweightUnit;
	/*private BigDecimal overPivotRate;
	private BigDecimal pivotWeight;
	private BigDecimal commissionPercent;
	private Long prorateId;
	private LogicalOperationType productRule;
	private LogicalOperationType commodityRule;*/
	
	
	//AWB starts here
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
	private ShipmentStatusType shipmentStatus;
	private String shipmentStatusString;
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

	//AWB <- AWB Revenue
	private BigDecimal airWaybillEventGrossRevenue;
	private BigDecimal airWaybillEventHostRevenue;
	private BigDecimal airwaybillNetAmount;
	private BigDecimal airwaybillOutstandingAmount;
	private BigDecimal hostNetYield;
	private BigDecimal hostNetRevenue;
	private BigDecimal totalGrossWeight;
	
	//Proration Segment
	private BigDecimal carrierRevenue;
	private BigDecimal prorationCurrencyCarrierRevenue;
	private BigDecimal chargeableWeight;
	private String prorationDestinationCarrier;
	private String prorationDestinationStation;
	private BigDecimal prorationGrossWeight;  
	private String prorateIdentifier;
	private BigDecimal segmentMileage;
	private BigDecimal segmentMileagePercent;
	private Boolean multipleSPAIndicator;
	private String prorationOriginStation;
	private ProrationType prorationMethod;
	private String prorationMethodString;
	private BigDecimal segmentYield;
	private BigDecimal segmentProrationCurencyYield;
	private Integer segPieces;
	private BigDecimal hostTotalOtherChargesDueCarrier;
	private BigDecimal hostTotalOtherChargesDueAgent;
	private BigDecimal billingTotalOtherChargesDueCarrier;
	private BigDecimal billingTotalOtherChargesDueAgent;
	private BigDecimal hostTotalOtherCharges;
	private BigDecimal billingTotalOtherCharges;
	
	//Online Proration
	private BigDecimal onlineCarrierRevenue;
	private BigDecimal carrierRevenueProrCurrency;
	private BigDecimal onlineChargeableWeight;
	private String flightNumber;
	private Date flightDate;
	private String flightDateFormatted;
	private BigDecimal onlineGrossWeight;
	private ProrationType onlineProrationReasonCode;
	private String onlineProrationReasonCodeString;
	private BigDecimal otherChargeDueAgent;
	private BigDecimal otherChargeDueCarrier;
	private BigDecimal otherChargeDueAgentProrCurrency;
	private BigDecimal otherChargeDueCarrierProrCurrency;
	private BigDecimal percentageOfSegmentMileage;
	private Integer pieces;
	private BigDecimal proratedChargeableWeight;
	private String onlineSegmentOrigin;
	private String onlineSegmentDestination;
	private BigDecimal onlineSegmentMileage;
	private BigDecimal onlineSegmentYield;
	private BigDecimal segmentYieldProrcurrency;
	private BigDecimal valuationCharge;
	private BigDecimal vat;
	private BigDecimal totalAirWaybillMileage; //Assemble from AWB revenue
	private BigDecimal totalHostMileage;
	private BigDecimal totalOALMileage;
	
	
	/*private BigDecimal commission;
	private BigDecimal freightCharges;*/
	
	
	//Run Time Parameters
	private String currencyCode;
	private String carrierCode;
	//Online proration ends Here
	
	//Interline Agreements
	private String agreementIdentifier;
	private AgreementType agreementType;
	private String agreementTypeString;
	private String airWayBillDestination;
	private String airWayBillOrigin;
	private boolean allDestinationInd;
	private boolean allOriginInd;
	private String carrier;
	private String issuingACN;
	private boolean biDirectional;
	private BigDecimal commissionPercent;
	private String commodity;
	private LogicalOperationType commodityRule;
	private String commodityRuleString;
	private String agreementCurrencyCode;
	private Date agreementEffectiveDate;
	private String agreementEffectiveDateFormatted;
	private Date agreementExpirationDate;
	private String agreementExpirationDateFormatted;
	private boolean expirationInd;
	private boolean firstCarrierIndicator;
	private String agreementFlightNumber;
	private LogicalOperationType flightNumberRule;
	private String flightNumberRuleString;
	private boolean intermediateCarrierIndicator;
	private boolean lastCarrierIndicator;
	private BigDecimal maximumAmount;
	private BigDecimal maximumPercent;
	private BigDecimal maximumWeight;
	private BigDecimal minimumAmount;
	private BigDecimal minimumPercent;
	private BigDecimal minimumWeight;
	private String otherChargeCode;
	private OtherChargeCodeDecideType otherChargeRule;
	private String otherChargeRuleString;
	private BigDecimal overPivotRate;
	private BigDecimal pivotWeight;
	private String agreementProductCode;
	private LogicalOperationType productRule;
	private String productRuleString;
	private Long prorateId;
	private String provisoClass;
	private ProvisoType provisotype;
	private String provisotypeString;
	private BigDecimal rate;
	private RateBasedOnType rateBasedOn;
	private String rateBasedOnString;
	private String segmentDestination;
	private String segmentOrigin;
	private String specialHandlingCodes;
	private LogicalOperationType splCodeRule;
	private String splCodeRuleString;
	private StatusType status;
	private String statusString;
	private boolean tc1Indicator;
	private boolean tc2Indicator;
	private boolean tc3Indicator;
	private boolean transatlanticIndicator;
	private boolean transpacificIndicator;
	private String agreementUldType;
	private LogicalOperationType uldTypeRule;
	private String uldTypeRuleString;
	private WeightType weightType;
	private String weightTypeString;
	private WeightUOMType agreementWeightUnit;
	private String agreementWeightUnitString;
	private String associatedOffice;
	private String associatedStation;
	private Date createdOn;
	private String createdOnFormatted;
	private String userIdentifier;
	
	
	//Setters and Getters for AWB
		
	public String getCarrierCode() {
		return carrierCode;
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
		if(exchangeRate != null)
			exchangeRate = exchangeRate.setScale(2, BigDecimal.ROUND_HALF_UP);
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

	public String getPadTypeString() {
		return padType;
	}

	public void setPadTypeString(String padTypeString) {
		this.padTypeString = padTypeString;
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

	public ShipmentStatusType getShipmentStatus() {
		return shipmentStatus;
	}

	public void setShipmentStatus(ShipmentStatusType shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}

	public String getShipmentStatusString() {
		if(this.getShipmentStatus() != null)
		{
			shipmentStatusString = this.getShipmentStatus().getStatus();
		}
		return shipmentStatusString;
	}

	public void setShipmentStatusString(String shipmentStatusString) {
		this.shipmentStatusString = shipmentStatusString;
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
			unitOfWeightString = this.getUnitOfWeight().getWeightUnit();
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

	public Boolean getNetNetIndicator() {
		return netNetIndicator;
	}

	public void setNetNetIndicator(Boolean netNetIndicator) {
		this.netNetIndicator = netNetIndicator;
	}

	public BigDecimal getRateCharge() {
		if(rateCharge != null)
			rateCharge = rateCharge.setScale(2, BigDecimal.ROUND_HALF_UP);
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
		if(this.getWeightUnit() != null)
		{
			weightUnitString = this.getWeightUnit().getWeightUnit();
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
		if(totalGrossWeight != null)
			totalGrossWeight = totalGrossWeight.setScale(2, BigDecimal.ROUND_HALF_UP);
		return totalGrossWeight;
	}

	public void setTotalGrossWeight(BigDecimal totalGrossWeight) {
		this.totalGrossWeight = totalGrossWeight;
	}
	
	//Getters and Setters for Proration Segment
	

	public BigDecimal getProrationCurrencyCarrierRevenue() {
		return prorationCurrencyCarrierRevenue;
	}

	public void setProrationCurrencyCarrierRevenue(
			BigDecimal prorationCurrencyCarrierRevenue) {
		this.prorationCurrencyCarrierRevenue = prorationCurrencyCarrierRevenue;
	}

	public ProrationType getProrationMethod() {
		return prorationMethod;
	}

	public String getProrationMethodString() {
		if(this.prorationMethod != null)
		{
			prorationMethodString = this.getProrationMethod().getVal();
		}
		return prorationMethodString;
	}

	public void setProrationMethodString(String prorationMethodString) {
		this.prorationMethodString = prorationMethodString;
	}

	public void setProrationMethod(ProrationType prorationMethod) {
		this.prorationMethod = prorationMethod;
	}

	public BigDecimal getSegmentProrationCurencyYield() {
		return segmentProrationCurencyYield;
	}

	public void setSegmentProrationCurencyYield(
			BigDecimal segmentProrationCurencyYield) {
		this.segmentProrationCurencyYield = segmentProrationCurencyYield;
	}

	public BigDecimal getBillingTotalOtherChargesDueCarrier() {
		return billingTotalOtherChargesDueCarrier;
	}

	public void setBillingTotalOtherChargesDueCarrier(
			BigDecimal billingTotalOtherChargesDueCarrier) {
		this.billingTotalOtherChargesDueCarrier = billingTotalOtherChargesDueCarrier;
	}

	public BigDecimal getBillingTotalOtherChargesDueAgent() {
		return billingTotalOtherChargesDueAgent;
	}

	public void setBillingTotalOtherChargesDueAgent(
			BigDecimal billingTotalOtherChargesDueAgent) {
		this.billingTotalOtherChargesDueAgent = billingTotalOtherChargesDueAgent;
	}

	public BigDecimal getBillingTotalOtherCharges() {
		return billingTotalOtherCharges;
	}

	public void setBillingTotalOtherCharges(BigDecimal billingTotalOtherCharges) {
		this.billingTotalOtherCharges = billingTotalOtherCharges;
	}

	public String getProrationDestinationCarrier() {
		return prorationDestinationCarrier;
	}

	public void setProrationDestinationCarrier(String prorationDestinationCarrier) {
		this.prorationDestinationCarrier = prorationDestinationCarrier;
	}

	public String getProrationDestinationStation() {
		return prorationDestinationStation;
	}

	public void setProrationDestinationStation(String prorationDestinationStation) {
		this.prorationDestinationStation = prorationDestinationStation;
	}

	public BigDecimal getProrationGrossWeight() {
		if(prorationGrossWeight != null)
			prorationGrossWeight = prorationGrossWeight.setScale(2, BigDecimal.ROUND_HALF_UP);
		return prorationGrossWeight;
	}

	public void setProrationGrossWeight(BigDecimal prorationGrossWeight) {
		this.prorationGrossWeight = prorationGrossWeight;
	}

	public String getProrationOriginStation() {
		return prorationOriginStation;
	}

	public void setProrationOriginStation(String prorationOriginStation) {
		this.prorationOriginStation = prorationOriginStation;
	}
	
	//Getters and Setters for online proration

	public BigDecimal getOnlineCarrierRevenue() {
		return onlineCarrierRevenue;
	}

	public void setOnlineCarrierRevenue(BigDecimal onlineCarrierRevenue) {
		this.onlineCarrierRevenue = onlineCarrierRevenue;
	}

	public BigDecimal getCarrierRevenueProrCurrency() {
		return carrierRevenueProrCurrency;
	}

	public void setCarrierRevenueProrCurrency(BigDecimal carrierRevenueProrCurrency) {
		this.carrierRevenueProrCurrency = carrierRevenueProrCurrency;
	}

	public BigDecimal getOnlineChargeableWeight() {
		return onlineChargeableWeight;
	}

	public void setOnlineChargeableWeight(BigDecimal onlineChargeableWeight) {
		this.onlineChargeableWeight = onlineChargeableWeight;
	}

	public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	public String getFlightDateFormatted() {
		String value="";
    	if(this.getFlightDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getFlightDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		flightDateFormatted=value.toUpperCase();
    	}
		return flightDateFormatted;
	}

	public void setFlightDateFormatted(String flightDateFormatted) {
		this.flightDateFormatted = flightDateFormatted;
	}

	public BigDecimal getOnlineGrossWeight() {
		if(onlineGrossWeight != null)
			onlineGrossWeight = onlineGrossWeight.setScale(2, BigDecimal.ROUND_HALF_UP);
		return onlineGrossWeight;
	}

	public void setOnlineGrossWeight(BigDecimal onlineGrossWeight) {
		this.onlineGrossWeight = onlineGrossWeight;
	}

	public ProrationType getOnlineProrationReasonCode() {
		return onlineProrationReasonCode;
	}

	public void setOnlineProrationReasonCode(ProrationType onlineProrationReasonCode) {
		this.onlineProrationReasonCode = onlineProrationReasonCode;
	}

	public String getOnlineProrationReasonCodeString() {
		if(this.getOnlineProrationReasonCode() != null)
		{
			onlineProrationReasonCodeString = this.getOnlineProrationReasonCode().getVal();
		}
		return onlineProrationReasonCodeString;
	}

	public void setOnlineProrationReasonCodeString(
			String onlineProrationReasonCodeString) {
		this.onlineProrationReasonCodeString = onlineProrationReasonCodeString;
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

	public BigDecimal getOtherChargeDueAgentProrCurrency() {
		return otherChargeDueAgentProrCurrency;
	}

	public void setOtherChargeDueAgentProrCurrency(
			BigDecimal otherChargeDueAgentProrCurrency) {
		this.otherChargeDueAgentProrCurrency = otherChargeDueAgentProrCurrency;
	}

	public BigDecimal getOtherChargeDueCarrierProrCurrency() {
		return otherChargeDueCarrierProrCurrency;
	}

	public void setOtherChargeDueCarrierProrCurrency(
			BigDecimal otherChargeDueCarrierProrCurrency) {
		this.otherChargeDueCarrierProrCurrency = otherChargeDueCarrierProrCurrency;
	}

	public BigDecimal getPercentageOfSegmentMileage() {
		if(percentageOfSegmentMileage != null)
			percentageOfSegmentMileage = percentageOfSegmentMileage.setScale(2, BigDecimal.ROUND_HALF_UP);
		return percentageOfSegmentMileage;
	}

	public void setPercentageOfSegmentMileage(BigDecimal percentageOfSegmentMileage) {
		this.percentageOfSegmentMileage = percentageOfSegmentMileage;
	}

	public Integer getPieces() {
		return pieces;
	}

	public void setPieces(Integer pieces) {
		this.pieces = pieces;
	}

	public BigDecimal getProratedChargeableWeight() {
		return proratedChargeableWeight;
	}

	public void setProratedChargeableWeight(BigDecimal proratedChargeableWeight) {
		this.proratedChargeableWeight = proratedChargeableWeight;
	}

	public String getOnlineSegmentOrigin() {
		return onlineSegmentOrigin;
	}

	public void setOnlineSegmentOrigin(String onlineSegmentOrigin) {
		this.onlineSegmentOrigin = onlineSegmentOrigin;
	}

	public String getOnlineSegmentDestination() {
		return onlineSegmentDestination;
	}

	public void setOnlineSegmentDestination(String onlineSegmentDestination) {
		this.onlineSegmentDestination = onlineSegmentDestination;
	}

	public BigDecimal getOnlineSegmentMileage() {
		if(onlineSegmentMileage != null)
			onlineSegmentMileage = onlineSegmentMileage.setScale(2, BigDecimal.ROUND_HALF_UP);
		return onlineSegmentMileage;
	}

	public void setOnlineSegmentMileage(BigDecimal onlineSegmentMileage) {
		this.onlineSegmentMileage = onlineSegmentMileage;
	}

	public BigDecimal getOnlineSegmentYield() {
		return onlineSegmentYield;
	}

	public void setOnlineSegmentYield(BigDecimal onlineSegmentYield) {
		this.onlineSegmentYield = onlineSegmentYield;
	}

	public BigDecimal getSegmentYieldProrcurrency() {
		return segmentYieldProrcurrency;
	}

	public void setSegmentYieldProrcurrency(BigDecimal segmentYieldProrcurrency) {
		this.segmentYieldProrcurrency = segmentYieldProrcurrency;
	}

	public BigDecimal getValuationCharge() {
		return valuationCharge;
	}

	public void setValuationCharge(BigDecimal valuationCharge) {
		this.valuationCharge = valuationCharge;
	}

	public BigDecimal getVat() {
		return vat;
	}

	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}

	public BigDecimal getTotalAirWaybillMileage() {
		if(totalAirWaybillMileage != null)
			totalAirWaybillMileage = totalAirWaybillMileage.setScale(2, BigDecimal.ROUND_HALF_UP);
		return totalAirWaybillMileage;
	}

	public void setTotalAirWaybillMileage(BigDecimal totalAirWaybillMileage) {
		this.totalAirWaybillMileage = totalAirWaybillMileage;
	}

	public BigDecimal getTotalHostMileage() {
		if(totalHostMileage != null)
			totalHostMileage = totalHostMileage.setScale(2, BigDecimal.ROUND_HALF_UP);
		return totalHostMileage;
	}

	public void setTotalHostMileage(BigDecimal totalHostMileage) {
		this.totalHostMileage = totalHostMileage;
	}

	public BigDecimal getTotalOALMileage() {
		if(totalOALMileage != null)
			totalOALMileage = totalOALMileage.setScale(2, BigDecimal.ROUND_HALF_UP);
		return totalOALMileage;
	}

	public void setTotalOALMileage(BigDecimal totalOALMileage) {
		this.totalOALMileage = totalOALMileage;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	//Getters and Setters for Interline Agreement
	
	public String getAgreementIdentifier() {
		return agreementIdentifier;
	}

	public void setAgreementIdentifier(String agreementIdentifier) {
		this.agreementIdentifier = agreementIdentifier;
	}

	public AgreementType getAgreementType() {
		return agreementType;
	}

	public void setAgreementType(AgreementType agreementType) {
		this.agreementType = agreementType;
	}

	public String getAgreementTypeString() {
		if(this.getAgreementType() != null)
		{
			agreementTypeString = this.getAgreementType().getAggrementType();
		}
		return agreementTypeString;
	}

	public void setAgreementTypeString(String agreementTypeString) {
		this.agreementTypeString = agreementTypeString;
	}

	public boolean isAllDestinationInd() {
		return allDestinationInd;
	}

	public void setAllDestinationInd(boolean allDestinationInd) {
		this.allDestinationInd = allDestinationInd;
	}

	public boolean isAllOriginInd() {
		return allOriginInd;
	}

	public void setAllOriginInd(boolean allOriginInd) {
		this.allOriginInd = allOriginInd;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getCommodityRuleString() {
		if(this.getCommodityRule() != null)
		{
			commodityRuleString = this.getCommodityRule().getLabel();
		}
		return commodityRuleString;
	}

	public void setCommodityRuleString(String commodityRuleString) {
		this.commodityRuleString = commodityRuleString;
	}

	public String getAgreementCurrencyCode() {
		return agreementCurrencyCode;
	}

	public void setAgreementCurrencyCode(String agreementCurrencyCode) {
		this.agreementCurrencyCode = agreementCurrencyCode;
	}

	public Date getAgreementEffectiveDate() {
		return agreementEffectiveDate;
	}

	public void setAgreementEffectiveDate(Date agreementEffectiveDate) {
		this.agreementEffectiveDate = agreementEffectiveDate;
	}

	public String getAgreementEffectiveDateFormatted() {
		String value="";
    	if(this.getAgreementEffectiveDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getAgreementEffectiveDate(),FrameworkConstants.DATETIMEFORMAT_DDMMMYYHHMM);
    	}	
    	if(value!=null)
    	{
    		agreementEffectiveDateFormatted=value.toUpperCase();
    	}
		return agreementEffectiveDateFormatted;
	}

	public void setAgreementEffectiveDateFormatted(
			String agreementEffectiveDateFormatted) {
		this.agreementEffectiveDateFormatted = agreementEffectiveDateFormatted;
	}

	public Date getAgreementExpirationDate() {
		return agreementExpirationDate;
	}

	public void setAgreementExpirationDate(Date agreementExpirationDate) {
		this.agreementExpirationDate = agreementExpirationDate;
	}

	public String getAgreementExpirationDateFormatted() {
		String value="";
    	if(this.getAgreementExpirationDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getAgreementExpirationDate(),FrameworkConstants.DATETIMEFORMAT_DDMMMYYHHMM);
    	}	
    	if(value!=null)
    	{
    		agreementExpirationDateFormatted=value.toUpperCase();
    	}
		return agreementExpirationDateFormatted;
	}

	public void setAgreementExpirationDateFormatted(
			String agreementExpirationDateFormatted) {
		this.agreementExpirationDateFormatted = agreementExpirationDateFormatted;
	}

	public boolean isExpirationInd() {
		return expirationInd;
	}

	public void setExpirationInd(boolean expirationInd) {
		this.expirationInd = expirationInd;
	}

	public boolean isFirstCarrierIndicator() {
		return firstCarrierIndicator;
	}

	public void setFirstCarrierIndicator(boolean firstCarrierIndicator) {
		this.firstCarrierIndicator = firstCarrierIndicator;
	}

	public String getAgreementFlightNumber() {
		return agreementFlightNumber;
	}

	public void setAgreementFlightNumber(String agreementFlightNumber) {
		this.agreementFlightNumber = agreementFlightNumber;
	}

	public LogicalOperationType getFlightNumberRule() {
		return flightNumberRule;
	}

	public void setFlightNumberRule(LogicalOperationType flightNumberRule) {
		this.flightNumberRule = flightNumberRule;
	}

	public String getFlightNumberRuleString() {
		if(this.getFlightNumberRule() != null)
		{
			flightNumberRuleString = this.getFlightNumberRule().getLabel();
		}
		return flightNumberRuleString;
	}

	public void setFlightNumberRuleString(String flightNumberRuleString) {
		this.flightNumberRuleString = flightNumberRuleString;
	}

	public boolean isIntermediateCarrierIndicator() {
		return intermediateCarrierIndicator;
	}

	public void setIntermediateCarrierIndicator(boolean intermediateCarrierIndicator) {
		this.intermediateCarrierIndicator = intermediateCarrierIndicator;
	}

	public boolean isLastCarrierIndicator() {
		return lastCarrierIndicator;
	}

	public void setLastCarrierIndicator(boolean lastCarrierIndicator) {
		this.lastCarrierIndicator = lastCarrierIndicator;
	}

	public BigDecimal getMaximumAmount() {
		return maximumAmount;
	}

	public void setMaximumAmount(BigDecimal maximumAmount) {
		this.maximumAmount = maximumAmount;
	}

	public BigDecimal getMaximumPercent() {
		return maximumPercent;
	}

	public void setMaximumPercent(BigDecimal maximumPercent) {
		this.maximumPercent = maximumPercent;
	}

	public BigDecimal getMinimumAmount() {
		return minimumAmount;
	}

	public void setMinimumAmount(BigDecimal minimumAmount) {
		this.minimumAmount = minimumAmount;
	}

	public BigDecimal getMinimumPercent() {
		return minimumPercent;
	}

	public void setMinimumPercent(BigDecimal minimumPercent) {
		this.minimumPercent = minimumPercent;
	}

	public String getOtherChargeCode() {
		return otherChargeCode;
	}

	public void setOtherChargeCode(String otherChargeCode) {
		this.otherChargeCode = otherChargeCode;
	}

	public OtherChargeCodeDecideType getOtherChargeRule() {
		return otherChargeRule;
	}

	public void setOtherChargeRule(OtherChargeCodeDecideType otherChargeRule) {
		this.otherChargeRule = otherChargeRule;
	}

	public String getOtherChargeRuleString() {
		if(this.getOtherChargeRule() != null)
		{
			otherChargeRuleString = this.getOtherChargeRule().getLabel();
		}
		return otherChargeRuleString;
	}

	public void setOtherChargeRuleString(String otherChargeRuleString) {
		this.otherChargeRuleString = otherChargeRuleString;
	}

	public String getAgreementProductCode() {
		return agreementProductCode;
	}

	public void setAgreementProductCode(String agreementProductCode) {
		this.agreementProductCode = agreementProductCode;
	}

	public String getProductRuleString() {
		if(this.getProductRule() != null)
		{
			productRuleString = this.getProductRule().getLabel();
		}
		return productRuleString;
	}

	public void setProductRuleString(String productRuleString) {
		this.productRuleString = productRuleString;
	}

	public String getProvisoClass() {
		return provisoClass;
	}

	public void setProvisoClass(String provisoClass) {
		this.provisoClass = provisoClass;
	}

	public ProvisoType getProvisotype() {
		return provisotype;
	}

	public void setProvisotype(ProvisoType provisotype) {
		this.provisotype = provisotype;
	}

	public String getProvisotypeString() {
		if(this.getProvisotype() != null)
		{
			provisotypeString = this.getProvisotype().getProviso();
		}
		return provisotypeString;
	}

	public void setProvisotypeString(String provisotypeString) {
		this.provisotypeString = provisotypeString;
	}

	public String getRateBasedOnString() {
		if(this.getRateBasedOn() != null)
		{
			rateBasedOnString = this.getRateBasedOn().getRate();
		}
		return rateBasedOnString;
	}

	public void setRateBasedOnString(String rateBasedOnString) {
		this.rateBasedOnString = rateBasedOnString;
	}

	public LogicalOperationType getSplCodeRule() {
		return splCodeRule;
	}

	public void setSplCodeRule(LogicalOperationType splCodeRule) {
		this.splCodeRule = splCodeRule;
	}

	public String getSplCodeRuleString() {
		if(this.getSplCodeRule() != null)
		{
			splCodeRuleString = this.getSplCodeRule().getLabel();
		}
		return splCodeRuleString;
	}

	public void setSplCodeRuleString(String splCodeRuleString) {
		this.splCodeRuleString = splCodeRuleString;
	}

	public StatusType getStatus() {
		return status;
	}

	public void setStatus(StatusType status) {
		this.status = status;
	}

	public boolean isTc1Indicator() {
		return tc1Indicator;
	}

	public void setTc1Indicator(boolean tc1Indicator) {
		this.tc1Indicator = tc1Indicator;
	}

	public boolean isTc2Indicator() {
		return tc2Indicator;
	}

	public void setTc2Indicator(boolean tc2Indicator) {
		this.tc2Indicator = tc2Indicator;
	}

	public boolean isTc3Indicator() {
		return tc3Indicator;
	}

	public void setTc3Indicator(boolean tc3Indicator) {
		this.tc3Indicator = tc3Indicator;
	}

	public boolean isTransatlanticIndicator() {
		return transatlanticIndicator;
	}

	public void setTransatlanticIndicator(boolean transatlanticIndicator) {
		this.transatlanticIndicator = transatlanticIndicator;
	}

	public boolean isTranspacificIndicator() {
		return transpacificIndicator;
	}

	public void setTranspacificIndicator(boolean transpacificIndicator) {
		this.transpacificIndicator = transpacificIndicator;
	}

	public String getAgreementUldType() {
		return agreementUldType;
	}

	public void setAgreementUldType(String agreementUldType) {
		this.agreementUldType = agreementUldType;
	}

	public LogicalOperationType getUldTypeRule() {
		return uldTypeRule;
	}

	public void setUldTypeRule(LogicalOperationType uldTypeRule) {
		this.uldTypeRule = uldTypeRule;
	}

	public String getUldTypeRuleString() {
		if(this.getUldTypeRule() != null)
		{
			uldTypeRuleString = this.getUldTypeRule().getLabel();
		}
		return uldTypeRuleString;
	}

	public void setUldTypeRuleString(String uldTypeRuleString) {
		this.uldTypeRuleString = uldTypeRuleString;
	}

	public WeightUOMType getAgreementWeightUnit() {
		return agreementWeightUnit;
	}

	public void setAgreementWeightUnit(WeightUOMType agreementWeightUnit) {
		this.agreementWeightUnit = agreementWeightUnit;
	}

	public String getAgreementWeightUnitString() {
		if(this.getAgreementWeightUnit() != null)
		{
			agreementWeightUnitString = this.getAgreementWeightUnit().getWeightUnit();
		}
		return agreementWeightUnitString;
	}

	public void setAgreementWeightUnitString(String agreementWeightUnitString) {
		this.agreementWeightUnitString = agreementWeightUnitString;
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

	public String getUserIdentifier() {
		return userIdentifier;
	}

	public void setUserIdentifier(String userIdentifier) {
		this.userIdentifier = userIdentifier;
	}

	public String getStatusString() {
		if(this.getStatus() != null)
		{
			statusString = this.getStatus().getName();
		}
		return statusString;
	}

	public void setStatusString(String statusString) {
		this.statusString = statusString;
	}

	public String getCreatedOnFormatted() {
		String value="";
    	if(this.getCreatedOn()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getCreatedOn(),FrameworkConstants.DATETIMEFORMAT_DDMMMYYHHMM);
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

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	
	public String getSegmentOrigin() {
		return segmentOrigin;
	}

	public void setSegmentOrigin(String segmentOrigin) {
		this.segmentOrigin = segmentOrigin;
	}

	public String getSegmentDestination() {
		return segmentDestination;
	}

	public void setSegmentDestination(String segmentDestination) {
		this.segmentDestination = segmentDestination;
	}

	public BigDecimal getCarrierRevenue() {
		/*if(carrierRevenue != null)
			carrierRevenue = carrierRevenue.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return carrierRevenue;
	}

	public void setCarrierRevenue(BigDecimal carrierRevenue) {
		this.carrierRevenue = carrierRevenue;
	}

	

	public Date getSpaEffectiveDate() {
		return spaEffectiveDate;
	}

	public void setSpaEffectiveDate(Date spaEffectiveDate) {
		this.spaEffectiveDate = spaEffectiveDate;
	}

	public String getAwbNumber() {
		return awbNumber;
	}

	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}

	public ProrationType getProrateMethod() {
		return prorateMethod;
	}

	public void setProrateMethod(ProrationType prorateMethod) {
		this.prorateMethod = prorateMethod;
	}

	public String getProrateMethodString() {
		if(this.getProrateMethod()!=null)
			prorateMethodString = this.getProrateMethod().getVal();
		return prorateMethodString;
	}

	public void setProrateMethodString(String prorateMethodString) {
		this.prorateMethodString = prorateMethodString;
	}

	public BigDecimal getSegmentYield() {
		/*if(segmentYield != null)
			segmentYield = segmentYield.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return segmentYield;
	}

	public void setSegmentYield(BigDecimal segmentYield) {
		this.segmentYield = segmentYield;
	}

	public BigDecimal getSegmentMileage() {
		if(segmentMileage != null)
			segmentMileage = segmentMileage.setScale(2, BigDecimal.ROUND_HALF_UP);
		return segmentMileage;
	}

	public void setSegmentMileage(BigDecimal segmentMileage) {
		this.segmentMileage = segmentMileage;
	}

	public BigDecimal getSegmentMileagePercent() {
		if(segmentMileagePercent != null)
			segmentMileagePercent = segmentMileagePercent.setScale(2, BigDecimal.ROUND_HALF_UP);
		return segmentMileagePercent;
	}

	public void setSegmentMileagePercent(BigDecimal segmentMileagePercent) {
		this.segmentMileagePercent = segmentMileagePercent;
	}

	public Boolean getMultipleSPAIndicator() {
		return multipleSPAIndicator;
	}

	public void setMultipleSPAIndicator(Boolean multipleSPAIndicator) {
		this.multipleSPAIndicator = multipleSPAIndicator;
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
		if(dimensionalWeight != null)
			dimensionalWeight = dimensionalWeight.setScale(2, BigDecimal.ROUND_HALF_UP);
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

	public String getVolumeEvaluationMethodString() {
		if(this.getVolumeEvaluationMethod() != null)
			volumeEvaluationMethodString = this.getVolumeEvaluationMethod().getUnit();
		return volumeEvaluationMethodString;
	}

	public void setVolumeEvaluationMethodString(
			String volumeEvaluationMethodString) {
		this.volumeEvaluationMethodString = volumeEvaluationMethodString;
	}

	public BigDecimal getBookingEventGrossRevenue() {
		/*if(bookingEventGrossRevenue != null)
			bookingEventGrossRevenue = bookingEventGrossRevenue.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return bookingEventGrossRevenue;
	}

	public void setBookingEventGrossRevenue(BigDecimal bookingEventGrossRevenue) {
		this.bookingEventGrossRevenue = bookingEventGrossRevenue;
	}

	public BigDecimal getBookingEventHostRevenue() {
		/*if(bookingEventHostRevenue != null)
			bookingEventHostRevenue = bookingEventHostRevenue.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return bookingEventHostRevenue;
	}

	public void setBookingEventHostRevenue(BigDecimal bookingEventHostRevenue) {
		this.bookingEventHostRevenue = bookingEventHostRevenue;
	}

	public BigDecimal getBookingEventHurdleAmount() {
		/*if(bookingEventHurdleAmount != null)
			bookingEventHurdleAmount = bookingEventHurdleAmount.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return bookingEventHurdleAmount;
	}

	public void setBookingEventHurdleAmount(BigDecimal bookingEventHurdleAmount) {
		this.bookingEventHurdleAmount = bookingEventHurdleAmount;
	}

	public BigDecimal getBookingEventHurdleRate() {
		if(bookingEventHurdleRate != null)
			bookingEventHurdleRate = bookingEventHurdleRate.setScale(2, BigDecimal.ROUND_HALF_UP);
		return bookingEventHurdleRate;
	}

	public void setBookingEventHurdleRate(BigDecimal bookingEventHurdleRate) {
		this.bookingEventHurdleRate = bookingEventHurdleRate;
	}

	public BigDecimal getBookingEventTotalRate() {
		if(bookingEventTotalRate != null)
			bookingEventTotalRate = bookingEventTotalRate.setScale(2, BigDecimal.ROUND_HALF_UP);
		return bookingEventTotalRate;
	}

	public void setBookingEventTotalRate(BigDecimal bookingEventTotalRate) {
		this.bookingEventTotalRate = bookingEventTotalRate;
	}

	public BigDecimal getBookingEventCostAmount() {
		/*if(bookingEventCostAmount != null)
			bookingEventCostAmount = bookingEventCostAmount.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return bookingEventCostAmount;
	}

	public void setBookingEventCostAmount(BigDecimal bookingEventCostAmount) {
		this.bookingEventCostAmount = bookingEventCostAmount;
	}

	public BigDecimal getBookingEventCostRate() {
		if(bookingEventCostRate != null)
			bookingEventCostRate = bookingEventCostRate.setScale(2, BigDecimal.ROUND_HALF_UP);
		return bookingEventCostRate;
	}

	public void setBookingEventCostRate(BigDecimal bookingEventCostRate) {
		this.bookingEventCostRate = bookingEventCostRate;
	}

	public BigDecimal getBookingEventRevenueRate() {
		if(bookingEventRevenueRate != null)
			bookingEventRevenueRate = bookingEventRevenueRate.setScale(2, BigDecimal.ROUND_HALF_UP);
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

	public String getBookingEventHurdleRateReasonCodeString() {
		if(this.getBookingEventHurdleRateReasonCode()!=null)
			bookingEventHurdleRateReasonCodeString = this.getBookingEventHurdleRateReasonCode().getVal();
		return bookingEventHurdleRateReasonCodeString;
	}

	public void setBookingEventHurdleRateReasonCodeString(
			String bookingEventHurdleRateReasonCodeString) {
		this.bookingEventHurdleRateReasonCodeString = bookingEventHurdleRateReasonCodeString;
	}

	public BigDecimal getActWeightCharge() {
		/*if(actWeightCharge != null)
			actWeightCharge = actWeightCharge.setScale(2, BigDecimal.ROUND_HALF_UP);*/
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
		/*if(actPrepaidCharge != null)
			actPrepaidCharge = actPrepaidCharge.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return actPrepaidCharge;
	}

	public void setActPrepaidCharge(BigDecimal actPrepaidCharge) {
		this.actPrepaidCharge = actPrepaidCharge;
	}

	public BigDecimal getActCollectCharge() {
		/*if(actCollectCharge != null)
			actCollectCharge = actCollectCharge.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return actCollectCharge;
	}

	public void setActCollectCharge(BigDecimal actCollectCharge) {
		this.actCollectCharge = actCollectCharge;
	}

	public BigDecimal getCodCharges() {
		/*if(codCharges != null)
			codCharges = codCharges.setScale(2, BigDecimal.ROUND_HALF_UP);*/
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

	public BigDecimal getChargeableWeight() {
		if(chargeableWeight != null)
			chargeableWeight = chargeableWeight.setScale(2, BigDecimal.ROUND_HALF_UP);
		return chargeableWeight;
	}

	public void setChargeableWeight(BigDecimal chargeableWeight) {
		this.chargeableWeight = chargeableWeight;
	}

	public BigDecimal getGrossWeight() {
		if(grossWeight != null)
			grossWeight = grossWeight.setScale(2, BigDecimal.ROUND_HALF_UP);
		return grossWeight;
	}

	public void setGrossWeight(BigDecimal grossWeight) {
		this.grossWeight = grossWeight;
	}

	public BigDecimal getHostTotalOtherCharges() {
		/*if(hostTotalOtherCharges != null)
			hostTotalOtherCharges = hostTotalOtherCharges.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return hostTotalOtherCharges;
	}

	public void setHostTotalOtherCharges(BigDecimal hostTotalOtherCharges) {
		this.hostTotalOtherCharges = hostTotalOtherCharges;
	}

	public BigDecimal getHostTotalOtherChargesDueAgent() {
		/*if(hostTotalOtherChargesDueAgent != null)
			hostTotalOtherChargesDueAgent = hostTotalOtherChargesDueAgent.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return hostTotalOtherChargesDueAgent;
	}

	public void setHostTotalOtherChargesDueAgent(
			BigDecimal hostTotalOtherChargesDueAgent) {
		this.hostTotalOtherChargesDueAgent = hostTotalOtherChargesDueAgent;
	}

	public BigDecimal getHostTotalOtherChargesDueCarrier() {
		/*if(hostTotalOtherChargesDueCarrier != null)
			hostTotalOtherChargesDueCarrier = hostTotalOtherChargesDueCarrier.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return hostTotalOtherChargesDueCarrier;
	}

	public void setHostTotalOtherChargesDueCarrier(
			BigDecimal hostTotalOtherChargesDueCarrier) {
		this.hostTotalOtherChargesDueCarrier = hostTotalOtherChargesDueCarrier;
	}

	public Integer getSegPieces() {
		return segPieces;
	}

	public void setSegPieces(Integer segPieces) {
		this.segPieces = segPieces;
	}

	public String getProrateIdentifier() {
		return prorateIdentifier;
	}

	public void setProrateIdentifier(String prorateIdentifier) {
		this.prorateIdentifier = prorateIdentifier;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAwbOrigin() {
		return awbOrigin;
	}

	public void setAwbOrigin(String awbOrigin) {
		this.awbOrigin = awbOrigin;
	}

	public String getAwbDestination() {
		return awbDestination;
	}

	public void setAwbDestination(String awbDestination) {
		this.awbDestination = awbDestination;
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

	public String getIssuingACN() {
		return issuingACN;
	}

	public void setIssuingACN(String issuingACN) {
		this.issuingACN = issuingACN;
	}

	public String getToCarrier() {
		return toCarrier;
	}

	public void setToCarrier(String toCarrier) {
		this.toCarrier = toCarrier;
	}

	public boolean isBiDirectional() {
		return biDirectional;
	}

	public void setBiDirectional(boolean biDirectional) {
		this.biDirectional = biDirectional;
	}

	

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public BigDecimal getMaximumWeight() {
		if(maximumWeight != null)
			maximumWeight = maximumWeight.setScale(2, BigDecimal.ROUND_HALF_UP);
		return maximumWeight;
	}

	public void setMaximumWeight(BigDecimal maximumWeight) {
		this.maximumWeight = maximumWeight;
	}

	public BigDecimal getMinimumWeight() {
		if(minimumWeight != null)
			minimumWeight = minimumWeight.setScale(2, BigDecimal.ROUND_HALF_UP);
		return minimumWeight;
	}

	public void setMinimumWeight(BigDecimal minimumWeight) {
		this.minimumWeight = minimumWeight;
	}

	public BigDecimal getRate() {
		if(rate != null)
			rate = rate.setScale(2, BigDecimal.ROUND_HALF_UP);
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public RateBasedOnType getRateBasedOn() {
		return rateBasedOn;
	}

	public void setRateBasedOn(RateBasedOnType rateBasedOn) {
		this.rateBasedOn = rateBasedOn;
	}

	public WeightType getWeightType() {
		return weightType;
	}

	public void setWeightType(WeightType weightType) {
		this.weightType = weightType;
	}

	

	public String getWeightTypeString() {
		if(this.getWeightType() != null)
			weightTypeString = this.getWeightType().getWeightTypeValue();
		return weightTypeString;
	}

	public void setWeightTypeString(String weightTypeString) {
		this.weightTypeString = weightTypeString;
	}

	public BigDecimal getOverPivotRate() {
		if(overPivotRate != null)
			overPivotRate = overPivotRate.setScale(2, BigDecimal.ROUND_HALF_UP);
		return overPivotRate;
	}

	public void setOverPivotRate(BigDecimal overPivotRate) {
		this.overPivotRate = overPivotRate;
	}

	public BigDecimal getPivotWeight() {
		if(pivotWeight != null)
			pivotWeight = pivotWeight.setScale(2, BigDecimal.ROUND_HALF_UP);
		return pivotWeight;
	}

	public void setPivotWeight(BigDecimal pivotWeight) {
		this.pivotWeight = pivotWeight;
	}

	public BigDecimal getCommissionPercent() {
		if(commissionPercent != null)
			commissionPercent = commissionPercent.setScale(2, BigDecimal.ROUND_HALF_UP);
		return commissionPercent;
	}

	public void setCommissionPercent(BigDecimal commissionPercent) {
		this.commissionPercent = commissionPercent;
	}

	public Long getProrateId() {
		return prorateId;
	}

	public void setProrateId(Long prorateId) {
		this.prorateId = prorateId;
	}

	public LogicalOperationType getProductRule() {
		return productRule;
	}

	public void setProductRule(LogicalOperationType productRule) {
		this.productRule = productRule;
	}

	public LogicalOperationType getCommodityRule() {
		return commodityRule;
	}

	public void setCommodityRule(LogicalOperationType commodityRule) {
		this.commodityRule = commodityRule;
	}

	public String getProductCodes() {
		return productCodes;
	}

	public void setProductCodes(String productCodes) {
		this.productCodes = productCodes;
	}

	public String getOtherChargeCodes() {
		return otherChargeCodes;
	}

	public void setOtherChargeCodes(String otherChargeCodes) {
		this.otherChargeCodes = otherChargeCodes;
	}

	public String getCommodity() {
		return commodity;
	}

	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}

	public String getSpecialHandlingCodes() {
		return specialHandlingCodes;
	}

	public void setSpecialHandlingCodes(String specialHandlingCodes) {
		this.specialHandlingCodes = specialHandlingCodes;
	}

	public String getUldType() {
		return uldType;
	}

	public void setUldType(String uldType) {
		this.uldType = uldType;
	}

	public String getFlightNumbers() {
		return flightNumbers;
	}

	public void setFlightNumbers(String flightNumbers) {
		this.flightNumbers = flightNumbers;
	}

	public String getAggrcurrencyCode() {
		return aggrcurrencyCode;
	}

	public void setAggrcurrencyCode(String aggrcurrencyCode) {
		this.aggrcurrencyCode = aggrcurrencyCode;
	}

	public WeightUOMType getAggrweightUnit() {
		return aggrweightUnit;
	}

	public void setAggrweightUnit(WeightUOMType aggrweightUnit) {
		this.aggrweightUnit = aggrweightUnit;
	}

	public String getEffectiveDateFormatted() {
		String value="";
    	if(this.getEffectiveDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getEffectiveDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		effectiveDateFormatted=value.toUpperCase();
    	}
		return effectiveDateFormatted;
	}

	public void setEffectiveDateFormatted(String effectiveDateFormatted) {
		this.effectiveDateFormatted = effectiveDateFormatted;
	}

	public String getExpirationDateFormatted() {
		String value="";
    	if(this.getExpirationDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getExpirationDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		expirationDateFormatted=value.toUpperCase();
    	}
		return expirationDateFormatted;
	}

	public void setExpirationDateFormatted(String expirationDateFormatted) {
		this.expirationDateFormatted = expirationDateFormatted;
	}
	
	
	public String toString() {
        // SuppressOn:MagicNumber
        final StringBuffer csvString = new StringBuffer();
        
       
        if(this.getProrateMethod() != null)
        {
        	csvString.append(this.prefixSuffixByQuotes(this.getProrateMethod().getVal()));
        }
        else
        	csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        
        if(this.getCarrierCode() != null)
		{
        	csvString.append(this.prefixSuffixByQuotes(this.getCarrierCode()));
		}
		else
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        
        if(this.getSegmentOrigin() != null)
        {
        	csvString.append(this.prefixSuffixByQuotes(this.getSegmentOrigin()));
        }
        else
        	csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        
        if(this.getSegmentDestination() != null)
        {
        	csvString.append(this.prefixSuffixByQuotes(this.getSegmentDestination()));
        }
        else
        	csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        
		
				
		if(this.getFlightNumber()!= null)
		{
			csvString.append(this.prefixSuffixByQuotes(this.getFlightNumber()));
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

	public String getAirWayBillDestination() {
		return airWayBillDestination;
	}

	public void setAirWayBillDestination(String airWayBillDestination) {
		this.airWayBillDestination = airWayBillDestination;
	}

	public String getAirWayBillOrigin() {
		return airWayBillOrigin;
	}

	public void setAirWayBillOrigin(String airWayBillOrigin) {
		this.airWayBillOrigin = airWayBillOrigin;
	}
	
	
}
