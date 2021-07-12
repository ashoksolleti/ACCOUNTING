package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.constants.DimensionalUOMType;
import com.unisys.trans.logistics.lms.framework.constants.LengthUOMType;

/**
 * <code>DimensionDto</code> retrieves the <code>Dimension information</code>.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <li>segmentId
 * <li>airCraftType
 * <li>height
 * <li>width
 * <li>length
 * <li>rotationIndictor
 * <li>allowedIndicator
 * <li>dimensionWeightUnit
 * <li>oId
 * </code>
 */
public class DimensionDto {
    /**
     * Attribute to hold <code>airCraftType</code> property.
     */
    private String aircraftType;

    /**
     * Attribute to hold <code>allowedIndicator</code> property.
     */
    private boolean allowedIndicator;

    /**
     * Attribute to hold <code>dimensionWeightUnit</code> property.
     */
    private LengthUOMType dimensionWeightUnit;

    /**
     * Attribute to hold <code>height</code> property.
     */
    private Integer height;

    /**
     * Attribute to hold <code>length</code> property.
     */
    private Integer length;

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
    private Integer width;
    /**
     * Attribute to hold <code>pieces</code> property.
     */
    private Integer pieces;
    /**
     * Attribute to hold <code>dimensionalUOMType</code> property.
     */
    private DimensionalUOMType dimensionalUOMType;

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
     * Gets the <code>dimensionWeightUnit</code> property.
     * <p>
     * <b>Format: </b><br>
     * CM or IN or YD or ME or FT List
     * <p>
     * <b>Example: </b><br>
     * CM
     * <p>
     * 
     * @return the current value of the <code>dimensionWeightUnit</code> property.
     */

    public LengthUOMType getDimensionWeightUnit() {
        return this.dimensionWeightUnit;
    }

    /**
     * Gets the <code>height</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of the <code>height</code> property.
     */
    public Integer getHeight() {
        return this.height;
    }

    /**
     * Gets the <code>length</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of the <code>length</code> property.
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
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
     * Gets the <code>width</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of the <code>width</code> property.
     */
    public Integer getWidth() {
        return this.width;
    }

    /**
     * Gets the <code>allowedIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>allowedIndicator</code> property.
     */
    public boolean getAllowedIndicator() {
        return this.allowedIndicator;
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
        return this.rotationIndicator;
    }

    /**
     * Sets the <code>aircraftType</code> property.
     * 
     * @param pAircraftType
     *            the new value of the <code>aircraftType</code> property.
     */
    public void setAircraftType(final String pAircraftType) {
        this.aircraftType = pAircraftType;
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
     * Sets the <code>dimensionWeightUnit</code> property.
     * <p>
     * <b>Format: </b><br>
     * CM or IN or YD or ME or FT List
     * <p>
     * <b>Example: </b><br>
     * CM
     * <p>
     * 
     * @param pDimensionWeightUnit
     *            <code>{@link LengthUOMType}</code> the current value of the <code>dimensionWeightUnit</code>
     *            property.
     */

    public void setDimensionWeightUnit(final LengthUOMType pDimensionWeightUnit) {
        this.dimensionWeightUnit = pDimensionWeightUnit;
    }

    /**
     * Sets the <code>aircraftType</code> property.
     * 
     * @param pHeight
     *            the new value of the <code>Height</code> property.
     */
    public void setHeight(final Integer pHeight) {
        this.height = pHeight;
    }

    /**
     * Sets the <code>aircraftType</code> property.
     * 
     * @param pLength
     *            the new value of the <code>Length</code> property.
     */
    public void setLength(final Integer pLength) {
        this.length = pLength;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
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
     * Sets the <code>width</code> property.
     * 
     * @param pWidth
     *            the new value of the <code>width</code> property.
     */
    public void setWidth(final Integer pWidth) {
        this.width = pWidth;
    }

	/**
	 * @return the pieces
	 */
	public Integer getPieces() {
		return pieces;
	}

	/**
	 * @return the dimensionalUOMType
	 */
	public DimensionalUOMType getDimensionalUOMType() {
		return dimensionalUOMType;
	}

	/**
	 * @param pieces the pieces to set
	 */
	public void setPieces(Integer pieces) {
		this.pieces = pieces;
	}

	/**
	 * @param dimensionalUOMType the dimensionalUOMType to set
	 */
	public void setDimensionalUOMType(DimensionalUOMType dimensionalUOMType) {
		this.dimensionalUOMType = dimensionalUOMType;
	}
}
