package com.dentsu.budgetwise;

/**
 * InputChecker class created for checking if input positive with the method checkIfInputPositive.
 * And with checkIfPercentageIsCorrect the function check if the input is a percentage format.
 * Example : 0.15 represents as %15
 */

public class InputChecker {
    public static boolean checkIfInputPositive(double digit) {
        return digit > 0;
    }

    public static boolean checkIfPercentageIsCorrect(double digit) {
        return digit < 1 && digit > 0;
    }
}
