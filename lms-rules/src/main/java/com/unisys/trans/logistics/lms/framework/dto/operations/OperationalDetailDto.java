/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.DeckPositionType;
import com.unisys.trans.logistics.lms.framework.constants.VolumeUOMType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.ContainerStatusType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.CustomsStatusType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.CustomsSubStatusType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.DiscrepancyType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.DispositionType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.LMSFunctionType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.LocationType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>OperationalDetailDto</code> class represents the OperationalDetail
 * information.
 * 
 */
public class OperationalDetailDto implements Serializable {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 1081431348582931356L;

	/**
	 * Attribute to hold <code>arrivalDate</code> property.
	 */
	private Date arrivalDate;

	/**
	 * Attribute to hold <code>autoCloseIndicator</code> property.
	 */
	private boolean autoCloseIndicator;

	/**
	 * Attribute to hold <code>boardingStation</code> property.
	 */
	private String boardingStation;

	/**
	 * Attribute to hold <code>bookingAndAWBStatus</code> property.
	 */
	private String bookingAndAWBStatus;

	/**
	 * Attribute to hold <code>carrierHoldIndicator</code> property.
	 */
	private boolean carrierHoldIndicator;

	/**
	 * Attribute to hold <code>computedVolume</code> property.
	 */
	private BigDecimal computedVolume;

	/**
	 * Attribute to hold <code>computedVolumeUOM</code> property.
	 */
	private VolumeUOMType computedVolumeUOM;

	/**
	 * Attribute to hold <code>computedWeight</code> property.
	 */
	private BigDecimal computedWeight;

	/**
	 * Attribute to hold <code>computedWeightUOM</code> property.
	 */
	private WeightUOMType computedWeightUOM;

	/**
	 * Attribute to hold <code>goodsChangeStn</code> property.
	 */
	private String containerChangeStn;

	private Date containerChangeTime;

	/**
	 * Attribute to hold <code>containerStatus</code> property.
	 */
	private ContainerStatusType containerStatus;

	/**
	 * Attribute to hold <code>currentStation</code> property.
	 */
	private String currentStation;

	/**
	 * Attribute to hold <code>customsStatusCode</code> property.
	 */
	private CustomsStatusType customsStatusCode;

	private CustomsSubStatusType customSubStatusCode;

	/**
	 * Attribute to hold <code>deckPosition</code> property.
	 */
	private DeckPositionType deckPosition;

	/**
	 * Attribute to hold <code>deckPositionCount</code> property.
	 */
	private Integer deckPositionCount;

	/**
	 * Attribute to hold <code>reasonCode</code> property.
	 */
	private String description;

	/**
	 * Attribute to hold <code>destinationCarrier</code> property.
	 */
	private String destinationCarrier;

	/**
	 * Attribute to hold <code>destinationStation</code> property.
	 */
	private String destinationStation;

	/**
	 * Attribute to hold <code>goesOnFlightIndicator</code> property.
	 */
	private boolean discrepancyIndicator;

	/**
	 * Attribute to hold <code>discrepancyType</code> property.
	 */
	private DiscrepancyType discrepancyType;

	/**
	 * Attribute to hold <code>destinationStation</code> property.If any AWB
	 * destination is differed with container destination then "*" will be
	 * added.
	 */
	private String displayDestinationStation;

	/**
	 * Attribute to hold <code>dispositionCode</code> property.
	 */
	private DispositionType dispositionCode;

	/**
	 * Attribute to hold <code>dropoffDateTime</code> property.
	 */
	private Date dropoffDateTime;

	/**
	 * Attribute to hold <code>flight</code> property.
	 */
	private BaseFlightDto flight;

    /**
     * Attribute to hold <code>oldFlight</code> property.
     */
    private BaseFlightDto oldFlight;

	/**
	 * Attribute to hold <code>flightDate</code> property.
	 */
	private Date flightDate;

    /**
     * Attribute to hold <code>oldFlightDate</code> property.
     */
    private Date oldFlightDate;

    /**
	 * Attribute to hold <code>flightLocalDate</code> property.
	 */
	private Date flightLocalDate;

	/**
	 * Attribute to hold <code>goesOnFlightIndicator</code> property.
	 */
	private String goesOnFlightIndicator;

	/**
	 * Attribute to hold <code>inputPieces</code> property.
	 */
	private Integer inputPieces;

	/**
	 * Attribute to hold <code>inputVolume</code> property.
	 */
	private BigDecimal inputVolume;

	/**
	 * Attribute to hold <code>inputVolumeUOM</code> property.
	 */
	private VolumeUOMType inputVolumeUOM;

	/**
	 * Attribute to hold <code>inputWeight</code> property.
	 */
	private BigDecimal inputWeight;

	/**
	 * Attribute to hold <code>inputWeightUOM</code> property.
	 */
	private WeightUOMType inputWeightUOM;

	/**
	 * Attribute to hold <code>last status</code> property.
	 */
	private String lastStatus;

	/**
	 * Attribute to hold <code>lastUpdateActor</code> property.
	 */
	private String lastUpdateActor;

	/**
	 * Attribute to hold <code>lastUpdateDateTime</code> property.
	 */
	private Date lastUpdateDateTime;

	/**
	 * Attribute to hold <code>lastUpdateDateTimeUTC</code> property.
	 */
	private Date lastUpdateDateTimeUTC;

	/**
	 * Attribute to hold <code>lastUpdateFunction</code> property.
	 */
	private LMSFunctionType lastUpdateFunction;

	/**
	 * Attribute to hold <code>lastUpdateStationCode</code> property.
	 */
	private String lastUpdateStationCode;

	/**
	 * Attribute to hold <code>location</code> property.
	 */
	private String location;

	/**
	 * Attribute to hold <code>locationType</code> property.
	 */
	private LocationType locationType;

	/**
	 * Attribute to hold <code>manifestGroupCode</code> property.
	 */
	private String manifestGroupCode;

	/**
	 * Attribute to hold <code>movementDateTime</code> property.
	 */
	private Date movementDateTime;

	/**
	 * Attribute to hold <code>nextDispositionCode</code> property.
	 */
	private DispositionType nextDispositionCode;

	/**
	 * Attribute to hold <code>nextDispositionCode</code> property.
	 */
	private String nextDispositionContainerCalculated;

	/**
	 * Attribute to hold <code>nextFlight</code> property.
	 */
	private BaseFlightDto nextFlight;

	/**
	 * Attribute to hold <code>nextFlightDate</code> property.
	 */
	private Date nextFlightDate;

	/**
	 * Attribute to hold <code>nextOffload</code> property.
	 */
	private OffloadDto nextOffload;

	/**
	 * Attribute to hold <code>offloads</code> property.
	 */
	private List<OffloadDto> offloads;

	/**
	 * Attribute to hold <code>openIndicator</code> property.
	 */
	private boolean openIndicator;

	/**
	 * Attribute to hold the <code> padType</code> property.
	 */
	private String padType;

	/**
	 * Attribute to hold <code>percentageFull</code> property.
	 */
	private Integer percentageFull;

	/**
	 * Attribute to hold <code>inputPieces</code> property.
	 */
	private Integer PrimaryshipmentPieces;

	/**
	 * Attribute to hold <code>primaryShipmentVolumeUOM</code> property.
	 */
	private VolumeUOMType primaryShipmentVolumeUOM;

	/**
	 * Attribute to hold <code>PrimaryshipmentVolumn</code> property.
	 */
	private BigDecimal PrimaryshipmentVolumn;

	/**
	 * Attribute to hold <code>PrimaryshipmentWeight</code> property.
	 */
	private BigDecimal PrimaryshipmentWeight;

	/**
	 * Attribute to hold <code>primaryShipmentWeightUOM</code> property.
	 */
	private WeightUOMType primaryShipmentWeightUOM;

	/**
	 * Attribute to hold <code>priority</code> property.
	 */
	private Integer priority;

	/**
	 * Attribute to hold <code>productCode</code> property.
	 */
	private String productCode;

	/**
	 * Attribute to hold <code>goesOnFlightIndicator</code> property.
	 */
	private boolean pseudoULDIndicator;

	/**
	 * Attribute to hold <code>reasonCode</code> property.
	 */
	private String reasonCode;

	/**
	 * Attribute to hold <code>remarks</code> property.
	 */
	private String remarks;

	/**
	 * Attribute to hold <code>scheduleChangeIndicator</code> property.
	 */
	private boolean scheduleChangeIndicator;

	private Integer shipmentPieces = Integer.valueOf(0);

	/**
	 * Attribute to hold <code>containerSplCodes</code> property.
	 */
	private String splCodes;

	/**
	 * Attribute to hold <code>statusChangeCode</code> property.
	 */
	private String statusChangeCode;

	/**
	 * Attribute to hold <code>statusChangeDateTime</code> property.
	 */
	private Date statusChangeDateTime;

	/**
	 * Attribute to hold <code>statusChangeDateTimeUTC</code> property.
	 */
	private Date statusChangeDateTimeUTC;

	private Date userEnteredLocalTime;

	private Date userEnteredUTCTime;

	/**
	 * Attribute to hold <code>verifiedInputWeightIndicator</code> property.
	 */
	private boolean verifiedInputWeightIndicator;

	/**
	 * Gets the <code>ArrivalDate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>ArrivalDate</code> property.<br>
	 */
	public Date getArrivalDate() {
		if (this.arrivalDate != null) {
			return (Date) this.arrivalDate.clone();
		} else {
			return null;
		}
	}

	/**
	 * Gets the <code>boardingStation</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>boardingStation</code> property.<br>
	 */
	public String getBoardingStation() {
		return boardingStation;
	}

	/**
	 * Gets the <code>bookingAndAWBStatus</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>bookingAndAWBStatus</code>
	 *         property.<br>
	 */
	public String getBookingAndAWBStatus() {
		return bookingAndAWBStatus;
	}

	/**
	 * Gets the <code>ComputedVolume</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>ComputedVolume</code> property.<br>
	 */
	public BigDecimal getComputedVolume() {
		return this.computedVolume;
	}

	/**
	 * Gets the <code>ComputedVolumeUOM</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>ComputedVolumeUOM</code> property.<br>
	 */
	public VolumeUOMType getComputedVolumeUOM() {
		return this.computedVolumeUOM;
	}

	/**
	 * Gets the <code>ComputedWeight</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>ComputedWeight</code> property.<br>
	 */
	public BigDecimal getComputedWeight() {
		return this.computedWeight;
	}

	/**
	 * Gets the <code>ComputedWeightUOM</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>ComputedWeightUOM</code> property.<br>
	 */
	public WeightUOMType getComputedWeightUOM() {
		return this.computedWeightUOM;
	}

	/**
	 * @return the containerChangeStn
	 */
	public String getContainerChangeStn() {
		return this.containerChangeStn;
	}

	/**
	 * @return the containerChangeTime
	 */
	public Date getContainerChangeTime() {
		if (this.containerChangeTime != null) {
			return (Date) this.containerChangeTime.clone();
		} else {
			return null;
		}
	}

	/**
	 * Gets the <code>ContainerStatus</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>ContainerStatus</code> property.<br>
	 */
	public ContainerStatusType getContainerStatus() {
		return this.containerStatus;
	}

	/**
	 * Gets the <code>CurrentStation</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>CurrentStation</code> property.<br>
	 */
	public String getCurrentStation() {
		return this.currentStation;
	}

	/**
	 * Gets the <code>CustomsStatusCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>CustomsStatusCode</code> property.<br>
	 */
	public CustomsStatusType getCustomsStatusCode() {
		return this.customsStatusCode;
	}

	/**
	 * Gets the <code>customSubStatusCode</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * CustomsSubStatusType
	 * <p>
	 * 
	 * @return the current value of the <code>customSubStatusCode</code>
	 *         property.
	 */
	public CustomsSubStatusType getCustomSubStatusCode() {
		return customSubStatusCode;
	}

	/**
	 * Gets the <code>DeckPosition</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>DeckPosition</code> property.<br>
	 */
	public DeckPositionType getDeckPosition() {
		return this.deckPosition;
	}

	public Integer getDeckPositionCount() {
		return deckPositionCount;
	}

	/**
	 * Gets the <code>description</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>description</code> property.<br>
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Gets the <code>DestinationCarrier</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>DestinationCarrier</code>
	 *         property.<br>
	 */
	public String getDestinationCarrier() {
		return this.destinationCarrier;
	}

	/**
	 * Gets the <code>DestinationStation</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>DestinationStation</code>
	 *         property.<br>
	 */
	public String getDestinationStation() {
		return this.destinationStation;
	}

	/**
	 * Gets the value of the <code>discrepancyType</code> property.
	 * <p>
	 * 
	 * @return Returns the current value of <code>discrepancyType</code>
	 *         property.
	 */
	public DiscrepancyType getDiscrepancyType() {
		return discrepancyType;
	}

	public String getDisplayDestinationStation() {
		return displayDestinationStation;
	}

	/**
	 * Gets the <code>DispositionCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>DispositionCode</code> property.<br>
	 */
	public DispositionType getDispositionCode() {
		return this.dispositionCode;
	}

	/**
	 * Gets the <code>DropoffDateTime</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>DropoffDateTime</code> property.<br>
	 */
	public Date getDropoffDateTime() {
		if (this.dropoffDateTime != null) {
			return (Date) this.dropoffDateTime.clone();
		} else {
			return null;
		}
	}

	/**
	 * Gets the <code>Flight</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>Flight</code> property.<br>
	 */
	public BaseFlightDto getFlight() {
		if (this.flight == null) {
			this.flight = new BaseFlightDto();
		}
		return this.flight;
	}

	/**
	 * Gets the <code>FlightDate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>FlightDate</code> property.<br>
	 */
	public Date getFlightDate() {
		if (this.flightDate != null) {
			return (Date) this.flightDate.clone();
		} else {
			return null;
		}
	}

	/**
	 * Gets the <code>flightLocalDate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>flightLocalDate</code> property.<br>
	 */
	public Date getFlightLocalDate() {
		if (this.flightLocalDate != null) {
			return (Date) this.flightLocalDate.clone();
		} else {
			return null;
		}
	}

	/**
	 * Gets the <code>GoesOnFlightIndicator</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>GoesOnFlightIndicator</code>
	 *         property.<br>
	 */
	public String getGoesOnFlightIndicator() {
		return this.goesOnFlightIndicator;
	}

	/**
	 * Gets the <code>InputPieces</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>InputPieces</code> property.<br>
	 */
	public Integer getInputPieces() {
		return this.inputPieces;
	}

	/**
	 * Gets the <code>InputVolume</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>InputVolume</code> property.<br>
	 */
	public BigDecimal getInputVolume() {
		return this.inputVolume;
	}

	/**
	 * Gets the <code>InputVolumeUOM</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>InputVolumeUOM</code> property.<br>
	 */
	public VolumeUOMType getInputVolumeUOM() {
		return this.inputVolumeUOM;
	}

	/**
	 * Gets the <code>InputWeight</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>InputWeight</code> property.<br>
	 */
	public BigDecimal getInputWeight() {
		return this.inputWeight;
	}

	/**
	 * Gets the <code>InputWeightUOM</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>InputWeightUOM</code> property.<br>
	 */
	public WeightUOMType getInputWeightUOM() {
		return this.inputWeightUOM;
	}

	/**
	 * Gets the <code>last status</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>last status</code> property.<br>
	 */
	public String getLastStatus() {
		return lastStatus;
	}

	/**
	 * Gets the <code>LastUpdateActor</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>LastUpdateActor</code> property.<br>
	 */
	public String getLastUpdateActor() {
		return this.lastUpdateActor;
	}

	/**
	 * Gets the <code>LastUpdateDateTime</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>LastUpdateDateTime</code>
	 *         property.<br>
	 */
	public Date getLastUpdateDateTime() {
		if (this.lastUpdateDateTime != null) {
			return (Date) this.lastUpdateDateTime.clone();
		} else {
			return null;
		}
	}

	/**
	 * Gets the <code>LastUpdateDateTimeUTC</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>LastUpdateDateTimeUTC</code>
	 *         property.<br>
	 */
	public Date getLastUpdateDateTimeUTC() {
		if (this.lastUpdateDateTimeUTC != null) {
			return (Date) this.lastUpdateDateTimeUTC.clone();
		} else {
			return null;
		}
	}

	/**
	 * Gets the <code>LastUpdateFunction</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>LastUpdateFunction</code>
	 *         property.<br>
	 */
	public LMSFunctionType getLastUpdateFunction() {
		return this.lastUpdateFunction;
	}

	/**
	 * Gets the <code>LastUpdateStationCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>LastUpdateStationCode</code>
	 *         property.<br>
	 */
	public String getLastUpdateStationCode() {
		return this.lastUpdateStationCode;
	}

	/**
	 * Gets the <code>Location</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>Location</code> property.<br>
	 */
	public String getLocation() {
		return this.location;
	}

	/**
	 * Gets the <code>LocationType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>LocationType</code> property.<br>
	 */
	public LocationType getLocationType() {
		return this.locationType;
	}

	/**
	 * Gets the <code>ManifestGroupCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>ManifestGroupCode</code> property.<br>
	 */
	public String getManifestGroupCode() {
		return this.manifestGroupCode;
	}

	/**
	 * Gets the <code>MovementDateTime</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>MovementDateTime</code> property.<br>
	 */
	public Date getMovementDateTime() {
		if (this.movementDateTime != null) {
			return (Date) this.movementDateTime.clone();
		} else {
			return null;
		}
	}

	public DispositionType getNextDispositionCode() {
		return this.nextDispositionCode;
	}

	/**
	 * @return the nextDispositionContainerCalculated
	 */
	public String getNextDispositionContainerCalculated() {
		return this.nextDispositionContainerCalculated;
	}

	public BaseFlightDto getNextFlight() {
		return this.nextFlight;
	}

	public Date getNextFlightDate() {
		if (this.nextFlightDate != null) {
			return (Date) this.nextFlightDate.clone();
		} else {
			return null;
		}
	}

	public OffloadDto getNextOffload() {
		return nextOffload;
	}

	/**
	 * Gets the <code>offloads</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>offloads</code> property.<br>
	 */
	public List<OffloadDto> getOffloads() {
		if (this.offloads == null) {
			this.offloads = new ArrayList<OffloadDto>();
		}
		return this.offloads;
	}

	/**
	 * Gets the <code>padType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>padType</code> property.<br>
	 */
	public String getPadType() {
		return this.padType;
	}

	/**
	 * Gets the <code>PercentageFull</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>PercentageFull</code> property.<br>
	 */
	public Integer getPercentageFull() {
		return this.percentageFull;
	}

	public Integer getPrimaryshipmentPieces() {
		return this.PrimaryshipmentPieces;
	}

	/**
	 * Gets the <code>PrimaryshipmentPieces</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>PrimaryshipmentPieces</code>
	 *         property.<br>
	 */
	public Integer getPrimaryShipmentPieces() {
		return PrimaryshipmentPieces;
	}

	public VolumeUOMType getPrimaryShipmentVolumeUOM() {
		return this.primaryShipmentVolumeUOM;
	}

	/**
	 * Gets the <code>PrimaryshipmentVolumn</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>PrimaryshipmentVolumn</code>
	 *         property.<br>
	 */
	public BigDecimal getPrimaryshipmentVolumn() {
		return this.PrimaryshipmentVolumn;
	}

	/**
	 * Gets the <code>primaryshipmentWeight</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>primaryshipmentWeight</code>
	 *         property.<br>
	 */
	public BigDecimal getPrimaryshipmentWeight() {
		return this.PrimaryshipmentWeight;
	}

	public WeightUOMType getPrimaryShipmentWeightUOM() {
		return this.primaryShipmentWeightUOM;
	}

	/**
	 * Gets the <code>Priority</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>Priority</code> property.<br>
	 */
	public Integer getPriority() {
		return this.priority;
	}

	/**
	 * Gets the <code>ProductCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>ProductCode</code> property.<br>
	 */
	public String getProductCode() {
		return this.productCode;
	}

	/**
	 * Gets the <code>reasonCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>reasonCode</code> property.<br>
	 */
	public String getReasonCode() {
		return this.reasonCode;
	}

	/**
	 * Gets the <code>Remarks</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>Remarks</code> property.<br>
	 */
	public String getRemarks() {
		return this.remarks;
	}

	/**
	 * Gets the <code>scheduleChangeIndicator</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @return the current value of the <code>scheduleChangeIndicator</code>
	 *         property.
	 */
	public boolean getScheduleChangeIndicator() {
		return scheduleChangeIndicator;
	}

	public Integer getShipmentPieces() {
		return shipmentPieces;
	}

	public String getSplCodes() {
		return splCodes;
	}

	/**
	 * Gets the <code>statusChangeCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>statusChangeCode</code> property.<br>
	 */
	public String getStatusChangeCode() {
		return statusChangeCode;
	}

	/**
	 * Gets the <code>StatusChangeDateTime</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>StatusChangeDateTime</code>
	 *         property.<br>
	 */
	public Date getStatusChangeDateTime() {
		if (this.statusChangeDateTime != null) {
			return (Date) this.statusChangeDateTime.clone();
		} else {
			return null;
		}
	}

	/**
	 * Gets the <code>StatusChangeDateTimeUTC</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>StatusChangeDateTimeUTC</code>
	 *         property.<br>
	 */
	public Date getStatusChangeDateTimeUTC() {
		if (this.statusChangeDateTimeUTC != null) {
			return (Date) this.statusChangeDateTimeUTC.clone();
		} else {
			return null;
		}
	}

	public Date getUserEnteredLocalTime() {
		if (userEnteredLocalTime != null) {
			return (Date) userEnteredLocalTime.clone();
		} else {
			return null;
		}
	}

	public Date getUserEnteredUTCTime() {
		if (userEnteredUTCTime != null) {
			return (Date) userEnteredUTCTime.clone();
		} else {
			return null;
		}
	}

	/**
	 * Gets the <code>AutoCloseIndicator</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>AutoCloseIndicator</code>
	 *         property.<br>
	 */
	public boolean isAutoCloseIndicator() {
		return this.autoCloseIndicator;
	}

	/**
	 * Gets the value of the <code>carrierHoldIndicator</code> property.
	 * <p>
	 * 
	 * @return Returns the current value of <code>carrierHoldIndicator</code>
	 *         property.
	 */
	public boolean isCarrierHoldIndicator() {
		return this.carrierHoldIndicator;
	}

	/**
	 * Gets the <code>discrepancyIndicator</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>discrepancyIndicator</code>
	 *         property.<br>
	 */
	public boolean isDiscrepancyIndicator() {
		return discrepancyIndicator;
	}

	/**
	 * Gets the <code>OpenIndicator</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>OpenIndicator</code> property.<br>
	 */
	public boolean isOpenIndicator() {
		return this.openIndicator;
	}

	/**
	 * Gets the <code>pseudoULDIndicator</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>pseudoULDIndicator</code>
	 *         property.<br>
	 */
	public boolean isPseudoULDIndicator() {
		return pseudoULDIndicator;
	}

	/**
	 * Gets the <code>VerifiedInputWeightIndicator</code> property.
	 * <p>
	 * 
	 * @return the current value of the
	 *         <code>VerifiedInputWeightIndicator</code> property.<br>
	 */
	public boolean isVerifiedInputWeightIndicator() {
		return this.verifiedInputWeightIndicator;
	}

	/**
	 * Sets the <code>ArrivalDate</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>ArrivalDate</code> property.<br>
	 */
	public void setArrivalDate(final Date pArrivalDate) {
		if (pArrivalDate != null) {
			this.arrivalDate = (Date) pArrivalDate.clone();
		} else {
			this.arrivalDate = null;
		}
	}

	/**
	 * Sets the <code>AutoCloseIndicator</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>AutoCloseIndicator</code>
	 *            property.<br>
	 */
	public void setAutoCloseIndicator(final boolean pAutoCloseIndicator) {
		this.autoCloseIndicator = pAutoCloseIndicator;
	}

	/**
	 * Sets the <code>boardingStation</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>boardingStation</code>
	 *            property.<br>
	 */
	public void setBoardingStation(String boardingStation) {
		this.boardingStation = boardingStation;
	}

	/**
	 * Sets the <code>bookingAndAWBStatus</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>bookingAndAWBStatus</code>
	 *            property.<br>
	 */
	public void setBookingAndAWBStatus(String pBookingAndAWBStatus) {
		this.bookingAndAWBStatus = pBookingAndAWBStatus;
	}

	/**
	 * Sets the value of the <code>carrierHoldIndicator</code> property.
	 * <p>
	 * 
	 * @param <code>pCarrierHoldIndicator</code> Holds the new value of the
	 *        <code>carrierHoldIndicator</code> property.
	 */
	public void setCarrierHoldIndicator(final boolean pCarrierHoldIndicator) {
		this.carrierHoldIndicator = pCarrierHoldIndicator;
	}

	/**
	 * Sets the <code>ComputedVolume</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>ComputedVolume</code> property.<br>
	 */
	public void setComputedVolume(final BigDecimal pComputedVolume) {
		this.computedVolume = pComputedVolume;
	}

	/**
	 * Sets the <code>ComputedVolumeUOM</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>ComputedVolumeUOM</code>
	 *            property.<br>
	 */
	public void setComputedVolumeUOM(final VolumeUOMType pComputedVolumeUOM) {
		this.computedVolumeUOM = pComputedVolumeUOM;
	}

	/**
	 * Sets the <code>ComputedWeight</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>ComputedWeight</code> property.<br>
	 */
	public void setComputedWeight(final BigDecimal pComputedWeight) {
		this.computedWeight = pComputedWeight;
	}

	/**
	 * Sets the <code>ComputedWeightUOM</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>ComputedWeightUOM</code>
	 *            property.<br>
	 */
	public void setComputedWeightUOM(final WeightUOMType pComputedWeightUOM) {
		this.computedWeightUOM = pComputedWeightUOM;
	}

	/**
	 * @param containerChangeStn
	 *            the containerChangeStn to set
	 */
	public void setContainerChangeStn(final String pContainerChangeStn) {
		this.containerChangeStn = pContainerChangeStn;
	}

	/**
	 * @param containerChangeTime
	 *            the containerChangeTime to set
	 */
	public void setContainerChangeTime(final Date pContainerChangeTime) {
		if (pContainerChangeTime != null) {
			this.containerChangeTime = (Date) pContainerChangeTime.clone();
		} else {
			this.containerChangeTime = null;
		}
	}

	/**
	 * Sets the <code>ContainerStatus</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>ContainerStatus</code>
	 *            property.<br>
	 */
	public void setContainerStatus(final ContainerStatusType pContainerStatus) {
		this.containerStatus = pContainerStatus;
	}

	/**
	 * Sets the <code>CurrentStation</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>CurrentStation</code> property.<br>
	 */
	public void setCurrentStation(final String pCurrentStation) {
		this.currentStation = pCurrentStation;
	}

	/**
	 * Sets the <code>CustomsStatusCode</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>CustomsStatusCode</code>
	 *            property.<br>
	 */
	public void setCustomsStatusCode(final CustomsStatusType pCustomsStatusCode) {
		this.customsStatusCode = pCustomsStatusCode;
	}

	/**
	 * Sets the <code>customSubStatusCode</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * CustomsSubStatusType
	 * <p>
	 * 
	 * @param customSubStatusCode
	 *            the current value of the <code>customSubStatusCode</code>
	 *            property.
	 */
	public void setCustomSubStatusCode(CustomsSubStatusType customSubStatusCode) {
		this.customSubStatusCode = customSubStatusCode;
	}

	/**
	 * Sets the <code>DeckPosition</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>DeckPosition</code> property.<br>
	 */
	public void setDeckPosition(final DeckPositionType pDeckPosition) {
		this.deckPosition = pDeckPosition;
	}

	public void setDeckPositionCount(Integer deckPositionCount) {
		this.deckPositionCount = deckPositionCount;
	}

	/**
	 * Sets the <code>description</code> property.
	 * <p>
	 * 
	 * @param pDescription
	 *            the current value of the <code>description</code> property.<br>
	 */
	public void setDescription(final String pDescription) {
		this.description = pDescription;
	}

	/**
	 * Sets the <code>DestinationCarrier</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>DestinationCarrier</code>
	 *            property.<br>
	 */
	public void setDestinationCarrier(final String pDestinationCarrier) {
		this.destinationCarrier = pDestinationCarrier;
	}

	/**
	 * Sets the <code>DestinationStation</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>DestinationStation</code>
	 *            property.<br>
	 */
	public void setDestinationStation(final String pDestinationStation) {
		this.destinationStation = pDestinationStation;
	}

	/**
	 * Sets the <code>discrepancyIndicator</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>discrepancyIndicator</code>
	 *            property.<br>
	 */
	public void setDiscrepancyIndicator(final boolean pDiscrepancyIndicator) {
		this.discrepancyIndicator = pDiscrepancyIndicator;
	}

	/**
	 * Sets the value of the <code>discrepancyType</code> property.
	 * <p>
	 * 
	 * @param <code>discrepancyType</code> Holds the new value of the
	 *        <code>discrepancyType</code> property.
	 */
	public void setDiscrepancyType(DiscrepancyType discrepancyType) {
		this.discrepancyType = discrepancyType;
	}

	public void setDisplayDestinationStation(String displayDestinationStation) {
		this.displayDestinationStation = displayDestinationStation;
	}

	/**
	 * Sets the <code>DispositionCode</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>DispositionCode</code>
	 *            property.<br>
	 */
	public void setDispositionCode(final DispositionType pDispositionCode) {
		this.dispositionCode = pDispositionCode;
	}

	/**
	 * Sets the <code>DropoffDateTime</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>DropoffDateTime</code>
	 *            property.<br>
	 */
	public void setDropoffDateTime(final Date pDropoffDateTime) {
		if (pDropoffDateTime != null) {
			this.dropoffDateTime = (Date) pDropoffDateTime.clone();
		} else {
			this.dropoffDateTime = null;
		}
	}

	/**
	 * Sets the <code>Flight</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>Flight</code> property.<br>
	 */
	public void setFlight(final BaseFlightDto pFlight) {
		this.flight = pFlight;
	}

	/**
	 * Sets the <code>FlightDate</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>FlightDate</code> property.<br>
	 */
	public void setFlightDate(final Date pFlightDate) {
		if (pFlightDate != null) {
			this.flightDate = (Date) pFlightDate.clone();
		} else {
			this.flightDate = null;
		}
	}

	/**
	 * Sets the <code>flightLocalDate</code> property.
	 * <p>
	 * 
	 * @param pFlightLocalDate
	 *            the current value of the <code>flightLocalDate</code>
	 *            property.<br>
	 */
	public void setFlightLocalDate(final Date pFlightLocalDate) {
		if (pFlightLocalDate != null) {
			this.flightLocalDate = (Date) pFlightLocalDate.clone();
		} else {
			this.flightLocalDate = null;
		}
	}

	/**
	 * Sets the <code>GoesOnFlightIndicator</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>GoesOnFlightIndicator</code>
	 *            property.<br>
	 */
	public void setGoesOnFlightIndicator(final String pGoesOnFlightIndicator) {
		this.goesOnFlightIndicator = pGoesOnFlightIndicator;
	}

	/**
	 * Sets the <code>InputPieces</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>InputPieces</code> property.<br>
	 */
	public void setInputPieces(final Integer pInputPieces) {
		this.inputPieces = pInputPieces;
	}

	/**
	 * Sets the <code>InputVolume</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>InputVolume</code> property.<br>
	 */
	public void setInputVolume(final BigDecimal pInputVolume) {
		this.inputVolume = pInputVolume;
	}

	/**
	 * Sets the <code>InputVolumeUOM</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>InputVolumeUOM</code> property.<br>
	 */
	public void setInputVolumeUOM(final VolumeUOMType pInputVolumeUOM) {
		this.inputVolumeUOM = pInputVolumeUOM;
	}

	/**
	 * Sets the <code>InputWeight</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>InputWeight</code> property.<br>
	 */
	public void setInputWeight(final BigDecimal pInputWeight) {
		this.inputWeight = pInputWeight;
	}

	/**
	 * Sets the <code>InputWeightUOM</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>InputWeightUOM</code> property.<br>
	 */
	public void setInputWeightUOM(final WeightUOMType pInputWeightUOM) {
		this.inputWeightUOM = pInputWeightUOM;
	}

	/**
	 * Sets the <code>last status</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>last status</code> property.<br>
	 */
	public void setLastStatus(final String pLastStatus) {
		this.lastStatus = pLastStatus;
	}

	/**
	 * Sets the <code>LastUpdateActor</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>LastUpdateActor</code>
	 *            property.<br>
	 */
	public void setLastUpdateActor(final String pLastUpdateActor) {
		this.lastUpdateActor = pLastUpdateActor;
	}

	/**
	 * Sets the <code>LastUpdateDateTime</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>LastUpdateDateTime</code>
	 *            property.<br>
	 */
	public void setLastUpdateDateTime(final Date pLastUpdateDateTime) {
		if (pLastUpdateDateTime != null) {
			this.lastUpdateDateTime = (Date) pLastUpdateDateTime.clone();
		} else {
			this.lastUpdateDateTime = null;
		}
	}

	/**
	 * Sets the <code>LastUpdateDateTimeUTC</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>LastUpdateDateTimeUTC</code>
	 *            property.<br>
	 */
	public void setLastUpdateDateTimeUTC(final Date pLastUpdateDateTimeUTC) {
		if (pLastUpdateDateTimeUTC != null) {
			this.lastUpdateDateTimeUTC = (Date) pLastUpdateDateTimeUTC.clone();
		} else {
			this.lastUpdateDateTimeUTC = null;
		}
	}

	/**
	 * Sets the <code>LastUpdateFunction</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>LastUpdateFunction</code>
	 *            property.<br>
	 */
	public void setLastUpdateFunction(final LMSFunctionType pLastUpdateFunction) {
		this.lastUpdateFunction = pLastUpdateFunction;
	}

	/**
	 * Sets the <code>LastUpdateStationCode</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>LastUpdateStationCode</code>
	 *            property.<br>
	 */
	public void setLastUpdateStationCode(final String pLastUpdateStationCode) {
		this.lastUpdateStationCode = pLastUpdateStationCode;
	}

	/**
	 * Sets the <code>Location</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>Location</code> property.<br>
	 */
	public void setLocation(final String pLocation) {
		this.location = pLocation;
	}

	/**
	 * Sets the <code>LocationType</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>LocationType</code> property.<br>
	 */
	public void setLocationType(final LocationType pLocationType) {
		this.locationType = pLocationType;
	}

	/**
	 * Sets the <code>ManifestGroupCode</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>ManifestGroupCode</code>
	 *            property.<br>
	 */
	public void setManifestGroupCode(final String pManifestGroupCode) {
		this.manifestGroupCode = pManifestGroupCode;
	}

	/**
	 * Sets the <code>MovementDateTime</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>MovementDateTime</code>
	 *            property.<br>
	 */
	public void setMovementDateTime(final Date pMovementDateTime) {
		if (pMovementDateTime != null) {
			this.movementDateTime = (Date) pMovementDateTime.clone();
		} else {
			this.movementDateTime = null;
		}
	}

	public void setNextDispositionCode(
			final DispositionType pNextDispositionCode) {
		this.nextDispositionCode = pNextDispositionCode;
	}

	/**
	 * @param nextDispositionContainerCalculated
	 *            the nextDispositionContainerCalculated to set
	 */
	public void setNextDispositionContainerCalculated(
			String nextDispositionContainerCalculated) {
		this.nextDispositionContainerCalculated = nextDispositionContainerCalculated;
	}

	public void setNextFlight(final BaseFlightDto pNextFlight) {
		this.nextFlight = pNextFlight;
	}

	public void setNextFlightDate(final Date pNextFlightDate) {
		this.nextFlightDate = ContractUtility.getClonedDate(pNextFlightDate);
	}

	public void setNextOffload(final OffloadDto pNextOffload) {
		this.nextOffload = pNextOffload;
	}

	/**
	 * Sets the <code>offloads</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>offoffloadsload</code>
	 *            property.<br>
	 */
	public void setOffloads(final List<OffloadDto> pOffloads) {
		this.offloads = pOffloads;
	}

	/**
	 * Sets the <code>OpenIndicator</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>OpenIndicator</code> property.<br>
	 */
	public void setOpenIndicator(final boolean pOpenIndicator) {
		this.openIndicator = pOpenIndicator;
	}

	/**
	 * Sets the <code>padType</code> property.
	 * <p>
	 * 
	 * @param pPadType
	 *            the current value of the <code>padType</code> property.<br>
	 */
	public void setPadType(final String pPadType) {
		this.padType = pPadType;
	}

	/**
	 * Sets the <code>PercentageFull</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>PercentageFull</code> property.<br>
	 */
	public void setPercentageFull(final Integer pPercentageFull) {
		this.percentageFull = pPercentageFull;
	}

	public void setPrimaryshipmentPieces(final Integer pPrimaryshipmentPieces) {
		PrimaryshipmentPieces = pPrimaryshipmentPieces;
	}

	/**
	 * Sets the <code>PrimaryshipmentPieces</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>PrimaryshipmentPieces</code>
	 *            property.<br>
	 */
	public void setPrimaryShipmentPieces(final Integer pPrimaryshipmentPieces) {
		this.PrimaryshipmentPieces = pPrimaryshipmentPieces;
	}

	public void setPrimaryShipmentVolumeUOM(
			VolumeUOMType primaryShipmentVolumeUOM) {
		this.primaryShipmentVolumeUOM = primaryShipmentVolumeUOM;
	}

	/**
	 * Sets the <code>PrimaryshipmentVolumn</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>PrimaryshipmentVolumn</code>
	 *            property.<br>
	 */
	public void setPrimaryshipmentVolumn(final BigDecimal pPrimaryshipmentVolumn) {
		PrimaryshipmentVolumn = pPrimaryshipmentVolumn;
	}

	/**
	 * Sets the <code>primaryshipmentWeight</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>primaryshipmentWeight</code>
	 *            property.<br>
	 */
	public void setPrimaryshipmentWeight(final BigDecimal pPrimaryshipmentWeight) {
		PrimaryshipmentWeight = pPrimaryshipmentWeight;
	}

	public void setPrimaryShipmentWeightUOM(
			final WeightUOMType pPrimaryShipmentWeightUOM) {
		this.primaryShipmentWeightUOM = pPrimaryShipmentWeightUOM;
	}

	/**
	 * Sets the <code>Priority</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>Priority</code> property.<br>
	 */
	public void setPriority(final Integer pPriority) {
		this.priority = pPriority;
	}

	/**
	 * Sets the <code>ProductCode</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>ProductCode</code> property.<br>
	 */
	public void setProductCode(final String pProductCode) {
		this.productCode = pProductCode;
	}

	/**
	 * Sets the <code>pseudoULDIndicator</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>pseudoULDIndicator</code>
	 *            property.<br>
	 */
	public void setPseudoULDIndicator(final boolean pseudoULDIndicator) {
		this.pseudoULDIndicator = pseudoULDIndicator;
	}

	/**
	 * Sets the <code>pReasonCode</code> property.
	 * <p>
	 * 
	 * @param reasonCode
	 *            the current value of the <code>reasonCode</code> property.<br>
	 */
	public void setReasonCode(String pReasonCode) {
		this.reasonCode = pReasonCode;
	}

	/**
	 * Sets the <code>Remarks</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>Remarks</code> property.<br>
	 */
	public void setRemarks(final String pRemarks) {
		this.remarks = pRemarks;
	}

	/**
	 * Sets the <code>scheduleChangeIndicator</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @param scheduleChangeIndicator
	 *            the current value of the <code>scheduleChangeIndicator</code>
	 *            property.
	 */
	public void setScheduleChangeIndicator(boolean scheduleChangeIndicator) {
		this.scheduleChangeIndicator = scheduleChangeIndicator;
	}

	public void setShipmentPieces(final Integer pShipmentPieces) {
		this.shipmentPieces = pShipmentPieces;
	}

	public void setSplCodes(String splCodes) {
		this.splCodes = splCodes;
	}

	/**
	 * Sets the <code>statusChangeCode</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>statusChangeCode</code>
	 *            property.<br>
	 */
	public void setStatusChangeCode(String statusChangeCode) {
		this.statusChangeCode = statusChangeCode;
	}

	/**
	 * Sets the <code>StatusChangeDateTime</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>StatusChangeDateTimeUTC</code>
	 *            property.<br>
	 */
	public void setStatusChangeDateTime(final Date pStatusChangeDateTime) {
		if (pStatusChangeDateTime != null) {
			this.statusChangeDateTime = (Date) pStatusChangeDateTime.clone();
		} else {
			this.statusChangeDateTime = null;
		}
	}

	/**
	 * Sets the <code>StatusChangeDateTimeUTC</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the <code>StatusChangeDateTimeUTC</code>
	 *            property.<br>
	 */
	public void setStatusChangeDateTimeUTC(final Date pStatusChangeDateTimeUTC) {
		if (pStatusChangeDateTimeUTC != null) {
			this.statusChangeDateTimeUTC = (Date) pStatusChangeDateTimeUTC
					.clone();
		} else {
			this.statusChangeDateTimeUTC = null;
		}
	}
	
	private CustomsSubStatusType pendingCustomSubStatusCode;

	/**
		 * Gets the <code>pendingCustomSubStatusCode</code> property.
		 * <p>
		 * <b>Format: </b><br>
		 * CustomsSubStatusType
		 * <p>
		 * 
		 * @return the current value of the <code>pendingCustomSubStatusCode</code>
		 *         property.
		 */
		public CustomsSubStatusType getPendingCustomSubStatusCode() {
			return pendingCustomSubStatusCode;
		}

		/**
		 * Sets the <code>pendingCustomSubStatusCode</code> property.
		 * <p>
		 * <b>Format: </b><br>
		 * CustomsSubStatusType
		 * <p>
		 * 
		 * @param pendingCustomSubStatusCode
		 *            the current value of the
		 *            <code>pendingCustomSubStatusCode</code> property.
		 */
		public void setPendingCustomSubStatusCode(
				CustomsSubStatusType pendingCustomSubStatusCode) {
			this.pendingCustomSubStatusCode = pendingCustomSubStatusCode;
		}

	public void setUserEnteredLocalTime(final Date userEnteredLocalTime) {
		if (userEnteredLocalTime != null) {
			this.userEnteredLocalTime = (Date) userEnteredLocalTime.clone();
		} else {
			this.userEnteredLocalTime = null;
		}
	}

	public void setUserEnteredUTCTime(Date userEnteredUTCTime) {
		if (userEnteredUTCTime != null) {
			this.userEnteredUTCTime = (Date) userEnteredUTCTime.clone();
		} else {
			this.userEnteredUTCTime = null;
		}
	}

	/**
	 * Sets the <code>VerifiedInputWeightIndicator</code> property.
	 * <p>
	 * 
	 * @param pAmount
	 *            the current value of the
	 *            <code>VerifiedInputWeightIndicator</code> property.<br>
	 */
	public void setVerifiedInputWeightIndicator(
			final boolean pVerifiedInputWeightIndicator) {
		this.verifiedInputWeightIndicator = pVerifiedInputWeightIndicator;
	}

    public BaseFlightDto getOldFlight() {
        return oldFlight;
    }

    public void setOldFlight(BaseFlightDto oldFlight) {
        this.oldFlight = oldFlight;
    }

    public Date getOldFlightDate() {
        return oldFlightDate;
    }

    public void setOldFlightDate(Date oldFlightDate) {
        this.oldFlightDate = oldFlightDate;
    }
	/*SK208A - UC292 Begin*/
    /**
     * Attribute to hold <code>smallShipmentIndicator</code> property.
     */
    public boolean smallShipmentIndicator;
    
    /**
	 * @return the smallShipmentIndicator
	 */
	public boolean isSmallShipmentIndicator() {
		return smallShipmentIndicator;
	}

	/**
	 * @param smallShipmentIndicator the smallShipmentIndicator to set
	 */
	public void setSmallShipmentIndicator(boolean smallShipmentIndicator) {
		this.smallShipmentIndicator = smallShipmentIndicator;
	}

	/*SK208A - UC292 End*/
}
