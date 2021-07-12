//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum ReRatingStatusType {

	/**
	 * Constant used for Open.
	 */
	COMPLETED("COMPLETED"),

	PROCESSING("PROCESSING"),

	ERROR("ERROR");

	/**
	 * Attribute to hold the <code>status</code> property.
	 */
	private String rerate;

	/**
	 * Parameterize constructor.
	 * 
	 * @param pPad
	 *            the value.
	 */
	ReRatingStatusType(final String pRerate) {

		this.rerate = pRerate;
	}

	/**
	 * @return the audit
	 */
	public String getRerate() {
		return this.rerate;
	}

	/**
	 * Gives the string format of enumerated <code>AuditStatusType</code>.
	 * <p>
	 * 
	 * @return the current string value of the <code>AuditStatusType</code>.
	 */
	public String value() {
		return this.name();
	}

	/**
	 * Gets the <code>AuditStatusType</code>.
	 * <p>
	 * 
	 * @param pAuditStatusType
	 *            holds the new value of <code>AuditStatusType</code>
	 *            <p>
	 * 
	 * @return the current value of <code>AuditStatusType</code>
	 */
	public static ReRatingStatusType getReRatingStatusType(
			final String pReRatingStatusType) {

		ReRatingStatusType aMatchedReRatingStatusType = null;

		for (final ReRatingStatusType aType : ReRatingStatusType.values()) {

			if (pReRatingStatusType.equals(aType.getRerate())) {
				aMatchedReRatingStatusType = aType;
				break;
			}
		}

		return aMatchedReRatingStatusType;

	}
}
