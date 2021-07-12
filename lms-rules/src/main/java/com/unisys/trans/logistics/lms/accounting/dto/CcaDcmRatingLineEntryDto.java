package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.accounting.dto.constants.RateGenerationType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

public class CcaDcmRatingLineEntryDto extends PersistenceObjectDto {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>actualIndicator</code> property.
     */
    private boolean actualIndicator;

    /**
     * Attribute to hold <code>chargeableWeight</code> property.
     */
    private BigDecimal chargeableWeight;

    /**
     * Attribute to hold <code>classRatingId</code> property.
     */
    private String classRatingId;

    /**
     * Attribute to hold <code>commodityNumber</code> property.
     */
    private String commodityNumber;

    /**
     * Attribute to hold <code>contractNumber</code> property.
     */
    private String contractNumber;

    /**
     * Attribute to hold <code>deleteIndicator</code> property.
     */
    private boolean deleteIndicator;

    /**
     * Attribute to hold <code>faceIndicator</code> property.
     */
    private boolean faceIndicator;

    /**
     * Attribute to hold <code>grossWeight</code> property.
     */
    private BigDecimal grossWeight;

    /**
     * Attribute to hold <code>netNetIndicator</code> property.
     */
    private Boolean netNetIndicator;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>owner</code> property.
     */
    private String owner;

    /**
     * Attribute to hold <code>publishedIndicator</code> property.
     */
    private boolean publishedIndicator;
    /**
     * Attribute to hold <code>rate</code> property.
     */
    private BigDecimal rate;

    /**
     * Attribute to hold <code>rateCharge</code> property.
     */
    private BigDecimal rateCharge;

    /**
     * Attribute to hold <code>rateClassType</code> property.
     */
    private RateClassType rateClassType;

    /**
     * Attribute to hold <code>rateGenerationType</code> property.
     */
    private RateGenerationType rateGenerationType;

    /**
     * Attribute to hold <code>rateNote</code> property.
     */
    private String rateNote;

    /**
     * Attribute to hold <code>ratePercentage</code> property.
     */
    private Integer ratePercentage;

    /**
     * Attribute to hold <code>ratePieces</code> property.
     */
    private String ratePieces;

    /**
     * Attribute to hold <code>rateRCPIndicator</code> property.
     */
    private boolean rateRCPIndicator;

    /**
     * Attribute to hold <code>rateSource</code> property.
     */
    private String rateSource;

    /**
     * Attribute to hold <code>rateType</code> property.
     */
    private String rateType;

    /**
     * Attribute to hold <code>ratingLineDescription</code> property.
     */
    private String ratingLineDescription;

    /**
     * Attribute to hold <code>spotRateNumber</code> property.
     */
    private String spotRateNumber;

    /**
     * Attribute to hold <code>totalWeightCharge</code> property.
     */
    private BigDecimal totalWeightCharge;

    /**
     * Attribute to hold <code>uldType</code> property.
     */
    private String uldType;

    /**
     * Gets the <code>chargeableWeight</code> property.
     * 
     * @return the current value of the <code>chargeableWeight</code> property.<br>
     */
    public BigDecimal getChargeableWeight() {
        return this.chargeableWeight;
    }

    /**
     * Gets the <code>classRatingId</code> property.
     * 
     * @return the current value of the <code>classRatingId</code> property.<br>
     */
    public String getClassRatingId() {
        return this.classRatingId;
    }

    /**
     * Gets the <code>commodityNumber</code> property.
     * 
     * @return the current value of the <code>commodityNumber</code> property.<br>
     */
    public String getCommodityNumber() {
        return this.commodityNumber;
    }

    /**
     * Gets the <code>contractNumber</code> property.
     * 
     * @return the current value of the <code>contractNumber</code> property.<br>
     */
    public String getContractNumber() {
        return this.contractNumber;
    }

    /**
     * Gets the <code>deleteIndicator</code> property.
     * 
     * @return the current value of the <code>deleteIndicator</code> property.<br>
     */
    public boolean getDeleteIndicator() {
        return this.deleteIndicator;
    }

    /**
     * Gets the <code>grossWeight</code> property.
     * 
     * @return the current value of the <code>grossWeight</code> property.<br>
     */
    public BigDecimal getGrossWeight() {
        return this.grossWeight;
    }

    /**
     * Gets the <code>netNetIndicator</code> property.
     * 
     * @return the current value of the <code>netNetIndicator</code> property.<br>
     */
    public Boolean getNetNetIndicator() {
        return this.netNetIndicator;
    }
    /**
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }
    /**
     * Gets the <code>owner</code> property.
     * 
     * @return the current value of the <code>owner</code> property.<br>
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Gets the <code>rate</code> property.
     * 
     * @return the current value of the <code>rate</code> property.<br>
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Gets the <code>rateCharge</code> property.
     * 
     * @return the current value of the <code>rateCharge</code> property.<br>
     */
    public BigDecimal getRateCharge() {
        return this.rateCharge;
    }

    /**
     * Gets the <code>rateClassType</code> property.
     * 
     * @return the current value of the <code>rateClassType</code> property.<br>
     */
    public RateClassType getRateClassType() {
        return this.rateClassType;
    }

    /**
     * Gets the <code>rateGenerationType</code> property.
     * 
     * @return the current value of the <code>rateGenerationType</code> property.<br>
     */
    public RateGenerationType getRateGenerationType() {
        return this.rateGenerationType;
    }

    /**
     * Gets the <code>rateNote</code> property.
     * 
     * @return the current value of the <code>rateNote</code> property.<br>
     */
    public String getRateNote() {
        return this.rateNote;
    }

    /**
     * Gets the <code>ratePercentage</code> property.
     * 
     * @return the current value of the <code>ratePercentage</code> property.<br>
     */
    public Integer getRatePercentage() {
        return this.ratePercentage;
    }

    /**
     * Gets the <code>ratePieces</code> property.
     * 
     * @return the current value of the <code>ratePieces</code> property.<br>
     */
    public String getRatePieces() {
        return this.ratePieces;
    }

    /**
     * Gets the <code>rateRCPIndicator</code> property.
     * 
     * @return the current value of the <code>rateRCPIndicator</code> property.<br>
     */
    public boolean getRateRCPIndicator() {
        return this.rateRCPIndicator;
    }

    /**
     * Gets the <code>rateSource</code> property.
     * 
     * @return the current value of the <code>rateSource</code> property.<br>
     */

    public String getRateSource() {
        return this.rateSource;
    }

    /**
     * Gets the <code>rateType</code> property.
     * 
     * @return the current value of the <code>rateType</code> property.<br>
     */
    public String getRateType() {
        return this.rateType;
    }

    /**
     * Gets the <code>ratingLineDescription</code> property.
     * 
     * @return the current value of the <code>ratingLineDescription</code> property.<br>
     */
    public String getRatingLineDescription() {
        return this.ratingLineDescription;
    }

    /**
     * Gets the <code>spotRateNumber</code> property.
     * 
     * @return the current value of the <code>spotRateNumber</code> property.<br>
     */

    public String getSpotRateNumber() {
        return this.spotRateNumber;
    }

    /**
     * Gets the <code>totalWeightCharge</code> property.
     * 
     * @return the current value of the <code>totalWeightCharge</code> property.<br>
     */
    public BigDecimal getTotalWeightCharge() {
        return this.totalWeightCharge;
    }

    /**
     * Gets the <code>uldType</code> property.
     * 
     * @return the current value of the <code>uldType</code> property.<br>
     */
    public String getUldType() {
        return this.uldType;
    }

    /**
     * Gets the <code>actualIndicator</code> property.
     * 
     * @return the current value of the <code>actualIndicator</code> property.<br>
     */
    public boolean isActualIndicator() {
        return this.actualIndicator;
    }

    /**
     * Gets the <code>faceIndicator</code> property.
     * 
     * @return the current value of the <code>faceIndicator</code> property.<br>
     */
    public boolean isFaceIndicator() {
        return this.faceIndicator;
    }

    /**
     * Gets the <code>publishedIndicator</code> property.
     * 
     * @return the current value of the <code>publishedIndicator</code> property.<br>
     */
    public boolean isPublishedIndicator() {
        return publishedIndicator;
    }

    /**
     * Sets the <code>actualIndicator</code> property.
     * <p>
     * 
     * @param pActualIndicator
     *            the new value of the <code>actualIndicator</code> property.
     */
    public void setActualIndicator(final boolean pActualIndicator) {
        this.actualIndicator = pActualIndicator;
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
     * Sets the <code>classRatingId</code> property.
     * <p>
     * 
     * @param pClassRatingId
     *            the new value of the <code>classRatingId</code> property.
     */
    public void setClassRatingId(final String pClassRatingId) {
        this.classRatingId = pClassRatingId;
    }

    /**
     * Sets the <code>commodityNumber</code> property.
     * <p>
     * 
     * @param pCommodityNumber
     *            the new value of the <code>commodityNumber</code> property.
     */
    public void setCommodityNumber(final String pCommodityNumber) {
        this.commodityNumber = pCommodityNumber;
    }

    /**
     * Sets the <code>contractNumber</code> property.
     * <p>
     * 
     * @param pContractNumber
     *            the new value of the <code>contractNumber</code> property.
     */
    public void setContractNumber(final String pContractNumber) {
        this.contractNumber = pContractNumber;
    }

    /**
     * Sets the <code>deleteIndicator</code> property.
     * <p>
     * 
     * @param pDeleteIndicator
     *            the new value of the <code>deleteIndicator</code> property.
     */

    public void setDeleteIndicator(final boolean pDeleteIndicator) {
        this.deleteIndicator = pDeleteIndicator;
    }

    /**
     * Sets the <code>faceIndicator</code> property.
     * <p>
     * 
     * @param pFaceIndicator
     *            the new value of the <code>faceIndicator</code> property.
     */
    public void setFaceIndicator(final boolean pFaceIndicator) {
        this.faceIndicator = pFaceIndicator;
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
     * Sets the <code>netNetIndicator</code> property.
     * <p>
     * 
     * @param pNetNetIndicator
     *            the new value of the <code>netNetIndicator</code> property.
     */
    public void setNetNetIndicator(final Boolean pNetNetIndicator) {
        this.netNetIndicator = pNetNetIndicator;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */

    public void setoId(final Long pOId) {
        this.oId = pOId;
    }
    /**
     * Sets the <code>owner</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>owner</code> property.
     */
    public void setOwner(final String pOwner) {
        this.owner = pOwner;
    }

    /**
     * Sets the <code>publishedIndicator</code> property.
     * <p>
     * 
     * @param pPublishedIndicator
     *            the new value of the <code>publishedIndicator</code> property.
     */
    public void setPublishedIndicator(boolean pPublishedIndicator) {
        this.publishedIndicator = pPublishedIndicator;
    }

    /**
     * Sets the <code>rate</code> property.
     * <p>
     * 
     * @param pRate
     *            the new value of the <code>rate</code> property.
     */
    public void setRate(final BigDecimal pRate) {
        this.rate = pRate;
    }

    /**
     * Sets the <code>rateCharge</code> property.
     * <p>
     * 
     * @param pRateCharge
     *            the new value of the <code>rateCharge</code> property.
     */

    public void setRateCharge(final BigDecimal pRateCharge) {
        this.rateCharge = pRateCharge;
    }

    /**
     * Sets the <code>rateClassType</code> property.
     * <p>
     * 
     * @param pRateClassType
     *            the new value of the <code>rateClassType</code> property.
     */

    public void setRateClassType(final RateClassType pRateClassType) {
        this.rateClassType = pRateClassType;
    }

    /**
     * Sets the <code>rateGenerationType</code> property.
     * <p>
     * 
     * @param pRateGenerationType
     *            the new value of the <code>rateGenerationType</code> property.
     */

    public void setRateGenerationType(final RateGenerationType pRateGenerationType) {
        this.rateGenerationType = pRateGenerationType;
    }

    /**
     * Sets the <code>rateNote</code> property.
     * <p>
     * 
     * @param pRateNote
     *            the new value of the <code>rateNote</code> property.
     */

    public void setRateNote(final String pRateNote) {
        this.rateNote = pRateNote;
    }

    /**
     * Sets the <code>ratePercentage</code> property.
     * <p>
     * 
     * @param pRatePercentage
     *            the new value of the <code>ratePercentage</code> property.
     */

    public void setRatePercentage(final Integer pRatePercentage) {
        this.ratePercentage = pRatePercentage;
    }

    /**
     * Sets the <code>ratePieces</code> property.
     * <p>
     * 
     * @param pRatePieces
     *            the new value of the <code>ratePieces</code> property.
     */

    public void setRatePieces(final String pRatePieces) {
        this.ratePieces = pRatePieces;
    }

    /**
     * Sets the <code>rateRCPIndicator</code> property.
     * <p>
     * 
     * @param pRateRCPIndicator
     *            the new value of the <code>rateRCPIndicator</code> property.
     */
    public void setRateRCPIndicator(final boolean pRateRCPIndicator) {
        this.rateRCPIndicator = pRateRCPIndicator;
    }

    /**
     * Sets the <code>rateSource</code> property.
     * <p>
     * 
     * @param pRateSource
     *            the new value of the <code>rateSource</code> property.
     */
    public void setRateSource(final String pRateSource) {
        this.rateSource = pRateSource;
    }

    /**
     * Sets the <code>rateType</code> property.
     * <p>
     * 
     * @param pRateType
     *            the new value of the <code>rateType</code> property.
     */
    public void setRateType(final String pRateType) {
        this.rateType = pRateType;
    }

    /**
     * Sets the <code>ratingLineDescription</code> property.
     * <p>
     * 
     * @param pRatingLineDescription
     *            the new value of the <code>ratingLineDescription</code> property.
     */

    public void setRatingLineDescription(final String pRatingLineDescription) {
        this.ratingLineDescription = pRatingLineDescription;
    }

    /**
     * Sets the <code>spotRateNumber</code> property.
     * <p>
     * 
     * @param pSpotRateNumber
     *            the new value of the <code>spotRateNumber</code> property.
     */
    public void setSpotRateNumber(final String pSpotRateNumber) {
        this.spotRateNumber = pSpotRateNumber;
    }

    /**
     * Sets the <code>totalWeightCharge</code> property.
     * <p>
     * 
     * @param pTotalWeightCharge
     *            the new value of the <code>totalWeightCharge</code> property.
     */
    public void setTotalWeightCharge(final BigDecimal pTotalWeightCharge) {
        this.totalWeightCharge = pTotalWeightCharge;
    }

    /**
     * Sets the <code>uldType</code> property.
     * <p>
     * 
     * @param pUldType
     *            the new value of the <code>uldType</code> property.
     */
    public void setUldType(final String pUldType) {
        this.uldType = pUldType;
    }

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

}
