package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;

public class OtherChargeValidatorResponseDto implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 7649836830706406480L;

    private boolean aggregate1Stauts;

    private boolean Aggregate2Stauts;

    private String participantGroupDesc;

    private boolean participantGroupStatus;
    private boolean commodityCodeStatus;
    private boolean uldTypeStatus;

    public String getParticipantGroupDesc() {
        return participantGroupDesc;
    }

    public boolean isAggregate1Stauts() {
        return aggregate1Stauts;
    }

    public boolean isAggregate2Stauts() {
        return Aggregate2Stauts;
    }

    public boolean isParticipantGroupStatus() {
        return participantGroupStatus;
    }

    public void setAggregate1Stauts(boolean aggregate1Stauts) {
        this.aggregate1Stauts = aggregate1Stauts;
    }

    public void setAggregate2Stauts(boolean aggregate2Stauts) {
        Aggregate2Stauts = aggregate2Stauts;
    }

    public void setParticipantGroupDesc(String participantGroupDesc) {
        this.participantGroupDesc = participantGroupDesc;
    }

    public void setParticipantGroupStatus(boolean participantGroupStatus) {
        this.participantGroupStatus = participantGroupStatus;
    }
	/**
	 * Gets the <code>commodityCodeStatus</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>commodityCodeStatus</code> property.<br>
	 */
	public boolean isCommodityCodeStatus() {
		return this.commodityCodeStatus;
	}

	/**
	 * Gets the <code>uldTypeStatus</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>uldTypeStatus</code> property.<br>
	 */
	public boolean isUldTypeStatus() {
		return this.uldTypeStatus;
	}

	/**
	     * Sets the <code>commodityCodeStatus</code> property.
	     * <p>
	     * 
	     * @param pCommodityCodeStatus
	     *            the current value of the <code>commodityCodeStatus</code> property.
	     */
	public void setCommodityCodeStatus(final boolean pCommodityCodeStatus) {
		this.commodityCodeStatus = pCommodityCodeStatus;
	}

	/**
	     * Sets the <code>uldTypeStatus</code> property.
	     * <p>
	     * 
	     * @param pUldTypeStatus
	     *            the current value of the <code>uldTypeStatus</code> property.
	     */
	public void setUldTypeStatus(final boolean pUldTypeStatus) {
		this.uldTypeStatus = pUldTypeStatus;
	}
}
