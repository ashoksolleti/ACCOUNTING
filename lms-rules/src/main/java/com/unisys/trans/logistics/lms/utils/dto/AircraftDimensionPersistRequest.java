package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.utils.contract.AircraftDimensionBean;

/**
 * <code>AircraftDimensionPersistRequest</code> is used for Aircraft Dimension
 * Persist information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>aircraftDimensionDto
 * <li>aircraftDimensionBeans
 * <li>oId
 * </code>
 * </ul>	
 */
public class AircraftDimensionPersistRequest extends AbstractRequest {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 5303418615533489826L;

	/**
	 * Attribute to hold the <code>airCraftDimensionDto</code> property.
	 */
	private AircraftDimensionDto aircraftDimensionDto;

	/**
	 * Attribute to hold the <code>aircarftDimensionBeans</code> property.
	 */
	private List<AircraftDimensionBean> aircraftDimensionBeans;

	/**
	 * Attribute to hold the <code>oId</code> object.
	 */
	private Long oId;

	/**
	 * <code>Default constructor.</code>
	 */

	public AircraftDimensionPersistRequest() {

	}

	/**
	 * Gets the <code>airCraftDimensionDto</code> property.
	 * <p>
	 * 
	 * @return the current value of <code>aircraftDimensionDto</code> property.
	 */
	public final AircraftDimensionDto getAircraftDimensionDto() {

		return this.aircraftDimensionDto;

	}

	/**
	 * Gets the <code>OId</code> property.
	 * <p>
	 * 
	 * @return the current value of <code>oId</code> property.
	 */
	public Long getOId() {
		return this.oId;
	}

	/**
	 * Sets the <code>airCraftDimensionDto</code> property.
	 * <p>
	 * 
	 * @param pAircraftDimensionDto
	 *            the new value of <code>aircraftDimensionDto</code> property.
	 */
	public final void setAircraftDimensionDto(
			final AircraftDimensionDto pAircraftDimensionDto) {
		this.aircraftDimensionDto = pAircraftDimensionDto;
	}

	/**
	 * Sets the <code>OId</code> property.
	 * <p>
	 * 
	 * @param pOId
	 *            the new value of the <code>OId</code> property.
	 */
	public void setOId(final Long pOId) {
		this.oId = pOId;
	}

	/**
	 * Gets the list of <code>aircraftDimensionBeans</code> associated with the
	 * aircraftDimensionBeans.
	 * <p>
	 * 
	 * @return the current list of <code>aircraftDimensionBeans</code>
	 *         associated with a AircraftDimensionBean.
	 */
	public List<AircraftDimensionBean> getAircraftDimensionBeans() {
		return this.aircraftDimensionBeans;
	}

	/**
	 * Sets the list of <code>aircraftDimensionBeans</code> associated with
	 * aircraftDimensionBeans.
	 * <p>
	 * 
	 * @param pAircraftDimensionBeans
	 *            the new list of <code>aircraftDimensionBeans</code> associated
	 *            with aircraftDimensionBeans.<br>
	 * 
	 */

	public void setAircraftDimensionBeans(
			List<AircraftDimensionBean> pAircraftDimensionBeans) {
		this.aircraftDimensionBeans = pAircraftDimensionBeans;
	}
}
