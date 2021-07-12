package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.rating.dto.constants.RatingLineType;
import com.unisys.trans.logistics.lms.rating.dto.constants.SelectIdentifierType;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

public class SelectedPriceEntry implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SelectIdentifierType selectIdentifier;

    private String contractSraNumber;

    private int contractSraHierarchy;
    
    private boolean participantGroupIndicator;

    public int getContractSraHierarchy() {
        return this.contractSraHierarchy;
    }

    public void setContractSraHierarchy(final int pContractSraHierarchy) {
        this.contractSraHierarchy = pContractSraHierarchy;
    }

    private String participantType;

    private RateClassType rateClassCode;

    private String rateSource;

    private String rateTypeCode;

    private RatingLineType ratingLineType;

    private String ratingNoteCode;

    private String rejectIndicator;

    private int ratingLineNumber;
    // private String sraNumber;

    public String getContractSraNumber() {
        return this.contractSraNumber;
    }
    
    /**
     * @return the participantGroupIndicator
     */
    public boolean getParticipantGroupIndicator() {
        return participantGroupIndicator;
    }
    
    public String getParticipantType() {
        return this.participantType;
    }

    public RateClassType getRateClassCode() {
        return this.rateClassCode;
    }

    public String getRateSource() {
        return this.rateSource;
    }

    public String getRateTypeCode() {
        return this.rateTypeCode;
    }

    public RatingLineType getRatingLineType() {
        return this.ratingLineType;
    }

    public String getRatingNoteCode() {
        return this.ratingNoteCode;
    }

    public SelectIdentifierType getSelectIdentifier() {
        return this.selectIdentifier;
    }

    /*
     * public String getSraNumber() {
     * return this.sraNumber;
     * }
     */

    public String getRejectIndicator() {
        return this.rejectIndicator;
    }

    public void setContractSraNumber(final String pContractSraNumber) {
        this.contractSraNumber = pContractSraNumber;
    }
    
    /**
     * @param pParticipantGroupIndicator the participantGroupIndicator to set
     */
    public void setParticipantGroupIndicator(final boolean pParticipantGroupIndicator) {
        this.participantGroupIndicator = pParticipantGroupIndicator;
    }

    public void setParticipantType(final String pParticipantType) {
        this.participantType = pParticipantType;
    }

    public void setRateClassCode(final RateClassType pRateClassCode) {
        this.rateClassCode = pRateClassCode;
    }

    public void setRateSource(final String pRateSource) {
        this.rateSource = pRateSource;
    }

    public void setRateTypeCode(final String pRateTypeCode) {
        this.rateTypeCode = pRateTypeCode;
    }

    public void setRatingLineType(final RatingLineType pRatingLineType) {
        this.ratingLineType = pRatingLineType;
    }

    public void setRatingNoteCode(final String pRatingNoteCode) {
        this.ratingNoteCode = pRatingNoteCode;
    }

    public void setRejectIndicator(final String pRejectIndicator) {
        this.rejectIndicator = pRejectIndicator;
    }

    public void setSelectIdentifier(final SelectIdentifierType pSelectIdentifier) {
        this.selectIdentifier = pSelectIdentifier;
    }

	/**
	 * @return the ratingLineNumber
	 */
	public int getRatingLineNumber() {
		return ratingLineNumber;
	}

	/**
	 * @param ratingLineNumber the ratingLineNumber to set
	 */
	public void setRatingLineNumber(int pRatingLineNumber) {
		this.ratingLineNumber = pRatingLineNumber;
	}

    /*
     * public void setSraNumber(final String pSraNumber) {
     * this.sraNumber = pSraNumber;
     * }
     */

}
