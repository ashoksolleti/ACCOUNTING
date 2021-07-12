

//@formatter:off
/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.awb.constants;

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
 * <li>M = AWB with minimum data the indicators are hierarchical: transactions
 * whose FICSRC setting is higher on the list can update AWB data if the AWB
 * FICSRC is lower on the list. The FICSRC is then overwritten with the new
 * level indicator.</li>
 * <li>T = the indicators are hierarchical: transactions whose FICSRC setting is
 * higher on the list can update AWB data if the AWB FICSRC is lower on the
 * list. The FICSRC is then overwritten with the new level indicator.</li>
 * <li>R = ESI of a REF AWB (ACN = C$RACN)</li>
 * </ul>
 * 
 * @author Unisys
 * 
 */
public enum AirWaybillCreationSourceType {

	S("S"), E("E"), B("B"), A("A"), F("F"), D("D"), G("G"), M("M"), R("R"),T("T");

	/** Attribute that holds the string representation for the enum **/
	String value;

	/**
	 * Parameterized constructor. Accepts the string representation of the enum
	 * as the parameter
	 * 
	 * @param value
	 *            String representaion of the enum
	 */
	AirWaybillCreationSourceType(final String value) {
		this.value = value;
	}

	/**
	 * Parse the given string and find the matching enumeration constant. If no
	 * match is found returns a null value.
	 * 
	 * @param value
	 *            String value defined for the enum constant to be found.
	 * @return Returns AirWaybillCreationSource Enumerated value , or
	 *         <code>null</code> if no matching enum is found.
	 */
	AirWaybillCreationSourceType parse(final String value) {
		AirWaybillCreationSourceType itemFound = null;
		for (AirWaybillCreationSourceType item : AirWaybillCreationSourceType
				.values()) {
			if (value.equalsIgnoreCase(item.value)) {
				itemFound = item;
				break;
			}
		}
		return itemFound;
	}

}
