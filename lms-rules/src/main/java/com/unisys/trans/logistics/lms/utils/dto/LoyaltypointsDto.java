package com.unisys.trans.logistics.lms.utils.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.dto.TapeRateEntry;

public class LoyaltypointsDto  extends TapeRateEntry {
	
	 /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4254993716602316212L;
    
	private String loyaltyId;
	
	private Integer totalLoyaltyPoints;
	
	private BigDecimal baseLoyaltyPoints;
	
	private BigDecimal bonusLoyaltyPoints;
	
	 /**
     * Attribute to hold <code>oId</code> property.
     */
     private Long oId;
     
     private Integer currentMonth;

     
	 public String getLoyaltyId() {
		return loyaltyId;
	}


	public void setLoyaltyId(final String pLoyaltyId) {
		this.loyaltyId = pLoyaltyId;
	}


	public Integer getTotalLoyaltyPoints() {
		return totalLoyaltyPoints;
	}


	public void setTotalLoyaltyPoints(final Integer pTotalLoyaltyPoints) {
		this.totalLoyaltyPoints = pTotalLoyaltyPoints;
	}


	public BigDecimal getBaseLoyaltyPoints() {
		return baseLoyaltyPoints;
	}


	public void setBaseLoyaltyPoints(final BigDecimal pBaseLoyaltyPoints) {
		this.baseLoyaltyPoints = pBaseLoyaltyPoints;
	}


	public BigDecimal getBonusLoyaltyPoints() {
		return bonusLoyaltyPoints;
	}


	public void setBonusLoyaltyPoints(final BigDecimal pBonusLoyaltyPoints) {
		this.bonusLoyaltyPoints = pBonusLoyaltyPoints;
	}




	 /**
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of <code>oId</code> property.<br>
     */

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return oId;
	}
	
	/**
     * Sets the <code>oId</code> property.
     * 
     * @param pOId
     *            the current value of <code>oId</code> property.<br>
     */
	   public void setOId(final Long pOId) {
	        this.oId = pOId;
	    }


	/**
	 * @return the currentMonth
	 */
	public Integer getCurrentMonth() {
		return this.currentMonth;
	}


	/**
	 * @param pCurrentMonth the currentMonth to set
	 */
	public void setCurrentMonth(final Integer pCurrentMonth) {
		this.currentMonth = pCurrentMonth;
	}


}
