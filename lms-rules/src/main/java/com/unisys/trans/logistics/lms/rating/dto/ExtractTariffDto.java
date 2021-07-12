package com.unisys.trans.logistics.lms.rating.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingConventionType;

/**
 * <code>ExtractTariffDto</code> class contain information specific to a ExtractTariff rates.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>allExtractDestinationIndicator
 * <li>allExtractOriginIndicator
 * <li>biDirectionalIndicator
 * <li>carrierCode
 * <li>currency
 * <li>effectiveDate
 * <li>extractDestination
 * <li>extractFormatType
 * <li>extractOrigin
 * <li>pendingGovApprovalInd
 * <li>rateSourceCode
 * <li>rateTypeCode
 * <li>updateDate
 * <li>updateTime
 * </code>
 * </ul>
 */
public class ExtractTariffDto extends PersistenceObjectDto {
    /**
     * Default Serial version.
     */
    private static final long serialVersionUID = 8003952166241575630L;

    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * Attribute to hold <code>allExtractDestinationIndicator</code> property.
     */
    private boolean allExtractDestinationIndicator;

    /**
     * Attribute to hold <code>allExtractOriginIndicator</code> property.
     */
    private boolean allExtractOriginIndicator;

    /**
     * Attribute to hold <code>biDirectionalIndicator</code> property.
     */
    private boolean biDirectionalIndicator;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>currency</code> property.
     */
    private String currency;

    /**
     * Attribute to hold <code>effectiveDate</code> property.
     */
    private Date effectiveDate;

    /**
     * Attribute to hold <code>extractDestination</code> property.
     */
    private String extractDestination;

    /**
     * Attribute to hold <code>extractFormatType</code> property.
     */
    private ExtractFormatType extractFormatType;

    /**
     * Attribute to hold <code>extractOrigin</code> property.
     */
    private String extractOrigin;

    /**
     * Attribute to hold <code>pendingGovApprovalInd</code> property.
     */
    private boolean pendingGovApprovalInd;

    /**
     * Attribute to hold <code>rateSourceCode</code> property.
     */
    private String rateSourceCode;

    /**
     * Attribute to hold <code>rateTypeCode</code> property.
     */
    private String rateTypeCode;

    /**
     * Attribute to hold <code>ratingConventionType</code> property.
     */
    private RatingConventionType ratingConventionType;

    /**
     * Attribute to hold <code>updateDate</code> property.
     */
    private Date updateDate;

    /**
     * Attribute to hold <code>updateDateEmpty</code> property.
     */
    private boolean updateDateEmpty;

    /**
     * Attribute to hold <code>updateTime</code> property.
     */
    private String updateTime;

    /**
     * Gets the <code>carrierCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>carrierCode</code> property.
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Gets the <code>currency</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @return the current value of the <code>currency</code> property.
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Gets the <code>effectiveDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>effectiveDate</code> property.
     */
    public Date getEffectiveDate() {
        return ContractUtility.getClonedDate(this.effectiveDate);
    }

    /**
     * Gets the <code>extractDestination</code> property.
     * <p>
     * 
     * @return the current value of the <code>extractDestination</code> property.
     */
    public String getExtractDestination() {
        return extractDestination;
    }

    /**
     * Gets the <code>extractFormatType</code> property.
     * <p>
     * 
     * @return the current value of the <code>extractFormatType</code> property.
     */
    public ExtractFormatType getExtractFormatType() {
        return extractFormatType;
    }

    /**
     * Gets the <code>extractOrigin</code> property.
     * <p>
     * 
     * @return the current value of the <code>extractOrigin</code> property.
     */
    public String getExtractOrigin() {
        return extractOrigin;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Gets the <code>rateSourceCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateSourceCode</code> property.
     */
    public String getRateSourceCode() {
        return rateSourceCode;
    }

    /**
     * Gets the <code>rateTypeCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateTypeCode</code> property.
     */
    public String getRateTypeCode() {
        return rateTypeCode;
    }

    /**
     * Gets the <code>ratingConventionType</code> property.
     * <p>
     * 
     * @return the current value of the <code>ratingConventionType</code> property.
     */
    public RatingConventionType getRatingConventionType() {
        return ratingConventionType;
    }

    /**
     * Gets the <code>updateDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>updateDate</code> property.
     */
    public Date getUpdateDate() {
        return ContractUtility.getClonedDate(this.updateDate);
    }

    /**
     * Gets the <code>updateTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>updateTime</code> property.
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Gets the <code>allExtractDestinationIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>allExtractDestinationIndicator</code> property.
     */
    public boolean isAllExtractDestinationIndicator() {
        return allExtractDestinationIndicator;
    }

    /**
     * Gets the <code>allExtractOriginIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>allExtractOriginIndicator</code> property.
     */
    public boolean isAllExtractOriginIndicator() {
        return allExtractOriginIndicator;
    }

    /**
     * Gets the <code>biDirectionalIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>biDirectionalIndicator</code> property.
     */
    public boolean isBiDirectionalIndicator() {
        return biDirectionalIndicator;
    }

    /**
     * Gets the <code>pendingGovApprovalInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>pendingGovApprovalInd</code> property.
     */
    public boolean isPendingGovApprovalInd() {
        return pendingGovApprovalInd;
    }

    /**
     * Gets the <code>updateDateEmpty</code> property.
     * <p>
     * 
     * @return the current value of the <code>updateDateEmpty</code> property.
     */

    public boolean isUpdateDateEmpty() {
        return updateDateEmpty;
    }

    /**
     * Sets the <code>allExtractDestinationIndicator</code> data transfer object.
     * <p>
     * 
     * @param pAllExtractDestinationIndicator
     *            holds the new value of <code>allExtractDestinationIndicator</code> data
     *            transfer object.<br>
     */
    public void setAllExtractDestinationIndicator(
                final boolean pAllExtractDestinationIndicator) {
        this.allExtractDestinationIndicator = pAllExtractDestinationIndicator;
    }

    /**
     * Sets the <code>allExtractOriginIndicator</code> data transfer object.
     * <p>
     * 
     * @param pAllExtractOriginIndicator
     *            holds the new value of <code>allExtractOriginIndicator</code> data
     *            transfer object.<br>
     */
    public void setAllExtractOriginIndicator(
                final boolean pAllExtractOriginIndicator) {
        this.allExtractOriginIndicator = pAllExtractOriginIndicator;
    }

    /**
     * Sets the <code>biDirectionalIndicator</code> data transfer object.
     * <p>
     * 
     * @param pBiDirectionalIndicator
     *            holds the new value of <code>biDirectionalIndicator</code> data
     *            transfer object.<br>
     */
    public void setBiDirectionalIndicator(final boolean pBiDirectionalIndicator) {
        this.biDirectionalIndicator = pBiDirectionalIndicator;
    }

    /**
     * Sets the <code>carrierCode</code> data transfer object.
     * <p>
     * 
     * @param pCarrierCode
     *            holds the new value of <code>carrierCode</code> data
     *            transfer object.<br>
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = ContractUtility.convertToUpperCase(pCarrierCode);
    }

    /**
     * Sets the <code>currency</code> data transfer object.
     * <p>
     * 
     * @param pCurrency
     *            holds the new value of <code>currency</code> data
     *            transfer object.<br>
     */
    public void setCurrency(final String pCurrency) {
        this.currency = ContractUtility.convertToUpperCase(pCurrency);
    }

    /**
     * Sets the <code>effectiveDate</code> data transfer object.
     * <p>
     * 
     * @param pEffectiveDate
     *            holds the new value of <code>effectiveDate</code> data
     *            transfer object.<br>
     */
    public void setEffectiveDate(final Date pEffectiveDate) {
        this.effectiveDate = ContractUtility.getClonedDate(pEffectiveDate);
    }

    /**
     * Sets the <code>extractDestination</code> data transfer object.
     * <p>
     * 
     * @param pExtractDestination
     *            holds the new value of <code>extractDestination</code> data
     *            transfer object.<br>
     */
    public void setExtractDestination(final String pExtractDestination) {
        this.extractDestination = ContractUtility
                    .convertToUpperCase(pExtractDestination);
    }

    /**
     * Sets the <code>extractFormatType</code> data transfer object.
     * <p>
     * 
     * @param pExtractFormatType
     *            holds the new value of <code>extractFormatType</code> data
     *            transfer object.<br>
     */
    public void setExtractFormatType(final ExtractFormatType pExtractFormatType) {
        this.extractFormatType = pExtractFormatType;
    }

    /**
     * Sets the <code>extractOrigin</code> data transfer object.
     * <p>
     * 
     * @param pExtractOrigin
     *            holds the new value of <code>extractOrigin</code> data
     *            transfer object.<br>
     */
    public void setExtractOrigin(final String pExtractOrigin) {
        this.extractOrigin = ContractUtility.convertToUpperCase(pExtractOrigin);
    }

    /**
     * Sets the <code>pendingGovApprovalInd</code>.
     * <p>
     * 
     * @param pPendingGovApprovalInd
     *            holds the new value of <code>pendingGovApprovalInd</code> data
     *            transfer object.<br>
     */
    public void setPendingGovApprovalInd(final boolean pPendingGovApprovalInd) {
        this.pendingGovApprovalInd = pPendingGovApprovalInd;
    }

    /**
     * Sets the <code>rateSourceCode</code> data transfer object.
     * <p>
     * 
     * @param pRateSourceCode
     *            holds the new value of <code>rateSourceCode</code> data
     *            transfer object.<br>
     */
    public void setRateSourceCode(final String pRateSourceCode) {
        this.rateSourceCode = ContractUtility
                    .convertToUpperCase(pRateSourceCode);
    }

    /**
     * Sets the <code>rateTypeCode</code> data transfer object.
     * <p>
     * 
     * @param pRateTypeCode
     *            holds the new value of <code>rateTypeCode</code> data
     *            transfer object.<br>
     */
    public void setRateTypeCode(final String pRateTypeCode) {
        this.rateTypeCode = ContractUtility.convertToUpperCase(pRateTypeCode);
    }

    /**
     * Sets the <code>ratingConventionType</code> data transfer object.
     * <p>
     * 
     * @param pRatingConventionType
     *            holds the new value of <code>ratingConventionType</code> data
     *            transfer object.<br>
     */
    public void setRatingConventionType(
                final RatingConventionType pRatingConventionType) {
        this.ratingConventionType = pRatingConventionType;
    }

    /**
     * Sets the <code>updateDate</code> data transfer object.
     * <p>
     * 
     * @param pUpdateDate
     *            holds the new value of <code>updateDate</code> data
     *            transfer object.<br>
     */
    public void setUpdateDate(final Date pUpdateDate) {
        this.updateDate = ContractUtility.getClonedDate(pUpdateDate);
    }

    /**
     * Sets the <code>updateDateEmpty</code> data transfer object.
     * <p>
     * 
     * @param pUpdateDateEmpty
     *            holds the new value of <code>updateDateEmpty</code> data
     *            transfer object.<br>
     */
    public void setUpdateDateEmpty(final boolean pUpdateDateEmpty) {
        this.updateDateEmpty = pUpdateDateEmpty;
    }

    /**
     * Sets the <code>updateTime</code> data transfer object.
     * <p>
     * 
     * @param pUpdateTime
     *            holds the new value of <code>updateTime</code> data
     *            transfer object.<br>
     */
    public void setUpdateTime(final String pUpdateTime) {
        this.updateTime = pUpdateTime;
    }
}
