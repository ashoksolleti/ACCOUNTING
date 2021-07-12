/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AirWaybillNumberDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>ShipmentDto</code> class represents the Shipment information.
 * 
 */
public class ShipmentDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>awbOID</code> property.
     */
    private Long awbOID;

    /**
     * Attribute to hold <code>awbCreationTimeStamp</code> property.
     */
    private Date awbCreationTimeStamp;

    /**
     * Attribute to hold <code>AwbNumber</code> property.
     */
    private AirWaybillNumberDto airWaybillNumberDto;

    /**
     * Attribute to hold <code>discrepancyGoodsDetailsDto</code> property.
     */
    private DiscrepancyGoodsDetailsDto discrepancyGoodsDetailsDto;

    /**
     * Attribute to hold <code>securityInformation</code> property.
     */
    private List<SecurityInformationDto> securityInformationDtos;

    /**
     * Attribute to hold <code>goodsDtos</code> property.
     */
    private List<GoodsDto> goodsDtos;

    /**
     * Attribute to hold <code>securityTendingInformationDtos</code> property.
     */
    private List<SecurityTenderingInformationDto> securityTendingInformationDtos;

    /**
     * Attribute to hold <code>securityScreeningInformationDtos</code> property.
     */
    private List<SecurityScreeningInformationDto> securityScreeningInformationDtos;

    private List<DiscrepancyGoodsDto> DiscrepancyGoodsDtos;
    
    private List<DangerousGoodsDto> dangerousGoodsDtos;
    
    private String dgPreparedBy;
      
    
    // Added for PLT – UCG022 – Start
    /**
     * Attribute to hold <code>startPieceId</code> property.
     */
    private Integer startPieceId;
    // Added for PLT – UCG022 – End

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>OId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>OId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Gets the value of the <code>awbOID</code> property.
     * <p>
     *
     * @return Returns the current value of <code>awbOID</code> property.
     */
    public Long getAwbOID() {
        return awbOID;
    }

    /**
     * Sets the value of the <code>awbOID</code> property.
     * <p>
     *
     * @param <code>awbOID</code> Holds the new value of the <code>awbOID</code> property.
     */
    public void setAwbOID(Long awbOID) {
        this.awbOID = awbOID;
    }

    /**
     * Gets the <code>AwbCreationTimeStamp</code> property.
     * <p>
     * 
     * @return the current value of the <code>AwbCreationTimeStamp</code> property.<br>
     */
    public Date getAwbCreationTimeStamp() {
        if(this.awbCreationTimeStamp!=null){
            return (Date)this.awbCreationTimeStamp.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Sets the <code>AwbCreationTimeStamp</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>AwbCreationTimeStamp</code> property.<br>
     */
    public void setAwbCreationTimeStamp(final Date pAwbCreationTimeStamp) {
        if(pAwbCreationTimeStamp!=null){
        	this.awbCreationTimeStamp =(Date) pAwbCreationTimeStamp.clone();
          }
        else
        {
        	this.awbCreationTimeStamp=null;
        }
    }

    /**
     * Gets the <code>airWaybillNumberDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>airWaybillNumberDto</code> property.<br>
     */
    public AirWaybillNumberDto getAirWaybillNumberDto() {
        if (this.airWaybillNumberDto == null) {
            this.airWaybillNumberDto = new AirWaybillNumberDto();
        }
        return this.airWaybillNumberDto;
    }

    /**
     * Sets the <code>airWaybillNumberDto</code> property.
     * <p>
     * 
     * @param airWaybillNumberDto
     *            the current value of the <code>airWaybillNumberDto</code> property.<br>
     */
    public void setAirWaybillNumberDto(final AirWaybillNumberDto airWaybillNumberDto) {
        this.airWaybillNumberDto = airWaybillNumberDto;
    }

    /**
     * Gets the <code>airWaybillNumberDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>airWaybillNumberDto</code> property.<br>
     */
    public DiscrepancyGoodsDetailsDto getDiscrepancyGoodsDetailsDto() {
        if (this.discrepancyGoodsDetailsDto == null) {
            this.discrepancyGoodsDetailsDto = new DiscrepancyGoodsDetailsDto();
        }
        return this.discrepancyGoodsDetailsDto;
    }

    /**
     * Sets the <code>airWaybillNumberDto</code> property.
     * <p>
     * 
     * @param airWaybillNumberDto
     *            the current value of the <code>airWaybillNumberDto</code> property.<br>
     */
    public void setDiscrepancyGoodsDetailsDto(final DiscrepancyGoodsDetailsDto discrepancyGoodsDetailsDto) {
        this.discrepancyGoodsDetailsDto = discrepancyGoodsDetailsDto;
    }

    /**
     * Gets the <code>securityInformationDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>securityInformationDtos</code> property.<br>
     */
    public List<SecurityInformationDto> getSecurityInformationDtos() {
        if (this.securityInformationDtos == null) {
            this.securityInformationDtos = new ArrayList<SecurityInformationDto>();
        }
        return securityInformationDtos;
    }

    /**
     * Sets the <code>securityInformationDtos</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>securityInformationDtos</code> property.<br>
     */
    public void setSecurityInformation(
                List<SecurityInformationDto> securityInformationDtos) {
        this.securityInformationDtos = securityInformationDtos;
    }

    /**
     * Gets the <code>goodsDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>goodsDtos</code> property.<br>
     */
    public List<GoodsDto> getGoodsDtos() {
        if (this.goodsDtos == null) {
            this.goodsDtos = new ArrayList<GoodsDto>();
        }
        return goodsDtos;
    }

    /**
     * Sets the <code>goodsDtos</code> property.
     * <p>
     * 
     * @param goodsDtos
     *            the current value of the <code>goodsDtos</code> property.<br>
     */
    public void setGoodsDtos(List<GoodsDto> goodsDtos) {
        this.goodsDtos = goodsDtos;
    }

    /**
     * Gets the value of the <code>securityTendingInformationDtos</code> property.
     * <p>
     *
     * @return Returns the current value of <code>securityTendingInformationDtos</code> property.
     */
    public List<SecurityTenderingInformationDto> getSecurityTendingInformationDtos() {
        return securityTendingInformationDtos;
    }

    /**
     * Sets the value of the <code>securityTendingInformationDtos</code> property.
     * <p>
     *
     * @param <code>securityTendingInformationDtos</code> Holds the new value of the
     *        <code>securityTendingInformationDtos</code> property.
     */
    public void setSecurityTendingInformationDtos(
                List<SecurityTenderingInformationDto> securityTendingInformationDtos) {
        this.securityTendingInformationDtos = securityTendingInformationDtos;
    }

    /**
     * Gets the value of the <code>securityScreeningInformationDtos</code> property.
     * <p>
     *
     * @return Returns the current value of <code>securityScreeningInformationDtos</code> property.
     */
    public List<SecurityScreeningInformationDto> getSecurityScreeningInformationDtos() {
        return securityScreeningInformationDtos;
    }

    /**
     * Sets the value of the <code>securityScreeningInformationDtos</code> property.
     * <p>
     *
     * @param <code>securityScreeningInformationDtos</code> Holds the new value of the
     *        <code>securityScreeningInformationDtos</code> property.
     */
    public void setSecurityScreeningInformationDtos(
                List<SecurityScreeningInformationDto> securityScreeningInformationDtos) {
        this.securityScreeningInformationDtos = securityScreeningInformationDtos;
    }

    /**
     * Gets the value of the <code>DiscrepancyGoodsDtos</code> property.
     * <p>
     *
     * @return Returns the current value of <code>DiscrepancyGoodsDtos</code> property.
     */
    public List<DiscrepancyGoodsDto> getDiscrepancyGoodsDtos() {
        return DiscrepancyGoodsDtos;
    }

    /**
     * Sets the value of the <code>DiscrepancyGoodsDtos</code> property.
     * <p>
     *
     * @param <code>discrepancyGoodsDtos</code> Holds the new value of the <code>DiscrepancyGoodsDtos</code>
     *        property.
     */
    public void setDiscrepancyGoodsDtos(
                List<DiscrepancyGoodsDto> discrepancyGoodsDtos) {
        DiscrepancyGoodsDtos = discrepancyGoodsDtos;
    }
    /**
     * Gets the value of the <code>dangerousGoodsDtos</code> property.
     * <p>
     *
     * @return Returns the current value of <code>dangerousGoodsDtos</code> property.
     */
    public List<DangerousGoodsDto> getDangerousGoodsDtos() {
        return dangerousGoodsDtos;
    }
    /**
     * Sets the value of the <code>dangerousGoodsDtos</code> property.
     * <p>
     *
     * @param <code>dangerousGoodsDtos</code> Holds the new value of the <code>dangerousGoodsDtos</code>
     *        property.
     */
    public void setDangerousGoodsDtos(List<DangerousGoodsDto> dangerousGoodsDtos) {
        this.dangerousGoodsDtos = dangerousGoodsDtos;
    }

    /**
     * Gets the value of the <code>dgPreparedBy</code> property.
     * <p>
     *
     * @return Returns the current value of <code>dgPreparedBy</code> property.
     */
    public String getDgPreparedBy() {
        return dgPreparedBy;
    }

    /**
     * Sets the value of the <code>dgPreparedBy</code> property.
     * <p>
     *
     * @param <code>dgPreparedBy</code>
     *        Holds the new value of the <code>dgPreparedBy</code> property.
     */
    public void setDgPreparedBy(String dgPreparedBy) {
        this.dgPreparedBy = dgPreparedBy;
    }

    /**
     * Sets the value of the <code>securityInformationDtos</code> property.
     * <p>
     *
     * @param <code>securityInformationDtos</code>
     *        Holds the new value of the <code>securityInformationDtos</code> property.
     */
    public void setSecurityInformationDtos(List<SecurityInformationDto> securityInformationDtos) {
        this.securityInformationDtos = securityInformationDtos;
    }

   

    // Added for PLT – UCG022 – Start
    /**
     * Gets the <code>startPieceId</code> property.
     * <p>
     * 
     * @return the current value of the <code>startPieceId</code> property.
     */
    public Integer getStartPieceId() {
        return this.startPieceId;
    }

    /**
     * Sets the <code>startPieceId</code> property.
     * <p>
     * 
     * @param pStartPieceId
     *            the current value of the <code>pStartPieceId</code> property.
     */
    public void setStartPieceId(final Integer pStartPieceId) {
        this.startPieceId = pStartPieceId;
    }
    // Added for PLT – UCG022 – End

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}
}
