package com.unisys.trans.logistics.lms.awb.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.unisys.trans.logistics.lms.awb.constants.GoodsAssignmentType;


public class GoodsDto implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = -2888821369282403442L;

    private Integer lowerDeckContainers;

    private Integer lowerDeckPallets;

    private Integer shipmentPieces;

    private BigDecimal shipmentVolume;

    private BigDecimal shipmentWeight;

    private Integer upperDeckPallets;
    
    private Integer bookingSegmentId;
    private BigDecimal shipmentWeightVolumeRatio;
    private BigDecimal shipmentWeightPiecesRatio;
    
    //AC446 Code change - included variable
    /**
	 * Used to store the <code>goodsAssignmentType</code> attribute
	 */
    private GoodsAssignmentType goodsAssignmentType;
    
    /**
	 * @return the goodsAssignmentType
	 */
	public GoodsAssignmentType getGoodsAssignmentType() {
		return goodsAssignmentType;
	}
	/**
	 * @param pGoodsAssignmentType the goodsAssignmentType to set
	 */
	
	public void setGoodsAssignmentType(GoodsAssignmentType pGoodsAssignmentType) {
		this.goodsAssignmentType = pGoodsAssignmentType;
	}

    public Integer getLowerDeckContainers() {
        return lowerDeckContainers;
    }

    public Integer getLowerDeckPallets() {
        return lowerDeckPallets;
    }

    public Integer getShipmentPieces() {
        return shipmentPieces;
    }

    public BigDecimal getShipmentVolume() {
        return shipmentVolume;
    }

    public BigDecimal getShipmentWeight() {
        return shipmentWeight;
    }

    public Integer getUpperDeckPallets() {
        return upperDeckPallets;
    }

    public void setLowerDeckContainers(Integer lowerDeckContainers) {
        this.lowerDeckContainers = lowerDeckContainers;
    }
    
    public void setLowerDeckPallets(Integer lowerDeckPallets) {
        this.lowerDeckPallets = lowerDeckPallets;
    }
    
    public void setShipmentPieces(Integer shipmentPieces) {
        this.shipmentPieces = shipmentPieces;
    }
    
    public void setShipmentVolume(BigDecimal shipmentVolume) {
        this.shipmentVolume = shipmentVolume;
    }
    
    public void setShipmentWeight(BigDecimal shipmentWeight) {
        this.shipmentWeight = shipmentWeight;
    }
    
    public void setUpperDeckPallets(Integer upperDeckPallets) {
        this.upperDeckPallets = upperDeckPallets;
    }

    /**
     * @return the bookingSegmentId
     */
    public Integer getBookingSegmentId() {
        return bookingSegmentId;
    }

    /**
     * @param bookingSegmentId the bookingSegmentId to set
     */
    public void setBookingSegmentId(Integer bookingSegmentId) {
        this.bookingSegmentId = bookingSegmentId;
    }
	public BigDecimal getShipmentWeightVolumeRatio() {
		return shipmentWeightVolumeRatio;
	}

	public void setShipmentWeightVolumeRatio(BigDecimal shipmentWeightVolumneRatio) {
		this.shipmentWeightVolumeRatio = shipmentWeightVolumneRatio;
	}

	public BigDecimal getShipmentWeightPiecesRatio() {
		return shipmentWeightPiecesRatio;
	}

	public void setShipmentWeightPiecesRatio(BigDecimal shipmentWeightPiecesRatio) {
		this.shipmentWeightPiecesRatio = shipmentWeightPiecesRatio;
	}

    /**
	 * Used to store the <code>goodsAssignmentType</code> attribute
	 */
    private List<String> specialHandlingCodes;
    
    /**
	 * @return the specialHandlingCodes
	 */
	public List<String> getSpecialHandlingCodes() {
		return specialHandlingCodes;
	}
	/**
	 * @param specialHandlingCodes the specialHandlingCodes to set
	 */
	public void setSpecialHandlingCodes(List<String> specialHandlingCodes) {
		this.specialHandlingCodes = specialHandlingCodes;
	}
}
