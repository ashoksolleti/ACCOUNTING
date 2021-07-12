package com.unisys.trans.logistics.lms.utils.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>Dimension Entry Dto</code> class contain information specific to a
 * AircraftDimension.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>height
 * <li>width
 * <li>length
 * <li>segmentId
 * <li>rotationIndictor
 * <li>allowedIndicator
 * <li>dimensionWeightUnit
 * <li>oId
 * </code>
 * </ul>
 */

public class DimensionEntryDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5572083842580087697L;

    /**
     * Attribute to hold <code>airCraftType</code> property.
     */
    private String aircraftType;

    /**
     * Attribute to hold <code>allowedIndicator</code> property.
     */
    private boolean allowedIndicator;

    /**
     * Attribute to hold <code>height</code> property.
     */

    private BigDecimal height;

    /**
     * Attribute to hold <code>length</code> property.
     */

    private BigDecimal length;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>rotationIndictor</code> property.
     */
    private boolean rotationIndicator;

    /**
     * Attribute to hold <code>segmentId</code> property.
     */

    private int segmentId;

    /**
     * Attribute to hold <code>width</code> property.
     */

    private BigDecimal width;

    /**
     * Default Constructor.
     */
    public DimensionEntryDto() {
    }

    /**
     * Gets the <code>aircraftType</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of the <code>aircraftType</code> property.
     */
    public String getAircraftType() {
        return this.aircraftType;
    }

    /**
     * Gets the <code>AllowedIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>AllowedIndicator</code> property.
     */
    public boolean getAllowedIndicator() {
        return this.allowedIndicator;
    }

    /**
     * Gets the <code>Height</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of the <code>Height</code> property.
     */
    public BigDecimal getHeight() {
        return this.height;
    }

    /**
     * Gets the <code>Length</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of the <code>Length</code> property.
     */
    public BigDecimal getLength() {
        return this.length;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>DimensionEntry</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return this.oId;
    }

    /**
     * Gets the <code>rotationIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>rotationIndicator</code> property.
     */
    public boolean getRotationIndicator() {
        return rotationIndicator;
    }

    /**
     * Gets the <code>segmentId</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of the <code>segmentId</code> property.
     */
    public int getSegmentId() {
        return this.segmentId;
    }

    /**
     * Gets the <code>Width</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of the <code>Width</code> property.
     */
    public BigDecimal getWidth() {
        return this.width;
    }

    /**
     * Sets the <code>aircraftType</code> property.
     * 
     * @param pAircraftType
     *            builds a list from comma separated string.
     */
    public void setAircraftType(final String pAircraftType) {
        this.aircraftType = ContractUtility.convertToUpperCase(pAircraftType);
    }

    /**
     * Sets the <code>allowedIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pAllowedIndicator
     *            the current value of the <code>allowedIndicator</code> property.
     */
    public void setAllowedIndicator(final boolean pAllowedIndicator) {
        this.allowedIndicator = pAllowedIndicator;
    }

    /**
     * Sets the <code>Height</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param pHeight
     *            the current value of the <code>Height</code> property.
     */
    public void setHeight(final BigDecimal pHeight) {
        this.height = pHeight;
    }

    /**
     * Sets the <code>Length</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param pLength
     *            the current value of the <code>Length</code> property.
     */
    public void setLength(final BigDecimal pLength) {
        this.length = pLength;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>DimensionEntry</code>.It is of type Long.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>rotationIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pRotationIndicator
     *            the current value of the <code>rotationIndicator</code> property.
     */

    public void setRotationIndicator(final boolean pRotationIndicator) {
        this.rotationIndicator = pRotationIndicator;
    }

    /**
     * Sets the <code>segmentId</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param pSegmentId
     *            the current value of the <code>segmentId</code> property.
     */
    public void setSegmentId(final int pSegmentId) {
        this.segmentId = pSegmentId;
    }

    /**
     * Sets the <code>Width</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param pWidth
     *            the current value of the <code>Width</code> property.
     */
    public void setWidth(final BigDecimal pWidth) {
        this.width = pWidth;
    }

}
