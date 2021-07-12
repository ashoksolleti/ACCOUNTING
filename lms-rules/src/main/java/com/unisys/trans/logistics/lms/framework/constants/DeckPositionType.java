//@formatter:off
/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * 
 * Creation/update source
 * <ul>
 * 
 * <li>S = ESI</li>
 * <li>E = EGI</li>
 * <li>B = EBI OR FFR</li>
 * <li>A = GAC OR GCI mask changes to a lower ordered AWB</li>
 * <li>F = EFM OR FFM</li>
 * <li>D = EGD</li>
 * <li>G = GCI:ACP</li>
 * <li>M = AWB with minimum data the indicators are hierarchical: transactions whose FICSRC setting is higher
 * on the list can update AWB data if the AWB FICSRC is lower on the list. The FICSRC is then overwritten with
 * the new level indicator.</li>
 * <li>T = the indicators are hierarchical: transactions whose FICSRC setting is higher on the list can update
 * AWB data if the AWB FICSRC is lower on the list. The FICSRC is then overwritten with the new level
 * indicator.</li>
 * <li>R = ESI of a REF AWB (ACN = C$RACN)</li>
 * </ul>
 * 
 * @author Unisys
 * 
 */
public enum DeckPositionType {

    /**
     * The deck position type is Lower Deck Container.
     */
    LOWER_DECK_CONTAINER("C"),
    
    /**
     * The deck position type is Lower Deck Pallets.
     */
    LOWER_DECK_POSITION("L"),

    /**
     * The deck position type is Tall Deck Pallets.
     */
    TALL_UPPER_DECK_POSITION("T"),

    /**
     * The deck position type is Upper Deck Pallets.
     */
    UPPER_DECK_POSITION("U");


    /**
     * The <code>value</code> method gives the string format of action type.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the action type.<br>
     */
    private String deckPositionType;

    /**
     * Parameterized constructor. Accepts the string representation of the enum
     * as the parameter
     * 
     * @param pValue
     *            String representaion of the enum
     */
    DeckPositionType(final String pValue) {
        this.deckPositionType = pValue;
    }

    /**
     * Gets the enum constant for the given value.
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            Contains the enum value.<br>
     * @return <code>ULDCategoryType</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public static DeckPositionType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Parse the given string and find the matching enumeration constant. If no
     * match is found returns a null value.
     * 
     * @param pValue
     *            String value defined for the enum constant to be found.
     * @return Returns AirWaybillCreationSource Enumerated value , or <code>null</code> if no matching enum is
     *         found.
     */
    public static DeckPositionType parse(final String pValue) {
        DeckPositionType itemFound = null;
        for (final DeckPositionType item : DeckPositionType.values()) {
            if (pValue.equalsIgnoreCase(item.deckPositionType)) {
                itemFound = item;
                break;
            }
        }
        return itemFound;
    }

    /**
     * Gets the value of the enum constant.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public String getValue() {
        return this.deckPositionType;
    }

    /**
     * Gets the string value of the enum.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public String value() {
        return this.name();
    }

}
