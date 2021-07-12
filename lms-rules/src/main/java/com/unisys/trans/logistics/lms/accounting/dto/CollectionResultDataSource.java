/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;

import com.unisys.trans.logistics.lms.parts.dto.ParticipantDto;

public class CollectionResultDataSource {
	
	private List<ParticipantDto> participant;
	
	private List<AccountingParticipantDto> accountingParticipant;
	
	private List<Object> collectionAgentInfo;
	
	private List<Object> collectionContactDetails;
	
	private String dunningLettersText;
	
	private InputStream airLineImage;
	
	private List<InvoiceDto> participantInvoiceByCategoryOneDto;
	
	private List<InvoiceDto> participantInvoiceByCategoryTwoDto;
	
    private List<InvoiceDto> participantInvoiceByCategoryThreeDto;

    private List<InvoiceDto> participantInvoiceByCategoryFourDto;
    
    private List<InvoiceDto> participantInvoiceByCategoryFiveDto;
    
    private String categoryOne;
    
    private String categoryTwo;
    
    private String categoryThree;
    
    private String categoryFour;
    
    private String categoryFive;
       
    /**
     * Attribute to hold the AmountCateoryOne
     */
    private BigDecimal amountCateoryOne;

    /**
     * Attribute to hold the AmountCategoryTwo
     */
    private BigDecimal amountCategoryTwo;

    /**
     * Attribute to hold the AmountCategoryThree
     */
    private BigDecimal amountCategoryThree;

    /**
     * Attribute to hold the AmountCategoryFour
     */
    private BigDecimal amountCategoryFour;

    /**
     * Attribute to hold the AmountCategoryFive
     */
    private BigDecimal amountCategoryFive;
    
    /**
     * Attribute to hold the totalOutstanding
     */
    private BigDecimal totalOutstanding;
    

    /**
     * Gets the <code>participantInvoiceByCategoryOneDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantInvoiceByCategoryOneDto</code> property.
     */
    public List<InvoiceDto> getParticipantInvoiceByCategoryOneDto() {
        return this.participantInvoiceByCategoryOneDto;
    }

    /**
     * Sets the <code>pParticipantInvoiceByCategoryOneDto</code>.
     * <p>
     * 
     * @param pParticipantInvoiceByCategoryOneDto
     *            holds the new value of <code>participantInvoiceByCategoryOneDto</code>
     */
    public void setParticipantInvoiceByCategoryOneDto(final List<InvoiceDto> pParticipantInvoiceByCategoryOneDto) {
        this.participantInvoiceByCategoryOneDto = pParticipantInvoiceByCategoryOneDto;
    }

    /**
     * Gets the <code>participantInvoiceByCategoryTwoDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantInvoiceByCategoryTwoDto</code> property.
     */
    public List<InvoiceDto> getParticipantInvoiceByCategoryTwoDto() {
        return this.participantInvoiceByCategoryTwoDto;
    }

    /**
     * Sets the <code>pParticipantInvoiceByCategoryTwoDto</code>.
     * <p>
     * 
     * @param pParticipantInvoiceByCategoryTwoDto
     *            holds the new value of <code>participantInvoiceByCategoryTwoDto</code>
     */
    public void setParticipantInvoiceByCategoryTwoDto(final List<InvoiceDto> pParticipantInvoiceByCategoryTwoDto) {
        this.participantInvoiceByCategoryTwoDto = pParticipantInvoiceByCategoryTwoDto;
    }

    /**
     * Gets the <code>participantInvoiceByCategoryThreeDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantInvoiceByCategoryThreeDto</code> property.
     */
    public List<InvoiceDto> getParticipantInvoiceByCategoryThreeDto() {
        return this.participantInvoiceByCategoryThreeDto;
    }

    /**
     * Sets the <code>pParticipantInvoiceByCategoryThreeDto</code>.
     * <p>
     * 
     * @param pParticipantInvoiceByCategoryThreeDto
     *            holds the new value of <code>participantInvoiceByCategoryThreeDto</code>
     */
    public void setParticipantInvoiceByCategoryThreeDto(final List<InvoiceDto> pParticipantInvoiceByCategoryThreeDto) {
        this.participantInvoiceByCategoryThreeDto = pParticipantInvoiceByCategoryThreeDto;
    }

    /**
     * Gets the <code>participantInvoiceByCategoryFourDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantInvoiceByCategoryFourDto</code> property.
     */
    public List<InvoiceDto> getParticipantInvoiceByCategoryFourDto() {
        return this.participantInvoiceByCategoryFourDto;
    }

    /**
     * Sets the <code>pParticipantInvoiceByCategoryFourDto</code>.
     * <p>
     * 
     * @param pParticipantInvoiceByCategoryFourDto
     *            holds the new value of <code>participantInvoiceByCategoryFourDto</code>
     */
    public void setParticipantInvoiceByCategoryFourDto(final List<InvoiceDto> pParticipantInvoiceByCategoryFourDto) {
        this.participantInvoiceByCategoryFourDto = pParticipantInvoiceByCategoryFourDto;
    }

    /**
     * Gets the <code>participantInvoiceByCategoryFiveDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantInvoiceByCategoryFiveDto</code> property.
     */
    public List<InvoiceDto> getParticipantInvoiceByCategoryFiveDto() {
        return this.participantInvoiceByCategoryFiveDto;
    }

    /**
     * Sets the <code>pParticipantInvoiceByCategoryFiveDto</code>.
     * <p>
     * 
     * @param pParticipantInvoiceByCategoryFiveDto
     *            holds the new value of <code>participantInvoiceByCategoryFiveDto</code>
     */
    public void setParticipantInvoiceByCategoryFiveDto(final List<InvoiceDto> pParticipantInvoiceByCategoryFiveDto) {
        this.participantInvoiceByCategoryFiveDto = pParticipantInvoiceByCategoryFiveDto;
    }

    /**
     * Gets the <code>airLineImage</code> property.
     * <p>
     * 
     * @return the current value of the <code>airLineImage</code> property.
     */
    public InputStream getAirLineImage() {
        return this.airLineImage;
    }

    /**
     * Sets the <code>pAirLineImage</code>.
     * <p>
     * 
     * @param pAirLineImage
     *            holds the new value of <code>airLineImage</code>
     */
    public void setAirLineImage(final InputStream pAirLineImage) {
        this.airLineImage = pAirLineImage;
    }

    /**
	 * Gets the <code>dunningLettersText</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>dunningLettersText</code> property.
	 */
	public String getDunningLettersText() {
		return this.dunningLettersText;
	}

	/**
	 * Sets the <code>pDunningLettersText</code>.
	 * <p>
	 * 
	 * @param pDunningLettersText
	 *            holds the new value of <code>dunningLettersText</code>
	 */
	public void setDunningLettersText(final String pDunningLettersText) {
		this.dunningLettersText = pDunningLettersText;
	}

	/**
	 * Gets the <code>collectionContactDetails</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>collectionContactDetails</code> property.
	 */
	public List<Object> getCollectionContactDetails() {
		return this.collectionContactDetails;
	}

	/**
	 * Sets the <code>pCollectionContactDetails</code>.
	 * <p>
	 * 
	 * @param pCollectionContactDetails
	 *            holds the new value of <code>collectionContactDetails</code>
	 */
	public void setCollectionContactDetails(final List<Object> pCollectionContactDetails) {
		this.collectionContactDetails = pCollectionContactDetails;
	}

	/**
	 * Gets the <code>participant</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>participant</code> property.
	 */
	public List<ParticipantDto> getParticipant() {
		return this.participant;
	}

	/**
	 * Sets the <code>pParticipant</code>.
	 * <p>
	 * 
	 * @param pParticipant
	 *            holds the new value of <code>participant</code>
	 */
	public void setParticipant(final List<ParticipantDto> pParticipant) {
		this.participant = pParticipant;
	}

	/**
	 * Gets the <code>accountingParticipant</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>accountingParticipant</code> property.
	 */
	public List<AccountingParticipantDto> getAccountingParticipant() {
		return this.accountingParticipant;
	}

	/**
	 * Sets the <code>pAccountingParticipant</code>.
	 * <p>
	 * 
	 * @param pAccountingParticipant
	 *            holds the new value of <code>accountingParticipant</code>
	 */
	public void setAccountingParticipant(
			final List<AccountingParticipantDto> pAccountingParticipant) {
		this.accountingParticipant = pAccountingParticipant;
	}

	/**
	 * Gets the <code>collectionAgentInfo</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>collectionAgentInfo</code> property.
	 */
	public List<Object> getCollectionAgentInfo() {
		return this.collectionAgentInfo;
	}

	/**
	 * Sets the <code>pCollectionAgentInfo</code>.
	 * <p>
	 * 
	 * @param pCollectionAgentInfo
	 *            holds the new value of <code>collectionAgentInfo</code>
	 */
	public void setCollectionAgentInfo(final List<Object> pCollectionAgentInfo) {
		this.collectionAgentInfo = pCollectionAgentInfo;
	}

	

    /**
     * Gets the <code>amountCateoryOne</code> property.
     * <p>
     * 
     * @return the current value of the <code>amountCateoryOne</code> property.
     */
    public BigDecimal getAmountCateoryOne() {
        return this.amountCateoryOne;
    }

    /**
     * Sets the <code>pAmountCateoryOne</code>.
     * <p>
     * 
     * @param pAmountCateoryOne
     *            holds the new value of <code>amountCateoryOne</code>
     */
    public void setAmountCateoryOne(final BigDecimal pAmountCateoryOne) {
        this.amountCateoryOne = pAmountCateoryOne;
    }

    /**
     * Gets the <code>amountCategoryTwo</code> property.
     * <p>
     * 
     * @return the current value of the <code>amountCategoryTwo</code> property.
     */
    public BigDecimal getAmountCategoryTwo() {
        return this.amountCategoryTwo;
    }

    /**
     * Sets the <code>pAmountCategoryTwo</code>.
     * <p>
     * 
     * @param pAmountCategoryTwo
     *            holds the new value of <code>amountCategoryTwo</code>
     */
    public void setAmountCategoryTwo(final BigDecimal pAmountCategoryTwo) {
        this.amountCategoryTwo = pAmountCategoryTwo;
    }

    /**
     * Gets the <code>amountCategoryThree</code> property.
     * <p>
     * 
     * @return the current value of the <code>amountCategoryThree</code> property.
     */
    public BigDecimal getAmountCategoryThree() {
        return this.amountCategoryThree;
    }

    /**
     * Sets the <code>pAmountCategoryThree</code>.
     * <p>
     * 
     * @param pAmountCategoryThree
     *            holds the new value of <code>amountCategoryThree</code>
     */
    public void setAmountCategoryThree(final BigDecimal pAmountCategoryThree) {
        this.amountCategoryThree = pAmountCategoryThree;
    }

    /**
     * Gets the <code>amountCategoryFour</code> property.
     * <p>
     * 
     * @return the current value of the <code>amountCategoryFour</code> property.
     */
    public BigDecimal getAmountCategoryFour() {
        return this.amountCategoryFour;
    }

    /**
     * Sets the <code>pAmountCategoryFour</code>.
     * <p>
     * 
     * @param pAmountCategoryFour
     *            holds the new value of <code>amountCategoryFour</code>
     */
    public void setAmountCategoryFour(final BigDecimal pAmountCategoryFour) {
        this.amountCategoryFour = pAmountCategoryFour;
    }

    /**
     * Gets the <code>amountCategoryFive</code> property.
     * <p>
     * 
     * @return the current value of the <code>amountCategoryFive</code> property.
     */
    public BigDecimal getAmountCategoryFive() {
        return this.amountCategoryFive;
    }

    /**
     * Sets the <code>pAmountCategoryFive</code>.
     * <p>
     * 
     * @param pAmountCategoryFive
     *            holds the new value of <code>amountCategoryFive</code>
     */
    public void setAmountCategoryFive(final BigDecimal pAmountCategoryFive) {
        this.amountCategoryFive = pAmountCategoryFive;
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
     * Gets the <code>categoryOne</code> property.
     * <p>
     * 
     * @return the current value of the <code>categoryOne</code> property.
     */
    public String getCategoryOne() {
        return this.categoryOne;
    }

    /**
     * Sets the <code>pCategoryOne</code>.
     * <p>
     * 
     * @param pCategoryOne
     *            holds the new value of <code>categoryOne</code>
     */
    public void setCategoryOne(final String pCategoryOne) {
        this.categoryOne = pCategoryOne;
    }

    /**
     * Gets the <code>categoryTwo</code> property.
     * <p>
     * 
     * @return the current value of the <code>categoryTwo</code> property.
     */
    public String getCategoryTwo() {
        return this.categoryTwo;
    }

    /**
     * Sets the <code>pCategoryTwo</code>.
     * <p>
     * 
     * @param pCategoryTwo
     *            holds the new value of <code>categoryTwo</code>
     */
    public void setCategoryTwo(final String pCategoryTwo) {
        this.categoryTwo = pCategoryTwo;
    }

    /**
     * Gets the <code>categoryThree</code> property.
     * <p>
     * 
     * @return the current value of the <code>categoryThree</code> property.
     */
    public String getCategoryThree() {
        return this.categoryThree;
    }

    /**
     * Sets the <code>pCategoryThree</code>.
     * <p>
     * 
     * @param pCategoryThree
     *            holds the new value of <code>categoryThree</code>
     */
    public void setCategoryThree(final String pCategoryThree) {
        this.categoryThree = pCategoryThree;
    }

    /**
     * Gets the <code>categoryFour</code> property.
     * <p>
     * 
     * @return the current value of the <code>categoryFour</code> property.
     */
    public String getCategoryFour() {
        return this.categoryFour;
    }

    /**
     * Sets the <code>pCategoryFour</code>.
     * <p>
     * 
     * @param pCategoryFour
     *            holds the new value of <code>categoryFour</code>
     */
    public void setCategoryFour(final String pCategoryFour) {
        this.categoryFour = pCategoryFour;
    }

    /**
     * Gets the <code>categoryFive</code> property.
     * <p>
     * 
     * @return the current value of the <code>categoryFive</code> property.
     */
    public String getCategoryFive() {
        return this.categoryFive;
    }

    /**
     * Sets the <code>pCategoryFive</code>.
     * <p>
     * 
     * @param pCategoryFive
     *            holds the new value of <code>categoryFive</code>
     */
    public void setCategoryFive(final String pCategoryFive) {
        this.categoryFive = pCategoryFive;
    }

    
 
  
}
