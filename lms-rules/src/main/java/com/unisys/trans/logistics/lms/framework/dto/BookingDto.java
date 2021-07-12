/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.VolumeUOMType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>BookingDto</code> is used for find Booking information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>arrivalFlight
 * <li>bookingControlStation
 * <li>bookingControlStatus
 * <li>bookingCreationSource
 * <li>bookingDateTime
 * <li>bookingReferenceNumber
 * <li>bookingDeleteIndicator
 * <li>deleteRemarks
 * <li>emailAddress
 * <li>flightControlOfficeQueue
 * <li>oId
 * <li>reasonCode
 * <li>rebookReasonCode
 * <li>remarks1
 * <li>remarks2
 * <li>remarks3
 * <li>remarks4
 * <li>requestSegmentNumber
 * <li>revision
 * <li>shipperRemarks
 * <li>splitBookingIndicator
 * <li>suggestedPieces
 * <li>suggestedVolume
 * <li>suggestedVolumeUnit
 * <li>suggestedWeight
 * <li>suggestedWeightUnit
 * <li>suppInformation1
 * <li>suppInformation2
 * <li>vcbIndicator
 * <li>volumeCompensationInd
 * <li>workOrder
 * 
 * </ul>
 */
public class BookingDto extends PersistenceObjectDto {
    
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -715882489513638716L;

    /**
     * Attribute to hold the <code>actionType</code> property.
     */
    private ActionType actionType;

    /**
     * Attribute to hold <code>arrivalFlight</code> property.
     */
    private FlightInfoDto arrivalFlight;

    /**
     * Attribute to hold <code>bookingControlOffice</code> property.
     */
    private String bookingControlOffice;

    /**
     * Attribute to hold <code>bookingControlStation</code> property.
     */
    private String bookingControlStation;

    /**
     * Attribute to hold <code>bookingControlStatus</code> property.
     */
    private String bookingControlStatus;

    /**
     * Attribute to hold <code>bookingCreationSource</code> property.
     */
    private String bookingCreationSource;

    /**
     * Attribute to hold <code>bookingDateTime</code> property.
     */
    private Date bookingDateTime;

    /**
     * Attribute to hold <code>bookingDeletionDetailDto</code> property.
     */
    private BookingDeletionDetailDto bookingDeletionDetailDto;

    /**
     * Attribute to hold <code>bookingDetailsSent</code> property.
     */
    private String bookingDetailsSent;

    /**
     * Attribute to hold <code>bookingReferenceNumber</code> property.
     */
    private String bookingReferenceNumber;

    /**
     * Attribute to hold <code>BookingRemarkDto</code> property.
     */
    private BookingRemarkDto bookingRemarkDto;

    /**
     * Attribute to hold <code>duplicateBookingInd</code> property.
     */
    private boolean createDuplicateBookingInd;

    /**
     * Attribute to hold <code>destinationTTYAddress</code> property.
     */
    private String destinationTTYAddress;

    /**
     * Attribute to hold <code>emailAddress</code> property.
     */
    private String emailAddress;

    /**
     * Attribute to hold <code>flightControlOfficeQueue</code> property.
     */
    private String flightControlOfficeQueue;

    /**
     * Attribute to hold <code>fctlReasonCode</code> property.
     */
    private String fctlReasonCode;

    /**
     * Attribute to hold <code>isOrderCompleted</code> property.
     */
    private boolean orderCompleted;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>rebookReasonCode</code> property.
     */
    private String rebookReasonCode;

    /**
     * Attribute to hold <code>reasonCode</code> property.
     */
    private String reasonCode;

    /**
     * Attribute to hold <code>replySentBCTL</code> property.
     */
    private boolean replySentBCTL;

    /**
     * Attribute to hold <code>segments</code> property.
     */
    private List<BookingSegmentDto> segments;

    /**
     * Attribute to hold <code>shipperRemarks</code> property.
     */
    private String shipperRemarks;

    /**
     * Attribute to hold <code>splitBookingIndicator</code> property.
     */
    private String splitBookingIndicator;

    /**
     * Attribute to hold <code>suppInformation1</code> property.
     */
    private String suppInformation1;

    /**
     * Attribute to hold <code>suppInformation2</code> property.
     */
    private String suppInformation2;

    /**
     * Attribute to hold <code>userContact</code> property.
     */
    private String userContact;

    /**
     * Attribute to hold <code>userEmail</code> property.
     */
    private String userEmail;

    /**
     * Attribute to hold <code>0</code>invokedFromContextMenu<br>
     * <p>
     * Value = {@value}
     */
    private boolean invokedFromContextMenu;

    /**
     * Attribute to hold <code>userPhone</code> property.
     */
    private String userPhone;

    /**
     * Attribute to hold <code>volumeCompensationInd</code> property.
     */
    private boolean volumeCompensationInd;

    /**
     * Attribute to hold <code>volumeUnit</code> property.
     */
    private VolumeUOMType volumeUnit;

    /**
     * Attribute to hold <code>suggestedWeightUnit</code> property.
     */
    private WeightUOMType weightUnit;

    /**
     * Attribute to hold <code>workOrder</code> property.
     */
    private WorkOrderDto workOrder;

    /**
     * Attribute to hold <code>arrivalFlightDate</code> property.
     */
    private Date arrivalFlightDate;

    /**
     * Attribute to holds <code>latestAcceptanceDateTime</code> property.
     */
    private Date departureFlightDate;

    /**
     * Attribute to hold <code>booked weight</code> property.
     */
    private BigDecimal bookedWeight;

    /* SK204 starts */
    /**
     * Attribute to hold <code>updatePricing</code> property.<br>
     */
    private boolean updatePricing;

    /**
     * Attribute to hold <code>locked</code> property.<br>
     */
    private String plannedLocked;

    /**
     * Attribute to hold <code>plannedAllotmentId</code> property.<br>
     */
    private String plannedAllotmentId;

    /**
     * Attribute to hold <code>plannedAllotmentId</code> property.<br>
     */
    private Date plannedAllotmentDate;

    private String rebookReasonDesc;

    /* SK204 ends */
    
    
    /* RFC SK164H Changes_Start */
    
    /**
     * Attribute to hold <code>bookingFeeWaiveOffCounter</code> property.
     */
    private Integer bookingFeeWaiveOffCounter;

    /**
     * Attribute to hold <code>bookingFeeWaivedOff</code> property.
     */
    private boolean bookingFeeWaivedOff;

    /**
     * Attribute to hold <code>bookingFeeRemark</code> property.
     */
    private String bookingFeeRemark;

    /**
     * Attribute to hold <code>updateFeeApplied</code> property.<br>
     */
    private boolean updateFeeApplied;
    /**
     * Attribute to hold <code>deleteFeeApplied</code> property.<br>
     */
    private boolean deleteFeeApplied;
    
    /**
     * Attribute to hold <code>otherChargeCodeSubcodeValid</code> property.<br>
     */
    private boolean otherChargeCodeSubcodeValid;
    
    /**
     * Attribute to hold <code>otherChargeCodeDueCarrier</code> property.<br>
     */
    private boolean otherChargeCodeDueCarrier;
    
    /**
     * Attribute to hold <code>otherChargeRatesNotExist</code> property.<br>
     */
    private boolean otherChargeRatesNotExist;
    
    /**
     * Attribute to hold <code>previousBookingFees</code> property.<br>
     */
    private List<BookingFeeChargeDto> previousBookingFees;
    
    
    private String remarks1;
    
    private String remarks2;
    
    private String remarks3;
    
    private String remarks4;
    
    private String vcbIndicator;
    
    private String deleteRemarks;
    
    private String overallBookingStatus;
    
    
    
    
    private FlightInfoDto arrivalFlight1;
    /* RFC SK164H Changes_End */
    
    
    /**
     * Attribute to hold <code>booked volume</code> property.
     */
    private BigDecimal bookedVolume;

    private String efsubkdSent; //AC416
    
    private Integer suggestedPieces;

    private BigDecimal suggestedVolume;

    private BigDecimal suggestedWeight;

    private WeightUOMType suggestedWeightUnit;
    
    private VolumeUOMType suggestedVolumeUnit;
    /**
     * Gets the <code>actionType</code> property.
     * <p>
     * 
     * @return the current value of the <code>actionType</code> property.
     */
    public ActionType getActionType() {
        return this.actionType;
    }

    /**
     * Gets the <code>ArrivalFlight</code> property.
     * <p>
     * 
     * @return the current value of the <code>ArrivalFlight</code> property.
     */
    public FlightInfoDto getArrivalFlight() {
        if (this.arrivalFlight == null) {
            this.arrivalFlight = new FlightInfoDto();
        }
        return this.arrivalFlight;
    }

    /**
     * @return the arrivalFlightDate
     */
    public Date getArrivalFlightDate() {
        return ContractUtility.getClonedDate(this.arrivalFlightDate);
    }

    /**
     * Gets the <code>BookingControlOffice</code> property.
     * <p>
     * 
     * @return the current value of the <code>BookingControlOffice</code>
     *         property.
     */

    public String getBookingControlOffice() {
        return this.bookingControlOffice;
    }

    /**
     * Gets the <code>BookingControlStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>BookingControlStation</code>
     *         property.
     */
    public String getBookingControlStation() {
        return this.bookingControlStation;
    }

    /**
     * Gets the <code>BookingControlStatus</code> property.
     * <p>
     * 
     * @return the current value of the <code>BookingControlStatus</code>
     *         property.
     */
    public String getBookingControlStatus() {
        return this.bookingControlStatus;
    }

    public BigDecimal getBookedVolume() {
        return this.bookedVolume;
    }

    public BigDecimal getBookedWeight() {
        return this.bookedWeight;
    }

    /**
     * Gets the <code>BookingCreationSource</code> property.
     * <p>
     * 
     * @return the current value of the <code>BookingCreationSource</code>
     *         property.
     */
    public String getBookingCreationSource() {
        return this.bookingCreationSource;
    }

    /**
     * Gets the <code>BookingDateTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>BookingDateTime</code> property.
     */
    public Date getBookingDateTime() {
        return ContractUtility.getClonedDate(this.bookingDateTime);
    }

    /**
     * Gets the <code>BookingDeletionDetailDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>BookingDeletionDetailDto</code>
     *         property.
     */
    public BookingDeletionDetailDto getBookingDeletionDetailDto() {
        return this.bookingDeletionDetailDto;
    }

    /**
     * Gets the <code>bookingDetailsSent</code> property.
     * 
     * @return the bookingDetailsSent
     */
    public String getBookingDetailsSent() {
        return this.bookingDetailsSent;
    }

    /**
     * Gets the <code>BookingReferenceNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>BookingReferenceNumber</code>
     *         property.
     */
    public String getBookingReferenceNumber() {
        return this.bookingReferenceNumber;
    }

    /**
     * Gets the <code>bookingRemarkDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookingRemarkDto</code> property.
     */
    public BookingRemarkDto getBookingRemarkDto() {
        if (this.bookingRemarkDto == null) {
            this.bookingRemarkDto = new BookingRemarkDto();
        }
        return this.bookingRemarkDto;
    }

    /**
     * @return the departureFlightDate
     */
    public Date getDepartureFlightDate() {
        return ContractUtility.getClonedDate(this.departureFlightDate);
    }

    /**
     * @return the destinationTTYAddress
     */
    public String getDestinationTTYAddress() {
        return this.destinationTTYAddress;
    }

    /**
     * Gets the <code>EmailAddress</code> property.
     * <p>
     * 
     * @return the current value of the <code>EmailAddress</code> property.
     */
    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * Gets the <code>FlightControlOfficeQueue</code> property.
     * <p>
     * 
     * @return the current value of the <code>FlightControlOfficeQueue</code>
     *         property.
     */
    public String getFlightControlOfficeQueue() {
        return this.flightControlOfficeQueue;
    }

    public String getFctlReasonCode() {
        return fctlReasonCode;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>OId</code> property.
     */
    @Override
    public Long getOId() {

        return this.oId;
    }

    /**
     * Gets the <code>reasonCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>reasonCode</code> property.
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * Gets the <code>RebookReasonCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>RebookReasonCode</code> property.
     */
    public String getRebookReasonCode() {
        return this.rebookReasonCode;
    }

    /**
     * Gets the <code>SegmentBySegmentNumber</code> property.
     * <p>
     * The <code>SegmentBySegmentNumber</code> holds the details of the
     * SegmentBySegmentNumber.
     * <p>
     * 
     * @return the current value of <code>BookingSegmentDto</code> property.
     */

    public BookingSegmentDto getSegmentBySegmentNumber(
            final Integer pSegmentNumber) {
        BookingSegmentDto aBookingSegmentDto = null;
        if (!this.segments.isEmpty()) {
            for (final BookingSegmentDto bBookingSegmentDto : this.segments) {
                if (bBookingSegmentDto.getBookingSegmentNumber().equals(
                        pSegmentNumber)) {
                    aBookingSegmentDto = bBookingSegmentDto;
                }
            }
        }
        return aBookingSegmentDto;
    }

    /**
     * Gets the <code>Segments</code> property.
     * <p>
     * 
     * @return the current value of the <code>Segments</code> property.
     */
    public List<BookingSegmentDto> getSegments() {
        return this.segments;
    }

    /**
     * Gets the <code>ShipperRemarks</code> property.
     * <p>
     * 
     * @return the current value of the <code>ShipperRemarks</code> property.
     */
    public String getShipperRemarks() {
        return this.shipperRemarks;
    }

    /**
     * Gets the <code>SplitBookingIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>SplitBookingIndicator</code>
     *         property.
     */
    public String getSplitBookingIndicator() {
        return this.splitBookingIndicator;
    }

    /**
     * Gets the <code>SuppInformation1</code> property.
     * <p>
     * 
     * @return the current value of the <code>SuppInformation1</code> property.
     */
    public String getSuppInformation1() {
        return this.suppInformation1;
    }

    /**
     * Gets the <code>SuppInformation2</code> property.
     * <p>
     * 
     * @return the current value of the <code>SuppInformation2</code> property.
     */
    public String getSuppInformation2() {
        return this.suppInformation2;
    }

    /**
     * Gets the <code>UserContact</code> property.
     * <p>
     * 
     * @return the current value of the <code>UserContact</code> property.
     */
    public String getUserContact() {
        return this.userContact;
    }

    /**
     * Gets the <code>UserEmail</code> property.
     * <p>
     * 
     * @return the current value of the <code>UserEmail</code> property.
     */
    public String getUserEmail() {
        return this.userEmail;
    }

    /**
     * Gets the <code>UserPhone</code> property.
     * <p>
     * 
     * @return the current value of the <code>UserPhone</code> property.
     */
    public String getUserPhone() {
        return this.userPhone;
    }

    /**
     * Gets the <code>volumeUnit</code> property.
     * <p>
     * 
     * @return the current value of the <code>volumeUnit</code> property.
     */
    public VolumeUOMType getVolumeUnit() {
        return this.volumeUnit;
    }

    /**
     * Gets the <code>weightUnit</code> property.
     * <p>
     * 
     * @return the current value of the <code>SuggestedWeightUnit</code>
     *         property.
     */
    public WeightUOMType getWeightUnit() {
        return this.weightUnit;
    }

    /**
     * Gets the <code>WorkOrder</code> property.
     * <p>
     * 
     * @return the current value of the <code>WorkOrder</code> property.
     */
    public WorkOrderDto getWorkOrder() {
        return this.workOrder;
    }

    /**
     * Gets the <code>createDuplicateBookingInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>createDuplicateBookingInd</code>
     *         property.
     */
    public boolean isCreateDuplicateBookingInd() {
        return this.createDuplicateBookingInd;
    }

    /**
     * Gets the <code>invokedFromContextMenu</code> property.
     * <p>
     * 
     * @return the current value of the <code>invokedFromContextMenu</code>
     *         property.
     */
    public boolean isInvokedFromContextMenu() {
        return this.invokedFromContextMenu;
    }

    /**
     * Gets the <code>isOrderCompleted</code> property.
     * <p>
     * 
     * @return the current value of the <code>isOrderCompleted</code> property.
     */
    public boolean isOrderCompleted() {
        return this.orderCompleted;
    }

    /**
     * Gets the <code>VolumeCompensationInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>VolumeCompensationInd</code>
     *         property.
     */
    public boolean isVolumeCompensationInd() {
        return this.volumeCompensationInd;
    }

    public boolean isReplySentBCTL() {
        return replySentBCTL;
    }

    /**
     * Sets the <code>actionType</code> property.
     * <p>
     * 
     * @param pActionType
     *            holds the new value of <code>actionType</code>.<br>
     */
    public void setActionType(final ActionType pActionType) {
        this.actionType = pActionType;
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
        this.arrivalFlight = pArrivalFlight;
    }

    /**
     * @param pArrivalFlightDate
     *            the arrivalFlightDate to set
     */
    public void setArrivalFlightDate(final Date pArrivalFlightDate) {
        this.arrivalFlightDate = ContractUtility
                .getClonedDate(pArrivalFlightDate);
    }

    /**
     * Sets the <code>BookingControlOffice</code> property.
     * <p>
     * 
     * 
     * @param pBookingControlOffice
     *            holds the new value of <code>BookingControlOffice</code>.<br>
     */
    public void setBookingControlOffice(final String pBookingControlOffice) {
        this.bookingControlOffice = pBookingControlOffice;
    }

    /**
     * Sets the <code>BookingControlStation</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3-5 Alphabets<br>
     * <p>
     * <b>Example: </b><br>
     * MSP<br>
     * <p>
     * 
     * 
     * @param pBookingControlStation
     *            holds the new value of <code>BookingControlStation</code>.<br>
     */
    public void setBookingControlStation(final String pBookingControlStation) {
        this.bookingControlStation = pBookingControlStation;
    }

    /**
     * Sets the <code>BookingControlStatus</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets<br>
     * <p>
     * <b>Example: </b><br>
     * AL<br>
     * <p>
     * 
     * @param pBookingControlStatus
     *            holds the new value of <code>BookingControlStatus</code>.<br>
     */
    public void setBookingControlStatus(final String pBookingControlStatus) {
        this.bookingControlStatus = pBookingControlStatus;
    }

    /**
     * Sets the <code>BookingCreationSource</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * H<br>
     * <p>
     * 
     * @param pBookingCreationSource
     *            holds the new value of <code>BookingCreationSource</code>.<br>
     */
    public void setBookingCreationSource(
            final String pBookingCreationSource) {
        this.bookingCreationSource = pBookingCreationSource;
    }

    /**
     * Sets the <code>BookingDateTime</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY<br>
     * <p>
     * <b>Example: </b><br>
     * 26MAY14 12:30<br>
     * <p>
     * 
     * @param pBookingDateTime
     *            holds the new value of <code>BookingDateTime</code>.<br>
     */
    public void setBookingDateTime(final Date pBookingDateTime) {
        this.bookingDateTime = ContractUtility.getClonedDate(pBookingDateTime);
    }

    /**
     * Sets the <code>BookingDeletionDetailDto</code> property.
     * <p>
     * 
     * 
     * @param pBookingDeletionDetailDto
     *            holds the new value of <code>BookingDeletionDetailDto</code>.<br>
     */
    public void setBookingDeletionDetailDto(
            final BookingDeletionDetailDto pBookingDeletionDetailDto) {
        this.bookingDeletionDetailDto = pBookingDeletionDetailDto;
    }

    /**
     * Sets the <code>bookingDetailsSent</code> property.
     * 
     * @param pBookingDetailsSent
     *            the pBookingDetailsSent to set
     */
    public void setBookingDetailsSent(final String pBookingDetailsSent) {
        this.bookingDetailsSent = pBookingDetailsSent;
    }

    /**
     * Sets the <code>BookingReferenceNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen,period including spaces<br>
     * <b>Example: </b><br>
     * 00000022
     * 
     * <br>
     * 
     * @param pBookingReferenceNumber
     *            holds the new value of <code>BookingReferenceNumber</code>.<br>
     */
    public void setBookingReferenceNumber(final String pBookingReferenceNumber) {
        this.bookingReferenceNumber = pBookingReferenceNumber;
    }

    /**
     * Sets the <code>BookingRemarkDto</code> property.
     * <p>
     * 
     * 
     * @param pBookingRemarkDto
     *            holds the new value of <code>BookingRemarkDto</code>.<br>
     */
    public void setBookingRemarkDto(final BookingRemarkDto pBookingRemarkDto) {
        this.bookingRemarkDto = pBookingRemarkDto;
    }

    /**
     * Sets the <code>createDuplicateBookingInd</code> property.
     * <p>
     * 
     * 
     * @param pCreateDuplicateBookingInd
     *            holds the new value of <code>createDuplicateBookingInd</code>.<br>
     */
    public void setCreateDuplicateBookingInd(
            final boolean pCreateDuplicateBookingInd) {
        this.createDuplicateBookingInd = pCreateDuplicateBookingInd;
    }

    /**
     * @param departureFlightDate
     *            the departureFlightDate to set
     */
    public void setDepartureFlightDate(final Date pDepartureFlightDate) {
        this.departureFlightDate = ContractUtility
                .getClonedDate(pDepartureFlightDate);
    }

    /**
     * @param pDestinationTTYAddress
     *            the destinationTTYAddress to set
     */
    public void setDestinationTTYAddress(final String pDestinationTTYAddress) {
        this.destinationTTYAddress = pDestinationTTYAddress;
    }

    /**
     * Sets the <code>EmailAddress</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-50 characters(includes all types of characters) <br>
     * <b>Example: </b><br>
     * john.smith@unisys.com
     * 
     * <br>
     * 
     * @param pEmailAddress
     *            holds the new value of <code>EmailAddress</code>.<br>
     */
    public void setEmailAddress(final String pEmailAddress) {
        this.emailAddress = pEmailAddress;
    }

    /**
     * Sets the <code>FlightControlOfficeQueue</code> property.
     * <p>
     * 
     * @param pFlightControlOfficeQueue
     *            holds the new value of <code>FlightControlOfficeQueue</code>.<br>
     */
    public void setFlightControlOfficeQueue(
            final String pFlightControlOfficeQueue) {
        this.flightControlOfficeQueue = pFlightControlOfficeQueue;
    }

    public void setFctlReasonCode(final String pFctlReasonCode) {
        this.fctlReasonCode = pFctlReasonCode;
    }

    /**
     * Sets the <code>invokedFromContextMenu</code> property.
     * <p>
     * 
     * @param pInvokedFromContextMenu
     *            holds the new value of <code>invokedFromContextMenu</code>.<br>
     */
    public void setInvokedFromContextMenu(final boolean pInvokedFromContextMenu) {
        this.invokedFromContextMenu = pInvokedFromContextMenu;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * 
     * @param pOId
     *            holds the new value of <code>OId</code>.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>pIsOrderCompleted</code>.
     * <p>
     * 
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pIsOrderCompleted</code>
     */
    public void setOrderCompleted(final boolean pIsOrderCompleted) {
        this.orderCompleted = pIsOrderCompleted;
    }

    /**
     * Sets the <code>reasonCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphanumeric <br>
     * <b>Example: </b><br>
     * AN
     * 
     * <br>
     * 
     * 
     * @param pReasonCode
     *            holds the new value of <code>reasonCode</code>.<br>
     */
    public void setReasonCode(final String pReasonCode) {
        this.reasonCode = pReasonCode;
    }

    /**
     * Sets the <code>RebookReasonCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphanumeric <br>
     * <b>Example: </b><br>
     * AN
     * 
     * <br>
     * 
     * 
     * @param pRebookReasonCode
     *            holds the new value of <code>RebookReasonCode</code>.<br>
     */
    public void setRebookReasonCode(final String pRebookReasonCode) {
        this.rebookReasonCode = ContractUtility
                .convertToUpperCase(pRebookReasonCode);
    }

    public void setReplySentBCTL(final boolean pReplySentBCTL) {
        this.replySentBCTL = pReplySentBCTL;
    }

    /**
     * Sets the <code>Segments</code> property.
     * <p>
     * 
     * @param pSegments
     *            holds the new value of <code>Segments</code>.<br>
     */
    public void setSegments(final List<BookingSegmentDto> pSegments) {
        this.segments = pSegments;
    }

    /**
     * Sets the <code>ShipperRemarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-75 characters(includes all types of characters)<br>
     * <p>
     * <b>Example: </b><br>
     * SHP:FX/00914412345678<br>
     * <p>
     * 
     * @param pShipperRemarks
     *            holds the new value of <code>ShipperRemarks</code>.<br>
     */
    public void setShipperRemarks(final String pShipperRemarks) {
        this.shipperRemarks = pShipperRemarks;
    }

    /**
     * Sets the <code>SplitBookingIndicator</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>N</code><br>
     * No Split.<br>
     * <li><code>Y</code> <br>
     * Manual Split.<br>
     * <p>
     * 
     * 
     * 
     * @param pSplitBookingIndicator
     *            holds the new value of <code>SplitBookingIndicator</code>.<br>
     */
    public void setSplitBookingIndicator(
            final String pSplitBookingIndicator) {
        this.splitBookingIndicator = pSplitBookingIndicator;
    }

    /**
     * Sets the <code>SuppInformation1</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-12 characters<br>
     * <p>
     * <b>Example: </b><br>
     * QNZ01JUN0800<br>
     * <p>
     * 
     * @param pSuppInformation1
     *            holds the new value of <code>SuppInformation1</code>.<br>
     */
    public void setSuppInformation1(final String pSuppInformation1) {
        this.suppInformation1 = pSuppInformation1;
    }

    /**
     * Sets the <code>SuppInformation2</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-12 characters<br>
     * <p>
     * <b>Example: </b><br>
     * QNZ01JUN0800<br>
     * <p>
     * 
     * @param pSuppInformation2
     *            holds the new value of <code>SuppInformation2</code>.<br>
     */
    public void setSuppInformation2(final String pSuppInformation2) {
        this.suppInformation2 = pSuppInformation2;
    }

    /**
     * Sets the <code>UserContact</code> property.
     * <p>
     * 
     * @param pUserContact
     *            holds the new value of <code>UserContact</code>.<br>
     */
    public void setUserContact(final String pUserContact) {
        this.userContact = pUserContact;
    }

    /**
     * Sets the <code>UserEmail</code> property.
     * <p>
     * 
     * @param pUserEmail
     *            holds the new value of <code>UserEmail</code>.<br>
     */
    public void setUserEmail(final String pUserEmail) {
        this.userEmail = pUserEmail;
    }

    /**
     * Sets the <code>UserPhone</code> property.
     * <p>
     * 
     * @param pUserPhone
     *            holds the new value of <code>UserPhone</code>.<br>
     */
    public void setUserPhone(final String pUserPhone) {
        this.userPhone = pUserPhone;
    }

    /**
     * Sets the <code>VolumeCompensationInd</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>yes:</code><br>
     * If the VolumeCompensationInd is selected.<br>
     * <li><code>no:</code> <br>
     * If the VolumeCompensationInd is not selected.<br>
     * <p>
     * 
     * @param pVolumeCompensationInd
     *            holds the new value of <code>VolumeCompensationInd</code>.<br>
     */
    public void setVolumeCompensationInd(final boolean pVolumeCompensationInd) {
        this.volumeCompensationInd = pVolumeCompensationInd;
    }

    /**
     * Sets the <code>volumeUnit</code> property.
     * <p>
     * 
     * @param pVolumeUnit
     *            holds the new value of <code>volumeUnit</code>.<br>
     */
    public void setVolumeUnit(final VolumeUOMType pVolumeUnit) {
        this.volumeUnit = pVolumeUnit;
    }

    /**
     * Sets the <code>weightUnit</code> property.
     * <p>
     * 
     * @param pWeightUnit
     *            holds the new value of <code>weightUnit</code>.<br>
     */
    public void setWeightUnit(final WeightUOMType pWeightUnit) {
        this.weightUnit = pWeightUnit;
    }

    /**
     * Sets the <code>WorkOrder</code> property.
     * <p>
     * 
     * 
     * @param pWorkOrder
     *            holds the new value of <code>WorkOrder</code>.<br>
     */
    public void setWorkOrder(final WorkOrderDto pWorkOrder) {
        this.workOrder = pWorkOrder;
    }

    public void setBookedWeight(BigDecimal pBookedWeight) {
        this.bookedWeight = pBookedWeight;
    }

    public void setBookedVolume(BigDecimal pBookedVolume) {
        this.bookedVolume = pBookedVolume;
    }

    /* SK204 starts */
    /**
     * Method to get the update Pricing value
     * 
     * @return updatePricing
     */
    public boolean isUpdatePricing() {
        return updatePricing;
    }

    /**
     * Method to set the update Pricing value
     */
    public void setUpdatePricing(boolean updatePricing) {
        this.updatePricing = updatePricing;
    }

    /**
     * Method to get plannedAllotmentId
     * 
     * @return plannedAllotmentId
     */
    public String getPlannedAllotmentId() {
        return plannedAllotmentId;
    }

    /**
     * Method to set the plannedAllotmentId
     */
    public void setPlannedAllotmentId(String plannedAllotmentId) {
        this.plannedAllotmentId = plannedAllotmentId;
    }

    /**
     * Method to get whether plannedLocked is locked
     * 
     * @return plannedLocked
     */
    public String getPlannedLocked() {
        return plannedLocked;
    }

    /**
     * Method to set the whether plannedLocked is locked
     */
    public void setPlannedLocked(String plannedLocked) {
        this.plannedLocked = plannedLocked;
    }

    /**
     * Method to get plannedaAllotmentDate
     * 
     * @return plannedaAllotmentDate
     */
    public Date getPlannedAllotmentDate() {
        return plannedAllotmentDate;
    }

    /**
     * Method to set the plannedaAllotmentDate
     */
    public void setPlannedAllotmentDate(Date plannedAllotmentDate) {
        this.plannedAllotmentDate = plannedAllotmentDate;
    }

    public String getRebookReasonDesc() {
        return rebookReasonDesc;
    }

    public void setRebookReasonDesc(String rebookReasonDesc) {
        this.rebookReasonDesc = rebookReasonDesc;
    }
    /* SK204 ends */
    
    
    
    /* RFC SK164H Changes_Start */
    
    /**
     * @return the otherChargeRatesNotExist
     */
    public boolean isOtherChargeRatesNotExist() {
        return otherChargeRatesNotExist;
    }

    /**
     * @param otherChargeRatesNotExist the otherChargeRatesNotExist to set
     */
    public void setOtherChargeRatesNotExist(boolean otherChargeRatesNotExist) {
        this.otherChargeRatesNotExist = otherChargeRatesNotExist;
    }

    /**
     * @return the otherChargeCodeSubcodeValid
     */
    public boolean isOtherChargeCodeSubcodeValid() {
        return otherChargeCodeSubcodeValid;
    }

    /**
     * @param otherChargeCodeSubcodeValid the otherChargeCodeSubcodeValid to set
     */
    public void setOtherChargeCodeSubcodeValid(boolean otherChargeCodeSubcodeValid) {
        this.otherChargeCodeSubcodeValid = otherChargeCodeSubcodeValid;
    }

    /**
     * @return the otherChargeCodeDueCarrier
     */
    public boolean isOtherChargeCodeDueCarrier() {
        return otherChargeCodeDueCarrier;
    }

    /**
     * @param otherChargeCodeDueCarrier the otherChargeCodeDueCarrier to set
     */
    public void setOtherChargeCodeDueCarrier(boolean otherChargeCodeDueCarrier) {
        this.otherChargeCodeDueCarrier = otherChargeCodeDueCarrier;
    }
    
    
    /**
     * @return the bookingFeeWaiveOffCounter
     */
    public Integer getBookingFeeWaiveOffCounter() {
        return bookingFeeWaiveOffCounter;
    }

    /**
     * @param bookingFeeWaiveOffCounter
     *            the bookingFeeWaiveOffCounter to set
     */
    public void setBookingFeeWaiveOffCounter(Integer bookingFeeWaiveOffCounter) {
        this.bookingFeeWaiveOffCounter = bookingFeeWaiveOffCounter;
    }

    /**
     * @return the bookingFeeWaivedOff
     */
    public boolean isBookingFeeWaivedOff() {
        return bookingFeeWaivedOff;
    }

    /**
     * @param bookingFeeWaivedOff
     *            the bookingFeeWaivedOff to set
     */
    public void setBookingFeeWaivedOff(boolean bookingFeeWaivedOff) {
        this.bookingFeeWaivedOff = bookingFeeWaivedOff;
    }

    /**
     * @return the bookingFeeRemark
     */
    public String getBookingFeeRemark() {
        return bookingFeeRemark;
    }

    /**
     * @param bookingFeeRemark
     *            the bookingFeeRemark to set
     */
    public void setBookingFeeRemark(String bookingFeeRemark) {
        this.bookingFeeRemark = bookingFeeRemark;
    }

    /**
     * @return the updateFeeApplied
     */
    public boolean isUpdateFeeApplied() {
        return updateFeeApplied;
    }

    /**
     * @param updateFeeApplied
     *            the updateFeeApplied to set
     */
    public void setUpdateFeeApplied(boolean updateFeeApplied) {
        this.updateFeeApplied = updateFeeApplied;
    }

    /**
     * @return the deleteFeeApplied
     */
    public boolean isDeleteFeeApplied() {
        return deleteFeeApplied;
    }

    /**
     * @param deleteFeeApplied
     *            the deleteFeeApplied to set
     */
    public void setDeleteFeeApplied(boolean deleteFeeApplied) {
        this.deleteFeeApplied = deleteFeeApplied;
    }
    
    /**
     * @return the previousBookingFees
     */
    public List<BookingFeeChargeDto> getPreviousBookingFees() {
        return previousBookingFees;
    }

    /**
     * @param previousBookingFees
     *            the previousBookingFees to set
     */
    public void setPreviousBookingFees(
            List<BookingFeeChargeDto> previousBookingFees) {
        this.previousBookingFees = previousBookingFees;
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
    
    /* RFC SK164H Changes_End */
    // AC416 begins here
    public String getEfsubkdSent() {
        return efsubkdSent;
    }

    public void setEfsubkdSent(String efsubkdSent) {
        this.efsubkdSent = efsubkdSent;
    }
    // AC416 ends here
    
    //FIS137 changes starts
    
     /**
     * Attribute to Hold the List<code>AirWaybillSpecialHandlingCodeDto</code>
    */
    private List<AirWaybillSpecialHandlingCodeDto> airWaybillSpecialHandlingCodes = new ArrayList<AirWaybillSpecialHandlingCodeDto>();
    
    public List<AirWaybillSpecialHandlingCodeDto> getAirWaybillSpecialHandlingCodes() {
        return airWaybillSpecialHandlingCodes;
    }

    public void setAirWaybillSpecialHandlingCodes(List<AirWaybillSpecialHandlingCodeDto> airWaybillSpecialHandlingCodes) {
        this.airWaybillSpecialHandlingCodes = airWaybillSpecialHandlingCodes;
    }
    //FIS137 changes ends

    public String getRemarks1() {
        return remarks1;
    }

    public void setRemarks1(String remarks1) {
        this.remarks1 = remarks1;
    }

    public String getRemarks2() {
        return remarks2;
    }

    public void setRemarks2(String remarks2) {
        this.remarks2 = remarks2;
    }

    public String getRemarks3() {
        return remarks3;
    }

    public void setRemarks3(String remarks3) {
        this.remarks3 = remarks3;
    }

    public String getRemarks4() {
        return remarks4;
    }

    public void setRemarks4(String remarks4) {
        this.remarks4 = remarks4;
    }

    public String getVcbIndicator() {
        return vcbIndicator;
    }

    public void setVcbIndicator(String vcbIndicator) {
        this.vcbIndicator = vcbIndicator;
    }

    public String getDeleteRemarks() {
        return deleteRemarks;
    }

    public void setDeleteRemarks(String deleteRemarks) {
        this.deleteRemarks = deleteRemarks;
    }

    public String getOverallBookingStatus() {
        return overallBookingStatus;
    }

    public void setOverallBookingStatus(String overallBookingStatus) {
        this.overallBookingStatus = overallBookingStatus;
    }

    public FlightInfoDto getArrivalFlight1() {
        return arrivalFlight1;
    }

    public void setArrivalFlight1(FlightInfoDto arrivalFlight1) {
        this.arrivalFlight1 = arrivalFlight1;
    }

    /**
     * @return the suggestedPieces
     */
    public Integer getSuggestedPieces() {
        return suggestedPieces;
    }

    /**
     * @param suggestedPieces the suggestedPieces to set
     */
    public void setSuggestedPieces(Integer suggestedPieces) {
        this.suggestedPieces = suggestedPieces;
    }

    /**
     * @return the suggestedVolume
     */
    public BigDecimal getSuggestedVolume() {

        if (suggestedVolume != null) {
            suggestedVolume = suggestedVolume.setScale(2,
                    BigDecimal.ROUND_HALF_EVEN);
        }
        return suggestedVolume;
    }
    /**
     * @param suggestedVolume the suggestedVolume to set
     */
    public void setSuggestedVolume(BigDecimal suggestedVolume) {
        this.suggestedVolume = suggestedVolume;
    }

    /**
     * @return the suggestedWeight
     */
    public BigDecimal getSuggestedWeight() {
        if (suggestedWeight != null) {
            suggestedWeight = suggestedWeight.setScale(1,
                    BigDecimal.ROUND_HALF_EVEN);
        }
        return suggestedWeight;
    }

    /**
     * @param suggestedWeight the suggestedWeight to set
     */
    public void setSuggestedWeight(BigDecimal suggestedWeight) {
        this.suggestedWeight = suggestedWeight;
    }

    /**
     * @return the suggestedWeightUnit
     */
    public WeightUOMType getSuggestedWeightUnit() {
        return suggestedWeightUnit;
    }

    /**
     * @param suggestedWeightUnit the suggestedWeightUnit to set
     */
    public void setSuggestedWeightUnit(WeightUOMType suggestedWeightUnit) {
        this.suggestedWeightUnit = suggestedWeightUnit;
    }

    /**
     * @return the suggestedVolumeUnit
     */
    public VolumeUOMType getSuggestedVolumeUnit() {
        return suggestedVolumeUnit;
    }

    /**
     * @param suggestedVolumeUnit the suggestedVolumeUnit to set
     */
    public void setSuggestedVolumeUnit(VolumeUOMType suggestedVolumeUnit) {
        this.suggestedVolumeUnit = suggestedVolumeUnit;
    }
    
    private String bookingDBKey;

    /**
     * @return the bookingDBKey
     */   
    public String getBookingDBKey() {
        return bookingDBKey;
    }


    /**
     * @param pBookingDBKey the BookingDBKey to set
     */
    public void setBookingDBKey(final String pBookingDBKey) {
        this.bookingDBKey = pBookingDBKey;
    }
    

}