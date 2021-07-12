package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * RFC UIS157
 * <code>TargetsUploadStatusIndicator</code> holds the attributes that determine
 * Targets space details.<br>
 * <p>
 * indicator is used to set the upload status.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>SUCCESS
 * <li>FAILURE
 * <li>TECHINICAL_ERROR
 * <li>oId
 * </code>
 * </ul>
 */

public enum TargetsUploadStatusIndicator {

	/**
     * SUCCESS enum constant returns the value 'SUCCESS'.
     */
    SUCCESS("SUCCESS"),
    /**
     * FAILURE enum constant returns the value 'FAILURE'.
     */
    FAILURE("FAILURE"),
    /**
     * TECHINICAL_ERROR enum constant returns the value 'TECHINICAL_ERROR'.
     */
    TECHINICAL_ERROR("TECHINICAL_ERROR");
    
    public static TargetsUploadStatusIndicator
    getAutoTargetsStatusType(final String pAutoTargetsReleaseType) {
	 
    	TargetsUploadStatusIndicator anAutoTargetsStatusType= null;
    	
    	for (final TargetsUploadStatusIndicator aType : TargetsUploadStatusIndicator.values()) {
            if (pAutoTargetsReleaseType.equals(aType.value())) {
                anAutoTargetsStatusType = aType;
                break;
            }
        }
        return anAutoTargetsStatusType;
    }
    
    private String targetsStatusType;

    private TargetsUploadStatusIndicator(final String pAutoTargetsReleaseType) {
        this.targetsStatusType = pAutoTargetsReleaseType;
    }

    public String value() {
        return this.targetsStatusType;
    }
}
