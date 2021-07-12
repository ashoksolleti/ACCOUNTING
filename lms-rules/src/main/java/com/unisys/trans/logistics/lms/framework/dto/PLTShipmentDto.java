package com.unisys.trans.logistics.lms.framework.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class PLTShipmentDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>airWaybillNumber</code> property.
     */
    private AirWaybillNumberDto airWaybillNumber;

    /**
     * Attribute to hold <code>autoGenerationPerformed</code> property.
     */
    private boolean autoGenerationPerformed;

    /**
     * Attribute to hold <code>awbCreationTimeStamp</code> property.
     */
    private Date awbCreationTimeStamp;

    /**
     * Attribute to hold <code>awbOID</code> property.
     */
    private Long awbOId;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>pieceIdDetails</code> property.
     */
    private List<PieceIdDetailDto> pieceIdDetails;

    /**
     * Attribute to hold <code>awbDbKey</code> property.
     */
    private String awbDbKey;
    /**
     * Gets the <code>airWaybillNumber</code> property.
     * 
     * @return the current value of the <code>airWaybillNumber</code> property.
     */
    public AirWaybillNumberDto getAirWaybillNumber() {
        return this.airWaybillNumber;
    }

    /**
     * Gets the <code>awbCreationTimeStamp</code> property.
     * 
     * @return the current value of the <code>awbCreationTimeStamp</code> property.
     */
    public Date getAwbCreationTimeStamp() {
        return ContractUtility.getClonedDate(this.awbCreationTimeStamp);
    }

    /**
     * Gets the value of the <code>awbOId</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>awbOId</code> property.
     */
    public Long getAwbOId() {
        return this.awbOId;
    }

    /**
     * Gets the value of the <code>oId</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the value of the <code>pieceIdDetails</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>pieceIdDetails</code> property.
     */
    public List<PieceIdDetailDto> getPieceIdDetails() {
        return this.pieceIdDetails;
    }

    /**
     * Gets the <code>autoGenerationPerformed</code> property.
     * <p>
     * 
     * @return the current value of the <code>autoGenerationPerformed</code> property.
     */
    public boolean isAutoGenerationPerformed() {
        return this.autoGenerationPerformed;
    }

    /**
     * Sets the <code>airWaybillNumber</code> property.
     * 
     * @param pAirWaybillNumber
     *            the current value of the <code>pAirWaybillNumber</code> property.
     */
    public void setAirWaybillNumber(final AirWaybillNumberDto pAirWaybillNumber) {
        this.airWaybillNumber = pAirWaybillNumber;
    }

    /**
     * Sets the <code>autoGenerationPerformed</code> property.
     * <p>
     * 
     * @param pAutoGenerationPerformed
     *            the current value of the <code>autoGenerationPerformed</code> property.
     */
    public void setAutoGenerationPerformed(final boolean pAutoGenerationPerformed) {
        this.autoGenerationPerformed = pAutoGenerationPerformed;
    }

    /**
     * Sets the <code>awbCreationTimeStamp</code> property.
     * 
     * @param pAwbCreationTimeStamp
     *            the current value of the <code>pAwbCreationTimeStamp</code> property.
     */
    public void setAwbCreationTimeStamp(final Date pAwbCreationTimeStamp) {
        this.awbCreationTimeStamp = ContractUtility.getClonedDate(pAwbCreationTimeStamp);
    }

    /**
     * Sets the value of the <code>awbOId</code> property.
     * <p>
     * 
     * @param <code>awbOId</code> Holds the new value of the <code>awbOId</code> property.
     */
    public void setAwbOId(final Long pAwbOId) {
        this.awbOId = pAwbOId;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>oId</code>.It is of type Long.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>pieceIdDetail</code> property.
     * <p>
     * Unique key to identify the <code>pieceIdDetais</code>.It is of type Long.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>pieceIdDetail</code> property.<br>
     */
    public void setPieceIdDetails(final List<PieceIdDetailDto> pPieceIdDetails) {
        this.pieceIdDetails = pPieceIdDetails;
    }

	public String getAwbDbKey() {
		return awbDbKey;
	}

	public void setAwbDbKey(String awbDbKey) {
		this.awbDbKey = awbDbKey;
	}

}
