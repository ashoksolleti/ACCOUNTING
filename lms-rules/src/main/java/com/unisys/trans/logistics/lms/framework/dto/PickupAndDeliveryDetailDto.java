package com.unisys.trans.logistics.lms.framework.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>PickupAndDeliveryDetailDto </code> contains specific data applicable to
 * Maintain Drivers for pickup and delivery shipments.
 * 
 * <p>
 * This contains the following attributes: actionDate, driverName, email, oId, status and phoneNumber.
 */
public class PickupAndDeliveryDetailDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2335074597575377388L;

    /**
     * Attribute to hold <code>actionDate</code> property.
     */
    private Date actionDate;

    /**
     * Attribute to hold <code>driverName</code> property.
     */
    private String driverName;

    /**
     * Attribute to hold <code>email</code> property.
     */
    private String email;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>phoneNumber</code> property.
     */
    private String phoneNumber;

    /**
     * Attribute to hold <code>status</code> property.
     */
    private String status;

    /**
     * <code>Default constructor</code>.
     */
    public PickupAndDeliveryDetailDto() {

    }

    /**
     * Gets the <code>actionDate</code> property.
     * 
     * @return the current value of <code>actionDate</code> property.
     */
    public Date getActionDate() {
        return ContractUtility.getClonedDate(this.actionDate);
    }

    /**
     * Gets the <code>driverName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric characters.
     * <p>
     * 
     * @return the current value of <code>driverName</code> property.
     */
    public String getDriverName() {
        return this.driverName;
    }

    /**
     * Gets the <code>email</code> property.
     * <p>
     * <b>Format: </b> <br>
     * 1-45 Alphanumeric characters.
     * <p>
     * 
     * @return the current value of <code>email</code> property.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>DriverInformationDto</code>. It is of type Long.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    @Override
    public Long getOId() {

        return this.oId;
    }

    /**
     * Gets the <code>phoneNumber</code> property.
     * <p>
     * <b>Format: </b> <br>
     * 1-25 Numeric characters.
     * <p>
     * 
     * @return the current value of <code>phoneNumber</code> property.
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Gets the <code>status</code> property.
     * 
     * @return the current value of <code>status</code> property.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Sets the <code>actionDate</code> property.
     * 
     * @param pActionDate the new value of <code>actionDate</code> property.<br>
     */
    public void setActionDate(final Date pActionDate) {
        this.actionDate = ContractUtility.getClonedDate(pActionDate);
    }

    /**
     * Sets the <code>driverName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric characters.
     * <p>
     * 
     * @param pDriverName the new value of <code>driverName</code> property.<br>
     */
    public void setDriverName(final String pDriverName) {
        this.driverName = pDriverName;
    }

    /**
     * Sets the <code>email</code> property.
     * <p>
     * <b>Format: </b> <br>
     * 1-45 Alphanumeric characters.
     * <p>
     * 
     * @param pEmail the new value of <code>email</code> property.<br>
     */
    public void setEmail(final String pEmail) {
        this.email = pEmail;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>DriverInformationDto</code>. It is of type Long.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>phoneNumber</code> property.
     * <p>
     * <b>Format: </b> <br>
     * 1-25 Numeric characters.
     * <p>
     * 
     * @param pPhoneNumber the new value of <code>phoneNumber</code> property.<br>
     */
    public void setPhoneNumber(final String pPhoneNumber) {
        this.phoneNumber = pPhoneNumber;
    }

    /**
     * Sets the <code>status</code> property.
     * 
     * @param pStatus the new value of <code>status</code> property.<br>
     */
    public void setStatus(final String pStatus) {
        this.status = pStatus;
    }

}
