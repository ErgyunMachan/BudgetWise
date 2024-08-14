package com.dentsu.budgetwise;

import java.util.Scanner;

/***
 * ReadConsole class created for reading input messages from console.
 */

public class ReadConsole {
    private static final Scanner scan = new Scanner(System.in);

    /***
     * Method is read campaign budget from the console and return it.
     * If campaign budget is not positive the function asks  the user to enter the amount of budget again.
     */
    public double readCampaignBudget() {
        double campaignBudget = scan.nextDouble();
        while (!InputChecker.checkIfInputPositive(campaignBudget)) {
            System.out.println("Campaign budget is incorrect. Campaign budget must be positive please try again: ");
            campaignBudget = scan.nextDouble();

        }
        return campaignBudget;
    }

    /**
     * Method is reading agency fee percentage from console and return it.
     * The percentage that user enter should be between 0 and 1.
     * In case of incorrect input the function warning the user to enter the input again.
     */

    public double readAgencyFeePercentage() {
        double agencyFeePercentage = scan.nextDouble();
        while (!InputChecker.checkIfPercentageIsCorrect(agencyFeePercentage)) {
            System.out.println("Agency percentage is incorrect. Please enter percentage between 0 and 1.");
            agencyFeePercentage = scan.nextDouble();
        }
        return agencyFeePercentage;
    }

    /**
     * Method is reading third party tool percentage and return it.
     * The percentage that user enter should be between 0 and 1.
     * In case of incorrect input the function warning the user to enter the input again.
     */

    public double readThirdPartyToolFeePercentage() {
        double thirdPartyToolFeePercentage = scan.nextDouble();
        while (!InputChecker.checkIfPercentageIsCorrect(thirdPartyToolFeePercentage)) {
            System.out.println("Agency percentage is incorrect. Please enter percentage between 0 and 1.");
            thirdPartyToolFeePercentage = scan.nextDouble();
        }
        return thirdPartyToolFeePercentage;
    }

    /**
     * Method is reading another ad budgets from console and return it.
     * If the input is rather than positive than the function give a warning and ask the user to enter it again.
     */

    public double readAnotherAdBudgets() {
        double anotherBudgets = scan.nextDouble();
        while (!InputChecker.checkIfInputPositive(anotherBudgets)) {
            System.out.println("Another budgets amount is incorrect. The amount must be positive please try again: ");
            anotherBudgets = scan.nextDouble();

        }
        return anotherBudgets;
    }

    /**
     * Method is reading fixed cost for agency hours from console.
     * If the input is not positive. Then the function gives warning and ask the input to be entered again.
     */

    public double readFixedCostForAgencyHours() {
        double fixedCostForAgencyHours = scan.nextDouble();
        while (!InputChecker.checkIfInputPositive(fixedCostForAgencyHours)) {
            System.out.println("Cost that you defined is incorrect. The amount must be positive please try again: ");
            fixedCostForAgencyHours = scan.nextDouble();

        }
        return fixedCostForAgencyHours;
    }


}
