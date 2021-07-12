/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>JointRateRoutingResponse</code> contains the response of the
 * maintenance request received by <code>TariffRateService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>GeographicDataDto
 * <li>JointRateDto
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.JointRateDto
 */

public class JointRateRoutingResponse extends AbstractResponse {
    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>GeographicDataDto</code> property.
     * <p>
     * <code>GeographicDataDto</code> contains the destination information.
     */
    private GeographicDataDto destination;

    /**
     * Attribute to hold the list of<code>JointRateDto</code> property.
     * <p>
     * <code>JointRateDto</code> contains the jointRateDto information.
     */

    private List<JointRateDto> jointRateDto;

    /**
     * Attribute to hold <code>GeographicDataDto</code> property.
     * <p>
     * <code>GeographicDataDto</code> contains the origin information.
     */
    private GeographicDataDto origin;

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.rating.dto.GeographicDataDto
     * GeographicDataDto} containing <code>GeographicDataDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>destination</code> property.
     */
    public GeographicDataDto getDestination() {
        return this.destination;
    }

    /**
     * Gets the list of<code>JointRateDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>jointRateDto</code> property.
     */

    public List<JointRateDto> getJointRateDto() {
        if (this.jointRateDto == null) {
            this.jointRateDto = new ArrayList<JointRateDto>();
        }
        return jointRateDto;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.rating.dto.GeographicDataDto
     * GeographicDataDto} containing <code>GeographicDataDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>origin</code> property.
     */
    public GeographicDataDto getOrigin() {
        return this.origin;
    }

    /**
     * Sets the <code>destination</code> property.
     * <p>
     * 
     * @param pDestination
     *            the current value of the <code>destination</code> property.
     */

    public void setDestination(final GeographicDataDto pDestination) {
        this.destination = pDestination;
    }

    /**
     * Sets the list of<code>JointRateDto</code> property.
     * <p>
     * 
     * @param pJointRateDto
     *            the current value of the <code>jointRateDto</code> property.
     */
    public void setJointRateDto(final List<JointRateDto> pJointRateDto) {
        this.jointRateDto = pJointRateDto;
    }

    /**
     * Sets the <code>origin</code> property.
     * <p>
     * 
     * @param pOrigin
     *            the current value of the <code>origin</code> property.
     */

    public void setOrigin(final GeographicDataDto pOrigin) {
        this.origin = pOrigin;
    }

}