package com.unisys.trans.logistics.lms.accounting.dto.constants;

/*
This enum class defines the Currency heirarchy indicator
The enum Value 'BSR' indicates the Bank selling rate preference. The enum type indicate that the exchange rate derived in the order of BANKSELLING, IATAFIVEDAY, IATARATING rate.
The enum Value  'FDR' indicates the IATAFIVEDAY rate preference. The enum type indicate that the exchange rate derived in the order of IATAFIVEDAY, IATARATING, BANKSELLING rate.
 */

public enum CurrencyHeirarchyIndicator {
    BSR, FDR ;
}
