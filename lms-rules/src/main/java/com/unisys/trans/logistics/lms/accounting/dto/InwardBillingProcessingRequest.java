package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardQueueType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class InwardBillingProcessingRequest extends AbstractRequest {

	/**
     * 
     */
	private static final long serialVersionUID = -7355669962062125436L;

	private List<InterlineBillingQueueDto> interlineBillingQueueDtos;

	private int maxItemsToAction;

	private InwardQueueType queueType;
	// NAC
	private String specificAirline;

	public List<InterlineBillingQueueDto> getInterlineBillingQueueDtos() {
		return this.interlineBillingQueueDtos;
	}

	public int getMaxItemsToAction() {
		return this.maxItemsToAction;
	}

	public InwardQueueType getQueueType() {
		return this.queueType;
	}

	public void setInterlineBillingQueueDtos(
			final List<InterlineBillingQueueDto> pInterlineBillingQueueDtos) {
		this.interlineBillingQueueDtos = pInterlineBillingQueueDtos;
	}

	public void setMaxItemsToAction(final int pMaxItemsToAction) {
		this.maxItemsToAction = pMaxItemsToAction;
	}

	public void setQueueType(final InwardQueueType pQueueType) {
		this.queueType = pQueueType;
	}

	/* NAC starts */
	public String getSpecificAirline() {
		return specificAirline;
	}

	public void setSpecificAirline(String specificAirline) {

		this.specificAirline = specificAirline;
	}
	/* NAC ends */
}
