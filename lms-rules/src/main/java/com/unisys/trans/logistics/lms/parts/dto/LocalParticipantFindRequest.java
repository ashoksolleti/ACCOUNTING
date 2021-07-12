package com.unisys.trans.logistics.lms.parts.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class LocalParticipantFindRequest extends AbstractRequest {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>lmsdatabaseKey</code> property.
     */
    private String lmsdatabaseKey;

    /**
     * Attribute to hold <code>updatedFromDate</code> property.
     */
    private Date updatedFromDate;

    /**
     * Attribute to hold <code>updatedToDate</code> property.
     */
    private Date updatedToDate;

    /**
     * Gets the <code>lmsdatabaseKey</code> property.
     * <p>
     * 
     * @return the current value of the <code>lmsdatabaseKey</code> property.
     */
    public String getLmsdatabaseKey() {
        return lmsdatabaseKey;
    }

    /**
     * Gets the <code>updatedFromDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>updatedFromDate</code> property.
     */
    public Date getUpdatedFromDate() {
        return updatedFromDate;
    }

    /**
     * Gets the <code>updatedToDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>updatedToDate</code> property.
     */
    public Date getUpdatedToDate() {
        return updatedToDate;
    }

    /**
     * Sets the <code>lmsdatabaseKey</code> property.
     * <p>
     * 
     * @param pLmsdatabaseKey
     *            the current value of the <code>lmsdatabaseKey</code> property.
     */
    public void setLmsdatabaseKey(String pLmsdatabaseKey) {
        this.lmsdatabaseKey = pLmsdatabaseKey;
    }

    /**
     * Sets the <code>updatedFromDate</code> property.
     * <p>
     * 
     * @param pUpdatedFromDate
     *            the current value of the <code>updatedFromDate</code> property.
     */
    public void setUpdatedFromDate(Date pUpdatedFromDate) {
        this.updatedFromDate = pUpdatedFromDate;
    }

    /**
     * Sets the <code>updatedToDate</code> property.
     * <p>
     * 
     * @param pUpdatedToDate
     *            the current value of the <code>updatedToDate</code> property.
     */
    public void setUpdatedToDate(Date pUpdatedToDate) {
        this.updatedToDate = pUpdatedToDate;
    }

}
