package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>RestrictionGenerateConstants </code> class holds the Restriciton generation constants that hold
 * various type of constants as follows <code>COLLECTCHARGE_RESTRICTION</code>.
 * <code>COLLECTCHARGE_WARNING</code> <code>EXPORT_RESTRICTION</code> <code>EXPORT_WARNING</code>
 * <code>IMPORT_RESTRICTION</code> <code>IMPORT_WARNING</code> <code>TRANSIT_RESTRICTION</code>
 * <code>TRANSIT_WARNING</code>
 * <p>
 */
public enum RestrictionMessageType {
    /**
     * This is enumerated restriction type constant for collect charge restriction.
     */
    COLLECTCHARGECODE_RESTRICTION("Collect charge restriction."),
    /**
     * This is enumerated restriction type constant for collect charge warning.
     */
    COLLECTCHARGECODE_WARNING("Collectcharge may not be allowed."),
    /**
     * This is enumerated restriction type constant for export restriction.
     */
    EXPORTCODE_RESTRICITON("Export restriction."),
    /**
     * This is enumerated restriction type constant export warning.
     */
    EXPORTCODE_WARNING("Possible export restriction."),
    /**
     * This is enumerated restriction type constant for import restriction.
     */
    IMPORTCODE_RESTRICTION("Import restriction."),
    /**
     * This is enumerated restriction type constant export warning.
     */
    IMPORTCODE_WARNING("Possible import restriction."),
    /**
     * This is enumerated restriction type constant for transit restriction.
     */
    TRANSITCODE_RESTRICTION("Transit restriction."),
    /**
     * This is enumerated restriction type constant transit warning.
     */
    TRANSITCODE_WARNING("Possible transit restriction.");
    /**
     * Attribute to hold error or warning <code>message</code>.
     */
    private String message;

    /**
     * Constructor with message as an argument.
     * <p>
     * 
     * @param pMessage Holds the error or warning message.
     */
    private RestrictionMessageType(final String pMessage) {
        this.message = pMessage;
    }

    /**
     * Gets the <code>message</code>.
     * <p>
     * Message could be error or warning message.
     * 
     * @return the current value of <code>message</code>.
     */
    public String getRestrictionMessage() {
        return this.message;
    }

}
