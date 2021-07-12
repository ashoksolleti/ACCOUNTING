package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class ManualAuditQueuesFindRequest extends AbstractRequest {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>officeIdentifier</code> object.
     */
    private String officeIdentifier;

    /**
     * Attribute to hold the <code>numberOfItems</code> object.
     */
    private String numberOfItems;

    /**
     * Attribute to hold the <code>queueName</code> object.
     */
    private String queueName;

    /**
     * Attribute to hold the <code>download</code> object.
     */
    private boolean download;

    public ManualAuditQueuesFindRequest() {
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

    public void setQueueName(final String queueName) {
        this.queueName = queueName.toUpperCase();
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
    public String getNumberOfItems() {
        return this.numberOfItems;
    }

    public void setNumberOfItems(final String pNumberOfItems) {
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

    public void setDownload(final boolean pDownload) {
        this.download = pDownload;
    }

}
