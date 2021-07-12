package com.unisys.trans.logistics.lms.rating.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;

/**
 * <code>TariffRateReportRequest</code> is used for batch process.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>biDirectional
 * <li>destination
 * <li>origin
 * <li>allDestinationsForDestfilter
 * <li>allOriginsForOriginFilter
 * </ul>
 */
public class TariffRateReportRequest extends BatchRequest {

	/**
	 * Attribute to hold <code>serialVersionUID</code> property.
	 */
	private static final long serialVersionUID = 4537410477693556625L;

	/**
	 * Attribute to hold <code>biDirectional</code> property.
	 */
	private boolean biDirectional;

	/**
	 * Attribute to hold <code>destination</code> property.
	 */
	private String destination;

	/**
	 * Attribute to hold <code>origin</code> property.
	 */
	private String origin;

	/**
	 * Attribute to hold <code>allDestinationsForDestfilter</code> property.
	 */
	private List<String> allDestinationsForDestfilter;

	/**
	 * Attribute to hold <code>allOriginsForOriginFilter</code> property.
	 */
	private List<String> allOriginsForOriginFilter;

	/**
	 * Gets the <code>allDestinationsForDestfilter</code> property.
	 * <p>
	 * 
	 * @return the current value of the
	 *         <code>allDestinationsForDestfilter</code> property.
	 */
	public List<String> getAllDestinationsForDestfilter() {
		return this.allDestinationsForDestfilter;
	}

	/**
	 * Gets the <code>allOriginsForOriginFilter</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>allOriginsForOriginFilter</code>
	 *         property.
	 */
	public List<String> getAllOriginsForOriginFilter() {
		return this.allOriginsForOriginFilter;
	}

	/**
	 * Gets the <code>destination</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>destination</code> property.
	 */
	public String getDestination() {
		return this.destination;
	}

	/**
	 * Gets the <code>origin</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>origin</code> property.
	 */
	public String getOrigin() {
		return this.origin;
	}

	/**
	 * Gets the <code>biDirectional</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>biDirectional</code> property.
	 */
	public boolean isBiDirectional() {
		return this.biDirectional;
	}

	/**
	 * Sets the new <code>allDestinationsForDestfilter</code> value.
	 * <p>
	 * 
	 * @param pAllDestinationsForDestfilter
	 *            the new value of the <code>allDestinationsForDestfilter</code>
	 *            property.
	 */
	public void setAllDestinationsForDestfilter(
			List<String> pAllDestinationsForDestfilter) {
		this.allDestinationsForDestfilter = pAllDestinationsForDestfilter;
	}

	/**
	 * Sets the new <code>allOriginsForOriginFilter</code> value.
	 * <p>
	 * 
	 * @param pAllOriginsForOriginFilter
	 *            the new value of the <code>allOriginsForOriginFilter</code>
	 *            property.
	 */
	public void setAllOriginsForOriginFilter(
			List<String> pAllOriginsForOriginFilter) {
		this.allOriginsForOriginFilter = pAllOriginsForOriginFilter;
	}

	/**
	 * Sets the new <code>biDirectional</code> value.
	 * <p>
	 * 
	 * @param pBiDirectional
	 *            the new value of the <code>biDirectional</code> property.
	 */
	public void setBiDirectional(boolean pBiDirectional) {
		this.biDirectional = pBiDirectional;
	}

	/**
	 * Sets the new <code>destination</code> value.
	 * <p>
	 * 
	 * @param pDestination
	 *            the new value of the <code>destination</code> property.
	 */
	public void setDestination(String pDestination) {
		this.destination = pDestination;
	}

	/**
	 * Sets the new <code>origin</code> value.
	 * <p>
	 * 
	 * @param pOrigin
	 *            the new value of the <code>origin</code> property.
	 */
	public void setOrigin(String pOrigin) {
		this.origin = pOrigin;
	}
}
