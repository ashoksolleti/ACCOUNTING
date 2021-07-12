package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;
import java.util.List;

public class RoutingAndPricingDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5313524632594740925L;

    /**
     * Attribute to hold <code>bestRateIndicator</code> property.
     */
    private Boolean bestRateIndicator;

    /**
     * Attribute to hold <code>contractHurdleRateEnforcementInd</code> property.
     */
    private boolean contractHurdleRateEnforcementInd;

    /**
     * Attribute to hold <code>errorNumber</code> property.
     */
    private String errorNumber;

    /**
     * Attribute to hold <code>errorText</code> property.
     */
    private String errorText;

    /**
     * Attribute to hold <code>productCode</code> property.
     */
    private String productCode;

    /**
     * Attribute to hold <code>ratingLineCount</code> property.
     */
    // private Integer ratingLineCount;

    /**
     * Attribute to hold <code>responsibleParty</code> property.
     */
    private String responsibleParty;

    /**
     * Attribute to hold <code>routeNumber</code> property.
     */
    private int routeNumber;

    /**
     * Attribute to hold <code>spotRateHurdleRateEnforcementInd</code> property.
     */
    private boolean spotRateHurdleRateEnforcementInd;

    /**
     * Attribute to hold <code>publishedRatingLineDtos</code> property.
     */
    private List<RatingLineDto> publishedRatingLineDtos;

    /**
     * Attribute to hold <code>actualRatingLineDtos</code> property.
     */
    private List<RatingLineDto> actualRatingLineDtos;
    /**
     * Attribute to hold <code>loyaltyRulesDto</code> property.
     */
    private LoyaltyRulesDto loyaltyRulesDto;

    /**
     * Gets the <code>bestRateIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>bestRateIndicator</code> property.
     */
    public Boolean getBestRateIndicator() {
        return this.bestRateIndicator;
    }

    /**
     * Gets the <code>contractHurdleRateEnforcementInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>contractHurdleRateEnforcementInd</code> property.
     */
    public boolean getContractHurdleRateEnforcementInd() {
        return this.contractHurdleRateEnforcementInd;
    }

    /**
     * Gets the <code>errorNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>errorNumber</code> property.<br>
     */
    public String getErrorNumber() {
        return this.errorNumber;
    }

    /**
     * Gets the <code>errorText</code> property.
     * <p>
     * 
     * @return the current value of the <code>errorText</code> property.<br>
     */
    public String getErrorText() {
        return this.errorText;
    }

    /**
     * Gets the <code>productCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>productCode</code> property.<br>
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * Gets the <code>ratingLineCount</code> property.
     * <p>
     * 
     * @return the current value of the <code>ratingLineCount</code> property.<br>
     */
    /*
     * public Integer getRatingLineCount() {
     * return this.ratingLineCount;
     * }
     */

    /**
     * Gets the <code>responsibleParty</code> property.
     * <p>
     * 
     * @return the current value of the <code>responsibleParty</code> property.<br>
     */
    public String getResponsibleParty() {
        return this.responsibleParty;
    }

    /**
     * Gets the <code>routeNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>routeNumber</code> property.<br>
     */
    public int getRouteNumber() {
        return this.routeNumber;
    }

    /**
     * Gets the <code>contractHurdleRateEnforcementInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>contractHurdleRateEnforcementInd</code> property.
     */
    public boolean getSpotRateHurdleRateEnforcementInd() {
        return this.spotRateHurdleRateEnforcementInd;
    }

    /**
     * Holds the list of {@link com.unisys.trans.logistics.lms.rating.dto.price.RatingLineDto
     * RatingLineDto} containing <code>publishedRatingLineDtos</code> details.
     * <p>
     * 
     * @return the current value of <code>publishedRatingLineDtos</code> details.
     */
    public List<RatingLineDto> getPublishedRatingLineDtos() {
        return this.publishedRatingLineDtos;
    }

    /**
     * Holds the list of {@link com.unisys.trans.logistics.lms.rating.dto.price.RatingLineDto
     * RatingLineDto} containing <code>actualRatingLineDtos</code> details.
     * <p>
     * 
     * @return the current value of <code>actualRatingLineDtos</code> details.
     */
    public List<RatingLineDto> getActualRatingLineDtos() {
        return this.actualRatingLineDtos;
    }

    /**
     * Sets the <code>bestRateIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pBestRateIndicator
     *            the current value of the <code>bestRateIndicator</code> property.
     */
    public void setBestRateIndicator(final Boolean pBestRateIndicator) {
        this.bestRateIndicator = pBestRateIndicator;
    }

    /**
     * Sets the <code>contractHurdleRateEnforcementInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pContractHurdleRateEnforcementInd
     *            the current value of the <code>contractHurdleRateEnforcementInd</code> property.
     */
    public void setContractHurdleRateEnforcementInd(final boolean pContractHurdleRateEnforcementInd) {
        this.contractHurdleRateEnforcementInd = pContractHurdleRateEnforcementInd;
    }

    /**
     * Sets the <code>errorNumber</code> property.
     * 
     * @param pErrorNumber
     *            the new value of the <code>errorNumber</code> property.
     */
    public void setErrorNumber(final String pErrorNumber) {
        this.errorNumber = pErrorNumber;
    }

    /**
     * Sets the <code>errorText</code> property.
     * 
     * @param pErrorText
     *            the new value of the <code>errorText</code> property.
     */
    public void setErrorText(final String pErrorText) {
        this.errorText = pErrorText;
    }

    /**
     * Sets the <code>productCode</code> property.
     * 
     * @param pProductCode
     *            the new value of the <code>productCode</code> property.
     */
    public void setProductCode(final String pProductCode) {
        this.productCode = pProductCode;
    }

    /**
     * Sets the <code>ratingLineCount</code> property.
     * 
     * @param pRatingLineCount
     *            the new value of the <code>ratingLineCount</code> property.
     */

    /*
     * public void setRatingLineCount(final Integer pRatingLineCount) {
     * this.ratingLineCount = pRatingLineCount;
     * }
     */

    /**
     * Sets the <code>responsibleParty</code> property.
     * 
     * @param pResponsibleParty
     *            the new value of the <code>responsibleParty</code> property.
     */
    public void setResponsibleParty(final String pResponsibleParty) {
        this.responsibleParty = pResponsibleParty;
    }

    /**
     * Sets the <code>routeNumber</code> property.
     * 
     * @param pRouteNumber
     *            the new value of the <code>routeNumber</code> property.
     */
    public void setRouteNumber(final int pRouteNumber) {
        this.routeNumber = pRouteNumber;
    }

    /**
     * Sets the <code>spotRateHurdleRateEnforcementInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pSpotRateHurdleRateEnforcementInd
     *            the current value of the <code>spotRateHurdleRateEnforcementInd</code> property.
     */
    public void setSpotRateHurdleRateEnforcementInd(final boolean pSpotRateHurdleRateEnforcementInd) {
        this.spotRateHurdleRateEnforcementInd = pSpotRateHurdleRateEnforcementInd;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.price.RatingLineDto
     * RatingLineDto} containing <code>publishedRatingLineDtos</code> details.
     * <p>
     * 
     * @param pPublishedRatingLineDtos
     *            holds the new value of <code>thePublishedRatingLineDtos</code> type
     *            details.<br>
     */
    public void setPublishedRatingLineDtos(final List<RatingLineDto> pPublishedRatingLineDtos) {
        this.publishedRatingLineDtos = pPublishedRatingLineDtos;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.price.RatingLineDto
     * RatingLineDto} containing <code>actualRatingLineDtos</code> details.
     * <p>
     * 
     * @param pActualRatingLineDtos
     *            holds the new value of <code>actualRatingLineDtos</code> type
     *            details.<br>
     */
    public void setActualRatingLineDtos(final List<RatingLineDto> pActualRatingLineDtos) {
        this.actualRatingLineDtos = pActualRatingLineDtos;
    }

    /**
     * Gets the <code>loyaltyRulesDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>loyaltyRulesDto</code> property.<br>
     */
	public LoyaltyRulesDto getLoyaltyRulesDto() {
		return this.loyaltyRulesDto;
	}

    /**
     * Sets the <code>loyaltyRulesDto</code> property.
     * 
     * @param pLoyaltyRulesDto
     *            the new value of the <code>loyaltyRulesDto</code> property.
     */
	public void setLoyaltyRulesDto(final LoyaltyRulesDto pLoyaltyRulesDto) {
		this.loyaltyRulesDto = pLoyaltyRulesDto;
	}
}
