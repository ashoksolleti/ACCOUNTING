package com.unisys.trans.logistics.lms.rating.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>ExtractedContractSpotRates</code> class contain information specific to a Extractcontract and spot
 * rates.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>contractSraNumber
 * <li>extractedVersions
 * <li>totalNumberOfVersions
 * </code>
 * </ul>
 */
public class ExtractedContractSpotRates {
    
    private String contractSraNumber;

    private List<? extends PersistenceObjectDto> extractedVersions;

    private Integer totalNumberOfVersions;

    /**
     * @return the contractSraNumber
     */
    public String getContractSraNumber() {
        return contractSraNumber;
    }

    /**
     * @return the extractedVersions
     */
    public List<? extends PersistenceObjectDto> getExtractedVersions() {
        return extractedVersions;
    }

    /**
     * @return the totalNumberOfVersions
     */
    public Integer getTotalNumberOfVersions() {
        return totalNumberOfVersions;
    }

    /**
     * @param pContractSraNumber the contractSraNumber to set
     */
    public void setContractSraNumber(final String pContractSraNumber) {
        this.contractSraNumber = pContractSraNumber;
    }

    /**
     * @param pExtractedVersions the extractedVersions to set
     */
    public void setExtractedVersions(final List<? extends PersistenceObjectDto> pExtractedVersions) {
        this.extractedVersions = pExtractedVersions;
    }

    /**
     * @param pTotalNumberOfVersions the totalNumberOfVersions to set
     */
    public void setTotalNumberOfVersions(final Integer pTotalNumberOfVersions) {
        this.totalNumberOfVersions = pTotalNumberOfVersions;
    }
}
