package com.unisys.trans.logistics.lms.rating.dto;

/**
 * <code>ExtractFormatType</code> holds the format of file.
 * <p>
 * Following are the possible ratingConventionType:<br>
 * <ul>
 * <li>C - Comma seperated format
 * <li>F - Fixed
 * <li>M - CMR
 * </ul>
 */
public enum ExtractFormatType {
    /**
     * C represents Comma Separated Format.
     */
    C("Comma Separated Format"),
    /**
     * F represents Fixed Width Format.
     */
    F("Fixed Width Format"),
    /**
     * M represents CMR Format.
     */
    M("CMR Format"),
    
    /**
     * S represents CMR Format.
     */
    S("CSV Upload Format");
    /**
     * Attribute to hold the <code>format</code> property.
     */
    private String format;

    /**
     * Parameterize constructor.
     * 
     * @param pFormat
     *            the current value of the <code>ExtractFormatType</code> property.
     */
    ExtractFormatType(final String pFormat) {
        this.format = pFormat;
    }

    /**
     * Gets the enum Constant value.
     * <p>
     * 
     * @return the current value of <code>format</code> property.<br>
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the enum Constant value.
     * <p>
     * 
     * @param pFormat
     *            the current value of <code>format</code> property.<br>
     */
    public void setFormat(final String pFormat) {
        this.format = pFormat;
    }
}
