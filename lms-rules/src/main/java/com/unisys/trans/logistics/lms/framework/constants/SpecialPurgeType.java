package com.unisys.trans.logistics.lms.framework.constants;

public enum SpecialPurgeType {

	/**
	 * Constant used for Marked.
	 */
	MARKED("MARKED"),

	/**
	 * Constant used for Forced.
	 */
	FORCED("FORCED"),

	/**
	 * Constant used for Purge_Set.
	 */
	PURGE_SET("PURGED SET");

	/**
	 * Attribute to hold the <code>purge</code> property.
	 */
	private String purge;

	/**
	 * Parameterize constructor.
	 * 
	 * @param pPurge
	 *            the value.
	 */
	SpecialPurgeType(final String pPurge) {
		this.purge = pPurge;
	}

	/**
	 * @return the purge
	 */
	public String getPurge() {
		return purge;
	}

	/**
	 * Gives the string format of enumerated <code>SpecialPurgeType</code>.
	 * <p>
	 * 
	 * @return the current string value of the <code>SpecialPurgeType</code>.
	 */
	public String value() {
		return this.name();
	}
}
