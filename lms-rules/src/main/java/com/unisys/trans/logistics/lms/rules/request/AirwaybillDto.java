package com.unisys.trans.logistics.lms.rules.request;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.awb.dto.BookingDto;
import com.unisys.trans.logistics.lms.awb.dto.BookingSegmentDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;

public class AirwaybillDto extends PersistenceObjectDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3074496136563043353L;

	private String awbDestinationIataRegion;

	private BookingDto booking;

	private BookingSegmentDto bookingSegment;
	
	private String commodityCode;

	private Date createdDate;

	private String customerSegmentation;

	private String destination;

	private Date executionDateTime;

	private String identifier;

	private int numberOfPages;
	
	private Long oId;
	
	private String origin;
	
	private String productCode;

	private Integer productQueueServiceLevel;

	private List<String> specialHandlingCodes;
	private String splCodes;
	private String status;
	private String transfer;
	private UserAuditDto userAudit;
	private String userIdentifier;
	private String originIataRegion;
	
	private String awbDatabaseKey;
	
	private String updateLMSFunction;
	
	private int awbVersion;
    
    private boolean deleteInd;
        
    private boolean bookingInd;


	/**
	 * @return the awbDestinationIataRegion
	 */
	public String getAwbDestinationIataRegion() {
		return awbDestinationIataRegion;
	}

	/**
	 * @param awbDestinationIataRegion the awbDestinationIataRegion to set
	 */
	public void setAwbDestinationIataRegion(String awbDestinationIataRegion) {
		this.awbDestinationIataRegion = awbDestinationIataRegion;
	}

	/**
	 * @return the booking
	 */
	public BookingDto getBooking() {
		return booking;
	}

	/**
	 * @param booking the booking to set
	 */
	public void setBooking(BookingDto booking) {
		this.booking = booking;
	}

	/**
	 * @return the bookingSegment
	 */
	public BookingSegmentDto getBookingSegment() {
		return bookingSegment;
	}

	/**
	 * @param bookingSegment the bookingSegment to set
	 */
	public void setBookingSegment(BookingSegmentDto bookingSegment) {
		this.bookingSegment = bookingSegment;
	}

	/**
	 * @return the commodityCode
	 */
	public String getCommodityCode() {
		return commodityCode;
	}

	/**
	 * @param commodityCode the commodityCode to set
	 */
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the customerSegmentation
	 */
	public String getCustomerSegmentation() {
		return customerSegmentation;
	}

	/**
	 * @param customerSegmentation the customerSegmentation to set
	 */
	public void setCustomerSegmentation(String customerSegmentation) {
		this.customerSegmentation = customerSegmentation;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the executionDateTime
	 */
	public Date getExecutionDateTime() {
		return executionDateTime;
	}

	/**
	 * @param executionDateTime the executionDateTime to set
	 */
	public void setExecutionDateTime(Date executionDateTime) {
		this.executionDateTime = executionDateTime;
	}

	/**
	 * @return the identifier
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * @param identifier the identifier to set
	 */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	/**
	 * @return the numberOfPages
	 */
	public int getNumberOfPages() {
		return numberOfPages;
	}

	/**
	 * @param numberOfPages the numberOfPages to set
	 */
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

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

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the productCode
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * @param productCode the productCode to set
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * @return the productQueueServiceLevel
	 */
	public Integer getProductQueueServiceLevel() {
		return productQueueServiceLevel;
	}

	/**
	 * @param productQueueServiceLevel the productQueueServiceLevel to set
	 */
	public void setProductQueueServiceLevel(Integer productQueueServiceLevel) {
		this.productQueueServiceLevel = productQueueServiceLevel;
	}

	/**
	 * @return the specialHandlingCodes
	 */
	public List<String> getSpecialHandlingCodes() {
		return specialHandlingCodes;
	}

	/**
	 * @param specialHandlingCodes the specialHandlingCodes to set
	 */
	public void setSpecialHandlingCodes(List<String> specialHandlingCodes) {
		this.specialHandlingCodes = specialHandlingCodes;
	}

	/**
	 * @return the splCodes
	 */
	public String getSplCodes() {
		return splCodes;
	}

	/**
	 * @param splCodes the splCodes to set
	 */
	public void setSplCodes(String splCodes) {
		this.splCodes = splCodes;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the transfer
	 */
	public String getTransfer() {
		return transfer;
	}

	/**
	 * @param transfer the transfer to set
	 */
	public void setTransfer(String transfer) {
		this.transfer = transfer;
	}

	/**
	 * @return the userAudit
	 */
	public UserAuditDto getUserAudit() {
		return userAudit;
	}

	/**
	 * @param userAudit the userAudit to set
	 */
	public void setUserAudit(UserAuditDto userAudit) {
		this.userAudit = userAudit;
	}

	/**
	 * @return the userIdentifier
	 */
	public String getUserIdentifier() {
		return userIdentifier;
	}

	/**
	 * @param userIdentifier the userIdentifier to set
	 */
	public void setUserIdentifier(String userIdentifier) {
		this.userIdentifier = userIdentifier;
	}

	/**
	 * @return the originIataRegion
	 */
	public String getOriginIataRegion() {
		return originIataRegion;
	}

	/**
	 * @param originIataRegion the originIataRegion to set
	 */
	public void setOriginIataRegion(String originIataRegion) {
		this.originIataRegion = originIataRegion;
	}

	/**
	 * @return the awbDatabaseKey
	 */
	public String getAwbDatabaseKey() {
		return awbDatabaseKey;
	}

	/**
	 * @param awbDatabaseKey the awbDatabaseKey to set
	 */
	public void setAwbDatabaseKey(String awbDatabaseKey) {
		this.awbDatabaseKey = awbDatabaseKey;
	}

	/**
	 * @return the updateLMSFunction
	 */
	public String getUpdateLMSFunction() {
		return updateLMSFunction;
	}

	/**
	 * @param updateLMSFunction the updateLMSFunction to set
	 */
	public void setUpdateLMSFunction(String updateLMSFunction) {
		this.updateLMSFunction = updateLMSFunction;
	}

	/**
	 * @return the awbVersion
	 */
	public int getAwbVersion() {
		return awbVersion;
	}

	/**
	 * @param awbVersion the awbVersion to set
	 */
	public void setAwbVersion(int awbVersion) {
		this.awbVersion = awbVersion;
	}

	/**
	 * @return the deleteInd
	 */
	public boolean isDeleteInd() {
		return deleteInd;
	}

	/**
	 * @param deleteInd the deleteInd to set
	 */
	public void setDeleteInd(boolean deleteInd) {
		this.deleteInd = deleteInd;
	}

	/**
	 * @return the bookingInd
	 */
	public boolean isBookingInd() {
		return bookingInd;
	}

	/**
	 * @param bookingInd the bookingInd to set
	 */
	public void setBookingInd(boolean bookingInd) {
		this.bookingInd = bookingInd;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}


	}
