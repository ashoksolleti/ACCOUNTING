/**
 * 
 */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MuthusaB1
 * 
 */
public class TariffRateMultipleFindDto extends TariffRateFindDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<String> carrierCodes;

	private String commodityCode;

	private List<String> destinationCodes;

	private List<String> originCodes;

	private boolean pendingGovernmentAppInd;

	private boolean rateConstructionInd;

	/**
	 * Attribute to hold <code>rateTypeCodes</code> property.
	 */
	private List<String> rateTypeCodes;

	private String uldTypeCode;

	/**
	 * @param destinationCodes
	 *            the destinationCodes to add
	 */
	public void addDestinationCodes(String pDestinationCodes) {
		if (this.destinationCodes == null) {
			this.destinationCodes = new ArrayList<String>();
		}
		this.destinationCodes.add(pDestinationCodes);
	}

	/**
	 * @param originCodes
	 *            the originCodes to add
	 */
	public void addOriginCodes(String pOriginCodes) {
		if (this.originCodes == null) {
			this.originCodes = new ArrayList<String>();
		}
		this.originCodes.add(pOriginCodes);
	}

	/**
	 * @param rateTypeCodes
	 *            the rateTypeCodes to set
	 */
	public void addRateTypeCodes(String pRateTypeCodes) {
		if (this.rateTypeCodes == null) {
			this.rateTypeCodes = new ArrayList<String>();
		}
		this.rateTypeCodes.add(pRateTypeCodes);
	}

	public List<String> getCarrierCodes() {
		return carrierCodes;
	}

	/**
	 * @return the commodityCode
	 */
	public String getCommodityCode() {
		return commodityCode;
	}

	/**
	 * @return the destinationCodes
	 */
	public List<String> getDestinationCodes() {
		return destinationCodes;
	}

	/**
	 * @return the originCodes
	 */
	public List<String> getOriginCodes() {
		return originCodes;
	}

	public Boolean getRateConstructionInd() {
		return rateConstructionInd;
	}

	/**
	 * @return the rateTypeCodes
	 */
	public List<String> getRateTypeCodes() {
		return rateTypeCodes;
	}

	/**
	 * @return the uldTypeCode
	 */
	public String getUldTypeCode() {
		return uldTypeCode;
	}

	/**
	 * @return the pendingGovernmentAppInd
	 */
	public boolean isPendingGovernmentAppInd() {
		return pendingGovernmentAppInd;
	}

	public void setCarrierCodes(List<String> carrierCodes) {
		this.carrierCodes = carrierCodes;
	}

	/**
	 * @param commodityCode
	 *            the commodityCode to set
	 */
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	/**
	 * @param destinationCodes
	 *            the destinationCodes to set
	 */
	public void setDestinationCodes(List<String> destinationCodes) {
		this.destinationCodes = destinationCodes;
	}

	/**
	 * @param originCodes
	 *            the originCodes to set
	 */
	public void setOriginCodes(List<String> pOriginCodes) {
		this.originCodes = pOriginCodes;
	}

	/**
	 * @param pendingGovernmentAppInd
	 *            the pendingGovernmentAppInd to set
	 */
	public void setPendingGovernmentAppInd(boolean pendingGovernmentAppInd) {
		this.pendingGovernmentAppInd = pendingGovernmentAppInd;
	}

	public void setRateConstructionInd(Boolean rateConstructionInd) {
		this.rateConstructionInd = rateConstructionInd;
	}

	/**
	 * @param rateTypeCodes
	 *            the rateTypeCodes to set
	 */
	public void setRateTypeCodes(List<String> pRateTypeCodes) {
		this.rateTypeCodes = pRateTypeCodes;
	}

	/**
	 * @param uldTypeCode
	 *            the uldTypeCode to set
	 */
	public void setUldTypeCode(String uldTypeCode) {
		this.uldTypeCode = uldTypeCode;
	}
}
