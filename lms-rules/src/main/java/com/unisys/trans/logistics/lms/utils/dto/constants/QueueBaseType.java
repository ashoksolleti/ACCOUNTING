package com.unisys.trans.logistics.lms.utils.dto.constants;


public enum QueueBaseType {

    R("Rating Queue Processing"),

    Q("Queue Processing"),

    B("Both Queues"),
    
    A("Accounting Queue Processing");

    /**
     * Constructor with <code>queueBaseType</code> as an argument.
     * <p>
     * 
     * @param pQueueBaseType the new value of the <code>queueBaseType</code>.<br>
     */
    private QueueBaseType(final String pQueueBaseType) {
        this.queueBaseType = pQueueBaseType;
    }

    private String queueBaseType;

    /**
     * @return the queueBaseType
     */
    public String getQueueBaseType() {
        return this.queueBaseType;
    }

    /**
     * @param pQueueBaseType the queueBaseType to set
     */
    public void setQueueBaseType(final String pQueueBaseType) {
        this.queueBaseType = pQueueBaseType;
    }

    /**
     * Gets the <code>QueueType</code>.
     * <p>
     * 
     * @param pQueueType <code>String</code><br>
     *            Contains the enum type.<br>
     *            </p>
     * @return
     *         Returns the <code>QueueType</code>
     */
    public static String getQueueBaseType(final QueueType pQueueType) {

        String avalue = null;

        for (final QueueBaseType aType : QueueBaseType.values()) {

            if (pQueueType.equals(aType)) {
                avalue = aType.getQueueBaseType();
                break;
            }
        }

        return avalue;

    }

}
