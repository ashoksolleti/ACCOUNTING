package com.unisys.trans.logistics.lms.accounting.constants;

public enum SectionType {
    PRODUCT("Product"),
    COMMODITY_NUMBER("Commodity Number"),
    FLIGHT_NUMBER("Flight Number"),
    SPCL_HANDLING_CODE("Special Handling Code"),
    OTHER_CHARGES("Other Charges"),
    VAT_AMOUNT("Vat Amount"),
    ULD_TYPE("Uld Type"),
    EXTENDED_TERRITORY("Extended Territory"),
    RTG("Routing Seg");
    
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    SectionType(final String pDescription) {
        this.description = pDescription;
    }

}