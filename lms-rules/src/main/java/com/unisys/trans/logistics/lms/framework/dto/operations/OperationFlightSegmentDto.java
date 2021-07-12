package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.FlightCloseStatusType;
import com.unisys.trans.logistics.lms.framework.dto.BaseFlightSegmentDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.CustomsCompletionStatusType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.CustomsInitiationType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.ECAStatusType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.FlightCheckInStatusType;

/**
 * The warehouse segment data transfer object holds segment level information specific to WAREHOUSE module.
 */
public class OperationFlightSegmentDto extends PersistenceObjectDto {

    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = -1688926133910006463L;

    /**
     * Represents the baseFlightSegmentDto of the flight.
     */
    private BaseFlightSegmentDto baseFlightSegmentDto;

    /**
     * List of containers associated with the flight segment.
     */
    private List<ContainerDto> containers;

    /**
     * Attribute to hold <code>CustomsCompletionStatusType</code> property.
     */
    private CustomsCompletionStatusType CustomsCompletionStatusType;

    /**
     * Attribute to hold <code>customsInitiationType</code> property.
     */
    private CustomsInitiationType customsInitiationType;

    /**
     * Attribute to hold <code>dangerousGoodsLockIndicator</code> property.
     */
    private boolean dangerousGoodsLockIndicator;

    /**
     * Attribute to hold <code>DgFlightMasterSegment</code> property.
     */
    private DGFlightMasterSegmentDto dgFlightMasterSegment;

    /**
     * List of discrepancy goods associated with the flight segment.
     */
    private List<DiscrepancyGoodsDto> discrepancyGoodsDtos;

    /**
     * Attribute to hold <code>discrepancyIndicator</code> property.
     */
    private boolean discrepancyIndicator;

    /**
     * Attribute to hold <code>ecaStatus</code> property.
     */
    private ECAStatusType ecaStatus;

    /**
     * Represents the check-in status of the flight at the offload station.
     */
    private FlightCheckInStatusType flightCheckInStatus;

    /**
     * The status that determines whether a flight is open or closed for shipments. Even if the flight is
     * opened/ closed, there may be some restrictions placed in assigning certain type of shipments.
     */
    private FlightCloseStatusType flightCloseStatus;

    /**
     * List of goods associated with the flight segment.
     */
    private List<GoodsDto> goods;

    /**
     * Attribute to hold <code>lockByUserId</code> property.
     */
    private String lockByUserId;

    /**
     * Attribute to hold <code>manifestChangedIndicator</code> property.
     */
    private boolean manifestChangedIndicator;

    /**
     * Attribute to hold <code>manifestContainer</code> property.
     */
    private List<ManifestContainerDto> manifestContainer;

    /**
     * Attribute to hold <code>manifestEditInProgressIndicator</code> property.
     */
    private boolean manifestEditInProgressIndicator;

    /**
     * Attribute to hold <code>manifestGoods</code> property.
     */
    private List<ManifestGoodsDto> manifestGoods;

    /**
     * Attribute to hold <code>manifestPrintedIndicator</code> property.
     */
    private boolean manifestPrintedIndicator;

    /**
     * Attribute to hold <code>messageSequenceNumber</code> property.
     */
    private String messageSequenceNumber;

    /**
     * System generated unique key for the segment entity.
     */
    private Long oId;

    /**
     * Represents the the flight.
     */
    private OperationFlightDto operationFlightDto;

    /**
     * Attribute to hold <code>preGenIndicator</code> property.
     */
    private boolean preGenIndicator;

    /**
     * Attribute to hold <code>SegmentManifestDetails</code> property.
     */
    private SegmentManifestDetailsDto segmentManifestDetails = new SegmentManifestDetailsDto();

    /**
     * The default constructor
     */
    public OperationFlightSegmentDto() {

    }

    /**
     */
    public BaseFlightSegmentDto getBaseFlightSegmentDto() {
        return this.baseFlightSegmentDto;
    }

    /**
     * Returns the list of containers associated with the flight segment.
     * 
     * @return The list of containers associated with the flight segment.
     */
    public List<ContainerDto> getContainers() {
        if (this.containers == null) {
            this.containers = new ArrayList<ContainerDto>();
        }
        return this.containers;
    }

    /**
     * Gets the value of the <code>CustomsCompletionStatusType</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>CustomsCompletionStatusType</code> property.
     */
    public CustomsCompletionStatusType getCustomsCompletionStatusType() {
        return this.CustomsCompletionStatusType;
    }

    /**
     * Gets the value of the <code>customsInitiationType</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>customsInitiationType</code> property.
     */
    public CustomsInitiationType getCustomsInitiationType() {
        return this.customsInitiationType;
    }

    /**
     * Gets the <code>DgFlightMasterSegment</code> property.
     * <p>
     * 
     * @return the current value of the <code>DgFlightMasterSegment</code> property.<br>
     */
    public DGFlightMasterSegmentDto getDgFlightMasterSegment() {
        if (this.dgFlightMasterSegment == null) {
            return new DGFlightMasterSegmentDto();
        }
        return this.dgFlightMasterSegment;
    }

    /**
     * Gets the value of the <code>discrepancyGoodsDtos</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>discrepancyGoodsDtos</code> property.
     */
    public List<DiscrepancyGoodsDto> getDiscrepancyGoodsDtos() {
        return this.discrepancyGoodsDtos;
    }

    /**
     * Returns the close or reopen status of the flight for the segment.
     * 
     * @return The status that determines whether a flight is open or closed for shipments. Even if the flight
     *         is opened/ closed, there may be some restrictions placed in assigning certain type of
     *         shipments.
     *         Format : 1 character of type alphabet.
     *         Example : C
     */
    public ECAStatusType getEcaStatus() {
        return this.ecaStatus;
    }

    /**
     * Returns the check-in status of the flight.
     * 
     * @return Represents the check-in status of the flight at the offload station
     */
    public FlightCheckInStatusType getFlightCheckInStatus() {
        return flightCheckInStatus;
    }

    /**
     * Returns the close or reopen status of the flight for the segment.
     * 
     * @return The status that determines whether a flight is open or closed for shipments. Even if the flight
     *         is opened/ closed, there may be some restrictions placed in assigning certain type of
     *         shipments.
     *         Format : 1 character of type alphabet.
     *         Example : C
     */
    public FlightCloseStatusType getFlightCloseStatus() {
        return this.flightCloseStatus;
    }

    /**
     * Returns the list of goods associated with the flight segment.
     * 
     * @return The list of goods associated with the flight segment.
     */
    public List<GoodsDto> getGoods() {
        if (this.goods == null) {
            this.goods = new ArrayList<GoodsDto>();
        }
        return this.goods;
    }

    /**
     * Gets the value of the <code>lockByUserId</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>lockByUserId</code> property.
     */
    public String getLockByUserId() {
        return this.lockByUserId;
    }

    /**
     * Gets the <code>ManifestContainer</code> property.
     * <p>
     * 
     * @return the current value of the <code>ManifestContainer</code> property.<br>
     */
    public List<ManifestContainerDto> getManifestContainer() {
        return this.manifestContainer;
    }

    /**
     * Gets the <code>ManifestGoods</code> property.
     * <p>
     * 
     * @return the current value of the <code>ManifestGoods</code> property.<br>
     */
    public List<ManifestGoodsDto> getManifestGoods() {
        return this.manifestGoods;
    }

    /**
     * Gets the value of the <code>messageSequenceNumber</code> property.
     * 
     * @return
     */
    public String getMessageSequenceNumber() {
        return messageSequenceNumber;
    }

    /**
     * Returns the unique key for the segment.
     * 
     * @return System generated unique key for the segment entity.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     */
    public OperationFlightDto getOperationFlightDto() {
        return this.operationFlightDto;
    }

    /**
     * Gets the <code>SegmentManifestDetails</code> property.
     * <p>
     * 
     * @return the current value of the <code>SegmentManifestDetails</code> property.<br>
     */
    public SegmentManifestDetailsDto getSegmentManifestDetails() {
        return this.segmentManifestDetails;
    }

    /**
     * Gets the value of the <code>dangerousGoodsLockIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>dangerousGoodsLockIndicator</code> property.
     */
    public boolean isDangerousGoodsLockIndicator() {
        return this.dangerousGoodsLockIndicator;
    }

    /**
     * Gets the value of the <code>discrepancyIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>discrepancyIndicator</code> property.
     */
    public boolean isDiscrepancyIndicator() {
        return this.discrepancyIndicator;
    }

    /**
     * Gets the value of the <code>manifestChangedIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>manifestChangedIndicator</code> property.
     */
    public boolean isManifestChangedIndicator() {
        return this.manifestChangedIndicator;
    }

    /**
     * Gets the value of the <code>manifestEditInProgressIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>manifestEditInProgressIndicator</code> property.
     */
    public boolean isManifestEditInProgressIndicator() {
        return this.manifestEditInProgressIndicator;
    }

    /**
     * Gets the value of the <code>manifestPrintedIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>manifestPrintedIndicator</code> property.
     */
    public boolean isManifestPrintedIndicator() {
        return this.manifestPrintedIndicator;
    }

    /**
     * Gets the value of the <code>preGenIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>preGenIndicator</code> property.
     */
    public boolean isPreGenIndicator() {
        return this.preGenIndicator;
    }

    /**
     * 
     * @param baseFlightSegmentDto
     */
    public void setBaseFlightSegmentDto(final BaseFlightSegmentDto baseFlightSegmentDto) {
        this.baseFlightSegmentDto = baseFlightSegmentDto;
    }

    /**
     * Sets the list of containers associated with the flight segment.
     * 
     * @return The list of containers associated with the flight segment.
     */
    public List<ContainerDto> setContainers(final List<ContainerDto> pContainers) {
        this.containers = pContainers;
        return this.containers;
    }

    /**
     * Sets the value of the <code>CustomsCompletionStatusType</code> property.
     * <p>
     * 
     * @param <code>customsCompletionStatusType</code> Holds the new value of the
     *            <code>CustomsCompletionStatusType</code> property.
     */
    public void setCustomsCompletionStatusType(
                final CustomsCompletionStatusType customsCompletionStatusType) {
        this.CustomsCompletionStatusType = customsCompletionStatusType;
    }

    /**
     * Sets the value of the <code>customsInitiationType</code> property.
     * <p>
     * 
     * @param <code>customsInitiationType</code> Holds the new value of the <code>customsInitiationType</code>
     *            property.
     */
    public void setCustomsInitiationType(final CustomsInitiationType customsInitiationType) {
        this.customsInitiationType = customsInitiationType;
    }

    /**
     * Sets the value of the <code>dangerousGoodsLockIndicator</code> property.
     * <p>
     * 
     * @param <code>dangerousGoodsLockIndicator</code> Holds the new value of the
     *            <code>dangerousGoodsLockIndicator</code> property.
     */
    public void setDangerousGoodsLockIndicator(final boolean dangerousGoodsLockIndicator) {
        this.dangerousGoodsLockIndicator = dangerousGoodsLockIndicator;
    }

    /**
     * Sets the <code>DgFlightMasterSegment</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>DgFlightMasterSegment</code> property.<br>
     */
    public void setDgFlightMasterSegment(
                final DGFlightMasterSegmentDto pDgFlightMasterSegment) {
        this.dgFlightMasterSegment = pDgFlightMasterSegment;
    }

    /**
     * Sets the value of the <code>discrepancyGoodsDtos</code> property.
     * <p>
     * 
     * @param <code>discrepancyGoodsDtos</code> Holds the new value of the <code>discrepancyGoodsDtos</code>
     *            property.
     */
    public void setDiscrepancyGoodsDtos(final List<DiscrepancyGoodsDto> discrepancyGoodsDtos) {
        this.discrepancyGoodsDtos = discrepancyGoodsDtos;
    }

    /**
     * Sets the value of the <code>discrepancyIndicator</code> property.
     * <p>
     * 
     * @param <code>discrepancyIndicator</code> Holds the new value of the <code>discrepancyIndicator</code>
     *            property.
     */
    public void setDiscrepancyIndicator(final boolean discrepancyIndicator) {
        this.discrepancyIndicator = discrepancyIndicator;
    }

    /**
     * Sets the close or reopen status of the flight for the segment.
     * 
     * @param pFlightCloseStatus The status that determines if a flight is open or closed for shipments. Even
     *            if the flight is opened/ closed, there may be some restrictions placed on assigning certain
     *            type of shipments.
     *            Format : 1 character of type alphabet.
     *            Example : C
     */
    public void setEcaStatus(final ECAStatusType ecaStatus) {
        this.ecaStatus = ecaStatus;
    }

    /**
     * Sets the check-in status of the flight.
     * 
     * @param pFlightCheckInStatus Represents the check-in status of the flight at the offload station.
     */
    public void setFlightCheckInStatus(
                FlightCheckInStatusType pFlightCheckInStatus) {
        this.flightCheckInStatus = pFlightCheckInStatus;
    }

    /**
     * Sets the close or reopen status of the flight for the segment.
     * 
     * @param pFlightCloseStatus The status that determines if a flight is open or closed for shipments. Even
     *            if the flight is opened/ closed, there may be some restrictions placed on assigning certain
     *            type of shipments.
     *            Format : 1 character of type alphabet.
     *            Example : C
     */
    public void setFlightCloseStatus(final FlightCloseStatusType pFlightCloseStatus) {
        this.flightCloseStatus = pFlightCloseStatus;
    }

    /**
     * Sets the list of goods to be associated with the flight segment.
     * 
     * @param pGoods The list of goods associated with the flight segment.
     */
    public void setGoods(final List<GoodsDto> pGoods) {
        this.goods = pGoods;
    }

    /**
     * Sets the value of the <code>lockByUserId</code> property.
     * <p>
     * 
     * @param <code>lockByUserId</code> Holds the new value of the <code>lockByUserId</code> property.
     */
    public void setLockByUserId(final String lockByUserId) {
        this.lockByUserId = lockByUserId;
    }

    /**
     * Sets the value of the <code>manifestChangedIndicator</code> property.
     * <p>
     * 
     * @param <code>pManifestChangedIndicator</code> Holds the new value of the
     *            <code>manifestChangedIndicator</code> property.
     */
    public void setManifestChangedIndicator(final boolean pManifestChangedIndicator) {
        this.manifestChangedIndicator = pManifestChangedIndicator;
    }

    /**
     * Sets the <code>ManifestContainer</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ManifestContainer</code> property.<br>
     */
    public void setManifestContainer(
                final List<ManifestContainerDto> pManifestContainer) {
        this.manifestContainer = pManifestContainer;
    }

    /**
     * Sets the value of the <code>manifestEditInProgressIndicator</code> property.
     * <p>
     * 
     * @param <code>manifestEditInProgressIndicator</code> Holds the new value of the
     *            <code>manifestEditInProgressIndicator</code> property.
     */
    public void setManifestEditInProgressIndicator(final boolean manifestEditInProgressIndicator) {
        this.manifestEditInProgressIndicator = manifestEditInProgressIndicator;
    }

    /**
     * Sets the <code>ManifestGoods</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ManifestGoods</code> property.<br>
     */
    public void setManifestGoods(final List<ManifestGoodsDto> pManifestGoods) {
        this.manifestGoods = pManifestGoods;
    }

    /**
     * Sets the value of the <code>manifestPrintedIndicator</code> property.
     * <p>
     * 
     * @param <code>manifestPrintedIndicator</code> Holds the new value of the
     *            <code>manifestPrintedIndicator</code> property.
     */
    public void setManifestPrintedIndicator(final boolean manifestPrintedIndicator) {
        this.manifestPrintedIndicator = manifestPrintedIndicator;
    }

    /**
     * Sets the value of the <code>messageSequenceNumber</code> property.
     * 
     * @param messageSequenceNumber
     */
    public void setMessageSequenceNumber(String messageSequenceNumber) {
        this.messageSequenceNumber = messageSequenceNumber;
    }

    /**
     * Sets the unique key for the segment.
     * 
     * @param pOId System generated unique key for the segment entity.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * 
     * @param operationFlightDto
     */
    public void setOperationFlightDto(final OperationFlightDto operationFlightDto) {
        this.operationFlightDto = operationFlightDto;
    }

    /**
     * Sets the value of the <code>preGenIndicator</code> property.
     * <p>
     * 
     * @param <code>preGenIndicator</code> Holds the new value of the <code>preGenIndicator</code> property.
     */
    public void setPreGenIndicator(final boolean preGenIndicator) {
        this.preGenIndicator = preGenIndicator;
    }

    /**
     * Sets the <code>SegmentManifestDetails</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>SegmentManifestDetails</code> property.<br>
     */
    public void setSegmentManifestDetails(
                final SegmentManifestDetailsDto pSegmentManifestDetails) {
        this.segmentManifestDetails = pSegmentManifestDetails;
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
}
