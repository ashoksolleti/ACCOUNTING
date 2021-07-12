package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class ManualQueuesDTO extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String officeIdentifier;

    private Integer maxNumOfItemsToActions;

    private String queueName;

    public ManualQueuesDTO() {
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(final String pQueueName) {
        this.queueName = pQueueName;
    }

    public String getOfficeIdentifier() {
        return this.officeIdentifier;
    }

    public void setOfficeIdentifier(final String pOfficeIdentifier) {
        this.officeIdentifier = pOfficeIdentifier;
    }

    public Integer getMaxNumOfItemsToActions() {
        return this.maxNumOfItemsToActions;
    }

    public void setMaxNumOfItemsToActions(final Integer pMaxNumOfItemsToActions) {
        this.maxNumOfItemsToActions = pMaxNumOfItemsToActions;
    }

    @Override
    public Long getOId() {
        return null;
    }

    @Override
    public String toString() {
        return "ManualQueuesDTO [officeIdentifier=" + this.officeIdentifier + ", maxNumOfItemsToActions="
                    + this.maxNumOfItemsToActions + ", queueName=" + this.queueName + "]";
    }

}
