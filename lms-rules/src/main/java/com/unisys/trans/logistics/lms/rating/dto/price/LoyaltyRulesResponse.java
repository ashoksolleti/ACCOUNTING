package com.unisys.trans.logistics.lms.rating.dto.price;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.rating.dto.constants.PointsOperatorType;
import com.unisys.trans.logistics.lms.rating.dto.constants.PointsType;

public class LoyaltyRulesResponse extends PersistenceObjectDto {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4228424951345178355L;
	 /**
     * Attribute to hold <code>pointsType</code> property.
     */
	private  PointsType  pointsType ;
	 /**
     * Attribute to hold <code>pointsOperator</code> property.
     */
	private PointsOperatorType pointsOperator;
	 /**
     * Attribute to hold <code>loyaltyCalculationExpression</code> property.
     */
	private String loyaltyCalculationExpression;
	 /**
     * Attribute to hold <code>ruleName</code> property.
     */
	private String ruleName;
	
	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
     * Gets the <code>pointsType</code> property.
     * <p>
     * 
     * @return the current value of the <code>pointsType</code> property.<br>
     */
	public PointsType getPointsType() {
		return this.pointsType;
	}
	/**
     * Gets the <code>pointsOperator</code> property.
     * <p>
     * 
     * @return the current value of the <code>pointsOperator</code> property.<br>
     */
	public PointsOperatorType getPointsOperator() {
		return this.pointsOperator;
	}
	/**
     * Gets the <code>loyaltyCalculationExpression</code> property.
     * <p>
     * 
     * @return the current value of the <code>loyaltyCalculationExpression</code> property.<br>
     */
	public String getLoyaltyCalculationExpression() {
		return this.loyaltyCalculationExpression;
	}
	/**
     * Gets the <code>ruleName</code> property.
     * <p>
     * 
     * @return the current value of the <code>ruleName</code> property.<br>
     */
	public String getRuleName() {
		return this.ruleName;
	}
	/**
     * Sets the <code>pointsType</code> property.
     * <p>
     * 
     * @param pPointsType
     *            the current value of the <code>pointsType</code> property.
     */
	public void setPointsType(final PointsType pPointsType) {
		this.pointsType = pPointsType;
	}
	/**
     * Sets the <code>pointsOperator</code> property.
     * <p>
     * 
     * @param pPointsOperator
     *            the current value of the <code>pointsOperator</code> property.
     */
	public void setPointsOperator(final PointsOperatorType pPointsOperator) {
		this.pointsOperator = pPointsOperator;
	}
	/**
     * Sets the <code>loyaltyCalculationExpression</code> property.
     * <p>
     * 
     * @param pLoyaltyCalculationExpression
     *            the current value of the <code>loyaltyCalculationExpression</code> property.
     */
	public void setLoyaltyCalculationExpression(final String pLoyaltyCalculationExpression) {
		this.loyaltyCalculationExpression = pLoyaltyCalculationExpression;
	}
	/**
     * Sets the <code>ruleName</code> property.
     * <p>
     * 
     * @param pRuleName
     *            the current value of the <code>ruleName</code> property.
     */
	public void setRuleName(final String pRuleName) {
		this.ruleName = pRuleName;
	}

}
