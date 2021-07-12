/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>HistoryResponse</code> contains the response of all the request received by
 * <code>HistoryService</code> for maintaining History.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <code>
 * <li>history
 * </code>
 * </ul>
 */
public class HistoryResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5739742713350497373L;

    // As per NG standards,elements are added one by one to the assembler which eliminates the usage of a
    // setter method and thus,it is replaced by the 'addHistory' method.

    /**
     * Holds collection of <code>HistoryDto</code> object.
     */
    private final List<HistoryDto> history = new ArrayList<HistoryDto>(); // NOPMD

    /**
     * <code>Default constructor.</code>
     */
    public HistoryResponse() {

    }

    /**
     * This method is used for adding the <code>HistoryDto</code> objects while assembling
     * <code>HistoryDto</code> objects to the response.
     * <p>
     * 
     * @param pHistoryDto the new value of <code>HistoryDto</code> property.
     */
    public void addHistory(final HistoryDto pHistoryDto) {
        this.history.add(pHistoryDto);
    }

    /**
     * Gets the <code>history</code> property.
     * <p>
     * 
     * @return the current value of <code>history</code> property.
     */
    public List<HistoryDto> getHistories() {
        return this.history;
    }

}
