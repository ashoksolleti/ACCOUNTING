package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PrintAWBDto {
	private AirWaybillNumberDto airWaybillNumberDto;

	private LMSParticipantDto shipperParticipantDto;

	private LMSParticipantDto consigneeparticipantDto;

	private LMSParticipantDto iataAgentparticipantDto;

	private List<LMSStationCodeDto> stationDtos;
	
	private List<RoutingTransferDto> routingTransferDtos;

	private List<RatingLineEntryDto> faceRatingDtos;

	private List<String> handlingText;

	private String issue1;

	private String issue2;

	private static final String ISSUE_AIRLINE = "_ISSUE_AIRLINE";

	private static final String ISSUE_AIRLINE_ADDRESS = "_ISSUE_AIRLINE_ADDRESS";

	private static final String SHIPPER_PARTICIPANT_DESCRIPTION = "_SHIPPER_PARTICIPANT_DESCRIPTION";

	private static final String CONSIGNEE_PARTICIPANT_DECRIPTION = "_CONSIGNEE_PARTICIPANT_DECRIPTION";

	private static final String PRINT_DESTINATION_ACTUAL = "DA";

	private static final String PRINT_DESTINATION = "D";

	private static final String AIRPORT = "AIRPORTTYPE";

	private static final String PRODUCT = "PRODUCTTYPE";

	private ArrayList<String> accountingInformation;

	private String EMPTY = "";

	private BigDecimal chargesatDestion;

	private BigDecimal totalCollectCharge;

	private String otherChargesLine1;

	private String otherChargesLine2;

	private BigDecimal prepaidTax;

	private BigDecimal collectTax;

	private BigDecimal ccChargeInDest;
//total of rate of each entry
	private BigDecimal total;

	private String executionDateTime;

	private BigDecimal totalCollect;

	private static final String BLANKSPACE = " ";

	private static final String SLASH = "/";

	private static final int TOTAL_CHARACTER_COUNT = 72;

	private static final int INVALID_DATE = 1;

	@SuppressWarnings("rawtypes")
	private List<RatingLineEntryDto> ratinglist;

	private String departureAirport;

	private String productDescription;

	private String destinationAirport;

	private String airPortCode;

	private String requestType;

	private String uldType;

	private boolean printTnC;

	private boolean domesticAWB;

	private boolean printMultipleCopies;

	private boolean printSignature;
	
	private String originStation;
	
	private String destStation;
	
	private String xrateCuroTOCurd;
	
	private String curo;
	
	private String curd;
	
	private String expPayCode;
	
	private Integer totalPieces;
	
	private BigDecimal exchangeRate;
	

	/**
	 * @return the shipperParticipantDto
	 */
	public LMSParticipantDto getShipperParticipantDto() {
		return shipperParticipantDto;
	}

	/**
	 * @param shipperParticipantDto
	 *            the shipperParticipantDto to set
	 */
	public void setShipperParticipantDto(LMSParticipantDto shipperParticipantDto) {
		this.shipperParticipantDto = shipperParticipantDto;
	}

	/**
	 * @return the consigneeparticipantDto
	 */
	public LMSParticipantDto getConsigneeparticipantDto() {
		return consigneeparticipantDto;
	}

	/**
	 * @param consigneeparticipantDto
	 *            the consigneeparticipantDto to set
	 */
	public void setConsigneeparticipantDto(
			LMSParticipantDto consigneeparticipantDto) {
		this.consigneeparticipantDto = consigneeparticipantDto;
	}

	/**
	 * @return the iataAgentparticipantDto
	 */
	public LMSParticipantDto getIataAgentparticipantDto() {
		return iataAgentparticipantDto;
	}

	/**
	 * @param iataAgentparticipantDto
	 *            the iataAgentparticipantDto to set
	 */
	public void setIataAgentparticipantDto(
			LMSParticipantDto iataAgentparticipantDto) {
		this.iataAgentparticipantDto = iataAgentparticipantDto;
	}

	/**
	 * @return the stationDtos
	 */
	public List<LMSStationCodeDto> getStationDtos() {
		return stationDtos;
	}

	/**
	 * @param stationDtos
	 *            the stationDtos to set
	 */
	public void setStationDtos(List<LMSStationCodeDto> stationDtos) {
		this.stationDtos = stationDtos;
	}

	/**
	 * @return the faceRatingDtos
	 */
	public List<RatingLineEntryDto> getFaceRatingDtos() {
		return faceRatingDtos;
	}

	/**
	 * @param faceRatingDtos
	 *            the faceRatingDtos to set
	 */
	public void setFaceRatingDtos(List<RatingLineEntryDto> faceRatingDtos) {
		this.faceRatingDtos = faceRatingDtos;
	}

	/**
	 * @return the handlingText
	 */
	public List<String> getHandlingText() {
		return handlingText;
	}

	/**
	 * @param handlingText
	 *            the handlingText to set
	 */
	public void setHandlingText(List<String> handlingText) {
		this.handlingText = handlingText;
	}

	/**
	 * @return the issue1
	 */
	public String getIssue1() {
		return issue1;
	}

	/**
	 * @param issue1
	 *            the issue1 to set
	 */
	public void setIssue1(String issue1) {
		this.issue1 = issue1;
	}

	/**
	 * @return the issue2
	 */
	public String getIssue2() {
		return issue2;
	}

	/**
	 * @param issue2
	 *            the issue2 to set
	 */
	public void setIssue2(String issue2) {
		this.issue2 = issue2;
	}

	/**
	 * @return the accountingInformation
	 */
	public ArrayList<String> getAccountingInformation() {
		return accountingInformation;
	}

	/**
	 * @param accountingInformation
	 *            the accountingInformation to set
	 */
	public void setAccountingInformation(ArrayList<String> accountingInformation) {
		this.accountingInformation = accountingInformation;
	}

	/**
	 * @return the eMPTY
	 */
	public String getEMPTY() {
		return EMPTY;
	}

	/**
	 * @param eMPTY
	 *            the eMPTY to set
	 */
	public void setEMPTY(String eMPTY) {
		EMPTY = eMPTY;
	}

	/**
	 * @return the chargesatDestion
	 */
	public BigDecimal getChargesatDestion() {
		return chargesatDestion;
	}

	/**
	 * @param chargesatDestion
	 *            the chargesatDestion to set
	 */
	public void setChargesatDestion(BigDecimal chargesatDestion) {
		this.chargesatDestion = chargesatDestion;
	}

	/**
	 * @return the totalCollectCharge
	 */
	public BigDecimal getTotalCollectCharge() {
		return totalCollectCharge;
	}

	/**
	 * @param totalCollectCharge
	 *            the totalCollectCharge to set
	 */
	public void setTotalCollectCharge(BigDecimal totalCollectCharge) {
		this.totalCollectCharge = totalCollectCharge;
	}

	/**
	 * @return the otherChargesLine1
	 */
	public String getOtherChargesLine1() {
		return otherChargesLine1;
	}

	/**
	 * @param otherChargesLine1
	 *            the otherChargesLine1 to set
	 */
	public void setOtherChargesLine1(String otherChargesLine1) {
		this.otherChargesLine1 = otherChargesLine1;
	}

	/**
	 * @return the otherChargesLine2
	 */
	public String getOtherChargesLine2() {
		return otherChargesLine2;
	}

	/**
	 * @param otherChargesLine2
	 *            the otherChargesLine2 to set
	 */
	public void setOtherChargesLine2(String otherChargesLine2) {
		this.otherChargesLine2 = otherChargesLine2;
	}

	/**
	 * @return the prepaidTax
	 */
	public BigDecimal getPrepaidTax() {
		return prepaidTax;
	}

	/**
	 * @param prepaidTax
	 *            the prepaidTax to set
	 */
	public void setPrepaidTax(BigDecimal prepaidTax) {
		this.prepaidTax = prepaidTax;
	}

	/**
	 * @return the collectTax
	 */
	public BigDecimal getCollectTax() {
		return collectTax;
	}

	/**
	 * @param collectTax
	 *            the collectTax to set
	 */
	public void setCollectTax(BigDecimal collectTax) {
		this.collectTax = collectTax;
	}

	/**
	 * @return the ccChargeInDest
	 */
	public BigDecimal getCcChargeInDest() {
		return ccChargeInDest;
	}

	/**
	 * @param ccChargeInDest
	 *            the ccChargeInDest to set
	 */
	public void setCcChargeInDest(BigDecimal ccChargeInDest) {
		this.ccChargeInDest = ccChargeInDest;
	}

	/**
	 * @return the total
	 */
	public BigDecimal getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	/**
	 * @return the executionDateTime
	 */
	public String getExecutionDateTime() {
		return executionDateTime;
	}

	/**
	 * @param executionDateTime
	 *            the executionDateTime to set
	 */
	public void setExecutionDateTime(String executionDateTime) {
		this.executionDateTime = executionDateTime;
	}

	/**
	 * @return the totalCollect
	 */
	public BigDecimal getTotalCollect() {
		return totalCollect;
	}

	/**
	 * @param totalCollect
	 *            the totalCollect to set
	 */
	public void setTotalCollect(BigDecimal totalCollect) {
		this.totalCollect = totalCollect;
	}

	/**
	 * @return the ratinglist
	 */
	public List<RatingLineEntryDto> getRatinglist() {
		return ratinglist;
	}

	/**
	 * @param ratinglist
	 *            the ratinglist to set
	 */
	public void setRatinglist(List<RatingLineEntryDto> ratinglist) {
		this.ratinglist = ratinglist;
	}

	/**
	 * @return the departureAirport
	 */
	public String getDepartureAirport() {
		return departureAirport;
	}

	/**
	 * @param departureAirport
	 *            the departureAirport to set
	 */
	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}

	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * @param productDescription
	 *            the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	/**
	 * @return the destinationAirport
	 */
	public String getDestinationAirport() {
		return destinationAirport;
	}

	/**
	 * @param destinationAirport
	 *            the destinationAirport to set
	 */
	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	/**
	 * @return the airPortCode
	 */
	public String getAirPortCode() {
		return airPortCode;
	}

	/**
	 * @param airPortCode
	 *            the airPortCode to set
	 */
	public void setAirPortCode(String airPortCode) {
		this.airPortCode = airPortCode;
	}

	/**
	 * @return the requestType
	 */
	public String getRequestType() {
		return requestType;
	}

	/**
	 * @param requestType
	 *            the requestType to set
	 */
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	/**
	 * @return the uldType
	 */
	public String getUldType() {
		return uldType;
	}

	/**
	 * @param uldType
	 *            the uldType to set
	 */
	public void setUldType(String uldType) {
		this.uldType = uldType;
	}

	/**
	 * @return the printTnC
	 */
	public boolean isPrintTnC() {
		return printTnC;
	}

	/**
	 * @param printTnC
	 *            the printTnC to set
	 */
	public void setPrintTnC(boolean printTnC) {
		this.printTnC = printTnC;
	}

	/**
	 * @return the domesticAWB
	 */
	public boolean isDomesticAWB() {
		return domesticAWB;
	}

	/**
	 * @param domesticAWB
	 *            the domesticAWB to set
	 */
	public void setDomesticAWB(boolean domesticAWB) {
		this.domesticAWB = domesticAWB;
	}

	/**
	 * @return the printMultipleCopies
	 */
	public boolean isPrintMultipleCopies() {
		return printMultipleCopies;
	}

	/**
	 * @param printMultipleCopies
	 *            the printMultipleCopies to set
	 */
	public void setPrintMultipleCopies(boolean printMultipleCopies) {
		this.printMultipleCopies = printMultipleCopies;
	}

	/**
	 * @return the printSignature
	 */
	public boolean isPrintSignature() {
		return printSignature;
	}

	/**
	 * @param printSignature
	 *            the printSignature to set
	 */
	public void setPrintSignature(boolean printSignature) {
		this.printSignature = printSignature;
	}

	/**
	 * @return the airWaybillNumberDto
	 */
	public AirWaybillNumberDto getAirWaybillNumberDto() {
		return airWaybillNumberDto;
	}

	/**
	 * @param airWaybillNumberDto the airWaybillNumberDto to set
	 */
	public void setAirWaybillNumberDto(AirWaybillNumberDto airWaybillNumberDto) {
		this.airWaybillNumberDto = airWaybillNumberDto;
	}

	/**
	 * @return the originStation
	 */
	public String getOriginStation() {
		return originStation;
	}

	/**
	 * @param originStation the originStation to set
	 */
	public void setOriginStation(String originStation) {
		this.originStation = originStation;
	}

	/**
	 * @return the destStation
	 */
	public String getDestStation() {
		return destStation;
	}

	/**
	 * @param destStation the destStation to set
	 */
	public void setDestStation(String destStation) {
		this.destStation = destStation;
	}

	/**
	 * @return the xrateCuroTOCurd
	 */
	public String getXrateCuroTOCurd() {
		return xrateCuroTOCurd;
	}

	/**
	 * @param xrateCuroTOCurd the xrateCuroTOCurd to set
	 */
	public void setXrateCuroTOCurd(String xrateCuroTOCurd) {
		this.xrateCuroTOCurd = xrateCuroTOCurd;
	}

	/**
	 * @return the curo
	 */
	public String getCuro() {
		return curo;
	}

	/**
	 * @param curo the curo to set
	 */
	public void setCuro(String curo) {
		this.curo = curo;
	}

	/**
	 * @return the curd
	 */
	public String getCurd() {
		return curd;
	}

	/**
	 * @param curd the curd to set
	 */
	public void setCurd(String curd) {
		this.curd = curd;
	}

	/**
	 * @return the expPayCode
	 */
	public String getExpPayCode() {
		return expPayCode;
	}

	/**
	 * @param expPayCode the expPayCode to set
	 */
	public void setExpPayCode(String expPayCode) {
		this.expPayCode = expPayCode;
	}

	/**
	 * @return the totalPieces
	 */
	public Integer getTotalPieces() {
		return totalPieces;
	}

	/**
	 * @param totalPieces the totalPieces to set
	 */
	public void setTotalPieces(Integer totalPieces) {
		this.totalPieces = totalPieces;
	}

	/**
	 * @return the exchangeRate
	 */
	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	/**
	 * @param exchangeRate the exchangeRate to set
	 */
	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	/**
	 * @return the routingTransferDtos
	 */
	public List<RoutingTransferDto> getRoutingTransferDtos() {
		return routingTransferDtos;
	}

	/**
	 * @param routingTransferDtos the routingTransferDtos to set
	 */
	public void setRoutingTransferDtos(List<RoutingTransferDto> routingTransferDtos) {
		this.routingTransferDtos = routingTransferDtos;
	}

	
}
