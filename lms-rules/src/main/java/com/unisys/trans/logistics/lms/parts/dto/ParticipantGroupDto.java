/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;


/**
 * Represents the data transfer object for participant group entity. Data transfer objects are used to
 * transfer information between client and server via web services. <code>ParticipantGroupDto</code> is used
 * to transfer the information about the participant group.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>deleteIndicator
 * <li>endDate
 * <li>groupDescription
 * <li>groupMembers
 * <li>groupNumber
 * <li>oId
 * </ul>
 * </code>
 */
public class ParticipantGroupDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5354484589715123157L;

    /**
     * Attribute to hold <code>deleteIndicator</code> property.
     */
    private boolean deleteIndicator;

    /**
     * Attribute to hold <code>endDate</code> property.
     */
    private Date endDate;

    /**
     * Attribute to hold <code>groupDescription</code> property.
     */
    private String groupDescription;

    /**
     * Attribute to hold <code>groupMembers</code> property.
     */
    private List<ParticipantDetailDto> groupMembers = new ArrayList<ParticipantDetailDto>();

    /**
     * Attribute to hold <code>groupNumber</code> property.
     */

    private String groupNumber;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;
    
    
    private UserAuditDto lastUpdatedAgent;
    /**
     * <code>Default constructor.</code>
     */
    
    
    public ParticipantGroupDto() {

    }

    /**
     * <code>Parameterized constructor.</code>
     * <p>
     * 
     * @param pGroupNumber <code>String</code><br>
     *            Contains the <code>groupNumber</code> of the participant group.<br>
     * @param pGroupDescription <code>String</code><br>
     *            Contains the <code>groupDescription</code> of the participant group.<br>
     * @param pOId <code>Long</code><br>
     *            Contains the <code>oId</code> of the participant group.<br>
     * @param pVersion <code>Long</code><br>
     *            Contains the <code>version</code> of the participant group.<br>
     * @param pEndDate <code>Date</code><br>
     *            Contains the <code>endDate</code> of the participant group.<br>
     */
    public ParticipantGroupDto(final String pGroupNumber, final String pGroupDescription, final Long pOId,
                final Long pVersion, final Date pEndDate, final Date pUpdatedDate, final String pUpdatedUser) {

        this.groupNumber = pGroupNumber;
        this.groupDescription = pGroupDescription;
        this.oId = pOId;
        this.setVersion(pVersion);
        this.endDate = ContractUtility.getClonedDate(pEndDate);
        this.setLastUpdatedAgent(new UserAuditDto());
        this.getLastUpdatedAgent().setCreatedOn(ContractUtility.getClonedDate(pUpdatedDate));
        this.getLastUpdatedAgent().setUserIdentifier(pUpdatedUser);
    }
    
    public ParticipantGroupDto(final String pGroupNumber, final String pGroupDescription, final Long pOId,
                final Long pVersion, final Date pEndDate) {
        this.groupNumber = pGroupNumber;
        this.groupDescription = pGroupDescription;
        this.oId = pOId;
        this.setVersion(pVersion);
        this.endDate = ContractUtility.getClonedDate(pEndDate);        
    }

    /**
     * <code>Parameterized constructor.</code>
     * <p>
     * 
     * @param pGroupNumber <code>String</code><br>
     *            Contains the <code>groupNumber</code> of the participant group.<br>
     * @param pDescription <code>String</code><br>
     *            Contains the <code>groupDescription</code> of the participant group.<br>
     * @param pCity <code>String</code><br>
     *            Contains the <code>city</code> of the participant.<br>
     * @param pCountry <code>String</code><br>
     *            Contains the <code>countryCode</code> of the participant.<br>
     * @param pState <code>String</code><br>
     *            Contains the <code>state</code> of the participant.<br>
     * @param pAddress <code>String</code><br>
     *            Contains the <code>address</code> of the participant.<br>
     * @param pPostalCode <code>String</code><br>
     *            Contains the <code>postalCode</code> of the participant.<br>
     * @param pName <code>String</code><br>
     *            Contains the <code>name</code> of the participant.<br>
     * @param pBillingNumber <code>String</code><br>
     *            Contains the <code>billingAccountNumber1</code> of the participant.<br>
     * @param pIATAAccount <code>String</code><br>
     *            Contains the <code>iataAccountNumber</code> of the freight details.<br>
     * @param pStationCode <code>String</code><br>
     *            Contains the <code>stationCode</code> of the participant.<br>
     */
    public ParticipantGroupDto(final String pGroupNumber, final String pDescription,
                final String pBillingNumber, final String pIATAAccount, final String pCity,
                final String pCountry, final String pState, final String pAddress, final String pPostalCode,
                final String pName, final String pStationCode) {

        final ParticipantDetailDto aParticipantDetailDto = new ParticipantDetailDto();

        if (pBillingNumber == null) {

            aParticipantDetailDto.setAccountNumber(pIATAAccount);

        }
        else {

            aParticipantDetailDto.setAccountNumber(pBillingNumber);
        }
        aParticipantDetailDto.setCity(pCity);
        aParticipantDetailDto.setState(pState);
        aParticipantDetailDto.setCountryCode(pCountry);
        aParticipantDetailDto.setAddress(pAddress);
        aParticipantDetailDto.setPostalCode(pPostalCode);
        aParticipantDetailDto.setName(pName);
        aParticipantDetailDto.setStationCode(pStationCode);
        this.groupMembers.add(aParticipantDetailDto);
        this.groupNumber = pGroupNumber;
        this.groupDescription = pDescription;
      
    }

    /**
     * Gets the value of the <code>endDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 26JUN07
     * <p>
     * 
     * @return the current value of <code>endDate</code> property.
     */
    public Date getEndDate() {

        return ContractUtility.getClonedDate(this.endDate);
    }

    /**
     * Gets the value of the <code>groupDescription</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-32 Character set for all types.
     * <p>
     * <b>Example: </b><br>
     * GROUP1
     * <p>
     * 
     * @return the current value of <code>groupDescription</code> property.
     */
    public String getGroupDescription() {

        return this.groupDescription;

    }

    /**
     * Get the <code>groupMembers</code> property.
     * <p>
     * Holds the list of
     * <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto ParticipantDetailDto}</code>
     * objects.
     * <p>
     * 
     * @return the current value of <code>groupMembers</code> property.
     */
    public List<ParticipantDetailDto> getGroupMembers() {

        return this.groupMembers;

    }

    /**
     * Gets the value of the <code>groupNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alpha numeric characters
     * <p>
     * <b>Example: </b><br>
     * GR0000BE
     * <p>
     * 
     * @return the current value of <code>groupNumber</code> property.
     */
    public String getGroupNumber() {

        return this.groupNumber;
    }

    /**
     * Gets the value of the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {

        return this.oId;
    }

    /**
     * Gets the value of <code>deleteIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <ul>
     * <li><code>true</code><br>
     * The partcipant group has been marked for deletion.<br>
     * <li><code>false</code><br>
     * The partcipant group has not been marked for deletion.<br>
     * </ul>
     * <p>
     * 
     * @return the current value of <code>deleteIndicator</code> property.
     */
    public boolean isDeleteIndicator() {

        return this.deleteIndicator;
    }

    /**
     * Sets the value of the <code>deleteIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <ul>
     * <li><code>true</code><br>
     * The partcipant group has been marked for deletion.<br>
     * <li><code>false</code><br>
     * The partcipant group has not been marked for deletion.<br>
     * </ul>
     * <p>
     * 
     * @param pDeleteIndicator the new value of the <code>deleteIndicator</code> property.
     */
    public void setDeleteIndicator(final boolean pDeleteIndicator) {

        this.deleteIndicator = pDeleteIndicator;
    }

    /**
     * Sets the value of <code>endDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}<br>
     * <p>
     * <b>Example: </b><br>
     * 26JUN07
     * <p>
     * 
     * @param pEndDate the new value of the <code>endDate</code> property.
     */
    public void setEndDate(final Date pEndDate) {

        this.endDate = ContractUtility.getClonedDate(pEndDate);
    }

    /**
     * Sets the value of <code>groupDescription</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-32 Character set for all types.
     * <p>
     * <b>Example: </b><br>
     * GROUP1
     * <p>
     * 
     * @param pGroupDescription the new value of the <code>groupDescription</code> property.
     */
    public void setGroupDescription(final String pGroupDescription) {

        this.groupDescription = ContractUtility.convertToUpperCase(pGroupDescription);
    }

    /**
     * Set the <code>groupMembers</code> property.
     * <p>
     * Holds the list of
     * <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto ParticipantDetailDto}</code>
     * object.
     * <p>
     * 
     * @param pGroupMembers the new value of <code>groupMembers</code> property.
     */
    public void setGroupMembers(final List<ParticipantDetailDto> pGroupMembers) {

        this.groupMembers = pGroupMembers;
    }

    /**
     * Sets the value of <code>groupNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alpha numeric characters<br>
     * <b>Example: </b><br>
     * GR0000BE
     * <p>
     * 
     * @param pGroupNumber the new value of <code>groupNumber</code> property.
     */
    public void setGroupNumber(final String pGroupNumber) {

        this.groupNumber = ContractUtility.convertToUpperCase(pGroupNumber);
    }

    /**
     * Sets the value of the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {

        this.oId = pOId;
    }

	/**
	 * @return the lastUpdatedAgent
	 */
	public UserAuditDto getLastUpdatedAgent() {
		return lastUpdatedAgent;
	}

	/**
	 * @param lastUpdatedAgent the lastUpdatedAgent to set
	 */
	public void setLastUpdatedAgent(UserAuditDto pLastUpdatedAgent) {
		this.lastUpdatedAgent = pLastUpdatedAgent;
	}
	
	//FIS150a
	private List<String> thePartsLines;
	private boolean restoreIndicator;
	public List<String> getThePartsLines() {
		return thePartsLines;
	}

	public void setThePartsLines(List<String> thePartsLines) {
		this.thePartsLines = thePartsLines;
	}

	public boolean isRestoreIndicator() {
		return restoreIndicator;
	}

	public void setRestoreIndicator(boolean restoreIndicator) {
		this.restoreIndicator = restoreIndicator;
	}
	
	
	/**
     * This constant holds the value for for the Double Quotes.
     */
    private static final String SINGLE_QUOTES = "'";
	public String toString(){
		final StringBuffer aBuff = new StringBuffer();
		if(this.getGroupMembers() != null && !this.getGroupMembers().isEmpty()){
			for(int i=0 ; i< this.getGroupMembers().size() ;i++){
				
				aBuff.append(this.getGroupNumber()).append(",");
				aBuff.append(this.getGroupDescription()).append(",");
				if(this.getGroupMembers().get(i).getAccountNumber() != null){
					aBuff.append(SINGLE_QUOTES + this.getGroupMembers().get(i).getAccountNumber() + SINGLE_QUOTES);
					aBuff.append(",");
					aBuff.append("B").append(",");
				}else{
					if(this.getGroupMembers().get(i).getIataAccountNumber() != null){
						aBuff.append(this.getGroupMembers().get(i).getIataAccountNumber()).append(",");
						aBuff.append("I").append(",");
					}
				}
                if(this.getGroupMembers().get(i).getEffectivePeriod()!=null){
                    if(this.getGroupMembers().get(i).getEffectivePeriod().getEffectiveDate()!=null){
                        aBuff.append(ContractUtility.getFormattedDate("ddMMMyy",
                            this.getGroupMembers().get(i).getEffectivePeriod().getEffectiveDate()));
                    }
                    aBuff.append(",");
                    if(this.getGroupMembers().get(i).getEffectivePeriod().getExpirationDate()!=null){
                        aBuff.append(ContractUtility.getFormattedDate("ddMMMyy",
                            this.getGroupMembers().get(i).getEffectivePeriod().getExpirationDate()));
                    }
                    aBuff.append(",");
                }else{
                    aBuff.append(",,");
                }
                // append blank "," for hard delete indicator
                aBuff.append(",");
				if(this.getEndDate() != null){
					aBuff.append("D" + ",");
					aBuff.append(ContractUtility.getFormattedDate("ddMMMyy",this.getEndDate()));
				}else{
					aBuff.append(",");
				}
				if(i < this.getGroupMembers().size()-1){
					aBuff.append("\n");
				}
				
			}
		}else{
			aBuff.append(this.getGroupNumber()).append(",");
			aBuff.append(this.getGroupDescription()).append(",");
			aBuff.append(",");
			aBuff.append(",");
			if(this.getEndDate() != null){
				aBuff.append("D" + ",");
				aBuff.append(ContractUtility.getFormattedDate("ddMMMyy",this.getEndDate()));
			}else{
				aBuff.append(",");
			}
		}
		
		return aBuff.toString();
	}
}