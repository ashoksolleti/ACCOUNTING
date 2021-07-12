package com.unisys.trans.logistics.lms.framework.constants;

public enum BookingFlightStatusType {

    AL("Allotment space released - ULD plan"),
    BL("Released - ULD plan"),
    CN("Cancelled by FBL"),
    DA("Deferred - alternate acceptable"),
    DL("Deleted"),
    DN("Deferred - need action"),
    FC("Force Confirmed"),
    KK("Confirmed"),
    LL("Waitlisted"),
    MK("Interline confirmed"),
    MS("Message Sent"),
    MU("Interline unconfirmed"),
    NA("Alternates acceptable"),
    NS("No Show"),
    NN("Alternates not acceptable"),
    PK("Partially Confirmed"),
    PQ("Partial & Requested"),
    QL("Queued from waitlist"),
    QU("Queued"),
    RC("Confirmed"),
    RE("Released"),
    RL("RL"),
    SC("Unable due to a schedule change"),
    SL("Waitlist lost schedule change"),
    UN("Unavailable"),
    UL("Unconfirmed released - ULD plan"),
    UU("Unconfirmed"),
    HK("Hold Confirmed"),
    HL("Holding waitlisted"),
    KU("Confirmed Waiting"),
    aa("AA");
    
    
    
    
    BookingFlightStatusType(final String pBookingFlightStatus) {
        
        this.bookingFlightStatus = pBookingFlightStatus;
    }
    
    private String bookingFlightStatus;

    public String getBookingFlightStatus() {
        return bookingFlightStatus;
    }

    public void setBookingFlightStatus(String pBookingFlightStatus) {
        this.bookingFlightStatus = pBookingFlightStatus;
    }
    
    public static BookingFlightStatusType findEnum(final String pBookingFlightStauts){
    	BookingFlightStatusType aSelectedFlightStatusType=null;
    	for(BookingFlightStatusType aFlightStatusType:BookingFlightStatusType.values()){
    		if(aFlightStatusType.getBookingFlightStatus().equals(pBookingFlightStauts)){
    			aSelectedFlightStatusType=aFlightStatusType;
    			break;
    		}
    	}
		return aSelectedFlightStatusType;
    }
}
