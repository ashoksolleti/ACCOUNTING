package com.unisys.trans.logistics.lms.framework.preferences;

import java.sql.Date;
import java.util.List;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * @author RamannaV
 *
 */
public class SimplifiedRestrictionPersistentRequest extends AbstractRequest {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 7447555823903072214L;
	
	/**
	 * Primary key
	 */
	private long oid;
	
	/**
	 * List of oids during  multiple update scenario
	 */
	private List<Long> listOfids;
	
	/**
	 * List of start dates during  multiple update scenario
	 */
	private List<java.util.Date> startDate;
 	
	/**
	 * Update Indicator
	 */
	private boolean updateIndicator = false;

	/**
	 * SimplifiedRestrictionTypeDto
	 */
	private SimplifiedRestrictionTypeDto simplifiedRestrictionTypeDto;
	
	/**
	 * Except Checking
	 */
    private String missingExpeceptions;
    
    
    /**
	 * Disabling fields in action section
	 */
    private boolean endDateTimeIndicator;
	
	public String getMissingExpeceptions() {
		return missingExpeceptions;
	}

	public void setMissingExpeceptions(String missingExpeceptions) {
		this.missingExpeceptions = missingExpeceptions;
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
 
	public List<java.util.Date> getStartDate() {
		return startDate;
	}

	public void setStartDate(List<java.util.Date> startDate) {
		this.startDate = startDate;
	}

	public List<Long> getListOfids() {
		return listOfids;
	}

	public void setListOfids(List<Long> listOfids) {
		this.listOfids = listOfids;
	}

	/**
	 * @return the oid
	 */
	public long getOid() {
		return oid;
	}

	/**
	 * @param oid
	 *            the oid to set
	 */
	public void setOid(long oid) {
		this.oid = oid;
	}

	public boolean isUpdateIndicator() {
		return updateIndicator;
	}

	public void setUpdateIndicator(boolean updateIndicator) {
		this.updateIndicator = updateIndicator;
	}

	public boolean isEndDateTimeIndicator() {
		return endDateTimeIndicator;
	}


	public void setEndDateTimeIndicator(boolean endDateTimeIndicator) {
		this.endDateTimeIndicator = endDateTimeIndicator;
	}
	
	
}
