package com.unisys.trans.logistics.lms.framework.dto.constants;

public enum GoodsStatusType {

    GACZ("Authorized Hold"),
    GSCQ("Transferred To Customs"),
    GAC("Accepted"),
    GAF("Manifested"),
    GRF("Removed from Flight"),
    EFM("Manifested FFM"),
    EFF("Flight Final"),
    GCI("Arrived"),
    GCIN("Arrived Non-Mech"),
    GSCW("Customs Hold"),
    GSCC("Customs Cleared"),
    GSCP("Notified"),
    GSCG("On Delivery"),
    GSCH("Airline Hold"),
    GSCD("Delivered"),
    GSCS("Delivered on Substitue AWB"),
    GSCI("Interline Transferred"),
    GSCN("Non-Deliverable"),
    GSCT("Surface Transferred"),
    GSCB("Bonded Warehouse"),
    GSCR("Returned"),
    GSCX("Hold Removed"),
    EGDG("Short Shipped"),
    EGDH("Over-carried Cargo"),
    EGDS("Missing Cargo"),
    EGDT("Missing Cargo"),
    EGDU("Over-carried Cargo"),
    EGDV("Over-carried Cargo"),
    EGDW("Found Cargo"),
    EGDX("Short Shipped"),
    EGDE("Found Cargo"),
    EGDF("Missing Cargo"),
    PTM("Transfer Manifested"),
    GSCZ("Authorized Airline Hold"),
    CCII("Arrived ULD Emptied"),
    FDCA("FDCA Confirmed"),
    FCFM("FDCA ULD Confirmed"),
    GACH("Accepted in Hold"),
    GCIH("Arrived in Hold"),
    UNCF("FDCA Unconfirmed"),
    UNCM("MSCA Unconfirmed"),
    UNCO("OVCD Unconfirmed"),
    UNCS("SSPD Unconfirmed"),
    CCI("Activated"),
    CGI("Activated"),
    GSCK("Partial Clearance"),
    GSCO("Inbond Movement"),
    GACP("Goods on Hand"),
    MSCA("Missing Cargo"),
    GDCI("Goods Checked-In");

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    GoodsStatusType(String pCode) {
        this.code = pCode;
    }

    public static GoodsStatusType getGoodsStatusType(
                final String pHouseGoodsHistoryActionTypeCode) {
        GoodsStatusType anGoodsStatusType = null;
        for (final GoodsStatusType aType : GoodsStatusType.values()) {
            if (pHouseGoodsHistoryActionTypeCode.equalsIgnoreCase(aType.name())
                        || pHouseGoodsHistoryActionTypeCode.equalsIgnoreCase(aType.getCode())) {
                anGoodsStatusType = aType;
                break;
            }
        }

        return anGoodsStatusType;
    }

}
