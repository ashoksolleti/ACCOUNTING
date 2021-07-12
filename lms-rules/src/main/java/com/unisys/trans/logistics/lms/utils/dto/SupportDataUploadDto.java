package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.constants.SupportDataType;

public class SupportDataUploadDto extends PersistenceObjectDto {

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private Long oId;

    private SupportDataType supportDataType;

    private UserAuditDto lastUpdatedAgent;

    private String filedescription;

    private String uploadFileName;

    private String uploadFileLocation;

    private Date resultDate;

    private String resultFileName;

    private String resultFileLocation;

    private String errorFileLocation;

    private boolean uploadProcessInd;

    private byte[] updatedFile;

    private long uploadFileSize;

    private String errorFileName;
    /**
     * @return the filedescription
     */
    public String getFiledescription() {
        return filedescription;
    }


    /**
     * @param filedescription the filedescription to set
     */
    public void setFiledescription(final String pFiledescription) {
        this.filedescription = pFiledescription;
    }

    /**
     * @return the resultDate
     */
    public Date getResultDate() {
        return this.resultDate;
    }


    /**
     * @param resultDate the resultDate to set
     */
    public void setResultDate(final Date pResultDate) {
        this.resultDate = pResultDate;
    }

    /**
     * @return the resultFileLocation
     */
    public String getResultFileLocation() {
        return this.resultFileLocation;
    }

    /**
     * @param pResultFileLocation the resultFileLocation to set
     */
    public void setResultFileLocation(final String pResultFileLocation) {
        this.resultFileLocation = pResultFileLocation;
    }

    /**
     * @return the resultFileName
     */
    public String getResultFileName() {
        return this.resultFileName;
    }

    /**
     * @param pResultFileName the resultFileName to set
     */
    public void setResultFileName(final String pResultFileName) {
        this.resultFileName = pResultFileName;
    }


    @Override
    public Long getOId() {
        return this.oId;
    }
    /**
     * @param pOId the oId to set
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }
    /**
     * @return the supportDataType
     */
    public SupportDataType getSupportDataType() {
        return this.supportDataType;
    }

    /**
     * @param pSupportDataType the supportDataType to set
     */
    public void setSupportDataType(final SupportDataType pSupportDataType) {
        this.supportDataType = pSupportDataType;
    }

    /**
     * @return the uploadFileName
     */
    public String getUploadFileName() {
        return this.uploadFileName;
    }

    /**
     * @param pUploadFileName the uploadFileName to set
     */
    public void setUploadFileName(final String pUploadFileName) {
        this.uploadFileName = pUploadFileName;
    }

    /**
     * @return the uploadFileLocation
     */
    public String getUploadFileLocation() {
        return this.uploadFileLocation;
    }

    /**
     * @param pUploadFileLocation the uploadFileLocation to set
     */
    public void setUploadFileLocation(final String pUploadFileLocation) {
        this.uploadFileLocation = pUploadFileLocation;
    }

    /**
     * @return the errorFileLocation
     */
    public String getErrorFileLocation() {
        return this.errorFileLocation;
    }

    /**
     * @param pErrorFileLocation the errorFileLocation to set
     */
    public void setErrorFileLocation(final String pErrorFileLocation) {
        this.errorFileLocation = pErrorFileLocation;
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
	public void setLastUpdatedAgent(UserAuditDto lastUpdatedAgent) {
		this.lastUpdatedAgent = lastUpdatedAgent;
	}


	/**
	 * @return the uploadProcessInd
	 */
	public boolean getUploadProcessInd() {
		return this.uploadProcessInd;
	}


	/**
	 * @param pUploadProcessInd the uploadProcessInd to set
	 */
	public void setUploadProcessInd(final boolean pUploadProcessInd) {
		this.uploadProcessInd = pUploadProcessInd;
	}


	/**
	 * @return the updatedFile
	 */
	public byte[] getUpdatedFile() {
		return updatedFile;
	}


	/**
	 * @param updatedFile the updatedFile to set
	 */
	public void setUpdatedFile(byte[] updatedFile) {
		this.updatedFile = updatedFile;
	}

	public String toString(){

		StringBuffer aSupportBuff = new StringBuffer();

		if(this.getLastUpdatedAgent()!= null
					&& this.getLastUpdatedAgent().getUserIdentifier() != null){
			aSupportBuff.append(this.getLastUpdatedAgent().getUserIdentifier());
			aSupportBuff.append(",");
		}else{
			aSupportBuff.append(",");
		}
		if(this.getLastUpdatedAgent()!= null
					&& this.getLastUpdatedAgent().getAssociatedStation() != null){
			aSupportBuff.append(this.getLastUpdatedAgent().getAssociatedStation());
			aSupportBuff.append(",");
		}else{
			aSupportBuff.append(",");
		}
		if(this.getFiledescription() != null){
			aSupportBuff.append(this.getFiledescription());
			aSupportBuff.append(",");
		}else{
			aSupportBuff.append(",");
		}

		if(this.getLastUpdatedAgent()!= null
					&& this.getLastUpdatedAgent().getCreatedOn() != null){
			aSupportBuff.append(ContractUtility.getFormattedDate(
					"ddMMMyy HH:mm",this.getLastUpdatedAgent().getCreatedOn()));
			aSupportBuff.append(",");
		}else{
			aSupportBuff.append(",");
		}
		if(this.getUploadFileName() != null){
			aSupportBuff.append(this.getUploadFileName());
			aSupportBuff.append(",");
		}else{
			aSupportBuff.append(",");
		}
		if(this.getResultDate() != null){
			aSupportBuff.append(ContractUtility.getFormattedDate(
					"ddMMMyy HH:mm",this.getResultDate()));
			aSupportBuff.append(",");
		}else{
			aSupportBuff.append(",");

		}
		if(this.getResultFileName() != null){
			aSupportBuff.append(this.getResultFileName());
			aSupportBuff.append(",");
		}else{
			aSupportBuff.append(",");
		}
		return aSupportBuff.toString();
	}


	/**
	 * @return the uploadFileSize
	 */
	public long getUploadFileSize() {
		return uploadFileSize;
	}


	/**
	 * @param uploadFileSize the uploadFileSize to set
	 */
	public void setUploadFileSize(long uploadFileSize) {
		this.uploadFileSize = uploadFileSize;
	}


	public String getErrorFileName() {
		return errorFileName;
	}


	public void setErrorFileName(String errorFileName) {
		this.errorFileName = errorFileName;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
