package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>RateRequest</code> This contains the following attributes:<br>
 * <li>message
 */
public class RateRequest extends AbstractRequest {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = -6161186877476150127L;

    /**
     * Attribute to hold <code>message</code> property.
     */
    private String message;

    /**
     * Gets the <code>message</code> property.
     * 
     * 
     * @return the current value of the <code>message</code> property.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Sets the <code>message</code> property.
     * 
     * @param pMessage
     *            the new value of the <code>message</code> property.
     */
    public void setMessage(final String pMessage) {
        this.message = pMessage;
    }
}
