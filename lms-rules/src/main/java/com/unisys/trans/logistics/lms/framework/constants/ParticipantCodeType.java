

//@formatter:off
/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * Participant Codes
 * <ul>
 * <li>C = consignee</li>
 * <li>S = shipper</li>
 * <li>A = IATA agent</li>
 * <li>B = customs broker</li>
 * <li>D = p & d operator destination</li>
 * <li>E = location of goods for customs examination before clearance</li>
 * <li>F = forwarder</li>
 * <li>G = p & d operator origin</li>
 * <li>K = banker</li>
 * <li>L = location of goods for pickup</li>
 * <li>M = manufacturer</li>
 * <li>N = also notify (on goods arrival)</li>
 * <li>O = surface carrier origin</li>
 * <li>P = party to be billed for origin charges</li>
 * <li>R = party to be billed for destination charges</li>
 * <li>T = surface carrier destination</li>
 * <li>W = subcontractor</li>
 * <li>Y = subcontractor</li>
 * <li>Z = subcontractor</li>
 * </ul>
 * 
 * @author Unisys
 * 
 */
public enum ParticipantCodeType {
    A("Agent",3),
    B("Customs Broker",4),
    C("Consignee",2),
    D("Delivery Operator",4),
    E("Customs Location",4),
    F("Forwarder",4),
    G("Pickup Operator",4),
    K("Bank",4),
    L("Pickup Location",4),
    M("Manufacturer",4),
    N("Notify",4),
    O("Surface Origin",4),
    P("Bill To Shipper",4),
    R("Bill To Consignee",4),
    S("Shipper",1),
    T("Surface Destination",4),
    W("W-Subcontractor",4),
    Y("Y-Subcontractor",4),
    Z("Z-Subcontractor",4);

	/** Attribute that holds the string representation for the enum **/
	private String description;
	
	private int priority;

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	/**
	 * Parameterized constructor. Accepts the description of the enum
	 * as the parameter
	 * 
	 * @param description
	 *            Description of the enum
	 */
	ParticipantCodeType(final String description,int priority) {
		this.description = description;
		this.priority=priority;
	}
	
	public String getDescription() {
		return this.description;
		
	}
	
	
	public static ParticipantCodeType getParticipantCodeType(final String pParticpantCode) {

		ParticipantCodeType aParticipantCodeType = null;

        for (final ParticipantCodeType aType : ParticipantCodeType.values()) {

            if (pParticpantCode.equals(aType.name())) {
            	aParticipantCodeType = aType;
                break;
            }
        }

        return aParticipantCodeType;
    }
	
	
}
