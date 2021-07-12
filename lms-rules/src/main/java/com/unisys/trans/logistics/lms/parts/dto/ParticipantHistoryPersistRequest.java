package com.unisys.trans.logistics.lms.parts.dto;

/**
 * <code>ParticipantHistoryPersistRequest</code> class represents the request to display and perform crud operations in Participant Information page.
 * <p>
 * <code>ParticipantHistoryPersistRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>ParticipantHistoryDto
 * <li>ParticipantHistoryChangeDetailsDto
 * <li>oldObject
 * <li>newObject
 * <li>status
 * </code>
 * </ul>
 */
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class ParticipantHistoryPersistRequest extends AbstractRequest {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /**
     * Attribute to hold <code>participantHistoryDto</code> property.
     * <p>
     * Holds the participantHistoryDto object of a particular Participant.
     * etc.
     */

    private ParticipantHistoryDto participantHistoryDto;
    /**
     * Attribute to hold <code>participantHistoryChangeDetailsDto</code> property.
     * <p>
     * Holds the participantHistoryChangeDetailsDto object of a particular Participant.
     * etc.
     */
    private ParticipantHistoryChangeDetailsDto participantHistoryChangeDetailsDto;

    /**
     * Attribute to hold <code>oldObject</code> property.
     * <p>
     * Holds the old domain object of a particular owner. 
     * etc.
     */
    private Object oldObject;

    /**
     * Attribute to hold <code>newObject</code> property.
     * <p>
     * The latest or new domain object of a particular owner. 
     * etc.
     */
    private Object newObject;

    /**
     * Attribute to hold <code>status</code> property.
     * <p>
     * <code>status</code> indicates the status of record.
     * <p>
     * The status can be any one of the following:
     * <ul>
     * <li>DEL - Static data deleted
     * <li>ADD - New data added
     * <li>UPD - Static data updated
     * </ul>
     */
    private String status;

    /**
     * Gets the <code>status</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * DEL
     * <p>
     * 
     * @return the current value of <code>status</code> property.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Sets the <code>status</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * DEL
     * <p>
     * 
     * @param pStatus the new value of <code>status</code> property.
     */
    public void setStatus(final String pStatus) {
        this.status = pStatus;
    }
    /**
     * @return the oldObject
     */
    public Object getOldObject() {
        return oldObject;
    }

    /**
     * @param oldObject the oldObject to set
     */
    public void setOldObject(final Object pOldObject) {
        this.oldObject = pOldObject;
    }

    /**
     * @return the newObject
     */
    public Object getNewObject() {
        return newObject;
    }

    /**
     * @param newObject the newObject to set
     */
    public void setNewObject(final Object pNewObject) {
        this.newObject = pNewObject;
    }

    /**
     * @return the participantHistoryDto
     */
    public ParticipantHistoryDto getParticipantHistoryDto() {
        if (this.participantHistoryDto == null)
        {
            this.participantHistoryDto = new ParticipantHistoryDto();
        }
        return participantHistoryDto;
    }

    /**
     * @param pParticipantHistoryDto the participantHistoryDto to set
     */
    public void setParticipantHistoryDto(final ParticipantHistoryDto pParticipantHistoryDto) {
        this.participantHistoryDto = pParticipantHistoryDto;
    }

    /**
     * @return the participantHistoryChangeDetailsDto
     */
    public ParticipantHistoryChangeDetailsDto getParticipantHistoryChangeDetailsDto() {
        return participantHistoryChangeDetailsDto;
    }

    /**
     * @param pParticipantHistoryChangeDetailsDto the participantHistoryChangeDetailsDto to set
     */
    public void setParticipantHistoryChangeDetailsDto(final
                ParticipantHistoryChangeDetailsDto pParticipantHistoryChangeDetailsDto) {
        this.participantHistoryChangeDetailsDto = pParticipantHistoryChangeDetailsDto;
    }

}
