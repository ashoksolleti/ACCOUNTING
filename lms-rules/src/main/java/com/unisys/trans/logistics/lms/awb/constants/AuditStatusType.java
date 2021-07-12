//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.awb.constants;

/**
 * <code>AuditStatusType</code> holds the constants to indicate AuditStatus type applied.
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
    OPEN("OPEN"),

    /**
     * Constant used for Closed.
     */
    CLOSED("CLOSED"),

    /**
     * Constant used for Released.
     */
    RELEASED("RELEASED"),

    /**
     * Constant used for Audited.
     */
    AUDITED("AUDITED"),

    /**
     * Constant used for Forced.
     */
    FORCED("FORCED");

    /**
     * Attribute to hold the <code>status</code> property.
     */
    private String audit;

    /**
     * Parameterize constructor.
     * 
     * @param pPad
     *            the value.
     */
    AuditStatusType(final String pAudit) {
        this.audit = pAudit;
    }

    /**
     * @return the audit
     */
    public String getAudit() {
        return audit;
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
    
    public static AuditStatusType getAuditStatusType(final String pValue) {
        AuditStatusType auditStatus = null;
        for(AuditStatusType audit : AuditStatusType.values()) {
            if(pValue.equalsIgnoreCase(audit.getAudit()) || audit.getAudit().startsWith(pValue)) {
                auditStatus = audit;
                break;
            }
        }
        return auditStatus;
                    
    }
}
