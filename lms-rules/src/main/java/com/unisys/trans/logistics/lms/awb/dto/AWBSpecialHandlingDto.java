/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.awb.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.constants.OtherMeasureType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * The persistent class for the ARC_STATION database table.
 * 
 */
/**
 * @author 24609
 *
 */
public class AWBSpecialHandlingDto extends PersistenceObjectDto
{

    private static final long serialVersionUID = 1L;

   
    /**
     *  Special Handling code
     */
    private String code;

    private Long oId;
    
    private Integer pieces;
    
    /**
     * weight
     */
    private BigDecimal weight;
    
    private BigDecimal otherMeasure;
    
    private OtherMeasureType otherMeasureUnit;
    
    private WeightUOMType WeightUnit;
    
    private boolean restSPLUnNumberIndicator;
    
    private Integer currentQuantity;
    
    private Integer totalQuantity;
    
    private BigDecimal currentOtherMeasure;
    
    private BigDecimal totalOtherMeasure;
    
    private BigDecimal currentWeight;
    
    private BigDecimal totalWeight;
    private String flightNo;
    
    private List<String> restrictedSPLs;
    
    private Integer bookingSegmentId;
    

    private BigDecimal totalHumanAdultChildRemainsWeight;

    private Integer totalHumanAdultChildRemainsQuantity;

    private BigDecimal totalHumanAdultRemainsWeight;

    private Integer totalHumanAdultRemainsQuantity;

    private BigDecimal totalHumanChildRemainsWeight;

    private Integer totalHumanChildRemainsQuantity;

    private BigDecimal humanAdultChildRemainsWeight;

    private Integer humanAdultChildRemainsQuantity;

    private BigDecimal humanAdultRemainsWeight;

    private Integer humanAdultRemainsQuantity;

    private BigDecimal humanChildRemainsWeight;

    private Integer humanChildRemainsQuantity;

    private BigDecimal shipmentWeightHUMADPcsRatio;

    private BigDecimal shipmentWeightHUMCIPcsRatio;

    private BigDecimal shipmentWeightHUMCRPcsRatio;

    public AWBSpecialHandlingDto()
    {
    }

   

    public Long getOId()
    {
        return this.oId;
    }

    

    public void setOId(Long pOId)
    {
        this.oId = pOId;
    }



	/**
	 * @return the pieces
	 */
	public Integer getPieces() {
		if(this.pieces==null){
			this.pieces = new Integer(FrameworkConstants.ZERO);
		}
		return this.pieces;
	}



	/**
	 * @param pPieces the pieces to set
	 */
	public void setPieces(Integer pPieces) {
		this.pieces = pPieces;
	}



	/**
	 * @return the weight
	 */
	public BigDecimal getWeight() {
		if(this.weight==null){
			this.weight = new BigDecimal(FrameworkConstants.ZERO);
		}
		return this.weight;
	}



	/**
	 * @param pWeight the weight to set
	 */
	public void setWeight(BigDecimal pWeight) {
		this.weight = pWeight;
	}



	/**
	 * @return the otherMeasure
	 */
	public BigDecimal getOtherMeasure() {
		if(this.otherMeasure==null){
			this.otherMeasure = new BigDecimal(FrameworkConstants.ZERO);
		}
		return this.otherMeasure;
	}



	/**
	 * @param pOtherMeasure the otherMeasure to set
	 */
	public void setOtherMeasure(BigDecimal pOtherMeasure) {
		this.otherMeasure = pOtherMeasure;
	}



	/**
	 * @return the otherMeasureUnit
	 */
	public OtherMeasureType getOtherMeasureUnit() {
		return this.otherMeasureUnit;
	}



	/**
	 * @param pOtherMeasureUnit the otherMeasureUnit to set
	 */
	public void setOtherMeasureUnit(OtherMeasureType pOtherMeasureUnit) {
		this.otherMeasureUnit = pOtherMeasureUnit;
	}



	/**
	 * @return the restSPLUnNumberIndicator
	 */
	public boolean isRestSPLUnNumberIndicator() {
		return restSPLUnNumberIndicator;
	}



	/**
	 * @param restSPLUnNumberIndicator the restSPLUnNumberIndicator to set
	 */
	public void setRestSPLUnNumberIndicator(boolean restSPLUnNumberIndicator) {
		this.restSPLUnNumberIndicator = restSPLUnNumberIndicator;
	}



	/**
	 * @return the weightUnit
	 */
	public WeightUOMType getWeightUnit() {
		return this.WeightUnit;
	}



	/**
	 * @param weightUnit the weightUnit to set
	 */
	public void setWeightUnit(WeightUOMType pWeightUnit) {
		WeightUnit = pWeightUnit;
	}



	/**
	 * @return the code
	 */
	public String getCode() {
		return this.code;
	}



	/**
	 * @param code the code to set
	 */
	public void setCode(String pCode) {
		this.code = pCode;
	}



	/**
	 * @return the currentQuantity
	 */
	public Integer getCurrentQuantity() {
		if(this.currentQuantity==null){
			this.currentQuantity = new Integer(FrameworkConstants.ZERO);
		}
		return currentQuantity;
	}



	/**
	 * @param currentQuantity the currentQuantity to set
	 */
	public void setCurrentQuantity(Integer currentQuantity) {
		this.currentQuantity = currentQuantity;
	}



	/**
	 * @return the currentBreathingPoint
	 */
	public BigDecimal getCurrentOtherMeasure() {
		if(this.currentOtherMeasure==null){
			this.currentOtherMeasure = new BigDecimal(FrameworkConstants.ZERO);
		}
		return currentOtherMeasure;
	}



	/**
	 * @param currentBreathingPoint the currentBreathingPoint to set
	 */
	public void setCurrentOtherMeasure(BigDecimal currentOtherMeasure) {
		this.currentOtherMeasure = currentOtherMeasure;
	}



	/**
	 * @return the currentWeight
	 */
	public BigDecimal getCurrentWeight() {
		if(this.currentWeight==null){
			this.currentWeight = new BigDecimal(FrameworkConstants.ZERO);
		}
		return currentWeight;
	}



	/**
	 * @param currentWeight the currentWeight to set
	 */
	public void setCurrentWeight(BigDecimal currentWeight) {
		this.currentWeight = currentWeight;
	}



	/**
	 * @return the flightNo
	 */
	public String getFlightNo() {
		return flightNo;
	}



	/**
	 * @param flightNo the flightNo to set
	 */
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}



	/**
	 * @return the restrictedSPLs
	 */
	public List<String> getRestrictedSPLs() {
		if(this.restrictedSPLs==null){
			this.restrictedSPLs = new ArrayList<String>();
		}
		return restrictedSPLs;
	}



	/**
	 * @param restrictedSPLs the restrictedSPLs to set
	 */
	public void setRestrictedSPLs(List<String> restrictedSPLs) {
		this.restrictedSPLs = restrictedSPLs;
	}



	/**
	 * @return the totalBreathingPoint
	 */
	public BigDecimal getTotalOtherMeasure() {
		if(totalOtherMeasure==null){
			totalOtherMeasure = new BigDecimal(FrameworkConstants.ZERO);
		}
		return totalOtherMeasure;
	}



	/**
	 * @param totalBreathingPoint the totalBreathingPoint to set
	 */
	public void setTotalOtherMeasure(BigDecimal totalOtherMeasure) {
		this.totalOtherMeasure = totalOtherMeasure;
	}



	/**
	 * @return the totalQuantity
	 */
	public Integer getTotalQuantity() {
		if(totalQuantity==null){
			totalQuantity= new Integer(FrameworkConstants.ZERO);
		}
		return totalQuantity;
	}



	/**
	 * @param totalQuantity the totalQuantity to set
	 */
	public void setTotalQuantity(Integer totalQuantity) {
		this.totalQuantity = totalQuantity;
	}



	/**
	 * @return the totalWeight
	 */
	public BigDecimal getTotalWeight() {
		if(totalWeight==null){
			totalWeight = new BigDecimal(FrameworkConstants.ZERO);
		}
		return totalWeight;
	}



	/**
	 * @param totalWeight the totalWeight to set
	 */
	public void setTotalWeight(BigDecimal totalWeight) {
		this.totalWeight = totalWeight;
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

    /**
     * @return the totalHumanAdultChildRemainsWeight
     */
    public BigDecimal getTotalHumanAdultChildRemainsWeight() {
        return totalHumanAdultChildRemainsWeight;
    }

    /**
     * @param totalHumanAdultChildRemainsWeight the totalHumanAdultChildRemainsWeight to set
     */
    public void setTotalHumanAdultChildRemainsWeight(BigDecimal totalHumanAdultChildRemainsWeight) {
        this.totalHumanAdultChildRemainsWeight = totalHumanAdultChildRemainsWeight;
    }

    /**
     * @return the totalHumanAdultChildRemainsQuantity
     */
    public Integer getTotalHumanAdultChildRemainsQuantity() {
        return totalHumanAdultChildRemainsQuantity;
    }

    /**
     * @param totalHumanAdultChildRemainsQuantity the totalHumanAdultChildRemainsQuantity to set
     */
    public void setTotalHumanAdultChildRemainsQuantity(Integer totalHumanAdultChildRemainsQuantity) {
        this.totalHumanAdultChildRemainsQuantity = totalHumanAdultChildRemainsQuantity;
    }

    /**
     * @return the totalHumanAdultRemainsWeight
     */
    public BigDecimal getTotalHumanAdultRemainsWeight() {
        return totalHumanAdultRemainsWeight;
    }

    /**
     * @param totalHumanAdultRemainsWeight the totalHumanAdultRemainsWeight to set
     */
    public void setTotalHumanAdultRemainsWeight(BigDecimal totalHumanAdultRemainsWeight) {
        this.totalHumanAdultRemainsWeight = totalHumanAdultRemainsWeight;
    }

    /**
     * @return the totalHumanAdultRemainsQuantity
     */
    public Integer getTotalHumanAdultRemainsQuantity() {
        return totalHumanAdultRemainsQuantity;
    }

    /**
     * @param totalHumanAdultRemainsQuantity the totalHumanAdultRemainsQuantity to set
     */
    public void setTotalHumanAdultRemainsQuantity(Integer totalHumanAdultRemainsQuantity) {
        this.totalHumanAdultRemainsQuantity = totalHumanAdultRemainsQuantity;
    }

    /**
     * @return the totalHumanChildRemainsWeight
     */
    public BigDecimal getTotalHumanChildRemainsWeight() {
        return totalHumanChildRemainsWeight;
    }

    /**
     * @param totalHumanChildRemainsWeight the totalHumanChildRemainsWeight to set
     */
    public void setTotalHumanChildRemainsWeight(BigDecimal totalHumanChildRemainsWeight) {
        this.totalHumanChildRemainsWeight = totalHumanChildRemainsWeight;
    }

    /**
     * @return the totalHumanChildRemainsQuantity
     */
    public Integer getTotalHumanChildRemainsQuantity() {
        return totalHumanChildRemainsQuantity;
    }

    /**
     * @param totalHumanChildRemainsQuantity the totalHumanChildRemainsQuantity to set
     */
    public void setTotalHumanChildRemainsQuantity(Integer totalHumanChildRemainsQuantity) {
        this.totalHumanChildRemainsQuantity = totalHumanChildRemainsQuantity;
    }

    /**
     * @return the humanAdultChildRemainsWeight
     */
    public BigDecimal getHumanAdultChildRemainsWeight() {
        return humanAdultChildRemainsWeight;
    }

    /**
     * @param humanAdultChildRemainsWeight the humanAdultChildRemainsWeight to set
     */
    public void setHumanAdultChildRemainsWeight(BigDecimal humanAdultChildRemainsWeight) {
        this.humanAdultChildRemainsWeight = humanAdultChildRemainsWeight;
    }

    /**
     * @return the humanAdultChildRemainsQuantity
     */
    public Integer getHumanAdultChildRemainsQuantity() {
        return humanAdultChildRemainsQuantity;
    }

    /**
     * @param humanAdultChildRemainsQuantity the humanAdultChildRemainsQuantity to set
     */
    public void setHumanAdultChildRemainsQuantity(Integer humanAdultChildRemainsQuantity) {
        this.humanAdultChildRemainsQuantity = humanAdultChildRemainsQuantity;
    }

    /**
     * @return the humanAdultRemainsWeight
     */
    public BigDecimal getHumanAdultRemainsWeight() {
        return humanAdultRemainsWeight;
    }

    /**
     * @param humanAdultRemainsWeight the humanAdultRemainsWeight to set
     */
    public void setHumanAdultRemainsWeight(BigDecimal humanAdultRemainsWeight) {
        this.humanAdultRemainsWeight = humanAdultRemainsWeight;
    }

    /**
     * @return the humanAdultRemainsQuantity
     */
    public Integer getHumanAdultRemainsQuantity() {
        return humanAdultRemainsQuantity;
    }

    /**
     * @param humanAdultRemainsQuantity the humanAdultRemainsQuantity to set
     */
    public void setHumanAdultRemainsQuantity(Integer humanAdultRemainsQuantity) {
        this.humanAdultRemainsQuantity = humanAdultRemainsQuantity;
    }

    /**
     * @return the humanChildRemainsWeight
     */
    public BigDecimal getHumanChildRemainsWeight() {
        return humanChildRemainsWeight;
    }

    /**
     * @param humanChildRemainsWeight the humanChildRemainsWeight to set
     */
    public void setHumanChildRemainsWeight(BigDecimal humanChildRemainsWeight) {
        this.humanChildRemainsWeight = humanChildRemainsWeight;
    }

    /**
     * @return the humanChildRemainsQuantity
     */
    public Integer getHumanChildRemainsQuantity() {
        return humanChildRemainsQuantity;
    }

    /**
     * @param humanChildRemainsQuantity the humanChildRemainsQuantity to set
     */
    public void setHumanChildRemainsQuantity(Integer humanChildRemainsQuantity) {
        this.humanChildRemainsQuantity = humanChildRemainsQuantity;
    }

    /**
     * @return the shipmentWeightHUMADPcsRatio
     */
    public BigDecimal getShipmentWeightHUMADPcsRatio() {
        return shipmentWeightHUMADPcsRatio;
    }

    /**
     * @param shipmentWeightHUMADPcsRatio the shipmentWeightHUMADPcsRatio to set
     */
    public void setShipmentWeightHUMADPcsRatio(BigDecimal pShipmentWeightHUMADPcsRatio) {
        pShipmentWeightHUMADPcsRatio = this.shipmentWeightHUMADPcsRatio;
    }

    /**
     * @return the shipmentWeightHUMCIPcsRatio
     */
    public BigDecimal getShipmentWeightHUMCIPcsRatio() {
        return shipmentWeightHUMCIPcsRatio;
    }

    /**
     * @param shipmentWeightHUMCIPcsRatio the shipmentWeightHUMCIPcsRatio to set
     */
    public void setShipmentWeightHUMCIPcsRatio(BigDecimal pShipmentWeightHUMCIPcsRatio) {
        pShipmentWeightHUMCIPcsRatio = this.shipmentWeightHUMCIPcsRatio;
    }

    /**
     * @return the shipmentWeightHUMCRPcsRatio
     */
    public BigDecimal getShipmentWeightHUMCRPcsRatio() {
        return shipmentWeightHUMCRPcsRatio;
    }

    /**
     * @param shipmentWeightHUMCRPcsRatio the shipmentWeightHUMCRPcsRatio to set
     */
    public void setShipmentWeightHUMCRPcsRatio(BigDecimal pShipmentWeightHUMCRPcsRatio) {
        pShipmentWeightHUMCRPcsRatio = this.shipmentWeightHUMCRPcsRatio;
    }

   

}