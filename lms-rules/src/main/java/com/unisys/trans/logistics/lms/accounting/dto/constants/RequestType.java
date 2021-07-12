//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;


public enum RequestType {

	/**
	 * Constant used for Open.
	 */
	RERATING("RERATING");

	

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
	RequestType(final String pRerate) {
	  
		this.rerate = pRerate;
	}

	/**
	 * @return the audit
	 */
	public String getRerate() {
		return rerate;
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
	 *Gets the <code>AuditStatusType</code>. <p>
	 * 
	 * @param pAuditStatusType holds the new value of <code>AuditStatusType</code>
	 * <p>
	 * 
	 * @return the current value of <code>AuditStatusType</code>
	 */
	public static RequestType getRequestType(final String pRequestType) {

		RequestType aRequestType = null;

		for (final RequestType aType : RequestType.values()) {

			if (pRequestType.equals(aType.getRerate())) {
				aRequestType = aType;
				break;
			}
		}

		return aRequestType;

	}
}
