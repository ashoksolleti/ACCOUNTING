package com.unisys.trans.logistics.lms.utils.dto.constants;


/**
 * <code>QueueSource</code> class holds the Type of QueueSource.
 * <p>
 */
public enum QueueSource {

    /**
     * L - Load Air Waybill
     */
    L("Load Air Waybill"),
    /**
     * A- Accounting Air Waybill
     */
    A("Accounting Air Waybill"),
    /**
     * Q- Queue Processing
     */
    Q("Queue Processing");

    /**
     * Attribute to hold <code>queueSource</code>.
     */
    private final String queueSource;

    /**
     * Constructor with <code>pQueueSource</code> as an argument.
     * <p>
     * 
     * @param pQueueSource the new value of the <code>pQueueSource</code>.<br>
     */
    private QueueSource(final String pQueueSource) {
        this.queueSource = pQueueSource;
    }
    
    /**
     * Gets the value of the <code>getQueueSource</code> string.
     * <p>
     * 
     * @return the current value of <code>queueSource</code>.
     */

    public String getQueueSource() {
        return queueSource;
    }
    
    
    /**
     * @param pValue
     * @return
     */
    public static QueueSource getQueueSourceFromValue(final String pValue) {
        QueueSource aKey = null;
        for (final QueueSource aQueueSource : QueueSource.values()) {
            if (aQueueSource.getQueueSource().equalsIgnoreCase(pValue)) {
                aKey = aQueueSource;
                break;
            }
        }
        return aKey;
    }

}
