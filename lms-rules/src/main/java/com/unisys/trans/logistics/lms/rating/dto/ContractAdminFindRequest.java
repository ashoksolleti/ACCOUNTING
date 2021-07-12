package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ContractAdminFindRequest</code> is used for finding <code>ContractAdmin</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>contractNumber
 * <li>participantAccountNumber
 * <li>oId
 * </ul>
 */
public class ContractAdminFindRequest extends AbstractRequest {

    /**
     * Default Serial Version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>contractNumber</code> property.
     */
    private String contractNumber;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>participantAccountNumber</code> property.
     */
    private String participantAccountNumber;
    
    /**
     * Attribute to hold <code>participantGroupInd</code> property.
     */
    private boolean participantGroupInd;

    /**
     * Gets the <code>contractNumber</code> property.
     * <p>
     * 
     * @return
     *         the new value of the <code>contractNumber</code> property.
     */
    public String getContractNumber() {
        return this.contractNumber;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return oId
     *         the new value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>participantAccountNumber</code> property.
     * <p>
     * 
     * @return
     *         participantAccountNumber
     *         the new value of the <code>participantAccountNumber</code> property.
     */
    public String getParticipantAccountNumber() {
        return this.participantAccountNumber;
    }

    /**
     * Sets the <code>contractNumber</code> property.
     * <p>
     * 
     * @param pContractNumber
     *            the new value of the <code>contractNumber</code> property.
     */
    public void setContractNumber(final String pContractNumber) {
        this.contractNumber = pContractNumber;
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

    /**
     * Sets the <code>ParticipantAccountNumber</code> property.
     * <p>
     * 
     * @param pParticipantAccountNumber
     *            the new value of the <code>pParticipantAccountNumber</code> property.
     */
    public void setParticipantAccountNumber(final String pParticipantAccountNumber) {
        this.participantAccountNumber = pParticipantAccountNumber;
    }

    /**
     * Gets the <code>participantGroupInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantGroupInd</code> property.
     */
    public boolean getParticipantGroupInd() {
        return this.participantGroupInd;
    }

    /**
     * Sets the <code>participantGroupInd</code> property.
     * <p>
     * 
     * @param pParticipantGroupInd
     *            the new value of the <code>participantGroupInd</code> property.
     */
    public void setParticipantGroupInd(final boolean pParticipantGroupInd) {
        this.participantGroupInd = pParticipantGroupInd;
    }
}
