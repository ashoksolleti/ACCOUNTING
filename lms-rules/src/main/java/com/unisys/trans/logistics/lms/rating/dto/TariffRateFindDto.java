/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.constants.GeographicType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>TariffRateFindDto</code> contain details to retrieve TariffRate Information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>carrierCode
 * <li>currencyCode
 * <li>destinationCode
 * <li>destinationType
 * <li>originCode
 * <li>originType
 * <li>rateSourceCode
 * <li>rateTypeCode
 * </ul>
 */

public class TariffRateFindDto extends AbstractRequest {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>currencyCode</code> property.
     */
    private String currencyCode;

    /**
     * Attribute to hold <code>destinationCode</code> property.
     */
    private String destinationCode;

    /**
     * Attribute to hold <code>destinationType</code> property.
     */
    private GeographicType destinationType;

    /**
     * Attribute to hold <code>executionDate</code> property.
     */
    private Date executionDate;

    /**
     * Attribute to hold <code>originCode</code> property.
     */
    private String originCode;

    /**
     * Attribute to hold <code>originType</code> property.
     */
    private GeographicType originType;

    /**
     * Attribute to hold <code>rateSourceCode</code> property.
     */
    private String rateSourceCode;
    
    /**
     * Attribute to hold <code>rateTypeCode</code> property.
     */
    private String rateTypeCode;

    /**
     * Gets the <code>CarrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * UW.
     * <p>
     * 
     * @return the current value of the <code>carrierCode</code> property.
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the <code>CurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @return the current value of the <code>currencyCode</code> property.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

	/**
     * Gets the <code>DestinationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2A for Country Code. 3A for Airport,City Code. 4-7 for Aggregate. AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * EUR1
     * <p>
     * 
     * @return the current value of the <code>destinationCode</code> property.
     */
    public String getDestinationCode() {
        return this.destinationCode;
    }

	/**
     * Gets the <code>DestinationType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Airport,city,Country,Aggregate List.
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of the <code>destinationType</code> property.
     */
    public GeographicType getDestinationType() {
        return this.destinationType;
    }

    /**
     * Gets the <code>executionDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @return the current value of the <code>executionDate</code> property.
     */
	public Date getExecutionDate() {
		return ContractUtility.getClonedDate(this.executionDate);
	}

    /**
     * Gets the <code>OriginCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2A for Country Code. 3A for Airport,City Code. 4-7 for Aggregate. AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * USA1.
     * <p>
     * 
     * @return the current value of the <code>originCode</code> property.
     */
    public String getOriginCode() {
        return this.originCode;
    }

    /**
     * Gets the <code>OriginType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Airport,city,Country,Aggregate List.
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of the <code>originType</code> property.
     */
    public GeographicType getOriginType() {
        return this.originType;
    }

    /**
     * Gets the <code>RateSourceCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Characters
     * <p>
     * <b>Example: </b><br>
     * IRI
     * <p>
     * 
     * @return the current value of the <code>rateSourceCode</code> property.
     */
    public String getRateSourceCode() {
        return this.rateSourceCode;
    }

    /**
     * Gets the <code>RateTypeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @return the current value of the <code>rateTypeCode</code> property.
     */
    public String getRateTypeCode() {
        return this.rateTypeCode;
    }

    /**
     * Sets the <code>CarrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * UW.
     * <p>
     * 
     * @param pCarrierCode
     *            the current value of the <code>carrierCode</code> property.
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = ContractUtility.convertToUpperCase(pCarrierCode);
    }

    /**
     * Sets the <code>CurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @param pCurrencyCode
     *            the current value of the <code>currencyCode</code> property.
     */
    public void setCurrencyCode(final String pCurrencyCode) {
        this.currencyCode = ContractUtility.convertToUpperCase(pCurrencyCode);
    }

    /**
     * Sets the <code>DestinationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2A for Country Code. 3A for Airport,City Code. 4-7 for Aggregate. AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * EUR1
     * <p>
     * 
     * @param pDestinationCode
     *            the current value of the <code>destinationCode</code> property.
     */
    public void setDestinationCode(final String pDestinationCode) {
        this.destinationCode = ContractUtility.convertToUpperCase(pDestinationCode);
    }

    /**
     * Sets the <code>DestinationType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Airport,city,Country,Aggregate List.
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pDestinationType
     *            the current value of the <code>destinationType</code> property.
     */
    public void setDestinationType(final GeographicType pDestinationType) {
        this.destinationType = pDestinationType;
    }
    /**
     * Sets the <code>executionDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @param pExecutionDate
     *            the new value of the <code>executionDate</code> property.
     */
	public void setExecutionDate(final Date pExecutionDate) {
		this.executionDate = ContractUtility.getClonedDate(pExecutionDate);
	}

    /**
     * Sets the <code>OriginCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2A for Country Code. 3A for Airport,City Code. 4-7 for Aggregate. AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * USA1.
     * <p>
     * 
     * @param pOriginCode
     *            the current value of the <code>originCode</code> property.
     */
    public void setOriginCode(final String pOriginCode) {
        this.originCode = ContractUtility.convertToUpperCase(pOriginCode);
    }

    /**
     * Sets the <code>OriginType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Airport,city,Country,Aggregate List.
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pOriginType
     *            the current value of the <code>originType</code> property.
     */
    public void setOriginType(final GeographicType pOriginType) {
        this.originType = pOriginType;
    }

    /**
     * Sets the <code>RateSourceCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * IRI
     * <p>
     * 
     * @param pRateSourceCode
     *            the new value of the <code>rateSourceCode</code> property.
     */
    public void setRateSourceCode(final String pRateSourceCode) {
        this.rateSourceCode = ContractUtility.convertToUpperCase(pRateSourceCode);
    }

    /**
     * Sets the <code>RateTypeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @param pRateTypeCode
     *            the current value of the <code>rateTypeCode</code> property.
     */
    public void setRateTypeCode(final String pRateTypeCode) {
        this.rateTypeCode = ContractUtility.convertToUpperCase(pRateTypeCode);
    }

}
