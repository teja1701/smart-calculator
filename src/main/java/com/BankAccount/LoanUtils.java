package com.BankAccount;

public class LoanUtils {

    /*
     * Clean-code violations:
     * 1. Method name "calc" is not meaningful.
     * 2. Parameter names "a", "b", and "c" are unclear.
     * 3. Variable name "r" is unclear.
     * 4. Magic number 1200 is used directly.
     */

    /**
     * Calculates the loan amount using the given interest rate and years.
     * @param principal the initial loan amount
     * @param annualRate the annual interest rate
     * @param years the number of years
     * @return the calculated loan amount
     */
    public double calculateLoan(double principal, double annualRate, int years) {

        double amount = 1;

        for (int year = 0; year < years; year++) {
            amount = amount * (1 + annualRate / 1200);
        }

        return principal * amount;
    }
}