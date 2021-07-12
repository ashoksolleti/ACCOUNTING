package com.unisys.trans.logistics.lms.awb.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.awb.constants.AirWaybillCreationSourceType;
import com.unisys.trans.logistics.lms.awb.constants.AuditStatusType;
import com.unisys.trans.logistics.lms.awb.constants.InternationalAWBType;
import com.unisys.trans.logistics.lms.framework.constants.AWBPaycodeType;
import com.unisys.trans.logistics.lms.framework.constants.VolumeUOMType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class AirWaybillDetailDto extends PersistenceObjectDto {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1407823324377315816L;

    /**
     * Attribute to holds <code>accountingRemarks</code> property.
     */
    private String accountingRemarks;

    private Date actualDeliveryDateTime;

    private String agentCode;

    /**
     * Attribute to holds <code>accountingRemarks</code> property.
     */
    private String agentRemarks;

    private boolean airlineHoldInd;

    private String airlineHoldStation;

    private Date arrivalDateTime;

    private boolean awbDeletionInd;
    
    /**
     * AWB Locked Date
     */
    private Date awbLockedDateTime;
    
    /**
     * AirWaybill Locked Indicator
     * <ul>
     * <li>Y = air waybill locked</li>
     * <li>Blank = air waybill unlocked</li>
     * <li>binary 0 = air waybill unlocked</li>
     * </ul>
     */
    private String awbLockedInd;

    /**
     * AirWaybill Lock Station
     */
    private String awbLockStation;

    private String awbOriginCountry;

    private String awbPriority;

    private String awbProductQueueServiceLevel;

    private String awbType;

    /**
     * Booking Remarks 3 or 4 exists
     */
    private String bookingRemarks3Or4Exists;

    /**
     * Attribute to holds <code>consigneeRemarks1</code> property.
     */
    private String consigneeRemarks1;

    /**
     * Attribute to holds <code>consigneeRemarks2</code> property.
     */
    private String consigneeRemarks2;

    /**
     * Creation Update Source
     * 
     */
    private AirWaybillCreationSourceType createUpdateSource;

    /**
     * Attribute to holds <code>crossReference1</code> property.
     */
    private String crossReference1;

    /**
     * Attribute to holds <code>crossReference2</code> property.
     */
    private String crossReference2;
    
    /**
     * Cross Reference Indicator One
     */
    private String crossReferenceIndicator1;

    /**
     * Cross Reference Indicator Two
     */
    private String crossReferenceIndicator2;

    private int cumulativeAcceptedPieces;

    private BigDecimal cumulativeAcceptedWeight;

    /**
     * Attribute to holds <code>declaredValue</code> property.
     */
    private String customsValue;

    private String declarantEoriCountry;

    private String declarantEoriNumber;

    /**
     * Attribute to holds <code>declaredValue</code> property.
     */
    private String declaredValue;

    private String deliveryBillLadingNumber;

    /**
     * PICKUP BILL LADING NUMBER related Pickup date time.
     */
    private boolean deliveryCostStatusInd;

    /**
     * PICKUP BILL LADING NUMBER related Pickup date time.
     */
    private Date deliveryOrderDateTime;

    /**
     * Destination Customs Station
     */
    private String destCustomsStation;

    /**
     * Attribute to hold <code>destinationCurrency</code> property.
     */
    private String destinationCurrency;

    /**
     * Dimensional Weight of Shipment
     */
    private BigDecimal dimensionalVolume;

    /**
     * Dimensional volume indicator
     * E = Estimated
     * A = Actual
     * T = Terminal warehouse
     */
    private String dimensionalVolumeCalculationInd;

    private VolumeUOMType dimensionalVolumeUnit;

    /**
     * Dimensional Weight of Shipment
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

    private Date earliestTravelDate;

    /**
     * E-AWB, Is this a designated e-awb and does not require paper air way bill
     * <ul>
     * <li>Y - awb is an e-awb, set by incoming fwb</li>
     * <li>N - awb is not an e-awb, default value when c$eawb=y</li>
     * <li>Blank - awb is not an e-awb, default when c$eawb=n</li>
     * </ul>
     */
    /**
     * Attribute to holds <code>eAWBIndicator</code> property.
     */
    private boolean eAwbInd;

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

    private Date exportAccountReleaseDate;

    private AuditStatusType exportAuditStatus;

    /**
     * Cumulative total of bulk goods only shipment pieces accepted at or beyond
     * the export reporting station ER Pieces - MVGPCS
     */
    private long exportBulkPiecesAccepted;

    /**
     * Cumulative total of bulk goods only shipment weight accepted at or beyond
     * the export reporting station. Excludes sluld weight. ER Weight - MVGWGT
     */
    private BigDecimal exportBulkWeightAccepted;

    private String exportCountry;

    private boolean exportCustomsInd;

    private String exportDeclarationNumber;

    /**
     * Attribute to holds <code>exportPaycode</code> property. ER Paycode
     */
    private AWBPaycodeType exportPaycode;

    /**
     * Attribute to holds <code>exportReportingDate</code> property.
     */
    private Date exportReportingDate;

    /**
     * Attribute to holds <code>exportReportingStation</code> property.
     * 
     * ER Station
     */
    private String exportReportingStation;

    /**
     * Attribute to holds <code>surfaceDestinationStation</code> property.
     */
    private String ffrSriReferenceNumber;

    /**
     * Attribute to holds <code>surfaceDestinationStation</code> property.
     */
    private String ffrSriShipmentInfo1;

    private String ffrSriShipmentInfo2;

    /**
     * Final air waybill disposition status code.
     * <ul>
     * 
     * <li>BLANK = No fd status code has been captured (initial value).
     * <li>C = The check in (gci) of all pieces at the destination station will set the fd status to 'c' and a
     * date and time stamp is captured all pieces transferred interline (gsc:i) at the ir station will set the
     * fd status to 'c' and a date and time stamp is captured. Note: this mechanized station relative
     * <li>U = The unverified arrival (gci:n) of all pieces of all pieces at the destination station will set
     * the fd status to 'u' and a date and time stamp is captured. In the open to import audit processing , if
     * all goods have a finalized status, set the fd status to 'u' when the existing fd status is blank and a
     * date and time stamp is captured. Note: non-mechanized station relative
     * <li>F = Incoming fsu rcf or dlv messages for all shipment pieces from the destination station will set
     * the fd status to 'f' when the existing fd status is blank or 'u' and a date and time stamp is captured.
     * Incoming fsu rct message for all shipment pieces from the ir station will set the fd status to 'f' when
     * the existing fd status is blank or 'u' and a date and time stamp is captured. (for example, in the
     * following air waybill routing, the rct message station may not be the station prior to the destination
     * station e.g. osl cphsk lhrba manba pikba, the rct would be expected at the ir station lhr. Note:
     * non-mechanized station relative
     * </ul>
     */
    private String finalDispositionStatus;

    private Date finalDispositionStatusDateTime;

    private Date firstAcceptanceDateTime;

    private int fsuDlvPieces;

    private int fsuRcfPieces;

    private int fsuRctPieces;

    /**
     * Government Tax Indicator
     * <ul>
     * <li>N or blank = Government tax charge has not been calculated.</li>
     * <li>Y = Government tax charge has been calculated.</li>
     * </ul>
     */
    private String governmentTaxIndicator;

    private String hawbConsolidationIndicator;

    /**
     * House AWB Validated - House AWB Validation Status
     */
    private String hawbValidatedIndicator;

    private Date importAccountReleaseDate;

    private AuditStatusType importAuditStatus;

    private String importClearanceNumber;

    /**
     * Customs Import Indicator - AWB Import customs Status
     */
    private boolean importCustomsInd;

    private String importCustomsStatus;

    /**
     * Attribute to holds <code>importPayCode</code> property. IR Paycode
     */
    private AWBPaycodeType importPaycode;

    private int importPiecesCleared;

    private int importPiecesDelivered;

	/**
     * Attribute to holds <code>importReportingDate</code> property.
     */
    private Date importReportingDate;

	/**
     * Attribute to holds <code>importReportingStation</code> property.
     */
    private String importReportingStation;

	private int importReportingStationPieces;

	/**
     * Freight Bill In bond Indicator
     * <ul>
     * <li>Y = in bond</li>
     * <li>N = not in bond</li>
     * </ul>
     */
    private String inBondIndicator;

	/**
     * Attribute to holds <code>insuranceCode</code> property.
     */
    private String insuranceCode;

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

    private String internationalType;

    private Date lastCheckinDate;

    private Date latestAcceptanceDateTime;

    private Date latestArrivalDateTime;

    /**
     * Nature of goods (first 15 characters of first rating line description)
     */
    private String natureOfGoods;

    /**
     * Attribute to holds <code>northAmericanIndicator</code> property.
     */
    private boolean northAmericanIndicator;

    /**
     * Attribute to holds <code>notifyDate</code> property.
     */
    private Date notificationDateTime;

    /**
     * Attribute to holds <code>oId</code> property.
     */
    private Long oId;

    private boolean originatedAsFwb;

    /**
     * Attribute to holds <code>originCurrency</code> property.
     */
    private String originCurrency;

    private String originIataRegion;

    /**
     * PAD images, Attachments Exist
     */
    private String padAttachmentsExist;

    /**
     * PAD FWB Info Exists
     * <ul>
     * <li>y = yes</li>
     * <li>anything else = no</li>
     * </ul>
     */
    private String padFwbInfoExists;

    /**
     * PAD General Info Exists
     */
    private String padGeneralInfoExists;

    /**
     * PAD Handling Info Exists
     * <ul>
     * <li>y = yes</li>
     * <li>anything else = no</li>
     * </ul>
     */
    private String padHandlingInfoExists;

    /**
     * PAD terminal warehouse handling info exists
     * <ul>
     * <li>y = yes</li>
     * <li>anything else = no</li>
     * </ul>
     */
    private String padShipmentHandlingExists;

    /**
     * PAD Tracing Info Exists
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
     * Participant Notification Indicator
     * <ul>
     * <li>C = consignee should be notified</li>
     * <li>B = broker should be notified</li>
     * <li>X = both consignee and broker should be notified</li>
     * </ul>
     */
    private String participantNotification;

    private String pickupBillLadingNumber;

    /**
     * PICKUP BILL LADING NUMBER related Pickup date time.
     */
    private boolean pickupCostStatusInd;

    /**
     * PICKUP BILL LADING NUMBER related Pickup date time.
     */
    private Date pickupOrderDateTime;

    /**
     * Attribute to holds <code>deliveryDate</code> property.
     */
    private Date plannedDeliveryDateTime;

    private Date plannedPickupDateTime;

    /**
     * Freight Bill Priority Valid values are: blank and 1 to 9
     * <ul>
     * <li>blank = no priority</li>
     * <li>1 = highest priority</li>
     * <li>9 = lowest priority</li>
     * </ul>
     */
    private String priority;

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

    private String shedCode;

    /**
     * Shipment Booking Indicator
     * 
     * S = Shipment Data Capture completed (ESI)
     * B = Enter Booking completed (EBI)
     * X = Both ESI and EBI have been completed
     */
    private String shipmentBookingIndicator;

    /**
     * Terminal warehouse total pieces in shipment. Total of all pieces in
     * TDSGDS and shipper loaded ULDs (TGULDC and THUACT records) plus the
     * delivered TDSGDS and shipper loaded ULD records associated with this AWB.
     * 
     * TW Pieces - FITPCS
     */
    private long shipmentHandlingTotalPieces;

    /**
     * Terminal warehouse total volume shipment TW Volume - FITVOL
     */
    private BigDecimal shipmentHandlingTotalVolume;

    /**
     * Terminal warehouse total weight in shipment. Total of all weight in
     * TDSGDS records and shipper loaded ULDs (TGULDC and THUACT records) plus
     * the delivered TDSGDS and shipper loaded ULD records associated with this
     * AWB. - FIHWGT
     */
    private BigDecimal shipmentHandlingTotalWeight;

    private VolumeUOMType shipmentVolumeUnit;

    private WeightUOMType shipmentWeightUnit;

    /**
     * Attribute to holds <code>shipperRemarks</code> property.
     */
    private String shipperRemarks;

    private Date storageStartDate;

    /**
     * Attribute to holds <code>surfaceDestinationStation</code> property.
     */
    private String surfaceDestinationStation;

    

    /**
     * Attribute to holds <code>surfaceOriginStation</code> property.
     */
    private String surfaceOriginStation;

    private Date timeOfAvailabilityDateTime;

    private int totalAcceptedPieces;

    private int totalAcceptedSluid;

    private BigDecimal totalAcceptedSluidWeight;

    private BigDecimal totalAcceptedWeight;

    /**
     * Attribute to hold <code>totalCollectDueAgent</code> property.
     */
    private BigDecimal totalCollectDueAgent;

    /**
     * Attribute to hold <code>totalCollectDueCarrier</code> property.
     */
    private BigDecimal totalCollectDueCarrier;

    /**
     * Total weight of all house bill shipments House Weight.
     * 
     */
    private BigDecimal totalGrossWeightHawbs;

    /**
     * Total number of pieces in house bills. House Pieces
     */
    private long totalNbrOfPiecesInHawbs;

    /**
     * Total pieces registered via data capture (ESI, EGI, GAC, FFM) SDC Pieces
     * - FIXPCS
     * 
     * SDCTotals (Data Capture Pieces)
     */
    private long totalPieces;

    /**
     * Attribute to hold <code>totalPrepaidDueAgent</code> property.
     */
    private BigDecimal totalPrepaidDueAgent;

    /**
     * Attribute to hold <code>totalPrepaidDueCarrier</code> property.
     */
    private BigDecimal totalPrepaidDueCarrier;

    /**
     * Total volume registered via data capture (ESI, EGI) SDC Volume - FIUVOL
     */
    private BigDecimal totalVolume;
    
    private BigDecimal totalAcceptedVolume;

    /**
     * Total weight registered via data capture (ESI, EGI, GAC) Stored in the
     * units indicated by FIMUWT - FIIWGT SDC Weight
     */
    private BigDecimal totalWeight;

    private String traderNumber;

    private String transitCountry;

    private boolean transitCustomsInd;

    private String transitDeclarationNumber;

    private String unNumbers;

    private EawbStatusType eawbStatus;
    
    private AwbRoutingIndType awbRoutingInd;
    
    private AwbUpdateSourceType awbUpdateSource;
    
    private int awbExecutionDate;
    /**
     * @return the awbUpdateSource
     */
    public AwbUpdateSourceType getAwbUpdateSource() {
        return awbUpdateSource;
    }

    /**
     * @param awbUpdateSource the awbUpdateSource to set
     */
    public void setAwbUpdateSource(AwbUpdateSourceType awbUpdateSource) {
        this.awbUpdateSource = awbUpdateSource;
    }

    /**
     * @param eawbStatus the eawbStatus to set
     */
    public void setEawbStatus(EawbStatusType eawbStatus) {
        this.eawbStatus = eawbStatus;
    }

    public String getAccountingRemarks() {
        return accountingRemarks;
    }

    public Date getActualDeliveryDateTime() {
        return actualDeliveryDateTime;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public String getAgentRemarks() {
        return agentRemarks;
    }
    
    public String getAirlineHoldStation() {
        return airlineHoldStation;
    }

    public Date getArrivalDateTime() {
        return arrivalDateTime;
    }

    public Date getAwbLockedDateTime() {
        return awbLockedDateTime;
    }
    
    public String getAwbLockedInd() {
        return awbLockedInd;
    }

    public String getAwbLockStation() {
        return awbLockStation;
    }

    public String getAwbOriginCountry() {
        return awbOriginCountry;
    }

    public String getAwbPriority() {
        return awbPriority;
    }

    public String getAwbProductQueueServiceLevel() {
        return awbProductQueueServiceLevel;
    }

    public String getAwbType() {
        return awbType;
    }

    public String getBookingRemarks3Or4Exists() {
        return bookingRemarks3Or4Exists;
    }

    public String getConsigneeRemarks1() {
        return consigneeRemarks1;
    }

    public String getConsigneeRemarks2() {
        return consigneeRemarks2;
    }

    public AirWaybillCreationSourceType getCreateUpdateSource() {
        return createUpdateSource;
    }

    public String getCrossReference1() {
        return crossReference1;
    }

    public String getCrossReference2() {
        return crossReference2;
    }

    public String getCrossReferenceIndicator1() {
        return crossReferenceIndicator1;
    }

    public String getCrossReferenceIndicator2() {
        return crossReferenceIndicator2;
    }

    public int getCumulativeAcceptedPieces() {
        return cumulativeAcceptedPieces;
    }

    public BigDecimal getCumulativeAcceptedWeight() {
        return cumulativeAcceptedWeight;
    }

    public String getCustomsValue() {
        return customsValue;
    }

    public String getDeclarantEoriCountry() {
        return declarantEoriCountry;
    }

    public String getDeclarantEoriNumber() {
        return declarantEoriNumber;
    }

    public String getDeclaredValue() {
        return declaredValue;
    }

    public String getDeliveryBillLadingNumber() {
        return deliveryBillLadingNumber;
    }

    public Date getDeliveryOrderDateTime() {
        return deliveryOrderDateTime;
    }

    public String getDestCustomsStation() {
        return destCustomsStation;
    }

    public String getDestinationCurrency() {
        return destinationCurrency;
    }

    public BigDecimal getDimensionalVolume() {
        return dimensionalVolume;
    }

    public String getDimensionalVolumeCalculationInd() {
        return dimensionalVolumeCalculationInd;
    }

    public VolumeUOMType getDimensionalVolumeUnit() {
        return dimensionalVolumeUnit;
    }

    public BigDecimal getDimensionalWeightOfShipment() {
        return dimensionalWeightOfShipment;
    }

   

    public String getDiscrepancyExists() {
        return discrepancyExists;
    }

    public Date getEarliestTravelDate() {
        return earliestTravelDate;
    }

    public String getEuropeanCustomsOriginDetail() {
        return europeanCustomsOriginDetail;
    }

    public Date getExportAccountReleaseDate() {
        return exportAccountReleaseDate;
    }

    public AuditStatusType getExportAuditStatus() {
        return exportAuditStatus;
    }

    public long getExportBulkPiecesAccepted() {
        return exportBulkPiecesAccepted;
    }

    public BigDecimal getExportBulkWeightAccepted() {
        return exportBulkWeightAccepted;
    }

    public String getExportCountry() {
        return exportCountry;
    }

    public String getExportDeclarationNumber() {
        return exportDeclarationNumber;
    }

    public AWBPaycodeType getExportPaycode() {
        return exportPaycode;
    }

    public Date getExportReportingDate() {
        return exportReportingDate;
    }

    public String getExportReportingStation() {
        return exportReportingStation;
    }

    public String getFfrSriReferenceNumber() {
        return ffrSriReferenceNumber;
    }

    public String getFfrSriShipmentInfo1() {
        return ffrSriShipmentInfo1;
    }

    public String getFfrSriShipmentInfo2() {
        return ffrSriShipmentInfo2;
    }

    public String getFinalDispositionStatus() {
        return finalDispositionStatus;
    }

    public Date getFinalDispositionStatusDateTime() {
        return finalDispositionStatusDateTime;
    }

    public Date getFirstAcceptanceDateTime() {
        return firstAcceptanceDateTime;
    }

    public int getFsuDlvPieces() {
        return fsuDlvPieces;
    }

    public int getFsuRcfPieces() {
        return fsuRcfPieces;
    }

    public int getFsuRctPieces() {
        return fsuRctPieces;
    }

    public String getGovernmentTaxIndicator() {
        return governmentTaxIndicator;
    }

    public String getHawbConsolidationIndicator() {
        return hawbConsolidationIndicator;
    }

    public String getHawbValidatedIndicator() {
    	if(hawbValidatedIndicator!=null ){
    		if(hawbValidatedIndicator.equals("Y")){
    			hawbValidatedIndicator="Yes";
    		}else if(hawbValidatedIndicator.equals("N")){
    			hawbValidatedIndicator="No";
    		}
    	}
        return hawbValidatedIndicator;
    }

    public Date getImportAccountReleaseDate() {
        return importAccountReleaseDate;
    }

    public AuditStatusType getImportAuditStatus() {
        return importAuditStatus;
    }

    public String getImportClearanceNumber() {
        return importClearanceNumber;
    }

    public String getImportCustomsStatus() {
        return importCustomsStatus;
    }

    public AWBPaycodeType getImportPaycode() {
        return importPaycode;
    }

    public int getImportPiecesCleared() {
		return importPiecesCleared;
	}

    public int getImportPiecesDelivered() {
		return importPiecesDelivered;
	}

    public Date getImportReportingDate() {
        return importReportingDate;
    }

    public String getImportReportingStation() {
        return importReportingStation;
    }

    public int getImportReportingStationPieces() {
        return importReportingStationPieces;
    }

    public String getInBondIndicator() {
        return inBondIndicator;
    }

    public String getInsuranceCode() {
        return insuranceCode;
    }

    public String getInsuranceValue() {
        return insuranceValue;
    }

    public InternationalAWBType getInternationalAWBType() {
        return internationalAWBType;
    }

    public String getInternationalType() {
		return internationalType;
	}

    public Date getLastCheckinDate() {
        return lastCheckinDate;
    }

    public Date getLatestAcceptanceDateTime() {
        return latestAcceptanceDateTime;
    }

    public Date getLatestArrivalDateTime() {
        return latestArrivalDateTime;
    }

    public String getNatureOfGoods() {
        return natureOfGoods;
    }

    public Date getNotificationDateTime() {
        return notificationDateTime;
    }

    public Long getOId() {

        return this.oId;
    }

    public String getOriginCurrency() {
        return originCurrency;
    }

    public String getOriginIataRegion() {
        return originIataRegion;
    }


    public String getPadAttachmentsExist() {
        return padAttachmentsExist;
    }

    public String getPadFwbInfoExists() {
        return padFwbInfoExists;
    }

    public String getPadGeneralInfoExists() {
        return padGeneralInfoExists;
    }

    public String getPadHandlingInfoExists() {
        return padHandlingInfoExists;
    }

    public String getPadShipmentHandlingExists() {
        return padShipmentHandlingExists;
    }

    public String getPadTracingInfoExists() {
        return padTracingInfoExists;
    }

    public String getParticipantNotification() {
        return participantNotification;
    }

    public String getPickupBillLadingNumber() {
        return pickupBillLadingNumber;
    }

    public Date getPickupOrderDateTime() {
        return pickupOrderDateTime;
    }

    public Date getPlannedDeliveryDateTime() {
        return plannedDeliveryDateTime;
    }

    public Date getPlannedPickupDateTime() {
        return plannedPickupDateTime;
    }

    public String getPriority() {
        return priority;
    }

    public String getQualityAssuranceIndicator() {
        return qualityAssuranceIndicator;
    }

    public String getShedCode() {
        return shedCode;
    }

    public String getShipmentBookingIndicator() {
        return shipmentBookingIndicator;
    }

    public long getShipmentHandlingTotalPieces() {
        return shipmentHandlingTotalPieces;
    }

    public BigDecimal getShipmentHandlingTotalVolume() {
        return shipmentHandlingTotalVolume;
    }

    public BigDecimal getShipmentHandlingTotalWeight() {
        return shipmentHandlingTotalWeight;
    }


    public VolumeUOMType getShipmentVolumeUnit() {
        return shipmentVolumeUnit;
    }

    public WeightUOMType getShipmentWeightUnit() {
        return shipmentWeightUnit;
    }

    public String getShipperRemarks() {
        return shipperRemarks;
    }

    public Date getStorageStartDate() {
        return storageStartDate;
    }

    public String getSurfaceDestinationStation() {
        return surfaceDestinationStation;
    }

    public String getSurfaceOriginStation() {
        return surfaceOriginStation;
    }

    public Date getTimeOfAvailabilityDateTime() {
        return timeOfAvailabilityDateTime;
    }

    public int getTotalAcceptedPieces() {
        return totalAcceptedPieces;
    }

    public int getTotalAcceptedSluid() {
        return totalAcceptedSluid;
    }

    public BigDecimal getTotalAcceptedSluidWeight() {
        return totalAcceptedSluidWeight;
    }

    public BigDecimal getTotalAcceptedWeight() {
        return totalAcceptedWeight;
    }

    public BigDecimal getTotalCollectDueAgent() {
        return totalCollectDueAgent;
    }

    public BigDecimal getTotalCollectDueCarrier() {
        return totalCollectDueCarrier;
    }

    public BigDecimal getTotalGrossWeightHawbs() {
        return totalGrossWeightHawbs;
    }

    public long getTotalNbrOfPiecesInHawbs() {
        return totalNbrOfPiecesInHawbs;
    }

    public long getTotalPieces() {
        return totalPieces;
    }

    public BigDecimal getTotalPrepaidDueAgent() {
        return totalPrepaidDueAgent;
    }

    public BigDecimal getTotalPrepaidDueCarrier() {
        return totalPrepaidDueCarrier;
    }

    public BigDecimal getTotalVolume() {
        return totalVolume;
    }
    
    public BigDecimal getTotalAcceptedVolume() {
        return totalAcceptedVolume;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public String getTraderNumber() {
        return traderNumber;
    }

    public String getTransitCountry() {
        return transitCountry;
    }

    public String getTransitDeclarationNumber() {
        return transitDeclarationNumber;
    }

    public String getUnNumbers() {
        return unNumbers;
    }

    public boolean isAirlineHoldInd() {
        return airlineHoldInd;
    }

    public boolean isAwbDeletionInd() {
        return awbDeletionInd;
    }

    public boolean isDeliveryCostStatusInd() {
        return deliveryCostStatusInd;
    }



    public boolean isExportCustomsInd() {
        return exportCustomsInd;
    }

    public boolean isImportCustomsInd() {
        return importCustomsInd;
    }

    public int isImportPiecesCleared() {
        return importPiecesCleared;
    }

    public int isImportPiecesDelivered() {
        return importPiecesDelivered;
    }

    public boolean isNorthAmericanIndicator() {
        return northAmericanIndicator;
    }

    public boolean isOriginatedAsFwb() {
        return originatedAsFwb;
    }

    public boolean isPaperAWBOverrideInd() {
        return paperAWBOverrideInd;
    }

    public boolean isPickupCostStatusInd() {
        return pickupCostStatusInd;
    }

    public boolean isTransitCustomsInd() {
        return transitCustomsInd;
    }

    public void setAccountingRemarks(String accountingRemarks) {
        this.accountingRemarks = accountingRemarks;
    }

    public void setActualDeliveryDateTime(Date actualDeliveryDateTime) {
        this.actualDeliveryDateTime = actualDeliveryDateTime;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public void setAgentRemarks(String agentRemarks) {
        this.agentRemarks = agentRemarks;
    }

    public void setAirlineHoldInd(boolean airlineHoldInd) {
        this.airlineHoldInd = airlineHoldInd;
    }

    public void setAirlineHoldStation(String airlineHoldStation) {
        this.airlineHoldStation = airlineHoldStation;
    }

    public void setArrivalDateTime(Date arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public void setAwbDeletionInd(boolean awbDeletionInd) {
        this.awbDeletionInd = awbDeletionInd;
    }

    public void setAwbLockedDateTime(Date awbLockedDateTime) {
        this.awbLockedDateTime = awbLockedDateTime;
    }

    public void setAwbLockedInd(String awbLockedInd) {
        this.awbLockedInd = awbLockedInd;
    }

    public void setAwbLockStation(String awbLockStation) {
        this.awbLockStation = awbLockStation;
    }

    public void setAwbOriginCountry(String awbOriginCountry) {
        this.awbOriginCountry = awbOriginCountry;
    }

    public void setAwbPriority(String awbPriority) {
        this.awbPriority = awbPriority;
    }

    public void setAwbProductQueueServiceLevel(String awbProductQueueServiceLevel) {
        this.awbProductQueueServiceLevel = awbProductQueueServiceLevel;
    }

    public void setAwbType(String awbType) {
        this.awbType = awbType;
    }

    public void setBookingRemarks3Or4Exists(String bookingRemarks3Or4Exists) {
        this.bookingRemarks3Or4Exists = bookingRemarks3Or4Exists;
    }

    public void setConsigneeRemarks1(String consigneeRemarks1) {
        this.consigneeRemarks1 = consigneeRemarks1;
    }

    public void setConsigneeRemarks2(String consigneeRemarks2) {
        this.consigneeRemarks2 = consigneeRemarks2;
    }

    public void setCreateUpdateSource(
                AirWaybillCreationSourceType createUpdateSource) {
        this.createUpdateSource = createUpdateSource;
    }

    public void setCrossReference1(String crossReference1) {
        this.crossReference1 = crossReference1;
    }

    public void setCrossReference2(String crossReference2) {
        this.crossReference2 = crossReference2;
    }

    public void setCrossReferenceIndicator1(String crossReferenceIndicator1) {
        this.crossReferenceIndicator1 = crossReferenceIndicator1;
    }

    public void setCrossReferenceIndicator2(String crossReferenceIndicator2) {
        this.crossReferenceIndicator2 = crossReferenceIndicator2;
    }

    public void setCumulativeAcceptedPieces(int cumulativeAcceptedPieces) {
        this.cumulativeAcceptedPieces = cumulativeAcceptedPieces;
    }

    public void setCumulativeAcceptedWeight(BigDecimal cumulativeAcceptedWeight) {
        this.cumulativeAcceptedWeight = cumulativeAcceptedWeight;
    }

    public void setCustomsValue(String customsValue) {
        this.customsValue = customsValue;
    }

    public void setDeclarantEoriCountry(String declarantEoriCountry) {
        this.declarantEoriCountry = declarantEoriCountry;
    }

    public void setDeclarantEoriNumber(String declarantEoriNumber) {
        this.declarantEoriNumber = declarantEoriNumber;
    }

    public void setDeclaredValue(String declaredValue) {
        this.declaredValue = declaredValue;
    }

    public void setDeliveryBillLadingNumber(String deliveryBillLadingNumber) {
        this.deliveryBillLadingNumber = deliveryBillLadingNumber;
    }

    public void setDeliveryCostStatusInd(boolean deliveryCostStatusInd) {
        this.deliveryCostStatusInd = deliveryCostStatusInd;
    }

    public void setDeliveryOrderDateTime(Date deliveryOrderDateTime) {
        this.deliveryOrderDateTime = deliveryOrderDateTime;
    }

    public void setDestCustomsStation(String destCustomsStation) {
        this.destCustomsStation = destCustomsStation;
    }

    public void setDestinationCurrency(String destinationCurrency) {
        this.destinationCurrency = destinationCurrency;
    }

    public void setDimensionalVolume(BigDecimal dimensionalVolume) {
        this.dimensionalVolume = dimensionalVolume;
    }

    public void setDimensionalVolumeCalculationInd(String volumeCalculationIndicator) {
        this.dimensionalVolumeCalculationInd = volumeCalculationIndicator;
    }

    public void setDimensionalVolumeUnit(VolumeUOMType dimensionalVolumeUnit) {
        this.dimensionalVolumeUnit = dimensionalVolumeUnit;
    }

    public void setDimensionalWeightOfShipment(
                BigDecimal dimensionalWeightOfShipment) {
        this.dimensionalWeightOfShipment = dimensionalWeightOfShipment;
    }

    public void setDiscrepancyExists(String discrepancyExists) {
        this.discrepancyExists = discrepancyExists;
    }

    public void setEarliestTravelDate(Date earliestTravelDate) {
		this.earliestTravelDate = earliestTravelDate;
	}

    public void setEarliestTravelDateTime(Date earliestTravelDate) {
        this.earliestTravelDate = earliestTravelDate;
    }



    public void setEuropeanCustomsOriginDetail(
                String europeanCustomsOriginDetail) {
        this.europeanCustomsOriginDetail = europeanCustomsOriginDetail;
    }

    public void setExportAccountReleaseDate(Date exportAccountReleaseDate) {
        this.exportAccountReleaseDate = exportAccountReleaseDate;
    }

    public void setExportAuditStatus(AuditStatusType exportAuditStatus) {
        this.exportAuditStatus = exportAuditStatus;
    }

    public void setExportBulkPiecesAccepted(long exportBulkPiecesAccepted) {
        this.exportBulkPiecesAccepted = exportBulkPiecesAccepted;
    }

    public void setExportBulkWeightAccepted(BigDecimal exportBulkWeightAccepted) {
        this.exportBulkWeightAccepted = exportBulkWeightAccepted;
    }

    public void setExportCountry(String exportCountry) {
        this.exportCountry = exportCountry;
    }

    public void setExportCustomsInd(boolean exportCustomsInd) {
        this.exportCustomsInd = exportCustomsInd;
    }

    public void setExportDeclarationNumber(String exportDeclarationNumber) {
        this.exportDeclarationNumber = exportDeclarationNumber;
    }

    public void setExportPaycode(AWBPaycodeType exportPaycode) {
        this.exportPaycode = exportPaycode;
    }

    public void setExportReportingDate(Date exportReportingDate) {
        this.exportReportingDate = exportReportingDate;
    }

    public void setExportReportingStation(String exportReportingStation) {
        this.exportReportingStation = exportReportingStation;
    }

    public void setFfrSriReferenceNumber(String ffrSriReferenceNumber) {
        this.ffrSriReferenceNumber = ffrSriReferenceNumber;
    }

    public void setFfrSriShipmentInfo1(String ffrSriShipmentInfo1) {
        this.ffrSriShipmentInfo1 = ffrSriShipmentInfo1;
    }

    public void setFfrSriShipmentInfo2(String ffrSriShipmentInfo2) {
        this.ffrSriShipmentInfo2 = ffrSriShipmentInfo2;
    }

    public void setFinalDispositionStatus(String finalDispositionStatus) {
        this.finalDispositionStatus = finalDispositionStatus;
    }

    public void setFinalDispositionStatusDateTime(Date finalDispositionStatusDateTime) {
        this.finalDispositionStatusDateTime = finalDispositionStatusDateTime;
    }

    public void setFirstAcceptanceDateTime(Date firstAcceptanceDateTime) {
        this.firstAcceptanceDateTime = firstAcceptanceDateTime;
    }

    public void setFsuDlvPieces(int fsuDlvPieces) {
        this.fsuDlvPieces = fsuDlvPieces;
    }

    public void setFsuRcfPieces(int fsuRcfPieces) {
        this.fsuRcfPieces = fsuRcfPieces;
    }

    public void setFsuRctPieces(int fsuRctPieces) {
        this.fsuRctPieces = fsuRctPieces;
    }

    public void setGovernmentTaxIndicator(String governmentTaxIndicator) {
        this.governmentTaxIndicator = governmentTaxIndicator;
    }

    public void setHawbConsolidationIndicator(String hawbConsolidationIndicator) {
        this.hawbConsolidationIndicator = hawbConsolidationIndicator;
    }

    public void setHawbValidatedIndicator(String hawbValidatedIndicator) {
        this.hawbValidatedIndicator = hawbValidatedIndicator;
    }

    public void setImportAccountReleaseDate(Date importAccountReleaseDate) {
        this.importAccountReleaseDate = importAccountReleaseDate;
    }

    public void setImportAuditStatus(AuditStatusType importAuditStatus) {
        this.importAuditStatus = importAuditStatus;
    }

    public void setImportClearanceNumber(String importClearanceNumber) {
        this.importClearanceNumber = importClearanceNumber;
    }

    public void setImportCustomsInd(boolean importCustomsInd) {
        this.importCustomsInd = importCustomsInd;
    }

    public void setImportCustomsStatus(String importCustomsStatus) {
        this.importCustomsStatus = importCustomsStatus;
    }

    public void setImportPaycode(AWBPaycodeType importPaycode) {
        this.importPaycode = importPaycode;
    }

    public void setImportPiecesCleared(int importPiecesCleared) {
        this.importPiecesCleared = importPiecesCleared;
    }

    public void setImportPiecesDelivered(int importPiecesDelivered) {
        this.importPiecesDelivered = importPiecesDelivered;
    }

    public void setImportReportingDate(Date importReportingDate) {
        this.importReportingDate = importReportingDate;
    }

    public void setImportReportingStation(String importReportingStation) {
        this.importReportingStation = importReportingStation;
    }

    public void setImportReportingStationPieces(int importReportingStationPieces) {
        this.importReportingStationPieces = importReportingStationPieces;
    }

    public void setInBondIndicator(String inBondIndicator) {
        this.inBondIndicator = inBondIndicator;
    }

    public void setInsuranceCode(String insuranceCode) {
        this.insuranceCode = insuranceCode;
    }

    public void setInsuranceValue(String insuranceValue) {
        this.insuranceValue = insuranceValue;
    }

    public void setInternationalAWBType(
                InternationalAWBType internationalAWBType) {
        this.internationalAWBType = internationalAWBType;
    }

    public void setInternationalType(String internationalType) {
		this.internationalType = internationalType;
	}

    public void setLastCheckinDate(Date lastCheckinDate) {
        this.lastCheckinDate = lastCheckinDate;
    }

    public void setLatestAcceptanceDateTime(Date latestAcceptanceDateTime) {
        this.latestAcceptanceDateTime = latestAcceptanceDateTime;
    }

    public void setLatestArrivalDateTime(Date latestArrivalDateTime) {
        this.latestArrivalDateTime = latestArrivalDateTime;
    }

    public void setNatureOfGoods(String natureOfGoods) {
        this.natureOfGoods = natureOfGoods;
    }

    public void setNorthAmericanIndicator(boolean northAmericanIndicator) {
        this.northAmericanIndicator = northAmericanIndicator;
    }

   public void setNotificationDateTime(Date notificationDateTime) {
    this.notificationDateTime = notificationDateTime;
}

    public void setOId(Long oId) {

        this.oId = oId;
    }

    public void setOriginatedAsFwb(boolean originatedAsFwb) {
	        this.originatedAsFwb = originatedAsFwb;
	    }

    public void setOriginCurrency(String originCurrency) {
        this.originCurrency = originCurrency;
    }

    public void setOriginIataRegion(String originIataRegion) {
        this.originIataRegion = originIataRegion;
    }

    public void setPadAttachmentsExist(String padAttachmentsExist) {
        this.padAttachmentsExist = padAttachmentsExist;
    }

    public void setPadFwbInfoExists(String padFwbInfoExists) {
        this.padFwbInfoExists = padFwbInfoExists;
    }

    public void setPadGeneralInfoExists(String padGeneralInfoExists) {
        this.padGeneralInfoExists = padGeneralInfoExists;
    }

    public void setPadHandlingInfoExists(String padHandlingInfoExists) {
        this.padHandlingInfoExists = padHandlingInfoExists;
    }

    public void setPadShipmentHandlingExists(String padShipmentHandlingExists) {
        this.padShipmentHandlingExists = padShipmentHandlingExists;
    }

    public void setPadTracingInfoExists(String padTracingInfoExists) {
        this.padTracingInfoExists = padTracingInfoExists;
    }

    public void setPaperAWBOverrideInd(boolean paperAWBOverrideInd) {
        this.paperAWBOverrideInd = paperAWBOverrideInd;
    }

    public void setParticipantNotification(String participantNotification) {
        this.participantNotification = participantNotification;
    }

    public void setPickupBillLadingNumber(String pickupBillLadingNumber) {
        this.pickupBillLadingNumber = pickupBillLadingNumber;
    }

    public void setPickupCostStatusInd(boolean pickupCostStatusInd) {
        this.pickupCostStatusInd = pickupCostStatusInd;
    }

    public void setPickupOrderDateTime(Date pickupOrderDateTime) {
        this.pickupOrderDateTime = pickupOrderDateTime;
    }

    public void setPlannedDeliveryDateTime(Date plannedDeliveryDateTime) {
        this.plannedDeliveryDateTime = plannedDeliveryDateTime;
    }

    public void setPlannedPickupDateTime(Date plannedPickupDateTime) {
        this.plannedPickupDateTime = plannedPickupDateTime;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setQualityAssuranceIndicator(String qualityAssuranceIndicator) {
        this.qualityAssuranceIndicator = qualityAssuranceIndicator;
    }

    public void setShedCode(String shedCode) {
        this.shedCode = shedCode;
    }

    public void setShipmentBookingIndicator(String shipmentBookingIndicator) {
        this.shipmentBookingIndicator = shipmentBookingIndicator;
    }

    public void setShipmentHandlingTotalPieces(
                long shipmentHandlingTotalPieces) {
        this.shipmentHandlingTotalPieces = shipmentHandlingTotalPieces;
    }

    public void setShipmentHandlingTotalVolume(
                BigDecimal shipmentHandlingTotalVolume) {
        this.shipmentHandlingTotalVolume = shipmentHandlingTotalVolume;
    }

    public void setShipmentHandlingTotalWeight(
                BigDecimal shipmentHandlingTotalWeight) {
        this.shipmentHandlingTotalWeight = shipmentHandlingTotalWeight;
    }

    public void setShipmentVolumeUnit(VolumeUOMType volumeUnit) {
        this.shipmentVolumeUnit = volumeUnit;
    }

    public void setShipmentWeightUnit(WeightUOMType weightUnit) {
        this.shipmentWeightUnit = weightUnit;
    }

    public void setShipperRemarks(String shipperRemarks) {
        this.shipperRemarks = shipperRemarks;
    }

    public void setStorageStartDate(Date storageStartDate) {
        this.storageStartDate = storageStartDate;
    }

    public void setSurfaceDestinationStation(String surfaceDestinationStation) {
        this.surfaceDestinationStation = surfaceDestinationStation;
    }

    public void setSurfaceOriginStation(String surfaceOriginStation) {
        this.surfaceOriginStation = surfaceOriginStation;
    }

    public void setTimeOfAvailabilityDateTime(Date timeOfAvailabilityDateTime) {
        this.timeOfAvailabilityDateTime = timeOfAvailabilityDateTime;
    }

    public void setTotalAcceptedPieces(int totalAcceptedPieces) {
        this.totalAcceptedPieces = totalAcceptedPieces;
    }
    
    public void setTotalAcceptedVolume(BigDecimal totalAcceptedVolume) {
        this.totalAcceptedVolume = totalAcceptedVolume;
    }

    public void setTotalAcceptedSluid(int totalAcceptedSluid) {
        this.totalAcceptedSluid = totalAcceptedSluid;
    }

    public void setTotalAcceptedSluidWeight(BigDecimal totalAcceptedSluidWeight) {
        this.totalAcceptedSluidWeight = totalAcceptedSluidWeight;
    }

    public void setTotalAcceptedWeight(BigDecimal totalAcceptedWeight) {
        this.totalAcceptedWeight = totalAcceptedWeight;
    }

    public void setTotalCollectDueAgent(BigDecimal totalCollectDueAgent) {
        this.totalCollectDueAgent = totalCollectDueAgent;
    }

    public void setTotalCollectDueCarrier(BigDecimal totalCollectDueCarrier) {
        this.totalCollectDueCarrier = totalCollectDueCarrier;
    }

    public void setTotalGrossWeightHawbs(BigDecimal totalGrossWeightHawbs) {
        this.totalGrossWeightHawbs = totalGrossWeightHawbs;
    }

    public void setTotalNbrOfPiecesInHawbs(long totalNbrOfPiecesInHawbs) {
        this.totalNbrOfPiecesInHawbs = totalNbrOfPiecesInHawbs;
    }

    public void setTotalPieces(long totalPieces) {
        this.totalPieces = totalPieces;
    }

    public void setTotalPrepaidDueAgent(BigDecimal totalPrepaidDueAgent) {
        this.totalPrepaidDueAgent = totalPrepaidDueAgent;
    }

    public void setTotalPrepaidDueCarrier(BigDecimal totalPrepaidDueCarrier) {
        this.totalPrepaidDueCarrier = totalPrepaidDueCarrier;
    }

    public void setTotalVolume(BigDecimal totalVolume) {
        this.totalVolume = totalVolume;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    public void setTraderNumber(String traderNumber) {
        this.traderNumber = traderNumber;
    }

    public void setTransitCountry(String transitCountry) {
        this.transitCountry = transitCountry;
    }

    public void setTransitCustomsInd(boolean transitCustomsInd) {
        this.transitCustomsInd = transitCustomsInd;
    }

	public void setTransitDeclarationNumber(String transitDeclarationNumber) {
        this.transitDeclarationNumber = transitDeclarationNumber;
    }

	public void setUnNumbers(String unNumbers) {
        this.unNumbers = unNumbers;
    }

	public boolean iseAwbInd() {
		return eAwbInd;
	}

	public void seteAwbInd(boolean eAwbInd) {
		this.eAwbInd = eAwbInd;
	}

    /**
     * @return the eawbStatus
     */
    public EawbStatusType getEawbStatus() {
        return eawbStatus;
    }

    public AwbRoutingIndType getAwbRoutingInd() {
        return awbRoutingInd;
    }

    public void setAwbRoutingInd(AwbRoutingIndType awbRoutingInd) {
        this.awbRoutingInd = awbRoutingInd;
    }
    public int getAwbExecutionDate() {
		return awbExecutionDate;
	}
	public void setAwbExecutionDate(int awbExecutionDate) {
		this.awbExecutionDate = awbExecutionDate;
	}
}
