package com.unisys.trans.logistics.lms.rating.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class SegmentFormatDto extends PersistenceObjectDto{
    
    /**
     * 
     */
    private static final long serialVersionUID = -3054526160884138178L;
    private String arrivalAirport;
    private Date arrivalDate;
    private int arrivalDayChange;
    private String arrivalTime;
    private String carrierCode;
    private String departureAirport;
    private Date departureDate;
    private int departureDayChange;
    private String departureTime;
    private String equipmentType;
    private String flightNumber;
    private String flightSuffix;
    private int minimumConnectTimeValueUsed;
    private int numberOfStops;
    private BigDecimal segmentMileage;
    private int segmentNo;
    private String trafficRestrictions;
    /**
     * @return the arrivalAirport
     */
    public String getArrivalAirport() {
        return arrivalAirport;
    }
    /**
     * @return the arrivalDate
     */
    public Date getArrivalDate() {
        return arrivalDate;
    }
    /**
     * @return the arrivalDayChange
     */
    public int getArrivalDayChange() {
        return arrivalDayChange;
    }
    /**
     * @return the arrivalTime
     */
    public String getArrivalTime() {
        return arrivalTime;
    }
    /**
     * @return the carrierCode
     */
    public String getCarrierCode() {
        return carrierCode;
    }
    /**
     * @return the departureAirport
     */
    public String getDepartureAirport() {
        return departureAirport;
    }
    /**
     * @return the departureDate
     */
    public Date getDepartureDate() {
        return departureDate;
    }
    /**
     * @return the departureDayChange
     */
    public int getDepartureDayChange() {
        return departureDayChange;
    }
    /**
     * @return the departureTime
     */
    public String getDepartureTime() {
        return departureTime;
    }
    /**
     * @return the equipmentType
     */
    public String getEquipmentType() {
        return equipmentType;
    }
    /**
     * @return the flightNumber
     */
    public String getFlightNumber() {
        return flightNumber;
    }
    /**
     * @return the flightSuffix
     */
    public String getFlightSuffix() {
        return flightSuffix;
    }
    /**
     * @return the minimumConnectTimeValueUsed
     */
    public int getMinimumConnectTimeValueUsed() {
        return minimumConnectTimeValueUsed;
    }
    /**
     * @return the numberOfStops
     */
    public int getNumberOfStops() {
        return numberOfStops;
    }
    /**
     * @return the segmentMileage
     */
    public BigDecimal getSegmentMileage() {
        return segmentMileage;
    }
    /**
     * @return the segmentNo
     */
    public int getSegmentNo() {
        return segmentNo;
    }
    /**
     * @return the trafficRestrictions
     */
    public String getTrafficRestrictions() {
        return trafficRestrictions;
    }
    /**
     * @param final arrivalAirport the arrivalAirport to set
     */
    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }
    /**
     * @param final arrivalDate the arrivalDate to set
     */
    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
    /**
     * @param final arrivalDayChange the arrivalDayChange to set
     */
    public void setArrivalDayChange(int arrivalDayChange) {
        this.arrivalDayChange = arrivalDayChange;
    }
    /**
     * @param final arrivalTime the arrivalTime to set
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    /**
     * @param final carrierCode the carrierCode to set
     */
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }
    /**
     * @param final departureAirport the departureAirport to set
     */
    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }
    /**
     * @param final departureDate the departureDate to set
     */
    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }
    /**
     * @param final departureDayChange the departureDayChange to set
     */
    public void setDepartureDayChange(int departureDayChange) {
        this.departureDayChange = departureDayChange;
    }
    /**
     * @param final departureTime the departureTime to set
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    /**
     * @param final equipmentType the equipmentType to set
     */
    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }
    /**
     * @param final flightNumber the flightNumber to set
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    /**
     * @param final flightSuffix the flightSuffix to set
     */
    public void setFlightSuffix(String flightSuffix) {
        this.flightSuffix = flightSuffix;
    }
    /**
     * @param final minimumConnectTimeValueUsed the minimumConnectTimeValueUsed to set
     */
    public void setMinimumConnectTimeValueUsed(int minimumConnectTimeValueUsed) {
        this.minimumConnectTimeValueUsed = minimumConnectTimeValueUsed;
    }
    /**
     * @param final numberOfStops the numberOfStops to set
     */
    public void setNumberOfStops(int numberOfStops) {
        this.numberOfStops = numberOfStops;
    }
    /**
     * @param final segmentMileage the segmentMileage to set
     */
    public void setSegmentMileage(BigDecimal segmentMileage) {
        this.segmentMileage = segmentMileage;
    }
    /**
     * @param final segmentNo the segmentNo to set
     */
    public void setSegmentNo(int segmentNo) {
        this.segmentNo = segmentNo;
    }
    /**
     * @param final trafficRestrictions the trafficRestrictions to set
     */
    public void setTrafficRestrictions(String trafficRestrictions) {
        this.trafficRestrictions = trafficRestrictions;
    }
    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }

        
}
