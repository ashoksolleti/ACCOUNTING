/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>queueItemObjectType</code> class holds the Type of Queue.
 * <p>
 */
public enum QueueItemObjectType {

    /**
     * 'SPOTRATE' - Spot Rate.
     */
    SPOTRATE("SpotRate"),

    AIRWAYBILL("Airwaybill"),

    AUDITAIRWAYBILL("AuditAirwaybill"),
    
    BILLINGQUEUE("BillingQueue"),
    
    GLACCENTRYQUEUE("GLAccountingEntryQueue"),
    
    FLOWNACCOUNTINGQUEUE("FLownAccountingQueue"),
    
    ACCPOSTINGQUEUE("AccountingPostingFileQueue"),
    
    REJECTMEMOQUEUE("RejectionMemoQueue"),
    
    PAYMENTLOADQUEUE("PaymentLoadQueue"),
    
    MONTHLYCLOSUREQUEUE("MonthlyClosureQueue"),
	
	ERRWRITEOFF("WriteOffErrorQueue"),
    
    ERRPAYMENTACCQUEUE("AccountingPaymentEntryErrorQueue"),
    
    PAYMENTSERRORQUEUE("PaymentsErrorQueue"),
    
    NOTSETTLEDQUEUE("NotSettledQueue"),
    
    PARTIALLYPAIDQUEUE("PartiallyPaidQueue"),
    
    OVERPAIDQUEUE("OverPaidQueue"),
    
    MONTHLYREVENUEREPORTQUEUE("MonthlyRevenueReportQueue"),
    
    ACCOUNTINGENTRIESREPORTQUEUE("AccountingEntriesReportQueue"),
    
    TRIALBALANCEREPORTQUEUE("TrialBalanceReportQueue"),
    
    NOTBILLEDQUEUE("NotBilledQueue"),
    
    PARTICIPANTRECEIVABLE("Participanteceivable"),

    CARRIRERECEIVABLE("CarrierReceivable"),
    
    MEMOAPPROVALQUEUE("BILLING AND CREDIT MEMO Queue"),
	
    // added to uniquely identifies the failed to load AWB
    LOADAWBERROR("FailedToLoadAWB"),

    // added to uniquely identifies the participant credit info error
    PARTCREDITLIMITUPDERROR("FailedToUpdateParticipantCreditLimit");
    /**
     * Attribute to hold <code>queueItemObjectType</code>.
     */
    private final String queueItemObjectType;

    /**
     * Constructor with <code>queueItemObjectType</code> as an argument.
     * <p>
     * 
     * @param pQueueItemObjectType the new value of the <code>queueItemObjectType</code>.<br>
     */
    QueueItemObjectType(final String pQueueItemObjectType) {
        this.queueItemObjectType = pQueueItemObjectType;
    }

    /**
     * Gets the value of the <code>queueItemObjectType</code> string.
     * <p>
     * 
     * @return the current value of <code>queueItemObjectType</code>.
     */
    public String getActionType() {
        return this.queueItemObjectType;
    }

    /**
     * The <code>value</code> method gives the restriction type of queue.
     * <p>
     * 
     * @return the enumerated value of the <code>queueItemObjectType</code>.
     */
    public String value() {
        return this.name();
    }
}
