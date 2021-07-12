package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.ExportImportIndicatorType;
import com.unisys.trans.logistics.lms.framework.dto.constants.GoodsStatusType;

public class GoodsDetailDto implements Serializable {

    private static final long serialVersionUID = 390463357693035432L;

    /**
     * Attribute to holds <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to holds <code>airWaybillNumberDto</code> property.
     */
    private AirWaybillNumberDto airWaybillNumberDto;

    /**
     * Attribute to holds <code>airwaybillOId</code> property.
     */
    private Long airwaybillOId;

    /**
     * Attribute to holds <code>containerId</code> property.
     */
    private String containerId;

    /**
     * Attribute to holds <code>productCode</code> property.
     */
    private String productCode;

    /**
     * Attribute to holds <code>splCodes</code> property.
     */
    private List<String> splCodes;

    /**
     * Attribute to holds <code>nextActionStation</code> property.
     */
    private String nextActionStation;

    /**
     * Attribute to holds <code>nextActionDateTime</code> property.
     */
    private Date nextActionDateTime;

    /**
     * Attribute to holds <code>currentStation</code> property.
     */
    private String currentStation;

    /**
     * Attribute to holds <code>inactiveUld</code> property.
     */
    private boolean inactiveUld;

    /**
     * Attribute to holds <code>pharmaInd</code> property.
     */
    private boolean pharmaInd;

    /**
     * Attribute to holds <code>spclCodesAsString</code> property.
     */
    private String spclCodesAsString;

    /**
     * Attribute to holds <code>yellowInd</code> property.
     */
    private String yellowInd;

    /**
     * Attribute to holds <code>fiaInd</code> property.
     */
    private boolean fiaInd;

    /**
     * Attribute to holds <code>autoFlightAssignmentInd</code> property.
     */
    private boolean autoFlightAssignmentInd;

    /**
     * Attribute to holds <code>currentOffice</code> property.
     */
    private String currentOffice;

    /**
     * Attribute to holds <code>bookingSegmentNumber</code> property.
     */
    private Integer bookingSegmentNumber;

    /**
     * Attribute to holds <code>rowIndex</code> property.
     */
    private String rowIndex;

    /**
     * Attribute to holds <code>pieces</code> property.
     */
    private Integer pieces;

    /**
     * Attribute to holds <code>volume</code> property.
     */
    private BigDecimal volume;

    /**
     * Attribute to holds <code>weight</code> property.
     */
    private BigDecimal weight;

    /**
     * Attribute to holds <code>partID</code> property.
     */
    private Integer partID;

    /**
     * Attribute to holds <code>prepackInd</code> property.
     */
    private boolean prepackInd;

    /**
     * Attribute to holds <code>uldIdentifier</code> property.
     */
    private String uldIdentifier;

    /**
     * Attribute to holds <code>location</code> property.
     */
    private String location;

    /**
     * Attribute to holds <code>messageFormat</code> property.
     */
    private String messageFormat;

    /**
     * Attribute to holds <code>userAuditDto</code> property.
     */
    private UserAuditDto userAuditDto;

    /**
     * Attribute to holds <code>awbNumberDto</code> property.
     */
    private AirWaybillNumberDto awbNumberDto;

    /**
     * Attribute to holds <code>flightDate</code> property.
     */
    private Date flightDate;

    /**
     * Attribute to holds <code>flightNumber</code> property.
     */
    private String flightNumber;

    /**
     * Attribute to holds <code>awbDBKeyInd</code> property.
     */
    private String awbDBKeyInd;

    /**
     * Attribute to holds <code>exportImportIndicatorType</code> property.
     */
    private ExportImportIndicatorType exportImportIndicatorType;

    /**
     * Attribute to holds <code>lastMessageFormat</code> property.
     */
    private String lastMessageFormat;

    /**
     * Attribute to holds <code>originStation</code> property.
     */
    private String originStation;

    /**
     * Attribute to holds <code>destinationStation</code> property.
     */
    private String destinationStation;

    /**
     * Attribute to holds <code>rateLineDescriptors</code> property.
     */
    private List<String> rateLineDescriptors;

    /**
     * Attribute to holds <code>participantAgentID</code> property.
     */
    private String participantAgentID;

    /**
     * Attribute to holds <code>natureOfGoods</code> property.
     */
    private String natureOfGoods;

    /**
     * Attribute to holds <code>bookedPieces</code> property.
     */
    private Integer bookedPieces;

    /**
     * Attribute to holds <code>bookedWeight</code> property.
     */
    private BigDecimal bookedWeight;

    /**
     * Attribute to holds <code>bookedVolume</code> property.
     */
    private BigDecimal bookedVolume;

    /**
     * Attribute to holds <code>bookingRemarks</code> property.
     */
    private String bookingRemarks;

    /**
     * Attribute to holds <code>portDischarge</code> property.
     */
    private String portDischarge;

    /**
     * Attribute to holds <code>airwaybillOrigin</code> property.
     */
    private String airwaybillOrigin;

    /**
     * Attribute to holds <code>airwaybillDestination</code> property.
     */
    private String airwaybillDestination;

    /**
     * Attribute to holds <code>bookedFlightStatus</code> property.
     */
    private String bookedFlightStatus;

    /**
     * Attribute to holds <code>amendmentType</code> property.
     */
    private String amendmentType;

    /**
     * Attribute to holds <code>goodsCheckedInFlight</code> property.
     */
    private boolean goodsCheckedInFlight;

    /**
     * Attribute to hold the <code> awbReleaseStatus </code>
     */
    private String awbReleaseStatus;

    /**
     * Attribute to holds <code>airwaybillNumber</code> property.
     */
    private String airwaybillNumber;

    /**
     * Attribute to holds <code>goodsStatus</code> property.
     */
    private GoodsStatusType goodsStatus;

    /**
     * Attribute to holds <code>suggestedPartId</code> property.
     */
    private Integer suggestedPartId;

    /**
     * Attribute to holds <code>expiryDateTime</code> property.
     */
    private Date expiryDateTime;

    /**
     * Attribute to hold the <code> lmsULDIdentifier </code>
     */
    private String lmsULDIdentifier;

    /**
     * Attribute to hold the <code> uldWeight </code> property
     */
    private BigDecimal uldWeight;

    /**
     * Attribute to hold the <code> participantConsigneeName </code> property
     */
    private String participantConsigneeName;

    /**
     * Attribute to hold the <code> sendFSUMessageInd </code> property
     */
    private boolean sendFSUMsgInd;

    /**
     * Attribute to hold the <code> flightAssign </code> property
     */
    private boolean flightAssign;

    /**
     * Attribute to holds <code>awbOId</code> property.
     */
    private Long awbOId;

    /**
     * Attribute to holds <code>goodsOId</code> property.
     */
    private Long goodsOId;

    /**
     * Attribute to holds <code>createdDate</code> property.
     */
    private Date createdDate;

    /**
     * Attribute to holds <code>status</code> property.
     */
    private String status;

    /**
     * Attribute to holds <code>oldOId</code> property.
     */
    private Long oldOId;

    /**
     * Attribute to hold the <code> uldShipmentType </code> property
     */
    private ExportImportIndicatorType uldShipmentType;

    /**
     * Attribute to hold the <code> uldDestination </code> property
     */
    private String uldDestination;

    /**
     * Attribute to hold the <code> fsuApmInd </code> property
     */
    private String fsuApmInd;

    /**
     * Attribute to hold the <code> fsuMsgInd </code> property
     */
    private String fsuMsgInd;
    
    /**
     * Attribute to hold the <code> sluldInd </code> property
     */
    private boolean sluldInd;

    /**
     * Attribute to hold the <code> goodsTransitDetailsDtos </code> property
     */
    private List<GoodsTransitDetailsDto> goodsTransitDetailsDtos;
    
    // FIS139 Start
    /**
     * Attribute to hold the <code> redInd </code> property
     */
    private String redInd;

    /**
     * Attribute to hold the <code> colorFlag </code> property
     */
    private boolean colorFlag;
    // FIS139 End

    /**
     * @return the goodsTransitDetailsDtos
     */
    public List<GoodsTransitDetailsDto> getGoodsTransitDetailsDtos() {
        return this.goodsTransitDetailsDtos;
    }

    /**
     * @param goodsTransitDetailsDtos the goodsTransitDetailsDtos to set
     */
    public void setGoodsTransitDetailsDtos(final List<GoodsTransitDetailsDto> pGoodsTransitDetailsDtos) {
        this.goodsTransitDetailsDtos = pGoodsTransitDetailsDtos;
    }

    /**
     * @return the uldShipmentType
     */
    public ExportImportIndicatorType getUldShipmentType() {
        return this.uldShipmentType;
    }

    /**
     * @param uldShipmentType the uldShipmentType to set
     */
    public void setUldShipmentType(final ExportImportIndicatorType pUldShipmentType) {
        this.uldShipmentType = pUldShipmentType;
    }

    /**
     * @return the participantAgentID
     */
    public String getParticipantAgentID() {
        return this.participantAgentID;
    }

    /**
     * @param participantAgentID the participantAgentID to set
     */
    public void setParticipantAgentID(final String pParticipantAgentID) {
        this.participantAgentID = pParticipantAgentID;
    }

    /**
     * @return the natureOfGoods
     */
    public String getNatureOfGoods() {
        return this.natureOfGoods;
    }

    /**
     * @param natureOfGoods the natureOfGoods to set
     */
    public void setNatureOfGoods(final String pNatureOfGoods) {
        this.natureOfGoods = pNatureOfGoods;
    }

    /**
     * @return the bookedPieces
     */
    public Integer getBookedPieces() {
        return this.bookedPieces;
    }

    /**
     * @param bookedPieces the bookedPieces to set
     */
    public void setBookedPieces(final Integer pBookedPieces) {
        this.bookedPieces = pBookedPieces;
    }

    /**
     * @return the bookedWeight
     */
    public BigDecimal getBookedWeight() {
        return this.bookedWeight;
    }

    /**
     * @param bookedWeight the bookedWeight to set
     */
    public void setBookedWeight(final BigDecimal pBookedWeight) {
        this.bookedWeight = pBookedWeight;
    }

    /**
     * @return the bookedVolume
     */
    public BigDecimal getBookedVolume() {
        return this.bookedVolume;
    }

    /**
     * @param bookedVolume the bookedVolume to set
     */
    public void setBookedVolume(BigDecimal pBookedVolume) {
        this.bookedVolume = pBookedVolume;
    }

    /**
     * @return the bookingRemarks
     */
    public String getBookingRemarks() {
        return this.bookingRemarks;
    }

    /**
     * @param bookingRemarks the bookingRemarks to set
     */
    public void setBookingRemarks(final String pBookingRemarks) {
        this.bookingRemarks = pBookingRemarks;
    }

    /**
     * @return the portDischarge
     */
    public String getPortDischarge() {
        return this.portDischarge;
    }

    /**
     * @param portDischarge the portDischarge to set
     */
    public void setPortDischarge(final String pPortDischarge) {
        this.portDischarge = pPortDischarge;
    }

    /**
     * @return the airwaybillOrigin
     */
    public String getAirwaybillOrigin() {
        return this.airwaybillOrigin;
    }

    /**
     * @param airwaybillOrigin the airwaybillOrigin to set
     */
    public void setAirwaybillOrigin(final String pAirwaybillOrigin) {
        this.airwaybillOrigin = pAirwaybillOrigin;
    }

    /**
     * @return the airwaybillDestination
     */
    public String getAirwaybillDestination() {
        return this.airwaybillDestination;
    }

    /**
     * @param airwaybillDestination the airwaybillDestination to set
     */
    public void setAirwaybillDestination(final String pAirwaybillDestination) {
        this.airwaybillDestination = pAirwaybillDestination;
    }

    /**
     * @return the rowIndex
     */
    public String getRowIndex() {
        return this.rowIndex;
    }

    /**
     * @param rowIndex the rowIndex to set
     */
    public void setRowIndex(final String pRowIndex) {
        this.rowIndex = pRowIndex;
    }

    /**
     * @return the oId
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * @param oId the oId to set
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * @return the containerId
     */
    public String getContainerId() {
        return this.containerId;
    }

    /**
     * @param containerId the containerId to set
     */
    public void setContainerId(final String pContainerId) {
        this.containerId = pContainerId;
    }

    /**
     * @return the productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @param productCode the productCode to set
     */
    public void setProductCode(final String pProductCode) {
        this.productCode = pProductCode;
    }

    /**
     * @return the splCodes
     */
    public List<String> getSplCodes() {
        if (this.splCodes == null) {
            this.splCodes = new ArrayList<String>();
        }
        return this.splCodes;
    }

    /**
     * @param splCodes the splCodes to set
     */
    public void setSplCodes(final List<String> pSplCodes) {
        this.splCodes = pSplCodes;
    }

    /**
     * @return the nextActionStation
     */
    public String getNextActionStation() {
        return this.nextActionStation;
    }

    /**
     * @param nextActionStation the nextActionStation to set
     */
    public void setNextActionStation(final String pNextActionStation) {
        this.nextActionStation = pNextActionStation;
    }

    /**
     * @return the nextActionDateTime
     */
    public Date getNextActionDateTime() {
        if (nextActionDateTime != null) {
            return (Date) nextActionDateTime.clone();
        }
        else {
            return null;
        }
    }

    /**
     * @param nextActionDateTime the nextActionDateTime to set
     */
    public void setNextActionDateTime(final Date pNextActionDateTime) {
        if (pNextActionDateTime != null) {
            this.nextActionDateTime = (Date) pNextActionDateTime.clone();
        }
        else {
            this.nextActionDateTime = null;
        }
    }

    /**
     * @return the currentStation
     */
    public String getCurrentStation() {
        return this.currentStation;
    }

    /**
     * @param currentStation the currentStation to set
     */
    public void setCurrentStation(final String pCurrentStation) {
        this.currentStation = pCurrentStation;
    }

    /**
     * @return the inactiveUld
     */
    public boolean isInactiveUld() {
        return this.inactiveUld;
    }

    /**
     * @param inactiveUld the inactiveUld to set
     */
    public void setInactiveUld(final boolean pInactiveUld) {
        this.inactiveUld = pInactiveUld;
    }

    /**
     * @return the airWaybillNumberDto
     */
    public AirWaybillNumberDto getAirWaybillNumberDto() {
        return this.airWaybillNumberDto;
    }

    /**
     * @param airWaybillNumberDto the airWaybillNumberDto to set
     */
    public void setAirWaybillNumberDto(final AirWaybillNumberDto pAirWaybillNumberDto) {
        this.airWaybillNumberDto = pAirWaybillNumberDto;
    }

    /**
     * @return the pharmaInd
     */
    public boolean getPharmaInd() {
        return this.pharmaInd;
    }

    /**
     * @param pPharmaInd the pharmaInd to set
     */
    public void setPharmaInd(final boolean pPharmaInd) {
        this.pharmaInd = pPharmaInd;
    }

    /**
     * @return the airwaybillOId
     */
    public Long getAirwaybillOId() {
        return this.airwaybillOId;
    }

    /**
     * @param airwaybillOId the airwaybillOId to set
     */
    public void setAirwaybillOId(final Long pAirwaybillOId) {
        this.airwaybillOId = pAirwaybillOId;
    }

    /**
     * @return the spclCodesAsString
     */
    public String getSpclCodesAsString() {
        return this.spclCodesAsString;
    }

    /**
     * @param pSpclCodesAsString the spclCodesAsString to set
     */
    public void setSpclCodesAsString(final String pSpclCodesAsString) {
        this.spclCodesAsString = pSpclCodesAsString;
    }

    /**
     * @return the yellowInd
     */
    public String getYellowInd() {
        return this.yellowInd;
    }

    /**
     * @param pYellowInd the yellowInd to set
     */
    public void setYellowInd(final String pYellowInd) {
        this.yellowInd = pYellowInd;
    }

    /**
     * @return the fiaInd
     */
    public boolean isFiaInd() {
        return this.fiaInd;
    }

    /**
     * @param fiaInd the fiaInd to set
     */
    public void setFiaInd(final boolean pFiaInd) {
        this.fiaInd = pFiaInd;
    }

    /**
     * @return the autoFlightAssignmentInd
     */
    public boolean isAutoFlightAssignmentInd() {
        return this.autoFlightAssignmentInd;
    }

    /**
     * @param pAutoFlightAssignmentInd the autoFlightAssignmentInd to set
     */
    public void setAutoFlightAssignmentInd(final boolean pAutoFlightAssignmentInd) {
        this.autoFlightAssignmentInd = pAutoFlightAssignmentInd;
    }

    /**
     * @return the currentOffice
     */
    public String getCurrentOffice() {
        return this.currentOffice;
    }

    /**
     * @param pCurrentOffice the currentOffice to set
     */
    public void setCurrentOffice(final String pCurrentOffice) {
        this.currentOffice = pCurrentOffice;
    }

    /**
     * @return the pieces
     */
    public Integer getPieces() {
        return this.pieces;
    }

    /**
     * @param pieces the pieces to set
     */
    public void setPieces(final Integer pPieces) {
        this.pieces = pPieces;
    }

    /**
     * @return the volume
     */
    public BigDecimal getVolume() {
        return this.volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(final BigDecimal pVolume) {
        this.volume = pVolume;
    }

    /**
     * @return the weight
     */
    public BigDecimal getWeight() {
        return this.weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(final BigDecimal pWeight) {
        this.weight = pWeight;
    }

    /**
     * @return the partID
     */
    public Integer getPartID() {
        return this.partID;
    }

    /**
     * @param partID the partID to set
     */
    public void setPartID(final Integer pPartID) {
        this.partID = pPartID;
    }

    /**
     * @return the prepackInd
     */
    public boolean isPrepackInd() {
        return this.prepackInd;
    }

    /**
     * @param prepackInd the prepackInd to set
     */
    public void setPrepackInd(final boolean pPrepackInd) {
        this.prepackInd = pPrepackInd;
    }

    /**
     * @return the uLDIdentifier
     */
    public String getUldIdentifier() {
        return this.uldIdentifier;
    }

    /**
     * @param uLDIdentifier the uLDIdentifier to set
     */
    public void setUldIdentifier(final String pULDIdentifier) {
        uldIdentifier = pULDIdentifier;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(final String pLocation) {
        this.location = pLocation;
    }

    /**
     * @return the messageFormat
     */
    public String getMessageFormat() {
        return this.messageFormat;
    }

    /**
     * @param messageFormat the messageFormat to set
     */
    public void setMessageFormat(final String pMessageFormat) {
        this.messageFormat = pMessageFormat;
    }

    /**
     * @return the userAuditDto
     */
    public UserAuditDto getUserAuditDto() {
        return this.userAuditDto;
    }

    /**
     * @param userAuditDto the userAuditDto to set
     */
    public void setUserAuditDto(final UserAuditDto pUserAuditDto) {
        this.userAuditDto = pUserAuditDto;
    }

    /**
     * @return the awbNumberDto
     */
    public AirWaybillNumberDto getAwbNumberDto() {
        return this.awbNumberDto;
    }

    /**
     * @param awbNumberDto the awbNumberDto to set
     */
    public void setAwbNumberDto(final AirWaybillNumberDto pAwbNumberDto) {
        this.awbNumberDto = pAwbNumberDto;
    }

    /**
     * @return the flightDate
     */
    public Date getFlightDate() {
        if (flightDate != null) {
            return (Date) flightDate.clone();
        }
        else {
            return null;
        }
    }

    /**
     * @param FlightDate the flightDate to set
     */
    public void setFlightDate(final Date pFlightDate) {
        if (pFlightDate != null) {
            this.flightDate = (Date) pFlightDate.clone();
        }
        else {
            this.flightDate = null;
        }
    }

    /**
     * @return the flightNumber
     */
    public String getFlightNumber() {
        return this.flightNumber;
    }

    /**
     * @param flightNumber the flightNumber to set
     */
    public void setFlightNumber(final String pFlightNumber) {
        this.flightNumber = pFlightNumber;
    }

    /**
     * @return the awbDBKeyInd
     */
    public String getAwbDBKeyInd() {
        return this.awbDBKeyInd;
    }

    /**
     * @param awbDBKeyInd the awbDBKeyInd to set
     */
    public void setAwbDBKeyInd(final String awbDBKeyInd) {
        this.awbDBKeyInd = awbDBKeyInd;
    }

    /**
     * @return the exportImportIndicatorType
     */
    public ExportImportIndicatorType getExportImportIndicatorType() {
        return this.exportImportIndicatorType;
    }

    /**
     * @param exportImportIndicatorType the exportImportIndicatorType to set
     */
    public void setExportImportIndicatorType(final ExportImportIndicatorType pExportImportIndicatorType) {
        this.exportImportIndicatorType = pExportImportIndicatorType;
    }

    /**
     * @return the bookingSegmentNumber
     */
    public Integer getBookingSegmentNumber() {
        return this.bookingSegmentNumber;
    }

    /**
     * @param bookingSegmentNumber the bookingSegmentNumber to set
     */
    public void setBookingSegmentNumber(final Integer pBookingSegmentNumber) {
        this.bookingSegmentNumber = pBookingSegmentNumber;
    }

    /**
     * @return the lastMessageFormat
     */
    public String getLastMessageFormat() {
        return this.lastMessageFormat;
    }

    /**
     * @param lastMessageFormat the lastMessageFormat to set
     */
    public void setLastMessageFormat(final String pLastMessageFormat) {
        this.lastMessageFormat = pLastMessageFormat;
    }

    /**
     * @return the originStation
     */
    public String getOriginStation() {
        return this.originStation;
    }

    /**
     * @param originStation the originStation to set
     */
    public void setOriginStation(final String pOriginStation) {
        this.originStation = pOriginStation;
    }

    /**
     * @return the destinationStation
     */
    public String getDestinationStation() {
        return this.destinationStation;
    }

    /**
     * @param destinationStation the destinationStation to set
     */
    public void setDestinationStation(final String pDestinationStation) {
        this.destinationStation = pDestinationStation;
    }

    /**
     * @return the rateLineDescriptors
     */
    public List<String> getRateLineDescriptors() {
        return this.rateLineDescriptors;
    }

    /**
     * @param rateLineDescriptors the rateLineDescriptors to set
     */
    public void setRateLineDescriptors(final List<String> pRateLineDescriptors) {
        this.rateLineDescriptors = pRateLineDescriptors;
    }

    /**
     * @return the bookedFlightStatus
     */
    public String getBookedFlightStatus() {
        return this.bookedFlightStatus;
    }

    /**
     * @param bookedFlightStatus the bookedFlightStatus to set
     */
    public void setBookedFlightStatus(final String pBookedFlightStatus) {
        this.bookedFlightStatus = pBookedFlightStatus;
    }

    /**
     * @return the amendmentType
     */
    public String getAmendmentType() {
        return this.amendmentType;
    }

    /**
     * @param amendmentType the amendmentType to set
     */
    public void setAmendmentType(final String pAmendmentType) {
        this.amendmentType = pAmendmentType;
    }

    /**
     * @return the goodsCheckedInFlight
     */
    public boolean isGoodsCheckedInFlight() {
        return this.goodsCheckedInFlight;
    }

    /**
     * @param pGoodsCheckedInFlight the goodsCheckedInFlight to set
     */
    public void setGoodsCheckedInFlight(final boolean pGoodsCheckedInFlight) {
        this.goodsCheckedInFlight = pGoodsCheckedInFlight;
    }

    /**
     * @return the awbReleaseStatus
     */
    public String getAwbReleaseStatus() {
        return this.awbReleaseStatus;
    }

    /**
     * @param pAwbReleaseStatus the awbReleaseStatus to set
     */
    public void setAwbReleaseStatus(final String pAwbReleaseStatus) {
        this.awbReleaseStatus = pAwbReleaseStatus;
    }

    /**
     * @return the airwaybillNumber
     */
    public String getAirwaybillNumber() {
        return this.airwaybillNumber;
    }

    /**
     * @param airwaybillNumber the airwaybillNumber to set
     */
    public void setAirwaybillNumber(final String pAirwaybillNumber) {
        this.airwaybillNumber = pAirwaybillNumber;
    }

    /**
     * @return the goodsStatus
     */
    public GoodsStatusType getGoodsStatus() {
        return this.goodsStatus;
    }

    /**
     * @param pGoodsStatus the goodsStatus to set
     */
    public void setGoodsStatus(final GoodsStatusType pGoodsStatus) {
        this.goodsStatus = pGoodsStatus;
    }

    /**
     * @return the suggestedPartId
     */
    public Integer getSuggestedPartId() {
        return this.suggestedPartId;
    }

    /**
     * @param pSuggestedPartId the suggestedPartId to set
     */
    public void setSuggestedPartId(final Integer pSuggestedPartId) {
        this.suggestedPartId = pSuggestedPartId;
    }

    /**
     * @return the lmsULDIdentifier
     */
    public String getLmsULDIdentifier() {
        return this.lmsULDIdentifier;
    }

    /**
     * @param lmsULDIdentifier the lmsULDIdentifier to set
     */
    public void setLmsULDIdentifier(final String pLmsULDIdentifier) {
        this.lmsULDIdentifier = pLmsULDIdentifier;
    }

    /**
     * @return the expiryDateTime
     */
    public Date getExpiryDateTime() {
        if (expiryDateTime != null) {
            return (Date) this.expiryDateTime.clone();
        }
        else {
            return null;
        }
    }

    /**
     * @param pExpiryDateTime the expiryDateTime to set
     */
    public void setExpiryDateTime(final Date pExpiryDateTime) {
        if (pExpiryDateTime != null) {
            this.expiryDateTime = (Date) pExpiryDateTime.clone();
        }
        else {
            this.expiryDateTime = null;
        }
    }

    /**
     * @return the uldWeight
     */
    public BigDecimal getUldWeight() {
        return this.uldWeight;
    }

    /**
     * @param pUldWeight the uldWeight to set
     */
    public void setUldWeight(final BigDecimal pUldWeight) {
        this.uldWeight = pUldWeight;
    }

    /**
     * @return the participantConsigneeName
     */
    public String getParticipantConsigneeName() {
        return this.participantConsigneeName;
    }

    /**
     * @param pParticipantConsigneeName the participantConsigneeName to set
     */
    public void setParticipantConsigneeName(final String pParticipantConsigneeName) {
        this.participantConsigneeName = pParticipantConsigneeName;
    }

    /**
     * @return the sendFSUMsgInd
     */
    public boolean isSendFSUMsgInd() {
        return this.sendFSUMsgInd;
    }

    /**
     * @param pSendFSUMsgInd the sendFSUMsgInd to set
     */
    public void setSendFSUMsgInd(final boolean pSendFSUMsgInd) {
        this.sendFSUMsgInd = pSendFSUMsgInd;
    }

    /**
     * @return the flightAssign
     */
    public boolean isFlightAssign() {
        return this.flightAssign;
    }

    /**
     * @param pFlightAssign the flightAssign to set
     */
    public void setFlightAssign(final boolean pFlightAssign) {
        this.flightAssign = pFlightAssign;
    }

    /**
     * @return the awbOId
     */
    public Long getAwbOId() {
        return this.awbOId;
    }

    /**
     * @param pAwbOId the awbOId to set
     */
    public void setAwbOId(final Long pAwbOId) {
        this.awbOId = pAwbOId;
    }

    /**
     * @return the goodsOId
     */
    public Long getGoodsOId() {
        return this.goodsOId;
    }

    /**
     * @param pGoodsOId the goodsOId to set
     */
    public void setGoodsOId(final Long pGoodsOId) {
        this.goodsOId = pGoodsOId;
    }

    /**
     * @return the createdDate
     */
    public Date getCreatedDate() {
        if (createdDate != null) {
            return (Date) this.createdDate.clone();
        }
        else {
            return null;
        }
    }

    /**
     * @param pCreatedDate the createdDate to set
     */
    public void setCreatedDate(final Date pCreatedDate) {
        if (pCreatedDate != null) {
            this.createdDate = (Date) pCreatedDate.clone();
        }
        else {
            this.createdDate = null;
        }
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @param pStatus the status to set
     */
    public void setStatus(final String pStatus) {
        this.status = pStatus;
    }

    /**
     * @return the uldDestination
     */
    public String getUldDestination() {
        return this.uldDestination;
    }

    /**
     * @param uldDestination the uldDestination to set
     */
    public void setUldDestination(final String pUldDestination) {
        this.uldDestination = pUldDestination;
    }

    /**
     * @return the oldOId
     */
    public Long getOldOId() {
        return this.oldOId;
    }

    /**
     * @param oldOId the oldOId to set
     */
    public void setOldOId(final Long pOldOId) {
        this.oldOId = pOldOId;
    }

    /**
     * @return the fsuApmInd
     */
    public String getFsuApmInd() {
        return this.fsuApmInd;
    }

    /**
     * @param pFsuApmInd the fsuApmInd to set
     */
    public void setFsuApmInd(final String pFsuApmInd) {
        this.fsuApmInd = pFsuApmInd;
    }

    /**
     * @return the fsuMsgInd
     */
    public String getFsuMsgInd() {
        return this.fsuMsgInd;
    }

    /**
     * @param pFsuMsgInd the fsuMsgInd to set
     */
    public void setFsuMsgInd(final String pFsuMsgInd) {
        this.fsuMsgInd = pFsuMsgInd;
    }

    /**
     * @return the sluldInd
     */
    public boolean isSluldInd() {
        return sluldInd;
    }

    /**
     * @param sluldInd the sluldInd to set
     */
    public void setSluldInd(boolean sluldInd) {
        this.sluldInd = sluldInd;
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
	
    // FIS139 Start
    /**
     * @return the redInd
     */
    public String getRedInd() {
        return this.redInd;
    }

    /**
     * @param redInd the redInd to set
     */
    public void setRedInd(final String pRedInd) {
        this.redInd = pRedInd;
    }

    /**
     * @return the colorFlag
     */
    public boolean isColorFlag() {
        return this.colorFlag;
    }

    /**
     * @param pColorFlag the colorFlag to set
     */
    public void setColorFlag(final boolean pColorFlag) {
        this.colorFlag = pColorFlag;
    }
    // FIS139 End

}
