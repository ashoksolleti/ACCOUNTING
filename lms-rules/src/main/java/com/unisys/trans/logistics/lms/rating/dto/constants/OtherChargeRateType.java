/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>OtherChargeRateType</code> holds the constants to indicate the rate type applied for an other charge
 * rate.
 * <p>
 * Following are the possible rate type codes:<br>
 * <ul>
 * <li>STORAGE_PER_SHIPMENT_PER_DAY -A
 * <li>WEIGHT_CHARGES_PER_HAWB - B
 * <li>CHARGES_PER_SHIPMENT_PIECE - C
 * <li>RENTAL_PER_ITEM_PER_DAY - D
 * <li>RENTAL_PER_ITEM_PER_MINUTE - M
 * <li>CHARGES_BASED_ON_COD - O
 * <li>PERCENTAGE_OF_AMOUNT - P
 * <li>STORGAE_PER_WEIGHT - S
 * <li>TOTAL_PER_EVENT - T
 * <li>STORAGE_PER_PIECE_PER_ULD - U
 * <li>RATE_PER_ULD_TYPE - V
 * <li>WEIGHT_CHARGE_PER_MAWB - W
 * </ul>
 */
public enum OtherChargeRateType {
    /**
     * Rate charged if the mode of payment is cash on delivery.
     */
    CHARGES_BASED_ON_COD("O"),
    /**
     * Charges to be levied per shipment piece.
     */
    CHARGES_PER_SHIPMENT_PIECE("C"),
    /**
     * Rates charged are calculated in terms of percentage.
     */
    PERCENTAGE_OF_AMOUNT("P"),
    /**
     * Rates charged for a given ULD type.
     */
    RATE_PER_ULD_TYPE("V"),
    /**
     * Rental charges per item per day.
     */
    RENTAL_PER_ITEM_PER_DAY("D"),
    /**
     * The amount charged for the rental item per minute.
     */
    RENTAL_PER_ITEM_PER_MINUTE("M"),
    /**
     * Storage charges per piece per ULD.
     */
    STORAGE_PER_PIECE_PER_ULD("U"),
    /**
     * Indicates the storage charges to be levied per shipment per day.
     */
    STORAGE_PER_SHIPMENT_PER_DAY("A"),
    /**
     * Storage charges based on weight.
     */
    STORAGE_PER_WEIGHT("S"),
    /**
     * Total charges involved in the air waybill data capture.
     */
    TOTAL_PER_EVENT("T"),
    /**
     * Rates are calculated based on the weight charged on MAWB(Master Air Way bill).
     */
    WEIGHT_CHARGE_PER_MAWB("W"),
    /**
     * Rates are calculated based on the weight charged on HAWB(House Air Way bill).
     */
    WEIGHT_CHARGES_PER_HAWB("B");

    /**
     * Attribute to hold the otherChargeRateType property.
     */
    private String otherChargeRateType;

    /**
     * Constructor with <code>otherChargeRateType</code> as an argument.
     * <p>
     * 
     * @param pOtherChargeRateType the new value of the <code>otherChargeRateType</code>.<br>
     */
    OtherChargeRateType(final String pOtherChargeRateType) {
        this.otherChargeRateType = pOtherChargeRateType;
    }

    /**
     * The <code>fromValue</code> method returns the <code>OtherChargeRateType</code> value.
     * <p>
     * 
     * @param pOtherChargeRateType the new value of <code>OtherChargeRateType</code>.
     *            <p>
     * @return the current enumerated value of the <code>OtherChargeRateType</code>.
     */
    public static OtherChargeRateType fromValue(final String pOtherChargeRateType) {

        OtherChargeRateType aOtherChargeRateType = null;
        for (final OtherChargeRateType bOtherChargeRateType : OtherChargeRateType.values()) {
            if (bOtherChargeRateType.getOtherChargeRateType().equals(pOtherChargeRateType)) {
                aOtherChargeRateType = bOtherChargeRateType;
                break;
            }
        }
        return aOtherChargeRateType;
    }

    /**
     * Gets the <code>otherChargeRateType</code> property.
     * <p>
     * Holds the rate type code applicable for an other charge rate.
     * <p>
     * 
     * @return the current value of the <code>otherChargeRateType</code> property.<br>
     */
    public String getOtherChargeRateType() {
        return this.otherChargeRateType;
    }

    /**
     * The <code>value</code> method returns the string value of <code>OtherChargeRateType</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>OtherChargeRateType</code>.<br>
     */
    public String value() {
        return this.getOtherChargeRateType();
    }
}