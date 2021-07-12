package com.unisys.trans.logistics.lms.rating.dto.price;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.framework.exception.CodeMessage;
import com.unisys.trans.logistics.lms.rating.exception.RatingCodeMessage;

public class PricingResponse extends AbstractResponse {

    /**
	 * 
	 */
    private static final long serialVersionUID = -8950060115424943361L;

    private List<RatingCodeMessage> actCodeMessages;

    private List<RatingLineDto> actualratingLines;

    private List<RatingCodeMessage> pubCodeMessages;

    private List<RatingLineDto> publishedratingLines;
    private LoyaltyRulesDto loyaltyRulesDto;

    /**
     * @return the actCodeMessages
     */
    public List<RatingCodeMessage> getActCodeMessages() {
        return actCodeMessages;
    }

    public List<RatingLineDto> getActualratingLines() {
        return actualratingLines;
    }

    /**
     * @return the pubCodeMessages
     */
    public List<RatingCodeMessage> getPubCodeMessages() {
        return pubCodeMessages;
    }

    public List<RatingLineDto> getPublishedratingLines() {
        return publishedratingLines;
    }

    /**
     * @param pActCodeMessages
     *            the actCodeMessages to set
     */
    public void setActCodeMessages(List<RatingCodeMessage> pActCodeMessages) {
        this.actCodeMessages = pActCodeMessages;
    }

    public void setActualratingLines(List<RatingLineDto> actualratingLines) {
        this.actualratingLines = actualratingLines;
    }

    /**
     * @param pPubCodeMessages
     *            the pubCodeMessages to set
     */
    public void setPubCodeMessages(List<RatingCodeMessage> pPubCodeMessages) {
        this.pubCodeMessages = pPubCodeMessages;
    }

    public void setPublishedratingLines(List<RatingLineDto> publishedratingLines) {
        this.publishedratingLines = publishedratingLines;
    }

    /**
     * Gets the <code>loyaltyRulesDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>loyaltyRulesDto</code> property.<br>
     */
	public LoyaltyRulesDto getLoyaltyRulesDto() {
		return this.loyaltyRulesDto;
	}

    /**
     * Sets the <code>loyaltyRulesDto</code> property.
     * 
     * @param pLoyaltyRulesDto
     *            the new value of the <code>loyaltyRulesDto</code> property.
     */
	public void setLoyaltyRulesDto(final LoyaltyRulesDto pLoyaltyRulesDto) {
		this.loyaltyRulesDto = pLoyaltyRulesDto;
	}
}
