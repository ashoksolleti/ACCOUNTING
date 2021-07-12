package com.unisys.trans.logistics.lms.framework.dto;


public class IataQueueItemDto extends MessageQueueItemDto {
    
    private static final long serialVersionUID = 6315082822990725573L;

    /**
     * Sets the value to <code>message</code>property.
     * <p>
     * 
     * @param pMessage the new value of <code>Message</code> associated with a queue.<br>
     */
    public void setMessage(final String pMessage) {
        this.message = pMessage;
    }
    
    /**
     * Gets the value of <code>message</code>
     * <p>
     * returns the value of <code>message</code>.
     * <p>
     * 
     * @return message the message inside the queue item.
     */
    public String getMessage() {
        return this.message;
    }
}
