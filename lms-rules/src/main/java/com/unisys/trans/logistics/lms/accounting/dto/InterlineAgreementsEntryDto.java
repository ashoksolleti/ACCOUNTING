//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on

package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.AgreementType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InterlineAgreementsRouteDto;
import com.unisys.trans.logistics.lms.accounting.dto.constants.LogicalOperationType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.OtherChargeCodeDecideType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ProvisoType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RateBasedOnType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.StatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.WeightType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.GeographicDataDto;

/**
 * <code>InterlineAgreementsEntry</code> dto contain details of
 * InterlineAgreementsEntry.
 * <p>
 * This contains all information about InterlineAgreementsEntry.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>biDirectional
 * <li>commissionPercent
 * <li>commodity
 * <li>commodityRule
 * <li>currencyCode
 * <li>dateRange
 * <li>firstCarrierIndicator
 * <li>flightNumber
 * <li>flightNumberRule
 * <li>intermediateCarrierIndicator
 * <li>lastCarrierIndicator
 * <li>maximumAmount
 * <li>maximumPercent
 * <li>maximumWeight
 * <li>minimumAmount
 * <li>minimumPercent
 * <li>minimumWeight
 * <li>oId
 * <li>otherChargeCode
 * <li>otherChargeRule
 * <li>overPivotRate
 * <li>pivotWeight
 * <li>productCode
 * <li>productRule
 * <li>prorateId
 * <li>provisoClass
 * <li>provisotype
 * <li>rate
 * <li>rateBasedOn
 * <li>segmentDestination
 * <li>segmentOrigin
 * <li>specialHandlingCodes
 * <li>splCodeRule
 * <li>status
 * <li>tc1Indicator
 * <li>tc2Indicator
 * <li>tc3Indicator
 * <li>transatlanticIndicator
 * <li>transpacificIndicator
 * <li>uldType
 * <li>uldTypeR
 * <li>userAudit
 * <li>weightType
 * <li>weightUnit
 * </ul>
 */

public class InterlineAgreementsEntryDto extends PersistenceObjectDto {

    /**
     * Attribute to hold <code>AND_SPL_CHAR</code> property.
     */
    private static final String AND_SPL_CHAR = "&";

    /**
     * Attribute to hold <code>EMPTY_STRING</code> property.
     */
    private static final String EMPTY_STRING = "";

    /**
     * Attribute to hold <code>INDEF</code> property.
     */
    private static final String INDEF = "INDEF";

    /**
     * Attribute to hold <code>NEW_LINE</code> property.
     */
    private static final String NEW_LINE = "<br>";

    /**
     * Attribute to hold <code>NO_LITERAL</code> property.
     */
    private static final String NO_LITERAL = "No";

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 7684337621324881660L;

    /**
     * Attribute to hold <code>WHITE_SPACE</code> property.
     */
    private static final String WHITE_SPACE = " ";

    /**
     * Attribute to hold <code>YES_LITERAL</code> property.
     */
    private static final String YES_LITERAL = "Yes";

    /**
     * Attribute to hold <code>actionType</code> property.
     */
    private ActionType actionType;

    /**
     * Attribute to hold <code>agreementType</code> property.
     */
    private AgreementType agreementType;

    /**
     * Attribute to hold <code>allDestinationInd</code> property.
     */
    // On initial page load,it is initialized to be true
    private boolean allDestinationInd;

    /**
     * Attribute to hold <code>allOriginInd</code> property.
     */
    // On initial page load,it is initialized to be true
    private boolean allOriginInd;

    /**
     * Attribute to hold <code>biDirectional</code> property.
     */
    private boolean biDirectional;

    /**
     * Attribute to hold <code>commissionPercent</code> property.
     */
    private BigDecimal commissionPercent;

    /**
     * Attribute to hold <code>commodity</code> property.
     */
    private List<String> commodity;

    /**
     * Attribute to hold <code>commodityRule</code> property.
     */
    private LogicalOperationType commodityRule;

    /**
     * Attribute to hold <code>currencyCode</code> property.
     */
    private String currencyCode;

    /**
     * Attribute to hold <code>dateRangeDto</code> property.
     */
    private DateRangeDto dateRangeDto;

    /**
     * Attribute to hold <code>error</code> property.
     */
    private boolean error;

    /**
     * Attribute to hold <code>expirationInd</code> property.
     */
    private boolean expirationInd;

    /**
     * Attribute to hold <code>firstCarrierIndicator</code> property.
     */
    private boolean firstCarrierIndicator;

    /**
     * Attribute to hold <code>flightNumber</code> property.
     */
    private List<String> flightNumber;

    /**
     * Attribute to hold <code>flightNumberRule</code> property.
     */
    private LogicalOperationType flightNumberRule;

    /**
     * Attribute to hold <code>intermediateCarrierIndicator</code> property.
     */
    private boolean intermediateCarrierIndicator;

    /**
     * Attribute to hold <code>lastCarrierIndicator</code> property.
     */
    private boolean lastCarrierIndicator;

    /**
     * Attribute to hold <code>maximumAmount</code> property.
     */
    private BigDecimal maximumAmount;

    /**
     * Attribute to hold <code>maximumPercent</code> property.
     */
    private BigDecimal maximumPercent;

    /**
     * Attribute to hold <code>maximumWeight</code> property.
     */
    private BigDecimal maximumWeight;

    /**
     * Attribute to hold <code>minimumAmount</code> property.
     */
    private BigDecimal minimumAmount;

    /**
     * Attribute to hold <code>minimumPercent</code> property.
     */
    private BigDecimal minimumPercent;

    /**
     * Attribute to hold <code>minimumWeight</code> property.
     */
    private BigDecimal minimumWeight;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>otherChargeCode</code> property.
     */
    private List<String> otherChargeCode;

    /**
     * Attribute to hold <code>otherChargeRule</code> property.
     */
    private OtherChargeCodeDecideType otherChargeRule;

    /**
     * Attribute to hold <code>overPivotBRate</code> property.
     */
    private BigDecimal overPivotRate;

    /**
     * Attribute to hold <code>pivotWeight</code> property.
     */
    private BigDecimal pivotWeight;

    /**
     * Attribute to hold <code>productCode</code> property.
     */
    private List<String> productCode;

    /**
     * Attribute to hold <code>productRules</code> property.
     */
    private LogicalOperationType productRule;

    /**
     * Attribute to hold <code>prorateID</code> property.
     */
    private Long prorateId;

    /**
     * Attribute to hold <code>provisoClass</code> property.
     */
    private String provisoClass;

    /**
     * Attribute to hold <code>provisotype</code> property.
     */
    private ProvisoType provisotype;

    /**
     * Attribute to hold <code>rate</code> property.
     */
    private BigDecimal rate;

    /**
     * Attribute to hold <code>rateBasedOn</code> property.
     */
    private RateBasedOnType rateBasedOn;

    /**
     * Attribute to hold <code>segmentDestination</code> property.
     */
    private GeographicDataDto segmentDestination;

    /**
     * Attribute to hold <code>segmentOrigin</code> property.
     */
    private GeographicDataDto segmentOrigin;

    /**
     * Attribute to hold <code>specialHandlingCodes</code> property.
     */
    private List<String> specialHandlingCodes;

    /**
     * Attribute to hold <code>splCodeRule</code> property.
     */
    private LogicalOperationType splCodeRule;

    /**
     * Attribute to hold <code>status</code> property.
     */
    private StatusType status;

    /**
     * Attribute to hold <code>tc1Indicator</code> property.
     */
    private boolean tc1Indicator;

    /**
     * Attribute to hold <code>tc2Indicator</code> property.
     */
    private boolean tc2Indicator;

    /**
     * Attribute to hold <code>tc3Indicator</code> property.
     */
    private boolean tc3Indicator;

    /**
     * Attribute to hold <code>transatlanticIndicator</code> property.
     */
    private boolean transatlanticIndicator;

    /**
     * Attribute to hold <code>transpacificIndicator</code> property.
     */
    private boolean transpacificIndicator;

    /**
     * Attribute to hold <code>uldType</code> property.
     */
    private List<String> uldType;

    /**
     * Attribute to hold <code>uldTypeRule</code> property.
     */
    private LogicalOperationType uldTypeRule;



    /**
     * Attribute to hold <code>routingRule</code> property.
     */
    private LogicalOperationType routingRule;
    /**
     * Attribute to hold <code>userAudit</code> property.
     */
    private UserAuditDto userAudit;

    /**
     * Attribute to hold <code>weightType</code> property.
     */
    private WeightType weightType;

    /**
     * Attribute to hold <code>weightUnit</code> property.
     */
    private WeightUOMType weightUnit;

    /**
     * <code>Default constructor.</code>
     */
    //Deeps
    private List<String> routing;
    
    private List<String> awbNumber;
    
    public List<String> getAwbNumber() {
		return this.awbNumber;
	}

	public void setAwbNumber(List<String> awbNumber) {
		this.awbNumber = awbNumber;
	}
	private List<InterlineAgreementsRouteDto>  InterlineAgreementsRoutes;
    
    public List<InterlineAgreementsRouteDto> getInterlineAgreementsRoutes() {
		return InterlineAgreementsRoutes;
	}

	public void setInterlineAgreementsRoutes(
			List<InterlineAgreementsRouteDto> interlineAgreementsRoutes) {
		InterlineAgreementsRoutes = interlineAgreementsRoutes;
	}

	public List<String> getRouting() {
		return this.routing;
	}

	public void setRouting(List<String> prouting) {
		this.routing = this.covertListToUpperCase(prouting) ;
	}
	//Deeps 
    /**
     * Attribute to hold <code>segmentOrigin</code> property.
     */
    private List<InterlineAgreementAwbNumberDto> airWaybillNumber;
	
    
	public List<InterlineAgreementAwbNumberDto> getAirWaybillNumber() {
		return this.airWaybillNumber;
	}

	/**
	 * @param airWaybillNumber the airWaybillNumber to set
	 */
	public void setAirWaybillNumber(List<InterlineAgreementAwbNumberDto> airWaybillNumber) {
		this.airWaybillNumber = airWaybillNumber;
	}
	 private List<String> accNos;
	 
	public List<String> getaccNos() {
		return this.accNos;
	}

	public void setaccNos(List<String> accNos) {
		this.accNos = this.covertListToUpperCase(accNos) ;
	}

	public InterlineAgreementsEntryDto() {

    }

    /**
     * equals two <code>InterlineAgreemnetEntryDto</code> propertis.
     * <p>
     * 
     * @param pObj
     *            the new value of the <code>InterlineAgreemnetEntryDto</code> property.
     * 
     * @return the compare result of the <code>InterlineAgreemnetEntryDto</code> properties.
     */
    @Override
    public boolean equals(Object pObj) {
        if (this == pObj)
            return true;
        if (pObj == null)
            return false;
        if (getClass() != pObj.getClass())
            return false;
        final InterlineAgreementsEntryDto other = (InterlineAgreementsEntryDto) pObj;
        if (biDirectional != other.biDirectional)
            return false;
        if (allOriginInd != other.allOriginInd)
            return false;
        if (allDestinationInd != other.allDestinationInd)
            return false;
        if (firstCarrierIndicator != other.firstCarrierIndicator)
            return false;
        if (intermediateCarrierIndicator != other.intermediateCarrierIndicator)
            return false;
        if (lastCarrierIndicator != other.lastCarrierIndicator)
            return false;
        if (pivotWeight == null) {
            if (other.pivotWeight != null)
                return false;
        }
        else if (!pivotWeight.equals(other.pivotWeight))
            return false;
        if (provisoClass == null) {
            if (other.provisoClass != null)
                return false;
        }
        else if (!provisoClass.equals(other.provisoClass))
            return false;
        if (provisotype != other.provisotype)
            return false;
        if (rateBasedOn != other.rateBasedOn)
            return false;

        if (segmentDestination == null) {
            if (other.segmentDestination != null && other.segmentDestination.getCode() != null)
                return false;
        }
        else if (segmentDestination.getCode() != null) {
            if (other.segmentDestination.getCode() == null)
                return false;
            else if (segmentDestination.getCode() != null
                        && other.segmentDestination.getCode() != null) {
                if (!(segmentDestination.getCode()
                            .equals(other.segmentDestination.getCode()))) {
                    return false;
                }
            }

        }

        if (segmentOrigin == null) {
            if (other.segmentOrigin != null && other.segmentOrigin.getCode() != null)
                return false;
        }
        else if (segmentOrigin.getCode() != null) {
            if (other.segmentOrigin.getCode() == null)
                return false;
            else if (segmentOrigin.getCode() != null
                        && other.segmentOrigin.getCode() != null) {
                if (!(segmentOrigin.getCode().equals(other.segmentOrigin
                            .getCode()))) {
                    return false;
                }
            }
        }
        // Currency Code
        if (currencyCode == null) {
            if (other.currencyCode != null) {
                return false;
            }
        }
        else if (other.currencyCode == null) {
            return false;
        }
        else if (!currencyCode.equalsIgnoreCase(other.currencyCode)) {
            return false;
        }
        if (tc1Indicator != other.tc1Indicator)
            return false;
        if (tc2Indicator != other.tc2Indicator)
            return false;
        if (tc3Indicator != other.tc3Indicator)
            return false;
        if (transatlanticIndicator != other.transatlanticIndicator)
            return false;
        if (transpacificIndicator != other.transpacificIndicator)
            return false;
        if (weightType != other.weightType)
            return false;

        if (rate == null) {
            if (other.rate != null)
                return false;
        }
        else if (!rate.equals(other.rate))
            return false;
        if (maximumAmount == null) {

            if (other.maximumAmount != null)
                return false;
        }
        else if (!maximumAmount.equals(other.maximumAmount))
            return false;
        if (maximumPercent == null) {
            if (other.maximumPercent != null)
                return false;
        }
        else if (!maximumPercent.equals(other.maximumPercent))
            return false;
        if (maximumWeight == null) {
            if (other.maximumWeight != null)
                return false;
        }
        else if (!maximumWeight.equals(other.maximumWeight))
            return false;
        if (minimumAmount == null) {
            if (other.minimumAmount != null)
                return false;
        }
        else if (!minimumAmount.equals(other.minimumAmount))
            return false;
        if (minimumPercent == null) {
            if (other.minimumPercent != null)
                return false;
        }
        else if (!minimumPercent.equals(other.minimumPercent))
            return false;
        if (minimumWeight == null) {
            if (other.minimumWeight != null)
                return false;
        }
        else if (!minimumWeight.equals(other.minimumWeight))
            return false;
        if (oId == null) {
            if (other.oId != null)
                return false;
        }
        else if (!oId.equals(other.oId))
            return false;
        if (overPivotRate == null) {
            if (other.overPivotRate != null)
                return false;
        }
        else if (!overPivotRate.equals(other.overPivotRate))
            return false;
        if (pivotWeight == null) {
            if (other.pivotWeight != null)
                return false;
        }
        else if (!pivotWeight.equals(other.pivotWeight))
            return false;

        if (!this.equalsTwoList(this.getProductCode(), other.getProductCode(),
            this.getProductRule(), other.getProductRule())) {
            return false;
        }
        if (!this.equalsTwoList(this.getCommodity(), other.getCommodity(),
            this.getCommodityRule(), other.getCommodityRule())) {
            return false;
        }
        if (!this.equalsTwoList(this.getSpecialHandlingCodes(),
            other.getSpecialHandlingCodes(), this.getSplCodeRule(),
            other.getSplCodeRule())) {
            return false;
        }
        if (!this.equalsTwoList(this.getUldType(), other.getUldType(),
            this.getUldTypeRule(), other.getUldTypeRule())) {
            return false;
        }
        //Deeps
        if (!this.equalsTwoList(this.getRouting(), other.getRouting(),
                this.getroutingRule(), other.getroutingRule())) {
                return false;
            }
        if (!this.equalsTwoList(this.getFlightNumber(),
            other.getFlightNumber(), this.getFlightNumberRule(),
            other.getFlightNumberRule())) {
            return false;
        }

        // TODO other charge code

        return true;
    }

    /**
     * Returns the given Code's values as space and new line appended value.
     * 
     * @param pInputCodes
     *            the list of <code>codes</code>.
     * 
     * @return aModifiedString the new value of the given<code>Code's</code>.
     * 
     */
    public String formatCodesForDisplay(final List<String> pInputCodes) {
        final StringBuffer aCodeAsString = new StringBuffer();
        if (pInputCodes != null && !pInputCodes.isEmpty()) {
            final int size = pInputCodes.size();
            if (size > 0) {
                aCodeAsString.append(pInputCodes.get(0).toUpperCase(Locale.US));
                for (int i = 1; i < size; i++) {
                    if (i % 5 == 0) {
                        aCodeAsString.append(NEW_LINE);
                        aCodeAsString.append(pInputCodes.get(i).toUpperCase());
                        continue;
                    }
                    aCodeAsString.append(WHITE_SPACE);
                    aCodeAsString.append(pInputCodes.get(i).toUpperCase());
                }
            }
        }
        return aCodeAsString.toString();
    }

    /**
     * Returns the given Code's values as space appended value.
     * 
     * @param pInputCodes
     *            the list of <code>codes</code>.
     * 
     * @return aModifiedString the new value of the given<code>Code's</code>.
     * 
     */
    public String formatCodesForDownload(final List<String> pInputCodes) {
        final StringBuffer aCodeAsString = new StringBuffer();
        if (pInputCodes != null && !pInputCodes.isEmpty()) {
            final int size = pInputCodes.size();
            if (size > 0) {
                aCodeAsString.append(pInputCodes.get(0));
                for (int i = 1; i < size; i++) {
                    aCodeAsString.append(WHITE_SPACE);
                    aCodeAsString.append(pInputCodes.get(i));
                }
            }
        }
        return aCodeAsString.toString();
    }

    /**
     * Gets the <code>actionType</code> property.
     * <p>
     * 
     * @return the current value of the <code>actionType</code> property.
     */
    public ActionType getActionType() {
        return this.actionType;
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
     * Gets the <code>biDirectional</code> property.
     * <p>
     * 
     * @return the current value of the <code>biDirectional</code> property.
     */
    public boolean getBiDirectional() {
        return this.biDirectional;
    }

    /**
     * Gets the <code>commissionPercent</code> property.
     * <p>
     * 
     * @return the current value of the <code>commissionPercent</code> property.
     */
    public BigDecimal getCommissionPercent() {
        return this.commissionPercent;
    }

    /**
     * Gets the <code>commodity</code> property.
     * <p>
     * 
     * @return the current value of the <code>commodity</code> property.
     */
    public List<String> getCommodity() {
        return this.commodity;
    }

    /**
     * Returns the Commodity code values as space and new line appended value.
     * 
     * @return aModifiedString the new value of the <code>Commodity Codes</code> .
     * 
     */
    public String getCommodityAsString() {
        return this.formatCodesForDisplay(this.getCommodity());
    }

    /**
     * Gets the <code>commodityRule</code> property.
     * <p>
     * 
     * @return the current value of the <code>commodityRule</code> property.
     */
    public LogicalOperationType getCommodityRule() {
        return this.commodityRule;
    }

    /**
     * Gets the <code>currencyCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>currencyCode</code> property.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Gets the <code>dateRangeDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>dateRangeDto</code> property.
     */
    public DateRangeDto getDateRangeDto() {
        if (this.dateRangeDto == null) {
            this.dateRangeDto = new DateRangeDto();
        }
        return this.dateRangeDto;
    }

    /**
     * Gets the <code>firstCarrierIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>firstCarrierIndicator</code> property.
     */
    public boolean getFirstCarrierIndicator() {
        return this.firstCarrierIndicator;
    }

    /**
     * Gets the <code>flightNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightNumber</code> property.
     */
    public List<String> getFlightNumber() {
        return this.flightNumber;
    }

    /**
     * Returns the Flight Number values as space and new line appended value.
     * 
     * @return aModifiedString the new value of the <code>Flight Numbers</code>.
     * 
     */
    public String getFlightNumberAsString() {
        return this.formatCodesForDisplay(this.getFlightNumber());
    }

    /**
     * Gets the <code>flightNumberRule</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightNumberRule</code> property.
     */
    public LogicalOperationType getFlightNumberRule() {
        return this.flightNumberRule;
    }

    /**
     * Gets the <code>intermediateCarrierIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>intermediateCarrierIndicator</code> property.
     */
    public boolean getIntermediateCarrierIndicator() {
        return this.intermediateCarrierIndicator;
    }

    /**
     * Gets the <code>lastCarrierIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>lastCarrierIndicator</code> property.
     */
    public boolean getLastCarrierIndicator() {
        return this.lastCarrierIndicator;
    }

    /**
     * Gets the <code>maximumAmount</code> property.
     * <p>
     * 
     * @return the current value of the <code>maximumAmount</code> property.
     */
    public BigDecimal getMaximumAmount() {
        return this.maximumAmount;
    }

    /**
     * Gets the <code>maximumPercent</code> property.
     * <p>
     * 
     * @return the current value of the <code>maximumPercent</code> property.
     */
    public BigDecimal getMaximumPercent() {
        return this.maximumPercent;
    }

    /**
     * Gets the <code>maximumWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>maximumWeight</code> property.
     */
    public BigDecimal getMaximumWeight() {
        return this.maximumWeight;
    }

    /**
     * Gets the <code>minimumAmount</code> property.
     * <p>
     * 
     * @return the current value of the <code>minimumAmount</code> property.
     */
    public BigDecimal getMinimumAmount() {
        return this.minimumAmount;
    }

    /**
     * Gets the <code>minimumPercent</code> property.
     * <p>
     * 
     * @return the current value of the <code>minimumPercent</code> property.
     */
    public BigDecimal getMinimumPercent() {
        return this.minimumPercent;
    }

    /**
     * Gets the <code>minimumWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>minimumWeight</code> property.
     */
    public BigDecimal getMinimumWeight() {
        return this.minimumWeight;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>otherChargeCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>otherChargeCode</code> property.
     */
    public List<String> getOtherChargeCode() {
        return this.otherChargeCode;
    }

    /**
     * Returns the OtherCharge code values as space and new line appended value.
     * 
     * @return aModifiedString the new value of the <code>OtherCharge Codes</code>.
     * 
     */
    public String getOtherChargeCodeAsString() {
        return this.formatCodesForDisplay(this.getOtherChargeCode());
    }

    /**
     * Gets the <code>otherChargeRule</code> property.
     * <p>
     * 
     * @return the current value of the <code>otherChargeRule</code> property.
     */
    public OtherChargeCodeDecideType getOtherChargeRule() {
        return this.otherChargeRule;
    }

    /**
     * Gets the <code>overPivotRate</code> property.
     * <p>
     * 
     * @return the current value of the <code>overPivotRate</code> property.
     */
    public BigDecimal getOverPivotRate() {
        return this.overPivotRate;
    }

    /**
     * Gets the <code>pivotWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>pivotWeight</code> property.
     */
    public BigDecimal getPivotWeight() {
        return this.pivotWeight;
    }

    /**
     * Returns the Product code values as space and new line appended value.
     * 
     * @return aModifiedString the new value of the <code>product codes</code>.
     * 
     */
    public String getProductAsString() {
        return this.formatCodesForDisplay(this.getProductCode());
    }

    /**
     * Gets the <code>productCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>productCode</code> property.
     */
    public List<String> getProductCode() {
        return this.productCode;
    }

    /**
     * Gets the <code>productRule</code> property.
     * <p>
     * 
     * @return the current value of the <code>productRule</code> property.
     */
    public LogicalOperationType getProductRule() {
        return this.productRule;
    }

    /**
     * Gets the <code>prorateId</code> property.
     * <p>
     * 
     * @return the current value of the <code>prorateId</code> property.
     */
    public Long getProrateId() {
        return this.prorateId;
    }

    /**
     * Gets the <code>provisoClass</code> property.
     * <p>
     * 
     * @return the current value of the <code>provisoClass</code> property.
     */
    public String getProvisoClass() {
        return this.provisoClass;
    }

    /**
     * Gets the <code>provisotype</code> property.
     * <p>
     * 
     * @return the current value of the <code>provisotype</code> property.
     */
    public ProvisoType getProvisotype() {
        return this.provisotype;
    }

    /**
     * Gets the <code>rate</code> property.
     * <p>
     * 
     * @return the current value of the <code>rate</code> property.
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Gets the <code>rateBasedOn</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateBasedOn</code> property.
     */
    public RateBasedOnType getRateBasedOn() {
        return this.rateBasedOn;
    }

    /**
     * Gets the <code>segmentDestination</code> property.
     * <p>
     * 
     * @return the current value of the <code>segmentDestination</code> property.
     */
    public GeographicDataDto getSegmentDestination() {
        if (this.segmentDestination == null) {
            this.segmentDestination = new GeographicDataDto();
        }
        return this.segmentDestination;
    }

    /**
     * Gets the <code>segmentOrigin</code> property.
     * <p>
     * 
     * @return the current value of the <code>segmentOrigin</code> property.
     */
    public GeographicDataDto getSegmentOrigin() {
        if (this.segmentOrigin == null) {
            this.segmentOrigin = new GeographicDataDto();
        }
        return this.segmentOrigin;
    }

    /**
     * Returns the SpecialHandlingCode code values as space and new line
     * appended value.
     * 
     * @return aModifiedString the new value of the <code>Special Handling Codes</code>.
     * 
     */
    public String getSpecialHandlingCodeAsString() {
        return this.formatCodesForDisplay(this.getSpecialHandlingCodes());
    }

    /**
     * Gets the <code>specialHandlingCodes</code> property.
     * <p>
     * 
     * @return the current value of the <code>specialHandlingCodes</code> property.
     */
    public List<String> getSpecialHandlingCodes() {
        return this.specialHandlingCodes;
    }

    /**
     * Gets the <code>splCodeRule</code> property.
     * <p>
     * 
     * @return the current value of the <code>splCodeRule</code> property.
     */
    public LogicalOperationType getSplCodeRule() {
        return this.splCodeRule;
    }

    /**
     * Gets the <code>status</code> property.
     * <p>
     * 
     * @return the current value of the <code>status</code> property.
     */
    public StatusType getStatus() {
        return this.status;
    }

    /**
     * Gets the <code>tc1Indicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>tc1Indicator</code> property.
     */
    public boolean getTc1Indicator() {
        return this.tc1Indicator;
    }

    /**
     * Gets the <code>tc2Indicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>tc2Indicator</code> property.
     */
    public boolean getTc2Indicator() {
        return this.tc2Indicator;
    }

    /**
     * Gets the <code>tc3Indicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>tc3Indicator</code> property.
     */
    public boolean getTc3Indicator() {
        return this.tc3Indicator;
    }

    /**
     * Gets the <code>transatlanticIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>transatlanticIndicator</code> property.
     */
    public boolean getTransatlanticIndicator() {
        return this.transatlanticIndicator;
    }

    /**
     * Gets the <code>transpacificIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>transpacificIndicator</code> property.
     */
    public boolean getTranspacificIndicator() {
        return this.transpacificIndicator;
    }

    /**
     * Gets the <code>uldType</code> property.
     * <p>
     * 
     * @return the current value of the <code>uldType</code> property.
     */
    public List<String> getUldType() {
        return this.uldType;
    }

    /**
     * Returns the ULD code values as space and new line appended value.
     * 
     * @return aModifiedString the new value of the <code>ULD Codes</code>.
     * 
     */
    public String getUldTypeAsString() {
        return this.formatCodesForDisplay(this.getUldType());
    }
    
    
    //lavanya
    
    public String getRoutingTypeAsString() {
        return this.formatCodesForDisplay(this.getRouting());
    }

    /**
     * Gets the <code>uldTypeRule</code> property.
     * <p>
     * 
     * @return the current value of the <code>uldTypeRule</code> property.
     */
    public LogicalOperationType getUldTypeRule() {
        return this.uldTypeRule;
    }
    
   
    
    /**
     * Gets the <code>routingRule</code> property.
     * <p>
     * 
     * @return the current value of the <code>routingRule</code> property.
     */
    public LogicalOperationType getroutingRule() {
        return this.routingRule;
    }
    /**
     * Gets the <code>userAudit</code> property.
     * <p>
     * 
     * @return the current value of the <code>userAudit</code> property.
     */
    public UserAuditDto getUserAudit() {
        return this.userAudit;
    }

    /**
     * Gets the <code>weightType</code> property.
     * <p>
     * 
     * @return the current value of the <code>weightType</code> property.
     */
    public WeightType getWeightType() {
        return this.weightType;
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
     * The<code>hashCode </code> object.
     * <p>
     * 
     * @return <code>int</code> hashcode of super class.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                    + ((actionType == null) ? 0 : actionType.hashCode());
        result = prime * result
                    + ((currencyCode == null) ? 0 : currencyCode.hashCode());
        result = prime * result
                    + ((dateRangeDto == null) ? 0 : dateRangeDto.hashCode());
        result = prime * result
                    + ((maximumWeight == null) ? 0 : maximumWeight.hashCode());
        result = prime * result
                    + ((minimumWeight == null) ? 0 : minimumWeight.hashCode());
        result = prime * result + ((oId == null) ? 0 : oId.hashCode());
        result = prime * result
                    + ((prorateId == null) ? 0 : prorateId.hashCode());
        result = prime * result + ((rate == null) ? 0 : rate.hashCode());
        result = prime * result
                    + ((rateBasedOn == null) ? 0 : rateBasedOn.hashCode());
        result = prime * result
                    + ((weightType == null) ? 0 : weightType.hashCode());
        result = prime * result
                    + ((weightUnit == null) ? 0 : weightUnit.hashCode());
        return result;
    }

    /**
     * Gets the <code>error</code> property.
     * <p>
     * 
     * @return the current value of the <code>error</code> property.
     */
    public boolean isError() {
        return this.error;
    }

    /**
     * Gets the <code>expirationInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>expirationInd</code> property.
     */
    public boolean isExpirationInd() {
        return expirationInd;
    }

    /**
     * Sets the <code>actionType</code> property.
     * <p>
     * 
     * @param pActionType
     *            the current value of the <code>actionType</code> property.
     */
    public void setActionType(final ActionType pActionType) {
        this.actionType = pActionType;
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
     * Sets the <code>biDirectional</code> property.
     * <p>
     * 
     * @param pBiDirectional
     *            the current value of the <code>biDirectional</code> property.
     */
    public void setBiDirectional(final boolean pBiDirectional) {
        this.biDirectional = pBiDirectional;
    }

    /**
     * Sets the <code>commissionPercent</code> property.
     * <p>
     * 
     * @param pCommissionPercent
     *            the current value of the <code>commissionPercent</code> property.
     */
    public void setCommissionPercent(final BigDecimal pCommissionPercent) {
        this.commissionPercent = pCommissionPercent;
    }

    /**
     * Sets the <code>commodity</code> property.
     * <p>
     * 
     * @param pCommodity
     *            the current value of the <code>commodity</code> property.
     */
    public void setCommodity(final List<String> pCommodity) {
        this.commodity = this.covertListToUpperCase(pCommodity);
    }

    /**
     * Sets the <code>commodityRule</code> property.
     * <p>
     * 
     * @param pCommodityRule
     *            the current value of the <code>commodityRule</code> property.
     */
    public void setCommodityRule(final LogicalOperationType pCommodityRule) {
        this.commodityRule = pCommodityRule;
    }

    /**
     * Sets the <code>currencyCode</code> property.
     * <p>
     * 
     * @param pCurrencyCode
     *            the current value of the <code>currencyCode</code> property.
     */
    public void setCurrencyCode(final String pCurrencyCode) {
        this.currencyCode = ContractUtility.convertToUpperCase(pCurrencyCode);
    }

    /**
     * Sets the <code>dateRangeDto</code> property.
     * <p>
     * 
     * @param pDateRangeDto
     *            the current value of the <code>dateRangeDto</code> property.
     */
    public void setDateRangeDto(final DateRangeDto pDateRangeDto) {
        this.dateRangeDto = pDateRangeDto;
    }

    /**
     * Sets the <code>error</code> details.
     * <p>
     * 
     * @param pError
     *            holds the new value of <code>error</code> type details.<br>
     */
    public void setError(final boolean pError) {
        this.error = pError;
    }

    /**
     * Sets the <code>expirationInd</code> property.
     * <p>
     * 
     * @param pExpirationInd
     *            the current value of the <code>expirationInd</code> property.
     */
    public void setExpirationInd(boolean pExpirationInd) {
        this.expirationInd = pExpirationInd;
    }

    /**
     * Sets the <code>firstCarrierIndicator</code> property.
     * <p>
     * 
     * @param pFirstCarrierIndicator
     *            the current value of the <code>firstCarrierIndicator</code> property.
     */
    public void setFirstCarrierIndicator(final boolean pFirstCarrierIndicator) {
        this.firstCarrierIndicator = pFirstCarrierIndicator;
    }

    /**
     * Sets the <code>flightNumber</code> property.
     * <p>
     * 
     * @param pFlightNumber
     *            the current value of the <code>flightNumber</code> property.
     */
    public void setFlightNumber(final List<String> pFlightNumber) {
        this.flightNumber = this.covertListToUpperCase(pFlightNumber);
    }

    /**
     * Sets the <code>flightNumberRule</code> property.
     * <p>
     * 
     * @param pFlightNumberRule
     *            the current value of the <code>flightNumberRule</code> property.
     */
    public void setFlightNumberRule(final LogicalOperationType pFlightNumberRule) {
        this.flightNumberRule = pFlightNumberRule;
    }

    /**
     * Sets the <code>intermediateCarrierIndicator</code> property.
     * <p>
     * 
     * @param pIntermediateCarrierIndicator
     *            the current value of the <code>intermediateCarrierIndicator</code> property.
     */
    public void setIntermediateCarrierIndicator(
                final boolean pIntermediateCarrierIndicator) {
        this.intermediateCarrierIndicator = pIntermediateCarrierIndicator;
    }

    /**
     * Sets the <code>lastCarrierIndicator</code> property.
     * <p>
     * 
     * @param pLastCarrierIndicator
     *            the current value of the <code>lastCarrierIndicator</code> property.
     */
    public void setLastCarrierIndicator(final boolean pLastCarrierIndicator) {
        this.lastCarrierIndicator = pLastCarrierIndicator;
    }

    /**
     * Sets the <code>maximumAmount</code> property.
     * <p>
     * 
     * @param pMaximumAmount
     *            the current value of the <code>maximumAmount</code> property.
     */
    public void setMaximumAmount(final BigDecimal pMaximumAmount) {
        this.maximumAmount = pMaximumAmount;
    }

    /**
     * Sets the <code>maximumPercent</code> property.
     * <p>
     * 
     * @param pMaximumPercent
     *            the current value of the <code>maximumPercent</code> property.
     */
    public void setMaximumPercent(final BigDecimal pMaximumPercent) {
        this.maximumPercent = pMaximumPercent;
    }

    /**
     * Sets the <code>maximumWeight</code> property.
     * <p>
     * 
     * @param pMaximumWeight
     *            the current value of the <code>maximumWeight</code> property.
     */
    public void setMaximumWeight(final BigDecimal pMaximumWeight) {
        this.maximumWeight = pMaximumWeight;
    }

    /**
     * Sets the <code>minimumAmount</code> property.
     * <p>
     * 
     * @param pMinimumAmount
     *            the current value of the <code>minimumAmount</code> property.
     */
    public void setMinimumAmount(final BigDecimal pMinimumAmount) {
        this.minimumAmount = pMinimumAmount;
    }

    /**
     * Sets the <code>minimumPercent</code> property.
     * <p>
     * 
     * @param pMinimumPercent
     *            the current value of the <code>minimumPercent</code> property.
     */
    public void setMinimumPercent(final BigDecimal pMinimumPercent) {
        this.minimumPercent = pMinimumPercent;
    }

    /**
     * Sets the <code>minimumWeight</code> property.
     * <p>
     * 
     * @param pMinimumWeight
     *            the current value of the <code>minimumWeight</code> property.
     */
    public void setMinimumWeight(final BigDecimal pMinimumWeight) {
        this.minimumWeight = pMinimumWeight;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>otherChargeCode</code> property.
     * <p>
     * 
     * @param pOtherChargeCode
     *            the current value of the <code>otherChargeCode</code> property.
     */
    public void setOtherChargeCode(final List<String> pOtherChargeCode) {
        this.otherChargeCode = this.covertListToUpperCase(pOtherChargeCode);
    }

    /**
     * Sets the <code>otherChargeRule</code> property.
     * <p>
     * 
     * @param pOtherChargeRule
     *            the current value of the <code>otherChargeRule</code> property.
     */
    public void setOtherChargeRule(
                final OtherChargeCodeDecideType pOtherChargeRule) {
        this.otherChargeRule = pOtherChargeRule;
    }

    /**
     * Sets the <code>overPivotRate</code> property.
     * <p>
     * 
     * @param pOverPivotRate
     *            the current value of the <code>overPivotRate</code> property.
     */
    public void setOverPivotRate(final BigDecimal pOverPivotRate) {
        this.overPivotRate = pOverPivotRate;
    }

    /**
     * Sets the <code>pivotWeight</code> property.
     * <p>
     * 
     * @param pPivotWeight
     *            the current value of the <code>pivotWeight</code> property.
     */
    public void setPivotWeight(final BigDecimal pPivotWeight) {
        this.pivotWeight = pPivotWeight;
    }

    /**
     * Sets the <code>productCode</code> property.
     * <p>
     * 
     * @param pProductCode
     *            the current value of the <code>productCode</code> property.
     */
    public void setProductCode(final List<String> pProductCode) {
        this.productCode = this.covertListToUpperCase(pProductCode);
    }

    /**
     * Sets the <code>productRule</code> property.
     * <p>
     * 
     * @param pProductRule
     *            the current value of the <code>productRule</code> property.
     */
    public void setProductRule(final LogicalOperationType pProductRule) {
        this.productRule = pProductRule;
    }

    /**
     * Sets the <code>prorateId</code> property.
     * <p>
     * 
     * @param pProrateId
     *            the current value of the <code>prorateId</code> property.
     */
    public void setProrateId(final Long pProrateId) {
        this.prorateId = pProrateId;
    }

    /**
     * Sets the <code>provisoClass</code> property.
     * <p>
     * 
     * @param pProvisoClass
     *            the current value of the <code>provisoClass</code> property.
     */
    public void setProvisoClass(final String pProvisoClass) {
        this.provisoClass = ContractUtility.convertToUpperCase(pProvisoClass);
    }

    /**
     * Sets the <code>provisotype</code> property.
     * <p>
     * 
     * @param pProvisotype
     *            the current value of the <code>provisotype</code> property.
     */
    public void setProvisotype(final ProvisoType pProvisotype) {
        this.provisotype = pProvisotype;
    }

    /**
     * Sets the <code>rate</code> property.
     * <p>
     * 
     * @param pRate
     *            the current value of the <code>rate</code> property.
     */
    public void setRate(final BigDecimal pRate) {
        this.rate = pRate;
    }

    /**
     * Sets the <code>rateBasedOn</code> property.
     * <p>
     * 
     * @param pRateBasedOn
     *            the current value of the <code>rateBasedOn</code> property.
     */
    public void setRateBasedOn(final RateBasedOnType pRateBasedOn) {
        this.rateBasedOn = pRateBasedOn;
    }

    /**
     * Sets the <code>segmentDestination</code> property.
     * <p>
     * 
     * @param pSegmentDestination
     *            the current value of the <code>segmentDestination</code> property.
     */
    public void setSegmentDestination(
                final GeographicDataDto pSegmentDestination) {
        this.segmentDestination = pSegmentDestination;
    }

    /**
     * Sets the <code>segmentOrigin</code> property.
     * <p>
     * 
     * @param pSegmentOrigin
     *            the current value of the <code>segmentOrigin</code> property.
     */
    public void setSegmentOrigin(final GeographicDataDto pSegmentOrigin) {
        this.segmentOrigin = pSegmentOrigin;
    }

    /**
     * Sets the <code>specialHandlingCodes</code> property.
     * <p>
     * 
     * @param pSpecialHandlingCodes
     *            the current value of the <code>specialHandlingCodes</code> property.
     */
    public void setSpecialHandlingCodes(final List<String> pSpecialHandlingCodes) {
        this.specialHandlingCodes = this
                    .covertListToUpperCase(pSpecialHandlingCodes);
    }

    /**
     * Sets the <code>splCodeRule</code> property.
     * <p>
     * 
     * @param pSplCodeRule
     *            the current value of the <code>splCodeRule</code> property.
     */
    public void setSplCodeRule(final LogicalOperationType pSplCodeRule) {
        this.splCodeRule = pSplCodeRule;
    }

    /**
     * Sets the <code>status</code> property.
     * <p>
     * 
     * @param pStatus
     *            the current value of the <code>status</code> property.
     */
    public void setStatus(final StatusType pStatus) {
        this.status = pStatus;
    }

    /**
     * Sets the <code>tc1Indicator</code> property.
     * <p>
     * 
     * @param pTc1Indicator
     *            the current value of the <code>tc1Indicator</code> property.
     */
    public void setTc1Indicator(final boolean pTc1Indicator) {
        this.tc1Indicator = pTc1Indicator;
    }

    /**
     * Sets the <code>tc2Indicator</code> property.
     * <p>
     * 
     * @param pTc2Indicator
     *            the current value of the <code>tc2Indicator</code> property.
     */
    public void setTc2Indicator(final boolean pTc2Indicator) {
        this.tc2Indicator = pTc2Indicator;
    }

    /**
     * Sets the <code>tc3Indicator</code> property.
     * <p>
     * 
     * @param pTc3Indicator
     *            the current value of the <code>tc3Indicator</code> property.
     */
    public void setTc3Indicator(final boolean pTc3Indicator) {
        this.tc3Indicator = pTc3Indicator;
    }

    /**
     * Sets the <code>transatlanticIndicator</code> property.
     * <p>
     * 
     * @param pTransatlanticIndicator
     *            the current value of the <code>transatlanticIndicator</code> property.
     */
    public void setTransatlanticIndicator(final boolean pTransatlanticIndicator) {
        this.transatlanticIndicator = pTransatlanticIndicator;
    }

    /**
     * Sets the <code>transpacificIndicator</code> property.
     * <p>
     * 
     * @param pTranspacificIndicator
     *            the current value of the <code>transpacificIndicator</code> property.
     */
    public void setTranspacificIndicator(final boolean pTranspacificIndicator) {
        this.transpacificIndicator = pTranspacificIndicator;
    }

    /**
     * Sets the <code>uldType</code> property.
     * <p>
     * 
     * @param pUldType
     *            the current value of the <code>uldType</code> property.
     */
    public void setUldType(final List<String> pUldType) {
        this.uldType = this.covertListToUpperCase(pUldType);
    }

    /**
     * Sets the <code>uldTypeRule</code> property.
     * <p>
     * 
     * @param pUldTypeRule
     *            the current value of the <code>uldTypeRule</code> property.
     */
    public void setUldTypeRule(final LogicalOperationType pUldTypeRule) {
        this.uldTypeRule = pUldTypeRule;
    }
    

    /**
     * Sets the <code>uldTypeRule</code> property.
     * <p>
     * 
     * @param pUldTypeRule
     *            the current value of the <code>uldTypeRule</code> property.
     */
    public void setroutingRule(final LogicalOperationType pRoutingRule) {
        this.routingRule = pRoutingRule;
    }
    /**
     * Sets the <code>userAudit</code> property.
     * <p>
     * 
     * @param pUserAudit
     *            the current value of the <code>userAudit</code> property.
     */
    public void setUserAudit(final UserAuditDto pUserAudit) {
        this.userAudit = pUserAudit;
    }

    /**
     * Sets the <code>weightType</code> property.
     * <p>
     * 
     * @param pWeightType
     *            the current value of the <code>weightType</code> property.
     */
    public void setWeightType(final WeightType pWeightType) {
        this.weightType = pWeightType;
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

    /**
     * Creates the String representation of <code>InterlineAgreement Entry</code>.
     * <p>
     * This will return the String representation based on InterlineAgreement Entry.
     * <p>
     * 
     * @return the String representation of <code>InterlineAgreement Entry</code>.
     */
    public String toString() {
        String csvString = new String();

        if (AgreementType.PROVISO.equals(this.getAgreementType())) {

            csvString = this.buildProvisoCSVString();
        }
        else if (AgreementType.PRORATE.equals(this.getAgreementType())) {
            csvString = this.buildProrateCSVString();
        }

        return csvString;

    }

    /**
     * This methods builds the string for given rule.
     * 
     * @param pRule
     *            the logical operationtype.
     * @param pCodes
     *            the list of <code>code</code>'s.
     * 
     * @return aRuleString the new string value of given <code>rule</code>.
     * 
     */
    private String buildLogicalRuleString(final LogicalOperationType pRule,
                final List<String> pCodes) {
        String aRuleString = FrameworkConstants.EMPTY_STRING;

        if (pCodes != null && !pCodes.isEmpty()) {
            if (LogicalOperationType.AND.equals(pRule)) {
                aRuleString = LogicalOperationType.AND.getLabel();
            }
            else if (LogicalOperationType.NOT.equals(pRule)) {
                aRuleString = LogicalOperationType.NOT.getLabel();
            }
            else if (LogicalOperationType.OR.equals(pRule)) {
                aRuleString = LogicalOperationType.OR.getLabel();
            }
        }

        return aRuleString;
    }

    /**
     * This methods builds the string for given rule.
     * 
     * @param pOtherChargeRule
     *            the other changrecode decidetype.
     * @param pCodes
     *            the list of <code>code</code>'s.
     * 
     * @return aRuleString the new string value of given <code>rule</code>.
     * 
     */
    private String buildOtherChargeRuleString(
                final OtherChargeCodeDecideType pOtherChargeRule,
                final List<String> pCodes) {
        String aRuleString = FrameworkConstants.EMPTY_STRING;

        if (pCodes != null && !pCodes.isEmpty()) {
            if (OtherChargeCodeDecideType.ONLINE_MAINTENANCE
                        .equals(pOtherChargeRule)) {
                aRuleString = OtherChargeCodeDecideType.ONLINE_MAINTENANCE
                            .getLabel();
            }
            else if (OtherChargeCodeDecideType.SPA_LIST
                        .equals(pOtherChargeRule)) {
                aRuleString = OtherChargeCodeDecideType.SPA_LIST.getLabel();
            }
            else if (OtherChargeCodeDecideType.BOTH.equals(pOtherChargeRule)) {
                final StringBuffer theRule = new StringBuffer();
                theRule.append(OtherChargeCodeDecideType.ONLINE_MAINTENANCE
                            .getLabel());
                theRule.append(WHITE_SPACE);
                theRule.append(AND_SPL_CHAR);
                theRule.append(WHITE_SPACE);
                theRule.append(OtherChargeCodeDecideType.SPA_LIST.getLabel());
                aRuleString = theRule.toString();
            }
        }

        return aRuleString;
    }

    /**
     * Creates the String representation of <code>Interline Prorate entry</code> .
     * <p>
     * This will return the String representation based on Interline Prorate entry.
     * <p>
     * 
     * @return the String representation of <code>Interline Prorate entry</code> .
     */
    private String buildProrateCSVString() {
        final StringBuffer csvString = new StringBuffer();

        if (this.getProrateId().toString().length() < 7) {
            String aProrateId = this.getProrateId().toString();
            for (int i = aProrateId.length(); i < 7; i++) {
                aProrateId = String.valueOf("0").concat(aProrateId);
            }
            csvString.append("\"");
            csvString.append(aProrateId);
            csvString.append("\"");
            csvString.append(",");
        }
        if (this.getSegmentOrigin().getCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getSegmentOrigin()
                        .getCode()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        csvString.append(this.prefixSuffixByQuotes(this
                    .readBooleanAsString(this.getAllOriginInd())));

        if (this.getSegmentDestination().getCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getSegmentDestination()
                        .getCode()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        csvString.append(this.prefixSuffixByQuotes(this
                    .readBooleanAsString(this.getAllDestinationInd())));

        csvString.append(this.prefixSuffixByQuotes(this
                    .readBooleanAsString(this.getBiDirectional())));

        csvString.append(this.prefixSuffixByQuotes(this.buildLogicalRuleString(
            this.getProductRule(), this.getProductCode())));
        if (this.getProductCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this
                        .formatCodesForDownload(this.getProductCode())));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this.buildLogicalRuleString(
            this.getFlightNumberRule(), this.getFlightNumber())));
        if (this.getFlightNumber() != null) {
            csvString.append(this.prefixSuffixByQuotes(this
                        .formatCodesForDownload(this.getFlightNumber())));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this.buildLogicalRuleString(
            this.getCommodityRule(), this.getCommodity())));
        if (this.getCommodity() != null) {
            csvString.append(this.prefixSuffixByQuotes(this
                        .formatCodesForDownload(this.getCommodity())));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this
                    .buildOtherChargeRuleString(this.getOtherChargeRule(),
                        this.getOtherChargeCode())));
        if (this.getOtherChargeCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this
                        .formatCodesForDownload(this.getOtherChargeCode())));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this.buildLogicalRuleString(
            this.getSplCodeRule(), this.getSpecialHandlingCodes())));
        if (this.getSpecialHandlingCodes() != null) {
            csvString.append(this.prefixSuffixByQuotes(this
                        .formatCodesForDownload(this.getSpecialHandlingCodes())));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this.buildLogicalRuleString(
            this.getUldTypeRule(), this.getUldType())));
        if (this.getUldType() != null) {
            csvString.append(this.prefixSuffixByQuotes(this
                        .formatCodesForDownload(this.getUldType())));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getMinimumWeight() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getMinimumWeight()
                        .toString()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getMaximumWeight() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getMaximumWeight()
                        .toString()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getWeightType() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getWeightType()
                        .getWeightType()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getRateBasedOn() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getRateBasedOn()
                        .getRate()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this.getCurrencyCode()));
        csvString.append(this.prefixSuffixByQuotes(this.getRate().toString()));
        if (this.getWeightUnit() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getWeightUnit()
                        .getWeightUnit()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getCommissionPercent() != null) {
            csvString.append(this.prefixSuffixByQuotes(this
                        .getCommissionPercent().toString()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getPivotWeight() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getPivotWeight()
                        .toString()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getOverPivotRate() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getOverPivotRate()
                        .toString()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this.dateToString(this
                    .getDateRangeDto().getEffectiveDate())));
        if (this.getDateRangeDto().getExpirationDate() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.dateToString(this
                        .getDateRangeDto().getExpirationDate())));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(INDEF));
        }

        if (this.getUserAudit() != null) {
            if (this.getUserAudit().getCreatedOn() != null) {
                csvString.append(this.prefixSuffixByQuotes(this
                            .dateToString(this.getUserAudit().getCreatedOn())));
            }
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            csvString.append(this.prefixSuffixByQuotes(this.getUserAudit()
                        .getUserIdentifier()));
            csvString.append(this.prefixSuffixByQuotes(this.getUserAudit()
                        .getAssociatedOffice()));
            csvString.append(this.prefixSuffixByQuotes(this.getUserAudit()
                        .getAssociatedStation()));
        }

        return csvString.toString();
    }

    /**
     * Creates the String representation of <code>Interline Proviso Entry</code> .
     * <p>
     * This will return the String representation based on Interline Proviso Entry.
     * <p>
     * 
     * @return the String representation of <code>Interline Proviso Entry</code> .
     */
    private String buildProvisoCSVString() {
        final StringBuffer csvString = new StringBuffer();

        if (this.getProrateId().toString().length() < 7) {
            String aProrateId = this.getProrateId().toString();
            for (int i = aProrateId.length(); i < 7; i++) {
                aProrateId = String.valueOf("0").concat(aProrateId);
            }
            csvString.append("\"");
            csvString.append(aProrateId);
            csvString.append("\"");
            csvString.append(",");
        }
        if (this.getSegmentOrigin().getCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getSegmentOrigin()
                        .getCode()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        csvString.append(this.prefixSuffixByQuotes(this
                    .readBooleanAsString(this.getAllOriginInd())));

        if (this.getSegmentDestination().getCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getSegmentDestination()
                        .getCode()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        csvString.append(this.prefixSuffixByQuotes(this
                    .readBooleanAsString(this.getAllDestinationInd())));
        
        if (this.getProvisoClass() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getProvisoClass()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this
                    .readBooleanAsString(this.getBiDirectional())));
        if (this.getProvisotype() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getProvisotype()
                        .getProviso()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this.buildLogicalRuleString(
            this.getProductRule(), this.getProductCode())));
        if (this.getProductCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this
                        .formatCodesForDownload(this.getProductCode())));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this.buildLogicalRuleString(
            this.getSplCodeRule(), this.getSpecialHandlingCodes())));
        if (this.getSpecialHandlingCodes() != null) {
            csvString.append(this.prefixSuffixByQuotes(this
                        .formatCodesForDownload(this.getSpecialHandlingCodes())));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this.buildLogicalRuleString(
            this.getCommodityRule(), this.getCommodity())));
        if (this.getCommodity() != null) {
            csvString.append(this.prefixSuffixByQuotes(this
                        .formatCodesForDownload(this.getCommodity())));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this.buildLogicalRuleString(
            this.getUldTypeRule(), this.getUldType())));
        if (this.getUldType() != null) {
            csvString.append(this.prefixSuffixByQuotes(this
                        .formatCodesForDownload(this.getUldType())));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this
                    .readBooleanAsString(this.getFirstCarrierIndicator())));
        csvString.append(this.prefixSuffixByQuotes(this
                    .readBooleanAsString(this.getIntermediateCarrierIndicator())));
        csvString.append(this.prefixSuffixByQuotes(this
                    .readBooleanAsString(this.getLastCarrierIndicator())));
        csvString.append(this.prefixSuffixByQuotes(this
                    .readBooleanAsString(this.getTransatlanticIndicator())));
        csvString.append(this.prefixSuffixByQuotes(this
                    .readBooleanAsString(this.getTranspacificIndicator())));
        csvString.append(this.prefixSuffixByQuotes(this
                    .readBooleanAsString(this.getTc1Indicator())));
        csvString.append(this.prefixSuffixByQuotes(this
                    .readBooleanAsString(this.getTc2Indicator())));
        csvString.append(this.prefixSuffixByQuotes(this
                    .readBooleanAsString(this.getTc3Indicator())));
        if (this.getMinimumWeight() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getMinimumWeight()
                        .toString()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getMaximumWeight() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getMaximumWeight()
                        .toString()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getWeightType() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getWeightType()
                        .getWeightType()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getRateBasedOn() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getRateBasedOn()
                        .getRate()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this.getCurrencyCode()));
        csvString.append(this.prefixSuffixByQuotes(this.getRate().toString()));
        if (this.getWeightUnit() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getWeightUnit()
                        .getWeightUnit()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getMinimumAmount() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getMinimumAmount()
                        .toString()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getMaximumAmount() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getMaximumAmount()
                        .toString()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getMinimumPercent() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getMinimumPercent()
                        .toString()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getMaximumPercent() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getMaximumPercent()
                        .toString()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getCommissionPercent() != null) {
            csvString.append(this.prefixSuffixByQuotes(this
                        .getCommissionPercent().toString()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this.dateToString(this
                    .getDateRangeDto().getEffectiveDate())));
        if (this.getDateRangeDto().getExpirationDate() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.dateToString(this
                        .getDateRangeDto().getExpirationDate())));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(INDEF));
        }
        if (this.getUserAudit() != null) {
            if (this.getUserAudit().getCreatedOn() != null) {
                csvString.append(this.prefixSuffixByQuotes(this
                            .dateToString(this.getUserAudit().getCreatedOn())));
            }
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            csvString.append(this.prefixSuffixByQuotes(this.getUserAudit()
                        .getUserIdentifier()));
            csvString.append(this.prefixSuffixByQuotes(this.getUserAudit()
                        .getAssociatedOffice()));
            csvString.append(this.prefixSuffixByQuotes(this.getUserAudit()
                        .getAssociatedStation()));
        }

        return csvString.toString();
    }

    /**
     * This methods converts the input code's to uppercase.
     * 
     * @param pList
     *            the list of <code>code</code>'s.
     * 
     * @return aNewList the list of uppercase <code>code</code>'s.
     * 
     */
    private List<String> covertListToUpperCase(final List<String> pList) {
        final List<String> aNewList = new ArrayList<String>();
        String anUpperCaseString = null;
        if (pList != null) {
            for (String aCode : pList) {
                anUpperCaseString = ContractUtility.convertToUpperCase(aCode);
                aNewList.add(anUpperCaseString);
            }
        }
        return aNewList;
    }

    /**
     * Converts given date object into equivalent String object.
     * 
     * @param pDate
     *            the date object.
     * 
     * @return String value of the <code>pDate</code>.
     * 
     */
    private String dateToString(final Date pDate) {
        final Format aSimpleDateFormat = new SimpleDateFormat(
                    FrameworkConstants.DATEFORMAT, Locale.UK);
        return ContractUtility.convertToUpperCase(aSimpleDateFormat
                    .format(pDate));
    }
    
    /**
     * validates two list having string values .
     * <p>
     * 
     * @param pList1
     *            holds the first list of string.
     * @param pList2
     *            holds the second list of string.
     * @return <ul>
     *         <li> <code>true</code>
     *         <p>
     *         if two are matched </li> <li> <code>false</code>
     *         <p>
     *         otherwise</li>
     *         </ul>
     */
    private boolean equalsTwoList(final List<String> pList1,
                final List<String> pList2, final LogicalOperationType pRule1,
                final LogicalOperationType pRule2) {
        boolean isMatched = false;

        // for blank entries
        if ((pList1 == null || (pList1 != null && pList1.isEmpty()))
                    || (pList2 == null || (pList2 != null && pList2.isEmpty()))) {
            isMatched = true;
        }
        else {
            if (LogicalOperationType.OR.equals(pRule1)
                        && LogicalOperationType.OR.equals(pRule2)) {
                for (String aCode : pList1) {
                    if (pList2.contains(aCode)) {
                        isMatched = true;
                        break;
                    }
                }
            }
            else if (LogicalOperationType.OR.equals(pRule1)
                        && LogicalOperationType.NOT.equals(pRule2)) {
                for (String aCode : pList1) {
                    if (!pList2.contains(aCode)) {
                        isMatched = true;
                        break;
                    }
                }
            }

            // TODO not - any
            else if (LogicalOperationType.NOT.equals(pRule1)
                        && LogicalOperationType.OR.equals(pRule2)) {
                for (String aCode : pList2) {
                    if (!pList1.contains(aCode)) {
                        isMatched = true;
                        break;
                    }
                }
            }

            // in doubt
            else if (LogicalOperationType.OR.equals(pRule1)
                        && LogicalOperationType.AND.equals(pRule2)) {
                if (pList1.containsAll(pList2)) {
                    isMatched = true;
                }
            }

            //

            // TODO in doubt all - any
            else if (LogicalOperationType.AND.equals(pRule1)
                        && LogicalOperationType.OR.equals(pRule2)) {
                if (pList2.containsAll(pList1)) {
                    isMatched = true;
                }
            }

            else if (LogicalOperationType.AND.equals(pRule1)
                        && LogicalOperationType.AND.equals(pRule2)) {
                if (pList1.containsAll(pList2) || pList2.containsAll(pList1)) {
                    isMatched = true;
                }
            }

            // for Any to Not condition, we need to check if none of the values
            // are present in second entry,
            // then it says the second entry is having duplicates.
            // eg:firstEntry= {AAA,ADC,AGE}
            // second entry = {BDS,ADC}
            // in above example second entry has duplicates only if no values
            // from first entry repeats in
            // second entry.

            else if (LogicalOperationType.AND.equals(pRule1)
                        && LogicalOperationType.NOT.equals(pRule2)) {

                if (!pList2.containsAll(pList1)) {
                    isMatched = true;
                }
            }

            // TODO not and all
            else if (LogicalOperationType.NOT.equals(pRule1)
                        && LogicalOperationType.AND.equals(pRule2)) {

                if (!pList1.containsAll(pList2)) {
                    isMatched = true;
                }
            }

            else if (LogicalOperationType.NOT.equals(pRule1)
                        && LogicalOperationType.NOT.equals(pRule2)) {
                isMatched = true;
            }
        }

        return isMatched;
    }
    
    /**
     * prefixes and suffixes a given string with open quotes.
     * 
     * @param pString
     *            the new value of the <code>value</code>.
     * 
     * @return aModifiedString the new value of the <code>aModifiedString</code> .
     * 
     */
    private String prefixSuffixByQuotes(final String pString) {
        final String aQUOTATION = "\"";
        final String aCOMMA = ",";

        final StringBuffer aModifiedString = new StringBuffer();
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(pString);
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(aCOMMA);

        return aModifiedString.toString();
    }
    
    /**
     * This methods gets the boolean input and gives the String (Yes/No).
     * 
     * @param pIndicator
     *            the value of the <code>indicator</code>.
     * 
     * @return aString the value of the given <code>indicator</code>.
     * 
     * 
     */
    private String readBooleanAsString(final boolean pIndicator) {
        String aString = NO_LITERAL;
        if (pIndicator) {
            aString = YES_LITERAL;
        }
        return aString;
    }
//modified as part of CTC 11817394.  
    public String getAwbNumberAsString() {
    	String currAwbNumber = null;
    	List<String> AwbnumberList = new ArrayList<String>();
    	if((this.getaccNos() !=null && this.getAwbNumber()!=null )&&!(this.getaccNos().isEmpty() && this.getAwbNumber().isEmpty())){
    		for(String accno:this.getaccNos()){
    			for(String awbNumber:this.getAwbNumber()){
    				currAwbNumber = accno.concat(awbNumber);
    				AwbnumberList.add(currAwbNumber);
    			}
    		}
    	}

       return this.formatCodesForDisplay(AwbnumberList); 
    }
}
