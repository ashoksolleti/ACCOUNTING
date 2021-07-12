/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.AggregateType;

/**
 * <code>AggregateDto</code> contains specific data applicable to the aggregate.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>type
 * <li>code
 * <li>countryDtos
 * <li>endDate
 * <li>deleteIndicator
 * <li>iataDefinedIndicator
 * <li>members
 * <li>membersIncludedIndicator
 * <li>membershipTypeCode
 * <li>name
 * <li>allowTariffRateIndicator
 * <li>oId
 * </code>
 * </ul>
 */
public class AggregateDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6126351313069422902L;

    /**
     * Attribute to hold <code>aggregateMembers</code> property.
     */
    private List<AggregateMemberDto> aggregateMembers;

    /**
     * Attribute to hold <code>baseAggregateCode</code> property.
     */
    private String baseAggregateCode;

    /**
     * Attribute to hold <code>baseAggregateType</code> property.
     */
    private AggregateType baseAggregateType;

    /**
     * Attribute to hold <code>code</code> property.
     */
    private String code;

    /**
     * Attribute to hold <code>deleteDate</code> property.
     */
    private Date deleteDate;

    /**
     * Attribute to hold <code>description</code> property.
     */
    private String description;

    /**
     * Attribute to hold <code>identicalCheckKey</code> property.
     */
    private Integer identicalCheckKey;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>rcaIndicator</code> property.
     */
    private boolean rcaIndicator;

    /**
     * Attribute to hold <code>tariffRateIndicator</code> property.
     */
    private boolean tariffRateIndicator;

    /**
     * Attribute to hold <code>usageType</code> property.
     */
    private String usageType;
//    
    private UserAuditDto lastUpdatedAgent;

    /**
     * <code>Default constructor</code>.
     */
    public AggregateDto() {

    }

    /**
     * <code>Parameterized Constructor.</code>
     * <p>
     * 
     * @param pCode
     *            the new value of the <code>code</code> property.<br>
     * @param pBaseAggregateType
     *            the new value of the <code>baseAggregateType</code> property.<br>
     * @param pDescription
     *            the new value of the <code>description</code> property.<br>
     */
    public AggregateDto(final String pCode,
                final AggregateType pBaseAggregateType, final String pDescription) {
        this.code = pCode;
        this.description = pDescription;
        // Aggregate doesn't contain usage type currently, so set Aggregate type
        // as usage type
        if (pBaseAggregateType != null) {
            this.usageType = pBaseAggregateType.getName();
        }
    }


    
    /**
     * <code>Overloaded constructor. </code>
     * 
     * @param pCode <code>Long</code><br>
     *            The new value of the code property.<br>
     *            pCode
     * @param pType <code>String</code><br>
     *            The new value of the type property.<br>
     */
    public AggregateDto(final String pCode, final AggregateType pType,
                final String pBaseAggregateCode,final Date pDeletionDate,
                final boolean pTariffIndicator) {
        this.code = pCode;
        this.baseAggregateType = pType;
        this.baseAggregateCode = pBaseAggregateCode;
        this.deleteDate = pDeletionDate;
        this.tariffRateIndicator = pTariffIndicator;
    }

    /**
     * <code>Parameterized Constructor.</code>
     * <p>
     * 
     * @param pCode
     *            the new value of the <code>code</code> property.<br>
     * @param pDescription
     *            the new value of the <code>description</code> property.<br>
     */
    public AggregateDto(final String pCode, final String pDescription) {
        this.code = pCode;
        this.description = pDescription;
    }

    /**
     * Gets the <code>aggregateMembers</code> property.
     * <p>
     * 
     * @return the current value of the <code>aggregateMembers</code> property.
     */
    public List<AggregateMemberDto> getAggregateMembers() {
        if (this.aggregateMembers == null) {
            this.aggregateMembers = new ArrayList<AggregateMemberDto>();
        }
        return this.aggregateMembers;
    }

    /**
     * Gets the <code>baseAggregateCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>baseAggregateCode</code> property.
     */
    public String getBaseAggregateCode() {
        return this.baseAggregateCode;
    }

    /**
     * Gets the <code>baseAggregateType</code> property.
     * <p>
     * 
     * @return the current value of the <code>baseAggregateType</code> property.
     */
    public AggregateType getBaseAggregateType() {
        return this.baseAggregateType;
    }

    /**
     * Gets the <code>code</code> property.
     * <p>
     * 
     * @return the current value of the <code>code</code> property.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Gets the <code>deleteDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>deleteDate</code> property.
     */
    public Date getDeleteDate() {
        return ContractUtility.getClonedDate(this.deleteDate);
    }

    /**
     * Gets the <code>description</code> property.
     * <p>
     * 
     * @return the current value of the <code>description</code> property.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the <code>identicalCheckKey</code> property.
     * <p>
     * 
     * @return the current value of the <code>identicalCheckKey</code> property.
     */
    public Integer getIdenticalCheckKey() {
        return this.identicalCheckKey;
    }

    /**
     * Gets the <code>MemberType</code> property.
     * <p>
     * 
     * @return the current value of the <code>MemberType</code> property.
     */
    public String getMemberType() {
        // TODO Auto-generated method stub
        String memberType = null;
        if (!this.rcaIndicator) {
            memberType = this.getAggregateMembers()
                        .get(FrameworkConstants.ZERO).getMemberType().getCode();
        }
        return memberType;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>AggregateDto</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>rcaIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>rcaIndicator</code> property.
     */
    public boolean getRcaIndicator() {
        return this.rcaIndicator;
    }

    /**
     * Gets the <code>tariffRateIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>tariffRateIndicator</code> property.
     */
    public boolean getTariffRateIndicator() {
        return this.tariffRateIndicator;
    }

    /**
     * Gets the <code>usageType</code> property.
     * <p>
     * 
     * @return the current value of the <code>usageType</code> property.
     */
    public String getUsageType() {
        return this.usageType;
    }

    /**
     * Sets the <code>aggregateMembers</code> property.
     * <p>
     * 
     * @param pAggregateMembers
     *            the new value of the <code>aggregateMembers</code> property.<br>
     */
    public void setAggregateMembers(
                final List<AggregateMemberDto> pAggregateMembers) {
        this.aggregateMembers = pAggregateMembers;
    }

    /**
     * Sets the <code>baseAggregateCode</code> property.
     * <p>
     * 
     * @param pBaseAggregateCode
     *            the new value of the <code>baseAggregateCode</code> property.<br>
     */
    public void setBaseAggregateCode(final String pBaseAggregateCode) {
        this.baseAggregateCode = ContractUtility
                    .convertToUpperCase(pBaseAggregateCode);
    }

    /**
     * Sets the <code>baseAggregateType</code> property.
     * <p>
     * 
     * @param pBaseAggregateType
     *            the new value of the <code>baseAggregateType</code> property.<br>
     */
    public void setBaseAggregateType(final AggregateType pBaseAggregateType) {
        this.baseAggregateType = pBaseAggregateType;
    }

    /**
     * Sets the <code>code</code> property.
     * <p>
     * 
     * @param pCode
     *            the new value of the <code>code</code> property.<br>
     */
    public void setCode(final String pCode) {
        this.code = ContractUtility.convertToUpperCase(pCode);
    }

    /**
     * Sets the <code>deleteDate</code> property.
     * <p>
     * 
     * @param pDeleteDate
     *            the new value of the <code>deleteDate</code> property.<br>
     */
    public void setDeleteDate(final Date pDeleteDate) {
        this.deleteDate = ContractUtility.getClonedDate(pDeleteDate);
    }

    /**
     * Sets the <code>description</code> property.
     * <p>
     * 
     * @param pDescription
     *            the new value of the <code>description</code> property.<br>
     */
    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Sets the <code>identicalCheckKey</code> property.
     * <p>
     * 
     * @param pIdenticalCheckKey
     *            the new value of the <code>identicalCheckKey</code> property.<br>
     */
    public void setIdenticalCheckKey(final Integer pIdenticalCheckKey) {
        this.identicalCheckKey = pIdenticalCheckKey;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>AggregateDto</code>.It is of type Long.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>rcaIndicator</code> property.
     * <p>
     * 
     * @param pRcaIndicator
     *            the new value of the <code>rcaIndicator</code> property.<br>
     */
    public void setRcaIndicator(final boolean pRcaIndicator) {
        this.rcaIndicator = pRcaIndicator;
    }

    /**
     * Sets the <code>tariffRateIndicator</code> property.
     * <p>
     * 
     * @param pTariffRateIndicator
     *            the new value of the <code>tariffRateIndicator</code> property.<br>
     */
    public void setTariffRateIndicator(final boolean pTariffRateIndicator) {
        this.tariffRateIndicator = pTariffRateIndicator;
    }

    /**
     * Sets the <code>usageType</code> property.
     * <p>
     * 
     * @param pUsageType
     *            the new value of the <code>usageType</code> property.<br>
     */
    public void setUsageType(final String pUsageType) {
        this.usageType = ContractUtility.convertToUpperCase(pUsageType);
    }

	public UserAuditDto getLastUpdatedAgent() {
		return lastUpdatedAgent;
	}

	public void setLastUpdatedAgent(UserAuditDto lastUpdatedAgent) {
		this.lastUpdatedAgent = lastUpdatedAgent;
	}
	//FIS150a
	private List<String> aggregateLines;

	public List<String> getAggregateLines() {
		return aggregateLines;
	}

	public void setAggregateLines(List<String> aggregateLines) {
		this.aggregateLines = aggregateLines;
	}
	
	private boolean deleteInd;
	
	private boolean restoreInd;

	public boolean isDeleteInd() {
		return deleteInd;
	}

	public void setDeleteInd(boolean deleteInd) {
		this.deleteInd = deleteInd;
	}

	public boolean isRestoreInd() {
		return restoreInd;
	}

	public void setRestoreInd(boolean restoreInd) {
		this.restoreInd = restoreInd;
	}
	
	public String toString() {
		final StringBuffer csvString = new StringBuffer();
		
		csvString.append(this.getCode()).append(",");
		if(getDescription()!=null && !getDescription().isEmpty()){
		    csvString.append("\""+this.getDescription()+"\"");
		}else{
			csvString.append("");
		}
		csvString.append(",");
		if(this.getBaseAggregateType()!=null) {
		csvString.append(this.getBaseAggregateType().getName());
		}
		csvString.append(",");
		csvString.append(this.getBaseAggregateCode()).append(",");
		if(this.getTariffRateIndicator()){
			csvString.append("Yes").append(",");
		}else{
			csvString.append("No").append(",");
		}
		if(this.getDeleteDate() != null){
			csvString.append(this.getDeleteDate());
			csvString.append(",");
			csvString.append("D");
			csvString.append(",");
		}else{
			csvString.append(",");
			csvString.append(",");
		}
		if(this.getAggregateMembers()!=null
		            && !this.getAggregateMembers().isEmpty()) {
		    final AggregateMemberDto aMemberDto = getAggregateMembers().get(0);
	        if(!aMemberDto.getExclusionIndicator()){
	            csvString.append("INCLUDE").append(",");
	        }
	        else{
	            csvString.append("EXCLUDE").append(",");
	        }
		    if(aMemberDto.getMemberType()!=null) {
		        csvString.append(aMemberDto.getMemberType().getName());
		    }
		    csvString.append(",");
    		// csvString.append(this.getMemberType()).append(",");
    		for(String city : aMemberDto.getMemberCodes()){
    			csvString.append(city).append(",");
    		}
		}
		return csvString.toString();
	}
}
