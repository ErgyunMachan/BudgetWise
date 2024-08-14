package com.dentsu.budgetwise;

/**
 * Budget is our data class where I store and access data.
 */

public class Budget {
    private final double campaignBudget; //x
    private final double agencyFeePercentage; // y1
    private final double thirdPartyToolPercentage;
    private final double fixedAgencyCostHours;
    private final double otherAdsBudget;

    public Budget(double campaignBudget, double agencyFeePercentage, double thirdPartyToolPercentage, double fixedAgencyCostHours, double ad) {

        this.campaignBudget = campaignBudget;
        this.agencyFeePercentage = agencyFeePercentage;
        this.thirdPartyToolPercentage = thirdPartyToolPercentage;
        this.fixedAgencyCostHours = fixedAgencyCostHours;
        this.otherAdsBudget = ad;
    }

    public double getCampaignBudget() {
        return campaignBudget;
    }


    public double getAgencyFeePercentage() {
        return agencyFeePercentage;
    }

    public double getThirdPartyToolPercentage() {
        return thirdPartyToolPercentage;
    }

    public double getFixedAgencyCostHours() {
        return fixedAgencyCostHours;
    }

    public double getOtherAdsBudget() {
        return otherAdsBudget;
    }
}
