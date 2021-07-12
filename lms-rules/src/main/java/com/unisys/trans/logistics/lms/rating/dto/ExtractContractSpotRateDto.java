package com.unisys.trans.logistics.lms.rating.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.ContractStatusType;

/**
 * <code>ExtractContractSpotRateDto</code> contains specific data applicable to the
 * Contract,SpotRateDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>includedStatuses
 * <li>updatedDate
 * <li>updateDateEmpty
 * <li>extractFormatType
 * </ul>
 */
public class ExtractContractSpotRateDto extends PersistenceObjectDto {
    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = -8668188210317768214L;

    /**
     * Attribute to hold <code>includedStatuses</code> property.
     */
    private List<ContractStatusType> includedStatuses;

    /**
     * Attribute to hold <code>updatedDate</code> property.
     */
    private Date updatedDate;

    /**
     * Attribute to hold <code>updateDateEmpty</code> property.
     */
    private boolean updateDateEmpty;

    /**
     * Attribute to hold <code>extractFormatType</code> property.
     */
    private ExtractFormatType extractFormatType;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Gets the <code>updatedDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>updatedDate</code> property.
     */
    public Date getUpdatedDate() {
        return ContractUtility.getClonedDate(this.updatedDate);
    }

    /**
     * Sets the <code>updatedDate</code> property.
     * <p>
     * 
     * @param pUpdatedDate
     *            the current value of the <code>updatedDate</code> property.
     */
    public void setUpdatedDate(final Date pUpdatedDate) {
        this.updatedDate = ContractUtility.getClonedDate(pUpdatedDate);
    }

    /**
     * Gets the <code>extractFormatType</code> property.
     * <p>
     * 
     * @return the current value of the <code>extractFormatType</code> property.
     */
    public ExtractFormatType getExtractFormatType() {
        return this.extractFormatType;
    }

    /**
     * Sets the <code>extractFormatType</code> property.
     * <p>
     * 
     * @param pExtractFormatType
     *            the current value of the <code>extractFormatType</code> property.
     */
    public void setExtractFormatType(final ExtractFormatType pExtractFormatType) {
        this.extractFormatType = pExtractFormatType;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>SpotRateId</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return this.oId;
    }

    /**
     * Gets the list of <code>includedStatuses</code> property.
     * <p>
     * 
     * @return the current value of the <code>includedStatuses</code> property.
     */
    public List<ContractStatusType> getIncludedStatuses() {
        return this.includedStatuses;
    }

    /**
     * Sets the <code>includedStatuses</code> property.
     * <p>
     * 
     * @param pIncludedStatuses
     *            the current value of the <code>includedStatuses</code> property.
     */
    public void setIncludedStatuses(
                final List<ContractStatusType> pIncludedStatuses) {
        this.includedStatuses = pIncludedStatuses;
    }

    /**
     * Gets the <code>updateDateEmpty</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>updateDateEmpty</code> property.
     */
    public boolean getUpdateDateEmpty() {
        return this.updateDateEmpty;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.
     */

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>updateDateEmpty</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pUpdateDateEmpty
     *            the current value of the <code>updateDateEmpty</code> property.
     */

    public void setUpdateDateEmpty(final boolean pUpdateDateEmpty) {
        this.updateDateEmpty = pUpdateDateEmpty;
    }

}
