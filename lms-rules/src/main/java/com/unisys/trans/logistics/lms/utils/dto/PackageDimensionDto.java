package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.constants.LengthUOMType;

/**
 * <code>PackageDimensionDto</code> contains specific data applicable to the
 * PackageDimension.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>dimensionUnit
 * <li>height
 * <li>length
 * <li>lineNumber
 * <li>width
 * </code>
 * </ul>
 */
public class PackageDimensionDto implements Serializable {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 4744353221323650699L;
	/**
	 * Attribute to hold <code>dimensionUnit</code> property.
	 */
	private LengthUOMType dimensionUnit;
	/**
	 * Attribute to hold <code>height</code> property.
	 */
	private BigDecimal height;
	/**
	 * Attribute to hold <code>length</code> property.
	 */
	private BigDecimal length;
	/**
	 * Attribute to hold <code>lineNumber</code> property.
	 */
	private Integer lineNumber;
	/**
	 * Attribute to hold <code>rotationIndicator</code> property.
	 */
	private boolean rotationIndicator;
	/**
	 * Attribute to hold <code>width</code> property.
	 */
	private BigDecimal width;

	/**
	 * Gets the <code>dimensionUnit</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * CM or IN or YD or ME or FT
	 * <p>
	 * <b>Example: </b><br>
	 * CM
	 * <p>
	 * 
	 * @return the current value of the <code>dimensionUnit</code> property.
	 */
	public LengthUOMType getDimensionUnit() {
		return this.dimensionUnit;
	}

	/**
	 * Gets the <code>height</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>height</code> property.
	 */
	public BigDecimal getHeight() {
		return this.height;
	}

	/**
	 * Gets the <code>length</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>length</code> property.
	 */
	public BigDecimal getLength() {
		return this.length;
	}

	/**
	 * Gets the <code>lineNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>lineNumber</code> property.
	 */
	public Integer getLineNumber() {
		return this.lineNumber;
	}

	/**
	 * Gets the <code>rotationIndicator</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>rotationIndicator</code> property.
	 */
	public boolean getRotationIndicator() {
		return this.rotationIndicator;
	}

	/**
	 * Gets the <code>width</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>width</code> property.
	 */
	public BigDecimal getWidth() {
		return this.width;
	}

	/**
	 * Sets the <code>dimensionUnit</code> property.
	 * <p>
	 * 
	 * @param pDimensionUnit
	 *            the current value of the <code>dimensionUnit</code> property.
	 */
	public void setDimensionUnit(final LengthUOMType pDimensionUnit) {
		this.dimensionUnit = pDimensionUnit;
	}

	/**
	 * Sets the <code>height</code> property.
	 * <p>
	 * 
	 * @param pHeight
	 *            the current value of the <code>height</code> property.
	 */
	public void setHeight(final BigDecimal pHeight) {
		this.height = pHeight;
	}

	/**
	 * Sets the <code>length</code> property.
	 * <p>
	 * 
	 * @param pLength
	 *            the current value of the <code>length</code> property.
	 */
	public void setLength(final BigDecimal pLength) {
		this.length = pLength;
	}

	/**
	 * Sets the <code>lineNumber</code> property.
	 * <p>
	 * 
	 * @param pLineNumber
	 *            the current value of the <code>lineNumber</code> property.
	 */
	public void setLineNumber(final Integer pLineNumber) {
		this.lineNumber = pLineNumber;
	}

	/**
	 * Sets the <code>rotationIndicator</code> property.
	 * <p>
	 * 
	 * @param pRotationIndicator
	 *            the current value of the <code>rotationIndicator</code>
	 *            property.
	 */
	public void setRotationIndicator(final boolean pRotationIndicator) {
		this.rotationIndicator = pRotationIndicator;
	}

	/**
	 * Sets the <code>width</code> property.
	 * <p>
	 * 
	 * @param pWidth
	 *            the current value of the <code>width</code> property.
	 */
	public void setWidth(final BigDecimal pWidth) {
		this.width = pWidth;
	}

}
