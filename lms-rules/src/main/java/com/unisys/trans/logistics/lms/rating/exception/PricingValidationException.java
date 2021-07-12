/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.exception;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;

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
public class PricingValidationException extends LMSException {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4843745678713512782L;

    /**
     * Attribute to hold the list of <code>CodeMessage</code> object.
     */
    private List<RatingCodeMessage> ratingCodeMessages;

    /**
     * Default Constructor.
     */
    public PricingValidationException() {

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
    public PricingValidationException(final List<RatingCodeMessage> pRatingCodeMessages, final Integer pStatus) {

        this.setRatingCodeMessages(pRatingCodeMessages);
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
    public List<RatingCodeMessage> getRatingCodeMessages() {
        return this.ratingCodeMessages;
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
    protected void setRatingCodeMessages(final List<RatingCodeMessage> pRatingCodeMessages) {
        this.ratingCodeMessages = pRatingCodeMessages;
    }

}
