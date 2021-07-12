package com.unisys.trans.logistics.lms.parts.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class PartsOutstandingAmountDto extends PersistenceObjectDto  {

	  /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>amountUnbilled</code> property.
     */
    private BigDecimal amountUnbilled;

    /**
     * Attribute to hold <code>amountUnapplied</code> property.
     */
    private BigDecimal amountUnapplied;

    /**
     * Attribute to hold <code>totalOutstanding</code> property.
     */
    private BigDecimal totalOutstanding;

    /**
     * Attribute to hold <code>paymentdueDate</code> property.
     */
    private Date paymentdueDate;
    
    /**
     * Attribute to hold <code>categoryOneLabel</code> property.
    */
     private String categoryOneLabel;
     
    /**
     * Attribute to hold <code>categoryOneAmount</code> property.
    */
    private BigDecimal categoryOneAmount;
    
    /**
     * Attribute to hold <code>categoryTwoLabel</code> property.
    */
    private String categoryTwoLabel;
    
    /**
     * Attribute to hold <code>categoryTwoAmount</code> property.
    */
    private BigDecimal categoryTwoAmount;    

    /**
     * Attribute to hold <code>categoryThreeLabel</code> property.
    */
    private String categoryThreeLabel;
    
    /**
     * Attribute to hold <code>categoryThreeAmount</code> property.
    */
    private BigDecimal categoryThreeAmount;
    
    /**
     * Attribute to hold <code>categoryFourLabel</code> property.
    */
    private String categoryFourLabel;
    
    /**
     * Attribute to hold <code>categoryFourAmount</code> property.
    */
    private BigDecimal categoryFourAmount;    
    
    /**
     * Attribute to hold <code>categoryFiveLabel</code> property.
    */
    private String categoryFiveLabel;
    
    /**
     * Attribute to hold <code>categoryFiveAmount</code> property.
    */
    private BigDecimal categoryFiveAmount;   

  
    public PartsOutstandingAmountDto() {
    	
    	
    }

   
    /**
     * Gets the <code>amountUnbilled</code> property.
     * <p>
     * 
     * @return the current value of the <code>amountUnbilled</code> property.
     */
    public BigDecimal getAmountUnbilled() {
        return this.amountUnbilled;
    }

    /**
     * Sets the <code>pAmountUnbilled</code>.
     * <p>
     * 
     * @param pAmountUnbilled
     *            holds the new value of <code>amountUnbilled</code>
     */
    public void setAmountUnbilled(final BigDecimal pAmountUnbilled) {
        this.amountUnbilled = pAmountUnbilled;
    }

    /**
     * Gets the <code>amountUnapplied</code> property.
     * <p>
     * 
     * @return the current value of the <code>amountUnapplied</code> property.
     */
    public BigDecimal getAmountUnapplied() {
        return this.amountUnapplied;
    }

    /**
     * Sets the <code>pAmountUnapplied</code>.
     * <p>
     * 
     * @param pAmountUnapplied
     *            holds the new value of <code>amountUnapplied</code>
     */
    public void setAmountUnapplied(final BigDecimal pAmountUnapplied) {
        this.amountUnapplied = pAmountUnapplied;
    }

    /**
     * Gets the <code>totalOutstanding</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalOutstanding</code> property.
     */
    public BigDecimal getTotalOutstanding() {
        return this.totalOutstanding;
    }

    /**
     * Sets the <code>pTotalOutstanding</code>.
     * <p>
     * 
     * @param pTotalOutstanding
     *            holds the new value of <code>totalOutstanding</code>
     */
    public void setTotalOutstanding(final BigDecimal pTotalOutstanding) {
        this.totalOutstanding = pTotalOutstanding;
    }

    /**
     * Gets the <code>paymentdueDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>paymentdueDate</code> property.
     */
    public Date getPaymentdueDate() {
        return this.paymentdueDate;
    }

    /**
     * Gets the <code>categoryOneLabel</code> property.
     * <p>
     * 
     * @return the current value of the <code>categoryOneLabel</code> property.
     */
    public String getCategoryOneLabel() {
		return categoryOneLabel;
	}

	/**
     * Gets the <code>categoryOneAmount</code> property.
     * <p>
     * 
     * @return the current value of the <code>categoryOneAmount</code> property.
     */
	public BigDecimal getCategoryOneAmount() {
		return categoryOneAmount;
	}
	
	/**
     * Gets the <code>categoryTwoLabel</code> property.
     * <p>
     * 
     * @return the current value of the <code>categoryTwoLabel</code> property.
     */
	public String getCategoryTwoLabel() {
		return categoryTwoLabel;
	}
	
	/**
     * Gets the <code>categoryTwoAmount</code> property.
     * <p>
     * 
     * @return the current value of the <code>categoryTwoAmount</code> property.
     */
	public BigDecimal getCategoryTwoAmount() {
		return categoryTwoAmount;
	}
	/**
     * Gets the <code>categoryThreeLabel</code> property.
     * <p>
     * 
     * @return the current value of the <code>categoryThreeLabel</code> property.
     */
	public String getCategoryThreeLabel() {
		return categoryThreeLabel;
	}
	
	/**
     * Gets the <code>categoryThreeAmount</code> property.
     * <p>
     * 
     * @return the current value of the <code>categoryThreeAmount</code> property.
     */
	public BigDecimal getCategoryThreeAmount() {
		return categoryThreeAmount;
	}
	
	
	/**
     * Gets the <code>categoryFourLabel</code> property.
     * <p>
     * 
     * @return the current value of the <code>categoryFourLabel</code> property.
     */
	public String getCategoryFourLabel() {
		return categoryFourLabel;
	}
	
	/**
     * Gets the <code>categoryFourAmount</code> property.
     * <p>
     * 
     * @return the current value of the <code>categoryFourAmount</code> property.
     */
	public BigDecimal getCategoryFourAmount() {
		return categoryFourAmount;
	}
    
    /**
     * Sets the <code>paymentdueDate</code>.
     * <p>
     * 
     * @param pPaymentdueDate
     *            holds the new value of <code>paymentdueDate</code>
     */
    public void setPaymentdueDate(final Date pPaymentdueDate) {
        this.paymentdueDate = pPaymentdueDate;
    }

  
   
    
    /**
     * Sets the <code>categoryOneLabel</code>.
     * <p>
     * 
     * @param pPaymentdueDate
     *            holds the new value of <code>categoryOneLabel</code>
     */
    public void setCategoryOneLabel(final String pCategoryOneLabel) {
		this.categoryOneLabel = pCategoryOneLabel;
	}



    /**
     * Sets the <code>categoryOneAmount</code>.
     * <p>
     * 
     * @param pPaymentdueDate
     *            holds the new value of <code>categoryOneLabel</code>
     */
	public void setCategoryOneAmount(final BigDecimal pCategoryOneAmount) {
		this.categoryOneAmount = pCategoryOneAmount;
	}

	
	

	/**
     * Sets the <code>categoryTwoLabel</code>.
     * <p>
     * 
     * @param pPaymentdueDate
     *            holds the new value of <code>categoryOneLabel</code>
     */
	public void setCategoryTwoLabel(final String pCategoryTwoLabel) {
		this.categoryTwoLabel = pCategoryTwoLabel;
	}



	/**
     * Sets the <code>categoryTwoAmount</code>.
     * <p>
     * 
     * @param pCategoryTwoAmount
     *            holds the new value of <code>categoryTwoAmount</code>
     */
	public void setCategoryTwoAmount(final BigDecimal pCategoryTwoAmount) {
		this.categoryTwoAmount = pCategoryTwoAmount;
	}

	
	/**
     * Sets the <code>categoryThreeLabel</code>.
     * <p>
     * 
     * @param pCategoryThreeLabel
     *            holds the new value of <code>categoryThreeLabel</code>
     */
	public void setCategoryThreeLabel(final String pCategoryThreeLabel) {
		this.categoryThreeLabel = pCategoryThreeLabel;
	}

	
	
	/**
     * Sets the <code>categoryThreeAmount</code>.
     * <p>
     * 
     * @param pCategoryThreeAmount
     *            holds the new value of <code>categoryThreeAmount</code>
     */
	public void setCategoryThreeAmount(final BigDecimal pCategoryThreeAmount) {
		this.categoryThreeAmount = pCategoryThreeAmount;
	}


	/**
     * Sets the <code>categoryFourLabel</code>.
     * <p>
     * 
     * @param pCategoryFourLabel
     *            holds the new value of <code>categoryFourLabel</code>
     */
	public void setCategoryFourLabel(final String pCategoryFourLabel) {
		this.categoryFourLabel = pCategoryFourLabel;
	}

	
	/**
     * Sets the <code>categoryFourAmount</code>.
     * <p>
     * 
     * @param pCategoryFourAmount
     *            holds the new value of <code>categoryFourAmount</code>
     */
	public void setCategoryFourAmount(final BigDecimal pCategoryFourAmount) {
		this.categoryFourAmount = pCategoryFourAmount;
	}

	@Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }


    /**
     * Gets the <code>categoryFiveLabel</code> property.
     * <p>
     * 
     * @return the current value of the <code>categoryFiveLabel</code> property.
     */
    public String getCategoryFiveLabel() {
        return this.categoryFiveLabel;
    }


    /**
     * Sets the <code>pCategoryFiveLabel</code>.
     * <p>
     * 
     * @param pCategoryFiveLabel
     *            holds the new value of <code>categoryFiveLabel</code>
     */
    public void setCategoryFiveLabel(final String pCategoryFiveLabel) {
        this.categoryFiveLabel = pCategoryFiveLabel;
    }


    /**
     * Gets the <code>categoryFiveAmount</code> property.
     * <p>
     * 
     * @return the current value of the <code>categoryFiveAmount</code> property.
     */
    public BigDecimal getCategoryFiveAmount() {
        return this.categoryFiveAmount;
    }


    /**
     * Sets the <code>pCategoryFiveAmount</code>.
     * <p>
     * 
     * @param pCategoryFiveAmount
     *            holds the new value of <code>categoryFiveAmount</code>
     */
    public void setCategoryFiveAmount(final BigDecimal pCategoryFiveAmount) {
        this.categoryFiveAmount = pCategoryFiveAmount;
    }
	
	

}

	

