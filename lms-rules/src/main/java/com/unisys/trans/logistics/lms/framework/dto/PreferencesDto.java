package com.unisys.trans.logistics.lms.framework.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.preferences.ControlReceiptPreferencesDto;
import com.unisys.trans.logistics.lms.framework.preferences.ULDInformationPreferencesDto;
import com.unisys.trans.logistics.lms.framework.preferences.RestrictionDetailDto;
import com.unisys.trans.logistics.lms.framework.preferences.SimplifiedDetailsRestrictionDto;
import com.unisys.trans.logistics.lms.framework.preferences.SimplifiedRestrictionTypeDto;

/**
 * <code>PreferencesDto</code> entity contains specific data applicable to the
 * Preferences of various entity.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>itinerraryDto</li>
 * <li>oId</li>
 * <li>orderDto</li>
 * <li>revenueDto</li>
 * <li>rowIndex</li>
 * </code>
 * <ul>
 */
public class PreferencesDto extends PersistenceObjectDto {
    /**
     * Unique Serial version UID.
     */
    private static final long serialVersionUID = 7896092850510115255L;


    private String contextmenuInboundStatus;



    private boolean documentImportedAndMisingInd;

    /**
     * Attribute to hold the <code>documentMissingColor</code> property.
     */
    private String documentMissingColor;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>airwaybillDto</code> property.
     */
    private AWBIATARulesDto airwaybillDto;

    /**
     * Attribute to hold the <code>rowIndex</code> property.
     */
    private String rowColor;

    /**
     * Attribute to hold the <code>rowIndex</code> property.
     */
    private String rowIndex;

    /**
     * Attribute to holds <code>rowSelect</code> property.
     */
    private boolean rowSelect;

    private List<String> shipmentHistoryTextDto;

    /**
     * indicates this returned object is from successful(0), failed(-1) or
     * warning(1) response.
     */
    private int statusIndicator = 2;
    
    private Long awbReferenceOid;

    private SimplifiedDetailsRestrictionDto simplifiedDetailsRestrictionDto;

    private RestrictionDetailDto restrictionDetails;

    private SimplifiedRestrictionTypeDto simplifiedStationRestrictionDetails;

    private List<SimplifiedRestrictionTypeDto> simplifiedStationRestrictionDetail;

    public String getContextmenuInboundStatus() {
        return contextmenuInboundStatus;
    }

    /**
     * Get the <code>documentMissingColor</code>
     * 
     * @return
     */
    public String getDocumentMissingColor() {
        return documentMissingColor;
    }



    /**
     * Gets the <code>oId</code> property.
     * <p>
     *
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return oId;
    }

    public String getRowColor() {
        return rowColor;
    }

    /**
     * Get the <code>rowIndex</code>
     *
     * @return the current value of the <code>rowIndex</code> property.
     */
    public String getRowIndex() {
        return rowIndex;
    }

    public List<String> getShipmentHistoryTextDto() {
        return shipmentHistoryTextDto;
    }

    /**
     * Gets the <code>statusIndicator</code> property.
     * <p>
     *
     * @return the current value of the <code>statusIndicator</code> property.
     */
    public int getStatusIndicator() {
        return statusIndicator;
    }

    /**
     * @return the documentImportedAndMisingInd
     */
    public boolean isDocumentImportedAndMisingInd() {
        return documentImportedAndMisingInd;
    }

    public boolean isRowSelect() {
        return rowSelect;
    }


    public void setContextmenuInboundStatus(
                final String contextmenuInboundStatus) {
        this.contextmenuInboundStatus = contextmenuInboundStatus;
    }


    /**
     * @param documentImportedAndMisingInd the documentImportedAndMisingInd to set
     */
    public void setDocumentImportedAndMisingInd(final boolean documentImportedAndMisingInd) {
        this.documentImportedAndMisingInd = documentImportedAndMisingInd;
    }

    /**
     * Set the <code>documentMissingColor</code>
     * 
     * @param documentMissingColor
     */
    public void setDocumentMissingColor(String documentMissingColor) {
        this.documentMissingColor = documentMissingColor;
    }


    /**
     * Sets the <code>oId</code> property.
     * <p>
     *
     * @param pOId
     *            the current value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        oId = pOId;
    }



    public void setRowColor(final String pRowColor) {
        rowColor = pRowColor;
    }

    /**
     * Sets the <code>rowIndex</code> property.
     * <p>
     *
     * @param pRowIndex
     *            the current value of the <code>rowIndex</code> property.
     */
    public void setRowIndex(final String pRowIndex) {
        rowIndex = pRowIndex;
    }

    public void setRowSelect(final boolean rowSelect) {
        this.rowSelect = rowSelect;
    }

    public void setShipmentHistoryTextDto(
                final List<String> shipmentHistoryTextDto) {
        this.shipmentHistoryTextDto = shipmentHistoryTextDto;
    }

    /**
     * Sets the <code>statusIndicator</code> property.
     * <p>
     *
     * @param pStatusIndicator
     *            the current value of the <code>statusIndicator</code> property.
     */
    public void setStatusIndicator(final int pStatusIndicator) {
        statusIndicator = pStatusIndicator;
    }


    /**
     * @return the awbReferenceOid
     */
    public Long getAwbReferenceOid() {
        return awbReferenceOid;
    }

    /**
     * @param awbReferenceOid the awbReferenceOid to set
     */
    public void setAwbReferenceOid(Long awbReferenceOid) {
        this.awbReferenceOid = awbReferenceOid;
    }
    
    public SimplifiedDetailsRestrictionDto getSimplifiedDetailsRestrictionDto() {
        return simplifiedDetailsRestrictionDto;
    }

    public void setSimplifiedDetailsRestrictionDto(SimplifiedDetailsRestrictionDto simplifiedDetailsRestrictionDto) {
        this.simplifiedDetailsRestrictionDto = simplifiedDetailsRestrictionDto;
    }

    public RestrictionDetailDto getRestrictionDetails() {
        return restrictionDetails;
    }

    public void setRestrictionDetails(RestrictionDetailDto restrictionDetails) {
        this.restrictionDetails = restrictionDetails;
    }

    public SimplifiedRestrictionTypeDto getSimplifiedStationRestrictionDetails() {
        return simplifiedStationRestrictionDetails;
    }

    public void setSimplifiedStationRestrictionDetails(SimplifiedRestrictionTypeDto simplifiedStationRestrictionDetails) {
        this.simplifiedStationRestrictionDetails = simplifiedStationRestrictionDetails;
    }

    public List<SimplifiedRestrictionTypeDto> getSimplifiedStationRestrictionDetail() {
        return simplifiedStationRestrictionDetail;
    }

    public void setSimplifiedStationRestrictionDetail(List<SimplifiedRestrictionTypeDto> simplifiedStationRestrictionDetail) {
        this.simplifiedStationRestrictionDetail = simplifiedStationRestrictionDetail;
    }
    
    // LMSC-11111 UIS158 Start
    private ULDInformationPreferencesDto uldInformationPreferencesDto;
    
    public ULDInformationPreferencesDto getUldInformationPreferencesDto() {
        return uldInformationPreferencesDto;
    }

    public void setUldInformationPreferencesDto(
            final ULDInformationPreferencesDto uldInformationPreferencesDto) {
    	this.uldInformationPreferencesDto = uldInformationPreferencesDto;
    }
    
    private ControlReceiptPreferencesDto controlReceiptPreferencesDto;
    
    public ControlReceiptPreferencesDto getControlReceiptPreferencesDto() {
        return controlReceiptPreferencesDto;
    }
    
    public void setControlReceiptPreferencesDto(
            final ControlReceiptPreferencesDto controlReceiptPreferencesDto) {
    this.controlReceiptPreferencesDto = controlReceiptPreferencesDto;
}
    // LMSC-11111 UIS158 End
}
