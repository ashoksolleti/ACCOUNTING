package com.unisys.trans.logistics.lms.framework.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.constants.DocumentStatusType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AWBDocumentDto</code> holds the fixed space allocated for a AWB
 * Document.
 * <p>
 * <ul>
 * <code>
 * <li>airWaybillDto</li>
 * <li>activeAllotmentSegmentDtos</li>
 * <li>airWaybillFindDto</li>
 * <li>documentStatusType</li>
 * <li>flight</li>
 * <li>flightDate</li>
 * <li>oid</li>
 * <li>remarks</li>
 * <li>station</li>
 * <li>statusDate</li>
 * <li>statusTime</li>
 * </code>
 * </ul>
 */
public class AWBDocumentDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>airWaybillDto</code> property.
     */
    private AirWaybillDto airWaybillDto;

    /**
     * Attribute to hold <code>airWaybillFindDto</code> property.
     */
    private AirWaybillFindDto airWaybillFindDto;

    /**
     * Attribute to hold <code>documentStatusType</code> property.
     */
    private DocumentStatusType documentStatusType;

    /**
     * Attribute to hold <code>flight</code> property.
     */
    private BaseFlightDto flight;

    /**
     * Attribute to hold <code>flightdate</code> property.
     */
    private Date flightdate;

    /**
     * Attribute to hold <code>gmtStatusDate</code> property.
     */
    private Date gmtStatusDate;

    /**
     * Attribute to hold <code>gmtStatusTime</code> property.
     */
    private String gmtStatusTime;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>remarks</code> property.
     */
    private String remarks;

    /**
     * Attribute to hold <code>station</code> property.
     */
    private String station;

    /**
     * Attribute to hold <code>statusDate</code> property.
     */
    private Date statusDate;

    /**
     * Attribute to hold <code>statusTime</code> property.
     */
    private String statusTime;
    
    /**
     * Attribute to hold <code>flightField</code> property.
     */
    private String flightField;

    public String getFlightField() {
        return flightField;
    }

    public void setFlightField(String flightField) {
        this.flightField = flightField;
    }

    /**
     * Attribute to hold <code>userAuditDto</code> property.
     */
    private UserAuditDto userAuditDto;

    /**
     * Gets the <code>airWaybillDto</code> property.
     * <p>
     * 
     * @return the current value of <code>airWaybillDto</code> property.
     */
    public AirWaybillDto getAirWaybillDto() {
        if (this.airWaybillDto == null) {
            this.airWaybillDto = new AirWaybillDto();
        }
        return this.airWaybillDto;
    }

    /**
     * Gets the <code>airWaybillFindDto</code> property.
     * <p>
     * 
     * @return the current value of <code>airWaybillFindDto</code> property.
     */
    public AirWaybillFindDto getAirWaybillFindDto() {
        if (this.airWaybillFindDto == null) {
            this.airWaybillFindDto = new AirWaybillFindDto();
        }
        return this.airWaybillFindDto;
    }

    /**
     * Gets the <code>documentStatusType</code> property.
     * <p>
     * 
     * @return the current value of <code>documentStatusType</code> property.
     */
    public DocumentStatusType getDocumentStatusType() {
        return this.documentStatusType;
    }

    /**
     * Gets the <code>flight</code> property.
     * <p>
     * 
     * @return the current value of <code>flight</code> property.
     */
    public BaseFlightDto getFlight() {
        if (this.flight == null) {
            this.flight = new BaseFlightDto();
        }
        return this.flight;
    }

    /**
     * Gets the <code>FlightDate</code> property.
     * <p>
     * 
     * @return the current value of <code>FlightDate</code> property.
     */
    public Date getFlightDate() {
        return ContractUtility.getClonedDate(this.flightdate);
    }

    /**
     * Gets the <code>gmtStatusDate</code> property.
     * <p>
     * 
     * @return the current value of <code>gmtStatusDate</code> property.
     */
    public Date getGmtStatusDate() {
        return ContractUtility.getClonedDate(this.gmtStatusDate);
    }

    /**
     * Gets the <code>gmtStatusDate</code> property.
     * <p>
     * 
     * @return the current value of <code>gmtStatusDate</code> property.
     */
    public String getGmtStatusTime() {
        return this.gmtStatusTime;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>Remarks</code> property.
     * <p>
     * 
     * @return the current value of <code>remarks</code> property.
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * Gets the <code>Station</code> property.
     * <p>
     * 
     * @return the current value of <code>station</code> property.
     */
    public String getStation() {
        return ContractUtility.convertToUpperCase(this.station);
    }

    /**
     * Gets the <code>StatusDate</code> property.
     * <p>
     * 
     * @return the current value of <code>StatusDate</code> property.
     */
    public Date getStatusDate() {
        return ContractUtility.getClonedDate(this.statusDate);
    }

    /**
     * Gets the <code>StatusTime</code> property.
     * <p>
     * 
     * @return the current value of <code>StatusTime</code> property.
     */
    public String getStatusTime() {
        return ContractUtility.convertToUpperCase(this.statusTime);
    }

    /**
     * Gets the <code>UserAuditDto</code> property.
     * <p>
     * 
     * @return the current value of <code>UserAuditDto</code> property.
     */
    public UserAuditDto getUserAuditDto() {
        return this.userAuditDto;
    }

    /**
     * Sets the <code>airWaybillDto</code> property.
     * <p>
     * 
     * @param pAirWaybillDto
     *            the new value of <code>airWaybillDto</code> property.
     */
    public void setAirWaybillDto(final AirWaybillDto pAirWaybillDto) {
        this.airWaybillDto = pAirWaybillDto;
    }

    /**
     * Sets the <code>airWaybillFindDto</code> property.
     * <p>
     * 
     * @param pAirWaybillFindDto
     *            the new value of <code>airWaybillFindDto</code> property.
     */
    public void setAirWaybillFindDto(final AirWaybillFindDto pAirWaybillFindDto) {
        this.airWaybillFindDto = pAirWaybillFindDto;
    }

    /**
     * Sets the <code>documentStatusType</code> property.
     * <p>
     * 
     * @param pDocumentStatusType
     *            the new value of <code>documentStatusType</code> property.
     */
    public void setDocumentStatusType(
                final DocumentStatusType pDocumentStatusType) {
        this.documentStatusType = pDocumentStatusType;
    }

    /**
     * Sets the <code>flight</code> property.
     * <p>
     * 
     * @param pFlight
     *            the new value of <code>flight</code> property.
     */
    public void setFlight(final BaseFlightDto pFlight) {
        this.flight = pFlight;
    }

    /**
     * Sets the <code>Flightdate</code> property.
     * <p>
     * 
     * @param pFlightdate
     *            the new value of <code>Flightdate</code> property.
     */
    public void setFlightDate(final Date pFlightdate) {
        this.flightdate = ContractUtility.getClonedDate(pFlightdate);
    }

    /**
     * Sets the <code>gmtStatusDate</code> property.
     * <p>
     * 
     * @param pGmtStatusDate
     *            the new value of <code>gmtStatusDate</code> property.
     */
    public void setGmtStatusDate(final Date pGmtStatusDate) {
        this.gmtStatusDate = ContractUtility.getClonedDate(pGmtStatusDate);
    }

    /**
     * Sets the <code>gmtStatusTime</code> property.
     * <p>
     * 
     * @param pGmtStatusTime
     *            the new value of <code>gmtStatusTime</code> property.
     */
    public void setGmtStatusTime(final String pGmtStatusTime) {
        this.gmtStatusTime = pGmtStatusTime;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * This object ID is an auto-generated value at the system level. Hence, this cannot be updated.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>remarks</code> property.
     * <p>
     * <b>Format:</b><br>
     * 0-75 Alphabetic, numeric,hyphen, dot and space.
     * <p>
     * 
     * @param pRemarks
     *            the new value of the <code>remarks</code> property.
     */
    public void setRemarks(final String pRemarks) {
        this.remarks = pRemarks;
    }

    /**
     * Sets the <code>Station</code> property.
     * <p>
     * 
     * @param pStation
     *            the new value of <code>Flightdate</code> property.
     */
    public void setStation(final String pStation) {
        this.station = ContractUtility.convertToUpperCase(pStation);
    }

    /**
     * Sets the <code>StatusDate</code> property.
     * <p>
     * 
     * @param pStatusDate
     *            the new value of <code>StatusDate</code> property.
     */
    public void setStatusDate(final Date pStatusDate) {
        this.statusDate = ContractUtility.getClonedDate(pStatusDate);
    }

    /**
     * Sets the <code>StatusTime</code> property.
     * <p>
     * 
     * @param pStatusTime
     *            the new value of <code>StatusTime</code> property.
     */
    public void setStatusTime(final String pStatusTime) {
        this.statusTime = ContractUtility.convertToUpperCase(pStatusTime);
    }

    /**
     * Sets the <code>UserAuditDto</code> property.
     * <p>
     * 
     * @param pUserAuditDto
     *            the new value of <code>UserAuditDto</code> property.
     */
    public void setUserAuditDto(final UserAuditDto pUserAuditDto) {
        this.userAuditDto = pUserAuditDto;
    }

	/**
	 * @return the flightdate
	 */
	public Date getFlightdate() {
		return flightdate;
	}

	/**
	 * @param flightdate the flightdate to set
	 */
	public void setFlightdate(Date flightdate) {
		this.flightdate = flightdate;
	}

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

}
