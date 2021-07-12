package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.FrequencyType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public class DataBeanList {

    private static final BigDecimal revenueRoundingValue = new BigDecimal(1000);

    public ArrayList getDataBeanList(final List<AccountingDashboardDetailDto> pAccountingDashboardDetailDto)
                throws LMSException {

        ArrayList theDataBeanList = new ArrayList();
        DataBean d1 = new DataBean();
        DataBean d2 = new DataBean();
        DataBean d3 = new DataBean();
        DataBean d4 = new DataBean();
        DataBean d5 = new DataBean();
        DataBean d6 = new DataBean();
        DataBean d7 = new DataBean();
        DataBean d8 = new DataBean();
        DataBean d9 = new DataBean();

        for (AccountingDashboardDetailDto anAccountingDashboardDetailDto : pAccountingDashboardDetailDto) {

            if (FrequencyType.DAILY.equals(anAccountingDashboardDetailDto.getFrequencyType())) {

                d1.setCountCategory("Air Waybill Issued");
                d1.setDailyCount(anAccountingDashboardDetailDto.getIssuedAwbCount());
                d1.setDailyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto.getIssuedAwbRevenue()));
                d1.setRevenueCategory("Air Waybill Issued");

                d2.setCountCategory("AWB Export Audit Completed");
                d2.setDailyCount(anAccountingDashboardDetailDto.getExportAuditedAwbCount());
                d2.setDailyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getExportAuditedAwbRevenue()));
                d2.setRevenueCategory("AWB Export Audit Completed");

                d3.setCountCategory("AWB Import Audit Completed");
                d3.setDailyCount(anAccountingDashboardDetailDto.getImportAuditedAwbCount());
                d3.setDailyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getImportAuditedAwbRevenue()));
                d3.setRevenueCategory("AWB Import Audit Completed");

                d4.setCountCategory("Air Waybill Processed");
                d4.setDailyCount(anAccountingDashboardDetailDto.getProcessedAwbCount());
                d4.setDailyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getProcessedAwbRevenue()));
                d4.setRevenueCategory("Air Waybill Processed");

                d5.setCountCategory("Air Waybill in Error Queue");
                d5.setDailyCount(anAccountingDashboardDetailDto.getErrorQueuedAwbCount());
                d5.setDailyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getErrorQueuedAwbRevenue()));
                d5.setRevenueCategory("Air Waybill in Error Queue");

                d6.setCountCategory("Air Waybill in Manual Audit Queue");
                d6.setDailyCount(anAccountingDashboardDetailDto.getAuditQueuedAwbCount());
                d6.setDailyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getAuditQueuedAwbRevenue()));
                d6.setRevenueCategory("Air Waybill in Manual Audit Queue");

                d7.setCountCategory("Ready For Invoicing");
                d7.setDailyCount(anAccountingDashboardDetailDto.getReadyForInvoiceAwbCount());
                d7.setDailyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getReadyForInvoiceAwbRevenue()));
                d7.setRevenueCategory("Ready For Invoicing");

                d8.setCountCategory("Invoiced");
                d8.setDailyCount(anAccountingDashboardDetailDto.getInvoicedAwbCount());
                d8.setDailyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getInvoicedAwbRevenue()));
                d8.setRevenueCategory("Invoiced");

                d9.setCountCategory("Paid");
                d9.setDailyCount(anAccountingDashboardDetailDto.getPaidAwbCount());
                d9.setDailyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto.getPaidAwbRevenue()));
                d9.setRevenueCategory("Paid");
            }

            if (FrequencyType.WEEKLY.equals(anAccountingDashboardDetailDto.getFrequencyType())) {

                d1.setCountCategory("Air Waybill Issued");
                d1.setWeeklyCount(anAccountingDashboardDetailDto.getIssuedAwbCount());
                d1.setWeeklyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto.getIssuedAwbRevenue()));
                d1.setRevenueCategory("Air Waybill Issued");

                d2.setCountCategory("AWB Export Audit Completed");
                d2.setWeeklyCount(anAccountingDashboardDetailDto.getExportAuditedAwbCount());
                d2.setWeeklyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getExportAuditedAwbRevenue()));
                d2.setRevenueCategory("AWB Export Audit Completed");

                d3.setCountCategory("AWB Import Audit Completed");
                d3.setWeeklyCount(anAccountingDashboardDetailDto.getImportAuditedAwbCount());
                d3.setWeeklyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getImportAuditedAwbRevenue()));
                d3.setRevenueCategory("AWB Import Audit Completed");

                d4.setCountCategory("Air Waybill Processed");
                d4.setWeeklyCount(anAccountingDashboardDetailDto.getProcessedAwbCount());
                d4.setWeeklyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getProcessedAwbRevenue()));
                d4.setRevenueCategory("Air Waybill Processed");

                d5.setCountCategory("Air Waybill in Error Queue");
                d5.setWeeklyCount(anAccountingDashboardDetailDto.getErrorQueuedAwbCount());
                d5.setWeeklyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getErrorQueuedAwbRevenue()));
                d5.setRevenueCategory("Air Waybill in Error Queue");

                d6.setCountCategory("Air Waybill in Manual Audit Queue");
                d6.setWeeklyCount(anAccountingDashboardDetailDto.getAuditQueuedAwbCount());
                d6.setWeeklyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getAuditQueuedAwbRevenue()));
                d6.setRevenueCategory("Air Waybill in Manual Audit Queue");

                d7.setCountCategory("Ready For Invoicing");
                d7.setWeeklyCount(anAccountingDashboardDetailDto.getReadyForInvoiceAwbCount());
                d7.setWeeklyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getReadyForInvoiceAwbRevenue()));
                d7.setRevenueCategory("Ready For Invoicing");

                d8.setCountCategory("Invoiced");
                d8.setWeeklyCount(anAccountingDashboardDetailDto.getInvoicedAwbCount());
                d8.setWeeklyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getInvoicedAwbRevenue()));
                d8.setRevenueCategory("Invoiced");

                d9.setCountCategory("Paid");
                d9.setWeeklyCount(anAccountingDashboardDetailDto.getPaidAwbCount());
                d9.setWeeklyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto.getPaidAwbRevenue()));
                d9.setRevenueCategory("Paid");

            }

            if (FrequencyType.MONTHLY.equals(anAccountingDashboardDetailDto.getFrequencyType())) {

                d1.setCountCategory("Air Waybill Issued");
                d1.setMonthyCount(anAccountingDashboardDetailDto.getIssuedAwbCount());
                d1.setMonthlyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getIssuedAwbRevenue()));
                d1.setRevenueCategory("Air Waybill Issued");

                d2.setCountCategory("AWB Export Audit Completed");
                d2.setMonthyCount(anAccountingDashboardDetailDto.getExportAuditedAwbCount());
                d2.setMonthlyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getExportAuditedAwbRevenue()));
                d2.setRevenueCategory("AWB Export Audit Completed");

                d3.setCountCategory("AWB Import Audit Completed");
                d3.setMonthyCount(anAccountingDashboardDetailDto.getImportAuditedAwbCount());
                d3.setMonthlyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getImportAuditedAwbRevenue()));
                d3.setRevenueCategory("AWB Import Audit Completed");

                d4.setCountCategory("Air Waybill Processed");
                d4.setMonthyCount(anAccountingDashboardDetailDto.getProcessedAwbCount());
                d4.setMonthlyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getProcessedAwbRevenue()));
                d4.setRevenueCategory("Air Waybill Processed");

                d5.setCountCategory("Air Waybill in Error Queue");
                d5.setMonthyCount(anAccountingDashboardDetailDto.getErrorQueuedAwbCount());
                d5.setMonthlyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getErrorQueuedAwbRevenue()));
                d5.setRevenueCategory("Air Waybill in Error Queue");

                d6.setCountCategory("Air Waybill in Manual Audit Queue");
                d6.setMonthyCount(anAccountingDashboardDetailDto.getAuditQueuedAwbCount());
                d6.setMonthlyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getAuditQueuedAwbRevenue()));
                d6.setRevenueCategory("Air Waybill in Manual Audit Queue");

                d7.setCountCategory("Ready For Invoicing");
                d7.setMonthyCount(anAccountingDashboardDetailDto.getReadyForInvoiceAwbCount());
                d7.setMonthlyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getReadyForInvoiceAwbRevenue()));
                d7.setRevenueCategory("Ready For Invoicing");

                d8.setCountCategory("Invoiced");
                d8.setMonthyCount(anAccountingDashboardDetailDto.getInvoicedAwbCount());
                d8.setMonthlyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto
                            .getInvoicedAwbRevenue()));
                d8.setRevenueCategory("Invoiced");

                d9.setCountCategory("Paid");
                d9.setMonthyCount(anAccountingDashboardDetailDto.getPaidAwbCount());
                d9.setMonthlyRevenue(this.setRoundedValue(anAccountingDashboardDetailDto.getPaidAwbRevenue()));
                d9.setRevenueCategory("Paid");
            }
        }

        theDataBeanList.add(d1);
        theDataBeanList.add(d2);
        theDataBeanList.add(d3);
        theDataBeanList.add(d4);
        theDataBeanList.add(d5);
        theDataBeanList.add(d6);
        theDataBeanList.add(d7);
        theDataBeanList.add(d8);
        theDataBeanList.add(d9);

        return theDataBeanList;
    }

    private BigDecimal setRoundedValue(final BigDecimal pRate)
                throws LMSException {
        BigDecimal aRoundedRate = null;
        if (pRate != null && !pRate.equals(FrameworkConstants.ZERO)) {
            aRoundedRate = pRate.divide(revenueRoundingValue, 0, RoundingMode.HALF_UP);
        }
        return aRoundedRate;
    }

}
