package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.math.BigDecimal;


import com.unisys.trans.logistics.lms.framework.constants.BookingFlightStatusType;
import com.unisys.trans.logistics.lms.framework.constants.BookingQueueReasonType;
import com.unisys.trans.logistics.lms.framework.constants.BookingStatusType;
import com.unisys.trans.logistics.lms.framework.constants.QueuingRequiredType;
import com.unisys.trans.logistics.lms.framework.dto.constants.BookingSegmentQueueType;
import com.unisys.trans.logistics.lms.framework.dto.constants.DayOfFlightStatusType;
import com.unisys.trans.logistics.lms.framework.dto.constants.FlightBookingRestrictionStatusType;
import com.unisys.trans.logistics.lms.framework.dto.constants.MCTStatusType;

/**
 * <code>OperationalDetailDto</code> is used for retrieve Booking information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>bookingFlightStatus
 * <li>bookingSegmentQueueCode
 * <li>bookingSegmentStatus
 * <li>category
 * <li>dayOfFlightStatus
 * <li>flightControllingOfficeCode
 * <li>flightControllingStationCode
 * <li>flightRestrictionStatus
 * <li>isBookingSpaceAuthority
 * <li>minimumConnectTimeCode
 * <li>newDOFIndicator
 * <li>operationalFeasibilityIndicator
 * <li>queueReasonType
 * <li>spaceAvailabilityStatusInd
 * <li>specialRequestIndicator
 * <li>splCodeRequiresFCTLConfirmationIndicator
 * <li>stationRestrictionIndicator
 * <li>toleranceVolume
 * <li>toleranceWeight
 * </ul>
 */

public class OperationalDetailDto implements Serializable {

    /**
     * unique serial version UID.
     */
    private static final long serialVersionUID = 5799373355408803940L;

    /**
     * Attribute to hold <code>autoConfirmProductInd</code> property.
     */
    private boolean autoConfirmProductInd;

    /**
     * Attribute to holds <code>toleranceVolume</code> property.
     */
    private boolean autoConfirmVolumeInd;

    /**
     * Attribute to holds <code>toleranceWeight</code> property.
     */
    private boolean autoConfirmWeightInd;

    /**
     * Attribute to holds <code>bookingFlightStatus</code> property.
     */
    private BookingFlightStatusType bookingFlightStatus;

    /**
     * Attribute to hold <code>bookingQueueSplInd</code> property.
     */
    private boolean bookingQueueSplInd;

    /**
     * Attribute to holds <code> bookingSegmentQueueCode</code> property.
     */
    private BookingSegmentQueueType bookingSegmentQueueCode;

    /**
     * Attribute to holds <code>bookingSegmentStatus</code> property.
     */
    private BookingStatusType bookingSegmentStatus;

    /**
     * Attribute to holds <code>category</code> property.
     */
    private String category;

    /**
     * Attribute to holds <code> dayOfFlightStatus</code> property.
     */
    private DayOfFlightStatusType dayOfFlightStatus;

    /**
     * Attribute to hold <code>externalBookingQueueInd</code> property.
     */
    private String externalBookingQueueInd;

    /**
     * Attribute to hold <code>externalBookingRejectReasonCd</code> property.
     */
    private String externalBookingRejectReasonCd;

    /**
     * Attribute to holds <code>fBREnforceHurdleRateIndicator</code> property.
     */
    private Boolean fbrEnforceHurdleRateIndicator;

    /**
     * Attribute to hold <code>fbrQueuingRequired</code> property.
     */
    private QueuingRequiredType fbrQueuingRequired;

    /**
     * Attribute to hold <code>fbrQueuingRequiredIndicator</code> property.
     */
    private String fbrQueuingRequiredIndicator;

    /**
     * Attribute to holds <code>ffaBookingFlightStatus</code> property.
     */
    private BookingFlightStatusType ffaBookingFlightStatus;

    /**
     * Attribute to holds <code>flightControllingOfficeCode</code> property.
     */
    private String flightControllingOfficeCode;

    /**
     * Attribute to holds <code>flightControllingStationCode</code> property.
     */
    private String flightControllingStationCode;

    /**
     * Attribute to holds <code>flightRestrictionStatus</code> property.
     */
    private FlightBookingRestrictionStatusType flightRestrictionStatus;

    /**
     * Attribute to holds <code>isBookingSpaceAuthority</code> property.
     */
    private boolean bookingSpaceAuthority;

    /**
     * Attribute to holds <code>loadabilityCheckInd</code> property.
     */
    private boolean loadabilityCheckInd;

    /**
     * Attribute to holds <code>minimumConnectTimeCode</code> property.
     */
    private MCTStatusType minimumConnectTimeCode;

    /**
     * Attribute to holds <code>newDOFIndicator</code> property.
     */
    private boolean newDOFIndicator;

    /**
     * Attribute to holds <code> dayOfFlightStatus</code> property.
     */
    private boolean nonHandledCarrierInd;

    /**
     * Attribute to holds <code>operationalFeasibilityIndicator</code> property.
     */
    private boolean operationalFeasibilityIndicator;

    /**
     * Attribute to holds <code>queueReasonType</code> property.
     */
    private BookingQueueReasonType queueReasonType;

    /**
     * Attribute to holds <code>segmentChangeLevelInd</code> property.
     */
    private String segmentChangeLevelInd;

    /**
     * Attribute to holds <code>spaceAvailabilityStatusInd</code> property.
     */
    private boolean spaceAvailabilityStatusInd;

    /**
     * Attribute to holds <code>specialRequestIndicator</code> property.
     */
    private boolean specialRequestIndicator;

    /**
     * Attribute to holds <code>splCodeRequiresFCTLConfirmationIndicator</code> property.
     */
    private boolean splCodeRequiresFCTLConfirmationIndicator;

    /**
     * Attribute to hold <code>stationRestrictionEnforInd</code> property.
     */
    private String stationRestrictionEnforInd;

    /**
     * Attribute to holds <code>stationRestrictionIndicator</code> property.
     */
    private boolean stationRestrictionIndicator;

    /**
     * Attribute to hold <code>teletypeCarrierCode</code> property.
     */
    private String teletypeCarrierCode;

    /**
     * Attribute to hold <code>toleranceInd</code> property.
     */
    private boolean toleranceInd;

    /**
     * Attribute to holds <code>toleranceVolume</code> property.
     */
    private BigDecimal toleranceVolume;

    /**
     * Attribute to holds <code>toleranceWeight</code> property.
     */
    private BigDecimal toleranceWeight;

    /**
     * Attribute to hold <code>warningQueueInd</code> property.
     */
    private String warningQueueInd;
    //sk208a start
    private boolean smallShipmentBookingApplied;

	/**
	 * Attribute to holds <code>currentSmallShipmentBookingFlag</code> property.
	 * This flag is same as "smallShipmentBookingApplied" Since smallShipmentBookingApplied 
	 * may change during validation of space and other rules, "currentSmallShipmentBookingFlag" 
	 * is used to keep track of original flag.
	 */

    private boolean currentSmallShipmentBookingFlag;
    //sk208a end

    /**
     * Attribute to hold <code>SPLCAOoOnANonCargoOnlyFlight</code> property.
     * <p>
     * SPL CAO on a Non Cargo Only Flight indicator specifies if the booking has a Special Handling Code CAO
     * and the booking flight is not a non cargo only flight.
     */
    private boolean nonCargoOnlyFlightSPLPresentInd;
    
    /**
     * Attribute to hold <code>heaSplApprovalInd</code> property.
     * 
     */
    private boolean heaSplApprovalInd;

    private boolean splConfirmationFBR;
    private boolean toleranceWeightusedInd;
    private boolean toleranceVolumeUsedInd;
    
    public boolean isToleranceWeightusedInd() {
        return toleranceWeightusedInd;
    }

    public void setToleranceWeightusedInd(final boolean toleranceWeightusedInd) {
        this.toleranceWeightusedInd = toleranceWeightusedInd;
    }

    public boolean isToleranceVolumeUsedInd() {
        return toleranceVolumeUsedInd;
    }

    public void setToleranceVolumeUsedInd(final boolean toleranceVolumeUsedInd) {
        this.toleranceVolumeUsedInd = toleranceVolumeUsedInd;
    }

    public boolean isSplConfirmationFBR() {
        return splConfirmationFBR;
    }

    public void setSplConfirmationFBR(boolean splConfirmationFBR) {
        this.splConfirmationFBR = splConfirmationFBR;
    }

    /**
     * Gets the <code>BookingFlightStatus</code> property.
     * <p>
     * 
     * @return the current value of the <code>BookingFlightStatus</code> property.
     */
    public BookingFlightStatusType getBookingFlightStatus() {
        return this.bookingFlightStatus;
    }

    /**
     * Gets the <code>BookingSegmentQueueCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>BookingSegmentQueueCode</code> property.
     */
    public BookingSegmentQueueType getBookingSegmentQueueCode() {
        return this.bookingSegmentQueueCode;
    }

    /**
     * Gets the <code>BookingSegmentStatus</code> property.
     * <p>
     * 
     * @return the current value of the <code>BookingSegmentStatus</code> property.
     */
    public BookingStatusType getBookingSegmentStatus() {
        return this.bookingSegmentStatus;
    }

    /**
     * Gets the <code>category</code> property.
     * <p>
     * 
     * @return the current value of the <code>category</code> property.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Gets the <code>DayOfFlightStatus</code> property.
     * <p>
     * 
     * @return the current value of the <code>DayOfFlightStatus</code> property.
     */
    public DayOfFlightStatusType getDayOfFlightStatus() {
        return this.dayOfFlightStatus;
    }

    /**
     * Gets the <code>externalBookingQueueInd</code> property.
     * 
     * @return the current value of the <code>externalBookingQueueInd</code> property.
     */
    public String getExternalBookingQueueInd() {
        return this.externalBookingQueueInd;
    }

    /**
     * Gets the <code>externalBookingRejectReasonCd</code> property.
     * 
     * @return the current value of the <code>externalBookingRejectReasonCd</code> property.
     */
    public String getExternalBookingRejectReasonCd() {
        return this.externalBookingRejectReasonCd;
    }

    /**
     * Gets the <code>fBREnforceHurdleRateIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>fBREnforceHurdleRateIndicator</code> property.
     */
    public Boolean getFbrEnforceHurdleRateIndicator() {
        return this.fbrEnforceHurdleRateIndicator;
    }

    /**
     * Gets the <code>fbrQueuingRequired</code> property.
     * 
     * @return the current value of the <code>fbrQueuingRequired</code> property.
     */
    public QueuingRequiredType getFbrQueuingRequired() {
        return this.fbrQueuingRequired;
    }

    /**
     * Gets the <code>fbrQueuingRequiredIndicator</code> property.
     * 
     * @return the current value of the <code>fbrQueuingRequiredIndicator</code> property.
     */
    public String getFbrQueuingRequiredIndicator() {
        return this.fbrQueuingRequiredIndicator;
    }

    /**
     * Gets the <code>ffaBookingFlightStatus</code> property.
     * <p>
     * 
     * @return the current value of the <code>ffaBookingFlightStatus</code> property.
     */
    public BookingFlightStatusType getFFABookingFlightStatus() {
        return this.ffaBookingFlightStatus;
    }

    /**
     * Gets the <code>FlightControllingOfficeCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>FlightControllingOfficeCode</code> property.
     */
    public String getFlightControllingOfficeCode() {
        return this.flightControllingOfficeCode;
    }

    /**
     * Gets the <code>FlightControllingStationCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>FlightControllingStationCode</code> property.
     */
    public String getFlightControllingStationCode() {
        return this.flightControllingStationCode;
    }

    /**
     * Gets the <code>FlightRestrictionStatus</code> property.
     * <p>
     * 
     * @return the current value of the <code>FlightRestrictionStatus</code> property.
     */
    public FlightBookingRestrictionStatusType getFlightRestrictionStatus() {
        return this.flightRestrictionStatus;
    }

    /**
     * Gets the <code>MinimumConnectTimeCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>MinimumConnectTimeCode</code> property.
     */
    public MCTStatusType getMinimumConnectTimeCode() {
        return this.minimumConnectTimeCode;
    }

    /**
     * Gets the <code>QueueReasonType</code> property.
     * <p>
     * 
     * @return the current value of the <code>QueueReasonType</code> property.
     */
    public BookingQueueReasonType getQueueReasonType() {
        return this.queueReasonType;
    }

    /**
     * Gets the <code>segmentChangeLevelInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>segmentChangeLevelInd</code> property.
     */
    public String getSegmentChangeLevelInd() {
        return this.segmentChangeLevelInd;
    }

    /**
     * Gets the <code>stationRestrictionEnforInd</code> property.
     * 
     * @return the current value of the <code>stationRestrictionEnforInd</code> property.
     */
    public String getStationRestrictionEnforInd() {
        return this.stationRestrictionEnforInd;
    }

    /**
     * Gets the <code>teletypeCarrierCode</code> property.
     * 
     * @return the current value of the <code>teletypeCarrierCode</code> property.
     */
    public String getTeletypeCarrierCode() {
        return this.teletypeCarrierCode;
    }

    /**
     * Gets the <code>toleranceVolume</code> property.
     * <p>
     * 
     * @return the current value of the <code>toleranceVolume</code> property.
     */
    public BigDecimal getToleranceVolume() {
        return this.toleranceVolume;
    }

    /**
     * Gets the <code>toleranceWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>toleranceWeight</code> property.
     */
    public BigDecimal getToleranceWeight() {
        return this.toleranceWeight;
    }

    /**
     * Gets the <code>warningQueueInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>warningQueueInd</code> property.
     */
    public String getWarningQueueInd() {
        return this.warningQueueInd;
    }

    /**
     * @return the autoConfirmProductInd
     */
    public boolean isAutoConfirmProductInd() {
        return this.autoConfirmProductInd;
    }

    /**
     * Gets the <code>autoConfirmVolumeInd</code> property.
     * 
     * @return the current value of the <code>autoConfirmVolumeInd</code> property.
     */
    public boolean isAutoConfirmVolumeInd() {
        return this.autoConfirmVolumeInd;
    }

    /**
     * Gets the <code>autoConfirmWeightInd</code> property.
     * 
     * @return the current value of the <code>autoConfirmWeightInd</code> property.
     */
    public boolean isAutoConfirmWeightInd() {
        return this.autoConfirmWeightInd;
    }

    /**
     * Gets the <code>bookingQueueSplInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookingQueueSplInd</code> property.
     */
    public boolean isBookingQueueSplInd() {
        return this.bookingQueueSplInd;
    }

    /**
     * Gets the <code>BookingSpaceAuthority</code> property.
     * <p>
     * 
     * @return the current value of the <code>BookingSpaceAuthority</code> property.
     */
    public boolean isBookingSpaceAuthority() {
        return this.bookingSpaceAuthority;
    }

    /**
     * Gets the <code>loadabilityCheckInd</code> property.
     * 
     * @return the current value of the <code>loadabilityCheckInd</code> property.
     */
    public boolean isLoadabilityCheckInd() {
        return this.loadabilityCheckInd;
    }

    /**
     * Gets the <code>NewDOFIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>NewDOFIndicator</code> property.
     */
    public boolean isNewDOFIndicator() {
        return this.newDOFIndicator;
    }

    /**
     * @return the nonHandledCarrierInd
     */
    public boolean isNonHandledCarrierInd() {
        return this.nonHandledCarrierInd;
    }

    /**
     * Gets the <code>OperationalFeasibilityIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>OperationalFeasibilityIndicator</code> property.
     */
    public boolean isOperationalFeasibilityIndicator() {
        return this.operationalFeasibilityIndicator;
    }

    /**
     * Gets the <code>SpaceAvailabilityStatusInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>SpaceAvailabilityStatusInd</code> property.
     */
    public boolean isSpaceAvailabilityStatusInd() {
        return this.spaceAvailabilityStatusInd;
    }

    /**
     * Gets the <code>SpecialRequestIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>SpecialRequestIndicator</code> property.
     */
    public boolean isSpecialRequestIndicator() {
        return this.specialRequestIndicator;
    }

    /**
     * Gets the <code>SplCodeRequiresFCTLConfirmationIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>SplCodeRequiresFCTLConfirmationIndicator</code> property.
     */
    public boolean isSplCodeRequiresFCTLConfirmationIndicator() {
        return this.splCodeRequiresFCTLConfirmationIndicator;
    }

    /**
     * Gets the <code>StationRestrictionIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>StationRestrictionIndicator</code> property.
     */
    public boolean isStationRestrictionIndicator() {
        return this.stationRestrictionIndicator;
    }

    /**
     * Gets the <code>toleranceInd</code> property.
     * 
     * @return the current value of the <code>toleranceInd</code> property.
     */
    public boolean isToleranceInd() {
        return this.toleranceInd;
    }

    /**
     * @param autoConfirmProductInd the autoConfirmProductInd to set
     */
    public void setAutoConfirmProductInd(final boolean pAutoConfirmProductInd) {
        this.autoConfirmProductInd = pAutoConfirmProductInd;
    }

    /**
     * Sets the <code>autoConfirmVolumeInd</code> property.
     * <p>
     * 
     * @param pAutoConfirmVolumeInd
     *            holds the new value of <code>autoConfirmVolumeInd</code>.<br>
     */
    public void setAutoConfirmVolumeInd(final boolean pAutoConfirmVolumeInd) {
        this.autoConfirmVolumeInd = pAutoConfirmVolumeInd;
    }

    /**
     * Sets the <code>autoConfirmWeightInd</code> property.
     * <p>
     * 
     * @param pAutoConfirmWeightInd
     *            holds the new value of <code>autoConfirmWeightInd</code>.<br>
     */
    public void setAutoConfirmWeightInd(final boolean pAutoConfirmWeightInd) {
        this.autoConfirmWeightInd = pAutoConfirmWeightInd;
    }

    /**
     * Sets the <code>BookingFlightStatus</code> property.
     * <p>
     * 
     * @param pBookingFlightStatus
     *            holds the new value of <code>BookingFlightStatus</code>.<br>
     */
    public void setBookingFlightStatus(
                final BookingFlightStatusType pBookingFlightStatus) {
        this.bookingFlightStatus = pBookingFlightStatus;
    }

    /**
     * Sets the <code>BookingQueueSplInd</code> property.
     * <p>
     * 
     * @param pBookingQueueSplInd
     *            holds the new value of <code>BookingQueueSplInd</code>.<br>
     */
    public void setBookingQueueSplInd(final boolean pBookingQueueSplInd) {
        this.bookingQueueSplInd = pBookingQueueSplInd;
    }

    /**
     * Sets the <code>BookingSegmentQueueCode</code> property.
     * <p>
     * 
     * @param pBookingSegmentQueueCode
     *            holds the new value of <code>BookingSegmentQueueCode</code>.<br>
     */
    public void setBookingSegmentQueueCode(
                final BookingSegmentQueueType pBookingSegmentQueueCode) {
        this.bookingSegmentQueueCode = pBookingSegmentQueueCode;
    }

    /**
     * Sets the <code>BookingSegmentStatus</code> property.
     * <p>
     * 
     * @param pBookingSegmentStatus
     *            holds the new value of <code>BookingSegmentStatus</code>.<br>
     */
    public void setBookingSegmentStatus(
                final BookingStatusType pBookingSegmentStatus) {
        this.bookingSegmentStatus = pBookingSegmentStatus;
    }

    /**
     * @param bookingSpaceAuthority the isBookingSpaceAuthority to set
     */
    public void setBookingSpaceAuthority(final boolean pIsBookingSpaceAuthority) {
        this.bookingSpaceAuthority = pIsBookingSpaceAuthority;
    }

    /**
     * Sets the <code>category</code> property.
     * <p>
     * 
     * @param pCategory
     *            holds the new value of <code>category</code>.<br>
     */
    public void setCategory(final String pCategory) {
        this.category = pCategory;
    }

    /**
     * Sets the <code>AwbOriginIataArea</code> property.
     * <p>
     * 
     * @param pDayOfFlightStatus
     *            holds the new value of <code>DayOfFlightStatus</code>.<br>
     */
    public void setDayOfFlightStatus(
                final DayOfFlightStatusType pDayOfFlightStatus) {
        this.dayOfFlightStatus = pDayOfFlightStatus;
    }

    /**
     * Sets the <code>externalBookingQueueInd</code> property.
     * <p>
     * 
     * @param pExternalBookingQueueInd
     *            holds the new value of <code>externalBookingQueueInd</code>.<br>
     */
    public void setExternalBookingQueueInd(final String pExternalBookingQueueInd) {
        this.externalBookingQueueInd = pExternalBookingQueueInd;
    }

    /**
     * Sets the <code>externalBookingRejectReasonCd</code> property.
     * <p>
     * 
     * @param pExternalBookingRejectReasonCd
     *            holds the new value of <code>externalBookingRejectReasonCd</code>.<br>
     */
    public void setExternalBookingRejectReasonCd(
                final String pExternalBookingRejectReasonCd) {
        this.externalBookingRejectReasonCd = pExternalBookingRejectReasonCd;
    }

    /**
     * Sets the <code>fBREnforceHurdleRateIndicator</code> property.
     * <p>
     * 
     * @param pFBREnforceHurdleRateIndicator
     *            holds the new value of <code>fBREnforceHurdleRateIndicator</code>.<br>
     */
    public void setFbrEnforceHurdleRateIndicator(final Boolean pFBREnforceHurdleRateIndicator) {
        this.fbrEnforceHurdleRateIndicator = pFBREnforceHurdleRateIndicator;
    }

    /**
     * Sets the <code>fbrQueuingRequired</code> property.
     * <p>
     * 
     * @param pFbrQueuingRequired
     *            holds the new value of <code>fbrQueuingRequired</code>.<br>
     */
    public void setFbrQueuingRequired(final QueuingRequiredType pFbrQueuingRequired) {
        this.fbrQueuingRequired = pFbrQueuingRequired;
    }

    /**
     * Sets the <code>fbrQueuingRequiredIndicator</code> property.
     * <p>
     * 
     * @param pFbrQueuingRequiredIndicator
     *            holds the new value of <code>fbrQueuingRequiredIndicator</code>.<br>
     */
    public void setFbrQueuingRequiredIndicator(final String pFbrQueuingRequiredIndicator) {
        this.fbrQueuingRequiredIndicator = pFbrQueuingRequiredIndicator;
    }

    /**
     * Sets the <code>ffaBookingFlightStatus</code> property.
     * <p>
     * 
     * @param pFFABookingFlightStatus
     *            holds the new value of <code>ffaBookingFlightStatus</code>.<br>
     */
    public void setFFABookingFlightStatus(
                final BookingFlightStatusType pFFABookingFlightStatus) {
        this.ffaBookingFlightStatus = pFFABookingFlightStatus;
    }

    /**
     * Sets the <code>FlightControllingOfficeCode</code> property.
     * <p>
     * 
     * @param pFlightControllingOfficeCode
     *            holds the new value of <code>FlightControllingOfficeCode</code>.<br>
     */
    public void setFlightControllingOfficeCode(
                final String pFlightControllingOfficeCode) {
        this.flightControllingOfficeCode = pFlightControllingOfficeCode;
    }

    /**
     * Sets the <code>FlightControllingStationCode</code> property.
     * <p>
     * 
     * @param pFlightControllingStationCode
     *            holds the new value of <code>FlightControllingStationCode</code>.<br>
     */
    public void setFlightControllingStationCode(
                final String pFlightControllingStationCode) {
        this.flightControllingStationCode = pFlightControllingStationCode;
    }

    /**
     * Sets the <code>FlightRestrictionStatus</code> property.
     * <p>
     * 
     * @param pFlightRestrictionStatus
     *            holds the new value of <code>FlightRestrictionStatus</code>.<br>
     */
    public void setFlightRestrictionStatus(
                final FlightBookingRestrictionStatusType pFlightRestrictionStatus) {
        this.flightRestrictionStatus = pFlightRestrictionStatus;
    }

    /**
     * Sets the <code>loadabilityCheckInd</code> property.
     * <p>
     * 
     * @param pLoadabilityCheckInd
     *            holds the new value of <code>loadabilityCheckInd</code>.<br>
     */
    public void setLoadabilityCheckInd(final boolean pLoadabilityCheckInd) {
        this.loadabilityCheckInd = pLoadabilityCheckInd;
    }

    /**
     * Sets the <code>MinimumConnectTimeCode</code> property.
     * <p>
     * 
     * @param pMinimumConnectTimeCode
     *            holds the new value of <code>MinimumConnectTimeCode</code>.<br>
     */
    public void setMinimumConnectTimeCode(
                final MCTStatusType pMinimumConnectTimeCode) {
        this.minimumConnectTimeCode = pMinimumConnectTimeCode;
    }

    /**
     * Sets the <code>NewDOFIndicator</code> property.
     * <p>
     * 
     * @param pNewDOFIndicator
     *            holds the new value of <code>NewDOFIndicator</code>.<br>
     */
    public void setNewDOFIndicator(final boolean pNewDOFIndicator) {
        this.newDOFIndicator = pNewDOFIndicator;
    }

    /**
     * @param pNonHandledCarrierInd the nonHandledCarrierInd to set
     */
    public void setNonHandledCarrierInd(final boolean pNonHandledCarrierInd) {
        this.nonHandledCarrierInd = pNonHandledCarrierInd;
    }

    /**
     * Sets the <code>OperationalFeasibilityIndicator</code> property.
     * <p>
     * 
     * @param pOperationalFeasibilityIndicator
     *            holds the new value of <code>OperationalFeasibilityIndicator</code>.<br>
     */
    public void setOperationalFeasibilityIndicator(
                final boolean pOperationalFeasibilityIndicator) {
        this.operationalFeasibilityIndicator = pOperationalFeasibilityIndicator;
    }

    /**
     * Sets the <code>QueueReasonType</code> property.
     * <p>
     * 
     * @param pQueueReasonType
     *            holds the new value of <code>QueueReasonType</code>.<br>
     */
    public void setQueueReasonType(final BookingQueueReasonType pQueueReasonType) {
        this.queueReasonType = pQueueReasonType;
    }

    /**
     * Sets the <code>segmentChangeLevelInd</code> property.
     * <p>
     * 
     * @param pSegmentChangeLevelInd
     *            holds the new value of <code>segmentChangeLevelInd</code>.<br>
     */
    public void setSegmentChangeLevelInd(final String pSegmentChangeLevelInd) {
        this.segmentChangeLevelInd = pSegmentChangeLevelInd;
    }

    /**
     * Sets the <code>SpaceAvailabilityStatusInd</code> property.
     * <p>
     * 
     * @param pSpaceAvailabilityStatusInd
     *            holds the new value of <code>SpaceAvailabilityStatusInd</code>.<br>
     */
    public void setSpaceAvailabilityStatusInd(final boolean pSpaceAvailabilityStatusInd) {
        this.spaceAvailabilityStatusInd = pSpaceAvailabilityStatusInd;
    }

    /**
     * Sets the <code>SpecialRequestIndicator</code> property.
     * <p>
     * 
     * @param pSpecialRequestIndicator
     *            holds the new value of <code>SpecialRequestIndicator</code>.<br>
     */
    public void setSpecialRequestIndicator(final boolean pSpecialRequestIndicator) {
        this.specialRequestIndicator = pSpecialRequestIndicator;
    }

    /**
     * Sets the <code>SplCodeRequiresFCTLConfirmationIndicator</code> property.
     * <p>
     * 
     * @param pSplCodeRequiresFCTLConfirmationIndicator
     *            holds the new value of <code>SplCodeRequiresFCTLConfirmationIndicator</code>.<br>
     */
    public void setSplCodeRequiresFCTLConfirmationIndicator(
                final boolean pSplCodeRequiresFCTLConfirmationIndicator) {
        this.splCodeRequiresFCTLConfirmationIndicator = pSplCodeRequiresFCTLConfirmationIndicator;
    }

    /**
     * Sets the <code>stationRestrictionEnforInd</code> property.
     * <p>
     * 
     * @param pStationRestrictionEnforInd
     *            holds the new value of <code>stationRestrictionEnforInd</code>.<br>
     */
    public void setStationRestrictionEnforInd(final String pStationRestrictionEnforInd) {
        this.stationRestrictionEnforInd = pStationRestrictionEnforInd;
    }

    /**
     * Sets the <code>StationRestrictionIndicator</code> property.
     * <p>
     * 
     * @param pStationRestrictionIndicator
     *            holds the new value of <code>StationRestrictionIndicator</code>.<br>
     */
    public void setStationRestrictionIndicator(final boolean pStationRestrictionIndicator) {
        this.stationRestrictionIndicator = pStationRestrictionIndicator;
    }

    /**
     * Sets the <code>teletypeCarrierCode</code> property.
     * <p>
     * 
     * @param pTeletypeCarrierCode
     *            holds the new value of <code>teletypeCarrierCode</code>.<br>
     */
    public void setTeletypeCarrierCode(final String pTeletypeCarrierCode) {
        this.teletypeCarrierCode = pTeletypeCarrierCode;
    }

    /**
     * Sets the <code>toleranceInd</code> property.
     * <p>
     * 
     * @param pToleranceInd
     *            holds the new value of <code>toleranceInd</code>.<br>
     */
    public void setToleranceInd(final boolean pToleranceInd) {
        this.toleranceInd = pToleranceInd;
    }

    /**
     * Sets the <code>toleranceVolume</code> property.
     * <p>
     * 
     * @param pToleranceVolume
     *            holds the new value of <code>toleranceVolume</code>.<br>
     */
    public void setToleranceVolume(final BigDecimal pToleranceVolume) {
        this.toleranceVolume = pToleranceVolume;
    }

    /**
     * Sets the <code>toleranceWeight</code> property.
     * <p>
     * 
     * @param pToleranceWeight
     *            holds the new value of <code>toleranceWeight</code>.<br>
     */
    public void setToleranceWeight(final BigDecimal pToleranceWeight) {
        this.toleranceWeight = pToleranceWeight;
    }

    /**
     * Sets the <code>warningQueueInd</code> property.
     * <p>
     * 
     * @param pWarningQueueInd
     *            holds the new value of <code>warningQueueInd</code>.<br>
     */
    public void setWarningQueueInd(final String pWarningQueueInd) {
        this.warningQueueInd = pWarningQueueInd;
    }

	//sk208a start
	/**
	 * @return the smallShipmentBookingApplied
	 */
	public boolean isSmallShipmentRuleApplied() {
		return smallShipmentBookingApplied;
	}

	/**
	 * @param smallShipmentBookingApplied the smallShipmentBookingApplied to set
	 */
	public void setSmallShipmentRuleApplied(boolean smallShipmentBookingApplied) {
		this.smallShipmentBookingApplied = smallShipmentBookingApplied;
	}
	

	/**
	 * @return the currentSmallShipmentBookingFlag
	 */
	public boolean isCurrentSmallShipmentBookingFlag() {
		return currentSmallShipmentBookingFlag;
	}
	
	/**
	 * @param currentSmallShipmentBookingFlag the currentSmallShipmentBookingFlag to set
	 */
	public void setCurrentSmallShipmentBookingFlag(boolean currentSmallShipmentBookingFlag) {
		this.currentSmallShipmentBookingFlag = currentSmallShipmentBookingFlag;
	}
	//sk208a end
	

    /**
     * This method compares the old and new values of other charges
     * <p>
     * 
     * @param pObj
     *            holds the object of new other charges dto.
     * @returns true if it does not matches and false if it matches
     * 
     **/

    public boolean matches(final Object pObj) {

        final OperationalDetailDto other = (OperationalDetailDto) pObj;
       
        if (this.bookingFlightStatus == null) {
            if (other.bookingFlightStatus != null) {
                return false;
            }
        }
        else if (!bookingFlightStatus.equals(other.bookingFlightStatus)) {
            return false;
        }

        if (this.bookingSegmentStatus == null) {
            if (other.bookingSegmentStatus != null) {
                return false;
            }
        }
        else if (!bookingSegmentStatus.equals(other.bookingSegmentStatus)) {
            return false;
        }

        return true;
    }

	public boolean isNonCargoOnlyFlightSPLPresentInd() {
		return nonCargoOnlyFlightSPLPresentInd;
	}

	public void setNonCargoOnlyFlightSPLPresentInd(
			boolean nonCargoOnlyFlightSPLPresentInd) {
		this.nonCargoOnlyFlightSPLPresentInd = nonCargoOnlyFlightSPLPresentInd;
	}

	public boolean isHeaSplApprovalInd() {
		return heaSplApprovalInd;
	}

	public void setHeaSplApprovalInd(boolean heaSplApprovalInd) {
		this.heaSplApprovalInd = heaSplApprovalInd;
	}
    
}
