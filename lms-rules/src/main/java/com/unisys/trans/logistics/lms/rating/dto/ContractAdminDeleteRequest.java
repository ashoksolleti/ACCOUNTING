package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ContractAdminDeleteRequest</code> is used for deleting <code>ContractAdmin</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>oId
 * </ul>
 */

public class ContractAdminDeleteRequest extends AbstractRequest {

    /**
     * Default serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>contactDto</code> property.
     */
    private Long oId;

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

}
