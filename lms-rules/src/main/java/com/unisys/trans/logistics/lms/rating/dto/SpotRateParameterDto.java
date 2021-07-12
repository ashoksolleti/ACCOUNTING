/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;
import java.lang.annotation.Inherited;

/**
 * UI parameters are stored in this <code>SpotRateParameterDto</code> Data Transfer Object.<br/>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>airWaybill
 * <li>commodityCode
 * <li>defaultEffDays
 * <li>defaultPaycode
 * <li>defaultSRADefinition
 * <li>flightDate
 * <li>flightNumber
 * <li>productCode
 * <li>rateSource
 * <li>rateType
 * <li>specialInstructions
 * </code>
 * </ul>
 */
public class SpotRateParameterDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4254993716602316212L;

    /**
     * Attribute to hold <code>airWaybill</code> property.
     */
    private boolean airWaybill;

    /**
     * Attribute to hold <code>commodityCode</code> property.
     */
    private String commodityCode;

    /**
     * Attribute to hold <code>defaultEffDays</code> property.
     */
    private int defaultEffDays;

    /**
     * Attribute to hold <code>defaultPaycode</code> property.
     */
    private String defaultPaycode;

    /**
     * Attribute to hold <code>defaultSRADefinition</code> property.
     */
    private String defaultSRADefinition;

    /**
     * Attribute to hold <code>flightDate</code> property.
     */
    private String flightDate;

    /**
     * Attribute to hold <code>flightNumber</code> property.
     */
    private String flightNumber;

    /**
     * Attribute to hold <code>productCode</code> property.
     */
    private String productCode;

    /**
     * Attribute to hold <code>rateSource</code> property.
     */
    private String rateSource;

    /**
     * Attribute to hold <code>rateType</code> property.
     */
    private String rateType;

    /**
     * Attribute to hold <code>specialInstructions</code> property.
     */
    private String specialInstructions;

    /**
     * Gets the <code>commodityCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>commodityCode</code> property.
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * Gets the <code>defaultEffDays</code> property.
     * <p>
     * 
     * @return the current value of the <code>defaultEffDays</code> property.
     */
    public int getDefaultEffDays() {
        return this.defaultEffDays;
    }

    /**
     * Gets the <code>defaultPaycode</code> property.
     * <p>
     * 
     * @return the current value of the <code>defaultPaycode</code> property.
     */
    public String getDefaultPaycode() {
        return this.defaultPaycode;
    }

    /**
     * Gets the <code>defaultSRADefinition</code> property.
     * <p>
     * 
     * @return the current value of the <code>defaultSRADefinition</code> property.
     */
    public String getDefaultSRADefinition() {
        return this.defaultSRADefinition;
    }

    /**
     * Gets the <code>flightDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightDate</code> property.
     */
    public String getFlightDate() {
        return this.flightDate;
    }

    /**
     * Gets the <code>flightNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightNumber</code> property.
     */
    public String getFlightNumber() {
        return this.flightNumber;
    }

    /**
     * Gets the <code>productCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>productCode</code> property.
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * Gets the <code>rateSource</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateSource</code> property.
     */
    public String getRateSource() {
        return this.rateSource;
    }

    /**
     * Gets the <code>rateType</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateType</code> property.
     */
    public String getRateType() {
        return this.rateType;
    }

    /**
     * Gets the <code>specialInstructions</code> property.
     * <p>
     * 
     * @return the current value of the <code>specialInstructions</code> property.
     */
    public String getSpecialInstructions() {
        return this.specialInstructions;
    }

    /**
     * Gets the <code>airWaybill</code> property.
     * <p>
     * 
     * @return the current value of the <code>airWaybill</code> property.
     */
    public boolean isAirWaybill() {
        return this.airWaybill;
    }

    /**
     * Sets the <code>airWaybill</code> property.
     * <p>
     * 
     * @param pAirWaybill
     *            the new value of the <code>airWaybill</code> property.<br>
     */

    public void setAirWaybill(final boolean pAirWaybill) {
        this.airWaybill = pAirWaybill;
    }

    /**
     * Sets the <code>commodityCode</code> property.
     * <p>
     * 
     * @param pCommodityCode
     *            the new value of the <code>commodityCode</code> property.<br>
     */

    public void setCommodityCode(final String pCommodityCode) {
        this.commodityCode = pCommodityCode;
    }

    /**
     * Sets the <code>defaultEffDays</code> property.
     * <p>
     * 
     * @param pDefaultEffDays
     *            the new value of the <code>defaultEffDays</code> property.<br>
     */

    public void setDefaultEffDays(final int pDefaultEffDays) {
        this.defaultEffDays = pDefaultEffDays;
    }

    /**
     * Sets the <code>defaultPaycode</code> property.
     * <p>
     * 
     * @param pDefaultPaycode
     *            the new value of the <code>defaultPaycode</code> property.<br>
     */

    public void setDefaultPaycode(final String pDefaultPaycode) {
        this.defaultPaycode = pDefaultPaycode;
    }

    /**
     * Sets the <code>defaultSRADefinition</code> property.
     * <p>
     * 
     * @param pDefaultSRADefinition
     *            the new value of the <code>defaultSRADefinition</code> property.<br>
     */

    public void setDefaultSRADefinition(final String pDefaultSRADefinition) {
        this.defaultSRADefinition = pDefaultSRADefinition;
    }

    /**
     * Sets the <code>flightDate</code> property.
     * <p>
     * 
     * @param pFlightDate
     *            the new value of the <code>flightDate</code> property.<br>
     */

    public void setFlightDate(final String pFlightDate) {
        this.flightDate = pFlightDate;
    }

    /**
     * Sets the <code>flightNumber</code> property.
     * <p>
     * 
     * @param pFlightNumber
     *            the new value of the <code>flightNumber</code> property.<br>
     */

    public void setFlightNumber(final String pFlightNumber) {
        this.flightNumber = pFlightNumber;
    }

    /**
     * Sets the <code>productCode</code> property.
     * <p>
     * 
     * @param pProductCode
     *            the new value of the <code>productCode</code> property.<br>
     */

    public void setProductCode(final String pProductCode) {
        this.productCode = pProductCode;
    }

    /**
     * Sets the <code>rateSource</code> property.
     * <p>
     * 
     * @param pRateSource
     *            the new value of the <code>rateSource</code> property.<br>
     */

    public void setRateSource(final String pRateSource) {
        this.rateSource = pRateSource;
    }

    /**
     * Sets the <code>rateType</code> property.
     * <p>
     * 
     * @param pRateType
     *            the new value of the <code>rateType</code> property.<br>
     */

    public void setRateType(final String pRateType) {
        this.rateType = pRateType;
    }

    /**
     * Sets the <code>specialInstructions</code> property.
     * <p>
     * 
     * @param pSpecialInstructions
     *            the new value of the <code>specialInstructions</code> property.<br>
     */

    public void setSpecialInstructions(final String pSpecialInstructions) {
        this.specialInstructions = pSpecialInstructions;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "SpotRateParameterDto [airWaybill=" + airWaybill + ", commodityCode=" + commodityCode
                    + ", defaultEffDays=" + defaultEffDays + ", defaultPaycode=" + defaultPaycode
                    + ", defaultSRADefinition=" + defaultSRADefinition + ", flightDate=" + flightDate
                    + ", flightNumber=" + flightNumber + ", productCode=" + productCode + ", rateSource="
                    + rateSource + ", rateType=" + rateType + ", specialInstructions=" + specialInstructions
                    + "]";
    }

}
