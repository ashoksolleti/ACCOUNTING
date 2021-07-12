/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.preferences;

/**
 * @author RamannaV
 *
 */
public enum SimplifiedRestrictionType {

	/**
	 * Holds the Country type code.
	 */
	COUNTRYCODE("CN"),

	/**
	 * Holds the Product type code.
	 */
	PRODUCTCODE("PD"),

	/**
	 * Holds the SpecialHandlingCode type code.
	 */
	SPECIALHANDLINGCODE("SH"),

	/**
	 * Holds the AlertGroupCode type code.
	 */
	ALERTGROUPCODE("AG"),


	/**
	 * Holds the Station type code.
	 */
	STATIONCODE("ST"),

	/**
	 * Holds the WORLD type code.
	 */
	WORLD("WL"),

	/**
	 * Holds the CARRIER type code.
	 */
	CARRIER("CR"),

	/**
	 * Holds the FLIGHT type code.
	 */
	FLIGHT("FT"),

	/**
	 * Holds the AIR_CRAFT_TYPE type code.
	 */
	AIR_CRAFT_TYPE("AT"),

	/**
	 * Holds the AIR_CRAFT_RGN_NUMBER type code.
	 */
	AIR_CRAFT_RGN_NUMBER("AN"),

	/**
	 * Holds the COMMODITY_CODE type code.
	 */

	COMMODITY_CODE("CD"),

	/**
	 * Holds the WEIGHT type code.
	 */
	WEIGHT("WT"),

	/**
	 * Holds the DIMENSION type code.
	 */
	DIMENSION("DM"),
	
	/**
	 * Holds the DIMENSION type code.
	 */
	FROM_STATION("FS"),
	
	
	/**
	 * Holds the DIMENSION type code.
	 */
	TO_STATION("TS"),
	
	/**
	 * Holds the DIMENSION type code.
	 */
	FROM_COUNTRY("FC"),
	
	
	TO_COUNTRY("TC"),
	
	PARTICIPANT("PT"),
	
	
	/**
	 * Holds the ENFORCEMENT_RESTRICTION type code.
	 */
	ENFORCEMENT_RESTRICTION("R"),
	
	/**
	 * Holds the ENFORCEMENT_WARNING type code.
	 */
	
	ENFORCEMENT_WARNING("W"),
	
	/**
	 * Holds the ENFORCEMENT_ERROR type code.
	 */
	
	ENFORCEMENT_ERROR("E"),
	
	/**
	 * Holds the ENFORCEMENT_ERROR type code.
	 */
	
	ENFORCEMENT_COLLECT_CHARGES("C"),
	/**
	 * Holds the RESTRICTIONTYPE_EXPORT type code.
	 */
	
	RESTRICTIONTYPE_EXPORT("E"),
	/**
	 * Holds the RESTRICTIONTYPE_IMPORT type code.
	 */
	
	RESTRICTIONTYPE_IMPORT("I"),
	/**
	 * Holds the RESTRICTIONTYPE_TRANSIT type code.
	 */
	
	SHIPMENT_IMPACTED("SI"),
	
	RESTRICTIONTYPE_TRANSIT("T");

	/**
	 * Attribute to hold <code>type</code>.
	 */
	private final String type;

	/**
	 * Constructor with type code as an argument.
	 * <p>
	 * 
	 * @param pType
	 *            The request object holds the type code.
	 */
	SimplifiedRestrictionType(final String pType) {
		this.type = pType;
	}

	/**
	 * Gets the <code>type</code> of a restriction.
	 * <p>
	 * Restriction can contain multiple type codes.
	 * 
	 * @return the current value of the <code>type</code>.
	 */
	public String getRestrictionType() {
		return this.type;
	}

	/**
	 * Gives the string format of enumerated <code>type</code> for an air
	 * waybil.
	 * <p>
	 * 
	 * @return the enumerated value of the <code>type</code>.<br>
	 */
	public String value() {
		return this.name();
	}

}
