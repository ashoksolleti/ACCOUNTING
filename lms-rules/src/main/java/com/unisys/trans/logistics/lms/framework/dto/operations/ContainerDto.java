/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.constants.BookingSplitType;
import com.unisys.trans.logistics.lms.framework.constants.ItemDisplayType;
import com.unisys.trans.logistics.lms.framework.constants.VolumeUOMType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.WorkOrderDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.ContainerType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ContainerDto</code> class represents the Container information.
 * 
 */
public class ContainerDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1503886190569649119L;

    /**
     * Attribute to hold <code>activationStation</code> property.
     */
    private String activationStation;

    /**
     * Attribute to hold <code>bookedFlight</code> property.
     */
    private BaseFlightDto bookedFlight;

    /**
     * Attribute to hold <code>bookedFlightDate</code> property.
     */
    private Date bookedFlightDate;

    /**
     * Attribute to hold <code>bookedOffload</code> property.
     */
    private OffloadDto bookedOffload;

    /**
     * Attribute to hold <code>bookedSplitIndicator</code> property.
     */
    private BookingSplitType bookedSplitIndicator;

    /**
     * Attribute to hold <code>workOrderStation</code> property.
     */
    private List<CandidateBookingSegmentDto> candidateBookingSegments;

    /**
     * Attribute to hold <code>containerId</code> property.
     */
    private String containerId;

    private String containerSplCodes;

    /**
     * Attribute to hold <code>containerSPLCodes</code> property.
     */
    private List<String> containerSPLCodes;

    /**
     * Attribute to hold <code>goodsDestinationMismatch</code> property.
     */
    private boolean goodsDestinationMismatch;

    /**
     * 
     * @return
     */
    public boolean isGoodsDestinationMismatch() {
        return this.goodsDestinationMismatch;
    }
    
    private boolean tconWithoutOffloadInd;

    public boolean isTconWithoutOffloadInd() {
		return this.tconWithoutOffloadInd;
	}
	public void setTconWithoutOffloadInd(boolean pTconWithoutOffloadInd) {
		this.tconWithoutOffloadInd = pTconWithoutOffloadInd;
	}

    /**
     * 
     * @param pGoodsDestinationMismatch
     */
    public void setGoodsDestinationMismatch(boolean pGoodsDestinationMismatch) {
        this.goodsDestinationMismatch = pGoodsDestinationMismatch;
    }

    /**
     * Attribute to hold <code>containerTypeCode</code> property.
     */
    private ContainerType containerTypeCode;

    /**
     * Attribute to hold <code>containerType</code> property.
     */
    private String bookingContainerType;

    public String getBookingContainerType() {

        if (this.isShipperLoadedULD()) {
            bookingContainerType = "S";
        }
        else if ((ContainerType.INACTIVE).equals(this.getContainerTypeCode())) {
            bookingContainerType = "I";
        }
        else {
            if ((ContainerType.TCON).equals(this.getContainerTypeCode())) {
                bookingContainerType = "T";
            }
            else {
                bookingContainerType = "C";
            }
        }
        return bookingContainerType;
    }

    public void setBookingContainerType(final String pBookingContainerType) {
        this.bookingContainerType = pBookingContainerType;
    }

    /**
     * Attribute to hold <code>currentContour</code> property.
     */
    private String currentContour;

    /**
     * Attribute to hold <code>currentVolumeCapacity</code> property.
     */
    private BigDecimal currentVolumeCapacity;

    /**
     * Attribute to hold <code>currentVolumeCapacityUOM</code> property.
     */
    private VolumeUOMType currentVolumeCapacityUOM;

    /**
     * Attribute to hold <code>currentWeightCapacity</code> property.
     */
    private BigDecimal currentWeightCapacity;

    /**
     * Attribute to hold <code>currentWeightCapacityUOM</code> property.
     */
    private WeightUOMType currentWeightCapacityUOM;

    /**
     * Attribute to hold <code>DiscrepancyULDDetails</code> property.
     */
    private DiscrepancyULDDetailsDto discrepancyULDDetailsDto;

    /**
     * Attribute to hold <code>discrepancyULD</code> property.
     */
    private List<DiscrepancyULDDto> discrepancyULDDtos;

    private String displayContainerStatus;

    private String displayCustomsStatus;

    /**
     * Attribute to hold <code>equipmentWeight</code> property.
     */
    private BigDecimal equipmentWeight;

    /**
     * Attribute to hold <code>equipmentWeightUOM</code> property.
     */
    private WeightUOMType equipmentWeightUOM;

    /**
     * Attribute to hold <code>goods</code> property.
     */
    private List<GoodsDto> goods;

    /**
     * Attribute to hold <code>importContainerIndicator</code> property.
     */
    private boolean importContainerIndicator;

    /**
     * Attribute to hold <code>itemDisplayType</code> property.
     */
    private ItemDisplayType itemDisplayType;

    /**
     * Attribute to hold <code>multiOffloadTCONIndicator</code> property.
     */
    private boolean multiOffloadTCONIndicator;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>operationalDetail</code> property.
     */
    private OperationalDetailDto operationalDetail;

    /**
     * Attribute to hold <code>operationSegmentDto</code> property.
     */
    private OperationFlightSegmentDto operationSegmentDto;

    /**
     * Attribute to hold <code>permanentContour</code> property.
     */
    private String permanentContour;

    /**
     * Attribute to hold <code>permanentVolumeCapacity</code> property.
     */
    private BigDecimal permanentVolumeCapacity;

    /**
     * Attribute to hold <code>permanentVolumeCapacityUOM</code> property.
     */
    private VolumeUOMType permanentVolumeCapacityUOM;

    /**
     * Attribute to hold <code>permanentWeightCapacity</code> property.
     */
    private BigDecimal permanentWeightCapacity;

    /**
     * Attribute to hold <code>permanentWeightCapacityUOM</code> property.
     */
    private WeightUOMType permanentWeightCapacityUOM;

    // MH007
    /**
     * Attribute to hold <code>prepackIndicator</code> property.
     */
    private boolean prepackIndicator;

    /**
     * Attribute to hold <code>shipperLoadedULDIndicator</code> property.
     */
    private boolean shipperLoadedULDIndicator;

    /**
     * Attribute to hold <code>tareWeight</code> property.
     */
    private BigDecimal tareWeight;

    /**
     * Attribute to hold <code>tareWeightUOM</code> property.
     */
    private WeightUOMType tareWeightUOM;

    /**
     * Attribute to hold <code>shipperLoadedULDDto</code> property.
     */
    private ULDBookingDetailsDto uldBookingDetailsDto;

    /**
     * Attribute to hold <code>workOrderDto</code> property.
     */
    private WorkOrderDto workOrderDto;

    /**
     * Attribute to hold <code>workOrderItemStatus</code> property.
     */
    private String workOrderItemStatus;

    /**
     * Attribute to hold <code>workorderNumber</code> property.
     */
    private Long workorderNumber;

    /**
     * Attribute to hold <code>workOrderOid</code> property.
     */
    private Long workOrderOid;

    /**
     * Attribute to hold <code>workOrderStation</code> property.
     */
    private String workOrderStation;

    // AC415 begins
	/**
	 * Attribute to hold <code> dangerousgoodsIndicator </code> property This
	 * attribute indicates if the container contains dangerous goods.
	 */
	private boolean dangerousGoodsIndicator;

	/**
	 * Attribute to hold <code> dgrGoodsStatusIndicator </code> property This
	 * attribute indicates if the user verified that the dangerous goods are not
	 * damaged or leaking when closing the container. Y – The user verified that
	 * the dangerous goods are not damaged or leaking when closing the
	 * container. N - Not Applicable.
	 */
	private String dgrGoodsStatusIndicator;

	/**
	 * Attribute to hold <code> dgrGoodsLabelIndicator </code> property This
	 * attribute indicates whether the ACF333DG tag has been attached to the
	 * container. Y - Indicates an ACF333DG tag has been attached to the
	 * container. N – Not Applicable.
	 */
	private String dgrGoodsLabelIndicator;

	// AC415 ends
    private boolean closedIndicator;

    private BigDecimal grossWeight;

    private String grossWeightInd;

    private BigDecimal netWeight;

    private Long totalAcceptedPieces;

    private BigDecimal totalAcceptedWeight;

    /**
     * Attribute to hold <code>pieceCount</code> property.
     */
    private Integer tuPieces;

    public Integer getTuPieces() {

		if (this.getGoods() != null
				&& !this.getGoods().isEmpty()
				&& this.getGoods().get(0) != null
				&& this.getGoods().get(0).getCapacityDto().getPieceCount() != null
				&& this.isClosedIndicator()
				&& "C".equals(this.bookingContainerType)) {

            tuPieces = this.getGoods().get(0).getCapacityDto().getPieceCount();

        }
        return tuPieces;
    }

    public void setTuPieces(final Integer pTuPieces) {
        this.tuPieces = pTuPieces;
    }

    public BigDecimal getTuWeight() {

		if (this.getGoods() != null && !this.getGoods().isEmpty()
				&& this.getGoods().get(0) != null
				&& this.getGoods().get(0).getCapacityDto().getWeight() != null
				&& this.isClosedIndicator()
				&& "C".equals(this.bookingContainerType)) {
            tuWeight = this.getGoods().get(0).getCapacityDto().getWeight();
        }
        return tuWeight;
    }

    public void setTuWeight(final BigDecimal pTuWeight) {
        this.tuWeight = pTuWeight;
    }

    /**
     * Attribute to hold <code>weight</code> property.
     */
    private BigDecimal tuWeight;

    public Long getTotalAcceptedPieces() {
        return totalAcceptedPieces;
    }

    public void setTotalAcceptedPieces(final Long pTotalAcceptedPieces) {
        this.totalAcceptedPieces = pTotalAcceptedPieces;
    }

    public BigDecimal getTotalAcceptedWeight() {
        return totalAcceptedWeight;
    }

    public void setTotalAcceptedWeight(final BigDecimal pTotalAcceptedWeight) {
        this.totalAcceptedWeight = pTotalAcceptedWeight;
    }

    private String perUtils;

    public String getPerUtils() {

        if (this.getOperationalDetail().getPercentageFull() != null && this.isClosedIndicator()
                    && "C".equals(this.bookingContainerType)) {

            perUtils = this.getOperationalDetail().getPercentageFull().toString();
        }
        return perUtils;
    }

    public void setPerUtils(final String pPerUtils) {
        this.perUtils = pPerUtils;
    }

    public BigDecimal getNetWeight() {

        if (this.isClosedIndicator() && "C".equals(this.bookingContainerType)
                    && this.getOperationalDetail().getComputedWeight() != null
                    && this.getTareWeight() != null) {

            netWeight = this.getOperationalDetail().getComputedWeight().subtract(this.getTareWeight());

        }
        return netWeight;
    }

    public void setNetWeight(final BigDecimal pNetWeight) {
        this.netWeight = pNetWeight;
    }

    public String getGrossWeightInd() {

        if (this.isClosedIndicator() && "C".equals(this.bookingContainerType)) {

            grossWeightInd = "E";
        }
        return grossWeightInd;
    }

    public void setGrossWeightInd(final String pGrossWeightInd) {
        this.grossWeightInd = pGrossWeightInd;
    }

    public BigDecimal getGrossWeight() {
        if (this.getOperationalDetail().getInputWeight()!=null && this.isClosedIndicator()) {

            grossWeight = this.getOperationalDetail().getInputWeight();
        }

        return grossWeight;
    }

    public void setGrossWeight(final BigDecimal pGrossWeight) {
        this.grossWeight = pGrossWeight;
    }

    public boolean isClosedIndicator() {
        return closedIndicator;
    }

    public void setClosedIndicator(final boolean pClosedIndicator) {
        this.closedIndicator = pClosedIndicator;
    }

    /**
     * Gets the <code>ActivationStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>ActivationStation</code> property.<br>
     */
    public String getActivationStation() {
        return this.activationStation;
    }

    /**
     * Gets the <code>bookedFlight</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookedFlight</code> property.<br>
     */
    public BaseFlightDto getBookedFlight() {
        return this.bookedFlight;
    }

    /**
     * Gets the <code>bookedFlightDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookedFlightDate</code> property.<br>
     */
    public Date getBookedFlightDate() {
        if (bookedFlightDate != null) {
            return (Date) bookedFlightDate.clone();
        }
        else {
            return null;
        }
    }

    /**
     * Gets the <code>bookedOffload</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookedOffload</code> property.<br>
     */
    public OffloadDto getBookedOffload() {
        return this.bookedOffload;
    }

    /**
     * Gets the <code>bookedSplitIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookedSplitIndicator</code> property.<br>
     */
    public BookingSplitType getBookedSplitIndicator() {
        return this.bookedSplitIndicator;
    }

    /**
     * Gets the <code>candidateBookingSegments</code> property.
     * <p>
     * 
     * @return the current value of the <code>candidateBookingSegments</code> property.<br>
     */
    public List<CandidateBookingSegmentDto> getCandidateBookingSegments() {
        return this.candidateBookingSegments;
    }

    /**
     * Gets the <code>ContainerId</code> property.
     * <p>
     * 
     * @return the current value of the <code>ContainerId</code> property.<br>
     */
    public String getContainerId() {
        return containerId;
    }

    /**
     * Gets the <code>containerSplCodes</code> property.
     * <p>
     * 
     * @return the current value of the <code>containerSplCodes</code> property.<br>
     */
    public String getContainerSplCodes() {
        return containerSplCodes;
    }

    /**
     * Gets the <code>ContainerSPLCodes</code> property.
     * <p>
     * 
     * @return the current value of the <code>ContainerSPLCodes</code> property.<br>
     */
    public List<String> getContainerSPLCodes() {
        if (containerSPLCodes == null) {
            containerSPLCodes = new ArrayList<String>();
        }
        return containerSPLCodes;
    }

    /**
     * Gets the <code>ContainerTypeCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>ContainerTypeCode</code> property.<br>
     */
    public ContainerType getContainerTypeCode() {
        return containerTypeCode;
    }

    /**
     * Gets the <code>CurrentContour</code> property.
     * <p>
     * 
     * @return the current value of the <code>CurrentContour</code> property.<br>
     */
    public String getCurrentContour() {
        return currentContour;
    }

    /**
     * Gets the <code>CurrentVolumeCapacity</code> property.
     * <p>
     * 
     * @return the current value of the <code>CurrentVolumeCapacity</code> property.<br>
     */
    public BigDecimal getCurrentVolumeCapacity() {
        return currentVolumeCapacity;
    }

    /**
     * Gets the <code>CurrentVolumeCapacityUOM</code> property.
     * <p>
     * 
     * @return the current value of the <code>CurrentVolumeCapacityUOM</code> property.<br>
     */
    public VolumeUOMType getCurrentVolumeCapacityUOM() {
        return currentVolumeCapacityUOM;
    }

    /**
     * Gets the <code>CurrentWeightCapacity</code> property.
     * <p>
     * 
     * @return the current value of the <code>CurrentWeightCapacity</code> property.<br>
     */
    public BigDecimal getCurrentWeightCapacity() {
        return currentWeightCapacity;
    }

    /**
     * Gets the <code>CurrentWeightCapacityUOM</code> property.
     * <p>
     * 
     * @return the current value of the <code>CurrentWeightCapacityUOM</code> property.<br>
     */
    public WeightUOMType getCurrentWeightCapacityUOM() {
        return currentWeightCapacityUOM;
    }

    /**
     * Gets the <code>discrepancyULDDetails</code> property.
     * <p>
     * 
     * @return the current value of the <code>discrepancyULDDetails</code> property.<br>
     */
    public DiscrepancyULDDetailsDto getDiscrepancyULDDetailsDto() {
        if (discrepancyULDDetailsDto == null) {
            discrepancyULDDetailsDto = new DiscrepancyULDDetailsDto();
        }
        return discrepancyULDDetailsDto;
    }

    /**
     * Gets the <code>discrepancyULD</code> property.
     * <p>
     * 
     * @return the current value of the <code>discrepancyULD</code> property.<br>
     */
    public List<DiscrepancyULDDto> getDiscrepancyULDDtos() {
        if (discrepancyULDDtos == null) {
            discrepancyULDDtos = new ArrayList<DiscrepancyULDDto>();
        }
        return discrepancyULDDtos;
    }

    public String getDisplayContainerStatus() {
        return displayContainerStatus;
    }

    public String getDisplayCustomsStatus() {
        return displayCustomsStatus;
    }

    /**
     * Gets the <code>EquipmentWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>EquipmentWeight</code> property.<br>
     */
    public BigDecimal getEquipmentWeight() {
        return equipmentWeight;
    }

    /**
     * Gets the <code>EquipmentWeightUOM</code> property.
     * <p>
     * 
     * @return the current value of the <code>EquipmentWeightUOM</code> property.<br>
     */
    public WeightUOMType getEquipmentWeightUOM() {
        return equipmentWeightUOM;
    }

    /**
     * Gets the <code>Goods</code> property.
     * <p>
     * 
     * @return the current value of the <code>Goods</code> property.<br>
     */
    public List<GoodsDto> getGoods() {
        if (goods == null) {
            goods = new ArrayList<GoodsDto>();
        }
        return goods;
    }

    public int getHouseGoodsPieces()
    {
        return 0;
    }

    public ItemDisplayType getItemDisplayType() {
        return itemDisplayType;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>OId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return oId;
    }

    /**
     * Gets the <code>OperationalDetail</code> property.
     * <p>
     * 
     * @return the current value of the <code>OperationalDetail</code> property.<br>
     */
    public OperationalDetailDto getOperationalDetail() {
        if (operationalDetail == null) {
            operationalDetail = new OperationalDetailDto();
        }

        return operationalDetail;
    }

    /**
     * Gets the <code>OperationSegmentDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>OperationSegmentDto</code> property.<br>
     */
    public OperationFlightSegmentDto getOperationSegmentDto() {
        if (operationSegmentDto == null) {
            operationSegmentDto = new OperationFlightSegmentDto();
        }
        return operationSegmentDto;
    }

    /**
     * Gets the <code>PermanentContour</code> property.
     * <p>
     * 
     * @return the current value of the <code>PermanentContour</code> property.<br>
     */
    public String getPermanentContour() {
        return permanentContour;
    }

    /**
     * Gets the <code>PermanentVolumeCapacity</code> property.
     * <p>
     * 
     * @return the current value of the <code>PermanentVolumeCapacity</code> property.<br>
     */
    public BigDecimal getPermanentVolumeCapacity() {
        return permanentVolumeCapacity;
    }

    /**
     * Gets the <code>PermanentVolumeCapacityUOM</code> property.
     * <p>
     * 
     * @return the current value of the <code>PermanentVolumeCapacityUOM</code> property.<br>
     */
    public VolumeUOMType getPermanentVolumeCapacityUOM() {
        return permanentVolumeCapacityUOM;
    }

    /**
     * Gets the <code>PermanentWeightCapacity</code> property.
     * <p>
     * 
     * @return the current value of the <code>PermanentWeightCapacity</code> property.<br>
     */
    public BigDecimal getPermanentWeightCapacity() {
        return permanentWeightCapacity;
    }

    /**
     * Gets the <code>PermanentWeightCapacityUOM</code> property.
     * <p>
     * 
     * @return the current value of the <code>PermanentWeightCapacityUOM</code> property.<br>
     */
    public WeightUOMType getPermanentWeightCapacityUOM() {
        return permanentWeightCapacityUOM;
    }

    /**
     * Gets the <code>TareWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>TareWeight</code> property.<br>
     */
    public BigDecimal getTareWeight() {
        return tareWeight;
    }

    /**
     * Gets the <code>TareWeightUOM</code> property.
     * <p>
     * 
     * @return the current value of the <code>TareWeightUOM</code> property.<br>
     */
    public WeightUOMType getTareWeightUOM() {
        return tareWeightUOM;
    }

    /**
     * Gets the value of the <code>uldBookingDetailsDto</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>uldBookingDetailsDto</code> property.
     */
    public ULDBookingDetailsDto getUldBookingDetailsDto() {
        if (uldBookingDetailsDto == null) {
            uldBookingDetailsDto = new ULDBookingDetailsDto();
        }
        return uldBookingDetailsDto;
    }

    /**
     * Gets the value of the <code>workOrderDto</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>workOrderDto</code> property.
     */
    public WorkOrderDto getWorkOrderDto() {
        if (workOrderDto == null) {
            workOrderDto = new WorkOrderDto();
        }
        return workOrderDto;
    }

    public String getWorkOrderItemStatus() {
        return workOrderItemStatus;
    }

    /**
     * Gets the value of the <code>workorderNumber</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>workorderNumber</code> property.
     */
    public Long getWorkorderNumber() {
        return workorderNumber;
    }

    /**
     * Gets the value of the <code>workOrderOid</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>workOrderOid</code> property.
     */
    public Long getWorkOrderOid() {
        return workOrderOid;
    }

    /**
     * Gets the value of the <code>workOrderStation</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>workOrderStation</code> property.
     */
    public String getWorkOrderStation() {
        return workOrderStation;
    }

    /**
     * Gets the <code>ImportContainerIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>ImportContainerIndicator</code> property.<br>
     */
    public boolean isImportContainerIndicator() {
        return importContainerIndicator;
    }

    /**
     * Gets the <code>MultiOffloadTCONIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>MultiOffloadTCONIndicator</code> property.<br>
     */
    public boolean isMultiOffloadTCONIndicator() {
        return multiOffloadTCONIndicator;
    }

    /**
     * Gets the <code>prepackIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>prepackIndicator</code> property.<br>
     */
    public boolean isPrepackIndicator() {
        return this.prepackIndicator;
    }

    /**
     * Gets the <code>ShipperLoadedULDIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>ShipperLoadedULDIndicator</code> property.<br>
     */
    public boolean isShipperLoadedULD() {
        return shipperLoadedULDIndicator;
    }

    /**
     * Sets the <code>ActivationStation</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ActivationStation</code> property.<br>
     */
    public void setActivationStation(final String pActivationStation) {
        activationStation = pActivationStation;
    }

    public void setBookedFlight(final BaseFlightDto bookedFlight) {
        this.bookedFlight = bookedFlight;
    }

    public void setBookedFlightDate(final Date pBookedFlightDate) {
        if (pBookedFlightDate != null) {
            this.bookedFlightDate = (Date) pBookedFlightDate.clone();
        }
        else
        {
            this.bookedFlightDate = null;
        }
    }

    public void setBookedOffload(final OffloadDto bookedOffload) {
        this.bookedOffload = bookedOffload;
    }

    public void setBookedSplitIndicator(final BookingSplitType bookedSplitIndicator) {
        this.bookedSplitIndicator = bookedSplitIndicator;
    }

    /**
     * Sets the <code>candidateBookingSegments</code> property.
     * <p>
     * 
     * @param pCandidateBookingSegments
     *            the current value of the <code>candidateBookingSegments</code> property.<br>
     */
    public void setCandidateBookingSegments(final List<CandidateBookingSegmentDto> pCandidateBookingSegments) {
        candidateBookingSegments = pCandidateBookingSegments;
    }

    /**
     * Sets the <code>ContainerId</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ContainerId</code> property.<br>
     */
    public void setContainerId(final String pContainerId) {
        containerId = ContractUtility.convertToUpperCase(pContainerId);
    }

    public void setContainerSplCodes(final String pContainerSplCodes) {
        containerSplCodes = pContainerSplCodes;
    }

    /**
     * Sets the <code>ContainerSPLCodes</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ContainerSPLCodes</code> property.<br>
     */
    public void setContainerSPLCodes(final List<String> pContainerSPLCodes) {
        containerSPLCodes = pContainerSPLCodes;
    }

    /**
     * Sets the <code>ContainerTypeCode</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ContainerTypeCode</code> property.<br>
     */
    public void setContainerTypeCode(final ContainerType pContainerTypeCode) {
        containerTypeCode = pContainerTypeCode;
    }

    /**
     * Sets the <code>CurrentContour</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>CurrentContour</code> property.<br>
     */
    public void setCurrentContour(final String pCurrentContour) {
        currentContour = ContractUtility.convertToUpperCase(pCurrentContour);
    }

    /**
     * Sets the <code>CurrentVolumeCapacity</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>CurrentVolumeCapacity</code> property.<br>
     */
    public void setCurrentVolumeCapacity(final BigDecimal pCurrentVolumeCapacity) {
        currentVolumeCapacity = pCurrentVolumeCapacity;
    }

    /**
     * Sets the <code>CurrentVolumeCapacityUOM</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>CurrentVolumeCapacityUOM</code> property.<br>
     */
    public void setCurrentVolumeCapacityUOM(
                final VolumeUOMType pCurrentVolumeCapacityUOM) {
        currentVolumeCapacityUOM = pCurrentVolumeCapacityUOM;
    }

    /**
     * Sets the <code>CurrentWeightCapacity</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>CurrentWeightCapacity</code> property.<br>
     */
    public void setCurrentWeightCapacity(final BigDecimal pCurrentWeightCapacity) {
        currentWeightCapacity = pCurrentWeightCapacity;
    }

    /**
     * Sets the <code>CurrentWeightCapacityUOM</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>CurrentWeightCapacityUOM</code> property.<br>
     */
    public void setCurrentWeightCapacityUOM(
                final WeightUOMType pCurrentWeightCapacityUOM) {
        currentWeightCapacityUOM = pCurrentWeightCapacityUOM;
    }

    /**
     * Sets the <code> discrepancyULDDetails</code> property.
     * <p>
     * 
     * @param discrepancyULDDetails
     *            the current value of the <code> discrepancyULDDetails</code> property.<br>
     */
    public void setDiscrepancyULDDetailsDto(
                final DiscrepancyULDDetailsDto discrepancyULDDetailsDto) {
        this.discrepancyULDDetailsDto = discrepancyULDDetailsDto;
    }

    /**
     * Sets the <code> discrepancyULD</code> property.
     * <p>
     * 
     * @param discrepancyULD
     *            the current value of the <code> discrepancyULD</code> property.<br>
     */
    public void setDiscrepancyULDDtos(final List<DiscrepancyULDDto> discrepancyULDDtos) {
        this.discrepancyULDDtos = discrepancyULDDtos;
    }

    public void setDisplayContainerStatus(final String displayContainerStatus) {
        this.displayContainerStatus = displayContainerStatus;
    }

    public void setDisplayCustomsStatus(final String displayCustomsStatus) {
        this.displayCustomsStatus = displayCustomsStatus;
    }

    /**
     * Sets the <code>EquipmentWeight</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>EquipmentWeight</code> property.<br>
     */
    public void setEquipmentWeight(final BigDecimal pEquipmentWeight) {
        equipmentWeight = pEquipmentWeight;
    }

    /**
     * Sets the <code>EquipmentWeightUOM</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>EquipmentWeightUOM</code> property.<br>
     */
    public void setEquipmentWeightUOM(final WeightUOMType pEquipmentWeightUOM) {
        equipmentWeightUOM = pEquipmentWeightUOM;
    }

    /**
     * Sets the <code>Goods</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>Goods</code> property.<br>
     */
    public void setGoods(final List<GoodsDto> pGoods) {
        goods = pGoods;
    }

    /**
     * Sets the <code>ImportContainerIndicator</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ImportContainerIndicator</code> property.<br>
     */
    public void setImportContainerIndicator(
                final boolean pImportContainerIndicator) {
        importContainerIndicator = pImportContainerIndicator;
    }

    public void setItemDisplayType(final ItemDisplayType itemDisplayType) {
        this.itemDisplayType = itemDisplayType;
    }

    /**
     * Sets the <code>MultiOffloadTCONIndicator</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>MultiOffloadTCONIndicator</code> property.<br>
     */
    public void setMultiOffloadTCONIndicator(
                final boolean pMultiOffloadTCONIndicator) {
        multiOffloadTCONIndicator = pMultiOffloadTCONIndicator;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>OId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        oId = pOId;
    }

    /**
     * Sets the <code>OperationalDetail</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>OperationalDetail</code> property.<br>
     */
    public void setOperationalDetail(
                final OperationalDetailDto pOperationalDetail) {
        operationalDetail = pOperationalDetail;
    }

    /**
     * Sets the <code>OperationSegmentDto</code> property.
     * <p>
     * 
     * @param OperationSegmentDto
     *            the current value of the <code>OperationSegmentDto</code> property.<br>
     */
    public void setOperationSegmentDto(
                final OperationFlightSegmentDto pOperationSegmentDto) {
        operationSegmentDto = pOperationSegmentDto;
    }

    /**
     * Sets the <code>PermanentContour</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>PermanentContour</code> property.<br>
     */
    public void setPermanentContour(final String pPermanentContour) {
        permanentContour = pPermanentContour;
    }

    /**
     * Sets the <code>PermanentVolumeCapacity</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>PermanentVolumeCapacity</code> property.<br>
     */
    public void setPermanentVolumeCapacity(
                final BigDecimal pPermanentVolumeCapacity) {
        permanentVolumeCapacity = pPermanentVolumeCapacity;
    }

    /**
     * Sets the <code>PermanentVolumeCapacityUOM</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>PermanentVolumeCapacityUOM</code> property.<br>
     */
    public void setPermanentVolumeCapacityUOM(
                final VolumeUOMType pPermanentVolumeCapacityUOM) {
        permanentVolumeCapacityUOM = pPermanentVolumeCapacityUOM;
    }

    /**
     * Sets the <code>PermanentWeightCapacity</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>PermanentWeightCapacity</code> property.<br>
     */
    public void setPermanentWeightCapacity(
                final BigDecimal pPermanentWeightCapacity) {
        permanentWeightCapacity = pPermanentWeightCapacity;
    }

    /**
     * Sets the <code>PermanentWeightCapacityUOM</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>PermanentWeightCapacityUOM</code> property.<br>
     */
    public void setPermanentWeightCapacityUOM(
                final WeightUOMType pPermanentWeightCapacityUOM) {
        permanentWeightCapacityUOM = pPermanentWeightCapacityUOM;
    }

    /**
     * Sets the <code>PrepackIndicator</code> property.
     * <p>
     * 
     * @param pPrepackIndicator
     *            the current value of the <code>PrepackIndicator</code> property.<br>
     */
    public void setPrepackIndicator(final boolean pPrepackIndicator) {
        this.prepackIndicator = pPrepackIndicator;
    }

    /**
     * Sets the <code>ShipperLoadedULDIndicator</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ShipperLoadedULDIndicator</code> property.<br>
     */
    public void setShipperLoadedULDIndicator(
                final boolean pShipperLoadedULDIndicator) {
        shipperLoadedULDIndicator = pShipperLoadedULDIndicator;
    }

    /**
     * Sets the <code>TareWeight</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>TareWeight</code> property.<br>
     */
    public void setTareWeight(final BigDecimal pTareWeight) {
        tareWeight = pTareWeight;
    }

    /**
     * Sets the <code>TareWeightUOM</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>TareWeightUOM</code> property.<br>
     */
    public void setTareWeightUOM(final WeightUOMType pTareWeightUOM) {
        tareWeightUOM = pTareWeightUOM;
    }

    /**
     * Sets the value of the <code>uldBookingDetailsDto</code> property.
     * <p>
     * 
     * @param <code>uldBookingDetailsDto</code> Holds the new value of the <code>uldBookingDetailsDto</code>
     *        property.
     */
    public void setUldBookingDetailsDto(
                final ULDBookingDetailsDto pUldBookingDetailsDto) {
        this.uldBookingDetailsDto = pUldBookingDetailsDto;
    }

    /**
     * Sets the value of the <code>workOrderDto</code> property.
     * <p>
     * 
     * @param <code>workOrderDto</code> Holds the new value of the <code>workOrderDto</code> property.
     */
    public void setWorkOrderDto(final WorkOrderDto pWorkOrderDto) {
        this.workOrderDto = pWorkOrderDto;
    }

    public void setWorkOrderItemStatus(final String pWorkOrderItemStatus) {
        this.workOrderItemStatus = pWorkOrderItemStatus;
    }

    /**
     * Sets the value of the <code>workorderNumber</code> property.
     * <p>
     * 
     * @param <code>workorderNumber</code> Holds the new value of the <code>workorderNumber</code> property.
     */
    public void setWorkorderNumber(final Long pWorkorderNumber) {
        this.workorderNumber = pWorkorderNumber;
    }

    /**
     * Sets the value of the <code>workOrderOid</code> property.
     * <p>
     * 
     * @param <code>workOrderOid</code> Holds the new value of the <code>workOrderOid</code> property.
     */
    public void setWorkOrderOid(final Long pWorkOrderOid) {
        this.workOrderOid = pWorkOrderOid;
    }

    /**
     * Sets the value of the <code>workOrderStation</code> property.
     * <p>
     * 
     * @param <code>workOrderStation</code> Holds the new value of the <code>workOrderStation</code> property.
     */
    public void setWorkOrderStation(final String pWorkOrderStation) {
        this.workOrderStation = pWorkOrderStation;
    }

    /* AC415 begins*/
	/**
	 * @return the dangerousGoodsIndicator
	 */
	public boolean isDangerousGoodsIndicator() {
		return dangerousGoodsIndicator;
	}

	/**
	 * @param dangerousGoodsIndicator the dangerousGoodsIndicator to set
	 */
	public void setDangerousGoodsIndicator(boolean dangerousGoodsIndicator) {
		this.dangerousGoodsIndicator = dangerousGoodsIndicator;
	}

	/**
	 * @return the dgrGoodsStatusIndicator
	 */
	public String getDgrGoodsStatusIndicator() {
		return dgrGoodsStatusIndicator;
	}

	/**
	 * @param dgrGoodsStatusIndicator the dgrGoodsStatusIndicator to set
	 */
	public void setDgrGoodsStatusIndicator(String dgrGoodsStatusIndicator) {
		this.dgrGoodsStatusIndicator = dgrGoodsStatusIndicator;
	}

	/**
	 * @return the dgrGoodsLabelIndicator
	 */
	public String getDgrGoodsLabelIndicator() {
		return dgrGoodsLabelIndicator;
	}

	/**
	 * @param dgrGoodsLabelIndicator the dgrGoodsLabelIndicator to set
	 */
	public void setDgrGoodsLabelIndicator(String dgrGoodsLabelIndicator) {
		this.dgrGoodsLabelIndicator = dgrGoodsLabelIndicator;
	}
	
	/*AC415 ends**/
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
	 * @return the shipperLoadedULDIndicator
	 */
	public boolean isShipperLoadedULDIndicator() {
		return shipperLoadedULDIndicator;
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

}
