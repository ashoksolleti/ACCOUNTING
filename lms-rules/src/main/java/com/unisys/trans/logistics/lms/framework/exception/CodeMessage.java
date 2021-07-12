/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.exception;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.constants.ExceptionType;

/**
 * <code>CodeMessage</code> holds the error code and error message.
 * <p>
 * This class performs the following functions:
 * <ul>
 * <li>Gets the <code>code</code>.
 * <li>Sets the <code>code</code>.
 * <li>Gets the <code>message</code>.
 * <li>Sets the <code>message</code>.
 * <li>Gets the <code>type</code>.
 * <li>Sets the <code>type</code>.
 * </ul>
 */
public class CodeMessage implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 666696834166128593L;

    /**
     * Attribute to hold the <code>code</code> property.
     */
    private String code;

    /**
     * Attribute to the hold the <code>message</code> property.
     */
    private String message;

    /**
     * Attribute to the hold the <code>type</code> property.
     */
    private ExceptionType type;

    /**
     * <code>Default Constructor.</code>
     * <p>
     */
    public CodeMessage() {

    }

    /**
     * Overloaded Constructor.
     * <p>
     * 
     * @param pCode the new value of the error <code>code</code> property.
     * @param pMessage the new value of the error <code>message</code> property.
     * @param pType the new value of the <code>type</code> property.
     */
    public CodeMessage(final String pCode, final String pMessage, final ExceptionType pType) {
        this.code = pCode;
        this.message = pMessage;
        this.type = pType;
    }

    /**
     * Gets the error <code>code</code> property.
     * <p>
     * 
     * @return the current value of the <code>code</code> property.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Gets the error <code>message</code> property.
     * <p>
     * 
     * @return the current value of the error <code>message</code> property.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * 
     * @return the current value of the <code>type</code> property.
     */
    public ExceptionType getType() {
        return this.type;
    }

    /**
     * Sets the <code>code</code> property.
     * <p>
     * 
     * @param pCode the new value of the <code>code</code> property.
     */
    public void setCode(final String pCode) {
        this.code = pCode;
    }

    /**
     * Sets the error <code>message</code> property.
     * <p>
     * 
     * @param pMessage the new value of the <code>message</code> property.
     */
    public void setMessage(final String pMessage) {
        this.message = pMessage;
    }

    /**
     * Sets the <code>type</code> property.
     * <p>
     * 
     * @param pType the new value of the <code>type</code> property.
     */
    public void setType(final ExceptionType pType) {
        this.type = pType;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CodeMessage other = (CodeMessage) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
    
    

}
