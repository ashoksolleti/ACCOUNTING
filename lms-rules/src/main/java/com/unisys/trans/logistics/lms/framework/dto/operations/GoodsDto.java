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

import com.unisys.trans.logistics.lms.framework.constants.GoodsAssignmentType;
import com.unisys.trans.logistics.lms.framework.constants.ChecklistCompleteIndicatorType;
import com.unisys.trans.logistics.lms.framework.constants.ItemDisplayType;
import com.unisys.trans.logistics.lms.framework.dto.AirWaybillSpecialHandlingCodeDto;
import com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto;
import com.unisys.trans.logistics.lms.framework.dto.UNNumberDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.GoodsStatusType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.DispositionType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.ShipmentHistoryEventType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>GoodsDto</code> class represents the Goods information.
 *
 */
public class GoodsDto extends BaseGoodsDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>bookedFlightDate</code> property.
     */
    private Date bookedFlightDate;

    // DL638 starts
    /**
     * Attribute to hold <code>bookedFlightNumber</code> property.
     */
    private String bookedFlightNumber;

    public String getBookedFlightNumber() {
        return bookedFlightNumber;
    }
    public void setBookedFlightNumber(final String pBookedFlightNumber) {
        this.bookedFlightNumber = pBookedFlightNumber;
    }
    // DL638 ends

    /**
     * Attribute to hold <code>bookedFlightDto</code> property.
     */
    private BaseFlightDto bookedFlightDto;

    /**
     * Attribute to hold <code>bookedOffloadDto</code> property.
     */
    private OffloadDto bookedOffloadDto;

	/**
	 * Attribute to hold <code>bookedSplitIndicator</code> property.
	 */
    private boolean bookedSplitIndicator;




    private Integer shipmentPieces;
    
    
    private String acceptedPiecesDisplay;
    
    
    public String getAcceptedPiecesDisplay() {
		return acceptedPiecesDisplay;
	}
	public void setAcceptedPiecesDisplay(String acceptedPiecesDisplay) {
		this.acceptedPiecesDisplay = acceptedPiecesDisplay;
	}

	private int goodsPosition;

    public int getGoodsPosition() {
		return goodsPosition;
	}
	public void setGoodsPosition(int goodsPosition) {
		this.goodsPosition = goodsPosition;
	}
	/**
	 * @return the currentContour
	 */
	public String getCurrentContour() {
		return currentContour;
	}
	/**
	 * @param currentContour the currentContour to set
	 */
	public void setCurrentContour(String currentContour) {
		this.currentContour = currentContour;
	}
	/**
	 * @return the inputPieces
	 */
	public Integer getInputPieces() {
		return inputPieces;
	}
	/**
	 * @param inputPieces the inputPieces to set
	 */
	public void setInputPieces(Integer inputPieces) {
		this.inputPieces = inputPieces;
	}
	/**
	 * @return the goodsAssignmentType
	 */
	public GoodsAssignmentType getGoodsAssignmentType() {
		return goodsAssignmentType;
	}
	/**
	 * @param goodsAssignmentType the goodsAssignmentType to set
	 */
	public void setGoodsAssignmentType(GoodsAssignmentType goodsAssignmentType) {
		this.goodsAssignmentType = goodsAssignmentType;
	}
	/**
	 * @return the specialHandlingCodes
	 */
	public List<String> getSpecialHandlingCodes() {
	    if(this.specialHandlingCodes == null){
	        this.specialHandlingCodes = new ArrayList<String>();
	    }
	    while(this.specialHandlingCodes.size()<5){
	        this.specialHandlingCodes.add("");
	    }
		return specialHandlingCodes;
	}

	public String getSplDisplay(){
	    String splDisplay="";
	    if(this.specialHandlingCodes !=null && !this.specialHandlingCodes.isEmpty()){
	        StringBuilder aStringBuffer = new StringBuilder();
	        for(String spl:this.specialHandlingCodes){
	            if(!ContractUtility.isEmpty(spl)){
	                aStringBuffer.append(spl+",");
	            }
	        }
	        if(aStringBuffer.lastIndexOf(",") == aStringBuffer.length()-1){
	            splDisplay=aStringBuffer.substring(0, aStringBuffer.length()-1);
	        }else{
	            splDisplay=aStringBuffer.toString();
	        }
	    }
	    return splDisplay;
	}
	/**
	 * @param specialHandlingCodes the specialHandlingCodes to set
	 */
	public void setSpecialHandlingCodes(List<String> specialHandlingCodes) {
		this.specialHandlingCodes = specialHandlingCodes;
	}
	/**
	 * @param shipmentPieces the shipmentPieces to set
	 */
    private Integer upperDeckPallets;

    /**
     * Attribute to hold <code>containerEmptiedIndicator</code> property.
     */
    private boolean containerEmptiedIndicator;

    private BigDecimal shipmentWeight;

    private BigDecimal shipmentVolume;

    private String uldId;

  //UIS142B Changes starts here
    private String currentContour;
    private Integer inputPieces;

    //AC446 Code change - included variables
    /**
	 * Used to store the <code>goodsAssignmentType</code> attribute
	 */
    private GoodsAssignmentType goodsAssignmentType;
    /**
	 * Used to store the <code>goodsAssignmentType</code> attribute
	 */
    private List<String> specialHandlingCodes;

    public boolean isContainerEmptiedIndicator() {
		return containerEmptiedIndicator;
	}

	public void setContainerEmptiedIndicator(boolean containerEmptiedIndicator) {
		this.containerEmptiedIndicator = containerEmptiedIndicator;
	}

    /**
     * Attribute to hold <code>eventType</code> property.
     */
    private ShipmentHistoryEventType eventType;

	private int totalHouseGoodsPieces;

	 /**
     * Attribute to hold <code>fsuStatusTime</code> property.
     */
	private Date fsuStatusTime;

	private Date outgoingFSUTime;


    private boolean fsuNFDSentIndicator;

    private String statusCode;
    private String status;
    public boolean isFsuNFDSentIndicator() {
        return fsuNFDSentIndicator;
    }

    public void setFsuNFDSentIndicator(boolean fsuNFDSentIndicator) {
        this.fsuNFDSentIndicator = fsuNFDSentIndicator;
    }


	 /**
	 *
	 */
	private Date discrepancyCreationTimeStamp;
	public Date getDiscrepancyCreationTimeStamp() {
        return this.discrepancyCreationTimeStamp;
    }

    public void setDiscrepancyCreationTimeStamp(Date pDiscrepancyCreationTimeStamp) {
        this.discrepancyCreationTimeStamp = pDiscrepancyCreationTimeStamp;
    }

    /**
	 * Gets the value of the <code>eventType</code> property.
	 * <p>
	 *
	 * @return Returns the current value of <code>eventType</code> property.
	 */
    public ShipmentHistoryEventType getEventType() {
		return this.eventType;
	}

	/**
	 * Sets the <code>eventType</code> property.
	 * <p>
	 *
	 * @param pEventType
	 *            the current value of the <code>eventType</code> property.<br>
	 */
	public void setEventType(final ShipmentHistoryEventType pEventType) {
		this.eventType = pEventType;
	}

	/**
     * Attribute to hold <code>operationBookingSegmentDtos</code> property.
     */
    private List<CandidateBookingSegmentDto> candidateBookingSegmentDtos;

    /**
     * Attribute to hold <code>container</code> property.
     */
    private ContainerDto containerDto;

    /**
     * Attribute to hold <code>customsStatusColor</code> property.
     */
    private String customsStatusColor;

	/**
	 * Gets the value of the <code>isFSUInfoDetails</code> property.
	 * <p>
	 *
	 * @return Returns the current value of <code>isFSUInfoDetails</code>
	 *         property.
	 */
    public boolean isFsuInfoDetails() {
		return fsuInfoDetails;
	}

	/**
	 * Sets the <code>isFSUInfoDetails</code> property.
	 * <p>
	 *
	 * @param pIsFSUInfoDetails
	 *            the current value of the <code>isFSUInfoDetails</code>
	 *            property.<br>
	 */
	public void setFsuInfoDetails(final boolean pIsFSUInfoDetails) {
		this.fsuInfoDetails = pIsFSUInfoDetails;
	}

	/**
	 * Attribute to hold <code>displayColor</code> property.
	 */
	private String displayColor;

	/**
	 * Attribute to hold <code>isFSUInfoDetails</code> property.
	 */
    private boolean fsuInfoDetails;

    /**
     * Attribute to hold <code>displayCustomsStatus</code> property.
     */
    private String displayCustomsStatus;

    /**
     * Attribute to hold <code>displayGoodsStatus</code> property.
     */
    private String displayGoodsStatus;

    /**
     * Attribute to hold <code>goodsSpecialHandlingCode</code> property.
     */
    private List<String> goodsSpecialHandlingCode;

	/**
	 * Attribute to hold <code>goodsSplCodes</code> property.
	 */
    private String goodsSplCodes;

    /**
     * Attribute to hold <code>houseGoods</code> property.
     */
    private List<HouseGoodsDto> houseGoods;

    /**
     * Attribute to hold <code>inBoundDetailsDto</code> property.
     */
    private InBoundDetailsDto inBoundDetailsDto;

	/**
	 * Attribute to hold <code>itemDisplayType</code> property.
	 */
    private ItemDisplayType itemDisplayType;

    /**
     * Attribute to hold <code>nextDisposition</code> property.
     */
    private DispositionType nextDisposition;

	/**
	 * Attribute to hold <code>nextDisposition</code> property.
	 */
	private String nextDispositionCalculated;

    /**
     * Attribute to hold <code>nextFlightDate</code> property.
     */
    private Date nextFlightDate;

    /**
     * Attribute to hold <code>nextFlightDto</code> property.
     */
    private BaseFlightDto nextFlightDto;

    /**
     * Attribute to hold <code>nextOffloadDto</code> property.
     */
    private OffloadDto nextOffloadDto;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long OId;

    /**
     * Attribute to hold <code>operationFlightSegmentDto</code> property.
     */
    private OperationFlightSegmentDto operationFlightSegmentDto;

    /**
     * Attribute to hold <code>returnStatusIndicator</code> property indicates the response of the selected
     * entry is successful(1), failed(-1), or no response(0).
     */
    private int returnStatusIndicator;

    /**
	 * @return the statusCode
	 */
	/**
     * Attribute to holds <code>rowIndex</code> property.
     */
    private String rowIndex;

    /**
	 * Attribute to hold <code>shipmentDto</code> property.
	 */
    private ShipmentDto shipmentDto;

    /**
     * Attribute to Hold the<code>shipperLoaderULDType</code>
     */
    private String shipperLoaderULDType;

    /**
     * Attribute to hold the <code>splswithColorCodes</code> property.
     */
    private Map<String, String> splswithColorCodes = new HashMap<String, String>();

    /**
     * Attribute to hold <code>userDropOffTime</code> property.
     */
    private String userDropOffTime;

	/**
	 * Attribute to hold <code>workOrderItemStatus</code> property.
	 */
    private String workOrderItemStatus;

	/**
	 * Attribute to hold the <code> houseAssociationComplete</code> property.
	 */
	private String houseAssociationComplete;

	private BigDecimal houseGoodsWeight;

	private String noticeOfArrivalHTML;

    public String getNoticeOfArrivalHTML() {
        return noticeOfArrivalHTML;
    }

    public void setNoticeOfArrivalHTML(final String pNoticeOfArrivalHTML) {
        this.noticeOfArrivalHTML = pNoticeOfArrivalHTML;
    }

    /**
     * Gets the <code>BookedFlightDate</code> property.
     * <p>
     *
     * @return the current value of the <code>BookedFlightDate</code> property.<br>
     */
    public Date getBookedFlightDate() {
        if(bookedFlightDate!=null){
            return (Date)bookedFlightDate.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Gets the <code>bookedFlightDto</code> property.
     * <p>
     *
     * @return the current value of the <code>bookedFlightDto</code> property.<br>
     */
    public BaseFlightDto getBookedFlightDto() {
        if (bookedFlightDto == null) {
            bookedFlightDto = new BaseFlightDto();
        }
        return bookedFlightDto;
    }

    /**
     * Gets the <code>bookedOffloadDto</code> property.
     * <p>
     *
     * @return the current value of the <code>bookedOffloadDto</code> property.<br>
     */
    public OffloadDto getBookedOffloadDto() {
        if (bookedOffloadDto == null) {
            bookedOffloadDto = new OffloadDto();
        }
        return bookedOffloadDto;
    }

    /**
     * Gets the <code>operationBookingSegmentDtos</code> property.
     * <p>
     *
     * @return the current value of the <code>operationBookingSegmentDtos</code> property.<br>
     */
    public List<CandidateBookingSegmentDto> getCandidateBookingSegmentDtos() {
        if (candidateBookingSegmentDtos == null) {
            candidateBookingSegmentDtos = new ArrayList<CandidateBookingSegmentDto>();
        }
        return candidateBookingSegmentDtos;
    }

    /**
     * Gets the <code>Container</code> property.
     * <p>
     *
     * @return the current value of the <code>Container</code> property.<br>
     */
    public ContainerDto getContainerDto() {
        if (containerDto == null) {
            containerDto = new ContainerDto();
        }
        return containerDto;
    }

    /**
     * @return the customsStatusColor
     */
    public String getCustomsStatusColor() {
        return customsStatusColor;
    }

    /**
     * @return the displayColor
     */
    public String getDisplayColor() {
        return displayColor;
    }

    /**
     * Gets the value of the <code>displayCustomsStatus</code> property.
     * <p>
     *
     * @return Returns the current value of <code>displayCustomsStatus</code> property.
     */
    public String getDisplayCustomsStatus() {
        return displayCustomsStatus;
    }

    /**
     * Gets the value of the <code>displayGoodsStatus</code> property.
     * <p>
     *
     * @return Returns the current value of <code>displayGoodsStatus</code> property.
     */
    public String getDisplayGoodsStatus() {
        return displayGoodsStatus;
    }

    /**
     * Gets the <code>goodsSpecialHandlingCode</code> property.
     * <p>
     *
     * @return the current value of the <code>goodsSpecialHandlingCode</code> property.<br>
     */
    public List<String> getGoodsSpecialHandlingCode() {
        if (goodsSpecialHandlingCode == null) {
            goodsSpecialHandlingCode = new ArrayList<String>();
        }
        return goodsSpecialHandlingCode;
    }

    public String getGoodsSplCodes() {
        return goodsSplCodes;
    }

    /**
     * Gets the <code>inBoundDetailsDto</code> property.
     * <p>
     *
     * @return the current value of the <code>inBoundDetailsDto</code> property.<br>
     */
    public List<HouseGoodsDto> getHouseGoods() {
        if (houseGoods == null) {
            houseGoods = new ArrayList<HouseGoodsDto>();
        }
        return houseGoods;
    }

    /**
     * Gets the <code>inBoundDetailsDto</code> property.
     * <p>
     *
     * @return the current value of the <code>inBoundDetailsDto</code> property.<br>
     */
    public InBoundDetailsDto getInBoundDetailsDto() {
        if (inBoundDetailsDto == null) {
            inBoundDetailsDto = new InBoundDetailsDto();
        }
        return inBoundDetailsDto;
    }

    public ItemDisplayType getItemDisplayType() {
        return itemDisplayType;
    }

    /**
     * Gets the <code>nextDisposition</code> property.
     * <p>
     *
     * @return the current value of the <code>nextDisposition</code> property.<br>
     */
    public DispositionType getNextDisposition() {
        return nextDisposition;
    }

    /**
     * Gets the <code>nextFlightDate</code> property.
     * <p>
     *
     * @return the current value of the <code>nextFlightDate</code> property.<br>
     */
    public Date getNextFlightDate() {
        if(nextFlightDate!=null){
            return (Date)nextFlightDate.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Gets the <code>nextFlightDto</code> property.
     * <p>
     *
     * @return the current value of the <code>nextFlightDto</code> property.<br>
     */
    public BaseFlightDto getNextFlightDto() {
        if (nextFlightDto == null) {
            nextFlightDto = new BaseFlightDto();
        }
        return nextFlightDto;
    }

    /**
     * Gets the <code>nextOffloadDto</code> property.
     * <p>
     *
     * @return the current value of the <code>nextOffloadDto</code> property.<br>
     */
    public OffloadDto getNextOffloadDto() {
        if (nextOffloadDto == null) {
            nextOffloadDto = new OffloadDto();
        }
        return nextOffloadDto;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     *
     * @return the current value of the <code>OId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return OId;
    }

    /**
     * Gets the <code>operationSegmentDto</code> property.
     * <p>
     *
     * @return the current value of the <code>operationSegmentDto</code> property.<br>
     */
    public OperationFlightSegmentDto getOperationFlightSegmentDto() {
        if (operationFlightSegmentDto == null) {
            operationFlightSegmentDto = new OperationFlightSegmentDto();
        }
        return operationFlightSegmentDto;
    }

    /**
     * Gets the <code>ReturnStatusIndicator</code> property.
     * <p>
     *
     * @return the current value of the <code>returnStatusIndicator</code> property.<br>
     */
    public int getReturnStatusIndicator() {
        return returnStatusIndicator;
    }

    /**
     * Gets the <code>rowIndex</code> property.
     * <p>
     *
     * @return the current value of the <code>rowIndex</code> property.<br>
     */
    public String getRowIndex() {
        return rowIndex;
    }

    /**
     * Gets the <code>Shipment</code> property.
     * <p>
     *
     * @return the current value of the <code>Shipment</code> property.<br>
     */
    public ShipmentDto getShipmentDto() {
        if (shipmentDto == null) {
            shipmentDto = new ShipmentDto();
        }
        return shipmentDto;
    }

    /**
     * Gets the <code>shipperLoaderULDType</code>.
     * <p>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     *
     * @return <code>shipperLoaderULDType</code><br>
     *         Returns the <code>shipperLoaderULDType</code>.
     *         </p>
     */
    public String getShipperLoaderULDType() {
		return this.shipperLoaderULDType;
    }

    /**
     * @return the splswithColorCodes
     */
    public Map<String, String> getSplswithColorCodes() {
		return this.splswithColorCodes;
    }

    /**
     * Gets the <code>userDropOffTime</code> property.
     * <p>
     *
     * @return the current value of the <code>userDropOffTime</code> property.<br>
     */
    public String getUserDropOffTime() {
		return this.userDropOffTime;
    }

	/**
	 * Gets the <code>workOrderItemStatus</code> property.
	 * <p>
	 *
	 * @return the current value of the <code>workOrderItemStatus</code>
	 *         property.<br>
	 */
    public String getWorkOrderItemStatus() {
		return this.workOrderItemStatus;
    }

	/**
	 * Gets the <code>isBookedSplitIndicator</code> property.
	 * <p>
	 *
	 * @return the current value of the <code>bookedSplitIndicator</code>
	 *         property.<br>
	 */
    public boolean isBookedSplitIndicator() {
		return this.bookedSplitIndicator;
    }

    /**
     * Sets the <code>BookedFlightDate</code> property.
     * <p>
     *
     * @param BookedFlightDate
     *            the current value of the <code>BookedFlightDate</code> property.<br>
     */
	public void setBookedFlightDate(final Date pBookedFlightDate) {
		if(pBookedFlightDate!=null){
	    	this.bookedFlightDate =(Date) pBookedFlightDate.clone();
	      }
		else
		{
			this.bookedFlightDate=null;
		}
    }

    /**
	 * Sets the <code>bookedFlightDto</code> property.
	 * <p>
	 *
	 * @param pBookedFlightDto
	 *            the current value of the <code>bookedFlightDto</code>
	 *            property.<br>
	 */
	public void setBookedFlightDto(final BaseFlightDto pBookedFlightDto) {
		this.bookedFlightDto = pBookedFlightDto;
    }

    /**
	 * Sets the <code>bookedOffloadDto</code> property.
	 * <p>
	 *
	 * @param pBookedOffloadDto
	 *            the current value of the <code>bookedOffloadDto</code>
	 *            property.<br>
	 */
	public void setBookedOffloadDto(final OffloadDto pBookedOffloadDto) {
		this.bookedOffloadDto = pBookedOffloadDto;
    }

	public void setBookedSplitIndicator(final boolean pBookedSplitIndicator) {
		this.bookedSplitIndicator = pBookedSplitIndicator;
    }

    /**
     * Sets the <code>operationBookingSegmentDtos</code> property.
     * <p>
     *
     * @param operationBookingSegmentDtos
     *            the current value of the <code>operationBookingSegmentDtos</code> property.<br>
     */
	public void setCandidateBookingSegmentDtos(
			final List<CandidateBookingSegmentDto> pCandidateBookingSegmentDtos) {
		this.candidateBookingSegmentDtos = pCandidateBookingSegmentDtos;
    }

    /**
	 * Sets the <code>Container</code> property.
	 * <p>
	 *
	 * @param pContainerDto
	 *            the current value of the <code>Container</code> property.<br>
	 */
    public void setContainerDto(final ContainerDto pContainerDto) {
        containerDto = pContainerDto;
    }

    /**
	 * @param pCustomsStatusColor
	 *            the customsStatusColor to set
	 */
	public void setCustomsStatusColor(final String pCustomsStatusColor) {
		this.customsStatusColor = pCustomsStatusColor;
    }

    /**
	 * @param pDisplayColor
	 *            the displayColor to set
	 */
	public void setDisplayColor(final String pDisplayColor) {
		this.displayColor = pDisplayColor;
    }

    /**
     * Sets the value of the <code>displayCustomsStatus</code> property.
     * <p>
     *
     * @param <code>displayCustomsStatus</code> Holds the new value of the <code>displayCustomsStatus</code>
     *        property.
     */
	public void setDisplayCustomsStatus(final String pDisplayCustomsStatus) {
		this.displayCustomsStatus = pDisplayCustomsStatus;
    }

    /**
     * Sets the value of the <code>displayGoodsStatus</code> property.
     * <p>
     *
     * @param <code>displayGoodsStatus</code> Holds the new value of the <code>displayGoodsStatus</code>
     *        property.
     */
	public void setDisplayGoodsStatus(final String pDisplayGoodsStatus) {
		this.displayGoodsStatus = pDisplayGoodsStatus;
    }

    /**
     * Sets the <code>goodsSpecialHandlingCode</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>goodsSpecialHandlingCode</code> property.<br>
     */
	public void setGoodsSpecialHandlingCode(
			final List<String> pGoodsSpecialHandlingCode) {
		this.goodsSpecialHandlingCode = pGoodsSpecialHandlingCode;
    }

	/**
	 * Sets the <code>goodsSplCodes</code> property.
	 * <p>
	 *
	 * @param pGoodsSplCodes
	 *            the current value of the <code>goodsSplCodes</code> property.<br>
	 */
    public void setGoodsSplCodes(final String pGoodsSplCodes) {
        goodsSplCodes = pGoodsSplCodes;
    }

    /**
     * Sets the <code>inBoundDetailsDto</code> property.
     * <p>
     *
     * @param inBoundDetailsDto
     *            the current value of the <code>inBoundDetailsDto</code> property.<br>
     */
	public void setHouseGoods(final List<HouseGoodsDto> pHouseGoods) {
		this.houseGoods = pHouseGoods;
    }

    /**
	 * Sets the <code>inBoundDetailsDto</code> property.
	 * <p>
	 *
	 * @param pInBoundDetailsDto
	 *            the current value of the <code>inBoundDetailsDto</code>
	 *            property.<br>
	 */
	public void setInBoundDetailsDto(final InBoundDetailsDto pInBoundDetailsDto) {
		this.inBoundDetailsDto = pInBoundDetailsDto;
    }

    /**
	 * Sets the <code>itemDisplayType</code> property.
	 * <p>
	 *
	 * @param pItemDisplayType
	 *            the current value of the <code>itemDisplayType</code>
	 *            property.<br>
	 */
	public void setItemDisplayType(final ItemDisplayType pItemDisplayType) {
		this.itemDisplayType = pItemDisplayType;
    }

    /**
	 * Sets the <code>nextDisposition</code> property.
	 * <p>
	 *
	 * @param pNextDisposition
	 *            the current value of the <code>nextDisposition</code>
	 *            property.<br>
	 */
	public void setNextDisposition(final DispositionType pNextDisposition) {
		this.nextDisposition = pNextDisposition;
    }

    /**
     * Sets the <code>nextFlightDate</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>nextFlightDate</code> property.<br>
     */
	public void setNextFlightDate(final Date pNextFlightDate) {
		if(pNextFlightDate!=null){
	    	this.nextFlightDate =(Date) pNextFlightDate.clone();
	      }
		else
		{
			this.nextFlightDate=null;
		}
    }

    /**
     * Sets the <code>NextFlightDto</code> property.
     * <p>
     *
     * @param pNextFlightDto
     *            the current value of the <code>nextFlightDto</code> property.<br>
     */
    public void setNextFlightDto(final BaseFlightDto pNextFlightDto) {
        this.nextFlightDto = pNextFlightDto;
    }

    /**
	 * Sets the <code>OffloadDto</code> property.
	 * <p>
	 *
	 * @param pNextOffloadDto
	 *            the current value of the <code>nextOffloadDto</code> property.<br>
	 */
	public void setNextOffloadDto(final OffloadDto pNextOffloadDto) {
		this.nextOffloadDto = pNextOffloadDto;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>OId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        OId = pOId;
    }

    /**
     * Sets the <code>operationSegmentDto</code> property.
     * <p>
     *
     * @param operationSegmentDto
     *            the current value of the <code>operationSegmentDto</code> property.<br>
     */
	public void setOperationFlightSegmentDto(
			final OperationFlightSegmentDto pOperationFlightSegmentDto) {
		this.operationFlightSegmentDto = pOperationFlightSegmentDto;
    }

    /**
     * Sets the <code>ReturnStatusIndicator</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>returnStatusIndicator</code> property.<br>
     */
	public void setReturnStatusIndicator(final int pReturnStatusIndicator) {
		this.returnStatusIndicator = pReturnStatusIndicator;
    }

    /**
     * Sets the <code>rowIndex</code> property.
     * <p>
     *
     * @param pRowIndex
     *            the new value of the <code>rowIndex</code> property.
     */
    public void setRowIndex(final String pRowIndex) {
        rowIndex = pRowIndex;
    }

    /**
     * Sets the <code>Shipment</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>Shipment</code> property.<br>
     */
    public void setShipmentDto(final ShipmentDto pShipmentDto) {
        shipmentDto = pShipmentDto;
    }

    /**
	 * Sets the value of the <code>shipperLoaderULDType</code> property.
	 * <b>Release Notes:</b> <br>
	 * <table border="1" cellspacing="0" cellpadding="5" width="80%">
	 * <tr>
	 * <th align="left">Release</th>
	 * <th align="left">Notes</th>
	 * </tr>
	 * <tr>
	 * <td>
	 *
	 * @since 1.0</td> <td>&nbsp;</td>
	 *        </tr>
	 *        </table>
	 *        <p>
	 * @param pShipperLoaderULDType
	 *            Input shipperLoaderULDType<br>
	 */
	public void setShipperLoaderULDType(final String pShipperLoaderULDType) {
		this.shipperLoaderULDType = pShipperLoaderULDType;
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
     * Sets the <code>userDropOffTime</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>userDropOffTime</code> property.<br>
     */
	public void setUserDropOffTime(final String pUserDropOffTime) {
		this.userDropOffTime = pUserDropOffTime;
    }

	/**
	 * Sets the <code>workOrderItemStatus</code> property.
	 * <p>
	 *
	 * @param pWorkOrderItemStatus
	 *            the current value of the <code>workOrderItemStatus</code>
	 *            property.<br>
	 */
	public void setWorkOrderItemStatus(final String pWorkOrderItemStatus) {
		this.workOrderItemStatus = pWorkOrderItemStatus;
    }

	/**
	 * @return the houseAssociationComplete
	 */
	public String getHouseAssociationComplete() {
		return this.houseAssociationComplete;
	}

	/**
	 * @param pHouseAssociationComplete
	 *            the houseAssociationComplete to set
	 */
	public void setHouseAssociationComplete(
			final String pHouseAssociationComplete) {
		this.houseAssociationComplete = pHouseAssociationComplete;
	}

	/**
	 * @return the nextDispositionCalculated
	 */
	public String getNextDispositionCalculated() {
		return this.nextDispositionCalculated;
	}

	/**
	 * @param pNextDispositionCalculated
	 *            the nextDispositionCalculated to set
	 */
	public void setNextDispositionCalculated(
			final String pNextDispositionCalculated) {
		this.nextDispositionCalculated = pNextDispositionCalculated;
	}

	/**
	 * @return the totalHouseGoodsPieces
	 */
	public int getTotalHouseGoodsPieces() {
		return this.totalHouseGoodsPieces;
	}

	/**
	 * @param pTotalHouseGoodsPieces
	 *            the totalHouseGoodsPieces to set
	 */
	public void setTotalHouseGoodsPieces(final int pTotalHouseGoodsPieces) {
		this.totalHouseGoodsPieces = pTotalHouseGoodsPieces;
	}

	/**
	 * @return the houseGoodsWeight
	 */
	public BigDecimal getHouseGoodsWeight() {
		return houseGoodsWeight;
	}

	/**
	 * @param houseGoodsWeight the houseGoodsWeight to set
	 */
	public void setHouseGoodsWeight(BigDecimal houseGoodsWeight) {
		this.houseGoodsWeight = houseGoodsWeight;
	}

    /**
     * @return the fsuStatusTime
     */
    public Date getFsuStatusTime() {
        return this.fsuStatusTime;
    }

    /**
     * @param fsuStatusTime the fsuStatusTime to set
     */
    public void setFsuStatusTime(Date pFsuStatusTime) {
        this.fsuStatusTime = pFsuStatusTime;
    }

    /**
     * @return the outgoingFSUTime
     */
    public Date getOutgoingFSUTime() {
        return outgoingFSUTime;
    }

    /**
     * @param outgoingFSUTime the outgoingFSUTime to set
     */
    public void setOutgoingFSUTime(Date outgoingFSUTime) {
        this.outgoingFSUTime = outgoingFSUTime;
    }

    /**
     * Attribute to hold the <code>dropofftime</code> property.
     */
    private boolean dropofftime;

    public boolean isDropofftime() {
        return this.dropofftime;
    }

    public void setDropofftime(boolean pDropofftime) {
        this.dropofftime = pDropofftime;
    }

	// RFC CPS147 Start
	/**
	 * Attribute to hold the <code>awbHandlingRemarks</code> property.
	 */
	private String awbHandlingRemarks;
	//DL619 start
	/**
     * Attribute to hold the <code> checklistCompleteIndicatorType </code> property
     */
    private ChecklistCompleteIndicatorType checklistCompleteIndicatorType = ChecklistCompleteIndicatorType.NO;
    /**
     * Attribute to hold the <code> goodsStatusChangeType </code> property
     */
    private GoodsStatusType goodsStatusChangeType;
    //DL619 end

	public String getAwbHandlingRemarks() {
		return awbHandlingRemarks;
	}

	public void setAwbHandlingRemarks(String awbHandlingRemarks) {
		if(awbHandlingRemarks!=null && !awbHandlingRemarks.isEmpty()){
		this.awbHandlingRemarks = ContractUtility.convertToTitlecase(awbHandlingRemarks);
		}
	}
	// RFC CPS147 End
	//DL619 start
	/**
	 * @return the checklistCompleteIndicatorType
	 */
	public ChecklistCompleteIndicatorType getChecklistCompleteIndicatorType() {
		return checklistCompleteIndicatorType;
	}

	/**
	 * @param checklistCompleteIndicatorType the checklistCompleteIndicatorType to set
	 */
	public void setChecklistCompleteIndicatorType(
			ChecklistCompleteIndicatorType checklistCompleteIndicatorType) {
		this.checklistCompleteIndicatorType = checklistCompleteIndicatorType;
	}

	/**
	 * @return the goodsStatusChangeType
	 */
	public GoodsStatusType getGoodsStatusChangeType() {
		return goodsStatusChangeType;
	}

	/**
	 * @param goodsStatusChangeType the goodsStatusChangeType to set
	 */
	public void setGoodsStatusChangeType(GoodsStatusType goodsStatusChangeType) {
		this.goodsStatusChangeType = goodsStatusChangeType;
	}
	//DL619 end

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

		private List<UNNumberDto> unNumberCodes = new ArrayList<UNNumberDto>();

		/**
		 * @return the unNumberCodes
		 */
		public List<UNNumberDto> getUnNumberCodes() {
			return unNumberCodes;
		}
		/**
		 * @param unNumberCodes the unNumberCodes to set
		 */
		public void setUnNumberCodes(List<UNNumberDto> unNumberCodes) {
			this.unNumberCodes = unNumberCodes;
		}
		private Integer lowerDeckPallets;

		private Integer lowerDeckContainers;

		public BigDecimal getShipmentWeight() {
			return shipmentWeight;
		}

		public void setShipmentWeight(BigDecimal shipmentWeight) {
			this.shipmentWeight = shipmentWeight;
		}

		public BigDecimal getShipmentVolume() {
			return shipmentVolume;
		}

		public void setShipmentVolume(BigDecimal shipmentVolume) {
			this.shipmentVolume = shipmentVolume;
		}

		public String getUldId() {
			return uldId;
		}

		public void setUldId(String uldId) {
			this.uldId = uldId;
		}

		public Integer getShipmentPieces() {
			return shipmentPieces;
		}

		public void setShipmentPieces(Integer shipmentPieces) {
			this.shipmentPieces = shipmentPieces;
		}

		public Integer getUpperDeckPallets() {
			return upperDeckPallets;
		}

		public void setUpperDeckPallets(Integer upperDeckPallets) {
			this.upperDeckPallets = upperDeckPallets;
		}

		public Integer getLowerDeckPallets() {
			return lowerDeckPallets;
		}

		public void setLowerDeckPallets(Integer lowerDeckPallets) {
			this.lowerDeckPallets = lowerDeckPallets;
		}

		public Integer getLowerDeckContainers() {
			return lowerDeckContainers;
		}

		public void setLowerDeckContainers(Integer lowerDeckContainers) {
			this.lowerDeckContainers = lowerDeckContainers;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStatusCode() {
			return statusCode;
		}

		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}

		private boolean acceptedIndicator;

        public boolean isAcceptedIndicator() {
            return acceptedIndicator;
        }
        public void setAcceptedIndicator(final boolean pAcceptedIndicator) {
            this.acceptedIndicator = pAcceptedIndicator;
        }
		private boolean delayIndicator;

        public boolean isDelayIndicator() {
            return delayIndicator;
        }
        public void setDelayIndicator(boolean pDelayIndicator) {
            this.delayIndicator = pDelayIndicator;
        }

        public boolean isEmpty(){
            return (this.uldId==null || this.uldId.isEmpty())
                        && this.shipmentWeight == null
                        && this.shipmentVolume == null;
        }

     private String uldPositionType;

    public String getUldPositionType() {
        return uldPositionType;
    }
    public void setUldPositionType(final String pUldPositionType) {
        this.uldPositionType = pUldPositionType;
    }

}
