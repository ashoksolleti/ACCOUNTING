//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on

package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>GeographicType</code> holds the constants to indicate geographic type applied.
 * <p>
 * Following are the possible geographic type:<br>
 * <ul>
 * <li>AIRPORT - 1
 * <li>CITY - 2
 * <li>COUNTRY - 3
 * <li>AGGREGATE - 4
 * </ul>
 */
public enum GeographicType {

    /**
     * Constant used for Aggregate.
     */
    AGGREGATE(4, 8, "Aggregate"),
    /**
     * Constant used for Airport.
     */
    AIRPORT(1, 7, "Airport"),
    /**
     * Constant used for Area.
     */
    AREA(5, 2, "Area"),
    /**
     * Constant used for City.
     */
    CITY(2, 6, "City"),
    /**
     * Constant used for Country.
     */
    COUNTRY(3, 5, "Country"),
    /**
     * Constant used for Region.
     */
    REGION(7, 4, "Region"),
    /**
     * Constant used for SubArea.
     */
    SUBAREA(6, 3, "SubArea");

    /**
     * Attribute to hold the <code>value</code> property.
     */
    private int hierarchy;

    /**
     * Attribute to hold the <code>value</code> property.
     */
    private Integer value;

    /**
     * Attribute to hold the <code>label</code> property.
     */
    private String label;

    /**
     * Parameterize constructor.
     * 
     * @param pVal
     *            holds the Integer value.
     * @param pHierarchy
     *            holds the int value.
     */
    GeographicType(final Integer pVal, final int pHierarchy) {
        this.hierarchy = pHierarchy;
        this.value = pVal;
    }

    /**
     * Parameterize constructor.
     * 
     * @param pVal
     *            holds the Integer value.
     * @param pHierarchy
     *            holds the int value.
     * @param pLabel
     *            holds the String value.
     */
    GeographicType(final Integer pVal, final int pHierarchy, final String pLabel) {
        this.hierarchy = pHierarchy;
        this.value = pVal;
        this.label = pLabel;
    }

    /**
     * Gets the <code>GeographicType</code>.
     * <p>
     * 
     * @param pType <code>Integer</code><br>
     *            Contains the enum type.<br>
     *            </p>
     * @return <code>{@link com.unisys.trans.logistics.lms.framework.dto.constants.GeographicType GeographicType}</code>
     * <br>
     *         Returns the <code>GeographicType</code>
     */
    public static GeographicType getGeographicType(final Integer pType) {
        GeographicType aMatchedGeographicType = null;
        for (GeographicType aType : GeographicType.values()) {
            if (aType.getValue().equals(pType)) {
                aMatchedGeographicType = aType;
                break;
            }
        }
        return aMatchedGeographicType;
    }

    /**
     * Gets the hierarchy.
     * <p>
     * 
     * @return the current value of <code>hierarchy</code> property.<br>
     */
    public int getHierarchy() {
        return this.hierarchy;
    }

    /**
     * Gets the enum Constant value.
     * <p>
     * 
     * @return the current value of <code>value</code> property.<br>
     */
    public Integer getValue() {
        return this.value;
    }

    /**
     * Sets the Hierarchy Constant value.
     * <p>
     * 
     * @param pHierarchy
     *            holds the Hierarchy.<br>
     */
    public void setHierarchy(final int pHierarchy) {
        this.hierarchy = pHierarchy;
    }

    /**
     * Gets the label.
     * <p>
     * 
     * @return the current value of <code>label</code> property.<br>
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Sets the label Constant value.
     * <p>
     * 
     * @param pLabel
     *            holds the Label.<br>
     */
    public void setLabel(final String pLabel) {
        this.label = pLabel;
    }

}
