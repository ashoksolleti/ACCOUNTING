/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * <code>ActionType</code> class holds the action type constants.
 * <p>
 */

public enum ActionType {
    /**
     * This is an enumerated action type constant for the create operation.
     */
    CREATE,
    /**
     * This is an enumerated action type constant for the delete operation.
     */
    DELETE,
    /**
     * This is an enumerated action type constant for the find operation.
     */
    FIND,
    /**
     * This is an enumerated action type constant for the Restore operation.
     */
    RESTORE,
    /**
     * This is an enumerated action type constant for the update operation.
     */
    UPDATE,
    /**
     * This is an enumerated action type constant for the Restore operation.
     */
    REACTIVATE,

    /**
     * This is an enumerated action type constant for the retrieve operation.
     */

    RETRIEVE,
    
    /**
     * This is an enumerated action type constant for the upload operation.
     */
    
    UPLOAD,
    
    UPLOAD_VALIDATE,
    
    ADD,
    

    SUBMIT,

    // LMSC-11111 UIS158 Start
    DEACTIVATE,
    
    MOVE;
	// LMSC-11111 UIS158 End
	

    /**
     * This method <code>fromValue</code> returns the enumerated value.
     * <p>
     * It is a type of create,find,update,delete operation.
     * <p>
     * 
     * @param pValue the value of enumerated type.
     *            <p>
     * @return the enumerated value of the action type.
     */
    public static ActionType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * The <code>value</code> method gives the string format of action type.
     * <p>
     * 
     * @return the enumerated value of the action type.
     */
    public String value() {
        return this.name();
    }

}
