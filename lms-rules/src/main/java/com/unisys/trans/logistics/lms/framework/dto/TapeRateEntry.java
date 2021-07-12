package com.unisys.trans.logistics.lms.framework.dto;

/**
 * <p>
 * Tape Rate Entry holds the set of properties bound for rate entries load from TACT/Local rate files.
 * </p>
 * 
 * @author Unisys
 * 
 */
public class TapeRateEntry extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = 4311080697359775181L;

    /**
     * <p>
     * String that holds the input line from which the Add On rate information is populated. This is purely
     * used in TACT load and shouldn't be used for any other purpose.
     * </p>
     */
    private String rateLine;

    /**
     * Returns the value of the property <code>iriRateLine</code>.
     * 
     * Refer to {@link #rateLine} for the purpose of the field.
     * 
     * @return String value of the property.
     */
    public String getRateLine() {
        return this.rateLine;
    }

    /**
     * Set the property <code>iriRateLine</code>.
     * 
     * Refer to {@link #rateLine} for the purpose of the field.
     * 
     * @param pIriRateLine Value that needs to be set to the class
     *            property.
     */
    public void setRateLine(final String pIriRateLine) {
        this.rateLine = pIriRateLine;
    }

    @Override
    public Long getOId() {
        throw new UnsupportedOperationException("An instance of this DTO does not support the method");
    }

}
