package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;


public class RoutingRequestDto extends PersistenceObjectDto{

    /**
     * 
     */
    private static final long serialVersionUID = -1727382011150602809L;
    private String airlineDesignator;
    private String arrivalLocation;
    private String cargoType;
    private String connectionAirport;
    private String connectionPtIEInd;
    private String departureLocation;
    private String flightRestrictions;
    private Boolean includeExcludeAirline;
    private String listOfAirlineDesignators;
    private String minimumConnectionTime;
    private String onlineInterlineFlights;
    private String product;
    private int productCodeConnectionOffset;
    private String routePriceIndicator;
    private String searchWindow;
    private String serviceLevel;
    private String serviceType;
    private String source;
    private String startDate;
    private String startTime;
    private String typeOfRoutingRequest1;
    private int typeOfRoutingRequest2;
    /**
     * @return the airlineDesignator
     */
    public String getAirlineDesignator() {
        return airlineDesignator;
    }
    /**
     * @param final airlineDesignator the airlineDesignator to set
     */
    public void setAirlineDesignator(String airlineDesignator) {
        this.airlineDesignator = airlineDesignator;
    }
    /**
     * @return the arrivalLocation
     */
    public String getArrivalLocation() {
        return arrivalLocation;
    }
    /**
     * @param final arrivalLocation the arrivalLocation to set
     */
    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }
    /**
     * @return the cargoType
     */
    public String getCargoType() {
        return cargoType;
    }
    /**
     * @param final cargoType the cargoType to set
     */
    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }
    /**
     * @return the connectionAirport
     */
    public String getConnectionAirport() {
        return connectionAirport;
    }
    /**
     * @param final connectionAirport the connectionAirport to set
     */
    public void setConnectionAirport(String connectionAirport) {
        this.connectionAirport = connectionAirport;
    }

    /**
     * @return the departureLocation
     */
    public String getDepartureLocation() {
        return departureLocation;
    }
    /**
     * @param final departureLocation the departureLocation to set
     */
    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }
    /**
     * @return the flightRestrictions
     */
    public String getFlightRestrictions() {
        return flightRestrictions;
    }
    /**
     * @param final flightRestrictions the flightRestrictions to set
     */
    public void setFlightRestrictions(String flightRestrictions) {
        this.flightRestrictions = flightRestrictions;
    }
    /**
     * @return the includeExcludeAirline
     */
    public Boolean getIncludeExcludeAirline() {
        return includeExcludeAirline;
    }
    /**
     * @param final includeExcludeAirline the includeExcludeAirline to set
     */
    public void setIncludeExcludeAirline(Boolean includeExcludeAirline) {
        this.includeExcludeAirline = includeExcludeAirline;
    }
    /**
     * @return the listOfAirlineDesignators
     */
    public String getListOfAirlineDesignators() {
        return listOfAirlineDesignators;
    }
    /**
     * @param final listOfAirlineDesignators the listOfAirlineDesignators to set
     */
    public void setListOfAirlineDesignators(String listOfAirlineDesignators) {
        this.listOfAirlineDesignators = listOfAirlineDesignators;
    }
    /**
     * @return the minimumConnectionTime
     */
    public String getMinimumConnectionTime() {
        return minimumConnectionTime;
    }
    /**
     * @param final minimumConnectionTime the minimumConnectionTime to set
     */
    public void setMinimumConnectionTime(String minimumConnectionTime) {
        this.minimumConnectionTime = minimumConnectionTime;
    }
    /**
     * @return the onlineInterlineFlights
     */
    public String getOnlineInterlineFlights() {
        return onlineInterlineFlights;
    }
    /**
     * @param final onlineInterlineFlights the onlineInterlineFlights to set
     */
    public void setOnlineInterlineFlights(String onlineInterlineFlights) {
        this.onlineInterlineFlights = onlineInterlineFlights;
    }
    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }
    /**
     * @param final product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }
    /**
     * @return the productCodeConnectionOffset
     */
    public int getProductCodeConnectionOffset() {
        return productCodeConnectionOffset;
    }
    /**
     * @param final productCodeConnectionOffset the productCodeConnectionOffset to set
     */
    public void setProductCodeConnectionOffset(int productCodeConnectionOffset) {
        this.productCodeConnectionOffset = productCodeConnectionOffset;
    }
    /**
     * @return the routePriceIndicator
     */
    public String getRoutePriceIndicator() {
        return routePriceIndicator;
    }
    /**
     * @param final routePriceIndicator the routePriceIndicator to set
     */
    public void setRoutePriceIndicator(String routePriceIndicator) {
        this.routePriceIndicator = routePriceIndicator;
    }
    /**
     * @return the searchWindow
     */
    public String getSearchWindow() {
        return searchWindow;
    }
    /**
     * @param final searchWindow the searchWindow to set
     */
    public void setSearchWindow(String searchWindow) {
        this.searchWindow = searchWindow;
    }
    /**
     * @return the serviceLevel
     */
    public String getServiceLevel() {
        return serviceLevel;
    }
    /**
     * @param final serviceLevel the serviceLevel to set
     */
    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }
    /**
     * @return the serviceType
     */
    public String getServiceType() {
        return serviceType;
    }
    /**
     * @param final serviceType the serviceType to set
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    /**
     * @return the source
     */
    public String getSource() {
        return source;
    }
    /**
     * @param final source the source to set
     */
    public void setSource(String source) {
        this.source = source;
    }
    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }
    /**
     * @param final startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    /**
     * @return the startTime
     */
    public String getStartTime() {
        return startTime;
    }
    /**
     * @param final startTime the startTime to set
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    /**
     * @return the typeOfRoutingRequest1
     */
    public String getTypeOfRoutingRequest1() {
        return typeOfRoutingRequest1;
    }
    /**
     * @param final typeOfRoutingRequest1 the typeOfRoutingRequest1 to set
     */
    public void setTypeOfRoutingRequest1(String typeOfRoutingRequest1) {
        this.typeOfRoutingRequest1 = typeOfRoutingRequest1;
    }
    /**
     * @return the typeOfRoutingRequest2
     */
    public int getTypeOfRoutingRequest2() {
        return typeOfRoutingRequest2;
    }
    /**
     * @param final typeOfRoutingRequest2 the typeOfRoutingRequest2 to set
     */
    public void setTypeOfRoutingRequest2(int typeOfRoutingRequest2) {
        this.typeOfRoutingRequest2 = typeOfRoutingRequest2;
    }
    public String getConnectionPtIEInd() {
        return connectionPtIEInd;
    }
    public void setConnectionPtIEInd(String connectionPtIEInd) {
        this.connectionPtIEInd = connectionPtIEInd;
    }
    @Override
    public Long getOId() {
      
        return null;
    }
  
    
}
