package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ManualAuditQueueRequest</code> is used for retrieving <code> Audit queue related information</code>
 * information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>ManualAuditQueuesFindDto</code>
 * <li><code>airwaybillNumbers</code>
 * <li><code>shipmentReferenceNumbers</code>
 * <li><code>queueItemOids</code>
 * <li><code>officeQueueOids</code>
 * <li><code>manualQueueDetailsDTO</code>
 * <li><code>queueName</code>
 * <li><code>ruleName</code>
 * </ul>
 */
public class ManualAuditQueueRequest extends AbstractRequest {

    /**
     * Attribute to hold the <code>serialVersionUID</code> object.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>queuesDTO</code> object.
     */
    private ManualAuditQueuesFindDto queuesDTO=new ManualAuditQueuesFindDto();

    /**
     * Attribute to hold the <code>airwaybillNumbers</code> object.
     */
    private List<String> airwaybillNumbers;

    /**
     * Attribute to hold the <code>shipmentReferenceNumbers</code> object.
     */
    private List<String> shipmentReferenceNumbers;

    /**
     * Attribute to hold the <code>queueItemOids</code> object.
     */
    private List<Long> queueItemOids;

    /**
     * Attribute to hold the <code>officeQueueOids</code> object.
     */

    private List<Long> officeQueueOids;

    /**
     * Attribute to hold the <code>manualQueueDetailsDTO</code> object.
     */

    private ManualQueueDetailsDTO manualQueueDetailsDTO;

    /**
     * Attribute to hold the <code>queueName</code> object.
     */
    private String queueName;

    /**
     * Attribute to hold the <code>ruleName</code> object.
     */
    private List<RuleNameDto> ruleName;
    
    /**
     * Attribute to hold the <code>airwaybill Oids</code> object.
     */
    private List<Long> airwaybillOids;
    
    public List<Long> getAirwaybillOids() {
		return airwaybillOids;
	}

	public void setAirwaybillOids(List<Long> airwaybillOids) {
		this.airwaybillOids = airwaybillOids;
	}

    private AccountingInvoiceAWBDto accountingInvoiceAWBDto;
    //317 item
    
    private List<ParticipantCarrierReceivablesDto> selectedParticipantCarrierReceivablesDtoList;
    
    
    private Long accAWBOid;
    

    public Long getAccAWBOid() {
		return accAWBOid;
	}

	public void setAccAWBOid(Long accAWBOid) {
		this.accAWBOid = accAWBOid;
	}

    public List<ParticipantCarrierReceivablesDto> getSelectedParticipantCarrierReceivablesDtoList() {
		return selectedParticipantCarrierReceivablesDtoList;
	}

	public void setSelectedParticipantCarrierReceivablesDtoList(
			List<ParticipantCarrierReceivablesDto> selectedParticipantCarrierReceivablesDtoList) {
		this.selectedParticipantCarrierReceivablesDtoList = selectedParticipantCarrierReceivablesDtoList;
	}

	/**
     * Gets the <code>queueName</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>queueName</code> property.
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * Sets the <code>queueName</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pQueueName
     *            the new value of the <code>queueName</code> property.
     */
    public void setQueueName(final String pQueueName) {
        this.queueName = pQueueName;
    }

    /**
     * Gets the <code>queueItemOids</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>queueItemOids</code> property.
     */
    public List<Long> getQueueItemOids() {
        return this.queueItemOids;
    }

    /**
     * Sets the <code>queueItemOids</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pQueueItemOids
     *            the new value of the <code>queueItemOids</code> property.
     */
    public void setQueueItemOids(final List<Long> pQueueItemOids) {
        this.queueItemOids = pQueueItemOids;
    }

    /**
     * Gets the <code>airwaybillNumbers</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>airwaybillNumbers</code> property.
     */
    public List<String> getAirwaybillNumbers() {
        return this.airwaybillNumbers;
    }

    /**
     * Sets the <code>airwaybillNumbers</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pOIds
     *            the new value of the <code>airwaybillNumbers</code> property.
     */
    public void setAirwaybillNumbers(final List<String> pOIds) {
        this.airwaybillNumbers = pOIds;
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
     * @param pQueuesDTO
     *            the new value of the <code>queuesDTO</code> property.
     */
    public void setQueuesDTO(final ManualAuditQueuesFindDto pQueuesDTO) {
        this.queuesDTO = pQueuesDTO;
    }

    /**
     * Gets the <code>shipmentReferenceNumbers</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>shipmentReferenceNumbers</code> property.
     */
    public List<String> getShipmentReferenceNumbers() {
        return this.shipmentReferenceNumbers;
    }

    /**
     * Sets the <code>shipmentReferenceNumbers</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pShipmentReferenceNumbers
     *            the new value of the <code>shipmentReferenceNumbers</code> property.
     */
    public void setShipmentReferenceNumbers(final List<String> pShipmentReferenceNumbers) {
        this.shipmentReferenceNumbers = pShipmentReferenceNumbers;
    }

    /**
     * Gets the <code>manualQueueDetailsDTO</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>manualQueueDetailsDTO</code> property.
     */
    public ManualQueueDetailsDTO getManualQueueDetailsDTO() {
        return this.manualQueueDetailsDTO;
    }

    /**
     * Sets the <code>manualQueueDetailsDTO</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pManualQueueDetailsDTO
     *            the new value of the <code>manualQueueDetailsDTO</code> property.
     */
    public void setManualQueueDetailsDTO(final ManualQueueDetailsDTO pManualQueueDetailsDTO) {
        this.manualQueueDetailsDTO = pManualQueueDetailsDTO;
    }

    /**
     * Gets the <code>officeQueueOids</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>officeQueueOids</code> property.
     */
    public List<Long> getOfficeQueueOids() {
        return this.officeQueueOids;
    }

    /**
     * Sets the <code>officeQueueOids</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pOfficeQueueOids
     *            the new value of the <code>officeQueueOids</code> property.
     */
    public void setOfficeQueueOids(final List<Long> pOfficeQueueOids) {
        this.officeQueueOids = pOfficeQueueOids;
    }

    @Override
    public String toString() {
        return "ManualAuditQueueRequest [queuesDTO=" + queuesDTO.toString() + "]";
    }

    /**
     * Gets the <code>ruleName</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>ruleName</code> property.
     */
    public List<RuleNameDto> getRuleName() {
        return this.ruleName;
    }

    /**
     * Sets the <code>ruleName</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pRuleName
     *            the new value of the <code>ruleName</code> property.
     */
    public void setRuleName(final List<RuleNameDto> pRuleName) {
        this.ruleName = pRuleName;
    }
    public AccountingInvoiceAWBDto getAccountingInvoiceAWBDto() {
		return accountingInvoiceAWBDto;
	}

	public void setAccountingInvoiceAWBDto(
			AccountingInvoiceAWBDto accountingInvoiceAWBDto) {
		this.accountingInvoiceAWBDto = accountingInvoiceAWBDto;
	}

}
