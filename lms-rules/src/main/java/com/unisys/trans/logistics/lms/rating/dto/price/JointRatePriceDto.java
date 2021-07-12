/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;

/**
 * <code>Joint Rate Price Dto</code> contains specific data applicable to the Joint Rate price
 * maintenance.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>airline1
 * <li>airline2
 * <li>airline3
 * <li>city1
 * <li>city2
 * <li>destination
 * <li>origin
 * </code>
 * </ul>
 */
public class JointRatePriceDto implements Serializable {

    /**
     * Generated serial version id.
     */
    private static final long serialVersionUID = -7895131857697656511L;

    /**
     * Attribute to hold <code>airline1</code> property.
     */
    private String airline1;

    /**
     * Attribute to hold <code>airline2</code> property.
     */
    private String airline2;

    /**
     * Attribute to hold <code>airline3</code> property.
     */
    private String airline3;

    /**
     * Attribute to hold <code>city1</code> property.
     */
    private String city1;

    /**
     * Attribute to hold <code>city2</code> property.
     */
    private String city2;

    /**
     * Attribute to hold <code>destination</code> property.
     */
    private String destination;

    /**
     * Attribute to hold <code>origin</code> property.
     */
    private String origin;

    /**
     * Gets the <code>airline1</code> property.
     * <p>
     * 
     * @return the current value of the <code>airline1</code> property.<br>
     */
    public String getAirline1() {
        return this.airline1;
    }

    /**
     * Gets the <code>airline2</code> property.
     * <p>
     * 
     * @return the current value of the <code>airline2</code> property.<br>
     */
    public String getAirline2() {
        return this.airline2;
    }

    /**
     * Gets the <code>airline3</code> property.
     * <p>
     * 
     * @return the current value of the <code>airline3</code> property.<br>
     */
    public String getAirline3() {
        return this.airline3;
    }

    /**
     * Gets the <code>city1</code> property.
     * <p>
     * 
     * @return the current value of the <code>city1</code> property.<br>
     */
    public String getCity1() {
        return this.city1;
    }

    /**
     * Gets the <code>city2</code> property.
     * <p>
     * 
     * @return the current value of the <code>city2</code> property.<br>
     */
    public String getCity2() {
        return this.city2;
    }

    /**
     * Gets the <code>destination</code> property.
     * <p>
     * 
     * @return the current value of the <code>destination</code> property.<br>
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * Gets the <code>origin</code> property.
     * <p>
     * 
     * @return the current value of the <code>origin</code> property.<br>
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * Sets the <code>airline1</code> property.
     * <p>
     * 
     * @param pAirline1
     *            the current value of the <code>airline1</code> property.<br>
     */
    public void setAirline1(final String pAirline1) {
        this.airline1 = pAirline1;
    }

    /**
     * Sets the <code>airline2</code> property.
     * <p>
     * 
     * @param pAirline2
     *            the current value of the <code>airline2</code> property.<br>
     */
    public void setAirline2(final String pAirline2) {
        this.airline2 = pAirline2;
    }

    /**
     * Sets the <code>airline3</code> property.
     * <p>
     * 
     * @param pAirline3
     *            the current value of the <code>airline3</code> property.<br>
     */
    public void setAirline3(final String pAirline3) {
        this.airline3 = pAirline3;
    }

    /**
     * Sets the <code>city1</code> property.
     * <p>
     * 
     * @param pCity1
     *            the current value of the <code>city1</code> property.<br>
     */
    public void setCity1(final String pCity1) {
        this.city1 = pCity1;
    }

    /**
     * Sets the <code>city2</code> property.
     * <p>
     * 
     * @param pCity2
     *            the current value of the <code>city2</code> property.<br>
     */
    public void setCity2(final String pCity2) {
        this.city2 = pCity2;
    }

    /**
     * Sets the <code>destination</code> property.
     * <p>
     * 
     * @param pDestination
     *            the current value of the <code>destination</code> property.<br>
     */
    public void setDestination(final String pDestination) {
        this.destination = pDestination;
    }

    /**
     * Sets the <code>origin</code> property.
     * <p>
     * 
     * @param pOrigin
     *            the current value of the <code>origin</code> property.<br>
     */
    public void setOrigin(final String pOrigin) {
        this.origin = pOrigin;
    }

}
