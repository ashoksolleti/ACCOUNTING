/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.MaintainCityPairIATAMileageDeleteRequest;
import com.unisys.trans.logistics.lms.accounting.dto.MaintainCityPairIATAMileageFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.MaintainCityPairIATAMileagePersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.MaintainCityPairIATAMileageProcessRequest;
import com.unisys.trans.logistics.lms.accounting.dto.MaintainCityPairIATAMileageResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.CityResponse;

/**
 * @author ChoukseA
 * 
 */
public interface MaintainCityPairIATAMileageService {

	/**
	 * @param pMaintainCityPairIATAMileagePersistRequest
	 * @param calimState
	 * @param checkClaimState
	 * @return
	 * @throws LMSException
	 *             This method is used to Save the Final as well as Preliminary
	 *             claims.
	 */
	public MaintainCityPairIATAMileageResponse saveCityPairIATAMileage(
			MaintainCityPairIATAMileagePersistRequest pMaintainCityPairIATAMileagePersistRequest)
			throws LMSException;

	/**
	 * @param MaintainCityPairIATAMileageFindRequest
	 * @return
	 * @throws LMSException
	 *             This Method is used to retrieve the claims based on the
	 *             Information provided.
	 */
	public MaintainCityPairIATAMileageResponse findCityPairIATAMileage(
			MaintainCityPairIATAMileageFindRequest maintainCityPairIATAMileageFindRequest)
			throws LMSException;

	/**
	 * @param MaintainCityPairIATAMileageFindRequest
	 * @return
	 * @throws LMSException
	 *             This Method is used to retrieve the claims based on the
	 *             ProrateFactorId provided.
	 */
	public MaintainCityPairIATAMileageResponse findByProrateFactorId(
			MaintainCityPairIATAMileageFindRequest maintainCityPairIATAMileageFindRequest)
			throws LMSException;

	/**
	 * @param pMaintainCityPairIATAMileageDeleteRequest
	 * @return
	 * @throws LMSException
	 *             This method is used to delete a claim based on the
	 *             ProrateFactor no provided.
	 */
	public MaintainCityPairIATAMileageResponse deleteCityPairIATAMileage(
			MaintainCityPairIATAMileageDeleteRequest pMaintainCityPairIATAMileageDeleteRequest)
			throws LMSException;

	/**
	 * @param maintainCityPairIATAMileageFindRequest
	 * @return
	 * @throws LMSException
	 *             This method is used to retrieve all the prorate factors
	 */
	public MaintainCityPairIATAMileageResponse retrieveAllCityPairIATAMileage(
			MaintainCityPairIATAMileageFindRequest maintainCityPairIATAMileageFindRequest)
			throws LMSException;

	/**
	 * @param maintainCityPairIATAMileageFindRequest
	 * @return
	 * @throws LMSException
	 *             This method is used to retrieve all the prorate factors
	 *             errors
	 */
	public MaintainCityPairIATAMileageResponse retrieveAllCityPairIATAMileageErrors(
			MaintainCityPairIATAMileageFindRequest maintainCityPairIATAMileageFindRequest)
			throws LMSException;

	/**
	 * @param pMaintainCityPairIATAMileageDeleteRequest
	 * @return
	 * @throws LMSException
	 *             This method is used to delete a mileageError based on the
	 *             ProrateFactor no provided.
	 */
	public MaintainCityPairIATAMileageResponse deleteCityPairIATAMileageErrorEntry(
			MaintainCityPairIATAMileageDeleteRequest pMaintainCityPairIATAMileageDeleteRequest)
			throws LMSException;

	

	/**
	 * @param pMaintainCityPairIATAMileageDeleteRequest
	 * @return
	 * @throws LMSException
	 *             This method is used to remove all the existing ErrorEntries
	 */
	public MaintainCityPairIATAMileageResponse removeAllErrorEntries()
			throws LMSException;
	
	/**
	 * @param pMaintainCityPairIATAMileageProcessRequest
	 * @return
	 * @throws LMSException
	 *             This method is used to process the request.
	 */
	public MaintainCityPairIATAMileageResponse process(
			MaintainCityPairIATAMileageProcessRequest pMaintainCityPairIATAMileageProcessRequest)
			throws LMSException;

	public CityResponse validateCity(MaintainCityPairIATAMileageFindRequest maintainCityPairIATAMileageFindRequest,String cityCode) throws LMSException;


    
    /**
     * @param pMaintainCityPairIATAMileageFindRequest
     * @return
     * @throws LMSException
     *             This method is used find the CityPairMileage active for a given date.
     */
    MaintainCityPairIATAMileageResponse findActiveCityPairIATAMileage(
                MaintainCityPairIATAMileageFindRequest pMaintainCityPairIATAMileageFindRequest)
                throws LMSException;
}
