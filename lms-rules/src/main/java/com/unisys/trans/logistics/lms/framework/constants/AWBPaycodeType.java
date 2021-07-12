package com.unisys.trans.logistics.lms.framework.constants;


public enum AWBPaycodeType {


    /**
     * All charges prepaid cash.
     */
    PP("PP"),
    /**
     * All charges prepaid credit.
     */
    PX("PX"),
    /**
     * Weight/valuation and other origin incidental charges are prepaid credit. government bill
     * of lading required. Other charges are collect.
     */
    PG("PG"),
    /**
     * Weight, valuation and origin incidental charges are prepaid credit. Other charges are
     * collect.
     */
    PD("PD"),
    /**
     * Weight, valuation and origin incidental charges are prepaid cash. Other charges are
     * collect.
     */
    PC("PC"),
    /**
     * Weight, valuation and destination incidental charges are collect. Origin incidental
     * charges are prepaid cash.
     */
    CA("CA"),
    /**
     * Weight, valuation and destination incidental charges are collect. Origin incidental
     * charges are prepaid credit.
     */
    CB("CB"),
    /**
     * All charges collect.
     */
    CC("CC"),
    /**
     * No charges. Not valid for charter air waybill.
     */
    NC("NC"),
    /**
     * Charge prepaid.
     */
    P("P"),
    /**
     * Weight and valuation charges are prepaid.
     * <p>
     * Other non-origin incidental charges are collect credit.
     */
    CX("CX"),
    /**
     * Weight/valuation and incidental other than origin charges are collect credit government
     * bill of lading required.
     */
    CG("CG"),
    /**
     * Weight and valuation charges are prepaid.Other non-origin incidental charges are collect
     * cash.
     */
    CP("CP"),
    /**
     * Weight and valuation and incidental other than origin charges are collect credit.
     */
    CR("CR"),
    /**
     * Weight and valuation and incidental other than origin charges are collect cash.
     */
    CS("CS"),
    /**
     * Weight and valuation charges are prepaid.
     * <p>
     * No charges at import.
     */
    CK("CK"),
    /**
     * Charge collect.
     */
    C("C");
    
    private String payCode;
    
    public String getPayCode() {
		return payCode;
	}

	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}
	
	AWBPaycodeType(final String pPayCode) {
		
		this.payCode= pPayCode;
	}

	 /**
     * Gets the <code>ExportPaymentType</code>.
     * <p>
     * 
     * @param pExportPaymentType
     *        the new value of <code>ExportPaymentType</code>.
     *        <p>
     * @return the current value of <code>ExportPaymentType</code>.
     */
    public static AWBPaycodeType getPayCode( final String pPayCode) {

    	AWBPaycodeType aPayCode = null;
        if (pPayCode != null) {
            for ( final AWBPaycodeType aType : AWBPaycodeType.values() ) {

                if (pPayCode.equals( aType.value())) {
                	aPayCode = aType;
                    break;
                }
            }
        }

        return aPayCode;

    }
    
    /**
     * Gives the string format of <code>ExportPaymentType</code>.
     * <p>
     * 
     * @return the enumerated value of the <code>ExportPaymentType</code>.<br>
     */
    public String value() {
        return this.payCode;
    }
    
}
