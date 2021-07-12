package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.constants.AWBPaycodeType;
import com.unisys.trans.logistics.lms.framework.constants.AirWaybillSourceType;
import com.unisys.trans.logistics.lms.framework.constants.AirWaybillType;
import com.unisys.trans.logistics.lms.framework.constants.ChannelType;
import com.unisys.trans.logistics.lms.framework.constants.ParticipantCodeType;
import com.unisys.trans.logistics.lms.framework.constants.RateGenerationType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>OrderDto</code> entity contains specific data applicable to the
 * Preferences related to AirWaybill.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>agent</li>
 * <li>airlineCodeNbr</li>
 * <li>airWaybillCreationSourceType</li>
 * <li>airWaybillType</li>
 * <li>airWaybillUpdationChannelType</li>
 * <li>airWaybillUpdationSourceType</li>
 * <li>alertCodeColor</li>
 * <li>awbLockedInd</li>
 * <li>awbLockStation</li>
 * <li>awbRemarksDtos</li>
 * <li>awbTotalCol</li>
 * <li>awbTotalPpd</li>
 * <li>bank</li>
 * <li>billToConsignee</li>
 * <li>billToShipper</li>
 * <li>broker</li>
 * <li>chargeableWeightA</li>
 * <li>chargeableWeightF</li>
 * <li>chargeableWeightP</li>
 * <li>codeRedIndicator</li>
 * <li>consignee</li>
 * <li>createdDate</li>
 * <li>crossReference1</li>
 * <li>crossReference2</li>
 * <li>customerType</li>
 * <li>customsLocation</li>
 * <li>customsValue</li>
 * <li>declaredValue</li>
 * <li>deliveryDateTime</li>
 * <li>deliveryDriverEmail</li>
 * <li>deliveryDriverName</li>
 * <li>deliveryDriverPhoneNumber</li>
 * <li>deliveryOperator</li>
 * <li>description</li>
 * <li>destCustomsStation</li>
 * <li>destination</li>
 * <li>destinationCurrency</li>
 * <li>dimensionalWeightOfShipment</li>
 * <li>discrepancyExists</li>
 * <li>displayTotalColCharges</li>
 * <li>displayTotalPpdCharges</li>
 * <li>eAwbInd</li>
 * <li>exchangeRate</li>
 * <li>executionDate</li>
 * <li>exportAuditStatus</li>
 * <li>exportDeclarationNumber</li>
 * <li>exportPaycode</li>
 * <li>exportReportingDate</li>
 * <li>exportReportingStn</li>
 * <li>exportReportingWeight</li>
 * <li>forwarder</li>
 * <li>foundIndicator</li>
 * <li>grossWeight</li>
 * <li>identifier</li>
 * <li>importAuditStatus</li>
 * <li>importPaycode</li>
 * <li>importReportingDate</li>
 * <li>importReportingStn</li>
 * <li>internationalAWBType</li>
 * <li>lastDocumentStatus</li>
 * <li>latestAcceptanceTime</li>
 * <li>manufacturer</li>
 * <li>neverFoundIndicator</li>
 * <li>notify</li>
 * <li>oId</li>
 * <li>orderAcceptedDate</li>
 * <li>orderAcceptedInd</li>
 * <li>orderCompletedDate</li>
 * <li>orderCompleteInd</li>
 * <li>orderExecutedDate</li>
 * <li>orderExecutedInd</li>
 * <li>orderExportedDate</li>
 * <li>orderExportedInd</li>
 * <li>orderImportedDate</li>
 * <li>orderImportedInd</li>
 * <li>origin</li>
 * <li>originCurrency</li>
 * <li>padType</li>
 * <li>paperAWBOverrideInd</li>
 * <li>pickupDateTime</li>
 * <li>pickupDriverEmail</li>
 * <li>pickupDriverName</li>
 * <li>pickupDriverPhoneNumber</li>
 * <li>pickUpLocation</li>
 * <li>pickUpOperator</li>
 * <li>preOrderDate</li>
 * <li>preOrderInd</li>
 * <li>pricingDate</li>
 * <li>printableTotalColCharges</li>
 * <li>printableTotalPpdCharges</li>
 * <li>priority</li>
 * <li>productCode</li>
 * <li>qualityAssuranceIndicator</li>
 * <li>rateClassTypeA</li>
 * <li>rateClassTypeF</li>
 * <li>rateClassTypeP</li>
 * <li>rateF</li>
 * <li>rateGenerationTypeA</li>
 * <li>rateGenerationTypeF</li>
 * <li>rateGenerationTypeP</li>
 * <li>ratePieces</li>
 * <li>shipmentReference</li>
 * <li>shipper</li>
 * <li>specialHandlingCodes</li>
 * <li>splCodes</li>
 * <li>status</li>
 * <li>surfaceDestination</li>
 * <li>surfaceDestinationStation</li>
 * <li>surfaceOriginStation</li>
 * <li>totalAcceptedPiecesAtER</li>
 * <li>totalHawbGrossWeight</li>
 * <li>totalHawbPieces</li>
 * <li>totalPieces</li>
 * <li>totalReceivedPiecesAtIR</li>
 * <li>totalVolume</li>
 * <li>totalWeight</li>
 * <li>trackAndTraceIndicator</li>
 * <li>transfer</li>
 * <li>w_Subcontractor</li>
 * </code>
 * </ul>
 */
public class AWBIATARulesDto extends PersistenceObjectDto {

    /**
     * Unique Serial version UID.
     */
    private static final long serialVersionUID = -2794574840954780403L;

    /**
     * Attribute to hold the <code>acceptedPieces</code> property.
     * 
     */
    private Long acceptedPieces;
    
    private Long revenueOid;
    
    public String getWorkOrderNumber() {
        return workOrderNumber;
    }

    public void setWorkOrderNumber(String workOrderNumber) {
        this.workOrderNumber = workOrderNumber;
    }

    private String workOrderNumber;

    /**
     * Attribute to hold the <code>accountingRemarks</code> property.
     * 
     */
    private String accountingRemarks;

	/**
	 * Attribute to hold the <code>actualRateQueueInd</code> property.
	 * 
	 */
    private boolean actualRateQueueInd;

    /**
     * Attribute to hold the <code>agent</code> property.
     * 
     */
    private CustomerDto agent;

    /**
     * Attribute to hold the <code>airlineCodeNbr</code> property.
     * 
     */
    private String airlineCodeNbr;

    /**
     * Attribute to hold the <code>airWaybillCreationChannelType</code> property.
     * 
     */
    private ChannelType airWaybillCreationChannelType;
    
    /**
     * Attribute to hold the <code>airWaybillCreationSourceType</code> property.
     * 
     */
    private AirWaybillSourceType airWaybillCreationSourceType;

    /**
     * Attribute to hold the <code>airWaybillType</code> property.
     */
    private AirWaybillType airWaybillType;

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
     * Attribute to hold the <code>alertCodeColor</code> property.
     */
    private String alertCodeColor;

	/**
	 * Attribute to hold the <code>awbDetailOid</code> property.
	 */
    private Long awbDetailOid;

	/**
	 * Attribute to hold the <code>hAWBValidate</code> property.
	 */
	private boolean hAWBValidate;

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
     * attribute to hold the property of awbLockStation.
     */
    private String awbLockStation;

    /**
     * Attribute to hold <code>awbTotalPpd</code> property.
     */
    private boolean awbQueued;

    /**
     * Attribute to hold <code>awbTotalCol</code> property.
     */
    private BigDecimal awbTotalCol;

    /**
     * Attribute to hold <code>awbTotalPpd</code> property.
     */
    private BigDecimal awbTotalPpd;

    /**
     * Attribute to hold <code>bank</code> property.
     */
    private CustomerDto bank;

    /**
     * Attribute to hold <code>billToConsignee</code> property.
     */
    private CustomerDto billToConsignee;

    /**
     * Attribute to hold <code>billToShipper</code> property.
     */
    private CustomerDto billToShipper;

    /**
     * Attribute to hold <code>bookingConf</code> property.
     */
    private boolean bookingConf;

    /**
     * Attribute to hold <code>bookingDeletionInd</code> property.
     */
    private boolean bookingDeletionInd;
    
    /**
     * Attribute to holds <code>bookingExistsInd</code> property.
     */
    private boolean bookingExistsInd;

    /**
     * Attribute to hold <code>broker</code> property.
     */
    private CustomerDto broker;

    /**
     * Attribute to hold <code>chargeableWeight</code> property.
     */

    private BigDecimal chargeableWeightA;

    /**
     * Attribute to hold <code>chargeableWeight</code> property.
     */
    private BigDecimal chargeableWeightF;

    /**
     * Attribute to hold <code>chargeableWeight</code> property.
     */
    private BigDecimal chargeableWeightP;

    /**
     * Attribute to hold <code>checkedInPieces</code> property.
     */

    private Long checkedInPieces;

    /**
     * Attribute to hold the <code>codeRedIndicator</code> property.
     */
    private String codeRedIndicator;

	/**
	 * Attribute to hold the <code>collectChargesRestrictionAuthority</code>
	 * property.
	 */
    private boolean collectChargesRestrictionAuthority;

    /**
     * Attribute to hold <code>collectChargesRestrictionInd</code> property.
     * 
     */
    private String collectChargesRestrictionInd;

    /**
     * Attribute to hold the <code>consignee</code> property.
     */
    private CustomerDto consignee;

    /**
     * Attribute to hold the <code>createdDate</code> property.
     */
    private Date createdDate;

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
     * Attribute to hold the <code>customerType</code> property.
     */
    private ParticipantCodeType customerType;

	/**
     * Attribute to hold the <code>customsLocation</code> property.
     */
    private CustomerDto customsLocation;

    /**
     * Attribute to holds <code>customsValue</code> property.
     */
    private String customsValue;

    /**
     * Attribute to holds <code>declaredValue</code> property.
     */
    private String declaredValue;

    /**
     * Attribute to holds <code>deliveryDateTime</code> property.
     */
    private Date deliveryDateTime;

    /**
     * Attribute to hold <code>email</code> property.
     */
    private String deliveryDriverEmail;

    /**
     * Attribute to hold <code>driverName</code> property.
     */
    private String deliveryDriverName;

    /**
     * Attribute to hold <code>phoneNumber</code> property.
     */
    private String deliveryDriverPhoneNumber;

    /**
     * Attribute to hold <code>deliveryOperator</code> property.
     */
    private CustomerDto deliveryOperator;

    /**
     * Attribute to hold <code>description</code> property.
     */
    private String description;

    /**
     * Attribute to hold the <code>destCustomsStation</code> property.
     */
    private String destCustomsStation;

    /**
     * Attribute to hold the <code>destination</code> property.
     */
    private String destination;

    /**
     * Attribute to hold <code>destinationCurrency</code> property.
     */
    private String destinationCurrency;
    
    private Long totalDestinationPieces;
    
    /**
     * Attribute to hold the <code> originatedAsFwb</code> property.
     */

    private boolean originatedAsFwb;

    public Long getTotalDestinationPieces() {
		return this.totalDestinationPieces;
	}

	public void setTotalDestinationPieces(final Long pTotalDestinationPieces) {
		this.totalDestinationPieces = pTotalDestinationPieces;
	}

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
     * Attribute to hold <code>displayTotalColCharges</code> property.
     */
    private BigDecimal displayTotalColCharges;

    /**
     * Attribute to hold <code>displayTotalPpdCharges</code> property.
     */
    private BigDecimal displayTotalPpdCharges;

    /**
     * Attribute to hold the <code>documentRemarks</code> property.
     * 
     */
    private String documentRemarks;

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
    private String eAwbInd;

    /**
     * Attribute to holds <code>ecaCompletedFlag</code> property.
     */
    private boolean ecaCompletedFlag;

    /**
     * Attribute to hold <code>euCustomStatusCode</code> property.
     */
    private String euCustomStatusCode;

    /**
     * Attribute to hold the <code>exchangeRate</code> property.
     */

    private BigDecimal exchangeRate;

    /**
     * Attribute to holds <code>executionDate</code> property.
     */
    private Date executionDate;

    /**
     * Attribute to hold the <code>exportAuditStatus</code> property.
     */
    private String exportAuditStatus;

    /**
     * Attribute to hold the <code>exportDeclarationNumber</code> property.
     */

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
     * Attribute to holds <code>exportReportingStn</code> property.
     */
    private String exportReportingStn;

    /**
     * Attribute to holds <code>exportReportingWeight</code> property.
     */
    private Long exportReportingWeight;

    /**
     * Attribute to holds <code>forwarder</code> property.
     */
    private CustomerDto forwarder;

    /**
     * Attribute to hold the <code> foundIndicator</code> property.
     */
    private String foundIndicator;

	/**
	 * Attribute to hold the <code> fsuRcsPieces</code> property.
	 */
    private Integer fsuRcsPieces;

    /**
     * Attribute to hold <code>grossWeight</code> property.
     */
    private BigDecimal grossWeight;

    /**
     * Attribute to hold the <code>handlingRemarks</code> property.
     * 
     */
    private String handlingRemarks;

	/**
	 * Attribute to hold the <code>houseAssociationComplete</code> property.
	 */
    private String houseAssociationComplete;

	/**
	 * Attribute to hold the <code>houseShipDiscQueueInd</code> property.
	 */
    private boolean houseShipDiscQueueInd;

    /**
     * Attribute to hold the <code>identifier</code> property.
     */
    private String identifier;

    /**
     * Attribute to hold the <code>importAuditStatus</code> property.
     */

    private String importAuditStatus;

    /**
     * Attribute to hold the <code>importCustomsStatus</code> property.
     * 
     */
    private String importCustomsStatus;

    /**
     * Attribute to holds <code>importPayCode</code> property. IR Paycode
     */
    private AWBPaycodeType importPaycode;

    /**
     * Attribute to holds <code>importReportingDate</code> property.
     */
    private Date importReportingDate;

    /**
     * Attribute to holds <code>importReportingStn</code> property.
     */
    private String importReportingStn;

    /**
     * Attribute to hold the <code>inBondIndicator</code> property.
     * 
     */
    private String inBondIndicator;

	/**
	 * Attribute to hold the <code>awbPiecesImportCleared</code> property.
	 * 
	 */
	private Integer awbPiecesImportCleared;
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
    private String internationalAWBType;

    /**
     * Attribute to hold the <code>lastDocumentStatus</code> property.
     */
    private String lastDocumentStatus;

    /**
     * Attribute to hold the <code>latestAcceptanceTime</code> property.
     */
    private Date latestAcceptanceTime;

	/**
	 * Attribute to hold the <code>latestAcceptanceTime</code> property.
	 */
	private Date storageChargesStartDate;

	/**
	 * Attribute to hold the <code>latestAcceptanceTime</code> property.
	 */
	private Date timeOfAvailability;

    /**
     * Attribute to hold the <code>manufacturer</code> property.
     */
    private CustomerDto manufacturer;

	/**
	 * Attribute to hold the <code>messageRequest</code> property.
	 */
    private boolean messageRequest;

    /**
     * Attribute to hold the <code>modOverRideIndicator</code> property.
     */
    private String modOverRideIndicator;

    /**
     * Attribute to hold the <code>neverFoundIndicator</code> property.
     */
    private String neverFoundIndicator;

    /**
     * Attribute to hold the <code>notify</code> property.
     */
    private CustomerDto notify;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to holds <code>orderAcceptedDate</code> property.
     */
    private Date orderAcceptedDate;

    /**
     * Attribute to holds <code>orderAcceptedInd</code> property.
     */
    private boolean orderAcceptedInd;

    /**
     * Attribute to holds <code>orderCompletedDate</code> property.
     */
    private Date orderCompletedDate;

    /**
     * Attribute to holds <code>orderCompleteInd</code> property.
     */
    private boolean orderCompleteInd;

    /**
     * Attribute to holds <code>orderExecutedDate</code> property.
     */
    private Date orderExecutedDate;

    /**
     * Attribute to holds <code>orderExecutedInd</code> property.
     */
    private boolean orderExecutedInd;

    /**
     * Attribute to holds <code>orderExportedDate</code> property.
     */
    private Date orderExportedDate;

    /**
     * Attribute to holds <code>orderExportedInd</code> property.
     */
    private boolean orderExportedInd;

    /**
     * Attribute to holds <code>orderImportedDate</code> property.
     */
    private Date orderImportedDate;

    /**
     * Attribute to holds <code>orderImportedInd</code> property.
     */
    private boolean orderImportedInd;

    /**
     * Attribute to hold the <code> origin</code> property.
     */
    private String origin;

    /**
     * Attribute to holds <code>originCurrency</code> property.
     */
    private String originCurrency;

	/**
	 * Attribute to holds <code>otherChargeCode</code> property.
	 */
    private String otherChargeCode;

    /**
     * Attribute to hold the <code>overrideCode</code> property.
     * 
     */
    private String overrideCode;

    /**
     * Attribute to hold the <code> padType</code> property.
     */
    private String padType;

    /**
     * Attribute to holds <code>paperAWBOverrideInd</code> property.
     */
    private boolean paperAWBOverrideInd;

    /**
     * Attribute to holds List of<code>participantTypes</code> property.
     */
    private List<ParticipantCodeType> participantTypes;

    /**
     * Attribute to holds <code>pickupDateTime</code> property.
     */
    private Date pickupDateTime;

    /**
     * Attribute to hold <code>email</code> property.
     */
    private String pickupDriverEmail;

    /**
     * Attribute to hold <code>driverName</code> property.
     */
    private String pickupDriverName;

    /**
     * Attribute to hold <code>phoneNumber</code> property.
     */
    private String pickupDriverPhoneNumber;

    /**
     * Attribute to hold <code>pickUpLocation</code> property.
     */
    private CustomerDto pickUpLocation;

    /**
     * Attribute to hold <code>pickUpOperator</code> property.
     */
    private CustomerDto pickUpOperator;

    /**
     * Attribute to holds <code>preOrderDate</code> property.
     */
    private Date preOrderDate;

    /**
     * Attribute to holds <code>preOrderInd</code> property.
     */
    private boolean preOrderInd;

    /**
     * Attribute to holds <code>pricingDate</code> property.
     */
    private Date pricingDate;

    /**
     * Attribute to hold <code>printableTotalColCharges</code> property.
     */
    private BigDecimal printableTotalColCharges;

    /**
     * Attribute to hold <code>printableTotalPpdCharges</code> property.
     */
    private BigDecimal printableTotalPpdCharges;

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
     * Attribute to hold the <code>productCode</code> property.
     */
    private String productCode;

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
     * Attribute to hold the <code>rateA</code> property.
     */
    private BigDecimal rateA;


    /**
     * Attribute to hold <code>rateF</code> property.
     */

    private BigDecimal rateF;

    /**
     * Attribute to hold the <code>rateFace</code> property.
     */
    private BigDecimal rateFace;

    /**
     * Attribute to hold <code>rateGenerationType</code> property.
     */
    private RateGenerationType rateGenerationTypeA;

    /**
     * Attribute to hold <code>rateGenerationType</code> property.
     */
    private RateGenerationType rateGenerationTypeF;

    /**
     * Attribute to hold <code>rateGenerationType</code> property.
     */
    private RateGenerationType rateGenerationTypeP;

    /**
     * Attribute to hold the <code>rateP</code> property.
     */
    private BigDecimal rateP;

    /**
     * Attribute to hold <code>ratePieces</code> property.
     */
    private Integer ratePieces;

    /**
     * Attribute to hold <code>routing</code> property.
     */
    private String routing;

    /**
     * Attribute to hold the <code>shipmentReference</code> property.
     */
    private String shipmentReference;

    /**
     * Attribute to hold the <code>shipmentStatus</code> property.
     */
    private String shipmentStatus;

    /**
     * Attribute to hold the <code>rowIndex</code> property.
     */
    private CustomerDto shipper;

    /**
     * Attribute to hold the <code>shipperConsigneeExists</code> property.
     */

    private boolean shipperConsigneeExists;

    /**
     * Attribute to hold the <code>specialHandlingCodes</code> property.
     */
    private List<String> specialHandlingCodes;
    
    /**
     * Attribute to hold the <code>comatProductcodes</code> property.
     */
    private List<String> comatProductcodes;  

	/**
     * Attribute to hold the <code>splCodes</code> property.
     */
    private String splCodes;

    /**
     * Attribute to hold the <code>status</code> property.
     */
    private String status;

    /**
     * Attribute to hold the <code>statusDate</code> property.
     * 
     */
    private Date statusDate;

    /**
     * Attribute to hold the <code>surfaceDestination</code> property.
     */
    private CustomerDto surfaceDestination;

    /**
     * Attribute to holds <code>surfaceDestinationStation</code> property.
     */
    private String surfaceDestinationStation;

    /**
     * Attribute to holds <code>surfaceOrigin</code> property.
     */
    private CustomerDto surfaceOrigin;

    /**
     * Attribute to holds <code>surfaceOriginStation</code> property.
     */
    private String surfaceOriginStation;

	/**
	 * Attribute to holds <code>terminalDiscrepancyQueueInd</code> property.
	 */
    private boolean terminalDiscrepancyQueueInd;

	/**
	 * Attribute to holds <code>totalAcceptedPieces</code> property.
	 */
    private Long totalAcceptedPieces;

    /**
     * Attribute to holds <code>totalAcceptedPiecesAtER</code> property.
     */
    private Long totalAcceptedPiecesAtER;

	/**
	 * Attribute to holds <code>totalAcceptedVolume</code> property.
	 */
    private BigDecimal totalAcceptedVolume;

	/**
	 * Attribute to holds <code>totalAcceptedWeight</code> property.
	 */
    private BigDecimal totalAcceptedWeight;

    /**
     * Attribute to holds <code>totalExecutedPieces</code> property.
     */
    private Long totalExecutedPieces;

    /**
     * Attribute to hold the <code> userIdentifier</code> property.
     */
    private BigDecimal totalHawbGrossWeight;

    /**
     * Attribute to hold the <code>totalHawbPieces</code> property.
     */
    private Long totalHawbPieces;

    /**
     * Total pieces registered via data capture (ESI, EGI, GAC, FFM) SDC Pieces.
     * - FIXPCS
     * 
     * SDCTotals (Data Capture Pieces)
     */
    private Long totalPieces;

    /**
     * Attribute to holds <code>totalReceivedPiecesAtIR</code> property.
     */
    private Long totalReceivedPiecesAtIR;

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
     * Attribute to hold the <code>trackAndTraceIndicator</code> property.
     */
    private String trackAndTraceIndicator;

    /**
     * Attribute to hold the <code>transfer</code> property.
     */
    private String transfer;

    /**
     * Attribute to hold the <code>w_Subcontractor</code> property.
     */
	private CustomerDto w_Subcontractor;

	/**
	 * Attribute to hold the <code>workOrderItemStatus</code> property.
	 */
	private String workOrderItemStatus;

	/**
	 * Attribute to hold the <code>workOrderStatus</code> property.
	 */
	private String workOrderStatus;

	/**
	 * Attribute to hold the <code>workOrderTarget</code> property.
	 */
	private String workOrderTarget;

	/**
	 * Attribute to hold the <code>workOrderTargetLocation</code> property.
	 */
	private String workOrderTargetLocation;

	/**
	 * Attribute to hold the <code>workOrderType</code> property.
	 */
	private String workOrderType;

	/**
	 * Attribute to hold the <code>participantNotifyIndicator</code> property.
	 */
	private String participantNotifyIndicator;

	/**
	 * Attribute to hold the <code>transitCustomIndicator</code> property.
	 */
	private boolean transitCustomIndicator;

	/**
	 * Attribute to hold the <code>houseAssociationComplete</code> property.
	 */
	private String piecesMismatch;

	/**
	 * Attribute to hold the <code>houseAssociationComplete</code> property.
	 */
	private String weightMismatch;
	
	/**
	 * Attribute to hold the <code>houseConsolidationIndicator</code> property.
	 */
	private String houseConsolidationIndicator;
	
	private List<RatingLineRulesDto> ratingLineRulesDtos;

    /**
     * Get the <code>acceptedPieces</code>
     * 
     * @return the current value of the <code>acceptedPieces</code> property.
     */
    public Long getAcceptedPieces() {
        return acceptedPieces;
    }

    /**
     * Get the <code>surfaceDestinationStation</code>
     * 
     * @return the current value of the <code>surfaceDestinationStation</code> property.
     */
    public String getAccountingRemarks() {
        return accountingRemarks;
    }
    
    /**
     * Get the <code>agent</code>
     * 
     * @return the current value of the <code>agent</code> property.
     */
    public CustomerDto getAgent() {
        return agent;
    }

    /**
     * Get the <code>airlineCodeNbr</code>
     * 
     * @return the current value of the <code>airlineCodeNbr</code> property.
     */
    public String getAirlineCodeNbr() {
        return airlineCodeNbr;
    }

    /**
     * Get the <code>airWaybillCreationChannelType</code>
     * 
     * @return the current value of the <code>airWaybillCreationChannelType</code> property.
     */
    public ChannelType getAirWaybillCreationChannelType() {
        return airWaybillCreationChannelType;
    }

    /**
     * Get the <code>airWaybillCreationSourceType</code>
     * 
     * @return the current value of the <code>airWaybillCreationSourceType</code> property.
     */
    public AirWaybillSourceType getAirWaybillCreationSourceType() {
        return airWaybillCreationSourceType;
    }

    /**
     * Get the <code>airWaybillType</code>
     * 
     * @return the current value of the <code>airWaybillType</code> property.
     */
    public AirWaybillType getAirWaybillType() {
        return airWaybillType;
    }

    /**
     * Get the <code>airWaybillUpdationChannelType</code>
     * 
     * @return the current value of the <code>airWaybillUpdationChannelType</code> property.
     */
    public ChannelType getAirWaybillUpdationChannelType() {
        return airWaybillUpdationChannelType;
    }

    /**
     * Get the <code>airWaybillUpdationSourceType</code>
     * 
     * @return the current value of the <code>airWaybillUpdationSourceType</code> property.
     */
    public AirWaybillSourceType getAirWaybillUpdationSourceType() {
        return airWaybillUpdationSourceType;
    }

    /**
     * Get the <code>alertCodeColor</code>
     * 
     * @return the current value of the <code>alertCodeColor</code> property.
     */
    public String getAlertCodeColor() {
        return alertCodeColor;
    }

	/**
	 * Get the <code>awbDetailOid</code>
	 * 
	 * @return the current value of the <code>awbDetailOid</code> property.
	 */
	public Long getAwbDetailOid() {
		return this.awbDetailOid;
	}

    /**
     * Get the <code>awbLockedInd</code>
     * 
     * @return the current value of the <code>awbLockedInd</code> property.
     */
    public String getAwbLockedInd() {
        return awbLockedInd;
    }

    /**
     * Get the <code>awbLockStation</code>
     * 
     * @return the current value of the <code>awbLockStation</code> property.
     */
    public String getAwbLockStation() {
        return awbLockStation;
    }

    /**
     * Get the <code>awbTotalCol</code>
     * 
     * @return the current value of the <code>awbTotalCol</code> property.
     */
    public BigDecimal getAwbTotalCol() {
        return awbTotalCol;
    }

    /**
     * Get the <code>awbTotalPpd</code>
     * 
     * @return the current value of the <code>awbTotalPpd</code> property.
     */
    public BigDecimal getAwbTotalPpd() {
        return awbTotalPpd;
    }

    /**
     * Get the <code>bank</code>
     * 
     * @return the current value of the <code>bank</code> property.
     */
    public CustomerDto getBank() {
        return bank;
    }

    /**
     * Get the <code>billToConsignee</code>
     * 
     * @return the current value of the <code>billToConsignee</code> property.
     */
    public CustomerDto getBillToConsignee() {
        return billToConsignee;
    }

    /**
     * Get the <code>billToShipper</code>
     * 
     * @return the current value of the <code>billToShipper</code> property.
     */
    public CustomerDto getBillToShipper() {
        return billToShipper;
    }

    /**
     * Get the <code>broker</code>
     * 
     * @return the current value of the <code>broker</code> property.
     */
    public CustomerDto getBroker() {
        return broker;
    }

    /**
     * Get the <code>awbTochargeableWeightAtalCol</code>
     * 
     * @return the current value of the <code>chargeableWeightA</code> property.
     */
    public BigDecimal getChargeableWeightA() {
        return chargeableWeightA;
    }

    /**
     * Get the <code>chargeableWeightF</code>
     * 
     * @return the current value of the <code>chargeableWeightF</code> property.
     */
    public BigDecimal getChargeableWeightF() {
        return chargeableWeightF;
    }

    /**
     * Get the <code>chargeableWeightP</code>
     * 
     * @return the current value of the <code>chargeableWeightP</code> property.
     */
    public BigDecimal getChargeableWeightP() {
        return chargeableWeightP;
    }

    /**
     * Get the <code>checkedInPieces</code>
     * 
     * @return the current value of the <code>checkedInPieces</code> property.
     */
    public Long getCheckedInPieces() {
        return checkedInPieces;
    }

    /**
     * Get the <code>codeRedIndicator</code>
     * 
     * @return the current value of the <code>codeRedIndicator</code> property.
     */
    public String getCodeRedIndicator() {
        return codeRedIndicator;
    }

    public String getCollectChargesRestrictionInd() {
        return collectChargesRestrictionInd;
    }

    /**
     * Get the <code>consignee</code>
     * 
     * @return the current value of the <code>consignee</code> property.
     */
    public CustomerDto getConsignee() {
        return consignee;
    }

    /**
     * Get the <code>createdDate</code>
     * 
     * @return the current value of the <code>createdDate</code> property.
     */
    public Date getCreatedDate() {
        if(createdDate!=null){
            return (Date)createdDate.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Get the <code>crossReference1</code>
     * 
     * @return the current value of the <code>crossReference1</code> property.
     */
    public String getCrossReference1() {
        return crossReference1;
    }

    /**
     * Get the <code>crossReference2</code>
     * 
     * @return the current value of the <code>crossReference2</code> property.
     */
    public String getCrossReference2() {
        return crossReference2;
    }

    /**
     * Gets the <code>CrossReferenceIndicator1</code> injected by the Inversion
     * of Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>CrossReferenceIndicator1</code> property.
     */
    public String getCrossReferenceIndicator1() {
        return crossReferenceIndicator1;
    }

    /**
     * Gets the <code>CrossReferenceIndicator2</code> injected by the Inversion
     * of Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>CrossReferenceIndicator2</code> property.
     */
    public String getCrossReferenceIndicator2() {
        return crossReferenceIndicator2;
    }

    public String getCruQueueInd() {
		return this.cruQueueInd;
	}

    /**
     * Get the <code>customerType</code>
     * 
     * @return the current value of the <code>customerType</code> property.
     */
    public ParticipantCodeType getCustomerType() {
        return customerType;
    }

    /**
     * Get the <code>customsLocation</code>
     * 
     * @return the current value of the <code>customsLocation</code> property.
     */
    public CustomerDto getCustomsLocation() {
        return customsLocation;
    }

    /**
     * Get the <code>customsValue</code>
     * 
     * @return the current value of the <code>customsValue</code> property.
     */
    public String getCustomsValue() {
        return customsValue;
    }

    /**
     * Get the <code>declaredValue</code>
     * 
     * @return the current value of the <code>declaredValue</code> property.
     */
    public String getDeclaredValue() {
        return declaredValue;
    }

    /**
     * Get the <code>deliveryDateTime</code>
     * 
     * @return the current value of the <code>deliveryDateTime</code> property.
     */
    public Date getDeliveryDateTime() {
        if(deliveryDateTime!=null){
            return (Date)deliveryDateTime.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Get the <code>deliveryDriverEmail</code>
     * 
     * @return the current value of the <code>deliveryDriverEmail</code> property.
     */
    public String getDeliveryDriverEmail() {
        return deliveryDriverEmail;
    }

    /**
     * Get the <code>deliveryDriverName</code>
     * 
     * @return the current value of the <code>deliveryDriverName</code> property.
     */
    public String getDeliveryDriverName() {
        return deliveryDriverName;
    }

    /**
     * Get the <code>deliveryDriverPhoneNumber</code>
     * 
     * @return the current value of the <code>deliveryDriverPhoneNumber</code> property.
     */
    public String getDeliveryDriverPhoneNumber() {
        return deliveryDriverPhoneNumber;
    }

    /**
     * Get the <code>deliveryOperator</code>
     * 
     * @return the current value of the <code>deliveryOperator</code> property.
     */
    public CustomerDto getDeliveryOperator() {
        return deliveryOperator;
    }

    /**
     * Get the <code>description</code>
     * 
     * @return the current value of the <code>description</code> property.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get the <code>destCustomsStation</code>
     * 
     * @return the current value of the <code>destCustomsStation</code> property.
     */
    public String getDestCustomsStation() {
        return destCustomsStation;
    }

    /**
     * Get the <code>destination</code>
     * 
     * @return the current value of the <code>destination</code> property.
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Get the <code>destinationCurrency</code>
     * 
     * @return the current value of the <code>destinationCurrency</code> property.
     */
    public String getDestinationCurrency() {
        return destinationCurrency;
    }

    /**
     * Get the <code>dimensionalWeightOfShipment</code>
     * 
     * @return the current value of the <code>dimensionalWeightOfShipment</code> property.
     */
    public BigDecimal getDimensionalWeightOfShipment() {
        return dimensionalWeightOfShipment;
    }

    /**
     * Get the <code>discrepancyExists</code>
     * 
     * @return the current value of the <code>discrepancyExists</code> property.
     */
    public String getDiscrepancyExists() {
        return discrepancyExists;
    }

    /**
     * Get the <code>destCustomsStation</code>
     * 
     * @return the current value of the <code>destCustomsStation</code> property.
     */
    public BigDecimal getDisplayTotalColCharges() {
        return displayTotalColCharges;
    }

    /**
     * Get the <code>displayTotalPpdCharges</code>
     * 
     * @return the current value of the <code>displayTotalPpdCharges</code> property.
     */
    public BigDecimal getDisplayTotalPpdCharges() {
        return displayTotalPpdCharges;
    }

    /**
     * Get the <code>documentRemarks</code>
     * 
     * @return the current value of the <code>documentRemarks</code> property.
     */
    public String getDocumentRemarks() {
        return documentRemarks;
    }

    /**
     * Get the <code>eAwbInd</code>
     * 
     * @return the current value of the <code>eAwbInd</code> property.
     */
    public String geteAwbInd() {
        return eAwbInd;
    }

    /**
     * Get the <code>euCustomStatusCode</code>
     * 
     * @return the current value of the <code>euCustomStatusCode</code> property.
     */
    public String getEuCustomStatusCode() {
        return euCustomStatusCode;
    }

    /**
     * Get the <code>exchangeRate</code>
     * 
     * @return the current value of the <code>exchangeRate</code> property.
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Get the <code>executionDate</code>
     * 
     * @return the current value of the <code>executionDate</code> property.
     */
    public Date getExecutionDate() {
        if(executionDate!=null){
            return (Date)executionDate.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Get the <code>exportAuditStatus</code>
     * 
     * @return the current value of the <code>exportAuditStatus</code> property.
     */
    public String getExportAuditStatus() {
        return exportAuditStatus;
    }

    /**
     * Get the <code>exportDeclarationNumber</code>
     * 
     * @return the current value of the <code>exportDeclarationNumber</code> property.
     */
    public String getExportDeclarationNumber() {
        return exportDeclarationNumber;
    }

    /**
     * Get the <code>exportPaycode</code>
     * 
     * @return the current value of the <code>exportPaycode</code> property.
     */
    public AWBPaycodeType getExportPaycode() {
        return exportPaycode;
    }

    /**
     * Get the <code>exportReportingDate</code>
     * 
     * @return the current value of the <code>exportReportingDate</code> property.
     */
    public Date getExportReportingDate() {
        if(exportReportingDate!=null){
            return (Date)exportReportingDate.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Get the <code>exportReportingStn</code>
     * 
     * @return the current value of the <code>exportReportingStn</code> property.
     */
    public String getExportReportingStn() {
        return exportReportingStn;
    }

    /**
     * Get the <code>exportReportingWeight</code>
     * 
     * @return the current value of the <code>exportReportingWeight</code> property.
     */
    public Long getExportReportingWeight() {
        return exportReportingWeight;
    }

    /**
     * Get the <code>forwarder</code>
     * 
     * @return the current value of the <code>forwarder</code> property.
     */
    public CustomerDto getForwarder() {
        return forwarder;
    }

    /**
     * Get the <code>foundIndicator</code>
     * 
     * @return the current value of the <code>foundIndicator</code> property.
     */
    public String getFoundIndicator() {
        return foundIndicator;
    }

    public Integer getFsuRcsPieces() {
        return this.fsuRcsPieces;
    }

    /**
     * Get the <code>grossWeight</code>
     * 
     * @return the current value of the <code>grossWeight</code> property.
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * Get the <code>surfaceDestinationStation</code>
     * 
     * @return the current value of the <code>surfaceDestinationStation</code> property.
     */
    public String getHandlingRemarks() {
        return handlingRemarks;
    }

    /**
	 * @return the houseAssociationComplete
	 */
	public String getHouseAssociationComplete() {
		return this.houseAssociationComplete;
	}

    /**
     * Get the <code>identifier</code>
     * 
     * @return the current value of the <code>identifier</code> property.
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Get the <code>importAuditStatus</code>
     * 
     * @return the current value of the <code>importAuditStatus</code> property.
     */
    public String getImportAuditStatus() {
        return importAuditStatus;
    }

    /**
     * Get the <code>importCustomsStatus</code>
     * 
     * @return the current value of the <code>agent</code> property.
     */
    public String getImportCustomsStatus() {
        return importCustomsStatus;
    }

    /**
     * Get the <code>importPaycode</code>
     * 
     * @return the current value of the <code>importPaycode</code> property.
     */
    public AWBPaycodeType getImportPaycode() {
        return importPaycode;
    }

    /**
     * Get the <code>importReportingDate</code>
     * 
     * @return the current value of the <code>importReportingDate</code> property.
     */
    public Date getImportReportingDate() {
        if(importReportingDate!=null){
            return (Date)importReportingDate.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Get the <code>importReportingStn</code>
     * 
     * @return the current value of the <code>importReportingStn</code> property.
     */
    public String getImportReportingStn() {
        return importReportingStn;
    }

    /**
     * Get the <code>inBondIndicator</code>
     * 
     * @return the current value of the <code>inBondIndicator</code> property.
     */
    public String getInBondIndicator() {
        return inBondIndicator;
    }

    /**
     * Get the <code>internationalAWBType</code>
     * 
     * @return the current value of the <code>internationalAWBType</code> property.
     */
    public String getInternationalAWBType() {
        return internationalAWBType;
    }

    /**
     * Get the <code>lastDocumentStatus</code>
     * 
     * @return the current value of the <code>lastDocumentStatus</code> property.
     */
    public String getLastDocumentStatus() {
        return lastDocumentStatus;
    }

    public Date getLatestAcceptanceTime() {
        if(latestAcceptanceTime!=null){
            return (Date)latestAcceptanceTime.clone();
            }
            else{
                return null;
            }
    }

    public CustomerDto getManufacturer() {
        return manufacturer;
    }

    /**
     * 
     * @return
     */
    public String getModOverRideIndicator() {
        return this.modOverRideIndicator;
    }

    /**
     * Get the <code>neverFoundIndicator</code>
     * 
     * @return the current value of the <code>neverFoundIndicator</code> property.
     */
    public String getNeverFoundIndicator() {
        return neverFoundIndicator;
    }

    /**
     * Get the <code>notify</code>
     * 
     * @return the current value of the <code>notify</code> property.
     */
    public CustomerDto getNotify() {
        return notify;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */

    @Override
    public Long getOId() {
        return oId;
    }

    /**
     * Get the <code>orderAcceptedDate</code>
     * 
     * @return the current value of the <code>orderAcceptedDate</code> property.
     */
    public Date getOrderAcceptedDate() {
        if(orderAcceptedDate!=null){
            return (Date)orderAcceptedDate.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Get the <code>orderCompletedDate</code>
     * 
     * @return the current value of the <code>orderCompletedDate</code> property.
     */
    public Date getOrderCompletedDate() {
        if(orderCompletedDate!=null){
            return (Date)orderCompletedDate.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Get the <code>orderExecutedDate</code>
     * 
     * @return the current value of the <code>orderExecutedDate</code> property.
     */
    public Date getOrderExecutedDate() {
        if(orderExecutedDate!=null){
            return (Date)orderExecutedDate.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Get the <code>orderExportedDate</code>
     * 
     * @return the current value of the <code>orderExportedDate</code> property.
     */
    public Date getOrderExportedDate() {
        if(orderExportedDate!=null){
            return (Date)orderExportedDate.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Get the <code>orderImportedDate</code>
     * 
     * @return the current value of the <code>orderImportedDate</code> property.
     */
    public Date getOrderImportedDate() {
        if(orderImportedDate!=null){
            return (Date)orderImportedDate.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Get the <code>origin</code>
     * 
     * @return the current value of the <code>origin</code> property.
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Get the <code>originCurrency</code>
     * 
     * @return the current value of the <code>originCurrency</code> property.
     */
    public String getOriginCurrency() {
        return originCurrency;
    }

    public String getOtherChargeCode() {
        return otherChargeCode;
    }

    public String getOverrideCode() {
        return overrideCode;
    }

    /**
     * Get the <code>padType</code>
     * 
     * @return the current value of the <code>padType</code> property.
     */
    public String getPadType() {
        return padType;
    }

    public List<ParticipantCodeType> getParticipantTypes() {
        return participantTypes;
    }

    /**
     * Get the <code>pickupDateTime</code>
     * 
     * @return the current value of the <code>pickupDateTime</code> property.
     */
    public Date getPickupDateTime() {
        if(pickupDateTime!=null){
            return (Date)pickupDateTime.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Get the <code>pickupDriverEmail</code>
     * 
     * @return the current value of the <code>pickupDriverEmail</code> property.
     */
    public String getPickupDriverEmail() {
        return pickupDriverEmail;
    }

    /**
     * Get the <code>pickupDriverName</code>
     * 
     * @return the current value of the <code>pickupDriverName</code> property.
     */
    public String getPickupDriverName() {
        return pickupDriverName;
    }

    /**
     * Get the <code>pickupDriverPhoneNumber</code>
     * 
     * @return the current value of the <code>pickupDriverPhoneNumber</code> property.
     */
    public String getPickupDriverPhoneNumber() {
        return pickupDriverPhoneNumber;
    }

    /**
     * Get the <code>pickUpLocation</code>
     * 
     * @return the current value of the <code>pickUpLocation</code> property.
     */
    public CustomerDto getPickUpLocation() {
        return pickUpLocation;
    }

    /**
     * Get the <code>pickUpOperator</code>
     * 
     * @return the current value of the <code>pickUpOperator</code> property.
     */
    public CustomerDto getPickUpOperator() {
        return pickUpOperator;
    }

    /**
     * Get the <code>preOrderDate</code>
     * 
     * @return the current value of the <code>preOrderDate</code> property.
     */
    public Date getPreOrderDate() {
        if(preOrderDate!=null){
            return (Date)preOrderDate.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Get the <code>pricingDate</code>
     * 
     * @return the current value of the <code>pricingDate</code> property.
     */
    public Date getPricingDate() {
        if(pricingDate!=null){
            return (Date)pricingDate.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Get the <code>printableTotalColCharges</code>
     * 
     * @return the current value of the <code>printableTotalColCharges</code> property.
     */
    public BigDecimal getPrintableTotalColCharges() {
        return printableTotalColCharges;
    }

    /**
     * Get the <code>printableTotalPpdCharges</code>
     * 
     * @return the current value of the <code>printableTotalPpdCharges</code> property.
     */
    public BigDecimal getPrintableTotalPpdCharges() {
        return printableTotalPpdCharges;
    }

    /**
     * Get the <code>priority</code>
     * 
     * @return the current value of the <code>priority</code> property.
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Get the <code>productCode</code>
     * 
     * @return the current value of the <code>productCode</code> property.
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Get the <code>qualityAssuranceIndicator</code>
     * 
     * @return the current value of the <code>qualityAssuranceIndicator</code> property.
     */
    public String getQualityAssuranceIndicator() {
        return qualityAssuranceIndicator;
    }

    /**
     * Get the <code>agent</code>
     * 
     * @return the current value of the <code>agent</code> property.
     */
    public BigDecimal getRateA() {
        return rateA;
    }

    /**
     * Get the <code>rateF</code>
     * 
     * @return the current value of the <code>rateF</code> property.
     */
    public BigDecimal getRateF() {
        return rateF;
    }

    /**
     * Get the <code>agent</code>
     * 
     * @return the current value of the <code>agent</code> property.
     */
    public BigDecimal getRateFace() {
        return rateFace;
    }

    /**
     * Get the <code>rateGenerationTypeA</code>
     * 
     * @return the current value of the <code>rateGenerationTypeA</code> property.
     */
    public RateGenerationType getRateGenerationTypeA() {
        return rateGenerationTypeA;
    }

    /**
     * Get the <code>rateGenerationTypeF</code>
     * 
     * @return the current value of the <code>rateGenerationTypeF</code> property.
     */
    public RateGenerationType getRateGenerationTypeF() {
        return rateGenerationTypeF;
    }

    /**
     * Get the <code>rateGenerationTypeP</code>
     * 
     * @return the current value of the <code>rateGenerationTypeP</code> property.
     */
    public RateGenerationType getRateGenerationTypeP() {
        return rateGenerationTypeP;
    }

    /**
     * Get the <code>agent</code>
     * 
     * @return the current value of the <code>agent</code> property.
     */
    public BigDecimal getRateP() {
        return rateP;
    }

    /**
     * Get the <code>ratePieces</code>
     * 
     * @return the current value of the <code>ratePieces</code> property.
     */
    public Integer getRatePieces() {
        return ratePieces;
    }

    public String getRouting() {
        return routing;
    }

    /**
     * Get the <code>shipmentReference</code>
     * 
     * @return the current value of the <code>shipmentReference</code> property.
     */
    public String getShipmentReference() {
        return shipmentReference;
    }

    public String getShipmentStatus() {
        return shipmentStatus;
    }

    /**
     * Get the <code>rowIndex</code>
     * 
     * @return the current value of the <code>rowIndex</code> property.
     */

    public CustomerDto getShipper() {
        return shipper;
    }

    /**
     * Get the <code>specialHandlingCodes</code>
     * 
     * @return the current value of the <code>specialHandlingCodes</code> property.
     */
    public List<String> getSpecialHandlingCodes() {
        return specialHandlingCodes;
    }

    /**
     * Get the <code>comatProductcodes</code>
     * 
     * @return the current value of the <code>comatProductcodes</code> property.
     */
    
    public List<String> getComatProductcodes() {
		return comatProductcodes;
	}

    /**
     * Get the <code>splCodes</code>
     * 
     * @return the current value of the <code>splCodes</code> property.
     */
    public String getSplCodes() {
        return splCodes;
    }

    /**
     * Get the <code>status</code>
     * 
     * @return the current value of the <code>status</code> property.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Get the <code>statusDate</code>
     * 
     * @return the current value of the <code>statusDate</code> property.
     */
    public Date getStatusDate() {
        if(statusDate!=null){
            return (Date)statusDate.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Get the <code>surfaceDestination</code>
     * 
     * @return the current value of the <code>surfaceDestination</code> property.
     */
    public CustomerDto getSurfaceDestination() {
        return surfaceDestination;
    }

    /**
     * Get the <code>surfaceDestinationStation</code>
     * 
     * @return the current value of the <code>surfaceDestinationStation</code> property.
     */
    public String getSurfaceDestinationStation() {
        return surfaceDestinationStation;
    }

    /**
     * Get the <code>surfaceOrigin</code>
     * 
     * @return the current value of the <code>surfaceOrigin</code> property.
     */
    public CustomerDto getSurfaceOrigin() {
        return surfaceOrigin;
    }

    /**
     * Get the <code>surfaceOriginStation</code>
     * 
     * @return the current value of the <code>surfaceOriginStation</code> property.
     */
    public String getSurfaceOriginStation() {
        return surfaceOriginStation;
    }

    /**
     * @return the totalAcceptedPieces
     */
    public Long getTotalAcceptedPieces() {
        return totalAcceptedPieces;
    }

    /**
     * Get the <code>totalAcceptedPiecesAtER</code>
     * 
     * @return the current value of the <code>totalAcceptedPiecesAtER</code> property.
     */
    public Long getTotalAcceptedPiecesAtER() {
        return totalAcceptedPiecesAtER;
    }

    /**
     * @return the totalAcceptedVolume
     */
    public BigDecimal getTotalAcceptedVolume() {
        return totalAcceptedVolume;
    }

    /**
     * @return the totalAcceptedWeight
     */
    public BigDecimal getTotalAcceptedWeight() {
        return totalAcceptedWeight;
    }

    /**
     * Get the <code>totalExecutedPieces</code>
     * 
     * @return the current value of the <code>totalExecutedPieces</code> property.
     */
    public Long getTotalExecutedPieces() {
        return totalExecutedPieces;
    }

    /**
     * Get the <code>totalHawbGrossWeight</code>
     * 
     * @return the current value of the <code>totalHawbGrossWeight</code> property.
     */
    public BigDecimal getTotalHawbGrossWeight() {
        return totalHawbGrossWeight;
    }

    /**
     * Get the <code>totalHawbPieces</code>
     * 
     * @return the current value of the <code>totalHawbPieces</code> property.
     */
    public Long getTotalHawbPieces() {
        return totalHawbPieces;
    }

    /**
     * Get the <code>totalPieces</code>
     * 
     * @return the current value of the <code>totalPieces</code> property.
     */
    public Long getTotalPieces() {
        return totalPieces;
    }

    /**
     * Get the <code>totalReceivedPiecesAtIR</code>
     * 
     * @return the current value of the <code>totalReceivedPiecesAtIR</code> property.
     */
    public Long getTotalReceivedPiecesAtIR() {
        return totalReceivedPiecesAtIR;
    }

    /**
     * Get the <code>totalVolume</code>
     * 
     * @return the current value of the <code>totalVolume</code> property.
     */
    public BigDecimal getTotalVolume() {
        return totalVolume;
    }

    /**
     * Get the <code>totalWeight</code>
     * 
     * @return the current value of the <code>totalWeight</code> property.
     */
    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    /**
     * Get the <code>trackAndTraceIndicator</code>
     * 
     * @return the current value of the <code>trackAndTraceIndicator</code> property.
     */
    public String getTrackAndTraceIndicator() {
        return trackAndTraceIndicator;
    }

    /**
     * Get the <code>transfer</code>
     * 
     * @return the current value of the <code>transfer</code> property.
     */
    public String getTransfer() {
        return transfer;
    }

    /**
     * Get the <code>w_Subcontractor</code>
     * 
     * @return the current value of the <code>w_Subcontractor</code> property.
     */
    public CustomerDto getW_Subcontractor() {
        return w_Subcontractor;
    }

    public String getWorkOrderItemStatus() {
        return workOrderItemStatus;
    }

    public String getWorkOrderStatus() {
        return workOrderStatus;
    }

    public String getWorkOrderTarget() {
        return workOrderTarget;
    }

    public String getWorkOrderTargetLocation() {
        return workOrderTargetLocation;
    }

    public String getWorkOrderType() {
        return workOrderType;
    }

    public boolean isActualRateQueueInd() {
        return actualRateQueueInd;
    }

    public boolean isAwbQueued() {
        return awbQueued;
    }

    /**
     * Get the <code>hostBookingConf</code>
     * 
     * @return the current value of the <code>hostBookingConf</code> property.
     */
    public boolean isBookingConf() {
        return bookingConf;
    }

    /**
     * Gets the <code>bookingDeletionInd</code> property.
     * <p>
     * 
     * @return the current value of <code>bookingDeletionInd</code> property.
     */
    public boolean isBookingDeletionInd() {
        return this.bookingDeletionInd;
    }

    /**
     * Gets the <code>bookingExistsInd</code> property.
     * <p>
     * 
     * @return the current value of <code>bookingExistsInd</code> property.
     */
    public boolean isBookingExistsInd() {
        return bookingExistsInd;
    }

    public boolean isCollectChargesRestrictionAuthority() {
        return collectChargesRestrictionAuthority;
    }

    /**
     * Get the <code>ecaCompletedFlag</code>
     * 
     * @return the current value of the <code>ecaCompletedFlag</code> property.
     */
    public boolean isEcaCompletedFlag() {
        return ecaCompletedFlag;
    }

    public boolean isHouseShipDiscQueueInd() {
		return this.houseShipDiscQueueInd;
	}

    public boolean isMessageRequest() {
        return messageRequest;
    }

    /**
     * Get the <code>orderAcceptedInd</code>
     * 
     * @return the current value of the <code>orderAcceptedInd</code> property.
     */
    public boolean isOrderAcceptedInd() {
        return orderAcceptedInd;
    }

    /**
     * Get the <code>orderCompleteInd</code>
     * 
     * @return the current value of the <code>orderCompleteInd</code> property.
     */
    public boolean isOrderCompleteInd() {
        return orderCompleteInd;
    }

    /**
     * Get the <code>orderExecutedInd</code>
     * 
     * @return the current value of the <code>orderExecutedInd</code> property.
     */
    public boolean isOrderExecutedInd() {
        return orderExecutedInd;
    }

    /**
     * Get the <code>orderExportedInd</code>
     * 
     * @return the current value of the <code>orderExportedInd</code> property.
     */
    public boolean isOrderExportedInd() {
        return orderExportedInd;
    }

    /**
     * Get the <code>orderImportedInd</code>
     * 
     * @return the current value of the <code>orderImportedInd</code> property.
     */
    public boolean isOrderImportedInd() {
        return orderImportedInd;
    }

    /**
     * Get the <code>paperAWBOverrideInd</code>
     * 
     * @return the current value of the <code>paperAWBOverrideInd</code> property.
     */
    public boolean isPaperAWBOverrideInd() {
        return paperAWBOverrideInd;
    }

    /**
     * Get the <code>preOrderInd</code>
     * 
     * @return the current value of the <code>preOrderInd</code> property.
     */
    public boolean isPreOrderInd() {
        return preOrderInd;
    }

    /**
     * Get the <code>shipperConsigneeExists</code>
     * 
     * @return the current value of the <code>shipperConsigneeExists</code> property.
     */
    public boolean isShipperConsigneeExists() {
        return shipperConsigneeExists;
    }

    public boolean isTerminalDiscrepancyQueueInd() {
        return terminalDiscrepancyQueueInd;
    }

    /**
     * Sets the <code>acceptedPieces</code> property.
     * <p>
     * 
     * @param pAcceptedPieces
     *            the current value of the <code>acceptedPieces</code> property.
     */
    public void setAcceptedPieces(final Long pAcceptedPieces) {
        acceptedPieces = pAcceptedPieces;
    }

    /**
     * Sets the <code>v</code> property.
     * <p>
     * 
     * @param pAccountingRemarks
     *            the current value of the <code>accountingRemarks</code> property.
     */
    public void setAccountingRemarks(final String pAccountingRemarks) {
        accountingRemarks = pAccountingRemarks;
    }

    public void setActualRateQueueInd(final boolean actualRateQueueInd) {
        this.actualRateQueueInd = actualRateQueueInd;
    }

    /**
     * Sets the <code>agent</code> property.
     * <p>
     * 
     * @param pAgent
     *            the current value of the <code>agent</code> property.
     */
    public void setAgent(final CustomerDto pAgent) {
        agent = pAgent;
    }

    /**
     * Sets the <code>airlineCodeNbr</code> property.
     * <p>
     * 
     * @param pAirlineCodeNbr
     *            the current value of the <code>airlineCodeNbr</code> property.
     */
    public void setAirlineCodeNbr(final String pAirlineCodeNbr) {
        airlineCodeNbr = pAirlineCodeNbr;
    }

    /**
     * Sets the <code>airWaybillCreationChannelType</code> property.
     * <p>
     * 
     * @param pAirWaybillCreationChannelType
     *            the current value of the <code>airWaybillCreationChannelType</code> property.
     */
    public void setAirWaybillCreationChannelType(final ChannelType pAirWaybillCreationChannelType) {
        airWaybillCreationChannelType = pAirWaybillCreationChannelType;
    }
    
    /**
     * Sets the <code>airWaybillCreationSourceType</code> property.
     * <p>
     * 
     * @param pAirWaybillCreationSourceType
     *            the current value of the <code>airWaybillCreationSourceType</code> property.
     */
    public void setAirWaybillCreationSourceType(
                final AirWaybillSourceType pAirWaybillCreationSourceType) {
        airWaybillCreationSourceType = pAirWaybillCreationSourceType;
    }

    /**
     * Sets the <code>airWaybillType</code> property.
     * <p>
     * 
     * @param pAirWaybillType
     *            the current value of the <code>airWaybillType</code> property.
     */
    public void setAirWaybillType(final AirWaybillType pAirWaybillType) {
        airWaybillType = pAirWaybillType;
    }

    /**
     * Sets the <code>airWaybillUpdationChannelType</code> property.
     * <p>
     * 
     * @param pAirWaybillUpdationChannelType
     *            the current value of the <code>airWaybillUpdationChannelType</code> property.
     */
    public void setAirWaybillUpdationChannelType(
                final ChannelType pAirWaybillUpdationChannelType) {
        airWaybillUpdationChannelType = pAirWaybillUpdationChannelType;
    }

    /**
     * Sets the <code>airWaybillUpdationSourceType</code> property.
     * <p>
     * 
     * @param pAirWaybillUpdationSourceType
     *            the current value of the <code>airWaybillUpdationSourceType</code> property.
     */
    public void setAirWaybillUpdationSourceType(
                final AirWaybillSourceType pAirWaybillUpdationSourceType) {
        airWaybillUpdationSourceType = pAirWaybillUpdationSourceType;
    }

    /**
     * Sets the <code>alertCodeColor</code> property.
     * <p>
     * 
     * @param pAlertCodeColor
     *            the current value of the <code>alertCodeColor</code> property.
     */
    public void setAlertCodeColor(final String pAlertCodeColor) {
        alertCodeColor = pAlertCodeColor;
    }

    public void setAwbDetailOid(final Long pAwbDetailOid) {
		this.awbDetailOid = pAwbDetailOid;
	}

    /**
     * Sets the <code>awbLockedInd</code> property.
     * <p>
     * 
     * @param pAwbLockedInd
     *            the current value of the <code>awbLockedInd</code> property.
     */
    public void setAwbLockedInd(final String pAwbLockedInd) {
        awbLockedInd = pAwbLockedInd;
    }

    /**
     * Sets the <code>awbLockStation</code> property.
     * <p>
     * 
     * @param pAwbLockStation
     *            the current value of the <code>awbLockStation</code> property.
     */
    public void setAwbLockStation(final String pAwbLockStation) {
        awbLockStation = pAwbLockStation;
    }

    public void setAwbQueued(final boolean pAwbQueued) {
        awbQueued = pAwbQueued;
    }


    /**
     * Sets the <code>awbTotalCol</code> property.
     * <p>
     * 
     * @param pAwbTotalCol
     *            the current value of the <code>awbTotalCol</code> property.
     */
    public void setAwbTotalCol(final BigDecimal pAwbTotalCol) {
        awbTotalCol = pAwbTotalCol;
    }

    /**
     * Sets the <code>awbTotalPpd</code> property.
     * <p>
     * 
     * @param pAwbTotalPpd
     *            the current value of the <code>awbTotalPpd</code> property.
     */
    public void setAwbTotalPpd(final BigDecimal pAwbTotalPpd) {
        awbTotalPpd = pAwbTotalPpd;
    }

    /**
     * Sets the <code>bank</code> property.
     * <p>
     * 
     * @param pBank
     *            the current value of the <code>bank</code> property.
     */
    public void setBank(final CustomerDto pBank) {
        bank = pBank;
    }

    /**
     * Sets the <code>billToConsignee</code> property.
     * <p>
     * 
     * @param pBillToConsignee
     *            the current value of the <code>billToConsignee</code> property.
     */
    public void setBillToConsignee(final CustomerDto pBillToConsignee) {
        billToConsignee = pBillToConsignee;
    }

    /**
     * Sets the <code>billToShipper</code> property.
     * <p>
     * 
     * @param pBillToShipper
     *            the current value of the <code>billToShipper</code> property.
     */
    public void setBillToShipper(final CustomerDto pBillToShipper) {
        billToShipper = pBillToShipper;
    }

    /**
     * Sets the <code>bookingConf</code> property.
     * <p>
     * 
     * @param pBookingConf
     *            the current value of the <code>bookingConf</code> property.
     */
    public void setBookingConf(final boolean pBookingConf) {
        bookingConf = pBookingConf;
    }

    /**
     * Sets the <code>bookingDeletionInd</code> property.
     * <p>
     * 
     * @param pBookingDeletionInd
     *            the current value of the <code>bookingDeletionInd</code> property.
     */
    public void setBookingDeletionInd(boolean pBookingDeletionInd) {
        this.bookingDeletionInd = pBookingDeletionInd;
    }

    /**
     * @param pBookingExistsInd holds the new value of <code>bookingExistsInd</code>
     */
    public void setBookingExistsInd(final boolean pBookingExistsInd) {
        bookingExistsInd = pBookingExistsInd;
    }

    /**
     * Sets the <code>broker</code> property.
     * <p>
     * 
     * @param pBroker
     *            the current value of the <code>broker</code> property.
     */
    public void setBroker(final CustomerDto pBroker) {
        broker = pBroker;
    }

    /**
     * Sets the <code>chargeableWeightA</code> property.
     * <p>
     * 
     * @param pChargeableWeightA
     *            the current value of the <code>chargeableWeightA</code> property.
     */
    public void setChargeableWeightA(final BigDecimal pChargeableWeightA) {
        chargeableWeightA = pChargeableWeightA;
    }

    /**
     * Sets the <code>chargeableWeightF</code> property.
     * <p>
     * 
     * @param pChargeableWeightF
     *            the current value of the <code>chargeableWeightF</code> property.
     */
    public void setChargeableWeightF(final BigDecimal pChargeableWeightF) {
        chargeableWeightF = pChargeableWeightF;
    }

    /**
     * Sets the <code>chargeableWeightP</code> property.
     * <p>
     * 
     * @param pChargeableWeightP
     *            the current value of the <code>chargeableWeightP</code> property.
     */
    public void setChargeableWeightP(final BigDecimal pChargeableWeightP) {
        chargeableWeightP = pChargeableWeightP;
    }

    /**
     * Sets the <code>checkedInPieces</code> property.
     * <p>
     * 
     * @param pCheckedInPieces
     *            the current value of the <code>checkedInPieces</code> property.
     */
    public void setCheckedInPieces(final Long pCheckedInPieces) {
        checkedInPieces = pCheckedInPieces;
    }

    /**
     * Sets the <code>codeRedIndicator</code> property.
     * <p>
     * 
     * @param pCodeRedIndicator
     *            the current value of the <code>codeRedIndicator</code> property.
     */
    public void setCodeRedIndicator(final String pCodeRedIndicator) {
        codeRedIndicator = pCodeRedIndicator;
    }

    public void setCollectChargesRestrictionAuthority(final boolean pCollectChargesRestrictionAuthority) {
        collectChargesRestrictionAuthority = pCollectChargesRestrictionAuthority;
    }

    public void setCollectChargesRestrictionInd(final String pCollectChargesRestrictionInd) {
        collectChargesRestrictionInd = pCollectChargesRestrictionInd;
    }

    /**
     * Sets the <code>consignee</code> property.
     * <p>
     * 
     * @param pConsignee
     *            the current value of the <code>consignee</code> property.
     */
    public void setConsignee(final CustomerDto pConsignee) {
        consignee = pConsignee;
    }

    /**
     * Sets the <code>createdDate</code> property.
     * <p>
     * 
     * @param pCreatedDate
     *            the current value of the <code>createdDate</code> property.
     */
    public void setCreatedDate(final Date pCreatedDate) {
        if(pCreatedDate!=null)
        {
        	this.createdDate=(Date) pCreatedDate.clone();
        }
        else
        {
        	this.createdDate = null;
        }
    }

    /**
     * Sets the <code>crossReference1</code> property.
     * <p>
     * 
     * @param pCrossReference1
     *            the current value of the <code>crossReference1</code> property.
     */
    public void setCrossReference1(final String pCrossReference1) {
        crossReference1 = pCrossReference1;
    }

    /**
     * Sets the <code>crossReference2</code> property.
     * <p>
     * 
     * @param pCrossReference2
     *            the current value of the <code>crossReference2</code> property.
     */
    public void setCrossReference2(final String pCrossReference2) {
        crossReference2 = pCrossReference2;
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
        crossReferenceIndicator1 = ContractUtility
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
        crossReferenceIndicator2 = ContractUtility
                    .convertToUpperCase(pCrossReferenceIndicator2);
    }

    public void setCruQueueInd(final String pCruQueueInd) {
		this.cruQueueInd = pCruQueueInd;
	}

    /**
     * Sets the <code>customerType</code> property.
     * <p>
     * 
     * @param pCustomerType
     *            the current value of the <code>customerType</code> property.
     */
    public void setCustomerType(final ParticipantCodeType pCustomerType) {
        customerType = pCustomerType;
    }

    /**
     * Sets the <code>customsLocation</code> property.
     * <p>
     * 
     * @param pCustomsLocation
     *            the current value of the <code>customsLocation</code> property.
     */
    public void setCustomsLocation(final CustomerDto pCustomsLocation) {
        customsLocation = pCustomsLocation;
    }

    /**
     * Sets the <code>customsValue</code> property.
     * <p>
     * 
     * @param pCustomsValue
     *            the current value of the <code>customsValue</code> property.
     */
    public void setCustomsValue(final String pCustomsValue) {
        customsValue = pCustomsValue;
    }

    /**
     * Sets the <code>declaredValue</code> property.
     * <p>
     * 
     * @param pDeclaredValue
     *            the current value of the <code>declaredValue</code> property.
     */
    public void setDeclaredValue(final String pDeclaredValue) {
        declaredValue = pDeclaredValue;
    }

    /**
     * Sets the <code>deliveryDateTime</code> property.
     * <p>
     * 
     * @param pDeliveryDateTime
     *            the current value of the <code>deliveryDateTime</code> property.
     */
    public void setDeliveryDateTime(final Date pDeliveryDateTime) {
    	if(pDeliveryDateTime!=null)
    	{
        this.deliveryDateTime =(Date) pDeliveryDateTime.clone();
    	}
    	else
    	{
    		this.deliveryDateTime=null;
    	}
    }

    /**
     * Sets the <code>deliveryDriverEmail</code> property.
     * <p>
     * 
     * @param pDeliveryDriverEmail
     *            the current value of the <code>deliveryDriverEmail</code> property.
     */
    public void setDeliveryDriverEmail(final String pDeliveryDriverEmail) {
        deliveryDriverEmail = pDeliveryDriverEmail;
    }

    /**
     * Sets the <code>deliveryDriverName</code> property.
     * <p>
     * 
     * @param pDeliveryDriverName
     *            the current value of the <code>deliveryDriverName</code> property.
     */
    public void setDeliveryDriverName(final String pDeliveryDriverName) {
        deliveryDriverName = pDeliveryDriverName;
    }

    /**
     * Sets the <code>deliveryDriverPhoneNumber</code> property.
     * <p>
     * 
     * @param pDeliveryDriverPhoneNumber
     *            the current value of the <code>deliveryDriverPhoneNumber</code> property.
     */
    public void setDeliveryDriverPhoneNumber(
                final String pDeliveryDriverPhoneNumber) {
        deliveryDriverPhoneNumber = pDeliveryDriverPhoneNumber;
    }

    /**
     * Sets the <code>deliveryOperator</code> property.
     * <p>
     * 
     * @param pDeliveryOperator
     *            the current value of the <code>deliveryOperator</code> property.
     */
    public void setDeliveryOperator(final CustomerDto pDeliveryOperator) {
        deliveryOperator = pDeliveryOperator;
    }

    /**
     * Sets the <code>description</code> property.
     * <p>
     * 
     * @param pDescription
     *            the current value of the <code>description</code> property.
     */
    public void setDescription(final String pDescription) {
        description = pDescription;
    }

    /**
     * Sets the <code>destCustomsStation</code> property.
     * <p>
     * 
     * @param pDestCustomsStation
     *            the current value of the <code>destCustomsStation</code> property.
     */
    public void setDestCustomsStation(final String pDestCustomsStation) {
        destCustomsStation = pDestCustomsStation;
    }

    /**
     * Sets the <code>destination</code> property.
     * <p>
     * 
     * @param pDestination
     *            the current value of the <code>destination</code> property.
     */
    public void setDestination(final String pDestination) {
        destination = pDestination;
    }

    /**
     * Sets the <code>destinationCurrency</code> property.
     * <p>
     * 
     * @param pDestinationCurrency
     *            the current value of the <code>destinationCurrency</code> property.
     */
    public void setDestinationCurrency(final String pDestinationCurrency) {
        destinationCurrency = pDestinationCurrency;
    }

    /**
     * Sets the <code>dimensionalWeightOfShipment</code> property.
     * <p>
     * 
     * @param pDimensionalWeightOfShipment
     *            the current value of the <code>dimensionalWeightOfShipment</code> property.
     */
    public void setDimensionalWeightOfShipment(
                final BigDecimal pDimensionalWeightOfShipment) {
        dimensionalWeightOfShipment = pDimensionalWeightOfShipment;
    }

    /**
     * Sets the <code>discrepancyExists</code> property.
     * <p>
     * 
     * @param pDiscrepancyExists
     *            the current value of the <code>discrepancyExists</code> property.
     */
    public void setDiscrepancyExists(final String pDiscrepancyExists) {
        discrepancyExists = pDiscrepancyExists;
    }

    /**
     * Sets the <code>displayTotalColCharges</code> property.
     * <p>
     * 
     * @param pDisplayTotalColCharges
     *            the current value of the <code>displayTotalColCharges</code> property.
     */
    public void setDisplayTotalColCharges(
                final BigDecimal pDisplayTotalColCharges) {
        displayTotalColCharges = pDisplayTotalColCharges;
    }

    /**
     * Sets the <code>displayTotalPpdCharges</code> property.
     * <p>
     * 
     * @param pDisplayTotalPpdCharges
     *            the current value of the <code>displayTotalPpdCharges</code> property.
     */
    public void setDisplayTotalPpdCharges(
                final BigDecimal pDisplayTotalPpdCharges) {
        displayTotalPpdCharges = pDisplayTotalPpdCharges;
    }

    /**
     * Set the <code>documentRemarks</code>
     * 
     * @param documentRemarks
     */
    public void setDocumentRemarks(final String documentRemarks) {
        this.documentRemarks = documentRemarks;
    }

    /**
     * Sets the <code>eAwbInd</code> property.
     * <p>
     * 
     * @param pEAwbInd
     *            the current value of the <code>eAwbInd</code> property.
     */
    public void seteAwbInd(final String pEAwbInd) {
        eAwbInd = pEAwbInd;
    }

    /**
     * Sets the <code>ecaCompletedFlag</code> property.
     * <p>
     * 
     * @param pEcaCompletedFlag
     *            the current value of the <code>ecaCompletedFlag</code> property.
     */
    public void setEcaCompletedFlag(final boolean pEcaCompletedFlag) {
        ecaCompletedFlag = pEcaCompletedFlag;
    }

    /**
     * Sets the <code>euCustomStatusCode</code> property.
     * <p>
     * 
     * @param pEuCustomStatusCode
     *            the current value of the <code>euCustomStatusCode</code> property.
     */
    public void setEuCustomStatusCoder(final String pEuCustomStatusCode) {
        euCustomStatusCode = pEuCustomStatusCode;
    }

    /**
     * Sets the <code>exchangeRate</code> property.
     * <p>
     * 
     * @param pExchangeRate
     *            the current value of the <code>exchangeRate</code> property.
     */
    public void setExchangeRate(final BigDecimal pExchangeRate) {
        exchangeRate = pExchangeRate;
    }

    /**
     * Sets the <code>executionDate</code> property.
     * <p>
     * 
     * @param pExecutionDate
     *            the current value of the <code>executionDate</code> property.
     */
    public void setExecutionDate(final Date pExecutionDate) {
        if(pExecutionDate!=null){
        	this.executionDate =(Date) pExecutionDate.clone();
        }
        else
        {
        	this.executionDate=null;
        }
        	
    }

    /**
     * Sets the <code>exportAuditStatus</code> property.
     * <p>
     * 
     * @param pExportAuditStatus
     *            the current value of the <code>exportAuditStatus</code> property.
     */
    public void setExportAuditStatus(final String pExportAuditStatus) {
        exportAuditStatus = pExportAuditStatus;
    }

    /**
     * Sets the <code>exportDeclarationNumber</code> property.
     * <p>
     * 
     * @param pExportDeclarationNumber
     *            the current value of the <code>exportDeclarationNumber</code> property.
     */
    public void setExportDeclarationNumber(final String pExportDeclarationNumber) {
        exportDeclarationNumber = pExportDeclarationNumber;
    }

    /**
     * Sets the <code>exportPaycode</code> property.
     * <p>
     * 
     * @param pExportPaycode
     *            the current value of the <code>exportPaycode</code> property.
     */
    public void setExportPaycode(final AWBPaycodeType pExportPaycode) {
        exportPaycode = pExportPaycode;
    }

    /**
     * Sets the <code>exportReportingDate</code> property.
     * <p>
     * 
     * @param pExportReportingDate
     *            the current value of the <code>exportReportingDate</code> property.
     */
    public void setExportReportingDate(final Date pExportReportingDate) {
       if(pExportReportingDate!=null)
    	   {
    	   this.exportReportingDate =(Date) pExportReportingDate.clone();
    	   }
       else
       {
    	   this.exportReportingDate=null;
       }
    }

    /**
     * Sets the <code>exportReportingStn</code> property.
     * <p>
     * 
     * @param pExportReportingStn
     *            the current value of the <code>exportReportingStn</code> property.
     */
    public void setExportReportingStn(final String pExportReportingStn) {
        exportReportingStn = pExportReportingStn;
    }

    /**
     * Sets the <code>exportReportingWeight</code> property.
     * <p>
     * 
     * @param pExportReportingWeight
     *            the current value of the <code>exportReportingWeight</code> property.
     */
    public void setExportReportingWeight(final Long pExportReportingWeight) {
        exportReportingWeight = pExportReportingWeight;
    }

    /**
     * Sets the <code>forwarder</code> property.
     * <p>
     * 
     * @param pForwarder
     *            the current value of the <code>forwarder</code> property.
     */
    public void setForwarder(final CustomerDto pForwarder) {
        forwarder = pForwarder;
    }

    /**
     * Sets the <code>foundIndicator</code> property.
     * <p>
     * 
     * @param pFoundIndicator
     *            the current value of the <code>foundIndicator</code> property.
     */
    public void setFoundIndicator(final String pFoundIndicator) {
        foundIndicator = pFoundIndicator;
    }

    public void setFsuRcsPieces(final Integer fsuRcsPieces) {
        this.fsuRcsPieces = fsuRcsPieces;
    }

    /**
     * Sets the <code>grossWeight</code> property.
     * <p>
     * 
     * @param pGrossWeight
     *            the current value of the <code>grossWeight</code> property.
     */
    public void setGrossWeight(final BigDecimal pGrossWeight) {
        grossWeight = pGrossWeight;
    }

    /**
     * Sets the <code>handlingRemarks</code> property.
     * <p>
     * 
     * @param pHandlingRemarks
     *            the current value of the <code>handlingRemarks</code> property.
     */
    public void setHandlingRemarks(final String pHandlingRemarks) {
        handlingRemarks = pHandlingRemarks;
    }

    /**
	 * @param houseAssociationComplete
	 *            the houseAssociationComplete to set
	 */
	public void setHouseAssociationComplete(String houseAssociationComplete) {
		this.houseAssociationComplete = houseAssociationComplete;
	}

    public void setHouseShipDiscQueueInd(final boolean pHouseShipDiscQueueInd) {
		this.houseShipDiscQueueInd = pHouseShipDiscQueueInd;
	}

    /**
     * Sets the <code>identifier</code> property.
     * <p>
     * 
     * @param pIdentifier
     *            the current value of the <code>identifier</code> property.
     */
    public void setIdentifier(final String pIdentifier) {
        identifier = pIdentifier;
    }

    /**
     * Sets the <code>importAuditStatus</code> property.
     * <p>
     * 
     * @param pImportAuditStatus
     *            the current value of the <code>importAuditStatus</code> property.
     */
    public void setImportAuditStatus(final String pImportAuditStatus) {
        importAuditStatus = pImportAuditStatus;
    }

    /**
     * Sets the <code>importCustomsStatus</code> property.
     * <p>
     * 
     * @param pImportCustomsStatus
     *            the current value of the <code>importCustomsStatus</code> property.
     */
    public void setImportCustomsStatus(final String pImportCustomsStatus) {
        importCustomsStatus = pImportCustomsStatus;
    }

    /**
     * Sets the <code>importPaycode</code> property.
     * <p>
     * 
     * @param pImportPaycode
     *            the current value of the <code>importPaycode</code> property.
     */
    public void setImportPaycode(final AWBPaycodeType pImportPaycode) {
        importPaycode = pImportPaycode;
    }

    /**
     * Sets the <code>importReportingDate</code> property.
     * <p>
     * 
     * @param pImportReportingDate
     *            the current value of the <code>importReportingDate</code> property.
     */

    public void setImportReportingDate(final Date pImportReportingDate) {
    	if(pImportReportingDate!=null)
    	{
    		this.importReportingDate =(Date) pImportReportingDate.clone();	
    	}
    	else
    	{
    		this.importReportingDate=null;
    	}
    }

    /**
     * Sets the <code>importReportingStn</code> property.
     * <p>
     * 
     * @param pImportReportingStn
     *            the current value of the <code>importReportingStn</code> property.
     */
    public void setImportReportingStn(final String pImportReportingStn) {
        importReportingStn = pImportReportingStn;
    }

    /**
     * Sets the <code>inBondIndicator</code> property.
     * <p>
     * 
     * @param pInBondIndicator
     *            the current value of the <code>inBondIndicator</code> property.
     */
    public void setInBondIndicator(final String pInBondIndicator) {
        inBondIndicator = pInBondIndicator;
    }

    /**
     * Sets the <code>internationalAWBType</code> property.
     * <p>
     * 
     * @param pInternationalAWBType
     *            the current value of the <code>internationalAWBType</code> property.
     */
    public void setInternationalAWBType(
                final String pInternationalAWBType) {
        internationalAWBType = pInternationalAWBType;
    }

    /**
     * Sets the <code>lastDocumentStatus</code> property.
     * <p>
     * 
     * @param pLastDocumentStatus
     *            the current value of the <code>lastDocumentStatus</code> property.
     */
    public void setLastDocumentStatus(final String pLastDocumentStatus) {
        lastDocumentStatus = pLastDocumentStatus;
    }

    public void setLatestAcceptanceTime(Date latestAcceptanceTime) {
        if(latestAcceptanceTime!=null)
    	{
        	this.latestAcceptanceTime =(Date) latestAcceptanceTime.clone();
    	}
        else
        {
        	this.latestAcceptanceTime=null;
        }
    }

    /**
     * Sets the <code>manufacturer</code> property.
     * <p>
     * 
     * @param pManufacturer
     *            the current value of the <code>manufacturer</code> property.
     */
    public void setManufacturer(final CustomerDto pManufacturer) {
        manufacturer = pManufacturer;
    }

    public void setMessageRequest(final boolean pMessageRequest) {
        messageRequest = pMessageRequest;
    }

    /**
     * 
     * @param pModOverRideIndicator
     */
    public void setModOverRideIndicator(String pModOverRideIndicator) {
        this.modOverRideIndicator = pModOverRideIndicator;
    }

    /**
     * Sets the <code>neverFoundIndicator</code> property.
     * <p>
     * 
     * @param pNeverFoundIndicator
     *            the current value of the <code>neverFoundIndicator</code> property.
     */
    public void setNeverFoundIndicator(final String pNeverFoundIndicator) {
        neverFoundIndicator = pNeverFoundIndicator;
    }

    /**
     * Sets the <code>notify</code> property.
     * <p>
     * 
     * @param pNotify
     *            the current value of the <code>notify</code> property.
     */
    public void setNotify(final CustomerDto pNotify) {
        notify = pNotify;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            holds the new value of <code>oId</code>.<br>
     */

    public void setOId(final Long pOId) {
        oId = pOId;
    }

    /**
     * Sets the <code>orderAcceptedDate</code> property.
     * <p>
     * 
     * @param pOrderAcceptedDate
     *            the current value of the <code>orderAcceptedDate</code> property.
     */
    public void setOrderAcceptedDate(final Date pOrderAcceptedDate) {
       if(pOrderAcceptedDate!=null){
    	   this.orderAcceptedDate =(Date) pOrderAcceptedDate.clone();
       }
       else
       {
    	   this.orderAcceptedDate=null;
       }
    }

    /**
     * Sets the <code>orderAcceptedInd</code> property.
     * <p>
     * 
     * @param pOrderAcceptedInd
     *            the current value of the <code>orderAcceptedInd</code> property.
     */
    public void setOrderAcceptedInd(final boolean pOrderAcceptedInd) {
        orderAcceptedInd = pOrderAcceptedInd;
    }

    /**
     * Sets the <code>orderCompletedDate</code> property.
     * <p>
     * 
     * @param pOrderCompletedDate
     *            the current value of the <code>orderCompletedDate</code> property.
     */
    public void setOrderCompletedDate(final Date pOrderCompletedDate) {
        if(pOrderCompletedDate!=null)
        	{
        	this.orderCompletedDate =(Date) pOrderCompletedDate.clone();
        	}
        else
        {
        	this.orderCompletedDate=null;
        }
    }

    /**
     * Sets the <code>orderCompleteInd</code> property.
     * <p>
     * 
     * @param pOrderCompleteInd
     *            the current value of the <code>orderCompleteInd</code> property.
     */
    public void setOrderCompleteInd(final boolean pOrderCompleteInd) {
        orderCompleteInd = pOrderCompleteInd;
    }

    /**
     * Sets the <code>orderExecutedDate</code> property.
     * <p>
     * 
     * @param pOrderExecutedDate
     *            the current value of the <code>orderExecutedDate</code> property.
     */
    public void setOrderExecutedDate(final Date pOrderExecutedDate) {
        if(pOrderExecutedDate!=null)
        	{
        	this.orderExecutedDate =(Date) pOrderExecutedDate.clone();
        	}
        else
        {
        	this.orderExecutedDate=null;
        }
    }

    /**
     * Sets the <code>orderExecutedInd</code> property.
     * <p>
     * 
     * @param pOrderExecutedInd
     *            the current value of the <code>orderExecutedInd</code> property.
     */
    public void setOrderExecutedInd(final boolean pOrderExecutedInd) {
        orderExecutedInd = pOrderExecutedInd;
    }

    /**
     * Sets the <code>orderExportedDate</code> property.
     * <p>
     * 
     * @param pOrderExportedDate
     *            the current value of the <code>orderExportedDate</code> property.
     */
    public void setOrderExportedDate(final Date pOrderExportedDate) {
       if(pOrderExportedDate!=null)
    	   {
    	   this.orderExportedDate =(Date) pOrderExportedDate.clone();
    	   }
       else
       {
    	   this.orderExportedDate=null;
       }
    }

    /**
     * Sets the <code>orderExportedInd</code> property.
     * <p>
     * 
     * @param pOrderExportedInd
     *            the current value of the <code>orderExportedInd</code> property.
     */
    public void setOrderExportedInd(final boolean pOrderExportedInd) {
        orderExportedInd = pOrderExportedInd;
    }

    /**
     * Sets the <code>orderImportedDate</code> property.
     * <p>
     * 
     * @param pOrderImportedDate
     *            the current value of the <code>orderImportedDate</code> property.
     */
    public void setOrderImportedDate(final Date pOrderImportedDate) {
        if(pOrderImportedDate!=null)
        	{
        	this.orderImportedDate =(Date) pOrderImportedDate.clone();
        	}
        else
        {
        	this.orderImportedDate=null;
        }
    }

    /**
     * Sets the <code>orderImportedInd</code> property.
     * <p>
     * 
     * @param pOrderImportedInd
     *            the current value of the <code>orderImportedInd</code> property.
     */
    public void setOrderImportedInd(final boolean pOrderImportedInd) {
        orderImportedInd = pOrderImportedInd;
    }

    /**
     * Sets the <code>origin</code> property.
     * <p>
     * 
     * @param pOrigin
     *            the current value of the <code>origin</code> property.
     */
    public void setOrigin(final String pOrigin) {
        origin = pOrigin;
    }

    /**
     * Sets the <code>originCurrency</code> property.
     * <p>
     * 
     * @param pOriginCurrency
     *            the current value of the <code>originCurrency</code> property.
     */
    public void setOriginCurrency(final String pOriginCurrency) {
        originCurrency = pOriginCurrency;
    }

	/**
	 * Sets the <code>otherChargeCode</code> property.
	 * <p>
	 * 
	 * @param pOtherChargeCode
	 *            the current value of the <code>otherChargeCode</code>
	 *            property.
	 */
    public void setOtherChargeCode(final String pOtherChargeCode) {
        otherChargeCode = pOtherChargeCode;
    }

	/**
	 * Sets the <code>overrideCode</code> property.
	 * <p>
	 * 
	 * @param pOverrideCode
	 *            the current value of the <code>overrideCode</code> property.
	 */
    public void setOverrideCode(final String pOverrideCode) {
        overrideCode = pOverrideCode;
    }

    /**
     * Sets the <code>padType</code> property.
     * <p>
     * 
     * @param pPadType
     *            the current value of the <code>padType</code> property.
     */
    public void setPadType(final String pPadType) {
        padType = pPadType;
    }

    /**
     * Sets the <code>paperAWBOverrideInd</code> property.
     * <p>
     * 
     * @param pPaperAWBOverrideInd
     *            the current value of the <code>paperAWBOverrideInd</code> property.
     */
    public void setPaperAWBOverrideInd(final boolean pPaperAWBOverrideInd) {
        paperAWBOverrideInd = pPaperAWBOverrideInd;
    }

    /**
     * Sets the <code>participantTypes</code> property.
     * <p>
     * 
     * @param pParticipantTypes
     *            the current value of the <code>participantTypes</code> property.
     */
    public void setParticipantTypes(final List<ParticipantCodeType> pParticipantTypes) {
        participantTypes = pParticipantTypes;
    }

    /**
     * Sets the <code>pickupDateTime</code> property.
     * <p>
     * 
     * @param pPickupDateTime
     *            the current value of the <code>pickupDateTime</code> property.
     */
    public void setPickupDateTime(final Date pPickupDateTime) {
        if(pPickupDateTime!=null)
        	{
        	this.pickupDateTime =(Date) pPickupDateTime.clone();
        	}
        else
        {
        	this.pickupDateTime=null;
        }
    }

    /**
     * Sets the <code>pickupDriverEmail</code> property.
     * <p>
     * 
     * @param pPickupDriverEmail
     *            the current value of the <code>pickupDriverEmail</code> property.
     */
    public void setPickupDriverEmail(final String pPickupDriverEmail) {
        pickupDriverEmail = pPickupDriverEmail;
    }

    /**
     * Sets the <code>pickupDriverName</code> property.
     * <p>
     * 
     * @param pPickupDriverName
     *            the current value of the <code>pickupDriverName</code> property.
     */
    public void setPickupDriverName(final String pPickupDriverName) {
        pickupDriverName = pPickupDriverName;
    }

    /**
     * Sets the <code>pickupDriverPhoneNumber</code> property.
     * <p>
     * 
     * @param pPickupDriverPhoneNumber
     *            the current value of the <code>pickupDriverPhoneNumber</code> property.
     */
    public void setPickupDriverPhoneNumber(final String pPickupDriverPhoneNumber) {
        pickupDriverPhoneNumber = pPickupDriverPhoneNumber;
    }

    /**
     * Sets the <code>pickUpLocation</code> property.
     * <p>
     * 
     * @param pPickUpLocation
     *            the current value of the <code>pickUpLocation</code> property.
     */
    public void setPickUpLocation(final CustomerDto pPickUpLocation) {
        pickUpLocation = pPickUpLocation;
    }

    /**
     * Sets the <code>pickUpOperator</code> property.
     * <p>
     * 
     * @param pPickUpOperator
     *            the current value of the <code>pickUpOperator</code> property.
     */
    public void setPickUpOperator(final CustomerDto pPickUpOperator) {
        pickUpOperator = pPickUpOperator;
    }

    /**
     * Sets the <code>preOrderDate</code> property.
     * <p>
     * 
     * @param pPreOrderDate
     *            the current value of the <code>preOrderDate</code> property.
     */
    public void setPreOrderDate(final Date pPreOrderDate) {
       if(pPreOrderDate!=null)
    	   {
    	   this.preOrderDate =(Date) pPreOrderDate.clone();
    	   }
       else
       {
    	   this.preOrderDate=null;
       }
    }

    /**
     * Sets the <code>preOrderInd</code> property.
     * <p>
     * 
     * @param pPreOrderInd
     *            the current value of the <code>preOrderInd</code> property.
     */
    public void setPreOrderInd(final boolean pPreOrderInd) {
        preOrderInd = pPreOrderInd;
    }

    /**
     * Sets the <code>pricingDate</code> property.
     * <p>
     * 
     * @param pPricingDate
     *            the current value of the <code>pricingDate</code> property.
     */
    public void setPricingDate(final Date pPricingDate) {
        if(pPricingDate!=null)
        	{
        	this.pricingDate =(Date) pPricingDate.clone();
        	}
        else
        {
        	this.pricingDate=null;
        }
    }

    /**
     * Sets the <code>printableTotalColCharges</code> property.
     * <p>
     * 
     * @param pPrintableTotalColCharges
     *            the current value of the <code>printableTotalColCharges</code> property.
     */
    public void setPrintableTotalColCharges(
                final BigDecimal pPrintableTotalColCharges) {
        printableTotalColCharges = pPrintableTotalColCharges;
    }

    /**
     * Sets the <code>printableTotalPpdCharges</code> property.
     * <p>
     * 
     * @param pPrintableTotalPpdCharges
     *            the current value of the <code>printableTotalPpdCharges</code> property.
     */
    public void setPrintableTotalPpdCharges(
                final BigDecimal pPrintableTotalPpdCharges) {
        printableTotalPpdCharges = pPrintableTotalPpdCharges;
    }

    /**
     * Sets the <code>priority</code> property.
     * <p>
     * 
     * @param pPriority
     *            the current value of the <code>priority</code> property.
     */
    public void setPriority(final Integer pPriority) {
        priority = pPriority;
    }

    /**
     * Sets the <code>productCode</code> property.
     * <p>
     * 
     * @param pProductCode
     *            the current value of the <code>productCode</code> property.
     */
    public void setProductCode(final String pProductCode) {
        productCode = pProductCode;
    }

    /**
     * Sets the <code>qualityAssuranceIndicator</code> property.
     * <p>
     * 
     * @param pQualityAssuranceIndicator
     *            the current value of the <code>qualityAssuranceIndicator</code> property.
     */
    public void setQualityAssuranceIndicator(
                final String pQualityAssuranceIndicator) {
        qualityAssuranceIndicator = pQualityAssuranceIndicator;
    }


    /**
     * Sets the <code>rateF</code> property.
     * <p>
     * 
     * @param pRateF
     *            the current value of the <code>rateF</code> property.
     */
    public void setRateF(final BigDecimal pRateF) {
        rateF = pRateF;
    }

    /**
     * Sets the <code>rateFace</code> property.
     * <p>
     * 
     * @param pRateFace
     *            the current value of the <code>rateFace</code> property.
     */
    public void setRateFace(final BigDecimal pRateFace) {
        rateFace = pRateFace;
    }

    /**
     * Sets the <code>rateGenerationTypeA</code> property.
     * <p>
     * 
     * @param pRateGenerationTypeA
     *            the current value of the <code>rateGenerationTypeA</code> property.
     */
    public void setRateGenerationTypeA(
                final RateGenerationType pRateGenerationTypeA) {
        rateGenerationTypeA = pRateGenerationTypeA;
    }

    /**
     * Sets the <code>rateGenerationTypeF</code> property.
     * <p>
     * 
     * @param pRateGenerationTypeF
     *            the current value of the <code>rateGenerationTypeF</code> property.
     */
    public void setRateGenerationTypeF(
                final RateGenerationType pRateGenerationTypeF) {
        rateGenerationTypeF = pRateGenerationTypeF;
    }

    /**
     * Sets the <code>rateGenerationTypeP</code> property.
     * <p>
     * 
     * @param pRateGenerationTypeP
     *            the current value of the <code>rateGenerationTypeP</code> property.
     */
    public void setRateGenerationTypeP(
                final RateGenerationType pRateGenerationTypeP) {
        rateGenerationTypeP = pRateGenerationTypeP;
    }

    /**
     * Sets the <code>rateP</code> property.
     * <p>
     * 
     * @param pRateP
     *            the current value of the <code>rateP</code> property.
     */
    public void setRateP(final BigDecimal pRateP) {
        rateP = pRateP;
    }

    /**
     * Sets the <code>ratePieces</code> property.
     * <p>
     * 
     * @param pRatePieces
     *            the current value of the <code>ratePieces</code> property.
     */
    public void setRatePieces(final Integer pRatePieces) {
        ratePieces = pRatePieces;
    }

    /**
     * Sets the <code>routing</code> property.
     * <p>
     * 
     * @param pRouting
     *            the current value of the <code>routing</code> property.
     */
    public void setRouting(final String pRouting) {
        routing = pRouting;
    }

    /**
     * Sets the <code>ratePieces</code> property.
     * <p>
     * 
     * @param pRatePieces
     *            the current value of the <code>ratePieces</code> property.
     */
    public void setShipmentReference(final String pShipmentReference) {
        shipmentReference = pShipmentReference;
    }

	/**
	 * Sets the <code>shipmentStatus</code> property.
	 * <p>
	 * 
	 * @param pShipmentStatus
	 *            the current value of the <code>shipmentStatus</code> property.
	 */
	public void setShipmentStatus(final String pShipmentStatus) {
		this.shipmentStatus = pShipmentStatus;
    }

    /**
     * Sets the <code>ratePieces</code> property.
     * <p>
     * 
     * @param pRatePieces
     *            the current value of the <code>ratePieces</code> property.
     */
    public void setShipper(final CustomerDto pShipper) {
        shipper = pShipper;
    }

    /**
     * Sets the <code>shipperConsigneeExists</code> property.
     * <p>
     * 
     * @param pShipperConsigneeExists
     *            the current value of the <code>shipperConsigneeExists</code> property.
     */
    public void setShipperConsigneeExists(final boolean pShipperConsigneeExists) {
        shipperConsigneeExists = pShipperConsigneeExists;
    }

    /**
     * Sets the <code>specialHandlingCodes</code> property.
     * <p>
     * 
     * @param pSpecialHandlingCodes
     *            the current value of the <code>specialHandlingCodes</code> property.
     */
    public void setSpecialHandlingCodes(final List<String> pSpecialHandlingCodes) {
        specialHandlingCodes = pSpecialHandlingCodes;
    }
    
    /**
     * Sets the <code>comatProductcodes</code> property.
     * <p>
     * 
     * @param pComatProductcodes
     *            the current value of the <code>comatProductcodes</code> property.
     */
	public void setComatProductcodes(List<String> pComatProductcodes) {
		this.comatProductcodes = pComatProductcodes;
	}


    /**
     * Sets the <code>splCodes</code> property.
     * <p>
     * 
     * @param pSplCodes
     *            the current value of the <code>splCodes</code> property.
     */
    public void setSplCodes(final String pSplCodes) {
        splCodes = pSplCodes;
    }

    /**
     * Sets the <code>status</code> property.
     * <p>
     * 
     * @param pStatus
     *            the current value of the <code>status</code> property.
     */
    public void setStatus(final String pStatus) {
        status = pStatus;
    }

    /**
     * Sets the <code>statusDate</code> property.
     * <p>
     * 
     * @param pStatusDate
     *            the current value of the <code>statusDate</code> property.
     */
    public void setStatusDate(final Date pStatusDate) {
        if(pStatusDate!=null)
        	{
        	this.statusDate =(Date) pStatusDate.clone();
        	}
        else
        {
        	this.statusDate=null;
        }
    }

    /**
     * Sets the <code>surfaceDestination</code> property.
     * <p>
     * 
     * @param pSurfaceDestination
     *            the current value of the <code>surfaceDestination</code> property.
     */
    public void setSurfaceDestination(final CustomerDto pSurfaceDestination) {
        surfaceDestination = pSurfaceDestination;
    }

    /**
     * Sets the <code>surfaceDestinationStation</code> property.
     * <p>
     * 
     * @param pSurfaceDestinationStation
     *            the current value of the <code>surfaceDestinationStation</code> property.
     */
    public void setSurfaceDestinationStation(
                final String pSurfaceDestinationStation) {
        surfaceDestinationStation = pSurfaceDestinationStation;
    }

    /**
     * Sets the <code>surfaceOrigin</code> property.
     * <p>
     * 
     * @param pSurfaceOrigin
     *            the current value of the <code>surfaceOrigin</code> property.
     */
    public void setSurfaceOrigin(final CustomerDto pSurfaceOrigin) {
        surfaceOrigin = pSurfaceOrigin;
    }

    /**
     * Sets the <code>surfaceOriginStation</code> property.
     * <p>
     * 
     * @param pSurfaceOriginStation
     *            the current value of the <code>surfaceOriginStation</code> property.
     */
    public void setSurfaceOriginStation(final String pSurfaceOriginStation) {
        surfaceOriginStation = pSurfaceOriginStation;
    }

	/**
	 * Sets the <code>terminalDiscrepancyQueueInd</code> property.
	 * <p>
	 * 
	 * @param pTerminalDiscrepancyQueueInd
	 *            the current value of the
	 *            <code>terminalDiscrepancyQueueInd</code> property.
	 */
    public void setTerminalDiscrepancyQueueInd(final boolean pTerminalDiscrepancyQueueInd) {
        terminalDiscrepancyQueueInd = pTerminalDiscrepancyQueueInd;
    }

    /**
	 * Sets the <code>totalAcceptedPieces</code> property.
	 * <p>
	 * 
	 * @param pTotalAcceptedPieces
	 *            the current value of the <code>totalAcceptedPieces</code>
	 *            property.
	 */
	public void setTotalAcceptedPieces(final Long pTotalAcceptedPieces) {
		this.totalAcceptedPieces = pTotalAcceptedPieces;
    }

    /**
     * Sets the <code>totalAcceptedPiecesAtER</code> property.
     * <p>
     * 
     * @param pTotalAcceptedPiecesAtER
     *            the current value of the <code>totalAcceptedPiecesAtER</code> property.
     */
    public void setTotalAcceptedPiecesAtER(final Long pTotalAcceptedPiecesAtER) {
        totalAcceptedPiecesAtER = pTotalAcceptedPiecesAtER;
    }

    /**
	 * @param pTotalAcceptedVolume
	 *            the totalAcceptedVolume to set
	 */
	public void setTotalAcceptedVolume(final BigDecimal pTotalAcceptedVolume) {
		this.totalAcceptedVolume = pTotalAcceptedVolume;
    }

	/**
	 * @param pTotalAcceptedWeight
	 *            the totalAcceptedWeight to set
	 */
	public void setTotalAcceptedWeight(final BigDecimal pTotalAcceptedWeight) {
		this.totalAcceptedWeight = pTotalAcceptedWeight;
    }

	/**
     * Sets the <code>totalExecutedPieces</code> property.
     * <p>
     * 
     * @param pTotalExecutedPieces
     *            the current value of the <code>totalExecutedPieces</code> property.
     */
    public void setTotalExecutedPieces(final Long pTotalExecutedPieces) {
        totalExecutedPieces = pTotalExecutedPieces;
    }

	/**
     * Sets the <code>totalHawbGrossWeight</code> property.
     * <p>
     * 
     * @param pTotalHawbGrossWeight
     *            the current value of the <code>totalHawbGrossWeight</code> property.
     */
    public void setTotalHawbGrossWeight(final BigDecimal pTotalHawbGrossWeight) {
        totalHawbGrossWeight = pTotalHawbGrossWeight;
    }
	
	/**
     * Sets the <code>totalHawbPieces</code> property.
     * <p>
     * 
     * @param pTotalHawbPieces
     *            the current value of the <code>totalHawbPieces</code> property.
     */
    public void setTotalHawbPieces(final Long pTotalHawbPieces) {
        totalHawbPieces = pTotalHawbPieces;
    }

	/**
     * Sets the <code>totalPieces</code> property.
     * <p>
     * 
     * @param pTotalPieces
     *            the current value of the <code>totalPieces</code> property.
     */
    public void setTotalPieces(final Long pTotalPieces) {
        totalPieces = pTotalPieces;
    }

	/**
     * Sets the <code>totalReceivedPiecesAtIR</code> property.
     * <p>
     * 
     * @param pTotalReceivedPiecesAtIR
     *            the current value of the <code>totalReceivedPiecesAtIR</code> property.
     */
    public void setTotalReceivedPiecesAtIR(final Long pTotalReceivedPiecesAtIR) {
        totalReceivedPiecesAtIR = pTotalReceivedPiecesAtIR;
    }

    /**
     * Sets the <code>totalVolume</code> property.
     * <p>
     * 
     * @param pTotalVolume
     *            the current value of the <code>totalVolume</code> property.
     */
    public void setTotalVolume(final BigDecimal pTotalVolume) {
        totalVolume = pTotalVolume;
    }

    /**
     * Sets the <code>totalWeight</code> property.
     * <p>
     * 
     * @param pTotalWeight
     *            the current value of the <code>totalWeight</code> property.
     */
    public void setTotalWeight(final BigDecimal pTotalWeight) {
        totalWeight = pTotalWeight;
    }

    /**
     * Sets the <code>trackAndTraceIndicator</code> property.
     * <p>
     * 
     * @param pTrackAndTraceIndicator
     *            the current value of the <code>trackAndTraceIndicator</code> property.
     */
    public void setTrackAndTraceIndicator(final String pTrackAndTraceIndicator) {
        trackAndTraceIndicator = pTrackAndTraceIndicator;
    }

    /**
     * Sets the <code>transfer</code> property.
     * <p>
     * 
     * @param pTransfer
     *            the current value of the <code>transfer</code> property.
     */
    public void setTransfer(final String pTransfer) {
        transfer = pTransfer;
    }

    /**
     * Sets the <code>w_Subcontractor</code> property.
     * <p>
     * 
     * @param pWSubcontractor
     *            the current value of the <code>w_Subcontractor</code> property.
     */
    public void setW_Subcontractor(final CustomerDto pWSubcontractor) {
        w_Subcontractor = pWSubcontractor;
    }

	/**
	 * Sets the <code>workOrderItemStatus</code> property.
	 * <p>
	 * 
	 * @param pWorkOrderItemStatus
	 *            the current value of the <code>workOrderItemStatus</code>
	 *            property.
	 */
	public void setWorkOrderItemStatus(final String pWorkOrderItemStatus) {
		this.workOrderItemStatus = pWorkOrderItemStatus;
    }

	/**
	 * Sets the <code>workOrderStatus</code> property.
	 * <p>
	 * 
	 * @param pWorkOrderStatus
	 *            the current value of the <code>workOrderStatus</code>
	 *            property.
	 */
	public void setWorkOrderStatus(final String pWorkOrderStatus) {
		this.workOrderStatus = pWorkOrderStatus;
    }

	/**
	 * Sets the <code>workOrderTarget</code> property.
	 * <p>
	 * 
	 * @param pWorkOrderTarget
	 *            the current value of the <code>workOrderTarget</code>
	 *            property.
	 */
	public void setWorkOrderTarget(final String pWorkOrderTarget) {
		this.workOrderTarget = pWorkOrderTarget;
    }

	/**
	 * Sets the <code>workOrderTargetLocation</code> property.
	 * <p>
	 * 
	 * @param pWorkOrderTargetLocation
	 *            the current value of the <code>workOrderTargetLocation</code>
	 *            property.
	 */
	public void setWorkOrderTargetLocation(final String pWorkOrderTargetLocation) {
		this.workOrderTargetLocation = pWorkOrderTargetLocation;
    }

	/**
	 * Sets the <code>workOrderType</code> property.
	 * <p>
	 * 
	 * @param pWorkOrderType
	 *            the current value of the <code>workOrderType</code> property.
	 */
	public void setWorkOrderType(final String pWorkOrderType) {
		this.workOrderType = pWorkOrderType;
    }

	/**
	 * @return the timeOfAvailability
	 */
	public Date getTimeOfAvailability() {
		return this.timeOfAvailability;
	}

	/**
	 * @param pTimeOfAvailability
	 *            the timeOfAvailability to set
	 */
	public void setTimeOfAvailability(final Date pTimeOfAvailability) {
		this.timeOfAvailability = pTimeOfAvailability;
	}

	/**
	 * @return the storageChargesStartDate
	 */
	public Date getStorageChargesStartDate() {
		return this.storageChargesStartDate;
	}

	/**
	 * @param pStorageChargesStartDate
	 *            the storageChargesStartDate to set
	 */
	public void setStorageChargesStartDate(final Date pStorageChargesStartDate) {
		this.storageChargesStartDate = pStorageChargesStartDate;
	}

	/**
	 * @return the hAWBValidate
	 */
	public boolean ishAWBValidate() {
		return this.hAWBValidate;
	}

	/**
	 * @param pHAWBValidate
	 *            the hAWBValidate to set
	 */
	public void sethAWBValidate(final boolean pHAWBValidate) {
		this.hAWBValidate = pHAWBValidate;
	}

	/**
	 * @return the awbPiecesImportCleared
	 */
	public Integer getAwbPiecesImportCleared() {
		return this.awbPiecesImportCleared;
	}

	/**
	 * @param pAwbPiecesImportCleared
	 *            the awbPiecesImportCleared to set
	 */
	public void setAwbPiecesImportCleared(final Integer pAwbPiecesImportCleared) {
		this.awbPiecesImportCleared = pAwbPiecesImportCleared;
	}

	/**
	 * @return the transitCustomIndicator
	 */
	public boolean isTransitCustomIndicator() {
		return this.transitCustomIndicator;
	}

	/**
	 * @param pTransitCustomIndicator
	 *            the transitCustomIndicator to set
	 */
	public void setTransitCustomIndicator(final boolean pTransitCustomIndicator) {
		this.transitCustomIndicator = pTransitCustomIndicator;
	}

	/**
	 * @return the piecesMismatch
	 */
	public String getPiecesMismatch() {
		return this.piecesMismatch;
	}

	/**
	 * @param piecesMismatch
	 *            the piecesMismatch to set
	 */
	public void setPiecesMismatch(String piecesMismatch) {
		this.piecesMismatch = piecesMismatch;
	}

	/**
	 * @return the weightMismatch
	 */
	public String getWeightMismatch() {
		return this.weightMismatch;
	}

	/**
	 * @param weightMismatch
	 *            the weightMismatch to set
	 */
	public void setWeightMismatch(String weightMismatch) {
		this.weightMismatch = weightMismatch;
	}

	/**
	 * @return the participantNotifyIndicator
	 */
	public String getParticipantNotifyIndicator() {
		return this.participantNotifyIndicator;
	}

	/**
	 * @param participantNotifyIndicator
	 *            the participantNotifyIndicator to set
	 */
	public void setParticipantNotifyIndicator(String participantNotifyIndicator) {
		this.participantNotifyIndicator = participantNotifyIndicator;
	}

	 /**
     * Attribute to holds <code>domesticChineseAWBIndicator</code> property.
     */
    private boolean domesticChineseAWBIndicator;
    
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

	public String getHouseConsolidationIndicator() {
		return houseConsolidationIndicator;
	}

	public void setHouseConsolidationIndicator(String houseConsolidationIndicator) {
		this.houseConsolidationIndicator = houseConsolidationIndicator;
	}

    public boolean isOriginatedAsFwb() {
        return originatedAsFwb;
    }

    public void setOriginatedAsFwb(boolean originatedAsFwb) {
        this.originatedAsFwb = originatedAsFwb;
    }
    
    /**
     * Attribute to hold the <code>splswithColorCodes</code> property.
     */
    private Map<String, String> splswithColorCodes = new HashMap<String, String>();
    
    /**
     * @return the splswithColorCodes
     */
    public Map<String, String> getSplswithColorCodes() {
		return this.splswithColorCodes;
    }
    
    /**
   	 * @param pSplswithColorCodes
   	 *            the splswithColorCodes to set
   	 */
   	public void setSplswithColorCodes(
   			final Map<String, String> pSplswithColorCodes) {
   		this.splswithColorCodes = pSplswithColorCodes;
       }

	/**
	 * @return the revenueOid
	 */
	public Long getRevenueOid() {
		return revenueOid;
	}

	/**
	 * @param revenueOid the revenueOid to set
	 */
	public void setRevenueOid(Long revenueOid) {
		this.revenueOid = revenueOid;
	}

	public List<RatingLineRulesDto> getRatingLineRulesDtos() {
		return this.ratingLineRulesDtos;
	}

	public void setRatingLineRulesDtos(final List<RatingLineRulesDto> pRatingLineRulesDtos) {
		this.ratingLineRulesDtos = pRatingLineRulesDtos;
	}

   
}
