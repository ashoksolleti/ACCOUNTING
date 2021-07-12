package com.unisys.trans.logistics.lms.awb.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.constants.CreditType;
import com.unisys.trans.logistics.lms.framework.constants.DueType;
import com.unisys.trans.logistics.lms.framework.constants.GenIdType;
import com.unisys.trans.logistics.lms.framework.constants.PayCodeType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class OtherChargesDto extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>amount</code> property.
     */
    private BigDecimal amount;

    /**
     * Attribute to hold <code>chargeCode</code> property.
     */
    private String chargeCode;

    /**
     * Attribute to hold <code>creditType</code> property.
     */
    private CreditType creditType;

    /**
     * Attribute to hold <code>date</code> property.
     */
    private Date date;

    /**
     * Attribute to hold <code>deleteIndicator</code> property.
     */
    private boolean deleteIndicator;

    /**
     * Attribute to hold <code>description</code> property.
     */
    private String description;

    /**
     * Attribute to hold <code>dueType</code> property.
     */
    private DueType dueType;

    /**
     * Attribute to hold <code>genIDType</code> property.
     */
    private GenIdType genIDType;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>payCode</code> property.
     */
    private PayCodeType payCode;

    /**
     * Attribute to hold <code>quantity</code> property.
     */
    private Integer quantity;

    /**
     * Attribute to hold <code>serviceIndicator</code> property.
     */
    private boolean serviceIndicator;

    /**
     * Attribute to hold <code>subCode</code> property.
     */
    private String subCode;

    /**
     * Attribute to hold <code>time</code> property.
     */
    private Integer otherChargeTime;

    /**
     * Attribute to hold <code>timeIndicator</code> property.
     */
    private String timeIndicator;

	/**
	 * Gets the <code>amount</code> property.
	 * 
	 */
	public BigDecimal getAmount() {
		if (amount != null) {
			amount = amount.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		}
		return this.amount;
	}

    /**
     * Gets the <code>chargeCode</code> property.
     * 
     */
    public String getChargeCode() {
        return this.chargeCode;
    }

    /**
     * Gets the <code>creditType</code> property.
     * 
     */
    public CreditType getCreditType() {
        return this.creditType;
    }

    /**
     * Gets the <code>date</code> property.
     * 
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Gets the <code>description</code> property.
     * 
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the <code>dueType</code> property.
     * 
     */
    public DueType getDueType() {
        return this.dueType;
    }

    /**
     * Gets the <code>genIDType</code> property.
     * 
     */
    public GenIdType getGenIDType() {
        return this.genIDType;
    }

    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>payCode</code> property.
     * 
     */
    public PayCodeType getPayCode() {
        return this.payCode;
    }

    /**
     * Gets the <code>quantity</code> property.
     * 
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * Gets the <code>subCode</code> property.
     * 
     */

    public String getSubCode() {
        return this.subCode;
    }

    /**
     * Gets the <code>time</code> property.
     * 
     */

    public Integer getOtherChargeTime() {
        return this.otherChargeTime;
    }

    /**
     * Gets the <code>timeIndicator</code> property.
     * 
     */

    public String getTimeIndicator() {
        return this.timeIndicator;
    }

    /**
     * Gets the <code>deleteIndicator</code> property.
     * 
     */

    public boolean isDeleteIndicator() {
        return this.deleteIndicator;
    }

    /**
     * Gets the <code>serviceIndicator</code> property.
     * 
     */
    public boolean isServiceIndicator() {
        return this.serviceIndicator;
    }

    /**
     * Sets the <code>amount</code> property.
     * <p>
     * 
     *            the new value of the <code>amount</code> property.
     */
    public void setAmount(final BigDecimal pAmount) {
        this.amount = pAmount;
    }

    /**
     * Sets the <code>chargeCode</code> property.
     * <p>
     * 
     *            the new value of the <code>chargeCode</code> property.
     */
    public void setChargeCode(final String pChargeCode) {
        this.chargeCode = pChargeCode;
    }

    /**
     * Sets the <code>creditType</code> property.
     * <p>
     * 
     *            the new value of the <code>creditType</code> property.
     */

    public void setCreditType(final CreditType pCreditType) {
        this.creditType = pCreditType;
    }

    /**
     * Sets the <code>date</code> property.
     * <p>
     * 
     *            the new value of the <code>date</code> property.
     */
    public void setDate(final Date pDate) {
        this.date = pDate;
    }

    /**
     * Sets the <code>deleteIndicator</code> property.
     * <p>
     * 
     *            the new value of the <code>deleteIndicator</code> property.
     */

    public void setDeleteIndicator(final boolean pDeleteIndicator) {
        this.deleteIndicator = pDeleteIndicator;
    }

    /**
     * Sets the <code>description</code> property.
     * <p>
     * 
     *            the new value of the <code>description</code> property.
     */

    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Sets the <code>dueType</code> property.
     * <p>
     * 
     *            the new value of the <code>dueType</code> property.
     */

    public void setDueType(final DueType pDueType) {
        this.dueType = pDueType;
    }

    /**
     * Sets the <code>genIDType</code> property.
     * <p>
     * 
     *            the new value of the <code>genIDType</code> property.
     */
    public void setGenIDType(final GenIdType pGenIDType) {
        this.genIDType = pGenIDType;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     *            the new value of the <code>oId</code> property.
     */

    public void setoId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>payCode</code> property.
     * <p>
     * 
     *            the new value of the <code>payCode</code> property.
     */
    public void setPayCode(final PayCodeType pPayCode) {
        this.payCode = pPayCode;
    }

    /**
     * Sets the <code>quantity</code> property.
     * <p>
     * 
     *            the new value of the <code>quantity</code> property.
     */
    public void setQuantity(final Integer pQuantity) {
        this.quantity = pQuantity;
    }

    /**
     * Sets the <code>serviceIndicator</code> property.
     * <p>
     * 
     *            the new value of the <code>serviceIndicator</code> property.
     */
    public void setServiceIndicator(final boolean pServiceIndicator) {
        this.serviceIndicator = pServiceIndicator;
    }

    /**
     * Sets the <code>subCode</code> property.
     * <p>
     * 
     *            the new value of the <code>subCode</code> property.
     */
    public void setSubCode(final String pSubCode) {
        this.subCode = pSubCode;
    }

    /**
     * Sets the <code>otherChargeEntries</code> property.
     * <p>
     * 
     *            the new value of the <code>time</code> property.
     */
    public void setOtherChargeTime(final Integer pOtherChargeTime) {
        this.otherChargeTime = pOtherChargeTime;
    }

    /**
     * Sets the <code>timeIndicator</code> property.
     * <p>
     * 
     *            the new value of the <code>timeIndicator</code> property.
     */

    public void setTimeIndicator(final String pTimeIndicator) {
        this.timeIndicator = pTimeIndicator;
    }

}
