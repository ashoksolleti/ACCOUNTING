package com.unisys.trans.logistics.lms.framework.constants;

public enum BookingStatusType {

    FC("Force Confirmed"),
    XX("XX"),
    MN("MN"),
    MA("MA"),
    NN("Alternates not acceptable"),
    NA("Alternates acceptable"),
    HK("Hold Confirmed"),
    HL("HL"),
    HN("HN"),
    QQ("QQ"),
    QK("QK"),
    //Maps to ** Status
    AL("Allotment Flight"),
    EM("EM");
    
    BookingStatusType(final String pBookingStatus) {
        this.bookingStatus = pBookingStatus;
    }
    
    private String bookingStatus;
    
    public static BookingStatusType getBookingStatus(final String pBookingStatus) {
        
        BookingStatusType matchingStatus = null;
        if(pBookingStatus == null || pBookingStatus.isEmpty()) {
            matchingStatus = EM;
        }
        else if(pBookingStatus.equals("**")) {
            matchingStatus = AL;
        }
        else {
        for(BookingStatusType bookingStatus : BookingStatusType.values()) {
            
            if(pBookingStatus.equals(bookingStatus.name())) {
            
                matchingStatus = bookingStatus;
                break;
            }
        }
        }
        return matchingStatus;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
}

