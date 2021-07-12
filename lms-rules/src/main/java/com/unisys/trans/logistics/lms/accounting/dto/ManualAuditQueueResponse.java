package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemDto;

/**
 * <code>ManualAuditQueueResponse</code> is used for retrieving <code> Audit queue related information</code>
 * information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>ManualAuditQueuesFindDto</code>
 * <li><code>queuesDTO</code>
 * <li><code>manualQueueDetailsDTOs</code>
 * <li><code>queuesAndQueuesItems</code>
 * <li><code>queuesAndQueuesItemCount</code>
 * <li><code>allDefinedRules</code>
 * </ul>
 */
public class ManualAuditQueueResponse extends AbstractResponse {
    /**
     * Attribute to hold the <code>serialVersionUID</code> object.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>queuesDTO</code> object.
     */
    private ManualAuditQueuesFindDto queuesDTO;

    /**
     * Attribute to hold the <code>manualQueueDetailsDTOs</code> object.
     */
    private List<ManualQueueDetailsDTO> manualQueueDetailsDTOs;

    /**
     * Attribute to hold the <code>queuesAndQueuesItems</code> object.
     */
    private Map<String, List<OfficeQueueItemDto>> queuesAndQueuesItems;

    /**
     * Attribute to hold the <code>queuesAndQueuesItemCount</code> object.
     */
    private HashMap<String, Integer> queuesAndQueuesItemCount;

    /**
     * Attribute to hold the <code>allDefinedRules</code> object.
     */
    private List<RuleNameDto> allDefinedRules;

    /**
     * Gets the <code>allDefinedRules</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>allDefinedRules</code> property.
     */
    public List<RuleNameDto> getAllDefinedRules() {
        return this.allDefinedRules;
    }

    /**
     * Sets the <code>allDefinedRules</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pAllDefinedRules
     *            the new value of the <code>allDefinedRules</code> property.
     */
    public void setAllDefinedRules(final List<RuleNameDto> pAllDefinedRules) {
        this.allDefinedRules = pAllDefinedRules;
    }

    public ManualAuditQueueResponse() {
    }

    /**
     * Gets the <code>queuesAndQueuesItemCount</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>queuesAndQueuesItemCount</code> property.
     */
    public HashMap<String, Integer> getQueuesAndQueuesItemCount() {
        return this.queuesAndQueuesItemCount;
    }

    /**
     * Sets the <code>allDefinedRules</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pAllDefinedRules
     *            the new value of the <code>allDefinedRules</code> property.
     */
    public void setQueuesAndQueuesItemCount(final HashMap<String, Integer> pQueuesAndQueuesItemCount) {
        this.queuesAndQueuesItemCount = pQueuesAndQueuesItemCount;
    }
    /**
     * Gets the <code>queuesAndQueuesItems</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>queuesAndQueuesItems</code> property.
     */
    public Map<String, List<OfficeQueueItemDto>> getQueuesAndQueuesItems() {
        return this.queuesAndQueuesItems;
    }
    /**
     * Sets the <code>queuesAndQueuesItems</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pQueuesAndQueuesItems
     *            the new value of the <code>queuesAndQueuesItems</code> property.
     */
    public void setQueuesAndQueuesItems(final Map<String, List<OfficeQueueItemDto>> pQueuesAndQueuesItems) {
        this.queuesAndQueuesItems = pQueuesAndQueuesItems;
    }
    /**
     * Gets the <code>manualQueueDetailsDTOs</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>manualQueueDetailsDTOs</code> property.
     */
    public List<ManualQueueDetailsDTO> getManualQueueDetailsDTOs() {
        return this.manualQueueDetailsDTOs;
    }
    /**
     * Sets the <code>manualQueueDetailsDTOs</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pManualQueueDetaildtos
     *            the new value of the <code>manualQueueDetailsDTOs</code> property.
     */
    public void setManualQueueDetailsDTOs(final List<ManualQueueDetailsDTO> pManualQueueDetaildtos) {
        this.manualQueueDetailsDTOs = pManualQueueDetaildtos;
    }
    /**
     * Gets the <code>queuesDTO</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>queuesDTO</code> property.
     */
    public ManualAuditQueuesFindDto getQueuesDTO() {
        return this.queuesDTO;
    }
    /**
     * Sets the <code>queuesDTO</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pManualQueueDetaildtos
     *            the new value of the <code>queuesDTO</code> property.
     */
    public void setQueuesDTO(final ManualAuditQueuesFindDto pQueuesDTO) {
        this.queuesDTO = pQueuesDTO;
    }

    @Override
    public String toString() {
        return "ManualAuditQueueResponse [queuesDTO=" + queuesDTO.toString() + "]";
    }

}
