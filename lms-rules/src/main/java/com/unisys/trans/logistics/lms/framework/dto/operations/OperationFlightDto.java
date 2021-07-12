package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.FlightStatusType;
import com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>FlightDto</code> class represents the Flight information.
 *
 */
public class OperationFlightDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /* TODO------------------------------------------- Xubing add ------------------------------------------- */
    /**
     * Attribute to hold <code>activationTimestamp</code> property.
     */
    private Date activationTimestamp;

    /**
     * Attribute to hold <code>Flight</code> property.
     */
    private BaseFlightDto baseFlightDto;

    /**
     * Attribute to hold <code>controllingOffice</code> property.
     */
    private String controllingOffice;

    /**
     * Attribute to hold <code>controllingStation</code> property.
     */
    private String controllingStation;

    /**
     * Attribute to hold <code>flightDate</code> property.
     */
    private Date flightDate;
   

    /**
     * Attribute to hold <code>flightStatus</code> property.
     */
    private FlightStatusType flightStatus;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>legs</code> property.
     */
    private List<OperationFlightLegDto> operationFlightLegDtos;

    /**
     * Attribute to hold <code>segments</code> property.
     */
    private List<OperationFlightSegmentDto> operationFlightSegmentDtos;

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((flightDate == null) ? 0 : flightDate.hashCode());
		return result;
	}

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final OperationFlightDto otherOperationFlightDto = (OperationFlightDto) obj;

        if (this.flightDate == null) {
            if (otherOperationFlightDto.flightDate != null) {
                return false;
            }
        }
        else if (!this.flightDate.equals(otherOperationFlightDto.flightDate)) {
            return false;
        }

        if (this.baseFlightDto == null) {
            if (otherOperationFlightDto.baseFlightDto != null) {
                return false;
            }
        }
        else if (!this.baseFlightDto.equals(otherOperationFlightDto.baseFlightDto)) {
            return false;
        }
        return true;
    }

    public Date getActivationTimestamp() {
        if(this.activationTimestamp!=null){
            return (Date)this.activationTimestamp.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Gets the <code>BaseFlightDto</code> property.
     * <p>
     *
     * @return the current value of the <code>BaseFlightDto</code> property.<br>
     */
    public BaseFlightDto getBaseFlightDto() {
        return this.baseFlightDto;
    }

    public String getControllingOffice() {
        return this.controllingOffice;
    }

    public String getControllingStation() {
        return this.controllingStation;
    }

    /**
     * Gets the <code>FlightDate</code> property.
     * <p>
     *
     * @return the current value of the <code>FlightDate</code> property.<br>
     */
    public Date getFlightDate() {
        if(this.flightDate!=null){
            return (Date)this.flightDate.clone();
            }
            else{
                return null;
            }
    }

    public FlightStatusType getFlightStatus() {
        return this.flightStatus;
    }

    /**
     * Returns the flight leg object whose origin and destination station are
     * same as that of the provided origin and destination stations.
     * <p>
     * In case if only the origin station is provided, this method returns the flight leg whose origin station
     * is same as that of the input origin station.
     * <p>
     *
     * @param pOrigin
     *            Origin station of the flight leg.
     * @param pDestination
     *            Destination station of the flight leg.
     * @return Returns the flight leg object from the list of flight legs
     *         associated with a flight, whose origin and destination stations
     *         are same as that of the provided origin and destination stations.
     */
    public OperationFlightLegDto getLeg(final String pOrigin, final String pDestination) {

        if (pOrigin != null && !pOrigin.trim().equals("")) {
            if (pDestination != null && !pDestination.trim().equals("")) {
                // if Origin and Destination exists
                for (final OperationFlightLegDto aLeg : this.getOperationFlightLegDtos()) {
                    if (aLeg.getBaseFlightLeg().getOrigin()
                                .equalsIgnoreCase(pOrigin)
                                && aLeg.getBaseFlightLeg().getDestination()
                                .equalsIgnoreCase(pDestination)) {
                        return aLeg;
                    }
                }
            }
            else {
                // if Destination not exists
                for (final OperationFlightLegDto aLeg : this.getOperationFlightLegDtos()) {
                    if (aLeg.getBaseFlightLeg().getOrigin()
                                .equalsIgnoreCase(pOrigin)) {
                        return aLeg;
                    }
                }
            }
        }
        else if (pDestination != null && !pDestination.trim().equals("")) {
            // if Origin not exists
            for (final OperationFlightLegDto aLeg : this.getOperationFlightLegDtos()) {
                if (aLeg.getBaseFlightLeg().getDestination()
                            .equalsIgnoreCase(pDestination)) {
                    return aLeg;
                }
            }
        }
        return null;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     *
     * @return the current value of the <code>OId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>operationFlightLegDtos</code> property.
     * <p>
     *
     * @return the current value of the <code>operationFlightLegDtos</code> property.<br>
     */
    public List<OperationFlightLegDto> getOperationFlightLegDtos() {
        return this.operationFlightLegDtos;
    }

    /**
     * Gets the <code>operationFlightSegmentDtos</code> property.
     * <p>
     *
     * @return the current value of the <code>operationFlightSegmentDtos</code> property.<br>
     */
    public List<OperationFlightSegmentDto> getOperationFlightSegmentDtos() {
        return this.operationFlightSegmentDtos;
    }

    /**
     * Returns the flight segment object whose origin and destination station
     * are same as that of the provided origin and destination stations.
     * <p>
     * In case if only the origin station is provided, this method returns the flight segment objects whose
     * origin station is same as that of the input origin station.
     * <p>
     * In case if only the destination station is provided, this method returns the flight segment objects
     * whose destination station is same as that of the input destination station.
     * <p>
     * When both the origin and destination stations are provided, the unique segment is returned.
     * <p>
     * Notice: the orgin and destination can't be null at the same time.
     * <p>
     *
     * @param pDestination
     *            Destination station of the flight segment. This field is
     *            optional.
     * @param pOrigin
     *            Origin station of the flight segment. This field is mandatory.
     * @return Represents the list of segment domain objects associated with a
     *         flight. In case if only the origin station is provided, this
     *         method returns the flight segment objects whose origin station is
     *         same as that of the input origin station. When both the origin
     *         and destination stations are provided, the unique segment is
     *         returned.
     */
    public List<OperationFlightSegmentDto> getSegments(final String pDestination,
        final String pOrigin) {
        final List<OperationFlightSegmentDto> aSegments = new ArrayList<OperationFlightSegmentDto>();
        if (pOrigin != null && !pOrigin.trim().equals("")) {
            if (pDestination != null && !pDestination.trim().equals("")) {
                for (final OperationFlightSegmentDto pSegment : this.getOperationFlightSegmentDtos()) {
                    if (pOrigin.equals(pSegment.getBaseFlightSegmentDto()
                        .getOrigin())
                        && pDestination.equals(pSegment
                            .getBaseFlightSegmentDto().getDestination())) {
                        aSegments.add(pSegment);
                    }
                }
            }
            else {
                for (final OperationFlightSegmentDto pSegment : this
                            .getOperationFlightSegmentDtos()) {
                    if (pOrigin.equals(pSegment.getBaseFlightSegmentDto()
                        .getOrigin())) {
                        aSegments.add(pSegment);
                    }
                }
            }
        }
        else {
            if (pDestination != null && !pDestination.trim().equals("")) {
                for (final OperationFlightSegmentDto pSegment : this
                            .getOperationFlightSegmentDtos()) {
                    if (pDestination.equals(pSegment.getBaseFlightSegmentDto()
                        .getDestination())) {
                        aSegments.add(pSegment);
                    }
                }
            }
        }
        return aSegments;
    }

    public void setActivationTimestamp(final Date activationTimestamp) {
        if(activationTimestamp!=null){
        	this.activationTimestamp =(Date) activationTimestamp.clone();
          } 
        else
        {
        	this.activationTimestamp=null;
        }
    }

    /**
     * Sets the <code>BaseFlightDto</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>BaseFlightDto</code> property.<br>
     */
    public void setBaseFlightDto(final BaseFlightDto pBaseFlightDto) {
        this.baseFlightDto = pBaseFlightDto;
    }

    public void setControllingOffice(final String controllingOffice) {
        this.controllingOffice = controllingOffice;
    }

    public void setControllingStation(final String controllingStation) {
        this.controllingStation = controllingStation;
    }

    /**
     * Sets the <code>FlightDate</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>FlightDate</code> property.<br>
     */
    public void setFlightDate(final Date pFlightDate) {
        if(pFlightDate!=null){
        	this.flightDate =(Date) pFlightDate.clone();
          }  
        else
        {
        	this.flightDate=null;
        }
    }

    public void setFlightStatus(final FlightStatusType flightStatus) {
        this.flightStatus = flightStatus;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>OId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>operationFlightLegDtos</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>operationFlightLegDtos</code> property.<br>
     */
    public void setOperationFlightLegDtos(final List<OperationFlightLegDto> operationFlightLegDtos) {
        this.operationFlightLegDtos = operationFlightLegDtos;
    }

    /**
     * Sets the <code>operationFlightSegmentDtos</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>operationFlightSegmentDtos</code> property.<br>
     */
    public
                void
                setOperationFlightSegmentDtos(final List<OperationFlightSegmentDto> operationFlightSegmentDtos) {
        this.operationFlightSegmentDtos = operationFlightSegmentDtos;
    }
}
