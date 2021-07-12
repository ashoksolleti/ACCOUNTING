package com.unisys.trans.logistics.lms.rules.request;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.awb.constants.AuditStatusType;
import com.unisys.trans.logistics.lms.awb.constants.ChecklistCompletedIndicatorType;
import com.unisys.trans.logistics.lms.awb.constants.LoadabilityFeatureEnabled;
import com.unisys.trans.logistics.lms.awb.constants.PayCodeFeatureEnabled;
import com.unisys.trans.logistics.lms.awb.dto.AWBSpecialHandlingDto;
import com.unisys.trans.logistics.lms.awb.dto.RouteDto;
import com.unisys.trans.logistics.lms.framework.constants.AWBRulePaycodeType;
import com.unisys.trans.logistics.lms.framework.constants.ChannelType;
import com.unisys.trans.logistics.lms.framework.constants.GoodsLocationType;

public class AWBInfo implements Serializable {

	@Override
	public String toString() {
		return "AWBInfo [id=" + id + ", product=" + product + ", spl=" + spl
				+ ", hostCarrier=" + hostCarrier + ", origin=" + origin
				+ ", destination=" + destination + ", spls=" + spls
				+ ", creationDate=" + creationDate + ", creationTime="
				+ creationTime + ", splCodes=" + splCodes + ", routes="
				+ routes + ", awbSpecialHandlingDtos=" + awbSpecialHandlingDtos
				+ ", transactionSource=" + transactionSource + ", payCodeType="
				+ payCodeType + ", payCodeCheckFeatureIndicator="
				+ payCodeCheckFeatureIndicator + ", originCountryCode="
				+ originCountryCode + ", destinationCountryCode="
				+ destinationCountryCode + ", loadabilityFeatureIndicator="
				+ loadabilityFeatureIndicator + ", SubfunctionCode="
				+ SubfunctionCode + ", functionCode=" + functionCode
				+ ", functionName=" + functionName + ", action=" + actionName 
				+ ", channelIdentifier=" + channelIdentifier
				+ ", checklistCompletedIndicator="
				+ checklistCompletedIndicator + ", exportPaycode="
				+ exportPaycode + ", originAggregateCodes="
				+ originAggregateCodes + ", destinationAggregateCodes="
				+ destinationAggregateCodes + ", channelType=" + channelType
				+ ", awbCreationDate=" + awbCreationDate + ", paper=" + paper
				+ ", description=" + description + ", priority=" + priority
				+ ", house=" + house + ", tax=" + tax + ", awbIndicatorIntl="
				+ awbIndicatorIntl + ", pieces=" + pieces + ", weight="
				+ weight + ", weightUnit=" + weightUnit + ", generalAwb="
				+ generalAwb + ", dbkey=" + dbkey + ", revision=" + revision
				+ ", hold=" + hold + ", station=" + station + ", reason="
				+ reason + ", splUldRemark=" + splUldRemark + ", paycode="
				+ paycode + ", executionDate=" + executionDate + ", decl="
				+ decl + ", custom=" + custom + ", valueAmount=" + valueAmount
				+ ", code=" + code + ", flight=" + flight + ", flightDate="
				+ flightDate + ", text=" + text + ", european=" + european
				+ ", inbound=" + inbound + ", customerInfostation="
				+ customerInfostation + ", agent=" + agent + ", shed=" + shed
				+ ", eurinum=" + eurinum + ", eorictr=" + eorictr + ", trader="
				+ trader + ", cuit=" + cuit + ", arks=" + arks
				+ ", partRemarks=" + partRemarks + ", domesticAwb="
				+ domesticAwb + ", volume=" + volume + ", volumeUnit="
				+ volumeUnit + ", dimensionalIndicator=" + dimensionalIndicator
				+ ", valuationIndicator=" + valuationIndicator
				+ ", chargesCodAmount=" + chargesCodAmount
				+ ", chargesCodCurrency=" + chargesCodCurrency
				+ ", chargeCode=" + chargeCode + ", chargeScode=" + chargeScode
				+ ", chargePcode=" + chargePcode + ", chargeAmount="
				+ chargeAmount + ", cind=" + cind + ", crossrefCode="
				+ crossrefCode + ", crossrefValue=" + crossrefValue
				+ ", chargeDescription=" + chargeDescription + ", chargeSvc="
				+ chargeSvc + ", chargesQuantity=" + chargesQuantity
				+ ", chargeTime=" + chargeTime + ", chargeTInd=" + chargeTInd
				+ ", chargeGInd=" + chargeGInd + ", currency=" + currency
				+ ", valuationAmount=" + valuationAmount + "]";
	}

	private static final long serialVersionUID = 2802601153206283454L;

	/** Attribute to hold current Iteration count **/
	private Long id;

	/** Attribute to hold product code **/
	private String product;

	/** Attribute to hold special handling code **/
	private String spl;

	/** Attribute to hold hostCarrier code **/
	private String hostCarrier;

	/** Attribute to hold the origin value **/
	private String origin;

	/** Attribute to hold the destination value **/
	private String destination;

	/** Attribute to hold SPLs added on flight **/
	private List<String> spls;

	/** Attribute to hold creation Date **/
	private Date creationDate;

	/** Attribute to hold time **/
	private Long creationTime;

	/** Attribute to list of SPLs **/
	private List<String> splCodes;

	/** Attribute to list of Route **/
	private List<RouteDto> routes;

	private List<AWBSpecialHandlingDto> awbSpecialHandlingDtos;

	private String transactionSource;
	private AWBRulePaycodeType payCodeType;
	private PayCodeFeatureEnabled payCodeCheckFeatureIndicator;
	private String originCountryCode;
	private String destinationCountryCode;
	private LoadabilityFeatureEnabled loadabilityFeatureIndicator;
	private String SubfunctionCode;
	private String functionCode;
	private ChecklistCompletedIndicatorType checklistCompletedIndicator;
	private String exportPaycode;
	
	private String exportDeclarationNumber;

	private List<String> originAggregateCodes;

	private List<String> destinationAggregateCodes;

	private ChannelType channelType;

	private int awbCreationDate;
	private String paper;
	private String description;

	private String priority;

	private String house;
	private String tax;
	private String awbIndicatorIntl;
	private int pieces;
	private double weight;

	private String weightUnit;
	private String generalAwb;
	private long dbkey;

	private String revision;
	private String hold;

    /** Attribute to hold statusCode code **/
	private String statusCode;
	private String station;
	private String reason;

	private String splUldRemark;
	private String paycode;
	private int executionDate;
	private String decl;
	private String custom;
	private BigDecimal valueAmount;

	private String code;
	private String flight;
	private int flightDate;
	private String text;
	private String european;
	private String inbound;
	private String customerInfostation;
	private String agent;
	private String shed;
	private String eurinum;
	private String eorictr;
	private String trader;
	private String cuit;
	private String arks;
	private String partRemarks;
	private String domesticAwb;

	private BigDecimal volume;
	private String volumeUnit;
	//DL622 Changes Starts	
	private String channelIdentifier;
	private String functionName;
	private String actionName;
	
	private String transferFromCarrier;
	
	private String transferToCarrier;
	
	private List<String> interlineCarriers;
	
	private String acnNumber;
    
    /**
    * Attribute to hold <code>exportAuditStatus</code> property.
    */
    private AuditStatusType exportAuditStatus;

    /**
    * Attribute to hold <code>importAuditStatus</code> property.
    */
    private AuditStatusType importAuditStatus;

    /**
    * Attribute to hold <code>insuranceValue</code> property.
    */
    private String insuranceValue;

    /**
    * Attribute to hold <code>insuranceCode</code> property.
    */
    private String insuranceCode;
	
	 /**
     * Attribute to hold the <code>goodsLocationType</code> property.
     */
    private GoodsLocationType goodsLocationType;
    
    /**
     * Attribute to hold the <code>pieceIDActionCount</code> property.
     */
	private Integer pieceIDActionCount;
	
	
	public String getChannelIdentifier() {
		return channelIdentifier;
	}

	public void setChannelIdentifier(String channelIdentifier) {
		this.channelIdentifier = channelIdentifier;
	}
	
	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	//DL622 Changes ends

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	private String dimensionalIndicator;

	private String valuationIndicator;
	private BigDecimal chargesCodAmount;

	private String chargesCodCurrency;
	private String chargeCode;
	private String chargeScode;
	private String chargePcode;
	private BigDecimal chargeAmount;
	private String cind;

	private String crossrefCode;

	private String crossrefValue;

	public BigDecimal getChargesCodAmount() {
		return chargesCodAmount;
	}

	public void setChargesCodAmount(BigDecimal chargesCodAmount) {
		this.chargesCodAmount = chargesCodAmount;
	}

	private String chargeDescription;

	private String chargeSvc;
	private BigDecimal chargesQuantity;

	public BigDecimal getChargesQuantity() {
		return chargesQuantity;
	}

	public void setChargesQuantity(BigDecimal chargesQuantity) {
		this.chargesQuantity = chargesQuantity;
	}

	private String chargeTime;
	private String chargeTInd;
	private String chargeGInd;
	private String currency;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 
	 * @return
	 */
	public String getExportPaycode() {
		return exportPaycode;
	}

	/**
	 * 
	 * @param exportPaycodeType
	 */
	public void setExportPaycode(String exportPaycode) {
		this.exportPaycode = exportPaycode;
	}

	/**
     * @return the exportDeclarationNumber
     */
    public String getExportDeclarationNumber() {
        return exportDeclarationNumber;
    }

    /**
     * @param pExportDeclarationNumber the exportDeclarationNumber to set
     */
    public void setExportDeclarationNumber(final String pExportDeclarationNumber) {
        this.exportDeclarationNumber = pExportDeclarationNumber;
    }

    /**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the product
	 */
	public String getProduct() {
		return product;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * @return the spl
	 */
	public String getSpl() {
		return spl;
	}

	/**
	 * @param spl
	 *            the spl to set
	 */
	public void setSpl(String spl) {
		this.spl = spl;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin
	 *            the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination
	 *            the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the spls
	 */
	public List<String> getSpls() {
		return spls;
	}

	/**
	 * @param spls
	 *            the spls to set
	 */
	public void setSpls(List<String> spls) {
		this.spls = spls;
	}

	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate
	 *            the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return the hostCarrier
	 */
	public String getHostCarrier() {
		return hostCarrier;
	}

	/**
	 * @param hostCarrier
	 *            the hostCarrier to set
	 */
	public void setHostCarrier(String hostCarrier) {
		this.hostCarrier = hostCarrier;
	}

	/**
	 * @return the routes
	 */
	public List<RouteDto> getRoutes() {
		if (routes == null) {
			new ArrayList<RouteDto>();
		}
		return routes;
	}

	/**
	 * @param routes
	 *            the routes to set
	 */
	public void setRoutes(List<RouteDto> routes) {
		this.routes = routes;
	}

	/**
	 * @return the creationTime
	 */
	public Long getCreationTime() {
		return creationTime;
	}

	/**
	 * @param creationTime
	 *            the creationTime to set
	 */
	public void setCreationTime(Long creationTime) {
		this.creationTime = creationTime;
	}

	/**
	 * @return the splCodes
	 */
	public List<String> getSplCodes() {
		return splCodes;
	}

	/**
	 * @param splCodes
	 *            the splCodes to set
	 */
	public void setSplCodes(List<String> splCodes) {
		this.splCodes = splCodes;
	}

	/**
	 * @return the awbSpecialHandlingDtos
	 */
	public List<AWBSpecialHandlingDto> getAwbSpecialHandlingDtos() {
		return awbSpecialHandlingDtos;
	}

	/**
	 * @param awbSpecialHandlingDtos
	 *            the awbSpecialHandlingDtos to set
	 */
	public void setAwbSpecialHandlingDtos(
			List<AWBSpecialHandlingDto> awbSpecialHandlingDtos) {
		this.awbSpecialHandlingDtos = awbSpecialHandlingDtos;
	}

	public String getTransactionSource() {
		return transactionSource;
	}

	public void setTransactionSource(String transactionSource) {
		this.transactionSource = transactionSource;
	}

	public PayCodeFeatureEnabled getPayCodeCheckFeatureIndicator() {
		return this.payCodeCheckFeatureIndicator;
	}

	public void setPayCodeCheckFeatureIndicator(
			final PayCodeFeatureEnabled pPayCodeCheckFeatureIndicator) {
		this.payCodeCheckFeatureIndicator = pPayCodeCheckFeatureIndicator;
	}

	public String getOriginCountryCode() {
		return originCountryCode;
	}

	public void setOriginCountryCode(String originCountryCode) {
		this.originCountryCode = originCountryCode;
	}

	public String getDestinationCountryCode() {
		return destinationCountryCode;
	}

	public void setDestinationCountryCode(String destinationCountryCode) {
		this.destinationCountryCode = destinationCountryCode;
	}

	public AWBRulePaycodeType getPayCodeType() {
		return payCodeType;
	}

	public void setPayCodeType(AWBRulePaycodeType payCodeType) {
		this.payCodeType = payCodeType;
	}

	public LoadabilityFeatureEnabled getLoadabilityFeatureIndicator() {
		return loadabilityFeatureIndicator;
	}

	public void setLoadabilityFeatureIndicator(
			LoadabilityFeatureEnabled loadabilityFeatureIndicator) {
		this.loadabilityFeatureIndicator = loadabilityFeatureIndicator;
	}

	public String getSubfunctionCode() {
		return SubfunctionCode;
	}

	public void setSubfunctionCode(String subfunctionCode) {
		SubfunctionCode = subfunctionCode;
	}

	public String getFunctionCode() {
		return functionCode;
	}

	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}

	public ChecklistCompletedIndicatorType getChecklistCompletedIndicator() {
		return this.checklistCompletedIndicator;
	}

	public void setChecklistCompletedIndicator(
			final ChecklistCompletedIndicatorType pChecklistCompletedIndicator) {
		this.checklistCompletedIndicator = pChecklistCompletedIndicator;
	}

	public List<String> getOriginAggregateCodes() {
		return originAggregateCodes;
	}

	public void setOriginAggregateCodes(List<String> originAggregateCodes) {
		this.originAggregateCodes = originAggregateCodes;
	}

	public List<String> getDestinationAggregateCodes() {
		return destinationAggregateCodes;
	}

	public void setDestinationAggregateCodes(
			List<String> destinationAggregateCodes) {
		this.destinationAggregateCodes = destinationAggregateCodes;
	}

	public ChannelType getChannelType() {
		return channelType;
	}

	public void setChannelType(ChannelType channelType) {
		this.channelType = channelType;
	}

	public int getAwbCreationDate() {
		return awbCreationDate;
	}

	public void setAwbCreationDate(int awbCreationDate) {
		this.awbCreationDate = awbCreationDate;
	}

	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getPaper() {
		return paper;
	}

	public void setPaper(String paper) {
		this.paper = paper;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public String getHold() {
		return hold;
	}

	public void setHold(String hold) {
		this.hold = hold;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	/**
     * @return the statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * @param pStatusCode the statusCode to set
     */
    public void setStatusCode(final String pStatusCode) {
        this.statusCode = pStatusCode;
    }

    public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getPaycode() {
		return paycode;
	}

	public void setPaycode(String paycode) {
		this.paycode = paycode;
	}

	public long getDbkey() {
		return dbkey;
	}

	public void setDbkey(long dbkey) {
		this.dbkey = dbkey;
	}

	public int getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(int executionDate) {
		this.executionDate = executionDate;
	}

	public String getDecl() {
		return decl;
	}

	public void setDecl(String decl) {
		this.decl = decl;
	}

	public String getCustom() {
		return custom;
	}

	public void setCustom(String custom) {
		this.custom = custom;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFlight() {
		return flight;
	}

	public void setFlight(String flight) {
		this.flight = flight;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getEuropean() {
		return european;
	}

	public void setEuropean(String european) {
		this.european = european;
	}

	public String getInbound() {
		return inbound;
	}

	public void setInbound(String inbound) {
		this.inbound = inbound;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public String getShed() {
		return shed;
	}

	public void setShed(String shed) {
		this.shed = shed;
	}

	public String getEurinum() {
		return eurinum;
	}

	public void setEurinum(String eurinum) {
		this.eurinum = eurinum;
	}

	public String getEorictr() {
		return eorictr;
	}

	public void setEorictr(String eorictr) {
		this.eorictr = eorictr;
	}

	public String getTrader() {
		return trader;
	}

	public void setTrader(String trader) {
		this.trader = trader;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getArks() {
		return arks;
	}

	public void setArks(String arks) {
		this.arks = arks;
	}

	public int getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(int flightDate) {
		this.flightDate = flightDate;
	}

	public String getDomesticAwb() {
		return domesticAwb;
	}

	public void setDomesticAwb(String domesticAwb) {
		this.domesticAwb = domesticAwb;
	}

	public String getChargeCode() {
		return chargeCode;
	}

	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}

	public String getChargeScode() {
		return chargeScode;
	}

	public void setChargeScode(String chargeScode) {
		this.chargeScode = chargeScode;
	}

	public String getChargePcode() {
		return chargePcode;
	}

	public void setChargePcode(String chargePcode) {
		this.chargePcode = chargePcode;
	}

	public String getChargeTime() {
		return chargeTime;
	}

	public void setChargeTime(String chargeTime) {
		this.chargeTime = chargeTime;
	}

	public String getChargeTInd() {
		return chargeTInd;
	}

	public void setChargeTInd(String chargeTInd) {
		this.chargeTInd = chargeTInd;
	}

	public String getChargeGInd() {
		return chargeGInd;
	}

	public void setChargeGInd(String chargeGInd) {
		this.chargeGInd = chargeGInd;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getCind() {
		return cind;
	}

	public void setCind(String cind) {
		this.cind = cind;
	}

	public String getDimensionalIndicator() {
		return dimensionalIndicator;
	}

	public void setDimensionalIndicator(String dimensionalIndicator) {
		this.dimensionalIndicator = dimensionalIndicator;
	}

	private BigDecimal valuationAmount;

	public BigDecimal getValueAmount() {
		return valueAmount;
	}

	public void setValueAmount(BigDecimal valueAmount) {
		this.valueAmount = valueAmount;
	}

	public BigDecimal getValuationAmount() {
		return valuationAmount;
	}

	public void setValuationAmount(BigDecimal valuationAmount) {
		this.valuationAmount = valuationAmount;
	}

	public BigDecimal getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(BigDecimal chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public String getAwbIndicatorIntl() {
		return awbIndicatorIntl;
	}

	public void setAwbIndicatorIntl(String awbIndicatorIntl) {
		this.awbIndicatorIntl = awbIndicatorIntl;
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	public String getWeightUnit() {
		return weightUnit;
	}

	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	public String getGeneralAwb() {
		return generalAwb;
	}

	public void setGeneralAwb(String generalAwb) {
		this.generalAwb = generalAwb;
	}

	public String getSplUldRemark() {
		return splUldRemark;
	}

	public void setSplUldRemark(String splUldRemark) {
		this.splUldRemark = splUldRemark;
	}

	public String getCustomerInfostation() {
		return customerInfostation;
	}

	public void setCustomerInfostation(String customerInfostation) {
		this.customerInfostation = customerInfostation;
	}

	public String getPartRemarks() {
		return partRemarks;
	}

	public void setPartRemarks(String partRemarks) {
		this.partRemarks = partRemarks;
	}

	public String getVolumeUnit() {
		return volumeUnit;
	}

	public void setVolumeUnit(String volumeUnit) {
		this.volumeUnit = volumeUnit;
	}

	public String getValuationIndicator() {
		return valuationIndicator;
	}

	public void setValuationIndicator(String valuationIndicator) {
		this.valuationIndicator = valuationIndicator;
	}

	public String getChargesCodCurrency() {
		return chargesCodCurrency;
	}

	public void setChargesCodCurrency(String chargesCodCurrency) {
		this.chargesCodCurrency = chargesCodCurrency;
	}

	public String getChargeDescription() {
		return chargeDescription;
	}

	public void setChargeDescription(String chargeDescription) {
		this.chargeDescription = chargeDescription;
	}

	public String getChargeSvc() {
		return chargeSvc;
	}

	public void setChargeSvc(String chargeSvc) {
		this.chargeSvc = chargeSvc;
	}

	public String getCrossrefCode() {
		return crossrefCode;
	}

	public void setCrossrefCode(String crossrefCode) {
		this.crossrefCode = crossrefCode;
	}

	public String getCrossrefValue() {
		return crossrefValue;
	}

	public void setCrossrefValue(String crossrefValue) {
		this.crossrefValue = crossrefValue;
	}
	
	/**
	 * @return the transferFromCarrier
	 */
	public String getTransferFromCarrier() {
		return transferFromCarrier;
	}

	/**
	 * @param transferFromCarrier the transferFromCarrier to set
	 */
	public void setTransferFromCarrier(String transferFromCarrier) {
		this.transferFromCarrier = transferFromCarrier;
	}

	/**
	 * @return the transferToCarrier
	 */
	public String getTransferToCarrier() {
		return transferToCarrier;
	}

	/**
	 * @param transferToCarrier the transferToCarrier to set
	 */
	public void setTransferToCarrier(String transferToCarrier) {
		this.transferToCarrier = transferToCarrier;
	}

	/**
	 * @return the interlineCarriers
	 */
	public List<String> getInterlineCarriers() {
		return interlineCarriers;
	}

	/**
	 * @param interlineCarriers the interlineCarriers to set
	 */
	public void setInterlineCarriers(List<String> interlineCarriers) {
		this.interlineCarriers = interlineCarriers;
	}

    public String getAcnNumber() {
        return acnNumber;
    }

    public void setAcnNumber(String acnNumber) {
        this.acnNumber = acnNumber;
    }

    /**
     * @return the exportAuditStatus
     */
    public AuditStatusType getExportAuditStatus() {
        return exportAuditStatus;
    }

    /**
     * @param pExportAuditStatus the exportAuditStatus to set
     */
    public void setExportAuditStatus(final AuditStatusType pExportAuditStatus) {
        this.exportAuditStatus = pExportAuditStatus;
    }

    /**
     * @return the importAuditStatus
     */
    public AuditStatusType getImportAuditStatus() {
        return importAuditStatus;
    }

    /**
     * @param pImportAuditStatus the importAuditStatus to set
     */
    public void setImportAuditStatus(final AuditStatusType pImportAuditStatus) {
        this.importAuditStatus = pImportAuditStatus;
    }

    /**
     * @return the insuranceValue
     */
    public String getInsuranceValue() {
        return insuranceValue;
    }

    /**
     * @param pInsuranceValue the insuranceValue to set
     */
    public void setInsuranceValue(final String pInsuranceValue) {
        this.insuranceValue = pInsuranceValue;
    }

    /**
     * @return the insuranceCode
     */
    public String getInsuranceCode() {
        return insuranceCode;
    }

    /**
     * @param pInsuranceCode the insuranceCode to set
     */
    public void setInsuranceCode(final String pInsuranceCode) {
        this.insuranceCode = pInsuranceCode;
    }
	/**
	 * @return the goodsLocationType
	 */
	public GoodsLocationType getGoodsLocationType() {
		return goodsLocationType;
	}

	/**
	 * @param goodsLocationType the goodsLocationType to set
	 */
	public void setGoodsLocationType(GoodsLocationType goodsLocationType) {
		this.goodsLocationType = goodsLocationType;
	}
	
	/**
	 * @return the pieceIDActionCount
	 */
	public Integer getPieceIDActionCount() {
		return pieceIDActionCount;
	}

	/**
	 * @param pieceIDActionCount the pieceIDActionCount to set
	 */
	public void setPieceIDActionCount(Integer pieceIDActionCount) {
		this.pieceIDActionCount = pieceIDActionCount;
	}
}
