package com.unisys.trans.logistics.lms.framework.dto;

import com.unisys.trans.logistics.lms.framework.dto.AirWaybillDto;
import com.unisys.trans.logistics.lms.framework.dto.BookingDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.ShipmentCapacityDto;

public class PrintCargoLabelDto extends PersistenceObjectDto {

    /**
     * Attribute to hold <code>serialVersionUID</code> property.
     */
    private static final long serialVersionUID = 1L;

    private String handlingInformation;

    private AirWaybillDto airWaybillDto;

    private BookingDto bookingDto;

    private String primaryBarCode;

    private String seceondryBarCode;

    private int noOfLabels;

    private String lotLabelOption;

    private String airlineName;

    private boolean nonExistAirWaybillIndicator;

    private ShipmentCapacityDto shipmentCapacity;

    private String productServiceLevel;

    private String shipmentLabel;
    
    private long printPieces;

    private int noOfLabelsToBePrinted;
    
    // Added for PLT – UCG022 – Start
    /**
     * Attribute to hold <code>startPieceId</code> property.
     */
    private String startPieceId;
    // Added for PLT – UCG022 – End
    
    /*Changes for NAS010 starts*/
    /**
     * Attribute to hold <code>shipmentLotLabel</code> property.
     */
    private String shipmentLotLabel;
    
    /**
     * Attribute to hold <code>productCodeServiceLevel</code> property.
     */
    private String productCodeServiceLevel;
    
    /**
     * Attribute to hold <code>pieceLevelTrackingAvailableValue</code> property.
     */
    private String pieceLevelTrackingAvailableValue;
    /*Changes for NAS010 ends*/
    //DL663
    private String printFormat;
    public String getPrintFormat() {
		return printFormat;
	}

	public void setPrintFormat(String printFormat) {
		this.printFormat = printFormat;
	}

	/**
     * Gets the value of the weight attribute
     * 
     * @return Total amount of the goods weight for the air waybill.
     */
    public ShipmentCapacityDto getShipmentCapacity() {
        return shipmentCapacity;
    }

    /**
     * Sets the value of the weight attribute
     * 
     * @param pShipmentCapacityDto Total amount of the goods weight for the air waybill.
     */
    public void setShipmentCapacity(ShipmentCapacityDto pShipmentCapacityDto) {
        this.shipmentCapacity = pShipmentCapacityDto;
    }

    /**
     * Gets the value of the <code>handlingInformation</code> property.
     * <p>
     *
     * @return Returns the current value of <code>handlingInformation</code> property.
     */
    public String getHandlingInformation() {
        return handlingInformation;
    }

    /**
     * Sets the value of the <code>handlingInformation</code> property.
     * <p>
     *
     * @param <code>handlingInformation</code> Holds the new value of the <code>handlingInformation</code>
     *        property.
     */
    public void setHandlingInformation(String handlingInformation) {
        this.handlingInformation = handlingInformation;
    }

    /**
     * Gets the value of the <code>airWaybillDto</code> property.
     * <p>
     *
     * @return Returns the current value of <code>airWaybillDto</code> property.
     */
    public AirWaybillDto getAirWaybillDto() {
        return airWaybillDto;
    }

    /**
     * Sets the value of the <code>airWaybillDto</code> property.
     * <p>
     *
     * @param <code>airWaybillDto</code> Holds the new value of the <code>airWaybillDto</code> property.
     */
    public void setAirWaybillDto(AirWaybillDto airWaybillDto) {
        this.airWaybillDto = airWaybillDto;
    }

    /**
     * Gets the value of the <code>bookingDto</code> property.
     * <p>
     *
     * @return Returns the current value of <code>bookingDto</code> property.
     */
    public BookingDto getBookingDto() {
        return bookingDto;
    }

    /**
     * Sets the value of the <code>bookingDto</code> property.
     * <p>
     *
     * @param <code>bookingDto</code> Holds the new value of the <code>bookingDto</code> property.
     */
    public void setBookingDto(BookingDto bookingDto) {
        this.bookingDto = bookingDto;
    }

    /**
     * Gets the value of the <code>primaryBarCode</code> property.
     * <p>
     *
     * @return Returns the current value of <code>primaryBarCode</code> property.
     */
    public String getPrimaryBarCode() {
        return primaryBarCode;
    }

    /**
     * Sets the value of the <code>primaryBarCode</code> property.
     * <p>
     *
     * @param <code>primaryBarCode</code> Holds the new value of the <code>primaryBarCode</code> property.
     */
    public void setPrimaryBarCode(String primaryBarCode) {
        this.primaryBarCode = primaryBarCode;
    }

    /**
     * Gets the value of the <code>seceondryBarCode</code> property.
     * <p>
     *
     * @return Returns the current value of <code>seceondryBarCode</code> property.
     */
    public String getSeceondryBarCode() {
        return seceondryBarCode;
    }

    /**
     * Sets the value of the <code>seceondryBarCode</code> property.
     * <p>
     *
     * @param <code>seceondryBarCode</code> Holds the new value of the <code>seceondryBarCode</code> property.
     */
    public void setSeceondryBarCode(String seceondryBarCode) {
        this.seceondryBarCode = seceondryBarCode;
    }

    /**
     * Gets the value of the <code>noOfLabels</code> property.
     * <p>
     *
     * @return Returns the current value of <code>noOfLabels</code> property.
     */
    public int getNoOfLabels() {
        return noOfLabels;
    }

    /**
     * Sets the value of the <code>noOfLabels</code> property.
     * <p>
     *
     * @param <code>noOfLabels</code> Holds the new value of the <code>noOfLabels</code> property.
     */
    public void setNoOfLabels(int noOfLabels) {
        this.noOfLabels = noOfLabels;
    }

    /**
     * Gets the value of the <code>airlineName</code> property.
     * <p>
     *
     * @return Returns the current value of <code>airlineName</code> property.
     */
    public String getAirlineName() {
        return airlineName;
    }

    /**
     * Sets the value of the <code>airlineName</code> property.
     * <p>
     *
     * @param <code>airlineName</code> Holds the new value of the <code>airlineName</code> property.
     */
    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    /**
     * Gets the value of the <code>nonExistAirWaybillIndicator</code> property.
     * <p>
     *
     * @return Returns the current value of <code>nonExistAirWaybillIndicator</code> property.
     */
    public boolean isNonExistAirWaybillIndicator() {
        return nonExistAirWaybillIndicator;
    }

    /**
     * Sets the value of the <code>nonExistAirWaybillIndicator</code> property.
     * <p>
     *
     * @param <code>nonExistAirWaybillIndicator</code> Holds the new value of the
     *        <code>nonExistAirWaybillIndicator</code> property.
     */
    public void setNonExistAirWaybillIndicator(boolean nonExistAirWaybillIndicator) {
        this.nonExistAirWaybillIndicator = nonExistAirWaybillIndicator;
    }

    /**
     * Gets the value of the <code>productServiceLevel</code> property.
     * <p>
     *
     * @return Returns the current value of <code>productServiceLevel</code> property.
     */
    public String getProductServiceLevel() {
        return productServiceLevel;
    }

    /**
     * Sets the value of the <code>productServiceLevel</code> property.
     * <p>
     *
     * @param <code>productServiceLevel</code> Holds the new value of the <code>productServiceLevel</code>
     *        property.
     */
    public void setProductServiceLevel(String productServiceLevel) {
        this.productServiceLevel = productServiceLevel;
    }

    /**
     * Gets the value of the <code>shipmentLabel</code> property.
     * <p>
     *
     * @return Returns the current value of <code>shipmentLabel</code> property.
     */
    public String getShipmentLabel() {
        return shipmentLabel;
    }

    /**
     * Sets the value of the <code>shipmentLabel</code> property.
     * <p>
     *
     * @param <code>shipmentLabel</code> Holds the new value of the <code>shipmentLabel</code> property.
     */
    public void setShipmentLabel(String shipmentLabel) {
        this.shipmentLabel = shipmentLabel;
    }
    
    // Added for PLT – UCG022 – Start
    /**
     * Gets the <code>startPieceId</code> property.
     * <p>
     * 
     * @return the current value of the <code>startPieceId</code> property.
     */
    public String getStartPieceId() {
        return startPieceId;
    }

    /**
     * Sets the <code>startPieceId</code> property.
     * <p>
     * 
     * @param pStartPieceId
     *            the current value of the <code>pStartPieceId</code> property.
     */
    public void setStartPieceId(String pStartPieceId) {
        this.startPieceId = pStartPieceId;
    }
    // Added for PLT – UCG022 – End
    
    /*Changes for NAS010 starts*/
    /**
     * Gets the <code>shipmentLotLabel</code> property.
     * @return the current value of the <code>shipmentLotLabel</code> property.
     */
    public String getShipmentLotLabel() {
        return shipmentLotLabel;
    }

    /**
     * Sets the <code>shipmentLotLabel</code> property.
     * @param shipmentLotLabel
     *            holds the new value of <code>shipmentLotLabel</code>.<br>
     */
    public void setShipmentLotLabel(String shipmentLotLabel) {
        this.shipmentLotLabel = shipmentLotLabel;
    }

    /**
     * Gets the <code>productCodeServiceLevel</code> property.
     * @return the current value of the <code>productCodeServiceLevel</code> property.
     */
    public String getProductCodeServiceLevel() {
        return productCodeServiceLevel;
    }
    
    /**
     * Sets the <code>productCodeServiceLevel</code> property.
     * @param productCodeServiceLevel
     *            holds the new value of <code>productCodeServiceLevel</code>.<br>
     */
    public void setProductCodeServiceLevel(String productCodeServiceLevel) {
        this.productCodeServiceLevel = productCodeServiceLevel;
    }

    /**
     * @return the pieceLevelTrackingAvailableValue
     */
    public String getPieceLevelTrackingAvailableValue() {
        return pieceLevelTrackingAvailableValue;
    }

    /**
     * @param pieceLevelTrackingAvailableValue the pieceLevelTrackingAvailableValue to set
     */
    public void setPieceLevelTrackingAvailableValue(
            String pieceLevelTrackingAvailableValue) {
        this.pieceLevelTrackingAvailableValue = pieceLevelTrackingAvailableValue;
    }
    /*Changes for NAS010 ends*/

    public long getPrintPieces() {
        return printPieces;
    }

    public void setPrintPieces(final long pPrintPieces) {
        this.printPieces = pPrintPieces;
    }

    /**
     * @return the noOfLabelsToBePrinted
     */
    public int getNoOfLabelsToBePrinted() {
        return noOfLabelsToBePrinted;
    }

    /**
     * @param noOfLabelsToBePrinted the noOfLabelsToBePrinted to set
     */
    public void setNoOfLabelsToBePrinted(int noOfLabelsToBePrinted) {
        this.noOfLabelsToBePrinted = noOfLabelsToBePrinted;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @return the lotLabelOption
     */
    public String getLotLabelOption() {
        return lotLabelOption;
    }

    /**
     * @param lotLabelOption the lotLabelOption to set
     */
    public void setLotLabelOption(String lotLabelOption) {
        this.lotLabelOption = lotLabelOption;
    }
}
