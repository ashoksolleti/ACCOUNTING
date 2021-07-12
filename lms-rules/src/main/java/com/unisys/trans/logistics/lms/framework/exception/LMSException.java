/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.exception;

import com.unisys.trans.logistics.lms.framework.constants.ExceptionType;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.ExceptionType;
import com.unisys.trans.logistics.lms.framework.constants.MessageConstants;

/**
 * <code>LMSException</code> class throws application level error messages.
 * <p>
 * This class performs the following functions:
 * <ul>
 * <li>Gets the code message.
 * <li>Gets the status.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.framework.exception.CodeMessage
 */
public class LMSException extends Exception {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4843782084713512782L;

    /**
     * Attribute to hold the list of <code>CodeMessage</code> object.
     */
    private List<CodeMessage> codeMessages;

    /**
     * Attribute to hold the <code>status</code> property of roll back transaction.
     */
    private Integer status;
	private int errorCode;
	private String fsuStatusType;
    
    private String awbNumber;
    
    private String origin;
    
    private String destination;

    /**
     * Default Constructor.
     */
    public LMSException() {
		super();
	}

	/**
	 * Attribute to hold the error message.
	 */
	private String errorMessage;

	/**
	 * This method is used to create LMSException using the Throwable parameter.
	 * 
	 * @param pThrowable
	 * @return
	 */
	public static LMSException createException(Throwable pThrowable) {
		return new LMSException(pThrowable);
	}
	/**
	 * This method is used to create LMSException using the Throwable parameter
	 * and error code.
	 * 
	 * @param pThrowable
	 * @param pErrorCode
	 * @return
	 */
	public static LMSException createException(Throwable pThrowable,
			int pErrorCode) {
		return new LMSException(pThrowable, pErrorCode);
	}

	/**
	 * 
	 * @param pThrowable
	 */
	public LMSException(Throwable pThrowable) {
		setErrorCode(MessageConstants.INTERNAL_ERROR);
		setErrorMessage(MessageConstants
				.getErrorMessage(MessageConstants.INTERNAL_ERROR));
		this.initCause(pThrowable);
	}

	/**
	 * 
	 * @param pThrowable
	 * @param pErrorCode
	 */
	public LMSException(Throwable pThrowable, int pErrorCode) {
		setErrorCode(pErrorCode);
		setErrorMessage(MessageConstants.getErrorMessage(pErrorCode));
		this.initCause(pThrowable);
	}

	/**
	 * 
	 * @return
	 */
	public int getErrorCode() {
		return errorCode;
	}

	/**
	 * 
	 * @return
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * 
	 * @param errorCode
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * 
	 * @param errorMessage
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

    /**
     * Class constructor with a list of code messages.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pCodeMessage contains the list of code messages.
     */
    public LMSException(final CodeMessage pCodeMessage) {

        this.addCodeMessage(pCodeMessage);

    }
    
    public LMSException(LMSException e) {
    	super(e.getCause());
       this.codeMessages = e.getCodeMessages();
       this.status = e.getStatus();
     

    }

    /**
     * Class constructor with a list of code messages.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pCodeMessage contains the list of code messages.
     * @param pStatus the status of transaction(
     *            {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#ROLLBACK}/
     *            {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#NOROLLBACK}).
     */
    public LMSException(final CodeMessage pCodeMessage, final Integer pStatus) {

        this.addCodeMessage(pCodeMessage);
        this.setStatus(pStatus);

    }

    /**
     * Class constructor with a list of code messages.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pCodeMessage contains the list of code messages.
     * @param pStatus the status of transaction(
     *            {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#ROLLBACK}/
     *            {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#NOROLLBACK}).
     * @param pThrowable the exception that actually occurred.
     */
    public LMSException(final CodeMessage pCodeMessage, final Integer pStatus, final Throwable pThrowable) {

        super(pThrowable);
        this.addCodeMessage(pCodeMessage);
        this.setStatus(pStatus);

    }

    /**
     * Class constructor with error code and error message as parameters.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pErrorCode the value of the error code.
     * @param pMessage the error message corresponding to the error code.
     */
    public LMSException(final int pErrorCode, final String pMessage) {

        final CodeMessage aCodeMessage =
                    new CodeMessage(String.valueOf(pErrorCode), pMessage, ExceptionType.ERR);

        this.addCodeMessage(aCodeMessage);

    }

    /**
     * Class constructor with error code,error message and status(RollBack/NoRollback) as parameters.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pErrorCode the value of the error code.
     * @param pMessage the error message corresponding to the error code.
     * @param pStatus the status of transaction(
     *            {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#ROLLBACK}/
     *            {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#NOROLLBACK}).
     */
    public LMSException(final int pErrorCode, final String pMessage, final Integer pStatus) {

        final CodeMessage aCodeMessage =
                    new CodeMessage(String.valueOf(pErrorCode), pMessage, ExceptionType.ERR);

        this.addCodeMessage(aCodeMessage);
        this.setStatus(pStatus);

    }

    /**
     * Class constructor with error code,error message and status(RollBack/NoRollback) as parameters.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pErrorCode the value of the error code.
     * @param pMessage the error message corresponding to the error code.
     * @param pStatus the status of transaction(
     *            {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#ROLLBACK}/
     *            {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#NOROLLBACK}).
     * @param pThrowable the exception that actually occurred.
     */
    public LMSException(final int pErrorCode, final String pMessage, final Integer pStatus,
                final Throwable pThrowable) {
        super(pThrowable);
        final CodeMessage aCodeMessage =
                    new CodeMessage(String.valueOf(pErrorCode), pMessage, ExceptionType.ERR);

        this.addCodeMessage(aCodeMessage);
        this.setStatus(pStatus);

    }

    /**
     * Class constructor with a list of code messages.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pCodeMessages contains the list of code messages.
     * @param pStatus the status of transaction(
     *            {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#ROLLBACK}/
     *            {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#NOROLLBACK}).
     */
    public LMSException(final List<CodeMessage> pCodeMessages, final Integer pStatus) {

        this.setCodeMessages(pCodeMessages);
        this.setStatus(pStatus);

    }

    /**
     * Gets the <code>codeMessages</code> property.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of the <code>codeMessages</code> property
     */
    public List<CodeMessage> getCodeMessages() {
        return this.codeMessages;
    }

    /**
     * Gets the roll back <code>status</code> property.
     * <p>
     * <b>Possible values :</b>
     * <ul>
     * <li>0 <br>
     * If the roll back transaction is successful.
     * <li>1 <br>
     * If the roll back transaction failed (i.e NoRollBack).
     * </ul>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of the <code>status</code> property.
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * Adds the <code>CodeMessage</code> object to the <code>CodeMessage</code> attribute.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pCodeMessage holds the error code and error message.
     */
    protected void addCodeMessage(final CodeMessage pCodeMessage) {

        if (this.codeMessages == null) {
            this.codeMessages = new ArrayList<CodeMessage>();
        }

        this.codeMessages.add(pCodeMessage);

    }

    /**
     * Sets the <code>codeMessages</code> property.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pCodeMessages the new value of list of <code>codeMessages</code> property.
     */
    protected void setCodeMessages(final List<CodeMessage> pCodeMessages) {
        this.codeMessages = pCodeMessages;
    }

    /**
     * Sets the roll back <code>status</code>.
     * <p>
     * <b>Possible values :</b>
     * <ul>
     * <li>0 <br>
     * If the roll back transaction is successful.
     * <li>1 <br>
     * If the roll back transaction failed (i.e NoRollBack).
     * </ul>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pStatus the new value of <code>status</code> property.
     */
    protected void setStatus(final Integer pStatus) {
        this.status = pStatus;
    }
    
    public LMSException(final CodeMessage pCodeMessage,final Throwable pThrowable) {
		super(pThrowable);
		this.addCodeMessage(pCodeMessage);

	}
    
    // LMSC-11111 UIS158 Start
    private String queueName;

    private String queueOffice;
    
    public String getQueueName() {
        return this.queueName;
    }
    
    public void setQueueName(final String pQueueName) {
        this.queueName = pQueueName;
    }
    
    public String getQueueOffice() {
        return this.queueOffice;
    }
    
    public void setQueueOffice(final String pQueueOffice) {
        this.queueOffice = pQueueOffice;
    }
    
    public LMSException(final List<CodeMessage> pCodeMessages, final Integer pStatus, final Throwable pThrowable) {
    	
    	super(pThrowable);
        this.setCodeMessages(pCodeMessages);
        this.setStatus(pStatus);

    }
    // LMSC-11111 UIS158 End
	/**
	 * @return the fsuStatusType
	 */
	public String getFsuStatusType() {
		return fsuStatusType;
	}
	/**
	 * @param fsuStatusType the fsuStatusType to set
	 */
	public void setFsuStatusType(String fsuStatusType) {
		this.fsuStatusType = fsuStatusType;
	}
	/**
	 * @return the awbNumber
	 */
	public String getAwbNumber() {
		return awbNumber;
	}
	/**
	 * @param awbNumber the awbNumber to set
	 */
	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}
	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
}
