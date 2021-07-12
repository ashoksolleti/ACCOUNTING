package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;
import java.util.List;

/**
 * <code>RoutingAndPricingRouteDto</code> contain details of RoutingAndPricing.
 * <p>
 * This contains all information about RoutingAndPricing.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>routeNumber
 * <li>routingDtos
 * <li>allOriginInd
 * <li>routingProductDtos
 * </ul>
 */
public class RoutingAndPricingRouteDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3059886391166890676L;

    /**
     * Attribute to hold <code>routeNumber</code> property.
     */
    private int routeNumber;

    /**
     * Attribute to hold <code>routingDtos</code> property.
     */
    private List<RoutingDto> routingDtos;

    /**
     * Attribute to hold <code>routingProductDtos</code> property.
     */
    private List<RoutingProductDto> routingProductDtos;

    /**
     * Gets the <code>DateRangeDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>DateRangeDto</code> property.<br>
     */
    public int getRouteNumber() {
        return this.routeNumber;
    }

    /**
     * Holds the list of {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingDto
     * RoutingDto} containing <code>routingDtos</code> details.
     * <p>
     * 
     * @return the current value of <code>routingDtos</code> details.
     */
    public List<RoutingDto> getRoutingDtos() {
        return this.routingDtos;
    }

    /**
     * Holds the list of {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingProductDto
     * RoutingProductDto} containing <code>routingProductDtos</code> details.
     * <p>
     * 
     * @return the current value of <code>routingProductDtos</code> details.
     */
    public List<RoutingProductDto> getRoutingProductDtos() {
        return this.routingProductDtos;
    }

    /**
     * Sets the <code>routeNumber</code> property.
     * <p>
     * 
     * @param pRouteNumber
     *            the current value of the <code>routeNumber</code> property.<br>
     */
    public void setRouteNumber(final int pRouteNumber) {
        this.routeNumber = pRouteNumber;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingDto
     * RoutingDto} containing <code>routingDtos</code> details.
     * <p>
     * 
     * @param pRoutingDtos
     *            holds the new value of <code>routingDtos</code> type
     *            details.<br>
     */
    public void setRoutingDtos(final List<RoutingDto> pRoutingDtos) {
        this.routingDtos = pRoutingDtos;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingProductDto
     * RoutingProductDto} containing <code>routingProductDtos</code> details.
     * <p>
     * 
     * @param pRoutingProductDtos
     *            holds the new value of <code>routingProductDtos</code> type
     *            details.<br>
     */
    public void setRoutingProductDtos(final List<RoutingProductDto> pRoutingProductDtos) {
        this.routingProductDtos = pRoutingProductDtos;
    }

    private BookingDto bookingDto;
    
    public BookingDto getBookingDto() {
        return this.bookingDto;
    }

    public void setBookingDto(final BookingDto pBookingDto) {
        this.bookingDto = pBookingDto;        
    }

}
