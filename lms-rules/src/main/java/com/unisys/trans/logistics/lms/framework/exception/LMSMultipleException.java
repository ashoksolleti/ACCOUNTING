/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.exception;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

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
public class LMSMultipleException extends LMSException {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4843345234713512782L;

    /**
     * Attribute to hold the list of <code>CodeMessage</code> object.
     */
    private PersistenceObjectDto pObjectDto;

    /**
     * Default Constructor.
     */
    public LMSMultipleException() {

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
     * @param pObjectDto
     *            holds the {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto}
     *            PersistenceObjectDto.
     */
    public LMSMultipleException(final List<CodeMessage> pCodeMessages, final Integer pStatus,
                final PersistenceObjectDto pObjectDto) {

        super.setCodeMessages(pCodeMessages);
        super.setStatus(pStatus);
        this.setpObjectDto(pObjectDto);

    }

    /**
     * Gets the <code>pObjectDto</code> property.
     * <p>
     * 
     * @return the current value of <code>pObjectDto</code> property.
     */
    public PersistenceObjectDto getpObjectDto() {
        return this.pObjectDto;
    }

    /**
     * Sets the<code>pObjectDto</code>property.
     * <p>
     * 
     * @param pObjectDto the current value of <code>pObjectDto</code> property.
     */
    public void setpObjectDto(final PersistenceObjectDto pObjectDto) {
        this.pObjectDto = pObjectDto;
    }
    private List<? extends PersistenceObjectDto> theObjectDtos;

    /**
     * @return the theObjectDtos
     */
    public List<? extends PersistenceObjectDto> getTheObjectDtos() {
        return this.theObjectDtos;
    }

    
    /**
     * @param theObjectDtos the theObjectDtos to set
     */
    public void setTheObjectDtos(final List<? extends PersistenceObjectDto> pObjectDtos) {
        this.theObjectDtos = pObjectDtos;
    }
    
    public LMSMultipleException(final List<CodeMessage> pCodeMessages, final Integer pStatus,
                final List<? extends PersistenceObjectDto> pObjectDtos) {

        super.setCodeMessages(pCodeMessages);
        super.setStatus(pStatus);
        this.setTheObjectDtos(pObjectDtos);

    }
}
