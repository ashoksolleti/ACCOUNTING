package com.unisys.trans.logistics.lms.utils.contract;

import java.util.List;

import com.unisys.trans.logistics.lms.utils.dto.CarrierDto;
import com.unisys.trans.logistics.lms.utils.dto.CurrencyDto;
import com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto;

/**
 * <p>
 * Interface definition that provides API to access Utils Data for Batch process. It provides read only view
 * of the data. The interface does not provide API to create/update the data. Use the UTILS CRUD services of
 * the respective elements to create/modify them.
 * </p>
 s* 
 * @author Unisys
 * 
 */
public interface BatchUtilsService {

    public List<String> getCurrencyCodes();
    
    public CurrencyDto findCurrencyIndefVersion(final String pCurrencyCode);
    
    public ExchangeRateDto findIATAExchangeRateIndefVersion(final String pCurrencyCode);
    
    public List<String> findAllCarrierCodes();
    
    public List<String> findAllRcaCodes();
    
    public CurrencyDto findByCurrencyCode(final String pCurrencyCode);

	

	public List<String> findAllCarrierCodesForClearancePeriods(CarrierDto carrierDto);
}
