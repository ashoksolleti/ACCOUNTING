/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * <code>StationServiceDetailDto</code>contains information about service details of the station.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>checkInAllDefaultLocations
 * <li>customsHours
 * <li>customsPortNumber
 * <li>deliveryAccountExpressCargo
 * <li>deliveryAccountNormalCargo
 * <li>deliveryHours
 * <li>drivingTimeToAirport
 * <li>dropOffTimeDocuments
 * <li>dropOffTimeExpress
 * <li>dropOffTimeFrame
 * <li>dropOffTimeNormal
 * <li>expressDeliveryPickUpHours
 * <li>expressPickUpHours
 * <li>franchiseStationIndicator
 * <li>importDefaultLocations
 * <li>importMechanizedIndicator
 * <li>importQualityAssuranceIndicator
 * <li>officeOtherChargeQueues
 * <li>openHours
 * <li>pickUpAccountExpressCargo
 * <li>pickUpAccountNormalCargo
 * <li>pickUpHours
 * <li>productCodeExceptionsExistIndicator
 * <li>recoveryTimeDocuments
 * <li>recoveryTimeExpress
 * <li>recoveryTimeFrame
 * <li>recoveryTimeNormal
 * <li>stationRemarks
 * <li>wareHouseHours
 * </code>
 * </ul>
 */
public class StationServiceDetailDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8963290247113850594L;

    /**
     * Attribute to hold <code>checkInAllDefaultLocations</code> property.
     * <p>
     * The default location for the check-in of goods from a flight with check-in-all at the station. This
     * location is used when there is no location entered in the check- in-all function. If this field is
     * blank, the system-wide default system location parameter is used by the Accept Goods function (LMS
     * parameter is C$LOCN). The value of "NONE" can be entered to indicate that there is no default location
     * defined at the station level and that the system wide-default value is not to be used.
     */
    private String checkInAllDefaultLocations;

    /**
     * Attribute to hold <code>customsHours</code> property.
     * <p>
     * Office hours of the station for customs service. It has the open and close time details of weekdays,
     * Saturdays, Sundays and holidays.
     */

    private OfficeHourDto customsHours;

    /**
     * Attribute to hold <code>customsPortNumber</code> property.
     * <p>
     * Indicates the customs port number.
     */
    private int customsPortNumber;

    /**
     * Attribute to hold <code>deliveryAccountExpressCargo</code> property.
     * <p>
     * This field specifies the account numbers for the express cargo delivery operator. This account is also
     * used for Time Frame deliveries.
     */
    private String deliveryAccountExpressCargo;

    /**
     * Attribute to hold <code>deliveryAccountNormalCargo</code> property.
     * <p>
     * This field specifies the account numbers for the local delivery operator. This account is also used for
     * Time Frame deliveries.
     */
    private String deliveryAccountNormalCargo;

    /**
     * Attribute to hold <code>deliveryHours</code> property.
     * <p>
     * Office hours of the station to delivery goods. It has the open and close time details of weekdays,
     * Saturdays, Sundays and holidays.
     */

    private OfficeHourDto deliveryHours;

    /**
     * Attribute to hold <code>drivingTimeToAirport</code> property.
     * <p>
     * Driving time (in hours and minutes) from the franchise office to the airport. For example, an entry of
     * 3.5 would equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     */
    private BigDecimal drivingTimeToAirport;

    /**
     * Attribute to hold <code>dropOffTimeDocuments</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a document cargo shipment from the
     * time of drop-off at the station to the time of flight departure. For example, an entry of 3.5 would
     * equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     */
    private BigDecimal dropOffTimeDocuments;

    /**
     * Attribute to hold <code>dropOffTimeExpress</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a express cargo shipment from the
     * time of drop-off at the station to the time of flight departure. For example, an entry of 3.5 would
     * equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     */
    private BigDecimal dropOffTimeExpress;

    /**
     * Attribute to hold <code>dropOffTimeFrame</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a time frame cargo shipment from
     * the time of drop-off at the station to the time of flight departure. For example, an entry of 3.5 would
     * equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     */
    private BigDecimal dropOffTimeFrame;

    /**
     * Attribute to hold <code>dropOffTimeNormal</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a general cargo shipment from the
     * time of drop-off at the station to the time of flight departure. For example, an entry of 3.5 would
     * equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     */
    private BigDecimal dropOffTimeNormal;

    /**
     * Attribute to hold <code>expressDeliveryPickUpHours</code> property.
     * <p>
     * Office hours of the station for the express delivery pick ups. It has the open and close time details
     * of weekdays, Saturdays, Sundays and holidays.
     */

    private OfficeHourDto expressDeliveryPickUpHours;

    /**
     * Attribute to hold <code>expressPickUpHours</code> property.
     * <p>
     * Office hours of the station for the express pick ups. It has the open and close time details of
     * weekdays, Saturdays, Sundays and holidays.
     */

    private OfficeHourDto expressPickUpHours;

    /**
     * Attribute to hold <code>franchiseStationIndicator</code> property.
     * <p>
     * Indicates whether the station is a franchise station. Possible Values:
     * <li><code>true</code><br>
     * This station is a franchise station.
     * <li><code>false</code><br>
     * This station is not a franchise station.
     */
    private boolean franchiseStationIndicator;

    /**
     * Attribute to hold <code>importDefaultLocations</code> property.
     * <p>
     * The default location for the check-in of goods from a flight at this station. This location is used
     * when there is no location entered in the check-in functions. If this field is blank, then the
     * system-wide default system location parameter is used by the Accept Goods function (LMS parameter is
     * C$GLOC). The value of "NONE" can be entered to indicate that there is no default location defined at
     * the station level and that the system-wide default value is not to be used.
     */
    private String importDefaultLocations;

    /**
     * Attribute to hold <code>importMechanizedIndicator</code> property.
     * <p>
     * Import mechanized indicator. Indicates if the import part of the station has a PC. This field is not
     * used for processing purposes within the application and is used only for display purposes. Possible
     * Values:
     * <li><code>true</code><br>
     * Indicates import does have a PC. This is the default value.
     * <li><code>false</code><br>
     * Indicates import does not have a PC.
     */
    private boolean importMechanizedIndicator;

    /**
     * Attribute to hold <code>importQualityAssuranceIndicator</code> property.
     * <p>
     * The Import Quality Assurance (IQA) station indicator states whether IQA processing is required at this
     * station when it is the destination station of the AWB. This indicator is used in processing only when
     * the airline performs import quality assurance. The audit routines use this indicator in the
     * determination of open audit flag.
     * <li><code>true</code><br>
     * Indicates Import Quality Assurance is performed.
     * <li><code>false</code><br>
     * Indicates Import Quality Assurance is not performed. This is the default value.
     */
    private boolean importQualityAssuranceIndicator;

    /**
     * Attribute to hold <code>officeOtherChargeQueues</code> property.
     * <p>
     * Queuing office designator for an air waybill that is queued for miscellaneous rates. If this field is
     * left blank, the air waybill is queued to the office that the agent has signed into.
     */
    private int officeOtherChargeQueues;

    /**
     * Attribute to hold <code>openHours</code> property.
     * <p>
     * Office hours of the station that's time when the station is opened for service. It has the open and
     * close time details of weekdays, Saturdays, Sundays and holidays.
     */
    private OfficeHourDto openHours;

    /**
     * Attribute to hold <code>pickUpAccountExpressCargo</code> property.
     * <p>
     * This field specifies the account numbers for the local pick-up operator. This account is also used for
     * Time Frame pick-ups.
     */
    private String pickUpAccountExpressCargo;

    /**
     * Attribute to hold <code>pickUpAccountNormalCargo</code> property.
     * <p>
     * This field specifies the account numbers for the local pick-up operator. This account is also used for
     * Time Frame pick-ups.
     */
    private String pickUpAccountNormalCargo;

    /**
     * Attribute to hold <code>pickUpHours</code> property.
     * <p>
     * Office hours of the station for the express pick ups. It has the open and close time details of
     * weekdays, Saturdays, Sundays and holidays.
     */

    private OfficeHourDto pickUpHours;

    /**
     * Attribute to hold <code>productCodeExceptionsExistIndicator</code> property.
     * <p>
     * The ProductCodeException Exist indicator indicates whether this station has exception offsets for
     * products. Possible Values:
     * <li><code>true</code><br>
     * This station has exception offsets to a product.
     * <li><code>false</code><br>
     * This station does not have exception offsets to a product. Default value is false.
     */
    private boolean productCodeExceptionsExistIndicator;

    /**
     * Attribute to hold <code>recoveryTimeDocuments</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a document cargo shipment from the
     * time of flight arrival to the time of shipment release from the station. For example, an entry of 3.5
     * would equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     */
    private BigDecimal recoveryTimeDocuments;

    /**
     * Attribute to hold <code>recoveryTimeExpress</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a express cargo shipment from the
     * time of flight arrival to the time of shipment release from the station. For example, an entry of 3.5
     * would equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     */
    private BigDecimal recoveryTimeExpress;

    /**
     * Attribute to hold <code>recoveryTimeFrame</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a time frame cargo shipment from
     * the time of flight arrival to the time of shipment release from the station. For example, an entry of
     * 3.5 would equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes
     * Valid formats are 9999, 99.99, 9.99. Negative amounts are not allowed.
     */
    private BigDecimal recoveryTimeFrame;

    /**
     * Attribute to hold <code>recoveryTimeNormal</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a general cargo shipment from the
     * time of flight arrival to the time of shipment release from the station. For example, an entry of 3.5
     * would equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes
     */
    private BigDecimal recoveryTimeNormal;

    /**
     * Attribute to hold <code>serviceRemarks</code> property.
     */
    private List<StationRemarksDto> stationRemarks;

    /**
     * Attribute to hold <code>wareHouseHours</code> property.
     * <p>
     * Office hours of the station for the warehouse services. It has the open and close time details of
     * weekdays, Saturdays, Sundays and holidays.
     */

    private OfficeHourDto wareHouseHours;
    
    // MH021
    private String apsDailyStartTime;
    
    private String apsDailyEndTime;

    /**
     * <code>Default constructor.</code>
     */
    public StationServiceDetailDto() {

    }

    /**
     * Gets the value of the <code>checkInAllDefaultLocations</code> property.
     * <p>
     * The default location for the check-in of goods from a flight with check-in-all at the station. This
     * location is used when there is no location entered in the check- in-all function. If this field is
     * blank, the system-wide default system location parameter is used by the Accept Goods function (LMS
     * parameter is C$LOCN). The value of "NONE" can be entered to indicate that there is no default location
     * defined at the station level and that the system wide-default value is not to be used.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 1EXPORT
     * <p>
     * 
     * @return the current value of the <code>checkInAllDefaultLocations</code> property.<br>
     */
    public String getCheckInAllDefaultLocations() {
        return this.checkInAllDefaultLocations;
    }

    /**
     * Gets the value of the <code>customsHoursDto</code> property.
     * <p>
     * Office hours of the station for customs service. It has the open and close time details of weekdays,
     * Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @return the current value of the <code>customsHoursDto</code> property.<br>
     */
    public OfficeHourDto getCustomsHours() {
        return this.customsHours;
    }

    /**
     * Gets the value of the <code>customsPortNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 Numeric
     * <p>
     * <b>Example: </b><br>
     * 1234
     * <p>
     * 
     * @return the current value of the <code>customsPortNumber</code> property.<br>
     */
    public int getCustomsPortNumber() {
        return this.customsPortNumber;
    }

    /**
     * Gets the value of the <code>deliveryAccountExpressCargo</code> property.
     * <p>
     * This field specifies the account numbers for the express cargo delivery operator. This account is also
     * used for Time Frame deliveries.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 181818
     * <p>
     * 
     * @return the current value of the <code>deliveryAccountExpressCargo</code> property.<br>
     */
    public String getDeliveryAccountExpressCargo() {
        return this.deliveryAccountExpressCargo;
    }

    /**
     * Gets the value of the <code>deliveryAccountNormalCargo</code> property.
     * <p>
     * This field specifies the account numbers for the local delivery operator. This account is also used for
     * Time Frame deliveries.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 181818
     * <p>
     * 
     * @return the current value of the <code>deliveryAccountNormalCargo</code> property.<br>
     */
    public String getDeliveryAccountNormalCargo() {
        return this.deliveryAccountNormalCargo;
    }

    /**
     * Gets the value of the <code>deliveryHoursDto</code> property.
     * <p>
     * Office hours of the station to delivery goods. It has the open and close time details of weekdays,
     * Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @return the current value of the <code>deliveryHoursDto</code> property.<br>
     */
    public OfficeHourDto getDeliveryHours() {
        return this.deliveryHours;
    }

    /**
     * Gets the value of the <code>drivingTimeToAirport</code> property.
     * <p>
     * Driving time (in hours and minutes) from the franchise office to the airport. For example, an entry of
     * 3.5 would equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     * <p>
     * <b>Format: </b><br>
     * F5.2
     * <p>
     * <b>Example: </b><br>
     * 3.5
     * <p>
     * 
     * @return the current value of the <code>drivingTimeToAirport</code> property.<br>
     */
    public BigDecimal getDrivingTimeToAirport() {
        return this.drivingTimeToAirport;
    }

    /**
     * Gets the value of the <code>dropOffTimeDocuments</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a document cargo shipment from the
     * time of drop-off at the station to the time of flight departure. For example, an entry of 3.5 would
     * equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     * <p>
     * <b>Format: </b><br>
     * F5.2
     * <p>
     * <b>Example: </b><br>
     * 3.5
     * <p>
     * 
     * @return the current value of the <code>dropOffTimeDocuments</code> property.<br>
     */
    public BigDecimal getDropOffTimeDocuments() {
        return this.dropOffTimeDocuments;
    }

    /**
     * Gets the value of the <code>dropOffTimeExpress</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a express cargo shipment from the
     * time of drop-off at the station to the time of flight departure. For example, an entry of 3.5 would
     * equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     * <p>
     * <b>Format: </b><br>
     * F5.2
     * <p>
     * <b>Example: </b><br>
     * 3.5
     * <p>
     * 
     * @return the current value of the <code>dropOffTimeExpress</code> property.<br>
     */
    public BigDecimal getDropOffTimeExpress() {
        return this.dropOffTimeExpress;
    }

    /**
     * Gets the value of the <code>dropOffTimeFrame</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a time frame cargo shipment from
     * the time of drop-off at the station to the time of flight departure. For example, an entry of 3.5 would
     * equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     * <p>
     * <b>Format: </b><br>
     * F5.2
     * <p>
     * <b>Example: </b><br>
     * 3.5
     * <p>
     * 
     * @return the current value of the <code>dropOffTimeFrame</code> property.<br>
     */
    public BigDecimal getDropOffTimeFrame() {
        return this.dropOffTimeFrame;
    }

    /**
     * Gets the value of the <code>dropOffTimeNormal</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a general cargo shipment from the
     * time of drop-off at the station to the time of flight departure. For example, an entry of 3.5 would
     * equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     * <p>
     * <b>Format: </b><br>
     * F5.2
     * <p>
     * <b>Example: </b><br>
     * 3.5
     * <p>
     * 
     * @return the current value of the <code>dropOffTimeNormal</code> property.<br>
     */
    public BigDecimal getDropOffTimeNormal() {
        return this.dropOffTimeNormal;
    }

    /**
     * Gets the value of the <code>expressDeliveryPickUpHoursDto</code> property.
     * <p>
     * Office hours of the station for the express delivery pick ups. It has the open and close time details
     * of weekdays, Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @return the current value of the <code>expressDeliveryPickUpHoursDto</code> property.<br>
     */
    public OfficeHourDto getExpressDeliveryPickUpHours() {
        return this.expressDeliveryPickUpHours;
    }

    /**
     * Gets the value of the <code>expressPickUpHoursDto</code> property.
     * <p>
     * Office hours of the station for the express pick ups. It has the open and close time details of
     * weekdays, Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @return the current value of the <code>expressPickUpHoursDto</code> property.<br>
     */
    public OfficeHourDto getExpressPickUpHours() {
        return this.expressPickUpHours;
    }

    /**
     * Gets the value of the <code>importDefaultLocations</code> property.
     * <p>
     * The default location for the check-in of goods from a flight at this station. This location is used
     * when there is no location entered in the check-in functions. If this field is blank, then the
     * system-wide default system location parameter is used by the Accept Goods function (LMS parameter is
     * C$GLOC). The value of "NONE" can be entered to indicate that there is no default location defined at
     * the station level and that the system-wide default value is not to be used.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 1IMPORT
     * <p>
     * 
     * @return the current value of the <code>importDefaultLocations</code> property.<br>
     */
    public String getImportDefaultLocations() {
        return this.importDefaultLocations;
    }

    /**
     * Gets the value of the <code>officeOtherChargeQueues</code> property.
     * <p>
     * Queuing office designator for an air waybill that is queued for miscellaneous rates. If this field is
     * left blank, the air waybill is queued to the office that the agent has signed into.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Numeric
     * <p>
     * <b>Example: </b><br>
     * 001
     * <p>
     * 
     * @return the current value of the <code>officeOtherChargeQueues</code> property.<br>
     */
    public int getOfficeOtherChargeQueues() {
        return this.officeOtherChargeQueues;
    }

    /**
     * Gets the value of the <code>openHoursDto</code> property.
     * <p>
     * Office hours of the station that's time when the station is opened for service. It has the open and
     * close time details of weekdays, Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @return the current value of the <code>openHoursDto</code> property.<br>
     */
    public OfficeHourDto getOpenHours() {
        return this.openHours;
    }

    /**
     * Gets the value of the <code>pickUpAccountExpressCargo</code> property.
     * <p>
     * This field specifies the account numbers for the local pick-up operator. This account is also used for
     * Time Frame pick-ups.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 181818
     * <p>
     * 
     * @return the current value of the <code>pickUpAccountExpressCargo</code> property.<br>
     */
    public String getPickUpAccountExpressCargo() {
        return this.pickUpAccountExpressCargo;
    }

    /**
     * Gets the value of the <code>pickUpAccountNormalCargo</code> property.
     * <p>
     * This field specifies the account numbers for the local pick-up operator. This account is also used for
     * Time Frame pick-ups.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 181818
     * <p>
     * 
     * @return the current value of the <code>pickUpAccountNormalCargo</code> property.<br>
     */
    public String getPickUpAccountNormalCargo() {
        return this.pickUpAccountNormalCargo;
    }

    /**
     * Gets the value of the <code>pickUpHoursDto</code> property.
     * <p>
     * Office hours of the station for the express pick ups. It has the open and close time details of
     * weekdays, Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @return the current value of the <code>pickUpHoursDto</code> property.<br>
     */
    public OfficeHourDto getPickUpHours() {
        return this.pickUpHours;
    }

    /**
     * Gets the value of the <code>recoveryTimeDocuments</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a document cargo shipment from the
     * time of flight arrival to the time of shipment release from the station. For example, an entry of 3.5
     * would equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     * <p>
     * <b>Format: </b><br>
     * F5.2
     * <p>
     * <b>Example: </b><br>
     * 3.5
     * <p>
     * 
     * @return the current value of the <code>recoveryTimeDocuments</code> property.<br>
     */
    public BigDecimal getRecoveryTimeDocuments() {
        return this.recoveryTimeDocuments;
    }

    /**
     * Gets the value of the <code>recoveryTimeExpress</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a express cargo shipment from the
     * time of flight arrival to the time of shipment release from the station. For example, an entry of 3.5
     * would equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     * <p>
     * <b>Format: </b><br>
     * F5.2
     * <p>
     * <b>Example: </b><br>
     * 3.5
     * <p>
     * 
     * @return the current value of the <code>recoveryTimeExpress</code> property.<br>
     */
    public BigDecimal getRecoveryTimeExpress() {
        return this.recoveryTimeExpress;
    }

    /**
     * Gets the value of the <code>recoveryTimeFrame</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a time frame cargo shipment from
     * the time of flight arrival to the time of shipment release from the station. For example, an entry of
     * 3.5 would equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes
     * Valid formats are 9999, 99.99, 9.99. Negative amounts are not allowed.
     * <p>
     * <b>Format: </b><br>
     * F5.2
     * <p>
     * <b>Example: </b><br>
     * 3.5
     * <p>
     * 
     * @return the current value of the <code>recoveryTimeFrame</code> property.<br>
     */
    public BigDecimal getRecoveryTimeFrame() {
        return this.recoveryTimeFrame;
    }

    /**
     * Gets the value of the <code>recoveryTimeNormal</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a general cargo shipment from the
     * time of flight arrival to the time of shipment release from the station. For example, an entry of 3.5
     * would equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     * <p>
     * <b>Format: </b><br>
     * F5.2
     * <p>
     * <b>Example: </b><br>
     * 3.5
     * <p>
     * 
     * @return the current value of the <code>recoveryTimeNormal</code> property.<br>
     */
    public BigDecimal getRecoveryTimeNormal() {
        return this.recoveryTimeNormal;
    }

    /**
     * Gets the value of the <code>stationRemarks</code> property.
     * <p>
     * 
     * @return the current value of the <code>stationRemarks</code> property.<br>
     */
    public List<StationRemarksDto> getStationRemarks() {
        return this.stationRemarks;
    }

    /**
     * Gets the value of the <code>wareHouseHoursDto</code> property.
     * <p>
     * Office hours of the station for the warehouse services. It has the open and close time details of
     * weekdays, Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @return the current value of the <code>wareHouseHoursDto</code> property.<br>
     */
    public OfficeHourDto getWareHouseHours() {
        return this.wareHouseHours;
    }

    /**
     * Gets the value of <code>franchiseStationIndicator</code> property.
     * <p>
     * Indicates whether the station is a franchise station. Possible Values:
     * <li><code>true</code><br>
     * This station is a franchise station.
     * <li><code>false</code><br>
     * This station is not a franchise station.
     * <p>
     * 
     * @return the current value of the <code>franchiseStationIndicator</code> property.<br>
     */
    public boolean isFranchiseStationIndicator() {
        return this.franchiseStationIndicator;
    }

    /**
     * Gets the value of <code>importMechanizedIndicator</code> property.
     * <p>
     * Import mechanized indicator. Indicates if the import part of the station has a PC. This field is not
     * used for processing purposes within the application and is used only for display purposes. Possible
     * Values:
     * <li><code>true</code><br>
     * Indicates import does have a PC. This is the default value.
     * <li><code>false</code><br>
     * Indicates import does not have a PC.
     * <p>
     * 
     * @return the current value of the <code>importMechanizedIndicator</code> property.<br>
     */
    public boolean isImportMechanizedIndicator() {
        return this.importMechanizedIndicator;
    }

    /**
     * Gets the value of <code>importQualityAssuranceIndicator</code> property.
     * <p>
     * The Import Quality Assurance (IQA) station indicator states whether IQA processing is required at this
     * station when it is the destination station of the AWB. This indicator is used in processing only when
     * the airline performs import quality assurance. The audit routines use this indicator in the
     * determination of open audit flag.
     * <li><code>true</code><br>
     * Indicates Import Quality Assurance is performed.
     * <li><code>false</code><br>
     * Indicates Import Quality Assurance is not performed. This is the default value.
     * <p>
     * 
     * @return the current value of the <code>importQualityAssuranceIndicator </code> property.<br>
     */
    public boolean isImportQualityAssuranceIndicator() {
        return this.importQualityAssuranceIndicator;
    }

    /**
     * Gets the value of <code>productCodeExceptionsExistIndicator</code> property.
     * <p>
     * The ProductCodeException Exist indicator indicates whether this station has exception offsets for
     * products. Possible Values:
     * <li><code>true</code><br>
     * This station has exception offsets to a product.
     * <li><code>false</code><br>
     * This station does not have exception offsets to a product. Default value is false.
     * <p>
     * 
     * @return the current value of the <code> productCodeExceptionsExistIndicator</code> property.<br>
     */
    public boolean isProductCodeExceptionsExistIndicator() {
        return this.productCodeExceptionsExistIndicator;
    }

    /**
     * Sets the value of the <code>checkInAllDefaultLocations</code> property.
     * <p>
     * The default location for the check-in of goods from a flight with check-in-all at the station. This
     * location is used when there is no location entered in the check- in-all function. If this field is
     * blank, the system-wide default system location parameter is used by the Accept Goods function (LMS
     * parameter is C$LOCN). The value of "NONE" can be entered to indicate that there is no default location
     * defined at the station level and that the system wide-default value is not to be used.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 1EXPORT
     * <p>
     * 
     * @param pCheckInAllDefaultLocations the new value of the <code>checkInAllDefaultLocations</code>
     *            property.<br>
     */
    public void setCheckInAllDefaultLocations(final String pCheckInAllDefaultLocations) {
        this.checkInAllDefaultLocations = ContractUtility.convertToUpperCase(pCheckInAllDefaultLocations);
    }

    /**
     * Sets the value of the <code>customsHoursDto</code> property.
     * <p>
     * Office hours of the station for customs service. It has the open and close time details of weekdays,
     * Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @param pCustomsHoursDto the new value of the <code>customsHoursDto</code> property.<br>
     */
    public void setCustomsHours(final OfficeHourDto pCustomsHoursDto) {
        this.customsHours = pCustomsHoursDto;
    }

    /**
     * Sets the value of the <code>customsPortNumber</code> property.
     * <p>
     * Indicates the customs port number.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @param pCustomsPortNumber the new value of the <code>customsPortNumber</code> property.<br>
     */
    public void setCustomsPortNumber(final int pCustomsPortNumber) {
        this.customsPortNumber = pCustomsPortNumber;
    }

    /**
     * Sets the value of the <code>deliveryAccountExpressCargo</code> property.
     * <p>
     * This field specifies the account numbers for the express cargo delivery operator. This account is also
     * used for Time Frame deliveries.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 181818
     * <p>
     * 
     * @param pDeliveryAccountExpressCargo the new value of the <code>deliveryAccountExpressCargo</code>
     *            property.<br>
     */
    public void setDeliveryAccountExpressCargo(final String pDeliveryAccountExpressCargo) {
        this.deliveryAccountExpressCargo = pDeliveryAccountExpressCargo;
    }

    /**
     * Sets the value of the <code>deliveryAccountNormalCargo</code> property.
     * <p>
     * This field specifies the account numbers for the local delivery operator. This account is also used for
     * Time Frame deliveries.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 181818
     * <p>
     * 
     * @param pDeliveryAccountNormalCargo the new value of the <code>deliveryAccountNormalCargo</code>
     *            property.<br>
     */
    public void setDeliveryAccountNormalCargo(final String pDeliveryAccountNormalCargo) {
        this.deliveryAccountNormalCargo = pDeliveryAccountNormalCargo;
    }

    /**
     * Sets the value of the <code>deliveryHoursDto</code> property.
     * <p>
     * Office hours of the station to delivery goods. It has the open and close time details of weekdays,
     * Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @param pDeliveryHoursDto the new value of the <code>deliveryHoursDto</code> property.<br>
     */
    public void setDeliveryHours(final OfficeHourDto pDeliveryHoursDto) {
        this.deliveryHours = pDeliveryHoursDto;
    }

    /**
     * Sets the value of the <code>drivingTimeToAirport</code> property.
     * <p>
     * Driving time (in hours and minutes) from the franchise office to the airport. For example, an entry of
     * 3.5 would equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     * <p>
     * <b>Format: </b><br>
     * F5.2
     * <p>
     * <b>Example: </b><br>
     * 3.5
     * <p>
     * 
     * @param pDrivingTimeToAirport the new value of the <code>drivingTimeToAirport</code> property.<br>
     */
    public void setDrivingTimeToAirport(final BigDecimal pDrivingTimeToAirport) {
        this.drivingTimeToAirport = pDrivingTimeToAirport;
    }

    /**
     * Sets the value of the <code>dropOffTimeDocuments</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a document cargo shipment from the
     * time of drop-off at the station to the time of flight departure. For example, an entry of 3.5 would
     * equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     * <p>
     * <b>Format: </b><br>
     * F5.2
     * <p>
     * <b>Example: </b><br>
     * 3.5
     * <p>
     * 
     * @param pDropOffTimeDocuments the new value of the <code>dropOffTimeDocuments</code> property.<br>
     */
    public void setDropOffTimeDocuments(final BigDecimal pDropOffTimeDocuments) {
        this.dropOffTimeDocuments = pDropOffTimeDocuments;
    }

    /**
     * Sets the value of the <code>dropOffTimeExpress</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a express cargo shipment from the
     * time of drop-off at the station to the time of flight departure. For example, an entry of 3.5 would
     * equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     * <p>
     * <b>Format: </b><br>
     * F5.2
     * <p>
     * <b>Example: </b><br>
     * 3.5
     * <p>
     * 
     * @param pDropOffTimeExpress the new value of the <code>dropOffTimeExpress</code> property.<br>
     */
    public void setDropOffTimeExpress(final BigDecimal pDropOffTimeExpress) {
        this.dropOffTimeExpress = pDropOffTimeExpress;
    }

    /**
     * Sets the value of the <code>dropOffTimeFrame</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a time frame cargo shipment from
     * the time of drop-off at the station to the time of flight departure. For example, an entry of 3.5 would
     * equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     * <p>
     * <b>Format: </b><br>
     * F5.2
     * <p>
     * <b>Example: </b><br>
     * 3.5
     * <p>
     * 
     * @param pDropOffTimeFrame the new value of the <code>dropOffTimeFrame</code> property.<br>
     */
    public void setDropOffTimeFrame(final BigDecimal pDropOffTimeFrame) {
        this.dropOffTimeFrame = pDropOffTimeFrame;
    }

    /**
     * Sets the value of the <code>dropOffTimeNormal</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a general cargo shipment from the
     * time of drop-off at the station to the time of flight departure. For example, an entry of 3.5 would
     * equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     * <p>
     * <b>Format: </b><br>
     * F5.2
     * <p>
     * <b>Example: </b><br>
     * 3.5
     * <p>
     * 
     * @param pDropOffTimeNormal the new value of the <code>dropOffTimeNormal</code> property.<br>
     */
    public void setDropOffTimeNormal(final BigDecimal pDropOffTimeNormal) {
        this.dropOffTimeNormal = pDropOffTimeNormal;
    }

    /**
     * Sets the value of the <code>expressDeliveryPickUpHoursDto</code> property.
     * <p>
     * Office hours of the station for the express delivery pick ups. It has the open and close time details
     * of weekdays, Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @param pExpressDeliveryPickUpHoursDto the new value of the <code>expressDeliveryPickUpHoursDto</code>
     *            property.<br>
     */
    public void setExpressDeliveryPickUpHours(final OfficeHourDto pExpressDeliveryPickUpHoursDto) {
        this.expressDeliveryPickUpHours = pExpressDeliveryPickUpHoursDto;
    }

    /**
     * Sets the value of the <code>expressPickUpHoursDto</code> property.
     * <p>
     * Office hours of the station for the express pick ups. It has the open and close time details of
     * weekdays, Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @param pExpressPickUpHoursDto the new value of the <code>expressPickUpHoursDto</code> property.<br>
     */
    public void setExpressPickUpHours(final OfficeHourDto pExpressPickUpHoursDto) {
        this.expressPickUpHours = pExpressPickUpHoursDto;
    }

    /**
     * Sets the value of <code>franchiseStationIndicator</code> property.
     * <p>
     * Indicates whether the station is a franchise station. Possible Values:
     * <li><code>true</code><br>
     * This station is a franchise station.
     * <li><code>false</code><br>
     * This station is not a franchise station.
     * <p>
     * 
     * @param pFranchiseStationIndicator the new value of the <code>franchiseStationIndicator</code> property.<bR>
     */
    public void setFranchiseStationIndicator(final boolean pFranchiseStationIndicator) {
        this.franchiseStationIndicator = pFranchiseStationIndicator;
    }

    /**
     * Sets the value of the <code>importDefaultLocations</code> property.
     * <p>
     * The default location for the check-in of goods from a flight at this station. This location is used
     * when there is no location entered in the check-in functions. If this field is blank, then the
     * system-wide default system location parameter is used by the Accept Goods function (LMS parameter is
     * C$GLOC). The value of "NONE" can be entered to indicate that there is no default location defined at
     * the station level and that the system-wide default value is not to be used.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 1IMPORT
     * <p>
     * 
     * @param pImportDefaultLocations the new value of the <code>importDefaultLocations</code> property.<br>
     */
    public void setImportDefaultLocations(final String pImportDefaultLocations) {
        this.importDefaultLocations = ContractUtility.convertToUpperCase(pImportDefaultLocations);
    }

    /**
     * Sets the value of <code>importMechanizedIndicator</code> property.
     * <p>
     * Import mechanized indicator. Indicates if the import part of the station has a PC. This field is not
     * used for processing purposes within the application and is used only for display purposes. Possible
     * Values:
     * <li><code>true</code><br>
     * Indicates import does have a PC. This is the default value.
     * <li><code>false</code><br>
     * Indicates import does not have a PC.
     * <p>
     * 
     * @param pImportMechanizedIndicator the new value of the <code>importMechanizedIndicator</code> property.<bR>
     */
    public void setImportMechanizedIndicator(final boolean pImportMechanizedIndicator) {
        this.importMechanizedIndicator = pImportMechanizedIndicator;
    }

    /**
     * Sets the value of <code>importQualityAssuranceIndicator</code> property.
     * <p>
     * The Import Quality Assurance (IQA) station indicator states whether IQA processing is required at this
     * station when it is the destination station of the AWB. This indicator is used in processing only when
     * the airline performs import quality assurance. The audit routines use this indicator in the
     * determination of open audit flag.
     * <li><code>true</code><br>
     * Indicates Import Quality Assurance is performed.
     * <li><code>false</code><br>
     * Indicates Import Quality Assurance is not performed. This is the default value.
     * <p>
     * 
     * @param pImportQualityAssuranceIndicator the new value of the <code>importQualityAssuranceIndicator
     *            </code> property.<bR>
     */
    public void setImportQualityAssuranceIndicator(final boolean pImportQualityAssuranceIndicator) {
        this.importQualityAssuranceIndicator = pImportQualityAssuranceIndicator;
    }

    /**
     * Sets the value of the <code>officeOtherChargeQueues</code> property.
     * <p>
     * Queuing office designator for an air waybill that is queued for miscellaneous rates. If this field is
     * left blank, the air waybill is queued to the office that the agent has signed into.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Numeric
     * <p>
     * <b>Example: </b><br>
     * 001
     * <p>
     * 
     * @param pOfficeOtherChargeQueues the new value of the <code>officeOtherChargeQueues</code> property.<br>
     */
    public void setOfficeOtherChargeQueues(final int pOfficeOtherChargeQueues) {
        this.officeOtherChargeQueues = pOfficeOtherChargeQueues;
    }

    /**
     * Sets the value of the <code>openHoursDto</code> property.
     * <p>
     * Office hours of the station that's time when the station is opened for service. It has the open and
     * close time details of weekdays, Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @param pOpenHoursDto the new value of the <code>openHoursDto</code> property.<br>
     */
    public void setOpenHours(final OfficeHourDto pOpenHoursDto) {
        this.openHours = pOpenHoursDto;
    }

    /**
     * Sets the value of the <code>pickUpAccountExpressCargo</code> property.
     * <p>
     * This field specifies the account numbers for the local pick-up operator. This account is also used for
     * Time Frame pick-ups.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 181818
     * <p>
     * 
     * @param pPickUpAccountExpressCargo the new value of the <code>pickUpAccountExpressCargo</code> property.<br>
     */
    public void setPickUpAccountExpressCargo(final String pPickUpAccountExpressCargo) {
        this.pickUpAccountExpressCargo = pPickUpAccountExpressCargo;
    }

    /**
     * Sets the value of the <code>pickUpAccountNormalCargo</code> property.
     * <p>
     * This field specifies the account numbers for the local pick-up operator. This account is also used for
     * Time Frame pick-ups.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 181818
     * <p>
     * 
     * @param pPickUpAccountNormalCargo the new value of the <code>pickUpAccountNormalCargo</code> property.<br>
     */
    public void setPickUpAccountNormalCargo(final String pPickUpAccountNormalCargo) {
        this.pickUpAccountNormalCargo = pPickUpAccountNormalCargo;
    }

    /**
     * Sets the value of the <code>pickUpHoursDto</code> property.
     * <p>
     * Office hours of the station for the express pick ups. It has the open and close time details of
     * weekdays, Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @param pPickUpHoursDto the new value of the <code>pickUpHoursDto</code> property.<br>
     */
    public void setPickUpHours(final OfficeHourDto pPickUpHoursDto) {
        this.pickUpHours = pPickUpHoursDto;
    }

    /**
     * Sets the value of <code>productCodeExceptionsExistIndicator</code> property.
     * <p>
     * The ProductCodeException Exist indicator indicates whether this station has exception offsets for
     * products. Possible Values:
     * <li><code>true</code><br>
     * This station has exception offsets to a product.
     * <li><code>false</code><br>
     * This station does not have exception offsets to a product. Default value is false.
     * <p>
     * 
     * @param pProductCodeExceptionsExistIndicator the new value of the <code>
     *            productCodeExceptionsExistIndicator </code> property.<bR>
     */
    public void setProductCodeExceptionsExistIndicator(final boolean pProductCodeExceptionsExistIndicator) {
        this.productCodeExceptionsExistIndicator = pProductCodeExceptionsExistIndicator;
    }

    /**
     * Sets the value of the <code>recoveryTimeDocuments</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a document cargo shipment from the
     * time of flight arrival to the time of shipment release from the station. For example, an entry of 3.5
     * would equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     * <p>
     * <b>Format: </b><br>
     * F5.2
     * <p>
     * <b>Example: </b><br>
     * 3.5
     * <p>
     * 
     * @param pRecoveryTimeDocuments the new value of the <code>recoveryTimeDocuments</code> property.<br>
     */
    public void setRecoveryTimeDocuments(final BigDecimal pRecoveryTimeDocuments) {
        this.recoveryTimeDocuments = pRecoveryTimeDocuments;
    }

    /**
     * Sets the value of the <code>recoveryTimeExpress</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a express cargo shipment from the
     * time of flight arrival to the time of shipment release from the station. For example, an entry of 3.5
     * would equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes.
     * <p>
     * <b>Format: </b><br>
     * F5.2
     * <p>
     * <b>Example: </b><br>
     * 3.5
     * <p>
     * 
     * @param pRecoveryTimeExpress the new value of the <code>recoveryTimeExpress</code> property.<br>
     */
    public void setRecoveryTimeExpress(final BigDecimal pRecoveryTimeExpress) {
        this.recoveryTimeExpress = pRecoveryTimeExpress;
    }

    /**
     * Sets the value of the <code>recoveryTimeFrame</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a time frame cargo shipment from
     * the time of flight arrival to the time of shipment release from the station. For example, an entry of
     * 3.5 would equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes
     * Valid formats are 9999, 99.99, 9.99. Negative amounts are not allowed.
     * <p>
     * <b>Format: </b><br>
     * F5.2
     * <p>
     * <b>Example: </b><br>
     * 3.5
     * <p>
     * 
     * @param pRecoveryTimeFrame the new value of the <code>recoveryTimeFrame</code> property.<br>
     */
    public void setRecoveryTimeFrame(final BigDecimal pRecoveryTimeFrame) {
        this.recoveryTimeFrame = pRecoveryTimeFrame;
    }

    /**
     * Sets the value of the <code>recoveryTimeNormal</code> property.
     * <p>
     * The amount of time in hours and minutes that is required to process a general cargo shipment from the
     * time of flight arrival to the time of shipment release from the station. For example, an entry of 3.5
     * would equal three and one half hours or an entry of 1.25 would equal one hour and fifteen minutes
     * <p>
     * <b>Format: </b><br>
     * F5.2
     * <p>
     * <b>Example: </b><br>
     * 3.5
     * <p>
     * 
     * @param pRecoveryTimeNormal the new value of the <code>recoveryTimeNormal</code> property.<br>
     */
    public void setRecoveryTimeNormal(final BigDecimal pRecoveryTimeNormal) {
        this.recoveryTimeNormal = pRecoveryTimeNormal;
    }

    /**
     * Sets the value of the <code>stationRemarks</code> property.
     * <p>
     * 
     * @param pStationRemarks the new value of the <code>stationRemarks</code> property.<br>
     */
    public void setStationRemarks(final List<StationRemarksDto> pStationRemarks) {
        this.stationRemarks = pStationRemarks;
    }

    /**
     * Sets the value of the <code>wareHouseHoursDto</code> property.
     * <p>
     * Office hours of the station for the warehouse services. It has the open and close time details of
     * weekdays, Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @param pWareHouseHoursDto the new value of the <code>wareHouseHoursDto</code> property.<br>
     */
    public void setWareHouseHours(final OfficeHourDto pWareHouseHoursDto) {
        this.wareHouseHours = pWareHouseHoursDto;
    }

	// MH021
    public String getApsDailyStartTime() {
		return apsDailyStartTime;
	}

	public void setApsDailyStartTime(String apsDailyStartTime) {
		this.apsDailyStartTime = apsDailyStartTime;
	}

	public String getApsDailyEndTime() {
		return apsDailyEndTime;
	}

	public void setApsDailyEndTime(String apsDailyEndTime) {
		this.apsDailyEndTime = apsDailyEndTime;
	}
}
