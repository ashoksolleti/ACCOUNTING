package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/**
 * LMSFunction enum represents the functions which are applicable for LMS NG system.
 */
public enum LMSFunctionType {
    /**
     * Represents the goods acceptance function.
     */
    GOODS_ACCEPTANCE("Accepted"),
    /**
     * Represents the create container function.
     */
    CREATE_CONTAINER("Container Created"),
    /**
     * Represents the change container information function.
     */
    CHANGE_CONTAINER_INFOMATION("Container Changed"),
    /**
     * Represents the assign goods to flight function.
     */
    ASSIGN_GOODS("Assigned"),
    /**
     * Represents the remove goods from flight function.
     */
    REMOVE_GOODS("Removed"),
    /**
     * Represents the assignment goods to flight function.
     */
    GOODS_ASSIGNMENT_TO_FLIGHT("Manifested"),
    /**
     * Represents the flight finalization function.
     */
    ENTER_FLIGHT_FINAL("Flight Final"),
    /**
     * Represents the remove shipment from flight function.
     */
    REMOVE_SHIPMENT_FROM_FLIGHT("Removed from Flight"),
    /**
     * at export and assigned to finalized flight
     */
    ASSIGNED_TO_FINALIZED_FLIGHT_AT_EXPORT("Flight Final at Export"),
    /**
     * at export and assigned to flight
     */
    ASSIGNED_TO_FLIGHT_AT_EXPORT("Assigned at Export"),
    /**
     * Flight finalized
     */
    FLIGHT_FINALIZATION("Flight Finalzed"),
    /**
     * Container Check In
     */
    CONTAINER_CHECK_IN("Container CheckIn"),
    /**
     * Goods Check In
     */
    GOODS_CHECK_IN("Check In"),
    /**
     * Create Discrepancy
     */
    DISCREPANCY_CREATE("Create Discrepancy"),
    NOTIFICATION_DONE("Notified"),
    GONE_ON_DELIVERY("On Delivery"),
    GOODS_RETURNED_TO_TERMINAL("Returned to Terminal"),
    GOODS_STATUS_CHANGE("Status Change"),

    /**
     * Represents the create container function.
     */
    ULD_DISCREPANCY("ULD descripancy"),
    /**
     * Represents the assign goods to flight function.
     */
    MANIFESTED("Manifested"),
    /**
     * Represents the print transfer manifest function.
     */
    PRINT_TRANSFER_MANIFEST("Transfer Manifest"),
    /**
     * Represents the update container function.
     */
    UPDATE_CONTAINER("Container Updated"),
    /**
     * Represents the change goods location function.
     */
    CHANGE_GOODS_LOCATION("Location Changed"),
    /**
     * Represents the enter flight manifest function.
     */
    ENTER_FLIGHT_MANIFEST("Flight Manifest"),
    /**
     * Represents the container acceptance function.
     */
    CONTAINER_ACCEPTANCE("Container Accepted"),
    /**
     * Represents the goods discrepancy function.
     */
    GOODS_DISCREPANCY("Discrepancy");
    
    /**
     * Attribute to holds <code> code</code> property.
     */

    private String code;

    private String statusCode;

    /**
     * Constructor with pCode as an argument.
     * <p>
     * 
     * @param pCode
     *            Holds the pCode.
     */
    LMSFunctionType(final String pCode) {
        this.code = pCode;
        this.statusCode = pCode;
    }

    
    /**
     * Gets the value of the <code>code</code> property.
     * <p>
     *
     * @return Returns the current value of <code>code</code> property.
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the <code>code</code> property.
     * <p>
     *
     * @param <code>code</code> Holds the new value of the <code>code</code> property.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets the value of the <code>statusCode</code> property.
     * <p>
     *
     * @return Returns the current value of <code>statusCode</code> property.
     */
    public String getStatusCode() {
        return statusCode;
    }

    public String value() {
        return this.code;
    }
}