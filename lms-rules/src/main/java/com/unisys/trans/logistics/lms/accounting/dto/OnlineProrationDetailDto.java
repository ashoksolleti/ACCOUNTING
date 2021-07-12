package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ProrationType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class OnlineProrationDetailDto extends PersistenceObjectDto {

    /**
     * Unique Serial Version
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>carrierRevenue</code> property.
     */
    private BigDecimal carrierRevenue;

    /**
     * Attribute to hold <code>chargeableWeight</code> property.
     */
    private BigDecimal chargeableWeight;
    
    private BigDecimal weightCharge;

    public BigDecimal getWeightCharge() {
		return weightCharge;
	}

	public void setWeightCharge(BigDecimal weightCharge) {
		this.weightCharge = weightCharge;
	}

	/**
     * Attribute to hold <code>segmentOrigin</code> property.
     */
    private String flightNumber;

    /**
     * Attribute to hold <code>deletionDate</code> property.
     */
    private Date flightDate;

    /**
     * Attribute to hold <code>grossWeight</code> property.
     */
    private BigDecimal grossWeight;

    private boolean hostCarrierIndicator;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>commodityRule</code> property.
     */
    private ProrationType onlineProrationReasonCode;

    /**
     * Attribute to hold <code>grossWeight</code> property.
     */
    private BigDecimal percentageOfSegmentMileage;

    /**
     * Attribute to hold <code>grossWeight</code> property.
     */
    private Integer pieces;

    /**
     * Attribute to hold <code>grossWeight</code> property.
     */
    private BigDecimal proratedChargeableWeight;

    /**
     * Attribute to hold <code>carrier</code> property.
     */
    private String segmentDestination;

    /**
     * Attribute to hold <code>grossWeight</code> property.
     */
    private BigDecimal segmentMileage;

    /**
     * Attribute to hold <code>carrier</code> property.
     */
    private String segmentOrigin;

    /**
     * Attribute to hold <code>grossWeight</code> property.
     */
    private BigDecimal segmentYield;
    
    /**
     * Attribute to hold <code>grossWeight</code> property.
     */
    private String carrierCode;

    /**
     * The <code>getOnlineProrationReasonCode</code> method returns the string value of
     * <code>onlineProrationReasonCode</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>onlineProrationReasonCode</code>.<br>
     */
    public BigDecimal getCarrierRevenue() {
        return this.carrierRevenue;
    }

    /**
     * The <code>getOnlineProrationReasonCode</code> method returns the string value of
     * <code>onlineProrationReasonCode</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>onlineProrationReasonCode</code>.<br>
     */
    public BigDecimal getChargeableWeight() {
        return this.chargeableWeight;
    }

   

    /**
     * The <code>getOnlineProrationReasonCode</code> method returns the string value of
     * <code>onlineProrationReasonCode</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>onlineProrationReasonCode</code>.<br>
     */
    public Date getFlightDate() {
        return ContractUtility.getClonedDate(this.flightDate);
        
    }

    /**
     * The <code>getOnlineProrationReasonCode</code> method returns the string value of
     * <code>onlineProrationReasonCode</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>onlineProrationReasonCode</code>.<br>
     */
    public BigDecimal getGrossWeight() {
        return this.grossWeight;
    }

    /**
     * The <code>getOId</code> method returns the string value of <code>Long</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>oId</code>.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * The <code>getOnlineProrationReasonCode</code> method returns the string value of
     * <code>ProrationType</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>onlineProrationReasonCode</code>.<br>
     */
    public ProrationType getOnlineProrationReasonCode() {
        return this.onlineProrationReasonCode;
    }

    /**
     * The <code>getPercentageOfTotalMileage</code> method returns the string value of <code>BigDecimal</code>
     * .
     * <p>
     * 
     * @return the current enumerated value of the <code>onlineProrationReasonCode</code>.<br>
     */
    public BigDecimal getPercentageOfSegmentMileage() {
        return this.percentageOfSegmentMileage;
    }

    /**
     * The <code>getPieces</code> method returns the string value of <code>Integer</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>pieces</code>.<br>
     */
    public Integer getPieces() {
        return this.pieces;
    }

    /**
     * The <code>getProratedChargeableWeight</code> method returns the string value of <code>BigDecimal</code>
     * .
     * <p>
     * 
     * @return the current enumerated value of the <code>proratedChargeableWeight</code>.<br>
     */
    public BigDecimal getProratedChargeableWeight() {
        return this.proratedChargeableWeight;
    }

    /**
     * The <code>getSegmentDestination</code> method returns the string value of <code>String</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>segmentDestination</code>.<br>
     */
    public String getSegmentDestination() {
        return this.segmentDestination;
    }

    /**
     * The <code>getSegmentMileage</code> method returns the string value of <code>BigDecimal</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>segmentMileage</code>.<br>
     */
    public BigDecimal getSegmentMileage() {
        return this.segmentMileage;
    }

    /**
     * The <code>getSegmentOrigin</code> method returns the string value of <code>String</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>segmentOrigin</code>.<br>
     */
    public String getSegmentOrigin() {
        return this.segmentOrigin;
    }

    /**
     * The <code>getSegmentYield</code> method returns the string value of <code>BigDecimal</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>hostCarrierIndicator</code>.<br>
     */
    public BigDecimal getSegmentYield() {
        return this.segmentYield;
    }

    /**
     * The <code>isHostCarrierIndicator</code> method returns the string value of <code>boolean</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>hostCarrierIndicator</code>.<br>
     */
    public boolean isHostCarrierIndicator() {
        return this.hostCarrierIndicator;
    }

    /**
     * Sets the <code>carrierRevenue</code> property.
     * <p>
     * 
     * @param pCarrierRevenue
     *            the new value of the <code>carrierRevenue</code> property.
     */
    public void setCarrierRevenue(final BigDecimal pCarrierRevenue) {
        this.carrierRevenue = pCarrierRevenue;
    }

    /**
     * Sets the <code>chargeableWeight</code> property.
     * <p>
     * 
     * @param pChargeableWeight
     *            the new value of the <code>chargeableWeight</code> property.
     */
    public void setChargeableWeight(final BigDecimal pChargeableWeight) {
        this.chargeableWeight = pChargeableWeight;
    }

    

    /**
     * Sets the <code>flightDate</code> property.
     * <p>
     * 
     * @param pFlightDate
     *            the new value of the <code>flightDate</code> property.
     */
    public void setFlightDate(final Date pFlightDate) {
        this.flightDate = ContractUtility.getClonedDate(pFlightDate); 
    }

    /**
     * Sets the <code>grossWeight</code> property.
     * <p>
     * 
     * @param pGrossWeight
     *            the new value of the <code>grossWeight</code> property.
     */
    public void setGrossWeight(final BigDecimal pGrossWeight) {
        this.grossWeight = pGrossWeight;
    }

    /**
     * Sets the <code>hostCarrierIndicator</code> property.
     * <p>
     * 
     * @param pHostCarrierIndicator
     *            the new value of the <code>hostCarrierIndicator</code> property.
     */
    public void setHostCarrierIndicator(final boolean pHostCarrierIndicator) {
        this.hostCarrierIndicator = pHostCarrierIndicator;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>onlineProrationReasonCode</code> property.
     * <p>
     * 
     * @param pOnlineProrationReasonCode
     *            the new value of the <code>onlineProrationReasonCode</code> property.
     */
    public void setOnlineProrationReasonCode(final ProrationType pOnlineProrationReasonCode) {
        this.onlineProrationReasonCode = pOnlineProrationReasonCode;
    }

    /**
     * Sets the <code>onlineProrationReasonCode</code> property.
     * <p>
     * 
     * @param pPercentageOfSegmentMileage
     *            the new value of the <code>onlineProrationReasonCode</code> property.
     */
    public void setPercentageOfSegmentMileage(final BigDecimal pPercentageOfSegmentMileage) {
        this.percentageOfSegmentMileage = pPercentageOfSegmentMileage;
    }

    /**
     * Sets the <code>pieces</code> property.
     * <p>
     * 
     * @param pPieces
     *            the new value of the <code>pieces</code> property.
     */
    public void setPieces(final Integer pPieces) {
        this.pieces = pPieces;
    }

    /**
     * Sets the <code>proratedChargeableWeight</code> property.
     * <p>
     * 
     * @param pProratedChargeableWeight
     *            the new value of the <code>proratedChargeableWeight</code> property.
     */
    public void setProratedChargeableWeight(final BigDecimal pProratedChargeableWeight) {
        this.proratedChargeableWeight = pProratedChargeableWeight;
    }

    /**
     * Sets the <code>segmentDestination</code> property.
     * <p>
     * 
     * @param pSegmentDestination
     *            the new value of the <code>segmentDestination</code> property.
     */
    public void setSegmentDestination(final String pSegmentDestination) {
        this.segmentDestination =ContractUtility.convertToUpperCase(pSegmentDestination);
    }

    /**
     * Sets the <code>segmentMileage</code> property.
     * <p>
     * 
     * @param pSegmentMileage
     *            the new value of the <code>segmentMileage</code> property.
     */
    public void setSegmentMileage(final BigDecimal pSegmentMileage) {
        this.segmentMileage = pSegmentMileage;
    }

    /**
     * Sets the <code>segmentOrigin</code> property.
     * <p>
     * 
     * @param pSegmentOrigin
     *            the new value of the <code>segmentOrigin</code> property.
     */
    public void setSegmentOrigin(final String pSegmentOrigin) {
        this.segmentOrigin = ContractUtility.convertToUpperCase(pSegmentOrigin);
    }

    /**
     * Sets the <code>segmentYield</code> property.
     * <p>
     * 
     * @param pSegmentYield
     *            the new value of the <code>segmentYield</code> property.
     */
    public void setSegmentYield(final BigDecimal pSegmentYield) {
        this.segmentYield = pSegmentYield;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = ContractUtility.convertToUpperCase(flightNumber);
    }
    
    /**
     * Attribute to hold <code>onlineSegmentSplits</code> property.
     */
    private List<OnlineSegmentSplitDto> onlineSegmentSplits;

    /**
     * The method returns the string value of <code>onlineSegmentSplits</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>onlineSegmentSplits</code>.<br>
     */
    public List<OnlineSegmentSplitDto> getOnlineSegmentSplits() {
        if (this.onlineSegmentSplits == null) {
            this.onlineSegmentSplits = new ArrayList<OnlineSegmentSplitDto>();
        }
        return onlineSegmentSplits;
    }

    /**
     * Sets the <code>onlineSegmentSplits</code> property.
     * <p>
     * 
     * @param pOnlineSegmentSplits
     *            the new value of the <code>onlineSegmentSplits</code> property.
     */
    public void setOnlineSegmentSplits(final List<OnlineSegmentSplitDto> pOnlineSegmentSplits) {
        this.onlineSegmentSplits = pOnlineSegmentSplits;
    }
    
    private BigDecimal carrierProrationCurrencyRevenue;
    
    public BigDecimal getCarrierProrationCurrencyRevenue() {
        return carrierProrationCurrencyRevenue;
    }

    public void setCarrierProrationCurrencyRevenue(BigDecimal carrierProrationCurrencyRevenue) {
        this.carrierProrationCurrencyRevenue = carrierProrationCurrencyRevenue;
    }
    
    private BigDecimal segmentProrationCurrencyYield;
    
    public BigDecimal getSegmentProrationCurrencyYield() {
        return segmentProrationCurrencyYield;
    }

    public void setSegmentProrationCurrencyYield(BigDecimal segmentProrationCurrencyYield) {
        this.segmentProrationCurrencyYield = segmentProrationCurrencyYield;
    }

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}
	
}
