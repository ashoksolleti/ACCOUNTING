/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>TerminalAreaLocationResponse</code> contains the response of the maintenance request received by
 * <code>TerminalAreaLocationService</code>.
 * <p>
 * This has the following attributes:<br>
 * <code>
 * <ul>
 * <li>terminal
 * </ul>
 * </code>
 */
public class TerminalAreaLocationResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3311758500998864935L;

    /**
     * Attribute to hold <code>terminal</code> property.<br>
     */
    private TerminalDto terminal;

    /**
     * <code>Default constructor.</code>
     */
    public TerminalAreaLocationResponse() {

    }

    /**
     * Gets the <code>terminal</code> property.
     * <p>
     * 
     * @return the current value of the <code>terminal</code> property.
     */
    public TerminalDto getTerminal() {
        return this.terminal;
    }

    /**
     * Sets the <code>terminal</code> property.
     * <p>
     * 
     * @param pTerminalDto <br>
     *            the new value of the <code>terminal</code> property.
     *            </p>
     */
    public void setTerminal(final TerminalDto pTerminalDto) {
        this.terminal = pTerminalDto;
    }

}
