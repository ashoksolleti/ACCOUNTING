package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.util.Date;

//import org.codehaus.jackson.annotate.JsonWriteNullProperties;

import com.unisys.trans.logistics.lms.framework.constants.ReasonCodeType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

//@JsonWriteNullProperties(false)
public class WorkItemDto implements Serializable {

    /**
     * Unique serial version UID.
     */

    private static final long serialVersionUID = 2848188271891074165L;

    /**
     * Attribute to hold <code>creationDateTime</code> property.
     */
    private Date creationDateTime;

    /**
     * Attribute to hold <code>moduleName</code> property.
     */
    private String moduleName;

    /**
     * Attribute to hold <code>office</code> property.
     */
    private String office;

    /**
     * Attribute to hold <code>queueText</code> property.
     */
    private String queueText;

    /**
     * Attribute to hold <code>reason</code> property.
     */
    private String reason;

    /**
     * Attribute to hold <code>reasonCode</code> property.
     */
    private ReasonCodeType reasonCode;

    /**
     * Attribute to hold <code>rowIndex</code> property.
     */
    private String rowIndex;

    /**
     * Attribute to hold <code>totalItems</code> property.
     */
    private int totalItems;

    /**
     * Gets the <code>creationDateTime</code> property.
     * 
     * @return the current value of the <code>creationDateTime</code> property.
     */
    public Date getCreationDateTime() {
        return ContractUtility.getClonedDate(this.creationDateTime);
    }

    /**
     * Gets the <code>moduleName</code> property.
     * 
     * @return the current value of the <code>moduleName</code> property.
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * Gets the <code>office</code> property.
     * 
     * @return the current value of the <code>office</code> property.
     */
    public String getOffice() {
        return this.office;
    }

    /**
     * Gets the <code>queueText</code> property.
     * 
     * @return the current value of the <code>queueText</code> property.
     */
    public String getQueueText() {
        return this.queueText;
    }

    /**
     * Gets the <code>reason</code> property.
     * 
     * @return the current value of the <code>reason</code> property.
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Gets the <code>reasonCode</code> property.
     * 
     * @return the current value of the <code>reasonCode</code> property.
     */
    public ReasonCodeType getReasonCode() {
        return this.reasonCode;
    }

    /**
     * Gets the <code>rowIndex</code> property.
     * 
     * @return the current value of the <code>rowIndex</code> property.
     */
    public String getRowIndex() {
        return this.rowIndex;
    }

    /**
     * Gets the <code>totalItems</code> property.
     * 
     * @return the current value of the <code>totalItems</code> property.
     */
    public int getTotalItems() {
        return this.totalItems;
    }

    /**
     * Sets the <code>creationDateTime</code> property.
     * 
     * @param pCreationDateTime
     *            the current value of the <code>creationDateTime</code> property.
     */
    public void setCreationDateTime(final Date pCreationDateTime) {
        this.creationDateTime = ContractUtility.getClonedDate(pCreationDateTime);
    }

    /**
     * Sets the <code>moduleName</code> property.
     * 
     * @param pModuleName
     *            the current value of the <code>moduleName</code> property.
     */
    public void setModuleName(final String pModuleName) {
        this.moduleName = pModuleName;
    }

    /**
     * Sets the <code>office</code> property.
     * 
     * @param pOffice
     *            the current value of the <code>office</code> property.
     */
    public void setOffice(final String pOffice) {
        this.office = pOffice;
    }

    /**
     * Sets the <code>queueText</code> property.
     * 
     * @param pQueueText
     *            the current value of the <code>queueText</code> property.
     */
    public void setQueueText(final String pQueueText) {
        this.queueText = pQueueText;
    }

    /**
     * Sets the <code>reason</code> property.
     * 
     * @param pReason
     *            the current value of the <code>reason</code> property.
     */
    public void setReason(final String pReason) {
        this.reason = pReason;
    }

    /**
     * Sets the <code>reasonCode</code> property.
     * 
     * @param pReasonCode
     *            the current value of the <code>reasonCode</code> property.
     */
    public void setReasonCode(final ReasonCodeType pReasonCode) {
        this.reasonCode = pReasonCode;
    }

    /**
     * Sets the <code>rowIndex</code> property.
     * 
     * @param pRowIndex
     *            the current value of the <code>rowIndex</code> property.
     */
    public void setRowIndex(final String pRowIndex) {
        this.rowIndex = pRowIndex;
    }

    /**
     * Sets the <code>totalItems</code> property.
     * 
     * @param pTotalItems
     *            the current value of the <code>totalItems</code> property.
     */
    public void setTotalItems(final int pTotalItems) {
        this.totalItems = pTotalItems;
    }
}
