package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AgreementType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InterlineAgreementsRouteDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class ProrationFindDto {

    private String acn;

    private AgreementType agreementType;

    private List<String> awbDestList;

    private List<String> awbOriginList;

    private String carrier;

    private String commodity;

    private List<String> flightNoList;

    private Date inputDate;

    private String productCode;

    private List<String> segmentDestList;

    private List<String> segmentOriginList;

    private List<String> specialHandlingCodeList;

    private String uldType;
    
    //Deeps
    private List<InterlineAgreementsRouteDto> InterlineAgreementsRouteDtos;

    public List<InterlineAgreementsRouteDto> getInterlineAgreementsRouteDtos() {
		return InterlineAgreementsRouteDtos;
	}

	public void setInterlineAgreementsRouteDtos(
			List<InterlineAgreementsRouteDto> interlineAgreementsRouteDtos) {
		InterlineAgreementsRouteDtos = interlineAgreementsRouteDtos;
	}

	public String getAcn() {
        return this.acn;
    }

    public AgreementType getAgreementType() {
        return this.agreementType;
    }

    public List<String> getAwbDestList() {
        return this.awbDestList;
    }

    public List<String> getAwbOriginList() {
        return this.awbOriginList;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public String getCommodity() {
        return this.commodity;
    }

    public List<String> getFlightNoList() {
        return this.flightNoList;
    }

    public Date getInputDate() {
        return ContractUtility.getClonedDate(this.inputDate);
    }

    public String getProductCode() {
        return this.productCode;
    }

    public List<String> getSegmentDestList() {
        return this.segmentDestList;
    }

    public List<String> getSegmentOriginList() {
        return this.segmentOriginList;
    }

    public List<String> getSpecialHandlingCodeList() {
        return this.specialHandlingCodeList;
    }

    public String getUldType() {
        return this.uldType;
    }

    public void setAcn(final String pAcn) {
        this.acn = pAcn;
    }

    public void setAgreementType(final AgreementType pAgreementType) {
        this.agreementType = pAgreementType;
    }

    public void setAwbDestList(final List<String> pAwbDestList) {
        this.awbDestList = pAwbDestList;
    }

    public void setAwbOriginList(final List<String> pAwbOriginList) {
        this.awbOriginList = pAwbOriginList;
    }

    public void setCarrier(final String pCarrier) {
        this.carrier = pCarrier;
    }

    public void setCommodity(final String pCommodity) {
        this.commodity = pCommodity;
    }

    public void setFlightNoList(final List<String> pFlightNoList) {
        this.flightNoList = pFlightNoList;
    }

    public void setInputDate(final Date pInputDate) {
        this.inputDate = ContractUtility.getClonedDate(pInputDate);
    }

    public void setProductCode(final String pProductCode) {
        this.productCode = pProductCode;
    }

    public void setSegmentDestList(final List<String> pSegmentDestList) {
        this.segmentDestList = pSegmentDestList;
    }

    public void setSegmentOriginList(final List<String> pSegmentOriginList) {
        this.segmentOriginList = pSegmentOriginList;
    }

    public void setSpecialHandlingCodeList(final List<String> pSpecialHandlingCodeList) {
        this.specialHandlingCodeList = pSpecialHandlingCodeList;
    }

    public void setUldType(final String pUldType) {
        this.uldType = pUldType;
    }
}
