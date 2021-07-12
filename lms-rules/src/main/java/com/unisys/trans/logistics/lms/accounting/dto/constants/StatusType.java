package com.unisys.trans.logistics.lms.accounting.dto.constants;

    /**
     * <code>StatusType</code> holds the constants to indicate  status type applied.
     * <p>
     * Following are the possible  status type:<br>
     * <ul>
     * <li>ACTIVE - A
     * <li>DELETED - D
     * <li>HISTORY - Hs
     * <li>PENDING - P
     * <li>EXPIRED - E
     * </ul>
     */
    public enum StatusType {
        /**
         * Indicates that the  status type is ACTIVE.
         */
        ACTIVE("A", "Active"),
        /**
         * Indicates that the  status type is DELETED.
         */
        DELETED("D", "Deleted"),
        /**
         * Indicates that the  status type is EXPIRED.
         */
        EXPIRED("E", "Expired"),
        /**
         * Indicates that the  status type is HISTORY.
         */
        HISTORY("H", "History"),
        /**
         * Indicates that the  status type is PENDING.
         */
        PENDING("P", "Pending"),
        
        /**
         * Indicates that the  status type is PENDING.
         */
        ADD("A", "ADD"),
        
        /**
         * Indicates that the  status type is PENDING.
         */
        UPDATE("U", "UPD");

        /**
         * Attribute to hold the <code>type</code> property.
         */
        private String type;

        /**
         * Attribute to hold the <code>name</code> property.
         */

        private String name;

        /**
         * Constructor with <code>StatusType</code> as an argument.
         * <p>
         * 
         * @param pType
         *            the new value of the <code>type</code>.<br>
         * @param pName
         *            the new value of the <code>Name</code>.<br>
         */

        private StatusType(final String pType, final String pName) {
            this.type = pType;
            this.name = pName;
        }

        /**
         * Gets the <code>StatusType</code> based on the given string.
         * 
         * @param pValue
         *            the string representation of <code>StatusType</code>
         * @return
         *         A enum of type <code>StatusType</code>
         */
        public static StatusType fromValue(final String pValue) {
            return valueOf(pValue);
        }

        /**
         * This method <code>getStatusType</code> returns the StatusType.
         * 
         * @param pStatusType <code>String</code><br>
         *            The value of due code.<br>
         *            <p>
         * @return Returns the type of Contract <br>
         *         </p>
         */

        public static StatusType getStatusType(final String pStatusType) {

            StatusType aMatchedStatusType = null;

            for (final StatusType aType : StatusType.values()) {
                if (aType.getName().equalsIgnoreCase(pStatusType)) {
                    aMatchedStatusType = aType;
                    break;
                }
            }

            return aMatchedStatusType;
        }

        /**
         * Gets the entry by <code>type</code> property.
         * <p>
         * Holds the StatusType code applicable for a entry.
         * </p>
         * 
         * @param pStatusType
         *            holds the  status type
         * 
         * @return the current value of the <code>type</code> property.<br>
         */
        public static StatusType getStatusByType(final String pStatusType) {

        StatusType aMatchedStatusType = null;

            for (final StatusType aType : StatusType.values()) {
                if (aType.getType().equalsIgnoreCase(pStatusType)) {
                    aMatchedStatusType = aType;
                    break;
                }
            }

            return aMatchedStatusType;
        }

        /**
         * Gets the <code>type</code> property.
         * <p>
         * Holds the StatusType code applicable for a entry .
         * <p>
         * 
         * @return the current value of the <code>type</code> property.<br>
         */
        public String getType() {
            return this.type;
        }

        /**
         * Sets the <code>type</code> property.
         * <p>
         * Holds the StatusType code applicable for a entry .
         * <p>
         * 
         * @param pType
         *            the new value of the <code>type</code> property.<br>
         */
        public void setType(final String pType) {
            this.type = pType;
        }

        /**
         * The <code>value</code> method gives the string format of  status type.
         * <p>
         * <p>
         * 
         * @return <code>String</code><br>
         *         Returns the enumerated value of the  status type.<br>
         */
        public String value() {
            return this.type;
        }

        /**
         * Gets the <code>name</code> property.
         * <p>
         * Holds the StatusType code applicable for a agreement .
         * <p>
         * 
         * @return the current value of the <code>name</code> property.<br>
         */
        public String getName() {
            return this.name;
        }

    }
