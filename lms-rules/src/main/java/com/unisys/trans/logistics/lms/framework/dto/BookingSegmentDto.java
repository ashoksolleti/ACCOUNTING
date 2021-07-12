package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.BookingFlightStatusType;
import com.unisys.trans.logistics.lms.framework.constants.BookingStatusType;
import com.unisys.trans.logistics.lms.framework.dto.constants.AutomaticRebookingCodeType;
import com.unisys.trans.logistics.lms.framework.dto.operations.GoodsDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>BookingSegmentDto</code> is used for find BookingSegment information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>adviseMessage
 * <li>aircraftType
 * <li>allotmentCategory
 * <li>allotmentDate
 * <li>allotmentIdentifier
 * <li>assignedArrivalFlight
 * <li>automaticRebookingCode
 * <li>awbOriginIataArea
 * <li>awbRoute
 * <li>bookedArrivalFlight
 * <li>bookingFlightStatus
 * <li>bookingOid
 * <li>bookingSegmentNumber
 * <li>bookingSegmentRoute
 * <li>bookingSegmentStatus
 * <li>densityFactor
 * <li>flightControllingStationOffice
 * <li>goods
 * <li>iataContourCode
 * <li>interChangeTtyAddress
 * <li>oId
 * <li>queueReasonType
 * <li>signedStationVolUnit
 * <li>signedStationWeightUnit
 * <li>twStatus
 * <li>xbDateTime
 * 
 * </ul>
 */
public class BookingSegmentDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>advise</code> property.
     */
    private String advise;

    /**
     * Attribute to holds <code>adviseMessage</code> property.
     */
    private boolean advisoryIndicator;

    /**
     * Attribute to hold <code>aircraftRegistration</code> property.
     */

    private String aircraftRegistration;

    /**
     * Attribute to hold <code>aircraftType</code> property.
     */
    private String aircraftType;

    /**
     * Attribute to holds <code>allotmentCategory</code> property.
     */
    private String allotmentCategory;

    /**
     * Attribute to holds <code>allotmentIdentifier</code> property.
     */
    private String allotmentIdentifier;

    /**
     * Attribute to holds <code>arrivalIndicator</code> property.
     */
    private boolean arrivalIndicator;

    /**
     * Attribute to hold the arrived capacity
     */
    private CapacityDto arrivedCapacity;

    /**
     * Attribute to hold the <code>arrivedPieces</code> property.
     */
    private Integer arrivedPieces;
    /**
     * Attribute to hold the <code>arrivedPieces</code> property.
     */
    private Integer assignedPieces;

    /**
     * Attribute to holds <code>assignedArrivalFlight</code> property.
     */
    private FlightInfoDto assignedArrivalFlight;

    /**
     * Attribute to hold <code>assignedCapacity</code> property.
     */
    private CapacityDto assignedCapacity;

    /**
     * Attribute to holds <code>assignedIndicator</code> property.
     */
    private boolean assignedIndicator;

    /**
     * Attribute to holds <code>automaticRebookingCode</code> property.
     */
    private AutomaticRebookingCodeType automaticRebookingCode;

    /**
     * Attribute to holds <code>bookingOid</code> property.
     */
    private Long bookingOid;

    /**
     * Attribute to holds <code>bookingSegmentNumber</code> property.
     */
    private Integer bookingSegmentNumber;

    /**
     * Attribute to holds <code>bookingSegmentRoute</code> property.
     */
    private RoutingSegmentDto bookingSegmentRoute;

    /**
     * Attribute to hold <code>bookingWorkItemDtos</code> property.
     */
    private List<WorkItemDto> bookingWorkItemDtos;

    /**
     * Attribute to holds <code>bookingSegmentStatus</code> property.
     */
    private CapacityDto confirmedCapacity;

    /**
     * Attribute to holds <code>densityFactor</code> property.
     */
    private Integer densityFactor;

    /**
     * Attribute to hold the <code>destination</code> object.
     */
    private String destination;

    /**
     * Attribute to hold the <code>disableFlightStatus</code> property.
     */
    private boolean disableFlightStatus;

    /**
     * Attribute to holds <code>iataContourCode</code> property.
     */
    private String iataContourCode;

    /**
     * Attribute to holds <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to holds <code>operationalDetail</code> property.
     */
    private OperationalDetailDto operationalDetail;

    /**
     * Attribute to hold the <code>origin</code> object.
     */
    private String origin;

    /**
     * Attribute to holds <code>originalConfirmedCapacity</code> property.
     */
    private CapacityDto originalConfirmedCapacity;

    /**
     * Attribute to holds <code>requestedCapacity</code> property.
     */
    private CapacityDto requestedCapacity;

    /**
     * Attribute to holds <code>rowIndex</code> property.
     */
    private String rowIndex;

    /**
     * Attribute to holds <code>segmentBasisWeight</code> property.
     */
    private BigDecimal segmentBasisWeight;

    /**
     * Attribute to holds <code>segmentHurdleAmount</code> property.
     */
    private BigDecimal segmentHurdleAmount;

    /**
     * Attribute to holds <code>segmentHurdleCostAmount</code> property.
     */
    private BigDecimal segmentHurdleCostAmount;

    private BigDecimal segmentHurdleExportCost;

    private BigDecimal segmentHurdleFuelCost;

    private BigDecimal segmentHurdleImportCost;

    private BigDecimal segmentHurdleRate;

    /**
     * Attribute to holds <code>segmentHurdleRevenueAmount</code> property.
     */
    private BigDecimal segmentHurdleRevenueAmount;

    private BigDecimal segmentHurdleTransitCost;

    private BigDecimal segmentHurdleTruckingCost;

    /**
     * Attribute to holds <code>segmentReferenceDensity</code> property.
     */

    private BigDecimal segmentReferenceDensity;

    /**
     * Attribute to hold the <code>shipmentPieces</code> property.
     */
    private Integer shipmentPieces;

    /**
     * Attribute to holds <code>teletypeAddress</code> property.
     */
    private String teletypeAddress;

    /**
     * Attribute to holds <code>updateCategory</code> property.
     */
    private boolean updateCategory;
    
    //TR-1009080
    private CapacityDto BAACapacity;
    
    /**
     * Attribute to holds <code>departureScheduledDateTime</code> property.
     */
    //TR-1012114
    private Date departureScheduledDateTime;
    
    private String adviseMessage;
    
    private BigDecimal volume;
	 private BigDecimal weight;
    private String queueReasonType;
    
    private Date allotmentDate;
    private Integer lowerDeckContainer;
	 
	 private Integer tallUpperDeckPosition;

	 private Integer upperDeckPosition;
	 
	 private Integer lowerDeckPosition;
    private FlightInfoDto bookedArrivalFlight;
    
    private BookingFlightStatusType bookingFlightStatus;
    
    private BookingStatusType bookingSegmentStatus;
    
    private String flightControllingStationOffice;

    private String interChangeTtyAddress;
    
	private String twStatus;
    
    private boolean updateSegmentInd;
     private String allotmentName;	
    private Date xbDateTime;
    
    private GoodsDto goods;
    /**
	 * @return the bAACapacity
	 */
	public CapacityDto getBAACapacity() {
		return BAACapacity;
	}

	/**
	 * @param bAACapacity the bAACapacity to set
	 */
	public void setBAACapacity(CapacityDto bAACapacity) {
		BAACapacity = bAACapacity;
	}

	/**
     * Gets the <code>advise</code> property.
     * <p>
     * 
     * @return the current value of the <code>advise</code> property.
     */
    public String getAdvise() {
        return this.advise;
    }

    /**
     * Gets the value of the <code>aircraftRegistration</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>aircraftRegistration</code> property.
     */
    public String getAircraftRegistration() {
        return this.aircraftRegistration;
    }

    /**
     * Gets the <code>aircraftType</code> property.
     * <p>
     * 
     * @return the current value of the <code>aircraftType</code> property.
     */
    public String getAircraftType() {
        return this.aircraftType;
    }

    /**
     * Gets the <code>AllotmentCategory</code> property.
     * <p>
     * 
     * @return the current value of the <code>AllotmentCategory</code> property.
     */
    public String getAllotmentCategory() {
        return this.allotmentCategory;
    }

    /**
     * Gets the <code>AllotmentIdentifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>AllotmentIdentifier</code> property.
     */
    public String getAllotmentIdentifier() {
        return this.allotmentIdentifier;
    }

    /**
     * @return the arrivedCapacity
     */
    public CapacityDto getArrivedCapacity() {
        return this.arrivedCapacity;
    }

    /**
     * Gets the value of the <code>arrivedPieces</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>arrivedPieces</code> property.
     */
    public Integer getArrivedPieces() {
        return this.arrivedPieces;
    }

    /**
     * Gets the <code>AssignedArrivalFlight</code> property.
     * <p>
     * 
     * @return the current value of the <code>AssignedArrivalFlight</code> property.
     */
    public FlightInfoDto getAssignedArrivalFlight() {
        return this.assignedArrivalFlight;
    }

    /**
     * @return the assignedCapacity
     */
    public CapacityDto getAssignedCapacity() {
        return this.assignedCapacity;
    }

    /**
     * Gets the <code>AutomaticRebookingCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>AutomaticRebookingCode</code> property.
     */
    public AutomaticRebookingCodeType getAutomaticRebookingCode() {
        return this.automaticRebookingCode;
    }

    /**
     * Gets the <code>BookingOid</code> property.
     * <p>
     * 
     * @return the current value of the <code>BookingOid</code> property.
     */
    public Long getBookingOid() {
        return this.bookingOid;
    }

    /**
     * Gets the <code>BookingSegmentNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>BookingSegmentNumber</code> property.
     */
    public Integer getBookingSegmentNumber() {
        return this.bookingSegmentNumber;
    }

    /**
     * Gets the <code>BookingSegmentRoute</code> property.
     * <p>
     * 
     * @return the current value of the <code>BookingSegmentRoute</code> property.
     */
    public RoutingSegmentDto getBookingSegmentRoute() {
        if (this.bookingSegmentRoute == null) {
            this.bookingSegmentRoute = new RoutingSegmentDto();
        }
        return this.bookingSegmentRoute;
    }

    /**
     * Gets the value of the <code>bookingWorkItemDtos</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>bookingWorkItemDtos</code> property.
     */
    public List<WorkItemDto> getBookingWorkItemDtos() {
        return this.bookingWorkItemDtos;
    }

    /**
     * Gets the <code>ConfirmedCapacity</code> property.
     * <p>
     * 
     * @return the current value of the <code>ConfirmedCapacity</code> property.
     */
    public CapacityDto getConfirmedCapacity() {
        return this.confirmedCapacity;
    }

    /**
     * Gets the <code>DensityFactor</code> property.
     * <p>
     * 
     * @return the current value of the <code>DensityFactor</code> property.
     */
    public Integer getDensityFactor() {
        return this.densityFactor;
    }

    /**
     * Gets the value of the <code>destination</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>destination</code> property.
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * Gets the <code>IataContourCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>IataContourCode</code> property.
     */
    public String getIataContourCode() {
        return this.iataContourCode;
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
     * Gets the <code>OperationalDetail</code> property.
     * <p>
     * 
     * @return the current value of the <code>OperationalDetail</code> property.
     */
    public OperationalDetailDto getOperationalDetail() {
        if (this.operationalDetail == null) {
            this.operationalDetail = new OperationalDetailDto();
        }
        return this.operationalDetail;
    }

    /**
     * Gets the value of the <code>origin</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>origin</code> property.
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * Gets the value of the <code>originalConfirmedCapacity</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>originalConfirmedCapacity</code> property.
     */
    public CapacityDto getOriginalConfirmedCapacity() {
        return this.originalConfirmedCapacity;
    }

    /**
     * Gets the <code>requestedCapacity</code> property.
     * <p>
     * 
     * @return the current value of the <code>requestedCapacity</code> property.
     */
    public CapacityDto getRequestedCapacity() {
        if (this.requestedCapacity == null) {
            this.requestedCapacity = new CapacityDto();
        }
        return this.requestedCapacity;
    }

    /**
     * Gets the value of the <code>rowIndex</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>rowIndex</code> property.
     */
    public String getRowIndex() {
        return this.rowIndex;
    }

    /**
     * @return the segmentBasisWeight
     */
    public BigDecimal getSegmentBasisWeight() {
        return this.segmentBasisWeight;
    }

    /**
     * @return the segmentHurdleAmount
     */
    public BigDecimal getSegmentHurdleAmount() {
        return this.segmentHurdleAmount;
    }

    /**
     * @return the segmentHurdleCostAmount
     */
    public BigDecimal getSegmentHurdleCostAmount() {
        return this.segmentHurdleCostAmount;
    }

    public BigDecimal getSegmentHurdleExportCost() {
        return this.segmentHurdleExportCost;
    }

    public BigDecimal getSegmentHurdleFuelCost() {
        return this.segmentHurdleFuelCost;
    }

    public BigDecimal getSegmentHurdleImportCost() {
        return this.segmentHurdleImportCost;
    }

    public BigDecimal getSegmentHurdleRate() {
        return this.segmentHurdleRate;
    }

    /**
     * @return the segmentHurdleRevenueAmount
     */
    public BigDecimal getSegmentHurdleRevenueAmount() {
        return this.segmentHurdleRevenueAmount;
    }

    public BigDecimal getSegmentHurdleTransitCost() {
        return this.segmentHurdleTransitCost;
    }

    public BigDecimal getSegmentHurdleTruckingCost() {
        return this.segmentHurdleTruckingCost;
    }

    /**
     * @return the segmentReferenceDensity
     */
    public BigDecimal getSegmentReferenceDensity() {
        return this.segmentReferenceDensity;
    }

    /**
     * Gets the <code>ShipmentPieces</code> property.
     * <p>
     * 
     * @return the current value of the <code>ShipmentPieces</code> property.
     */
    public Integer getShipmentPieces() {
        return this.shipmentPieces;
    }

    /**
     * Gets the <code>TeletypeAddress</code> property.
     * <p>
     * 
     * @return the current value of the <code>TeletypeAddress</code> property.
     */
    public String getTeletypeAddress() {
        return this.teletypeAddress;
    }

    /**
     * Gets the <code>AdvisoryIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>AdvisoryIndicator</code> property.
     */
    public boolean isAdvisoryIndicator() {
        return this.advisoryIndicator;
    }

    /**
     * Gets the <code>arrivalIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>arrivalIndicator</code> property.
     */
    public boolean isArrivalIndicator() {
        return this.arrivalIndicator;
    }

    /**
     * Gets the <code>assignedIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>assignedIndicator</code> property.
     */
    public boolean isAssignedIndicator() {
        return this.assignedIndicator;
    }

    public boolean isDisableFlightStatus() {
        return this.disableFlightStatus;
    }

    /**
     * @return the updateCategory
     */
    public boolean isUpdateCategory() {
        return this.updateCategory;
    }

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

        final BookingSegmentDto other = (BookingSegmentDto) pObj;

        if (this.origin == null) {
            if (other.origin != null) {
                return false;
            }
        }
        else if (!this.origin.equals(other.origin)) {
            return false;
        }

        if (this.destination == null) {
            if (other.destination != null) {
                return false;
            }
        }
        else if (!this.destination.equals(other.destination)) {
            return false;
        }

        if (this.allotmentIdentifier == null) {
            if (other.allotmentIdentifier != null) {
                return false;
            }
        }
        else if (!this.allotmentIdentifier.equals(other.allotmentIdentifier)) {
            return false;
        }

        if (this.allotmentCategory == null) {
            if (other.allotmentCategory != null) {
                return false;
            }
        }
        else if (!this.allotmentCategory.equals(other.allotmentCategory)) {
            return false;
        }

        if (this.teletypeAddress == null) {
            if (other.teletypeAddress != null) {
                return false;
            }
        }
        else if (!this.teletypeAddress.equals(other.teletypeAddress)) {
            return false;
        }

        if (this.iataContourCode == null) {
            if (other.iataContourCode != null) {
                return false;
            }
        }
        else if (!this.iataContourCode.equals(other.iataContourCode)) {
            return false;
        }

        if (this.shipmentPieces == null && other.shipmentPieces != null) {
            return false;
        }
        else if (this.shipmentPieces != null && other.shipmentPieces == null) {
            return false;
        }
        else if (this.shipmentPieces != null && other.shipmentPieces != null) {
            if (this.shipmentPieces.intValue() != other.shipmentPieces.intValue()) {
                return false;
            }
        }

        if (this.densityFactor == null && other.densityFactor != null) {
            return false;
        }
        else if (this.densityFactor != null && other.densityFactor == null) {
            return false;
        }
        else if (this.densityFactor != null && other.densityFactor != null) {
            if (this.densityFactor.intValue() != other.densityFactor.intValue()) {
                return false;
            }
        }

        return true;
    }

    /**
     * Sets the <code>advise</code> property.
     * <p>
     * 
     * @param pAdvise
     *            the new value of the <code>advise</code> property.
     */
    public void setAdvise(final String pAdvise) {
        this.advise = pAdvise;
    }

    /**
     * Sets the <code>AdviseMessage</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>Y:</code><br>
     * Queue notification message regardless of confirmation status. <br>
     * <li><code>N:</code> <br>
     * Queue notification message only if any of the requested flights are not confirmed (default).<br>
     * <p>
     * 
     * @param pAdvisoryIndicator
     *            the new value of the <code>AdviseMessage</code> property.
     */
    public void setAdvisoryIndicator(final boolean pAdvisoryIndicator) {
        this.advisoryIndicator = pAdvisoryIndicator;
    }

    /**
     * Sets the value of the <code>aircraftRegistration</code> property.
     * <p>
     * 
     * @param <code>pAircraftRegistration</code> Holds the new value of the <code>aircraftRegistration</code>
     *        property.
     */
    public void setAircraftRegistration(final String pAircraftRegistration) {
        this.aircraftRegistration = pAircraftRegistration;
    }

    /**
     * Sets the <code>aircraftType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * 012<br>
     * 
     * @param pAircraftType
     *            the new value of the <code>aircraftType</code> property.
     */
    public void setAircraftType(final String pAircraftType) {
        this.aircraftType = pAircraftType;
    }

    /**
     * Sets the <code>AllotmentCategory</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * A<br>
     * 
     * @param pAllotmentCategory
     *            the new value of the <code>AllotmentCategory</code> property.
     */
    public void setAllotmentCategory(final String pAllotmentCategory) {
        this.allotmentCategory = pAllotmentCategory;
    }

    /**
     * Sets the <code>AllotmentIdentifier</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * ALLOT1<br>
     * 
     * @param pAllotmentIdentifier
     *            the new value of the <code>AllotmentIdentifier</code> property.
     */
    public void setAllotmentIdentifier(final String pAllotmentIdentifier) {
        this.allotmentIdentifier = ContractUtility
                    .convertToUpperCase(pAllotmentIdentifier);
    }

    /**
     * Sets the value of the <code>arrivalIndicator</code> property.
     * <p>
     * 
     * @param <code>pArrivalIndicator</code> Holds the new value of the <code>arrivalIndicator</code>
     *        property.
     */
    public void setArrivalIndicator(final boolean pArrivalIndicator) {
        this.arrivalIndicator = pArrivalIndicator;
    }

    /**
     * @param pArrivedCapacity the arrivedCapacity to set
     */
    public void setArrivedCapacity(final CapacityDto pArrivedCapacity) {
        this.arrivedCapacity = pArrivedCapacity;
    }

    /**
     * Sets the value of the <code>arrivedPieces</code> property.
     * <p>
     * 
     * @param <code>pArrivedPieces</code> Holds the new value of the <code>arrivedPieces</code> property.
     */
    public void setArrivedPieces(final Integer pArrivedPieces) {
        this.arrivedPieces = pArrivedPieces;
    }

    /**
     * Sets the <code>AssignedArrivalFlight</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3-5 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * LH012<br>
     * 
     * @param pAssignedArrivalFlight
     *            the new value of the <code>AssignedArrivalFlight</code> property.
     */

    public void setAssignedArrivalFlight(
                final FlightInfoDto pAssignedArrivalFlight) {
        this.assignedArrivalFlight = pAssignedArrivalFlight;
    }

    /**
     * @param pAssignedCapacity the assignedCapacity to set
     */
    public void setAssignedCapacity(final CapacityDto pAssignedCapacity) {
        this.assignedCapacity = pAssignedCapacity;
    }

    /**
     * Sets the value of the <code>assignedIndicator</code> property.
     * <p>
     * 
     * @param <code>pAssignedIndicator</code> Holds the new value of the <code>assignedIndicator</code>
     *        property.
     */
    public void setAssignedIndicator(final boolean pAssignedIndicator) {
        this.assignedIndicator = pAssignedIndicator;
    }

    /**
     * Sets the <code>AutomaticRebookingCode</code> property.
     * <p>
     * 
     * 
     * @param pAutomaticRebookingCode
     *            the new value of the <code>AutomaticRebookingCode</code> property.
     */
    public void setAutomaticRebookingCode(
                final AutomaticRebookingCodeType pAutomaticRebookingCode) {
        this.automaticRebookingCode = pAutomaticRebookingCode;
    }

    /**
     * Sets the <code>BookingOid</code> property.
     * <p>
     * 
     * @param pBookingOid
     *            holds the new value of <code>BookingOid</code>.<br>
     */
    public void setBookingOid(final Long pBookingOid) {
        this.bookingOid = pBookingOid;
    }

    /**
     * Sets the <code>BookingSegmentNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 1<br>
     * 
     * @param pBookingSegmentNumber
     *            the new value of the <code>BookingSegmentNumber</code> property.
     */
    public void setBookingSegmentNumber(final Integer pBookingSegmentNumber) {
        this.bookingSegmentNumber = pBookingSegmentNumber;
    }

    /**
     * Sets the <code>BookingSegmentRoute</code> property.
     * <p>
     * 
     * @param pBookingSegmentRoute
     *            holds the new value of <code>BookingSegmentRoute</code>.<br>
     */
    public void setBookingSegmentRoute(
                final RoutingSegmentDto pBookingSegmentRoute) {
        this.bookingSegmentRoute = pBookingSegmentRoute;
    }

    /**
     * Sets the value of the <code>bookingWorkItemDtos</code> property.
     * <p>
     * 
     * @param <code>pBookingWorkItemDtos</code> Holds the new value of the <code>bookingWorkItemDtos</code>
     *        property.
     */
    public void setBookingWorkItemDtos(final List<WorkItemDto> pBookingWorkItemDtos) {
        this.bookingWorkItemDtos = pBookingWorkItemDtos;
    }

    /**
     * Sets the <code>ConfirmedCapacity</code> property.
     * <p>
     * 
     * @param pConfirmedCapacity
     *            holds the new value of <code>ConfirmedCapacity</code>.<br>
     */
    public void setConfirmedCapacity(final CapacityDto pConfirmedCapacity) {
        this.confirmedCapacity = pConfirmedCapacity;
    }

    /**
     * Sets the <code>DensityFactor</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 1<br>
     * 
     * @param pDensityFactor
     *            the new value of the <code>DensityFactor</code> property.
     */
    public void setDensityFactor(final Integer pDensityFactor) {
        this.densityFactor = pDensityFactor;
    }

    /**
     * Sets the value of the <code>destination</code> property.
     * <p>
     * 
     * @param <code>pDestination</code> Holds the new value of the <code>destination</code> property.
     */
    public void setDestination(final String pDestination) {
        this.destination = pDestination;
    }

    public void setDisableFlightStatus(final boolean pDisableFlightStatus) {
        this.disableFlightStatus = pDisableFlightStatus;
    }

    /**
     * Sets the <code>IataContourCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3-52 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * A1<br>
     * 
     * @param pIataContourCode
     *            the new value of the <code>IataContourCode</code> property.
     */
    public void setIataContourCode(final String pIataContourCode) {
        this.iataContourCode = ContractUtility
                    .convertToUpperCase(pIataContourCode);
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId
     *            holds the new value of <code>OId</code>.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>OperationalDetail</code> property.
     * <p>
     * 
     * @param pOperationalDetail
     *            holds the new value of <code>OperationalDetail</code>.<br>
     */

    public void setOperationalDetail(
                final OperationalDetailDto pOperationalDetail) {
        this.operationalDetail = pOperationalDetail;
    }

    /**
     * Sets the value of the <code>origin</code> property.
     * <p>
     * 
     * @param <code>pOrigin</code> Holds the new value of the <code>origin</code> property.
     */
    public void setOrigin(final String pOrigin) {
        this.origin = pOrigin;
    }

    /**
     * Sets the value of the <code>originalConfirmedCapacity</code> property.
     * <p>
     * 
     * @param <code>pOriginalConfirmedCapacity</code> Holds the new value of the
     *        <code>originalConfirmedCapacity</code> property.
     */
    public void setOriginalConfirmedCapacity(final CapacityDto pOriginalConfirmedCapacity) {
        this.originalConfirmedCapacity = pOriginalConfirmedCapacity;
    }

    /**
     * Sets the <code>requestedCapacity</code> property.
     * <p>
     * 
     * @param pRequestedCapacity
     *            holds the new value of <code>requestedCapacity</code>.<br>
     */
    public void setRequestedCapacity(final CapacityDto pRequestedCapacity) {
        this.requestedCapacity = pRequestedCapacity;
    }

    /**
     * Sets the value of the <code>rowIndex</code> property.
     * <p>
     * 
     * @param <code>pRowIndex</code> Holds the new value of the <code>rowIndex</code> property.
     */
    public void setRowIndex(final String pRowIndex) {
        this.rowIndex = pRowIndex;
    }

    /**
     * @param pSegmentBasisWeight the segmentBasisWeight to set
     */
    public void setSegmentBasisWeight(final BigDecimal pSegmentBasisWeight) {
        this.segmentBasisWeight = pSegmentBasisWeight;
    }

    /**
     * @param pSegmentHurdleAmount the segmentHurdleAmount to set
     */
    public void setSegmentHurdleAmount(final BigDecimal pSegmentHurdleAmount) {
        this.segmentHurdleAmount = pSegmentHurdleAmount;
    }

    /**
     * @param pSegmentHurdleCostAmount the segmentHurdleCostAmount to set
     */
    public void setSegmentHurdleCostAmount(final BigDecimal pSegmentHurdleCostAmount) {
        this.segmentHurdleCostAmount = pSegmentHurdleCostAmount;
    }

    public void setSegmentHurdleExportCost(final BigDecimal pSegmentHurdleExportCost) {
        this.segmentHurdleExportCost = pSegmentHurdleExportCost;
    }

    public void setSegmentHurdleFuelCost(final BigDecimal pSegmentHurdleFuelCost) {
        this.segmentHurdleFuelCost = pSegmentHurdleFuelCost;
    }

    public void setSegmentHurdleImportCost(final BigDecimal pSegmentHurdleImportCost) {
        this.segmentHurdleImportCost = pSegmentHurdleImportCost;
    }

    public void setSegmentHurdleRate(final BigDecimal pSegmentHurdleRate) {
        this.segmentHurdleRate = pSegmentHurdleRate;
    }

    /**
     * @param pSegmentHurdleRevenueAmount the segmentHurdleRevenueAmount to set
     */
    public void setSegmentHurdleRevenueAmount(final BigDecimal pSegmentHurdleRevenueAmount) {
        this.segmentHurdleRevenueAmount = pSegmentHurdleRevenueAmount;
    }

    public void setSegmentHurdleTransitCost(final BigDecimal pSegmentHurdleTransitCost) {
        this.segmentHurdleTransitCost = pSegmentHurdleTransitCost;
    }

    public void setSegmentHurdleTruckingCost(final BigDecimal pSegmentHurdleTruckingCost) {
        this.segmentHurdleTruckingCost = pSegmentHurdleTruckingCost;
    }

    /**
     * @param pSegmentReferenceDensity the segmentReferenceDensity to set
     */
    public void setSegmentReferenceDensity(final BigDecimal pSegmentReferenceDensity) {
        this.segmentReferenceDensity = pSegmentReferenceDensity;
    }

    /**
     * Sets the <code>ShipmentPieces</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 12<br>
     * <p>
     * 
     * @param pShipmentPieces
     *            the new value of the <code>ShipmentPieces</code> property.
     */
    public void setShipmentPieces(final Integer pShipmentPieces) {
        this.shipmentPieces = pShipmentPieces;
    }

    /**
     * Sets the <code>TeletypeAddress</code> property.
     * 
     * @param pTeletypeAddress
     *            the new value of the <code>TeletypeAddress</code> property.
     */
    public void setTeletypeAddress(final String pTeletypeAddress) {
        this.teletypeAddress = ContractUtility.convertToUpperCase(pTeletypeAddress);
    }

    /**
     * @param updateCategory the updateCategory to set
     */
    public void setUpdateCategory(final boolean pUpdateCategory) {
        this.updateCategory = pUpdateCategory;
    }

	public Integer getAssignedPieces() {
		return assignedPieces;
	}

	public void setAssignedPieces(Integer assignedPieces) {
		this.assignedPieces = assignedPieces;
	}
	
	public Date getDepartureScheduledDateTime() {
		return this.departureScheduledDateTime;
	}

	public void setDepartureScheduledDateTime(Date pDepartureScheduledDateTime) {
		this.departureScheduledDateTime = pDepartureScheduledDateTime;
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
	 * @return the volume
	 */
	public BigDecimal getVolume() {
		return volume;
	}
	public String getAdviseMessage() {
		return adviseMessage;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	/**
	 * @return the weight
	 */
	public BigDecimal getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	public void setAdviseMessage(String adviseMessage) {
		this.adviseMessage = adviseMessage;
	}

	public String getQueueReasonType() {
		return queueReasonType;
	}

	public void setQueueReasonType(String queueReasonType) {
		this.queueReasonType = queueReasonType;
	}

	public Date getAllotmentDate() {
		return allotmentDate;
	}

	public void setAllotmentDate(Date allotmentDate) {
		this.allotmentDate = allotmentDate;
	}

	public FlightInfoDto getBookedArrivalFlight() {
		return bookedArrivalFlight;
	}

	public void setBookedArrivalFlight(FlightInfoDto bookedArrivalFlight) {
		this.bookedArrivalFlight = bookedArrivalFlight;
	}
		/**
	 * @return the lowerDeckContainer
	 */
	public Integer getLowerDeckContainer() {
		return lowerDeckContainer;
	}

	/**
	 * @param lowerDeckContainer the lowerDeckContainer to set
	 */
	public void setLowerDeckContainer(Integer lowerDeckContainer) {
		this.lowerDeckContainer = lowerDeckContainer;
	}

	/**
	 * @return the tallUpperDeckPosition
	 */
	public Integer getTallUpperDeckPosition() {
		return tallUpperDeckPosition;
	}

	/**
	 * @param tallUpperDeckPosition the tallUpperDeckPosition to set
	 */
	public void setTallUpperDeckPosition(Integer tallUpperDeckPosition) {
		this.tallUpperDeckPosition = tallUpperDeckPosition;
	}

	/**
	 * @return the upperDeckPosition
	 */
	public Integer getUpperDeckPosition() {
		return upperDeckPosition;
	}

	/**
	 * @param upperDeckPosition the upperDeckPosition to set
	 */
	public void setUpperDeckPosition(Integer upperDeckPosition) {
		this.upperDeckPosition = upperDeckPosition;
	}

	/**
	 * @return the lowerDeckPosition
	 */
	public Integer getLowerDeckPosition() {
		return lowerDeckPosition;
	}

	/**
	 * @param lowerDeckPosition the lowerDeckPosition to set
	 */
	public void setLowerDeckPosition(Integer lowerDeckPosition) {
		this.lowerDeckPosition = lowerDeckPosition;
	}

	/**
	 * @return the bookingFlightStatus
	 */
	public BookingFlightStatusType getBookingFlightStatus() {
		return bookingFlightStatus;
	}

	/**
	 * @param bookingFlightStatus the bookingFlightStatus to set
	 */
	public void setBookingFlightStatus(BookingFlightStatusType bookingFlightStatus) {
		this.bookingFlightStatus = bookingFlightStatus;
	}

	/**
	 * @return the bookingSegmentStatus
	 */
	public BookingStatusType getBookingSegmentStatus() {
		return bookingSegmentStatus;
	}

	/**
	 * @param bookingSegmentStatus the bookingSegmentStatus to set
	 */
	public void setBookingSegmentStatus(BookingStatusType bookingSegmentStatus) {
		this.bookingSegmentStatus = bookingSegmentStatus;
	}

	public String getFlightControllingStationOffice() {
		return flightControllingStationOffice;
	}

	public void setFlightControllingStationOffice(String flightControllingStationOffice) {
		this.flightControllingStationOffice = flightControllingStationOffice;
	}

	public String getInterChangeTtyAddress() {
		return interChangeTtyAddress;
	}

	public void setInterChangeTtyAddress(String interChangeTtyAddress) {
		this.interChangeTtyAddress = interChangeTtyAddress;
	}

	public String getTwStatus() {
		return twStatus;
	}

	public void setTwStatus(String twStatus) {
		this.twStatus = twStatus;
	}
	
    public boolean isUpdateSegmentInd() {
		return updateSegmentInd;
	}
	/**
	 * @return the allotmentName
	 */
	public String getAllotmentName() {
		return allotmentName;
	}
	/**
	 * @param allotmentName the allotmentName to set
	 */
	public void setAllotmentName(String allotmentName) {
		this.allotmentName = allotmentName;
	}

	public void setUpdateSegmentInd(boolean updateSegmentInd) {
		this.updateSegmentInd = updateSegmentInd;
	}

	public Date getXbDateTime() {
		return xbDateTime;
	}

	public void setXbDateTime(Date xbDateTime) {
		this.xbDateTime = xbDateTime;
	}

	public GoodsDto getGoods() {
		return goods;
	}

	public void setGoods(GoodsDto goods) {
		this.goods = goods;
	}
}
