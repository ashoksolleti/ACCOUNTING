package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.util.Date;


import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class ShipmentStatusDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to holds <code>orderAcceptedDate</code> property.
     */
    private Date orderAcceptedDate;

    /**
     * Attribute to holds <code>orderAcceptedInd</code> property.
     */
    private boolean orderAcceptedInd;

    /**
     * Attribute to holds <code>orderCompletedDate</code> property.
     */
    private Date orderCompletedDate;

    /**
     * Attribute to holds <code>orderCompleteInd</code> property.
     */
    private boolean orderCompleteInd;

    /**
     * Attribute to holds <code>orderExecutedDate</code> property.
     */
    private Date orderExecutedDate;

    /**
     * Attribute to holds <code>orderExecutedInd</code> property.
     */
    private boolean orderExecutedInd;

    /**
     * Attribute to holds <code>orderExportedDate</code> property.
     */
    private Date orderExportedDate;

    /**
     * Attribute to holds <code>orderExportedInd</code> property.
     */
    private boolean orderExportedInd;

    /**
     * Attribute to holds <code>orderImportedDate</code> property.
     */
    private Date orderImportedDate;

    /**
     * Attribute to holds <code>orderImportedInd</code> property.
     */
    private boolean orderImportedInd;

    /**
     * Attribute to holds <code>preOrderDate</code> property.
     */
    private Date preOrderDate;

    /**
     * Attribute to holds <code>preOrderInd</code> property.
     */
    private boolean preOrderInd;
    
    /**
     * Attribute to holds <code>bookingExistsInd</code> property.
     */
    private boolean bookingExistsInd;
    
    private boolean bookedQuotedInd;
    
    /**
     * Attribute to holds <code>Quoted indicator</code> property.
     */
    private boolean quotedInd;

    public boolean isBookedQuotedInd() {
		return bookedQuotedInd;
	}

	public void setBookedQuotedInd(boolean pBookedQuotedInd) {
		this.bookedQuotedInd = pBookedQuotedInd;
	}

    /**
     * Gets the <code>orderAccepetedDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>orderAccepetedDate</code> property.
     */
    public Date getOrderAcceptedDate() {
        return ContractUtility.getClonedDate(this.orderAcceptedDate);
    }

    /**
     * Gets the <code>orderCompletedDate</code> property.
     * <p>
     * 
     * @return the current value of <code>orderCompletedDate</code> property.
     */
    public Date getOrderCompletedDate() {
        return ContractUtility.getClonedDate(this.orderCompletedDate);
    }

    /**
     * Gets the <code>orderExecutedDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>orderExecutedDate</code> property.
     */
    public Date getOrderExecutedDate() {
        return ContractUtility.getClonedDate(this.orderExecutedDate);
    }

    /**
     * Gets the <code>orderExportedDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>orderExportedDate</code> property.
     */
    public Date getOrderExportedDate() {
        return ContractUtility.getClonedDate(this.orderExportedDate);
    }

    /**
     * Gets the <code>orderImportedDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>orderImportedDate</code> property.
     */
    public Date getOrderImportedDate() {
        return ContractUtility.getClonedDate(this.orderImportedDate);
    }

    /**
     * Gets the <code>preOrderDate</code> property.
     * <p>
     * 
     * @return the current value of <code>preOrderDate</code> property.
     */
    public Date getPreOrderDate() {
        return ContractUtility.getClonedDate(this.preOrderDate);
    }

    /**
     * Gets the <code>orderAcceptedInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>orderAcceptedInd</code> property.
     */
    public boolean isOrderAcceptedInd() {
        return this.orderAcceptedInd;
    }

    /**
     * Gets the <code>orderCompleteInd</code> property.
     * <p>
     * 
     * @return the current value of <code>orderCompleteInd</code> property.
     */
    public boolean isOrderCompleteInd() {
        return this.orderCompleteInd;
    }

    /**
     * Gets the <code>orderExecutedInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>orderExecutedInd</code> property.
     */
    public boolean isOrderExecutedInd() {
        return this.orderExecutedInd;
    }

    /**
     * Gets the <code>orderExportedInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>orderExportedInd</code> property.
     */
    public boolean isOrderExportedInd() {
        return this.orderExportedInd;
    }

    /**
     * Gets the <code>orderImportedInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>orderImportedInd</code> property.
     */
    public boolean isOrderImportedInd() {
        return this.orderImportedInd;
    }

    /**
     * Gets the <code>preOrderInd</code> property.
     * <p>
     * 
     * @return the current value of <code>preOrderInd</code> property.
     */
    public boolean isPreOrderInd() {
        return this.preOrderInd;
    }

    /**
     * Sets the <code>pOrderAccepetedDate</code>.
     * <p>
     * 
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pOrderAccepetedDate</code>
     */
    public void setOrderAcceptedDate(final Date pOrderAcceptedDate) {
        this.orderAcceptedDate = ContractUtility.getClonedDate(pOrderAcceptedDate);
    }

    /**
     * Sets the <code>pOrderAcceptedInd</code>.
     * <p>
     * 
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pOrderAcceptedInd</code>
     */
    public void setOrderAcceptedInd(final boolean pOrderAcceptedInd) {
        this.orderAcceptedInd = pOrderAcceptedInd;
    }

    /**
     * Sets the <code>orderCompletedDate</code> property.
     * <p>
     * <b>Format:</b><br>
     * 1- 75 Alphanumeric
     * <p>
     * 
     * @param pOrderCompletedDate
     *            the new value of the <code>orderCompletedDate</code> property.
     */
    public void setOrderCompletedDate(final Date pOrderCompletedDate) {
        this.orderCompletedDate = ContractUtility.getClonedDate(pOrderCompletedDate);
    }

    /**
     * Sets the <code>orderCompleteInd</code> property.
     * <p>
     * <b>Format:</b><br>
     * 1- 75 Alphanumeric
     * <p>
     * 
     * @param pOrderCompleteInd
     *            the new value of the <code>orderCompleteInd</code> property.
     */
    public void setOrderCompleteInd(final boolean pOrderCompleteInd) {
        this.orderCompleteInd = pOrderCompleteInd;
    }

    /**
     * Sets the <code>pOrderExecutedDate</code>.
     * <p>
     * 
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pOrderExecutedDate</code>
     */
    public void setOrderExecutedDate(final Date pOrderExecutedDate) {
        this.orderExecutedDate = ContractUtility.getClonedDate(pOrderExecutedDate);
    }

    /**
     * Sets the <code>pOrderExecutedInd</code>.
     * <p>
     * 
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pOrderExecutedInd</code>
     */
    public void setOrderExecutedInd(final boolean pOrderExecutedInd) {
        this.orderExecutedInd = pOrderExecutedInd;
    }

    /**
     * Sets the <code>pOrderExportedDate</code>.
     * <p>
     * 
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pOrderExportedDate</code>
     */
    public void setOrderExportedDate(final Date pOrderExportedDate) {
        this.orderExportedDate = ContractUtility.getClonedDate(pOrderExportedDate);
    }

    /**
     * Sets the <code>pOrderExportedInd</code>.
     * <p>
     * 
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pOrderExportedInd</code>
     */
    public void setOrderExportedInd(final boolean pOrderExportedInd) {
        this.orderExportedInd = pOrderExportedInd;
    }

    /**
     * Sets the <code>pOrderImportedDate</code>.
     * <p>
     * 
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pOrderImportedDate</code>
     */
    public void setOrderImportedDate(final Date pOrderImportedDate) {
        this.orderImportedDate = ContractUtility.getClonedDate(pOrderImportedDate);
    }

    /**
     * Sets the <code>pOrderImportedInd</code>.
     * <p>
     * 
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pOrderImportedInd</code>
     */
    public void setOrderImportedInd(final boolean pOrderImportedInd) {
        this.orderImportedInd = pOrderImportedInd;
    }

    /**
     * Sets the <code>preOrderDate</code> property.
     * <p>
     * <b>Format:</b><br>
     * 1- 75 Alphanumeric
     * <p>
     * 
     * @param pPreOrderDate
     *            the new value of the <code>preOrderDate</code> property.
     */
    public void setPreOrderDate(final Date pPreOrderDate) {
        this.preOrderDate = ContractUtility.getClonedDate(pPreOrderDate);
    }

    /**
     * Sets the <code>preOrderInd</code> property.
     * <p>
     * <b>Format:</b><br>
     * 1- 75 Alphanumeric
     * <p>
     * 
     * @param pPreOrderInd
     *            the new value of the <code>preOrderInd</code> property.
     */
    public void setPreOrderInd(final boolean pPreOrderInd) {
        this.preOrderInd = pPreOrderInd;
    }

    /**
     * Gets the <code>bookingExistsInd</code> property.
     * <p>
     * 
     * @return the current value of <code>bookingExistsInd</code> property.
     */
    public boolean isBookingExistsInd() {
        return this.bookingExistsInd;
    }

    /**
     * @param pBookingExistsInd holds the new value of <code>bookingExistsInd</code>
     */
    public void setBookingExistsInd(boolean pBookingExistsInd) {
        this.bookingExistsInd = pBookingExistsInd;
    }
    
  //SK184_New starts
    /**
     * @return the quotedInd
     */
    public boolean isQuotedInd() {
		return quotedInd;
	}
    /**
     * @param quotedInd the quotedInd to set
     */
	public void setQuotedInd(boolean quotedInd) {
		this.quotedInd = quotedInd;
	}
	//SK184_New ends
}
