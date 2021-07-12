package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.exception.CodeMessage;

public class PLTRulesResponseDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6777428619873726833L;
	private boolean isPLTEnable;
	private boolean isVerificationRequired;
	private boolean isOptionalIndicator;
	private boolean isPLTEnforcementEnable;
	private String responseType;
	private String enforceResponseType;
	private String responseLineType;
	private String actionType ;
	private Map<String,List<PieceIdDetailDto>> associatedPieceIdDetailMap;
	private String dbKey;
	private String subType;
	
	private CodeMessage codeMessage;
	
	private List<PieceIdDetailDto> pieceIdDetailDtos;
	
	private String pieceIDStatusSelectionDisplay;
	
	private String enforcementEnableInd;
	
	private BigDecimal totalWeight;
	
	private BigDecimal totalVolume;
	
	private String enforcementStatus;
	
	private boolean partialAcceptance;
	
	public boolean isPLTEnforcementEnable() {
		return isPLTEnforcementEnable;
	}

	public void setPLTEnforcementEnable(boolean pIsPLTEnforcementEnable) {
		this.isPLTEnforcementEnable = pIsPLTEnforcementEnable;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String pSubType) {
		this.subType = pSubType;
	}

	public String getDbKey() {
		return dbKey;
	}

	public void setDbKey(String pDbKey) {
		this.dbKey = pDbKey;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String pActionType) {
		this.actionType = pActionType;
	}

	public Map<String, List<PieceIdDetailDto>> getAssociatedPieceIdDetailMap() {
		return associatedPieceIdDetailMap;
	}

	public void setAssociatedPieceIdDetailMap(Map<String, List<PieceIdDetailDto>> pAssociatedPieceIdDetailMap) {
		this.associatedPieceIdDetailMap = pAssociatedPieceIdDetailMap;
	}

	public String getEnforceResponseType() {
		return enforceResponseType;
	}

	public void setEnforceResponseType(String pEnforceResponseType) {
		this.enforceResponseType = pEnforceResponseType;
	}

	public String getResponseLineType() {
		return responseLineType;
	}

	public void setResponseLineType(String pResponseLineType) {
		this.responseLineType = pResponseLineType;
	}

	public boolean isPLTEnable() {
		return isPLTEnable;
	}

	public void setPLTEnable(boolean pIsPLTEnable) {
		this.isPLTEnable = pIsPLTEnable;
	}

	public boolean isVerificationRequired() {
		return isVerificationRequired;
	}

	public void setVerificationRequired(boolean pIsVerificationRequired) {
		this.isVerificationRequired = pIsVerificationRequired;
	}

	public boolean isOptionalIndicator() {
		return isOptionalIndicator;
	}

	public void setOptionalIndicator(boolean pIsOptionalIndicator) {
		this.isOptionalIndicator = pIsOptionalIndicator;
	}

	public String getResponseType() {
		return responseType;
	}

	public void setResponseType(String pResponseType) {
		this.responseType = pResponseType;
	}

	/**
	 * @return the codeMessage
	 */
	public CodeMessage getCodeMessage() {
		return this.codeMessage;
	}

	/**
	 * @param codeMessage the codeMessage to set
	 */
	public void setCodeMessage(final CodeMessage pCodeMessage) {
		this.codeMessage = pCodeMessage;
	}

	/**
	 * @return the pieceIdDetailDtos
	 */
	public List<PieceIdDetailDto> getPieceIdDetailDtos() {
		return pieceIdDetailDtos;
	}

	/**
	 * @param pPieceIdDetailDtos the pieceIdDetailDtos to set
	 */
	public void setPieceIdDetailDtos(List<PieceIdDetailDto> pPieceIdDetailDtos) {
		this.pieceIdDetailDtos = pPieceIdDetailDtos;
	}

	/**
	 * @return the pieceIDStatusSelectionDisplay
	 */
	public String getPieceIDStatusSelectionDisplay() {
		return pieceIDStatusSelectionDisplay;
	}

	/**
	 * @param pPieceIDStatusSelectionDisplay the pieceIDStatusSelectionDisplay to set
	 */
	public void setPieceIDStatusSelectionDisplay(String pPieceIDStatusSelectionDisplay) {
		this.pieceIDStatusSelectionDisplay = pPieceIDStatusSelectionDisplay;
	}

	/**
	 * @return the enforcementEnableInd
	 */
	public String getEnforcementEnableInd() {
		return enforcementEnableInd;
	}

	/**
	 * @param pEnforcementEnableInd the enforcementEnableInd to set
	 */
	public void setEnforcementEnableInd(String pEnforcementEnableInd) {
		this.enforcementEnableInd = pEnforcementEnableInd;
	}

	/**
	 * @return the totalWeight
	 */
	public BigDecimal getTotalWeight() {
		return totalWeight;
	}

	/**
	 * @param pTotalWeight the totalWeight to set
	 */
	public void setTotalWeight(BigDecimal pTotalWeight) {
		this.totalWeight = pTotalWeight;
	}

	/**
	 * @return the totalVolume
	 */
	public BigDecimal getTotalVolume() {
		return totalVolume;
	}

	/**
	 * @param pTotalVolume the totalVolume to set
	 */
	public void setTotalVolume(BigDecimal pTotalVolume) {
		this.totalVolume = pTotalVolume;
	}

	/**
	 * @return the enforcementStatus
	 */
	public String getEnforcementStatus() {
		return enforcementStatus;
	}

	/**
	 * @param pEnforcementStatus the enforcementStatus to set
	 */
	public void setEnforcementStatus(String pEnforcementStatus) {
		this.enforcementStatus = pEnforcementStatus;
	}

	/**
	 * @return the partialAcceptance
	 */
	public boolean isPartialAcceptance() {
		return partialAcceptance;
	}

	/**
	 * @param pPartialAcceptance the partialAcceptance to set
	 */
	public void setPartialAcceptance(boolean pPartialAcceptance) {
		this.partialAcceptance = pPartialAcceptance;
	}

}
