package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ManualAuditQueuesFindDto</code> is used for retrieving <code> Audit queue related information</code>
 * information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>officeIdentifier</code>
 * <li><code>numberOfItems</code>
 * <li><code>queueName</code>
 * <li><code>download</code>
 * </ul>
 */
public class ManualAuditQueuesFindDto extends AbstractRequest {

    /**
     * Attribute to hold the <code>serialVersionUID</code> object.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>officeIdentifier</code> object.
     */
    private String officeIdentifier;

    /**
     * Attribute to hold the <code>numberOfItems</code> object.
     */
    private Integer numberOfItems;

    /**
     * Attribute to hold the <code>queueName</code> object.
     */
    private String queueName;

    /**
     * Attribute to hold the <code>download</code> object.
     */
    private boolean download;

    public ManualAuditQueuesFindDto() {
    }

    /**
     * Gets the <code>queueName</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>queueName</code> property.
     */
    public String getQueueName() {
        if (this.queueName == null) {
            this.queueName = new String();
        }
        return this.queueName;
    }

    /**
     * Sets the <code>queueName</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pQueueName
     *            the new value of the <code>queueName</code> property.
     */
    public void setQueueName(final String pQueueName) {
        this.queueName = pQueueName.toUpperCase();
    }

    /**
     * Gets the <code>officeIdentifier</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>officeIdentifier</code> property.
     */
    public String getOfficeIdentifier() {
        if (this.officeIdentifier == null) {
            this.officeIdentifier = new String();
        }
        return this.officeIdentifier.toUpperCase();
    }

    /**
     * Sets the <code>officeIdentifier</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pOfficeIdentifier
     *            the new value of the <code>officeIdentifier</code> property.
     */
    public void setOfficeIdentifier(final String pOfficeIdentifier) {
        this.officeIdentifier = pOfficeIdentifier;
    }

    /**
     * Gets the <code>numberOfItems</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>numberOfItems</code> property.
     */
    public Integer getNumberOfItems() {
        return this.numberOfItems;
    }

    /**
     * Sets the <code>numberOfItems</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pNumberOfItems
     *            the new value of the <code>numberOfItems</code> property.
     */
    public void setNumberOfItems(final Integer pNumberOfItems) {
        this.numberOfItems = pNumberOfItems;
    }

    /**
     * Gets the <code>download</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>download</code> property.
     */
    public boolean isDownload() {
        return this.download;
    }

    /**
     * Sets the <code>download</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pDownload
     *            the new value of the <code>download</code> property.
     */
    public void setDownload(final boolean pDownload) {
        this.download = pDownload;
    }

}
