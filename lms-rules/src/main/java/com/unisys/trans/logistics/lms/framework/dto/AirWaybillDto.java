package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.constants.AirWaybillAdditionalFunction;
import com.unisys.trans.logistics.lms.framework.constants.AirWaybillType;
import com.unisys.trans.logistics.lms.framework.constants.ChecklistCompleteIndicatorType;
import com.unisys.trans.logistics.lms.framework.constants.DueType;
import com.unisys.trans.logistics.lms.framework.dto.constants.GoodsStatusType;
import com.unisys.trans.logistics.lms.framework.dto.constants.SelectionType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AirwaybillDto</code> is used for find Airwaybill information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>airWaybillNumber
 * <li>exportCreditCardDetailsDto
 * <li>importCreditCardDetailsDto
 * <li>awbDestinationIataRegion
 * <li>awbDetail
 * <li>booking
 * <li>bookingSegment
 * <li>charge
 * <li>commodityCode
 * <li>createdDate
 * <li>customerSegmentation
 * <li>destination
 * <li>executionDateTime
 * <li>houseAirwaybills
 * <li>identifier
 * <li>numberOfPages
 * <li>oId
 * <li>origin
 * <li>otherCharges
 * <li>padType
 * <li>participants
 * <li>productCode
 * <li>productQueueServiceLevel
 * <li>rateEntries
 * <li>revenue
 * <li>routes
 * <li>shipmentStatusEntries
 * <li>specialHandlingCodes
 * <li>splCodes
 * <li>status
 * <li>transfer
 * <li>userAudit
 * <li>userIdentifier
 * <li>routes
 * <li>shipmentStatusEntries
 * <li>specialHandlingCodes
 * <li>awbPrintOption
 * <li>specialUldRemarks
 * </ul>
 */
public class AirWaybillDto extends PersistenceObjectDto {
	
	 private List<SelectionType> selectedList;

    /**
     * Unique serial version UID.
     */

    private static final long serialVersionUID = 3074496136563043353L;

    /**
     * Attribute to hold the <code>additionalAWBFunctions</code> property.
     */
    private AirWaybillAdditionalFunction additionalAWBFunctions;

    /**
     * Attribute to hold the <code>airWaybillNumber</code> property.
     */
    private AirWaybillNumberDto airWaybillNumber;

    /**
     * Attribute to hold the <code>airWaybillType</code> property.
     */
    private AirWaybillType airWaybillType;

    /**
     * Attribute to hold the <code>alertCodeColor</code> property.
     */
    private String alertCodeColor;
    
    
    private Boolean orderCompleteInd;

	/**
     * Attribute to hold <code>arrivalFlight</code> property.
     */
    private FlightInfoDto arrivalFlight;

    /**
     * Attribute to hold the <code>airWaybillNumber</code> property.
     */
    private List<AWBCustomsInformationDto> awbCustomsInformationDtos;
    /**
     * Attribute to hold the <code>airWaybillNumber</code> property.
     */
    private String nonMechOffloadStation;
    /**
     * Attribute to hold the <code>awbDetail</code> property.
     */
    private AirWaybillDetailDto awbDetail;

    /**
     * Attribute to hold the <code>awbDocumentDtos</code> property.
     */
    private List<AWBDocumentDto> awbDocumentDtos;

    /**
     * Attribute to hold the list of PaymentEntryDto <code> paymentEntryDtos </code> property.
     */
    private List<AWBPaymentEntryDto> awbPaymentEntries;

    /**
     * Attribute to hold the <code>awbRemarksDtos</code> property.
     */
    private List<AWBRemarksDto> awbRemarksDtos;

    /**
     * Attribute to hold the <code>booking</code> property.
     */
    private BookingDto booking;

    /**
     * Attribute to hold the <code> bookingIndicator</code> property.
     */
    private boolean bookingIndicator;

    /**
     * Attribute to hold the <code>bookingSegment</code> property.
     */
    private BookingSegmentDto bookingSegment;
    /**
     * Attribute to hold the <code>CargoCorrectionAdviseDto</code> property.
     */
    private CargoCorrectionAdviseDto CargoCorrectionAdviseDto;

    private List<AWBShipmentStatusDto> awbShipmentStatusDto;
    
    //DL619 start
    private GoodsStatusType goodsStatusChangeType;    
   
    private ChecklistCompleteIndicatorType checklistCompleteIndicatorType;    
   
    private String checkListName;
    //DL619 end
    
    private String updateLMSFunction;
    
    private String loyaltyId;
    
    private BigDecimal baseLoyaltyPoints;
    
    private BigDecimal bonusLoyaltypoints;
    
    private String loyaltyMemberName;
    
    private Integer totalLoyaltyPoints;
    
    private String awbDatabaseKey;
    
    private int awbVersion;
    
    private String transitTransferInd;
    
    private Date expiryDateTime;
    
    private String customerSegmentation;
    
    private Integer productQueueServiceLevel;
    

	/* FIS139 - START */
    private String shipperName; 
    
    private String contactName; 
                                 
    private String contactNumber;
   
    private List<PharmaLogEntryDto> pharmaLogEntryDtos;
	/**
	 * @return the pharmaLogEntryDtos
	 */
	public List<PharmaLogEntryDto> getPharmaLogEntryDtos() {
		if (this.pharmaLogEntryDtos == null) {
			this.pharmaLogEntryDtos = new ArrayList<PharmaLogEntryDto>();
		}
		return this.pharmaLogEntryDtos;
	}

	/**
	 * @param pPharmaLogEntryDtos
	 *            the pPharmaLogEntryDtos to set
	 */
	public void setPharmaLogEntryDtos(
			final List<PharmaLogEntryDto> pPharmaLogEntryDtos) {
		this.pharmaLogEntryDtos = pPharmaLogEntryDtos;
	}
	public String getShipperName() {
		return shipperName;
	}

	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}
	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	/* FIS139 - END */
    
	public List<AWBShipmentStatusDto> getAwbShipmentStatusDto() {
		return awbShipmentStatusDto;
	}

	public void setAwbShipmentStatusDto(
			List<AWBShipmentStatusDto> awbShipmentStatusDto) {
		this.awbShipmentStatusDto = awbShipmentStatusDto;
	}	

    
	public Boolean isOrderCompleteInd() {
		return orderCompleteInd;
	}

	public void setOrderCompleteInd(Boolean orderCompleteInd) {
		this.orderCompleteInd = orderCompleteInd;
	}


	/**
     * Attribute to hold the <code>CargoCorrectionAdviseDto's</code> property.
     */
    private List<CargoCorrectionAdviseDto> cargoCorrectionAdviseDtos;

    /**
     * Attribute to hold the <code>codeRedIndicator</code> property.
     */
    private String codeRedIndicator;

    /**
     * Collect Cash Total
     */
    private BigDecimal colCashTotal;

    /**
     * Attribute to hold the <code>commodityCode</code> property.
     */
    private String commodityCode;

    /**
     * Attribute to hold the <code>contractToApply</code> property.
     */
    private String contractToApply;

    /**
     * Attribute to hold the <code>createdDate</code> property.
     */
    private Date createdDate;

    /**
     * Attribute to holds <code>customsStation</code> property.
     */
    private String customsStation;

    /**
     * Attribute to hold the <code>destination</code> property.
     */
    private String destination;

    /**
     * Attribute to holds <code>ecaIndicator</code> property.
     */

    private boolean ecaIndicator;
    
    /**
     * Attribute to holds <code>efmIndicator</code> property.
     */
    private boolean efmIndicator;

    /**
     * Boolean indicator.
     */
    private boolean eqaLockingAuthorityIndicator;

    /**
     * station.
     */
    private String eqaSation;

    /**
     * Attribute to hold the <code> exchangeRateDestHst</code> property.
     */
    private BigDecimal exchangeRateDestHst;

    /**
     * Attribute to hold the <code> exchangeRateOrgHst</code> property.
     */
    private BigDecimal exchangeRateOrgHst;

    /**
     * Attribute to hold the <code>airWaybillExportCreditCardDetails</code> property.
     */
    private CreditCardDetailsDto exportCreditCardDetailsDto;

    /**
     * Attribute to hold the <code> foundIndicator</code> property.
     */
    private String foundIndicator;

    /**
     * Attribute to hold the <code> FSDCIndicator</code> property.
     */
    private boolean fsdcIndicator;

    /**
     * Attribute to hold the <code>fwbErrorMessage</code> property.
     */
    private String fwbErrorMessage;

    /**
     * Attribute to hold the <code>fwbWarningMessage</code> property.
     */
    private String fwbWarningMessage;

    /**
     * Attribute to hold the <code>goodsPiecesProcessed</code> property.
     */
    private int goodsPiecesProcessed;

    /**
     * Attribute to hold the <code>houseAirwaybills</code> property.
     */
    private List<HouseAWBDto> hAWbs;

    /**
     * Attribute to hold the <code>houseAirwaybills</code> property.
     */
    private List<AwbHouseAirwaybillDto> houseAirwaybills;

    /**
     * Attribute to hold the <code>identifier</code> property.
     */
    private String identifier;

    /**
     * Attribute to hold the <code>airWaybillImportCreditCardDetails</code> property.
     */
    private CreditCardDetailsDto importCreditCardDetailsDto;

    /**
     * Attribute to hold the <code>internationalPopupConfirm</code> property.
     */
    private boolean internationalPopupConfirm;

    /**
     * Attribute to hold <code>isCCADisplayRequired</code> property.
     */
    private boolean ccaDisplayRequired;

    /**
     * Attribute to hold <code>isCCADisplayRequired</code> property.
     */
    private boolean genrationOfCCARequired;

    /**
     * Attribute to hold the <code>neverFoundIndicator</code> property.
     */
    private String neverFoundIndicator;

    /**
     * Attribute to hold the <code>numberOfPages</code> property.
     */
    private int numberOfPages;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>operationalStatus</code> property.
     */
    private GoodsStatusType operationalStatus;

    /**
     * Attribute to hold the <code> origin</code> property.
     */
    private String origin;

    /**
     * Attribute to hold the list of OtherChargesDto <code> otherCharges</code> property.
     */
    private List<OtherChargesDto> otherCharges;

    /**
     * Attribute to hold the <code> padType</code> property.
     */
    private String padType;

    /**
     * Attribute to hold the list of AirWaybillParticipantDto <code> participants</code> property.
     */
    private List<AirWaybillParticipantDto> participants;

    /**
     * Attribute to hold the <code> popupConfirm</code> property.
     */
    private boolean popupConfirm;

    /**
     * Attribute to hold the <code>productCode</code> property.
     */
    private String productCode;

    /**
     * Attribute to hold the <code> rateEntries</code> property.
     */
    private List<RatingLineEntryDto> rateEntries;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long referenceOId;

    /**
     * Attribute to hold the <code>revenue</code> property.
     */
    private AirWaybillRevenueDto revenue;

    /**
     * Attribute to hold the <code>  routes</code> property.
     */
    private List<RouteDto> routes;

    /**
     * Attribute to hold the <code>  rowIndex</code> property.
     */
    private String rowIndex;

    /**
     * Attribute to hold the <code> shipmentAttachmentsDto</code> property.
     */
    private List<ShipmentAttachmentsDto> shipmentAttachmentsDto;

    /**
     * Attribute to hold the <code> shipmentDimensionDto</code> property.
     */
    private ShipmentDimensionDto shipmentDimensionDto;

    /**
     * Attribute to hold the <code>specialHandlingCodes</code> property.
     */
    private List<String> specialHandlingCodes;

    /**
     * Attribute to hold the <code>splCodes</code> property.
     */
    private String splCodes;

    /**
     * Attribute to hold the <code>splswithColorCodes</code> property.
     */
    private Map<String, String> splswithColorCodes = new HashMap<String, String>();
    /**
     * Attribute to hold the <code>status</code> property.
     */
    private String status;

    /**
     * Attribute to hold the <code> userIdentifier</code> property.
     */
    private TotalChargeDto totalChargeDto;

    /**
     * Attribute to hold the <code> userIdentifier</code> property.
     */
    private BigDecimal totalHawbGrossWeight;

    /**
     * Attribute to hold the <code>totalHawbPieces</code> property.
     */
    private Long totalHawbPieces;

    /**
     * Attribute to hold the <code>trackAndTraceIndicator</code> property.
     */
    private String trackAndTraceIndicator;

    /**
     * Attribute to hold the <code> transfer</code> property.
     */
    private String transfer;

    /**
     * Attribute to hold the <code> unNumberDtos</code> property.
     */
    private List<UNNumberDto> unNumberDtos = new ArrayList<UNNumberDto>();

    /**
     * Attribute to hold the <code> userAuditDto</code> property.
     */
    private UserAuditDto userAuditDto;

    /**
     * Attribute to hold the <code> userIdentifier</code> property.
     */
    private String userIdentifier;

	/**
	 * Attribute to hold the <code> workOrderItemStatus</code> property.
	 */
    private String workOrderItemStatus;



    /**
     * Attribute to holds <code>addedGoodsDetailDtoMap</code> property.
     */
    private Map<String, List<GoodsDetailDto>> addedGoodsDetailDtoMap;
    
    /**
     * Attribute to holds <code>addedGoodsDetailDtos</code> property.
     */
    private List<GoodsDetailDto> addedGoodsDetailDtos;
    
    
    /**
     * Attribute to holds <code>deletedGoodsDetailDtos</code> property.
     */
    private List<GoodsDetailDto> deletedGoodsDetailDtos;
    
    /**
     * Attribute to holds <code>goodsDetailDto</code> property.
     */
    private GoodsDetailDto goodsDetailDto;
    
    /**
     * Attribute to holds <code>goodsDetailDtos</code> property.
     */
    private List<GoodsDetailDto> goodsDetailDtos;
    
    /**
     * Attribute to holds <code>upadtedGoodsDetailDtos</code> property.
     */
    private List<GoodsDetailDto> upadtedGoodsDetailDtos;
    
    /**
     * Attribute to holds <code>upadtedGoodsDetailDtos</code> property.
     */
    private String portDischarge;

	/**
	 * Attribute to holds <code>specialUldRemarks</code> property.
	 */
	private List<SpecialUldRemarksDto> specialUldRemarks;

	/**
	 * Attribute to holds <code>specialUldRemarks</code> property.
	 */
	private List<SpecialUldRemarksDto> ExistSpecialUldRemarks;

	/**
	 * Attribute to hold the <code>totalHawbPieces</code> property.
	 */
	private Long importClearedPieces;
	
	
	//RFC SK164H changes : Start
	
	/* Attribute to hold the <code> associatedOID</code> property.
     */
    private Long associatedOID;

    /**
     * Attribute to hold the <code>bookingFeeWaivedCounter</code> property.
     */
    private Integer bookingFeeWaivedCounter;

    /**
     * Attribute to hold the <code>feeEventTriggered</code> property.
     */
    private boolean feeEventTriggered;

    /**
     * Attribute to hold <code>associatedAWBList</code> property.
     */
    private List<AirWaybillDto> associatedAWBList = new ArrayList<AirWaybillDto>();
    
    /**
     * Attribute to hold the <code>AssociatedairWaybillNumber</code> property.
     */
    private AirWaybillNumberDto associatedAWBNumber;
    
    //RFC SK164H changes : End

	// MH007
	/**
	 * Attribute to hold the <code>airwaybillChangeInd</code> property.
	 */
	private boolean airwaybillChangeInd;

	// AC396 start
	/**
	 * Attribute to hold the <code>eawbSignatureParameter</code> property.
	 */

	private String eawbSignatureParameter;
	// AC396 end

	// DL562 Starts
	/**
	 * Attribute to hold the <code>domestic</code> flag property.
	 */
	private boolean domestic;
	
	/*RFC-CR-2000568-Start*/
	/**
	 * Attribute to hold the <code>service</code> flag property.
	 */
	private String service;
	
	 /* AC429 begins here*/    
    /**
     * AC429 - Attribute to hold <code>isOnlyParticipantUpdated</code> property.<br>
     */
    private boolean isOnlyParticipantUpdated = false;
    
    /**
     * AC429 - Attribute to hold <code>isShipperUpdated</code> property.<br>
     */
    private boolean isShipperUpdated = false;
    
    /**
     * AC429 - Attribute to hold <code>isAgentUpdated</code> property.<br>
     */ 
    private boolean isAgentUpdated = false;
   
    /**
     * AC429 - Attribute to hold <code>tprAddress</code> property.<br>
     */ 
    private String tprAddress;
    
    /**
     * AC429 - Attribute to hold <code>isGoodsAccepted</code> property.<br>
     */ 
    private boolean isGoodsAccepted = false;
    
    /**
     * AC429 - Attribute to hold <code>ttyAddress</code> property.<br>
     */ 
    private String ttyAddress;
    
    /**
     * AC429 - Attribute to hold <code>isRulesfailed</code> property.<br>
     */ 
    private boolean isRulesfailed = false;
    
    /* AC429 end here*/ 
    
    /**
     * Attribute to hold the list of AirWaybillParticipantDto <code> participants</code> property.
     */
    private ParticipantDto participant;
    
    
    private AirWaybillNumberDto referenceAirwaybill;
    
    private String plannedAllotmentId;
    
    private Date allotmentDate;
    
    private boolean locked;
    
    private String carrier;
    
    
    /**
     * Attribute to Hold the List<code>AirWaybillSpecialHandlingCodeDto</code>
    */
 	private List<AirWaybillSpecialHandlingCodeDto> airWaybillSpecialHandlingCodes = new ArrayList<AirWaybillSpecialHandlingCodeDto>();
 	 	
    
    /* AC429-End*/     
 	
//DL615 starts
    
    private int createdDateForRules;
    
	private String originCountry;
    
    private String destinationCountry;
    
    private int ruleHierarchyOrder;
    
    private String paymentCodeRule;
    
    private String originAggregate;
	
	private String destinationAggregate;
	
	//DL615 ends 
    
    private boolean disbleAgentParticipant;
    
	public List<AirWaybillSpecialHandlingCodeDto> getAirWaybillSpecialHandlingCodes() {
		return airWaybillSpecialHandlingCodes;
	}

	public void setAirWaybillSpecialHandlingCodes(List<AirWaybillSpecialHandlingCodeDto> airWaybillSpecialHandlingCodes) {
		this.airWaybillSpecialHandlingCodes = airWaybillSpecialHandlingCodes;
	}



	/**
	 * @return the service
	 * 
	 * 
	 */	
	
	/*
	 * TR-2005998 start
	 */
	private List<String> importReferenceNumber;
	
	
	private String  CUITorTRINprefix;
	
	private boolean bookingInd;
	
	private boolean updateAWBInd;
	
	private DueType dueType;
	
	private List<String> dimensionDescriptions;
	
	private boolean deleteInd;
	
	private List<String> specialHandlingRemarks;
	
	/**
	 * @return the isOnlyParticipantUpdated
	 */
	public boolean isOnlyParticipantUpdated() {
		return isOnlyParticipantUpdated;
	}

	/**
	 * @param isOnlyParticipantUpdated the isOnlyParticipantUpdated to set
	 */
	public void setOnlyParticipantUpdated(boolean isOnlyParticipantUpdated) {
		this.isOnlyParticipantUpdated = isOnlyParticipantUpdated;
	}

	/**
	 * @return the isShipperUpdated
	 */
	public boolean isShipperUpdated() {
		return isShipperUpdated;
	}

	/**
	 * @param isShipperUpdated the isShipperUpdated to set
	 */
	public void setShipperUpdated(boolean isShipperUpdated) {
		this.isShipperUpdated = isShipperUpdated;
	}

	/**
	 * @return the isAgentUpdated
	 */
	public boolean isAgentUpdated() {
		return isAgentUpdated;
	}

	/**
	 * @param isAgentUpdated the isAgentUpdated to set
	 */
	public void setAgentUpdated(boolean isAgentUpdated) {
		this.isAgentUpdated = isAgentUpdated;
	}

	public List<String> getImportReferenceNumber() {
		return importReferenceNumber;
	}

	public void setImportReferenceNumber(List<String> importReferenceNumber) {
		this.importReferenceNumber = importReferenceNumber;
	}
	/*
	 * TR-2005998 end
	 * 
	 */

	public String getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(String service) {
		this.service = service;
	}
	/*RFC-CR-2000568-End*/
	/**
	 * Gets the value of the <code>importClearedPieces</code>property.
	 * <p>
	 *
	 * @return <code>importClearedPieces</code><br>
	 *         Returns the <code>importClearedPieces</code>.<br>
	 *         </p>
	 */
    public Long getImportClearedPieces() {
		return this.importClearedPieces;
 	}
 
    /**
     * Adds the <code>SplCode</code> property.
     * <p>
     *
     * @return the current value of the <code>SplCode</code> property.
     */

    public boolean add(final String pSplCode) {
        return specialHandlingCodes.add(pSplCode);
    }

    /**
     * Gets the value of the <code>additionalAWBFunctions</code>property.
     * <p>
     *
     * @return <code>AirWaybillAdditionalFunction</code><br>
     *         Returns the <code>additionalAWBFunctions</code>.<br>
     *         </p>
     */
    public AirWaybillAdditionalFunction getAdditionalAWBFunctions() {
        return additionalAWBFunctions;
    }
    /**
     * Gets the <code>airWaybillNumber</code> property.
     * <p>
     *
     * @return the current value of the <code>airWaybillNumber</code> property.
     */

    public AirWaybillNumberDto getAirWaybillNumber() {
        if (airWaybillNumber == null) {
            airWaybillNumber = new AirWaybillNumberDto();
        }
        return airWaybillNumber;
    }

    
    public String getNonMechOffloadStation() {
  		return this.nonMechOffloadStation;
  	}

    /**
     * Gets the <code>airWaybillType</code> property.
     * <p>
     *
     * @return the current value of the <code>airWaybillType</code> property.
     */
    public AirWaybillType getAirWaybillType() {
        return airWaybillType;
    }

    /**
     * Gets the <code>alertCodeColor</code> property.
     * <p>
     *
     * @return the current value of the <code>alertCodeColor</code> property.
     */
    public String getAlertCodeColor() {
        return alertCodeColor;
    }

    /**
     * Gets the <code>ArrivalFlight</code> property.
     * <p>
     *
     * @return the current value of the <code>ArrivalFlight</code> property.
     */
    public FlightInfoDto getArrivalFlight() {
        if (arrivalFlight == null) {
            arrivalFlight = new FlightInfoDto();
        }
        return arrivalFlight;
    }

    /**
     * @return the awbCustomsInformationDto
     */
    public List<AWBCustomsInformationDto> getAwbCustomsInformationDtos() {
        return awbCustomsInformationDtos;
    }

    /**
     * Gets the <code>awbDetail</code> property.
     * <p>
     *
     * @return the current value of the <code>awbDetail</code> property.
     */

    public AirWaybillDetailDto getAwbDetail() {
        if (awbDetail == null) {
            awbDetail = new AirWaybillDetailDto();
        }
        return awbDetail;
    }

    /**
     * Gets the <code>awbDocumentDtos</code> property.
     * <p>
     *
     * @return the current value of the <code>awbDocumentDtos</code> property.
     */

    public List<AWBDocumentDto> getAwbDocumentDtos() {
        return awbDocumentDtos;
    }

    /**
     * Gets the value of the <code>paymentEntries</code>property.
     * <p>
     *
     * @return <code>paymentEntries</code><br>
     *         Returns the <code>paymentEntries</code>.<br>
     *         </p>
     */

    public List<AWBPaymentEntryDto> getAwbPaymentEntries() {
        if (awbPaymentEntries == null) {
            awbPaymentEntries = new ArrayList<AWBPaymentEntryDto>();
        }
        return awbPaymentEntries;
    }
    /**
     * Gets the <code>awbRemarksDtos</code> property.
     * <p>
     *
     * @return the current value of the <code>awbRemarksDtos</code> property.
     */
    public List<AWBRemarksDto> getAwbRemarksDtos() {
        if (awbRemarksDtos == null) {
            awbRemarksDtos = new ArrayList<AWBRemarksDto>();
        }
        return awbRemarksDtos;
    }

    /**
     * Gets the <code>booking</code> property.
     * <p>
     *
     * @return the current value of the <code>booking</code> property.
     */

    @Deprecated
    public BookingDto getBooking() {
        if (booking == null) {
            booking = new BookingDto();
        }
        return booking;
    }
    /**
     * Gets the <code>bookingSegment</code> property.
     * <p>
     *
     * @return the current value of the <code>bookingSegment</code> property.
     */

    public BookingSegmentDto getBookingSegment() {
        if (bookingSegment == null) {
            bookingSegment = new BookingSegmentDto();
        }
        return bookingSegment;
    }

    /**
     * Gets the <code>CargoCorrectionAdviseDto</code> property.
     * <p>
     *
     * @return the current value of the <code>CargoCorrectionAdviseDto</code> property.
     */
    public CargoCorrectionAdviseDto getCargoCorrectionAdviseDto() {
        return CargoCorrectionAdviseDto;
    }

    /**
     * Gets the <code>cargoCorrectionAdviseDtos</code> property.
     * <p>
     *
     * @return the current value of the <code>cargoCorrectionAdviseDtos</code> property.
     */
    public List<CargoCorrectionAdviseDto> getCargoCorrectionAdviseDtos() {
        if (cargoCorrectionAdviseDtos == null) {
            cargoCorrectionAdviseDtos = new ArrayList<CargoCorrectionAdviseDto>();
        }
        return cargoCorrectionAdviseDtos;
    }

    /**
     * Gets the <code>codeRedIndicator</code> property.
     * <p>
     *
     * @return the current value of the <code>codeRedIndicator</code> property.
     */
    public String getCodeRedIndicator() {
        return codeRedIndicator;
    }

    /**
     * Gets the value of the <code>colCashTotal</code>property.
     * <p>
     *
     * @return <code>BigDecimal</code><br>
     *         Returns the <code>colCashTotal</code>.<br>
     *         </p>
     */
    public BigDecimal getColCashTotal() {
        return colCashTotal;
    }

    /**
     * Gets the <code>commodityCode</code> property.
     * <p>
     *
     * @return the current value of the <code>commodityCode</code> property.
     */

    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * @return the contractToApply
     */
    public String getContractToApply() {
        return contractToApply;
    }

    /**
     * Gets the <code>createdDate</code> property.
     * <p>
     *
     * @return the current value of the <code>createdDate</code> property.
     */

    public Date getCreatedDate() {
        return ContractUtility.getClonedDate(createdDate);
    }

    /**
     * Gets the <code>customsStation</code> property.
     *
     * @return the current value of the <code>customsStation</code> property.
     */
    public String getCustomsStation() {
        return customsStation;
    }

    /**
     * Gets the <code>destination</code> property.
     * <p>
     *
     * @return the current value of the <code>destination</code> property.
     */

    public String getDestination() {
        return destination;
    }

    /**
     * Gets the <code>eqaSation</code> property.
     * <p>
     *
     * @return the current value of the <code>eqaSation</code> property.
     */
    public String getEqaSation() {
        return eqaSation;
    }

    /**
     * Gets the <code>exchangeRateDestHst</code> property.
     * <p>
     *
     * @return the current value of the <code>exchangeRateDestHst</code> property.
     */
    public BigDecimal getExchangeRateDestHst() {
        return exchangeRateDestHst;
    }

    /**
     * Gets the <code>exchangeRateOrgHst</code> property.
     * <p>
     *
     * @return the current value of the <code>exchangeRateOrgHst</code> property.
     */
    public BigDecimal getExchangeRateOrgHst() {
        return exchangeRateOrgHst;
    }

    /**
     * Gets the <code>exportCreditCardDetailsDto</code> property.
     *
     * @return the current value of the <code>exportCreditCardDetailsDto</code> property.
     */
    public CreditCardDetailsDto getExportCreditCardDetailsDto() {

        return exportCreditCardDetailsDto;
    }

    /**
     * Gets the <code>foundIndicator</code> property.
     * <p>
     *
     * @return the current value of the <code>foundIndicator</code> property.
     */
    public String getFoundIndicator() {
        return foundIndicator;
    }

    /**
     * Gets the <code>fwbErrorMessage</code> property.
     *
     * @return the current value of the <code>fwbErrorMessage</code> property.
     */
    public String getFwbErrorMessage() {
        return fwbErrorMessage;
    }

    /**
     * Gets the <code>fwbWarningMessage</code> property.
     *
     * @return the current value of the <code>fwbWarningMessage</code> property.
     */
    public String getFwbWarningMessage() {
        return fwbWarningMessage;
    }

    /**
     * Gets the <code>goodsPiecesProcessed</code> property.
     * <p>
     *
     * @return the current value of the <code>goodsPiecesProcessed</code> property.
     */
    public int getGoodsPiecesProcessed() {
        return goodsPiecesProcessed;
    }

    /**
     * @return the hAWbs
     */
    public List<HouseAWBDto> gethAWbs() {
    	if(this.hAWbs==null)
    		return this.hAWbs=new ArrayList<HouseAWBDto>();
        return hAWbs;
    }

    /**
     * Gets the <code>houseAirwaybills</code> property.
     * <p>
     *
     * @return the current value of the <code>houseAirwaybills</code> property.
     */

    public List<AwbHouseAirwaybillDto> getHouseAirwaybills() {
        if (houseAirwaybills == null) {
            houseAirwaybills = new ArrayList<AwbHouseAirwaybillDto>();
        }
        return houseAirwaybills;
    }

    /**
     * Gets the <code>identifier</code> property.
     * <p>
     *
     * @return the current value of the <code>identifier</code> property.
     */

    public String getIdentifier() {
        return identifier;
    }

    /**
     * Gets the <code>importCreditCardDetailsDto</code> property.
     *
     * @return the current value of the <code>importCreditCardDetailsDto</code> property.
     */
    public CreditCardDetailsDto getImportCreditCardDetailsDto() {

        return importCreditCardDetailsDto;
    }

    /**
     * Gets the <code>neverFoundIndicator</code> property.
     * <p>
     *
     * @return the current value of the <code>neverFoundIndicator</code> property.
     */
    public String getNeverFoundIndicator() {
        return neverFoundIndicator;
    }

    /**
     * Gets the <code>numberOfPages</code> property.
     * <p>
     *
     * @return the current value of the <code>numberOfPages</code> property.
     */

    public int getNumberOfPages() {
        return numberOfPages;
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
     * Gets the <code>operationalStatus</code> property.
     * <p>
     *
     * @return the current value of the <code>airWaybillType</code> property.
     */
    public GoodsStatusType getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * Gets the <code>origin</code> property.
     * <p>
     *
     * @return the current value of the <code>origin</code> property.
     */

    public String getOrigin() {
        return origin;
    }

    /**
     * Gets the <code>otherCharges</code> property.
     * <p>
     *
     * @return the current value of the <code>otherCharges</code> property.
     */

    public List<OtherChargesDto> getOtherCharges() {
        if (otherCharges == null) {
            otherCharges = new ArrayList<OtherChargesDto>();
        }
        return otherCharges;
    }

    /**
     * Gets the <code>padType</code> property.
     * <p>
     *
     * @return the current value of the <code>padType</code> property.
     */

    public String getPadType() {
        return padType;
    }

    /**
     * Gets the <code>participants</code> property.
     * <p>
     *
     * @return the current value of the <code>participants</code> property.
     */

    public List<AirWaybillParticipantDto> getParticipants() {
        if (participants == null) {
            participants = new ArrayList<AirWaybillParticipantDto>();
        }
        return participants;
    }

    /**
     * Gets the <code>productCode</code> property.
     * <p>
     *
     * @return the current value of the <code>productCode</code> property.
     */

    public String getProductCode() {
        return productCode;
    }

    /**
     * Gets the <code>rateEntries</code> property.
     * <p>
     *
     * @return the current value of the <code>rateEntries</code> property.
     */

    public List<RatingLineEntryDto> getRateEntries() {
        if (rateEntries == null) {
            rateEntries = new ArrayList<RatingLineEntryDto>();
        }
        return rateEntries;
    }

    /**
     * Gets the <code>referencesOid</code> property.
     * <p>
     *
     * @return the current value of the <code>referenceOid</code> property.
     */
    public Long getReferenceOId() {
        return referenceOId;
    }

    /**
     * Gets the <code>revenue</code> property.
     * <p>
     *
     * @return the current value of the <code>revenue</code> property.
     */
    public AirWaybillRevenueDto getRevenue() {
        if (revenue == null) {
            revenue = new AirWaybillRevenueDto();
        }
        return revenue;
    }

    /**
     * Gets the <code>routes</code> property.
     * <p>
     *
     * @return the current value of the <code>routes</code> property.
     */
    // SuppressOff:MagicNumber
    public List<RouteDto> getRoutes() {
        if (routes == null) {
            routes = new ArrayList<RouteDto>(6);
        }
        return routes;
    }

    /**
     * Gets the <code>rowIndex</code> property.
     * <p>
     *
     * @return the current value of the <code>rowIndex</code> property.
     */
    public String getRowIndex() {
        return rowIndex;
    }

    /**
     * Gets the <code>shipmentAttachmentsDto</code> property.
     * <p>
     *
     * @return the current value of the <code>shipmentAttachmentsDto</code> property.
     */
    public List<ShipmentAttachmentsDto> getShipmentAttachmentsDto() {
        return shipmentAttachmentsDto;
    }

    /**
     * @return the shipmentDimensionDto
     */
    // SuppressOff:MagicNumber
    public ShipmentDimensionDto getShipmentDimensionDto() {
        return shipmentDimensionDto;
    }

    /**
     * Gets the <code>specialHandlingCodes</code> property.
     * <p>
     *
     * @return the current value of the <code>specialHandlingCodes</code> property.
     */
    // SuppressOff:MagicNumber
    public List<String> getSpecialHandlingCodes() {
        if (specialHandlingCodes == null) {
            specialHandlingCodes = new ArrayList<String>(5);
        }
        return specialHandlingCodes;
    }

    /**
     * Gets the <code>splCodes</code> property.
     * <p>
     *
     * @return the current value of the <code>splCodes</code> property.
     */

    public String getSplCodes() {
		return this.splCodes;
    }

    /**
     * @return the splswithColorCodes
     */
    public Map<String, String> getSplswithColorCodes() {
		return this.splswithColorCodes;
    }

    /**
     * Gets the <code>status</code> property.
     * <p>
     *
     * @return the current value of the <code>status</code> property.
     */

    public String getStatus() {
		return this.status;
    }

    /**
     * Gets the <code>totalChargeDto</code> property.
     * <p>
     *
     * @return the totalChargeDto
     */
    public TotalChargeDto getTotalChargeDto() {
        if (totalChargeDto == null) {
            totalChargeDto = new TotalChargeDto();
        }
        return totalChargeDto;
    }

    /**
     * Gets the <code>totalHawbGrossWeight</code> property.
     * <p>
     *
     * @return the current value of the <code>totalHawbGrossWeight</code> property.
     */

    public BigDecimal getTotalHawbGrossWeight() {
		return this.totalHawbGrossWeight;
    }

    /**
     * Gets the <code>totalHawbPieces</code> property.
     * <p>
     *
     * @return the current value of the <code>totalHawbPieces</code> property.
     */
    public Long getTotalHawbPieces() {
		return this.totalHawbPieces;
    }

    /**
     * Gets the <code>trackAndTraceIndicator</code> property.
     * <p>
     *
     * @return the current value of the <code>trackAndTraceIndicator</code> property.
     */
    public String getTrackAndTraceIndicator() {
		return this.trackAndTraceIndicator;
    }

    /**
     * Gets the <code>transfer</code> property.
     * <p>
     *
     * @return the current value of the <code>transfer</code> property.
     */

    public String getTransfer() {
		return this.transfer;
    }

    /**
     * @return the unNumberDtos
     */
    public List<UNNumberDto> getUnNumberDtos() {
		return this.unNumberDtos;
    }

    /**
     * Gets the <code>userAuditDto</code> property.
     * <p>
     *
     * @return the current value of the <code>userAuditDto</code> property.
     */
    public UserAuditDto getUserAuditDto() {
		return this.userAuditDto;
    }

    /**
     * Gets the <code>userIdentifier</code> property.
     * <p>
     *
     * @return the current value of the <code>userIdentifier</code> property.
     */
    public String getUserIdentifier() {
		return this.userIdentifier;
    }

	/**
	 * Gets the <code>workOrderItemStatus</code> property.
	 * <p>
	 *
	 * @return the current value of the <code>workOrderItemStatus</code>
	 *         property.
	 */
    public String getWorkOrderItemStatus() {
		return this.workOrderItemStatus;
    }

    /**
     * Gets the <code>bookingIndicator</code> property.
     * <p>
     *
     * @return the current value of the <code>bookingIndicator</code> property.
     */

    public boolean isBookingIndicator() {
		return this.bookingIndicator;
    }

    /**
     * Gets the <code>isCCADisplayRequired</code> property.
     * <p>
     *
     * @return the current value of the <code>isCCADisplayRequired</code> property.
     */
    public boolean isCcaDisplayRequired() {
		return this.ccaDisplayRequired;
    }

    /**
     * Gets the <code>ecaIndicator</code> property.
     *
     * @return the current value of the <code>ecaIndicator</code> property.
     */
    public boolean isEcaIndicator() {
		return this.ecaIndicator;
    }

    /**
     * Gets the <code>EqaLockingAuthorityIndicator</code> property.
     * <p>
     *
     * @return the current value of the <code>EqaLockingAuthorityIndicator</code> property.
     */
    public boolean isEqaLockingAuthorityIndicator() {
		return this.eqaLockingAuthorityIndicator;
    }

    /**
     * Gets the <code>fSDCIndicator</code> property.
     * <p>
     *
     * @return the current value of the <code>fSDCIndicator</code> property.
     */
    public boolean isFsdcIndicator() {
		return this.fsdcIndicator;
    }

    /**
     * Gets the <code>isGenrationOfCCARequired</code> property.
     * <p>
     *
     * @return the current value of the <code>isGenrationOfCCARequired</code> property.
     */
    public boolean isGenrationOfCCARequired() {
		return this.genrationOfCCARequired;
    }

    /**
     * Gets the <code>internationalPopupConfirm</code> property.
     * <p>
     *
     * @return the current value of the <code>internationalPopupConfirm</code> property.
     */
    public boolean isInternationalPopupConfirm() {
		return this.internationalPopupConfirm;
    }

    /**
     * Gets the <code>popupConfirm</code> property.
     * <p>
     *
     * @return the current value of the <code>popupConfirm</code> property.
     */
    public boolean isPopupConfirm() {
		return this.popupConfirm;
    }

    /**
     * Sets the value of the <code>additionalAWBFunctions</code> property.
     * <p>
     *
     * @param pAdditionalAWBFunctions
     *            <code>AirWaybillAdditionalFunction</code><br>
     *            Holds the <code>additionalAWBFunctions</code> of the property.<br>
     *            </p>
     */
    public void setAdditionalAWBFunctions(
                final AirWaybillAdditionalFunction pAdditionalAWBFunctions) {
        additionalAWBFunctions = pAdditionalAWBFunctions;
    }
    

	public void setNonMechOffloadStation(String pNonMechOffloadStation) {
		this.nonMechOffloadStation = pNonMechOffloadStation;
	}

	
	/**
	 * Sets the value of the <code>importClearedPieces</code> property.
	 * <p>
	 *
	 * @param pImportClearedPieces
	 *            <code>importClearedPieces</code><br>
	 *            Holds the <code>importClearedPieces</code> of the property.<br>
	 *            </p>
	 */
 	public void setImportClearedPieces(Long pImportClearedPieces) {
 		this.importClearedPieces = pImportClearedPieces;
 	}

    /**
     * Sets the <code>airWaybillNumber</code> property.
     * <p>
     *
     * @param pAirWaybillNumber
     *            holds the new value of <code>airWaybillNumber</code>.<br>
     */

    public void setAirWaybillNumber(final AirWaybillNumberDto pAirWaybillNumber) {
        airWaybillNumber = pAirWaybillNumber;
    }

    /**
     * Sets the <code>airWaybillType</code> property.
     * <p>
     *
     * @param pAirWaybillType
     *            holds the new value of <code>airWaybillType</code>.<br>
     */
    public void setAirWaybillType(final AirWaybillType pAirWaybillType) {
        airWaybillType = pAirWaybillType;
    }

    /**
     * Sets the <code>alertCodeColor</code> property.
     * <p>
     *
     * @param pAlertCodeColor
     *            holds the new value of <code>alertCodeColor</code>.<br>
     */
    public void setAlertCodeColor(final String pAlertCodeColor) {
        alertCodeColor = pAlertCodeColor;
    }

    /**
     * Sets the <code>ArrivalFlight</code> property.
     * <p>
     *
     *
     * @param pArrivalFlight
     *            holds the new value of <code>ArrivalFlight</code>.<br>
     */
    public void setArrivalFlight(final FlightInfoDto pArrivalFlight) {
        arrivalFlight = pArrivalFlight;
    }

    /**
     * @param awbCustomsInformationDto the awbCustomsInformationDto to set
     */
    public void setAwbCustomsInformationDtos(final List<AWBCustomsInformationDto> pAwbCustomsInformationDtos) {
        awbCustomsInformationDtos = pAwbCustomsInformationDtos;
    }

    /**
     * Sets the <code>awbDetail</code> property.
     * <p>
     *
     * @param pAwbDetail
     *            holds the new value of <code>awbDetail</code>.<br>
     */
    public void setAwbDetail(final AirWaybillDetailDto pAwbDetail) {
        awbDetail = pAwbDetail;
    }

    /**
     * Sets the <code>awbDocumentDtos</code> property.
     * <p>
     *
     * @param pAwbDocumentDtos
     *            holds the new value of <code>awbDocumentDtos</code>.<br>
     */
    public void setAwbDocumentDtos(final List<AWBDocumentDto> pAwbDocumentDtos) {
        awbDocumentDtos = pAwbDocumentDtos;
    }

    /**
     * Sets the <code>pPaymentEntries</code> property.
     * <p>
     *
     * @param pPaymentEntries
     *            holds the new value of <code>paymentEntries</code>.<br>
     */
    public void setAwbPaymentEntries(
                final List<AWBPaymentEntryDto> pAwbPaymentEntries) {
        awbPaymentEntries = pAwbPaymentEntries;
    }

    /**
     * Sets the <code>awbDetail</code> property.
     * <p>
     *
     * @param pAwbDetail
     *            holds the new value of <code>awbDetail</code>.<br>
     */
    /**
     * Sets the <code>awbRemarksDtos</code> property.
     * <p>
     *
     * @param pAwbRemarksDtos
     *            holds the new value of <code>awbRemarksDtos</code>.<br>
     */
    public void setAwbRemarksDtos(final List<AWBRemarksDto> pAwbRemarksDtos) {
        awbRemarksDtos = pAwbRemarksDtos;
    }

    /**
     * Sets the <code>booking</code> property.
     * <p>
     *
     * @param pBooking
     *            holds the new value of <code>booking</code>.<br>
     */
    @Deprecated
    public void setBooking(final BookingDto pBooking) {
        booking = pBooking;
    }

    /**
     * Sets the <code>bookingIndicator</code> property.
     * <p>
     *
     * @param pbookingIndicator
     *            holds the new value of <code>bookingIndicator</code>.<br>
     */
    public void setBookingIndicator(final boolean pBookingIndicator) {
        bookingIndicator = pBookingIndicator;
    }

    /**
     * Sets the <code>bookingSegment</code> property.
     * <p>
     *
     * @param pBookingSegment
     *            holds the new value of <code>bookingSegment</code>.<br>
     */

    public void setBookingSegment(final BookingSegmentDto pBookingSegment) {
        bookingSegment = pBookingSegment;
    }

    /**
     * Sets the <code>CargoCorrectionAdviseDto</code> property.
     * <p>
     *
     * @param pCargoCorrectionAdviseDto
     *            holds the new value of <code>CargoCorrectionAdviseDto</code>.<br>
     */

    public void setCargoCorrectionAdviseDto(
                final CargoCorrectionAdviseDto pCargoCorrectionAdviseDto) {
        CargoCorrectionAdviseDto = pCargoCorrectionAdviseDto;
    }

    /**
     * Sets the <code>cargoCorrectionAdviseDtos</code> property.
     * <p>
     *
     * @param pCargoCorrectionAdviseDtos
     *            holds the new value of <code>cargoCorrectionAdviseDtos</code>.<br>
     */

    public void setCargoCorrectionAdviseDtos(
                final List<CargoCorrectionAdviseDto> pCargoCorrectionAdviseDtos) {
        cargoCorrectionAdviseDtos = pCargoCorrectionAdviseDtos;
    }

    /**
     * Sets the <code>isCCADisplayRequired</code> property.
     * <p>
     *
     * @param pIsCCADisplayRequired
     *            holds the new value of <code>isCCADisplayRequired</code>.<br>
     */

    public void setCcaDisplayRequired(final boolean pCcaDisplayRequired) {
    	ccaDisplayRequired = pCcaDisplayRequired;
    }

    /**
     * Sets the <code>codeRedIndicator</code> property.
     * <p>
     *
     * @param pCodeRedIndicator
     *            holds the new value of <code>codeRedIndicator</code>.<br>
     */

    public void setCodeRedIndicator(final String pCodeRedIndicator) {
        codeRedIndicator = pCodeRedIndicator;
    }

    /**
     * Sets the value of the <code>colCashTotal</code> property.
     * <p>
     *
     * @param pColCashTotal
     *            <code>BigDecimal</code><br>
     *            Holds the <code>colCashTotal</code> of the property.<br>
     *            </p>
     */
    public void setColCashTotal(final BigDecimal pColCashTotal) {
        colCashTotal = pColCashTotal;
    }

    /**
     * Sets the <code>commodityCode</code> property.
     * <p>
     *
     * @param pCommodityCode
     *            holds the new value of <code>commodityCode</code>.<br>
     */

    public void setCommodityCode(final String pCommodityCode) {
        commodityCode = pCommodityCode;
    }

    /**
     * @param contractToApply
     *            the contractToApply to set
     */
    public void setContractToApply(final String pContractToApply) {
        contractToApply = ContractUtility
                    .convertToUpperCase(pContractToApply);
    }

    /**
     * Sets the <code>createdDate</code> property.
     * <p>
     *
     * @param pCreatedDate
     *            holds the new value of <code>createdDate</code>.<br>
     */

    public void setCreatedDate(final Date pCreatedDate) {
        createdDate = ContractUtility.getClonedDate(pCreatedDate);
    }

    /**
     * Sets the <code>customsStation</code> property.
     *
     * @param pCustomsStation
     *            the current value of the <code>customsStation</code> property.
     */
    public void setCustomsStation(final String pCustomsStation) {
        customsStation = pCustomsStation;
    }

    /**
     * Sets the <code>destination</code> property.
     * <p>
     *
     * @param pDestination
     *            holds the new value of <code>destination</code>.<br>
     */

    public void setDestination(final String pDestination) {
        destination = pDestination;
    }

    /**
     * Sets the <code>ecaIndicator</code> property.
     *
     * @param pEcaIndicator
     *            the current value of the <code>ecaIndicator</code> property.
     */
    public void setEcaIndicator(final boolean pEcaIndicator) {
        ecaIndicator = pEcaIndicator;
    }

    /**
     * Sets the <code>EqaLockingAuthorityIndicator</code> property.
     * <p>
     *
     * @param pEqaLockingAuthorityIndicator
     *            holds the new value of <code>EqaLockingAuthorityIndicator</code>.<br>
     */
    public void setEqaLockingAuthorityIndicator(
                final boolean pEqaLockingAuthorityIndicator) {
        eqaLockingAuthorityIndicator = pEqaLockingAuthorityIndicator;
    }

    /**
     * Sets the <code>eqaSation</code> property.
     * <p>
     *
     * @param pEqaSation
     *            holds the new value of <code>eqaSation</code>.<br>
     */
    public void setEqaSation(final String pEqaSation) {
        eqaSation = pEqaSation;
    }

    /**
     * Sets the <code>pExchangeRateDestHst</code>.
     * <p>
     *
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pExchangeRateDestHst</code>
     */
    public void setExchangeRateDestHst(final BigDecimal pExchangeRateDestHst) {
        exchangeRateDestHst = pExchangeRateDestHst;
    }

    /**
     * Sets the <code>pExchangeRateOrgHst</code>.
     * <p>
     *
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pExchangeRateOrgHst</code>
     */
    public void setExchangeRateOrgHst(final BigDecimal pExchangeRateOrgHst) {
        exchangeRateOrgHst = pExchangeRateOrgHst;
    }

    /**
     * Sets the <code>exportCreditCardDetailsDto</code> property.
     * <p>
     *
     * @param pExportCreditCardDetailsDto
     *            holds the new value of <code>exportCreditCardDetailsDto</code>.<br>
     */
    public void setExportCreditCardDetailsDto(
                final CreditCardDetailsDto pExportCreditCardDetailsDto) {
        exportCreditCardDetailsDto = pExportCreditCardDetailsDto;
    }

    /**
     * Sets the <code>foundIndicator</code> property.
     * <p>
     *
     * @param pFoundIndicator
     *            holds the new value of <code>foundIndicator</code>.<br>
     */

    public void setFoundIndicator(final String pFoundIndicator) {
        foundIndicator = pFoundIndicator;
    }

    /**
     * Sets the <code>pFSDCIndicator</code>.
     * <p>
     *
     * @param pFSDCIndicator
     *            holds the new value of <code>fSDCIndicator</code>
     */
	public void setfsdcIndicator(final boolean pFsdcIndicator) {
        fsdcIndicator = pFsdcIndicator;
    }

    /**
     * Sets the <code>fwbErrorMessage</code> property.
     *
     * @param pFwbErrorMessage
     *            the current value of the <code>fwbErrorMessage</code> property.
     */
    public void setFwbErrorMessage(final String pFwbErrorMessage) {
        fwbErrorMessage = pFwbErrorMessage;
    }

    /**
     * Sets the <code>fwbWarningMessage</code> property.
     *
     * @param pFwbWarningMessage
     *            the current value of the <code>fwbWarningMessage</code> property.
     */
    public void setFwbWarningMessage(final String pFwbWarningMessage) {
        fwbWarningMessage = pFwbWarningMessage;
    }

    /**
     * Sets the <code>isGenrationOfCCARequired</code>.
     * <p>
     *
     * @param pIsGenrationOfCCARequired
     *            holds the new value of <code>isGenrationOfCCARequired</code>
     */
    public void setGenrationOfCCARequired(final boolean pIsGenrationOfCCARequired) {
        genrationOfCCARequired = pIsGenrationOfCCARequired;
    }

    /**
     * Sets the <code>goodsPiecesProcessed</code> property.
     * <p>
     *
     * @param pGoodsPiecesProcessed
     *            holds the new value of <code>goodsPiecesProcessed</code>.<br>
     */
    public void setGoodsPiecesProcessed(final int pGoodsPiecesProcessed) {
        goodsPiecesProcessed = pGoodsPiecesProcessed;
    }

    /**
     * @param hAWbs
     *            the hAWbs to set
     */
    public void sethAWbs(final List<HouseAWBDto> pHAWbs) {
        hAWbs = pHAWbs;
    }

    /**
     * Sets the <code>houseAirwaybills</code> property.
     * <p>
     *
     * @param pHouseAirwaybills
     *            holds the new value of <code>houseAirwaybills</code>.<br>
     */

    public void setHouseAirwaybills(
                final List<AwbHouseAirwaybillDto> pHouseAirwaybills) {
        houseAirwaybills = pHouseAirwaybills;
    }

    /**
     * Sets the <code>identifier</code> property.
     * <p>
     *
     * @param pIdentifier
     *            holds the new value of <code>identifier</code>.<br>
     */

    public void setIdentifier(final String pIdentifier) {
        identifier = pIdentifier;
    }

    /**
     * Sets the <code>importCreditCardDetailsDto</code> property.
     * <p>
     *
     * @param pImportCreditCardDetailsDto
     *            holds the new value of <code>importCreditCardDetailsDto</code>.<br>
     */
    public void setImportCreditCardDetailsDto(
                final CreditCardDetailsDto pImportCreditCardDetailsDto) {
        importCreditCardDetailsDto = pImportCreditCardDetailsDto;
    }

    /**
     * Sets the <code>internationalPopupConfirm</code> property.
     * <p>
     *
     * @param pInternationalPopupConfirm
     *            holds the new value of <code>internationalPopupConfirm</code>.<br>
     */
    public void setInternationalPopupConfirm(
                final boolean pInternationalPopupConfirm) {
        internationalPopupConfirm = pInternationalPopupConfirm;
    }

    /**
     * Sets the <code>neverFoundIndicator</code> property.
     * <p>
     *
     * @param pNeverFoundIndicator
     *            holds the new value of <code>neverFoundIndicator</code>.<br>
     */
    public void setNeverFoundIndicator(final String pNeverFoundIndicator) {
        neverFoundIndicator = pNeverFoundIndicator;
    }

    /**
     * Sets the <code>numberOfPages</code> property.
     * <p>
     *
     * @param pNumberOfPages
     *            holds the new value of <code>numberOfPages</code>.<br>
     */

    public void setNumberOfPages(final int pNumberOfPages) {
        numberOfPages = pNumberOfPages;
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
     * Sets the <code>operationalStatus</code> property.
     * <p>
     *
     * @param pOperationalStatusType
     *            holds the new value of <code>GoodsStatusType</code>.<br>
     */
    public void setOperationalStatusType(final GoodsStatusType pOperationalStatusType) {
        operationalStatus = pOperationalStatusType;
    }

    /**
     * Sets the <code>origin</code> property.
     * <p>
     *
     * @param pOrigin
     *            holds the new value of <code>origin</code>.<br>
     */

    public void setOrigin(final String pOrigin) {
        origin = pOrigin;
    }

    /**
     * Sets the <code>otherCharges</code> property.
     * <p>
     *
     * @param pOtherCharges
     *            holds the new value of <code>otherCharges</code>.<br>
     */

    public void setOtherCharges(final List<OtherChargesDto> pOtherCharges) {
        otherCharges = pOtherCharges;
    }

    /**
     * Sets the <code>padType</code> property.
     * <p>
     *
     * @param pPadType
     *            holds the new value of <code>padType</code>.<br>
     */

    public void setPadType(final String pPadType) {
        padType = pPadType;
    }

    /**
     * Sets the <code>participants</code> property.
     * <p>
     *
     * @param pParticipants
     *            holds the new value of <code>participants</code>.<br>
     */

    public void setParticipants(
                final List<AirWaybillParticipantDto> pParticipants) {
        participants = pParticipants;
    }

    /**
     * Sets the <code>popupConfirm</code> property.
     * <p>
     *
     * @param popupConfirm
     *            holds the new value of <code>popupConfirm</code>.<br>
     */
    public void setPopupConfirm(final boolean pPopupConfirm) {
        popupConfirm = pPopupConfirm;
    }

    /**
     * Sets the <code>productCode</code> property.
     * <p>
     *
     * @param pProductCode
     *            holds the new value of <code>productCode</code>.<br>
     */

    public void setProductCode(final String pProductCode) {
        productCode = ContractUtility.convertToUpperCase(pProductCode);
    }

    /**
     * Sets the <code>rateEntries</code> property.
     * <p>
     *
     * @param pRateEntries
     *            holds the new value of <code>rateEntries</code>.<br>
     */

    public void setRateEntries(final List<RatingLineEntryDto> pRateEntries) {
        rateEntries = pRateEntries;
    }

    /**
     * Sets the <code>referenceOId</code> property.
     * <p>
     *
     * @param pReferenceOId
     *            holds the new value of <code>referenceOId</code>.<br>
     */
    public void setReferenceOId(final Long pReferenceOId) {
        referenceOId = pReferenceOId;
    }

    /**
     * Sets the <code>revenue</code> property.
     * <p>
     *
     * @param pRevenue
     *            holds the new value of <code>revenue</code>.<br>
     */

    public void setRevenue(final AirWaybillRevenueDto pRevenue) {
        revenue = pRevenue;
    }

    /**
     * Sets the <code>routes</code> property.
     * <p>
     *
     * @param pRoutes
     *            holds the new value of <code>routes</code>.<br>
     */

    public void setRoutes(final List<RouteDto> pRoutes) {
        routes = pRoutes;
    }

    /**
     * Sets the <code>rowIndex</code> property.
     * <p>
     *
     * @param pRowIndex
     *            holds the new value of <code>rowIndex</code>.<br>
     */
    public void setRowIndex(final String pRowIndex) {
        rowIndex = pRowIndex;
    }

    /**
     * Sets the <code>shipmentAttachmentsDto</code> property.
     * <p>
     *
     * @param pShipmentAttachmentsDto
     *            holds the new value of <code>shipmentAttachmentsDto</code>.<br>
     */
    public void setShipmentAttachmentsDto(final List<ShipmentAttachmentsDto> pShipmentAttachmentsDto) {
        shipmentAttachmentsDto = pShipmentAttachmentsDto;
    }

    /**
     * Sets the <code>shipmentDimensionDto</code> property.
     * <p>
     *
     * @param pShipmentDimensionDto
     *            holds the new value of <code>shipmentDimensionDto</code>.<br>
     */
    public void setShipmentDimensionDto(
                final ShipmentDimensionDto pShipmentDimensionDto) {
        shipmentDimensionDto = pShipmentDimensionDto;
    }

    /**
     * Sets the <code>specialHandlingCodes</code> property.
     * <p>
     *
     * @param pSpecialHandlingCodes
     *            holds the new value of <code>specialHandlingCodes</code>.<br>
     */

    public void setSpecialHandlingCodes(final List<String> pSpecialHandlingCodes) {
        specialHandlingCodes = pSpecialHandlingCodes;
    }

    /**
     * Sets the <code>splCodes</code> property.
     * <p>
     *
     * @param pSplCodes
     *            holds the new value of <code>splCodes</code>.<br>
     */

    public void setSplCodes(final String pSplCodes) {
        splCodes = pSplCodes;
    }

    /**
     * @param splswithColorCodes the splswithColorCodes to set
     */
    public void setSplswithColorCodes(final Map<String, String> splswithColorCodes) {
        this.splswithColorCodes = splswithColorCodes;
    }

    /**
     * Sets the <code>status</code> property.
     * <p>
     *
     * @param pStatus
     *            holds the new value of <code>status</code>.<br>
     */

    public void setStatus(final String pStatus) {
        status = pStatus;
    }

    /**
     * sets the <code>totalChargeDto</code> property.
     * <p>
     *
     * @param pTotalChargeDto
     *            the totalChargeDto to set
     */
    public void setTotalChargeDto(final TotalChargeDto pTotalChargeDto) {
        if (pTotalChargeDto == null) {
            totalChargeDto = new TotalChargeDto();
        }
        else {
            totalChargeDto = pTotalChargeDto;
        }
    }

    /**
     * Sets the <code>totalHawbGrossWeight</code> property.
     * <p>
     *
     * @param pUserIdentifier
     *            holds the new value of <code>totalHawbGrossWeight</code>.<br>
     */
    public void setTotalHawbGrossWeight(final BigDecimal pTotalHawbGrossWeight) {
        totalHawbGrossWeight = pTotalHawbGrossWeight;
    }

    /**
     * Sets the <code>totalHawbPieces</code> property.
     * <p>
     *
     * @param pTotalHawbPieces
     *            holds the new value of <code>totalHawbPieces</code>.<br>
     */
    public void setTotalHawbPieces(final Long pTotalHawbPieces) {
        totalHawbPieces = pTotalHawbPieces;
    }

    /**
     * Sets the <code>trackAndTraceIndicator</code> property.
     * <p>
     *
     * @param pTrackAndTraceIndicator
     *            holds the new value of <code>trackAndTraceIndicator</code>.<br>
     */
    public void setTrackAndTraceIndicator(final String pTrackAndTraceIndicator) {
        trackAndTraceIndicator = pTrackAndTraceIndicator;
    }

    /**
     * Sets the <code>transfer</code> property.
     * <p>
     *
     * @param pTransfer
     *            holds the new value of <code>transfer</code>.<br>
     */

    public void setTransfer(final String pTransfer) {
        transfer = pTransfer;
    }

    /**
     * @param unNumberDtos
     *            the unNumberDtos to set
     */
    public void setUnNumberDtos(final List<UNNumberDto> pUnNumberDtos) {
        unNumberDtos = pUnNumberDtos;
    }

    /**
     * Sets the <code>userAuditDto</code> property.
     * <p>
     *
     * @param pUserAuditDto
     *            holds the new value of <code>userAuditDto</code>.<br>
     */
    public void setUserAuditDto(final UserAuditDto pUserAuditDto) {
        userAuditDto = pUserAuditDto;
    }

    /**
     * Sets the <code>userIdentifier</code> property.
     * <p>
     *
     * @param pUserIdentifier
     *            holds the new value of <code>userIdentifier</code>.<br>
     */

    public void setUserIdentifier(final String pUserIdentifier) {
        userIdentifier = pUserIdentifier;
    }

	public void setWorkOrderItemStatus(final String pWorkOrderItemStatus) {
		this.workOrderItemStatus = pWorkOrderItemStatus;
    }

	/**
	 * @return the selectedList
	 */
	public List<SelectionType> getSelectedList() {
		return selectedList;
	}

	/**
	 * @param selectedList the selectedList to set
	 */
	public void setSelectedList(List<SelectionType> selectedList) {
		this.selectedList = selectedList;
	}
	
//MH007
	/**
     * @return the addedGoodsDetailDtoMap
     */
    public Map<String, List<GoodsDetailDto>> getAddedGoodsDetailDtoMap() {
        return this.addedGoodsDetailDtoMap;
    }

    /**
     * @param pAddedGoodsDetailDtoMap the addedGoodsDetailDtoMap to set
     */
    public void setAddedGoodsDetailDtoMap(final 
            Map<String, List<GoodsDetailDto>> pAddedGoodsDetailDtoMap) {
        this.addedGoodsDetailDtoMap = pAddedGoodsDetailDtoMap;
    }

    /**
     * @return the addedGoodsDetailDtos
     */
    public List<GoodsDetailDto> getAddedGoodsDetailDtos() {
        return this.addedGoodsDetailDtos;
    }

    /**
     * @param pAddedGoodsDetailDtos the addedGoodsDetailDtos to set
     */
    public void setAddedGoodsDetailDtos(final List<GoodsDetailDto> pAddedGoodsDetailDtos) {
        this.addedGoodsDetailDtos = pAddedGoodsDetailDtos;
    }

    /**
     * @return the deletedGoodsDetailDtos
     */
    public List<GoodsDetailDto> getDeletedGoodsDetailDtos() {
        return this.deletedGoodsDetailDtos;
    }

    /**
     * @param pDeletedGoodsDetailDtos the deletedGoodsDetailDtos to set
     */
    public void setDeletedGoodsDetailDtos(final 
            List<GoodsDetailDto> pDeletedGoodsDetailDtos) {
        this.deletedGoodsDetailDtos = pDeletedGoodsDetailDtos;
    }

    /**
     * @return the goodsDetailDto
     */
    public GoodsDetailDto getGoodsDetailDto() {
        return this.goodsDetailDto;
    }

    /**
     * @param pGoodsDetailDto the goodsDetailDto to set
     */
    public void setGoodsDetailDto(final GoodsDetailDto pGoodsDetailDto) {
        this.goodsDetailDto = pGoodsDetailDto;
    }

    /**
     * @return the goodsDetailDtos
     */
    public List<GoodsDetailDto> getGoodsDetailDtos() {
        return this.goodsDetailDtos;
    }

    /**
     * @param pGoodsDetailDtos the goodsDetailDtos to set
     */
    public void setGoodsDetailDtos(final List<GoodsDetailDto> pGoodsDetailDtos) {
        this.goodsDetailDtos = pGoodsDetailDtos;
    }

    /**
     * @return the upadtedGoodsDetailDtos
     */
    public List<GoodsDetailDto> getUpadtedGoodsDetailDtos() {
        return this.upadtedGoodsDetailDtos;
    }

    /**
     * @param pUpadtedGoodsDetailDtos the upadtedGoodsDetailDtos to set
     */
    public void setUpadtedGoodsDetailDtos(final 
            List<GoodsDetailDto> pUpadtedGoodsDetailDtos) {
        this.upadtedGoodsDetailDtos = pUpadtedGoodsDetailDtos;
    }

    /**
     * @return the portDischarge
     */
    public String getPortDischarge() {
        return this.portDischarge;
    }

    /**
     * @param pPortDischarge the portDischarge to set
     */
    public void setPortDischarge(final String pPortDischarge) {
        this.portDischarge = pPortDischarge;
    }

    /**
     * @return the existSpecialUldRemarks
     */
    public List<SpecialUldRemarksDto> getExistSpecialUldRemarks() {
        return ExistSpecialUldRemarks;
    }

    /**
     * @param existSpecialUldRemarks the existSpecialUldRemarks to set
     */
    public void setExistSpecialUldRemarks(List<SpecialUldRemarksDto> existSpecialUldRemarks) {
        ExistSpecialUldRemarks = existSpecialUldRemarks;
    }
    /**
     * @return the specialUldRemarks
     */
    public List<SpecialUldRemarksDto> getSpecialUldRemarks() {
        return this.specialUldRemarks;
    }
    
    /**
     * @param pSpecialUldRemarks
     *            the specialUldRemarks to set
     */
    public void setSpecialUldRemarks(List<SpecialUldRemarksDto> pSpecialUldRemarks) {
        this.specialUldRemarks = pSpecialUldRemarks;
    }

    /**
     * Gets the <code>airwaybillChangeInd</code> property.
     * <p>
     *
     * @return the current value of the <code>airwaybillChangeInd</code> property.
     */
	public boolean isAirwaybillChangeInd() {
		return this.airwaybillChangeInd;
	}

    /**
     * Sets the <code>airwaybillChangeInd</code> property.
     * <p>
     *
     * @param pAirwaybillChangeInd
     *            holds the new value of <code>airwaybillChangeInd</code>.<br>
     */
	public void setAirwaybillChangeInd(final boolean pAirwaybillChangeInd) {
		this.airwaybillChangeInd = pAirwaybillChangeInd;
	}

	/**
     * Gets the <code>efmIndicator</code> property.
     * <p>
     *
     * @return the current value of the <code>efmIndicator</code> property.
     */
    public boolean isEfmIndicator() {
        return efmIndicator;
    }

    /**
     * Gets the <code>pEfmIndicator</code> property.
     * <p>
     *
     * @return the current value of the <code>efmIndicator</code> property.
     */
    public void setEfmIndicator(boolean pEfmIndicator) {
        this.efmIndicator = pEfmIndicator;
    }

	// DL562 Starts
	public boolean isDomestic() {
		return domestic;
	}

	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}

	// DL562 Ends

	// AC396 start
	public String getEawbSignatureParameter() {
		return eawbSignatureParameter;
	}

	public void setEawbSignatureParameter(String eawbSignatureParameter) {
		this.eawbSignatureParameter = eawbSignatureParameter;
	}
	
	//SK183 starts
	private String associatedAwbIdentifier;
	//SK183 ends
	// AC396 end
	/* RFC-CR-2000568-Start */
	private String serviceCode;
	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	/* RFC-CR-2000568-end */
	
	//RFC SK164H changes : Start
	/**
	 * @return the associatedOID
	 */
	public Long getAssociatedOID() {
		return associatedOID;
	}

	/**
	 * @param associatedOID the associatedOID to set
	 */
	public void setAssociatedOID(Long associatedOID) {
		this.associatedOID = associatedOID;
	}

	/**
	 * @return the associatedAWBList
	 */
	public List<AirWaybillDto> getAssociatedAWBList() {
		return associatedAWBList;
	}

	/**
	 * @param associatedAWBList the associatedAWBList to set
	 */
	public void setAssociatedAWBList(List<AirWaybillDto> associatedAWBList) {
		this.associatedAWBList = associatedAWBList;
	}
	
	/**
	 * @return the bookingFeeWaivedCounter
	 */
	public Integer getBookingFeeWaivedCounter() {
		return bookingFeeWaivedCounter;
	}

	/**
	 * @param bookingFeeWaivedCounter the bookingFeeWaivedCounter to set
	 */
	public void setBookingFeeWaivedCounter(Integer bookingFeeWaivedCounter) {
		this.bookingFeeWaivedCounter = bookingFeeWaivedCounter;
	}

	/**
	 * @return the feeEventTriggered
	 */
	public boolean isFeeEventTriggered() {
		return feeEventTriggered;
	}

	/**
	 * @param feeEventTriggered the feeEventTriggered to set
	 */
	public void setFeeEventTriggered(boolean feeEventTriggered) {
		this.feeEventTriggered = feeEventTriggered;
	}
	
	/**
	 * @return the associatedAWBNumber
	 */
	public AirWaybillNumberDto getAssociatedAWBNumber() {
		return associatedAWBNumber;
	}

	/**
	 * @param associatedAWBNumber the associatedAWBNumber to set
	 */
	public void setAssociatedAWBNumber(AirWaybillNumberDto associatedAWBNumber) {
		this.associatedAWBNumber = associatedAWBNumber;
	}
	
	//RFC SK164H changes : End

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
	 * @param operationalStatus the operationalStatus to set
	 */
	public void setOperationalStatus(GoodsStatusType operationalStatus) {
		this.operationalStatus = operationalStatus;
	}

	/**
	 * @return the participant
	 */
	public ParticipantDto getParticipant() {
		return participant;
	}

	/**
	 * @param participant the participant to set
	 */
	public void setParticipant(ParticipantDto participant) {
		this.participant = participant;
	}

	/**
	 * @return the tprAddress
	 */
	public String getTprAddress() {
		return tprAddress;
	}

	/**
	 * @param tprAddress the tprAddress to set
	 */
	public void setTprAddress(String tprAddress) {
		this.tprAddress = tprAddress;
	}

	/**
	 * @return the isGoodsAccepted
	 */
	public boolean isGoodsAccepted() {
		return isGoodsAccepted;
	}

	/**
	 * @param isGoodsAccepted the isGoodsAccepted to set
	 */
	public void setGoodsAccepted(boolean isGoodsAccepted) {
		this.isGoodsAccepted = isGoodsAccepted;
	}

	/**
	 * @return the ttyAddress
	 */
	public String getTtyAddress() {
		return ttyAddress;
	}

	/**
	 * @param ttyAddress the ttyAddress to set
	 */
	public void setTtyAddress(String ttyAddress) {
		this.ttyAddress = ttyAddress;
	}

	public String getCUITorTRINprefix() {
		return CUITorTRINprefix;
	}

	public void setCUITorTRINprefix(String cUITorTRINPrefix) {
		CUITorTRINprefix = cUITorTRINPrefix;
	}

	/**
	 * @return the isRulesfailed
	 */
	public boolean isRulesfailed() {
		return isRulesfailed;
	}

	/**
	 * @param isRulesfailed the isRulesfailed to set
	 */
	public void setRulesfailed(boolean isRulesfailed) {
		this.isRulesfailed = isRulesfailed;
	}

	//DL619 Start
		/**
		 * @return the goodsStatusChangeType
		 */
		public GoodsStatusType getGoodsStatusChangeType() {
			return goodsStatusChangeType;
		}

		/**
		 * @param goodsStatusChangeType
		 *            the goodsStatusChangeType to set
		 */
		public void setGoodsStatusChangeType(GoodsStatusType goodsStatusChangeType) {
			this.goodsStatusChangeType = goodsStatusChangeType;
		}

		/**
		 * @return the checklistCompleteIndicatorType
		 */
		public ChecklistCompleteIndicatorType getChecklistCompleteIndicatorType() {
			return checklistCompleteIndicatorType;
		}

		/**
		 * @param checklistCompleteIndicatorType
		 *            the checklistCompleteIndicatorType to set
		 */
		public void setChecklistCompleteIndicatorType(
				ChecklistCompleteIndicatorType checklistCompleteIndicatorType) {
			this.checklistCompleteIndicatorType = checklistCompleteIndicatorType;
		}

		/**
		 * @return the checkListName
		 */
		public String getCheckListName() {
			return checkListName;
		}

		/**
		 * @param checkListName
		 *            the checkListName to set
		 */
		public void setCheckListName(String checkListName) {
			this.checkListName = checkListName;
		}
		//DL619 end
		
//DL615 starts
		public int getCreatedDateForRules() {
			return createdDateForRules;
		}
		public void setCreatedDateForRules(int createdDateForRules) {
			this.createdDateForRules = createdDateForRules;
		}
		public String getOriginCountry() {
			return originCountry;
		}
		public void setOriginCountry(String originCountry) {
			this.originCountry = originCountry;
		}
		public String getDestinationCountry() {
			return destinationCountry;
		}
		public void setDestinationCountry(String destinationCountry) {
			this.destinationCountry = destinationCountry;
		}
		public int getRuleHierarchyOrder() {
			return ruleHierarchyOrder;
		}
		public void setRuleHierarchyOrder(int ruleHierarchyOrder) {
			this.ruleHierarchyOrder = ruleHierarchyOrder;
		}
		public String getPaymentCodeRule() {
			return paymentCodeRule;
		}
		public void setPaymentCodeRule(String paymentCodeRule) {
			this.paymentCodeRule = paymentCodeRule;
		}
		public String getOriginAggregate() {
			return originAggregate;
		}
		public void setOriginAggregate(String originAggregate) {
			this.originAggregate = originAggregate;
		}
		public String getDestinationAggregate() {
			return destinationAggregate;
		}
		public void setDestinationAggregate(String destinationAggregate) {
			this.destinationAggregate = destinationAggregate;
		}

//DL615 Ends
		/**
		 * @return the disbleAgentParticipant
		 */
		public boolean getDisbleAgentParticipant() {
			return disbleAgentParticipant;
		}

		/**
		 * @param disbleAgentParticipant the disbleAgentParticipant to set
		 */
		public void setDisbleAgentParticipant(boolean disbleAgentParticipant) {
			this.disbleAgentParticipant = disbleAgentParticipant;
		}
		
		//SK183 starts
		/**
		 * @return the associatedAwbIdentifier
		 */
		public String getAssociatedAwbIdentifier() {
			return associatedAwbIdentifier;
		}
		/**
		 * @param associatedAwbIdentifier
		 *            the associatedAwbIdentifier to set
		 */
		public void setAssociatedAwbIdentifier(String associatedAwbIdentifier) {
			this.associatedAwbIdentifier = associatedAwbIdentifier;
		}
	    //SK183 ends	

		public String getUpdateLMSFunction() {
			return updateLMSFunction;
		}

		public void setUpdateLMSFunction(String updateLMSFunction) {
			this.updateLMSFunction = updateLMSFunction;
		}

		public Integer getTotalLoyaltyPoints() {
			return totalLoyaltyPoints;
		}

		public void setTotalLoyaltyPoints(Integer totalLoyaltyPoints) {
			this.totalLoyaltyPoints = totalLoyaltyPoints;
		}

		public String getLoyaltyMemberName() {
			return loyaltyMemberName;
		}

		public void setLoyaltyMemberNamne(String loyaltyMemberName) {
			this.loyaltyMemberName = loyaltyMemberName;
		}

		public BigDecimal getBonusLoyaltypoints() {
			return bonusLoyaltypoints;
		}

		public void setBonusLoyaltypoints(BigDecimal bonusLoyaltypoints) {
			this.bonusLoyaltypoints = bonusLoyaltypoints;
		}

		public BigDecimal getBaseLoyaltyPoints() {
			return baseLoyaltyPoints;
		}

		public void setBaseLoyaltyPoints(BigDecimal baseLoyaltyPoints) {
			this.baseLoyaltyPoints = baseLoyaltyPoints;
		}

		public String getLoyaltyId() {
			return loyaltyId;
		}

		public void setLoyaltyId(String loyaltyId) {
			this.loyaltyId = loyaltyId;
		}

		public String getAwbDatabaseKey() {
			return awbDatabaseKey;
		}

		public void setAwbDatabaseKey(String awbDatabaseKey) {
			this.awbDatabaseKey = awbDatabaseKey;
		}

		public AirWaybillNumberDto getReferenceAirwaybill() {
			return referenceAirwaybill;
		}

		public void setReferenceAirwaybill(AirWaybillNumberDto referenceAirwaybill) {
			this.referenceAirwaybill = referenceAirwaybill;
		}

		public int getAwbVersion() {
			return awbVersion;
		}

		public void setAwbVersion(int awbVersion) {
			this.awbVersion = awbVersion;
		}

		public String getPlannedAllotmentId() {
			return plannedAllotmentId;
		}

		public void setPlannedAllotmentId(String plannedAllotmentId) {
			this.plannedAllotmentId = plannedAllotmentId;
		}

		public Date getAllotmentDate() {
			return allotmentDate;
		}

		public void setAllotmentDate(Date allotmentDate) {
			this.allotmentDate = allotmentDate;
		}

		public boolean isLocked() {
			return locked;
		}

		public void setLocked(boolean locked) {
			this.locked = locked;
		}

		public boolean isBookingInd() {
			return bookingInd;
		}

		public void setBookingInd(boolean bookingInd) {
			this.bookingInd = bookingInd;
		}

		public boolean isUpdateAWBInd() {
			return updateAWBInd;
		}

		public void setUpdateAWBInd(boolean updateAWBInd) {
			this.updateAWBInd = updateAWBInd;
		}

		public DueType getDueType() {
			return dueType;
		}

		public void setDueType(DueType dueType) {
			this.dueType = dueType;
		}

		public String getTransitTransferInd() {
			return transitTransferInd;
		}

		public void setTransitTransferInd(String transitTransferInd) {
			this.transitTransferInd = transitTransferInd;
		}

		public Date getExpiryDateTime() {
			return expiryDateTime;
		}

		public void setExpiryDateTime(Date expiryDateTime) {
			this.expiryDateTime = expiryDateTime;
		}

		public List<String> getDimensionDescriptions() {
			return dimensionDescriptions;
		}

		public void setDimensionDescriptions(List<String> dimensionDescriptions) {
			this.dimensionDescriptions = dimensionDescriptions;
		}

		public String getCustomerSegmentation() {
			return customerSegmentation;
		}

		public void setCustomerSegmentation(String customerSegmentation) {
			this.customerSegmentation = customerSegmentation;
		}

		public Integer getProductQueueServiceLevel() {
			return productQueueServiceLevel;
		}

		public void setProductQueueServiceLevel(Integer productQueueServiceLevel) {
			this.productQueueServiceLevel = productQueueServiceLevel;
		}

		public boolean isDeleteInd() {
			return deleteInd;
		}

		public void setDeleteInd(boolean deleteInd) {
			this.deleteInd = deleteInd;
		}

		public List<String> getSpecialHandlingRemarks() {
			return specialHandlingRemarks;
		}

		public void setSpecialHandlingRemarks(List<String> specialHandlingRemarks) {
			this.specialHandlingRemarks = specialHandlingRemarks;
		}

		/**
		 * @return the carrier
		 */
		public String getCarrier() {
			return carrier;
		}

		/**
		 * @param carrier the carrier to set
		 */
		public void setCarrier(String carrier) {
			this.carrier = carrier;
		}
}
