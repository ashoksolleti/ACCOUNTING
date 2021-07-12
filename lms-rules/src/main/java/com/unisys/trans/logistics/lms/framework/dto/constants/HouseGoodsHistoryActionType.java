package com.unisys.trans.logistics.lms.framework.dto.constants;

public enum HouseGoodsHistoryActionType {
    AA("The successful auto association of house goods with master goods.", "Auto Association"),
    AF("The failed attempt to automatically associate house goods with master goods.",
                "Auto Association Failed"),
    MA("The successful manual association of house goods with master goods " +
                "(using the House Goods Information function).", "Manual Association"),
    MR("The successful manual association removal of house goods from their master goods " +
                "(using the House Goods Information function).", "Manual Association Removal"),
    MU("The successful manual association removal of house goods from their master goods " +
            "(using the House Goods Information function).", "Manual Association Update");

    private String code;

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    HouseGoodsHistoryActionType(String pCode, String pText) {
        this.code = pCode;
        this.text = pText;
    }

    public static HouseGoodsHistoryActionType getHouseGoodsHistoryActionType(
                final String pHouseGoodsHistoryActionTypeCode) {
        HouseGoodsHistoryActionType anHouseGoodsHistoryActionType = null;
        for (final HouseGoodsHistoryActionType aType : HouseGoodsHistoryActionType.values()) {
            if (pHouseGoodsHistoryActionTypeCode.equalsIgnoreCase(aType.name())
                        || pHouseGoodsHistoryActionTypeCode.equalsIgnoreCase(aType.getCode())
                        || pHouseGoodsHistoryActionTypeCode.equalsIgnoreCase(aType.getText())) {
                anHouseGoodsHistoryActionType = aType;
                break;
            }
        }

        return anHouseGoodsHistoryActionType;
    }

    HouseGoodsHistoryActionType() {

    }
}
