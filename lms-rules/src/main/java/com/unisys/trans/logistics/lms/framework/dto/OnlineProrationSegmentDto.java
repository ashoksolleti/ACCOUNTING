package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;

/**
 * <code>OnlineProrationSegmentDto</code> contains specific data applicable to the Online Proration Segment.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>chargeableWeightPercent
 * <li>flight
 * <li>oId
 * <li>proratedVolume
 * <li>prorationType
 * </ul>
 * </code>
 */

public class OnlineProrationSegmentDto extends ProrationSegmentDto {

    /**
     * Unique serial version UID.
     */

    private static final long serialVersionUID = 2838314609613208084L;

    /**
     * Attribute to hold <code>chargeableWeightPercent</code> property.
     */

    private BigDecimal chargeableWeightPercent;

    /**
     * Attribute to hold <code>flight</code> property.
     */

    private FlightInfoDto flight;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oid;

    /**
     * Attribute to hold <code>proratedVolume</code> property.
     */

    private BigDecimal proratedVolume;

    /**
     * Attribute to hold <code>prorationType</code> property.
     */

    private String prorationType;

    /**
     * Attribute to hold <code>prorationType</code> property.
     */
    private Long revenueOid;

    /**
     * Gets the <code>revenueOid</code> property.
     * 
     * @return the current value of the <code>revenueOid</code> property.
     */
    public Long getRevenueOid() {
        return this.revenueOid;
    }

    /**
     * Sets the <code>revenueOid</code> property.
     * 
     * @param pRevenueOid
     *            the current value of the <code>revenueOid</code> property.
     */
    public void setRevenueOid(final Long pRevenueOid) {
        this.revenueOid = pRevenueOid;
    }

    /**
     * Gets the <code>chargeableWeightPercent</code> property.
     * <p>
     * 
     * @return the current value of the <code>chargeableWeightPercent</code> property
     */

    public BigDecimal getChargeableWeightPercent() {
        return this.chargeableWeightPercent;
    }

    /**
     * Gets the <code>flight</code> property.
     * <p>
     * 
     * @return the current value of the <code>flight</code> property
     */

    public FlightInfoDto getFlight() {
        return this.flight;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>OId</code> property
     */

    @Override
    public Long getOId() {

        return this.oid;
    }

    /**
     * Gets the <code>proratedVolume</code> property.
     * <p>
     * 
     * @return the current value of the <code>proratedVolume</code> property
     */

    public BigDecimal getProratedVolume() {
        return this.proratedVolume;
    }

    /**
     * Gets the <code>prorationType</code> property.
     * <p>
     * 
     * @return the current value of the <code>prorationType</code> property
     */
    public String getProrationType() {
        return this.prorationType;
    }

    /**
     * Sets the <code>chargeableWeightPercent</code> property.
     * <p>
     * 
     * @param pChargeableWeightPercent
     *            the new value of the <code>chargeableWeightPercent</code> property
     */
    public void setChargeableWeightPercent(final BigDecimal pChargeableWeightPercent) {
        this.chargeableWeightPercent = pChargeableWeightPercent;
    }

    /**
     * Sets the <code>flight</code> property.
     * <p>
     * 
     * @param pFlight
     *            the new value of the <code>flight</code> property
     */

    public void setFlight(final FlightInfoDto pFlight) {
        this.flight = pFlight;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property
     */

    public void setOId(final Long pOId) {

        this.oid = pOId;
    }

    /**
     * Sets the <code>proratedVolume</code> property.
     * <p>
     * 
     * @param pProratedVolume
     *            the new value of the <code>proratedVolume</code> property
     */

    public void setProratedVolume(final BigDecimal pProratedVolume) {
        this.proratedVolume = pProratedVolume;
    }

    /**
     * Sets the <code>prorationType</code> property.
     * <p>
     * 
     * @param pProrationType
     *            the new value of the <code>prorationType</code> property
     */

    public void setProrationType(final String pProrationType) {
        this.prorationType = pProrationType;
    }

}
