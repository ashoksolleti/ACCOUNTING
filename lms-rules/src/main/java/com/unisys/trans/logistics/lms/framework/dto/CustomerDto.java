package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.dto.ContactDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;


public class CustomerDto extends PersistenceObjectDto implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 7306530742755438419L;

    /**
     * Attribute to holds <code>accountNumber</code> property.
     */
    private String accountNumber1;

    /**
     * Attribute to holds <code>accountNumber</code> property.
     */
    private String accountNumber2;

    /**
     * Attribute to holds <code>contactDetails</code> property.
     */
    private ContactDto contactDetails;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to holds <code>participantRemarks</code> property.
     */
    private String participantRemarks;

    /**
     * Attribute to holds <code>station</code> property.
     */
    private String station;

    /**
     * Gets the <code>accountNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>accountNumber</code> property.<br>
     */
    public String getAccountNumber1() {
        return this.accountNumber1;
    }

    /**
     * Gets the <code>accountNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>accountNumber</code> property.<br>
     */
    public String getAccountNumber2() {
        return this.accountNumber2;
    }

    /**
     * Gets the <code>contactDetails</code> property.
     * <p>
     * 
     * @return the current value of the <code>contactDetails</code> property.<br>
     */
    public ContactDto getContactDetails() {
        return this.contactDetails;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */

    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>participantRemarks</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantRemarks</code> property.<br>
     */
    public String getParticipantRemarks() {
        return this.participantRemarks;
    }

    /**
     * Gets the <code>station</code> property.
     * <p>
     * 
     * @return the current value of the <code>station</code> property.<br>
     */
    public String getStation() {
        return this.station;
    }

    /**
     * Sets the <code>accountNumber</code> property.
     * <p>
     * 
     * @param pAccountNumber
     *            the new value of the <code>accountNumber</code> property.
     */
    public void setAccountNumber1(final String pAccountNumber1) {
        this.accountNumber1 = pAccountNumber1;
    }

    /**
     * Sets the <code>accountNumber</code> property.
     * <p>
     * 
     * @param pAccountNumber
     *            the new value of the <code>accountNumber</code> property.
     */
    public void setAccountNumber2(final String pAccountNumber2) {
        this.accountNumber2 = pAccountNumber2;
    }

    /**
     * Sets the <code>contactDetails</code> property.
     * <p>
     * 
     * @param pContactDetails
     *            the new value of the <code>contactDetails</code> property.
     */
    public void setContactDetails(final ContactDto pContactDetails) {
        this.contactDetails = pContactDetails;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            holds the new value of <code>oId</code>.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>participantRemarks</code> property.
     * <p>
     * 
     * @param pParticipantRemarks
     *            the new value of the <code>participantRemarks</code> property.
     */
    public void setParticipantRemarks(final String pParticipantRemarks) {
        this.participantRemarks = pParticipantRemarks;
    }

    /**
     * Sets the <code>station</code> property.
     * <p>
     * 
     * @param pStation
     *            the new value of the <code>station</code> property.
     */
    public void setStation(final String pStation) {
        this.station = pStation;
    }
}
