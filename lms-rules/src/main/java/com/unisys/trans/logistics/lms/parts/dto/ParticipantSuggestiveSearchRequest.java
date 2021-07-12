package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class ParticipantSuggestiveSearchRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3124855452458564031L;

    /**
     * Attribute to hold <code>participantSuggestiveSearchDto<code> property.
     */
    private ParticipantSuggestiveSearchDto participantSuggestiveSearchDto;

    /**
     * Gets the <code>participantSuggestiveSearchDto</code> property.
     * <p>
     * 
     * @return the current value of <code>participantSuggestiveSearchDto</code> property.<br>
     * 
     */
    public ParticipantSuggestiveSearchDto getParticipantSuggestiveSearchDto() {
        return participantSuggestiveSearchDto;
    }

    /**
     * Sets the <code>participantSuggestiveSearchDto</code> property.
     * <p>
     * 
     * @param pParticipantSuggestiveSearchDto the new value of <code>participantSuggestiveSearchDto</code> of
     *            the participant.<br>
     */
    public void setParticipantSuggestiveSearchDto(
                final ParticipantSuggestiveSearchDto pParticipantSuggestiveSearchDto) {
        this.participantSuggestiveSearchDto = pParticipantSuggestiveSearchDto;
    }
}
