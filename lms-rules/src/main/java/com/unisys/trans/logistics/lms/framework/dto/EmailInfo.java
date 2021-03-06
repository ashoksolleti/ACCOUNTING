package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

public class EmailInfo implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1551706478481197572L;
    
    private String to;
    
    private String subject;
    
    private String message;

    /**
     * @return the to
     */
    public String getTo() {
        return to;
    }

    /**
     * @param to the to to set
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
