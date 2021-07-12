package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class QueueResponse extends AbstractResponse{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7002281524886747649L;
	private List<QueueDto> QueueDtos;

	/**
	 * @return the queueDtos
	 */
	public List<QueueDto> getQueueDtos() {
		return QueueDtos;
	}

	/**
	 * @param queueDtos the queueDtos to set
	 */
	public void setQueueDtos(List<QueueDto> queueDtos) {
		QueueDtos = queueDtos;
	}

}
