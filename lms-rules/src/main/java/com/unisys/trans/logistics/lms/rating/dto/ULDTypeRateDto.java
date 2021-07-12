/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.ActionType;

/**
 * The <code>ULDTypeRateDto</code> holds the details specific to an uld type.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>carrierCode
 * <li>destination
 * <li>destinationType
 * <li>discountCurrencyCode
 * <li>discountRate
 * <li>discountRateCode
 * <li>effectiveDate
 * <li>expirationDate
 * <li>minimumChargeableWeight
 * <li>oId
 * <li>origin
 * <li>originType
 * <li>uldTypeOId
 * </ul>
 * </code>
 */
public class ULDTypeRateDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3320746925173763234L;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     * <p>
     * YYY or blank represents all airlines.Default is YYY.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>destination</code> property.<br>
     */
    private String destination;

    /**
     * Attribute to hold <code>destination</code> property.
     * <p>
     * Holds the destination of the rating information. Destination can be a valid area, sub area, region,
     * country, city, or aggregate.
     */
    private int destinationType;

    /**
     * Attribute to hold <code>discountCurrencyCode</code> property.
     * <p>
     * Mandatory if ULD discount rate is entered.Prohibited otherwise.
     */
    private String discountCurrencyCode;

    /**
     * Attribute to hold <code>discountRate</code> property.
     * <p>
     * Mandatory if minimum chargeable weight is not present.
     */
    private BigDecimal discountRate;

    /**
     * Attribute to hold <code>discountRateCode</code> property.
     * <p>
     * Mandatory if ULD discount rate is specified.Prohibited otherwise.
     */
    private char discountRateCode;

    /**
     * Attribute to hold <code>effectiveDate</code> property.
     * <p>
     * Default is tomorrow’s date.
     */
    private Date effectiveDate;

    /**
     * Attribute to hold <code>expirationDate</code> property.
     * <p>
     * INDEF or blank indicates no end date.The default is INDEF.
     */
    private Date expirationDate;

    /**
     * Attribute to hold <code>minimumChargeableWeight</code> property.
     * Mandatory if ULD discount rate is not present, otherwise optional. This
     * must not exceed maximum gross weight.
     */
    private BigDecimal minimumChargeableWeight;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique identifier of an uld type rate.
     */
    private Long oId;

    /**
     * Attribute to hold <code>origin</code> property.
     * <p>
     * Holds the origin of the rating information. Origin can be a valid area, sub area, region, country,
     * city, or aggregate.
     */
    private String origin;

    /**
     * Attribute to hold<code>originType</code> property.
     */
    private int originType;

    /**
     * Attribute to hold <code>uldTypeOId</code> property.
     */
    private Long uldTypeOId;

    /**
     * Attribute to hold <code>actionType</code> property.
     */
    private ActionType actionType;

    /**
     * Gets the <code>actionType</code> property.
     * <p>
     * 
     * @return the current value of the <code>actionType</code> property.
     */
    public ActionType getActionType() {
        return this.actionType;
    }

    /**
     * Sets the <code>actionType</code> property.
     * <p>
     * 
     * @param pActionType
     *            the new value of the <code>actionType</code> property.<br>
     */
    public void setActionType(final ActionType pActionType) {
        this.actionType = pActionType;
    }

    /**
     * <code>Default constructor.</code>
     */
    public ULDTypeRateDto() {

    }

    /**
     * Gets the <code>carrierCode</code> property.
     * <p>
     * Indicator to denote the carrier code. YYY or blank represents all airlines.Default is YYY.
     * <p>
     * <b>Format: </b><br>
     * 2-3 Alphanumeric.
     * <p>
     * <b>Example :</b><br>
     * UW
     * <p>
     * 
     * @return the current value of the <code>carrierCode</code> property.
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the <code>destination</code> property.
     * <p>
     * Holds the destination of the rating information. Destination can be a valid area, sub area, region,
     * country, city, or aggregate.
     * <p>
     * <b>Format: </b><br>
     * 1-4 or *ALL Alphanumeric.
     * <p>
     * <b>Example :</b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>destination</code> property.
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * Gets the <code>destinationType</code> property.
     * <p>
     * 
     * @return the current value of the <code>destinationType</code> property.
     */
    public int getDestinationType() {
        return this.destinationType;
    }

    /**
     * Gets the <code>discountCurrencyCode</code> property.
     * <p>
     * Mandatory if ULD discount rate is entered.Prohibited otherwise.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric.
     * <p>
     * <b>Example :</b><br>
     * CAD
     * <p>
     * 
     * @return the current value of the <code>discountCurrencyCode</code> property.
     */
    public String getDiscountCurrencyCode() {
        return this.discountCurrencyCode;
    }

    /**
     * Gets the <code>discountRate</code> property.
     * <p>
     * Mandatory if minimum chargeable weight is not present.
     * <p>
     * <b>Format: </b><br>
     * 12.5 Numeric.
     * <p>
     * <b>Example :</b><br>
     * 1234.4
     * <p>
     * 
     * @return the current value of the <code>discountRate</code> property.
     */
    public BigDecimal getDiscountRate() {
        return this.discountRate;
    }

    /**
     * Gets the <code>discountRateCode</code> property.
     * <p>
     * Mandatory if ULD discount rate is specified.Prohibited otherwise.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphanumeric.
     * <p>
     * <b>Example :</b><br>
     * F
     * <p>
     * 
     * @return the current value of the <code>discountRateCode</code> property.
     */
    public char getDiscountRateCode() {
        return this.discountRateCode;
    }

    /**
     * Gets the value of <code>effectiveDate</code> property.
     * <p>
     * It depends on the run time parameter. <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT
     * DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 07JUL07
     * <p>
     * 
     * @return the current value of the <code>effectiveDate</code> property.
     */
    public Date getEffectiveDate() {
        return ContractUtility.getClonedDate(this.effectiveDate);
    }

    /**
     * Gets the value of <code>expirationDate</code> property.
     * <p>
     * It depends on the run time parameter. <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT
     * DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 07JUL07
     * <p>
     * 
     * @return the current value of the <code>expirationDate</code> property.
     */
    public Date getExpirationDate() {
        return ContractUtility.getClonedDate(this.expirationDate);
    }

    /**
     * Gets the <code>minimumChargeableWeight</code> property.
     * <p>
     * Mandatory if ULD discount rate is not present, otherwise optional. This must not exceed maximum gross
     * weight.
     * <p>
     * <b>Format: </b><br>
     * 7.1 Numeric.
     * <p>
     * <b>Example :</b><br>
     * 123.4
     * <p>
     * 
     * @return the current value of the <code>minimumChargeableWeight</code> property.
     */
    public BigDecimal getMinimumChargeableWeight() {
        return this.minimumChargeableWeight;
    }

    /**
     * Gets the <code>oId</code>.
     * <p>
     * The unique database key for an uld type rate. This ID is assigned when the object gets persisted (EOT).
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>origin</code> property.
     * <p>
     * Holds the origin of the rating information. origin can be a valid area, sub area, region, country,
     * city, or aggregate.
     * <p>
     * <b>Format: </b><br>
     * 1-4 or *ALL Alphanumeric.
     * <p>
     * <b>Example :</b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>origin</code> property.<br>
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * Gets the <code>originType</code> property.
     * <p>
     * 
     * @return the current value of the <code>originType</code> property.<br>
     */
    public int getOriginType() {
        return this.originType;
    }

    /**
     * Gets the <code>uldTypeOId</code>.
     * <p>
     * The unique database key for an uld type. This ID is assigned when the object gets persisted (EOT).
     * <p>
     * 
     * @return the current value of <code>uldTypeOId</code> property.
     */
    public Long getUldTypeOId() {
        return this.uldTypeOId;
    }

    /**
     * Sets the <code>carrierCode</code> property.
     * <p>
     * Indicator to denote the carrier code of the uld type. YYY or blank represents all airlines.Default is
     * YYY.
     * <p>
     * <b>Format: </b><br>
     * 2-3 Alphanumeric.
     * <p>
     * <b>Example :</b><br>
     * UW
     * <p>
     * 
     * @param pCarrierCode
     *            the new value of the <code>carrierCode</code> property.<br>
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = ContractUtility.convertToUpperCase(pCarrierCode);
    }

    /**
     * Sets the <code>destination</code> property.
     * <p>
     * Holds the destination of the rating information. Destination can be a valid area, sub area, region,
     * country, city, or aggregate.
     * <p>
     * <b>Format: </b><br>
     * 1-4 or *ALL Alphanumeric.
     * <p>
     * <b>Example :</b><br>
     * MSP
     * <p>
     * 
     * @param pDestination
     *            the new value of the <code>destination</code> property.<br>
     */
    public void setDestination(final String pDestination) {
        this.destination = ContractUtility.convertToUpperCase(pDestination);
    }

    /**
     * Sets the <code>destinationType</code> property.
     * <p>
     * 
     * @param pDestinationType
     *            the new value of the <code>destinationType</code> property.<br>
     */
    public void setDestinationType(final int pDestinationType) {
        this.destinationType = pDestinationType;
    }

    /**
     * Sets the <code>discountCurrencyCode</code> property.
     * <p>
     * Mandatory if ULD discount rate is entered.Prohibited otherwise.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric.
     * <p>
     * <b>Example :</b><br>
     * CAD
     * <p>
     * 
     * @param pDiscountCurrencyCode
     *            the new value of the <code>discountCurrencyCode</code> property.
     */
    public void setDiscountCurrencyCode(final String pDiscountCurrencyCode) {
        this.discountCurrencyCode = ContractUtility
                    .convertToUpperCase(pDiscountCurrencyCode);
    }

    /**
     * Sets the <code>discountRate</code> property.
     * <p>
     * Mandatory if minimum chargeable weight is not present. <b>Format: </b><br>
     * 12.5 Numeric.
     * <p>
     * <b>Example :</b><br>
     * 1234.4
     * 
     * @param pDiscountRate
     *            the new value of the <code>discountRate</code> property.
     */
    public void setDiscountRate(final BigDecimal pDiscountRate) {
        this.discountRate = pDiscountRate;
    }

    /**
     * Sets the <code>discountRateCode</code> property.
     * <p>
     * Mandatory if ULD discount rate is specified.Prohibited otherwise.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphanumeric.
     * <p>
     * <b>Example :</b><br>
     * F
     * <p>
     * 
     * @param pDiscountRateCode
     *            the new value of the <code>discountRateCode</code> property.
     */
    public void setDiscountRateCode(final char pDiscountRateCode) {

        if (pDiscountRateCode != '\u0000') {
            this.discountRateCode = ContractUtility.convertToUpperCase(
                Character.toString(pDiscountRateCode)).charAt(0);

        }
        else {
            this.discountRateCode = pDiscountRateCode;
        }
    }

    /**
     * Sets the <code>effectiveDate</code> property.
     * <p>
     * It depends on the run time parameter. <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT
     * DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 07JUL07
     * <p>
     * 
     * @param pEffectiveDate
     *            the new value of the <code>effectiveDate</code> property.
     */
    public void setEffectiveDate(final Date pEffectiveDate) {
        this.effectiveDate = ContractUtility.getClonedDate(pEffectiveDate);
    }

    /**
     * Sets the <code>expirationDate</code> property.
     * <p>
     * It depends on the run time parameter. <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT
     * DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 07JUL07
     * <p>
     * 
     * @param pExpirationDate
     *            the new value of the <code>expirationDate</code> property.
     */
    public void setExpirationDate(final Date pExpirationDate) {
        this.expirationDate = ContractUtility.getClonedDate(pExpirationDate);
    }

    /**
     * Sets the <code>minimumChargeableWeight</code> property.
     * <p>
     * Mandatory if ULD discount rate is not present, otherwise optional. This must not exceed maximum gross
     * weight.
     * <p>
     * <b>Format: </b><br>
     * 7.1 Numeric.
     * <p>
     * <b>Example :</b><br>
     * 123.4
     * <p>
     * 
     * @param pMinimumChargeableWeight
     *            the new value of the <code>minimumChargeableWeight</code> property.
     */
    public void setMinimumChargeableWeight(
                final BigDecimal pMinimumChargeableWeight) {
        this.minimumChargeableWeight = pMinimumChargeableWeight;
    }

    /**
     * Sets the value of the oId property.
     * <p>
     * 
     * @param pOId
     *            the new value of the oId property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>origin</code> property.
     * <p>
     * Holds the origin of the rating information. Origin can be a valid area, sub area, region, country,
     * city, or aggregate.
     * <p>
     * <b>Format: </b><br>
     * 1-4 or *ALL Alphanumeric.
     * <p>
     * <b>Example :</b><br>
     * MSP
     * <p>
     * 
     * @param pOrigin
     *            the new value of the <code>origin</code> property.
     */
    public void setOrigin(final String pOrigin) {
        this.origin = ContractUtility.convertToUpperCase(pOrigin);
    }

    /**
     * Sets the <code>originType</code> property.
     * <p>
     * 
     * @param pOriginType
     *            the new value of the <code>originType</code> property.
     */
    public void setOriginType(final int pOriginType) {
        this.originType = pOriginType;
    }

    /**
     * Sets the value of the uldTypeOId property.
     * <p>
     * 
     * @param pULDTypeOId
     *            the new value of the uldTypeOId property.
     */
    public void setUldTypeOId(final Long pULDTypeOId) {
        this.uldTypeOId = pULDTypeOId;
    }

    @Override
    public int hashCode() {
        final int result = 1;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        boolean value = true;
        if (this == obj) {
            value = true;
        }
        if (obj == null) {
            value = false;
        }
        if (this.getClass() != obj.getClass()) {
            value = false;
        }
        final ULDTypeRateDto other = (ULDTypeRateDto) obj;
        if (value) {
            if (value && this.getCarrierCode() == null) {
                if (other.getCarrierCode() != null)
                    value = false;
            }
            else if (this.getCarrierCode() != null
                        && (!this.getCarrierCode().equals(other.getCarrierCode()) &&
                        other.getCarrierCode() != null)) {
                value = false;
            }
            if (value && this.getDestination() == null) {
                if (other.getDestination() != null)
                    value = false;
            }
            else if (this.getDestination() != null
                        && !this.getDestination().equals(other.getDestination())) {
                value = false;
            }
            if (value
                        && this.getDestinationType() != other.getDestinationType()) {
                value = false;
            }
            if (value && this.getDiscountCurrencyCode() == null) {
                if (other.getDiscountCurrencyCode() != null
                            && !other.getDiscountCurrencyCode().isEmpty())
                    value = false;
            }
            else if (this.getDiscountCurrencyCode() != null
                        && !this.getDiscountCurrencyCode().equals(
                            other.getDiscountCurrencyCode())) {
                value = false;
            }
            if (value && this.getDiscountRate() == null) {
                if (other.getDiscountRate() != null) {
                    value = false;
                }
            }
            else if (this.getDiscountRate() != null
                        && (this.getDiscountRate().compareTo(other.getDiscountRate()) != 0)) {
                value = false;
            }
            if (value && this.getEffectiveDate() != null) {
                if (other.getEffectiveDate() == null) {
                    value = false;
                }
            }
            else if (this.getEffectiveDate() != null && other.getEffectiveDate() != null) {
                if (!this.getEffectiveDate().equals(other.getEffectiveDate())) {
                    value = false;
                }
            }
            if (value
                        && this.getDiscountRateCode() != other
                                    .getDiscountRateCode()) {
                value = false;
            }
            if (this.getMinimumChargeableWeight() == null) {
                if (other.getMinimumChargeableWeight() != null) {
                    value = false;
                }
            }
            /*
             * else if (other.getMinimumChargeableWeight() != null
             * && this.getMinimumChargeableWeight().compareTo(
             * other.getMinimumChargeableWeight()) != 0) {
             * value = false;
             * }
             */
            if (value && this.getOrigin() == null) {
                if (other.getOrigin() != null) {
                    value = false;
                }
            }
            else if (this.getOrigin() != null
                        && !this.getOrigin().equals(other.getOrigin())) {
                value = false;
            }
            if (value && this.getOriginType() != other.getOriginType()) {
                value = false;
            }
        }
        return value;
    }
}
