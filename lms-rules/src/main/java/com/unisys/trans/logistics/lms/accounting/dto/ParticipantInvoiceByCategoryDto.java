/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.util.List;

public class ParticipantInvoiceByCategoryDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the ParticipantInvoiceByCategoryOneDto
     */
    private List<InvoiceDto> participantInvoiceByCategoryOneDto;

    /**
     * Attribute to hold the ParticipantInvoiceByCategoryTwoDto
     */
    private List<InvoiceDto> participantInvoiceByCategoryTwoDto;

    /**
     * Attribute to hold the ParticipantInvoiceByCategoryThreeDto
     */
    private List<InvoiceDto> participantInvoiceByCategoryThreeDto;

    /**
     * Attribute to hold the ParticipantInvoiceByCategoryFourDto
     */
    private List<InvoiceDto> participantInvoiceByCategoryFourDto;

    /**
     * Attribute to hold the ParticipantInvoiceByCategoryFiveDto
     */
    private List<InvoiceDto> participantInvoiceByCategoryFiveDto;

    /**
     * Attribute to hold the AmountCateoryOne
     */
    private int amountCateoryOne;

    /**
     * Attribute to hold the AmountCategoryTwo
     */
    private int amountCategoryTwo;

    /**
     * Attribute to hold the AmountCategoryThree
     */
    private int amountCategoryThree;

    /**
     * Attribute to hold the AmountCategoryFour
     */
    private int amountCategoryFour;

    /**
     * Attribute to hold the AmountCategoryFive
     */
    private int amountCategoryFive;
    
    /**
     * Attribute to hold the totalOutstanding
     */
    private int totalOutstanding;

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
     * Gets the <code>amountCateoryOne</code> property.
     * <p>
     * 
     * @return the current value of the <code>amountCateoryOne</code> property.
     */
    public int getAmountCateoryOne() {
        return this.amountCateoryOne;
    }

    /**
     * Sets the <code>pAmountCateoryOne</code>.
     * <p>
     * 
     * @param pAmountCateoryOne
     *            holds the new value of <code>amountCateoryOne</code>
     */
    public void setAmountCateoryOne(final int pAmountCateoryOne) {
        this.amountCateoryOne = pAmountCateoryOne;
    }

    /**
     * Gets the <code>amountCategoryTwo</code> property.
     * <p>
     * 
     * @return the current value of the <code>amountCategoryTwo</code> property.
     */
    public int getAmountCategoryTwo() {
        return this.amountCategoryTwo;
    }

    /**
     * Sets the <code>pAmountCategoryTwo</code>.
     * <p>
     * 
     * @param pAmountCategoryTwo
     *            holds the new value of <code>amountCategoryTwo</code>
     */
    public void setAmountCategoryTwo(final int pAmountCategoryTwo) {
        this.amountCategoryTwo = pAmountCategoryTwo;
    }

    /**
     * Gets the <code>amountCategoryThree</code> property.
     * <p>
     * 
     * @return the current value of the <code>amountCategoryThree</code> property.
     */
    public int getAmountCategoryThree() {
        return this.amountCategoryThree;
    }

    /**
     * Sets the <code>pAmountCategoryThree</code>.
     * <p>
     * 
     * @param pAmountCategoryThree
     *            holds the new value of <code>amountCategoryThree</code>
     */
    public void setAmountCategoryThree(final int pAmountCategoryThree) {
        this.amountCategoryThree = pAmountCategoryThree;
    }

    /**
     * Gets the <code>amountCategoryFour</code> property.
     * <p>
     * 
     * @return the current value of the <code>amountCategoryFour</code> property.
     */
    public int getAmountCategoryFour() {
        return this.amountCategoryFour;
    }

    /**
     * Sets the <code>pAmountCategoryFour</code>.
     * <p>
     * 
     * @param pAmountCategoryFour
     *            holds the new value of <code>amountCategoryFour</code>
     */
    public void setAmountCategoryFour(final int pAmountCategoryFour) {
        this.amountCategoryFour = pAmountCategoryFour;
    }

    /**
     * Gets the <code>amountCategoryFive</code> property.
     * <p>
     * 
     * @return the current value of the <code>amountCategoryFive</code> property.
     */
    public int getAmountCategoryFive() {
        return this.amountCategoryFive;
    }

    /**
     * Sets the <code>pAmountCategoryFive</code>.
     * <p>
     * 
     * @param pAmountCategoryFive
     *            holds the new value of <code>amountCategoryFive</code>
     */
    public void setAmountCategoryFive(final int pAmountCategoryFive) {
        this.amountCategoryFive = pAmountCategoryFive;
    }

    /**
     * Gets the <code>totalOutstanding</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalOutstanding</code> property.
     */
    public int getTotalOutstanding() {
        return this.totalOutstanding;
    }

    /**
     * Sets the <code>pTotalOutstanding</code>.
     * <p>
     * 
     * @param pTotalOutstanding
     *            holds the new value of <code>totalOutstanding</code>
     */
    public void setTotalOutstanding(final int pTotalOutstanding) {
        this.totalOutstanding = pTotalOutstanding;
    }

   
    
    

}
