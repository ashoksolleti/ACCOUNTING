/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;

/**
 * @author 20536
 *
 */
public class AirWaybillSpecialHandlingCodeDto extends PersistenceObjectDto {

	/**
	 * Unique Serial version UID.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Attribute to hold the <code>specialHandlingCode</code> property.
	 */
	private String specialHandlingCode;
	/**
	 * Attribute to hold the <code>pieces</code> property.
	 */
	private Integer pieces;
	/**
	 * Attribute to hold the <code>weight</code> property.
	 */
	private BigDecimal weight;
	/**
	 * Attribute to hold the <code>otherMeasure</code> property.
	 */
	private BigDecimal otherMeasure;
	/**
	 * Attribute to hold the <code>otherMeasureUnit</code> property.
	 */
	private String otherMeasureUnit;

	/**
	 * Attribute to hold <code>sortingPriority</code> property.
	 */

	private Integer sortingPriority;
	
	private String code;
	private String otherMeasuresUnit;
	
	private String WeightUnit;
	
	private String splHandlingCodeDesc;

	public Integer getSortingPriority() {
		return sortingPriority;
	}

	public void setSortingPriority(Integer sortingPriority) {
		this.sortingPriority = sortingPriority;
	}

	/**
	 * @return the pieces
	 */
	public Integer getPieces() {
		return pieces;
	}

	/**
	 * @param pieces
	 *            the pieces to set
	 */
	public void setPieces(Integer pieces) {
		this.pieces = pieces;
	}

	/**
	 * @return the weight
	 */
	public BigDecimal getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	/**
	 * @return the otherMeasure
	 */
	public BigDecimal getOtherMeasure() {
		return otherMeasure;
	}

	/**
	 * @param otherMeasure
	 *            the otherMeasure to set
	 */
	public void setOtherMeasure(BigDecimal otherMeasure) {
		this.otherMeasure = otherMeasure;
	}

	/**
	 * @return the otherMeasureUnit
	 */
	public String getOtherMeasureUnit() {
		return otherMeasureUnit;
	}

	/**
	 * @param otherMeasureUnit
	 *            the otherMeasureUnit to set
	 */
	public void setOtherMeasureUnit(String otherMeasureUnit) {
		this.otherMeasureUnit = otherMeasureUnit;
	}

	/**
	 * @return the specialHandlingCode
	 */
	public String getSpecialHandlingCode() {
		return specialHandlingCode;
	}

	/**
	 * @param specialHandlingCode
	 *            the specialHandlingCode to set
	 */
	public void setSpecialHandlingCode(String specialHandlingCode) {
		this.specialHandlingCode = specialHandlingCode;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOtherMeasuresUnit() {
		return otherMeasuresUnit;
	}

	public void setOtherMeasuresUnit(String otherMeasuresUnit) {
		this.otherMeasuresUnit = otherMeasuresUnit;
	}

	/**
	 * @return the splHandlingCodeDesc
	 */
	public String getSplHandlingCodeDesc() {
		return splHandlingCodeDesc;
	}

	/**
	 * @param splHandlingCodeDesc the splHandlingCodeDesc to set
	 */
	public void setSplHandlingCodeDesc(String splHandlingCodeDesc) {
		this.splHandlingCodeDesc = splHandlingCodeDesc;
	}

	/**
	 * @return the weightUnit
	 */
	public String getWeightUnit() {
		return WeightUnit;
	}

	/**
	 * @param weightUnit the weightUnit to set
	 */
	public void setWeightUnit(String weightUnit) {
		WeightUnit = weightUnit;
	}
}
