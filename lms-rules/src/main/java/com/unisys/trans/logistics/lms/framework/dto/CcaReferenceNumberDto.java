package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

/**
 * <code>CcaReferenceNumberDto</code> contain details of CargoCorrectionAdviseDto.
 * <p>
 * This contains all information about CargoCorrectionAdviseDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>prefix
 * <li>serialNumber
 * </ul>
 */
public class CcaReferenceNumberDto implements Serializable {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>airlineCodeNbr</code> property.
     */
    private String prefix;

    /**
     * Attribute to hold <code>reference number</code> property.
     */
    private String serialNumber;
    /**
     * Gets the <code>prefix</code> property.
     * <p>
     * 
     * @return the current value of <code>prefix</code> property.<br>
     */
    public String getPrefix() {
        return this.prefix;
    }
    /**
     * Gets the <code>serialNumber</code> property.
     * <p>
     * 
     * @return the current value of <code>serialNumber</code> property.<br>
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * Sets the <code>prefix</code> property.
     * <p>
     * 
     * @param pPrefix
     *            the new value of <code>prefix</code> property.<br>
     */
    public void setPrefix(final String pPrefix) {
        this.prefix = pPrefix;
    }
    /**
     * Sets the <code>serialNumber</code> property.
     * <p>
     * 
     * @param pSerialNumber
     *            the new value of <code>serialNumber</code> property.<br>
     */
    public void setSerialNumber(final String pSerialNumber) {
        this.serialNumber = pSerialNumber;
    }

    @Override
    public String toString() {
        final StringBuilder awbNumber = new StringBuilder();

        if (this.prefix != null && this.serialNumber != null) {
            awbNumber.append(this.prefix + "-C" + this.serialNumber);
        }
        return awbNumber.toString();
    }
}
