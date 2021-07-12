/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>ActionType</code> class holds the action type constants.
 * <p>
 */

public enum ActionType {
    /**
     * This is an enumerated action type constant for activate the offices.<br>
     */
    ACTIVATE,
    /**
     * This is an enumerated action type constant for calculate shipment dimension.<br>
     */
    CALCULATE_SHIPMENT_DIMENSION,
    /**
     * This is an enumerated action type constant for change terminal area name operation.<br>
     */
    CHANGETERMINALAREANAME,
    /**
     * This is an enumerated action type constant for the change terminal location name operation.<br>
     */
    CHANGETERMINALLOCATIONNAME,
    /**
     * This is an enumerated action type constant for the close terminal area operation.<br>
     */
    CLOSETERMINALAREA,

    /**
     * This is an enumerated action type constant for the close terminal location operation.<br>
     */
    CLOSETERMINALLOCATION,

    /**
     * This is an enumerated action type constant for the convert exchange rate amount.<br>
     */
    CONVERTEXCHANGERATEAMOUNT,
    /**
     * This is an enumerated action type constant for the create operation.<br>
     */
    CREATE,
    /**
     * This is an enumerated action type constant for the delete operation.<br>
     */
    DELETE,
    /**
     * This is an enumerated action type constant for the delete rounding factor operation.<br>
     */
    DELETEROUNDINGFACTOR,

    /**
     * This is an enumerated action type constant for the delete terminal area operation.<br>
     */
    DELETETERMINALAREA,
    /**
     * This is an enumerated action type constant for the delete terminal location operation.<br>
     */
    DELETETERMINALLOCATION,
    /**
     * This is an enumerated action type constant for the find operation.<br>
     */
    FIND,
    /**
     * This is an enumerated action type constant for finding all the offices associated with the station.<br>
     */
    FINDALL,

    /**
     * This is an enumerated action type constant for finding all queues in an office.<br>
     */
    FINDQUEUES,

    /**
     * This is an enumerated action type constant for activate the offices.<br>
     */
    INACTIVATE,
    /**
     * This is an enumerated action type constant for changing the terminal location
     * from one area to another.<br>
     */
    MOVETERMINALLOCATION,

    /**
     * This is an enumerated action type constant for the open terminal area operation.<br>
     */
    OPENTERMINALAREA,

    /**
     * This is an enumerated action type constant for the open terminal location operation.<br>
     */
    OPENTERMINALLOCATION,

    /**
     * This is an enumerated action type constant for the Restore operation.<br>
     */
    RESTORE,

    /**
     * This is an enumerated action type constant for the restrict terminal area operation.<br>
     */
    RESTRICTTERMINALAREA,

    /**
     * This is an enumerated action type constant for the restrict terminal location operation.<br>
     */
    RESTRICTTERMINALLOCATION,

    /**
     * This is an enumerated action type constant for the update operation.<br>
     */
    UPDATE,
    
    /**
     * This is an enumerated action type constant for the find operation.<br>
     */

    RETRIEVE,

    /**
     * This is an enumerated action type constant for the restore operation.<br>
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
