package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.constants.RequestRulesType;

public class PLTRulesDto extends PersistenceObjectDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// For Goods acceptance
	private boolean slULDIndicator;

	private Integer pieceCountForPcsExist;

	private Integer alreadyAcceptedPcsCount;

	private Integer alreadyAcceptedLooseGoodsCount;

	private Integer noOfPieceAtLocation;

	private boolean verificationCheck;

	private boolean barcodeLabelPrintReq;

	private RequestRulesType requestType;
	
	private String discrepancyType;
	
	private boolean cancelInd;
	
	private BigDecimal acceptedWeight;
	
	private BigDecimal acceptedVolume;

	/*    *//**
			 * Attribute to hold <code>capacity</code> property.
			 */
	/*
	 * private PLTCapacityDto capacity;
	 * 
	 *//**
		 * Gets the <code>capacity</code> property.
		 * <p>
		 * 
		 * @return the current value of the <code>capacity</code> property.
		 */

	/*
	 * public PLTCapacityDto getCapacity() { if (this.capacity == null) {
	 * this.capacity = new PLTCapacityDto(); } return this.capacity; }
	 * 
	 *//**
		 * Sets the <code>capacity</code> property.
		 * <p>
		 * 
		 * @param pCapacity the current value of the <code>capacity</code> property.
		 *//*
			 * public void setCapacity(final PLTCapacityDto pCapacity) { this.capacity =
			 * pCapacity; }
			 */

	public boolean isSlULDIndicator() {
		return slULDIndicator;
	}

	public void setSlULDIndicator(boolean slULDIndicator) {
		this.slULDIndicator = slULDIndicator;
	}

	public Integer getPieceCountForPcsExist() {
		return pieceCountForPcsExist;
	}

	public void setPieceCountForPcsExist(Integer pieceCountForPcsExist) {
		this.pieceCountForPcsExist = pieceCountForPcsExist;
	}

	public Integer getAlreadyAcceptedPcsCount() {
		return alreadyAcceptedPcsCount;
	}

	public void setAlreadyAcceptedPcsCount(Integer alreadyAcceptedPcsCount) {
		this.alreadyAcceptedPcsCount = alreadyAcceptedPcsCount;
	}

	public Integer getAlreadyAcceptedLooseGoodsCount() {
		return alreadyAcceptedLooseGoodsCount;
	}

	public void setAlreadyAcceptedLooseGoodsCount(Integer alreadyAcceptedLooseGoodsCount) {
		this.alreadyAcceptedLooseGoodsCount = alreadyAcceptedLooseGoodsCount;
	}

	public Integer getNoOfPieceAtLocation() {
		return noOfPieceAtLocation;
	}

	public void setNoOfPieceAtLocation(Integer noOfPieceAtLocation) {
		this.noOfPieceAtLocation = noOfPieceAtLocation;
	}

	public boolean isVerificationCheck() {
		return verificationCheck;
	}

	public void setVerificationCheck(boolean verificationCheck) {
		this.verificationCheck = verificationCheck;
	}

	public boolean isBarcodeLabelPrintReq() {
		return barcodeLabelPrintReq;
	}

	public void setBarcodeLabelPrintReq(boolean barcodeLabelPrintReq) {
		this.barcodeLabelPrintReq = barcodeLabelPrintReq;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}

	public RequestRulesType getRequestType() {
		return requestType;
	}

	public void setRequestType(RequestRulesType requestType) {
		this.requestType = requestType;
	}

	public String getDiscrepancyType() {
		return discrepancyType;
	}

	public void setDiscrepancyType(String discrepancyType) {
		this.discrepancyType = discrepancyType;
	}

	/**
	 * @return the cancelInd
	 */
	public boolean getCancelInd() {
		return this.cancelInd;
	}

	/**
	 * @param cancelInd the cancelInd to set
	 */
	public void setCancelInd(final boolean pCancelInd) {
		this.cancelInd = pCancelInd;
	}

	/**
	 * @return the acceptedWeight
	 */
	public BigDecimal getAcceptedWeight() {
		return this.acceptedWeight;
	}

	/**
	 * @param pAcceptedWeight the acceptedWeight to set
	 */
	public void setAcceptedWeight(final BigDecimal pAcceptedWeight) {
		this.acceptedWeight = pAcceptedWeight;
	}

	/**
	 * @return the acceptedVolume
	 */
	public BigDecimal getAcceptedVolume() {
		return this.acceptedVolume;
	}

	/**
	 * @param pAcceptedVolume the acceptedVolume to set
	 */
	public void setAcceptedVolume(final BigDecimal pAcceptedVolume) {
		this.acceptedVolume = pAcceptedVolume;
	}

}
