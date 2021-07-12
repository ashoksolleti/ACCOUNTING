/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>CRABillingScheduleType</code> indicates the different CRA Participant Account Type.
 * <p>
 */

public enum CRABillingScheduleType {
	/**
     * Indicates that the CRA Participant Account Type is COMMERCIAL.
     */
	PARTICIPANT_TYPE("Participant Type"),
    /**
     * Indicates that the CRA Aggregate Type is GOVERNMENT_ACCOUNT.
     */
	AGGREGATE("Aggregate"),
    /**
     * Indicates that the CRA Country Type is IATA_AGENT.
     */
	COUNTRY("Country"), 
	
	/**
     * Indicates that the CRA Billing Type is IATA_AGENT.
     */
	STATION("Station"),
	
    /**
     * Indicates that the CRA BILLING_GROUP Type is INTERLINE_ACCOUNT.
     */
	BILLING_GROUP("Billing Group"),
    
	/**
     * Indicates that the CRA Participant Account is PAYABLE_ACCOUNT.
     */
	
	PARTICIPANT_ACCOUNT("Participant Account"),
	/**
     * Indicates that the CRA Participant Account is PAYABLE_ACCOUNT.
     */
	
	SYSTEM("System");
	
	   /**
     * Attribute to hold the <code>label</code> property.
     */
    private String label;

    /**
     * Attribute to hold the <code>string value</code> property.
     */
    private String stringValue;

    /**
     * <code>Parameterized  constructor.</code>
     * 
     * @param pBillingScheduleType
     *            - account type in short, i.e A for Commercial,B for Service Freight.
     */
    CRABillingScheduleType(final String pBillingScheduleType) {
        this.setStringValue(pBillingScheduleType);
    }

    /**
     * <code>Parameterized  constructor.</code>
     * 
     * @param pBillingScheduleType
     *            - account type in short, i.e A for Commercial,B for Service Freight.
     * @param pLabel
     *            -account type
     */
    private CRABillingScheduleType(final String pBillingScheduleType, final String pLabel) {
        this.setStringValue(pBillingScheduleType);
        this.setLabel(pLabel);
    }

    /**
     * Gets the <code>CRABillingScheduleType</code>.
     * <p>
     * 
     * @param pCRABillingScheduleType
     *            holds the new value of <code>CRABillingScheduleType</code>
     *            <p>
     * @return the value of <code>CRABillingScheduleType</code>
     */
    public static CRABillingScheduleType getCRABillingScheduleType(
                final String pCRABillingScheduleType) {

        CRABillingScheduleType aCRABillingScheduleType = null;

        for (final CRABillingScheduleType aType : CRABillingScheduleType.values()) {

            if (pCRABillingScheduleType.equals(aType.getStringValue())) {
                aCRABillingScheduleType = aType;
                break;
            }
        }
        return aCRABillingScheduleType;
    }

    /**
     * Gets the <code>label</code> property.
     * <p>
     * 
     * @return the current value of the <code>label</code> property.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Gets the <code>stringValue</code> property.
     * <p>
     * 
     * @return the current value of the <code>stringValue</code> property.
     */
    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * Sets the <code>label</code> property.
     * <p>
     * 
     * @param pLabel the new value of the <code>label</code> property.
     */
    public void setLabel(final String pLabel) {
        this.label = pLabel;
    }

    /**
     * Sets the <code>stringValue</code> property.
     * <p>
     * 
     * @param pStringValue the new value of the <code>stringValue</code> property.
     */
    public void setStringValue(final String pStringValue) {
        this.stringValue = pStringValue;
    }

}
