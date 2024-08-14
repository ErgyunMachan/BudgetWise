package com.dentsu.budgetwise;

/**
 * ConsoleMessages class designed for printing console messages.
 */

public abstract class ConsoleMessages {
    private static final String REQUEST_CAMPAIGN_BUDGET = "Please enter the campaign budget: ";
    private static final String REQUEST_AGENCY_FEE_PERCENTAGE = "Please enter the agency fee percentage as a decimal (e.g., 0.15 for 15%): ";
    private static final String REQUEST_THIRD_PARTY_TOOL_FEE_PERCENTAGE = "Please enter the third party tool fee percentage as a decimal (e.g, 0.15 for 15% ";
    private static final String REQUEST_ANOTHER_ADS_BUDGET = "Please enter the budget for another ads: ";
    private static final String REQUEST_FIXED_COST_FOR_AGENCY_HOURS = "Please enter fixed cost for agency hours: ";

    public static void printRequestCampaignBudget() {
        System.out.println(REQUEST_CAMPAIGN_BUDGET);
    }

    public static void printRequestAgencyFeePercentage() {
        System.out.println(REQUEST_AGENCY_FEE_PERCENTAGE);
    }

    public static void printRequestThirdPartyToolFeePercentage() {
        System.out.println(REQUEST_THIRD_PARTY_TOOL_FEE_PERCENTAGE);
    }

    public static void printRequestAnotherAdsBudget() {
        System.out.println(REQUEST_ANOTHER_ADS_BUDGET);
    }


    public static void printRequestFixedCostForAgencyHours() {
        System.out.println(REQUEST_FIXED_COST_FOR_AGENCY_HOURS);
    }

    public static void printSpecificAdBudget(double specificAdBudget) {
        System.out.println("The maximum budget for the specific ad is: " + specificAdBudget);
    }

}
