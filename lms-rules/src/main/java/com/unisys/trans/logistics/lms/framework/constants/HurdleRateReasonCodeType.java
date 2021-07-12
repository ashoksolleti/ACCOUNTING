package com.unisys.trans.logistics.lms.framework.constants;

public enum HurdleRateReasonCodeType {

    A("Hurdle Rate allotment exclusion - Hurdle Rate not enforced"),
    B("Hurdle rate contract exclusion - Hurdle Rate not enforced"),
    C("Hurdle rate SRA exclusion - Hurdle Rate not enforced"),
    D("Flight Control Rejected Hurdle Rate Request"),
    E("E"),
    F("Failed the hurdle rate check"),
    G("Passed the hurdle rate check"),
    H("Flight Control Confirmed Hurdle Rate Request"),
    I("Hurdle Rate not enforced for some of the flights"),
    J("Booking status partially confirmed - Hurdle Rate not enforced"),
    K("FSU or FBL indicated segment - Hurdle Rate not enforced"),
    L("Hurdle Rate not enforced for all of the flights"),
    M("C$CROI set to T- Hurdle Rate not enforced"),
    N("Weight charges not generated - Hurdle Rate not enforced"),
    O("Hurdle Rate does not exist for any of the segments - Hurdle Rate not enforced"),
    P("P"),
    Q("No Hurdle rate for some segments"),
    R("R"),
    S("S"),
    T("T"),
    W("W"),
    X("Goods already accepted - Hurdle Rate not enforced"),
    Y("Air waybill data capture done - Hurdle Rate not enforced"),
    Z("Air waybill data capture (FWB/QWB) done - Hurdle Rate not enforced"),
    U("Priced with booked HR"),
    V("Recalculated Price");

    String reasonText;

    HurdleRateReasonCodeType(String pReasonText) {
        this.reasonText = pReasonText;
    }
    
    public String getHurdleRateReasonCodeType() {
        return this.reasonText;
    }
    
    public String value() {
        return this.getHurdleRateReasonCodeType();
    }
}
