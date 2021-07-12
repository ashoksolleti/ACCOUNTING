package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.StringTokenizer;

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
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;
import com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemDto;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

public class ManualQueueDetailsDTO extends OfficeQueueItemDto {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

	private boolean manualAuditCompleted;
/*	private String awbNumber;
	private String awbRevenue;
    private String awbOALRevenue;
    private String awbNetRevenue;
    private String awbNetYield;
    private String origin;
    private String destination;

    private String erPayCode;
    private String irPayCode;
    private String productCode;
    
    private Date creationDate;*/
    
    
    //AWB Startes here
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
	private String priority;
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
 
	private String shipperAccNumber;
    private String consigneeAccNumber;
    private String iataAgentAccNumber;
    private String sdcPieces;
    private String sdcWeight;
    
    
    
    private long oid;

    private long airwaybillOId;

    //private String priority;

    /**
     * Attribute to hold <code>creationDate</code> property.
     */
    

    final String SEPARATOR = ",";

    final String EMPTY_STRING = "";

    public ManualQueueDetailsDTO() {

    }

    public boolean isManualAuditCompleted() {
        return this.manualAuditCompleted;
    }

    public void setManualAuditCompleted(final boolean pManualAuditCompleted) {
        this.manualAuditCompleted = pManualAuditCompleted;
    }

    

//    public String getAwbRevenue() {
//        if (this.awbRevenue == null) {
//            this.awbRevenue = new String();
//        }
//        return this.getRoundUp(this.awbRevenue);
//    }
//
//    public void setAwbRevenue(final String pAwbRevenue) {
//        this.awbRevenue = pAwbRevenue;
//    }
//
//    public String getAwbOALRevenue() {
//        if (this.awbOALRevenue == null) {
//            this.awbOALRevenue = new String();
//        }
//        return this.getRoundUp(this.awbOALRevenue);
//    }
//
//    public void setAwbOALRevenue(final String pAwbOALRevenue) {
//        this.awbOALRevenue = this.getRoundUp(pAwbOALRevenue);
//    }
//
//    public String getAwbNetYield() {
//        if (this.awbNetYield == null) {
//            this.awbNetYield = new String();
//        }
//        return this.getRoundUp(this.awbNetYield);
//    }
//
//    public void setAwbNetYield(final String pAwbNetYield) {
//        this.awbNetYield = this.getRoundUp(pAwbNetYield);
//    }
//
//    public String getOrigin() {
//        if (this.origin == null) {
//            this.origin = new String();
//        }
//        return this.origin;
//    }
//
//    public void setOrigin(final String pOrigin) {
//        this.origin = pOrigin;
//    }
//
//    public String getDestination() {
//        if (this.destination == null) {
//            this.destination = new String();
//        }
//        return this.destination;
//    }
//
//    public void setDestination(final String pDestination) {
//        this.destination = pDestination;
//    }
//
//    
//
//    public String getErPayCode() {
//        if (this.erPayCode == null) {
//            this.erPayCode = new String();
//        }
//        return this.erPayCode;
//    }
//
//    public void setErPayCode(final String pErPayCode) {
//        this.erPayCode = pErPayCode;
//    }
//
//    public String getIrPayCode() {
//        if (this.irPayCode == null) {
//            this.irPayCode = new String();
//        }
//        return this.irPayCode;
//    }
//
//    public void setIrPayCode(final String pIrPayCode) {
//        this.irPayCode = pIrPayCode;
//    }
//
//    public String getProductCode() {
//        if (this.productCode == null) {
//            this.productCode = new String();
//        }
//        return this.productCode;
//    }
//
//    public void setProductCode(final String pProductCode) {
//        this.productCode = pProductCode;
//    }

//

//
//    public String getAwbNetRevenue() {
//        return this.getRoundUp(this.awbNetRevenue);
//    }
//
//    public void setAwbNetRevenue(final String pAwbNetRevenue) {
//        this.awbNetRevenue = this.getRoundUp(pAwbNetRevenue);
//    }
    
    
    
    //AWB Getters and Setters Starts here
    
    public String getAwbNumber() {
        if (this.awbNumber == null) {
            this.awbNumber = new String();
        }
        return this.awbNumber;
    }

    public void setAwbNumber(final String pAwbNumber) {
        this.awbNumber = pAwbNumber;
    }


	public String getOriginStation() {
		return originStation;
	}

	public void setOriginStation(String originStation) {
		this.originStation = originStation;
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

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

/*	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}*/

	public ExportPaymentType getExportPaycode() {
		return exportPaycode;
	}

	public void setExportPaycode(ExportPaymentType exportPaycode) {
		this.exportPaycode = exportPaycode;
	}

/*	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}*/

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
		if(this.getVolumeEvaluationMethod()!=null)
		{
			volumeEvaluationMethodString = this.getVolumeEvaluationMethod().getUnit();
		}
		return volumeEvaluationMethodString;
	}

	public void setVolumeEvaluationMethodString(
			String volumeEvaluationMethodString) {
		this.volumeEvaluationMethodString = volumeEvaluationMethodString;
	}

	public BigDecimal getBookingEventGrossRevenue() {
		if(bookingEventGrossRevenue != null)
			bookingEventGrossRevenue = bookingEventGrossRevenue.setScale(2, BigDecimal.ROUND_HALF_UP);
		return bookingEventGrossRevenue;
	}

	public void setBookingEventGrossRevenue(BigDecimal bookingEventGrossRevenue) {
		this.bookingEventGrossRevenue = bookingEventGrossRevenue;
	}

	public BigDecimal getBookingEventHostRevenue() {
		if(bookingEventHostRevenue != null)
			bookingEventHostRevenue = bookingEventHostRevenue.setScale(2, BigDecimal.ROUND_HALF_UP);
		return bookingEventHostRevenue;
	}

	public void setBookingEventHostRevenue(BigDecimal bookingEventHostRevenue) {
		this.bookingEventHostRevenue = bookingEventHostRevenue;
	}

	public BigDecimal getBookingEventHurdleAmount() {
		if(bookingEventHurdleAmount != null)
			bookingEventHurdleAmount = bookingEventHurdleAmount.setScale(2, BigDecimal.ROUND_HALF_UP);
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
		if(bookingEventCostAmount != null)
			bookingEventCostAmount = bookingEventCostAmount.setScale(2, BigDecimal.ROUND_HALF_UP);
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
		if(actWeightCharge != null)
			actWeightCharge = actWeightCharge.setScale(2, BigDecimal.ROUND_HALF_UP);
		return actWeightCharge;
	}

	public void setActWeightCharge(BigDecimal actWeightCharge) {
		this.actWeightCharge = actWeightCharge;
	}
	
	public BigDecimal getValuationCharges() {
		if(valuationCharges == null){
			valuationCharges = new BigDecimal(0);
		}
		else if(valuationCharges != null)
			valuationCharges = valuationCharges.setScale(2, BigDecimal.ROUND_HALF_UP);
		return valuationCharges;
	}

	public void setValuationCharges(BigDecimal valuationCharges) {
		this.valuationCharges = valuationCharges;
	}


	public BigDecimal getActPrepaidCharge() {
		if(actPrepaidCharge != null)
			actPrepaidCharge = actPrepaidCharge.setScale(2, BigDecimal.ROUND_HALF_UP);
		return actPrepaidCharge;
	}

	public void setActPrepaidCharge(BigDecimal actPrepaidCharge) {
		this.actPrepaidCharge = actPrepaidCharge;
	}

	public BigDecimal getActCollectCharge() {
		if(actCollectCharge != null)
			actCollectCharge = actCollectCharge.setScale(2, BigDecimal.ROUND_HALF_UP);
		return actCollectCharge;
	}

	public void setActCollectCharge(BigDecimal actCollectCharge) {
		this.actCollectCharge = actCollectCharge;
	}

	public BigDecimal getCodCharges() {
		if(codCharges != null)
			codCharges = codCharges.setScale(2, BigDecimal.ROUND_HALF_UP);
		return codCharges;
	}

	public void setCodCharges(BigDecimal codCharges) {
		this.codCharges = codCharges;
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

	public GenIdType getCodChargeGenIdType() {
		return codChargeGenIdType;
	}

	public void setCodChargeGenIdType(GenIdType codChargeGenIdType) {
		this.codChargeGenIdType = codChargeGenIdType;
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

	public GenIdType getValuationChargeGenIdType() {
		return valuationChargeGenIdType;
	}

	public void setValuationChargeGenIdType(GenIdType valuationChargeGenIdType) {
		this.valuationChargeGenIdType = valuationChargeGenIdType;
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
	
	
	//String values for enum
	
	



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

    
    //AWB ends here
	


  public String getShipperAccNumber() {
      if (this.shipperAccNumber == null) {
          this.shipperAccNumber = new String();
      }
      return this.shipperAccNumber;
  }

  public void setShipperAccNumber(final String pShipperAccNumber) {
      this.shipperAccNumber = pShipperAccNumber;
  }

  public String getConsigneeAccNumber() {
      if (this.consigneeAccNumber == null) {
          this.consigneeAccNumber = new String();
      }
      return this.consigneeAccNumber;
  }

  public void setConsigneeAccNumber(final String pConsigneeAccNumber) {
      this.consigneeAccNumber = pConsigneeAccNumber;
  }

  public String getIataAgentAccNumber() {
      if (this.iataAgentAccNumber == null) {
          this.iataAgentAccNumber = new String();
      }
      return this.iataAgentAccNumber;
  }

  public void setIataAgentAccNumber(final String pIataAgentAccNumber) {
      this.iataAgentAccNumber = pIataAgentAccNumber;
  }
  
  
  public String getSdcPieces() {
    if (this.sdcPieces == null) {
        this.sdcPieces = new String();
    }
    return this.sdcPieces;
}

public void setSdcPieces(final String pSdcPieces) {
    this.sdcPieces = pSdcPieces;
}

public String getSdcWeight() {
    if (this.sdcWeight == null) {
        this.sdcWeight = new String();
    }
    return this.sdcWeight;
}

public void setSdcWeight(final String pSdcWeight) {
    this.sdcWeight = pSdcWeight;
}
    
  @Override
  public Long getOId() {
      return oid;
  }

    public void setOid(long oid) {
        this.oid = oid;
    }
    

    public boolean equals(Object object) {
        if (object instanceof ManualQueueDetailsDTO) {
            ManualQueueDetailsDTO otherManualQueueDetailsDTO = (ManualQueueDetailsDTO) object;
            if (this.awbNumber.equals(otherManualQueueDetailsDTO.getAwbNumber())
                        && this.creationDate.equals(otherManualQueueDetailsDTO.getCreationDate())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.awbNumber.hashCode();
    }

    @Override
    public String toString() {

        StringBuffer aBuffer = new StringBuffer();
        aBuffer.append(this.awbNumber);
        aBuffer.append(this.SEPARATOR);

        if (this.getAirWaybillEventHostRevenue() == null) {
            aBuffer.append(EMPTY_STRING);
        }
        else {
            aBuffer.append(this.getAirWaybillEventHostRevenue());
        }
        aBuffer.append(SEPARATOR);

        if (this.getAirWaybillEventHostRevenue() == null) {
            aBuffer.append(EMPTY_STRING);
        }
        else {
            aBuffer.append(this.getAirWaybillEventHostRevenue());
        }
        aBuffer.append(SEPARATOR);

/*        if (this.awbNetRevenue == null) {
            aBuffer.append(EMPTY_STRING);
        }
        else {
            aBuffer.append(this.awbNetRevenue);
        }
        aBuffer.append(SEPARATOR);*/

        if (this.getHostNetYield() == null) {
            aBuffer.append(EMPTY_STRING);
        }
        else {
            aBuffer.append(this.getHostNetYield());
        }
        aBuffer.append(SEPARATOR);

        if (this.getOriginStation() == null) {
            aBuffer.append(EMPTY_STRING);
        }
        else {
            aBuffer.append(this.getOriginStation());
        }
        aBuffer.append(SEPARATOR);

        if (this.getDestinationStation() == null) {
            aBuffer.append(EMPTY_STRING);
        }
        else {
            aBuffer.append(this.getDestinationStation());
        }
        aBuffer.append(SEPARATOR);

        if (this.sdcPieces == null) {
            aBuffer.append(EMPTY_STRING);
        }
        else {
            aBuffer.append(this.sdcPieces);
        }
        aBuffer.append(SEPARATOR);

        if (this.sdcWeight == null) {
            aBuffer.append(EMPTY_STRING);
        }
        else {
            aBuffer.append(this.sdcWeight);
        }
        aBuffer.append(SEPARATOR);

        if (this.getExportPaycodeString() == null) {
            aBuffer.append(EMPTY_STRING);
        }
        else {
            aBuffer.append(this.getExportPaycodeString());
        }
        aBuffer.append(SEPARATOR);

        if (this.getImportPaycodeString() == null) {
            aBuffer.append(EMPTY_STRING);
        }
        else {
            aBuffer.append(this.getImportPaycodeString());
        }
        aBuffer.append(SEPARATOR);

        if (this.productCode == null) {
            aBuffer.append(EMPTY_STRING);
        }
        else {
            aBuffer.append(this.productCode);
        }
        aBuffer.append(SEPARATOR);

        if (this.shipperAccNumber == null) {
            aBuffer.append(EMPTY_STRING);
        }
        else {
            aBuffer.append(this.shipperAccNumber);
        }
        aBuffer.append(SEPARATOR);

        if (this.consigneeAccNumber == null) {
            aBuffer.append(EMPTY_STRING);
        }
        else {
            aBuffer.append(this.consigneeAccNumber);
        }
        aBuffer.append(SEPARATOR);

        if (this.iataAgentAccNumber == null) {
            aBuffer.append(EMPTY_STRING);
        }
        else {
            aBuffer.append(this.iataAgentAccNumber);
        }
        aBuffer.toString();
        return aBuffer.toString();
    }

    public long getAirwaybillOId() {
        return this.airwaybillOId;
    }

    public void setAirwaybillOId(final long pAirwaybillOId) {
        this.airwaybillOId = pAirwaybillOId;
    }

    private String getRoundUp(final String pString) {
        StringBuffer aReturnValue = new StringBuffer();
        if (pString != null && !(pString.equals(""))) {
            StringTokenizer tokenizer = new StringTokenizer(pString, ".");
            if (tokenizer.countTokens() > 1) {
                aReturnValue.append(tokenizer.nextToken());
                aReturnValue.append(".");
                String decimals = tokenizer.nextToken();
                if (decimals.length() > 2) {
                    aReturnValue.append(decimals.substring(0, 2));
                }
                else {
                    aReturnValue.append(decimals);
                }

            }
            else {
                String aValue = tokenizer.nextToken();
                if (aValue.equals("0")) {
                    aReturnValue.append("");
                }
                else {
                    aReturnValue.append(aValue);
                }
            }
        }
        else {
            aReturnValue.append("");
        }
        return aReturnValue.toString();
    }

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(final String pPriority) {
        this.priority = pPriority;
    }

    /**
     * Gets the <code>creationDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>creationDate</code> property.
     */
    public Date getCreationDate() {
        return ContractUtility.getClonedDate(this.creationDate);
    }

    /**
     * Sets the <code>creationDate</code>.
     * <p>
     * 
     * @param pCreationDate
     *            holds the new value of <code>creationDate</code>
     */
    public void setCreationDate(final Date pCreationDate) {
        this.creationDate = ContractUtility.getClonedDate(pCreationDate);
    }
    
	public BigDecimal getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(BigDecimal grossWeight) {
		this.grossWeight = grossWeight;
	}
}
