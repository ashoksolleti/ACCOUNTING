/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>HostType</code> defines the list of hosts, that can be used to determine the host specific data
 * source.
 */
public enum HostType {
    /**
     * List of Airline codes which are hosted as part of this application.<br>
     */
    AC(false, "AC"),
    UW(true, "UW"),
    DL(false, "DL"),
    SK(false, "SK"),
    AI(false, "AI"),
    NZ(false, "NZ"),
    G3(false, "G3"),
    X5(false, "5X"),
    V3(false, "3V"),
    X8(false, "8X"),
    CA(false, "CA"),
    MU(false, "MU"),
    AK(false, "AK"),
    MH(false, "MH"),
    WD(false, "WD"),
    MW(false, "MW"),
    KH(false, "KH");

    private boolean hostEnabled;

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Default Constructor.
     */
    private HostType() {

    }

    /**
     * Parameterize constructor.
     * 
     * @param pHostEnabled
     *            holds the Integer value.
     */
    private HostType(final boolean pHostEnabled, final String pAirlineCode) {
        this.setHostEnabled(pHostEnabled);
        this.setCode(pAirlineCode);
    }

    /**
     * Gets the <code>HostType</code>.
     * <p>
     * 
     * @param pHost holds the value of the host airline.
     *            <p>
     * @return the respective host type specified in enumeration.
     */
    public static HostType getHostType(final String pHost) {

        HostType aHostType = null;

        for (final HostType aType : HostType.values()) {

            if (pHost.equals(aType.getCode())) {
                aHostType = aType;
                break;
            }
        }

        return aHostType;

    }

    /**
     * Gets the string value of the <code>HostType</code>.
     * <p>
     * 
     * @return the current value of the <code>HostType</code>.<br>
     */

    public String value() {
        return this.getCode();
    }

    /**
     * Gets the <code>hostEnabled</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @return the current value of the <code>hostEnabled</code> property.
     */
    public boolean isHostEnabled() {
        return hostEnabled;
    }

    /**
     * Sets the <code>hostEnabled</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pHostEnabled the new value of the <code>hostEnabled</code>.
     */
    public void setHostEnabled(final boolean pHostEnabled) {
        this.hostEnabled = pHostEnabled;
    }

}
