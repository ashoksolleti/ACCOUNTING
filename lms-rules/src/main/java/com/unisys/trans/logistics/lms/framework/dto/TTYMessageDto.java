/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.dto;

import java.util.List;

/**
 * @author MuthusaB1
 *
 */
/**
 * <code>TTYMessageDto</code> contains specific data applicable to the user profile.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * fromAddr
 * messageElements
 * messageIdentifier
 * messageVersion
 * originalMessage
 * toAddrs
 * wrkMessage
 * </code>
 * </ul>
 * 
 */
public class TTYMessageDto {
    /**
     * Attribute to holds <code>fromAddr</code> property.
     */

    private String fromAddr;

    /**
     * Attribute to holds <code>messageElements</code> property.
     */

    private List<Object> messageElements;

    /**
     * Attribute to holds <code>messageIdentifier</code> property.
     */

    private String messageIdentifier;

    /**
     * Attribute to holds <code>messageVersion</code> property.
     */

    private int messageVersion;

    /**
     * Attribute to holds <code>originalMessage</code> property.
     */

    private String originalMessage;

    /**
     * Attribute to holds <code>toAddrs</code> property.
     */

    private List<String> toAddrs;

    /**
     * Attribute to holds <code>wrkMessage</code> property.
     */

    private String wrkMessage;

    /**
     * @return the fromAddr
     */
    public String getFromAddr() {
        return this.fromAddr;
    }

    /**
     * Gets the value of the MessageElements property.
     * 
     * @return the messageElements
     */
    public List<Object> getMessageElements() {
        return this.messageElements;
    }

    /**
     * Gets the value of the MessageIdentifier property.
     * 
     * @return the messageIdentifier
     */
    public String getMessageIdentifier() {
        return this.messageIdentifier;
    }

    /**
     * Gets the value of the MessageVersion property.
     * 
     * @return the messageVersion
     */
    public int getMessageVersion() {
        return this.messageVersion;
    }

    /**
     * Gets the value of the OriginalMessage property.
     * 
     * @return the originalMessage
     */
    public String getOriginalMessage() {
        return this.originalMessage;
    }

    /**
     * Gets the value of the ToAddrs property.
     * 
     * @return the toAddrs
     */
    public List<String> getToAddrs() {
        return this.toAddrs;
    }

    /**
     * Gets the value of the WrkMessage property.
     * 
     * @return the wrkMessage
     */
    public String getWrkMessage() {
        return this.wrkMessage;
    }

    /**
     * Sets the value of the FromAddr property.
     * 
     * @param fromAddr the fromAddr to set
     */
    public void setFromAddr(final String pFromAddr) {
        this.fromAddr = pFromAddr;
    }

    /**
     * Sets the value of the MessageElements property.
     * 
     * @param messageElements the messageElements to set
     */
    public void setMessageElements(final List<Object> pMessageElements) {
        this.messageElements = pMessageElements;
    }

    /**
     * Sets the value of the MessageIdentifier property.
     * 
     * @param messageIdentifier the messageIdentifier to set
     */
    public void setMessageIdentifier(final String pMessageIdentifier) {
        this.messageIdentifier = pMessageIdentifier;
    }

    /**
     * Sets the value of the MessageVersion property.
     * 
     * @param messageVersion the messageVersion to set
     */
    public void setMessageVersion(final int pMessageVersion) {
        this.messageVersion = pMessageVersion;
    }

    /**
     * Sets the value of the OriginalMessage property.
     * 
     * @param originalMessage the originalMessage to set
     */
    public void setOriginalMessage(final String pOriginalMessage) {
        this.originalMessage = pOriginalMessage;
    }

    /**
     * Sets the value of the ToAddrs property.
     * 
     * @param toAddrs the toAddrs to set
     */
    public void setToAddrs(final List<String> pToAddrs) {
        this.toAddrs = pToAddrs;
    }

    /**
     * Sets the value of the WrkMessage property.
     * 
     * @param wrkMessage the wrkMessage to set
     */
    public void setWrkMessage(final String pWrkMessage) {
        this.wrkMessage = pWrkMessage;
    }
}
