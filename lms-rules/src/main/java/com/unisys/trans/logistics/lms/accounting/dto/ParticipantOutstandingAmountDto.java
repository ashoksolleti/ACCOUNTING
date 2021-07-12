//* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * @author 20536
 * 
 */
public class ParticipantOutstandingAmountDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Attribute to hold the participant name
     */
    private String participantName;
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
     * Attribute to hold <code>aParticipantOutstandingByCategoryDto</code> property.
     */
    public List<ParticipantOutstandingByCategoryDto> participantOutstandingByCategoryDto;
    
    /**
     * Gets the <code>participantName</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantName</code> property.
     */
    public String getParticipantName() {
        return this.participantName;
    }

    /**
     * Sets the <code>pParticipantName</code>.
     * <p>
     * 
     * @param pParticipantName
     *            holds the new value of <code>participantName</code>
     */
    public void setParticipantName(final String pParticipantName) {
        this.participantName = pParticipantName;
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
     * Sets the <code>pPaymentdueDate</code>.
     * <p>
     * 
     * @param pPaymentdueDate
     *            holds the new value of <code>paymentdueDate</code>
     */
    public void setPaymentdueDate(final Date pPaymentdueDate) {
        this.paymentdueDate = pPaymentdueDate;
    }

 
    /**
     * Gets the <code>participantOutstandingByCategoryDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantOutstandingByCategoryDto</code> property.
     */
    public List<ParticipantOutstandingByCategoryDto> getParticipantOutstandingByCategoryDto() {
        return this.participantOutstandingByCategoryDto;
    }

    /**
     * Sets the <code>pParticipantOutstandingByCategoryDto</code>.
     * <p>
     * 
     * @param pParticipantOutstandingByCategoryDto
     *            holds the new value of <code>participantOutstandingByCategoryDto</code>
     */
    public void setParticipantOutstandingByCategoryDto(
                final List<ParticipantOutstandingByCategoryDto> pParticipantOutstandingByCategoryDto) {
        this.participantOutstandingByCategoryDto = pParticipantOutstandingByCategoryDto;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }

}
