/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.exception;

import com.unisys.trans.logistics.lms.framework.constants.ExceptionType;
import com.unisys.trans.logistics.lms.framework.exception.CodeMessage;

/**
 * <code>RatingCodeMessage</code> holds the Map of Rating Line Number and List of Code Messages.
 * <p>
 * This class performs the following functions:
 * <ul>
 * <li>Gets the <code>ratingCodeMessage</code>.
 * <li>Sets the <code>ratingCodeMessage</code>.
 * </ul>
 */
public class RatingCodeMessage extends CodeMessage {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 666696234565428593L;

    /**
     * Attribute to hold the <code>ratingLineNo</code> property.
     */
    private Integer ratingLineNo;

    /**
     * Gets the <code>ratingLineNo</code> property.
     * <p>
     * 
     * @return the current value of the <code>code</code> property.
     */
    public Integer getRatingLineNo() {
        return this.ratingLineNo;
    }

    /**
     * Sets the <code>ratingLineNo</code> property.
     * <p>
     * 
     * @param pRatingLineNo the new value of the <code>ratingLineNo</code> property.
     */
    public void setRatingLineNo(final Integer pRatingLineNo) {
        this.ratingLineNo = pRatingLineNo;
    }

    public RatingCodeMessage() {
    }

    public RatingCodeMessage(final Integer pRatingLineNo, final CodeMessage pCodeMessage,
                final ExceptionType pExceptionType) {

        super.setCode(pCodeMessage.getCode());
        super.setMessage(pCodeMessage.getMessage());
        super.setType(pExceptionType);
        this.ratingLineNo = pRatingLineNo;
    }

    public RatingCodeMessage(final Integer pRatingLineNo, final CodeMessage pCodeMessage) {

        super.setCode(pCodeMessage.getCode());
        super.setMessage(pCodeMessage.getMessage());
        this.ratingLineNo = pRatingLineNo;
    }

}
