package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public abstract class ProrationSegmentDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 387846538570664282L;

    /**
     * Attribute to hold <code>chargeableWeight</code> property.
     */
    
    private BigDecimal chargeableWeight;

    /**
     * Attribute to hold <code>grossWeight</code> property.
     */
    
    private BigDecimal grossWeight;

    /**
     * Attribute to hold <code>pieces</code> property.
     */
    
    private int pieces;

    /**
     * Attribute to hold <code>segmentCarrier</code> property.
     */
    
    private String segmentCarrier;

    /**
     * Attribute to hold <code>segmentDestination</code> property.
     */
    
    private String segmentDestination;

    /**
     * Attribute to hold <code>segmentMileage</code> property.
     */
    
    private BigDecimal segmentMileage;

    /**
     * Attribute to hold <code>segmentMileagePercent</code> property.
     */
    
    private BigDecimal segmentMileagePercent;

    /**
     * Attribute to hold <code>segmentOrigin</code> property.
     */
    
    private String segmentOrigin;

    /**
     * Attribute to hold <code>segmentRevenue</code> property.
     */
    
    private BigDecimal segmentRevenue;

    /**
     * Attribute to hold <code>segmentYield</code> property.
     */
    
    private BigDecimal segmentYield;
    /**
     * Gets the <code>chargeableWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>chargeableWeight</code> property
     */
    
    public BigDecimal getChargeableWeight() {
        return this.chargeableWeight;
    }
    /**
     * Gets the <code>grossWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>grossWeight</code> property
     */
    
    public BigDecimal getGrossWeight() {
        return this.grossWeight;
    }
    /**
     * Gets the <code>pieces</code> property.
     * <p>
     * 
     * @return the current value of the <code>pieces</code> property
     */
    
    public int getPieces() {
        return this.pieces;
    }
    /**
     * Gets the <code>segmentCarrier</code> property.
     * <p>
     * 
     * @return the current value of the <code>segmentCarrier</code> property
     */
    
    public String getSegmentCarrier() {
        return this.segmentCarrier;
    }
    /**
     * Gets the <code>segmentDestination</code> property.
     * <p>
     * 
     * @return the current value of the <code>segmentDestination</code> property
     */

    public String getSegmentDestination() {
        return this.segmentDestination;
    }
    /**
     * Gets the <code>segmentMileage</code> property.
     * <p>
     * 
     * @return the current value of the <code>segmentMileage</code> property
     */
    
    public BigDecimal getSegmentMileage() {
        return this.segmentMileage;
    }
    /**
     * Gets the <code>segmentMileagePercent</code> property.
     * <p>
     * 
     * @return the current value of the <code>segmentMileagePercent</code> property
     */

    public BigDecimal getSegmentMileagePercent() {
        return this.segmentMileagePercent;
    }
    /**
     * Gets the <code>segmentOrigin</code> property.
     * <p>
     * 
     * @return the current value of the <code>segmentOrigin</code> property
     */

    public String getSegmentOrigin() {
        return this.segmentOrigin;
    }
    /**
     * Gets the <code>segmentRevenue</code> property.
     * <p>
     * 
     * @return the current value of the <code>segmentRevenue</code> property
     */
    
    public BigDecimal getSegmentRevenue() {
        return this.segmentRevenue;
    }
    /**
     * Gets the <code>segmentYield</code> property.
     * <p>
     * 
     * @return the current value of the <code>segmentYield</code> property
     */
    
   
    public BigDecimal getSegmentYield() {
        return this.segmentYield;
    }
    /**
     * Sets the <code>chargeableWeight</code> property.
     * <p>
     * 
     * @param pChargeableWeight
     *            the new value of the <code>chargeableWeight</code> property
     */
    
    
    public void setChargeableWeight(final BigDecimal pChargeableWeight) {
        this.chargeableWeight = pChargeableWeight;
    }
    /**
     * Sets the <code>grossWeight</code> property.
     * <p>
     * 
     * @param pGrossWeight
     *            the new value of the <code>grossWeight</code> property
     */
    
    
    public void setGrossWeight(final BigDecimal pGrossWeight) {
        this.grossWeight = pGrossWeight;
    }
    /**
     * Sets the <code>pieces</code> property.
     * <p>
     * 
     * @param pPieces
     *            the new value of the <code>pieces</code> property
     */
    
    public void setPieces(final int pPieces) {
        this.pieces = pPieces;
    }
    /**
     * Sets the <code>segmentCarrier</code> property.
     * <p>
     * 
     * @param pSegmentCarrier
     *            the new value of the <code>segmentCarrier</code> property
     */
    
    
    public void setSegmentCarrier(final String pSegmentCarrier) {
        this.segmentCarrier = pSegmentCarrier;
    }
    /**
     * Sets the <code>segmentDestination</code> property.
     * <p>
     * 
     * @param pSegmentDestination
     *            the new value of the <code>segmentDestination</code> property
     */
    
    
    public void setSegmentDestination(final String pSegmentDestination) {
        this.segmentDestination = pSegmentDestination;
    }
    /**
     * Sets the <code>segmentMileage</code> property.
     * <p>
     * 
     * @param pSegmentMileage
     *            the new value of the <code>segmentMileage</code> property
     */
    
    
    public void setSegmentMileage(final BigDecimal pSegmentMileage) {
        this.segmentMileage = pSegmentMileage;
    }
    /**
     * Sets the <code>segmentMileagePercent</code> property.
     * <p>
     * 
     * @param pSegmentMileagePercent
     *            the new value of the <code>segmentMileagePercent</code> property
     */
    
    public void setSegmentMileagePercent(final BigDecimal pSegmentMileagePercent) {
        this.segmentMileagePercent = pSegmentMileagePercent;
    }
    /**
     * Sets the <code>segmentOrigin</code> property.
     * <p>
     * 
     * @param pSegmentOrigin
     *            the new value of the <code>segmentOrigin</code> property
     */
    
    public void setSegmentOrigin(final String pSegmentOrigin) {
        this.segmentOrigin = pSegmentOrigin;
    }
    /**
     * Sets the <code>segmentRevenue</code> property.
     * <p>
     * 
     * @param pSegmentRevenue
     *            the new value of the <code>segmentRevenue</code> property
     */
    
    
    public void setSegmentRevenue(final BigDecimal pSegmentRevenue) {
        this.segmentRevenue = pSegmentRevenue;
    }
    /**
     * Sets the <code>segmentYield</code> property.
     * <p>
     * 
     * @param pSegmentYield
     *            the new value of the <code>segmentYield</code> property
     */
    
    
    public void setSegmentYield(final BigDecimal pSegmentYield) {
        this.segmentYield = pSegmentYield;
    }

}
