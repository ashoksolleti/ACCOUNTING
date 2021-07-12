/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>MultiSegmentDestinationDto</code> to get MultiSegmentDestination
 * details.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>allDestinations
 * <li>carriers
 * <li>destination
 * <li>destinationType
 * <li>routeOrder
 * <li>carriersAsString
 * <li>DELIMITER
 * <li>oId
 * </ul>
 * </code>
 */
public class MultiSegmentDestinationDto extends PersistenceObjectDto {

	/**
	 * Attribute to hold <code>DELIMITER</code> property.
	 */
	private static final String DELIMITER = ", ";

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = -7557464329092852964L;

	/**
	 * Attribute to hold <code>allDestinations</code> property.
	 */
	private boolean allDestinationInd;

	/**
	 * Attribute to hold <code>carriers</code> property.
	 */
	private List<String> carriers;

	/**
	 * Attribute to hold <code>carriersAsString</code> property.
	 */
	private String carriersAsString;

	/**
	 * Attribute to hold <code>destination</code> property.
	 */
	private GeographicDataDto destination;

	/**
	 * Attribute to hold <code>oId</code> property.
	 */

	private Long oId;

	/**
	 * Attribute to hold <code>routeOrder</code> property.
	 */
	private int routeOrder;

	/**
	 * Gets the <code>Carriers</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>Carriers</code> property.
	 */
	public List<String> getCarriers() {
		return this.carriers;
	}

	/**
	 * Gets the <code>carriersAsString</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>carriersAsString</code> property.
	 */
	public String getCarriersAsString() {
		final StringBuilder listAsString = new StringBuilder();
		final List<String> aCarriers = this.getCarriers();
		if (aCarriers != null) {
			for (String carrier : aCarriers) {
				if (!listAsString.toString().isEmpty()) {
					listAsString.append(DELIMITER);
				}
				if (carrier != null && !carrier.isEmpty()) {
					listAsString.append(carrier.trim());
				}

			}
		}
		this.carriersAsString = listAsString.toString();
		return this.carriersAsString;
	}

	/**
	 * Gets the <code>CurrencyCode</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 3 Alphabet
	 * <p>
	 * <b>Example: </b><br>
	 * USD
	 * <p>
	 * 
	 * @return the current value of the <code>CurrencyCode</code> property.
	 */
	public GeographicDataDto getDestination() {
		if (this.destination == null) {
			this.destination = new GeographicDataDto();
		}
		return this.destination;
	}

	/**
	 * Gets the <code>oId</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>oId</code> property.
	 */
	@Override
	public Long getOId() {
		return this.oId;
	}

	/**
	 * Gets the <code>RouteOrder</code> property.
	 * 
	 * 
	 * @return the current value of the <code>RouteOrder</code> property.
	 */
	public int getRouteOrder() {
		return this.routeOrder;
	}

	/**
	 * Gets the <code>AllDestinations</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @return the current value of the <code>AllDestinations</code> property.
	 */
	public boolean isAllDestinationInd() {
		return this.allDestinationInd;
	}

	/**
	 * Sets the <code>AllDestinations</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @param pAllDestinationInd
	 *            the current value of the <code>AllDestinations</code>
	 *            property.
	 */

	public void setAllDestinationInd(final boolean pAllDestinationInd) {
		this.allDestinationInd = pAllDestinationInd;
	}

	/**
	 * Sets the <code>Carriers</code> property.
	 * 
	 * @param pCarriers
	 *            the new value of the <code>Carriers</code> property.
	 */

	public void setCarriers(final List<String> pCarriers) {
		this.carriers = pCarriers;
	}

	/**
	 * Sets the <code>carriersAsString</code> property.
	 * 
	 * @param pCarriersAsString
	 *            the current value of the <code>carriersAsString</code>
	 *            property.
	 */
	public void setCarriersAsString(final String pCarriersAsString) {
		this.carriersAsString = pCarriersAsString;
	}

	/**
	 * Sets the <code>Destination</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-7 AlphaNumeric Characters
	 * <p>
	 * <b>Example: </b><br>
	 * JK23
	 * <p>
	 * 
	 * @param pDestination
	 *            the current value of the <code>Destination</code> property.
	 */
	public void setDestination(final GeographicDataDto pDestination) {
		this.destination = pDestination;
	}

	/**
	 * Sets the <code>oId</code> property.
	 * <p>
	 * 
	 * @param pOId
	 *            the new value of the <code>oId</code> property.
	 */
	public void setOId(final Long pOId) {
		this.oId = pOId;
	}

	/**
	 * Sets the <code>RouteOrder</code> property.
	 * 
	 * @param pRouteOrder
	 *            the current value of the <code>RouteOrder</code> property.
	 */

	public void setRouteOrder(final int pRouteOrder) {
		this.routeOrder = pRouteOrder;
	}

}
