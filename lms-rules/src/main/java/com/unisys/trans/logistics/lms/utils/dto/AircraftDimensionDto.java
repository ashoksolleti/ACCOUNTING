package com.unisys.trans.logistics.lms.utils.dto;

import java.math.BigDecimal;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.LengthUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.DimensionEntryType;

/**
 * <code>Aircraft Dimension Dto</code> class contain information specific to a
 * AircraftDimension.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>aircraftCode
 * <li>dimensionEntryDto
 * <li>dimensionUnit
 * <li>maximumPackageHeight
 * <li>maximumPackageWidth
 * <li>standardEntryIndicator
 * <li>oId
 * </code>
 * </ul>
 */
public class AircraftDimensionDto extends PersistenceObjectDto {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 2297065216990544913L;

	/**
	 * Attribute to hold <code>aircraftCode</code> property.
	 */
	private String aircraftCode;

	/**
	 * Attribute to hold <code>dimensionEntryDto</code> property.
	 */

	private List<DimensionEntryDto> dimensionEntryDto;

	/**
	 * Attribute to hold <code>dimensionUnit</code> property.
	 */

	private LengthUOMType dimensionUnit;

	/**
	 * Attribute to hold <code>maximumPackageHeight</code> property.
	 */
	private BigDecimal maximumPackageHeight;

	/**
	 * Attribute to hold <code>maximumPackageWidth</code> property.
	 */
	private BigDecimal maximumPackageWidth;

	/**
	 * Attribute to hold <code>oId</code> property.
	 */
	private Long oId;

	/**
	 * Attribute to hold <code>standardEntryIndicator</code> property.
	 */
	private DimensionEntryType dimensionEntryType;

	/**
	 * Gets the <code>AircraftCode</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 3 AlphaNumeric
	 * <p>
	 * <b>Example: </b><br>
	 * AB1
	 * <p>
	 * 
	 * @return the current value of the <code>AircraftCode</code> property.
	 */
	public String getAircraftCode() {
		return this.aircraftCode;
	}

	/**
	 * Gets the list of <code>DimensionEntryDto</code> associated with the
	 * DimensionEntryDto.
	 * <p>
	 * 
	 * @return the current list of <code>DimensionEntryDto</code> associated
	 *         with a DimensionEntryDto.
	 */

	public List<DimensionEntryDto> getDimensionEntryDto() {
		return this.dimensionEntryDto;
	}

	/**
	 * Gets the <code>DimensionUnit</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * CM,IN
	 * <p>
	 * <b>Example: </b><br>
	 * IN
	 * <p>
	 * 
	 * @return the current value of the <code>DimensionUnit</code> property.
	 */
	public LengthUOMType getDimensionUnit() {
		return this.dimensionUnit;
	}

	/**
	 * Gets the <code>maximumPackageHeight</code> property.
	 * <p>
	 * <b>Example: </b><br>
	 * 20
	 * <p>
	 * 
	 * @return the current value of the <code>maximumPackageHeight</code>
	 *         property.
	 */
	public BigDecimal getMaximumPackageHeight() {
		return this.maximumPackageHeight;
	}

	/**
	 * Gets the <code>maximumPackageWidth</code> property.
	 * <p>
	 * <b>Example: </b><br>
	 * 30
	 * <p>
	 * 
	 * @return the current value of the <code>maximumPackageWidth</code>
	 *         property.
	 */
	public BigDecimal getMaximumPackageWidth() {
		return this.maximumPackageWidth;
	}

	/**
	 * Gets the <code>oId</code> property.
	 * <p>
	 * Unique key to identify the <code>AircraftDimension</code>.It is of type
	 * Long.
	 * <p>
	 * 
	 * @return the current value of the <code>oId</code> property.<br>
	 */
	@Override
	public Long getOId() {
		return this.oId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "AircraftDimensionDto [aircraftCode=" + aircraftCode
				+ ", dimensionEntryDto=" + dimensionEntryDto
				+ ", dimensionUnit=" + dimensionUnit
				+ ", maximumPackageHeight=" + maximumPackageHeight
				+ ", maximumPackageWidth=" + maximumPackageWidth + ", oId="
				+ oId + ", standardEntryIndicator=" + dimensionEntryType + "]";
	}

	/**
	 * Gets the <code>StandardEntryIndicator</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * STANDARDENTRY,MANUALENTRY;
	 * <p>
	 * <b>Example: </b><br>
	 * IN
	 * <p>
	 * 
	 * @return the current value of the <code>StandardEntryIndicator</code>
	 *         property.
	 */
	public DimensionEntryType getDimensionEntryType() {
		return this.dimensionEntryType;
	}

	/**
	 * Sets the <code>AircraftCode</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 3 AlphaNumeric
	 * <p>
	 * <b>Example: </b><br>
	 * AB1
	 * <p>
	 * 
	 * @param pAircraftCode
	 *            the current value of the <code>AircraftCode</code> property.
	 */
	public void setAircraftCode(final String pAircraftCode) {
		this.aircraftCode = ContractUtility.convertToUpperCase(pAircraftCode);
	}

	/**
	 * Sets the list of <code>DimensionEntryDto</code> associated with Spot
	 * Rate.
	 * <p>
	 * 
	 * @param pDimensionEntryDto
	 *            the new list of <code>DimensionEntryDto</code> associated with
	 *            AircraftDimension.<br>
	 * 
	 */
	public void setDimensionEntryDto(
			final List<DimensionEntryDto> pDimensionEntryDto) {
		this.dimensionEntryDto = pDimensionEntryDto;
	}

	/**
	 * Sets the <code>DimensionUnit</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * CM,IN
	 * <p>
	 * <b>Example: </b><br>
	 * IN
	 * <p>
	 * 
	 * @param pDimensionUnit
	 *            the current value of the <code>DimensionUnit</code> property.
	 */
	public void setDimensionUnit(final LengthUOMType pDimensionUnit) {
		this.dimensionUnit = pDimensionUnit;
	}

	/**
	 * Sets the <code>maximumPackageHeight</code> property.
	 * <p>
	 * <b>Example: </b><br>
	 * 20
	 * <p>
	 * 
	 * @param pMaximumPackageHeight
	 *            the current value of the <code>maximumPackageHeight</code>
	 *            property.
	 */
	public void setMaximumPackageHeight(final BigDecimal pMaximumPackageHeight) {
		this.maximumPackageHeight = pMaximumPackageHeight;
	}

	/**
	 * Sets the <code>maximumPackageWidth</code> property.
	 * <p>
	 * <b>Example: </b><br>
	 * 30
	 * <p>
	 * 
	 * @param pMaximumPackageWidth
	 *            the current value of the <code>maximumPackageWidth</code>
	 *            property.
	 */
	public void setMaximumPackageWidth(final BigDecimal pMaximumPackageWidth) {
		this.maximumPackageWidth = pMaximumPackageWidth;
	}

	/**
	 * Sets the <code>oId</code> property.
	 * <p>
	 * Unique key to identify the <code>AircraftDimension</code>.It is of type
	 * Long.
	 * <p>
	 * 
	 * @param pOId
	 *            the new value of the <code>oId</code> property.<br>
	 */

	public void setOId(final Long pOId) {
		this.oId = pOId;
	}

	/**
	 * Sets the <code>StandardEntryIndicator</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * STANDARDENTRY,MANUALENTRY;
	 * <p>
	 * <b>Example: </b><br>
	 * IN
	 * <p>
	 * 
	 * @param pDimensionEntryType
	 *            the current value of the <code>StandardEntryIndicator</code>
	 *            property.
	 */
	public void setDimensionEntryType(
			final DimensionEntryType pDimensionEntryType) {
		this.dimensionEntryType = pDimensionEntryType;
	}

}
