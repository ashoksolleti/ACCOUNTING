package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/**
 * Holds the container status information.
 */
public enum ContainerStatusType {
    ACCEPTED("Accepted"),
    ACCPECTED_IN_HOLD("Accpected In Hold"),
    ACTIVATED("Activated"),
    /**
     * Active after creation
     */
    ACTIVE_AFTER_CREATION("Active After Creation"),
    /**
     * Airline Hold
     */
    AIRLINE_HOLD("Airline Hold"),

    /**
     * Hold Removed.
     */
    AIRLINE_HOLD_REMOVED("Hold Removed"),
    AUTHORIZED_AIRLINE_HOLD("Authorized Airline Hold"),
    ARRIVAL_DOCUMENTS_DELIVERED("Arrival Documents Delivered"),
    ARRIVED("Arrived"),
    ARRIVED_IN_HOLD("Arrived In Hold"),
    /**
     * Arrived Non-Mech
     */
    ARRIVED_NON_MECH("Arrived Non-Mech"),

    /**
     * Bonded Warehouse.
     */
    BONDED_WAREHOUSE("Bonded Warehouse"),

    /**
     * Break down
     */
    BREAKDOWN("Break Down"),

    CARRIER_HOLD("Carrier Hold"),
    CLEARED_CUSTOMS("Cleared Customs"),

    CUSTOMS_HOLD("Customs Hold"),

    /**
     * Delivered
     */
    DELIVERED("Delivered"),

    FAR("Flight Arrived"),
    
    /**
     * Delivered on Substitue AWB.
     */
    DELIVERED_ON_A_SUBSTITUTE_AWB("Delivered on Substitue AWB"),

    /**
     * Finalized flight
     */
    FINALIZED_FLIGHT("Flight Final"),

    FOUND("Found"),

    /**
     * Gone on delivery
     */
    GONE_ON_DELIVERY("On Delivery"),
    GOODS_IN_CUSTOMS("Goods In Customs"),

    GOODS_IN_HOLD("Goods In Hold"),

    GOODS_STATUS_NOT_FOUND("Goods Status not found"),

    IN_CUSTOMS("In Customs"),

    IN_TRANSFER_MANIFESTED("In Transfer Manifested"),
    INBOND_MOVEMENT("Inbond Movement"),
    MANIFESTED("Manifested"),
    MANIFESTED_FFM("Manifested FFM"),
    MISSING("Missing"),
    MSCA_CONFIRMED("Missing Cargo Confirmed"),
    /**
     * Non-Deliverable.
     */
    NOT_DELIVERABLE("Non-Deliverable"),
    /**
     * Notified.
     */
    NOTIFIED_FOR_IMPORT_PICK_UP("Notified"),
    OVCD_CONFIRMED("Over Carried Confirmed"),
    OVER_CARRIED("Over Carried"),
    PARTIAL_CLEARED("Partial Cleared"),
    /**
     * Rejected Screening.
     */
    REJECTED_SCREENING("Screening Rejected"),
    /**
     * This is an enumerated ContainerStatusType constant to specify removed from Flight.
     */
    REMOVAL_FROM_FLIGHT("Removed from Flight"),
    /**
     * Returned.
     */
    RETURNED_FROM_GONE_ON_DELIVERY("Returned"),
    RETURNED_FROM_IN_CUSTOMS("returned from in customs"),
    SCREENING_REJECTED("Screening Rejected"),
    SHORT_SHIPPED("Short Shipped"),
    /**
     * Transfer Manifested .
     */
    TRANSFER_MANIFESTED("Transfer Manifested"),
    /**
     * Interline Transferred.
     */
    TRANSFERRED_INTERLINE("Interline Transferred"),
    /**
     * Surface Transferred.
     */
    TRANSFERRED_SURFACE("Surface Transferred"),
    /**
     * Transferred To Customs.
     */
    TRANSFERRED_TO_CUSTOMS("Transferred To Customs");

    private String code;

    /**
     * Constructor with pCode as an argument.
     * <p>
     * 
     * @param pCode
     *            Holds the pCode.
     */

    ContainerStatusType(final String pCode) {
        this.code = pCode;
    }

    /**
     * Gets the value of the <code>GoodsStatusType</code> string.
     * <p>
     * 
     * @return the current value of <code>anGoodsStatusType</code>.
     */

    public static ContainerStatusType getContainerStatusType(
                final String pContainerStatusTypeCode) {
        ContainerStatusType anContainerStatusType = null;
        for (final ContainerStatusType aType : ContainerStatusType.values()) {
            if (pContainerStatusTypeCode.equalsIgnoreCase(aType.getCode())) {
                anContainerStatusType = aType;
                break;
            }
        }

        return anContainerStatusType;
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

    public boolean isBlankStatus() {

        return ContainerStatusType.ACTIVATED.equals(this)
                    || ContainerStatusType.ARRIVED.equals(this)
                    || ContainerStatusType.ARRIVED_NON_MECH.equals(this)
                    || ContainerStatusType.FINALIZED_FLIGHT.equals(this)
                    || ContainerStatusType.MANIFESTED.equals(this)
                    || ContainerStatusType.REMOVAL_FROM_FLIGHT.equals(this);

    }

    /**
     * This methods will take an enum value say 'GONE_ON_DELIVERY' or
     * 'AT_EXPORT_AND_ASSIGNED_TO_FINALIZED_FLIGHT' or 'TRANSFER_MANIFESTED' and
     * validates the goods against the disposition type. * True - if the
     * disposition type values are permissible for the specified function *
     * false - if the disposition type values are not permissible for the
     * specified function
     * 
     * @return Response object that hold the boolean value which depends on
     *         whether the disposition type values are permissible for the
     *         specified function
     * 
     */
    public boolean isValidContainerDispositionForBreakdown() {
        return ContainerStatusType.GONE_ON_DELIVERY.equals(this)
                    || ContainerStatusType.FINALIZED_FLIGHT
                                .equals(this);
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

    public String value() {
        return this.code;
    }

}