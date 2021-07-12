package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

/**
 * <code>AirWaybillFindDto</code> contains general Airway bill details.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>airWaybillNumberDto
 * <li>checkAWBStockIndicator
 * <li>oid
 * </ul>
 * </code>
 */

public class AirWaybillFindDto implements Serializable {

    /**
     * unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>airWaybillNumberDto</code> property.
     */
    private AirWaybillNumberDto airWaybillNumberDto;

    /**
     * Attribute to hold the <code>checkAWBStockIndicator</code> property.
     */
    private boolean checkAWBStockIndicator;

    /**
     * Attribute to hold the <code>fullAWBDetailRequestInd</code> property.
     */
    private boolean fullAWBDetailRequestInd;

    /**
     * Attribute to hold the <code>otherChargeDetailRequestInd</code> property.
     */
    private boolean otherChargeDetailRequestInd;

    /**
     * Attribute to hold the <code>participantDetailRequestInd</code> property.
     */
    private boolean participantDetailRequestInd;

    /**
     * Attribute to hold the <code>ratingDetailRequestInd</code> property.
     */
    private boolean ratingDetailRequestInd;

    /**
     * Attribute to hold the <code>returnAWBStockParticipantInd</code> property.
     */
    private boolean returnAWBStockParticipantInd;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>revenueDetailRequiredIndicator</code> property.
     */
    private boolean revenueDetailRequiredIndicator;

    /**
     * Attribute to hold the <code>bookingDetailRequiredIndicator</code> property.
     */
    private boolean bookingDetailRequiredIndicator;

    /**
     * Attribute to hold the <code>ccaMessageRequest</code> property.
     */
    private boolean ccaMessageRequest;

    /**
     * Gets the airWaybillNumberDto.
     * <p>
     * 
     * @return the current value of airWaybillNumberDto.<br>
     */
    public AirWaybillNumberDto getAirWaybillNumberDto() {
        if (this.airWaybillNumberDto == null) {
            this.airWaybillNumberDto = new AirWaybillNumberDto();
        }
        return this.airWaybillNumberDto;
    }

    /**
     * Gets the oId.
     * <p>
     * 
     * @return the current value of oId.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>checkAWBStockIndicator</code> property.
     * <p>
     * 
     * @return the current value of <code>checkAWBStockIndicator</code> property.
     */
    public boolean isCheckAWBStockIndicator() {
        return this.checkAWBStockIndicator;
    }

    /**
     * Sets the <code>airWaybillNumberDto</code> property.
     * <p>
     * 
     * @param pAirWaybillNumberDto
     *            the new value of <code>airWaybillNumberDto</code> property.<br>
     */
    public void setAirWaybillNumberDto(final AirWaybillNumberDto pAirWaybillNumberDto) {
        this.airWaybillNumberDto = pAirWaybillNumberDto;
    }

    /**
     * Sets the <code>checkAWBStockIndicator</code> property.
     * <p>
     * 
     * @param pCheckAWBStockIndicator
     *            the new value of <code>checkAWBStockIndicator</code> property.<br>
     */
    public void setCheckAWBStockIndicator(final boolean pCheckAWBStockIndicator) {
        this.checkAWBStockIndicator = pCheckAWBStockIndicator;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Gets the <code>fullAWBDetailRequestInd</code> property.
     * 
     * @return
     */
    public boolean isFullAWBDetailRequestInd() {
        return this.fullAWBDetailRequestInd;
    }

    /**
     * 
     * @param pFullAWBDetailRequestInd
     */
    public void setFullAWBDetailRequestInd(final boolean pFullAWBDetailRequestInd) {
        this.fullAWBDetailRequestInd = pFullAWBDetailRequestInd;
    }

    /**
     * Gets the <code>otherChargeDetailRequestInd</code> property.
     * 
     * @return
     */
    public boolean isOtherChargeDetailRequestInd() {
        return this.otherChargeDetailRequestInd;
    }

    /**
     * 
     * @param pOtherChargeDetailRequestInd
     */
    public void setOtherChargeDetailRequestInd(final boolean pOtherChargeDetailRequestInd) {
        this.otherChargeDetailRequestInd = pOtherChargeDetailRequestInd;
    }

    /**
     * Gets the <code>participantDetailRequestInd</code> property.
     * 
     * @return
     */
    public boolean isParticipantDetailRequestInd() {
        return this.participantDetailRequestInd;
    }

    /**
     * 
     * @param pParticipantDetailRequestInd
     */
    public void setParticipantDetailRequestInd(final boolean pParticipantDetailRequestInd) {
        this.participantDetailRequestInd = pParticipantDetailRequestInd;
    }

    /**
     * Gets the <code>ratingDetailRequestInd</code> property.
     * 
     * @return
     */
    public boolean isRatingDetailRequestInd() {
        return this.ratingDetailRequestInd;
    }

    /**
     * 
     * @param pRatingDetailRequestInd
     */
    public void setRatingDetailRequestInd(final boolean pRatingDetailRequestInd) {
        this.ratingDetailRequestInd = pRatingDetailRequestInd;
    }

    /**
     * Gets the <code>returnAWBStockParticipantInd</code> property.
     * 
     * @return
     */
    public boolean isReturnAWBStockParticipantInd() {
        return this.returnAWBStockParticipantInd;
    }

    /**
     * 
     * @param pReturnAWBStockParticipantInd
     */
    public void setReturnAWBStockParticipantInd(final boolean pReturnAWBStockParticipantInd) {
        this.returnAWBStockParticipantInd = pReturnAWBStockParticipantInd;
    }

    /**
     * @return the revenueDetailRequiredIndicator
     */
    public boolean isRevenueDetailRequiredIndicator() {
        return this.revenueDetailRequiredIndicator;
    }

    /**
     * @param revenueDetailRequiredIndicator the revenueDetailRequiredIndicator to set
     */
    public void setRevenueDetailRequiredIndicator(final boolean pRevenueDetailRequiredIndicator) {
        this.revenueDetailRequiredIndicator = pRevenueDetailRequiredIndicator;
    }

    /**
     * @return the bookingDetailRequiredIndicator
     */
    public boolean isBookingDetailRequiredIndicator() {
        return this.bookingDetailRequiredIndicator;
    }

    /**
     * @param bookingDetailRequiredIndicator the bookingDetailRequiredIndicator to set
     */
    public void setBookingDetailRequiredIndicator(final boolean pBookingDetailRequiredIndicator) {
        this.bookingDetailRequiredIndicator = pBookingDetailRequiredIndicator;
    }

    /**
     * Gets the <code>ccaMessageRequest</code> property.
     * 
     * @return
     */

    public boolean isCcaMessageRequest() {
        return this.ccaMessageRequest;
    }

    /**
     * Sets the <code>ccaMessageRequest</code> property.
     * <p>
     * 
     * @param pCcaMessageRequest
     *            the new value of <code>ccaMessageRequest</code> property.<br>
     */
    public void setCcaMessageRequest(final boolean pCcaMessageRequest) {
        this.ccaMessageRequest = pCcaMessageRequest;
    }

}
