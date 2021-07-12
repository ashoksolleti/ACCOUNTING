package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.preferences.SimplifiedRestrictionTypeDto;

public class SimplifiedRestrictionFindRequest extends AbstractRequest{
	 /**
	 * 
	 */
	private static final long serialVersionUID = -4681306982089929283L;
	/* Unique serial version UID.
	 */
	/**
	 * 
	 */
	
	private List<String> stations = new ArrayList<String>();

	private List<String> countries = new ArrayList<String>();

	private List<String> toStations = new ArrayList<String>();

	private List<String> fromStations = new ArrayList<String>();

	private List<String> toContries = new ArrayList<String>();

	private List<String> fromCountries = new ArrayList<String>();

	private List<String> carriers = new ArrayList<String>();

	private List<String> flights = new ArrayList<String>();

	private List<String> aircraftType = new ArrayList<String>();

	private List<String> aircraftRegNum = new ArrayList<String>();

	private List<String> productCodes = new ArrayList<String>();

	private List<String> splCodes = new ArrayList<String>();

	private List<String> alertCodes = new ArrayList<String>();

	private List<String> commodityCodes = new ArrayList<String>();
	
	private boolean sytemWideIndicator;
	
	private String restrictionTypeCode;
	
	private String enforcementCode;
	
	private boolean weightFliter;
	
	private boolean showSpecificRestriction;
	
	private int totalNumberOfRecords;
	
	private SimplifiedRestrictionTypeDto simplifiedRestrictionTypeDto;

	private boolean requestFromStationInfo;

	public boolean isRequestFromStationInfo() {
		return requestFromStationInfo;
	}

	public void setRequestFromStationInfo(boolean requestFromStationInfo) {
		this.requestFromStationInfo = requestFromStationInfo;
	}

	public int getTotalNumberOfRecords() {
		return totalNumberOfRecords;
	}

	public void setTotalNumberOfRecords(int totalNumberOfRecords) {
		this.totalNumberOfRecords = totalNumberOfRecords;
	}

/*	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getNumberOfRecordsPerPage() {
		return NumberOfRecordsPerPage;
	}

	public void setNumberOfRecordsPerPage(int numberOfRecordsPerPage) {
		NumberOfRecordsPerPage = numberOfRecordsPerPage;
	}*/

	public boolean isWeightFliter() {
		return weightFliter;
	}

	public void setWeightFliter(boolean weightFliter) {
		this.weightFliter = weightFliter;
	}

	public boolean isDimensionFilter() {
		return DimensionFilter;
	}

	public void setDimensionFilter(boolean dimensionFilter) {
		DimensionFilter = dimensionFilter;
	}

	public boolean isParticipantFilter() {
		return participantFilter;
	}

	public void setParticipantFilter(boolean participantFilter) {
		this.participantFilter = participantFilter;
	}

	private boolean DimensionFilter;
	
	private boolean participantFilter;
	
	public List<String> getStations() {
		return stations;
	}

	public void setStations(List<String> stations) {
		this.stations = stations;
	}

	public List<String> getCountries() {
		return countries;
	}

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}

	public List<String> getToStations() {
		return toStations;
	}

	public void setToStations(List<String> toStations) {
		this.toStations = toStations;
	}

	public List<String> getFromStations() {
		return fromStations;
	}

	public void setFromStations(List<String> fromStations) {
		this.fromStations = fromStations;
	}

	public List<String> getToContries() {
		return toContries;
	}

	public void setToContries(List<String> toContries) {
		this.toContries = toContries;
	}

	public List<String> getFromCountries() {
		return fromCountries;
	}

	public void setFromCountries(List<String> fromCountries) {
		this.fromCountries = fromCountries;
	}

	public List<String> getCarriers() {
		return carriers;
	}

	public void setCarriers(List<String> carriers) {
		this.carriers = carriers;
	}

	public List<String> getFlights() {
		return flights;
	}

	public void setFlights(List<String> flights) {
		this.flights = flights;
	}

	public List<String> getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(List<String> aircraftType) {
		this.aircraftType = aircraftType;
	}

	public List<String> getAircraftRegNum() {
		return aircraftRegNum;
	}

	public void setAircraftRegNum(List<String> aircraftRegNum) {
		this.aircraftRegNum = aircraftRegNum;
	}

	public List<String> getProductCodes() {
		return productCodes;
	}

	public void setProductCodes(List<String> productCodes) {
		this.productCodes = productCodes;
	}

	public List<String> getSplCodes() {
		return splCodes;
	}

	public void setSplCodes(List<String> splCodes) {
		this.splCodes = splCodes;
	}

	public List<String> getAlertCodes() { return alertCodes; }

	public void setAlertCodes(List<String> alertCodes) { this.alertCodes = alertCodes; }

	public List<String> getCommodityCodes() {
		return commodityCodes;
	}

	public void setCommodityCodes(List<String> commodityCodes) {
		this.commodityCodes = commodityCodes;
	}

	public String getRestrictionTypeCode() {
		return restrictionTypeCode;
	}

	public void setRestrictionTypeCode(String restrictionTypeCode) {
		this.restrictionTypeCode = restrictionTypeCode;
	}

	public String getEnforcementCode() {
		return enforcementCode;
	}

	public void setEnforcementCode(String enforcementCode) {
		this.enforcementCode = enforcementCode;
	}

	public String getAlert() {
		return alert;
	}

	public void setAlert(String alert) {
		this.alert = alert;
	}

	public String getShipmentsImpacted() {
		return shipmentsImpacted;
	}

	public void setShipmentsImpacted(String shipmentsImpacted) {
		this.shipmentsImpacted = shipmentsImpacted;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public boolean isSytemWideIndicator() {
		return sytemWideIndicator;
	}

	public void setSytemWideIndicator(boolean sytemWideIndicator) {
		this.sytemWideIndicator = sytemWideIndicator;
	}

	

	public SimplifiedRestrictionTypeDto getSimplifiedRestrictionTypeDto() {
		return simplifiedRestrictionTypeDto;
	}

	public void setSimplifiedRestrictionTypeDto(SimplifiedRestrictionTypeDto simplifiedRestrictionTypeDto) {
		this.simplifiedRestrictionTypeDto = simplifiedRestrictionTypeDto;
	}

	private String alert;
	
	private String shipmentsImpacted;
	
	private String direction;
	
	private Date fromDate;
	
	private Date toDate;




	/**
	 * @return the showSpecificRestriction
	 */
	public boolean isShowSpecificRestriction() {
		return showSpecificRestriction;
	}

	/**
	 * @param showSpecificRestriction the showSpecificRestriction to set
	 */
	public void setShowSpecificRestriction(boolean showSpecificRestriction) {
		this.showSpecificRestriction = showSpecificRestriction;
	}
	
}
