//* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ParticipantOutstandingCategory;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * @author 20536
 * 
 */
public class ParticipantOutstandingByCategoryDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>amount</code> property.
     */
    private BigDecimal amount;
    
    /**
     * Represents label for the given category.
     */
    private String label;

    /**
     * Gets the <code>label</code> property.
     * <p>
     * 
     * @return the current value of the <code>label</code> property.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Sets the <code>pLabel</code>.
     * <p>
     * 
     * @param pLabel
     *            holds the new value of <code>label</code>
     */
    public void setLabel(final String pLabel) {
        this.label = pLabel;
    }

    /**
     * Attribute to hold <code>amount</code> property.
     */
    private ParticipantOutstandingCategory category;
 
    /**
     * Constructor
     * @param amount
     * @param pCategoryType
     */

    public ParticipantOutstandingByCategoryDto(final BigDecimal pAmount,
                final ParticipantOutstandingCategory pCategoryType) {
        this.amount = pAmount;
        this.category = pCategoryType;

    }

    /**
     * Gets the <code>amount</code> property.
     * <p>
     * 
     * @return the current value of the <code>amount</code> property.
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Sets the <code>pAmount</code>.
     * <p>
     * 
     * @param pAmount
     *            holds the new value of <code>amount</code>
     */
    public void setAmount(final BigDecimal pAmount) {
        this.amount = pAmount;
    }
   
    /**
     * Gets the <code>category</code> property.
     * <p>
     * 
     * @return the current value of the <code>category</code> property.
     */
    public ParticipantOutstandingCategory getCategory() {
        return this.category;
    }

    /**
     * Sets the <code>pCategory</code>.
     * <p>
     * 
     * @param pCategory
     *            holds the new value of <code>category</code>
     */
    public void setCategory(final ParticipantOutstandingCategory pCategory) {
        this.category = pCategory;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }

}
