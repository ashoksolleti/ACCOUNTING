package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.constants.PharmaEventType;
import com.unisys.trans.logistics.lms.framework.constants.PowerUnitType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class PharmaLogEntryDto extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = 8950561971199857698L;

    private Long oId;

    private String containerId;

    private boolean dataLoggerPresent;

    private PharmaEventType pharmaEventType;

    private String eventStation;

    private Date eventDate;

    private String eventTime;

    private String containerTemp;

    private boolean dryIcePresent;

    private BigDecimal dryIceAdded;

    private BigDecimal batteryPower;

    private PowerUnitType batteryPowerUnit;

    private BigDecimal batteryChanged;

    private Boolean batterySecured;

    private String comments;

    private UserAuditDto userAuditDto;

    private String batterySecuredString;
   

    /**
     * Attribute to holds <code>airWaybillNumberDto</code> property.
     */
    private String airwaybillNumber;
    /**
     * Attribute to hold <code>rowIndex </code> property.
     * <p>
     * Datatable row index value
     */
    private String rowIndex;

    public String getContainerId() {
        return this.containerId;
    }

    public void setContainerId(final String pContainerId) {
        this.containerId = ContractUtility.convertToUpperCase(pContainerId);
    }

    public boolean getDataLoggerPresent() {
        return this.dataLoggerPresent;
    }

    public void setDataLoggerPresent(final boolean pDataLoggerPresent) {
        this.dataLoggerPresent = pDataLoggerPresent;
    }

    public String getEventStation() {
        return this.eventStation;
    }

    public void setEventStation(final String pEventStation) {
        this.eventStation = pEventStation;
    }

    public Date getEventDate() {
        return this.eventDate;
    }

    public void setEventDate(final Date pEventDate) {
        this.eventDate = pEventDate;
    }

    public String getContainerTemp() {
        return this.containerTemp;
    }

    public void setContainerTemp(final String pContainerTemp) {
        this.containerTemp = pContainerTemp;
    }

    public boolean getDryIcePresent() {
        return this.dryIcePresent;
    }

    public void setDryIcePresent(final boolean pDryIcePresent) {
        this.dryIcePresent = pDryIcePresent;
    }

    public BigDecimal getDryIceAdded() {
        return this.dryIceAdded;
    }

    public void setDryIceAdded(final BigDecimal pDryIceAdded) {
        this.dryIceAdded = pDryIceAdded;
    }

    public BigDecimal getBatteryPower() {
        return this.batteryPower;
    }

    public void setBatteryPower(final BigDecimal pBatteryPower) {
        this.batteryPower = pBatteryPower;
    }

    public PowerUnitType getBatteryPowerUnit() {
        return this.batteryPowerUnit;
    }

    public void setBatteryPowerUnit(final PowerUnitType pBatteryPowerUnit) {
        this.batteryPowerUnit = pBatteryPowerUnit;
    }

    public BigDecimal getBatteryChanged() {
        return this.batteryChanged;
    }

    public void setBatteryChanged(final BigDecimal pBatteryChanged) {
        this.batteryChanged = pBatteryChanged;
    }

    public Boolean getBatterySecured() {
        return this.batterySecured;
    }

    public void setBatterySecured(final Boolean pBatterySecured) {
        this.batterySecured = pBatterySecured;
    }

    public UserAuditDto getUserAuditDto() {
        if (this.userAuditDto == null) {
            this.userAuditDto = new UserAuditDto();
        }
        return this.userAuditDto;
    }

    public void setUserAuditDto(final UserAuditDto pUserAuditDto) {
        this.userAuditDto = pUserAuditDto;
    }

    public PharmaEventType getPharmaEventType() {
        return this.pharmaEventType;
    }

    public void setPharmaEventType(final PharmaEventType pPharmaEventType) {
        this.pharmaEventType = pPharmaEventType;
    }

    @Override
    public Long getOId() {
        return this.oId;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(final String pComments) {
        this.comments = pComments;
    }

    public String getEventTime() {
        return this.eventTime;
    }

    public void setEventTime(final String pEventTime) {
        this.eventTime = pEventTime;
    }

  

	@Override
    public String toString() {
        final StringBuffer commaSeperatedValue = new StringBuffer(300);
        commaSeperatedValue.append(this.containerId == null ? "" : this.containerId).append(",");
        if (this.dataLoggerPresent) {
            commaSeperatedValue.append("Yes").append(",");
        }
        else {
            commaSeperatedValue.append("No").append(",");
        }
        if (this.pharmaEventType != null) {
            commaSeperatedValue.append(this.pharmaEventType.value()).append(",");
        }
        else {
            commaSeperatedValue.append("").append(",");
        }
        commaSeperatedValue.append(this.eventStation == null ? "" : this.eventStation).append(",");
        commaSeperatedValue.append(this.eventDate == null ? "" : ContractUtility.getFormattedDate(
            "ddMMMyy HHmm", this.eventDate)).append(",");
        
        commaSeperatedValue.append(this.containerTemp == null ? "" : this.containerTemp).append(",");
        if (this.dryIcePresent) {
            commaSeperatedValue.append("Yes").append(",");
        }
        else {
            commaSeperatedValue.append("No").append(",");
        }
        commaSeperatedValue.append(this.dryIceAdded == null ? "" : this.dryIceAdded).append(",");
        if (this.batteryPower != null) {
            commaSeperatedValue.append(this.batteryPower);
            if (this.batteryPowerUnit != null) {
                commaSeperatedValue.append(this.batteryPowerUnit.getValue());
            }
            commaSeperatedValue.append("").append(",");
        }
        else {
            commaSeperatedValue.append("").append(",");
        }
        commaSeperatedValue.append(this.batteryChanged == null ? "" : this.batteryChanged).append(",");
        if (this.batterySecured != null) {
            if (this.batterySecured) {
                commaSeperatedValue.append("Yes").append(",");
            }
            else {
                commaSeperatedValue.append("No").append(",");
            }
        }
        else {
            commaSeperatedValue.append("").append(",");
        }
        if (this.userAuditDto != null) {
            commaSeperatedValue.append(
                this.userAuditDto.getUserIdentifier() == null ? "" : this.userAuditDto.getUserIdentifier())
                        .append(",");
            commaSeperatedValue.append(
                this.userAuditDto.getCreatedOn() == null ? "" : ContractUtility.getFormattedDate(
                    "ddMMMyy HHmm",this.userAuditDto.getCreatedOn())).append(",");
        }
        commaSeperatedValue.append(this.comments == null ? "" : this.comments);
        return commaSeperatedValue.toString();

    }

    public String getRowIndex() {
        return this.rowIndex;
    }

    public void setRowIndex(final String pRowIndex) {
        this.rowIndex = pRowIndex;
    }

    /**
     * @return the batterySecuredString
     */
    public String getBatterySecuredString() {
        return this.batterySecuredString;
    }

    /**
     * @param pBatterySecuredString the batterySecuredString to set
     */
    public void setBatterySecuredString(final String pBatterySecuredString) {
        this.batterySecuredString = pBatterySecuredString;
    }

	public String getAirwaybillNumber() {
		return airwaybillNumber;
	}

	public void setAirwaybillNumber(String airwaybillNumber) {
		this.airwaybillNumber = airwaybillNumber;
	}

	

	



}
