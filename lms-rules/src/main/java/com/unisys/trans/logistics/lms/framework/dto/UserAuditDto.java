package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>UserAudit</code> domain contains the details of logged in User.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>associatedOffice
 * <li>associatedStation
 * <li>createdOn
 * <li>userIdentifier
 * </ul>
 */
public class UserAuditDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 9142758463234782202L;

    /**
     * Attribute to hold <code>associatedOffice</code> property.<br>
     * Office associated with the user who created/updated ParticipantRemark.
     */
    private String associatedOffice;

    /**
     * Attribute to hold <code>associatedStation</code> property.<br>
     * Station associated with the user who created/updated ParticipantRemark.
     */
    private String associatedStation;

    /**
     * Attribute to hold <code>createdOn</code> property.<br>
     * Date on which Participant remark is created/updated ParticipantRemark.
     */
    private Date createdOn;

    /**
     * Attribute to hold <code>userIdentifier</code> property.<br>
     * Unique identifier for User who created/updated ParticipantRemark.
     */
    private String userIdentifier;

    /**
     * Gets the <code>associatedOffice</code> property.
     * <p>
     * <b>Example: </b><br>
     * ORD
     * <p>
     * 
     * @return the current value of the <code>associatedOffice</code> property.
     */
    public String getAssociatedOffice() {
        return this.associatedOffice;
    }

    /**
     * Gets the <code>associatedStation</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 or 5 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>associatedStation</code> property.
     */
    public String getAssociatedStation() {
        return this.associatedStation;
    }

    /**
     * Gets the <code>createdOn</code> property.
     * <p>
     * <b>Format: </b><br>
     * <p>
     * Date <b>Example: </b><br>
     * 01Jan2012
     * <p>
     * 
     * @return the current value of the <code>createdOn</code> property.
     */
    public Date getCreatedOn() {
        return ContractUtility.getClonedDate(this.createdOn);
    }

    /**
     * Gets the <code>userIdentifier</code> property.
     * <p>
     * <b>Example: </b><br>
     * testUser
     * <p>
     * 
     * @return the current value of the <code>userIdentifier</code> property.
     */
    public String getUserIdentifier() {
        return this.userIdentifier;
    }

    /**
     * Sets the <code>associatedOffice</code> property.
     * <p>
     * <b>Example: </b><br>
     * ORD
     * <p>
     * 
     * @param pAssociatedOffice
     *            the new value of the <code>associatedOffice</code> property.
     */
    public void setAssociatedOffice(final String pAssociatedOffice) {
        this.associatedOffice = ContractUtility.convertToUpperCase(pAssociatedOffice);
    }

    /**
     * Sets the <code>associatedStation</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 or 5 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pAssociatedStation
     *            the new value of the <code>associatedStation</code> property.
     */
    public void setAssociatedStation(final String pAssociatedStation) {
        this.associatedStation = ContractUtility.convertToUpperCase(pAssociatedStation);
    }

    /**
     * Sets the <code>createdOn</code> property.
     * <p>
     * <b>Format: </b><br>
     * <p>
     * Date <b>Example: </b><br>
     * 01Jan2012
     * <p>
     * 
     * @param pCreatedOn
     *            the new value of the <code>createdOn</code> property.
     */
    public void setCreatedOn(final Date pCreatedOn) {
        this.createdOn = ContractUtility.getClonedDate(pCreatedOn);
    }

    /**
     * Sets the <code>userIdentifier</code> property.
     * <p>
     * <b>Example: </b><br>
     * testUser
     * <p>
     * 
     * @param pUserIdentifier
     *            the new value of the <code>userIdentifier</code> property.
     */
    public void setUserIdentifier(final String pUserIdentifier) {
        this.userIdentifier = pUserIdentifier;
    }
}
