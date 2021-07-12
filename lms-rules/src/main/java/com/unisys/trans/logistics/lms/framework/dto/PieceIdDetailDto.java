package com.unisys.trans.logistics.lms.framework.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.ChannelType;
import com.unisys.trans.logistics.lms.framework.constants.OperationsSourceType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>PieceIddetailDto</code> class contain information specific to a Piece Id.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>baseFlight
 * <li>oId
 * <li>flightDate
 * <li>airWaybillNumberDto
 * <li>pieceId
 * <li>capacity
 * <li>dimension
 * <li>customerPieceId
 * <li>rfidTagNumber
 * <li>houseId
 * <li>splCodes
 * <li>splCode1
 * <li>splCode2
 * <li>scanIndicator
 * <li>description
 * <li>verifiedIndicator
 * <li>selectInd
 * <li>rowIndex
 * </code>
 * </ul>
 */
public class PieceIdDetailDto extends PersistenceObjectDto {
    /**
     * unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>baseFlight</code> property.
     */
    private BaseFlightDto baseFlight;
    private AirWaybillNumberDto airWaybillNumberDto;
    /**
     * Attribute to hold <code>capacity</code> property.
     */
    private PLTCapacityDto capacity;

    /**
     * Attribute to hold <code>changed</code> property.
     */
    private boolean changed;

    /**
     * Attribute to hold <code>creationChannelType</code> property.
     */
    private ChannelType creationChannelType;

    /**
     * Attribute to hold <code>creationSourceType</code> property.
     */
    private OperationsSourceType creationSourceType;

    /**
     * Attribute to hold the <code>customerPieceID</code> property.
     */
    private String customerPieceId;

    /**
     * Attribute to hold the <code>description</code> property.
     */
    private String description;

    /**
     * Attribute to hold <code>dimension</code> property.
     */
    private PieceIdDimensionDto dimension;

    /**
     * Attribute to hold <code>flightDate</code> property.
     */
    private Date flightDate;

    /**
     * Attribute to hold <code>goodsOId</code> property.
     */
    private Long goodsOId;

    /**
     * Attribute to hold the <code>houseId</code> property.
     */
    private String houseId;

    /**
     * Attribute to hold <code>location</code> property.
     */
    private String location;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>pieceId</code> property.
     */
    private String pieceId;

    /**
     * Attribute to hold the <code>pLTShipmentDto</code> property.
     */
    private PLTShipmentDto pLTShipmentDto;

    /**
     * Attribute to hold the <code>rfidTagNumber</code> property.
     */
    private String rfidTagNumber;

    /**
     * Attribute to hold <code>scanIndicator</code> property.
     */
    private String rowIndex;
	private boolean scanIndicator;

    /**
     * Attribute to hold the <code>selectInd</code> property.
     */
    private boolean selectInd;

    /**
     * Attribute to hold the <code> splCode1</code> property.
     */
    private String splCode1;

    /**
     * Attribute to hold the <code>splCode2</code> property.
     */
    private String splCode2;

    /**
     * Attribute to hold the <code>splCode2</code> property.
     */
    private String splCode3;
    
    public String getSplCode3() {
		return splCode3;
	}

	public void setSplCode3(String splCode3) {
		this.splCode3 = splCode3;
	}

	public String getSplCode4() {
		return splCode4;
	}

	public void setSplCode4(String splCode4) {
		this.splCode4 = splCode4;
	}

	public String getSplCode5() {
		return splCode5;
	}

	public void setSplCode5(String splCode5) {
		this.splCode5 = splCode5;
	}

	/**
     * Attribute to hold the <code>splCode2</code> property.
     */
    private String splCode4;
    
    /**
     * Attribute to hold the <code>splCode2</code> property.
     */
    private String splCode5;
    
    /**
     * Attribute to hold the <code>splCodes</code> property.
     */
    private List<String> splCodes;

    /**
     * Attribute to hold the <code>status</code> property.
     */
    private String status;

    /**
     * Attribute to hold <code>updationChannelType</code> property.
     */
    private ChannelType updationChannelType;

    /**
     * Attribute to hold <code>updationSourceType</code> property.
     */
    private OperationsSourceType updationSourceType;

    /**
     * Attribute to hold the <code>verifiedInd</code> property.
     */
    private boolean verifiedIndicator;

    /**
     * Attribute to hold <code>goodsDbKey</code> property.
     */
    private String goodsDbKey;
    
    /**
     * Attribute to hold the <code>selectInd</code> property.
     */
    private boolean associatedInd;
    
    /**
     * Default constructor
     */
    
    /**
     * Attribute to hold the <code>weightNotAvailable</code> property.
     */
    private boolean weightNotAvailable;
    /**
     * Attribute to hold the <code>weightNotAvailable</code> property.
     */
    private boolean volumeNotAvailable;
    
    /**
     * Attribute to hold the <code>weightAlreadyExists</code> property.
     */
    private boolean weightAlreadyExists;
    
    private String goodsLink;
    private List<Integer> pieceIds;
    
    /**
     * Attribute to hold the <code>status</code> property.
     */
    private String source;
    
    public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public List<Integer> getPieceIds() {
		return pieceIds;
	}

	public void setPieceIds(List<Integer> pieceIds) {
		this.pieceIds = pieceIds;
	}

	public String getGoodsLink() {
		return goodsLink;
	}

	public void setGoodsLink(String goodsLink) {
		this.goodsLink = goodsLink;
	}

	public boolean isWeightAlreadyExists() {
		return weightAlreadyExists;
	}

	public void setWeightAlreadyExists(boolean weightAlreadyExists) {
		this.weightAlreadyExists = weightAlreadyExists;
	}

	public boolean isVolumeAlreadyExists() {
		return volumeAlreadyExists;
	}

	public void setVolumeAlreadyExists(boolean volumeAlreadyExists) {
		this.volumeAlreadyExists = volumeAlreadyExists;
	}

	/**
     * Attribute to hold the <code>volumeAlreadyExists</code> property.
     */
    private boolean volumeAlreadyExists;
    
    /**
     * Attribute to hold the <code> splCode1</code> property.
     */
    private String splCodesToDisplay;
    
    // For Goods acceptance 
    private boolean slULDIndicator;
    private Integer pieceCountForPcsExist;
    private Integer alreadyAcceptedPcsCount;
    private Integer alreadyAcceptedLooseGoodsCount;
    private Integer noOfPieceAtLocation;
    private boolean verificationCheck;
    private boolean barcodeLabelPrintReq;
    private String splhandCodes;
    
    public boolean isSlULDIndicator() {
		return slULDIndicator;
	}

	public void setSlULDIndicator(boolean slULDIndicator) {
		this.slULDIndicator = slULDIndicator;
	}

	public Integer getPieceCountForPcsExist() {
		return pieceCountForPcsExist;
	}

	public void setPieceCountForPcsExist(Integer pieceCountForPcsExist) {
		this.pieceCountForPcsExist = pieceCountForPcsExist;
	}

	public Integer getAlreadyAcceptedPcsCount() {
		return alreadyAcceptedPcsCount;
	}

	public void setAlreadyAcceptedPcsCount(Integer alreadyAcceptedPcsCount) {
		this.alreadyAcceptedPcsCount = alreadyAcceptedPcsCount;
	}

	public Integer getAlreadyAcceptedLooseGoodsCount() {
		return alreadyAcceptedLooseGoodsCount;
	}

	public void setAlreadyAcceptedLooseGoodsCount(Integer alreadyAcceptedLooseGoodsCount) {
		this.alreadyAcceptedLooseGoodsCount = alreadyAcceptedLooseGoodsCount;
	}

	public Integer getNoOfPieceAtLocation() {
		return noOfPieceAtLocation;
	}

	public void setNoOfPieceAtLocation(Integer noOfPieceAtLocation) {
		this.noOfPieceAtLocation = noOfPieceAtLocation;
	}

	public boolean isVerificationCheck() {
		return verificationCheck;
	}

	public void setVerificationCheck(boolean verificationCheck) {
		this.verificationCheck = verificationCheck;
	}

	public boolean isBarcodeLabelPrintReq() {
		return barcodeLabelPrintReq;
	}

	public void setBarcodeLabelPrintReq(boolean barcodeLabelPrintReq) {
		this.barcodeLabelPrintReq = barcodeLabelPrintReq;
	}

	public PieceIdDetailDto() {

    }

    /**
     * Gets the <code>baseFlight</code> property.
     * <p>
     * 
     * @return the current value of the <code>baseFlight</code> property.
     */
    public BaseFlightDto getBaseFlight() {
        return this.baseFlight;
    }

    /**
     * Gets the <code>capacity</code> property.
     * <p>
     * 
     * @return the current value of the <code>capacity</code> property.
     */
    public PLTCapacityDto getCapacity() {
        if (this.capacity == null) {
            this.capacity = new PLTCapacityDto();
        }
        return this.capacity;
    }

    public AirWaybillNumberDto getAirWaybillNumberDto() {
		return airWaybillNumberDto;
	}

	public void setAirWaybillNumberDto(AirWaybillNumberDto airWaybillNumberDto) {
		this.airWaybillNumberDto = airWaybillNumberDto;
	}

	public String getRowIndex() {
		return rowIndex;
	}

	public void setRowIndex(String rowIndex) {
		this.rowIndex = rowIndex;
	}

	/**
     * Gets the <code>creationChannelType</code> property.
     * <p>
     * 
     * @return the current value of the <code>creationChannelType</code> property.
     */
    public ChannelType getCreationChannelType() {
        return this.creationChannelType;
    }

    /**
     * Gets the <code>creationSourceType</code> property.
     * <p>
     * 
     * @return the current value of the <code>creationSourceType</code> property.
     */
    public OperationsSourceType getCreationSourceType() {
        return this.creationSourceType;
    }

    /**
     * Gets the <code>customerPieceID</code> property.
     * <p>
     * 
     * @return the current value of the <code>customerPieceID</code> property.
     */
    public String getCustomerPieceId() {
        return this.customerPieceId;
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
     * Gets the <code>dimension</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of the <code>dimension</code> property.
     */
    public PieceIdDimensionDto getDimension() {
        if (this.dimension == null) {
            this.dimension = new PieceIdDimensionDto();
        }
        return this.dimension;
    }

    /**
     * Gets the <code>flightDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightDate</code> property.
     */
    public Date getFlightDate() {
        return ContractUtility.getClonedDate(this.flightDate);
    }

    /**
     * Gets the <code>goodsOId</code> property.
     * <p>
     * 
     * @return the current value of the <code>goodsOId</code> property.
     */
    public Long getGoodsOId() {
        return this.goodsOId;
    }

    /**
     * Gets the <code>houseId</code> property.
     * <p>
     * 
     * @return the current value of the <code>houseId</code> property.
     */

    public String getHouseId() {
        return this.houseId;
    }

    /**
     * Gets the <code>location</code> property.
     * <p>
     * 
     * @return the current value of the <code>location</code> property.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>PieceId</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>pieceId</code> property.
     * <p>
     * 
     * @return the current value of the <code>pieceId</code> property.
     */

    public String getPieceId() {
        return this.pieceId;
    }

    /**
     * Gets the <code>pLTShipmentDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>pLTShipmentDto</code> property.
     */
    public PLTShipmentDto getpLTShipmentDto() {
        return this.pLTShipmentDto;
    }

    /**
     * Gets the <code>rfidTagNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>rfidTagNumber</code> property.
     */
    public String getRfidTagNumber() {
        return this.rfidTagNumber;
    }

    /**
     * Gets the <code>selectInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>selectInd</code> property.
     */
    public boolean getSelectInd() {
        return this.selectInd;
    }

    /**
     * Gets the <code>splCode1</code> property.
     * <p>
     * 
     * @return the current value of the <code>splCode1</code> property.
     */
    public String getSplCode1() {
        return this.splCode1;
    }

    /**
     * Gets the <code>splCode2</code> property.
     * <p>
     * 
     * @return the current value of the <code>splCode2</code> property.
     */
    public String getSplCode2() {
        return this.splCode2;
    }

    /**
     * Gets the <code>splCodes</code> property.
     * <p>
     * 
     * @return the current value of the <code>splCodes</code> property.
     */
    public List<String> getSplCodes() {
        if (this.splCodes == null) {
            this.splCodes = new ArrayList<String>();
        }
        return this.splCodes;
    }

    /**
     * Gets the <code>status</code> property.
     * <p>
     * 
     * @return the current value of the <code>status</code> property.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Gets the <code>updationChannelType</code> property.
     * <p>
     * 
     * @return the current value of the <code>updationChannelType</code> property.
     */
    public ChannelType getUpdationChannelType() {
        return this.updationChannelType;
    }

    /**
     * Gets the <code>updationSourceType</code> property.
     * <p>
     * 
     * @return the current value of the <code>updationSourceType</code> property.
     */
    public OperationsSourceType getUpdationSourceType() {
        return this.updationSourceType;
    }

    /**
     * Gets the <code>verifiedInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>verifiedInd</code> property.
     */
    public boolean getVerifiedIndicator() {
        return this.verifiedIndicator;
    }

    /**
     * Gets the <code>changed</code> property.
     * <p>
     * 
     * @return the current value of the <code>changed</code> property.
     */
    public boolean isChanged() {
        return ((this.getCapacity() != null && this.getCapacity().isChanged()) ||
                    (this.getDimension() != null && this.getDimension().isChanged()) || this.changed);
       
    }

    /**
     * Gets the <code>scanIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>scanIndicator</code> property.
     */
    public boolean isScanIndicator() {
        return this.scanIndicator;
    }

    /**
     * Sets the <code>baseFlight</code> property.
     * <p>
     * 
     * @param pBaseFlight
     *            the current value of the <code>pBaseFlight</code> property.
     */
    public void setBaseFlight(final BaseFlightDto pBaseFlight) {
        this.baseFlight = pBaseFlight;
    }

    /**
     * Sets the <code>capacity</code> property.
     * <p>
     * 
     * @param pCapacity
     *            the current value of the <code>capacity</code> property.
     */
    public void setCapacity(final PLTCapacityDto pCapacity) {
        this.capacity = pCapacity;
    }

    /**
     * Sets the <code>changed</code> property.
     * <p>
     * 
     * @param pChanged
     *            the current value of the <code>changed</code> property.
     */
    public void setChanged(final boolean pChanged) {
        this.changed = pChanged;
    }

    /**
     * Sets the <code>creationChannelType</code> property.
     * <p>
     * 
     * @param pCreationChannelType
     *            the current value of the <code>pCreationChannelType</code> property.
     */
    public void setCreationChannelType(final ChannelType pCreationChannelType) {
        this.creationChannelType = pCreationChannelType;
    }

    /**
     * Sets the <code>creationSourceType</code> property.
     * <p>
     * 
     * @param pCreationSourceType
     *            the current value of the <code>pCreationSourceType</code> property.
     */
    public void setCreationSourceType(final OperationsSourceType pCreationSourceType) {
        this.creationSourceType = pCreationSourceType;
    }

    /**
     * Sets the <code>customerPieceID</code> property.
     * <p>
     * 
     * @param pCustomerPieceID
     *            the current value of the <code>pCustomerPieceID</code> property.
     */
    public void setCustomerPieceId(final String pCustomerPieceId) {
        if (pCustomerPieceId != this.getCustomerPieceId()) {
            this.setChanged(Boolean.TRUE);
        }
        this.customerPieceId = ContractUtility.convertToUpperCase(pCustomerPieceId);
    }

    /**
     * Sets the <code>description</code> property.
     * <p>
     * 
     * @param pDescription
     *            the current value of the <code>pDescription</code> property.
     */
    public void setDescription(final String pDescription) {
        if (pDescription != this.getDescription()) {
            this.setChanged(Boolean.TRUE);
        }
        this.description = pDescription;
    }

    /**
     * Sets the <code>dimension</code> property.
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param pDimension
     *            the current value of the <code>dimension</code> property.
     */
    public void setDimension(final PieceIdDimensionDto pDimension) {
        this.dimension = pDimension;
    }

    /**
     * Sets the <code>flightDate</code> property.
     * <p>
     * 
     * @param pFlightDate
     *            the current value of the <code>pFlightDate</code> property.
     */
    public void setFlightDate(final Date pFlightDate) {
        this.flightDate = ContractUtility.getClonedDate(pFlightDate);
    }

    /**
     * Sets the <code>goodsOId</code> property.
     * <p>
     * 
     * @param pGoodsOId
     *            the current value of the <code>pGoodsOId</code> property.
     */
    public void setGoodsOId(final Long pGoodsOId) {
        this.goodsOId = pGoodsOId;
    }

    /**
     * Sets the <code>houseId</code> property.
     * <p>
     * 
     * @param pHouseId
     *            the current value of the <code>pHouseId</code> property.
     */
    public void setHouseId(final String pHouseId) {
        if (pHouseId != this.getHouseId()) {
            this.setChanged(Boolean.TRUE);
        }
        this.houseId =  ContractUtility.convertToUpperCase(pHouseId);
    }

    /**
     * Sets the <code>location </code> property.
     * <p>
     * 
     * @param pLocation
     *            the current value of the <code>pLocation</code> property.
     */
    public void setLocation(final String pLocation) {
        this.location = pLocation;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>PieceId</code>.It is of type Long.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>pieceId</code> property.
     * <p>
     * 
     * @param pPieceId
     *            the current value of the <code>pPieceId</code> property.
     */
    public void setPieceId(final String pPieceId) {
        this.pieceId = pPieceId;
    }

    /**
     * Sets the <code>pLTShipmentDto</code> property.
     * <p>
     * 
     * @param pPLTShipmentDto
     *            the current value of the <code>pPLTShipmentDto</code> property.
     */
    public void setpLTShipmentDto(final PLTShipmentDto pPLTShipmentDto) {
        this.pLTShipmentDto = pPLTShipmentDto;
    }

    /**
     * Sets the <code>rfidTagNumber</code> property.
     * <p>
     * 
     * @param pRfidTagNumber
     *            the current value of the <code>pRfidTagNumber</code> property.
     */
    public void setRfidTagNumber(final String pRfidTagNumber) {
        if (pRfidTagNumber != this.getRfidTagNumber()) {
            this.setChanged(Boolean.TRUE);
        }
        this.rfidTagNumber = ContractUtility.convertToUpperCase(pRfidTagNumber);
    }

    /**
     * Sets the <code>scanIndicator</code> property.
     * <p>
     * 
     * @param pScanIndicator
     *            the current value of the <code>scanIndicator</code> property.
     */
    public void setScanIndicator(final boolean pScanIndicator) {
        this.scanIndicator = pScanIndicator;
    }

    /**
     * Sets the <code>selectInd</code> property.
     * <p>
     * 
     * @param pSelectInd
     *            the current value of the <code>pSelectInd</code> property.
     */
    public void setSelectInd(final boolean pSelectInd) {
        this.selectInd = pSelectInd;
    }

    /**
     * Sets the <code>splCode1</code> property.
     * <p>
     * 
     * @param pSplCode1
     *            the current value of the <code>pSplCode1</code> property.
     */
    public void setSplCode1(final String pSplCode1) {
        if (pSplCode1 != this.getSplCode1()) {
            this.setChanged(Boolean.TRUE);
        }
        this.splCode1 = pSplCode1;
    }

    /**
     * Sets the <code>splCode2</code> property.
     * <p>
     * 
     * @param pSplCode2
     *            the current value of the <code>pSplCode2</code> property.
     */
    public void setSplCode2(final String pSplCode2) {
        if (pSplCode2 != this.getSplCode2()) {
            this.setChanged(Boolean.TRUE);
        }
        this.splCode2 = pSplCode2;
    }

    /**
     * Sets the <code>splCodes</code> property.
     * <p>
     * 
     * @param pSplCodes
     *            the current value of the <code>pSplCodes</code> property.
     */
    public void setSplCodes(final List<String> pSplCodes) {
        this.splCodes = pSplCodes;
    }

    /**
     * Sets the <code>status</code> property.
     * <p>
     * 
     * @param pStatus
     *            the current value of the <code>pStatus</code> property.
     */
    public void setStatus(final String pStatus) {
        this.status = pStatus;
    }

    /**
     * Sets the <code>updationChannelType</code> property.
     * <p>
     * 
     * @param pUpdationChannelType
     *            the current value of the <code>pUpdationChannelType</code> property.
     */
    public void setUpdationChannelType(final ChannelType pUpdationChannelType) {
        this.updationChannelType = pUpdationChannelType;
    }

    /**
     * Sets the <code>updationSourceType</code> property.
     * <p>
     * 
     * @param pUpdationSourceType
     *            the current value of the <code>pUpdationSourceType</code> property.
     */
    public void setUpdationSourceType(final OperationsSourceType pUpdationSourceType) {
        this.updationSourceType = pUpdationSourceType;
    }

    /**
     * Sets the <code>verifiedInd</code> property.
     * <p>
     * 
     * @param pVerifiedInd
     *            the current value of the <code>pVerifiedInd</code> property.
     */
    public void setVerifiedIndicator(final boolean pVerifiedIndicator) {
        if (pVerifiedIndicator != this.getVerifiedIndicator()) {
            this.setChanged(Boolean.TRUE);
        }
        this.verifiedIndicator = pVerifiedIndicator;
    }

    @Override
    public String toString() {

        final StringBuffer commaSeperatedValue = new StringBuffer(300);
        commaSeperatedValue.append(this.pieceId == null ? "" : this.pieceId).append(",");
        commaSeperatedValue.append(
            (this.getCapacity() == null || this.getCapacity().getWeight() == null) ? "" : this.getCapacity()
                        .getWeight()).append(",");
        commaSeperatedValue.append(
            (this.getDimension() == null || this.getDimension().getLength() == null) ? "" : this
                        .getDimension().getLength()).append(",");
        commaSeperatedValue.append(
            (this.getDimension() == null || this.getDimension().getWidth() == null) ? "" : this
                        .getDimension().getWidth()).append(",");
        commaSeperatedValue.append(
            (this.getDimension() == null || this.getDimension().getHeight() == null) ? "" : this
                        .getDimension().getHeight()).append(",");
        commaSeperatedValue.append(
            (this.getCapacity() == null || this.getCapacity().getVolume() == null) ? "" : this.getCapacity()
                        .getVolume()).append(",");
        commaSeperatedValue.append(this.customerPieceId == null ? "" : this.customerPieceId).append(",");
        commaSeperatedValue.append(this.rfidTagNumber == null ? "" : this.rfidTagNumber).append(",");
        commaSeperatedValue.append(this.houseId == null ? "" : this.houseId).append(",");
        commaSeperatedValue.append(this.splCode1 == null ? "" : this.splCode1).append(",");
        commaSeperatedValue.append(this.splCode2 == null ? "" : this.splCode2).append(",");
        commaSeperatedValue.append(this.description == null ? "" : this.description).append(",");

        if (this.verifiedIndicator) {
            commaSeperatedValue.append("Yes").append(",");
        }
        else {
            commaSeperatedValue.append("No").append(",");
        }

        return commaSeperatedValue.toString();
    }

	public String getGoodsDbKey() {
		return goodsDbKey;
	}

	public void setGoodsDbKey(String goodsDbKey) {
		this.goodsDbKey = goodsDbKey;
	}

	public boolean isAssociatedInd() {
		return associatedInd;
	}

	public void setAssociatedInd(boolean associatedInd) {
		this.associatedInd = associatedInd;
	}

	public boolean isWeightNotAvailable() {
		return weightNotAvailable;
	}

	public void setWeightNotAvailable(boolean weightNotAvailable) {
		this.weightNotAvailable = weightNotAvailable;
	}

	public boolean isVolumeNotAvailable() {
		return volumeNotAvailable;
	}

	public void setVolumeNotAvailable(boolean volumeNotAvailable) {
		this.volumeNotAvailable = volumeNotAvailable;
	}

	public String getSplCodesToDisplay() {
		return splCodesToDisplay;
	}

	public void setSplCodesToDisplay(String splCodesToDisplay) {
		this.splCodesToDisplay = splCodesToDisplay;
	}

	public String getSplhandCodes() {
		return splhandCodes;
	}

	public void setSplhandCodes(String splhandCodes) {
		this.splhandCodes = splhandCodes;
	}

}
