package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.AirWaybillCreationSourceType;
import com.unisys.trans.logistics.lms.framework.constants.AWBPaycodeType;
import com.unisys.trans.logistics.lms.framework.constants.AirWaybillFWBStatus;
import com.unisys.trans.logistics.lms.framework.constants.AirWaybillSourceType;
import com.unisys.trans.logistics.lms.framework.constants.AuditStatusType;
import com.unisys.trans.logistics.lms.framework.constants.ChannelType;
import com.unisys.trans.logistics.lms.framework.constants.ExchangeRateGenerationType;
import com.unisys.trans.logistics.lms.framework.constants.FSUStatusType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.constants.InternationalAWBType;
import com.unisys.trans.logistics.lms.framework.constants.MasterAwbStatusType;
import com.unisys.trans.logistics.lms.framework.constants.RateDiscriminatorType;
import com.unisys.trans.logistics.lms.framework.constants.SpecialPurgeType;
import com.unisys.trans.logistics.lms.framework.constants.VolumeUOMType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.constants.AirWayBillCurrentOriginal;
import com.unisys.trans.logistics.lms.framework.dto.constants.CommercialControlType;
import com.unisys.trans.logistics.lms.framework.dto.constants.ShipmentDataType;
import com.unisys.trans.logistics.lms.framework.dto.constants.VolumeEvaluationMethod;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AirWaybillDetailDto</code> contains specific data related to air
 * waybill detail.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>accountingRemarks
 * <li>actualDeliveryDateTime
 * <li>agentCode
 * <li>agentRemarks
 * <li>airlineHoldInd
 * <li>airlineHoldStation
 * <li>arrivalDateTime
 * <li>awbDeletionInd
 * <li>awbLockedInd
 * <li>awbLockStation
 * <li>awbOriginCountry
 * <li>awbPriority
 * <li>awbProductQueueServiceLevel
 * <li>awbType
 * <li>awbKeyDates
 * <li>bookingRemarks3Or4Exists
 * <li>consigneeRemarks1
 * <li>consigneeRemarks2
 * <li>createUpdateSource
 * <li>crossReference1
 * <li>crossReference2
 * <li>crossReferenceIndicator1
 * <li>crossReferenceIndicator2
 * <li>cumulativeAcceptedPieces
 * <li>cumulativeAcceptedWeight
 * <li>customsValue
 * <li>declarantEoriCountry
 * <li>declarantEoriNumber
 * <li>declaredValue
 * <li>deliveryBillLadingNumber
 * <li>deliveryCostStatusInd
 * <li>deliveryOrderDateTime
 * <li>destCustomsStation
 * <li>destinationCurrency
 * <li>dimensionalVolume
 * <li>dimensionalVolumeCalculationInd
 * <li>dimensionalVolumeUnit (enum class =VolumeUOMType)
 * <li>dimensionalWeightOfShipment
 * <li>discrepancyExists
 * <li>earliestTravelDate
 * <li>eAwbInd
 * <li>europeanCustomsOriginDetail
 * <li>exportAccountReleaseDate
 * <li>exportAuditStatus
 * <li>exportBulkPiecesAccepted
 * <li>exportBulkWeightAccepted
 * <li>exportCountry
 * <li>exportCustomsInd
 * <li>exportDeclarationNumber
 * <li>exportPaycode
 * <li>exportReportingStation
 * <li>ffrSriReferenceNumber
 * <li>ffrSriShipmentInfo1
 * <li>ffrSriShipmentInfo2
 * <li>finalDispositionStatus
 * <li>finalDispositionStatusDateTime
 * <li>firstAcceptanceDateTime
 * <li>fsuDlvPieces
 * <li>fsuRcfPieces
 * <li>fsuRctPieces
 * <li>governmentTaxIndicator
 * <li>hawbConsolidationIndicator
 * <li>hawbValidatedIndicator
 * <li>importAccountReleaseDate
 * <li>importAuditStatus
 * <li>importClearanceNumber
 * <li>importCustomsInd
 * <li>importCustomsStatus
 * <li>importPaycode
 * <li>importPiecesCleared
 * <li>importPiecesDelivered
 * <li>importReportingStation
 * <li>importReportingStationPieces
 * <li>inBondIndicator
 * <li>insuranceCode
 * <li>insuranceValue
 * <li>internationalAWBType
 * <li>internationalType
 * <li>lastCheckinDate
 * <li>latestAcceptanceDateTime
 * <li>latestArrivalDateTime
 * <li>natureOfGoods
 * <li>northAmericanIndicator
 * <li>notificationDateTime
 * <li>oId
 * <li>originatedAsFwb
 * <li>originCurrency
 * <li>originIataRegion
 * <li>padAttachmentsExist
 * <li>padFwbInfoExists
 * <li>padGeneralInfoExists
 * <li>padHandlingInfoExists
 * <li>padShipmentHandlingExists
 * <li>padTracingInfoExists
 * <li>paperAWBOverrideInd
 * <li>participantNotification
 * <li>pickupBillLadingNumber
 * <li>pickupCostStatusInd
 * <li>pickupOrderDateTime
 * <li>plannedDeliveryDateTime
 * <li>plannedPickupDateTime
 * <li>priority
 * <li>qualityAssuranceIndicator
 * <li>shedCode
 * <li>shipmentBookingIndicator
 * <li>shipmentHandlingTotalPieces
 * <li>shipmentHandlingTotalVolume
 * <li>shipmentHandlingTotalWeight
 * <li>shipmentVolumeUnit
 * <li>shipmentWeightUnit
 * <li>shipperRemarks
 * <li>storageStartDate
 * <li>surfaceDestinationStation
 * <li>surfaceOriginStation
 * <li>timeOfAvailabilityDateTime
 * <li>totalAcceptedPieces
 * <li>totalAcceptedSluid
 * <li>totalAcceptedSluidWeight
 * <li>totalAcceptedWeight
 * <li>totalCollectDueAgent
 * <li>totalCollectDueCarrier
 * <li>totalGrossWeightHawbs
 * <li>totalNbrOfPiecesInHawbs
 * <li>totalPieces
 * <li>totalPrepaidDueAgent
 * <li>totalPrepaidDueCarrier
 * <li>totalVolume
 * <li>totalWeight
 * <li>traderNumber
 * <li>transitCountry
 * <li>transitCustomsInd
 * <li>transitDeclarationNumber
 * <li>unNumbers
 * <li>accumulatedCCAamount
 * <li>unclearedAWBResolvedInd //DL569
 */
public class AirWaybillDetailDto extends PersistenceObjectDto {
    /**
     * unique serial version UID.
     */
    private static final long serialVersionUID = 1407823324377315816L;

    /**
     * Attribute to hold the <code>accountingDetailDto</code> property.
     */

    private AccountingDetailDto accountingDetailDto;

    /**
     * Attribute to hold the <code>accumulatedCCAamount</code> property.
     */
    private BigDecimal accumulatedCCAamount;

    /**
     * Attribute to holds <code>actualRateQueueInd</code> property.
     */
    private String actualRateQueueInd;

    /**
     * Attribute to hold the <code> agentCode</code> property.
     */
    private String agentCode;

    /**
     * Attribute to hold the <code> agentName</code> property.
     */
    private String agentName;

    /**
     * Attribute to hold the <code>airlineHoldAction</code> property.
     */

    private String airlineHoldAction;

    /**
     * Attribute to hold the <code>airlineHoldInd</code> property.
     */

    private boolean airlineHoldInd;

    /**
     * Attribute to hold the <code>airlineHoldReason</code> property.
     */

    private String airlineHoldReason;

    /**
     * Attribute to holds <code>airlineHoldStation</code> property.
     */

    private String airlineHoldStation;

    private String authSign;

    /**
     * Attribute to hold the <code>airWaybillCreationChannelType</code> property.
     */

    private ChannelType airWaybillCreationChannelType;

    /**
     * Attribute to hold the <code>airWaybillCreationSourceType</code> property.
     * 
     */
    private AirWaybillCreationSourceType createUpdateSource;

    /**
     * Attribute to hold <code>airwayBillDeliveryZone</code> property.
     */
    private String airWaybillDeliveryZone;

    /**
     * Attribute to hold the <code>airWaybillUpdationChannelType</code> property.
     * 
     */
    private ChannelType airWaybillUpdationChannelType;

    /**
     * Attribute to hold the <code>airWaybillUpdationSourceType</code> property.
     * 
     */
    private AirWaybillSourceType airWaybillUpdationSourceType;

    /**
     * Attribute to hold the <code>awbDeleteIndicator</code> property.
     */

    private String awbDeleteIndicator;

    /**
     * Attribute to hold the <code>awbDeletionInd</code> property.
     */

    private boolean awbDeletionInd;

    /**
     * Attribute to hold the <code>awbDescription</code> property.
     */

    private String awbDescription;

    /**
     * Attribute to hold <code>awbGeneratedDetailDto</code> property.
     */
    private AWBGeneratedDetailDto awbGeneratedDetailDto;

    /**
     * Attribute to hold <code>awbKeyDatesDto</code> property.
     * 
     */
    private AWBKeyDatesDto awbKeyDatesDto;
    
    //AC406 starts
    private String lmsUserReviewNotCompleteQueueInd;
    
    private EawbStatusType eAwbStatus;
    
    private Date latDate;
    
    private String latTime;
    
    private Date toaDate;
    
    private String toaTime;
    
    private Date actualDeliveryDateTime;
    
    private Date storageStartDate;
    
    private Date plannedDeliveryDateTime;
    
    private Date DeliveryOrderDateTime;
    
    private Date exportReportingDate;
    
    private Date importReportingDate;
    
    private Date notificationDateTime;
    
    private String shipmentBookingIndicator;
    
    private Date pickupOrderDateTime;

    private BigDecimal TotalGrossWeightHawbs;
    
    private long totalNbrOfPiecesInHawbs;
    
    private String awbType;
    
    private String participantNotification;
    
    private boolean deleteInd;
    
    private String hawbValidatedIndicator;
    
    private String hawbConsolidationIndicator;
    
    private int totalAcceptedPieces;
    
    private BigDecimal totalAcceptedVolume;
    
    private BigDecimal totalAcceptedWeight;
    
    private String natureOfGoods;
    
    private boolean exportCustomsInd;
    
    private String custArrivalPort;

    /**
	 * @return the lmsUserReviewNotCompleteQueueInd
	 */
	public String getLmsUserReviewNotCompleteQueueInd() {
		return lmsUserReviewNotCompleteQueueInd;
	}

	/**
	 * @param lmsUserReviewNotCompleteQueueInd the lmsUserReviewNotCompleteQueueInd to set
	 */
	public void setLmsUserReviewNotCompleteQueueInd(
			String lmsUserReviewNotCompleteQueueInd) {
		this.lmsUserReviewNotCompleteQueueInd = lmsUserReviewNotCompleteQueueInd;
	}
    
    //AC406 ends
	/**
     * AirWaybill Locked Indicator.
     * <ul>
     * <li>Y = air waybill locked</li>
     * <li>Blank = air waybill unlocked</li>
     * <li>binary 0 = air waybill unlocked</li>
     * </ul>
     */
    private String awbLockedInd;

    /**
     * Attribute to hold the property of awbLockStation.
     */
    private String awbLockStation;

    private boolean aWBNumberGenerationIndicator;

    /**
     * Attribute to hold the property of awbPrintIndicator.
     */
    private boolean awbPrintIndicator;

    /**
     * Attribute to hold the <code>awbPriority</code> property.
     */

    private String awbPriority;

    /**
     * Attribute to hold the <code>awbDeleteIndicator</code> property.
     */

    private boolean awbRetainIndicator;

    /**
     * Attribute to holds <code>awbStatuses</code> property.
     */
    private List<String> awbStatuses;

    /**
     * Attribute to hold the <code>bankSellingRate</code> property.
     */
    private BigDecimal bankSellingRate;

    /**
     * Attribute to hold the <code> brlStatus</code> property.
     */
    private int brlStatus;

    /**
     * Attribute to hold the <code>businessArea</code> property.
     */
    private List<String> businessArea;

    /**
     * Attribute to holds <code>businessAreas</code> property.
     */
    private String businessAreas;

    /**
     * Attribute to holds <code>cashDrawerName</code> property.
     */
    private String cashDrawerName;

    /**
     * Attribute to hold the Cash on delivery amount.
     */
    private BigDecimal codAmount;

    /**
     * Attribute to hold the <code>codAmountInDestination</code> property.
     */
    private BigDecimal codAmountInDestination;

    /**
     * Attribute to hold the <code>codAmountInOrigin</code> property.
     */
    private BigDecimal codAmountInOrigin;

    /**
     * Attribute to holds <code>codCashPaymentInd</code> property.
     */
    private boolean codCashPaymentInd;

    /**
     * Attribute to hold the Cash on delivery currency code.
     */
    private String codCur;

    /**
     * Attribute to hold the <code>codDue</code> property.
     */
    private BigDecimal codDue;

    /**
     * Attribute to hold the <code>codExchangeRate</code> property.
     */
    private BigDecimal codExchangeRate;

    /**
     * Attribute to hold the <code>collectCashTotal</code> property.
     */
    private BigDecimal collectCashTotal;

    /**
     * Attribute to hold <code>collectChargesRestrictionInd</code> property.
     * 
     */
    private String collectChargesRestrictionInd;

    /**
     * Attribute to hold the <code>commercialControlOnBookingInd</code> property.
     */
    private CommercialControlType commercialControlOnBookingInd;

    /**
     * Attribute to hold the <code>contractSraApply</code> property.
     */
    private boolean contractSraApply;

    /**
     * Attribute to hold <code>creationSource</code> property.
     * 
     */
    private String creationSource;

    /**
     * Attribute to holds <code>crossReference1</code> property.
     */
    private String crossReference1;

    /**
     * Attribute to holds <code>crossReference2</code> property.
     */
    private String crossReference2;

    /**
     * Attribute to holds <code>crossReferenceIndicator1</code> property.
     */
    private String crossReferenceIndicator1;

    /**
     * Attribute to holds <code>crossReferenceIndicator2</code> property.
     */
    private String crossReferenceIndicator2;

    /**
     * Attribute to holds <code>cruQueueInd</code> property.
     */
    private String cruQueueInd;

    /**
     * Attribute to hold the <code>currentOriginalInd</code> property.
     */

    private AirWayBillCurrentOriginal currentOriginalInd;

    /**
     * Attribute to holds <code>customerSegmentation</code> property.
     */
    private String customerSegmentation;

    /**
     * Attribute to holds <code>customsStationChangeAllowedIndicator</code> property.
     */

    private Boolean customsStationChangeAllowedIndicator;

    /**
     * Attribute to holds <code>customsValue</code> property.
     */
    private String customsValue;

    /**
     * Attribute to hold the <code>declarantEoriCountry</code> property.
     */

    private String declarantEoriCountry;

    /**
     * Attribute to hold the <code>declarantEoriNumber</code> property.
     */

    private String declarantEoriNumber;

    /**
     * Attribute to holds <code>declaredValue</code> property.
     */
    private String declaredValue;

    /**
     * Attribute to holds <code>deletionOffice</code> property.
     */
    private String deletionOffice;

    /**
     * Attribute to holds <code>deletionRemarks</code> property.
     */
    private String deletionRemarks;
    
    private String awbOriginCountry;
    
    //Ac406a starts
    /**
   	 * 
   	 *Attribute to hold the <code>AWBReviewedbyHostUserIndicator</code> property. 
   	 */
   	private String awbReviewedbyUserIndicator=FrameworkConstants.BOOLEAN_N;
   	
   	
   	/**
	 * @return the awbReviewedbyUserIndicator
	 */
	public String getAwbReviewedbyUserIndicator() {
		return awbReviewedbyUserIndicator;
	}

	/**
	 * @param awbReviewedbyUserIndicator the awbReviewedbyUserIndicator to set
	 */
	public void setAwbReviewedbyUserIndicator(String awbReviewedbyUserIndicator) {
		this.awbReviewedbyUserIndicator = awbReviewedbyUserIndicator;
	}

	//AC406 a ends
	/**
     * Attribute to holds <code>deletionStation</code> property.
     */
    private String deletionStation;

    /**
     * Attribute to holds <code>deletionUser</code> property.
     */
    private String deletionUser;

    /**
     * Attribute to hold the <code>deliveryDetail</code> property.
     */
    private PickupAndDeliveryDetailDto deliveryDetail;

    /**
     * Attribute to hold the <code>destCustomsStation</code> property.
     */
    private String destCustomsStation;

    /**
     * Attribute to holds <code>destinationCashPaidInd</code> property.
     */
    private String destinationCashPaidInd;

    /**
     * Attribute to hold <code>destinationCurrency</code> property.
     */
    private String destinationCurrency;

    /**
     * Attribute to hold <code>dimensionalVolume</code> property.
     */
    private BigDecimal dimensionalVolume;

    /**
     * Attribute to hold the <code>dimensionalVolumeUnit</code> property.
     */

    private VolumeUOMType dimensionalVolumeUnit;

    /**
     * Attribute to hold the <code>dimensionalWeightOfShipment</code> property.
     */
    private BigDecimal dimensionalWeightOfShipment;

    /**
     * Flag to indicate a DCFAWB record exists and has at least one confirmed
     * discrepancy.
     * 
     * <ul>
     * <li>D = confirmed discrepancy</li>
     * <li>Any Other Value = no DCFAWB or DCFAWB has only unconfirmed disc</li>
     * </ul>
     */
    private String discrepancyExists;

    /**
     * Attribute to hold the <code>documentReceivedInd</code> property.
     */

    private boolean documentReceivedInd;

    /**
     * Attribute to holds <code>domesticChineseAWBIndicator</code> property.
     */
    private boolean domesticChineseAWBIndicator;

    /**
     * Attribute to hold the <code>dueAmount</code> property.
     */
    private BigDecimal dueAmount;

    /**
     * E-AWB, Is this a designated e-awb and does not require paper air way bill
     * <ul>
     * <li>Y - awb is an e-awb, set by incoming fwb</li>
     * <li>N - awb is not an e-awb, default value when c$eawb=y</li>
     * <li>Blank - awb is not an e-awb, default when c$eawb=n</li>
     * </ul>
     */
    /**
     * Attribute to holds <code>eAwbInd</code> property.
     */
    private boolean eAwbInd;

    /**
     * attribute to hold the property of eqaStation.
     */
    private String eqaStation;

    /**
     * European Customs Origin Detail
     * 
     * <ul>
     * <li>T1 = goods from outside the European Community (EC) under its customs control</li>
     * <li>T2 = EC goods not in free circulation</li>
     * <li>C = goods in free circulation</li>
     * <li>blank = goods totally outside the EC</li>
     * <li>TD = goods already under formal transit procedure.</li>
     * </ul>
     */
    private String europeanCustomsOriginDetail;

    /**
     * Attribute to hold the <code>exchangeGenerationInd</code> property.
     */

    private ExchangeRateGenerationType exchangeGenerationInd;

    /**
     * Attribute to hold the <code>exchangeRate</code> property.
     */

    private BigDecimal exchangeRate;

    /**
     * Attribute to hold the <code>expImpQualityAssuranceInd</code> property.
     */
    private String expImpQualityAssuranceInd;

    /**
     * Attribute to hold <code>exportAuditOpenDate</code> property.
     */
    private Date exportAuditOpenDate;

    /**
     * Attribute to hold <code>exportAuditOpenLocalDate</code> property.
     */
    private Date exportAuditOpenLocalDate;

    /**
     * Attribute to hold <code>exportAuditReleaseDate</code> property.
     */
    private Date exportAuditReleaseDate;

    /**
     * Attribute to hold the <code>exportAuditStatus</code> property.
     */

    private AuditStatusType exportAuditStatus;

    /**
     * Attribute to hold the <code>exportDeclarationNumber</code> property.
     */

    private String exportDeclarationNumber;

    /**
     * Attribute to hold the <code>exportDueAmount</code> property.
     */
    private BigDecimal exportDueAmount;

    /**
     * Attribute to holds <code>exportPaycode</code> property. ER Paycode
     */
    private AWBPaycodeType exportPaycode;

    /**
     * Attribute to hold the <code>exportPaycodeOverriddenFlag</code> property.
     */

    private Boolean exportPaycodeOverriddenFlag;

    /**
     * Attribute to holds <code>exportReportingStation</code> property.
     * 
     * ER Station
     */
    private String exportReportingStation;

    /**
     * Attribute to hold the <code>finalDispositionStatus</code> property.
     */

    private String finalDispositionStatus;

    /**
     * Attribute to hold the <code>finalFWBStatus</code> property.
     * 
     */
    private boolean finalFWBStatus;

    /**
     * Attribute to hold the <code>forceToAccAcceptGoods</code> property.
     */

    private String forceToAccAcceptGoods;

    /**
     * Attribute to hold the <code>forceToAccMovementDate</code> property.
     */

    private Date forceToAccMovementDate;

    /**
     * Attribute to hold the <code>forceToAccMovementStation</code> property.
     */

    private String forceToAccMovementStation;

    /**
     * Attribute to hold the <code>fsuDlvPieces</code> property.
     */
    private Integer fsuDlvPieces;

    /**
     * Attribute to hold the <code>fsuDlvPiecesTracked</code> property.
     */
    private Boolean fsuDlvPiecesTracked;

    /**
     * Attribute to hold the <code>fsuRcfPieces</code> property.
     */
    private Integer fsuRcfPieces;

    /**
     * Attribute to hold the <code>fsuRcsPieces</code> property.
     */
    private Integer FsuRcsPieces;

    /**
     * Attribute to hold the <code>fsuRctPieces</code> property.
     */
    private Integer fsuRctPieces;

    /**
     * Attribute to hold the <code>fwbInputMsgInd</code> property.
     */
    private String fwbInputMsgInd;

    /**
     * Attribute to holds <code>fwbMessageInd</code> property.
     */
    private AirWaybillFWBStatus fwbMessageInd;

    /**
     * Attribute to hold the <code>FWB Reject remarks</code> property.
     */
    private String fwbRejectionRemarks;

    /**
     * Attribute to hold the <code> gameChangerInd</code> property.
     */
    private int gameChangerInd;

    /**
     * Attribute to hold the <code> gblStatus</code> property.
     */
    private int gblStatus;

    /**
     * Government Tax Indicator
     * <ul>
     * <li>N or blank = Government tax charge has not been calculated.</li>
     * <li>Y = Government tax charge has been calculated.</li>
     * </ul>
     */
    private String governmentTaxIndicator;

    /**
     * Attribute to hold <code>hAWBValidate</code> property.
     */
    private boolean hAWBValidate;

    /**
     * Attribute to holds <code>houseShipmentDiscQueueInd</code> property.
     */
    private String houseShipmentDiscQueueInd;

    /**
     * Attribute to hold <code>importAuditOpenDate</code> property.
     */
    private Date importAuditOpenDate;

    /**
     * Attribute to hold <code>importAuditOpenLocalDate</code> property.
     */
    private Date importAuditOpenLocalDate;

    /**
     * Attribute to hold <code>importAuditReleaseDate</code> property.
     */
    private Date importAuditReleaseDate;

    /**
     * Attribute to hold the <code>importAuditStatus</code> property.
     */

    private AuditStatusType importAuditStatus;

    /**
     * Attribute to hold the <code> importClearanceNumber</code> property.
     */

    private String importClearanceNumber;

    private Integer importCleared;

    /**
     * Attribute to hold the <code>importCustomsStatus</code> property.
     */

    private String importCustomsStatus;

    /**
     * Attribute to hold the <code>importDueAmount</code> property.
     */
    private BigDecimal importDueAmount;

    /**
     * Attribute to holds <code>importPayCode</code> property. IR Paycode
     */
    private AWBPaycodeType importPaycode;

    /**
     * Attribute to hold the <code>importPaycodeOverriddenFlag</code> property.
     */

    private Boolean importPaycodeOverriddenFlag;

    /**
     * Attribute to holds <code>importReportingStation</code> property.
     */
    private String importReportingStation;

    /**
     * Attribute to hold the <code>importReportingStationPieces</code> property.
     */

    private int importReportingStationPieces;

    /**
     * Freight Bill In bond Indicator.
     * <ul>
     * <li>Y = in bond</li>
     * <li>N = not in bond</li>
     * </ul>
     */
    private String inBondIndicator;

    /**
     * Attribute to hold the <code>incompleteSDCTWInd</code> property.
     */
    private Boolean incompleteSDCTWInd;

    /**
     * Attribute to holds <code>insuranceCode</code> property.
     */
    private String insuranceCode;

    /**
     * Attribute to hold the <code>insuranceInd</code> property.
     */

    private boolean insuranceInd;

    /**
     * Attribute to holds <code>insuranceValue</code> property.
     */
    private String insuranceValue;

    /**
     * Freight Bill Domestic/International Indicator
     * <ul>
     * <li>D = Domestic. Any AWB with an origin and destination within the US.</li>
     * <li>I = International. Any AWB with an origin and destination not within a single country and with at
     * least origin or destination not within North America.</li>
     * <li>N = North American. Any AWB with an origin and destination if different countries in North America.
     * This includes the following countries: CA, MX, PR, US, and VI.</li>
     * </ul>
     */
    private InternationalAWBType internationalAWBType;

    /**
     * Attribute to hold the <code>internationalType</code> property.
     */

    private String internationalType;

    /**
     * Attribute to hold the <code>iqaCompletedInd</code> property.
     */

    private String iqaCompletedInd;

    /**
     * Attribute to hold the <code>lastAPIOGroupNumber</code> property.
     */
    private Long lastAPIOGroupNumber;

    /**
     * Attribute to hold the <code>lastOverpackGroupNumber</code> property.
     */
    private Long lastOverpackGroupNumber;

    /**
     * Attribute to holds <code>manualAuditQueueInd</code> property.
     */
    private String manualAuditQueueInd;

    /**
     * Attribute to hold the <code>manuallyAuditedInd</code> property.
     */
    private boolean manuallyAuditedInd;

    /**
     * Attribute to holds <code>manualRateQueueInd</code> property.
     */
    private String manualRateQueueInd;

    /**
     * Attribute to holds <code>manualTariffRatingQueueInd</code> property.
     */
    private String manualTariffRatingQueueInd;

    /**
     * Attribute to holds <code>markedForSpecialPurge</code> property.
     */
    private String markedForSpecialPurge;

    /**
     * Attribute to holds <code>mawbProcessForCCCGOtherCharge</code> property.
     */

    private Boolean mawbProcessForCCCGOtherCharge;

    /**
     * Attribute to holds <code>mawbProcessForDFOtherChargeByShipReq</code> property.
     */
    private Boolean mawbProcessForDFOtherChargeByShipReq;

    /**
     * Attribute to holds <code>mAWBStatus</code> property.
     */
    private MasterAwbStatusType mAWBStatus;

    /**
     * Attribute to hold <code>message</code> property.
     */
    private String message;

    /**
     * Attribute to holds <code>miscellaneousRateQueueInd</code> property.
     */
    private String miscellaneousRateQueueInd;

    /**
     * Attribute to holds <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>importAccountReleaseDate</code> property.
     */
    private Date openAccountingExportDate;

    /**
     * Attribute to hold <code>importAccountReleaseDate</code> property.
     */
    private Date openAccountingImportDate;

    /**
     * Attribute to hold <code>originalExchangeRate</code> property.
     */

    private BigDecimal originalExchangeRate;

    /**
     * Attribute to hold <code>originalPrinted</code> property.
     */
    private boolean originalPrinted;

    /**
     * Attribute to hold the <code> originatedAsFwb</code> property.
     */

    private boolean originatedAsFwb;

    /**
     * Attribute to hold the <code>originatedAsXfwb</code> property.
     */
    private boolean originatedAsXfwb;

    /**
     * Attribute to holds <code>originCashPaidInd</code> property.
     */
    private String originCashPaidInd;

    /**
     * Attribute to holds <code>originCurrency</code> property.
     */
    private String originCurrency;

    /**
     * Attribute to hold the <code> originIataRegion</code> property.
     */

    private String originIataRegion;

    /**
     * Attribute to hold the <code> outgoingFSUCounter</code> property.
     */
    private Integer outgoingFSUCounter;

    /**
     * PAD images, Attachments Exist.
     */
    private String padAttachmentsExist;

    /**
     * PAD FWB Info Exists.
     * <ul>
     * <li>y = yes</li>
     * <li>anything else = no</li>
     * </ul>
     */
    private String padFwbInfoExists;

    /**
     * PAD General Info Exists.
     */
    private String padGeneralInfoExists;

    /**
     * PAD Handling Info Exists.
     * <ul>
     * <li>y = yes</li>
     * <li>anything else = no</li>
     * </ul>
     */
    private String padHandlingInfoExists;

    /**
     * PAD terminal warehouse handling info exists.
     * <ul>
     * <li>y = yes</li>
     * <li>anything else = no</li>
     * </ul>
     */
    private String padShipmentHandlingExists;

    /**
     * PAD Tracing Info Exists.
     * <ul>
     * <li>y = yes</li>
     * <li>anything else = no</li>
     * </ul>
     */
    private String padTracingInfoExists;

    /**
     * Attribute to holds <code>paperAWBOverrideInd</code> property.
     */
    private boolean paperAWBOverrideInd;

    /**
     * Attribute to holds <code>participantQueueInd</code> property.
     */
    private String participantQueueInd;

    /**
     * Attribute to holds <code>paperAWBOverrideInd</code> property.
     */
    private String paymentEntryType;

    /**
     * Attribute to hold the <code>pickupDetail</code> property.
     */
    private PickupAndDeliveryDetailDto pickupDetail;

    /**
     * Attribute to hold the <code>prepaidCashTotal</code> property.
     */
    private BigDecimal prepaidCashTotal;

    /**
     * Attribute to hold the <code>PricingDateInd</code> property.
     */

    private String PricingDateInd;

    /**
     * Freight Bill Priority Valid values are: blank and 1 to 9.
     * <ul>
     * <li>blank = no priority</li>
     * <li>1 = highest priority</li>
     * <li>9 = lowest priority</li>
     * </ul>
     */
    private Integer priority;

    /**
     * Freight Bill Priority Source Valid values are: U,C,P,A.
     * <ul>
     * <li>U = user input priority</li>
     * <li>C = commodity/product priority</li>
     * <li>P = participant priority</li>
     * <li>A = allotment priority</li>
     * </ul>
     */
    private String prioritySource;

    /**
     * Attribute to hold the <code>prodCNLNotAllowed</code> property.
     */
    private boolean prodCNLNotAllowed;

    /**
     * Attribute to hold the <code>prodSDCType</code> property.
     */
    private ShipmentDataType prodSDCType;

    /**
     * Attribute to hold the <code>prodUPDNotAllowed</code> property.
     */
    private boolean prodUPDNotAllowed;

    /**
     * Attribute to hold the <code>protGameChangerInd</code> property.
     */
    private int protGameChangerInd;

    /**
     * Attribute to hold the <code>purgeDate</code> property.
     */
    private Date purgeDate;

    /**
     * Export Reporting/Import Reporting Quality Assurance Indicator. Indicates
     * that EQA/IQA function was complete.
     * 
     * <ul>
     * <li>E = EQA is completed</li>
     * <li>I = IQA is completed</li>
     * <li>B = EQA and IQA (both) are completed.</li>
     * <li>blank = none is completed</li>
     * </ul>
     */
    private String qualityAssuranceIndicator;

    /**
     * Attribute to hold the <code>rateLockInd</code> property.
     */
    private Boolean rateLockInd;

    /**
     * Attribute to hold the <code>readyForDeliveryInd</code> property.
     */
    private boolean readyForDeliveryInd;

    /**
     * Attribute to hold the <code>reasonCodes</code> property.
     */
    private List<String> reasonCodes;

    private boolean securityDataPresent;

    /**
     * Attribute to hold the <code>SecurityDeclarationDto</code> property.
     */

    private SecurityDeclarationDto securityDeclarationDto;

    /**
     * Attribute to hold the <code>sentAsFwb</code> property.
     */

    private boolean sentAsFwb;

    /**
     * Attribute to hold the <code>shedCode</code> property.
     */

    private String shedCode;

    /**
     * Attribute to hold <code>shipmentStatusDto</code> property.
     * 
     */
    private ShipmentStatusDto shipmentStatusDto;

    /**
     * Attribute to hold the <code>shipmentVolumeUnit</code> property.
     */
    private VolumeUOMType shipmentVolumeUnit;

    /**
     * Attribute to hold the <code>shipmentWeightUnit</code> property.
     */

    private WeightUOMType shipmentWeightUnit;

    /**
     * Attribute to hold <code>shipperCertSign</code> property.
     * 
     */
    private String shipperCertSign;

    /**
     * Attribute to hold the <code>specialPurge</code> property.
     */
    private SpecialPurgeType specialPurge;

    /**
     * Attribute to hold the <code>statusCodeType</code> property.
     */
    private FSUStatusType statusCodeType;

    /**
     * Attribute to holds <code>surfaceDestinationStation</code> property.
     */
    private String surfaceDestinationStation;

    /**
     * Attribute to holds <code>surfaceOriginStation</code> property.
     */
    private String surfaceOriginStation;

    /**
     * Attribute to holds <code>teletypeAddress</code> property.
     */
    private String teletypeAddress;

    /**
     * Attribute to holds <code>terminalWarehouseDiscQueueInd</code> property.
     */
    private String terminalWarehouseDiscQueueInd;

    /**
     * Attribute to hold the <code>totalCashColExport</code> property.
     */

    private BigDecimal totalCashColExport;

    /**
     * Attribute to hold the <code>totalCashColImport</code> property.
     */
    private BigDecimal totalCashColImport;

    /**
     * Attribute to holds <code>totalCashCollectExport</code> property.
     */
    private BigDecimal totalCashCollectExport;

    /**
     * Attribute to holds <code>totalCashCollectImport</code> property.
     */
    private BigDecimal totalCashCollectImport;

    /**
     * Attribute to holds <code>totalHAWBCashOutstanding</code> property.
     */
    private BigDecimal totalHAWBCashOutstanding;

    /**
     * Attribute to holds <code>totalHAWBCreditOutstanding</code> property.
     */
    private BigDecimal totalHAWBCreditOutstanding;

    /**
     * Total pieces registered via data capture (ESI, EGI, GAC, FFM) SDC Pieces.
     * - FIXPCS
     * 
     * SDCTotals (Data Capture Pieces)
     */
    private long totalPieces;

    /**
     * Attribute to holds <code>totalReceivedPieces</code> property.
     */
    private String totalReceivedPieces;

    /**
     * Total volume registered via data capture (ESI, EGI) SDC Volume - FIUVOL.
     */
    private BigDecimal totalVolume;

    /**
     * Total weight registered via data capture (ESI, EGI, GAC) Stored in the
     * units indicated by FIMUWT - FIIWGT SDC Weight.
     */
    private BigDecimal totalWeight;

    /**
     * Attribute to hold the <code>traderNumber</code> property.
     */

    private String traderNumber;

    /**
     * Attribute to holds <code>transferCarrierFrom</code> property.
     */
    private String transferCarrierFrom;

    /**
     * Attribute to holds <code>transferCarrierTo</code> property.
     */
    private String transferCarrierTo;

    /**
     * Attribute to hold the <code> transitCountry</code> property.
     */

    private String transitCountry;

    /**
     * Attribute to hold the <code>transitDeclarationNumber</code> property.
     */

    private String transitDeclarationNumber;

    /**
     * Attribute to hold the <code>unclearedAWBInd</code> property.
     */
    private Boolean unclearedAWBInd;

    /**
     * Attribute to hold the <code>unclearedDate</code> property.
     */
    private Date unclearedDate;

    /**
     * Attribute to hold the <code>unclearedStation</code> property.
     */
    private List<String> unclearedStation;

    /**
     * Attribute to hold the <code>unclearedStationType</code> property.
     */
    private String unclearedStationType;

    /**
     * Attribute to hold <code>updationSource</code> property.
     * 
     */
    private String updationSource;

    /**
     * Attribute to hold the <code>volumeEvaluationMethod</code> property.
     */

    private VolumeEvaluationMethod volumeEvaluationMethod;

    /**
     * Attribute to hold the <code>weightChargeType</code> property.
     */
    private RateDiscriminatorType weightChargeType;

    // AC377 starts
    /**
     * Attribute to holds <code>genericEAWBBilateralIndicator</code> property.
     */
    private boolean genericEAWBBilateralIndicator;
    /**
     * Attribute to holds <code>eAirWaybillBilateralIndicator</code> property.
     */
    private boolean eAirWaybillBilateralIndicator;

    private boolean shipmentCaptureDoneAtDestination;
    
    
    private boolean genericEAWBBilateralAvlblInd;

	// AC377 ends
    private boolean EAWBMultilateralAppliedIndicator;

	//AC377 Starts
    /**
     * Gets the <code>eAirWaybillBilateralIndicator</code> injected by the
     * Inversion of Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>genericEAWBBilateralIndicator</code>
     *         property.
     */
	public boolean iseAirWaybillBilateralIndicator() {
		return eAirWaybillBilateralIndicator;
	}
	/**
     * Sets the <code>eAirWaybillBilateralIndicator</code> injected by the
     * Inversion of Control (IoC) container.
     * <p>
     * 
     * @param pGenericEAWBBilateralIndicator
     *            the new value of <code>PaperAWBOverrideIndicator</code>
     *            property.
     */
	public void seteAirWaybillBilateralIndicator(
			boolean eAirWaybillBilateralIndicator) {
		this.eAirWaybillBilateralIndicator = eAirWaybillBilateralIndicator;
	}
	
	public boolean isGenericEAWBBilateralAvlblInd() {
		return genericEAWBBilateralAvlblInd;
	}
	public void setGenericEAWBBilateralAvlblInd(boolean genericEAWBBilateralAvlblInd) {
		this.genericEAWBBilateralAvlblInd = genericEAWBBilateralAvlblInd;
	}
	//AC377 Ends

    
    private String uniqueTaxIdentificationCode; //HIS019


	/* Changes for DL584 starts */
	/**
	 * Attribute to hold the <code>isThisaCatDogOrPet</code> property.
	 */
	private String isThisaCatDogOrPet;

	/**
	 * Attribute to hold the <code>numberOfAnimals</code> property.
	 */
	private Integer numberOfAnimals;

	/* Changes for DL584 ends */
	
	//DL569 starts
	private Boolean unclearedAWBResolvedInd;
	
	private Date unclearedReportStartDate;
	
	private Date unclearedReportEndDate;
	
	private Date accountingFileDateExport;
	
	private Date accountingFileDateImport;
	
	private Date accountingFileDate;
	
	private Date archiveDate;
	
	private Date executionDate;
	
	private boolean importCustomsInd;
	
	private int importPiecesCleared;
	
	private int importPiecesDelivered;
	
	private boolean transitCustomsInd;
	
	private String consigneeRemarks1;
	
	private String consigneeRemarks2;
	
	private String shipperRemarks;
	
	private String dimentionRotateInd;
	
	private String dimentionalVolMethodInd;
	
	
	public Date getAccountingFileDate() {
		return accountingFileDate;
	}

	public void setAccountingFileDate(Date accountingFileDate) {
		this.accountingFileDate = accountingFileDate;
	}

	public Date getAccountingFileDateExport() {
		return accountingFileDateExport;
	}

	public void setAccountingFileDateExport(Date accountingFileDateExport) {
		this.accountingFileDateExport = accountingFileDateExport;
	}

	public Date getAccountingFileDateImport() {
		return accountingFileDateImport;
	}

	public void setAccountingFileDateImport(Date accountingFileDateImport) {
		this.accountingFileDateImport = accountingFileDateImport;
	}

	public Date getUnclearedReportStartDate() {
		return unclearedReportStartDate;
	}

	public void setUnclearedReportStartDate(Date unclearedReportStartDate) {
		this.unclearedReportStartDate = unclearedReportStartDate;
	}

	public Date getUnclearedReportEndDate() {
		return unclearedReportEndDate;
	}

	public void setUnclearedReportEndDate(Date unclearedReportEndDate) {
		this.unclearedReportEndDate = unclearedReportEndDate;
	}

	public Boolean getUnclearedAWBResolvedInd() {
		return unclearedAWBResolvedInd;
	}

	public void setUnclearedAWBResolvedInd(Boolean unclearedAWBResolvedInd) {
		this.unclearedAWBResolvedInd = unclearedAWBResolvedInd;
	}
	
	public Date getArchiveDate() {
		return archiveDate;
	}

	public void setArchiveDate(Date archiveDate) {
		this.archiveDate = archiveDate;
	}
    //DL569 ends

	public boolean isShipmentCaptureDoneAtDestination() {

        return shipmentCaptureDoneAtDestination;
    }

    public void setShipmentCaptureDoneAtDestination(final boolean shipmentCaptureDoneAtDestination) {
        this.shipmentCaptureDoneAtDestination = shipmentCaptureDoneAtDestination;
    }
    
    private boolean awbDocInd;
    
    private String accountingRemarks;
    
    private String custDestStation;
    
    private String importFlightNumber;

    public boolean isAwbDocInd() {
		return awbDocInd;
	}

	public void setAwbDocInd(boolean pAwbDocInd) {
		this.awbDocInd = pAwbDocInd;
	}

    /**
     * Gets the <code>accountingDetailDto</code> injected by the Inversion of
     * Control (IoC) container.
     * 
     * @return the accountingDetailDto
     */
    public AccountingDetailDto getAccountingDetailDto() {
        if (this.accountingDetailDto == null) {
            this.accountingDetailDto = new AccountingDetailDto();
        }
        return this.accountingDetailDto;
    }

    /**
     * Gets the <code>accumulatedCCAamount</code> property.
     * 
     * @return the current value of the <code>accumulatedCCAamount</code> property.
     */
    public BigDecimal getAccumulatedCCAamount() {
        return this.accumulatedCCAamount;
    }

    /**
     * Gets the <code>actualRateQueueInd</code> property.
     * <p>
     * 
     * @return the current value of <code>actualRateQueueInd</code> property.
     */
    public String getActualRateQueueInd() {
        return this.actualRateQueueInd;
    }

    /**
     * Gets the <code>AgentCode</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @return the current value of <code>AgentCode</code> property.
     */

    public String getAgentCode() {
        return this.agentCode;
    }

    /**
     * Gets the <code>agentName</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @return the current value of <code>agentName</code> property.
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * Gets the <code>airlineHoldAction</code> property.
     * <p>
     * 
     * @return the current value of <code>airlineHoldAction</code> property.
     */
    public String getAirlineHoldAction() {
        return this.airlineHoldAction;
    }

    /**
     * Gets the <code>airlineHoldReason</code> property.
     * <p>
     * 
     * @return the current value of <code>airlineHoldReason</code> property.
     */
    public String getAirlineHoldReason() {
        return this.airlineHoldReason;
    }

    /**
     * Gets the <code>airlineHoldStation</code> property.
     * <p>
     * 
     * @return the current value of <code>airlineHoldStation</code> property.
     */
    public String getAirlineHoldStation() {
        return this.airlineHoldStation;
    }

    /**
     * Gets the <code>airWaybillCreationChannelType</code> property.
     * <p>
     * 
     * @return the current value of <code>airWaybillCreationChannelType</code> property.
     */
    public ChannelType getAirWaybillCreationChannelType() {
        return this.airWaybillCreationChannelType;
    }

    /**
     * Gets the <code>airWaybillCreationSourceType</code> property.
     * <p>
     * 
     * @return the current value of <code>airWaybillCreationSourceType</code> property.
     */

    /**
     * Gets the <code>airwayBillDeliveryZone</code> property.
     * <p>
     * 
     * @return the current value of <code>airwayBillDeliveryZone</code> property.
     */
    public String getAirWaybillDeliveryZone() {
        return this.airWaybillDeliveryZone;
    }

    /**
     * Gets the <code>airWaybillUpdationChannelType</code> property.
     * <p>
     * 
     * @return the current value of <code>airWaybillUpdationChannelType</code> property.
     */
    public ChannelType getAirWaybillUpdationChannelType() {
        return this.airWaybillUpdationChannelType;
    }

    /**
     * Gets the <code>airWaybillUpdationSourceType</code> property.
     * <p>
     * 
     * @return the current value of <code>airWaybillUpdationSourceType</code> property.
     */

    public AirWaybillSourceType getAirWaybillUpdationSourceType() {
        return this.airWaybillUpdationSourceType;
    }

    /**
     * Gets the <code>awbDeleteIndicator</code> property.
     * 
     * @return the current value of <code>awbDeleteIndicator</code> property.
     */
    public String getAwbDeleteIndicator() {
        return this.awbDeleteIndicator;
    }

    /**
     * Gets the <code>awbDescription</code> property.
     * 
     * @return the current value of <code>awbDescription</code> property.
     */
    public String getAwbDescription() {
        return this.awbDescription;
    }

    /**
     * Gets the <code>awbGeneratedDetailDto</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>awbGeneratedDetailDto</code> property.
     */
    public AWBGeneratedDetailDto getAwbGeneratedDetailDto() {
        if (this.awbGeneratedDetailDto == null) {
            this.awbGeneratedDetailDto = new AWBGeneratedDetailDto();
        }
        return this.awbGeneratedDetailDto;
    }

    /**
     * Gets the <code>awbKeyDatesDto</code> property.
     * 
     * @return the awbKeyDatesDto
     */
    public AWBKeyDatesDto getAwbKeyDatesDto() {
        if (this.awbKeyDatesDto == null) {
            this.awbKeyDatesDto = new AWBKeyDatesDto();
        }
        return this.awbKeyDatesDto;
    }

    /**
     * Gets the <code>AwbLockedInd</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @return the current value of <code>AwbLockedInd</code> property.
     */

    public String getAwbLockedInd() {
        return this.awbLockedInd;
    }

    /**
     * Gets the <code>awbLockStation</code> property.
     * <p>
     * 
     * @return the current value of <code>awbLockStation</code> property.
     */

    public String getAwbLockStation() {
        return this.awbLockStation;
    }

    /**
     * Gets the <code>AwbPriority</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @return the current value of <code>AwbPriority</code> property.
     */

    public String getAwbPriority() {
        return this.awbPriority;
    }

    /**
     * Gets the <code>awbStatuses</code> property.
     * 
     * @return the awbStatuses
     */
    public List<String> getAwbStatuses() {
        if (this.awbStatuses == null) {
            this.awbStatuses = new ArrayList<String>();
        }
        return this.awbStatuses;
    }

    /**
     * Gets the <code>bankSellingRate</code> property.
     * 
     * @return the current value of the <code>bankSellingRate</code> property.
     */
    public BigDecimal getBankSellingRate() {
        return this.bankSellingRate;
    }

    /**
     * Gets the <code>brlStatus</code> property.
     * <p>
     * 
     * @return the current value of <code>brlStatus</code> property.
     */
    public int getBrlStatus() {
        return this.brlStatus;
    }

    /**
     * Gets the <code>businessArea</code> property.
     * 
     * @return the current value of the <code>businessArea</code> property.
     */
    public List<String> getBusinessArea() {
        return this.businessArea;
    }

    /**
     * Gets the <code>businessAreas</code> property.
     * <p>
     * 
     * @return the current value of <code>businessAreas</code> property.
     */
    public String getBusinessAreas() {
        return this.businessAreas;
    }

    /**
     * Gets the <code>cashDrawerName</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @return the current value of <code>cashDrawerName</code> property.
     */
    public String getCashDrawerName() {
        return this.cashDrawerName;
    }

    /**
     * Gets the <code>codAmount</code> property.
     * <p>
     * 
     * @return the current value of <code>codAmount</code> property.
     */
    public BigDecimal getCodAmount() {
        return this.codAmount;
    }

    /**
     * Gets the <code>codAmountInDestination</code> property.
     * <p>
     * 
     * @return the current value of <code>codAmountInDestination</code> property.
     */
    public BigDecimal getCodAmountInDestination() {
        return this.codAmountInDestination;
    }

    /**
     * Gets the <code>codAmountInOrigin</code> property.
     * <p>
     * 
     * @return the current value of <code>codAmountInOrigin</code> property.
     */
    public BigDecimal getCodAmountInOrigin() {
        return this.codAmountInOrigin;
    }

    /**
     * @return the codCashPaymentInd
     */
    public boolean getCodCashPaymentInd() {
        return this.codCashPaymentInd;
    }

    /**
     * Gets the <code>codCur</code> property.
     * <p>
     * 
     * @return the current value of <code>codCur</code> property.
     */
    public String getCodCur() {
        return this.codCur;
    }

    /**
     * Gets the <code>codDue</code> property.
     * <p>
     * 
     * @return the current value of <code>codDue</code> property.
     */
    public BigDecimal getCodDue() {
        return this.codDue;
    }

    /**
     * Gets the <code>codExchangeRate</code> property.
     * <p>
     * 
     * @return the current value of <code>codExchangeRate</code> property.
     */
    public BigDecimal getCodExchangeRate() {
        return this.codExchangeRate;
    }

    /**
     * @return the collectCashTotal
     */
    public BigDecimal getCollectCashTotal() {
        return this.collectCashTotal;
    }

    /**
     * Gets the <code>collectChargesRestrictionInd</code> property.
     * <p>
     * 
     * @return the current value of <code>collectChargesRestrictionInd</code> property.
     */
    public String getCollectChargesRestrictionInd() {
        return this.collectChargesRestrictionInd;
    }

    /**
     * Gets the <code>commercialControlOnBookingInd</code> property.
     * <p>
     * 
     * @return the current value of <code>commercialControlOnBookingInd</code> property.
     */
    public CommercialControlType getCommercialControlOnBookingInd() {
        return this.commercialControlOnBookingInd;
    }

    /**
     * Gets the <code>createUpdateSource</code> property.
     * <p>
     * 
     * @return the current value of <code>createUpdateSource</code> property.
     */

    /**
     * Gets the <code>creationSource</code> property.
     * <p>
     * 
     * @return the current value of <code>creationSource</code> property.
     */
    public String getCreationSource() {
        return this.creationSource;
    }

    /**
     * Gets the <code>CrossReference1</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>CrossReference1</code> property.
     */
    public String getCrossReference1() {
        return this.crossReference1;
    }

    /**
     * Gets the <code>CrossReference2</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>CrossReference2</code> property.
     */
    public String getCrossReference2() {
        return this.crossReference2;
    }

    /**
     * Gets the <code>CrossReferenceIndicator1</code> injected by the Inversion
     * of Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>CrossReferenceIndicator1</code> property.
     */
    public String getCrossReferenceIndicator1() {
        return this.crossReferenceIndicator1;
    }

    /**
     * Gets the <code>CrossReferenceIndicator2</code> injected by the Inversion
     * of Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>CrossReferenceIndicator2</code> property.
     */
    public String getCrossReferenceIndicator2() {
        return this.crossReferenceIndicator2;
    }

    /**
     * Gets the <code>cruQueueInd</code> property.
     * <p>
     * 
     * @return the current value of <code>cruQueueInd</code> property.
     */
    public String getCruQueueInd() {
        return this.cruQueueInd;
    }

    /**
     * Gets the <code>currentOriginalInd</code> property.
     * <p>
     * 
     * @return the current value of <code>currentOriginalInd</code> property.
     */
    public AirWayBillCurrentOriginal getCurrentOriginalInd() {
        return this.currentOriginalInd;
    }

    /**
     * Gets the <code>customerSegmentation</code> property.
     * <p>
     * 
     * @return the current value of <code>customerSegmentation</code> property.
     */
    public String getCustomerSegmentation() {
        return this.customerSegmentation;
    }

    /**
     * Gets the <code>CustomsValue</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @return the current value of <code>CustomsValue</code> property.
     */
    public String getCustomsValue() {
        return this.customsValue;
    }

    /**
     * Gets the <code>DeclarantEoriCountry</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>DeclarantEoriCountry</code> property.
     */
    public String getDeclarantEoriCountry() {
        return this.declarantEoriCountry;
    }

    /**
     * Gets the <code>DeclarantEoriNumber</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>DeclarantEoriNumber</code> property.
     */
    public String getDeclarantEoriNumber() {
        return this.declarantEoriNumber;
    }

    /**
     * Gets the <code>DeclaredValue</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @return the current value of <code>DeclaredValue</code> property.
     */
    public String getDeclaredValue() {
        return this.declaredValue;
    }

    /**
     * Gets the <code>deletionUser</code> property.
     * <p>
     * 
     * @return the current value of <code>deletionUser</code> property.
     */
    public String getDeletionOffice() {
        return this.deletionOffice;
    }

    /**
     * Gets the <code>deletionRemarks</code> value.
     * <p>
     * 
     * @return the current value of <code>deletionRemarks</code> property.
     */
    public String getDeletionRemarks() {
        return this.deletionRemarks;
    }

    /**
     * Gets the <code>deletionUser</code> property.
     * <p>
     * 
     * @return the current value of <code>deletionUser</code> property.
     */
    public String getDeletionStation() {
        return this.deletionStation;
    }

    /**
     * Gets the <code>deletionUser</code> property.
     * <p>
     * 
     * @return the current value of <code>deletionUser</code> property.
     */
    public String getDeletionUser() {
        return this.deletionUser;
    }

    /**
     * Gets the <code>deliveryDetail</code> have shipment delivery status and
     * driver details.
     * 
     * @return the current value of <code>deliveryDetail</code> property.
     */
    public PickupAndDeliveryDetailDto getDeliveryDetail() {
        return this.deliveryDetail;
    }

    /**
     * Gets the <code>DestCustomsStation</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>DestCustomsStation</code> property.
     */
    public String getDestCustomsStation() {
        return this.destCustomsStation;
    }

    /**
     * @return the destinationCashPaidInd
     */
    public String getDestinationCashPaidInd() {
        return this.destinationCashPaidInd;
    }

    /**
     * Gets the <code>DestinationCurrency</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>DestinationCurrency</code> property.
     */
    public String getDestinationCurrency() {
        return this.destinationCurrency;
    }

    /**
     * Gets the <code>DimensionalVolume</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>DimensionalVolume</code> property.
     */
    public BigDecimal getDimensionalVolume() {
        return this.dimensionalVolume;
    }

    /**
     * Gets the <code>DimensionalVolumeUnit</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>DimensionalVolumeUnit</code> property.
     */
    public VolumeUOMType getDimensionalVolumeUnit() {
        return this.dimensionalVolumeUnit;
    }

    /**
     * Gets the <code>DimensionalWeightOfShipment</code> injected by the
     * Inversion of Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>DimensionalWeightOfShipment</code> property.
     */
    public BigDecimal getDimensionalWeightOfShipment() {
        return this.dimensionalWeightOfShipment;
    }

    /**
     * Gets the <code>DiscrepancyExists</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>DiscrepancyExists</code> property.
     */
    public String getDiscrepancyExists() {
        return this.discrepancyExists;
    }

    /**
     * Gets the <code>documentReceivedInd</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>documentReceivedInd</code> property.
     */
    public boolean getDocumentReceivedInd() {
        return this.documentReceivedInd;
    }

    /**
     * Gets the <code>pDueAmount</code> property.
     * <p>
     * 
     * @return the current value of the <code>pDueAmount</code> property.
     */
    public BigDecimal getDueAmount() {
        return this.dueAmount;
    }

    /**
     * Gets the <code>eAwbInd</code> injected by the Inversion of Control (IoC)
     * container.
     * <p>
     * 
     * @return the current value of <code>eAwbInd</code> property.
     */
    public boolean iseAwbInd() {
        return this.eAwbInd;
    }

    /**
     * @return the eqaStation
     */
    public String getEqaStation() {
        return this.eqaStation;
    }

    /**
     * Gets the <code>EuropeanCustomsOriginDetail</code> injected by the
     * Inversion of Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>EuropeanCustomsOriginDetail</code> property.
     */
    public String getEuropeanCustomsOriginDetail() {
        return this.europeanCustomsOriginDetail;
    }

    /**
     * Gets the <code>exchangeGenerationInd</code> injected by the Inversion of
     * Control (IoC) container.
     * 
     * @return the exchangeGenerationInd
     */
    public ExchangeRateGenerationType getExchangeGenerationInd() {
        return this.exchangeGenerationInd;
    }

    /**
     * Gets the <code>EarliestTravelDate</code> property.
     * <p>
     * 
     * @return the current value of <code>exchangeRate</code> property.
     */
    public BigDecimal getExchangeRate() {
        return this.exchangeRate;
    }

    /**
     * Gets the <code>expImpQualityAssuranceInd</code> property.
     * <p>
     * 
     * @return the expImpQualityAssuranceInd
     */
    public String getExpImpQualityAssuranceInd() {
        return this.expImpQualityAssuranceInd;
    }

    /**
     * Gets the <code>ExportAuditOpenDate</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>ExportAuditOpenDate</code> property.
     */
    public Date getExportAuditOpenDate() {
        return ContractUtility.getClonedDate(this.exportAuditOpenDate);
    }

    /**
     * Gets the <code>exportAuditOpenLocalDate</code> property.
     * 
     * @return
     */
    public Date getExportAuditOpenLocalDate() {
        return exportAuditOpenLocalDate;
    }

    /**
     * Gets the <code>ExportAuditReleaseDate</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>ExportAuditReleaseDate</code> property.
     */
    public Date getExportAuditReleaseDate() {
        return ContractUtility.getClonedDate(this.exportAuditReleaseDate);
    }

    /**
     * Gets the <code>ExportAuditStatus</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>ExportAuditStatus</code> property.
     */
    public AuditStatusType getExportAuditStatus() {
        return this.exportAuditStatus;
    }

    /**
     * Gets the <code>ExportDeclarationNumber</code> injected by the Inversion
     * of Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>ExportDeclarationNumber</code> property.
     */
    public String getExportDeclarationNumber() {
        return this.exportDeclarationNumber;
    }

    /**
     * Gets the <code>exportDueAmount</code> property.
     * 
     * @return the current value of the <code>exportDueAmount</code> property.
     */
    public BigDecimal getExportDueAmount() {
        return this.exportDueAmount;
    }

    /**
     * Gets the <code>ExportPaycode</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @return the current value of <code>ExportPaycode</code> property.
     */
    public AWBPaycodeType getExportPaycode() {
        return this.exportPaycode;
    }

    /**
     * Gets the <code>exportReportingStation</code> property.
     * <p>
     * 
     * @return the current value of <code>exportReportingStation</code> property.
     */
    @Deprecated
    public String getExportReportingStation() {
        return this.exportReportingStation;
    }

    /**
     * Gets the <code>finalDispositionStatus</code> property.
     * 
     * @return the current value of the <code>finalDispositionStatus</code> property.
     */
    public String getFinalDispositionStatus() {
        return this.finalDispositionStatus;
    }

    /**
     * Gets the <code>forceToAccAcceptGoods</code> property.
     * 
     * @return the current value of the <code>forceToAccAcceptGoods</code> property.
     */
    public String getForceToAccAcceptGoods() {
        return this.forceToAccAcceptGoods;
    }

    /**
     * Gets the <code>forceToAccMovementDate</code> property.
     * 
     * @return the current value of the <code>forceToAccMovementDate</code> property.
     */
    public Date getForceToAccMovementDate() {
        return ContractUtility.getClonedDate(this.forceToAccMovementDate);
    }

    /**
     * Gets the <code>forceToAccMovementStation</code> property.
     * 
     * @return the current value of the <code>forceToAccMovementStation</code> property.
     */
    public String getForceToAccMovementStation() {
        return this.forceToAccMovementStation;
    }

    /**
     * Gets the <code>fsuDlvPieces</code> property.
     * <p>
     * 
     * @return the current value of <code>fsuDlvPieces</code> property.
     */
    public Integer getFsuDlvPieces() {
        return this.fsuDlvPieces;
    }

    /**
     * Gets the <code>fsuDlvPiecesTracked</code> property.
     * <p>
     * 
     * @return the current value of <code>fsuDlvPiecesTracked</code> property.
     */
    public Boolean getFsuDlvPiecesTracked() {
        return this.fsuDlvPiecesTracked;
    }

    /**
     * Gets the <code>fsuRcfPieces</code> property.
     * <p>
     * 
     * @return the current value of <code>fsuRcfPieces</code> property.
     */
    public Integer getFsuRcfPieces() {
        return this.fsuRcfPieces;
    }

    public Integer getFsuRcsPieces() {
        return this.FsuRcsPieces;
    }

    /**
     * Gets the <code>fsuRctPieces</code> property.
     * <p>
     * 
     * @return the current value of <code>fsuRctPieces</code> property.
     */
    public Integer getFsuRctPieces() {
        return this.fsuRctPieces;
    }

    /**
     * Gets the <code>fwbInputMsgInd</code> property.
     * <p>
     * 
     * @return the current value of <code>fwbInputMsgInd</code> property.
     */
    public String getFwbInputMsgInd() {
        return this.fwbInputMsgInd;
    }

    /**
     * Gets the <code>fwbMessageInd</code> property.
     * <p>
     * 
     * @return the current value of <code>fwbMessageInd</code> property.
     */
    public AirWaybillFWBStatus getFwbMessageInd() {
        return this.fwbMessageInd;
    }

    /**
     * @return the fwbRejectionRemarks
     */
    public String getFwbRejectionRemarks() {
        return this.fwbRejectionRemarks;
    }

    /**
     * Gets the <code>gameChangerInd</code> property.
     * <p>
     * 
     * @return the current value of <code>gameChangerInd</code> property.
     */
    public int getGameChangerInd() {
        return this.gameChangerInd;
    }

    /**
     * Gets the <code>gblStatus</code> property.
     * <p>
     * 
     * @return the current value of <code>gblStatus</code> property.
     */
    public int getGblStatus() {
        return this.gblStatus;
    }

    /**
     * Gets the <code>GovernmentTaxIndicator</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>GovernmentTaxIndicator</code> property.
     */
    public String getGovernmentTaxIndicator() {
        return this.governmentTaxIndicator;
    }

    /**
     * Gets the <code>houseShipmentDiscQueueInd</code> property.
     * <p>
     * 
     * @return the current value of <code>houseShipmentDiscQueueInd</code> property.
     */
    public String getHouseShipmentDiscQueueInd() {
        return this.houseShipmentDiscQueueInd;
    }

    /**
     * Gets the <code>ImportAuditOpenDate</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>ImportAuditOpenDate</code> property.
     */
    public Date getImportAuditOpenDate() {
        return ContractUtility.getClonedDate(this.importAuditOpenDate);
    }

    /**
     * Gets the <code>importAuditOpenLocalDate</code> property.
     * 
     * @return
     */
    public Date getImportAuditOpenLocalDate() {
        return importAuditOpenLocalDate;
    }

    /**
     * Gets the <code>ImportAuditReleaseDate</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>ImportAuditReleaseDate</code> property.
     */
    public Date getImportAuditReleaseDate() {
        return ContractUtility.getClonedDate(this.importAuditReleaseDate);
    }

    /**
     * Gets the <code>ImportAuditStatus</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>ImportAuditStatus</code> property.
     */
    public AuditStatusType getImportAuditStatus() {
        return this.importAuditStatus;
    }

    /**
     * Gets the <code>ImportClearanceNumber</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>ImportClearanceNumber</code> property.
     */
    public String getImportClearanceNumber() {
        return this.importClearanceNumber;
    }

    public Integer getImportCleared() {
        return this.importCleared;
    }

    /**
     * Gets the <code>ImportCustomsStatus</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>ImportCustomsStatus</code> property.
     */
    public String getImportCustomsStatus() {
        return this.importCustomsStatus;
    }

    /**
     * Gets the <code>importDueAmount</code> property.
     * 
     * @return the current value of the <code>importDueAmount</code> property.
     */
    public BigDecimal getImportDueAmount() {
        return this.importDueAmount;
    }

    /**
     * Gets the <code>ImportPaycode</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @return the current value of <code>ImportPaycode</code> property.
     */
    public AWBPaycodeType getImportPaycode() {
        return this.importPaycode;
    }

    /**
     * Gets the <code>importReportingStation</code> property.
     * <p>
     * 
     * @return the current value of <code>importReportingStation</code> property.
     */
    @Deprecated
    public String getImportReportingStation() {
        return this.importReportingStation;
    }

    /**
     * Gets the <code>ImportReportingStationPieces</code> injected by the
     * Inversion of Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>ImportReportingStationPieces</code> property.
     */
    public int getImportReportingStationPieces() {
        return this.importReportingStationPieces;
    }

    /**
     * Gets the <code>InBondIndicator</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>InBondIndicator</code> property.
     */
    public String getInBondIndicator() {
        return this.inBondIndicator;
    }

    /**
     * Gets the <code>incompleteSDCTWInd</code> property.
     * <p>
     * 
     * @return the current value of <code>incompleteSDCTWInd</code> property.
     */
    public Boolean getIncompleteSDCTWInd() {
        return this.incompleteSDCTWInd;
    }

    /**
     * Gets the <code>InsuranceCode</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @return the current value of <code>InsuranceCode</code> property.
     */
    public String getInsuranceCode() {
        return this.insuranceCode;
    }

    /**
     * Gets the <code>InsuranceValue</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @return the current value of <code>InsuranceValue</code> property.
     */
    public String getInsuranceValue() {
        return this.insuranceValue;
    }

    /**
     * Gets the <code>InternationalAWBType</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>InternationalAWBType</code> property.
     */
    public InternationalAWBType getInternationalAWBType() {
        return this.internationalAWBType;
    }

    /**
     * Gets the <code>InternationalType</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>InternationalType</code> property.
     */
    public String getInternationalType() {
        return this.internationalType;
    }

    /**
     * Gets the <code>iqaCompletedInd</code> injected by the Inversion of
     * Control (IoC) container.
     * 
     * @return the iqaCompletedInd
     */
    public String getIqaCompletedInd() {
        return this.iqaCompletedInd;
    }

    /**
     * Gets the <code>lastAPIOGroupNumber</code> property.
     * 
     * @return the current value of the <code>lastAPIOGroupNumber</code> property.
     */
    public Long getLastAPIOGroupNumber() {
        return this.lastAPIOGroupNumber;
    }

    /**
     * Gets the <code>lastOverpackGroupNumber</code> property.
     * 
     * @return the current value of the <code>lastOverpackGroupNumber</code> property.
     */
    public Long getLastOverpackGroupNumber() {
        return this.lastOverpackGroupNumber;
    }

    /**
     * Gets the <code>manualAuditQueueInd</code> property.
     * <p>
     * 
     * @return the current value of <code>manualAuditQueueInd</code> property.
     */
    public String getManualAuditQueueInd() {
        return this.manualAuditQueueInd;
    }

    /**
     * Gets the <code>manuallyAuditedInd</code> property.
     * 
     * @return the current value of the <code>manuallyAuditedInd</code> property.
     */
    public boolean getManuallyAuditedInd() {
        return this.manuallyAuditedInd;
    }

    /**
     * Gets the <code>manualRateQueueInd</code> property.
     * <p>
     * 
     * @return the current value of <code>manualRateQueueInd</code> property.
     */
    public String getManualRateQueueInd() {
        return this.manualRateQueueInd;
    }

    /**
     * Gets the <code>manualTariffRatingQueueInd</code> property.
     * 
     * @return the current value of the <code>manualTariffRatingQueueInd</code> property.
     */
    public String getManualTariffRatingQueueInd() {
        return this.manualTariffRatingQueueInd;
    }

    /**
     * Gets the <code>markedForSpecialPurge</code> property.
     * <p>
     * 
     * @return the current value of <code>markedForSpecialPurge</code> property.
     */
    public String getMarkedForSpecialPurge() {
        return this.markedForSpecialPurge;
    }

    /**
     * @return the mawbProcessForCCCGOtherCharge
     */
    public Boolean getMawbProcessForCCCGOtherCharge() {
        return this.mawbProcessForCCCGOtherCharge;
    }

    /**
     * @return the mawbProcessForDFOtherChargeByShipReq
     */
    public Boolean getMawbProcessForDFOtherChargeByShipReq() {
        return this.mawbProcessForDFOtherChargeByShipReq;
    }

    /**
     * Gets the <code>mAWBStatus</code> property.
     * <p>
     * 
     * @return the current value of <code>mAWBStatus</code> property.
     */
    public MasterAwbStatusType getMAWBStatus() {
        return this.mAWBStatus;
    }

    /**
     * Gets the <code>message</code> property.
     * <p>
     * 
     * @return the current value of the <code>message</code> property.
     */
    public String getMessage() {
        if (this.message != null) {
            this.message = this.message.replace("<br/>", "\r\n");
        }
        return this.message;
    }

    /**
     * Gets the <code>miscellaneousRateQueueInd</code> property.
     * <p>
     * 
     * @return the current value of <code>miscellaneousRateQueueInd</code> property.
     */
    public String getMiscellaneousRateQueueInd() {
        return this.miscellaneousRateQueueInd;
    }

    /**
     * Gets the <code>OId</code> injected by the Inversion of Control (IoC)
     * container.
     * <p>
     * 
     * @return the current value of <code>OId</code> property.
     */
    @Override
    public Long getOId() {

        return this.oId;
    }

    /**
     * @return the openAccountingExportDate
     */
    public Date getOpenAccountingExportDate() {
        return ContractUtility.getClonedDate(this.openAccountingExportDate);
    }

    /**
     * @return the openAccountingImportDate
     */
    public Date getOpenAccountingImportDate() {
        return ContractUtility.getClonedDate(this.openAccountingImportDate);
    }

    /**
     * Gets the <code>originalExchangeRate</code> property.
     * <p>
     * 
     * @return the current value of <code>originalExchangeRate</code> property.
     */
    public BigDecimal getOriginalExchangeRate() {
        return this.originalExchangeRate;
    }

    /**
     * @return the originCashPaidInd
     */
    public String getOriginCashPaidInd() {
        return this.originCashPaidInd;
    }

    /**
     * Gets the <code>OriginCurrency</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @return the current value of <code>OriginCurrency</code> property.
     */
    public String getOriginCurrency() {
        return this.originCurrency;
    }

    /**
     * Gets the <code>OriginIataRegion</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>OriginIataRegion</code> property.
     */
    public String getOriginIataRegion() {
        return this.originIataRegion;
    }

    /**
     * @return the outgoingFSUCounter
     */
    public Integer getOutgoingFSUCounter() {
        return this.outgoingFSUCounter;
    }

    /**
     * Gets the <code>PadAttachmentsExist</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>PadAttachmentsExist</code> property.
     */
    public String getPadAttachmentsExist() {
        return this.padAttachmentsExist;
    }

    /**
     * Gets the <code>PadFwbInfoExists</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>PadFwbInfoExists</code> property.
     */
    public String getPadFwbInfoExists() {
        return this.padFwbInfoExists;
    }

    /**
     * Gets the <code>PadGeneralInfoExists</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>PadGeneralInfoExists</code> property.
     */
    public String getPadGeneralInfoExists() {
        return this.padGeneralInfoExists;
    }

    /**
     * Gets the <code>PadHandlingInfoExists</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>PadHandlingInfoExists</code> property.
     */
    public String getPadHandlingInfoExists() {
        return this.padHandlingInfoExists;
    }

    /**
     * Gets the <code>PadShipmentHandlingExists</code> injected by the Inversion
     * of Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>PadShipmentHandlingExists</code> property.
     */
    public String getPadShipmentHandlingExists() {
        return this.padShipmentHandlingExists;
    }

    /**
     * Gets the <code>PadTracingInfoExists</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>PadTracingInfoExists</code> property.
     */
    public String getPadTracingInfoExists() {
        return this.padTracingInfoExists;
    }

    /**
     * Gets the <code>participantQueueInd</code> property.
     * <p>
     * 
     * @return the current value of <code>participantQueueInd</code> property.
     */
    public String getParticipantQueueInd() {
        return this.participantQueueInd;
    }

    /**
     * Gets the <code>paymentEntryType</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>paymentEntryType</code> property.
     */
    public String getPaymentEntryType() {
        return this.paymentEntryType;
    }

    /**
     * Gets the <code>pickupDetail</code> have shipment pickup status and driver
     * details.
     * 
     * @return the current value of <code>pickupDetail</code> property.
     */
    public PickupAndDeliveryDetailDto getPickupDetail() {
        return this.pickupDetail;
    }

    /**
     * @return the prepaidCashTotal
     */
    public BigDecimal getPrepaidCashTotal() {
        return this.prepaidCashTotal;
    }

    /**
     * Gets the <code>PricingDateInd</code> property.
     * <p>
     * 
     * @return the current value of <code>PricingDateInd</code> property.
     */
    public String getPricingDateInd() {
        return this.PricingDateInd;
    }

    /**
     * Gets the <code>Priority</code> injected by the Inversion of Control (IoC)
     * container.
     * <p>
     * 
     * @return the current value of <code>Priority</code> property.
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Gets the <code>prioritySource</code> property.
     * <p>
     * 
     * @return the current value of <code>prioritySource</code> property.
     */
    public String getPrioritySource() {
        return this.prioritySource;
    }

    /**
     * Gets the <code>prodSDCType</code> property.
     * 
     * @return the current value of the <code>prodSDCType</code> property.
     */
    public ShipmentDataType getProdSDCType() {
        return this.prodSDCType;
    }

    /**
     * Gets the <code>protGameChangerInd</code> property.
     * <p>
     * 
     * @return the current value of <code>protGameChangerInd</code> property.
     */
    public int getProtGameChangerInd() {
        return this.protGameChangerInd;
    }

    /**
     * Gets the <code>purgeDate</code> property.
     * <p>
     * 
     * @return the current value of <code>purgeDate</code> property.
     */
    public Date getPurgeDate() {
        return ContractUtility.getClonedDate(this.purgeDate);
    }

    /**
     * Gets the <code>QualityAssuranceIndicator</code> injected by the Inversion
     * of Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>QualityAssuranceIndicator</code> property.
     */
    public String getQualityAssuranceIndicator() {
        return this.qualityAssuranceIndicator;
    }

    /**
     * Gets the <code>rateLockInd</code> property.
     * 
     * @return the current value of the <code>rateLockInd</code> property.
     */
    public Boolean getRateLockInd() {
        return this.rateLockInd;
    }

    /**
     * Gets the <code>reasonCodes</code> property.
     * <p>
     * 
     * @return the current value of <code>reasonCodes</code> property.
     */
    public List<String> getReasonCodes() {
        return this.reasonCodes;
    }

    /**
     * Gets the <code>SecurityDeclarationDto</code> property.
     * <p>
     * 
     * @return the current value of <code>SecurityDeclarationDto</code> property.
     */

    public SecurityDeclarationDto getSecurityDeclarationDto() {
        return this.securityDeclarationDto;
    }

    /**
     * Gets the <code>ShedCode</code> injected by the Inversion of Control (IoC)
     * container.
     * <p>
     * 
     * @return the current value of <code>ShedCode</code> property.
     */
    public String getShedCode() {
        return this.shedCode;
    }

    /**
     * Gets the <code>shipmentStatusDto</code> property.
     * <p>
     * 
     * @return the current value of <code>shipmentStatusDto</code> property.
     */
    public ShipmentStatusDto getShipmentStatusDto() {
        if (this.shipmentStatusDto == null) {
            this.shipmentStatusDto = new ShipmentStatusDto();
        }
        return this.shipmentStatusDto;
    }

    /**
     * Gets the <code>shipmentVolumeUnit</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>shipmentVolumeUnit</code> property.
     */
    public VolumeUOMType getShipmentVolumeUnit() {
        return this.shipmentVolumeUnit;
    }

    /**
     * Gets the <code>ShipmentWeightUnit</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>ShipmentWeightUnit</code> property.
     */
    public WeightUOMType getShipmentWeightUnit() {
        return this.shipmentWeightUnit;
    }

    /**
     * Gets the <code>shipperCertSign</code> property.
     * <p>
     * 
     * @return the current value of <code>shipperCertSign</code> property.
     */
    public String getShipperCertSign() {
        return this.shipperCertSign;
    }

    /**
     * Gets the <code>sourceType</code> of AWB
     * 
     * @return <code>airWaybillUpdationSourceType</code> if it is not empty.
     *         </p>
     *         <p>
     *         <code>airWaybillCreationSourceType</code> otherwise.
     *         </p>
     */

    /**
     * @return the contractSraApply
     */
    public SpecialPurgeType getSpecialPurge() {
        return this.specialPurge;
    }

    /**
     * @return the statusCodeType
     */
    public FSUStatusType getStatusCodeType() {
        return statusCodeType;
    }

    /**
     * Gets the <code>SurfaceDestinationStation</code> injected by the Inversion
     * of Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>SurfaceDestinationStation</code> property.
     */
    public String getSurfaceDestinationStation() {
        return this.surfaceDestinationStation;
    }

    /**
     * Gets the <code>SurfaceOriginStation</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>SurfaceOriginStation</code> property.
     */
    public String getSurfaceOriginStation() {
        return this.surfaceOriginStation;
    }

    /**
     * @return the teletypeAddress
     */
    public String getTeletypeAddress() {
        return this.teletypeAddress;
    }

    /**
     * Gets the <code>terminalWarehouseDiscQueueInd</code> property.
     * <p>
     * 
     * @return the current value of <code>terminalWarehouseDiscQueueInd</code> property.
     */
    public String getTerminalWarehouseDiscQueueInd() {
        return this.terminalWarehouseDiscQueueInd;
    }

    /**
     * Gets the <code>totalCashColExport</code> property.
     * 
     * @return the current value of the <code>totalCashColExport</code> property.
     */
    public BigDecimal getTotalCashColExport() {
        return this.totalCashColExport;
    }

    /**
     * Gets the <code>totalCashColImport</code> property.
     * 
     * @return the current value of the <code>totalCashColImport</code> property.
     */
    public BigDecimal getTotalCashColImport() {
        return this.totalCashColImport;
    }

    /**
     * Gets the <code>totalCashCollectedExport</code> property.
     * <p>
     * 
     * @return the current value of <code>totalCashCollectedExport</code> property.
     */
    public BigDecimal getTotalCashCollectExport() {
        return this.totalCashCollectExport;
    }

    /**
     * Gets the <code>totalCashCollectedImport</code> property.
     * <p>
     * 
     * @return the current value of <code>totalCashCollectedImport</code> property.
     */
    public BigDecimal getTotalCashCollectImport() {
        return this.totalCashCollectImport;
    }

    /**
     * @return the totalHAWBCashOutstanding
     */
    public BigDecimal getTotalHAWBCashOutstanding() {
        return this.totalHAWBCashOutstanding;
    }

    /**
     * @return the totalHAWBCreditOutstanding
     */
    public BigDecimal getTotalHAWBCreditOutstanding() {
        return this.totalHAWBCreditOutstanding;
    }

    /**
     * Gets the <code>TotalPieces</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @return the current value of <code>TotalPieces</code> property.
     */
    public long getTotalPieces() {
        return this.totalPieces;
    }

    /**
     * Gets the <code>totalReceivedPieces</code> property.
     * 
     * @return the current value of the <code>totalReceivedPieces</code> property.
     */
    public String getTotalReceivedPieces() {
        return this.totalReceivedPieces;
    }

    /**
     * Gets the <code>TotalVolume</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @return the current value of <code>TotalVolume</code> property.
     */
    public BigDecimal getTotalVolume() {
        return this.totalVolume;
    }

    /**
     * Gets the <code>TotalWeight</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @return the current value of <code>TotalWeight</code> property.
     */
    public BigDecimal getTotalWeight() {
        return this.totalWeight;
    }

    /**
     * Gets the <code>TraderNumber</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @return the current value of <code>TraderNumber</code> property.
     */
    public String getTraderNumber() {
        return this.traderNumber;
    }

    /**
     * Gets the <code>transferCarrierFrom</code> property.
     * 
     * @return
     */
    public String getTransferCarrierFrom() {
        return this.transferCarrierFrom;
    }

    /**
     * Gets the <code>transferCarrierTo</code> property.
     * 
     * @return
     */
    public String getTransferCarrierTo() {
        return this.transferCarrierTo;
    }

    /**
     * Gets the <code>TransitCountry</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @return the current value of <code>TransitCountry</code> property.
     */
    public String getTransitCountry() {
        return this.transitCountry;
    }

    /**
     * Gets the <code>TransitDeclarationNumber</code> injected by the Inversion
     * of Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>TransitDeclarationNumber</code> property.
     */
    public String getTransitDeclarationNumber() {
        return this.transitDeclarationNumber;
    }

    /**
     * Gets the <code>unclearedAWBInd</code> property.
     * <p>
     * 
     * @return the current value of <code>unclearedAWBInd</code> property.
     */
    public Boolean getUnclearedAWBInd() {
        return this.unclearedAWBInd;
    }

    /**
     * Gets the <code>unclearedDate</code> property.
     * <p>
     * 
     * @return the current value of <code>unclearedDate</code> property.
     */
    public Date getUnclearedDate() {
        return ContractUtility.getClonedDate(this.unclearedDate);
    }

    /**
     * Gets the <code>unclearedStation</code> property.
     * 
     * @return the current value of the <code>unclearedStation</code> property.
     */
    public List<String> getUnclearedStation() {
        return this.unclearedStation;
    }

    /**
     * Gets the <code>unclearedStationType</code> property.
     * <p>
     * 
     * @return the current value of <code>unclearedStationType</code> property.
     */
    public String getUnclearedStationType() {
        return this.unclearedStationType;
    }

    /**
     * Gets the <code>updationSource</code> property.
     * <p>
     * 
     * @return the current value of <code>updationSource</code> property.
     */
    public String getUpdationSource() {
        return this.updationSource;
    }

    /**
     * Gets the <code>volumeEvaluationMethod</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>volumeEvaluationMethod</code> property.
     */
    public VolumeEvaluationMethod getVolumeEvaluationMethod() {
        return this.volumeEvaluationMethod;
    }

    /**
     * Gets the <code>weightChargeType</code> property.
     * 
     * @return the current value of the <code>weightChargeType</code> property.
     */
    public RateDiscriminatorType getWeightChargeType() {
        return this.weightChargeType;
    }

    /**
     * Gets the <code>AirlineHoldInd</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @return the current value of <code>AirlineHoldInd</code> property.
     */
    public boolean isAirlineHoldInd() {
        return this.airlineHoldInd;
    }

    /**
     * Gets the <code>AwbDeletionInd</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @return the current value of <code>AwbDeletionInd</code> property.
     */
    public boolean isAwbDeletionInd() {
        return this.awbDeletionInd;
    }

    /**
     * @return the aWBNumberGenerationIndicator
     */
    public boolean isAWBNumberGenerationIndicator() {
        return this.aWBNumberGenerationIndicator;
    }

    /**
     * @return the specialPurge
     * @return the awbPrintIndicator
     */
    public boolean isAwbPrintIndicator() {
        return this.awbPrintIndicator;
    }

    /**
     * Gets the <code>awbRetainIndicator</code> property.
     * 
     * @return the current value of the <code>awbRetainIndicator</code> property.
     */
    public boolean isAwbRetainIndicator() {
        return this.awbRetainIndicator;
    }

    /**
     * @return the contractSraApply
     */
    public boolean isContractSraApply() {
        return this.contractSraApply;
    }

    /**
     * Gets the <code>domesticChineseAWBIndicator</code> property.
     * <p>
     * 
     * @return the current value of <code>domesticChineseAWBIndicator</code> property.
     */
    public boolean isDomesticChineseAWBIndicator() {
        return this.domesticChineseAWBIndicator;
    }

    /**
     * Gets the <code>exchangeGenerationInd</code> injected by the Inversion of
     * Control (IoC) container.
     * 
     * @return the exchangeGenerationInd
     */
    public ExchangeRateGenerationType isExchangeGenerationInd() {
        return this.exchangeGenerationInd;
    }

    /**
     * Checks the <code>finalFWBStatus</code> property.
     * 
     * @return the current value of the <code>finalFWBStatus</code> property.
     */
    public boolean isFinalFWBStatus() {
        return this.finalFWBStatus;
    }

    /**
     * Gets the <code>hAWBValidate</code> property.
     * <p>
     * 
     * @return the current value of <code>hAWBValidate</code> property.
     */
    public boolean isHAWBValidate() {
        return this.hAWBValidate;
    }

    /**
     * Gets the <code>insuranceInd</code> injected by the Inversion of Control
     * (IoC) container.
     * 
     * @return the insuranceInd
     */
    public boolean isInsuranceInd() {
        return this.insuranceInd;
    }

    /**
     * Gets the <code>originalPrinted</code> property.
     * <p>
     * 
     * @return the current value of <code>originalPrinted</code> property.
     */
    public boolean isOriginalPrinted() {
        return this.originalPrinted;
    }

    /**
     * Gets the <code>OriginatedAsFwb</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>OriginatedAsFwb</code> property.
     */
    public boolean isOriginatedAsFwb() {
        return this.originatedAsFwb;
    }

    /**
     * Gets the <code>originatedAsXfwb</code>.
     * 
     * 
     * @return the originatedAsXfwb
     */
    public boolean isOriginatedAsXfwb() {
        return this.originatedAsXfwb;
    }

    /**
     * Gets the <code>PaperAWBOverrideInd</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>PaperAWBOverrideInd</code> property.
     */
    public boolean isPaperAWBOverrideInd() {
        return this.paperAWBOverrideInd;
    }

    /**
     * Gets the <code>prodCNLNotAllowed</code> property.
     * 
     * @return the current value of the <code>prodCNLNotAllowed</code> property.
     */
    public boolean isProdCNLNotAllowed() {
        return this.prodCNLNotAllowed;
    }

    /**
     * Gets the <code>prodUPDNotAllowed</code> property.
     * 
     * @return the current value of the <code>prodUPDNotAllowed</code> property.
     */
    public boolean isProdUPDNotAllowed() {
        return this.prodUPDNotAllowed;
    }

    /**
     * Gets the <code>readyForDeliveryInd</code> property.
     * <p>
     * 
     * @return the current value of <code>readyForDeliveryInd</code> property.
     */
    public boolean isReadyForDeliveryInd() {
        return this.readyForDeliveryInd;
    }

    /**
     * @return the securityDataPresent
     */
    public boolean isSecurityDataPresent() {
        return this.securityDataPresent;
    }

    /**
     * @return the sentAsFwb
     */
    public boolean isSentAsFwb() {
        return this.sentAsFwb;
    }

    /**
     * 
     * Sets the <code>UnNumbers</code> injected by the Inversion of Control
     * (IoC) container.
     * 
     * @param accountingDetailDto
     *            the accountingDetailDto to set
     */
    public void setAccountingDetailDto(
                final AccountingDetailDto pAccountingDetailDto) {
        this.accountingDetailDto = pAccountingDetailDto;
    }

    /**
     * Sets the <code>accumulatedCCAamount</code> property.
     * 
     * @param pAccumulatedCCAamount
     *            the current value of the <code>accumulatedCCAamount</code> property.
     */
    public void setAccumulatedCCAamount(final BigDecimal pAccumulatedCCAamount) {
        this.accumulatedCCAamount = pAccumulatedCCAamount;
    }

    /**
     * Sets the <code>actualRateQueueInd</code> property.
     * <p>
     * <b>Format:</b><br>
     * 1- 75 Alphanumeric
     * <p>
     * 
     * @param pActualRateQueueInd
     *            the new value of the <code>actualRateQueueInd</code> property.
     */
    public void setActualRateQueueInd(final String pActualRateQueueInd) {
        this.actualRateQueueInd = pActualRateQueueInd;
    }

    /**
     * Sets the <code>agentCode</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pAgentCode
     *            the new value of <code>agentCode</code> property.
     */
    public void setAgentCode(final String pAgentCode) {
        this.agentCode = pAgentCode;
    }

    /**
     * Sets the <code>agentName</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pAgentName
     *            the new value of <code>agentName</code> property.
     */
    public void setAgentName(final String pAgentName) {
        this.agentName = pAgentName;
    }

    /**
     * Sets the <code>airlineHoldAction</code> property.
     * 
     * @param pAirlineHoldAction
     *            the new value of the <code>airlineHoldAction</code> property.
     */
    public void setAirlineHoldAction(final String pAirlineHoldAction) {
        this.airlineHoldAction = pAirlineHoldAction;
    }

    /**
     * Sets the <code>airlineHoldInd</code> property.
     * 
     * @param pAirlineHoldInd
     *            the new value of the <code>airlineHoldInd</code> property.
     */
    public void setAirlineHoldInd(final boolean pAirlineHoldInd) {
        this.airlineHoldInd = pAirlineHoldInd;
    }

    /**
     * Sets the <code>airlineHoldReason</code> property.
     * 
     * @param pAirlineHoldReason
     *            the new value of the <code>airlineHoldReason</code> property.
     */
    public void setAirlineHoldReason(final String pAirlineHoldReason) {
        this.airlineHoldReason = pAirlineHoldReason;
    }

    /**
     * Sets the <code>airlineHoldStation</code> property.
     * 
     * @param pAirlineHoldStation
     *            the new value of the <code>airlineHoldStation</code> property.
     */
    public void setAirlineHoldStation(final String pAirlineHoldStation) {
        this.airlineHoldStation = pAirlineHoldStation;
    }

    /**
     * Sets the <code>airWaybillCreationChannelType</code> injected by the
     * Inversion of Control (IoC) container.
     * <p>
     * 
     * @param pAirWaybillCreationChannelType
     *            the new value of <code>airWaybillCreationChannelType</code> property.
     */
    public void setAirWaybillCreationChannelType(
                final ChannelType pAirWaybillCreationChannelType) {
        this.airWaybillCreationChannelType = pAirWaybillCreationChannelType;
    }

    /**
     * Sets the <code>airWaybillCreationSourceType</code> property.
     * 
     * @param pAirWaybillCreationSourceType
     *            the new value of the <code>airWaybillCreationSourceType</code> property.
     */

    /**
     * Sets the <code>airwayBillDeliveryZone</code> property.
     * 
     * @param pAirWayBillDeliveryZone
     *            the new value of the <code>airWayBillDeliveryZone</code> property.
     */
    public void setAirWaybillDeliveryZone(final String pAirWayBillDeliveryZone) {
        this.airWaybillDeliveryZone = pAirWayBillDeliveryZone;
    }

    /**
     * Sets the <code>airWaybillUpdationChannelType</code> property.
     * <p>
     * <b>Format:</b><br>
     * Number
     * <p>
     * 
     * @param pAirWaybillUpdationChannelType
     *            the new value of the <code>airWaybillUpdationChannelType</code> property.
     */
    public void setAirWaybillUpdationChannelType(
                final ChannelType pAirWaybillUpdationChannelType) {
        this.airWaybillUpdationChannelType = pAirWaybillUpdationChannelType;
    }

    /**
     * Sets the <code>airWaybillUpdationSourceType</code> property.
     * <p>
     * <b>Format:</b><br>
     * 1-7 Alphanumeric
     * <p>
     * 
     * @param pAirWaybillUpdationSourceType
     *            the new value of the <code>airWaybillUpdationSourceType</code> property.
     */
    public void setAirWaybillUpdationSourceType(
                final AirWaybillSourceType pAirWaybillUpdationSourceType) {
        this.airWaybillUpdationSourceType = pAirWaybillUpdationSourceType;
    }

    /**
     * Sets the <code>awbDeleteIndicator</code> property.
     * <p>
     * <b>Format:</b><br>
     * 1- 75 Alphanumeric
     * <p>
     * 
     * @param pAwbDeleteIndicator
     *            the new value of the <code>awbDeleteIndicator</code> property.
     */
    public void setAwbDeleteIndicator(final String pAwbDeleteIndicator) {
        this.awbDeleteIndicator = pAwbDeleteIndicator;
    }

    /**
     * Sets the <code>awbDeletionInd</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pAwbDeletionInd
     *            the new value of <code>awbDeletionInd</code> property.
     */
    public void setAwbDeletionInd(final boolean pAwbDeletionInd) {
        this.awbDeletionInd = pAwbDeletionInd;
    }

    /**
     * Sets the <code>awbDescription</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pAwbDescription
     *            the new value of <code>awbDescription</code> property.
     */
    public void setAwbDescription(final String pAwbDescription) {
        this.awbDescription = pAwbDescription;
    }

    /**
     * Sets the <code>awbGeneratedDetailDto</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pAwbGeneratedDetailDto
     *            the new value of <code>awbGeneratedDetailDto</code> property.
     */
    public void setAwbGeneratedDetailDto(
                final AWBGeneratedDetailDto pAwbGeneratedDetailDto) {
        this.awbGeneratedDetailDto = pAwbGeneratedDetailDto;
    }

    /**
     * Sets the <code>awbKeyDatesDto</code> property.
     * 
     * @param pAwbKeyDatesDto
     *            the awbKeyDatesDto to set
     */
    public void setAwbKeyDatesDto(final AWBKeyDatesDto pAwbKeyDatesDto) {
        this.awbKeyDatesDto = pAwbKeyDatesDto;
    }

    /**
     * Sets the <code>awbLockedInd</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pAwbLockedInd
     *            the new value of <code>awbLockedInd</code> property.
     */
    public void setAwbLockedInd(final String pAwbLockedInd) {
        this.awbLockedInd = pAwbLockedInd;
    }

    /**
     * Sets the <code>awbLockStation</code> property.
     * 
     * @param pAwbLockStation
     *            the new value of the <code>awbLockStation</code> property.
     */

    public void setAwbLockStation(final String pAwbLockStation) {
        this.awbLockStation = pAwbLockStation;
    }

    /**
     * @param aWBNumberGenerationIndicator
     *            the aWBNumberGenerationIndicator to set
     */
    public void setAWBNumberGenerationIndicator(
                final boolean aWBNumberGenerationIndicator) {
        this.aWBNumberGenerationIndicator = aWBNumberGenerationIndicator;
    }

    /**
     * @param pAwbPrintIndicator
     *            the awbPrintIndicator to set
     */
    public void setAwbPrintIndicator(final boolean pAwbPrintIndicator) {
        this.awbPrintIndicator = pAwbPrintIndicator;
    }

    /**
     * Sets the <code>awbPriority</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pAwbPriority
     *            the new value of <code>awbPriority</code> property.
     */
    public void setAwbPriority(final String pAwbPriority) {
        this.awbPriority = pAwbPriority;
    }

    /**
     * Sets the <code>awbRetainIndicator</code> property.
     * 
     * @param pAwbRetainIndicator
     *            the current value of the <code>awbRetainIndicator</code> property.
     */
    public void setAwbRetainIndicator(final boolean pAwbRetainIndicator) {
        this.awbRetainIndicator = pAwbRetainIndicator;
    }

    /**
     * Sets the <code>awbStatuses</code> property.
     * 
     * @param pAwbStatuses
     *            the pAwbStatuses to set
     */
    public void setAwbStatuses(final List<String> pAwbStatuses) {
        this.awbStatuses = pAwbStatuses;
    }

    /**
     * Sets the <code>bankSellingRate</code> property.
     * 
     * @param pBankSellingRate
     *            the bankSellingRate to set
     */
    public void setBankSellingRate(final BigDecimal pBankSellingRate) {
        this.bankSellingRate = pBankSellingRate;
    }

    /**
     * Sets the <code>brlStatus</code> property.
     * <p>
     * 
     * @param pBrlStatus
     *            the new value of <code>brlStatus</code> property.
     */
    public void setBrlStatus(final int pBrlStatus) {
        this.brlStatus = pBrlStatus;
    }

    /**
     * Sets the <code>businessArea</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pBusinessArea
     *            the new value of <code>businessArea</code> property.
     */
    public void setBusinessArea(final List<String> pBusinessArea) {
        this.businessArea = pBusinessArea;
    }

    /**
     * Sets the <code>businessAreas</code> property.
     * 
     * @param pBusinessAreas
     *            the businessAreas to set
     */
    public void setBusinessAreas(final String pBusinessAreas) {
        this.businessAreas = pBusinessAreas;
    }

    /**
     * Sets the <code>cashDrawerName</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pCashDrawerName
     *            the new value of <code>cashDrawerName</code> property.
     */
    public void setCashDrawerName(final String pCashDrawerName) {
        this.cashDrawerName = pCashDrawerName;
    }

    /**
     * Sets the <code>codAmount</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pCodAmount
     *            the new value of <code>codAmount</code> property.
     */
    public void setCodAmount(final BigDecimal pCodAmount) {
        this.codAmount = pCodAmount;
    }

    /**
     * Sets the <code>codAmountInDestination</code> property.
     * 
     * @param pCodAmountInDestination
     *            the current value of the <code>codAmountInDestination</code> property.
     */
    public void setCodAmountInDestination(final BigDecimal pCodAmountInDestination) {
        this.codAmountInDestination = pCodAmountInDestination;
    }

    /**
     * Sets the <code>codAmountInOrigin</code> property.
     * 
     * @param pCodAmountInOrigin
     *            the current value of the <code>codAmountInOrigin</code> property.
     */
    public void setCodAmountInOrigin(final BigDecimal pCodAmountInOrigin) {
        this.codAmountInOrigin = pCodAmountInOrigin;
    }

    /**
     * @param pCodCashPaymentInd
     *            the codCashPaymentInd to set
     */
    public void setCodCashPaymentInd(final boolean pCodCashPaymentInd) {
        this.codCashPaymentInd = pCodCashPaymentInd;
    }

    /**
     * Sets the <code>codCur</code> injected by the Inversion of Control (IoC)
     * container.
     * <p>
     * 
     * @param pCodCur
     *            the new value of <code>codCur</code> property.
     */
    public void setCodCur(final String pCodCur) {
        this.codCur = ContractUtility.convertToUpperCase(pCodCur);
    }

    /**
     * Sets the <code>codDue</code> property.
     * 
     * @param pCodDue
     *            the current value of the <code>codDue</code> property.
     */
    public void setCodDue(final BigDecimal pCodDue) {
        this.codDue = pCodDue;
    }

    /**
     * Sets the <code>codExchangeRate</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pCodExchangeRate
     *            the new value of <code>codExchangeRate</code> property.
     */
    public void setCodExchangeRate(final BigDecimal pCodExchangeRate) {
        this.codExchangeRate = pCodExchangeRate;
    }

    /**
     * @param pCollectCashTotal
     *            the collectCashTotal to set
     */
    public void setCollectCashTotal(final BigDecimal pCollectCashTotal) {
        this.collectCashTotal = pCollectCashTotal;
    }

    /**
     * Sets the <code>collectChargesRestrictionInd</code> property.
     * 
     * @param pCollectChargesRestrictionInd
     *            the new value of the <code>collectChargesRestrictionInd</code> property.
     */
    public void setCollectChargesRestrictionInd(
                final String pCollectChargesRestrictionInd) {
        this.collectChargesRestrictionInd = pCollectChargesRestrictionInd;
    }

    /**
     * Sets the <code>commercialControlOnBookingInd</code> property.
     * 
     * @param pCommercialControlOnBookingInd
     *            the new value of the <code>commercialControlOnBookingInd</code> property.
     */
    public void setCommercialControlOnBookingInd(final CommercialControlType pCommercialControlOnBookingInd) {
        this.commercialControlOnBookingInd = pCommercialControlOnBookingInd;
    }

    /**
     * @param pContractSraApply
     *            the contractSraApply to set
     */
    public void setContractSraApply(final boolean pContractSraApply) {
        this.contractSraApply = pContractSraApply;
    }

    /**
     * Sets the <code>createUpdateSource</code> property.
     * 
     * @param pCreateUpdateSource
     *            the new value of the <code>createUpdateSource</code> property.
     */

    /**
     * Sets the <code>creationSource</code> property.
     * 
     * @param pCreationSource
     *            the new value of the <code>creationSource</code> property.
     */
    public void setCreationSource(final String pCreationSource) {
        this.creationSource = pCreationSource;
    }

    /**
     * Sets the <code>crossReference1</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pCrossReference1
     *            the new value of <code>crossReference1</code> property.
     */
    public void setCrossReference1(final String pCrossReference1) {
        this.crossReference1 = pCrossReference1;
    }

    /**
     * Sets the <code>crossReference2</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pCrossReference2
     *            the new value of <code>crossReference2</code> property.
     */
    public void setCrossReference2(final String pCrossReference2) {
        this.crossReference2 = pCrossReference2;
    }

    /**
     * Sets the <code>crossReferenceIndicator1</code> injected by the Inversion
     * of Control (IoC) container.
     * <p>
     * 
     * @param pCrossReferenceIndicator1
     *            the new value of <code>crossReferenceIndicator1</code> property.
     */
    public void setCrossReferenceIndicator1(
                final String pCrossReferenceIndicator1) {
        this.crossReferenceIndicator1 = ContractUtility
                    .convertToUpperCase(pCrossReferenceIndicator1);
    }

    /**
     * Sets the <code>crossReferenceIndicator2</code> injected by the Inversion
     * of Control (IoC) container.
     * <p>
     * 
     * @param pCrossReferenceIndicator2
     *            the new value of <code>crossReferenceIndicator2</code> property.
     */
    public void setCrossReferenceIndicator2(
                final String pCrossReferenceIndicator2) {
        this.crossReferenceIndicator2 = ContractUtility
                    .convertToUpperCase(pCrossReferenceIndicator2);
    }

    /**
     * Sets the <code>cruQueueInd</code> property.
     * <p>
     * <b>Format:</b><br>
     * 1- 75 Alphanumeric
     * <p>
     * 
     * @param pCRUQueueInd
     *            the new value of the <code>cruQueueInd</code> property.
     */
    public void setCruQueueInd(final String pCRUQueueInd) {
        this.cruQueueInd = pCRUQueueInd;
    }

    /**
     * Sets the <code>currentOriginalInd</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pCurrentOriginalInd
     *            the new value of <code>currentOriginalInd</code> property.
     */
    public void setCurrentOriginalInd(
                final AirWayBillCurrentOriginal pCurrentOriginalInd) {
        this.currentOriginalInd = pCurrentOriginalInd;
    }

    /**
     * Sets the <code>customerSegmentation</code> property.
     * 
     * @param pCustomerSegmentation
     *            the current value of the <code>customerSegmentation</code> property.
     */
    public void setCustomerSegmentation(final String pCustomerSegmentation) {
        this.customerSegmentation = pCustomerSegmentation;
    }

    /**
     * @param pCustomsStationChangeAllowedIndicator
     *            the customsStationChangeAllowedIndicator to set
     */
    public void setCustomsStationChangeAllowedIndicator(
                final Boolean pCustomsStationChangeAllowedIndicator) {
        this.customsStationChangeAllowedIndicator = pCustomsStationChangeAllowedIndicator;
    }

    /**
     * Sets the <code>customsValue</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pCustomsValue
     *            the new value of <code>customsValue</code> property.
     */
    public void setCustomsValue(final String pCustomsValue) {
        this.customsValue = ContractUtility.convertToUpperCase(pCustomsValue);
    }

    /**
     * Sets the <code>declarantEoriCountry</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pDeclarantEoriCountry
     *            the new value of <code>declarantEoriCountry</code> property.
     */
    public void setDeclarantEoriCountry(final String pDeclarantEoriCountry) {
        this.declarantEoriCountry = ContractUtility
                    .convertToUpperCase(pDeclarantEoriCountry);
    }

    /**
     * Sets the <code>declarantEoriNumber</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pDeclarantEoriNumber
     *            the new value of <code>declarantEoriNumber</code> property.
     */
    public void setDeclarantEoriNumber(final String pDeclarantEoriNumber) {
        this.declarantEoriNumber = pDeclarantEoriNumber;
    }

    /**
     * Sets the <code>declaredValue</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pDeclaredValue
     *            the new value of <code>declaredValue</code> property.
     */
    public void setDeclaredValue(final String pDeclaredValue) {
        this.declaredValue = ContractUtility.convertToUpperCase(pDeclaredValue);
    }

    /**
     * Sets the <code>deletionStation</code>
     * <p>
     * 
     * @param pDeletionOffice
     *            the new value of <code>deletionOffice</code> property.
     */
    public void setDeletionOffice(final String pDeletionOffice) {
        this.deletionOffice = pDeletionOffice;
    }

    /**
     * Sets the <code>deletionRemarks</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pDeletionRemarks
     *            the new value of <code>deletionRemarks</code> property.
     */
    public void setDeletionRemarks(final String pDeletionRemarks) {
        this.deletionRemarks = pDeletionRemarks;
    }

    /**
     * Sets the <code>deletionStation</code>
     * <p>
     * 
     * @param pDeletionStation
     *            the new value of <code>deletionStation</code> property.
     */
    public void setDeletionStation(final String pDeletionStation) {
        this.deletionStation = pDeletionStation;
    }

    /**
     * Sets the <code>deletionUser</code>
     * <p>
     * 
     * @param pDeletionUser
     *            the new value of <code>deletionUser</code> property.
     */
    public void setDeletionUser(final String pDeletionUser) {
        this.deletionUser = pDeletionUser;
    }

    /**
     * Sets the <code>deliveryDetail</code> have shipment pickup status and
     * driver details.
     * 
     * @param pDeliveryDetail
     *            the new value of <code>deliveryDetail</code> property.
     */
    public void setDeliveryDetail(
                final PickupAndDeliveryDetailDto pDeliveryDetail) {
        this.deliveryDetail = pDeliveryDetail;
    }

    /**
     * Sets the <code>destCustomsStation</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pDestCustomsStation
     *            the new value of <code>destCustomsStation</code> property.
     */
    public void setDestCustomsStation(final String pDestCustomsStation) {
        this.destCustomsStation = ContractUtility
                    .convertToUpperCase(pDestCustomsStation);
    }

    /**
     * @param pDestinationCashPaidInd
     *            the destinationCashPaidInd to set
     */
    public void setDestinationCashPaidInd(final String pDestinationCashPaidInd) {
        this.destinationCashPaidInd = pDestinationCashPaidInd;
    }

    /**
     * Sets the <code>destinationCurrency</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pDestinationCurrency
     *            the new value of <code>destinationCurrency</code> property.
     */
    public void setDestinationCurrency(final String pDestinationCurrency) {
        this.destinationCurrency = ContractUtility
                    .convertToUpperCase(pDestinationCurrency);
    }

    /**
     * Sets the <code>dimensionalVolume</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pDimensionalVolume
     *            the new value of <code>dimensionalVolume</code> property.
     */
    public void setDimensionalVolume(final BigDecimal pDimensionalVolume) {
        this.dimensionalVolume = pDimensionalVolume;
    }

    /**
     * Sets the <code>dimensionalVolumeUnit</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pDimensionalVolumeUnit
     *            the new value of <code>dimensionalVolumeUnit</code> property.
     */
    public void setDimensionalVolumeUnit(
                final VolumeUOMType pDimensionalVolumeUnit) {
        this.dimensionalVolumeUnit = pDimensionalVolumeUnit;
    }

    /**
     * Sets the <code>dimensionalWeightOfShipment</code> injected by the
     * Inversion of Control (IoC) container.
     * <p>
     * 
     * @param pDimensionalWeightOfShipment
     *            the new value of <code>dimensionalWeightOfShipment</code> property.
     */
    public void setDimensionalWeightOfShipment(
                final BigDecimal pDimensionalWeightOfShipment) {
        this.dimensionalWeightOfShipment = pDimensionalWeightOfShipment;
    }

    /**
     * Sets the <code>discrepancyExists</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pDiscrepancyExists
     *            the new value of <code>discrepancyExists</code> property.
     */
    public void setDiscrepancyExists(final String pDiscrepancyExists) {
        this.discrepancyExists = pDiscrepancyExists;
    }

    /**
     * Sets the <code>documentReceivedInd</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pDocumentReceivedInd
     *            the new value of <code>documentReceivedInd</code> property.
     */
    public void setDocumentReceivedInd(final boolean pDocumentReceivedInd) {
        this.documentReceivedInd = pDocumentReceivedInd;
    }

    /**
     * Sets the <code>domesticChineseAWBIndicator</code> injected by the
     * Inversion of Control (IoC) container.
     * <p>
     * 
     * @param pDomesticChineseAWBIndicator
     *            the new value of <code>domesticChineseAWBIndicator</code> property.
     */
    public void setDomesticChineseAWBIndicator(
                final boolean pDomesticChineseAWBIndicator) {
        this.domesticChineseAWBIndicator = pDomesticChineseAWBIndicator;
    }

    /**
     * Sets the <code>dueAmount</code> property.
     * <p>
     * 
     * @param pDueAmount
     *            holds the new value of <code>dueAmount</code>.<br>
     */
    public void setDueAmount(final BigDecimal pDueAmount) {
        this.dueAmount = pDueAmount;
    }

    /**
     * Sets the <code>eawbInd</code> injected by the Inversion of Control (IoC)
     * container.
     * <p>
     * 
     * @param pEAwbInd
     *            the new value of <code>eawbInd</code> property.
     */
    public void seteAwbInd(final boolean pEAwbInd) {
        this.eAwbInd = pEAwbInd;
    }

    /**
     * @param pEqaStation
     *            the eqaStation to set
     */
    public void setEqaStation(final String pEqaStation) {
        this.eqaStation = pEqaStation;
    }

    /**
     * Sets the <code>europeanCustomsOriginDetail</code> injected by the
     * Inversion of Control (IoC) container.
     * <p>
     * 
     * @param pEuropeanCustomsOriginDetail
     *            the new value of <code>europeanCustomsOriginDetail</code> property.
     */
    public void setEuropeanCustomsOriginDetail(
                final String pEuropeanCustomsOriginDetail) {
        this.europeanCustomsOriginDetail = ContractUtility
                    .convertToUpperCase(pEuropeanCustomsOriginDetail);
    }

    /**
     * Sets the <code>exchangeGenerationInd</code> injected by the Inversion of
     * Control (IoC) container.
     * 
     * 
     * @param pExchangeGenerationInd
     *            the exchangeGenerationInd to set
     */
    public void setExchangeGenerationInd(
                final ExchangeRateGenerationType pExchangeGenerationInd) {
        this.exchangeGenerationInd = pExchangeGenerationInd;
    }

    /**
     * Sets the <code>ExchangeRate</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pExchangeRate
     *            the new value of <code>ExchangeRate</code> property.
     */
    public void setExchangeRate(final BigDecimal pExchangeRate) {
        this.exchangeRate = pExchangeRate;
    }

    /**
     * Sets the <code>insuranceInd</code> property.
     * 
     * @param pExpImpQualityAssuranceInd
     *            the expImpQualityAssuranceInd to set
     */
    public void setExpImpQualityAssuranceInd(
                final String pExpImpQualityAssuranceInd) {
        this.expImpQualityAssuranceInd = pExpImpQualityAssuranceInd;
    }

    /**
     * Sets the <code>exportAuditOpenDate</code> property.
     * 
     * @param pExportAuditOpenDate
     *            the new value of the <code>exportAuditOpenDate</code> property.
     */
    public void setExportAuditOpenDate(final Date pExportAuditOpenDate) {
        this.exportAuditOpenDate = ContractUtility
                    .getClonedDate(pExportAuditOpenDate);
    }

    /**
     * Sets the <code>exportAuditOpenLocalDate</code> property.
     * 
     * @param exportAuditOpenLocalDate
     */
    public void setExportAuditOpenLocalDate(Date exportAuditOpenLocalDate) {
        this.exportAuditOpenLocalDate = exportAuditOpenLocalDate;
    }

    /**
     * Sets the <code>exportAuditReleaseDate</code> property.
     * 
     * @param pExportAuditReleaseDate
     *            the new value of the <code>exportAuditReleaseDate</code> property.
     */
    public void setExportAuditReleaseDate(final Date pExportAuditReleaseDate) {
        this.exportAuditReleaseDate = ContractUtility
                    .getClonedDate(pExportAuditReleaseDate);
    }

    /**
     * Sets the <code>ExportAuditStatus</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pExportAuditStatus
     *            the new value of <code>ExportAuditStatus</code> property.
     */
    public void setExportAuditStatus(final AuditStatusType pExportAuditStatus) {
        this.exportAuditStatus = pExportAuditStatus;
    }

    /**
     * Sets the <code>ExportDeclarationNumber</code> injected by the Inversion
     * of Control (IoC) container.
     * <p>
     * 
     * @param pExportDeclarationNumber
     *            the new value of <code>ExportDeclarationNumber</code> property.
     */
    public void setExportDeclarationNumber(final String pExportDeclarationNumber) {
        this.exportDeclarationNumber = ContractUtility.convertToUpperCase(pExportDeclarationNumber);
    }

    /**
     * Sets the <code>exportDueAmount</code> property.
     * 
     * @param pExportDueAmount
     *            the current value of the <code>exportDueAmount</code> property.
     */
    public void setExportDueAmount(final BigDecimal pExportDueAmount) {
        this.exportDueAmount = pExportDueAmount;
    }

    /**
     * Sets the <code>ExportPaycode</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pExportPaycode
     *            the new value of <code>ExportPaycode</code> property.
     */
    public void setExportPaycode(final AWBPaycodeType pExportPaycode) {
        this.exportPaycode = pExportPaycode;
    }

    /**
     * Sets the <code>exportPaycodeOverriddenFlag</code> property.
     * 
     * @param pExportPaycodeOverriddenFlag
     *            the current value of the <code>exportPaycodeOverriddenFlag</code> property.
     */
    public void setExportPaycodeOverriddenFlag(final Boolean pExportPaycodeOverriddenFlag) {
        this.exportPaycodeOverriddenFlag = pExportPaycodeOverriddenFlag;
    }

    /**
     * Sets the <code>exportReportingStation</code> property.
     * 
     * @param pExportReportingStation
     *            the new value of the <code>exportReportingStation</code> property.
     */
    @Deprecated
    public void setExportReportingStation(final String pExportReportingStation) {
        this.exportReportingStation = pExportReportingStation;
    }

    /**
     * Sets the <code>finalDispositionStatus</code> property.
     * 
     * @param pFinalDispositionStatus
     *            the current value of the <code>finalDispositionStatus</code> property.
     */
    public void setFinalDispositionStatus(final String pFinalDispositionStatus) {
        this.finalDispositionStatus = pFinalDispositionStatus;
    }

    /**
     * Sets the <code>finalFWBStatus</code> property.
     * 
     * @param pFinalFWBStatus
     *            the current value of the <code>finalFWBStatus</code> property.
     */
    public void setFinalFWBStatus(final boolean pFinalFWBStatus) {
        this.finalFWBStatus = pFinalFWBStatus;
    }

    /**
     * Sets the <code>forceToAccAcceptGoods</code> property.
     * 
     * @param pForceToAccAcceptGoods
     *            the current value of the <code>forceToAccAcceptGoods</code> property.
     */
    public void setForceToAccAcceptGoods(final String pForceToAccAcceptGoods) {
        this.forceToAccAcceptGoods = pForceToAccAcceptGoods;
    }

    /**
     * Sets the <code>forceToAccMovementDate</code> property.
     * 
     * @param pForceToAccMovementDate
     *            the current value of the <code>forceToAccMovementDate</code> property.
     */
    public void setForceToAccMovementDate(final Date pForceToAccMovementDate) {
        this.forceToAccMovementDate = ContractUtility.getClonedDate(pForceToAccMovementDate);
    }

    /**
     * Sets the <code>forceToAccMovementStation</code> property.
     * 
     * @param pForceToAccMovementStation
     *            the current value of the <code>forceToAccMovementStation</code> property.
     */
    public void setForceToAccMovementStation(
                final String pForceToAccMovementStation) {
        this.forceToAccMovementStation = pForceToAccMovementStation;
    }

    /**
     * Sets the <code>fsuDlvPieces</code> property.
     * 
     * @param pFsuDlvPieces
     *            the current value of the <code>fsuDlvPieces</code> property.
     */
    public void setFsuDlvPieces(final Integer pFsuDlvPieces) {
        this.fsuDlvPieces = pFsuDlvPieces;
    }

    /**
     * Sets the <code>fsuDlvPiecesTracked</code> property.
     * 
     * @param pFsuDlvPiecesTracked
     *            the current value of the <code>fsuDlvPiecesTracked</code> property.
     */
    public void setFsuDlvPiecesTracked(final Boolean pFsuDlvPiecesTracked) {
        this.fsuDlvPiecesTracked = pFsuDlvPiecesTracked;
    }

    /**
     * Sets the <code>fsuRcfPieces</code> property.
     * 
     * @param pFsuRcfPieces
     *            the current value of the <code>fsuRcfPieces</code> property.
     */
    public void setFsuRcfPieces(final Integer pFsuRcfPieces) {
        this.fsuRcfPieces = pFsuRcfPieces;
    }

    public void setFsuRcsPieces(final Integer pFsuRcsPieces) {
        FsuRcsPieces = pFsuRcsPieces;
    }

    /**
     * @param pFsuRctPieces
     *            the fSURctPieces to set
     */
    public void setFsuRctPieces(final Integer pFsuRctPieces) {
        this.fsuRctPieces = pFsuRctPieces;
    }

    /**
     * Sets the <code>fwbInputMsgInd</code> property.
     * 
     * @param pFwbInputMsgInd
     *            the current value of the <code>fwbInputMsgInd</code> property.
     */
    public void setFwbInputMsgInd(final String pFwbInputMsgInd) {
        this.fwbInputMsgInd = pFwbInputMsgInd;
    }

    /**
     * Sets the <code>fwbMessageInd</code> property.
     * <p>
     * <b>Format:</b><br>
     * 1- 75 Alphanumeric
     * <p>
     * 
     * @param pFwbMessageInd
     *            the new value of the <code>fwbMessageInd</code> property.
     */
    public void setFwbMessageInd(final AirWaybillFWBStatus pFwbMessageInd) {
        this.fwbMessageInd = pFwbMessageInd;
    }

    /**
     * @param pFwbRejectionRemarks
     *            the fwbRejectionRemarks to set
     */
    public void setFwbRejectionRemarks(final String pFwbRejectionRemarks) {
        this.fwbRejectionRemarks = pFwbRejectionRemarks;
    }

    /**
     * Sets the <code>gameChangerInd</code> property.
     * <p>
     * 
     * @param pGameChangerInd
     *            the new value of <code>gameChangerInd</code> property.
     */
    public void setGameChangerInd(final int pGameChangerInd) {
        this.gameChangerInd = pGameChangerInd;
    }

    /**
     * Sets the <code>gblStatus</code> property.
     * <p>
     * 
     * @param pGblStatus
     *            the new value of <code>gblStatus</code> property.
     */
    public void setGblStatus(final int pGblStatus) {
        this.gblStatus = pGblStatus;
    }

    /**
     * Sets the <code>GovernmentTaxIndicator</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pGovernmentTaxIndicator
     *            the new value of <code>GovernmentTaxIndicator</code> property.
     */
    public void setGovernmentTaxIndicator(final String pGovernmentTaxIndicator) {
        this.governmentTaxIndicator = pGovernmentTaxIndicator;
    }

    /**
     * Sets the <code>hAWBValidate</code> property.
     * <p>
     * 
     * @param pHAWBValidate
     *            holds the new value of <code>hAWBValidate</code>.<br>
     */
    public void setHAWBValidate(final boolean pHAWBValidate) {
        this.hAWBValidate = pHAWBValidate;
    }

    /**
     * Sets the <code>houseShipmentDiscQueueInd</code> property.
     * <p>
     * <b>Format:</b><br>
     * 1- 75 Alphanumeric
     * <p>
     * 
     * @param pHouseShipmentDiscQueueInd
     *            the new value of the <code>houseShipmentDiscQueueInd</code> property.
     */
    public void setHouseShipmentDiscQueueInd(final String pHouseShipmentDiscQueueInd) {
        this.houseShipmentDiscQueueInd = pHouseShipmentDiscQueueInd;
    }

    /**
     * Sets the <code>importAuditOpenDate</code> property.
     * 
     * @param pImportAuditOpenDate
     *            the new value of the <code>importAuditOpenDate</code> property.
     */
    public void setImportAuditOpenDate(final Date pImportAuditOpenDate) {
        this.importAuditOpenDate = ContractUtility
                    .getClonedDate(pImportAuditOpenDate);
    }

    /**
     * Sets the <code>importAuditOpenLocalDate</code> property.
     * 
     * @param importAuditOpenLocalDate
     */
    public void setImportAuditOpenLocalDate(Date importAuditOpenLocalDate) {
        this.importAuditOpenLocalDate = importAuditOpenLocalDate;
    }

    /**
     * Sets the <code>importAuditReleaseDate</code> property.
     * 
     * @param pImportAuditReleaseDate
     *            the new value of the <code>importAuditReleaseDate</code> property.
     */
    public void setImportAuditReleaseDate(final Date pImportAuditReleaseDate) {
        this.importAuditReleaseDate = ContractUtility
                    .getClonedDate(pImportAuditReleaseDate);
    }

    /**
     * Sets the <code>ImportAuditStatus</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pImportAuditStatus
     *            the new value of <code>ImportAuditStatus</code> property.
     */
    public void setImportAuditStatus(final AuditStatusType pImportAuditStatus) {
        this.importAuditStatus = pImportAuditStatus;
    }

    /**
     * Sets the <code>ImportClearanceNumber</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pImportClearanceNumber
     *            the new value of <code>ImportClearanceNumber</code> property.
     */
    public void setImportClearanceNumber(final String pImportClearanceNumber) {
        this.importClearanceNumber = ContractUtility.convertToUpperCase(pImportClearanceNumber);
    }

    public void setImportCleared(final Integer pImportCleared) {
        this.importCleared = pImportCleared;
    }

    /**
     * Sets the <code>ImportCustomsStatus</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pImportCustomsStatus
     *            the new value of <code>ImportCustomsStatus</code> property.
     */
    public void setImportCustomsStatus(final String pImportCustomsStatus) {
        this.importCustomsStatus = pImportCustomsStatus;
    }

    /**
     * Sets the <code>importDueAmount</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pImportDueAmount
     *            the new value of <code>importDueAmount</code> property.
     */
    public void setImportDueAmount(final BigDecimal pImportDueAmount) {
        this.importDueAmount = pImportDueAmount;
    }

    /**
     * Sets the <code>ImportPaycode</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pImportPaycode
     *            the new value of <code>ImportPaycode</code> property.
     */
    public void setImportPaycode(final AWBPaycodeType pImportPaycode) {
        this.importPaycode = pImportPaycode;
    }

    /**
     * Sets the <code>importPaycodeOverriddenFlag</code> property.
     * 
     * @param pImportPaycodeOverriddenFlag
     *            the current value of the <code>importPaycodeOverriddenFlag</code> property.
     */
    public void setImportPaycodeOverriddenFlag(final Boolean pImportPaycodeOverriddenFlag) {
        this.importPaycodeOverriddenFlag = pImportPaycodeOverriddenFlag;
    }

    /**
     * Sets the <code>importReportingStation</code> property.
     * 
     * @param pImportReportingStation
     *            the new value of the <code>importReportingStation</code> property.
     */
    @Deprecated
    public void setImportReportingStation(final String pImportReportingStation) {
        this.importReportingStation = pImportReportingStation;
    }

    /**
     * Sets the <code>ImportReportingStationPieces</code> injected by the
     * Inversion of Control (IoC) container.
     * <p>
     * 
     * @param pImportReportingStationPieces
     *            the new value of <code>ImportReportingStationPieces</code> property.
     */
    public void setImportReportingStationPieces(
                final int pImportReportingStationPieces) {
        this.importReportingStationPieces = pImportReportingStationPieces;
    }

    /**
     * Sets the <code>InBondIndicator</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pInBondIndicator
     *            the new value of <code>InBondIndicator</code> property.
     */
    public void setInBondIndicator(final String pInBondIndicator) {
        this.inBondIndicator = pInBondIndicator;
    }

    /**
     * Sets the <code>incompleteSDCTWInd</code> property.
     * 
     * @param pIncompleteSDCTWInd
     *            the new value of the <code>incompleteSDCTWInd</code> property.
     */
    public void setIncompleteSDCTWInd(final Boolean pIncompleteSDCTWInd) {
        this.incompleteSDCTWInd = pIncompleteSDCTWInd;
    }

    /**
     * Sets the <code>InsuranceCode</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pInsuranceCode
     *            the new value of <code>InsuranceCode</code> property.
     */
    public void setInsuranceCode(final String pInsuranceCode) {
        this.insuranceCode = ContractUtility.convertToUpperCase(pInsuranceCode);
    }

    /**
     * Sets the <code>insuranceInd</code> injected by the Inversion of Control
     * (IoC) container.
     * 
     * @param pInsuranceInd
     *            the insuranceInd to set
     */
    public void setInsuranceInd(final boolean pInsuranceInd) {
        this.insuranceInd = pInsuranceInd;
    }

    /**
     * Sets the <code>InsuranceValue</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pInsuranceValue
     *            the new value of <code>InsuranceValue</code> property.
     */
    public void setInsuranceValue(final String pInsuranceValue) {
        this.insuranceValue = ContractUtility
                    .convertToUpperCase(pInsuranceValue);
    }

    /**
     * Sets the <code>InternationalAWBType</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pInternationalAWBType
     *            the new value of <code>InternationalAWBType</code> property.
     */
    public void setInternationalAWBType(
                final InternationalAWBType pInternationalAWBType) {
        this.internationalAWBType = pInternationalAWBType;
    }

    /**
     * Sets the <code>InternationalType</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pInternationalType
     *            the new value of <code>InternationalType</code> property.
     */
    public void setInternationalType(final String pInternationalType) {
        this.internationalType = pInternationalType;
    }

    /**
     * Sets the <code>iqaCompletedInd</code> injected by the Inversion of
     * Control (IoC) container.
     * 
     * @param pIqaCompletedInd
     *            the iqaCompletedInd to set
     */
    public void setIqaCompletedInd(final String pIqaCompletedInd) {
        this.iqaCompletedInd = pIqaCompletedInd;
    }

    /**
     * Sets the <code>lastAPIOGroupNumber</code> injected by the Inversion of
     * Control (IoC) container.
     * 
     * @param pLastAPIOGroupNumber
     *            the lastAPIOGroupNumber to set
     */
    public void setLastAPIOGroupNumber(final Long pLastAPIOGroupNumber) {
        this.lastAPIOGroupNumber = pLastAPIOGroupNumber;
    }

    /**
     * Sets the <code>lastOverpackGroupNumber</code> injected by the Inversion of
     * Control (IoC) container.
     * 
     * @param pLastOverpackGroupNumber
     *            the lastOverpackGroupNumber to set
     */
    public void setLastOverpackGroupNumber(final Long pLastOverpackGroupNumber) {
        this.lastOverpackGroupNumber = pLastOverpackGroupNumber;
    }

    /**
     * Sets the <code>manualAuditQueueInd</code> property.
     * <p>
     * <b>Format:</b><br>
     * 1- 75 Alphanumeric
     * <p>
     * 
     * @param pManualAuditQueueInd
     *            the new value of the <code>manualAuditQueueInd</code> property.
     */
    public void setManualAuditQueueInd(final String pManualAuditQueueInd) {
        this.manualAuditQueueInd = pManualAuditQueueInd;
    }

    /**
     * Sets the <code>manuallyAuditedInd</code> injected by the Inversion of
     * Control (IoC) container.
     * 
     * @param pManuallyAuditedInd
     *            the manuallyAuditedInd to set
     */
    public void setManuallyAuditedInd(final boolean pManuallyAuditedInd) {
        this.manuallyAuditedInd = pManuallyAuditedInd;
    }

    /**
     * Sets the <code>manualRateQueueInd</code> property.
     * <p>
     * <b>Format:</b><br>
     * 1- 75 Alphanumeric
     * <p>
     * 
     * @param pManualRateQueueInd
     *            the new value of the <code>manualRateQueueInd</code> property.
     */
    public void setManualRateQueueInd(final String pManualRateQueueInd) {
        this.manualRateQueueInd = pManualRateQueueInd;
    }

    /**
     * Sets the <code>manualTariffRatingQueueInd</code> property.
     * 
     * @param pManualTariffRatingQueueInd
     *            the current value of the <code>manualTariffRatingQueueInd</code> property.
     */
    public void setManualTariffRatingQueueInd(final String pManualTariffRatingQueueInd) {
        this.manualTariffRatingQueueInd = pManualTariffRatingQueueInd;
    }

    /**
     * Sets the <code>markedForSpecialPurge</code> property.
     * 
     * @param pMarkedForSpecialPurge
     *            the new value of the <code>markedForSpecialPurge</code> property.
     */
    public void setMarkedForSpecialPurge(final String pMarkedForSpecialPurge) {
        this.markedForSpecialPurge = pMarkedForSpecialPurge;
    }

    /**
     * @param pMawbProcessForCCCGOtherCharge the mawbProcessForCCCGOtherCharge to set
     */
    public void setMawbProcessForCCCGOtherCharge(
                final Boolean pMawbProcessForCCCGOtherCharge) {
        this.mawbProcessForCCCGOtherCharge = pMawbProcessForCCCGOtherCharge;
    }

    /**
     * @param pMawbProcessForDFOtherChargeByShipReq
     *            the mawbProcessForDFOtherChargeByShipReq to set
     */
    public void setMawbProcessForDFOtherChargeByShipReq(
                final Boolean pMawbProcessForDFOtherChargeByShipReq) {
        this.mawbProcessForDFOtherChargeByShipReq = pMawbProcessForDFOtherChargeByShipReq;
    }

    /**
     * Sets the <code>mAWBStatus</code> property.
     * 
     * @param pMAWBStatus
     *            the new value of the <code>mAWBStatus</code> property.
     */
    public void setMAWBStatus(final MasterAwbStatusType pMAWBStatus) {
        this.mAWBStatus = pMAWBStatus;
    }

    /**
     * Sets the <code>message</code> property.
     * <p>
     * 
     * @param pMessage
     *            the current value of the <code>message</code> property.
     */
    public void setMessage(final String pMessage) {
        this.message = pMessage;
    }

    /**
     * Sets the <code>miscellaneousRateQueueInd</code> property.
     * <p>
     * <b>Format:</b><br>
     * 1- 75 Alphanumeric
     * <p>
     * 
     * @param pMiscellaneousRateQueueInd
     *            the new value of the <code>miscellaneousRateQueueInd</code> property.
     */
    public void setMiscellaneousRateQueueInd(final String pMiscellaneousRateQueueInd) {
        this.miscellaneousRateQueueInd = pMiscellaneousRateQueueInd;
    }

    /**
     * Sets the <code>OId</code> injected by the Inversion of Control (IoC)
     * container.
     * <p>
     * 
     * @param pOId
     *            the new value of <code>OId</code> property.
     */
    public void setOId(final Long pOId) {

        this.oId = pOId;
    }

    /**
     * @param pOpenAccountingExportDate
     *            the openAccountingExportDate to set
     */
    public void setOpenAccountingExportDate(final Date pOpenAccountingExportDate) {
        this.openAccountingExportDate = ContractUtility.getClonedDate(pOpenAccountingExportDate);
    }

    /**
     * @param pOpenAccountingImportDate
     *            the openAccountingImportDate to set
     */
    public void setOpenAccountingImportDate(final Date pOpenAccountingImportDate) {
        this.openAccountingImportDate = ContractUtility.getClonedDate(pOpenAccountingImportDate);
    }

    /**
     * Sets the <code>originalExchangeRate</code> property.
     * 
     * @param pOriginalExchangeRate
     *            the new value of the <code>originalExchangeRate</code> property.
     */
    public void setOriginalExchangeRate(final BigDecimal pOriginalExchangeRate) {
        this.originalExchangeRate = pOriginalExchangeRate;
    }

    /**
     * Sets the <code>originalPrinted</code> property.
     * 
     * 
     * @param pOriginalPrinted
     *            the originalPrinted to set.
     */
    public void setOriginalPrinted(final boolean pOriginalPrinted) {
        this.originalPrinted = pOriginalPrinted;
    }

    /**
     * Sets the <code>OriginatedAsFwb</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pOriginatedAsFwb
     *            the new value of <code>OriginatedAsFwb</code> property.
     */
    public void setOriginatedAsFwb(final boolean pOriginatedAsFwb) {
        this.originatedAsFwb = pOriginatedAsFwb;
    }

    /**
     * Sets the <code>originatedAsXfwb</code> .
     * 
     * @param pOriginatedAsXfwb
     *            the new value of <code>originatedAsXfwb</code> property.
     */
    public void setOriginatedAsXfwb(final boolean pOriginatedAsXfwb) {
        this.originatedAsXfwb = pOriginatedAsXfwb;
    }

    /**
     * @param pOriginCashPaidInd
     *            the originCashPaidInd to set
     */
    public void setOriginCashPaidInd(final String pOriginCashPaidInd) {
        this.originCashPaidInd = pOriginCashPaidInd;
    }

    /**
     * Sets the <code>OriginCurrency</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pOriginCurrency
     *            the new value of <code>OriginCurrency</code> property.
     */
    public void setOriginCurrency(final String pOriginCurrency) {
        this.originCurrency = ContractUtility
                    .convertToUpperCase(pOriginCurrency);
    }

    /**
     * Sets the <code>OriginIataRegion</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pOriginIataRegion
     *            the new value of <code>OriginIataRegion</code> property.
     */
    public void setOriginIataRegion(final String pOriginIataRegion) {
        this.originIataRegion = pOriginIataRegion;
    }

    /**
     * @param pOutgoingFSUCounter
     *            the outgoingFSUCounter to set
     */
    public void setOutgoingFSUCounter(final Integer pOutgoingFSUCounter) {
        this.outgoingFSUCounter = pOutgoingFSUCounter;
    }

    /**
     * Sets the <code>PadAttachmentsExist</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pPadAttachmentsExist
     *            the new value of <code>PadAttachmentsExist</code> property.
     */
    public void setPadAttachmentsExist(final String pPadAttachmentsExist) {
        this.padAttachmentsExist = pPadAttachmentsExist;
    }

    /**
     * Sets the <code>PadFwbInfoExists</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pPadFwbInfoExists
     *            the new value of <code>PadFwbInfoExists</code> property.
     */
    public void setPadFwbInfoExists(final String pPadFwbInfoExists) {
        this.padFwbInfoExists = pPadFwbInfoExists;
    }

    /**
     * Sets the <code>PadGeneralInfoExists</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pPadGeneralInfoExists
     *            the new value of <code>PadGeneralInfoExists</code> property.
     */
    public void setPadGeneralInfoExists(final String pPadGeneralInfoExists) {
        this.padGeneralInfoExists = pPadGeneralInfoExists;
    }

    /**
     * Sets the <code>PadHandlingInfoExists</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pPadHandlingInfoExists
     *            the new value of <code>PadHandlingInfoExists</code> property.
     */
    public void setPadHandlingInfoExists(final String pPadHandlingInfoExists) {
        this.padHandlingInfoExists = pPadHandlingInfoExists;
    }

    /**
     * Sets the <code>PadShipmentHandlingExists</code> injected by the Inversion
     * of Control (IoC) container.
     * <p>
     * 
     * @param pPadShipmentHandlingExists
     *            the new value of <code>PadShipmentHandlingExists</code> property.
     */
    public void setPadShipmentHandlingExists(
                final String pPadShipmentHandlingExists) {
        this.padShipmentHandlingExists = pPadShipmentHandlingExists;
    }

    /**
     * Sets the <code>PadTracingInfoExists</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pPadTracingInfoExists
     *            the new value of <code>PadTracingInfoExists</code> property.
     */
    public void setPadTracingInfoExists(final String pPadTracingInfoExists) {
        this.padTracingInfoExists = pPadTracingInfoExists;
    }

    /**
     * Sets the <code>PaperAWBOverrideInd</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pPaperAWBOverrideInd
     *            the new value of <code>PaperAWBOverrideInd</code> property.
     */
    public void setPaperAWBOverrideInd(final boolean pPaperAWBOverrideInd) {
        this.paperAWBOverrideInd = pPaperAWBOverrideInd;
    }

    /**
     * Sets the <code>participantQueueInd</code> property.
     * <p>
     * <b>Format:</b><br>
     * 1- 75 Alphanumeric
     * <p>
     * 
     * @param pParticipantQueueInd
     *            the new value of the <code>participantQueueInd</code> property.
     */
    public void setParticipantQueueInd(final String pParticipantQueueInd) {
        this.participantQueueInd = pParticipantQueueInd;
    }

    /**
     * Sets the <code>paymentEntryType</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pPaymentEntryType
     *            the new value of <code>paymentEntryType</code> property.
     */
    public void setPaymentEntryType(final String pPaymentEntryType) {
        this.paymentEntryType = pPaymentEntryType;
    }

    /**
     * Sets the <code>pickupDetail</code> have shipment pickup status and driver
     * details.
     * 
     * @param pPickupDetail
     *            the new value of <code>pickupDetail</code> property.
     */
    public void setPickupDetail(final PickupAndDeliveryDetailDto pPickupDetail) {
        this.pickupDetail = pPickupDetail;
    }

    /**
     * @param pPrepaidCashTotal
     *            the prepaidCashTotal to set
     */
    public void setPrepaidCashTotal(final BigDecimal pPrepaidCashTotal) {
        this.prepaidCashTotal = pPrepaidCashTotal;
    }

    /**
     * Sets the <code>PricingDateInd</code> property.
     * <p>
     * 
     * @param pPricingDateInd
     *            holds the new value of <code>PricingDateInd</code>.<br>
     */
    public void setPricingDateInd(final String pPricingDateInd) {
        this.PricingDateInd = pPricingDateInd;
    }

    /**
     * Sets the <code>Priority</code> injected by the Inversion of Control (IoC)
     * container.
     * <p>
     * 
     * @param pPriority
     *            the new value of <code>Priority</code> property.
     */
    public void setPriority(final Integer pPriority) {
        this.priority = pPriority;
    }

    /**
     * Sets the <code>prioritySource</code> property.
     * 
     * @param pPrioritySource
     *            the new value of the <code>prioritySource</code> property.
     */
    public void setPrioritySource(final String pPrioritySource) {
        this.prioritySource = pPrioritySource;
    }

    /**
     * Sets the <code>prodCNLNotAllowed</code> property.
     * 
     * @param pProdCNLNotAllowed
     *            the current value of the <code>prodCNLNotAllowed</code> property.
     */
    public void setProdCNLNotAllowed(boolean pProdCNLNotAllowed) {
        this.prodCNLNotAllowed = pProdCNLNotAllowed;
    }

    /**
     * Sets the <code>prodSDCType</code> property.
     * 
     * @param pProdSDCType
     *            the current value of the <code>prodSDCType</code> property.
     */
    public void setProdSDCType(ShipmentDataType pProdSDCType) {
        this.prodSDCType = pProdSDCType;
    }

    /**
     * Sets the <code>prodUPDNotAllowed</code> property.
     * 
     * @param pProdUPDNotAllowed
     *            the current value of the <code>prodUPDNotAllowed</code> property.
     */
    public void setProdUPDNotAllowed(boolean pProdUPDNotAllowed) {
        this.prodUPDNotAllowed = pProdUPDNotAllowed;
    }

    /**
     * Sets the <code>protGameChangerInd</code> property.
     * 
     * @param pProtGameChangerInd
     *            the current value of the <code>protGameChangerInd</code> property.
     */
    public void setProtGameChangerInd(final int pProtGameChangerInd) {
        this.protGameChangerInd = pProtGameChangerInd;
    }

    /**
     * Sets the <code>purgeDate</code> property.
     * <p>
     * 
     * @param pPurgeDate
     *            holds the new value of <code>purgeDate</code>.<br>
     */
    public void setPurgeDate(final Date pPurgeDate) {
        this.purgeDate = ContractUtility.getClonedDate(pPurgeDate);
    }

    /**
     * Sets the <code>QualityAssuranceIndicator</code> injected by the Inversion
     * of Control (IoC) container.
     * <p>
     * 
     * @param pQualityAssuranceIndicator
     *            the new value of <code>QualityAssuranceIndicator</code> property.
     */
    public void setQualityAssuranceIndicator(
                final String pQualityAssuranceIndicator) {
        this.qualityAssuranceIndicator = pQualityAssuranceIndicator;
    }

    /**
     * Sets the <code>rateLockInd</code> injected by the Inversion
     * of Control (IoC) container.
     * <p>
     * 
     * @param pRateLockInd
     *            the new value of <code>rateLockInd</code> property.
     */
    public void setRateLockInd(final Boolean pRateLockInd) {
        this.rateLockInd = pRateLockInd;
    }

    /**
     * Sets the <code>readyForDeliveryInd</code> property.
     * 
     * @param pReadyForDeliveryInd
     *            the new value of the <code>readyForDeliveryInd</code> property.
     */
    public void setReadyForDeliveryInd(final boolean pReadyForDeliveryInd) {
        this.readyForDeliveryInd = pReadyForDeliveryInd;
    }

    /**
     * Sets the <code>reasonCodes</code> property.
     * <p>
     * 
     * @param pReasonCodes
     *            holds the new value of <code>reasonCodes</code>.<br>
     */
    public void setReasonCodes(final List<String> pReasonCodes) {
        this.reasonCodes = pReasonCodes;
    }

    /**
     * @param securityDataPresent the securityDataPresent to set
     */
    public void setSecurityDataPresent(final boolean pSecurityDataPresent) {
        this.securityDataPresent = pSecurityDataPresent;
    }

    /**
     * Sets the <code>SecurityDeclarationDto</code> injected by the Inversion of
     * Control (IoC) container.
     * 
     * 
     * @param pSecurityDeclarationDto
     *            the exchangeGenerationInd to set
     */
    public void setSecurityDeclarationDto(
                final SecurityDeclarationDto pSecurityDeclarationDto) {
        this.securityDeclarationDto = pSecurityDeclarationDto;
    }

    /**
     * @param pESentAsFwb
     *            the sentAsFwb to set
     */
    public void setSentAsFwb(final boolean pESentAsFwb) {
        this.sentAsFwb = pESentAsFwb;
    }

    /**
     * Sets the <code>ShedCode</code> injected by the Inversion of Control (IoC)
     * container.
     * <p>
     * 
     * @param pShedCode
     *            the new value of <code>ShedCode</code> property.
     */
    public void setShedCode(final String pShedCode) {
        this.shedCode = pShedCode;
    }

    /**
     * Sets the <code>shipmentStatusDto</code> property.
     * <p>
     * <b>Format:</b><br>
     * 1- 75 Alphanumeric
     * <p>
     * 
     * @param pShipmentStatusDto
     *            the new value of the <code>shipmentStatusDto</code> property.
     */
    public void setShipmentStatusDto(final ShipmentStatusDto pShipmentStatusDto) {
        this.shipmentStatusDto = pShipmentStatusDto;
    }

    /**
     * Sets the <code>ShipmentWeightUnit</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pWeightUnit
     *            the new value of <code>ShipmentWeightUnit</code> property.
     */
    public void setShipmentVolumeUnit(final VolumeUOMType pVolumeUOMType) {
        this.shipmentVolumeUnit = pVolumeUOMType;
    }

    /**
     * Sets the <code>ShipmentWeightUnit</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pWeightUnit
     *            the new value of <code>ShipmentWeightUnit</code> property.
     */
    public void setShipmentWeightUnit(final WeightUOMType pWeightUnit) {
        this.shipmentWeightUnit = pWeightUnit;
    }

    /**
     * Sets the <code>shipperCertSign</code> property.
     * 
     * @param pShipperCertSign
     *            the new value of the <code>shipperCertSign</code> property.
     */
    public void setShipperCertSign(final String pShipperCertSign) {
        this.shipperCertSign = pShipperCertSign;
    }

    /**
     * @param pSpecialPurge
     *            the specialPurge to set
     */
    public void setSpecialPurge(final SpecialPurgeType pSpecialPurge) {
        this.specialPurge = pSpecialPurge;
    }

    /**
     * @param statusCodeType the statusCodeType to set
     */
    public void setStatusCodeType(FSUStatusType statusCodeType) {
        this.statusCodeType = statusCodeType;
    }

    /**
     * Sets the <code>SurfaceDestinationStation</code> injected by the Inversion
     * of Control (IoC) container.
     * <p>
     * 
     * @param pSurfaceDestinationStation
     *            the new value of <code>SurfaceDestinationStation</code> property.
     */
    public void setSurfaceDestinationStation(
                final String pSurfaceDestinationStation) {
        this.surfaceDestinationStation = ContractUtility
                    .convertToUpperCase(pSurfaceDestinationStation);
    }

    /**
     * Sets the <code>SurfaceOriginStation</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pSurfaceOriginStation
     *            the new value of <code>SurfaceOriginStation</code> property.
     */
    public void setSurfaceOriginStation(final String pSurfaceOriginStation) {
        this.surfaceOriginStation = ContractUtility
                    .convertToUpperCase(pSurfaceOriginStation);
    }

    /**
     * @param pTeletypeAddress
     *            the teletypeAddress to set
     */
    public void setTeletypeAddress(final String pTeletypeAddress) {
        this.teletypeAddress = pTeletypeAddress;
    }

    /**
     * Sets the <code>terminalWarehouseDiscQueueInd</code> property.
     * <p>
     * <b>Format:</b><br>
     * 1- 75 Alphanumeric
     * <p>
     * 
     * @param pTerminalWarehouseDiscQueueInd
     *            the new value of the <code>terminalWarehouseDiscQueueInd</code> property.
     */
    public void setTerminalWarehouseDiscQueueInd(final String pTerminalWarehouseDiscQueueInd) {
        this.terminalWarehouseDiscQueueInd = pTerminalWarehouseDiscQueueInd;
    }

    /**
     * Sets the <code>totalCashColExport</code> property.
     * 
     * @param pTotalCashColExport
     *            the current value of the <code>totalCashColExport</code> property.
     */
    public void setTotalCashColExport(final BigDecimal pTotalCashColExport) {
        this.totalCashColExport = pTotalCashColExport;
    }

    /**
     * Sets the <code>totalCashColImport</code> property.
     * 
     * @param pTotalCashColImport
     *            the current value of the <code>totalCashColImport</code> property.
     */
    public void setTotalCashColImport(final BigDecimal pTotalCashColImport) {
        this.totalCashColImport = pTotalCashColImport;
    }

    /**
     * Sets the <code>totalCashCollectedExport</code> injected by the Inversion
     * of Control (IoC) container.
     * <p>
     * 
     * @param pTotalCashCollectedExport
     *            the new value of <code>totalCashCollectedExport</code> property.
     */
    public void setTotalCashCollectExport(
                final BigDecimal pTotalCashCollectExport) {
        this.totalCashCollectExport = pTotalCashCollectExport;
    }

    /**
     * Sets the <code>totalCashCollectedImport</code> injected by the Inversion
     * of Control (IoC) container.
     * <p>
     * 
     * @param pTotalCashCollectedImport
     *            the new value of <code>totalCashCollectedImport</code> property.
     */
    public void setTotalCashCollectImport(
                final BigDecimal pTotalCashCollectImport) {
        this.totalCashCollectImport = pTotalCashCollectImport;
    }

    /**
     * @param pTotalHAWBCashOutstanding
     *            the totalHAWBCashOutstanding to set
     */
    public void setTotalHAWBCashOutstanding(
                final BigDecimal pTotalHAWBCashOutstanding) {
        this.totalHAWBCashOutstanding = pTotalHAWBCashOutstanding;
    }

    /**
     * @param pTotalHAWBCreditOutstanding
     *            the totalHAWBCreditOutstanding to set
     */
    public void setTotalHAWBCreditOutstanding(
                final BigDecimal pTotalHAWBCreditOutstanding) {
        this.totalHAWBCreditOutstanding = pTotalHAWBCreditOutstanding;
    }

    /**
     * Sets the <code>TotalPieces</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pTotalPieces
     *            the new value of <code>TotalPieces</code> property.
     */
    public void setTotalPieces(final long pTotalPieces) {
        this.totalPieces = pTotalPieces;
    }

    /**
     * Sets the <code>totalReceivedPieces</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pTotalReceivedPieces
     *            the new value of <code>totalReceivedPieces</code> property.
     */
    public void setTotalReceivedPieces(final String pTotalReceivedPieces) {
        this.totalReceivedPieces = pTotalReceivedPieces;
    }

    /**
     * Sets the <code>TotalVolume</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pTotalVolume
     *            the new value of <code>TotalVolume</code> property.
     */
    public void setTotalVolume(final BigDecimal pTotalVolume) {
        this.totalVolume = pTotalVolume;
    }

    /**
     * Sets the <code>TotalWeight</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pTotalWeight
     *            the new value of <code>TotalWeight</code> property.
     */
    public void setTotalWeight(final BigDecimal pTotalWeight) {
        this.totalWeight = pTotalWeight;
    }

    /**
     * Sets the <code>TraderNumber</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pTraderNumber
     *            the new value of <code>TraderNumber</code> property.
     */
    public void setTraderNumber(final String pTraderNumber) {
        this.traderNumber = pTraderNumber;
    }

    /**
     * Sets the <code>transferCarrierFrom</code> property.
     * 
     * @param pTransferCarrierFrom
     */
    public void setTransferCarrierFrom(final String pTransferCarrierFrom) {
        this.transferCarrierFrom = pTransferCarrierFrom;
    }

    /**
     * Sets the <code>transferCarrierTo</code> property.
     * 
     * @param pTransferCarrierTo
     */
    public void setTransferCarrierTo(final String pTransferCarrierTo) {
        this.transferCarrierTo = pTransferCarrierTo;
    }

    /**
     * Sets the <code>TransitCountry</code> injected by the Inversion of Control
     * (IoC) container.
     * <p>
     * 
     * @param pTransitCountry
     *            the new value of <code>TransitCountry</code> property.
     */
    public void setTransitCountry(final String pTransitCountry) {
        this.transitCountry = pTransitCountry;
    }

    /**
     * Sets the <code>TransitDeclarationNumber</code> injected by the Inversion
     * of Control (IoC) container.
     * <p>
     * 
     * @param pTransitDeclarationNumber
     *            the new value of <code>TransitDeclarationNumber</code> property.
     */
    public void setTransitDeclarationNumber(
                final String pTransitDeclarationNumber) {
        this.transitDeclarationNumber = ContractUtility.convertToUpperCase(pTransitDeclarationNumber);
    }

    /**
     * Sets the <code>unclearedAWBInd</code> property.
     * 
     * @param pUnclearedAWBInd
     *            the new value of the <code>unclearedAWBInd</code> property.
     */
    public void setUnclearedAWBInd(final Boolean pUnclearedAWBInd) {
        this.unclearedAWBInd = pUnclearedAWBInd;
    }

    /**
     * Sets the <code>unclearedDate</code> property.
     * 
     * @param pUnclearedDate
     *            the new value of the <code>unclearedDate</code> property.
     */
    public void setUnclearedDate(final Date pUnclearedDate) {
        this.unclearedDate = ContractUtility.getClonedDate(pUnclearedDate);
    }

    /**
     * Sets the <code>unclearedStation</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pUnclearedStation
     *            the new value of <code>unclearedStation</code> property.
     */
    public void setUnclearedStation(final List<String> pUnclearedStation) {
        this.unclearedStation = pUnclearedStation;
    }

    /**
     * Sets the <code>unclearedStationType</code> property.
     * 
     * @param pUnclearedStationType
     *            the new value of the <code>unclearedStationType</code> property.
     */
    public void setUnclearedStationType(final String pUnclearedStationType) {
        this.unclearedStationType = pUnclearedStationType;
    }

    /**
     * Sets the <code>updationSource</code> property.
     * 
     * @param pUpdationSource
     *            the new value of the <code>updationSource</code> property.
     */
    public void setUpdationSource(final String pUpdationSource) {
        this.updationSource = pUpdationSource;
    }

    /**
     * Sets the <code>VolumeEvaluationMethod</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pVolumeEvaluationMethod
     *            the new value of <code>VolumeEvaluationMethod</code> property.
     */
    public void setVolumeEvaluationMethod(
                final VolumeEvaluationMethod pVolumeEvaluationMethod) {
        this.volumeEvaluationMethod = pVolumeEvaluationMethod;
    }

    /**
     * Sets the <code>weightChargeType</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pWeightChargeType
     *            the new value of <code>weightChargeType</code> property.
     */
    public void setWeightChargeType(
                final RateDiscriminatorType pWeightChargeType) {
        this.weightChargeType = pWeightChargeType;
    }

    /**
     * @return the authSign
     */
    public String getAuthSign() {
        return authSign;
    }

    /**
     * @param authSign the authSign to set
     */
    public void setAuthSign(String authSign) {
        this.authSign = authSign;
    }

    // AC377 starts
    /**
     * Gets the <code>genericEAWBBilateralIndicator</code> injected by the
     * Inversion of Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>genericEAWBBilateralIndicator</code>
     *         property.
     */
    public boolean isGenericEAWBBilateralIndicator() {
        return genericEAWBBilateralIndicator;
    }

    /**
     * Sets the <code>genericEAWBBilateralIndicator</code> injected by the
     * Inversion of Control (IoC) container.
     * <p>
     * 
     * @param pGenericEAWBBilateralIndicator
     *            the new value of <code>PaperAWBOverrideIndicator</code>
     *            property.
     */
    public void setGenericEAWBBilateralIndicator(
                boolean genericEAWBBilateralIndicator) {
        this.genericEAWBBilateralIndicator = genericEAWBBilateralIndicator;
    }
    // AC377 ends

    /**
     * @return the aWBNumberGenerationIndicator
     */
    public boolean isaWBNumberGenerationIndicator() {
        return aWBNumberGenerationIndicator;
    }

    /**
     * @param aWBNumberGenerationIndicator the aWBNumberGenerationIndicator to set
     */
    public void setaWBNumberGenerationIndicator(boolean aWBNumberGenerationIndicator) {
        this.aWBNumberGenerationIndicator = aWBNumberGenerationIndicator;
    }

    /**
     * @return the hAWBValidate
     */
    public boolean ishAWBValidate() {
        return hAWBValidate;
    }

    /**
     * @param hAWBValidate the hAWBValidate to set
     */
    public void sethAWBValidate(boolean hAWBValidate) {
        this.hAWBValidate = hAWBValidate;
    }

    /**
     * @return the mAWBStatus
     */
    public MasterAwbStatusType getmAWBStatus() {
        return mAWBStatus;
    }

    /**
     * @param mAWBStatus the mAWBStatus to set
     */
    public void setmAWBStatus(MasterAwbStatusType mAWBStatus) {
        this.mAWBStatus = mAWBStatus;
    }

    /**
     * @return the oId
     */
    public Long getoId() {
        return oId;
    }

    /**
     * @param oId the oId to set
     */
    public void setoId(Long oId) {
        this.oId = oId;
    }

    /**
     * @return the customsStationChangeAllowedIndicator
     */
    public Boolean getCustomsStationChangeAllowedIndicator() {
        return customsStationChangeAllowedIndicator;
    }

    /**
     * @return the exportPaycodeOverriddenFlag
     */
    public Boolean getExportPaycodeOverriddenFlag() {
        return exportPaycodeOverriddenFlag;
    }

    /**
     * @return the importPaycodeOverriddenFlag
     */
    public Boolean getImportPaycodeOverriddenFlag() {
        return importPaycodeOverriddenFlag;
    }

    private String movementNumber;

    public String getMovementNumber() {
        return this.movementNumber;
    }

    public void setMovementNumber(final String pMovementNumber) {
        this.movementNumber = pMovementNumber;
    }

    
	/* Changes for DL584 starts */
	/**
	 * Gets the <code>isThisaCatDogOrPet</code> property.
	 * 
	 * @return the current value of <code>isThisaCatDogOrPet</code> property.
	 */
	public String getIsThisaCatDogOrPet() {
		return isThisaCatDogOrPet;
	}

	/**
	 * Sets the <code>isThisaCatDogOrPet</code> property.
	 * 
	 * @param isThisaCatDogOrPet
	 *            the current value of the <code>isThisaCatDogOrPet</code>
	 *            property.
	 */
	public void setIsThisaCatDogOrPet(String isThisaCatDogOrPet) {
		this.isThisaCatDogOrPet = isThisaCatDogOrPet;
	}

	/**
	 * Gets the <code>numberOfAnimals</code> property.
	 * 
	 * @return the current value of <code>numberOfAnimals</code> property.
	 */
	public Integer getNumberOfAnimals() {
		return numberOfAnimals;
	}

	/**
	 * Sets the <code>numberOfAnimals</code> property.
	 * 
	 * @param numberOfAnimals
	 *            the current value of the <code>numberOfAnimals</code>
	 *            property.
	 */
	public void setNumberOfAnimals(Integer numberOfAnimals) {
		this.numberOfAnimals = numberOfAnimals;
	}

	/* Changes for DL584 ends */

	// HIS019 start
	public String getUniqueTaxIdentificationCode() {
		return uniqueTaxIdentificationCode;
	}

	public void setUniqueTaxIdentificationCode(
			String uniqueTaxIdentificationCode) {
		this.uniqueTaxIdentificationCode = uniqueTaxIdentificationCode;
	}

	// HIS019 end



	/* FIS139 - START */
    
    private String pharmContactName; 
                                 
    private String pharmContactNumber;



	public String getPharmContactName() {
		return pharmContactName;
	}

	public void setPharmContactName(String pharmContactName) {
		this.pharmContactName = pharmContactName;
	}

	public String getPharmContactNumber() {
		return pharmContactNumber;
	}

	public void setPharmContactNumber(String pharmContactNumber) {
		this.pharmContactNumber = pharmContactNumber;
	}
	/**
	 * @return the eAWBMultilateralAppliedIndicator
	 */
	public boolean isEAWBMultilateralAppliedIndicator() {
		return EAWBMultilateralAppliedIndicator;
	}

	/**
	 * @param eAWBMultilateralAppliedIndicator the eAWBMultilateralAppliedIndicator to set
	 */
	public void setEAWBMultilateralAppliedIndicator(
			boolean eAWBMultilateralAppliedIndicator) {
		EAWBMultilateralAppliedIndicator = eAWBMultilateralAppliedIndicator;
	}

	public EawbStatusType geteAwbStatus() {
		return eAwbStatus;
	}

	public void seteAwbStatus(EawbStatusType eAwbStatus) {
		this.eAwbStatus = eAwbStatus;
	}

	public Date getLatDate() {
		return latDate;
	}

	public void setLatDate(Date latDate) {
		this.latDate = latDate;
	}

	public String getLatTime() {
		return latTime;
	}

	public void setLatTime(String latTime) {
		this.latTime = latTime;
	}

	public Date getToaDate() {
		return toaDate;
	}

	public void setToaDate(Date toaDate) {
		this.toaDate = toaDate;
	}

	public String getToaTime() {
		return toaTime;
	}

	public void setToaTime(String toaTime) {
		this.toaTime = toaTime;
	}

	public Date getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}

	public String getAccountingRemarks() {
		return accountingRemarks;
	}

	public void setAccountingRemarks(String accountingRemarks) {
		this.accountingRemarks = accountingRemarks;
	}

	public String getCustDestStation() {
		return custDestStation;
	}

	public void setCustDestStation(String custDestStation) {
		this.custDestStation = custDestStation;
	}

	public String getImportFlightNumber() {
		return importFlightNumber;
	}

	public void setImportFlightNumber(String importFlightNumber) {
		this.importFlightNumber = importFlightNumber;
	}

	public String getShipmentBookingIndicator() {
		return shipmentBookingIndicator;
	}

	public void setShipmentBookingIndicator(String shipmentBookingIndicator) {
		this.shipmentBookingIndicator = shipmentBookingIndicator;
	}

	public AirWaybillCreationSourceType getCreateUpdateSource() {
		return createUpdateSource;
	}

	public void setCreateUpdateSource(AirWaybillCreationSourceType createUpdateSource) {
		this.createUpdateSource = createUpdateSource;
	}

	public String getAwbOriginCountry() {
		return awbOriginCountry;
	}

	public void setAwbOriginCountry(String awbOriginCountry) {
		this.awbOriginCountry = awbOriginCountry;
	}

	public Date getActualDeliveryDateTime() {
		return actualDeliveryDateTime;
	}

	public void setActualDeliveryDateTime(Date actualDeliveryDateTime) {
		this.actualDeliveryDateTime = actualDeliveryDateTime;
	}

	public Date getStorageStartDate() {
		return storageStartDate;
	}

	public void setStorageStartDate(Date storageStartDate) {
		this.storageStartDate = storageStartDate;
	}

	public Date getPlannedDeliveryDateTime() {
		return plannedDeliveryDateTime;
	}

	public void setPlannedDeliveryDateTime(Date plannedDeliveryDateTime) {
		this.plannedDeliveryDateTime = plannedDeliveryDateTime;
	}

	public Date getDeliveryOrderDateTime() {
		return DeliveryOrderDateTime;
	}

	public void setDeliveryOrderDateTime(Date deliveryOrderDateTime) {
		DeliveryOrderDateTime = deliveryOrderDateTime;
	}

	public Date getExportReportingDate() {
		return exportReportingDate;
	}

	public void setExportReportingDate(Date exportReportingDate) {
		this.exportReportingDate = exportReportingDate;
	}

	public Date getImportReportingDate() {
		return importReportingDate;
	}

	public void setImportReportingDate(Date importReportingDate) {
		this.importReportingDate = importReportingDate;
	}

	public Date getNotificationDateTime() {
		return notificationDateTime;
	}

	public void setNotificationDateTime(Date notificationDateTime) {
		this.notificationDateTime = notificationDateTime;
	}

	public Date getPickupOrderDateTime() {
		return pickupOrderDateTime;
	}

	public void setPickupOrderDateTime(Date pickupOrderDateTime) {
		this.pickupOrderDateTime = pickupOrderDateTime;
	}

	public BigDecimal getTotalGrossWeightHawbs() {
		return TotalGrossWeightHawbs;
	}

	public void setTotalGrossWeightHawbs(BigDecimal totalGrossWeightHawbs) {
		TotalGrossWeightHawbs = totalGrossWeightHawbs;
	}

	public long getTotalNbrOfPiecesInHawbs() {
		return totalNbrOfPiecesInHawbs;
	}

	public void setTotalNbrOfPiecesInHawbs(long totalNbrOfPiecesInHawbs) {
		this.totalNbrOfPiecesInHawbs = totalNbrOfPiecesInHawbs;
	}

	public String getAwbType() {
		return awbType;
	}

	public void setAwbType(String awbType) {
		this.awbType = awbType;
	}

	public String getParticipantNotification() {
		return participantNotification;
	}

	public void setParticipantNotification(String participantNotification) {
		this.participantNotification = participantNotification;
	}

	public boolean isDeleteInd() {
		return deleteInd;
	}

	public void setDeleteInd(boolean deleteInd) {
		this.deleteInd = deleteInd;
	}

	public String getHawbValidatedIndicator() {
		return hawbValidatedIndicator;
	}

	public void setHawbValidatedIndicator(String hawbValidatedIndicator) {
		this.hawbValidatedIndicator = hawbValidatedIndicator;
	}

	public String getHawbConsolidationIndicator() {
		return hawbConsolidationIndicator;
	}

	public void setHawbConsolidationIndicator(String hawbConsolidationIndicator) {
		this.hawbConsolidationIndicator = hawbConsolidationIndicator;
	}

	public int getTotalAcceptedPieces() {
		return totalAcceptedPieces;
	}

	public void setTotalAcceptedPieces(int totalAcceptedPieces) {
		this.totalAcceptedPieces = totalAcceptedPieces;
	}

	public BigDecimal getTotalAcceptedVolume() {
		return totalAcceptedVolume;
	}

	public void setTotalAcceptedVolume(BigDecimal totalAcceptedVolume) {
		this.totalAcceptedVolume = totalAcceptedVolume;
	}

	/**
	 * @return the totalAcceptedWeight
	 */
	public BigDecimal getTotalAcceptedWeight() {
		return totalAcceptedWeight;
	}

	/**
	 * @param totalAcceptedWeight the totalAcceptedWeight to set
	 */
	public void setTotalAcceptedWeight(BigDecimal totalAcceptedWeight) {
		this.totalAcceptedWeight = totalAcceptedWeight;
	}

	/**
	 * @return the natureOfGoods
	 */
	public String getNatureOfGoods() {
		return natureOfGoods;
	}

	/**
	 * @param natureOfGoods the natureOfGoods to set
	 */
	public void setNatureOfGoods(String natureOfGoods) {
		this.natureOfGoods = natureOfGoods;
	}

	/**
	 * @return the exportCustomsInd
	 */
	public boolean getExportCustomsInd() {
		return exportCustomsInd;
	}

	/**
	 * @param exportCustomsInd the exportCustomsInd to set
	 */
	public void setExportCustomsInd(boolean exportCustomsInd) {
		this.exportCustomsInd = exportCustomsInd;
	}

	/**
	 * @return the importCustomsInd
	 */
	public boolean isImportCustomsInd() {
		return importCustomsInd;
	}

	/**
	 * @param importCustomsInd the importCustomsInd to set
	 */
	public void setImportCustomsInd(boolean importCustomsInd) {
		this.importCustomsInd = importCustomsInd;
	}

	/**
	 * @return the importPiecesCleared
	 */
	public int getImportPiecesCleared() {
		return importPiecesCleared;
	}

	/**
	 * @param importPiecesCleared the importPiecesCleared to set
	 */
	public void setImportPiecesCleared(int importPiecesCleared) {
		this.importPiecesCleared = importPiecesCleared;
	}

	/**
	 * @return the importPiecesDelivered
	 */
	public int getImportPiecesDelivered() {
		return importPiecesDelivered;
	}

	/**
	 * @param importPiecesDelivered the importPiecesDelivered to set
	 */
	public void setImportPiecesDelivered(int importPiecesDelivered) {
		this.importPiecesDelivered = importPiecesDelivered;
	}

	/**
	 * @return the transitCustomsInd
	 */
	public boolean isTransitCustomsInd() {
		return transitCustomsInd;
	}

	/**
	 * @param transitCustomsInd the transitCustomsInd to set
	 */
	public void setTransitCustomsInd(boolean transitCustomsInd) {
		this.transitCustomsInd = transitCustomsInd;
	}

	/**
	 * @return the consigneeRemarks1
	 */
	public String getConsigneeRemarks1() {
		return consigneeRemarks1;
	}

	/**
	 * @param consigneeRemarks1 the consigneeRemarks1 to set
	 */
	public void setConsigneeRemarks1(String consigneeRemarks1) {
		this.consigneeRemarks1 = consigneeRemarks1;
	}

	/**
	 * @return the consigneeRemarks2
	 */
	public String getConsigneeRemarks2() {
		return consigneeRemarks2;
	}

	/**
	 * @param consigneeRemarks2 the consigneeRemarks2 to set
	 */
	public void setConsigneeRemarks2(String consigneeRemarks2) {
		this.consigneeRemarks2 = consigneeRemarks2;
	}

	/**
	 * @return the shipperRemarks
	 */
	public String getShipperRemarks() {
		return shipperRemarks;
	}

	/**
	 * @param shipperRemarks the shipperRemarks to set
	 */
	public void setShipperRemarks(String shipperRemarks) {
		this.shipperRemarks = shipperRemarks;
	}

	/**
	 * @return the custArrivalPort
	 */
	public String getCustArrivalPort() {
		return custArrivalPort;
	}

	/**
	 * @param custArrivalPort the custArrivalPort to set
	 */
	public void setCustArrivalPort(String custArrivalPort) {
		this.custArrivalPort = custArrivalPort;
	}

    public String getDimentionRotateInd() {
        return dimentionRotateInd;
    }

    public void setDimentionRotateInd(String dimentionRotateInd) {
        this.dimentionRotateInd = dimentionRotateInd;
    }

    public String getDimentionalVolMethodInd() {
        return dimentionalVolMethodInd;
    }

    public void setDimentionalVolMethodInd(String dimentionalVolMethodInd) {
        this.dimentionalVolMethodInd = dimentionalVolMethodInd;
    }



   
	
	/* FIS139 - END */

}
