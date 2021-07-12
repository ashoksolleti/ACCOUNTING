//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>EventType</code> holds the constants to indicate Event type
 * applied.
 * <p>
 * Following are the possible Event type:<br>
 * <ul>
 * <li>AIRWAYBILL
 * </ul>
 */
public enum SourceType {

    XML("X"),
    STRING("S");

    /**
     * Attribute to hold the <code>event</code> property.
     */
    private String source;

    /**
     * @return the source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(final String pSource) {
        this.source = pSource;
    }

    /**
     * Parameterize constructor.
     * 
     * @param pPad
     *            the value.
     */
    SourceType(final String pSource) {
        this.source = pSource;
    }

    /**
     * Gives the string format of enumerated <code>EventType</code>.
     * <p>
     * 
     * @return the current string value of the <code>EventType</code>.
     */
    public String value() {
        return this.name();
    }

    /**
     * Gets the <code>EventType</code>.
     * <p>
     * 
     * @param pEventType holds the new value of <code>EventType</code>
     *            <p>
     * 
     * @return the current value of <code>EventType</code>
     */
    public static SourceType getSourceType(final String pSourceType) {

        SourceType aMatchedSourceType = null;

        for (final SourceType aType : SourceType.values()) {

            if (pSourceType.equals(aType.getSource())) {
                aMatchedSourceType = aType;
                break;
            }
        }

        return aMatchedSourceType;

    }
}
