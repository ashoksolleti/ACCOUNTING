package com.unisys.trans.logistics.lms.framework.dto.constants;

public enum HistoryActionType {

    C("CREATE"),
    U("UPDATE"),
    D("DELETE");

    private String actionType;

    private HistoryActionType(final String pActionType) {
        // TODO Auto-generated constructor stub
        this.setHistoryActionType(pActionType);
    }

    public String getHistoryActionType() {

        return actionType;
    }

    public String getHistoryActionTypeValue(String pActionType) {
        String actionTypeValue = null;
        for (HistoryActionType anActionType : HistoryActionType.values()) {
            if (anActionType.equals(pActionType)) {
                actionTypeValue = anActionType.getHistoryActionType();
            }
        }
        return actionTypeValue;
    }

    public void setHistoryActionType(String actionType) {
        this.actionType = actionType;
    }

}
