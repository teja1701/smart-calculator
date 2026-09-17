package com.savoira.assessment3;

public class Loancalculator {
    public void assessEligibility(double monthlyIncome) {
        boolean eligible = monthlyIncome > 25000;
        System.out.println("Income Check (" + monthlyIncome + "): Eligible = " + eligible);
    }

    public void assessEligibility(double monthlyIncome, double existingEMI) {
        boolean eligible = (monthlyIncome - existingEMI) > 20000;
        System.out.println("Income & EMI Check (" + monthlyIncome + ", " + existingEMI + "): Eligible = " + eligible);
    }

    public void assessEligibility(double monthlyIncome, double existingEMI, int creditScore) {
        boolean eligible = (monthlyIncome - existingEMI) > 20000 && creditScore > 650;
        System.out.println("Full Check (" + monthlyIncome + ", " + existingEMI + ", " + creditScore + "): Eligible = " + eligible);
    }

    public static void main(String[] args) {
        Loancalculator calc = new Loancalculator();
        calc.assessEligibility(30000);
        calc.assessEligibility(45000, 10000);
        calc.assessEligibility(45000, 10000, 700);
    }
}