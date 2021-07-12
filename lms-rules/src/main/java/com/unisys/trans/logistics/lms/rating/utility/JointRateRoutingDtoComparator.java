/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.utility;

import java.io.Serializable;
import java.util.Comparator;

import com.unisys.trans.logistics.lms.rating.dto.JointRateDto;

/**
 * <code>JointRateRoutingDtoComparator</code> contains the comparison methods
 * for the comparing two different objects.
 * <p>
 * This performs the following functions:<br>
 * <ul>
 * <li>Compares the given object.</li>
 * </ul>
 */

public class JointRateRoutingDtoComparator implements Comparator<JointRateDto>,
		Serializable {

	/**
	 * Generated Serial VersionId.
	 */
	private static final long serialVersionUID = 3033159994874433204L;

	/**
	 * This method is invoked on execution of the sort method of Collections.
	 * <p>
	 * 
	 * @param pJointRateDto1
	 *            <code>Object</code><br>
	 *            contains the current object.
	 *            <p>
	 * @param pJointRateDto2
	 *            <code>Object</code><br>
	 *            contains the object to be compared.
	 * @return <code>int</code>
	 */
	@Override
	public int compare(final JointRateDto pJointRateDto1,
			final JointRateDto pJointRateDto2) {

		int value = 0;
		if (value == 0
				&& (pJointRateDto1.getJointRateRoutingDtos().get(0).getCity()
						.getCode() != null || pJointRateDto2
						.getJointRateRoutingDtos().get(0).getCity().getCode() != null)) {
			if (pJointRateDto1.getJointRateRoutingDtos().get(0).getCity()
					.getCode() == null) {
				value = -1;
			} else if (pJointRateDto2.getJointRateRoutingDtos().get(0)
					.getCity().getCode() == null) {
				value = 1;
			} else {
				value = pJointRateDto1
						.getJointRateRoutingDtos()
						.get(0)
						.getCity()
						.getCode()
						.compareTo(
								pJointRateDto2.getJointRateRoutingDtos().get(0)
										.getCity().getCode());
			}

		}

		if (value == 0
				&& (pJointRateDto1.getJointRateRoutingDtos().get(0)
						.getCarrierCode() != null || pJointRateDto2
						.getJointRateRoutingDtos().get(0).getCarrierCode() != null)) {
			if (pJointRateDto1.getJointRateRoutingDtos().get(0)
					.getCarrierCode() == null) {
				value = -1;
			} else if (pJointRateDto2.getJointRateRoutingDtos().get(0)
					.getCarrierCode() == null) {
				value = 1;
			} else {
				value = pJointRateDto1
						.getJointRateRoutingDtos()
						.get(0)
						.getCarrierCode()
						.compareTo(
								pJointRateDto2.getJointRateRoutingDtos().get(0)
										.getCarrierCode());
			}

		}

		if (pJointRateDto1.getJointRateRoutingDtos().size() == 2
				|| pJointRateDto2.getJointRateRoutingDtos().size() == 2) {
			if (value == 0
					&& (pJointRateDto1.getJointRateRoutingDtos().get(1)
							.getCity().getCode() != null || pJointRateDto2
							.getJointRateRoutingDtos().get(1).getCity()
							.getCode() != null)) {
				if (pJointRateDto1.getJointRateRoutingDtos().get(1).getCity()
						.getCode() == null) {
					value = -1;
				} else if (pJointRateDto2.getJointRateRoutingDtos().get(1)
						.getCity().getCode() == null) {
					value = 1;
				} else {
					value = pJointRateDto1
							.getJointRateRoutingDtos()
							.get(1)
							.getCity()
							.getCode()
							.compareTo(
									pJointRateDto2.getJointRateRoutingDtos()
											.get(1).getCity().getCode());
				}
			}

			if (value == 0
					&& (pJointRateDto1.getJointRateRoutingDtos().get(1)
							.getCarrierCode() != null || pJointRateDto2
							.getJointRateRoutingDtos().get(1).getCarrierCode() != null)) {
				if (pJointRateDto1.getJointRateRoutingDtos().get(1)
						.getCarrierCode() == null) {
					value = -1;
				} else if (pJointRateDto2.getJointRateRoutingDtos().get(1)
						.getCarrierCode() == null) {
					value = 1;
				} else {
					value = pJointRateDto1
							.getJointRateRoutingDtos()
							.get(1)
							.getCarrierCode()
							.compareTo(
									pJointRateDto2.getJointRateRoutingDtos()
											.get(1).getCarrierCode());
				}

			}
		}

		if (pJointRateDto1.getDestination().getCode() != null
				|| pJointRateDto2.getDestination().getCode() != null) {
			if (value == 0
					&& (pJointRateDto1.getDestination().getCode() != null || pJointRateDto2
							.getDestination().getCode() != null)) {
				if (pJointRateDto1.getDestination().getCode() == null) {
					value = -1;
				} else if (pJointRateDto2.getDestination().getCode() == null) {
					value = 1;
				} else {
					value = pJointRateDto1
							.getDestination()
							.getCode()
							.compareTo(
									pJointRateDto2.getDestination().getCode());
				}

			}

		}

		if (value == 0
				&& (pJointRateDto1.getDestinationCarrierCode() != null || pJointRateDto2
						.getDestinationCarrierCode() != null)) {
			if (pJointRateDto1.getDestinationCarrierCode() == null) {
				value = -1;
			} else if (pJointRateDto2.getDestinationCarrierCode() == null) {
				value = 1;
			} else {
				value = pJointRateDto1.getDestinationCarrierCode().compareTo(
						pJointRateDto2.getDestinationCarrierCode());
			}

		}

		return value;
	}
}
