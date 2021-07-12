//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>AWBParticipantType</code> holds the constants to indicate
 * AWBParticipant type applied.
 * <p>
 * Following are the possible AWBParticipant type:<br>
 * <ul>
 * <li>E - Location of goods for Customs examination before clearance
 * <li>K - Banker
 * <li>L - Location of goods for pickup
 * <li>M - Manufacturer
 * <li>O - Surface carrier origin
 * <li>T - Surface carrier destination
 * <li>S - Shipper
 * <li>C - Consignee
 * <li>P - Bill-to Shipper
 * <li>R - Bill-to Consignee
 * <li>A - IATA Agent
 * <li>B - Broker
 * <li>N – Notify
 * <li>F – Forwarder
 * <li>W - W-Subcontractor
 * <li>Y - Y-Subcontractor
 * <li>Z - Z-Subcontractor
 * </ul>
 */
public enum AWBParticipantType {

	/**
	 * Constant used for Location of goods for Customs examination before
	 * clearance.
	 */
	E("Customs Location",4),

	/**
	 * Constant used for Banker.
	 */
	K("Bank",4),

	/**
	 * Constant used for Location of goods for pickup.
	 */
	L("Pickup Location",4),

	/**
	 * Constant used for Manufacturer.
	 */
	M("Manufacturer",4),

	/**
	 * Constant used for Surface carrier origin.
	 */
	O("Surface Origin",4),

	/**
	 * Constant used for Surface carrier destination.
	 */
	T("Surface Destination",4),

	/**
	 * Constant used for Shipper.
	 */
	S("Shipper",1),

	/**
	 * Constant used for Consignee.
	 */
	C("Consignee",2),

	/**
	 * Constant used for Bill-to Shipper.
	 */
	P("Bill To Shipper",4),

	/**
	 * Constant used for Bill-to Consignee.
	 */
	R("Bill To Consignee",4),

	/**
	 * Constant used for IATA Agent.
	 */
	//A("IATA Agent",3),
	A("Agent",3),

	/**
	 * Constant used for Broker.
	 */
	B("Broker",4),

	/**
	 * Constant used for Notify.
	 */
	N("Notify",4),
	/**
     * Constant used for Pickup Operator.
     */
	G("Pickup Operator",4),
	/**
     * Constant used for Delivery Operator.
     */
	D("Delivery Operator",4),

	/**
	 * Constant used for Forwarder.
	 */
	F("Forwarder",4),
	
	/**
     * Constant used for W-Subcontractor.
     */
    W("W-Subcontractor",4),
    /**
     * Constant used for Y-Subcontractor.
     */
    Y("Y-Subcontractor",4),
    
    /**
     * Constant used for Z-Subcontractor.
     */
    Z("Z-Subcontractor",4);
    
    
    

	/**
	 * Attribute to hold the <code>participant</code> property.
	 */
	private String participant;
    
    private int priority;

	/**
	 * Parameterize constructor.
	 * 
	 * @param pDue
	 *            the value.
	 */
	AWBParticipantType(final String pParticipant, final int pPriority) {
		this.participant = pParticipant;
		this.priority = pPriority;
	}

	/**
	 * @return the participant
	 */
	public String getParticipant() {
		return this.participant;
	}

    public int getPriority() {
        return this.priority;
    }

	/**
	 * Gives the string format of enumerated <code>AWBParticipantType</code>.
	 * <p>
	 * 
	 * @return the current string value of the <code>AWBParticipantType</code>.
	 */
	public String value() {
		return this.name();
	}

	public static AWBParticipantType getAWBParticipantType(
			final String pAWBParticipantType) {

		AWBParticipantType anAWBParticipantType = null;

		for (final AWBParticipantType aType : AWBParticipantType.values()) {

			if (pAWBParticipantType.equals(aType.value())) {
				anAWBParticipantType = aType;
				break;
			}
		}

		return anAWBParticipantType;

	}
}
