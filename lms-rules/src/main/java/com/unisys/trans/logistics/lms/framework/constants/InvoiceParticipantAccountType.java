/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>CRAParticipantAccountType</code> indicates the different CRA Participant Account Type.
 * <p>
 */

public enum InvoiceParticipantAccountType {

    /**
     * Indicates that the CRA Participant Account Type is COMMERCIAL_EXPORT.
     */
    COMMERCIAL_EXPORT("Commercial Export"),
    
    /**
     * Indicates that the CRA Participant Account Type is COMMERCIAL_IMPORT.
     */
    COMMERCIAL_IMPORT("Commercial Import"),
    /**
     * Indicates that the CRA Participant Account Type is GOVERNMENT_ACCOUNT.
     */
    GOVERNMENT_ACCOUNT("Government Account"),
    /**
     * Indicates that the CRA Participant Account Type is IATA_AGENT.
     */
    NON_CASS_AGENT("Non CASS Agent"),
    /**
     * Indicates that the CRA Participant Account Type is INTERLINE_ACCOUNT.
     */
    INTERLINE_ACCOUNT("Interline Account"),
    /**
     * Indicates that the CRA Participant Account Type is PAYABLE_ACCOUNT.
     */
    GENERAL_SALES_AGENTS("General Sales Agents"),
    /**
     * Indicates that the CRA Participant Account Type is REGIONAL_ACCOUNT.
     */
    REGIONAL_ACCOUNT("Regional Account"),
    /**
     * Indicates that the CRA Participant Account Type is SERVICE_FREIGHT.
     */
    SERVICE_FREIGHT("Service Freight"),
    /**
     * Indicates that the CRA Participant Account Type is STATION_ACCOUNT.
     */
    STATION_ACCOUNT("Station Account"),
    /**
     * Indicates that the CRA Participant Account Type is GROUND_HANDLING_AGENTS.
     */
    GROUND_HANDLING_AGENTS("Ground Handling Agents"),
    /**
     * Indicates that the CRA Participant Account Type is CASS_AGENT.
     */
    CASS_AGENT("CASS Agent"),
	
	/**
     * Indicates that the CRA Participant Account Type is GSA_RECEIVABLE.
     */
	GSA_RECEIVABLE("GSA Receivable");

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
     * @param pParticipantAccountType
     *            - account type in short, i.e A for Commercial,B for Service Freight.
     */
    InvoiceParticipantAccountType(final String pParticipantAccountType) {
        this.setStringValue(pParticipantAccountType);
    }

    /**
     * <code>Parameterized  constructor.</code>
     * 
     * @param pParticipantAccountType
     *            - account type in short, i.e A for Commercial,B for Service Freight.
     * @param pLabel
     *            -account type
     */
    private InvoiceParticipantAccountType(final String pParticipantAccountType, final String pLabel) {
        this.setStringValue(pParticipantAccountType);
        this.setLabel(pLabel);
    }

    /**
     * Gets the <code>CRAParticipantAccountType</code>.
     * <p>
     * 
     * @param pCRAParticipantAccountType
     *            holds the new value of <code>CRAParticipantAccountType</code>
     *            <p>
     * @return the value of <code>CRAParticipantAccountType</code>
     */
    public static InvoiceParticipantAccountType getCRAParticipantAccountType(
                final String pCRAParticipantAccountType) {

        InvoiceParticipantAccountType aCRAParticipantAccountType = null;

        for (final InvoiceParticipantAccountType aType : InvoiceParticipantAccountType.values()) {

            if (pCRAParticipantAccountType.equals(aType.getStringValue())) {
                aCRAParticipantAccountType = aType;
                break;
            }
        }
        return aCRAParticipantAccountType;
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
