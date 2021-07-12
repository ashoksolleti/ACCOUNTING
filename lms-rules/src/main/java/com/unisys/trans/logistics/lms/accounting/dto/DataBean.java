package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;

public class DataBean {
    private String countCategory;

    private String revenueCategory;

    private Long dailyCount;

    private BigDecimal dailyRevenue;

    private Long monthyCount;

    private BigDecimal monthlyRevenue;

    private Long weeklyCount;

    private BigDecimal weeklyRevenue;

    public Long getDailyCount() {
        return this.dailyCount;
    }

    public void setDailyCount(final Long pDailyCount) {
        this.dailyCount = pDailyCount;
    }

    public BigDecimal getDailyRevenue() {
        return this.dailyRevenue;
    }

    public void setDailyRevenue(final BigDecimal pDailyRevenue) {
        this.dailyRevenue = pDailyRevenue;
    }

    public Long getMonthyCount() {
        return this.monthyCount;
    }

    public void setMonthyCount(final Long pMonthyCount) {
        this.monthyCount = pMonthyCount;
    }

    public BigDecimal getMonthlyRevenue() {
        return this.monthlyRevenue;
    }

    public void setMonthlyRevenue(final BigDecimal pMonthlyRevenue) {
        this.monthlyRevenue = pMonthlyRevenue;
    }

    public Long getWeeklyCount() {
        return this.weeklyCount;
    }

    public void setWeeklyCount(final Long pWeeklyCount) {
        this.weeklyCount = pWeeklyCount;
    }

    public BigDecimal getWeeklyRevenue() {
        return this.weeklyRevenue;
    }

    public void setWeeklyRevenue(final BigDecimal pWeeklyRevenue) {
        this.weeklyRevenue = pWeeklyRevenue;
    }

    public String getCountCategory() {
        return this.countCategory;
    }

    public void setCountCategory(final String pCountCategory) {
        this.countCategory = pCountCategory;
    }

    public String getRevenueCategory() {
        return this.revenueCategory;
    }

    public void setRevenueCategory(final String pRevenueCategory) {
        this.revenueCategory = pRevenueCategory;
    }

}
