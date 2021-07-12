package com.unisys.trans.logistics.lms.framework.constants;

public enum OperationsSourceType {

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * AIRLINE_FLIGHT_MANIFEST.
     * <p>
     * value = {@value}
     */
    AIRLINE_FLIGHT_MANIFEST("AIRLINE_FLIGHT_MANIFEST", ""),

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * BEGIN_CHECK_IN.
     * <p>
     * value = {@value}
     */
    BEGIN_CHECK_IN("BEGIN_CHECK_IN", ""),

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * CHANGE_GOODS_LOCATION.
     * <p>
     * value = {@value}
     */
    CHANGE_GOODS_LOCATION("CHANGE_GOODS_LOCATION", ""),

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * ENTER_FLIGHT_MANIFEST.
     * <p>
     * value = {@value}
     */
    ENTER_FLIGHT_MANIFEST("ENTER_FLIGHT_MANIFEST", ""),

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * FLIGHT_ASSIGNMENT.
     * <p>
     * value = {@value}
     */
    FLIGHT_ASSIGNMENT("FLIGHT_ASSIGNMENT", ""),

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * FLIGHT_MOVEMENT_MESSAGE.
     * <p>
     * value = {@value}
     */
    FLIGHT_MOVEMENT_MESSAGE("FLIGHT_MOVEMENT_MESSAGE", ""),

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * FLIGHT_REMOVAL.
     * <p>
     * value = {@value}
     */
    FLIGHT_REMOVAL("FLIGHT_REMOVAL", ""),

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * GOODS_ACCEPTANCE.
     * <p>
     * value = {@value}
     */
    GOODS_ACCEPTANCE("GOODS_ACCEPTANCE", ""),

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * GOODS_ASSIGNMENT.
     * <p>
     * value = {@value}
     */
    GOODS_ASSIGNMENT("GOODS_ASSIGNMENT", ""),

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * GOODS_CHECK_IN.
     * <p>
     * value = {@value}
     */
    GOODS_CHECK_IN("GOODS_CHECK_IN", ""),

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * GOODS_INFORMATION.
     * <p>
     * value = {@value}
     */
    GOODS_INFORMATION("GOODS_INFORMATION", "LMS-UI Goods Information"),

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * GOODS_STATUS_CHANGE.
     * <p>
     * value = {@value}
     */
    GOODS_STATUS_CHANGE("GOODS_STATUS_CHANGE", ""),

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * INBOUND_INVENTORY.
     * <p>
     * value = {@value}
     */
    INBOUND_INVENTORY("INBOUND_INVENTORY", ""),

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * OUTBOUND_INVENTORY.
     * <p>
     * value = {@value}
     */
    OUTBOUND_INVENTORY("OUTBOUND_INVENTORY", ""),

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * PIECE_ID_DETAILS.
     * <p>
     * value = {@value}
     */
    PIECE_ID_DETAILS("PIECE_ID_DETAILS", ""),

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * PRINT_SHIPMENT_LABEL.
     * <p>
     * value = {@value}
     */
    PRINT_SHIPMENT_LABEL("PRINT_SHIPMENT_LABEL", ""),

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * UPDATE_PIECE_ID.
     * <p>
     * value = {@value}
     */
    UPDATE_PIECE_ID("UPDATE_PIECE_ID", ""),
    
    LOCATION_INVENTORY("LOCATION_INVENTORY", ""),
    
    
    NON_MECH_GOODS_CHECKIN("NON_MECH_GOODS_CHECKIN",""),
    
    /**
     * LMS-25580
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * CHECKIN_BY_ULD.
     * <p>
     * value = {@value}
     */
	CHECKIN_BY_ULD("CHECKIN_BY_ULD", ""),
	
    STATION_INFO("STATION_INFO",""),
    /**
     * AC432A 
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * STATION_CONTROL_INFO.
     * <p>
     * value = {@value}
     */
    
    
    
    STATION_CONTROL_INFO("STATION_CONTROL_INFO",""),
    /**
     * CR-2000690 
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * EXPRESS_AIRWAY_BILL.
     * <p>
     * value = {@value}
     */
    EXPRESS_AIRWAY_BILL("EXPRESS_AIRWAY_BILL_PRINT",""),  
    CONTAINER_INFROMATION("CONTAINER_INFROMATION"," "),
    CONTAINER_ASSIGNED_TO_FLIGHT("CONTAINER_ASSIGNED_TO_FLIGHT"," "),
    FLIGHT_FINALIZE("FLIGHT_FINALIZE","LMS-UI Flight Finalization"),
    FLIGHT_MOVEMENT_MESSAGE_NON_MECH_CHECKIN("FLIGHT_MOVEMENT_MESSAGE", ""),
    OUTBOUND_FLIGHT_INVENTORY("OUTBOUND_FLIGHT_INVENTORY", ""),
    INBOUND_FLIGHT_INVENTORY("INBOUND_FLIGHT_INVENTORY", ""),
    INBOUND_FLIGHT_STATUS("INBOUND_FLIGHT_STATUS", ""),
    CHECKIN_BY_AWB("CHECKIN_BY_AWB", ""),
	// LMS-48183 start..
	ULD_DISCREPANCY("ULD_DISCREPANCY", ""),
	// LMS-48183 end..
	
	GOODS_DISCREPANCY("GOODS_DISCREPANCY", ""),
	
	DOFC_FSU_UPDATE("DOFC_FSU_UPDATE",""),

	// LMSC-18466 Changes started
	 /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * FOUND_CARGO.
     * <p>
     * value = {@value}
     */
    FOUND_CARGO("FOUND_CARGO", ""),
    
    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * MISSING_CARGO.
     * <p>
     * value = {@value}
     */
    MISSING_CARGO("MISSING_CARGO", ""),

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * SHORT_SHIPPED.
     * <p>
     * value = {@value}
     */
    SHORT_SHIPPED("SHORT_SHIPPED", ""),

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * OVER_CARRIED.
     * <p>
     * value = {@value}
     */
    OVER_CARRIED("OVER_CARRIED", ""),
    // LMSC-18466 Changes end

    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * DELETE_GOODS.
     * <p>
     * value = {@value}
     */
	DELETE_GOODS("DELETE_GOODS", ""),
	
    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * DANGEROUS_GOODS.
     * <p>
     * value = {@value}
     */
	DANGEROUS_GOODS("DANGEROUS_GOODS", ""),
	
    /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * DANGEROUS_GOODS.
     * <p>
     * value = {@value}
     */
	HOUSE_GOODS("HOUSE_GOODS", ""),

    // LMSC-21301 Changes start
	 /**
     * This is an enumerated OperationsSourceType constant to specify Operations Source Type -
     * ULD_GOODS_DISCREPANCY.
     * <p>
     * value = {@value}
     */
    ULD_GOODS_DISCREPANCY("ULD_GOODS_DISCREPANCY", "");
    // LMSC-21301 Changes end

	
	
    /**
     * Attribute to hold <code>description</code> .
     */
    private String description;

    /**
     * Attribute to hold <code>operationsSourceType</code> .
     */
    private String operationsSourceType;

    /**
     * Constructor with <code>operationsSourceType</code> as an
     * argument.
     * <p>
     * 
     * @param pOperationsSourceType
     *            the new value of the <code>operationsSourceType</code> .
     */
    private OperationsSourceType(final String pOperationsSourceType,
                final String pDescription) {
        this.operationsSourceType = pOperationsSourceType;
        this.description = pDescription;
    }

    /**
     * This method returns the OperationsSourceType for provided source.
     * 
     * @param pSource
     * @return OperationsSourceType
     */
    public static OperationsSourceType getSourceValue(final String pSource) {
        return OperationsSourceType.valueOf(pSource);
    }

    /**
     * Gets the <code>description</code>.
     * <p>
     * 
     * @return the current value of <code>description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gives the string format of <code>operationsSourceType</code>.
     * <p>
     * 
     * @return the enumerated value of the <code>operationsSourceType</code>.<br>
     */
    public String value() {
        return this.operationsSourceType;
    }

}
