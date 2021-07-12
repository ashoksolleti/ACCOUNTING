package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AirWaybillEventDto</code>is used for find AirWaybill Event information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>arrivalDate</li>
 * <li>deliveryDateTime</li>
 * <li>executionDate</li>
 * <li>lastAcceptanceDateTime</li>
 * <li>notificationDateTime</li>
 * <li>pricingDate</li>
 * <li>timeOfAvailabilityDateTime</li>
 * <li>awbLockedDateTime</li>
 * <li>eqaCompletedDate</li>
 * <li>eqaCompletedTime</li>
 * </code>
 * </ul>
 */
public class AWBKeyDatesDto implements Serializable {

    /**
     * Unique Serial version UID.
     */
    private static final long serialVersionUID = 462054043780113075L;

    /**
     * Attribute to hold the <code>arrivalDate</code> property.
     */
    private Date arrivalDate;

    /**
     * Attribute to holds <code>awbLockedDateTime</code> property.
     */
    private Date awbLockedDateTime;

    /**
     * Attribute to hold the <code>dateofCheckIn</code> property.
     */
    private Date dateofCheckIn;

    /**
     * Attribute to holds <code>deliveryDateTime</code> property.
     */
    private Date deliveryDateTime;

    /**
     * Attribute to hold the <code>deliveryTime</code> property.
     */
    private String deliveryTime;

    /**
     * Attribute to holds <code>earlistTravelDate</code> property.
     */
    private Date earlistTravelDate;

    /**
     * Attribute to holds <code>eqaCompletedDate</code> property.
     */
    private Date eqaCompletedDate;

    /**
     * Attribute to holds <code>eqaCompletedTime</code> property.
     */
    private String eqaCompletedTime;

    /**
     * Attribute to holds <code>executionDate</code> property.
     */
    private Date executionDate;

    /**
     * Attribute to holds <code>latestAcceptanceDateTime</code> property.
     */
    private Date latestAcceptanceDateTime;

    /**
     * Attribute to hold the <code>latestAcceptanceTime</code> property.
     */
    private String latestAcceptanceTime;

    /**
     * Attribute to holds <code>notificationDateTime</code> property.
     */
    private Date notificationDateTime;

    /**
     * Attribute to holds <code>pickupDateTime</code> property.
     */
    private Date pickupDateTime;

    /**
     * Attribute to hold the <code>pickupTime</code> property.
     */
    private String pickupTime;

    /**
     * Attribute to holds <code>pricingDate</code> property.
     */
    private Date pricingDate;

    /**
     * Attribute to holds <code>timeOfAvailabilityDateTime</code> property.
     */
    private Date timeOfAvailabilityDateTime;

    /**
     * Attribute to hold the <code>timeOfAvailabilityTime</code> property.
     */
    private String timeOfAvailabilityTime;
    
    /**
     * Attribute to hold the <code>deletionDateTime</code> property.
     */
    private Date deletionDateTime;

	/**
	 * Attribute to hold the <code>deletionDateTime</code> property.
	 */
	private Date storageChargesStartDate;

    /**
     * Gets the <code>deletionDateTime</code> property.
     * 
     * @return the deletionDateTime
     */
    public Date getDeletionDateTime() {
		return ContractUtility.getClonedDate(this.deletionDateTime);
	}

	/**
     * Gets the <code>arrivalDate</code> property.
     * 
     * @return the arrivalDate
     */
    public Date getArrivalDate() {
        return ContractUtility.getClonedDate(this.arrivalDate);
    }

    /**
     * Gets the <code>awbLockedDateTime</code> property.
     * <p>
     * 
     * @return the current value of <code>awbLockedDateTime</code> property.
     */

    public Date getAwbLockedDateTime() {
        return ContractUtility.getClonedDate(this.awbLockedDateTime);
    }

    /**
     * Gets the <code>dateofCheckIn</code> property.
     * <p>
     * 
     * @return the current value of the <code>dateofCheckIn</code> property.
     */
    public Date getDateofCheckIn() {
        return ContractUtility.getClonedDate(this.dateofCheckIn);
    }

    /**
     * Gets the <code>deliveryDateTime</code> property.
     * 
     * @return the deliveryDateTime
     */
    public Date getDeliveryDateTime() {
        return ContractUtility.getClonedDate(this.deliveryDateTime);
    }

    /**
     * Gets the <code>deliveryTime</code> property.
     * 
     * @return the deliveryTime
     */
    public String getDeliveryTime() {
        return this.deliveryTime;
    }

    /**
     * Gets the <code>EarlistTravelDate</code> property.
     * 
     * @return the earlistTravelDate
     */
    public Date getEarlistTravelDate() {
        return ContractUtility.getClonedDate(this.earlistTravelDate);
    }

    /**
     * Gets the <code>eqaCompletedDate</code> property.
     * 
     * @return the eqaCompletedDate
     */
    public Date getEqaCompletedDate() {
        return ContractUtility.getClonedDate(this.eqaCompletedDate);
    }

    /**
     * Gets the <code>eqaCompletedTime</code> property.
     * 
     * @return the eqaCompletedTime
     */
    public String getEqaCompletedTime() {
        return this.eqaCompletedTime;
    }

    /**
     * Gets the <code>executionDate</code> property.
     * 
     * @return the executionDate
     */
    public Date getExecutionDate() {
        return ContractUtility.getClonedDate(this.executionDate);
    }

    /**
     * Gets the <code>latestAcceptanceDateTime</code> property.
     * 
     * @return the latestAcceptanceDateTime
     */
    public Date getLatestAcceptanceDateTime() {
        return ContractUtility.getClonedDate(this.latestAcceptanceDateTime);
    }

    /**
     * Gets the <code>latestAcceptanceTime</code> property.
     * <p>
     * 
     * @return the current value of <code>latestAcceptanceTime</code> property.
     */
    public String getLatestAcceptanceTime() {
        return this.latestAcceptanceTime;
    }

    /**
     * Gets the <code>notificationDateTime</code> property.
     * 
     * @return the notificationDateTime
     */
    public Date getNotificationDateTime() {
        return ContractUtility.getClonedDate(this.notificationDateTime);
    }

    /**
     * Gets the <code>pickupDateTime</code> property.
     * 
     * @return the pickupDateTime
     */
    public Date getPickupDateTime() {
        return ContractUtility.getClonedDate(this.pickupDateTime);
    }

    /**
     * Gets the <code>pickupTime</code> property.
     * <p>
     * 
     * @return the current value of <code>pickupTime</code> property.
     */
    public String getPickupTime() {
        return this.pickupTime;
    }

    /**
     * Gets the <code>pricingDate</code> property.
     * 
     * @return the pricingDate
     */
    public Date getPricingDate() {
        return ContractUtility.getClonedDate(this.pricingDate);
    }

    /**
     * Gets the <code>timeOfAvailabilityDateTime</code> property.
     * 
     * @return the timeOfAvailabilityDateTime
     */
    public Date getTimeOfAvailabilityDateTime() {
        return ContractUtility.getClonedDate(this.timeOfAvailabilityDateTime);
    }

    /**
     * Gets the <code>timeOfAvailabilityTime</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>timeOfAvailabilityTime</code> property.
     */
    public String getTimeOfAvailabilityTime() {
        return this.timeOfAvailabilityTime;
    }

    /**
     * Sets the <code>pDeletionDateTime</code>.
     * <p>
     * 
     * @param pDeletionDateTime
     *            holds the new value of <code>pDeletionDateTime</code>
     */
	public void setDeletionDateTime(final Date pDeletionDateTime) {
		this.deletionDateTime = ContractUtility.getClonedDate(pDeletionDateTime);
	}

    /**
     * Sets the <code>arrivalDate</code> property.
     * 
     * @param pArrivalDate the arrivalDate to set
     */
    public void setArrivalDate(final Date pArrivalDate) {
        this.arrivalDate = ContractUtility.getClonedDate(pArrivalDate);
    }

    /**
     * Sets the <code>awbLockedDateTime</code> property.
     * <p>
     * <b>Format:</b><br>
     * Date
     * 
     * @param pAwbLockedDateTime
     *            the new value of the <code>awbLockedDateTime</code> property.
     */

    public void setAwbLockedDateTime(final Date pAwbLockedDateTime) {
        this.awbLockedDateTime = ContractUtility.getClonedDate(pAwbLockedDateTime);
    }

    /**
     * Sets the <code>pDateofCheckIn</code>.
     * <p>
     * 
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pDateofCheckIn</code>
     */
    public void setDateofCheckIn(final Date pDateofCheckIn) {
        this.dateofCheckIn = ContractUtility.getClonedDate(pDateofCheckIn);
    }

    /**
     * Sets the <code>deliveryDateTime</code> property.
     * <p>
     * 
     * @param pDeliveryDateTime
     *            the new value of <code>deliveryDateTime</code> property.
     */
    public void setDeliveryDateTime(final Date pDeliveryDateTime) {
        this.deliveryDateTime = ContractUtility.getClonedDate(pDeliveryDateTime);
    }

    /**
     * Sets the <code>deliveryTime</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pDeliveryTime
     *            the new value of <code>deliveryTime</code> property.
     */
    public void setDeliveryTime(final String pDeliveryTime) {
        this.deliveryTime = pDeliveryTime;
    }

    /**
     * Sets the <code>EarlistTravelDate</code> property.
     * <p>
     * 
     * @param pEarlistTravelDate
     *            the new value of <code>EarlistTravelDate</code> property.
     */
    public void setEarlistTravelDate(final Date pEarlistTravelDate) {
        this.earlistTravelDate = ContractUtility.getClonedDate(pEarlistTravelDate);
    }

    /**
     * Sets the <code>eqaCompletedDate</code> property.
     * <p>
     * <b>Format:</b><br>
     * Date
     * 
     * @param eqaCompletedDate the eqaCompletedDate to set
     */
    public void setEqaCompletedDate(final Date pEqaCompletedDate) {
        this.eqaCompletedDate = ContractUtility.getClonedDate(pEqaCompletedDate);
    }

    /**
     * Sets the <code>eqaCompletedTime</code> property.
     * <p>
     * <b>Format:</b><br>
     * Time
     * 
     * @param eqaCompletedTime the eqaCompletedTime to set
     */
    public void setEqaCompletedTime(final String pEqaCompletedTime) {
        this.eqaCompletedTime = pEqaCompletedTime;
    }

    /**
     * Sets the <code>executionDate</code> property.
     * <p>
     * 
     * @param pExecutionDate
     *            the new value of <code>executionDate</code> property.
     */
    public void setExecutionDate(final Date pExecutionDate) {
        this.executionDate = ContractUtility.getClonedDate(pExecutionDate);
    }

    /**
     * Sets the <code>latestAcceptanceDateTime</code> property.
     * <p>
     * 
     * @param pLatestAcceptanceDateTime
     *            the new value of <code>latestAcceptanceDateTime</code> property.
     */
    public void setLatestAcceptanceDateTime(final Date pLatestAcceptanceDateTime) {
        this.latestAcceptanceDateTime = ContractUtility.getClonedDate(pLatestAcceptanceDateTime);
    }

    /**
     * Sets the <code>latestAcceptanceTime</code> property.
     * <p>
     * 
     * @param pLatestAcceptanceTime
     *            the new value of <code>latestAcceptanceTime</code> property.
     */
    public void setLatestAcceptanceTime(final String pLatestAcceptanceTime) {
        this.latestAcceptanceTime = pLatestAcceptanceTime;
    }

    /**
     * Sets the <code>notificationDateTime</code> property.
     * <p>
     * 
     * @param pNotificationDateTime
     *            the new value of <code>notificationDateTime</code> property.
     */
    public void setNotificationDateTime(final Date pNotificationDateTime) {
        this.notificationDateTime = ContractUtility.getClonedDate(pNotificationDateTime);
    }

    /**
     * Sets the <code>pickupDateTime</code> property.
     * 
     * @param pPickupDateTime the pickupDateTime to set
     */
    public void setPickupDateTime(final Date pPickupDateTime) {
        this.pickupDateTime = ContractUtility.getClonedDate(pPickupDateTime);
    }

    /**
     * Sets the <code>pickupTime</code> have shipment pickup status and driver details.
     * 
     * @param pPickupTime
     *            the new value of <code>pickupTime</code> property.
     */
    public void setPickupTime(final String pPickupTime) {
        this.pickupTime = pPickupTime;
    }

    /**
     * Sets the <code>pricingDate</code> property.
     * <p>
     * 
     * @param pPricingDate
     *            the new value of <code>pricingDate</code> property.
     */
    public void setPricingDate(final Date pPricingDate) {
        this.pricingDate = ContractUtility.getClonedDate(pPricingDate);
    }

    /**
     * Sets the <code>timeOfAvailabilityDateTime</code> property.
     * <p>
     * 
     * @param pTimeOfAvailabilityDateTime
     *            the new value of <code>timeOfAvailabilityDateTime</code> property.
     */
    public void setTimeOfAvailabilityDateTime(final Date pTimeOfAvailabilityDateTime) {
        this.timeOfAvailabilityDateTime = ContractUtility.getClonedDate(pTimeOfAvailabilityDateTime);
    }

    /**
     * Sets the <code>timeOfAvailabilityTime</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pTimeOfAvailabilityTime
     *            the new value of <code>timeOfAvailabilityTime</code> property.
     */
    public void setTimeOfAvailabilityTime(final String pTimeOfAvailabilityTime) {
        this.timeOfAvailabilityTime = pTimeOfAvailabilityTime;
    }

	/**
	 * @return the storageChargesStartDate
	 */
	public Date getStorageChargesStartDate() {
		return this.storageChargesStartDate;
	}

	/**
	 * @param storageChargesStartDate
	 *            the storageChargesStartDate to set
	 */
	public void setStorageChargesStartDate(Date storageChargesStartDate) {
		this.storageChargesStartDate = storageChargesStartDate;
	}

}