package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AuditStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ExportPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.FWBType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.GenIdType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.HurdleRateReasonType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ImportPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InternationalAWBType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PadType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ProrationType;
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

/**
 * The type Flown segment revenue dto.
 *
 * @author KurmalNG
 */
public class FlownSegmentRevenueDto extends PersistenceObjectDto {
	private static final long serialVersionUID = 1L;
	
	private static final String EMPTY_STRING = "";
	
	private Long oId;

	/**
	 * The Specific airline.
	 */
	String specificAirline;

	/**
	 * Gets specific airline.
	 *
	 * @return the specific airline
	 */
	public String getSpecificAirline() {
		return specificAirline;
	}

	/**
	 * Sets specific airline.
	 *
	 * @param specificAirline the specific airline
	 */
	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}

	//Online Proration Detail
	private BigDecimal carrierRevenue;
	private BigDecimal carrierRevenueProrCurrency;
	private BigDecimal chargeableWeight;
	private String flightNumber;
	private Date flightDate;
	private String flightDateFormatted;
	private BigDecimal grossWeight;
	private ProrationType onlineProrationReasonCode;
	private String onlineProrationReasonCodeString;
	private BigDecimal otherChargeDueAgent;
	private BigDecimal otherChargeDueCarrier;
	private BigDecimal otherChargeDueAgentProrCurrency;
	private BigDecimal otherChargeDueCarrierProrCurrency;
	private BigDecimal vat;
	private BigDecimal commission;
	private BigDecimal freightCharges;
	private BigDecimal valuationCharge;
	private BigDecimal percentageOfSegmentMileage;
	private Integer pieces;
	private BigDecimal proratedChargeableWeight;
	private String segmentDestination;
	private BigDecimal segmentMileage;
	private String segmentOrigin;
	private BigDecimal segmentYield;
	private BigDecimal segmentYieldProrcurrency;
	//Run Time Parameters
	private String currencyCode;
	private String carrierCode;
	//Online proration ends Here
	

	
	

	
	private Date startDate;
	
	private Date endDate;
	
	
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
	
	
	
	
	private VolumeEvaluationMethodType volumeEvaluationMethod;

	private String accountingStatus;
	
	private int numberOfRecordsPerPage;
	private int pageNumber;
	private int totalNumberofRecords;

	private String reportType;

	private String dateType;

	private String revenueType;

	private boolean downloadAll;

	private String host;

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Gets pieces.
	 *
	 * @return the pieces
	 */
	public Integer getPieces() {
		return pieces;
	}

	/**
	 * Sets pieces.
	 *
	 * @param pieces the pieces
	 */
	public void setPieces(Integer pieces) {
		this.pieces = pieces;
	}

	/**
	 * Gets currency code.
	 *
	 * @return the currency code
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * Sets currency code.
	 *
	 * @param currencyCode the currency code
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * Gets gross weight.
	 *
	 * @return the gross weight
	 */
	public BigDecimal getGrossWeight() {
		if(grossWeight != null)
			 grossWeight = grossWeight.setScale(2, BigDecimal.ROUND_HALF_UP);
		return grossWeight;
	}

	/**
	 * Sets gross weight.
	 *
	 * @param grossWeight the gross weight
	 */
	public void setGrossWeight(BigDecimal grossWeight) {
		this.grossWeight = grossWeight;
	}

	/**
	 * Gets vat.
	 *
	 * @return the vat
	 */
	public BigDecimal getVat() {
		if(vat == null){
			vat = new BigDecimal(0);
		}
		 else if(vat != null)
			 vat = vat.setScale(2, BigDecimal.ROUND_HALF_UP);
		return vat;
	}

	/**
	 * Sets vat.
	 *
	 * @param vat the vat
	 */
	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}

	/**
	 * Gets commission.
	 *
	 * @return the commission
	 */
	public BigDecimal getCommission() {
	   if(commission == null){
		   commission = new BigDecimal(0);
		}
	   else if(commission != null)
		   commission = commission.setScale(2, BigDecimal.ROUND_HALF_UP);
		return commission;
	}

	/**
	 * Sets commission.
	 *
	 * @param commission the commission
	 */
	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	/**
	 * Gets freight charges.
	 *
	 * @return the freight charges
	 */
	public BigDecimal getFreightCharges() {
		if(freightCharges == null){
			freightCharges = new BigDecimal(0);
		}
		else if(freightCharges != null)
			freightCharges = freightCharges.setScale(2, BigDecimal.ROUND_HALF_UP);
		return freightCharges;
	}

	/**
	 * Sets freight charges.
	 *
	 * @param freightCharges the freight charges
	 */
	public void setFreightCharges(BigDecimal freightCharges) {
		this.freightCharges = freightCharges;
	}

	/**
	 * Gets valuation charges.
	 *
	 * @return the valuation charges
	 */
	public BigDecimal getValuationCharges() {
		if(valuationCharges == null){
			valuationCharges = new BigDecimal(0);
		}
		else if(valuationCharges != null)
			valuationCharges = valuationCharges.setScale(2, BigDecimal.ROUND_HALF_UP);
		return valuationCharges;
	}

	/**
	 * Sets valuation charges.
	 *
	 * @param valuationCharges the valuation charges
	 */
	public void setValuationCharges(BigDecimal valuationCharges) {
		this.valuationCharges = valuationCharges;
	}

	/**
	 * Gets other charge due agent.
	 *
	 * @return the other charge due agent
	 */
	public BigDecimal getOtherChargeDueAgent() {
		if(otherChargeDueAgent == null){ 
		   otherChargeDueAgent = new BigDecimal(0);
		}
		else if(otherChargeDueAgent != null)
			otherChargeDueAgent = otherChargeDueAgent.setScale(2, BigDecimal.ROUND_HALF_UP);
		return otherChargeDueAgent;
	}

	/**
	 * Sets other charge due agent.
	 *
	 * @param otherChargeDueAgent the other charge due agent
	 */
	public void setOtherChargeDueAgent(BigDecimal otherChargeDueAgent) {
		this.otherChargeDueAgent = otherChargeDueAgent;
	}

	/**
	 * Gets other charge due carrier.
	 *
	 * @return the other charge due carrier
	 */
	public BigDecimal getOtherChargeDueCarrier() {
		if(otherChargeDueCarrier == null){ 
			otherChargeDueCarrier = new BigDecimal(0);
			}
		else if(otherChargeDueCarrier != null)
			otherChargeDueCarrier = otherChargeDueCarrier.setScale(2, BigDecimal.ROUND_HALF_UP);
		return otherChargeDueCarrier;
	}

	/**
	 * Sets other charge due carrier.
	 *
	 * @param otherChargeDueCarrier the other charge due carrier
	 */
	public void setOtherChargeDueCarrier(BigDecimal otherChargeDueCarrier) {
		this.otherChargeDueCarrier = otherChargeDueCarrier;
	}

	/**
	 * Gets carrier code.
	 *
	 * @return the carrier code
	 */
	public String getCarrierCode() {
		return carrierCode;
	}

	/**
	 * Sets carrier code.
	 *
	 * @param carrierCode the carrier code
	 */
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	/**
	 * Gets id.
	 *
	 * @return the id
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * Sets id.
	 *
	 * @param oId the o id
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

	/**
	 * Gets segment origin.
	 *
	 * @return the segment origin
	 */
	public String getSegmentOrigin() {
		return segmentOrigin;
	}

	/**
	 * Sets segment origin.
	 *
	 * @param segmentOrigin the segment origin
	 */
	public void setSegmentOrigin(String segmentOrigin) {
		if(segmentOrigin!=null)
			segmentOrigin = segmentOrigin.toUpperCase();
		this.segmentOrigin = segmentOrigin;
	}

	/**
	 * Gets segment destination.
	 *
	 * @return the segment destination
	 */
	public String getSegmentDestination() {
		return segmentDestination;
	}

	/**
	 * Sets segment destination.
	 *
	 * @param segmentDestination the segment destination
	 */
	public void setSegmentDestination(String segmentDestination) {
		if(segmentDestination!=null)
			segmentDestination = segmentDestination.toUpperCase();
		this.segmentDestination = segmentDestination;
	}

	/**
	 * Gets start date.
	 *
	 * @return the start date
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Sets start date.
	 *
	 * @param startDate the start date
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Gets end date.
	 *
	 * @return the end date
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Sets end date.
	 *
	 * @param endDate the end date
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Gets flight number.
	 *
	 * @return the flight number
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * Sets flight number.
	 *
	 * @param flightNumber the flight number
	 */
	public void setFlightNumber(String flightNumber) {
		if(flightNumber!=null)
			flightNumber = flightNumber.toUpperCase();
		this.flightNumber = flightNumber;
	}

	/**
	 * Gets flight date.
	 *
	 * @return the flight date
	 */
	public Date getFlightDate() {
		return flightDate;
	}

	/**
	 * Sets flight date.
	 *
	 * @param flightDate the flight date
	 */
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	/**
	 * Gets carrier revenue.
	 *
	 * @return the carrier revenue
	 */
	public BigDecimal getCarrierRevenue() {
		/*if(carrierRevenue != null)
			carrierRevenue = carrierRevenue.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return carrierRevenue;
	}

	/**
	 * Sets carrier revenue.
	 *
	 * @param carrierRevenue the carrier revenue
	 */
	public void setCarrierRevenue(BigDecimal carrierRevenue) {
		this.carrierRevenue = carrierRevenue;
	}

	/**
	 * Gets chargeable weight.
	 *
	 * @return the chargeable weight
	 */
	public BigDecimal getChargeableWeight() {
		if(chargeableWeight != null)
			chargeableWeight = chargeableWeight.setScale(2, BigDecimal.ROUND_HALF_UP);
		return chargeableWeight;
	}

	/**
	 * Sets chargeable weight.
	 *
	 * @param chargeableWeight the chargeable weight
	 */
	public void setChargeableWeight(BigDecimal chargeableWeight) {
		this.chargeableWeight = chargeableWeight;
	}

	/**
	 * Gets segment yield.
	 *
	 * @return the segment yield
	 */
	public BigDecimal getSegmentYield() {
		/*if(segmentYield != null)
			segmentYield = segmentYield.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return segmentYield;
	}

	/**
	 * Sets segment yield.
	 *
	 * @param segmentYield the segment yield
	 */
	public void setSegmentYield(BigDecimal segmentYield) {
		this.segmentYield = segmentYield;
	}

	/**
	 * Gets segment mileage.
	 *
	 * @return the segment mileage
	 */
	public BigDecimal getSegmentMileage() {
		if(segmentMileage != null)
			segmentMileage = segmentMileage.setScale(2, BigDecimal.ROUND_HALF_UP);
		return segmentMileage;
	}

	/**
	 * Sets segment mileage.
	 *
	 * @param segmentMileage the segment mileage
	 */
	public void setSegmentMileage(BigDecimal segmentMileage) {
		this.segmentMileage = segmentMileage;
	}

	/**
	 * Gets percentage of segment mileage.
	 *
	 * @return the percentage of segment mileage
	 */
	public BigDecimal getPercentageOfSegmentMileage() {
		if(percentageOfSegmentMileage != null)
			percentageOfSegmentMileage = percentageOfSegmentMileage.setScale(2, BigDecimal.ROUND_HALF_UP);
		return percentageOfSegmentMileage;
	}

	/**
	 * Sets percentage of segment mileage.
	 *
	 * @param percentageOfSegmentMileage the percentage of segment mileage
	 */
	public void setPercentageOfSegmentMileage(BigDecimal percentageOfSegmentMileage) {
		this.percentageOfSegmentMileage = percentageOfSegmentMileage;
	}

	/**
	 * Gets awb number.
	 *
	 * @return the awb number
	 */
	public String getAwbNumber() {
		return awbNumber;
	}

	/**
	 * Sets awb number.
	 *
	 * @param awbNumber the awb number
	 */
	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}

	/**
	 * Gets valuation charge.
	 *
	 * @return the valuation charge
	 */
	public BigDecimal getValuationCharge() {
		if(valuationCharge != null)
			valuationCharge = valuationCharge.setScale(2, BigDecimal.ROUND_HALF_UP);
		return valuationCharge;
	}

	/**
	 * Sets valuation charge.
	 *
	 * @param valuationCharge the valuation charge
	 */
	public void setValuationCharge(BigDecimal valuationCharge) {
		this.valuationCharge = valuationCharge;
	}

	/**
	 * Gets origin station.
	 *
	 * @return the origin station
	 */
	public String getOriginStation() {
		return originStation;
	}

	/**
	 * Sets origin station.
	 *
	 * @param originStation the origin station
	 */
	public void setOriginStation(String originStation) {
		this.originStation = originStation;
	}

	/**
	 * Gets destination station.
	 *
	 * @return the destination station
	 */
	public String getDestinationStation() {
		return destinationStation;
	}

	/**
	 * Sets destination station.
	 *
	 * @param destinationStation the destination station
	 */
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	/**
	 * Gets execution date.
	 *
	 * @return the execution date
	 */
	public Date getExecutionDate() {
		return executionDate;
	}

	/**
	 * Sets execution date.
	 *
	 * @param executionDate the execution date
	 */
	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}

	/**
	 * Gets execution date formatted.
	 *
	 * @return the execution date formatted
	 */
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

	/**
	 * Sets execution date formatted.
	 *
	 * @param executionDateFormatted the execution date formatted
	 */
	public void setExecutionDateFormatted(String executionDateFormatted) {
		this.executionDateFormatted = executionDateFormatted;
	}

	/**
	 * Gets product code.
	 *
	 * @return the product code
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * Sets product code.
	 *
	 * @param productCode the product code
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * Gets priority.
	 *
	 * @return the priority
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * Sets priority.
	 *
	 * @param priority the priority
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/**
	 * Gets export paycode.
	 *
	 * @return the export paycode
	 */
	public ExportPaymentType getExportPaycode() {
		return exportPaycode;
	}

	/**
	 * Sets export paycode.
	 *
	 * @param exportPaycode the export paycode
	 */
	public void setExportPaycode(ExportPaymentType exportPaycode) {
		this.exportPaycode = exportPaycode;
	}

	/**
	 * Gets creation date.
	 *
	 * @return the creation date
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * Sets creation date.
	 *
	 * @param creationDate the creation date
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * Gets creation date formatted.
	 *
	 * @return the creation date formatted
	 */
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

	/**
	 * Sets creation date formatted.
	 *
	 * @param creationDateFormatted the creation date formatted
	 */
	public void setCreationDateFormatted(String creationDateFormatted) {
		this.creationDateFormatted = creationDateFormatted;
	}

	/**
	 * Gets customs station.
	 *
	 * @return the customs station
	 */
	public String getCustomsStation() {
		return customsStation;
	}

	/**
	 * Sets customs station.
	 *
	 * @param customsStation the customs station
	 */
	public void setCustomsStation(String customsStation) {
		this.customsStation = customsStation;
	}

	/**
	 * Gets wb type.
	 *
	 * @return the wb type
	 */
	public FWBType getfWBType() {
		return fWBType;
	}

	/**
	 * Sets wb type.
	 *
	 * @param fWBType the f wb type
	 */
	public void setfWBType(FWBType fWBType) {
		this.fWBType = fWBType;
	}

	/**
	 * Gets declared value.
	 *
	 * @return the declared value
	 */
	public String getDeclaredValue() {
		return declaredValue;
	}

	/**
	 * Sets declared value.
	 *
	 * @param declaredValue the declared value
	 */
	public void setDeclaredValue(String declaredValue) {
		this.declaredValue = declaredValue;
	}

	/**
	 * Gets customs value.
	 *
	 * @return the customs value
	 */
	public String getCustomsValue() {
		return customsValue;
	}

	/**
	 * Sets customs value.
	 *
	 * @param customsValue the customs value
	 */
	public void setCustomsValue(String customsValue) {
		this.customsValue = customsValue;
	}

	/**
	 * Gets insurance value.
	 *
	 * @return the insurance value
	 */
	public String getInsuranceValue() {
		return insuranceValue;
	}

	/**
	 * Sets insurance value.
	 *
	 * @param insuranceValue the insurance value
	 */
	public void setInsuranceValue(String insuranceValue) {
		this.insuranceValue = insuranceValue;
	}

	/**
	 * Gets insurance code.
	 *
	 * @return the insurance code
	 */
	public String getInsuranceCode() {
		return insuranceCode;
	}

	/**
	 * Sets insurance code.
	 *
	 * @param insuranceCode the insurance code
	 */
	public void setInsuranceCode(String insuranceCode) {
		this.insuranceCode = insuranceCode;
	}

	/**
	 * Gets origin currency.
	 *
	 * @return the origin currency
	 */
	public String getOriginCurrency() {
		return originCurrency;
	}

	/**
	 * Sets origin currency.
	 *
	 * @param originCurrency the origin currency
	 */
	public void setOriginCurrency(String originCurrency) {
		this.originCurrency = originCurrency;
	}

	/**
	 * Gets destination currency.
	 *
	 * @return the destination currency
	 */
	public String getDestinationCurrency() {
		return destinationCurrency;
	}

	/**
	 * Sets destination currency.
	 *
	 * @param destinationCurrency the destination currency
	 */
	public void setDestinationCurrency(String destinationCurrency) {
		this.destinationCurrency = destinationCurrency;
	}

	/**
	 * Gets unit of weight.
	 *
	 * @return the unit of weight
	 */
	public WeightUOMType getUnitOfWeight() {
		return unitOfWeight;
	}

	/**
	 * Sets unit of weight.
	 *
	 * @param unitOfWeight the unit of weight
	 */
	public void setUnitOfWeight(WeightUOMType unitOfWeight) {
		this.unitOfWeight = unitOfWeight;
	}

	/**
	 * Gets pricing date.
	 *
	 * @return the pricing date
	 */
	public Date getPricingDate() {
		return pricingDate;
	}

	/**
	 * Sets pricing date.
	 *
	 * @param pricingDate the pricing date
	 */
	public void setPricingDate(Date pricingDate) {
		this.pricingDate = pricingDate;
	}

	/**
	 * Gets pricing date formatted.
	 *
	 * @return the pricing date formatted
	 */
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

	/**
	 * Sets pricing date formatted.
	 *
	 * @param pricingDateFormatted the pricing date formatted
	 */
	public void setPricingDateFormatted(String pricingDateFormatted) {
		this.pricingDateFormatted = pricingDateFormatted;
	}

	/**
	 * Gets dimensional weight.
	 *
	 * @return the dimensional weight
	 */
	public BigDecimal getDimensionalWeight() {
		if(dimensionalWeight != null)
			dimensionalWeight = dimensionalWeight.setScale(2, BigDecimal.ROUND_HALF_UP);
		return dimensionalWeight;
	}

	/**
	 * Sets dimensional weight.
	 *
	 * @param dimensionalWeight the dimensional weight
	 */
	public void setDimensionalWeight(BigDecimal dimensionalWeight) {
		this.dimensionalWeight = dimensionalWeight;
	}

	/**
	 * Gets volume.
	 *
	 * @return the volume
	 */
	public Integer getVolume() {
		return volume;
	}

	/**
	 * Sets volume.
	 *
	 * @param volume the volume
	 */
	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	/**
	 * Gets volume evaluation method.
	 *
	 * @return the volume evaluation method
	 */
	public VolumeEvaluationMethodType getVolumeEvaluationMethod() {
		return volumeEvaluationMethod;
	}

	/**
	 * Sets volume evaluation method.
	 *
	 * @param volumeEvaluationMethod the volume evaluation method
	 */
	public void setVolumeEvaluationMethod(
			VolumeEvaluationMethodType volumeEvaluationMethod) {
		this.volumeEvaluationMethod = volumeEvaluationMethod;
	}

	/**
	 * Gets volume evaluation method string.
	 *
	 * @return the volume evaluation method string
	 */
	public String getVolumeEvaluationMethodString() {
		if(this.getVolumeEvaluationMethod()!=null)
		{
			volumeEvaluationMethodString = this.getVolumeEvaluationMethod().getUnit();
		}
		return volumeEvaluationMethodString;
	}

	/**
	 * Sets volume evaluation method string.
	 *
	 * @param volumeEvaluationMethodString the volume evaluation method string
	 */
	public void setVolumeEvaluationMethodString(
			String volumeEvaluationMethodString) {
		this.volumeEvaluationMethodString = volumeEvaluationMethodString;
	}

	/**
	 * Gets booking event gross revenue.
	 *
	 * @return the booking event gross revenue
	 */
	public BigDecimal getBookingEventGrossRevenue() {
		/*if(bookingEventGrossRevenue != null)
			bookingEventGrossRevenue = bookingEventGrossRevenue.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return bookingEventGrossRevenue;
	}

	/**
	 * Sets booking event gross revenue.
	 *
	 * @param bookingEventGrossRevenue the booking event gross revenue
	 */
	public void setBookingEventGrossRevenue(BigDecimal bookingEventGrossRevenue) {
		this.bookingEventGrossRevenue = bookingEventGrossRevenue;
	}

	/**
	 * Gets booking event host revenue.
	 *
	 * @return the booking event host revenue
	 */
	public BigDecimal getBookingEventHostRevenue() {
		/*if(bookingEventHostRevenue != null)
			bookingEventHostRevenue = bookingEventHostRevenue.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return bookingEventHostRevenue;
	}

	/**
	 * Sets booking event host revenue.
	 *
	 * @param bookingEventHostRevenue the booking event host revenue
	 */
	public void setBookingEventHostRevenue(BigDecimal bookingEventHostRevenue) {
		this.bookingEventHostRevenue = bookingEventHostRevenue;
	}

	/**
	 * Gets booking event hurdle amount.
	 *
	 * @return the booking event hurdle amount
	 */
	public BigDecimal getBookingEventHurdleAmount() {
		/*if(bookingEventHurdleAmount != null)
			bookingEventHurdleAmount = bookingEventHurdleAmount.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return bookingEventHurdleAmount;
	}

	/**
	 * Sets booking event hurdle amount.
	 *
	 * @param bookingEventHurdleAmount the booking event hurdle amount
	 */
	public void setBookingEventHurdleAmount(BigDecimal bookingEventHurdleAmount) {
		this.bookingEventHurdleAmount = bookingEventHurdleAmount;
	}

	/**
	 * Gets booking event hurdle rate.
	 *
	 * @return the booking event hurdle rate
	 */
	public BigDecimal getBookingEventHurdleRate() {
		if(bookingEventHurdleRate != null)
			bookingEventHurdleRate = bookingEventHurdleRate.setScale(2, BigDecimal.ROUND_HALF_UP);
		return bookingEventHurdleRate;
	}

	/**
	 * Sets booking event hurdle rate.
	 *
	 * @param bookingEventHurdleRate the booking event hurdle rate
	 */
	public void setBookingEventHurdleRate(BigDecimal bookingEventHurdleRate) {
		this.bookingEventHurdleRate = bookingEventHurdleRate;
	}

	/**
	 * Gets booking event total rate.
	 *
	 * @return the booking event total rate
	 */
	public BigDecimal getBookingEventTotalRate() {
		if(bookingEventTotalRate != null)
			bookingEventTotalRate = bookingEventTotalRate.setScale(2, BigDecimal.ROUND_HALF_UP);
		return bookingEventTotalRate;
	}

	/**
	 * Sets booking event total rate.
	 *
	 * @param bookingEventTotalRate the booking event total rate
	 */
	public void setBookingEventTotalRate(BigDecimal bookingEventTotalRate) {
		this.bookingEventTotalRate = bookingEventTotalRate;
	}

	/**
	 * Gets booking event cost amount.
	 *
	 * @return the booking event cost amount
	 */
	public BigDecimal getBookingEventCostAmount() {
		/*if(bookingEventCostAmount != null)
			bookingEventCostAmount = bookingEventCostAmount.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return bookingEventCostAmount;
	}

	/**
	 * Sets booking event cost amount.
	 *
	 * @param bookingEventCostAmount the booking event cost amount
	 */
	public void setBookingEventCostAmount(BigDecimal bookingEventCostAmount) {
		this.bookingEventCostAmount = bookingEventCostAmount;
	}

	/**
	 * Gets booking event cost rate.
	 *
	 * @return the booking event cost rate
	 */
	public BigDecimal getBookingEventCostRate() {
		if(bookingEventCostRate != null)
			bookingEventCostRate = bookingEventCostRate.setScale(2, BigDecimal.ROUND_HALF_UP);
		return bookingEventCostRate;
	}

	/**
	 * Sets booking event cost rate.
	 *
	 * @param bookingEventCostRate the booking event cost rate
	 */
	public void setBookingEventCostRate(BigDecimal bookingEventCostRate) {
		this.bookingEventCostRate = bookingEventCostRate;
	}

	/**
	 * Gets booking event revenue rate.
	 *
	 * @return the booking event revenue rate
	 */
	public BigDecimal getBookingEventRevenueRate() {
		if(bookingEventRevenueRate != null)
			bookingEventRevenueRate = bookingEventRevenueRate.setScale(2, BigDecimal.ROUND_HALF_UP);
		return bookingEventRevenueRate;
	}

	/**
	 * Sets booking event revenue rate.
	 *
	 * @param bookingEventRevenueRate the booking event revenue rate
	 */
	public void setBookingEventRevenueRate(BigDecimal bookingEventRevenueRate) {
		this.bookingEventRevenueRate = bookingEventRevenueRate;
	}

	/**
	 * Gets booking event product.
	 *
	 * @return the booking event product
	 */
	public String getBookingEventProduct() {
		return bookingEventProduct;
	}

	/**
	 * Sets booking event product.
	 *
	 * @param bookingEventProduct the booking event product
	 */
	public void setBookingEventProduct(String bookingEventProduct) {
		this.bookingEventProduct = bookingEventProduct;
	}

	/**
	 * Gets booking event hurdle rate status.
	 *
	 * @return the booking event hurdle rate status
	 */
	public String getBookingEventHurdleRateStatus() {
		return bookingEventHurdleRateStatus;
	}

	/**
	 * Sets booking event hurdle rate status.
	 *
	 * @param bookingEventHurdleRateStatus the booking event hurdle rate status
	 */
	public void setBookingEventHurdleRateStatus(String bookingEventHurdleRateStatus) {
		this.bookingEventHurdleRateStatus = bookingEventHurdleRateStatus;
	}

	/**
	 * Gets booking event hurdle rate reason code.
	 *
	 * @return the booking event hurdle rate reason code
	 */
	public HurdleRateReasonType getBookingEventHurdleRateReasonCode() {
		return bookingEventHurdleRateReasonCode;
	}

	/**
	 * Sets booking event hurdle rate reason code.
	 *
	 * @param bookingEventHurdleRateReasonCode the booking event hurdle rate reason code
	 */
	public void setBookingEventHurdleRateReasonCode(
			HurdleRateReasonType bookingEventHurdleRateReasonCode) {
		this.bookingEventHurdleRateReasonCode = bookingEventHurdleRateReasonCode;
	}

	/**
	 * Gets booking event hurdle rate reason code string.
	 *
	 * @return the booking event hurdle rate reason code string
	 */
	public String getBookingEventHurdleRateReasonCodeString() {
		if(this.getBookingEventHurdleRateReasonCode()!=null)
			bookingEventHurdleRateReasonCodeString = this.getBookingEventHurdleRateReasonCode().getVal();
		return bookingEventHurdleRateReasonCodeString;
	}

	/**
	 * Sets booking event hurdle rate reason code string.
	 *
	 * @param bookingEventHurdleRateReasonCodeString the booking event hurdle rate reason code string
	 */
	public void setBookingEventHurdleRateReasonCodeString(
			String bookingEventHurdleRateReasonCodeString) {
		this.bookingEventHurdleRateReasonCodeString = bookingEventHurdleRateReasonCodeString;
	}

	/**
	 * Gets act weight charge.
	 *
	 * @return the act weight charge
	 */
	public BigDecimal getActWeightCharge() {
		/*if(actWeightCharge != null)
			actWeightCharge = actWeightCharge.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return actWeightCharge;
	}

	/**
	 * Sets act weight charge.
	 *
	 * @param actWeightCharge the act weight charge
	 */
	public void setActWeightCharge(BigDecimal actWeightCharge) {
		this.actWeightCharge = actWeightCharge;
	}

	/**
	 * Gets act prepaid charge.
	 *
	 * @return the act prepaid charge
	 */
	public BigDecimal getActPrepaidCharge() {
		/*if(actPrepaidCharge != null)
			actPrepaidCharge = actPrepaidCharge.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return actPrepaidCharge;
	}

	/**
	 * Sets act prepaid charge.
	 *
	 * @param actPrepaidCharge the act prepaid charge
	 */
	public void setActPrepaidCharge(BigDecimal actPrepaidCharge) {
		this.actPrepaidCharge = actPrepaidCharge;
	}

	/**
	 * Gets act collect charge.
	 *
	 * @return the act collect charge
	 */
	public BigDecimal getActCollectCharge() {
		/*if(actCollectCharge != null)
			actCollectCharge = actCollectCharge.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return actCollectCharge;
	}

	/**
	 * Sets act collect charge.
	 *
	 * @param actCollectCharge the act collect charge
	 */
	public void setActCollectCharge(BigDecimal actCollectCharge) {
		this.actCollectCharge = actCollectCharge;
	}

	/**
	 * Gets cod charges.
	 *
	 * @return the cod charges
	 */
	public BigDecimal getCodCharges() {
		/*if(codCharges != null)
			codCharges = codCharges.setScale(2, BigDecimal.ROUND_HALF_UP);*/
		return codCharges;
	}

	/**
	 * Sets cod charges.
	 *
	 * @param codCharges the cod charges
	 */
	public void setCodCharges(BigDecimal codCharges) {
		this.codCharges = codCharges;
	}

	/**
	 * Gets accounting status.
	 *
	 * @return the accounting status
	 */
	public String getAccountingStatus() {
		return accountingStatus;
	}

	/**
	 * Sets accounting status.
	 *
	 * @param accountingStatus the accounting status
	 */
	public void setAccountingStatus(String accountingStatus) {
		this.accountingStatus = accountingStatus;
	}

	/**
	 * Gets flight date formatted.
	 *
	 * @return the flight date formatted
	 */
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

	/**
	 * Sets flight date formatted.
	 *
	 * @param flightDateFormatted the flight date formatted
	 */
	public void setFlightDateFormatted(String flightDateFormatted) {
		this.flightDateFormatted = flightDateFormatted;
	}
	
	
	//Getters Setters for AWB and Online Proration Object Updated

	/**
	 * Gets carrier revenue pror currency.
	 *
	 * @return the carrier revenue pror currency
	 */
	public BigDecimal getCarrierRevenueProrCurrency() {
		return carrierRevenueProrCurrency;
	}

	/**
	 * Sets carrier revenue pror currency.
	 *
	 * @param carrierRevenueProrCurrency the carrier revenue pror currency
	 */
	public void setCarrierRevenueProrCurrency(BigDecimal carrierRevenueProrCurrency) {
		this.carrierRevenueProrCurrency = carrierRevenueProrCurrency;
	}

	/**
	 * Gets online proration reason code.
	 *
	 * @return the online proration reason code
	 */
	public ProrationType getOnlineProrationReasonCode() {
		return onlineProrationReasonCode;
	}

	/**
	 * Sets online proration reason code.
	 *
	 * @param onlineProrationReasonCode the online proration reason code
	 */
	public void setOnlineProrationReasonCode(ProrationType onlineProrationReasonCode) {
		this.onlineProrationReasonCode = onlineProrationReasonCode;
	}

	/**
	 * Gets other charge due agent pror currency.
	 *
	 * @return the other charge due agent pror currency
	 */
	public BigDecimal getOtherChargeDueAgentProrCurrency() {
		return otherChargeDueAgentProrCurrency;
	}

	/**
	 * Sets other charge due agent pror currency.
	 *
	 * @param otherChargeDueAgentProrCurrency the other charge due agent pror currency
	 */
	public void setOtherChargeDueAgentProrCurrency(
			BigDecimal otherChargeDueAgentProrCurrency) {
		this.otherChargeDueAgentProrCurrency = otherChargeDueAgentProrCurrency;
	}

	/**
	 * Gets other charge due carrier pror currency.
	 *
	 * @return the other charge due carrier pror currency
	 */
	public BigDecimal getOtherChargeDueCarrierProrCurrency() {
		return otherChargeDueCarrierProrCurrency;
	}

	/**
	 * Sets other charge due carrier pror currency.
	 *
	 * @param otherChargeDueCarrierProrCurrency the other charge due carrier pror currency
	 */
	public void setOtherChargeDueCarrierProrCurrency(
			BigDecimal otherChargeDueCarrierProrCurrency) {
		this.otherChargeDueCarrierProrCurrency = otherChargeDueCarrierProrCurrency;
	}

	/**
	 * Gets prorated chargeable weight.
	 *
	 * @return the prorated chargeable weight
	 */
	public BigDecimal getProratedChargeableWeight() {
		return proratedChargeableWeight;
	}

	/**
	 * Sets prorated chargeable weight.
	 *
	 * @param proratedChargeableWeight the prorated chargeable weight
	 */
	public void setProratedChargeableWeight(BigDecimal proratedChargeableWeight) {
		this.proratedChargeableWeight = proratedChargeableWeight;
	}

	/**
	 * Gets segment yield prorcurrency.
	 *
	 * @return the segment yield prorcurrency
	 */
	public BigDecimal getSegmentYieldProrcurrency() {
		return segmentYieldProrcurrency;
	}

	/**
	 * Sets segment yield prorcurrency.
	 *
	 * @param segmentYieldProrcurrency the segment yield prorcurrency
	 */
	public void setSegmentYieldProrcurrency(BigDecimal segmentYieldProrcurrency) {
		this.segmentYieldProrcurrency = segmentYieldProrcurrency;
	}

	/**
	 * Gets accounting remarks.
	 *
	 * @return the accounting remarks
	 */
	public String getAccountingRemarks() {
		return accountingRemarks;
	}

	/**
	 * Sets accounting remarks.
	 *
	 * @param accountingRemarks the accounting remarks
	 */
	public void setAccountingRemarks(String accountingRemarks) {
		this.accountingRemarks = accountingRemarks;
	}

	/**
	 * Gets consignee remarks 1.
	 *
	 * @return the consignee remarks 1
	 */
	public String getConsigneeRemarks1() {
		return consigneeRemarks1;
	}

	/**
	 * Sets consignee remarks 1.
	 *
	 * @param consigneeRemarks1 the consignee remarks 1
	 */
	public void setConsigneeRemarks1(String consigneeRemarks1) {
		this.consigneeRemarks1 = consigneeRemarks1;
	}

	/**
	 * Gets consignee remarks 2.
	 *
	 * @return the consignee remarks 2
	 */
	public String getConsigneeRemarks2() {
		return consigneeRemarks2;
	}

	/**
	 * Sets consignee remarks 2.
	 *
	 * @param consigneeRemarks2 the consignee remarks 2
	 */
	public void setConsigneeRemarks2(String consigneeRemarks2) {
		this.consigneeRemarks2 = consigneeRemarks2;
	}

	/**
	 * Is contract sra applies indicator boolean.
	 *
	 * @return the boolean
	 */
	public boolean isContractSRAAppliesIndicator() {
		return contractSRAAppliesIndicator;
	}

	/**
	 * Sets contract sra applies indicator.
	 *
	 * @param contractSRAAppliesIndicator the contract sra applies indicator
	 */
	public void setContractSRAAppliesIndicator(boolean contractSRAAppliesIndicator) {
		this.contractSRAAppliesIndicator = contractSRAAppliesIndicator;
	}

	/**
	 * Gets cross reference 1.
	 *
	 * @return the cross reference 1
	 */
	public String getCrossReference1() {
		return crossReference1;
	}

	/**
	 * Sets cross reference 1.
	 *
	 * @param crossReference1 the cross reference 1
	 */
	public void setCrossReference1(String crossReference1) {
		this.crossReference1 = crossReference1;
	}

	/**
	 * Gets cross reference 2.
	 *
	 * @return the cross reference 2
	 */
	public String getCrossReference2() {
		return crossReference2;
	}

	/**
	 * Sets cross reference 2.
	 *
	 * @param crossReference2 the cross reference 2
	 */
	public void setCrossReference2(String crossReference2) {
		this.crossReference2 = crossReference2;
	}

	/**
	 * Gets destination carrier.
	 *
	 * @return the destination carrier
	 */
	public String getDestinationCarrier() {
		return destinationCarrier;
	}

	/**
	 * Sets destination carrier.
	 *
	 * @param destinationCarrier the destination carrier
	 */
	public void setDestinationCarrier(String destinationCarrier) {
		this.destinationCarrier = destinationCarrier;
	}

	/**
	 * Gets discrepancies.
	 *
	 * @return the discrepancies
	 */
	public String getDiscrepancies() {
		return discrepancies;
	}

	/**
	 * Sets discrepancies.
	 *
	 * @param discrepancies the discrepancies
	 */
	public void setDiscrepancies(String discrepancies) {
		this.discrepancies = discrepancies;
	}

	/**
	 * Gets awb indicator.
	 *
	 * @return the awb indicator
	 */
	public Boolean geteAWBIndicator() {
		return eAWBIndicator;
	}

	/**
	 * Sets awb indicator.
	 *
	 * @param eAWBIndicator the e awb indicator
	 */
	public void seteAWBIndicator(Boolean eAWBIndicator) {
		this.eAWBIndicator = eAWBIndicator;
	}

	/**
	 * Gets exchange rate.
	 *
	 * @return the exchange rate
	 */
	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	/**
	 * Sets exchange rate.
	 *
	 * @param exchangeRate the exchange rate
	 */
	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	/**
	 * Gets export audit type.
	 *
	 * @return the export audit type
	 */
	public AuditStatusType getExportAuditType() {
		return exportAuditType;
	}

	/**
	 * Sets export audit type.
	 *
	 * @param exportAuditType the export audit type
	 */
	public void setExportAuditType(AuditStatusType exportAuditType) {
		this.exportAuditType = exportAuditType;
	}

	/**
	 * Gets export reporting station.
	 *
	 * @return the export reporting station
	 */
	public String getExportReportingStation() {
		return exportReportingStation;
	}

	/**
	 * Sets export reporting station.
	 *
	 * @param exportReportingStation the export reporting station
	 */
	public void setExportReportingStation(String exportReportingStation) {
		this.exportReportingStation = exportReportingStation;
	}

	/**
	 * Gets export reporting date.
	 *
	 * @return the export reporting date
	 */
	public Date getExportReportingDate() {
		return exportReportingDate;
	}

	/**
	 * Sets export reporting date.
	 *
	 * @param exportReportingDate the export reporting date
	 */
	public void setExportReportingDate(Date exportReportingDate) {
		this.exportReportingDate = exportReportingDate;
	}

	/**
	 * Gets export reporting date formatted.
	 *
	 * @return the export reporting date formatted
	 */
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

	/**
	 * Sets export reporting date formatted.
	 *
	 * @param exportReportingDateFormatted the export reporting date formatted
	 */
	public void setExportReportingDateFormatted(String exportReportingDateFormatted) {
		this.exportReportingDateFormatted = exportReportingDateFormatted;
	}

	/**
	 * Gets import reporting date.
	 *
	 * @return the import reporting date
	 */
	public Date getImportReportingDate() {
		return importReportingDate;
	}

	/**
	 * Sets import reporting date.
	 *
	 * @param importReportingDate the import reporting date
	 */
	public void setImportReportingDate(Date importReportingDate) {
		this.importReportingDate = importReportingDate;
	}

	/**
	 * Gets import reporting date formatted.
	 *
	 * @return the import reporting date formatted
	 */
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

	/**
	 * Sets import reporting date formatted.
	 *
	 * @param importReportingDateFormatted the import reporting date formatted
	 */
	public void setImportReportingDateFormatted(String importReportingDateFormatted) {
		this.importReportingDateFormatted = importReportingDateFormatted;
	}

	/**
	 * Gets notify date formatted.
	 *
	 * @return the notify date formatted
	 */
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

	/**
	 * Sets notify date formatted.
	 *
	 * @param notifyDateFormatted the notify date formatted
	 */
	public void setNotifyDateFormatted(String notifyDateFormatted) {
		this.notifyDateFormatted = notifyDateFormatted;
	}

	/**
	 * Gets import audit.
	 *
	 * @return the import audit
	 */
	public AuditStatusType getImportAudit() {
		return importAudit;
	}

	/**
	 * Sets import audit.
	 *
	 * @param importAudit the import audit
	 */
	public void setImportAudit(AuditStatusType importAudit) {
		this.importAudit = importAudit;
	}

	/**
	 * Gets import paycode.
	 *
	 * @return the import paycode
	 */
	public ImportPaymentType getImportPaycode() {
		return importPaycode;
	}

	/**
	 * Sets import paycode.
	 *
	 * @param importPaycode the import paycode
	 */
	public void setImportPaycode(ImportPaymentType importPaycode) {
		this.importPaycode = importPaycode;
	}

	/**
	 * Gets import reporting station.
	 *
	 * @return the import reporting station
	 */
	public String getImportReportingStation() {
		return importReportingStation;
	}

	/**
	 * Sets import reporting station.
	 *
	 * @param importReportingStation the import reporting station
	 */
	public void setImportReportingStation(String importReportingStation) {
		this.importReportingStation = importReportingStation;
	}

	/**
	 * Gets international awb.
	 *
	 * @return the international awb
	 */
	public InternationalAWBType getInternationalAWB() {
		return internationalAWB;
	}

	/**
	 * Sets international awb.
	 *
	 * @param internationalAWB the international awb
	 */
	public void setInternationalAWB(InternationalAWBType internationalAWB) {
		this.internationalAWB = internationalAWB;
	}

	/**
	 * Is north american indicator boolean.
	 *
	 * @return the boolean
	 */
	public boolean isNorthAmericanIndicator() {
		return northAmericanIndicator;
	}

	/**
	 * Sets north american indicator.
	 *
	 * @param northAmericanIndicator the north american indicator
	 */
	public void setNorthAmericanIndicator(boolean northAmericanIndicator) {
		this.northAmericanIndicator = northAmericanIndicator;
	}

	/**
	 * Gets notify date.
	 *
	 * @return the notify date
	 */
	public Date getNotifyDate() {
		return notifyDate;
	}

	/**
	 * Sets notify date.
	 *
	 * @param notifyDate the notify date
	 */
	public void setNotifyDate(Date notifyDate) {
		this.notifyDate = notifyDate;
	}

	/**
	 * Gets pad type.
	 *
	 * @return the pad type
	 */
	public String getPadType() {
		return padType;
	}

	/**
	 * Sets pad type.
	 *
	 * @param padType the pad type
	 */
	public void setPadType(String padType) {
		this.padType = padType;
	}

	/**
	 * Is paper awb override ind boolean.
	 *
	 * @return the boolean
	 */
	public boolean isPaperAWBOverrideInd() {
		return paperAWBOverrideInd;
	}

	/**
	 * Sets paper awb override ind.
	 *
	 * @param paperAWBOverrideInd the paper awb override ind
	 */
	public void setPaperAWBOverrideInd(boolean paperAWBOverrideInd) {
		this.paperAWBOverrideInd = paperAWBOverrideInd;
	}

	/**
	 * Gets shipper remarks.
	 *
	 * @return the shipper remarks
	 */
	public String getShipperRemarks() {
		return shipperRemarks;
	}

	/**
	 * Sets shipper remarks.
	 *
	 * @param shipperRemarks the shipper remarks
	 */
	public void setShipperRemarks(String shipperRemarks) {
		this.shipperRemarks = shipperRemarks;
	}

	/**
	 * Gets special purge.
	 *
	 * @return the special purge
	 */
	public SpecialPurgeType getSpecialPurge() {
		return specialPurge;
	}

	/**
	 * Sets special purge.
	 *
	 * @param specialPurge the special purge
	 */
	public void setSpecialPurge(SpecialPurgeType specialPurge) {
		this.specialPurge = specialPurge;
	}

	/**
	 * Gets status.
	 *
	 * @return the status
	 */
	public ShipmentStatusType getStatus() {
		return status;
	}

	/**
	 * Sets status.
	 *
	 * @param status the status
	 */
	public void setStatus(ShipmentStatusType status) {
		this.status = status;
	}

	/**
	 * Gets tax indicator.
	 *
	 * @return the tax indicator
	 */
	public Boolean getTaxIndicator() {
		return taxIndicator;
	}

	/**
	 * Sets tax indicator.
	 *
	 * @param taxIndicator the tax indicator
	 */
	public void setTaxIndicator(Boolean taxIndicator) {
		this.taxIndicator = taxIndicator;
	}

	/**
	 * Gets class rating id.
	 *
	 * @return the class rating id
	 */
	public String getClassRatingId() {
		return classRatingId;
	}

	/**
	 * Sets class rating id.
	 *
	 * @param classRatingId the class rating id
	 */
	public void setClassRatingId(String classRatingId) {
		this.classRatingId = classRatingId;
	}

	/**
	 * Gets commodity number.
	 *
	 * @return the commodity number
	 */
	public String getCommodityNumber() {
		return commodityNumber;
	}

	/**
	 * Sets commodity number.
	 *
	 * @param commodityNumber the commodity number
	 */
	public void setCommodityNumber(String commodityNumber) {
		this.commodityNumber = commodityNumber;
	}

	/**
	 * Gets contract number.
	 *
	 * @return the contract number
	 */
	public String getContractNumber() {
		return contractNumber;
	}

	/**
	 * Sets contract number.
	 *
	 * @param contractNumber the contract number
	 */
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	/**
	 * Is delete indicator boolean.
	 *
	 * @return the boolean
	 */
	public boolean isDeleteIndicator() {
		return deleteIndicator;
	}

	/**
	 * Sets delete indicator.
	 *
	 * @param deleteIndicator the delete indicator
	 */
	public void setDeleteIndicator(boolean deleteIndicator) {
		this.deleteIndicator = deleteIndicator;
	}

	/**
	 * Gets net net indicator.
	 *
	 * @return the net net indicator
	 */
	public Boolean getNetNetIndicator() {
		return netNetIndicator;
	}

	/**
	 * Sets net net indicator.
	 *
	 * @param netNetIndicator the net net indicator
	 */
	public void setNetNetIndicator(Boolean netNetIndicator) {
		this.netNetIndicator = netNetIndicator;
	}

	/**
	 * Gets rate charge.
	 *
	 * @return the rate charge
	 */
	public BigDecimal getRateCharge() {
		return rateCharge;
	}

	/**
	 * Sets rate charge.
	 *
	 * @param rateCharge the rate charge
	 */
	public void setRateCharge(BigDecimal rateCharge) {
		this.rateCharge = rateCharge;
	}

	/**
	 * Gets rate class type.
	 *
	 * @return the rate class type
	 */
	public RateClassType getRateClassType() {
		return rateClassType;
	}

	/**
	 * Sets rate class type.
	 *
	 * @param rateClassType the rate class type
	 */
	public void setRateClassType(RateClassType rateClassType) {
		this.rateClassType = rateClassType;
	}

	/**
	 * Gets rate generation type.
	 *
	 * @return the rate generation type
	 */
	public RateGenerationType getRateGenerationType() {
		return rateGenerationType;
	}

	/**
	 * Sets rate generation type.
	 *
	 * @param rateGenerationType the rate generation type
	 */
	public void setRateGenerationType(RateGenerationType rateGenerationType) {
		this.rateGenerationType = rateGenerationType;
	}

	/**
	 * Gets rate note.
	 *
	 * @return the rate note
	 */
	public String getRateNote() {
		return rateNote;
	}

	/**
	 * Sets rate note.
	 *
	 * @param rateNote the rate note
	 */
	public void setRateNote(String rateNote) {
		this.rateNote = rateNote;
	}

	/**
	 * Gets uld type.
	 *
	 * @return the uld type
	 */
	public String getUldType() {
		return uldType;
	}

	/**
	 * Sets uld type.
	 *
	 * @param uldType the uld type
	 */
	public void setUldType(String uldType) {
		this.uldType = uldType;
	}

	/**
	 * Gets cod charge gen id type.
	 *
	 * @return the cod charge gen id type
	 */
	public GenIdType getCodChargeGenIdType() {
		return codChargeGenIdType;
	}

	/**
	 * Sets cod charge gen id type.
	 *
	 * @param codChargeGenIdType the cod charge gen id type
	 */
	public void setCodChargeGenIdType(GenIdType codChargeGenIdType) {
		this.codChargeGenIdType = codChargeGenIdType;
	}

	/**
	 * Gets cod currency.
	 *
	 * @return the cod currency
	 */
	public String getCodCurrency() {
		return codCurrency;
	}

	/**
	 * Sets cod currency.
	 *
	 * @param codCurrency the cod currency
	 */
	public void setCodCurrency(String codCurrency) {
		this.codCurrency = codCurrency;
	}

	/**
	 * Gets cod exchange rate.
	 *
	 * @return the cod exchange rate
	 */
	public BigDecimal getCodExchangeRate() {
		return codExchangeRate;
	}

	/**
	 * Sets cod exchange rate.
	 *
	 * @param codExchangeRate the cod exchange rate
	 */
	public void setCodExchangeRate(BigDecimal codExchangeRate) {
		this.codExchangeRate = codExchangeRate;
	}

	/**
	 * Gets face collect charge.
	 *
	 * @return the face collect charge
	 */
	public BigDecimal getFaceCollectCharge() {
		return faceCollectCharge;
	}

	/**
	 * Sets face collect charge.
	 *
	 * @param faceCollectCharge the face collect charge
	 */
	public void setFaceCollectCharge(BigDecimal faceCollectCharge) {
		this.faceCollectCharge = faceCollectCharge;
	}

	/**
	 * Gets face prepaid charge.
	 *
	 * @return the face prepaid charge
	 */
	public BigDecimal getFacePrepaidCharge() {
		return facePrepaidCharge;
	}

	/**
	 * Sets face prepaid charge.
	 *
	 * @param facePrepaidCharge the face prepaid charge
	 */
	public void setFacePrepaidCharge(BigDecimal facePrepaidCharge) {
		this.facePrepaidCharge = facePrepaidCharge;
	}

	/**
	 * Gets face weight charge.
	 *
	 * @return the face weight charge
	 */
	public BigDecimal getFaceWeightCharge() {
		return faceWeightCharge;
	}

	/**
	 * Sets face weight charge.
	 *
	 * @param faceWeightCharge the face weight charge
	 */
	public void setFaceWeightCharge(BigDecimal faceWeightCharge) {
		this.faceWeightCharge = faceWeightCharge;
	}

	/**
	 * Gets pub collect charge.
	 *
	 * @return the pub collect charge
	 */
	public BigDecimal getPubCollectCharge() {
		return pubCollectCharge;
	}

	/**
	 * Sets pub collect charge.
	 *
	 * @param pubCollectCharge the pub collect charge
	 */
	public void setPubCollectCharge(BigDecimal pubCollectCharge) {
		this.pubCollectCharge = pubCollectCharge;
	}

	/**
	 * Gets pub prepaid charge.
	 *
	 * @return the pub prepaid charge
	 */
	public BigDecimal getPubPrepaidCharge() {
		return pubPrepaidCharge;
	}

	/**
	 * Sets pub prepaid charge.
	 *
	 * @param pubPrepaidCharge the pub prepaid charge
	 */
	public void setPubPrepaidCharge(BigDecimal pubPrepaidCharge) {
		this.pubPrepaidCharge = pubPrepaidCharge;
	}

	/**
	 * Gets pub weight charge.
	 *
	 * @return the pub weight charge
	 */
	public BigDecimal getPubWeightCharge() {
		return pubWeightCharge;
	}

	/**
	 * Sets pub weight charge.
	 *
	 * @param pubWeightCharge the pub weight charge
	 */
	public void setPubWeightCharge(BigDecimal pubWeightCharge) {
		this.pubWeightCharge = pubWeightCharge;
	}

	/**
	 * Gets total cash on delivery cod.
	 *
	 * @return the total cash on delivery cod
	 */
	public BigDecimal getTotalCashOnDeliveryCOD() {
		return totalCashOnDeliveryCOD;
	}

	/**
	 * Sets total cash on delivery cod.
	 *
	 * @param totalCashOnDeliveryCOD the total cash on delivery cod
	 */
	public void setTotalCashOnDeliveryCOD(BigDecimal totalCashOnDeliveryCOD) {
		this.totalCashOnDeliveryCOD = totalCashOnDeliveryCOD;
	}

	/**
	 * Gets total chargeable weight.
	 *
	 * @return the total chargeable weight
	 */
	public BigDecimal getTotalChargeableWeight() {
		return totalChargeableWeight;
	}

	/**
	 * Sets total chargeable weight.
	 *
	 * @param totalChargeableWeight the total chargeable weight
	 */
	public void setTotalChargeableWeight(BigDecimal totalChargeableWeight) {
		this.totalChargeableWeight = totalChargeableWeight;
	}

	/**
	 * Gets total weight charges.
	 *
	 * @return the total weight charges
	 */
	public BigDecimal getTotalWeightCharges() {
		return totalWeightCharges;
	}

	/**
	 * Sets total weight charges.
	 *
	 * @param totalWeightCharges the total weight charges
	 */
	public void setTotalWeightCharges(BigDecimal totalWeightCharges) {
		this.totalWeightCharges = totalWeightCharges;
	}

	/**
	 * Gets unit type.
	 *
	 * @return the unit type
	 */
	public UnitType getUnitType() {
		return unitType;
	}

	/**
	 * Sets unit type.
	 *
	 * @param unitType the unit type
	 */
	public void setUnitType(UnitType unitType) {
		this.unitType = unitType;
	}

	/**
	 * Gets valuation charge gen id type.
	 *
	 * @return the valuation charge gen id type
	 */
	public GenIdType getValuationChargeGenIdType() {
		return valuationChargeGenIdType;
	}

	/**
	 * Sets valuation charge gen id type.
	 *
	 * @param valuationChargeGenIdType the valuation charge gen id type
	 */
	public void setValuationChargeGenIdType(GenIdType valuationChargeGenIdType) {
		this.valuationChargeGenIdType = valuationChargeGenIdType;
	}

	/**
	 * Gets weight unit.
	 *
	 * @return the weight unit
	 */
	public WeightUOMType getWeightUnit() {
		return weightUnit;
	}

	/**
	 * Sets weight unit.
	 *
	 * @param weightUnit the weight unit
	 */
	public void setWeightUnit(WeightUOMType weightUnit) {
		this.weightUnit = weightUnit;
	}

	/**
	 * Is invoice indicator boolean.
	 *
	 * @return the boolean
	 */
	public boolean isInvoiceIndicator() {
		return invoiceIndicator;
	}

	/**
	 * Sets invoice indicator.
	 *
	 * @param invoiceIndicator the invoice indicator
	 */
	public void setInvoiceIndicator(boolean invoiceIndicator) {
		this.invoiceIndicator = invoiceIndicator;
	}

	/**
	 * Is posting indicator boolean.
	 *
	 * @return the boolean
	 */
	public boolean isPostingIndicator() {
		return postingIndicator;
	}

	/**
	 * Sets posting indicator.
	 *
	 * @param postingIndicator the posting indicator
	 */
	public void setPostingIndicator(boolean postingIndicator) {
		this.postingIndicator = postingIndicator;
	}

	/**
	 * Gets queue name.
	 *
	 * @return the queue name
	 */
	public String getQueueName() {
		return queueName;
	}

	/**
	 * Sets queue name.
	 *
	 * @param queueName the queue name
	 */
	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

	/**
	 * Gets queue office.
	 *
	 * @return the queue office
	 */
	public String getQueueOffice() {
		return queueOffice;
	}

	/**
	 * Sets queue office.
	 *
	 * @param queueOffice the queue office
	 */
	public void setQueueOffice(String queueOffice) {
		this.queueOffice = queueOffice;
	}

	/**
	 * Gets queue station.
	 *
	 * @return the queue station
	 */
	public String getQueueStation() {
		return queueStation;
	}

	/**
	 * Sets queue station.
	 *
	 * @param queueStation the queue station
	 */
	public void setQueueStation(String queueStation) {
		this.queueStation = queueStation;
	}

	/**
	 * Is queue status boolean.
	 *
	 * @return the boolean
	 */
	public boolean isQueueStatus() {
		return queueStatus;
	}

	/**
	 * Sets queue status.
	 *
	 * @param queueStatus the queue status
	 */
	public void setQueueStatus(boolean queueStatus) {
		this.queueStatus = queueStatus;
	}

	/**
	 * Is report indicator boolean.
	 *
	 * @return the boolean
	 */
	public boolean isReportIndicator() {
		return reportIndicator;
	}

	/**
	 * Sets report indicator.
	 *
	 * @param reportIndicator the report indicator
	 */
	public void setReportIndicator(boolean reportIndicator) {
		this.reportIndicator = reportIndicator;
	}

	/**
	 * Gets air waybill event gross revenue.
	 *
	 * @return the air waybill event gross revenue
	 */
	public BigDecimal getAirWaybillEventGrossRevenue() {
		return airWaybillEventGrossRevenue;
	}

	/**
	 * Sets air waybill event gross revenue.
	 *
	 * @param airWaybillEventGrossRevenue the air waybill event gross revenue
	 */
	public void setAirWaybillEventGrossRevenue(
			BigDecimal airWaybillEventGrossRevenue) {
		this.airWaybillEventGrossRevenue = airWaybillEventGrossRevenue;
	}

	/**
	 * Gets air waybill event host revenue.
	 *
	 * @return the air waybill event host revenue
	 */
	public BigDecimal getAirWaybillEventHostRevenue() {
		return airWaybillEventHostRevenue;
	}

	/**
	 * Sets air waybill event host revenue.
	 *
	 * @param airWaybillEventHostRevenue the air waybill event host revenue
	 */
	public void setAirWaybillEventHostRevenue(BigDecimal airWaybillEventHostRevenue) {
		this.airWaybillEventHostRevenue = airWaybillEventHostRevenue;
	}

	/**
	 * Gets airwaybill net amount.
	 *
	 * @return the airwaybill net amount
	 */
	public BigDecimal getAirwaybillNetAmount() {
		return airwaybillNetAmount;
	}

	/**
	 * Sets airwaybill net amount.
	 *
	 * @param airwaybillNetAmount the airwaybill net amount
	 */
	public void setAirwaybillNetAmount(BigDecimal airwaybillNetAmount) {
		this.airwaybillNetAmount = airwaybillNetAmount;
	}

	/**
	 * Gets airwaybill outstanding amount.
	 *
	 * @return the airwaybill outstanding amount
	 */
	public BigDecimal getAirwaybillOutstandingAmount() {
		return airwaybillOutstandingAmount;
	}

	/**
	 * Sets airwaybill outstanding amount.
	 *
	 * @param airwaybillOutstandingAmount the airwaybill outstanding amount
	 */
	public void setAirwaybillOutstandingAmount(
			BigDecimal airwaybillOutstandingAmount) {
		this.airwaybillOutstandingAmount = airwaybillOutstandingAmount;
	}

	/**
	 * Gets host net yield.
	 *
	 * @return the host net yield
	 */
	public BigDecimal getHostNetYield() {
		return hostNetYield;
	}

	/**
	 * Sets host net yield.
	 *
	 * @param hostNetYield the host net yield
	 */
	public void setHostNetYield(BigDecimal hostNetYield) {
		this.hostNetYield = hostNetYield;
	}

	/**
	 * Gets host net revenue.
	 *
	 * @return the host net revenue
	 */
	public BigDecimal getHostNetRevenue() {
		return hostNetRevenue;
	}

	/**
	 * Sets host net revenue.
	 *
	 * @param hostNetRevenue the host net revenue
	 */
	public void setHostNetRevenue(BigDecimal hostNetRevenue) {
		this.hostNetRevenue = hostNetRevenue;
	}

	/**
	 * Gets total gross weight.
	 *
	 * @return the total gross weight
	 */
	public BigDecimal getTotalGrossWeight() {
		return totalGrossWeight;
	}

	/**
	 * Sets total gross weight.
	 *
	 * @param totalGrossWeight the total gross weight
	 */
	public void setTotalGrossWeight(BigDecimal totalGrossWeight) {
		this.totalGrossWeight = totalGrossWeight;
	}
	
	
	//String values for enum

	/**
	 * Gets online proration reason code string.
	 *
	 * @return the online proration reason code string
	 */
	public String getOnlineProrationReasonCodeString() {
		
		if(this.getOnlineProrationReasonCode()!=null)
		{
			onlineProrationReasonCodeString = this.getOnlineProrationReasonCode().getVal();
		}
		return onlineProrationReasonCodeString;
	}

	/**
	 * Sets online proration reason code string.
	 *
	 * @param onlineProrationReasonCodeString the online proration reason code string
	 */
	public void setOnlineProrationReasonCodeString(
			String onlineProrationReasonCodeString) {
		this.onlineProrationReasonCodeString = onlineProrationReasonCodeString;
	}

	/**
	 * Gets wb type string.
	 *
	 * @return the wb type string
	 */
	public String getfWBTypeString() {
		if(this.getfWBType() != null)
		{
			fWBTypeString = this.getfWBType().getValueFWB();		
		}
		return fWBTypeString;
	}

	/**
	 * Sets wb type string.
	 *
	 * @param fWBTypeString the f wb type string
	 */
	public void setfWBTypeString(String fWBTypeString) {
		this.fWBTypeString = fWBTypeString;
	}

	/**
	 * Gets export audit type string.
	 *
	 * @return the export audit type string
	 */
	public String getExportAuditTypeString() {
		if(this.getExportAuditType() != null)
		{
			exportAuditTypeString = this.getExportAuditType().getAuditStatus();
		}
		return exportAuditTypeString;
	}

	/**
	 * Sets export audit type string.
	 *
	 * @param exportAuditTypeString the export audit type string
	 */
	public void setExportAuditTypeString(String exportAuditTypeString) {
		this.exportAuditTypeString = exportAuditTypeString;
	}

	/**
	 * Gets export paycode string.
	 *
	 * @return the export paycode string
	 */
	public String getExportPaycodeString() {
		if(this.getExportPaycode() != null)
		{
			exportPaycodeString = this.getExportPaycode().getPayCode();
		}
		return exportPaycodeString;
	}

	/**
	 * Sets export paycode string.
	 *
	 * @param exportPaycodeString the export paycode string
	 */
	public void setExportPaycodeString(String exportPaycodeString) {
		this.exportPaycodeString = exportPaycodeString;
	}

	/**
	 * Gets import audit string.
	 *
	 * @return the import audit string
	 */
	public String getImportAuditString() {
		if(this.getImportAudit() != null)
		{
			importAuditString = this.getImportAudit().getAuditStatus();
		}
		return importAuditString;
	}

	/**
	 * Sets import audit string.
	 *
	 * @param importAuditString the import audit string
	 */
	public void setImportAuditString(String importAuditString) {
		this.importAuditString = importAuditString;
	}

	/**
	 * Gets import paycode string.
	 *
	 * @return the import paycode string
	 */
	public String getImportPaycodeString() {
		if(this.getImportPaycode() != null)
		{
			importPaycodeString = this.getImportPaycode().getPayCode();
		}
		return importPaycodeString;
	}

	/**
	 * Sets import paycode string.
	 *
	 * @param importPaycodeString the import paycode string
	 */
	public void setImportPaycodeString(String importPaycodeString) {
		this.importPaycodeString = importPaycodeString;
	}

	/**
	 * Gets international awb string.
	 *
	 * @return the international awb string
	 */
	public String getInternationalAWBString() {
		if(this.getInternationalAWB() != null)
		{
			internationalAWBString = this.getInternationalAWB().getShipment();
		}
		return internationalAWBString;
	}

	/**
	 * Sets international awb string.
	 *
	 * @param internationalAWBString the international awb string
	 */
	public void setInternationalAWBString(String internationalAWBString) {
		this.internationalAWBString = internationalAWBString;
	}

	/**
	 * Gets pad type string.
	 *
	 * @return the pad type string
	 */
	public String getPadTypeString() {
		
		return padType;
	}

	/**
	 * Sets pad type string.
	 *
	 * @param k the k
	 */
	public void setPadTypeString(String k) {
		this.padTypeString = padTypeString;
	}

	/**
	 * Gets special purge string.
	 *
	 * @return the special purge string
	 */
	public String getSpecialPurgeString() {
		if(this.getSpecialPurge() != null)
		{
			specialPurgeString = this.getSpecialPurge().getPurge();
		}
		return specialPurgeString;
	}

	/**
	 * Sets special purge string.
	 *
	 * @param specialPurgeString the special purge string
	 */
	public void setSpecialPurgeString(String specialPurgeString) {
		this.specialPurgeString = specialPurgeString;
	}

	/**
	 * Gets status string.
	 *
	 * @return the status string
	 */
	public String getStatusString() {
		if(this.getStatus() != null)
		{
			statusString = this.getStatus().getStatus();
		}
		return statusString;
	}

	/**
	 * Sets status string.
	 *
	 * @param statusString the status string
	 */
	public void setStatusString(String statusString) {
		this.statusString = statusString;
	}

	/**
	 * Gets unit of weight string.
	 *
	 * @return the unit of weight string
	 */
	public String getUnitOfWeightString() {
		if(this.getUnitOfWeight() != null)
		{
			unitOfWeightString = this.getUnitOfWeight().getWeightUnit();
		}
		return unitOfWeightString;
	}

	/**
	 * Sets unit of weight string.
	 *
	 * @param unitOfWeightString the unit of weight string
	 */
	public void setUnitOfWeightString(String unitOfWeightString) {
		this.unitOfWeightString = unitOfWeightString;
	}

	/**
	 * Gets rate class type string.
	 *
	 * @return the rate class type string
	 */
	public String getRateClassTypeString() {
		if(this.getRateClassType() != null)
		{
			rateClassTypeString = this.getRateClassType().getRateClassName();
		}
		return rateClassTypeString;
	}

	/**
	 * Sets rate class type string.
	 *
	 * @param rateClassTypeString the rate class type string
	 */
	public void setRateClassTypeString(String rateClassTypeString) {
		this.rateClassTypeString = rateClassTypeString;
	}

	/**
	 * Gets rate generation type string.
	 *
	 * @return the rate generation type string
	 */
	public String getRateGenerationTypeString() {
		if(this.getRateGenerationType() != null)
		{
			rateGenerationTypeString = this.getRateGenerationType().getRateGenType();
		}
		return rateGenerationTypeString;
	}

	/**
	 * Sets rate generation type string.
	 *
	 * @param rateGenerationTypeString the rate generation type string
	 */
	public void setRateGenerationTypeString(String rateGenerationTypeString) {
		this.rateGenerationTypeString = rateGenerationTypeString;
	}

	/**
	 * Gets cod charge gen id type string.
	 *
	 * @return the cod charge gen id type string
	 */
	public String getCodChargeGenIdTypeString() {
		if(this.getCodChargeGenIdType() != null)
		{
			codChargeGenIdTypeString = this.getCodChargeGenIdType().getStatus();
		}
		return codChargeGenIdTypeString;
	}

	/**
	 * Sets cod charge gen id type string.
	 *
	 * @param codChargeGenIdTypeString the cod charge gen id type string
	 */
	public void setCodChargeGenIdTypeString(String codChargeGenIdTypeString) {
		this.codChargeGenIdTypeString = codChargeGenIdTypeString;
	}

	/**
	 * Gets unit type string.
	 *
	 * @return the unit type string
	 */
	public String getUnitTypeString() {
		if(this.getUnitType() != null)
		{
			unitTypeString = this.getUnitType().getUnit();
		}
		return unitTypeString;
	}

	/**
	 * Sets unit type string.
	 *
	 * @param unitTypeString the unit type string
	 */
	public void setUnitTypeString(String unitTypeString) {
		this.unitTypeString = unitTypeString;
	}

	/**
	 * Gets valuation charge gen id type string.
	 *
	 * @return the valuation charge gen id type string
	 */
	public String getValuationChargeGenIdTypeString() {
		if(this.getValuationChargeGenIdType() != null)

        {

                valuationChargeGenIdTypeString = this.getValuationChargeGenIdType().getStatus();

        }
		return valuationChargeGenIdTypeString;
	}

	/**
	 * Sets valuation charge gen id type string.
	 *
	 * @param valuationChargeGenIdTypeString the valuation charge gen id type string
	 */
	public void setValuationChargeGenIdTypeString(
			String valuationChargeGenIdTypeString) {
		this.valuationChargeGenIdTypeString = valuationChargeGenIdTypeString;
	}

	/**
	 * Gets weight unit string.
	 *
	 * @return the weight unit string
	 */
	public String getWeightUnitString() {
		if(this.getWeightUnit() != null)
		{
			weightUnitString = this.getWeightUnit().getWeightUnit();
		}
		return weightUnitString;
	}

	/**
	 * Sets weight unit string.
	 *
	 * @param weightUnitString the weight unit string
	 */
	public void setWeightUnitString(String weightUnitString) {
		this.weightUnitString = weightUnitString;
	}

	/**
	 * Gets report type.
	 *
	 * @return the report type
	 */
	public String getReportType() {
		return reportType;
	}

	/**
	 * Sets report type.
	 *
	 * @param reportType the report type
	 */
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	/**
	 * Gets date type.
	 *
	 * @return the date type
	 */
	public String getDateType() {
		return dateType;
	}

	/**
	 * Sets date type.
	 *
	 * @param dateType the date type
	 */
	public void setDateType(String dateType) {
		this.dateType = dateType;
	}

	/**
	 * Gets revenue type.
	 *
	 * @return the revenue type
	 */
	public String getRevenueType() {
		return revenueType;
	}

	/**
	 * Sets revenue type.
	 *
	 * @param revenueType the revenue type
	 */
	public void setRevenueType(String revenueType) {
		this.revenueType = revenueType;
	}

	/**
	 * Is download all boolean.
	 *
	 * @return the boolean
	 */
	public boolean isDownloadAll() {
		return downloadAll;
	}

	/**
	 * Sets download all.
	 *
	 * @param downloadAll the download all
	 */
	public void setDownloadAll(boolean downloadAll) {
		this.downloadAll = downloadAll;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
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
        
      
        
        if(this.getFlightDate()!= null)
        {
        	csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getFlightDate())));
        }
        else
        	csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        
        
        if(this.getSegmentOrigin()!= null)
		{
			csvString.append(this.prefixSuffixByQuotes(this.getSegmentOrigin()));
		}
		else
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		
		if(this.getSegmentDestination()!= null)
		{
			csvString.append(this.prefixSuffixByQuotes(this.getSegmentDestination()));
		}
		else
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        
        
        if(this.getStartDate() != null)
        {
        	csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getStartDate())));
        }
        else
        	csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        
        if(this.getEndDate() != null)
        {
        	csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getEndDate())));
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

	/**
	 * Gets number of records per page.
	 *
	 * @return the number of records per page
	 */
	public int getNumberOfRecordsPerPage() {
		return numberOfRecordsPerPage;
	}

	/**
	 * Sets number of records per page.
	 *
	 * @param numberOfRecordsPerPage the number of records per page
	 */
	public void setNumberOfRecordsPerPage(int numberOfRecordsPerPage) {
		this.numberOfRecordsPerPage = numberOfRecordsPerPage;
	}

	/**
	 * Gets total numberof records.
	 *
	 * @return the total numberof records
	 */
	public int getTotalNumberofRecords() {
		return totalNumberofRecords;
	}

	/**
	 * Sets total numberof records.
	 *
	 * @param totalNumberofRecords the total numberof records
	 */
	public void setTotalNumberofRecords(int totalNumberofRecords) {
		this.totalNumberofRecords = totalNumberofRecords;
	}

	/**
	 * Gets page number.
	 *
	 * @return the page number
	 */
	public int getPageNumber() {
		return pageNumber;
	}

	/**
	 * Sets page number.
	 *
	 * @param pageNumber the page number
	 */
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	



}