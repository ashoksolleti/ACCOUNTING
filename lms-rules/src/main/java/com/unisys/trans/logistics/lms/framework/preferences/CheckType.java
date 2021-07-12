package com.unisys.trans.logistics.lms.framework.preferences;


public enum CheckType {
    
    /**UP - Direction in routing to check for Carrier when determining whether the restriction applies */
    UP("Up"),
    /**
     *Down - Direction in routing to check for Carrier when determining whether the restriction applies .
     */
    DOWN("Down"),
    /**
     * Both (Default) - Direction in routing to check for Carrier when determining whether the restriction applies .
     */
    BOTH("Both");
     
     private final String checkType;
     
    
     
     CheckType(final String pcheckType) {
            this.checkType = pcheckType;
           
        }
     
     public static CheckType getCheckType(final String pCheckType) {

         CheckType anCheckType = null;

            for (final CheckType aType : CheckType.values()) {
                if (pCheckType.equals(aType.name())) {
                    anCheckType = aType;
                    break;
                }
            }
            return anCheckType;
        }
    

        /**
         * Gets the <code>checkType</code> of a restriction.
         * <p>
         * Each Check belongs to one check type.
         * <p>
         * 
         * @return current value of <code>checkType</code>.
         */
        public String getCheckType() {
            return this.checkType;
        }

        /**
         * Gives the string format of enumerated <code>checkType</code> for a restriction.
         * <p>
         * 
         * @return the enumerated value of the <code>checkType</code>.<br>
         */
        public String value() {
            return this.name();
        }
     
     
}

