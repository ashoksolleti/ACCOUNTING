/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.TaxQualifierType;
import com.unisys.trans.logistics.lms.rating.dto.constants.TaxWeightChargeType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <code>TaxDetailDto</code> contains tax details.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>shipmentBidirectionalIndicator
 * <li>collectTaxSubCode
 * <li>prepaidTaxSubCode
 * <li>stationTaxQualifierDestinationCode
 * <li>stationTaxQualifierOriginCode
 * <li>otherChargeIndicator
 * <li>valuationChargesIndicator
 * <li>taxWeightChargeType
 * <li>otherChargeCodeTaxExemptedOrTaxSpecific
 * <li>shipmentTaxQualifierDestinationCode
 * <li>shipmentTaxQualifierOriginCode
 * <li>taxProductCodes
 * <li>origins
 * <li>destinations
 * <li>taxOtherChargeCodes
 * </code>
 * </ul>
 */
public class TaxDetailDto implements Serializable {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5145998049195576645L;

    /**
     * Attribute to hold <code>collectTaxSubCode</code> property.
     */
    private String collectTaxSubcode;

    /**
     * Attribute to hold <code>destinations</code> property.
     */
    private List<String> destinations = new ArrayList<String>();

    /**
     * Attribute to hold <code>origins</code> property.
     */
    private List<String> origins = new ArrayList<String>();

    /**
     * Attribute to hold <code>otherChargeCodeTaxExemptedOrTaxSpecific</code> property.
     */
    private TaxQualifierType otherChargeCodeTaxExemptedOrTaxSpecific;

    /**
     * Attribute to hold <code>otherChargeIndicator</code> property.
     */
    private boolean otherChargeIndicator;

    /**
     * Attribute to hold <code>prepaidTaxSubCode</code> property.
     */
    private String prepaidTaxSubcode;

    /**
     * Attribute to hold <code>shipmentBidirectionalIndicator</code> property.
     */
    private boolean shipmentBidirectionalIndicator;

    /**
     * Attribute to hold <code>shipmentTaxQualifierDestinationCode</code> property.
     */
    private String shipmentTaxQualifierDestinationCode;

    /**
     * Attribute to hold <code>shipmentTaxQualifierOriginCode</code> property.
     */
    private String shipmentTaxQualifierOriginCode;

    /**
     * Attribute to hold <code>stationTaxQualifierDestinationCode</code> property.
     */
    private TaxQualifierType stationTaxQualifierDestinationCode;

    /**
     * Attribute to hold <code>stationTaxQualifierOriginCode</code> property.
     */
    private TaxQualifierType stationTaxQualifierOriginCode;

    /**
     * Attribute to hold <code>taxOtherChargeCodes</code> property.
     */
    private List<String> taxOtherChargeCodes = new ArrayList<String>();

    /**
     * Attribute to hold <code>taxProductCodes</code> property.
     */
    private List<String> taxProductCodes = new ArrayList<String>();

    /**
     * Attribute to hold <code>taxWeightChargeType</code> property.
     */
    private TaxWeightChargeType taxWeightChargeType;

    /**
     * Attribute to hold <code>valuationChargesIndicator</code> property.
     */
    private boolean valuationChargesIndicator;

    /**
     * <code>Default constructor.</code>
     */
    public TaxDetailDto() {
    }

    /**
     * Gets the value of the <code>collectTaxSubCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * Upper case alphabets of size 2.
     * <p>
     * <b>Example: </b><br>
     * DU
     * <p>
     * 
     * @return the current value of the <code>collectTaxSubcode</code> property.<br>
     */
    public String getCollectTaxSubcode() {
        return this.collectTaxSubcode;
    }

    /**
     * Gets the value of the <code>destinations</code> property.
     * <p>
     * <b>Format: </b><br>
     * Upper case alphabets of size 2 or 3.
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>destinations</code> property.<br>
     */
    public List<String> getDestinations() {
        return this.destinations;
    }

    /**
     * Gets the value of the <code>origins</code> property.
     * <p>
     * <b>Format: </b><br>
     * Upper case alphabets of size 2 or 3.
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>origins</code> property.<br>
     */
    public List<String> getOrigins() {
        return this.origins;
    }

    /**
     * Gets the value of the <code>otherChargeCodeTaxExemptedOrTaxSpecific</code> property.
     * <p>
     * <b>Example: </b><br>
     * ALL or SPECIFIC or EXCEPTION
     * <p>
     * 
     * @return the current value of the <code>otherChargeCodeTaxExemptedOrTaxSpecific</code> property.<br>
     */
    public TaxQualifierType getOtherChargeCodeTaxExemptedOrTaxSpecific() {
        return this.otherChargeCodeTaxExemptedOrTaxSpecific;
    }

    /**
     * Gets the value of the <code>otherChargeIndicator</code> property.
     * <p>
     * Possible Values:
     * <li><code>true</code><br>
     * Apply tax to Other charges.
     * <li><code>false</code><br>
     * Tax does not apply to Other charges.
     * <p>
     * 
     * @return the current value of the <code>otherChargeIndicator</code> property.<br>
     */
    public boolean getOtherChargeIndicator() {
        return this.otherChargeIndicator;
    }

    /**
     * Gets the value of the <code>prepaidTaxSubCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * Upper case alphabets of size 2.
     * <p>
     * <b>Example: </b><br>
     * OR
     * <p>
     * 
     * @return the current value of the <code>prepaidTaxSubcode</code> property.<br>
     */
    public String getPrepaidTaxSubcode() {
        return this.prepaidTaxSubcode;
    }

    /**
     * Gets the value of the <code>shipmentTaxQualifierDestinationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * Upper case alphabets of size 2.
     * <p>
     * <b>Example: </b><br>
     * CA
     * <p>
     * 
     * @return the current value of the <code>shipmentTaxQualifierDestinationCode</code> property.<br>
     */
    public String getShipmentTaxQualifierDestinationCode() {
        return this.shipmentTaxQualifierDestinationCode;
    }

    /**
     * Gets the value of the <code>shipmentTaxQualifierOriginCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * Upper case alphabets of size 2.
     * <p>
     * <b>Example: </b><br>
     * CA
     * <p>
     * 
     * @return the current value of the <code>shipmentTaxQualifierOriginCode</code> property.<br>
     */
    public String getShipmentTaxQualifierOriginCode() {
        return this.shipmentTaxQualifierOriginCode;
    }

    /**
     * Gets the value of the <code>stationTaxQualifierDestinationCode</code> property.
     * <p>
     * <b>Example: </b><br>
     * ALL or SPECIFIC or EXCEPTION
     * <p>
     * 
     * @return the current value of the <code>stationTaxQualifierDestinationCode</code> property.<br>
     */
    public TaxQualifierType getStationTaxQualifierDestinationCode() {
        return this.stationTaxQualifierDestinationCode;
    }

    /**
     * Gets the value of the <code>stationTaxQualifierOriginCode</code> property.
     * <p>
     * <b>Example: </b><br>
     * ALL or SPECIFIC or EXCEPTION
     * <p>
     * 
     * @return the current value of the <code>stationTaxQualifierOriginCode</code> property.<br>
     */
    public TaxQualifierType getStationTaxQualifierOriginCode() {
        return this.stationTaxQualifierOriginCode;
    }

    /**
     * Gets the value of the <code>taxOtherChargeCodes</code> property.
     * <p>
     * <b>Format: </b><br>
     * Upper case alphabets of size 2.
     * <p>
     * <b>Example: </b><br>
     * OR
     * <p>
     * 
     * @return the current value of the <code>taxOtherChargeCodes</code> property.<br>
     */
    public List<String> getTaxOtherChargeCodes() {
        return this.taxOtherChargeCodes;
    }

    /**
     * Gets the value of the <code>taxProductCodes</code> property.
     * <p>
     * <b>Format: </b><br>
     * Upper case alphabets of size 3.
     * <p>
     * <b>Example: </b><br>
     * COM
     * <p>
     * 
     * @return the current value of the <code>taxProductCodes</code> property.<br>
     */
    public List<String> getTaxProductCodes() {
        return this.taxProductCodes;
    }

    /**
     * Gets the value of the <code>taxWeightChargeType</code> property.
     * <p>
     * <b>Example: </b><br>
     * ACTUAL_TAX or FACE_TAX or NOT_TAXED
     * <p>
     * 
     * @return the current value of the <code>taxWeightChargeType</code> property.<br>
     */
    public TaxWeightChargeType getTaxWeightChargeType() {
        return this.taxWeightChargeType;
    }

    /**
     * Gets the value of the <code>valuationChargesIndicator</code> property.
     * <p>
     * Possible Values:
     * <li><code>true</code><br>
     * Applies tax to valuation charges.
     * <li><code>false</code><br>
     * Tax does not apply to valuation charges.
     * <p>
     * 
     * @return the current value of the <code>valuationChargesIndicator</code> property.<br>
     */
    public boolean getValuationChargesIndicator() {
        return this.valuationChargesIndicator;
    }

    /**
     * Gets the value of the <code>shipmentBidirectionalIndicator</code> property.
     * <p>
     * Possible Values:
     * <li><code>true</code><br>
     * Applies tax when a shipment is moving in either direction of the origin/destination qualifier.
     * <li><code>false</code><br>
     * Applies tax when a shipment is moving only in the direction of the origin/destination qualifier.
     * <p>
     * 
     * @return the current value of the <code>shipmentBidirectionalIndicator</code> property.<br>
     */
    public boolean isShipmentBidirectionalIndicator() {
        return this.shipmentBidirectionalIndicator;
    }

    /**
     * Sets the value of <code>collectTaxSubCode</code> property.
     * <p>
     * Some of the other charges have sub codes. This is the other charge sub code to be generated for a given
     * prepaid tax. Other Charge Sub Codes must exist in the system. The other charge sub code must be
     * associated with the input tax code (other charge code).
     * <p>
     * <b>Format: </b><br>
     * Upper case alphabets of size 2.
     * <p>
     * <b>Example: </b><br>
     * DU
     * <p>
     * 
     * @param pCollectTaxSubCode the new value of the <code>collectTaxSubcode</code> property.<br>
     */
    public void setCollectTaxSubcode(final String pCollectTaxSubCode) {
        this.collectTaxSubcode = ContractUtility.convertToUpperCase(pCollectTaxSubCode);
    }

    /**
     * Sets the value of <code>destinations</code> property.
     * <p>
     * The country or province/state of shipment destination for which tax is applicable.
     * <p>
     * <b>Format: </b><br>
     * Upper case alphabets of size 2 or 3
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pDestinations the new value of the <code>destinations</code> property.<br>
     */
    public void setDestinations(final List<String> pDestinations) {

        this.destinations = ContractUtility.convertListToUpperCase(pDestinations);
    }

    /**
     * Sets the value of <code>origins</code> property.
     * <p>
     * The country or province/state of shipment origin for which tax is applicable.
     * <p>
     * <b>Format: </b><br>
     * Upper case alphabets of size 2 or 3
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pOrigins the new value of the <code>origins</code> property.<br>
     */
    public void setOrigins(final List<String> pOrigins) {

        this.origins = ContractUtility.convertListToUpperCase(pOrigins);
    }

    /**
     * Sets the value of <code>otherChargeCodeTaxExemptedOrTaxSpecific</code> property.
     * <p>
     * <b>Example: </b><br>
     * ALL or SPECIFIC or EXCEPTION
     * <p>
     * 
     * @param pOtherChargeCodeTaxExemptedOrTaxSpecific the new value of the
     *            <code>otherChargeCodeTaxExemptedOrTaxSpecific</code> property.<br>
     */
    public void setOtherChargeCodeTaxExemptedOrTaxSpecific(
                final TaxQualifierType pOtherChargeCodeTaxExemptedOrTaxSpecific) {
        this.otherChargeCodeTaxExemptedOrTaxSpecific = pOtherChargeCodeTaxExemptedOrTaxSpecific;
    }

    /**
     * Sets the value of the <code>otherChargeIndicator</code> property.
     * <p>
     * Possible Values:
     * <li><code>true</code><br>
     * Apply tax to Other charges.
     * <li><code>false</code><br>
     * Tax does not apply to Other charges.
     * <p>
     * 
     * @param pOtherChargeIndicator the new value of the <code>otherChargeIndicator</code> property.<br>
     */
    public void setOtherChargeIndicator(final boolean pOtherChargeIndicator) {
        this.otherChargeIndicator = pOtherChargeIndicator;
    }

    /**
     * Sets the value of <code>prepaidTaxSubCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * Upper case alphabets of size 2.
     * <p>
     * <b>Example: </b><br>
     * OR
     * <p>
     * 
     * @param pPrepaidTaxSubCode the new value of the <code>prepaidTaxSubcode</code> property.<br>
     */
    public void setPrepaidTaxSubcode(final String pPrepaidTaxSubCode) {
        this.prepaidTaxSubcode = ContractUtility.convertToUpperCase(pPrepaidTaxSubCode);
    }

    /**
     * Sets the value of the <code>shipmentBidirectionalIndicator</code> property.
     * <p>
     * Possible Values:
     * <li><code>true</code><br>
     * Applies tax when a shipment is moving in either direction of the origin/destination qualifier.
     * <li><code>false</code><br>
     * Applies tax when a shipment is moving only in the direction of the origin/destination qualifier.
     * <p>
     * 
     * @param pShipmentBidirectionalIndicator the new value of the <code>shipmentBidirectionalIndicator</code>
     *            property.<br>
     */
    public void setShipmentBidirectionalIndicator(final boolean pShipmentBidirectionalIndicator) {
        this.shipmentBidirectionalIndicator = pShipmentBidirectionalIndicator;
    }

    /**
     * Sets the value of <code>shipmentTaxQualifierDestinationCode</code> property.
     * <p>
     * The country or province/state of shipment destination that is used to qualify whether the tax is
     * applicable.
     * <p>
     * <b>Format: </b><br>
     * Upper case alphabets of size 2.
     * <p>
     * <b>Example: </b><br>
     * CA
     * <p>
     * 
     * @param pShipmentTaxQualifierDestinationCode the new value of the
     *            <code>shipmentTaxQualifierDestinationCode</code> property.<br>
     */
    public void setShipmentTaxQualifierDestinationCode(final String pShipmentTaxQualifierDestinationCode) {
        this.shipmentTaxQualifierDestinationCode =
                    ContractUtility.convertToUpperCase(pShipmentTaxQualifierDestinationCode);
    }

    /**
     * Sets the value of <code>shipmentTaxQualifierOriginCode</code> property.
     * <p>
     * The country or province/state of shipment’s origin that is used to qualify whether the tax is
     * applicable.
     * <p>
     * <b>Format: </b><br>
     * Upper case alphabets of size 2.
     * <p>
     * <b>Example: </b><br>
     * CA
     * <p>
     * 
     * @param pShipmentTaxQualifierOriginCode the new value of the <code>shipmentTaxQualifierOriginCode</code>
     *            property.<br>
     */
    public void setShipmentTaxQualifierOriginCode(final String pShipmentTaxQualifierOriginCode) {
        this.shipmentTaxQualifierOriginCode =
                    ContractUtility.convertToUpperCase(pShipmentTaxQualifierOriginCode);
    }

    /**
     * Sets the value of <code>stationTaxQualifierDestinationCode</code> property.
     * <p>
     * The country or province/state of shipment’s destination’s station that is used to qualify whether the
     * tax is applicable.
     * <p>
     * <b>Example: </b><br>
     * ALL or SPECIFIC or EXCEPTION
     * <p>
     * 
     * @param pStationTaxQualifierDestinationCode the new value of the
     *            <code>stationTaxQualifierDestinationCode</code> property.<br>
     */
    public void setStationTaxQualifierDestinationCode(
                final TaxQualifierType pStationTaxQualifierDestinationCode) {
        this.stationTaxQualifierDestinationCode = pStationTaxQualifierDestinationCode;
    }

    /**
     * Sets the value of <code>stationTaxQualifierOriginCode</code> property.
     * <p>
     * The country or province/state of shipment’s origin’s station that is used to qualify whether the tax is
     * applicable.
     * <p>
     * <b>Example: </b><br>
     * ALL or SPECIFIC or EXCEPTION
     * <p>
     * 
     * @param pStationTaxQualifierOriginCode the new value of the <code>stationTaxQualifierOriginCode</code>
     *            property.<br>
     */
    public void setStationTaxQualifierOriginCode(final TaxQualifierType pStationTaxQualifierOriginCode) {
        this.stationTaxQualifierOriginCode = pStationTaxQualifierOriginCode;
    }

    /**
     * Sets the value of <code>taxOtherChargeCodes</code> property.
     * <p>
     * <b>Format: </b><br>
     * Upper case alphabets of size 2.
     * <p>
     * <b>Example: </b><br>
     * OR
     * <p>
     * 
     * @param pTaxOtherChargeCodes the new value of the <code>taxOtherChargeCodes</code> property.<br>
     */
    public void setTaxOtherChargeCodes(final List<String> pTaxOtherChargeCodes) {

        this.taxOtherChargeCodes = ContractUtility.convertListToUpperCase(pTaxOtherChargeCodes);
    }

    /**
     * Sets the value of <code>taxProductCodes</code> property.
     * <p>
     * <b>Format: </b><br>
     * Upper case alphabets of size 3.
     * <p>
     * <b>Example: </b><br>
     * COM
     * <p>
     * 
     * @param pTaxProductCodes the new value of the <code>taxProductCodes</code> property.<br>
     */
    public void setTaxProductCodes(final List<String> pTaxProductCodes) {

        this.taxProductCodes = ContractUtility.convertListToUpperCase(pTaxProductCodes);
    }

    /**
     * Sets the value of <code>taxWeightChargeType</code> property.
     * <p>
     * Indicates whether the tax is applied to weight charges, and if so, whether it is applied to actual or
     * face value weight charges. Valid options are: Face Tax is applied to face value weight charges. This is
     * the default. Actual Tax is applied to actual weight charges. Not Taxed Tax is not applied on weight
     * charges.
     * <p>
     * <b>Example: </b><br>
     * ACTUAL_TAX or FACE_TAX or NOT_TAXED
     * <p>
     * 
     * @param pTaxWeightChargeType the new value of the <code>taxWeightChargeType</code> property.<br>
     */
    public void setTaxWeightChargeType(final TaxWeightChargeType pTaxWeightChargeType) {
        this.taxWeightChargeType = pTaxWeightChargeType;
    }

    /**
     * Sets the value of the <code>valuationChargesIndicator</code> property.
     * <p>
     * Possible Values:
     * <li><code>true</code><br>
     * Applies tax to valuation charges.
     * <li><code>false</code><br>
     * Tax does not apply to valuation charges.
     * <p>
     * 
     * @param pValuationChargesIndicator the new value of the <code>valuationChargesIndicator</code> property.<br>
     */
    public void setValuationChargesIndicator(final boolean pValuationChargesIndicator) {
        this.valuationChargesIndicator = pValuationChargesIndicator;
    }
}
