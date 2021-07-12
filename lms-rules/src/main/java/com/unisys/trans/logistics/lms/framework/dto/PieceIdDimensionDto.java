package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.constants.DimensionalUOMType;

/**
 * <code>PieceIdDimensionDto</code> class contain information specific to dimensions of Piece Id.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>dimensionUnit
 * <li>height
 * <li>length
 * <li>width
 * </code>
 * </ul>
 */
public class PieceIdDimensionDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>changed</code> property.
     */
    private boolean changed;

    /**
     * Attribute to hold <code>dimensionUnit</code> property.
     */
    private DimensionalUOMType dimensionUnit;

    /**
     * Attribute to hold <code>height</code> property.
     */

    private BigDecimal height;

    /**
     * Attribute to hold <code>height</code> property.
     */

    private String heightStr;

    /**
     * Attribute to hold <code>length</code> property.
     */

    private BigDecimal length;

    /**
     * Attribute to hold <code>lengthStr</code> property.
     */

    private String lengthStr;

    /**
     * Attribute to hold <code>width</code> property.
     */

    private BigDecimal width;

    /**
     * Attribute to hold <code>widthStr</code> property.
     */

    private String widthStr;

    /**
     * Default constructor
     */
    public PieceIdDimensionDto() {

    }

    /**
     * Gets the <code>dimensionUnit</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of the <code>Length</code> property.
     */
    public DimensionalUOMType getDimensionUnit() {
        return this.dimensionUnit;
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
     * Gets the <code>heightStr</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of the <code>heightStr</code> property.
     */
    public String getHeightStr() {
        return this.heightStr;
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
    public BigDecimal getLength() {
        return this.length;
    }

    /**
     * Gets the <code>lengthStr</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of the <code>lengthStr</code> property.
     */
    public String getLengthStr() {
        return this.lengthStr;
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
     * Gets the <code>widthStr</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of the <code>widthStr</code> property.
     */
    public String getWidthStr() {
        return this.widthStr;
    }

    /**
     * Gets the <code>changed</code> property.
     * <p>
     * 
     * @return the current value of the <code>changed</code> property.
     */
    public boolean isChanged() {
        return this.changed;
    }

    /**
     * Sets the <code>changed</code> property.
     * <p>
     * 
     * @param pChanged
     *            the current value of the <code>changed</code> property.
     */
    public void setChanged(final boolean pChanged) {
        this.changed = pChanged;
    }

    /**
     * Sets the <code>dimensionUnit</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param PDimensionUnit
     *            the current value of the <code>dimensionUnit</code> property.
     */
    public void setDimensionUnit(final DimensionalUOMType pDimensionUnit) {
        this.dimensionUnit = pDimensionUnit;
    }

    /**
     * Sets the <code>height</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param pHeight
     *            the current value of the <code>height</code> property.
     */
    public void setHeight(final BigDecimal pHeight) {
        this.height = pHeight;
    }

    /**
     * Sets the <code>heightStr</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param pHeightStr
     *            the current value of the <code>heightStr</code> property.
     */
    public void setHeightStr(final String pHeightStr) {
        if (pHeightStr != this.getHeightStr()) {
            this.setChanged(Boolean.TRUE);
        }
        this.heightStr = pHeightStr;
    }

    /**
     * Sets the <code>length</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param pLength
     *            the current value of the <code>length</code> property.
     */
    public void setLength(final BigDecimal pLength) {
        this.length = pLength;
    }

    /**
     * Sets the <code>lengthStr</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param pLengthStr
     *            the current value of the <code>lengthStr</code> property.
     */
    public void setLengthStr(final String pLengthStr) {
        if (pLengthStr != this.getLengthStr()) {
            this.setChanged(Boolean.TRUE);
        }
        this.lengthStr = pLengthStr;
    }

    /**
     * Sets the <code>width</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param pWidth
     *            the current value of the <code>width</code> property.
     */
    public void setWidth(final BigDecimal pWidth) {
        this.width = pWidth;
    }

    /**
     * Sets the <code>widthStr</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param pWidthStr
     *            the current value of the <code>widthStr</code> property.
     */
    public void setWidthStr(final String pWidthStr) {
        if (pWidthStr != this.getWidthStr()) {
            this.setChanged(Boolean.TRUE);
        }
        this.widthStr = pWidthStr;
    }

}
