package com.unisys.trans.logistics.lms.utils.contract;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.CurrencyDto;

public interface CurrencyCriteriaManagerService {

    /**
     * validates InputRate for RoundingFactorDto.
     * <p>
     * 
     * @param pAmount
     *            holds the Amount.
     * @param pOverPivotRate
     *            holds the OverPivotRate.
     * @param pCurrencyCode
     *            holds the CurrencyCode.
     * @param pDate
     *            holds the EffectiveDate.
     * @throws LMSException
     *             If the request fails.
     */
    public void validateInputRate(final BigDecimal pAmount,
                final BigDecimal pOverPivotRate, final String pCurrencyCode,
                final DateRangeDto pDate) throws LMSException;

    /**
     * returns the <code>rounded amount</code> of given rate value.
     * <p>
     * 
     * @param pCurrencyCode the new value of the <code>CurrencyCode</code> property.
     * 
     * @param pAmount
     *            the new value of the <code>Amount</code> property.
     * 
     * @param pDate
     *            the new value of the <code>Date</code> property.
     */
    public BigDecimal setDecimalForAmount(BigDecimal pAmount,
                final String pCurrencyCode, final DateRangeDto pDate) throws LMSException;
    
    /**
     * returns the <code>rounded amount</code> of given rate value.
     * <p>
     * 
     * @param pCurrencyCode the new value of the <code>CurrencyCode</code> property.
     * 
     * @param pAmount
     *            the new value of the <code>Amount</code> property.
     * 
     * @param pDate
     *            the new value of the <code>Date</code> property.
     */
    public BigDecimal setDecimalForAmount(BigDecimal pAmount,
                final String pCurrencyCode, final DateRangeDto pDate,final boolean pConsiderUsdCad) throws LMSException;

	/**
     * returns the <code>rounded amount</code> of given rate value.
     * <p>
     * 
     * @param pMultiplicand
     *            holds the multiplicand value.
     * 
     * @param pAmount
     *            the new value of the <code>Amount</code> property.
     * 
     * @param pDate
     *            the new value of the <code>Date</code> property.
     * @param pCurrencyCode
     *            holds the Currency code.
     * @param pConsiderUsdCad
     *            holds the indicator to consider special consideration for USD & CAS.
     */
    public BigDecimal multiplyAmount(BigDecimal pAmount, BigDecimal pMultiplicand,
                final String pCurrencyCode, final DateRangeDto pDate,final boolean pConsiderUsdCad) throws LMSException;
    
    public CurrencyDto  findCurrency(final String pCurrencyCode) throws LMSException;
}
