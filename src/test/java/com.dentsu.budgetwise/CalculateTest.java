package com.dentsu.budgetwise;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateTest {

    private Budget budget;
    private Calculate calculate;

    @BeforeEach
    public void setup() {
        budget = new Budget(100, 0.10, 0.10, 10, 50);
        calculate = new Calculate(budget);
    }

    @Test
    @DisplayName("Calculate campaign budget successfully")
    public void testCalculateCampaignBudgetCorrectlyCalculateTheBudget() {
        double expected = budget.getOtherAdsBudget() + (budget.getOtherAdsBudget() * budget.getAgencyFeePercentage()) + (budget.getOtherAdsBudget() * budget.getThirdPartyToolPercentage()) + budget.getFixedAgencyCostHours();
        double actual = calculate.calculateCampaignBudget();

        assertEquals(expected, actual);
    }

    // divide this method into two test cases one is sufficient other is insufficient

    @Test
    @DisplayName("Testing campaign budget whether sufficient or not correctly")
    public void testCampaignBudgetIsSufficient() {
        Assertions.assertTrue(calculate.CampaignBudgetIsSufficientAfterCalculation());
        budget = new Budget(100, 0.10, 0.10, 90, 90);
        calculate = new Calculate(budget);
        Assertions.assertFalse(calculate.CampaignBudgetIsSufficientAfterCalculation());
    }

    @Test
    @DisplayName("Calculate maximum budget for specific ad successfully")
    public void testCalculateMaximumBudgetForSpecificAd() {
        Assertions.assertEquals(25.0, calculate.calculateMaximumBudgetForSpecificAd());
    }


}
