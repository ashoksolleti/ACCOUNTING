/* ====================================== */
/* Copyright (c) 2015 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.ShipmentCapacityDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.GoodsStatusType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.CustomsStatusType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.CustomsSubStatusType;

/**
 * <code>HouseGoodsDto</code> class represents the HouseGoods information.
 * <p>
 * This contains the following attributes:<br/>
 * <li><code>capacityDto</code></li>
 * <li><code>customSubStatusCode</code></li>
 * <li><code>customsStatusType</code></li>
 * <li><code>discrepancyGoodsDto</code></li>
 * <li><code>ecaCompletedIndicator</code></li>
 * <li><code>goodsDto</code></li>
 * <li><code>goodsStatus</code></li>
 * <li><code>houseAWBIdentifier</code></li>
 * <li><code>oId</code></li>
 * <li><code>pendingCustomStatusCode</code></li>
 * <li><code>pendingCustomSubStatusCode</code></li>
 * <li><code>serialVersionUID</code></li>
 * <p>
 * 
 * @see com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto
 * @see com.unisys.trans.logistics.lms.framework.dto.ShipmentCapacityDto
 * @see com.unisys.trans.logistics.lms.framework.dto.constants.GoodsStatusType
 * @see com.unisys.trans.logistics.lms.framework.dto.constants.operation.CustomsStatusType
 * @see com.unisys.trans.logistics.lms.framework.dto.constants.operation.CustomsSubStatusType
 * 
 * @author Unisys
 * @version 1.0
 * @since 1.0
 */
public class HouseGoodsDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;
    
    private String codeRedIndicator;
    
    private String alertCodeColor;
    
    private String neverFoundIndicator;
    
    private String trackAndTraceIndicator;
    
    
    /**
     * Attribute to hold <code>customsStatusColor</code> property.
     */
    private String customsStatusColor;

    
    /**
	 * @return the customsStatusColor
	 */
	public String getCustomsStatusColor() {
		return customsStatusColor;
	}

	/**
	 * @param customsStatusColor the customsStatusColor to set
	 */
	public void setCustomsStatusColor(String customsStatusColor) {
		this.customsStatusColor = customsStatusColor;
	}

	/**
	 * @return the neverFoundIndicator
	 */
	public String getNeverFoundIndicator() {
		return neverFoundIndicator;
	}

	/**
	 * @param neverFoundIndicator the neverFoundIndicator to set
	 */
	public void setNeverFoundIndicator(String neverFoundIndicator) {
		this.neverFoundIndicator = neverFoundIndicator;
	}

	/**
	 * @return the trackAndTraceIndicator
	 */
	public String getTrackAndTraceIndicator() {
		return trackAndTraceIndicator;
	}

	/**
	 * @param trackAndTraceIndicator the trackAndTraceIndicator to set
	 */
	public void setTrackAndTraceIndicator(String trackAndTraceIndicator) {
		this.trackAndTraceIndicator = trackAndTraceIndicator;
	}

	/**
	 * @return the codeRedIndicator
	 */
	public String getCodeRedIndicator() {
		return codeRedIndicator;
	}

	/**
	 * @param codeRedIndicator the codeRedIndicator to set
	 */
	public void setCodeRedIndicator(String codeRedIndicator) {
		this.codeRedIndicator = codeRedIndicator;
	}

	/**
	 * @return the alertCodeColor
	 */
	public String getAlertCodeColor() {
		return alertCodeColor;
	}

	/**
	 * @param alertCodeColor the alertCodeColor to set
	 */
	public void setAlertCodeColor(String alertCodeColor) {
		this.alertCodeColor = alertCodeColor;
	}

	/**
     * Attribute to hold <code>Capacity</code> property.
     */
    private ShipmentCapacityDto capacityDto;

    /**
     * Attribute to hold <code>customsDetailedStatus</code> property.
     */
    private String customsDetailedStatus;
    
    /**
     * Attribute to hold <code>customsStatusType</code> property.
     */
    private CustomsStatusType customsStatusType;

    /**
     * Attribute to hold <code>customSubStatusCode</code> property.
     */
    private CustomsSubStatusType customSubStatusCode;

    /**
     * Attribute to hold <code>goodsOid</code> property.
     */
    private DiscrepancyGoodsDto discrepancyGoodsDto;

    /**
     * Attribute to hold <code>displayCustomsStatus</code> property.
     */
    private String displayCustomsStatus;

    /**
     * Attribute to hold <code>displayGoodsStatus</code> property.
     */
    private String displayGoodsStatus;

    /**
     * Attribute to hold <code>ecaCompletedIndicator</code> property.
     */
    private Boolean ecaCompletedIndicator;

    /**
     * Attribute to hold <code>goodsOid</code> property.
     */
    private GoodsDto goodsDto;

    /**
     * Attribute to hold <code>goodsStatus</code> property.
     */
    private GoodsStatusType goodsStatus;

    /**
     * Attribute to hold <code>HouseAWBIdentifier</code> property.
     */
    private String houseAWBIdentifier;

    /**
     * Attribute to hold <code>houseGoodsPiecesCleared</code> property.
     */
    private int houseGoodsPiecesCleared;

    /**
     * Attribute to hold <code>houseGoodsTransitControlFlag</code> property.
     */
    private String houseGoodsTransitControlFlag;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>pendingCustomStatusCode</code> property.
     */
    private CustomsStatusType pendingCustomStatusCode;
    
    /**
     * Attribute to hold <code>pendingCustomSubStatusCode</code> property.
     */
    private CustomsSubStatusType pendingCustomSubStatusCode;
    private BigDecimal totalHawbGrossWeight;

    /**
     * Attribute to hold the <code>totalHawbPieces</code> property.
     */
    private Long totalHawbPieces;
    public BigDecimal getTotalHawbGrossWeight() {
		return totalHawbGrossWeight;
	}

	public void setTotalHawbGrossWeight(BigDecimal totalHawbGrossWeight) {
		this.totalHawbGrossWeight = totalHawbGrossWeight;
	}

	public Long getTotalHawbPieces() {
		return totalHawbPieces;
	}

	public void setTotalHawbPieces(Long totalHawbPieces) {
		this.totalHawbPieces = totalHawbPieces;
	}

	/**
     * Gets the <code>Capacity</code> property.
     * <p>
     * 
     * @return the current value of the <code>Capacity</code> property.<br>
     */
    public ShipmentCapacityDto getCapacityDto() {
        if (this.capacityDto == null) {
            this.capacityDto = new ShipmentCapacityDto();
        }
        return this.capacityDto;
    }

    /**
     * Gets the value of the <code>customsDetailedStatus</code> property.
     * <p>
     *
     * @return Returns the current value of <code>customsDetailedStatus</code> property.
     */
    public String getCustomsDetailedStatus() {
        return customsDetailedStatus;
    }
    
    /**
     * Gets the <code>CustomsStatusType</code> property.
     * <p>
     * 
     * @return the current value of the <code>CustomsStatusType</code> property.<br>
     */
    public CustomsStatusType getCustomsStatusType() {
        return this.customsStatusType;
    }

    /**
     * Gets the value of the <code>customSubStatusCode</code> property.
     * <p>
     *
     * @return Returns the current value of <code>customSubStatusCode</code> property.
     */
    public CustomsSubStatusType getCustomSubStatusCode() {
        return customSubStatusCode;
    }

    /**
     * Gets the value of the <code>discrepancyGoodsDto</code> property.
     * <p>
     *
     * @return Returns the current value of <code>discrepancyGoodsDto</code> property.
     */
    public DiscrepancyGoodsDto getDiscrepancyGoodsDto() {
        return discrepancyGoodsDto;
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
     * Gets the value of the <code>ecaCompletedIndicator</code> property.
     * <p>
     *
     * @return Returns the current value of <code>ecaCompletedIndicator</code> property.
     */
    public Boolean getEcaCompletedIndicator() {
        return ecaCompletedIndicator;
    }

    /**
     * Gets the <code>goodsDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>goodsDto</code> property.<br>
     */
    public GoodsDto getGoodsDto() {
        if (this.goodsDto == null) {
            this.goodsDto = new GoodsDto();
        }
        return goodsDto;
    }

    /**
     * Gets the value of the <code>goodsStatus</code> property.
     * <p>
     *
     * @return Returns the current value of <code>goodsStatus</code> property.
     */
    public GoodsStatusType getGoodsStatus() {
        return goodsStatus;
    }

    /**
     * Gets the <code>HouseAWBIdentifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>HouseAWBIdentifier</code> property.<br>
     */
    public String getHouseAWBIdentifier() {
        return this.houseAWBIdentifier;
    }

    /**
     * Gets the value of the <code>houseGoodsPiecesCleared</code> property.
     * <p>
     *
     * @return Returns the current value of <code>houseGoodsPiecesCleared</code> property.
     */
    public int getHouseGoodsPiecesCleared() {
        return houseGoodsPiecesCleared;
    }

    /**
     * Gets the value of the <code>houseGoodsTransitControlFlag</code> property.
     * <p>
     *
     * @return Returns the current value of <code>houseGoodsTransitControlFlag</code> property.
     */
    public String getHouseGoodsTransitControlFlag() {
        return houseGoodsTransitControlFlag;
    }

    /**
     * Gets the value of the <code>oId</code> property.
     * <p>
     *
     * @return Returns the current value of <code>oId</code> property.
     */
    public Long getoId() {
        return oId;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>OId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the value of the <code>pendingCustomStatusCode</code> property.
     * <p>
     *
     * @return Returns the current value of <code>pendingCustomStatusCode</code> property.
     */
    public CustomsStatusType getPendingCustomStatusCode() {
        return pendingCustomStatusCode;
    }

    /**
     * Gets the value of the <code>pendingCustomSubStatusCode</code> property.
     * <p>
     *
     * @return Returns the current value of <code>pendingCustomSubStatusCode</code> property.
     */
    public CustomsSubStatusType getPendingCustomSubStatusCode() {
        return pendingCustomSubStatusCode;
    }

    /**
     * Gets the value of the <code>ecaCompletedIndicator</code> property.
     * <p>
     *
     * @return Returns the current value of <code>ecaCompletedIndicator</code> property.
     */
    public Boolean isEcaCompletedIndicator() {
        return ecaCompletedIndicator;
    }

    /**
     * Sets the <code>Capacity</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>Capacity</code> property.<br>
     */
    public void setCapacityDto(final ShipmentCapacityDto pCapacityDto) {
        this.capacityDto = pCapacityDto;
    }

    /**
     * Sets the value of the <code>customsDetailedStatus</code> property.
     * <p>
     *
     * @param <code>customsDetailedStatus</code>
     *            Holds the new value of the <code>customsDetailedStatus</code> property.
     */
    public void setCustomsDetailedStatus(String customsDetailedStatus) {
        this.customsDetailedStatus = customsDetailedStatus;
    }

    /**
     * Sets the <code>CustomsStatusType</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>CustomsStatusType</code> property.<br>
     */
    public void setCustomsStatusType(final CustomsStatusType pCustomsStatusType) {
        this.customsStatusType = pCustomsStatusType;
    }

    /**
     * Sets the value of the <code>customSubStatusCode</code> property.
     * <p>
     *
     * @param <code>customSubStatusCode</code> Holds the new value of the <code>customSubStatusCode</code>
     *        property.
     */
    public void setCustomSubStatusCode(CustomsSubStatusType customSubStatusCode) {
        this.customSubStatusCode = customSubStatusCode;
    }

    /**
     * Sets the value of the <code>discrepancyGoodsDto</code> property.
     * <p>
     *
     * @param <code>discrepancyGoodsDto</code> Holds the new value of the <code>discrepancyGoodsDto</code>
     *        property.
     */
    public void setDiscrepancyGoodsDto(DiscrepancyGoodsDto discrepancyGoodsDto) {
        this.discrepancyGoodsDto = discrepancyGoodsDto;
    }

    /**
     * Sets the value of the <code>displayCustomsStatus</code> property.
     * <p>
     *
     * @param <code>displayCustomsStatus</code> Holds the new value of the <code>displayCustomsStatus</code>
     *        property.
     */
    public void setDisplayCustomsStatus(String displayCustomsStatus) {
        this.displayCustomsStatus = displayCustomsStatus;
    }

    /**
     * Sets the value of the <code>displayGoodsStatus</code> property.
     * <p>
     *
     * @param <code>displayGoodsStatus</code> Holds the new value of the <code>displayGoodsStatus</code>
     *        property.
     */
    public void setDisplayGoodsStatus(String displayGoodsStatus) {
        this.displayGoodsStatus = displayGoodsStatus;
    }

    /**
     * Sets the value of the <code>ecaCompletedIndicator</code> property.
     * <p>
     *
     * @param <code>ecaCompletedIndicator</code> Holds the new value of the <code>ecaCompletedIndicator</code>
     *        property.
     */
    public void setEcaCompletedIndicator(Boolean ecaCompletedIndicator) {
        this.ecaCompletedIndicator = ecaCompletedIndicator;
    }

    /**
     * Sets the <code>goodsDto</code> property.
     * <p>
     * 
     * @param goodsDto
     *            the current value of the <code>goodsDto</code> property.<br>
     */
    public void setGoodsDto(GoodsDto goodsDto) {
        this.goodsDto = goodsDto;
    }

    /**
     * Sets the value of the <code>goodsStatus</code> property.
     * <p>
     *
     * @param <code>goodsStatus</code> Holds the new value of the <code>goodsStatus</code> property.
     */
    public void setGoodsStatus(GoodsStatusType goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    /**
     * Sets the <code>HouseAWBIdentifier</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>HouseAWBIdentifier</code> property.<br>
     */
    public void setHouseAWBIdentifier(final String pHouseAWBIdentifier) {
        this.houseAWBIdentifier = pHouseAWBIdentifier;
    }

    /**
     * Sets the value of the <code>houseGoodsPiecesCleared</code> property.
     * <p>
     *
     * @param <code>houseGoodsPiecesCleared</code>
     *        Holds the new value of the <code>houseGoodsPiecesCleared</code> property.
     */
    public void setHouseGoodsPiecesCleared(int houseGoodsPiecesCleared) {
        this.houseGoodsPiecesCleared = houseGoodsPiecesCleared;
    }

    /**
     * Sets the value of the <code>houseGoodsTransitControlFlag</code> property.
     * <p>
     *
     * @param <code>houseGoodsTransitControlFlag</code>
     *        Holds the new value of the <code>houseGoodsTransitControlFlag</code> property.
     */
    public void setHouseGoodsTransitControlFlag(String houseGoodsTransitControlFlag) {
        this.houseGoodsTransitControlFlag = houseGoodsTransitControlFlag;
    }

    /**
     * Sets the value of the <code>oId</code> property.
     * <p>
     *
     * @param <code>oId</code> Holds the new value of the <code>oId</code> property.
     */
    public void setoId(Long oId) {
        this.oId = oId;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>OId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the value of the <code>pendingCustomStatusCode</code> property.
     * <p>
     *
     * @param <code>pendingCustomStatusCode</code> Holds the new value of the
     *        <code>pendingCustomStatusCode</code> property.
     */
    public void setPendingCustomStatusCode(CustomsStatusType pendingCustomStatusCode) {
        this.pendingCustomStatusCode = pendingCustomStatusCode;
    }

    /**
     * Sets the value of the <code>pendingCustomSubStatusCode</code> property.
     * <p>
     *
     * @param <code>pendingCustomSubStatusCode</code> Holds the new value of the
     *        <code>pendingCustomSubStatusCode</code> property.
     */
    public void setPendingCustomSubStatusCode(CustomsSubStatusType pendingCustomSubStatusCode) {
        this.pendingCustomSubStatusCode = pendingCustomSubStatusCode;
    }
}