package com.unisys.trans.logistics.lms.framework.constants;

import com.unisys.trans.logistics.lms.framework.dto.constants.GoodsStatusType;

/**
 * <code>DocumentStatusType</code> class holds the action type constants.
 */
public enum DocumentStatusType {
    /**
     * Constant used for D.
     */
    D("Documents Delivered"),
    /**
     * Constant used for DF.
     */
    DF("Documents Delivered-Found"),
    /**
     * Constant used for DM.
     */
    DM("Documents Delivered-Missing"),
    /**
     * Constant used for DU.
     */
    DU("Documents Delivered-Undo"),
    /**
     * Constant used for E.
     */
    E("Documents Exported"),
    /**
     * Constant used for EF.
     */
    EF("Documents Exported-Found"),
    /**
     * Constant used for EM.
     */
    EM("Documents Exported-Missing"),
    /**
     * Constant used for EU.
     */
    EU("Documents Exported-Undo"),
    /**
     * Constant used for I.
     */
    I("Documents Imported"),
    /**
     * Constant used for IF.
     */
    IF("Documents Imported-Found"),
    /**
     * Constant used for IM.
     */
    IM("Documents Imported-Missing"),
    /**
     * Constant used for IU.
     */
    IU("Documents Imported-Undo"),
    /**
     * Constant used for NONE.
     */
    NONE("NONE"),
    /**
     * Constant used for R.
     */
    R("Documents Received"),
    /**
     * Constant used for RF.
     */
    RF("Documents Received-Found"),
    /**
     * Constant used for RM.
     */
    RM("Documents Received-Missing"),
    /**
     * Constant used for RU.
     */
    RU("Documents Received-Undo"),

	/**
	 * Constant used for ACP.
	 */
    ACP("Documents accepted"),

	/**
	 * Constant used for ACF.
	 */
    ACF("Documents accepted found"),

	/**
	 * Constant used for ACM.
	 */
    ACM("Documents accepted missing"),

	/**
	 * Constant used for ACU.
	 */
    ACU("Documents accepted undo"),

	/**
	 * Constant used for EXP.
	 */
    EXP("Documents exported"),

	/**
	 * Constant used for EXF.
	 */
    EXF("Documents exported found"),

	/**
	 * Constant used for EXM.
	 */
    EXM("Documents exported missing"),

	/**
	 * Constant used for EXU.
	 */
    EXU("Documents exported undo"),

	/**
	 * Constant used for IMP.
	 */
    IMP("Documents imported"),

	/**
	 * Constant used for IMF.
	 */
    IMF("Documents imported found"),

	/**
	 * Constant used for IMM.
	 */
    IMM("Documents imported missing"),

	/**
	 * Constant used for IMU.
	 */
    IMU("Documents imported undo"),

	/**
	 * Constant used for DLV.
	 */
    DLV("Documents delivered(FSE)"),

	/**
	 * Constant used for DDF.
	 */
    DDF("Documents delivered found"),

	/**
	 * Constant used for DDM.
	 */
    DDM("Documents delivered missing"),

	/**
	 * Constant used for DDU.
	 */
    DDU("Documents delivered undo");
    /**
     * Attribute to hold the <code>type</code> property.
     */
    private final String type;

    /**
     * <code>Parameterized constructor.</code>
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code> property.
     */
    DocumentStatusType(final String pType) {
        this.type = pType;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * 
     * @return the current value of the <code>type</code> property.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Gives the string format of enumerated <code>value</code>.
     * <p>
     * 
     * @return the current value of the <code>value</code>.
     */
    public String value() {
        return this.name();
    }
    
    /**
     * Gets the value of the <code>GoodsStatusType</code> string.
     * <p>
     * 
     * @return the current value of <code>anGoodsStatusType</code>.
     */

    public static DocumentStatusType getDocumentStatusFromDocumentStatusCode(
                final String pDocumentStatusCode) {
    	
    	DocumentStatusType anDocumentStatusType = null;
        for (final DocumentStatusType aType : DocumentStatusType.values()) {
            if (aType.getType().equalsIgnoreCase(pDocumentStatusCode)) {
                anDocumentStatusType = aType;
                break;
            }
        }

        return anDocumentStatusType;
    }

}
