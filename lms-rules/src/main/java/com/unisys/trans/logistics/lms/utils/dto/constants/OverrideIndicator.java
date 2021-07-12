package com.unisys.trans.logistics.lms.utils.dto.constants;

public enum OverrideIndicator {
    
    Y("YES"),
    N("NO");
    
    private final String overrideIndicator;
    
    OverrideIndicator(final String pOverrideIndicator) {
        this.overrideIndicator =  pOverrideIndicator;
    }

    
    private String getOverrideIndicator(){
        return  overrideIndicator;
    }
    
    
    /**
     * Gets the <code>OverrideIndicator</code>.
     * <p>
     * 
     * @param pSource <code>OverrideIndicator</code><br>
     *            Contains the enum type.<br>
     *            </p>
     * @return Returns the aValue.
     */

    public static String getOverrideIndicator(final OverrideIndicator pSource) {

        String aValue = null;

        for (final OverrideIndicator aSource : OverrideIndicator.values()) {

            if (aSource.equals(pSource)) {
                aValue = pSource.getOverrideIndicator();
                break;
            }
        }

        return aValue;

    }

    
    /**
     * The <code>value</code> method gives the restriction type of queue.
     * <p>
     * 
     * @return the enumerated value of the <code>queueRestrictionType</code>.
     */
    public String value() {
        return this.name();
    }
 
}
