package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto;

public class ManualAdjustmentResponse extends AbstractResponse {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>manualAdjustments</code> property.
     */
    private List<ParticipantReceivableDto> participantReceivableDtos;

    private ParticipantReceivableDto participantReceivableDto;

    private String name;

    public String getName() {
        return this.name;
    }

    private String station;

    public ParticipantAccountType getAccountType() {
        return this.accountType;
    }

    public void setAccountType(final ParticipantAccountType pAccountType) {
        this.accountType = pAccountType;
    }

    public void setName(final String pName) {
        this.name = pName;
    }

    public String getStation() {
        return this.station;
    }

    public void setStation(final String pStation) {
        this.station = pStation;
    }

    private ParticipantAccountType accountType;

    public String getParticipantNumber() {
        return this.participantNumber;
    }

    public void setParticipantNumber(final String pParticipantNumber) {
        this.participantNumber = pParticipantNumber;
    }

    private String participantNumber;

    public ParticipantReceivableDto getParticipantReceivableDto() {
        return this.participantReceivableDto;
    }

    public void setParticipantReceivableDto(final ParticipantReceivableDto pParticipantReceivableDto) {
        this.participantReceivableDto = pParticipantReceivableDto;
    }

    /**
     * Gets the <code>participantReceivableDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantReceivableDtos</code> property.
     */
    public List<ParticipantReceivableDto> getParticipantReceivableDtos() {
        return this.participantReceivableDtos;
    }

    /**
     * Sets the <code>manualAdjustments</code>.
     * <p>
     * 
     * @param pManualAdjustments
     *            holds the new value of <code>manualAdjustments</code>
     */

    public void setParticipantReceivableDtos(final List<ParticipantReceivableDto> pParticipantReceivableDtos) {
        this.participantReceivableDtos = pParticipantReceivableDtos;
    }

    /**
     * Attribute to hold <code>participantSearchDto</code> property.
     */
    private List<ParticipantSearchDto> participantSearchDto;

    /**
     * Gets the <code>accountingparticipants</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantSearchDto</code> property.
     */
    public List<ParticipantSearchDto> getParticipantSearchDto() {
        return this.participantSearchDto;
    }

    /**
     * Gets the <code>accountingparticipants</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantSearchDto</code> property.
     */

    public void setParticipantSearchDto(final List<ParticipantSearchDto> pParticipantSearchDto) {
        this.participantSearchDto = pParticipantSearchDto;
    }

}
