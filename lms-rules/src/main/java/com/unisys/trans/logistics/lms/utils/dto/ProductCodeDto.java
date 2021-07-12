/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.math.BigDecimal;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.util.List;

/**
 * <code>ProductCodeDto</code> contains all the details specific to a <code>ProductCode</code>.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>allianceCode
 * <li>bookedIndicator
 * <li>connectionTimeDifference
 * <li>description
 * <li>dropOffTimeDifference
 * <li>dueText
 * <li>dueHours
 * <li>fzdFzeMsgIndicator
 * <li>incomingServiceCode
 * <li>lastMinuteIndicator
 * <li>latestAcceptanceTimeCode
 * <li>oId
 * <li>outgoingServiceCode
 * <li>printIndicator
 * <li>productCode
 * <li>queueReasonCode
 * <li>rateTypeCode
 * <li>recoveryTimeDifference
 * <li>serviceLevelCode
 * <li>smallPackageExpressCode
 * <li>specialHandlingCodes
 * <li>timeDefiniteCode
 * <li>timeDefiniteTypeCode
 * </code>
 * </ul>
 */
public class ProductCodeDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8935139038530856596L;

    /**
     * Attribute to hold <code>allianceCode</code> property.
     * <p>
     * It is the code of the alliance brand associated with the product. Some products are specific to an
     * alliance and have special business rules. This code be used to execute those special business rules.
     */
    private String allianceCode;

    /**
     * Attribute to hold <code>bookedIndicator</code> property.
     * <p>
     * Indicates if booking is required for the product when it is used as an express product using per unit
     * rating.<br>
     */
    private boolean bookedIndicator;

    /**
     * Attribute to hold <code>connectionTimeDifference</code> property.
     * <p>
     * The difference in the connection time (in hours and minutes) between the station's connection time and
     * product code connection time that is needed to process the shipment for connecting flights.<br>
     */
    private double connectionTimeDifference;

    /**
     * Attribute to hold <code>dateRangeDto</code> property.
     */
    private DateRangeDto dateRangeDto;

    /**
     * Attribute to hold <code>description</code> property.
     * <p>
     * Description of air waybill product code. The first 10 characters may be printed on bar code labels.
     */
    private String description;

    /**
     * Attribute to hold <code>dropOffTimeDifference</code> property.
     * <p>
     * The difference in the amount of time (in hours and minutes) between the station's drop-off time and
     * product code drop-off time, a station needs for shipments to be dropped-off at the airport, processed
     * and ready for loading on the flight.
     */
    private double dropOffTimeDifference;

    /**
     * Attribute to hold <code>dueHours</code> property.
     * <p>
     * Indicates the number of hours for the shipment to arrive at its destination. This field is usually
     * added to the acceptance time of the shipment to arrive at the shipment arrival at destination date.<br>
     */
    private Integer dueHours;

    /**
     * Attribute to hold <code>dueText</code> property.
     * <p>
     * It is a free format text entered on the shipment status, freight reservation list and lot labels.<br>
     */
    private String dueText;

    /**
     * Attribute to hold <code>fzdFzeMsgIndicator</code> property.
     * <p>
     * Indicates if the product causes the automatic generation of FZD/FZE messages.<br>
     */

    private boolean fzdFzeMsgIndicator;

    /**
     * Attribute to hold <code>incomingServiceCode</code> property.
     * <p>
     * Type of service code to be associated with the product code that is received on incoming Cargo IMP
     * messages.<br>
     * These service codes cannot be duplicated on the product code table. A specific incoming service code
     * can be associated with only one product code.<br>
     */
    private String incomingServiceCode;

    /**
     * Attribute to hold <code>lastMinuteIndicator</code> property.
     * <p>
     * The Last Minute indicator specifies whether a shipment with this product code can still be booked and
     * assigned to a flight after the flight is closed with the option [NPC]Strict close to all assignments
     * and removals except for last minute products.<br>
     */
    private boolean lastMinuteIndicator;

    /**
     * Attribute to hold <code>latestAcceptanceTimeCode</code> property.
     * <p>
     * Indicates if the latest acceptance date/ time and time of availability are calculated based on the
     * postal code information or the flight date/ time.<br>
     */
    private String latestAcceptanceTimeCode;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique identifier for the <code>ProductCodeDto</code>.
     */
    private Long oId;

    /**
     * Attribute to hold <code>otherChargeCode</code> property.
     * <p>
     * Other charge code associated with the product code.A maximum of three other charge codes can be entered
     * which will get automatically added to the air waybill when the associated product code is entered.
     */
    private List<ProductOtherChargesCodeDto> otherChargeCode;

    /**
     * Attribute to hold <code>outgoingServiceCode</code> property.
     * <p>
     * Type of service code to be associated with the product code input for a shipment. This service code
     * will be assigned to the shipment when the associated product code is used on the shipment. This service
     * code controls the functionality associated with the shipment within LMS.<br>
     */
    private String outgoingServiceCode;

    /**
     * Attribute to hold <code>printIndicator</code> property.
     * <p>
     * This indicator is used to print product description on the bar code label.
     */
    private boolean printIndicator;

    /**
     * Attribute to hold <code>productCode</code> property.
     * <p>
     * Define the special processing that applies to a shipment.
     */
    private String productCode;

    /**
     * Attribute to hold <code>queueReasonCode</code> property.
     * <p>
     * Alternate booking queue reason code. The queue reason code should be validated against the queue reason
     * code table. When entered, this queue is used instead of the Force Bookings Queue.<br>
     */
    private String queueReasonCode;

    /**
     * Attribute to hold <code>rateTypeCode</code> property.
     * <p>
     * It indicates if product code is used in pricing the shipment.
     */
    private String rateTypeCode;

    /**
     * Attribute to hold <code>recoveryTimeDifference</code> property.
     * <p>
     * The difference in the amount of time (in hours and minutes) between the station's recovery time and the
     * product code recovery time, a station needs for shipments to be checked-in from flight, processed at
     * import, and ready for delivery at destination.
     */
    private double recoveryTimeDifference;

    /**
     * Attribute to hold <code>serviceLevelCode</code> property.
     * <p>
     * Service level of the product.<br>
     * <b>Possible Values :</b><br>
     * N – Normal<br>
     * E – Express<br>
     * T - Time Frame<br>
     */
    private String serviceLevelCode;

    /**
     * Attribute to hold <code>smallPackageExpressCode</code> property.
     * <p>
     * Small package express indicator is applicable to express / premium freight shipments.<br>
     * P - Small package express rates are per piece rate. X - Premium bulk rates are weight based. L -
     * Supplemental waybill. This can be associated with only one product code.
     */
    private String smallPackageExpressCode;

    /**
     * Attribute to hold <code>specialHandlingCodes</code> property.
     * <p>
     * Special handling codes associated with the product code.A maximum of 5 codes are allowed per product
     * code.<br>
     */
    private List<ProductSpecialHandlingCodeDto> specialHandlingCodes;

    /**
     * Attribute to hold <code>timeDefiniteCode</code> property.
     * <p>
     * Indicates if the product is a time definite product. Controls the Time Definite functionality. When
     * set, time definite business rules are applied to processing.<br>
     */
    private String timeDefiniteCode;

    /**
     * Attribute to hold <code>timeDefiniteTypeCode</code> property.
     * <p>
     * Indicates the type of time definite product.<br>
     */
    private String timeDefiniteTypeCode;
    private Integer maxPiecesperAirWaybill;
    
    private Integer maxPiecesperRatingLine;
    
    private BigDecimal maxWeightperPiece;
    
    private WeightUOMType weightUnit;
    private String specificAirline;
    //dl651
    private boolean  dimsRequired;

	
	/**
     * <code>Default Constructor.</code>
     */
    public ProductCodeDto() {

    }

    /**
     * Constructor with <code>productCode</code> as an argument.
     * <p>
     * 
     * @param pProductCode the new value of <code>productCode</code>.<br>
     */
    public ProductCodeDto(final String pProductCode, final String pSecificAirline) {
        this.productCode = pProductCode;
        this.specificAirline = pSecificAirline;
    }
   
   public ProductCodeDto(final Long pOid,final String pProductCode,final String  pDescription){
       this.oId=pOid;
       this.productCode=pProductCode;
       this.description=pDescription;
   }


    /**
     * Gets the <code>allianceCode</code> property.
     * <p>
     * It is the code of the alliance brand associated with the product. Some products are specific to an
     * alliance and have special business rules.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * SK
     * <p>
     * 
     * @return the current value of <code>allianceCode</code> product.<br>
     */
    public String getAllianceCode() {
        return this.allianceCode;
    }

    /**
     * Gets the <code>bookedIndicator</code> property.
     * <p>
     * Indicates whether Booking is required for the product when used as an express product using per unit
     * rating.
     * <p>
     * <b>Possible Values:</b>
     * <li><code>true</code><br>
     * Booking required.<br>
     * <li><code>false</code><br>
     * Booking not required.<br>
     * <p>
     * 
     * @return the current value of <code>bookedIndicator</code> property.<br>
     */
    public boolean getBookedIndicator() {
        return this.bookedIndicator;
    }

    /**
     * Gets the <code>connectionTimeDifference</code> property.
     * <p>
     * The difference in the connection time (in hours and minutes) between the station's connection time and
     * product code connection time that is needed to process the shipment for connecting flights.
     * <p>
     * <b>Format: </b><br>
     * 1-8 Numeric
     * <p>
     * <b>Example: </b><br>
     * 3.5 -An entry of 3.5 equals three and one half hours.
     * <p>
     * 
     * @return the current value of <code>connectionTimeDifference</code> of the carrier.<br>
     */
    public double getConnectionTimeDifference() {
        return this.connectionTimeDifference;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto
     * DateRangeDto} containing <code>DateRangeDto</code> details.
     * <p>
     * 
     * @return the current value of <code>DateRangeDto</code> details.
     */
    public DateRangeDto getDateRangeDto() {
        if (this.dateRangeDto == null) {
            this.dateRangeDto = new DateRangeDto();
        }
        return this.dateRangeDto;
    }

    /**
     * Gets the <code>description</code> property.
     * <p>
     * This represents the text description of air waybill Product code. The first 10 characters may be
     * printed on bar code labels.
     * <p>
     * <b>Format: </b><br>
     * 1-50 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * ABCED
     * <p>
     * 
     * @return the current value of <code>description</code> property.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the <code>dropOffTimeDifference</code> property.
     * <p>
     * Indicates the difference in the amount of time in hours and minutes from the station’s drop-off time
     * and product code drop-off time, a station needs for shipments to be dropped-off at the airport,
     * processed and ready for loading on the flight.This time is expressed as a positive or negative number
     * and is subtracted from the flight departure time.
     * <p>
     * <b>Format: </b><br>
     * 8 Numeric
     * <p>
     * <b>Example: </b><br>
     * 3.5 - An entry of 3.5 equals three and one half hours.
     * <p>
     * 
     * @return the current value of <code>dropOffTimeDifference</code> property.
     */
    public double getDropOffTimeDifference() {
        return this.dropOffTimeDifference;
    }

    /**
     * Gets the <code>dueHours</code> property.
     * <p>
     * Indicates the number of hour’s parameter for the shipment to arrive at its destination. This field is
     * usually added to the acceptance time of the shipment to arrive at the shipment arrival at destination
     * date.The value ranges from 1-999.
     * <p>
     * <b>Format:</b><br>
     * 3 Numeric<br>
     * Range : 1-999
     * <p>
     * <b>Example: </b><br>
     * 48
     * <p>
     * 
     * @return the current value of <code>dueHours</code> property.<br>
     */
    public Integer getDueHours() {
        return this.dueHours;
    }

    /**
     * Gets the <code>dueText</code> property.<br>
     * <p>
     * Indicates the free format text which will be output on the shipment status, freight reservation list
     * and lot labels.
     * <p>
     * <b>Format: </b><br>
     * 5 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * COMAT
     * <p>
     * 
     * @return the current value of <code>dueText</code> property.<br>
     */
    public String getDueText() {
        return this.dueText;
    }

    /**
     * Gets the <code>fzdFzeMsgIndicator</code> property.<br>
     * <p>
     * FZD/FZE message generation indicator controls whether this product code causes the automatic generation
     * of FZD/FZE messages.
     * <p>
     * <b>Possible Values: </b>
     * <li><code>true</code> - the product code causes FZD/FZE message generation.<br>
     * <li><code>false</code> - the product code does not cause FZD/FZE message generation.<br>
     * <li>Default is N.<br>
     * <p>
     * 
     * @return the current value of <code>fzdFzeMsgIndicator</code> property.<br>
     */
    public boolean getFzdFzeMsgIndicator() {
        return this.fzdFzeMsgIndicator;
    }

    /**
     * Gets the <code>incomingServiceCode</code> property.
     * <p>
     * Indicates the type of service code to be associated with the product code received on incoming Cargo
     * IMP messages.
     * <p>
     * <b>Possible Values :</b><br>
     * <li>B - Service shipment.
     * <li>C - Company material.
     * <li>D - Door-to-Door service.
     * <li>J - Priority service.
     * <li>P - Small package service.
     * <li>T - Charter.<br>
     * These service codes cannot be duplicated on the product code table. A specific incoming service code
     * can be associated with only one product code.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * C
     * <p>
     * 
     * @return the current value of <code>incomingServiceCode</code> property.<br>
     */
    public String getIncomingServiceCode() {
        return this.incomingServiceCode;
    }

    /**
     * Gets the <code>lastMinuteIndicator</code> property.
     * <p>
     * Specifies whether a shipment with this <code>productCode</code> can still be booked and assigned to a
     * flight after the flight is closed with the option "Strict close to all assignments and removals except
     * for last minute products".
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * A shipment with this product code can be booked and assigned to a flight after the flight is strictly
     * closed.<br>
     * <li><code>false</code><br>
     * A shipment with this product code can be booked and assigned to a flight after the flight is strictly
     * closed by only a user with special authority.<br>
     * <li>Default is N.<br>
     * <p>
     * 
     * @return the current value of <code>lastMinuteIndicator</code> property.<br>
     */
    public boolean getLastMinuteIndicator() {
        return this.lastMinuteIndicator;
    }

    /**
     * Gets the <code>latestAcceptanceTimeCode</code> property.
     * <p>
     * Indicates if the latest acceptance date/ time and time of availability are calculated based on the
     * postal code information or the flight date/ time.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * D
     * <p>
     * 
     * @return the current value of <code>latestAcceptanceTimeCode</code> property.<br>
     */
    public String getLatestAcceptanceTimeCode() {
        return this.latestAcceptanceTimeCode;
    }

    /**
     * Gets the <code>oid</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the list of <code>otherChargeCode</code> property.<br>
     * <p>
     * Maximum of three other charge codes can be entered,which will get automatically added to the air
     * waybill when the associated <code>productCode</code> is entered.
     * <p>
     * 
     * @return the current value of <code>otherChargeCode</code> details.<br>
     */
    public List<ProductOtherChargesCodeDto> getOtherChargeCode() {
        return this.otherChargeCode;
    }

    /**
     * Gets the <code>outgoingServiceCode</code> property.
     * <p>
     * Indicates the service code to be associated with the <code>productCode</code> input for a shipment.
     * This service code will be assigned to the shipment when the associated <code>productCode</code> is used
     * on the shipment. This service code controls the functionality associated with the shipment within LMS.
     * <p>
     * <b>Possible examples:</b><br>
     * <li><code>C</code> - Company material (This type of shipment does not have charges associated and
     * charges cannot be entered).
     * <li><code>T</code> - Charter (This type of shipment has charges but the charges are manually rated with
     * a rate class of T).
     * <li><code>D</code> -Door to Door service.
     * <li><code>B</code> - Service shipment (This type of shipment has one free rating line with rating line
     * indicator as S and the charges are generated from the pricing module).<br>
     * A single service code can be associated with many product codes.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * T
     * <p>
     * 
     * @return the current value of <code>outgoingServiceCode</code> property.<br>
     */
    public String getOutgoingServiceCode() {
        return this.outgoingServiceCode;
    }

    /**
     * Gets the <code>printIndicator</code> property.
     * <p>
     * Indicates the print product code description on the bar code label.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code> <br>
     * Print text on bar code label.
     * <li><code>false</code> <br>
     * Does not print description on bar code label.
     * <p>
     * 
     * @return the current value of <code>printIndicator</code> property.<br>
     */
    public boolean getPrintIndicator() {
        return this.printIndicator;
    }

    /**
     * Gets the <code>productCode</code> property.
     * <p>
     * Define the special processing that applies to a shipment.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * COM
     * <p>
     * 
     * @return the current value of <code>productCode</code> property.<br>
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * Gets the <code>queueReasonCode</code> property.
     * <p>
     * Indicates the alternate booking queue reason code.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets
     * <p>
     * <b>Example: </b><br>
     * GF
     * <p>
     * 
     * @return the current value of <code>queueReasonCode</code> property.
     */
    public String getQueueReasonCode() {
        return this.queueReasonCode;
    }

    /**
     * Gets the <code>rateTypeCode</code> property.
     * <p>
     * Controls whether <code>productCode</code> is used in pricing the shipment.
     * <p>
     * <b>Possible values:</b><br>
     * <li>Y – The product code will become the default <code>rate type</code> for Advanced Cargo Rating.
     * <li>N – The product is not automatically used for Advanced Cargo Rating
     * <li>Q – The associated product code is not used with Advanced Cargo Rating, but air waybill is queued
     * to Rating Queue.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * Y
     * <p>
     * 
     * @return the current value of <code>rateTypeCode</code> property.
     */
    public String getRateTypeCode() {
        return this.rateTypeCode;
    }

    /**
     * Gets the <code>recoveryTimeDifference</code> property.
     * <p>
     * Indicates the difference in the amount of time in hours and minutes from the station’s recovery time
     * and product code recovery time, a station needs for shipments to be checked-in from flight, processed
     * at import, and ready for delivery at destination.This time is expressed as a positive or negative
     * number and is added from the flight arrival time.
     * <p>
     * <b>Format: </b><br>
     * 8 Numeric with decimal point
     * <p>
     * <b>Example: </b><br>
     * 3.5 - An entry of 3.5 equals three and one half hours.
     * <p>
     * 
     * @return the current value of <code>recoveryTimeDifference</code> property.
     */
    public double getRecoveryTimeDifference() {
        return this.recoveryTimeDifference;
    }

    /**
     * Gets the <code>serviceLevelCode</code> property.
     * <p>
     * Service Level of the Product.
     * <p>
     * <b>Possible Values:</b>
     * <li>N – Normal.
     * <li>E – Express
     * <li>T - Time Frame
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of <code>serviceLevelCode</code> property..<br>
     */
    public String getServiceLevelCode() {
        return this.serviceLevelCode;
    }

    /**
     * Gets the <code>smallPackageExpressCode</code> property.
     * <p>
     * Small package express indicator is applicable to express or premium freight shipments.
     * <p>
     * <b>Possible Values:</b>
     * <li>P - Small package express rates are per piece rate.
     * <li>X - Premium bulk rates are weight based.
     * <li>L - Supplemental air waybill. This can be associated with only one product code.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of <code>smallPackageExpressCode</code> property.<br>
     */
    public String getSmallPackageExpressCode() {
        return this.smallPackageExpressCode;
    }

    /**
     * Gets the list of <code>SpecialHandlingCodeDto</code> details.
     * <p>
     * A maximum of 5 codes are allowed per <code>productCode</code>.
     * <p>
     * 
     * @return the list of <code>SpecialHandlingCodeDto</code> details.<br>
     */
    public List<ProductSpecialHandlingCodeDto> getSpecialHandlingCodes() {
        return this.specialHandlingCodes;
    }

    /**
     * Gets the <code>timeDefiniteCode</code> property.
     * <p>
     * Controls the Time Definite functionality.When set, time definite business rules are applied to
     * processing.
     * <p>
     * <b>Possible Values:</b>
     * <li>AA - Airport to Airport.
     * <li>DD - Door to Door
     * <li>AD - Airport to Door
     * <li>DA - Door to Airport
     * <li>NO - Time Definite does not apply
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * AA
     * <p>
     * 
     * @return the current value of <code>timeDefiniteCode</code> property.<br>
     */
    public String getTimeDefiniteCode() {
        return this.timeDefiniteCode;
    }

    /**
     * Gets the <code>timeDefiniteTypeCode</code> property.
     * <p>
     * Indicates the type of time definite product.
     * <p>
     * <b>Possible Values:</b>
     * <li>O - Normal
     * <li>S – Same Day
     * <li>N – Next day
     * <li>F – First flight
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * N
     * <p>
     * 
     * @return the current value of <code>timeDefiniteTypeCode</code> property.<br>
     */
    public String getTimeDefiniteTypeCode() {
        return this.timeDefiniteTypeCode;
    }

    /**
     * Sets the <code>allianceCode</code> property.
     * <p>
     * It is the code of the alliance brand associated with the product. Some products are specific to an
     * alliance and have special business rules. This will be used to execute those special business rules.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * SK
     * <p>
     * 
     * @param pAllianceCode the new value of <code>allianceCode</code> property.<br>
     */
    public void setAllianceCode(final String pAllianceCode) {
        this.allianceCode = ContractUtility.convertToUpperCase(pAllianceCode);
    }

    /**
     * Sets the <code>bookedIndicator</code> property.
     * <p>
     * Indicates whether Booking is required for the product when used as an express product using per unit
     * rating.
     * <p>
     * <b>Possible Values:</b>
     * <li><code>true</code><br>
     * Booking required.<br>
     * <li><code>false</code><br>
     * Booking not required.<br>
     * <p>
     * 
     * @param pBookedIndicator the new value of the <code>bookedIndicator</code> property.<br>
     */
    public void setBookedIndicator(final boolean pBookedIndicator) {
        this.bookedIndicator = pBookedIndicator;
    }

    /**
     * Sets the <code>connectionTimeDifference</code> property.
     * <p>
     * The difference in the connection time (in hours and minutes) between the station's connection time and
     * product code connection time that is needed to process the shipment for connecting flights.
     * <p>
     * <b>Format: </b><br>
     * 1-8 Numeric
     * <p>
     * <b>Example: </b><br>
     * 3.5 -An entry of 3.5 equals three and one half hours.
     * <p>
     * 
     * @param pConnectionTimeDifference the new value of <code>connectionTimeDifference</code> of the product
     *            code.
     */
    public void setConnectionTimeDifference(final double pConnectionTimeDifference) {
        this.connectionTimeDifference = pConnectionTimeDifference;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto
     * DateRangeDto} containing <code>DateRange</code> details.
     * <p>
     * 
     * @param pDateRangeDto
     *            holds the new value of <code>DateRangeDto</code> type
     *            details.<br>
     */
    public void setDateRangeDto(final DateRangeDto pDateRangeDto) {
        this.dateRangeDto = pDateRangeDto;
    }

    /**
     * Sets the <code>description</code> property.<br>
     * <p>
     * Represents the text description of air waybill Product code. The first 10 characters may be printed on
     * bar code labels.
     * <p>
     * <b>Format: </b><br>
     * 1-50 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * ABCED
     * <p>
     * 
     * @param pDescription the new value of <code>description</code> property.<br>
     */
    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Sets the <code>dropOffTimeDifference</code> property.
     * <p>
     * Indicates the difference in the amount of time in hours and minutes from the station’s drop-off time
     * and product code drop-off time, a station needs for shipments to be dropped-off at the airport,
     * processed and ready for loading on the flight.This time is expressed as a positive or negative number
     * and is subtracted from the flight departure time.
     * <p>
     * <b>Format: </b><br>
     * 8 Numeric
     * <p>
     * <b>Example: </b><br>
     * 3.5 - An entry of 3.5 equals three and one half hours.
     * <p>
     * 
     * @param pDropOffTimeDifference the new value of <code>dropOffTimeDifference</code> property.
     */
    public void setDropOffTimeDifference(final double pDropOffTimeDifference) {
        this.dropOffTimeDifference = pDropOffTimeDifference;
    }

    /**
     * Sets the <code>dueHours</code> property.
     * <p>
     * Indicates the number of hour’s parameter for the shipment to arrive at its destination. This field is
     * usually added to the acceptance time of the shipment to arrive at the shipment arrival at destination
     * date.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric<br>
     * Range :1-999.
     * <p>
     * <b>Example: </b><br>
     * 48
     * <p>
     * 
     * @param pDueHours the new value of <code>dueHours</code> property.<br>
     */
    public void setDueHours(final Integer pDueHours) {
        this.dueHours = pDueHours;
    }

    /**
     * Sets the <code>dueText</code> property.<br>
     * <p>
     * Indicates the free format text which will be output on the shipment status, freight reservation list
     * and lot labels.
     * <p>
     * <b>Format: </b><br>
     * 5 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * COMAT
     * <p>
     * 
     * @param pDueText the new value of <code>dueText</code> property.<br>
     */
    public void setDueText(final String pDueText) {
        this.dueText = pDueText;
    }

    /**
     * Sets the <code>fzdFzeMsgIndicator</code> property.
     * <p>
     * FZD/FZE message generation indicator controls whether this product code causes the automatic generation
     * of FZD/FZE messages.
     * <p>
     * <b>Possible Values:</b>
     * <li><code>true</code> <br>
     * Product code causes FZD/FZE message generation.<br>
     * <li><code>false</code> <br>
     * Product code does not cause FZD/FZE message generation.<br>
     * <p>
     * 
     * @param pFzdFzeMsgIndicator the new value of the <code>fzdFzeMsgIndicator</code> property.<br>
     */
    public void setFzdFzeMsgIndicator(final boolean pFzdFzeMsgIndicator) {
        this.fzdFzeMsgIndicator = pFzdFzeMsgIndicator;
    }

    /**
     * Sets the <code>incomingServiceCode</code> property.
     * <p>
     * Indicates the type of service code to be associated with the product code received on incoming Cargo
     * IMP messages.
     * <p>
     * <b>Possible Values: </b><br>
     * <li>B - Service shipment.
     * <li>C - Company material.
     * <li>D - Door-to-Door service.
     * <li>J - Priority service.
     * <li>P - Small package service.
     * <li>T - Charter.<br>
     * These service codes cannot be duplicated on the product code table. A specific incoming service code
     * can be associated with only one product code.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * C
     * <p>
     * 
     * @param pIncomingServiceCode the new value of <code>incomingServiceCode</code> of the product.<br>
     */
    public void setIncomingServiceCode(final String pIncomingServiceCode) {
        this.incomingServiceCode = ContractUtility.convertToUpperCase(pIncomingServiceCode);
    }

    /**
     * Sets the <code>lastMinuteIndicator</code> property.
     * <p>
     * Specifies whether a shipment with this <code>productCode</code> can still be booked and assigned to a
     * flight after the flight is closed with the option "Strict close to all assignments and removals except
     * for last minute products".
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * A shipment with this product code can be booked and assigned to a flight after the flight is strictly
     * closed.<br>
     * <li><code>false</code><br>
     * A shipment with this product code can be booked and assigned to a flight after the flight is strictly
     * closed by only a user with special authority.<br>
     * <p>
     * 
     * @param pLastMinuteIndicator the new value of the <code>lastMinuteIndicator</code> property.
     */
    public void setLastMinuteIndicator(final boolean pLastMinuteIndicator) {
        this.lastMinuteIndicator = pLastMinuteIndicator;
    }

    /**
     * Sets the <code>latestAcceptanceTimeCode</code> property.
     * <p>
     * Indicates if the latest acceptance date/ time and time of availability are calculated based on the
     * postal code information or the flight date/ time.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * D
     * <p>
     * 
     * @param pLatestAcceptanceTimeCode the new value of <code>latestAcceptanceTimeCode</code> property.<br>
     */
    public void setLatestAcceptanceTimeCode(final String pLatestAcceptanceTimeCode) {
        this.latestAcceptanceTimeCode = ContractUtility.convertToUpperCase(pLatestAcceptanceTimeCode);
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the list of <code>otherChargeCode</code> property.
     * <p>
     * Maximum of three other charge codes can be entered,which will get automatically added to the air
     * waybill when the associated <code>productCode</code> is entered.
     * <p>
     * 
     * @param pOtherChargeCode the new list of <code>otherChargeCodes</code> type details.<br>
     */
    public void setOtherChargeCode(final List<ProductOtherChargesCodeDto> pOtherChargeCode) {
        this.otherChargeCode = pOtherChargeCode;
    }

    /**
     * Sets the <code>outgoingServiceCode</code> property.
     * <p>
     * Indicates the service code to be associated with the <code>productCode</code> input for a shipment.
     * This service code will be assigned to the shipment when the associated <code>productCode</code> is used
     * on the shipment. This service code controls the functionality associated with the shipment within LMS.
     * A single service code can be associated with many product codes.
     * <p>
     * <b>Possible Values:</b>
     * <li><code>C</code> - Company material (This type of shipment does not have charges associated and
     * charges cannot be entered).
     * <li><code>T</code> - Charter (This type of shipment has charges but the charges are manually rated with
     * a rate class of T).
     * <li><code>D</code> -Door to Door service.
     * <li><code>B</code> - Service shipment (This type of shipment has one free rating line with rating line
     * indicator as S and the charges are generated from the pricing module).
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * T
     * <p>
     * 
     * @param pOutgoingServiceCode the new value of <code>outgoingServiceCode</code> details.
     */
    public void setOutgoingServiceCode(final String pOutgoingServiceCode) {
        this.outgoingServiceCode = ContractUtility.convertToUpperCase(pOutgoingServiceCode);
    }

    /**
     * Sets the <code>printIndicator</code> property.
     * <p>
     * Indicates the print product code description on the bar code label.
     * <p>
     * <b>Possible Values: </b>
     * <li><code>true</code> <br>
     * Print text on bar code label.<br>
     * <li><code>false</code> <br>
     * Does not print description on bar code label.<br>
     * <p>
     * 
     * @param pPrintIndicator the new value of the <code>printIndicator</code> property.
     */
    public void setPrintIndicator(final boolean pPrintIndicator) {
        this.printIndicator = pPrintIndicator;
    }

    /**
     * Sets the <code>productCode</code> property.
     * <p>
     * Define the special processing that applies to a shipment.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * COM
     * <p>
     * 
     * @param pProductCode the current value of <code>productCode</code> property.<br>
     */
    public void setProductCode(final String pProductCode) {
        this.productCode = ContractUtility.convertToUpperCase(pProductCode);
    }

    /**
     * Sets the <code>queueReasonCode</code> property.
     * <p>
     * Indicates the alternate booking queue reason code.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets
     * <p>
     * <b>Example: </b><br>
     * GF
     * <p>
     * 
     * @param pQueueReasonCode the new value of <code>queueReasonCode</code> of the product.<br>
     */
    public void setQueueReasonCode(final String pQueueReasonCode) {
        this.queueReasonCode = ContractUtility.convertToUpperCase(pQueueReasonCode);
    }

    /**
     * Sets the <code>rateTypeCode</code> property.
     * <p>
     * Controls whether <code>productCode</code> is used in pricing the shipment.
     * <p>
     * <b>Possible values:</b>
     * <li>Y – The product code will become the default <code>rate type</code> for Advanced Cargo Rating.
     * <li>N – The product is not automatically used for Advanced Cargo Rating
     * <li>Q – The associated product code is not used with Advanced Cargo Rating, but Air Waybill is queued
     * to Rating Queue.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * Y
     * <p>
     * 
     * @param pRateTypeCode the new value of <code>rateTypeCode</code> property.<br>
     */
    public void setRateTypeCode(final String pRateTypeCode) {
        this.rateTypeCode = ContractUtility.convertToUpperCase(pRateTypeCode);
    }

    /**
     * Sets the <code>recoveryTimeDifference</code> property.
     * <p>
     * Indicates the difference in the amount of time in hours and minutes from the station’s recovery time
     * and product code recovery time, a station needs for shipments to be checked-in from flight, processed
     * at import, and ready for delivery at destination.This time is expressed as a positive or negative
     * number and is added from the flight arrival time.
     * <p>
     * <b>Format: </b><br>
     * 8 Numeric including 1 decimal point.
     * <p>
     * <b>Example: </b><br>
     * 3.5 - An entry of 3.5 equals three and one half hours.
     * <p>
     * 
     * @param pRecoveryTimeDifference the new value of <code>recoveryTimeDifference</code> property.<br>
     */
    public void setRecoveryTimeDifference(final double pRecoveryTimeDifference) {
        this.recoveryTimeDifference = pRecoveryTimeDifference;
    }

    /**
     * Sets the <code>serviceLevelCode</code> property.
     * <p>
     * Service Level of the Product.
     * <p>
     * <b>Possible Values:</b>
     * <li>N – Normal.
     * <li>E – Express
     * <li>T - Time Frame
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pServiceLevelCode the new value of <code>serviceLevelCode</code> property.
     */
    public void setServiceLevelCode(final String pServiceLevelCode) {
        this.serviceLevelCode = ContractUtility.convertToUpperCase(pServiceLevelCode);
    }

    /**
     * Sets the <code>smallPackageExpressCode</code> property.
     * <p>
     * Small package express indicator is applicable to express or premium freight shipments.
     * <p>
     * <b>Possible Values:</b>
     * <li>P - Small package express rates are per piece rate.
     * <li>X - Premium bulk rates are weight based.
     * <li>L - Supplemental air waybill. This can be associated with only one product code.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pSmallPackageExpressCode the new value of <code>smallPackageExpressCode</code> property.<br>
     */
    public void setSmallPackageExpressCode(final String pSmallPackageExpressCode) {
        this.smallPackageExpressCode = ContractUtility.convertToUpperCase(pSmallPackageExpressCode);
    }

    /**
     * Sets the list of <code>SpecialHandlingCodeDto</code> details.
     * <p>
     * A maximum of 5 codes are allowed per <code>productCode</code>.
     * <p>
     * 
     * @param pSpecialHandlingCodes the new value of <code>specialHandlingCodes</code> type details.<br>
     */
    public void setSpecialHandlingCodes(final List<ProductSpecialHandlingCodeDto> pSpecialHandlingCodes) {
        this.specialHandlingCodes = pSpecialHandlingCodes;
    }

    /**
     * Sets the <code>timeDefiniteCode</code> property.
     * <p>
     * Controls the Time Definite functionality.When set, time definite business rules are applied to
     * processing.
     * <p>
     * <b>Possible Values:</b>
     * <li>AA - Airport to Airport.
     * <li>DD - Door to Door
     * <li>AD - Airport to Door
     * <li>DA - Door to Airport
     * <li>NO - Time Definite does not apply
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * AA
     * <p>
     * 
     * @param pTimeDefiniteCode the new value of <code>timeDefiniteCode</code> of the product.<br>
     */
    public void setTimeDefiniteCode(final String pTimeDefiniteCode) {
        this.timeDefiniteCode = ContractUtility.convertToUpperCase(pTimeDefiniteCode);
    }

    /**
     * Sets the <code>timeDefiniteTypeCode</code> property.
     * <p>
     * Indicates the type of time definite product.
     * <p>
     * <b>Possible Values:</b>
     * <li>O - Normal
     * <li>S – Same Day
     * <li>N – Next day
     * <li>F – First flight
     * <p>
     * <br>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * N
     * <p>
     * 
     * @param pTimeDefiniteTypeCode the new value of <code>timeDefiniteTypeCode</code> of the product.<br>
     */
    public void setTimeDefiniteTypeCode(final String pTimeDefiniteTypeCode) {
        this.timeDefiniteTypeCode = ContractUtility.convertToUpperCase(pTimeDefiniteTypeCode);
    }

    /**
     * @return the maxPiecesperAirWaybill
     */
    public Integer getMaxPiecesperAirWaybill() {
        return this.maxPiecesperAirWaybill;
    }

    /**
     * @param maxPiecesperAirWaybill the maxPiecesperAirWaybill to set
     */
    public void setMaxPiecesperAirWaybill(final Integer pMaxPiecesperAirWaybill) {
        this.maxPiecesperAirWaybill = pMaxPiecesperAirWaybill;
    }

    /**
     * @return the maxPiecesperRatingLine
     */
    public Integer getMaxPiecesperRatingLine() {
        return this.maxPiecesperRatingLine;
    }

    /**
     * @param maxPiecesperRatingLine the maxPiecesperRatingLine to set
     */
    public void setMaxPiecesperRatingLine(final Integer pMaxPiecesperRatingLine) {
        this.maxPiecesperRatingLine = pMaxPiecesperRatingLine;
    }

    /**
     * @return the maxWeightperPiece
     */
    public BigDecimal getMaxWeightperPiece() {
        return this.maxWeightperPiece;
    }

    /**
     * @param maxWeightperPiece the maxWeightperPiece to set
     */
    public void setMaxWeightperPiece(final BigDecimal pMaxWeightperPiece) {
        this.maxWeightperPiece = pMaxWeightperPiece;
    }

    /**
     * @return the weightUnit
     */
    public WeightUOMType getWeightUnit() {
        return this.weightUnit;
    }

    /**
     * @param weightUnit the weightUnit to set
     */
    public void setWeightUnit(final WeightUOMType pWeightUnit) {
        this.weightUnit = pWeightUnit;
    }

	public String getSpecificAirline() {
		return specificAirline;
	}
	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}

	public boolean isDimsRequired() {
		return dimsRequired;
	}

	public void setDimsRequired(boolean dimsRequired) {
		this.dimsRequired = dimsRequired;
	}
    
    
}
