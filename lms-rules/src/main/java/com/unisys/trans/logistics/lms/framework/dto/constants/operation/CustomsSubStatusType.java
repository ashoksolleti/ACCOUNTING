package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/**
 * <p>
 * It specifies the goods and container status change and holds the various customs sub status of the goods
 * and container.
 * </p>
 */
public enum CustomsSubStatusType {

    A("USDA Agency Hold", "A"),
    U("U. S. Customs Hold", "U"),
    X("Other entity placed Hold", "X"),
    E("U. S. Customs physical examination requested", "E"),
    R("ACI Reject", "R"),
    H("ACI Hold", "H"),
    F("AWB Cancelled", "F"),
    T("Transit Cancelled", "T"),
    V("Goods Arrived at Customs Station", "V"),
    K("Partial Pieces released", "K");

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
    CustomsSubStatusType(final String pCode, final String pStatusCode) {
        this.code = pCode;
        this.statusCode = pStatusCode;
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
