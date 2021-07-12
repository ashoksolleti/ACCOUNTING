package com.unisys.trans.logistics.lms.framework.preferences;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AirWaybillNumberDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>RevenueDto</code> entity contains specific data applicable to the
 * Preferences related to Revenue.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>awbEventGrossRevenue</li>
 * <li>awbEventHostRevenue</li>
 * <li>awbEventProrationReasonCode</li>
 * <li>awbEventTotalRate</li>
 * <li>bookingEventGrossRevenue</li>
 * <li>bookingEventHostCostAmount</li>
 * <li>bookingEventHostCostRate</li>
 * <li>bookingEventHostHurdleAmount</li>
 * <li>bookingEventHostHurdleRate</li>
 * <li>bookingEventHostRevenue</li>
 * <li>bookingEventHurdleRateProduct</li>
 * <li>bookingEventHurdleRateReasonCode</li>
 * <li>bookingEventHurdleRateStatus</li>
 * <li>bookingEventRevenueRate</li>
 * <li>bookingEventTotalRate</li>
 * <li>bookingSegmentCarrierRevenue</li>
 * <li>bookingSegmentChargeableweight</li>
 * <li>bookingSegmentDestination</li>
 * <li>bookingSegmentFlight</li>
 * <li>bookingSegmentFlightDate</li>
 * <li>bookingSegmentGrossWeight</li>
 * <li>bookingSegmentMileage</li>
 * <li>bookingsegmentOrigin</li>
 * <li>bookingSegmentPieces</li>
 * <li>multipleSpaIndicator</li>
 * <li>oId</li>
 * <li>prorationId</li>
 * <li>prorationMethod</li>
 * <li>revenueSubLevelDto</li>
 * <li>revenueSubLevelDtoList</li>
 * <li>segmentMileagePercent</li>
 * </code>
 * </ul>
 */
public class ULDDiscrepancyPreferencesDto extends PersistenceObjectDto {

	/**
     * 
     */
	private static final long serialVersionUID = 1L;

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}

	private int balancePieces;

	private Date creationTimeStamp;

	private String discrepancyStation;

	private String discrepancyType;

	private Date flightDate;

	private String flightNumber;

	private String location;

	private String offload;

	private int pieces;

	private String remarks;

	private String goodsSpecialHandlingCode;

	private BigDecimal weight;

	private String containerId;

	private String dctlStation;

	private Long awbOID;

	private AirWaybillNumberDto airwaybillNumberDto;

	private String description;

	public Long getAwbOID() {
		return awbOID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setAwbOID(Long awbOID) {
		this.awbOID = awbOID;
	}

	/**
	 * @return the dctlStation
	 */
	public String getDctlStation() {
		return dctlStation;
	}

	/**
	 * @param dctlStation
	 *            the dctlStation to set
	 */
	public void setDctlStation(String dctlStation) {
		this.dctlStation = dctlStation;
	}

	public AirWaybillNumberDto getAirwaybillNumberDto() {
		if (this.airwaybillNumberDto == null) {
			this.airwaybillNumberDto = new AirWaybillNumberDto();
		}
		return airwaybillNumberDto;
	}

	public void setAirwaybillNumberDto(AirWaybillNumberDto airwaybillNumberDto) {
		this.airwaybillNumberDto = airwaybillNumberDto;
	}

	/**
	 * @return the containerId
	 */
	public String getContainerId() {
		return containerId;
	}

	/**
	 * @param containerId
	 *            the containerId to set
	 */
	public void setContainerId(String containerId) {
		this.containerId = containerId;
	}



	/**
	 * @return the creationTimeStamp
	 */
	public Date getCreationTimeStamp() {
		if(creationTimeStamp!=null){
	        return (Date)creationTimeStamp.clone();
	        }
	        else{
	            return null;
	        }
	}

	/**
	 * @param creationTimeStamp
	 *            the creationTimeStamp to set
	 */
	public void setCreationTimeStamp(Date creationTimeStamp) {
		if(creationTimeStamp!=null){
			this.creationTimeStamp =(Date) creationTimeStamp.clone();
          }
        else{
        	this.creationTimeStamp =null;	
        }
	}

	public int getBalancePieces() {
		return balancePieces;
	}

	public void setBalancePieces(int balancePieces) {
		this.balancePieces = balancePieces;
	}

	/**
	 * @return the discrepancyStation
	 */
	public String getDiscrepancyStation() {
		return discrepancyStation;
	}

	/**
	 * @param discrepancyStation
	 *            the discrepancyStation to set
	 */
	public void setDiscrepancyStation(String discrepancyStation) {
		this.discrepancyStation = discrepancyStation;
	}

	/**
	 * @return the discrepancyType
	 */
	public String getDiscrepancyType() {
		return discrepancyType;
	}

	/**
	 * @param discrepancyType
	 *            the discrepancyType to set
	 */
	public void setDiscrepancyType(String discrepancyType) {
		this.discrepancyType = discrepancyType;
	}

	/**
	 * @return the flightDate
	 */
	public Date getFlightDate() {
		if(flightDate!=null){
	        return (Date)flightDate.clone();
	        }
	        else{
	            return null;
	        }
	}

	/**
	 * @param flightDate
	 *            the flightDate to set
	 */
	public void setFlightDate(Date flightDate) {
		if(flightDate!=null){
			this.flightDate =(Date) flightDate.clone();
          }
        else{
        	this.flightDate =null;	
        }
	}

	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * @param flightNumber
	 *            the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the offload
	 */
	public String getOffload() {
		return offload;
	}

	/**
	 * @param offload
	 *            the offload to set
	 */
	public void setOffload(String offload) {
		this.offload = offload;
	}

	/**
	 * @return the pieces
	 */
	public int getPieces() {
		return pieces;
	}

	/**
	 * @param pieces
	 *            the pieces to set
	 */
	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks
	 *            the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the goodsSpecialHandlingCode
	 */
	public String getGoodsSpecialHandlingCode() {
		return goodsSpecialHandlingCode;
	}

	/**
	 * @param goodsSpecialHandlingCode
	 *            the goodsSpecialHandlingCode to set
	 */
	public void setGoodsSpecialHandlingCode(String goodsSpecialHandlingCode) {
		this.goodsSpecialHandlingCode = goodsSpecialHandlingCode;
	}

	/**
	 * @return the weight
	 */
	public BigDecimal getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
