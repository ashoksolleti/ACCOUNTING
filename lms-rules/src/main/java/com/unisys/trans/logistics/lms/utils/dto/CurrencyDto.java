/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <code>CurrencyDto</code> holds all the attributes that are associated to a currency.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>deletedUser
 * <li>description
 * <li>endDate
 * <li>euroStartDate
 * <li>isoCode
 * <li>numericCode
 * <li>oId
 * <li>roundingFactors
 * </code>
 * </ul>
 */
public class CurrencyDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1268327188097544905L;

    /**
     * Attribute to hold <code>deletedUser</code> property.
     */
    private String deletedUser;

    /**
     * Attribute to hold <code>description</code> property.
     * <p>
     * Holds the description of the currency.
     */
    private String description;

    /**
     * Attribute to hold <code>endDate</code> property.
     * <p>
     * A currency which has an end date is marked for deletion and it will be purged permanently on the given
     * end date by means of Periodic File Maintenance.<br>
     * Otherwise, the currency which has been marked for deletion can be restored on or before the currency
     * end date.
     */
    private Date endDate;

    /**
     * Attribute to hold <code>euroStartDate</code> property.
     * <p>
     * When the Euro start date exists for a currency code the currency becomes the former currency.<br>
     * <code>Former currency</code> is applicable only for countries that are or will be using EUR currency.
     * The former currency is the country’s currency prior to using EUR currency.
     */
    private Date euroStartDate;

    /**
     * Attribute to hold <code>currencyCode</code> property.
     * <p>
     * The <code>currency code</code> is unique and it is a predefined ISO code.
     */
    private String isoCode;

    /**
     * Attribute to hold <code>numericCode</code> property.
     * <p>
     * The <code>numericCode</code> is unique.
     */
    private String numericCode;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key identify the <code>CurrencyDto</code>.It is of type Long.<br>
     */
    private Long oId;

    /**
     * Attribute to hold <code>retainIndicator</code> property.
     */
    private boolean retainIndicator;

    /**
     * Attribute to hold list of <code>RoundingFactorDto</code> that are associated to a
     * <code>CurrencyDto</code>.
     */
    private List<RoundingFactorDto> roundingFactors = new ArrayList<RoundingFactorDto>();

    /**
     * <code>Default constructor. </code>
     */
    public CurrencyDto() {

    }

    /**
     * Constructor with <code>isoCode</code> and <code>numericCode</code> as an argument.
     * <p>
     * 
     * @param pIsoCode the new value of <code>isoCode</code>.<br>
     *            <p>
     * @param pNumericCode the new value of <code>numericCode</code>.<br>
     */
    public CurrencyDto(final String pIsoCode, final String pNumericCode) {
        this.isoCode = pIsoCode;
        this.numericCode = pNumericCode;
    }

    /**
     * Adds the rounding factor information to the <code>roundingFactors</code> property.
     * <p>
     * The rounding factor information associated with the currency.
     * <p>
     * 
     * @param pRoundingFactorDto the new rounding factor information to be added to the
     *            <code>roundingFactors</code> property.
     */
    public void addRoundingFactor(final RoundingFactorDto pRoundingFactorDto) {
        this.roundingFactors.add(pRoundingFactorDto);
    }

    /**
     * Gets the <code>deletedUser</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * TESTER
     * <p>
     * 
     * @return the current value of <code>deletedUser</code> property.<br>
     */
    public String getDeletedUser() {
        return this.deletedUser;
    }

    /**
     * Gets the <code>description</code> property.
     * <p>
     * This represents the text description of currency code.
     * <p>
     * <b>Format: </b><br>
     * 1-75 Character set of all types including alphabets, numbers, hyphen, space, dot and any other special
     * characters.
     * <p>
     * <b>Example: </b><br>
     * CANADIAN DOLLAR.
     * <p>
     * 
     * @return the current value of <code>description</code> property.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the <code>endDate</code> property.
     * <p>
     * A currency which has an end date is marked for deletion and it will be purged permanently on the given
     * end date by means of Periodic File Maintenance. Optionally, the currency marked for deletion can be
     * restored on or before the currency end date.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @return the current value of <code>endDate</code> property.
     */
    public Date getEndDate() {
        return ContractUtility.getClonedDate(this.endDate);
    }

    /**
     * Gets the <code>euroStartDate</code> property.
     * <p>
     * When a Euro start date is entered for a currency code, the currency turns 'former currency'.<br>
     * <code>Former currency</code> is applicable only for countries that are or will be using EUR currency.
     * The former currency is the country’s currency prior to using EUR currency.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @return the current value of <code>euroStartDate</code> property.
     */
    public Date getEuroStartDate() {
        return ContractUtility.getClonedDate(this.euroStartDate);
    }

    /**
     * Gets the <code>isoCode</code> property.
     * <p>
     * The <code>currency code</code> is unique and it is a predefined ISO code.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * CAD
     * <p>
     * 
     * @return the current value of <code>isoCode</code> property.
     */
    public String getIsoCode() {
        return this.isoCode;
    }

    /**
     * Gets the <code>numericCode</code> property.
     * <p>
     * The <code>numericCode</code> is unique.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric
     * <p>
     * <b>Example: </b><br>
     * 124
     * <p>
     * 
     * @return the current value of <code>numericCode</code> property.
     */
    public String getNumericCode() {
        return this.numericCode;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>roundingFactors</code> property.
     * <p>
     * The rounding factor information associated with the currency.
     * <p>
     * 
     * @return the current value of <code>roundingFactors</code> property.
     */
    public List<RoundingFactorDto> getRoundingFactors() {
        return this.roundingFactors;
    }

    /**
     * <li>Gets the RetainIndicator.</li>
     * <p>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     * @return <code>boolean</code><br>
     *         Returns the RetainIndicator.<br>
     */

    public boolean getRetainIndicator() {
        return this.retainIndicator;
    }

    /**
     * Sets the <code>deletedUser</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric <br>
     * <p>
     * <b>Example: </b><br>
     * Tester
     * <p>
     * 
     * @param pDeletedUser the new value of <code>deletedUser</code> property.<br>
     */
    public void setDeletedUser(final String pDeletedUser) {
        this.deletedUser = pDeletedUser;
    }

    /**
     * Sets the <code>description</code> property.<br>
     * <p>
     * This represents the text description of currency code.
     * <p>
     * <b>Format: </b><br>
     * 1-75 Character set of all types including alphabets, numbers, hyphen, space, dot and any other special
     * characters.
     * <p>
     * <b>Example: </b><br>
     * CANADIAN DOLLAR.
     * <p>
     * 
     * @param pDescription the new value of <code>description</code> property.<br>
     */
    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Sets the <code>endDate</code> property.<br>
     * <p>
     * A currency which has an end date is marked for deletion and it will be purged permanently on the given
     * end date by means of Periodic File Maintenance. Optionally, the currency marked for deletion can be
     * restored on or before the currency end date.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @param pEndDate the new value of <code>endDate</code> property.<br>
     */
    public void setEndDate(final Date pEndDate) {
        this.endDate = ContractUtility.getClonedDate(pEndDate);
    }

    /**
     * Sets the <code>euroStartDate</code> property.<br>
     * <p>
     * When a Euro start date is entered for a currency code, the currency turns 'former currency'.<br>
     * <code>Former currency</code> is applicable only for countries that are or will be using EUR currency.
     * The former currency is the country’s currency prior to using EUR currency.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @param pEuroStartDate the new value of <code>euroStartDate</code> property.<br>
     */
    public void setEuroStartDate(final Date pEuroStartDate) {
        this.euroStartDate = ContractUtility.getClonedDate(pEuroStartDate);
    }

    /**
     * Sets the <code>isoCode</code> property.<br>
     * <p>
     * The <code>currency code</code> is unique and it is a predefined ISO code.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * CAD
     * <p>
     * 
     * @param pIsoCode the new value of <code>isoCode</code> property.<br>
     */
    public void setIsoCode(final String pIsoCode) {
        this.isoCode = ContractUtility.convertToUpperCase(pIsoCode);
    }

    /**
     * Sets the <code>numericCode</code> property.<br>
     * <p>
     * The <code>numericCode</code> is unique.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric
     * <p>
     * <b>Example: </b><br>
     * 124
     * <p>
     * 
     * @param pNumericCode the new value of <code>numericCode</code> property.<br>
     */
    public void setNumericCode(final String pNumericCode) {
        this.numericCode = pNumericCode;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>retainIndicator</code> property.
     * 
     * @param pRetainIndicator
     *            the new value of the <code>retainIndicator</code> property.
     */
    public void setRetainIndicator(final boolean pRetainIndicator) {
        this.retainIndicator = pRetainIndicator;
    }

    /**
     * Sets the <code>roundingFactors</code> property.
     * <p>
     * The rounding factor information associated with the currency.
     * <p>
     * 
     * @param pRoundingFactors the new value of <code>roundingFactors</code> property.
     */
    public void setRoundingFactors(final List<RoundingFactorDto> pRoundingFactors) {
        this.roundingFactors = pRoundingFactors;
    }
}
