package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.ActionType;

/**
 * <code>RateTypePercentageDto</code> contain details of RateTypePercentage.
 * <p>
 * This contains all information about RateTypePercentageDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>actionType
 * <li>dateRangeDto
 * <li>oId
 * <li>percentage
 * <li>percentageRatetype
 * </ul>
 */
public class RateTypePercentageDto extends PersistenceObjectDto {

    /**
     * Defauls serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>actionType</code> property.
     */

    private ActionType actionType;

    /**
     * Attribute to hold <code>dateRangeDto</code> property.
     */

    private DateRangeDto dateRangeDto;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;

    /**
     * Attribute to hold <code>percentage</code> property.
     */

    private Integer percentage;

    /**
     * Attribute to hold <code>percentageRatetype</code> property.
     */

    private String percentageRatetype;

    /**
     * Gets the <code>actionType</code> property.
     * <p>
     * 
     * @return the current value of <code>actionType</code> property.<br>
     */
    public ActionType getActionType() {
        return this.actionType;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto
     * DateRangeDto} containing <code>DateRangeDto</code> details.
     * <p>
     * 
     * @return the current value of <code>DateRangeDto</code> details.
     */

    public DateRangeDto getDateRangeDto() {
        if (this.dateRangeDto == null) {
            this.dateRangeDto = new DateRangeDto();
        }
        return this.dateRangeDto;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>Percentage</code> property.
     * <p>
     * <b>Format: </b><br>
     * Numeric
     * <p>
     * <b>Example: </b><br>
     * 100
     * <p>
     * 
     * @return the current value of the <code>Percentage</code> property.
     */
    public Integer getPercentage() {
        return this.percentage;
    }

    /**
     * Gets the <code>percentageRatetypeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @return the current value of the <code>percentageRatetype</code> property.
     */
    public String getPercentageRatetype() {
        return this.percentageRatetype;
    }

    /**
     * Sets the <code>ActionType</code> property.
     * <p>
     * 
     * @param pActionType
     *            the new value of <code>ActionType</code> property.<br>
     */
    public void setActionType(final ActionType pActionType) {
        this.actionType = pActionType;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto
     * DateRangeDto} containing <code>DateRangeDto</code> details.
     * <p>
     * 
     * @param pDateRangeDto
     *            holds the new value of <code>dateRangeDto</code> type details.<br>
     */
    public void setDateRangeDto(final DateRangeDto pDateRangeDto) {
        this.dateRangeDto = pDateRangeDto;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>Percentage</code> property.
     * <p>
     * <b>Format: </b><br>
     * Numeric
     * <p>
     * <b>Example: </b><br>
     * 125
     * <p>
     * 
     * @param pPercentage
     *            the current value of the <code>Percentage</code> property.
     */

    public void setPercentage(final Integer pPercentage) {
        this.percentage = pPercentage;
    }

    /**
     * Sets the <code>PercentageRatetype</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @param pPercentageRatetype
     *            the current value of the <code>percentageRatetype</code> property.
     */
    public void setPercentageRatetype(final String pPercentageRatetype) {
        this.percentageRatetype = ContractUtility.convertToUpperCase(pPercentageRatetype);
    }

}
