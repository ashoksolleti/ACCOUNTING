package com.unisys.trans.logistics.lms.framework.dto;

/**
 * <code>InterlineProrationSegmentDto</code> is used for find InterlineProrationSegment information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>multipleProrateInd
 * <li>oId
 * <li>prorationId
 * <li>prorationMethod
 * 
 * </ul>
 */

public class InterlineProrationSegmentDto extends ProrationSegmentDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2838314609613208084L;

    /**
     * Attribute to hold <code>multipleProrateInd</code> property.
     */
    private boolean multipleProrateInd;

    /**
     * Attribute to hold <code>multipleSpaIndicator</code> property.
     */
    private String multipleSpaIndicator;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oid;

    /**
     * Attribute to hold <code>prorationId</code> property.
     */

    private String prorationId;

    /**
     * Attribute to hold <code>prorationMethod</code> property.
     */

    private String prorationMethod;

    /**
     * Attribute to hold <code>revenueOid</code> property.
     */
    private Long revenueOid;

    /**
     * Gets the <code>revenueOid</code> property.
     * 
     * @return the current value of the <code>revenueOid</code> property.
     */
    public Long getRevenueOid() {
        return this.revenueOid;
    }

    /**
     * Sets the <code>revenueOid</code> property.
     * 
     * @param pRevenueOid
     *            the current value of the <code>revenueOid</code> property.
     */
    public void setRevenueOid(final Long pRevenueOid) {
        this.revenueOid = pRevenueOid;
    }

    /**
     * Gets the <code>multipleProrateInd</code> property.
     * 
     * @return the current value of the <code>multipleProrateInd</code> property.
     */
    public boolean getMultipleProrateInd() {
        return this.multipleProrateInd;
    }

    /**
     * Gets the <code>multipleSpaIndicator</code> property.
     * 
     * @return the current value of the <code>multipleSpaIndicator</code> property.
     */
    public String getMultipleSpaIndicator() {
        return this.multipleSpaIndicator;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>OId</code> property.
     */

    @Override
    public Long getOId() {
        return oid;
    }

    /**
     * Gets the <code>ProrationId</code> property.
     * <p>
     * 
     * @return the current value of the <code>ProrationId</code> property.
     */
    public String getProrationId() {
        return this.prorationId;
    }

    /**
     * Gets the <code>ProrationMethod</code> property.
     * <p>
     * 
     * @return the current value of the <code>ProrationMethod</code> property.
     */
    public String getProrationMethod() {
        return this.prorationMethod;
    }

    /**
     * Sets the <code>multipleProrateInd</code> property.
     * 
     * @param pMultipleProrateInd
     *            the current value of the <code>multipleProrateInd</code> property.
     */
    public void setMultipleProrateInd(final boolean pMultipleProrateInd) {
        multipleProrateInd = pMultipleProrateInd;
    }

    /**
     * Sets the <code>multipleSpaIndicator</code> property.
     * 
     * @param pMultipleSpaIndicator
     *            the current value of the <code>multipleSpaIndicator</code> property.
     */
    public void setMultipleSpaIndicator(final String pMultipleSpaIndicator) {
        multipleSpaIndicator = pMultipleSpaIndicator;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId
     *            holds the new value of <code>OId</code>.<br>
     */

    public void setOId(final Long pOId) {
        oid = pOId;
    }

    /**
     * Sets the <code>ProrationId</code> property.
     * <p>
     * 
     * @param pProrationId
     *            holds the new value of <code>ProrationId</code>.<br>
     */
    public void setProrationId(final String pProrationId) {
        prorationId = pProrationId;
    }

    /**
     * Sets the <code>ProrationMethod</code> property.
     * <p>
     * 
     * @param pProrationMethod
     *            holds the new value of <code>ProrationMethod</code>.<br>
     */
    public void setProrationMethod(final String pProrationMethod) {
        prorationMethod = pProrationMethod;
    }

}
