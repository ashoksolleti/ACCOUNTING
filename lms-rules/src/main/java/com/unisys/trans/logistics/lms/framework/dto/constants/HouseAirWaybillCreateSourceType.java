/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * Indicates the various house airwaybill create source types.
 * <p>
 * This contains the following attributes.
 * <li>I - Enter House AirWaybill Information.</li>
 * <li>L - Incoming FHL Message.</li>
 * <li>G - Enter House Goods Information.</li>
 * <li>M - Enter House Shipment Information.</li>
 */
public enum HouseAirWaybillCreateSourceType {
    /**
     * Constant used for AccountingAirwaybillUpdate.
     */
    I("EHI", "Enter House AirWaybill Information"),

    /**
     * Constant used for AirwaybillLoad.
     */
    L("FHL", "Incoming FHL Message"),
    /**
     * Constant used for CarrierPayable.
     */

    G("EHG", "Enter House Goods Information"),
    /**
     * Constant used for CarrierReceivable.
     */

    M("EHM", "Enter House Shipment Information");

    /**
     * Attribute to hold the <code>ceateSourceType</code> property.
     */
    private String createSourceType;

    /**
     * Attribute to hold the <code>ceateSourceValue</code> property.
     */
    private String createSourceValue;

    /**
     * Parameterize constructor.
     * 
     * @param pPad
     *            the value.
     */
    HouseAirWaybillCreateSourceType(final String pCreateSourceType, final String pCreateSourceValue) {
        this.createSourceType = pCreateSourceType;
        this.createSourceValue = pCreateSourceValue;
    }

    /**
     * Gets the <code>HouseAirWaybillCreateSourceType</code>.
     * <p>
     * 
     * @param pHouseAirWaybillCreateSourceType holds the new value of
     *            <code>HouseAirWaybillCreateSourceType</code>
     *            <p>
     * 
     * @return the current value of <code>HouseAirWaybillCreateSourceType</code>
     */
    public static HouseAirWaybillCreateSourceType getHouseAirWaybillCreateSourceType(
                final String pCeateSourceType) {

        HouseAirWaybillCreateSourceType aHouseAirWaybillCreateSourceType = null;

        for (final HouseAirWaybillCreateSourceType aType : HouseAirWaybillCreateSourceType.values()) {

            if (aType.getCreateSourceType().equals(pCeateSourceType)) {
                aHouseAirWaybillCreateSourceType = aType;
                break;
            }
        }

        return aHouseAirWaybillCreateSourceType;

    }

    /**
     * Gets the <code>HouseAirWaybillCreateSourceValue</code>.
     * <p>
     * 
     * @param pHouseAirWaybillCreateSourceValue holds the new value of
     *            <code>HouseAirWaybillCreateSourceValue</code>
     *            <p>
     * 
     * @return the current value of <code>HouseAirWaybillCreateSourceValue</code>
     */
    public static HouseAirWaybillCreateSourceType getHouseAirWaybillCreateSourceValue(
                final String pCeateSourceValue) {

        HouseAirWaybillCreateSourceType aHouseAirWaybillCreateSourceValue = null;

        for (final HouseAirWaybillCreateSourceType aValue : HouseAirWaybillCreateSourceType.values()) {

            if (aValue.getCreateSourceValue().equals(pCeateSourceValue)) {
                aHouseAirWaybillCreateSourceValue = aValue;
                break;
            }
        }

        return aHouseAirWaybillCreateSourceValue;

    }

    /**
     * Gets the value of the Category property.
     * 
     * @return the category
     */
    public String getCreateSourceType() {
        return this.createSourceType;
    }

    /**
     * * Sets the value of the Category property.
     * 
     * @param category the category to set.
     */
    public void setCreateSourceType(final String pCreateSourceType) {
        this.createSourceType = pCreateSourceType;
    }

    /**
     * Gets the value of the createSourceValue property.
     * 
     * @return the createSourceValue
     */
    public String getCreateSourceValue() {
        return this.createSourceValue;
    }

    /**
     * * Sets the value of the createSourceValue property.
     * 
     * @param pCreateSourceValue the createSourceValue to set.
     */
    public void setCreateSourceValue(final String pCreateSourceValue) {
        this.createSourceValue = pCreateSourceValue;
    }

    /**
     * Gives the string format of enumerated <code>CategoryTypr</code>.
     * <p>
     * 
     * @return the current string value of the <code>CategoryTypr</code>.
     */
    public String value() {
        return this.name();
    }
}
