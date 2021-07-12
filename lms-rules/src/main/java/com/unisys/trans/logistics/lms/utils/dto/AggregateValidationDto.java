/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.AggregateType;

import java.io.Serializable;

/**
 * <code>AggregateValidation</code> contains specific data applicable to the aggregate validation.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>code</code></li>
 * <li><code>iataDefinedIndicator</code></li>
 * <li><code>type</code></li>
 * </ul>
 */
public class AggregateValidationDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6737329393393031789L;

    /**
     * Attribute to hold <code>code</code> property.
     */
    private String code;

    /**
     * Attribute to hold <code>iataDefinedIndicator</code> property.
     */
    private Boolean iataDefinedIndicator;

    /**
     * Attribute to hold <code>type</code> property.
     */
    private String type;

    /**
     * <code>Default constructor. </code>
     */
    public AggregateValidationDto() {

    }

    /**
     * <code>Overloaded constructor. </code>
     * 
     * @param pCode <code>Long</code><br>
     *            The new value of the code property.<br>
     *            pCode
     * @param pType <code>String</code><br>
     *            The new value of the type property.<br>
     */
    public AggregateValidationDto(final String pCode, final AggregateType pType) {
        this.code = pCode;
        this.type = pType.getCode();
        this.iataDefinedIndicator = true;
    }

    /**
     * <code>Overloaded constructor. </code>
     * 
     * @param pCode <code>Long</code><br>
     *            The new value of the code property.<br>
     *            pCode
     * @param pType <code>AggregateType</code><br>
     *            The new value of the code property.<br>
     *            pCode
     * @param pIdenticalCheckKey <code>Integer</code><br>
     *            The value of the pIdenticalCheckKey property.<br>
     */
    public AggregateValidationDto(final String pCode, final AggregateType pType,
                final Integer pIdenticalCheckKey) {
        this.code = pCode;
        this.type = pType.getCode();
        // if identical check key is present, it means it is custom defined
        if (pIdenticalCheckKey != null) {
            this.iataDefinedIndicator = false;
        }
    }

    /**
     * Gets the value of the <code>code</code> property.
     * <p>
     * 
     * @return <code>String</code>.<br>
     *         Returns the <code>code</code>.<br>
     *         </p>
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Gets the value of the <code>iataDefinedIndicator</code> property.
     * <p>
     * 
     * @return <code>Boolean</code>.<br>
     *         Returns the <code>iataDefinedIndicator</code> of the aggregate.<br>
     *         </p>
     */
    public Boolean getIataDefinedIndicator() {
        return this.iataDefinedIndicator;
    }

    /**
     * Gets the value of the <code>type</code> property.
     * <p>
     * 
     * @return <code>String</code>.<br>
     *         Returns the <code>type</code> of the country.<br>
     *         </p>
     */
    public String getType() {
        return this.type;
    }

    /**
     * Sets the value of the <code>code</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3N.1-2N.1-2N.1A<br>
     * <b>Example: </b><br>
     * 015.10.20N
     * 
     * @param pCode <code>String</code><br>
     *            The new value of the code property.<br>
     *            </p>
     */
    public void setCode(final String pCode) {
        this.code = ContractUtility.convertToUpperCase(pCode);
    }

    /**
     * Sets the value of the <code>iataDefinedIndicator</code> property.
     * <p>
     * 
     * @param pIataDefinedIndicator <code>Boolean</code><br>
     *            The new value of the iataDefinedIndicator property.<br>
     *            </p>
     */
    public void setIataDefinedIndicator(final Boolean pIataDefinedIndicator) {
        this.iataDefinedIndicator = pIataDefinedIndicator;
    }

    /**
     * Sets the value of the <code>type</code> property.
     * <p>
     * 
     * @param pType <code>String</code><br>
     *            The new value of the type property.<br>
     *            </p>
     */
    public void setType(final String pType) {
        this.type = pType;
    }

}
