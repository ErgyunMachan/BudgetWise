package com.dentsu.budgetwise;

/**
 * Calculate class is designed to make necessary calculations.
 */

public class Calculate {
    private final Budget budget;

    public Calculate(Budget budget) {
        this.budget = budget;
    }

    /****
     * The method first check if the budget is sufficient. If not return a message and terminate.
     * Increasing specific initial budget until reach to the maximum budget
     * @return maximum budget for specific ad
     */

    public double calculateMaximumBudgetForSpecificAd() {
        if (!CampaignBudgetIsSufficientAfterCalculation()) {
            System.out.println("Campaign budget is insufficient based on costs that you defined.");
            System.exit(1);
        }

        double budgetAfterAgencyHoursDeduction = budget.getCampaignBudget() - budget.getFixedAgencyCostHours();
        double maximumTotalAdBudget = budget.getOtherAdsBudget();
        double totalCostsAfterAgencyHoursDeduction = 0;
        while (totalCostsAfterAgencyHoursDeduction <= budgetAfterAgencyHoursDeduction) {
            maximumTotalAdBudget += 0.1;
            totalCostsAfterAgencyHoursDeduction = maximumTotalAdBudget + (maximumTotalAdBudget * budget.getAgencyFeePercentage()) + (maximumTotalAdBudget * budget.getThirdPartyToolPercentage());

        }

        return (double) Math.round(maximumTotalAdBudget - budget.getOtherAdsBudget());
    }

    /**
     * Calculate campaign budget regarding to this given formula ->
     * Z=X+Y1⋅X+Y2⋅(X1+X2+X4)+HOURS
     *
     * @return calculated formula
     */

    public double calculateCampaignBudget() {
        return budget.getOtherAdsBudget() + (budget.getOtherAdsBudget() * budget.getAgencyFeePercentage()) + (budget.getOtherAdsBudget() * budget.getThirdPartyToolPercentage()) + budget.getFixedAgencyCostHours();

    }

    /**
     * @return if the given campaign budget is sufficient after campaign budget calculation.
     */

    public boolean CampaignBudgetIsSufficientAfterCalculation() {
        return budget.getCampaignBudget() >= calculateCampaignBudget();

    }


}

