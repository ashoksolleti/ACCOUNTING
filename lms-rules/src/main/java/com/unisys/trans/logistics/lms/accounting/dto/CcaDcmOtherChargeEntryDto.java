package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.CreditType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.DueType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.GenIdType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PayCodeType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class CcaDcmOtherChargeEntryDto implements Serializable {

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
     * Attribute to hold <code>time</code> property.
     */
    private String time;

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
     * Attribute to hold <code>timeIndicator</code> property.
     */
    private String timeIndicator;

    /**
     * Gets the <code>amount</code> property.
     * 
     * @return this.the current value of the <code>amount</code> property.<br>
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Gets the <code>chargeCode</code> property.
     * 
     * @return this.the current value of the <code>chargeCode</code> property.<br>
     */
    public String getChargeCode() {
        return this.chargeCode;
    }

    /**
     * Gets the <code>creditType</code> property.
     * 
     * @return this.the current value of the <code>creditType</code> property.<br>
     */
    public CreditType getCreditType() {
        return this.creditType;
    }

    /**
     * Gets the <code>date</code> property.
     * 
     * @return this.the current value of the <code>date</code> property.<br>
     */
    public Date getDate() {
        return ContractUtility.getClonedDate(this.date);
    }

    /**
     * Gets the <code>description</code> property.
     * 
     * @return this.the current value of the <code>description</code> property.<br>
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the <code>dueType</code> property.
     * 
     * @return this.the current value of the <code>dueType</code> property.<br>
     */
    public DueType getDueType() {
        return this.dueType;
    }

    /**
     * Gets the <code>genIDType</code> property.
     * 
     * @return this.the current value of the <code>genIDType</code> property.<br>
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
     * @return this.the current value of the <code>payCode</code> property.<br>
     */
    public PayCodeType getPayCode() {
        return this.payCode;
    }

    /**
     * Gets the <code>quantity</code> property.
     * 
     * @return this.the current value of the <code>quantity</code> property.<br>
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * Gets the <code>subCode</code> property.
     * 
     * @return this.the current value of the <code>subCode</code> property.<br>
     */

    public String getSubCode() {
        return this.subCode;
    }

    /**
     * Gets the <code>timeIndicator</code> property.
     * 
     * @return this.the current value of the <code>timeIndicator</code> property.<br>
     */

    public String getTimeIndicator() {
        return this.timeIndicator;
    }

    /**
     * Gets the <code>deleteIndicator</code> property.
     * 
     * @return this.the current value of the <code>deleteIndicator</code> property.<br>
     */

    public boolean isDeleteIndicator() {
        return this.deleteIndicator;
    }

    /**
     * Gets the <code>serviceIndicator</code> property.
     * 
     * @return this.the current value of the <code>serviceIndicator</code> property.<br>
     */
    public boolean isServiceIndicator() {
        return this.serviceIndicator;
    }

    /**
     * Sets the <code>amount</code> property.
     * <p>
     * 
     * @param pAmount
     *            the new value of the <code>amount</code> property.
     */
    public void setAmount(final BigDecimal pAmount) {
        this.amount = pAmount;
    }

    /**
     * Sets the <code>chargeCode</code> property.
     * <p>
     * 
     * @param pChargeCode
     *            the new value of the <code>chargeCode</code> property.
     */
    public void setChargeCode(final String pChargeCode) {
        this.chargeCode = pChargeCode;
    }

    /**
     * Sets the <code>creditType</code> property.
     * <p>
     * 
     * @param pCreditType
     *            the new value of the <code>creditType</code> property.
     */

    public void setCreditType(final CreditType pCreditType) {
        this.creditType = pCreditType;
    }

    /**
     * Sets the <code>date</code> property.
     * <p>
     * 
     * @param pDate
     *            the new value of the <code>date</code> property.
     */
    public void setDate(final Date pDate) {
        this.date = ContractUtility.getClonedDate(pDate);
    }

    /**
     * Sets the <code>deleteIndicator</code> property.
     * <p>
     * 
     * @param pDeleteIndicator
     *            the new value of the <code>deleteIndicator</code> property.
     */

    public void setDeleteIndicator(final boolean pDeleteIndicator) {
        this.deleteIndicator = pDeleteIndicator;
    }

    /**
     * Sets the <code>description</code> property.
     * <p>
     * 
     * @param pDescription
     *            the new value of the <code>description</code> property.
     */

    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Sets the <code>dueType</code> property.
     * <p>
     * 
     * @param pDueType
     *            the new value of the <code>dueType</code> property.
     */

    public void setDueType(final DueType pDueType) {
        this.dueType = pDueType;
    }

    /**
     * Sets the <code>genIDType</code> property.
     * <p>
     * 
     * @param pGenIDType
     *            the new value of the <code>genIDType</code> property.
     */
    public void setGenIDType(final GenIdType pGenIDType) {
        this.genIDType = pGenIDType;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */

    public void setoId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>payCode</code> property.
     * <p>
     * 
     * @param pPayCode
     *            the new value of the <code>payCode</code> property.
     */
    public void setPayCode(final PayCodeType pPayCode) {
        this.payCode = pPayCode;
    }

    /**
     * Sets the <code>quantity</code> property.
     * <p>
     * 
     * @param pQuantity
     *            the new value of the <code>quantity</code> property.
     */
    public void setQuantity(final Integer pQuantity) {
        this.quantity = pQuantity;
    }

    /**
     * Sets the <code>serviceIndicator</code> property.
     * <p>
     * 
     * @param pServiceIndicator
     *            the new value of the <code>serviceIndicator</code> property.
     */
    public void setServiceIndicator(final boolean pServiceIndicator) {
        this.serviceIndicator = pServiceIndicator;
    }

    /**
     * Sets the <code>subCode</code> property.
     * <p>
     * 
     * @param pSubCode
     *            the new value of the <code>subCode</code> property.
     */
    public void setSubCode(final String pSubCode) {
        this.subCode = pSubCode;
    }

    /**
     * Sets the <code>timeIndicator</code> property.
     * <p>
     * 
     * @param pTimeIndicator
     *            the new value of the <code>timeIndicator</code> property.
     */

    public void setTimeIndicator(final String pTimeIndicator) {
        this.timeIndicator = pTimeIndicator;
    }

    public String getTime() {
        return time;
    }

    public void setTime(final String pTime) {
        this.time = pTime;
    }

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}



}
