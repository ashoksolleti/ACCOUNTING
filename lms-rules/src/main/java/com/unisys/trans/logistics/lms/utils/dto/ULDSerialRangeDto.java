/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <code>ULDSerialRangeDto</code> contains beginning Serial Value ,ending Serial Value and weight of empty
 * ULD.
 * <p>
 * <code>ULDSerialRangeDto</code> contains the following attributes:
 * <ul>
 * <li><code>endRange
 * <li>startRange
 * <li>tareWeight
 * <li>uldPrefixOId
 * <li>oId
 * </code>
 * </ul>
 */
public class ULDSerialRangeDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8419335696381204237L;

    /**
     * Attribute to hold <code>endRange</code> property.
     * <p>
     * Ending serial range Value.
     */
    private String endRange;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key for the UldSerialRange entity.
     */
    private Long oId;

    /**
     * Attribute to hold <code>startRange</code> property.
     * <p>
     * Beginning serial range value.
     */
    private String startRange;

    /**
     * Attribute to hold <code>tareWeight</code> property.
     * <p>
     * Weight of empty ULD.
     */
    private BigDecimal tareWeight;

    /**
     * Attribute to hold <code>ULDPREFIX_OID</code> property.
     */
    private Long uldPrefixOId;

    /**
     * <code>Default Constructor</code>.
     */
    public ULDSerialRangeDto() {

    }

    /**
     * Gets the <code>endRange</code> property.
     * <p>
     * Ending Serial Value. Ending Serial Value.
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ULD_SERIAL_NUMBER_INDICATOR
     * ULD_SERIAL_NUMBER_INDICATOR} parameter) must be set to Y. In this case the length of the field can only
     * be 4 with first character being an alphabet followed by 3 numerals.
     * <p>
     * <b>Format: </b><br>
     * 4-5 Alphanumeric.
     * <p>
     * <b>Example: </b><br>
     * 9999, A9999, 12345
     * <p>
     * 
     * @return the current value of the <code>endRange</code> property.
     */
    public String getEndRange() {
        return this.endRange;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>startRange</code> property.
     * <p>
     * Beginning Serial Value. An Alphanumeric character is allowed in the first position the serial value
     * range based on system level parameter. The parameter
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ULD_SERIAL_NUMBER_INDICATOR
     * ULD_SERIAL_NUMBER_INDICATOR} should must be set to Y to allow the first character of serial value range
     * to be alphanumeric.
     * <p>
     * <b>Format: </b><br>
     * 4-5 alpha numeric.<br>
     * <b>Example: </b><br>
     * 1111, A0001, 00000 <br>
     * 
     * @return the current value of the <code>startRange</code> property.
     */
    public String getStartRange() {
        return this.startRange;
    }

    /**
     * Gets the <code>tareWeight</code> property.
     * <p>
     * Weight of empty ULD.
     * <p>
     * <b>Format: </b><br>
     * 7.1 F
     * <p>
     * <b>Example: </b><br>
     * 999999.9
     * <p>
     * 
     * @return the current value of the <code>tareWeight</code> property.
     */
    public BigDecimal getTareWeight() {
        return this.tareWeight;
    }

    /**
     * Gets the <code>uldPrefixOId</code> property.
     * <p>
     * 
     * @return the current value of the <code>uldPrefixOId</code> property.
     */
    public Long getUldPrefixOId() {
        return this.uldPrefixOId;
    }

    /**
     * Sets the <code>endRange</code> property.
     * <p>
     * Ending Serial Value.
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ULD_SERIAL_NUMBER_INDICATOR
     * ULD_SERIAL_NUMBER_INDICATOR} parameter) must be set to Y. In this case the length of the field can only
     * be 4 with first character being an alphabet followed by 3 numerals.
     * <p>
     * <b>Format: </b><br>
     * 4-5 Alphanumeric.
     * <p>
     * <b>Example: </b><br>
     * 9999, A9999, 12345
     * <p>
     * 
     * @param pEndRange the new value of the <code>endRange</code> property.
     */
    public void setEndRange(final String pEndRange) {
        this.endRange = ContractUtility.convertToUpperCase(pEndRange);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pId the new value of the <code>oId</code>.
     */
    public void setOId(final Long pId) {
        this.oId = pId;
    }

    /**
     * Sets the <code>startRange</code> property.
     * <p>
     * Beginning Serial Value. An Alphanumeric character is allowed in the first position the serial value
     * range based on system level parameter. The parameter
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ULD_SERIAL_NUMBER_INDICATOR
     * ULD_SERIAL_NUMBER_INDICATOR} should must be set to Y to allow the first character of serial value range
     * to be alphanumeric.
     * <p>
     * <b>Format: </b><br>
     * 4-5 alpha numeric.<br>
     * <b>Example: </b><br>
     * 1111, A0001, 00000
     * <p>
     * 
     * @param pStartRange the new value of the <code>startRange</code> property.
     */
    public void setStartRange(final String pStartRange) {
        this.startRange = ContractUtility.convertToUpperCase(pStartRange);
    }

    /**
     * Sets the <code>tareWeight</code>.
     * <p>
     * Weight of empty ULD.
     * <p>
     * <b>Format: </b><br>
     * 7.1 F
     * <p>
     * <b>Example: </b><br>
     * 999999.9
     * <p>
     * 
     * @param pTareWeight the new value of the <code>tareWeight</code> property.
     */
    public void setTareWeight(final BigDecimal pTareWeight) {
        this.tareWeight = pTareWeight;
    }

    /**
     * Sets the <code>uldPrefixOId</code> property.
     * <p>
     * 
     * @param pUldPrefixOId the new value of the <code>uldPrefixOId</code> property.
     */
    public void setUldPrefixOId(final Long pUldPrefixOId) {
        this.uldPrefixOId = pUldPrefixOId;
    }

}
