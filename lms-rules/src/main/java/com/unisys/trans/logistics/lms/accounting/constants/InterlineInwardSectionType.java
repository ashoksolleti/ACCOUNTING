package com.unisys.trans.logistics.lms.accounting.constants;

public enum InterlineInwardSectionType {
    PRORATE_LADDER("Prorate Ladder"),
    VAT_AMOUNT("Vat Amount"),
    OTHER_CHARGES("Other Charges"),
    OTHER_CHARGES_RM("Other Charges RM"),
    REMARKS("Remarks");
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    InterlineInwardSectionType(final String pDescription) {
        this.description = pDescription;
    }


}
