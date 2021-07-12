package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/**
 * It specifies the goods and container status change and holds the various
 * customs status of the goods and container.
 */
public enum CustomsStatusType {
    /**
     * Represents the customs status.
     */
    IN_CUSTOMS("In Customs", "w"),
    /**
     * Represents the partially cleared customs.
     */
    PARTIALLY_CLEARED_CUSTOMS("Partial Clearance", "K"),
    /**
     * Represents the goods hold status as customs hold.
     */
    CUSTOMS_HOLD("Customs Hold", "W"),
    /**
     * Represents the container rejected screening.
     */
    IN_REJECTED_SCREENING("Screening Rejected", "J"),

    /**
     * Represents the container clearend customs.
     */
    CLEARED_CUSTOMS("Cleared Customs", "C"),
    /**
     * Represents the container inbond Movement.
     */
    INBOND_MOVEMENT("Inbond movement", "O"),

    /**
     * Represents the airline hold status.
     */
    AIRLINE_HOLD("Airline Hold", "H"),

    /**
     * Represents the remove airline hold status.
     */
    REMOVED_AIRLINE_HOLD("Hold Removed", "X"),

    /**
     * Represents the returned from delivery status.
     */
    RETURNED_FROM_DELIVERY("Returned from Delivery", "R"),

    /**
     * Represents the returned from delivery status.
     */
    HELD_FOR_PICK_UP("Held for Pick up", "P"),
    
    /**
     * Represents the Arrived status.
     */
    ARRIVED("Arrived", "A"),
    
    /**
     * Represents the Arrived in Hold status.
     */
    ARRIVED_IN_HOLD("Arrived in Hold", "AH"),
    
    /**
     * Represents the Interline Transferred  status.
     */
    INTERLINE_TRANSFERRED("Interline Transferred", "I"),
    /**
     * Represents the Returned status.
     */
    RETURNED_FROM_GONE_ON_DELIVERY("Returned", "R"),
    /**
     * Represents the  Goods on Hand status.
     */
    GOODS_ON_HAND("Goods on Hand","GACP"),
    /**
     * Represents the  Activated  status.
     */
    ACTIVATED("Activated"),
    /**
     * Represents the  Accepted status.
     */
    ACCEPTED("Accepted","GAC"),
    /**
     * Represents the  Not Hold status.
     */
    NOTHOLD(" ","NH"),
    /**
     * Represents the  Manifested  status.
     */
    MANIFESTED("Manifested", "M"),
    /**
     * Represents the  Manifested FFM status.
     */
    MANIFESTED_FFM("Manifested FFM", "E"),
    
    FLIGHT_FINAL("Flight Final", "F");
    
    private String statusCode;

    /**
     * Attribute to holds <code> code</code> property.
     */

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    CustomsStatusType(final String pStatusCode) {
        this.statusCode = pStatusCode;
    }

    CustomsStatusType(final String pCode, final String pStatusCode) {
        this.code = pCode;
        this.statusCode = pStatusCode;
    }

    public boolean checCustomsStatus() {
        return CustomsStatusType.CUSTOMS_HOLD.equals(this)
                    || CustomsStatusType.AIRLINE_HOLD.equals(this)
                    || CustomsStatusType.PARTIALLY_CLEARED_CUSTOMS.equals(this);
    }

    /**
     * Gets the value of the <code>GoodsStatusType</code> string.
     * <p>
     * 
     * @return the current value of <code>anGoodsStatusType</code>.
     */

    public static CustomsStatusType getCustomsStatusFromGoodsStatusCode(
                final String pGoodsStatusCode) {
        CustomsStatusType aType = null;
        for (final CustomsStatusType customsStatus : CustomsStatusType.values()) {
            if (customsStatus.getStatusCode().equals(pGoodsStatusCode)) {
                aType = customsStatus;
                break;
            }
        }

        return aType;
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
}