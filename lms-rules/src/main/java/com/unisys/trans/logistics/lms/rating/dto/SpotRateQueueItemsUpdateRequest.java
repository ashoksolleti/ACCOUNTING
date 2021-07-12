/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.Map;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>SpotRateQueueItemsUpdateRequest</code> is used for
 * updating(accept/reject) <code>SpotRate</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>queueItemsMap
 * </ul>
 */
public class SpotRateQueueItemsUpdateRequest extends AbstractRequest {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = -1266751549931037525L;

	/**
	 * Attribute to hold the <code>queueItemsMap</code> property.
	 */
	private Map<Long, Boolean> queueItemsMap;

	/**
	 * Gets the <code>queueItemsMap</code> property.
	 * 
	 * @return the current value of the <code>queueItemsMap</code> property.
	 */
	public Map<Long, Boolean> getQueueItemsMap() {
		return this.queueItemsMap;
	}

	/**
	 * Sets the <code>queueItemsMap</code> property.
	 * 
	 * @param pQueueItemsMap
	 *            the current value of the <code>queueItemsMap</code> property.
	 */
	public void setQueueItemsMap(final Map<Long, Boolean> pQueueItemsMap) {
		this.queueItemsMap = pQueueItemsMap;
	}
}
