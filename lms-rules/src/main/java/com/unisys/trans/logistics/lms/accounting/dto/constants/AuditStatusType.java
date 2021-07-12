//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>AuditStatusType</code> holds the constants to indicate AuditStatus type
 * applied.
 * <p>
 * Following are the possible AuditStatus type:<br>
 * <ul>
 * <li>OPEN
 * <li>CLOSED
 * <li>RELEASED
 * <li>AUDITED
 * <li>FORCED
 * </ul>
 */
public enum AuditStatusType {

	/**
	 * Constant used for Open.
	 */
	OPEN("Open","O"),

	/**
	 * Constant used for Closed.
	 */
	CLOSED("Closed","C"),

	/**
	 * Constant used for Released.
	 */
	RELEASED("Released","R"),

	/**
	 * Constant used for Audited.
	 */
	AUDITED("Audited","A"),

	/**
	 * Constant used for Forced.
	 */
	FORCED("Forced","F");

	/**
	 * Attribute to hold the <code>status</code> property.
	 */
	private String audit;

	/**
     * Attribute to hold the <code>auditStatus</code> property.
     */
    private String auditStatus;

    /**
	 * Parameterize constructor.
	 * 
	 * @param pPad
	 *            the value.
	 */
	AuditStatusType(final String pAuditStatus,final String pAudit) {
	    this.auditStatus = pAuditStatus;
		this.audit = pAudit;
	}

	/**
	 * @return the audit
	 */
	public String getAudit() {
		return this.audit;
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
     * @return the auditStatus
     */
    public String getAuditStatus() {
        return this.auditStatus;
    }

	/**
	 *Gets the <code>AuditStatusType</code>. <p>
	 * 
	 * @param pAuditStatusType holds the new value of <code>AuditStatusType</code>
	 * <p>
	 * 
	 * @return the current value of <code>AuditStatusType</code>
	 */
	public static AuditStatusType getAuditStatusType(final String pAuditStatusType) {

		AuditStatusType anAuditStatusType = null;

		for (final AuditStatusType aType : AuditStatusType.values()) {

			if (pAuditStatusType.equals(aType.getAudit())) {
				anAuditStatusType = aType;
				break;
			}
		}

		return anAuditStatusType;

	}
}
