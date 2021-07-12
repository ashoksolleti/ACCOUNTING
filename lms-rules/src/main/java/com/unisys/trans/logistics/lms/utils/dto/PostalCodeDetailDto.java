/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.math.BigDecimal;

/**
 * <code>PostalCodeDetailDto</code> holds all the attributes that are associated to a Postal code.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>postalCodeOId
 * <li>countryCode
 * <li>pickupTime
 * <li>deliveryTime
 * <li>drivingDistance
 * <li>expressOperatorAccountNumber
 * <li>normalOperatorAccountNumber
 * <li>standardDayOffset
 * <li>stationCode
 * <li>zone
 * <li>timeDefiniteDayOffset
 * <li>oId
 * </code>
 * </ul>
 */
public class PostalCodeDetailDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5730100875600399722L;

    /**
     * Attribute to hold <code>countryCode</code> property.
     * <p>
     * Indicates the country to which the Postal code belongs.
     */
    private String countryCode;

    /**
     * Attribute to hold <code>deliveryTime</code> property.
     * <p>
     * Indicates the time in hours required to deliver the goods from a station to a place in the postal code.
     */
    private BigDecimal deliveryTime;

    /**
     * Attribute to hold <code>drivingDistance</code> property.
     * <p>
     * Indicates the distance between the postal code and the airport.
     */
    private BigDecimal drivingDistance;

    /**
     * Attribute to hold <code>expressOperatorAccountNumber</code> property.
     * <p>
     * Indicates the express cargo pick-up/delivery operator account. Participant Account number of local
     * pick-up/ delivery operator.
     */
    private String expressOperatorAccountNumber;

    /**
     * Attribute to hold <code>normalOperatorAccountNumber</code> property.
     * <p>
     * Indicates the normal cargo pick-up/delivery operator account. Participant Account number of local
     * pick-up/ delivery operator.
     */
    private String normalOperatorAccountNumber;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key identify the <code>PostalCodeDetailDto</code>. It is of type Long.
     */
    private Long oId;

    /**
     * Attribute to hold <code>pickupTime</code> property.
     * <p>
     * Indicates the time in hours required to pick the goods from a place in the postal code and bring them
     * to the station.
     */
    private BigDecimal pickupTime;

    /**
     * Attribute to hold <code>postalCodeOId</code> property.
     * <p>
     * Unique key identify the <code>PostalCodeDto</code>. It is of type Long.
     */
    private Long postalCodeOId;

    /**
     * Attribute to hold <code>standardDayOffset</code> property.
     * <p>
     * Indicates Number of days to be added to acceptance date to calculate the delivery date for a time
     * definite "to door" product with normal service level and airport to door.
     */
    private int standardDayOffset;

    /**
     * Attribute to hold <code>stationCode</code> property.
     * <p>
     * Indicates the station to which the Postal code belongs.
     */
    private String stationCode;

    /**
     * Attribute to hold <code>timeDefiniteDayOffset</code> property.
     * <p>
     * Number of days to be added to acceptance date to calculate the delivery date for a time definite
     * "to door" product with time frame service level and airport to door.
     */
    private int timeDefiniteDayOffset;

    /**
     * Attribute to hold <code>zone</code> property.
     * <p>
     * The pick up and delivery zone for the airport.
     */
    private String zone;

    
    //SK253A
    private Boolean expressPickup;
    private Boolean expressDelivery;
    // SK 253A - End

    /**
     * Gets the <code>countryCode</code> property.
     * <p>
     * Indicates the country to which the Postal code belongs.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabet.
     * <p>
     * <b>Example :</b><br>
     * US
     * <p>
     * 
     * @return the current value of the <code>countryCode</code> property.
     */
    public String getCountryCode() {
        return ContractUtility.convertToUpperCase(this.countryCode);
    }

    /**
     * Gets the <code>deliveryTime</code> property.
     * <p>
     * Indicates the time in hours required to deliver the goods from a station to a place in the postal code.
     * <p>
     * <b>Format: </b><br>
     * 1-4.1-2 Numeric.
     * <p>
     * <b>Example :</b><br>
     * 0012.11
     * <p>
     * 
     * @return the current value of <code>deliveryTime</code> property.
     */
    public BigDecimal getDeliveryTime() {
        return this.deliveryTime;
    }

    /**
     * Gets the <code>drivingDistance</code> property.
     * <p>
     * The distance between the postal code and this airport.
     * <p>
     * <b>Format: </b><br>
     * 1-6.1-2 Numeric.
     * <p>
     * <b>Example :</b><br>
     * 0100.12
     * <p>
     * 
     * @return the current value of <code>drivingDistance</code> property.
     */
    public BigDecimal getDrivingDistance() {
        return this.drivingDistance;
    }

    /**
     * Gets the <code>expressOperatorAccountNumber</code> property.
     * <p>
     * Indicates the express cargo pick-up/delivery operator account. Participant Account number of local
     * pick-up/ delivery operator.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Special Format.
     * <p>
     * 
     * @return the current value of <code>expressOperatorAccountNumber</code> property.
     */
    public String getExpressOperatorAccountNumber() {
        return this.expressOperatorAccountNumber;
    }

    /**
     * Gets the <code>normalOperatorAccountNumber</code> property.
     * <p>
     * Indicates the normal cargo pick-up/delivery operator account. Participant Account number of local
     * pick-up/ delivery operator.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Special Format.
     * <p>
     * 
     * @return the current value of <code>normalOperatorAccountNumber</code> property.
     */
    public String getNormalOperatorAccountNumber() {
        return this.normalOperatorAccountNumber;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>PostalCodeDetailDto</code>. It is of type Long.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabet.
     * <p>
     * <b>Example :</b><br>
     * US
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>pickupTime</code> property.
     * <p>
     * Indicates the time in hours required to pick the goods from a place in the postal code and bring them
     * to the station.
     * <p>
     * <b>Format: </b><br>
     * 1-4.1-2 Numeric.
     * <p>
     * <b>Example :</b><br>
     * 012.20
     * <p>
     * 
     * @return the current value of the <code>pickupTime</code> property.
     */
    public BigDecimal getPickupTime() {
        return this.pickupTime;
    }

    /**
     * Gets the <code>postalCodeOId</code> property.
     * <p>
     * Indicates the oId of the Postal code.
     * <p>
     * 
     * @return the current value of the <code>postalCodeOId</code> property.
     */
    public Long getPostalCodeOId() {
        return this.postalCodeOId;
    }

    /**
     * Gets the <code>standardDayOffset</code> property.
     * <p>
     * Indicates Number of days to be added to acceptance date to calculate the delivery date for a time
     * definite "to door" product with normal service level and airport to door.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Numeric.
     * <p>
     * <b>Example :</b><br>
     * 02
     * <p>
     * 
     * @return the current value of the <code>standardDayOffset</code> property.
     */
    public int getStandardDayOffset() {
        return this.standardDayOffset;

    }

    /**
     * Gets the <code>stationCode</code> property.
     * <p>
     * Indicates the value of the stationCode to which the Postal code belongs.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet.
     * <p>
     * <b>Example :</b><br>
     * ORD
     * <p>
     * 
     * @return the current value of the <code>stationCode</code> property.
     */
    public String getStationCode() {
        return ContractUtility.convertToUpperCase(this.stationCode);
    }

    /**
     * Gets the <code>timeDefiniteDayOffset</code> property.
     * <p>
     * Number of days to be added to acceptance date to calculate the delivery date for a time definite
     * "to door" product with time frame service level and airport to door.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Numeric.
     * <p>
     * <b>Example :</b><br>
     * US
     * <p>
     * 
     * @return the current value of the <code>timeDefiniteDayOffset</code> property.
     */
    public int getTimeDefiniteDayOffset() {
        return this.timeDefiniteDayOffset;
    }

    /**
     * Gets the <code>zone</code> property.
     * <p>
     * The pick up and delivery zone for the airport.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet.
     * <p>
     * <b>Example :</b><br>
     * N
     * <p>
     * 
     * @return the current value of the <code>zone</code> property.
     */
    public String getZone() {
        return ContractUtility.convertToUpperCase(this.zone);

    }

    /**
     * Sets the <code>countryCode</code> property.
     * <p>
     * Indicates the country to which the Postal code belongs.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabet.
     * <p>
     * <b>Example :</b><br>
     * US
     * <p>
     * 
     * @param pCountryCode the new value of the <code>countryCode</code> property.
     */
    public void setCountryCode(final String pCountryCode) {
        this.countryCode = ContractUtility.convertToUpperCase(pCountryCode);
    }

    /**
     * Sets the <code>deliveryTime</code> property.
     * <p>
     * Indicates the time in hours required to deliver the goods from a station to a place in the postal code.
     * <p>
     * <b>Format: </b><br>
     * 1-4.1-2 Numeric.
     * <p>
     * <b>Example :</b><br>
     * 0012.11
     * <p>
     * 
     * @param pDeliveryTime the new value of the <code>deliveryTime</code> property.
     */
    public void setDeliveryTime(final BigDecimal pDeliveryTime) {
        this.deliveryTime = pDeliveryTime;
    }

    /**
     * Sets the <code>drivingDistance</code> property.
     * <p>
     * The distance between the postal code and this airport.
     * <p>
     * <b>Format: </b><br>
     * 1-6.1-2 Numeric.
     * <p>
     * <b>Example :</b><br>
     * 0100.12
     * <p>
     * 
     * @param pDrivingDistance the new value of the <code>drivingDistance</code> property.
     */
    public void setDrivingDistance(final BigDecimal pDrivingDistance) {
        this.drivingDistance = pDrivingDistance;

    }

    /**
     * Sets the <code>expressOperatorAccountNumber</code> property.
     * <p>
     * Indicates the express cargo pick-up/delivery operator account. Participant Account number of local
     * pick-up/ delivery operator.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Special Format.
     * <p>
     * 
     * @param pExpressOperatorAccountNumber the new value of the <code>expressOperatorAccountNumber</code>
     *            property.
     */
    public void setExpressOperatorAccountNumber(final String pExpressOperatorAccountNumber) {
        this.expressOperatorAccountNumber = pExpressOperatorAccountNumber;

    }

    /**
     * Sets the <code>normalOperatorAccountNumber</code> property.
     * <p>
     * Indicates the normal cargo pick-up/delivery operator account. Participant Account number of local
     * pick-up/ delivery operator.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Special Format.
     * <p>
     * 
     * @param pNormalOperatorAccountNumber the new value of the <code>normalOperatorAccountNumber</code>
     *            property.
     */
    public void setNormalOperatorAccountNumber(final String pNormalOperatorAccountNumber) {
        this.normalOperatorAccountNumber = pNormalOperatorAccountNumber;

    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>PostalCodeDetailDto</code>.It is of type Long.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>pickupTime</code> property.
     * <p>
     * Indicates the time in hours required to pick the goods from a place in the postal code and bring them
     * to the station.
     * <p>
     * <b>Format: </b><br>
     * 1-4.1-2 Numeric.
     * <p>
     * <b>Example :</b><br>
     * 012.20
     * <p>
     * 
     * @param pPickupTime the new value of the <code>pickupTime</code> property.
     */
    public void setPickupTime(final BigDecimal pPickupTime) {
        this.pickupTime = pPickupTime;
    }

    /**
     * Sets the <code>postalCodeOId</code> property.
     * <p>
     * Indicates the oId of the Postal code.
     * <p>
     * 
     * @param pPostalCodeOid the new value of the <code>oId</code> property.
     */
    public void setPostalCodeOId(final Long pPostalCodeOid) {
        this.postalCodeOId = pPostalCodeOid;
    }

    /**
     * Sets the <code>standardDayOffset</code> property.
     * <p>
     * Indicates Number of days to be added to acceptance date to calculate the delivery date for a time
     * definite "to door" product with normal service level and airport to door.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Numeric.
     * <p>
     * <b>Example :</b><br>
     * 02
     * <p>
     * 
     * @param pStandardDayOffset the new value of the <code>standardDayOffset</code> property.
     */
    public void setStandardDayOffset(final int pStandardDayOffset) {
        this.standardDayOffset = pStandardDayOffset;
    }

    /**
     * Sets the <code>stationCode</code> property.
     * <p>
     * Indicates the value of the stationCode to which the Postal code belongs.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet.
     * <p>
     * <b>Example :</b><br>
     * ORD
     * <p>
     * 
     * @param pStationCode the new value of the <code>stationCode</code> property.
     */
    public void setStationCode(final String pStationCode) {
        this.stationCode = ContractUtility.convertToUpperCase(pStationCode);
    }

    /**
     * Sets the <code>timeDefiniteDayOffset</code> property.
     * <p>
     * Number of days to be added to acceptance date to calculate the delivery date for a time definite
     * "to door" product with time frame service level and airport to door.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Numeric.
     * <p>
     * <b>Example :</b><br>
     * US
     * <p>
     * 
     * @param pTimeDefiniteDayOffset the new value of the <code>timeDefiniteDayOffset</code> property.
     */
    public void setTimeDefiniteDayOffset(final int pTimeDefiniteDayOffset) {
        this.timeDefiniteDayOffset = pTimeDefiniteDayOffset;
    }

    /**
     * Sets the <code>zone</code> property.
     * <p>
     * The pick up and delivery zone for the airport.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet.
     * <p>
     * <b>Example :</b><br>
     * N
     * <p>
     * 
     * @param pZone the new value of the <code>zone</code> property.
     */
    public void setZone(final String pZone) {
        this.zone = ContractUtility.convertToUpperCase(pZone);
    }

	public Boolean getExpressPickup() {
		return expressPickup;
	}

	public void setExpressPickup(Boolean expressPickup) {
		this.expressPickup = expressPickup;
	}

	public Boolean getExpressDelivery() {
		return expressDelivery;
	}

	public void setExpressDelivery(Boolean expressDelivery) {
		this.expressDelivery = expressDelivery;
	}
}