/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.PreferencesDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.SSDScreeningType;

/**
 * <code>Station</code> entity contains specific data applicable to the station.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>address
 * <li>agencyHolidayHoursDtos
 * <li>agencyHoursDtos
 * <li>area
 * <li>billingCurrency
 * <li>collectCharges
 * <li>connectionTimeDtos
 * <li>district
 * <li>domesticCutOffTimeDtos
 * <li>domesticPrescreenCutOfftimeDtos
 * <li>drivingDirections
 * <li>firmsCode
 * <li>handlerEORI
 * <li>handlerName
 * <li>hostInd
 * <li>internationalCutOffTimeDtos
 * <li>internationalPrescreenCutOfftimeDtos
 * <li>latitude
 * <li>loadInputText
 * <li>localCurrency
 * <li>longitude
 * <li>mechanizedInd
 * <li>monthHolidayDtos
 * <li>nextTimeChange
 * <li>oId
 * <li>operationalContactDtos
 * <li>otherSpecialInstructionDtos
 * <li>phone
 * <li>portNumber
 * <li>quickRampTransfer
 * <li>region
 * <li>salesContactDtos
 * <li>shipmentsInspected
 * <li>specialStationInstructionDtos
 * <li>ssdPrinterId
 * <li>ssdScreeningMethod
 * <li>ssdScreeningType
 * <li>stationAgencyLabels
 * <li>stationCode
 * <li>stationControlUserAudit
 * <li>stationFacilityAttributeDtos
 * <li>stationFacilityContactDtos
 * <li>stationHandlingDetailDtos
 * <li>stationHolidayHours
 * <li>stationHourDtos
 * <li>stationInfoInd
 * <li>stationLocationDtos
 * <li>stationName
 * <li>stationQuestions
 * <li>stationSupplementalLabels
 * <li>subArea
 * <li>subDistrict
 * <li>supplementalStationHolidayDtos
 * <li>supplementalStationHourDtos
 * <li>teleType
 * <li>teleTypeCustomsInd
 * <li>teleTypeUsed
 * <li>timeDifferential
 * <li>transferStationDtos
 * <li>userAudit
 * <li>weightUnit
 * </code>
 * </ul>
 */
public class StationInfoDto extends PersistenceObjectDto {
    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = 8990023969529104542L;

    /**
     * Attribute to hold <code>address</code> property.
     */
    private String address;

    /**
     * Attribute to hold list of<code>agencyHolidayHoursDtos</code> property.
     */
    private List<SupplementalAgencyHoursDto> agencyHolidayHoursDtos;

    /**
     * Attribute to hold list of<code>agencyHoursDtos</code> property.
     */
    private List<SupplementalAgencyHoursDto> agencyHoursDtos;

    /**
     * Attribute to hold <code>area</code> property.
     */
    private String area;

    /**
     * Attribute to hold <code>billingCurrency</code> property.
     */
    private String billingCurrency;

    /**
     * Attribute to hold list of<code>connectionTimeDtos</code> property.
     */
    private List<StationInformationConnectionTimeDto> connectionTimeDtos;
    
    /**
     * Attribute to hold<code>collectCharges</code> property.
     */
    private String collectCharges;

    /**
     * Attribute to hold <code>district</code> property.
     */
    private String district;

    /**
     * Attribute to hold list of<code>domesticCutOffTimeDtos</code> property.
     */
    private List<CutOffTimeDto> domesticCutOffTimeDtos;

    /**
     * Attribute to hold list of<code>domesticPrescreenCutOfftimeDtos</code> property.
     */
    private List<CutOffTimeDto> domesticPrescreenCutOfftimeDtos;

    /**
     * Attribute to hold <code>drivingDirections</code> property.
     */
    private String drivingDirections;

    /**
     * Attribute to hold <code>firmsCode</code> property.
     */

    private String firmsCode;

    /**
     * Attribute to hold <code>handlerEORI</code> property.
     */

    private String handlerEORI;

    /**
     * Attribute to hold <code>handlerName</code> property.
     */

    private String handlerName;

    /**
     * Attribute to hold <code>hostInd</code> property.
     */

    private boolean hostInd;

    /**
     * Attribute to hold list of<code>internationalCutOffTimeDtos</code> property.
     */
    private List<CutOffTimeDto> internationalCutOffTimeDtos;

    /**
     * Attribute to hold list of <code>internationalPrescreenCutOfftimeDtos</code> property.
     */
    private List<CutOffTimeDto> internationalPrescreenCutOfftimeDtos;

    /**
     * Attribute to hold <code>latitude</code> property.
     */
    private String latitude;

    /**
     * Attribute to hold <code>address</code> property.
     */
    private String[] loadInputText;

    /**
     * Attribute to hold <code>localCurrency</code> property.
     */
    private String localCurrency;

    /**
     * Attribute to hold <code>longitude</code> property.
     */
    private String longitude;

    /**
     * Attribute to hold <code>mechanizedInd</code> property.
     */
    private boolean mechanizedInd;

    /**
     * Attribute to hold list of<code>monthHolidayDtos</code> property.
     */
    private List<MonthHolidayDto> monthHolidayDtos;

    /**
     * Attribute to hold <code>nextTimeChange</code> property.
     */
    private Date nextTimeChange;

    /**
     * Attribute to hold <code>oId</code> property. Unique identifier for
     * station
     */
    private Long oId;

    /**
     * Attribute to hold list of<code>operationalContactDtos</code> property.
     */
    private List<StationContactDto> operationalContactDtos;

    /**
     * Attribute to hold list of<code>otherSpecialInstructionDtos</code> property.
     */
    private List<SpecialInstructionDto> otherSpecialInstructionDtos;

    /**
     * Attribute to hold <code>phone</code> property.
     */

    private String phone;

    /**
     * Attribute to hold <code>portNumber</code> property.
     */

    private String portNumber;

    /**
     * Attribute to hold <code>quickRampTransfer</code> property.
     */
    private String quickRampTransfer;

    /**
     * Attribute to hold <code>region</code> property.
     */
    private String region;

    /**
     * Attribute to hold list of<code>salesContactDtos</code> property.
     */
    private List<StationContactDto> salesContactDtos;

    /**
     * Attribute to hold <code>shipmentsInspected</code> property.
     */

    private String shipmentsInspected;

    /**
     * Attribute to hold list of<code>specialStationInstructionDtos</code> property.
     */
    private List<SpecialInstructionDto> specialStationInstructionDtos;

    /**
     * Attribute to hold <code>ssdPrinterId</code> property.
     */

    private String ssdPrinterId;

    /**
     * Attribute to hold <code>ssdScreeningMethod</code> property.
     */

    private String ssdScreeningMethod;

    /**
     * Attribute to hold <code>ssdScreeningType</code> property.
     */
    private SSDScreeningType ssdScreeningType;

    /**
     * Attribute to hold list of<code>stationAgencyLabels</code> property.
     */
    private List<StationInfoSectionLabelDto> stationAgencyLabels;

    /**
     * Attribute to hold<code>stationCode</code> property.
     */
    private String stationCode;

    /**
     * Attribute to hold <code>stationControlUserAudit</code> property.
     */

    private UserAuditDto stationControlUserAudit;

    /**
     * Attribute to hold list of<code>stationFacilityAttributeDtos</code> property.
     */
    private List<StationFacilityAttributeDto> stationFacilityAttributeDtos;

    /**
     * Attribute to hold list of<code>stationFacilityContactDtos</code> property.
     */
    private List<StationFacilityContactDto> stationFacilityContactDtos;

    /**
     * Attribute to hold list of<code>stationHandlingDetailDtos</code> property.
     */

    private List<StationHandlingDetailDto> stationHandlingDetailDtos;

    /**
     * Attribute to hold list of<code>stationHolidayHours</code> property.
     */
    private List<StationHourDto> stationHolidayHours;

    /**
     * Attribute to hold list of<code>stationHourDtos</code> property.
     */
    private List<StationHourDto> stationHourDtos;

    /**
     * Attribute to hold <code>stationInfoInd</code> property.
     */
    private boolean stationInfoInd = true;

    /**
     * Attribute to hold list of<code>stationLocationDtos</code> property.
     */
    private List<StationLocationDto> stationLocationDtos;

    /**
     * Attribute to hold <code>stationName</code> property.
     */
    private String stationName;

    /**
     * Attribute to hold list of<code>stationQuestions</code> property.
     */

    private List<StationQuestionDto> stationQuestions;

    /**
     * Attribute to hold list of<code>stationSupplementalLabels</code> property.
     */
    private List<StationInfoSectionLabelDto> stationSupplementalLabels;

    /**
     * Attribute to hold <code>subArea</code> property.
     */
    private String subArea;

    /**
     * Attribute to hold <code>subDistrict</code> property.
     */
    private String subDistrict;

    /**
     * Attribute to hold list of<code>supplementalStationHolidayDtos</code> property.
     */
    private List<SupplementalAgencyHoursDto> supplementalStationHolidayDtos;

    /**
     * Attribute to hold list of<code>supplementalStationHourDtos</code> property.
     */
    private List<SupplementalAgencyHoursDto> supplementalStationHourDtos;

    /**
     * Attribute to hold <code>teleType</code> property.
     */

    private String teleType;

    /**
     * Attribute to hold <code>teleTypeCustomsInd</code> property.
     */

    private boolean teleTypeCustomsInd;

    /**
     * Attribute to hold <code>teleTypeUsed</code> property.
     */

    private Boolean teleTypeUsed;

    /**
     * Attribute to hold <code>timeDifferential</code> property.
     */
    private Float timeDifferential;

    /**
     * Attribute to hold list of<code>transferStationDtos</code> property.
     */
    private List<StationInformationConnectionTimeDto> transferStationDtos;

    /**
     * Attribute to hold <code>userAudit</code> property.
     */
    private UserAuditDto userAudit;

    /**
     * Attribute to hold <code>weightUnit</code> property.
     */
    private WeightUOMType weightUnit;

    /**
     * Attribute to hold the <code>prefernceDtos</code> object.
     */
    private List<PreferencesDto> prefernceDtos;

    public List<PreferencesDto> getPrefernceDtos() {
        return prefernceDtos;
    }

    public void setPrefernceDtos(List<PreferencesDto> prefernceDtos) {
        this.prefernceDtos = prefernceDtos;
    }

    /**
     * Default constructor.
     */

    public StationInfoDto() {

    }

    /**
     * Constructor with code as an argument.
     * <p>
     * 
     * @param pStationCode
     *            the new value of the <code>stationCode</code> property.
     * @param pOId
     *            the new value of the <code>oId</code> property.
     * @param pStationName
     *            the new value of the <code>stationName</code> property.
     */
    public StationInfoDto(final String pStationCode, final long pOId,
                final String pStationName) {
        this.stationCode = pStationCode;
        this.oId = pOId;
        this.stationName = pStationName;
    }

    /**
     * Gets the <code>address</code> property.
     * <p>
     * 
     * @return the current value of the <code>address</code> property.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto
     * SupplementalAgencyHoursDto} containing <code>SupplementalAgencyHoursDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>agencyHolidayHoursDtos</code> property.
     */
    public List<SupplementalAgencyHoursDto> getAgencyHolidayHoursDtos() {
        if (this.agencyHolidayHoursDtos == null) {
            this.agencyHolidayHoursDtos = new ArrayList<SupplementalAgencyHoursDto>();
        }
        return this.agencyHolidayHoursDtos;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.AddOnRateEntryDto
     * AddOnRateEntryDto} containing <code>SupplementalAgencyHoursDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>agencyHoursDtos</code> property.
     */
    public List<SupplementalAgencyHoursDto> getAgencyHoursDtos() {
        if (this.agencyHoursDtos == null) {
            this.agencyHoursDtos = new ArrayList<SupplementalAgencyHoursDto>();
        }
        return this.agencyHoursDtos;
    }

    /**
     * Gets the <code>area</code> property.
     * <p>
     * 
     * @return the current value of the <code>area</code> property.
     */
    public String getArea() {
        return this.area;
    }

    /**
     * Gets the <code>billingCurrency</code> property.
     * <p>
     * 
     * @return the current value of the <code>billingCurrency</code> property.
     */
    public String getBillingCurrency() {
        return this.billingCurrency;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.StationInformationConnectionTimeDto
     * StationInformationConnectionTimeDto} containing <code>StationInformationConnectionTimeDto</code>
     * details.
     * <p>
     * 
     * @return the current value of the <code>connectionTimeDtos</code> property.
     */
    public List<StationInformationConnectionTimeDto> getConnectionTimeDtos() {
        if (this.connectionTimeDtos == null) {
            this.connectionTimeDtos = new ArrayList<StationInformationConnectionTimeDto>();
        }
        return this.connectionTimeDtos;
    }

    /**
     * Gets the <code>district</code> property.
     * <p>
     * 
     * @return the current value of the <code>district</code> property.
     */
    public String getDistrict() {
        return this.district;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.DomesticCutOffTimeDto
     * CutOffTimeDto} containing <code>domesticCutOffTimeDtos</code> details.
     * <p>
     * 
     * @return the current value of the <code>domesticCutOffTimeDtos</code> property.
     */
    public List<CutOffTimeDto> getDomesticCutOffTimeDtos() {
        if (this.domesticCutOffTimeDtos == null) {
            this.domesticCutOffTimeDtos = new ArrayList<CutOffTimeDto>();
        }
        return this.domesticCutOffTimeDtos;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.CutOffTimeDto
     * CutOffTimeDto} containing <code>CutOffTimeDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>domesticPrescreenCutOfftimeDtos</code> property.
     */
    public List<CutOffTimeDto> getDomesticPrescreenCutOfftimeDtos() {
        if (this.domesticPrescreenCutOfftimeDtos == null) {
            this.domesticPrescreenCutOfftimeDtos = new ArrayList<CutOffTimeDto>();
        }
        return this.domesticPrescreenCutOfftimeDtos;
    }

    /**
     * Gets the <code>drivingDirections</code> property.
     * <p>
     * 
     * @return the current value of the <code>drivingDirections</code> property.
     */
    public String getDrivingDirections() {
        return this.drivingDirections;
    }

    /**
     * Gets the <code>firmsCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>firmsCode</code> property.
     */
    public String getFirmsCode() {
        return this.firmsCode;
    }

    /**
     * Gets the <code>handlerEORI</code> property.
     * <p>
     * 
     * @return the current value of the <code>handlerEORI</code> property.
     */
    public String getHandlerEORI() {
        return this.handlerEORI;
    }

    /**
     * Gets the <code>handlerName</code> property.
     * <p>
     * 
     * @return the current value of the <code>handlerName</code> property.
     */
    public String getHandlerName() {
        return this.handlerName;
    }

    /**
     * Gets the <code>hostInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>hostInd</code> property.
     */
    public boolean getHostInd() {
        return this.hostInd;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.CutOffTimeDto
     * CutOffTimeDto} containing <code>CutOffTimeDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>internationalCutOffTimeDtos</code> property.
     */
    public List<CutOffTimeDto> getInternationalCutOffTimeDtos() {
        if (this.internationalCutOffTimeDtos == null) {
            this.internationalCutOffTimeDtos = new ArrayList<CutOffTimeDto>();
        }
        return this.internationalCutOffTimeDtos;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.CutOffTimeDto
     * CutOffTimeDto} containing <code>CutOffTimeDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>internationalPrescreenCutOfftimeDtos</code> property.
     */
    public List<CutOffTimeDto> getInternationalPrescreenCutOfftimeDtos() {
        if (this.internationalPrescreenCutOfftimeDtos == null) {
            this.internationalPrescreenCutOfftimeDtos = new ArrayList<CutOffTimeDto>();
        }
        return this.internationalPrescreenCutOfftimeDtos;
    }

    /**
     * Gets the <code>latitude</code> property.
     * <p>
     * 
     * @return the current value of the <code>latitude</code> property.
     */
    public String getLatitude() {
        return this.latitude;
    }

    /**
     * Gets the <code>loadInputText</code> property.
     * <p>
     * 
     * @return the current value of the <code>loadInputText</code> property.
     */
    public String[] getLoadInputText() {
        return this.loadInputText;
    }

    /**
     * Gets the <code>localCurrency</code> property.
     * <p>
     * 
     * @return the current value of the <code>localCurrency</code> property.
     */
    public String getLocalCurrency() {
        return this.localCurrency;
    }

    /**
     * Gets the <code>longitude</code> property.
     * <p>
     * 
     * @return the current value of the <code>longitude</code> property.
     */
    public String getLongitude() {
        return this.longitude;
    }

    /**
     * Gets the <code>mechanizedInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>mechanizedInd</code> property.
     */
    public boolean getMechanizedInd() {
        return this.mechanizedInd;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.MonthHolidayDto
     * MonthHolidayDto} containing <code>MonthHolidayDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>monthHolidayDtos</code> property.
     */
    public List<MonthHolidayDto> getMonthHolidayDtos() {
        if (this.monthHolidayDtos == null) {
            this.monthHolidayDtos = new ArrayList<MonthHolidayDto>();
        }
        return this.monthHolidayDtos;
    }

    /**
     * Gets the <code>nextTimeChange</code> property.
     * <p>
     * 
     * @return the current value of the <code>nextTimeChange</code> property.
     */
    public Date getNextTimeChange() {
        return ContractUtility.getClonedDate(this.nextTimeChange);
    }

    /**
     * Gets the value of <code>OID</code> property.
     * <p>
     * Unique identifier for station.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto
     * StationContactDto} containing <code>StationContactDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>operationalContactDtos</code> property.
     */
    public List<StationContactDto> getOperationalContactDtos() {
        if (this.operationalContactDtos == null) {
            this.operationalContactDtos = new ArrayList<StationContactDto>();
        }
        return this.operationalContactDtos;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto
     * SpecialInstructionDto} containing <code>SpecialInstructionDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>otherSpecialInstructionDtos</code> property.
     */
    public List<SpecialInstructionDto> getOtherSpecialInstructionDtos() {
        if (this.otherSpecialInstructionDtos == null) {
            this.otherSpecialInstructionDtos = new ArrayList<SpecialInstructionDto>();
        }
        return this.otherSpecialInstructionDtos;
    }

    /**
     * Gets the <code>phone</code> property.
     * <p>
     * 
     * @return the current value of the <code>phone</code> property.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Gets the <code>portNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>portNumber</code> property.
     */
    public String getPortNumber() {
        return this.portNumber;
    }

    /**
     * Gets the <code>quickRampTransfer</code> property.
     * <p>
     * 
     * @return the current value of the <code>quickRampTransfer</code> property.
     */
    public String getQuickRampTransfer() {
        return this.quickRampTransfer;
    }

    /**
     * Gets the <code>region</code> property.
     * <p>
     * 
     * @return the current value of the <code>region</code> property.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto
     * StationContactDto} containing <code>StationContactDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>salesContactDtos</code> property.
     */
    public List<StationContactDto> getSalesContactDtos() {
        if (this.salesContactDtos == null) {
            this.salesContactDtos = new ArrayList<StationContactDto>();
        }
        return this.salesContactDtos;
    }

    /**
     * Gets the <code>shipmentsInspected</code> property.
     * <p>
     * 
     * @return the current value of the <code>shipmentsInspected</code> property.
     */
    public String getShipmentsInspected() {
        return this.shipmentsInspected;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto
     * SpecialInstructionDto} containing <code>SpecialInstructionDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>specialStationInstructionDtos</code> property.
     */
    public List<SpecialInstructionDto> getSpecialStationInstructionDtos() {
        if (this.specialStationInstructionDtos == null) {
            this.specialStationInstructionDtos = new ArrayList<SpecialInstructionDto>();
        }
        return this.specialStationInstructionDtos;
    }

    /**
     * Gets the <code>ssdPrinterId</code> property.
     * <p>
     * 
     * @return the current value of the <code>ssdPrinterId</code> property.
     */
    public String getSsdPrinterId() {
        return this.ssdPrinterId;
    }

    /**
     * Gets the <code>ssdScreeningMethod</code> property.
     * <p>
     * 
     * @return the current value of the <code>ssdScreeningMethod</code> property.
     */
    public String getSsdScreeningMethod() {
        return this.ssdScreeningMethod;
    }

    /**
     * Gets the <code>ssdScreeningType</code> property.
     * <p>
     * 
     * @return the current value of the <code>ssdScreeningType</code> property.
     */
    public SSDScreeningType getSsdScreeningType() {
        return this.ssdScreeningType;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoSectionLabelDto
     * StationInfoSectionLabelDto} containing <code>StationInfoSectionLabelDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>stationAgencyLabels</code> property.
     */
    public List<StationInfoSectionLabelDto> getStationAgencyLabels() {
        return this.stationAgencyLabels;
    }

    /**
     * Gets the <code>stationCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>stationCode</code> property.
     */
    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * Gets the <code>stationControlUserAudit</code> property.
     * <p>
     * 
     * @return the current value of the <code>stationControlUserAudit</code> property.
     */

    public UserAuditDto getStationControlUserAudit() {
        if (this.stationControlUserAudit == null) {
            this.stationControlUserAudit = new UserAuditDto();
        }
        return this.stationControlUserAudit;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityAttributeDto
     * StationFacilityAttributeDto} containing <code>StationFacilityAttributeDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>stationFacilityAttributeDtos</code> property.
     */
    public List<StationFacilityAttributeDto> getStationFacilityAttributeDtos() {
        if (this.stationFacilityAttributeDtos == null) {
            this.stationFacilityAttributeDtos = new ArrayList<StationFacilityAttributeDto>();
        }
        return this.stationFacilityAttributeDtos;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto
     * StationFacilityContactDto} containing <code>StationFacilityContactDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>stationFacilityContactDtos</code> property.
     */
    public List<StationFacilityContactDto> getStationFacilityContactDtos() {
        if (this.stationFacilityContactDtos == null) {
            this.stationFacilityContactDtos = new ArrayList<StationFacilityContactDto>();
        }
        return this.stationFacilityContactDtos;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto
     * StationFacilityContactDto} containing <code>StationFacilityContactDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>stationFacilityContactDtos</code> property.
     */
    public List<StationHandlingDetailDto> getStationHandlingDetailDtos() {
        if (this.stationHandlingDetailDtos == null) {
            this.stationHandlingDetailDtos = new ArrayList<StationHandlingDetailDto>();
        }
        return stationHandlingDetailDtos;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.StationHourDto
     * StationHourDto} containing <code>StationHourDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>stationHolidayHours</code> property.
     */
    public List<StationHourDto> getStationHolidayHours() {
        if (this.stationHolidayHours == null) {
            this.stationHolidayHours = new ArrayList<StationHourDto>();
        }
        return this.stationHolidayHours;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.StationHourDto
     * StationHourDto} containing <code>StationHourDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>stationHourDtos</code> property.
     */
    public List<StationHourDto> getStationHourDtos() {
        if (this.stationHourDtos == null) {
            this.stationHourDtos = new ArrayList<StationHourDto>();
        }
        return this.stationHourDtos;
    }

    /**
     * Gets the <code>stationInfoInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>stationInfoInd</code> property.
     */
    public boolean getStationInfoInd() {
        return this.stationInfoInd;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.StationLocationDto
     * StationLocationDto} containing <code>StationLocationDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>stationLocationDtos</code> property.
     */
    public List<StationLocationDto> getStationLocationDtos() {
        if (this.stationLocationDtos == null) {
            this.stationLocationDtos = new ArrayList<StationLocationDto>();
        }
        return this.stationLocationDtos;
    }

    /**
     * Gets the <code>stationName</code> property.
     * <p>
     * 
     * @return the current value of the <code>stationName</code> property.
     */
    public String getStationName() {
        return this.stationName;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.StationQuestionDto
     * StationLocationDto} containing <code>StationLocationDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>stationQuestions</code> property.
     */
    public List<StationQuestionDto> getStationQuestions() {
        return this.stationQuestions;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoSectionLabelDto
     * StationInfoSectionLabelDto} containing <code>StationInfoSectionLabelDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>stationSupplementalLabels</code> property.
     */

    public List<StationInfoSectionLabelDto> getStationSupplementalLabels() {
        return this.stationSupplementalLabels;
    }

    /**
     * Gets the <code>subArea</code> property.
     * <p>
     * 
     * @return the current value of the <code>subArea</code> property.
     */
    public String getSubArea() {
        return this.subArea;
    }

    /**
     * Gets the <code>subDistrict</code> property.
     * <p>
     * 
     * @return the current value of the <code>subDistrict</code> property.
     */
    public String getSubDistrict() {
        return this.subDistrict;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoSupplementalHolidayDto
     * StationInfoSupplementalHolidayDto} containing <code>StationInfoSupplementalHolidayDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>supplementalStationHolidayDtos</code> property.
     */
    public List<SupplementalAgencyHoursDto> getSupplementalStationHolidayDtos() {
        if (this.supplementalStationHolidayDtos == null) {
            this.supplementalStationHolidayDtos = new ArrayList<SupplementalAgencyHoursDto>();
        }
        return this.supplementalStationHolidayDtos;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoSupplementalHourDto
     * StationInfoSupplementalHourDto} containing <code>StationInfoSupplementalHourDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>supplementalStationHourDtos</code> property.
     */
    public List<SupplementalAgencyHoursDto> getSupplementalStationHourDtos() {
        if (this.supplementalStationHourDtos == null) {
            this.supplementalStationHourDtos = new ArrayList<SupplementalAgencyHoursDto>();
        }
        return this.supplementalStationHourDtos;
    }

    /**
     * Gets the <code>teleType</code> property.
     * <p>
     * 
     * @return the current value of the <code>teleType</code> property.
     */
    public String getTeleType() {
        return this.teleType;
    }

    /**
     * Gets the <code>teleTypeUsed</code> property.
     * <p>
     * 
     * @return the current value of the <code>teleTypeUsed</code> property.
     */
    public Boolean getTeleTypeUsed() {
        return this.teleTypeUsed;
    }

    /**
     * Gets the <code>timeDifferential</code> property.
     * <p>
     * 
     * @return the current value of the <code>timeDifferential</code> property.
     */
    public Float getTimeDifferential() {
        return this.timeDifferential;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.StationInformationConnectionTimeDto
     * StationInformationConnectionTimeDto} containing <code>StationInformationConnectionTimeDto</code>
     * details.
     * <p>
     * 
     * @return the current value of the <code>transferStationDtos</code> property.
     */
    public List<StationInformationConnectionTimeDto> getTransferStationDtos() {
        if (this.transferStationDtos == null) {
            this.transferStationDtos = new ArrayList<StationInformationConnectionTimeDto>();
        }
        return this.transferStationDtos;
    }

    /**
     * Gets the <code>UserAuditDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>userAudit</code> property.
     */

    public UserAuditDto getUserAudit() {
        if (this.userAudit == null) {
            this.userAudit = new UserAuditDto();
        }
        return this.userAudit;
    }

    /**
     * Gets the <code>weightUnit</code> property.
     * <p>
     * 
     * @return the current value of the <code>weightUnit</code> property.
     */
    public WeightUOMType getWeightUnit() {
        return this.weightUnit;
    }

    /**
     * Gets the <code>teleTypeCustomsInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>teleTypeCustomsInd</code> property.
     */

    public boolean isTeleTypeCustomsInd() {
        return this.teleTypeCustomsInd;
    }

    /**
     * Sets the <code>address</code> property.
     * <p>
     * 
     * @param pAddress
     *            the current value of the <code>address</code> property.
     */
    public void setAddress(final String pAddress) {
        this.address = pAddress;
    }

    /**
     * Sets the list of<code>agencyHolidayHoursDtos</code> property.
     * <p>
     * 
     * @param pAgencyHolidayHoursDtos
     *            the current value of the <code>agencyHolidayHoursDtos</code> property.
     */
    public void setAgencyHolidayHoursDtos(
                final List<SupplementalAgencyHoursDto> pAgencyHolidayHoursDtos) {
        this.agencyHolidayHoursDtos = pAgencyHolidayHoursDtos;
    }

    /**
     * Sets the list of<code>agencyHoursDtos</code> property.
     * <p>
     * 
     * @param pAgencyHoursDtos
     *            the current value of the <code>agencyHoursDtos</code> property.
     */
    public void setAgencyHoursDtos(
                final List<SupplementalAgencyHoursDto> pAgencyHoursDtos) {
        this.agencyHoursDtos = pAgencyHoursDtos;
    }

    /**
     * Sets the <code>area</code> property.
     * <p>
     * 
     * @param pArea
     *            the current value of the <code>area</code> property.
     */
    public void setArea(final String pArea) {
        this.area = pArea;
    }

    /**
     * Sets the <code>billingCurrency</code> property.
     * <p>
     * 
     * @param pBillingCurrency
     *            the current value of the <code>billingCurrency</code> property.
     */
    public void setBillingCurrency(final String pBillingCurrency) {
        this.billingCurrency = pBillingCurrency;
    }

    /**
     * Sets the list of<code>connectionTimeDtos</code> property.
     * <p>
     * 
     * @param pConnectionTimeDtos
     *            the current value of the <code>connectionTimeDtos</code> property.
     */
    public void setConnectionTimeDtos(
                final List<StationInformationConnectionTimeDto> pConnectionTimeDtos) {
        this.connectionTimeDtos = pConnectionTimeDtos;
    }

    /**
     * Sets the <code>district</code> property.
     * <p>
     * 
     * @param pDistrict
     *            the current value of the <code>district</code> property.
     */
    public void setDistrict(final String pDistrict) {
        this.district = pDistrict;
    }

    /**
     * Sets the list of<code>domesticCutOffTimeDtos</code> property.
     * <p>
     * 
     * @param pDomesticCutOffTimeDtos
     *            the current value of the <code>domesticCutOffTimeDtos</code> property.
     */
    public void setDomesticCutOffTimeDtos(
                final List<CutOffTimeDto> pDomesticCutOffTimeDtos) {
        this.domesticCutOffTimeDtos = pDomesticCutOffTimeDtos;
    }

    /**
     * Sets the list of<code>domesticPrescreenCutOfftimeDtos</code> property.
     * <p>
     * 
     * @param pDomesticPrescreenCutOfftimeDtos
     *            the current value of the <code>domesticPrescreenCutOfftimeDtos</code> property.
     */
    public void setDomesticPrescreenCutOfftimeDtos(
                final List<CutOffTimeDto> pDomesticPrescreenCutOfftimeDtos) {
        this.domesticPrescreenCutOfftimeDtos = pDomesticPrescreenCutOfftimeDtos;
    }

    /**
     * Sets the <code>drivingDirections</code> property.
     * <p>
     * 
     * @param pDrivingDirections
     *            the current value of the <code>drivingDirections</code> property.
     */
    public void setDrivingDirections(final String pDrivingDirections) {
        this.drivingDirections = pDrivingDirections;
    }

    /**
     * Sets the <code>firmsCode</code> property.
     * <p>
     * 
     * @param pFirmsCode
     *            the current value of the <code>firmsCode</code> property.
     */
    public void setFirmsCode(final String pFirmsCode) {
        this.firmsCode = pFirmsCode;
    }

    /**
     * Sets the <code>handlerEORI</code> property.
     * <p>
     * 
     * @param pHandlerEORI
     *            the current value of the <code>handlerEORI</code> property.
     */
    public void setHandlerEORI(final String pHandlerEORI) {
        this.handlerEORI = pHandlerEORI;
    }

    /**
     * Sets the <code>handlerName</code> property.
     * <p>
     * 
     * @param pHandlerName
     *            the current value of the <code>handlerName</code> property.
     */
    public void setHandlerName(final String pHandlerName) {
        this.handlerName = pHandlerName;
    }

    /**
     * Sets the <code>hostInd</code> property.
     * <p>
     * 
     * @param pHostInd
     *            the current value of the <code>hostInd</code> property.
     */
    public void setHostInd(final boolean pHostInd) {
        this.hostInd = pHostInd;
    }

    /**
     * Sets the list of<code>internationalCutOffTimeDtos</code> property.
     * <p>
     * 
     * @param pInternationalCutOffTimeDtos
     *            the current value of the <code>internationalCutOffTimeDtos</code> property.
     */
    public void setInternationalCutOffTimeDtos(
                final List<CutOffTimeDto> pInternationalCutOffTimeDtos) {
        this.internationalCutOffTimeDtos = pInternationalCutOffTimeDtos;
    }

    /**
     * Sets the list of<code>internationalPrescreenCutOfftimeDtos</code> property.
     * <p>
     * 
     * @param pInternationalPrescreenCutOfftimeDtos
     *            the current value of the <code>internationalPrescreenCutOfftimeDtos</code> property.
     */
    public void setInternationalPrescreenCutOfftimeDtos(
                final List<CutOffTimeDto> pInternationalPrescreenCutOfftimeDtos) {
        this.internationalPrescreenCutOfftimeDtos = pInternationalPrescreenCutOfftimeDtos;
    }

    /**
     * Sets the <code>latitude</code> property.
     * <p>
     * 
     * @param pLatitude
     *            the current value of the <code>latitude</code> property.
     */
    public void setLatitude(final String pLatitude) {
        this.latitude = pLatitude;
    }

    /**
     * Sets the <code>loadInputText</code> property.
     * <p>
     * 
     * @param pLoadInputText
     *            the current value of the <code>loadInputText</code> property.
     */
    public void setLoadInputText(final String[] pLoadInputText) {
        this.loadInputText = pLoadInputText;
    }

    /**
     * Sets the <code>localCurrency</code> property.
     * <p>
     * 
     * @param pLocalCurrency
     *            the current value of the <code>localCurrency</code> property.
     */
    public void setLocalCurrency(final String pLocalCurrency) {
        this.localCurrency = pLocalCurrency;
    }

    /**
     * Sets the <code>longitude</code> property.
     * <p>
     * 
     * @param pLongitude
     *            the current value of the <code>longitude</code> property.
     */
    public void setLongitude(final String pLongitude) {
        this.longitude = pLongitude;
    }

    /**
     * Sets the <code>mechanizedInd</code> property.
     * <p>
     * 
     * @param pMechanizedInd
     *            the current value of the <code>mechanizedInd</code> property.
     */
    public void setMechanizedInd(final boolean pMechanizedInd) {
        this.mechanizedInd = pMechanizedInd;
    }

    /**
     * Sets the list of<code>monthHolidayDtos</code> property.
     * <p>
     * 
     * @param pMonthHolidayDtos
     *            the current value of the <code>monthHolidayDtos</code> property.
     */
    public void setMonthHolidayDtos(
                final List<MonthHolidayDto> pMonthHolidayDtos) {
        this.monthHolidayDtos = pMonthHolidayDtos;
    }

    /**
     * Sets the <code>nextTimeChange</code> property.
     * <p>
     * 
     * @param pNextTimeChange
     *            the current value of the <code>nextTimeChange</code> property.
     */
    public void setNextTimeChange(final Date pNextTimeChange) {
        this.nextTimeChange = ContractUtility.getClonedDate(pNextTimeChange);
    }

    /**
     * Sets the value of the <code>OID</code> property.
     * <p>
     * Unique identifier for station.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>OID</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the list of<code>operationalContactDtos</code> property.
     * <p>
     * 
     * @param pOperationalContactDtos
     *            the current value of the <code>operationalContactDtos</code> property.
     */
    public void setOperationalContactDtos(
                final List<StationContactDto> pOperationalContactDtos) {
        this.operationalContactDtos = pOperationalContactDtos;
    }

    /**
     * Sets the list of<code>otherSpecialInstructionDtos</code> property.
     * <p>
     * 
     * @param pOtherSpecialInstructionDtos
     *            the current value of the <code>otherSpecialInstructionDtos</code> property.
     */
    public void setOtherSpecialInstructionDtos(
                final List<SpecialInstructionDto> pOtherSpecialInstructionDtos) {
        this.otherSpecialInstructionDtos = pOtherSpecialInstructionDtos;
    }

    /**
     * Sets the <code>phone</code> property.
     * <p>
     * 
     * @param pPhone
     *            the current value of the <code>phone</code> property.
     */
    public void setPhone(final String pPhone) {
        this.phone = pPhone;
    }

    /**
     * Sets the <code>portNumber</code> property.
     * <p>
     * 
     * @param pPortNumber
     *            the current value of the <code>portNumber</code> property.
     */
    public void setPortNumber(final String pPortNumber) {
        this.portNumber = pPortNumber;
    }

    /**
     * Sets the <code>quickRampTransfer</code> property.
     * <p>
     * 
     * @param pQuickRampTransfer
     *            the current value of the <code>quickRampTransfer</code> property.
     */
    public void setQuickRampTransfer(final String pQuickRampTransfer) {
        this.quickRampTransfer = pQuickRampTransfer;
    }

    /**
     * Sets the <code>region</code> property.
     * <p>
     * 
     * @param pRegion
     *            the current value of the <code>region</code> property.
     */
    public void setRegion(final String pRegion) {
        this.region = pRegion;
    }

    /**
     * Sets the list of<code>salesContactDtos</code> property.
     * <p>
     * 
     * @param pSalesContactDtos
     *            the current value of the <code>salesContactDtos</code> property.
     */
    public void setSalesContactDtos(
                final List<StationContactDto> pSalesContactDtos) {
        this.salesContactDtos = pSalesContactDtos;
    }

    /**
     * Sets the <code>shipmentsInspected</code> property.
     * <p>
     * 
     * @param pShipmentsInspected
     *            the current value of the <code>shipmentsInspected</code> property.
     */
    public void setShipmentsInspected(final String pShipmentsInspected) {
        this.shipmentsInspected = pShipmentsInspected;
    }

    /**
     * Sets the list of<code>specialStationInstructionDtos</code> property.
     * <p>
     * 
     * @param pSpecialStationInstructionDtos
     *            the current value of the <code>specialStationInstructionDtos</code> property.
     */
    public void setSpecialStationInstructionDtos(
                final List<SpecialInstructionDto> pSpecialStationInstructionDtos) {
        this.specialStationInstructionDtos = pSpecialStationInstructionDtos;
    }

    /**
     * Sets the <code>ssdPrinterId</code> property.
     * <p>
     * 
     * @param pSsdPrinterId
     *            the current value of the <code>ssdPrinterId</code> property.
     */
    public void setSsdPrinterId(final String pSsdPrinterId) {
        this.ssdPrinterId = pSsdPrinterId;
    }

    /**
     * Sets the <code>ssdScreeningMethod</code> property.
     * <p>
     * 
     * @param pSsdScreeningMethod
     *            the current value of the <code>ssdScreeningMethod</code> property.
     */
    public void setSsdScreeningMethod(final String pSsdScreeningMethod) {
        this.ssdScreeningMethod = pSsdScreeningMethod;
    }

    /**
     * Sets the <code>ssdScreeningType</code> property.
     * <p>
     * 
     * @param pSsdScreeningType
     *            the current value of the <code>ssdScreeningType</code> property.
     */
    public void setSsdScreeningType(final SSDScreeningType pSsdScreeningType) {
        this.ssdScreeningType = pSsdScreeningType;
    }

    /**
     * Sets the list of<code>stationAgencyLabels</code> property.
     * <p>
     * 
     * @param pStationAgencyLabels
     *            the current value of the <code>stationAgencyLabels</code> property.
     */
    public void setStationAgencyLabels(final List<StationInfoSectionLabelDto> pStationAgencyLabels) {
        this.stationAgencyLabels = pStationAgencyLabels;
    }

    /**
     * Sets the <code>stationCode</code> property.
     * <p>
     * 
     * @param pStationCode
     *            the current value of the <code>stationCode</code> property.
     */
    public void setStationCode(final String pStationCode) {
        this.stationCode = ContractUtility
                    .convertToUpperCase(pStationCode);
    }

    /**
     * Sets the <code>stationControlUserAudit</code> property.
     * <p>
     * 
     * @param pStationControlUserAudit
     *            the current value of the <code>stationControlUserAudit</code> property.<br>
     * 
     */

    public void setStationControlUserAudit(final UserAuditDto pStationControlUserAudit) {
        this.stationControlUserAudit = pStationControlUserAudit;
    }

    /**
     * Sets the list of<code>stationFacilityAttributeDtos</code> property.
     * <p>
     * 
     * @param pStationFacilityAttributeDtos
     *            the current value of the <code>stationFacilityAttributeDtos</code> property.
     */
    public void setStationFacilityAttributeDtos(
                final List<StationFacilityAttributeDto> pStationFacilityAttributeDtos) {
        this.stationFacilityAttributeDtos = pStationFacilityAttributeDtos;
    }

    /**
     * Sets the list of<code>stationFacilityContactDtos</code> property.
     * <p>
     * 
     * @param pStationFacilityContactDtos
     *            the current value of the <code>stationFacilityContactDtos</code> property.
     */
    public void setStationFacilityContactDtos(
                final List<StationFacilityContactDto> pStationFacilityContactDtos) {
        this.stationFacilityContactDtos = pStationFacilityContactDtos;
    }

    /**
     * Sets the list of<code>stationHandlingDetailDtos</code> property.
     * <p>
     * 
     * @param pStationHandlingDetailDtos
     *            the current value of the <code>stationHandlingDetailDtos</code> property.
     */
    public void setStationHandlingDetailDtos(
                List<StationHandlingDetailDto> pStationHandlingDetailDtos) {
        this.stationHandlingDetailDtos = pStationHandlingDetailDtos;
    }

    /**
     * Sets the list of<code>stationHolidayHours</code> property.
     * <p>
     * 
     * @param pStationHolidayHours
     *            the current value of the <code>stationHolidayHours</code> property.
     */
    public void setStationHolidayHours(
                final List<StationHourDto> pStationHolidayHours) {
        this.stationHolidayHours = pStationHolidayHours;
    }

    /**
     * Sets the list of<code>stationHourDtos</code> property.
     * <p>
     * 
     * @param pStationHourDtos
     *            the current value of the <code>stationHourDtos</code> property.
     */
    public void setStationHourDtos(final List<StationHourDto> pStationHourDtos) {
        this.stationHourDtos = pStationHourDtos;
    }

    /**
     * Sets the <code>stationInfoInd</code> property.
     * <p>
     * 
     * @param pStationInfoInd
     *            the current value of the <code>stationInfoInd</code> property.
     */
    public void setStationInfoInd(final boolean pStationInfoInd) {
        this.stationInfoInd = pStationInfoInd;
    }

    /**
     * Sets the list of<code>stationLocationDtos</code> property.
     * <p>
     * 
     * @param pStationLocationDtos
     *            the current value of the <code>stationLocationDtos</code> property.
     */
    public void setStationLocationDtos(
                final List<StationLocationDto> pStationLocationDtos) {
        this.stationLocationDtos = pStationLocationDtos;
    }

    /**
     * Sets the <code>stationName</code> property.
     * <p>
     * 
     * @param pStationName
     *            the current value of the <code>stationName</code> property.
     */
    public void setStationName(final String pStationName) {
        this.stationName = pStationName;
    }

    /**
     * Sets the <code>stationQuestions</code> property.
     * <p>
     * 
     * @param pStationQuestions
     *            the current value of the <code>stationQuestions</code> property.
     */
    public void setStationQuestions(final List<StationQuestionDto> pStationQuestions) {
        this.stationQuestions = pStationQuestions;
    }

    /**
     * Sets the list of<code>stationSupplementalLabels</code> property.
     * <p>
     * 
     * @param pStationSupplementalLabels
     *            the current value of the <code>stationSupplementalLabels</code> property.
     */
    public
                void
                setStationSupplementalLabels(final List<StationInfoSectionLabelDto> pStationSupplementalLabels) {
        this.stationSupplementalLabels = pStationSupplementalLabels;
    }

    /**
     * Sets the <code>subArea</code> property.
     * <p>
     * 
     * @param pSubArea
     *            the current value of the <code>subArea</code> property.
     */
    public void setSubArea(final String pSubArea) {
        this.subArea = pSubArea;
    }

    /**
     * Sets the <code>subDistrict</code> property.
     * <p>
     * 
     * @param pSubDistrict
     *            the current value of the <code>subDistrict</code> property.
     */
    public void setSubDistrict(final String pSubDistrict) {
        this.subDistrict = pSubDistrict;
    }

    /**
     * Sets the list of<code>supplementalStationHolidayDtos</code> property.
     * <p>
     * 
     * @param pSupplementalStationHolidayDtos
     *            the current value of the <code>supplementalStationHolidayDtos</code> property.
     */
    public void setSupplementalStationHolidayDtos(
                final List<SupplementalAgencyHoursDto> pSupplementalStationHolidayDtos) {
        this.supplementalStationHolidayDtos = pSupplementalStationHolidayDtos;
    }

    /**
     * Sets the list of<code>supplementalStationHourDtos</code> property.
     * <p>
     * 
     * @param pSupplementalStationHourDtos
     *            the current value of the <code>supplementalStationHourDtos</code> property.
     */
    public void setSupplementalStationHourDtos(
                final List<SupplementalAgencyHoursDto> pSupplementalStationHourDtos) {
        this.supplementalStationHourDtos = pSupplementalStationHourDtos;
    }

    /**
     * Sets the <code>teleType</code> property.
     * <p>
     * 
     * @param pTeleType
     *            the current value of the <code>teleType</code> property.
     */
    public void setTeleType(final String pTeleType) {
        this.teleType = pTeleType;
    }

    /**
     * Sets the <code>teleTypeCustomsInd</code> property.
     * <p>
     * 
     * @param pTeleTypeCustomsInd
     *            the current value of the <code>teleTypeCustomsInd</code> property.
     */

    public void setTeleTypeCustomsInd(final boolean pTeleTypeCustomsInd) {
        this.teleTypeCustomsInd = pTeleTypeCustomsInd;
    }

    /**
     * Sets the <code>teleTypeUsed</code> property.
     * <p>
     * 
     * @param pTeleTypeUsed
     *            the current value of the <code>teleTypeUsed</code> property.
     */
    public void setTeleTypeUsed(final Boolean pTeleTypeUsed) {
        this.teleTypeUsed = pTeleTypeUsed;
    }

    /**
     * Sets the <code>timeDifferential</code> property.
     * <p>
     * 
     * @param pTimeDifferential
     *            the current value of the <code>timeDifferential</code> property.
     */
    public void setTimeDifferential(final Float pTimeDifferential) {
        this.timeDifferential = pTimeDifferential;
    }

    /**
     * Sets the list of<code>transferStationDtos</code> property.
     * <p>
     * 
     * @param pTransferStationDtos
     *            the current value of the <code>transferStationDtos</code> property.
     */
    public void setTransferStationDtos(
                final List<StationInformationConnectionTimeDto> pTransferStationDtos) {
        this.transferStationDtos = pTransferStationDtos;
    }

    /**
     * Sets the <code>UserAuditDto</code> property.
     * <p>
     * 
     * @param pUserAudit
     *            the current value of the <code>UserAuditDto</code> property.<br>
     * 
     */

    public void setUserAudit(final UserAuditDto pUserAudit) {
        this.userAudit = pUserAudit;
    }

    /**
     * Sets the <code>weightUnit</code> property.
     * <p>
     * 
     * @param pWeightUnit
     *            the current value of the <code>weightUnit</code> property.
     */
    public void setWeightUnit(final WeightUOMType pWeightUnit) {
        this.weightUnit = pWeightUnit;
    }

    private List<? extends PersistenceObjectDto> theDeletedObjects;

    public List<? extends PersistenceObjectDto> getTheDeletedObjects() {
        if (this.theDeletedObjects == null) {
            this.theDeletedObjects = new ArrayList<PersistenceObjectDto>();
        }
        return theDeletedObjects;
    }

    public void setTheDeletedObjects(List<? extends PersistenceObjectDto> theDeletedObjects) {
        this.theDeletedObjects = theDeletedObjects;
    }

    private List<? extends PersistenceObjectDto> theDeletedObjectsList2;

    public List<? extends PersistenceObjectDto> getTheDeletedObjectsList2() {
        if (this.theDeletedObjectsList2 == null) {
            
            this.theDeletedObjectsList2 = new ArrayList<PersistenceObjectDto>();
        }
        return this.theDeletedObjectsList2;
    }

    public void setTheDeletedObjectsList2(List<? extends PersistenceObjectDto> theDeletedObjectsList2) {
        this.theDeletedObjectsList2 = theDeletedObjectsList2;
    }
    
    /**
     * Gets the <code>collectCharges</code> property.
     * 
     * @return the current value of the <code>collectCharges</code> property.
     */

    public String getCollectCharges() {
        return this.collectCharges;
    }

    /**
     * Sets the list of<code>collectCharges</code> property.
     * <p>
     * 
     * @param pCollectCharges
     *            the current value of the <code>collectCharges</code> property.
     */
    
    public void setCollectCharges(final String pCollectCharges) {
        this.collectCharges = pCollectCharges;
    }

}
