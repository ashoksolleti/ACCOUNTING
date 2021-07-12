/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.preferences;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.framework.dto.PreferencesDto;


/**
 * @author RamannaV
 *
 */
public class SimplifiedRestrictionResponse extends AbstractResponse {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 7447555823903072214L;

	private SimplifiedRestrictionTypeDto simplifiedRestrictionTypeDto;

	private List<SimplifiedRestrictionTypeDto> simplifiedRestrictionTypeDtos;
	
	private List<PreferencesDto> prefernceDtos;

	/**
	 * status is used for response status either OK/NOK.
	 */
	private String status;

	private boolean invalidRequest = false;

	private boolean restrictionAvailable = false;
	
	private int totalNumberOfRecords;
	
	
	
	

	public int getTotalNumberOfRecords() {
		return totalNumberOfRecords;
	}

	public void setTotalNumberOfRecords(int totalNumberOfRecords) {
		this.totalNumberOfRecords = totalNumberOfRecords;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the simplifiedRestrictionTypeDto
	 */
	public SimplifiedRestrictionTypeDto getSimplifiedRestrictionTypeDto() {
		return simplifiedRestrictionTypeDto;
	}

	/**
	 * @param simplifiedRestrictionTypeDto
	 *            the simplifiedRestrictionTypeDto to set
	 */
	public void setSimplifiedRestrictionTypeDto(
			SimplifiedRestrictionTypeDto simplifiedRestrictionTypeDto) {
		this.simplifiedRestrictionTypeDto = simplifiedRestrictionTypeDto;
	}

	/**
	 * @return the invalidRequest
	 */
	public boolean isInvalidRequest() {
		return invalidRequest;
	}

	/**
	 * @param invalidRequest
	 *            the invalidRequest to set
	 */
	public void setInvalidRequest(boolean invalidRequest) {
		this.invalidRequest = invalidRequest;
	}

	

	/**
	 * @return the simplifiedRestrictionTypeDtos
	 */
	public List<SimplifiedRestrictionTypeDto> getSimplifiedRestrictionTypeDtos() {
		return simplifiedRestrictionTypeDtos;
	}

	/**
	 * @param simplifiedRestrictionTypeDtos
	 *            the simplifiedRestrictionTypeDtos to se
	 */
	public void setSimplifiedRestrictionTypeDtos(
			List<SimplifiedRestrictionTypeDto> simplifiedRestrictionTypeDtos) {
		this.simplifiedRestrictionTypeDtos = simplifiedRestrictionTypeDtos;
	}

	public List<PreferencesDto> getPrefernceDtos() {
		return prefernceDtos;
	}

	public void setPrefernceDtos(List<PreferencesDto> prefernceDtos) {
		this.prefernceDtos = prefernceDtos;
	}

	/**
	 * @return the restrictionAvailable
	 */
	public boolean isRestrictionAvailable() {
		return restrictionAvailable;
	}

	/**
	 * @param restrictionAvailable the restrictionAvailable to set
	 */
	public void setRestrictionAvailable(boolean restrictionAvailable) {
		this.restrictionAvailable = restrictionAvailable;
	}



}
