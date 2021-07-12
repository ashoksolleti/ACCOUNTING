/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

/**
 * <code>MessageQueueSendResponse</code> holds all the information to retrieve an Office .
 * <p>
 * The status of the item send to the queue. It will returns "SUCCESS" for successful sent else returns
 * "FAIL". This contains the following attributes:
 * <ul>
 * <code>
 * <li>status
 * </code>
 * </ul>
 */
public class MessageQueueSendResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 510777537981985582L;

    /**
     * Attribute to hold the <code>status</code> property.
     * <p>
     * The status of the item send to the queue.
     * <p>
     */
    private String status;
    
    private boolean fail;

    /**
     * Default Constructor.
     */
    public MessageQueueSendResponse() {

    }

    /**
     * Gets the value of <code>status</code>.
     * <p>
     * 
     * @return the value of <code>status</code>.
     *         <p>
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Sets the value of <code>status</code> associated with a queue .
     * <p>
     * 
     * @param pStatus the new value of <code>status</code>.<br>
     */
    public void setStatus(final String pStatus) {
        this.status = pStatus;
    }

	/**
	 * @return the fail
	 */
	public boolean isFail() {
		return fail;
	}

	/**
	 * @param fail the fail to set
	 */
	public void setFail(boolean fail) {
		this.fail = fail;
	}

}
