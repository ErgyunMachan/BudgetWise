package com.dentsu.budgetwise;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Application {
    private static final Scanner scan = new Scanner(System.in);
    private static final ReadConsole readConsole = new ReadConsole();

    public static void main(String[] args) {
        try {
            run();
        } catch (InputMismatchException e) {
            System.out.println("Input is incorrect.");
        }


    }

    private static void run() {
        ConsoleMessages.printRequestCampaignBudget();
        double campaignBudget = readConsole.readCampaignBudget();
        ConsoleMessages.printRequestAgencyFeePercentage();
        double agencyFeePercentage = readConsole.readAgencyFeePercentage();
        ConsoleMessages.printRequestThirdPartyToolFeePercentage();
        double thirdPartyToolFeePercentage = readConsole.readThirdPartyToolFeePercentage();
        ConsoleMessages.printRequestFixedCostForAgencyHours();
        double fixedCostForAgencyHours = readConsole.readFixedCostForAgencyHours();
        ConsoleMessages.printRequestAnotherAdsBudget();
        double anotherAdsBudget = readConsole.readAnotherAdBudgets();
        Budget budget = new Budget(campaignBudget, agencyFeePercentage, thirdPartyToolFeePercentage, fixedCostForAgencyHours, anotherAdsBudget);

        Calculate calculate = new Calculate(budget);
        ConsoleMessages.printSpecificAdBudget(calculate.calculateMaximumBudgetForSpecificAd());
    }
}
