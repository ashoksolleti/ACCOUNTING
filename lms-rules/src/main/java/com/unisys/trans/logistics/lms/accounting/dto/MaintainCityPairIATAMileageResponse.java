package com.unisys.trans.logistics.lms.accounting.dto;

/**
 * 
 */


import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;



/**
 * @author ChoukseA
 *
 */
public class MaintainCityPairIATAMileageResponse extends AbstractResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<ProrateFactorDto> prorateFactorDtoList = new ArrayList<ProrateFactorDto>();
	private List<ProrateFactorDto> prorateFactorDtoListProcess = new ArrayList<ProrateFactorDto>();
	private ProrateFactorDto prorateFactorDto = new ProrateFactorDto();
	private String updateComment;
	private String duplicateProrateFactorConfirmationMessage;
	private String noRecordFoundMessage;
	private String deleteMileageDataForIATAMessage;
	private String cannotDeleteMileageDataForIATAMessage;
	private String deleteACK;
	private List<ProrateFactorErrorsDto> prorateFactorErrorsDtoList = new ArrayList<ProrateFactorErrorsDto>();
	private List<StationInformationDto> stationList = new ArrayList<StationInformationDto>();
	
	/**
	 * @return the prorateFactorDtoList
	 */
	public List<ProrateFactorDto> getProrateFactorDtoList() {
		return prorateFactorDtoList;
	}
	/**
	 * @param prorateFactorDtoList the prorateFactorDtoList to set
	 */
	public void setProrateFactorDtoList(List<ProrateFactorDto> prorateFactorDtoList) {
		this.prorateFactorDtoList = prorateFactorDtoList;
	}
	/**
	 * @return the prorateFactorDto
	 */
	public ProrateFactorDto getProrateFactorDto() {
		return prorateFactorDto;
	}
	/**
	 * @param prorateFactorDto the prorateFactorDto to set
	 */
	public void setProrateFactorDto(ProrateFactorDto prorateFactorDto) {
		this.prorateFactorDto = prorateFactorDto;
	}
	/**
	 * @return the updateComment
	 */
	public String getUpdateComment() {
		return updateComment;
	}
	/**
	 * @param updateComment the updateComment to set
	 */
	public void setUpdateComment(String updateComment) {
		this.updateComment = updateComment;
	}
	/**
	 * @return the duplicateProrateFactorConfirmationMessage
	 */
	public String getDuplicateProrateFactorConfirmationMessage() {
		return duplicateProrateFactorConfirmationMessage;
	}
	/**
	 * @param duplicateProrateFactorConfirmationMessage the duplicateProrateFactorConfirmationMessage to set
	 */
	public void setDuplicateProrateFactorConfirmationMessage(
			String duplicateProrateFactorConfirmationMessage) {
		this.duplicateProrateFactorConfirmationMessage = duplicateProrateFactorConfirmationMessage;
	}
	/**
	 * @return the noRecordFoundMessage
	 */
	public String getNoRecordFoundMessage() {
		return noRecordFoundMessage;
	}
	/**
	 * @param noRecordFoundMessage the noRecordFoundMessage to set
	 */
	public void setNoRecordFoundMessage(String noRecordFoundMessage) {
		this.noRecordFoundMessage = noRecordFoundMessage;
	}
	/**
	 * @return the deleteMileageDataForIATAMessag
	 */
	public String getDeleteMileageDataForIATAMessage() {
		return deleteMileageDataForIATAMessage;
	}
	/**
	 * @param deleteMileageDataForIATAMessag the deleteMileageDataForIATAMessag to set
	 */
	public void setDeleteMileageDataForIATAMessage(
			String deleteMileageDataForIATAMessage) {
		this.deleteMileageDataForIATAMessage = deleteMileageDataForIATAMessage;
	}
	/**
	 * @return the cannotDeleteMileageDataForIATAMessage
	 */
	public String getCannotDeleteMileageDataForIATAMessage() {
		return cannotDeleteMileageDataForIATAMessage;
	}
	/**
	 * @param cannotDeleteMileageDataForIATAMessage the cannotDeleteMileageDataForIATAMessage to set
	 */
	public void setCannotDeleteMileageDataForIATAMessage(
			String cannotDeleteMileageDataForIATAMessage) {
		this.cannotDeleteMileageDataForIATAMessage = cannotDeleteMileageDataForIATAMessage;
	}
	/**
	 * @return the deleteACK
	 */
	public String getDeleteACK() {
		return deleteACK;
	}
	/**
	 * @param deleteACK the deleteACK to set
	 */
	public void setDeleteACK(String deleteACK) {
		this.deleteACK = deleteACK;
	}
	/**
	 * @return the prorateFactorErrorsDtoList
	 */
	public List<ProrateFactorErrorsDto> getProrateFactorErrorsDtoList() {
		return prorateFactorErrorsDtoList;
	}
	/**
	 * @param prorateFactorErrorsDtoList the prorateFactorErrorsDtoList to set
	 */
	public void setProrateFactorErrorsDtoList(
			List<ProrateFactorErrorsDto> prorateFactorErrorsDtoList) {
		this.prorateFactorErrorsDtoList = prorateFactorErrorsDtoList;
	}
	public List<StationInformationDto> getStationList() {
		return stationList;
	}
	public void setStationList(List<StationInformationDto> stationList) {
		this.stationList = stationList;
	}
	/**
	 * @return the prorateFactorDtoListProcess
	 */
	public List<ProrateFactorDto> getProrateFactorDtoListProcess() {
		return prorateFactorDtoListProcess;
	}
	/**
	 * @param prorateFactorDtoListProcess the prorateFactorDtoListProcess to set
	 */
	public void setProrateFactorDtoListProcess(
			List<ProrateFactorDto> prorateFactorDtoListProcess) {
		this.prorateFactorDtoListProcess = prorateFactorDtoListProcess;
	}
	
}
