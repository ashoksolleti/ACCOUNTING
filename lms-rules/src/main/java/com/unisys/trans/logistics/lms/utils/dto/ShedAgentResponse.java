package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class ShedAgentResponse extends AbstractResponse {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Attribute to hold the list of <code>ShedAgentDto</code> property.
	 */
	private List<ShedAgentDto> shedAgentDtos = new ArrayList<ShedAgentDto>();

	/**
	 * <code>Default constructor.</code>
	 */
	public ShedAgentResponse() {

	}

	/**
	 * Adds the <code>shedAgentDto</code> retrieved from the system to the list of
	 * shedAgentDtos.
	 * <p>
	 * 
	 * @param shedAgentDto the new value of <code>shedAgentDto</code> property.<br>
	 */
	public void addScreeningMethod(final ShedAgentDto shedAgentDto) {
		this.shedAgentDtos.add(shedAgentDto);
	}

	/**
	 * Gets the <code>shedAgentDtos</code> property.<br>
	 * <p>
	 * Refers to the list of <code>pShedAgentDto</code>.
	 * <p>
	 * 
	 * @return the current list of <code>shedAgentDtos</code> property.<br>
	 */
	public List<ShedAgentDto> getShedAgentDtos() {
		return this.shedAgentDtos;
	}

	/**
	 * Sets the <code>shedAgentDtos</code>.
	 * <p>
	 * Refers to the list of <code>ShedAgentDto</code>.
	 * <p>
	 * 
	 * @param shedAgentDtos the new list of <code>ShedAgentDto</code>.
	 */
	public void setShedAgentDtos(final List<ShedAgentDto> shedAgentDtos) {
		this.shedAgentDtos = shedAgentDtos;
	}

}
