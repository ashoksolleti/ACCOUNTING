/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AgreementType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RateBasedOnType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.WeightType;
import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.GeographicDataDto;

/**
 * <code>InterlineAgreementsFindDto</code> contain details for finding InterlineAgreements.
 * <p>
 * This contains all information about finding Interline Agreements.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>agreementIdentifier
 * <li>agreementType
 * <li>airWayDestination
 * <li>airwayOrigin
 * <li>dateRangeDto
 * <li>issuingACN
 * <li>oId
 * <li>toCarrier
 * </ul>
 */

public class InterlineAgreementsFindDto extends PersistenceObjectDto {

    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = -139584693264530623L;

    /**
     * Attribute to hold <code>provisoIdentifier</code> property.
     */
    private String agreementIdentifier;

    /**
     * Attribute to hold <code>agreementType</code> property.
     */
    private AgreementType agreementType;

    /**
     * Attribute to hold <code>airWayBillDestination</code> property.
     */
    private GeographicDataDto airWayBillDestination;

    /**
     * Attribute to hold <code>airWayBillOrigin</code> property.
     */
    private GeographicDataDto airWayBillOrigin;

    /**
     * Attribute to hold <code>allDestinationInd</code> property.
     */

    private boolean allDestinationInd;

    /**
     * Attribute to hold <code>allOriginInd</code> property.
     */

    private boolean allOriginInd;

    /**
     * Attribute to hold <code>dateRangeDto</code> property.
     */
    private DateRangeDto dateRangeDto;

    /**
     * Attribute to hold the <code>download</code> property.
     */
    private boolean download;

    /**
     * Attribute to hold <code>issuingACN</code> property.
     */
    private String issuingACN;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>toCarrier</code> property.
     */
    private String toCarrier;
    
    private String segmentOrigin;
    
    private String segmentDesitantion;
    
    private String prorateID;
    
    private boolean bidirectional;
    
    private List<String> searchSplcodes;
    
    private boolean splAnyOrAll;
    
    private List<String> searchProductCodes;
    
    private boolean prodAnyOrAll;
    
    private List<String> searchUldTypes;
    
    private boolean uldsAnyOrAll;
    
    private List<String> searchFlightnumbers;
    
    private boolean flightsAnyOrAll;
    
    private List<String> searchCommodities;
    
    private boolean commodAnyOrAll;
    
    private List<String> searchAwbDtos;
    
    private List<String> searchAccNumber;
    
    private boolean awbsAnyOrAll;
    
    private boolean allSegmentOrigin;
    
    private boolean allSegmentDest;

    private WeightType weightType;

    private RateBasedOnType rateBasedOn;
    
    private boolean dupAgrmntEntryInd;

    public WeightType getWeightType() {
        return this.weightType;
    }

    public void setWeightType(final WeightType weightType) {
        this.weightType = weightType;
    }

    public RateBasedOnType getRateBasedOn() {
        return this.rateBasedOn;
    }

    public void setRateBasedOn(final RateBasedOnType rateBasedOn) {
        this.rateBasedOn = rateBasedOn;
    }

    /**
     * Gets the <code>agreementIdentifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>agreementIdentifier</code> property.
     */
    public String getAgreementIdentifier() {
        return this.agreementIdentifier;
    }

    /**
     * Gets the <code>agreementType</code> property.
     * <p>
     * 
     * @return the current value of the <code>agreementType</code> property.
     */
    public AgreementType getAgreementType() {
        return this.agreementType;
    }

    /**
     * Gets the <code>airWayBillDestination</code> property.
     * <p>
     * 
     * @return the current value of the <code>airWayBillDestination</code> property.
     */
    public GeographicDataDto getAirWayBillDestination() {
        return this.airWayBillDestination;
    }

    /**
     * Gets the <code>airWayBillOrigin</code> property.
     * <p>
     * 
     * @return the current value of the <code>airWayBillOrigin</code> property.
     */
    public GeographicDataDto getAirWayBillOrigin() {
        return this.airWayBillOrigin;
    }

    /**
     * Gets the <code>AllDestinationInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>AllDestinationInd</code> property.
     */
    public boolean getAllDestinationInd() {
        return this.allDestinationInd;
    }

    /**
     * Gets the <code>AllOriginInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>AllOriginInd</code> property.
     */

    public boolean getAllOriginInd() {
        return this.allOriginInd;
    }

    /**
     * Gets the <code>dateRangeDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>dateRangeDto</code> property.
     */
    public DateRangeDto getDateRange() {
        return this.dateRangeDto;
    }

    /**
     * Gets the <code>issuingACN</code> property.
     * <p>
     * 
     * @return the current value of the <code>issuingACN</code> property.
     */
    public String getIssuingACN() {
        return this.issuingACN;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>toCarrier</code> property.
     * <p>
     * 
     * @return the current value of the <code>toCarrier</code> property.
     */
    public String getToCarrier() {
        return this.toCarrier;
    }

    /**
     * <li>Gets the download.</li>
     * <p>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     * @return <code>boolean</code><br>
     *         Returns the download.<br>
     */
    public boolean isDownload() {
        return this.download;
    }

    /**
     * Sets the <code>agreementIdentifier</code> property.
     * <p>
     * 
     * @param pAgreementIdentifier
     *            the current value of the <code>agreementIdentifier</code> property.
     */
    public void setAgreementIdentifier(final String pAgreementIdentifier) {
        this.agreementIdentifier = ContractUtility
                    .convertToUpperCase(pAgreementIdentifier);
    }

    /**
     * Sets the <code>agreementType</code> property.
     * <p>
     * 
     * @param pAgreementType
     *            the current value of the <code>agreementType</code> property.
     */
    public void setAgreementType(final AgreementType pAgreementType) {
        this.agreementType = pAgreementType;
    }

    /**
     * Sets the <code>airWayBillDestination</code> property.
     * <p>
     * 
     * @param pAirWayBillDestination
     *            the current value of the <code>airWayBillDestination</code> property.
     */
    public void setAirWayBillDestination(final GeographicDataDto pAirWayBillDestination) {
        this.airWayBillDestination = pAirWayBillDestination;
    }

    /**
     * Sets the <code>airWayBillOrigin</code> property.
     * <p>
     * 
     * @param pAirWayBillOrigin
     *            the current value of the <code>airWayBillOrigin</code> property.
     */
    public void setAirWayBillOrigin(final GeographicDataDto pAirWayBillOrigin) {
        this.airWayBillOrigin = pAirWayBillOrigin;
    }

    /**
     * Sets the <code>AllDestinationInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pAllDestinationInd
     *            the current value of the <code>AllDestinationInd</code> property.
     */
    public void setAllDestinationInd(final boolean pAllDestinationInd) {
        this.allDestinationInd = pAllDestinationInd;
    }

    /**
     * Sets the <code>AllOriginInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pAllOriginInd
     *            the current value of the <code>AllOriginInd</code> property.
     */

    public void setAllOriginInd(final boolean pAllOriginInd) {
        this.allOriginInd = pAllOriginInd;
    }

    /**
     * Sets the <code>dateRangeDto</code> property.
     * <p>
     * 
     * @param pDateRangeDto
     *            the current value of the <code>dateRangeDto</code> property.
     */
    public void setDateRange(final DateRangeDto pDateRangeDto) {
        this.dateRangeDto = pDateRangeDto;
    }

    public void setDownload(final boolean pDownload) {
        this.download = pDownload;
    }

    /**
     * Sets the <code>issuingACN</code> property.
     * <p>
     * 
     * @param pIssuingACN
     *            the current value of the <code>issuingACN</code> property.
     */
    public void setIssuingACN(final String pIssuingACN) {
        this.issuingACN = ContractUtility
                    .convertToUpperCase(pIssuingACN);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the current value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>toCarrier</code> property.
     * <p>
     * 
     * @param pToCarrier
     *            the current value of the <code>toCarrier</code> property.
     */
    public void setToCarrier(final String pToCarrier) {
        this.toCarrier = ContractUtility
                    .convertToUpperCase(pToCarrier);
    }

	public String getSegmentOrigin() {
		return segmentOrigin;
	}

	public void setSegmentOrigin(String segmentOrigin) {
		this.segmentOrigin = segmentOrigin;
	}

	public String getSegmentDesitantion() {
		return segmentDesitantion;
	}

	public void setSegmentDesitantion(String segmentDesitantion) {
		this.segmentDesitantion = segmentDesitantion;
	}

	public String getProrateID() {
		return prorateID;
	}

	public void setProrateID(String prorateID) {
		this.prorateID = prorateID;
	}

	public boolean isBidirectional() {
		return bidirectional;
	}

	public void setBidirectional(boolean bidirectional) {
		this.bidirectional = bidirectional;
	}

	public List<String> getSearchSplcodes() {
		return searchSplcodes;
	}

	public void setSearchSplcodes(List<String> searchSplcodes) {
		this.searchSplcodes = searchSplcodes;
	}

	public List<String> getSearchProductCodes() {
		return searchProductCodes;
	}

	public void setSearchProductCodes(List<String> searchProductCodes) {
		this.searchProductCodes = searchProductCodes;
	}

	public List<String> getSearchUldTypes() {
		return searchUldTypes;
	}

	public void setSearchUldTypes(List<String> searchUldTypes) {
		this.searchUldTypes = searchUldTypes;
	}

	public List<String> getSearchFlightnumbers() {
		return searchFlightnumbers;
	}

	public void setSearchFlightnumbers(List<String> searchFlightnumbers) {
		this.searchFlightnumbers = searchFlightnumbers;
	}

	public List<String> getSearchCommodities() {
		return searchCommodities;
	}

	public void setSearchCommodities(List<String> searchCommodities) {
		this.searchCommodities = searchCommodities;
	}

	public List<String> getSearchAwbDtos() {
		return searchAwbDtos;
	}

	public void setSearchAwbDtos(List<String> searchAwbDtos) {
		this.searchAwbDtos = searchAwbDtos;
	}

	public List<String> getSearchAccNumber() {
		return searchAccNumber;
	}

	public void setSearchAccNumber(List<String> searchAccNumber) {
		this.searchAccNumber = searchAccNumber;
	}

	public boolean isSplAnyOrAll() {
		return splAnyOrAll;
	}

	public void setSplAnyOrAll(boolean splAnyOrAll) {
		this.splAnyOrAll = splAnyOrAll;
	}

	public boolean isProdAnyOrAll() {
		return prodAnyOrAll;
	}

	public void setProdAnyOrAll(boolean prodAnyOrAll) {
		this.prodAnyOrAll = prodAnyOrAll;
	}

	public boolean isUldsAnyOrAll() {
		return uldsAnyOrAll;
	}

	public void setUldsAnyOrAll(boolean uldsAnyOrAll) {
		this.uldsAnyOrAll = uldsAnyOrAll;
	}

	public boolean isFlightsAnyOrAll() {
		return flightsAnyOrAll;
	}

	public void setFlightsAnyOrAll(boolean flightsAnyOrAll) {
		this.flightsAnyOrAll = flightsAnyOrAll;
	}

	public boolean isCommodAnyOrAll() {
		return commodAnyOrAll;
	}

	public void setCommodAnyOrAll(boolean commodAnyOrAll) {
		this.commodAnyOrAll = commodAnyOrAll;
	}

	public boolean isAwbsAnyOrAll() {
		return awbsAnyOrAll;
	}

	public void setAwbsAnyOrAll(boolean awbsAnyOrAll) {
		this.awbsAnyOrAll = awbsAnyOrAll;
	}

	public boolean isAllSegmentOrigin() {
		return allSegmentOrigin;
	}
	
	public boolean getAllSegmentOrigin() {
		return allSegmentOrigin;
	}

	public void setAllSegmentOrigin(boolean allSegmentOrigin) {
		this.allSegmentOrigin = allSegmentOrigin;
	}

	public boolean isAllSegmentDest() {
		return allSegmentDest;
	}
	
	public boolean getAllSegmentDest() {
		return allSegmentDest;
	}

	public void setAllSegmentDest(boolean allSegmentDest) {
		this.allSegmentDest = allSegmentDest;
	}

	public boolean isDupAgrmntEntryInd() {
		return dupAgrmntEntryInd;
	}

	public void setDupAgrmntEntryInd(boolean dupAgrmntEntryInd) {
		this.dupAgrmntEntryInd = dupAgrmntEntryInd;
	}

}
