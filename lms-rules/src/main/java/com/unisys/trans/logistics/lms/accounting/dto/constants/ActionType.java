/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>ActionType</code> class holds the action type constants.
 */

public enum ActionType {
    /**
     * This is an enumerated action type constant for the create class rating id operation.<br>
     */
    CLASS_RATINGID_CREATE,
    /**
     * This is an enumerated action type constant for the delete class rating id operation.<br>
     */
    CLASS_RATINGID_DELETE,
    /**
     * This is an enumerated action type constant for the restore class rating id operation.<br>
     */
    CLASS_RATINGID_RESTORE,
    /**
     * This is an enumerated action type constant for the create class rating id version operation.<br>
     */
    CLASS_RATINGID_VERSION_CREATE,
    /**
     * This is an enumerated action type constant for the purge class rating id version operation.<br>
     */
    CLASS_RATINGID_VERSION_PURGE,
    /**
     * This is an enumerated action type constant for the update class rating id version operation.<br>
     */
    CLASS_RATINGID_VERSION_UPDATE,
    /**
     * This is an enumerated action type constant for the create country tax operation.<br>
     */
    COUNTRYTAXCREATE,
    /**
     * This is an enumerated action type constant for the find country tax operation.<br>
     */
    COUNTRYTAXFIND,
    /**
     * This is an enumerated action type constant for the update country tax operation.<br>
     */
    COUNTRYTAXUPDATE,
    /**
     * This is an enumerated action type constant for the create operation.<br>
     */
    CREATE,
    /**
     * This is an enumerated action type constant for the delete operation.<br>
     */
    DELETE,
    /**
     * This is an enumerated action type constant for the find operation.<br>
     */
    FIND,
    /**
     * This is an enumerated action type constant for the process operation.<br>
     */
    PROCESS,
    /**
     * This is an enumerated action type constant for the Restore operation.<br>
     */
    RESTORE,
    /**
     * This is an enumerated action type constant for the Reverse operation.<br>
     */
    REVERSE,
    /**
     * This is an enumerated action type constant for the create state tax operation.<br>
     */
    STATETAXCREATE,
    /**
     * This is an enumerated action type constant for the find state tax operation.<br>
     */
    STATETAXFIND,
    /**
     * This is an enumerated action type constant for the update state tax operation.<br>
     */
    STATETAXUPDATE,
    /**
     * This is an enumerated action type constant for the update operation.<br>
     */
    UPDATE,
    /**
     * This is an enumerated action type constant for the create US tax operation.<br>
     */
    USTAXCREATE,
    /**
     * This is an enumerated action type constant for the find US tax operation.<br>
     */
    USTAXFIND,
    /**
     * This is an enumerated action type constant for the update US tax operation.<br>
     */
    USTAXUPDATE,
    /**
     * This is an enumerated action type constant for the create Vat tax operation.<br>
     */
    VATTAXCREATE,
    /**
     * This is an enumerated action type constant for the find Vat tax operation.<br>
     */
    VATTAXFIND,
    
    /**
     * This is an enumerated action type constant for the re-rate AWB operation for spot rate.<br>
     */
    RERATE,
    
    /**
     * This is an enumerated action type constant for the deleted status to be stored in 
     * history table.<br>
     */
    DEL,
    
    
    /**
     * This is an enumerated action type constant for the update Vat tax operation.<br>
     */
    VATTAXUPDATE,
    
    /**
     * This is an enumerated action type constant for the Retrieve accounting participant information.<br>
     */
    RETRIEVE,
    
    /**
     * This is an enumerated action type constant for the REACTIVATE accounting participant information.<br>
     */
    REACTIVATE;

    /**
     * This method <code>fromValue</code> returns the enumerated value.
     * <p>
     * It is a type of create,find,update,delete operation.<br>
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            The value of enumerated type.<br>
     *            </p>
     *            <p>
     * @return the enumerated value of the action type.<br>
     *         </p>
     */
    public static ActionType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * The <code>value</code> method gives the string format of action type.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the action type.<br>
     */
    public String value() {
        return this.name();
    }

}
