package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

import java.util.List;

/**
 * <code>ParticipantMultipleFindRequest</code> is used to find multiple participants for the specified
 * participant details.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>participantSearchDtos</code></li>
 * </ul>
 */
public class ParticipantMultipleFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 4636711372060251897L;

    /**
     * Attribute to hold the <code>participantSearchDtos</code> object.
     */
    private List<ParticipantSearchDto> participantSearchDtos;

    /**
     * Gets the <code>participantSearchDtos</code> property.
     * 
     * @return the current value of the <code>participantSearchDtos</code> property.
     */
    public List<ParticipantSearchDto> getParticipantSearchDtos() {
        return participantSearchDtos;
    }

    /**
     * Sets the <code>participantSearchDtos</code> property.
     * 
     * @param pParticipantSearchDtos the new value of the <code>participantSearchDtos</code> property.
     */
    public void setParticipantSearchDtos(final List<ParticipantSearchDto> pParticipantSearchDtos) {
        this.participantSearchDtos = pParticipantSearchDtos;
    }

}
