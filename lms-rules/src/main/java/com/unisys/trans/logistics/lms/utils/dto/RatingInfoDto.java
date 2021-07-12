/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>RatingInfoDto</code> contains specific data applicable to the country rating information.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>billingCurrencyCode</code></li>
 * <li><code>currentAdditionalTariffRate</code></li>
 * <li><code>currentDiscountinueDate</code></li>
 * <li><code>currentEffectiveDate</code></li>
 * <li><code>currentPublicationCurrency</code></li>
 * <li><code>currentUsdIndicator</code></li>
 * <li><code>historyAdditionalTariffRate</code></li>
 * <li><code>historyDiscontinueDate</code></li>
 * <li><code>historyEffectiveDate</code></li>
 * <li><code>historyPublicationCurrency</code></li>
 * <li><code>historyUsdIndicator</code></li>
 * <li><code>localCurrencyCode</code></li>
 * <li><code>localCurrencyName</code></li>
 * <li><code>localCurrencyNumericCode</code></li>
 * <li><code>localRatingCurrencyCode</code></li>
 * <li><code>pendingAdditionalTariffRate</code></li>
 * <li><code>pendingDiscontinueDate</code></li>
 * <li><code>pendingEffectiveDate</code></li>
 * <li><code>pendingPublicationCurrency</code></li>
 * <li><code>pendingUsdIndicator</code></li>
 * </ul>
 */
public class RatingInfoDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -638319607471285449L;

    /**
     * Attribute to hold <code>billingCurrencyCode</code> property.
     */
    private String billingCurrencyCode;

    /**
     * Attribute to hold <code>currentAdditionalTariffRate</code> property.
     */
    private String currentAdditionalTariffRate;

    /**
     * Attribute to hold <code>currentDiscountinueDate</code> property.
     */
    private Date currentDiscontinueDate;

    /**
     * Attribute to hold <code>currentEffectiveDate</code> property.
     */
    private Date currentEffectiveDate;

    /**
     * Attribute to hold <code>currentPublicationCurrency</code> property.
     */
    private String currentPublicationCurrency;

    /**
     * Attribute to hold <code>currentUsdIndicator</code> property.
     */
    private boolean currentUsdIndicator;

    /**
     * Attribute to hold <code>historyAdditionalTariffRate</code> property.
     */
    private String historyAdditionalTariffRate;

    /**
     * Attribute to hold <code>historyDiscontinueDate</code> property.
     */
    private Date historyDiscontinueDate;

    /**
     * Attribute to hold <code>historyEffectiveDate</code> property.
     */
    private Date historyEffectiveDate;

    /**
     * Attribute to hold <code>historyPublicationCurrency</code> property.
     */
    private String historyPublicationCurrency;

    /**
     * Attribute to hold <code>ttyToAddress</code> property.
     */
    private boolean historyUsdIndicator;

    /**
     * Attribute to hold <code>localCurrencyCode</code> property.
     */
    private String localCurrencyCode;
    private String payCargoCurrencyCode;

    /**
     * Attribute to hold <code>localCurrencyName</code> property.
     */
    private String localCurrencyName;

    /**
     * Attribute to hold <code>localCurrencyNumericCode</code> property.
     */
    private String localCurrencyNumericCode;

    /**
     * Attribute to hold <code>localRatingCurrencyCode</code> property.
     */
    private String localRatingCurrencyCode;

    /**
     * Attribute to hold <code>pendingAdditionalTariffRate</code> property.
     */
    private String pendingAdditionalTariffRate;

    /**
     * Attribute to hold <code>pendingDiscontinueDate</code> property.
     */
    private Date pendingDiscontinueDate;

    /**
     * Attribute to hold <code>pendingEffectiveDate</code> property.
     */
    private Date pendingEffectiveDate;

    /**
     * Attribute to hold <code>pendingPublicationCurrency</code> property.
     */
    private String pendingPublicationCurrency;

    /**
     * Attribute to hold <code>pendingUsdIndicator</code> property.
     */
    private boolean pendingUsdIndicator;

    /**
     * <code>Default constructor.</code>
     */
    public RatingInfoDto() {

    }

    /**
     * Gets the value of the <code>billingCurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * DEM
     * 
     * @return <code>String</code><br>
     *         Returns the <code>billingCurrencyCode</code> of the country.<br>
     *         </p>
     */
    public String getBillingCurrencyCode() {
        return this.billingCurrencyCode;
    }

    /**
     * Gets the value of the <code>currentAddnlTariffRate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * FRF
     * 
     * @return <code>String</code><br>
     *         Returns the <code>currentAddnlTariffRate</code> of the country.<br>
     *         </p>
     */
    public String getCurrentAdditionalTariffRate() {
        return this.currentAdditionalTariffRate;
    }

    /**
     * Gets the value of the <code>currentDiscountinueDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 DATE ddMMMyy,INDEF<br>
     * <b>Example: </b><br>
     * 06MAR07
     * 
     * @return <code>Date</code><br>
     *         Returns the <code>currentDiscountinueDate</code> of the country.<br>
     *         </p>
     */
    public Date getCurrentDiscontinueDate() {
        return ContractUtility.getClonedDate(this.currentDiscontinueDate);
    }

    /**
     * Gets the value of the <code>currentEffectiveDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 DATE ddMMMyy<br>
     * <b>Example: </b><br>
     * 06MAR07
     * 
     * @return <code>Date</code><br>
     *         Returns the <code>currentEffectiveDate</code> of the country.<br>
     *         </p>
     */
    public Date getCurrentEffectiveDate() {
        return ContractUtility.getClonedDate(this.currentEffectiveDate);
    }

    /**
     * Gets the value of the <code>currentPublicationCurrency</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * EUR
     * 
     * @return <code>String</code><br>
     *         Returns the <code>currentPublicationCurrency</code> of the country.<br>
     *         </p>
     */
    public String getCurrentPublicationCurrency() {
        return this.currentPublicationCurrency;
    }

    /**
     * Gets the value of the <code>historyAddnlTariffRate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * FRF
     * 
     * @return <code>String</code><br>
     *         Returns the <code>historyAddnlTariffRate</code> of the country.<br>
     *         </p>
     */
    public String getHistoryAdditionalTariffRate() {
        return this.historyAdditionalTariffRate;
    }

    /**
     * Gets the value of the <code>historyDiscontinueDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 DATE ddMMMyy,INDEF<br>
     * <b>Example: </b><br>
     * 06MAR07
     * 
     * @return <code>Date</code><br>
     *         Returns the <code>historyDiscontinueDate</code> of the country.<br>
     *         </p>
     */
    public Date getHistoryDiscontinueDate() {
        return ContractUtility.getClonedDate(this.historyDiscontinueDate);
    }

    /**
     * Gets the value of the <code>historyEffectiveDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 DATE ddMMMyy<br>
     * <b>Example: </b><br>
     * 06MAR07
     * 
     * @return <code>Date</code><br>
     *         Returns the <code>historyEffectiveDate</code> of the country.<br>
     *         </p>
     */
    public Date getHistoryEffectiveDate() {
        return ContractUtility.getClonedDate(this.historyEffectiveDate);
    }

    /**
     * Gets the value of the <code>historyPublicationCurrency</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * EUR
     * 
     * @return <code>String</code><br>
     *         Returns the <code>historyPublicationCurrency</code> of the country.<br>
     *         </p>
     */
    public String getHistoryPublicationCurrency() {
        return this.historyPublicationCurrency;
    }

    /**
     * Gets the value of the <code>localCurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * DEM
     * 
     * @return <code>String</code><br>
     *         Returns the <code>localCurrencyCode</code> of the country.<br>
     *         </p>
     */
    public String getLocalCurrencyCode() {
        return this.localCurrencyCode;
    }

    /**
     * Gets the value of the <code>localRatingCurrencyName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-12 Alpha<br>
     * <b>Example: </b><br>
     * EURO
     * 
     * @return <code>String</code><br>
     *         Returns the <code>localRatingCurrencyName</code> of the country.<br>
     *         </p>
     */
    public String getLocalCurrencyName() {
        return this.localCurrencyName;
    }

    /**
     * Gets the value of the <code>locRatingCurrNumericCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric<br>
     * <b>Example: </b><br>
     * 978
     * 
     * @return <code>int</code><br>
     *         Returns the <code>locRatingCurrNumericCode</code> of the country.<br>
     *         </p>
     */
    public String getLocalCurrencyNumericCode() {
        return this.localCurrencyNumericCode;
    }

    /**
     * Gets the value of the <code>localRatingCurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * EUR
     * 
     * @return <code>String</code><br>
     *         Returns the <code>localRatingCurrencyCode</code> of the country.<br>
     *         </p>
     */
    public String getLocalRatingCurrencyCode() {
        return this.localRatingCurrencyCode;
    }

    /**
     * Gets the value of the <code>pendingAddnlTariffRate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * FRF
     * 
     * @return <code>String</code><br>
     *         Returns the <code>pendingAddnlTariffRate</code> of the country.<br>
     *         </p>
     */
    public String getPendingAdditionalTariffRate() {
        return this.pendingAdditionalTariffRate;
    }

    /**
     * Gets the value of the <code>pendingDiscontinueDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 DATE ddMMMyy,INDEF<br>
     * <b>Example: </b><br>
     * 06MAR07
     * 
     * @return <code>Date</code><br>
     *         Returns the <code>pendingDiscontinueDate</code> of the country.<br>
     *         </p>
     */
    public Date getPendingDiscontinueDate() {
        return ContractUtility.getClonedDate(this.pendingDiscontinueDate);
    }

    /**
     * Gets the value of the <code>pendingEffectiveDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 DATE ddMMMyy<br>
     * <b>Example: </b><br>
     * 06MAR07
     * 
     * @return <code>Date</code><br>
     *         Returns the <code>pendingEffectiveDate</code> of the country.<br>
     *         </p>
     */
    public Date getPendingEffectiveDate() {
        return ContractUtility.getClonedDate(this.pendingEffectiveDate);
    }

    /**
     * Gets the value of the <code>pendingPublicationCurr</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * EUR
     * 
     * @return <code>String</code><br>
     *         Returns the <code>pendingPublicationCurr</code> of the country.<br>
     *         </p>
     */
    public String getPendingPublicationCurrency() {
        return this.pendingPublicationCurrency;
    }

    /**
     * Determines if the <code>awbImpCustomsIndicator</code> property is true.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - Allows USD as another valid currency.<br>
     * <code>false</code> - Does not allow USD as another valid currency ( may already be valid).<br>
     * 
     * @return The current value of <code>currentUsdIndicator</code> property.<br>
     *         </p>
     */
    public boolean isCurrentUsdIndicator() {
        return this.currentUsdIndicator;
    }

    /**
     * Determines if the <code>historyUsdIndicator</code> property is true.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - Allows USD as another valid currency.<br>
     * <code>false</code> - Does not allow USD as another valid currency ( may already be valid).<br>
     * 
     * @return The current value of <code>historyUsdIndicator</code> property.<br>
     *         </p>
     */
    public boolean isHistoryUsdIndicator() {
        return this.historyUsdIndicator;
    }

    /**
     * Determines if the <code>pendingUsdIndicator</code> property is true.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - Allow USDs as another valid currency.<br>
     * <code>false</code> - Does not allow USD as another valid currency ( may already be valid).<br>
     * 
     * @return The current value of <code>pendingUsdIndicator</code> property.<br>
     *         </p>
     */
    public boolean isPendingUsdIndicator() {
        return this.pendingUsdIndicator;
    }

    /**
     * Sets the value of the <code>billingCurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * DEM
     * 
     * @param pBillingCurrencyCode <code>String</code><br>
     *            The new value of the <code>billingCurrencyCode</code> property.<br>
     *            </p>
     */
    public void setBillingCurrencyCode(final String pBillingCurrencyCode) {

        this.billingCurrencyCode = ContractUtility.convertToUpperCase(pBillingCurrencyCode);
    }

    /**
     * Sets the value of the <code>currentAdditionalTariffRate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * FRF
     * 
     * @param pCurrentAdditionalTariffRate <code>String</code><br>
     *            The new value of the <code>currentAdditionalTariffRate</code> property.<br>
     *            </p>
     */
    public void setCurrentAdditionalTariffRate(final String pCurrentAdditionalTariffRate) {
        this.currentAdditionalTariffRate = ContractUtility.convertToUpperCase(pCurrentAdditionalTariffRate);
    }

    /**
     * Sets the value of the <code>currentDiscountinueDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 DATE ddMMMyy,INDEF<br>
     * <b>Example: </b><br>
     * 06MAR07,INDEF
     * 
     * @param pCurrentDiscontinueDate <code>String</code><br>
     *            The new value of the <code>currentDiscountinueDate</code> property.<br>
     *            </p>
     */
    public void setCurrentDiscontinueDate(final Date pCurrentDiscontinueDate) {
        this.currentDiscontinueDate = ContractUtility.getClonedDate(pCurrentDiscontinueDate);
    }

    /**
     * Sets the value of the <code>currentEffectiveDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 DATE ddMMMyy<br>
     * <b>Example: </b><br>
     * 06MAR07
     * 
     * @param pCurrentEffectiveDate <code>Date</code><br>
     *            The new value of the <code>currentEffectiveDate</code> property.<br>
     *            </p>
     */
    public void setCurrentEffectiveDate(final Date pCurrentEffectiveDate) {
        this.currentEffectiveDate = ContractUtility.getClonedDate(pCurrentEffectiveDate);
    }

    /**
     * Sets the value of the <code>currentPublicationCurrency</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * EUR
     * 
     * @param pCurrentPublicationCurrency <code>String</code><br>
     *            The new value of the <code>currentPublicationCurrency</code> property.<br>
     *            </p>
     */
    public void setCurrentPublicationCurrency(final String pCurrentPublicationCurrency) {

        this.currentPublicationCurrency = ContractUtility.convertToUpperCase(pCurrentPublicationCurrency);
    }

    /**
     * Sets the value of the <code>currentUsdIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - Allows USD as another valid currency.<br>
     * <code>false</code> - Does not allow USD as another valid currency ( may already be valid).<br>
     * 
     * @param pCurrentUsdIndicator <code>boolean</code><br>
     *            The new value of the <code>currentUsdIndicator</code> property.<br>
     *            </p>
     */
    public void setCurrentUsdIndicator(final boolean pCurrentUsdIndicator) {
        this.currentUsdIndicator = pCurrentUsdIndicator;
    }

    /**
     * Sets the value of the <code>historyAdditionalTariffRate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * FRF
     * 
     * @param pHistoryAdditionalTariffRate <code>String</code><br>
     *            The new value of the <code>historyAdditionalTariffRate</code> property.<br>
     *            </p>
     */
    public void setHistoryAdditionalTariffRate(final String pHistoryAdditionalTariffRate) {
        this.historyAdditionalTariffRate = ContractUtility.convertToUpperCase(pHistoryAdditionalTariffRate);
    }

    /**
     * Sets the value of the <code>historyDiscontinueDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 DATE ddMMMyy,INDEF<br>
     * <b>Example: </b><br>
     * 06MAR07,INDEF
     * 
     * @param pHistoryDiscontinueDate <code>String</code><br>
     *            The new value of the <code>historyDiscontinueDate</code> property.<br>
     *            </p>
     */
    public void setHistoryDiscontinueDate(final Date pHistoryDiscontinueDate) {
        this.historyDiscontinueDate = ContractUtility.getClonedDate(pHistoryDiscontinueDate);
    }

    /**
     * Sets the value of the <code>historyEffectiveDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 DATE ddMMMyy<br>
     * <b>Example: </b><br>
     * 06MAR07
     * 
     * @param pHistoryEffectiveDate <code>String</code><br>
     *            The new value of the <code>historyEffectiveDate</code> property.<br>
     *            </p>
     */
    public void setHistoryEffectiveDate(final Date pHistoryEffectiveDate) {
        this.historyEffectiveDate = ContractUtility.getClonedDate(pHistoryEffectiveDate);
    }

    /**
     * Sets the value of the <code>historyPublicationCurrency</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * EUR
     * 
     * @param pHistoryPublicationCurrency <code>String</code><br>
     *            The new value of the <code>historyPublicationCurrency</code> property.<br>
     *            </p>
     */
    public void setHistoryPublicationCurrency(final String pHistoryPublicationCurrency) {

        this.historyPublicationCurrency = ContractUtility.convertToUpperCase(pHistoryPublicationCurrency);
    }

    /**
     * Sets the value of the <code>historyUsdIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - Allows USD as another valid currency.<br>
     * <code>false</code> - Does not allow USD as another valid currency ( may already be valid).<br>
     * 
     * @param pHistoryUsdIndicator <code>boolean</code><br>
     *            The new value of the <code>historyUsdIndicator</code> property.<br>
     *            </p>
     */
    public void setHistoryUsdIndicator(final boolean pHistoryUsdIndicator) {
        this.historyUsdIndicator = pHistoryUsdIndicator;
    }

    /**
     * Sets the value of the <code>localCurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * DEM
     * 
     * @param pLocalCurrencyCode <code>String</code><br>
     *            The new value of the <code>localCurrencyCode</code> property.<br>
     *            </p>
     */
    public void setLocalCurrencyCode(final String pLocalCurrencyCode) {

        this.localCurrencyCode = ContractUtility.convertToUpperCase(pLocalCurrencyCode);
    }

    /**
     * Sets the value of the <code>localCurrencyName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-12 Alpha<br>
     * <b>Example: </b><br>
     * EURO
     * 
     * @param pLocalCurrencyName <code>String</code><br>
     *            The new value of the <code>localCurrencyName</code> property.<br>
     *            </p>
     */
    public void setLocalCurrencyName(final String pLocalCurrencyName) {
        this.localCurrencyName = pLocalCurrencyName;
    }

    /**
     * Sets the value of the <code>localCurrencyNumericCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric<br>
     * <b>Example: </b><br>
     * 978
     * 
     * @param pLocalCurrencyNumericCode <code>int</code><br>
     *            The new value of the <code>localCurrencyNumericCode</code> property.<br>
     *            </p>
     */
    public void setLocalCurrencyNumericCode(final String pLocalCurrencyNumericCode) {
        this.localCurrencyNumericCode = pLocalCurrencyNumericCode;
    }

    /**
     * Sets the value of the <code>localRatingCurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * EUR
     * 
     * @param pLocalRatingCurrencyCode <code>String</code><br>
     *            The new value of the <code>localRatingCurrencyCode</code> property.<br>
     *            </p>
     */
    public void setLocalRatingCurrencyCode(final String pLocalRatingCurrencyCode) {

        this.localRatingCurrencyCode = ContractUtility.convertToUpperCase(pLocalRatingCurrencyCode);
    }

    /**
     * Sets the value of the <code>pendingAdditionalTariffRate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * FRF
     * 
     * @param pPendingAdditionalTariffRate <code>String</code><br>
     *            The new value of the <code>pendingAdditionalTariffRate</code> property.<br>
     *            </p>
     */
    public void setPendingAdditionalTariffRate(final String pPendingAdditionalTariffRate) {
        this.pendingAdditionalTariffRate = ContractUtility.convertToUpperCase(pPendingAdditionalTariffRate);
    }

    /**
     * Sets the value of the <code>pendingDiscontinueDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 DATE ddMMMyy,INDEF<br>
     * <b>Example: </b><br>
     * 06MAR07,INDEF
     * 
     * @param pPendingDiscontinueDate <code>String</code><br>
     *            The new value of the <code>pendingDiscontinueDate</code> property.<br>
     *            </p>
     */
    public void setPendingDiscontinueDate(final Date pPendingDiscontinueDate) {
        this.pendingDiscontinueDate = ContractUtility.getClonedDate(pPendingDiscontinueDate);
    }

    /**
     * Sets the value of the <code>pendingEffectiveDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 DATE ddMMMyy<br>
     * <b>Example: </b><br>
     * 06MAR07
     * 
     * @param pPendingEffectiveDate <code>String</code><br>
     *            The new value of the <code>pendingEffectiveDate</code> property.<br>
     *            </p>
     */
    public void setPendingEffectiveDate(final Date pPendingEffectiveDate) {
        this.pendingEffectiveDate = ContractUtility.getClonedDate(pPendingEffectiveDate);
    }

    /**
     * Sets the value of the <code>pendingPublicationCurrency</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * EUR
     * 
     * @param pPendingPublicationCurrency <code>String</code><br>
     *            The new value of the <code>pendingPublicationCurrency</code> property.<br>
     *            </p>
     */
    public void setPendingPublicationCurrency(final String pPendingPublicationCurrency) {

        this.pendingPublicationCurrency = ContractUtility.convertToUpperCase(pPendingPublicationCurrency);
    }

    /**
     * Sets the value of the <code>pendingUsdIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - Allows USD as another valid currency.<br>
     * <code>false</code> - Does not allow USD as another valid currency ( may already be valid).<br>
     * 
     * @param pPendingUsdIndicator <code>boolean</code><br>
     *            The new value of the <code>pendingUsdIndicator</code> property.<br>
     *            </p>
     */
    public void setPendingUsdIndicator(final boolean pPendingUsdIndicator) {
        this.pendingUsdIndicator = pPendingUsdIndicator;
    }

    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RatingInfoDto [");
        final Object[] obj = new Object[0];
        for (Method method : this.getClass().getMethods()) {
            try {
                if (method.getName().startsWith("get")) {
                    stringBuilder.append(method.getName().substring(3) + " = " + method.invoke(this, obj)
                                + ", ");
                }
                else if (method.getName().startsWith("is")) {
                    stringBuilder.append(method.getName().substring(2) + " = " + method.invoke(this, obj)
                                + ", ");
                }
            }
            catch (Exception e) {
                // TODO Auto-generated catch block
                stringBuilder.append(e.getMessage());
            }
        }
        if (stringBuilder.toString().trim().endsWith(",")) {
            stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new RatingInfoDto());
    }
	public String getPayCargoCurrencyCode() {
		return payCargoCurrencyCode;
	}
	public void setPayCargoCurrencyCode(String payCargoCurrencyCode) {
		this.payCargoCurrencyCode = payCargoCurrencyCode;
	}
}
