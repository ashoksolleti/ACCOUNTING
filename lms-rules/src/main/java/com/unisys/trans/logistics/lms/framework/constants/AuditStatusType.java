//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.constants;

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
     * Constant used for Audited.
     */
    AUDITED("AUDITED"),

    /**
     * Constant used for Closed.
     */
    CLOSED("CLOSED"),

    /**
     * Constant used for Forced.
     */
    FORCED("FORCED"),

    /**
     * Constant used for Open.
     */
    OPEN("OPEN"),

    /**
     * Constant used for Released.
     */
    RELEASED("RELEASED");

    /**
     * Attribute to hold the <code>status</code> property.
     */
    private String audit;

    /**
     * Parameterize constructor.
     * 
     * @param pAudit
     *            the value.
     */
    AuditStatusType(final String pAudit) {
        this.audit = pAudit;
    }

    /**
     * This method <code>getAuditStatusType</code> returns the AuditStatusType.
     * 
     * @param pValue
     *            <code>String</code><br>
     *            The value of due code.<br>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.accounting.dto.constants.AuditStatusType
     *         pValue}</code><br>
     *         Returns the type of auditStatus <br>
     *         </p>
     */
    public static AuditStatusType getAuditStatusType(final String pValue) {
        AuditStatusType auditStatus = null;
        for (final AuditStatusType audit : AuditStatusType.values()) {
            if (pValue.equalsIgnoreCase(audit.getAudit())
                        || audit.getAudit().startsWith(pValue)) {
                auditStatus = audit;
                break;
            }
        }
        return auditStatus;

    }

    /**
     * Gets the audit.
     * <p>
     * 
     * @return the current value of <code>audit</code> property.<br>
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
}
